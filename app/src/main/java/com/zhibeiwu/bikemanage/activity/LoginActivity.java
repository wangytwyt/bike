package com.zhibeiwu.bikemanage.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhibeiwu.bikemanage.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
