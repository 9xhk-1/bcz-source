package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@u0({"SMAP\nDensity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Density.kt\nandroidx/compose/ui/unit/Density\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n1#1,111:1\n26#2:112\n26#2:118\n22#2:129\n52#3,5:113\n123#4:119\n123#4:120\n363#4:121\n33#5:122\n148#5:126\n53#6,3:123\n60#6:128\n70#6:131\n57#7:127\n61#7:130\n*S KotlinDebug\n*F\n+ 1 Density.kt\nandroidx/compose/ui/unit/Density\n*L\n58#1:112\n73#1:118\n106#1:129\n68#1:113,5\n76#1:119\n82#1:120\n96#1:121\n97#1:122\n105#1:126\n97#1:123,3\n106#1:128\n106#1:131\n106#1:127\n106#1:130\n*E\n"})
/* loaded from: classes2.dex */
public interface Density extends FontScaling {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m5101roundToPxR2X_6o(@k Density density, long j11) {
            return Density.super.mo370roundToPxR2X_6o(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m5102roundToPx0680j_4(@k Density density, float f11) {
            return Density.super.mo371roundToPx0680j_4(f11);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m5103toDpGaN1DYA(@k Density density, long j11) {
            return Density.super.mo372toDpGaN1DYA(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m5105toDpu2uoSUM(@k Density density, int i11) {
            return Density.super.mo374toDpu2uoSUM(i11);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m5106toDpSizekrfVVM(@k Density density, long j11) {
            return Density.super.mo375toDpSizekrfVVM(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m5107toPxR2X_6o(@k Density density, long j11) {
            return Density.super.mo376toPxR2X_6o(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m5108toPx0680j_4(@k Density density, float f11) {
            return Density.super.mo377toPx0680j_4(f11);
        }

        @Stable
        @Deprecated
        @k
        public static Rect toRect(@k Density density, @k DpRect dpRect) {
            return Density.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m5109toSizeXkaWNTQ(@k Density density, long j11) {
            return Density.super.mo378toSizeXkaWNTQ(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m5110toSp0xMU5do(@k Density density, float f11) {
            return Density.super.mo379toSp0xMU5do(f11);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m5112toSpkPz2Gy4(@k Density density, int i11) {
            return Density.super.mo381toSpkPz2Gy4(i11);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m5104toDpu2uoSUM(@k Density density, float f11) {
            return Density.super.mo373toDpu2uoSUM(f11);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m5111toSpkPz2Gy4(@k Density density, float f11) {
            return Density.super.mo380toSpkPz2Gy4(f11);
        }

        @Stable
        public static /* synthetic */ void getDensity$annotations() {
        }
    }

    float getDensity();

    @Stable
    /* renamed from: roundToPx--R2X_6o */
    default int mo370roundToPxR2X_6o(long j11) {
        return Math.round(mo376toPxR2X_6o(j11));
    }

    @Stable
    /* renamed from: roundToPx-0680j_4 */
    default int mo371roundToPx0680j_4(float f11) {
        float mo377toPx0680j_4 = mo377toPx0680j_4(f11);
        if (Float.isInfinite(mo377toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(mo377toPx0680j_4);
    }

    @Stable
    /* renamed from: toDp-u2uoSUM */
    default float mo374toDpu2uoSUM(int i11) {
        return Dp.m5115constructorimpl(i11 / getDensity());
    }

    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    default long mo375toDpSizekrfVVM(long j11) {
        return j11 != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? DpKt.m5137DpSizeYgX7TsA(mo373toDpu2uoSUM(Float.intBitsToFloat((int) (j11 >> 32))), mo373toDpu2uoSUM(Float.intBitsToFloat((int) (j11 & 4294967295L)))) : DpSize.Companion.m5222getUnspecifiedMYxV2XQ();
    }

    @Stable
    /* renamed from: toPx--R2X_6o */
    default float mo376toPxR2X_6o(long j11) {
        if (!TextUnitType.m5337equalsimpl0(TextUnit.m5308getTypeUIouoOA(j11), TextUnitType.Companion.m5342getSpUIouoOA())) {
            InlineClassHelperKt.throwIllegalStateException("Only Sp can convert to Px");
        }
        return mo377toPx0680j_4(mo372toDpGaN1DYA(j11));
    }

    @Stable
    /* renamed from: toPx-0680j_4 */
    default float mo377toPx0680j_4(float f11) {
        return f11 * getDensity();
    }

    @Stable
    @k
    default Rect toRect(@k DpRect dpRect) {
        return new Rect(mo377toPx0680j_4(dpRect.m5198getLeftD9Ej5fM()), mo377toPx0680j_4(dpRect.m5200getTopD9Ej5fM()), mo377toPx0680j_4(dpRect.m5199getRightD9Ej5fM()), mo377toPx0680j_4(dpRect.m5197getBottomD9Ej5fM()));
    }

    @Stable
    /* renamed from: toSize-XkaWNTQ */
    default long mo378toSizeXkaWNTQ(long j11) {
        if (j11 == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            return Size.Companion.m2345getUnspecifiedNHjbRc();
        }
        float mo377toPx0680j_4 = mo377toPx0680j_4(DpSize.m5213getWidthD9Ej5fM(j11));
        float mo377toPx0680j_42 = mo377toPx0680j_4(DpSize.m5211getHeightD9Ej5fM(j11));
        return Size.m2328constructorimpl((Float.floatToRawIntBits(mo377toPx0680j_42) & 4294967295L) | (Float.floatToRawIntBits(mo377toPx0680j_4) << 32));
    }

    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    default long mo381toSpkPz2Gy4(int i11) {
        return mo379toSp0xMU5do(mo374toDpu2uoSUM(i11));
    }

    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    default long mo380toSpkPz2Gy4(float f11) {
        return mo379toSp0xMU5do(mo373toDpu2uoSUM(f11));
    }

    @Stable
    /* renamed from: toDp-u2uoSUM */
    default float mo373toDpu2uoSUM(float f11) {
        return Dp.m5115constructorimpl(f11 / getDensity());
    }
}
