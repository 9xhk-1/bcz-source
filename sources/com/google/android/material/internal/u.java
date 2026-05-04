package com.google.android.material.internal;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.SubMenuBuilder;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class u extends SubMenuBuilder {
    public u(Context context, s sVar, MenuItemImpl menuItemImpl) {
        super(context, sVar, menuItemImpl);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public void onItemsChanged(boolean z11) {
        super.onItemsChanged(z11);
        ((MenuBuilder) getParentMenu()).onItemsChanged(z11);
    }
}
