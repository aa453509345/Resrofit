package com.benmu.bmreport.view;

import android.content.Context;


/**
 * Created by Bruce Jing on 11/26/15.
 */
public interface MVPBaseView {

    Context getContext();

    void showMessage(int stringId);

    void showProgressIndicator();


    void hideProgressIndicator();

}
