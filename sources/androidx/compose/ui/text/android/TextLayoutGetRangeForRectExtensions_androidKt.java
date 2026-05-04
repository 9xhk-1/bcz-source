package androidx.compose.ui.text.android;

import android.graphics.RectF;
import android.text.Layout;
import androidx.compose.ui.text.android.LayoutHelper;
import androidx.compose.ui.text.android.selection.SegmentFinder;
import androidx.compose.ui.text.android.selection.SegmentFinder_androidKt;
import androidx.compose.ui.text.android.selection.WordSegmentFinder;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class TextLayoutGetRangeForRectExtensions_androidKt {
    private static final float getCharacterLeftBounds(int i11, int i12, float[] fArr) {
        return fArr[(i11 - i12) * 2];
    }

    private static final float getCharacterRightBounds(int i11, int i12, float[] fArr) {
        return fArr[((i11 - i12) * 2) + 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d6, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final int getEndOffsetForRectWithinRun(androidx.compose.ui.text.android.LayoutHelper.BidiRun r5, android.graphics.RectF r6, int r7, int r8, int r9, float r10, float r11, float[] r12, androidx.compose.ui.text.android.selection.SegmentFinder r13, x00.p<? super android.graphics.RectF, ? super android.graphics.RectF, java.lang.Boolean> r14) {
        /*
            boolean r0 = horizontalOverlap(r6, r10, r11)
            r1 = -1
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r0 = r5.isRtl()
            r2 = 1
            if (r0 != 0) goto L15
            float r0 = r6.right
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 >= 0) goto L21
        L15:
            boolean r11 = r5.isRtl()
            if (r11 == 0) goto L27
            float r11 = r6.left
            int r10 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r10 > 0) goto L27
        L21:
            int r10 = r5.getEnd()
            int r10 = r10 - r2
            goto L5e
        L27:
            int r10 = r5.getStart()
            int r11 = r5.getEnd()
        L2f:
            int r0 = r11 - r10
            if (r0 <= r2) goto L57
            int r0 = r11 + r10
            int r0 = r0 / 2
            float r3 = getCharacterLeftBounds(r0, r7, r12)
            boolean r4 = r5.isRtl()
            if (r4 != 0) goto L47
            float r4 = r6.right
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 > 0) goto L53
        L47:
            boolean r4 = r5.isRtl()
            if (r4 == 0) goto L55
            float r4 = r6.left
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L55
        L53:
            r11 = r0
            goto L2f
        L55:
            r10 = r0
            goto L2f
        L57:
            boolean r0 = r5.isRtl()
            if (r0 == 0) goto L5e
            r10 = r11
        L5e:
            int r10 = r10 + r2
            int r10 = r13.previousStartBoundary(r10)
            if (r10 != r1) goto L66
            return r1
        L66:
            int r11 = r13.nextEndBoundary(r10)
            int r0 = r5.getStart()
            if (r11 > r0) goto L71
            return r1
        L71:
            int r0 = r5.getStart()
            int r10 = g10.u.u(r10, r0)
            int r0 = r5.getEnd()
            int r11 = g10.u.B(r11, r0)
            android.graphics.RectF r0 = new android.graphics.RectF
            float r8 = (float) r8
            float r9 = (float) r9
            r2 = 0
            r0.<init>(r2, r8, r2, r9)
        L89:
            boolean r8 = r5.isRtl()
            if (r8 == 0) goto L96
            int r8 = r11 + (-1)
            float r8 = getCharacterLeftBounds(r8, r7, r12)
            goto L9a
        L96:
            float r8 = getCharacterLeftBounds(r10, r7, r12)
        L9a:
            r0.left = r8
            boolean r8 = r5.isRtl()
            if (r8 == 0) goto La7
            float r8 = getCharacterRightBounds(r10, r7, r12)
            goto Lad
        La7:
            int r8 = r11 + (-1)
            float r8 = getCharacterRightBounds(r8, r7, r12)
        Lad:
            r0.right = r8
            java.lang.Object r8 = r14.invoke(r0, r6)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Lbc
            return r11
        Lbc:
            int r11 = r13.previousEndBoundary(r11)
            if (r11 == r1) goto Ld6
            int r8 = r5.getStart()
            if (r11 > r8) goto Lc9
            goto Ld6
        Lc9:
            int r8 = r13.previousStartBoundary(r11)
            int r9 = r5.getStart()
            int r10 = g10.u.u(r8, r9)
            goto L89
        Ld6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.TextLayoutGetRangeForRectExtensions_androidKt.getEndOffsetForRectWithinRun(androidx.compose.ui.text.android.LayoutHelper$BidiRun, android.graphics.RectF, int, int, int, float, float, float[], androidx.compose.ui.text.android.selection.SegmentFinder, x00.p):int");
    }

    @m80.l
    public static final int[] getRangeForRect(@m80.k TextLayout textLayout, @m80.k Layout layout, @m80.k LayoutHelper layoutHelper, @m80.k RectF rectF, int i11, @m80.k x00.p<? super RectF, ? super RectF, Boolean> pVar) {
        int i12;
        SegmentFinder wordSegmentFinder = i11 == 1 ? new WordSegmentFinder(textLayout.getText(), textLayout.getWordIterator()) : SegmentFinder_androidKt.createGraphemeClusterSegmentFinder(textLayout.getText(), textLayout.getTextPaint());
        int lineForVertical = layout.getLineForVertical((int) rectF.top);
        if (rectF.top > textLayout.getLineBottom(lineForVertical) && (lineForVertical = lineForVertical + 1) >= textLayout.getLineCount()) {
            return null;
        }
        int i13 = lineForVertical;
        int lineForVertical2 = layout.getLineForVertical((int) rectF.bottom);
        if (lineForVertical2 == 0 && rectF.bottom < textLayout.getLineTop(0)) {
            return null;
        }
        int startOrEndOffsetForRectWithinLine = getStartOrEndOffsetForRectWithinLine(textLayout, layout, layoutHelper, i13, rectF, wordSegmentFinder, pVar, true);
        while (true) {
            i12 = i13;
            if (startOrEndOffsetForRectWithinLine != -1 || i12 >= lineForVertical2) {
                break;
            }
            i13 = i12 + 1;
            startOrEndOffsetForRectWithinLine = getStartOrEndOffsetForRectWithinLine(textLayout, layout, layoutHelper, i13, rectF, wordSegmentFinder, pVar, true);
        }
        if (startOrEndOffsetForRectWithinLine == -1) {
            return null;
        }
        int startOrEndOffsetForRectWithinLine2 = getStartOrEndOffsetForRectWithinLine(textLayout, layout, layoutHelper, lineForVertical2, rectF, wordSegmentFinder, pVar, false);
        while (startOrEndOffsetForRectWithinLine2 == -1 && i12 < lineForVertical2) {
            int i14 = lineForVertical2 - 1;
            startOrEndOffsetForRectWithinLine2 = getStartOrEndOffsetForRectWithinLine(textLayout, layout, layoutHelper, i14, rectF, wordSegmentFinder, pVar, false);
            lineForVertical2 = i14;
        }
        if (startOrEndOffsetForRectWithinLine2 == -1) {
            return null;
        }
        return new int[]{wordSegmentFinder.previousStartBoundary(startOrEndOffsetForRectWithinLine + 1), wordSegmentFinder.nextEndBoundary(startOrEndOffsetForRectWithinLine2 - 1)};
    }

    private static final int getStartOffsetForRectWithinRun(LayoutHelper.BidiRun bidiRun, RectF rectF, int i11, int i12, int i13, float f11, float f12, float[] fArr, SegmentFinder segmentFinder, x00.p<? super RectF, ? super RectF, Boolean> pVar) {
        int start;
        int previousStartBoundary;
        if (!horizontalOverlap(rectF, f11, f12)) {
            return -1;
        }
        if ((bidiRun.isRtl() || rectF.left > f11) && (!bidiRun.isRtl() || rectF.right < f12)) {
            start = bidiRun.getStart();
            int end = bidiRun.getEnd();
            while (end - start > 1) {
                int i14 = (end + start) / 2;
                float characterLeftBounds = getCharacterLeftBounds(i14, i11, fArr);
                if ((bidiRun.isRtl() || characterLeftBounds <= rectF.left) && (!bidiRun.isRtl() || characterLeftBounds >= rectF.right)) {
                    start = i14;
                } else {
                    end = i14;
                }
            }
            if (bidiRun.isRtl()) {
                start = end;
            }
        } else {
            start = bidiRun.getStart();
        }
        int nextEndBoundary = segmentFinder.nextEndBoundary(start);
        if (nextEndBoundary == -1 || (previousStartBoundary = segmentFinder.previousStartBoundary(nextEndBoundary)) >= bidiRun.getEnd()) {
            return -1;
        }
        int u11 = g10.u.u(previousStartBoundary, bidiRun.getStart());
        int B = g10.u.B(nextEndBoundary, bidiRun.getEnd());
        RectF rectF2 = new RectF(0.0f, i12, 0.0f, i13);
        while (true) {
            rectF2.left = bidiRun.isRtl() ? getCharacterLeftBounds(B - 1, i11, fArr) : getCharacterLeftBounds(u11, i11, fArr);
            rectF2.right = bidiRun.isRtl() ? getCharacterRightBounds(u11, i11, fArr) : getCharacterRightBounds(B - 1, i11, fArr);
            if (pVar.invoke(rectF2, rectF).booleanValue()) {
                return u11;
            }
            u11 = segmentFinder.nextStartBoundary(u11);
            if (u11 == -1 || u11 >= bidiRun.getEnd()) {
                break;
            }
            B = g10.u.B(segmentFinder.nextEndBoundary(u11), bidiRun.getEnd());
        }
        return -1;
    }

    private static final int getStartOrEndOffsetForRectWithinLine(TextLayout textLayout, Layout layout, LayoutHelper layoutHelper, int i11, RectF rectF, SegmentFinder segmentFinder, x00.p<? super RectF, ? super RectF, Boolean> pVar, boolean z11) {
        int lineTop = layout.getLineTop(i11);
        int lineBottom = layout.getLineBottom(i11);
        int lineStart = layout.getLineStart(i11);
        int lineEnd = layout.getLineEnd(i11);
        if (lineStart == lineEnd) {
            return -1;
        }
        float[] fArr = new float[(lineEnd - lineStart) * 2];
        textLayout.fillLineHorizontalBounds$ui_text_release(i11, fArr);
        LayoutHelper.BidiRun[] lineBidiRuns$ui_text_release = layoutHelper.getLineBidiRuns$ui_text_release(i11);
        g10.j Fe = z11 ? a00.a0.Fe(lineBidiRuns$ui_text_release) : g10.u.k0(a00.a0.Oe(lineBidiRuns$ui_text_release), 0);
        int d11 = Fe.d();
        int f11 = Fe.f();
        int g11 = Fe.g();
        if ((g11 > 0 && d11 <= f11) || (g11 < 0 && f11 <= d11)) {
            int i12 = d11;
            while (true) {
                LayoutHelper.BidiRun bidiRun = lineBidiRuns$ui_text_release[i12];
                float characterLeftBounds = bidiRun.isRtl() ? getCharacterLeftBounds(bidiRun.getEnd() - 1, lineStart, fArr) : getCharacterLeftBounds(bidiRun.getStart(), lineStart, fArr);
                float characterRightBounds = bidiRun.isRtl() ? getCharacterRightBounds(bidiRun.getStart(), lineStart, fArr) : getCharacterRightBounds(bidiRun.getEnd() - 1, lineStart, fArr);
                int startOffsetForRectWithinRun = z11 ? getStartOffsetForRectWithinRun(bidiRun, rectF, lineStart, lineTop, lineBottom, characterLeftBounds, characterRightBounds, fArr, segmentFinder, pVar) : getEndOffsetForRectWithinRun(bidiRun, rectF, lineStart, lineTop, lineBottom, characterLeftBounds, characterRightBounds, fArr, segmentFinder, pVar);
                if (startOffsetForRectWithinRun < 0) {
                    if (i12 == f11) {
                        break;
                    }
                    i12 += g11;
                } else {
                    return startOffsetForRectWithinRun;
                }
            }
        }
        return -1;
    }

    private static final boolean horizontalOverlap(RectF rectF, float f11, float f12) {
        return f12 >= rectF.left && f11 <= rectF.right;
    }
}
