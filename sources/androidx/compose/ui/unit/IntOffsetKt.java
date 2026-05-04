package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nIntOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,171:1\n80#2:172\n80#2:173\n53#2,3:175\n60#2:179\n70#2:182\n53#2,3:184\n60#2:188\n70#2:191\n53#2,3:193\n60#2:197\n70#2:200\n53#2,3:202\n60#2:206\n70#2:209\n53#2,3:211\n60#2:215\n70#2,11:222\n30#3:174\n30#3:183\n30#3:192\n30#3:201\n30#3:210\n65#4:178\n69#4:181\n65#4:187\n69#4:190\n65#4:196\n69#4:199\n65#4:205\n69#4:208\n65#4:214\n69#4:221\n22#5:180\n22#5:189\n22#5:198\n22#5:207\n22#5,5:216\n*S KotlinDebug\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n32#1:172\n156#1:173\n159#1:175,3\n161#1:179\n161#1:182\n161#1:184,3\n163#1:188\n163#1:191\n163#1:193,3\n165#1:197\n165#1:200\n165#1:202,3\n167#1:206\n167#1:209\n167#1:211,3\n170#1:215\n170#1:222,11\n159#1:174\n161#1:183\n163#1:192\n165#1:201\n167#1:210\n161#1:178\n161#1:181\n163#1:187\n163#1:190\n165#1:196\n165#1:199\n167#1:205\n167#1:208\n170#1:214\n170#1:221\n161#1:180\n163#1:189\n165#1:198\n167#1:207\n170#1:216,5\n*E\n"})
/* loaded from: classes2.dex */
public final class IntOffsetKt {
    @Stable
    public static final long IntOffset(int i11, int i12) {
        return IntOffset.m5237constructorimpl((i12 & 4294967295L) | (i11 << 32));
    }

    @Stable
    /* renamed from: lerp-81ZRxRo, reason: not valid java name */
    public static final long m5255lerp81ZRxRo(long j11, long j12, float f11) {
        return IntOffset.m5237constructorimpl((MathHelpersKt.lerp(IntOffset.m5243getXimpl(j11), IntOffset.m5243getXimpl(j12), f11) << 32) | (MathHelpersKt.lerp(IntOffset.m5244getYimpl(j11), IntOffset.m5244getYimpl(j12), f11) & 4294967295L));
    }

    @Stable
    /* renamed from: minus-Nv-tHpc, reason: not valid java name */
    public static final long m5256minusNvtHpc(long j11, long j12) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) - IntOffset.m5243getXimpl(j12);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) - IntOffset.m5244getYimpl(j12);
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    @Stable
    /* renamed from: minus-oCl6YwE, reason: not valid java name */
    public static final long m5257minusoCl6YwE(long j11, long j12) {
        float m5243getXimpl = IntOffset.m5243getXimpl(j11) - Float.intBitsToFloat((int) (j12 >> 32));
        float m5244getYimpl = IntOffset.m5244getYimpl(j11) - Float.intBitsToFloat((int) (j12 & 4294967295L));
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(m5243getXimpl) << 32) | (Float.floatToRawIntBits(m5244getYimpl) & 4294967295L));
    }

    @Stable
    /* renamed from: plus-Nv-tHpc, reason: not valid java name */
    public static final long m5258plusNvtHpc(long j11, long j12) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) + IntOffset.m5243getXimpl(j12);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) + IntOffset.m5244getYimpl(j12);
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    @Stable
    /* renamed from: plus-oCl6YwE, reason: not valid java name */
    public static final long m5259plusoCl6YwE(long j11, long j12) {
        float m5243getXimpl = IntOffset.m5243getXimpl(j11) + Float.intBitsToFloat((int) (j12 >> 32));
        float m5244getYimpl = IntOffset.m5244getYimpl(j11) + Float.intBitsToFloat((int) (j12 & 4294967295L));
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(m5243getXimpl) << 32) | (Float.floatToRawIntBits(m5244getYimpl) & 4294967295L));
    }

    @Stable
    /* renamed from: round-k-4lQ0M, reason: not valid java name */
    public static final long m5260roundk4lQ0M(long j11) {
        return IntOffset.m5237constructorimpl((Math.round(Float.intBitsToFloat((int) (j11 & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j11 >> 32))) << 32));
    }

    @Stable
    /* renamed from: toOffset--gyyYBs, reason: not valid java name */
    public static final long m5261toOffsetgyyYBs(long j11) {
        float m5243getXimpl = IntOffset.m5243getXimpl(j11);
        float m5244getYimpl = IntOffset.m5244getYimpl(j11);
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(m5244getYimpl) & 4294967295L) | (Float.floatToRawIntBits(m5243getXimpl) << 32));
    }
}
