package androidx.compose.ui.tooling;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.text.font.ResourceFont;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(26)
/* loaded from: classes2.dex */
final class ResourceFontHelper {

    @k
    public static final ResourceFontHelper INSTANCE = new ResourceFontHelper();

    private ResourceFontHelper() {
    }

    @k
    public final Typeface load(@k Context context, @k ResourceFont resourceFont) {
        Typeface font;
        font = context.getResources().getFont(resourceFont.getResId());
        return font;
    }
}
