package com.badlogic.gdx.math;

import a3.t0;
import a3.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class h {

    /* renamed from: g, reason: collision with root package name */
    public static final int f12590g = -1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f12591h = 1;

    /* renamed from: b, reason: collision with root package name */
    public short[] f12593b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f12594c;

    /* renamed from: d, reason: collision with root package name */
    public int f12595d;

    /* renamed from: a, reason: collision with root package name */
    public final t0 f12592a = new t0();

    /* renamed from: e, reason: collision with root package name */
    public final v f12596e = new v();

    /* renamed from: f, reason: collision with root package name */
    public final t0 f12597f = new t0();

    public static int b(float f11, float f12, float f13, float f14, float f15, float f16) {
        return (int) Math.signum((f11 * (f16 - f14)) + (f13 * (f12 - f16)) + (f15 * (f14 - f12)));
    }

    public final int a(int i11) {
        short[] sArr = this.f12593b;
        int i12 = sArr[j(i11)] * 2;
        int i13 = sArr[i11] * 2;
        int i14 = sArr[i(i11)] * 2;
        float[] fArr = this.f12594c;
        return b(fArr[i12], fArr[i12 + 1], fArr[i13], fArr[i13 + 1], fArr[i14], fArr[i14 + 1]);
    }

    public t0 c(a3.r rVar) {
        return e(rVar.f1625a, 0, rVar.f1626b);
    }

    public t0 d(float[] fArr) {
        return e(fArr, 0, fArr.length);
    }

    public t0 e(float[] fArr, int i11, int i12) {
        this.f12594c = fArr;
        int i13 = i12 / 2;
        this.f12595d = i13;
        int i14 = i11 / 2;
        t0 t0Var = this.f12592a;
        t0Var.j();
        t0Var.l(i13);
        t0Var.f1634b = i13;
        short[] sArr = t0Var.f1633a;
        this.f12593b = sArr;
        if (k.j(fArr, i11, i12)) {
            for (short s11 = 0; s11 < i13; s11 = (short) (s11 + 1)) {
                sArr[s11] = (short) (i14 + s11);
            }
        } else {
            int i15 = i13 - 1;
            for (int i16 = 0; i16 < i13; i16++) {
                sArr[i16] = (short) ((i14 + i15) - i16);
            }
        }
        v vVar = this.f12596e;
        vVar.i();
        vVar.k(i13);
        for (int i17 = 0; i17 < i13; i17++) {
            vVar.a(a(i17));
        }
        t0 t0Var2 = this.f12597f;
        t0Var2.j();
        t0Var2.l(Math.max(0, i13 - 2) * 3);
        k();
        return t0Var2;
    }

    public final void f(int i11) {
        short[] sArr = this.f12593b;
        t0 t0Var = this.f12597f;
        t0Var.b(sArr[j(i11)]);
        t0Var.b(sArr[i11]);
        t0Var.b(sArr[i(i11)]);
        this.f12592a.C(i11);
        this.f12596e.B(i11);
        this.f12595d--;
    }

    public final int g() {
        int i11 = this.f12595d;
        for (int i12 = 0; i12 < i11; i12++) {
            if (h(i12)) {
                return i12;
            }
        }
        int[] iArr = this.f12596e.f1639a;
        for (int i13 = 0; i13 < i11; i13++) {
            if (iArr[i13] != -1) {
                return i13;
            }
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean h(int i11) {
        float f11;
        float f12;
        int i12;
        float f13;
        int[] iArr = this.f12596e.f1639a;
        if (iArr[i11] == -1) {
            return false;
        }
        int j11 = j(i11);
        int i13 = i(i11);
        short[] sArr = this.f12593b;
        int i14 = sArr[j11] * 2;
        int i15 = sArr[i11] * 2;
        int i16 = sArr[i13] * 2;
        float[] fArr = this.f12594c;
        float f14 = fArr[i14];
        int i17 = 1;
        float f15 = fArr[i14 + 1];
        float f16 = fArr[i15];
        float f17 = fArr[i15 + 1];
        float f18 = fArr[i16];
        float f19 = fArr[i16 + 1];
        int i18 = i(i13);
        while (i18 != j11) {
            if (iArr[i18] != i17) {
                int i19 = sArr[i18] * 2;
                float f21 = fArr[i19];
                float f22 = fArr[i19 + i17];
                float f23 = f14;
                i12 = i17;
                float f24 = f18;
                float f25 = f19;
                int b11 = b(f24, f25, f23, f15, f21, f22);
                f18 = f24;
                f14 = f23;
                f19 = f25;
                f13 = f15;
                if (b11 >= 0) {
                    float f26 = f16;
                    float f27 = f17;
                    int b12 = b(f14, f13, f26, f27, f21, f22);
                    f11 = f26;
                    f12 = f27;
                    if (b12 >= 0 && b(f11, f12, f18, f19, f21, f22) >= 0) {
                        return false;
                    }
                } else {
                    f11 = f16;
                    f12 = f17;
                }
            } else {
                f11 = f16;
                f12 = f17;
                i12 = i17;
                f13 = f15;
            }
            i18 = i(i18);
            f15 = f13;
            f16 = f11;
            f17 = f12;
            i17 = i12;
        }
        return i17;
    }

    public final int i(int i11) {
        return (i11 + 1) % this.f12595d;
    }

    public final int j(int i11) {
        if (i11 == 0) {
            i11 = this.f12595d;
        }
        return i11 - 1;
    }

    public final void k() {
        int i11;
        int[] iArr = this.f12596e.f1639a;
        while (true) {
            i11 = this.f12595d;
            int i12 = 0;
            if (i11 <= 3) {
                break;
            }
            int g11 = g();
            f(g11);
            int j11 = j(g11);
            if (g11 != this.f12595d) {
                i12 = g11;
            }
            iArr[j11] = a(j11);
            iArr[i12] = a(i12);
        }
        if (i11 == 3) {
            t0 t0Var = this.f12597f;
            short[] sArr = this.f12593b;
            t0Var.b(sArr[0]);
            t0Var.b(sArr[1]);
            t0Var.b(sArr[2]);
        }
    }
}
