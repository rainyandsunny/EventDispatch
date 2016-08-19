package com.mysoft.yhp5210.eventdispatch.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by yhp5210 on 2016/8/19.
 */
public class ViewGroupB extends LinearLayout {

    private static final String TAG = "ViewGroupB";

    public ViewGroupB(Context context) {
        super(context);
    }

    public ViewGroupB(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public ViewGroupB(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        Log.i(TAG,"ViewGroupB onTouchEvent "+super.onTouchEvent(event));
        return super.onTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i(TAG,"ViewGroupB dispatchTouchEvent "+super.onTouchEvent(ev));
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.i(TAG,"ViewGroupB onInterceptTouchEvent "+super.onInterceptTouchEvent(ev));
        return super.onInterceptTouchEvent(ev);
    }
}
