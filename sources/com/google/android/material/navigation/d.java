package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public final class d extends MenuBuilder {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final Class<?> f31826a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31827b;

    public d(@NonNull Context context, @NonNull Class<?> cls, int i11) {
        super(context);
        this.f31826a = cls;
        this.f31827b = i11;
    }

    public int a() {
        return this.f31827b;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    @NonNull
    public MenuItem addInternal(int i11, int i12, int i13, @NonNull CharSequence charSequence) {
        if (size() + 1 <= this.f31827b) {
            stopDispatchingItemsChanged();
            MenuItem addInternal = super.addInternal(i11, i12, i13, charSequence);
            if (addInternal instanceof MenuItemImpl) {
                ((MenuItemImpl) addInternal).setExclusiveCheckable(true);
            }
            startDispatchingItemsChanged();
            return addInternal;
        }
        String simpleName = this.f31826a.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + this.f31827b + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    @NonNull
    public SubMenu addSubMenu(int i11, int i12, int i13, @NonNull CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f31826a.getSimpleName() + " does not support submenus");
    }
}
