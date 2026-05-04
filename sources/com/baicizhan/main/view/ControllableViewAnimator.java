package com.baicizhan.main.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ViewAnimator;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class ControllableViewAnimator extends ViewAnimator {

    /* renamed from: a, reason: collision with root package name */
    public int f25119a;

    public ControllableViewAnimator(Context context) {
        this(context, null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i11 = this.f25119a;
        if (i11 > 0) {
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public ControllableViewAnimator(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.ControllableViewAnimator);
        this.f25119a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
