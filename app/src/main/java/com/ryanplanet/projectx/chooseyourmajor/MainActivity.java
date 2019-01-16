package com.ryanplanet.projectx.chooseyourmajor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String Tag1 = "LifeCycle";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(Tag1,"on Create");

        Button loginBtn = (Button) findViewById(R.id.loginBtn);
        final Intent i = new Intent(this,LoginActivity.class);
        loginBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });

        /**
         *  creating a welcome message
         */
        Toast.makeText(getBaseContext(), "Welcome!",
                Toast.LENGTH_LONG).show();

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

    }

    @Override
    protected void onRestart() {
        super.onRestart();

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