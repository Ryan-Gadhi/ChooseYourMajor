package com.ryanplanet.projectx.chooseyourmajor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    String Tag1 = "LifeCycle";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(Tag1,"on Create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(Tag1,"on Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(Tag1,"on Resume");

    }
}