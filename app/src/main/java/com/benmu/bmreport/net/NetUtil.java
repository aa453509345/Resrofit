package com.benmu.bmreport.net;

import retrofit.HttpException;

/**
 * Created by Bruce jing on 12/8/15.
 */
public class NetUtil {

    public static boolean isHttp404(Throwable error) {
        return error instanceof HttpException && ((HttpException) error).code() == 404;
    }
}
