package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nIntRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntRect.kt\nandroidx/compose/ui/unit/IntRectKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,276:1\n54#2:277\n59#2:279\n85#3:278\n90#3:280\n26#4:281\n26#4:282\n26#4:283\n26#4:284\n*S KotlinDebug\n*F\n+ 1 IntRect.kt\nandroidx/compose/ui/unit/IntRectKt\n*L\n209#1:277\n210#1:279\n209#1:278\n210#1:280\n271#1:281\n272#1:282\n273#1:283\n274#1:284\n*E\n"})
/* loaded from: classes2.dex */
public final class IntRectKt {
    @Stable
    @k
    /* renamed from: IntRect-E1MhUcY, reason: not valid java name */
    public static final IntRect m5275IntRectE1MhUcY(long j11, long j12) {
        return new IntRect(IntOffset.m5243getXimpl(j11), IntOffset.m5244getYimpl(j11), IntOffset.m5243getXimpl(j12), IntOffset.m5244getYimpl(j12));
    }

    @Stable
    @k
    /* renamed from: IntRect-VbeCjmY, reason: not valid java name */
    public static final IntRect m5276IntRectVbeCjmY(long j11, long j12) {
        return new IntRect(IntOffset.m5243getXimpl(j11), IntOffset.m5244getYimpl(j11), IntOffset.m5243getXimpl(j11) + ((int) (j12 >> 32)), IntOffset.m5244getYimpl(j11) + ((int) (j12 & 4294967295L)));
    }

    @Stable
    @k
    /* renamed from: IntRect-ar5cAso, reason: not valid java name */
    public static final IntRect m5277IntRectar5cAso(long j11, int i11) {
        return new IntRect(IntOffset.m5243getXimpl(j11) - i11, IntOffset.m5244getYimpl(j11) - i11, IntOffset.m5243getXimpl(j11) + i11, IntOffset.m5244getYimpl(j11) + i11);
    }

    @Stable
    @k
    public static final IntRect lerp(@k IntRect intRect, @k IntRect intRect2, float f11) {
        return new IntRect(MathHelpersKt.lerp(intRect.getLeft(), intRect2.getLeft(), f11), MathHelpersKt.lerp(intRect.getTop(), intRect2.getTop(), f11), MathHelpersKt.lerp(intRect.getRight(), intRect2.getRight(), f11), MathHelpersKt.lerp(intRect.getBottom(), intRect2.getBottom(), f11));
    }

    @Stable
    @k
    public static final IntRect roundToIntRect(@k Rect rect) {
        return new IntRect(Math.round(rect.getLeft()), Math.round(rect.getTop()), Math.round(rect.getRight()), Math.round(rect.getBottom()));
    }

    @Stable
    @k
    public static final Rect toRect(@k IntRect intRect) {
        return new Rect(intRect.getLeft(), intRect.getTop(), intRect.getRight(), intRect.getBottom());
    }
}
