package com.badlogic.gdx.scenes.scene2d.ui;

import a3.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class k extends e0 {
    public static final com.badlogic.gdx.graphics.b N = new com.badlogic.gdx.graphics.b();
    public static final com.badlogic.gdx.graphics.g2d.d O = new com.badlogic.gdx.graphics.g2d.d();
    public float A;
    public final y0 B;
    public int C;
    public com.badlogic.gdx.graphics.g2d.b D;
    public int E;
    public int F;
    public boolean G;
    public float H;
    public boolean I;
    public float J;
    public float K;
    public boolean L;

    @a3.d0
    public String M;

    /* renamed from: x, reason: collision with root package name */
    public a f12950x;

    /* renamed from: y, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.g2d.d f12951y;

    /* renamed from: z, reason: collision with root package name */
    public float f12952z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public com.badlogic.gdx.graphics.g2d.a f12953a;

        /* renamed from: b, reason: collision with root package name */
        @a3.d0
        public com.badlogic.gdx.graphics.b f12954b;

        /* renamed from: c, reason: collision with root package name */
        @a3.d0
        public z2.k f12955c;

        public a() {
        }

        public a(com.badlogic.gdx.graphics.g2d.a aVar, @a3.d0 com.badlogic.gdx.graphics.b bVar) {
            this.f12953a = aVar;
            this.f12954b = bVar;
        }

        public a(a aVar) {
            this.f12953a = aVar.f12953a;
            if (aVar.f12954b != null) {
                this.f12954b = new com.badlogic.gdx.graphics.b(aVar.f12954b);
            }
            this.f12955c = aVar.f12955c;
        }
    }

    public k(@a3.d0 CharSequence charSequence, q qVar) {
        this(charSequence, (a) qVar.R(a.class));
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.e0, z2.l
    public void D() {
        float f11;
        float f12;
        float f13;
        float f14;
        com.badlogic.gdx.graphics.g2d.a m11 = this.D.m();
        float V0 = m11.V0();
        float a12 = m11.a1();
        if (this.L) {
            m11.i0().q(this.J, this.K);
        }
        boolean z11 = this.G && this.M == null;
        if (z11) {
            float R = R();
            if (R != this.H) {
                this.H = R;
                C0();
            }
        }
        float J1 = J1();
        float v12 = v1();
        z2.k kVar = this.f12950x.f12955c;
        if (kVar != null) {
            float z12 = kVar.z();
            float s11 = kVar.s();
            J1 -= kVar.z() + kVar.u();
            v12 -= kVar.s() + kVar.w();
            f11 = z12;
            f12 = s11;
        } else {
            f11 = 0.0f;
            f12 = 0.0f;
        }
        float f15 = J1;
        float f16 = v12;
        com.badlogic.gdx.graphics.g2d.d dVar = this.f12951y;
        if (z11 || this.B.q0("\n") != -1) {
            y0 y0Var = this.B;
            dVar.h(m11, y0Var, 0, y0Var.f1728b, com.badlogic.gdx.graphics.b.f11522e, f15, this.F, z11, this.M);
            float f17 = dVar.f12062d;
            float f18 = dVar.f12063e;
            int i11 = this.E;
            if ((i11 & 8) == 0) {
                f11 += (i11 & 16) != 0 ? f15 - f17 : (f15 - f17) / 2.0f;
            }
            f15 = f17;
            f13 = f18;
        } else {
            f13 = m11.i0().f12010j;
        }
        int i12 = this.E;
        if ((i12 & 2) != 0) {
            f14 = f12 + (this.D.m().e1() ? 0.0f : f16 - f13) + this.f12950x.f12953a.n0();
        } else if ((i12 & 4) != 0) {
            f14 = (f12 + (this.D.m().e1() ? f16 - f13 : 0.0f)) - this.f12950x.f12953a.n0();
        } else {
            f14 = f12 + ((f16 - f13) / 2.0f);
        }
        if (!this.D.m().e1()) {
            f14 += f13;
        }
        y0 y0Var2 = this.B;
        dVar.h(m11, y0Var2, 0, y0Var2.f1728b, com.badlogic.gdx.graphics.b.f11522e, f15, this.F, z11, this.M);
        this.D.J(dVar, f11, f14);
        if (this.L) {
            m11.i0().q(V0, a12);
        }
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.e0, z2.l
    public float R() {
        if (this.I) {
            l3();
        }
        float n02 = this.A - ((this.f12950x.f12953a.n0() * (this.L ? this.K / this.f12950x.f12953a.a1() : 1.0f)) * 2.0f);
        z2.k kVar = this.f12950x.f12955c;
        return kVar != null ? Math.max(n02 + kVar.w() + kVar.s(), kVar.o()) : n02;
    }

    public void b3(com.badlogic.gdx.graphics.g2d.d dVar) {
        com.badlogic.gdx.graphics.g2d.d dVar2;
        this.I = false;
        if (this.G && this.M == null) {
            float J1 = J1();
            z2.k kVar = this.f12950x.f12955c;
            if (kVar != null) {
                J1 = (Math.max(J1, kVar.b()) - this.f12950x.f12955c.z()) - this.f12950x.f12955c.u();
            }
            dVar2 = dVar;
            dVar2.i(this.D.m(), this.B, com.badlogic.gdx.graphics.b.f11522e, J1, 8, true);
        } else {
            dVar2 = dVar;
            dVar2.g(this.D.m(), this.B);
        }
        this.f12952z = dVar2.f12062d;
        this.A = dVar2.f12063e;
    }

    public com.badlogic.gdx.graphics.g2d.b c3() {
        return this.D;
    }

    public float d3() {
        return this.J;
    }

    public float e3() {
        return this.K;
    }

    public com.badlogic.gdx.graphics.g2d.d f3() {
        return this.f12951y;
    }

    public int g3() {
        return this.E;
    }

    public int h3() {
        return this.F;
    }

    public a i3() {
        return this.f12950x;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.e0, z2.l
    public void invalidate() {
        super.invalidate();
        this.I = true;
    }

    public y0 j3() {
        return this.B;
    }

    public boolean k3() {
        return this.G;
    }

    public final void l3() {
        com.badlogic.gdx.graphics.g2d.a m11 = this.D.m();
        float V0 = m11.V0();
        float a12 = m11.a1();
        if (this.L) {
            m11.i0().q(this.J, this.K);
        }
        b3(O);
        if (this.L) {
            m11.i0().q(V0, a12);
        }
    }

    public void m3(int i11) {
        n3(i11, i11);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.e0, z2.l
    public float n0() {
        if (this.G) {
            return 0.0f;
        }
        if (this.I) {
            l3();
        }
        float f11 = this.f12952z;
        z2.k kVar = this.f12950x.f12955c;
        return kVar != null ? Math.max(f11 + kVar.z() + kVar.u(), kVar.b()) : f11;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.e0, com.badlogic.gdx.scenes.scene2d.a
    public void n1(w1.a aVar, float f11) {
        w1.a aVar2;
        Q0();
        com.badlogic.gdx.graphics.b H = N.H(e());
        float f12 = H.f11547d * f11;
        H.f11547d = f12;
        if (this.f12950x.f12955c != null) {
            aVar.k(H.f11544a, H.f11545b, H.f11546c, f12);
            aVar2 = aVar;
            this.f12950x.f12955c.y(aVar2, K1(), M1(), J1(), v1());
        } else {
            aVar2 = aVar;
        }
        com.badlogic.gdx.graphics.b bVar = this.f12950x.f12954b;
        if (bVar != null) {
            H.r(bVar);
        }
        this.D.L(H);
        this.D.E(K1(), M1());
        this.D.i(aVar2);
    }

    public void n3(int i11, int i12) {
        this.E = i11;
        if ((i12 & 8) != 0) {
            this.F = 8;
        } else if ((i12 & 16) != 0) {
            this.F = 16;
        } else {
            this.F = 1;
        }
        invalidate();
    }

    public void o3(@a3.d0 String str) {
        this.M = str;
    }

    public void p3(boolean z11) {
        if (z11) {
            this.M = "...";
        } else {
            this.M = null;
        }
    }

    public void q3(float f11) {
        r3(f11, f11);
    }

    public void r3(float f11, float f12) {
        this.L = true;
        this.J = f11;
        this.K = f12;
        C0();
    }

    public void s3(float f11) {
        r3(f11, this.K);
    }

    public void t3(float f11) {
        r3(this.J, f11);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.a
    public String toString() {
        String x12 = x1();
        if (x12 != null) {
            return x12;
        }
        String name = getClass().getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf != -1) {
            name = name.substring(lastIndexOf + 1);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name.indexOf(36) != -1 ? "Label " : "");
        sb2.append(name);
        sb2.append(": ");
        sb2.append((Object) this.B);
        return sb2.toString();
    }

    public void u3(a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("style cannot be null.");
        }
        com.badlogic.gdx.graphics.g2d.a aVar2 = aVar.f12953a;
        if (aVar2 == null) {
            throw new IllegalArgumentException("Missing LabelStyle font.");
        }
        this.f12950x = aVar;
        this.D = aVar2.g1();
        C0();
    }

    public void v3(@a3.d0 CharSequence charSequence) {
        if (charSequence == null) {
            y0 y0Var = this.B;
            if (y0Var.f1728b == 0) {
                return;
            } else {
                y0Var.clear();
            }
        } else if (charSequence instanceof y0) {
            if (this.B.equals(charSequence)) {
                return;
            }
            this.B.clear();
            this.B.J((y0) charSequence);
        } else {
            if (y3(charSequence)) {
                return;
            }
            this.B.clear();
            this.B.append(charSequence);
        }
        this.C = Integer.MIN_VALUE;
        C0();
    }

    public boolean w3(int i11) {
        if (this.C == i11) {
            return false;
        }
        this.B.clear();
        this.B.D(i11);
        this.C = i11;
        C0();
        return true;
    }

    public void x3(boolean z11) {
        this.G = z11;
        C0();
    }

    public boolean y3(CharSequence charSequence) {
        y0 y0Var = this.B;
        int i11 = y0Var.f1728b;
        char[] cArr = y0Var.f1727a;
        if (i11 != charSequence.length()) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (cArr[i12] != charSequence.charAt(i12)) {
                return false;
            }
        }
        return true;
    }

    public k(@a3.d0 CharSequence charSequence, q qVar, String str) {
        this(charSequence, (a) qVar.X(str, a.class));
    }

    public k(@a3.d0 CharSequence charSequence, q qVar, String str, com.badlogic.gdx.graphics.b bVar) {
        this(charSequence, new a(qVar.C0(str), bVar));
    }

    public k(@a3.d0 CharSequence charSequence, q qVar, String str, String str2) {
        this(charSequence, new a(qVar.C0(str), qVar.n0(str2)));
    }

    public k(@a3.d0 CharSequence charSequence, a aVar) {
        this.f12951y = new com.badlogic.gdx.graphics.g2d.d();
        y0 y0Var = new y0();
        this.B = y0Var;
        this.C = Integer.MIN_VALUE;
        this.E = 8;
        this.F = 8;
        this.I = true;
        this.J = 1.0f;
        this.K = 1.0f;
        this.L = false;
        if (charSequence != null) {
            y0Var.append(charSequence);
        }
        u3(aVar);
        if (charSequence == null || charSequence.length() <= 0) {
            return;
        }
        J2(n0(), R());
    }
}
