package androidx.compose.foundation.text.modifiers;

import a00.h0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.LayoutDirection;
import g10.u;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nMinLinesConstrainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MinLinesConstrainer.kt\nandroidx/compose/foundation/text/modifiers/MinLinesConstrainer\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,151:1\n26#2:152\n*S KotlinDebug\n*F\n+ 1 MinLinesConstrainer.kt\nandroidx/compose/foundation/text/modifiers/MinLinesConstrainer\n*L\n133#1:152\n*E\n"})
/* loaded from: classes.dex */
public final class MinLinesConstrainer {

    @l
    private static MinLinesConstrainer last;

    @k
    private final Density density;

    @k
    private final FontFamily.Resolver fontFamilyResolver;

    @k
    private final TextStyle inputTextStyle;

    @k
    private final LayoutDirection layoutDirection;
    private float lineHeightCache = Float.NaN;
    private float oneLineHeightCache = Float.NaN;

    @k
    private final TextStyle resolvedStyle;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nMinLinesConstrainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MinLinesConstrainer.kt\nandroidx/compose/foundation/text/modifiers/MinLinesConstrainer$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n1#2:152\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final MinLinesConstrainer from(@l MinLinesConstrainer minLinesConstrainer, @k LayoutDirection layoutDirection, @k TextStyle textStyle, @k Density density, @k FontFamily.Resolver resolver) {
            if (minLinesConstrainer != null && layoutDirection == minLinesConstrainer.getLayoutDirection() && g0.g(TextStyleKt.resolveDefaults(textStyle, layoutDirection), minLinesConstrainer.getInputTextStyle()) && density.getDensity() == minLinesConstrainer.getDensity().getDensity() && resolver == minLinesConstrainer.getFontFamilyResolver()) {
                return minLinesConstrainer;
            }
            MinLinesConstrainer minLinesConstrainer2 = MinLinesConstrainer.last;
            if (minLinesConstrainer2 != null && layoutDirection == minLinesConstrainer2.getLayoutDirection() && g0.g(TextStyleKt.resolveDefaults(textStyle, layoutDirection), minLinesConstrainer2.getInputTextStyle()) && density.getDensity() == minLinesConstrainer2.getDensity().getDensity() && resolver == minLinesConstrainer2.getFontFamilyResolver()) {
                return minLinesConstrainer2;
            }
            MinLinesConstrainer minLinesConstrainer3 = new MinLinesConstrainer(layoutDirection, TextStyleKt.resolveDefaults(textStyle, layoutDirection), DensityKt.Density(density.getDensity(), density.getFontScale()), resolver);
            Companion companion = MinLinesConstrainer.Companion;
            MinLinesConstrainer.last = minLinesConstrainer3;
            return minLinesConstrainer3;
        }

        private Companion() {
        }
    }

    public MinLinesConstrainer(@k LayoutDirection layoutDirection, @k TextStyle textStyle, @k Density density, @k FontFamily.Resolver resolver) {
        this.layoutDirection = layoutDirection;
        this.inputTextStyle = textStyle;
        this.density = density;
        this.fontFamilyResolver = resolver;
        this.resolvedStyle = TextStyleKt.resolveDefaults(textStyle, layoutDirection);
    }

    /* renamed from: coerceMinLines-Oh53vG4$foundation_release, reason: not valid java name */
    public final long m1400coerceMinLinesOh53vG4$foundation_release(long j11, int i11) {
        String str;
        Paragraph m4428ParagraphUl8oQg4;
        String str2;
        Paragraph m4428ParagraphUl8oQg42;
        float f11 = this.oneLineHeightCache;
        float f12 = this.lineHeightCache;
        if (Float.isNaN(f11) || Float.isNaN(f12)) {
            str = MinLinesConstrainerKt.EmptyTextReplacement;
            TextStyle textStyle = this.resolvedStyle;
            long Constraints$default = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
            Density density = this.density;
            FontFamily.Resolver resolver = this.fontFamilyResolver;
            TextOverflow.Companion companion = TextOverflow.Companion;
            m4428ParagraphUl8oQg4 = ParagraphKt.m4428ParagraphUl8oQg4(str, textStyle, Constraints$default, density, resolver, (r22 & 32) != 0 ? h0.J() : null, (r22 & 64) != 0 ? h0.J() : null, (r22 & 128) != 0 ? Integer.MAX_VALUE : 1, (r22 & 256) != 0 ? TextOverflow.Companion.m5028getClipgIe3tQ8() : companion.m5028getClipgIe3tQ8());
            float height = m4428ParagraphUl8oQg4.getHeight();
            str2 = MinLinesConstrainerKt.TwoLineTextReplacement;
            m4428ParagraphUl8oQg42 = ParagraphKt.m4428ParagraphUl8oQg4(str2, this.resolvedStyle, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), this.density, this.fontFamilyResolver, (r22 & 32) != 0 ? h0.J() : null, (r22 & 64) != 0 ? h0.J() : null, (r22 & 128) != 0 ? Integer.MAX_VALUE : 2, (r22 & 256) != 0 ? TextOverflow.Companion.m5028getClipgIe3tQ8() : companion.m5028getClipgIe3tQ8());
            float height2 = m4428ParagraphUl8oQg42.getHeight() - height;
            this.oneLineHeightCache = height;
            this.lineHeightCache = height2;
            f12 = height2;
            f11 = height;
        }
        return ConstraintsKt.Constraints(Constraints.m5070getMinWidthimpl(j11), Constraints.m5068getMaxWidthimpl(j11), i11 != 1 ? u.B(u.u(Math.round(f11 + (f12 * (i11 - 1))), 0), Constraints.m5067getMaxHeightimpl(j11)) : Constraints.m5069getMinHeightimpl(j11), Constraints.m5067getMaxHeightimpl(j11));
    }

    @k
    public final Density getDensity() {
        return this.density;
    }

    @k
    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    @k
    public final TextStyle getInputTextStyle() {
        return this.inputTextStyle;
    }

    @k
    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }
}
