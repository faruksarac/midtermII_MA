package com.faruksarac.midtermii_ma;

import java.util.ArrayList;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;



// List Adapter for NearBy ListView

public class NearbyListAdapter extends ArrayAdapter<FoursquareModel> {




    ArrayList<FoursquareModel> mNearByList ;
    public NearbyListAdapter(Context context, int textViewResourceId,
                             ArrayList<FoursquareModel> objects) {
        super(context, textViewResourceId, objects);
        this.mNearByList = objects;
        // TODO Auto-generated constructor stub
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View single_row = inflater.inflate(R.layout.row_layout, null,true);
        TextView tv_name = (TextView) single_row.findViewById(R.id.tv_name);
        TextView tv_address = (TextView) single_row.findViewById(R.id.tv_address);

        tv_name.setText(mNearByList.get(position).getName());
        tv_address.setText(mNearByList.get(position).getAddress());
        return single_row;
    }
}