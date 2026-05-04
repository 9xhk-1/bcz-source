package com.google.android.material.navigation;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.core.util.Pools;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.google.android.material.internal.b0;
import java.util.HashSet;
import pn.j;
import vn.k;
import vn.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public abstract class NavigationBarMenuView extends ViewGroup implements MenuView {
    public static final int F = 5;
    public static final int G = -1;
    public static final int[] H = {R.attr.state_checked};
    public static final int[] I = {-16842910};
    public p A;
    public boolean B;
    public ColorStateList C;
    public NavigationBarPresenter D;
    public MenuBuilder E;

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public final TransitionSet f31752a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final View.OnClickListener f31753b;

    /* renamed from: c, reason: collision with root package name */
    public final Pools.Pool<NavigationBarItemView> f31754c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final SparseArray<View.OnTouchListener> f31755d;

    /* renamed from: e, reason: collision with root package name */
    public int f31756e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public NavigationBarItemView[] f31757f;

    /* renamed from: g, reason: collision with root package name */
    public int f31758g;

    /* renamed from: h, reason: collision with root package name */
    public int f31759h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public ColorStateList f31760i;

    /* renamed from: j, reason: collision with root package name */
    @Dimension
    public int f31761j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f31762k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public final ColorStateList f31763l;

    /* renamed from: m, reason: collision with root package name */
    @StyleRes
    public int f31764m;

    /* renamed from: n, reason: collision with root package name */
    @StyleRes
    public int f31765n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f31766o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f31767p;

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    public ColorStateList f31768q;

    /* renamed from: r, reason: collision with root package name */
    public int f31769r;

    /* renamed from: s, reason: collision with root package name */
    @NonNull
    public final SparseArray<com.google.android.material.badge.a> f31770s;

    /* renamed from: t, reason: collision with root package name */
    public int f31771t;

    /* renamed from: u, reason: collision with root package name */
    public int f31772u;

    /* renamed from: v, reason: collision with root package name */
    public int f31773v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f31774w;

    /* renamed from: x, reason: collision with root package name */
    public int f31775x;

    /* renamed from: y, reason: collision with root package name */
    public int f31776y;

    /* renamed from: z, reason: collision with root package name */
    public int f31777z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MenuItemImpl itemData = ((NavigationBarItemView) view).getItemData();
            if (NavigationBarMenuView.this.E.performItemAction(itemData, NavigationBarMenuView.this.D, 0)) {
                return;
            }
            itemData.setChecked(true);
        }
    }

    public NavigationBarMenuView(@NonNull Context context) {
        super(context);
        this.f31754c = new Pools.SynchronizedPool(5);
        this.f31755d = new SparseArray<>(5);
        this.f31758g = 0;
        this.f31759h = 0;
        this.f31770s = new SparseArray<>(5);
        this.f31771t = -1;
        this.f31772u = -1;
        this.f31773v = -1;
        this.B = false;
        this.f31763l = d(R.attr.textColorSecondary);
        if (isInEditMode()) {
            this.f31752a = null;
        } else {
            AutoTransition autoTransition = new AutoTransition();
            this.f31752a = autoTransition;
            autoTransition.setOrdering(0);
            autoTransition.setDuration(j.f(getContext(), com.google.android.material.R.attr.motionDurationMedium4, getResources().getInteger(com.google.android.material.R.integer.material_motion_duration_long_1)));
            autoTransition.setInterpolator(j.g(getContext(), com.google.android.material.R.attr.motionEasingStandard, vm.b.f94061b));
            autoTransition.addTransition(new b0());
        }
        this.f31753b = new a();
        ViewCompat.setImportantForAccessibility(this, 1);
    }

    private NavigationBarItemView getNewItem() {
        NavigationBarItemView acquire = this.f31754c.acquire();
        return acquire == null ? f(getContext()) : acquire;
    }

    private void setBadgeIfNeeded(@NonNull NavigationBarItemView navigationBarItemView) {
        com.google.android.material.badge.a aVar;
        int id2 = navigationBarItemView.getId();
        if (l(id2) && (aVar = this.f31770s.get(id2)) != null) {
            navigationBarItemView.setBadge(aVar);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void c() {
        removeAllViews();
        NavigationBarItemView[] navigationBarItemViewArr = this.f31757f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView != null) {
                    this.f31754c.release(navigationBarItemView);
                    navigationBarItemView.f();
                }
            }
        }
        if (this.E.size() == 0) {
            this.f31758g = 0;
            this.f31759h = 0;
            this.f31757f = null;
            return;
        }
        n();
        this.f31757f = new NavigationBarItemView[this.E.size()];
        boolean k11 = k(this.f31756e, this.E.getVisibleItems().size());
        for (int i11 = 0; i11 < this.E.size(); i11++) {
            this.D.c(true);
            this.E.getItem(i11).setCheckable(true);
            this.D.c(false);
            NavigationBarItemView newItem = getNewItem();
            this.f31757f[i11] = newItem;
            newItem.setIconTintList(this.f31760i);
            newItem.setIconSize(this.f31761j);
            newItem.setTextColor(this.f31763l);
            newItem.setTextAppearanceInactive(this.f31764m);
            newItem.setTextAppearanceActive(this.f31765n);
            newItem.setTextAppearanceActiveBoldEnabled(this.f31766o);
            newItem.setTextColor(this.f31762k);
            int i12 = this.f31771t;
            if (i12 != -1) {
                newItem.setItemPaddingTop(i12);
            }
            int i13 = this.f31772u;
            if (i13 != -1) {
                newItem.setItemPaddingBottom(i13);
            }
            int i14 = this.f31773v;
            if (i14 != -1) {
                newItem.setActiveIndicatorLabelPadding(i14);
            }
            newItem.setActiveIndicatorWidth(this.f31775x);
            newItem.setActiveIndicatorHeight(this.f31776y);
            newItem.setActiveIndicatorMarginHorizontal(this.f31777z);
            newItem.setActiveIndicatorDrawable(e());
            newItem.setActiveIndicatorResizeable(this.B);
            newItem.setActiveIndicatorEnabled(this.f31774w);
            Drawable drawable = this.f31767p;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f31769r);
            }
            newItem.setItemRippleColor(this.f31768q);
            newItem.setShifting(k11);
            newItem.setLabelVisibilityMode(this.f31756e);
            MenuItemImpl menuItemImpl = (MenuItemImpl) this.E.getItem(i11);
            newItem.initialize(menuItemImpl, 0);
            newItem.setItemPosition(i11);
            int itemId = menuItemImpl.getItemId();
            newItem.setOnTouchListener(this.f31755d.get(itemId));
            newItem.setOnClickListener(this.f31753b);
            int i15 = this.f31758g;
            if (i15 != 0 && itemId == i15) {
                this.f31759h = i11;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.E.size() - 1, this.f31759h);
        this.f31759h = min;
        this.E.getItem(min).setChecked(true);
    }

    @Nullable
    public ColorStateList d(int i11) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i11, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = AppCompatResources.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(androidx.appcompat.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i12 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = I;
        return new ColorStateList(new int[][]{iArr, H, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i12, defaultColor});
    }

    @Nullable
    public final Drawable e() {
        if (this.A == null || this.C == null) {
            return null;
        }
        k kVar = new k(this.A);
        kVar.p0(this.C);
        return kVar;
    }

    @NonNull
    public abstract NavigationBarItemView f(@NonNull Context context);

    @Nullable
    public NavigationBarItemView g(int i11) {
        s(i11);
        NavigationBarItemView[] navigationBarItemViewArr = this.f31757f;
        if (navigationBarItemViewArr == null) {
            return null;
        }
        for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
            if (navigationBarItemView.getId() == i11) {
                return navigationBarItemView;
            }
        }
        return null;
    }

    @Px
    public int getActiveIndicatorLabelPadding() {
        return this.f31773v;
    }

    public SparseArray<com.google.android.material.badge.a> getBadgeDrawables() {
        return this.f31770s;
    }

    @Nullable
    public ColorStateList getIconTintList() {
        return this.f31760i;
    }

    @Nullable
    public ColorStateList getItemActiveIndicatorColor() {
        return this.C;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f31774w;
    }

    @Px
    public int getItemActiveIndicatorHeight() {
        return this.f31776y;
    }

    @Px
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f31777z;
    }

    @Nullable
    public p getItemActiveIndicatorShapeAppearance() {
        return this.A;
    }

    @Px
    public int getItemActiveIndicatorWidth() {
        return this.f31775x;
    }

    @Nullable
    public Drawable getItemBackground() {
        NavigationBarItemView[] navigationBarItemViewArr = this.f31757f;
        return (navigationBarItemViewArr == null || navigationBarItemViewArr.length <= 0) ? this.f31767p : navigationBarItemViewArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f31769r;
    }

    @Dimension
    public int getItemIconSize() {
        return this.f31761j;
    }

    @Px
    public int getItemPaddingBottom() {
        return this.f31772u;
    }

    @Px
    public int getItemPaddingTop() {
        return this.f31771t;
    }

    @Nullable
    public ColorStateList getItemRippleColor() {
        return this.f31768q;
    }

    @StyleRes
    public int getItemTextAppearanceActive() {
        return this.f31765n;
    }

    @StyleRes
    public int getItemTextAppearanceInactive() {
        return this.f31764m;
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.f31762k;
    }

    public int getLabelVisibilityMode() {
        return this.f31756e;
    }

    @Nullable
    public MenuBuilder getMenu() {
        return this.E;
    }

    public int getSelectedItemId() {
        return this.f31758g;
    }

    public int getSelectedItemPosition() {
        return this.f31759h;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public int getWindowAnimations() {
        return 0;
    }

    @Nullable
    public com.google.android.material.badge.a h(int i11) {
        return this.f31770s.get(i11);
    }

    public com.google.android.material.badge.a i(int i11) {
        s(i11);
        com.google.android.material.badge.a aVar = this.f31770s.get(i11);
        if (aVar == null) {
            aVar = com.google.android.material.badge.a.f(getContext());
            this.f31770s.put(i11, aVar);
        }
        NavigationBarItemView g11 = g(i11);
        if (g11 != null) {
            g11.setBadge(aVar);
        }
        return aVar;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public void initialize(@NonNull MenuBuilder menuBuilder) {
        this.E = menuBuilder;
    }

    public boolean j() {
        return this.B;
    }

    public boolean k(int i11, int i12) {
        return i11 == -1 ? i12 > 3 : i11 == 0;
    }

    public final boolean l(int i11) {
        return i11 != -1;
    }

    public void m(int i11) {
        s(i11);
        NavigationBarItemView g11 = g(i11);
        if (g11 != null) {
            g11.n();
        }
        this.f31770s.put(i11, null);
    }

    public final void n() {
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < this.E.size(); i11++) {
            hashSet.add(Integer.valueOf(this.E.getItem(i11).getItemId()));
        }
        for (int i12 = 0; i12 < this.f31770s.size(); i12++) {
            int keyAt = this.f31770s.keyAt(i12);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.f31770s.delete(keyAt);
            }
        }
    }

    public void o(SparseArray<com.google.android.material.badge.a> sparseArray) {
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            int keyAt = sparseArray.keyAt(i11);
            if (this.f31770s.indexOfKey(keyAt) < 0) {
                this.f31770s.append(keyAt, sparseArray.get(keyAt));
            }
        }
        NavigationBarItemView[] navigationBarItemViewArr = this.f31757f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                com.google.android.material.badge.a aVar = this.f31770s.get(navigationBarItemView.getId());
                if (aVar != null) {
                    navigationBarItemView.setBadge(aVar);
                }
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, this.E.getVisibleItems().size(), false, 1));
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void p(int i11, @Nullable View.OnTouchListener onTouchListener) {
        if (onTouchListener == null) {
            this.f31755d.remove(i11);
        } else {
            this.f31755d.put(i11, onTouchListener);
        }
        NavigationBarItemView[] navigationBarItemViewArr = this.f31757f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView.getItemData().getItemId() == i11) {
                    navigationBarItemView.setOnTouchListener(onTouchListener);
                }
            }
        }
    }

    public void q(int i11) {
        int size = this.E.size();
        for (int i12 = 0; i12 < size; i12++) {
            MenuItem item = this.E.getItem(i12);
            if (i11 == item.getItemId()) {
                this.f31758g = i11;
                this.f31759h = i12;
                item.setChecked(true);
                return;
            }
        }
    }

    public void r() {
        TransitionSet transitionSet;
        MenuBuilder menuBuilder = this.E;
        if (menuBuilder == null || this.f31757f == null) {
            return;
        }
        int size = menuBuilder.size();
        if (size != this.f31757f.length) {
            c();
            return;
        }
        int i11 = this.f31758g;
        for (int i12 = 0; i12 < size; i12++) {
            MenuItem item = this.E.getItem(i12);
            if (item.isChecked()) {
                this.f31758g = item.getItemId();
                this.f31759h = i12;
            }
        }
        if (i11 != this.f31758g && (transitionSet = this.f31752a) != null) {
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        boolean k11 = k(this.f31756e, this.E.getVisibleItems().size());
        for (int i13 = 0; i13 < size; i13++) {
            this.D.c(true);
            this.f31757f[i13].setLabelVisibilityMode(this.f31756e);
            this.f31757f[i13].setShifting(k11);
            this.f31757f[i13].initialize((MenuItemImpl) this.E.getItem(i13), 0);
            this.D.c(false);
        }
    }

    public final void s(int i11) {
        if (l(i11)) {
            return;
        }
        throw new IllegalArgumentException(i11 + " is not a valid view id");
    }

    public void setActiveIndicatorLabelPadding(@Px int i11) {
        this.f31773v = i11;
        NavigationBarItemView[] navigationBarItemViewArr = this.f31757f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorLabelPadding(i11);
            }
        }
    }

    public void setIconTintList(@Nullable ColorStateList colorStateList) {
        this.f31760i = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f31757f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(@Nullable ColorStateList colorStateList) {
        this.C = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f31757f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorDrawable(e());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z11) {
        this.f31774w = z11;
        NavigationBarItemView[] navigationBarItemViewArr = this.f31757f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorEnabled(z11);
            }
        }
    }

    public void setItemActiveIndicatorHeight(@Px int i11) {
        this.f31776y = i11;
        NavigationBarItemView[] navigationBarItemViewArr = this.f31757f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorHeight(i11);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(@Px int i11) {
        this.f31777z = i11;
        NavigationBarItemView[] navigationBarItemViewArr = this.f31757f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorMarginHorizontal(i11);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z11) {
        this.B = z11;
        NavigationBarItemView[] navigationBarItemViewArr = this.f31757f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorResizeable(z11);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(@Nullable p pVar) {
        this.A = pVar;
        NavigationBarItemView[] navigationBarItemViewArr = this.f31757f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorDrawable(e());
            }
        }
    }

    public void setItemActiveIndicatorWidth(@Px int i11) {
        this.f31775x = i11;
        NavigationBarItemView[] navigationBarItemViewArr = this.f31757f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorWidth(i11);
            }
        }
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.f31767p = drawable;
        NavigationBarItemView[] navigationBarItemViewArr = this.f31757f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i11) {
        this.f31769r = i11;
        NavigationBarItemView[] navigationBarItemViewArr = this.f31757f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemBackground(i11);
            }
        }
    }

    public void setItemIconSize(@Dimension int i11) {
        this.f31761j = i11;
        NavigationBarItemView[] navigationBarItemViewArr = this.f31757f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setIconSize(i11);
            }
        }
    }

    public void setItemPaddingBottom(@Px int i11) {
        this.f31772u = i11;
        NavigationBarItemView[] navigationBarItemViewArr = this.f31757f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemPaddingBottom(i11);
            }
        }
    }

    public void setItemPaddingTop(@Px int i11) {
        this.f31771t = i11;
        NavigationBarItemView[] navigationBarItemViewArr = this.f31757f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemPaddingTop(i11);
            }
        }
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        this.f31768q = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f31757f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(@StyleRes int i11) {
        this.f31765n = i11;
        NavigationBarItemView[] navigationBarItemViewArr = this.f31757f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceActive(i11);
                ColorStateList colorStateList = this.f31762k;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z11) {
        this.f31766o = z11;
        NavigationBarItemView[] navigationBarItemViewArr = this.f31757f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceActiveBoldEnabled(z11);
            }
        }
    }

    public void setItemTextAppearanceInactive(@StyleRes int i11) {
        this.f31764m = i11;
        NavigationBarItemView[] navigationBarItemViewArr = this.f31757f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceInactive(i11);
                ColorStateList colorStateList = this.f31762k;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.f31762k = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f31757f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i11) {
        this.f31756e = i11;
    }

    public void setPresenter(@NonNull NavigationBarPresenter navigationBarPresenter) {
        this.D = navigationBarPresenter;
    }
}
