package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.u0;
import m80.k;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/ConstraintsKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n1#1,634:1\n621#1:635\n627#1:636\n552#1,4:733\n552#1,4:739\n37#2,5:637\n101#3,10:642\n101#3,10:652\n101#3,10:662\n101#3,10:672\n101#3,10:684\n101#3,10:696\n101#3,10:708\n101#3,10:718\n105#3:732\n105#3:737\n105#3:738\n105#3:743\n105#3:744\n54#4:682\n59#4:694\n54#4:728\n59#4:730\n85#5:683\n90#5:695\n80#5:707\n85#5:729\n90#5:731\n30#6:706\n*S KotlinDebug\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/ConstraintsKt\n*L\n440#1:635\n442#1:636\n546#1:733,4\n548#1:739,4\n486#1:637,5\n514#1:642,10\n515#1:652,10\n516#1:662,10\n517#1:672,10\n525#1:684,10\n526#1:696,10\n530#1:708,10\n533#1:718,10\n545#1:732\n546#1:737\n547#1:738\n548#1:743\n555#1:744\n525#1:682\n526#1:694\n538#1:728\n538#1:730\n525#1:683\n526#1:695\n524#1:707\n538#1:729\n538#1:731\n524#1:706\n*E\n"})
/* loaded from: classes2.dex */
public final class ConstraintsKt {
    private static final long FocusMask = 3;
    private static final int Infinity = Integer.MAX_VALUE;
    private static final int MaxAllowedForMaxFocusBits = 8190;
    private static final int MaxAllowedForMaxNonFocusBits = 262142;
    private static final int MaxAllowedForMinFocusBits = 32766;
    private static final int MaxAllowedForMinNonFocusBits = 65534;
    public static final long MaxDimensionsAndFocusMask = -8589934589L;
    private static final int MaxFocusBits = 18;
    private static final int MaxFocusMask = 262143;
    private static final int MaxNonFocusBits = 13;
    private static final int MaxNonFocusMask = 8191;
    private static final int MinFocusBits = 16;
    private static final int MinFocusMask = 65535;
    private static final int MinNonFocusBits = 15;
    private static final int MinNonFocusMask = 32767;

