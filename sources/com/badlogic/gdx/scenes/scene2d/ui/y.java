package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class y<T extends com.badlogic.gdx.scenes.scene2d.a> extends com.badlogic.gdx.scenes.scene2d.b {

    /* renamed from: h, reason: collision with root package name */
    public static Vector2 f13120h = new Vector2();

    /* renamed from: b, reason: collision with root package name */
    public final z f13121b;

    /* renamed from: c, reason: collision with root package name */
    public final e<T> f13122c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13123d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13124e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13125f;

    /* renamed from: g, reason: collision with root package name */
    public com.badlogic.gdx.scenes.scene2d.a f13126g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends e {
        public a(com.badlogic.gdx.scenes.scene2d.a aVar) {
            super(aVar);
        }

        @Override // x2.d, com.badlogic.gdx.scenes.scene2d.a
        public void a1(float f11) {
            super.a1(f11);
            com.badlogic.gdx.scenes.scene2d.a aVar = y.this.f13126g;
            if (aVar == null || aVar.F1() != null) {
                return;
            }
            j2();
        }
    }

    public y(@a3.d0 T t11) {
        this(t11, z.b());
    }

    @Override // com.badlogic.gdx.scenes.scene2d.b
    public void b(InputEvent inputEvent, float f11, float f12, int i11, @a3.d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
        if (i11 != -1) {
            return;
        }
        if (this.f13125f && q1.g.f81381d.h()) {
            return;
        }
        com.badlogic.gdx.scenes.scene2d.a c11 = inputEvent.c();
        if (aVar == null || !aVar.V1(c11)) {
            r(c11, f11, f12);
            this.f13121b.a(this);
        }
    }

    @Override // com.badlogic.gdx.scenes.scene2d.b
    public void c(InputEvent inputEvent, float f11, float f12, int i11, @a3.d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
        if (aVar == null || !aVar.V1(inputEvent.c())) {
            o();
        }
    }

    @Override // com.badlogic.gdx.scenes.scene2d.b
    public boolean g(InputEvent inputEvent, float f11, float f12) {
        if (this.f13122c.R1()) {
            return false;
        }
        r(inputEvent.c(), f11, f12);
        return true;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.b
    public boolean i(InputEvent inputEvent, float f11, float f12, int i11, int i12) {
        if (this.f13123d) {
            this.f13122c.Z2();
            return false;
        }
        this.f13121b.h(this);
        return false;
    }

    @a3.d0
    public T l() {
        return this.f13122c.U3();
    }

    public e<T> m() {
        return this.f13122c;
    }

    public z n() {
        return this.f13121b;
    }

    public void o() {
        this.f13121b.c(this);
    }

    public void p(@a3.d0 T t11) {
        this.f13122c.d5(t11);
    }

    public void q(boolean z11) {
        this.f13124e = z11;
    }

    public final void r(com.badlogic.gdx.scenes.scene2d.a aVar, float f11, float f12) {
        this.f13126g = aVar;
        com.badlogic.gdx.scenes.scene2d.c F1 = aVar.F1();
        if (F1 == null) {
            return;
        }
        this.f13122c.J2(this.f13121b.f13134f, 2.14748365E9f);
        this.f13122c.Q0();
        e<T> eVar = this.f13122c;
        eVar.n5(eVar.U3().J1());
        this.f13122c.z();
        z zVar = this.f13121b;
        float f13 = zVar.f13135g;
        float f14 = zVar.f13136h;
        float f15 = zVar.f13137i;
        float f16 = f11 + f13;
        Vector2 e22 = aVar.e2(f13120h.set(f16, (f12 - f14) - this.f13122c.v1()));
        if (e22.f12536y < f15) {
            e22 = aVar.e2(f13120h.set(f16, f12 + f14));
        }
        if (e22.f12535x < f15) {
            e22.f12535x = f15;
        }
        if (e22.f12535x + this.f13122c.J1() > F1.w1() - f15) {
            e22.f12535x = (F1.w1() - f15) - this.f13122c.J1();
        }
        if (e22.f12536y + this.f13122c.v1() > F1.r1() - f15) {
            e22.f12536y = (F1.r1() - f15) - this.f13122c.v1();
        }
        this.f13122c.C2(e22.f12535x, e22.f12536y);
        Vector2 e23 = aVar.e2(f13120h.set(aVar.J1() / 2.0f, aVar.v1() / 2.0f));
        e23.sub(this.f13122c.K1(), this.f13122c.M1());
        this.f13122c.x2(e23.f12535x, e23.f12536y);
    }

    public void s(boolean z11) {
        this.f13123d = z11;
    }

    public void t(boolean z11) {
        this.f13125f = z11;
    }

    public y(@a3.d0 T t11, z zVar) {
        this.f13121b = zVar;
        a aVar = new a(t11);
        this.f13122c = aVar;
        aVar.L2(Touchable.disabled);
    }
}
