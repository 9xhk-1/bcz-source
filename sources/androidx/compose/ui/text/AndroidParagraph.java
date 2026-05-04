package androidx.compose.ui.text;

import android.graphics.RectF;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.selection.WordBoundary_androidKt;
import androidx.compose.ui.text.android.selection.WordIterator;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nAndroidParagraph.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidParagraph.android.kt\nandroidx/compose/ui/text/AndroidParagraph\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,710:1\n114#2,8:711\n114#2,8:719\n114#2,8:745\n114#2,8:754\n114#2,8:762\n33#3:727\n33#3:731\n33#3:770\n53#4,3:728\n53#4,3:732\n70#4:740\n60#4:743\n53#4,3:771\n11065#5:735\n11400#5,3:736\n69#6:739\n65#6:742\n22#7:741\n22#7:744\n1#8:753\n*S KotlinDebug\n*F\n+ 1 AndroidParagraph.android.kt\nandroidx/compose/ui/text/AndroidParagraph\n*L\n139#1:711,8\n143#1:719,8\n389#1:745,8\n430#1:754,8\n440#1:762,8\n255#1:727\n259#1:731\n569#1:770\n255#1:728,3\n259#1:732,3\n361#1:740\n362#1:743\n569#1:771,3\n299#1:735\n299#1:736,3\n361#1:739\n362#1:742\n361#1:741\n362#1:744\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidParagraph implements Paragraph {
    public static final int $stable = 8;

    @k
    private final CharSequence charSequence;
    private final long constraints;

    @k
    private final TextLayout layout;
    private final int maxLines;
    private final int overflow;

    @k
    private final AndroidParagraphIntrinsics paragraphIntrinsics;

    @k
    private final List<Rect> placeholderRects;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ResolvedTextDirection.values().length];
            try {
                iArr[ResolvedTextDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ResolvedTextDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i11, int i12, long j11, v vVar) {
        this(androidParagraphIntrinsics, i11, i12, j11);
    }

    private final TextLayout constructTextLayout(int i11, int i12, TextUtils.TruncateAt truncateAt, int i13, int i14, int i15, int i16, int i17, CharSequence charSequence) {
        return new TextLayout(charSequence, getWidth(), getTextPaint$ui_text_release(), i11, truncateAt, this.paragraphIntrinsics.getTextDirectionHeuristic$ui_text_release(), 1.0f, 0.0f, AndroidParagraphHelper_androidKt.isIncludeFontPaddingEnabled(this.paragraphIntrinsics.getStyle()), true, i13, i15, i16, i17, i14, i12, null, null, this.paragraphIntrinsics.getLayoutIntrinsics$ui_text_release(), 196736, null);
    }

    public static /* synthetic */ TextLayout constructTextLayout$default(AndroidParagraph androidParagraph, int i11, int i12, TextUtils.TruncateAt truncateAt, int i13, int i14, int i15, int i16, int i17, CharSequence charSequence, int i18, Object obj) {
        return androidParagraph.constructTextLayout(i11, i12, truncateAt, i13, i14, i15, i16, i17, (i18 & 256) != 0 ? androidParagraph.charSequence : charSequence);
    }

    private final ShaderBrushSpan[] getShaderBrushSpans(TextLayout textLayout) {
        if (!(textLayout.getText() instanceof Spanned)) {
            return null;
        }
        CharSequence text = textLayout.getText();
        g0.n(text, "null cannot be cast to non-null type android.text.Spanned");
        if (!hasSpan((Spanned) text, ShaderBrushSpan.class)) {
            return null;
        }
        CharSequence text2 = textLayout.getText();
        g0.n(text2, "null cannot be cast to non-null type android.text.Spanned");
        return (ShaderBrushSpan[]) ((Spanned) text2).getSpans(0, textLayout.getText().length(), ShaderBrushSpan.class);
    }

    private final boolean hasSpan(Spanned spanned, Class<?> cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    private final void paint(Canvas canvas) {
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.save();
            nativeCanvas.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.layout.paint(nativeCanvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.restore();
        }
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: fillBoundingBoxes-8ffj60Q, reason: not valid java name */
    public void mo4367fillBoundingBoxes8ffj60Q(long j11, @k float[] fArr, @IntRange(from = 0) int i11) {
        this.layout.fillBoundingBoxes(TextRange.m4557getMinimpl(j11), TextRange.m4556getMaximpl(j11), fArr, i11);
    }

    @Override // androidx.compose.ui.text.Paragraph
    @k
    public ResolvedTextDirection getBidiRunDirection(int i11) {
        return this.layout.isRtlCharAt(i11) ? ResolvedTextDirection.Rtl : ResolvedTextDirection.Ltr;
    }

    @Override // androidx.compose.ui.text.Paragraph
    @k
    public Rect getBoundingBox(int i11) {
        boolean z11 = false;
        if (i11 >= 0 && i11 < this.charSequence.length()) {
            z11 = true;
        }
        if (!z11) {
            InlineClassHelperKt.throwIllegalArgumentException("offset(" + i11 + ") is out of bounds [0," + this.charSequence.length() + ')');
        }
        RectF boundingBox = this.layout.getBoundingBox(i11);
        return new Rect(boundingBox.left, boundingBox.top, boundingBox.right, boundingBox.bottom);
    }

    @k
    public final CharSequence getCharSequence$ui_text_release() {
        return this.charSequence;
    }

    /* renamed from: getConstraints-msEJaDk, reason: not valid java name */
    public final long m4368getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.ui.text.Paragraph
    @k
    public Rect getCursorRect(int i11) {
        if (!(i11 >= 0 && i11 <= this.charSequence.length())) {
            InlineClassHelperKt.throwIllegalArgumentException("offset(" + i11 + ") is out of bounds [0," + this.charSequence.length() + l50.b.f69930l);
        }
        float primaryHorizontal$default = TextLayout.getPrimaryHorizontal$default(this.layout, i11, false, 2, null);
        int lineForOffset = this.layout.getLineForOffset(i11);
        return new Rect(primaryHorizontal$default, this.layout.getLineTop(lineForOffset), primaryHorizontal$default, this.layout.getLineBottom(lineForOffset));
    }

    @Override // androidx.compose.ui.text.Paragraph
    public boolean getDidExceedMaxLines() {
        return this.layout.getDidExceedMaxLines();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getFirstBaseline() {
        return getLineBaseline(0);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getHeight() {
        return this.layout.getHeight();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getHorizontalPosition(int i11, boolean z11) {
        return z11 ? TextLayout.getPrimaryHorizontal$default(this.layout, i11, false, 2, null) : TextLayout.getSecondaryHorizontal$default(this.layout, i11, false, 2, null);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLastBaseline() {
        return getLineBaseline(getLineCount() - 1);
    }

    public final float getLineAscent$ui_text_release(int i11) {
        return this.layout.getLineAscent(i11);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineBaseline(int i11) {
        return this.layout.getLineBaseline(i11);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineBottom(int i11) {
        return this.layout.getLineBottom(i11);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineCount() {
        return this.layout.getLineCount();
    }

    public final float getLineDescent$ui_text_release(int i11) {
        return this.layout.getLineDescent(i11);
    }

    public final int getLineEllipsisCount$ui_text_release(int i11) {
        return this.layout.getLineEllipsisCount(i11);
    }

    public final int getLineEllipsisOffset$ui_text_release(int i11) {
        return this.layout.getLineEllipsisOffset(i11);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineEnd(int i11, boolean z11) {
        return z11 ? this.layout.getLineVisibleEnd(i11) : this.layout.getLineEnd(i11);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineForOffset(int i11) {
        return this.layout.getLineForOffset(i11);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineForVerticalPosition(float f11) {
        return this.layout.getLineForVertical((int) f11);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineHeight(int i11) {
        return this.layout.getLineHeight(i11);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineLeft(int i11) {
        return this.layout.getLineLeft(i11);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineRight(int i11) {
        return this.layout.getLineRight(i11);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineStart(int i11) {
        return this.layout.getLineStart(i11);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineTop(int i11) {
        return this.layout.getLineTop(i11);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineWidth(int i11) {
        return this.layout.getLineWidth(i11);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getMaxIntrinsicWidth() {
        return this.paragraphIntrinsics.getMaxIntrinsicWidth();
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getMinIntrinsicWidth() {
        return this.paragraphIntrinsics.getMinIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public int mo4369getOffsetForPositionk4lQ0M(long j11) {
        return this.layout.getOffsetForHorizontal(this.layout.getLineForVertical((int) Float.intBitsToFloat((int) (4294967295L & j11))), Float.intBitsToFloat((int) (j11 >> 32)));
    }

    /* renamed from: getOverflow-gIe3tQ8, reason: not valid java name */
    public final int m4370getOverflowgIe3tQ8() {
        return this.overflow;
    }

    @Override // androidx.compose.ui.text.Paragraph
    @k
    public ResolvedTextDirection getParagraphDirection(int i11) {
        return this.layout.getParagraphDirection(this.layout.getLineForOffset(i11)) == 1 ? ResolvedTextDirection.Ltr : ResolvedTextDirection.Rtl;
    }

    @k
    public final AndroidParagraphIntrinsics getParagraphIntrinsics() {
        return this.paragraphIntrinsics;
    }

    @Override // androidx.compose.ui.text.Paragraph
    @k
    public Path getPathForRange(int i11, int i12) {
        if (!(i11 >= 0 && i11 <= i12 && i12 <= this.charSequence.length())) {
            InlineClassHelperKt.throwIllegalArgumentException("start(" + i11 + ") or end(" + i12 + ") is out of range [0.." + this.charSequence.length() + "], or start > end!");
        }
        android.graphics.Path path = new android.graphics.Path();
        this.layout.getSelectionPath(i11, i12, path);
        return AndroidPath_androidKt.asComposePath(path);
    }

    @Override // androidx.compose.ui.text.Paragraph
    @k
    public List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: getRangeForRect-8-6BmAI, reason: not valid java name */
    public long mo4371getRangeForRect86BmAI(@k Rect rect, int i11, @k final TextInclusionStrategy textInclusionStrategy) {
        int m4387toLayoutTextGranularityduNsdkg;
        TextLayout textLayout = this.layout;
        RectF androidRectF = RectHelper_androidKt.toAndroidRectF(rect);
        m4387toLayoutTextGranularityduNsdkg = AndroidParagraph_androidKt.m4387toLayoutTextGranularityduNsdkg(i11);
        int[] rangeForRect = textLayout.getRangeForRect(androidRectF, m4387toLayoutTextGranularityduNsdkg, new p<RectF, RectF, Boolean>() { // from class: androidx.compose.ui.text.AndroidParagraph$getRangeForRect$range$1
            {
                super(2);
            }

            @Override // x00.p
            public final Boolean invoke(RectF rectF, RectF rectF2) {
                return Boolean.valueOf(TextInclusionStrategy.this.isIncluded(RectHelper_androidKt.toComposeRect(rectF), RectHelper_androidKt.toComposeRect(rectF2)));
            }
        });
        return rangeForRect == null ? TextRange.Companion.m4564getZerod9O1mEE() : TextRangeKt.TextRange(rangeForRect[0], rangeForRect[1]);
    }

    @k
    public final Locale getTextLocale$ui_text_release() {
        return this.paragraphIntrinsics.getTextPaint$ui_text_release().getTextLocale();
    }

    @k
    public final AndroidTextPaint getTextPaint$ui_text_release() {
        return this.paragraphIntrinsics.getTextPaint$ui_text_release();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getWidth() {
        return Constraints.m5068getMaxWidthimpl(this.constraints);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public long mo4372getWordBoundaryjx7JFs(int i11) {
        WordIterator wordIterator = this.layout.getWordIterator();
        return TextRangeKt.TextRange(WordBoundary_androidKt.getWordStart(wordIterator, i11), WordBoundary_androidKt.getWordEnd(wordIterator, i11));
    }

    @Override // androidx.compose.ui.text.Paragraph
    public boolean isLineEllipsized(int i11) {
        return this.layout.isLineEllipsized(i11);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: paint-LG529CI, reason: not valid java name */
    public void mo4373paintLG529CI(@k Canvas canvas, long j11, @l Shadow shadow, @l TextDecoration textDecoration, @l DrawStyle drawStyle, int i11) {
        int m4822getBlendMode0nO6VwU = getTextPaint$ui_text_release().m4822getBlendMode0nO6VwU();
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m4827setColor8_81llA(j11);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        textPaint$ui_text_release.setDrawStyle(drawStyle);
        textPaint$ui_text_release.m4824setBlendModes9anfk8(i11);
        paint(canvas);
        getTextPaint$ui_text_release().m4824setBlendModes9anfk8(m4822getBlendMode0nO6VwU);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: paint-RPmYEkk, reason: not valid java name */
    public void mo4374paintRPmYEkk(@k Canvas canvas, long j11, @l Shadow shadow, @l TextDecoration textDecoration) {
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m4827setColor8_81llA(j11);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        paint(canvas);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: paint-hn5TExg, reason: not valid java name */
    public void mo4375painthn5TExg(@k Canvas canvas, @k Brush brush, float f11, @l Shadow shadow, @l TextDecoration textDecoration, @l DrawStyle drawStyle, int i11) {
        int m4822getBlendMode0nO6VwU = getTextPaint$ui_text_release().m4822getBlendMode0nO6VwU();
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        float width = getWidth();
        float height = getHeight();
        textPaint$ui_text_release.m4825setBrush12SF9DM(brush, Size.m2328constructorimpl((Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32)), f11);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        textPaint$ui_text_release.setDrawStyle(drawStyle);
        textPaint$ui_text_release.m4824setBlendModes9anfk8(i11);
        paint(canvas);
        getTextPaint$ui_text_release().m4824setBlendModes9anfk8(m4822getBlendMode0nO6VwU);
    }

    public /* synthetic */ AndroidParagraph(String str, TextStyle textStyle, List list, List list2, int i11, int i12, long j11, FontFamily.Resolver resolver, Density density, v vVar) {
        this(str, textStyle, list, list2, i11, i12, j11, resolver, density);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private AndroidParagraph(androidx.compose.ui.text.platform.AndroidParagraphIntrinsics r23, int r24, int r25, long r26) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.AndroidParagraph.<init>(androidx.compose.ui.text.platform.AndroidParagraphIntrinsics, int, int, long):void");
    }

    @VisibleForTesting
    public static /* synthetic */ void getCharSequence$ui_text_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTextLocale$ui_text_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTextPaint$ui_text_release$annotations() {
    }

    private AndroidParagraph(String str, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, List<AnnotatedString.Range<Placeholder>> list2, int i11, int i12, long j11, FontFamily.Resolver resolver, Density density) {
        this(new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density), i11, i12, j11, null);
    }
}
