package com.ist.lifecyclerlib;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

import com.ist.lifecyclerlib.listener.LifeListenerAdapter;

/**
 * Created by zhengshaorui
 * Time on 2019/2/12
 */

public class ZLifeCycle {
    public static ZRequestManager with(FragmentActivity activity, LifeListenerAdapter lifeListenerAdapter){
        return new ZRequestManager().get(activity,lifeListenerAdapter);
    }

    public static ZRequestManager  with(Activity activity,LifeListenerAdapter lifeListenerAdapter){
        return new ZRequestManager().get(activity,lifeListenerAdapter);
    }

    public static ZRequestManager with(Fragment fragment,LifeListenerAdapter lifeListenerAdapter){
        return new ZRequestManager().get(fragment.getActivity(),lifeListenerAdapter);
    }
    public static ZRequestManager  with(android.app.Fragment fragment,LifeListenerAdapter lifeListenerAdapter){
        return new ZRequestManager().get(fragment.getActivity(),lifeListenerAdapter);
    }

    public static ZRequestManager  with(Context context,LifeListenerAdapter lifeListenerAdapter){
        return new ZRequestManager().get(context,lifeListenerAdapter);
    }
}
