package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.media3.extractor.WavUtil;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import w00.h;
import yz.n;
import yz.v0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
@u0({"SMAP\nConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints\n+ 2 Constraints.kt\nandroidx/compose/ui/unit/ConstraintsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n*L\n1#1,634:1\n67#1:635\n67#1:638\n67#1:641\n67#1:645\n67#1:649\n67#1:652\n67#1:656\n67#1:660\n67#1:664\n618#2:636\n630#2:637\n618#2:639\n630#2:640\n618#2:642\n633#2:643\n627#2:644\n618#2:646\n633#2:647\n627#2:648\n618#2:650\n630#2:651\n618#2:653\n633#2:654\n627#2:655\n618#2:657\n630#2:658\n618#2:661\n633#2:662\n627#2:663\n618#2:665\n630#2:666\n627#2:667\n633#2:668\n1#3:659\n37#4,5:669\n*S KotlinDebug\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints\n*L\n72#1:635\n82#1:638\n90#1:641\n102#1:645\n116#1:649\n127#1:652\n137#1:656\n148#1:660\n166#1:664\n72#1:636\n72#1:637\n82#1:639\n82#1:640\n90#1:642\n91#1:643\n92#1:644\n102#1:646\n103#1:647\n104#1:648\n116#1:650\n116#1:651\n127#1:653\n128#1:654\n129#1:655\n137#1:657\n137#1:658\n148#1:661\n149#1:662\n150#1:663\n166#1:665\n167#1:666\n168#1:667\n169#1:668\n185#1:669,5\n*E\n"})
@Immutable
/* loaded from: classes2.dex */
public final class Constraints {

    @k
    public static final Companion Companion = new Companion(null);
    public static final int Infinity = Integer.MAX_VALUE;
    private final long value;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints$Companion\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n+ 3 Constraints.kt\nandroidx/compose/ui/unit/ConstraintsKt\n*L\n1#1,634:1\n37#2,5:635\n37#2,5:640\n37#2,5:645\n465#3,6:650\n465#3,6:656\n*S KotlinDebug\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints$Companion\n*L\n224#1:635,5\n231#1:640,5\n243#1:645,5\n305#1:650,6\n341#1:656,6\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: restrictConstraints-xF2OJ5Q$default, reason: not valid java name */
        public static /* synthetic */ long m5075restrictConstraintsxF2OJ5Q$default(Companion companion, int i11, int i12, int i13, int i14, boolean z11, int i15, Object obj) {
            if ((i15 & 16) != 0) {
                z11 = true;
            }
            return companion.m5081restrictConstraintsxF2OJ5Q(i11, i12, i13, i14, z11);
        }

