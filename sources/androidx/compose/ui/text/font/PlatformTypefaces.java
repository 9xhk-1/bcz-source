package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.FontVariation;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface PlatformTypefaces {
    @k
    /* renamed from: createDefault-FO1MlWM, reason: not valid java name */
    android.graphics.Typeface mo4697createDefaultFO1MlWM(@k FontWeight fontWeight, int i11);

    @k
    /* renamed from: createNamed-RetOiIg, reason: not valid java name */
    android.graphics.Typeface mo4698createNamedRetOiIg(@k GenericFontFamily genericFontFamily, @k FontWeight fontWeight, int i11);

    @l
    /* renamed from: optionalOnDeviceFontFamilyByName-78DK7lM, reason: not valid java name */
    android.graphics.Typeface mo4699optionalOnDeviceFontFamilyByName78DK7lM(@k String str, @k FontWeight fontWeight, int i11, @k FontVariation.Settings settings, @k Context context);
}
