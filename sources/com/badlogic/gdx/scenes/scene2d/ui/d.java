package com.badlogic.gdx.scenes.scene2d.ui;

import a3.q0;
import com.badlogic.gdx.scenes.scene2d.ui.a;
import com.badlogic.gdx.scenes.scene2d.ui.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d extends v {
    public h G1;
    public c H1;
    public a I1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends v.a {
        public z2.k A;

        @a3.d0
        public z2.k B;

        @a3.d0
        public z2.k C;

        @a3.d0
        public z2.k D;

        @a3.d0
        public z2.k E;

        /* renamed from: z, reason: collision with root package name */
        public z2.k f12915z;

        public a() {
        }

        public a(z2.k kVar, z2.k kVar2, com.badlogic.gdx.graphics.g2d.a aVar, @a3.d0 com.badlogic.gdx.graphics.b bVar) {
            this.A = kVar;
            this.f12915z = kVar2;
            this.f13068p = aVar;
            this.f13069q = bVar;
        }

        public a(a aVar) {
            super(aVar);
            this.A = aVar.A;
            this.f12915z = aVar.f12915z;
            this.B = aVar.B;
            this.C = aVar.C;
            this.D = aVar.D;
            this.E = aVar.E;
        }
    }

    public d(@a3.d0 String str, q qVar) {
        this(str, (a) qVar.R(a.class));
    }

    public h E5() {
        return this.G1;
    }

    public c F5() {
        return this.H1;
    }

    @a3.d0
    public z2.k G5() {
        z2.k kVar;
        a aVar;
        z2.k kVar2;
        z2.k kVar3;
        z2.k kVar4;
        if (I()) {
            return (!this.f12828z1 || (kVar4 = this.I1.D) == null) ? this.I1.E : kVar4;
        }
        boolean z11 = p5() && !I();
        return (!this.f12828z1 || (kVar2 = (aVar = this.I1).f12915z) == null) ? (!z11 || (kVar = this.I1.C) == null) ? this.I1.A : kVar : (!z11 || (kVar3 = aVar.B) == null) ? kVar2 : kVar3;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.v
    /* renamed from: H5, reason: merged with bridge method [inline-methods] */
    public a m5() {
        return this.I1;
    }

    public h I5() {
        return new h((z2.k) null, q0.f1624j);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.v, com.badlogic.gdx.scenes.scene2d.ui.a, com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.f0, x2.d, com.badlogic.gdx.scenes.scene2d.a
    public void n1(w1.a aVar, float f11) {
        this.G1.j3(G5());
        super.n1(aVar, f11);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.v, com.badlogic.gdx.scenes.scene2d.ui.a
    public void u5(a.b bVar) {
        if (!(bVar instanceof a)) {
            throw new IllegalArgumentException("style must be a CheckBoxStyle.");
        }
        this.I1 = (a) bVar;
        super.u5(bVar);
    }

    public d(@a3.d0 String str, q qVar, String str2) {
        this(str, (a) qVar.X(str2, a.class));
    }

    public d(@a3.d0 String str, a aVar) {
        super(str, aVar);
        k x52 = x5();
        x52.m3(8);
        h I5 = I5();
        this.G1 = I5;
        I5.j3(aVar.A);
        i3();
        this.H1 = I3(this.G1);
        I3(x52);
        J2(n0(), R());
    }
}
