package com.ist.lifecycle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.ist.lifecyclerlib.ZLifeCycle;
import com.ist.lifecyclerlib.listener.LifecycleListener;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ZLifeCycle.with(this, new LifecycleListener() {
            @Override
            public void onResume() {
                Log.d(TAG, "onResume() called");
            }

            @Override
            public void onPause() {
                Log.d(TAG, "onPause() called");
            }

            @Override
            public void onDestroy() {
                Log.d(TAG, "onDestroy() called");
            }

            @Override
            public void onFail(String errorMsg) {
                Log.d(TAG, "onFail() called with: errorMsg = [" + errorMsg + "]");
            }
        });


    }
}
