package com.badlogic.gdx.scenes.scene2d;

import a3.d0;
import a3.j0;
import a3.l0;
import a3.q;
import a3.q0;
import a3.u0;
import com.badlogic.gdx.Application;
import com.badlogic.gdx.graphics.f;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.k;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.FocusListener;
import h3.g;
import q1.h;
import w1.m;
import x2.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c extends h implements q {

    /* renamed from: x, reason: collision with root package name */
    public static boolean f12779x;

    /* renamed from: a, reason: collision with root package name */
    public g f12780a;

    /* renamed from: b, reason: collision with root package name */
    public final w1.a f12781b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12782c;

    /* renamed from: d, reason: collision with root package name */
    public d f12783d;

    /* renamed from: e, reason: collision with root package name */
    public final Vector2 f12784e;

    /* renamed from: f, reason: collision with root package name */
    public final com.badlogic.gdx.scenes.scene2d.a[] f12785f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f12786g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f12787h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f12788i;

    /* renamed from: j, reason: collision with root package name */
    public int f12789j;

    /* renamed from: k, reason: collision with root package name */
    public int f12790k;

    /* renamed from: l, reason: collision with root package name */
    @d0
    public com.badlogic.gdx.scenes.scene2d.a f12791l;

    /* renamed from: m, reason: collision with root package name */
    @d0
    public com.badlogic.gdx.scenes.scene2d.a f12792m;

    /* renamed from: n, reason: collision with root package name */
    @d0
    public com.badlogic.gdx.scenes.scene2d.a f12793n;

    /* renamed from: o, reason: collision with root package name */
    public final u0<a> f12794o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f12795p;

    /* renamed from: q, reason: collision with root package name */
    public ShapeRenderer f12796q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f12797r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f12798s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f12799t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f12800u;

    /* renamed from: v, reason: collision with root package name */
    public Table.Debug f12801v;

    /* renamed from: w, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.b f12802w;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements j0.a {

        /* renamed from: a, reason: collision with root package name */
        public x2.c f12803a;

        /* renamed from: b, reason: collision with root package name */
        public com.badlogic.gdx.scenes.scene2d.a f12804b;

        /* renamed from: c, reason: collision with root package name */
        public com.badlogic.gdx.scenes.scene2d.a f12805c;

        /* renamed from: d, reason: collision with root package name */
        public int f12806d;

        /* renamed from: e, reason: collision with root package name */
        public int f12807e;

        @Override // a3.j0.a
        public void reset() {
            this.f12804b = null;
            this.f12803a = null;
            this.f12805c = null;
        }
    }

    public c() {
        this(new h3.d(q0.f1621g, q1.g.f81379b.getWidth(), q1.g.f81379b.getHeight(), new k()), new m());
        this.f12782c = true;
    }

    public boolean A1(x2.c cVar) {
        return this.f12783d.l2(cVar);
    }

    public boolean B1(x2.c cVar) {
        return this.f12783d.m2(cVar);
    }

    public void C0(com.badlogic.gdx.scenes.scene2d.a aVar) {
        int length = this.f12785f.length;
        for (int i11 = 0; i11 < length; i11++) {
            com.badlogic.gdx.scenes.scene2d.a[] aVarArr = this.f12785f;
            if (aVar == aVarArr[i11]) {
                aVarArr[i11] = null;
                l1(aVar, this.f12787h[i11], this.f12788i[i11], i11);
            }
        }
        if (aVar == this.f12791l) {
            this.f12791l = null;
            l1(aVar, this.f12789j, this.f12790k, -1);
        }
    }

    public void C1(x2.c cVar, com.badlogic.gdx.scenes.scene2d.a aVar, com.badlogic.gdx.scenes.scene2d.a aVar2, int i11, int i12) {
        u0<a> u0Var = this.f12794o;
        for (int i13 = u0Var.f13179b - 1; i13 >= 0; i13--) {
            a aVar3 = u0Var.get(i13);
            if (aVar3.f12803a == cVar && aVar3.f12804b == aVar && aVar3.f12805c == aVar2 && aVar3.f12806d == i11 && aVar3.f12807e == i12) {
                u0Var.A(i13);
                l0.a(aVar3);
            }
        }
    }

    @Override // q1.h, q1.k
    public boolean D(float f11, float f12) {
        com.badlogic.gdx.scenes.scene2d.a aVar = this.f12793n;
        if (aVar == null) {
            aVar = this.f12783d;
        }
        D1(this.f12784e.set(this.f12789j, this.f12790k));
        InputEvent inputEvent = (InputEvent) l0.f(InputEvent.class);
        inputEvent.M(InputEvent.Type.scrolled);
        inputEvent.n(this);
        inputEvent.J(this.f12784e.f12535x);
        inputEvent.K(this.f12784e.f12536y);
        inputEvent.H(f11);
        inputEvent.I(f12);
        aVar.q1(inputEvent);
        boolean i11 = inputEvent.i();
        l0.a(inputEvent);
        return i11;
    }

    public Vector2 D1(Vector2 vector2) {
        this.f12780a.F(vector2);
        return vector2;
    }

    public void E1(boolean z11) {
        this.f12795p = z11;
    }

    public void F1(boolean z11) {
        if (this.f12798s == z11) {
            return;
        }
        this.f12798s = z11;
        if (z11) {
            f12779x = true;
        } else {
            this.f12783d.A3(false, true);
        }
    }

    public void G1(boolean z11) {
        this.f12797r = z11;
    }

    public void H1(boolean z11) {
        if (this.f12800u == z11) {
            return;
        }
        this.f12800u = z11;
        if (z11) {
            f12779x = true;
        } else {
            this.f12783d.A3(false, true);
        }
    }

    @Override // q1.h, q1.k
    public boolean I(int i11, int i12, int i13) {
        this.f12787h[i13] = i11;
        this.f12788i[i13] = i12;
        this.f12789j = i11;
        this.f12790k = i12;
        if (this.f12794o.f13179b == 0) {
            return false;
        }
        D1(this.f12784e.set(i11, i12));
        InputEvent inputEvent = (InputEvent) l0.f(InputEvent.class);
        inputEvent.M(InputEvent.Type.touchDragged);
        inputEvent.n(this);
        inputEvent.J(this.f12784e.f12535x);
        inputEvent.K(this.f12784e.f12536y);
        inputEvent.F(i13);
        u0<a> u0Var = this.f12794o;
        a[] U = u0Var.U();
        int i14 = u0Var.f13179b;
        for (int i15 = 0; i15 < i14; i15++) {
            a aVar = U[i15];
            if (aVar.f12806d == i13 && u0Var.l(aVar, true)) {
                inputEvent.o(aVar.f12805c);
                inputEvent.m(aVar.f12804b);
                if (aVar.f12803a.a(inputEvent)) {
                    inputEvent.f();
                }
            }
        }
        u0Var.V();
        boolean i16 = inputEvent.i();
        l0.a(inputEvent);
        return i16;
    }

    public void I1(@d0 Table.Debug debug) {
        if (debug == null) {
            debug = Table.Debug.none;
        }
        if (this.f12801v == debug) {
            return;
        }
        this.f12801v = debug;
        if (debug != Table.Debug.none) {
            f12779x = true;
        } else {
            this.f12783d.A3(false, true);
        }
    }

    public void J0(x2.a aVar) {
        this.f12783d.b1(aVar);
    }

    public void J1(boolean z11) {
        I1(z11 ? Table.Debug.all : Table.Debug.none);
    }

    public void K1(boolean z11) {
        if (this.f12799t == z11) {
            return;
        }
        this.f12799t = z11;
        if (z11) {
            f12779x = true;
        } else {
            this.f12783d.A3(false, true);
        }
    }

    public boolean L1(@d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
        if (this.f12792m == aVar) {
            return true;
        }
        FocusListener.FocusEvent focusEvent = (FocusListener.FocusEvent) l0.f(FocusListener.FocusEvent.class);
        focusEvent.n(this);
        focusEvent.v(FocusListener.FocusEvent.Type.keyboard);
        com.badlogic.gdx.scenes.scene2d.a aVar2 = this.f12792m;
        if (aVar2 != null) {
            focusEvent.t(false);
            focusEvent.u(aVar);
            aVar2.q1(focusEvent);
        }
        boolean g11 = focusEvent.g();
        boolean z11 = !g11;
        if (!g11) {
            this.f12792m = aVar;
            if (aVar != null) {
                focusEvent.t(true);
                focusEvent.u(aVar2);
                aVar.q1(focusEvent);
                boolean g12 = focusEvent.g();
                z11 = !g12;
                if (g12) {
                    this.f12792m = aVar2;
                }
            }
        }
        l0.a(focusEvent);
        return z11;
    }

    public void M1(d dVar) {
        d dVar2 = dVar.f12758b;
        if (dVar2 != null) {
            dVar2.w3(dVar, false);
        }
        this.f12783d = dVar;
        dVar.B2(null);
        dVar.K2(this);
    }

    public boolean N1(@d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
        if (this.f12793n == aVar) {
            return true;
        }
        FocusListener.FocusEvent focusEvent = (FocusListener.FocusEvent) l0.f(FocusListener.FocusEvent.class);
        focusEvent.n(this);
        focusEvent.v(FocusListener.FocusEvent.Type.scroll);
        com.badlogic.gdx.scenes.scene2d.a aVar2 = this.f12793n;
        if (aVar2 != null) {
            focusEvent.t(false);
            focusEvent.u(aVar);
            aVar2.q1(focusEvent);
        }
        boolean g11 = focusEvent.g();
        boolean z11 = !g11;
        if (!g11) {
            this.f12793n = aVar;
            if (aVar != null) {
                focusEvent.t(true);
                focusEvent.u(aVar2);
                aVar.q1(focusEvent);
                boolean g12 = focusEvent.g();
                z11 = !g12;
                if (g12) {
                    this.f12793n = aVar2;
                }
            }
        }
        l0.a(focusEvent);
        return z11;
    }

    public void O1(g gVar) {
        this.f12780a = gVar;
    }

    public Vector2 P1(Vector2 vector2) {
        this.f12780a.r(vector2);
        vector2.f12536y = q1.g.f81379b.getHeight() - vector2.f12536y;
        return vector2;
    }

    public void Q0(com.badlogic.gdx.scenes.scene2d.a aVar) {
        this.f12783d.a3(aVar);
    }

    public Vector2 Q1(Vector2 vector2, Matrix4 matrix4) {
        return this.f12780a.E(vector2, matrix4);
    }

    @Override // q1.h, q1.k
    public boolean R(int i11, int i12) {
        this.f12789j = i11;
        this.f12790k = i12;
        if (!z1(i11, i12)) {
            return false;
        }
        D1(this.f12784e.set(i11, i12));
        InputEvent inputEvent = (InputEvent) l0.f(InputEvent.class);
        inputEvent.M(InputEvent.Type.mouseMoved);
        inputEvent.n(this);
        inputEvent.J(this.f12784e.f12535x);
        inputEvent.K(this.f12784e.f12536y);
        Vector2 vector2 = this.f12784e;
        com.badlogic.gdx.scenes.scene2d.a x12 = x1(vector2.f12535x, vector2.f12536y, true);
        if (x12 == null) {
            x12 = this.f12783d;
        }
        x12.q1(inputEvent);
        boolean i13 = inputEvent.i();
        l0.a(inputEvent);
        return i13;
    }

    public void R1(com.badlogic.gdx.scenes.scene2d.a aVar) {
        e1(aVar);
        com.badlogic.gdx.scenes.scene2d.a aVar2 = this.f12793n;
        if (aVar2 != null && aVar2.V1(aVar)) {
            N1(null);
        }
        com.badlogic.gdx.scenes.scene2d.a aVar3 = this.f12792m;
        if (aVar3 == null || !aVar3.V1(aVar)) {
            return;
        }
        L1(null);
    }

    public void S1() {
        N1(null);
        L1(null);
        d1();
    }

    public boolean V0(x2.c cVar) {
        return this.f12783d.c1(cVar);
    }

    @Override // q1.h, q1.k
    public boolean X(int i11) {
        com.badlogic.gdx.scenes.scene2d.a aVar = this.f12792m;
        if (aVar == null) {
            aVar = this.f12783d;
        }
        InputEvent inputEvent = (InputEvent) l0.f(InputEvent.class);
        inputEvent.M(InputEvent.Type.keyUp);
        inputEvent.n(this);
        inputEvent.E(i11);
        aVar.q1(inputEvent);
        boolean i12 = inputEvent.i();
        l0.a(inputEvent);
        return i12;
    }

    @Override // q1.h, q1.k
    public boolean Z(int i11) {
        com.badlogic.gdx.scenes.scene2d.a aVar = this.f12792m;
        if (aVar == null) {
            aVar = this.f12783d;
        }
        InputEvent inputEvent = (InputEvent) l0.f(InputEvent.class);
        inputEvent.M(InputEvent.Type.keyDown);
        inputEvent.n(this);
        inputEvent.E(i11);
        aVar.q1(inputEvent);
        boolean i12 = inputEvent.i();
        l0.a(inputEvent);
        return i12;
    }

    public boolean a1(x2.c cVar) {
        return this.f12783d.d1(cVar);
    }

    @Override // q1.h, q1.k
    public boolean b(int i11, int i12, int i13, int i14) {
        this.f12786g[i13] = false;
        this.f12787h[i13] = i11;
        this.f12788i[i13] = i12;
        if (this.f12794o.f13179b == 0) {
            return false;
        }
        D1(this.f12784e.set(i11, i12));
        InputEvent inputEvent = (InputEvent) l0.f(InputEvent.class);
        inputEvent.M(InputEvent.Type.touchUp);
        inputEvent.n(this);
        inputEvent.J(this.f12784e.f12535x);
        inputEvent.K(this.f12784e.f12536y);
        inputEvent.F(i13);
        inputEvent.C(i14);
        u0<a> u0Var = this.f12794o;
        a[] U = u0Var.U();
        int i15 = u0Var.f13179b;
        for (int i16 = 0; i16 < i15; i16++) {
            a aVar = U[i16];
            if (aVar.f12806d == i13 && aVar.f12807e == i14 && u0Var.C(aVar, true)) {
                inputEvent.o(aVar.f12805c);
                inputEvent.m(aVar.f12804b);
                if (aVar.f12803a.a(inputEvent)) {
                    inputEvent.f();
                }
                l0.a(aVar);
            }
        }
        u0Var.V();
        boolean i17 = inputEvent.i();
        l0.a(inputEvent);
        return i17;
    }

    public void b1(x2.c cVar, com.badlogic.gdx.scenes.scene2d.a aVar, com.badlogic.gdx.scenes.scene2d.a aVar2, int i11, int i12) {
        a aVar3 = (a) l0.f(a.class);
        aVar3.f12804b = aVar;
        aVar3.f12805c = aVar2;
        aVar3.f12803a = cVar;
        aVar3.f12806d = i11;
        aVar3.f12807e = i12;
        this.f12794o.a(aVar3);
    }

    public void c1(Rectangle rectangle, Rectangle rectangle2) {
        ShapeRenderer shapeRenderer = this.f12796q;
        this.f12780a.c((shapeRenderer == null || !shapeRenderer.e0()) ? this.f12781b.B0() : this.f12796q.B0(), rectangle, rectangle2);
    }

    public void d1() {
        f1(null, null);
    }

    @Override // a3.q
    public void dispose() {
        g1();
        if (this.f12782c) {
            this.f12781b.dispose();
        }
        ShapeRenderer shapeRenderer = this.f12796q;
        if (shapeRenderer != null) {
            shapeRenderer.dispose();
        }
    }

    public void e1(com.badlogic.gdx.scenes.scene2d.a aVar) {
        u0<a> u0Var = this.f12794o;
        a[] U = u0Var.U();
        int i11 = u0Var.f13179b;
        InputEvent inputEvent = null;
        for (int i12 = 0; i12 < i11; i12++) {
            a aVar2 = U[i12];
            if (aVar2.f12804b == aVar && u0Var.C(aVar2, true)) {
                if (inputEvent == null) {
                    inputEvent = (InputEvent) l0.f(InputEvent.class);
                    inputEvent.M(InputEvent.Type.touchUp);
                    inputEvent.n(this);
                    inputEvent.J(-2.14748365E9f);
                    inputEvent.K(-2.14748365E9f);
                }
                inputEvent.o(aVar2.f12805c);
                inputEvent.m(aVar2.f12804b);
                inputEvent.F(aVar2.f12806d);
                inputEvent.C(aVar2.f12807e);
                aVar2.f12803a.a(inputEvent);
            }
        }
        u0Var.V();
        if (inputEvent != null) {
            l0.a(inputEvent);
        }
    }

    public void f1(@d0 x2.c cVar, @d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
        InputEvent inputEvent = (InputEvent) l0.f(InputEvent.class);
        inputEvent.M(InputEvent.Type.touchUp);
        inputEvent.n(this);
        inputEvent.J(-2.14748365E9f);
        inputEvent.K(-2.14748365E9f);
        u0<a> u0Var = this.f12794o;
        a[] U = u0Var.U();
        int i11 = u0Var.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            a aVar2 = U[i12];
            if ((aVar2.f12803a != cVar || aVar2.f12804b != aVar) && u0Var.C(aVar2, true)) {
                inputEvent.o(aVar2.f12805c);
                inputEvent.m(aVar2.f12804b);
                inputEvent.F(aVar2.f12806d);
                inputEvent.C(aVar2.f12807e);
                aVar2.f12803a.a(inputEvent);
            }
        }
        u0Var.V();
        l0.a(inputEvent);
    }

    public void g1() {
        S1();
        this.f12783d.g1();
    }

    public final void h1(com.badlogic.gdx.scenes.scene2d.a aVar, com.badlogic.gdx.scenes.scene2d.a aVar2) {
        if (aVar == aVar2) {
            return;
        }
        aVar.u2(false);
        if (aVar instanceof d) {
            u0<com.badlogic.gdx.scenes.scene2d.a> u0Var = ((d) aVar).f97066u;
            int i11 = u0Var.f13179b;
            for (int i12 = 0; i12 < i11; i12++) {
                h1(u0Var.get(i12), aVar2);
            }
        }
    }

    @Override // q1.h, q1.k
    public boolean i0(char c11) {
        com.badlogic.gdx.scenes.scene2d.a aVar = this.f12792m;
        if (aVar == null) {
            aVar = this.f12783d;
        }
        InputEvent inputEvent = (InputEvent) l0.f(InputEvent.class);
        inputEvent.M(InputEvent.Type.keyTyped);
        inputEvent.n(this);
        inputEvent.D(c11);
        aVar.q1(inputEvent);
        boolean i11 = inputEvent.i();
        l0.a(inputEvent);
        return i11;
    }

    public void i1() {
        com.badlogic.gdx.graphics.a e11 = this.f12780a.e();
        e11.r();
        if (this.f12783d.Z1()) {
            w1.a aVar = this.f12781b;
            aVar.Z0(e11.f11513f);
            aVar.c();
            this.f12783d.n1(aVar, 1.0f);
            aVar.end();
            if (f12779x) {
                j1();
            }
        }
    }

    public final void j1() {
        d dVar;
        if (this.f12796q == null) {
            ShapeRenderer shapeRenderer = new ShapeRenderer();
            this.f12796q = shapeRenderer;
            shapeRenderer.x1(true);
        }
        if (this.f12799t || this.f12800u || this.f12801v != Table.Debug.none) {
            D1(this.f12784e.set(q1.g.f81381d.C(), q1.g.f81381d.getY()));
            Vector2 vector2 = this.f12784e;
            com.badlogic.gdx.scenes.scene2d.a x12 = x1(vector2.f12535x, vector2.f12536y, true);
            if (x12 == null) {
                return;
            }
            if (this.f12800u && (dVar = x12.f12758b) != null) {
                x12 = dVar;
            }
            if (this.f12801v == Table.Debug.none) {
                x12.u2(true);
            } else {
                while (x12 != null && !(x12 instanceof Table)) {
                    x12 = x12.f12758b;
                }
                if (x12 == null) {
                    return;
                } else {
                    ((Table) x12).b4(this.f12801v);
                }
            }
            if (this.f12798s && (x12 instanceof d)) {
                ((d) x12).l3();
            }
            h1(this.f12783d, x12);
        } else if (this.f12798s) {
            this.f12783d.l3();
        }
        q1.g.f81384g.glEnable(f.f11564c0);
        this.f12796q.Z0(this.f12780a.e().f11513f);
        this.f12796q.c();
        this.f12783d.o1(this.f12796q);
        this.f12796q.end();
        q1.g.f81384g.glDisable(f.f11564c0);
    }

    @d0
    public final com.badlogic.gdx.scenes.scene2d.a k1(@d0 com.badlogic.gdx.scenes.scene2d.a aVar, int i11, int i12, int i13) {
        D1(this.f12784e.set(i11, i12));
        Vector2 vector2 = this.f12784e;
        com.badlogic.gdx.scenes.scene2d.a x12 = x1(vector2.f12535x, vector2.f12536y, true);
        if (x12 == aVar) {
            return aVar;
        }
        if (aVar != null) {
            InputEvent inputEvent = (InputEvent) l0.f(InputEvent.class);
            inputEvent.M(InputEvent.Type.exit);
            inputEvent.n(this);
            inputEvent.J(this.f12784e.f12535x);
            inputEvent.K(this.f12784e.f12536y);
            inputEvent.F(i13);
            inputEvent.G(x12);
            aVar.q1(inputEvent);
            l0.a(inputEvent);
        }
        if (x12 != null) {
            InputEvent inputEvent2 = (InputEvent) l0.f(InputEvent.class);
            inputEvent2.M(InputEvent.Type.enter);
            inputEvent2.n(this);
            inputEvent2.J(this.f12784e.f12535x);
            inputEvent2.K(this.f12784e.f12536y);
            inputEvent2.F(i13);
            inputEvent2.G(aVar);
            x12.q1(inputEvent2);
            l0.a(inputEvent2);
        }
        return x12;
    }

    public final void l1(com.badlogic.gdx.scenes.scene2d.a aVar, int i11, int i12, int i13) {
        D1(this.f12784e.set(i11, i12));
        InputEvent inputEvent = (InputEvent) l0.f(InputEvent.class);
        inputEvent.M(InputEvent.Type.exit);
        inputEvent.n(this);
        inputEvent.J(this.f12784e.f12535x);
        inputEvent.K(this.f12784e.f12536y);
        inputEvent.F(i13);
        inputEvent.G(aVar);
        aVar.q1(inputEvent);
        l0.a(inputEvent);
    }

    public boolean m1() {
        return this.f12795p;
    }

    public void n0() {
        w0(Math.min(q1.g.f81379b.S(), 0.033333335f));
    }

    public com.badlogic.gdx.utils.a<com.badlogic.gdx.scenes.scene2d.a> n1() {
        return this.f12783d.f97066u;
    }

    @Override // q1.h, q1.k
    public boolean o(int i11, int i12, int i13, int i14) {
        if (!z1(i11, i12)) {
            return false;
        }
        this.f12786g[i13] = true;
        this.f12787h[i13] = i11;
        this.f12788i[i13] = i12;
        D1(this.f12784e.set(i11, i12));
        InputEvent inputEvent = (InputEvent) l0.f(InputEvent.class);
        inputEvent.M(InputEvent.Type.touchDown);
        inputEvent.n(this);
        inputEvent.J(this.f12784e.f12535x);
        inputEvent.K(this.f12784e.f12536y);
        inputEvent.F(i13);
        inputEvent.C(i14);
        Vector2 vector2 = this.f12784e;
        com.badlogic.gdx.scenes.scene2d.a x12 = x1(vector2.f12535x, vector2.f12536y, true);
        if (x12 != null) {
            x12.q1(inputEvent);
        } else if (this.f12783d.H1() == Touchable.enabled) {
            this.f12783d.q1(inputEvent);
        }
        boolean i15 = inputEvent.i();
        l0.a(inputEvent);
        return i15;
    }

    public w1.a o1() {
        return this.f12781b;
    }

    public com.badlogic.gdx.graphics.a p1() {
        return this.f12780a.e();
    }

    public com.badlogic.gdx.graphics.b q1() {
        return this.f12802w;
    }

    public float r1() {
        return this.f12780a.p();
    }

    @d0
    public com.badlogic.gdx.scenes.scene2d.a s1() {
        return this.f12792m;
    }

    public d t1() {
        return this.f12783d;
    }

    @d0
    public com.badlogic.gdx.scenes.scene2d.a u1() {
        return this.f12793n;
    }

    public g v1() {
        return this.f12780a;
    }

    public void w0(float f11) {
        int length = this.f12785f.length;
        for (int i11 = 0; i11 < length; i11++) {
            com.badlogic.gdx.scenes.scene2d.a[] aVarArr = this.f12785f;
            com.badlogic.gdx.scenes.scene2d.a aVar = aVarArr[i11];
            if (this.f12786g[i11]) {
                aVarArr[i11] = k1(aVar, this.f12787h[i11], this.f12788i[i11], i11);
            } else if (aVar != null) {
                aVarArr[i11] = null;
                l1(aVar, this.f12787h[i11], this.f12788i[i11], i11);
            }
        }
        Application.ApplicationType type = q1.g.f81378a.getType();
        if (type == Application.ApplicationType.Desktop || type == Application.ApplicationType.Applet || type == Application.ApplicationType.WebGL) {
            this.f12791l = k1(this.f12791l, this.f12789j, this.f12790k, -1);
        }
        this.f12783d.a1(f11);
    }

    public float w1() {
        return this.f12780a.q();
    }

    @d0
    public com.badlogic.gdx.scenes.scene2d.a x1(float f11, float f12, boolean z11) {
        this.f12783d.h2(this.f12784e.set(f11, f12));
        d dVar = this.f12783d;
        Vector2 vector2 = this.f12784e;
        return dVar.T1(vector2.f12535x, vector2.f12536y, z11);
    }

    public boolean y1() {
        return this.f12798s;
    }

    @Override // q1.h, q1.k
    public boolean z(int i11, int i12, int i13, int i14) {
        d1();
        return false;
    }

    public boolean z1(int i11, int i12) {
        int l11 = this.f12780a.l();
        int k11 = this.f12780a.k() + l11;
        int m11 = this.f12780a.m();
        int j11 = this.f12780a.j() + m11;
        int height = (q1.g.f81379b.getHeight() - 1) - i12;
        return i11 >= l11 && i11 < k11 && height >= m11 && height < j11;
    }

    public c(g gVar) {
        this(gVar, new m());
        this.f12782c = true;
    }

    public c(g gVar, w1.a aVar) {
        this.f12784e = new Vector2();
        this.f12785f = new com.badlogic.gdx.scenes.scene2d.a[20];
        this.f12786g = new boolean[20];
        this.f12787h = new int[20];
        this.f12788i = new int[20];
        this.f12794o = new u0<>(true, 4, a.class);
        this.f12795p = true;
        this.f12801v = Table.Debug.none;
        this.f12802w = new com.badlogic.gdx.graphics.b(0.0f, 1.0f, 0.0f, 0.85f);
        if (gVar == null) {
            throw new IllegalArgumentException("viewport cannot be null.");
        }
        if (aVar != null) {
            this.f12780a = gVar;
            this.f12781b = aVar;
            d dVar = new d();
            this.f12783d = dVar;
            dVar.K2(this);
            gVar.I(q1.g.f81379b.getWidth(), q1.g.f81379b.getHeight(), true);
            return;
        }
        throw new IllegalArgumentException("batch cannot be null.");
    }
}
