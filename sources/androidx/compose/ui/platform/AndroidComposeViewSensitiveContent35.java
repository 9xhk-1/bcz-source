package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(35)
/* loaded from: classes2.dex */
final class AndroidComposeViewSensitiveContent35 {

    @m80.k
    public static final AndroidComposeViewSensitiveContent35 INSTANCE = new AndroidComposeViewSensitiveContent35();

    private AndroidComposeViewSensitiveContent35() {
    }

    @DoNotInline
    @RequiresApi(35)
    public final void setContentSensitivity(@m80.k View view, boolean z11) {
        if (z11) {
            view.setContentSensitivity(1);
        } else {
            view.setContentSensitivity(0);
        }
    }
}
