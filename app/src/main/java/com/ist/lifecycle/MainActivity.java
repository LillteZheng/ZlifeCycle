package com.ist.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.ist.lifecyclerlib.ZLifeCycle;
import com.ist.lifecyclerlib.listener.LifeListenerAdapter;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startService(new Intent(this,TestService.class));

        ZLifeCycle.with(this,new LifeListenerAdapter() {
            @Override
            public void onStart() {
                super.onStart();
                Log.d(TAG, "zsr --> onStart: ");
            }

            @Override
            public void onResume() {
                super.onResume();
                Log.d(TAG, "zsr --> onResume: ");
            }

            @Override
            public void onPause() {
                super.onPause();
                Log.d(TAG, "zsr --> onPause: ");
            }

            @Override
            public void onStop() {
                super.onStop();
                Log.d(TAG, "zsr --> onStop: ");
            }

            @Override
            public void onDestroy() {
                super.onDestroy();
                Log.d(TAG, "zsr --> onDestroy: ");
            }

            @Override
            public void onFail(String errorMsg) {
                super.onFail(errorMsg);
                Log.d(TAG, "zsr --> onFail: "+errorMsg);
            }
        });
    }
}
