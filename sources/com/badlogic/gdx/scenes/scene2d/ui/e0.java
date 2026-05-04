package com.badlogic.gdx.scenes.scene2d.ui;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e0 extends com.badlogic.gdx.scenes.scene2d.a implements z2.l {

    /* renamed from: v, reason: collision with root package name */
    public boolean f12917v;

    /* renamed from: u, reason: collision with root package name */
    public boolean f12916u = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f12918w = true;

    @Override // z2.l
    public void C0() {
        if (this.f12918w) {
            invalidate();
            z2.f A1 = A1();
            if (A1 instanceof z2.l) {
                ((z2.l) A1).C0();
            }
        }
    }

    @Override // z2.l
    public void Q0() {
        float v12;
        float f11;
        if (this.f12918w) {
            x2.d A1 = A1();
            if (this.f12917v && A1 != null) {
                com.badlogic.gdx.scenes.scene2d.c F1 = F1();
                if (F1 == null || A1 != F1.t1()) {
                    float J1 = A1.J1();
                    v12 = A1.v1();
                    f11 = J1;
                } else {
                    f11 = F1.w1();
                    v12 = F1.r1();
                }
                J2(f11, v12);
            }
            if (this.f12916u) {
                this.f12916u = false;
                D();
            }
        }
    }

    public float R() {
        return 0.0f;
    }

    @Override // z2.l
    public float V0() {
        return 0.0f;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.a
    public void W2() {
        invalidate();
    }

    @Override // z2.l
    public void X(boolean z11) {
        this.f12917v = z11;
    }

    @Override // z2.l
    public void Z(boolean z11) {
        this.f12918w = z11;
        if (z11) {
            C0();
        }
    }

    public boolean a3() {
        return this.f12916u;
    }

    @Override // z2.l
    public float b() {
        return n0();
    }

    @Override // z2.l
    public void invalidate() {
        this.f12916u = true;
    }

    public float n0() {
        return 0.0f;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.a
    public void n1(w1.a aVar, float f11) {
        Q0();
    }

    @Override // z2.l
    public float o() {
        return R();
    }

    @Override // z2.l
    public float w0() {
        return 0.0f;
    }

    @Override // z2.l
    public void z() {
        J2(n0(), R());
        Q0();
    }

    public void D() {
    }
}
