package rm;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f84302a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public RectF f84303b = new RectF();

    /* renamed from: c, reason: collision with root package name */
    public float f84304c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f84305d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f84306e = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f84307f = Float.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f84308g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f84309h = Float.MAX_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public float f84310i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f84311j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    public float f84312k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    public float f84313l = 0.0f;

    /* renamed from: m, reason: collision with root package name */
    public float f84314m = 0.0f;

    /* renamed from: n, reason: collision with root package name */
    public float f84315n = 0.0f;

    /* renamed from: o, reason: collision with root package name */
    public float[] f84316o = new float[9];

    /* renamed from: p, reason: collision with root package name */
    public Matrix f84317p = new Matrix();

    /* renamed from: q, reason: collision with root package name */
    public final float[] f84318q = new float[9];

    public float A() {
        return this.f84313l;
    }

    public boolean B() {
        return this.f84305d > 0.0f && this.f84304c > 0.0f;
    }

    public boolean C() {
        return this.f84314m <= 0.0f && this.f84315n <= 0.0f;
    }

    public boolean D() {
        return E() && F();
    }

    public boolean E() {
        float f11 = this.f84310i;
        float f12 = this.f84308g;
        return f11 <= f12 && f12 <= 1.0f;
    }

    public boolean F() {
        float f11 = this.f84311j;
        float f12 = this.f84306e;
        return f11 <= f12 && f12 <= 1.0f;
    }

    public boolean G(float f11, float f12) {
        return L(f11) && M(f12);
    }

    public boolean H(float f11) {
        return this.f84303b.bottom >= ((float) ((int) (f11 * 100.0f))) / 100.0f;
    }

    public boolean I(float f11) {
        return this.f84303b.left <= f11 + 1.0f;
    }

    public boolean J(float f11) {
        return this.f84303b.right >= (((float) ((int) (f11 * 100.0f))) / 100.0f) - 1.0f;
    }

    public boolean K(float f11) {
        return this.f84303b.top <= f11;
    }

    public boolean L(float f11) {
        return I(f11) && J(f11);
    }

    public boolean M(float f11) {
        return K(f11) && H(f11);
    }

    public void N(Matrix matrix, RectF rectF) {
        float f11;
        float f12;
        matrix.getValues(this.f84318q);
        float[] fArr = this.f84318q;
        float f13 = fArr[2];
        float f14 = fArr[0];
        float f15 = fArr[5];
        float f16 = fArr[4];
        this.f84310i = Math.min(Math.max(this.f84308g, f14), this.f84309h);
        this.f84311j = Math.min(Math.max(this.f84306e, f16), this.f84307f);
        if (rectF != null) {
            f11 = rectF.width();
            f12 = rectF.height();
        } else {
            f11 = 0.0f;
            f12 = 0.0f;
        }
        this.f84312k = Math.min(Math.max(f13, ((-f11) * (this.f84310i - 1.0f)) - this.f84314m), this.f84314m);
        float max = Math.max(Math.min(f15, (f12 * (this.f84311j - 1.0f)) + this.f84315n), -this.f84315n);
        this.f84313l = max;
        float[] fArr2 = this.f84318q;
        fArr2[2] = this.f84312k;
        fArr2[0] = this.f84310i;
        fArr2[5] = max;
        fArr2[4] = this.f84311j;
        matrix.setValues(fArr2);
    }

    public float O() {
        return this.f84305d - this.f84303b.bottom;
    }

    public float P() {
        return this.f84303b.left;
    }

    public float Q() {
        return this.f84304c - this.f84303b.right;
    }

    public float R() {
        return this.f84303b.top;
    }

    public Matrix S(Matrix matrix, View view, boolean z11) {
        this.f84302a.set(matrix);
        N(this.f84302a, this.f84303b);
        if (z11) {
            view.invalidate();
        }
        matrix.set(this.f84302a);
        return matrix;
    }

    public void T(Matrix matrix) {
        matrix.reset();
        matrix.set(this.f84302a);
        matrix.postScale(1.0f, 1.0f, 0.0f, 0.0f);
    }

    public void U(float f11, float f12, float f13, float f14) {
        this.f84303b.set(f11, f12, this.f84304c - f13, this.f84305d - f14);
    }

    public void V(float f11, float f12) {
        float P = P();
        float R = R();
        float Q = Q();
        float O = O();
        this.f84305d = f12;
        this.f84304c = f11;
        U(P, R, Q, O);
    }

    public void W(float f11) {
        this.f84314m = k.e(f11);
    }

    public void X(float f11) {
        this.f84315n = k.e(f11);
    }

    public void Y(float f11) {
        if (f11 == 0.0f) {
            f11 = Float.MAX_VALUE;
        }
        this.f84309h = f11;
        N(this.f84302a, this.f84303b);
    }

    public void Z(float f11) {
        if (f11 == 0.0f) {
            f11 = Float.MAX_VALUE;
        }
        this.f84307f = f11;
        N(this.f84302a, this.f84303b);
    }

    public boolean a() {
        return this.f84310i < this.f84309h;
    }

    public void a0(float f11, float f12) {
        if (f11 < 1.0f) {
            f11 = 1.0f;
        }
        if (f12 == 0.0f) {
            f12 = Float.MAX_VALUE;
        }
        this.f84308g = f11;
        this.f84309h = f12;
        N(this.f84302a, this.f84303b);
    }

    public boolean b() {
        return this.f84311j < this.f84307f;
    }

    public void b0(float f11, float f12) {
        if (f11 < 1.0f) {
            f11 = 1.0f;
        }
        if (f12 == 0.0f) {
            f12 = Float.MAX_VALUE;
        }
        this.f84306e = f11;
        this.f84307f = f12;
        N(this.f84302a, this.f84303b);
    }

    public boolean c() {
        return this.f84310i > this.f84308g;
    }

    public void c0(float f11) {
        if (f11 < 1.0f) {
            f11 = 1.0f;
        }
        this.f84308g = f11;
        N(this.f84302a, this.f84303b);
    }

    public boolean d() {
        return this.f84311j > this.f84306e;
    }

    public void d0(float f11) {
        if (f11 < 1.0f) {
            f11 = 1.0f;
        }
        this.f84306e = f11;
        N(this.f84302a, this.f84303b);
    }

    public void e(float[] fArr, View view) {
        Matrix matrix = this.f84317p;
        matrix.reset();
        matrix.set(this.f84302a);
        matrix.postTranslate(-(fArr[0] - P()), -(fArr[1] - R()));
        S(matrix, view, true);
    }

    public Matrix e0(float f11, float f12) {
        Matrix matrix = new Matrix();
        g0(f11, f12, matrix);
        return matrix;
    }

    public float f() {
        return this.f84303b.bottom;
    }

    public Matrix f0(float f11, float f12, float f13, float f14) {
        Matrix matrix = new Matrix();
        matrix.set(this.f84302a);
        matrix.setScale(f11, f12, f13, f14);
        return matrix;
    }

    public float g() {
        return this.f84303b.height();
    }

    public void g0(float f11, float f12, Matrix matrix) {
        matrix.reset();
        matrix.set(this.f84302a);
        matrix.setScale(f11, f12);
    }

    public float h() {
        return this.f84303b.left;
    }

    public Matrix h0(float[] fArr) {
        Matrix matrix = new Matrix();
        i0(fArr, matrix);
        return matrix;
    }

    public float i() {
        return this.f84303b.right;
    }

    public void i0(float[] fArr, Matrix matrix) {
        matrix.reset();
        matrix.set(this.f84302a);
        matrix.postTranslate(-(fArr[0] - P()), -(fArr[1] - R()));
    }

    public float j() {
        return this.f84303b.top;
    }

    public Matrix j0(float f11, float f12) {
        Matrix matrix = new Matrix();
        m0(f11, f12, matrix);
        return matrix;
    }

    public float k() {
        return this.f84303b.width();
    }

    public Matrix k0(float f11, float f12, float f13, float f14) {
        Matrix matrix = new Matrix();
        l0(f11, f12, f13, f14, matrix);
        return matrix;
    }

    public Matrix l() {
        Matrix matrix = new Matrix();
        m(matrix);
        return matrix;
    }

    public void l0(float f11, float f12, float f13, float f14, Matrix matrix) {
        matrix.reset();
        matrix.set(this.f84302a);
        matrix.postScale(f11, f12, f13, f14);
    }

    public void m(Matrix matrix) {
        this.f84308g = 1.0f;
        this.f84306e = 1.0f;
        matrix.set(this.f84302a);
        float[] fArr = this.f84316o;
        for (int i11 = 0; i11 < 9; i11++) {
            fArr[i11] = 0.0f;
        }
        matrix.getValues(fArr);
        fArr[2] = 0.0f;
        fArr[5] = 0.0f;
        fArr[0] = 1.0f;
        fArr[4] = 1.0f;
        matrix.setValues(fArr);
    }

    public void m0(float f11, float f12, Matrix matrix) {
        matrix.reset();
        matrix.set(this.f84302a);
        matrix.postScale(f11, f12);
    }

    public float n() {
        return this.f84305d;
    }

    public Matrix n0(float f11, float f12) {
        Matrix matrix = new Matrix();
        o0(f11, f12, matrix);
        return matrix;
    }

    public float o() {
        return this.f84304c;
    }

    public void o0(float f11, float f12, Matrix matrix) {
        matrix.reset();
        matrix.set(this.f84302a);
        matrix.postScale(1.4f, 1.4f, f11, f12);
    }

    public g p() {
        return g.c(this.f84303b.centerX(), this.f84303b.centerY());
    }

    public Matrix p0(float f11, float f12) {
        Matrix matrix = new Matrix();
        q0(f11, f12, matrix);
        return matrix;
    }

    public RectF q() {
        return this.f84303b;
    }

    public void q0(float f11, float f12, Matrix matrix) {
        matrix.reset();
        matrix.set(this.f84302a);
        matrix.postScale(0.7f, 0.7f, f11, f12);
    }

    public Matrix r() {
        return this.f84302a;
    }

    public float s() {
        return this.f84309h;
    }

    public float t() {
        return this.f84307f;
    }

    public float u() {
        return this.f84308g;
    }

    public float v() {
        return this.f84306e;
    }

    public float w() {
        return this.f84310i;
    }

    public float x() {
        return this.f84311j;
    }

    public float y() {
        return Math.min(this.f84303b.width(), this.f84303b.height());
    }

    public float z() {
        return this.f84312k;
    }
}
