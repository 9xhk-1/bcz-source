package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nTextLayoutResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutResult.kt\nandroidx/compose/ui/text/TextLayoutResult\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,580:1\n59#2:581\n54#2:583\n90#3:582\n85#3:584\n*S KotlinDebug\n*F\n+ 1 TextLayoutResult.kt\nandroidx/compose/ui/text/TextLayoutResult\n*L\n313#1:581\n317#1:583\n313#1:582\n317#1:584\n*E\n"})
/* loaded from: classes2.dex */
public final class TextLayoutResult {
    public static final int $stable = 8;
    private final float firstBaseline;
    private final float lastBaseline;

    @k
    private final TextLayoutInput layoutInput;

    @k
    private final MultiParagraph multiParagraph;

    @k
    private final List<Rect> placeholderRects;
    private final long size;

    public /* synthetic */ TextLayoutResult(TextLayoutInput textLayoutInput, MultiParagraph multiParagraph, long j11, v vVar) {
        this(textLayoutInput, multiParagraph, j11);
    }

    /* renamed from: copy-O0kMr_c$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m4527copyO0kMr_c$default(TextLayoutResult textLayoutResult, TextLayoutInput textLayoutInput, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textLayoutInput = textLayoutResult.layoutInput;
        }
        if ((i11 & 2) != 0) {
            j11 = textLayoutResult.size;
        }
        return textLayoutResult.m4528copyO0kMr_c(textLayoutInput, j11);
    }

    public static /* synthetic */ int getLineEnd$default(TextLayoutResult textLayoutResult, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        return textLayoutResult.getLineEnd(i11, z11);
    }

    @k
    /* renamed from: copy-O0kMr_c, reason: not valid java name */
    public final TextLayoutResult m4528copyO0kMr_c(@k TextLayoutInput textLayoutInput, long j11) {
        return new TextLayoutResult(textLayoutInput, this.multiParagraph, j11, null);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextLayoutResult)) {
            return false;
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
        return g0.g(this.layoutInput, textLayoutResult.layoutInput) && g0.g(this.multiParagraph, textLayoutResult.multiParagraph) && IntSize.m5284equalsimpl0(this.size, textLayoutResult.size) && this.firstBaseline == textLayoutResult.firstBaseline && this.lastBaseline == textLayoutResult.lastBaseline && g0.g(this.placeholderRects, textLayoutResult.placeholderRects);
    }

    @k
    public final ResolvedTextDirection getBidiRunDirection(int i11) {
        return this.multiParagraph.getBidiRunDirection(i11);
    }

    @k
    public final Rect getBoundingBox(int i11) {
        return this.multiParagraph.getBoundingBox(i11);
    }

    @k
    public final Rect getCursorRect(int i11) {
        return this.multiParagraph.getCursorRect(i11);
    }

    public final boolean getDidOverflowHeight() {
        return this.multiParagraph.getDidExceedMaxLines() || ((float) ((int) (this.size & 4294967295L))) < this.multiParagraph.getHeight();
    }

    public final boolean getDidOverflowWidth() {
        return ((float) ((int) (this.size >> 32))) < this.multiParagraph.getWidth();
    }

    public final float getFirstBaseline() {
        return this.firstBaseline;
    }

    public final boolean getHasVisualOverflow() {
        return getDidOverflowWidth() || getDidOverflowHeight();
    }

    public final float getHorizontalPosition(int i11, boolean z11) {
        return this.multiParagraph.getHorizontalPosition(i11, z11);
    }

    public final float getLastBaseline() {
        return this.lastBaseline;
    }

    @k
    public final TextLayoutInput getLayoutInput() {
        return this.layoutInput;
    }

    public final float getLineBaseline(int i11) {
        return this.multiParagraph.getLineBaseline(i11);
    }

    public final float getLineBottom(int i11) {
        return this.multiParagraph.getLineBottom(i11);
    }

    public final int getLineCount() {
        return this.multiParagraph.getLineCount();
    }

    public final int getLineEnd(int i11, boolean z11) {
        return this.multiParagraph.getLineEnd(i11, z11);
    }

    public final int getLineForOffset(int i11) {
        return this.multiParagraph.getLineForOffset(i11);
    }

    public final int getLineForVerticalPosition(float f11) {
        return this.multiParagraph.getLineForVerticalPosition(f11);
    }

    public final float getLineLeft(int i11) {
        return this.multiParagraph.getLineLeft(i11);
    }

    public final float getLineRight(int i11) {
        return this.multiParagraph.getLineRight(i11);
    }

    public final int getLineStart(int i11) {
        return this.multiParagraph.getLineStart(i11);
    }

    public final float getLineTop(int i11) {
        return this.multiParagraph.getLineTop(i11);
    }

    @k
    public final MultiParagraph getMultiParagraph() {
        return this.multiParagraph;
    }

    /* renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public final int m4529getOffsetForPositionk4lQ0M(long j11) {
        return this.multiParagraph.m4410getOffsetForPositionk4lQ0M(j11);
    }

    @k
    public final ResolvedTextDirection getParagraphDirection(int i11) {
        return this.multiParagraph.getParagraphDirection(i11);
    }

    @k
    public final Path getPathForRange(int i11, int i12) {
        return this.multiParagraph.getPathForRange(i11, i12);
    }

    @k
    public final List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m4530getSizeYbymL2g() {
        return this.size;
    }

    /* renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public final long m4531getWordBoundaryjx7JFs(int i11) {
        return this.multiParagraph.m4412getWordBoundaryjx7JFs(i11);
    }

    public int hashCode() {
        return (((((((((this.layoutInput.hashCode() * 31) + this.multiParagraph.hashCode()) * 31) + IntSize.m5287hashCodeimpl(this.size)) * 31) + Float.hashCode(this.firstBaseline)) * 31) + Float.hashCode(this.lastBaseline)) * 31) + this.placeholderRects.hashCode();
    }

    public final boolean isLineEllipsized(int i11) {
        return this.multiParagraph.isLineEllipsized(i11);
    }

    @k
    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.layoutInput + ", multiParagraph=" + this.multiParagraph + ", size=" + ((Object) IntSize.m5289toStringimpl(this.size)) + ", firstBaseline=" + this.firstBaseline + ", lastBaseline=" + this.lastBaseline + ", placeholderRects=" + this.placeholderRects + ')';
    }

    private TextLayoutResult(TextLayoutInput textLayoutInput, MultiParagraph multiParagraph, long j11) {
        this.layoutInput = textLayoutInput;
        this.multiParagraph = multiParagraph;
        this.size = j11;
        this.firstBaseline = multiParagraph.getFirstBaseline();
        this.lastBaseline = multiParagraph.getLastBaseline();
        this.placeholderRects = multiParagraph.getPlaceholderRects();
    }
}
