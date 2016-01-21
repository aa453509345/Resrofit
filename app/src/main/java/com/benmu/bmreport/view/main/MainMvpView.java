package com.benmu.bmreport.view.main;

import com.benmu.bmreport.model.HomePageData;
import com.benmu.bmreport.view.MVPBaseView;

/**
 * Created by Bruce Jing on 11/26/15.
 */
public interface MainMvpView extends MVPBaseView {

    void showCoreData(HomePageData data);

}
