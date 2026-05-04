package com.google.android.material.navigationrail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.R;
import com.google.android.material.internal.d0;
import com.google.android.material.internal.m0;
import com.google.android.material.navigation.NavigationBarView;
import sn.c;
import vm.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class NavigationRailView extends NavigationBarView {

    /* renamed from: q, reason: collision with root package name */
    public static final int f31830q = 49;

    /* renamed from: r, reason: collision with root package name */
    public static final int f31831r = 7;

    /* renamed from: s, reason: collision with root package name */
    public static final int f31832s = 49;

    /* renamed from: t, reason: collision with root package name */
    public static final int f31833t = -1;

    /* renamed from: l, reason: collision with root package name */
    public final int f31834l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public View f31835m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public Boolean f31836n;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    public Boolean f31837o;

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    public Boolean f31838p;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements m0.d {
        public a() {
        }

        @Override // com.google.android.material.internal.m0.d
        @NonNull
        public WindowInsetsCompat a(View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull m0.e eVar) {
            Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
            NavigationRailView navigationRailView = NavigationRailView.this;
            if (navigationRailView.u(navigationRailView.f31836n)) {
                eVar.f31619b += insets.top;
            }
            NavigationRailView navigationRailView2 = NavigationRailView.this;
            if (navigationRailView2.u(navigationRailView2.f31837o)) {
                eVar.f31621d += insets.bottom;
            }
            NavigationRailView navigationRailView3 = NavigationRailView.this;
            if (navigationRailView3.u(navigationRailView3.f31838p)) {
                eVar.f31618a += m0.s(view) ? insets.right : insets.left;
            }
            eVar.a(view);
            return windowInsetsCompat;
        }
    }

    public NavigationRailView(@NonNull Context context) {
        this(context, null);
    }

    private NavigationRailMenuView getNavigationRailMenuView() {
        return (NavigationRailMenuView) getMenuView();
    }

    private void p() {
        m0.h(this, new a());
    }

    @Nullable
    public View getHeaderView() {
        return this.f31835m;
    }

    public int getItemMinimumHeight() {
        return ((NavigationRailMenuView) getMenuView()).getItemMinimumHeight();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 7;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    public void n(@LayoutRes int i11) {
        o(LayoutInflater.from(getContext()).inflate(i11, (ViewGroup) this, false));
    }

    public void o(@NonNull View view) {
        t();
        this.f31835m = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = this.f31834l;
        addView(view, 0, layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        NavigationRailMenuView navigationRailMenuView = getNavigationRailMenuView();
        int i15 = 0;
        if (r()) {
            int bottom = this.f31835m.getBottom() + this.f31834l;
            int top = navigationRailMenuView.getTop();
            if (top < bottom) {
                i15 = bottom - top;
            }
        } else if (navigationRailMenuView.t()) {
            i15 = this.f31834l;
        }
        if (i15 > 0) {
            navigationRailMenuView.layout(navigationRailMenuView.getLeft(), navigationRailMenuView.getTop() + i15, navigationRailMenuView.getRight(), navigationRailMenuView.getBottom() + i15);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        int s11 = s(i11);
        super.onMeasure(s11, i12);
        if (r()) {
            measureChild(getNavigationRailMenuView(), s11, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.f31835m.getMeasuredHeight()) - this.f31834l, Integer.MIN_VALUE));
        }
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public NavigationRailMenuView c(@NonNull Context context) {
        return new NavigationRailMenuView(context);
    }

    public final boolean r() {
        View view = this.f31835m;
        return (view == null || view.getVisibility() == 8) ? false : true;
    }

    public final int s(int i11) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i11) == 1073741824 || suggestedMinimumWidth <= 0) {
            return i11;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), suggestedMinimumWidth + getPaddingLeft() + getPaddingRight()), 1073741824);
    }

    public void setItemMinimumHeight(@Px int i11) {
        ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i11);
    }

    public void setMenuGravity(int i11) {
        getNavigationRailMenuView().setMenuGravity(i11);
    }

    public void t() {
        View view = this.f31835m;
        if (view != null) {
            removeView(view);
            this.f31835m = null;
        }
    }

    public final boolean u(Boolean bool) {
        return bool != null ? bool.booleanValue() : ViewCompat.getFitsSystemWindows(this);
    }

    public NavigationRailView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.navigationRailStyle);
    }

    public NavigationRailView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, R.style.Widget_MaterialComponents_NavigationRailView);
    }

    public NavigationRailView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.f31836n = null;
        this.f31837o = null;
        this.f31838p = null;
        this.f31834l = getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_rail_margin);
        Context context2 = getContext();
        TintTypedArray l11 = d0.l(context2, attributeSet, R.styleable.NavigationRailView, i11, i12, new int[0]);
        int resourceId = l11.getResourceId(R.styleable.NavigationRailView_headerLayout, 0);
        if (resourceId != 0) {
            n(resourceId);
        }
        setMenuGravity(l11.getInt(R.styleable.NavigationRailView_menuGravity, 49));
        int i13 = R.styleable.NavigationRailView_itemMinHeight;
        if (l11.hasValue(i13)) {
            setItemMinimumHeight(l11.getDimensionPixelSize(i13, -1));
        }
        int i14 = R.styleable.NavigationRailView_paddingTopSystemWindowInsets;
        if (l11.hasValue(i14)) {
            this.f31836n = Boolean.valueOf(l11.getBoolean(i14, false));
        }
        int i15 = R.styleable.NavigationRailView_paddingBottomSystemWindowInsets;
        if (l11.hasValue(i15)) {
            this.f31837o = Boolean.valueOf(l11.getBoolean(i15, false));
        }
        int i16 = R.styleable.NavigationRailView_paddingStartSystemWindowInsets;
        if (l11.hasValue(i16)) {
            this.f31838p = Boolean.valueOf(l11.getBoolean(i16, false));
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_navigation_rail_item_padding_top_with_large_font);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.m3_navigation_rail_item_padding_bottom_with_large_font);
        float b11 = b.b(0.0f, 1.0f, 0.3f, 1.0f, c.f(context2) - 1.0f);
        float c11 = b.c(getItemPaddingTop(), dimensionPixelOffset, b11);
        float c12 = b.c(getItemPaddingBottom(), dimensionPixelOffset2, b11);
        setItemPaddingTop(Math.round(c11));
        setItemPaddingBottom(Math.round(c12));
        l11.recycle();
        p();
    }
}
