package com.benmu.bmreport.adapter;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.benmu.bmreport.model.CardTypeDataCount;

import java.util.List;

import de.codecrafters.tableview.TableDataAdapter;

/**
 * Created by Bruce jing on 12/8/15.
 */
public class Detail_BandCard_DataAdapter extends TableDataAdapter<CardTypeDataCount.ResultEntity.CardDatasEntity> {

    List<CardTypeDataCount.ResultEntity.CardDatasEntity> datas;

    public Detail_BandCard_DataAdapter(Context context, List cellData) {
        super(context, cellData);
        this.datas = cellData;
    }

    @Override
    public View getCellView(int rowIndex, int columnIndex, ViewGroup parentView) {

        CardTypeDataCount.ResultEntity.CardDatasEntity cellData = datas.get(rowIndex);


        View renderedView = null;

        switch (columnIndex) {
            case 0:
                renderedView = render(cellData.getDateTime(), parentView);
                break;
            case 1:
                renderedView = render(String.valueOf(cellData.getSheBaoCardNo()), parentView);
                break;
            case 2:
                renderedView = render(String.valueOf(cellData.getSheBaoCardNo()), parentView);
                break;
            case 3:
                renderedView = render(String.valueOf(cellData.getSheBaoCardNo()), parentView);
                break;
            case 4:
                renderedView = render(String.valueOf(cellData.getSheBaoCardNo()), parentView);
                break;


        }


        return renderedView;


    }


    private View render(String data, ViewGroup parentView) {

        TextView textView = new TextView(getContext());
        textView.setText(data);
        textView.setTextSize(12);
        textView.setGravity(Gravity.CENTER);
        textView.setPadding(5,20,0,20);


        return textView;
    }
}
