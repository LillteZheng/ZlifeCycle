package com.ist.lifecyclerlib.widget;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.ist.lifecyclerlib.listener.LifecycleListener;

/**
 * Created by zhengshaorui
 * Time on 2019/2/12
 */

public class SupportLifeFragment extends Fragment {
    private LifecycleListener listener;
    public void registerListener(LifecycleListener listener){
        this.listener = listener;
    }

    @Override
    public void onStart() {
        super.onStart();
        if (listener != null){
            listener.onStart();
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (listener != null) {
            listener.onSaveInstanceState(outState);
        }
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        if (listener != null) {
            listener.onLowMemory();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if (listener != null){
            listener.onResume();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if (listener != null){
            listener.onPause();
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        if (listener != null){
            listener.onStop();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (listener != null){
            listener.onDestroy();
        }
    }
}
