package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public abstract class ActionProvider {
    private static final String TAG = "ActionProvider(support)";
    private final Context mContext;
    private SubUiVisibilityListener mSubUiVisibilityListener;
    private VisibilityListener mVisibilityListener;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface SubUiVisibilityListener {
        void onSubUiVisibilityChanged(boolean z11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface VisibilityListener {
        void onActionProviderVisibilityChanged(boolean z11);
    }

    public ActionProvider(@NonNull Context context) {
        this.mContext = context;
    }

    @NonNull
    public Context getContext() {
        return this.mContext;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isVisible() {
        return true;
    }

    @NonNull
    public abstract View onCreateActionView();

    @NonNull
    public View onCreateActionView(@NonNull MenuItem menuItem) {
        return onCreateActionView();
    }

    public boolean onPerformDefaultAction() {
        return false;
    }

    public boolean overridesItemVisibility() {
        return false;
    }

    public void refreshVisibility() {
        if (this.mVisibilityListener == null || !overridesItemVisibility()) {
            return;
        }
        this.mVisibilityListener.onActionProviderVisibilityChanged(isVisible());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void reset() {
        this.mVisibilityListener = null;
        this.mSubUiVisibilityListener = null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSubUiVisibilityListener(@Nullable SubUiVisibilityListener subUiVisibilityListener) {
        this.mSubUiVisibilityListener = subUiVisibilityListener;
    }

    public void setVisibilityListener(@Nullable VisibilityListener visibilityListener) {
        if (this.mVisibilityListener != null && visibilityListener != null) {
            Log.w(TAG, "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.mVisibilityListener = visibilityListener;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void subUiVisibilityChanged(boolean z11) {
        SubUiVisibilityListener subUiVisibilityListener = this.mSubUiVisibilityListener;
        if (subUiVisibilityListener != null) {
            subUiVisibilityListener.onSubUiVisibilityChanged(z11);
        }
    }

    public void onPrepareSubMenu(@NonNull SubMenu subMenu) {
    }
}
