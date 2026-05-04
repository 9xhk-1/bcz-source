package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.TextLayoutResult;
import g10.u;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTextSelectionDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextSelectionDelegate.kt\nandroidx/compose/foundation/text/selection/TextSelectionDelegateKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,69:1\n54#2:70\n59#2:72\n85#3:71\n90#3:73\n53#3,3:75\n30#4:74\n*S KotlinDebug\n*F\n+ 1 TextSelectionDelegate.kt\nandroidx/compose/foundation/text/selection/TextSelectionDelegateKt\n*L\n47#1:70\n49#1:72\n47#1:71\n49#1:73\n50#1:75,3\n50#1:74\n*E\n"})
/* loaded from: classes.dex */
public final class TextSelectionDelegateKt {
    public static final float getHorizontalPosition(@k TextLayoutResult textLayoutResult, int i11, boolean z11, boolean z12) {
        return textLayoutResult.getHorizontalPosition(i11, textLayoutResult.getBidiRunDirection(((!z11 || z12) && (z11 || !z12)) ? Math.max(i11 + (-1), 0) : i11) == textLayoutResult.getParagraphDirection(i11));
    }

    public static final long getSelectionHandleCoordinates(@k TextLayoutResult textLayoutResult, int i11, boolean z11, boolean z12) {
        int lineForOffset = textLayoutResult.getLineForOffset(i11);
        if (lineForOffset >= textLayoutResult.getLineCount()) {
            return Offset.Companion.m2283getUnspecifiedF1C5BW0();
        }
        float H = u.H(getHorizontalPosition(textLayoutResult, i11, z11, z12), 0.0f, (int) (textLayoutResult.m4530getSizeYbymL2g() >> 32));
        float H2 = u.H(textLayoutResult.getLineBottom(lineForOffset), 0.0f, (int) (textLayoutResult.m4530getSizeYbymL2g() & 4294967295L));
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(H) << 32) | (Float.floatToRawIntBits(H2) & 4294967295L));
    }
}
