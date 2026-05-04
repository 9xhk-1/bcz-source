package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.SubMenuBuilder;
import com.google.android.material.internal.ParcelableSparseArray;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class NavigationBarPresenter implements MenuPresenter {

    /* renamed from: a, reason: collision with root package name */
    public MenuBuilder f31779a;

    /* renamed from: b, reason: collision with root package name */
    public NavigationBarMenuView f31780b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f31781c = false;

    /* renamed from: d, reason: collision with root package name */
    public int f31782d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f31783a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        public ParcelableSparseArray f31784b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            @NonNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i11) {
            parcel.writeInt(this.f31783a);
            parcel.writeParcelable(this.f31784b, 0);
        }

        public SavedState(@NonNull Parcel parcel) {
            this.f31783a = parcel.readInt();
            this.f31784b = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }
    }

    public void a(int i11) {
        this.f31782d = i11;
    }

    public void b(@NonNull NavigationBarMenuView navigationBarMenuView) {
        this.f31780b = navigationBarMenuView;
    }

    public void c(boolean z11) {
        this.f31781c = z11;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean collapseItemActionView(@Nullable MenuBuilder menuBuilder, @Nullable MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean expandItemActionView(@Nullable MenuBuilder menuBuilder, @Nullable MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
        return this.f31782d;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    @Nullable
    public MenuView getMenuView(@Nullable ViewGroup viewGroup) {
        return this.f31780b;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(@NonNull Context context, @NonNull MenuBuilder menuBuilder) {
        this.f31779a = menuBuilder;
        this.f31780b.initialize(menuBuilder);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onRestoreInstanceState(@NonNull Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f31780b.q(savedState.f31783a);
            this.f31780b.o(com.google.android.material.badge.b.g(this.f31780b.getContext(), savedState.f31784b));
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.f31783a = this.f31780b.getSelectedItemId();
        savedState.f31784b = com.google.android.material.badge.b.h(this.f31780b.getBadgeDrawables());
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(@Nullable SubMenuBuilder subMenuBuilder) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean z11) {
        if (this.f31781c) {
            return;
        }
        if (z11) {
            this.f31780b.c();
        } else {
            this.f31780b.r();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(@Nullable MenuPresenter.Callback callback) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(@Nullable MenuBuilder menuBuilder, boolean z11) {
    }
}
