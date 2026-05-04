package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class TextLayoutInput {
    public static final int $stable = 8;

    @l
    private Font.ResourceLoader _developerSuppliedResourceLoader;
    private final long constraints;

    @k
    private final Density density;

    @k
    private final FontFamily.Resolver fontFamilyResolver;

    @k
    private final LayoutDirection layoutDirection;
    private final int maxLines;
    private final int overflow;

    @k
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private final boolean softWrap;

    @k
    private final TextStyle style;

    @k
    private final AnnotatedString text;

    @n(message = "Font.ResourceLoader is replaced with FontFamily.Resolver", replaceWith = @w0(expression = "TextLayoutInput(text, style, placeholders, maxLines, softWrap, overflow, density, layoutDirection, fontFamilyResolver, constraints", imports = {}))
    public /* synthetic */ TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List list, int i11, boolean z11, int i12, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, long j11, v vVar) {
        this(annotatedString, textStyle, (List<AnnotatedString.Range<Placeholder>>) list, i11, z11, i12, density, layoutDirection, resourceLoader, j11);
    }

    /* renamed from: copy-hu-1Yfo$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutInput m4523copyhu1Yfo$default(TextLayoutInput textLayoutInput, AnnotatedString annotatedString, TextStyle textStyle, List list, int i11, boolean z11, int i12, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, long j11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            annotatedString = textLayoutInput.text;
        }
        if ((i13 & 2) != 0) {
            textStyle = textLayoutInput.style;
        }
        if ((i13 & 4) != 0) {
            list = textLayoutInput.placeholders;
        }
        if ((i13 & 8) != 0) {
            i11 = textLayoutInput.maxLines;
        }
        if ((i13 & 16) != 0) {
            z11 = textLayoutInput.softWrap;
        }
        if ((i13 & 32) != 0) {
            i12 = textLayoutInput.overflow;
        }
        if ((i13 & 64) != 0) {
            density = textLayoutInput.density;
        }
        if ((i13 & 128) != 0) {
            layoutDirection = textLayoutInput.layoutDirection;
        }
        if ((i13 & 256) != 0) {
            resourceLoader = textLayoutInput.getResourceLoader();
        }
        if ((i13 & 512) != 0) {
            j11 = textLayoutInput.constraints;
        }
        long j12 = j11;
        LayoutDirection layoutDirection2 = layoutDirection;
        Font.ResourceLoader resourceLoader2 = resourceLoader;
        int i14 = i12;
        Density density2 = density;
        boolean z12 = z11;
        List list2 = list;
        return textLayoutInput.m4524copyhu1Yfo(annotatedString, textStyle, list2, i11, z12, i14, density2, layoutDirection2, resourceLoader2, j12);
    }

    @n(message = "Font.ResourceLoader is deprecated", replaceWith = @w0(expression = "TextLayoutInput(text, style, placeholders, maxLines, softWrap, overFlow, density, layoutDirection, fontFamilyResolver, constraints)", imports = {}))
    @k
    /* renamed from: copy-hu-1Yfo, reason: not valid java name */
    public final TextLayoutInput m4524copyhu1Yfo(@k AnnotatedString annotatedString, @k TextStyle textStyle, @k List<AnnotatedString.Range<Placeholder>> list, int i11, boolean z11, int i12, @k Density density, @k LayoutDirection layoutDirection, @k Font.ResourceLoader resourceLoader, long j11) {
        return new TextLayoutInput(annotatedString, textStyle, list, i11, z11, i12, density, layoutDirection, resourceLoader, this.fontFamilyResolver, j11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextLayoutInput)) {
            return false;
        }
        TextLayoutInput textLayoutInput = (TextLayoutInput) obj;
        return g0.g(this.text, textLayoutInput.text) && g0.g(this.style, textLayoutInput.style) && g0.g(this.placeholders, textLayoutInput.placeholders) && this.maxLines == textLayoutInput.maxLines && this.softWrap == textLayoutInput.softWrap && TextOverflow.m5019equalsimpl0(this.overflow, textLayoutInput.overflow) && g0.g(this.density, textLayoutInput.density) && this.layoutDirection == textLayoutInput.layoutDirection && g0.g(this.fontFamilyResolver, textLayoutInput.fontFamilyResolver) && Constraints.m5061equalsimpl0(this.constraints, textLayoutInput.constraints);
    }

    /* renamed from: getConstraints-msEJaDk, reason: not valid java name */
    public final long m4525getConstraintsmsEJaDk() {
        return this.constraints;
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
    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    /* renamed from: getOverflow-gIe3tQ8, reason: not valid java name */
    public final int m4526getOverflowgIe3tQ8() {
        return this.overflow;
    }

    @k
    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    @k
    public final Font.ResourceLoader getResourceLoader() {
        Font.ResourceLoader resourceLoader = this._developerSuppliedResourceLoader;
        return resourceLoader == null ? DeprecatedBridgeFontResourceLoader.Companion.from(this.fontFamilyResolver) : resourceLoader;
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

    public int hashCode() {
        return (((((((((((((((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.placeholders.hashCode()) * 31) + this.maxLines) * 31) + Boolean.hashCode(this.softWrap)) * 31) + TextOverflow.m5020hashCodeimpl(this.overflow)) * 31) + this.density.hashCode()) * 31) + this.layoutDirection.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31) + Constraints.m5071hashCodeimpl(this.constraints);
    }

    @k
    public String toString() {
        return "TextLayoutInput(text=" + ((Object) this.text) + ", style=" + this.style + ", placeholders=" + this.placeholders + ", maxLines=" + this.maxLines + ", softWrap=" + this.softWrap + ", overflow=" + ((Object) TextOverflow.m5021toStringimpl(this.overflow)) + ", density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", fontFamilyResolver=" + this.fontFamilyResolver + ", constraints=" + ((Object) Constraints.m5073toStringimpl(this.constraints)) + ')';
    }

    public /* synthetic */ TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List list, int i11, boolean z11, int i12, Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j11, v vVar) {
        this(annotatedString, textStyle, (List<AnnotatedString.Range<Placeholder>>) list, i11, z11, i12, density, layoutDirection, resolver, j11);
    }

    private TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i11, boolean z11, int i12, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, FontFamily.Resolver resolver, long j11) {
        this.text = annotatedString;
        this.style = textStyle;
        this.placeholders = list;
        this.maxLines = i11;
        this.softWrap = z11;
        this.overflow = i12;
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.fontFamilyResolver = resolver;
        this.constraints = j11;
        this._developerSuppliedResourceLoader = resourceLoader;
    }

    private TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i11, boolean z11, int i12, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, long j11) {
        this(annotatedString, textStyle, list, i11, z11, i12, density, layoutDirection, resourceLoader, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader), j11);
    }

    private TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i11, boolean z11, int i12, Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j11) {
        this(annotatedString, textStyle, list, i11, z11, i12, density, layoutDirection, (Font.ResourceLoader) null, resolver, j11);
    }

    @n(message = "Replaced with FontFamily.Resolver", replaceWith = @w0(expression = "fontFamilyResolver", imports = {}))
    public static /* synthetic */ void getResourceLoader$annotations() {
    }
}
