package on;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final float f77603a = 1.0E-4f;

    public static float a(float f11, float f12, float f13, float f14) {
        return (float) Math.hypot(f13 - f11, f14 - f12);
    }

    public static float b(float f11, float f12, float f13, float f14, float f15, float f16) {
        return g(a(f11, f12, f13, f14), a(f11, f12, f15, f14), a(f11, f12, f15, f16), a(f11, f12, f13, f16));
    }

    public static float c(float f11, int i11) {
        float f12 = i11;
        int i12 = (int) (f11 / f12);
        if (Math.signum(f11) * f12 < 0.0f && i12 * i11 != f11) {
            i12--;
        }
        return f11 - (i12 * i11);
    }

    public static int d(int i11, int i12) {
        int i13 = i11 / i12;
        if ((i11 ^ i12) < 0 && i13 * i12 != i11) {
            i13--;
        }
        return i11 - (i13 * i12);
    }

    public static boolean e(float f11, float f12, float f13) {
        return f11 + f13 >= f12;
    }

    public static float f(float f11, float f12, float f13) {
        return ((1.0f - f13) * f11) + (f13 * f12);
    }

    public static float g(float f11, float f12, float f13, float f14) {
        return (f11 <= f12 || f11 <= f13 || f11 <= f14) ? (f12 <= f13 || f12 <= f14) ? f13 > f14 ? f13 : f14 : f12 : f11;
    }
}
