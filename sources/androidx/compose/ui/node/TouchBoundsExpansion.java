package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes2.dex */
public final class TouchBoundsExpansion {
    private static final long IS_LAYOUT_DIRECTION_AWARE = Long.MIN_VALUE;
    private static final int MASK = 32767;
    public static final int MAX_VALUE = 32767;
    private static final int SHIFT = 15;
    private final long packedValue;

    @k
    public static final Companion Companion = new Companion(null);
    private static final long None = TouchBoundsExpansionKt.TouchBoundsExpansion$default(0, 0, 0, 0, 14, null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTouchBoundsExpansion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchBoundsExpansion.kt\nandroidx/compose/ui/node/TouchBoundsExpansion$Companion\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,248:1\n102#2,5:249\n102#2,5:254\n102#2,5:259\n102#2,5:264\n*S KotlinDebug\n*F\n+ 1 TouchBoundsExpansion.kt\nandroidx/compose/ui/node/TouchBoundsExpansion$Companion\n*L\n49#1:249,5\n52#1:254,5\n55#1:259,5\n58#1:264,5\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: Absolute-vsh68fg$default, reason: not valid java name */
        public static /* synthetic */ long m4211Absolutevsh68fg$default(Companion companion, int i11, int i12, int i13, int i14, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                i11 = 0;
            }
            if ((i15 & 2) != 0) {
                i12 = 0;
            }
            if ((i15 & 4) != 0) {
                i13 = 0;
            }
            if ((i15 & 8) != 0) {
                i14 = 0;
            }
            return companion.m4212Absolutevsh68fg(i11, i12, i13, i14);
        }

        private final long trimAndShift(int i11, int i12) {
            return (i11 & 32767) << (i12 * 15);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int unpack(long j11, int i11) {
            return ((int) (j11 >> (i11 * 15))) & 32767;
        }

        /* renamed from: Absolute-vsh68fg, reason: not valid java name */
        public final long m4212Absolutevsh68fg(int i11, int i12, int i13, int i14) {
            if (!(i11 >= 0 && i11 < 32768)) {
                InlineClassHelperKt.throwIllegalArgumentException("Start must be in the range of 0 .. 32767");
            }
            if (!(i12 >= 0 && i12 < 32768)) {
                InlineClassHelperKt.throwIllegalArgumentException("Top must be in the range of 0 .. 32767");
            }
            if (!(i13 >= 0 && i13 < 32768)) {
                InlineClassHelperKt.throwIllegalArgumentException("End must be in the range of 0 .. 32767");
            }
            if (!(i14 >= 0 && i14 < 32768)) {
                InlineClassHelperKt.throwIllegalArgumentException("Bottom must be in the range of 0 .. 32767");
            }
            return TouchBoundsExpansion.m4200constructorimpl(pack$ui_release(i11, i12, i13, i14, false));
        }

        /* renamed from: getNone-RZrCHBk, reason: not valid java name */
        public final long m4213getNoneRZrCHBk() {
            return TouchBoundsExpansion.None;
        }

        public final long pack$ui_release(int i11, int i12, int i13, int i14, boolean z11) {
            return trimAndShift(i12, 1) | trimAndShift(i11, 0) | trimAndShift(i13, 2) | trimAndShift(i14, 3) | (z11 ? Long.MIN_VALUE : 0L);
        }

        private Companion() {
        }
    }

    private /* synthetic */ TouchBoundsExpansion(long j11) {
        this.packedValue = j11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TouchBoundsExpansion m4197boximpl(long j11) {
        return new TouchBoundsExpansion(j11);
    }

    /* renamed from: computeLeft-impl$ui_release, reason: not valid java name */
    public static final int m4198computeLeftimpl$ui_release(long j11, @k LayoutDirection layoutDirection) {
        return (!m4208isLayoutDirectionAwareimpl(j11) || layoutDirection == LayoutDirection.Ltr) ? m4205getStartimpl(j11) : m4204getEndimpl(j11);
    }

    /* renamed from: computeRight-impl$ui_release, reason: not valid java name */
    public static final int m4199computeRightimpl$ui_release(long j11, @k LayoutDirection layoutDirection) {
        return (!m4208isLayoutDirectionAwareimpl(j11) || layoutDirection == LayoutDirection.Ltr) ? m4204getEndimpl(j11) : m4205getStartimpl(j11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4201equalsimpl(long j11, Object obj) {
        return (obj instanceof TouchBoundsExpansion) && j11 == ((TouchBoundsExpansion) obj).m4210unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4202equalsimpl0(long j11, long j12) {
        return j11 == j12;
    }

    /* renamed from: getBottom-impl, reason: not valid java name */
    public static final int m4203getBottomimpl(long j11) {
        return Companion.unpack(j11, 3);
    }

    /* renamed from: getEnd-impl, reason: not valid java name */
    public static final int m4204getEndimpl(long j11) {
        return Companion.unpack(j11, 2);
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final int m4205getStartimpl(long j11) {
        return Companion.unpack(j11, 0);
    }

    /* renamed from: getTop-impl, reason: not valid java name */
    public static final int m4206getTopimpl(long j11) {
        return Companion.unpack(j11, 1);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4207hashCodeimpl(long j11) {
        return Long.hashCode(j11);
    }

    /* renamed from: isLayoutDirectionAware-impl, reason: not valid java name */
    public static final boolean m4208isLayoutDirectionAwareimpl(long j11) {
        return (j11 & Long.MIN_VALUE) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4209toStringimpl(long j11) {
        return "TouchBoundsExpansion(packedValue=" + j11 + ')';
    }

    public boolean equals(Object obj) {
        return m4201equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m4207hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m4209toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m4210unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m4200constructorimpl(long j11) {
        return j11;
    }
}
