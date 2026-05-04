package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTextLayoutResultProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutResultProxy.kt\nandroidx/compose/foundation/text/TextLayoutResultProxyKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,133:1\n65#2:134\n65#2:137\n65#2:140\n69#2:143\n69#2:146\n69#2:149\n60#3:135\n60#3:138\n60#3:141\n70#3:144\n70#3:147\n70#3:150\n53#3,3:153\n22#4:136\n22#4:139\n22#4:142\n22#4:145\n22#4:148\n22#4:151\n30#5:152\n*S KotlinDebug\n*F\n+ 1 TextLayoutResultProxy.kt\nandroidx/compose/foundation/text/TextLayoutResultProxyKt\n*L\n121#1:134\n122#1:137\n123#1:140\n127#1:143\n128#1:146\n129#1:149\n121#1:135\n122#1:138\n123#1:141\n127#1:144\n128#1:147\n129#1:150\n131#1:153,3\n121#1:136\n122#1:139\n123#1:142\n127#1:145\n128#1:148\n129#1:151\n131#1:152\n*E\n"})
/* loaded from: classes.dex */
public final class TextLayoutResultProxyKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: coerceIn-3MmeM6k, reason: not valid java name */
    public static final long m1171coerceIn3MmeM6k(long j11, Rect rect) {
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat(i11) < rect.getLeft() ? rect.getLeft() : Float.intBitsToFloat(i11) > rect.getRight() ? rect.getRight() : Float.intBitsToFloat(i11)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat(i12) < rect.getTop() ? rect.getTop() : Float.intBitsToFloat(i12) > rect.getBottom() ? rect.getBottom() : Float.intBitsToFloat(i12)) & 4294967295L));
    }
}
