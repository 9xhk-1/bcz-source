package a3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class e0 {
    public static long a(double d11) {
        return Double.doubleToLongBits(d11);
    }

    public static int b(float f11) {
        return Float.floatToIntBits(f11);
    }

    public static int c(float f11) {
        return Float.floatToRawIntBits(f11) | (((int) ((r2 >>> 24) * 1.003937f)) << 24);
    }

    public static int d(float f11) {
        return Float.floatToRawIntBits(f11);
    }

    public static float e(int i11) {
        return Float.intBitsToFloat(i11);
    }

    public static float f(int i11) {
        return Float.intBitsToFloat(i11 & (-16777217));
    }

    public static double g(long j11) {
        return Double.longBitsToDouble(j11);
    }
}
