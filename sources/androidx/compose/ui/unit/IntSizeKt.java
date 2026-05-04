package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Size;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nIntSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,122:1\n80#2:123\n85#2:125\n90#2:127\n53#2,3:129\n60#2:133\n70#2,11:136\n60#2:148\n70#2,11:155\n54#3:124\n59#3:126\n33#4:128\n57#5:132\n61#5:135\n57#5:147\n61#5:154\n22#6:134\n22#6,5:149\n*S KotlinDebug\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n30#1:123\n107#1:125\n107#1:127\n107#1:129,3\n113#1:133\n113#1:136,11\n121#1:148\n121#1:155,11\n107#1:124\n107#1:126\n107#1:128\n113#1:132\n113#1:135\n121#1:147\n121#1:154\n113#1:134\n121#1:149,5\n*E\n"})
/* loaded from: classes2.dex */
public final class IntSizeKt {
    @Stable
    public static final long IntSize(int i11, int i12) {
        return IntSize.m5281constructorimpl((i12 & 4294967295L) | (i11 << 32));
    }

    /* renamed from: getCenter-ozmzZPI, reason: not valid java name */
    public static final long m5292getCenterozmzZPI(long j11) {
        return IntOffset.m5237constructorimpl((((j11 << 32) >> 33) & 4294967295L) | ((j11 >> 33) << 32));
    }

    @Stable
    /* renamed from: roundToIntSize-uvyYCjk, reason: not valid java name */
    public static final long m5294roundToIntSizeuvyYCjk(long j11) {
        return IntSize.m5281constructorimpl((Math.round(Float.intBitsToFloat((int) (j11 & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j11 >> 32))) << 32));
    }

    @Stable
    /* renamed from: times-O0kMr_c, reason: not valid java name */
    public static final long m5295timesO0kMr_c(int i11, long j11) {
        return IntSize.m5288timesYEO4UFw(j11, i11);
    }

    @Stable
    @k
    /* renamed from: toIntRect-ozmzZPI, reason: not valid java name */
    public static final IntRect m5296toIntRectozmzZPI(long j11) {
        return IntRectKt.m5276IntRectVbeCjmY(IntOffset.Companion.m5254getZeronOccac(), j11);
    }

    @Stable
    /* renamed from: toIntSize-uvyYCjk, reason: not valid java name */
    public static final long m5297toIntSizeuvyYCjk(long j11) {
        return IntSize.m5281constructorimpl((((int) Float.intBitsToFloat((int) (j11 & 4294967295L))) & 4294967295L) | (((int) Float.intBitsToFloat((int) (j11 >> 32))) << 32));
    }

    @Stable
    /* renamed from: toSize-ozmzZPI, reason: not valid java name */
    public static final long m5298toSizeozmzZPI(long j11) {
        return Size.m2328constructorimpl((Float.floatToRawIntBits((int) (j11 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j11 >> 32)) << 32));
    }

    @Stable
    /* renamed from: getCenter-ozmzZPI$annotations, reason: not valid java name */
    public static /* synthetic */ void m5293getCenterozmzZPI$annotations(long j11) {
    }
}
