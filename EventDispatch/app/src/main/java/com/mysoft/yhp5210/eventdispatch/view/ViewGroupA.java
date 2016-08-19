package com.mysoft.yhp5210.eventdispatch.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by yhp5210 on 2016/8/19.
 */
public class ViewGroupA extends LinearLayout {


    private static final String TAG = "ViewGroupA";

    public ViewGroupA(Context context) {
        super(context);
    }

    public ViewGroupA(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public ViewGroupA(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        Log.i(TAG,"ViewGroupA onTouchEvent "+super.onTouchEvent(event));
        return super.onTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i(TAG,"ViewGroupA dispatchTouchEvent "+super.onTouchEvent(ev));
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.i(TAG,"ViewGroupA onInterceptTouchEvent "+super.onInterceptTouchEvent(ev));
        return super.onInterceptTouchEvent(ev);
    }
}
