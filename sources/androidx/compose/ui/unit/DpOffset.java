package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import org.junit.jupiter.api.j2;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
@u0({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpOffset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,434:1\n60#2:435\n70#2:438\n53#2,3:441\n53#2,3:445\n53#2,3:449\n22#3:436\n22#3:439\n123#4:437\n123#4:440\n254#4:452\n52#5:444\n49#5:448\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpOffset\n*L\n210#1:435\n215#1:438\n218#1:441,3\n223#1:445,3\n228#1:449,3\n210#1:436\n215#1:439\n210#1:437\n215#1:440\n232#1:452\n223#1:444\n228#1:448\n*E\n"})
@Immutable
/* loaded from: classes2.dex */
public final class DpOffset {
    private final long packedValue;

    @k
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m5171constructorimpl(0);
    private static final long Unspecified = m5171constructorimpl(androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getUnspecified-RKDOV3M, reason: not valid java name */
        public final long m5185getUnspecifiedRKDOV3M() {
            return DpOffset.Unspecified;
        }

        /* renamed from: getZero-RKDOV3M, reason: not valid java name */
        public final long m5186getZeroRKDOV3M() {
            return DpOffset.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ DpOffset(long j11) {
        this.packedValue = j11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DpOffset m5170boximpl(long j11) {
        return new DpOffset(j11);
    }

    /* renamed from: copy-tPigGR8, reason: not valid java name */
    public static final long m5172copytPigGR8(long j11, float f11, float f12) {
        return m5171constructorimpl((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L));
    }

    /* renamed from: copy-tPigGR8$default, reason: not valid java name */
    public static /* synthetic */ long m5173copytPigGR8$default(long j11, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = m5176getXD9Ej5fM(j11);
        }
        if ((i11 & 2) != 0) {
            f12 = m5178getYD9Ej5fM(j11);
        }
        return m5172copytPigGR8(j11, f11, f12);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5174equalsimpl(long j11, Object obj) {
        return (obj instanceof DpOffset) && j11 == ((DpOffset) obj).m5184unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5175equalsimpl0(long j11, long j12) {
        return j11 == j12;
    }

    /* renamed from: getX-D9Ej5fM, reason: not valid java name */
    public static final float m5176getXD9Ej5fM(long j11) {
        return Dp.m5115constructorimpl(Float.intBitsToFloat((int) (j11 >> 32)));
    }

    /* renamed from: getY-D9Ej5fM, reason: not valid java name */
    public static final float m5178getYD9Ej5fM(long j11) {
        return Dp.m5115constructorimpl(Float.intBitsToFloat((int) (j11 & 4294967295L)));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5180hashCodeimpl(long j11) {
        return Long.hashCode(j11);
    }

    @Stable
    /* renamed from: minus-CB-Mgk4, reason: not valid java name */
    public static final long m5181minusCBMgk4(long j11, long j12) {
        float m5115constructorimpl = Dp.m5115constructorimpl(m5176getXD9Ej5fM(j11) - m5176getXD9Ej5fM(j12));
        float m5115constructorimpl2 = Dp.m5115constructorimpl(m5178getYD9Ej5fM(j11) - m5178getYD9Ej5fM(j12));
        return m5171constructorimpl((Float.floatToRawIntBits(m5115constructorimpl) << 32) | (4294967295L & Float.floatToRawIntBits(m5115constructorimpl2)));
    }

    @Stable
    /* renamed from: plus-CB-Mgk4, reason: not valid java name */
    public static final long m5182plusCBMgk4(long j11, long j12) {
        float m5115constructorimpl = Dp.m5115constructorimpl(m5176getXD9Ej5fM(j11) + m5176getXD9Ej5fM(j12));
        float m5115constructorimpl2 = Dp.m5115constructorimpl(m5178getYD9Ej5fM(j11) + m5178getYD9Ej5fM(j12));
        return m5171constructorimpl((Float.floatToRawIntBits(m5115constructorimpl) << 32) | (4294967295L & Float.floatToRawIntBits(m5115constructorimpl2)));
    }

    @Stable
    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5183toStringimpl(long j11) {
        if (j11 == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            return "DpOffset.Unspecified";
        }
        return '(' + ((Object) Dp.m5126toStringimpl(m5176getXD9Ej5fM(j11))) + j2.O + ((Object) Dp.m5126toStringimpl(m5178getYD9Ej5fM(j11))) + ')';
    }

    public boolean equals(Object obj) {
        return m5174equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m5180hashCodeimpl(this.packedValue);
    }

    @Stable
    @k
    public String toString() {
        return m5183toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m5184unboximpl() {
        return this.packedValue;
    }

    @Stable
    /* renamed from: getX-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m5177getXD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getY-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m5179getYD9Ej5fM$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m5171constructorimpl(long j11) {
        return j11;
    }
}
