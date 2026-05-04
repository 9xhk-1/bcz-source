package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(29)
/* loaded from: classes2.dex */
final class AndroidComposeViewForceDarkModeQ {

    @m80.k
    public static final AndroidComposeViewForceDarkModeQ INSTANCE = new AndroidComposeViewForceDarkModeQ();

    private AndroidComposeViewForceDarkModeQ() {
    }

    @DoNotInline
    @RequiresApi(29)
    public final void disallowForceDark(@m80.k View view) {
        view.setForceDarkAllowed(false);
    }
}
