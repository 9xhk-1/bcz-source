package com.badlogic.gdx.scenes.scene2d.ui;

import a3.l0;
import org.junit.jupiter.api.j2;
import z2.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class n extends e0 implements z2.g {
    public float A;
    public float B;
    public float C;
    public float D;
    public final boolean E;
    public float F;
    public float G;
    public com.badlogic.gdx.math.l H;
    public com.badlogic.gdx.math.l I;
    public boolean J;
    public boolean K;
    public boolean L;

    /* renamed from: x, reason: collision with root package name */
    public a f12976x;

    /* renamed from: y, reason: collision with root package name */
    public float f12977y;

    /* renamed from: z, reason: collision with root package name */
    public float f12978z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @a3.d0
        public z2.k f12979a;

        /* renamed from: b, reason: collision with root package name */
        @a3.d0
        public z2.k f12980b;

        /* renamed from: c, reason: collision with root package name */
        @a3.d0
        public z2.k f12981c;

        /* renamed from: d, reason: collision with root package name */
        @a3.d0
        public z2.k f12982d;

        /* renamed from: e, reason: collision with root package name */
        @a3.d0
        public z2.k f12983e;

        /* renamed from: f, reason: collision with root package name */
        @a3.d0
        public z2.k f12984f;

        /* renamed from: g, reason: collision with root package name */
        @a3.d0
        public z2.k f12985g;

        /* renamed from: h, reason: collision with root package name */
        @a3.d0
        public z2.k f12986h;

        public a() {
        }

        public a(@a3.d0 z2.k kVar, @a3.d0 z2.k kVar2) {
            this.f12979a = kVar;
            this.f12981c = kVar2;
        }

        public a(a aVar) {
            this.f12979a = aVar.f12979a;
            this.f12980b = aVar.f12980b;
            this.f12981c = aVar.f12981c;
            this.f12982d = aVar.f12982d;
            this.f12983e = aVar.f12983e;
            this.f12984f = aVar.f12984f;
            this.f12985g = aVar.f12985g;
            this.f12986h = aVar.f12986h;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n(float r7, float r8, float r9, boolean r10, com.badlogic.gdx.scenes.scene2d.ui.q r11) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "default-"
            r0.append(r1)
            if (r10 == 0) goto Lf
            java.lang.String r1 = "vertical"
            goto L11
        Lf:
            java.lang.String r1 = "horizontal"
        L11:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.ui.n$a> r1 = com.badlogic.gdx.scenes.scene2d.ui.n.a.class
            java.lang.Object r11 = r11.X(r0, r1)
            r5 = r11
            com.badlogic.gdx.scenes.scene2d.ui.n$a r5 = (com.badlogic.gdx.scenes.scene2d.ui.n.a) r5
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.scenes.scene2d.ui.n.<init>(float, float, float, boolean, com.badlogic.gdx.scenes.scene2d.ui.q):void");
    }

    public boolean A3(float f11) {
        float b32 = b3(s3(f11));
        float f12 = this.B;
        if (b32 == f12) {
            return false;
        }
        float p32 = p3();
        this.B = b32;
        if (this.L) {
            d.a aVar = (d.a) l0.f(d.a.class);
            boolean q12 = q1(aVar);
            l0.a(aVar);
            if (q12) {
                this.B = f12;
                return false;
            }
        }
        float f13 = this.F;
        if (f13 <= 0.0f) {
            return true;
        }
        this.C = p32;
        this.G = f13;
        return true;
    }

    public void B3(com.badlogic.gdx.math.l lVar) {
        this.I = lVar;
    }

    public void C3() {
        this.G = 0.0f;
    }

    @Override // z2.g
    public boolean I() {
        return this.J;
    }

    @Override // z2.g
    public void J0(boolean z11) {
        this.J = z11;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.e0, z2.l
    public float R() {
        if (this.E) {
            return 140.0f;
        }
        z2.k kVar = this.f12976x.f12981c;
        z2.k d32 = d3();
        return Math.max(kVar == null ? 0.0f : kVar.o(), d32 != null ? d32.o() : 0.0f);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.a
    public void a1(float f11) {
        super.a1(f11);
        float f12 = this.G;
        if (f12 > 0.0f) {
            this.G = f12 - f11;
            com.badlogic.gdx.scenes.scene2d.c F1 = F1();
            if (F1 == null || !F1.m1()) {
                return;
            }
            q1.g.f81379b.w();
        }
    }

    public float b3(float f11) {
        return com.badlogic.gdx.math.n.o(f11, this.f12977y, this.f12978z);
    }

    public final void c3(w1.a aVar, z2.k kVar, float f11, float f12, float f13, float f14) {
        if (this.K) {
            f11 = (float) Math.floor(f11);
            f12 = (float) Math.floor(f12);
            f13 = (float) Math.ceil(f13);
            f14 = (float) Math.ceil(f14);
        }
        kVar.y(aVar, f11, f12, f13, f14);
    }

    @a3.d0
    public z2.k d3() {
        z2.k kVar;
        return (!this.J || (kVar = this.f12976x.f12980b) == null) ? this.f12976x.f12979a : kVar;
    }

    public z2.k e3() {
        z2.k kVar;
        return (!this.J || (kVar = this.f12976x.f12986h) == null) ? this.f12976x.f12985g : kVar;
    }

    public z2.k f3() {
        z2.k kVar;
        return (!this.J || (kVar = this.f12976x.f12984f) == null) ? this.f12976x.f12983e : kVar;
    }

    @a3.d0
    public z2.k g3() {
        z2.k kVar;
        return (!this.J || (kVar = this.f12976x.f12982d) == null) ? this.f12976x.f12981c : kVar;
    }

    public float h3() {
        return this.D;
    }

    public float i3() {
        return this.f12978z;
    }

    public float j3() {
        return this.f12977y;
    }

    public float k3() {
        float f11 = this.f12977y;
        float f12 = this.f12978z;
        if (f11 == f12) {
            return 0.0f;
        }
        return (this.B - f11) / (f12 - f11);
    }

    public float l3() {
        return this.A;
    }

    public a m3() {
        return this.f12976x;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.e0, z2.l
    public float n0() {
        if (!this.E) {
            return 140.0f;
        }
        z2.k kVar = this.f12976x.f12981c;
        z2.k d32 = d3();
        return Math.max(kVar == null ? 0.0f : kVar.b(), d32 != null ? d32.b() : 0.0f);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.e0, com.badlogic.gdx.scenes.scene2d.a
    public void n1(w1.a aVar, float f11) {
        n nVar;
        float f12;
        float f13;
        float f14;
        z2.k kVar = this.f12976x.f12981c;
        z2.k g32 = g3();
        z2.k d32 = d3();
        z2.k f32 = f3();
        z2.k e32 = e3();
        com.badlogic.gdx.graphics.b e11 = e();
        float K1 = K1();
        float M1 = M1();
        float J1 = J1();
        float v12 = v1();
        float o11 = kVar == null ? 0.0f : kVar.o();
        float b11 = kVar == null ? 0.0f : kVar.b();
        float o32 = o3();
        aVar.k(e11.f11544a, e11.f11545b, e11.f11546c, e11.f11547d * f11);
        if (!this.E) {
            if (d32 != null) {
                nVar = this;
                nVar.c3(aVar, d32, K1, Math.round(M1 + ((v12 - d32.o()) * 0.5f)), J1, Math.round(d32.o()));
                f12 = d32.z();
                J1 -= d32.u() + f12;
            } else {
                nVar = this;
                f12 = 0.0f;
            }
            float f15 = J1 - b11;
            float o12 = com.badlogic.gdx.math.n.o(o32 * f15, 0.0f, f15);
            nVar.D = f12 + o12;
            float f16 = b11 * 0.5f;
            if (f32 != null) {
                nVar.c3(aVar, f32, K1 + f12, M1 + ((v12 - f32.o()) * 0.5f), o12 + f16, f32.o());
            }
            if (e32 != null) {
                nVar.c3(aVar, e32, nVar.D + K1 + f16, M1 + ((v12 - e32.o()) * 0.5f), f15 - (nVar.K ? (float) Math.ceil(o12 - f16) : o12 - f16), e32.o());
            }
            if (g32 != null) {
                float b12 = g32.b();
                float o13 = g32.o();
                nVar.c3(aVar, g32, K1 + nVar.D + ((b11 - b12) * 0.5f), M1 + ((v12 - o13) * 0.5f), b12, o13);
                return;
            }
            return;
        }
        if (d32 != null) {
            c3(aVar, d32, K1 + ((J1 - d32.b()) * 0.5f), M1, d32.b(), v12);
            f13 = M1;
            float w11 = d32.w();
            f14 = d32.s();
            v12 -= w11 + f14;
        } else {
            f13 = M1;
            f14 = 0.0f;
        }
        float f17 = v12 - o11;
        float o14 = com.badlogic.gdx.math.n.o(o32 * f17, 0.0f, f17);
        this.D = f14 + o14;
        float f18 = o11 * 0.5f;
        if (f32 != null) {
            c3(aVar, f32, K1 + ((J1 - f32.b()) * 0.5f), f13 + f14, f32.b(), o14 + f18);
        }
        if (e32 != null) {
            c3(aVar, e32, K1 + ((J1 - e32.b()) * 0.5f), f13 + this.D + f18, e32.b(), f17 - (this.K ? (float) Math.ceil(o14 - f18) : o14 - f18));
        }
        if (g32 != null) {
            float b13 = g32.b();
            float o15 = g32.o();
            c3(aVar, g32, K1 + ((J1 - b13) * 0.5f), f13 + this.D + ((o11 - o15) * 0.5f), b13, o15);
        }
    }

    public float n3() {
        return this.B;
    }

    public float o3() {
        if (this.f12977y == this.f12978z) {
            return 0.0f;
        }
        com.badlogic.gdx.math.l lVar = this.I;
        float p32 = p3();
        float f11 = this.f12977y;
        return lVar.a((p32 - f11) / (this.f12978z - f11));
    }

    public float p3() {
        float f11 = this.G;
        return f11 > 0.0f ? this.H.b(this.C, this.B, 1.0f - (f11 / this.F)) : this.B;
    }

    public boolean q3() {
        return this.G > 0.0f;
    }

    public boolean r3() {
        return this.E;
    }

    public float s3(float f11) {
        return Math.round(f11 / this.A) * this.A;
    }

    public void t3(float f11) {
        this.F = f11;
    }

    public void u3(com.badlogic.gdx.math.l lVar) {
        if (lVar == null) {
            throw new IllegalArgumentException("animateInterpolation cannot be null.");
        }
        this.H = lVar;
    }

    public void v3(boolean z11) {
        this.L = z11;
    }

    public void w3(float f11, float f12) {
        if (f11 > f12) {
            throw new IllegalArgumentException("min must be <= max: " + f11 + " <= " + f12);
        }
        this.f12977y = f11;
        this.f12978z = f12;
        float f13 = this.B;
        if (f13 < f11) {
            A3(f11);
        } else if (f13 > f12) {
            A3(f12);
        }
    }

    public void x3(boolean z11) {
        this.K = z11;
    }

    public void y3(float f11) {
        if (f11 > 0.0f) {
            this.A = f11;
            return;
        }
        throw new IllegalArgumentException("steps must be > 0: " + f11);
    }

    public void z3(a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("style cannot be null.");
        }
        this.f12976x = aVar;
        C0();
    }

    public n(float f11, float f12, float f13, boolean z11, q qVar, String str) {
        this(f11, f12, f13, z11, (a) qVar.X(str, a.class));
    }

    public n(float f11, float f12, float f13, boolean z11, a aVar) {
        com.badlogic.gdx.math.l lVar = com.badlogic.gdx.math.l.f12615a;
        this.H = lVar;
        this.I = lVar;
        this.K = true;
        this.L = true;
        if (f11 > f12) {
            throw new IllegalArgumentException("max must be > min. min,max: " + f11 + j2.O + f12);
        }
        if (f13 > 0.0f) {
            z3(aVar);
            this.f12977y = f11;
            this.f12978z = f12;
            this.A = f13;
            this.E = z11;
            this.B = f11;
            J2(n0(), R());
            return;
        }
        throw new IllegalArgumentException("stepSize must be > 0: " + f13);
    }
}
