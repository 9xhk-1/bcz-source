package com.badlogic.gdx.scenes.scene2d.ui;

import a3.q0;
import com.badlogic.gdx.scenes.scene2d.ui.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class i extends com.badlogic.gdx.scenes.scene2d.ui.a {
    public final h E1;
    public a F1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends a.b {

        /* renamed from: p, reason: collision with root package name */
        @a3.d0
        public z2.k f12942p;

        /* renamed from: q, reason: collision with root package name */
        @a3.d0
        public z2.k f12943q;

        /* renamed from: r, reason: collision with root package name */
        @a3.d0
        public z2.k f12944r;

        /* renamed from: s, reason: collision with root package name */
        @a3.d0
        public z2.k f12945s;

        /* renamed from: t, reason: collision with root package name */
        @a3.d0
        public z2.k f12946t;

        /* renamed from: u, reason: collision with root package name */
        @a3.d0
        public z2.k f12947u;

        /* renamed from: v, reason: collision with root package name */
        @a3.d0
        public z2.k f12948v;

        public a() {
        }

        public a(@a3.d0 z2.k kVar, @a3.d0 z2.k kVar2, @a3.d0 z2.k kVar3, @a3.d0 z2.k kVar4, @a3.d0 z2.k kVar5, @a3.d0 z2.k kVar6) {
            super(kVar, kVar2, kVar3);
            this.f12942p = kVar4;
            this.f12943q = kVar5;
            this.f12946t = kVar6;
        }

        public a(a aVar) {
            super(aVar);
            this.f12942p = aVar.f12942p;
            this.f12943q = aVar.f12943q;
            this.f12944r = aVar.f12944r;
            this.f12945s = aVar.f12945s;
            this.f12946t = aVar.f12946t;
            this.f12947u = aVar.f12947u;
            this.f12948v = aVar.f12948v;
        }

        public a(a.b bVar) {
            super(bVar);
        }
    }

    public i(q qVar) {
        this((a) qVar.R(a.class));
        g5(qVar);
    }

    public h A5() {
        return new h((z2.k) null, q0.f1616b);
    }

    public void B5() {
        this.E1.j3(y5());
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.a, com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.f0, x2.d, com.badlogic.gdx.scenes.scene2d.a
    public void n1(w1.a aVar, float f11) {
        B5();
        super.n1(aVar, f11);
    }

    @Override // x2.d, com.badlogic.gdx.scenes.scene2d.a
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
        sb2.append(name.indexOf(36) != -1 ? "ImageButton " : "");
        sb2.append(name);
        sb2.append(": ");
        sb2.append(this.E1.c3());
        return sb2.toString();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.a
    public void u5(a.b bVar) {
        if (!(bVar instanceof a)) {
            throw new IllegalArgumentException("style must be an ImageButtonStyle.");
        }
        this.F1 = (a) bVar;
        super.u5(bVar);
        if (this.E1 != null) {
            B5();
        }
    }

    public h w5() {
        return this.E1;
    }

    public c x5() {
        return n4(this.E1);
    }

    @a3.d0
    public z2.k y5() {
        z2.k kVar;
        z2.k kVar2;
        z2.k kVar3;
        if (I() && (kVar3 = this.F1.f12945s) != null) {
            return kVar3;
        }
        if (q5()) {
            if (o5() && (kVar2 = this.F1.f12947u) != null) {
                return kVar2;
            }
            z2.k kVar4 = this.F1.f12943q;
            if (kVar4 != null) {
                return kVar4;
            }
        }
        if (p5()) {
            if (o5()) {
                z2.k kVar5 = this.F1.f12948v;
                if (kVar5 != null) {
                    return kVar5;
                }
            } else {
                z2.k kVar6 = this.F1.f12944r;
                if (kVar6 != null) {
                    return kVar6;
                }
            }
        }
        if (o5()) {
            z2.k kVar7 = this.F1.f12946t;
            if (kVar7 != null) {
                return kVar7;
            }
            if (p5() && (kVar = this.F1.f12944r) != null) {
                return kVar;
            }
        }
        return this.F1.f12942p;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.a
    /* renamed from: z5, reason: merged with bridge method [inline-methods] */
    public a m5() {
        return this.F1;
    }

    public i(q qVar, String str) {
        this((a) qVar.X(str, a.class));
        g5(qVar);
    }

    public i(a aVar) {
        super(aVar);
        h A5 = A5();
        this.E1 = A5;
        I3(A5);
        u5(aVar);
        J2(n0(), R());
    }

    public i(@a3.d0 z2.k kVar) {
        this(new a(null, null, null, kVar, null, null));
    }

    public i(@a3.d0 z2.k kVar, @a3.d0 z2.k kVar2) {
        this(new a(null, null, null, kVar, kVar2, null));
    }

    public i(@a3.d0 z2.k kVar, @a3.d0 z2.k kVar2, @a3.d0 z2.k kVar3) {
        this(new a(null, null, null, kVar, kVar2, kVar3));
    }
}
