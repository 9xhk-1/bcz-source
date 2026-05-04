package com.badlogic.gdx.math;

import a3.e0;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class Vector2 implements Serializable, t<Vector2> {
    public static final Vector2 X = new Vector2(1.0f, 0.0f);
    public static final Vector2 Y = new Vector2(0.0f, 1.0f);
    public static final Vector2 Zero = new Vector2(0.0f, 0.0f);
    private static final long serialVersionUID = 913902788239530931L;

    /* renamed from: x, reason: collision with root package name */
    public float f12535x;

    /* renamed from: y, reason: collision with root package name */
    public float f12536y;

    public Vector2() {
    }

    public static float dot(float f11, float f12, float f13, float f14) {
        return (f11 * f13) + (f12 * f14);
    }

    public static float dst2(float f11, float f12, float f13, float f14) {
        float f15 = f13 - f11;
        float f16 = f14 - f12;
        return (f15 * f15) + (f16 * f16);
    }

    public static float len(float f11, float f12) {
        return (float) Math.sqrt((f11 * f11) + (f12 * f12));
    }

    public static float len2(float f11, float f12) {
        return (f11 * f11) + (f12 * f12);
    }

    @Deprecated
    public float angle() {
        float atan2 = ((float) Math.atan2(this.f12536y, this.f12535x)) * 57.295776f;
        return atan2 < 0.0f ? atan2 + 360.0f : atan2;
    }

    public float angleDeg() {
        float atan2 = ((float) Math.atan2(this.f12536y, this.f12535x)) * 57.295776f;
        return atan2 < 0.0f ? atan2 + 360.0f : atan2;
    }

    public float angleRad() {
        return (float) Math.atan2(this.f12536y, this.f12535x);
    }

    public float crs(Vector2 vector2) {
        return (this.f12535x * vector2.f12536y) - (this.f12536y * vector2.f12535x);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Vector2 vector2 = (Vector2) obj;
        return e0.b(this.f12535x) == e0.b(vector2.f12535x) && e0.b(this.f12536y) == e0.b(vector2.f12536y);
    }

    public Vector2 fromString(String str) {
        int indexOf = str.indexOf(44, 1);
        if (indexOf != -1 && str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
            try {
                return set(Float.parseFloat(str.substring(1, indexOf)), Float.parseFloat(str.substring(indexOf + 1, str.length() - 1)));
            } catch (NumberFormatException unused) {
            }
        }
        throw new GdxRuntimeException("Malformed Vector2: " + str);
    }

    public int hashCode() {
        return ((e0.b(this.f12535x) + 31) * 31) + e0.b(this.f12536y);
    }

    public boolean idt(Vector2 vector2) {
        return this.f12535x == vector2.f12535x && this.f12536y == vector2.f12536y;
    }

    @Override // com.badlogic.gdx.math.t
    public boolean isUnit() {
        return isUnit(1.0E-9f);
    }

    @Override // com.badlogic.gdx.math.t
    public boolean isZero() {
        return this.f12535x == 0.0f && this.f12536y == 0.0f;
    }

    public Vector2 mul(Matrix3 matrix3) {
        float f11 = this.f12535x;
        float[] fArr = matrix3.val;
        float f12 = fArr[0] * f11;
        float f13 = this.f12536y;
        float f14 = f12 + (fArr[3] * f13) + fArr[6];
        float f15 = (f11 * fArr[1]) + (f13 * fArr[4]) + fArr[7];
        this.f12535x = f14;
        this.f12536y = f15;
        return this;
    }

    @Deprecated
    public Vector2 rotate(float f11) {
        return rotateRad(f11 * 0.017453292f);
    }

    public Vector2 rotate90(int i11) {
        float f11 = this.f12535x;
        if (i11 >= 0) {
            this.f12535x = -this.f12536y;
            this.f12536y = f11;
            return this;
        }
        this.f12535x = this.f12536y;
        this.f12536y = -f11;
        return this;
    }

    @Deprecated
    public Vector2 rotateAround(Vector2 vector2, float f11) {
        return sub(vector2).rotateDeg(f11).add(vector2);
    }

    public Vector2 rotateAroundDeg(Vector2 vector2, float f11) {
        return sub(vector2).rotateDeg(f11).add(vector2);
    }

    public Vector2 rotateAroundRad(Vector2 vector2, float f11) {
        return sub(vector2).rotateRad(f11).add(vector2);
    }

    public Vector2 rotateDeg(float f11) {
        return rotateRad(f11 * 0.017453292f);
    }

    public Vector2 rotateRad(float f11) {
        double d11 = f11;
        float cos = (float) Math.cos(d11);
        float sin = (float) Math.sin(d11);
        float f12 = this.f12535x;
        float f13 = this.f12536y;
        this.f12535x = (f12 * cos) - (f13 * sin);
        this.f12536y = (f12 * sin) + (f13 * cos);
        return this;
    }

    @Deprecated
    public Vector2 setAngle(float f11) {
        return setAngleRad(f11 * 0.017453292f);
    }

    public Vector2 setAngleDeg(float f11) {
        return setAngleRad(f11 * 0.017453292f);
    }

    public Vector2 setAngleRad(float f11) {
        set(len(), 0.0f);
        rotateRad(f11);
        return this;
    }

    public String toString() {
        return pn.j.f81006c + this.f12535x + "," + this.f12536y + pn.j.f81007d;
    }

    public Vector2(float f11, float f12) {
        this.f12535x = f11;
        this.f12536y = f12;
    }

    public static float dst(float f11, float f12, float f13, float f14) {
        float f15 = f13 - f11;
        float f16 = f14 - f12;
        return (float) Math.sqrt((f15 * f15) + (f16 * f16));
    }

    @Override // com.badlogic.gdx.math.t
    public Vector2 add(Vector2 vector2) {
        this.f12535x += vector2.f12535x;
        this.f12536y += vector2.f12536y;
        return this;
    }

    @Deprecated
    public float angle(Vector2 vector2) {
        return ((float) Math.atan2(crs(vector2), dot(vector2))) * 57.295776f;
    }

    public float angleDeg(Vector2 vector2) {
        float atan2 = ((float) Math.atan2(vector2.crs(this), vector2.dot(this))) * 57.295776f;
        return atan2 < 0.0f ? atan2 + 360.0f : atan2;
    }

    public float angleRad(Vector2 vector2) {
        return (float) Math.atan2(vector2.crs(this), vector2.dot(this));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.badlogic.gdx.math.t
    public Vector2 clamp(float f11, float f12) {
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
    public Vector2 cpy() {
        return new Vector2(this);
    }

    public float crs(float f11, float f12) {
        return (this.f12535x * f12) - (this.f12536y * f11);
    }

    @Override // com.badlogic.gdx.math.t
    public boolean epsilonEquals(Vector2 vector2, float f11) {
        return vector2 != null && Math.abs(vector2.f12535x - this.f12535x) <= f11 && Math.abs(vector2.f12536y - this.f12536y) <= f11;
    }

    @Override // com.badlogic.gdx.math.t
    public boolean hasOppositeDirection(Vector2 vector2) {
        return dot(vector2) < 0.0f;
    }

    @Override // com.badlogic.gdx.math.t
    public boolean hasSameDirection(Vector2 vector2) {
        return dot(vector2) > 0.0f;
    }

    @Override // com.badlogic.gdx.math.t
    public Vector2 interpolate(Vector2 vector2, float f11, l lVar) {
        return lerp(vector2, lVar.a(f11));
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
        float f11 = this.f12535x;
        float f12 = this.f12536y;
        return (float) Math.sqrt((f11 * f11) + (f12 * f12));
    }

    @Override // com.badlogic.gdx.math.t
    public float len2() {
        float f11 = this.f12535x;
        float f12 = this.f12536y;
        return (f11 * f11) + (f12 * f12);
    }

    @Override // com.badlogic.gdx.math.t
    public Vector2 lerp(Vector2 vector2, float f11) {
        float f12 = 1.0f - f11;
        this.f12535x = (this.f12535x * f12) + (vector2.f12535x * f11);
        this.f12536y = (this.f12536y * f12) + (vector2.f12536y * f11);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.badlogic.gdx.math.t
    public Vector2 limit(float f11) {
        return limit2(f11 * f11);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.badlogic.gdx.math.t
    public Vector2 limit2(float f11) {
        return len2() > f11 ? scl((float) Math.sqrt(f11 / r0)) : this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.badlogic.gdx.math.t
    public Vector2 nor() {
        float len = len();
        if (len != 0.0f) {
            this.f12535x /= len;
            this.f12536y /= len;
        }
        return this;
    }

    @Override // com.badlogic.gdx.math.t
    public Vector2 set(Vector2 vector2) {
        this.f12535x = vector2.f12535x;
        this.f12536y = vector2.f12536y;
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.badlogic.gdx.math.t
    public Vector2 setLength(float f11) {
        return setLength2(f11 * f11);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.badlogic.gdx.math.t
    public Vector2 setLength2(float f11) {
        float len2 = len2();
        return (len2 == 0.0f || len2 == f11) ? this : scl((float) Math.sqrt(f11 / len2));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.badlogic.gdx.math.t
    public Vector2 setToRandomDirection() {
        float L = n.L(0.0f, 6.2831855f);
        return set(n.s(L), n.Z(L));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.badlogic.gdx.math.t
    public Vector2 setZero() {
        this.f12535x = 0.0f;
        this.f12536y = 0.0f;
        return this;
    }

    @Override // com.badlogic.gdx.math.t
    public Vector2 sub(Vector2 vector2) {
        this.f12535x -= vector2.f12535x;
        this.f12536y -= vector2.f12536y;
        return this;
    }

    public static float angleDeg(float f11, float f12) {
        float atan2 = ((float) Math.atan2(f12, f11)) * 57.295776f;
        return atan2 < 0.0f ? atan2 + 360.0f : atan2;
    }

    public static float angleRad(float f11, float f12) {
        return (float) Math.atan2(f12, f11);
    }

    @Override // com.badlogic.gdx.math.t
    public float dot(Vector2 vector2) {
        return (this.f12535x * vector2.f12535x) + (this.f12536y * vector2.f12536y);
    }

    @Override // com.badlogic.gdx.math.t
    public float dst(Vector2 vector2) {
        float f11 = vector2.f12535x - this.f12535x;
        float f12 = vector2.f12536y - this.f12536y;
        return (float) Math.sqrt((f11 * f11) + (f12 * f12));
    }

    @Override // com.badlogic.gdx.math.t
    public float dst2(Vector2 vector2) {
        float f11 = vector2.f12535x - this.f12535x;
        float f12 = vector2.f12536y - this.f12536y;
        return (f11 * f11) + (f12 * f12);
    }

    @Override // com.badlogic.gdx.math.t
    public boolean isCollinear(Vector2 vector2, float f11) {
        return isOnLine(vector2, f11) && dot(vector2) > 0.0f;
    }

    @Override // com.badlogic.gdx.math.t
    public boolean isCollinearOpposite(Vector2 vector2, float f11) {
        return isOnLine(vector2, f11) && dot(vector2) < 0.0f;
    }

    @Override // com.badlogic.gdx.math.t
    public boolean isOnLine(Vector2 vector2) {
        return n.z((this.f12535x * vector2.f12536y) - (this.f12536y * vector2.f12535x));
    }

    @Override // com.badlogic.gdx.math.t
    public boolean isPerpendicular(Vector2 vector2) {
        return n.z(dot(vector2));
    }

    @Override // com.badlogic.gdx.math.t
    public Vector2 mulAdd(Vector2 vector2, float f11) {
        this.f12535x += vector2.f12535x * f11;
        this.f12536y += vector2.f12536y * f11;
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.badlogic.gdx.math.t
    public Vector2 scl(float f11) {
        this.f12535x *= f11;
        this.f12536y *= f11;
        return this;
    }

    public Vector2 add(float f11, float f12) {
        this.f12535x += f11;
        this.f12536y += f12;
        return this;
    }

    public float dot(float f11, float f12) {
        return (this.f12535x * f11) + (this.f12536y * f12);
    }

    public boolean epsilonEquals(float f11, float f12, float f13) {
        return Math.abs(f11 - this.f12535x) <= f13 && Math.abs(f12 - this.f12536y) <= f13;
    }

    @Override // com.badlogic.gdx.math.t
    public boolean isCollinear(Vector2 vector2) {
        return isOnLine(vector2) && dot(vector2) > 0.0f;
    }

    @Override // com.badlogic.gdx.math.t
    public boolean isCollinearOpposite(Vector2 vector2) {
        return isOnLine(vector2) && dot(vector2) < 0.0f;
    }

    @Override // com.badlogic.gdx.math.t
    public boolean isOnLine(Vector2 vector2, float f11) {
        return n.A((this.f12535x * vector2.f12536y) - (this.f12536y * vector2.f12535x), f11);
    }

    @Override // com.badlogic.gdx.math.t
    public boolean isPerpendicular(Vector2 vector2, float f11) {
        return n.A(dot(vector2), f11);
    }

    public Vector2 set(float f11, float f12) {
        this.f12535x = f11;
        this.f12536y = f12;
        return this;
    }

    public Vector2 sub(float f11, float f12) {
        this.f12535x -= f11;
        this.f12536y -= f12;
        return this;
    }

    public Vector2(Vector2 vector2) {
        set(vector2);
    }

    public float dst2(float f11, float f12) {
        float f13 = f11 - this.f12535x;
        float f14 = f12 - this.f12536y;
        return (f13 * f13) + (f14 * f14);
    }

    @Override // com.badlogic.gdx.math.t
    public Vector2 mulAdd(Vector2 vector2, Vector2 vector22) {
        this.f12535x += vector2.f12535x * vector22.f12535x;
        this.f12536y += vector2.f12536y * vector22.f12536y;
        return this;
    }

    public Vector2 scl(float f11, float f12) {
        this.f12535x *= f11;
        this.f12536y *= f12;
        return this;
    }

    public float dst(float f11, float f12) {
        float f13 = f11 - this.f12535x;
        float f14 = f12 - this.f12536y;
        return (float) Math.sqrt((f13 * f13) + (f14 * f14));
    }

    public boolean epsilonEquals(Vector2 vector2) {
        return epsilonEquals(vector2, 1.0E-6f);
    }

    public boolean epsilonEquals(float f11, float f12) {
        return epsilonEquals(f11, f12, 1.0E-6f);
    }

    @Override // com.badlogic.gdx.math.t
    public Vector2 scl(Vector2 vector2) {
        this.f12535x *= vector2.f12535x;
        this.f12536y *= vector2.f12536y;
        return this;
    }
}
