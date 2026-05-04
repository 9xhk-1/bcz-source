package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(26)
/* loaded from: classes2.dex */
final class AndroidComposeViewVerificationHelperMethodsO {

    @m80.k
    public static final AndroidComposeViewVerificationHelperMethodsO INSTANCE = new AndroidComposeViewVerificationHelperMethodsO();

    private AndroidComposeViewVerificationHelperMethodsO() {
    }

    @DoNotInline
    @RequiresApi(26)
    public final void focusable(@m80.k View view, int i11, boolean z11) {
        view.setFocusable(i11);
        view.setDefaultFocusHighlightEnabled(z11);
    }
}
