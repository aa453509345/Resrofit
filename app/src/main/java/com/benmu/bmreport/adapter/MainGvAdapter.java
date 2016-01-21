package com.benmu.bmreport.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.benmu.bmreport.R;

import java.util.List;

/**
 * Created by Kevin on 2015/12/7.
 */
public class MainGvAdapter extends BaseAdapter {

int []pic={R.drawable.icon_01,R.drawable.icon_02,R.drawable.icon_03,R.drawable.icon_04,R.drawable.icon_05,R.drawable.icon_06};

    public MainGvAdapter(Context context, List mList) {
        super(context, mList);
        this.mList=mList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
View view=null;
        if(convertView==null){

            view=View.inflate(mContext,R.layout.main_gv_item,null);
        }else{

            view=convertView;
        }


        ImageView iv=(ImageView) view.findViewById(R.id.iv);
        iv.setBackgroundResource(pic[position]);

        TextView tv=(TextView) view.findViewById(R.id.tv);
        tv.setText((String)mList.get(position));

        return view;
    }
}
