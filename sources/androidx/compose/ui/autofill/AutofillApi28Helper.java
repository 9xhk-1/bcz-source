package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@RequiresApi(28)
/* loaded from: classes.dex */
public final class AutofillApi28Helper {
    public static final int $stable = 0;

    @m80.k
    public static final AutofillApi28Helper INSTANCE = new AutofillApi28Helper();

    private AutofillApi28Helper() {
    }

    @RequiresApi(28)
    public final void setMaxTextLength(@m80.k ViewStructure viewStructure, int i11) {
        viewStructure.setMaxTextLength(i11);
    }
}
