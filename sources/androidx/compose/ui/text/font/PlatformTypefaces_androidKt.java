package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.compose.ui.text.font.FontVariation;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class PlatformTypefaces_androidKt {
    @k
    public static final PlatformTypefaces PlatformTypefaces() {
        return Build.VERSION.SDK_INT >= 28 ? new PlatformTypefacesApi28() : new PlatformTypefacesApi();
    }

    @VisibleForTesting
    @k
    public static final String getWeightSuffixForFallbackFamilyName(@k String str, @k FontWeight fontWeight) {
        int weight = fontWeight.getWeight() / 100;
        if (weight >= 0 && weight < 2) {
            return str + "-thin";
        }
        if (2 <= weight && weight < 4) {
            return str + "-light";
        }
        if (weight == 4) {
            return str;
        }
        if (weight == 5) {
            return str + "-medium";
        }
        if (6 <= weight && weight < 8) {
            return str;
        }
        if (8 > weight || weight >= 11) {
            return str;
        }
        return str + "-black";
    }

    @l
    @ExperimentalTextApi
    public static final android.graphics.Typeface setFontVariationSettings(@l android.graphics.Typeface typeface, @k FontVariation.Settings settings, @k Context context) {
        return Build.VERSION.SDK_INT >= 26 ? TypefaceCompatApi26.INSTANCE.setFontVariationSettings(typeface, settings, context) : typeface;
    }
}