        @Stable
        /* renamed from: fitPrioritizingHeight-Zbe2FdA, reason: not valid java name */
        public final long m5076fitPrioritizingHeightZbe2FdA(int i11, int i12, int i13, int i14) {
            int i15 = 262142;
            int min = Math.min(i13, 262142);
            int min2 = i14 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i14, 262142);
            int i16 = min2 == Integer.MAX_VALUE ? min : min2;
            if (i16 >= 8191) {
                if (i16 < 32767) {
                    i15 = WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE;
                } else if (i16 < 65535) {
                    i15 = 32766;
                } else {
                    if (i16 >= 262143) {
                        ConstraintsKt.throwInvalidConstraintsSizeException(i16);
                        throw new KotlinNothingValueException();
                    }
                    i15 = 8190;
                }
            }
            return ConstraintsKt.Constraints(Math.min(i15, i11), i12 != Integer.MAX_VALUE ? Math.min(i15, i12) : Integer.MAX_VALUE, min, min2);
        }

        @Stable
        /* renamed from: fitPrioritizingWidth-Zbe2FdA, reason: not valid java name */
        public final long m5077fitPrioritizingWidthZbe2FdA(int i11, int i12, int i13, int i14) {
            int i15 = 262142;
            int min = Math.min(i11, 262142);
            int min2 = i12 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i12, 262142);
            int i16 = min2 == Integer.MAX_VALUE ? min : min2;
            if (i16 >= 8191) {
                if (i16 < 32767) {
                    i15 = WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE;
                } else if (i16 < 65535) {
                    i15 = 32766;
                } else {
                    if (i16 >= 262143) {
                        ConstraintsKt.throwInvalidConstraintsSizeException(i16);
                        throw new KotlinNothingValueException();
                    }
                    i15 = 8190;
                }
            }
            return ConstraintsKt.Constraints(min, min2, Math.min(i15, i13), i14 != Integer.MAX_VALUE ? Math.min(i15, i14) : Integer.MAX_VALUE);
        }

        @Stable
        /* renamed from: fixed-JhjzzOo, reason: not valid java name */
        public final long m5078fixedJhjzzOo(int i11, int i12) {
            if (!((i12 >= 0) & (i11 >= 0))) {
                InlineClassHelperKt.throwIllegalArgumentException("width and height must be >= 0");
            }
            return ConstraintsKt.createConstraints(i11, i11, i12, i12);
        }

        @Stable
        /* renamed from: fixedHeight-OenEA2s, reason: not valid java name */
        public final long m5079fixedHeightOenEA2s(int i11) {
            if (!(i11 >= 0)) {
                InlineClassHelperKt.throwIllegalArgumentException("height must be >= 0");
            }
            return ConstraintsKt.createConstraints(0, Integer.MAX_VALUE, i11, i11);
        }

        @Stable
        /* renamed from: fixedWidth-OenEA2s, reason: not valid java name */
        public final long m5080fixedWidthOenEA2s(int i11) {
            if (!(i11 >= 0)) {
                InlineClassHelperKt.throwIllegalArgumentException("width must be >= 0");
            }
            return ConstraintsKt.createConstraints(i11, i11, 0, Integer.MAX_VALUE);
        }

        @Stable
        @n(message = "Replace with fitPrioritizingWidth", replaceWith = @w0(expression = "Constraints.fitPrioritizingWidth(minWidth, maxWidth, minHeight, maxHeight)", imports = {}))
        /* renamed from: restrictConstraints-xF2OJ5Q, reason: not valid java name */
        public final long m5081restrictConstraintsxF2OJ5Q(int i11, int i12, int i13, int i14, boolean z11) {
            return z11 ? m5077fitPrioritizingWidthZbe2FdA(i11, i12, i13, i14) : m5076fitPrioritizingHeightZbe2FdA(i11, i12, i13, i14);
        }

        private Companion() {
        }
    }

    private /* synthetic */ Constraints(long j11) {
        this.value = j11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Constraints m5055boximpl(long j11) {
        return new Constraints(j11);
    }

    /* renamed from: copy-Zbe2FdA, reason: not valid java name */
    public static final long m5057copyZbe2FdA(long j11, int i11, int i12, int i13, int i14) {
        if (!(i12 >= i11 && i14 >= i13 && i11 >= 0 && i13 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return ConstraintsKt.createConstraints(i11, i12, i13, i14);
    }

    /* renamed from: copy-Zbe2FdA$default, reason: not valid java name */
    public static /* synthetic */ long m5058copyZbe2FdA$default(long j11, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = m5070getMinWidthimpl(j11);
        }
        int i16 = i11;
        if ((i15 & 2) != 0) {
            i12 = m5068getMaxWidthimpl(j11);
        }
        int i17 = i12;
        if ((i15 & 4) != 0) {
            i13 = m5069getMinHeightimpl(j11);
        }
        int i18 = i13;
        if ((i15 & 8) != 0) {
            i14 = m5067getMaxHeightimpl(j11);
        }
        return m5057copyZbe2FdA(j11, i16, i17, i18, i14);
    }

    /* renamed from: copyMaxDimensions-msEJaDk, reason: not valid java name */
    public static final long m5059copyMaxDimensionsmsEJaDk(long j11) {
        return m5056constructorimpl(j11 & ConstraintsKt.MaxDimensionsAndFocusMask);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5060equalsimpl(long j11, Object obj) {
        return (obj instanceof Constraints) && j11 == ((Constraints) obj).m5074unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5061equalsimpl0(long j11, long j12) {
        return j11 == j12;
    }

    /* renamed from: getFocusIndex-impl, reason: not valid java name */
    private static final int m5062getFocusIndeximpl(long j11) {
        return (int) (j11 & 3);
    }

    /* renamed from: getHasBoundedHeight-impl, reason: not valid java name */
    public static final boolean m5063getHasBoundedHeightimpl(long j11) {
        int i11 = (int) (3 & j11);
        int i12 = ((i11 & 1) << 1) + (((i11 & 2) >> 1) * 3);
        return (((int) (j11 >> (i12 + 46))) & ((1 << (18 - i12)) - 1)) != 0;
    }

    /* renamed from: getHasBoundedWidth-impl, reason: not valid java name */
    public static final boolean m5064getHasBoundedWidthimpl(long j11) {
        int i11 = (int) (3 & j11);
        return (((int) (j11 >> 33)) & ((1 << ((((i11 & 1) << 1) + (((i11 & 2) >> 1) * 3)) + 13)) - 1)) != 0;
    }

    /* renamed from: getHasFixedHeight-impl, reason: not valid java name */
    public static final boolean m5065getHasFixedHeightimpl(long j11) {
        int i11 = (int) (3 & j11);
        int i12 = ((i11 & 1) << 1) + (((i11 & 2) >> 1) * 3);
        int i13 = (1 << (18 - i12)) - 1;
        int i14 = ((int) (j11 >> (i12 + 15))) & i13;
        int i15 = ((int) (j11 >> (i12 + 46))) & i13;
        return i14 == (i15 == 0 ? Integer.MAX_VALUE : i15 - 1);
    }

    /* renamed from: getHasFixedWidth-impl, reason: not valid java name */
    public static final boolean m5066getHasFixedWidthimpl(long j11) {
        int i11 = (int) (3 & j11);
        int i12 = (1 << ((((i11 & 1) << 1) + (((i11 & 2) >> 1) * 3)) + 13)) - 1;
        int i13 = ((int) (j11 >> 2)) & i12;
        int i14 = ((int) (j11 >> 33)) & i12;
        return i13 == (i14 == 0 ? Integer.MAX_VALUE : i14 - 1);
    }

    /* renamed from: getMaxHeight-impl, reason: not valid java name */
    public static final int m5067getMaxHeightimpl(long j11) {
        int i11 = (int) (3 & j11);
        int i12 = ((i11 & 1) << 1) + (((i11 & 2) >> 1) * 3);
        int i13 = ((int) (j11 >> (i12 + 46))) & ((1 << (18 - i12)) - 1);
        if (i13 == 0) {
            return Integer.MAX_VALUE;
        }
        return i13 - 1;
    }

    /* renamed from: getMaxWidth-impl, reason: not valid java name */
    public static final int m5068getMaxWidthimpl(long j11) {
        int i11 = (int) (3 & j11);
        int i12 = ((int) (j11 >> 33)) & ((1 << ((((i11 & 1) << 1) + (((i11 & 2) >> 1) * 3)) + 13)) - 1);
        if (i12 == 0) {
            return Integer.MAX_VALUE;
        }
        return i12 - 1;
    }

    /* renamed from: getMinHeight-impl, reason: not valid java name */
    public static final int m5069getMinHeightimpl(long j11) {
        int i11 = (int) (3 & j11);
        int i12 = ((i11 & 1) << 1) + (((i11 & 2) >> 1) * 3);
        return ((int) (j11 >> (i12 + 15))) & ((1 << (18 - i12)) - 1);
    }

    /* renamed from: getMinWidth-impl, reason: not valid java name */
    public static final int m5070getMinWidthimpl(long j11) {
        int i11 = (int) (3 & j11);
        return ((int) (j11 >> 2)) & ((1 << ((((i11 & 1) << 1) + (((i11 & 2) >> 1) * 3)) + 13)) - 1);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5071hashCodeimpl(long j11) {
        return Long.hashCode(j11);
    }

    /* renamed from: isZero-impl, reason: not valid java name */
    public static final boolean m5072isZeroimpl(long j11) {
        int i11 = (int) (3 & j11);
        int i12 = ((i11 & 1) << 1) + (((i11 & 2) >> 1) * 3);
        return ((((int) (j11 >> 33)) & ((1 << (i12 + 13)) - 1)) - 1 == 0) | ((((int) (j11 >> (i12 + 46))) & ((1 << (18 - i12)) - 1)) - 1 == 0);
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5073toStringimpl(long j11) {
        int m5068getMaxWidthimpl = m5068getMaxWidthimpl(j11);
        String valueOf = m5068getMaxWidthimpl == Integer.MAX_VALUE ? "Infinity" : String.valueOf(m5068getMaxWidthimpl);
        int m5067getMaxHeightimpl = m5067getMaxHeightimpl(j11);
        return "Constraints(minWidth = " + m5070getMinWidthimpl(j11) + ", maxWidth = " + valueOf + ", minHeight = " + m5069getMinHeightimpl(j11) + ", maxHeight = " + (m5067getMaxHeightimpl != Integer.MAX_VALUE ? String.valueOf(m5067getMaxHeightimpl) : "Infinity") + ')';
    }

    public boolean equals(Object obj) {
        return m5060equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5071hashCodeimpl(this.value);
    }

    @k
    public String toString() {
        return m5073toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m5074unboximpl() {
        return this.value;
    }

    @Stable
    public static /* synthetic */ void getHasFixedHeight$annotations() {
    }

    @Stable
    public static /* synthetic */ void getHasFixedWidth$annotations() {
    }

    @v0
    public static /* synthetic */ void getValue$annotations() {
    }

    @Stable
    public static /* synthetic */ void isZero$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m5056constructorimpl(long j11) {
        return j11;
    }
}
