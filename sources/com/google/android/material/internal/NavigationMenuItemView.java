package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements MenuView.ItemView {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f31475r = {R.attr.state_checked};

    /* renamed from: g, reason: collision with root package name */
    public int f31476g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f31477h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f31478i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f31479j;

    /* renamed from: k, reason: collision with root package name */
    public final CheckedTextView f31480k;

    /* renamed from: l, reason: collision with root package name */
    public FrameLayout f31481l;

    /* renamed from: m, reason: collision with root package name */
    public MenuItemImpl f31482m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f31483n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f31484o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f31485p;

    /* renamed from: q, reason: collision with root package name */
    public final AccessibilityDelegateCompat f31486q;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends AccessibilityDelegateCompat {
        public a() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setCheckable(NavigationMenuItemView.this.f31478i);
        }
    }

    public NavigationMenuItemView(@NonNull Context context) {
        this(context, null);
    }

    private void setActionView(@Nullable View view) {
        if (view != null) {
            if (this.f31481l == null) {
                this.f31481l = (FrameLayout) ((ViewStub) findViewById(com.google.android.material.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f31481l.removeAllViews();
            this.f31481l.addView(view);
        }
    }

    public final void a() {
        if (e()) {
            this.f31480k.setVisibility(8);
            FrameLayout frameLayout = this.f31481l;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).width = -1;
                this.f31481l.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.f31480k.setVisibility(0);
        FrameLayout frameLayout2 = this.f31481l;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams2).width = -2;
            this.f31481l.setLayoutParams(layoutParams2);
        }
    }

    @Nullable
    public final StateListDrawable b() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(androidx.appcompat.R.attr.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f31475r, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    public void c(@NonNull MenuItemImpl menuItemImpl, boolean z11) {
        this.f31479j = z11;
        initialize(menuItemImpl, 0);
    }

    public void d() {
        FrameLayout frameLayout = this.f31481l;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.f31480k.setCompoundDrawables(null, null, null, null);
    }

    public final boolean e() {
        return this.f31482m.getTitle() == null && this.f31482m.getIcon() == null && this.f31482m.getActionView() != null;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public MenuItemImpl getItemData() {
        return this.f31482m;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void initialize(@NonNull MenuItemImpl menuItemImpl, int i11) {
        this.f31482m = menuItemImpl;
        if (menuItemImpl.getItemId() > 0) {
            setId(menuItemImpl.getItemId());
        }
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            ViewCompat.setBackground(this, b());
        }
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setTitle(menuItemImpl.getTitle());
        setIcon(menuItemImpl.getIcon());
        setActionView(menuItemImpl.getActionView());
        setContentDescription(menuItemImpl.getContentDescription());
        TooltipCompat.setTooltipText(this, menuItemImpl.getTooltipText());
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i11) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i11 + 1);
        MenuItemImpl menuItemImpl = this.f31482m;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && this.f31482m.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f31475r);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean prefersCondensedTitle() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean z11) {
        refreshDrawableState();
        if (this.f31478i != z11) {
            this.f31478i = z11;
            this.f31486q.sendAccessibilityEvent(this.f31480k, 2048);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean z11) {
        refreshDrawableState();
        this.f31480k.setChecked(z11);
        CheckedTextView checkedTextView = this.f31480k;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z11 && this.f31479j) ? 1 : 0);
    }

    public void setHorizontalPadding(int i11) {
        setPadding(i11, getPaddingTop(), i11, getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            if (this.f31484o) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = DrawableCompat.wrap(drawable).mutate();
                DrawableCompat.setTintList(drawable, this.f31483n);
            }
            int i11 = this.f31476g;
            drawable.setBounds(0, 0, i11, i11);
        } else if (this.f31477h) {
            if (this.f31485p == null) {
                Drawable drawable2 = ResourcesCompat.getDrawable(getResources(), com.google.android.material.R.drawable.navigation_empty_icon, getContext().getTheme());
                this.f31485p = drawable2;
                if (drawable2 != null) {
                    int i12 = this.f31476g;
                    drawable2.setBounds(0, 0, i12, i12);
                }
            }
            drawable = this.f31485p;
        }
        TextViewCompat.setCompoundDrawablesRelative(this.f31480k, drawable, null, null, null);
    }

    public void setIconPadding(int i11) {
        this.f31480k.setCompoundDrawablePadding(i11);
    }

    public void setIconSize(@Dimension int i11) {
        this.f31476g = i11;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f31483n = colorStateList;
        this.f31484o = colorStateList != null;
        MenuItemImpl menuItemImpl = this.f31482m;
        if (menuItemImpl != null) {
            setIcon(menuItemImpl.getIcon());
        }
    }

    public void setMaxLines(int i11) {
        this.f31480k.setMaxLines(i11);
    }

    public void setNeedsEmptyIcon(boolean z11) {
        this.f31477h = z11;
    }

    public void setTextAppearance(int i11) {
        TextViewCompat.setTextAppearance(this.f31480k, i11);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f31480k.setTextColor(colorStateList);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(CharSequence charSequence) {
        this.f31480k.setText(charSequence);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean showsIcon() {
        return true;
    }

    public NavigationMenuItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f31479j = true;
        a aVar = new a();
        this.f31486q = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.google.android.material.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.google.android.material.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.google.android.material.R.id.design_menu_item_text);
        this.f31480k = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        ViewCompat.setAccessibilityDelegate(checkedTextView, aVar);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setShortcut(boolean z11, char c11) {
    }
}
