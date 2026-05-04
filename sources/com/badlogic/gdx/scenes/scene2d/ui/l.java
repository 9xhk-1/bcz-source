package com.badlogic.gdx.scenes.scene2d.ui;

import a3.j0;
import a3.l0;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.InputEvent;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class l<T> extends e0 implements z2.f {
    public Rectangle A;
    public float B;
    public float C;
    public float D;
    public int E;
    public int F;
    public int G;
    public com.badlogic.gdx.scenes.scene2d.b H;
    public boolean I;

    /* renamed from: x, reason: collision with root package name */
    public c f12956x;

    /* renamed from: y, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<T> f12957y;

    /* renamed from: z, reason: collision with root package name */
    public z2.b<T> f12958z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends com.badlogic.gdx.scenes.scene2d.b {

        /* renamed from: b, reason: collision with root package name */
        public long f12959b;

        /* renamed from: c, reason: collision with root package name */
        public String f12960c;

        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.badlogic.gdx.scenes.scene2d.b
        public boolean d(InputEvent inputEvent, int i11) {
            if (l.this.f12957y.isEmpty()) {
                return false;
            }
            if (i11 == 3) {
                l.this.w3(0);
                return true;
            }
            if (i11 != 29) {
                if (i11 == 111) {
                    if (l.this.F1() != null) {
                        l.this.F1().L1(null);
                    }
                    return true;
                }
                if (i11 == 123) {
                    l lVar = l.this;
                    lVar.w3(lVar.f12957y.f13179b - 1);
                    return true;
                }
                if (i11 == 19) {
                    l lVar2 = l.this;
                    int q11 = lVar2.f12957y.q(lVar2.o3(), false) - 1;
                    if (q11 < 0) {
                        q11 = l.this.f12957y.f13179b - 1;
                    }
                    l.this.w3(q11);
                    return true;
                }
                if (i11 == 20) {
                    l lVar3 = l.this;
                    int q12 = lVar3.f12957y.q(lVar3.o3(), false) + 1;
                    l lVar4 = l.this;
                    lVar4.w3(q12 < lVar4.f12957y.f13179b ? q12 : 0);
                    return true;
                }
            } else if (z2.t.c() && l.this.f12958z.k()) {
                l.this.f12958z.clear();
                l lVar5 = l.this;
                lVar5.f12958z.b(lVar5.f12957y);
                return true;
            }
            return false;
        }

        @Override // com.badlogic.gdx.scenes.scene2d.b
        public boolean e(InputEvent inputEvent, char c11) {
            if (!l.this.I) {
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis > this.f12959b) {
                this.f12960c = "";
            }
            this.f12959b = currentTimeMillis + 300;
            this.f12960c += Character.toLowerCase(c11);
            int i11 = l.this.f12957y.f13179b;
            int i12 = 0;
            while (true) {
                if (i12 >= i11) {
                    break;
                }
                l lVar = l.this;
                if (lVar.A3(lVar.f12957y.get(i12)).toLowerCase().startsWith(this.f12960c)) {
                    l.this.w3(i12);
                    break;
                }
                i12++;
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends com.badlogic.gdx.scenes.scene2d.b {
        public b() {
        }

        @Override // com.badlogic.gdx.scenes.scene2d.b
        public void c(InputEvent inputEvent, float f11, float f12, int i11, com.badlogic.gdx.scenes.scene2d.a aVar) {
            if (i11 == 0) {
                l.this.F = -1;
            }
            if (i11 == -1) {
                l.this.G = -1;
            }
        }

        @Override // com.badlogic.gdx.scenes.scene2d.b
        public boolean g(InputEvent inputEvent, float f11, float f12) {
            l lVar = l.this;
            lVar.G = lVar.j3(f12);
            return false;
        }

        @Override // com.badlogic.gdx.scenes.scene2d.b
        public boolean i(InputEvent inputEvent, float f11, float f12, int i11, int i12) {
            int j32;
            if (i11 != 0 || i12 != 0 || l.this.f12958z.I()) {
                return true;
            }
            if (l.this.F1() != null) {
                l.this.F1().L1(l.this);
            }
            l lVar = l.this;
            if (lVar.f12957y.f13179b == 0 || (j32 = lVar.j3(f12)) == -1) {
                return true;
            }
            l lVar2 = l.this;
            lVar2.f12958z.f(lVar2.f12957y.get(j32));
            l.this.F = j32;
            return true;
        }

        @Override // com.badlogic.gdx.scenes.scene2d.b
        public void j(InputEvent inputEvent, float f11, float f12, int i11) {
            l lVar = l.this;
            lVar.G = lVar.j3(f12);
        }

        @Override // com.badlogic.gdx.scenes.scene2d.b
        public void k(InputEvent inputEvent, float f11, float f12, int i11, int i12) {
            if (i11 == 0 && i12 == 0) {
                l.this.F = -1;
            }
        }
    }

    public l(q qVar) {
        this((c) qVar.R(c.class));
    }

    public String A3(T t11) {
        return t11.toString();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.e0, z2.l
    public void D() {
        c cVar = this.f12956x;
        com.badlogic.gdx.graphics.g2d.a aVar = cVar.f12963a;
        z2.k kVar = cVar.f12966d;
        float Z = aVar.Z() - (aVar.n0() * 2.0f);
        this.D = Z;
        this.D = Z + kVar.w() + kVar.s();
        this.B = 0.0f;
        j0 d11 = l0.d(com.badlogic.gdx.graphics.g2d.d.class);
        com.badlogic.gdx.graphics.g2d.d dVar = (com.badlogic.gdx.graphics.g2d.d) d11.h();
        int i11 = 0;
        while (true) {
            com.badlogic.gdx.utils.a<T> aVar2 = this.f12957y;
            if (i11 >= aVar2.f13179b) {
                break;
            }
            dVar.g(aVar, A3(aVar2.get(i11)));
            this.B = Math.max(dVar.f12062d, this.B);
            i11++;
        }
        d11.d(dVar);
        float z11 = this.B + kVar.z() + kVar.u();
        this.B = z11;
        this.C = this.f12957y.f13179b * this.D;
        z2.k kVar2 = this.f12956x.f12969g;
        if (kVar2 != null) {
            this.B = Math.max(z11 + kVar2.z() + kVar2.u(), kVar2.b());
            this.C = Math.max(this.C + kVar2.w() + kVar2.s(), kVar2.o());
        }
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.e0, z2.l
    public float R() {
        Q0();
        return this.C;
    }

    public void b3() {
        com.badlogic.gdx.utils.a<T> aVar = this.f12957y;
        if (aVar.f13179b == 0) {
            return;
        }
        aVar.clear();
        this.G = -1;
        this.F = -1;
        this.f12958z.clear();
        C0();
    }

    public void c3(w1.a aVar, float f11) {
        if (this.f12956x.f12969g != null) {
            com.badlogic.gdx.graphics.b e11 = e();
            aVar.k(e11.f11544a, e11.f11545b, e11.f11546c, e11.f11547d * f11);
            this.f12956x.f12969g.y(aVar, K1(), M1(), J1(), v1());
        }
    }

    public com.badlogic.gdx.graphics.g2d.d d3(w1.a aVar, com.badlogic.gdx.graphics.g2d.a aVar2, int i11, T t11, float f11, float f12, float f13) {
        String A3 = A3(t11);
        return aVar2.D(aVar, A3, f11, f12, 0, A3.length(), f13, this.E, false, "...");
    }

    public void e3(w1.a aVar, @a3.d0 z2.k kVar, float f11, float f12, float f13, float f14) {
        if (kVar != null) {
            kVar.y(aVar, f11, f12, f13, f14);
        }
    }

    public int f3() {
        return this.E;
    }

    public Rectangle g3() {
        return this.A;
    }

    @a3.d0
    public T h3(float f11) {
        int j32 = j3(f11);
        if (j32 == -1) {
            return null;
        }
        return this.f12957y.get(j32);
    }

    @Override // z2.f
    public void i0(@a3.d0 Rectangle rectangle) {
        this.A = rectangle;
    }

    public float i3() {
        return this.D;
    }

    public int j3(float f11) {
        float v12 = v1();
        z2.k kVar = this.f12956x.f12969g;
        if (kVar != null) {
            v12 -= kVar.w() + kVar.s();
            f11 -= kVar.s();
        }
        int i11 = (int) ((v12 - f11) / this.D);
        if (i11 < 0 || i11 >= this.f12957y.f13179b) {
            return -1;
        }
        return i11;
    }

    public com.badlogic.gdx.utils.a<T> k3() {
        return this.f12957y;
    }

    public com.badlogic.gdx.scenes.scene2d.b l3() {
        return this.H;
    }

    public T m3() {
        int i11 = this.G;
        if (i11 == -1) {
            return null;
        }
        return this.f12957y.get(i11);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.e0, z2.l
    public float n0() {
        Q0();
        return this.B;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.e0, com.badlogic.gdx.scenes.scene2d.a
    public void n1(w1.a aVar, float f11) {
        float f12;
        float f13;
        float f14;
        int i11;
        com.badlogic.gdx.graphics.g2d.a aVar2;
        T t11;
        z2.k kVar;
        l<T> lVar = this;
        lVar.Q0();
        c3(aVar, f11);
        c cVar = lVar.f12956x;
        com.badlogic.gdx.graphics.g2d.a aVar3 = cVar.f12963a;
        z2.k kVar2 = cVar.f12966d;
        com.badlogic.gdx.graphics.b bVar = cVar.f12964b;
        com.badlogic.gdx.graphics.b bVar2 = cVar.f12965c;
        com.badlogic.gdx.graphics.b e11 = lVar.e();
        w1.a aVar4 = aVar;
        aVar4.k(e11.f11544a, e11.f11545b, e11.f11546c, e11.f11547d * f11);
        float K1 = lVar.K1();
        float M1 = lVar.M1();
        float J1 = lVar.J1();
        float v12 = lVar.v1();
        z2.k kVar3 = lVar.f12956x.f12969g;
        if (kVar3 != null) {
            float z11 = kVar3.z();
            K1 += z11;
            v12 -= kVar3.w();
            J1 -= z11 + kVar3.u();
        }
        float f15 = v12;
        float f16 = K1;
        float z12 = kVar2.z();
        float u11 = (J1 - z12) - kVar2.u();
        float w11 = kVar2.w() - aVar3.n0();
        float f17 = f15;
        aVar3.k(bVar2.f11544a, bVar2.f11545b, bVar2.f11546c, bVar2.f11547d * f11);
        int i12 = 0;
        while (true) {
            com.badlogic.gdx.utils.a<T> aVar5 = lVar.f12957y;
            if (i12 >= aVar5.f13179b) {
                return;
            }
            Rectangle rectangle = lVar.A;
            if (rectangle != null) {
                float f18 = f17 - lVar.D;
                f12 = J1;
                float f19 = rectangle.f12534y;
                if (f18 > rectangle.height + f19 || f17 < f19) {
                    if (f17 < f19) {
                        return;
                    }
                    f13 = f16;
                    aVar2 = aVar3;
                    f14 = u11;
                    i11 = i12;
                    f17 -= lVar.D;
                    i12 = i11 + 1;
                    aVar4 = aVar;
                    u11 = f14;
                    f16 = f13;
                    aVar3 = aVar2;
                    J1 = f12;
                }
            } else {
                f12 = J1;
            }
            T t12 = aVar5.get(i12);
            boolean contains = lVar.f12958z.contains(t12);
            if (lVar.F == i12 && (kVar = lVar.f12956x.f12967e) != null) {
                t11 = t12;
            } else if (contains) {
                t11 = t12;
                aVar3.k(bVar.f11544a, bVar.f11545b, bVar.f11546c, bVar.f11547d * f11);
                kVar = kVar2;
            } else {
                t11 = t12;
                if (lVar.G != i12 || (kVar = lVar.f12956x.f12968f) == null) {
                    kVar = null;
                }
            }
            float f21 = M1 + f17;
            float f22 = lVar.D;
            lVar.e3(aVar4, kVar, f16, f21 - f22, f12, f22);
            f13 = f16;
            lVar = this;
            aVar2 = aVar3;
            f14 = u11;
            i11 = i12;
            lVar.d3(aVar, aVar2, i11, t11, f13 + z12, f21 - w11, f14);
            if (contains) {
                aVar2.k(bVar2.f11544a, bVar2.f11545b, bVar2.f11546c, bVar2.f11547d * f11);
            }
            f17 -= lVar.D;
            i12 = i11 + 1;
            aVar4 = aVar;
            u11 = f14;
            f16 = f13;
            aVar3 = aVar2;
            J1 = f12;
        }
    }

    public T n3() {
        int i11 = this.F;
        if (i11 == -1) {
            return null;
        }
        return this.f12957y.get(i11);
    }

    @a3.d0
    public T o3() {
        return this.f12958z.first();
    }

    public int p3() {
        com.badlogic.gdx.utils.o<T> o11 = this.f12958z.o();
        if (o11.f13401a == 0) {
            return -1;
        }
        return this.f12957y.q(o11.first(), false);
    }

    public z2.b<T> q3() {
        return this.f12958z;
    }

    public c r3() {
        return this.f12956x;
    }

    public void s3(int i11) {
        this.E = i11;
    }

    public void t3(com.badlogic.gdx.utils.a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("newItems cannot be null.");
        }
        float n02 = n0();
        float R = R();
        com.badlogic.gdx.utils.a<T> aVar2 = this.f12957y;
        if (aVar != aVar2) {
            aVar2.clear();
            this.f12957y.g(aVar);
        }
        this.G = -1;
        this.F = -1;
        this.f12958z.F();
        invalidate();
        if (n02 == n0() && R == R()) {
            return;
        }
        C0();
    }

    public void u3(T... tArr) {
        if (tArr == null) {
            throw new IllegalArgumentException("newItems cannot be null.");
        }
        float n02 = n0();
        float R = R();
        this.f12957y.clear();
        this.f12957y.j(tArr);
        this.G = -1;
        this.F = -1;
        this.f12958z.F();
        invalidate();
        if (n02 == n0() && R == R()) {
            return;
        }
        C0();
    }

    public void v3(@a3.d0 T t11) {
        if (this.f12957y.l(t11, false)) {
            this.f12958z.t(t11);
            return;
        }
        if (this.f12958z.l()) {
            com.badlogic.gdx.utils.a<T> aVar = this.f12957y;
            if (aVar.f13179b > 0) {
                this.f12958z.t(aVar.first());
                return;
            }
        }
        this.f12958z.clear();
    }

    public void w3(int i11) {
        if (i11 >= -1) {
            com.badlogic.gdx.utils.a<T> aVar = this.f12957y;
            if (i11 < aVar.f13179b) {
                if (i11 == -1) {
                    this.f12958z.clear();
                    return;
                } else {
                    this.f12958z.t(aVar.get(i11));
                    return;
                }
            }
        }
        throw new IllegalArgumentException("index must be >= -1 and < " + this.f12957y.f13179b + ": " + i11);
    }

    public void x3(z2.b<T> bVar) {
        this.f12958z = bVar;
    }

    public void y3(c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("style cannot be null.");
        }
        this.f12956x = cVar;
        C0();
    }

    public void z3(boolean z11) {
        this.I = z11;
    }

    public l(q qVar, String str) {
        this((c) qVar.X(str, c.class));
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public com.badlogic.gdx.graphics.g2d.a f12963a;

        /* renamed from: b, reason: collision with root package name */
        public com.badlogic.gdx.graphics.b f12964b = new com.badlogic.gdx.graphics.b(1.0f, 1.0f, 1.0f, 1.0f);

        /* renamed from: c, reason: collision with root package name */
        public com.badlogic.gdx.graphics.b f12965c = new com.badlogic.gdx.graphics.b(1.0f, 1.0f, 1.0f, 1.0f);

        /* renamed from: d, reason: collision with root package name */
        public z2.k f12966d;

        /* renamed from: e, reason: collision with root package name */
        @a3.d0
        public z2.k f12967e;

        /* renamed from: f, reason: collision with root package name */
        @a3.d0
        public z2.k f12968f;

        /* renamed from: g, reason: collision with root package name */
        @a3.d0
        public z2.k f12969g;

        public c() {
        }

        public c(com.badlogic.gdx.graphics.g2d.a aVar, com.badlogic.gdx.graphics.b bVar, com.badlogic.gdx.graphics.b bVar2, z2.k kVar) {
            this.f12963a = aVar;
            this.f12964b.H(bVar);
            this.f12965c.H(bVar2);
            this.f12966d = kVar;
        }

        public c(c cVar) {
            this.f12963a = cVar.f12963a;
            this.f12964b.H(cVar.f12964b);
            this.f12965c.H(cVar.f12965c);
            this.f12966d = cVar.f12966d;
            this.f12967e = cVar.f12967e;
            this.f12968f = cVar.f12968f;
            this.f12969g = cVar.f12969g;
        }
    }

    public l(c cVar) {
        com.badlogic.gdx.utils.a<T> aVar = new com.badlogic.gdx.utils.a<>();
        this.f12957y = aVar;
        z2.b<T> bVar = new z2.b<>(aVar);
        this.f12958z = bVar;
        this.E = 8;
        this.F = -1;
        this.G = -1;
        bVar.u(this);
        this.f12958z.y(true);
        y3(cVar);
        J2(n0(), R());
        a aVar2 = new a();
        this.H = aVar2;
        d1(aVar2);
        d1(new b());
    }
}
