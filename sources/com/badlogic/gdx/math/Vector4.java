package com.badlogic.gdx.math;

import a3.e0;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class Vector4 implements Serializable, t<Vector4> {
    private static final long serialVersionUID = -5394070284130414492L;

    /* renamed from: w, reason: collision with root package name */
    public float f12540w;

    /* renamed from: x, reason: collision with root package name */
    public float f12541x;

    /* renamed from: y, reason: collision with root package name */
    public float f12542y;

    /* renamed from: z, reason: collision with root package name */
    public float f12543z;
    public static final Vector4 X = new Vector4(1.0f, 0.0f, 0.0f, 0.0f);
    public static final Vector4 Y = new Vector4(0.0f, 1.0f, 0.0f, 0.0f);
    public static final Vector4 Z = new Vector4(0.0f, 0.0f, 1.0f, 0.0f);
    public static final Vector4 W = new Vector4(0.0f, 0.0f, 0.0f, 1.0f);
    public static final Vector4 Zero = new Vector4(0.0f, 0.0f, 0.0f, 0.0f);

    public Vector4() {
    }

    public static float dot(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        return (f11 * f15) + (f12 * f16) + (f13 * f17) + (f14 * f18);
    }

    public static float dst2(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        float f19 = f15 - f11;
        float f21 = f16 - f12;
        float f22 = f17 - f13;
        float f23 = f18 - f14;
        return (f19 * f19) + (f21 * f21) + (f22 * f22) + (f23 * f23);
    }

    public static float len(float f11, float f12, float f13, float f14) {
        return (float) Math.sqrt((f11 * f11) + (f12 * f12) + (f13 * f13) + (f14 * f14));
    }

    public static float len2(float f11, float f12, float f13, float f14) {
        return (f11 * f11) + (f12 * f12) + (f13 * f13) + (f14 * f14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Vector4 vector4 = (Vector4) obj;
        return e0.b(this.f12541x) == e0.b(vector4.f12541x) && e0.b(this.f12542y) == e0.b(vector4.f12542y) && e0.b(this.f12543z) == e0.b(vector4.f12543z) && e0.b(this.f12540w) == e0.b(vector4.f12540w);
    }

    public Vector4 fromString(String str) {
        int indexOf = str.indexOf(44, 1);
        int i11 = indexOf + 1;
        int indexOf2 = str.indexOf(44, i11);
        int i12 = indexOf2 + 1;
        int indexOf3 = str.indexOf(44, i12);
        if (indexOf != -1 && indexOf2 != -1 && str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
            try {
                return set(Float.parseFloat(str.substring(1, indexOf)), Float.parseFloat(str.substring(i11, indexOf2)), Float.parseFloat(str.substring(i12, indexOf3)), Float.parseFloat(str.substring(indexOf3 + 1, str.length() - 1)));
            } catch (NumberFormatException unused) {
            }
        }
        throw new GdxRuntimeException("Malformed Vector4: " + str);
    }

    public int hashCode() {
        return ((((((e0.b(this.f12541x) + 31) * 31) + e0.b(this.f12542y)) * 31) + e0.b(this.f12543z)) * 31) + e0.b(this.f12540w);
    }

    public boolean idt(Vector4 vector4) {
        return this.f12541x == vector4.f12541x && this.f12542y == vector4.f12542y && this.f12543z == vector4.f12543z && this.f12540w == vector4.f12540w;
    }

    @Override // com.badlogic.gdx.math.t
    public boolean isUnit() {
        return isUnit(1.0E-9f);
    }

    @Override // com.badlogic.gdx.math.t
    public boolean isZero() {
        return this.f12541x == 0.0f && this.f12542y == 0.0f && this.f12543z == 0.0f && this.f12540w == 0.0f;
    }

    public String toString() {
        return pn.j.f81006c + this.f12541x + "," + this.f12542y + "," + this.f12543z + "," + this.f12540w + pn.j.f81007d;
    }

    public Vector4(float f11, float f12, float f13, float f14) {
        set(f11, f12, f13, f14);
    }

    public static float dst(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        float f19 = f15 - f11;
        float f21 = f16 - f12;
        float f22 = f17 - f13;
        float f23 = f18 - f14;
        return (float) Math.sqrt((f19 * f19) + (f21 * f21) + (f22 * f22) + (f23 * f23));
    }

    @Override // com.badlogic.gdx.math.t
    public Vector4 add(Vector4 vector4) {
        return add(vector4.f12541x, vector4.f12542y, vector4.f12543z, vector4.f12540w);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.badlogic.gdx.math.t
    public Vector4 clamp(float f11, float f12) {
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
    public Vector4 cpy() {
        return new Vector4(this);
    }

    @Override // com.badlogic.gdx.math.t
    public boolean epsilonEquals(Vector4 vector4, float f11) {
        return vector4 != null && Math.abs(vector4.f12541x - this.f12541x) <= f11 && Math.abs(vector4.f12542y - this.f12542y) <= f11 && Math.abs(vector4.f12543z - this.f12543z) <= f11 && Math.abs(vector4.f12540w - this.f12540w) <= f11;
    }

    @Override // com.badlogic.gdx.math.t
    public boolean hasOppositeDirection(Vector4 vector4) {
        return dot(vector4) < 0.0f;
    }

    @Override // com.badlogic.gdx.math.t
    public boolean hasSameDirection(Vector4 vector4) {
        return dot(vector4) > 0.0f;
    }

    @Override // com.badlogic.gdx.math.t
    public Vector4 interpolate(Vector4 vector4, float f11, l lVar) {
        return lerp(vector4, lVar.a(f11));
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
        float f11 = this.f12541x;
        float f12 = this.f12542y;
        float f13 = (f11 * f11) + (f12 * f12);
        float f14 = this.f12543z;
        float f15 = f13 + (f14 * f14);
        float f16 = this.f12540w;
        return (float) Math.sqrt(f15 + (f16 * f16));
    }

    @Override // com.badlogic.gdx.math.t
    public float len2() {
        float f11 = this.f12541x;
        float f12 = this.f12542y;
        float f13 = (f11 * f11) + (f12 * f12);
        float f14 = this.f12543z;
        float f15 = f13 + (f14 * f14);
        float f16 = this.f12540w;
        return f15 + (f16 * f16);
    }

    @Override // com.badlogic.gdx.math.t
    public Vector4 lerp(Vector4 vector4, float f11) {
        float f12 = this.f12541x;
        this.f12541x = f12 + ((vector4.f12541x - f12) * f11);
        float f13 = this.f12542y;
        this.f12542y = f13 + ((vector4.f12542y - f13) * f11);
        float f14 = this.f12543z;
        this.f12543z = f14 + ((vector4.f12543z - f14) * f11);
        float f15 = this.f12540w;
        this.f12540w = f15 + (f11 * (vector4.f12540w - f15));
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.badlogic.gdx.math.t
    public Vector4 limit(float f11) {
        return limit2(f11 * f11);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.badlogic.gdx.math.t
    public Vector4 limit2(float f11) {
        if (len2() > f11) {
            scl((float) Math.sqrt(f11 / r0));
        }
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.badlogic.gdx.math.t
    public Vector4 nor() {
        float len2 = len2();
        return (len2 == 0.0f || len2 == 1.0f) ? this : scl(1.0f / ((float) Math.sqrt(len2)));
    }

    public Vector4 set(float f11, float f12, float f13, float f14) {
        this.f12541x = f11;
        this.f12542y = f12;
        this.f12543z = f13;
        this.f12540w = f14;
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.badlogic.gdx.math.t
    public Vector4 setLength(float f11) {
        return setLength2(f11 * f11);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.badlogic.gdx.math.t
    public Vector4 setLength2(float f11) {
        float len2 = len2();
        return (len2 == 0.0f || len2 == f11) ? this : scl((float) Math.sqrt(f11 / len2));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.badlogic.gdx.math.t
    public Vector4 setToRandomDirection() {
        float J;
        float J2;
        float f11;
        while (true) {
            J = (n.J() - 0.5f) * 2.0f;
            J2 = (n.J() - 0.5f) * 2.0f;
            f11 = (J * J) + (J2 * J2);
            if (f11 < 1.0f && f11 != 0.0f) {
                break;
            }
        }
        double d11 = f11;
        float sqrt = (float) Math.sqrt((Math.log(d11) * (-2.0d)) / d11);
        this.f12541x = J * sqrt;
        this.f12542y = J2 * sqrt;
        while (true) {
            float J3 = (n.J() - 0.5f) * 2.0f;
            float J4 = (n.J() - 0.5f) * 2.0f;
            float f12 = (J3 * J3) + (J4 * J4);
            if (f12 < 1.0f && f12 != 0.0f) {
                double d12 = f12;
                float sqrt2 = (float) Math.sqrt((Math.log(d12) * (-2.0d)) / d12);
                this.f12543z = J3 * sqrt2;
                this.f12540w = J4 * sqrt2;
                return nor();
            }
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.badlogic.gdx.math.t
    public Vector4 setZero() {
        this.f12541x = 0.0f;
        this.f12542y = 0.0f;
        this.f12543z = 0.0f;
        this.f12540w = 0.0f;
        return this;
    }

    @Override // com.badlogic.gdx.math.t
    public Vector4 sub(Vector4 vector4) {
        return sub(vector4.f12541x, vector4.f12542y, vector4.f12543z, vector4.f12540w);
    }

    public Vector4 add(float f11, float f12, float f13, float f14) {
        return set(this.f12541x + f11, this.f12542y + f12, this.f12543z + f13, this.f12540w + f14);
    }

    @Override // com.badlogic.gdx.math.t
    public float dot(Vector4 vector4) {
        return (this.f12541x * vector4.f12541x) + (this.f12542y * vector4.f12542y) + (this.f12543z * vector4.f12543z) + (this.f12540w * vector4.f12540w);
    }

    @Override // com.badlogic.gdx.math.t
    public float dst(Vector4 vector4) {
        float f11 = vector4.f12541x - this.f12541x;
        float f12 = vector4.f12542y - this.f12542y;
        float f13 = vector4.f12543z - this.f12543z;
        float f14 = vector4.f12540w - this.f12540w;
        return (float) Math.sqrt((f11 * f11) + (f12 * f12) + (f13 * f13) + (f14 * f14));
    }

    @Override // com.badlogic.gdx.math.t
    public float dst2(Vector4 vector4) {
        float f11 = vector4.f12541x - this.f12541x;
        float f12 = vector4.f12542y - this.f12542y;
        float f13 = vector4.f12543z - this.f12543z;
        float f14 = vector4.f12540w - this.f12540w;
        return (f11 * f11) + (f12 * f12) + (f13 * f13) + (f14 * f14);
    }

    @Override // com.badlogic.gdx.math.t
    public boolean isCollinear(Vector4 vector4, float f11) {
        return isOnLine(vector4, f11) && hasSameDirection(vector4);
    }

    @Override // com.badlogic.gdx.math.t
    public boolean isCollinearOpposite(Vector4 vector4, float f11) {
        return isOnLine(vector4, f11) && hasOppositeDirection(vector4);
    }

    @Override // com.badlogic.gdx.math.t
    public boolean isOnLine(Vector4 vector4, float f11) {
        float f12;
        int i11;
        float f13;
        float f14;
        float f15 = 0.0f;
        if (n.A(this.f12541x, f11)) {
            if (!n.A(vector4.f12541x, f11)) {
                return false;
            }
            i11 = 0;
            f12 = 0.0f;
        } else {
            f12 = this.f12541x / vector4.f12541x;
            i11 = 1;
        }
        if (n.A(this.f12542y, f11)) {
            if (!n.A(vector4.f12542y, f11)) {
                return false;
            }
            f13 = 0.0f;
        } else {
            f13 = this.f12542y / vector4.f12542y;
            i11 |= 2;
        }
        if (n.A(this.f12543z, f11)) {
            if (!n.A(vector4.f12543z, f11)) {
                return false;
            }
            f14 = 0.0f;
        } else {
            f14 = this.f12543z / vector4.f12543z;
            i11 |= 4;
        }
        if (n.A(this.f12540w, f11)) {
            if (!n.A(vector4.f12540w, f11)) {
                return false;
            }
        } else {
            f15 = this.f12540w / vector4.f12540w;
            i11 |= 8;
        }
        switch (i11) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 8:
                break;
            case 3:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                if (!n.x(f12, f13, f11) || !n.x(f12, f14, f11)) {
                }
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                if (!n.x(f12, f13, f11) || !n.x(f12, f15, f11)) {
                }
                break;
            case 12:
                break;
            case 13:
                if (!n.x(f12, f14, f11) || !n.x(f12, f15, f11)) {
                }
                break;
            case 14:
                if (!n.x(f13, f14, f11) || !n.x(f13, f15, f11)) {
                }
                break;
            default:
                if (!n.x(f12, f13, f11) || !n.x(f12, f14, f11) || !n.x(f12, f15, f11)) {
                }
                break;
        }
        return false;
    }

    @Override // com.badlogic.gdx.math.t
    public boolean isPerpendicular(Vector4 vector4) {
        return n.z(dot(vector4));
    }

    @Override // com.badlogic.gdx.math.t
    public Vector4 mulAdd(Vector4 vector4, float f11) {
        this.f12541x += vector4.f12541x * f11;
        this.f12542y += vector4.f12542y * f11;
        this.f12543z += vector4.f12543z * f11;
        this.f12540w += vector4.f12540w * f11;
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.badlogic.gdx.math.t
    public Vector4 scl(float f11) {
        return set(this.f12541x * f11, this.f12542y * f11, this.f12543z * f11, this.f12540w * f11);
    }

    public Vector4 sub(float f11, float f12, float f13, float f14) {
        return set(this.f12541x - f11, this.f12542y - f12, this.f12543z - f13, this.f12540w - f14);
    }

    public Vector4(Vector4 vector4) {
        set(vector4.f12541x, vector4.f12542y, vector4.f12543z, vector4.f12540w);
    }

    public Vector4 add(float f11) {
        return set(this.f12541x + f11, this.f12542y + f11, this.f12543z + f11, this.f12540w + f11);
    }

    public float dot(float f11, float f12, float f13, float f14) {
        return (this.f12541x * f11) + (this.f12542y * f12) + (this.f12543z * f13) + (this.f12540w * f14);
    }

    @Override // com.badlogic.gdx.math.t
    public boolean isCollinear(Vector4 vector4) {
        return isOnLine(vector4) && hasSameDirection(vector4);
    }

    @Override // com.badlogic.gdx.math.t
    public boolean isCollinearOpposite(Vector4 vector4) {
        return isOnLine(vector4) && hasOppositeDirection(vector4);
    }

    @Override // com.badlogic.gdx.math.t
    public boolean isPerpendicular(Vector4 vector4, float f11) {
        return n.A(dot(vector4), f11);
    }

    @Override // com.badlogic.gdx.math.t
    public Vector4 scl(Vector4 vector4) {
        return set(this.f12541x * vector4.f12541x, this.f12542y * vector4.f12542y, this.f12543z * vector4.f12543z, this.f12540w * vector4.f12540w);
    }

    public Vector4 sub(float f11) {
        return set(this.f12541x - f11, this.f12542y - f11, this.f12543z - f11, this.f12540w - f11);
    }

    public Vector4 scl(float f11, float f12, float f13, float f14) {
        return set(this.f12541x * f11, this.f12542y * f12, this.f12543z * f13, this.f12540w * f14);
    }

    public Vector4(float[] fArr) {
        set(fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    public boolean epsilonEquals(float f11, float f12, float f13, float f14, float f15) {
        return Math.abs(f11 - this.f12541x) <= f15 && Math.abs(f12 - this.f12542y) <= f15 && Math.abs(f13 - this.f12543z) <= f15 && Math.abs(f14 - this.f12540w) <= f15;
    }

    @Override // com.badlogic.gdx.math.t
    public Vector4 set(Vector4 vector4) {
        return set(vector4.f12541x, vector4.f12542y, vector4.f12543z, vector4.f12540w);
    }

    public float dst2(float f11, float f12, float f13, float f14) {
        float f15 = f11 - this.f12541x;
        float f16 = f12 - this.f12542y;
        float f17 = f13 - this.f12543z;
        float f18 = f14 - this.f12540w;
        return (f15 * f15) + (f16 * f16) + (f17 * f17) + (f18 * f18);
    }

    @Override // com.badlogic.gdx.math.t
    public Vector4 mulAdd(Vector4 vector4, Vector4 vector42) {
        this.f12541x += vector4.f12541x * vector42.f12541x;
        this.f12542y += vector4.f12542y * vector42.f12542y;
        this.f12543z += vector4.f12543z * vector42.f12543z;
        this.f12540w += vector4.f12540w * vector42.f12540w;
        return this;
    }

    public Vector4 set(float[] fArr) {
        return set(fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    public Vector4(Vector2 vector2, float f11, float f12) {
        set(vector2.f12535x, vector2.f12536y, f11, f12);
    }

    public float dst(float f11, float f12, float f13, float f14) {
        float f15 = f11 - this.f12541x;
        float f16 = f12 - this.f12542y;
        float f17 = f13 - this.f12543z;
        float f18 = f14 - this.f12540w;
        return (float) Math.sqrt((f15 * f15) + (f16 * f16) + (f17 * f17) + (f18 * f18));
    }

    public Vector4 set(Vector2 vector2, float f11, float f12) {
        return set(vector2.f12535x, vector2.f12536y, f11, f12);
    }

    public Vector4 set(Vector3 vector3, float f11) {
        return set(vector3.f12537x, vector3.f12538y, vector3.f12539z, f11);
    }

    public Vector4(Vector3 vector3, float f11) {
        set(vector3.f12537x, vector3.f12538y, vector3.f12539z, f11);
    }

    public boolean epsilonEquals(Vector4 vector4) {
        return epsilonEquals(vector4, 1.0E-6f);
    }

    public boolean epsilonEquals(float f11, float f12, float f13, float f14) {
        return epsilonEquals(f11, f12, f13, f14, 1.0E-6f);
    }

    @Override // com.badlogic.gdx.math.t
    public boolean isOnLine(Vector4 vector4) {
        return isOnLine(vector4, 1.0E-6f);
    }
}
