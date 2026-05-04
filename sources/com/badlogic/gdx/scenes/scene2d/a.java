package com.badlogic.gdx.scenes.scene2d;

import a3.d0;
import a3.l0;
import a3.p;
import a3.u0;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import q1.g;
import x2.d;
import z2.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    @d0
    public c f12757a;

    /* renamed from: b, reason: collision with root package name */
    @d0
    public d f12758b;

    /* renamed from: f, reason: collision with root package name */
    @d0
    public String f12762f;

    /* renamed from: i, reason: collision with root package name */
    public boolean f12765i;

    /* renamed from: j, reason: collision with root package name */
    public float f12766j;

    /* renamed from: k, reason: collision with root package name */
    public float f12767k;

    /* renamed from: l, reason: collision with root package name */
    public float f12768l;

    /* renamed from: m, reason: collision with root package name */
    public float f12769m;

    /* renamed from: n, reason: collision with root package name */
    public float f12770n;

    /* renamed from: o, reason: collision with root package name */
    public float f12771o;

    /* renamed from: r, reason: collision with root package name */
    public float f12774r;

    /* renamed from: t, reason: collision with root package name */
    @d0
    public Object f12776t;

    /* renamed from: c, reason: collision with root package name */
    public final p<x2.c> f12759c = new p<>(0);

    /* renamed from: d, reason: collision with root package name */
    public final p<x2.c> f12760d = new p<>(0);

    /* renamed from: e, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<x2.a> f12761e = new com.badlogic.gdx.utils.a<>(0);

    /* renamed from: g, reason: collision with root package name */
    public Touchable f12763g = Touchable.enabled;

    /* renamed from: h, reason: collision with root package name */
    public boolean f12764h = true;

    /* renamed from: p, reason: collision with root package name */
    public float f12772p = 1.0f;

    /* renamed from: q, reason: collision with root package name */
    public float f12773q = 1.0f;

    /* renamed from: s, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.b f12775s = new com.badlogic.gdx.graphics.b(1.0f, 1.0f, 1.0f, 1.0f);

    @d0
    public d A1() {
        return this.f12758b;
    }

    public void A2(float f11) {
        this.f12771o = f11;
    }

    public float B1() {
        return this.f12766j + this.f12768l;
    }

    public void B2(@d0 d dVar) {
        this.f12758b = dVar;
    }

    public float C1() {
        return this.f12774r;
    }

    public void C2(float f11, float f12) {
        if (this.f12766j == f11 && this.f12767k == f12) {
            return;
        }
        this.f12766j = f11;
        this.f12767k = f12;
        i2();
    }

    public float D1() {
        return this.f12772p;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D2(float r3, float r4, int r5) {
        /*
            r2 = this;
            r0 = r5 & 16
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == 0) goto La
            float r0 = r2.f12768l
        L8:
            float r3 = r3 - r0
            goto L12
        La:
            r0 = r5 & 8
            if (r0 != 0) goto L12
            float r0 = r2.f12768l
            float r0 = r0 / r1
            goto L8
        L12:
            r0 = r5 & 2
            if (r0 == 0) goto L1a
            float r5 = r2.f12769m
        L18:
            float r4 = r4 - r5
            goto L22
        L1a:
            r5 = r5 & 4
            if (r5 != 0) goto L22
            float r5 = r2.f12769m
            float r5 = r5 / r1
            goto L18
        L22:
            float r5 = r2.f12766j
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 != 0) goto L30
            float r5 = r2.f12767k
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 == 0) goto L2f
            goto L30
        L2f:
            return
        L30:
            r2.f12766j = r3
            r2.f12767k = r4
            r2.i2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.scenes.scene2d.a.D2(float, float, int):void");
    }

    public float E1() {
        return this.f12773q;
    }

    public void E2(float f11) {
        if (this.f12774r != f11) {
            this.f12774r = f11;
            o2();
        }
    }

    @d0
    public c F1() {
        return this.f12757a;
    }

    public void F2(float f11) {
        if (this.f12772p == f11 && this.f12773q == f11) {
            return;
        }
        this.f12772p = f11;
        this.f12773q = f11;
        r2();
    }

    public float G1() {
        return this.f12767k + this.f12769m;
    }

    public void G2(float f11, float f12) {
        if (this.f12772p == f11 && this.f12773q == f12) {
            return;
        }
        this.f12772p = f11;
        this.f12773q = f12;
        r2();
    }

    public Touchable H1() {
        return this.f12763g;
    }

    public void H2(float f11) {
        if (this.f12772p != f11) {
            this.f12772p = f11;
            r2();
        }
    }

    @d0
    public Object I1() {
        return this.f12776t;
    }

    public void I2(float f11) {
        if (this.f12773q != f11) {
            this.f12773q = f11;
            r2();
        }
    }

    public float J1() {
        return this.f12768l;
    }

    public void J2(float f11, float f12) {
        if (this.f12768l == f11 && this.f12769m == f12) {
            return;
        }
        this.f12768l = f11;
        this.f12769m = f12;
        W2();
    }

    public float K1() {
        return this.f12766j;
    }

    public void K2(c cVar) {
        this.f12757a = cVar;
    }

    public float L1(int i11) {
        float f11;
        float f12 = this.f12766j;
        if ((i11 & 16) != 0) {
            f11 = this.f12768l;
        } else {
            if ((i11 & 8) != 0) {
                return f12;
            }
            f11 = this.f12768l / 2.0f;
        }
        return f12 + f11;
    }

    public void L2(Touchable touchable) {
        this.f12763g = touchable;
    }

    public float M1() {
        return this.f12767k;
    }

    public void M2(@d0 Object obj) {
        this.f12776t = obj;
    }

    public float N1(int i11) {
        float f11;
        float f12 = this.f12767k;
        if ((i11 & 2) != 0) {
            f11 = this.f12769m;
        } else {
            if ((i11 & 4) != 0) {
                return f12;
            }
            f11 = this.f12769m / 2.0f;
        }
        return f12 + f11;
    }

    public void N2(boolean z11) {
        this.f12764h = z11;
    }

    public int O1() {
        d dVar = this.f12758b;
        if (dVar == null) {
            return -1;
        }
        return dVar.f97066u.q(this, true);
    }

    public void O2(float f11) {
        if (this.f12768l != f11) {
            this.f12768l = f11;
            W2();
        }
    }

    public boolean P1() {
        return this.f12761e.f13179b > 0;
    }

    public void P2(float f11) {
        if (this.f12766j != f11) {
            this.f12766j = f11;
            i2();
        }
    }

    public boolean Q1() {
        c F1 = F1();
        return F1 != null && F1.s1() == this;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Q2(float r2, int r3) {
        /*
            r1 = this;
            r0 = r3 & 16
            if (r0 == 0) goto L8
            float r3 = r1.f12768l
        L6:
            float r2 = r2 - r3
            goto L12
        L8:
            r3 = r3 & 8
            if (r3 != 0) goto L12
            float r3 = r1.f12768l
            r0 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r0
            goto L6
        L12:
            float r3 = r1.f12766j
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L1d
            r1.f12766j = r2
            r1.i2()
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.scenes.scene2d.a.Q2(float, int):void");
    }

    public boolean R1() {
        return this.f12758b != null;
    }

    public void R2(float f11) {
        if (this.f12767k != f11) {
            this.f12767k = f11;
            i2();
        }
    }

    public boolean S1() {
        c F1 = F1();
        return F1 != null && F1.u1() == this;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void S2(float r2, int r3) {
        /*
            r1 = this;
            r0 = r3 & 2
            if (r0 == 0) goto L8
            float r3 = r1.f12769m
        L6:
            float r2 = r2 - r3
            goto L12
        L8:
            r3 = r3 & 4
            if (r3 != 0) goto L12
            float r3 = r1.f12769m
            r0 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r0
            goto L6
        L12:
            float r3 = r1.f12767k
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L1d
            r1.f12767k = r2
            r1.i2()
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.scenes.scene2d.a.S2(float, int):void");
    }

    @d0
    public a T1(float f11, float f12, boolean z11) {
        if ((!z11 || this.f12763g == Touchable.enabled) && Z1() && f11 >= 0.0f && f11 < this.f12768l && f12 >= 0.0f && f12 < this.f12769m) {
            return this;
        }
        return null;
    }

    public boolean T2(int i11) {
        u0<a> u0Var;
        int i12;
        if (i11 < 0) {
            throw new IllegalArgumentException("ZIndex cannot be < 0.");
        }
        d dVar = this.f12758b;
        if (dVar == null || (i12 = (u0Var = dVar.f97066u).f13179b) <= 1) {
            return false;
        }
        int min = Math.min(i11, i12 - 1);
        if (u0Var.get(min) == this || !u0Var.C(this, true)) {
            return false;
        }
        u0Var.r(min, this);
        return true;
    }

    public boolean U1(a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("actor cannot be null.");
        }
        while (aVar != this) {
            aVar = aVar.f12758b;
            if (aVar == null) {
                return false;
            }
        }
        return true;
    }

    public void U2(float f11) {
        if (f11 != 0.0f) {
            this.f12768l += f11;
            this.f12769m += f11;
            W2();
        }
    }

    public boolean V1(a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("actor cannot be null.");
        }
        a aVar2 = this;
        while (aVar2 != aVar) {
            aVar2 = aVar2.f12758b;
            if (aVar2 == null) {
                return false;
            }
        }
        return true;
    }

    public void V2(float f11, float f12) {
        if (f11 == 0.0f && f12 == 0.0f) {
            return;
        }
        this.f12768l += f11;
        this.f12769m += f12;
        W2();
    }

    public boolean W1() {
        c F1 = F1();
        if (F1 == null) {
            return false;
        }
        int i11 = F1.f12794o.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (F1.f12794o.get(i12).f12804b == this) {
                return true;
            }
        }
        return false;
    }

    public boolean X1() {
        c F1 = F1();
        if (F1 == null) {
            return false;
        }
        int i11 = F1.f12794o.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (F1.f12794o.get(i12).f12805c == this) {
                return true;
            }
        }
        return false;
    }

    public Vector2 X2(Vector2 vector2) {
        d dVar = this.f12758b;
        if (dVar != null) {
            dVar.X2(vector2);
        }
        h2(vector2);
        return vector2;
    }

    public boolean Y1() {
        return this.f12763g == Touchable.enabled;
    }

    public void Y2() {
        T2(0);
    }

    public boolean Z1() {
        return this.f12764h;
    }

    public void Z2() {
        T2(Integer.MAX_VALUE);
    }

    public void a1(float f11) {
        com.badlogic.gdx.utils.a<x2.a> aVar = this.f12761e;
        if (aVar.f13179b == 0) {
            return;
        }
        c cVar = this.f12757a;
        if (cVar != null && cVar.m1()) {
            g.f81379b.w();
        }
        int i11 = 0;
        while (i11 < aVar.f13179b) {
            try {
                x2.a aVar2 = aVar.get(i11);
                if (aVar2.a(f11) && i11 < aVar.f13179b) {
                    int q11 = aVar.get(i11) == aVar2 ? i11 : aVar.q(aVar2, true);
                    if (q11 != -1) {
                        aVar.A(q11);
                        aVar2.f(null);
                        i11--;
                    }
                }
                i11++;
            } catch (RuntimeException e11) {
                String aVar3 = toString();
                throw new RuntimeException("Actor: " + aVar3.substring(0, Math.min(aVar3.length(), 128)), e11);
            }
        }
    }

    public Vector2 a2(a aVar, Vector2 vector2) {
        e2(vector2);
        return aVar.X2(vector2);
    }

    public void b1(x2.a aVar) {
        aVar.f(this);
        this.f12761e.a(aVar);
        c cVar = this.f12757a;
        if (cVar == null || !cVar.m1()) {
            return;
        }
        g.f81379b.w();
    }

    public Vector2 b2(@d0 a aVar, Vector2 vector2) {
        a aVar2 = this;
        do {
            aVar2.c2(vector2);
            aVar2 = aVar2.f12758b;
            if (aVar2 == aVar) {
                return vector2;
            }
        } while (aVar2 != null);
        throw new IllegalArgumentException("Actor is not an ascendant: " + aVar);
    }

    public boolean c1(x2.c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("listener cannot be null.");
        }
        if (!this.f12760d.l(cVar, true)) {
            this.f12760d.a(cVar);
        }
        return true;
    }

    public Vector2 c2(Vector2 vector2) {
        float f11 = -this.f12774r;
        float f12 = this.f12772p;
        float f13 = this.f12773q;
        float f14 = this.f12766j;
        float f15 = this.f12767k;
        if (f11 == 0.0f) {
            if (f12 == 1.0f && f13 == 1.0f) {
                vector2.f12535x += f14;
                vector2.f12536y += f15;
                return vector2;
            }
            float f16 = this.f12770n;
            float f17 = this.f12771o;
            vector2.f12535x = ((vector2.f12535x - f16) * f12) + f16 + f14;
            vector2.f12536y = ((vector2.f12536y - f17) * f13) + f17 + f15;
            return vector2;
        }
        double d11 = f11 * 0.017453292f;
        float cos = (float) Math.cos(d11);
        float sin = (float) Math.sin(d11);
        float f18 = this.f12770n;
        float f19 = this.f12771o;
        float f21 = (vector2.f12535x - f18) * f12;
        float f22 = (vector2.f12536y - f19) * f13;
        vector2.f12535x = (f21 * cos) + (f22 * sin) + f18 + f14;
        vector2.f12536y = (f21 * (-sin)) + (f22 * cos) + f19 + f15;
        return vector2;
    }

    public boolean d1(x2.c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("listener cannot be null.");
        }
        if (this.f12759c.l(cVar, true)) {
            return false;
        }
        this.f12759c.a(cVar);
        return true;
    }

    public Vector2 d2(Vector2 vector2) {
        c cVar = this.f12757a;
        return cVar == null ? vector2 : cVar.P1(b2(null, vector2));
    }

    public com.badlogic.gdx.graphics.b e() {
        return this.f12775s;
    }

    @Deprecated
    public boolean e1() {
        return f1();
    }

    public Vector2 e2(Vector2 vector2) {
        return b2(null, vector2);
    }

    public boolean f1() {
        a aVar = this;
        while (aVar.Z1()) {
            aVar = aVar.f12758b;
            if (aVar == null) {
                return true;
            }
        }
        return false;
    }

    public void f2(float f11, float f12) {
        if (f11 == 0.0f && f12 == 0.0f) {
            return;
        }
        this.f12766j += f11;
        this.f12767k += f12;
        i2();
    }

    public void g1() {
        h1();
        i1();
    }

    public boolean g2(x2.b bVar, boolean z11) {
        if (bVar.e() == null) {
            throw new IllegalArgumentException("The event target cannot be null.");
        }
        p<x2.c> pVar = z11 ? this.f12760d : this.f12759c;
        if (pVar.f13179b == 0) {
            return bVar.g();
        }
        bVar.m(this);
        bVar.l(z11);
        if (bVar.d() == null) {
            bVar.n(this.f12757a);
        }
        try {
            pVar.U();
            int i11 = pVar.f13179b;
            for (int i12 = 0; i12 < i11; i12++) {
                if (pVar.get(i12).a(bVar)) {
                    bVar.f();
                }
            }
            pVar.V();
            return bVar.g();
        } catch (RuntimeException e11) {
            String aVar = toString();
            throw new RuntimeException("Actor: " + aVar.substring(0, Math.min(aVar.length(), 128)), e11);
        }
    }

    public void h(com.badlogic.gdx.graphics.b bVar) {
        this.f12775s.H(bVar);
    }

    public void h1() {
        for (int i11 = this.f12761e.f13179b - 1; i11 >= 0; i11--) {
            this.f12761e.get(i11).f(null);
        }
        this.f12761e.clear();
    }

    public Vector2 h2(Vector2 vector2) {
        float f11 = this.f12774r;
        float f12 = this.f12772p;
        float f13 = this.f12773q;
        float f14 = this.f12766j;
        float f15 = this.f12767k;
        if (f11 == 0.0f) {
            if (f12 == 1.0f && f13 == 1.0f) {
                vector2.f12535x -= f14;
                vector2.f12536y -= f15;
                return vector2;
            }
            float f16 = this.f12770n;
            float f17 = this.f12771o;
            vector2.f12535x = (((vector2.f12535x - f14) - f16) / f12) + f16;
            vector2.f12536y = (((vector2.f12536y - f15) - f17) / f13) + f17;
            return vector2;
        }
        double d11 = f11 * 0.017453292f;
        float cos = (float) Math.cos(d11);
        float sin = (float) Math.sin(d11);
        float f18 = this.f12770n;
        float f19 = this.f12771o;
        float f21 = (vector2.f12535x - f14) - f18;
        float f22 = (vector2.f12536y - f15) - f19;
        vector2.f12535x = (((f21 * cos) + (f22 * sin)) / f12) + f18;
        vector2.f12536y = (((f21 * (-sin)) + (f22 * cos)) / f13) + f19;
        return vector2;
    }

    public void i1() {
        this.f12759c.clear();
        this.f12760d.clear();
    }

    public boolean j1() {
        return k1(this.f12766j, this.f12767k, this.f12768l, this.f12769m);
    }

    public boolean j2() {
        d dVar = this.f12758b;
        if (dVar != null) {
            return dVar.w3(this, true);
        }
        return false;
    }

    public void k(float f11, float f12, float f13, float f14) {
        this.f12775s.F(f11, f12, f13, f14);
    }

    public boolean k1(float f11, float f12, float f13, float f14) {
        c cVar;
        if (f13 <= 0.0f || f14 <= 0.0f || (cVar = this.f12757a) == null) {
            return false;
        }
        Rectangle rectangle = Rectangle.tmp;
        rectangle.f12533x = f11;
        rectangle.f12534y = f12;
        rectangle.width = f13;
        rectangle.height = f14;
        Rectangle rectangle2 = (Rectangle) l0.f(Rectangle.class);
        cVar.c1(rectangle, rectangle2);
        if (n.g(rectangle2)) {
            return true;
        }
        l0.a(rectangle2);
        return false;
    }

    public void k2(@d0 x2.a aVar) {
        if (aVar == null || !this.f12761e.C(aVar, true)) {
            return;
        }
        aVar.f(null);
    }

    public void l1() {
        l0.a(n.f());
    }

    public boolean l2(x2.c cVar) {
        if (cVar != null) {
            return this.f12760d.C(cVar, true);
        }
        throw new IllegalArgumentException("listener cannot be null.");
    }

    public a m1() {
        u2(true);
        return this;
    }

    public boolean m2(x2.c cVar) {
        if (cVar != null) {
            return this.f12759c.C(cVar, true);
        }
        throw new IllegalArgumentException("listener cannot be null.");
    }

    public void n2(float f11) {
        if (f11 != 0.0f) {
            this.f12774r = (this.f12774r + f11) % 360.0f;
            o2();
        }
    }

    public void o1(ShapeRenderer shapeRenderer) {
        p1(shapeRenderer);
    }

    public void p1(ShapeRenderer shapeRenderer) {
        if (this.f12765i) {
            shapeRenderer.w1(ShapeRenderer.ShapeType.Line);
            c cVar = this.f12757a;
            if (cVar != null) {
                shapeRenderer.h(cVar.q1());
            }
            shapeRenderer.o1(this.f12766j, this.f12767k, this.f12770n, this.f12771o, this.f12768l, this.f12769m, this.f12772p, this.f12773q, this.f12774r);
        }
    }

    public void p2(float f11) {
        if (f11 != 0.0f) {
            this.f12772p += f11;
            this.f12773q += f11;
            r2();
        }
    }

    public boolean q1(x2.b bVar) {
        boolean g11;
        if (bVar.d() == null) {
            bVar.n(F1());
        }
        bVar.o(this);
        com.badlogic.gdx.utils.a aVar = (com.badlogic.gdx.utils.a) l0.f(com.badlogic.gdx.utils.a.class);
        for (d dVar = this.f12758b; dVar != null; dVar = dVar.f12758b) {
            aVar.a(dVar);
        }
        try {
            Object[] objArr = aVar.f13178a;
            int i11 = aVar.f13179b - 1;
            while (true) {
                if (i11 < 0) {
                    g2(bVar, true);
                    if (!bVar.j()) {
                        g2(bVar, false);
                        if (!bVar.b()) {
                            g11 = bVar.g();
                        } else if (!bVar.j()) {
                            int i12 = aVar.f13179b;
                            int i13 = 0;
                            while (true) {
                                if (i13 >= i12) {
                                    g11 = bVar.g();
                                    break;
                                }
                                ((d) objArr[i13]).g2(bVar, false);
                                if (bVar.j()) {
                                    g11 = bVar.g();
                                    break;
                                }
                                i13++;
                            }
                        } else {
                            g11 = bVar.g();
                        }
                    } else {
                        g11 = bVar.g();
                    }
                } else {
                    ((d) objArr[i11]).g2(bVar, true);
                    if (bVar.j()) {
                        g11 = bVar.g();
                        break;
                    }
                    i11--;
                }
            }
            return g11;
        } finally {
            aVar.clear();
            l0.a(aVar);
        }
    }

    public void q2(float f11, float f12) {
        if (f11 == 0.0f && f12 == 0.0f) {
            return;
        }
        this.f12772p += f11;
        this.f12773q += f12;
        r2();
    }

    @d0
    public <T extends a> T r1(Class<T> cls) {
        if (cls == null) {
            throw new IllegalArgumentException("actor cannot be null.");
        }
        d dVar = (T) this;
        while (!g3.c.A(cls, dVar)) {
            dVar = dVar.f12758b;
            if (dVar == null) {
                return null;
            }
        }
        return dVar;
    }

    public com.badlogic.gdx.utils.a<x2.a> s1() {
        return this.f12761e;
    }

    public Vector2 s2(Vector2 vector2) {
        c cVar = this.f12757a;
        return cVar == null ? vector2 : X2(cVar.D1(vector2));
    }

    public p<x2.c> t1() {
        return this.f12760d;
    }

    public void t2(float f11, float f12, float f13, float f14) {
        if (this.f12766j != f11 || this.f12767k != f12) {
            this.f12766j = f11;
            this.f12767k = f12;
            i2();
        }
        if (this.f12768l == f13 && this.f12769m == f14) {
            return;
        }
        this.f12768l = f13;
        this.f12769m = f14;
        W2();
    }

    public String toString() {
        String str = this.f12762f;
        if (str != null) {
            return str;
        }
        String name = getClass().getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf != -1 ? name.substring(lastIndexOf + 1) : name;
    }

    public boolean u1() {
        return this.f12765i;
    }

    public void u2(boolean z11) {
        this.f12765i = z11;
        if (z11) {
            c.f12779x = true;
        }
    }

    public float v1() {
        return this.f12769m;
    }

    public void v2(float f11) {
        if (this.f12769m != f11) {
            this.f12769m = f11;
            W2();
        }
    }

    public p<x2.c> w1() {
        return this.f12759c;
    }

    public void w2(@d0 String str) {
        this.f12762f = str;
    }

    @d0
    public String x1() {
        return this.f12762f;
    }

    public void x2(float f11, float f12) {
        this.f12770n = f11;
        this.f12771o = f12;
    }

    public float y1() {
        return this.f12770n;
    }

    public void y2(int i11) {
        if ((i11 & 8) != 0) {
            this.f12770n = 0.0f;
        } else if ((i11 & 16) != 0) {
            this.f12770n = this.f12768l;
        } else {
            this.f12770n = this.f12768l / 2.0f;
        }
        if ((i11 & 4) != 0) {
            this.f12771o = 0.0f;
        } else if ((i11 & 2) != 0) {
            this.f12771o = this.f12769m;
        } else {
            this.f12771o = this.f12769m / 2.0f;
        }
    }

    public float z1() {
        return this.f12771o;
    }

    public void z2(float f11) {
        this.f12770n = f11;
    }

    public void W2() {
    }

    public void i2() {
    }

    public void o2() {
    }

    public void r2() {
    }

    public void n1(w1.a aVar, float f11) {
    }
}
