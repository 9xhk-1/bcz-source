package com.github.mikephil.charting.listener;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.github.mikephil.charting.charts.Chart;
import im.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class ChartTouchListener<T extends Chart<?>> extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {

    /* renamed from: f, reason: collision with root package name */
    public static final int f30259f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f30260g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f30261h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static final int f30262i = 3;

    /* renamed from: j, reason: collision with root package name */
    public static final int f30263j = 4;

    /* renamed from: k, reason: collision with root package name */
    public static final int f30264k = 5;

    /* renamed from: l, reason: collision with root package name */
    public static final int f30265l = 6;

    /* renamed from: a, reason: collision with root package name */
    public ChartGesture f30266a = ChartGesture.NONE;

    /* renamed from: b, reason: collision with root package name */
    public int f30267b = 0;

    /* renamed from: c, reason: collision with root package name */
    public d f30268c;

    /* renamed from: d, reason: collision with root package name */
    public GestureDetector f30269d;

    /* renamed from: e, reason: collision with root package name */
    public T f30270e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum ChartGesture {
        NONE,
        DRAG,
        X_ZOOM,
        Y_ZOOM,
        PINCH_ZOOM,
        ROTATE,
        SINGLE_TAP,
        DOUBLE_TAP,
        LONG_PRESS,
        FLING
    }

    public ChartTouchListener(T t11) {
        this.f30270e = t11;
        this.f30269d = new GestureDetector(t11.getContext(), this);
    }

    public static float a(float f11, float f12, float f13, float f14) {
        float f15 = f11 - f12;
        float f16 = f13 - f14;
        return (float) Math.sqrt((f15 * f15) + (f16 * f16));
    }

    public void b(MotionEvent motionEvent) {
        b onChartGestureListener = this.f30270e.getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.f(motionEvent, this.f30266a);
        }
    }

    public ChartGesture c() {
        return this.f30266a;
    }

    public int d() {
        return this.f30267b;
    }

    public void e(d dVar, MotionEvent motionEvent) {
        if (dVar == null || dVar.a(this.f30268c)) {
            this.f30270e.F(null, true);
            this.f30268c = null;
        } else {
            this.f30270e.F(dVar, true);
            this.f30268c = dVar;
        }
    }

    public void f(d dVar) {
        this.f30268c = dVar;
    }

    public void g(MotionEvent motionEvent) {
        b onChartGestureListener = this.f30270e.getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.a(motionEvent, this.f30266a);
        }
    }
}
