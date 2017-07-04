package com.example.administrator.u2_project.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.administrator.u2_project.R;
import com.example.administrator.u2_project.activity.EmusicActivity;
import com.example.administrator.u2_project.adapter.Look_eAdapter;
import com.example.administrator.u2_project.bean.Look_e;
import com.example.administrator.u2_project.db.Look_eHttp;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class LookFragment_e extends Fragment {
    private ListView eListView;
    private String path = "http://bb.shoujiduoduo.com/baby/bb.php?type=getvideos&pagesize=30&collectid=29";
    private List<Look_e.ListBean> eList = new ArrayList<>();
    private List<Look_e.ListBean> list;

    public LookFragment_e() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_look_fragment_e, container, false);
        eListView = (ListView) view.findViewById(R.id.eListView);
        Look_eHttp.getLook_eHttp(path,   new Look_eHttp.IHttpGetData() {
            @Override
            public void onSuccess(byte[] data) {
                final String s = new String(data);
                final Gson gson = new Gson();
                final Look_e e = gson.fromJson(s, Look_e.class);
                list = e.getList();
                list.remove(0);
                Look_eAdapter adapter = new Look_eAdapter(list,getContext());
                eListView.setAdapter(adapter);

            }

            @Override
            public void onError(String error) {

            }
        });

        eListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getContext(), EmusicActivity.class);
                intent.putExtra("position",position);
                startActivity(intent);
            }
        });
        return view;
    }

}
