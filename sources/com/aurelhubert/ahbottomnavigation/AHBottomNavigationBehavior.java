package com.aurelhubert.ahbottomnavigation;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorUpdateListener;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class AHBottomNavigationBehavior<V extends View> extends VerticalScrollingBehavior<V> {

    /* renamed from: u, reason: collision with root package name */
    public static final Interpolator f11281u = new LinearOutSlowInInterpolator();

    /* renamed from: v, reason: collision with root package name */
    public static final int f11282v = 300;

    /* renamed from: e, reason: collision with root package name */
    public int f11283e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11284f;

    /* renamed from: g, reason: collision with root package name */
    public ViewPropertyAnimatorCompat f11285g;

    /* renamed from: h, reason: collision with root package name */
    public ObjectAnimator f11286h;

    /* renamed from: i, reason: collision with root package name */
    public TabLayout f11287i;

    /* renamed from: j, reason: collision with root package name */
    public Snackbar.SnackbarLayout f11288j;

    /* renamed from: k, reason: collision with root package name */
    public FloatingActionButton f11289k;

    /* renamed from: l, reason: collision with root package name */
    public int f11290l;

    /* renamed from: m, reason: collision with root package name */
    public int f11291m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11292n;

    /* renamed from: o, reason: collision with root package name */
    public float f11293o;

    /* renamed from: p, reason: collision with root package name */
    public float f11294p;

    /* renamed from: q, reason: collision with root package name */
    public float f11295q;

    /* renamed from: r, reason: collision with root package name */
    public float f11296r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f11297s;

    /* renamed from: t, reason: collision with root package name */
    public AHBottomNavigation.f f11298t;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ViewPropertyAnimatorUpdateListener {
        public a() {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorUpdateListener
        public void onAnimationUpdate(View view) {
            if (AHBottomNavigationBehavior.this.f11298t != null) {
                AHBottomNavigationBehavior.this.f11298t.a((int) ((view.getMeasuredHeight() - view.getTranslationY()) + AHBottomNavigationBehavior.this.f11296r));
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f11300a;

        public b(final View val$child) {
            this.f11300a = val$child;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            if (AHBottomNavigationBehavior.this.f11288j != null && (AHBottomNavigationBehavior.this.f11288j.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                AHBottomNavigationBehavior.this.f11293o = this.f11300a.getMeasuredHeight() - this.f11300a.getTranslationY();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) AHBottomNavigationBehavior.this.f11288j.getLayoutParams();
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, (int) AHBottomNavigationBehavior.this.f11293o);
                AHBottomNavigationBehavior.this.f11288j.requestLayout();
            }
            if (AHBottomNavigationBehavior.this.f11298t != null) {
                AHBottomNavigationBehavior.this.f11298t.a((int) ((this.f11300a.getMeasuredHeight() - this.f11300a.getTranslationY()) + AHBottomNavigationBehavior.this.f11296r));
            }
        }
    }

    public AHBottomNavigationBehavior() {
        this.f11284f = false;
        this.f11290l = -1;
        this.f11291m = 0;
        this.f11292n = false;
        this.f11293o = 0.0f;
        this.f11294p = 0.0f;
        this.f11295q = 0.0f;
        this.f11296r = 0.0f;
        this.f11297s = true;
    }

    public static <V extends View> AHBottomNavigationBehavior<V> v(V view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        if (behavior instanceof AHBottomNavigationBehavior) {
            return (AHBottomNavigationBehavior) behavior;
        }
        throw new IllegalArgumentException("The view is not associated with AHBottomNavigationBehavior");
    }

    public void A(V view, boolean withAnimation) {
        if (this.f11284f) {
            this.f11284f = false;
            r(view, 0, true, withAnimation);
        }
    }

    public void B(boolean behaviorTranslationEnabled, int navigationBarHeight) {
        this.f11297s = behaviorTranslationEnabled;
        this.f11291m = navigationBarHeight;
    }

    public void C(AHBottomNavigation.f navigationHeightListener) {
        this.f11298t = navigationHeightListener;
    }

    public void D(int tabId) {
        this.f11283e = tabId;
    }

    public void E(final View child, View dependency) {
        if (dependency == null || !(dependency instanceof Snackbar.SnackbarLayout)) {
            return;
        }
        this.f11288j = (Snackbar.SnackbarLayout) dependency;
        if (this.f11290l == -1) {
            this.f11290l = dependency.getHeight();
        }
        int measuredHeight = (int) (child.getMeasuredHeight() - child.getTranslationY());
        if (dependency.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) dependency.getLayoutParams();
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, measuredHeight);
            dependency.requestLayout();
        }
    }

    @Override // com.aurelhubert.ahbottomnavigation.VerticalScrollingBehavior
    public boolean k(CoordinatorLayout coordinatorLayout, V child, View target, float velocityX, float velocityY, int scrollDirection) {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout parent, V child, View dependency) {
        if (dependency == null || !(dependency instanceof Snackbar.SnackbarLayout)) {
            return super.layoutDependsOn(parent, child, dependency);
        }
        E(child, dependency);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(CoordinatorLayout parent, V child, View dependency) {
        return super.onDependentViewChanged(parent, child, dependency);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDependentViewRemoved(CoordinatorLayout parent, V child, View dependency) {
        super.onDependentViewRemoved(parent, child, dependency);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout parent, V child, int layoutDirection) {
        boolean onLayoutChild = super.onLayoutChild(parent, child, layoutDirection);
        if (this.f11287i == null && this.f11283e != -1) {
            this.f11287i = u(child);
        }
        return onLayoutChild;
    }

    @Override // com.aurelhubert.ahbottomnavigation.VerticalScrollingBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V child, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        super.onNestedScroll(coordinatorLayout, child, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed);
        if (dyConsumed < 0) {
            w(child, -1);
        } else if (dyConsumed > 0) {
            w(child, 1);
        }
    }

    @Override // com.aurelhubert.ahbottomnavigation.VerticalScrollingBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V child, View directTargetChild, View target, int nestedScrollAxes) {
        return nestedScrollAxes == 2 || super.onStartNestedScroll(coordinatorLayout, child, directTargetChild, target, nestedScrollAxes);
    }

    public final void r(final V child, final int offset, boolean forceAnimation, boolean withAnimation) {
        if (this.f11297s || forceAnimation) {
            s(child, withAnimation);
            this.f11285g.translationY(offset).start();
        }
    }

    public final void s(V child, boolean withAnimation) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.f11285g;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.setDuration(withAnimation ? 300L : 0L);
            this.f11285g.cancel();
            return;
        }
        ViewPropertyAnimatorCompat animate = ViewCompat.animate(child);
        this.f11285g = animate;
        animate.setDuration(withAnimation ? 300L : 0L);
        this.f11285g.setUpdateListener(new a());
        this.f11285g.setInterpolator(f11281u);
    }

    public final void t(final V child, final int offset, boolean withAnimation) {
        ObjectAnimator objectAnimator = this.f11286h;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(child, (Property<V, Float>) View.TRANSLATION_Y, offset);
        this.f11286h = ofFloat;
        ofFloat.setDuration(withAnimation ? 300L : 0L);
        this.f11286h.setInterpolator(f11281u);
        this.f11286h.addUpdateListener(new b(child));
    }

    public final TabLayout u(View child) {
        int i11 = this.f11283e;
        if (i11 == 0) {
            return null;
        }
        return (TabLayout) child.findViewById(i11);
    }

    public final void w(V child, int scrollDirection) {
        if (this.f11297s) {
            if (scrollDirection == -1 && this.f11284f) {
                this.f11284f = false;
                r(child, 0, false, true);
            } else {
                if (scrollDirection != 1 || this.f11284f) {
                    return;
                }
                this.f11284f = true;
                r(child, child.getHeight(), false, true);
            }
        }
    }

    public void x(V view, int offset, boolean withAnimation) {
        if (this.f11284f) {
            return;
        }
        this.f11284f = true;
        r(view, offset, true, withAnimation);
    }

    public boolean y() {
        return this.f11284f;
    }

    public void z() {
        this.f11298t = null;
    }

    public AHBottomNavigationBehavior(boolean behaviorTranslationEnabled, int navigationBarHeight) {
        this.f11284f = false;
        this.f11290l = -1;
        this.f11292n = false;
        this.f11293o = 0.0f;
        this.f11294p = 0.0f;
        this.f11295q = 0.0f;
        this.f11296r = 0.0f;
        this.f11297s = behaviorTranslationEnabled;
        this.f11291m = navigationBarHeight;
    }

    public AHBottomNavigationBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f11284f = false;
        this.f11290l = -1;
        this.f11291m = 0;
        this.f11292n = false;
        this.f11293o = 0.0f;
        this.f11294p = 0.0f;
        this.f11295q = 0.0f;
        this.f11296r = 0.0f;
        this.f11297s = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.AHBottomNavigation);
        this.f11283e = obtainStyledAttributes.getResourceId(R.styleable.AHBottomNavigation_tabLayoutId, -1);
        obtainStyledAttributes.recycle();
    }

    @Override // com.aurelhubert.ahbottomnavigation.VerticalScrollingBehavior
    public void l(CoordinatorLayout coordinatorLayout, V child, int direction, int currentOverScroll, int totalOverScroll) {
    }

    @Override // com.aurelhubert.ahbottomnavigation.VerticalScrollingBehavior
    public void j(CoordinatorLayout coordinatorLayout, V child, View target, int dx2, int dy2, int[] consumed, int scrollDirection) {
    }
}
