package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.font.TypefaceHelperMethodsApi28;
import kotlin.jvm.internal.g0;
import m80.k;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@n(message = "This path for preloading loading fonts is not supported.")
/* loaded from: classes2.dex */
public final class AndroidGenericFontFamilyTypeface implements AndroidTypeface {
    public static final int $stable = 8;

    @k
    private final FontFamily fontFamily;

    @k
    private final Typeface nativeTypeface;

    public AndroidGenericFontFamilyTypeface(@k GenericFontFamily genericFontFamily) {
        this.fontFamily = genericFontFamily;
        Typeface create = Typeface.create(genericFontFamily.getName(), 0);
        g0.m(create);
        this.nativeTypeface = create;
    }

    /* renamed from: buildStyledTypeface-FO1MlWM, reason: not valid java name */
    private final Typeface m4811buildStyledTypefaceFO1MlWM(FontWeight fontWeight, int i11) {
        return Build.VERSION.SDK_INT < 28 ? Typeface.create(this.nativeTypeface, AndroidFontUtils_androidKt.m4622getAndroidTypefaceStyleFO1MlWM(fontWeight, i11)) : TypefaceHelperMethodsApi28.INSTANCE.create(this.nativeTypeface, fontWeight.getWeight(), FontStyle.m4670equalsimpl0(i11, FontStyle.Companion.m4676getItalic_LCdwA()));
    }

    @Override // androidx.compose.ui.text.font.Typeface
    @k
    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @Override // androidx.compose.ui.text.platform.AndroidTypeface
    @k
    /* renamed from: getNativeTypeface-PYhJU0U */
    public Typeface mo4810getNativeTypefacePYhJU0U(@k FontWeight fontWeight, int i11, int i12) {
        return m4811buildStyledTypefaceFO1MlWM(fontWeight, i11);
    }
}
