package com.badlogic.gdx.scenes.scene2d.ui;

import a3.l0;
import a3.u0;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import z2.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a extends Table implements z2.g {
    public boolean A1;
    public com.badlogic.gdx.scenes.scene2d.ui.b B1;
    public z2.e C1;
    public boolean D1;

    /* renamed from: y1, reason: collision with root package name */
    public b f12827y1;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f12828z1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.badlogic.gdx.scenes.scene2d.ui.a$a, reason: collision with other inner class name */
    public class C0194a extends z2.e {
        public C0194a() {
        }

        @Override // z2.e
        public void m(InputEvent inputEvent, float f11, float f12) {
            if (a.this.I()) {
                return;
            }
            a.this.s5(!r1.f12828z1, true);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        @a3.d0
        public z2.k f12830a;

        /* renamed from: b, reason: collision with root package name */
        @a3.d0
        public z2.k f12831b;

        /* renamed from: c, reason: collision with root package name */
        @a3.d0
        public z2.k f12832c;

        /* renamed from: d, reason: collision with root package name */
        @a3.d0
        public z2.k f12833d;

        /* renamed from: e, reason: collision with root package name */
        @a3.d0
        public z2.k f12834e;

        /* renamed from: f, reason: collision with root package name */
        @a3.d0
        public z2.k f12835f;

        /* renamed from: g, reason: collision with root package name */
        @a3.d0
        public z2.k f12836g;

        /* renamed from: h, reason: collision with root package name */
        @a3.d0
        public z2.k f12837h;

        /* renamed from: i, reason: collision with root package name */
        @a3.d0
        public z2.k f12838i;

        /* renamed from: j, reason: collision with root package name */
        public float f12839j;

        /* renamed from: k, reason: collision with root package name */
        public float f12840k;

        /* renamed from: l, reason: collision with root package name */
        public float f12841l;

        /* renamed from: m, reason: collision with root package name */
        public float f12842m;

        /* renamed from: n, reason: collision with root package name */
        public float f12843n;

        /* renamed from: o, reason: collision with root package name */
        public float f12844o;

        public b() {
        }

        public b(@a3.d0 z2.k kVar, @a3.d0 z2.k kVar2, @a3.d0 z2.k kVar3) {
            this.f12830a = kVar;
            this.f12831b = kVar2;
            this.f12835f = kVar3;
        }

        public b(b bVar) {
            this.f12830a = bVar.f12830a;
            this.f12831b = bVar.f12831b;
            this.f12832c = bVar.f12832c;
            this.f12833d = bVar.f12833d;
            this.f12834e = bVar.f12834e;
            this.f12835f = bVar.f12835f;
            this.f12836g = bVar.f12836g;
            this.f12837h = bVar.f12837h;
            this.f12838i = bVar.f12838i;
            this.f12839j = bVar.f12839j;
            this.f12840k = bVar.f12840k;
            this.f12841l = bVar.f12841l;
            this.f12842m = bVar.f12842m;
            this.f12843n = bVar.f12843n;
            this.f12844o = bVar.f12844o;
        }
    }

    public a(q qVar) {
        super(qVar);
        this.D1 = true;
        n5();
        u5((b) qVar.R(b.class));
        J2(n0(), R());
    }

    private void n5() {
        L2(Touchable.enabled);
        C0194a c0194a = new C0194a();
        this.C1 = c0194a;
        d1(c0194a);
    }

    @Override // z2.g
    public boolean I() {
        return this.A1;
    }

    @Override // z2.g
    public void J0(boolean z11) {
        this.A1 = z11;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public float R() {
        float R = super.R();
        z2.k kVar = this.f12827y1.f12830a;
        if (kVar != null) {
            R = Math.max(R, kVar.o());
        }
        z2.k kVar2 = this.f12827y1.f12831b;
        if (kVar2 != null) {
            R = Math.max(R, kVar2.o());
        }
        z2.k kVar3 = this.f12827y1.f12835f;
        return kVar3 != null ? Math.max(R, kVar3.o()) : R;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public float b() {
        return n0();
    }

    @a3.d0
    public z2.k j5() {
        z2.k kVar;
        z2.k kVar2;
        z2.k kVar3;
        z2.k kVar4;
        z2.k kVar5;
        if (I() && (kVar5 = this.f12827y1.f12834e) != null) {
            return kVar5;
        }
        if (q5()) {
            if (o5() && (kVar4 = this.f12827y1.f12837h) != null) {
                return kVar4;
            }
            z2.k kVar6 = this.f12827y1.f12831b;
            if (kVar6 != null) {
                return kVar6;
            }
        }
        if (p5()) {
            if (o5()) {
                z2.k kVar7 = this.f12827y1.f12836g;
                if (kVar7 != null) {
                    return kVar7;
                }
            } else {
                z2.k kVar8 = this.f12827y1.f12832c;
                if (kVar8 != null) {
                    return kVar8;
                }
            }
        }
        boolean Q1 = Q1();
        if (o5()) {
            if (Q1 && (kVar3 = this.f12827y1.f12838i) != null) {
                return kVar3;
            }
            z2.k kVar9 = this.f12827y1.f12835f;
            if (kVar9 != null) {
                return kVar9;
            }
            if (p5() && (kVar2 = this.f12827y1.f12832c) != null) {
                return kVar2;
            }
        }
        return (!Q1 || (kVar = this.f12827y1.f12833d) == null) ? this.f12827y1.f12830a : kVar;
    }

    @a3.d0
    public com.badlogic.gdx.scenes.scene2d.ui.b k5() {
        return this.B1;
    }

    public z2.e l5() {
        return this.C1;
    }

    public b m5() {
        return this.f12827y1;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public float n0() {
        float n02 = super.n0();
        z2.k kVar = this.f12827y1.f12830a;
        if (kVar != null) {
            n02 = Math.max(n02, kVar.b());
        }
        z2.k kVar2 = this.f12827y1.f12831b;
        if (kVar2 != null) {
            n02 = Math.max(n02, kVar2.b());
        }
        z2.k kVar3 = this.f12827y1.f12835f;
        return kVar3 != null ? Math.max(n02, kVar3.b()) : n02;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.f0, x2.d, com.badlogic.gdx.scenes.scene2d.a
    public void n1(w1.a aVar, float f11) {
        float f12;
        float f13;
        Q0();
        d5(j5());
        if (q5() && !I()) {
            b bVar = this.f12827y1;
            f12 = bVar.f12839j;
            f13 = bVar.f12840k;
        } else if (!o5() || I()) {
            b bVar2 = this.f12827y1;
            f12 = bVar2.f12841l;
            f13 = bVar2.f12842m;
        } else {
            b bVar3 = this.f12827y1;
            f12 = bVar3.f12843n;
            f13 = bVar3.f12844o;
        }
        boolean z11 = (f12 == 0.0f && f13 == 0.0f) ? false : true;
        u0<com.badlogic.gdx.scenes.scene2d.a> q32 = q3();
        if (z11) {
            for (int i11 = 0; i11 < q32.f13179b; i11++) {
                q32.get(i11).f2(f12, f13);
            }
        }
        super.n1(aVar, f11);
        if (z11) {
            for (int i12 = 0; i12 < q32.f13179b; i12++) {
                q32.get(i12).f2(-f12, -f13);
            }
        }
        com.badlogic.gdx.scenes.scene2d.c F1 = F1();
        if (F1 == null || !F1.m1() || q5() == this.C1.z()) {
            return;
        }
        q1.g.f81379b.w();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public float o() {
        return R();
    }

    public boolean o5() {
        return this.f12828z1;
    }

    public boolean p5() {
        return this.C1.x();
    }

    public boolean q5() {
        return this.C1.A();
    }

    public void r5(boolean z11) {
        s5(z11, this.D1);
    }

    public void s5(boolean z11, boolean z12) {
        if (this.f12828z1 == z11) {
            return;
        }
        com.badlogic.gdx.scenes.scene2d.ui.b bVar = this.B1;
        if (bVar == null || bVar.c(this, z11)) {
            this.f12828z1 = z11;
            if (z12) {
                d.a aVar = (d.a) l0.f(d.a.class);
                if (q1(aVar)) {
                    this.f12828z1 = !z11;
                }
                l0.a(aVar);
            }
        }
    }

    public void t5(boolean z11) {
        this.D1 = z11;
    }

    public void u5(b bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("style cannot be null.");
        }
        this.f12827y1 = bVar;
        d5(j5());
    }

    public void v5() {
        r5(!this.f12828z1);
    }

    public a(q qVar, String str) {
        super(qVar);
        this.D1 = true;
        n5();
        u5((b) qVar.X(str, b.class));
        J2(n0(), R());
    }

    public a(com.badlogic.gdx.scenes.scene2d.a aVar, q qVar, String str) {
        this(aVar, (b) qVar.X(str, b.class));
        g5(qVar);
    }

    public a(com.badlogic.gdx.scenes.scene2d.a aVar, b bVar) {
        this.D1 = true;
        n5();
        I3(aVar);
        u5(bVar);
        J2(n0(), R());
    }

    public a(b bVar) {
        this.D1 = true;
        n5();
        u5(bVar);
        J2(n0(), R());
    }

    public a() {
        this.D1 = true;
        n5();
    }

    public a(@a3.d0 z2.k kVar) {
        this(new b(kVar, null, null));
    }

    public a(@a3.d0 z2.k kVar, @a3.d0 z2.k kVar2) {
        this(new b(kVar, kVar2, null));
    }

    public a(@a3.d0 z2.k kVar, @a3.d0 z2.k kVar2, @a3.d0 z2.k kVar3) {
        this(new b(kVar, kVar2, kVar3));
    }

    public a(com.badlogic.gdx.scenes.scene2d.a aVar, q qVar) {
        this(aVar, (b) qVar.R(b.class));
    }
}
