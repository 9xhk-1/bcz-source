package com.github.mikephil.charting.listener;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.listener.ChartTouchListener;
import im.d;
import km.e;
import rm.g;
import rm.k;
import rm.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a extends ChartTouchListener<BarLineChartBase<? extends fm.c<? extends km.b<? extends Entry>>>> {

    /* renamed from: m, reason: collision with root package name */
    public Matrix f30271m;

    /* renamed from: n, reason: collision with root package name */
    public Matrix f30272n;

    /* renamed from: o, reason: collision with root package name */
    public g f30273o;

    /* renamed from: p, reason: collision with root package name */
    public g f30274p;

    /* renamed from: q, reason: collision with root package name */
    public float f30275q;

    /* renamed from: r, reason: collision with root package name */
    public float f30276r;

    /* renamed from: s, reason: collision with root package name */
    public float f30277s;

    /* renamed from: t, reason: collision with root package name */
    public e f30278t;

    /* renamed from: u, reason: collision with root package name */
    public VelocityTracker f30279u;

    /* renamed from: v, reason: collision with root package name */
    public long f30280v;

    /* renamed from: w, reason: collision with root package name */
    public g f30281w;

    /* renamed from: x, reason: collision with root package name */
    public g f30282x;

    /* renamed from: y, reason: collision with root package name */
    public float f30283y;

    /* renamed from: z, reason: collision with root package name */
    public float f30284z;

    public a(BarLineChartBase<? extends fm.c<? extends km.b<? extends Entry>>> barLineChartBase, Matrix matrix, float f11) {
        super(barLineChartBase);
        this.f30271m = new Matrix();
        this.f30272n = new Matrix();
        this.f30273o = g.c(0.0f, 0.0f);
        this.f30274p = g.c(0.0f, 0.0f);
        this.f30275q = 1.0f;
        this.f30276r = 1.0f;
        this.f30277s = 1.0f;
        this.f30280v = 0L;
        this.f30281w = g.c(0.0f, 0.0f);
        this.f30282x = g.c(0.0f, 0.0f);
        this.f30271m = matrix;
        this.f30283y = k.e(f11);
        this.f30284z = k.e(3.5f);
    }

    public static float k(MotionEvent motionEvent) {
        return Math.abs(motionEvent.getX(0) - motionEvent.getX(1));
    }

    public static float l(MotionEvent motionEvent) {
        return Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
    }

    public static void n(g gVar, MotionEvent motionEvent) {
        float x11 = motionEvent.getX(0) + motionEvent.getX(1);
        float y11 = motionEvent.getY(0) + motionEvent.getY(1);
        gVar.f84265c = x11 / 2.0f;
        gVar.f84266d = y11 / 2.0f;
    }

    public static float t(MotionEvent motionEvent) {
        float x11 = motionEvent.getX(0) - motionEvent.getX(1);
        float y11 = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((x11 * x11) + (y11 * y11));
    }

    public void h() {
        g gVar = this.f30282x;
        if (gVar.f84265c == 0.0f && gVar.f84266d == 0.0f) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.f30282x.f84265c *= ((BarLineChartBase) this.f30270e).getDragDecelerationFrictionCoef();
        this.f30282x.f84266d *= ((BarLineChartBase) this.f30270e).getDragDecelerationFrictionCoef();
        float f11 = (currentAnimationTimeMillis - this.f30280v) / 1000.0f;
        g gVar2 = this.f30282x;
        float f12 = gVar2.f84265c * f11;
        float f13 = gVar2.f84266d * f11;
        g gVar3 = this.f30281w;
        float f14 = gVar3.f84265c + f12;
        gVar3.f84265c = f14;
        float f15 = gVar3.f84266d + f13;
        gVar3.f84266d = f15;
        MotionEvent obtain = MotionEvent.obtain(currentAnimationTimeMillis, currentAnimationTimeMillis, 2, f14, f15, 0);
        o(obtain, ((BarLineChartBase) this.f30270e).t0() ? this.f30281w.f84265c - this.f30273o.f84265c : 0.0f, ((BarLineChartBase) this.f30270e).u0() ? this.f30281w.f84266d - this.f30273o.f84266d : 0.0f);
        obtain.recycle();
        this.f30271m = ((BarLineChartBase) this.f30270e).getViewPortHandler().S(this.f30271m, this.f30270e, false);
        this.f30280v = currentAnimationTimeMillis;
        if (Math.abs(this.f30282x.f84265c) >= 0.01d || Math.abs(this.f30282x.f84266d) >= 0.01d) {
            k.K(this.f30270e);
            return;
        }
        ((BarLineChartBase) this.f30270e).p();
        ((BarLineChartBase) this.f30270e).postInvalidate();
        u();
    }

    public Matrix i() {
        return this.f30271m;
    }

    public g j(float f11, float f12) {
        l viewPortHandler = ((BarLineChartBase) this.f30270e).getViewPortHandler();
        return g.c(f11 - viewPortHandler.P(), m() ? -(f12 - viewPortHandler.R()) : -((((BarLineChartBase) this.f30270e).getMeasuredHeight() - f12) - viewPortHandler.O()));
    }

    public final boolean m() {
        if (this.f30278t == null && ((BarLineChartBase) this.f30270e).o0()) {
            return true;
        }
        e eVar = this.f30278t;
        return eVar != null && ((BarLineChartBase) this.f30270e).e(eVar.F0());
    }

    public final void o(MotionEvent motionEvent, float f11, float f12) {
        this.f30266a = ChartTouchListener.ChartGesture.DRAG;
        this.f30271m.set(this.f30272n);
        b onChartGestureListener = ((BarLineChartBase) this.f30270e).getOnChartGestureListener();
        if (m()) {
            if (this.f30270e instanceof HorizontalBarChart) {
                f11 = -f11;
            } else {
                f12 = -f12;
            }
        }
        this.f30271m.postTranslate(f11, f12);
        if (onChartGestureListener != null) {
            onChartGestureListener.e(motionEvent, f11, f12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        this.f30266a = ChartTouchListener.ChartGesture.DOUBLE_TAP;
        b onChartGestureListener = ((BarLineChartBase) this.f30270e).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.h(motionEvent);
        }
        if (((BarLineChartBase) this.f30270e).r0() && ((fm.c) ((BarLineChartBase) this.f30270e).getData()).r() > 0) {
            g j11 = j(motionEvent.getX(), motionEvent.getY());
            T t11 = this.f30270e;
            ((BarLineChartBase) t11).Q0(((BarLineChartBase) t11).A0() ? 1.4f : 1.0f, ((BarLineChartBase) this.f30270e).B0() ? 1.4f : 1.0f, j11.f84265c, j11.f84266d);
            if (((BarLineChartBase) this.f30270e).N()) {
                Log.i("BarlineChartTouch", "Double-Tap, Zooming In, x: " + j11.f84265c + ", y: " + j11.f84266d);
            }
            g.h(j11);
        }
        return super.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f11, float f12) {
        this.f30266a = ChartTouchListener.ChartGesture.FLING;
        b onChartGestureListener = ((BarLineChartBase) this.f30270e).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.b(motionEvent, motionEvent2, f11, f12);
        }
        return super.onFling(motionEvent, motionEvent2, f11, f12);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        this.f30266a = ChartTouchListener.ChartGesture.LONG_PRESS;
        b onChartGestureListener = ((BarLineChartBase) this.f30270e).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.d(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        this.f30266a = ChartTouchListener.ChartGesture.SINGLE_TAP;
        b onChartGestureListener = ((BarLineChartBase) this.f30270e).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.c(motionEvent);
        }
        if (!((BarLineChartBase) this.f30270e).M()) {
            return false;
        }
        e(((BarLineChartBase) this.f30270e).x(motionEvent.getX(), motionEvent.getY()), motionEvent);
        return super.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (this.f30279u == null) {
            this.f30279u = VelocityTracker.obtain();
        }
        this.f30279u.addMovement(motionEvent);
        if (motionEvent.getActionMasked() == 3 && (velocityTracker = this.f30279u) != null) {
            velocityTracker.recycle();
            this.f30279u = null;
        }
        if (this.f30267b == 0) {
            this.f30269d.onTouchEvent(motionEvent);
        }
        if (!((BarLineChartBase) this.f30270e).s0() && !((BarLineChartBase) this.f30270e).A0() && !((BarLineChartBase) this.f30270e).B0()) {
            return true;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            g(motionEvent);
            u();
            r(motionEvent);
        } else if (action == 1) {
            VelocityTracker velocityTracker2 = this.f30279u;
            int pointerId = motionEvent.getPointerId(0);
            velocityTracker2.computeCurrentVelocity(1000, k.x());
            float yVelocity = velocityTracker2.getYVelocity(pointerId);
            float xVelocity = velocityTracker2.getXVelocity(pointerId);
            if ((Math.abs(xVelocity) > k.y() || Math.abs(yVelocity) > k.y()) && this.f30267b == 1 && ((BarLineChartBase) this.f30270e).I()) {
                u();
                this.f30280v = AnimationUtils.currentAnimationTimeMillis();
                this.f30281w.f84265c = motionEvent.getX();
                this.f30281w.f84266d = motionEvent.getY();
                g gVar = this.f30282x;
                gVar.f84265c = xVelocity;
                gVar.f84266d = yVelocity;
                k.K(this.f30270e);
            }
            int i11 = this.f30267b;
            if (i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) {
                ((BarLineChartBase) this.f30270e).p();
                ((BarLineChartBase) this.f30270e).postInvalidate();
            }
            this.f30267b = 0;
            ((BarLineChartBase) this.f30270e).w();
            VelocityTracker velocityTracker3 = this.f30279u;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f30279u = null;
            }
            b(motionEvent);
        } else if (action == 2) {
            int i12 = this.f30267b;
            if (i12 == 1) {
                ((BarLineChartBase) this.f30270e).t();
                o(motionEvent, ((BarLineChartBase) this.f30270e).t0() ? motionEvent.getX() - this.f30273o.f84265c : 0.0f, ((BarLineChartBase) this.f30270e).u0() ? motionEvent.getY() - this.f30273o.f84266d : 0.0f);
            } else if (i12 == 2 || i12 == 3 || i12 == 4) {
                ((BarLineChartBase) this.f30270e).t();
                if (((BarLineChartBase) this.f30270e).A0() || ((BarLineChartBase) this.f30270e).B0()) {
                    q(motionEvent);
                }
            } else if (i12 == 0 && Math.abs(ChartTouchListener.a(motionEvent.getX(), this.f30273o.f84265c, motionEvent.getY(), this.f30273o.f84266d)) > this.f30283y && ((BarLineChartBase) this.f30270e).s0()) {
                if (!((BarLineChartBase) this.f30270e).w0() || !((BarLineChartBase) this.f30270e).n0()) {
                    float abs = Math.abs(motionEvent.getX() - this.f30273o.f84265c);
                    float abs2 = Math.abs(motionEvent.getY() - this.f30273o.f84266d);
                    if ((((BarLineChartBase) this.f30270e).t0() || abs2 >= abs) && (((BarLineChartBase) this.f30270e).u0() || abs2 <= abs)) {
                        this.f30266a = ChartTouchListener.ChartGesture.DRAG;
                        this.f30267b = 1;
                    }
                } else if (((BarLineChartBase) this.f30270e).x0()) {
                    this.f30266a = ChartTouchListener.ChartGesture.DRAG;
                    if (((BarLineChartBase) this.f30270e).x0()) {
                        p(motionEvent);
                    }
                }
            }
        } else if (action == 3) {
            this.f30267b = 0;
            b(motionEvent);
        } else if (action != 5) {
            if (action == 6) {
                k.M(motionEvent, this.f30279u);
                this.f30267b = 5;
            }
        } else if (motionEvent.getPointerCount() >= 2) {
            ((BarLineChartBase) this.f30270e).t();
            r(motionEvent);
            this.f30275q = k(motionEvent);
            this.f30276r = l(motionEvent);
            float t11 = t(motionEvent);
            this.f30277s = t11;
            if (t11 > 10.0f) {
                if (((BarLineChartBase) this.f30270e).z0()) {
                    this.f30267b = 4;
                } else if (((BarLineChartBase) this.f30270e).A0() != ((BarLineChartBase) this.f30270e).B0()) {
                    this.f30267b = ((BarLineChartBase) this.f30270e).A0() ? 2 : 3;
                } else {
                    this.f30267b = this.f30275q > this.f30276r ? 2 : 3;
                }
            }
            n(this.f30274p, motionEvent);
        }
        this.f30271m = ((BarLineChartBase) this.f30270e).getViewPortHandler().S(this.f30271m, this.f30270e, true);
        return true;
    }

    public final void p(MotionEvent motionEvent) {
        d x11 = ((BarLineChartBase) this.f30270e).x(motionEvent.getX(), motionEvent.getY());
        if (x11 == null || x11.a(this.f30268c)) {
            return;
        }
        this.f30268c = x11;
        ((BarLineChartBase) this.f30270e).F(x11, true);
    }

    public final void q(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() >= 2) {
            b onChartGestureListener = ((BarLineChartBase) this.f30270e).getOnChartGestureListener();
            float t11 = t(motionEvent);
            if (t11 > this.f30284z) {
                g gVar = this.f30274p;
                g j11 = j(gVar.f84265c, gVar.f84266d);
                l viewPortHandler = ((BarLineChartBase) this.f30270e).getViewPortHandler();
                int i11 = this.f30267b;
                if (i11 == 4) {
                    this.f30266a = ChartTouchListener.ChartGesture.PINCH_ZOOM;
                    float f11 = t11 / this.f30277s;
                    boolean z11 = f11 < 1.0f;
                    boolean c11 = z11 ? viewPortHandler.c() : viewPortHandler.a();
                    boolean d11 = z11 ? viewPortHandler.d() : viewPortHandler.b();
                    float f12 = ((BarLineChartBase) this.f30270e).A0() ? f11 : 1.0f;
                    float f13 = ((BarLineChartBase) this.f30270e).B0() ? f11 : 1.0f;
                    if (d11 || c11) {
                        this.f30271m.set(this.f30272n);
                        this.f30271m.postScale(f12, f13, j11.f84265c, j11.f84266d);
                        if (onChartGestureListener != null) {
                            onChartGestureListener.g(motionEvent, f12, f13);
                        }
                    }
                } else if (i11 == 2 && ((BarLineChartBase) this.f30270e).A0()) {
                    this.f30266a = ChartTouchListener.ChartGesture.X_ZOOM;
                    float k11 = k(motionEvent) / this.f30275q;
                    if (k11 < 1.0f ? viewPortHandler.c() : viewPortHandler.a()) {
                        this.f30271m.set(this.f30272n);
                        this.f30271m.postScale(k11, 1.0f, j11.f84265c, j11.f84266d);
                        if (onChartGestureListener != null) {
                            onChartGestureListener.g(motionEvent, k11, 1.0f);
                        }
                    }
                } else if (this.f30267b == 3 && ((BarLineChartBase) this.f30270e).B0()) {
                    this.f30266a = ChartTouchListener.ChartGesture.Y_ZOOM;
                    float l11 = l(motionEvent) / this.f30276r;
                    if (l11 < 1.0f ? viewPortHandler.d() : viewPortHandler.b()) {
                        this.f30271m.set(this.f30272n);
                        this.f30271m.postScale(1.0f, l11, j11.f84265c, j11.f84266d);
                        if (onChartGestureListener != null) {
                            onChartGestureListener.g(motionEvent, 1.0f, l11);
                        }
                    }
                }
                g.h(j11);
            }
        }
    }

    public final void r(MotionEvent motionEvent) {
        this.f30272n.set(this.f30271m);
        this.f30273o.f84265c = motionEvent.getX();
        this.f30273o.f84266d = motionEvent.getY();
        this.f30278t = ((BarLineChartBase) this.f30270e).h0(motionEvent.getX(), motionEvent.getY());
    }

    public void s(float f11) {
        this.f30283y = k.e(f11);
    }

    public void u() {
        g gVar = this.f30282x;
        gVar.f84265c = 0.0f;
        gVar.f84266d = 0.0f;
    }
}
