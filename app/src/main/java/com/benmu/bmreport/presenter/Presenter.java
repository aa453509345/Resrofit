package com.benmu.bmreport.presenter;

/**
 * Created by Bruce Jing on 11/26/15.
 */
public interface Presenter<V> {

    void attachView(V view);

    void detachView();

}
