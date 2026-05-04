package com.baicizhan.main.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class FixedGridLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public int f20015a;

    /* renamed from: b, reason: collision with root package name */
    public int f20016b;

    /* renamed from: c, reason: collision with root package name */
    public int f20017c;

    /* renamed from: d, reason: collision with root package name */
    public int f20018d;

    /* renamed from: e, reason: collision with root package name */
    public int f20019e;

    /* renamed from: f, reason: collision with root package name */
    public int f20020f;

    /* renamed from: g, reason: collision with root package name */
    public int f20021g;

    /* renamed from: h, reason: collision with root package name */
    public int f20022h;

    /* renamed from: i, reason: collision with root package name */
    public int f20023i;

    /* renamed from: j, reason: collision with root package name */
    public int f20024j;

    public FixedGridLayout(Context context) {
        this(context, null);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        if (this.f20015a == 0 || this.f20016b == 0) {
            return;
        }
        int paddingLeft = getPaddingLeft() + (((right - left) - this.f20021g) / 2);
        int paddingTop = getPaddingTop() + (((bottom - top) - this.f20022h) / 2);
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            int i12 = this.f20016b;
            int i13 = this.f20018d;
            int i14 = ((i11 / i12) * (this.f20024j + i13)) + paddingTop;
            int i15 = this.f20017c;
            int i16 = ((i11 % i12) * (this.f20023i + i15)) + paddingLeft;
            View childAt = getChildAt(i11);
            childAt.layout(i16, i14, i15 + i16, i13 + i14);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i11;
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        if (this.f20015a == 0 || this.f20016b == 0) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i12 = this.f20016b;
        int i13 = (paddingLeft - ((i12 - 1) * this.f20024j)) / i12;
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int i14 = this.f20015a;
        int i15 = this.f20023i;
        int i16 = (paddingTop - ((i14 - 1) * i15)) / i14;
        int i17 = this.f20019e;
        if (i17 <= 0 || (i11 = this.f20020f) <= 0) {
            this.f20017c = i13;
            this.f20018d = i16;
        } else {
            int i18 = i13 * i11;
            int i19 = i16 * i17;
            if (i18 > i19) {
                this.f20018d = i16;
                this.f20017c = i19 / i11;
            } else {
                this.f20017c = i13;
                this.f20018d = i18 / i17;
            }
        }
        int i21 = this.f20016b;
        this.f20021g = ((i21 - 1) * i15) + (i21 * this.f20017c) + getPaddingLeft() + getPaddingRight();
        int i22 = this.f20015a;
        this.f20022h = ((i22 - 1) * this.f20024j) + (i22 * this.f20018d) + getPaddingTop() + getPaddingBottom();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f20017c, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.f20018d, 1073741824);
        for (int i23 = 0; i23 < getChildCount(); i23++) {
            getChildAt(i23).measure(makeMeasureSpec, makeMeasureSpec2);
        }
        setMeasuredDimension(this.f20021g, this.f20022h);
    }

    public FixedGridLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public FixedGridLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f20015a = 2;
        this.f20016b = 2;
        this.f20017c = 0;
        this.f20018d = 0;
        this.f20019e = 4;
        this.f20020f = 3;
        this.f20021g = 0;
        this.f20022h = 0;
        this.f20023i = 10;
        this.f20024j = 10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.FixedGridLayout, defStyleAttr, 0);
        this.f20015a = obtainStyledAttributes.getInt(4, 0);
        this.f20016b = obtainStyledAttributes.getInt(3, 0);
        this.f20019e = obtainStyledAttributes.getInt(1, 0);
        this.f20020f = obtainStyledAttributes.getInt(0, 0);
        this.f20023i = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f20024j = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        obtainStyledAttributes.recycle();
    }
}