    @Stable
    public static final long Constraints(int i11, int i12, int i13, int i14) {
        if (!((i13 >= 0) & (i12 >= i11) & (i14 >= i13) & (i11 >= 0))) {
            InlineClassHelperKt.throwIllegalArgumentException("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return createConstraints(i11, i12, i13, i14);
    }

    public static /* synthetic */ long Constraints$default(int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = 0;
        }
        if ((i15 & 2) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        if ((i15 & 4) != 0) {
            i13 = 0;
        }
        if ((i15 & 8) != 0) {
            i14 = Integer.MAX_VALUE;
        }
        return Constraints(i11, i12, i13, i14);
    }

    private static final int addMaxWithMinimum(int i11, int i12) {
        if (i11 == Integer.MAX_VALUE) {
            return i11;
        }
        int i13 = i11 + i12;
        if (i13 < 0) {
            return 0;
        }
        return i13;
    }

    private static final int bitOffsetToIndex(int i11) {
        return (i11 >> 1) + (i11 & 1);
    }

    public static final int bitsNeedForSizeUnchecked(int i11) {
        if (i11 < 8191) {
            return 13;
        }
        if (i11 < 32767) {
            return 15;
        }
        if (i11 < 65535) {
            return 16;
        }
        return i11 < MaxFocusMask ? 18 : 255;
    }

    @Stable
    /* renamed from: constrain-4WqzIAM, reason: not valid java name */
    public static final long m5082constrain4WqzIAM(long j11, long j12) {
        int i11 = (int) (j12 >> 32);
        int m5070getMinWidthimpl = Constraints.m5070getMinWidthimpl(j11);
        int m5068getMaxWidthimpl = Constraints.m5068getMaxWidthimpl(j11);
        if (i11 < m5070getMinWidthimpl) {
            i11 = m5070getMinWidthimpl;
        }
        if (i11 <= m5068getMaxWidthimpl) {
            m5068getMaxWidthimpl = i11;
        }
        int i12 = (int) (j12 & 4294967295L);
        int m5069getMinHeightimpl = Constraints.m5069getMinHeightimpl(j11);
        int m5067getMaxHeightimpl = Constraints.m5067getMaxHeightimpl(j11);
        if (i12 < m5069getMinHeightimpl) {
            i12 = m5069getMinHeightimpl;
        }
        if (i12 <= m5067getMaxHeightimpl) {
            m5067getMaxHeightimpl = i12;
        }
        return IntSize.m5281constructorimpl((m5068getMaxWidthimpl << 32) | (m5067getMaxHeightimpl & 4294967295L));
    }

    /* renamed from: constrain-N9IONVI, reason: not valid java name */
    public static final long m5083constrainN9IONVI(long j11, long j12) {
        int m5070getMinWidthimpl = Constraints.m5070getMinWidthimpl(j11);
        int m5068getMaxWidthimpl = Constraints.m5068getMaxWidthimpl(j11);
        int m5069getMinHeightimpl = Constraints.m5069getMinHeightimpl(j11);
        int m5067getMaxHeightimpl = Constraints.m5067getMaxHeightimpl(j11);
        int m5070getMinWidthimpl2 = Constraints.m5070getMinWidthimpl(j12);
        if (m5070getMinWidthimpl2 < m5070getMinWidthimpl) {
            m5070getMinWidthimpl2 = m5070getMinWidthimpl;
        }
        if (m5070getMinWidthimpl2 > m5068getMaxWidthimpl) {
            m5070getMinWidthimpl2 = m5068getMaxWidthimpl;
        }
        int m5068getMaxWidthimpl2 = Constraints.m5068getMaxWidthimpl(j12);
        if (m5068getMaxWidthimpl2 >= m5070getMinWidthimpl) {
            m5070getMinWidthimpl = m5068getMaxWidthimpl2;
        }
        if (m5070getMinWidthimpl <= m5068getMaxWidthimpl) {
            m5068getMaxWidthimpl = m5070getMinWidthimpl;
        }
        int m5069getMinHeightimpl2 = Constraints.m5069getMinHeightimpl(j12);
        if (m5069getMinHeightimpl2 < m5069getMinHeightimpl) {
            m5069getMinHeightimpl2 = m5069getMinHeightimpl;
        }
        if (m5069getMinHeightimpl2 > m5067getMaxHeightimpl) {
            m5069getMinHeightimpl2 = m5067getMaxHeightimpl;
        }
        int m5067getMaxHeightimpl2 = Constraints.m5067getMaxHeightimpl(j12);
        if (m5067getMaxHeightimpl2 >= m5069getMinHeightimpl) {
            m5069getMinHeightimpl = m5067getMaxHeightimpl2;
        }
        if (m5069getMinHeightimpl <= m5067getMaxHeightimpl) {
            m5067getMaxHeightimpl = m5069getMinHeightimpl;
        }
        return Constraints(m5070getMinWidthimpl2, m5068getMaxWidthimpl, m5069getMinHeightimpl2, m5067getMaxHeightimpl);
    }

    @Stable
    /* renamed from: constrainHeight-K40F9xA, reason: not valid java name */
    public static final int m5084constrainHeightK40F9xA(long j11, int i11) {
        int m5069getMinHeightimpl = Constraints.m5069getMinHeightimpl(j11);
        int m5067getMaxHeightimpl = Constraints.m5067getMaxHeightimpl(j11);
        if (i11 < m5069getMinHeightimpl) {
            i11 = m5069getMinHeightimpl;
        }
        return i11 > m5067getMaxHeightimpl ? m5067getMaxHeightimpl : i11;
    }

    @Stable
    /* renamed from: constrainWidth-K40F9xA, reason: not valid java name */
    public static final int m5085constrainWidthK40F9xA(long j11, int i11) {
        int m5070getMinWidthimpl = Constraints.m5070getMinWidthimpl(j11);
        int m5068getMaxWidthimpl = Constraints.m5068getMaxWidthimpl(j11);
        if (i11 < m5070getMinWidthimpl) {
            i11 = m5070getMinWidthimpl;
        }
        return i11 > m5068getMaxWidthimpl ? m5068getMaxWidthimpl : i11;
    }

    public static final long createConstraints(int i11, int i12, int i13, int i14) {
        int i15 = i14 == Integer.MAX_VALUE ? i13 : i14;
        int bitsNeedForSizeUnchecked = bitsNeedForSizeUnchecked(i15);
        int i16 = i12 == Integer.MAX_VALUE ? i11 : i12;
        int bitsNeedForSizeUnchecked2 = bitsNeedForSizeUnchecked(i16);
        if (bitsNeedForSizeUnchecked + bitsNeedForSizeUnchecked2 > 31) {
            throwInvalidConstraintException(i16, i15);
        }
        int i17 = i12 + 1;
        int i18 = i14 + 1;
        int i19 = bitsNeedForSizeUnchecked2 - 13;
        return Constraints.m5056constructorimpl(((i17 & (~(i17 >> 31))) << 33) | ((i19 >> 1) + (i19 & 1)) | (i11 << 2) | (i13 << (bitsNeedForSizeUnchecked2 + 2)) | ((i18 & (~(i18 >> 31))) << (bitsNeedForSizeUnchecked2 + 33)));
    }

    private static final int heightMask(int i11) {
        return (1 << (18 - i11)) - 1;
    }

    private static final int indexToBitOffset(int i11) {
        return ((i11 & 1) << 1) + (((i11 & 2) >> 1) * 3);
    }

    @Stable
    /* renamed from: isSatisfiedBy-4WqzIAM, reason: not valid java name */
    public static final boolean m5086isSatisfiedBy4WqzIAM(long j11, long j12) {
        int m5070getMinWidthimpl = Constraints.m5070getMinWidthimpl(j11);
        int m5068getMaxWidthimpl = Constraints.m5068getMaxWidthimpl(j11);
        int i11 = (int) (j12 >> 32);
        if (m5070getMinWidthimpl > i11 || i11 > m5068getMaxWidthimpl) {
            return false;
        }
        int i12 = (int) (j12 & 4294967295L);
        return Constraints.m5069getMinHeightimpl(j11) <= i12 && i12 <= Constraints.m5067getMaxHeightimpl(j11);
    }

    private static final int maxAllowedForSize(int i11) {
        if (i11 < 8191) {
            return MaxAllowedForMaxNonFocusBits;
        }
        if (i11 < 32767) {
            return 65534;
        }
        if (i11 < 65535) {
            return MaxAllowedForMinFocusBits;
        }
        if (i11 < MaxFocusMask) {
            return MaxAllowedForMaxFocusBits;
        }
        throwInvalidConstraintsSizeException(i11);
        throw new KotlinNothingValueException();
    }

    private static final int minHeightOffsets(int i11) {
        return i11 + 15;
    }

    @Stable
    /* renamed from: offset-NN6Ew-U, reason: not valid java name */
    public static final long m5087offsetNN6EwU(long j11, int i11, int i12) {
        int m5070getMinWidthimpl = Constraints.m5070getMinWidthimpl(j11) + i11;
        if (m5070getMinWidthimpl < 0) {
            m5070getMinWidthimpl = 0;
        }
        int m5068getMaxWidthimpl = Constraints.m5068getMaxWidthimpl(j11);
        if (m5068getMaxWidthimpl != Integer.MAX_VALUE && (m5068getMaxWidthimpl = m5068getMaxWidthimpl + i11) < 0) {
            m5068getMaxWidthimpl = 0;
        }
        int m5069getMinHeightimpl = Constraints.m5069getMinHeightimpl(j11) + i12;
        if (m5069getMinHeightimpl < 0) {
            m5069getMinHeightimpl = 0;
        }
        int m5067getMaxHeightimpl = Constraints.m5067getMaxHeightimpl(j11);
        return Constraints(m5070getMinWidthimpl, m5068getMaxWidthimpl, m5069getMinHeightimpl, (m5067getMaxHeightimpl == Integer.MAX_VALUE || (m5067getMaxHeightimpl = m5067getMaxHeightimpl + i12) >= 0) ? m5067getMaxHeightimpl : 0);
    }

    /* renamed from: offset-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ long m5088offsetNN6EwU$default(long j11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return m5087offsetNN6EwU(j11, i11, i12);
    }

    public static final void throwInvalidConstraintException(int i11, int i12) {
        throw new IllegalArgumentException("Can't represent a width of " + i11 + " and height of " + i12 + " in Constraints");
    }

    @k
    public static final Void throwInvalidConstraintsSizeException(int i11) {
        throw new IllegalArgumentException("Can't represent a size of " + i11 + " in Constraints");
    }

    private static final int widthMask(int i11) {
        return (1 << (i11 + 13)) - 1;
    }

    @v0
    public static /* synthetic */ void getMaxDimensionsAndFocusMask$annotations() {
    }
}
