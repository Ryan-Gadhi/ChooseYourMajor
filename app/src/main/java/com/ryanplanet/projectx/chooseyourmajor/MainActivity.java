package com.ryanplanet.projectx.chooseyourmajor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

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

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(Tag1,"on Pause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(Tag1,"on Stop");
        Toast.makeText(getBaseContext(), "We will wait for you!",
                Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(Tag1,"on Restart");

        Toast.makeText(getBaseContext(), "Welcome Back!",
                Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(Tag1,"on Destroy");


//   Does not work
//        Toast.makeText(getBaseContext(), "Bye Bye!",
//                Toast.LENGTH_LONG).show();


    }
}