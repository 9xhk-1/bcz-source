package androidx.compose.ui.util;

import androidx.collection.SieveCacheKt;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nInlineClassHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,92:1\n22#2:93\n22#2:94\n22#2:95\n22#2:96\n*S KotlinDebug\n*F\n+ 1 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n60#1:93\n65#1:94\n70#1:95\n75#1:96\n*E\n"})
/* loaded from: classes2.dex */
public final class InlineClassHelperKt {
    public static final long packFloats(float f11, float f12) {
        return (Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32);
    }

    public static final long packInts(int i11, int i12) {
        return (i12 & 4294967295L) | (i11 << 32);
    }

    public static final float unpackAbsFloat1(long j11) {
        return Float.intBitsToFloat((int) ((j11 >> 32) & SieveCacheKt.NodeLinkMask));
    }

    public static final float unpackAbsFloat2(long j11) {
        return Float.intBitsToFloat((int) (j11 & SieveCacheKt.NodeLinkMask));
    }

    public static final float unpackFloat1(long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    public static final float unpackFloat2(long j11) {
        return Float.intBitsToFloat((int) (j11 & 4294967295L));
    }

    public static final int unpackInt1(long j11) {
        return (int) (j11 >> 32);
    }

    public static final int unpackInt2(long j11) {
        return (int) (j11 & 4294967295L);
    }
}
