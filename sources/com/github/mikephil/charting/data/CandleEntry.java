package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"ParcelCreator"})
/* loaded from: classes6.dex */
public class CandleEntry extends Entry {

    /* renamed from: e, reason: collision with root package name */
    public float f30245e;

    /* renamed from: f, reason: collision with root package name */
    public float f30246f;

    /* renamed from: g, reason: collision with root package name */
    public float f30247g;

    /* renamed from: h, reason: collision with root package name */
    public float f30248h;

    public CandleEntry(float f11, float f12, float f13, float f14, float f15) {
        super(f11, (f12 + f13) / 2.0f);
        this.f30245e = f12;
        this.f30246f = f13;
        this.f30248h = f14;
        this.f30247g = f15;
    }

    @Override // fm.f
    public float c() {
        return super.c();
    }

    @Override // com.github.mikephil.charting.data.Entry
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public CandleEntry h() {
        return new CandleEntry(j(), this.f30245e, this.f30246f, this.f30248h, this.f30247g, a());
    }

    public float m() {
        return Math.abs(this.f30248h - this.f30247g);
    }

    public float n() {
        return this.f30247g;
    }

    public float o() {
        return this.f30245e;
    }

    public float p() {
        return this.f30246f;
    }

    public float r() {
        return this.f30248h;
    }

    public float s() {
        return Math.abs(this.f30245e - this.f30246f);
    }

    public void t(float f11) {
        this.f30247g = f11;
    }

    public void u(float f11) {
        this.f30245e = f11;
    }

    public void v(float f11) {
        this.f30246f = f11;
    }

    public void x(float f11) {
        this.f30248h = f11;
    }

    public CandleEntry(float f11, float f12, float f13, float f14, float f15, Object obj) {
        super(f11, (f12 + f13) / 2.0f, obj);
        this.f30245e = f12;
        this.f30246f = f13;
        this.f30248h = f14;
        this.f30247g = f15;
    }

    public CandleEntry(float f11, float f12, float f13, float f14, float f15, Drawable drawable) {
        super(f11, (f12 + f13) / 2.0f, drawable);
        this.f30245e = f12;
        this.f30246f = f13;
        this.f30248h = f14;
        this.f30247g = f15;
    }

    public CandleEntry(float f11, float f12, float f13, float f14, float f15, Drawable drawable, Object obj) {
        super(f11, (f12 + f13) / 2.0f, drawable, obj);
        this.f30245e = f12;
        this.f30246f = f13;
        this.f30248h = f14;
        this.f30247g = f15;
    }
}
