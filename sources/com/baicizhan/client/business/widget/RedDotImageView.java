package com.baicizhan.client.business.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.jiongji.andriod.card.R;
import qb.c;
import xb.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class RedDotImageView extends AppCompatImageView {

    /* renamed from: g, reason: collision with root package name */
    public static final int f17157g = -1359808;

    /* renamed from: h, reason: collision with root package name */
    public static final int f17158h = 2;

    /* renamed from: a, reason: collision with root package name */
    public boolean f17159a;

    /* renamed from: b, reason: collision with root package name */
    public int f17160b;

    /* renamed from: c, reason: collision with root package name */
    public int f17161c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f17162d;

    /* renamed from: e, reason: collision with root package name */
    public int f17163e;

    /* renamed from: f, reason: collision with root package name */
    public ValueAnimator f17164f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            RedDotImageView.this.f17163e = ((Integer) animation.getAnimatedValue()).intValue();
            RedDotImageView.this.invalidate();
        }
    }

    public RedDotImageView(Context context) {
        this(context, null, 0);
    }

    public boolean b() {
        return this.f17159a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(((getWidth() - getPaddingRight()) - this.f17160b) - this.f17161c, getPaddingTop() + this.f17160b + this.f17161c, this.f17163e, this.f17162d);
    }

    public void setShowRedDot(boolean showRedDot) {
        c.b("whiz", "reddot input: " + showRedDot + "; reddot now: " + this.f17159a, new Object[0]);
        if (this.f17159a != showRedDot) {
            this.f17159a = showRedDot;
            ValueAnimator valueAnimator = this.f17164f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.f17159a) {
                this.f17164f = ValueAnimator.ofInt(0, this.f17160b);
            } else {
                int i11 = this.f17163e;
                int i12 = this.f17160b;
                if (i11 != i12) {
                    return;
                } else {
                    this.f17164f = ValueAnimator.ofInt(i12, 0);
                }
            }
            this.f17164f.setDuration(300L).addUpdateListener(new a());
            this.f17164f.setStartDelay(100L);
            this.f17164f.start();
        }
    }

    public RedDotImageView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RedDotImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f17159a = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.RedDotImageView, defStyleAttr, 0);
        int color = obtainStyledAttributes.getColor(0, -1359808);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        dimensionPixelSize = dimensionPixelSize == 0 ? i.a(context, 2.0f) : dimensionPixelSize;
        this.f17161c = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f17162d = paint;
        paint.setColor(color);
        this.f17160b = dimensionPixelSize;
    }
}
