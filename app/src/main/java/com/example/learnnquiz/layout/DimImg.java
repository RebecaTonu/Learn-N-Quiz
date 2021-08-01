
package com.example.learnnquiz.Layout;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

public class DimImg extends AppCompatImageView {

    public DimImg(Context context) {
        super(context);
    }

    public DimImg(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DimImg(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int width = MeasureSpec.getSize(widthMeasureSpec);
        int height = width * getDrawable().getIntrinsicHeight() / getDrawable().getIntrinsicWidth();

        setMeasuredDimension(width, height);
    }
}