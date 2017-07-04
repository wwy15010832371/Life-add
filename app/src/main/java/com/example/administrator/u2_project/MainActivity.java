package com.example.administrator.u2_project;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;

import com.example.administrator.u2_project.fragment.LookFragment;
import com.example.administrator.u2_project.fragment.MeFragment;
import com.example.administrator.u2_project.fragment.MusicFragment;

public class MainActivity extends AppCompatActivity {
    private RadioGroup mRadioGroup;
    private LookFragment lookFragment;
    private MusicFragment musicFragment;
    private MeFragment meFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lookFragment = new LookFragment();
        FragmentManager lfragmentManager = getSupportFragmentManager();
        FragmentTransaction lft = lfragmentManager.beginTransaction();
        lft.add(R.id.mLinear,lookFragment);
        lft.commit();
        initView();
    }

    private void initView() {
        mRadioGroup = (RadioGroup) findViewById(R.id.mRadioGroup);
        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.RadioButton1:
                        lookFragment = new LookFragment();
                        FragmentManager lfragmentManager = getSupportFragmentManager();
                        FragmentTransaction lft = lfragmentManager.beginTransaction();
                        lft.replace(R.id.mLinear,lookFragment);
                        lft.commit();
                        break;
                    case R.id.RadioButton2:
                        musicFragment = new MusicFragment();
                        FragmentManager mfragmentManager = getSupportFragmentManager();
                        FragmentTransaction mft = mfragmentManager.beginTransaction();
                        mft.replace(R.id.mLinear,musicFragment);
                        mft.commit();

                        break;
                    case R.id.RadioButton3:
                        meFragment = new MeFragment();
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        FragmentTransaction ft = fragmentManager.beginTransaction();
                        ft.replace(R.id.mLinear,meFragment);
                        ft.commit();
                        break;
                }
            }
        });
    }
}
