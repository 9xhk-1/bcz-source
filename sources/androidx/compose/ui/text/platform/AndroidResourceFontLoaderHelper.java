package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.RequiresApi;
import m80.k;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(26)
@n(message = "Only used by deprecated APIs in this file, remove with them.")
/* loaded from: classes2.dex */
final class AndroidResourceFontLoaderHelper {

    @k
    public static final AndroidResourceFontLoaderHelper INSTANCE = new AndroidResourceFontLoaderHelper();

    private AndroidResourceFontLoaderHelper() {
    }

    @RequiresApi(26)
    @k
    public final Typeface create(@k Context context, int i11) {
        Typeface font;
        font = context.getResources().getFont(i11);
        return font;
    }
}
