package com.baicizhan.client.business.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class CircleCountdownView extends View {

    /* renamed from: a, reason: collision with root package name */
    public Paint f16956a;

    /* renamed from: b, reason: collision with root package name */
    public Paint f16957b;

    /* renamed from: c, reason: collision with root package name */
    public RectF f16958c;

    /* renamed from: d, reason: collision with root package name */
    public float f16959d;

    /* renamed from: e, reason: collision with root package name */
    public int f16960e;

    /* renamed from: f, reason: collision with root package name */
    public int f16961f;

    /* renamed from: g, reason: collision with root package name */
    public int f16962g;

    /* renamed from: h, reason: collision with root package name */
    public ValueAnimator f16963h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            CircleCountdownView.this.f16962g = Math.round(animation.getAnimatedFraction() * 360.0f) % 360;
            CircleCountdownView.this.invalidate();
        }
    }

    public CircleCountdownView(Context context) {
        super(context);
        this.f16958c = new RectF();
        d(null, R.style.DefaultCircleCountdownView);
    }

    public final void b() {
        this.f16956a.setStrokeWidth(this.f16959d);
        this.f16956a.setColor(this.f16960e);
        this.f16957b.setStrokeWidth(this.f16959d);
        this.f16957b.setColor(this.f16961f);
    }

    public void c(int color) {
        this.f16956a.setColor(color);
        invalidate();
    }

    public final void d(AttributeSet attrs, int defStyleRes) {
        e();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, R.styleable.CircleCountdownView, 0, defStyleRes);
        this.f16959d = obtainStyledAttributes.getDimension(2, 0.0f);
        this.f16960e = obtainStyledAttributes.getColor(1, 0);
        this.f16961f = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        b();
    }

    public final void e() {
        Paint paint = new Paint(1);
        this.f16956a = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.f16956a.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint(1);
        this.f16957b = paint2;
        paint2.setStyle(style);
    }

    public void f(long duration) {
        b();
        ValueAnimator valueAnimator = this.f16963h;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.f16963h.cancel();
        }
        ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, duration).setDuration(duration);
        this.f16963h = duration2;
        duration2.addUpdateListener(new a());
        this.f16963h.start();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f16963h;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.f16963h.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int min = Math.min(getWidth() / 2, getHeight() / 2);
        float f11 = this.f16959d / 2.0f;
        this.f16958c.set((r0 - min) + f11, (r1 - min) + f11, (r0 + min) - f11, (r1 + min) - f11);
        canvas.drawArc(this.f16958c, 360.0f, 360.0f, false, this.f16957b);
        canvas.drawArc(this.f16958c, -90.0f, this.f16962g, false, this.f16956a);
    }

    public CircleCountdownView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.f16958c = new RectF();
        d(attrs, R.style.DefaultCircleCountdownView);
    }

    public CircleCountdownView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f16958c = new RectF();
        d(attrs, R.style.DefaultCircleCountdownView);
    }
}
