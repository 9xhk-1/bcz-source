package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public abstract class ActionMode {
    private Object mTag;
    private boolean mTitleOptionalHint;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Callback {
        boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem);

        boolean onCreateActionMode(ActionMode actionMode, Menu menu);

        void onDestroyActionMode(ActionMode actionMode);

        boolean onPrepareActionMode(ActionMode actionMode, Menu menu);
    }

    public abstract void finish();

    public abstract View getCustomView();

    public abstract Menu getMenu();

    public abstract MenuInflater getMenuInflater();

    public abstract CharSequence getSubtitle();

    public Object getTag() {
        return this.mTag;
    }

    public abstract CharSequence getTitle();

    public boolean getTitleOptionalHint() {
        return this.mTitleOptionalHint;
    }

    public abstract void invalidate();

    public boolean isTitleOptional() {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isUiFocusable() {
        return true;
    }

    public abstract void setCustomView(View view);

    public abstract void setSubtitle(int i11);

    public abstract void setSubtitle(CharSequence charSequence);

    public void setTag(Object obj) {
        this.mTag = obj;
    }

    public abstract void setTitle(int i11);

    public abstract void setTitle(CharSequence charSequence);

    public void setTitleOptionalHint(boolean z11) {
        this.mTitleOptionalHint = z11;
    }
}
