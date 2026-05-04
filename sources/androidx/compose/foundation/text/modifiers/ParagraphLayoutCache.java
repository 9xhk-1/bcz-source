package androidx.compose.foundation.text.modifiers;

import a00.h0;
import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.foundation.text.modifiers.MinLinesConstrainer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.ParagraphIntrinsicsKt;
import androidx.compose.ui.text.ParagraphKt;
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
import g10.u;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nParagraphLayoutCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/ParagraphLayoutCache\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 6 Constraints.kt\nandroidx/compose/ui/unit/Constraints\n*L\n1#1,380:1\n30#2:381\n30#2:384\n30#2:390\n30#2:396\n80#3:382\n80#3:385\n85#3:387\n90#3:389\n80#3:391\n85#3:393\n90#3:395\n80#3:397\n1#4:383\n54#5:386\n59#5:388\n54#5:392\n59#5:394\n202#6:398\n*S KotlinDebug\n*F\n+ 1 ParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/ParagraphLayoutCache\n*L\n96#1:381\n136#1:384\n153#1:390\n316#1:396\n96#1:382\n136#1:385\n141#1:387\n142#1:389\n153#1:391\n158#1:393\n158#1:395\n316#1:397\n141#1:386\n142#1:388\n158#1:392\n158#1:394\n334#1:398\n*E\n"})
/* loaded from: classes.dex */
public final class ParagraphLayoutCache {
    public static final int $stable = 8;
    private int cachedIntrinsicHeight;
    private int cachedIntrinsicHeightInputWidth;

    @l
    private Density density;
    private boolean didOverflow;

    @k
    private FontFamily.Resolver fontFamilyResolver;

    @l
    private LayoutDirection intrinsicsLayoutDirection;
    private long lastDensity;
    private long layoutSize;

    @l
    private MinLinesConstrainer mMinLinesConstrainer;
    private int maxLines;
    private int minLines;
    private int overflow;

    @l
    private Paragraph paragraph;

    @l
    private ParagraphIntrinsics paragraphIntrinsics;
    private long prevConstraints;
    private boolean softWrap;

    @k
    private TextStyle style;

    @k
    private String text;

