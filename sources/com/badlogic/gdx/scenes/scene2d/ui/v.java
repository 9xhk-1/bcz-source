package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.scenes.scene2d.ui.a;
import com.badlogic.gdx.scenes.scene2d.ui.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class v extends com.badlogic.gdx.scenes.scene2d.ui.a {
    public k E1;
    public a F1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends a.b {

        /* renamed from: p, reason: collision with root package name */
        public com.badlogic.gdx.graphics.g2d.a f13068p;

        /* renamed from: q, reason: collision with root package name */
        @a3.d0
        public com.badlogic.gdx.graphics.b f13069q;

        /* renamed from: r, reason: collision with root package name */
        @a3.d0
        public com.badlogic.gdx.graphics.b f13070r;

        /* renamed from: s, reason: collision with root package name */
        @a3.d0
        public com.badlogic.gdx.graphics.b f13071s;

        /* renamed from: t, reason: collision with root package name */
        @a3.d0
        public com.badlogic.gdx.graphics.b f13072t;

        /* renamed from: u, reason: collision with root package name */
        @a3.d0
        public com.badlogic.gdx.graphics.b f13073u;

        /* renamed from: v, reason: collision with root package name */
        @a3.d0
        public com.badlogic.gdx.graphics.b f13074v;

        /* renamed from: w, reason: collision with root package name */
        @a3.d0
        public com.badlogic.gdx.graphics.b f13075w;

        /* renamed from: x, reason: collision with root package name */
        @a3.d0
        public com.badlogic.gdx.graphics.b f13076x;

        /* renamed from: y, reason: collision with root package name */
        @a3.d0
        public com.badlogic.gdx.graphics.b f13077y;

        public a() {
        }

        public a(@a3.d0 z2.k kVar, @a3.d0 z2.k kVar2, @a3.d0 z2.k kVar3, @a3.d0 com.badlogic.gdx.graphics.g2d.a aVar) {
            super(kVar, kVar2, kVar3);
            this.f13068p = aVar;
        }

        public a(a aVar) {
            super(aVar);
            this.f13068p = aVar.f13068p;
            if (aVar.f13069q != null) {
                this.f13069q = new com.badlogic.gdx.graphics.b(aVar.f13069q);
            }
            if (aVar.f13070r != null) {
                this.f13070r = new com.badlogic.gdx.graphics.b(aVar.f13070r);
            }
            if (aVar.f13071s != null) {
                this.f13071s = new com.badlogic.gdx.graphics.b(aVar.f13071s);
            }
            if (aVar.f13072t != null) {
                this.f13072t = new com.badlogic.gdx.graphics.b(aVar.f13072t);
            }
            if (aVar.f13073u != null) {
                this.f13073u = new com.badlogic.gdx.graphics.b(aVar.f13073u);
            }
            if (aVar.f13074v != null) {
                this.f13074v = new com.badlogic.gdx.graphics.b(aVar.f13074v);
            }
            if (aVar.f13075w != null) {
                this.f13075w = new com.badlogic.gdx.graphics.b(aVar.f13075w);
            }
            if (aVar.f13076x != null) {
                this.f13076x = new com.badlogic.gdx.graphics.b(aVar.f13076x);
            }
            if (aVar.f13077y != null) {
                this.f13077y = new com.badlogic.gdx.graphics.b(aVar.f13077y);
            }
        }
    }

    public v(@a3.d0 String str, q qVar) {
        this(str, (a) qVar.R(a.class));
        g5(qVar);
    }

    public CharSequence A5() {
        return this.E1.j3();
    }

    public k B5(String str, k.a aVar) {
        return new k(str, aVar);
    }

    public void C5(k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("label cannot be null.");
        }
        y5().m1(kVar);
        this.E1 = kVar;
    }

    public void D5(@a3.d0 String str) {
        this.E1.v3(str);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.a, com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.f0, x2.d, com.badlogic.gdx.scenes.scene2d.a
    public void n1(w1.a aVar, float f11) {
        this.E1.i3().f12954b = w5();
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
        sb2.append(name.indexOf(36) != -1 ? "TextButton " : "");
        sb2.append(name);
        sb2.append(": ");
        sb2.append((Object) this.E1.j3());
        return sb2.toString();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.a
    public void u5(a.b bVar) {
        if (bVar == null) {
            throw new NullPointerException("style cannot be null");
        }
        if (!(bVar instanceof a)) {
            throw new IllegalArgumentException("style must be a TextButtonStyle.");
        }
        a aVar = (a) bVar;
        this.F1 = aVar;
        super.u5(bVar);
        k kVar = this.E1;
        if (kVar != null) {
            k.a i32 = kVar.i3();
            i32.f12953a = aVar.f13068p;
            i32.f12954b = aVar.f13069q;
            this.E1.u3(i32);
        }
    }

    @a3.d0
    public com.badlogic.gdx.graphics.b w5() {
        com.badlogic.gdx.graphics.b bVar;
        com.badlogic.gdx.graphics.b bVar2;
        com.badlogic.gdx.graphics.b bVar3;
        com.badlogic.gdx.graphics.b bVar4;
        com.badlogic.gdx.graphics.b bVar5;
        if (I() && (bVar5 = this.F1.f13073u) != null) {
            return bVar5;
        }
        if (q5()) {
            if (o5() && (bVar4 = this.F1.f13075w) != null) {
                return bVar4;
            }
            com.badlogic.gdx.graphics.b bVar6 = this.F1.f13070r;
            if (bVar6 != null) {
                return bVar6;
            }
        }
        if (p5()) {
            if (o5()) {
                com.badlogic.gdx.graphics.b bVar7 = this.F1.f13076x;
                if (bVar7 != null) {
                    return bVar7;
                }
            } else {
                com.badlogic.gdx.graphics.b bVar8 = this.F1.f13071s;
                if (bVar8 != null) {
                    return bVar8;
                }
            }
        }
        boolean Q1 = Q1();
        if (o5()) {
            if (Q1 && (bVar3 = this.F1.f13077y) != null) {
                return bVar3;
            }
            com.badlogic.gdx.graphics.b bVar9 = this.F1.f13074v;
            if (bVar9 != null) {
                return bVar9;
            }
            if (p5() && (bVar2 = this.F1.f13071s) != null) {
                return bVar2;
            }
        }
        return (!Q1 || (bVar = this.F1.f13072t) == null) ? this.F1.f13069q : bVar;
    }

    public k x5() {
        return this.E1;
    }

    public c<k> y5() {
        return n4(this.E1);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.a
    /* renamed from: z5, reason: merged with bridge method [inline-methods] */
    public a m5() {
        return this.F1;
    }

    public v(@a3.d0 String str, q qVar, String str2) {
        this(str, (a) qVar.X(str2, a.class));
        g5(qVar);
    }

    public v(@a3.d0 String str, a aVar) {
        u5(aVar);
        k B5 = B5(str, new k.a(aVar.f13068p, aVar.f13069q));
        this.E1 = B5;
        B5.m3(1);
        I3(this.E1).q0();
        J2(n0(), R());
    }
}
