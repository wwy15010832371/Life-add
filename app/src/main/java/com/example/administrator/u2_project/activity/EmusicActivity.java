package com.example.administrator.u2_project.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.administrator.u2_project.R;

public class EmusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emusic);
        Intent intent = getIntent();
        String position = intent.getStringExtra("position");
        Toast.makeText(this, "==="+position, Toast.LENGTH_SHORT).show();
    }


}
