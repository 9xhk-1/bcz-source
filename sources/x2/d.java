package x2;

import a3.d0;
import a3.u0;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Affine2;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.utils.a;
import z2.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d extends com.badlogic.gdx.scenes.scene2d.a implements f {
    public static final Vector2 A = new Vector2();

    /* renamed from: u, reason: collision with root package name */
    public final u0<com.badlogic.gdx.scenes.scene2d.a> f97066u = new u0<>(true, 4, com.badlogic.gdx.scenes.scene2d.a.class);

    /* renamed from: v, reason: collision with root package name */
    public final Affine2 f97067v = new Affine2();

    /* renamed from: w, reason: collision with root package name */
    public final Matrix4 f97068w = new Matrix4();

    /* renamed from: x, reason: collision with root package name */
    public final Matrix4 f97069x = new Matrix4();

    /* renamed from: y, reason: collision with root package name */
    public boolean f97070y = true;

    /* renamed from: z, reason: collision with root package name */
    @d0
    public Rectangle f97071z;

    public void A3(boolean z11, boolean z12) {
        u2(z11);
        if (z12) {
            a.b<com.badlogic.gdx.scenes.scene2d.a> it = this.f97066u.iterator();
            while (it.hasNext()) {
                com.badlogic.gdx.scenes.scene2d.a next = it.next();
                if (next instanceof d) {
                    ((d) next).A3(z11, z12);
                } else {
                    next.u2(z11);
                }
            }
        }
    }

    public void B3(boolean z11) {
        this.f97070y = z11;
    }

    public boolean C3(int i11, int i12) {
        u0<com.badlogic.gdx.scenes.scene2d.a> u0Var = this.f97066u;
        int i13 = u0Var.f13179b;
        if (i11 < 0 || i11 >= i13 || i12 < 0 || i12 >= i13) {
            return false;
        }
        u0Var.P(i11, i12);
        return true;
    }

    public boolean D3(com.badlogic.gdx.scenes.scene2d.a aVar, com.badlogic.gdx.scenes.scene2d.a aVar2) {
        int q11 = this.f97066u.q(aVar, true);
        int q12 = this.f97066u.q(aVar2, true);
        if (q11 == -1 || q12 == -1) {
            return false;
        }
        this.f97066u.P(q11, q12);
        return true;
    }

    public void E3(StringBuilder sb2, int i11) {
        sb2.append(super.toString());
        sb2.append('\n');
        com.badlogic.gdx.scenes.scene2d.a[] U = this.f97066u.U();
        int i12 = this.f97066u.f13179b;
        for (int i13 = 0; i13 < i12; i13++) {
            for (int i14 = 0; i14 < i11; i14++) {
                sb2.append("|  ");
            }
            com.badlogic.gdx.scenes.scene2d.a aVar = U[i13];
            if (aVar instanceof d) {
                ((d) aVar).E3(sb2, i11 + 1);
            } else {
                sb2.append(aVar);
                sb2.append('\n');
            }
        }
        this.f97066u.V();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.a
    public void K2(com.badlogic.gdx.scenes.scene2d.c cVar) {
        super.K2(cVar);
        u0<com.badlogic.gdx.scenes.scene2d.a> u0Var = this.f97066u;
        com.badlogic.gdx.scenes.scene2d.a[] aVarArr = u0Var.f13178a;
        int i11 = u0Var.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            aVarArr[i12].K2(cVar);
        }
    }

    @Override // com.badlogic.gdx.scenes.scene2d.a
    @d0
    public com.badlogic.gdx.scenes.scene2d.a T1(float f11, float f12, boolean z11) {
        if ((z11 && H1() == Touchable.disabled) || !Z1()) {
            return null;
        }
        Vector2 vector2 = A;
        u0<com.badlogic.gdx.scenes.scene2d.a> u0Var = this.f97066u;
        com.badlogic.gdx.scenes.scene2d.a[] aVarArr = u0Var.f13178a;
        for (int i11 = u0Var.f13179b - 1; i11 >= 0; i11--) {
            com.badlogic.gdx.scenes.scene2d.a aVar = aVarArr[i11];
            aVar.h2(vector2.set(f11, f12));
            com.badlogic.gdx.scenes.scene2d.a T1 = aVar.T1(vector2.f12535x, vector2.f12536y, z11);
            if (T1 != null) {
                return T1;
            }
        }
        return super.T1(f11, f12, z11);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.a
    public void a1(float f11) {
        super.a1(f11);
        com.badlogic.gdx.scenes.scene2d.a[] U = this.f97066u.U();
        int i11 = this.f97066u.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            U[i12].a1(f11);
        }
        this.f97066u.V();
    }

    public void a3(com.badlogic.gdx.scenes.scene2d.a aVar) {
        d dVar = aVar.f12758b;
        if (dVar != null) {
            if (dVar == this) {
                return;
            } else {
                dVar.w3(aVar, false);
            }
        }
        this.f97066u.a(aVar);
        aVar.B2(this);
        aVar.K2(F1());
        g3();
    }

    public void b3(com.badlogic.gdx.scenes.scene2d.a aVar, com.badlogic.gdx.scenes.scene2d.a aVar2) {
        d dVar = aVar2.f12758b;
        if (dVar != null) {
            if (dVar == this) {
                return;
            } else {
                dVar.w3(aVar2, false);
            }
        }
        int q11 = this.f97066u.q(aVar, true);
        u0<com.badlogic.gdx.scenes.scene2d.a> u0Var = this.f97066u;
        if (q11 == u0Var.f13179b || q11 == -1) {
            u0Var.a(aVar2);
        } else {
            u0Var.r(q11 + 1, aVar2);
        }
        aVar2.B2(this);
        aVar2.K2(F1());
        g3();
    }

    public void c3(int i11, com.badlogic.gdx.scenes.scene2d.a aVar) {
        d dVar = aVar.f12758b;
        if (dVar != null) {
            if (dVar == this) {
                return;
            } else {
                dVar.w3(aVar, false);
            }
        }
        u0<com.badlogic.gdx.scenes.scene2d.a> u0Var = this.f97066u;
        if (i11 >= u0Var.f13179b) {
            u0Var.a(aVar);
        } else {
            u0Var.r(i11, aVar);
        }
        aVar.B2(this);
        aVar.K2(F1());
        g3();
    }

    public void d3(com.badlogic.gdx.scenes.scene2d.a aVar, com.badlogic.gdx.scenes.scene2d.a aVar2) {
        d dVar = aVar2.f12758b;
        if (dVar != null) {
            if (dVar == this) {
                return;
            } else {
                dVar.w3(aVar2, false);
            }
        }
        this.f97066u.r(this.f97066u.q(aVar, true), aVar2);
        aVar2.B2(this);
        aVar2.K2(F1());
        g3();
    }

    public void e3(ShapeRenderer shapeRenderer, Matrix4 matrix4) {
        this.f97069x.set(shapeRenderer.B0());
        shapeRenderer.R0(matrix4);
        shapeRenderer.flush();
    }

    public void f3(w1.a aVar, Matrix4 matrix4) {
        this.f97069x.set(aVar.B0());
        aVar.R0(matrix4);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.a
    public void g1() {
        super.g1();
        j3(true);
    }

    public void h3(boolean z11) {
        super.g1();
        j3(z11);
    }

    public void i0(@d0 Rectangle rectangle) {
        this.f97071z = rectangle;
    }

    public void i3() {
        j3(true);
    }

    public void j3(boolean z11) {
        com.badlogic.gdx.scenes.scene2d.c F1;
        com.badlogic.gdx.scenes.scene2d.a[] U = this.f97066u.U();
        int i11 = this.f97066u.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            com.badlogic.gdx.scenes.scene2d.a aVar = U[i12];
            if (z11 && (F1 = F1()) != null) {
                F1.R1(aVar);
            }
            aVar.K2(null);
            aVar.B2(null);
        }
        this.f97066u.V();
        this.f97066u.clear();
        g3();
    }

    public Matrix4 k3() {
        Affine2 affine2 = this.f97067v;
        float f11 = this.f12770n;
        float f12 = this.f12771o;
        affine2.setToTrnRotScl(this.f12766j + f11, this.f12767k + f12, this.f12774r, this.f12772p, this.f12773q);
        if (f11 != 0.0f || f12 != 0.0f) {
            affine2.translate(-f11, -f12);
        }
        d dVar = this.f12758b;
        while (dVar != null && !dVar.f97070y) {
            dVar = dVar.f12758b;
        }
        if (dVar != null) {
            affine2.preMul(dVar.f97067v);
        }
        this.f97068w.set(affine2);
        return this.f97068w;
    }

    public d l3() {
        A3(true, true);
        return this;
    }

    public void m3(w1.a aVar, float f11) {
        com.badlogic.gdx.scenes.scene2d.a[] aVarArr;
        float f12 = this.f12775s.f11547d * f11;
        u0<com.badlogic.gdx.scenes.scene2d.a> u0Var = this.f97066u;
        com.badlogic.gdx.scenes.scene2d.a[] U = u0Var.U();
        Rectangle rectangle = this.f97071z;
        int i11 = 0;
        if (rectangle != null) {
            float f13 = rectangle.f12533x;
            float f14 = rectangle.width + f13;
            float f15 = rectangle.f12534y;
            float f16 = rectangle.height + f15;
            if (this.f97070y) {
                int i12 = u0Var.f13179b;
                while (i11 < i12) {
                    com.badlogic.gdx.scenes.scene2d.a aVar2 = U[i11];
                    if (aVar2.Z1()) {
                        float f17 = aVar2.f12766j;
                        float f18 = aVar2.f12767k;
                        if (f17 <= f14 && f18 <= f16 && f17 + aVar2.f12768l >= f13 && f18 + aVar2.f12769m >= f15) {
                            aVar2.n1(aVar, f12);
                        }
                    }
                    i11++;
                }
            } else {
                float f19 = this.f12766j;
                float f21 = this.f12767k;
                this.f12766j = 0.0f;
                this.f12767k = 0.0f;
                int i13 = u0Var.f13179b;
                while (i11 < i13) {
                    com.badlogic.gdx.scenes.scene2d.a aVar3 = U[i11];
                    if (aVar3.Z1()) {
                        float f22 = aVar3.f12766j;
                        float f23 = aVar3.f12767k;
                        if (f22 <= f14 && f23 <= f16) {
                            aVarArr = U;
                            if (aVar3.f12768l + f22 >= f13 && aVar3.f12769m + f23 >= f15) {
                                aVar3.f12766j = f22 + f19;
                                aVar3.f12767k = f23 + f21;
                                aVar3.n1(aVar, f12);
                                aVar3.f12766j = f22;
                                aVar3.f12767k = f23;
                            }
                            i11++;
                            U = aVarArr;
                        }
                    }
                    aVarArr = U;
                    i11++;
                    U = aVarArr;
                }
                this.f12766j = f19;
                this.f12767k = f21;
            }
        } else if (this.f97070y) {
            int i14 = u0Var.f13179b;
            while (i11 < i14) {
                com.badlogic.gdx.scenes.scene2d.a aVar4 = U[i11];
                if (aVar4.Z1()) {
                    aVar4.n1(aVar, f12);
                }
                i11++;
            }
        } else {
            float f24 = this.f12766j;
            float f25 = this.f12767k;
            this.f12766j = 0.0f;
            this.f12767k = 0.0f;
            int i15 = u0Var.f13179b;
            while (i11 < i15) {
                com.badlogic.gdx.scenes.scene2d.a aVar5 = U[i11];
                if (aVar5.Z1()) {
                    float f26 = aVar5.f12766j;
                    float f27 = aVar5.f12767k;
                    aVar5.f12766j = f26 + f24;
                    aVar5.f12767k = f27 + f25;
                    aVar5.n1(aVar, f12);
                    aVar5.f12766j = f26;
                    aVar5.f12767k = f27;
                }
                i11++;
            }
            this.f12766j = f24;
            this.f12767k = f25;
        }
        u0Var.V();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.a
    public void n1(w1.a aVar, float f11) {
        if (this.f97070y) {
            f3(aVar, k3());
        }
        m3(aVar, f11);
        if (this.f97070y) {
            z3(aVar);
        }
    }

    public void n3(ShapeRenderer shapeRenderer) {
        u0<com.badlogic.gdx.scenes.scene2d.a> u0Var = this.f97066u;
        com.badlogic.gdx.scenes.scene2d.a[] U = u0Var.U();
        int i11 = 0;
        if (this.f97070y) {
            int i12 = u0Var.f13179b;
            while (i11 < i12) {
                com.badlogic.gdx.scenes.scene2d.a aVar = U[i11];
                if (aVar.Z1() && (aVar.u1() || (aVar instanceof d))) {
                    aVar.o1(shapeRenderer);
                }
                i11++;
            }
            shapeRenderer.flush();
        } else {
            float f11 = this.f12766j;
            float f12 = this.f12767k;
            this.f12766j = 0.0f;
            this.f12767k = 0.0f;
            int i13 = u0Var.f13179b;
            while (i11 < i13) {
                com.badlogic.gdx.scenes.scene2d.a aVar2 = U[i11];
                if (aVar2.Z1() && (aVar2.u1() || (aVar2 instanceof d))) {
                    float f13 = aVar2.f12766j;
                    float f14 = aVar2.f12767k;
                    aVar2.f12766j = f13 + f11;
                    aVar2.f12767k = f14 + f12;
                    aVar2.o1(shapeRenderer);
                    aVar2.f12766j = f13;
                    aVar2.f12767k = f14;
                }
                i11++;
            }
            this.f12766j = f11;
            this.f12767k = f12;
        }
        u0Var.V();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.a
    public void o1(ShapeRenderer shapeRenderer) {
        p1(shapeRenderer);
        if (this.f97070y) {
            e3(shapeRenderer, k3());
        }
        n3(shapeRenderer);
        if (this.f97070y) {
            y3(shapeRenderer);
        }
    }

    @d0
    public <T extends com.badlogic.gdx.scenes.scene2d.a> T o3(String str) {
        T t11;
        u0<com.badlogic.gdx.scenes.scene2d.a> u0Var = this.f97066u;
        int i11 = u0Var.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (str.equals(u0Var.get(i12).x1())) {
                return (T) u0Var.get(i12);
            }
        }
        int i13 = u0Var.f13179b;
        for (int i14 = 0; i14 < i13; i14++) {
            com.badlogic.gdx.scenes.scene2d.a aVar = u0Var.get(i14);
            if ((aVar instanceof d) && (t11 = (T) ((d) aVar).o3(str)) != null) {
                return t11;
            }
        }
        return null;
    }

    public com.badlogic.gdx.scenes.scene2d.a p3(int i11) {
        return this.f97066u.get(i11);
    }

    public u0<com.badlogic.gdx.scenes.scene2d.a> q3() {
        return this.f97066u;
    }

    @d0
    public Rectangle r3() {
        return this.f97071z;
    }

    public boolean s3() {
        return this.f97066u.f13179b > 0;
    }

    public boolean t3() {
        return this.f97070y;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.a
    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        E3(sb2, 1);
        sb2.setLength(sb2.length() - 1);
        return sb2.toString();
    }

    public Vector2 u3(com.badlogic.gdx.scenes.scene2d.a aVar, Vector2 vector2) {
        d dVar = aVar.f12758b;
        if (dVar != null) {
            if (dVar != this) {
                u3(dVar, vector2);
            }
            aVar.h2(vector2);
            return vector2;
        }
        throw new IllegalArgumentException("Actor is not a descendant: " + aVar);
    }

    public boolean v3(com.badlogic.gdx.scenes.scene2d.a aVar) {
        return w3(aVar, true);
    }

    public boolean w3(com.badlogic.gdx.scenes.scene2d.a aVar, boolean z11) {
        int q11 = this.f97066u.q(aVar, true);
        if (q11 == -1) {
            return false;
        }
        x3(q11, z11);
        return true;
    }

    public com.badlogic.gdx.scenes.scene2d.a x3(int i11, boolean z11) {
        com.badlogic.gdx.scenes.scene2d.a A2 = this.f97066u.A(i11);
        com.badlogic.gdx.scenes.scene2d.c F1 = F1();
        if (F1 != null) {
            if (z11) {
                F1.R1(A2);
            }
            F1.C0(A2);
        }
        A2.B2(null);
        A2.K2(null);
        g3();
        return A2;
    }

    public void y3(ShapeRenderer shapeRenderer) {
        shapeRenderer.R0(this.f97069x);
    }

    public void z3(w1.a aVar) {
        aVar.R0(this.f97069x);
    }

    public void g3() {
    }
}
