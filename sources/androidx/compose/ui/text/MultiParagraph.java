package androidx.compose.ui.text;

import a00.h0;
import a00.m0;
import a00.r0;
import androidx.annotation.IntRange;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.platform.AndroidMultiParagraphDraw_androidKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import g10.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;
import yz.g2;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nMultiParagraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraph\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1227:1\n114#2,8:1228\n114#2,8:1271\n114#2,8:1282\n114#2,8:1290\n114#2,8:1298\n529#3,3:1236\n34#3,4:1239\n532#3:1243\n150#3,3:1245\n34#3,6:1248\n153#3:1254\n533#3,2:1255\n39#3:1257\n535#3:1258\n34#3,6:1259\n34#3,6:1265\n1#4:1244\n69#5:1279\n70#6:1280\n22#7:1281\n*S KotlinDebug\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraph\n*L\n389#1:1228,8\n522#1:1271,8\n988#1:1282,8\n994#1:1290,8\n1000#1:1298,8\n455#1:1236,3\n455#1:1239,4\n455#1:1243\n456#1:1245,3\n456#1:1248,6\n456#1:1254\n455#1:1255,2\n455#1:1257\n455#1:1258\n483#1:1259,6\n500#1:1265,6\n564#1:1279\n564#1:1280\n564#1:1281\n*E\n"})
/* loaded from: classes2.dex */
public final class MultiParagraph {
    public static final int $stable = 8;
    private final boolean didExceedMaxLines;
    private final float height;

    @k
    private final MultiParagraphIntrinsics intrinsics;
    private final int lineCount;
    private final int maxLines;

    @k
    private final List<ParagraphInfo> paragraphInfoList;

