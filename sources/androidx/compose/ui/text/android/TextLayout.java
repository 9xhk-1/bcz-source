package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.Px;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.selection.WordIterator;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.IndentationFixSpan_androidKt;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nTextLayout.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.android.kt\nandroidx/compose/ui/text/android/TextLayout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,1127:1\n1#2:1128\n114#3,8:1129\n114#3,8:1137\n114#3,8:1145\n114#3,8:1153\n114#3,8:1161\n114#3,8:1169\n*S KotlinDebug\n*F\n+ 1 TextLayout.android.kt\nandroidx/compose/ui/text/android/TextLayout\n*L\n607#1:1129,8\n674#1:1137,8\n675#1:1145,8\n678#1:1153,8\n681#1:1161,8\n688#1:1169,8\n*E\n"})
/* loaded from: classes2.dex */
public final class TextLayout {
    public static final int $stable = 8;

    @m80.l
    private LayoutHelper backingLayoutHelper;

    @m80.l
    private WordIterator backingWordIterator;
    private final int bottomPadding;
    private final boolean didExceedMaxLines;

    @m80.l
    private final TextUtils.TruncateAt ellipsize;
    private final boolean fallbackLineSpacing;
    private final boolean includePadding;
    private final boolean isBoringLayout;
    private final int lastLineExtra;

    @m80.l
    private final Paint.FontMetricsInt lastLineFontMetrics;

    @m80.k
    private final Layout layout;

    @m80.k
    private final LayoutIntrinsics layoutIntrinsics;
    private final float leftPadding;
    private final int lineCount;

    @m80.l
    private final LineHeightStyleSpan[] lineHeightSpans;

    @m80.k
    private final Rect rect;
    private final float rightPadding;

