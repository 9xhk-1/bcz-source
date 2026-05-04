package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.Dimension;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.internal.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
class ClockHandView extends View {

    /* renamed from: v, reason: collision with root package name */
    public static final int f32557v = 200;

    /* renamed from: a, reason: collision with root package name */
    public final int f32558a;

    /* renamed from: b, reason: collision with root package name */
    public final TimeInterpolator f32559b;

    /* renamed from: c, reason: collision with root package name */
    public final ValueAnimator f32560c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f32561d;

    /* renamed from: e, reason: collision with root package name */
    public float f32562e;

    /* renamed from: f, reason: collision with root package name */
    public float f32563f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f32564g;

    /* renamed from: h, reason: collision with root package name */
    public final int f32565h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f32566i;

    /* renamed from: j, reason: collision with root package name */
    public final List<c> f32567j;

    /* renamed from: k, reason: collision with root package name */
    public final int f32568k;

    /* renamed from: l, reason: collision with root package name */
    public final float f32569l;

    /* renamed from: m, reason: collision with root package name */
    public final Paint f32570m;

    /* renamed from: n, reason: collision with root package name */
    public final RectF f32571n;

    /* renamed from: o, reason: collision with root package name */
    @Px
    public final int f32572o;

    /* renamed from: p, reason: collision with root package name */
    public float f32573p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f32574q;

    /* renamed from: r, reason: collision with root package name */
    public b f32575r;

    /* renamed from: s, reason: collision with root package name */
    public double f32576s;

    /* renamed from: t, reason: collision with root package name */
    public int f32577t;

    /* renamed from: u, reason: collision with root package name */
    public int f32578u;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void a(@FloatRange(from = 0.0d, to = 360.0d) float f11, boolean z11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void d(@FloatRange(from = 0.0d, to = 360.0d) float f11, boolean z11);
    }

    public ClockHandView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(ClockHandView clockHandView, ValueAnimator valueAnimator) {
        clockHandView.getClass();
        clockHandView.r(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    public void b(c cVar) {
        this.f32567j.add(cVar);
    }

    public final void c(float f11, float f12) {
        this.f32578u = on.a.a((float) (getWidth() / 2), (float) (getHeight() / 2), f11, f12) > ((float) i(2)) + m0.i(getContext(), 12) ? 1 : 2;
    }

    public final void d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f11 = width;
        float i11 = i(this.f32578u);
        float cos = (((float) Math.cos(this.f32576s)) * i11) + f11;
        float f12 = height;
        float sin = (i11 * ((float) Math.sin(this.f32576s))) + f12;
        this.f32570m.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f32568k, this.f32570m);
        double sin2 = Math.sin(this.f32576s);
        double cos2 = Math.cos(this.f32576s);
        this.f32570m.setStrokeWidth(this.f32572o);
        canvas.drawLine(f11, f12, width + ((int) (cos2 * r2)), height + ((int) (r2 * sin2)), this.f32570m);
        canvas.drawCircle(f11, f12, this.f32569l, this.f32570m);
    }

    public int e() {
        return this.f32578u;
    }

    public RectF f() {
        return this.f32571n;
    }

    public final int g(float f11, float f12) {
        int degrees = (int) Math.toDegrees(Math.atan2(f12 - (getHeight() / 2), f11 - (getWidth() / 2)));
        int i11 = degrees + 90;
        return i11 < 0 ? degrees + 450 : i11;
    }

    @FloatRange(from = 0.0d, to = 360.0d)
    public float h() {
        return this.f32573p;
    }

    @Dimension
    public final int i(int i11) {
        return i11 == 2 ? Math.round(this.f32577t * 0.66f) : this.f32577t;
    }

    public int j() {
        return this.f32568k;
    }

