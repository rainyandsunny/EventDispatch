package com.mysoft.yhp5210.eventdispatch.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by yhp5210 on 2016/8/19.
 */
public class ViewC extends View {

    private static final String TAG = "ViewC";

    public ViewC(Context context) {
        super(context);
    }

    public ViewC(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewC(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i(TAG,"ViewC onTouchEvent "+super.onTouchEvent(event));
        return super.onTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {

        Log.i(TAG,"ViewC dispatchTouchEvent "+super.onTouchEvent(event));
        return super.dispatchTouchEvent(event);
    }

}
