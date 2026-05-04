package com.badlogic.gdx.scenes.scene2d.ui;

import a3.j0;
import com.badlogic.gdx.Files;
import com.badlogic.gdx.scenes.scene2d.a;
import com.badlogic.gdx.scenes.scene2d.ui.c0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c<T extends com.badlogic.gdx.scenes.scene2d.a> implements j0.a {
    public static final Float K = Float.valueOf(0.0f);
    public static final Float L = Float.valueOf(1.0f);
    public static final Integer M = 0;
    public static final Integer N = 1;
    public static final Integer O = 1;
    public static final Integer P = 2;
    public static final Integer Q = 4;
    public static final Integer R = 8;
    public static final Integer S = 16;
    public static Files T;
    public static c U;
    public float A;
    public Table B;
    public boolean C;
    public int D;
    public int E;
    public int F = -1;
    public float G;
    public float H;
    public float I;
    public float J;

    /* renamed from: a, reason: collision with root package name */
    public c0 f12874a;

    /* renamed from: b, reason: collision with root package name */
    public c0 f12875b;

    /* renamed from: c, reason: collision with root package name */
    public c0 f12876c;

    /* renamed from: d, reason: collision with root package name */
    public c0 f12877d;

    /* renamed from: e, reason: collision with root package name */
    public c0 f12878e;

    /* renamed from: f, reason: collision with root package name */
    public c0 f12879f;

    /* renamed from: g, reason: collision with root package name */
    public c0 f12880g;

    /* renamed from: h, reason: collision with root package name */
    public c0 f12881h;

    /* renamed from: i, reason: collision with root package name */
    public c0 f12882i;

    /* renamed from: j, reason: collision with root package name */
    public c0 f12883j;

    /* renamed from: k, reason: collision with root package name */
    public c0 f12884k;

    /* renamed from: l, reason: collision with root package name */
    public c0 f12885l;

    /* renamed from: m, reason: collision with root package name */
    public c0 f12886m;

    /* renamed from: n, reason: collision with root package name */
    public c0 f12887n;

    /* renamed from: o, reason: collision with root package name */
    public Float f12888o;

    /* renamed from: p, reason: collision with root package name */
    public Float f12889p;

    /* renamed from: q, reason: collision with root package name */
    public Integer f12890q;

    /* renamed from: r, reason: collision with root package name */
    public Integer f12891r;

    /* renamed from: s, reason: collision with root package name */
    public Integer f12892s;

    /* renamed from: t, reason: collision with root package name */
    public Integer f12893t;

    /* renamed from: u, reason: collision with root package name */
    public Boolean f12894u;

    /* renamed from: v, reason: collision with root package name */
    public Boolean f12895v;

    /* renamed from: w, reason: collision with root package name */
    @a3.d0
    public com.badlogic.gdx.scenes.scene2d.a f12896w;

    /* renamed from: x, reason: collision with root package name */
    public float f12897x;

    /* renamed from: y, reason: collision with root package name */
    public float f12898y;

    /* renamed from: z, reason: collision with root package name */
    public float f12899z;

    public c() {
        c g11 = g();
        if (g11 != null) {
            l1(g11);
        }
    }

    public static c g() {
        Files files = T;
        if (files == null || files != q1.g.f81382e) {
            T = q1.g.f81382e;
            c cVar = new c();
            U = cVar;
            cVar.f12874a = c0.f12901b;
            U.f12875b = c0.f12902c;
            U.f12876c = c0.f12903d;
            U.f12877d = c0.f12904e;
            U.f12878e = c0.f12905f;
            U.f12879f = c0.f12906g;
            c cVar2 = U;
            c0.k kVar = c0.f12900a;
            cVar2.f12880g = kVar;
            c cVar3 = U;
            cVar3.f12881h = kVar;
            cVar3.f12882i = kVar;
            cVar3.f12883j = kVar;
            cVar3.f12884k = kVar;
            cVar3.f12885l = kVar;
            cVar3.f12886m = kVar;
            cVar3.f12887n = kVar;
            Float f11 = K;
            cVar3.f12888o = f11;
            cVar3.f12889p = f11;
            cVar3.f12890q = O;
            Integer num = M;
            cVar3.f12891r = num;
            cVar3.f12892s = num;
            cVar3.f12893t = N;
            cVar3.f12894u = null;
            cVar3.f12895v = null;
        }
        return U;
    }

    public float A() {
        return this.I;
    }

    public c<T> A0(float f11) {
        C0(c0.k.g(f11));
        return this;
    }

    public c<T> A1(c0 c0Var, c0 c0Var2, c0 c0Var3, c0 c0Var4) {
        if (c0Var == null) {
            throw new IllegalArgumentException("top cannot be null.");
        }
        if (c0Var2 == null) {
            throw new IllegalArgumentException("left cannot be null.");
        }
        if (c0Var3 == null) {
            throw new IllegalArgumentException("bottom cannot be null.");
        }
        if (c0Var4 == null) {
            throw new IllegalArgumentException("right cannot be null.");
        }
        this.f12880g = c0Var;
        this.f12881h = c0Var2;
        this.f12882i = c0Var3;
        this.f12883j = c0Var4;
        return this;
    }

    public float B() {
        return this.H;
    }

    public c<T> B0(float f11, float f12) {
        D0(c0.k.g(f11), c0.k.g(f12));
        return this;
    }

    public c<T> B1(float f11) {
        if (f11 >= 0.0f) {
            this.f12882i = c0.k.g(f11);
            return this;
        }
        throw new IllegalArgumentException("spaceBottom cannot be < 0: " + f11);
    }

    public float C() {
        return this.J;
    }

    public c<T> C0(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("size cannot be null.");
        }
        this.f12878e = c0Var;
        this.f12879f = c0Var;
        return this;
    }

    public c<T> C1(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("spaceBottom cannot be null.");
        }
        this.f12882i = c0Var;
        return this;
    }

    public float D() {
        return this.G;
    }

    public c<T> D0(c0 c0Var, c0 c0Var2) {
        if (c0Var == null) {
            throw new IllegalArgumentException("width cannot be null.");
        }
        if (c0Var2 == null) {
            throw new IllegalArgumentException("height cannot be null.");
        }
        this.f12878e = c0Var;
        this.f12879f = c0Var2;
        return this;
    }

    public c<T> D1(float f11) {
        if (f11 >= 0.0f) {
            this.f12881h = c0.k.g(f11);
            return this;
        }
        throw new IllegalArgumentException("spaceLeft cannot be < 0: " + f11);
    }

    @a3.d0
    public Integer E() {
        return this.f12891r;
    }

    public c<T> E0(float f11) {
        this.f12878e = c0.k.g(f11);
        return this;
    }

    public c<T> E1(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("spaceLeft cannot be null.");
        }
        this.f12881h = c0Var;
        return this;
    }

    @a3.d0
    public Integer F() {
        return this.f12892s;
    }

    public c<T> F0(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("maxWidth cannot be null.");
        }
        this.f12878e = c0Var;
        return this;
    }

    public c<T> F1(float f11) {
        if (f11 >= 0.0f) {
            this.f12883j = c0.k.g(f11);
            return this;
        }
        throw new IllegalArgumentException("spaceRight cannot be < 0: " + f11);
    }

    @a3.d0
    public Float G() {
        return this.f12888o;
    }

    public void G0(@a3.d0 c cVar) {
        if (cVar == null) {
            return;
        }
        c0 c0Var = cVar.f12874a;
        if (c0Var != null) {
            this.f12874a = c0Var;
        }
        c0 c0Var2 = cVar.f12875b;
        if (c0Var2 != null) {
            this.f12875b = c0Var2;
        }
        c0 c0Var3 = cVar.f12876c;
        if (c0Var3 != null) {
            this.f12876c = c0Var3;
        }
        c0 c0Var4 = cVar.f12877d;
        if (c0Var4 != null) {
            this.f12877d = c0Var4;
        }
        c0 c0Var5 = cVar.f12878e;
        if (c0Var5 != null) {
            this.f12878e = c0Var5;
        }
        c0 c0Var6 = cVar.f12879f;
        if (c0Var6 != null) {
            this.f12879f = c0Var6;
        }
        c0 c0Var7 = cVar.f12880g;
        if (c0Var7 != null) {
            this.f12880g = c0Var7;
        }
        c0 c0Var8 = cVar.f12881h;
        if (c0Var8 != null) {
            this.f12881h = c0Var8;
        }
        c0 c0Var9 = cVar.f12882i;
        if (c0Var9 != null) {
            this.f12882i = c0Var9;
        }
        c0 c0Var10 = cVar.f12883j;
        if (c0Var10 != null) {
            this.f12883j = c0Var10;
        }
        c0 c0Var11 = cVar.f12884k;
        if (c0Var11 != null) {
            this.f12884k = c0Var11;
        }
        c0 c0Var12 = cVar.f12885l;
        if (c0Var12 != null) {
            this.f12885l = c0Var12;
        }
        c0 c0Var13 = cVar.f12886m;
        if (c0Var13 != null) {
            this.f12886m = c0Var13;
        }
        c0 c0Var14 = cVar.f12887n;
        if (c0Var14 != null) {
            this.f12887n = c0Var14;
        }
        Float f11 = cVar.f12888o;
        if (f11 != null) {
            this.f12888o = f11;
        }
        Float f12 = cVar.f12889p;
        if (f12 != null) {
            this.f12889p = f12;
        }
        Integer num = cVar.f12890q;
        if (num != null) {
            this.f12890q = num;
        }
        Integer num2 = cVar.f12891r;
        if (num2 != null) {
            this.f12891r = num2;
        }
        Integer num3 = cVar.f12892s;
        if (num3 != null) {
            this.f12892s = num3;
        }
        Integer num4 = cVar.f12893t;
        if (num4 != null) {
            this.f12893t = num4;
        }
        Boolean bool = cVar.f12894u;
        if (bool != null) {
            this.f12894u = bool;
        }
        Boolean bool2 = cVar.f12895v;
        if (bool2 != null) {
            this.f12895v = bool2;
        }
    }

    public c<T> G1(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("spaceRight cannot be null.");
        }
        this.f12883j = c0Var;
        return this;
    }

    @a3.d0
    public Float H() {
        return this.f12889p;
    }

    public c<T> H0(float f11) {
        this.f12875b = c0.k.g(f11);
        return this;
    }

    public c<T> H1(float f11) {
        if (f11 >= 0.0f) {
            this.f12880g = c0.k.g(f11);
            return this;
        }
        throw new IllegalArgumentException("spaceTop cannot be < 0: " + f11);
    }

    public float I() {
        return this.f12879f.b(this.f12896w);
    }

    public c<T> I0(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("minHeight cannot be null.");
        }
        this.f12875b = c0Var;
        return this;
    }

    public c<T> I1(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("spaceTop cannot be null.");
        }
        this.f12880g = c0Var;
        return this;
    }

    @a3.d0
    public c0 J() {
        return this.f12879f;
    }

    public c<T> J0(float f11) {
        L0(c0.k.g(f11));
        return this;
    }

    public c<T> J1() {
        Integer num = this.f12890q;
        if (num == null) {
            this.f12890q = P;
            return this;
        }
        this.f12890q = Integer.valueOf((num.intValue() | 2) & (-5));
        return this;
    }

    public float K() {
        return this.f12878e.b(this.f12896w);
    }

    public c<T> K0(float f11, float f12) {
        M0(c0.k.g(f11), c0.k.g(f12));
        return this;
    }

    public c<T> K1() {
        Boolean bool = Boolean.TRUE;
        this.f12894u = bool;
        this.f12895v = bool;
        return this;
    }

    @a3.d0
    public c0 L() {
        return this.f12878e;
    }

    public c<T> L0(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("size cannot be null.");
        }
        this.f12874a = c0Var;
        this.f12875b = c0Var;
        return this;
    }

    public c<T> L1(boolean z11) {
        this.f12894u = Boolean.valueOf(z11);
        this.f12895v = Boolean.valueOf(z11);
        return this;
    }

    public float M() {
        return this.f12875b.b(this.f12896w);
    }

    public c<T> M0(c0 c0Var, c0 c0Var2) {
        if (c0Var == null) {
            throw new IllegalArgumentException("width cannot be null.");
        }
        if (c0Var2 == null) {
            throw new IllegalArgumentException("height cannot be null.");
        }
        this.f12874a = c0Var;
        this.f12875b = c0Var2;
        return this;
    }

    public c<T> M1(boolean z11, boolean z12) {
        this.f12894u = Boolean.valueOf(z11);
        this.f12895v = Boolean.valueOf(z12);
        return this;
    }

    @a3.d0
    public c0 N() {
        return this.f12875b;
    }

    public c<T> N0(float f11) {
        this.f12874a = c0.k.g(f11);
        return this;
    }

    public c<T> N1() {
        this.f12894u = Boolean.TRUE;
        return this;
    }

    public float O() {
        return this.f12874a.b(this.f12896w);
    }

    public c<T> O0(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("minWidth cannot be null.");
        }
        this.f12874a = c0Var;
        return this;
    }

    public c<T> O1() {
        this.f12895v = Boolean.TRUE;
        return this;
    }

    @a3.d0
    public c0 P() {
        return this.f12874a;
    }

    public c<T> P0(float f11) {
        R0(c0.k.g(f11));
        return this;
    }

    public c<T> P1(float f11) {
        Q1(c0.k.g(f11));
        return this;
    }

    public float Q() {
        return this.f12886m.b(this.f12896w);
    }

    public c<T> Q0(float f11, float f12, float f13, float f14) {
        S0(c0.k.g(f11), c0.k.g(f12), c0.k.g(f13), c0.k.g(f14));
        return this;
    }

    public c<T> Q1(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("width cannot be null.");
        }
        this.f12874a = c0Var;
        this.f12876c = c0Var;
        this.f12878e = c0Var;
        return this;
    }

    @a3.d0
    public c0 R() {
        return this.f12886m;
    }

    public c<T> R0(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("pad cannot be null.");
        }
        this.f12884k = c0Var;
        this.f12885l = c0Var;
        this.f12886m = c0Var;
        this.f12887n = c0Var;
        return this;
    }

    public float S() {
        return this.f12885l.b(this.f12896w);
    }

    public c<T> S0(c0 c0Var, c0 c0Var2, c0 c0Var3, c0 c0Var4) {
        if (c0Var == null) {
            throw new IllegalArgumentException("top cannot be null.");
        }
        if (c0Var2 == null) {
            throw new IllegalArgumentException("left cannot be null.");
        }
        if (c0Var3 == null) {
            throw new IllegalArgumentException("bottom cannot be null.");
        }
        if (c0Var4 == null) {
            throw new IllegalArgumentException("right cannot be null.");
        }
        this.f12884k = c0Var;
        this.f12885l = c0Var2;
        this.f12886m = c0Var3;
        this.f12887n = c0Var4;
        return this;
    }

    @a3.d0
    public c0 T() {
        return this.f12885l;
    }

    public c<T> T0(float f11) {
        this.f12886m = c0.k.g(f11);
        return this;
    }

    public float U() {
        return this.f12887n.b(this.f12896w);
    }

    public c<T> U0(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("padBottom cannot be null.");
        }
        this.f12886m = c0Var;
        return this;
    }

    @a3.d0
    public c0 V() {
        return this.f12887n;
    }

    public c<T> V0(float f11) {
        this.f12885l = c0.k.g(f11);
        return this;
    }

    public float W() {
        return this.f12884k.b(this.f12896w);
    }

    public c<T> W0(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("padLeft cannot be null.");
        }
        this.f12885l = c0Var;
        return this;
    }

    @a3.d0
    public c0 X() {
        return this.f12884k;
    }

    public c<T> X0(float f11) {
        this.f12887n = c0.k.g(f11);
        return this;
    }

    public float Y() {
        return this.f12885l.b(this.f12896w) + this.f12887n.b(this.f12896w);
    }

    public c<T> Y0(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("padRight cannot be null.");
        }
        this.f12887n = c0Var;
        return this;
    }

    public float Z() {
        return this.f12884k.b(this.f12896w) + this.f12886m.b(this.f12896w);
    }

    public c<T> Z0(float f11) {
        this.f12884k = c0.k.g(f11);
        return this;
    }

    public c<T> a(int i11) {
        this.f12890q = Integer.valueOf(i11);
        return this;
    }

    public float a0() {
        return this.f12877d.b(this.f12896w);
    }

    public c<T> a1(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("padTop cannot be null.");
        }
        this.f12884k = c0Var;
        return this;
    }

    public c<T> b() {
        Integer num = this.f12890q;
        if (num == null) {
            this.f12890q = Q;
            return this;
        }
        this.f12890q = Integer.valueOf((num.intValue() | 4) & (-3));
        return this;
    }

    @a3.d0
    public c0 b0() {
        return this.f12877d;
    }

    public c<T> b1(float f11) {
        this.f12877d = c0.k.g(f11);
        return this;
    }

    public c<T> c() {
        this.f12890q = O;
        return this;
    }

    public float c0() {
        return this.f12876c.b(this.f12896w);
    }

    public c<T> c1(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("prefHeight cannot be null.");
        }
        this.f12877d = c0Var;
        return this;
    }

    public void d() {
        this.f12874a = null;
        this.f12875b = null;
        this.f12876c = null;
        this.f12877d = null;
        this.f12878e = null;
        this.f12879f = null;
        this.f12880g = null;
        this.f12881h = null;
        this.f12882i = null;
        this.f12883j = null;
        this.f12884k = null;
        this.f12885l = null;
        this.f12886m = null;
        this.f12887n = null;
        this.f12888o = null;
        this.f12889p = null;
        this.f12890q = null;
        this.f12891r = null;
        this.f12892s = null;
        this.f12893t = null;
        this.f12894u = null;
        this.f12895v = null;
    }

    @a3.d0
    public c0 d0() {
        return this.f12876c;
    }

    public c<T> d1(float f11) {
        f1(c0.k.g(f11));
        return this;
    }

    public c<T> e() {
        m1(null);
        return this;
    }

    public int e0() {
        return this.E;
    }

    public c<T> e1(float f11, float f12) {
        g1(c0.k.g(f11), c0.k.g(f12));
        return this;
    }

    public c<T> f(int i11) {
        this.f12893t = Integer.valueOf(i11);
        return this;
    }

    public float f0() {
        return this.f12882i.b(this.f12896w);
    }

    public c<T> f1(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("size cannot be null.");
        }
        this.f12876c = c0Var;
        this.f12877d = c0Var;
        return this;
    }

    @a3.d0
    public c0 g0() {
        return this.f12882i;
    }

    public c<T> g1(c0 c0Var, c0 c0Var2) {
        if (c0Var == null) {
            throw new IllegalArgumentException("width cannot be null.");
        }
        if (c0Var2 == null) {
            throw new IllegalArgumentException("height cannot be null.");
        }
        this.f12876c = c0Var;
        this.f12877d = c0Var2;
        return this;
    }

    public c<T> h() {
        Integer num = N;
        this.f12891r = num;
        this.f12892s = num;
        return this;
    }

    public float h0() {
        return this.f12881h.b(this.f12896w);
    }

    public c<T> h1(float f11) {
        this.f12876c = c0.k.g(f11);
        return this;
    }

    public c<T> i(int i11, int i12) {
        this.f12891r = Integer.valueOf(i11);
        this.f12892s = Integer.valueOf(i12);
        return this;
    }

    @a3.d0
    public c0 i0() {
        return this.f12881h;
    }

    public c<T> i1(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("prefWidth cannot be null.");
        }
        this.f12876c = c0Var;
        return this;
    }

    public c<T> j(boolean z11, boolean z12) {
        this.f12891r = z11 ? N : M;
        this.f12892s = z12 ? N : M;
        return this;
    }

    public float j0() {
        return this.f12883j.b(this.f12896w);
    }

    public c<T> j1() {
        Integer num = this.f12890q;
        if (num == null) {
            this.f12890q = S;
            return this;
        }
        this.f12890q = Integer.valueOf((num.intValue() | 16) & (-9));
        return this;
    }

    public c<T> k() {
        this.f12891r = N;
        return this;
    }

    @a3.d0
    public c0 k0() {
        return this.f12883j;
    }

    public void k1() {
        this.B.b5();
    }

    public c<T> l() {
        this.f12892s = N;
        return this;
    }

    public float l0() {
        return this.f12880g.b(this.f12896w);
    }

    public void l1(c cVar) {
        this.f12874a = cVar.f12874a;
        this.f12875b = cVar.f12875b;
        this.f12876c = cVar.f12876c;
        this.f12877d = cVar.f12877d;
        this.f12878e = cVar.f12878e;
        this.f12879f = cVar.f12879f;
        this.f12880g = cVar.f12880g;
        this.f12881h = cVar.f12881h;
        this.f12882i = cVar.f12882i;
        this.f12883j = cVar.f12883j;
        this.f12884k = cVar.f12884k;
        this.f12885l = cVar.f12885l;
        this.f12886m = cVar.f12886m;
        this.f12887n = cVar.f12887n;
        this.f12888o = cVar.f12888o;
        this.f12889p = cVar.f12889p;
        this.f12890q = cVar.f12890q;
        this.f12891r = cVar.f12891r;
        this.f12892s = cVar.f12892s;
        this.f12893t = cVar.f12893t;
        this.f12894u = cVar.f12894u;
        this.f12895v = cVar.f12895v;
    }

    public c<T> m() {
        Float f11 = L;
        this.f12888o = f11;
        this.f12889p = f11;
        return this;
    }

    @a3.d0
    public c0 m0() {
        return this.f12880g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <A extends com.badlogic.gdx.scenes.scene2d.a> c<A> m1(@a3.d0 A a11) {
        com.badlogic.gdx.scenes.scene2d.a aVar = this.f12896w;
        if (aVar != a11) {
            if (aVar != null && aVar.A1() == this.B) {
                this.f12896w.j2();
            }
            this.f12896w = a11;
            if (a11 != null) {
                this.B.a3(a11);
            }
        }
        return this;
    }

    public c<T> n(float f11, float f12) {
        this.f12888o = Float.valueOf(f11);
        this.f12889p = Float.valueOf(f12);
        return this;
    }

    public Table n0() {
        return this.B;
    }

    public void n1(float f11, float f12, float f13, float f14) {
        this.f12897x = f11;
        this.f12898y = f12;
        this.f12899z = f13;
        this.A = f14;
    }

    public c<T> o(boolean z11) {
        this.f12888o = z11 ? L : K;
        this.f12889p = z11 ? L : K;
        return this;
    }

    @a3.d0
    public Boolean o0() {
        return this.f12894u;
    }

    public void o1(float f11) {
        this.A = f11;
    }

    public c<T> p(boolean z11, boolean z12) {
        this.f12888o = z11 ? L : K;
        this.f12889p = z12 ? L : K;
        return this;
    }

    @a3.d0
    public Boolean p0() {
        return this.f12895v;
    }

    public void p1(float f11) {
        this.f12899z = f11;
    }

    public c<T> q() {
        this.f12888o = L;
        return this;
    }

    public c<T> q0() {
        Integer num = N;
        this.f12891r = num;
        this.f12892s = num;
        Float f11 = L;
        this.f12888o = f11;
        this.f12889p = f11;
        return this;
    }

    public void q1(float f11) {
        this.f12897x = f11;
    }

    public c<T> r() {
        this.f12889p = L;
        return this;
    }

    public c<T> r0() {
        this.f12891r = N;
        this.f12888o = L;
        return this;
    }

    public void r1(float f11) {
        this.f12898y = f11;
    }

    @Override // a3.j0.a
    public void reset() {
        this.f12896w = null;
        this.B = null;
        this.C = false;
        this.F = -1;
        l1(g());
    }

    @a3.d0
    public T s() {
        return (T) this.f12896w;
    }

    public c<T> s0() {
        this.f12892s = N;
        this.f12889p = L;
        return this;
    }

    public void s1(Table table) {
        this.B = table;
    }

    public float t() {
        return this.A;
    }

    public boolean t0() {
        return this.f12896w != null;
    }

    public c<T> t1(float f11) {
        v1(c0.k.g(f11));
        return this;
    }

    public String toString() {
        com.badlogic.gdx.scenes.scene2d.a aVar = this.f12896w;
        return aVar != null ? aVar.toString() : super.toString();
    }

    public float u() {
        return this.f12899z;
    }

    public c<T> u0(float f11) {
        v0(c0.k.g(f11));
        return this;
    }

    public c<T> u1(float f11, float f12) {
        w1(c0.k.g(f11), c0.k.g(f12));
        return this;
    }

    public float v() {
        return this.f12897x;
    }

    public c<T> v0(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("height cannot be null.");
        }
        this.f12875b = c0Var;
        this.f12877d = c0Var;
        this.f12879f = c0Var;
        return this;
    }

    public c<T> v1(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("size cannot be null.");
        }
        this.f12874a = c0Var;
        this.f12875b = c0Var;
        this.f12876c = c0Var;
        this.f12877d = c0Var;
        this.f12878e = c0Var;
        this.f12879f = c0Var;
        return this;
    }

    public float w() {
        return this.f12898y;
    }

    public boolean w0() {
        return this.C;
    }

    public c<T> w1(c0 c0Var, c0 c0Var2) {
        if (c0Var == null) {
            throw new IllegalArgumentException("width cannot be null.");
        }
        if (c0Var2 == null) {
            throw new IllegalArgumentException("height cannot be null.");
        }
        this.f12874a = c0Var;
        this.f12875b = c0Var2;
        this.f12876c = c0Var;
        this.f12877d = c0Var2;
        this.f12878e = c0Var;
        this.f12879f = c0Var2;
        return this;
    }

    @a3.d0
    public Integer x() {
        return this.f12890q;
    }

    public c<T> x0() {
        Integer num = this.f12890q;
        if (num == null) {
            this.f12890q = R;
            return this;
        }
        this.f12890q = Integer.valueOf((num.intValue() | 8) & (-17));
        return this;
    }

    public c<T> x1(float f11) {
        if (f11 >= 0.0f) {
            z1(c0.k.g(f11));
            return this;
        }
        throw new IllegalArgumentException("space cannot be < 0: " + f11);
    }

    @a3.d0
    public Integer y() {
        return this.f12893t;
    }

    public c<T> y0(float f11) {
        this.f12879f = c0.k.g(f11);
        return this;
    }

    public c<T> y1(float f11, float f12, float f13, float f14) {
        if (f11 < 0.0f) {
            throw new IllegalArgumentException("top cannot be < 0: " + f11);
        }
        if (f12 < 0.0f) {
            throw new IllegalArgumentException("left cannot be < 0: " + f12);
        }
        if (f13 < 0.0f) {
            throw new IllegalArgumentException("bottom cannot be < 0: " + f13);
        }
        if (f14 >= 0.0f) {
            A1(c0.k.g(f11), c0.k.g(f12), c0.k.g(f13), c0.k.g(f14));
            return this;
        }
        throw new IllegalArgumentException("right cannot be < 0: " + f14);
    }

    public int z() {
        return this.D;
    }

    public c<T> z0(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("maxHeight cannot be null.");
        }
        this.f12879f = c0Var;
        return this;
    }

    public c<T> z1(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("space cannot be null.");
        }
        this.f12880g = c0Var;
        this.f12881h = c0Var;
        this.f12882i = c0Var;
        this.f12883j = c0Var;
        return this;
    }
}
