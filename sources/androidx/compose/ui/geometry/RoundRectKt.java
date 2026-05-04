package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRoundRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundRect.kt\nandroidx/compose/ui/geometry/RoundRectKt\n+ 2 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 8 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,422:1\n33#2:423\n53#3,3:424\n60#3:428\n70#3:431\n60#3:433\n70#3:436\n60#3:438\n70#3:441\n60#3:444\n70#3:447\n60#3:450\n70#3:453\n60#3:456\n70#3:459\n60#3:471\n70#3:474\n53#3,3:477\n48#4:427\n53#4:430\n48#4:432\n53#4:435\n48#4:449\n53#4:452\n48#4:455\n53#4:458\n79#4,2:462\n79#4,2:464\n79#4,2:466\n79#4,2:468\n48#4:470\n53#4:473\n86#4:480\n22#5:429\n22#5:434\n22#5:439\n22#5:442\n22#5:445\n22#5:448\n22#5:451\n22#5:454\n22#5:457\n22#5:460\n22#5:472\n22#5:475\n65#6:437\n69#6:440\n65#6:443\n69#6:446\n139#7:461\n30#8:476\n*S KotlinDebug\n*F\n+ 1 RoundRect.kt\nandroidx/compose/ui/geometry/RoundRectKt\n*L\n234#1:423\n234#1:424,3\n252#1:428\n252#1:431\n272#1:433\n272#1:436\n301#1:438\n302#1:441\n303#1:444\n304#1:447\n324#1:450\n325#1:453\n326#1:456\n327#1:459\n360#1:471\n361#1:474\n382#1:477,3\n252#1:427\n252#1:430\n272#1:432\n272#1:435\n324#1:449\n325#1:452\n326#1:455\n327#1:458\n349#1:462,2\n350#1:464,2\n351#1:466,2\n352#1:468,2\n360#1:470\n361#1:473\n390#1:480\n252#1:429\n272#1:434\n301#1:439\n302#1:442\n303#1:445\n304#1:448\n324#1:451\n325#1:454\n326#1:457\n327#1:460\n360#1:472\n361#1:475\n301#1:437\n302#1:440\n303#1:443\n304#1:446\n344#1:461\n382#1:476\n*E\n"})
/* loaded from: classes.dex */
public final class RoundRectKt {
    @k
    public static final RoundRect RoundRect(@k Rect rect, float f11, float f12) {
        return RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f11, f12);
    }

    @k
    /* renamed from: RoundRect-ZAM2FJo, reason: not valid java name */
    public static final RoundRect m2320RoundRectZAM2FJo(@k Rect rect, long j11, long j12, long j13, long j14) {
        return new RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), j11, j12, j13, j14, null);
    }

    @k
    /* renamed from: RoundRect-gG7oq9Y, reason: not valid java name */
    public static final RoundRect m2322RoundRectgG7oq9Y(float f11, float f12, float f13, float f14, long j11) {
        return RoundRect(f11, f12, f13, f14, Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
    }

    @k
    /* renamed from: RoundRect-sniSvfs, reason: not valid java name */
    public static final RoundRect m2323RoundRectsniSvfs(@k Rect rect, long j11) {
        return RoundRect(rect, Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
    }

    @k
    public static final Rect getBoundingRect(@k RoundRect roundRect) {
        return new Rect(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
    }

    public static final long getCenter(@k RoundRect roundRect) {
        float left = roundRect.getLeft() + (roundRect.getWidth() / 2.0f);
        float top = roundRect.getTop() + (roundRect.getHeight() / 2.0f);
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(top) & 4294967295L) | (Float.floatToRawIntBits(left) << 32));
    }

    public static final float getMaxDimension(@k RoundRect roundRect) {
        return Math.max(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    public static final float getMinDimension(@k RoundRect roundRect) {
        return Math.min(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    @k
    public static final Rect getSafeInnerRect(@k RoundRect roundRect) {
        return new Rect(roundRect.getLeft() + (Math.max(Float.intBitsToFloat((int) (roundRect.m2316getBottomLeftCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (roundRect.m2318getTopLeftCornerRadiuskKHJgLs() >> 32))) * 0.29289323f), roundRect.getTop() + (Math.max(Float.intBitsToFloat((int) (roundRect.m2318getTopLeftCornerRadiuskKHJgLs() & 4294967295L)), Float.intBitsToFloat((int) (roundRect.m2319getTopRightCornerRadiuskKHJgLs() & 4294967295L))) * 0.29289323f), roundRect.getRight() - (Math.max(Float.intBitsToFloat((int) (roundRect.m2319getTopRightCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (roundRect.m2317getBottomRightCornerRadiuskKHJgLs() >> 32))) * 0.29289323f), roundRect.getBottom() - (Math.max(Float.intBitsToFloat((int) (roundRect.m2317getBottomRightCornerRadiuskKHJgLs() & 4294967295L)), Float.intBitsToFloat((int) (roundRect.m2316getBottomLeftCornerRadiuskKHJgLs() & 4294967295L))) * 0.29289323f));
    }

    public static final boolean isCircle(@k RoundRect roundRect) {
        return roundRect.getWidth() == roundRect.getHeight() && isEllipse(roundRect);
    }

    public static final boolean isEllipse(@k RoundRect roundRect) {
        return roundRect.m2318getTopLeftCornerRadiuskKHJgLs() == roundRect.m2319getTopRightCornerRadiuskKHJgLs() && roundRect.m2319getTopRightCornerRadiuskKHJgLs() == roundRect.m2317getBottomRightCornerRadiuskKHJgLs() && roundRect.m2317getBottomRightCornerRadiuskKHJgLs() == roundRect.m2316getBottomLeftCornerRadiuskKHJgLs() && ((double) roundRect.getWidth()) <= ((double) Float.intBitsToFloat((int) (roundRect.m2318getTopLeftCornerRadiuskKHJgLs() >> 32))) * 2.0d && ((double) roundRect.getHeight()) <= ((double) Float.intBitsToFloat((int) (roundRect.m2318getTopLeftCornerRadiuskKHJgLs() & 4294967295L))) * 2.0d;
    }

    public static final boolean isEmpty(@k RoundRect roundRect) {
        return roundRect.getLeft() >= roundRect.getRight() || roundRect.getTop() >= roundRect.getBottom();
    }

    public static final boolean isFinite(@k RoundRect roundRect) {
        return (Float.floatToRawIntBits(roundRect.getLeft()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(roundRect.getTop()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(roundRect.getRight()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(roundRect.getBottom()) & Integer.MAX_VALUE) < 2139095040;
    }

    public static final boolean isRect(@k RoundRect roundRect) {
        long m2318getTopLeftCornerRadiuskKHJgLs = roundRect.m2318getTopLeftCornerRadiuskKHJgLs() & 9223372034707292159L;
        if (((~m2318getTopLeftCornerRadiuskKHJgLs) & (m2318getTopLeftCornerRadiuskKHJgLs - InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0) {
            return false;
        }
        long m2319getTopRightCornerRadiuskKHJgLs = roundRect.m2319getTopRightCornerRadiuskKHJgLs() & 9223372034707292159L;
        if (((~m2319getTopRightCornerRadiuskKHJgLs) & (m2319getTopRightCornerRadiuskKHJgLs - InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0) {
            return false;
        }
        long m2316getBottomLeftCornerRadiuskKHJgLs = roundRect.m2316getBottomLeftCornerRadiuskKHJgLs() & 9223372034707292159L;
        if (((~m2316getBottomLeftCornerRadiuskKHJgLs) & (m2316getBottomLeftCornerRadiuskKHJgLs - InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0) {
            return false;
        }
        long m2317getBottomRightCornerRadiuskKHJgLs = roundRect.m2317getBottomRightCornerRadiuskKHJgLs() & 9223372034707292159L;
        return (((~m2317getBottomRightCornerRadiuskKHJgLs) & (m2317getBottomRightCornerRadiuskKHJgLs - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) != 0;
    }

    public static final boolean isSimple(@k RoundRect roundRect) {
        long m2318getTopLeftCornerRadiuskKHJgLs = roundRect.m2318getTopLeftCornerRadiuskKHJgLs();
        return (m2318getTopLeftCornerRadiuskKHJgLs >>> 32) == (m2318getTopLeftCornerRadiuskKHJgLs & 4294967295L) && roundRect.m2318getTopLeftCornerRadiuskKHJgLs() == roundRect.m2319getTopRightCornerRadiuskKHJgLs() && roundRect.m2318getTopLeftCornerRadiuskKHJgLs() == roundRect.m2317getBottomRightCornerRadiuskKHJgLs() && roundRect.m2318getTopLeftCornerRadiuskKHJgLs() == roundRect.m2316getBottomLeftCornerRadiuskKHJgLs();
    }

    @k
    public static final RoundRect lerp(@k RoundRect roundRect, @k RoundRect roundRect2, float f11) {
        return new RoundRect(MathHelpersKt.lerp(roundRect.getLeft(), roundRect2.getLeft(), f11), MathHelpersKt.lerp(roundRect.getTop(), roundRect2.getTop(), f11), MathHelpersKt.lerp(roundRect.getRight(), roundRect2.getRight(), f11), MathHelpersKt.lerp(roundRect.getBottom(), roundRect2.getBottom(), f11), CornerRadiusKt.m2241lerp3Ry4LBc(roundRect.m2318getTopLeftCornerRadiuskKHJgLs(), roundRect2.m2318getTopLeftCornerRadiuskKHJgLs(), f11), CornerRadiusKt.m2241lerp3Ry4LBc(roundRect.m2319getTopRightCornerRadiuskKHJgLs(), roundRect2.m2319getTopRightCornerRadiuskKHJgLs(), f11), CornerRadiusKt.m2241lerp3Ry4LBc(roundRect.m2317getBottomRightCornerRadiuskKHJgLs(), roundRect2.m2317getBottomRightCornerRadiuskKHJgLs(), f11), CornerRadiusKt.m2241lerp3Ry4LBc(roundRect.m2316getBottomLeftCornerRadiuskKHJgLs(), roundRect2.m2316getBottomLeftCornerRadiuskKHJgLs(), f11), null);
    }

    @k
    /* renamed from: translate-Uv8p0NA, reason: not valid java name */
    public static final RoundRect m2324translateUv8p0NA(@k RoundRect roundRect, long j11) {
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (4294967295L & j11);
        return new RoundRect(roundRect.getLeft() + Float.intBitsToFloat(i11), roundRect.getTop() + Float.intBitsToFloat(i12), roundRect.getRight() + Float.intBitsToFloat(i11), Float.intBitsToFloat(i12) + roundRect.getBottom(), roundRect.m2318getTopLeftCornerRadiuskKHJgLs(), roundRect.m2319getTopRightCornerRadiuskKHJgLs(), roundRect.m2317getBottomRightCornerRadiuskKHJgLs(), roundRect.m2316getBottomLeftCornerRadiuskKHJgLs(), null);
    }

    @k
    public static final RoundRect RoundRect(float f11, float f12, float f13, float f14, float f15, float f16) {
        long m2222constructorimpl = CornerRadius.m2222constructorimpl((Float.floatToRawIntBits(f15) << 32) | (Float.floatToRawIntBits(f16) & 4294967295L));
        return new RoundRect(f11, f12, f13, f14, m2222constructorimpl, m2222constructorimpl, m2222constructorimpl, m2222constructorimpl, null);
    }
}
