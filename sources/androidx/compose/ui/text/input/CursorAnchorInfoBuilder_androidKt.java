package androidx.compose.ui.text.input;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import g10.u;
import kotlin.jvm.internal.u0;
import m80.k;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCursorAnchorInfoBuilder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CursorAnchorInfoBuilder.android.kt\nandroidx/compose/ui/text/input/CursorAnchorInfoBuilder_androidKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,237:1\n54#2:238\n85#3:239\n*S KotlinDebug\n*F\n+ 1 CursorAnchorInfoBuilder.android.kt\nandroidx/compose/ui/text/input/CursorAnchorInfoBuilder_androidKt\n*L\n119#1:238\n119#1:239\n*E\n"})
/* loaded from: classes2.dex */
public final class CursorAnchorInfoBuilder_androidKt {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x005e, code lost:
    
        if (containsInclusive(r22, r7.getRight(), r7.getBottom()) == false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final android.view.inputmethod.CursorAnchorInfo.Builder addCharacterBounds(android.view.inputmethod.CursorAnchorInfo.Builder r17, int r18, int r19, androidx.compose.ui.text.input.OffsetMapping r20, androidx.compose.ui.text.TextLayoutResult r21, androidx.compose.ui.geometry.Rect r22) {
        /*
            r0 = r19
            r1 = r20
            r2 = r18
            r3 = r22
            int r4 = r1.originalToTransformed(r2)
            int r5 = r1.originalToTransformed(r0)
            int r6 = r5 - r4
            int r6 = r6 * 4
            float[] r6 = new float[r6]
            androidx.compose.ui.text.MultiParagraph r7 = r21.getMultiParagraph()
            long r8 = androidx.compose.ui.text.TextRangeKt.TextRange(r4, r5)
            r5 = 0
            r7.m4409fillBoundingBoxes8ffj60Q(r8, r6, r5)
            r11 = r2
        L23:
            if (r11 >= r0) goto L8b
            int r2 = r1.originalToTransformed(r11)
            int r5 = r2 - r4
            int r5 = r5 * 4
            androidx.compose.ui.geometry.Rect r7 = new androidx.compose.ui.geometry.Rect
            r8 = r6[r5]
            int r9 = r5 + 1
            r9 = r6[r9]
            int r10 = r5 + 2
            r10 = r6[r10]
            int r5 = r5 + 3
            r5 = r6[r5]
            r7.<init>(r8, r9, r10, r5)
            boolean r5 = r3.overlaps(r7)
            float r8 = r7.getLeft()
            float r9 = r7.getTop()
            boolean r8 = containsInclusive(r3, r8, r9)
            if (r8 == 0) goto L64
            float r8 = r7.getRight()
            float r9 = r7.getBottom()
            boolean r8 = containsInclusive(r3, r8, r9)
            if (r8 != 0) goto L61
            goto L64
        L61:
            r8 = r21
            goto L67
        L64:
            r5 = r5 | 2
            goto L61
        L67:
            androidx.compose.ui.text.style.ResolvedTextDirection r2 = r8.getBidiRunDirection(r2)
            androidx.compose.ui.text.style.ResolvedTextDirection r9 = androidx.compose.ui.text.style.ResolvedTextDirection.Rtl
            if (r2 != r9) goto L71
            r5 = r5 | 4
        L71:
            r16 = r5
            float r12 = r7.getLeft()
            float r13 = r7.getTop()
            float r14 = r7.getRight()
            float r15 = r7.getBottom()
            r10 = r17
            r10.addCharacterBounds(r11, r12, r13, r14, r15, r16)
            int r11 = r11 + 1
            goto L23
        L8b:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.input.CursorAnchorInfoBuilder_androidKt.addCharacterBounds(android.view.inputmethod.CursorAnchorInfo$Builder, int, int, androidx.compose.ui.text.input.OffsetMapping, androidx.compose.ui.text.TextLayoutResult, androidx.compose.ui.geometry.Rect):android.view.inputmethod.CursorAnchorInfo$Builder");
    }

    @n(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this function in foundation is used by the legacy BasicTextField.")
    @k
    public static final CursorAnchorInfo build(@k CursorAnchorInfo.Builder builder, @k TextFieldValue textFieldValue, @k OffsetMapping offsetMapping, @k TextLayoutResult textLayoutResult, @k Matrix matrix, @k Rect rect, @k Rect rect2, boolean z11, boolean z12, boolean z13, boolean z14) {
        builder.reset();
        builder.setMatrix(matrix);
        int m4557getMinimpl = TextRange.m4557getMinimpl(textFieldValue.m4807getSelectiond9O1mEE());
        builder.setSelectionRange(m4557getMinimpl, TextRange.m4556getMaximpl(textFieldValue.m4807getSelectiond9O1mEE()));
        if (z11) {
            setInsertionMarker(builder, m4557getMinimpl, offsetMapping, textLayoutResult, rect);
        }
        if (z12) {
            TextRange m4806getCompositionMzsxiRA = textFieldValue.m4806getCompositionMzsxiRA();
            int m4557getMinimpl2 = m4806getCompositionMzsxiRA != null ? TextRange.m4557getMinimpl(m4806getCompositionMzsxiRA.m4563unboximpl()) : -1;
            TextRange m4806getCompositionMzsxiRA2 = textFieldValue.m4806getCompositionMzsxiRA();
            int m4556getMaximpl = m4806getCompositionMzsxiRA2 != null ? TextRange.m4556getMaximpl(m4806getCompositionMzsxiRA2.m4563unboximpl()) : -1;
            if (m4557getMinimpl2 >= 0 && m4557getMinimpl2 < m4556getMaximpl) {
                builder.setComposingText(m4557getMinimpl2, textFieldValue.getText().subSequence(m4557getMinimpl2, m4556getMaximpl));
                addCharacterBounds(builder, m4557getMinimpl2, m4556getMaximpl, offsetMapping, textLayoutResult, rect);
            }
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33 && z13) {
            CursorAnchorInfoApi33Helper.setEditorBoundsInfo(builder, rect2);
        }
        if (i11 >= 34 && z14) {
            CursorAnchorInfoApi34Helper.addVisibleLineBounds(builder, textLayoutResult, rect);
        }
        return builder.build();
    }

    public static /* synthetic */ CursorAnchorInfo build$default(CursorAnchorInfo.Builder builder, TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Matrix matrix, Rect rect, Rect rect2, boolean z11, boolean z12, boolean z13, boolean z14, int i11, Object obj) {
        if ((i11 & 64) != 0) {
            z11 = true;
        }
        if ((i11 & 128) != 0) {
            z12 = true;
        }
        if ((i11 & 256) != 0) {
            z13 = true;
        }
        if ((i11 & 512) != 0) {
            z14 = true;
        }
        return build(builder, textFieldValue, offsetMapping, textLayoutResult, matrix, rect, rect2, z11, z12, z13, z14);
    }

    private static final boolean containsInclusive(Rect rect, float f11, float f12) {
        float left = rect.getLeft();
        if (f11 > rect.getRight() || left > f11) {
            return false;
        }
        return f12 <= rect.getBottom() && rect.getTop() <= f12;
    }

    private static final CursorAnchorInfo.Builder setInsertionMarker(CursorAnchorInfo.Builder builder, int i11, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Rect rect) {
        if (i11 < 0) {
            return builder;
        }
        int originalToTransformed = offsetMapping.originalToTransformed(i11);
        Rect cursorRect = textLayoutResult.getCursorRect(originalToTransformed);
        float H = u.H(cursorRect.getLeft(), 0.0f, (int) (textLayoutResult.m4530getSizeYbymL2g() >> 32));
        boolean containsInclusive = containsInclusive(rect, H, cursorRect.getTop());
        boolean containsInclusive2 = containsInclusive(rect, H, cursorRect.getBottom());
        boolean z11 = textLayoutResult.getBidiRunDirection(originalToTransformed) == ResolvedTextDirection.Rtl;
        int i12 = (containsInclusive || containsInclusive2) ? 1 : 0;
        if (!containsInclusive || !containsInclusive2) {
            i12 |= 2;
        }
        if (z11) {
            i12 |= 4;
        }
        builder.setInsertionMarkerLocation(H, cursorRect.getTop(), cursorRect.getBottom(), cursorRect.getBottom(), i12);
        return builder;
    }
}
