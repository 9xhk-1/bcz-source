package androidx.compose.ui.autofill;

import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@RequiresApi(27)
/* loaded from: classes.dex */
public final class AutofillApi27Helper {
    public static final int $stable = 0;

    @m80.k
    public static final AutofillApi27Helper INSTANCE = new AutofillApi27Helper();

    private AutofillApi27Helper() {
    }

    @RequiresApi(27)
    public final void notifyViewVisibilityChanged(@m80.k View view, @m80.k android.view.autofill.AutofillManager autofillManager, int i11, boolean z11) {
        autofillManager.notifyViewVisibilityChanged(view, i11, z11);
    }
}
