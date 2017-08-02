package com.zhibeiwu.bikemanage.activity;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.zhibeiwu.bikemanage.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        ImageView iv = (ImageView) findViewById(R.id.iv_back);
        iv.setImageResource(R.mipmap.wode);

    }
}
