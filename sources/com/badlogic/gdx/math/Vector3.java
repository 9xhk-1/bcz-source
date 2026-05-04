package com.badlogic.gdx.math;

import a3.e0;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class Vector3 implements Serializable, t<Vector3> {
    private static final long serialVersionUID = 3840054589595372522L;

    /* renamed from: x, reason: collision with root package name */
    public float f12537x;

    /* renamed from: y, reason: collision with root package name */
    public float f12538y;

    /* renamed from: z, reason: collision with root package name */
    public float f12539z;
    public static final Vector3 X = new Vector3(1.0f, 0.0f, 0.0f);
    public static final Vector3 Y = new Vector3(0.0f, 1.0f, 0.0f);
    public static final Vector3 Z = new Vector3(0.0f, 0.0f, 1.0f);
    public static final Vector3 Zero = new Vector3(0.0f, 0.0f, 0.0f);
    private static final Matrix4 tmpMat = new Matrix4();

    public Vector3() {
    }

    public static float dot(float f11, float f12, float f13, float f14, float f15, float f16) {
        return (f11 * f14) + (f12 * f15) + (f13 * f16);
    }

    public static float dst2(float f11, float f12, float f13, float f14, float f15, float f16) {
        float f17 = f14 - f11;
        float f18 = f15 - f12;
        float f19 = f16 - f13;
        return (f17 * f17) + (f18 * f18) + (f19 * f19);
    }

    public static float len(float f11, float f12, float f13) {
        return (float) Math.sqrt((f11 * f11) + (f12 * f12) + (f13 * f13));
    }

    public static float len2(float f11, float f12, float f13) {
        return (f11 * f11) + (f12 * f12) + (f13 * f13);
    }

    public Vector3 crs(Vector3 vector3) {
        float f11 = this.f12538y;
        float f12 = vector3.f12539z;
        float f13 = this.f12539z;
        float f14 = vector3.f12538y;
        float f15 = (f11 * f12) - (f13 * f14);
        float f16 = vector3.f12537x;
        float f17 = this.f12537x;
        return set(f15, (f13 * f16) - (f12 * f17), (f17 * f14) - (f11 * f16));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Vector3 vector3 = (Vector3) obj;
        return e0.b(this.f12537x) == e0.b(vector3.f12537x) && e0.b(this.f12538y) == e0.b(vector3.f12538y) && e0.b(this.f12539z) == e0.b(vector3.f12539z);
    }

    public Vector3 fromString(String str) {
        int indexOf = str.indexOf(44, 1);
        int i11 = indexOf + 1;
        int indexOf2 = str.indexOf(44, i11);
        if (indexOf != -1 && indexOf2 != -1 && str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
            try {
                return set(Float.parseFloat(str.substring(1, indexOf)), Float.parseFloat(str.substring(i11, indexOf2)), Float.parseFloat(str.substring(indexOf2 + 1, str.length() - 1)));
            } catch (NumberFormatException unused) {
            }
        }
        throw new GdxRuntimeException("Malformed Vector3: " + str);
    }

    public int hashCode() {
        return ((((e0.b(this.f12537x) + 31) * 31) + e0.b(this.f12538y)) * 31) + e0.b(this.f12539z);
    }

    public boolean idt(Vector3 vector3) {
        return this.f12537x == vector3.f12537x && this.f12538y == vector3.f12538y && this.f12539z == vector3.f12539z;
    }

    @Override // com.badlogic.gdx.math.t
    public boolean isUnit() {
        return isUnit(1.0E-9f);
    }

    @Override // com.badlogic.gdx.math.t
    public boolean isZero() {
        return this.f12537x == 0.0f && this.f12538y == 0.0f && this.f12539z == 0.0f;
    }

    public Vector3 mul(Matrix4 matrix4) {
        float[] fArr = matrix4.val;
        float f11 = this.f12537x;
        float f12 = fArr[0] * f11;
        float f13 = this.f12538y;
        float f14 = f12 + (fArr[4] * f13);
        float f15 = this.f12539z;
        return set(f14 + (fArr[8] * f15) + fArr[12], (fArr[1] * f11) + (fArr[5] * f13) + (fArr[9] * f15) + fArr[13], (f11 * fArr[2]) + (f13 * fArr[6]) + (f15 * fArr[10]) + fArr[14]);
    }

    public Vector3 mul4x3(float[] fArr) {
        float f11 = this.f12537x;
        float f12 = fArr[0] * f11;
        float f13 = this.f12538y;
        float f14 = f12 + (fArr[3] * f13);
        float f15 = this.f12539z;
        return set(f14 + (fArr[6] * f15) + fArr[9], (fArr[1] * f11) + (fArr[4] * f13) + (fArr[7] * f15) + fArr[10], (f11 * fArr[2]) + (f13 * fArr[5]) + (f15 * fArr[8]) + fArr[11]);
    }

    public Vector3 prj(Matrix4 matrix4) {
        float[] fArr = matrix4.val;
        float f11 = this.f12537x;
        float f12 = fArr[3] * f11;
        float f13 = this.f12538y;
        float f14 = f12 + (fArr[7] * f13);
        float f15 = this.f12539z;
        float f16 = 1.0f / ((f14 + (fArr[11] * f15)) + fArr[15]);
        return set(((fArr[0] * f11) + (fArr[4] * f13) + (fArr[8] * f15) + fArr[12]) * f16, ((fArr[1] * f11) + (fArr[5] * f13) + (fArr[9] * f15) + fArr[13]) * f16, ((f11 * fArr[2]) + (f13 * fArr[6]) + (f15 * fArr[10]) + fArr[14]) * f16);
    }

    public Vector3 rot(Matrix4 matrix4) {
        float[] fArr = matrix4.val;
        float f11 = this.f12537x;
        float f12 = fArr[0] * f11;
        float f13 = this.f12538y;
        float f14 = f12 + (fArr[4] * f13);
        float f15 = this.f12539z;
        return set(f14 + (fArr[8] * f15), (fArr[1] * f11) + (fArr[5] * f13) + (fArr[9] * f15), (f11 * fArr[2]) + (f13 * fArr[6]) + (f15 * fArr[10]));
    }

    public Vector3 rotate(float f11, float f12, float f13, float f14) {
        return mul(tmpMat.setToRotation(f12, f13, f14, f11));
    }

    public Vector3 rotateRad(float f11, float f12, float f13, float f14) {
        return mul(tmpMat.setToRotationRad(f12, f13, f14, f11));
    }

    public Vector3 setFromSpherical(float f11, float f12) {
        float s11 = n.s(f12);
        float Z2 = n.Z(f12);
        return set(n.s(f11) * Z2, n.Z(f11) * Z2, s11);
    }

    public Vector3 slerp(Vector3 vector3, float f11) {
        float dot = dot(vector3);
        double d11 = dot;
        if (d11 > 0.9995d || d11 < -0.9995d) {
            return lerp(vector3, f11);
        }
        double acos = ((float) Math.acos(d11)) * f11;
        float sin = (float) Math.sin(acos);
        float f12 = vector3.f12537x - (this.f12537x * dot);
        float f13 = vector3.f12538y - (this.f12538y * dot);
        float f14 = vector3.f12539z - (this.f12539z * dot);
        float f15 = (f12 * f12) + (f13 * f13) + (f14 * f14);
        float sqrt = sin * (f15 >= 1.0E-4f ? 1.0f / ((float) Math.sqrt(f15)) : 1.0f);
        return scl((float) Math.cos(acos)).add(f12 * sqrt, f13 * sqrt, f14 * sqrt).nor();
    }

    public String toString() {
        return pn.j.f81006c + this.f12537x + "," + this.f12538y + "," + this.f12539z + pn.j.f81007d;
    }

    public Vector3 traMul(Matrix4 matrix4) {
        float[] fArr = matrix4.val;
        float f11 = this.f12537x;
        float f12 = fArr[0] * f11;
        float f13 = this.f12538y;
        float f14 = f12 + (fArr[1] * f13);
        float f15 = this.f12539z;
        return set(f14 + (fArr[2] * f15) + fArr[3], (fArr[4] * f11) + (fArr[5] * f13) + (fArr[6] * f15) + fArr[7], (f11 * fArr[8]) + (f13 * fArr[9]) + (f15 * fArr[10]) + fArr[11]);
    }

    public Vector3 unrotate(Matrix4 matrix4) {
        float[] fArr = matrix4.val;
        float f11 = this.f12537x;
        float f12 = fArr[0] * f11;
        float f13 = this.f12538y;
        float f14 = f12 + (fArr[1] * f13);
        float f15 = this.f12539z;
        return set(f14 + (fArr[2] * f15), (fArr[4] * f11) + (fArr[5] * f13) + (fArr[6] * f15), (f11 * fArr[8]) + (f13 * fArr[9]) + (f15 * fArr[10]));
    }

    public Vector3 untransform(Matrix4 matrix4) {
        float[] fArr = matrix4.val;
        float f11 = this.f12537x;
        float f12 = fArr[12];
        float f13 = f11 - f12;
        this.f12537x = f13;
        float f14 = this.f12538y - f12;
        this.f12538y = f14;
        float f15 = this.f12539z - f12;
        this.f12539z = f15;
        return set((fArr[0] * f13) + (fArr[1] * f14) + (fArr[2] * f15), (fArr[4] * f13) + (fArr[5] * f14) + (fArr[6] * f15), (f13 * fArr[8]) + (f14 * fArr[9]) + (f15 * fArr[10]));
    }

    public Vector3(float f11, float f12, float f13) {
        set(f11, f12, f13);
    }

    public static float dst(float f11, float f12, float f13, float f14, float f15, float f16) {
        float f17 = f14 - f11;
        float f18 = f15 - f12;
        float f19 = f16 - f13;
        return (float) Math.sqrt((f17 * f17) + (f18 * f18) + (f19 * f19));
    }

    @Override // com.badlogic.gdx.math.t
    public Vector3 add(Vector3 vector3) {
        return add(vector3.f12537x, vector3.f12538y, vector3.f12539z);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.badlogic.gdx.math.t
    public Vector3 clamp(float f11, float f12) {
        float len2 = len2();
        if (len2 != 0.0f) {
            if (len2 > f12 * f12) {
                return scl((float) Math.sqrt(r4 / len2));
            }
            if (len2 < f11 * f11) {
                return scl((float) Math.sqrt(r3 / len2));
            }
        }
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.badlogic.gdx.math.t
    public Vector3 cpy() {
        return new Vector3(this);
    }

    public Vector3 crs(float f11, float f12, float f13) {
        float f14 = this.f12538y;
        float f15 = this.f12539z;
        float f16 = (f14 * f13) - (f15 * f12);
        float f17 = this.f12537x;
        return set(f16, (f15 * f11) - (f13 * f17), (f17 * f12) - (f14 * f11));
    }

    @Override // com.badlogic.gdx.math.t
    public boolean epsilonEquals(Vector3 vector3, float f11) {
        return vector3 != null && Math.abs(vector3.f12537x - this.f12537x) <= f11 && Math.abs(vector3.f12538y - this.f12538y) <= f11 && Math.abs(vector3.f12539z - this.f12539z) <= f11;
    }

    @Override // com.badlogic.gdx.math.t
    public boolean hasOppositeDirection(Vector3 vector3) {
        return dot(vector3) < 0.0f;
    }

    @Override // com.badlogic.gdx.math.t
    public boolean hasSameDirection(Vector3 vector3) {
        return dot(vector3) > 0.0f;
    }

    @Override // com.badlogic.gdx.math.t
    public Vector3 interpolate(Vector3 vector3, float f11, l lVar) {
        return lerp(vector3, lVar.b(0.0f, 1.0f, f11));
    }

    @Override // com.badlogic.gdx.math.t
    public boolean isUnit(float f11) {
        return Math.abs(len2() - 1.0f) < f11;
    }

    @Override // com.badlogic.gdx.math.t
    public boolean isZero(float f11) {
        return len2() < f11;
    }

    @Override // com.badlogic.gdx.math.t
    public float len() {
        float f11 = this.f12537x;
        float f12 = this.f12538y;
        float f13 = (f11 * f11) + (f12 * f12);
        float f14 = this.f12539z;
        return (float) Math.sqrt(f13 + (f14 * f14));
    }

    @Override // com.badlogic.gdx.math.t
    public float len2() {
        float f11 = this.f12537x;
        float f12 = this.f12538y;
        float f13 = (f11 * f11) + (f12 * f12);
        float f14 = this.f12539z;
        return f13 + (f14 * f14);
    }

    @Override // com.badlogic.gdx.math.t
    public Vector3 lerp(Vector3 vector3, float f11) {
        float f12 = this.f12537x;
        this.f12537x = f12 + ((vector3.f12537x - f12) * f11);
        float f13 = this.f12538y;
        this.f12538y = f13 + ((vector3.f12538y - f13) * f11);
        float f14 = this.f12539z;
        this.f12539z = f14 + (f11 * (vector3.f12539z - f14));
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.badlogic.gdx.math.t
    public Vector3 limit(float f11) {
        return limit2(f11 * f11);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.badlogic.gdx.math.t
    public Vector3 limit2(float f11) {
        if (len2() > f11) {
            scl((float) Math.sqrt(f11 / r0));
        }
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.badlogic.gdx.math.t
    public Vector3 nor() {
        float len2 = len2();
        return (len2 == 0.0f || len2 == 1.0f) ? this : scl(1.0f / ((float) Math.sqrt(len2)));
    }

    public Vector3 rotate(Vector3 vector3, float f11) {
        Matrix4 matrix4 = tmpMat;
        matrix4.setToRotation(vector3, f11);
        return mul(matrix4);
    }

    public Vector3 rotateRad(Vector3 vector3, float f11) {
        Matrix4 matrix4 = tmpMat;
        matrix4.setToRotationRad(vector3, f11);
        return mul(matrix4);
    }

    public Vector3 set(float f11, float f12, float f13) {
        this.f12537x = f11;
        this.f12538y = f12;
        this.f12539z = f13;
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.badlogic.gdx.math.t
    public Vector3 setLength(float f11) {
        return setLength2(f11 * f11);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.badlogic.gdx.math.t
    public Vector3 setLength2(float f11) {
        float len2 = len2();
        return (len2 == 0.0f || len2 == f11) ? this : scl((float) Math.sqrt(f11 / len2));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.badlogic.gdx.math.t
    public Vector3 setToRandomDirection() {
        return setFromSpherical(n.J() * 6.2831855f, (float) Math.acos((n.J() * 2.0f) - 1.0f));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.badlogic.gdx.math.t
    public Vector3 setZero() {
        this.f12537x = 0.0f;
        this.f12538y = 0.0f;
        this.f12539z = 0.0f;
        return this;
    }

    @Override // com.badlogic.gdx.math.t
    public Vector3 sub(Vector3 vector3) {
        return sub(vector3.f12537x, vector3.f12538y, vector3.f12539z);
    }

    public Vector3 add(float f11, float f12, float f13) {
        return set(this.f12537x + f11, this.f12538y + f12, this.f12539z + f13);
    }

    @Override // com.badlogic.gdx.math.t
    public float dot(Vector3 vector3) {
        return (this.f12537x * vector3.f12537x) + (this.f12538y * vector3.f12538y) + (this.f12539z * vector3.f12539z);
    }

    @Override // com.badlogic.gdx.math.t
    public float dst(Vector3 vector3) {
        float f11 = vector3.f12537x - this.f12537x;
        float f12 = vector3.f12538y - this.f12538y;
        float f13 = vector3.f12539z - this.f12539z;
        return (float) Math.sqrt((f11 * f11) + (f12 * f12) + (f13 * f13));
    }

    @Override // com.badlogic.gdx.math.t
    public float dst2(Vector3 vector3) {
        float f11 = vector3.f12537x - this.f12537x;
        float f12 = vector3.f12538y - this.f12538y;
        float f13 = vector3.f12539z - this.f12539z;
        return (f11 * f11) + (f12 * f12) + (f13 * f13);
    }

    @Override // com.badlogic.gdx.math.t
    public boolean isCollinear(Vector3 vector3, float f11) {
        return isOnLine(vector3, f11) && hasSameDirection(vector3);
    }

    @Override // com.badlogic.gdx.math.t
    public boolean isCollinearOpposite(Vector3 vector3, float f11) {
        return isOnLine(vector3, f11) && hasOppositeDirection(vector3);
    }

    @Override // com.badlogic.gdx.math.t
    public boolean isOnLine(Vector3 vector3, float f11) {
        float f12 = this.f12538y;
        float f13 = vector3.f12539z;
        float f14 = this.f12539z;
        float f15 = vector3.f12538y;
        float f16 = (f12 * f13) - (f14 * f15);
        float f17 = vector3.f12537x;
        float f18 = this.f12537x;
        return len2(f16, (f14 * f17) - (f13 * f18), (f18 * f15) - (f12 * f17)) <= f11;
    }

    @Override // com.badlogic.gdx.math.t
    public boolean isPerpendicular(Vector3 vector3) {
        return n.z(dot(vector3));
    }

    public Vector3 mul(Matrix3 matrix3) {
        float[] fArr = matrix3.val;
        float f11 = this.f12537x;
        float f12 = fArr[0] * f11;
        float f13 = this.f12538y;
        float f14 = f12 + (fArr[3] * f13);
        float f15 = this.f12539z;
        return set(f14 + (fArr[6] * f15), (fArr[1] * f11) + (fArr[4] * f13) + (fArr[7] * f15), (f11 * fArr[2]) + (f13 * fArr[5]) + (f15 * fArr[8]));
    }

    @Override // com.badlogic.gdx.math.t
    public Vector3 mulAdd(Vector3 vector3, float f11) {
        this.f12537x += vector3.f12537x * f11;
        this.f12538y += vector3.f12538y * f11;
        this.f12539z += vector3.f12539z * f11;
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.badlogic.gdx.math.t
    public Vector3 scl(float f11) {
        return set(this.f12537x * f11, this.f12538y * f11, this.f12539z * f11);
    }

    public Vector3 sub(float f11, float f12, float f13) {
        return set(this.f12537x - f11, this.f12538y - f12, this.f12539z - f13);
    }

    public Vector3 traMul(Matrix3 matrix3) {
        float[] fArr = matrix3.val;
        float f11 = this.f12537x;
        float f12 = fArr[0] * f11;
        float f13 = this.f12538y;
        float f14 = f12 + (fArr[1] * f13);
        float f15 = this.f12539z;
        return set(f14 + (fArr[2] * f15), (fArr[3] * f11) + (fArr[4] * f13) + (fArr[5] * f15), (f11 * fArr[6]) + (f13 * fArr[7]) + (f15 * fArr[8]));
    }

    public Vector3(Vector3 vector3) {
        set(vector3);
    }

    public Vector3 add(float f11) {
        return set(this.f12537x + f11, this.f12538y + f11, this.f12539z + f11);
    }

    public float dot(float f11, float f12, float f13) {
        return (this.f12537x * f11) + (this.f12538y * f12) + (this.f12539z * f13);
    }

    @Override // com.badlogic.gdx.math.t
    public boolean isCollinear(Vector3 vector3) {
        return isOnLine(vector3) && hasSameDirection(vector3);
    }

    @Override // com.badlogic.gdx.math.t
    public boolean isCollinearOpposite(Vector3 vector3) {
        return isOnLine(vector3) && hasOppositeDirection(vector3);
    }

    @Override // com.badlogic.gdx.math.t
    public boolean isOnLine(Vector3 vector3) {
        float f11 = this.f12538y;
        float f12 = vector3.f12539z;
        float f13 = this.f12539z;
        float f14 = vector3.f12538y;
        float f15 = (f11 * f12) - (f13 * f14);
        float f16 = vector3.f12537x;
        float f17 = this.f12537x;
        return len2(f15, (f13 * f16) - (f12 * f17), (f17 * f14) - (f11 * f16)) <= 1.0E-6f;
    }

    @Override // com.badlogic.gdx.math.t
    public boolean isPerpendicular(Vector3 vector3, float f11) {
        return n.A(dot(vector3), f11);
    }

    @Override // com.badlogic.gdx.math.t
    public Vector3 scl(Vector3 vector3) {
        return set(this.f12537x * vector3.f12537x, this.f12538y * vector3.f12538y, this.f12539z * vector3.f12539z);
    }

    public Vector3 sub(float f11) {
        return set(this.f12537x - f11, this.f12538y - f11, this.f12539z - f11);
    }

    public boolean epsilonEquals(float f11, float f12, float f13, float f14) {
        return Math.abs(f11 - this.f12537x) <= f14 && Math.abs(f12 - this.f12538y) <= f14 && Math.abs(f13 - this.f12539z) <= f14;
    }

    public Vector3 mul(Quaternion quaternion) {
        return quaternion.transform(this);
    }

    public Vector3 scl(float f11, float f12, float f13) {
        return set(this.f12537x * f11, this.f12538y * f12, this.f12539z * f13);
    }

    @Override // com.badlogic.gdx.math.t
    public Vector3 set(Vector3 vector3) {
        return set(vector3.f12537x, vector3.f12538y, vector3.f12539z);
    }

    public Vector3(float[] fArr) {
        set(fArr[0], fArr[1], fArr[2]);
    }

    public float dst2(float f11, float f12, float f13) {
        float f14 = f11 - this.f12537x;
        float f15 = f12 - this.f12538y;
        float f16 = f13 - this.f12539z;
        return (f14 * f14) + (f15 * f15) + (f16 * f16);
    }

    @Override // com.badlogic.gdx.math.t
    public Vector3 mulAdd(Vector3 vector3, Vector3 vector32) {
        this.f12537x += vector3.f12537x * vector32.f12537x;
        this.f12538y += vector3.f12538y * vector32.f12538y;
        this.f12539z += vector3.f12539z * vector32.f12539z;
        return this;
    }

    public Vector3 set(float[] fArr) {
        return set(fArr[0], fArr[1], fArr[2]);
    }

    public float dst(float f11, float f12, float f13) {
        float f14 = f11 - this.f12537x;
        float f15 = f12 - this.f12538y;
        float f16 = f13 - this.f12539z;
        return (float) Math.sqrt((f14 * f14) + (f15 * f15) + (f16 * f16));
    }

    public Vector3 set(Vector2 vector2, float f11) {
        return set(vector2.f12535x, vector2.f12536y, f11);
    }

    public Vector3(Vector2 vector2, float f11) {
        set(vector2.f12535x, vector2.f12536y, f11);
    }

    public boolean epsilonEquals(Vector3 vector3) {
        return epsilonEquals(vector3, 1.0E-6f);
    }

    public boolean epsilonEquals(float f11, float f12, float f13) {
        return epsilonEquals(f11, f12, f13, 1.0E-6f);
    }
}
