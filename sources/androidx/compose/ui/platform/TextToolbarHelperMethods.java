package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@RequiresApi(23)
/* loaded from: classes2.dex */
public final class TextToolbarHelperMethods {
    public static final int $stable = 0;

    @m80.k
    public static final TextToolbarHelperMethods INSTANCE = new TextToolbarHelperMethods();

    private TextToolbarHelperMethods() {
    }

    @RequiresApi(23)
    public final void invalidateContentRect(@m80.k ActionMode actionMode) {
        actionMode.invalidateContentRect();
    }

    @m80.l
    @RequiresApi(23)
    public final ActionMode startActionMode(@m80.k View view, @m80.k ActionMode.Callback callback, int i11) {
        return view.startActionMode(callback, i11);
    }
}
