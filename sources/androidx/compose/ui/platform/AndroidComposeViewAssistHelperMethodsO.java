package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewStructure;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(23)
/* loaded from: classes2.dex */
final class AndroidComposeViewAssistHelperMethodsO {

    @m80.k
    public static final AndroidComposeViewAssistHelperMethodsO INSTANCE = new AndroidComposeViewAssistHelperMethodsO();

    private AndroidComposeViewAssistHelperMethodsO() {
    }

    @DoNotInline
    @RequiresApi(23)
    public final void setClassName(@m80.k ViewStructure viewStructure, @m80.k View view) {
        viewStructure.setClassName(view.getAccessibilityClassName().toString());
    }
}
