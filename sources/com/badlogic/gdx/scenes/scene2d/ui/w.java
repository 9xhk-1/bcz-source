package com.badlogic.gdx.scenes.scene2d.ui;

import a3.c1;
import a3.l0;
import com.badlogic.gdx.graphics.g2d.a;
import com.badlogic.gdx.graphics.g2d.d;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import z2.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class w extends e0 implements z2.g {

    /* renamed from: p1, reason: collision with root package name */
    public static final char f13078p1 = '\b';

    /* renamed from: q1, reason: collision with root package name */
    public static final char f13079q1 = '\r';

    /* renamed from: r1, reason: collision with root package name */
    public static final char f13080r1 = '\n';

    /* renamed from: s1, reason: collision with root package name */
    public static final char f13081s1 = '\t';

    /* renamed from: t1, reason: collision with root package name */
    public static final char f13082t1 = 127;

    /* renamed from: u1, reason: collision with root package name */
    public static final char f13083u1 = 149;

    /* renamed from: v1, reason: collision with root package name */
    public static final Vector2 f13084v1 = new Vector2();

    /* renamed from: w1, reason: collision with root package name */
    public static final Vector2 f13085w1 = new Vector2();

    /* renamed from: x1, reason: collision with root package name */
    public static final Vector2 f13086x1 = new Vector2();

    /* renamed from: y1, reason: collision with root package name */
    public static float f13087y1 = 0.4f;

    /* renamed from: z1, reason: collision with root package name */
    public static float f13088z1 = 0.1f;
    public boolean A;
    public boolean B;
    public final com.badlogic.gdx.graphics.g2d.d C;
    public final a3.r D;
    public h E;
    public String F;
    public CharSequence G;
    public a3.j H;
    public com.badlogic.gdx.scenes.scene2d.b I;

    @a3.d0
    public g J;

    @a3.d0
    public f K;
    public d L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public float Q;
    public float R;
    public String S;
    public long T;
    public boolean U;
    public StringBuilder V;
    public char W;
    public float X;
    public float Y;
    public float Z;

    /* renamed from: f0, reason: collision with root package name */
    public float f13089f0;

    /* renamed from: f1, reason: collision with root package name */
    public int f13090f1;

    /* renamed from: h1, reason: collision with root package name */
    public int f13091h1;

    /* renamed from: i1, reason: collision with root package name */
    public int f13092i1;

    /* renamed from: j1, reason: collision with root package name */
    public boolean f13093j1;

    /* renamed from: k1, reason: collision with root package name */
    public boolean f13094k1;

    /* renamed from: l1, reason: collision with root package name */
    public float f13095l1;

    /* renamed from: m1, reason: collision with root package name */
    public final c1.a f13096m1;

    /* renamed from: n1, reason: collision with root package name */
    public final c f13097n1;

    /* renamed from: o1, reason: collision with root package name */
    public boolean f13098o1;

    /* renamed from: x, reason: collision with root package name */
    public String f13099x;

    /* renamed from: y, reason: collision with root package name */
    public int f13100y;

    /* renamed from: z, reason: collision with root package name */
    public int f13101z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends c1.a {
        public a() {
        }

        @Override // a3.c1.a, java.lang.Runnable
        public void run() {
            if (w.this.F1() == null) {
                a();
                return;
            }
            w.this.f13094k1 = !r0.f13094k1;
            q1.g.f81379b.w();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements d {
        @Override // com.badlogic.gdx.scenes.scene2d.ui.w.d
        public void a(boolean z11) {
            q1.g.f81381d.u(z11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends c1.a {

        /* renamed from: f, reason: collision with root package name */
        public int f13103f;

        public c() {
        }

        @Override // a3.c1.a, java.lang.Runnable
        public void run() {
            if (w.this.F1() == null) {
                a();
            } else {
                w.this.I.d(null, this.f13103f);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d {
        void a(boolean z11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends z2.e {
        public e() {
        }

        public boolean G(char c11) {
            if (!w.this.M) {
                return false;
            }
            if (c11 == '\t') {
                return true;
            }
            if (c11 == '\r' || c11 == '\n') {
                return z2.t.f100743a || z2.t.f100747e;
            }
            return false;
        }

        public void H(boolean z11) {
            w wVar = w.this;
            wVar.f13100y = wVar.f13099x.length();
        }

        public void I(boolean z11) {
            w.this.f13100y = 0;
        }

        public void J(int i11) {
            if (w.this.f13097n1.c() && w.this.f13097n1.f13103f == i11) {
                return;
            }
            c cVar = w.this.f13097n1;
            cVar.f13103f = i11;
            cVar.a();
            c1.i(w.this.f13097n1, w.f13087y1, w.f13088z1);
        }

        public void K(float f11, float f12) {
            w wVar = w.this;
            wVar.f13100y = wVar.J3(f11);
            w wVar2 = w.this;
            wVar2.f13094k1 = wVar2.f13093j1;
            wVar2.f13096m1.a();
            w wVar3 = w.this;
            if (wVar3.f13093j1) {
                c1.a aVar = wVar3.f13096m1;
                float f13 = wVar3.f13095l1;
                c1.i(aVar, f13, f13);
            }
        }

        @Override // com.badlogic.gdx.scenes.scene2d.b
        public boolean d(InputEvent inputEvent, int i11) {
            boolean z11;
            boolean z12;
            w wVar = w.this;
            if (wVar.O) {
                return false;
            }
            wVar.f13094k1 = wVar.f13093j1;
            wVar.f13096m1.a();
            w wVar2 = w.this;
            if (wVar2.f13093j1) {
                c1.a aVar = wVar2.f13096m1;
                float f11 = wVar2.f13095l1;
                c1.i(aVar, f11, f11);
            }
            if (!w.this.Q1()) {
                return false;
            }
            boolean c11 = z2.t.c();
            boolean z13 = true;
            boolean z14 = c11 && !w.this.U;
            if (c11) {
                if (i11 == 29) {
                    w.this.N3();
                    return true;
                }
                if (i11 != 31) {
                    if (i11 == 50) {
                        w wVar3 = w.this;
                        wVar3.M3(wVar3.H.b(), true);
                        z12 = true;
                    } else {
                        if (i11 == 52) {
                            w.this.j3(true);
                            return true;
                        }
                        if (i11 == 54) {
                            w wVar4 = w.this;
                            String str = wVar4.f13099x;
                            wVar4.c4(wVar4.S);
                            w wVar5 = w.this;
                            wVar5.S = str;
                            wVar5.f4();
                            return true;
                        }
                        if (i11 != 124) {
                            z12 = false;
                        }
                    }
                    z11 = z12;
                }
                w.this.g3();
                return true;
            }
            z11 = true;
            z12 = false;
            if (z2.t.k()) {
                if (i11 == 112) {
                    w.this.j3(true);
                } else if (i11 == 124) {
                    w wVar6 = w.this;
                    wVar6.M3(wVar6.H.b(), true);
                }
                w wVar7 = w.this;
                int i12 = wVar7.f13100y;
                if (i11 == 3) {
                    I(z14);
                } else if (i11 != 123) {
                    if (i11 != 21) {
                        if (i11 == 22) {
                            wVar7.K3(true, z14);
                        }
                        z13 = z12;
                    } else {
                        wVar7.K3(false, z14);
                    }
                    z12 = true;
                } else {
                    H(z14);
                }
                w wVar8 = w.this;
                if (!wVar8.A) {
                    wVar8.f13101z = i12;
                    wVar8.A = true;
                }
                z11 = true;
                z13 = z12;
            } else {
                if (i11 == 3) {
                    I(z14);
                    w.this.e3();
                } else if (i11 != 123) {
                    if (i11 != 21) {
                        if (i11 == 22) {
                            w.this.K3(true, z14);
                            w.this.e3();
                        }
                        z13 = z12;
                    } else {
                        w.this.K3(false, z14);
                        w.this.e3();
                    }
                    z11 = true;
                } else {
                    H(z14);
                    w.this.e3();
                }
                z11 = true;
                z13 = z12;
            }
            w wVar9 = w.this;
            wVar9.f13100y = com.badlogic.gdx.math.n.p(wVar9.f13100y, 0, wVar9.f13099x.length());
            if (z13) {
                J(i11);
            }
            return z11;
        }

        @Override // com.badlogic.gdx.scenes.scene2d.b
        public boolean e(InputEvent inputEvent, char c11) {
            w wVar;
            f fVar;
            w wVar2 = w.this;
            if (wVar2.O) {
                return false;
            }
            if (c11 != '\r') {
                switch (c11) {
                    case '\b':
                    case '\t':
                    case '\n':
                        break;
                    default:
                        if (c11 < ' ') {
                            return false;
                        }
                        break;
                }
            }
            if (!wVar2.Q1()) {
                return false;
            }
            if (z2.t.f100744b && q1.g.f81381d.c(63)) {
                return true;
            }
            if (G(c11)) {
                w.this.L3(z2.t.k());
            } else {
                boolean z11 = c11 == '\r' || c11 == '\n';
                boolean z12 = c11 == 127;
                boolean z13 = c11 == '\b';
                w wVar3 = w.this;
                boolean z14 = z11 ? wVar3.B : !wVar3.N || wVar3.E.f13106a.i0().h(c11);
                boolean z15 = z13 || z12;
                if (z14 || z15) {
                    w wVar4 = w.this;
                    String str = wVar4.f13099x;
                    int i11 = wVar4.f13100y;
                    if (z15) {
                        if (wVar4.A) {
                            wVar4.f13100y = wVar4.k3(false);
                        } else {
                            if (z13 && i11 > 0) {
                                StringBuilder sb2 = new StringBuilder();
                                w wVar5 = w.this;
                                sb2.append(wVar5.f13099x.substring(0, wVar5.f13100y - 1));
                                w wVar6 = w.this;
                                String str2 = wVar6.f13099x;
                                int i12 = wVar6.f13100y;
                                wVar6.f13100y = i12 - 1;
                                sb2.append(str2.substring(i12));
                                wVar4.f13099x = sb2.toString();
                                w.this.f13089f0 = 0.0f;
                            }
                            if (z12) {
                                w wVar7 = w.this;
                                if (wVar7.f13100y < wVar7.f13099x.length()) {
                                    w wVar8 = w.this;
                                    StringBuilder sb3 = new StringBuilder();
                                    w wVar9 = w.this;
                                    sb3.append(wVar9.f13099x.substring(0, wVar9.f13100y));
                                    w wVar10 = w.this;
                                    sb3.append(wVar10.f13099x.substring(wVar10.f13100y + 1));
                                    wVar8.f13099x = sb3.toString();
                                }
                            }
                        }
                    }
                    if (z14 && !z15) {
                        if (!z11 && (fVar = (wVar = w.this).K) != null && !fVar.a(wVar, c11)) {
                            return true;
                        }
                        w wVar11 = w.this;
                        int length = wVar11.f13099x.length();
                        w wVar12 = w.this;
                        if (!wVar11.g4(length - (wVar12.A ? Math.abs(wVar12.f13100y - wVar12.f13101z) : 0))) {
                            return true;
                        }
                        w wVar13 = w.this;
                        if (wVar13.A) {
                            wVar13.f13100y = wVar13.k3(false);
                        }
                        String valueOf = z11 ? "\n" : String.valueOf(c11);
                        w wVar14 = w.this;
                        int i13 = wVar14.f13100y;
                        wVar14.f13100y = i13 + 1;
                        wVar14.f13099x = wVar14.G3(i13, valueOf, wVar14.f13099x);
                    }
                    w wVar15 = w.this;
                    String str3 = wVar15.S;
                    if (wVar15.d3(str, wVar15.f13099x)) {
                        long currentTimeMillis = System.currentTimeMillis();
                        long j11 = currentTimeMillis - 750;
                        w wVar16 = w.this;
                        if (j11 > wVar16.T) {
                            wVar16.S = str;
                        }
                        wVar16.T = currentTimeMillis;
                        wVar16.f4();
                    } else if (!w.this.f13099x.equals(str)) {
                        w.this.f13100y = i11;
                    }
                }
            }
            w wVar17 = w.this;
            g gVar = wVar17.J;
            if (gVar != null) {
                gVar.a(wVar17, c11);
            }
            return true;
        }

        @Override // com.badlogic.gdx.scenes.scene2d.b
        public boolean f(InputEvent inputEvent, int i11) {
            w wVar = w.this;
            if (wVar.O) {
                return false;
            }
            wVar.f13097n1.a();
            return true;
        }

        @Override // z2.e, com.badlogic.gdx.scenes.scene2d.b
        public boolean i(InputEvent inputEvent, float f11, float f12, int i11, int i12) {
            if (!super.i(inputEvent, f11, f12, i11, i12)) {
                return false;
            }
            if (i11 == 0 && i12 != 0) {
                return false;
            }
            if (w.this.O) {
                return true;
            }
            K(f11, f12);
            w wVar = w.this;
            wVar.f13101z = wVar.f13100y;
            com.badlogic.gdx.scenes.scene2d.c F1 = wVar.F1();
            if (F1 != null) {
                F1.L1(w.this);
            }
            w.this.L.a(true);
            w.this.A = true;
            return true;
        }

        @Override // z2.e, com.badlogic.gdx.scenes.scene2d.b
        public void j(InputEvent inputEvent, float f11, float f12, int i11) {
            super.j(inputEvent, f11, f12, i11);
            K(f11, f12);
        }

        @Override // z2.e, com.badlogic.gdx.scenes.scene2d.b
        public void k(InputEvent inputEvent, float f11, float f12, int i11, int i12) {
            w wVar = w.this;
            if (wVar.f13101z == wVar.f13100y) {
                wVar.A = false;
            }
            super.k(inputEvent, f11, f12, i11, i12);
        }

        @Override // z2.e
        public void m(InputEvent inputEvent, float f11, float f12) {
            int q11 = q() % 4;
            if (q11 == 0) {
                w.this.e3();
            }
            if (q11 == 2) {
                int[] h42 = w.this.h4(f11);
                w.this.a4(h42[0], h42[1]);
            }
            if (q11 == 3) {
                w.this.N3();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface f {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a implements f {
            @Override // com.badlogic.gdx.scenes.scene2d.ui.w.f
            public boolean a(w wVar, char c11) {
                return Character.isDigit(c11);
            }
        }

        boolean a(w wVar, char c11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface g {
        void a(w wVar, char c11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class h {

        /* renamed from: a, reason: collision with root package name */
        public com.badlogic.gdx.graphics.g2d.a f13106a;

        /* renamed from: b, reason: collision with root package name */
        public com.badlogic.gdx.graphics.b f13107b;

        /* renamed from: c, reason: collision with root package name */
        @a3.d0
        public com.badlogic.gdx.graphics.b f13108c;

        /* renamed from: d, reason: collision with root package name */
        @a3.d0
        public com.badlogic.gdx.graphics.b f13109d;

        /* renamed from: e, reason: collision with root package name */
        @a3.d0
        public z2.k f13110e;

        /* renamed from: f, reason: collision with root package name */
        @a3.d0
        public z2.k f13111f;

        /* renamed from: g, reason: collision with root package name */
        @a3.d0
        public z2.k f13112g;

        /* renamed from: h, reason: collision with root package name */
        @a3.d0
        public z2.k f13113h;

        /* renamed from: i, reason: collision with root package name */
        @a3.d0
        public z2.k f13114i;

        /* renamed from: j, reason: collision with root package name */
        @a3.d0
        public com.badlogic.gdx.graphics.g2d.a f13115j;

        /* renamed from: k, reason: collision with root package name */
        @a3.d0
        public com.badlogic.gdx.graphics.b f13116k;

        public h() {
        }

        public h(com.badlogic.gdx.graphics.g2d.a aVar, com.badlogic.gdx.graphics.b bVar, @a3.d0 z2.k kVar, @a3.d0 z2.k kVar2, @a3.d0 z2.k kVar3) {
            this.f13106a = aVar;
            this.f13107b = bVar;
            this.f13113h = kVar;
            this.f13114i = kVar2;
            this.f13110e = kVar3;
        }

        public h(h hVar) {
            this.f13106a = hVar.f13106a;
            if (hVar.f13107b != null) {
                this.f13107b = new com.badlogic.gdx.graphics.b(hVar.f13107b);
            }
            if (hVar.f13108c != null) {
                this.f13108c = new com.badlogic.gdx.graphics.b(hVar.f13108c);
            }
            if (hVar.f13109d != null) {
                this.f13109d = new com.badlogic.gdx.graphics.b(hVar.f13109d);
            }
            this.f13110e = hVar.f13110e;
            this.f13111f = hVar.f13111f;
            this.f13112g = hVar.f13112g;
            this.f13113h = hVar.f13113h;
            this.f13114i = hVar.f13114i;
            this.f13115j = hVar.f13115j;
            if (hVar.f13116k != null) {
                this.f13116k = new com.badlogic.gdx.graphics.b(hVar.f13116k);
            }
        }
    }

    public w(@a3.d0 String str, q qVar) {
        this(str, (h) qVar.R(h.class));
    }

    public int A3() {
        return this.f13101z;
    }

    public h B3() {
        return this.E;
    }

    public String C3() {
        return this.f13099x;
    }

    @a3.d0
    public f D3() {
        return this.K;
    }

    public float E3(com.badlogic.gdx.graphics.g2d.a aVar, @a3.d0 z2.k kVar) {
        float f11;
        float v12 = v1();
        float n02 = (this.Y / 2.0f) + aVar.n0();
        if (kVar != null) {
            float s11 = kVar.s();
            f11 = n02 + (((v12 - kVar.w()) - s11) / 2.0f) + s11;
        } else {
            f11 = n02 + (v12 / 2.0f);
        }
        return aVar.l1() ? (int) f11 : f11;
    }

    public void F3() {
        com.badlogic.gdx.scenes.scene2d.b h32 = h3();
        this.I = h32;
        d1(h32);
    }

    public String G3(int i11, CharSequence charSequence, String str) {
        if (str.length() == 0) {
            return charSequence.toString();
        }
        return str.substring(0, i11) + ((Object) charSequence) + str.substring(i11, str.length());
    }

    public boolean H3() {
        return this.U;
    }

    @Override // z2.g
    public boolean I() {
        return this.O;
    }

    public boolean I3(char c11) {
        return Character.isLetterOrDigit(c11);
    }

    @Override // z2.g
    public void J0(boolean z11) {
        this.O = z11;
    }

    public int J3(float f11) {
        float n11 = f11 - (((this.Z + this.X) - this.E.f13106a.i0().f12018r) - this.D.n(this.f13090f1));
        if (r3() != null) {
            n11 -= this.E.f13110e.z();
        }
        a3.r rVar = this.D;
        int i11 = rVar.f1626b;
        float[] fArr = rVar.f1625a;
        for (int i12 = 1; i12 < i11; i12++) {
            float f12 = fArr[i12];
            if (f12 > n11) {
                int i13 = i12 - 1;
                return f12 - n11 <= n11 - fArr[i13] ? i12 : i13;
            }
        }
        return i11 - 1;
    }

    public void K3(boolean z11, boolean z12) {
        int length = z11 ? this.f13099x.length() : 0;
        int i11 = z11 ? 0 : -1;
        do {
            int i12 = this.f13100y;
            if (z11) {
                int i13 = i12 + 1;
                this.f13100y = i13;
                if (i13 >= length) {
                    return;
                }
            } else {
                int i14 = i12 - 1;
                this.f13100y = i14;
                if (i14 <= length) {
                    return;
                }
            }
            if (!z12) {
                return;
            }
        } while (f3(this.f13100y, i11));
    }

    public void L3(boolean z11) {
        com.badlogic.gdx.scenes.scene2d.c F1 = F1();
        if (F1 == null) {
            return;
        }
        Vector2 e22 = A1().e2(f13085w1.set(K1(), M1()));
        Vector2 vector2 = f13084v1;
        w wVar = this;
        while (true) {
            boolean z12 = z11;
            w p32 = wVar.p3(F1.n1(), null, vector2, e22, z12);
            if (p32 == null) {
                if (z12) {
                    e22.set(-3.4028235E38f, -3.4028235E38f);
                } else {
                    e22.set(Float.MAX_VALUE, Float.MAX_VALUE);
                }
                p32 = wVar.p3(F1.n1(), null, vector2, e22, z12);
            }
            wVar = p32;
            if (wVar == null) {
                q1.g.f81381d.u(false);
                return;
            } else if (F1.L1(wVar)) {
                wVar.N3();
                return;
            } else {
                e22.set(vector2);
                z11 = z12;
            }
        }
    }

    public void M3(@a3.d0 String str, boolean z11) {
        f fVar;
        if (str == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int length = this.f13099x.length();
        if (this.A) {
            length -= Math.abs(this.f13100y - this.f13101z);
        }
        a.C0189a i02 = this.E.f13106a.i0();
        int length2 = str.length();
        for (int i11 = 0; i11 < length2 && g4(sb2.length() + length); i11++) {
            char charAt = str.charAt(i11);
            if ((this.B && (charAt == '\n' || charAt == '\r')) || (charAt != '\r' && charAt != '\n' && ((!this.N || i02.h(charAt)) && ((fVar = this.K) == null || fVar.a(this, charAt))))) {
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        if (this.A) {
            this.f13100y = k3(z11);
        }
        if (z11) {
            String str2 = this.f13099x;
            d3(str2, G3(this.f13100y, sb3, str2));
        } else {
            this.f13099x = G3(this.f13100y, sb3, this.f13099x);
        }
        f4();
        this.f13100y += sb3.length();
    }

    public void N3() {
        a4(0, this.f13099x.length());
    }

    public void O3(int i11) {
        this.P = i11;
    }

    public void P3(float f11) {
        this.f13095l1 = f11;
    }

    public void Q3(a3.j jVar) {
        this.H = jVar;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.e0, z2.l
    public float R() {
        float f11;
        z2.k kVar = this.E.f13110e;
        float f12 = 0.0f;
        if (kVar != null) {
            f12 = Math.max(0.0f, kVar.s() + this.E.f13110e.w());
            f11 = Math.max(0.0f, this.E.f13110e.o());
        } else {
            f11 = 0.0f;
        }
        z2.k kVar2 = this.E.f13111f;
        if (kVar2 != null) {
            f12 = Math.max(f12, kVar2.s() + this.E.f13111f.w());
            f11 = Math.max(f11, this.E.f13111f.o());
        }
        z2.k kVar3 = this.E.f13112g;
        if (kVar3 != null) {
            f12 = Math.max(f12, kVar3.s() + this.E.f13112g.w());
            f11 = Math.max(f11, this.E.f13112g.o());
        }
        return Math.max(f12 + this.Y, f11);
    }

    public void R3(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("cursorPosition must be >= 0");
        }
        e3();
        this.f13100y = Math.min(i11, this.f13099x.length());
    }

    public void S3(boolean z11) {
        this.M = z11;
    }

    public void T3(int i11) {
        this.f13092i1 = i11;
    }

    public void U3(@a3.d0 String str) {
        this.F = str;
    }

    public void V3(boolean z11) {
        this.N = z11;
    }

    public void W3(d dVar) {
        this.L = dVar;
    }

    public void X3(char c11) {
        this.W = c11;
        if (this.U) {
            f4();
        }
    }

    public void Y3(boolean z11) {
        this.U = z11;
        f4();
    }

    public void Z3(boolean z11) {
        this.f13098o1 = z11;
    }

    public void a4(int i11, int i12) {
        if (i11 < 0) {
            throw new IllegalArgumentException("selectionStart must be >= 0");
        }
        if (i12 < 0) {
            throw new IllegalArgumentException("selectionEnd must be >= 0");
        }
        int min = Math.min(this.f13099x.length(), i11);
        int min2 = Math.min(this.f13099x.length(), i12);
        if (min2 == min) {
            e3();
            return;
        }
        if (min2 < min) {
            min2 = min;
            min = min2;
        }
        this.A = true;
        this.f13101z = min;
        this.f13100y = min2;
    }

    public void b3(@a3.d0 String str) {
        if (str == null) {
            str = "";
        }
        e3();
        this.f13100y = this.f13099x.length();
        M3(str, this.f13098o1);
    }

    public void b4(h hVar) {
        if (hVar == null) {
            throw new IllegalArgumentException("style cannot be null.");
        }
        this.E = hVar;
        this.Y = hVar.f13106a.Z() - (hVar.f13106a.n0() * 2.0f);
        if (this.f13099x != null) {
            f4();
        }
        C0();
    }

    public void c3() {
        float J1 = J1();
        z2.k r32 = r3();
        if (r32 != null) {
            J1 -= r32.z() + r32.u();
        }
        a3.r rVar = this.D;
        int i11 = rVar.f1626b;
        float[] fArr = rVar.f1625a;
        int i12 = i11 - 1;
        int p11 = com.badlogic.gdx.math.n.p(this.f13100y, 0, i12);
        this.f13100y = p11;
        float f11 = fArr[Math.max(0, p11 - 1)];
        float f12 = this.f13089f0;
        float f13 = f11 + f12;
        float f14 = 0.0f;
        if (f13 <= 0.0f) {
            this.f13089f0 = f12 - f13;
        } else {
            float f15 = fArr[Math.min(i12, this.f13100y + 1)] - J1;
            if ((-this.f13089f0) < f15) {
                this.f13089f0 = -f15;
            }
        }
        float f16 = fArr[i12];
        int i13 = i11 - 2;
        float f17 = 0.0f;
        while (i13 >= 0) {
            float f18 = fArr[i13];
            if (f16 - f18 > J1) {
                break;
            }
            i13--;
            f17 = f18;
        }
        if ((-this.f13089f0) > f17) {
            this.f13089f0 = -f17;
        }
        this.f13090f1 = 0;
        int i14 = 0;
        while (true) {
            if (i14 >= i11) {
                break;
            }
            float f19 = fArr[i14];
            if (f19 >= (-this.f13089f0)) {
                this.f13090f1 = i14;
                f14 = f19;
                break;
            }
            i14++;
        }
        int i15 = this.f13090f1 + 1;
        float f21 = J1 - this.f13089f0;
        int min = Math.min(this.G.length(), i11);
        while (i15 <= min && fArr[i15] <= f21) {
            i15++;
        }
        int max = Math.max(0, i15 - 1);
        this.f13091h1 = max;
        int i16 = this.P;
        if ((i16 & 8) == 0) {
            this.Z = ((J1 - fArr[max]) - this.X) + f14;
            if ((i16 & 1) != 0) {
                this.Z = Math.round(r2 * 0.5f);
            }
        } else {
            this.Z = f14 + this.f13089f0;
        }
        if (this.A) {
            int min2 = Math.min(this.f13100y, this.f13101z);
            int max2 = Math.max(this.f13100y, this.f13101z);
            float max3 = Math.max(fArr[min2] - fArr[this.f13090f1], -this.Z);
            float min3 = Math.min(fArr[max2] - fArr[this.f13090f1], J1 - this.Z);
            this.Q = max3;
            this.R = (min3 - max3) - this.E.f13106a.i0().f12018r;
        }
    }

    public void c4(@a3.d0 String str) {
        if (str == null) {
            str = "";
        }
        if (str.equals(this.f13099x)) {
            return;
        }
        e3();
        String str2 = this.f13099x;
        this.f13099x = "";
        M3(str, false);
        if (this.f13098o1) {
            d3(str2, this.f13099x);
        }
        this.f13100y = 0;
    }

    public boolean d3(String str, String str2) {
        if (str2.equals(str)) {
            return false;
        }
        this.f13099x = str2;
        d.a aVar = (d.a) l0.f(d.a.class);
        boolean q12 = q1(aVar);
        if (q12) {
            this.f13099x = str;
        }
        l0.a(aVar);
        return !q12;
    }

    public void d4(@a3.d0 f fVar) {
        this.K = fVar;
    }

    public void e3() {
        this.A = false;
    }

    public void e4(@a3.d0 g gVar) {
        this.J = gVar;
    }

    public boolean f3(int i11, int i12) {
        return I3(this.f13099x.charAt(i11 + i12));
    }

    public void f4() {
        com.badlogic.gdx.graphics.g2d.a aVar = this.E.f13106a;
        a.C0189a i02 = aVar.i0();
        String str = this.f13099x;
        int length = str.length();
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (true) {
            char c11 = ' ';
            if (i11 >= length) {
                break;
            }
            char charAt = str.charAt(i11);
            if (i02.h(charAt)) {
                c11 = charAt;
            }
            sb2.append(c11);
            i11++;
        }
        String sb3 = sb2.toString();
        if (this.U && i02.h(this.W)) {
            if (this.V == null) {
                this.V = new StringBuilder(sb3.length());
            }
            if (this.V.length() > length) {
                this.V.setLength(length);
            } else {
                for (int length2 = this.V.length(); length2 < length; length2++) {
                    this.V.append(this.W);
                }
            }
            this.G = this.V;
        } else {
            this.G = sb3;
        }
        boolean z11 = i02.f12017q;
        i02.f12017q = false;
        this.C.g(aVar, this.G.toString().replace('\r', ' ').replace('\n', ' '));
        i02.f12017q = z11;
        this.D.i();
        com.badlogic.gdx.utils.a<d.a> aVar2 = this.C.f12059a;
        float f11 = 0.0f;
        if (aVar2.f13179b > 0) {
            a3.r rVar = aVar2.first().f12065b;
            this.X = rVar.m();
            int i12 = rVar.f1626b;
            for (int i13 = 1; i13 < i12; i13++) {
                this.D.a(f11);
                f11 += rVar.n(i13);
            }
        } else {
            this.X = 0.0f;
        }
        this.D.a(f11);
        int min = Math.min(this.f13090f1, this.D.f1626b - 1);
        this.f13090f1 = min;
        this.f13091h1 = com.badlogic.gdx.math.n.p(this.f13091h1, min, this.D.f1626b - 1);
        if (this.f13101z > sb3.length()) {
            this.f13101z = length;
        }
    }

    public void g3() {
        if (!this.A || this.U) {
            return;
        }
        this.H.a(this.f13099x.substring(Math.min(this.f13100y, this.f13101z), Math.max(this.f13100y, this.f13101z)));
    }

    public boolean g4(int i11) {
        int i12 = this.f13092i1;
        return i12 <= 0 || i11 < i12;
    }

    public com.badlogic.gdx.scenes.scene2d.b h3() {
        return new e();
    }

    public int[] h4(float f11) {
        return i4(J3(f11));
    }

    public void i3() {
        j3(this.f13098o1);
    }

    public int[] i4(int i11) {
        String str = this.f13099x;
        int length = str.length();
        int i12 = 0;
        if (i11 >= str.length()) {
            length = 0;
            i12 = str.length();
        } else {
            int i13 = i11;
            while (true) {
                if (i13 >= length) {
                    break;
                }
                if (!I3(str.charAt(i13))) {
                    length = i13;
                    break;
                }
                i13++;
            }
            while (true) {
                i11--;
                if (i11 <= -1) {
                    break;
                }
                if (!I3(str.charAt(i11))) {
                    i12 = i11 + 1;
                    break;
                }
            }
        }
        return new int[]{i12, length};
    }

    public void j3(boolean z11) {
        if (!this.A || this.U) {
            return;
        }
        g3();
        this.f13100y = k3(z11);
        f4();
    }

    public int k3(boolean z11) {
        int i11 = this.f13101z;
        int i12 = this.f13100y;
        int min = Math.min(i11, i12);
        int max = Math.max(i11, i12);
        StringBuilder sb2 = new StringBuilder();
        String str = "";
        sb2.append(min > 0 ? this.f13099x.substring(0, min) : "");
        if (max < this.f13099x.length()) {
            String str2 = this.f13099x;
            str = str2.substring(max, str2.length());
        }
        sb2.append(str);
        String sb3 = sb2.toString();
        if (z11) {
            d3(this.f13099x, sb3);
        } else {
            this.f13099x = sb3;
        }
        e3();
        return min;
    }

    public void l3(z2.k kVar, w1.a aVar, com.badlogic.gdx.graphics.g2d.a aVar2, float f11, float f12) {
        kVar.y(aVar, (((f11 + this.Z) + this.D.n(this.f13100y)) - this.D.n(this.f13090f1)) + this.X + aVar2.i0().f12018r, (f12 - this.Y) - aVar2.n0(), kVar.b(), this.Y);
    }

    public void m3(w1.a aVar, com.badlogic.gdx.graphics.g2d.a aVar2, float f11, float f12, float f13) {
        String str = this.F;
        aVar2.D(aVar, str, f11, f12, 0, str.length(), f13, this.P, false, "...");
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.e0, z2.l
    public float n0() {
        return 150.0f;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.e0, com.badlogic.gdx.scenes.scene2d.a
    public void n1(w1.a aVar, float f11) {
        com.badlogic.gdx.graphics.b bVar;
        float f12;
        float f13;
        float f14;
        z2.k kVar;
        float f15;
        float f16;
        w1.a aVar2;
        boolean Q1 = Q1();
        if (Q1 != this.f13093j1 || (Q1 && !this.f13096m1.c())) {
            this.f13093j1 = Q1;
            this.f13096m1.a();
            this.f13094k1 = Q1;
            if (Q1) {
                c1.a aVar3 = this.f13096m1;
                float f17 = this.f13095l1;
                c1.i(aVar3, f17, f17);
            } else {
                this.f13097n1.a();
            }
        } else if (!Q1) {
            this.f13094k1 = false;
        }
        h hVar = this.E;
        com.badlogic.gdx.graphics.g2d.a aVar4 = hVar.f13106a;
        if ((!this.O || (bVar = hVar.f13109d) == null) && (!Q1 || (bVar = hVar.f13108c) == null)) {
            bVar = hVar.f13107b;
        }
        com.badlogic.gdx.graphics.b bVar2 = bVar;
        z2.k kVar2 = hVar.f13114i;
        z2.k kVar3 = hVar.f13113h;
        z2.k r32 = r3();
        com.badlogic.gdx.graphics.b e11 = e();
        float K1 = K1();
        float M1 = M1();
        float J1 = J1();
        float v12 = v1();
        aVar.k(e11.f11544a, e11.f11545b, e11.f11546c, e11.f11547d * f11);
        if (r32 != null) {
            kVar = r32;
            kVar.y(aVar, K1, M1, J1, v12);
            f12 = K1;
            f13 = M1;
            f14 = J1;
            f15 = kVar.z();
            f16 = kVar.u();
        } else {
            f12 = K1;
            f13 = M1;
            f14 = J1;
            kVar = r32;
            f15 = 0.0f;
            f16 = 0.0f;
        }
        float E3 = E3(aVar4, kVar);
        c3();
        if (Q1 && this.A && kVar2 != null) {
            n3(kVar2, aVar, aVar4, f12 + f15, f13 + E3);
        }
        float f18 = aVar4.e1() ? -this.Y : 0.0f;
        if (this.G.length() != 0) {
            aVar2 = aVar;
            a.C0189a i02 = aVar4.i0();
            boolean z11 = i02.f12017q;
            i02.f12017q = false;
            aVar4.k(bVar2.f11544a, bVar2.f11545b, bVar2.f11546c, bVar2.f11547d * e11.f11547d * f11);
            o3(aVar2, aVar4, f12 + f15, f13 + E3 + f18);
            i02.f12017q = z11;
        } else if ((!Q1 || this.O) && this.F != null) {
            h hVar2 = this.E;
            com.badlogic.gdx.graphics.g2d.a aVar5 = hVar2.f13115j;
            if (aVar5 == null) {
                aVar5 = aVar4;
            }
            com.badlogic.gdx.graphics.b bVar3 = hVar2.f13116k;
            if (bVar3 != null) {
                aVar5.k(bVar3.f11544a, bVar3.f11545b, bVar3.f11546c, bVar3.f11547d * e11.f11547d * f11);
            } else {
                aVar5.k(0.7f, 0.7f, 0.7f, e11.f11547d * f11);
            }
            m3(aVar, aVar5, f12 + f15, f13 + E3 + f18, (f14 - f15) - f16);
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
        }
        if (this.O || !this.f13094k1 || kVar3 == null) {
            return;
        }
        l3(kVar3, aVar2, aVar4, f12 + f15, f13 + E3);
    }

    public void n3(z2.k kVar, w1.a aVar, com.badlogic.gdx.graphics.g2d.a aVar2, float f11, float f12) {
        kVar.y(aVar, f11 + this.Z + this.Q + this.X, (f12 - this.Y) - aVar2.n0(), this.R, this.Y);
    }

    public void o3(w1.a aVar, com.badlogic.gdx.graphics.g2d.a aVar2, float f11, float f12) {
        aVar2.z(aVar, this.G, f11 + this.Z, f12, this.f13090f1, this.f13091h1, 0.0f, 8, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        if (((r5 > r6) ^ r15) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009a, code lost:
    
        if (((r2.f12535x < r13.f12535x) ^ r15) != false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a1  */
    @a3.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.badlogic.gdx.scenes.scene2d.ui.w p3(com.badlogic.gdx.utils.a<com.badlogic.gdx.scenes.scene2d.a> r11, @a3.d0 com.badlogic.gdx.scenes.scene2d.ui.w r12, com.badlogic.gdx.math.Vector2 r13, com.badlogic.gdx.math.Vector2 r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.scenes.scene2d.ui.w.p3(com.badlogic.gdx.utils.a, com.badlogic.gdx.scenes.scene2d.ui.w, com.badlogic.gdx.math.Vector2, com.badlogic.gdx.math.Vector2, boolean):com.badlogic.gdx.scenes.scene2d.ui.w");
    }

    public int q3() {
        return this.P;
    }

    @a3.d0
    public z2.k r3() {
        z2.k kVar;
        return (!this.O || (kVar = this.E.f13112g) == null) ? (this.E.f13111f == null || !Q1()) ? this.E.f13110e : this.E.f13111f : kVar;
    }

    public int s3() {
        return this.f13100y;
    }

    public com.badlogic.gdx.scenes.scene2d.b t3() {
        return this.I;
    }

    public boolean u3() {
        return this.M;
    }

    public int v3() {
        return this.f13092i1;
    }

    @a3.d0
    public String w3() {
        return this.F;
    }

    public d x3() {
        return this.L;
    }

    public boolean y3() {
        return this.f13098o1;
    }

    public String z3() {
        return this.A ? this.f13099x.substring(Math.min(this.f13101z, this.f13100y), Math.max(this.f13101z, this.f13100y)) : "";
    }

    public w(@a3.d0 String str, q qVar, String str2) {
        this(str, (h) qVar.X(str2, h.class));
    }

    public w(@a3.d0 String str, h hVar) {
        this.C = new com.badlogic.gdx.graphics.g2d.d();
        this.D = new a3.r();
        this.L = new b();
        this.M = true;
        this.N = true;
        this.P = 8;
        this.S = "";
        this.W = f13083u1;
        this.f13095l1 = 0.32f;
        this.f13096m1 = new a();
        this.f13097n1 = new c();
        b4(hVar);
        this.H = q1.g.f81378a.getClipboard();
        F3();
        c4(str);
        J2(n0(), R());
    }
}
