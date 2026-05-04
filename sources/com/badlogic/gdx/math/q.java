package com.badlogic.gdx.math;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class q implements s {

    /* renamed from: a, reason: collision with root package name */
    public float[] f12715a;

    /* renamed from: b, reason: collision with root package name */
    public float[] f12716b;

    /* renamed from: c, reason: collision with root package name */
    public float f12717c;

    /* renamed from: d, reason: collision with root package name */
    public float f12718d;

    /* renamed from: e, reason: collision with root package name */
    public float f12719e;

    /* renamed from: f, reason: collision with root package name */
    public float f12720f;

    /* renamed from: g, reason: collision with root package name */
    public float f12721g;

    /* renamed from: h, reason: collision with root package name */
    public float f12722h;

    /* renamed from: i, reason: collision with root package name */
    public float f12723i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f12724j;

    /* renamed from: k, reason: collision with root package name */
    public Rectangle f12725k;

    public q() {
        this.f12722h = 1.0f;
        this.f12723i = 1.0f;
        this.f12724j = true;
        this.f12715a = new float[0];
    }

    public float a() {
        float[] j11 = j();
        return k.l(j11, 0, j11.length);
    }

    public void b() {
        this.f12724j = true;
    }

    public Rectangle c() {
        float[] j11 = j();
        float f11 = j11[0];
        float f12 = j11[1];
        int length = j11.length;
        float f13 = f12;
        float f14 = f11;
        float f15 = f13;
        for (int i11 = 2; i11 < length; i11 += 2) {
            float f16 = j11[i11];
            if (f11 > f16) {
                f11 = f16;
            }
            float f17 = j11[i11 + 1];
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
        if (this.f12725k == null) {
            this.f12725k = new Rectangle();
        }
        Rectangle rectangle = this.f12725k;
        rectangle.f12533x = f11;
        rectangle.f12534y = f15;
        rectangle.width = f14 - f11;
        rectangle.height = f13 - f15;
        return rectangle;
    }

    @Override // com.badlogic.gdx.math.s
    public boolean contains(float f11, float f12) {
        float[] j11 = j();
        int length = j11.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            float f13 = j11[i11];
            float f14 = j11[i11 + 1];
            int i13 = i11 + 2;
            float f15 = j11[i13 % length];
            float f16 = j11[(i11 + 3) % length];
            if (((f14 <= f12 && f12 < f16) || (f16 <= f12 && f12 < f14)) && f11 < (((f15 - f13) / (f16 - f14)) * (f12 - f14)) + f13) {
                i12++;
            }
            i11 = i13;
        }
        return (i12 & 1) == 1;
    }

    public Vector2 d(Vector2 vector2) {
        float[] j11 = j();
        return k.m(j11, 0, j11.length, vector2);
    }

    public float e() {
        return this.f12719e;
    }

    public float f() {
        return this.f12720f;
    }

    public float g() {
        return this.f12721g;
    }

    public float h() {
        return this.f12722h;
    }

    public float i() {
        return this.f12723i;
    }

    public float[] j() {
        if (!this.f12724j) {
            return this.f12716b;
        }
        this.f12724j = false;
        float[] fArr = this.f12715a;
        float[] fArr2 = this.f12716b;
        if (fArr2 == null || fArr2.length != fArr.length) {
            this.f12716b = new float[fArr.length];
        }
        float[] fArr3 = this.f12716b;
        float f11 = this.f12717c;
        float f12 = this.f12718d;
        float f13 = this.f12719e;
        float f14 = this.f12720f;
        float f15 = this.f12722h;
        float f16 = this.f12723i;
        boolean z11 = (f15 == 1.0f && f16 == 1.0f) ? false : true;
        float f17 = this.f12721g;
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

    public Vector2 k(int i11, Vector2 vector2) {
        if (i11 >= 0 && i11 <= l()) {
            float[] j11 = j();
            int i12 = i11 * 2;
            return vector2.set(j11[i12], j11[i12 + 1]);
        }
        throw new IllegalArgumentException("the vertex " + i11 + " doesn't exist");
    }

    public int l() {
        return this.f12715a.length / 2;
    }

    public float[] m() {
        return this.f12715a;
    }

    public float n() {
        return this.f12717c;
    }

    public float o() {
        return this.f12718d;
    }

    public void p() {
        this.f12722h = 1.0f;
        this.f12723i = 1.0f;
        this.f12719e = 0.0f;
        this.f12720f = 0.0f;
        this.f12717c = 0.0f;
        this.f12718d = 0.0f;
        this.f12721g = 0.0f;
        this.f12724j = true;
    }

    public void q(float f11) {
        this.f12721g += f11;
        this.f12724j = true;
    }

    public void r(float f11) {
        this.f12722h += f11;
        this.f12723i += f11;
        this.f12724j = true;
    }

    public void s(float f11, float f12) {
        this.f12719e = f11;
        this.f12720f = f12;
        this.f12724j = true;
    }

    public void t(float f11, float f12) {
        this.f12717c = f11;
        this.f12718d = f12;
        this.f12724j = true;
    }

    public void u(float f11) {
        this.f12721g = f11;
        this.f12724j = true;
    }

    public void v(float f11, float f12) {
        this.f12722h = f11;
        this.f12723i = f12;
        this.f12724j = true;
    }

    public void w(int i11, float f11, float f12) {
        if (i11 >= 0) {
            float[] fArr = this.f12715a;
            if (i11 <= (fArr.length / 2) - 1) {
                int i12 = i11 * 2;
                fArr[i12] = f11;
                fArr[i12 + 1] = f12;
                this.f12724j = true;
                return;
            }
        }
        throw new IllegalArgumentException("the vertex " + i11 + " doesn't exist");
    }

    public void x(float[] fArr) {
        if (fArr.length < 6) {
            throw new IllegalArgumentException("polygons must contain at least 3 points.");
        }
        this.f12715a = fArr;
        this.f12724j = true;
    }

    public void y(float f11, float f12) {
        this.f12717c += f11;
        this.f12718d += f12;
        this.f12724j = true;
    }

    public q(float[] fArr) {
        this.f12722h = 1.0f;
        this.f12723i = 1.0f;
        this.f12724j = true;
        if (fArr.length >= 6) {
            this.f12715a = fArr;
            return;
        }
        throw new IllegalArgumentException("polygons must contain at least 3 points.");
    }

    @Override // com.badlogic.gdx.math.s
    public boolean contains(Vector2 vector2) {
        return contains(vector2.f12535x, vector2.f12536y);
    }
}
