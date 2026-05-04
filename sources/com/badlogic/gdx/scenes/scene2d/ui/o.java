package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Touchable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class o extends f0 {
    public boolean A1;
    public boolean B1;
    public boolean C1;
    public boolean D1;
    public d E;
    public int E1;
    public com.badlogic.gdx.scenes.scene2d.a F;
    public final Rectangle G;
    public final Rectangle H;
    public final Rectangle I;
    public final Rectangle J;
    public final Rectangle K;
    public final Rectangle L;
    public z2.a M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public float V;
    public float W;
    public boolean X;
    public boolean Y;
    public final Vector2 Z;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f12987f0;

    /* renamed from: f1, reason: collision with root package name */
    public boolean f12988f1;

    /* renamed from: h1, reason: collision with root package name */
    public boolean f12989h1;

    /* renamed from: i1, reason: collision with root package name */
    public float f12990i1;

    /* renamed from: j1, reason: collision with root package name */
    public float f12991j1;

    /* renamed from: k1, reason: collision with root package name */
    public float f12992k1;

    /* renamed from: l1, reason: collision with root package name */
    public float f12993l1;

    /* renamed from: m1, reason: collision with root package name */
    public boolean f12994m1;

    /* renamed from: n1, reason: collision with root package name */
    public boolean f12995n1;

    /* renamed from: o1, reason: collision with root package name */
    public float f12996o1;

    /* renamed from: p1, reason: collision with root package name */
    public float f12997p1;

    /* renamed from: q1, reason: collision with root package name */
    public float f12998q1;

    /* renamed from: r1, reason: collision with root package name */
    public float f12999r1;

    /* renamed from: s1, reason: collision with root package name */
    public boolean f13000s1;

    /* renamed from: t1, reason: collision with root package name */
    public boolean f13001t1;

    /* renamed from: u1, reason: collision with root package name */
    public float f13002u1;

    /* renamed from: v1, reason: collision with root package name */
    public float f13003v1;

    /* renamed from: w1, reason: collision with root package name */
    public float f13004w1;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f13005x1;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f13006y1;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f13007z1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends com.badlogic.gdx.scenes.scene2d.b {

        /* renamed from: b, reason: collision with root package name */
        public float f13008b;

        public a() {
        }

        @Override // com.badlogic.gdx.scenes.scene2d.b
        public boolean g(InputEvent inputEvent, float f11, float f12) {
            o oVar = o.this;
            if (oVar.f12995n1) {
                return false;
            }
            oVar.U4(true);
            return false;
        }

        @Override // com.badlogic.gdx.scenes.scene2d.b
        public boolean i(InputEvent inputEvent, float f11, float f12, int i11, int i12) {
            o oVar = o.this;
            if (oVar.E1 != -1) {
                return false;
            }
            if (i11 == 0 && i12 != 0) {
                return false;
            }
            if (oVar.F1() != null) {
                o.this.F1().N1(o.this);
            }
            o oVar2 = o.this;
            if (!oVar2.f12995n1) {
                oVar2.U4(true);
            }
            o oVar3 = o.this;
            if (oVar3.f12990i1 == 0.0f) {
                return false;
            }
            if (oVar3.f12989h1 && oVar3.N && oVar3.H.contains(f11, f12)) {
                inputEvent.p();
                o.this.U4(true);
                if (!o.this.I.contains(f11, f12)) {
                    o oVar4 = o.this;
                    oVar4.R4(oVar4.R + (oVar4.G.width * (f11 >= oVar4.I.f12533x ? 1 : -1)));
                    return true;
                }
                o.this.Z.set(f11, f12);
                o oVar5 = o.this;
                this.f13008b = oVar5.I.f12533x;
                oVar5.X = true;
                oVar5.E1 = i11;
                return true;
            }
            o oVar6 = o.this;
            if (!oVar6.f12989h1 || !oVar6.O || !oVar6.J.contains(f11, f12)) {
                return false;
            }
            inputEvent.p();
            o.this.U4(true);
            if (!o.this.K.contains(f11, f12)) {
                o oVar7 = o.this;
                oVar7.S4(oVar7.S + (oVar7.G.height * (f12 < oVar7.K.f12534y ? 1 : -1)));
                return true;
            }
            o.this.Z.set(f11, f12);
            o oVar8 = o.this;
            this.f13008b = oVar8.K.f12534y;
            oVar8.Y = true;
            oVar8.E1 = i11;
            return true;
        }

        @Override // com.badlogic.gdx.scenes.scene2d.b
        public void j(InputEvent inputEvent, float f11, float f12, int i11) {
            o oVar = o.this;
            if (i11 != oVar.E1) {
                return;
            }
            if (oVar.X) {
                float f13 = this.f13008b + (f11 - oVar.Z.f12535x);
                this.f13008b = f13;
                float max = Math.max(oVar.H.f12533x, f13);
                o oVar2 = o.this;
                Rectangle rectangle = oVar2.H;
                float min = Math.min((rectangle.f12533x + rectangle.width) - oVar2.I.width, max);
                o oVar3 = o.this;
                Rectangle rectangle2 = oVar3.H;
                float f14 = rectangle2.width - oVar3.I.width;
                if (f14 != 0.0f) {
                    oVar3.P4((min - rectangle2.f12533x) / f14);
                }
                o.this.Z.set(f11, f12);
                return;
            }
            if (oVar.Y) {
                float f15 = this.f13008b + (f12 - oVar.Z.f12536y);
                this.f13008b = f15;
                float max2 = Math.max(oVar.J.f12534y, f15);
                o oVar4 = o.this;
                Rectangle rectangle3 = oVar4.J;
                float min2 = Math.min((rectangle3.f12534y + rectangle3.height) - oVar4.K.height, max2);
                o oVar5 = o.this;
                Rectangle rectangle4 = oVar5.J;
                float f16 = rectangle4.height - oVar5.K.height;
                if (f16 != 0.0f) {
                    oVar5.Q4(1.0f - ((min2 - rectangle4.f12534y) / f16));
                }
                o.this.Z.set(f11, f12);
            }
        }

        @Override // com.badlogic.gdx.scenes.scene2d.b
        public void k(InputEvent inputEvent, float f11, float f12, int i11, int i12) {
            o oVar = o.this;
            if (i11 != oVar.E1) {
                return;
            }
            oVar.J3();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends z2.a {
        public b() {
        }

        @Override // z2.a, x2.c
        public boolean a(x2.b bVar) {
            if (super.a(bVar)) {
                if (((InputEvent) bVar).A() != InputEvent.Type.touchDown) {
                    return true;
                }
                o.this.f12997p1 = 0.0f;
                return true;
            }
            if (!(bVar instanceof InputEvent) || !((InputEvent) bVar).B()) {
                return false;
            }
            o.this.J3();
            return false;
        }

        @Override // z2.a
        public void b(InputEvent inputEvent, float f11, float f12, int i11) {
            if (Math.abs(f11) <= 150.0f || !o.this.N) {
                f11 = 0.0f;
            }
            float f13 = (Math.abs(f12) <= 150.0f || !o.this.O) ? 0.0f : -f12;
            if (f11 == 0.0f && f13 == 0.0f) {
                return;
            }
            o oVar = o.this;
            if (oVar.f12994m1) {
                oVar.K3();
            }
            o oVar2 = o.this;
            oVar2.N3(oVar2.f12996o1, f11, f13);
        }

        @Override // z2.a
        public void f(InputEvent inputEvent, float f11, float f12, float f13, float f14) {
            o.this.U4(true);
            o oVar = o.this;
            if (!oVar.N) {
                f13 = 0.0f;
            }
            if (!oVar.O) {
                f14 = 0.0f;
            }
            oVar.R -= f13;
            oVar.S += f14;
            oVar.L3();
            o oVar2 = o.this;
            if (oVar2.f12994m1) {
                if (f13 == 0.0f && f14 == 0.0f) {
                    return;
                }
                oVar2.K3();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends com.badlogic.gdx.scenes.scene2d.b {
        public c() {
        }

        @Override // com.badlogic.gdx.scenes.scene2d.b
        public boolean h(InputEvent inputEvent, float f11, float f12, float f13, float f14) {
            inputEvent.a();
            o.this.U4(true);
            o oVar = o.this;
            boolean z11 = oVar.O;
            if (!z11 && !oVar.N) {
                return false;
            }
            if (z11) {
                if (!oVar.N && f14 == 0.0f) {
                    f14 = f13;
                }
                f14 = f13;
                f13 = f14;
            } else {
                if (oVar.N && f13 == 0.0f) {
                    f13 = f14;
                }
                f14 = f13;
                f13 = f14;
            }
            oVar.S4(oVar.S + (oVar.U3() * f13));
            o oVar2 = o.this;
            oVar2.R4(oVar2.R + (oVar2.T3() * f14));
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        @a3.d0
        public z2.k f13012a;

        /* renamed from: b, reason: collision with root package name */
        @a3.d0
        public z2.k f13013b;

        /* renamed from: c, reason: collision with root package name */
        @a3.d0
        public z2.k f13014c;

        /* renamed from: d, reason: collision with root package name */
        @a3.d0
        public z2.k f13015d;

        /* renamed from: e, reason: collision with root package name */
        @a3.d0
        public z2.k f13016e;

        /* renamed from: f, reason: collision with root package name */
        @a3.d0
        public z2.k f13017f;

        public d() {
        }

        public d(@a3.d0 z2.k kVar, @a3.d0 z2.k kVar2, @a3.d0 z2.k kVar3, @a3.d0 z2.k kVar4, @a3.d0 z2.k kVar5) {
            this.f13012a = kVar;
            this.f13014c = kVar2;
            this.f13015d = kVar3;
            this.f13016e = kVar4;
            this.f13017f = kVar5;
        }

        public d(d dVar) {
            this.f13012a = dVar.f13012a;
            this.f13013b = dVar.f13013b;
            this.f13014c = dVar.f13014c;
            this.f13015d = dVar.f13015d;
            this.f13016e = dVar.f13016e;
            this.f13017f = dVar.f13017f;
        }
    }

    public o(@a3.d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
        this(aVar, new d());
    }

    public void A4(float f11, float f12, float f13, float f14) {
        B4(f11, f12, f13, f14, false, false);
    }

    public void B4(float f11, float f12, float f13, float f14, boolean z11, boolean z12) {
        Q0();
        C4(com.badlogic.gdx.math.n.o(z11 ? f11 + ((f13 - this.G.width) / 2.0f) : com.badlogic.gdx.math.n.o(this.R, f11, (f13 + f11) - this.G.width), 0.0f, this.V));
        float f15 = this.S;
        float f16 = this.W - f12;
        D4(com.badlogic.gdx.math.n.o(z12 ? f16 + ((this.G.height + f14) / 2.0f) : com.badlogic.gdx.math.n.o(f15, f14 + f16, f16 + this.G.height), 0.0f, this.W));
    }

    public void C4(float f11) {
        this.R = f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public void D() {
        float f11;
        float f12;
        float f13;
        float f14;
        float J1;
        float v12;
        z2.k kVar;
        d dVar = this.E;
        z2.k kVar2 = dVar.f13012a;
        z2.k kVar3 = dVar.f13015d;
        z2.k kVar4 = dVar.f13017f;
        if (kVar2 != null) {
            f12 = kVar2.z();
            f13 = kVar2.u();
            f14 = kVar2.w();
            f11 = kVar2.s();
        } else {
            f11 = 0.0f;
            f12 = 0.0f;
            f13 = 0.0f;
            f14 = 0.0f;
        }
        float J12 = J1();
        float v13 = v1() - f14;
        this.G.set(f12, f11, (J12 - f12) - f13, v13 - f11);
        if (this.F == null) {
            return;
        }
        float o11 = kVar3 != null ? kVar3.o() : 0.0f;
        z2.k kVar5 = this.E.f13014c;
        if (kVar5 != null) {
            o11 = Math.max(o11, kVar5.o());
        }
        float b11 = kVar4 != null ? kVar4.b() : 0.0f;
        z2.k kVar6 = this.E.f13016e;
        if (kVar6 != null) {
            b11 = Math.max(b11, kVar6.b());
        }
        com.badlogic.gdx.scenes.scene2d.a aVar = this.F;
        if (aVar instanceof z2.l) {
            z2.l lVar = (z2.l) aVar;
            J1 = lVar.n0();
            v12 = lVar.R();
        } else {
            J1 = aVar.J1();
            v12 = this.F.v1();
        }
        boolean z11 = this.f13005x1 || (J1 > this.G.width && !this.f13007z1);
        this.N = z11;
        boolean z12 = this.f13006y1 || (v12 > this.G.height && !this.A1);
        this.O = z12;
        if (this.C1) {
            kVar = kVar4;
        } else {
            if (z12) {
                Rectangle rectangle = this.G;
                float f15 = rectangle.width - b11;
                rectangle.width = f15;
                kVar = kVar4;
                if (!this.P) {
                    rectangle.f12533x += b11;
                }
                if (!z11 && J1 > f15 && !this.f13007z1) {
                    this.N = true;
                }
            } else {
                kVar = kVar4;
            }
            if (this.N) {
                Rectangle rectangle2 = this.G;
                float f16 = rectangle2.height - o11;
                rectangle2.height = f16;
                if (this.Q) {
                    rectangle2.f12534y += o11;
                }
                if (!z12 && v12 > f16 && !this.A1) {
                    this.O = true;
                    rectangle2.width -= b11;
                    if (!this.P) {
                        rectangle2.f12533x += b11;
                    }
                }
            }
        }
        float max = this.f13007z1 ? this.G.width : Math.max(this.G.width, J1);
        float max2 = this.A1 ? this.G.height : Math.max(this.G.height, v12);
        Rectangle rectangle3 = this.G;
        float f17 = max - rectangle3.width;
        this.V = f17;
        this.W = max2 - rectangle3.height;
        C4(com.badlogic.gdx.math.n.o(this.R, 0.0f, f17));
        D4(com.badlogic.gdx.math.n.o(this.S, 0.0f, this.W));
        if (this.N) {
            if (kVar3 != null) {
                this.H.set(this.C1 ? f12 : this.G.f12533x, this.Q ? f11 : v13 - o11, this.G.width, o11);
                if (this.O && this.C1) {
                    Rectangle rectangle4 = this.H;
                    rectangle4.width -= b11;
                    if (!this.P) {
                        rectangle4.f12533x += b11;
                    }
                }
                if (this.D1) {
                    this.I.width = Math.max(kVar3.b(), (int) ((this.H.width * this.G.width) / max));
                } else {
                    this.I.width = kVar3.b();
                }
                Rectangle rectangle5 = this.I;
                if (rectangle5.width > max) {
                    rectangle5.width = 0.0f;
                }
                rectangle5.height = kVar3.o();
                this.I.f12533x = this.H.f12533x + ((int) ((r9.width - r3.width) * Z3()));
                this.I.f12534y = this.H.f12534y;
            } else {
                this.H.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.I.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
        if (this.O) {
            if (kVar != null) {
                float f18 = this.P ? (J12 - f13) - b11 : f12;
                if (!this.C1) {
                    f11 = this.G.f12534y;
                }
                this.J.set(f18, f11, b11, this.G.height);
                if (this.N && this.C1) {
                    Rectangle rectangle6 = this.J;
                    rectangle6.height -= o11;
                    if (this.Q) {
                        rectangle6.f12534y += o11;
                    }
                }
                this.K.width = kVar.b();
                if (this.D1) {
                    this.K.height = Math.max(kVar.o(), (int) ((this.J.height * this.G.height) / max2));
                } else {
                    this.K.height = kVar.o();
                }
                Rectangle rectangle7 = this.K;
                if (rectangle7.height > max2) {
                    rectangle7.height = 0.0f;
                }
                if (this.P) {
                    f12 = (J12 - f13) - kVar.b();
                }
                rectangle7.f12533x = f12;
                this.K.f12534y = this.J.f12534y + ((int) ((r3.height - r2.height) * (1.0f - a4())));
            } else {
                this.J.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.K.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
        e5();
        com.badlogic.gdx.scenes.scene2d.a aVar2 = this.F;
        if (aVar2 instanceof z2.l) {
            aVar2.J2(max, max2);
            ((z2.l) this.F).Q0();
        }
    }

    public void D4(float f11) {
        this.S = f11;
    }

    public void E4(@a3.d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
        com.badlogic.gdx.scenes.scene2d.a aVar2 = this.F;
        if (aVar2 == this) {
            throw new IllegalArgumentException("actor cannot be the ScrollPane.");
        }
        if (aVar2 != null) {
            super.v3(aVar2);
        }
        this.F = aVar;
        if (aVar != null) {
            super.a3(aVar);
        }
    }

    public void F4(boolean z11) {
        this.f12994m1 = z11;
    }

    public void G4(boolean z11) {
        this.B1 = z11;
    }

    public void H3() {
        c1(new a());
    }

    public void H4(boolean z11) {
        if (this.f12987f0 == z11) {
            return;
        }
        this.f12987f0 = z11;
        if (!z11) {
            this.f12990i1 = this.f12991j1;
        }
        invalidate();
    }

    public void I3() {
        d1(new c());
    }

    public void I4(boolean z11) {
        if (this.f12995n1 == z11) {
            return;
        }
        this.f12995n1 = z11;
        if (z11) {
            d1(this.M);
        } else {
            m2(this.M);
        }
        invalidate();
    }

    public void J3() {
        this.E1 = -1;
        this.X = false;
        this.Y = false;
        this.M.c().n0();
    }

    public void J4(float f11) {
        this.M.c().f1(f11);
    }

    public void K3() {
        com.badlogic.gdx.scenes.scene2d.c F1 = F1();
        if (F1 != null) {
            F1.f1(this.M, this);
        }
    }

    public void K4(float f11) {
        this.f12996o1 = f11;
    }

    public void L3() {
        float o11;
        float o12;
        if (this.B1) {
            if (this.f13000s1) {
                float f11 = this.R;
                float f12 = this.f13002u1;
                o11 = com.badlogic.gdx.math.n.o(f11, -f12, this.V + f12);
            } else {
                o11 = com.badlogic.gdx.math.n.o(this.R, 0.0f, this.V);
            }
            C4(o11);
            if (this.f13001t1) {
                float f13 = this.S;
                float f14 = this.f13002u1;
                o12 = com.badlogic.gdx.math.n.o(f13, -f14, this.W + f14);
            } else {
                o12 = com.badlogic.gdx.math.n.o(this.S, 0.0f, this.W);
            }
            D4(o12);
        }
    }

    public void L4(boolean z11, boolean z12) {
        this.f13005x1 = z11;
        this.f13006y1 = z12;
    }

    public void M3(w1.a aVar, float f11, float f12, float f13, float f14) {
        z2.k kVar;
        if (f14 <= 0.0f) {
            return;
        }
        aVar.k(f11, f12, f13, f14);
        boolean z11 = false;
        boolean z12 = this.N && this.I.width > 0.0f;
        if (this.O && this.K.height > 0.0f) {
            z11 = true;
        }
        if (z12) {
            if (z11 && (kVar = this.E.f13013b) != null) {
                Rectangle rectangle = this.H;
                float f15 = rectangle.f12533x + rectangle.width;
                float f16 = rectangle.f12534y;
                Rectangle rectangle2 = this.J;
                kVar.y(aVar, f15, f16, rectangle2.width, rectangle2.f12534y);
            }
            z2.k kVar2 = this.E.f13014c;
            if (kVar2 != null) {
                Rectangle rectangle3 = this.H;
                kVar2.y(aVar, rectangle3.f12533x, rectangle3.f12534y, rectangle3.width, rectangle3.height);
            }
            z2.k kVar3 = this.E.f13015d;
            if (kVar3 != null) {
                Rectangle rectangle4 = this.I;
                kVar3.y(aVar, rectangle4.f12533x, rectangle4.f12534y, rectangle4.width, rectangle4.height);
            }
        }
        if (z11) {
            z2.k kVar4 = this.E.f13016e;
            if (kVar4 != null) {
                Rectangle rectangle5 = this.J;
                kVar4.y(aVar, rectangle5.f12533x, rectangle5.f12534y, rectangle5.width, rectangle5.height);
            }
            z2.k kVar5 = this.E.f13017f;
            if (kVar5 != null) {
                Rectangle rectangle6 = this.K;
                kVar5.y(aVar, rectangle6.f12533x, rectangle6.f12534y, rectangle6.width, rectangle6.height);
            }
        }
    }

    public void M4(boolean z11, boolean z12) {
        this.f13000s1 = z11;
        this.f13001t1 = z12;
    }

    public void N3(float f11, float f12, float f13) {
        this.f12997p1 = f11;
        this.f12998q1 = f12;
        this.f12999r1 = f13;
    }

    public void N4(boolean z11, boolean z12) {
        this.Q = z11;
        this.P = z12;
    }

    @a3.d0
    public com.badlogic.gdx.scenes.scene2d.a O3() {
        return this.F;
    }

    public void O4(boolean z11) {
        this.f12989h1 = z11;
    }

    public boolean P3() {
        return this.f12987f0;
    }

    public void P4(float f11) {
        C4(this.V * com.badlogic.gdx.math.n.o(f11, 0.0f, 1.0f));
    }

    public z2.a Q3() {
        return new b();
    }

    public void Q4(float f11) {
        D4(this.W * com.badlogic.gdx.math.n.o(f11, 0.0f, 1.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public float R() {
        com.badlogic.gdx.scenes.scene2d.a aVar = this.F;
        float R = aVar instanceof z2.l ? ((z2.l) aVar).R() : aVar != 0 ? aVar.v1() : 0.0f;
        z2.k kVar = this.E.f13012a;
        if (kVar != null) {
            R = Math.max(R + kVar.w() + kVar.s(), kVar.o());
        }
        if (!this.N) {
            return R;
        }
        z2.k kVar2 = this.E.f13015d;
        float o11 = kVar2 != null ? kVar2.o() : 0.0f;
        z2.k kVar3 = this.E.f13014c;
        if (kVar3 != null) {
            o11 = Math.max(o11, kVar3.o());
        }
        return R + o11;
    }

    public float R3() {
        return this.V;
    }

    public void R4(float f11) {
        C4(com.badlogic.gdx.math.n.o(f11, 0.0f, this.V));
    }

    public float S3() {
        return this.W;
    }

    public void S4(float f11) {
        D4(com.badlogic.gdx.math.n.o(f11, 0.0f, this.W));
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, x2.d, com.badlogic.gdx.scenes.scene2d.a
    @a3.d0
    public com.badlogic.gdx.scenes.scene2d.a T1(float f11, float f12, boolean z11) {
        if (f11 < 0.0f || f11 >= J1() || f12 < 0.0f || f12 >= v1()) {
            return null;
        }
        return (z11 && H1() == Touchable.enabled && Z1() && ((this.N && this.X && this.H.contains(f11, f12)) || (this.O && this.Y && this.J.contains(f11, f12)))) ? this : super.T1(f11, f12, z11);
    }

    public float T3() {
        float f11 = this.G.width;
        return Math.min(f11, Math.max(0.9f * f11, this.V * 0.1f) / 4.0f);
    }

    public void T4(boolean z11) {
        this.C1 = z11;
        invalidate();
    }

    public float U3() {
        float f11 = this.G.height;
        return Math.min(f11, Math.max(0.9f * f11, this.W * 0.1f) / 4.0f);
    }

    public void U4(boolean z11) {
        if (z11) {
            this.f12990i1 = this.f12991j1;
            this.f12992k1 = this.f12993l1;
        } else {
            this.f12990i1 = 0.0f;
            this.f12992k1 = 0.0f;
        }
    }

    public float V3() {
        return this.f13002u1;
    }

    public void V4(boolean z11, boolean z12) {
        if (z11 == this.f13007z1 && z12 == this.A1) {
            return;
        }
        this.f13007z1 = z11;
        this.A1 = z12;
        invalidate();
    }

    public float W3() {
        if (!this.N) {
            return 0.0f;
        }
        z2.k kVar = this.E.f13015d;
        float o11 = kVar != null ? kVar.o() : 0.0f;
        z2.k kVar2 = this.E.f13014c;
        return kVar2 != null ? Math.max(o11, kVar2.o()) : o11;
    }

    public void W4(boolean z11) {
        this.f12988f1 = z11;
    }

    public float X3() {
        if (!this.O) {
            return 0.0f;
        }
        z2.k kVar = this.E.f13017f;
        float b11 = kVar != null ? kVar.b() : 0.0f;
        z2.k kVar2 = this.E.f13016e;
        return kVar2 != null ? Math.max(b11, kVar2.b()) : b11;
    }

    public void X4(d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("style cannot be null.");
        }
        this.E = dVar;
        C0();
    }

    public float Y3() {
        return this.G.height;
    }

    public void Y4(boolean z11) {
        this.D1 = z11;
    }

    public float Z3() {
        float f11 = this.V;
        if (f11 == 0.0f) {
            return 0.0f;
        }
        return com.badlogic.gdx.math.n.o(this.R / f11, 0.0f, 1.0f);
    }

    public void Z4(float f11) {
        this.f12998q1 = f11;
    }

    @Override // x2.d, com.badlogic.gdx.scenes.scene2d.a
    public void a1(float f11) {
        boolean z11;
        com.badlogic.gdx.scenes.scene2d.c F1;
        super.a1(f11);
        boolean Q0 = this.M.c().Q0();
        float f12 = this.f12990i1;
        boolean z12 = true;
        if (f12 <= 0.0f || !this.f12987f0 || Q0 || this.X || this.Y) {
            z11 = false;
        } else {
            float f13 = this.f12992k1 - f11;
            this.f12992k1 = f13;
            if (f13 <= 0.0f) {
                this.f12990i1 = Math.max(0.0f, f12 - f11);
            }
            z11 = true;
        }
        if (this.f12997p1 > 0.0f) {
            U4(true);
            float f14 = this.f12997p1 / this.f12996o1;
            this.R -= (this.f12998q1 * f14) * f11;
            this.S -= (this.f12999r1 * f14) * f11;
            L3();
            float f15 = this.R;
            float f16 = this.f13002u1;
            if (f15 == (-f16)) {
                this.f12998q1 = 0.0f;
            }
            if (f15 >= this.V + f16) {
                this.f12998q1 = 0.0f;
            }
            float f17 = this.S;
            if (f17 == (-f16)) {
                this.f12999r1 = 0.0f;
            }
            if (f17 >= this.W + f16) {
                this.f12999r1 = 0.0f;
            }
            float f18 = this.f12997p1 - f11;
            this.f12997p1 = f18;
            if (f18 <= 0.0f) {
                this.f12998q1 = 0.0f;
                this.f12999r1 = 0.0f;
            }
            z11 = true;
        }
        if (!this.f12988f1 || this.f12997p1 > 0.0f || Q0 || ((this.X && (!this.N || this.V / (this.H.width - this.I.width) <= this.G.width * 0.1f)) || (this.Y && (!this.O || this.W / (this.J.height - this.K.height) <= this.G.height * 0.1f)))) {
            float f19 = this.T;
            float f21 = this.R;
            if (f19 != f21) {
                g5(f21);
            }
            float f22 = this.U;
            float f23 = this.S;
            if (f22 != f23) {
                h5(f23);
            }
        } else {
            float f24 = this.T;
            float f25 = this.R;
            if (f24 != f25) {
                if (f24 < f25) {
                    g5(Math.min(f25, f24 + Math.max(f11 * 200.0f, (f25 - f24) * 7.0f * f11)));
                } else {
                    g5(Math.max(f25, f24 - Math.max(f11 * 200.0f, ((f24 - f25) * 7.0f) * f11)));
                }
                z11 = true;
            }
            float f26 = this.U;
            float f27 = this.S;
            if (f26 != f27) {
                if (f26 < f27) {
                    h5(Math.min(f27, f26 + Math.max(200.0f * f11, (f27 - f26) * 7.0f * f11)));
                } else {
                    h5(Math.max(f27, f26 - Math.max(200.0f * f11, ((f26 - f27) * 7.0f) * f11)));
                }
                z11 = true;
            }
        }
        if (!Q0) {
            if (this.f13000s1 && this.N) {
                float f28 = this.R;
                if (f28 < 0.0f) {
                    U4(true);
                    float f29 = this.R;
                    float f31 = this.f13003v1;
                    float f32 = f29 + ((f31 + (((this.f13004w1 - f31) * (-f29)) / this.f13002u1)) * f11);
                    this.R = f32;
                    if (f32 > 0.0f) {
                        C4(0.0f);
                    }
                } else if (f28 > this.V) {
                    U4(true);
                    float f33 = this.R;
                    float f34 = this.f13003v1;
                    float f35 = this.f13004w1 - f34;
                    float f36 = this.V;
                    float f37 = f33 - ((f34 + ((f35 * (-(f36 - f33))) / this.f13002u1)) * f11);
                    this.R = f37;
                    if (f37 < f36) {
                        C4(f36);
                    }
                }
                z11 = true;
            }
            if (this.f13001t1 && this.O) {
                float f38 = this.S;
                if (f38 < 0.0f) {
                    U4(true);
                    float f39 = this.S;
                    float f41 = this.f13003v1;
                    float f42 = f39 + ((f41 + (((this.f13004w1 - f41) * (-f39)) / this.f13002u1)) * f11);
                    this.S = f42;
                    if (f42 > 0.0f) {
                        D4(0.0f);
                    }
                } else if (f38 > this.W) {
                    U4(true);
                    float f43 = this.S;
                    float f44 = this.f13003v1;
                    float f45 = this.f13004w1 - f44;
                    float f46 = this.W;
                    float f47 = f43 - ((f44 + ((f45 * (-(f46 - f43))) / this.f13002u1)) * f11);
                    this.S = f47;
                    if (f47 < f46) {
                        D4(f46);
                    }
                }
                if (z12 || (F1 = F1()) == null || !F1.m1()) {
                    return;
                }
                q1.g.f81379b.w();
                return;
            }
        }
        z12 = z11;
        if (z12) {
        }
    }

    @Override // x2.d
    @Deprecated
    public void a3(com.badlogic.gdx.scenes.scene2d.a aVar) {
        throw new UnsupportedOperationException("Use ScrollPane#setActor.");
    }

    public float a4() {
        float f11 = this.W;
        if (f11 == 0.0f) {
            return 0.0f;
        }
        return com.badlogic.gdx.math.n.o(this.S / f11, 0.0f, 1.0f);
    }

    public void a5(float f11) {
        this.f12999r1 = f11;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public float b() {
        return 0.0f;
    }

    @Override // x2.d
    @Deprecated
    public void b3(com.badlogic.gdx.scenes.scene2d.a aVar, com.badlogic.gdx.scenes.scene2d.a aVar2) {
        throw new UnsupportedOperationException("Use ScrollPane#setActor.");
    }

    public float b4() {
        return this.G.width;
    }

    @Deprecated
    public void b5(@a3.d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
        E4(aVar);
    }

    @Override // x2.d
    @Deprecated
    public void c3(int i11, com.badlogic.gdx.scenes.scene2d.a aVar) {
        throw new UnsupportedOperationException("Use ScrollPane#setActor.");
    }

    public float c4() {
        return this.R;
    }

    public void c5(float f11, float f12) {
        this.f12991j1 = f11;
        this.f12993l1 = f12;
    }

    @Override // x2.d
    @Deprecated
    public void d3(com.badlogic.gdx.scenes.scene2d.a aVar, com.badlogic.gdx.scenes.scene2d.a aVar2) {
        throw new UnsupportedOperationException("Use ScrollPane#setActor.");
    }

    public float d4() {
        return this.S;
    }

    public void d5(float f11, float f12, float f13) {
        this.f13002u1 = f11;
        this.f13003v1 = f12;
        this.f13004w1 = f13;
    }

    public d e4() {
        return this.E;
    }

    public final void e5() {
        Rectangle rectangle = this.G;
        float f11 = rectangle.f12533x - (this.N ? (int) this.T : 0);
        float f12 = rectangle.f12534y - ((int) (this.O ? this.W - this.U : this.W));
        this.F.C2(f11, f12);
        Object obj = this.F;
        if (obj instanceof z2.f) {
            Rectangle rectangle2 = this.L;
            Rectangle rectangle3 = this.G;
            rectangle2.f12533x = rectangle3.f12533x - f11;
            rectangle2.f12534y = rectangle3.f12534y - f12;
            rectangle2.width = rectangle3.width;
            rectangle2.height = rectangle3.height;
            ((z2.f) obj).i0(rectangle2);
        }
    }

    public boolean f4() {
        return this.D1;
    }

    public void f5() {
        this.T = this.R;
        this.U = this.S;
    }

    public float g4() {
        return this.f12998q1;
    }

    public void g5(float f11) {
        this.T = f11;
    }

    public float h4() {
        return this.f12999r1;
    }

    public void h5(float f11) {
        this.U = f11;
    }

    public float i4() {
        float f11 = this.V;
        if (f11 == 0.0f) {
            return 0.0f;
        }
        return com.badlogic.gdx.math.n.o(this.T / f11, 0.0f, 1.0f);
    }

    public float j4() {
        float f11 = this.W;
        if (f11 == 0.0f) {
            return 0.0f;
        }
        return com.badlogic.gdx.math.n.o(this.U / f11, 0.0f, 1.0f);
    }

    public float k4() {
        if (this.N) {
            return this.T;
        }
        return 0.0f;
    }

    public float l4() {
        if (this.O) {
            return this.U;
        }
        return 0.0f;
    }

    @a3.d0
    @Deprecated
    public com.badlogic.gdx.scenes.scene2d.a m4() {
        return this.F;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public float n0() {
        com.badlogic.gdx.scenes.scene2d.a aVar = this.F;
        float n02 = aVar instanceof z2.l ? ((z2.l) aVar).n0() : aVar != 0 ? aVar.J1() : 0.0f;
        z2.k kVar = this.E.f13012a;
        if (kVar != null) {
            n02 = Math.max(n02 + kVar.z() + kVar.u(), kVar.b());
        }
        if (!this.O) {
            return n02;
        }
        z2.k kVar2 = this.E.f13017f;
        float b11 = kVar2 != null ? kVar2.b() : 0.0f;
        z2.k kVar3 = this.E.f13016e;
        if (kVar3 != null) {
            b11 = Math.max(b11, kVar3.b());
        }
        return n02 + b11;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, x2.d, com.badlogic.gdx.scenes.scene2d.a
    public void n1(w1.a aVar, float f11) {
        if (this.F == null) {
            return;
        }
        Q0();
        f3(aVar, k3());
        if (this.N) {
            this.I.f12533x = this.H.f12533x + ((int) ((r3.width - r2.width) * i4()));
        }
        if (this.O) {
            this.K.f12534y = this.J.f12534y + ((int) ((r3.height - r2.height) * (1.0f - j4())));
        }
        e5();
        com.badlogic.gdx.graphics.b e11 = e();
        float f12 = e11.f11547d * f11;
        if (this.E.f13012a != null) {
            aVar.k(e11.f11544a, e11.f11545b, e11.f11546c, f12);
            this.E.f13012a.y(aVar, 0.0f, 0.0f, J1(), v1());
        }
        aVar.flush();
        Rectangle rectangle = this.G;
        if (k1(rectangle.f12533x, rectangle.f12534y, rectangle.width, rectangle.height)) {
            m3(aVar, f11);
            aVar.flush();
            l1();
        }
        aVar.k(e11.f11544a, e11.f11545b, e11.f11546c, f12);
        if (this.f12987f0) {
            f12 *= com.badlogic.gdx.math.l.f12619e.a(this.f12990i1 / this.f12991j1);
        }
        M3(aVar, e11.f11544a, e11.f11545b, e11.f11546c, f12);
        z3(aVar);
    }

    public boolean n4() {
        return !this.O || this.S >= this.W;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public float o() {
        return 0.0f;
    }

    @Override // x2.d, com.badlogic.gdx.scenes.scene2d.a
    public void o1(ShapeRenderer shapeRenderer) {
        p1(shapeRenderer);
        e3(shapeRenderer, k3());
        Rectangle rectangle = this.G;
        if (k1(rectangle.f12533x, rectangle.f12534y, rectangle.width, rectangle.height)) {
            n3(shapeRenderer);
            shapeRenderer.flush();
            l1();
        }
        y3(shapeRenderer);
    }

    public boolean o4() {
        return this.E1 != -1;
    }

    public boolean p4() {
        return this.f12997p1 > 0.0f;
    }

    public boolean q4() {
        return this.f13005x1;
    }

    public boolean r4() {
        return this.f13006y1;
    }

    public boolean s4() {
        return !this.N || this.R <= 0.0f;
    }

    public boolean t4() {
        return this.M.c().Q0();
    }

    public boolean u4() {
        return !this.N || this.R >= this.V;
    }

    @Override // x2.d
    public boolean v3(com.badlogic.gdx.scenes.scene2d.a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("actor cannot be null.");
        }
        if (aVar != this.F) {
            return false;
        }
        E4(null);
        return true;
    }

    public boolean v4() {
        return this.N;
    }

    @Override // x2.d
    public boolean w3(com.badlogic.gdx.scenes.scene2d.a aVar, boolean z11) {
        if (aVar == null) {
            throw new IllegalArgumentException("actor cannot be null.");
        }
        if (aVar != this.F) {
            return false;
        }
        this.F = null;
        return super.w3(aVar, z11);
    }

    public boolean w4() {
        return this.O;
    }

    @Override // x2.d
    public com.badlogic.gdx.scenes.scene2d.a x3(int i11, boolean z11) {
        com.badlogic.gdx.scenes.scene2d.a x32 = super.x3(i11, z11);
        if (x32 == this.F) {
            this.F = null;
        }
        return x32;
    }

    public boolean x4() {
        return this.f13007z1;
    }

    public boolean y4() {
        return this.A1;
    }

    public boolean z4() {
        return !this.O || this.S <= 0.0f;
    }

    public o(@a3.d0 com.badlogic.gdx.scenes.scene2d.a aVar, q qVar) {
        this(aVar, (d) qVar.R(d.class));
    }

    public o(@a3.d0 com.badlogic.gdx.scenes.scene2d.a aVar, q qVar, String str) {
        this(aVar, (d) qVar.X(str, d.class));
    }

    public o(@a3.d0 com.badlogic.gdx.scenes.scene2d.a aVar, d dVar) {
        this.G = new Rectangle();
        this.H = new Rectangle();
        this.I = new Rectangle();
        this.J = new Rectangle();
        this.K = new Rectangle();
        this.L = new Rectangle();
        this.P = true;
        this.Q = true;
        this.Z = new Vector2();
        this.f12987f0 = true;
        this.f12988f1 = true;
        this.f12989h1 = true;
        this.f12991j1 = 1.0f;
        this.f12993l1 = 1.0f;
        this.f12994m1 = true;
        this.f12995n1 = true;
        this.f12996o1 = 1.0f;
        this.f13000s1 = true;
        this.f13001t1 = true;
        this.f13002u1 = 50.0f;
        this.f13003v1 = 30.0f;
        this.f13004w1 = 200.0f;
        this.B1 = true;
        this.D1 = true;
        this.E1 = -1;
        if (dVar != null) {
            this.E = dVar;
            E4(aVar);
            J2(150.0f, 150.0f);
            H3();
            z2.a Q3 = Q3();
            this.M = Q3;
            d1(Q3);
            I3();
            return;
        }
        throw new IllegalArgumentException("style cannot be null.");
    }
}