    public final Pair<Float, Float> k(float f11) {
        float h11 = h();
        if (Math.abs(h11 - f11) > 180.0f) {
            if (h11 > 180.0f && f11 < 180.0f) {
                f11 += 360.0f;
            }
            if (h11 < 180.0f && f11 > 180.0f) {
                h11 += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(h11), Float.valueOf(f11));
    }

    public final boolean l(float f11, float f12, boolean z11, boolean z12, boolean z13) {
        float g11 = g(f11, f12);
        boolean z14 = false;
        boolean z15 = h() != g11;
        if (z12 && z15) {
            return true;
        }
        if (!z15 && !z11) {
            return false;
        }
        if (z13 && this.f32561d) {
            z14 = true;
        }
        q(g11, z14);
        return true;
    }

    public void m(boolean z11) {
        this.f32561d = z11;
    }

    public void n(@Dimension int i11) {
        this.f32577t = i11;
        invalidate();
    }

    public void o(int i11) {
        this.f32578u = i11;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (this.f32560c.isRunning()) {
            return;
        }
        p(h());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        boolean z12;
        boolean z13;
        b bVar;
        int actionMasked = motionEvent.getActionMasked();
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f32562e = x11;
            this.f32563f = y11;
            this.f32564g = true;
            this.f32574q = false;
            z11 = true;
            z12 = false;
            z13 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i11 = (int) (x11 - this.f32562e);
            int i12 = (int) (y11 - this.f32563f);
            this.f32564g = (i11 * i11) + (i12 * i12) > this.f32565h;
            z12 = this.f32574q;
            boolean z14 = actionMasked == 1;
            if (this.f32566i) {
                c(x11, y11);
            }
            z13 = z14;
            z11 = false;
        } else {
            z12 = false;
            z11 = false;
            z13 = false;
        }
        boolean l11 = this.f32574q | l(x11, y11, z12, z11, z13);
        this.f32574q = l11;
        if (l11 && z13 && (bVar = this.f32575r) != null) {
            bVar.a(g(x11, y11), this.f32564g);
        }
        return true;
    }

    public void p(@FloatRange(from = 0.0d, to = 360.0d) float f11) {
        q(f11, false);
    }

    public void q(@FloatRange(from = 0.0d, to = 360.0d) float f11, boolean z11) {
        ValueAnimator valueAnimator = this.f32560c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z11) {
            r(f11, false);
            return;
        }
        Pair<Float, Float> k11 = k(f11);
        this.f32560c.setFloatValues(((Float) k11.first).floatValue(), ((Float) k11.second).floatValue());
        this.f32560c.setDuration(this.f32558a);
        this.f32560c.setInterpolator(this.f32559b);
        this.f32560c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ClockHandView.a(ClockHandView.this, valueAnimator2);
            }
        });
        this.f32560c.addListener(new a());
        this.f32560c.start();
    }

    public final void r(@FloatRange(from = 0.0d, to = 360.0d) float f11, boolean z11) {
        float f12 = f11 % 360.0f;
        this.f32573p = f12;
        this.f32576s = Math.toRadians(f12 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float i11 = i(this.f32578u);
        float cos = width + (((float) Math.cos(this.f32576s)) * i11);
        float sin = height + (i11 * ((float) Math.sin(this.f32576s)));
        RectF rectF = this.f32571n;
        int i12 = this.f32568k;
        rectF.set(cos - i12, sin - i12, cos + i12, sin + i12);
        Iterator<c> it = this.f32567j.iterator();
        while (it.hasNext()) {
            it.next().d(f12, z11);
        }
        invalidate();
    }

    public void s(boolean z11) {
        if (this.f32566i && !z11) {
            this.f32578u = 1;
        }
        this.f32566i = z11;
        invalidate();
    }

    public void t(b bVar) {
        this.f32575r = bVar;
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f32560c = new ValueAnimator();
        this.f32567j = new ArrayList();
        Paint paint = new Paint();
        this.f32570m = paint;
        this.f32571n = new RectF();
        this.f32578u = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ClockHandView, i11, R.style.Widget_MaterialComponents_TimePicker_Clock);
        this.f32558a = pn.j.f(context, R.attr.motionDurationLong2, 200);
        this.f32559b = pn.j.g(context, R.attr.motionEasingEmphasizedInterpolator, vm.b.f94061b);
        this.f32577t = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ClockHandView_materialCircleRadius, 0);
        this.f32568k = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ClockHandView_selectorSize, 0);
        this.f32572o = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f32569l = r7.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(R.styleable.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        p(0.0f);
        this.f32565h = ViewConfiguration.get(context).getScaledTouchSlop();
        ViewCompat.setImportantForAccessibility(this, 2);
        obtainStyledAttributes.recycle();
    }
}
