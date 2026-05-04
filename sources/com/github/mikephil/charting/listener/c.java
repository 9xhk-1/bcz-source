package com.github.mikephil.charting.listener;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.PieRadarChartBase;
import com.github.mikephil.charting.listener.ChartTouchListener;
import java.util.ArrayList;
import rm.g;
import rm.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class c extends ChartTouchListener<PieRadarChartBase<?>> {

    /* renamed from: m, reason: collision with root package name */
    public g f30285m;

    /* renamed from: n, reason: collision with root package name */
    public float f30286n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList<a> f30287o;

    /* renamed from: p, reason: collision with root package name */
    public long f30288p;

    /* renamed from: q, reason: collision with root package name */
    public float f30289q;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public long f30290a;

        /* renamed from: b, reason: collision with root package name */
        public float f30291b;

        public a(long j11, float f11) {
            this.f30290a = j11;
            this.f30291b = f11;
        }
    }

    public c(PieRadarChartBase<?> pieRadarChartBase) {
        super(pieRadarChartBase);
        this.f30285m = g.c(0.0f, 0.0f);
        this.f30286n = 0.0f;
        this.f30287o = new ArrayList<>();
        this.f30288p = 0L;
        this.f30289q = 0.0f;
    }

    public final float h() {
        if (this.f30287o.isEmpty()) {
            return 0.0f;
        }
        a aVar = this.f30287o.get(0);
        ArrayList<a> arrayList = this.f30287o;
        a aVar2 = arrayList.get(arrayList.size() - 1);
        a aVar3 = aVar;
        for (int size = this.f30287o.size() - 1; size >= 0; size--) {
            aVar3 = this.f30287o.get(size);
            if (aVar3.f30291b != aVar2.f30291b) {
                break;
            }
        }
        float f11 = (aVar2.f30290a - aVar.f30290a) / 1000.0f;
        if (f11 == 0.0f) {
            f11 = 0.1f;
        }
        boolean z11 = aVar2.f30291b >= aVar3.f30291b;
        if (Math.abs(r1 - r6) > 270.0d) {
            z11 = !z11;
        }
        float f12 = aVar2.f30291b;
        float f13 = aVar.f30291b;
        if (f12 - f13 > 180.0d) {
            aVar.f30291b = (float) (f13 + 360.0d);
        } else if (f13 - f12 > 180.0d) {
            aVar2.f30291b = (float) (f12 + 360.0d);
        }
        float abs = Math.abs((aVar2.f30291b - aVar.f30291b) / f11);
        return !z11 ? -abs : abs;
    }

    public void i() {
        if (this.f30289q == 0.0f) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.f30289q *= ((PieRadarChartBase) this.f30270e).getDragDecelerationFrictionCoef();
        T t11 = this.f30270e;
        ((PieRadarChartBase) t11).setRotationAngle(((PieRadarChartBase) t11).getRotationAngle() + (this.f30289q * ((currentAnimationTimeMillis - this.f30288p) / 1000.0f)));
        this.f30288p = currentAnimationTimeMillis;
        if (Math.abs(this.f30289q) >= 0.001d) {
            k.K(this.f30270e);
        } else {
            m();
        }
    }

    public final void j() {
        this.f30287o.clear();
    }

    public final void k(float f11, float f12) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.f30287o.add(new a(currentAnimationTimeMillis, ((PieRadarChartBase) this.f30270e).a0(f11, f12)));
        for (int size = this.f30287o.size(); size - 2 > 0 && currentAnimationTimeMillis - this.f30287o.get(0).f30290a > 1000; size--) {
            this.f30287o.remove(0);
        }
    }

    public void l(float f11, float f12) {
        this.f30286n = ((PieRadarChartBase) this.f30270e).a0(f11, f12) - ((PieRadarChartBase) this.f30270e).getRawRotationAngle();
    }

    public void m() {
        this.f30289q = 0.0f;
    }

    public void n(float f11, float f12) {
        T t11 = this.f30270e;
        ((PieRadarChartBase) t11).setRotationAngle(((PieRadarChartBase) t11).a0(f11, f12) - this.f30286n);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        this.f30266a = ChartTouchListener.ChartGesture.LONG_PRESS;
        b onChartGestureListener = ((PieRadarChartBase) this.f30270e).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.d(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        this.f30266a = ChartTouchListener.ChartGesture.SINGLE_TAP;
        b onChartGestureListener = ((PieRadarChartBase) this.f30270e).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.c(motionEvent);
        }
        if (!((PieRadarChartBase) this.f30270e).M()) {
            return false;
        }
        e(((PieRadarChartBase) this.f30270e).x(motionEvent.getX(), motionEvent.getY()), motionEvent);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f30269d.onTouchEvent(motionEvent) && ((PieRadarChartBase) this.f30270e).e0()) {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                g(motionEvent);
                m();
                j();
                if (((PieRadarChartBase) this.f30270e).I()) {
                    k(x11, y11);
                }
                l(x11, y11);
                g gVar = this.f30285m;
                gVar.f84265c = x11;
                gVar.f84266d = y11;
            } else if (action == 1) {
                if (((PieRadarChartBase) this.f30270e).I()) {
                    m();
                    k(x11, y11);
                    float h11 = h();
                    this.f30289q = h11;
                    if (h11 != 0.0f) {
                        this.f30288p = AnimationUtils.currentAnimationTimeMillis();
                        k.K(this.f30270e);
                    }
                }
                ((PieRadarChartBase) this.f30270e).w();
                this.f30267b = 0;
                b(motionEvent);
            } else if (action == 2) {
                if (((PieRadarChartBase) this.f30270e).I()) {
                    k(x11, y11);
                }
                if (this.f30267b == 0) {
                    g gVar2 = this.f30285m;
                    if (ChartTouchListener.a(x11, gVar2.f84265c, y11, gVar2.f84266d) > k.e(8.0f)) {
                        this.f30266a = ChartTouchListener.ChartGesture.ROTATE;
                        this.f30267b = 6;
                        ((PieRadarChartBase) this.f30270e).t();
                        b(motionEvent);
                    }
                }
                if (this.f30267b == 6) {
                    n(x11, y11);
                    ((PieRadarChartBase) this.f30270e).invalidate();
                }
                b(motionEvent);
            }
        }
        return true;
    }
}
