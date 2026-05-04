package androidx.compose.ui.geometry;

import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMutableRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableRect.kt\nandroidx/compose/ui/geometry/MutableRectKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n1#1,232:1\n65#2:233\n69#2:236\n65#2:243\n69#2:246\n65#2:248\n69#2:251\n60#3:234\n70#3:237\n60#3:244\n70#3:247\n60#3:249\n70#3:252\n22#4:235\n22#4:245\n22#4:250\n57#5,5:238\n*S KotlinDebug\n*F\n+ 1 MutableRect.kt\nandroidx/compose/ui/geometry/MutableRectKt\n*L\n212#1:233\n212#1:236\n222#1:243\n222#1:246\n231#1:248\n231#1:251\n212#1:234\n212#1:237\n222#1:244\n222#1:247\n231#1:249\n231#1:252\n212#1:235\n222#1:245\n231#1:250\n212#1:238,5\n*E\n"})
/* loaded from: classes.dex */
public final class MutableRectKt {
    @k
    /* renamed from: MutableRect-0a9Yr6o, reason: not valid java name */
    public static final MutableRect m2254MutableRect0a9Yr6o(long j11, long j12) {
        return new MutableRect(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)));
    }

    @k
    /* renamed from: MutableRect-3MmeM6k, reason: not valid java name */
    public static final MutableRect m2255MutableRect3MmeM6k(long j11, float f11) {
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        return new MutableRect(Float.intBitsToFloat(i11) - f11, Float.intBitsToFloat(i12) - f11, Float.intBitsToFloat(i11) + f11, Float.intBitsToFloat(i12) + f11);
    }

    @k
    /* renamed from: MutableRect-tz77jQw, reason: not valid java name */
    public static final MutableRect m2256MutableRecttz77jQw(long j11, long j12) {
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        return new MutableRect(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j12 & 4294967295L)));
    }

    @k
    public static final Rect toRect(@k MutableRect mutableRect) {
        return new Rect(mutableRect.getLeft(), mutableRect.getTop(), mutableRect.getRight(), mutableRect.getBottom());
    }
}
