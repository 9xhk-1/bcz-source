package com.badlogic.gdx.graphics.glutils;

import a3.q;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.n;
import n2.k;
import n2.l;
import n2.w;
import q1.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class ShapeRenderer implements q {

    /* renamed from: a, reason: collision with root package name */
    public final l f12220a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12221b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix4 f12222c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix4 f12223d;

    /* renamed from: e, reason: collision with root package name */
    public final Matrix4 f12224e;

    /* renamed from: f, reason: collision with root package name */
    public final Vector2 f12225f;

    /* renamed from: g, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.b f12226g;

    /* renamed from: h, reason: collision with root package name */
    public ShapeType f12227h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f12228i;

    /* renamed from: j, reason: collision with root package name */
    public float f12229j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum ShapeType {
        Point(0),
        Line(1),
        Filled(4);

        private final int glType;

        ShapeType(int i11) {
            this.glType = i11;
        }

        public int getGlType() {
            return this.glType;
        }
    }

    public ShapeRenderer() {
        this(5000);
    }

    public void A1(float f11, float f12, float f13, float f14, float f15, float f16, com.badlogic.gdx.graphics.b bVar, com.badlogic.gdx.graphics.b bVar2, com.badlogic.gdx.graphics.b bVar3) {
        ShapeType shapeType = ShapeType.Line;
        I(shapeType, ShapeType.Filled, 6);
        if (this.f12227h != shapeType) {
            this.f12220a.o(bVar.f11544a, bVar.f11545b, bVar.f11546c, bVar.f11547d);
            this.f12220a.q(f11, f12, 0.0f);
            this.f12220a.o(bVar2.f11544a, bVar2.f11545b, bVar2.f11546c, bVar2.f11547d);
            this.f12220a.q(f13, f14, 0.0f);
            this.f12220a.o(bVar3.f11544a, bVar3.f11545b, bVar3.f11546c, bVar3.f11547d);
            this.f12220a.q(f15, f16, 0.0f);
            return;
        }
        this.f12220a.o(bVar.f11544a, bVar.f11545b, bVar.f11546c, bVar.f11547d);
        this.f12220a.q(f11, f12, 0.0f);
        this.f12220a.o(bVar2.f11544a, bVar2.f11545b, bVar2.f11546c, bVar2.f11547d);
        this.f12220a.q(f13, f14, 0.0f);
        this.f12220a.o(bVar2.f11544a, bVar2.f11545b, bVar2.f11546c, bVar2.f11547d);
        this.f12220a.q(f13, f14, 0.0f);
        this.f12220a.o(bVar3.f11544a, bVar3.f11545b, bVar3.f11546c, bVar3.f11547d);
        this.f12220a.q(f15, f16, 0.0f);
        this.f12220a.o(bVar3.f11544a, bVar3.f11545b, bVar3.f11546c, bVar3.f11547d);
        this.f12220a.q(f15, f16, 0.0f);
        this.f12220a.o(bVar.f11544a, bVar.f11545b, bVar.f11546c, bVar.f11547d);
        this.f12220a.q(f11, f12, 0.0f);
    }

    public Matrix4 B0() {
        return this.f12223d;
    }

    public void B1() {
        this.f12221b = true;
    }

    public void C0(float f11, float f12, float f13, float f14, float f15) {
        J0(f11, f12, f13, f14, f15, Math.max(1, (int) (((float) Math.cbrt(Math.max(f13 * 0.5f, 0.5f * f14))) * 12.0f)));
    }

    public void C1(float f11, float f12, float f13) {
        float f14 = f11 - f13;
        float f15 = f12 - f13;
        float f16 = f11 + f13;
        float f17 = f12 + f13;
        c1(f14, f15, f16, f17);
        c1(f14, f17, f16, f15);
    }

    public void D(float f11, float f12, float f13, float f14, float f15, float f16) {
        float f17 = -f16;
        float L = this.f12226g.L();
        ShapeType shapeType = this.f12227h;
        ShapeType shapeType2 = ShapeType.Line;
        if (shapeType == shapeType2) {
            I(shapeType2, ShapeType.Filled, 24);
            this.f12220a.n(L);
            this.f12220a.q(f11, f12, f13);
            this.f12220a.n(L);
            float f18 = f14 + f11;
            this.f12220a.q(f18, f12, f13);
            this.f12220a.n(L);
            this.f12220a.q(f18, f12, f13);
            this.f12220a.n(L);
            float f19 = f17 + f13;
            this.f12220a.q(f18, f12, f19);
            this.f12220a.n(L);
            this.f12220a.q(f18, f12, f19);
            this.f12220a.n(L);
            this.f12220a.q(f11, f12, f19);
            this.f12220a.n(L);
            this.f12220a.q(f11, f12, f19);
            this.f12220a.n(L);
            this.f12220a.q(f11, f12, f13);
            this.f12220a.n(L);
            this.f12220a.q(f11, f12, f13);
            this.f12220a.n(L);
            float f21 = f15 + f12;
            this.f12220a.q(f11, f21, f13);
            this.f12220a.n(L);
            this.f12220a.q(f11, f21, f13);
            this.f12220a.n(L);
            this.f12220a.q(f18, f21, f13);
            this.f12220a.n(L);
            this.f12220a.q(f18, f21, f13);
            this.f12220a.n(L);
            this.f12220a.q(f18, f21, f19);
            this.f12220a.n(L);
            this.f12220a.q(f18, f21, f19);
            this.f12220a.n(L);
            this.f12220a.q(f11, f21, f19);
            this.f12220a.n(L);
            this.f12220a.q(f11, f21, f19);
            this.f12220a.n(L);
            this.f12220a.q(f11, f21, f13);
            this.f12220a.n(L);
            this.f12220a.q(f18, f12, f13);
            this.f12220a.n(L);
            this.f12220a.q(f18, f21, f13);
            this.f12220a.n(L);
            this.f12220a.q(f18, f12, f19);
            this.f12220a.n(L);
            this.f12220a.q(f18, f21, f19);
            this.f12220a.n(L);
            this.f12220a.q(f11, f12, f19);
            this.f12220a.n(L);
            this.f12220a.q(f11, f21, f19);
            return;
        }
        I(shapeType2, ShapeType.Filled, 36);
        this.f12220a.n(L);
        this.f12220a.q(f11, f12, f13);
        this.f12220a.n(L);
        float f22 = f14 + f11;
        this.f12220a.q(f22, f12, f13);
        this.f12220a.n(L);
        float f23 = f15 + f12;
        this.f12220a.q(f22, f23, f13);
        this.f12220a.n(L);
        this.f12220a.q(f11, f12, f13);
        this.f12220a.n(L);
        this.f12220a.q(f22, f23, f13);
        this.f12220a.n(L);
        this.f12220a.q(f11, f23, f13);
        this.f12220a.n(L);
        float f24 = f17 + f13;
        this.f12220a.q(f22, f12, f24);
        this.f12220a.n(L);
        this.f12220a.q(f11, f12, f24);
        this.f12220a.n(L);
        this.f12220a.q(f22, f23, f24);
        this.f12220a.n(L);
        this.f12220a.q(f22, f23, f24);
        this.f12220a.n(L);
        this.f12220a.q(f11, f12, f24);
        this.f12220a.n(L);
        this.f12220a.q(f11, f23, f24);
        this.f12220a.n(L);
        this.f12220a.q(f11, f12, f24);
        this.f12220a.n(L);
        this.f12220a.q(f11, f12, f13);
        this.f12220a.n(L);
        this.f12220a.q(f11, f23, f13);
        this.f12220a.n(L);
        this.f12220a.q(f11, f12, f24);
        this.f12220a.n(L);
        this.f12220a.q(f11, f23, f13);
        this.f12220a.n(L);
        this.f12220a.q(f11, f23, f24);
        this.f12220a.n(L);
        this.f12220a.q(f22, f12, f13);
        this.f12220a.n(L);
        this.f12220a.q(f22, f12, f24);
        this.f12220a.n(L);
        this.f12220a.q(f22, f23, f24);
        this.f12220a.n(L);
        this.f12220a.q(f22, f12, f13);
        this.f12220a.n(L);
        this.f12220a.q(f22, f23, f24);
        this.f12220a.n(L);
        this.f12220a.q(f22, f23, f13);
        this.f12220a.n(L);
        this.f12220a.q(f11, f23, f13);
        this.f12220a.n(L);
        this.f12220a.q(f22, f23, f13);
        this.f12220a.n(L);
        this.f12220a.q(f22, f23, f24);
        this.f12220a.n(L);
        this.f12220a.q(f11, f23, f13);
        this.f12220a.n(L);
        this.f12220a.q(f22, f23, f24);
        this.f12220a.n(L);
        this.f12220a.q(f11, f23, f24);
        this.f12220a.n(L);
        this.f12220a.q(f11, f12, f24);
        this.f12220a.n(L);
        this.f12220a.q(f22, f12, f24);
        this.f12220a.n(L);
        this.f12220a.q(f22, f12, f13);
        this.f12220a.n(L);
        this.f12220a.q(f11, f12, f24);
        this.f12220a.n(L);
        this.f12220a.q(f22, f12, f13);
        this.f12220a.n(L);
        this.f12220a.q(f11, f12, f13);
    }

    public void D1(Vector2 vector2, float f11) {
        C1(vector2.f12535x, vector2.f12536y, f11);
    }

    public final void I(ShapeType shapeType, ShapeType shapeType2, int i11) {
        ShapeType shapeType3 = this.f12227h;
        if (shapeType3 == null) {
            throw new IllegalStateException("begin must be called first.");
        }
        if (shapeType3 == shapeType || shapeType3 == shapeType2) {
            if (this.f12221b) {
                end();
                z(shapeType3);
                return;
            } else {
                if (this.f12220a.s() - this.f12220a.m() < i11) {
                    ShapeType shapeType4 = this.f12227h;
                    end();
                    z(shapeType4);
                    return;
                }
                return;
            }
        }
        if (this.f12228i) {
            end();
            z(shapeType);
            return;
        }
        if (shapeType2 == null) {
            throw new IllegalStateException("Must call begin(ShapeType." + shapeType + ").");
        }
        throw new IllegalStateException("Must call begin(ShapeType." + shapeType + ") or begin(ShapeType." + shapeType2 + ").");
    }

    public void J0(float f11, float f12, float f13, float f14, float f15, int i11) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("segments must be > 0.");
        }
        ShapeType shapeType = ShapeType.Line;
        I(shapeType, ShapeType.Filled, i11 * 3);
        float L = this.f12226g.L();
        float f16 = 6.2831855f / i11;
        float f17 = (3.1415927f * f15) / 180.0f;
        float Z = n.Z(f17);
        float s11 = n.s(f17);
        float f18 = f11 + (f13 / 2.0f);
        float f19 = f12 + (f14 / 2.0f);
        float f21 = 0.5f;
        float f22 = f13 * 0.5f;
        int i12 = 0;
        if (this.f12227h == shapeType) {
            float f23 = f22;
            float f24 = 0.0f;
            while (i12 < i11) {
                this.f12220a.n(L);
                this.f12220a.q(((s11 * f23) + f18) - (Z * f24), (f23 * Z) + f19 + (f24 * s11), 0.0f);
                i12++;
                float f25 = i12 * f16;
                float s12 = n.s(f25) * f22;
                float Z2 = n.Z(f25) * f14 * f21;
                this.f12220a.n(L);
                this.f12220a.q(((s11 * s12) + f18) - (Z * Z2), f19 + (Z * s12) + (s11 * Z2), 0.0f);
                f24 = Z2;
                f23 = s12;
                f21 = f21;
            }
            return;
        }
        float f26 = f22;
        float f27 = 0.0f;
        while (i12 < i11) {
            this.f12220a.n(L);
            this.f12220a.q(((s11 * f26) + f18) - (Z * f27), (f26 * Z) + f19 + (f27 * s11), 0.0f);
            this.f12220a.n(L);
            this.f12220a.q(f18, f19, 0.0f);
            i12++;
            float f28 = i12 * f16;
            float s13 = n.s(f28) * f22;
            float Z3 = n.Z(f28) * f14 * 0.5f;
            this.f12220a.n(L);
            this.f12220a.q(((s11 * s13) + f18) - (Z * Z3), (Z * s13) + f19 + (s11 * Z3), 0.0f);
            f27 = Z3;
            f26 = s13;
        }
    }

    public void Q0(float f11, float f12, float f13, float f14, int i11) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("segments must be > 0.");
        }
        ShapeType shapeType = ShapeType.Line;
        I(shapeType, ShapeType.Filled, i11 * 3);
        float L = this.f12226g.L();
        float f15 = 6.2831855f / i11;
        float f16 = f11 + (f13 / 2.0f);
        float f17 = f12 + (f14 / 2.0f);
        int i12 = 0;
        if (this.f12227h == shapeType) {
            while (i12 < i11) {
                this.f12220a.n(L);
                float f18 = f13 * 0.5f;
                float f19 = i12 * f15;
                float f21 = f14 * 0.5f;
                this.f12220a.q((n.s(f19) * f18) + f16, (n.Z(f19) * f21) + f17, 0.0f);
                this.f12220a.n(L);
                i12++;
                float f22 = i12 * f15;
                this.f12220a.q((f18 * n.s(f22)) + f16, (f21 * n.Z(f22)) + f17, 0.0f);
            }
            return;
        }
        while (i12 < i11) {
            this.f12220a.n(L);
            float f23 = f13 * 0.5f;
            float f24 = i12 * f15;
            float f25 = f14 * 0.5f;
            this.f12220a.q((n.s(f24) * f23) + f16, (n.Z(f24) * f25) + f17, 0.0f);
            this.f12220a.n(L);
            this.f12220a.q(f16, f17, 0.0f);
            this.f12220a.n(L);
            i12++;
            float f26 = i12 * f15;
            this.f12220a.q((f23 * n.s(f26)) + f16, (f25 * n.Z(f26)) + f17, 0.0f);
        }
    }

    public void R(float f11, float f12, float f13) {
        X(f11, f12, f13, Math.max(1, (int) (((float) Math.cbrt(f13)) * 6.0f)));
    }

    public void R0(Matrix4 matrix4) {
        this.f12223d.set(matrix4);
        this.f12221b = true;
    }

    public ShapeType V0() {
        return this.f12227h;
    }

    public void X(float f11, float f12, float f13, int i11) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("segments must be > 0.");
        }
        float L = this.f12226g.L();
        float f14 = 6.2831855f / i11;
        float s11 = n.s(f14);
        float Z = n.Z(f14);
        ShapeType shapeType = this.f12227h;
        ShapeType shapeType2 = ShapeType.Line;
        int i12 = 0;
        if (shapeType == shapeType2) {
            I(shapeType2, ShapeType.Filled, (i11 * 2) + 2);
            float f15 = f13;
            float f16 = 0.0f;
            while (i12 < i11) {
                this.f12220a.n(L);
                this.f12220a.q(f11 + f15, f12 + f16, 0.0f);
                float f17 = (s11 * f15) - (Z * f16);
                f16 = (f16 * s11) + (f15 * Z);
                this.f12220a.n(L);
                this.f12220a.q(f11 + f17, f12 + f16, 0.0f);
                i12++;
                f15 = f17;
            }
            this.f12220a.n(L);
            this.f12220a.q(f15 + f11, f16 + f12, 0.0f);
        } else {
            I(shapeType2, ShapeType.Filled, (i11 * 3) + 3);
            int i13 = i11 - 1;
            float f18 = f13;
            float f19 = 0.0f;
            while (i12 < i13) {
                this.f12220a.n(L);
                this.f12220a.q(f11, f12, 0.0f);
                this.f12220a.n(L);
                this.f12220a.q(f11 + f18, f12 + f19, 0.0f);
                float f21 = (s11 * f18) - (Z * f19);
                f19 = (f19 * s11) + (f18 * Z);
                this.f12220a.n(L);
                this.f12220a.q(f11 + f21, f12 + f19, 0.0f);
                i12++;
                f18 = f21;
            }
            this.f12220a.n(L);
            this.f12220a.q(f11, f12, 0.0f);
            this.f12220a.n(L);
            this.f12220a.q(f18 + f11, f19 + f12, 0.0f);
        }
        this.f12220a.n(L);
        this.f12220a.q(f11 + f13, f12 + 0.0f, 0.0f);
    }

    public void Z(float f11, float f12, float f13, float f14, float f15) {
        i0(f11, f12, f13, f14, f15, Math.max(1, (int) (((float) Math.sqrt(f14)) * 4.0f)));
    }

    public void Z0(Matrix4 matrix4) {
        this.f12222c.set(matrix4);
        this.f12221b = true;
    }

    public l a1() {
        return this.f12220a;
    }

    public void b(float f11, float f12, float f13, float f14, float f15) {
        o(f11, f12, f13, f14, f15, Math.max(1, (int) (((float) Math.cbrt(f13)) * 6.0f * (f15 / 360.0f))));
    }

    public void b1() {
        this.f12223d.idt();
        this.f12221b = true;
    }

    public void c() {
        if (!this.f12228i) {
            throw new IllegalStateException("autoShapeType must be true to use this method.");
        }
        z(ShapeType.Line);
    }

    public final void c1(float f11, float f12, float f13, float f14) {
        com.badlogic.gdx.graphics.b bVar = this.f12226g;
        e1(f11, f12, 0.0f, f13, f14, 0.0f, bVar, bVar);
    }

    public final void d1(float f11, float f12, float f13, float f14, float f15, float f16) {
        com.badlogic.gdx.graphics.b bVar = this.f12226g;
        e1(f11, f12, f13, f14, f15, f16, bVar, bVar);
    }

    @Override // a3.q
    public void dispose() {
        this.f12220a.dispose();
    }

    public com.badlogic.gdx.graphics.b e() {
        return this.f12226g;
    }

    public boolean e0() {
        return this.f12227h != null;
    }

    public void e1(float f11, float f12, float f13, float f14, float f15, float f16, com.badlogic.gdx.graphics.b bVar, com.badlogic.gdx.graphics.b bVar2) {
        if (this.f12227h == ShapeType.Filled) {
            s1(f11, f12, f14, f15, this.f12229j, bVar, bVar2);
            return;
        }
        I(ShapeType.Line, null, 2);
        this.f12220a.o(bVar.f11544a, bVar.f11545b, bVar.f11546c, bVar.f11547d);
        this.f12220a.q(f11, f12, f13);
        this.f12220a.o(bVar2.f11544a, bVar2.f11545b, bVar2.f11546c, bVar2.f11547d);
        this.f12220a.q(f14, f15, f16);
    }

    public void end() {
        this.f12220a.end();
        this.f12227h = null;
    }

    public final void f1(float f11, float f12, float f13, float f14, com.badlogic.gdx.graphics.b bVar, com.badlogic.gdx.graphics.b bVar2) {
        e1(f11, f12, 0.0f, f13, f14, 0.0f, bVar, bVar2);
    }

    public void flush() {
        ShapeType shapeType = this.f12227h;
        if (shapeType == null) {
            return;
        }
        end();
        z(shapeType);
    }

    public final void g1(Vector2 vector2, Vector2 vector22) {
        float f11 = vector2.f12535x;
        float f12 = vector2.f12536y;
        float f13 = vector22.f12535x;
        float f14 = vector22.f12536y;
        com.badlogic.gdx.graphics.b bVar = this.f12226g;
        e1(f11, f12, 0.0f, f13, f14, 0.0f, bVar, bVar);
    }

    public void h(com.badlogic.gdx.graphics.b bVar) {
        this.f12226g.H(bVar);
    }

    public final void h1(Vector3 vector3, Vector3 vector32) {
        float f11 = vector3.f12537x;
        float f12 = vector3.f12538y;
        float f13 = vector3.f12539z;
        float f14 = vector32.f12537x;
        float f15 = vector32.f12538y;
        float f16 = vector32.f12539z;
        com.badlogic.gdx.graphics.b bVar = this.f12226g;
        e1(f11, f12, f13, f14, f15, f16, bVar, bVar);
    }

    public void i0(float f11, float f12, float f13, float f14, float f15, int i11) {
        float f16;
        float f17;
        float f18;
        if (i11 <= 0) {
            throw new IllegalArgumentException("segments must be > 0.");
        }
        ShapeType shapeType = ShapeType.Line;
        I(shapeType, ShapeType.Filled, (i11 * 4) + 2);
        float L = this.f12226g.L();
        float f19 = 6.2831855f / i11;
        float s11 = n.s(f19);
        float Z = n.Z(f19);
        int i12 = 0;
        if (this.f12227h == shapeType) {
            f16 = f14;
            f17 = 0.0f;
            while (i12 < i11) {
                this.f12220a.n(L);
                float f21 = f11 + f16;
                float f22 = f12 + f17;
                this.f12220a.q(f21, f22, f13);
                this.f12220a.n(L);
                this.f12220a.q(f11, f12, f13 + f15);
                this.f12220a.n(L);
                this.f12220a.q(f21, f22, f13);
                float f23 = (s11 * f16) - (Z * f17);
                f17 = (f17 * s11) + (f16 * Z);
                this.f12220a.n(L);
                this.f12220a.q(f11 + f23, f12 + f17, f13);
                i12++;
                f16 = f23;
            }
            this.f12220a.n(L);
            this.f12220a.q(f11 + f16, f12 + f17, f13);
            f18 = 0.0f;
        } else {
            int i13 = i11 - 1;
            f16 = f14;
            f17 = 0.0f;
            while (i12 < i13) {
                this.f12220a.n(L);
                this.f12220a.q(f11, f12, f13);
                this.f12220a.n(L);
                float f24 = f11 + f16;
                float f25 = f12 + f17;
                this.f12220a.q(f24, f25, f13);
                float f26 = (s11 * f16) - (Z * f17);
                f17 = (f17 * s11) + (f16 * Z);
                this.f12220a.n(L);
                float f27 = f11 + f26;
                float f28 = f12 + f17;
                this.f12220a.q(f27, f28, f13);
                this.f12220a.n(L);
                this.f12220a.q(f24, f25, f13);
                this.f12220a.n(L);
                this.f12220a.q(f27, f28, f13);
                this.f12220a.n(L);
                this.f12220a.q(f11, f12, f13 + f15);
                i12++;
                f16 = f26;
            }
            f18 = 0.0f;
            this.f12220a.n(L);
            this.f12220a.q(f11, f12, f13);
            this.f12220a.n(L);
            this.f12220a.q(f11 + f16, f12 + f17, f13);
        }
        this.f12220a.n(L);
        float f29 = f11 + f14;
        float f31 = f12 + f18;
        this.f12220a.q(f29, f31, f13);
        if (this.f12227h != ShapeType.Line) {
            this.f12220a.n(L);
            this.f12220a.q(f16 + f11, f17 + f12, f13);
            this.f12220a.n(L);
            this.f12220a.q(f29, f31, f13);
            this.f12220a.n(L);
            this.f12220a.q(f11, f12, f13 + f15);
        }
    }

    public void i1(float f11, float f12, float f13) {
        ShapeType shapeType = this.f12227h;
        if (shapeType == ShapeType.Line) {
            float f14 = this.f12229j * 0.5f;
            d1(f11 - f14, f12 - f14, f13, f11 + f14, f12 + f14, f13);
        } else if (shapeType == ShapeType.Filled) {
            float f15 = this.f12229j;
            float f16 = 0.5f * f15;
            D(f11 - f16, f12 - f16, f13 - f16, f15, f15, f15);
        } else {
            I(ShapeType.Point, null, 1);
            this.f12220a.p(this.f12226g);
            this.f12220a.q(f11, f12, f13);
        }
    }

    public void j1(float[] fArr) {
        k1(fArr, 0, fArr.length);
    }

    public void k(float f11, float f12, float f13, float f14) {
        this.f12226g.F(f11, f12, f13, f14);
    }

    public void k1(float[] fArr, int i11, int i12) {
        float f11;
        float f12;
        if (i12 < 6) {
            throw new IllegalArgumentException("Polygons must contain at least 3 points.");
        }
        if (i12 % 2 != 0) {
            throw new IllegalArgumentException("Polygons must have an even number of vertices.");
        }
        I(ShapeType.Line, null, i12);
        float L = this.f12226g.L();
        float f13 = fArr[0];
        float f14 = fArr[1];
        int i13 = i11 + i12;
        while (i11 < i13) {
            float f15 = fArr[i11];
            float f16 = fArr[i11 + 1];
            int i14 = i11 + 2;
            if (i14 >= i12) {
                f11 = f13;
                f12 = f14;
            } else {
                f11 = fArr[i14];
                f12 = fArr[i11 + 3];
            }
            this.f12220a.n(L);
            this.f12220a.q(f15, f16, 0.0f);
            this.f12220a.n(L);
            this.f12220a.q(f11, f12, 0.0f);
            i11 = i14;
        }
    }

    public void l1(float[] fArr) {
        m1(fArr, 0, fArr.length);
    }

    public void m1(float[] fArr, int i11, int i12) {
        if (i12 < 4) {
            throw new IllegalArgumentException("Polylines must contain at least 2 points.");
        }
        if (i12 % 2 != 0) {
            throw new IllegalArgumentException("Polylines must have an even number of vertices.");
        }
        I(ShapeType.Line, null, i12);
        float L = this.f12226g.L();
        int i13 = (i12 + i11) - 2;
        while (i11 < i13) {
            float f11 = fArr[i11];
            float f12 = fArr[i11 + 1];
            int i14 = i11 + 2;
            float f13 = fArr[i14];
            float f14 = fArr[i11 + 3];
            this.f12220a.n(L);
            this.f12220a.q(f11, f12, 0.0f);
            this.f12220a.n(L);
            this.f12220a.q(f13, f14, 0.0f);
            i11 = i14;
        }
    }

    public void n0(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, int i11) {
        I(ShapeType.Line, null, (i11 * 2) + 2);
        float L = this.f12226g.L();
        float f19 = 1.0f / i11;
        float f21 = f19 * f19;
        float f22 = f21 * f19;
        float f23 = f19 * 3.0f;
        float f24 = f21 * 3.0f;
        float f25 = f21 * 6.0f;
        float f26 = 6.0f * f22;
        float f27 = (f11 - (f13 * 2.0f)) + f15;
        float f28 = (f12 - (2.0f * f14)) + f16;
        float f29 = (((f13 - f15) * 3.0f) - f11) + f17;
        float f31 = (((f14 - f16) * 3.0f) - f12) + f18;
        float f32 = ((f13 - f11) * f23) + (f27 * f24) + (f29 * f22);
        float f33 = ((f14 - f12) * f23) + (f24 * f28) + (f22 * f31);
        float f34 = f29 * f26;
        float f35 = (f27 * f25) + f34;
        float f36 = f31 * f26;
        float f37 = (f28 * f25) + f36;
        float f38 = f12;
        int i12 = i11;
        float f39 = f11;
        while (true) {
            int i13 = i12 - 1;
            if (i12 <= 0) {
                this.f12220a.n(L);
                this.f12220a.q(f39, f38, 0.0f);
                this.f12220a.n(L);
                this.f12220a.q(f17, f18, 0.0f);
                return;
            }
            this.f12220a.n(L);
            this.f12220a.q(f39, f38, 0.0f);
            f39 += f32;
            f38 += f33;
            f32 += f35;
            f33 += f37;
            f35 += f34;
            f37 += f36;
            this.f12220a.n(L);
            this.f12220a.q(f39, f38, 0.0f);
            i12 = i13;
        }
    }

    public void n1(float f11, float f12, float f13, float f14) {
        ShapeType shapeType = ShapeType.Line;
        I(shapeType, ShapeType.Filled, 8);
        float L = this.f12226g.L();
        if (this.f12227h != shapeType) {
            this.f12220a.n(L);
            this.f12220a.q(f11, f12, 0.0f);
            this.f12220a.n(L);
            float f15 = f13 + f11;
            this.f12220a.q(f15, f12, 0.0f);
            this.f12220a.n(L);
            float f16 = f14 + f12;
            this.f12220a.q(f15, f16, 0.0f);
            this.f12220a.n(L);
            this.f12220a.q(f15, f16, 0.0f);
            this.f12220a.n(L);
            this.f12220a.q(f11, f16, 0.0f);
            this.f12220a.n(L);
            this.f12220a.q(f11, f12, 0.0f);
            return;
        }
        this.f12220a.n(L);
        this.f12220a.q(f11, f12, 0.0f);
        this.f12220a.n(L);
        float f17 = f13 + f11;
        this.f12220a.q(f17, f12, 0.0f);
        this.f12220a.n(L);
        this.f12220a.q(f17, f12, 0.0f);
        this.f12220a.n(L);
        float f18 = f14 + f12;
        this.f12220a.q(f17, f18, 0.0f);
        this.f12220a.n(L);
        this.f12220a.q(f17, f18, 0.0f);
        this.f12220a.n(L);
        this.f12220a.q(f11, f18, 0.0f);
        this.f12220a.n(L);
        this.f12220a.q(f11, f18, 0.0f);
        this.f12220a.n(L);
        this.f12220a.q(f11, f12, 0.0f);
    }

    public void o(float f11, float f12, float f13, float f14, float f15, int i11) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("segments must be > 0.");
        }
        float L = this.f12226g.L();
        float f16 = ((f15 / 360.0f) * 6.2831855f) / i11;
        float s11 = n.s(f16);
        float Z = n.Z(f16);
        float f17 = f14 * 0.017453292f;
        float s12 = n.s(f17) * f13;
        float Z2 = f13 * n.Z(f17);
        ShapeType shapeType = this.f12227h;
        ShapeType shapeType2 = ShapeType.Line;
        int i12 = 0;
        if (shapeType == shapeType2) {
            I(shapeType2, ShapeType.Filled, (i11 * 2) + 2);
            this.f12220a.n(L);
            this.f12220a.q(f11, f12, 0.0f);
            this.f12220a.n(L);
            this.f12220a.q(f11 + s12, f12 + Z2, 0.0f);
            while (i12 < i11) {
                this.f12220a.n(L);
                this.f12220a.q(f11 + s12, f12 + Z2, 0.0f);
                float f18 = (s11 * s12) - (Z * Z2);
                Z2 = (Z2 * s11) + (s12 * Z);
                this.f12220a.n(L);
                this.f12220a.q(f11 + f18, f12 + Z2, 0.0f);
                i12++;
                s12 = f18;
            }
            this.f12220a.n(L);
            this.f12220a.q(s12 + f11, Z2 + f12, 0.0f);
        } else {
            I(shapeType2, ShapeType.Filled, (i11 * 3) + 3);
            while (i12 < i11) {
                this.f12220a.n(L);
                this.f12220a.q(f11, f12, 0.0f);
                this.f12220a.n(L);
                this.f12220a.q(f11 + s12, f12 + Z2, 0.0f);
                float f19 = (s11 * s12) - (Z * Z2);
                Z2 = (Z2 * s11) + (s12 * Z);
                this.f12220a.n(L);
                this.f12220a.q(f11 + f19, f12 + Z2, 0.0f);
                i12++;
                s12 = f19;
            }
            this.f12220a.n(L);
            this.f12220a.q(f11, f12, 0.0f);
            this.f12220a.n(L);
            this.f12220a.q(s12 + f11, Z2 + f12, 0.0f);
        }
        this.f12220a.n(L);
        this.f12220a.q(f11 + 0.0f, f12 + 0.0f, 0.0f);
    }

    public void o1(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        com.badlogic.gdx.graphics.b bVar = this.f12226g;
        p1(f11, f12, f13, f14, f15, f16, f17, f18, f19, bVar, bVar, bVar, bVar);
    }

    public void p1(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, com.badlogic.gdx.graphics.b bVar, com.badlogic.gdx.graphics.b bVar2, com.badlogic.gdx.graphics.b bVar3, com.badlogic.gdx.graphics.b bVar4) {
        ShapeType shapeType = ShapeType.Line;
        I(shapeType, ShapeType.Filled, 8);
        float t11 = n.t(f19);
        float a02 = n.a0(f19);
        float f21 = -f13;
        float f22 = -f14;
        float f23 = f15 - f13;
        float f24 = f16 - f14;
        if (f17 != 1.0f || f18 != 1.0f) {
            f21 *= f17;
            f22 *= f18;
            f23 *= f17;
            f24 *= f18;
        }
        float f25 = f11 + f13;
        float f26 = f12 + f14;
        float f27 = a02 * f22;
        float f28 = ((t11 * f21) - f27) + f25;
        float f29 = f22 * t11;
        float f31 = (f21 * a02) + f29 + f26;
        float f32 = t11 * f23;
        float f33 = (f32 - f27) + f25;
        float f34 = f23 * a02;
        float f35 = f29 + f34 + f26;
        float f36 = (f32 - (a02 * f24)) + f25;
        float f37 = f34 + (t11 * f24) + f26;
        float f38 = (f36 - f33) + f28;
        float f39 = f37 - (f35 - f31);
        if (this.f12227h != shapeType) {
            this.f12220a.o(bVar.f11544a, bVar.f11545b, bVar.f11546c, bVar.f11547d);
            this.f12220a.q(f28, f31, 0.0f);
            this.f12220a.o(bVar2.f11544a, bVar2.f11545b, bVar2.f11546c, bVar2.f11547d);
            this.f12220a.q(f33, f35, 0.0f);
            this.f12220a.o(bVar3.f11544a, bVar3.f11545b, bVar3.f11546c, bVar3.f11547d);
            this.f12220a.q(f36, f37, 0.0f);
            this.f12220a.o(bVar3.f11544a, bVar3.f11545b, bVar3.f11546c, bVar3.f11547d);
            this.f12220a.q(f36, f37, 0.0f);
            this.f12220a.o(bVar4.f11544a, bVar4.f11545b, bVar4.f11546c, bVar4.f11547d);
            this.f12220a.q(f38, f39, 0.0f);
            this.f12220a.o(bVar.f11544a, bVar.f11545b, bVar.f11546c, bVar.f11547d);
            this.f12220a.q(f28, f31, 0.0f);
            return;
        }
        this.f12220a.o(bVar.f11544a, bVar.f11545b, bVar.f11546c, bVar.f11547d);
        this.f12220a.q(f28, f31, 0.0f);
        this.f12220a.o(bVar2.f11544a, bVar2.f11545b, bVar2.f11546c, bVar2.f11547d);
        this.f12220a.q(f33, f35, 0.0f);
        this.f12220a.o(bVar2.f11544a, bVar2.f11545b, bVar2.f11546c, bVar2.f11547d);
        this.f12220a.q(f33, f35, 0.0f);
        this.f12220a.o(bVar3.f11544a, bVar3.f11545b, bVar3.f11546c, bVar3.f11547d);
        this.f12220a.q(f36, f37, 0.0f);
        this.f12220a.o(bVar3.f11544a, bVar3.f11545b, bVar3.f11546c, bVar3.f11547d);
        this.f12220a.q(f36, f37, 0.0f);
        this.f12220a.o(bVar4.f11544a, bVar4.f11545b, bVar4.f11546c, bVar4.f11547d);
        this.f12220a.q(f38, f39, 0.0f);
        this.f12220a.o(bVar4.f11544a, bVar4.f11545b, bVar4.f11546c, bVar4.f11547d);
        this.f12220a.q(f38, f39, 0.0f);
        this.f12220a.o(bVar.f11544a, bVar.f11545b, bVar.f11546c, bVar.f11547d);
        this.f12220a.q(f28, f31, 0.0f);
    }

    public void q1(float f11, float f12, float f13, float f14, com.badlogic.gdx.graphics.b bVar, com.badlogic.gdx.graphics.b bVar2, com.badlogic.gdx.graphics.b bVar3, com.badlogic.gdx.graphics.b bVar4) {
        ShapeType shapeType = ShapeType.Line;
        I(shapeType, ShapeType.Filled, 8);
        if (this.f12227h != shapeType) {
            this.f12220a.o(bVar.f11544a, bVar.f11545b, bVar.f11546c, bVar.f11547d);
            this.f12220a.q(f11, f12, 0.0f);
            this.f12220a.o(bVar2.f11544a, bVar2.f11545b, bVar2.f11546c, bVar2.f11547d);
            float f15 = f13 + f11;
            this.f12220a.q(f15, f12, 0.0f);
            this.f12220a.o(bVar3.f11544a, bVar3.f11545b, bVar3.f11546c, bVar3.f11547d);
            float f16 = f14 + f12;
            this.f12220a.q(f15, f16, 0.0f);
            this.f12220a.o(bVar3.f11544a, bVar3.f11545b, bVar3.f11546c, bVar3.f11547d);
            this.f12220a.q(f15, f16, 0.0f);
            this.f12220a.o(bVar4.f11544a, bVar4.f11545b, bVar4.f11546c, bVar4.f11547d);
            this.f12220a.q(f11, f16, 0.0f);
            this.f12220a.o(bVar.f11544a, bVar.f11545b, bVar.f11546c, bVar.f11547d);
            this.f12220a.q(f11, f12, 0.0f);
            return;
        }
        this.f12220a.o(bVar.f11544a, bVar.f11545b, bVar.f11546c, bVar.f11547d);
        this.f12220a.q(f11, f12, 0.0f);
        this.f12220a.o(bVar2.f11544a, bVar2.f11545b, bVar2.f11546c, bVar2.f11547d);
        float f17 = f13 + f11;
        this.f12220a.q(f17, f12, 0.0f);
        this.f12220a.o(bVar2.f11544a, bVar2.f11545b, bVar2.f11546c, bVar2.f11547d);
        this.f12220a.q(f17, f12, 0.0f);
        this.f12220a.o(bVar3.f11544a, bVar3.f11545b, bVar3.f11546c, bVar3.f11547d);
        float f18 = f14 + f12;
        this.f12220a.q(f17, f18, 0.0f);
        this.f12220a.o(bVar3.f11544a, bVar3.f11545b, bVar3.f11546c, bVar3.f11547d);
        this.f12220a.q(f17, f18, 0.0f);
        this.f12220a.o(bVar4.f11544a, bVar4.f11545b, bVar4.f11546c, bVar4.f11547d);
        this.f12220a.q(f11, f18, 0.0f);
        this.f12220a.o(bVar4.f11544a, bVar4.f11545b, bVar4.f11546c, bVar4.f11547d);
        this.f12220a.q(f11, f18, 0.0f);
        this.f12220a.o(bVar.f11544a, bVar.f11545b, bVar.f11546c, bVar.f11547d);
        this.f12220a.q(f11, f12, 0.0f);
    }

    public void r1(float f11, float f12, float f13, float f14, float f15) {
        ShapeType shapeType = ShapeType.Line;
        I(shapeType, ShapeType.Filled, 8);
        float L = this.f12226g.L();
        Vector2 nor = this.f12225f.set(f14 - f12, f11 - f13).nor();
        float f16 = f15 * 0.5f;
        float f17 = nor.f12535x * f16;
        float f18 = nor.f12536y * f16;
        if (this.f12227h != shapeType) {
            this.f12220a.n(L);
            this.f12220a.q(f11 + f17, f12 + f18, 0.0f);
            this.f12220a.n(L);
            float f19 = f11 - f17;
            float f21 = f12 - f18;
            this.f12220a.q(f19, f21, 0.0f);
            this.f12220a.n(L);
            float f22 = f13 + f17;
            float f23 = f14 + f18;
            this.f12220a.q(f22, f23, 0.0f);
            this.f12220a.n(L);
            this.f12220a.q(f13 - f17, f14 - f18, 0.0f);
            this.f12220a.n(L);
            this.f12220a.q(f22, f23, 0.0f);
            this.f12220a.n(L);
            this.f12220a.q(f19, f21, 0.0f);
            return;
        }
        this.f12220a.n(L);
        float f24 = f11 + f17;
        float f25 = f12 + f18;
        this.f12220a.q(f24, f25, 0.0f);
        this.f12220a.n(L);
        float f26 = f11 - f17;
        float f27 = f12 - f18;
        this.f12220a.q(f26, f27, 0.0f);
        this.f12220a.n(L);
        float f28 = f13 + f17;
        float f29 = f14 + f18;
        this.f12220a.q(f28, f29, 0.0f);
        this.f12220a.n(L);
        float f31 = f13 - f17;
        float f32 = f14 - f18;
        this.f12220a.q(f31, f32, 0.0f);
        this.f12220a.n(L);
        this.f12220a.q(f28, f29, 0.0f);
        this.f12220a.n(L);
        this.f12220a.q(f24, f25, 0.0f);
        this.f12220a.n(L);
        this.f12220a.q(f31, f32, 0.0f);
        this.f12220a.n(L);
        this.f12220a.q(f26, f27, 0.0f);
    }

    public void s1(float f11, float f12, float f13, float f14, float f15, com.badlogic.gdx.graphics.b bVar, com.badlogic.gdx.graphics.b bVar2) {
        ShapeType shapeType = ShapeType.Line;
        I(shapeType, ShapeType.Filled, 8);
        float L = bVar.L();
        float L2 = bVar2.L();
        Vector2 nor = this.f12225f.set(f14 - f12, f11 - f13).nor();
        float f16 = f15 * 0.5f;
        float f17 = nor.f12535x * f16;
        float f18 = nor.f12536y * f16;
        if (this.f12227h != shapeType) {
            this.f12220a.n(L);
            this.f12220a.q(f11 + f17, f12 + f18, 0.0f);
            this.f12220a.n(L);
            float f19 = f11 - f17;
            float f21 = f12 - f18;
            this.f12220a.q(f19, f21, 0.0f);
            this.f12220a.n(L2);
            float f22 = f13 + f17;
            float f23 = f14 + f18;
            this.f12220a.q(f22, f23, 0.0f);
            this.f12220a.n(L2);
            this.f12220a.q(f13 - f17, f14 - f18, 0.0f);
            this.f12220a.n(L2);
            this.f12220a.q(f22, f23, 0.0f);
            this.f12220a.n(L);
            this.f12220a.q(f19, f21, 0.0f);
            return;
        }
        this.f12220a.n(L);
        float f24 = f11 + f17;
        float f25 = f12 + f18;
        this.f12220a.q(f24, f25, 0.0f);
        this.f12220a.n(L);
        float f26 = f11 - f17;
        float f27 = f12 - f18;
        this.f12220a.q(f26, f27, 0.0f);
        this.f12220a.n(L2);
        float f28 = f13 + f17;
        float f29 = f14 + f18;
        this.f12220a.q(f28, f29, 0.0f);
        this.f12220a.n(L2);
        float f31 = f13 - f17;
        float f32 = f14 - f18;
        this.f12220a.q(f31, f32, 0.0f);
        this.f12220a.n(L2);
        this.f12220a.q(f28, f29, 0.0f);
        this.f12220a.n(L);
        this.f12220a.q(f24, f25, 0.0f);
        this.f12220a.n(L2);
        this.f12220a.q(f31, f32, 0.0f);
        this.f12220a.n(L);
        this.f12220a.q(f26, f27, 0.0f);
    }

    public void t1(Vector2 vector2, Vector2 vector22, float f11) {
        r1(vector2.f12535x, vector2.f12536y, vector22.f12535x, vector22.f12536y, f11);
    }

    public void u1(float f11, float f12, float f13, float f14) {
        this.f12223d.rotate(f11, f12, f13, f14);
        this.f12221b = true;
    }

    public void v1(float f11, float f12, float f13) {
        this.f12223d.scale(f11, f12, f13);
        this.f12221b = true;
    }

    public void w0(float f11, float f12, float f13, float f14) {
        Q0(f11, f12, f13, f14, Math.max(1, (int) (((float) Math.cbrt(Math.max(f13 * 0.5f, 0.5f * f14))) * 12.0f)));
    }

    public void w1(ShapeType shapeType) {
        ShapeType shapeType2 = this.f12227h;
        if (shapeType2 == shapeType) {
            return;
        }
        if (shapeType2 == null) {
            throw new IllegalStateException("begin must be called first.");
        }
        if (!this.f12228i) {
            throw new IllegalStateException("autoShapeType must be enabled.");
        }
        end();
        z(shapeType);
    }

    public Matrix4 x0() {
        return this.f12222c;
    }

    public void x1(boolean z11) {
        this.f12228i = z11;
    }

    public void y1(float f11, float f12, float f13) {
        this.f12223d.translate(f11, f12, f13);
        this.f12221b = true;
    }

    public void z(ShapeType shapeType) {
        if (this.f12227h != null) {
            throw new IllegalStateException("Call end() before beginning a new shape batch.");
        }
        this.f12227h = shapeType;
        if (this.f12221b) {
            this.f12224e.set(this.f12222c);
            Matrix4.mul(this.f12224e.val, this.f12223d.val);
            this.f12221b = false;
        }
        this.f12220a.t(this.f12224e, this.f12227h.getGlType());
    }

    public void z1(float f11, float f12, float f13, float f14, float f15, float f16) {
        ShapeType shapeType = ShapeType.Line;
        I(shapeType, ShapeType.Filled, 6);
        float L = this.f12226g.L();
        if (this.f12227h != shapeType) {
            this.f12220a.n(L);
            this.f12220a.q(f11, f12, 0.0f);
            this.f12220a.n(L);
            this.f12220a.q(f13, f14, 0.0f);
            this.f12220a.n(L);
            this.f12220a.q(f15, f16, 0.0f);
            return;
        }
        this.f12220a.n(L);
        this.f12220a.q(f11, f12, 0.0f);
        this.f12220a.n(L);
        this.f12220a.q(f13, f14, 0.0f);
        this.f12220a.n(L);
        this.f12220a.q(f13, f14, 0.0f);
        this.f12220a.n(L);
        this.f12220a.q(f15, f16, 0.0f);
        this.f12220a.n(L);
        this.f12220a.q(f15, f16, 0.0f);
        this.f12220a.n(L);
        this.f12220a.q(f11, f12, 0.0f);
    }

    public ShapeRenderer(int i11) {
        this(i11, null);
    }

    public ShapeRenderer(int i11, w wVar) {
        this.f12221b = false;
        Matrix4 matrix4 = new Matrix4();
        this.f12222c = matrix4;
        this.f12223d = new Matrix4();
        this.f12224e = new Matrix4();
        this.f12225f = new Vector2();
        this.f12226g = new com.badlogic.gdx.graphics.b(1.0f, 1.0f, 1.0f, 1.0f);
        this.f12229j = 0.75f;
        if (wVar == null) {
            this.f12220a = new k(i11, false, true, 0);
        } else {
            this.f12220a = new k(i11, false, true, 0, wVar);
        }
        matrix4.setToOrtho2D(0.0f, 0.0f, g.f81379b.getWidth(), g.f81379b.getHeight());
        this.f12221b = true;
    }
}
