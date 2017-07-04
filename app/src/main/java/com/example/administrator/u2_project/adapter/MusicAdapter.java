package com.example.administrator.u2_project.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.administrator.u2_project.R;
import com.example.administrator.u2_project.bean.Look_e;

import java.util.List;

/**
 * Created by Administrator on 2017/6/5.
 */

public class MusicAdapter extends BaseAdapter{
    private List<Look_e.ListBean> elist;
    private Context context;

    public MusicAdapter(List<Look_e.ListBean> elist, Context context) {
        this.elist = elist;
        this.context = context;
    }

    @Override
    public int getCount() {
        return elist.size();
    }

    @Override
    public Look_e.ListBean getItem(int position) {
        return elist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView==null){
            holder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.look_e_item,parent,false);
            holder.textView1 = (TextView) convertView.findViewById(R.id.textView1);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        Look_e.ListBean e = elist.get(position);
        //x.image().bind(holder.textView1,e.getDownurl());

        return convertView;
    }
    class ViewHolder{
        private TextView textView1 = null;
    }
}
