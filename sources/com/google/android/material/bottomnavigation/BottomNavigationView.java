package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.R;
import com.google.android.material.internal.d0;
import com.google.android.material.internal.m0;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class BottomNavigationView extends NavigationBarView {

    /* renamed from: l, reason: collision with root package name */
    public static final int f30697l = 5;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements m0.d {
        public a() {
        }

        @Override // com.google.android.material.internal.m0.d
        @NonNull
        public WindowInsetsCompat a(View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull m0.e eVar) {
            eVar.f31621d += windowInsetsCompat.getSystemWindowInsetBottom();
            boolean z11 = ViewCompat.getLayoutDirection(view) == 1;
            int systemWindowInsetLeft = windowInsetsCompat.getSystemWindowInsetLeft();
            int systemWindowInsetRight = windowInsetsCompat.getSystemWindowInsetRight();
            eVar.f31618a += z11 ? systemWindowInsetRight : systemWindowInsetLeft;
            int i11 = eVar.f31620c;
            if (!z11) {
                systemWindowInsetLeft = systemWindowInsetRight;
            }
            eVar.f31620c = i11 + systemWindowInsetLeft;
            eVar.a(view);
            return windowInsetsCompat;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Deprecated
    public interface b extends NavigationBarView.c {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Deprecated
    public interface c extends NavigationBarView.d {
    }

    public BottomNavigationView(@NonNull Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavigationBarMenuView c(@NonNull Context context) {
        return new BottomNavigationMenuView(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 5;
    }

    public final void j(@NonNull Context context) {
        View view = new View(context);
        view.setBackgroundColor(ContextCompat.getColor(context, R.color.design_bottom_navigation_shadow_color));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.design_bottom_navigation_shadow_height)));
        addView(view);
    }

    public final void k() {
        m0.h(this, new a());
    }

    public boolean l() {
        return ((BottomNavigationMenuView) getMenuView()).t();
    }

    public final int m(int i11) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i11) == 1073741824 || suggestedMinimumHeight <= 0) {
            return i11;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), suggestedMinimumHeight + getPaddingTop() + getPaddingBottom()), 1073741824);
    }

    public final boolean n() {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, m(i12));
    }

    public void setItemHorizontalTranslationEnabled(boolean z11) {
        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) getMenuView();
        if (bottomNavigationMenuView.t() != z11) {
            bottomNavigationMenuView.setItemHorizontalTranslationEnabled(z11);
            getPresenter().updateMenuView(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(@Nullable b bVar) {
        setOnItemReselectedListener(bVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(@Nullable c cVar) {
        setOnItemSelectedListener(cVar);
    }

    public BottomNavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomNavigationStyle);
    }

    public BottomNavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, R.style.Widget_Design_BottomNavigationView);
    }

    public BottomNavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Context context2 = getContext();
        TintTypedArray l11 = d0.l(context2, attributeSet, R.styleable.BottomNavigationView, i11, i12, new int[0]);
        setItemHorizontalTranslationEnabled(l11.getBoolean(R.styleable.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        int i13 = R.styleable.BottomNavigationView_android_minHeight;
        if (l11.hasValue(i13)) {
            setMinimumHeight(l11.getDimensionPixelSize(i13, 0));
        }
        if (l11.getBoolean(R.styleable.BottomNavigationView_compatShadowEnabled, true) && n()) {
            j(context2);
        }
        l11.recycle();
        k();
    }
}