    public /* synthetic */ ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i11, boolean z11, int i12, int i13, v vVar) {
        this(str, textStyle, resolver, i11, z11, i12, i13);
    }

    private final void markDirty() {
        this.paragraph = null;
        this.paragraphIntrinsics = null;
        this.intrinsicsLayoutDirection = null;
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
        this.prevConstraints = Constraints.Companion.m5078fixedJhjzzOo(0, 0);
        long j11 = 0;
        this.layoutSize = IntSize.m5281constructorimpl((j11 & 4294967295L) | (j11 << 32));
        this.didOverflow = false;
    }

    /* renamed from: newLayoutWillBeDifferent-K40F9xA, reason: not valid java name */
    private final boolean m1415newLayoutWillBeDifferentK40F9xA(long j11, LayoutDirection layoutDirection) {
        ParagraphIntrinsics paragraphIntrinsics;
        Paragraph paragraph = this.paragraph;
        if (paragraph == null || (paragraphIntrinsics = this.paragraphIntrinsics) == null || paragraphIntrinsics.getHasStaleResolvedFonts() || layoutDirection != this.intrinsicsLayoutDirection) {
            return true;
        }
        if (Constraints.m5061equalsimpl0(j11, this.prevConstraints)) {
            return false;
        }
        return Constraints.m5068getMaxWidthimpl(j11) != Constraints.m5068getMaxWidthimpl(this.prevConstraints) || ((float) Constraints.m5067getMaxHeightimpl(j11)) < paragraph.getHeight() || paragraph.getDidExceedMaxLines();
    }

    private final ParagraphIntrinsics setLayoutDirection(LayoutDirection layoutDirection) {
        ParagraphIntrinsics paragraphIntrinsics = this.paragraphIntrinsics;
        if (paragraphIntrinsics == null || layoutDirection != this.intrinsicsLayoutDirection || paragraphIntrinsics.getHasStaleResolvedFonts()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            String str = this.text;
            TextStyle resolveDefaults = TextStyleKt.resolveDefaults(this.style, layoutDirection);
            List J = h0.J();
            Density density = this.density;
            g0.m(density);
            paragraphIntrinsics = ParagraphIntrinsicsKt.ParagraphIntrinsics(str, resolveDefaults, (List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>>) J, density, this.fontFamilyResolver, (List<AnnotatedString.Range<Placeholder>>) h0.J());
        }
        this.paragraphIntrinsics = paragraphIntrinsics;
        return paragraphIntrinsics;
    }

    /* renamed from: useMinLinesConstrainer-euUD3Qg, reason: not valid java name */
    private final long m1416useMinLinesConstrainereuUD3Qg(long j11, LayoutDirection layoutDirection, TextStyle textStyle) {
        MinLinesConstrainer.Companion companion = MinLinesConstrainer.Companion;
        MinLinesConstrainer minLinesConstrainer = this.mMinLinesConstrainer;
        Density density = this.density;
        g0.m(density);
        MinLinesConstrainer from = companion.from(minLinesConstrainer, layoutDirection, textStyle, density, this.fontFamilyResolver);
        this.mMinLinesConstrainer = from;
        return from.m1400coerceMinLinesOh53vG4$foundation_release(j11, this.minLines);
    }

    /* renamed from: useMinLinesConstrainer-euUD3Qg$default, reason: not valid java name */
    public static /* synthetic */ long m1417useMinLinesConstrainereuUD3Qg$default(ParagraphLayoutCache paragraphLayoutCache, long j11, LayoutDirection layoutDirection, TextStyle textStyle, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            textStyle = paragraphLayoutCache.style;
        }
        return paragraphLayoutCache.m1416useMinLinesConstrainereuUD3Qg(j11, layoutDirection, textStyle);
    }

    @l
    public final Density getDensity$foundation_release() {
        return this.density;
    }

    public final boolean getDidOverflow$foundation_release() {
        return this.didOverflow;
    }

    /* renamed from: getLayoutSize-YbymL2g$foundation_release, reason: not valid java name */
    public final long m1418getLayoutSizeYbymL2g$foundation_release() {
        return this.layoutSize;
    }

    @k
    public final g2 getObserveFontChanges$foundation_release() {
        ParagraphIntrinsics paragraphIntrinsics = this.paragraphIntrinsics;
        if (paragraphIntrinsics != null) {
            paragraphIntrinsics.getHasStaleResolvedFonts();
        }
        return g2.f100423a;
    }

    @l
    public final Paragraph getParagraph$foundation_release() {
        return this.paragraph;
    }

    public final int intrinsicHeight(int i11, @k LayoutDirection layoutDirection) {
        ParagraphLayoutCache paragraphLayoutCache;
        LayoutDirection layoutDirection2;
        int i12 = this.cachedIntrinsicHeightInputWidth;
        int i13 = this.cachedIntrinsicHeight;
        if (i11 == i12 && i12 != -1) {
            return i13;
        }
        long Constraints = ConstraintsKt.Constraints(0, i11, 0, Integer.MAX_VALUE);
        if (this.minLines > 1) {
            paragraphLayoutCache = this;
            layoutDirection2 = layoutDirection;
            Constraints = m1417useMinLinesConstrainereuUD3Qg$default(paragraphLayoutCache, Constraints, layoutDirection2, null, 4, null);
        } else {
            paragraphLayoutCache = this;
            layoutDirection2 = layoutDirection;
        }
        int u11 = u.u(TextDelegateKt.ceilToIntPx(m1419layoutTextK40F9xA$foundation_release(Constraints, layoutDirection2).getHeight()), Constraints.m5069getMinHeightimpl(Constraints));
        paragraphLayoutCache.cachedIntrinsicHeightInputWidth = i11;
        paragraphLayoutCache.cachedIntrinsicHeight = u11;
        return u11;
    }

    @k
    /* renamed from: layoutText-K40F9xA$foundation_release, reason: not valid java name */
    public final Paragraph m1419layoutTextK40F9xA$foundation_release(long j11, @k LayoutDirection layoutDirection) {
        ParagraphIntrinsics layoutDirection2 = setLayoutDirection(layoutDirection);
        return ParagraphKt.m4432ParagraphczeNHc(layoutDirection2, LayoutUtilsKt.m1396finalConstraintstfFHcEY(j11, this.softWrap, this.overflow, layoutDirection2.getMaxIntrinsicWidth()), LayoutUtilsKt.m1397finalMaxLinesxdlQI24(this.softWrap, this.overflow, this.maxLines), this.overflow);
    }

    /* renamed from: layoutWithConstraints-K40F9xA, reason: not valid java name */
    public final boolean m1420layoutWithConstraintsK40F9xA(long j11, @k LayoutDirection layoutDirection) {
        ParagraphLayoutCache paragraphLayoutCache;
        LayoutDirection layoutDirection2;
        boolean z11 = true;
        if (this.minLines > 1) {
            paragraphLayoutCache = this;
            layoutDirection2 = layoutDirection;
            j11 = m1417useMinLinesConstrainereuUD3Qg$default(paragraphLayoutCache, j11, layoutDirection2, null, 4, null);
        } else {
            paragraphLayoutCache = this;
            layoutDirection2 = layoutDirection;
        }
        boolean z12 = false;
        if (m1415newLayoutWillBeDifferentK40F9xA(j11, layoutDirection2)) {
            Paragraph m1419layoutTextK40F9xA$foundation_release = m1419layoutTextK40F9xA$foundation_release(j11, layoutDirection2);
            paragraphLayoutCache.prevConstraints = j11;
            paragraphLayoutCache.layoutSize = ConstraintsKt.m5082constrain4WqzIAM(j11, IntSize.m5281constructorimpl((TextDelegateKt.ceilToIntPx(m1419layoutTextK40F9xA$foundation_release.getWidth()) << 32) | (TextDelegateKt.ceilToIntPx(m1419layoutTextK40F9xA$foundation_release.getHeight()) & 4294967295L)));
            if (!TextOverflow.m5019equalsimpl0(paragraphLayoutCache.overflow, TextOverflow.Companion.m5032getVisiblegIe3tQ8()) && (((int) (r13 >> 32)) < m1419layoutTextK40F9xA$foundation_release.getWidth() || ((int) (r13 & 4294967295L)) < m1419layoutTextK40F9xA$foundation_release.getHeight())) {
                z12 = true;
            }
            paragraphLayoutCache.didOverflow = z12;
            paragraphLayoutCache.paragraph = m1419layoutTextK40F9xA$foundation_release;
            return true;
        }
        if (!Constraints.m5061equalsimpl0(j11, paragraphLayoutCache.prevConstraints)) {
            Paragraph paragraph = paragraphLayoutCache.paragraph;
            g0.m(paragraph);
            paragraphLayoutCache.layoutSize = ConstraintsKt.m5082constrain4WqzIAM(j11, IntSize.m5281constructorimpl((TextDelegateKt.ceilToIntPx(Math.min(paragraph.getMaxIntrinsicWidth(), paragraph.getWidth())) << 32) | (TextDelegateKt.ceilToIntPx(paragraph.getHeight()) & 4294967295L)));
            if (TextOverflow.m5019equalsimpl0(paragraphLayoutCache.overflow, TextOverflow.Companion.m5032getVisiblegIe3tQ8()) || (((int) (r7 >> 32)) >= paragraph.getWidth() && ((int) (4294967295L & r7)) >= paragraph.getHeight())) {
                z11 = false;
            }
            paragraphLayoutCache.didOverflow = z11;
            paragraphLayoutCache.prevConstraints = j11;
        }
        return false;
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

    public final void setDidOverflow$foundation_release(boolean z11) {
        this.didOverflow = z11;
    }

    /* renamed from: setLayoutSize-ozmzZPI$foundation_release, reason: not valid java name */
    public final void m1421setLayoutSizeozmzZPI$foundation_release(long j11) {
        this.layoutSize = j11;
    }

    public final void setParagraph$foundation_release(@l Paragraph paragraph) {
        this.paragraph = paragraph;
    }

    @l
    public final TextLayoutResult slowCreateTextLayoutResultOrNull(@k TextStyle textStyle) {
        Density density;
        LayoutDirection layoutDirection = this.intrinsicsLayoutDirection;
        if (layoutDirection == null || (density = this.density) == null) {
            return null;
        }
        AnnotatedString annotatedString = new AnnotatedString(this.text, null, 2, null);
        if (this.paragraph == null || this.paragraphIntrinsics == null) {
            return null;
        }
        long m5056constructorimpl = Constraints.m5056constructorimpl(this.prevConstraints & ConstraintsKt.MaxDimensionsAndFocusMask);
        return new TextLayoutResult(new TextLayoutInput(annotatedString, textStyle, h0.J(), this.maxLines, this.softWrap, this.overflow, density, layoutDirection, this.fontFamilyResolver, m5056constructorimpl, (v) null), new MultiParagraph(new MultiParagraphIntrinsics(annotatedString, textStyle, (List<AnnotatedString.Range<Placeholder>>) h0.J(), density, this.fontFamilyResolver), m5056constructorimpl, this.maxLines, this.overflow, (v) null), this.layoutSize, null);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ParagraphLayoutCache(paragraph=");
        sb2.append(this.paragraph != null ? "<paragraph>" : "null");
        sb2.append(", lastDensity=");
        sb2.append((Object) InlineDensity.m1393toStringimpl(this.lastDensity));
        sb2.append(')');
        return sb2.toString();
    }

    /* renamed from: update-L6sJoHM, reason: not valid java name */
    public final void m1422updateL6sJoHM(@k String str, @k TextStyle textStyle, @k FontFamily.Resolver resolver, int i11, boolean z11, int i12, int i13) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i11;
        this.softWrap = z11;
        this.maxLines = i12;
        this.minLines = i13;
        markDirty();
    }

    private ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i11, boolean z11, int i12, int i13) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i11;
        this.softWrap = z11;
        this.maxLines = i12;
        this.minLines = i13;
        this.lastDensity = InlineDensity.Companion.m1395getUnspecifiedL26CHvs();
        long j11 = 0;
        this.layoutSize = IntSize.m5281constructorimpl((j11 & 4294967295L) | (j11 << 32));
        this.prevConstraints = Constraints.Companion.m5078fixedJhjzzOo(0, 0);
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
    }

    public /* synthetic */ ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i11, boolean z11, int i12, int i13, int i14, v vVar) {
        this(str, textStyle, resolver, (i14 & 8) != 0 ? TextOverflow.Companion.m5028getClipgIe3tQ8() : i11, (i14 & 16) != 0 ? true : z11, (i14 & 32) != 0 ? Integer.MAX_VALUE : i12, (i14 & 64) != 0 ? 1 : i13, null);
    }
}
