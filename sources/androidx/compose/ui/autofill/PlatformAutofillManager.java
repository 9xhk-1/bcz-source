package androidx.compose.ui.autofill;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillValue;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(26)
/* loaded from: classes.dex */
public interface PlatformAutofillManager {
    void cancel();

    void commit();

    void notifyValueChanged(@m80.k View view, int i11, @m80.k AutofillValue autofillValue);

    void notifyViewEntered(@m80.k View view, int i11, @m80.k Rect rect);

    void notifyViewExited(@m80.k View view, int i11);

    void notifyViewVisibilityChanged(@m80.k View view, int i11, boolean z11);

    void requestAutofill(@m80.k View view, int i11, @m80.k Rect rect);
}
