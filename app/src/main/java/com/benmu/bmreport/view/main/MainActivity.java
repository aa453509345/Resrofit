package com.benmu.bmreport.view.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.benmu.bmreport.R;
import com.benmu.bmreport.adapter.MainGvAdapter;
import com.benmu.bmreport.model.HomePageData;
import com.benmu.bmreport.presenter.MainPresenter;
import com.benmu.bmreport.view.BaseActivity;
import com.benmu.bmreport.view.report.BindCardActivity;
import com.benmu.bmreport.view.report.CoreDataActivity;
import com.benmu.bmreport.view.report.GuahaoActivity;
import com.benmu.bmreport.view.report.RevisitActivity;
import com.benmu.bmreport.view.report.WXFocusActivity;
import com.benmu.bmreport.widget.MyGridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity implements MainMvpView {
    private MainPresenter presenter;
    private MyGridView gv;
    private MainGvAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = new MainPresenter();

        presenter.attachView(this);
        setContentView(R.layout.activity_main);
        setTitle(getResources().getString(R.string.app_name));
        hideLeftAction();

        initView();


    }

    private void initView() {

        gv = (MyGridView) findViewById(R.id.main_gv);
        List<String> list = new ArrayList();
        list.add(getString(R.string.bundnum));
        list.add(getString(R.string.WeiXinFoucus));
        list.add(getString(R.string.regiestnum));
        list.add(getString(R.string.revisitnum));
        list.add(getString(R.string.rechargenum));
        list.add(getString(R.string.forward));
        MainGvAdapter adapter = new MainGvAdapter(this, list);
        gv.setAdapter(adapter);

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=null;
                switch (position){

                    case 0:
                        intent=new Intent(getApplicationContext(), BindCardActivity.class);
                        startActivity(intent);

                        break;

                    case 1:
                        intent=new Intent(getApplicationContext(), WXFocusActivity.class);
                        startActivity(intent);

                        break;

                    case 2:
                        intent=new Intent(getApplicationContext(), GuahaoActivity.class);
                        startActivity(intent);
                        break;

                    case 3:
                        intent=new Intent(getApplicationContext(), RevisitActivity.class);
                        startActivity(intent);
                        break;




                }

            }
        });

    }


    public void showCoreData(View v){

        Intent intent=new Intent(this, CoreDataActivity.class);
        startActivity(intent);

    }


    @Override
    protected void onResume() {
        super.onResume();
        presenter.loadCoreData();
    }

    public void showCoreData(HomePageData data) {

    }


    @Override
    protected void onDestroy() {
        presenter.detachView();
        super.onDestroy();
    }
}
