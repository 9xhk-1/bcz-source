package com.baicizhan.client.business.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class CirPageIndicator extends View implements ViewPager.OnPageChangeListener {

    /* renamed from: k, reason: collision with root package name */
    public static final int f16944k = Color.parseColor("#99cccccc");

    /* renamed from: l, reason: collision with root package name */
    public static final int f16945l = Color.parseColor("#99ff2a00");

    /* renamed from: a, reason: collision with root package name */
    public int f16946a;

    /* renamed from: b, reason: collision with root package name */
    public int f16947b;

    /* renamed from: c, reason: collision with root package name */
    public int f16948c;

    /* renamed from: d, reason: collision with root package name */
    public int f16949d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f16950e;

    /* renamed from: f, reason: collision with root package name */
    public Paint f16951f;

    /* renamed from: g, reason: collision with root package name */
    public int f16952g;

    /* renamed from: h, reason: collision with root package name */
    public int f16953h;

    /* renamed from: i, reason: collision with root package name */
    public int f16954i;

    /* renamed from: j, reason: collision with root package name */
    public int f16955j;

    public CirPageIndicator(Context context) {
        this(context, null);
    }

    public static int b(Context context, float dipValue) {
        return (int) ((dipValue * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final void c(Canvas canvas) {
        int i11 = (this.f16947b - this.f16948c) / 2;
        int i12 = this.f16953h;
        int i13 = i11 + i12;
        int i14 = 0;
        while (i14 < this.f16946a) {
            canvas.drawCircle(i13, i12, this.f16953h, this.f16949d == i14 ? this.f16950e : this.f16951f);
            i13 += (this.f16953h * 2) + this.f16952g;
            i14++;
        }
    }

    public final int d(int measureSpec, int preferred) {
        int size = View.MeasureSpec.getSize(measureSpec);
        int mode = View.MeasureSpec.getMode(measureSpec);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? preferred : size : Math.min(preferred, size);
    }

    public final int e(int measureSpec) {
        return d(measureSpec, (this.f16953h * 2) + this.f16955j + this.f16954i);
    }

    public final int f(int measureSpec) {
        return d(measureSpec, this.f16948c);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int e11 = e(heightMeasureSpec);
        int f11 = f(widthMeasureSpec);
        this.f16947b = f11;
        setMeasuredDimension(f11, e11);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i11) {
        this.f16949d = i11;
        postInvalidate();
    }

    public void setViewPager(ViewPager view) {
        view.setOnPageChangeListener(this);
        int count = view.getAdapter().getCount();
        this.f16946a = count;
        this.f16948c = (this.f16952g * (count - 1)) + (this.f16953h * 2 * count);
        postInvalidate();
    }

    public CirPageIndicator(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f16946a = 0;
        this.f16947b = 0;
        this.f16948c = 0;
        this.f16949d = 0;
        this.f16952g = b(getContext(), 12.0f);
        this.f16953h = b(getContext(), 3.0f);
        this.f16954i = b(getContext(), 2.0f);
        this.f16955j = b(getContext(), 2.0f);
        Paint paint = new Paint();
        this.f16950e = paint;
        paint.setAntiAlias(true);
        this.f16950e.setColor(f16945l);
        this.f16950e.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(this.f16950e);
        this.f16951f = paint2;
        paint2.setColor(f16944k);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i11) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i11, float v11, int i22) {
    }
}
