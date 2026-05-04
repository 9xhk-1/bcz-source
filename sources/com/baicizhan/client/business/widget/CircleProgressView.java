package com.baicizhan.client.business.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class CircleProgressView extends View {

    /* renamed from: a, reason: collision with root package name */
    public Paint f16985a;

    /* renamed from: b, reason: collision with root package name */
    public Paint f16986b;

    /* renamed from: c, reason: collision with root package name */
    public Paint f16987c;

    /* renamed from: d, reason: collision with root package name */
    public int f16988d;

    /* renamed from: e, reason: collision with root package name */
    public int f16989e;

    /* renamed from: f, reason: collision with root package name */
    public int f16990f;

    /* renamed from: g, reason: collision with root package name */
    public int f16991g;

    /* renamed from: h, reason: collision with root package name */
    public int f16992h;

    /* renamed from: i, reason: collision with root package name */
    public int f16993i;

    /* renamed from: j, reason: collision with root package name */
    public int f16994j;

    /* renamed from: k, reason: collision with root package name */
    public int f16995k;

    /* renamed from: l, reason: collision with root package name */
    public int f16996l;

    /* renamed from: m, reason: collision with root package name */
    public int f16997m;

    /* renamed from: n, reason: collision with root package name */
    public RectF f16998n;

    public CircleProgressView(Context context) {
        this(context, null);
    }

    public void a(int color) {
        this.f16989e = color;
        this.f16988d = color;
        this.f16986b.setColor(color);
        this.f16987c.setColor(color);
        this.f16985a.setColor(color);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i11 = this.f16993i;
        int i12 = this.f16992h;
        int i13 = this.f16994j;
        canvas.drawRect(i11 - (i12 / 2.0f), i13 - (i12 / 2.0f), i11 + (i12 / 2.0f), i13 + (i12 / 2.0f), this.f16987c);
        canvas.drawCircle(this.f16993i, this.f16994j, this.f16990f + (this.f16991g / 2.0f), this.f16985a);
        float f11 = this.f16990f;
        int i14 = this.f16996l;
        if (i14 > 0) {
            RectF rectF = this.f16998n;
            int i15 = this.f16993i;
            rectF.left = i15 - f11;
            int i16 = this.f16994j;
            rectF.top = i16 - f11;
            rectF.right = i15 + f11;
            rectF.bottom = i16 + f11;
            canvas.drawArc(rectF, -90.0f, (i14 / this.f16997m) * 360.0f, false, this.f16986b);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        int width = getWidth();
        int height = getHeight();
        this.f16993i = width / 2;
        this.f16994j = height / 2;
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(View.resolveSize(((this.f16990f + this.f16991g) * 2) + getPaddingLeft() + getPaddingRight(), widthMeasureSpec), View.resolveSize(((this.f16990f + this.f16991g) * 2) + getPaddingTop() + getPaddingBottom(), heightMeasureSpec));
    }

    public void setMaxProgress(int maxProgress) {
        this.f16997m = maxProgress;
        postInvalidate();
    }

    public void setProgress(int progress) {
        this.f16996l = progress;
        postInvalidate();
    }

    public CircleProgressView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CircleProgressView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f16996l = 0;
        this.f16997m = 100;
        this.f16998n = new RectF();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, R.styleable.CircleProgressView, defStyle, 0);
        this.f16990f = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.f16991g = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        this.f16992h = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f16988d = obtainStyledAttributes.getColor(1, 0);
        this.f16989e = obtainStyledAttributes.getColor(2, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        this.f16995k = dimensionPixelSize;
        if (dimensionPixelSize == 0) {
            this.f16995k = this.f16991g;
        }
        this.f16996l = obtainStyledAttributes.getInteger(4, 0);
        Paint paint = new Paint(1);
        this.f16985a = paint;
        paint.setColor(this.f16988d);
        this.f16985a.setStyle(Paint.Style.STROKE);
        this.f16985a.setStrokeWidth(this.f16991g);
        Paint paint2 = new Paint(this.f16985a);
        this.f16986b = paint2;
        paint2.setStrokeWidth(this.f16995k);
        this.f16986b.setColor(this.f16989e);
        Paint paint3 = new Paint();
        this.f16987c = paint3;
        paint3.setColor(this.f16989e);
        this.f16987c.setStyle(Paint.Style.FILL);
    }
}
