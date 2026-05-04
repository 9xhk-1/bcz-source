package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(26)
/* loaded from: classes2.dex */
final class AndroidFontResourceLoaderHelper {

    @m80.k
    public static final AndroidFontResourceLoaderHelper INSTANCE = new AndroidFontResourceLoaderHelper();

    private AndroidFontResourceLoaderHelper() {
    }

    @RequiresApi(26)
    @m80.k
    public final Typeface create(@m80.k Context context, int i11) {
        Typeface font;
        font = context.getResources().getFont(i11);
        return font;
    }
}
