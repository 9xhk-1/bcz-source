package com.badlogic.gdx.math;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class r implements s {

    /* renamed from: a, reason: collision with root package name */
    public float[] f12726a;

    /* renamed from: b, reason: collision with root package name */
    public float[] f12727b;

    /* renamed from: c, reason: collision with root package name */
    public float f12728c;

    /* renamed from: d, reason: collision with root package name */
    public float f12729d;

    /* renamed from: e, reason: collision with root package name */
    public float f12730e;

    /* renamed from: f, reason: collision with root package name */
    public float f12731f;

    /* renamed from: g, reason: collision with root package name */
    public float f12732g;

    /* renamed from: h, reason: collision with root package name */
    public float f12733h;

    /* renamed from: i, reason: collision with root package name */
    public float f12734i;

    /* renamed from: j, reason: collision with root package name */
    public float f12735j;

    /* renamed from: k, reason: collision with root package name */
    public float f12736k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f12737l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f12738m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f12739n;

    /* renamed from: o, reason: collision with root package name */
    public Rectangle f12740o;

    public r() {
        this.f12733h = 1.0f;
        this.f12734i = 1.0f;
        this.f12737l = true;
        this.f12738m = true;
        this.f12739n = true;
        this.f12726a = new float[0];
    }

    public void a() {
        this.f12738m = true;
    }

    public void b() {
        this.f12737l = true;
    }

    public void c() {
        this.f12739n = true;
    }

    @Override // com.badlogic.gdx.math.s
    public boolean contains(float f11, float f12) {
        return false;
    }

    public Rectangle d() {
        float[] l11 = l();
        float f11 = l11[0];
        float f12 = l11[1];
        int length = l11.length;
        float f13 = f12;
        float f14 = f11;
        float f15 = f13;
        for (int i11 = 2; i11 < length; i11 += 2) {
            float f16 = l11[i11];
            if (f11 > f16) {
                f11 = f16;
            }
            float f17 = l11[i11 + 1];
            if (f15 > f17) {
                f15 = f17;
            }
            if (f14 < f16) {
                f14 = f16;
            }
            if (f13 < f17) {
                f13 = f17;
            }
        }
        if (this.f12740o == null) {
            this.f12740o = new Rectangle();
        }
        Rectangle rectangle = this.f12740o;
        rectangle.f12533x = f11;
        rectangle.f12534y = f15;
        rectangle.width = f14 - f11;
        rectangle.height = f13 - f15;
        return rectangle;
    }

    public float e() {
        if (!this.f12738m) {
            return this.f12735j;
        }
        int i11 = 0;
        this.f12738m = false;
        this.f12735j = 0.0f;
        int length = this.f12726a.length - 2;
        while (i11 < length) {
            float[] fArr = this.f12726a;
            int i12 = i11 + 2;
            float f11 = fArr[i12] - fArr[i11];
            float f12 = fArr[i11 + 1] - fArr[i11 + 3];
            this.f12735j += (float) Math.sqrt((f11 * f11) + (f12 * f12));
            i11 = i12;
        }
        return this.f12735j;
    }

    public float f() {
        return this.f12730e;
    }

    public float g() {
        return this.f12731f;
    }

    public float h() {
        return this.f12732g;
    }

    public float i() {
        return this.f12733h;
    }

    public float j() {
        return this.f12734i;
    }

    public float k() {
        if (!this.f12737l) {
            return this.f12736k;
        }
        int i11 = 0;
        this.f12737l = false;
        this.f12736k = 0.0f;
        int length = this.f12726a.length - 2;
        while (i11 < length) {
            float[] fArr = this.f12726a;
            int i12 = i11 + 2;
            float f11 = fArr[i12];
            float f12 = this.f12733h;
            float f13 = (f11 * f12) - (fArr[i11] * f12);
            float f14 = fArr[i11 + 1];
            float f15 = this.f12734i;
            float f16 = (f14 * f15) - (fArr[i11 + 3] * f15);
            this.f12736k += (float) Math.sqrt((f13 * f13) + (f16 * f16));
            i11 = i12;
        }
        return this.f12736k;
    }

    public float[] l() {
        if (!this.f12739n) {
            return this.f12727b;
        }
        this.f12739n = false;
        float[] fArr = this.f12726a;
        float[] fArr2 = this.f12727b;
        if (fArr2 == null || fArr2.length < fArr.length) {
            this.f12727b = new float[fArr.length];
        }
        float[] fArr3 = this.f12727b;
        float f11 = this.f12728c;
        float f12 = this.f12729d;
        float f13 = this.f12730e;
        float f14 = this.f12731f;
        float f15 = this.f12733h;
        float f16 = this.f12734i;
        boolean z11 = (f15 == 1.0f && f16 == 1.0f) ? false : true;
        float f17 = this.f12732g;
        float t11 = n.t(f17);
        float a02 = n.a0(f17);
        int length = fArr.length;
        for (int i11 = 0; i11 < length; i11 += 2) {
            float f18 = fArr[i11] - f13;
            int i12 = i11 + 1;
            float f19 = fArr[i12] - f14;
            if (z11) {
                f18 *= f15;
                f19 *= f16;
            }
            if (f17 != 0.0f) {
                float f21 = (t11 * f18) - (a02 * f19);
                f19 = (f18 * a02) + (f19 * t11);
                f18 = f21;
            }
            fArr3[i11] = f18 + f11 + f13;
            fArr3[i12] = f12 + f19 + f14;
        }
        return fArr3;
    }

    public float[] m() {
        return this.f12726a;
    }

    public float n() {
        return this.f12728c;
    }

    public float o() {
        return this.f12729d;
    }

    public void p(float f11) {
        this.f12732g += f11;
        this.f12739n = true;
    }

    public void q(float f11) {
        this.f12733h += f11;
        this.f12734i += f11;
        this.f12739n = true;
        this.f12737l = true;
    }

    public void r(float f11, float f12) {
        this.f12730e = f11;
        this.f12731f = f12;
        this.f12739n = true;
    }

    public void s(float f11, float f12) {
        this.f12728c = f11;
        this.f12729d = f12;
        this.f12739n = true;
    }

    public void t(float f11) {
        this.f12732g = f11;
        this.f12739n = true;
    }

    public void u(float f11, float f12) {
        this.f12733h = f11;
        this.f12734i = f12;
        this.f12739n = true;
        this.f12737l = true;
    }

    public void v(float[] fArr) {
        if (fArr.length < 4) {
            throw new IllegalArgumentException("polylines must contain at least 2 points.");
        }
        this.f12726a = fArr;
        this.f12739n = true;
    }

    public void w(float f11, float f12) {
        this.f12728c += f11;
        this.f12729d += f12;
        this.f12739n = true;
    }

    @Override // com.badlogic.gdx.math.s
    public boolean contains(Vector2 vector2) {
        return false;
    }

    public r(float[] fArr) {
        this.f12733h = 1.0f;
        this.f12734i = 1.0f;
        this.f12737l = true;
        this.f12738m = true;
        this.f12739n = true;
        if (fArr.length >= 4) {
            this.f12726a = fArr;
            return;
        }
        throw new IllegalArgumentException("polylines must contain at least 2 points.");
    }
}
