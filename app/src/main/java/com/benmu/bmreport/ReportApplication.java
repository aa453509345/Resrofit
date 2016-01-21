package com.benmu.bmreport;

import android.app.Application;
import android.content.Context;

import com.benmu.bmreport.net.ApiService;

import rx.Scheduler;
import rx.schedulers.Schedulers;


public class ReportApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    private ApiService apiService;
    private Scheduler defaultSubscribeScheduler;

    public static ReportApplication get(Context context) {
        return (ReportApplication) context.getApplicationContext();
    }

    public ApiService getApiService() {
        if (apiService == null) {
            apiService = ApiService.Factory.create();
        }
        return apiService;
    }

    public void setApiService(ApiService apiService) {
        this.apiService = apiService;
    }

    public Scheduler defaultSubscribeScheduler() {

        if (defaultSubscribeScheduler == null) {
            defaultSubscribeScheduler = Schedulers.io();
        }
        return defaultSubscribeScheduler;
    }

    public void setDefaultSubscribeScheduler(Scheduler scheduler) {
        this.defaultSubscribeScheduler = scheduler;
    }
}
