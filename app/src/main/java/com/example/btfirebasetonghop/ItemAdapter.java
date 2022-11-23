package com.example.btfirebasetonghop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ItemAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Item> itemList;

    public ItemAdapter(Context context, int layout, List<Item> itemList) {
        this.context = context;
        this.layout = layout;
        this.itemList = itemList;
    }
    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null)
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            holder = new ViewHolder();
            //ánh xạ view
            holder.tenKhoaHoc = view.findViewById(R.id.itemtenkh);
            holder.tenThuongGoi = view.findViewById(R.id.tenthuong);
            holder.maula = view.findViewById(R.id.maula);
            view.setTag(holder);
        }
        else {
            holder=(ViewHolder) view.getTag();
        }
        Item item = itemList.get(i);
        holder.tenKhoaHoc.setText(item.getTenkhoahoc());
        holder.tenThuongGoi.setText(item.getTenthuong());
        holder.maula.setText(item.getMaula());
        return view;
    }

    private class ViewHolder{
        TextView tenKhoaHoc,tenThuongGoi,maula;
    }
}
