package androidx.compose.foundation.text;

import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class TextFieldSize {

    @k
    private Density density;

    @k
    private FontFamily.Resolver fontFamilyResolver;

    @k
    private LayoutDirection layoutDirection;
    private long minSize = m1159computeMinSizeYbymL2g();

    @k
    private TextStyle resolvedStyle;

    @k
    private Object typeface;

    public TextFieldSize(@k LayoutDirection layoutDirection, @k Density density, @k FontFamily.Resolver resolver, @k TextStyle textStyle, @k Object obj) {
        this.layoutDirection = layoutDirection;
        this.density = density;
        this.fontFamilyResolver = resolver;
        this.resolvedStyle = textStyle;
        this.typeface = obj;
    }

    /* renamed from: computeMinSize-YbymL2g, reason: not valid java name */
    private final long m1159computeMinSizeYbymL2g() {
        return TextFieldDelegateKt.computeSizeForDefaultText$default(this.resolvedStyle, this.density, this.fontFamilyResolver, null, 0, 24, null);
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

    /* renamed from: getMinSize-YbymL2g, reason: not valid java name */
    public final long m1160getMinSizeYbymL2g() {
        return this.minSize;
    }

    @k
    public final TextStyle getResolvedStyle() {
        return this.resolvedStyle;
    }

    @k
    public final Object getTypeface() {
        return this.typeface;
    }

    public final void setDensity(@k Density density) {
        this.density = density;
    }

    public final void setFontFamilyResolver(@k FontFamily.Resolver resolver) {
        this.fontFamilyResolver = resolver;
    }

    public final void setLayoutDirection(@k LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
    }

    public final void setResolvedStyle(@k TextStyle textStyle) {
        this.resolvedStyle = textStyle;
    }

    public final void setTypeface(@k Object obj) {
        this.typeface = obj;
    }

    public final void update(@k LayoutDirection layoutDirection, @k Density density, @k FontFamily.Resolver resolver, @k TextStyle textStyle, @k Object obj) {
        if (layoutDirection == this.layoutDirection && g0.g(density, this.density) && g0.g(resolver, this.fontFamilyResolver) && g0.g(textStyle, this.resolvedStyle) && g0.g(obj, this.typeface)) {
            return;
        }
        this.layoutDirection = layoutDirection;
        this.density = density;
        this.fontFamilyResolver = resolver;
        this.resolvedStyle = textStyle;
        this.typeface = obj;
        this.minSize = m1159computeMinSizeYbymL2g();
    }
}
