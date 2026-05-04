package com.badlogic.gdx.scenes.scene2d.ui;

import a3.l0;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import z2.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a0 extends e0 {
    public float A;
    public final Circle B;
    public final Circle C;
    public final Circle D;
    public final Vector2 E;
    public final Vector2 F;

    /* renamed from: x, reason: collision with root package name */
    public b f12845x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f12846y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f12847z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends com.badlogic.gdx.scenes.scene2d.b {
        public a() {
        }

        @Override // com.badlogic.gdx.scenes.scene2d.b
        public boolean i(InputEvent inputEvent, float f11, float f12, int i11, int i12) {
            a0 a0Var = a0.this;
            if (a0Var.f12846y) {
                return false;
            }
            a0Var.f12846y = true;
            a0Var.b3(f11, f12, false);
            return true;
        }

        @Override // com.badlogic.gdx.scenes.scene2d.b
        public void j(InputEvent inputEvent, float f11, float f12, int i11) {
            a0.this.b3(f11, f12, false);
        }

        @Override // com.badlogic.gdx.scenes.scene2d.b
        public void k(InputEvent inputEvent, float f11, float f12, int i11, int i12) {
            a0 a0Var = a0.this;
            a0Var.f12846y = false;
            a0Var.b3(f11, f12, a0Var.f12847z);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        @a3.d0
        public z2.k f12849a;

        /* renamed from: b, reason: collision with root package name */
        @a3.d0
        public z2.k f12850b;

        public b() {
        }

        public b(@a3.d0 z2.k kVar, @a3.d0 z2.k kVar2) {
            this.f12849a = kVar;
            this.f12850b = kVar2;
        }

        public b(b bVar) {
            this.f12849a = bVar.f12849a;
            this.f12850b = bVar.f12850b;
        }
    }

    public a0(float f11, q qVar) {
        this(f11, (b) qVar.R(b.class));
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.e0, z2.l
    public void D() {
        float J1 = J1() / 2.0f;
        float v12 = v1() / 2.0f;
        float min = Math.min(J1, v12);
        this.C.set(J1, v12, min);
        z2.k kVar = this.f12845x.f12850b;
        if (kVar != null) {
            min -= Math.max(kVar.b(), this.f12845x.f12850b.o()) / 2.0f;
        }
        this.B.set(J1, v12, min);
        this.D.set(J1, v12, this.A);
        this.E.set(J1, v12);
        this.F.set(0.0f, 0.0f);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.e0, z2.l
    public float R() {
        z2.k kVar = this.f12845x.f12849a;
        if (kVar != null) {
            return kVar.o();
        }
        return 0.0f;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.a
    public com.badlogic.gdx.scenes.scene2d.a T1(float f11, float f12, boolean z11) {
        if ((!z11 || H1() == Touchable.enabled) && Z1() && this.C.contains(f11, f12)) {
            return this;
        }
        return null;
    }

    public void b3(float f11, float f12, boolean z11) {
        Vector2 vector2 = this.E;
        float f13 = vector2.f12535x;
        float f14 = vector2.f12536y;
        Vector2 vector22 = this.F;
        float f15 = vector22.f12535x;
        float f16 = vector22.f12536y;
        Circle circle = this.B;
        float f17 = circle.f12519x;
        float f18 = circle.f12520y;
        vector2.set(f17, f18);
        this.F.set(0.0f, 0.0f);
        if (!z11 && !this.D.contains(f11, f12)) {
            Vector2 vector23 = this.F;
            float f19 = f11 - f17;
            float f21 = this.B.radius;
            vector23.set(f19 / f21, (f12 - f18) / f21);
            float len = this.F.len();
            if (len > 1.0f) {
                this.F.scl(1.0f / len);
            }
            if (this.B.contains(f11, f12)) {
                this.E.set(f11, f12);
            } else {
                Vector2 scl = this.E.set(this.F).nor().scl(this.B.radius);
                Circle circle2 = this.B;
                scl.add(circle2.f12519x, circle2.f12520y);
            }
        }
        Vector2 vector24 = this.F;
        if (f15 == vector24.f12535x && f16 == vector24.f12536y) {
            return;
        }
        d.a aVar = (d.a) l0.f(d.a.class);
        if (q1(aVar)) {
            this.F.set(f15, f16);
            this.E.set(f13, f14);
        }
        l0.a(aVar);
    }

    public float c3() {
        return this.F.f12535x;
    }

    public float d3() {
        return this.F.f12536y;
    }

    public float e3() {
        return this.E.f12535x;
    }

    public float f3() {
        return this.E.f12536y;
    }

    public boolean g3() {
        return this.f12847z;
    }

    public b h3() {
        return this.f12845x;
    }

    public boolean i3() {
        return this.f12846y;
    }

    public void j3(float f11) {
        if (f11 < 0.0f) {
            throw new IllegalArgumentException("deadzoneRadius must be > 0");
        }
        this.A = f11;
        invalidate();
    }

    public void k3(boolean z11) {
        this.f12847z = z11;
    }

    public void l3(b bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("style cannot be null");
        }
        this.f12845x = bVar;
        C0();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.e0, z2.l
    public float n0() {
        z2.k kVar = this.f12845x.f12849a;
        if (kVar != null) {
            return kVar.b();
        }
        return 0.0f;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.e0, com.badlogic.gdx.scenes.scene2d.a
    public void n1(w1.a aVar, float f11) {
        Q0();
        com.badlogic.gdx.graphics.b e11 = e();
        aVar.k(e11.f11544a, e11.f11545b, e11.f11546c, e11.f11547d * f11);
        float K1 = K1();
        float M1 = M1();
        float J1 = J1();
        float v12 = v1();
        z2.k kVar = this.f12845x.f12849a;
        if (kVar != null) {
            kVar.y(aVar, K1, M1, J1, v12);
        }
        z2.k kVar2 = this.f12845x.f12850b;
        if (kVar2 != null) {
            kVar2.y(aVar, K1 + (this.E.f12535x - (kVar2.b() / 2.0f)), M1 + (this.E.f12536y - (kVar2.o() / 2.0f)), kVar2.b(), kVar2.o());
        }
    }

    public a0(float f11, q qVar, String str) {
        this(f11, (b) qVar.X(str, b.class));
    }

    public a0(float f11, b bVar) {
        this.f12847z = true;
        this.B = new Circle(0.0f, 0.0f, 0.0f);
        this.C = new Circle(0.0f, 0.0f, 0.0f);
        this.D = new Circle(0.0f, 0.0f, 0.0f);
        Vector2 vector2 = new Vector2();
        this.E = vector2;
        this.F = new Vector2();
        if (f11 >= 0.0f) {
            this.A = f11;
            vector2.set(J1() / 2.0f, v1() / 2.0f);
            l3(bVar);
            J2(n0(), R());
            d1(new a());
            return;
        }
        throw new IllegalArgumentException("deadzoneRadius must be > 0");
    }
}
