package androidx.compose.ui.util;

import com.google.common.math.d;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMathHelpers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,339:1\n69#1,6:341\n87#1,6:347\n105#1,6:353\n123#1,6:359\n306#1,4:366\n28#2:340\n22#2:365\n*S KotlinDebug\n*F\n+ 1 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n65#1:341,6\n83#1:347,6\n101#1:353,6\n119#1:359,6\n338#1:366,4\n31#1:340\n271#1:365\n*E\n"})
/* loaded from: classes2.dex */
public final class MathHelpersKt {
    public static final float fastCbrt(float f11) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f11) & 8589934591L) / 3)) + 709952852);
        float f12 = intBitsToFloat - ((intBitsToFloat - (f11 / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f12 - ((f12 - (f11 / (f12 * f12))) * 0.33333334f);
    }

    public static final double fastCoerceAtLeast(double d11, double d12) {
        return d11 < d12 ? d12 : d11;
    }

    public static final double fastCoerceAtMost(double d11, double d12) {
        return d11 > d12 ? d12 : d11;
    }

    public static final double fastCoerceIn(double d11, double d12, double d13) {
        if (d11 < d12) {
            d11 = d12;
        }
        return d11 > d13 ? d13 : d11;
    }

    public static final boolean fastIsFinite(float f11) {
        return (Float.floatToRawIntBits(f11) & Integer.MAX_VALUE) < 2139095040;
    }

    public static final float fastMaxOf(float f11, float f12, float f13, float f14) {
        return Math.max(f11, Math.max(f12, Math.max(f13, f14)));
    }

    public static final float fastMinOf(float f11, float f12, float f13, float f14) {
        return Math.min(f11, Math.min(f12, Math.min(f13, f14)));
    }

    public static final float lerp(float f11, float f12, float f13) {
        return ((1 - f13) * f11) + (f13 * f12);
    }

    public static final float normalizedAngleCos(float f11) {
        float floor = (f11 + 0.25f) - ((float) Math.floor(0.5f + r3));
        float abs = Math.abs(floor) * 2.0f;
        float f12 = 1.0f - abs;
        return ((floor * 8.0f) * f12) / (1.25f - (abs * f12));
    }

    public static final float normalizedAngleSin(float f11) {
        float floor = f11 - ((float) Math.floor(0.5f + f11));
        float abs = Math.abs(floor) * 2.0f;
        float f12 = 1.0f - abs;
        return ((floor * 8.0f) * f12) / (1.25f - (abs * f12));
    }

    public static final float fastCoerceAtLeast(float f11, float f12) {
        return f11 < f12 ? f12 : f11;
    }

    public static final float fastCoerceAtMost(float f11, float f12) {
        return f11 > f12 ? f12 : f11;
    }

    public static final float fastCoerceIn(float f11, float f12, float f13) {
        if (f11 < f12) {
            f11 = f12;
        }
        return f11 > f13 ? f13 : f11;
    }

    public static final boolean fastIsFinite(double d11) {
        return (Double.doubleToRawLongBits(d11) & Long.MAX_VALUE) < d.f34310b;
    }

    public static final long lerp(long j11, long j12, float f11) {
        return j11 + c10.d.M0((j12 - j11) * f11);
    }

    public static final int fastCoerceAtLeast(int i11, int i12) {
        return i11 < i12 ? i12 : i11;
    }

    public static final int fastCoerceAtMost(int i11, int i12) {
        return i11 > i12 ? i12 : i11;
    }

    public static final int fastCoerceIn(int i11, int i12, int i13) {
        if (i11 < i12) {
            i11 = i12;
        }
        return i11 > i13 ? i13 : i11;
    }

    public static final int lerp(int i11, int i12, float f11) {
        return i11 + ((int) Math.round((i12 - i11) * f11));
    }

    public static final long fastCoerceAtLeast(long j11, long j12) {
        return j11 < j12 ? j12 : j11;
    }

    public static final long fastCoerceAtMost(long j11, long j12) {
        return j11 > j12 ? j12 : j11;
    }

    public static final long fastCoerceIn(long j11, long j12, long j13) {
        if (j11 < j12) {
            j11 = j12;
        }
        return j11 > j13 ? j13 : j11;
    }
}
