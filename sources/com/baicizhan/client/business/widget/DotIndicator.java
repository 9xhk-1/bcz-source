package com.baicizhan.client.business.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class DotIndicator extends View {

    /* renamed from: a, reason: collision with root package name */
    public int f17084a;

    /* renamed from: b, reason: collision with root package name */
    public int f17085b;

    /* renamed from: c, reason: collision with root package name */
    public int f17086c;

    /* renamed from: d, reason: collision with root package name */
    public int f17087d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f17088e;

    /* renamed from: f, reason: collision with root package name */
    public int f17089f;

    /* renamed from: g, reason: collision with root package name */
    public int f17090g;

    public DotIndicator(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int measuredHeight = getMeasuredHeight() / 2;
        int paddingLeft = getPaddingLeft() + this.f17086c;
        int i11 = 0;
        while (i11 < this.f17089f) {
            this.f17088e.setColor(i11 == this.f17090g ? this.f17085b : this.f17084a);
            canvas.drawCircle(paddingLeft, measuredHeight, this.f17086c, this.f17088e);
            paddingLeft += this.f17087d;
            i11++;
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(View.resolveSize(getPaddingLeft() + getPaddingRight() + (this.f17086c << 1) + (this.f17087d * (this.f17089f - 1)), widthMeasureSpec), View.resolveSize(getPaddingTop() + getPaddingBottom() + (this.f17086c << 1), heightMeasureSpec));
    }

    public void setSelectedItem(int index) {
        if (this.f17090g != index) {
            this.f17090g = index;
            invalidate();
        }
    }

    public DotIndicator(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DotIndicator(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.DotIndicator);
        this.f17084a = obtainStyledAttributes.getColor(0, 0);
        this.f17085b = obtainStyledAttributes.getColor(1, 0);
        this.f17086c = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f17087d = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.f17089f = obtainStyledAttributes.getInt(2, 0);
        this.f17088e = new Paint(1);
        obtainStyledAttributes.recycle();
    }
}
