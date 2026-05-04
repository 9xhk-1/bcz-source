package yz;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class l0 extends k0 {
    @y0(version = "1.2")
    @o00.f
    public static final float A0(kotlin.jvm.internal.z zVar, int i11) {
        kotlin.jvm.internal.g0.p(zVar, "<this>");
        return Float.intBitsToFloat(i11);
    }

    @o00.f
    public static final boolean B0(double d11) {
        return Math.abs(d11) <= Double.MAX_VALUE;
    }

    @o00.f
    public static final boolean C0(float f11) {
        return Math.abs(f11) <= Float.MAX_VALUE;
    }

    @o00.f
    public static final boolean D0(double d11) {
        return Double.isInfinite(d11);
    }

    @o00.f
    public static final boolean E0(float f11) {
        return Float.isInfinite(f11);
    }

    @o00.f
    public static final boolean F0(double d11) {
        return Double.isNaN(d11);
    }

    @o00.f
    public static final boolean G0(float f11) {
        return Float.isNaN(f11);
    }

    @y0(version = "1.6")
    @o00.f
    public static final int H0(int i11, int i12) {
        return Integer.rotateLeft(i11, i12);
    }

    @y0(version = "1.6")
    @o00.f
    public static final long I0(long j11, int i11) {
        return Long.rotateLeft(j11, i11);
    }

    @y0(version = "1.6")
    @o00.f
    public static final int J0(int i11, int i12) {
        return Integer.rotateRight(i11, i12);
    }

    @y0(version = "1.6")
    @o00.f
    public static final long K0(long j11, int i11) {
        return Long.rotateRight(j11, i11);
    }

    @y0(version = "1.4")
    @o00.f
    public static final int L0(int i11) {
        return Integer.highestOneBit(i11);
    }

    @y0(version = "1.4")
    @o00.f
    public static final long M0(long j11) {
        return Long.highestOneBit(j11);
    }

    @y0(version = "1.4")
    @o00.f
    public static final int N0(int i11) {
        return Integer.lowestOneBit(i11);
    }

    @y0(version = "1.4")
    @o00.f
    public static final long O0(long j11) {
        return Long.lowestOneBit(j11);
    }

    @y0(version = "1.2")
    @o00.f
    public static final int P0(float f11) {
        return Float.floatToIntBits(f11);
    }

    @y0(version = "1.2")
    @o00.f
    public static final long Q0(double d11) {
        return Double.doubleToLongBits(d11);
    }

    @y0(version = "1.2")
    @o00.f
    public static final int R0(float f11) {
        return Float.floatToRawIntBits(f11);
    }

    @y0(version = "1.2")
    @o00.f
    public static final long S0(double d11) {
        return Double.doubleToRawLongBits(d11);
    }

    @y0(version = "1.4")
    @o00.f
    public static final int t0(int i11) {
        return Integer.numberOfLeadingZeros(i11);
    }

    @y0(version = "1.4")
    @o00.f
    public static final int u0(long j11) {
        return Long.numberOfLeadingZeros(j11);
    }

    @y0(version = "1.4")
    @o00.f
    public static final int v0(int i11) {
        return Integer.bitCount(i11);
    }

    @y0(version = "1.4")
    @o00.f
    public static final int w0(long j11) {
        return Long.bitCount(j11);
    }

    @y0(version = "1.4")
    @o00.f
    public static final int x0(int i11) {
        return Integer.numberOfTrailingZeros(i11);
    }

    @y0(version = "1.4")
    @o00.f
    public static final int y0(long j11) {
        return Long.numberOfTrailingZeros(j11);
    }

    @y0(version = "1.2")
    @o00.f
    public static final double z0(kotlin.jvm.internal.w wVar, long j11) {
        kotlin.jvm.internal.g0.p(wVar, "<this>");
        return Double.longBitsToDouble(j11);
    }
}
