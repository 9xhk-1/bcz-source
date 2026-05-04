package androidx.compose.foundation.text.modifiers;

import a00.h0;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.foundation.text.modifiers.MinLinesConstrainer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import g10.u;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nMultiParagraphLayoutCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,498:1\n1#2:499\n30#3:500\n80#4:501\n*S KotlinDebug\n*F\n+ 1 MultiParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache\n*L\n235#1:500\n235#1:501\n*E\n"})
/* loaded from: classes.dex */
public final class MultiParagraphLayoutCache {
    public static final int $stable = 8;

    @l
    private TextAutoSizeLayoutScopeImpl _textAutoSizeLayoutScope;

    @l
    private TextAutoSize autoSize;
    private int cachedIntrinsicHeight;
    private int cachedIntrinsicHeightInputWidth;

    @l
    private Density density;

    @k
    private FontFamily.Resolver fontFamilyResolver;

    @l
    private LayoutDirection intrinsicsLayoutDirection;
    private long lastDensity;

    @l
    private TextLayoutResult layoutCache;

    @l
    private MinLinesConstrainer mMinLinesConstrainer;
    private int maxLines;
    private int minLines;
    private int overflow;

    @l
    private MultiParagraphIntrinsics paragraphIntrinsics;

    @l
    private List<AnnotatedString.Range<Placeholder>> placeholders;
    private boolean softWrap;

    @k
    private TextStyle style;

