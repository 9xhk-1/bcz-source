package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@RequiresApi(31)
/* loaded from: classes2.dex */
public final class AndroidComposeViewTranslationCallbackS {
    public static final int $stable = 0;

    @m80.k
    public static final AndroidComposeViewTranslationCallbackS INSTANCE = new AndroidComposeViewTranslationCallbackS();

    private AndroidComposeViewTranslationCallbackS() {
    }

    @DoNotInline
    @RequiresApi(31)
    public final void clearViewTranslationCallback(@m80.k View view) {
        view.clearViewTranslationCallback();
    }

    @DoNotInline
    @RequiresApi(31)
    public final void setViewTranslationCallback(@m80.k View view) {
        view.setViewTranslationCallback(m.a(AndroidComposeViewTranslationCallback.INSTANCE));
    }
}
