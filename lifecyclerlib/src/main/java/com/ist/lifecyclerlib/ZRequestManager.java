package com.ist.lifecyclerlib;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;

import com.ist.lifecyclerlib.listener.LifecycleListener;
import com.ist.lifecyclerlib.widget.LifeFragment;
import com.ist.lifecyclerlib.widget.SupportLifeFragment;

/**
 * Created by zhengshaorui
 * Time on 2019/2/12
 */

public class ZRequestManager {
    private LifecycleListener mListener;
    private static final String LIFECYCLE_TAG = "LIFECYCLE_TAG";
    public ZRequestManager(){

    }

    public ZRequestManager get(Context context, LifecycleListener listener){
        mListener = listener;
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }else if (context instanceof FragmentActivity){
                return get((FragmentActivity) context);
        }else if (context instanceof Activity){
            return get((Activity) context);
        }
        if (mListener != null){
            mListener.onFail("Cannot get lifecycler with Context: "+context);
        }


        return this;
    }

    private ZRequestManager get(FragmentActivity activity){
        assertNotDestroyed(activity);
        return fragmentGet(activity);
    }

    private ZRequestManager get(Activity activity){
        assertNotDestroyed(activity);
        return fragmentGet(activity);
    }


    /**
     * 用一个透明的fragment来代替
     * @param context
     * @return
     */
    private ZRequestManager fragmentGet(Context context) {
        if (context instanceof FragmentActivity){
            FragmentActivity activity = (FragmentActivity) context;
            SupportLifeFragment fragment = (SupportLifeFragment) activity.getSupportFragmentManager().findFragmentByTag(LIFECYCLE_TAG);
            if (fragment == null){
                fragment = new SupportLifeFragment();
                fragment.registerListener(mListener);

            }
            if (!fragment.isAdded()){
                activity.getSupportFragmentManager().beginTransaction().add(fragment,LIFECYCLE_TAG).commit();
            }

            return this;

        }else if (context instanceof Activity){
                Activity activity = (Activity) context;
                LifeFragment fragment = (LifeFragment) activity.getFragmentManager().findFragmentByTag(LIFECYCLE_TAG);
                if (fragment == null){
                    fragment = new LifeFragment();
                    fragment.registerListener(mListener);
                    activity.getFragmentManager().beginTransaction().add(fragment,LIFECYCLE_TAG).commit();
                }else{
                    fragment.registerListener(mListener);
                }
        }

        return this;



    }

    /**
     * 判断activity是否已经加载
     * @param activity
     */
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    private  void assertNotDestroyed(@NonNull Activity activity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private boolean isOnMainThread(){
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
