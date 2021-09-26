package com.ist.lifecyclerlib;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

import com.ist.lifecyclerlib.listener.LifecycleListener;
import com.ist.lifecyclerlib.listener.LifecycleListener;

/**
 * Created by zhengshaorui
 * Time on 2019/2/12
 */

public class ZLifeCycle {
    public static ZRequestManager with(FragmentActivity activity, LifecycleListener listener){
        return new ZRequestManager().get(activity,listener);
    }

    public static ZRequestManager  with(Activity activity,LifecycleListener listener){
        return new ZRequestManager().get(activity,listener);
    }

    public static ZRequestManager with(Fragment fragment,LifecycleListener listener){
        return new ZRequestManager().get(fragment.getActivity(),listener);
    }
    public static ZRequestManager  with(android.app.Fragment fragment,LifecycleListener listener){
        return new ZRequestManager().get(fragment.getActivity(),listener);
    }

    public static ZRequestManager  with(Context context,LifecycleListener listener){
        return new ZRequestManager().get(context,listener);
    }
}
