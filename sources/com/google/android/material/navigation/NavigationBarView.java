package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.internal.d0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import vn.k;
import vn.l;
import vn.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class NavigationBarView extends FrameLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final int f31785g = -1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f31786h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f31787i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static final int f31788j = 2;

    /* renamed from: k, reason: collision with root package name */
    public static final int f31789k = 1;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final com.google.android.material.navigation.d f31790a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final NavigationBarMenuView f31791b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final NavigationBarPresenter f31792c;

    /* renamed from: d, reason: collision with root package name */
    public MenuInflater f31793d;

    /* renamed from: e, reason: collision with root package name */
    public d f31794e;

    /* renamed from: f, reason: collision with root package name */
    public c f31795f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        public Bundle f31796a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            @Nullable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void a(@NonNull Parcel parcel, ClassLoader classLoader) {
            this.f31796a = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeBundle(this.f31796a);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface b {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void a(@NonNull MenuItem menuItem);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d {
        boolean a(@NonNull MenuItem menuItem);
    }

    public NavigationBarView(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i11, @StyleRes int i12) {
        super(zn.a.c(context, attributeSet, i11, i12), attributeSet, i11);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.f31792c = navigationBarPresenter;
        Context context2 = getContext();
        int[] iArr = R.styleable.NavigationBarView;
        int i13 = R.styleable.NavigationBarView_itemTextAppearanceInactive;
        int i14 = R.styleable.NavigationBarView_itemTextAppearanceActive;
        TintTypedArray l11 = d0.l(context2, attributeSet, iArr, i11, i12, i13, i14);
        com.google.android.material.navigation.d dVar = new com.google.android.material.navigation.d(context2, getClass(), getMaxItemCount());
        this.f31790a = dVar;
        NavigationBarMenuView c11 = c(context2);
        this.f31791b = c11;
        navigationBarPresenter.b(c11);
        navigationBarPresenter.a(1);
        c11.setPresenter(navigationBarPresenter);
        dVar.addMenuPresenter(navigationBarPresenter);
        navigationBarPresenter.initForMenu(getContext(), dVar);
        int i15 = R.styleable.NavigationBarView_itemIconTint;
        if (l11.hasValue(i15)) {
            c11.setIconTintList(l11.getColorStateList(i15));
        } else {
            c11.setIconTintList(c11.d(android.R.attr.textColorSecondary));
        }
        setItemIconSize(l11.getDimensionPixelSize(R.styleable.NavigationBarView_itemIconSize, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (l11.hasValue(i13)) {
            setItemTextAppearanceInactive(l11.getResourceId(i13, 0));
        }
        if (l11.hasValue(i14)) {
            setItemTextAppearanceActive(l11.getResourceId(i14, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(l11.getBoolean(R.styleable.NavigationBarView_itemTextAppearanceActiveBoldEnabled, true));
        int i16 = R.styleable.NavigationBarView_itemTextColor;
        if (l11.hasValue(i16)) {
            setItemTextColor(l11.getColorStateList(i16));
        }
        Drawable background = getBackground();
        ColorStateList g11 = kn.d.g(background);
        if (background == null || g11 != null) {
            k kVar = new k(p.e(context2, attributeSet, i11, i12).m());
            if (g11 != null) {
                kVar.p0(g11);
            }
            kVar.a0(context2);
            ViewCompat.setBackground(this, kVar);
        }
        int i17 = R.styleable.NavigationBarView_itemPaddingTop;
        if (l11.hasValue(i17)) {
            setItemPaddingTop(l11.getDimensionPixelSize(i17, 0));
        }
        int i18 = R.styleable.NavigationBarView_itemPaddingBottom;
        if (l11.hasValue(i18)) {
            setItemPaddingBottom(l11.getDimensionPixelSize(i18, 0));
        }
        int i19 = R.styleable.NavigationBarView_activeIndicatorLabelPadding;
        if (l11.hasValue(i19)) {
            setActiveIndicatorLabelPadding(l11.getDimensionPixelSize(i19, 0));
        }
        if (l11.hasValue(R.styleable.NavigationBarView_elevation)) {
            setElevation(l11.getDimensionPixelSize(r10, 0));
        }
        DrawableCompat.setTintList(getBackground().mutate(), sn.c.b(context2, l11, R.styleable.NavigationBarView_backgroundTint));
        setLabelVisibilityMode(l11.getInteger(R.styleable.NavigationBarView_labelVisibilityMode, -1));
        int resourceId = l11.getResourceId(R.styleable.NavigationBarView_itemBackground, 0);
        if (resourceId != 0) {
            c11.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(sn.c.b(context2, l11, R.styleable.NavigationBarView_itemRippleColor));
        }
        int resourceId2 = l11.getResourceId(R.styleable.NavigationBarView_itemActiveIndicatorStyle, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, R.styleable.NavigationBarActiveIndicator);
            setItemActiveIndicatorWidth(obtainStyledAttributes.getDimensionPixelSize(R.styleable.NavigationBarActiveIndicator_android_width, 0));
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(R.styleable.NavigationBarActiveIndicator_android_height, 0));
            setItemActiveIndicatorMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(R.styleable.NavigationBarActiveIndicator_marginHorizontal, 0));
            setItemActiveIndicatorColor(sn.c.a(context2, obtainStyledAttributes, R.styleable.NavigationBarActiveIndicator_android_color));
            setItemActiveIndicatorShapeAppearance(p.b(context2, obtainStyledAttributes.getResourceId(R.styleable.NavigationBarActiveIndicator_shapeAppearance, 0), 0).m());
            obtainStyledAttributes.recycle();
        }
        int i21 = R.styleable.NavigationBarView_menu;
        if (l11.hasValue(i21)) {
            f(l11.getResourceId(i21, 0));
        }
        l11.recycle();
        addView(c11);
        dVar.setCallback(new a());
    }

    private MenuInflater getMenuInflater() {
        if (this.f31793d == null) {
            this.f31793d = new SupportMenuInflater(getContext());
        }
        return this.f31793d;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public abstract NavigationBarMenuView c(@NonNull Context context);

    @Nullable
    public com.google.android.material.badge.a d(int i11) {
        return this.f31791b.h(i11);
    }

    @NonNull
    public com.google.android.material.badge.a e(int i11) {
        return this.f31791b.i(i11);
    }

    public void f(int i11) {
        this.f31792c.c(true);
        getMenuInflater().inflate(i11, this.f31790a);
        this.f31792c.c(false);
        this.f31792c.updateMenuView(true);
    }

    public boolean g() {
        return this.f31791b.getItemActiveIndicatorEnabled();
    }

    @Px
    public int getActiveIndicatorLabelPadding() {
        return this.f31791b.getActiveIndicatorLabelPadding();
    }

    @Nullable
    public ColorStateList getItemActiveIndicatorColor() {
        return this.f31791b.getItemActiveIndicatorColor();
    }

    @Px
    public int getItemActiveIndicatorHeight() {
        return this.f31791b.getItemActiveIndicatorHeight();
    }

    @Px
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f31791b.getItemActiveIndicatorMarginHorizontal();
    }

    @Nullable
    public p getItemActiveIndicatorShapeAppearance() {
        return this.f31791b.getItemActiveIndicatorShapeAppearance();
    }

    @Px
    public int getItemActiveIndicatorWidth() {
        return this.f31791b.getItemActiveIndicatorWidth();
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.f31791b.getItemBackground();
    }

    @DrawableRes
    @Deprecated
    public int getItemBackgroundResource() {
        return this.f31791b.getItemBackgroundRes();
    }

    @Dimension
    public int getItemIconSize() {
        return this.f31791b.getItemIconSize();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.f31791b.getIconTintList();
    }

    @Px
    public int getItemPaddingBottom() {
        return this.f31791b.getItemPaddingBottom();
    }

    @Px
    public int getItemPaddingTop() {
        return this.f31791b.getItemPaddingTop();
    }

    @Nullable
    public ColorStateList getItemRippleColor() {
        return this.f31791b.getItemRippleColor();
    }

    @StyleRes
    public int getItemTextAppearanceActive() {
        return this.f31791b.getItemTextAppearanceActive();
    }

    @StyleRes
    public int getItemTextAppearanceInactive() {
        return this.f31791b.getItemTextAppearanceInactive();
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.f31791b.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f31791b.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    @NonNull
    public Menu getMenu() {
        return this.f31790a;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public MenuView getMenuView() {
        return this.f31791b;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavigationBarPresenter getPresenter() {
        return this.f31792c;
    }

    @IdRes
    public int getSelectedItemId() {
        return this.f31791b.getSelectedItemId();
    }

    public void h(int i11) {
        this.f31791b.m(i11);
    }

    public void i(int i11, @Nullable View.OnTouchListener onTouchListener) {
        this.f31791b.p(i11, onTouchListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        l.e(this);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f31790a.restorePresenterStates(savedState.f31796a);
    }

    @Override // android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f31796a = bundle;
        this.f31790a.savePresenterStates(bundle);
        return savedState;
    }

    public void setActiveIndicatorLabelPadding(@Px int i11) {
        this.f31791b.setActiveIndicatorLabelPadding(i11);
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        l.d(this, f11);
    }

    public void setItemActiveIndicatorColor(@Nullable ColorStateList colorStateList) {
        this.f31791b.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z11) {
        this.f31791b.setItemActiveIndicatorEnabled(z11);
    }

    public void setItemActiveIndicatorHeight(@Px int i11) {
        this.f31791b.setItemActiveIndicatorHeight(i11);
    }

    public void setItemActiveIndicatorMarginHorizontal(@Px int i11) {
        this.f31791b.setItemActiveIndicatorMarginHorizontal(i11);
    }

    public void setItemActiveIndicatorShapeAppearance(@Nullable p pVar) {
        this.f31791b.setItemActiveIndicatorShapeAppearance(pVar);
    }

    public void setItemActiveIndicatorWidth(@Px int i11) {
        this.f31791b.setItemActiveIndicatorWidth(i11);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.f31791b.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(@DrawableRes int i11) {
        this.f31791b.setItemBackgroundRes(i11);
    }

    public void setItemIconSize(@Dimension int i11) {
        this.f31791b.setItemIconSize(i11);
    }

    public void setItemIconSizeRes(@DimenRes int i11) {
        setItemIconSize(getResources().getDimensionPixelSize(i11));
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.f31791b.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(@Px int i11) {
        this.f31791b.setItemPaddingBottom(i11);
    }

    public void setItemPaddingTop(@Px int i11) {
        this.f31791b.setItemPaddingTop(i11);
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        this.f31791b.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(@StyleRes int i11) {
        this.f31791b.setItemTextAppearanceActive(i11);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z11) {
        this.f31791b.setItemTextAppearanceActiveBoldEnabled(z11);
    }

    public void setItemTextAppearanceInactive(@StyleRes int i11) {
        this.f31791b.setItemTextAppearanceInactive(i11);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.f31791b.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i11) {
        if (this.f31791b.getLabelVisibilityMode() != i11) {
            this.f31791b.setLabelVisibilityMode(i11);
            this.f31792c.updateMenuView(false);
        }
    }

    public void setOnItemReselectedListener(@Nullable c cVar) {
        this.f31795f = cVar;
    }

    public void setOnItemSelectedListener(@Nullable d dVar) {
        this.f31794e = dVar;
    }

    public void setSelectedItemId(@IdRes int i11) {
        MenuItem findItem = this.f31790a.findItem(i11);
        if (findItem == null || this.f31790a.performItemAction(findItem, this.f31792c, 0)) {
            return;
        }
        findItem.setChecked(true);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements MenuBuilder.Callback {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean onMenuItemSelected(MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
            if (NavigationBarView.this.f31795f == null || menuItem.getItemId() != NavigationBarView.this.getSelectedItemId()) {
                return (NavigationBarView.this.f31794e == null || NavigationBarView.this.f31794e.a(menuItem)) ? false : true;
            }
            NavigationBarView.this.f31795f.a(menuItem);
            return true;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public void onMenuModeChange(MenuBuilder menuBuilder) {
        }
    }
}
