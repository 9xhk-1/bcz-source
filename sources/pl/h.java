package pl;

import a3.j0;
import a3.r;
import a3.t0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<r> f80819a = new com.badlogic.gdx.utils.a<>(false, 16);

    /* renamed from: b, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<t0> f80820b = new com.badlogic.gdx.utils.a<>(false, 16);

    /* renamed from: c, reason: collision with root package name */
    public final t0 f80821c = new t0();

    /* renamed from: d, reason: collision with root package name */
    public final a3.g f80822d = new a3.g();

    /* renamed from: e, reason: collision with root package name */
    public final t0 f80823e = new t0();

    /* renamed from: f, reason: collision with root package name */
    public final j0<r> f80824f = new a();

    /* renamed from: g, reason: collision with root package name */
    public final j0<t0> f80825g = new b();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends j0 {
        public a() {
        }

        @Override // a3.j0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public r g() {
            return new r(16);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends j0 {
        public b() {
        }

        @Override // a3.j0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public t0 g() {
            return new t0(16);
        }
    }

    public static boolean b(int i11, int i12, float[] fArr, short[] sArr) {
        int i13 = sArr[((i12 + i11) - 1) % i12] << 1;
        int i14 = sArr[i11] << 1;
        int i15 = sArr[(i11 + 1) % i12] << 1;
        return !c(fArr[i13], fArr[i13 + 1], fArr[i14], fArr[i14 + 1], fArr[i15], fArr[i15 + 1]);
    }

    public static boolean c(float f11, float f12, float f13, float f14, float f15, float f16) {
        return ((f11 * (f16 - f14)) + (f13 * (f12 - f16))) + (f15 * (f14 - f12)) >= 0.0f;
    }

    public static int e(float f11, float f12, float f13, float f14, float f15, float f16) {
        float f17 = f13 - f11;
        float f18 = f14 - f12;
        return (((f15 * f18) - (f16 * f17)) + (f17 * f12)) - (f11 * f18) >= 0.0f ? 1 : -1;
    }

    public com.badlogic.gdx.utils.a<r> a(r rVar, t0 t0Var) {
        t0[] t0VarArr;
        r[] rVarArr;
        int i11;
        int i12;
        int i13;
        int i14;
        float f11;
        float f12;
        float[] fArr = rVar.f1625a;
        com.badlogic.gdx.utils.a<r> aVar = this.f80819a;
        this.f80824f.e(aVar);
        aVar.clear();
        com.badlogic.gdx.utils.a<t0> aVar2 = this.f80820b;
        this.f80825g.e(aVar2);
        aVar2.clear();
        t0 h11 = this.f80825g.h();
        h11.j();
        r h12 = this.f80824f.h();
        h12.i();
        short[] sArr = t0Var.f1633a;
        int i15 = t0Var.f1634b;
        int i16 = -1;
        int i17 = 0;
        int i18 = 0;
        while (i17 < i15) {
            int i19 = sArr[i17] << 1;
            int i21 = sArr[i17 + 1] << 1;
            int i22 = sArr[i17 + 2] << 1;
            float f13 = fArr[i19];
            float f14 = fArr[i19 + 1];
            float[] fArr2 = fArr;
            float f15 = fArr2[i21];
            int i23 = i15;
            float f16 = fArr2[i21 + 1];
            float f17 = fArr2[i22];
            float f18 = fArr2[i22 + 1];
            short[] sArr2 = sArr;
            if (i16 == i19) {
                int i24 = h12.f1626b;
                int i25 = i24 - 4;
                float[] fArr3 = h12.f1625a;
                int e11 = e(fArr3[i25], fArr3[i24 - 3], fArr3[i24 - 2], fArr3[i24 - 1], f17, f18);
                int i26 = i16;
                int e12 = e(f17, f18, fArr3[0], fArr3[1], fArr3[2], fArr3[3]);
                i13 = i21;
                i14 = i17;
                f11 = f17;
                f12 = f18;
                if (e11 == i18 && e12 == i18) {
                    h12.a(f11);
                    h12.a(f12);
                    h11.a(i22);
                    i16 = i26;
                    i17 = i14 + 3;
                    fArr = fArr2;
                    i15 = i23;
                    sArr = sArr2;
                }
            } else {
                i13 = i21;
                i14 = i17;
                f11 = f17;
                f12 = f18;
            }
            if (h12.f1626b > 0) {
                aVar.a(h12);
                aVar2.a(h11);
                h12 = this.f80824f.h();
                h11 = this.f80825g.h();
            }
            h12.i();
            h12.a(f13);
            h12.a(f14);
            h12.a(f15);
            h12.a(f16);
            h12.a(f11);
            h12.a(f12);
            h11.j();
            h11.a(i19);
            h11.a(i13);
            h11.a(i22);
            i18 = e(f13, f14, f15, f16, f11, f12);
            i16 = i19;
            i17 = i14 + 3;
            fArr = fArr2;
            i15 = i23;
            sArr = sArr2;
        }
        int i27 = 1;
        int i28 = 3;
        if (h12.f1626b > 0) {
            aVar.a(h12);
            aVar2.a(h11);
        }
        t0[] t0VarArr2 = aVar2.f13178a;
        r[] rVarArr2 = aVar.f13178a;
        int i29 = aVar.f13179b;
        int i31 = 0;
        while (i31 < i29) {
            t0 t0Var2 = t0VarArr2[i31];
            if (t0Var2.f1634b != 0) {
                short m11 = t0Var2.m();
                short n11 = t0Var2.n(t0Var2.f1634b - 1);
                r rVar2 = rVarArr2[i31];
                int i32 = rVar2.f1626b;
                float[] fArr4 = rVar2.f1625a;
                float f19 = fArr4[i32 - 4];
                float f21 = fArr4[i32 - 3];
                float f22 = fArr4[i32 - 2];
                float f23 = fArr4[i32 - 1];
                float f24 = fArr4[0];
                float f25 = fArr4[i27];
                float f26 = fArr4[2];
                float f27 = fArr4[i28];
                int e13 = e(f19, f21, f22, f23, f24, f25);
                int i33 = 0;
                float f28 = f19;
                float f29 = f21;
                float f31 = f22;
                float f32 = f23;
                while (i33 < i29) {
                    if (i33 != i31) {
                        t0 t0Var3 = t0VarArr2[i33];
                        if (t0Var3.f1634b == i28) {
                            short m12 = t0Var3.m();
                            t0VarArr = t0VarArr2;
                            short n12 = t0Var3.n(i27);
                            rVarArr = rVarArr2;
                            short n13 = t0Var3.n(2);
                            r rVar3 = rVarArr[i33];
                            i11 = i29;
                            float n14 = rVar3.n(rVar3.f1626b - 2);
                            float n15 = rVar3.n(rVar3.f1626b - 1);
                            if (m12 == m11 && n12 == n11) {
                                int e14 = e(f28, f29, f31, f32, n14, n15);
                                float f33 = f24;
                                float f34 = f25;
                                int e15 = e(n14, n15, f33, f34, f26, f27);
                                i12 = i31;
                                f24 = f33;
                                f25 = f34;
                                if (e14 == e13 && e15 == e13) {
                                    rVar3.i();
                                    t0Var3.j();
                                    rVar2.a(n14);
                                    rVar2.a(n15);
                                    t0Var2.a(n13);
                                    i33 = 0;
                                    f28 = f31;
                                    f29 = f32;
                                    f32 = n15;
                                    f31 = n14;
                                }
                                i27 = 1;
                                i33++;
                                t0VarArr2 = t0VarArr;
                                rVarArr2 = rVarArr;
                                i29 = i11;
                                i31 = i12;
                                i28 = 3;
                            }
                            i12 = i31;
                            i27 = 1;
                            i33++;
                            t0VarArr2 = t0VarArr;
                            rVarArr2 = rVarArr;
                            i29 = i11;
                            i31 = i12;
                            i28 = 3;
                        }
                    }
                    t0VarArr = t0VarArr2;
                    rVarArr = rVarArr2;
                    i11 = i29;
                    i12 = i31;
                    i27 = 1;
                    i33++;
                    t0VarArr2 = t0VarArr;
                    rVarArr2 = rVarArr;
                    i29 = i11;
                    i31 = i12;
                    i28 = 3;
                }
            }
            i31++;
            t0VarArr2 = t0VarArr2;
            rVarArr2 = rVarArr2;
            i29 = i29;
            i28 = 3;
        }
        r[] rVarArr3 = rVarArr2;
        for (int i34 = aVar.f13179b - 1; i34 >= 0; i34--) {
            r rVar4 = rVarArr3[i34];
            if (rVar4.f1626b == 0) {
                aVar.A(i34);
                this.f80824f.d(rVar4);
                this.f80825g.d(aVar2.A(i34));
            }
        }
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v18, types: [int] */
    public t0 d(r rVar) {
        short s11;
        float f11;
        float f12;
        float[] fArr = rVar.f1625a;
        short s12 = 1;
        int i11 = rVar.f1626b >> 1;
        t0 t0Var = this.f80821c;
        t0Var.j();
        short[] I = t0Var.I(i11);
        for (short s13 = 0; s13 < i11; s13 = (short) (s13 + 1)) {
            I[s13] = s13;
        }
        a3.g gVar = this.f80822d;
        boolean[] z11 = gVar.z(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            z11[i12] = b(i12, i11, fArr, I);
        }
        t0 t0Var2 = this.f80823e;
        t0Var2.j();
        t0Var2.l(Math.max(0, i11 - 2) << 2);
        while (i11 > 3) {
            short s14 = s12;
            int i13 = i11 - 1;
            int i14 = 0;
            while (true) {
                if (!z11[i14]) {
                    int i15 = I[i13] << s12;
                    int i16 = I[i14] << s12;
                    int i17 = I[s14] << 1;
                    float f13 = fArr[i15];
                    float f14 = fArr[i15 + s12];
                    float f15 = fArr[i16];
                    float f16 = fArr[i16 + s12];
                    float f17 = fArr[i17];
                    float f18 = fArr[i17 + 1];
                    s11 = s12;
                    int i18 = (s14 + 1) % i11;
                    while (i18 != i13) {
                        if (z11[i18]) {
                            int i19 = I[i18] << 1;
                            float f19 = fArr[i19];
                            float f21 = fArr[i19 + 1];
                            float f22 = f13;
                            float f23 = f14;
                            float f24 = f17;
                            float f25 = f18;
                            boolean c11 = c(f24, f25, f22, f23, f19, f21);
                            f13 = f22;
                            f14 = f23;
                            f11 = f15;
                            f12 = f16;
                            if (c11 && c(f13, f14, f11, f12, f19, f21)) {
                                f17 = f24;
                                f18 = f25;
                                if (c(f11, f12, f17, f18, f19, f21)) {
                                }
                            } else {
                                f17 = f24;
                                f18 = f25;
                            }
                        } else {
                            f11 = f15;
                            f12 = f16;
                        }
                        i18 = (i18 + 1) % i11;
                        f15 = f11;
                        f16 = f12;
                    }
                    break;
                }
                s11 = s12;
                if (s14 == 0) {
                    while (z11[i14] && i14 - 1 > 0) {
                    }
                } else {
                    i13 = i14;
                    i14 = s14;
                    s14 = (s14 + 1) % i11;
                    s12 = s11;
                }
            }
            t0Var2.b(I[((i11 + i14) - 1) % i11]);
            t0Var2.b(I[i14]);
            t0Var2.b(I[(i14 + 1) % i11]);
            t0Var.C(i14);
            gVar.u(i14);
            i11--;
            int i21 = ((i11 + i14) - 1) % i11;
            if (i14 == i11) {
                i14 = 0;
            }
            z11[i21] = b(i21, i11, fArr, I);
            z11[i14] = b(i14, i11, fArr, I);
            s12 = s11;
        }
        short s15 = s12;
        if (i11 == 3) {
            t0Var2.b(I[2]);
            t0Var2.b(I[0]);
            t0Var2.b(I[s15]);
        }
        return t0Var2;
    }
}
