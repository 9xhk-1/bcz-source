package androidx.compose.ui.platform.actionmodecallback;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class PrimaryTextActionModeCallback implements ActionMode.Callback {
    public static final int $stable = 8;

    @k
    private final TextActionModeCallback callback;

    public PrimaryTextActionModeCallback(@k TextActionModeCallback textActionModeCallback) {
        this.callback = textActionModeCallback;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(@l ActionMode actionMode, @l MenuItem menuItem) {
        return this.callback.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(@l ActionMode actionMode, @l Menu menu) {
        return this.callback.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(@l ActionMode actionMode) {
        this.callback.onDestroyActionMode();
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(@l ActionMode actionMode, @l Menu menu) {
        return this.callback.onPrepareActionMode(actionMode, menu);
    }
}
