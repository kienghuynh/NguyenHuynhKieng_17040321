package com.example.nguyenhuynhkieng_17040321;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public class CustomShirtAdapter extends BaseAdapter {

    public CustomShirtAdapter(Context ctx, int layoutItems, ArrayList<Shirt> arrayList) {
        this.ctx = ctx;
        this.layoutItems = layoutItems;
        this.arrayList = arrayList;
    }

    Context ctx;
    int layoutItems;
    ArrayList<Shirt> arrayList;

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(ctx).inflate(layoutItems,parent,false);

        // Anh xa
        TextView tvName = convertView.findViewById(R.id.tvName);
        TextView tvPrice = convertView.findViewById(R.id.tvPrice);
        ImageView imgShirt = convertView.findViewById(R.id.imageView);

        tvName.setText(arrayList.get(position).getName());
        tvPrice.setText(arrayList.get(position).getPrice());
        imgShirt.setImageResource(arrayList.get(position).getImageShirt());

        return convertView;


    }
}
