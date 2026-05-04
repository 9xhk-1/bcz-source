package hz;

import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "ByteOrderJVMKt")
/* loaded from: classes8.dex */
public final class a {
    public static final double a(double d11) {
        return Double.longBitsToDouble(Long.reverseBytes(Double.doubleToRawLongBits(d11)));
    }

    public static final float b(float f11) {
        return Float.intBitsToFloat(Integer.reverseBytes(Float.floatToRawIntBits(f11)));
    }

    public static final int c(int i11) {
        return Integer.reverseBytes(i11);
    }

    public static final long d(long j11) {
        return Long.reverseBytes(j11);
    }

    public static final short e(short s11) {
        return Short.reverseBytes(s11);
    }
}
