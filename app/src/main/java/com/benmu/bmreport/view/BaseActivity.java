package com.benmu.bmreport.view;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.benmu.bmreport.R;
import com.benmu.bmreport.widget.AnimLoadingDialog;
import com.benmu.bmreport.widget.MMAlertDialog;

/**
 * Created by Bruce Jing on 11/26/15.
 */
public class BaseActivity extends AppCompatActivity implements MVPBaseView {

    private AnimLoadingDialog dialog;
    private TextView tv_actionbar_title;
    private View action_bar_custom;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);

        if (isSupportActionbar()) {
            setUpActionBar(R.layout.actionbar_custom);
        }

    }

    protected boolean isSupportActionbar() {
        return true;
    }

    protected void setUpActionBar(int resId) {
        ActionBar bar = getSupportActionBar();
        //bar.setDisplayHomeAsUpEnabled(true);
//
        //custom actionbar
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            bar.setElevation(0);
        }
        bar.setDisplayShowHomeEnabled(false);
        bar.setHomeButtonEnabled(false);
        bar.setDisplayShowCustomEnabled(true);
        bar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        bar.setDisplayShowCustomEnabled(true);
        bar.setDisplayShowTitleEnabled(false);
        View v = getLayoutInflater().inflate(resId, null);
        bar.setCustomView(v, new ActionBar.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.MATCH_PARENT, Gravity.CENTER_HORIZONTAL | Gravity.CENTER_HORIZONTAL));
        Toolbar parent = (Toolbar) v.getParent();
        parent.setContentInsetsAbsolute(0, 0);


        tv_actionbar_title = (TextView) findViewById(R.id.tv_actionbar_title);
//        View action_left = findViewById(R.id.action_left);
//        View action_right = findViewById(R.id.action_right);
        action_bar_custom = findViewById(R.id.action_bar_custom);
//        action_bar_tvitem_webclose = findViewById(R.id.action_bar_tvitem_webclose);


    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public void showMessage(int stringId) {

        String msg = getResources().getString(stringId);

//        new MMAlertDialog.Builder(this)
//                .setMessage(msg)
//                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                dialog.dismiss();
//                            }
//                        }
//
//
//                ).create().show();


        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();


    }

    @Override
    public void showProgressIndicator() {
        if (dialog == null) {
            dialog = new AnimLoadingDialog(this)
                    .setWatchOutsideTouch(false);
            dialog.setCancelable(true);
            dialog.setCanceledOnTouchOutside(true);
        }

        dialog.show();
    }

    @Override
    public void hideProgressIndicator() {
        if (dialog != null && dialog.isShowing())
            dialog.dismiss();
        dialog = null;
    }


    /**
     * 这只标题
     *
     * @param title
     */
    @Override
    public void setTitle(CharSequence title) {
        if (tv_actionbar_title != null) {
            tv_actionbar_title.setText(title);
        }
    }

    /**
     * 这只标题
     *
     * @param titleId
     */
    @Override
    public void setTitle(int titleId) {
        if (tv_actionbar_title != null) {
            tv_actionbar_title.setText(titleId);
        }
    }

    public void setTitleTextColor(int color) {
        if (tv_actionbar_title != null) {
            tv_actionbar_title.setTextColor(color);
        }
    }

    /**
     * 设置actionbar的颜色
     *
     * @param color
     */
    protected void setActionBarBackground(String color) {
        if (action_bar_custom != null) {
            action_bar_custom.setBackgroundColor(Color.parseColor(color));
        }
    }

    /**
     * 设置actionbar的颜色
     *
     * @param resId
     */
    protected void setActionBarBackground(int resId) {
        if (action_bar_custom != null) {
            if (resId == 0) {
                resId = android.R.color.transparent;
            }
            action_bar_custom.setBackgroundResource(getResources().getColor(resId));
        }
    }

    /**
     * 设置左边按钮图片
     *
     * @param resId
     */
    protected void setLeftImage(int resId) {
        findViewById(R.id.action_bar_tvitem_left).setVisibility(View.GONE);
        ImageView action_bar_ivitem_left = (ImageView) findViewById(R.id.action_bar_ivitem_left);
        action_bar_ivitem_left.setVisibility(View.VISIBLE);
        action_bar_ivitem_left.setImageResource(resId);
    }

    /**
     * 隐藏左边按钮
     */
    protected void hideLeftAction() {
        findViewById(R.id.action_bar_tvitem_left).setVisibility(View.GONE);
        findViewById(R.id.action_bar_ivitem_left).setVisibility(View.GONE);
    }

    /**
     * Right
     * 隐藏右边按钮
     */
    protected void hideRightImageAction() {
        findViewById(R.id.action_bar_ivitem_right).setVisibility(View.GONE);
    }

    protected void showRightImageAction() {
        findViewById(R.id.action_bar_ivitem_right).setVisibility(View.VISIBLE);
    }

    /**
     * 设置右边按钮图片
     *
     * @param resId
     */
    protected void setRightImage(int resId) {
        ImageView action_bar_ivitem_right = (ImageView) findViewById(R.id.action_bar_ivitem_right);
        action_bar_ivitem_right.setVisibility(View.VISIBLE);
        action_bar_ivitem_right.setImageResource(resId);
    }

    /**
     * 获取右边图片控件
     *
     * @return
     */
    protected ImageView getImageRight() {
        return (ImageView) findViewById(R.id.action_bar_ivitem_right);
    }

    /**
     * 设置左边文本
     *
     * @param text
     */
    protected void setLeftText(String text) {
        TextView tv = (TextView) findViewById(R.id.action_bar_tvitem_left);
        tv.setText(text);
    }

    /**
     * 设置右边文本
     *
     * @param text
     */
    protected void setRightText(String text) {
        TextView tv = (TextView) findViewById(R.id.action_bar_tvitem_right);
        tv.setVisibility(View.VISIBLE);
        tv.setText(text);
    }


    /**
     * 左按钮点击
     *
     * @param v
     */
    public void on_left_click(View v) {
        onBackPressed();
    }

    /**
     * 右按钮点击
     *
     * @param v
     */
    public void on_right_click(View v) {
        Toast.makeText(this, "right click", Toast.LENGTH_SHORT).show();
    }


}
