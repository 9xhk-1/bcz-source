package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.TypefaceHelperMethodsApi28;
import m80.k;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@n(message = "This path for preloading fonts is not supported")
/* loaded from: classes2.dex */
public final class AndroidDefaultTypeface implements AndroidTypeface {
    public static final int $stable = 0;

    @k
    private final FontFamily fontFamily = FontFamily.Companion.getDefault();

    @Override // androidx.compose.ui.text.font.Typeface
    @k
    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @Override // androidx.compose.ui.text.platform.AndroidTypeface
    @k
    /* renamed from: getNativeTypeface-PYhJU0U, reason: not valid java name */
    public Typeface mo4810getNativeTypefacePYhJU0U(@k FontWeight fontWeight, int i11, int i12) {
        return Build.VERSION.SDK_INT < 28 ? Typeface.defaultFromStyle(AndroidFontUtils_androidKt.m4622getAndroidTypefaceStyleFO1MlWM(fontWeight, i11)) : TypefaceHelperMethodsApi28.INSTANCE.create(Typeface.DEFAULT, fontWeight.getWeight(), FontStyle.m4670equalsimpl0(i11, FontStyle.Companion.m4676getItalic_LCdwA()));
    }
}
