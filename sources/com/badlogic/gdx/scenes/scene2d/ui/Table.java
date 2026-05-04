package com.badlogic.gdx.scenes.scene2d.ui;

import a3.j0;
import a3.l0;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.ui.c0;
import com.badlogic.gdx.scenes.scene2d.ui.k;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class Table extends f0 {

    /* renamed from: s1, reason: collision with root package name */
    public static float[] f12812s1;

    /* renamed from: t1, reason: collision with root package name */
    public static float[] f12813t1;
    public int E;
    public int F;
    public boolean G;
    public final com.badlogic.gdx.utils.a<com.badlogic.gdx.scenes.scene2d.ui.c> H;
    public final com.badlogic.gdx.scenes.scene2d.ui.c I;
    public final com.badlogic.gdx.utils.a<com.badlogic.gdx.scenes.scene2d.ui.c> J;
    public com.badlogic.gdx.scenes.scene2d.ui.c K;
    public boolean L;
    public float[] M;
    public float[] N;
    public float[] O;
    public float[] P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public float[] U;
    public float[] V;
    public float[] W;
    public float[] X;
    public c0 Y;
    public c0 Z;

    /* renamed from: f0, reason: collision with root package name */
    public c0 f12818f0;

    /* renamed from: f1, reason: collision with root package name */
    public c0 f12819f1;

    /* renamed from: h1, reason: collision with root package name */
    public int f12820h1;

    /* renamed from: i1, reason: collision with root package name */
    public Debug f12821i1;

    /* renamed from: j1, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<DebugRect> f12822j1;

    /* renamed from: k1, reason: collision with root package name */
    @a3.d0
    public z2.k f12823k1;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f12824l1;

    /* renamed from: m1, reason: collision with root package name */
    @a3.d0
    public q f12825m1;

    /* renamed from: n1, reason: collision with root package name */
    public boolean f12826n1;

    /* renamed from: o1, reason: collision with root package name */
    public static com.badlogic.gdx.graphics.b f12808o1 = new com.badlogic.gdx.graphics.b(0.0f, 0.0f, 1.0f, 1.0f);

    /* renamed from: p1, reason: collision with root package name */
    public static com.badlogic.gdx.graphics.b f12809p1 = new com.badlogic.gdx.graphics.b(1.0f, 0.0f, 0.0f, 1.0f);

    /* renamed from: q1, reason: collision with root package name */
    public static com.badlogic.gdx.graphics.b f12810q1 = new com.badlogic.gdx.graphics.b(0.0f, 1.0f, 0.0f, 1.0f);

    /* renamed from: r1, reason: collision with root package name */
    public static final j0<com.badlogic.gdx.scenes.scene2d.ui.c> f12811r1 = new a();

    /* renamed from: u1, reason: collision with root package name */
    public static c0 f12814u1 = new b();

    /* renamed from: v1, reason: collision with root package name */
    public static c0 f12815v1 = new c();

    /* renamed from: w1, reason: collision with root package name */
    public static c0 f12816w1 = new d();

    /* renamed from: x1, reason: collision with root package name */
    public static c0 f12817x1 = new e();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Debug {
        none,
        all,
        table,
        cell,
        actor
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DebugRect extends Rectangle {
        static j0<DebugRect> pool = l0.d(DebugRect.class);
        com.badlogic.gdx.graphics.b color;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends j0<com.badlogic.gdx.scenes.scene2d.ui.c> {
        @Override // a3.j0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public com.badlogic.gdx.scenes.scene2d.ui.c g() {
            return new com.badlogic.gdx.scenes.scene2d.ui.c();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends c0 {
        @Override // com.badlogic.gdx.scenes.scene2d.ui.c0
        public float b(@a3.d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
            z2.k kVar = ((Table) aVar).f12823k1;
            if (kVar == null) {
                return 0.0f;
            }
            return kVar.w();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends c0 {
        @Override // com.badlogic.gdx.scenes.scene2d.ui.c0
        public float b(@a3.d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
            z2.k kVar = ((Table) aVar).f12823k1;
            if (kVar == null) {
                return 0.0f;
            }
            return kVar.z();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends c0 {
        @Override // com.badlogic.gdx.scenes.scene2d.ui.c0
        public float b(@a3.d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
            z2.k kVar = ((Table) aVar).f12823k1;
            if (kVar == null) {
                return 0.0f;
            }
            return kVar.s();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends c0 {
        @Override // com.badlogic.gdx.scenes.scene2d.ui.c0
        public float b(@a3.d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
            z2.k kVar = ((Table) aVar).f12823k1;
            if (kVar == null) {
                return 0.0f;
            }
            return kVar.u();
        }
    }

    public Table() {
        this(null);
    }

    private void Z3() {
        this.L = false;
        com.badlogic.gdx.utils.a<com.badlogic.gdx.scenes.scene2d.ui.c> aVar = this.H;
        com.badlogic.gdx.scenes.scene2d.ui.c[] cVarArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        if (i11 > 0 && !cVarArr[i11 - 1].C) {
            j4();
            this.G = true;
        }
        int i12 = this.E;
        int i13 = this.F;
        float[] k42 = k4(this.M, i12);
        this.M = k42;
        float[] k43 = k4(this.N, i13);
        this.N = k43;
        float[] k44 = k4(this.O, i12);
        this.O = k44;
        float[] k45 = k4(this.P, i13);
        this.P = k45;
        this.U = k4(this.U, i12);
        this.V = k4(this.V, i13);
        float[] k46 = k4(this.W, i12);
        this.W = k46;
        float[] k47 = k4(this.X, i13);
        this.X = k47;
        int i14 = 0;
        float f11 = 0.0f;
        while (i14 < i11) {
            com.badlogic.gdx.scenes.scene2d.ui.c cVar = cVarArr[i14];
            int i15 = cVar.D;
            int i16 = cVar.E;
            com.badlogic.gdx.scenes.scene2d.ui.c[] cVarArr2 = cVarArr;
            int intValue = cVar.f12893t.intValue();
            float[] fArr = k42;
            com.badlogic.gdx.scenes.scene2d.a aVar2 = cVar.f12896w;
            float[] fArr2 = k43;
            if (cVar.f12892s.intValue() != 0 && k47[i16] == 0.0f) {
                k47[i16] = cVar.f12892s.intValue();
            }
            if (intValue == 1 && cVar.f12891r.intValue() != 0 && k46[i15] == 0.0f) {
                k46[i15] = cVar.f12891r.intValue();
            }
            cVar.H = cVar.f12885l.b(aVar2) + (i15 == 0 ? 0.0f : Math.max(0.0f, cVar.f12881h.b(aVar2) - f11));
            float b11 = cVar.f12884k.b(aVar2);
            cVar.G = b11;
            int i17 = cVar.F;
            if (i17 != -1) {
                cVar.G = b11 + Math.max(0.0f, cVar.f12880g.b(aVar2) - cVarArr2[i17].f12882i.b(aVar2));
            }
            f11 = cVar.f12883j.b(aVar2);
            cVar.J = cVar.f12887n.b(aVar2) + (i15 + intValue == i12 ? 0.0f : f11);
            cVar.I = cVar.f12886m.b(aVar2) + (i16 == i13 + (-1) ? 0.0f : cVar.f12882i.b(aVar2));
            float b12 = cVar.f12876c.b(aVar2);
            float b13 = cVar.f12877d.b(aVar2);
            float b14 = cVar.f12874a.b(aVar2);
            float f12 = b12;
            float b15 = cVar.f12875b.b(aVar2);
            float[] fArr3 = k44;
            float b16 = cVar.f12878e.b(aVar2);
            float b17 = cVar.f12879f.b(aVar2);
            if (f12 < b14) {
                f12 = b14;
            }
            if (b13 < b15) {
                b13 = b15;
            }
            float f13 = (b16 <= 0.0f || f12 <= b16) ? f12 : b16;
            if (b17 <= 0.0f || b13 <= b17) {
                b17 = b13;
            }
            float[] fArr4 = k45;
            float[] fArr5 = k46;
            if (this.f12826n1) {
                b14 = (float) Math.ceil(b14);
                b15 = (float) Math.ceil(b15);
                f13 = (float) Math.ceil(f13);
                b17 = (float) Math.ceil(b17);
            }
            if (intValue == 1) {
                float f14 = cVar.H + cVar.J;
                fArr3[i15] = Math.max(fArr3[i15], f13 + f14);
                fArr[i15] = Math.max(fArr[i15], b14 + f14);
            }
            float f15 = cVar.G + cVar.I;
            fArr4[i16] = Math.max(fArr4[i16], b17 + f15);
            fArr2[i16] = Math.max(fArr2[i16], b15 + f15);
            i14++;
            cVarArr = cVarArr2;
            k42 = fArr;
            k43 = fArr2;
            k45 = fArr4;
            k46 = fArr5;
            k44 = fArr3;
        }
        com.badlogic.gdx.scenes.scene2d.ui.c[] cVarArr3 = cVarArr;
        float[] fArr6 = k42;
        float[] fArr7 = k43;
        float[] fArr8 = k44;
        float[] fArr9 = k45;
        float[] fArr10 = k46;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        for (int i18 = 0; i18 < i11; i18++) {
            com.badlogic.gdx.scenes.scene2d.ui.c cVar2 = cVarArr3[i18];
            int i19 = cVar2.D;
            int intValue2 = cVar2.f12891r.intValue();
            if (intValue2 != 0) {
                int intValue3 = cVar2.f12893t.intValue() + i19;
                int i21 = i19;
                while (true) {
                    if (i21 >= intValue3) {
                        for (int i22 = i19; i22 < intValue3; i22++) {
                            fArr10[i22] = intValue2;
                        }
                    } else if (fArr10[i21] != 0.0f) {
                        break;
                    } else {
                        i21++;
                    }
                }
            }
            Boolean bool = cVar2.f12894u;
            Boolean bool2 = Boolean.TRUE;
            if (bool == bool2 && cVar2.f12893t.intValue() == 1) {
                float f21 = cVar2.H + cVar2.J;
                f18 = Math.max(f18, fArr6[i19] - f21);
                f16 = Math.max(f16, fArr8[i19] - f21);
            }
            if (cVar2.f12895v == bool2) {
                float f22 = cVar2.G + cVar2.I;
                f19 = Math.max(f19, fArr7[cVar2.E] - f22);
                f17 = Math.max(f17, fArr9[cVar2.E] - f22);
            }
        }
        if (f16 > 0.0f || f17 > 0.0f) {
            for (int i23 = 0; i23 < i11; i23++) {
                com.badlogic.gdx.scenes.scene2d.ui.c cVar3 = cVarArr3[i23];
                if (f16 > 0.0f && cVar3.f12894u == Boolean.TRUE && cVar3.f12893t.intValue() == 1) {
                    float f23 = cVar3.H + cVar3.J;
                    int i24 = cVar3.D;
                    fArr6[i24] = f18 + f23;
                    fArr8[i24] = f23 + f16;
                }
                if (f17 > 0.0f && cVar3.f12895v == Boolean.TRUE) {
                    float f24 = cVar3.G + cVar3.I;
                    int i25 = cVar3.E;
                    fArr7[i25] = f19 + f24;
                    fArr9[i25] = f24 + f17;
                }
            }
        }
        for (int i26 = 0; i26 < i11; i26++) {
            com.badlogic.gdx.scenes.scene2d.ui.c cVar4 = cVarArr3[i26];
            int intValue4 = cVar4.f12893t.intValue();
            if (intValue4 != 1) {
                int i27 = cVar4.D;
                com.badlogic.gdx.scenes.scene2d.a aVar3 = cVar4.f12896w;
                float b18 = cVar4.f12874a.b(aVar3);
                float b19 = cVar4.f12876c.b(aVar3);
                float b21 = cVar4.f12878e.b(aVar3);
                if (b19 < b18) {
                    b19 = b18;
                }
                if (b21 <= 0.0f || b19 <= b21) {
                    b21 = b19;
                }
                if (this.f12826n1) {
                    b18 = (float) Math.ceil(b18);
                    b21 = (float) Math.ceil(b21);
                }
                float f25 = -(cVar4.H + cVar4.J);
                int i28 = i27 + intValue4;
                float f26 = f25;
                float f27 = 0.0f;
                for (int i29 = i27; i29 < i28; i29++) {
                    f25 += fArr6[i29];
                    f26 += fArr8[i29];
                    f27 += fArr10[i29];
                }
                float max = Math.max(0.0f, b18 - f25);
                float max2 = Math.max(0.0f, b21 - f26);
                while (i27 < i28) {
                    float f28 = f27 == 0.0f ? 1.0f / intValue4 : fArr10[i27] / f27;
                    fArr6[i27] = fArr6[i27] + (max * f28);
                    fArr8[i27] = fArr8[i27] + (f28 * max2);
                    i27++;
                }
            }
        }
        float b22 = this.Z.b(this) + this.f12819f1.b(this);
        float b23 = this.Y.b(this) + this.f12818f0.b(this);
        this.Q = b22;
        this.S = b22;
        for (int i31 = 0; i31 < i12; i31++) {
            this.Q += fArr6[i31];
            this.S += fArr8[i31];
        }
        this.R = b23;
        this.T = b23;
        for (int i32 = 0; i32 < i13; i32++) {
            float f29 = this.R;
            float f31 = fArr7[i32];
            this.R = f29 + f31;
            this.T += Math.max(f31, fArr9[i32]);
        }
        this.S = Math.max(this.Q, this.S);
        this.T = Math.max(this.R, this.T);
    }

    public float A4() {
        return this.Y.b(this);
    }

    public c0 B4() {
        return this.Y;
    }

    public float C4() {
        return this.Z.b(this) + this.f12819f1.b(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0285  */
    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D() {
        /*
            Method dump skipped, instructions count: 1026
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.scenes.scene2d.ui.Table.D():void");
    }

    public float D4() {
        return this.Y.b(this) + this.f12818f0.b(this);
    }

    public int E4(float f11) {
        int i11 = this.H.f13179b;
        if (i11 == 0) {
            return -1;
        }
        float A4 = f11 + A4();
        com.badlogic.gdx.scenes.scene2d.ui.c[] cVarArr = this.H.f13178a;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i12 + 1;
            com.badlogic.gdx.scenes.scene2d.ui.c cVar = cVarArr[i12];
            if (cVar.f12898y + cVar.G < A4) {
                return i13;
            }
            if (cVar.C) {
                i13++;
            }
            i12 = i14;
        }
        return -1;
    }

    public float F4(int i11) {
        float[] fArr = this.V;
        if (fArr == null) {
            return 0.0f;
        }
        return fArr[i11];
    }

    public float G4(int i11) {
        if (this.L) {
            Z3();
        }
        return this.N[i11];
    }

    public com.badlogic.gdx.scenes.scene2d.ui.c H3() {
        return I3(null);
    }

    public float H4(int i11) {
        if (this.L) {
            Z3();
        }
        return this.P[i11];
    }

    public <T extends com.badlogic.gdx.scenes.scene2d.a> com.badlogic.gdx.scenes.scene2d.ui.c<T> I3(@a3.d0 T t11) {
        com.badlogic.gdx.scenes.scene2d.ui.c<T> M4 = M4();
        M4.f12896w = t11;
        if (this.G) {
            this.G = false;
            this.F--;
            this.H.peek().C = false;
        }
        com.badlogic.gdx.utils.a<com.badlogic.gdx.scenes.scene2d.ui.c> aVar = this.H;
        int i11 = aVar.f13179b;
        if (i11 > 0) {
            com.badlogic.gdx.scenes.scene2d.ui.c peek = aVar.peek();
            if (peek.C) {
                M4.D = 0;
                M4.E = peek.E + 1;
            } else {
                M4.D = peek.D + peek.f12893t.intValue();
                M4.E = peek.E;
            }
            if (M4.E > 0) {
                com.badlogic.gdx.scenes.scene2d.ui.c[] cVarArr = this.H.f13178a;
                int i12 = i11 - 1;
                loop0: while (true) {
                    if (i12 < 0) {
                        break;
                    }
                    com.badlogic.gdx.scenes.scene2d.ui.c cVar = cVarArr[i12];
                    int i13 = cVar.D;
                    int intValue = cVar.f12893t.intValue() + i13;
                    while (i13 < intValue) {
                        if (i13 == M4.D) {
                            M4.F = i12;
                            break loop0;
                        }
                        i13++;
                    }
                    i12--;
                }
            }
        } else {
            M4.D = 0;
            M4.E = 0;
        }
        this.H.a(M4);
        M4.l1(this.I);
        int i14 = M4.D;
        com.badlogic.gdx.utils.a<com.badlogic.gdx.scenes.scene2d.ui.c> aVar2 = this.J;
        if (i14 < aVar2.f13179b) {
            M4.G0(aVar2.get(i14));
        }
        M4.G0(this.K);
        if (t11 != null) {
            a3(t11);
        }
        return M4;
    }

    public int I4() {
        return this.F;
    }

    public com.badlogic.gdx.scenes.scene2d.ui.c<k> J3(@a3.d0 CharSequence charSequence) {
        if (this.f12825m1 != null) {
            return I3(new k(charSequence, this.f12825m1));
        }
        throw new IllegalStateException("Table must have a skin set to use this method.");
    }

    @a3.d0
    public q J4() {
        return this.f12825m1;
    }

    public com.badlogic.gdx.scenes.scene2d.ui.c<k> K3(@a3.d0 CharSequence charSequence, String str) {
        if (this.f12825m1 != null) {
            return I3(new k(charSequence, (k.a) this.f12825m1.X(str, k.a.class)));
        }
        throw new IllegalStateException("Table must have a skin set to use this method.");
    }

    public Debug K4() {
        return this.f12821i1;
    }

    public com.badlogic.gdx.scenes.scene2d.ui.c<k> L3(@a3.d0 CharSequence charSequence, String str, @a3.d0 com.badlogic.gdx.graphics.b bVar) {
        if (this.f12825m1 != null) {
            return I3(new k(charSequence, new k.a(this.f12825m1.C0(str), bVar)));
        }
        throw new IllegalStateException("Table must have a skin set to use this method.");
    }

    public Table L4() {
        this.f12820h1 = (this.f12820h1 | 8) & (-17);
        return this;
    }

    public com.badlogic.gdx.scenes.scene2d.ui.c<k> M3(@a3.d0 CharSequence charSequence, String str, String str2) {
        if (this.f12825m1 != null) {
            return I3(new k(charSequence, new k.a(this.f12825m1.C0(str), this.f12825m1.n0(str2))));
        }
        throw new IllegalStateException("Table must have a skin set to use this method.");
    }

    public final com.badlogic.gdx.scenes.scene2d.ui.c M4() {
        com.badlogic.gdx.scenes.scene2d.ui.c h11 = f12811r1.h();
        h11.s1(this);
        return h11;
    }

    public Table N3(com.badlogic.gdx.scenes.scene2d.a... aVarArr) {
        for (com.badlogic.gdx.scenes.scene2d.a aVar : aVarArr) {
            I3(aVar);
        }
        return this;
    }

    public Table N4(float f11) {
        P4(c0.k.g(f11));
        return this;
    }

    public final void O3(float f11, float f12, float f13, float f14, com.badlogic.gdx.graphics.b bVar) {
        DebugRect h11 = DebugRect.pool.h();
        h11.color = bVar;
        h11.set(f11, f12, f13, f14);
        this.f12822j1.a(h11);
    }

    public Table O4(float f11, float f12, float f13, float f14) {
        this.Y = c0.k.g(f11);
        this.Z = c0.k.g(f12);
        this.f12818f0 = c0.k.g(f13);
        this.f12819f1 = c0.k.g(f14);
        this.L = true;
        return this;
    }

    public final void P3(float f11, float f12, float f13, float f14) {
        V3();
        Debug debug = this.f12821i1;
        if (debug == Debug.table || debug == Debug.all) {
            O3(0.0f, 0.0f, J1(), v1(), f12808o1);
            O3(f11, v1() - f12, f13, -f14, f12808o1);
        }
        int i11 = this.H.f13179b;
        float f15 = f11;
        float f16 = f12;
        for (int i12 = 0; i12 < i11; i12++) {
            com.badlogic.gdx.scenes.scene2d.ui.c cVar = this.H.get(i12);
            Debug debug2 = this.f12821i1;
            if (debug2 == Debug.actor || debug2 == Debug.all) {
                O3(cVar.f12897x, cVar.f12898y, cVar.f12899z, cVar.A, f12810q1);
            }
            int i13 = cVar.D;
            int intValue = cVar.f12893t.intValue() + i13;
            float f17 = 0.0f;
            while (i13 < intValue) {
                f17 += this.U[i13];
                i13++;
            }
            float f18 = cVar.H;
            float f19 = f17 - (cVar.J + f18);
            float f21 = f18 + f15;
            Debug debug3 = this.f12821i1;
            if (debug3 == Debug.cell || debug3 == Debug.all) {
                float f22 = this.V[cVar.E];
                float f23 = cVar.G;
                O3(f21, v1() - (f23 + f16), f19, -((f22 - f23) - cVar.I), f12809p1);
            }
            if (cVar.C) {
                f16 += this.V[cVar.E];
                f15 = f11;
            } else {
                f15 = f21 + f19 + cVar.J;
            }
        }
    }

    public Table P4(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("pad cannot be null.");
        }
        this.Y = c0Var;
        this.Z = c0Var;
        this.f12818f0 = c0Var;
        this.f12819f1 = c0Var;
        this.L = true;
        return this;
    }

    public Table Q3(int i11) {
        this.f12820h1 = i11;
        return this;
    }

    public Table Q4(c0 c0Var, c0 c0Var2, c0 c0Var3, c0 c0Var4) {
        if (c0Var == null) {
            throw new IllegalArgumentException("top cannot be null.");
        }
        if (c0Var2 == null) {
            throw new IllegalArgumentException("left cannot be null.");
        }
        if (c0Var3 == null) {
            throw new IllegalArgumentException("bottom cannot be null.");
        }
        if (c0Var4 == null) {
            throw new IllegalArgumentException("right cannot be null.");
        }
        this.Y = c0Var;
        this.Z = c0Var2;
        this.f12818f0 = c0Var3;
        this.f12819f1 = c0Var4;
        this.L = true;
        return this;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public float R() {
        if (this.L) {
            Z3();
        }
        float f11 = this.T;
        z2.k kVar = this.f12823k1;
        return kVar != null ? Math.max(f11, kVar.o()) : f11;
    }

    public Table R3(String str) {
        c5(str);
        return this;
    }

    public Table R4(float f11) {
        this.f12818f0 = c0.k.g(f11);
        this.L = true;
        return this;
    }

    public Table S3(@a3.d0 z2.k kVar) {
        d5(kVar);
        return this;
    }

    public Table S4(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("padBottom cannot be null.");
        }
        this.f12818f0 = c0Var;
        this.L = true;
        return this;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, x2.d, com.badlogic.gdx.scenes.scene2d.a
    @a3.d0
    public com.badlogic.gdx.scenes.scene2d.a T1(float f11, float f12, boolean z11) {
        if (!this.f12824l1 || (!(z11 && H1() == Touchable.disabled) && f11 >= 0.0f && f11 < J1() && f12 >= 0.0f && f12 < v1())) {
            return super.T1(f11, f12, z11);
        }
        return null;
    }

    public Table T3() {
        this.f12820h1 = (this.f12820h1 | 4) & (-3);
        return this;
    }

    public Table T4(float f11) {
        this.Z = c0.k.g(f11);
        this.L = true;
        return this;
    }

    public Table U3() {
        this.f12820h1 = 1;
        return this;
    }

    public Table U4(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("padLeft cannot be null.");
        }
        this.Z = c0Var;
        this.L = true;
        return this;
    }

    public final void V3() {
        if (this.f12822j1 == null) {
            this.f12822j1 = new com.badlogic.gdx.utils.a<>();
        }
        DebugRect.pool.e(this.f12822j1);
        this.f12822j1.clear();
    }

    public Table V4(float f11) {
        this.f12819f1 = c0.k.g(f11);
        this.L = true;
        return this;
    }

    public Table W3() {
        e5(true);
        return this;
    }

    public Table W4(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("padRight cannot be null.");
        }
        this.f12819f1 = c0Var;
        this.L = true;
        return this;
    }

    public Table X3(boolean z11) {
        e5(z11);
        return this;
    }

    public Table X4(float f11) {
        this.Y = c0.k.g(f11);
        this.L = true;
        return this;
    }

    public com.badlogic.gdx.scenes.scene2d.ui.c Y3(int i11) {
        com.badlogic.gdx.utils.a<com.badlogic.gdx.scenes.scene2d.ui.c> aVar = this.J;
        com.badlogic.gdx.scenes.scene2d.ui.c cVar = aVar.f13179b > i11 ? aVar.get(i11) : null;
        if (cVar == null) {
            cVar = M4();
            cVar.d();
            com.badlogic.gdx.utils.a<com.badlogic.gdx.scenes.scene2d.ui.c> aVar2 = this.J;
            int i12 = aVar2.f13179b;
            if (i11 >= i12) {
                while (i12 < i11) {
                    this.J.a(null);
                    i12++;
                }
                this.J.a(cVar);
                return cVar;
            }
            aVar2.K(i11, cVar);
        }
        return cVar;
    }

    public Table Y4(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("padTop cannot be null.");
        }
        this.Y = c0Var;
        this.L = true;
        return this;
    }

    public void Z4() {
        i3();
        this.Y = f12814u1;
        this.Z = f12815v1;
        this.f12818f0 = f12816w1;
        this.f12819f1 = f12817x1;
        this.f12820h1 = 1;
        b4(Debug.none);
        this.I.reset();
        int i11 = this.J.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            com.badlogic.gdx.scenes.scene2d.ui.c cVar = this.J.get(i12);
            if (cVar != null) {
                f12811r1.d(cVar);
            }
        }
        this.J.clear();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.a
    /* renamed from: a4, reason: merged with bridge method [inline-methods] */
    public Table m1() {
        super.m1();
        return this;
    }

    public Table a5() {
        this.f12820h1 = (this.f12820h1 | 16) & (-9);
        return this;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public float b() {
        if (this.L) {
            Z3();
        }
        return this.Q;
    }

    public Table b4(Debug debug) {
        Debug debug2 = Debug.none;
        super.u2(debug != debug2);
        if (this.f12821i1 != debug) {
            this.f12821i1 = debug;
            if (debug == debug2) {
                V3();
                return this;
            }
            invalidate();
        }
        return this;
    }

    public com.badlogic.gdx.scenes.scene2d.ui.c b5() {
        com.badlogic.gdx.utils.a<com.badlogic.gdx.scenes.scene2d.ui.c> aVar = this.H;
        if (aVar.f13179b > 0) {
            if (!this.G) {
                if (aVar.peek().C) {
                    return this.K;
                }
                j4();
            }
            invalidate();
        }
        this.G = false;
        com.badlogic.gdx.scenes.scene2d.ui.c cVar = this.K;
        if (cVar != null) {
            f12811r1.d(cVar);
        }
        com.badlogic.gdx.scenes.scene2d.ui.c M4 = M4();
        this.K = M4;
        M4.d();
        return this.K;
    }

    public Table c4() {
        super.u2(true);
        Debug debug = this.f12821i1;
        Debug debug2 = Debug.actor;
        if (debug != debug2) {
            this.f12821i1 = debug2;
            invalidate();
        }
        return this;
    }

    public void c5(String str) {
        q qVar = this.f12825m1;
        if (qVar == null) {
            throw new IllegalStateException("Table must have a skin set to use this method.");
        }
        d5(qVar.w0(str));
    }

    @Override // x2.d
    /* renamed from: d4, reason: merged with bridge method [inline-methods] */
    public Table l3() {
        super.l3();
        return this;
    }

    public void d5(@a3.d0 z2.k kVar) {
        if (this.f12823k1 == kVar) {
            return;
        }
        float A4 = A4();
        float w42 = w4();
        float u42 = u4();
        float y42 = y4();
        this.f12823k1 = kVar;
        float A42 = A4();
        float w43 = w4();
        float u43 = u4();
        float y43 = y4();
        if (A4 + u42 != A42 + u43 || w42 + y42 != w43 + y43) {
            C0();
        } else {
            if (A4 == A42 && w42 == w43 && u42 == u43 && y42 == y43) {
                return;
            }
            invalidate();
        }
    }

    public Table e4() {
        super.u2(true);
        Debug debug = this.f12821i1;
        Debug debug2 = Debug.cell;
        if (debug != debug2) {
            this.f12821i1 = debug2;
            invalidate();
        }
        return this;
    }

    public void e5(boolean z11) {
        this.f12824l1 = z11;
        B3(z11);
        invalidate();
    }

    public Table f4() {
        super.u2(true);
        Debug debug = this.f12821i1;
        Debug debug2 = Debug.table;
        if (debug != debug2) {
            this.f12821i1 = debug2;
            invalidate();
        }
        return this;
    }

    public void f5(boolean z11) {
        this.f12826n1 = z11;
    }

    public com.badlogic.gdx.scenes.scene2d.ui.c g4() {
        return this.I;
    }

    public void g5(@a3.d0 q qVar) {
        this.f12825m1 = qVar;
    }

    public void h4(w1.a aVar, float f11, float f12, float f13) {
        if (this.f12823k1 == null) {
            return;
        }
        com.badlogic.gdx.graphics.b e11 = e();
        aVar.k(e11.f11544a, e11.f11545b, e11.f11546c, e11.f11547d * f11);
        this.f12823k1.y(aVar, f12, f13, J1(), v1());
    }

    public com.badlogic.gdx.scenes.scene2d.ui.c<t> h5(@a3.d0 com.badlogic.gdx.scenes.scene2d.a... aVarArr) {
        t tVar = new t();
        if (aVarArr != null) {
            for (com.badlogic.gdx.scenes.scene2d.a aVar : aVarArr) {
                tVar.a3(aVar);
            }
        }
        return I3(tVar);
    }

    public final void i4(ShapeRenderer shapeRenderer) {
        float f11;
        float f12;
        if (this.f12822j1 == null || !u1()) {
            return;
        }
        shapeRenderer.w1(ShapeRenderer.ShapeType.Line);
        if (F1() != null) {
            shapeRenderer.h(F1().q1());
        }
        if (t3()) {
            f11 = 0.0f;
            f12 = 0.0f;
        } else {
            f11 = K1();
            f12 = M1();
        }
        int i11 = this.f12822j1.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            DebugRect debugRect = this.f12822j1.get(i12);
            shapeRenderer.h(debugRect.color);
            shapeRenderer.n1(debugRect.f12533x + f11, debugRect.f12534y + f12, debugRect.width, debugRect.height);
        }
    }

    public Table i5() {
        this.f12820h1 = (this.f12820h1 | 2) & (-5);
        return this;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public void invalidate() {
        this.L = true;
        super.invalidate();
    }

    @Override // x2.d
    public void j3(boolean z11) {
        com.badlogic.gdx.utils.a<com.badlogic.gdx.scenes.scene2d.ui.c> aVar = this.H;
        com.badlogic.gdx.scenes.scene2d.ui.c[] cVarArr = aVar.f13178a;
        for (int i11 = aVar.f13179b - 1; i11 >= 0; i11--) {
            com.badlogic.gdx.scenes.scene2d.a aVar2 = cVarArr[i11].f12896w;
            if (aVar2 != null) {
                aVar2.j2();
            }
        }
        j0<com.badlogic.gdx.scenes.scene2d.ui.c> j0Var = f12811r1;
        j0Var.e(this.H);
        this.H.clear();
        this.F = 0;
        this.E = 0;
        com.badlogic.gdx.scenes.scene2d.ui.c cVar = this.K;
        if (cVar != null) {
            j0Var.d(cVar);
        }
        this.K = null;
        this.G = false;
        super.j3(z11);
    }

    public final void j4() {
        com.badlogic.gdx.utils.a<com.badlogic.gdx.scenes.scene2d.ui.c> aVar = this.H;
        com.badlogic.gdx.scenes.scene2d.ui.c[] cVarArr = aVar.f13178a;
        int i11 = 0;
        for (int i12 = aVar.f13179b - 1; i12 >= 0; i12--) {
            com.badlogic.gdx.scenes.scene2d.ui.c cVar = cVarArr[i12];
            if (cVar.C) {
                break;
            }
            i11 += cVar.f12893t.intValue();
        }
        this.E = Math.max(this.E, i11);
        this.F++;
        this.H.peek().C = true;
    }

    public final float[] k4(float[] fArr, int i11) {
        if (fArr == null || fArr.length < i11) {
            return new float[i11];
        }
        Arrays.fill(fArr, 0, i11, 0.0f);
        return fArr;
    }

    public int l4() {
        return this.f12820h1;
    }

    @a3.d0
    public z2.k m4() {
        return this.f12823k1;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public float n0() {
        if (this.L) {
            Z3();
        }
        float f11 = this.S;
        z2.k kVar = this.f12823k1;
        return kVar != null ? Math.max(f11, kVar.b()) : f11;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, x2.d, com.badlogic.gdx.scenes.scene2d.a
    public void n1(w1.a aVar, float f11) {
        Q0();
        if (!t3()) {
            h4(aVar, f11, K1(), M1());
            super.n1(aVar, f11);
            return;
        }
        f3(aVar, k3());
        h4(aVar, f11, 0.0f, 0.0f);
        if (this.f12824l1) {
            aVar.flush();
            float b11 = this.Z.b(this);
            float b12 = this.f12818f0.b(this);
            if (k1(b11, b12, (J1() - b11) - this.f12819f1.b(this), (v1() - b12) - this.Y.b(this))) {
                m3(aVar, f11);
                aVar.flush();
                l1();
            }
        } else {
            m3(aVar, f11);
        }
        z3(aVar);
    }

    @a3.d0
    public <T extends com.badlogic.gdx.scenes.scene2d.a> com.badlogic.gdx.scenes.scene2d.ui.c<T> n4(T t11) {
        if (t11 == null) {
            throw new IllegalArgumentException("actor cannot be null.");
        }
        com.badlogic.gdx.utils.a<com.badlogic.gdx.scenes.scene2d.ui.c> aVar = this.H;
        com.badlogic.gdx.scenes.scene2d.ui.c<T>[] cVarArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            com.badlogic.gdx.scenes.scene2d.ui.c<T> cVar = cVarArr[i12];
            if (cVar.f12896w == t11) {
                return cVar;
            }
        }
        return null;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public float o() {
        if (this.L) {
            Z3();
        }
        return this.R;
    }

    @Override // x2.d, com.badlogic.gdx.scenes.scene2d.a
    public void o1(ShapeRenderer shapeRenderer) {
        float f11;
        float f12;
        if (!t3()) {
            i4(shapeRenderer);
            super.o1(shapeRenderer);
            return;
        }
        e3(shapeRenderer, k3());
        i4(shapeRenderer);
        if (this.f12824l1) {
            shapeRenderer.flush();
            float J1 = J1();
            float v12 = v1();
            if (this.f12823k1 != null) {
                f11 = this.Z.b(this);
                f12 = this.f12818f0.b(this);
                J1 -= this.f12819f1.b(this) + f11;
                v12 -= this.Y.b(this) + f12;
            } else {
                f11 = 0.0f;
                f12 = 0.0f;
            }
            if (k1(f11, f12, J1, v12)) {
                n3(shapeRenderer);
                l1();
            }
        } else {
            n3(shapeRenderer);
        }
        y3(shapeRenderer);
    }

    public com.badlogic.gdx.utils.a<com.badlogic.gdx.scenes.scene2d.ui.c> o4() {
        return this.H;
    }

    public boolean p4() {
        return this.f12824l1;
    }

    public float q4(int i11) {
        if (this.L) {
            Z3();
        }
        return this.M[i11];
    }

    public float r4(int i11) {
        if (this.L) {
            Z3();
        }
        return this.O[i11];
    }

    public float s4(int i11) {
        float[] fArr = this.U;
        if (fArr == null) {
            return 0.0f;
        }
        return fArr[i11];
    }

    public int t4() {
        return this.E;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.a
    public void u2(boolean z11) {
        b4(z11 ? Debug.all : Debug.none);
    }

    public float u4() {
        return this.f12818f0.b(this);
    }

    @Override // x2.d
    public boolean v3(com.badlogic.gdx.scenes.scene2d.a aVar) {
        return w3(aVar, true);
    }

    public c0 v4() {
        return this.f12818f0;
    }

    @Override // x2.d
    public boolean w3(com.badlogic.gdx.scenes.scene2d.a aVar, boolean z11) {
        if (!super.w3(aVar, z11)) {
            return false;
        }
        com.badlogic.gdx.scenes.scene2d.ui.c n42 = n4(aVar);
        if (n42 == null) {
            return true;
        }
        n42.f12896w = null;
        return true;
    }

    public float w4() {
        return this.Z.b(this);
    }

    @Override // x2.d
    public com.badlogic.gdx.scenes.scene2d.a x3(int i11, boolean z11) {
        com.badlogic.gdx.scenes.scene2d.a x32 = super.x3(i11, z11);
        com.badlogic.gdx.scenes.scene2d.ui.c n42 = n4(x32);
        if (n42 != null) {
            n42.f12896w = null;
        }
        return x32;
    }

    public c0 x4() {
        return this.Z;
    }

    public float y4() {
        return this.f12819f1.b(this);
    }

    public c0 z4() {
        return this.f12819f1;
    }

    public Table(@a3.d0 q qVar) {
        this.H = new com.badlogic.gdx.utils.a<>(4);
        this.J = new com.badlogic.gdx.utils.a<>(2);
        this.L = true;
        this.Y = f12814u1;
        this.Z = f12815v1;
        this.f12818f0 = f12816w1;
        this.f12819f1 = f12817x1;
        this.f12820h1 = 1;
        this.f12821i1 = Debug.none;
        this.f12826n1 = true;
        this.f12825m1 = qVar;
        this.I = M4();
        B3(false);
        L2(Touchable.childrenOnly);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.a
    public void p1(ShapeRenderer shapeRenderer) {
    }
}
