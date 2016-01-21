package com.benmu.bmreport.view.report;

import com.benmu.bmreport.R;
import com.benmu.bmreport.model.BaseModel;
import com.benmu.bmreport.presenter.BindCardPresenter;
import com.benmu.bmreport.presenter.WXCoreDataPresenter;
import com.benmu.bmreport.view.BaseActivity;
import com.benmu.bmreport.view.DataReportActivity;
import com.benmu.bmreport.widget.ContentPair;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kevin on 2015/12/8.
 */
public class CoreDataActivity extends DataReportActivity  {

    WXCoreDataPresenter presenter;

    @Override
    protected void loadDetailData() {
        showDetailDataBottomTips();
        presenter.loadFifteenDayData();

    }

    @Override
    protected void loadCurrentData() {
        showCurrentDataBottomTips();
        presenter.loadRealTimeData();

    }

    @Override
    protected void initData() {
        presenter = new WXCoreDataPresenter();
        presenter.attachView(this);

    }

    @Override
    public void setupView() {
        setTitle("微信核心数据");
    }

    @Override
    public void showCurrentData(BaseModel datas) {

        tableView.setHeader("时段", "挂号数", "挂号人数", "绑卡数");
        tableView.setColumnCount(4);
        tableView.setHeaderElevation(10);
        tableView.setColumnWeight(0, 2);
        tableView.setColumnWeight(1, 2);
        tableView.setColumnWeight(2, 4);
        tableView.setColumnWeight(3, 2);



    }

    public void showCurrentDataBottomTips(){
        bt.clearViews();
        ArrayList<ContentPair> list=new ArrayList();
        ContentPair p1=new ContentPair();
        p1.des="挂号数";
        p1.res= R.drawable.n_01;

        ContentPair p2=new ContentPair();
        p2.des="挂号人数";
        p2.res= R.drawable.n_02;

        ContentPair p3=new ContentPair();
        p3.des="绑卡数";
        p3.res= R.drawable.n_03;

        list.add(p1);
        list.add(p2);
        list.add(p3);
        bt.addContent(list);

    }


    public void showDetailDataBottomTips(){
        bt.clearViews();

        ArrayList<ContentPair> list=new ArrayList();
        ContentPair p1=new ContentPair();
        p1.des="挂号数据";
        p1.res= R.drawable.n_01;

        ContentPair p2=new ContentPair();
        p2.des="绑卡数据";
        p2.res= R.drawable.n_02;
        list.add(p1);
        list.add(p2);

        bt.addContent(list);



    }



    @Override
    public void showDetailData(BaseModel datas) {

        tableView.setHeader("日期", "挂号数", "挂号人数", "绑卡数", "关注数");
        tableView.setColumnCount(5);
        tableView.setHeaderElevation(10);
        tableView.setColumnWeight(0, 2);
        tableView.setColumnWeight(1, 2);
        tableView.setColumnWeight(2, 2);
        tableView.setColumnWeight(3, 2);
        tableView.setColumnWeight(4, 2);

    }

    @Override
    public void detachView() {
        if (presenter != null) {

            presenter.detachView();

            presenter = null;
        }
    }
}
