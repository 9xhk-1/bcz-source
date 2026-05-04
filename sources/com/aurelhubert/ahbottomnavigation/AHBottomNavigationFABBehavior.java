package com.aurelhubert.ahbottomnavigation;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class AHBottomNavigationFABBehavior extends CoordinatorLayout.Behavior<FloatingActionButton> {

    /* renamed from: a, reason: collision with root package name */
    public int f11302a;

    /* renamed from: b, reason: collision with root package name */
    public long f11303b = 0;

    public AHBottomNavigationFABBehavior(int navigationBarHeight) {
        this.f11302a = navigationBarHeight;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean layoutDependsOn(CoordinatorLayout parent, FloatingActionButton child, View dependency) {
        if (dependency != null && (dependency instanceof Snackbar.SnackbarLayout)) {
            return true;
        }
        if (dependency == null || !(dependency instanceof AHBottomNavigation)) {
            return super.layoutDependsOn(parent, child, dependency);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean onDependentViewChanged(CoordinatorLayout parent, FloatingActionButton child, View dependency) {
        j(child, dependency);
        return super.onDependentViewChanged(parent, child, dependency);
    }

    public final void j(FloatingActionButton child, View dependency) {
        if (child != null && dependency != null && (dependency instanceof Snackbar.SnackbarLayout)) {
            this.f11303b = System.currentTimeMillis();
            child.setY(dependency.getY() - ((ViewGroup.MarginLayoutParams) child.getLayoutParams()).bottomMargin);
        } else {
            if (child == null || dependency == null || !(dependency instanceof AHBottomNavigation) || System.currentTimeMillis() - this.f11303b < 30) {
                return;
            }
            child.setY(dependency.getY() - ((ViewGroup.MarginLayoutParams) child.getLayoutParams()).bottomMargin);
        }
    }
}
