package androidx.compose.foundation.text.input.internal;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCursorAnchorInfoBuilder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CursorAnchorInfoBuilder.android.kt\nandroidx/compose/foundation/text/input/internal/CursorAnchorInfoBuilder_androidKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,155:1\n54#2:156\n85#3:157\n*S KotlinDebug\n*F\n+ 1 CursorAnchorInfoBuilder.android.kt\nandroidx/compose/foundation/text/input/internal/CursorAnchorInfoBuilder_androidKt\n*L\n100#1:156\n100#1:157\n*E\n"})
/* loaded from: classes.dex */
public final class CursorAnchorInfoBuilder_androidKt {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004e, code lost:
    
        if (androidx.compose.foundation.text.input.internal.LegacyCursorAnchorInfoBuilder_androidKt.containsInclusive(r18, r4.getRight(), r4.getBottom()) == false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final android.view.inputmethod.CursorAnchorInfo.Builder addCharacterBounds(android.view.inputmethod.CursorAnchorInfo.Builder r14, int r15, int r16, androidx.compose.ui.text.TextLayoutResult r17, androidx.compose.ui.geometry.Rect r18) {
        /*
            r0 = r16
            r1 = r18
            int r2 = r0 - r15
            int r2 = r2 * 4
            float[] r2 = new float[r2]
            androidx.compose.ui.text.MultiParagraph r3 = r17.getMultiParagraph()
            long r4 = androidx.compose.ui.text.TextRangeKt.TextRange(r15, r16)
            r6 = 0
            r3.m4409fillBoundingBoxes8ffj60Q(r4, r2, r6)
            r8 = r15
        L17:
            if (r8 >= r0) goto L79
            int r3 = r8 - r15
            int r3 = r3 * 4
            androidx.compose.ui.geometry.Rect r4 = new androidx.compose.ui.geometry.Rect
            r5 = r2[r3]
            int r6 = r3 + 1
            r6 = r2[r6]
            int r7 = r3 + 2
            r7 = r2[r7]
            int r3 = r3 + 3
            r3 = r2[r3]
            r4.<init>(r5, r6, r7, r3)
            boolean r3 = r1.overlaps(r4)
            float r5 = r4.getLeft()
            float r6 = r4.getTop()
            boolean r5 = androidx.compose.foundation.text.input.internal.LegacyCursorAnchorInfoBuilder_androidKt.containsInclusive(r1, r5, r6)
            if (r5 == 0) goto L54
            float r5 = r4.getRight()
            float r6 = r4.getBottom()
            boolean r5 = androidx.compose.foundation.text.input.internal.LegacyCursorAnchorInfoBuilder_androidKt.containsInclusive(r1, r5, r6)
            if (r5 != 0) goto L51
            goto L54
        L51:
            r5 = r17
            goto L57
        L54:
            r3 = r3 | 2
            goto L51
        L57:
            androidx.compose.ui.text.style.ResolvedTextDirection r6 = r5.getBidiRunDirection(r8)
            androidx.compose.ui.text.style.ResolvedTextDirection r7 = androidx.compose.ui.text.style.ResolvedTextDirection.Rtl
            if (r6 != r7) goto L61
            r3 = r3 | 4
        L61:
            r13 = r3
            float r9 = r4.getLeft()
            float r10 = r4.getTop()
            float r11 = r4.getRight()
            float r12 = r4.getBottom()
            r7 = r14
            r7.addCharacterBounds(r8, r9, r10, r11, r12, r13)
            int r8 = r8 + 1
            goto L17
        L79:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.CursorAnchorInfoBuilder_androidKt.addCharacterBounds(android.view.inputmethod.CursorAnchorInfo$Builder, int, int, androidx.compose.ui.text.TextLayoutResult, androidx.compose.ui.geometry.Rect):android.view.inputmethod.CursorAnchorInfo$Builder");
    }

    @m80.k
    /* renamed from: build-vxqZcH0, reason: not valid java name */
    public static final CursorAnchorInfo m1227buildvxqZcH0(@m80.k CursorAnchorInfo.Builder builder, @m80.k CharSequence charSequence, long j11, @m80.l TextRange textRange, @m80.k TextLayoutResult textLayoutResult, @m80.k Matrix matrix, @m80.k Rect rect, @m80.k Rect rect2, boolean z11, boolean z12, boolean z13, boolean z14) {
        builder.reset();
        builder.setMatrix(matrix);
        int m4557getMinimpl = TextRange.m4557getMinimpl(j11);
        builder.setSelectionRange(m4557getMinimpl, TextRange.m4556getMaximpl(j11));
        if (z11) {
            setInsertionMarker(builder, m4557getMinimpl, textLayoutResult, rect);
        }
        if (z12) {
            int m4557getMinimpl2 = textRange != null ? TextRange.m4557getMinimpl(textRange.m4563unboximpl()) : -1;
            int m4556getMaximpl = textRange != null ? TextRange.m4556getMaximpl(textRange.m4563unboximpl()) : -1;
            if (m4557getMinimpl2 >= 0 && m4557getMinimpl2 < m4556getMaximpl) {
                builder.setComposingText(m4557getMinimpl2, charSequence.subSequence(m4557getMinimpl2, m4556getMaximpl));
                addCharacterBounds(builder, m4557getMinimpl2, m4556getMaximpl, textLayoutResult, rect);
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

    /* renamed from: build-vxqZcH0$default, reason: not valid java name */
    public static /* synthetic */ CursorAnchorInfo m1228buildvxqZcH0$default(CursorAnchorInfo.Builder builder, CharSequence charSequence, long j11, TextRange textRange, TextLayoutResult textLayoutResult, Matrix matrix, Rect rect, Rect rect2, boolean z11, boolean z12, boolean z13, boolean z14, int i11, Object obj) {
        if ((i11 & 128) != 0) {
            z11 = true;
        }
        if ((i11 & 256) != 0) {
            z12 = true;
        }
        if ((i11 & 512) != 0) {
            z13 = true;
        }
        if ((i11 & 1024) != 0) {
            z14 = true;
        }
        return m1227buildvxqZcH0(builder, charSequence, j11, textRange, textLayoutResult, matrix, rect, rect2, z11, z12, z13, z14);
    }

    private static final CursorAnchorInfo.Builder setInsertionMarker(CursorAnchorInfo.Builder builder, int i11, TextLayoutResult textLayoutResult, Rect rect) {
        if (i11 < 0) {
            return builder;
        }
        Rect cursorRect = textLayoutResult.getCursorRect(i11);
        float H = g10.u.H(cursorRect.getLeft(), 0.0f, (int) (textLayoutResult.m4530getSizeYbymL2g() >> 32));
        boolean containsInclusive = LegacyCursorAnchorInfoBuilder_androidKt.containsInclusive(rect, H, cursorRect.getTop());
        boolean containsInclusive2 = LegacyCursorAnchorInfoBuilder_androidKt.containsInclusive(rect, H, cursorRect.getBottom());
        boolean z11 = textLayoutResult.getBidiRunDirection(i11) == ResolvedTextDirection.Rtl;
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