    @k
    private AnnotatedString text;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class TextAutoSizeLayoutScopeImpl implements TextAutoSizeLayoutScope {

        @l
        private TextLayoutResult lastLayoutResult;

        public TextAutoSizeLayoutScopeImpl() {
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            Density density$foundation_release = MultiParagraphLayoutCache.this.getDensity$foundation_release();
            g0.m(density$foundation_release);
            return density$foundation_release.getDensity();
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            Density density$foundation_release = MultiParagraphLayoutCache.this.getDensity$foundation_release();
            g0.m(density$foundation_release);
            return density$foundation_release.getFontScale();
        }

        @l
        public final TextLayoutResult getLastLayoutResult() {
            return this.lastLayoutResult;
        }

        @Override // androidx.compose.foundation.text.modifiers.TextAutoSizeLayoutScope
        @k
        /* renamed from: performLayout-5ZSfY2I, reason: not valid java name */
        public TextLayoutResult mo1412performLayout5ZSfY2I(long j11, @k AnnotatedString annotatedString, long j12) {
            long j13;
            long j14;
            long m1414timesNB67dxo;
            TextStyle textStyle = MultiParagraphLayoutCache.this.style;
            if (TextUnit.m5311isEmimpl(j12)) {
                m1414timesNB67dxo = MultiParagraphLayoutCacheKt.m1414timesNB67dxo(MultiParagraphLayoutCache.this.style.m4590getFontSizeXSAIIZE(), j12);
                j13 = m1414timesNB67dxo;
            } else {
                j13 = j12;
            }
            if (!TextUnit.m5306equalsimpl0(j13, MultiParagraphLayoutCache.this.style.m4590getFontSizeXSAIIZE())) {
                MultiParagraphLayoutCache multiParagraphLayoutCache = MultiParagraphLayoutCache.this;
                multiParagraphLayoutCache.setStyle(TextStyle.m4572copyp1EtxEg$default(multiParagraphLayoutCache.style, 0L, j13, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null));
            }
            if (MultiParagraphLayoutCache.this.minLines > 1) {
                MultiParagraphLayoutCache multiParagraphLayoutCache2 = MultiParagraphLayoutCache.this;
                LayoutDirection layoutDirection = multiParagraphLayoutCache2.intrinsicsLayoutDirection;
                g0.m(layoutDirection);
                j14 = multiParagraphLayoutCache2.m1409useMinLinesConstrainerOh53vG4(j11, layoutDirection);
            } else {
                j14 = j11;
            }
            MultiParagraphLayoutCache multiParagraphLayoutCache3 = MultiParagraphLayoutCache.this;
            LayoutDirection layoutDirection2 = multiParagraphLayoutCache3.intrinsicsLayoutDirection;
            g0.m(layoutDirection2);
            MultiParagraph m1405layoutTextR2G3SPE = multiParagraphLayoutCache3.m1405layoutTextR2G3SPE(j14, layoutDirection2, TextOverflow.Companion.m5028getClipgIe3tQ8());
            MultiParagraphLayoutCache multiParagraphLayoutCache4 = MultiParagraphLayoutCache.this;
            LayoutDirection layoutDirection3 = multiParagraphLayoutCache4.intrinsicsLayoutDirection;
            g0.m(layoutDirection3);
            TextLayoutResult m1408textLayoutResultVKLhPVY = multiParagraphLayoutCache4.m1408textLayoutResultVKLhPVY(layoutDirection3, j14, m1405layoutTextR2G3SPE);
            this.lastLayoutResult = m1408textLayoutResultVKLhPVY;
            MultiParagraphLayoutCache.this.setStyle(textStyle);
            return m1408textLayoutResultVKLhPVY;
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx--R2X_6o */
        public float mo376toPxR2X_6o(long j11) {
            if (!TextUnit.m5311isEmimpl(j11)) {
                return mo377toPx0680j_4(mo372toDpGaN1DYA(j11));
            }
            if (TextUnit.m5311isEmimpl(MultiParagraphLayoutCache.this.style.m4590getFontSizeXSAIIZE())) {
                throw new IllegalStateException("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is Em\nDeclare the composable's style.fontSize with Sp units instead.");
            }
            if (TextUnit.m5306equalsimpl0(MultiParagraphLayoutCache.this.style.m4590getFontSizeXSAIIZE(), TextUnit.Companion.m5320getUnspecifiedXSAIIZE())) {
                throw new IllegalStateException("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is not set. Please specify a font size.");
            }
            return mo376toPxR2X_6o(MultiParagraphLayoutCache.this.style.m4590getFontSizeXSAIIZE()) * TextUnit.m5309getValueimpl(j11);
        }
    }

    public /* synthetic */ MultiParagraphLayoutCache(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i11, boolean z11, int i12, int i13, List list, TextAutoSize textAutoSize, v vVar) {
        this(annotatedString, textStyle, resolver, i11, z11, i12, i13, list, textAutoSize);
    }

    private final TextAutoSizeLayoutScopeImpl getFontSizeSearchScope() {
        if (this._textAutoSizeLayoutScope == null) {
            this._textAutoSizeLayoutScope = new TextAutoSizeLayoutScopeImpl();
        }
        TextAutoSizeLayoutScopeImpl textAutoSizeLayoutScopeImpl = this._textAutoSizeLayoutScope;
        g0.m(textAutoSizeLayoutScopeImpl);
        return textAutoSizeLayoutScopeImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: layoutText-R2G3SPE, reason: not valid java name */
    public final MultiParagraph m1405layoutTextR2G3SPE(long j11, LayoutDirection layoutDirection, int i11) {
        MultiParagraphIntrinsics layoutDirection2 = setLayoutDirection(layoutDirection);
        return new MultiParagraph(layoutDirection2, LayoutUtilsKt.m1396finalConstraintstfFHcEY(j11, this.softWrap, i11, layoutDirection2.getMaxIntrinsicWidth()), LayoutUtilsKt.m1397finalMaxLinesxdlQI24(this.softWrap, i11, this.maxLines), i11, (v) null);
    }

    /* renamed from: layoutText-R2G3SPE$default, reason: not valid java name */
    public static /* synthetic */ MultiParagraph m1406layoutTextR2G3SPE$default(MultiParagraphLayoutCache multiParagraphLayoutCache, long j11, LayoutDirection layoutDirection, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = multiParagraphLayoutCache.overflow;
        }
        return multiParagraphLayoutCache.m1405layoutTextR2G3SPE(j11, layoutDirection, i11);
    }

    private final void markDirty() {
        this.paragraphIntrinsics = null;
        this.layoutCache = null;
        this.cachedIntrinsicHeight = -1;
        this.cachedIntrinsicHeightInputWidth = -1;
        this._textAutoSizeLayoutScope = null;
    }

    private final void markStyleAffectedDirty() {
        this.paragraphIntrinsics = null;
        this.layoutCache = null;
        this.cachedIntrinsicHeight = -1;
        this.cachedIntrinsicHeightInputWidth = -1;
    }

    /* renamed from: newLayoutWillBeDifferent-VKLhPVY, reason: not valid java name */
    private final boolean m1407newLayoutWillBeDifferentVKLhPVY(TextLayoutResult textLayoutResult, long j11, LayoutDirection layoutDirection) {
        if (textLayoutResult == null || textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts() || layoutDirection != textLayoutResult.getLayoutInput().getLayoutDirection()) {
            return true;
        }
        if (Constraints.m5061equalsimpl0(j11, textLayoutResult.getLayoutInput().m4525getConstraintsmsEJaDk())) {
            return false;
        }
        return Constraints.m5068getMaxWidthimpl(j11) != Constraints.m5068getMaxWidthimpl(textLayoutResult.getLayoutInput().m4525getConstraintsmsEJaDk()) || ((float) Constraints.m5067getMaxHeightimpl(j11)) < textLayoutResult.getMultiParagraph().getHeight() || textLayoutResult.getMultiParagraph().getDidExceedMaxLines();
    }

    private final MultiParagraphIntrinsics setLayoutDirection(LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics == null || layoutDirection != this.intrinsicsLayoutDirection || multiParagraphIntrinsics.getHasStaleResolvedFonts()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            AnnotatedString annotatedString = this.text;
            TextStyle resolveDefaults = TextStyleKt.resolveDefaults(this.style, layoutDirection);
            Density density = this.density;
            g0.m(density);
            FontFamily.Resolver resolver = this.fontFamilyResolver;
            List<AnnotatedString.Range<Placeholder>> list = this.placeholders;
            if (list == null) {
                list = h0.J();
            }
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, resolveDefaults, list, density, resolver);
        }
        this.paragraphIntrinsics = multiParagraphIntrinsics;
        return multiParagraphIntrinsics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setStyle(TextStyle textStyle) {
        boolean hasSameLayoutAffectingAttributes = textStyle.hasSameLayoutAffectingAttributes(this.style);
        this.style = textStyle;
        if (hasSameLayoutAffectingAttributes) {
            return;
        }
        markStyleAffectedDirty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: textLayoutResult-VKLhPVY, reason: not valid java name */
    public final TextLayoutResult m1408textLayoutResultVKLhPVY(LayoutDirection layoutDirection, long j11, MultiParagraph multiParagraph) {
        float min = Math.min(multiParagraph.getIntrinsics().getMaxIntrinsicWidth(), multiParagraph.getWidth());
        AnnotatedString annotatedString = this.text;
        TextStyle textStyle = this.style;
        List<AnnotatedString.Range<Placeholder>> list = this.placeholders;
        if (list == null) {
            list = h0.J();
        }
        int i11 = this.maxLines;
        boolean z11 = this.softWrap;
        int i12 = this.overflow;
        Density density = this.density;
        g0.m(density);
        return new TextLayoutResult(new TextLayoutInput(annotatedString, textStyle, list, i11, z11, i12, density, layoutDirection, this.fontFamilyResolver, j11, (v) null), multiParagraph, ConstraintsKt.m5082constrain4WqzIAM(j11, IntSize.m5281constructorimpl((TextDelegateKt.ceilToIntPx(min) << 32) | (TextDelegateKt.ceilToIntPx(multiParagraph.getHeight()) & 4294967295L))), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: useMinLinesConstrainer-Oh53vG4, reason: not valid java name */
    public final long m1409useMinLinesConstrainerOh53vG4(long j11, LayoutDirection layoutDirection) {
        MinLinesConstrainer.Companion companion = MinLinesConstrainer.Companion;
        MinLinesConstrainer minLinesConstrainer = this.mMinLinesConstrainer;
        TextStyle textStyle = this.style;
        Density density = this.density;
        g0.m(density);
        MinLinesConstrainer from = companion.from(minLinesConstrainer, layoutDirection, textStyle, density, this.fontFamilyResolver);
        this.mMinLinesConstrainer = from;
        return from.m1400coerceMinLinesOh53vG4$foundation_release(j11, this.minLines);
    }

    @l
    public final Density getDensity$foundation_release() {
        return this.density;
    }

    @l
    public final TextLayoutResult getLayoutOrNull() {
        return this.layoutCache;
    }

    @k
    public final TextLayoutResult getTextLayoutResult() {
        TextLayoutResult textLayoutResult = this.layoutCache;
        if (textLayoutResult != null) {
            return textLayoutResult;
        }
        throw new IllegalStateException("You must call layoutWithConstraints first");
    }

    public final int intrinsicHeight(int i11, @k LayoutDirection layoutDirection) {
        int i12 = this.cachedIntrinsicHeightInputWidth;
        int i13 = this.cachedIntrinsicHeight;
        if (i11 == i12 && i12 != -1) {
            return i13;
        }
        long Constraints = ConstraintsKt.Constraints(0, i11, 0, Integer.MAX_VALUE);
        if (this.minLines > 1) {
            Constraints = m1409useMinLinesConstrainerOh53vG4(Constraints, layoutDirection);
        }
        long j11 = Constraints;
        int u11 = u.u(TextDelegateKt.ceilToIntPx(m1406layoutTextR2G3SPE$default(this, j11, layoutDirection, 0, 4, null).getHeight()), Constraints.m5069getMinHeightimpl(j11));
        this.cachedIntrinsicHeightInputWidth = i11;
        this.cachedIntrinsicHeight = u11;
        return u11;
    }

    /* renamed from: layoutWithConstraints-K40F9xA, reason: not valid java name */
    public final boolean m1410layoutWithConstraintsK40F9xA(long j11, @k LayoutDirection layoutDirection) {
        long m1409useMinLinesConstrainerOh53vG4 = this.minLines > 1 ? m1409useMinLinesConstrainerOh53vG4(j11, layoutDirection) : j11;
        if (!m1407newLayoutWillBeDifferentVKLhPVY(this.layoutCache, m1409useMinLinesConstrainerOh53vG4, layoutDirection)) {
            TextLayoutResult textLayoutResult = this.layoutCache;
            g0.m(textLayoutResult);
            if (Constraints.m5061equalsimpl0(m1409useMinLinesConstrainerOh53vG4, textLayoutResult.getLayoutInput().m4525getConstraintsmsEJaDk())) {
                return false;
            }
            TextLayoutResult textLayoutResult2 = this.layoutCache;
            g0.m(textLayoutResult2);
            this.layoutCache = m1408textLayoutResultVKLhPVY(layoutDirection, m1409useMinLinesConstrainerOh53vG4, textLayoutResult2.getMultiParagraph());
            return true;
        }
        if (this.autoSize != null) {
            this.intrinsicsLayoutDirection = layoutDirection;
            long m4590getFontSizeXSAIIZE = this.style.m4590getFontSizeXSAIIZE();
            TextAutoSize textAutoSize = this.autoSize;
            g0.m(textAutoSize);
            long mo1023getFontSizeCi0_558 = textAutoSize.mo1023getFontSizeCi0_558(getFontSizeSearchScope(), j11, this.text);
            if (TextUnit.m5311isEmimpl(mo1023getFontSizeCi0_558)) {
                mo1023getFontSizeCi0_558 = MultiParagraphLayoutCacheKt.m1414timesNB67dxo(m4590getFontSizeXSAIIZE, mo1023getFontSizeCi0_558);
            }
            long j12 = mo1023getFontSizeCi0_558;
            TextLayoutResult lastLayoutResult = getFontSizeSearchScope().getLastLayoutResult();
            if (lastLayoutResult != null && TextUnit.m5306equalsimpl0(j12, lastLayoutResult.getLayoutInput().getStyle().m4590getFontSizeXSAIIZE()) && TextOverflow.m5019equalsimpl0(lastLayoutResult.getLayoutInput().m4526getOverflowgIe3tQ8(), this.overflow)) {
                this.layoutCache = lastLayoutResult;
                return true;
            }
            setStyle(TextStyle.m4572copyp1EtxEg$default(this.style, 0L, j12, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null));
        }
        this.layoutCache = m1408textLayoutResultVKLhPVY(layoutDirection, m1409useMinLinesConstrainerOh53vG4, m1406layoutTextR2G3SPE$default(this, m1409useMinLinesConstrainerOh53vG4, layoutDirection, 0, 4, null));
        return true;
    }

    public final int maxIntrinsicWidth(@k LayoutDirection layoutDirection) {
        return TextDelegateKt.ceilToIntPx(setLayoutDirection(layoutDirection).getMaxIntrinsicWidth());
    }

    public final int minIntrinsicWidth(@k LayoutDirection layoutDirection) {
        return TextDelegateKt.ceilToIntPx(setLayoutDirection(layoutDirection).getMinIntrinsicWidth());
    }

    public final void setDensity$foundation_release(@l Density density) {
        Density density2 = this.density;
        long m1387constructorimpl = density != null ? InlineDensity.m1387constructorimpl(density) : InlineDensity.Companion.m1395getUnspecifiedL26CHvs();
        if (density2 == null) {
            this.density = density;
            this.lastDensity = m1387constructorimpl;
        } else if (density == null || !InlineDensity.m1389equalsimpl0(this.lastDensity, m1387constructorimpl)) {
            this.density = density;
            this.lastDensity = m1387constructorimpl;
            markDirty();
        }
    }

    /* renamed from: update-J2qo7bo, reason: not valid java name */
    public final void m1411updateJ2qo7bo(@k AnnotatedString annotatedString, @k TextStyle textStyle, @k FontFamily.Resolver resolver, int i11, boolean z11, int i12, int i13, @l List<AnnotatedString.Range<Placeholder>> list, @l TextAutoSize textAutoSize) {
        this.text = annotatedString;
        setStyle(textStyle);
        this.fontFamilyResolver = resolver;
        this.overflow = i11;
        this.softWrap = z11;
        this.maxLines = i12;
        this.minLines = i13;
        this.placeholders = list;
        this.autoSize = textAutoSize;
        markDirty();
    }

    private MultiParagraphLayoutCache(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i11, boolean z11, int i12, int i13, List<AnnotatedString.Range<Placeholder>> list, TextAutoSize textAutoSize) {
        this.text = annotatedString;
        this.fontFamilyResolver = resolver;
        this.overflow = i11;
        this.softWrap = z11;
        this.maxLines = i12;
        this.minLines = i13;
        this.placeholders = list;
        this.autoSize = textAutoSize;
        this.lastDensity = InlineDensity.Companion.m1395getUnspecifiedL26CHvs();
        this.style = textStyle;
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
    }

    public /* synthetic */ MultiParagraphLayoutCache(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i11, boolean z11, int i12, int i13, List list, TextAutoSize textAutoSize, int i14, v vVar) {
        this(annotatedString, textStyle, resolver, (i14 & 8) != 0 ? TextOverflow.Companion.m5028getClipgIe3tQ8() : i11, (i14 & 16) != 0 ? true : z11, (i14 & 32) != 0 ? Integer.MAX_VALUE : i12, (i14 & 64) != 0 ? 1 : i13, (i14 & 128) != 0 ? null : list, (i14 & 256) != 0 ? null : textAutoSize, null);
    }
}
