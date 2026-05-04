package com.baicizhan.client.business.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class SquareViewPager extends ViewPager {
    public SquareViewPager(Context context) {
        super(context);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(View.getDefaultSize(0, widthMeasureSpec), View.getDefaultSize(0, heightMeasureSpec));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public SquareViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}
