package androidx.compose.ui.geometry;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCornerRadius.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,188:1\n53#2,3:189\n60#2:192\n70#2:194\n53#2,3:196\n22#3:193\n22#3:195\n*S KotlinDebug\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n*L\n33#1:189,3\n183#1:192\n184#1:194\n182#1:196,3\n183#1:193\n184#1:195\n*E\n"})
/* loaded from: classes.dex */
public final class CornerRadiusKt {
    @Stable
    public static final long CornerRadius(float f11, float f12) {
        return CornerRadius.m2222constructorimpl((Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32));
    }

    public static /* synthetic */ long CornerRadius$default(float f11, float f12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f12 = f11;
        }
        return CornerRadius.m2222constructorimpl((Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32));
    }

    @Stable
    /* renamed from: lerp-3Ry4LBc, reason: not valid java name */
    public static final long m2241lerp3Ry4LBc(long j11, long j12, float f11) {
        float lerp = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j12 >> 32)), f11);
        float lerp2 = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j11 & 4294967295L)), Float.intBitsToFloat((int) (j12 & 4294967295L)), f11);
        return CornerRadius.m2222constructorimpl((Float.floatToRawIntBits(lerp) << 32) | (Float.floatToRawIntBits(lerp2) & 4294967295L));
    }
}
