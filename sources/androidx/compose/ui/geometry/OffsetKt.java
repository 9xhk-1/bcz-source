package androidx.compose.ui.geometry;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,285:1\n273#1:296\n53#2,3:286\n60#2:289\n70#2:291\n53#2,3:293\n22#3:290\n22#3:292\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n284#1:296\n30#1:286,3\n253#1:289\n254#1:291\n252#1:293,3\n253#1:290\n254#1:292\n*E\n"})
/* loaded from: classes.dex */
public final class OffsetKt {
    @Stable
    public static final long Offset(float f11, float f12) {
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32));
    }

    /* renamed from: isFinite-k-4lQ0M, reason: not valid java name */
    public static final boolean m2285isFinitek4lQ0M(long j11) {
        return ((((j11 & InlineClassHelperKt.DualFloatInfinityBase) ^ InlineClassHelperKt.DualFloatInfinityBase) - InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0;
    }

    /* renamed from: isSpecified-k-4lQ0M, reason: not valid java name */
    public static final boolean m2287isSpecifiedk4lQ0M(long j11) {
        return (j11 & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: isUnspecified-k-4lQ0M, reason: not valid java name */
    public static final boolean m2289isUnspecifiedk4lQ0M(long j11) {
        return (j11 & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    @Stable
    /* renamed from: lerp-Wko1d7g, reason: not valid java name */
    public static final long m2291lerpWko1d7g(long j11, long j12, float f11) {
        float lerp = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j12 >> 32)), f11);
        float lerp2 = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j11 & 4294967295L)), Float.intBitsToFloat((int) (j12 & 4294967295L)), f11);
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(lerp) << 32) | (Float.floatToRawIntBits(lerp2) & 4294967295L));
    }

    /* renamed from: takeOrElse-3MmeM6k, reason: not valid java name */
    public static final long m2292takeOrElse3MmeM6k(long j11, @k a<Offset> aVar) {
        return (9223372034707292159L & j11) != InlineClassHelperKt.UnspecifiedPackedFloats ? j11 : aVar.invoke().m2278unboximpl();
    }

    @Stable
    /* renamed from: isFinite-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m2286isFinitek4lQ0M$annotations(long j11) {
    }

    @Stable
    /* renamed from: isSpecified-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m2288isSpecifiedk4lQ0M$annotations(long j11) {
    }

    @Stable
    /* renamed from: isUnspecified-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m2290isUnspecifiedk4lQ0M$annotations(long j11) {
    }
}
