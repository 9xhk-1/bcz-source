package com.baicizhan.client.business.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class MaxHeightScrollView extends ScrollView {

    /* renamed from: a, reason: collision with root package name */
    public int f17133a;

    public MaxHeightScrollView(Context context) {
        super(context);
        this.f17133a = -1;
    }

    public final void a(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.MaxHeightScrollView);
            this.f17133a = obtainStyledAttributes.getDimensionPixelSize(0, this.f17133a);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i11 = this.f17133a;
        if (i11 >= 0) {
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public void setMaxHeight(int maxHeight) {
        this.f17133a = maxHeight;
    }

    public MaxHeightScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f17133a = -1;
        if (isInEditMode()) {
            return;
        }
        a(context, attrs);
    }

    public MaxHeightScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f17133a = -1;
        if (isInEditMode()) {
            return;
        }
        a(context, attrs);
    }
}
