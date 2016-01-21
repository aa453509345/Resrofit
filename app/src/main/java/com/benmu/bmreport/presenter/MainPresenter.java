package com.benmu.bmreport.presenter;

import android.util.Log;

import com.benmu.bmreport.R;
import com.benmu.bmreport.ReportApplication;
import com.benmu.bmreport.model.HomePageData;
import com.benmu.bmreport.net.ApiService;
import com.benmu.bmreport.net.NetUtil;
import com.benmu.bmreport.view.main.MainMvpView;

import rx.android.schedulers.AndroidSchedulers;
import rx.Subscriber;
import rx.Subscription;

/**
 * Created by Bruce Jing on 11/26/15.
 */
public class MainPresenter implements Presenter<MainMvpView> {

    private MainMvpView mainMvpView;
    private Subscription subscription;

    private HomePageData coreData;

    @Override
    public void attachView(MainMvpView view) {

        this.mainMvpView = view;

    }


    public void loadCoreData() {
        mainMvpView.showProgressIndicator();
        if (subscription != null) subscription.unsubscribe();
        ReportApplication application = ReportApplication.get(mainMvpView.getContext());
        ApiService apiService = application.getApiService();
        subscription = apiService.loadHomepageData()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(application.defaultSubscribeScheduler())
                .subscribe(new Subscriber<HomePageData>() {
                    @Override
                    public void onCompleted() {

                        mainMvpView.hideProgressIndicator();


                        if (coreData != null) {
                            mainMvpView.showCoreData(coreData);
                        } else {

                            mainMvpView.showMessage(R.string.empty_data);
                        }

                    }

                    @Override
                    public void onError(Throwable error) {
                        mainMvpView.hideProgressIndicator();
                        Log.e("aaa", "Error loading GitHub repos ", error);
                        if (NetUtil.isHttp404(error)) {
                            mainMvpView.showMessage(R.string.error_404);
                        } else {
                            mainMvpView.showMessage(R.string.error_loading);
                        }
                    }

                    @Override
                    public void onNext(HomePageData data) {
                        MainPresenter.this.coreData = data;
                    }
                });


    }

    @Override
    public void detachView() {
        this.mainMvpView = null;
        if (subscription != null) subscription.unsubscribe();
    }


}
