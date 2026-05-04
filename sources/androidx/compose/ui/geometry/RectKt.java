package androidx.compose.ui.geometry;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rect.kt\nandroidx/compose/ui/geometry/RectKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n1#1,287:1\n65#2:288\n69#2:291\n65#2:298\n69#2:301\n65#2:303\n69#2:306\n60#3:289\n70#3:292\n60#3:299\n70#3:302\n60#3:304\n70#3:307\n22#4:290\n22#4:300\n22#4:305\n57#5,5:293\n*S KotlinDebug\n*F\n+ 1 Rect.kt\nandroidx/compose/ui/geometry/RectKt\n*L\n243#1:288\n243#1:291\n254#1:298\n254#1:301\n264#1:303\n264#1:306\n243#1:289\n243#1:292\n254#1:299\n254#1:302\n264#1:304\n264#1:307\n243#1:290\n254#1:300\n264#1:305\n243#1:293,5\n*E\n"})
/* loaded from: classes.dex */
public final class RectKt {
    @Stable
    @k
    /* renamed from: Rect-0a9Yr6o, reason: not valid java name */
    public static final Rect m2306Rect0a9Yr6o(long j11, long j12) {
        return new Rect(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)));
    }

    @Stable
    @k
    /* renamed from: Rect-3MmeM6k, reason: not valid java name */
    public static final Rect m2307Rect3MmeM6k(long j11, float f11) {
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        return new Rect(Float.intBitsToFloat(i11) - f11, Float.intBitsToFloat(i12) - f11, Float.intBitsToFloat(i11) + f11, Float.intBitsToFloat(i12) + f11);
    }

    @Stable
    @k
    /* renamed from: Rect-tz77jQw, reason: not valid java name */
    public static final Rect m2308Recttz77jQw(long j11, long j12) {
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        return new Rect(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j12 & 4294967295L)));
    }

    @Stable
    @k
    public static final Rect lerp(@k Rect rect, @k Rect rect2, float f11) {
        return new Rect(MathHelpersKt.lerp(rect.getLeft(), rect2.getLeft(), f11), MathHelpersKt.lerp(rect.getTop(), rect2.getTop(), f11), MathHelpersKt.lerp(rect.getRight(), rect2.getRight(), f11), MathHelpersKt.lerp(rect.getBottom(), rect2.getBottom(), f11));
    }
}
