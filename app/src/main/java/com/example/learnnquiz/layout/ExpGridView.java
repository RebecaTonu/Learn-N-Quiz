package com.example.learnnquiz.Layout;




import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.GridView;


public class ExpGridView extends GridView {

    private boolean expanded = false;

    public ExpGridView(Context context) {
        super(context);
    }

    public ExpGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ExpGridView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public boolean isExpanded() {
        return expanded;
    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (isExpanded()) {
            int expandSpec = MeasureSpec.makeMeasureSpec(MEASURED_SIZE_MASK,
                    MeasureSpec.AT_MOST);
            super.onMeasure(widthMeasureSpec, expandSpec);

            ViewGroup.LayoutParams params = getLayoutParams();
            params.height = getMeasuredHeight();
        }
        else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }
}