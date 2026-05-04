package androidx.compose.animation.core;

import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.u0;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSpringEstimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringEstimation.kt\nandroidx/compose/animation/core/SpringEstimationKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,348:1\n347#1:349\n347#1:351\n344#1:353\n347#1:354\n347#1:356\n344#1:358\n150#2:350\n150#2:352\n150#2:355\n150#2:357\n150#2:359\n*S KotlinDebug\n*F\n+ 1 SpringEstimation.kt\nandroidx/compose/animation/core/SpringEstimationKt\n*L\n172#1:349\n173#1:351\n213#1:353\n247#1:354\n248#1:356\n294#1:358\n172#1:350\n173#1:352\n247#1:355\n248#1:357\n347#1:359\n*E\n"})
/* loaded from: classes.dex */
public final class SpringEstimationKt {
    private static final long MAX_LONG_MILLIS = 9223372036854L;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final long estimateAnimationDurationMillis(float f11, float f12, float f13, float f14, float f15) {
        if (f12 == 0.0f) {
            return 9223372036854L;
        }
        return estimateAnimationDurationMillis(f11, f12, f13, f14, f15);
    }

    private static final double estimateCriticallyDamped(double d11, double d12, double d13, double d14) {
        double d15;
        double d16 = d14;
        double d17 = d11 * d12;
        double d18 = d13 - d17;
        double log = Math.log(Math.abs(d16 / d12)) / d11;
        double log2 = Math.log(Math.abs(d16 / d18));
        int i11 = 0;
        double d19 = log2;
        for (int i12 = 0; i12 < 6; i12++) {
            d19 = log2 - Math.log(Math.abs(d19 / d11));
        }
        double d21 = d19 / d11;
        if (!((Double.doubleToRawLongBits(log) & Long.MAX_VALUE) < com.google.common.math.d.f34310b)) {
            log = d21;
        } else if ((Double.doubleToRawLongBits(d21) & Long.MAX_VALUE) < com.google.common.math.d.f34310b) {
            log = Math.max(log, d21);
        }
        double d22 = (-(d17 + d18)) / (d11 * d18);
        double d23 = d11 * d22;
        double exp = (Math.exp(d23) * d12) + (d18 * d22 * Math.exp(d23));
        if (!Double.isNaN(d22) && d22 > 0.0d) {
            if (d22 <= 0.0d || (-exp) >= d16) {
                log = (-(2.0d / d11)) - (d12 / d18);
                d15 = Double.MAX_VALUE;
                while (d15 > 0.001d && i11 < 100) {
                    i11++;
                    double d24 = d11 * log;
                    double d25 = d16;
                    double exp2 = log - ((((d12 + (d18 * log)) * Math.exp(d24)) + d16) / ((((1 + d24) * d18) + d17) * Math.exp(d24)));
                    d15 = Math.abs(log - exp2);
                    log = exp2;
                    d16 = d25;
                }
                return log;
            }
            if (d18 < 0.0d && d12 > 0.0d) {
                log = 0.0d;
            }
        }
        d16 = -d16;
        d15 = Double.MAX_VALUE;
        while (d15 > 0.001d) {
            i11++;
            double d242 = d11 * log;
            double d252 = d16;
            double exp22 = log - ((((d12 + (d18 * log)) * Math.exp(d242)) + d16) / ((((1 + d242) * d18) + d17) * Math.exp(d242)));
            d15 = Math.abs(log - exp22);
            log = exp22;
            d16 = d252;
        }
        return log;
    }

    private static final long estimateDurationInternal(double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        double d18 = d15;
        if (d16 == 0.0d && d18 == 0.0d) {
            return 0L;
        }
        if (d16 < 0.0d) {
            d18 = -d18;
        }
        double d19 = d18;
        double abs = Math.abs(d16);
        return (long) ((d14 > 1.0d ? estimateOverDamped(d11, d13, abs, d19, d17) : d14 < 1.0d ? estimateUnderDamped(d11, d12, abs, d19, d17) : estimateCriticallyDamped(d11, abs, d19, d17)) * 1000.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final double estimateOverDamped(double r24, double r26, double r28, double r30, double r32) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SpringEstimationKt.estimateOverDamped(double, double, double, double, double):double");
    }

    private static final double estimateOverDamped$xInflection(double d11, double d12, double d13, double d14, double d15) {
        return (d11 * Math.exp(d12 * d13)) + (d14 * Math.exp(d15 * d13));
    }

    private static final double estimateUnderDamped(double d11, double d12, double d13, double d14, double d15) {
        double d16 = (d14 - (d11 * d13)) / d12;
        return Math.log(d15 / Math.sqrt((d13 * d13) + (d16 * d16))) / d11;
    }

    private static final boolean isNotFinite(double d11) {
        return !((Double.doubleToRawLongBits(d11) & Long.MAX_VALUE) < com.google.common.math.d.f34310b);
    }

    private static final double iterateNewtonsMethod(double d11, l<? super Double, Double> lVar, l<? super Double, Double> lVar2) {
        return d11 - (lVar.invoke(Double.valueOf(d11)).doubleValue() / lVar2.invoke(Double.valueOf(d11)).doubleValue());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final long estimateAnimationDurationMillis(double d11, double d12, double d13, double d14, double d15) {
        double sqrt = 2.0d * d12 * Math.sqrt(d11);
        double d16 = (sqrt * sqrt) - (4.0d * d11);
        double sqrt2 = d16 < 0.0d ? 0.0d : Math.sqrt(d16);
        double d17 = -sqrt;
        return estimateDurationInternal((d17 + sqrt2) * 0.5d, (d16 < 0.0d ? Math.sqrt(Math.abs(d16)) : 0.0d) * 0.5d, (d17 - sqrt2) * 0.5d, d12, d13, d14, d15);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final long estimateAnimationDurationMillis(double d11, double d12, double d13, double d14, double d15, double d16) {
        double sqrt = d12 / (Math.sqrt(d11 * d13) * 2.0d);
        double d17 = (d12 * d12) - ((4.0d * d13) * d11);
        double d18 = 1.0d / (2.0d * d13);
        double sqrt2 = d17 < 0.0d ? 0.0d : Math.sqrt(d17);
        double d19 = -d12;
        return estimateDurationInternal((d19 + sqrt2) * d18, (d17 < 0.0d ? Math.sqrt(Math.abs(d17)) : 0.0d) * d18, (d19 - sqrt2) * d18, sqrt, d14, d15, d16);
    }
}
