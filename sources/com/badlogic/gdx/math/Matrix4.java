package com.badlogic.gdx.math;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class Matrix4 implements Serializable {
    public static final int M00 = 0;
    public static final int M01 = 4;
    public static final int M02 = 8;
    public static final int M03 = 12;
    public static final int M10 = 1;
    public static final int M11 = 5;
    public static final int M12 = 9;
    public static final int M13 = 13;
    public static final int M20 = 2;
    public static final int M21 = 6;
    public static final int M22 = 10;
    public static final int M23 = 14;
    public static final int M30 = 3;
    public static final int M31 = 7;
    public static final int M32 = 11;
    public static final int M33 = 15;
    private static final long serialVersionUID = -2717655254359579617L;
    public final float[] val;
    static final Quaternion quat = new Quaternion();
    static final Quaternion quat2 = new Quaternion();
    static final Vector3 l_vez = new Vector3();
    static final Vector3 l_vex = new Vector3();
    static final Vector3 l_vey = new Vector3();
    static final Vector3 tmpVec = new Vector3();
    static final Matrix4 tmpMat = new Matrix4();
    static final Vector3 right = new Vector3();
    static final Vector3 tmpForward = new Vector3();
    static final Vector3 tmpUp = new Vector3();

    public Matrix4() {
        float[] fArr = new float[16];
        this.val = fArr;
        fArr[0] = 1.0f;
        fArr[5] = 1.0f;
        fArr[10] = 1.0f;
        fArr[15] = 1.0f;
    }

    public static void mulVec(float[] fArr, float[] fArr2) {
        float f11 = fArr2[0];
        float f12 = fArr[0] * f11;
        float f13 = fArr2[1];
        float f14 = f12 + (fArr[4] * f13);
        float f15 = fArr2[2];
        float f16 = f14 + (fArr[8] * f15) + fArr[12];
        float f17 = (fArr[1] * f11) + (fArr[5] * f13) + (fArr[9] * f15) + fArr[13];
        float f18 = (f11 * fArr[2]) + (f13 * fArr[6]) + (f15 * fArr[10]) + fArr[14];
        fArr2[0] = f16;
        fArr2[1] = f17;
        fArr2[2] = f18;
    }

    public static native void mulVec(float[] fArr, float[] fArr2, int i11, int i12, int i13);

    public static void prj(float[] fArr, float[] fArr2) {
        float f11 = fArr2[0];
        float f12 = fArr[3] * f11;
        float f13 = fArr2[1];
        float f14 = f12 + (fArr[7] * f13);
        float f15 = fArr2[2];
        float f16 = 1.0f / ((f14 + (fArr[11] * f15)) + fArr[15]);
        float f17 = ((fArr[0] * f11) + (fArr[4] * f13) + (fArr[8] * f15) + fArr[12]) * f16;
        float f18 = ((fArr[1] * f11) + (fArr[5] * f13) + (fArr[9] * f15) + fArr[13]) * f16;
        float f19 = ((f11 * fArr[2]) + (f13 * fArr[6]) + (f15 * fArr[10]) + fArr[14]) * f16;
        fArr2[0] = f17;
        fArr2[1] = f18;
        fArr2[2] = f19;
    }

    public static native void prj(float[] fArr, float[] fArr2, int i11, int i12, int i13);

    public static void rot(float[] fArr, float[] fArr2) {
        float f11 = fArr2[0];
        float f12 = fArr[0] * f11;
        float f13 = fArr2[1];
        float f14 = f12 + (fArr[4] * f13);
        float f15 = fArr2[2];
        float f16 = f14 + (fArr[8] * f15);
        float f17 = (fArr[1] * f11) + (fArr[5] * f13) + (fArr[9] * f15);
        float f18 = (f11 * fArr[2]) + (f13 * fArr[6]) + (f15 * fArr[10]);
        fArr2[0] = f16;
        fArr2[1] = f17;
        fArr2[2] = f18;
    }

    public static native void rot(float[] fArr, float[] fArr2, int i11, int i12, int i13);

    public Matrix4 avg(Matrix4 matrix4, float f11) {
        Vector3 vector3 = tmpVec;
        getScale(vector3);
        Vector3 vector32 = tmpForward;
        matrix4.getScale(vector32);
        Quaternion quaternion = quat;
        getRotation(quaternion);
        Quaternion quaternion2 = quat2;
        matrix4.getRotation(quaternion2);
        Vector3 vector33 = tmpUp;
        getTranslation(vector33);
        Vector3 vector34 = right;
        matrix4.getTranslation(vector34);
        Vector3 scl = vector3.scl(f11);
        float f12 = 1.0f - f11;
        setToScaling(scl.add(vector32.scl(f12)));
        rotate(quaternion.slerp(quaternion2, f12));
        setTranslation(vector33.scl(f11).add(vector34.scl(f12)));
        return this;
    }

    public Matrix4 cpy() {
        return new Matrix4(this);
    }

    public float det() {
        float[] fArr = this.val;
        float f11 = fArr[3];
        float f12 = fArr[6];
        float f13 = fArr[9];
        float f14 = fArr[12];
        float f15 = fArr[2];
        float f16 = fArr[7];
        float f17 = fArr[5];
        float f18 = fArr[10];
        float f19 = fArr[1];
        float f21 = fArr[11];
        float f22 = fArr[8];
        float f23 = fArr[13];
        float f24 = (((((((((f11 * f12) * f13) * f14) - (((f15 * f16) * f13) * f14)) - (((f11 * f17) * f18) * f14)) + (((f19 * f16) * f18) * f14)) + (((f15 * f17) * f21) * f14)) - (((f19 * f12) * f21) * f14)) - (((f11 * f12) * f22) * f23)) + (f15 * f16 * f22 * f23);
        float f25 = fArr[4];
        float f26 = fArr[0];
        float f27 = (((f24 + (((f11 * f25) * f18) * f23)) - (((f26 * f16) * f18) * f23)) - (((f15 * f25) * f21) * f23)) + (f26 * f12 * f21 * f23);
        float f28 = fArr[14];
        float f29 = fArr[15];
        return (((((((((((f27 + (((f11 * f17) * f22) * f28)) - (((f19 * f16) * f22) * f28)) - (((f11 * f25) * f13) * f28)) + (((f16 * f26) * f13) * f28)) + (((f19 * f25) * f21) * f28)) - (((f26 * f17) * f21) * f28)) - (((f15 * f17) * f22) * f29)) + (((f19 * f12) * f22) * f29)) + (((f15 * f25) * f13) * f29)) - (((f12 * f26) * f13) * f29)) - (((f19 * f25) * f18) * f29)) + (f26 * f17 * f18 * f29);
    }

    public float det3x3() {
        float[] fArr = this.val;
        float f11 = fArr[0];
        float f12 = fArr[5];
        float f13 = fArr[10];
        float f14 = fArr[4];
        float f15 = fArr[9];
        float f16 = fArr[2];
        float f17 = (f11 * f12 * f13) + (f14 * f15 * f16);
        float f18 = fArr[8];
        float f19 = fArr[1];
        float f21 = fArr[6];
        return (((f17 + ((f18 * f19) * f21)) - ((f11 * f15) * f21)) - ((f14 * f19) * f13)) - ((f18 * f12) * f16);
    }

    public void extract4x3Matrix(float[] fArr) {
        float[] fArr2 = this.val;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[2] = fArr2[2];
        fArr[3] = fArr2[4];
        fArr[4] = fArr2[5];
        fArr[5] = fArr2[6];
        fArr[6] = fArr2[8];
        fArr[7] = fArr2[9];
        fArr[8] = fArr2[10];
        fArr[9] = fArr2[12];
        fArr[10] = fArr2[13];
        fArr[11] = fArr2[14];
    }

    public Quaternion getRotation(Quaternion quaternion, boolean z11) {
        return quaternion.setFromMatrix(z11, this);
    }

    public Vector3 getScale(Vector3 vector3) {
        return vector3.set(getScaleX(), getScaleY(), getScaleZ());
    }

    public float getScaleX() {
        return (n.z(this.val[4]) && n.z(this.val[8])) ? Math.abs(this.val[0]) : (float) Math.sqrt(getScaleXSquared());
    }

    public float getScaleXSquared() {
        float[] fArr = this.val;
        float f11 = fArr[0];
        float f12 = fArr[4];
        float f13 = fArr[8];
        return (f11 * f11) + (f12 * f12) + (f13 * f13);
    }

    public float getScaleY() {
        return (n.z(this.val[1]) && n.z(this.val[9])) ? Math.abs(this.val[5]) : (float) Math.sqrt(getScaleYSquared());
    }

    public float getScaleYSquared() {
        float[] fArr = this.val;
        float f11 = fArr[1];
        float f12 = fArr[5];
        float f13 = fArr[9];
        return (f11 * f11) + (f12 * f12) + (f13 * f13);
    }

    public float getScaleZ() {
        return (n.z(this.val[2]) && n.z(this.val[6])) ? Math.abs(this.val[10]) : (float) Math.sqrt(getScaleZSquared());
    }

    public float getScaleZSquared() {
        float[] fArr = this.val;
        float f11 = fArr[2];
        float f12 = fArr[6];
        float f13 = fArr[10];
        return (f11 * f11) + (f12 * f12) + (f13 * f13);
    }

    public Vector3 getTranslation(Vector3 vector3) {
        float[] fArr = this.val;
        vector3.f12537x = fArr[12];
        vector3.f12538y = fArr[13];
        vector3.f12539z = fArr[14];
        return vector3;
    }

    public float[] getValues() {
        return this.val;
    }

    public boolean hasRotationOrScaling() {
        return (n.w(this.val[0], 1.0f) && n.w(this.val[5], 1.0f) && n.w(this.val[10], 1.0f) && n.z(this.val[4]) && n.z(this.val[8]) && n.z(this.val[1]) && n.z(this.val[9]) && n.z(this.val[2]) && n.z(this.val[6])) ? false : true;
    }

    public Matrix4 idt() {
        float[] fArr = this.val;
        fArr[0] = 1.0f;
        fArr[4] = 0.0f;
        fArr[8] = 0.0f;
        fArr[12] = 0.0f;
        fArr[1] = 0.0f;
        fArr[5] = 1.0f;
        fArr[9] = 0.0f;
        fArr[13] = 0.0f;
        fArr[2] = 0.0f;
        fArr[6] = 0.0f;
        fArr[10] = 1.0f;
        fArr[14] = 0.0f;
        fArr[3] = 0.0f;
        fArr[7] = 0.0f;
        fArr[11] = 0.0f;
        fArr[15] = 1.0f;
        return this;
    }

    public Matrix4 inv() {
        float[] fArr = this.val;
        float f11 = fArr[3];
        float f12 = fArr[6];
        float f13 = fArr[9];
        float f14 = fArr[12];
        float f15 = fArr[2];
        float f16 = fArr[7];
        float f17 = fArr[5];
        float f18 = fArr[10];
        float f19 = fArr[1];
        float f21 = fArr[11];
        float f22 = fArr[8];
        float f23 = fArr[13];
        float f24 = fArr[4];
        float f25 = fArr[0];
        float f26 = fArr[14];
        float f27 = fArr[15];
        float f28 = (((((((((((((((((((((((((f11 * f12) * f13) * f14) - (((f15 * f16) * f13) * f14)) - (((f11 * f17) * f18) * f14)) + (((f19 * f16) * f18) * f14)) + (((f15 * f17) * f21) * f14)) - (((f19 * f12) * f21) * f14)) - (((f11 * f12) * f22) * f23)) + (((f15 * f16) * f22) * f23)) + (((f11 * f24) * f18) * f23)) - (((f25 * f16) * f18) * f23)) - (((f15 * f24) * f21) * f23)) + (((f25 * f12) * f21) * f23)) + (((f11 * f17) * f22) * f26)) - (((f19 * f16) * f22) * f26)) - (((f11 * f24) * f13) * f26)) + (((f25 * f16) * f13) * f26)) + (((f19 * f24) * f21) * f26)) - (((f25 * f17) * f21) * f26)) - (((f15 * f17) * f22) * f27)) + (((f19 * f12) * f22) * f27)) + (((f15 * f24) * f13) * f27)) - (((f25 * f12) * f13) * f27)) - (((f19 * f24) * f18) * f27)) + (f25 * f17 * f18 * f27);
        if (f28 == 0.0f) {
            throw new RuntimeException("non-invertible matrix");
        }
        float f29 = ((((((f13 * f26) * f16) - ((f23 * f18) * f16)) + ((f23 * f12) * f21)) - ((f17 * f26) * f21)) - ((f13 * f12) * f27)) + (f17 * f18 * f27);
        float f31 = ((((((f14 * f18) * f16) - ((f22 * f26) * f16)) - ((f14 * f12) * f21)) + ((f24 * f26) * f21)) + ((f22 * f12) * f27)) - ((f24 * f18) * f27);
        float f32 = ((((((f22 * f23) * f16) - ((f14 * f13) * f16)) + ((f14 * f17) * f21)) - ((f24 * f23) * f21)) - ((f22 * f17) * f27)) + (f24 * f13 * f27);
        float f33 = ((((((f14 * f13) * f12) - ((f22 * f23) * f12)) - ((f14 * f17) * f18)) + ((f24 * f23) * f18)) + ((f22 * f17) * f26)) - ((f24 * f13) * f26);
        float f34 = ((((((f23 * f18) * f11) - ((f13 * f26) * f11)) - ((f23 * f15) * f21)) + ((f19 * f26) * f21)) + ((f13 * f15) * f27)) - ((f19 * f18) * f27);
        float f35 = ((((((f22 * f26) * f11) - ((f14 * f18) * f11)) + ((f14 * f15) * f21)) - ((f25 * f26) * f21)) - ((f22 * f15) * f27)) + (f25 * f18 * f27);
        float f36 = ((((((f14 * f13) * f11) - ((f22 * f23) * f11)) - ((f14 * f19) * f21)) + ((f25 * f23) * f21)) + ((f22 * f19) * f27)) - ((f25 * f13) * f27);
        float f37 = ((((((f22 * f23) * f15) - ((f14 * f13) * f15)) + ((f14 * f19) * f18)) - ((f25 * f23) * f18)) - ((f22 * f19) * f26)) + (f25 * f13 * f26);
        float f38 = ((((((f17 * f26) * f11) - ((f23 * f12) * f11)) + ((f23 * f15) * f16)) - ((f19 * f26) * f16)) - ((f17 * f15) * f27)) + (f19 * f12 * f27);
        float f39 = ((((((f14 * f12) * f11) - ((f24 * f26) * f11)) - ((f14 * f15) * f16)) + ((f25 * f26) * f16)) + ((f24 * f15) * f27)) - ((f25 * f12) * f27);
        float f41 = ((((((f24 * f23) * f11) - ((f14 * f17) * f11)) + ((f14 * f19) * f16)) - ((f25 * f23) * f16)) - ((f24 * f19) * f27)) + (f25 * f17 * f27);
        float f42 = ((((((f14 * f17) * f15) - ((f24 * f23) * f15)) - ((f14 * f19) * f12)) + ((f23 * f25) * f12)) + ((f24 * f19) * f26)) - ((f25 * f17) * f26);
        float f43 = ((((((f13 * f12) * f11) - ((f17 * f18) * f11)) - ((f13 * f15) * f16)) + ((f19 * f18) * f16)) + ((f17 * f15) * f21)) - ((f19 * f12) * f21);
        float f44 = ((((((f24 * f18) * f11) - ((f22 * f12) * f11)) + ((f22 * f15) * f16)) - ((f25 * f18) * f16)) - ((f24 * f15) * f21)) + (f25 * f12 * f21);
        float f45 = ((((((f22 * f17) * f11) - ((f24 * f13) * f11)) - ((f22 * f19) * f16)) + ((f25 * f13) * f16)) + ((f24 * f19) * f21)) - ((f25 * f17) * f21);
        float f46 = ((((((f24 * f13) * f15) - ((f22 * f17) * f15)) + ((f22 * f19) * f12)) - ((f13 * f25) * f12)) - ((f24 * f19) * f18)) + (f25 * f17 * f18);
        float f47 = 1.0f / f28;
        fArr[0] = f29 * f47;
        fArr[1] = f34 * f47;
        fArr[2] = f38 * f47;
        fArr[3] = f43 * f47;
        fArr[4] = f31 * f47;
        fArr[5] = f35 * f47;
        fArr[6] = f39 * f47;
        fArr[7] = f44 * f47;
        fArr[8] = f32 * f47;
        fArr[9] = f36 * f47;
        fArr[10] = f41 * f47;
        fArr[11] = f45 * f47;
        fArr[12] = f33 * f47;
        fArr[13] = f37 * f47;
        fArr[14] = f42 * f47;
        fArr[15] = f46 * f47;
        return this;
    }

    public Matrix4 lerp(Matrix4 matrix4, float f11) {
        for (int i11 = 0; i11 < 16; i11++) {
            float[] fArr = this.val;
            fArr[i11] = (fArr[i11] * (1.0f - f11)) + (matrix4.val[i11] * f11);
        }
        return this;
    }

    public Matrix4 mul(Matrix4 matrix4) {
        mul(this.val, matrix4.val);
        return this;
    }

    public Matrix4 mulLeft(Matrix4 matrix4) {
        Matrix4 matrix42 = tmpMat;
        matrix42.set(matrix4);
        mul(matrix42.val, this.val);
        return set(matrix42);
    }

    public Matrix4 rotate(Vector3 vector3, float f11) {
        if (f11 == 0.0f) {
            return this;
        }
        Quaternion quaternion = quat;
        quaternion.set(vector3, f11);
        return rotate(quaternion);
    }

    public Matrix4 rotateRad(Vector3 vector3, float f11) {
        if (f11 == 0.0f) {
            return this;
        }
        Quaternion quaternion = quat;
        quaternion.setFromAxisRad(vector3, f11);
        return rotate(quaternion);
    }

    public Matrix4 rotateTowardDirection(Vector3 vector3, Vector3 vector32) {
        Vector3 vector33 = l_vez;
        vector33.set(vector3).nor();
        Vector3 vector34 = l_vex;
        vector34.set(vector3).crs(vector32).nor();
        Vector3 vector35 = l_vey;
        vector35.set(vector34).crs(vector33).nor();
        float[] fArr = this.val;
        float f11 = fArr[0];
        float f12 = vector34.f12537x;
        float f13 = fArr[4];
        float f14 = vector34.f12538y;
        float f15 = fArr[8];
        float f16 = vector34.f12539z;
        float f17 = (f11 * f12) + (f13 * f14) + (f15 * f16);
        float f18 = vector35.f12537x;
        float f19 = vector35.f12538y;
        float f21 = vector35.f12539z;
        float f22 = (f11 * f18) + (f13 * f19) + (f15 * f21);
        float f23 = vector33.f12537x;
        float f24 = vector33.f12538y;
        float f25 = vector33.f12539z;
        float f26 = (f11 * (-f23)) + (f13 * (-f24)) + (f15 * (-f25));
        float f27 = fArr[1];
        float f28 = fArr[5];
        float f29 = fArr[9];
        float f31 = (f27 * f12) + (f28 * f14) + (f29 * f16);
        float f32 = (f27 * f18) + (f28 * f19) + (f29 * f21);
        float f33 = (f27 * (-f23)) + (f28 * (-f24)) + (f29 * (-f25));
        float f34 = fArr[2];
        float f35 = fArr[6];
        float f36 = fArr[10];
        float f37 = (f34 * f12) + (f35 * f14) + (f36 * f16);
        float f38 = (f34 * f18) + (f35 * f19) + (f36 * f21);
        float f39 = (f34 * (-f23)) + (f35 * (-f24)) + (f36 * (-f25));
        float f41 = fArr[3];
        float f42 = fArr[7];
        float f43 = fArr[11];
        fArr[0] = f17;
        fArr[1] = f31;
        fArr[2] = f37;
        fArr[3] = (f12 * f41) + (f14 * f42) + (f16 * f43);
        fArr[4] = f22;
        fArr[5] = f32;
        fArr[6] = f38;
        fArr[7] = (f18 * f41) + (f19 * f42) + (f21 * f43);
        fArr[8] = f26;
        fArr[9] = f33;
        fArr[10] = f39;
        fArr[11] = (f41 * (-f23)) + (f42 * (-f24)) + (f43 * (-f25));
        return this;
    }

    public Matrix4 rotateTowardTarget(Vector3 vector3, Vector3 vector32) {
        Vector3 vector33 = tmpVec;
        float f11 = vector3.f12537x;
        float[] fArr = this.val;
        vector33.set(f11 - fArr[12], vector3.f12538y - fArr[13], vector3.f12539z - fArr[14]);
        return rotateTowardDirection(vector33, vector32);
    }

    public Matrix4 scale(float f11, float f12, float f13) {
        float[] fArr = this.val;
        fArr[0] = fArr[0] * f11;
        fArr[4] = fArr[4] * f12;
        fArr[8] = fArr[8] * f13;
        fArr[1] = fArr[1] * f11;
        fArr[5] = fArr[5] * f12;
        fArr[9] = fArr[9] * f13;
        fArr[2] = fArr[2] * f11;
        fArr[6] = fArr[6] * f12;
        fArr[10] = fArr[10] * f13;
        fArr[3] = fArr[3] * f11;
        fArr[7] = fArr[7] * f12;
        fArr[11] = fArr[11] * f13;
        return this;
    }

    public Matrix4 scl(Vector3 vector3) {
        float[] fArr = this.val;
        fArr[0] = fArr[0] * vector3.f12537x;
        fArr[5] = fArr[5] * vector3.f12538y;
        fArr[10] = fArr[10] * vector3.f12539z;
        return this;
    }

    public Matrix4 set(Matrix4 matrix4) {
        return set(matrix4.val);
    }

    public Matrix4 setAsAffine(Affine2 affine2) {
        float[] fArr = this.val;
        fArr[0] = affine2.f12517m00;
        fArr[1] = affine2.f12518m10;
        fArr[4] = affine2.m01;
        fArr[5] = affine2.m11;
        fArr[12] = affine2.m02;
        fArr[13] = affine2.m12;
        return this;
    }

    public Matrix4 setFromEulerAngles(float f11, float f12, float f13) {
        Quaternion quaternion = quat;
        quaternion.setEulerAngles(f11, f12, f13);
        return set(quaternion);
    }

    public Matrix4 setFromEulerAnglesRad(float f11, float f12, float f13) {
        Quaternion quaternion = quat;
        quaternion.setEulerAnglesRad(f11, f12, f13);
        return set(quaternion);
    }

    public Matrix4 setToLookAt(Vector3 vector3, Vector3 vector32) {
        Vector3 vector33 = l_vez;
        vector33.set(vector3).nor();
        Vector3 vector34 = l_vex;
        vector34.set(vector3).crs(vector32).nor();
        Vector3 vector35 = l_vey;
        vector35.set(vector34).crs(vector33).nor();
        idt();
        float[] fArr = this.val;
        fArr[0] = vector34.f12537x;
        fArr[4] = vector34.f12538y;
        fArr[8] = vector34.f12539z;
        fArr[1] = vector35.f12537x;
        fArr[5] = vector35.f12538y;
        fArr[9] = vector35.f12539z;
        fArr[2] = -vector33.f12537x;
        fArr[6] = -vector33.f12538y;
        fArr[10] = -vector33.f12539z;
        return this;
    }

    public Matrix4 setToOrtho(float f11, float f12, float f13, float f14, float f15, float f16) {
        float f17 = f12 - f11;
        float f18 = f14 - f13;
        float f19 = f16 - f15;
        float f21 = (-(f12 + f11)) / f17;
        float f22 = (-(f14 + f13)) / f18;
        float[] fArr = this.val;
        fArr[0] = 2.0f / f17;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 2.0f / f18;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = (-2.0f) / f19;
        fArr[11] = 0.0f;
        fArr[12] = f21;
        fArr[13] = f22;
        fArr[14] = (-(f16 + f15)) / f19;
        fArr[15] = 1.0f;
        return this;
    }

    public Matrix4 setToOrtho2D(float f11, float f12, float f13, float f14) {
        setToOrtho(f11, f11 + f13, f12, f12 + f14, 0.0f, 1.0f);
        return this;
    }

    public Matrix4 setToProjection(float f11, float f12, float f13, float f14) {
        idt();
        float tan = (float) (1.0d / Math.tan((f13 * 0.017453292519943295d) / 2.0d));
        float f15 = f11 - f12;
        float f16 = (f12 + f11) / f15;
        float f17 = ((f12 * 2.0f) * f11) / f15;
        float[] fArr = this.val;
        fArr[0] = tan / f14;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = tan;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = f16;
        fArr[11] = -1.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = f17;
        fArr[15] = 0.0f;
        return this;
    }

    public Matrix4 setToRotation(Vector3 vector3, float f11) {
        if (f11 != 0.0f) {
            return set(quat.set(vector3, f11));
        }
        idt();
        return this;
    }

    public Matrix4 setToRotationRad(Vector3 vector3, float f11) {
        if (f11 != 0.0f) {
            return set(quat.setFromAxisRad(vector3, f11));
        }
        idt();
        return this;
    }

    public Matrix4 setToScaling(Vector3 vector3) {
        idt();
        float[] fArr = this.val;
        fArr[0] = vector3.f12537x;
        fArr[5] = vector3.f12538y;
        fArr[10] = vector3.f12539z;
        return this;
    }

    public Matrix4 setToTranslation(Vector3 vector3) {
        idt();
        float[] fArr = this.val;
        fArr[12] = vector3.f12537x;
        fArr[13] = vector3.f12538y;
        fArr[14] = vector3.f12539z;
        return this;
    }

    public Matrix4 setToTranslationAndScaling(Vector3 vector3, Vector3 vector32) {
        idt();
        float[] fArr = this.val;
        fArr[12] = vector3.f12537x;
        fArr[13] = vector3.f12538y;
        fArr[14] = vector3.f12539z;
        fArr[0] = vector32.f12537x;
        fArr[5] = vector32.f12538y;
        fArr[10] = vector32.f12539z;
        return this;
    }

    public Matrix4 setToWorld(Vector3 vector3, Vector3 vector32, Vector3 vector33) {
        Vector3 vector34 = tmpForward;
        vector34.set(vector32).nor();
        Vector3 vector35 = right;
        vector35.set(vector34).crs(vector33).nor();
        Vector3 vector36 = tmpUp;
        vector36.set(vector35).crs(vector34).nor();
        set(vector35, vector36, vector34.scl(-1.0f), vector3);
        return this;
    }

    public Matrix4 setTranslation(Vector3 vector3) {
        float[] fArr = this.val;
        fArr[12] = vector3.f12537x;
        fArr[13] = vector3.f12538y;
        fArr[14] = vector3.f12539z;
        return this;
    }

    public Matrix4 toNormalMatrix() {
        float[] fArr = this.val;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        return inv().tra();
    }

    public String toString() {
        return "[" + this.val[0] + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.val[4] + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.val[8] + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.val[12] + "]\n[" + this.val[1] + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.val[5] + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.val[9] + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.val[13] + "]\n[" + this.val[2] + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.val[6] + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.val[10] + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.val[14] + "]\n[" + this.val[3] + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.val[7] + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.val[11] + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.val[15] + "]\n";
    }

    public Matrix4 tra() {
        float[] fArr = this.val;
        float f11 = fArr[4];
        float f12 = fArr[8];
        float f13 = fArr[12];
        float f14 = fArr[9];
        float f15 = fArr[13];
        float f16 = fArr[14];
        fArr[4] = fArr[1];
        fArr[8] = fArr[2];
        fArr[12] = fArr[3];
        fArr[1] = f11;
        fArr[9] = fArr[6];
        fArr[13] = fArr[7];
        fArr[2] = f12;
        fArr[6] = f14;
        fArr[14] = fArr[11];
        fArr[3] = f13;
        fArr[7] = f15;
        fArr[11] = f16;
        return this;
    }

    public Matrix4 translate(Vector3 vector3) {
        return translate(vector3.f12537x, vector3.f12538y, vector3.f12539z);
    }

    public Matrix4 trn(Vector3 vector3) {
        float[] fArr = this.val;
        fArr[12] = fArr[12] + vector3.f12537x;
        fArr[13] = fArr[13] + vector3.f12538y;
        fArr[14] = fArr[14] + vector3.f12539z;
        return this;
    }

    public static float det(float[] fArr) {
        float f11 = fArr[3];
        float f12 = fArr[6];
        float f13 = fArr[9];
        float f14 = fArr[12];
        float f15 = fArr[2];
        float f16 = fArr[7];
        float f17 = fArr[5];
        float f18 = fArr[10];
        float f19 = fArr[1];
        float f21 = fArr[11];
        float f22 = fArr[8];
        float f23 = fArr[13];
        float f24 = (((((((((f11 * f12) * f13) * f14) - (((f15 * f16) * f13) * f14)) - (((f11 * f17) * f18) * f14)) + (((f19 * f16) * f18) * f14)) + (((f15 * f17) * f21) * f14)) - (((f19 * f12) * f21) * f14)) - (((f11 * f12) * f22) * f23)) + (f15 * f16 * f22 * f23);
        float f25 = fArr[4];
        float f26 = fArr[0];
        float f27 = (((f24 + (((f11 * f25) * f18) * f23)) - (((f26 * f16) * f18) * f23)) - (((f15 * f25) * f21) * f23)) + (f26 * f12 * f21 * f23);
        float f28 = fArr[14];
        float f29 = fArr[15];
        return (((((((((((f27 + (((f11 * f17) * f22) * f28)) - (((f19 * f16) * f22) * f28)) - (((f11 * f25) * f13) * f28)) + (((f16 * f26) * f13) * f28)) + (((f19 * f25) * f21) * f28)) - (((f26 * f17) * f21) * f28)) - (((f15 * f17) * f22) * f29)) + (((f19 * f12) * f22) * f29)) + (((f15 * f25) * f13) * f29)) - (((f12 * f26) * f13) * f29)) - (((f19 * f25) * f18) * f29)) + (f26 * f17 * f18 * f29);
    }

    public static void mul(float[] fArr, float[] fArr2) {
        float f11 = fArr[0];
        float f12 = fArr2[0];
        float f13 = fArr[4];
        float f14 = fArr2[1];
        float f15 = fArr[8];
        float f16 = fArr2[2];
        float f17 = fArr[12];
        float f18 = fArr2[3];
        float f19 = (f11 * f12) + (f13 * f14) + (f15 * f16) + (f17 * f18);
        float f21 = fArr2[4];
        float f22 = fArr2[5];
        float f23 = fArr2[6];
        float f24 = fArr2[7];
        float f25 = (f11 * f21) + (f13 * f22) + (f15 * f23) + (f17 * f24);
        float f26 = fArr2[8];
        float f27 = fArr2[9];
        float f28 = fArr2[10];
        float f29 = fArr2[11];
        float f31 = (f11 * f26) + (f13 * f27) + (f15 * f28) + (f17 * f29);
        float f32 = fArr2[12];
        float f33 = fArr2[13];
        float f34 = fArr2[14];
        float f35 = fArr2[15];
        float f36 = (f11 * f32) + (f13 * f33) + (f15 * f34) + (f17 * f35);
        float f37 = fArr[1];
        float f38 = fArr[5];
        float f39 = fArr[9];
        float f41 = fArr[13];
        float f42 = (f37 * f12) + (f38 * f14) + (f39 * f16) + (f41 * f18);
        float f43 = (f37 * f21) + (f38 * f22) + (f39 * f23) + (f41 * f24);
        float f44 = (f37 * f26) + (f38 * f27) + (f39 * f28) + (f41 * f29);
        float f45 = (f37 * f32) + (f38 * f33) + (f39 * f34) + (f41 * f35);
        float f46 = fArr[2];
        float f47 = fArr[6];
        float f48 = fArr[10];
        float f49 = fArr[14];
        float f51 = (f46 * f12) + (f47 * f14) + (f48 * f16) + (f49 * f18);
        float f52 = (f46 * f21) + (f47 * f22) + (f48 * f23) + (f49 * f24);
        float f53 = (f46 * f26) + (f47 * f27) + (f48 * f28) + (f49 * f29);
        float f54 = (f46 * f32) + (f47 * f33) + (f48 * f34) + (f49 * f35);
        float f55 = fArr[3];
        float f56 = fArr[7];
        float f57 = (f12 * f55) + (f14 * f56);
        float f58 = fArr[11];
        float f59 = f57 + (f16 * f58);
        float f61 = fArr[15];
        fArr[0] = f19;
        fArr[1] = f42;
        fArr[2] = f51;
        fArr[3] = f59 + (f18 * f61);
        fArr[4] = f25;
        fArr[5] = f43;
        fArr[6] = f52;
        fArr[7] = (f21 * f55) + (f22 * f56) + (f23 * f58) + (f24 * f61);
        fArr[8] = f31;
        fArr[9] = f44;
        fArr[10] = f53;
        fArr[11] = (f26 * f55) + (f27 * f56) + (f28 * f58) + (f29 * f61);
        fArr[12] = f36;
        fArr[13] = f45;
        fArr[14] = f54;
        fArr[15] = (f55 * f32) + (f56 * f33) + (f58 * f34) + (f61 * f35);
    }

    public Quaternion getRotation(Quaternion quaternion) {
        return quaternion.setFromMatrix(this);
    }

    public Matrix4 set(float[] fArr) {
        float[] fArr2 = this.val;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        return this;
    }

    public Matrix4 setToOrtho2D(float f11, float f12, float f13, float f14, float f15, float f16) {
        setToOrtho(f11, f11 + f13, f12, f12 + f14, f15, f16);
        return this;
    }

    public Matrix4 translate(float f11, float f12, float f13) {
        float[] fArr = this.val;
        fArr[12] = fArr[12] + (fArr[0] * f11) + (fArr[4] * f12) + (fArr[8] * f13);
        fArr[13] = fArr[13] + (fArr[1] * f11) + (fArr[5] * f12) + (fArr[9] * f13);
        fArr[14] = fArr[14] + (fArr[2] * f11) + (fArr[6] * f12) + (fArr[10] * f13);
        fArr[15] = fArr[15] + (fArr[3] * f11) + (fArr[7] * f12) + (fArr[11] * f13);
        return this;
    }

    public Matrix4 rotate(float f11, float f12, float f13, float f14) {
        if (f14 == 0.0f) {
            return this;
        }
        Quaternion quaternion = quat;
        quaternion.setFromAxis(f11, f12, f13, f14);
        return rotate(quaternion);
    }

    public Matrix4 rotateRad(float f11, float f12, float f13, float f14) {
        if (f14 == 0.0f) {
            return this;
        }
        Quaternion quaternion = quat;
        quaternion.setFromAxisRad(f11, f12, f13, f14);
        return rotate(quaternion);
    }

    public Matrix4 set(Quaternion quaternion) {
        return set(quaternion.f12530x, quaternion.f12531y, quaternion.f12532z, quaternion.f12529w);
    }

    public Matrix4 setToRotation(float f11, float f12, float f13, float f14) {
        if (f14 == 0.0f) {
            idt();
            return this;
        }
        return set(quat.setFromAxis(f11, f12, f13, f14));
    }

    public Matrix4 setToRotationRad(float f11, float f12, float f13, float f14) {
        if (f14 == 0.0f) {
            idt();
            return this;
        }
        return set(quat.setFromAxisRad(f11, f12, f13, f14));
    }

    public Matrix4 scl(float f11, float f12, float f13) {
        float[] fArr = this.val;
        fArr[0] = fArr[0] * f11;
        fArr[5] = fArr[5] * f12;
        fArr[10] = fArr[10] * f13;
        return this;
    }

    public Matrix4 set(float f11, float f12, float f13, float f14) {
        return set(0.0f, 0.0f, 0.0f, f11, f12, f13, f14);
    }

    public Matrix4 setTranslation(float f11, float f12, float f13) {
        float[] fArr = this.val;
        fArr[12] = f11;
        fArr[13] = f12;
        fArr[14] = f13;
        return this;
    }

    public Matrix4 trn(float f11, float f12, float f13) {
        float[] fArr = this.val;
        fArr[12] = fArr[12] + f11;
        fArr[13] = fArr[13] + f12;
        fArr[14] = fArr[14] + f13;
        return this;
    }

    public Matrix4 rotate(Quaternion quaternion) {
        float f11 = quaternion.f12530x;
        float f12 = quaternion.f12531y;
        float f13 = quaternion.f12532z;
        float f14 = quaternion.f12529w;
        float f15 = f11 * f11;
        float f16 = f11 * f12;
        float f17 = f11 * f13;
        float f18 = f11 * f14;
        float f19 = f12 * f12;
        float f21 = f12 * f13;
        float f22 = f12 * f14;
        float f23 = f13 * f13;
        float f24 = f13 * f14;
        float f25 = 1.0f - ((f19 + f23) * 2.0f);
        float f26 = (f16 - f24) * 2.0f;
        float f27 = (f17 + f22) * 2.0f;
        float f28 = (f16 + f24) * 2.0f;
        float f29 = 1.0f - ((f23 + f15) * 2.0f);
        float f31 = (f21 - f18) * 2.0f;
        float f32 = (f17 - f22) * 2.0f;
        float f33 = (f21 + f18) * 2.0f;
        float f34 = 1.0f - ((f15 + f19) * 2.0f);
        float[] fArr = this.val;
        float f35 = fArr[0];
        float f36 = fArr[4];
        float f37 = fArr[8];
        float f38 = (f35 * f25) + (f36 * f28) + (f37 * f32);
        float f39 = (f35 * f26) + (f36 * f29) + (f37 * f33);
        float f41 = (f35 * f27) + (f36 * f31) + (f37 * f34);
        float f42 = fArr[1];
        float f43 = fArr[5];
        float f44 = fArr[9];
        float f45 = (f42 * f25) + (f43 * f28) + (f44 * f32);
        float f46 = (f42 * f26) + (f43 * f29) + (f44 * f33);
        float f47 = (f42 * f27) + (f43 * f31) + (f44 * f34);
        float f48 = fArr[2];
        float f49 = fArr[6];
        float f51 = fArr[10];
        float f52 = (f48 * f25) + (f49 * f28) + (f51 * f32);
        float f53 = (f48 * f26) + (f49 * f29) + (f51 * f33);
        float f54 = (f48 * f27) + (f49 * f31) + (f51 * f34);
        float f55 = fArr[3];
        float f56 = fArr[7];
        float f57 = fArr[11];
        fArr[0] = f38;
        fArr[1] = f45;
        fArr[2] = f52;
        fArr[3] = (f25 * f55) + (f28 * f56) + (f32 * f57);
        fArr[4] = f39;
        fArr[5] = f46;
        fArr[6] = f53;
        fArr[7] = (f26 * f55) + (f29 * f56) + (f33 * f57);
        fArr[8] = f41;
        fArr[9] = f47;
        fArr[10] = f54;
        fArr[11] = (f55 * f27) + (f56 * f31) + (f57 * f34);
        return this;
    }

    public Matrix4 set(Vector3 vector3, Quaternion quaternion) {
        return set(vector3.f12537x, vector3.f12538y, vector3.f12539z, quaternion.f12530x, quaternion.f12531y, quaternion.f12532z, quaternion.f12529w);
    }

    public Matrix4 setToRotation(Vector3 vector3, Vector3 vector32) {
        return set(quat.setFromCross(vector3, vector32));
    }

    public Matrix4 setToScaling(float f11, float f12, float f13) {
        idt();
        float[] fArr = this.val;
        fArr[0] = f11;
        fArr[5] = f12;
        fArr[10] = f13;
        return this;
    }

    public Matrix4 setToTranslation(float f11, float f12, float f13) {
        idt();
        float[] fArr = this.val;
        fArr[12] = f11;
        fArr[13] = f12;
        fArr[14] = f13;
        return this;
    }

    public Matrix4 set(float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        float f18 = f14 * 2.0f;
        float f19 = f15 * 2.0f;
        float f21 = 2.0f * f16;
        float f22 = f17 * f18;
        float f23 = f17 * f19;
        float f24 = f17 * f21;
        float f25 = f18 * f14;
        float f26 = f14 * f19;
        float f27 = f14 * f21;
        float f28 = f19 * f15;
        float f29 = f15 * f21;
        float f31 = f21 * f16;
        float[] fArr = this.val;
        fArr[0] = 1.0f - (f28 + f31);
        fArr[4] = f26 - f24;
        fArr[8] = f27 + f23;
        fArr[12] = f11;
        fArr[1] = f26 + f24;
        fArr[5] = 1.0f - (f31 + f25);
        fArr[9] = f29 - f22;
        fArr[13] = f12;
        fArr[2] = f27 - f23;
        fArr[6] = f29 + f22;
        fArr[10] = 1.0f - (f25 + f28);
        fArr[14] = f13;
        fArr[3] = 0.0f;
        fArr[7] = 0.0f;
        fArr[11] = 0.0f;
        fArr[15] = 1.0f;
        return this;
    }

    public Matrix4 setToRotation(float f11, float f12, float f13, float f14, float f15, float f16) {
        return set(quat.setFromCross(f11, f12, f13, f14, f15, f16));
    }

    public Matrix4(Matrix4 matrix4) {
        this.val = new float[16];
        set(matrix4);
    }

    public Matrix4 scl(float f11) {
        float[] fArr = this.val;
        fArr[0] = fArr[0] * f11;
        fArr[5] = fArr[5] * f11;
        fArr[10] = fArr[10] * f11;
        return this;
    }

    public Matrix4 setAsAffine(Matrix4 matrix4) {
        float[] fArr = this.val;
        float[] fArr2 = matrix4.val;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[4] = fArr2[4];
        fArr[5] = fArr2[5];
        fArr[12] = fArr2[12];
        fArr[13] = fArr2[13];
        return this;
    }

    public Matrix4 setToTranslationAndScaling(float f11, float f12, float f13, float f14, float f15, float f16) {
        idt();
        float[] fArr = this.val;
        fArr[12] = f11;
        fArr[13] = f12;
        fArr[14] = f13;
        fArr[0] = f14;
        fArr[5] = f15;
        fArr[10] = f16;
        return this;
    }

    public Matrix4(float[] fArr) {
        this.val = new float[16];
        set(fArr);
    }

    public Matrix4 avg(Matrix4[] matrix4Arr) {
        float length = 1.0f / matrix4Arr.length;
        Vector3 vector3 = tmpVec;
        Matrix4 matrix4 = matrix4Arr[0];
        Vector3 vector32 = tmpUp;
        vector3.set(matrix4.getScale(vector32).scl(length));
        quat.set(matrix4Arr[0].getRotation(quat2).exp(length));
        tmpForward.set(matrix4Arr[0].getTranslation(vector32).scl(length));
        for (int i11 = 1; i11 < matrix4Arr.length; i11++) {
            Vector3 vector33 = tmpVec;
            Matrix4 matrix42 = matrix4Arr[i11];
            Vector3 vector34 = tmpUp;
            vector33.add(matrix42.getScale(vector34).scl(length));
            quat.mul(matrix4Arr[i11].getRotation(quat2).exp(length));
            tmpForward.add(matrix4Arr[i11].getTranslation(vector34).scl(length));
        }
        Quaternion quaternion = quat;
        quaternion.nor();
        setToScaling(tmpVec);
        rotate(quaternion);
        setTranslation(tmpForward);
        return this;
    }

    public Matrix4(Quaternion quaternion) {
        this.val = new float[16];
        set(quaternion);
    }

    public Matrix4 setToLookAt(Vector3 vector3, Vector3 vector32, Vector3 vector33) {
        Vector3 vector34 = tmpVec;
        vector34.set(vector32).sub(vector3);
        setToLookAt(vector34, vector33);
        mul(tmpMat.setToTranslation(-vector3.f12537x, -vector3.f12538y, -vector3.f12539z));
        return this;
    }

    public Matrix4(Vector3 vector3, Quaternion quaternion, Vector3 vector32) {
        this.val = new float[16];
        set(vector3, quaternion, vector32);
    }

    public static boolean inv(float[] fArr) {
        float det = det(fArr);
        if (det == 0.0f) {
            return false;
        }
        float f11 = fArr[9];
        float f12 = fArr[14];
        float f13 = fArr[7];
        float f14 = fArr[13];
        float f15 = fArr[10];
        float f16 = fArr[6];
        float f17 = fArr[11];
        float f18 = fArr[5];
        float f19 = fArr[15];
        float f21 = ((((((f11 * f12) * f13) - ((f14 * f15) * f13)) + ((f14 * f16) * f17)) - ((f18 * f12) * f17)) - ((f11 * f16) * f19)) + (f18 * f15 * f19);
        float f22 = fArr[12];
        float f23 = fArr[8];
        float f24 = fArr[4];
        float f25 = ((((((f22 * f15) * f13) - ((f23 * f12) * f13)) - ((f22 * f16) * f17)) + ((f24 * f12) * f17)) + ((f23 * f16) * f19)) - ((f24 * f15) * f19);
        float f26 = ((((((f23 * f14) * f13) - ((f22 * f11) * f13)) + ((f22 * f18) * f17)) - ((f24 * f14) * f17)) - ((f23 * f18) * f19)) + (f24 * f11 * f19);
        float f27 = ((((((f22 * f11) * f16) - ((f23 * f14) * f16)) - ((f22 * f18) * f15)) + ((f24 * f14) * f15)) + ((f23 * f18) * f12)) - ((f24 * f11) * f12);
        float f28 = fArr[3];
        float f29 = fArr[2];
        float f31 = fArr[1];
        float f32 = ((((((f14 * f15) * f28) - ((f11 * f12) * f28)) - ((f14 * f29) * f17)) + ((f31 * f12) * f17)) + ((f11 * f29) * f19)) - ((f31 * f15) * f19);
        float f33 = fArr[0];
        float f34 = ((((((f23 * f12) * f28) - ((f22 * f15) * f28)) + ((f22 * f29) * f17)) - ((f33 * f12) * f17)) - ((f23 * f29) * f19)) + (f33 * f15 * f19);
        float f35 = ((((((f22 * f11) * f28) - ((f23 * f14) * f28)) - ((f22 * f31) * f17)) + ((f33 * f14) * f17)) + ((f23 * f31) * f19)) - ((f33 * f11) * f19);
        float f36 = ((((((f23 * f14) * f29) - ((f22 * f11) * f29)) + ((f22 * f31) * f15)) - ((f33 * f14) * f15)) - ((f23 * f31) * f12)) + (f33 * f11 * f12);
        float f37 = ((((((f18 * f12) * f28) - ((f14 * f16) * f28)) + ((f14 * f29) * f13)) - ((f31 * f12) * f13)) - ((f18 * f29) * f19)) + (f31 * f16 * f19);
        float f38 = ((((((f22 * f16) * f28) - ((f24 * f12) * f28)) - ((f22 * f29) * f13)) + ((f33 * f12) * f13)) + ((f24 * f29) * f19)) - ((f33 * f16) * f19);
        float f39 = ((((((f24 * f14) * f28) - ((f22 * f18) * f28)) + ((f22 * f31) * f13)) - ((f33 * f14) * f13)) - ((f24 * f31) * f19)) + (f33 * f18 * f19);
        float f41 = ((((((f22 * f18) * f29) - ((f24 * f14) * f29)) - ((f22 * f31) * f16)) + ((f14 * f33) * f16)) + ((f24 * f31) * f12)) - ((f33 * f18) * f12);
        float f42 = ((((((f11 * f16) * f28) - ((f18 * f15) * f28)) - ((f11 * f29) * f13)) + ((f31 * f15) * f13)) + ((f18 * f29) * f17)) - ((f31 * f16) * f17);
        float f43 = ((((((f24 * f15) * f28) - ((f23 * f16) * f28)) + ((f23 * f29) * f13)) - ((f33 * f15) * f13)) - ((f24 * f29) * f17)) + (f33 * f16 * f17);
        float f44 = ((((((f23 * f18) * f28) - ((f24 * f11) * f28)) - ((f23 * f31) * f13)) + ((f33 * f11) * f13)) + ((f24 * f31) * f17)) - ((f33 * f18) * f17);
        float f45 = ((((((f24 * f11) * f29) - ((f23 * f18) * f29)) + ((f23 * f31) * f16)) - ((f11 * f33) * f16)) - ((f24 * f31) * f15)) + (f33 * f18 * f15);
        float f46 = 1.0f / det;
        fArr[0] = f21 * f46;
        fArr[1] = f32 * f46;
        fArr[2] = f37 * f46;
        fArr[3] = f42 * f46;
        fArr[4] = f25 * f46;
        fArr[5] = f34 * f46;
        fArr[6] = f38 * f46;
        fArr[7] = f43 * f46;
        fArr[8] = f26 * f46;
        fArr[9] = f35 * f46;
        fArr[10] = f39 * f46;
        fArr[11] = f44 * f46;
        fArr[12] = f27 * f46;
        fArr[13] = f36 * f46;
        fArr[14] = f41 * f46;
        fArr[15] = f45 * f46;
        return true;
    }

    public Matrix4 setToProjection(float f11, float f12, float f13, float f14, float f15, float f16) {
        float f17 = f15 * 2.0f;
        float f18 = f12 - f11;
        float f19 = f14 - f13;
        float f21 = (f12 + f11) / f18;
        float f22 = (f14 + f13) / f19;
        float f23 = f15 - f16;
        float f24 = (f16 + f15) / f23;
        float f25 = ((f16 * 2.0f) * f15) / f23;
        float[] fArr = this.val;
        fArr[0] = f17 / f18;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = f17 / f19;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = f21;
        fArr[9] = f22;
        fArr[10] = f24;
        fArr[11] = -1.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = f25;
        fArr[15] = 0.0f;
        return this;
    }

    public Matrix4 avg(Matrix4[] matrix4Arr, float[] fArr) {
        Vector3 vector3 = tmpVec;
        Matrix4 matrix4 = matrix4Arr[0];
        Vector3 vector32 = tmpUp;
        vector3.set(matrix4.getScale(vector32).scl(fArr[0]));
        quat.set(matrix4Arr[0].getRotation(quat2).exp(fArr[0]));
        tmpForward.set(matrix4Arr[0].getTranslation(vector32).scl(fArr[0]));
        for (int i11 = 1; i11 < matrix4Arr.length; i11++) {
            Vector3 vector33 = tmpVec;
            Matrix4 matrix42 = matrix4Arr[i11];
            Vector3 vector34 = tmpUp;
            vector33.add(matrix42.getScale(vector34).scl(fArr[i11]));
            quat.mul(matrix4Arr[i11].getRotation(quat2).exp(fArr[i11]));
            tmpForward.add(matrix4Arr[i11].getTranslation(vector34).scl(fArr[i11]));
        }
        Quaternion quaternion = quat;
        quaternion.nor();
        setToScaling(tmpVec);
        rotate(quaternion);
        setTranslation(tmpForward);
        return this;
    }

    public Matrix4 rotate(Vector3 vector3, Vector3 vector32) {
        return rotate(quat.setFromCross(vector3, vector32));
    }

    public Matrix4 set(Vector3 vector3, Quaternion quaternion, Vector3 vector32) {
        return set(vector3.f12537x, vector3.f12538y, vector3.f12539z, quaternion.f12530x, quaternion.f12531y, quaternion.f12532z, quaternion.f12529w, vector32.f12537x, vector32.f12538y, vector32.f12539z);
    }

    public Matrix4 set(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21) {
        float f22 = f14 * 2.0f;
        float f23 = f15 * 2.0f;
        float f24 = 2.0f * f16;
        float f25 = f17 * f22;
        float f26 = f17 * f23;
        float f27 = f17 * f24;
        float f28 = f22 * f14;
        float f29 = f14 * f23;
        float f31 = f14 * f24;
        float f32 = f23 * f15;
        float f33 = f15 * f24;
        float f34 = f24 * f16;
        float[] fArr = this.val;
        fArr[0] = (1.0f - (f32 + f34)) * f18;
        fArr[4] = (f29 - f27) * f19;
        fArr[8] = (f31 + f26) * f21;
        fArr[12] = f11;
        fArr[1] = (f29 + f27) * f18;
        fArr[5] = (1.0f - (f34 + f28)) * f19;
        fArr[9] = (f33 - f25) * f21;
        fArr[13] = f12;
        fArr[2] = f18 * (f31 - f26);
        fArr[6] = f19 * (f33 + f25);
        fArr[10] = (1.0f - (f28 + f32)) * f21;
        fArr[14] = f13;
        fArr[3] = 0.0f;
        fArr[7] = 0.0f;
        fArr[11] = 0.0f;
        fArr[15] = 1.0f;
        return this;
    }

    public Matrix4 set(Vector3 vector3, Vector3 vector32, Vector3 vector33, Vector3 vector34) {
        float[] fArr = this.val;
        fArr[0] = vector3.f12537x;
        fArr[4] = vector3.f12538y;
        fArr[8] = vector3.f12539z;
        fArr[1] = vector32.f12537x;
        fArr[5] = vector32.f12538y;
        fArr[9] = vector32.f12539z;
        fArr[2] = vector33.f12537x;
        fArr[6] = vector33.f12538y;
        fArr[10] = vector33.f12539z;
        fArr[12] = vector34.f12537x;
        fArr[13] = vector34.f12538y;
        fArr[14] = vector34.f12539z;
        fArr[3] = 0.0f;
        fArr[7] = 0.0f;
        fArr[11] = 0.0f;
        fArr[15] = 1.0f;
        return this;
    }

    public Matrix4 set(Matrix3 matrix3) {
        float[] fArr = this.val;
        float[] fArr2 = matrix3.val;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[2] = fArr2[2];
        fArr[3] = 0.0f;
        fArr[4] = fArr2[3];
        fArr[5] = fArr2[4];
        fArr[6] = fArr2[5];
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = fArr2[6];
        fArr[13] = fArr2[7];
        fArr[14] = 0.0f;
        fArr[15] = fArr2[8];
        return this;
    }

    public Matrix4 set(Affine2 affine2) {
        float[] fArr = this.val;
        fArr[0] = affine2.f12517m00;
        fArr[1] = affine2.f12518m10;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = affine2.m01;
        fArr[5] = affine2.m11;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = affine2.m02;
        fArr[13] = affine2.m12;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
        return this;
    }
}
