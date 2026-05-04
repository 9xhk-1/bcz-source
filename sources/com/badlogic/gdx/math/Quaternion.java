package com.badlogic.gdx.math;

import a3.e0;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class Quaternion implements Serializable {
    private static final long serialVersionUID = -7661875440774897168L;
    private static Quaternion tmp1 = new Quaternion(0.0f, 0.0f, 0.0f, 0.0f);
    private static Quaternion tmp2 = new Quaternion(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: w, reason: collision with root package name */
    public float f12529w;

    /* renamed from: x, reason: collision with root package name */
    public float f12530x;

    /* renamed from: y, reason: collision with root package name */
    public float f12531y;

    /* renamed from: z, reason: collision with root package name */
    public float f12532z;

    public Quaternion(float f11, float f12, float f13, float f14) {
        set(f11, f12, f13, f14);
    }

    public static final float dot(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        return (f11 * f15) + (f12 * f16) + (f13 * f17) + (f14 * f18);
    }

    public static final float len(float f11, float f12, float f13, float f14) {
        return (float) Math.sqrt((f11 * f11) + (f12 * f12) + (f13 * f13) + (f14 * f14));
    }

    public static final float len2(float f11, float f12, float f13, float f14) {
        return (f11 * f11) + (f12 * f12) + (f13 * f13) + (f14 * f14);
    }

    public Quaternion add(Quaternion quaternion) {
        this.f12530x += quaternion.f12530x;
        this.f12531y += quaternion.f12531y;
        this.f12532z += quaternion.f12532z;
        this.f12529w += quaternion.f12529w;
        return this;
    }

    public Quaternion conjugate() {
        this.f12530x = -this.f12530x;
        this.f12531y = -this.f12531y;
        this.f12532z = -this.f12532z;
        return this;
    }

    public Quaternion cpy() {
        return new Quaternion(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Quaternion)) {
            return false;
        }
        Quaternion quaternion = (Quaternion) obj;
        return e0.d(this.f12529w) == e0.d(quaternion.f12529w) && e0.d(this.f12530x) == e0.d(quaternion.f12530x) && e0.d(this.f12531y) == e0.d(quaternion.f12531y) && e0.d(this.f12532z) == e0.d(quaternion.f12532z);
    }

    public Quaternion exp(float f11) {
        float len = len();
        double d11 = len;
        float pow = (float) Math.pow(d11, f11);
        float acos = (float) Math.acos(this.f12529w / len);
        float sin = ((double) Math.abs(acos)) < 0.001d ? (pow * f11) / len : (float) ((pow * Math.sin(f11 * acos)) / (d11 * Math.sin(acos)));
        this.f12529w = (float) (pow * Math.cos(f11 * acos));
        this.f12530x *= sin;
        this.f12531y *= sin;
        this.f12532z *= sin;
        nor();
        return this;
    }

    public float getAngle() {
        return getAngleRad() * 57.295776f;
    }

    public float getAngleAround(float f11, float f12, float f13) {
        return getAngleAroundRad(f11, f12, f13) * 57.295776f;
    }

    public float getAngleAroundRad(float f11, float f12, float f13) {
        float dot = Vector3.dot(this.f12530x, this.f12531y, this.f12532z, f11, f12, f13);
        if (n.z(len2(f11 * dot, f12 * dot, f13 * dot, this.f12529w))) {
            return 0.0f;
        }
        return (float) (Math.acos(n.o((float) ((dot < 0.0f ? -this.f12529w : this.f12529w) / Math.sqrt(r8)), -1.0f, 1.0f)) * 2.0d);
    }

    public float getAngleRad() {
        float f11 = this.f12529w;
        if (f11 > 1.0f) {
            f11 /= len();
        }
        return (float) (Math.acos(f11) * 2.0d);
    }

    public float getAxisAngle(Vector3 vector3) {
        return getAxisAngleRad(vector3) * 57.295776f;
    }

    public float getAxisAngleRad(Vector3 vector3) {
        if (this.f12529w > 1.0f) {
            nor();
        }
        float acos = (float) (Math.acos(this.f12529w) * 2.0d);
        float f11 = this.f12529w;
        double sqrt = Math.sqrt(1.0f - (f11 * f11));
        if (sqrt < 9.999999974752427E-7d) {
            vector3.f12537x = this.f12530x;
            vector3.f12538y = this.f12531y;
            vector3.f12539z = this.f12532z;
            return acos;
        }
        vector3.f12537x = (float) (this.f12530x / sqrt);
        vector3.f12538y = (float) (this.f12531y / sqrt);
        vector3.f12539z = (float) (this.f12532z / sqrt);
        return acos;
    }

    public int getGimbalPole() {
        float f11 = (this.f12531y * this.f12530x) + (this.f12532z * this.f12529w);
        if (f11 > 0.499f) {
            return 1;
        }
        return f11 < -0.499f ? -1 : 0;
    }

    public float getPitch() {
        return getPitchRad() * 57.295776f;
    }

    public float getPitchRad() {
        int gimbalPole = getGimbalPole();
        return gimbalPole == 0 ? (float) Math.asin(n.o(((this.f12529w * this.f12530x) - (this.f12532z * this.f12531y)) * 2.0f, -1.0f, 1.0f)) : gimbalPole * 3.1415927f * 0.5f;
    }

    public float getRoll() {
        return getRollRad() * 57.295776f;
    }

    public float getRollRad() {
        int gimbalPole = getGimbalPole();
        if (gimbalPole != 0) {
            return gimbalPole * 2.0f * n.f(this.f12531y, this.f12529w);
        }
        float f11 = this.f12529w;
        float f12 = this.f12532z;
        float f13 = this.f12531y;
        float f14 = this.f12530x;
        return n.f(((f11 * f12) + (f13 * f14)) * 2.0f, 1.0f - (((f14 * f14) + (f12 * f12)) * 2.0f));
    }

    public void getSwingTwist(float f11, float f12, float f13, Quaternion quaternion, Quaternion quaternion2) {
        float dot = Vector3.dot(this.f12530x, this.f12531y, this.f12532z, f11, f12, f13);
        quaternion2.set(f11 * dot, f12 * dot, f13 * dot, this.f12529w).nor();
        if (dot < 0.0f) {
            quaternion2.mul(-1.0f);
        }
        quaternion.set(quaternion2).conjugate().mulLeft(this);
    }

    public float getYaw() {
        return getYawRad() * 57.295776f;
    }

    public float getYawRad() {
        if (getGimbalPole() != 0) {
            return 0.0f;
        }
        float f11 = this.f12531y;
        float f12 = this.f12529w * f11;
        float f13 = this.f12530x;
        return n.f((f12 + (this.f12532z * f13)) * 2.0f, 1.0f - (((f11 * f11) + (f13 * f13)) * 2.0f));
    }

    public int hashCode() {
        return ((((((e0.d(this.f12529w) + 31) * 31) + e0.d(this.f12530x)) * 31) + e0.d(this.f12531y)) * 31) + e0.d(this.f12532z);
    }

    public Quaternion idt() {
        return set(0.0f, 0.0f, 0.0f, 1.0f);
    }

    public boolean isIdentity() {
        return n.z(this.f12530x) && n.z(this.f12531y) && n.z(this.f12532z) && n.w(this.f12529w, 1.0f);
    }

    public Quaternion mul(Quaternion quaternion) {
        float f11 = this.f12529w;
        float f12 = quaternion.f12530x;
        float f13 = this.f12530x;
        float f14 = quaternion.f12529w;
        float f15 = this.f12531y;
        float f16 = quaternion.f12532z;
        float f17 = this.f12532z;
        float f18 = quaternion.f12531y;
        this.f12530x = (((f11 * f12) + (f13 * f14)) + (f15 * f16)) - (f17 * f18);
        this.f12531y = (((f11 * f18) + (f15 * f14)) + (f17 * f12)) - (f13 * f16);
        this.f12532z = (((f11 * f16) + (f17 * f14)) + (f13 * f18)) - (f15 * f12);
        this.f12529w = (((f11 * f14) - (f13 * f12)) - (f15 * f18)) - (f17 * f16);
        return this;
    }

    public Quaternion mulLeft(Quaternion quaternion) {
        float f11 = quaternion.f12529w;
        float f12 = this.f12530x;
        float f13 = quaternion.f12530x;
        float f14 = this.f12529w;
        float f15 = quaternion.f12531y;
        float f16 = this.f12532z;
        float f17 = quaternion.f12532z;
        float f18 = this.f12531y;
        this.f12530x = (((f11 * f12) + (f13 * f14)) + (f15 * f16)) - (f17 * f18);
        this.f12531y = (((f11 * f18) + (f15 * f14)) + (f17 * f12)) - (f13 * f16);
        this.f12532z = (((f11 * f16) + (f17 * f14)) + (f13 * f18)) - (f15 * f12);
        this.f12529w = (((f11 * f14) - (f13 * f12)) - (f15 * f18)) - (f17 * f16);
        return this;
    }

    public Quaternion nor() {
        float len2 = len2();
        if (len2 != 0.0f && !n.w(len2, 1.0f)) {
            float sqrt = (float) Math.sqrt(len2);
            this.f12529w /= sqrt;
            this.f12530x /= sqrt;
            this.f12531y /= sqrt;
            this.f12532z /= sqrt;
        }
        return this;
    }

    public Quaternion set(float f11, float f12, float f13, float f14) {
        this.f12530x = f11;
        this.f12531y = f12;
        this.f12532z = f13;
        this.f12529w = f14;
        return this;
    }

    public Quaternion setEulerAngles(float f11, float f12, float f13) {
        return setEulerAnglesRad(f11 * 0.017453292f, f12 * 0.017453292f, f13 * 0.017453292f);
    }

    public Quaternion setEulerAnglesRad(float f11, float f12, float f13) {
        double d11 = f13 * 0.5f;
        float sin = (float) Math.sin(d11);
        float cos = (float) Math.cos(d11);
        double d12 = f12 * 0.5f;
        float sin2 = (float) Math.sin(d12);
        float cos2 = (float) Math.cos(d12);
        double d13 = f11 * 0.5f;
        float sin3 = (float) Math.sin(d13);
        float cos3 = (float) Math.cos(d13);
        float f14 = cos3 * sin2;
        float f15 = sin3 * cos2;
        float f16 = cos3 * cos2;
        float f17 = sin3 * sin2;
        this.f12530x = (f14 * cos) + (f15 * sin);
        this.f12531y = (f15 * cos) - (f14 * sin);
        this.f12532z = (f16 * sin) - (f17 * cos);
        this.f12529w = (f16 * cos) + (f17 * sin);
        return this;
    }

    public Quaternion setFromAxes(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        return setFromAxes(false, f11, f12, f13, f14, f15, f16, f17, f18, f19);
    }

    public Quaternion setFromAxis(Vector3 vector3, float f11) {
        return setFromAxis(vector3.f12537x, vector3.f12538y, vector3.f12539z, f11);
    }

    public Quaternion setFromAxisRad(Vector3 vector3, float f11) {
        return setFromAxisRad(vector3.f12537x, vector3.f12538y, vector3.f12539z, f11);
    }

    public Quaternion setFromCross(Vector3 vector3, Vector3 vector32) {
        float acos = (float) Math.acos(n.o(vector3.dot(vector32), -1.0f, 1.0f));
        float f11 = vector3.f12538y;
        float f12 = vector32.f12539z;
        float f13 = vector3.f12539z;
        float f14 = vector32.f12538y;
        float f15 = vector32.f12537x;
        float f16 = vector3.f12537x;
        return setFromAxisRad((f11 * f12) - (f13 * f14), (f13 * f15) - (f12 * f16), (f16 * f14) - (f11 * f15), acos);
    }

    public Quaternion setFromMatrix(boolean z11, Matrix4 matrix4) {
        float[] fArr = matrix4.val;
        return setFromAxes(z11, fArr[0], fArr[4], fArr[8], fArr[1], fArr[5], fArr[9], fArr[2], fArr[6], fArr[10]);
    }

    public Quaternion slerp(Quaternion quaternion, float f11) {
        float f12 = (this.f12530x * quaternion.f12530x) + (this.f12531y * quaternion.f12531y) + (this.f12532z * quaternion.f12532z) + (this.f12529w * quaternion.f12529w);
        if (f12 < 0.0f) {
            f12 = -f12;
        }
        float f13 = 1.0f - f11;
        if (1.0f - f12 > 0.1d) {
            float sin = 1.0f / ((float) Math.sin((float) Math.acos(f12)));
            f13 = ((float) Math.sin(f13 * r0)) * sin;
            f11 = ((float) Math.sin(f11 * r0)) * sin;
        }
        if (f12 < 0.0f) {
            f11 = -f11;
        }
        this.f12530x = (this.f12530x * f13) + (quaternion.f12530x * f11);
        this.f12531y = (this.f12531y * f13) + (quaternion.f12531y * f11);
        this.f12532z = (this.f12532z * f13) + (quaternion.f12532z * f11);
        this.f12529w = (f13 * this.f12529w) + (f11 * quaternion.f12529w);
        return this;
    }

    public void toMatrix(float[] fArr) {
        float f11 = this.f12530x;
        float f12 = f11 * f11;
        float f13 = this.f12531y;
        float f14 = f11 * f13;
        float f15 = this.f12532z;
        float f16 = f11 * f15;
        float f17 = this.f12529w;
        float f18 = f11 * f17;
        float f19 = f13 * f13;
        float f21 = f13 * f15;
        float f22 = f13 * f17;
        float f23 = f15 * f15;
        float f24 = f15 * f17;
        fArr[0] = 1.0f - ((f19 + f23) * 2.0f);
        fArr[4] = (f14 - f24) * 2.0f;
        fArr[8] = (f16 + f22) * 2.0f;
        fArr[12] = 0.0f;
        fArr[1] = (f14 + f24) * 2.0f;
        fArr[5] = 1.0f - ((f23 + f12) * 2.0f);
        fArr[9] = (f21 - f18) * 2.0f;
        fArr[13] = 0.0f;
        fArr[2] = (f16 - f22) * 2.0f;
        fArr[6] = (f21 + f18) * 2.0f;
        fArr[10] = 1.0f - ((f12 + f19) * 2.0f);
        fArr[14] = 0.0f;
        fArr[3] = 0.0f;
        fArr[7] = 0.0f;
        fArr[11] = 0.0f;
        fArr[15] = 1.0f;
    }

    public String toString() {
        return "[" + this.f12530x + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.f12531y + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.f12532z + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.f12529w + "]";
    }

    public Vector3 transform(Vector3 vector3) {
        tmp2.set(this);
        tmp2.conjugate();
        tmp2.mulLeft(tmp1.set(vector3.f12537x, vector3.f12538y, vector3.f12539z, 0.0f)).mulLeft(this);
        Quaternion quaternion = tmp2;
        vector3.f12537x = quaternion.f12530x;
        vector3.f12538y = quaternion.f12531y;
        vector3.f12539z = quaternion.f12532z;
        return vector3;
    }

    public float dot(Quaternion quaternion) {
        return (this.f12530x * quaternion.f12530x) + (this.f12531y * quaternion.f12531y) + (this.f12532z * quaternion.f12532z) + (this.f12529w * quaternion.f12529w);
    }

    public float getAngleAround(Vector3 vector3) {
        return getAngleAround(vector3.f12537x, vector3.f12538y, vector3.f12539z);
    }

    public boolean isIdentity(float f11) {
        return n.A(this.f12530x, f11) && n.A(this.f12531y, f11) && n.A(this.f12532z, f11) && n.x(this.f12529w, 1.0f, f11);
    }

    public float len() {
        float f11 = this.f12530x;
        float f12 = this.f12531y;
        float f13 = (f11 * f11) + (f12 * f12);
        float f14 = this.f12532z;
        float f15 = f13 + (f14 * f14);
        float f16 = this.f12529w;
        return (float) Math.sqrt(f15 + (f16 * f16));
    }

    public float len2() {
        float f11 = this.f12530x;
        float f12 = this.f12531y;
        float f13 = (f11 * f11) + (f12 * f12);
        float f14 = this.f12532z;
        float f15 = f13 + (f14 * f14);
        float f16 = this.f12529w;
        return f15 + (f16 * f16);
    }

    public Quaternion setFromAxes(boolean z11, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        if (z11) {
            float len = 1.0f / Vector3.len(f11, f12, f13);
            float len2 = 1.0f / Vector3.len(f14, f15, f16);
            float len3 = 1.0f / Vector3.len(f17, f18, f19);
            f11 *= len;
            f12 *= len;
            f13 *= len;
            f14 *= len2;
            f15 *= len2;
            f16 *= len2;
            f17 *= len3;
            f18 *= len3;
            f19 *= len3;
        }
        if (f11 + f15 + f19 >= 0.0f) {
            float sqrt = (float) Math.sqrt(r6 + 1.0f);
            this.f12529w = sqrt * 0.5f;
            float f21 = 0.5f / sqrt;
            this.f12530x = (f18 - f16) * f21;
            this.f12531y = (f13 - f17) * f21;
            this.f12532z = (f14 - f12) * f21;
            return this;
        }
        if (f11 > f15 && f11 > f19) {
            float sqrt2 = (float) Math.sqrt(((f11 + 1.0d) - f15) - f19);
            this.f12530x = sqrt2 * 0.5f;
            float f22 = 0.5f / sqrt2;
            this.f12531y = (f14 + f12) * f22;
            this.f12532z = (f13 + f17) * f22;
            this.f12529w = (f18 - f16) * f22;
            return this;
        }
        if (f15 > f19) {
            float sqrt3 = (float) Math.sqrt(((f15 + 1.0d) - f11) - f19);
            this.f12531y = sqrt3 * 0.5f;
            float f23 = 0.5f / sqrt3;
            this.f12530x = (f14 + f12) * f23;
            this.f12532z = (f18 + f16) * f23;
            this.f12529w = (f13 - f17) * f23;
            return this;
        }
        float sqrt4 = (float) Math.sqrt(((f19 + 1.0d) - f11) - f15);
        this.f12532z = sqrt4 * 0.5f;
        float f24 = 0.5f / sqrt4;
        this.f12530x = (f13 + f17) * f24;
        this.f12531y = (f18 + f16) * f24;
        this.f12529w = (f14 - f12) * f24;
        return this;
    }

    public Quaternion setFromAxis(float f11, float f12, float f13, float f14) {
        return setFromAxisRad(f11, f12, f13, f14 * 0.017453292f);
    }

    public Quaternion setFromAxisRad(float f11, float f12, float f13, float f14) {
        float len = Vector3.len(f11, f12, f13);
        if (len == 0.0f) {
            return idt();
        }
        float f15 = 1.0f / len;
        double d11 = (f14 < 0.0f ? 6.2831855f - ((-f14) % 6.2831855f) : f14 % 6.2831855f) / 2.0f;
        float sin = (float) Math.sin(d11);
        return set(f11 * f15 * sin, f12 * f15 * sin, f15 * f13 * sin, (float) Math.cos(d11)).nor();
    }

    public Quaternion setFromMatrix(Matrix4 matrix4) {
        return setFromMatrix(false, matrix4);
    }

    public Quaternion() {
        idt();
    }

    public float dot(float f11, float f12, float f13, float f14) {
        return (this.f12530x * f11) + (this.f12531y * f12) + (this.f12532z * f13) + (this.f12529w * f14);
    }

    public Quaternion setFromMatrix(boolean z11, Matrix3 matrix3) {
        float[] fArr = matrix3.val;
        return setFromAxes(z11, fArr[0], fArr[3], fArr[6], fArr[1], fArr[4], fArr[7], fArr[2], fArr[5], fArr[8]);
    }

    public Quaternion setFromCross(float f11, float f12, float f13, float f14, float f15, float f16) {
        return setFromAxisRad((f12 * f16) - (f13 * f15), (f13 * f14) - (f16 * f11), (f11 * f15) - (f12 * f14), (float) Math.acos(n.o(Vector3.dot(f11, f12, f13, f14, f15, f16), -1.0f, 1.0f)));
    }

    public Quaternion setFromMatrix(Matrix3 matrix3) {
        return setFromMatrix(false, matrix3);
    }

    public Quaternion(Quaternion quaternion) {
        set(quaternion);
    }

    public Quaternion add(float f11, float f12, float f13, float f14) {
        this.f12530x += f11;
        this.f12531y += f12;
        this.f12532z += f13;
        this.f12529w += f14;
        return this;
    }

    public float getAngleAroundRad(Vector3 vector3) {
        return getAngleAroundRad(vector3.f12537x, vector3.f12538y, vector3.f12539z);
    }

    public void getSwingTwist(Vector3 vector3, Quaternion quaternion, Quaternion quaternion2) {
        getSwingTwist(vector3.f12537x, vector3.f12538y, vector3.f12539z, quaternion, quaternion2);
    }

    public Quaternion set(Quaternion quaternion) {
        return set(quaternion.f12530x, quaternion.f12531y, quaternion.f12532z, quaternion.f12529w);
    }

    public Quaternion mul(float f11, float f12, float f13, float f14) {
        float f15 = this.f12529w;
        float f16 = this.f12530x;
        float f17 = this.f12531y;
        float f18 = this.f12532z;
        this.f12530x = (((f15 * f11) + (f16 * f14)) + (f17 * f13)) - (f18 * f12);
        this.f12531y = (((f15 * f12) + (f17 * f14)) + (f18 * f11)) - (f16 * f13);
        this.f12532z = (((f15 * f13) + (f18 * f14)) + (f16 * f12)) - (f17 * f11);
        this.f12529w = (((f15 * f14) - (f16 * f11)) - (f17 * f12)) - (f18 * f13);
        return this;
    }

    public Quaternion mulLeft(float f11, float f12, float f13, float f14) {
        float f15 = this.f12530x;
        float f16 = this.f12529w;
        float f17 = this.f12532z;
        float f18 = this.f12531y;
        this.f12530x = (((f14 * f15) + (f11 * f16)) + (f12 * f17)) - (f13 * f18);
        this.f12531y = (((f14 * f18) + (f12 * f16)) + (f13 * f15)) - (f11 * f17);
        this.f12532z = (((f14 * f17) + (f13 * f16)) + (f11 * f18)) - (f12 * f15);
        this.f12529w = (((f14 * f16) - (f11 * f15)) - (f12 * f18)) - (f13 * f17);
        return this;
    }

    public Quaternion set(Vector3 vector3, float f11) {
        return setFromAxis(vector3.f12537x, vector3.f12538y, vector3.f12539z, f11);
    }

    public Quaternion(Vector3 vector3, float f11) {
        set(vector3, f11);
    }

    public Quaternion slerp(Quaternion[] quaternionArr) {
        float length = 1.0f / quaternionArr.length;
        set(quaternionArr[0]).exp(length);
        for (int i11 = 1; i11 < quaternionArr.length; i11++) {
            mul(tmp1.set(quaternionArr[i11]).exp(length));
        }
        nor();
        return this;
    }

    public Quaternion mul(float f11) {
        this.f12530x *= f11;
        this.f12531y *= f11;
        this.f12532z *= f11;
        this.f12529w *= f11;
        return this;
    }

    public Quaternion slerp(Quaternion[] quaternionArr, float[] fArr) {
        set(quaternionArr[0]).exp(fArr[0]);
        for (int i11 = 1; i11 < quaternionArr.length; i11++) {
            mul(tmp1.set(quaternionArr[i11]).exp(fArr[i11]));
        }
        nor();
        return this;
    }
}
