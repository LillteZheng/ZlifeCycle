package com.ist.lifecyclerlib.widget;


import android.app.Fragment;

import com.ist.lifecyclerlib.listener.LifeListenerAdapter;

/**
 * Created by zhengshaorui
 * Time on 2019/2/12
 */

public class LifeFragment extends Fragment {

    private LifeListenerAdapter mLifeListerAdapter;
    public void registerListener(LifeListenerAdapter lifeLiseterAdapter){
        mLifeListerAdapter = lifeLiseterAdapter;
    }

    @Override
    public void onStart() {
        super.onStart();
        if (mLifeListerAdapter != null){
            mLifeListerAdapter.onStart();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if (mLifeListerAdapter != null){
            mLifeListerAdapter.onResume();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if (mLifeListerAdapter != null){
            mLifeListerAdapter.onPause();
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        if (mLifeListerAdapter != null){
            mLifeListerAdapter.onStop();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mLifeListerAdapter != null){
            mLifeListerAdapter.onDestroy();
        }
    }
}
