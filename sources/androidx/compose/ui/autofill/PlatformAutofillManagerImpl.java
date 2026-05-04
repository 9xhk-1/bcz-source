package androidx.compose.ui.autofill;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillValue;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@RequiresApi(26)
/* loaded from: classes.dex */
public final class PlatformAutofillManagerImpl implements PlatformAutofillManager {
    public static final int $stable = 8;

    @m80.k
    private final android.view.autofill.AutofillManager platformAndroidManager;

    public PlatformAutofillManagerImpl(@m80.k android.view.autofill.AutofillManager autofillManager) {
        this.platformAndroidManager = autofillManager;
    }

    @Override // androidx.compose.ui.autofill.PlatformAutofillManager
    public void cancel() {
        this.platformAndroidManager.cancel();
    }

    @Override // androidx.compose.ui.autofill.PlatformAutofillManager
    public void commit() {
        this.platformAndroidManager.commit();
    }

    @m80.k
    public final android.view.autofill.AutofillManager getPlatformAndroidManager() {
        return this.platformAndroidManager;
    }

    @Override // androidx.compose.ui.autofill.PlatformAutofillManager
    public void notifyValueChanged(@m80.k View view, int i11, @m80.k AutofillValue autofillValue) {
        this.platformAndroidManager.notifyValueChanged(view, i11, autofillValue);
    }

    @Override // androidx.compose.ui.autofill.PlatformAutofillManager
    public void notifyViewEntered(@m80.k View view, int i11, @m80.k Rect rect) {
        this.platformAndroidManager.notifyViewEntered(view, i11, rect);
    }

    @Override // androidx.compose.ui.autofill.PlatformAutofillManager
    public void notifyViewExited(@m80.k View view, int i11) {
        this.platformAndroidManager.notifyViewExited(view, i11);
    }

    @Override // androidx.compose.ui.autofill.PlatformAutofillManager
    public void notifyViewVisibilityChanged(@m80.k View view, int i11, boolean z11) {
        if (Build.VERSION.SDK_INT >= 27) {
            AutofillApi27Helper.INSTANCE.notifyViewVisibilityChanged(view, this.platformAndroidManager, i11, z11);
        }
    }

    @Override // androidx.compose.ui.autofill.PlatformAutofillManager
    public void requestAutofill(@m80.k View view, int i11, @m80.k Rect rect) {
        this.platformAndroidManager.requestAutofill(view, i11, rect);
    }
}
