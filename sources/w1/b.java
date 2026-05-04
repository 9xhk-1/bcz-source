package w1;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Affine2;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.utils.GdxRuntimeException;
import n2.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b extends m {
    public final Matrix4 A;
    public final Affine2 B;
    public boolean C;
    public boolean D;
    public final Affine2 E;

    public b() {
        this(1000);
    }

    public static boolean D(Matrix4 matrix4, Affine2 affine2) {
        float[] values = matrix4.getValues();
        return values[0] == affine2.f12517m00 && values[1] == affine2.f12518m10 && values[4] == affine2.m01 && values[5] == affine2.m11 && values[12] == affine2.m02 && values[13] == affine2.m12;
    }

    public static boolean I(Matrix4 matrix4, Matrix4 matrix42) {
        if (matrix4 == matrix42) {
            return true;
        }
        float[] fArr = matrix4.val;
        float f11 = fArr[0];
        float[] fArr2 = matrix42.val;
        return f11 == fArr2[0] && fArr[1] == fArr2[1] && fArr[4] == fArr2[4] && fArr[5] == fArr2[5] && fArr[12] == fArr2[12] && fArr[13] == fArr2[13];
    }

    public static boolean R(Matrix4 matrix4) {
        float[] values = matrix4.getValues();
        return values[0] == 1.0f && values[1] == 0.0f && values[4] == 0.0f && values[5] == 1.0f && values[12] == 0.0f && values[13] == 0.0f;
    }

    @Override // w1.m, w1.a
    public Matrix4 B0() {
        return this.C ? this.A : super.B0();
    }

    public final void C0(Texture texture, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, float f22, float f23, float f24, boolean z11, boolean z12) {
        float f25;
        float f26;
        float f27;
        float f28;
        float f29;
        float f31;
        float f32;
        float f33;
        float f34;
        float f35;
        float f36;
        if (!this.f94572h) {
            throw new IllegalStateException("CpuSpriteBatch.begin must be called before draw.");
        }
        if (texture != this.f94569e) {
            z(texture);
        } else if (this.f94568d == this.f94567c.length) {
            super.flush();
        }
        float f37 = f11 + f13;
        float f38 = f12 + f14;
        float f39 = -f13;
        float f41 = -f14;
        float f42 = f15 - f13;
        float f43 = f16 - f14;
        if (f17 != 1.0f || f18 != 1.0f) {
            f39 *= f17;
            f41 *= f18;
            f42 *= f17;
            f43 *= f18;
        }
        if (f19 != 0.0f) {
            float t11 = com.badlogic.gdx.math.n.t(f19);
            float a02 = com.badlogic.gdx.math.n.a0(f19);
            float f44 = t11 * f39;
            f26 = f44 - (a02 * f41);
            float f45 = f39 * a02;
            float f46 = (f41 * t11) + f45;
            float f47 = a02 * f43;
            f25 = f44 - f47;
            float f48 = f43 * t11;
            f29 = f45 + f48;
            float f49 = (t11 * f42) - f47;
            float f51 = f48 + (a02 * f42);
            f28 = f51 - (f29 - f46);
            f32 = (f49 - f25) + f26;
            f42 = f49;
            f27 = f46;
            f31 = f51;
        } else {
            f25 = f39;
            f26 = f25;
            f27 = f41;
            f28 = f27;
            f29 = f43;
            f31 = f29;
            f32 = f42;
        }
        float f52 = f26 + f37;
        float f53 = f27 + f38;
        float f54 = f25 + f37;
        float f55 = f29 + f38;
        float f56 = f42 + f37;
        float f57 = f31 + f38;
        float f58 = f32 + f37;
        float f59 = f28 + f38;
        if (z11) {
            f34 = f21;
            f33 = f23;
        } else {
            f33 = f21;
            f34 = f23;
        }
        if (z12) {
            f36 = f22;
            f35 = f24;
        } else {
            f35 = f22;
            f36 = f24;
        }
        Affine2 affine2 = this.B;
        float[] fArr = this.f94567c;
        int i11 = this.f94568d;
        float f61 = affine2.f12517m00;
        float f62 = f61 * f52;
        float f63 = affine2.m01;
        float f64 = f62 + (f63 * f53);
        float f65 = affine2.m02;
        fArr[i11] = f64 + f65;
        float f66 = affine2.f12518m10;
        float f67 = f52 * f66;
        float f68 = affine2.m11;
        float f69 = f67 + (f53 * f68);
        float f71 = affine2.m12;
        fArr[i11 + 1] = f69 + f71;
        float f72 = this.f94585u;
        fArr[i11 + 2] = f72;
        fArr[i11 + 3] = f33;
        fArr[i11 + 4] = f35;
        fArr[i11 + 5] = (f61 * f54) + (f63 * f55) + f65;
        fArr[i11 + 6] = (f54 * f66) + (f55 * f68) + f71;
        fArr[i11 + 7] = f72;
        fArr[i11 + 8] = f33;
        fArr[i11 + 9] = f36;
        fArr[i11 + 10] = (f61 * f56) + (f63 * f57) + f65;
        fArr[i11 + 11] = (f66 * f56) + (f57 * f68) + f71;
        fArr[i11 + 12] = f72;
        fArr[i11 + 13] = f34;
        fArr[i11 + 14] = f36;
        fArr[i11 + 15] = (f61 * f58) + (f63 * f59) + f65;
        fArr[i11 + 16] = (f58 * f66) + (f68 * f59) + f71;
        fArr[i11 + 17] = f72;
        fArr[i11 + 18] = f34;
        fArr[i11 + 19] = f35;
        this.f94568d = i11 + 20;
    }

    public void J0() {
        flush();
        if (this.C) {
            boolean R = R(this.A);
            this.D = R;
            if (!R && this.A.det() == 0.0f) {
                throw new GdxRuntimeException("Transform matrix is singular, can't sync");
            }
            this.C = false;
            super.R0(this.A);
        }
    }

    @Override // w1.m, w1.a
    public void K(Texture texture, float f11, float f12, int i11, int i12, int i13, int i14) {
        if (this.C) {
            X(texture, f11, f12, 0.0f, 0.0f, i13, i14, 1.0f, 1.0f, 0.0f, i11, i12, i13, i14, false, false);
        } else {
            super.K(texture, f11, f12, i11, i12, i13, i14);
        }
    }

    @Override // w1.m, w1.a
    public void L(o oVar, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, boolean z11) {
        if (this.C) {
            n0(oVar, f11, f12, f13, f14, f15, f16, f17, f18, f19, z11);
        } else {
            super.L(oVar, f11, f12, f13, f14, f15, f16, f17, f18, f19, z11);
        }
    }

    @Override // w1.m, w1.a
    public void O0(o oVar, float f11, float f12, Affine2 affine2) {
        if (this.C) {
            w0(oVar, f11, f12, affine2);
        } else {
            super.O0(oVar, f11, f12, affine2);
        }
    }

    public void Q0(Affine2 affine2) {
        Matrix4 B0 = super.B0();
        if (D(B0, affine2)) {
            this.C = false;
            return;
        }
        this.A.setAsAffine(affine2);
        if (!e0()) {
            B0.setAsAffine(affine2);
            this.D = R(B0);
            return;
        }
        this.C = true;
        if (this.D) {
            this.B.set(affine2);
        } else {
            this.B.set(B0).inv().mul(affine2);
        }
    }

    @Override // w1.m, w1.a
    public void R0(Matrix4 matrix4) {
        Matrix4 B0 = super.B0();
        if (I(B0, matrix4)) {
            this.C = false;
            return;
        }
        if (!e0()) {
            B0.setAsAffine(matrix4);
            this.D = R(B0);
            return;
        }
        this.A.setAsAffine(matrix4);
        this.C = true;
        if (this.D) {
            this.B.set(matrix4);
        } else {
            this.E.set(matrix4);
            this.B.set(B0).inv().mul(this.E);
        }
    }

    @Override // w1.m, w1.a
    public void T0(Texture texture, float f11, float f12, float f13, float f14) {
        if (this.C) {
            X(texture, f11, f12, 0.0f, 0.0f, f13, f14, 1.0f, 1.0f, 0.0f, 0, 1, 1, 0, false, false);
        } else {
            super.T0(texture, f11, f12, f13, f14);
        }
    }

    public final void X(Texture texture, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, int i11, int i12, int i13, int i14, boolean z11, boolean z12) {
        float C0 = 1.0f / texture.C0();
        float I = 1.0f / texture.I();
        C0(texture, f11, f12, f13, f14, f15, f16, f17, f18, f19, i11 * C0, (i12 + i14) * I, (i11 + i13) * C0, i12 * I, z11, z12);
    }

    public final void Z(Texture texture, float[] fArr, int i11, int i12) {
        if (!this.f94572h) {
            throw new IllegalStateException("CpuSpriteBatch.begin must be called before draw.");
        }
        if (texture != this.f94569e) {
            z(texture);
        }
        Affine2 affine2 = this.B;
        int min = Math.min(this.f94567c.length - this.f94568d, i12);
        do {
            i12 -= min;
            while (min > 0) {
                float f11 = fArr[i11];
                float f12 = fArr[i11 + 1];
                float[] fArr2 = this.f94567c;
                int i13 = this.f94568d;
                fArr2[i13] = (affine2.f12517m00 * f11) + (affine2.m01 * f12) + affine2.m02;
                fArr2[i13 + 1] = (affine2.f12518m10 * f11) + (affine2.m11 * f12) + affine2.m12;
                fArr2[i13 + 2] = fArr[i11 + 2];
                fArr2[i13 + 3] = fArr[i11 + 3];
                fArr2[i13 + 4] = fArr[i11 + 4];
                this.f94568d = i13 + 5;
                i11 += 5;
                min -= 5;
            }
            if (i12 > 0) {
                super.flush();
                min = Math.min(this.f94567c.length, i12);
            }
        } while (i12 > 0);
    }

    @Override // w1.m, w1.a
    public void c0(Texture texture, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        if (this.C) {
            C0(texture, f11, f12, 0.0f, 0.0f, f13, f14, 1.0f, 1.0f, 0.0f, f15, f16, f17, f18, false, false);
        } else {
            super.c0(texture, f11, f12, f13, f14, f15, f16, f17, f18);
        }
    }

    @Override // w1.m, w1.a
    public void f0(Texture texture, float f11, float f12) {
        if (this.C) {
            X(texture, f11, f12, 0.0f, 0.0f, texture.C0(), texture.I(), 1.0f, 1.0f, 0.0f, 0, 1, 1, 0, false, false);
        } else {
            super.f0(texture, f11, f12);
        }
    }

    public final void i0(o oVar, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        C0(oVar.f94611a, f11, f12, f13, f14, f15, f16, f17, f18, f19, oVar.f94612b, oVar.f94615e, oVar.f94614d, oVar.f94613c, false, false);
    }

    public final void n0(o oVar, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, boolean z11) {
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        float f29;
        float f31;
        float f32;
        if (!this.f94572h) {
            throw new IllegalStateException("CpuSpriteBatch.begin must be called before draw.");
        }
        Texture texture = oVar.f94611a;
        if (texture != this.f94569e) {
            z(texture);
        } else if (this.f94568d == this.f94567c.length) {
            super.flush();
        }
        float f33 = f11 + f13;
        float f34 = f12 + f14;
        float f35 = -f13;
        float f36 = -f14;
        float f37 = f15 - f13;
        float f38 = f16 - f14;
        if (f17 != 1.0f || f18 != 1.0f) {
            f35 *= f17;
            f36 *= f18;
            f37 *= f17;
            f38 *= f18;
        }
        if (f19 != 0.0f) {
            float t11 = com.badlogic.gdx.math.n.t(f19);
            float a02 = com.badlogic.gdx.math.n.a0(f19);
            float f39 = t11 * f35;
            f22 = f39 - (a02 * f36);
            float f41 = f35 * a02;
            float f42 = (f36 * t11) + f41;
            float f43 = a02 * f38;
            f21 = f39 - f43;
            float f44 = f38 * t11;
            f25 = f41 + f44;
            float f45 = (t11 * f37) - f43;
            float f46 = f44 + (a02 * f37);
            f24 = f46 - (f25 - f42);
            f27 = (f45 - f21) + f22;
            f37 = f45;
            f23 = f42;
            f26 = f46;
        } else {
            f21 = f35;
            f22 = f21;
            f23 = f36;
            f24 = f23;
            f25 = f38;
            f26 = f25;
            f27 = f37;
        }
        float f47 = f22 + f33;
        float f48 = f23 + f34;
        float f49 = f21 + f33;
        float f51 = f25 + f34;
        float f52 = f37 + f33;
        float f53 = f26 + f34;
        float f54 = f27 + f33;
        float f55 = f24 + f34;
        if (z11) {
            f28 = oVar.f94614d;
            f29 = oVar.f94615e;
            f31 = oVar.f94612b;
            f32 = oVar.f94613c;
        } else {
            f28 = oVar.f94612b;
            f29 = oVar.f94613c;
            f31 = oVar.f94614d;
            f32 = oVar.f94615e;
        }
        float f56 = f32;
        float f57 = f29;
        float f58 = f31;
        float f59 = f28;
        Affine2 affine2 = this.B;
        float[] fArr = this.f94567c;
        int i11 = this.f94568d;
        float f61 = affine2.f12517m00;
        float f62 = f61 * f47;
        float f63 = affine2.m01;
        float f64 = f62 + (f63 * f48);
        float f65 = affine2.m02;
        fArr[i11] = f64 + f65;
        int i12 = i11 + 1;
        float f66 = affine2.f12518m10;
        float f67 = f47 * f66;
        float f68 = affine2.m11;
        float f69 = affine2.m12;
        fArr[i12] = f67 + (f48 * f68) + f69;
        float f71 = this.f94585u;
        fArr[i11 + 2] = f71;
        fArr[i11 + 3] = f59;
        fArr[i11 + 4] = f57;
        fArr[i11 + 5] = (f61 * f49) + (f63 * f51) + f65;
        fArr[i11 + 6] = (f66 * f49) + (f51 * f68) + f69;
        fArr[i11 + 7] = f71;
        fArr[i11 + 8] = f58;
        fArr[i11 + 9] = f57;
        fArr[i11 + 10] = (f61 * f52) + (f63 * f53) + f65;
        fArr[i11 + 11] = (f66 * f52) + (f53 * f68) + f69;
        fArr[i11 + 12] = f71;
        fArr[i11 + 13] = f58;
        fArr[i11 + 14] = f56;
        fArr[i11 + 15] = (f61 * f54) + (f63 * f55) + f65;
        fArr[i11 + 16] = (f54 * f66) + (f68 * f55) + f69;
        fArr[i11 + 17] = f71;
        fArr[i11 + 18] = f59;
        fArr[i11 + 19] = f56;
        this.f94568d = i11 + 20;
    }

    @Override // w1.m, w1.a
    public void q(o oVar, float f11, float f12) {
        if (this.C) {
            i0(oVar, f11, f12, 0.0f, 0.0f, oVar.c(), oVar.b(), 1.0f, 1.0f, 0.0f);
        } else {
            super.q(oVar, f11, f12);
        }
    }

    @Override // w1.m, w1.a
    public void q0(Texture texture, float f11, float f12, float f13, float f14, int i11, int i12, int i13, int i14, boolean z11, boolean z12) {
        if (this.C) {
            X(texture, f11, f12, 0.0f, 0.0f, f13, f14, 1.0f, 1.0f, 0.0f, i11, i12, i13, i14, z11, z12);
        } else {
            super.q0(texture, f11, f12, f13, f14, i11, i12, i13, i14, z11, z12);
        }
    }

    @Override // w1.m, w1.a
    public void s(o oVar, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        if (this.C) {
            i0(oVar, f11, f12, f13, f14, f15, f16, f17, f18, f19);
        } else {
            super.s(oVar, f11, f12, f13, f14, f15, f16, f17, f18, f19);
        }
    }

    @Override // w1.m, w1.a
    public void t0(Texture texture, float[] fArr, int i11, int i12) {
        if (i12 % 20 != 0) {
            throw new GdxRuntimeException("invalid vertex count");
        }
        if (this.C) {
            Z(texture, fArr, i11, i12);
        } else {
            super.t0(texture, fArr, i11, i12);
        }
    }

    @Override // w1.m, w1.a
    public void u0(Texture texture, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, int i11, int i12, int i13, int i14, boolean z11, boolean z12) {
        if (this.C) {
            X(texture, f11, f12, f13, f14, f15, f16, f17, f18, f19, i11, i12, i13, i14, z11, z12);
        } else {
            super.u0(texture, f11, f12, f13, f14, f15, f16, f17, f18, f19, i11, i12, i13, i14, z11, z12);
        }
    }

    @Override // w1.m, w1.a
    public void v0(o oVar, float f11, float f12, float f13, float f14) {
        if (this.C) {
            i0(oVar, f11, f12, 0.0f, 0.0f, f13, f14, 1.0f, 1.0f, 0.0f);
        } else {
            super.v0(oVar, f11, f12, f13, f14);
        }
    }

    public final void w0(o oVar, float f11, float f12, Affine2 affine2) {
        if (!this.f94572h) {
            throw new IllegalStateException("CpuSpriteBatch.begin must be called before draw.");
        }
        Texture texture = oVar.f94611a;
        if (texture != this.f94569e) {
            z(texture);
        } else if (this.f94568d == this.f94567c.length) {
            super.flush();
        }
        float f13 = affine2.m02;
        float f14 = affine2.m12;
        float f15 = affine2.m01;
        float f16 = (f15 * f12) + f13;
        float f17 = affine2.m11;
        float f18 = (f17 * f12) + f14;
        float f19 = affine2.f12517m00;
        float f21 = (f19 * f11) + (f15 * f12) + f13;
        float f22 = affine2.f12518m10;
        float f23 = (f22 * f11) + (f17 * f12) + f14;
        float f24 = (f19 * f11) + f13;
        float f25 = (f22 * f11) + f14;
        float f26 = oVar.f94612b;
        float f27 = oVar.f94615e;
        float f28 = oVar.f94614d;
        float f29 = oVar.f94613c;
        Affine2 affine22 = this.B;
        float[] fArr = this.f94567c;
        int i11 = this.f94568d;
        float f31 = affine22.f12517m00;
        float f32 = f31 * f13;
        float f33 = affine22.m01;
        float f34 = f32 + (f33 * f14);
        float f35 = affine22.m02;
        fArr[i11] = f34 + f35;
        float f36 = affine22.f12518m10;
        float f37 = f13 * f36;
        float f38 = affine22.m11;
        float f39 = f37 + (f14 * f38);
        float f41 = affine22.m12;
        fArr[i11 + 1] = f39 + f41;
        float f42 = this.f94585u;
        fArr[i11 + 2] = f42;
        fArr[i11 + 3] = f26;
        fArr[i11 + 4] = f27;
        fArr[i11 + 5] = (f31 * f16) + (f33 * f18) + f35;
        fArr[i11 + 6] = (f16 * f36) + (f18 * f38) + f41;
        fArr[i11 + 7] = f42;
        fArr[i11 + 8] = f26;
        fArr[i11 + 9] = f29;
        fArr[i11 + 10] = (f31 * f21) + (f33 * f23) + f35;
        fArr[i11 + 11] = (f36 * f21) + (f23 * f38) + f41;
        fArr[i11 + 12] = f42;
        fArr[i11 + 13] = f28;
        fArr[i11 + 14] = f29;
        fArr[i11 + 15] = (f31 * f24) + (f33 * f25) + f35;
        fArr[i11 + 16] = (f36 * f24) + (f38 * f25) + f41;
        fArr[i11 + 17] = f42;
        fArr[i11 + 18] = f28;
        fArr[i11 + 19] = f27;
        this.f94568d = i11 + 20;
    }

    public b(int i11) {
        this(i11, null);
    }

    public b(int i11, w wVar) {
        super(i11, wVar);
        this.A = new Matrix4();
        this.B = new Affine2();
        this.D = true;
        this.E = new Affine2();
    }
}
