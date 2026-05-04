package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.a;
import com.badlogic.gdx.scenes.scene2d.ui.c0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e<T extends com.badlogic.gdx.scenes.scene2d.a> extends f0 {

    @a3.d0
    public T E;
    public c0 F;
    public c0 G;
    public c0 H;
    public c0 I;
    public c0 J;
    public c0 K;
    public c0 L;
    public c0 M;
    public c0 N;
    public c0 O;
    public float P;
    public float Q;
    public int R;

    @a3.d0
    public z2.k S;
    public boolean T;
    public boolean U;

    public e() {
        this.F = c0.f12901b;
        this.G = c0.f12902c;
        this.H = c0.f12903d;
        this.I = c0.f12904e;
        c0.k kVar = c0.f12900a;
        this.J = kVar;
        this.K = kVar;
        this.L = kVar;
        this.M = kVar;
        this.N = kVar;
        this.O = kVar;
        this.U = true;
        L2(Touchable.childrenOnly);
        B3(false);
    }

    public e<T> A4(float f11) {
        this.G = c0.k.g(f11);
        return this;
    }

    public e<T> B4(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("minHeight cannot be null.");
        }
        this.G = c0Var;
        return this;
    }

    public e<T> C4(float f11) {
        E4(c0.k.g(f11));
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac  */
    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D() {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.scenes.scene2d.ui.e.D():void");
    }

    public e<T> D4(float f11, float f12) {
        F4(c0.k.g(f11), c0.k.g(f12));
        return this;
    }

    public e<T> E4(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("size cannot be null.");
        }
        this.F = c0Var;
        this.G = c0Var;
        return this;
    }

    public e<T> F4(c0 c0Var, c0 c0Var2) {
        if (c0Var == null) {
            throw new IllegalArgumentException("width cannot be null.");
        }
        if (c0Var2 == null) {
            throw new IllegalArgumentException("height cannot be null.");
        }
        this.F = c0Var;
        this.G = c0Var2;
        return this;
    }

    public e<T> G4(float f11) {
        this.F = c0.k.g(f11);
        return this;
    }

    public e<T> H3(int i11) {
        this.R = i11;
        return this;
    }

    public e<T> H4(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("minWidth cannot be null.");
        }
        this.F = c0Var;
        return this;
    }

    public e<T> I3(@a3.d0 z2.k kVar) {
        e5(kVar);
        return this;
    }

    public e<T> I4(float f11) {
        c0.k g11 = c0.k.g(f11);
        this.L = g11;
        this.M = g11;
        this.N = g11;
        this.O = g11;
        return this;
    }

    public e<T> J3() {
        this.R = (this.R | 4) & (-3);
        return this;
    }

    public e<T> J4(float f11, float f12, float f13, float f14) {
        this.L = c0.k.g(f11);
        this.M = c0.k.g(f12);
        this.N = c0.k.g(f13);
        this.O = c0.k.g(f14);
        return this;
    }

    public e<T> K3() {
        this.R = 1;
        return this;
    }

    public e<T> K4(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("pad cannot be null.");
        }
        this.L = c0Var;
        this.M = c0Var;
        this.N = c0Var;
        this.O = c0Var;
        return this;
    }

    public e<T> L3() {
        g5(true);
        return this;
    }

    public e<T> L4(c0 c0Var, c0 c0Var2, c0 c0Var3, c0 c0Var4) {
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
        this.L = c0Var;
        this.M = c0Var2;
        this.N = c0Var3;
        this.O = c0Var4;
        return this;
    }

    public e<T> M3(boolean z11) {
        g5(z11);
        return this;
    }

    public e<T> M4(float f11) {
        this.N = c0.k.g(f11);
        return this;
    }

    public void N3(w1.a aVar, float f11, float f12, float f13) {
        if (this.S == null) {
            return;
        }
        com.badlogic.gdx.graphics.b e11 = e();
        aVar.k(e11.f11544a, e11.f11545b, e11.f11546c, e11.f11547d * f11);
        this.S.y(aVar, f12, f13, J1(), v1());
    }

    public e<T> N4(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("padBottom cannot be null.");
        }
        this.N = c0Var;
        return this;
    }

    public e<T> O3() {
        this.P = 1.0f;
        this.Q = 1.0f;
        return this;
    }

    public e<T> O4(float f11) {
        this.M = c0.k.g(f11);
        return this;
    }

    public e<T> P3(float f11, float f12) {
        this.P = f11;
        this.Q = f12;
        return this;
    }

    public e<T> P4(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("padLeft cannot be null.");
        }
        this.M = c0Var;
        return this;
    }

    public e<T> Q3(boolean z11) {
        this.P = z11 ? 1.0f : 0.0f;
        this.Q = z11 ? 1.0f : 0.0f;
        return this;
    }

    public e<T> Q4(float f11) {
        this.O = c0.k.g(f11);
        return this;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public float R() {
        float b11 = this.I.b(this.E);
        z2.k kVar = this.S;
        if (kVar != null) {
            b11 = Math.max(b11, kVar.o());
        }
        return Math.max(o(), b11 + this.L.b(this) + this.N.b(this));
    }

    public e<T> R3(boolean z11, boolean z12) {
        this.P = z11 ? 1.0f : 0.0f;
        this.Q = z12 ? 1.0f : 0.0f;
        return this;
    }

    public e<T> R4(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("padRight cannot be null.");
        }
        this.O = c0Var;
        return this;
    }

    public e<T> S3() {
        this.P = 1.0f;
        return this;
    }

    public e<T> S4(float f11) {
        this.L = c0.k.g(f11);
        return this;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, x2.d, com.badlogic.gdx.scenes.scene2d.a
    @a3.d0
    public com.badlogic.gdx.scenes.scene2d.a T1(float f11, float f12, boolean z11) {
        if (!this.T || (!(z11 && H1() == Touchable.disabled) && f11 >= 0.0f && f11 < J1() && f12 >= 0.0f && f12 < v1())) {
            return super.T1(f11, f12, z11);
        }
        return null;
    }

    public e<T> T3() {
        this.Q = 1.0f;
        return this;
    }

    public e<T> T4(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("padTop cannot be null.");
        }
        this.L = c0Var;
        return this;
    }

    @a3.d0
    public T U3() {
        return this.E;
    }

    public e<T> U4(float f11) {
        this.I = c0.k.g(f11);
        return this;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public float V0() {
        float b11 = this.K.b(this.E);
        return b11 > 0.0f ? b11 + this.L.b(this) + this.N.b(this) : b11;
    }

    public int V3() {
        return this.R;
    }

    public e<T> V4(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("prefHeight cannot be null.");
        }
        this.I = c0Var;
        return this;
    }

    @a3.d0
    public z2.k W3() {
        return this.S;
    }

    public e<T> W4(float f11) {
        Y4(c0.k.g(f11));
        return this;
    }

    public boolean X3() {
        return this.T;
    }

    public e<T> X4(float f11, float f12) {
        Z4(c0.k.g(f11), c0.k.g(f12));
        return this;
    }

    public float Y3() {
        return this.P;
    }

    public e<T> Y4(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("size cannot be null.");
        }
        this.H = c0Var;
        this.I = c0Var;
        return this;
    }

    public float Z3() {
        return this.Q;
    }

    public e<T> Z4(c0 c0Var, c0 c0Var2) {
        if (c0Var == null) {
            throw new IllegalArgumentException("width cannot be null.");
        }
        if (c0Var2 == null) {
            throw new IllegalArgumentException("height cannot be null.");
        }
        this.H = c0Var;
        this.I = c0Var2;
        return this;
    }

    @Override // x2.d
    @Deprecated
    public void a3(com.badlogic.gdx.scenes.scene2d.a aVar) {
        throw new UnsupportedOperationException("Use Container#setActor.");
    }

    public c0 a4() {
        return this.K;
    }

    public e<T> a5(float f11) {
        this.H = c0.k.g(f11);
        return this;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public float b() {
        return this.F.b(this.E) + this.M.b(this) + this.O.b(this);
    }

    @Override // x2.d
    @Deprecated
    public void b3(com.badlogic.gdx.scenes.scene2d.a aVar, com.badlogic.gdx.scenes.scene2d.a aVar2) {
        throw new UnsupportedOperationException("Use Container#setActor.");
    }

    public c0 b4() {
        return this.J;
    }

    public e<T> b5(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("prefWidth cannot be null.");
        }
        this.H = c0Var;
        return this;
    }

    @Override // x2.d
    @Deprecated
    public void c3(int i11, com.badlogic.gdx.scenes.scene2d.a aVar) {
        throw new UnsupportedOperationException("Use Container#setActor.");
    }

    public c0 c4() {
        return this.G;
    }

    public e<T> c5() {
        this.R = (this.R | 16) & (-9);
        return this;
    }

    @Override // x2.d
    @Deprecated
    public void d3(com.badlogic.gdx.scenes.scene2d.a aVar, com.badlogic.gdx.scenes.scene2d.a aVar2) {
        throw new UnsupportedOperationException("Use Container#setActor.");
    }

    public float d4() {
        return this.N.b(this);
    }

    public void d5(@a3.d0 T t11) {
        if (t11 == this) {
            throw new IllegalArgumentException("actor cannot be the Container.");
        }
        T t12 = this.E;
        if (t11 == t12) {
            return;
        }
        if (t12 != null) {
            super.v3(t12);
        }
        this.E = t11;
        if (t11 != null) {
            super.a3(t11);
        }
    }

    public c0 e4() {
        return this.N;
    }

    public void e5(@a3.d0 z2.k kVar) {
        f5(kVar, true);
    }

    public float f4() {
        return this.M.b(this);
    }

    public void f5(@a3.d0 z2.k kVar, boolean z11) {
        if (this.S == kVar) {
            return;
        }
        this.S = kVar;
        if (z11) {
            if (kVar == null) {
                K4(c0.f12900a);
            } else {
                J4(kVar.w(), kVar.z(), kVar.s(), kVar.u());
            }
            invalidate();
        }
    }

    public c0 g4() {
        return this.M;
    }

    public void g5(boolean z11) {
        this.T = z11;
        B3(z11);
        invalidate();
    }

    public float h4() {
        return this.O.b(this);
    }

    public void h5(boolean z11) {
        this.U = z11;
    }

    @Override // x2.d, z2.f
    public void i0(Rectangle rectangle) {
        super.i0(rectangle);
        if (this.P == 1.0f && this.Q == 1.0f) {
            T t11 = this.E;
            if (t11 instanceof z2.f) {
                ((z2.f) t11).i0(rectangle);
            }
        }
    }

    public c0 i4() {
        return this.O;
    }

    public e<T> i5(float f11) {
        k5(c0.k.g(f11));
        return this;
    }

    public float j4() {
        return this.L.b(this);
    }

    public e<T> j5(float f11, float f12) {
        l5(c0.k.g(f11), c0.k.g(f12));
        return this;
    }

    public c0 k4() {
        return this.L;
    }

    public e<T> k5(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("size cannot be null.");
        }
        this.F = c0Var;
        this.G = c0Var;
        this.H = c0Var;
        this.I = c0Var;
        this.J = c0Var;
        this.K = c0Var;
        return this;
    }

    public float l4() {
        return this.M.b(this) + this.O.b(this);
    }

    public e<T> l5(c0 c0Var, c0 c0Var2) {
        if (c0Var == null) {
            throw new IllegalArgumentException("width cannot be null.");
        }
        if (c0Var2 == null) {
            throw new IllegalArgumentException("height cannot be null.");
        }
        this.F = c0Var;
        this.G = c0Var2;
        this.H = c0Var;
        this.I = c0Var2;
        this.J = c0Var;
        this.K = c0Var2;
        return this;
    }

    public float m4() {
        return this.L.b(this) + this.N.b(this);
    }

    public e<T> m5() {
        this.R = (this.R | 2) & (-5);
        return this;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public float n0() {
        float b11 = this.H.b(this.E);
        z2.k kVar = this.S;
        if (kVar != null) {
            b11 = Math.max(b11, kVar.b());
        }
        return Math.max(b(), b11 + this.M.b(this) + this.O.b(this));
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, x2.d, com.badlogic.gdx.scenes.scene2d.a
    public void n1(w1.a aVar, float f11) {
        Q0();
        if (!t3()) {
            N3(aVar, f11, K1(), M1());
            super.n1(aVar, f11);
            return;
        }
        f3(aVar, k3());
        N3(aVar, f11, 0.0f, 0.0f);
        if (this.T) {
            aVar.flush();
            float b11 = this.M.b(this);
            float b12 = this.N.b(this);
            if (k1(b11, b12, (J1() - b11) - this.O.b(this), (v1() - b12) - this.L.b(this))) {
                m3(aVar, f11);
                aVar.flush();
                l1();
            }
        } else {
            m3(aVar, f11);
        }
        z3(aVar);
    }

    public c0 n4() {
        return this.I;
    }

    public e<T> n5(float f11) {
        o5(c0.k.g(f11));
        return this;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public float o() {
        return this.G.b(this.E) + this.L.b(this) + this.N.b(this);
    }

    @Override // x2.d, com.badlogic.gdx.scenes.scene2d.a
    public void o1(ShapeRenderer shapeRenderer) {
        Q0();
        if (!t3()) {
            super.o1(shapeRenderer);
            return;
        }
        e3(shapeRenderer, k3());
        if (this.T) {
            shapeRenderer.flush();
            float b11 = this.M.b(this);
            float b12 = this.N.b(this);
            if (this.S == null ? k1(0.0f, 0.0f, J1(), v1()) : k1(b11, b12, (J1() - b11) - this.O.b(this), (v1() - b12) - this.L.b(this))) {
                n3(shapeRenderer);
                l1();
            }
        } else {
            n3(shapeRenderer);
        }
        y3(shapeRenderer);
    }

    public c0 o4() {
        return this.H;
    }

    public e<T> o5(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("width cannot be null.");
        }
        this.F = c0Var;
        this.H = c0Var;
        this.J = c0Var;
        return this;
    }

    public e<T> p4(float f11) {
        q4(c0.k.g(f11));
        return this;
    }

    public e<T> q4(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("height cannot be null.");
        }
        this.G = c0Var;
        this.I = c0Var;
        this.K = c0Var;
        return this;
    }

    public e<T> r4() {
        this.R = (this.R | 8) & (-17);
        return this;
    }

    public e<T> s4(float f11) {
        this.K = c0.k.g(f11);
        return this;
    }

    public e<T> t4(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("maxHeight cannot be null.");
        }
        this.K = c0Var;
        return this;
    }

    public e<T> u4(float f11) {
        w4(c0.k.g(f11));
        return this;
    }

    @Override // x2.d
    public boolean v3(com.badlogic.gdx.scenes.scene2d.a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("actor cannot be null.");
        }
        if (aVar != this.E) {
            return false;
        }
        d5(null);
        return true;
    }

    public e<T> v4(float f11, float f12) {
        x4(c0.k.g(f11), c0.k.g(f12));
        return this;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public float w0() {
        float b11 = this.J.b(this.E);
        return b11 > 0.0f ? b11 + this.M.b(this) + this.O.b(this) : b11;
    }

    @Override // x2.d
    public boolean w3(com.badlogic.gdx.scenes.scene2d.a aVar, boolean z11) {
        if (aVar == null) {
            throw new IllegalArgumentException("actor cannot be null.");
        }
        if (aVar != this.E) {
            return false;
        }
        this.E = null;
        return super.w3(aVar, z11);
    }

    public e<T> w4(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("size cannot be null.");
        }
        this.J = c0Var;
        this.K = c0Var;
        return this;
    }

    @Override // x2.d
    public com.badlogic.gdx.scenes.scene2d.a x3(int i11, boolean z11) {
        com.badlogic.gdx.scenes.scene2d.a x32 = super.x3(i11, z11);
        if (x32 == this.E) {
            this.E = null;
        }
        return x32;
    }

    public e<T> x4(c0 c0Var, c0 c0Var2) {
        if (c0Var == null) {
            throw new IllegalArgumentException("width cannot be null.");
        }
        if (c0Var2 == null) {
            throw new IllegalArgumentException("height cannot be null.");
        }
        this.J = c0Var;
        this.K = c0Var2;
        return this;
    }

    public e<T> y4(float f11) {
        this.J = c0.k.g(f11);
        return this;
    }

    public e<T> z4(c0 c0Var) {
        if (c0Var == null) {
            throw new IllegalArgumentException("maxWidth cannot be null.");
        }
        this.J = c0Var;
        return this;
    }

    public e(@a3.d0 T t11) {
        this();
        d5(t11);
    }
}
