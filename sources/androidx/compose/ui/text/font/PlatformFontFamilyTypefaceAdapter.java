package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.text.platform.AndroidTypeface;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class PlatformFontFamilyTypefaceAdapter implements FontFamilyTypefaceAdapter {
    public static final int $stable = 8;

    @k
    private final PlatformTypefaces platformTypefaceResolver = PlatformTypefaces_androidKt.PlatformTypefaces();

    @Override // androidx.compose.ui.text.font.FontFamilyTypefaceAdapter
    @l
    public TypefaceResult resolve(@k TypefaceRequest typefaceRequest, @k PlatformFontLoader platformFontLoader, @k x00.l<? super TypefaceResult.Immutable, g2> lVar, @k x00.l<? super TypefaceRequest, ? extends Object> lVar2) {
        android.graphics.Typeface mo4810getNativeTypefacePYhJU0U;
        FontFamily fontFamily = typefaceRequest.getFontFamily();
        if (fontFamily == null ? true : fontFamily instanceof DefaultFontFamily) {
            mo4810getNativeTypefacePYhJU0U = this.platformTypefaceResolver.mo4697createDefaultFO1MlWM(typefaceRequest.getFontWeight(), typefaceRequest.m4715getFontStyle_LCdwA());
        } else if (fontFamily instanceof GenericFontFamily) {
            mo4810getNativeTypefacePYhJU0U = this.platformTypefaceResolver.mo4698createNamedRetOiIg((GenericFontFamily) typefaceRequest.getFontFamily(), typefaceRequest.getFontWeight(), typefaceRequest.m4715getFontStyle_LCdwA());
        } else {
            if (!(fontFamily instanceof LoadedFontFamily)) {
                return null;
            }
            Typeface typeface = ((LoadedFontFamily) typefaceRequest.getFontFamily()).getTypeface();
            g0.n(typeface, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
            mo4810getNativeTypefacePYhJU0U = ((AndroidTypeface) typeface).mo4810getNativeTypefacePYhJU0U(typefaceRequest.getFontWeight(), typefaceRequest.m4715getFontStyle_LCdwA(), typefaceRequest.m4716getFontSynthesisGVVA2EU());
        }
        return new TypefaceResult.Immutable(mo4810getNativeTypefacePYhJU0U, false, 2, null);
    }
}
