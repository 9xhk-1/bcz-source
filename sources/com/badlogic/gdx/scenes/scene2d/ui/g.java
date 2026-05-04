package com.badlogic.gdx.scenes.scene2d.ui;

import a3.u0;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.Touchable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class g extends f0 {
    public float E;
    public float F;
    public float G;
    public a3.r I;
    public int K;
    public boolean L;
    public boolean N;
    public boolean O;
    public boolean P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public float V;
    public float W;
    public boolean H = true;
    public int J = 8;
    public boolean M = true;

    public g() {
        L2(Touchable.childrenOnly);
    }

    public g A4(boolean z11) {
        this.O = z11;
        return this;
    }

    public g B4(float f11) {
        this.R = f11;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0077  */
    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D() {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.scenes.scene2d.ui.g.D():void");
    }

    public g H3(int i11) {
        this.J = i11;
        return this;
    }

    public g I3() {
        this.J = (this.J | 4) & (-3);
        return this;
    }

    public g J3() {
        this.J = 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K3() {
        int i11;
        float J1;
        float v12;
        float f11;
        int i12 = 0;
        this.H = false;
        u0<com.badlogic.gdx.scenes.scene2d.a> q32 = q3();
        int i13 = q32.f13179b;
        float f12 = 0.0f;
        this.F = 0.0f;
        if (this.N) {
            this.E = 0.0f;
            a3.r rVar = this.I;
            if (rVar == null) {
                this.I = new a3.r();
            } else {
                rVar.i();
            }
            a3.r rVar2 = this.I;
            float f13 = this.Q;
            float f14 = this.R;
            float f15 = this.U + this.W;
            float J12 = J1() - f15;
            if (this.L) {
                i12 = i13 - 1;
                i13 = -1;
                i11 = -1;
            } else {
                i11 = 1;
            }
            float f16 = 0.0f;
            float f17 = 0.0f;
            float f18 = 0.0f;
            while (i12 != i13) {
                com.badlogic.gdx.scenes.scene2d.a aVar = q32.get(i12);
                if (aVar instanceof z2.l) {
                    z2.l lVar = (z2.l) aVar;
                    J1 = lVar.n0();
                    if (J1 > J12) {
                        J1 = Math.max(J12, lVar.b());
                    }
                    v12 = lVar.R();
                } else {
                    J1 = aVar.J1();
                    v12 = aVar.v1();
                }
                float f19 = J1 + (f16 > f12 ? f13 : f12);
                if (f16 + f19 <= J12 || f16 <= f12) {
                    f11 = f12;
                    J1 = f19;
                } else {
                    rVar2.a(f16);
                    rVar2.a(f17);
                    f11 = f12;
                    this.E = Math.max(this.E, f16 + f15);
                    if (f18 > f11) {
                        f18 += f14;
                    }
                    f18 += f17;
                    f16 = f11;
                    f17 = f16;
                }
                f16 += J1;
                f17 = Math.max(f17, v12);
                i12 += i11;
                f12 = f11;
            }
            float f21 = f12;
            rVar2.a(f16);
            rVar2.a(f17);
            this.E = Math.max(this.E, f16 + f15);
            if (f18 > f21) {
                f18 += f14;
            }
            this.F = Math.max(this.F, f18 + f17);
        } else {
            this.E = this.U + this.W + (this.Q * (i13 - 1));
            while (i12 < i13) {
                com.badlogic.gdx.scenes.scene2d.a aVar2 = q32.get(i12);
                if (aVar2 instanceof z2.l) {
                    z2.l lVar2 = (z2.l) aVar2;
                    this.E += lVar2.n0();
                    this.F = Math.max(this.F, lVar2.R());
                } else {
                    this.E += aVar2.J1();
                    this.F = Math.max(this.F, aVar2.v1());
                }
                i12++;
            }
        }
        this.F += this.T + this.V;
        if (this.M) {
            this.E = (float) Math.ceil(this.E);
            this.F = (float) Math.ceil(this.F);
        }
    }

    public g L3() {
        this.P = true;
        return this;
    }

    public g M3(boolean z11) {
        this.P = z11;
        return this;
    }

    public g N3() {
        this.S = 1.0f;
        return this;
    }

    public g O3(float f11) {
        this.S = f11;
        return this;
    }

    public int P3() {
        return this.J;
    }

    public boolean Q3() {
        return this.P;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public float R() {
        if (this.H) {
            K3();
        }
        return this.F;
    }

    public float R3() {
        return this.S;
    }

    public float S3() {
        return this.V;
    }

    public float T3() {
        return this.U;
    }

    public float U3() {
        return this.W;
    }

    public float V3() {
        return this.T;
    }

    public boolean W3() {
        return this.L;
    }

    public int X3() {
        if (this.N) {
            return this.I.f1626b >> 1;
        }
        return 1;
    }

    public float Y3() {
        return this.Q;
    }

    public boolean Z3() {
        return this.N;
    }

    public boolean a4() {
        return this.O;
    }

    public float b4() {
        return this.R;
    }

    public g c4() {
        this.P = true;
        this.S = 1.0f;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d4() {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.scenes.scene2d.ui.g.d4():void");
    }

    public g e4() {
        this.J = (this.J | 8) & (-17);
        return this;
    }

    public g f4(float f11) {
        this.T = f11;
        this.U = f11;
        this.V = f11;
        this.W = f11;
        return this;
    }

    public g g4(float f11, float f12, float f13, float f14) {
        this.T = f11;
        this.U = f12;
        this.V = f13;
        this.W = f14;
        return this;
    }

    public g h4(float f11) {
        this.V = f11;
        return this;
    }

    public g i4(float f11) {
        this.U = f11;
        return this;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public void invalidate() {
        super.invalidate();
        this.H = true;
    }

    public g j4(float f11) {
        this.W = f11;
        return this;
    }

    public g k4(float f11) {
        this.T = f11;
        return this;
    }

    public g l4() {
        this.L = true;
        return this;
    }

    public g m4(boolean z11) {
        this.L = z11;
        return this;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.f0, z2.l
    public float n0() {
        if (this.N) {
            return 0.0f;
        }
        if (this.H) {
            K3();
        }
        return this.E;
    }

    public g n4() {
        this.J = (this.J | 16) & (-9);
        return this;
    }

    public g o4(int i11) {
        this.K = i11;
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
            shapeRenderer.o1(K1() + this.U, M1() + this.V, y1(), z1(), (J1() - this.U) - this.W, (v1() - this.V) - this.T, D1(), E1(), C1());
        }
    }

    public g p4() {
        this.K = (this.K | 4) & (-3);
        return this;
    }

    public g q4() {
        this.K = 1;
        return this;
    }

    public g r4() {
        this.K = (this.K | 8) & (-17);
        return this;
    }

    public g s4() {
        this.K = (this.K | 16) & (-9);
        return this;
    }

    public g t4() {
        this.K = (this.K | 2) & (-5);
        return this;
    }

    public void u4(boolean z11) {
        this.M = z11;
    }

    public g v4(float f11) {
        this.Q = f11;
        return this;
    }

    public g w4() {
        this.J = (this.J | 2) & (-5);
        return this;
    }

    public g x4() {
        this.N = true;
        return this;
    }

    public g y4(boolean z11) {
        this.N = z11;
        return this;
    }

    public g z4() {
        this.O = true;
        return this;
    }
}
