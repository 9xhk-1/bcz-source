package com.aurelhubert.ahbottomnavigation;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class VerticalScrollingBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a, reason: collision with root package name */
    public int f11307a;

    /* renamed from: b, reason: collision with root package name */
    public int f11308b;

    /* renamed from: c, reason: collision with root package name */
    public int f11309c;

    /* renamed from: d, reason: collision with root package name */
    public int f11310d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {

        /* renamed from: h, reason: collision with root package name */
        public static final int f11311h = 1;

        /* renamed from: i, reason: collision with root package name */
        public static final int f11312i = -1;

        /* renamed from: j, reason: collision with root package name */
        public static final int f11313j = 0;
    }

    public VerticalScrollingBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f11307a = 0;
        this.f11308b = 0;
        this.f11309c = 0;
        this.f11310d = 0;
    }

    public int h() {
        return this.f11309c;
    }

    public int i() {
        return this.f11310d;
    }

    public abstract void j(CoordinatorLayout coordinatorLayout, V child, View target, int dx2, int dy2, int[] consumed, int scrollDirection);

    public abstract boolean k(CoordinatorLayout coordinatorLayout, V child, View target, float velocityX, float velocityY, int scrollDirection);

    public abstract void l(CoordinatorLayout coordinatorLayout, V child, int direction, int currentOverScroll, int totalOverScroll);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public WindowInsetsCompat onApplyWindowInsets(CoordinatorLayout coordinatorLayout, V child, WindowInsetsCompat insets) {
        return super.onApplyWindowInsets(coordinatorLayout, child, insets);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedFling(CoordinatorLayout coordinatorLayout, V child, View target, float velocityX, float velocityY, boolean consumed) {
        super.onNestedFling(coordinatorLayout, child, target, velocityX, velocityY, consumed);
        int i11 = velocityY > 0.0f ? 1 : -1;
        this.f11310d = i11;
        return k(coordinatorLayout, child, target, velocityX, velocityY, i11);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V child, View target, float velocityX, float velocityY) {
        return super.onNestedPreFling(coordinatorLayout, child, target, velocityX, velocityY);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V child, View target, int dx2, int dy2, int[] consumed) {
        super.onNestedPreScroll(coordinatorLayout, child, target, dx2, dy2, consumed);
        if (dy2 > 0 && this.f11308b < 0) {
            this.f11308b = 0;
            this.f11310d = 1;
        } else if (dy2 < 0 && this.f11308b > 0) {
            this.f11308b = 0;
            this.f11310d = -1;
        }
        this.f11308b += dy2;
        j(coordinatorLayout, child, target, dx2, dy2, consumed, this.f11310d);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V child, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        super.onNestedScroll(coordinatorLayout, child, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed);
        if (dyUnconsumed > 0 && this.f11307a < 0) {
            this.f11307a = 0;
            this.f11309c = 1;
        } else if (dyUnconsumed < 0 && this.f11307a > 0) {
            this.f11307a = 0;
            this.f11309c = -1;
        }
        int i11 = this.f11307a + dyUnconsumed;
        this.f11307a = i11;
        l(coordinatorLayout, child, this.f11309c, dyConsumed, i11);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V child, View directTargetChild, View target, int nestedScrollAxes) {
        super.onNestedScrollAccepted(coordinatorLayout, child, directTargetChild, target, nestedScrollAxes);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public Parcelable onSaveInstanceState(CoordinatorLayout parent, V child) {
        return super.onSaveInstanceState(parent, child);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V child, View directTargetChild, View target, int nestedScrollAxes) {
        return (nestedScrollAxes & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V child, View target) {
        super.onStopNestedScroll(coordinatorLayout, child, target);
    }

    public VerticalScrollingBehavior() {
        this.f11307a = 0;
        this.f11308b = 0;
        this.f11309c = 0;
        this.f11310d = 0;
    }
}
