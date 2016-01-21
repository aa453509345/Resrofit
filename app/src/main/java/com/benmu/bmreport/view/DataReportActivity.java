package com.benmu.bmreport.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;

import com.benmu.bmreport.R;
import com.benmu.bmreport.model.BaseModel;
import com.benmu.bmreport.view.report.MvpReportView;
import com.benmu.bmreport.widget.BottomTips;
import com.benmu.bmreport.widget.DataTableView;

import info.hoang8f.android.segmented.SegmentedGroup;

/**
 * Created by Bruce jing on 12/8/15.
 */
public abstract class DataReportActivity extends BaseActivity implements MvpReportView {
    protected DataTableView tableView;
    //    protected Presenter presenter;
    protected SegmentedGroup segmented;
    protected RadioButton button1;//实时数据
    protected RadioButton button2;//详细数据
    protected BottomTips bt;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datareport);

        initData();


        tableView = (DataTableView) findViewById(R.id.tableView);
        segmented = (SegmentedGroup) findViewById(R.id.segmented);
        bt=(BottomTips)findViewById(R.id.bt);
        button1 = (RadioButton) findViewById(R.id.button1);

        button1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                loadCurrentData();

            }
        });

        button2 = (RadioButton) findViewById(R.id.button2);

        button2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked)
                loadDetailData();

            }
        });


        setupView();


    }


    @Override
    protected void onResume() {
        super.onResume();

        button1.setChecked(true);
    }

    /**
     * 加载详细数据
     */
    protected abstract void loadDetailData();

    /**
     * 加载实时数据
     */

    protected abstract void loadCurrentData();

    protected void showSegmented() {

        segmented.setVisibility(View.VISIBLE);
        button1.setChecked(true);
    }

    protected void hideSegmented() {

        segmented.setVisibility(View.GONE);
    }


    protected abstract void initData();

    public abstract void setupView();


    @Override
    public abstract void showCurrentData(BaseModel datas);

    @Override
    public abstract void showDetailData(BaseModel datas);


    public abstract void detachView();


    @Override
    protected void onDestroy() {
        detachView();
        super.onDestroy();
    }
}
