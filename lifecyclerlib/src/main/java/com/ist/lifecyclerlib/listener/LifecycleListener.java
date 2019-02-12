package com.ist.lifecyclerlib.listener;

/**
 * Created by zhengshaorui
 * Time on 2019/1/5
 */

public interface LifecycleListener {
    void onStart();
    void onResume();
    void onPause();
    void onStop();
    void onDestroy();
    void onFail(String errorMsg);
}
