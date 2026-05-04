package com.badlogic.gdx.math;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final Vector2 f12612a = new Vector2();

    /* renamed from: b, reason: collision with root package name */
    public static final Vector2 f12613b = new Vector2();

    /* renamed from: c, reason: collision with root package name */
    public static final Vector2 f12614c = new Vector2();

    public static boolean a(Vector2 vector2) {
        float f11 = vector2.f12535x;
        if (f11 < 0.0f) {
            return false;
        }
        float f12 = vector2.f12536y;
        return f12 >= 0.0f && f11 + f12 <= 1.0f;
    }

    public static boolean b(float f11, float f12, float f13, float f14, float f15, float f16) {
        return Math.abs(((f15 - f13) * (f14 - f12)) - ((f13 - f11) * (f16 - f14))) < 1.0E-6f;
    }

    public static void c(float[] fArr) {
        d(fArr, 0, fArr.length);
    }

    public static void d(float[] fArr, int i11, int i12) {
        if (j(fArr, i11, i12)) {
            o(fArr, i11, i12);
        }
    }

    public static void e(float[] fArr) {
        f(fArr, 0, fArr.length);
    }

    public static void f(float[] fArr, int i11, int i12) {
        if (j(fArr, i11, i12)) {
            return;
        }
        o(fArr, i11, i12);
    }

    public static float g(Vector2 vector2, float f11, float f12, float f13) {
        float f14 = vector2.f12535x;
        float f15 = vector2.f12536y;
        return (((1.0f - f14) - f15) * f11) + (f14 * f12) + (f15 * f13);
    }

    public static Vector2 h(Vector2 vector2, Vector2 vector22, Vector2 vector23, Vector2 vector24, Vector2 vector25) {
        float f11 = vector2.f12535x;
        float f12 = vector2.f12536y;
        float f13 = (1.0f - f11) - f12;
        vector25.f12535x = (vector22.f12535x * f13) + (f11 * vector23.f12535x) + (vector24.f12535x * f12);
        vector25.f12536y = (f13 * vector22.f12536y) + (vector2.f12535x * vector23.f12536y) + (f12 * vector24.f12536y);
        return vector25;
    }

    public static boolean i(float[] fArr, int i11, int i12) {
        return !j(fArr, i11, i12);
    }

    public static boolean j(float[] fArr, int i11, int i12) {
        if (i12 <= 2) {
            return false;
        }
        int i13 = i12 + i11;
        int i14 = i13 - 2;
        float f11 = fArr[i14];
        float f12 = fArr[i13 - 1];
        float f13 = 0.0f;
        while (i11 <= i14) {
            float f14 = fArr[i11];
            float f15 = fArr[i11 + 1];
            f13 += (f11 * f15) - (f12 * f14);
            i11 += 2;
            f11 = f14;
            f12 = f15;
        }
        return f13 < 0.0f;
    }

    public static float k(float f11, float f12, float f13) {
        float f14 = (f12 * f12) - ((4.0f * f11) * f13);
        if (f14 < 0.0f) {
            return Float.NaN;
        }
        float sqrt = (float) Math.sqrt(f14);
        float f15 = 1.0f / (f11 * 2.0f);
        float f16 = -f12;
        float f17 = (f16 - sqrt) * f15;
        float f18 = (f16 + sqrt) * f15;
        if (f17 > f18) {
            f17 = f18;
            f18 = f17;
        }
        if (f17 > 0.0f) {
            return f17;
        }
        if (f18 > 0.0f) {
            return f18;
        }
        return Float.NaN;
    }

    public static float l(float[] fArr, int i11, int i12) {
        int i13 = i12 + i11;
        int i14 = i13 - 2;
        float f11 = fArr[i14];
        float f12 = fArr[i13 - 1];
        float f13 = 0.0f;
        while (i11 <= i14) {
            float f14 = fArr[i11];
            float f15 = fArr[i11 + 1];
            f13 += (f11 * f15) - (f12 * f14);
            i11 += 2;
            f11 = f14;
            f12 = f15;
        }
        return f13 * 0.5f;
    }

    public static Vector2 m(float[] fArr, int i11, int i12, Vector2 vector2) {
        if (i12 < 6) {
            throw new IllegalArgumentException("A polygon must have 3 or more coordinate pairs.");
        }
        int i13 = i12 + i11;
        int i14 = i13 - 2;
        float f11 = fArr[i14];
        float f12 = fArr[i13 - 1];
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        while (i11 <= i14) {
            float f16 = fArr[i11];
            float f17 = fArr[i11 + 1];
            float f18 = (f11 * f17) - (f16 * f12);
            f13 += f18;
            f14 += (f11 + f16) * f18;
            f15 += (f12 + f17) * f18;
            i11 += 2;
            f11 = f16;
            f12 = f17;
        }
        if (f13 == 0.0f) {
            vector2.f12535x = 0.0f;
            vector2.f12536y = 0.0f;
            return vector2;
        }
        float f19 = f13 * 0.5f * 6.0f;
        vector2.f12535x = f14 / f19;
        vector2.f12536y = f15 / f19;
        return vector2;
    }

    public static Vector2 n(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, Vector2 vector2) {
        float f19 = ((f13 + f11) + f15) / 3.0f;
        float f21 = ((f14 + f12) + f16) / 3.0f;
        vector2.f12535x = f19 - ((f19 - (((f11 + f17) + f15) / 3.0f)) / 2.0f);
        vector2.f12536y = f21 - ((f21 - (((f12 + f18) + f16) / 3.0f)) / 2.0f);
        return vector2;
    }

    public static void o(float[] fArr, int i11, int i12) {
        int i13 = (i11 + i12) - 2;
        int i14 = (i12 / 2) + i11;
        while (i11 < i14) {
            int i15 = i13 - i11;
            float f11 = fArr[i11];
            int i16 = i11 + 1;
            float f12 = fArr[i16];
            fArr[i11] = fArr[i15];
            int i17 = i15 + 1;
            fArr[i16] = fArr[i17];
            fArr[i15] = f11;
            fArr[i17] = f12;
            i11 += 2;
        }
    }

    public static Vector2 p(Vector2 vector2, Vector2 vector22, Vector2 vector23, Vector2 vector24, Vector2 vector25) {
        Vector2 sub = f12612a.set(vector23).sub(vector22);
        Vector2 sub2 = f12613b.set(vector24).sub(vector22);
        Vector2 sub3 = f12614c.set(vector2).sub(vector22);
        float dot = sub.dot(sub);
        float dot2 = sub.dot(sub2);
        float dot3 = sub2.dot(sub2);
        float dot4 = sub3.dot(sub);
        float dot5 = sub3.dot(sub2);
        float f11 = (dot * dot3) - (dot2 * dot2);
        vector25.f12535x = ((dot3 * dot4) - (dot2 * dot5)) / f11;
        vector25.f12536y = ((dot * dot5) - (dot2 * dot4)) / f11;
        return vector25;
    }

    public static float q(float f11, float f12, float f13, float f14, float f15, float f16) {
        return Math.abs(((f11 - f15) * (f14 - f12)) - ((f11 - f13) * (f16 - f12))) * 0.5f;
    }

    public static Vector2 r(float f11, float f12, float f13, float f14, float f15, float f16, Vector2 vector2) {
        vector2.f12535x = ((f11 + f13) + f15) / 3.0f;
        vector2.f12536y = ((f12 + f14) + f16) / 3.0f;
        return vector2;
    }

    public static Vector2 s(float f11, float f12, float f13, float f14, float f15, float f16, Vector2 vector2) {
        float f17 = f13 - f11;
        float f18 = f14 - f12;
        float f19 = f15 - f13;
        float f21 = f16 - f14;
        float f22 = f11 - f15;
        float f23 = f12 - f16;
        float f24 = (f19 * f18) - (f17 * f21);
        if (Math.abs(f24) < 1.0E-6f) {
            throw new IllegalArgumentException("Triangle points must not be colinear.");
        }
        float f25 = f24 * 2.0f;
        float f26 = (f11 * f11) + (f12 * f12);
        float f27 = (f13 * f13) + (f14 * f14);
        float f28 = (f15 * f15) + (f16 * f16);
        vector2.set((((f21 * f26) + (f23 * f27)) + (f18 * f28)) / f25, (-(((f26 * f19) + (f27 * f22)) + (f28 * f17))) / f25);
        return vector2;
    }

    public static float t(float f11, float f12, float f13, float f14, float f15, float f16) {
        float f17;
        float f18;
        float f19 = f14 - f12;
        if (Math.abs(f19) < 1.0E-6f) {
            float f21 = (-(f15 - f13)) / (f16 - f14);
            float f22 = (f15 + f13) / 2.0f;
            f17 = (f13 + f11) / 2.0f;
            f18 = (f21 * (f17 - f22)) + ((f14 + f16) / 2.0f);
        } else {
            float f23 = f16 - f14;
            if (Math.abs(f23) < 1.0E-6f) {
                float f24 = (-(f13 - f11)) / f19;
                float f25 = (f11 + f13) / 2.0f;
                f17 = (f15 + f13) / 2.0f;
                f18 = (f24 * (f17 - f25)) + ((f14 + f12) / 2.0f);
            } else {
                float f26 = (-(f13 - f11)) / f19;
                float f27 = (-(f15 - f13)) / f23;
                float f28 = (f11 + f13) / 2.0f;
                float f29 = (f13 + f15) / 2.0f;
                float f31 = (f12 + f14) / 2.0f;
                f17 = ((((f26 * f28) - (f29 * f27)) + ((f14 + f16) / 2.0f)) - f31) / (f26 - f27);
                f18 = (f26 * (f17 - f28)) + f31;
            }
        }
        float f32 = f11 - f17;
        float f33 = f12 - f18;
        return (float) Math.sqrt((f32 * f32) + (f33 * f33));
    }

    public static float u(float f11, float f12, float f13, float f14, float f15, float f16) {
        return ((float) Math.sqrt(Math.min((f11 * f11) + (f12 * f12), Math.min((f13 * f13) + (f14 * f14), (f15 * f15) + (f16 * f16))))) / t(f11, f12, f13, f14, f15, f16);
    }
}
