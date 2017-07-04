package com.example.administrator.u2_project.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import com.example.administrator.u2_project.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LookFragment extends Fragment {
    private LookFragment_d lookFragment_d;
    private LookFragment_g lookFragment_g;
    private LookFragment_e lookFragment_e;
    private RadioGroup lRadio;

    public LookFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_look, container, false);
        lookFragment_e = new LookFragment_e();
        FragmentManager managere = getChildFragmentManager();
        FragmentTransaction ef = managere.beginTransaction();
        ef.add(R.id.lLinear,lookFragment_e);
        ef.commit();
        lRadio = (RadioGroup) view.findViewById(R.id.lRadio);
        lRadio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.lrd_button1:
                        lookFragment_e = new LookFragment_e();
                        FragmentManager managere = getChildFragmentManager();
                        FragmentTransaction ef = managere.beginTransaction();
                        ef.replace(R.id.lLinear,lookFragment_e);
                        ef.commit();
                        break;
                    case R.id.lrd_button2:
                        lookFragment_g = new LookFragment_g();
                        FragmentManager managerg = getChildFragmentManager();
                        FragmentTransaction gf = managerg.beginTransaction();
                        gf.replace(R.id.lLinear,lookFragment_g);
                        gf.commit();
                        break;
                    case R.id.lrd_button3:
                        lookFragment_d = new LookFragment_d();
                        FragmentManager managerd = getChildFragmentManager();
                        FragmentTransaction df = managerd.beginTransaction();
                        df.replace(R.id.lLinear,lookFragment_d);
                        df.commit();
                        break;
                }
            }
        });
        return view;
    }

}
