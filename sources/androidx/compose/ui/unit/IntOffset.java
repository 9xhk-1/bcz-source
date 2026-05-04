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
@u0({"SMAP\nIntOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,171:1\n85#2:172\n90#2:173\n80#2:174\n85#2,6:175\n85#2:181\n90#2:182\n80#2:183\n85#2:184\n90#2:185\n80#2:186\n85#2,6:187\n80#2:193\n85#2:194\n90#2:196\n80#2:198\n85#2:199\n90#2:201\n80#2:203\n85#2,6:204\n80#2:210\n26#3:195\n26#3:197\n26#3:200\n26#3:202\n*S KotlinDebug\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n54#1:172\n59#1:173\n67#1:174\n66#1:175,6\n74#1:181\n75#1:182\n73#1:183\n84#1:184\n85#1:185\n83#1:186\n92#1:187,6\n92#1:193\n105#1:194\n106#1:196\n104#1:198\n121#1:199\n122#1:201\n120#1:203\n134#1:204,6\n134#1:210\n105#1:195\n106#1:197\n121#1:200\n122#1:202\n*E\n"})
@Immutable
/* loaded from: classes2.dex */
public final class IntOffset {
    private final long packedValue;

    @k
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m5237constructorimpl(0);
    private static final long Max = m5237constructorimpl(9223372034707292159L);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getMax-nOcc-ac, reason: not valid java name */
        public final long m5253getMaxnOccac() {
            return IntOffset.Max;
        }

        /* renamed from: getZero-nOcc-ac, reason: not valid java name */
        public final long m5254getZeronOccac() {
            return IntOffset.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ IntOffset(long j11) {
        this.packedValue = j11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntOffset m5234boximpl(long j11) {
        return new IntOffset(j11);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m5235component1impl(long j11) {
        return m5243getXimpl(j11);
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m5236component2impl(long j11) {
        return m5244getYimpl(j11);
    }

    /* renamed from: copy-iSbpLlY, reason: not valid java name */
    public static final long m5238copyiSbpLlY(long j11, int i11, int i12) {
        return m5237constructorimpl((i11 << 32) | (i12 & 4294967295L));
    }

    /* renamed from: copy-iSbpLlY$default, reason: not valid java name */
    public static /* synthetic */ long m5239copyiSbpLlY$default(long j11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = (int) (j11 >> 32);
        }
        if ((i13 & 2) != 0) {
            i12 = (int) (4294967295L & j11);
        }
        return m5238copyiSbpLlY(j11, i11, i12);
    }

    @Stable
    /* renamed from: div-Bjo55l4, reason: not valid java name */
    public static final long m5240divBjo55l4(long j11, float f11) {
        return m5237constructorimpl((Math.round(((int) (j11 >> 32)) / f11) << 32) | (Math.round(((int) (j11 & 4294967295L)) / f11) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5241equalsimpl(long j11, Object obj) {
        return (obj instanceof IntOffset) && j11 == ((IntOffset) obj).m5252unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5242equalsimpl0(long j11, long j12) {
        return j11 == j12;
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final int m5243getXimpl(long j11) {
        return (int) (j11 >> 32);
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final int m5244getYimpl(long j11) {
        return (int) (j11 & 4294967295L);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5245hashCodeimpl(long j11) {
        return Long.hashCode(j11);
    }

    @Stable
    /* renamed from: minus-qkQi6aY, reason: not valid java name */
    public static final long m5246minusqkQi6aY(long j11, long j12) {
        return m5237constructorimpl(((((int) (j11 >> 32)) - ((int) (j12 >> 32))) << 32) | ((((int) (j11 & 4294967295L)) - ((int) (j12 & 4294967295L))) & 4294967295L));
    }

    @Stable
    /* renamed from: plus-qkQi6aY, reason: not valid java name */
    public static final long m5247plusqkQi6aY(long j11, long j12) {
        return m5237constructorimpl(((((int) (j11 >> 32)) + ((int) (j12 >> 32))) << 32) | ((((int) (j11 & 4294967295L)) + ((int) (j12 & 4294967295L))) & 4294967295L));
    }

    @Stable
    /* renamed from: rem-Bjo55l4, reason: not valid java name */
    public static final long m5248remBjo55l4(long j11, int i11) {
        return m5237constructorimpl(((((int) (j11 >> 32)) % i11) << 32) | ((((int) (j11 & 4294967295L)) % i11) & 4294967295L));
    }

    @Stable
    /* renamed from: times-Bjo55l4, reason: not valid java name */
    public static final long m5249timesBjo55l4(long j11, float f11) {
        return m5237constructorimpl((Math.round(((int) (j11 >> 32)) * f11) << 32) | (Math.round(((int) (j11 & 4294967295L)) * f11) & 4294967295L));
    }

    @Stable
    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5250toStringimpl(long j11) {
        return '(' + m5243getXimpl(j11) + j2.O + m5244getYimpl(j11) + ')';
    }

    @Stable
    /* renamed from: unaryMinus-nOcc-ac, reason: not valid java name */
    public static final long m5251unaryMinusnOccac(long j11) {
        return m5237constructorimpl(((-((int) (j11 & 4294967295L))) & 4294967295L) | ((-((int) (j11 >> 32))) << 32));
    }

    public boolean equals(Object obj) {
        return m5241equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m5245hashCodeimpl(this.packedValue);
    }

    @Stable
    @k
    public String toString() {
        return m5250toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m5252unboximpl() {
        return this.packedValue;
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m5237constructorimpl(long j11) {
        return j11;
    }
}
