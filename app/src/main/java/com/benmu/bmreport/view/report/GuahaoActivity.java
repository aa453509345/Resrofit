package com.benmu.bmreport.view.report;

import android.os.Bundle;
import android.view.View;

import com.benmu.bmreport.R;
//import com.benmu.bmreport.model.BaseModel;
import com.benmu.bmreport.model.BaseModel;
import com.benmu.bmreport.view.BaseActivity;
import com.benmu.bmreport.view.DataReportActivity;
import com.benmu.bmreport.widget.ContentPair;

import java.util.ArrayList;
import java.util.List;

/**
 * 挂号数据
 */
public class GuahaoActivity extends DataReportActivity implements MvpReportView {


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
        setTitle("微信挂号数据");

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
        p1.des="锁号数";
        p1.res= R.drawable.n_05;

        ContentPair p2=new ContentPair();
        p2.des="挂号数";
        p2.res= R.drawable.n_01;

        ContentPair p3=new ContentPair();
        p3.des="取消挂号数";
        p3.res= R.drawable.n_06;

        ContentPair p4=new ContentPair();
        p4.des="退号";
        p4.res= R.drawable.n_07;

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        bt.addContent(list);

    }



    public void showDetailDataBottomTips(){
        bt.setVisibility(View.INVISIBLE);

    }
}
