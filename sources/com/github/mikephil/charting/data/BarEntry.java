package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import im.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"ParcelCreator"})
/* loaded from: classes6.dex */
public class BarEntry extends Entry {

    /* renamed from: e, reason: collision with root package name */
    public float[] f30240e;

    /* renamed from: f, reason: collision with root package name */
    public j[] f30241f;

    /* renamed from: g, reason: collision with root package name */
    public float f30242g;

    /* renamed from: h, reason: collision with root package name */
    public float f30243h;

    public BarEntry(float f11, float f12) {
        super(f11, f12);
    }

    public static float n(float[] fArr) {
        float f11 = 0.0f;
        if (fArr == null) {
            return 0.0f;
        }
        for (float f12 : fArr) {
            f11 += f12;
        }
        return f11;
    }

    @Override // fm.f
    public float c() {
        return super.c();
    }

    public final void l() {
        float[] fArr = this.f30240e;
        if (fArr == null) {
            this.f30242g = 0.0f;
            this.f30243h = 0.0f;
            return;
        }
        float f11 = 0.0f;
        float f12 = 0.0f;
        for (float f13 : fArr) {
            if (f13 <= 0.0f) {
                f11 += Math.abs(f13);
            } else {
                f12 += f13;
            }
        }
        this.f30242g = f11;
        this.f30243h = f12;
    }

    public void m() {
        float[] v11 = v();
        if (v11 == null || v11.length == 0) {
            return;
        }
        this.f30241f = new j[v11.length];
        float f11 = -r();
        int i11 = 0;
        float f12 = 0.0f;
        while (true) {
            j[] jVarArr = this.f30241f;
            if (i11 >= jVarArr.length) {
                return;
            }
            float f13 = v11[i11];
            if (f13 < 0.0f) {
                float f14 = f11 - f13;
                jVarArr[i11] = new j(f11, f14);
                f11 = f14;
            } else {
                float f15 = f13 + f12;
                jVarArr[i11] = new j(f12, f15);
                f12 = f15;
            }
            i11++;
        }
    }

    @Override // com.github.mikephil.charting.data.Entry
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public BarEntry h() {
        BarEntry barEntry = new BarEntry(j(), c(), a());
        barEntry.y(this.f30240e);
        return barEntry;
    }

    @Deprecated
    public float p(int i11) {
        return u(i11);
    }

    public float r() {
        return this.f30242g;
    }

    public float s() {
        return this.f30243h;
    }

    public j[] t() {
        return this.f30241f;
    }

    public float u(int i11) {
        float[] fArr = this.f30240e;
        float f11 = 0.0f;
        if (fArr == null) {
            return 0.0f;
        }
        for (int length = fArr.length - 1; length > i11 && length >= 0; length--) {
            f11 += this.f30240e[length];
        }
        return f11;
    }

    public float[] v() {
        return this.f30240e;
    }

    public boolean x() {
        return this.f30240e != null;
    }

    public void y(float[] fArr) {
        g(n(fArr));
        this.f30240e = fArr;
        l();
        m();
    }

    public BarEntry(float f11, float f12, Object obj) {
        super(f11, f12, obj);
    }

    public BarEntry(float f11, float f12, Drawable drawable) {
        super(f11, f12, drawable);
    }

    public BarEntry(float f11, float f12, Drawable drawable, Object obj) {
        super(f11, f12, drawable, obj);
    }

    public BarEntry(float f11, float[] fArr) {
        super(f11, n(fArr));
        this.f30240e = fArr;
        l();
        m();
    }

    public BarEntry(float f11, float[] fArr, Object obj) {
        super(f11, n(fArr), obj);
        this.f30240e = fArr;
        l();
        m();
    }

    public BarEntry(float f11, float[] fArr, Drawable drawable) {
        super(f11, n(fArr), drawable);
        this.f30240e = fArr;
        l();
        m();
    }

    public BarEntry(float f11, float[] fArr, Drawable drawable, Object obj) {
        super(f11, n(fArr), drawable, obj);
        this.f30240e = fArr;
        l();
        m();
    }
}
