package com.badlogic.gdx.math;

import com.badlogic.gdx.utils.GdxRuntimeException;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class Affine2 implements Serializable {
    private static final long serialVersionUID = 1524569123485049187L;

    /* renamed from: m00, reason: collision with root package name */
    public float f12517m00 = 1.0f;
    public float m01 = 0.0f;
    public float m02 = 0.0f;

    /* renamed from: m10, reason: collision with root package name */
    public float f12518m10 = 0.0f;
    public float m11 = 1.0f;
    public float m12 = 0.0f;

    public Affine2() {
    }

    public void applyTo(Vector2 vector2) {
        float f11 = vector2.f12535x;
        float f12 = vector2.f12536y;
        vector2.f12535x = (this.f12517m00 * f11) + (this.m01 * f12) + this.m02;
        vector2.f12536y = (this.f12518m10 * f11) + (this.m11 * f12) + this.m12;
    }

    public float det() {
        return (this.f12517m00 * this.m11) - (this.m01 * this.f12518m10);
    }

    public Vector2 getTranslation(Vector2 vector2) {
        vector2.f12535x = this.m02;
        vector2.f12536y = this.m12;
        return vector2;
    }

    public Affine2 idt() {
        this.f12517m00 = 1.0f;
        this.m01 = 0.0f;
        this.m02 = 0.0f;
        this.f12518m10 = 0.0f;
        this.m11 = 1.0f;
        this.m12 = 0.0f;
        return this;
    }

    public Affine2 inv() {
        float det = det();
        if (det == 0.0f) {
            throw new GdxRuntimeException("Can't invert a singular affine matrix");
        }
        float f11 = 1.0f / det;
        float f12 = this.m11;
        float f13 = this.m01;
        float f14 = -f13;
        float f15 = this.m12;
        float f16 = this.m02;
        float f17 = this.f12518m10;
        float f18 = -f17;
        float f19 = this.f12517m00;
        this.f12517m00 = f12 * f11;
        this.m01 = f14 * f11;
        this.m02 = ((f13 * f15) - (f12 * f16)) * f11;
        this.f12518m10 = f18 * f11;
        this.m11 = f19 * f11;
        this.m12 = f11 * ((f17 * f16) - (f15 * f19));
        return this;
    }

    public boolean isIdt() {
        return this.f12517m00 == 1.0f && this.m02 == 0.0f && this.m12 == 0.0f && this.m11 == 1.0f && this.m01 == 0.0f && this.f12518m10 == 0.0f;
    }

    public boolean isTranslation() {
        return this.f12517m00 == 1.0f && this.m11 == 1.0f && this.m01 == 0.0f && this.f12518m10 == 0.0f;
    }

    public Affine2 mul(Affine2 affine2) {
        float f11 = this.f12517m00;
        float f12 = affine2.f12517m00;
        float f13 = this.m01;
        float f14 = affine2.f12518m10;
        float f15 = (f11 * f12) + (f13 * f14);
        float f16 = affine2.m01;
        float f17 = affine2.m11;
        float f18 = (f11 * f16) + (f13 * f17);
        float f19 = affine2.m02;
        float f21 = affine2.m12;
        float f22 = (f11 * f19) + (f13 * f21) + this.m02;
        float f23 = this.f12518m10;
        float f24 = this.m11;
        float f25 = (f12 * f23) + (f14 * f24);
        float f26 = (f16 * f23) + (f17 * f24);
        float f27 = (f23 * f19) + (f24 * f21) + this.m12;
        this.f12517m00 = f15;
        this.m01 = f18;
        this.m02 = f22;
        this.f12518m10 = f25;
        this.m11 = f26;
        this.m12 = f27;
        return this;
    }

    public Affine2 preMul(Affine2 affine2) {
        float f11 = affine2.f12517m00;
        float f12 = this.f12517m00;
        float f13 = affine2.m01;
        float f14 = this.f12518m10;
        float f15 = (f11 * f12) + (f13 * f14);
        float f16 = this.m01;
        float f17 = this.m11;
        float f18 = (f11 * f16) + (f13 * f17);
        float f19 = this.m02;
        float f21 = this.m12;
        float f22 = (f11 * f19) + (f13 * f21) + affine2.m02;
        float f23 = affine2.f12518m10;
        float f24 = affine2.m11;
        float f25 = (f12 * f23) + (f14 * f24);
        float f26 = (f16 * f23) + (f17 * f24);
        float f27 = (f23 * f19) + (f24 * f21) + affine2.m12;
        this.f12517m00 = f15;
        this.m01 = f18;
        this.m02 = f22;
        this.f12518m10 = f25;
        this.m11 = f26;
        this.m12 = f27;
        return this;
    }

    public Affine2 preRotate(float f11) {
        if (f11 == 0.0f) {
            return this;
        }
        float t11 = n.t(f11);
        float a02 = n.a0(f11);
        float f12 = this.f12517m00;
        float f13 = this.f12518m10;
        float f14 = (t11 * f12) - (a02 * f13);
        float f15 = this.m01;
        float f16 = this.m11;
        float f17 = (t11 * f15) - (a02 * f16);
        float f18 = this.m02;
        float f19 = this.m12;
        this.f12517m00 = f14;
        this.m01 = f17;
        this.m02 = (t11 * f18) - (a02 * f19);
        this.f12518m10 = (f12 * a02) + (f13 * t11);
        this.m11 = (f15 * a02) + (f16 * t11);
        this.m12 = (a02 * f18) + (t11 * f19);
        return this;
    }

    public Affine2 preRotateRad(float f11) {
        if (f11 == 0.0f) {
            return this;
        }
        float s11 = n.s(f11);
        float Z = n.Z(f11);
        float f12 = this.f12517m00;
        float f13 = this.f12518m10;
        float f14 = (s11 * f12) - (Z * f13);
        float f15 = this.m01;
        float f16 = this.m11;
        float f17 = (s11 * f15) - (Z * f16);
        float f18 = this.m02;
        float f19 = this.m12;
        this.f12517m00 = f14;
        this.m01 = f17;
        this.m02 = (s11 * f18) - (Z * f19);
        this.f12518m10 = (f12 * Z) + (f13 * s11);
        this.m11 = (f15 * Z) + (f16 * s11);
        this.m12 = (Z * f18) + (s11 * f19);
        return this;
    }

    public Affine2 preScale(float f11, float f12) {
        this.f12517m00 *= f11;
        this.m01 *= f11;
        this.m02 *= f11;
        this.f12518m10 *= f12;
        this.m11 *= f12;
        this.m12 *= f12;
        return this;
    }

    public Affine2 preShear(float f11, float f12) {
        float f13 = this.f12517m00;
        float f14 = this.f12518m10;
        float f15 = (f11 * f14) + f13;
        float f16 = this.m01;
        float f17 = this.m11;
        float f18 = (f11 * f17) + f16;
        float f19 = this.m02;
        float f21 = this.m12;
        this.f12517m00 = f15;
        this.m01 = f18;
        this.m02 = (f11 * f21) + f19;
        this.f12518m10 = f14 + (f13 * f12);
        this.m11 = f17 + (f16 * f12);
        this.m12 = f21 + (f12 * f19);
        return this;
    }

    public Affine2 preTranslate(float f11, float f12) {
        this.m02 += f11;
        this.m12 += f12;
        return this;
    }

    public Affine2 rotate(float f11) {
        if (f11 == 0.0f) {
            return this;
        }
        float t11 = n.t(f11);
        float a02 = n.a0(f11);
        float f12 = this.f12517m00;
        float f13 = this.m01;
        float f14 = (f12 * t11) + (f13 * a02);
        float f15 = -a02;
        float f16 = (f12 * f15) + (f13 * t11);
        float f17 = this.f12518m10;
        float f18 = this.m11;
        this.f12517m00 = f14;
        this.m01 = f16;
        this.f12518m10 = (f17 * t11) + (a02 * f18);
        this.m11 = (f17 * f15) + (f18 * t11);
        return this;
    }

    public Affine2 rotateRad(float f11) {
        if (f11 == 0.0f) {
            return this;
        }
        float s11 = n.s(f11);
        float Z = n.Z(f11);
        float f12 = this.f12517m00;
        float f13 = this.m01;
        float f14 = (f12 * s11) + (f13 * Z);
        float f15 = -Z;
        float f16 = (f12 * f15) + (f13 * s11);
        float f17 = this.f12518m10;
        float f18 = this.m11;
        this.f12517m00 = f14;
        this.m01 = f16;
        this.f12518m10 = (f17 * s11) + (Z * f18);
        this.m11 = (f17 * f15) + (f18 * s11);
        return this;
    }

    public Affine2 scale(float f11, float f12) {
        this.f12517m00 *= f11;
        this.m01 *= f12;
        this.f12518m10 *= f11;
        this.m11 *= f12;
        return this;
    }

    public Affine2 set(Affine2 affine2) {
        this.f12517m00 = affine2.f12517m00;
        this.m01 = affine2.m01;
        this.m02 = affine2.m02;
        this.f12518m10 = affine2.f12518m10;
        this.m11 = affine2.m11;
        this.m12 = affine2.m12;
        return this;
    }

    public Affine2 setToProduct(Affine2 affine2, Affine2 affine22) {
        float f11 = affine2.f12517m00 * affine22.f12517m00;
        float f12 = affine2.m01;
        float f13 = affine22.f12518m10;
        this.f12517m00 = f11 + (f12 * f13);
        float f14 = affine2.f12517m00;
        float f15 = affine22.m01 * f14;
        float f16 = affine22.m11;
        this.m01 = f15 + (f12 * f16);
        float f17 = f14 * affine22.m02;
        float f18 = affine2.m01;
        float f19 = affine22.m12;
        this.m02 = f17 + (f18 * f19) + affine2.m02;
        float f21 = affine2.f12518m10 * affine22.f12517m00;
        float f22 = affine2.m11;
        this.f12518m10 = f21 + (f13 * f22);
        float f23 = affine2.f12518m10;
        this.m11 = (affine22.m01 * f23) + (f22 * f16);
        this.m12 = (f23 * affine22.m02) + (affine2.m11 * f19) + affine2.m12;
        return this;
    }

    public Affine2 setToRotation(float f11) {
        float t11 = n.t(f11);
        float a02 = n.a0(f11);
        this.f12517m00 = t11;
        this.m01 = -a02;
        this.m02 = 0.0f;
        this.f12518m10 = a02;
        this.m11 = t11;
        this.m12 = 0.0f;
        return this;
    }

    public Affine2 setToRotationRad(float f11) {
        float s11 = n.s(f11);
        float Z = n.Z(f11);
        this.f12517m00 = s11;
        this.m01 = -Z;
        this.m02 = 0.0f;
        this.f12518m10 = Z;
        this.m11 = s11;
        this.m12 = 0.0f;
        return this;
    }

    public Affine2 setToScaling(float f11, float f12) {
        this.f12517m00 = f11;
        this.m01 = 0.0f;
        this.m02 = 0.0f;
        this.f12518m10 = 0.0f;
        this.m11 = f12;
        this.m12 = 0.0f;
        return this;
    }

    public Affine2 setToShearing(float f11, float f12) {
        this.f12517m00 = 1.0f;
        this.m01 = f11;
        this.m02 = 0.0f;
        this.f12518m10 = f12;
        this.m11 = 1.0f;
        this.m12 = 0.0f;
        return this;
    }

    public Affine2 setToTranslation(float f11, float f12) {
        this.f12517m00 = 1.0f;
        this.m01 = 0.0f;
        this.m02 = f11;
        this.f12518m10 = 0.0f;
        this.m11 = 1.0f;
        this.m12 = f12;
        return this;
    }

    public Affine2 setToTrnRotRadScl(float f11, float f12, float f13, float f14, float f15) {
        this.m02 = f11;
        this.m12 = f12;
        if (f13 == 0.0f) {
            this.f12517m00 = f14;
            this.m01 = 0.0f;
            this.f12518m10 = 0.0f;
            this.m11 = f15;
            return this;
        }
        float Z = n.Z(f13);
        float s11 = n.s(f13);
        this.f12517m00 = s11 * f14;
        this.m01 = (-Z) * f15;
        this.f12518m10 = Z * f14;
        this.m11 = s11 * f15;
        return this;
    }

    public Affine2 setToTrnRotScl(float f11, float f12, float f13, float f14, float f15) {
        this.m02 = f11;
        this.m12 = f12;
        if (f13 == 0.0f) {
            this.f12517m00 = f14;
            this.m01 = 0.0f;
            this.f12518m10 = 0.0f;
            this.m11 = f15;
            return this;
        }
        float a02 = n.a0(f13);
        float t11 = n.t(f13);
        this.f12517m00 = t11 * f14;
        this.m01 = (-a02) * f15;
        this.f12518m10 = a02 * f14;
        this.m11 = t11 * f15;
        return this;
    }

    public Affine2 setToTrnScl(float f11, float f12, float f13, float f14) {
        this.f12517m00 = f13;
        this.m01 = 0.0f;
        this.m02 = f11;
        this.f12518m10 = 0.0f;
        this.m11 = f14;
        this.m12 = f12;
        return this;
    }

    public Affine2 shear(float f11, float f12) {
        float f13 = this.f12517m00;
        float f14 = this.m01;
        this.f12517m00 = (f12 * f14) + f13;
        this.m01 = f14 + (f13 * f11);
        float f15 = this.f12518m10;
        float f16 = this.m11;
        this.f12518m10 = (f12 * f16) + f15;
        this.m11 = f16 + (f11 * f15);
        return this;
    }

    public String toString() {
        return "[" + this.f12517m00 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.m01 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.m02 + "]\n[" + this.f12518m10 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.m11 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.m12 + "]\n[0.0|0.0|0.1]";
    }

    public Affine2 translate(float f11, float f12) {
        this.m02 += (this.f12517m00 * f11) + (this.m01 * f12);
        this.m12 += (this.f12518m10 * f11) + (this.m11 * f12);
        return this;
    }

    public Affine2 preTranslate(Vector2 vector2) {
        return preTranslate(vector2.f12535x, vector2.f12536y);
    }

    public Affine2 translate(Vector2 vector2) {
        return translate(vector2.f12535x, vector2.f12536y);
    }

    public Affine2(Affine2 affine2) {
        set(affine2);
    }

    public Affine2 scale(Vector2 vector2) {
        return scale(vector2.f12535x, vector2.f12536y);
    }

    public Affine2 preScale(Vector2 vector2) {
        return preScale(vector2.f12535x, vector2.f12536y);
    }

    public Affine2 set(Matrix3 matrix3) {
        float[] fArr = matrix3.val;
        this.f12517m00 = fArr[0];
        this.m01 = fArr[3];
        this.m02 = fArr[6];
        this.f12518m10 = fArr[1];
        this.m11 = fArr[4];
        this.m12 = fArr[7];
        return this;
    }

    public Affine2 setToScaling(Vector2 vector2) {
        return setToScaling(vector2.f12535x, vector2.f12536y);
    }

    public Affine2 setToShearing(Vector2 vector2) {
        return setToShearing(vector2.f12535x, vector2.f12536y);
    }

    public Affine2 setToTranslation(Vector2 vector2) {
        return setToTranslation(vector2.f12535x, vector2.f12536y);
    }

    public Affine2 setToTrnScl(Vector2 vector2, Vector2 vector22) {
        return setToTrnScl(vector2.f12535x, vector2.f12536y, vector22.f12535x, vector22.f12536y);
    }

    public Affine2 shear(Vector2 vector2) {
        return shear(vector2.f12535x, vector2.f12536y);
    }

    public Affine2 setToRotation(float f11, float f12) {
        this.f12517m00 = f11;
        this.m01 = -f12;
        this.m02 = 0.0f;
        this.f12518m10 = f12;
        this.m11 = f11;
        this.m12 = 0.0f;
        return this;
    }

    public Affine2 preShear(Vector2 vector2) {
        return preShear(vector2.f12535x, vector2.f12536y);
    }

    public Affine2 setToTrnRotRadScl(Vector2 vector2, float f11, Vector2 vector22) {
        return setToTrnRotRadScl(vector2.f12535x, vector2.f12536y, f11, vector22.f12535x, vector22.f12536y);
    }

    public Affine2 setToTrnRotScl(Vector2 vector2, float f11, Vector2 vector22) {
        return setToTrnRotScl(vector2.f12535x, vector2.f12536y, f11, vector22.f12535x, vector22.f12536y);
    }

    public Affine2 set(Matrix4 matrix4) {
        float[] fArr = matrix4.val;
        this.f12517m00 = fArr[0];
        this.m01 = fArr[4];
        this.m02 = fArr[12];
        this.f12518m10 = fArr[1];
        this.m11 = fArr[5];
        this.m12 = fArr[13];
        return this;
    }
}
