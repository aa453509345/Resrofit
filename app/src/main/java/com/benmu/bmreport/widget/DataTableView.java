package com.benmu.bmreport.widget;

import android.content.Context;
import android.util.AttributeSet;

import com.benmu.bmreport.R;

import de.codecrafters.tableview.TableView;
import de.codecrafters.tableview.toolkit.SimpleTableHeaderAdapter;

/**
 * Created by Bruce jing on 12/8/15.
 */
public class DataTableView extends TableView {

    private Context mContext;

    public DataTableView(Context context) {
        this(context, null);
    }

    public DataTableView(Context context, AttributeSet attributes) {
        this(context, attributes, 0);
    }

    public DataTableView(Context context, AttributeSet attributes, int styleAttributes) {
        super(context, attributes, styleAttributes);
        this.mContext = context;

    }

    public void setHeader(String... header) {

        SimpleTableHeaderAdapter simpleTableHeaderAdapter = new SimpleTableHeaderAdapter(mContext, header);
        simpleTableHeaderAdapter.setTextColor(mContext.getResources().getColor(R.color.table_header_text));
        simpleTableHeaderAdapter.setTextSize(13);
        setHeaderAdapter(simpleTableHeaderAdapter);

    }


}
