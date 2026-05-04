package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.ui.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class g0 extends Table {
    public static final Vector2 J1 = new Vector2();
    public static final Vector2 K1 = new Vector2();
    public static final int L1 = 32;
    public boolean A1;
    public boolean B1;
    public int C1;
    public boolean D1;
    public k E1;
    public Table F1;
    public boolean G1;
    public int H1;
    public boolean I1;

    /* renamed from: y1, reason: collision with root package name */
    public d f12926y1;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f12927z1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends Table {
        public a() {
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.f0, x2.d, com.badlogic.gdx.scenes.scene2d.a
        public void n1(w1.a aVar, float f11) {
            if (g0.this.G1) {
                super.n1(aVar, f11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends com.badlogic.gdx.scenes.scene2d.b {
        public b() {
        }

        @Override // com.badlogic.gdx.scenes.scene2d.b
        public boolean i(InputEvent inputEvent, float f11, float f12, int i11, int i12) {
            g0.this.Z2();
            return false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends com.badlogic.gdx.scenes.scene2d.b {

        /* renamed from: b, reason: collision with root package name */
        public float f12930b;

        /* renamed from: c, reason: collision with root package name */
        public float f12931c;

        /* renamed from: d, reason: collision with root package name */
        public float f12932d;

        /* renamed from: e, reason: collision with root package name */
        public float f12933e;

        public c() {
        }

        @Override // com.badlogic.gdx.scenes.scene2d.b
        public boolean d(InputEvent inputEvent, int i11) {
            return g0.this.A1;
        }

        @Override // com.badlogic.gdx.scenes.scene2d.b
        public boolean e(InputEvent inputEvent, char c11) {
            return g0.this.A1;
        }

        @Override // com.badlogic.gdx.scenes.scene2d.b
        public boolean f(InputEvent inputEvent, int i11) {
            return g0.this.A1;
        }

        @Override // com.badlogic.gdx.scenes.scene2d.b
        public boolean g(InputEvent inputEvent, float f11, float f12) {
            m(f11, f12);
            return g0.this.A1;
        }

        @Override // com.badlogic.gdx.scenes.scene2d.b
        public boolean i(InputEvent inputEvent, float f11, float f12, int i11, int i12) {
            if (i12 == 0) {
                m(f11, f12);
                g0 g0Var = g0.this;
                g0Var.I1 = g0Var.H1 != 0;
                this.f12930b = f11;
                this.f12931c = f12;
                this.f12932d = f11 - g0Var.J1();
                this.f12933e = f12 - g0.this.v1();
            }
            g0 g0Var2 = g0.this;
            return g0Var2.H1 != 0 || g0Var2.A1;
        }

        @Override // com.badlogic.gdx.scenes.scene2d.b
        public void j(InputEvent inputEvent, float f11, float f12, int i11) {
            g0 g0Var = g0.this;
            if (g0Var.I1) {
                float J1 = g0Var.J1();
                float v12 = g0.this.v1();
                float K1 = g0.this.K1();
                float M1 = g0.this.M1();
                float b11 = g0.this.b();
                g0.this.w0();
                float o11 = g0.this.o();
                g0.this.V0();
                com.badlogic.gdx.scenes.scene2d.c F1 = g0.this.F1();
                g0 g0Var2 = g0.this;
                boolean z11 = g0Var2.D1 && F1 != null && g0Var2.A1() == F1.t1();
                int i12 = g0.this.H1;
                if ((i12 & 32) != 0) {
                    K1 += f11 - this.f12930b;
                    M1 += f12 - this.f12931c;
                }
                if ((i12 & 8) != 0) {
                    float f13 = f11 - this.f12930b;
                    if (J1 - f13 < b11) {
                        f13 = -(b11 - J1);
                    }
                    if (z11 && K1 + f13 < 0.0f) {
                        f13 = -K1;
                    }
                    J1 -= f13;
                    K1 += f13;
                }
                if ((i12 & 4) != 0) {
                    float f14 = f12 - this.f12931c;
                    if (v12 - f14 < o11) {
                        f14 = -(o11 - v12);
                    }
                    if (z11 && M1 + f14 < 0.0f) {
                        f14 = -M1;
                    }
                    v12 -= f14;
                    M1 += f14;
                }
                if ((i12 & 16) != 0) {
                    float f15 = (f11 - this.f12932d) - J1;
                    if (J1 + f15 < b11) {
                        f15 = b11 - J1;
                    }
                    if (z11 && K1 + J1 + f15 > F1.w1()) {
                        f15 = (F1.w1() - K1) - J1;
                    }
                    J1 += f15;
                }
                if ((g0.this.H1 & 2) != 0) {
                    float f16 = (f12 - this.f12933e) - v12;
                    if (v12 + f16 < o11) {
                        f16 = o11 - v12;
                    }
                    if (z11 && M1 + v12 + f16 > F1.r1()) {
                        f16 = (F1.r1() - M1) - v12;
                    }
                    v12 += f16;
                }
                g0.this.t2(Math.round(K1), Math.round(M1), Math.round(J1), Math.round(v12));
            }
        }

        @Override // com.badlogic.gdx.scenes.scene2d.b
        public void k(InputEvent inputEvent, float f11, float f12, int i11, int i12) {
            g0.this.I1 = false;
        }

        public boolean l(InputEvent inputEvent, float f11, float f12, int i11) {
            return g0.this.A1;
        }

        public final void m(float f11, float f12) {
            float f13 = r0.C1 / 2.0f;
            float J1 = g0.this.J1();
            float v12 = g0.this.v1();
            float A4 = g0.this.A4();
            float w42 = g0.this.w4();
            float u42 = g0.this.u4();
            float y42 = J1 - g0.this.y4();
            g0 g0Var = g0.this;
            g0Var.H1 = 0;
            if (g0Var.B1 && f11 >= w42 - f13 && f11 <= y42 + f13 && f12 >= u42 - f13) {
                if (f11 < w42 + f13) {
                    g0Var.H1 = 8;
                }
                if (f11 > y42 - f13) {
                    g0Var.H1 |= 16;
                }
                if (f12 < u42 + f13) {
                    g0Var.H1 |= 4;
                }
                int i11 = g0Var.H1;
                if (i11 != 0) {
                    f13 += 25.0f;
                }
                if (f11 < w42 + f13) {
                    g0Var.H1 = i11 | 8;
                }
                if (f11 > y42 - f13) {
                    g0Var.H1 |= 16;
                }
                if (f12 < u42 + f13) {
                    g0Var.H1 |= 4;
                }
            }
            if (!g0Var.f12927z1 || g0Var.H1 != 0 || f12 > v12 || f12 < v12 - A4 || f11 < w42 || f11 > y42) {
                return;
            }
            g0Var.H1 = 32;
        }
    }

    public g0(String str, q qVar) {
        this(str, (d) qVar.R(d.class));
        g5(qVar);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.f0, x2.d, com.badlogic.gdx.scenes.scene2d.a
    @a3.d0
    public com.badlogic.gdx.scenes.scene2d.a T1(float f11, float f12, boolean z11) {
        if (!Z1()) {
            return null;
        }
        com.badlogic.gdx.scenes.scene2d.a T1 = super.T1(f11, f12, z11);
        if (T1 != null || !this.A1 || (z11 && H1() != Touchable.enabled)) {
            float v12 = v1();
            if (T1 != null && T1 != this && f12 <= v12 && f12 >= v12 - A4() && f11 >= 0.0f && f11 <= J1()) {
                com.badlogic.gdx.scenes.scene2d.a aVar = T1;
                while (aVar.A1() != this) {
                    aVar = aVar.A1();
                }
                if (n4(aVar) != null) {
                }
            }
            return T1;
        }
        return this;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Table
    public void h4(w1.a aVar, float f11, float f12, float f13) {
        super.h4(aVar, f11, f12, f13);
        this.F1.e().f11547d = e().f11547d;
        float A4 = A4();
        float w42 = w4();
        this.F1.J2((J1() - w42) - y4(), A4);
        this.F1.C2(w42, v1() - A4);
        this.G1 = true;
        this.F1.n1(aVar, f11);
        this.G1 = false;
    }

    public void j5(w1.a aVar, float f11, float f12, float f13, float f14, float f15) {
        com.badlogic.gdx.graphics.b e11 = e();
        aVar.k(e11.f11544a, e11.f11545b, e11.f11546c, e11.f11547d * f11);
        this.f12926y1.f12938d.y(aVar, f12, f13, f14, f15);
    }

    public d k5() {
        return this.f12926y1;
    }

    public k l5() {
        return this.E1;
    }

    public Table m5() {
        return this.F1;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public float n0() {
        return Math.max(super.n0(), this.F1.n0() + w4() + y4());
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.f0, x2.d, com.badlogic.gdx.scenes.scene2d.a
    public void n1(w1.a aVar, float f11) {
        w1.a aVar2;
        float f12;
        com.badlogic.gdx.scenes.scene2d.c F1 = F1();
        if (F1 != null) {
            if (F1.s1() == null) {
                F1.L1(this);
            }
            r5();
            if (this.f12926y1.f12938d != null) {
                Vector2 vector2 = J1;
                X2(vector2.set(0.0f, 0.0f));
                Vector2 vector22 = K1;
                X2(vector22.set(F1.w1(), F1.r1()));
                aVar2 = aVar;
                f12 = f11;
                j5(aVar2, f12, K1() + vector2.f12535x, M1() + vector2.f12536y, K1() + vector22.f12535x, M1() + vector22.f12536y);
                super.n1(aVar2, f12);
            }
        }
        aVar2 = aVar;
        f12 = f11;
        super.n1(aVar2, f12);
    }

    public boolean n5() {
        return this.I1;
    }

    public boolean o5() {
        return this.A1;
    }

    public boolean p5() {
        return this.f12927z1;
    }

    public boolean q5() {
        return this.B1;
    }

    public void r5() {
        com.badlogic.gdx.scenes.scene2d.c F1;
        if (this.D1 && (F1 = F1()) != null) {
            com.badlogic.gdx.graphics.a p12 = F1.p1();
            if (!(p12 instanceof com.badlogic.gdx.graphics.k)) {
                if (A1() == F1.t1()) {
                    float w12 = F1.w1();
                    float r12 = F1.r1();
                    if (K1() < 0.0f) {
                        P2(0.0f);
                    }
                    if (B1() > w12) {
                        P2(w12 - J1());
                    }
                    if (M1() < 0.0f) {
                        R2(0.0f);
                    }
                    if (G1() > r12) {
                        R2(r12 - v1());
                        return;
                    }
                    return;
                }
                return;
            }
            com.badlogic.gdx.graphics.k kVar = (com.badlogic.gdx.graphics.k) p12;
            float w13 = F1.w1();
            float r13 = F1.r1();
            float L12 = L1(16);
            float f11 = p12.f11508a.f12537x;
            float f12 = L12 - f11;
            float f13 = w13 / 2.0f;
            float f14 = kVar.f12458o;
            if (f12 > f13 / f14) {
                D2(f11 + (f13 / f14), N1(16), 16);
            }
            float L13 = L1(8);
            float f15 = p12.f11508a.f12537x;
            float f16 = L13 - f15;
            float f17 = kVar.f12458o;
            if (f16 < ((-w13) / 2.0f) / f17) {
                D2(f15 - (f13 / f17), N1(8), 8);
            }
            float f18 = r13 / 2.0f;
            if (N1(2) - p12.f11508a.f12538y > f18 / kVar.f12458o) {
                D2(L1(2), p12.f11508a.f12538y + (f18 / kVar.f12458o), 2);
            }
            if (N1(4) - p12.f11508a.f12538y < ((-r13) / 2.0f) / kVar.f12458o) {
                D2(L1(4), p12.f11508a.f12538y - (f18 / kVar.f12458o), 4);
            }
        }
    }

    public k s5(String str, k.a aVar) {
        return new k(str, aVar);
    }

    public void t5(boolean z11) {
        this.D1 = z11;
    }

    public void u5(boolean z11) {
        this.A1 = z11;
    }

    public void v5(boolean z11) {
        this.f12927z1 = z11;
    }

    public void w5(boolean z11) {
        this.B1 = z11;
    }

    public void x5(int i11) {
        this.C1 = i11;
    }

    public void y5(d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("style cannot be null.");
        }
        this.f12926y1 = dVar;
        d5(dVar.f12935a);
        this.E1.u3(new k.a(dVar.f12936b, dVar.f12937c));
        C0();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        @a3.d0
        public z2.k f12935a;

        /* renamed from: b, reason: collision with root package name */
        public com.badlogic.gdx.graphics.g2d.a f12936b;

        /* renamed from: c, reason: collision with root package name */
        @a3.d0
        public com.badlogic.gdx.graphics.b f12937c;

        /* renamed from: d, reason: collision with root package name */
        @a3.d0
        public z2.k f12938d;

        public d() {
            this.f12937c = new com.badlogic.gdx.graphics.b(1.0f, 1.0f, 1.0f, 1.0f);
        }

        public d(com.badlogic.gdx.graphics.g2d.a aVar, com.badlogic.gdx.graphics.b bVar, @a3.d0 z2.k kVar) {
            com.badlogic.gdx.graphics.b bVar2 = new com.badlogic.gdx.graphics.b(1.0f, 1.0f, 1.0f, 1.0f);
            this.f12937c = bVar2;
            this.f12936b = aVar;
            bVar2.H(bVar);
            this.f12935a = kVar;
        }

        public d(d dVar) {
            this.f12937c = new com.badlogic.gdx.graphics.b(1.0f, 1.0f, 1.0f, 1.0f);
            this.f12936b = dVar.f12936b;
            if (dVar.f12937c != null) {
                this.f12937c = new com.badlogic.gdx.graphics.b(dVar.f12937c);
            }
            this.f12935a = dVar.f12935a;
            this.f12938d = dVar.f12938d;
        }
    }

    public g0(String str, q qVar, String str2) {
        this(str, (d) qVar.X(str2, d.class));
        g5(qVar);
    }

    public g0(String str, d dVar) {
        this.f12927z1 = true;
        this.C1 = 8;
        this.D1 = true;
        if (str != null) {
            L2(Touchable.enabled);
            e5(true);
            k s52 = s5(str, new k.a(dVar.f12936b, dVar.f12937c));
            this.E1 = s52;
            s52.p3(true);
            a aVar = new a();
            this.F1 = aVar;
            aVar.I3(this.E1).r0().N0(0.0f);
            a3(this.F1);
            y5(dVar);
            O2(150.0f);
            v2(150.0f);
            c1(new b());
            d1(new c());
            return;
        }
        throw new IllegalArgumentException("title cannot be null.");
    }
}
