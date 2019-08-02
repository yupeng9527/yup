package com.bawei.yuekao_yupeng20190731.view.fragment;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class MyLiuView extends ViewGroup {
    private int setsize;

    public MyLiuView(Context context) {
        super(context);
    }

    public MyLiuView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyLiuView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        measureChildren(widthMeasureSpec,heightMeasureSpec);
        setsize = MeasureSpec.getSize(widthMeasureSpec);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        int left = 20;
        int top = 20;
        int history = 20;
        for (int i = 0; i < getChildCount(); i++) {
            View meau = getChildAt(i);
            int widthm = meau.getMeasuredWidth();
            int heightm = meau.getMeasuredHeight();
            if (left+widthm>=setsize){
                top+=heightm;
                left=20;
            }
            meau.layout(left,top,left+widthm,top+heightm);
            left+=widthm+history;
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
