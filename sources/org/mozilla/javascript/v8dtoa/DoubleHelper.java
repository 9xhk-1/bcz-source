package org.mozilla.javascript.v8dtoa;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class DoubleHelper {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int kDenormalExponent = -1074;
    private static final int kExponentBias = 1075;
    static final long kExponentMask = 9218868437227405312L;
    static final long kHiddenBit = 4503599627370496L;
    static final long kSignMask = Long.MIN_VALUE;
    static final long kSignificandMask = 4503599627370495L;
    private static final int kSignificandSize = 52;

    public static DiyFp asDiyFp(long j11) {
        return new DiyFp(significand(j11), exponent(j11));
    }

    public static DiyFp asNormalizedDiyFp(long j11) {
        long significand = significand(j11);
        int exponent = exponent(j11);
        while ((4503599627370496L & significand) == 0) {
            significand <<= 1;
            exponent--;
        }
        return new DiyFp(significand << 11, exponent - 11);
    }

    public static int exponent(long j11) {
        return isDenormal(j11) ? kDenormalExponent : ((int) (((j11 & 9218868437227405312L) >>> 52) & 4294967295L)) - 1075;
    }

    public static boolean isDenormal(long j11) {
        return (j11 & 9218868437227405312L) == 0;
    }

    public static boolean isInfinite(long j11) {
        return (j11 & 9218868437227405312L) == 9218868437227405312L && (j11 & 4503599627370495L) == 0;
    }

    public static boolean isNan(long j11) {
        return (j11 & 9218868437227405312L) == 9218868437227405312L && (j11 & 4503599627370495L) != 0;
    }

    public static boolean isSpecial(long j11) {
        return (j11 & 9218868437227405312L) == 9218868437227405312L;
    }

    public static void normalizedBoundaries(long j11, DiyFp diyFp, DiyFp diyFp2) {
        DiyFp asDiyFp = asDiyFp(j11);
        boolean z11 = asDiyFp.f() == 4503599627370496L;
        diyFp2.setF((asDiyFp.f() << 1) + 1);
        diyFp2.setE(asDiyFp.e() - 1);
        diyFp2.normalize();
        if (!z11 || asDiyFp.e() == kDenormalExponent) {
            diyFp.setF((asDiyFp.f() << 1) - 1);
            diyFp.setE(asDiyFp.e() - 1);
        } else {
            diyFp.setF((asDiyFp.f() << 2) - 1);
            diyFp.setE(asDiyFp.e() - 2);
        }
        diyFp.setF(diyFp.f() << (diyFp.e() - diyFp2.e()));
        diyFp.setE(diyFp2.e());
    }

    public static int sign(long j11) {
        return (j11 & Long.MIN_VALUE) == 0 ? 1 : -1;
    }

    public static long significand(long j11) {
        long j12 = 4503599627370495L & j11;
        return !isDenormal(j11) ? j12 + 4503599627370496L : j12;
    }
}
