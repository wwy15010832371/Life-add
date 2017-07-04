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
public class MusicFragment extends Fragment {
    private RadioGroup muRadio;
    private MusicFragment_e musicFragment_e;
    private MusicFragment_g musicFragment_g;

    public MusicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_music, container, false);
        musicFragment_e = new MusicFragment_e();
        FragmentManager managere = getChildFragmentManager();
        FragmentTransaction ef = managere.beginTransaction();
        ef.replace(R.id.muLinear,musicFragment_e);
        ef.commit();
        muRadio = (RadioGroup) view.findViewById(R.id.muRadio);
        muRadio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.murd_button1:
                        musicFragment_e = new MusicFragment_e();
                        FragmentManager managere = getChildFragmentManager();
                        FragmentTransaction ef = managere.beginTransaction();
                        ef.replace(R.id.muLinear,musicFragment_e);
                        ef.commit();
                        break;
                    case R.id.murd_button2:
                        musicFragment_g = new MusicFragment_g();
                        FragmentManager managerg = getChildFragmentManager();
                        FragmentTransaction gf = managerg.beginTransaction();
                        gf.replace(R.id.muLinear,musicFragment_g);
                        gf.commit();
                        break;
                }
            }
        });
        return view;
    }

}
