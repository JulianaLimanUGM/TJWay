package com.example.meizar.test;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by meizar on 01/03/18.
 */

public class HalteListAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mInflater;
    private ArrayList<Halte> mDataSource;

    public HalteListAdapter(Context context, ArrayList<Halte> items) {
        mContext = context;
        mDataSource = items;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    //1
    @Override
    public int getCount() {
        return mDataSource.size();
    }

    //2
    @Override
    public Object getItem(int position) {
        return mDataSource.get(position);
    }

    //3
    @Override
    public long getItemId(int position) {
        return position;
    }

    //4
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get view for row item
        View rowView = mInflater.inflate(R.layout.single_list_row, parent, false);

        // Get title element
        TextView nameText = (TextView) rowView.findViewById(R.id.nameText);

        // Get subtitle element
        TextView infoText = (TextView) rowView.findViewById(R.id.infoText);

        Halte halte = (Halte) getItem(position);
        nameText.setText(halte.getName());
        infoText.setText("Jarak : " + halte.getJarak());
        return rowView;
    }
}
