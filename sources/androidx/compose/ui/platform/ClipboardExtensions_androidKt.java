package androidx.compose.ui.platform;

import android.net.Uri;
import androidx.compose.ui.ExperimentalComposeUiApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class ClipboardExtensions_androidKt {
    @m80.l
    @ExperimentalComposeUiApi
    public static final Uri firstUriOrNull(@m80.k ClipEntry clipEntry) {
        int itemCount = clipEntry.getClipData().getItemCount();
        for (int i11 = 0; i11 < itemCount; i11++) {
            Uri uri = clipEntry.getClipData().getItemAt(i11).getUri();
            if (uri != null) {
                return uri;
            }
        }
        return null;
    }
}
