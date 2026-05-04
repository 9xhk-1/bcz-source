package com.badlogic.gdx.scenes.scene2d.ui;

import a3.q0;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class h extends e0 {
    public float A;
    public float B;
    public float C;
    public z2.k D;

    /* renamed from: x, reason: collision with root package name */
    public q0 f12939x;

    /* renamed from: y, reason: collision with root package name */
    public int f12940y;

    /* renamed from: z, reason: collision with root package name */
    public float f12941z;

    public h() {
        this((z2.k) null);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.e0, z2.l
    public void D() {
        z2.k kVar = this.D;
        if (kVar == null) {
            return;
        }
        Vector2 a11 = this.f12939x.a(kVar.b(), this.D.o(), J1(), v1());
        this.B = a11.f12535x;
        this.C = a11.f12536y;
        int i11 = this.f12940y;
        if ((i11 & 8) != 0) {
            this.f12941z = 0.0f;
        } else if ((i11 & 16) != 0) {
            this.f12941z = (int) (r2 - r1);
        } else {
            this.f12941z = (int) ((r2 / 2.0f) - (r1 / 2.0f));
        }
        if ((i11 & 2) != 0) {
            this.A = (int) (r3 - r0);
        } else if ((i11 & 4) != 0) {
            this.A = 0.0f;
        } else {
            this.A = (int) ((r3 / 2.0f) - (r0 / 2.0f));
        }
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.e0, z2.l
    public float R() {
        z2.k kVar = this.D;
        if (kVar != null) {
            return kVar.o();
        }
        return 0.0f;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.e0, z2.l
    public float b() {
        return 0.0f;
    }

    public int b3() {
        return this.f12940y;
    }

    @a3.d0
    public z2.k c3() {
        return this.D;
    }

    public float d3() {
        return this.C;
    }

    public float e3() {
        return this.B;
    }

    public float f3() {
        return this.f12941z;
    }

    public float g3() {
        return this.A;
    }

    public void h3(int i11) {
        this.f12940y = i11;
        invalidate();
    }

    public void i3(q qVar, String str) {
        j3(qVar.w0(str));
    }

    public void j3(@a3.d0 z2.k kVar) {
        if (this.D == kVar) {
            return;
        }
        if (kVar == null) {
            C0();
        } else if (n0() != kVar.b() || R() != kVar.o()) {
            C0();
        }
        this.D = kVar;
    }

    public void k3(q0 q0Var) {
        if (q0Var == null) {
            throw new IllegalArgumentException("scaling cannot be null.");
        }
        this.f12939x = q0Var;
        invalidate();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.e0, z2.l
    public float n0() {
        z2.k kVar = this.D;
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
        float D1 = D1();
        float E1 = E1();
        if (this.D instanceof z2.s) {
            float C1 = C1();
            if (D1 != 1.0f || E1 != 1.0f || C1 != 0.0f) {
                ((z2.s) this.D).a(aVar, K1 + this.f12941z, M1 + this.A, y1() - this.f12941z, z1() - this.A, this.B, this.C, D1, E1, C1);
                return;
            }
        }
        z2.k kVar = this.D;
        if (kVar != null) {
            kVar.y(aVar, K1 + this.f12941z, M1 + this.A, this.B * D1, this.C * E1);
        }
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.e0, z2.l
    public float o() {
        return 0.0f;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.a
    public String toString() {
        String x12 = x1();
        if (x12 != null) {
            return x12;
        }
        String name = getClass().getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf != -1) {
            name = name.substring(lastIndexOf + 1);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name.indexOf(36) != -1 ? "Image " : "");
        sb2.append(name);
        sb2.append(": ");
        sb2.append(this.D);
        return sb2.toString();
    }

    public h(@a3.d0 w1.c cVar) {
        this(new z2.m(cVar), q0.f1621g, 1);
    }

    public h(@a3.d0 w1.o oVar) {
        this(new z2.q(oVar), q0.f1621g, 1);
    }

    public h(Texture texture) {
        this(new z2.q(new w1.o(texture)));
    }

    public h(q qVar, String str) {
        this(qVar.w0(str), q0.f1621g, 1);
    }

    public h(@a3.d0 z2.k kVar) {
        this(kVar, q0.f1621g, 1);
    }

    public h(@a3.d0 z2.k kVar, q0 q0Var) {
        this(kVar, q0Var, 1);
    }

    public h(@a3.d0 z2.k kVar, q0 q0Var, int i11) {
        this.f12940y = 1;
        j3(kVar);
        this.f12939x = q0Var;
        this.f12940y = i11;
        J2(n0(), R());
    }
}
