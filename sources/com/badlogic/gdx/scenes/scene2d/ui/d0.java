package com.badlogic.gdx.scenes.scene2d.ui;

import a3.u0;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.Touchable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d0 extends f0 {
    public float E;
    public float F;
    public float G;
    public a3.r I;
    public int K;
    public boolean L;
    public boolean N;
    public boolean O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public float V;
    public boolean H = true;
    public int J = 2;
    public boolean M = true;

    public d0() {
        L2(Touchable.childrenOnly);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void Q3() {
        int i11;
        float J1;
        float v12;
        int i12 = 0;
        this.H = false;
        u0<com.badlogic.gdx.scenes.scene2d.a> q32 = q3();
        int i13 = q32.f13179b;
        this.E = 0.0f;
        if (this.N) {
            this.F = 0.0f;
            a3.r rVar = this.I;
            if (rVar == null) {
                this.I = new a3.r();
            } else {
                rVar.i();
            }
            a3.r rVar2 = this.I;
            float f11 = this.P;
            float f12 = this.Q;
            float f13 = this.S + this.U;
            float v13 = v1() - f13;
            if (this.L) {
                i12 = i13 - 1;
                i13 = -1;
                i11 = -1;
            } else {
                i11 = 1;
            }
            float f14 = 0.0f;
            float f15 = 0.0f;
            float f16 = 0.0f;
            while (i12 != i13) {
                com.badlogic.gdx.scenes.scene2d.a aVar = q32.get(i12);
                if (aVar instanceof z2.l) {
                    z2.l lVar = (z2.l) aVar;
                    J1 = lVar.n0();
                    v12 = lVar.R();
                    if (v12 > v13) {
                        v12 = Math.max(v13, lVar.o());
                    }
                } else {
                    J1 = aVar.J1();
                    v12 = aVar.v1();
                }
                float f17 = v12 + (f14 > 0.0f ? f11 : 0.0f);
                if (f14 + f17 <= v13 || f14 <= 0.0f) {
                    v12 = f17;
                } else {
                    rVar2.a(f14);
                    rVar2.a(f15);
                    this.F = Math.max(this.F, f14 + f13);
                    if (f16 > 0.0f) {
                        f16 += f12;
                    }
                    f16 += f15;
                    f14 = 0.0f;
                    f15 = 0.0f;
                }
                f14 += v12;
                f15 = Math.max(f15, J1);
                i12 += i11;
            }
            rVar2.a(f14);
            rVar2.a(f15);
            this.F = Math.max(this.F, f14 + f13);
            if (f16 > 0.0f) {
                f16 += f12;
            }
            this.E = Math.max(this.E, f16 + f15);
        } else {
            this.F = this.S + this.U + (this.P * (i13 - 1));
            while (i12 < i13) {
                com.badlogic.gdx.scenes.scene2d.a aVar2 = q32.get(i12);
                if (aVar2 instanceof z2.l) {
                    z2.l lVar2 = (z2.l) aVar2;
                    this.E = Math.max(this.E, lVar2.n0());
                    this.F += lVar2.R();
                } else {
                    this.E = Math.max(this.E, aVar2.J1());
                    this.F += aVar2.v1();
                }
                i12++;
            }
        }
        float f18 = this.E + this.T + this.V;
        this.E = f18;
        if (this.M) {
            this.E = (float) Math.ceil(f18);
            this.F = (float) Math.ceil(this.F);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i4() {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.scenes.scene2d.ui.d0.i4():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007b  */
    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D() {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.scenes.scene2d.ui.d0.D():void");
    }

    public d0 H3(int i11) {
        this.J = i11;
        return this;
    }

    public d0 I3() {
        this.J = (this.J | 4) & (-3);
        return this;
    }

    public d0 J3() {
        this.J = 1;
        return this;
    }

    public d0 K3(int i11) {
        this.K = i11;
        return this;
    }

    public d0 L3() {
        this.K = (this.K | 4) & (-3);
        return this;
    }

    public d0 M3() {
        this.K = 1;
        return this;
    }

    public d0 N3() {
        this.K = (this.K | 8) & (-17);
        return this;
    }

    public d0 O3() {
        this.K = (this.K | 16) & (-9);
        return this;
    }

    public d0 P3() {
        this.K = (this.K | 2) & (-5);
        return this;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public float R() {
        if (this.N) {
            return 0.0f;
        }
        if (this.H) {
            Q3();
        }
        return this.F;
    }

    public d0 R3() {
        this.O = true;
        return this;
    }

    public d0 S3(boolean z11) {
        this.O = z11;
        return this;
    }

    public d0 T3() {
        this.R = 1.0f;
        return this;
    }

    public d0 U3(float f11) {
        this.R = f11;
        return this;
    }

    public int V3() {
        return this.J;
    }

    public int W3() {
        if (this.N) {
            return this.I.f1626b >> 1;
        }
        return 1;
    }

    public boolean X3() {
        return this.O;
    }

    public float Y3() {
        return this.R;
    }

    public float Z3() {
        return this.U;
    }

    public float a4() {
        return this.T;
    }

    public float b4() {
        return this.V;
    }

    public float c4() {
        return this.S;
    }

    public boolean d4() {
        return this.L;
    }

    public float e4() {
        return this.P;
    }

    public boolean f4() {
        return this.N;
    }

    public float g4() {
        return this.Q;
    }

    public d0 h4() {
        this.O = true;
        this.R = 1.0f;
        return this;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public void invalidate() {
        super.invalidate();
        this.H = true;
    }

    public d0 j4() {
        this.J = (this.J | 8) & (-17);
        return this;
    }

    public d0 k4(float f11) {
        this.S = f11;
        this.T = f11;
        this.U = f11;
        this.V = f11;
        return this;
    }

    public d0 l4(float f11, float f12, float f13, float f14) {
        this.S = f11;
        this.T = f12;
        this.U = f13;
        this.V = f14;
        return this;
    }

    public d0 m4(float f11) {
        this.U = f11;
        return this;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public float n0() {
        if (this.H) {
            Q3();
        }
        return this.E;
    }

    public d0 n4(float f11) {
        this.T = f11;
        return this;
    }

    public d0 o4(float f11) {
        this.V = f11;
        return this;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.a
    public void p1(ShapeRenderer shapeRenderer) {
        super.p1(shapeRenderer);
        if (u1()) {
            shapeRenderer.w1(ShapeRenderer.ShapeType.Line);
            if (F1() != null) {
                shapeRenderer.h(F1().q1());
            }
            shapeRenderer.o1(K1() + this.T, M1() + this.U, y1(), z1(), (J1() - this.T) - this.V, (v1() - this.U) - this.S, D1(), E1(), C1());
        }
    }

    public d0 p4(float f11) {
        this.S = f11;
        return this;
    }

    public d0 q4() {
        this.L = true;
        return this;
    }

    public d0 r4(boolean z11) {
        this.L = z11;
        return this;
    }

    public d0 s4() {
        this.J = (this.J | 16) & (-9);
        return this;
    }

    public void t4(boolean z11) {
        this.M = z11;
    }

    public d0 u4(float f11) {
        this.P = f11;
        return this;
    }

    public d0 v4() {
        this.J = (this.J | 2) & (-5);
        return this;
    }

    public d0 w4() {
        this.N = true;
        return this;
    }

    public d0 x4(boolean z11) {
        this.N = z11;
        return this;
    }

    public d0 y4(float f11) {
        this.Q = f11;
        return this;
    }
}
