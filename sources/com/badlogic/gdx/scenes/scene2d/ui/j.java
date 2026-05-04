package com.badlogic.gdx.scenes.scene2d.ui;

import a3.q0;
import com.badlogic.gdx.scenes.scene2d.ui.a;
import com.badlogic.gdx.scenes.scene2d.ui.k;
import com.badlogic.gdx.scenes.scene2d.ui.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class j extends com.badlogic.gdx.scenes.scene2d.ui.a {
    public final h E1;
    public k F1;
    public a G1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends v.a {

        @a3.d0
        public z2.k A;

        @a3.d0
        public z2.k B;

        @a3.d0
        public z2.k C;

        @a3.d0
        public z2.k D;

        @a3.d0
        public z2.k E;

        @a3.d0
        public z2.k F;

        /* renamed from: z, reason: collision with root package name */
        @a3.d0
        public z2.k f12949z;

        public a() {
        }

        public a(@a3.d0 z2.k kVar, @a3.d0 z2.k kVar2, @a3.d0 z2.k kVar3, com.badlogic.gdx.graphics.g2d.a aVar) {
            super(kVar, kVar2, kVar3, aVar);
        }

        public a(a aVar) {
            super(aVar);
            this.f12949z = aVar.f12949z;
            this.A = aVar.A;
            this.B = aVar.B;
            this.C = aVar.C;
            this.D = aVar.D;
            this.E = aVar.E;
            this.F = aVar.F;
        }

        public a(v.a aVar) {
            super(aVar);
        }
    }

    public j(@a3.d0 String str, q qVar) {
        this(str, (a) qVar.R(a.class));
        g5(qVar);
    }

    public k A5() {
        return this.F1;
    }

    public c B5() {
        return n4(this.F1);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.a
    /* renamed from: C5, reason: merged with bridge method [inline-methods] */
    public a m5() {
        return this.G1;
    }

    public CharSequence D5() {
        return this.F1.j3();
    }

    public h E5() {
        return new h((z2.k) null, q0.f1616b);
    }

    public k F5(String str, k.a aVar) {
        return new k(str, aVar);
    }

    public void G5(k kVar) {
        B5().m1(kVar);
        this.F1 = kVar;
    }

    public void H5(CharSequence charSequence) {
        this.F1.v3(charSequence);
    }

    public void I5() {
        this.E1.j3(z5());
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.a, com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.f0, x2.d, com.badlogic.gdx.scenes.scene2d.a
    public void n1(w1.a aVar, float f11) {
        I5();
        this.F1.i3().f12954b = w5();
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
        sb2.append(name.indexOf(36) != -1 ? "ImageTextButton " : "");
        sb2.append(name);
        sb2.append(": ");
        sb2.append(this.E1.c3());
        sb2.append(" ");
        sb2.append((Object) this.F1.j3());
        return sb2.toString();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.a
    public void u5(a.b bVar) {
        if (!(bVar instanceof a)) {
            throw new IllegalArgumentException("style must be a ImageTextButtonStyle.");
        }
        a aVar = (a) bVar;
        this.G1 = aVar;
        super.u5(bVar);
        if (this.E1 != null) {
            I5();
        }
        k kVar = this.F1;
        if (kVar != null) {
            k.a i32 = kVar.i3();
            i32.f12953a = aVar.f13068p;
            i32.f12954b = w5();
            this.F1.u3(i32);
        }
    }

    @a3.d0
    public com.badlogic.gdx.graphics.b w5() {
        com.badlogic.gdx.graphics.b bVar;
        com.badlogic.gdx.graphics.b bVar2;
        com.badlogic.gdx.graphics.b bVar3;
        com.badlogic.gdx.graphics.b bVar4;
        com.badlogic.gdx.graphics.b bVar5;
        if (I() && (bVar5 = this.G1.f13073u) != null) {
            return bVar5;
        }
        if (q5()) {
            if (o5() && (bVar4 = this.G1.f13075w) != null) {
                return bVar4;
            }
            com.badlogic.gdx.graphics.b bVar6 = this.G1.f13070r;
            if (bVar6 != null) {
                return bVar6;
            }
        }
        if (p5()) {
            if (o5()) {
                com.badlogic.gdx.graphics.b bVar7 = this.G1.f13076x;
                if (bVar7 != null) {
                    return bVar7;
                }
            } else {
                com.badlogic.gdx.graphics.b bVar8 = this.G1.f13071s;
                if (bVar8 != null) {
                    return bVar8;
                }
            }
        }
        boolean Q1 = Q1();
        if (o5()) {
            if (Q1 && (bVar3 = this.G1.f13077y) != null) {
                return bVar3;
            }
            com.badlogic.gdx.graphics.b bVar9 = this.G1.f13074v;
            if (bVar9 != null) {
                return bVar9;
            }
            if (p5() && (bVar2 = this.G1.f13071s) != null) {
                return bVar2;
            }
        }
        return (!Q1 || (bVar = this.G1.f13072t) == null) ? this.G1.f13069q : bVar;
    }

    public h x5() {
        return this.E1;
    }

    public c y5() {
        return n4(this.E1);
    }

    @a3.d0
    public z2.k z5() {
        z2.k kVar;
        z2.k kVar2;
        z2.k kVar3;
        if (I() && (kVar3 = this.G1.C) != null) {
            return kVar3;
        }
        if (q5()) {
            if (o5() && (kVar2 = this.G1.E) != null) {
                return kVar2;
            }
            z2.k kVar4 = this.G1.A;
            if (kVar4 != null) {
                return kVar4;
            }
        }
        if (p5()) {
            if (o5()) {
                z2.k kVar5 = this.G1.F;
                if (kVar5 != null) {
                    return kVar5;
                }
            } else {
                z2.k kVar6 = this.G1.B;
                if (kVar6 != null) {
                    return kVar6;
                }
            }
        }
        if (o5()) {
            z2.k kVar7 = this.G1.D;
            if (kVar7 != null) {
                return kVar7;
            }
            if (p5() && (kVar = this.G1.B) != null) {
                return kVar;
            }
        }
        return this.G1.f12949z;
    }

    public j(@a3.d0 String str, q qVar, String str2) {
        this(str, (a) qVar.X(str2, a.class));
        g5(qVar);
    }

    public j(@a3.d0 String str, a aVar) {
        super(aVar);
        this.G1 = aVar;
        g4().x1(3.0f);
        h E5 = E5();
        this.E1 = E5;
        k F5 = F5(str, new k.a(aVar.f13068p, aVar.f13069q));
        this.F1 = F5;
        F5.m3(1);
        I3(E5);
        I3(this.F1);
        u5(aVar);
        J2(n0(), R());
    }
}
