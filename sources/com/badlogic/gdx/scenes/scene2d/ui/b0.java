package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.b0.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b0<N extends c, V> extends f0 {
    public static final Vector2 U = new Vector2();
    public d E;
    public final com.badlogic.gdx.utils.a<N> F;
    public final z2.o<N> G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public float N;
    public float O;
    public boolean P;
    public N Q;
    public N R;
    public N S;
    public z2.e T;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends z2.o<N> {
        public a() {
        }

        @Override // z2.o
        public void d() {
            int size = size();
            if (size == 0) {
                b0.this.S = null;
            } else {
                if (size != 1) {
                    return;
                }
                b0.this.S = (N) first();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends z2.e {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // z2.e, com.badlogic.gdx.scenes.scene2d.b
        public void b(InputEvent inputEvent, float f11, float f12, int i11, com.badlogic.gdx.scenes.scene2d.a aVar) {
            super.b(inputEvent, f11, f12, i11, aVar);
            b0 b0Var = b0.this;
            b0Var.v4(b0Var.c4(f12));
        }

        @Override // z2.e, com.badlogic.gdx.scenes.scene2d.b
        public void c(InputEvent inputEvent, float f11, float f12, int i11, @a3.d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
            super.c(inputEvent, f11, f12, i11, aVar);
            if (aVar == null || !aVar.V1(b0.this)) {
                b0.this.v4(null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.badlogic.gdx.scenes.scene2d.b
        public boolean g(InputEvent inputEvent, float f11, float f12) {
            b0 b0Var = b0.this;
            b0Var.v4(b0Var.c4(f12));
            return false;
        }

        @Override // z2.e
        public void m(InputEvent inputEvent, float f11, float f12) {
            N n11 = (N) b0.this.c4(f12);
            if (n11 != null && n11 == b0.this.c4(t())) {
                if (b0.this.G.k() && b0.this.G.p() && z2.t.k()) {
                    b0 b0Var = b0.this;
                    if (b0Var.S == null) {
                        b0Var.S = n11;
                    }
                    N n12 = b0Var.S;
                    if (!z2.t.c()) {
                        b0.this.G.clear();
                    }
                    float M1 = n12.f12859a.M1();
                    float M12 = n11.f12859a.M1();
                    if (M1 > M12) {
                        b0 b0Var2 = b0.this;
                        b0Var2.s4(b0Var2.F, M12, M1);
                    } else {
                        b0 b0Var3 = b0.this;
                        b0Var3.s4(b0Var3.F, M1, M12);
                        b0.this.G.o().A().G();
                    }
                    b0.this.G.h();
                    b0.this.S = n12;
                    return;
                }
                if (n11.f12861c.f13179b > 0 && (!b0.this.G.k() || !z2.t.c())) {
                    float K1 = n11.f12859a.K1();
                    z2.k kVar = n11.f12864f;
                    if (kVar != null) {
                        K1 -= b0.this.J + kVar.b();
                    }
                    if (f11 < K1) {
                        n11.D(!n11.f12863e);
                        return;
                    }
                }
                if (n11.x()) {
                    b0.this.G.f(n11);
                    if (b0.this.G.isEmpty()) {
                        return;
                    }
                    b0.this.S = n11;
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public z2.k f12867a;

        /* renamed from: b, reason: collision with root package name */
        public z2.k f12868b;

        /* renamed from: c, reason: collision with root package name */
        @a3.d0
        public z2.k f12869c;

        /* renamed from: d, reason: collision with root package name */
        @a3.d0
        public z2.k f12870d;

        /* renamed from: e, reason: collision with root package name */
        @a3.d0
        public z2.k f12871e;

        /* renamed from: f, reason: collision with root package name */
        @a3.d0
        public z2.k f12872f;

        /* renamed from: g, reason: collision with root package name */
        @a3.d0
        public z2.k f12873g;

        public d() {
        }

        public d(z2.k kVar, z2.k kVar2, @a3.d0 z2.k kVar3) {
            this.f12867a = kVar;
            this.f12868b = kVar2;
            this.f12872f = kVar3;
        }

        public d(d dVar) {
            this.f12867a = dVar.f12867a;
            this.f12868b = dVar.f12868b;
            this.f12869c = dVar.f12869c;
            this.f12870d = dVar.f12870d;
            this.f12871e = dVar.f12871e;
            this.f12872f = dVar.f12872f;
            this.f12873g = dVar.f12873g;
        }
    }

    public b0(q qVar) {
        this((d) qVar.R(d.class));
    }

    public static void J3(com.badlogic.gdx.utils.a<? extends c> aVar) {
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            c cVar = aVar.get(i12);
            cVar.D(false);
            J3(cVar.f12861c);
        }
    }

    private void K3() {
        this.P = false;
        float p42 = p4();
        this.N = p42;
        this.O = 0.0f;
        L3(this.F, 0.0f, p42);
        this.N += this.K + this.L;
    }

    public static void T3(com.badlogic.gdx.utils.a<? extends c> aVar) {
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            aVar.get(i12).g();
        }
    }

    public static boolean V3(com.badlogic.gdx.utils.a<? extends c> aVar, com.badlogic.gdx.utils.a aVar2) {
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            c cVar = aVar.get(i12);
            if (cVar.f12863e && !V3(cVar.f12861c, aVar2)) {
                aVar2.a(cVar.f12866h);
            }
        }
        return false;
    }

    @a3.d0
    public static c W3(com.badlogic.gdx.utils.a<? extends c> aVar, Object obj) {
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            c cVar = aVar.get(i12);
            if (obj.equals(cVar.f12866h)) {
                return cVar;
            }
        }
        int i13 = aVar.f13179b;
        for (int i14 = 0; i14 < i13; i14++) {
            c W3 = W3(aVar.get(i14).f12861c, obj);
            if (W3 != null) {
                return W3;
            }
        }
        return null;
    }

    private void m4() {
        b bVar = new b();
        this.T = bVar;
        d1(bVar);
    }

    public void A4() {
        int i11 = this.F.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            N n11 = this.F.get(i12);
            int O1 = n11.f12859a.O1();
            if (O1 != -1) {
                n11.A(this, O1);
            }
        }
        int i13 = this.F.f13179b;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            i14 += this.F.get(i15).c(this, i14);
        }
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public void D() {
        if (this.P) {
            K3();
        }
        o4(this.F, this.K, v1() - (this.H / 2.0f), p4());
    }

    public void H3(N n11) {
        n4(this.F.f13179b, n11);
    }

    public void I3() {
        J3(this.F);
    }

    public final void L3(com.badlogic.gdx.utils.a<N> aVar, float f11, float f12) {
        float J1;
        float f13 = this.H;
        float f14 = this.I + this.J;
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            N n11 = aVar.get(i12);
            float f15 = f11 + f12;
            A a11 = n11.f12859a;
            if (a11 instanceof z2.l) {
                z2.l lVar = (z2.l) a11;
                J1 = f15 + lVar.n0();
                n11.f12865g = lVar.R();
            } else {
                J1 = f15 + a11.J1();
                n11.f12865g = a11.v1();
            }
            z2.k kVar = n11.f12864f;
            if (kVar != null) {
                J1 += kVar.b() + f14;
                n11.f12865g = Math.max(n11.f12865g, n11.f12864f.o());
            }
            this.N = Math.max(this.N, J1);
            this.O += n11.f12865g + f13;
            if (n11.f12863e) {
                L3(n11.f12861c, this.M + f11, f12);
            }
        }
    }

    public void M3(w1.a aVar, float f11) {
        if (this.E.f12873g != null) {
            com.badlogic.gdx.graphics.b e11 = e();
            aVar.k(e11.f11544a, e11.f11545b, e11.f11546c, e11.f11547d * f11);
            this.E.f12873g.y(aVar, K1(), M1(), J1(), v1());
        }
    }

    public void N3(N n11, z2.k kVar, w1.a aVar, float f11, float f12) {
        kVar.y(aVar, f11, f12, kVar.b(), kVar.o());
    }

    public void O3(N n11, z2.k kVar, w1.a aVar, float f11, float f12) {
        kVar.y(aVar, f11, f12, kVar.b(), kVar.o());
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float P3(w1.a r24, float r25, float r26, float r27, float r28, @a3.d0 N r29, com.badlogic.gdx.utils.a<N> r30, float r31, float r32) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.scenes.scene2d.ui.b0.P3(w1.a, float, float, float, float, com.badlogic.gdx.scenes.scene2d.ui.b0$c, com.badlogic.gdx.utils.a, float, float):float");
    }

    public void Q3(N n11, z2.k kVar, w1.a aVar, float f11, float f12, float f13, float f14) {
        kVar.y(aVar, f11, f12, f13, f14);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public float R() {
        if (this.P) {
            K3();
        }
        return this.O;
    }

    public void R3(N n11, z2.k kVar, w1.a aVar, float f11, float f12, float f13, float f14) {
        kVar.y(aVar, f11, f12, f13, f14);
    }

    public void S3() {
        T3(this.F);
    }

    public void U3(com.badlogic.gdx.utils.a<V> aVar) {
        V3(this.F, aVar);
    }

    @a3.d0
    public N X3(V v11) {
        if (v11 != null) {
            return (N) W3(this.F, v11);
        }
        throw new IllegalArgumentException("value cannot be null.");
    }

    public z2.e Y3() {
        return this.T;
    }

    public z2.k Z3(N n11, float f11) {
        if (n11 == this.R && q1.g.f81378a.getType() == Application.ApplicationType.Desktop && (!this.G.k() || (!z2.t.c() && !z2.t.k()))) {
            float K1 = s2(U.set(q1.g.f81381d.C(), 0.0f)).f12535x + K1();
            if (K1 >= 0.0f && K1 < f11) {
                z2.k kVar = n11.f12863e ? this.E.f12870d : this.E.f12869c;
                if (kVar != null) {
                    return kVar;
                }
            }
        }
        return n11.f12863e ? this.E.f12868b : this.E.f12867a;
    }

    public float a4() {
        return this.M;
    }

    public final float b4(com.badlogic.gdx.utils.a<N> aVar, float f11, float f12) {
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            N n11 = aVar.get(i12);
            float f13 = n11.f12865g;
            float m11 = f12 - (n11.m() - f13);
            float f14 = this.H;
            if (f11 >= (m11 - f13) - f14 && f11 < m11) {
                this.Q = n11;
                return -1.0f;
            }
            f12 = m11 - (f13 + f14);
            if (n11.f12863e) {
                f12 = b4(n11.f12861c, f11, f12);
                if (f12 == -1.0f) {
                    return -1.0f;
                }
            }
        }
        return f12;
    }

    @a3.d0
    public N c4(float f11) {
        this.Q = null;
        b4(this.F, f11, v1());
        try {
            return this.Q;
        } finally {
            this.Q = null;
        }
    }

    @Deprecated
    public com.badlogic.gdx.utils.a<N> d4() {
        return this.F;
    }

    @a3.d0
    public N e4() {
        return this.R;
    }

    @a3.d0
    public V f4() {
        N n11 = this.R;
        if (n11 == null) {
            return null;
        }
        return (V) n11.r();
    }

    public com.badlogic.gdx.utils.a<N> g4() {
        return this.F;
    }

    @a3.d0
    public N h4() {
        return this.G.first();
    }

    @a3.d0
    public V i4() {
        N first = this.G.first();
        if (first == null) {
            return null;
        }
        return (V) first.r();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public void invalidate() {
        super.invalidate();
        this.P = true;
    }

    @Override // x2.d
    public void j3(boolean z11) {
        super.j3(z11);
        v4(null);
        this.F.clear();
        this.G.clear();
    }

    public z2.o<N> j4() {
        return this.G;
    }

    public d k4() {
        return this.E;
    }

    public float l4() {
        return this.H;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public float n0() {
        if (this.P) {
            K3();
        }
        return this.N;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, x2.d, com.badlogic.gdx.scenes.scene2d.a
    public void n1(w1.a aVar, float f11) {
        M3(aVar, f11);
        com.badlogic.gdx.graphics.b e11 = e();
        float f12 = e11.f11547d * f11;
        aVar.k(e11.f11544a, e11.f11545b, e11.f11546c, f12);
        P3(aVar, e11.f11544a, e11.f11545b, e11.f11546c, f12, null, this.F, this.K, p4());
        super.n1(aVar, f11);
    }

    public void n4(int i11, N n11) {
        int f11;
        N n12 = n11.f12860b;
        if (n12 != null) {
            n12.z(n11);
            n11.f12860b = null;
        } else {
            int q11 = this.F.q(n11, true);
            if (q11 != -1) {
                if (q11 == i11) {
                    return;
                }
                if (q11 < i11) {
                    i11--;
                }
                this.F.A(q11);
                int O1 = n11.f12859a.O1();
                if (O1 != -1) {
                    n11.A(this, O1);
                }
            }
        }
        this.F.r(i11, n11);
        if (i11 == 0) {
            f11 = 0;
        } else {
            com.badlogic.gdx.utils.a<N> aVar = this.F;
            if (i11 < aVar.f13179b - 1) {
                f11 = aVar.get(i11 + 1).f12859a.O1();
            } else {
                N n13 = aVar.get(i11 - 1);
                f11 = n13.f() + n13.f12859a.O1();
            }
        }
        n11.c(this, f11);
    }

    public final float o4(com.badlogic.gdx.utils.a<N> aVar, float f11, float f12, float f13) {
        float f14 = this.H;
        float f15 = this.I;
        float f16 = this.J + f15;
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            N n11 = aVar.get(i12);
            float f17 = f11 + f13;
            z2.k kVar = n11.f12864f;
            float b11 = kVar != null ? f17 + kVar.b() + f16 : f17 + f15;
            A a11 = n11.f12859a;
            if (a11 instanceof z2.l) {
                ((z2.l) a11).z();
            }
            float m11 = f12 - n11.m();
            n11.f12859a.C2(b11, m11);
            f12 = m11 - f14;
            if (n11.f12863e) {
                f12 = o4(n11.f12861c, this.M + f11, f12, f13);
            }
        }
        return f12;
    }

    public final float p4() {
        float max = Math.max(this.E.f12867a.b(), this.E.f12868b.b());
        z2.k kVar = this.E.f12869c;
        if (kVar != null) {
            max = Math.max(max, kVar.b());
        }
        z2.k kVar2 = this.E.f12870d;
        return kVar2 != null ? Math.max(max, kVar2.b()) : max;
    }

    public void q4(N n11) {
        int O1;
        N n12 = n11.f12860b;
        if (n12 != null) {
            n12.z(n11);
        } else if (this.F.C(n11, true) && (O1 = n11.f12859a.O1()) != -1) {
            n11.A(this, O1);
        }
    }

    public void r4(com.badlogic.gdx.utils.a<V> aVar) {
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            N X3 = X3(aVar.get(i12));
            if (X3 != null) {
                X3.D(true);
                X3.h();
            }
        }
    }

    public void s4(com.badlogic.gdx.utils.a<N> aVar, float f11, float f12) {
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            N n11 = aVar.get(i12);
            if (n11.f12859a.M1() < f11) {
                return;
            }
            if (n11.x()) {
                if (n11.f12859a.M1() <= f12) {
                    this.G.a(n11);
                }
                if (n11.f12863e) {
                    s4(n11.f12861c, f11, f12);
                }
            }
        }
    }

    public void t4(float f11, float f12) {
        this.I = f11;
        this.J = f12;
    }

    public void u4(float f11) {
        this.M = f11;
    }

    public void v4(@a3.d0 N n11) {
        this.R = n11;
    }

    public void w4(float f11) {
        this.K = f11;
        this.L = f11;
    }

    public void x4(float f11, float f12) {
        this.K = f11;
        this.L = f12;
    }

    public void y4(d dVar) {
        this.E = dVar;
        if (this.M == 0.0f) {
            this.M = p4();
        }
    }

    public void z4(float f11) {
        this.H = f11;
    }

    public b0(q qVar, String str) {
        this((d) qVar.X(str, d.class));
    }

    public b0(d dVar) {
        this.F = new com.badlogic.gdx.utils.a<>();
        this.H = 4.0f;
        this.I = 2.0f;
        this.J = 2.0f;
        this.P = true;
        a aVar = new a();
        this.G = aVar;
        aVar.u(this);
        aVar.w(true);
        y4(dVar);
        m4();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class c<N extends c, V, A extends com.badlogic.gdx.scenes.scene2d.a> {

        /* renamed from: a, reason: collision with root package name */
        public A f12859a;

        /* renamed from: b, reason: collision with root package name */
        public N f12860b;

        /* renamed from: c, reason: collision with root package name */
        public final com.badlogic.gdx.utils.a<N> f12861c = new com.badlogic.gdx.utils.a<>(0);

        /* renamed from: d, reason: collision with root package name */
        public boolean f12862d = true;

        /* renamed from: e, reason: collision with root package name */
        public boolean f12863e;

        /* renamed from: f, reason: collision with root package name */
        public z2.k f12864f;

        /* renamed from: g, reason: collision with root package name */
        public float f12865g;

        /* renamed from: h, reason: collision with root package name */
        public V f12866h;

        public c(A a11) {
            if (a11 == null) {
                throw new IllegalArgumentException("actor cannot be null.");
            }
            this.f12859a = a11;
        }

        public void A(b0<N, V> b0Var, int i11) {
            b0Var.x3(i11, true);
            if (this.f12863e) {
                com.badlogic.gdx.utils.a<N> aVar = this.f12861c;
                N[] nArr = aVar.f13178a;
                int i12 = aVar.f13179b;
                for (int i13 = 0; i13 < i12; i13++) {
                    nArr[i13].A(b0Var, i11);
                }
            }
        }

        public void B(com.badlogic.gdx.utils.a<V> aVar) {
            int i11 = aVar.f13179b;
            for (int i12 = 0; i12 < i11; i12++) {
                N j11 = j(aVar.get(i12));
                if (j11 != null) {
                    j11.D(true);
                    j11.h();
                }
            }
        }

        public void C(A a11) {
            b0<N, V> q11;
            if (this.f12859a != null && (q11 = q()) != null) {
                int O1 = this.f12859a.O1();
                q11.x3(O1, true);
                q11.c3(O1, a11);
            }
            this.f12859a = a11;
        }

        public void D(boolean z11) {
            b0<N, V> q11;
            if (z11 == this.f12863e) {
                return;
            }
            this.f12863e = z11;
            if (this.f12861c.f13179b == 0 || (q11 = q()) == null) {
                return;
            }
            N[] nArr = this.f12861c.f13178a;
            int O1 = this.f12859a.O1() + 1;
            int i11 = 0;
            if (z11) {
                int i12 = this.f12861c.f13179b;
                while (i11 < i12) {
                    O1 += nArr[i11].c(q11, O1);
                    i11++;
                }
                return;
            }
            int i13 = this.f12861c.f13179b;
            while (i11 < i13) {
                nArr[i11].A(q11, O1);
                i11++;
            }
        }

        public void E(@a3.d0 z2.k kVar) {
            this.f12864f = kVar;
        }

        public void F(boolean z11) {
            this.f12862d = z11;
        }

        public void G(@a3.d0 V v11) {
            this.f12866h = v11;
        }

        public void H() {
            b0<N, V> q11;
            if (this.f12863e && (q11 = q()) != null) {
                com.badlogic.gdx.utils.a<N> aVar = this.f12861c;
                N[] nArr = aVar.f13178a;
                int i11 = aVar.f13179b;
                int O1 = this.f12859a.O1() + 1;
                for (int i12 = 0; i12 < i11; i12++) {
                    nArr[i12].A(q11, O1);
                }
                for (int i13 = 0; i13 < i11; i13++) {
                    O1 += nArr[i13].c(q11, O1);
                }
            }
        }

        public void a(N n11) {
            t(this.f12861c.f13179b, n11);
        }

        public void b(com.badlogic.gdx.utils.a<N> aVar) {
            int i11 = aVar.f13179b;
            for (int i12 = 0; i12 < i11; i12++) {
                t(this.f12861c.f13179b, aVar.get(i12));
            }
        }

        public int c(b0<N, V> b0Var, int i11) {
            b0Var.c3(i11, this.f12859a);
            if (!this.f12863e) {
                return 1;
            }
            int i12 = i11 + 1;
            com.badlogic.gdx.utils.a<N> aVar = this.f12861c;
            N[] nArr = aVar.f13178a;
            int i13 = aVar.f13179b;
            for (int i14 = 0; i14 < i13; i14++) {
                i12 += nArr[i14].c(b0Var, i12);
            }
            return i12 - i11;
        }

        public void d() {
            b0<N, V> q11;
            if (this.f12863e && (q11 = q()) != null) {
                int O1 = this.f12859a.O1() + 1;
                com.badlogic.gdx.utils.a<N> aVar = this.f12861c;
                N[] nArr = aVar.f13178a;
                int i11 = aVar.f13179b;
                for (int i12 = 0; i12 < i11; i12++) {
                    nArr[i12].A(q11, O1);
                }
            }
            this.f12861c.clear();
        }

        public void e() {
            D(false);
            b0.J3(this.f12861c);
        }

        public int f() {
            int i11 = 1;
            if (!this.f12863e) {
                return 1;
            }
            com.badlogic.gdx.utils.a<N> aVar = this.f12861c;
            N[] nArr = aVar.f13178a;
            int i12 = aVar.f13179b;
            for (int i13 = 0; i13 < i12; i13++) {
                i11 += nArr[i13].f();
            }
            return i11;
        }

        public void g() {
            D(true);
            com.badlogic.gdx.utils.a<N> aVar = this.f12861c;
            if (aVar.f13179b > 0) {
                b0.T3(aVar);
            }
        }

        public void h() {
            for (N n11 = this.f12860b; n11 != null; n11 = n11.f12860b) {
                n11.D(true);
            }
        }

        public void i(com.badlogic.gdx.utils.a<V> aVar) {
            if (!this.f12863e || b0.V3(this.f12861c, aVar)) {
                return;
            }
            aVar.a(this.f12866h);
        }

        @a3.d0
        public N j(V v11) {
            if (v11 != null) {
                return v11.equals(this.f12866h) ? this : (N) b0.W3(this.f12861c, v11);
            }
            throw new IllegalArgumentException("value cannot be null.");
        }

        public A k() {
            return this.f12859a;
        }

        public com.badlogic.gdx.utils.a<N> l() {
            return this.f12861c;
        }

        public float m() {
            return this.f12865g;
        }

        @a3.d0
        public z2.k n() {
            return this.f12864f;
        }

        public int o() {
            int i11 = 0;
            c<N, V, A> cVar = this;
            do {
                i11++;
                cVar = cVar.p();
            } while (cVar != null);
            return i11;
        }

        @a3.d0
        public N p() {
            return this.f12860b;
        }

        @a3.d0
        public b0<N, V> q() {
            x2.d A1 = this.f12859a.A1();
            if (A1 instanceof b0) {
                return (b0) A1;
            }
            return null;
        }

        @a3.d0
        public V r() {
            return this.f12866h;
        }

        public boolean s() {
            return this.f12861c.f13179b > 0;
        }

        public void t(int i11, N n11) {
            b0<N, V> q11;
            int f11;
            n11.f12860b = this;
            this.f12861c.r(i11, n11);
            if (this.f12863e && (q11 = q()) != null) {
                if (i11 == 0) {
                    f11 = this.f12859a.O1() + 1;
                } else {
                    com.badlogic.gdx.utils.a<N> aVar = this.f12861c;
                    if (i11 < aVar.f13179b - 1) {
                        f11 = aVar.get(i11 + 1).f12859a.O1();
                    } else {
                        N n12 = aVar.get(i11 - 1);
                        f11 = n12.f() + n12.f12859a.O1();
                    }
                }
                n11.c(q11, f11);
            }
        }

        public boolean u(N n11) {
            if (n11 == null) {
                throw new IllegalArgumentException("node cannot be null.");
            }
            while (n11 != this) {
                n11 = n11.f12860b;
                if (n11 == null) {
                    return false;
                }
            }
            return true;
        }

        public boolean v(N n11) {
            if (n11 == null) {
                throw new IllegalArgumentException("node cannot be null.");
            }
            N n12 = this;
            while (n12 != n11) {
                n12 = n12.f12860b;
                if (n12 == null) {
                    return false;
                }
            }
            return true;
        }

        public boolean w() {
            return this.f12863e;
        }

        public boolean x() {
            return this.f12862d;
        }

        public void y() {
            b0<N, V> q11 = q();
            if (q11 != null) {
                q11.q4(this);
                return;
            }
            N n11 = this.f12860b;
            if (n11 != null) {
                n11.z(this);
            }
        }

        public void z(N n11) {
            b0<N, V> q11;
            if (this.f12861c.C(n11, true) && this.f12863e && (q11 = q()) != null) {
                n11.A(q11, n11.f12859a.O1());
            }
        }

        public c() {
        }
    }
}
