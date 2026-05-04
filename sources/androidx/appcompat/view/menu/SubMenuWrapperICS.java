package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.core.internal.view.SupportSubMenu;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
class SubMenuWrapperICS extends MenuWrapperICS implements SubMenu {
    private final SupportSubMenu mSubMenu;

    public SubMenuWrapperICS(Context context, SupportSubMenu supportSubMenu) {
        super(context, supportSubMenu);
        this.mSubMenu = supportSubMenu;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.mSubMenu.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return getMenuItemWrapper(this.mSubMenu.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i11) {
        this.mSubMenu.setHeaderIcon(i11);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i11) {
        this.mSubMenu.setHeaderTitle(i11);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.mSubMenu.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i11) {
        this.mSubMenu.setIcon(i11);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.mSubMenu.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.mSubMenu.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.mSubMenu.setIcon(drawable);
        return this;
    }
}
