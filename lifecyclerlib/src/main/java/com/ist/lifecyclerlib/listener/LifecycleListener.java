package com.ist.lifecyclerlib.listener;

import android.os.Bundle;

/**
 * Created by zhengshaorui
 * Time on 2019/1/5
 */

public interface LifecycleListener {
    default void onStart(){};
    default void onResume(){};
    default void onPause(){};
    default void onStop(){};
    default void onDestroy(){};
    default void onFail(String errorMsg){};
    default void onSaveInstanceState(Bundle outState){};
    default void onLowMemory(){};
}
