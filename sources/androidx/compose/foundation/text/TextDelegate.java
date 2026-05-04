package androidx.compose.foundation.text;

import a00.h0;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import g10.u;
import java.util.List;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@u0({"SMAP\nTextDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextDelegate.kt\nandroidx/compose/foundation/text/TextDelegate\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,356:1\n96#2,5:357\n96#2,5:362\n96#2,5:367\n30#3:372\n30#3:374\n80#4:373\n80#4:375\n*S KotlinDebug\n*F\n+ 1 TextDelegate.kt\nandroidx/compose/foundation/text/TextDelegate\n*L\n116#1:357,5\n117#1:362,5\n118#1:367,5\n252#1:372\n265#1:374\n252#1:373\n265#1:375\n*E\n"})
/* loaded from: classes.dex */
public final class TextDelegate {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private final Density density;

    @k
    private final FontFamily.Resolver fontFamilyResolver;

    @l
    private LayoutDirection intrinsicsLayoutDirection;
    private final int maxLines;
    private final int minLines;
    private final int overflow;

    @l
    private MultiParagraphIntrinsics paragraphIntrinsics;

    @k
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private final boolean softWrap;

    @k
    private final TextStyle style;

    @k
    private final AnnotatedString text;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        public final void paint(@k Canvas canvas, @k TextLayoutResult textLayoutResult) {
            TextPainter.INSTANCE.paint(canvas, textLayoutResult);
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i11, int i12, boolean z11, int i13, Density density, FontFamily.Resolver resolver, List list, v vVar) {
        this(annotatedString, textStyle, i11, i12, z11, i13, density, resolver, list);
    }

