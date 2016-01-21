package com.benmu.bmreport.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.benmu.bmreport.R;

import java.util.ArrayList;

/**
 * Created by Kevin on 2015/12/8.
 */
public class BottomTips extends LinearLayout {
    LayoutInflater inflater;
    Context context;
    private LinearLayout ll;
    private ImageView iv;
    public BottomTips(Context context) {
        super(context);
        this.context=context;
        init();
    }

    public BottomTips(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context=context;
        init();
    }


    private void init(){

        inflater=LayoutInflater.from(context);
        inflater.inflate(R.layout.bottom_tips,this,true);
        iv=(ImageView) findViewById(R.id.nav);
        ll=(LinearLayout) findViewById(R.id.ll);
    }

    public void setNav(int res){


        iv.setBackgroundResource(res);

    }



    public void addContent(final ArrayList<ContentPair> list){

        for(int i=0;i<list.size();i++){

            final TextView text=new TextView(context);
            text.setTag(i);
            text.setText(list.get(i).des);
            text.setTextSize(12);
            Drawable drawable=context.getResources().getDrawable(list.get(i).res);
            drawable.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
            text.setCompoundDrawables(null,drawable,null,null);
            LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(0,-2,1.0f);
            params.gravity= Gravity.CENTER;
            params.topMargin= (int) context.getResources().getDimension(R.dimen.bottom_tips);
            params.bottomMargin=(int) context.getResources().getDimension(R.dimen.bottom_tips);
            text.setLayoutParams(params);
            text.setGravity(Gravity.CENTER);
            text.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listenner!=null){

                        listenner.onTipsClick((int)text.getTag());
                    }

                }
            });
            ll.addView(text);

        }

    }


    public void setOnTipsClickListenner(OnTipsClickListenner listenner){

        this.listenner=listenner;

    }


    OnTipsClickListenner listenner;

    interface  OnTipsClickListenner{

        void onTipsClick(int position);

    }



    public void clearViews(){

        ll.removeAllViews();

    }

}
