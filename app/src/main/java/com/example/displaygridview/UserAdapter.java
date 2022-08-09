package com.example.displaygridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class UserAdapter extends BaseAdapter {

    Context context;
    List<UserPojo> userPojoList = new ArrayList<>();
    LayoutInflater layoutInflater;

    public UserAdapter(Context context, List<UserPojo> userPojoList) {
        this.context = context;
        this.userPojoList = userPojoList;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return userPojoList.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View root = layoutInflater.inflate(R.layout.custom_grid, null);
        ImageView eimage = root.findViewById(R.id.displayImg);
        TextView eid = root.findViewById(R.id.displayId);
        TextView ename = root.findViewById(R.id.displayName);
        TextView edesignation = root.findViewById(R.id.displayDesignation);

        eimage.setImageResource(userPojoList.get(i).getEmpImage());
        eid.setText(userPojoList.get(i).getEmpid());
        ename.setText(userPojoList.get(i).getEmpname());
        edesignation.setText(userPojoList.get(i).getEmpDesignation());
        return root;
    }
}
