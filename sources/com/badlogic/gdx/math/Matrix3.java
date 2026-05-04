package com.badlogic.gdx.math;

import com.badlogic.gdx.utils.GdxRuntimeException;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class Matrix3 implements Serializable {
    public static final int M00 = 0;
    public static final int M01 = 3;
    public static final int M02 = 6;
    public static final int M10 = 1;
    public static final int M11 = 4;
    public static final int M12 = 7;
    public static final int M20 = 2;
    public static final int M21 = 5;
    public static final int M22 = 8;
    private static final long serialVersionUID = 7907569533774959788L;
    private float[] tmp;
    public float[] val;

    public Matrix3() {
        this.val = new float[9];
        float[] fArr = new float[9];
        this.tmp = fArr;
        fArr[8] = 1.0f;
        idt();
    }

    public float det() {
        float[] fArr = this.val;
        float f11 = fArr[0];
        float f12 = fArr[4];
        float f13 = fArr[8];
        float f14 = fArr[3];
        float f15 = fArr[7];
        float f16 = fArr[2];
        float f17 = (f11 * f12 * f13) + (f14 * f15 * f16);
        float f18 = fArr[6];
        float f19 = fArr[1];
        float f21 = fArr[5];
        return (((f17 + ((f18 * f19) * f21)) - ((f11 * f15) * f21)) - ((f14 * f19) * f13)) - ((f18 * f12) * f16);
    }

    public float getRotation() {
        float[] fArr = this.val;
        return ((float) Math.atan2(fArr[1], fArr[0])) * 57.295776f;
    }

    public float getRotationRad() {
        float[] fArr = this.val;
        return (float) Math.atan2(fArr[1], fArr[0]);
    }

    public Vector2 getScale(Vector2 vector2) {
        float[] fArr = this.val;
        float f11 = fArr[0];
        float f12 = fArr[3];
        vector2.f12535x = (float) Math.sqrt((f11 * f11) + (f12 * f12));
        float f13 = fArr[1];
        float f14 = fArr[4];
        vector2.f12536y = (float) Math.sqrt((f13 * f13) + (f14 * f14));
        return vector2;
    }

    public Vector2 getTranslation(Vector2 vector2) {
        float[] fArr = this.val;
        vector2.f12535x = fArr[6];
        vector2.f12536y = fArr[7];
        return vector2;
    }

    public float[] getValues() {
        return this.val;
    }

    public Matrix3 idt() {
        float[] fArr = this.val;
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 1.0f;
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
        return this;
    }

    public Matrix3 inv() {
        float det = det();
        if (det == 0.0f) {
            throw new GdxRuntimeException("Can't invert a singular matrix");
        }
        float f11 = 1.0f / det;
        float[] fArr = this.val;
        float f12 = fArr[4];
        float f13 = fArr[8];
        float f14 = fArr[5];
        float f15 = fArr[7];
        float f16 = (f12 * f13) - (f14 * f15);
        float f17 = fArr[2];
        float f18 = fArr[1];
        float f19 = (f17 * f15) - (f18 * f13);
        float f21 = (f18 * f14) - (f17 * f12);
        float f22 = fArr[6];
        float f23 = fArr[3];
        float f24 = (f14 * f22) - (f23 * f13);
        float f25 = fArr[0];
        float f26 = (f13 * f25) - (f17 * f22);
        float f27 = (f17 * f23) - (f14 * f25);
        float f28 = (f23 * f15) - (f12 * f22);
        fArr[0] = f16 * f11;
        fArr[1] = f19 * f11;
        fArr[2] = f21 * f11;
        fArr[3] = f24 * f11;
        fArr[4] = f26 * f11;
        fArr[5] = f27 * f11;
        fArr[6] = f28 * f11;
        fArr[7] = ((f22 * f18) - (f15 * f25)) * f11;
        fArr[8] = f11 * ((f25 * f12) - (f18 * f23));
        return this;
    }

    public Matrix3 mul(Matrix3 matrix3) {
        float[] fArr = this.val;
        float f11 = fArr[0];
        float[] fArr2 = matrix3.val;
        float f12 = fArr2[0];
        float f13 = fArr[3];
        float f14 = fArr2[1];
        float f15 = fArr[6];
        float f16 = fArr2[2];
        float f17 = (f11 * f12) + (f13 * f14) + (f15 * f16);
        float f18 = fArr2[3];
        float f19 = fArr2[4];
        float f21 = fArr2[5];
        float f22 = (f11 * f18) + (f13 * f19) + (f15 * f21);
        float f23 = fArr2[6];
        float f24 = fArr2[7];
        float f25 = fArr2[8];
        float f26 = (f11 * f23) + (f13 * f24) + (f15 * f25);
        float f27 = fArr[1];
        float f28 = fArr[4];
        float f29 = fArr[7];
        float f31 = (f27 * f12) + (f28 * f14) + (f29 * f16);
        float f32 = (f27 * f18) + (f28 * f19) + (f29 * f21);
        float f33 = (f27 * f23) + (f28 * f24) + (f29 * f25);
        float f34 = fArr[2];
        float f35 = fArr[5];
        float f36 = (f12 * f34) + (f14 * f35);
        float f37 = fArr[8];
        fArr[0] = f17;
        fArr[1] = f31;
        fArr[2] = f36 + (f16 * f37);
        fArr[3] = f22;
        fArr[4] = f32;
        fArr[5] = (f18 * f34) + (f19 * f35) + (f21 * f37);
        fArr[6] = f26;
        fArr[7] = f33;
        fArr[8] = (f34 * f23) + (f35 * f24) + (f37 * f25);
        return this;
    }

    public Matrix3 mulLeft(Matrix3 matrix3) {
        float[] fArr = this.val;
        float[] fArr2 = matrix3.val;
        float f11 = fArr2[0];
        float f12 = fArr[0];
        float f13 = fArr2[3];
        float f14 = fArr[1];
        float f15 = fArr2[6];
        float f16 = fArr[2];
        float f17 = (f11 * f12) + (f13 * f14) + (f15 * f16);
        float f18 = fArr[3];
        float f19 = fArr[4];
        float f21 = fArr[5];
        float f22 = (f11 * f18) + (f13 * f19) + (f15 * f21);
        float f23 = fArr[6];
        float f24 = fArr[7];
        float f25 = fArr[8];
        float f26 = (f11 * f23) + (f13 * f24) + (f15 * f25);
        float f27 = fArr2[1];
        float f28 = fArr2[4];
        float f29 = fArr2[7];
        float f31 = (f27 * f12) + (f28 * f14) + (f29 * f16);
        float f32 = (f27 * f18) + (f28 * f19) + (f29 * f21);
        float f33 = (f27 * f23) + (f28 * f24) + (f29 * f25);
        float f34 = fArr2[2];
        float f35 = fArr2[5];
        float f36 = fArr2[8];
        fArr[0] = f17;
        fArr[1] = f31;
        fArr[2] = (f12 * f34) + (f14 * f35) + (f16 * f36);
        fArr[3] = f22;
        fArr[4] = f32;
        fArr[5] = (f18 * f34) + (f19 * f35) + (f21 * f36);
        fArr[6] = f26;
        fArr[7] = f33;
        fArr[8] = (f34 * f23) + (f35 * f24) + (f36 * f25);
        return this;
    }

    public Matrix3 rotate(float f11) {
        return rotateRad(f11 * 0.017453292f);
    }

    public Matrix3 rotateRad(float f11) {
        if (f11 == 0.0f) {
            return this;
        }
        double d11 = f11;
        float cos = (float) Math.cos(d11);
        float sin = (float) Math.sin(d11);
        float[] fArr = this.tmp;
        fArr[0] = cos;
        fArr[1] = sin;
        fArr[3] = -sin;
        fArr[4] = cos;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        mul(this.val, fArr);
        return this;
    }

    public Matrix3 scale(float f11, float f12) {
        float[] fArr = this.tmp;
        fArr[0] = f11;
        fArr[1] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = f12;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        mul(this.val, fArr);
        return this;
    }

    public Matrix3 scl(float f11) {
        float[] fArr = this.val;
        fArr[0] = fArr[0] * f11;
        fArr[4] = fArr[4] * f11;
        return this;
    }

    public Matrix3 set(Matrix3 matrix3) {
        float[] fArr = matrix3.val;
        float[] fArr2 = this.val;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        return this;
    }

    public Matrix3 setToRotation(float f11) {
        return setToRotationRad(f11 * 0.017453292f);
    }

    public Matrix3 setToRotationRad(float f11) {
        double d11 = f11;
        float cos = (float) Math.cos(d11);
        float sin = (float) Math.sin(d11);
        float[] fArr = this.val;
        fArr[0] = cos;
        fArr[1] = sin;
        fArr[2] = 0.0f;
        fArr[3] = -sin;
        fArr[4] = cos;
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
        return this;
    }

    public Matrix3 setToScaling(float f11, float f12) {
        float[] fArr = this.val;
        fArr[0] = f11;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = f12;
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
        return this;
    }

    public Matrix3 setToTranslation(float f11, float f12) {
        float[] fArr = this.val;
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 1.0f;
        fArr[5] = 0.0f;
        fArr[6] = f11;
        fArr[7] = f12;
        fArr[8] = 1.0f;
        return this;
    }

    public String toString() {
        float[] fArr = this.val;
        return "[" + fArr[0] + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + fArr[3] + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + fArr[6] + "]\n[" + fArr[1] + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + fArr[4] + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + fArr[7] + "]\n[" + fArr[2] + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + fArr[5] + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + fArr[8] + "]";
    }

    public Matrix3 translate(float f11, float f12) {
        float[] fArr = this.tmp;
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 1.0f;
        fArr[6] = f11;
        fArr[7] = f12;
        mul(this.val, fArr);
        return this;
    }

    public Matrix3 transpose() {
        float[] fArr = this.val;
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[7];
        fArr[3] = f11;
        fArr[6] = f12;
        fArr[1] = f13;
        fArr[7] = f14;
        fArr[2] = f15;
        fArr[5] = f16;
        return this;
    }

    public Matrix3 trn(Vector2 vector2) {
        float[] fArr = this.val;
        fArr[6] = fArr[6] + vector2.f12535x;
        fArr[7] = fArr[7] + vector2.f12536y;
        return this;
    }

    public Matrix3 set(Affine2 affine2) {
        float[] fArr = this.val;
        fArr[0] = affine2.f12517m00;
        fArr[1] = affine2.f12518m10;
        fArr[2] = 0.0f;
        fArr[3] = affine2.m01;
        fArr[4] = affine2.m11;
        fArr[5] = 0.0f;
        fArr[6] = affine2.m02;
        fArr[7] = affine2.m12;
        fArr[8] = 1.0f;
        return this;
    }

    public Matrix3 setToRotation(Vector3 vector3, float f11) {
        return setToRotation(vector3, n.t(f11), n.a0(f11));
    }

    public Matrix3 scl(Vector2 vector2) {
        float[] fArr = this.val;
        fArr[0] = fArr[0] * vector2.f12535x;
        fArr[4] = fArr[4] * vector2.f12536y;
        return this;
    }

    public Matrix3 setToRotation(Vector3 vector3, float f11, float f12) {
        float[] fArr = this.val;
        float f13 = 1.0f - f11;
        float f14 = vector3.f12537x;
        fArr[0] = (f13 * f14 * f14) + f11;
        float f15 = vector3.f12538y;
        float f16 = vector3.f12539z;
        fArr[3] = ((f13 * f14) * f15) - (f16 * f12);
        fArr[6] = (f13 * f16 * f14) + (f15 * f12);
        fArr[1] = (f13 * f14 * f15) + (f16 * f12);
        fArr[4] = (f13 * f15 * f15) + f11;
        fArr[7] = ((f13 * f15) * f16) - (f14 * f12);
        fArr[2] = ((f13 * f16) * f14) - (f15 * f12);
        fArr[5] = (f15 * f13 * f16) + (f14 * f12);
        fArr[8] = (f13 * f16 * f16) + f11;
        return this;
    }

    public Matrix3 trn(float f11, float f12) {
        float[] fArr = this.val;
        fArr[6] = fArr[6] + f11;
        fArr[7] = fArr[7] + f12;
        return this;
    }

    public Matrix3 scl(Vector3 vector3) {
        float[] fArr = this.val;
        fArr[0] = fArr[0] * vector3.f12537x;
        fArr[4] = fArr[4] * vector3.f12538y;
        return this;
    }

    public Matrix3 trn(Vector3 vector3) {
        float[] fArr = this.val;
        fArr[6] = fArr[6] + vector3.f12537x;
        fArr[7] = fArr[7] + vector3.f12538y;
        return this;
    }

    public Matrix3(Matrix3 matrix3) {
        this.val = new float[9];
        float[] fArr = new float[9];
        this.tmp = fArr;
        fArr[8] = 1.0f;
        set(matrix3);
    }

    public Matrix3 scale(Vector2 vector2) {
        float[] fArr = this.tmp;
        fArr[0] = vector2.f12535x;
        fArr[1] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = vector2.f12536y;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        mul(this.val, fArr);
        return this;
    }

    public Matrix3 translate(Vector2 vector2) {
        float[] fArr = this.tmp;
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 1.0f;
        fArr[6] = vector2.f12535x;
        fArr[7] = vector2.f12536y;
        mul(this.val, fArr);
        return this;
    }

    public Matrix3(float[] fArr) {
        this.val = new float[9];
        float[] fArr2 = new float[9];
        this.tmp = fArr2;
        fArr2[8] = 1.0f;
        set(fArr);
    }

    public Matrix3 setToScaling(Vector2 vector2) {
        float[] fArr = this.val;
        fArr[0] = vector2.f12535x;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = vector2.f12536y;
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
        return this;
    }

    public Matrix3 setToTranslation(Vector2 vector2) {
        float[] fArr = this.val;
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 1.0f;
        fArr[5] = 0.0f;
        fArr[6] = vector2.f12535x;
        fArr[7] = vector2.f12536y;
        fArr[8] = 1.0f;
        return this;
    }

    public Matrix3 set(Matrix4 matrix4) {
        float[] fArr = this.val;
        float[] fArr2 = matrix4.val;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[2] = fArr2[2];
        fArr[3] = fArr2[4];
        fArr[4] = fArr2[5];
        fArr[5] = fArr2[6];
        fArr[6] = fArr2[8];
        fArr[7] = fArr2[9];
        fArr[8] = fArr2[10];
        return this;
    }

    private static void mul(float[] fArr, float[] fArr2) {
        float f11 = fArr[0];
        float f12 = fArr2[0];
        float f13 = fArr[3];
        float f14 = fArr2[1];
        float f15 = fArr[6];
        float f16 = fArr2[2];
        float f17 = (f11 * f12) + (f13 * f14) + (f15 * f16);
        float f18 = fArr2[3];
        float f19 = fArr2[4];
        float f21 = fArr2[5];
        float f22 = (f11 * f18) + (f13 * f19) + (f15 * f21);
        float f23 = fArr2[6];
        float f24 = fArr2[7];
        float f25 = fArr2[8];
        float f26 = (f11 * f23) + (f13 * f24) + (f15 * f25);
        float f27 = fArr[1];
        float f28 = fArr[4];
        float f29 = fArr[7];
        float f31 = (f27 * f12) + (f28 * f14) + (f29 * f16);
        float f32 = (f27 * f18) + (f28 * f19) + (f29 * f21);
        float f33 = (f27 * f23) + (f28 * f24) + (f29 * f25);
        float f34 = fArr[2];
        float f35 = fArr[5];
        float f36 = (f12 * f34) + (f14 * f35);
        float f37 = fArr[8];
        fArr[0] = f17;
        fArr[1] = f31;
        fArr[2] = f36 + (f16 * f37);
        fArr[3] = f22;
        fArr[4] = f32;
        fArr[5] = (f18 * f34) + (f19 * f35) + (f21 * f37);
        fArr[6] = f26;
        fArr[7] = f33;
        fArr[8] = (f34 * f23) + (f35 * f24) + (f37 * f25);
    }

    public Matrix3 set(float[] fArr) {
        float[] fArr2 = this.val;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        return this;
    }
}
