package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class s extends f0 {
    public b E;

    @a3.d0
    public com.badlogic.gdx.scenes.scene2d.a F;

    @a3.d0
    public com.badlogic.gdx.scenes.scene2d.a G;
    public boolean H;
    public float I;
    public float J;
    public float K;
    public final Rectangle L;
    public final Rectangle M;
    public final Rectangle N;
    public boolean O;
    public final Rectangle P;
    public Vector2 Q;
    public Vector2 R;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends com.badlogic.gdx.scenes.scene2d.b {

        /* renamed from: b, reason: collision with root package name */
        public int f13064b = -1;

        public a() {
        }

        @Override // com.badlogic.gdx.scenes.scene2d.b
        public boolean g(InputEvent inputEvent, float f11, float f12) {
            s sVar = s.this;
            sVar.O = sVar.N.contains(f11, f12);
            return false;
        }

        @Override // com.badlogic.gdx.scenes.scene2d.b
        public boolean i(InputEvent inputEvent, float f11, float f12, int i11, int i12) {
            if (this.f13064b != -1) {
                return false;
            }
            if ((i11 == 0 && i12 != 0) || !s.this.N.contains(f11, f12)) {
                return false;
            }
            this.f13064b = i11;
            s.this.Q.set(f11, f12);
            s sVar = s.this;
            Vector2 vector2 = sVar.R;
            Rectangle rectangle = sVar.N;
            vector2.set(rectangle.f12533x, rectangle.f12534y);
            return true;
        }

        @Override // com.badlogic.gdx.scenes.scene2d.b
        public void j(InputEvent inputEvent, float f11, float f12, int i11) {
            if (i11 != this.f13064b) {
                return;
            }
            s sVar = s.this;
            z2.k kVar = sVar.E.f13066a;
            if (sVar.H) {
                float f13 = f12 - sVar.Q.f12536y;
                float v12 = sVar.v1() - kVar.o();
                Vector2 vector2 = s.this.R;
                float f14 = vector2.f12536y + f13;
                vector2.f12536y = f14;
                float min = Math.min(v12, Math.max(0.0f, f14));
                s sVar2 = s.this;
                sVar2.I = 1.0f - (min / v12);
                sVar2.Q.set(f11, f12);
            } else {
                float f15 = f11 - sVar.Q.f12535x;
                float J1 = sVar.J1() - kVar.b();
                Vector2 vector22 = s.this.R;
                float f16 = vector22.f12535x + f15;
                vector22.f12535x = f16;
                float min2 = Math.min(J1, Math.max(0.0f, f16));
                s sVar3 = s.this;
                sVar3.I = min2 / J1;
                sVar3.Q.set(f11, f12);
            }
            s.this.invalidate();
        }

        @Override // com.badlogic.gdx.scenes.scene2d.b
        public void k(InputEvent inputEvent, float f11, float f12, int i11, int i12) {
            if (i11 == this.f13064b) {
                this.f13064b = -1;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public z2.k f13066a;

        public b() {
        }

        public b(z2.k kVar) {
            this.f13066a = kVar;
        }

        public b(b bVar) {
            this.f13066a = bVar.f13066a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s(@a3.d0 com.badlogic.gdx.scenes.scene2d.a r9, @a3.d0 com.badlogic.gdx.scenes.scene2d.a r10, boolean r11, com.badlogic.gdx.scenes.scene2d.ui.q r12) {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "default-"
            r0.append(r1)
            if (r11 == 0) goto Lf
            java.lang.String r1 = "vertical"
            goto L11
        Lf:
            java.lang.String r1 = "horizontal"
        L11:
            r0.append(r1)
            java.lang.String r7 = r0.toString()
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.scenes.scene2d.ui.s.<init>(com.badlogic.gdx.scenes.scene2d.a, com.badlogic.gdx.scenes.scene2d.a, boolean, com.badlogic.gdx.scenes.scene2d.ui.q):void");
    }

    private void O3() {
        d1(new a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public void D() {
        J3();
        if (this.H) {
            I3();
        } else {
            H3();
        }
        com.badlogic.gdx.scenes.scene2d.a aVar = this.F;
        if (aVar != 0) {
            Rectangle rectangle = this.L;
            aVar.t2(rectangle.f12533x, rectangle.f12534y, rectangle.width, rectangle.height);
            if (aVar instanceof z2.l) {
                ((z2.l) aVar).Q0();
            }
        }
        com.badlogic.gdx.scenes.scene2d.a aVar2 = this.G;
        if (aVar2 != 0) {
            Rectangle rectangle2 = this.M;
            aVar2.t2(rectangle2.f12533x, rectangle2.f12534y, rectangle2.width, rectangle2.height);
            if (aVar2 instanceof z2.l) {
                ((z2.l) aVar2).Q0();
            }
        }
    }

    public final void H3() {
        z2.k kVar = this.E.f13066a;
        float v12 = v1();
        float J1 = J1() - kVar.b();
        float f11 = (int) (this.I * J1);
        float b11 = kVar.b();
        this.L.set(0.0f, 0.0f, f11, v12);
        this.M.set(f11 + b11, 0.0f, J1 - f11, v12);
        this.N.set(f11, 0.0f, b11, v12);
    }

    public final void I3() {
        z2.k kVar = this.E.f13066a;
        float J1 = J1();
        float v12 = v1();
        float o11 = v12 - kVar.o();
        float f11 = (int) (this.I * o11);
        float f12 = o11 - f11;
        float o12 = kVar.o();
        this.L.set(0.0f, v12 - f11, J1, f11);
        this.M.set(0.0f, 0.0f, J1, f12);
        this.N.set(0.0f, f12, J1, o12);
    }

    public void J3() {
        float f11 = this.J;
        float f12 = this.K;
        if (this.H) {
            float v12 = v1() - this.E.f13066a.o();
            Object obj = this.F;
            if (obj instanceof z2.l) {
                f11 = Math.max(f11, Math.min(((z2.l) obj).o() / v12, 1.0f));
            }
            Object obj2 = this.G;
            if (obj2 instanceof z2.l) {
                f12 = Math.min(f12, 1.0f - Math.min(((z2.l) obj2).o() / v12, 1.0f));
            }
        } else {
            float J1 = J1() - this.E.f13066a.b();
            Object obj3 = this.F;
            if (obj3 instanceof z2.l) {
                f11 = Math.max(f11, Math.min(((z2.l) obj3).b() / J1, 1.0f));
            }
            Object obj4 = this.G;
            if (obj4 instanceof z2.l) {
                f12 = Math.min(f12, 1.0f - Math.min(((z2.l) obj4).b() / J1, 1.0f));
            }
        }
        if (f11 > f12) {
            this.I = (f11 + f12) * 0.5f;
        } else {
            this.I = Math.max(Math.min(this.I, f12), f11);
        }
    }

    public float K3() {
        return this.K;
    }

    public float L3() {
        return this.J;
    }

    public float M3() {
        return this.I;
    }

    public b N3() {
        return this.E;
    }

    public boolean P3() {
        return this.O;
    }

    public boolean Q3() {
        return this.H;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public float R() {
        com.badlogic.gdx.scenes.scene2d.a aVar = this.F;
        float R = aVar == 0 ? 0.0f : aVar instanceof z2.l ? ((z2.l) aVar).R() : aVar.v1();
        com.badlogic.gdx.scenes.scene2d.a aVar2 = this.G;
        float R2 = aVar2 != 0 ? aVar2 instanceof z2.l ? ((z2.l) aVar2).R() : aVar2.v1() : 0.0f;
        return !this.H ? Math.max(R, R2) : R + this.E.f13066a.o() + R2;
    }

    public void R3(@a3.d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
        com.badlogic.gdx.scenes.scene2d.a aVar2 = this.F;
        if (aVar2 != null) {
            super.v3(aVar2);
        }
        this.F = aVar;
        if (aVar != null) {
            super.a3(aVar);
        }
        invalidate();
    }

    public void S3(float f11) {
        if (f11 < 0.0f || f11 > 1.0f) {
            throw new GdxRuntimeException("maxAmount has to be >= 0 and <= 1");
        }
        this.K = f11;
    }

    public void T3(float f11) {
        if (f11 < 0.0f || f11 > 1.0f) {
            throw new GdxRuntimeException("minAmount has to be >= 0 and <= 1");
        }
        this.J = f11;
    }

    public void U3(@a3.d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
        com.badlogic.gdx.scenes.scene2d.a aVar2 = this.G;
        if (aVar2 != null) {
            super.v3(aVar2);
        }
        this.G = aVar;
        if (aVar != null) {
            super.a3(aVar);
        }
        invalidate();
    }

    public void V3(float f11) {
        this.I = f11;
        invalidate();
    }

    public void W3(b bVar) {
        this.E = bVar;
        C0();
    }

    public void X3(boolean z11) {
        if (this.H == z11) {
            return;
        }
        this.H = z11;
        C0();
    }

    @Override // x2.d
    public void a3(com.badlogic.gdx.scenes.scene2d.a aVar) {
        throw new UnsupportedOperationException("Use SplitPane#setWidget.");
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public float b() {
        Object obj = this.F;
        float b11 = obj instanceof z2.l ? ((z2.l) obj).b() : 0.0f;
        Object obj2 = this.G;
        float b12 = obj2 instanceof z2.l ? ((z2.l) obj2).b() : 0.0f;
        return this.H ? Math.max(b11, b12) : b11 + this.E.f13066a.b() + b12;
    }

    @Override // x2.d
    public void c3(int i11, com.badlogic.gdx.scenes.scene2d.a aVar) {
        throw new UnsupportedOperationException("Use SplitPane#setWidget.");
    }

    @Override // x2.d
    public void d3(com.badlogic.gdx.scenes.scene2d.a aVar, com.badlogic.gdx.scenes.scene2d.a aVar2) {
        throw new UnsupportedOperationException("Use SplitPane#setWidget.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public float n0() {
        com.badlogic.gdx.scenes.scene2d.a aVar = this.F;
        float n02 = aVar == 0 ? 0.0f : aVar instanceof z2.l ? ((z2.l) aVar).n0() : aVar.J1();
        com.badlogic.gdx.scenes.scene2d.a aVar2 = this.G;
        float n03 = aVar2 != 0 ? aVar2 instanceof z2.l ? ((z2.l) aVar2).n0() : aVar2.J1() : 0.0f;
        return this.H ? Math.max(n02, n03) : n02 + this.E.f13066a.b() + n03;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, x2.d, com.badlogic.gdx.scenes.scene2d.a
    public void n1(w1.a aVar, float f11) {
        com.badlogic.gdx.scenes.scene2d.c F1 = F1();
        if (F1 == null) {
            return;
        }
        Q0();
        com.badlogic.gdx.graphics.b e11 = e();
        float f12 = e11.f11547d * f11;
        f3(aVar, k3());
        com.badlogic.gdx.scenes.scene2d.a aVar2 = this.F;
        if (aVar2 != null && aVar2.Z1()) {
            aVar.flush();
            F1.c1(this.L, this.P);
            if (z2.n.g(this.P)) {
                this.F.n1(aVar, f12);
                aVar.flush();
                z2.n.f();
            }
        }
        com.badlogic.gdx.scenes.scene2d.a aVar3 = this.G;
        if (aVar3 != null && aVar3.Z1()) {
            aVar.flush();
            F1.c1(this.M, this.P);
            if (z2.n.g(this.P)) {
                this.G.n1(aVar, f12);
                aVar.flush();
                z2.n.f();
            }
        }
        aVar.k(e11.f11544a, e11.f11545b, e11.f11546c, f12);
        z2.k kVar = this.E.f13066a;
        Rectangle rectangle = this.N;
        kVar.y(aVar, rectangle.f12533x, rectangle.f12534y, rectangle.width, rectangle.height);
        z3(aVar);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public float o() {
        Object obj = this.F;
        float o11 = obj instanceof z2.l ? ((z2.l) obj).o() : 0.0f;
        Object obj2 = this.G;
        float o12 = obj2 instanceof z2.l ? ((z2.l) obj2).o() : 0.0f;
        return !this.H ? Math.max(o11, o12) : o11 + this.E.f13066a.o() + o12;
    }

    @Override // x2.d
    public boolean v3(com.badlogic.gdx.scenes.scene2d.a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("actor cannot be null.");
        }
        if (aVar == this.F) {
            R3(null);
            return true;
        }
        if (aVar == this.G) {
            U3(null);
        }
        return true;
    }

    @Override // x2.d
    public boolean w3(com.badlogic.gdx.scenes.scene2d.a aVar, boolean z11) {
        if (aVar == null) {
            throw new IllegalArgumentException("actor cannot be null.");
        }
        if (aVar == this.F) {
            super.w3(aVar, z11);
            this.F = null;
            invalidate();
            return true;
        }
        if (aVar != this.G) {
            return false;
        }
        super.w3(aVar, z11);
        this.G = null;
        invalidate();
        return true;
    }

    @Override // x2.d
    public com.badlogic.gdx.scenes.scene2d.a x3(int i11, boolean z11) {
        com.badlogic.gdx.scenes.scene2d.a x32 = super.x3(i11, z11);
        if (x32 == this.F) {
            super.w3(x32, z11);
            this.F = null;
            invalidate();
            return x32;
        }
        if (x32 == this.G) {
            super.w3(x32, z11);
            this.G = null;
            invalidate();
        }
        return x32;
    }

    public s(@a3.d0 com.badlogic.gdx.scenes.scene2d.a aVar, @a3.d0 com.badlogic.gdx.scenes.scene2d.a aVar2, boolean z11, q qVar, String str) {
        this(aVar, aVar2, z11, (b) qVar.X(str, b.class));
    }

    public s(@a3.d0 com.badlogic.gdx.scenes.scene2d.a aVar, @a3.d0 com.badlogic.gdx.scenes.scene2d.a aVar2, boolean z11, b bVar) {
        this.I = 0.5f;
        this.K = 1.0f;
        this.L = new Rectangle();
        this.M = new Rectangle();
        this.N = new Rectangle();
        this.P = new Rectangle();
        this.Q = new Vector2();
        this.R = new Vector2();
        this.H = z11;
        W3(bVar);
        R3(aVar);
        U3(aVar2);
        J2(n0(), R());
        O3();
    }
}
