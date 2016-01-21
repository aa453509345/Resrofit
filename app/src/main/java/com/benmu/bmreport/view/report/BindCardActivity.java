package com.benmu.bmreport.view.report;


import android.view.View;

import com.benmu.bmreport.R;
import com.benmu.bmreport.adapter.Detail_BandCard_DataAdapter;
import com.benmu.bmreport.adapter.Realtime_BindCard_DataAdapter;
import com.benmu.bmreport.model.BaseModel;
import com.benmu.bmreport.model.CardTypeDataCount;
import com.benmu.bmreport.model.RealTimeBindAndRegisterData;
import com.benmu.bmreport.presenter.BindCardPresenter;
import com.benmu.bmreport.view.DataReportActivity;
import com.benmu.bmreport.widget.ContentPair;

import java.util.ArrayList;
import java.util.List;

/**
 * 绑卡数据
 */
public class BindCardActivity extends DataReportActivity {

    BindCardPresenter presenter;

    @Override
    protected void initData() {

        presenter = new BindCardPresenter();
        presenter.attachView(this);



    }

    @Override
    public void setupView() {
        setTitle("绑卡数据");
    }


    @Override
    protected void loadDetailData() {
        showDetailDataBottomTips();
        presenter.loadCardTypeDataCountData();

    }

    @Override
    protected void loadCurrentData() {
        showCurrentDataBottomTips();
        presenter.loadRealTimeBindAndRegisterData();

    }

    @Override
    public void showCurrentData(BaseModel datas) {


            tableView.setHeader("时段", "绑卡数", "注册用户数", "解绑数");
            tableView.setColumnCount(4);

            tableView.setHeaderElevation(8);
            tableView.setColumnWeight(0, 2);
            tableView.setColumnWeight(1, 2);
            tableView.setColumnWeight(2, 2);
            tableView.setColumnWeight(3, 2);


            RealTimeBindAndRegisterData response = (RealTimeBindAndRegisterData) datas;

            if (response != null) {
                tableView.setVisibility(View.VISIBLE);
                List<String> times = response.getResult().getTime();
                List<Integer> bindNo = response.getResult().getBindNo();
                List<Integer> registerNo = response.getResult().getRegisterNo();
                List<Integer> unbindNo = response.getResult().getUnbindNo();

                Realtime_BindCard_DataAdapter adapter = new Realtime_BindCard_DataAdapter(this, times, bindNo, registerNo, unbindNo);

                tableView.setDataAdapter(adapter);
            } else {
                tableView.setVisibility(View.GONE);
            }





    }

    @Override
    public void showDetailData(BaseModel datas) {


            tableView.setHeader("日期", "绑卡数", "注册数", "注册未绑卡数", "解绑数");
            tableView.setColumnCount(5);
            tableView.setHeaderElevation(11);
            tableView.setColumnWeight(0, 2);
            tableView.setColumnWeight(1, 2);
            tableView.setColumnWeight(2, 2);
            tableView.setColumnWeight(3, 3);
            tableView.setColumnWeight(4, 2);

            CardTypeDataCount response = (CardTypeDataCount) datas;

            List data = response.getResult().getCardDatas();
            if (data != null && data.size() > 0) {
                Detail_BandCard_DataAdapter adapter = new Detail_BandCard_DataAdapter(this, response.getResult().getCardDatas());
                tableView.setVisibility(View.VISIBLE);
                tableView.setDataAdapter(adapter);

            } else {

                tableView.setVisibility(View.GONE);

            }


    }

    @Override
    public void detachView() {

        if (presenter != null) {

            presenter.detachView();

            presenter = null;
        }
    }

    public void showCurrentDataBottomTips(){

        bt.setVisibility(View.INVISIBLE);
    }



    public void showDetailDataBottomTips(){
        bt.setVisibility(View.INVISIBLE);

    }

}
