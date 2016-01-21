package com.benmu.bmreport.view.report;

import android.os.Bundle;
import android.view.View;

import com.benmu.bmreport.R;
import com.benmu.bmreport.model.BaseModel;
import com.benmu.bmreport.view.BaseActivity;
import com.benmu.bmreport.view.DataReportActivity;

import java.util.List;

/**
 * 微信关注数据
 */
public class WXFocusActivity extends DataReportActivity implements MvpReportView {


    @Override
    protected void loadDetailData() {

        showDetailDataBottomTips();
    }

    @Override
    protected void loadCurrentData() {
     showCurrentDataBottomTips();
    }

    @Override
    protected void initData() {

    }

    @Override
    public void setupView() {

    }

    @Override
    public void showCurrentData(BaseModel datas) {

    }

    @Override
    public void showDetailData(BaseModel datas) {

    }

    @Override
    public void detachView() {

    }


    public void showCurrentDataBottomTips(){

        bt.setVisibility(View.INVISIBLE);
    }



    public void showDetailDataBottomTips(){
        bt.setVisibility(View.INVISIBLE);

    }
}
