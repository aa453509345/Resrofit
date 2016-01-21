package com.benmu.bmreport.net;


import com.benmu.bmreport.BuildConfig;
import com.benmu.bmreport.model.BindAndRegisterData;
import com.benmu.bmreport.model.CardTypeDataCount;
import com.benmu.bmreport.model.FifteenReturnVisitData;
import com.benmu.bmreport.model.HomePageData;
import com.benmu.bmreport.model.RealTimeBackNoData;
import com.benmu.bmreport.model.RealTimeBindAndRegisterData;
import com.benmu.bmreport.model.RealTimeBindCard;
import com.benmu.bmreport.model.RealTimeCancleNoData;
import com.benmu.bmreport.model.RealTimeLockNoData;
import com.benmu.bmreport.model.RealTimePayNoData;
import com.benmu.bmreport.model.RealTimeRegister;
import com.benmu.bmreport.model.RealTimeRegisterDatilData;
import com.benmu.bmreport.model.RealTimeRegisterOfPeople;
import com.benmu.bmreport.model.RegisterDatilNoData;
import com.benmu.bmreport.model.RegisterTypeDataCount;
import com.benmu.bmreport.model.ReturnVisitClickNoData;
import com.benmu.bmreport.model.ReturnVisitData;
import com.benmu.bmreport.model.ReturnVisitLockNoData;
import com.benmu.bmreport.model.ReturnVisitPayNoData;
import com.benmu.bmreport.model.WXAttentionData;
import com.benmu.bmreport.model.WXCoreData;
import com.benmu.bmreport.model.WXRealtimeData;
import com.benmu.bmreport.util.FileManager;
import com.squareup.okhttp.Authenticator;
import com.squareup.okhttp.Cache;
import com.squareup.okhttp.Credentials;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;
import retrofit.http.GET;
import rx.Observable;
import timber.log.Timber;

/**
 * Created by Bruce Jing on 11/26/15.
 */
public interface ApiService {

        String BASE_URL = "http://hos.test.lryy.ishopcity.cn/bjmc/";
//    String BASE_URL = "http://192.168.5.195:8888/bjmc/";


    //首页数据
    @GET("getHomepageData")
    Observable<HomePageData> loadHomepageData();


    //详细挂号数据接口

    @GET("getRegisterTypeDataCount")
    Observable<RegisterTypeDataCount> getRegisterTypeDataCount();


    //微信关注数据

    @GET("getDataAttentionNo")
    Observable<WXAttentionData> getDataAttentionNo();


    //微信核心数据 展示15天数据
    @GET("getFifteenDayData")
    Observable<WXCoreData> getFifteenDayData();


    //微信核心数据-24小时数据数据接口
    @GET("getRealTimeData")
    Observable<WXRealtimeData> getRealTimeData();


    //整体数据-实时挂号数接口 实时挂号数据接口，昨天，今天，上周
    @GET("getRealTimeRegister")
    Observable<RealTimeRegister> getRealTimeRegister();


    //	整体--详细绑卡数据接口

    @GET("getCardTypeDataCount")
    Observable<CardTypeDataCount> getCardTypeDataCount();

    //1.1.8	微信挂号数据-实时挂号数接口


    @GET("getRealTimeRegisterDatilData")
    Observable<RealTimeRegisterDatilData> getRealTimeRegisterDatilData();

    //1.1.9	微信挂号数据-展示15天详细数据接口

    @GET("getRegisterDatilNoData")
    Observable<RegisterDatilNoData> getRegisterDatilNoData();

    //1.1.10	微信绑卡数据--24小时数据数据接口

    @GET("getRealTimeBindAndRegisterData")
    Observable<RealTimeBindAndRegisterData> getRealTimeBindAndRegisterData();

    //1.1.11	微信绑卡数据--详细数据接口

    @GET("getBindAndRegisterData")
    Observable<BindAndRegisterData> getBindAndRegisterData();

    //1.1.12	微信复诊数据--24小时数据数据接口

    @GET("getReturnVisitData")
    Observable<ReturnVisitData> getReturnVisitData();

    //1.1.13	微信复诊数据--详细数据接口

    @GET("getFifteenReturnVisitData")
    Observable<FifteenReturnVisitData> getFifteenReturnVisitData();

    //1.1.14	整体数据-实时挂号人数接口

    @GET("getRealTimeRegisterOfPeople")
    Observable<RealTimeRegisterOfPeople> getRealTimeRegisterOfPeople();

    //1.1.15	整体数据-实时绑卡数接口
    @GET("getRealTimeBindCard")
    Observable<RealTimeBindCard> getRealTimeBindCard();

    //1.1.16	微信挂号数据-实时锁号数接口
    @GET("getRealTimeLockNoData")
    Observable<RealTimeLockNoData> getRealTimeLockNoData();


    //1.1.17	微信挂号数据-实时挂号数接口
    @GET("getRealTimePayNoData")
    Observable<RealTimePayNoData> getRealTimePayNoData();

    //1.1.18	微信挂号数据-实时取消挂号数接口

    @GET("getRealTimeCancleNoData")
    Observable<RealTimeCancleNoData> getRealTimeCancleNoData();

    //1.1.19	微信挂号数据-实时退号数接口

    @GET("getRealTimeBackNoData")
    Observable<RealTimeBackNoData> getRealTimeBackNoData();

    //1.1.20	微信复诊数据-实时复诊页面打开数接口

    @GET("getReturnVisitClickNoData")
    Observable<ReturnVisitClickNoData> getReturnVisitClickNoData();

    //1.1.21	微信复诊数据-实时复诊锁号数接口

    @GET("getReturnVisitLockNoData")
    Observable<ReturnVisitLockNoData> getReturnVisitLockNoData();

    //1.1.22	微信复诊数据-实时复诊挂号数接口

    @GET("getReturnVisitPayNoData")
    Observable<ReturnVisitPayNoData> getReturnVisitPayNoData();


    class Factory {

        public static ApiService create() {
            //10M
            int cacheSize = 1024 * 1024 * 10;

            Cache cache = new Cache(FileManager.getDataFilePath(), cacheSize);

            OkHttpClient okHttpClient = new OkHttpClient();

            okHttpClient.setCache(cache);

            okHttpClient.setRetryOnConnectionFailure(true);

            okHttpClient.setConnectTimeout(30, TimeUnit.SECONDS);

            if (BuildConfig.DEBUG) {

                loggingInterceptor(okHttpClient);
            }


            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build();

            return retrofit.create(ApiService.class);

        }


        private static void authenticator(OkHttpClient client) {

            client.setAuthenticator(new Authenticator() {
                @Override
                public Request authenticate(Proxy proxy, Response response) throws IOException {


                    String credential = Credentials.basic("username", "password");
                    return response.request().newBuilder()
                            .header("Authorization", credential)
                            .build();
                }

                @Override
                public Request authenticateProxy(Proxy proxy, Response response) throws IOException {
                    return null;
                }
            });

        }


        private static void loggingInterceptor(OkHttpClient client) {

            client.networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    long t1 = System.nanoTime();
                    Request request = chain.request();

                    Timber.e("http", String.format("Sending request %s on %s%n%s",
                            request.url(), chain.connection(), request.headers()));
                    Response response = chain.proceed(request);
                    long t2 = System.nanoTime();
                    Timber.e("http", String.format("Received response for %s in %.1fms%n%s",
                            request.url(), (t2 - t1) / 1e6d, response.headers()));
                    return response;
                }
            });


        }

    }
}