    @k
    private final List<Rect> placeholderRects;
    private final float width;

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j11, Density density, FontFamily.Resolver resolver, List list, int i11, int i12, v vVar) {
        this(annotatedString, textStyle, j11, density, resolver, (List<AnnotatedString.Range<Placeholder>>) list, i11, i12);
    }

    private final AnnotatedString getAnnotatedString() {
        return this.intrinsics.getAnnotatedString();
    }

    public static /* synthetic */ int getLineEnd$default(MultiParagraph multiParagraph, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        return multiParagraph.getLineEnd(i11, z11);
    }

    /* renamed from: paint-RPmYEkk$default, reason: not valid java name */
    public static /* synthetic */ void m4407paintRPmYEkk$default(MultiParagraph multiParagraph, Canvas canvas, long j11, Shadow shadow, TextDecoration textDecoration, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = Color.Companion.m2545getUnspecified0d7_KjU();
        }
        multiParagraph.m4414paintRPmYEkk(canvas, j11, (i11 & 4) != 0 ? null : shadow, (i11 & 8) != 0 ? null : textDecoration);
    }

    /* renamed from: paint-hn5TExg$default, reason: not valid java name */
    public static /* synthetic */ void m4408painthn5TExg$default(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f11, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            f11 = Float.NaN;
        }
        multiParagraph.m4415painthn5TExg(canvas, brush, f11, (i12 & 8) != 0 ? null : shadow, (i12 & 16) != 0 ? null : textDecoration, (i12 & 32) != 0 ? null : drawStyle, (i12 & 64) != 0 ? DrawScope.Companion.m3062getDefaultBlendMode0nO6VwU() : i11);
    }

    private final void requireIndexInRange(int i11) {
        boolean z11 = false;
        if (i11 >= 0 && i11 < getAnnotatedString().getText().length()) {
            z11 = true;
        }
        if (z11) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("offset(" + i11 + ") is out of bounds [0, " + getAnnotatedString().length() + ')');
    }

    private final void requireIndexInRangeInclusiveEnd(int i11) {
        boolean z11 = false;
        if (i11 >= 0 && i11 <= getAnnotatedString().getText().length()) {
            z11 = true;
        }
        if (z11) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("offset(" + i11 + ") is out of bounds [0, " + getAnnotatedString().length() + l50.b.f69930l);
    }

    private final void requireLineIndexInRange(int i11) {
        boolean z11 = false;
        if (i11 >= 0 && i11 < this.lineCount) {
            z11 = true;
        }
        if (z11) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("lineIndex(" + i11 + ") is out of bounds [0, " + this.lineCount + ')');
    }

    @k
    /* renamed from: fillBoundingBoxes-8ffj60Q, reason: not valid java name */
    public final float[] m4409fillBoundingBoxes8ffj60Q(final long j11, @k final float[] fArr, @IntRange(from = 0) int i11) {
        requireIndexInRange(TextRange.m4557getMinimpl(j11));
        requireIndexInRangeInclusiveEnd(TextRange.m4556getMaximpl(j11));
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = i11;
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        MultiParagraphKt.m4416findParagraphsByRangeSbBc2M(this.paragraphInfoList, j11, new l<ParagraphInfo, g2>() { // from class: androidx.compose.ui.text.MultiParagraph$fillBoundingBoxes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(ParagraphInfo paragraphInfo) {
                invoke2(paragraphInfo);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ParagraphInfo paragraphInfo) {
                long j12 = j11;
                float[] fArr2 = fArr;
                Ref.IntRef intRef2 = intRef;
                Ref.FloatRef floatRef2 = floatRef;
                long TextRange = TextRangeKt.TextRange(paragraphInfo.toLocalIndex(paragraphInfo.getStartIndex() > TextRange.m4557getMinimpl(j12) ? paragraphInfo.getStartIndex() : TextRange.m4557getMinimpl(j12)), paragraphInfo.toLocalIndex(paragraphInfo.getEndIndex() < TextRange.m4556getMaximpl(j12) ? paragraphInfo.getEndIndex() : TextRange.m4556getMaximpl(j12)));
                paragraphInfo.getParagraph().mo4367fillBoundingBoxes8ffj60Q(TextRange, fArr2, intRef2.element);
                int m4555getLengthimpl = intRef2.element + (TextRange.m4555getLengthimpl(TextRange) * 4);
                for (int i12 = intRef2.element; i12 < m4555getLengthimpl; i12 += 4) {
                    int i13 = i12 + 1;
                    float f11 = fArr2[i13];
                    float f12 = floatRef2.element;
                    fArr2[i13] = f11 + f12;
                    int i14 = i12 + 3;
                    fArr2[i14] = fArr2[i14] + f12;
                }
                intRef2.element = m4555getLengthimpl;
                floatRef2.element += paragraphInfo.getParagraph().getHeight();
            }
        });
        return fArr;
    }

    @k
    public final ResolvedTextDirection getBidiRunDirection(int i11) {
        requireIndexInRangeInclusiveEnd(i11);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i11 == getAnnotatedString().length() ? h0.L(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i11));
        return paragraphInfo.getParagraph().getBidiRunDirection(paragraphInfo.toLocalIndex(i11));
    }

    @k
    public final Rect getBoundingBox(int i11) {
        requireIndexInRange(i11);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i11));
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getBoundingBox(paragraphInfo.toLocalIndex(i11)));
    }

    @k
    public final Rect getCursorRect(int i11) {
        requireIndexInRangeInclusiveEnd(i11);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i11 == getAnnotatedString().length() ? h0.L(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i11));
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getCursorRect(paragraphInfo.toLocalIndex(i11)));
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final float getFirstBaseline() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        return this.paragraphInfoList.get(0).getParagraph().getFirstBaseline();
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getHorizontalPosition(int i11, boolean z11) {
        requireIndexInRangeInclusiveEnd(i11);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i11 == getAnnotatedString().length() ? h0.L(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i11));
        return paragraphInfo.getParagraph().getHorizontalPosition(paragraphInfo.toLocalIndex(i11), z11);
    }

    @k
    public final MultiParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    public final float getLastBaseline() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) r0.u3(this.paragraphInfoList);
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLastBaseline());
    }

    public final float getLineBaseline(int i11) {
        requireLineIndexInRange(i11);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i11));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineBaseline(paragraphInfo.toLocalLineIndex(i11)));
    }

    public final float getLineBottom(int i11) {
        requireLineIndexInRange(i11);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i11));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineBottom(paragraphInfo.toLocalLineIndex(i11)));
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final int getLineEnd(int i11, boolean z11) {
        requireLineIndexInRange(i11);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i11));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineEnd(paragraphInfo.toLocalLineIndex(i11), z11));
    }

    public final int getLineForOffset(int i11) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i11 >= getAnnotatedString().length() ? h0.L(this.paragraphInfoList) : i11 < 0 ? 0 : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i11));
        return paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForOffset(paragraphInfo.toLocalIndex(i11)));
    }

    public final int getLineForVerticalPosition(float f11) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByY(this.paragraphInfoList, f11));
        return paragraphInfo.getLength() == 0 ? paragraphInfo.getStartLineIndex() : paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForVerticalPosition(paragraphInfo.toLocalYPosition(f11)));
    }

    public final float getLineHeight(int i11) {
        requireLineIndexInRange(i11);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i11));
        return paragraphInfo.getParagraph().getLineHeight(paragraphInfo.toLocalLineIndex(i11));
    }

    public final float getLineLeft(int i11) {
        requireLineIndexInRange(i11);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i11));
        return paragraphInfo.getParagraph().getLineLeft(paragraphInfo.toLocalLineIndex(i11));
    }

    public final float getLineRight(int i11) {
        requireLineIndexInRange(i11);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i11));
        return paragraphInfo.getParagraph().getLineRight(paragraphInfo.toLocalLineIndex(i11));
    }

    public final int getLineStart(int i11) {
        requireLineIndexInRange(i11);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i11));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineStart(paragraphInfo.toLocalLineIndex(i11)));
    }

    public final float getLineTop(int i11) {
        requireLineIndexInRange(i11);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i11));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineTop(paragraphInfo.toLocalLineIndex(i11)));
    }

    public final float getLineWidth(int i11) {
        requireLineIndexInRange(i11);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i11));
        return paragraphInfo.getParagraph().getLineWidth(paragraphInfo.toLocalLineIndex(i11));
    }

    public final float getMaxIntrinsicWidth() {
        return this.intrinsics.getMaxIntrinsicWidth();
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final float getMinIntrinsicWidth() {
        return this.intrinsics.getMinIntrinsicWidth();
    }

    /* renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public final int m4410getOffsetForPositionk4lQ0M(long j11) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByY(this.paragraphInfoList, Float.intBitsToFloat((int) (4294967295L & j11))));
        return paragraphInfo.getLength() == 0 ? paragraphInfo.getStartIndex() : paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().mo4369getOffsetForPositionk4lQ0M(paragraphInfo.m4425toLocalMKHz9U(j11)));
    }

    @k
    public final ResolvedTextDirection getParagraphDirection(int i11) {
        requireIndexInRangeInclusiveEnd(i11);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i11 == getAnnotatedString().length() ? h0.L(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i11));
        return paragraphInfo.getParagraph().getParagraphDirection(paragraphInfo.toLocalIndex(i11));
    }

    @k
    public final List<ParagraphInfo> getParagraphInfoList$ui_text_release() {
        return this.paragraphInfoList;
    }

    @k
    public final Path getPathForRange(final int i11, final int i12) {
        if (!(i11 >= 0 && i11 <= i12 && i12 <= getAnnotatedString().getText().length())) {
            InlineClassHelperKt.throwIllegalArgumentException("Start(" + i11 + ") or End(" + i12 + ") is out of range [0.." + getAnnotatedString().getText().length() + "), or start > end!");
        }
        if (i11 == i12) {
            return AndroidPath_androidKt.Path();
        }
        final Path Path = AndroidPath_androidKt.Path();
        MultiParagraphKt.m4416findParagraphsByRangeSbBc2M(this.paragraphInfoList, TextRangeKt.TextRange(i11, i12), new l<ParagraphInfo, g2>() { // from class: androidx.compose.ui.text.MultiParagraph$getPathForRange$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(ParagraphInfo paragraphInfo) {
                invoke2(paragraphInfo);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ParagraphInfo paragraphInfo) {
                Path.m2779addPathUv8p0NA$default(Path.this, paragraphInfo.toGlobal(paragraphInfo.getParagraph().getPathForRange(paragraphInfo.toLocalIndex(i11), paragraphInfo.toLocalIndex(i12))), 0L, 2, null);
            }
        });
        return Path;
    }

    @k
    public final List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    /* renamed from: getRangeForRect-8-6BmAI, reason: not valid java name */
    public final long m4411getRangeForRect86BmAI(@k Rect rect, int i11, @k TextInclusionStrategy textInclusionStrategy) {
        TextRange.Companion companion;
        TextRange.Companion companion2;
        int findParagraphByY = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, rect.getTop());
        if (this.paragraphInfoList.get(findParagraphByY).getBottom() >= rect.getBottom() || findParagraphByY == h0.L(this.paragraphInfoList)) {
            ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByY);
            return ParagraphInfo.m4423toGlobalxdX6G0$default(paragraphInfo, paragraphInfo.getParagraph().mo4371getRangeForRect86BmAI(paragraphInfo.toLocal(rect), i11, textInclusionStrategy), false, 1, null);
        }
        int findParagraphByY2 = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, rect.getBottom());
        long m4564getZerod9O1mEE = TextRange.Companion.m4564getZerod9O1mEE();
        while (true) {
            companion = TextRange.Companion;
            if (!TextRange.m4552equalsimpl0(m4564getZerod9O1mEE, companion.m4564getZerod9O1mEE()) || findParagraphByY > findParagraphByY2) {
                break;
            }
            ParagraphInfo paragraphInfo2 = this.paragraphInfoList.get(findParagraphByY);
            m4564getZerod9O1mEE = ParagraphInfo.m4423toGlobalxdX6G0$default(paragraphInfo2, paragraphInfo2.getParagraph().mo4371getRangeForRect86BmAI(paragraphInfo2.toLocal(rect), i11, textInclusionStrategy), false, 1, null);
            findParagraphByY++;
        }
        if (TextRange.m4552equalsimpl0(m4564getZerod9O1mEE, companion.m4564getZerod9O1mEE())) {
            return companion.m4564getZerod9O1mEE();
        }
        long m4564getZerod9O1mEE2 = companion.m4564getZerod9O1mEE();
        while (true) {
            companion2 = TextRange.Companion;
            if (!TextRange.m4552equalsimpl0(m4564getZerod9O1mEE2, companion2.m4564getZerod9O1mEE()) || findParagraphByY > findParagraphByY2) {
                break;
            }
            ParagraphInfo paragraphInfo3 = this.paragraphInfoList.get(findParagraphByY2);
            m4564getZerod9O1mEE2 = ParagraphInfo.m4423toGlobalxdX6G0$default(paragraphInfo3, paragraphInfo3.getParagraph().mo4371getRangeForRect86BmAI(paragraphInfo3.toLocal(rect), i11, textInclusionStrategy), false, 1, null);
            findParagraphByY2--;
        }
        return TextRange.m4552equalsimpl0(m4564getZerod9O1mEE2, companion2.m4564getZerod9O1mEE()) ? m4564getZerod9O1mEE : TextRangeKt.TextRange(TextRange.m4559getStartimpl(m4564getZerod9O1mEE), TextRange.m4554getEndimpl(m4564getZerod9O1mEE2));
    }

    public final float getWidth() {
        return this.width;
    }

    /* renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public final long m4412getWordBoundaryjx7JFs(int i11) {
        requireIndexInRangeInclusiveEnd(i11);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i11 == getAnnotatedString().length() ? h0.L(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i11));
        return paragraphInfo.m4424toGlobalxdX6G0(paragraphInfo.getParagraph().mo4372getWordBoundaryjx7JFs(paragraphInfo.toLocalIndex(i11)), false);
    }

    public final boolean isLineEllipsized(int i11) {
        requireLineIndexInRange(i11);
        return this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i11)).getParagraph().isLineEllipsized(i11);
    }

    /* renamed from: paint-LG529CI, reason: not valid java name */
    public final void m4413paintLG529CI(@k Canvas canvas, long j11, @m80.l Shadow shadow, @m80.l TextDecoration textDecoration, @m80.l DrawStyle drawStyle, int i11) {
        canvas.save();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            ParagraphInfo paragraphInfo = list.get(i12);
            paragraphInfo.getParagraph().mo4373paintLG529CI(canvas, j11, shadow, textDecoration, drawStyle, i11);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.restore();
    }

    @n(level = DeprecationLevel.HIDDEN, message = "Use the new paint function that takes canvas as the only required parameter.")
    /* renamed from: paint-RPmYEkk, reason: not valid java name */
    public final /* synthetic */ void m4414paintRPmYEkk(Canvas canvas, long j11, Shadow shadow, TextDecoration textDecoration) {
        canvas.save();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            ParagraphInfo paragraphInfo = list.get(i11);
            Canvas canvas2 = canvas;
            long j12 = j11;
            paragraphInfo.getParagraph().mo4374paintRPmYEkk(canvas2, j12, shadow, textDecoration);
            canvas2.translate(0.0f, paragraphInfo.getParagraph().getHeight());
            i11++;
            canvas = canvas2;
            j11 = j12;
        }
        canvas.restore();
    }

    /* renamed from: paint-hn5TExg, reason: not valid java name */
    public final void m4415painthn5TExg(@k Canvas canvas, @k Brush brush, float f11, @m80.l Shadow shadow, @m80.l TextDecoration textDecoration, @m80.l DrawStyle drawStyle, int i11) {
        AndroidMultiParagraphDraw_androidKt.m4812drawMultiParagraph7AXcY_I(this, canvas, brush, f11, shadow, textDecoration, drawStyle, i11);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "Constructor with `ellipsis: Boolean` is deprecated, pass TextOverflow instead")
    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j11, Density density, FontFamily.Resolver resolver, List list, int i11, boolean z11, v vVar) {
        this(annotatedString, textStyle, j11, density, resolver, (List<AnnotatedString.Range<Placeholder>>) list, i11, z11);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j11, int i11, int i12, v vVar) {
        this(multiParagraphIntrinsics, j11, i11, i12);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "Constructor with `ellipsis: Boolean` is deprecated, pass TextOverflow instead")
    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j11, int i11, boolean z11, v vVar) {
        this(multiParagraphIntrinsics, j11, i11, z11);
    }

    private MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j11, int i11, int i12) {
        int m5067getMaxHeightimpl;
        this.intrinsics = multiParagraphIntrinsics;
        this.maxLines = i11;
        boolean z11 = true;
        if (!(Constraints.m5070getMinWidthimpl(j11) == 0 && Constraints.m5069getMinHeightimpl(j11) == 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        List<ParagraphIntrinsicInfo> infoList$ui_text_release = multiParagraphIntrinsics.getInfoList$ui_text_release();
        int size = infoList$ui_text_release.size();
        int i13 = 0;
        float f11 = 0.0f;
        int i14 = 0;
        while (i14 < size) {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo = infoList$ui_text_release.get(i14);
            ParagraphIntrinsics intrinsics = paragraphIntrinsicInfo.getIntrinsics();
            int m5068getMaxWidthimpl = Constraints.m5068getMaxWidthimpl(j11);
            if (Constraints.m5063getHasBoundedHeightimpl(j11)) {
                m5067getMaxHeightimpl = u.u(Constraints.m5067getMaxHeightimpl(j11) - ParagraphKt.ceilToInt(f11), 0);
            } else {
                m5067getMaxHeightimpl = Constraints.m5067getMaxHeightimpl(j11);
            }
            Paragraph m4432ParagraphczeNHc = ParagraphKt.m4432ParagraphczeNHc(intrinsics, ConstraintsKt.Constraints$default(0, m5068getMaxWidthimpl, 0, m5067getMaxHeightimpl, 5, null), this.maxLines - i13, i12);
            float height = f11 + m4432ParagraphczeNHc.getHeight();
            int lineCount = i13 + m4432ParagraphczeNHc.getLineCount();
            arrayList.add(new ParagraphInfo(m4432ParagraphczeNHc, paragraphIntrinsicInfo.getStartIndex(), paragraphIntrinsicInfo.getEndIndex(), i13, lineCount, f11, height));
            if (m4432ParagraphczeNHc.getDidExceedMaxLines() || (lineCount == this.maxLines && i14 != h0.L(this.intrinsics.getInfoList$ui_text_release()))) {
                i13 = lineCount;
                f11 = height;
                break;
            } else {
                i14++;
                i13 = lineCount;
                f11 = height;
            }
        }
        z11 = false;
        this.height = f11;
        this.lineCount = i13;
        this.didExceedMaxLines = z11;
        this.paragraphInfoList = arrayList;
        this.width = Constraints.m5068getMaxWidthimpl(j11);
        List<Rect> arrayList2 = new ArrayList<>(arrayList.size());
        int size2 = arrayList.size();
        for (int i15 = 0; i15 < size2; i15++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i15);
            List<Rect> placeholderRects = paragraphInfo.getParagraph().getPlaceholderRects();
            ArrayList arrayList3 = new ArrayList(placeholderRects.size());
            int size3 = placeholderRects.size();
            for (int i16 = 0; i16 < size3; i16++) {
                Rect rect = placeholderRects.get(i16);
                arrayList3.add(rect != null ? paragraphInfo.toGlobal(rect) : null);
            }
            m0.s0(arrayList2, arrayList3);
        }
        if (arrayList2.size() < this.intrinsics.getPlaceholders().size()) {
            int size4 = this.intrinsics.getPlaceholders().size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            for (int i17 = 0; i17 < size4; i17++) {
                arrayList4.add(null);
            }
            arrayList2 = r0.I4(arrayList2, arrayList4);
        }
        this.placeholderRects = arrayList2;
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j11, int i11, int i12, int i13, v vVar) {
        this(multiParagraphIntrinsics, j11, (i13 & 4) != 0 ? Integer.MAX_VALUE : i11, (i13 & 8) != 0 ? TextOverflow.Companion.m5028getClipgIe3tQ8() : i12, (v) null);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j11, int i11, boolean z11, int i12, v vVar) {
        this(multiParagraphIntrinsics, j11, (i12 & 4) != 0 ? Integer.MAX_VALUE : i11, (i12 & 8) != 0 ? false : z11, (v) null);
    }

    private MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j11, int i11, boolean z11) {
        this(multiParagraphIntrinsics, j11, i11, z11 ? TextOverflow.Companion.m5029getEllipsisgIe3tQ8() : TextOverflow.Companion.m5028getClipgIe3tQ8(), (v) null);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, int i11, boolean z11, float f11, int i12, v vVar) {
        this(multiParagraphIntrinsics, (i12 & 2) != 0 ? Integer.MAX_VALUE : i11, (i12 & 4) != 0 ? false : z11, f11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @yz.n(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @yz.w0(expression = "MultiParagraph(intrinsics, Constraints(maxWidth = ceil(width).toInt()), maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MultiParagraph(@m80.k androidx.compose.ui.text.MultiParagraphIntrinsics r14, int r15, boolean r16, float r17) {
        /*
            r13 = this;
            int r1 = androidx.compose.ui.text.ParagraphKt.ceilToInt(r17)
            r4 = 13
            r5 = 0
            r0 = 0
            r2 = 0
            r3 = 0
            long r8 = androidx.compose.ui.unit.ConstraintsKt.Constraints$default(r0, r1, r2, r3, r4, r5)
            androidx.compose.ui.text.style.TextOverflow$Companion r0 = androidx.compose.ui.text.style.TextOverflow.Companion
            if (r16 == 0) goto L18
            int r0 = r0.m5029getEllipsisgIe3tQ8()
        L16:
            r11 = r0
            goto L1d
        L18:
            int r0 = r0.m5028getClipgIe3tQ8()
            goto L16
        L1d:
            r12 = 0
            r6 = r13
            r7 = r14
            r10 = r15
            r6.<init>(r7, r8, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.MultiParagraph.<init>(androidx.compose.ui.text.MultiParagraphIntrinsics, int, boolean, float):void");
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, List list, int i11, boolean z11, float f11, Density density, Font.ResourceLoader resourceLoader, int i12, v vVar) {
        this(annotatedString, textStyle, (List<AnnotatedString.Range<Placeholder>>) ((i12 & 4) != 0 ? h0.J() : list), (i12 & 8) != 0 ? Integer.MAX_VALUE : i11, (i12 & 16) != 0 ? false : z11, f11, density, resourceLoader);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @yz.n(message = "Font.ResourceLoader is deprecated, use fontFamilyResolver instead", replaceWith = @yz.w0(expression = "MultiParagraph(annotatedString, style, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MultiParagraph(@m80.k androidx.compose.ui.text.AnnotatedString r13, @m80.k androidx.compose.ui.text.TextStyle r14, @m80.k java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> r15, int r16, boolean r17, float r18, @m80.k androidx.compose.ui.unit.Density r19, @m80.k androidx.compose.ui.text.font.Font.ResourceLoader r20) {
        /*
            r12 = this;
            androidx.compose.ui.text.MultiParagraphIntrinsics r0 = new androidx.compose.ui.text.MultiParagraphIntrinsics
            androidx.compose.ui.text.font.FontFamily$Resolver r5 = androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(r20)
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r19
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.compose.ui.text.style.TextOverflow$Companion r13 = androidx.compose.ui.text.style.TextOverflow.Companion
            if (r17 == 0) goto L18
            int r13 = r13.m5029getEllipsisgIe3tQ8()
        L16:
            r5 = r13
            goto L1d
        L18:
            int r13 = r13.m5028getClipgIe3tQ8()
            goto L16
        L1d:
            int r7 = androidx.compose.ui.text.ParagraphKt.ceilToInt(r18)
            r10 = 13
            r11 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            long r2 = androidx.compose.ui.unit.ConstraintsKt.Constraints$default(r6, r7, r8, r9, r10, r11)
            r6 = 0
            r4 = r16
            r1 = r0
            r0 = r12
            r0.<init>(r1, r2, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.MultiParagraph.<init>(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.text.TextStyle, java.util.List, int, boolean, float, androidx.compose.ui.unit.Density, androidx.compose.ui.text.font.Font$ResourceLoader):void");
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, float f11, Density density, FontFamily.Resolver resolver, List list, int i11, boolean z11, int i12, v vVar) {
        this(annotatedString, textStyle, f11, density, resolver, (List<AnnotatedString.Range<Placeholder>>) ((i12 & 32) != 0 ? h0.J() : list), (i12 & 64) != 0 ? Integer.MAX_VALUE : i11, (i12 & 128) != 0 ? false : z11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @yz.n(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @yz.w0(expression = "MultiParagraph(annotatedString, style, Constraints(maxWidth = ceil(width).toInt()), density, fontFamilyResolver, placeholders, maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MultiParagraph(@m80.k androidx.compose.ui.text.AnnotatedString r7, @m80.k androidx.compose.ui.text.TextStyle r8, float r9, @m80.k androidx.compose.ui.unit.Density r10, @m80.k androidx.compose.ui.text.font.FontFamily.Resolver r11, @m80.k java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> r12, int r13, boolean r14) {
        /*
            r6 = this;
            androidx.compose.ui.text.MultiParagraphIntrinsics r0 = new androidx.compose.ui.text.MultiParagraphIntrinsics
            r1 = r7
            r2 = r8
            r4 = r10
            r5 = r11
            r3 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r8 = r0
            androidx.compose.ui.text.style.TextOverflow$Companion r7 = androidx.compose.ui.text.style.TextOverflow.Companion
            if (r14 == 0) goto L15
            int r7 = r7.m5029getEllipsisgIe3tQ8()
        L13:
            r12 = r7
            goto L1a
        L15:
            int r7 = r7.m5028getClipgIe3tQ8()
            goto L13
        L1a:
            int r1 = androidx.compose.ui.text.ParagraphKt.ceilToInt(r9)
            r4 = 13
            r5 = 0
            r0 = 0
            r2 = 0
            r3 = 0
            long r9 = androidx.compose.ui.unit.ConstraintsKt.Constraints$default(r0, r1, r2, r3, r4, r5)
            r11 = r13
            r13 = 0
            r7 = r6
            r7.<init>(r8, r9, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.MultiParagraph.<init>(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.text.TextStyle, float, androidx.compose.ui.unit.Density, androidx.compose.ui.text.font.FontFamily$Resolver, java.util.List, int, boolean):void");
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j11, Density density, FontFamily.Resolver resolver, List list, int i11, boolean z11, int i12, v vVar) {
        this(annotatedString, textStyle, j11, density, resolver, (i12 & 32) != 0 ? h0.J() : list, (i12 & 64) != 0 ? Integer.MAX_VALUE : i11, (i12 & 128) != 0 ? false : z11, (v) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private MultiParagraph(androidx.compose.ui.text.AnnotatedString r7, androidx.compose.ui.text.TextStyle r8, long r9, androidx.compose.ui.unit.Density r11, androidx.compose.ui.text.font.FontFamily.Resolver r12, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> r13, int r14, boolean r15) {
        /*
            r6 = this;
            androidx.compose.ui.text.MultiParagraphIntrinsics r0 = new androidx.compose.ui.text.MultiParagraphIntrinsics
            r1 = r7
            r2 = r8
            r4 = r11
            r5 = r12
            r3 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            r8 = r0
            androidx.compose.ui.text.style.TextOverflow$Companion r7 = androidx.compose.ui.text.style.TextOverflow.Companion
            if (r15 == 0) goto L15
            int r7 = r7.m5029getEllipsisgIe3tQ8()
        L13:
            r12 = r7
            goto L1a
        L15:
            int r7 = r7.m5028getClipgIe3tQ8()
            goto L13
        L1a:
            r13 = 0
            r7 = r6
            r11 = r14
            r7.<init>(r8, r9, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.MultiParagraph.<init>(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.text.TextStyle, long, androidx.compose.ui.unit.Density, androidx.compose.ui.text.font.FontFamily$Resolver, java.util.List, int, boolean):void");
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j11, Density density, FontFamily.Resolver resolver, List list, int i11, int i12, int i13, v vVar) {
        this(annotatedString, textStyle, j11, density, resolver, (i13 & 32) != 0 ? h0.J() : list, (i13 & 64) != 0 ? Integer.MAX_VALUE : i11, (i13 & 128) != 0 ? TextOverflow.Companion.m5028getClipgIe3tQ8() : i12, (v) null);
    }

    private MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j11, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, int i11, int i12) {
        this(new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver), j11, i11, i12, (v) null);
    }
}
