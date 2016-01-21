package com.benmu.bmreport.presenter;

import android.util.Log;

import com.benmu.bmreport.R;
import com.benmu.bmreport.ReportApplication;
import com.benmu.bmreport.model.CardTypeDataCount;
import com.benmu.bmreport.model.RealTimeBindAndRegisterData;
import com.benmu.bmreport.model.WXCoreData;
import com.benmu.bmreport.model.WXRealtimeData;
import com.benmu.bmreport.net.ApiService;
import com.benmu.bmreport.net.NetUtil;
import com.benmu.bmreport.view.report.MvpReportView;

import retrofit.http.GET;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;

/**
 * Created by Bruce jing on 12/8/15.
 */
public class WXCoreDataPresenter implements Presenter<MvpReportView> {


//    //微信核心数据 展示15天数据
//    @GET("getFifteenDayData")
//    Observable<WXCoreData> getFifteenDayData();
//
//
//    //微信核心数据-24小时数据数据接口
//    @GET("getRealTimeData")
//    Observable<WXRealtimeData> getRealTimeData();


    private MvpReportView mvpReportView;
    private Subscription subscription;
    private Subscription subscription1;

    private WXRealtimeData wxRealtimeData;
    private WXCoreData wxCoreData;

    @Override
    public void attachView(MvpReportView view) {

        this.mvpReportView = view;

    }

    /**
     * 获取实时帮卡数据
     */
    public void loadRealTimeData() {
        mvpReportView.showProgressIndicator();
        if (subscription != null) subscription.unsubscribe();
        ReportApplication application = ReportApplication.get(mvpReportView.getContext());
        ApiService apiService = application.getApiService();
        subscription = apiService.getRealTimeData()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(application.defaultSubscribeScheduler())
                .subscribe(new Subscriber<WXRealtimeData>() {
                    @Override
                    public void onCompleted() {

                        mvpReportView.hideProgressIndicator();


                        if (wxRealtimeData != null) {
                            mvpReportView.showCurrentData(wxRealtimeData);
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
                    public void onNext(WXRealtimeData data) {
                        WXCoreDataPresenter.this.wxRealtimeData = data;
                    }
                });


    }

    /**
     * 获取详细帮卡数据
     */
    public void loadFifteenDayData() {
        mvpReportView.showProgressIndicator();
        if (subscription1 != null) subscription1.unsubscribe();
        ReportApplication application = ReportApplication.get(mvpReportView.getContext());
        ApiService apiService = application.getApiService();
        subscription1 = apiService.getFifteenDayData()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(application.defaultSubscribeScheduler())
                .subscribe(new Subscriber<WXCoreData>() {
                    @Override
                    public void onCompleted() {

                        mvpReportView.hideProgressIndicator();


                        if (wxCoreData != null) {

                            Log.e("aaa",wxCoreData.toString());
                            mvpReportView.showDetailData(wxCoreData);

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
                    public void onNext(WXCoreData data) {
                        WXCoreDataPresenter.this.wxCoreData = data;

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
