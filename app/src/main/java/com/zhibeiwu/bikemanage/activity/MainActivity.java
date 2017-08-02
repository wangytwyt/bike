package com.zhibeiwu.bikemanage.activity;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhibeiwu.bikemanage.R;

public class MainActivity extends AppCompatActivity {

    private Handler m = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            setContentView(R.layout.activity_main);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);

        m.sendMessageDelayed(new Message(),3000);
    }
}
