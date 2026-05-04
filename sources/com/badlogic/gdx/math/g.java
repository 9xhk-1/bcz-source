package com.badlogic.gdx.math;

import a3.t0;
import a3.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class g {

    /* renamed from: i, reason: collision with root package name */
    public static final float f12578i = 1.0E-6f;

    /* renamed from: j, reason: collision with root package name */
    public static final int f12579j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final int f12580k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static final int f12581l = 2;

    /* renamed from: b, reason: collision with root package name */
    public float[] f12583b;

    /* renamed from: a, reason: collision with root package name */
    public final v f12582a = new v();

    /* renamed from: c, reason: collision with root package name */
    public final t0 f12584c = new t0(false, 16);

    /* renamed from: d, reason: collision with root package name */
    public final t0 f12585d = new t0(false, 0);

    /* renamed from: e, reason: collision with root package name */
    public final v f12586e = new v();

    /* renamed from: f, reason: collision with root package name */
    public final a3.g f12587f = new a3.g(false, 16);

    /* renamed from: g, reason: collision with root package name */
    public final float[] f12588g = new float[6];

    /* renamed from: h, reason: collision with root package name */
    public final Vector2 f12589h = new Vector2();

    public final int a(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        float f19;
        float f21;
        float f22;
        float abs = Math.abs(f14 - f16);
        float abs2 = Math.abs(f16 - f18);
        if (abs >= 1.0E-6f) {
            float f23 = (-(f15 - f13)) / (f16 - f14);
            float f24 = (f13 + f15) / 2.0f;
            float f25 = (f14 + f16) / 2.0f;
            if (abs2 < 1.0E-6f) {
                f19 = (f17 + f15) / 2.0f;
            } else {
                float f26 = (-(f17 - f15)) / (f18 - f16);
                f19 = ((((f23 * f24) - (((f17 + f15) / 2.0f) * f26)) + ((f18 + f16) / 2.0f)) - f25) / (f23 - f26);
            }
            f21 = f25 + (f23 * (f19 - f24));
            f22 = f19;
        } else {
            if (abs2 < 1.0E-6f) {
                return 2;
            }
            f22 = (f13 + f15) / 2.0f;
            f21 = (((-(f17 - f15)) / (f18 - f16)) * (f22 - ((f17 + f15) / 2.0f))) + ((f18 + f16) / 2.0f);
        }
        float f27 = f15 - f22;
        float f28 = f16 - f21;
        float f29 = (f27 * f27) + (f28 * f28);
        float f31 = f11 - f22;
        float f32 = f31 * f31;
        float f33 = f12 - f21;
        if (((f33 * f33) + f32) - f29 <= 1.0E-6f) {
            return 0;
        }
        return (f11 <= f22 || f32 <= f29) ? 2 : 1;
    }

    public t0 b(a3.r rVar, boolean z11) {
        return c(rVar.f1625a, 0, rVar.f1626b, z11);
    }

    public t0 c(float[] fArr, int i11, int i12, boolean z11) {
        float[] fArr2;
        int i13;
        int i14;
        float[] fArr3;
        int i15;
        float[] fArr4;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i16;
        int i17;
        v vVar;
        float f17;
        short[] sArr;
        boolean[] zArr;
        int i18;
        if (i12 > 32767) {
            throw new IllegalArgumentException("count must be <= 32767");
        }
        t0 t0Var = this.f12584c;
        t0Var.j();
        if (i12 >= 6) {
            t0Var.l(i12);
            int i19 = 0;
            if (z11) {
                fArr2 = fArr;
                i13 = i11;
            } else {
                float[] fArr5 = this.f12583b;
                if (fArr5 == null || fArr5.length < i12) {
                    this.f12583b = new float[i12];
                }
                System.arraycopy(fArr, i11, this.f12583b, 0, i12);
                float[] fArr6 = this.f12583b;
                f(fArr6, i12);
                fArr2 = fArr6;
                i13 = 0;
            }
            int i21 = i13 + i12;
            float f18 = fArr2[0];
            boolean z12 = true;
            float f19 = fArr2[1];
            float f21 = f18;
            float f22 = f19;
            for (int i22 = i13 + 2; i22 < i21; i22 += 2) {
                float f23 = fArr2[i22];
                if (f23 < f21) {
                    f21 = f23;
                }
                if (f23 > f18) {
                    f18 = f23;
                }
                float f24 = fArr2[i22 + 1];
                if (f24 < f19) {
                    f19 = f24;
                }
                if (f24 > f22) {
                    f22 = f24;
                }
            }
            float f25 = f18 - f21;
            float f26 = f22 - f19;
            if (f25 <= f26) {
                f25 = f26;
            }
            float f27 = f25 * 20.0f;
            float f28 = (f18 + f21) / 2.0f;
            float f29 = (f22 + f19) / 2.0f;
            float[] fArr7 = this.f12588g;
            fArr7[0] = f28 - f27;
            float f31 = f29 - f27;
            fArr7[1] = f31;
            fArr7[2] = f28;
            fArr7[3] = f29 + f27;
            fArr7[4] = f28 + f27;
            fArr7[5] = f31;
            v vVar2 = this.f12586e;
            vVar2.k(i12 / 2);
            a3.g gVar = this.f12587f;
            gVar.i();
            gVar.j(i12);
            t0Var.a(i21);
            t0Var.a(i21 + 2);
            t0Var.a(i21 + 4);
            gVar.a(false);
            int i23 = i13;
            while (i23 < i21) {
                int i24 = i23;
                float f32 = fArr2[i24];
                float f33 = fArr2[i24 + 1];
                short[] sArr2 = t0Var.f1633a;
                boolean[] zArr2 = gVar.f1527a;
                int i25 = t0Var.f1634b - (z12 ? 1 : 0);
                while (i25 >= 0) {
                    int i26 = i25 / 3;
                    if (zArr2[i26]) {
                        i16 = i24;
                        sArr = sArr2;
                        zArr = zArr2;
                        i18 = i25;
                        fArr3 = fArr2;
                        i15 = i13;
                        i17 = i21;
                        fArr4 = fArr7;
                        vVar = vVar2;
                        f17 = f33;
                    } else {
                        boolean z13 = z12;
                        int i27 = i25 - 2;
                        fArr3 = fArr2;
                        short s11 = sArr2[i27];
                        i15 = i13;
                        short s12 = sArr2[i25 - 1];
                        fArr4 = fArr7;
                        short s13 = sArr2[i25];
                        if (s11 >= i21) {
                            int i28 = s11 - i21;
                            f11 = fArr4[i28];
                            f12 = fArr4[i28 + 1];
                        } else {
                            f11 = fArr3[s11];
                            f12 = fArr3[s11 + 1];
                        }
                        if (s12 >= i21) {
                            int i29 = s12 - i21;
                            f13 = fArr4[i29];
                            f14 = fArr4[i29 + 1];
                        } else {
                            f13 = fArr3[s12];
                            f14 = fArr3[s12 + 1];
                        }
                        if (s13 >= i21) {
                            int i31 = s13 - i21;
                            f15 = fArr4[i31];
                            f16 = fArr4[i31 + 1];
                        } else {
                            f15 = fArr3[s13];
                            f16 = fArr3[s13 + 1];
                        }
                        a3.g gVar2 = gVar;
                        i16 = i24;
                        i17 = i21;
                        float f34 = f12;
                        float f35 = f11;
                        vVar = vVar2;
                        f17 = f33;
                        sArr = sArr2;
                        zArr = zArr2;
                        i18 = i25;
                        int a11 = a(f32, f17, f35, f34, f13, f14, f15, f16);
                        if (a11 != 0) {
                            if (a11 == z13) {
                                zArr[i26] = z13;
                            }
                            gVar = gVar2;
                        } else {
                            vVar.d(s11, s12, s12, s13);
                            vVar.b(s13, s11);
                            t0Var.D(i27, i18);
                            gVar = gVar2;
                            gVar.u(i26);
                        }
                    }
                    i25 = i18 - 3;
                    fArr2 = fArr3;
                    f33 = f17;
                    vVar2 = vVar;
                    fArr7 = fArr4;
                    i13 = i15;
                    sArr2 = sArr;
                    zArr2 = zArr;
                    i21 = i17;
                    i24 = i16;
                    z12 = true;
                }
                int i32 = i24;
                float[] fArr8 = fArr2;
                int i33 = i13;
                int i34 = i21;
                float[] fArr9 = fArr7;
                v vVar3 = vVar2;
                int[] iArr = vVar3.f1639a;
                int i35 = vVar3.f1640b;
                int i36 = 0;
                while (i36 < i35) {
                    int i37 = iArr[i36];
                    if (i37 != -1) {
                        int i38 = i36 + 1;
                        int i39 = iArr[i38];
                        boolean z14 = false;
                        for (int i41 = i36 + 2; i41 < i35; i41 += 2) {
                            if (i37 == iArr[i41 + 1] && i39 == iArr[i41]) {
                                iArr[i41] = -1;
                                z14 = true;
                            }
                        }
                        if (!z14) {
                            t0Var.a(i37);
                            t0Var.a(iArr[i38]);
                            i14 = i32;
                            t0Var.a(i14);
                            gVar.a(false);
                            i36 += 2;
                            i32 = i14;
                        }
                    }
                    i14 = i32;
                    i36 += 2;
                    i32 = i14;
                }
                vVar3.i();
                i23 = i32 + 2;
                fArr2 = fArr8;
                i19 = 0;
                vVar2 = vVar3;
                fArr7 = fArr9;
                i13 = i33;
                i21 = i34;
                z12 = true;
            }
            int i42 = i19;
            int i43 = i13;
            int i44 = i21;
            short[] sArr3 = t0Var.f1633a;
            int i45 = t0Var.f1634b - 1;
            while (i45 >= 0) {
                int i46 = i44;
                if (sArr3[i45] >= i46 || sArr3[i45 - 1] >= i46 || sArr3[i45 - 2] >= i46) {
                    t0Var.C(i45);
                    t0Var.C(i45 - 1);
                    t0Var.C(i45 - 2);
                }
                i45 -= 3;
                i44 = i46;
            }
            if (!z11) {
                short[] sArr4 = this.f12585d.f1633a;
                int i47 = t0Var.f1634b;
                for (int i48 = i42; i48 < i47; i48++) {
                    sArr3[i48] = (short) (sArr4[sArr3[i48] / 2] * 2);
                }
            }
            if (i43 == 0) {
                int i49 = t0Var.f1634b;
                for (int i51 = i42; i51 < i49; i51++) {
                    sArr3[i51] = (short) (sArr3[i51] / 2);
                }
            } else {
                int i52 = t0Var.f1634b;
                for (int i53 = i42; i53 < i52; i53++) {
                    sArr3[i53] = (short) ((sArr3[i53] - i43) / 2);
                }
            }
        }
        return t0Var;
    }

    public t0 d(float[] fArr, boolean z11) {
        return c(fArr, 0, fArr.length, z11);
    }

    public final int e(float[] fArr, int i11, int i12, short[] sArr) {
        float f11;
        float f12 = fArr[i11];
        int i13 = i11 + 2;
        while (i13 < i12) {
            while (i13 < i12 && fArr[i13] <= f12) {
                i13 += 2;
            }
            while (true) {
                f11 = fArr[i12];
                if (f11 <= f12) {
                    break;
                }
                i12 -= 2;
            }
            if (i13 < i12) {
                float f13 = fArr[i13];
                fArr[i13] = f11;
                fArr[i12] = f13;
                int i14 = i13 + 1;
                float f14 = fArr[i14];
                int i15 = i12 + 1;
                fArr[i14] = fArr[i15];
                fArr[i15] = f14;
                int i16 = i13 / 2;
                short s11 = sArr[i16];
                int i17 = i12 / 2;
                sArr[i16] = sArr[i17];
                sArr[i17] = s11;
            }
        }
        float f15 = fArr[i12];
        if (f12 > f15) {
            fArr[i11] = f15;
            fArr[i12] = f12;
            int i18 = i11 + 1;
            float f16 = fArr[i18];
            int i19 = i12 + 1;
            fArr[i18] = fArr[i19];
            fArr[i19] = f16;
            int i21 = i11 / 2;
            short s12 = sArr[i21];
            int i22 = i12 / 2;
            sArr[i21] = sArr[i22];
            sArr[i22] = s12;
        }
        return i12;
    }

    public final void f(float[] fArr, int i11) {
        int i12 = i11 / 2;
        this.f12585d.j();
        this.f12585d.l(i12);
        short[] sArr = this.f12585d.f1633a;
        for (short s11 = 0; s11 < i12; s11 = (short) (s11 + 1)) {
            sArr[s11] = s11;
        }
        v vVar = this.f12582a;
        vVar.a(0);
        vVar.a(i11 - 2);
        while (vVar.f1640b > 0) {
            int y11 = vVar.y();
            int y12 = vVar.y();
            if (y11 > y12) {
                int e11 = e(fArr, y12, y11, sArr);
                int i13 = e11 - y12;
                int i14 = y11 - e11;
                if (i13 > i14) {
                    vVar.a(y12);
                    vVar.a(e11 - 2);
                }
                vVar.a(e11 + 2);
                vVar.a(y11);
                if (i14 >= i13) {
                    vVar.a(y12);
                    vVar.a(e11 - 2);
                }
            }
        }
    }

    public void g(t0 t0Var, float[] fArr, float[] fArr2, int i11, int i12) {
        short[] sArr = t0Var.f1633a;
        for (int i13 = t0Var.f1634b - 1; i13 >= 0; i13 -= 3) {
            int i14 = i13 - 2;
            int i15 = sArr[i14] * 2;
            int i16 = i13 - 1;
            int i17 = sArr[i16] * 2;
            int i18 = sArr[i13] * 2;
            k.r(fArr[i15], fArr[i15 + 1], fArr[i17], fArr[i17 + 1], fArr[i18], fArr[i18 + 1], this.f12589h);
            Vector2 vector2 = this.f12589h;
            if (!m.Q(fArr2, i11, i12, vector2.f12535x, vector2.f12536y)) {
                t0Var.C(i13);
                t0Var.C(i16);
                t0Var.C(i14);
            }
        }
    }
}
