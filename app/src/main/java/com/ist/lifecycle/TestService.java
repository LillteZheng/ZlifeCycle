package com.ist.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

import com.ist.lifecyclerlib.ZLifeCycle;
import com.ist.lifecyclerlib.listener.LifecycleListener;

/**
 * Created by zhengshaorui
 * Time on 2019/2/12
 */

public class TestService extends Service {
    private static final String TAG = "TestService";
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        ZLifeCycle.with(this, new LifecycleListener() {
            @Override
            public void onPause() {

            }

            @Override
            public void onDestroy() {

            }

            @Override
            public void onFail(String errorMsg) {

            }
        });
    }
}
