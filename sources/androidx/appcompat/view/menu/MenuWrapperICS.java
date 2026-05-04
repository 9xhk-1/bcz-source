package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.RestrictTo;
import androidx.core.internal.view.SupportMenu;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class MenuWrapperICS extends BaseMenuWrapper implements Menu {
    private final SupportMenu mWrappedObject;

    public MenuWrapperICS(Context context, SupportMenu supportMenu) {
        super(context);
        if (supportMenu == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.mWrappedObject = supportMenu;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return getMenuItemWrapper(this.mWrappedObject.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i11, int i12, int i13, ComponentName componentName, Intent[] intentArr, Intent intent, int i14, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.mWrappedObject.addIntentOptions(i11, i12, i13, componentName, intentArr, intent, i14, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i15 = 0; i15 < length; i15++) {
                menuItemArr[i15] = getMenuItemWrapper(menuItemArr2[i15]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return getSubMenuWrapper(this.mWrappedObject.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        internalClear();
        this.mWrappedObject.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.mWrappedObject.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i11) {
        return getMenuItemWrapper(this.mWrappedObject.findItem(i11));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i11) {
        return getMenuItemWrapper(this.mWrappedObject.getItem(i11));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.mWrappedObject.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i11, KeyEvent keyEvent) {
        return this.mWrappedObject.isShortcutKey(i11, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i11, int i12) {
        return this.mWrappedObject.performIdentifierAction(i11, i12);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i11, KeyEvent keyEvent, int i12) {
        return this.mWrappedObject.performShortcut(i11, keyEvent, i12);
    }

    @Override // android.view.Menu
    public void removeGroup(int i11) {
        internalRemoveGroup(i11);
        this.mWrappedObject.removeGroup(i11);
    }

    @Override // android.view.Menu
    public void removeItem(int i11) {
        internalRemoveItem(i11);
        this.mWrappedObject.removeItem(i11);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i11, boolean z11, boolean z12) {
        this.mWrappedObject.setGroupCheckable(i11, z11, z12);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i11, boolean z11) {
        this.mWrappedObject.setGroupEnabled(i11, z11);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i11, boolean z11) {
        this.mWrappedObject.setGroupVisible(i11, z11);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z11) {
        this.mWrappedObject.setQwertyMode(z11);
    }

    @Override // android.view.Menu
    public int size() {
        return this.mWrappedObject.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i11) {
        return getMenuItemWrapper(this.mWrappedObject.add(i11));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i11) {
        return getSubMenuWrapper(this.mWrappedObject.addSubMenu(i11));
    }

    @Override // android.view.Menu
    public MenuItem add(int i11, int i12, int i13, CharSequence charSequence) {
        return getMenuItemWrapper(this.mWrappedObject.add(i11, i12, i13, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i11, int i12, int i13, CharSequence charSequence) {
        return getSubMenuWrapper(this.mWrappedObject.addSubMenu(i11, i12, i13, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i11, int i12, int i13, int i14) {
        return getMenuItemWrapper(this.mWrappedObject.add(i11, i12, i13, i14));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i11, int i12, int i13, int i14) {
        return getSubMenuWrapper(this.mWrappedObject.addSubMenu(i11, i12, i13, i14));
    }
}
