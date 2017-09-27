package com.example.administrator.mybanner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.huangbryant.hbanner.HBanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HBanner hBanner=new HBanner(this);
    }
}
