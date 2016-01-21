package com.benmu.bmreport.view.report;

import com.benmu.bmreport.model.BaseModel;
import com.benmu.bmreport.view.MVPBaseView;

import java.util.List;

/**
 * Created by Bruce Jing on 11/26/15.
 */
public interface MvpReportView extends MVPBaseView {



//    void loadCurrentData();
//
//
//    void loadDetailData();



    /**
     * 展示实时数据
     *
     * @param datas
     */
    void showCurrentData(BaseModel datas);


    /**
     * 展示详细数据
     *
     * @param datas
     */
    void showDetailData(BaseModel datas);





}
