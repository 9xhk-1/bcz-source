package androidx.compose.ui.text;

import a00.h0;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@u0({"SMAP\nTextMeasurer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextMeasurer.kt\nandroidx/compose/ui/text/TextMeasurer\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,455:1\n30#2:456\n80#3:457\n*S KotlinDebug\n*F\n+ 1 TextMeasurer.kt\nandroidx/compose/ui/text/TextMeasurer\n*L\n178#1:456\n178#1:457\n*E\n"})
/* loaded from: classes2.dex */
public final class TextMeasurer {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);
    private final int cacheSize;

    @k
    private final Density defaultDensity;

    @k
    private final FontFamily.Resolver defaultFontFamilyResolver;

    @k
    private final LayoutDirection defaultLayoutDirection;

    @l
    private final TextLayoutCache textLayoutCache;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTextMeasurer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextMeasurer.kt\nandroidx/compose/ui/text/TextMeasurer$Companion\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,455:1\n30#2:456\n80#3:457\n*S KotlinDebug\n*F\n+ 1 TextMeasurer.kt\nandroidx/compose/ui/text/TextMeasurer$Companion\n*L\n343#1:456\n343#1:457\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x0037, code lost:
        
            if (r2 != false) goto L6;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0055  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.compose.ui.text.TextLayoutResult layout(androidx.compose.ui.text.TextLayoutInput r14) {
            /*
                r13 = this;
                androidx.compose.ui.text.AnnotatedString r1 = r14.getText()
                androidx.compose.ui.text.TextStyle r0 = r14.getStyle()
                androidx.compose.ui.unit.LayoutDirection r2 = r14.getLayoutDirection()
                androidx.compose.ui.text.TextStyle r2 = androidx.compose.ui.text.TextStyleKt.resolveDefaults(r0, r2)
                androidx.compose.ui.unit.Density r4 = r14.getDensity()
                androidx.compose.ui.text.font.FontFamily$Resolver r5 = r14.getFontFamilyResolver()
                java.util.List r3 = r14.getPlaceholders()
                androidx.compose.ui.text.MultiParagraphIntrinsics r0 = new androidx.compose.ui.text.MultiParagraphIntrinsics
                r0.<init>(r1, r2, r3, r4, r5)
                long r1 = r14.m4525getConstraintsmsEJaDk()
                int r1 = androidx.compose.ui.unit.Constraints.m5070getMinWidthimpl(r1)
                boolean r2 = r14.getSoftWrap()
                if (r2 != 0) goto L39
                int r2 = r14.m4526getOverflowgIe3tQ8()
                boolean r2 = androidx.compose.ui.text.TextMeasurerKt.m4536access$isEllipsisMW5ApA(r2)
                if (r2 == 0) goto L4c
            L39:
                long r2 = r14.m4525getConstraintsmsEJaDk()
                boolean r2 = androidx.compose.ui.unit.Constraints.m5064getHasBoundedWidthimpl(r2)
                if (r2 == 0) goto L4c
                long r2 = r14.m4525getConstraintsmsEJaDk()
                int r2 = androidx.compose.ui.unit.Constraints.m5068getMaxWidthimpl(r2)
                goto L4f
            L4c:
                r2 = 2147483647(0x7fffffff, float:NaN)
            L4f:
                boolean r3 = r14.getSoftWrap()
                if (r3 != 0) goto L62
                int r3 = r14.m4526getOverflowgIe3tQ8()
                boolean r3 = androidx.compose.ui.text.TextMeasurerKt.m4536access$isEllipsisMW5ApA(r3)
                if (r3 == 0) goto L62
                r3 = 1
            L60:
                r10 = r3
                goto L67
            L62:
                int r3 = r14.getMaxLines()
                goto L60
            L67:
                if (r1 != r2) goto L6a
                goto L76
            L6a:
                float r3 = r0.getMaxIntrinsicWidth()
                int r3 = androidx.compose.ui.text.ParagraphKt.ceilToInt(r3)
                int r2 = g10.u.I(r3, r1, r2)
            L76:
                androidx.compose.ui.text.MultiParagraph r5 = new androidx.compose.ui.text.MultiParagraph
                androidx.compose.ui.unit.Constraints$Companion r1 = androidx.compose.ui.unit.Constraints.Companion
                long r3 = r14.m4525getConstraintsmsEJaDk()
                int r3 = androidx.compose.ui.unit.Constraints.m5067getMaxHeightimpl(r3)
                r4 = 0
                long r8 = r1.m5077fitPrioritizingWidthZbe2FdA(r4, r2, r4, r3)
                int r11 = r14.m4526getOverflowgIe3tQ8()
                r12 = 0
                r7 = r0
                r6 = r5
                r6.<init>(r7, r8, r10, r11, r12)
                androidx.compose.ui.text.TextLayoutResult r3 = new androidx.compose.ui.text.TextLayoutResult
                long r0 = r14.m4525getConstraintsmsEJaDk()
                float r2 = r5.getWidth()
                double r6 = (double) r2
                double r6 = java.lang.Math.ceil(r6)
                float r2 = (float) r6
                int r2 = (int) r2
                float r4 = r5.getHeight()
                double r6 = (double) r4
                double r6 = java.lang.Math.ceil(r6)
                float r4 = (float) r6
                int r4 = (int) r4
                long r6 = (long) r2
                r2 = 32
                long r6 = r6 << r2
                long r8 = (long) r4
                r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
                long r8 = r8 & r10
                long r6 = r6 | r8
                long r6 = androidx.compose.ui.unit.IntSize.m5281constructorimpl(r6)
                long r6 = androidx.compose.ui.unit.ConstraintsKt.m5082constrain4WqzIAM(r0, r6)
                r8 = 0
                r4 = r14
                r3.<init>(r4, r5, r6, r8)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.TextMeasurer.Companion.layout(androidx.compose.ui.text.TextLayoutInput):androidx.compose.ui.text.TextLayoutResult");
        }

        private Companion() {
        }
    }

    public TextMeasurer(@k FontFamily.Resolver resolver, @k Density density, @k LayoutDirection layoutDirection, int i11) {
        this.defaultFontFamilyResolver = resolver;
        this.defaultDensity = density;
        this.defaultLayoutDirection = layoutDirection;
        this.cacheSize = i11;
        this.textLayoutCache = i11 > 0 ? new TextLayoutCache(i11) : null;
    }

    /* renamed from: measure-wNUYSr0$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m4532measurewNUYSr0$default(TextMeasurer textMeasurer, String str, TextStyle textStyle, int i11, boolean z11, int i12, long j11, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            textStyle = TextStyle.Companion.getDefault();
        }
        TextStyle textStyle2 = textStyle;
        if ((i13 & 4) != 0) {
            i11 = TextOverflow.Companion.m5028getClipgIe3tQ8();
        }
        return textMeasurer.m4534measurewNUYSr0(str, textStyle2, i11, (i13 & 8) != 0 ? true : z11, (i13 & 16) != 0 ? Integer.MAX_VALUE : i12, (i13 & 32) != 0 ? ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null) : j11, (i13 & 64) != 0 ? textMeasurer.defaultLayoutDirection : layoutDirection, (i13 & 128) != 0 ? textMeasurer.defaultDensity : density, (i13 & 256) != 0 ? textMeasurer.defaultFontFamilyResolver : resolver, (i13 & 512) != 0 ? false : z12);
    }

    /* renamed from: measure-xDpz5zY$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m4533measurexDpz5zY$default(TextMeasurer textMeasurer, AnnotatedString annotatedString, TextStyle textStyle, int i11, boolean z11, int i12, List list, long j11, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            textStyle = TextStyle.Companion.getDefault();
        }
        return textMeasurer.m4535measurexDpz5zY(annotatedString, textStyle, (i13 & 4) != 0 ? TextOverflow.Companion.m5028getClipgIe3tQ8() : i11, (i13 & 8) != 0 ? true : z11, (i13 & 16) != 0 ? Integer.MAX_VALUE : i12, (i13 & 32) != 0 ? h0.J() : list, (i13 & 64) != 0 ? ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null) : j11, (i13 & 128) != 0 ? textMeasurer.defaultLayoutDirection : layoutDirection, (i13 & 256) != 0 ? textMeasurer.defaultDensity : density, (i13 & 512) != 0 ? textMeasurer.defaultFontFamilyResolver : resolver, (i13 & 1024) != 0 ? false : z12);
    }

    @Stable
    @k
    /* renamed from: measure-wNUYSr0, reason: not valid java name */
    public final TextLayoutResult m4534measurewNUYSr0(@k String str, @k TextStyle textStyle, int i11, boolean z11, int i12, long j11, @k LayoutDirection layoutDirection, @k Density density, @k FontFamily.Resolver resolver, boolean z12) {
        return m4533measurexDpz5zY$default(this, new AnnotatedString(str, null, 2, null), textStyle, i11, z11, i12, null, j11, layoutDirection, density, resolver, z12, 32, null);
    }

    @Stable
    @k
    /* renamed from: measure-xDpz5zY, reason: not valid java name */
    public final TextLayoutResult m4535measurexDpz5zY(@k AnnotatedString annotatedString, @k TextStyle textStyle, int i11, boolean z11, int i12, @k List<AnnotatedString.Range<Placeholder>> list, long j11, @k LayoutDirection layoutDirection, @k Density density, @k FontFamily.Resolver resolver, boolean z12) {
        TextLayoutCache textLayoutCache;
        TextLayoutInput textLayoutInput = new TextLayoutInput(annotatedString, textStyle, list, i12, z11, i11, density, layoutDirection, resolver, j11, (v) null);
        TextLayoutResult textLayoutResult = (z12 || (textLayoutCache = this.textLayoutCache) == null) ? null : textLayoutCache.get(textLayoutInput);
        if (textLayoutResult != null) {
            return textLayoutResult.m4528copyO0kMr_c(textLayoutInput, ConstraintsKt.m5082constrain4WqzIAM(j11, IntSize.m5281constructorimpl((ParagraphKt.ceilToInt(textLayoutResult.getMultiParagraph().getWidth()) << 32) | (ParagraphKt.ceilToInt(textLayoutResult.getMultiParagraph().getHeight()) & 4294967295L))));
        }
        TextLayoutResult layout = Companion.layout(textLayoutInput);
        TextLayoutCache textLayoutCache2 = this.textLayoutCache;
        if (textLayoutCache2 != null) {
            textLayoutCache2.put(textLayoutInput, layout);
        }
        return layout;
    }

    public /* synthetic */ TextMeasurer(FontFamily.Resolver resolver, Density density, LayoutDirection layoutDirection, int i11, int i12, v vVar) {
        this(resolver, density, layoutDirection, (i12 & 8) != 0 ? 8 : i11);
    }
}
