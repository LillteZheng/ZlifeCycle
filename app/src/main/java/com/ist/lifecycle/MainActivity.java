package com.ist.lifecycle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ist.lifecyclerlib.ZLifeCycle;
import com.ist.lifecyclerlib.listener.LifeListenerAdapter;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ZLifeCycle.with(this, new LifeListenerAdapter() {
            @Override
            public void onPause() {
                super.onPause();
            }

            @Override
            public void onDestroy() {
                super.onDestroy();
            }

            @Override
            public void onFail(String errorMsg) {
                super.onFail(errorMsg);
            }
        });


    }
}
