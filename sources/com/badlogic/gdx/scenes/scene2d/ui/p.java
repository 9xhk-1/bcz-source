package com.badlogic.gdx.scenes.scene2d.ui;

import a3.j0;
import a3.l0;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.ui.l;
import com.badlogic.gdx.scenes.scene2d.ui.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class p<T> extends e0 implements z2.g {
    public static final Vector2 H = new Vector2();
    public float A;
    public float B;
    public z2.e C;
    public boolean D;
    public int E;
    public boolean F;
    public final z2.b<T> G;

    /* renamed from: x, reason: collision with root package name */
    public d f13018x;

    /* renamed from: y, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<T> f13019y;

    /* renamed from: z, reason: collision with root package name */
    public c<T> f13020z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends z2.b {
        public a(com.badlogic.gdx.utils.a aVar) {
            super(aVar);
        }

        @Override // z2.o
        public boolean h() {
            p pVar = p.this;
            if (pVar.F) {
                pVar.C0();
            }
            return super.h();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends z2.e {
        public b() {
        }

        @Override // z2.e, com.badlogic.gdx.scenes.scene2d.b
        public boolean i(InputEvent inputEvent, float f11, float f12, int i11, int i12) {
            if ((i11 == 0 && i12 != 0) || p.this.I()) {
                return false;
            }
            if (p.this.f13020z.R1()) {
                p.this.r3();
                return true;
            }
            p.this.G3();
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c<T> extends o {
        public final p<T> F1;
        public int G1;
        public final Vector2 H1;
        public final l<T> I1;
        public com.badlogic.gdx.scenes.scene2d.b J1;
        public com.badlogic.gdx.scenes.scene2d.a K1;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends z2.e {

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ p f13023p;

            public a(p pVar) {
                this.f13023p = pVar;
            }

            @Override // com.badlogic.gdx.scenes.scene2d.b
            public boolean g(InputEvent inputEvent, float f11, float f12) {
                int j32 = c.this.I1.j3(f12);
                if (j32 == -1) {
                    return true;
                }
                c.this.I1.w3(j32);
                return true;
            }

            @Override // z2.e
            public void m(InputEvent inputEvent, float f11, float f12) {
                T o32 = c.this.I1.o3();
                if (o32 != null) {
                    this.f13023p.G.o().j(51);
                }
                this.f13023p.G.f(o32);
                c.this.hide();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b extends com.badlogic.gdx.scenes.scene2d.b {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f13025b;

            public b(p pVar) {
                this.f13025b = pVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.badlogic.gdx.scenes.scene2d.b
            public void c(InputEvent inputEvent, float f11, float f12, int i11, @a3.d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
                Object l32;
                if ((aVar == null || !c.this.U1(aVar)) && (l32 = this.f13025b.l3()) != null) {
                    c.this.I1.f12958z.t(l32);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.badlogic.gdx.scenes.scene2d.ui.p$c$c, reason: collision with other inner class name */
        public class C0195c extends com.badlogic.gdx.scenes.scene2d.b {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f13027b;

            public C0195c(p pVar) {
                this.f13027b = pVar;
            }

            @Override // com.badlogic.gdx.scenes.scene2d.b
            public boolean d(InputEvent inputEvent, int i11) {
                if (i11 != 66) {
                    if (i11 != 111) {
                        if (i11 != 160) {
                            return false;
                        }
                    }
                    c.this.hide();
                    inputEvent.p();
                    return true;
                }
                this.f13027b.G.f(c.this.I1.o3());
                c.this.hide();
                inputEvent.p();
                return true;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.badlogic.gdx.scenes.scene2d.b
            public boolean i(InputEvent inputEvent, float f11, float f12, int i11, int i12) {
                if (c.this.U1(inputEvent.e())) {
                    return false;
                }
                c.this.I1.f12958z.t(this.f13027b.l3());
                c.this.hide();
                return false;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class d extends l<T> {
            public d(l.c cVar) {
                super(cVar);
            }

            @Override // com.badlogic.gdx.scenes.scene2d.ui.l
            public String A3(T t11) {
                return c.this.F1.H3(t11);
            }
        }

        public c(p<T> pVar) {
            super((com.badlogic.gdx.scenes.scene2d.a) null, pVar.f13018x.f13034f);
            this.H1 = new Vector2();
            this.F1 = pVar;
            M4(false, false);
            H4(false);
            V4(true, false);
            l<T> k52 = k5();
            this.I1 = k52;
            k52.L2(Touchable.disabled);
            k52.z3(true);
            E4(k52);
            k52.d1(new a(pVar));
            d1(new b(pVar));
            this.J1 = new C0195c(pVar);
        }

        @Override // x2.d, com.badlogic.gdx.scenes.scene2d.a
        public void K2(com.badlogic.gdx.scenes.scene2d.c cVar) {
            com.badlogic.gdx.scenes.scene2d.c F1 = F1();
            if (F1 != null) {
                F1.A1(this.J1);
                F1.B1(this.I1.l3());
            }
            super.K2(cVar);
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.o, x2.d, com.badlogic.gdx.scenes.scene2d.a
        public void a1(float f11) {
            super.a1(f11);
            Z2();
        }

        public void hide() {
            if (this.I1.Y1() && R1()) {
                this.I1.L2(Touchable.disabled);
                com.badlogic.gdx.scenes.scene2d.c F1 = F1();
                if (F1 != null) {
                    F1.A1(this.J1);
                    F1.B1(this.I1.l3());
                    com.badlogic.gdx.scenes.scene2d.a aVar = this.K1;
                    if (aVar != null && aVar.F1() == null) {
                        this.K1 = null;
                    }
                    com.badlogic.gdx.scenes.scene2d.a u12 = F1.u1();
                    if (u12 == null || U1(u12)) {
                        F1.N1(this.K1);
                    }
                }
                h1();
                this.F1.u3(this);
            }
        }

        public l<T> i5() {
            return this.I1;
        }

        public p<T> j5() {
            return this.F1;
        }

        public l<T> k5() {
            return new d(this.F1.f13018x.f13035g);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x00d7, code lost:
        
            if (r3 < 0.0f) goto L30;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void l5(com.badlogic.gdx.scenes.scene2d.c r15) {
            /*
                Method dump skipped, instructions count: 306
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.scenes.scene2d.ui.p.c.l5(com.badlogic.gdx.scenes.scene2d.c):void");
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.o, com.badlogic.gdx.scenes.scene2d.ui.f0, x2.d, com.badlogic.gdx.scenes.scene2d.a
        public void n1(w1.a aVar, float f11) {
            p<T> pVar = this.F1;
            Vector2 vector2 = p.H;
            pVar.e2(vector2.set(0.0f, 0.0f));
            if (!vector2.equals(this.H1)) {
                hide();
            }
            super.n1(aVar, f11);
        }
    }

    public p(q qVar) {
        this((d) qVar.R(d.class));
    }

    public void A3(boolean z11) {
        this.f13020z.V4(true, z11);
        C0();
    }

    public void B3(@a3.d0 T t11) {
        if (this.f13019y.l(t11, false)) {
            this.G.t(t11);
            return;
        }
        com.badlogic.gdx.utils.a<T> aVar = this.f13019y;
        if (aVar.f13179b > 0) {
            this.G.t(aVar.first());
        } else {
            this.G.clear();
        }
    }

    public void C3(int i11) {
        this.G.t(this.f13019y.get(i11));
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.e0, z2.l
    public void D() {
        d dVar = this.f13018x;
        z2.k kVar = dVar.f13033e;
        com.badlogic.gdx.graphics.g2d.a aVar = dVar.f13029a;
        if (kVar != null) {
            this.B = Math.max(((kVar.w() + kVar.s()) + aVar.Z()) - (aVar.n0() * 2.0f), kVar.o());
        } else {
            this.B = aVar.Z() - (aVar.n0() * 2.0f);
        }
        j0 d11 = l0.d(com.badlogic.gdx.graphics.g2d.d.class);
        com.badlogic.gdx.graphics.g2d.d dVar2 = (com.badlogic.gdx.graphics.g2d.d) d11.h();
        if (this.F) {
            this.A = 0.0f;
            if (kVar != null) {
                this.A = kVar.z() + kVar.u();
            }
            T l32 = l3();
            if (l32 != null) {
                dVar2.g(aVar, H3(l32));
                this.A += dVar2.f12062d;
            }
        } else {
            int i11 = 0;
            float f11 = 0.0f;
            while (true) {
                com.badlogic.gdx.utils.a<T> aVar2 = this.f13019y;
                if (i11 >= aVar2.f13179b) {
                    break;
                }
                dVar2.g(aVar, H3(aVar2.get(i11)));
                f11 = Math.max(dVar2.f12062d, f11);
                i11++;
            }
            this.A = f11;
            if (kVar != null) {
                this.A = Math.max(kVar.z() + f11 + kVar.u(), kVar.b());
            }
            d dVar3 = this.f13018x;
            l.c cVar = dVar3.f13035g;
            o.d dVar4 = dVar3.f13034f;
            float z11 = f11 + cVar.f12966d.z() + cVar.f12966d.u();
            z2.k kVar2 = dVar4.f13012a;
            if (kVar2 != null) {
                z11 = Math.max(z11 + kVar2.z() + kVar2.u(), kVar2.b());
            }
            c<T> cVar2 = this.f13020z;
            if (cVar2 == null || !cVar2.A1) {
                z2.k kVar3 = this.f13018x.f13034f.f13016e;
                float b11 = kVar3 != null ? kVar3.b() : 0.0f;
                z2.k kVar4 = this.f13018x.f13034f.f13017f;
                z11 += Math.max(b11, kVar4 != null ? kVar4.b() : 0.0f);
            }
            this.A = Math.max(this.A, z11);
        }
        d11.d(dVar2);
    }

    public void D3(boolean z11) {
        this.F = z11;
    }

    public void E3(d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("style cannot be null.");
        }
        this.f13018x = dVar;
        c<T> cVar = this.f13020z;
        if (cVar != null) {
            cVar.X4(dVar.f13034f);
            this.f13020z.I1.y3(dVar.f13035g);
        }
        C0();
    }

    @Deprecated
    public void F3() {
        G3();
    }

    public void G3() {
        if (this.f13019y.f13179b == 0 || F1() == null) {
            return;
        }
        this.f13020z.l5(F1());
    }

    public String H3(T t11) {
        return t11.toString();
    }

    @Override // z2.g
    public boolean I() {
        return this.D;
    }

    @Override // z2.g
    public void J0(boolean z11) {
        if (z11 && !this.D) {
            r3();
        }
        this.D = z11;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.a
    public void K2(com.badlogic.gdx.scenes.scene2d.c cVar) {
        if (cVar == null) {
            this.f13020z.hide();
        }
        super.K2(cVar);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.e0, z2.l
    public float R() {
        Q0();
        return this.B;
    }

    public void b3() {
        com.badlogic.gdx.utils.a<T> aVar = this.f13019y;
        if (aVar.f13179b == 0) {
            return;
        }
        aVar.clear();
        this.G.clear();
        this.f13020z.I1.b3();
        C0();
    }

    public com.badlogic.gdx.graphics.g2d.d c3(w1.a aVar, com.badlogic.gdx.graphics.g2d.a aVar2, T t11, float f11, float f12, float f13) {
        String H3 = H3(t11);
        return aVar2.D(aVar, H3, f11, f12, 0, H3.length(), f13, this.E, false, "...");
    }

    @a3.d0
    public z2.k d3() {
        z2.k kVar;
        z2.k kVar2;
        z2.k kVar3;
        return (!I() || (kVar3 = this.f13018x.f13038j) == null) ? (!this.f13020z.R1() || (kVar2 = this.f13018x.f13037i) == null) ? (!s3() || (kVar = this.f13018x.f13036h) == null) ? this.f13018x.f13033e : kVar : kVar2 : kVar3;
    }

    public z2.e e3() {
        return this.C;
    }

    public com.badlogic.gdx.graphics.b f3() {
        com.badlogic.gdx.graphics.b bVar;
        return (!I() || (bVar = this.f13018x.f13032d) == null) ? (this.f13018x.f13031c == null || !(s3() || this.f13020z.R1())) ? this.f13018x.f13030b : this.f13018x.f13031c : bVar;
    }

    public com.badlogic.gdx.utils.a<T> g3() {
        return this.f13019y;
    }

    public l<T> h3() {
        return this.f13020z.I1;
    }

    public int i3() {
        return this.f13020z.G1;
    }

    public float j3() {
        com.badlogic.gdx.graphics.g2d.d dVar = (com.badlogic.gdx.graphics.g2d.d) l0.d(com.badlogic.gdx.graphics.g2d.d.class).h();
        float f11 = 0.0f;
        int i11 = 0;
        while (true) {
            com.badlogic.gdx.utils.a<T> aVar = this.f13019y;
            if (i11 >= aVar.f13179b) {
                break;
            }
            dVar.g(this.f13018x.f13029a, H3(aVar.get(i11)));
            f11 = Math.max(dVar.f12062d, f11);
            i11++;
        }
        z2.k kVar = this.f13018x.f13033e;
        return kVar != null ? Math.max(f11 + kVar.z() + kVar.u(), kVar.b()) : f11;
    }

    public c k3() {
        return this.f13020z;
    }

    @a3.d0
    public T l3() {
        return this.G.first();
    }

    public int m3() {
        com.badlogic.gdx.utils.o<T> o11 = this.G.o();
        if (o11.f13401a == 0) {
            return -1;
        }
        return this.f13019y.q(o11.first(), false);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.e0, z2.l
    public float n0() {
        Q0();
        return this.A;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.e0, com.badlogic.gdx.scenes.scene2d.a
    public void n1(w1.a aVar, float f11) {
        float f12;
        float f13;
        Q0();
        z2.k d32 = d3();
        com.badlogic.gdx.graphics.b f32 = f3();
        com.badlogic.gdx.graphics.g2d.a aVar2 = this.f13018x.f13029a;
        com.badlogic.gdx.graphics.b e11 = e();
        float K1 = K1();
        float M1 = M1();
        float J1 = J1();
        float v12 = v1();
        aVar.k(e11.f11544a, e11.f11545b, e11.f11546c, e11.f11547d * f11);
        if (d32 != null) {
            d32.y(aVar, K1, M1, J1, v12);
        }
        T first = this.G.first();
        if (first != null) {
            if (d32 != null) {
                J1 -= d32.z() + d32.u();
                float s11 = v12 - (d32.s() + d32.w());
                K1 += d32.z();
                f12 = (s11 / 2.0f) + d32.s();
                f13 = aVar2.i0().f12010j;
            } else {
                f12 = v12 / 2.0f;
                f13 = aVar2.i0().f12010j;
            }
            float f14 = M1 + ((int) (f12 + (f13 / 2.0f)));
            float f15 = J1;
            float f16 = K1;
            aVar2.k(f32.f11544a, f32.f11545b, f32.f11546c, f32.f11547d * f11);
            c3(aVar, aVar2, first, f16, f14, f15);
        }
    }

    public boolean n3() {
        return this.F;
    }

    public z2.b<T> o3() {
        return this.G;
    }

    public d p3() {
        return this.f13018x;
    }

    @Deprecated
    public void q3() {
        r3();
    }

    public void r3() {
        this.f13020z.hide();
    }

    public boolean s3() {
        return this.C.x();
    }

    public c<T> t3() {
        return new c<>(this);
    }

    public void u3(com.badlogic.gdx.scenes.scene2d.a aVar) {
        aVar.e().f11547d = 1.0f;
        aVar.b1(y2.a.h0(y2.a.r(0.15f, com.badlogic.gdx.math.l.f12619e), y2.a.N()));
    }

    public void v3(com.badlogic.gdx.scenes.scene2d.a aVar, boolean z11) {
        aVar.e().f11547d = 0.0f;
        aVar.b1(y2.a.p(0.3f, com.badlogic.gdx.math.l.f12619e));
    }

    public void w3(int i11) {
        this.E = i11;
    }

    public void x3(com.badlogic.gdx.utils.a<T> aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("newItems cannot be null.");
        }
        float n02 = n0();
        com.badlogic.gdx.utils.a<T> aVar2 = this.f13019y;
        if (aVar != aVar2) {
            aVar2.clear();
            this.f13019y.g(aVar);
        }
        this.G.F();
        this.f13020z.I1.t3(this.f13019y);
        invalidate();
        if (n02 != n0()) {
            C0();
        }
    }

    public void y3(T... tArr) {
        if (tArr == null) {
            throw new IllegalArgumentException("newItems cannot be null.");
        }
        float n02 = n0();
        this.f13019y.clear();
        this.f13019y.j(tArr);
        this.G.F();
        this.f13020z.I1.t3(this.f13019y);
        invalidate();
        if (n02 != n0()) {
            C0();
        }
    }

    public void z3(int i11) {
        this.f13020z.G1 = i11;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public com.badlogic.gdx.graphics.g2d.a f13029a;

        /* renamed from: b, reason: collision with root package name */
        public com.badlogic.gdx.graphics.b f13030b;

        /* renamed from: c, reason: collision with root package name */
        @a3.d0
        public com.badlogic.gdx.graphics.b f13031c;

        /* renamed from: d, reason: collision with root package name */
        @a3.d0
        public com.badlogic.gdx.graphics.b f13032d;

        /* renamed from: e, reason: collision with root package name */
        @a3.d0
        public z2.k f13033e;

        /* renamed from: f, reason: collision with root package name */
        public o.d f13034f;

        /* renamed from: g, reason: collision with root package name */
        public l.c f13035g;

        /* renamed from: h, reason: collision with root package name */
        @a3.d0
        public z2.k f13036h;

        /* renamed from: i, reason: collision with root package name */
        @a3.d0
        public z2.k f13037i;

        /* renamed from: j, reason: collision with root package name */
        @a3.d0
        public z2.k f13038j;

        public d() {
            this.f13030b = new com.badlogic.gdx.graphics.b(1.0f, 1.0f, 1.0f, 1.0f);
        }

        public d(com.badlogic.gdx.graphics.g2d.a aVar, com.badlogic.gdx.graphics.b bVar, @a3.d0 z2.k kVar, o.d dVar, l.c cVar) {
            com.badlogic.gdx.graphics.b bVar2 = new com.badlogic.gdx.graphics.b(1.0f, 1.0f, 1.0f, 1.0f);
            this.f13030b = bVar2;
            this.f13029a = aVar;
            bVar2.H(bVar);
            this.f13033e = kVar;
            this.f13034f = dVar;
            this.f13035g = cVar;
        }

        public d(d dVar) {
            com.badlogic.gdx.graphics.b bVar = new com.badlogic.gdx.graphics.b(1.0f, 1.0f, 1.0f, 1.0f);
            this.f13030b = bVar;
            this.f13029a = dVar.f13029a;
            bVar.H(dVar.f13030b);
            if (dVar.f13031c != null) {
                this.f13031c = new com.badlogic.gdx.graphics.b(dVar.f13031c);
            }
            if (dVar.f13032d != null) {
                this.f13032d = new com.badlogic.gdx.graphics.b(dVar.f13032d);
            }
            this.f13033e = dVar.f13033e;
            this.f13034f = new o.d(dVar.f13034f);
            this.f13035g = new l.c(dVar.f13035g);
            this.f13036h = dVar.f13036h;
            this.f13037i = dVar.f13037i;
            this.f13038j = dVar.f13038j;
        }
    }

    public p(q qVar, String str) {
        this((d) qVar.X(str, d.class));
    }

    public p(d dVar) {
        com.badlogic.gdx.utils.a<T> aVar = new com.badlogic.gdx.utils.a<>();
        this.f13019y = aVar;
        this.E = 8;
        a aVar2 = new a(aVar);
        this.G = aVar2;
        E3(dVar);
        J2(n0(), R());
        aVar2.u(this);
        aVar2.y(true);
        this.f13020z = t3();
        b bVar = new b();
        this.C = bVar;
        d1(bVar);
    }
}
