package androidx.compose.animation.core;

import a00.l1;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.z;
import m80.k;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nVisibilityThresholds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VisibilityThresholds.kt\nandroidx/compose/animation/core/VisibilityThresholdsKt\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n1#1,115:1\n32#2:116\n80#3:117\n53#3,3:119\n53#3,3:124\n53#3,3:128\n80#3:132\n30#4:118\n123#5:122\n188#5:123\n33#6:127\n30#7:131\n*S KotlinDebug\n*F\n+ 1 VisibilityThresholds.kt\nandroidx/compose/animation/core/VisibilityThresholdsKt\n*L\n40#1:116\n40#1:117\n48#1:119,3\n72#1:124,3\n80#1:128,3\n88#1:132\n48#1:118\n64#1:122\n72#1:123\n80#1:127\n88#1:131\n*E\n"})
/* loaded from: classes.dex */
public final class VisibilityThresholdsKt {
    private static final float DpVisibilityThreshold = 0.1f;
    private static final float PxVisibilityThreshold = 0.5f;

    @k
    private static final Rect RectVisibilityThreshold;

    @k
    private static final Map<TwoWayConverter<?, ?>, Float> VisibilityThresholdMap;

    static {
        Float valueOf = Float.valueOf(0.5f);
        RectVisibilityThreshold = new Rect(0.5f, 0.5f, 0.5f, 0.5f);
        TwoWayConverter<Integer, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(e0.f66981a);
        Float valueOf2 = Float.valueOf(1.0f);
        Pair a11 = h1.a(vectorConverter, valueOf2);
        Pair a12 = h1.a(VectorConvertersKt.getVectorConverter(IntSize.Companion), valueOf2);
        Pair a13 = h1.a(VectorConvertersKt.getVectorConverter(IntOffset.Companion), valueOf2);
        Pair a14 = h1.a(VectorConvertersKt.getVectorConverter(z.f67060a), Float.valueOf(0.01f));
        Pair a15 = h1.a(VectorConvertersKt.getVectorConverter(Rect.Companion), valueOf);
        Pair a16 = h1.a(VectorConvertersKt.getVectorConverter(Size.Companion), valueOf);
        Pair a17 = h1.a(VectorConvertersKt.getVectorConverter(Offset.Companion), valueOf);
        TwoWayConverter<Dp, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(Dp.Companion);
        Float valueOf3 = Float.valueOf(0.1f);
        VisibilityThresholdMap = l1.W(a11, a12, a13, a14, a15, a16, a17, h1.a(vectorConverter2, valueOf3), h1.a(VectorConvertersKt.getVectorConverter(DpOffset.Companion), valueOf3));
    }

    public static final int getVisibilityThreshold(@k e0 e0Var) {
        return 1;
    }

    @k
    public static final Map<TwoWayConverter<?, ?>, Float> getVisibilityThresholdMap() {
        return VisibilityThresholdMap;
    }

    public static final long getVisibilityThreshold(@k DpOffset.Companion companion) {
        Dp.Companion companion2 = Dp.Companion;
        float visibilityThreshold = getVisibilityThreshold(companion2);
        float visibilityThreshold2 = getVisibilityThreshold(companion2);
        return DpOffset.m5171constructorimpl((Float.floatToRawIntBits(visibilityThreshold) << 32) | (Float.floatToRawIntBits(visibilityThreshold2) & 4294967295L));
    }

    @k
    public static final Rect getVisibilityThreshold(@k Rect.Companion companion) {
        return RectVisibilityThreshold;
    }

    public static final long getVisibilityThreshold(@k IntOffset.Companion companion) {
        long j11 = 1;
        return IntOffset.m5237constructorimpl((j11 & 4294967295L) | (j11 << 32));
    }

    public static final long getVisibilityThreshold(@k Offset.Companion companion) {
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L));
    }

    public static final float getVisibilityThreshold(@k Dp.Companion companion) {
        return Dp.m5115constructorimpl(0.1f);
    }

    public static final long getVisibilityThreshold(@k Size.Companion companion) {
        return Size.m2328constructorimpl((Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L));
    }

    public static final long getVisibilityThreshold(@k IntSize.Companion companion) {
        long j11 = 1;
        return IntSize.m5281constructorimpl((j11 & 4294967295L) | (j11 << 32));
    }

    public static /* synthetic */ void getVisibilityThresholdMap$annotations() {
    }
}
