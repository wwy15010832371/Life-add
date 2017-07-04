package com.example.administrator.u2_project.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.administrator.u2_project.R;
import com.example.administrator.u2_project.adapter.Look_eAdapter;
import com.example.administrator.u2_project.bean.Look_e;
import com.example.administrator.u2_project.db.Look_eHttp;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class LookFragment_g extends Fragment {
    private ListView gListView;
    private String path = "http://bb.shoujiduoduo.com/baby/bb.php?type=getvideos&pagesize=30&collectid=27";
    private List<Look_e> gList = new ArrayList<>();

    public LookFragment_g() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_look_fragment_g, container, false);
        gListView = (ListView) view.findViewById(R.id.gListView);
        Look_eHttp.getLook_eHttp(path, new Look_eHttp.IHttpGetData() {
            @Override
            public void onSuccess(byte[] data) {
                String s = new String(data);
                Gson gson = new Gson();
                Look_e e = gson.fromJson(s, Look_e.class);
                List<Look_e.ListBean> list = e.getList();
                list.remove(0);
                Look_eAdapter adapter = new Look_eAdapter(list,getContext());
                gListView.setAdapter(adapter);
            }

            @Override
            public void onError(String error) {

            }
        });
        return view;
    }

}
