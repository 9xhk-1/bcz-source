package androidx.compose.ui.geometry;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,199:1\n148#1:203\n53#2,3:200\n60#2:204\n70#2:206\n53#2,3:208\n60#2:211\n70#2:213\n53#2,3:215\n22#3:205\n22#3:207\n22#3:212\n30#4:214\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n159#1:203\n33#1:200,3\n178#1:204\n179#1:206\n177#1:208,3\n198#1:211\n198#1:213\n198#1:215,3\n178#1:205\n179#1:207\n198#1:212\n198#1:214\n*E\n"})
/* loaded from: classes.dex */
public final class SizeKt {
    @Stable
    public static final long Size(float f11, float f12) {
        return Size.m2328constructorimpl((Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32));
    }

    /* renamed from: getCenter-uvyYCjk, reason: not valid java name */
    public static final long m2347getCenteruvyYCjk(long j11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) / 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) / 2.0f;
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    /* renamed from: isSpecified-uvyYCjk, reason: not valid java name */
    public static final boolean m2349isSpecifieduvyYCjk(long j11) {
        return j11 != InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: isUnspecified-uvyYCjk, reason: not valid java name */
    public static final boolean m2351isUnspecifieduvyYCjk(long j11) {
        return j11 == InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    @Stable
    /* renamed from: lerp-VgWVRYQ, reason: not valid java name */
    public static final long m2353lerpVgWVRYQ(long j11, long j12, float f11) {
        float lerp = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j12 >> 32)), f11);
        float lerp2 = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j11 & 4294967295L)), Float.intBitsToFloat((int) (j12 & 4294967295L)), f11);
        return Size.m2328constructorimpl((Float.floatToRawIntBits(lerp) << 32) | (Float.floatToRawIntBits(lerp2) & 4294967295L));
    }

    /* renamed from: takeOrElse-TmRCtEA, reason: not valid java name */
    public static final long m2354takeOrElseTmRCtEA(long j11, @k a<Size> aVar) {
        return j11 != InlineClassHelperKt.UnspecifiedPackedFloats ? j11 : aVar.invoke().m2342unboximpl();
    }

    @Stable
    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m2357timesd16Qtg0(int i11, long j11) {
        return Size.m2340times7Ah8Wj8(j11, i11);
    }

    @Stable
    @k
    /* renamed from: toRect-uvyYCjk, reason: not valid java name */
    public static final Rect m2358toRectuvyYCjk(long j11) {
        return RectKt.m2308Recttz77jQw(Offset.Companion.m2284getZeroF1C5BW0(), j11);
    }

    @Stable
    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m2355timesd16Qtg0(double d11, long j11) {
        return Size.m2340times7Ah8Wj8(j11, (float) d11);
    }

    @Stable
    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m2356timesd16Qtg0(float f11, long j11) {
        return Size.m2340times7Ah8Wj8(j11, f11);
    }

    @Stable
    /* renamed from: getCenter-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m2348getCenteruvyYCjk$annotations(long j11) {
    }

    @Stable
    /* renamed from: isSpecified-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m2350isSpecifieduvyYCjk$annotations(long j11) {
    }

    @Stable
    /* renamed from: isUnspecified-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m2352isUnspecifieduvyYCjk$annotations(long j11) {
    }
}
