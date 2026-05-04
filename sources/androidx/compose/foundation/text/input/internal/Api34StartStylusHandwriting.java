package androidx.compose.foundation.text.input.internal;

import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@RequiresApi(34)
/* loaded from: classes.dex */
public final class Api34StartStylusHandwriting {
    public static final int $stable = 0;

    @m80.k
    public static final Api34StartStylusHandwriting INSTANCE = new Api34StartStylusHandwriting();

    private Api34StartStylusHandwriting() {
    }

    public final void startStylusHandwriting(@m80.k android.view.inputmethod.InputMethodManager inputMethodManager, @m80.k View view) {
        inputMethodManager.startStylusHandwriting(view);
    }
}
