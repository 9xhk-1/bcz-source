package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontVariation;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(28)
@VisibleForTesting
/* loaded from: classes2.dex */
final class PlatformTypefacesApi28 implements PlatformTypefaces {
    /* renamed from: createAndroidTypefaceApi28-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m4703createAndroidTypefaceApi28RetOiIg(String str, FontWeight fontWeight, int i11) {
        android.graphics.Typeface create;
        FontStyle.Companion companion = FontStyle.Companion;
        if (FontStyle.m4670equalsimpl0(i11, companion.m4677getNormal_LCdwA()) && g0.g(fontWeight, FontWeight.Companion.getNormal()) && (str == null || str.length() == 0)) {
            return android.graphics.Typeface.DEFAULT;
        }
        create = android.graphics.Typeface.create(str == null ? android.graphics.Typeface.DEFAULT : android.graphics.Typeface.create(str, 0), fontWeight.getWeight(), FontStyle.m4670equalsimpl0(i11, companion.m4676getItalic_LCdwA()));
        return create;
    }

    /* renamed from: createAndroidTypefaceApi28-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ android.graphics.Typeface m4704createAndroidTypefaceApi28RetOiIg$default(PlatformTypefacesApi28 platformTypefacesApi28, String str, FontWeight fontWeight, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = null;
        }
        return platformTypefacesApi28.m4703createAndroidTypefaceApi28RetOiIg(str, fontWeight, i11);
    }

    /* renamed from: loadNamedFromTypefaceCacheOrNull-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m4705loadNamedFromTypefaceCacheOrNullRetOiIg(String str, FontWeight fontWeight, int i11) {
        if (str.length() == 0) {
            return null;
        }
        android.graphics.Typeface m4703createAndroidTypefaceApi28RetOiIg = m4703createAndroidTypefaceApi28RetOiIg(str, fontWeight, i11);
        if (g0.g(m4703createAndroidTypefaceApi28RetOiIg, TypefaceHelperMethodsApi28.INSTANCE.create(android.graphics.Typeface.DEFAULT, fontWeight.getWeight(), FontStyle.m4670equalsimpl0(i11, FontStyle.Companion.m4676getItalic_LCdwA()))) || g0.g(m4703createAndroidTypefaceApi28RetOiIg, m4703createAndroidTypefaceApi28RetOiIg(null, fontWeight, i11))) {
            return null;
        }
        return m4703createAndroidTypefaceApi28RetOiIg;
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    @k
    /* renamed from: createDefault-FO1MlWM */
    public android.graphics.Typeface mo4697createDefaultFO1MlWM(@k FontWeight fontWeight, int i11) {
        return m4703createAndroidTypefaceApi28RetOiIg(null, fontWeight, i11);
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    @k
    /* renamed from: createNamed-RetOiIg */
    public android.graphics.Typeface mo4698createNamedRetOiIg(@k GenericFontFamily genericFontFamily, @k FontWeight fontWeight, int i11) {
        return m4703createAndroidTypefaceApi28RetOiIg(genericFontFamily.getName(), fontWeight, i11);
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    @l
    /* renamed from: optionalOnDeviceFontFamilyByName-78DK7lM */
    public android.graphics.Typeface mo4699optionalOnDeviceFontFamilyByName78DK7lM(@k String str, @k FontWeight fontWeight, int i11, @k FontVariation.Settings settings, @k Context context) {
        FontFamily.Companion companion = FontFamily.Companion;
        return PlatformTypefaces_androidKt.setFontVariationSettings(g0.g(str, companion.getSansSerif().getName()) ? mo4698createNamedRetOiIg(companion.getSansSerif(), fontWeight, i11) : g0.g(str, companion.getSerif().getName()) ? mo4698createNamedRetOiIg(companion.getSerif(), fontWeight, i11) : g0.g(str, companion.getMonospace().getName()) ? mo4698createNamedRetOiIg(companion.getMonospace(), fontWeight, i11) : g0.g(str, companion.getCursive().getName()) ? mo4698createNamedRetOiIg(companion.getCursive(), fontWeight, i11) : m4705loadNamedFromTypefaceCacheOrNullRetOiIg(str, fontWeight, i11), settings, context);
    }
}
