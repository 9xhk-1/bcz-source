package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.FontWeight;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class AndroidFontUtils_androidKt {
    @k
    public static final FontWeight getAndroidBold(@k FontWeight.Companion companion) {
        return companion.getW600();
    }

    public static final int getAndroidTypefaceStyle(boolean z11, boolean z12) {
        if (z12 && z11) {
            return 3;
        }
        if (z11) {
            return 1;
        }
        return z12 ? 2 : 0;
    }

    /* renamed from: getAndroidTypefaceStyle-FO1MlWM, reason: not valid java name */
    public static final int m4622getAndroidTypefaceStyleFO1MlWM(@k FontWeight fontWeight, int i11) {
        return getAndroidTypefaceStyle(fontWeight.compareTo(getAndroidBold(FontWeight.Companion)) >= 0, FontStyle.m4670equalsimpl0(i11, FontStyle.Companion.m4676getItalic_LCdwA()));
    }
}
