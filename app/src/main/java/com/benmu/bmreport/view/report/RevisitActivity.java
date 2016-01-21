package com.benmu.bmreport.view.report;

import android.os.Bundle;
import android.view.View;

import com.benmu.bmreport.R;
import com.benmu.bmreport.model.BaseModel;
import com.benmu.bmreport.view.BaseActivity;
import com.benmu.bmreport.view.DataReportActivity;
import com.benmu.bmreport.widget.ContentPair;

import java.util.ArrayList;
import java.util.List;

/**
 * 复诊数据
 */
public class RevisitActivity extends DataReportActivity implements MvpReportView {


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

        setTitle("复诊数据");
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
        bt.clearViews();
        bt.setVisibility(View.VISIBLE);
        ArrayList<ContentPair> list=new ArrayList();
        ContentPair p1=new ContentPair();
        p1.des="复诊页面打开数";
        p1.res= R.drawable.n_08;

        ContentPair p2=new ContentPair();
        p2.des="复诊锁号数";
        p2.res= R.drawable.n_05;

        ContentPair p3=new ContentPair();
        p3.des="复诊挂号数";
        p3.res= R.drawable.n_01;


        list.add(p1);
        list.add(p2);
        list.add(p3);
        bt.addContent(list);

    }



    public void showDetailDataBottomTips(){
        bt.setVisibility(View.INVISIBLE);

    }



}
