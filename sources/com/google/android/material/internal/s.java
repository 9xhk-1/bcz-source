package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class s extends MenuBuilder {
    public s(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    @NonNull
    public SubMenu addSubMenu(int i11, int i12, int i13, CharSequence charSequence) {
        MenuItemImpl menuItemImpl = (MenuItemImpl) addInternal(i11, i12, i13, charSequence);
        u uVar = new u(getContext(), this, menuItemImpl);
        menuItemImpl.setSubMenu(uVar);
        return uVar;
    }
}
