package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontVariation;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@VisibleForTesting
/* loaded from: classes2.dex */
final class PlatformTypefacesApi implements PlatformTypefaces {
    /* renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m4700createAndroidTypefaceUsingTypefaceStyleRetOiIg(String str, FontWeight fontWeight, int i11) {
        if (FontStyle.m4670equalsimpl0(i11, FontStyle.Companion.m4677getNormal_LCdwA()) && g0.g(fontWeight, FontWeight.Companion.getNormal()) && (str == null || str.length() == 0)) {
            return android.graphics.Typeface.DEFAULT;
        }
        int m4622getAndroidTypefaceStyleFO1MlWM = AndroidFontUtils_androidKt.m4622getAndroidTypefaceStyleFO1MlWM(fontWeight, i11);
        return (str == null || str.length() == 0) ? android.graphics.Typeface.defaultFromStyle(m4622getAndroidTypefaceStyleFO1MlWM) : android.graphics.Typeface.create(str, m4622getAndroidTypefaceStyleFO1MlWM);
    }

    /* renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ android.graphics.Typeface m4701createAndroidTypefaceUsingTypefaceStyleRetOiIg$default(PlatformTypefacesApi platformTypefacesApi, String str, FontWeight fontWeight, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = null;
        }
        if ((i12 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i12 & 4) != 0) {
            i11 = FontStyle.Companion.m4677getNormal_LCdwA();
        }
        return platformTypefacesApi.m4700createAndroidTypefaceUsingTypefaceStyleRetOiIg(str, fontWeight, i11);
    }

    /* renamed from: loadNamedFromTypefaceCacheOrNull-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m4702loadNamedFromTypefaceCacheOrNullRetOiIg(String str, FontWeight fontWeight, int i11) {
        if (str.length() == 0) {
            return null;
        }
        android.graphics.Typeface m4700createAndroidTypefaceUsingTypefaceStyleRetOiIg = m4700createAndroidTypefaceUsingTypefaceStyleRetOiIg(str, fontWeight, i11);
        if (g0.g(m4700createAndroidTypefaceUsingTypefaceStyleRetOiIg, android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, AndroidFontUtils_androidKt.m4622getAndroidTypefaceStyleFO1MlWM(fontWeight, i11))) || g0.g(m4700createAndroidTypefaceUsingTypefaceStyleRetOiIg, m4700createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, fontWeight, i11))) {
            return null;
        }
        return m4700createAndroidTypefaceUsingTypefaceStyleRetOiIg;
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    @k
    /* renamed from: createDefault-FO1MlWM */
    public android.graphics.Typeface mo4697createDefaultFO1MlWM(@k FontWeight fontWeight, int i11) {
        return m4700createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, fontWeight, i11);
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    @k
    /* renamed from: createNamed-RetOiIg */
    public android.graphics.Typeface mo4698createNamedRetOiIg(@k GenericFontFamily genericFontFamily, @k FontWeight fontWeight, int i11) {
        android.graphics.Typeface m4702loadNamedFromTypefaceCacheOrNullRetOiIg = m4702loadNamedFromTypefaceCacheOrNullRetOiIg(PlatformTypefaces_androidKt.getWeightSuffixForFallbackFamilyName(genericFontFamily.getName(), fontWeight), fontWeight, i11);
        return m4702loadNamedFromTypefaceCacheOrNullRetOiIg == null ? m4700createAndroidTypefaceUsingTypefaceStyleRetOiIg(genericFontFamily.getName(), fontWeight, i11) : m4702loadNamedFromTypefaceCacheOrNullRetOiIg;
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    @l
    /* renamed from: optionalOnDeviceFontFamilyByName-78DK7lM */
    public android.graphics.Typeface mo4699optionalOnDeviceFontFamilyByName78DK7lM(@k String str, @k FontWeight fontWeight, int i11, @k FontVariation.Settings settings, @k Context context) {
        FontFamily.Companion companion = FontFamily.Companion;
        return PlatformTypefaces_androidKt.setFontVariationSettings(g0.g(str, companion.getSansSerif().getName()) ? mo4698createNamedRetOiIg(companion.getSansSerif(), fontWeight, i11) : g0.g(str, companion.getSerif().getName()) ? mo4698createNamedRetOiIg(companion.getSerif(), fontWeight, i11) : g0.g(str, companion.getMonospace().getName()) ? mo4698createNamedRetOiIg(companion.getMonospace(), fontWeight, i11) : g0.g(str, companion.getCursive().getName()) ? mo4698createNamedRetOiIg(companion.getCursive(), fontWeight, i11) : m4702loadNamedFromTypefaceCacheOrNullRetOiIg(str, fontWeight, i11), settings, context);
    }
}
