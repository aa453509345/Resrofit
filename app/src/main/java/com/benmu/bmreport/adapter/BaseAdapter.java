package com.benmu.bmreport.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Kevin on 2015/12/7.
 */
    public abstract class BaseAdapter<T> extends android.widget.BaseAdapter {
        protected List<T> mList;
        protected Context mContext;

        protected LayoutInflater inflater;

        public BaseAdapter(Context context, List<T> mList) {
            this.mContext = context;
            this.mList = mList;
            inflater = LayoutInflater.from(context);
        }

        @Override
        public int getCount() {
            return mList.size();
        }

        @Override
        public Object getItem(int position) {
            return mList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return null;
        }


        }



