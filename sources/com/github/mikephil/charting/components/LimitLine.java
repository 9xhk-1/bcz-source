package com.github.mikephil.charting.components;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import com.jiongji.andriod.card.R;
import em.b;
import rm.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class LimitLine extends b {

    /* renamed from: g, reason: collision with root package name */
    public float f30224g;

    /* renamed from: h, reason: collision with root package name */
    public float f30225h;

    /* renamed from: i, reason: collision with root package name */
    public int f30226i;

    /* renamed from: j, reason: collision with root package name */
    public Paint.Style f30227j;

    /* renamed from: k, reason: collision with root package name */
    public String f30228k;

    /* renamed from: l, reason: collision with root package name */
    public DashPathEffect f30229l;

    /* renamed from: m, reason: collision with root package name */
    public LimitLabelPosition f30230m;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum LimitLabelPosition {
        LEFT_TOP,
        LEFT_BOTTOM,
        RIGHT_TOP,
        RIGHT_BOTTOM
    }

    public LimitLine(float f11) {
        this.f30224g = 0.0f;
        this.f30225h = 2.0f;
        this.f30226i = Color.rgb(R.styleable.Theme_drawable_tab_mall_new, 91, 91);
        this.f30227j = Paint.Style.FILL_AND_STROKE;
        this.f30228k = "";
        this.f30229l = null;
        this.f30230m = LimitLabelPosition.RIGHT_TOP;
        this.f30224g = f11;
    }

    public void A(Paint.Style style) {
        this.f30227j = style;
    }

    public void m() {
        this.f30229l = null;
    }

    public void n(float f11, float f12, float f13) {
        this.f30229l = new DashPathEffect(new float[]{f11, f12}, f13);
    }

    public DashPathEffect o() {
        return this.f30229l;
    }

    public String p() {
        return this.f30228k;
    }

    public LimitLabelPosition q() {
        return this.f30230m;
    }

    public float r() {
        return this.f30224g;
    }

    public int s() {
        return this.f30226i;
    }

    public float t() {
        return this.f30225h;
    }

    public Paint.Style u() {
        return this.f30227j;
    }

    public boolean v() {
        return this.f30229l != null;
    }

    public void w(String str) {
        this.f30228k = str;
    }

    public void x(LimitLabelPosition limitLabelPosition) {
        this.f30230m = limitLabelPosition;
    }

    public void y(int i11) {
        this.f30226i = i11;
    }

    public void z(float f11) {
        if (f11 < 0.2f) {
            f11 = 0.2f;
        }
        if (f11 > 12.0f) {
            f11 = 12.0f;
        }
        this.f30225h = k.e(f11);
    }

    public LimitLine(float f11, String str) {
        this.f30224g = 0.0f;
        this.f30225h = 2.0f;
        this.f30226i = Color.rgb(R.styleable.Theme_drawable_tab_mall_new, 91, 91);
        this.f30227j = Paint.Style.FILL_AND_STROKE;
        this.f30228k = "";
        this.f30229l = null;
        this.f30230m = LimitLabelPosition.RIGHT_TOP;
        this.f30224g = f11;
        this.f30228k = str;
    }
}
