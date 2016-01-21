package com.benmu.bmreport.adapter;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import de.codecrafters.tableview.TableDataAdapter;

/**
 * Created by Bruce jing on 12/8/15.
 */
public class Realtime_BindCard_DataAdapter extends TableDataAdapter {

    List[] datas;

    public Realtime_BindCard_DataAdapter(Context context, List... cellData) {
        super(context, cellData[0]);
        this.datas = cellData;
    }

    @Override
    public View getCellView(int rowIndex, int columnIndex, ViewGroup parentView) {

        List cellData = datas[columnIndex];

        Object data = cellData.get(rowIndex);

        String value = "";

        if (data instanceof Integer) {

            value = String.valueOf(data);

        } else {
            value = (String) data;
        }

        return render(value, parentView);


    }


    private View render(String data, ViewGroup parentView) {

        TextView textView = new TextView(getContext());
        textView.setText(data);
        textView.setGravity(Gravity.CENTER);
        textView.setPadding(0, 20, 0, 20);
        return textView;
    }
}
