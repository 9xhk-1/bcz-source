package com.badlogic.gdx.scenes.scene2d.ui;

import a3.u0;
import com.badlogic.gdx.scenes.scene2d.Touchable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class t extends f0 {
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public boolean K;

    public t() {
        this.K = true;
        B3(false);
        O2(150.0f);
        v2(150.0f);
        L2(Touchable.childrenOnly);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void I3() {
        float f11;
        float f12;
        this.K = false;
        this.E = 0.0f;
        this.F = 0.0f;
        this.G = 0.0f;
        this.H = 0.0f;
        this.I = 0.0f;
        this.J = 0.0f;
        u0<com.badlogic.gdx.scenes.scene2d.a> q32 = q3();
        int i11 = q32.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            com.badlogic.gdx.scenes.scene2d.a aVar = q32.get(i12);
            if (aVar instanceof z2.l) {
                z2.l lVar = (z2.l) aVar;
                this.E = Math.max(this.E, lVar.n0());
                this.F = Math.max(this.F, lVar.R());
                this.G = Math.max(this.G, lVar.b());
                this.H = Math.max(this.H, lVar.o());
                f12 = lVar.w0();
                f11 = lVar.V0();
            } else {
                this.E = Math.max(this.E, aVar.J1());
                this.F = Math.max(this.F, aVar.v1());
                this.G = Math.max(this.G, aVar.J1());
                this.H = Math.max(this.H, aVar.v1());
                f11 = 0.0f;
                f12 = 0.0f;
            }
            if (f12 > 0.0f) {
                float f13 = this.I;
                if (f13 != 0.0f) {
                    f12 = Math.min(f13, f12);
                }
                this.I = f12;
            }
            if (f11 > 0.0f) {
                float f14 = this.J;
                if (f14 != 0.0f) {
                    f11 = Math.min(f14, f11);
                }
                this.J = f11;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public void D() {
        if (this.K) {
            I3();
        }
        float J1 = J1();
        float v12 = v1();
        u0<com.badlogic.gdx.scenes.scene2d.a> q32 = q3();
        int i11 = q32.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            com.badlogic.gdx.scenes.scene2d.a aVar = q32.get(i12);
            aVar.t2(0.0f, 0.0f, J1, v12);
            if (aVar instanceof z2.l) {
                ((z2.l) aVar).Q0();
            }
        }
    }

    public void H3(com.badlogic.gdx.scenes.scene2d.a aVar) {
        a3(aVar);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public float R() {
        if (this.K) {
            I3();
        }
        return this.F;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public float V0() {
        if (this.K) {
            I3();
        }
        return this.J;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public float b() {
        if (this.K) {
            I3();
        }
        return this.G;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public void invalidate() {
        super.invalidate();
        this.K = true;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public float n0() {
        if (this.K) {
            I3();
        }
        return this.E;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public float o() {
        if (this.K) {
            I3();
        }
        return this.H;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public float w0() {
        if (this.K) {
            I3();
        }
        return this.I;
    }

    public t(com.badlogic.gdx.scenes.scene2d.a... aVarArr) {
        this();
        for (com.badlogic.gdx.scenes.scene2d.a aVar : aVarArr) {
            a3(aVar);
        }
    }
}
