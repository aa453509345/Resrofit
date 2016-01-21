package com.benmu.bmreport.presenter;

import android.util.Log;

import com.benmu.bmreport.R;
import com.benmu.bmreport.ReportApplication;
import com.benmu.bmreport.model.CardTypeDataCount;
import com.benmu.bmreport.model.RealTimeBindAndRegisterData;
import com.benmu.bmreport.net.ApiService;
import com.benmu.bmreport.net.NetUtil;
import com.benmu.bmreport.view.report.MvpReportView;

import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;

/**
 * Created by Bruce jing on 12/8/15.
 */
public class BindCardPresenter implements Presenter<MvpReportView> {
    private MvpReportView mvpReportView;
    private Subscription subscription;
    private Subscription subscription1;

    private RealTimeBindAndRegisterData realTimeBindAndRegisterData;
    private CardTypeDataCount cardTypeDataCount;

    @Override
    public void attachView(MvpReportView view) {

        this.mvpReportView = view;

    }

    /**
     * 获取实时帮卡数据
     */
    public void loadRealTimeBindAndRegisterData() {
        mvpReportView.showProgressIndicator();
        if (subscription != null) subscription.unsubscribe();
        ReportApplication application = ReportApplication.get(mvpReportView.getContext());
        ApiService apiService = application.getApiService();
        subscription = apiService.getRealTimeBindAndRegisterData()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(application.defaultSubscribeScheduler())
                .subscribe(new Subscriber<RealTimeBindAndRegisterData>() {
                    @Override
                    public void onCompleted() {

                        mvpReportView.hideProgressIndicator();


                        if (realTimeBindAndRegisterData != null) {
                            mvpReportView.showCurrentData(realTimeBindAndRegisterData);
                        } else {

                            mvpReportView.showMessage(R.string.empty_data);
                        }




                    }

                    @Override
                    public void onError(Throwable error) {
                        mvpReportView.hideProgressIndicator();
                        Log.e("aaa", "Error loading GitHub repos ", error);
                        if (NetUtil.isHttp404(error)) {
                            mvpReportView.showMessage(R.string.error_404);
                        } else {
                            mvpReportView.showMessage(R.string.error_loading);
                        }
                    }

                    @Override
                    public void onNext(RealTimeBindAndRegisterData data) {
                        BindCardPresenter.this.realTimeBindAndRegisterData = data;
                    }
                });


    }

    /**
     * 获取详细帮卡数据
     */
    public void loadCardTypeDataCountData() {
        mvpReportView.showProgressIndicator();
        if (subscription1 != null) subscription1.unsubscribe();
        ReportApplication application = ReportApplication.get(mvpReportView.getContext());
        ApiService apiService = application.getApiService();
        subscription1 = apiService.getCardTypeDataCount()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(application.defaultSubscribeScheduler())
                .subscribe(new Subscriber<CardTypeDataCount>() {
                    @Override
                    public void onCompleted() {

                        mvpReportView.hideProgressIndicator();


                        if (cardTypeDataCount != null) {

                            Log.e("aaa",cardTypeDataCount.toString());
                            mvpReportView.showDetailData(cardTypeDataCount);

                        } else {

                            mvpReportView.showMessage(R.string.empty_data);
                        }



                    }

                    @Override
                    public void onError(Throwable error) {
                        mvpReportView.hideProgressIndicator();
                        Log.e("aaa", "Error loading GitHub repos ", error);
                        if (NetUtil.isHttp404(error)) {
                            mvpReportView.showMessage(R.string.error_404);
                        } else {
                            mvpReportView.showMessage(R.string.error_loading);
                        }
                    }

                    @Override
                    public void onNext(CardTypeDataCount data) {
                        BindCardPresenter.this.cardTypeDataCount = data;

                    }
                });


    }

    @Override
    public void detachView() {
        this.mvpReportView = null;
        if (subscription != null) subscription.unsubscribe();
        if (subscription1 != null) subscription1.unsubscribe();
    }


}
