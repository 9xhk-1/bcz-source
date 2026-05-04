package pl;

import a3.r;
import a3.t0;
import com.badlogic.gdx.utils.a;
import jl.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final h f80794a = new h();

    /* renamed from: b, reason: collision with root package name */
    public final r f80795b = new r();

    /* renamed from: c, reason: collision with root package name */
    public final r f80796c = new r(128);

    /* renamed from: d, reason: collision with root package name */
    public final r f80797d = new r(128);

    /* renamed from: e, reason: collision with root package name */
    public final r f80798e = new r(128);

    /* renamed from: f, reason: collision with root package name */
    public final t0 f80799f = new t0(128);

    /* renamed from: g, reason: collision with root package name */
    public final r f80800g = new r();

    /* renamed from: h, reason: collision with root package name */
    public ol.e f80801h;

    /* renamed from: i, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<r> f80802i;

    public static void l(r rVar) {
        float[] fArr = rVar.f1625a;
        int i11 = rVar.f1626b;
        int i12 = i11 - 2;
        float f11 = (fArr[i12] * fArr[1]) - (fArr[0] * fArr[i11 - 1]);
        int i13 = i11 - 3;
        int i14 = 0;
        while (i14 < i13) {
            int i15 = i14 + 2;
            f11 += (fArr[i14] * fArr[i14 + 3]) - (fArr[i15] * fArr[i14 + 1]);
            i14 = i15;
        }
        if (f11 < 0.0f) {
            return;
        }
        int i16 = i11 >> 1;
        for (int i17 = 0; i17 < i16; i17 += 2) {
            float f12 = fArr[i17];
            int i18 = i17 + 1;
            float f13 = fArr[i18];
            int i19 = i12 - i17;
            fArr[i17] = fArr[i19];
            int i21 = i19 + 1;
            fArr[i18] = fArr[i21];
            fArr[i19] = f12;
            fArr[i21] = f13;
        }
    }

    public boolean a(float f11, float f12, float f13, float f14, float f15, float f16, r rVar, r rVar2) {
        r rVar3;
        r rVar4;
        char c11 = 2;
        if (rVar.f1626b % 4 >= 2) {
            rVar4 = this.f80800g;
            rVar3 = rVar2;
        } else {
            rVar3 = this.f80800g;
            rVar4 = rVar2;
        }
        rVar3.i();
        rVar3.a(f11);
        rVar3.a(f12);
        rVar3.a(f13);
        rVar3.a(f14);
        rVar3.a(f15);
        rVar3.a(f16);
        rVar3.a(f11);
        rVar3.a(f12);
        rVar4.i();
        int i11 = rVar.f1626b - 4;
        float[] fArr = rVar.f1625a;
        r rVar5 = rVar4;
        r rVar6 = rVar3;
        r rVar7 = rVar5;
        int i12 = 0;
        boolean z11 = false;
        while (true) {
            float f17 = fArr[i12];
            float f18 = fArr[i12 + 1];
            int i13 = i12 + 2;
            float f19 = f17 - fArr[i13];
            float f21 = f18 - fArr[i12 + 3];
            int i14 = rVar7.f1626b;
            char c12 = c11;
            float[] fArr2 = rVar6.f1625a;
            int i15 = rVar6.f1626b - 2;
            int i16 = 0;
            while (i16 < i15) {
                float f22 = fArr2[i16];
                float f23 = fArr2[i16 + 1];
                int i17 = i16 + 2;
                int i18 = i16;
                float f24 = fArr2[i17];
                int i19 = i18 + 3;
                float[] fArr3 = fArr;
                float f25 = fArr2[i19];
                boolean z12 = (f17 - f24) * f21 > (f18 - f25) * f19;
                float f26 = ((f17 - f22) * f21) - ((f18 - f23) * f19);
                if (f26 > 0.0f) {
                    if (z12) {
                        rVar7.a(f24);
                        rVar7.a(f25);
                    } else {
                        float f27 = f24 - f22;
                        float f28 = f25 - f23;
                        float f29 = f26 / ((f27 * f21) - (f28 * f19));
                        if (f29 < 0.0f || f29 > 1.0f) {
                            rVar7.a(f24);
                            rVar7.a(f25);
                        } else {
                            rVar7.a(f22 + (f27 * f29));
                            rVar7.a(f23 + (f28 * f29));
                            fArr = fArr3;
                            z11 = true;
                        }
                    }
                    fArr = fArr3;
                } else {
                    if (z12) {
                        float f31 = f24 - f22;
                        float f32 = f25 - f23;
                        float f33 = f26 / ((f31 * f21) - (f32 * f19));
                        if (f33 < 0.0f || f33 > 1.0f) {
                            rVar7.a(f24);
                            rVar7.a(f25);
                            fArr = fArr3;
                        } else {
                            rVar7.a(f22 + (f31 * f33));
                            rVar7.a(f23 + (f32 * f33));
                            rVar7.a(f24);
                            rVar7.a(f25);
                        }
                    }
                    fArr = fArr3;
                    z11 = true;
                }
                i16 = i17;
            }
            float[] fArr4 = fArr;
            if (i14 == rVar7.f1626b) {
                rVar2.i();
                return true;
            }
            rVar7.a(rVar7.f1625a[0]);
            rVar7.a(rVar7.f1625a[1]);
            if (i12 == i11) {
                if (rVar2 == rVar7) {
                    rVar2.I(rVar2.f1626b - 2);
                    return z11;
                }
                rVar2.i();
                rVar2.h(rVar7.f1625a, 0, rVar7.f1626b - 2);
                return z11;
            }
            rVar6.i();
            r rVar8 = rVar6;
            rVar6 = rVar7;
            rVar7 = rVar8;
            fArr = fArr4;
            i12 = i13;
            c11 = c12;
        }
    }

    public void b() {
        if (this.f80801h == null) {
            return;
        }
        this.f80801h = null;
        this.f80802i = null;
        this.f80797d.i();
        this.f80798e.i();
        this.f80799f.j();
        this.f80795b.i();
    }

    public void c(m mVar) {
        ol.e eVar = this.f80801h;
        if (eVar == null || eVar.v() != mVar.e()) {
            return;
        }
        b();
    }

    public void d(m mVar, ol.e eVar) {
        int o11;
        if (this.f80801h == null && (o11 = eVar.o()) >= 6) {
            this.f80801h = eVar;
            eVar.j(mVar, 0, o11, this.f80795b.I(o11), 0, 2);
            l(this.f80795b);
            com.badlogic.gdx.utils.a<r> a11 = this.f80794a.a(this.f80795b, this.f80794a.d(this.f80795b));
            this.f80802i = a11;
            a.b<r> it = a11.iterator();
            while (it.hasNext()) {
                r next = it.next();
                l(next);
                next.a(next.f1625a[0]);
                next.a(next.f1625a[1]);
            }
        }
    }

    public void e(float[] fArr, short[] sArr, int i11) {
        float f11;
        c cVar = this;
        r rVar = cVar.f80796c;
        r rVar2 = cVar.f80797d;
        t0 t0Var = cVar.f80799f;
        com.badlogic.gdx.utils.a<r> aVar = cVar.f80802i;
        r[] rVarArr = aVar.f13178a;
        int i12 = aVar.f13179b;
        rVar2.i();
        cVar.f80798e.i();
        t0Var.j();
        short s11 = 0;
        int i13 = 0;
        while (i13 < i11) {
            int i14 = sArr[i13] << 1;
            short s12 = s11;
            float f12 = fArr[i14];
            float f13 = fArr[i14 + 1];
            int i15 = sArr[i13 + 1] << 1;
            float f14 = fArr[i15];
            float f15 = fArr[i15 + 1];
            int i16 = sArr[i13 + 2] << 1;
            float f16 = fArr[i16];
            float f17 = fArr[i16 + 1];
            short s13 = s12;
            int i17 = 0;
            while (true) {
                if (i17 >= i12) {
                    s11 = s13;
                    break;
                }
                int i18 = rVar2.f1626b;
                int i19 = i17;
                if (!cVar.a(f12, f13, f14, f15, f16, f17, rVarArr[i17], rVar)) {
                    float[] I = rVar2.I(i18 + 6);
                    I[i18] = f12;
                    I[i18 + 1] = f13;
                    I[i18 + 2] = f14;
                    I[i18 + 3] = f15;
                    I[i18 + 4] = f16;
                    I[i18 + 5] = f17;
                    int i21 = t0Var.f1634b;
                    short[] I2 = t0Var.I(i21 + 3);
                    I2[i21] = s13;
                    I2[i21 + 1] = (short) (s13 + 1);
                    I2[i21 + 2] = (short) (s13 + 2);
                    s11 = (short) (s13 + 3);
                    break;
                }
                int i22 = rVar.f1626b;
                if (i22 == 0) {
                    f11 = f12;
                } else {
                    int i23 = i22 >> 1;
                    f11 = f12;
                    float[] fArr2 = rVar.f1625a;
                    float[] I3 = rVar2.I(i18 + (i23 * 2));
                    int i24 = 0;
                    while (i24 < i22) {
                        float f18 = fArr2[i24];
                        float f19 = fArr2[i24 + 1];
                        I3[i18] = f18;
                        I3[i18 + 1] = f19;
                        i24 += 2;
                        i18 += 2;
                    }
                    int i25 = t0Var.f1634b;
                    short[] I4 = t0Var.I(((i23 - 2) * 3) + i25);
                    int i26 = i23 - 1;
                    int i27 = i25;
                    int i28 = 1;
                    while (i28 < i26) {
                        I4[i27] = s13;
                        int i29 = i28;
                        int i31 = s13 + i29;
                        short[] sArr2 = I4;
                        sArr2[i27 + 1] = (short) i31;
                        sArr2[i27 + 2] = (short) (i31 + 1);
                        i27 += 3;
                        I4 = sArr2;
                        i28 = i29 + 1;
                    }
                    s13 = (short) (s13 + i23);
                }
                i17 = i19 + 1;
                cVar = this;
                f12 = f11;
            }
            i13 += 3;
            cVar = this;
        }
    }

    public void f(float[] fArr, short[] sArr, int i11, float[] fArr2, float f11, float f12, boolean z11) {
        float f13;
        int i12;
        c cVar = this;
        r rVar = cVar.f80796c;
        r rVar2 = cVar.f80797d;
        t0 t0Var = cVar.f80799f;
        com.badlogic.gdx.utils.a<r> aVar = cVar.f80802i;
        r[] rVarArr = aVar.f13178a;
        int i13 = aVar.f13179b;
        int i14 = z11 ? 6 : 5;
        rVar2.i();
        cVar.f80798e.i();
        t0Var.j();
        int i15 = 0;
        short s11 = 0;
        while (i15 < i11) {
            int i16 = sArr[i15] << 1;
            int i17 = i15;
            float f14 = fArr[i16];
            int i18 = i16 + 1;
            short s12 = s11;
            float f15 = fArr[i18];
            float f16 = fArr2[i16];
            float f17 = fArr2[i18];
            int i19 = sArr[i17 + 1] << 1;
            float f18 = fArr[i19];
            int i21 = i19 + 1;
            float f19 = fArr[i21];
            float f21 = fArr2[i19];
            float f22 = fArr2[i21];
            int i22 = sArr[i17 + 2] << 1;
            float f23 = fArr[i22];
            int i23 = i22 + 1;
            short s13 = s12;
            float f24 = fArr[i23];
            float f25 = fArr2[i22];
            float f26 = fArr2[i23];
            int i24 = 0;
            while (true) {
                if (i24 >= i13) {
                    s11 = s13;
                    break;
                }
                int i25 = rVar2.f1626b;
                int i26 = i24;
                if (cVar.a(f14, f15, f18, f19, f23, f24, rVarArr[i24], rVar)) {
                    int i27 = rVar.f1626b;
                    if (i27 == 0) {
                        f13 = f14;
                    } else {
                        float f27 = f19 - f24;
                        float f28 = f23 - f18;
                        float f29 = f14 - f23;
                        float f31 = f24 - f15;
                        float f32 = 1.0f / ((f27 * f29) + ((f15 - f24) * f28));
                        int i28 = i27 >> 1;
                        f13 = f14;
                        float[] fArr3 = rVar.f1625a;
                        float[] I = rVar2.I(i25 + (i28 * i14));
                        int i29 = 0;
                        while (i29 < i27) {
                            float f33 = fArr3[i29];
                            float f34 = fArr3[i29 + 1];
                            I[i25] = f33;
                            I[i25 + 1] = f34;
                            I[i25 + 2] = f11;
                            if (z11) {
                                I[i25 + 3] = f12;
                                i12 = i25 + 4;
                            } else {
                                i12 = i25 + 3;
                            }
                            float f35 = f33 - f23;
                            float f36 = f34 - f24;
                            float f37 = ((f27 * f35) + (f28 * f36)) * f32;
                            float f38 = ((f35 * f31) + (f36 * f29)) * f32;
                            float f39 = (1.0f - f37) - f38;
                            I[i12] = (f16 * f37) + (f21 * f38) + (f25 * f39);
                            I[i12 + 1] = (f37 * f17) + (f38 * f22) + (f39 * f26);
                            i29 += 2;
                            i25 = i12 + 2;
                        }
                        int i31 = t0Var.f1634b;
                        short[] I2 = t0Var.I(((i28 - 2) * 3) + i31);
                        int i32 = i28 - 1;
                        int i33 = 1;
                        while (i33 < i32) {
                            I2[i31] = s13;
                            int i34 = i31 + 1;
                            int i35 = i31;
                            int i36 = s13 + i33;
                            short[] sArr2 = I2;
                            sArr2[i34] = (short) i36;
                            sArr2[i35 + 2] = (short) (i36 + 1);
                            i33++;
                            i31 = i35 + 3;
                            I2 = sArr2;
                        }
                        s13 = (short) (s13 + i28);
                    }
                    i24 = i26 + 1;
                    cVar = this;
                    f14 = f13;
                } else {
                    float[] I3 = rVar2.I((i14 * 3) + i25);
                    I3[i25] = f14;
                    I3[i25 + 1] = f15;
                    I3[i25 + 2] = f11;
                    if (z11) {
                        I3[i25 + 3] = f12;
                        I3[i25 + 4] = f16;
                        I3[i25 + 5] = f17;
                        I3[i25 + 6] = f18;
                        I3[i25 + 7] = f19;
                        I3[i25 + 8] = f11;
                        I3[i25 + 9] = f12;
                        I3[i25 + 10] = f21;
                        I3[i25 + 11] = f22;
                        I3[i25 + 12] = f23;
                        I3[i25 + 13] = f24;
                        I3[i25 + 14] = f11;
                        I3[i25 + 15] = f12;
                        I3[i25 + 16] = f25;
                        I3[i25 + 17] = f26;
                    } else {
                        I3[i25 + 3] = f16;
                        I3[i25 + 4] = f17;
                        I3[i25 + 5] = f18;
                        I3[i25 + 6] = f19;
                        I3[i25 + 7] = f11;
                        I3[i25 + 8] = f21;
                        I3[i25 + 9] = f22;
                        I3[i25 + 10] = f23;
                        I3[i25 + 11] = f24;
                        I3[i25 + 12] = f11;
                        I3[i25 + 13] = f25;
                        I3[i25 + 14] = f26;
                    }
                    int i37 = t0Var.f1634b;
                    short[] I4 = t0Var.I(i37 + 3);
                    I4[i37] = s13;
                    I4[i37 + 1] = (short) (s13 + 1);
                    I4[i37 + 2] = (short) (s13 + 2);
                    s11 = (short) (s13 + 3);
                }
            }
            i15 = i17 + 3;
            cVar = this;
        }
    }

    public void g(float[] fArr, int i11, short[] sArr, int i12, float[] fArr2) {
        float f11;
        c cVar = this;
        r rVar = cVar.f80796c;
        r rVar2 = cVar.f80797d;
        r rVar3 = cVar.f80798e;
        t0 t0Var = cVar.f80799f;
        com.badlogic.gdx.utils.a<r> aVar = cVar.f80802i;
        r[] rVarArr = aVar.f13178a;
        int i13 = aVar.f13179b;
        rVar2.i();
        rVar3.i();
        t0Var.j();
        int i14 = 0;
        short s11 = 0;
        while (i14 < i12) {
            int i15 = sArr[i14] << 1;
            int i16 = i11 + i15;
            int i17 = i14;
            float f12 = fArr[i16];
            float f13 = fArr[i16 + 1];
            float f14 = fArr2[i15];
            float f15 = fArr2[i15 + 1];
            int i18 = sArr[i17 + 1] << 1;
            int i19 = i11 + i18;
            float f16 = fArr[i19];
            float f17 = fArr[i19 + 1];
            float f18 = fArr2[i18];
            float f19 = fArr2[i18 + 1];
            int i21 = sArr[i17 + 2] << 1;
            int i22 = i11 + i21;
            float f21 = fArr[i22];
            float f22 = fArr[i22 + 1];
            float f23 = fArr2[i21];
            float f24 = fArr2[i21 + 1];
            short s12 = s11;
            int i23 = 0;
            while (true) {
                if (i23 >= i13) {
                    s11 = s12;
                    break;
                }
                int i24 = rVar2.f1626b;
                r rVar4 = rVarArr[i23];
                int i25 = i23;
                float f25 = f13;
                float f26 = f17;
                float f27 = f22;
                int i26 = i24;
                if (!cVar.a(f12, f25, f16, f26, f21, f27, rVar4, rVar)) {
                    float f28 = f12;
                    int i27 = i26 + 6;
                    float[] I = rVar2.I(i27);
                    float[] I2 = rVar3.I(i27);
                    I[i26] = f28;
                    int i28 = i26 + 1;
                    I[i28] = f25;
                    int i29 = i26 + 2;
                    I[i29] = f16;
                    int i31 = i26 + 3;
                    I[i31] = f26;
                    int i32 = i26 + 4;
                    I[i32] = f21;
                    int i33 = i26 + 5;
                    I[i33] = f27;
                    I2[i26] = f14;
                    I2[i28] = f15;
                    I2[i29] = f18;
                    I2[i31] = f19;
                    I2[i32] = f23;
                    I2[i33] = f24;
                    int i34 = t0Var.f1634b;
                    short[] I3 = t0Var.I(i34 + 3);
                    I3[i34] = s12;
                    I3[i34 + 1] = (short) (s12 + 1);
                    I3[i34 + 2] = (short) (s12 + 2);
                    s11 = (short) (s12 + 3);
                    break;
                }
                int i35 = rVar.f1626b;
                if (i35 == 0) {
                    f11 = f12;
                } else {
                    float f29 = f26 - f27;
                    float f31 = f21 - f16;
                    float f32 = f12 - f21;
                    float f33 = f27 - f25;
                    float f34 = 1.0f / ((f29 * f32) + ((f25 - f27) * f31));
                    int i36 = i35 >> 1;
                    float[] fArr3 = rVar.f1625a;
                    f11 = f12;
                    int i37 = i26 + (i36 * 2);
                    float[] I4 = rVar2.I(i37);
                    float[] I5 = rVar3.I(i37);
                    int i38 = 0;
                    while (i38 < i35) {
                        float f35 = fArr3[i38];
                        float f36 = fArr3[i38 + 1];
                        I4[i26] = f35;
                        int i39 = i26 + 1;
                        I4[i39] = f36;
                        float f37 = f35 - f21;
                        float f38 = f36 - f27;
                        float f39 = ((f29 * f37) + (f31 * f38)) * f34;
                        float f41 = ((f37 * f33) + (f38 * f32)) * f34;
                        float f42 = (1.0f - f39) - f41;
                        I5[i26] = (f14 * f39) + (f18 * f41) + (f23 * f42);
                        I5[i39] = (f39 * f15) + (f41 * f19) + (f42 * f24);
                        i38 += 2;
                        i26 += 2;
                    }
                    int i41 = t0Var.f1634b;
                    short[] I6 = t0Var.I(((i36 - 2) * 3) + i41);
                    int i42 = i36 - 1;
                    int i43 = 1;
                    while (i43 < i42) {
                        I6[i41] = s12;
                        int i44 = i41 + 1;
                        int i45 = i41;
                        int i46 = s12 + i43;
                        short[] sArr2 = I6;
                        sArr2[i44] = (short) i46;
                        sArr2[i45 + 2] = (short) (i46 + 1);
                        i43++;
                        i41 = i45 + 3;
                        I6 = sArr2;
                    }
                    s12 = (short) (s12 + i36);
                }
                f22 = f27;
                f12 = f11;
                f17 = f26;
                f13 = f25;
                i23 = i25 + 1;
                cVar = this;
            }
            i14 = i17 + 3;
            cVar = this;
        }
    }

    public t0 h() {
        return this.f80799f;
    }

    public r i() {
        return this.f80798e;
    }

    public r j() {
        return this.f80797d;
    }

    public boolean k() {
        return this.f80801h != null;
    }
}
