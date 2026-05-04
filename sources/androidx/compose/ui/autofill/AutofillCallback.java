package androidx.compose.ui.autofill;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager$AutofillCallback;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@RequiresApi(26)
/* loaded from: classes.dex */
public final class AutofillCallback extends AutofillManager$AutofillCallback {
    public static final int $stable = 0;

    @m80.k
    public static final AutofillCallback INSTANCE = new AutofillCallback();

    private AutofillCallback() {
    }

    public void onAutofillEvent(@m80.k View view, int i11, int i12) {
        super.onAutofillEvent(view, i11, i12);
        Log.d("Autofill Status", i12 != 1 ? i12 != 2 ? i12 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account" : "Autofill popup was hidden." : "Autofill popup was shown.");
    }

    public final void register(@m80.k AndroidAutofill androidAutofill) {
        androidAutofill.getAutofillManager().registerCallback(y.a(this));
    }

    public final void unregister(@m80.k AndroidAutofill androidAutofill) {
        androidAutofill.getAutofillManager().unregisterCallback(y.a(this));
    }
}