    private final MultiParagraphIntrinsics getNonNullIntrinsics() {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics != null) {
            return multiParagraphIntrinsics;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    /* renamed from: layout-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m1126layoutNN6EwU$default(TextDelegate textDelegate, long j11, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            textLayoutResult = null;
        }
        return textDelegate.m1129layoutNN6EwU(j11, layoutDirection, textLayoutResult);
    }

    /* renamed from: layoutText-K40F9xA, reason: not valid java name */
    private final MultiParagraph m1127layoutTextK40F9xA(long j11, LayoutDirection layoutDirection) {
        layoutIntrinsics(layoutDirection);
        int m5070getMinWidthimpl = Constraints.m5070getMinWidthimpl(j11);
        int m5068getMaxWidthimpl = ((this.softWrap || TextOverflow.m5019equalsimpl0(this.overflow, TextOverflow.Companion.m5029getEllipsisgIe3tQ8())) && Constraints.m5064getHasBoundedWidthimpl(j11)) ? Constraints.m5068getMaxWidthimpl(j11) : Integer.MAX_VALUE;
        int i11 = (this.softWrap || !TextOverflow.m5019equalsimpl0(this.overflow, TextOverflow.Companion.m5029getEllipsisgIe3tQ8())) ? this.maxLines : 1;
        if (m5070getMinWidthimpl != m5068getMaxWidthimpl) {
            m5068getMaxWidthimpl = u.I(getMaxIntrinsicWidth(), m5070getMinWidthimpl, m5068getMaxWidthimpl);
        }
        return new MultiParagraph(getNonNullIntrinsics(), Constraints.Companion.m5077fitPrioritizingWidthZbe2FdA(0, m5068getMaxWidthimpl, 0, Constraints.m5067getMaxHeightimpl(j11)), i11, this.overflow, (v) null);
    }

    @k
    public final Density getDensity() {
        return this.density;
    }

    @k
    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    @l
    public final LayoutDirection getIntrinsicsLayoutDirection$foundation_release() {
        return this.intrinsicsLayoutDirection;
    }

    public final int getMaxIntrinsicWidth() {
        return TextDelegateKt.ceilToIntPx(getNonNullIntrinsics().getMaxIntrinsicWidth());
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final int getMinIntrinsicWidth() {
        return TextDelegateKt.ceilToIntPx(getNonNullIntrinsics().getMinIntrinsicWidth());
    }

    public final int getMinLines() {
        return this.minLines;
    }

    /* renamed from: getOverflow-gIe3tQ8, reason: not valid java name */
    public final int m1128getOverflowgIe3tQ8() {
        return this.overflow;
    }

    @l
    public final MultiParagraphIntrinsics getParagraphIntrinsics$foundation_release() {
        return this.paragraphIntrinsics;
    }

    @k
    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    @k
    public final TextStyle getStyle() {
        return this.style;
    }

    @k
    public final AnnotatedString getText() {
        return this.text;
    }

    @k
    /* renamed from: layout-NN6Ew-U, reason: not valid java name */
    public final TextLayoutResult m1129layoutNN6EwU(long j11, @k LayoutDirection layoutDirection, @l TextLayoutResult textLayoutResult) {
        if (textLayoutResult != null && TextLayoutHelperKt.m1162canReuse7_7YC6M(textLayoutResult, this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, j11)) {
            return textLayoutResult.m4528copyO0kMr_c(new TextLayoutInput(textLayoutResult.getLayoutInput().getText(), this.style, textLayoutResult.getLayoutInput().getPlaceholders(), textLayoutResult.getLayoutInput().getMaxLines(), textLayoutResult.getLayoutInput().getSoftWrap(), textLayoutResult.getLayoutInput().m4526getOverflowgIe3tQ8(), textLayoutResult.getLayoutInput().getDensity(), textLayoutResult.getLayoutInput().getLayoutDirection(), textLayoutResult.getLayoutInput().getFontFamilyResolver(), j11, (v) null), ConstraintsKt.m5082constrain4WqzIAM(j11, IntSize.m5281constructorimpl((TextDelegateKt.ceilToIntPx(textLayoutResult.getMultiParagraph().getHeight()) & 4294967295L) | (TextDelegateKt.ceilToIntPx(textLayoutResult.getMultiParagraph().getWidth()) << 32))));
        }
        return new TextLayoutResult(new TextLayoutInput(this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, j11, (v) null), m1127layoutTextK40F9xA(j11, layoutDirection), ConstraintsKt.m5082constrain4WqzIAM(j11, IntSize.m5281constructorimpl((TextDelegateKt.ceilToIntPx(r14.getHeight()) & 4294967295L) | (TextDelegateKt.ceilToIntPx(r14.getWidth()) << 32))), null);
    }

    public final void layoutIntrinsics(@k LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics == null || layoutDirection != this.intrinsicsLayoutDirection || multiParagraphIntrinsics.getHasStaleResolvedFonts()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(this.text, TextStyleKt.resolveDefaults(this.style, layoutDirection), this.placeholders, this.density, this.fontFamilyResolver);
        }
        this.paragraphIntrinsics = multiParagraphIntrinsics;
    }

    public final void setIntrinsicsLayoutDirection$foundation_release(@l LayoutDirection layoutDirection) {
        this.intrinsicsLayoutDirection = layoutDirection;
    }

    public final void setParagraphIntrinsics$foundation_release(@l MultiParagraphIntrinsics multiParagraphIntrinsics) {
        this.paragraphIntrinsics = multiParagraphIntrinsics;
    }

    private TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i11, int i12, boolean z11, int i13, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list) {
        this.text = annotatedString;
        this.style = textStyle;
        this.maxLines = i11;
        this.minLines = i12;
        this.softWrap = z11;
        this.overflow = i13;
        this.density = density;
        this.fontFamilyResolver = resolver;
        this.placeholders = list;
        if (!(i11 > 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("no maxLines");
        }
        if (!(i12 > 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("no minLines");
        }
        if (i12 <= i11) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("minLines greater than maxLines");
    }

    public /* synthetic */ TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i11, int i12, boolean z11, int i13, Density density, FontFamily.Resolver resolver, List list, int i14, v vVar) {
        this(annotatedString, textStyle, (i14 & 4) != 0 ? Integer.MAX_VALUE : i11, (i14 & 8) != 0 ? 1 : i12, (i14 & 16) != 0 ? true : z11, (i14 & 32) != 0 ? TextOverflow.Companion.m5028getClipgIe3tQ8() : i13, density, resolver, (i14 & 256) != 0 ? h0.J() : list, null);
    }
}
