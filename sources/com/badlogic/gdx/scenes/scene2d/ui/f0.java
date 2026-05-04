package com.badlogic.gdx.scenes.scene2d.ui;

import a3.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f0 extends x2.d implements z2.l {
    public boolean C;
    public boolean B = true;
    public boolean D = true;

    public f0() {
    }

    @Override // z2.l
    public void C0() {
        invalidate();
        z2.f A1 = A1();
        if (A1 instanceof z2.l) {
            ((z2.l) A1).C0();
        }
    }

    public boolean F3() {
        return this.B;
    }

    public final void G3(x2.d dVar, boolean z11) {
        u0<com.badlogic.gdx.scenes.scene2d.a> q32 = dVar.q3();
        int i11 = q32.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            Object obj = (com.badlogic.gdx.scenes.scene2d.a) q32.get(i12);
            if (obj instanceof z2.l) {
                ((z2.l) obj).Z(z11);
            } else if (obj instanceof x2.d) {
                G3((x2.d) obj, z11);
            }
        }
    }

    @Override // z2.l
    public void Q0() {
        if (this.D) {
            x2.d A1 = A1();
            if (this.C && A1 != null) {
                com.badlogic.gdx.scenes.scene2d.c F1 = F1();
                if (F1 == null || A1 != F1.t1()) {
                    J2(A1.J1(), A1.v1());
                } else {
                    J2(F1.w1(), F1.r1());
                }
            }
            if (this.B) {
                this.B = false;
                D();
                if (!this.B || (A1 instanceof f0)) {
                    return;
                }
                for (int i11 = 0; i11 < 5; i11++) {
                    this.B = false;
                    D();
                    if (!this.B) {
                        return;
                    }
                }
            }
        }
    }

    public float R() {
        return 0.0f;
    }

    @Override // x2.d, com.badlogic.gdx.scenes.scene2d.a
    public com.badlogic.gdx.scenes.scene2d.a T1(float f11, float f12, boolean z11) {
        Q0();
        return super.T1(f11, f12, z11);
    }

    public float V0() {
        return 0.0f;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.a
    public void W2() {
        invalidate();
    }

    @Override // z2.l
    public void X(boolean z11) {
        this.C = z11;
    }

    @Override // z2.l
    public void Z(boolean z11) {
        this.D = z11;
        G3(this, z11);
    }

    public float b() {
        return n0();
    }

    @Override // x2.d
    public void g3() {
        C0();
    }

    public void invalidate() {
        this.B = true;
    }

    public float n0() {
        return 0.0f;
    }

    @Override // x2.d, com.badlogic.gdx.scenes.scene2d.a
    public void n1(w1.a aVar, float f11) {
        Q0();
        super.n1(aVar, f11);
    }

    public float o() {
        return R();
    }

    public float w0() {
        return 0.0f;
    }

    @Override // z2.l
    public void z() {
        J2(n0(), R());
        Q0();
        J2(n0(), R());
        Q0();
    }

    public f0(com.badlogic.gdx.scenes.scene2d.a... aVarArr) {
        for (com.badlogic.gdx.scenes.scene2d.a aVar : aVarArr) {
            a3(aVar);
        }
    }

    public void D() {
    }
}
