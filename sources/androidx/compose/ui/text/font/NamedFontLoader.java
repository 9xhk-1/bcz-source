package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.AndroidFont;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class NamedFontLoader implements AndroidFont.TypefaceLoader {

    @k
    public static final NamedFontLoader INSTANCE = new NamedFontLoader();

    private NamedFontLoader() {
    }

    @Override // androidx.compose.ui.text.font.AndroidFont.TypefaceLoader
    @l
    public Object awaitLoad(@k Context context, @k AndroidFont androidFont, @k j00.c<? super android.graphics.Typeface> cVar) {
        throw new UnsupportedOperationException("All preloaded fonts are optional local.");
    }

    @Override // androidx.compose.ui.text.font.AndroidFont.TypefaceLoader
    @l
    public android.graphics.Typeface loadBlocking(@k Context context, @k AndroidFont androidFont) {
        DeviceFontFamilyNameFont deviceFontFamilyNameFont = androidFont instanceof DeviceFontFamilyNameFont ? (DeviceFontFamilyNameFont) androidFont : null;
        if (deviceFontFamilyNameFont != null) {
            return deviceFontFamilyNameFont.loadCached(context);
        }
        return null;
    }
}