    @m80.k
    private final TextPaint textPaint;
    private final int topPadding;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    public TextLayout(@m80.k CharSequence charSequence, float f11, @m80.k TextPaint textPaint, int i11, @m80.l TextUtils.TruncateAt truncateAt, int i12, float f12, @Px float f13, boolean z11, boolean z12, int i13, int i14, int i15, int i16, int i17, int i18, @m80.l int[] iArr, @m80.l int[] iArr2, @m80.k LayoutIntrinsics layoutIntrinsics) {
        boolean z13;
        int i19;
        boolean z14;
        TextDirectionHeuristic textDirectionHeuristic;
        TextPaint textPaint2;
        Layout create;
        long verticalPaddings;
        LineHeightStyleSpan[] lineHeightSpans;
        Paint.FontMetricsInt lastLineMetrics;
        this.textPaint = textPaint;
        this.ellipsize = truncateAt;
        this.includePadding = z11;
        this.fallbackLineSpacing = z12;
        this.layoutIntrinsics = layoutIntrinsics;
        this.rect = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristic2 = TextLayout_androidKt.getTextDirectionHeuristic(i12);
        Layout.Alignment alignment = TextAlignmentAdapter.INSTANCE.get(i11);
        boolean z15 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, BaselineShiftSpan.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics boringMetrics = layoutIntrinsics.getBoringMetrics();
            double d11 = f11;
            int ceil = (int) Math.ceil(d11);
            if (boringMetrics == null || layoutIntrinsics.getMaxIntrinsicWidth() > f11 || z15) {
                z13 = true;
                this.isBoringLayout = false;
                i19 = i13;
                z14 = false;
                textDirectionHeuristic = textDirectionHeuristic2;
                textPaint2 = textPaint;
                create = StaticLayoutFactory.INSTANCE.create(charSequence, textPaint2, ceil, 0, charSequence.length(), textDirectionHeuristic, alignment, i19, truncateAt, (int) Math.ceil(d11), f12, f13, i18, z11, z12, i14, i15, i16, i17, iArr, iArr2);
            } else {
                z13 = true;
                this.isBoringLayout = true;
                create = BoringLayoutFactory.INSTANCE.create(charSequence, textPaint, ceil, boringMetrics, alignment, z11, z12, truncateAt, ceil);
                textPaint2 = textPaint;
                i19 = i13;
                textDirectionHeuristic = textDirectionHeuristic2;
                z14 = false;
            }
            this.layout = create;
            Trace.endSection();
            int min = Math.min(create.getLineCount(), i19);
            this.lineCount = min;
            int i21 = min - 1;
            this.didExceedMaxLines = (min >= i19 && (create.getEllipsisCount(i21) > 0 || create.getLineEnd(i21) != charSequence.length())) ? z13 : z14;
            verticalPaddings = TextLayout_androidKt.getVerticalPaddings(this);
            lineHeightSpans = TextLayout_androidKt.getLineHeightSpans(this);
            this.lineHeightSpans = lineHeightSpans;
            long lineHeightPaddings = lineHeightSpans != null ? TextLayout_androidKt.getLineHeightPaddings(lineHeightSpans) : TextLayout_androidKt.ZeroVerticalPadding;
            this.topPadding = Math.max(VerticalPaddings.m4611getTopPaddingimpl(verticalPaddings), VerticalPaddings.m4611getTopPaddingimpl(lineHeightPaddings));
            this.bottomPadding = Math.max(VerticalPaddings.m4610getBottomPaddingimpl(verticalPaddings), VerticalPaddings.m4610getBottomPaddingimpl(lineHeightPaddings));
            lastLineMetrics = TextLayout_androidKt.getLastLineMetrics(this, textPaint2, textDirectionHeuristic, lineHeightSpans);
            this.lastLineExtra = lastLineMetrics != null ? lastLineMetrics.bottom - ((int) getLineHeight(i21)) : z14;
            this.lastLineFontMetrics = lastLineMetrics;
            this.leftPadding = IndentationFixSpan_androidKt.getEllipsizedLeftPadding$default(create, i21, null, 2, null);
            this.rightPadding = IndentationFixSpan_androidKt.getEllipsizedRightPadding$default(create, i21, null, 2, null);
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    private final float getHorizontalPadding(int i11) {
        if (i11 == this.lineCount - 1) {
            return this.leftPadding + this.rightPadding;
        }
        return 0.0f;
    }

    private final LayoutHelper getLayoutHelper() {
        LayoutHelper layoutHelper = this.backingLayoutHelper;
        if (layoutHelper != null) {
            kotlin.jvm.internal.g0.m(layoutHelper);
            return layoutHelper;
        }
        LayoutHelper layoutHelper2 = new LayoutHelper(this.layout);
        this.backingLayoutHelper = layoutHelper2;
        return layoutHelper2;
    }

    public static /* synthetic */ float getPrimaryHorizontal$default(TextLayout textLayout, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        return textLayout.getPrimaryHorizontal(i11, z11);
    }

    public static /* synthetic */ float getSecondaryHorizontal$default(TextLayout textLayout, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        return textLayout.getSecondaryHorizontal(i11, z11);
    }

    public final void fillBoundingBoxes(int i11, int i12, @m80.k float[] fArr, int i13) {
        float secondaryDownstream;
        float secondaryUpstream;
        int length = getText().length();
        if (!(i11 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("startOffset must be > 0");
        }
        if (!(i11 < length)) {
            InlineClassHelperKt.throwIllegalArgumentException("startOffset must be less than text length");
        }
        if (!(i12 > i11)) {
            InlineClassHelperKt.throwIllegalArgumentException("endOffset must be greater than startOffset");
        }
        if (!(i12 <= length)) {
            InlineClassHelperKt.throwIllegalArgumentException("endOffset must be smaller or equal to text length");
        }
        if (!(fArr.length - i13 >= (i12 - i11) * 4)) {
            InlineClassHelperKt.throwIllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int lineForOffset = getLineForOffset(i11);
        int lineForOffset2 = getLineForOffset(i12 - 1);
        HorizontalPositionCache horizontalPositionCache = new HorizontalPositionCache(this);
        if (lineForOffset > lineForOffset2) {
            return;
        }
        int i14 = lineForOffset;
        int i15 = i13;
        while (true) {
            int lineStart = getLineStart(i14);
            int lineEnd = getLineEnd(i14);
            int min = Math.min(i12, lineEnd);
            float lineTop = getLineTop(i14);
            float lineBottom = getLineBottom(i14);
            boolean z11 = getParagraphDirection(i14) == 1;
            for (int max = Math.max(i11, lineStart); max < min; max++) {
                boolean isRtlCharAt = isRtlCharAt(max);
                if (z11 && !isRtlCharAt) {
                    secondaryDownstream = horizontalPositionCache.getPrimaryDownstream(max);
                    secondaryUpstream = horizontalPositionCache.getPrimaryUpstream(max + 1);
                } else if (z11 && isRtlCharAt) {
                    secondaryUpstream = horizontalPositionCache.getSecondaryDownstream(max);
                    secondaryDownstream = horizontalPositionCache.getSecondaryUpstream(max + 1);
                } else if (z11 || !isRtlCharAt) {
                    secondaryDownstream = horizontalPositionCache.getSecondaryDownstream(max);
                    secondaryUpstream = horizontalPositionCache.getSecondaryUpstream(max + 1);
                } else {
                    secondaryUpstream = horizontalPositionCache.getPrimaryDownstream(max);
                    secondaryDownstream = horizontalPositionCache.getPrimaryUpstream(max + 1);
                }
                fArr[i15] = secondaryDownstream;
                fArr[i15 + 1] = lineTop;
                fArr[i15 + 2] = secondaryUpstream;
                fArr[i15 + 3] = lineBottom;
                i15 += 4;
            }
            if (i14 == lineForOffset2) {
                return;
            } else {
                i14++;
            }
        }
    }

    public final void fillLineHorizontalBounds$ui_text_release(int i11, @m80.k float[] fArr) {
        float secondaryDownstream;
        float secondaryUpstream;
        int lineStart = getLineStart(i11);
        int lineEnd = getLineEnd(i11);
        int i12 = 0;
        if (!(fArr.length >= (lineEnd - lineStart) * 2)) {
            InlineClassHelperKt.throwIllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        HorizontalPositionCache horizontalPositionCache = new HorizontalPositionCache(this);
        boolean z11 = getParagraphDirection(i11) == 1;
        while (lineStart < lineEnd) {
            boolean isRtlCharAt = isRtlCharAt(lineStart);
            if (z11 && !isRtlCharAt) {
                secondaryDownstream = horizontalPositionCache.getPrimaryDownstream(lineStart);
                secondaryUpstream = horizontalPositionCache.getPrimaryUpstream(lineStart + 1);
            } else if (z11 && isRtlCharAt) {
                secondaryUpstream = horizontalPositionCache.getSecondaryDownstream(lineStart);
                secondaryDownstream = horizontalPositionCache.getSecondaryUpstream(lineStart + 1);
            } else if (isRtlCharAt) {
                secondaryUpstream = horizontalPositionCache.getPrimaryDownstream(lineStart);
                secondaryDownstream = horizontalPositionCache.getPrimaryUpstream(lineStart + 1);
            } else {
                secondaryDownstream = horizontalPositionCache.getSecondaryDownstream(lineStart);
                secondaryUpstream = horizontalPositionCache.getSecondaryUpstream(lineStart + 1);
            }
            fArr[i12] = secondaryDownstream;
            fArr[i12 + 1] = secondaryUpstream;
            i12 += 2;
            lineStart++;
        }
    }

    public final int getBottomPadding$ui_text_release() {
        return this.bottomPadding;
    }

    @m80.k
    public final RectF getBoundingBox(int i11) {
        float secondaryHorizontal;
        float secondaryHorizontal2;
        float primaryHorizontal;
        float primaryHorizontal2;
        int lineForOffset = getLineForOffset(i11);
        float lineTop = getLineTop(lineForOffset);
        float lineBottom = getLineBottom(lineForOffset);
        boolean z11 = getParagraphDirection(lineForOffset) == 1;
        boolean isRtlCharAt = this.layout.isRtlCharAt(i11);
        if (!z11 || isRtlCharAt) {
            if (z11 && isRtlCharAt) {
                primaryHorizontal = getSecondaryHorizontal(i11, false);
                primaryHorizontal2 = getSecondaryHorizontal(i11 + 1, true);
            } else if (isRtlCharAt) {
                primaryHorizontal = getPrimaryHorizontal(i11, false);
                primaryHorizontal2 = getPrimaryHorizontal(i11 + 1, true);
            } else {
                secondaryHorizontal = getSecondaryHorizontal(i11, false);
                secondaryHorizontal2 = getSecondaryHorizontal(i11 + 1, true);
            }
            float f11 = primaryHorizontal;
            secondaryHorizontal = primaryHorizontal2;
            secondaryHorizontal2 = f11;
        } else {
            secondaryHorizontal = getPrimaryHorizontal(i11, false);
            secondaryHorizontal2 = getPrimaryHorizontal(i11 + 1, true);
        }
        return new RectF(secondaryHorizontal, lineTop, secondaryHorizontal2, lineBottom);
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final boolean getFallbackLineSpacing() {
        return this.fallbackLineSpacing;
    }

    public final int getHeight() {
        return (this.didExceedMaxLines ? this.layout.getLineBottom(this.lineCount - 1) : this.layout.getHeight()) + this.topPadding + this.bottomPadding + this.lastLineExtra;
    }

    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    @m80.k
    public final Layout getLayout() {
        return this.layout;
    }

    @m80.k
    public final LayoutIntrinsics getLayoutIntrinsics() {
        return this.layoutIntrinsics;
    }

    public final float getLineAscent(int i11) {
        Paint.FontMetricsInt fontMetricsInt;
        return (i11 != this.lineCount + (-1) || (fontMetricsInt = this.lastLineFontMetrics) == null) ? this.layout.getLineAscent(i11) : fontMetricsInt.ascent;
    }

    public final float getLineBaseline(int i11) {
        return this.topPadding + ((i11 != this.lineCount + (-1) || this.lastLineFontMetrics == null) ? this.layout.getLineBaseline(i11) : getLineTop(i11) - this.lastLineFontMetrics.ascent);
    }

    public final float getLineBottom(int i11) {
        if (i11 != this.lineCount - 1 || this.lastLineFontMetrics == null) {
            return this.topPadding + this.layout.getLineBottom(i11) + (i11 == this.lineCount + (-1) ? this.bottomPadding : 0);
        }
        return this.layout.getLineBottom(i11 - 1) + this.lastLineFontMetrics.bottom;
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final float getLineDescent(int i11) {
        Paint.FontMetricsInt fontMetricsInt;
        return (i11 != this.lineCount + (-1) || (fontMetricsInt = this.lastLineFontMetrics) == null) ? this.layout.getLineDescent(i11) : fontMetricsInt.descent;
    }

    public final int getLineEllipsisCount(int i11) {
        return this.layout.getEllipsisCount(i11);
    }

    public final int getLineEllipsisOffset(int i11) {
        return this.layout.getEllipsisStart(i11);
    }

    public final int getLineEnd(int i11) {
        return (TextLayout_androidKt.isLineEllipsized(this.layout, i11) && this.ellipsize == TextUtils.TruncateAt.END) ? this.layout.getText().length() : this.layout.getLineEnd(i11);
    }

    public final int getLineForOffset(int i11) {
        return this.layout.getLineForOffset(i11);
    }

    public final int getLineForVertical(int i11) {
        return this.layout.getLineForVertical(i11 - this.topPadding);
    }

    public final float getLineHeight(int i11) {
        return getLineBottom(i11) - getLineTop(i11);
    }

    public final float getLineLeft(int i11) {
        return this.layout.getLineLeft(i11) + (i11 == this.lineCount + (-1) ? this.leftPadding : 0.0f);
    }

    public final float getLineRight(int i11) {
        return this.layout.getLineRight(i11) + (i11 == this.lineCount + (-1) ? this.rightPadding : 0.0f);
    }

    public final int getLineStart(int i11) {
        return this.layout.getLineStart(i11);
    }

    public final float getLineTop(int i11) {
        return this.layout.getLineTop(i11) + (i11 == 0 ? 0 : this.topPadding);
    }

    public final int getLineVisibleEnd(int i11) {
        return (TextLayout_androidKt.isLineEllipsized(this.layout, i11) && this.ellipsize == TextUtils.TruncateAt.END) ? this.layout.getLineStart(i11) + this.layout.getEllipsisStart(i11) : getLayoutHelper().getLineVisibleEnd(i11);
    }

    public final float getLineWidth(int i11) {
        return this.layout.getLineWidth(i11);
    }

    public final float getMaxIntrinsicWidth() {
        return this.layoutIntrinsics.getMaxIntrinsicWidth();
    }

    public final float getMinIntrinsicWidth() {
        return this.layoutIntrinsics.getMinIntrinsicWidth();
    }

    public final int getOffsetForHorizontal(int i11, float f11) {
        return this.layout.getOffsetForHorizontal(i11, f11 + ((-1) * getHorizontalPadding(i11)));
    }

    public final int getParagraphDirection(int i11) {
        return this.layout.getParagraphDirection(i11);
    }

    public final float getPrimaryHorizontal(int i11, boolean z11) {
        return getLayoutHelper().getHorizontalPosition(i11, true, z11) + getHorizontalPadding(getLineForOffset(i11));
    }

    @m80.l
    public final int[] getRangeForRect(@m80.k RectF rectF, int i11, @m80.k x00.p<? super RectF, ? super RectF, Boolean> pVar) {
        return Build.VERSION.SDK_INT >= 34 ? AndroidLayoutApi34.INSTANCE.getRangeForRect$ui_text_release(this, rectF, i11, pVar) : TextLayoutGetRangeForRectExtensions_androidKt.getRangeForRect(this, this.layout, getLayoutHelper(), rectF, i11, pVar);
    }

    public final float getSecondaryHorizontal(int i11, boolean z11) {
        return getLayoutHelper().getHorizontalPosition(i11, false, z11) + getHorizontalPadding(getLineForOffset(i11));
    }

    public final void getSelectionPath(int i11, int i12, @m80.k Path path) {
        this.layout.getSelectionPath(i11, i12, path);
        if (this.topPadding == 0 || path.isEmpty()) {
            return;
        }
        path.offset(0.0f, this.topPadding);
    }

    @m80.k
    public final CharSequence getText() {
        return this.layout.getText();
    }

    @m80.k
    public final TextPaint getTextPaint() {
        return this.textPaint;
    }

    public final int getTopPadding$ui_text_release() {
        return this.topPadding;
    }

    @m80.k
    public final WordIterator getWordIterator() {
        WordIterator wordIterator = this.backingWordIterator;
        if (wordIterator != null) {
            return wordIterator;
        }
        WordIterator wordIterator2 = new WordIterator(this.layout.getText(), 0, this.layout.getText().length(), this.textPaint.getTextLocale());
        this.backingWordIterator = wordIterator2;
        return wordIterator2;
    }

    public final boolean isFallbackLinespacingApplied$ui_text_release() {
        if (this.isBoringLayout) {
            BoringLayoutFactory boringLayoutFactory = BoringLayoutFactory.INSTANCE;
            Layout layout = this.layout;
            kotlin.jvm.internal.g0.n(layout, "null cannot be cast to non-null type android.text.BoringLayout");
            return boringLayoutFactory.isFallbackLineSpacingEnabled((BoringLayout) layout);
        }
        StaticLayoutFactory staticLayoutFactory = StaticLayoutFactory.INSTANCE;
        Layout layout2 = this.layout;
        kotlin.jvm.internal.g0.n(layout2, "null cannot be cast to non-null type android.text.StaticLayout");
        return staticLayoutFactory.isFallbackLineSpacingEnabled((StaticLayout) layout2, this.fallbackLineSpacing);
    }

    public final boolean isLineEllipsized(int i11) {
        return TextLayout_androidKt.isLineEllipsized(this.layout, i11);
    }

    public final boolean isRtlCharAt(int i11) {
        return this.layout.isRtlCharAt(i11);
    }

    public final void paint(@m80.k Canvas canvas) {
        TextAndroidCanvas textAndroidCanvas;
        if (canvas.getClipBounds(this.rect)) {
            int i11 = this.topPadding;
            if (i11 != 0) {
                canvas.translate(0.0f, i11);
            }
            textAndroidCanvas = TextLayout_androidKt.SharedTextAndroidCanvas;
            textAndroidCanvas.setCanvas(canvas);
            this.layout.draw(textAndroidCanvas);
            int i12 = this.topPadding;
            if (i12 != 0) {
                canvas.translate(0.0f, (-1) * i12);
            }
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getBottomPadding$ui_text_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLayout$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTopPadding$ui_text_release$annotations() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TextLayout(java.lang.CharSequence r24, float r25, android.text.TextPaint r26, int r27, android.text.TextUtils.TruncateAt r28, int r29, float r30, float r31, boolean r32, boolean r33, int r34, int r35, int r36, int r37, int r38, int r39, int[] r40, int[] r41, androidx.compose.ui.text.android.LayoutIntrinsics r42, int r43, kotlin.jvm.internal.v r44) {
        /*
            Method dump skipped, instructions count: 174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.TextLayout.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, float, float, boolean, boolean, int, int, int, int, int, int, int[], int[], androidx.compose.ui.text.android.LayoutIntrinsics, int, kotlin.jvm.internal.v):void");
    }
}
