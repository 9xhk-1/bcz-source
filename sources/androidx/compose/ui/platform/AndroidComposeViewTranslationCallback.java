package androidx.compose.ui.platform;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(31)
/* loaded from: classes2.dex */
final class AndroidComposeViewTranslationCallback implements ViewTranslationCallback {

    @m80.k
    public static final AndroidComposeViewTranslationCallback INSTANCE = new AndroidComposeViewTranslationCallback();

    private AndroidComposeViewTranslationCallback() {
    }

    public boolean onClearTranslation(@m80.k View view) {
        kotlin.jvm.internal.g0.n(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager$ui_release().onClearTranslation$ui_release();
        return true;
    }

    public boolean onHideTranslation(@m80.k View view) {
        kotlin.jvm.internal.g0.n(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager$ui_release().onHideTranslation$ui_release();
        return true;
    }

    public boolean onShowTranslation(@m80.k View view) {
        kotlin.jvm.internal.g0.n(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager$ui_release().onShowTranslation$ui_release();
        return true;
    }
}
