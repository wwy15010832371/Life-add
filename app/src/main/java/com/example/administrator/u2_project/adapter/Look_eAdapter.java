package com.example.administrator.u2_project.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.u2_project.R;
import com.example.administrator.u2_project.bean.Look_e;

import org.xutils.common.util.DensityUtil;
import org.xutils.image.ImageOptions;
import org.xutils.x;

import java.util.List;

/**
 * Created by Administrator on 2017/6/5.
 */

public class Look_eAdapter extends BaseAdapter{
    private List<Look_e.ListBean> elist;
    private Context context;

    public Look_eAdapter(List<Look_e.ListBean> elist, Context context) {
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
            holder.imageView = (ImageView) convertView.findViewById(R.id.imageView);
            holder.textView1 = (TextView) convertView.findViewById(R.id.textView1);
            holder.textView2 = (TextView) convertView.findViewById(R.id.textView2);
            holder.textView3 = (TextView) convertView.findViewById(R.id.textView3);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        Look_e.ListBean e = elist.get(position);
        int i = position+1;
        holder.textView1.setText(i+"."+e.getNameX());
        holder.textView2.setText(e.getArtistX());
        holder.textView3.setText("播放:"+e.getPlaycntX());

        ImageOptions options = new ImageOptions.Builder()
                .setSize(DensityUtil.dip2px(120), DensityUtil.dip2px(120))//图片大小
                .setRadius(DensityUtil.dip2px(10))//ImageView圆角半径
                //.setCrop(true)// 如果ImageView的大小不是定义为wrap_content, 不要crop.
                .setImageScaleType(ImageView.ScaleType.FIT_CENTER)
                .build();


        x.image().bind(holder.imageView,e.getPicX(),options);

        return convertView;
    }
    class ViewHolder{
        private ImageView imageView = null;
        private TextView textView1 = null;
        private TextView textView2 = null;
        private TextView textView3 = null;
    }
}
