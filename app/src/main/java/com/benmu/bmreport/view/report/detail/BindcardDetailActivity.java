package com.benmu.bmreport.view.report.detail;

import android.os.Bundle;
import com.benmu.bmreport.R;
//import com.benmu.bmreport.model.BaseModel;
import com.benmu.bmreport.view.BaseActivity;

/**
 * 详细帮卡数据
 */
public class BindcardDetailActivity extends BaseActivity implements MvpDetailView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bindcard_detail);
    }


//    @Override
//    public void showDetailData(BaseModel data) {
//
//    }
}
