package com.example.lifecyclelogger;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifecycleDemo", "onCreate called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifecycleDemo", "onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifecycleDemo", "onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifecycleDemo", "onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifecycleDemo", "onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifecycleDemo", "onDestroy called");
    }
}
