package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.appbar.AppBarLayout;
import en.u;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import vn.k;
import vn.l;
import wm.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.AttachedBehavior {
    public static final int A = 1;
    public static final int B = 2;
    public static final int C = 4;
    public static final int D = 8;
    public static final int E = R.style.Widget_Design_AppBarLayout;
    public static final int F = -1;

    /* renamed from: z, reason: collision with root package name */
    public static final int f30409z = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f30410a;

    /* renamed from: b, reason: collision with root package name */
    public int f30411b;

    /* renamed from: c, reason: collision with root package name */
    public int f30412c;

    /* renamed from: d, reason: collision with root package name */
    public int f30413d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f30414e;

    /* renamed from: f, reason: collision with root package name */
    public int f30415f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public WindowInsetsCompat f30416g;

    /* renamed from: h, reason: collision with root package name */
    public List<b> f30417h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f30418i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f30419j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f30420k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f30421l;

    /* renamed from: m, reason: collision with root package name */
    @IdRes
    public int f30422m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public WeakReference<View> f30423n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f30424o;

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    public ValueAnimator f30425p;

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    public ValueAnimator.AnimatorUpdateListener f30426q;

    /* renamed from: r, reason: collision with root package name */
    public final List<f> f30427r;

    /* renamed from: s, reason: collision with root package name */
    public final long f30428s;

    /* renamed from: t, reason: collision with root package name */
    public final TimeInterpolator f30429t;

    /* renamed from: u, reason: collision with root package name */
    public int[] f30430u;

    /* renamed from: v, reason: collision with root package name */
    @Nullable
    public Drawable f30431v;

    /* renamed from: w, reason: collision with root package name */
    @Nullable
    public Integer f30432w;

    /* renamed from: x, reason: collision with root package name */
    public final float f30433x;

    /* renamed from: y, reason: collision with root package name */
    public Behavior f30434y;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BaseBehavior<T extends AppBarLayout> extends wm.d<T> {

        /* renamed from: r, reason: collision with root package name */
        public static final int f30435r = 600;

        /* renamed from: l, reason: collision with root package name */
        public int f30436l;

        /* renamed from: m, reason: collision with root package name */
        public int f30437m;

        /* renamed from: n, reason: collision with root package name */
        public ValueAnimator f30438n;

        /* renamed from: o, reason: collision with root package name */
        public SavedState f30439o;

        /* renamed from: p, reason: collision with root package name */
        @Nullable
        public WeakReference<View> f30440p;

        /* renamed from: q, reason: collision with root package name */
        public c f30441q;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CoordinatorLayout f30447a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppBarLayout f30448b;

            public a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f30447a = coordinatorLayout;
                this.f30448b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                BaseBehavior.this.y(this.f30447a, this.f30448b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b extends AccessibilityDelegateCompat {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AppBarLayout f30450a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoordinatorLayout f30451b;

            public b(AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
                this.f30450a = appBarLayout;
                this.f30451b = coordinatorLayout;
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                View O;
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setClassName(ScrollView.class.getName());
                if (this.f30450a.getTotalScrollRange() == 0 || (O = BaseBehavior.this.O(this.f30451b)) == null || !BaseBehavior.this.K(this.f30450a)) {
                    return;
                }
                if (BaseBehavior.this.v() != (-this.f30450a.getTotalScrollRange())) {
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    accessibilityNodeInfoCompat.setScrollable(true);
                }
                if (BaseBehavior.this.v() != 0) {
                    if (!O.canScrollVertically(-1)) {
                        accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                        accessibilityNodeInfoCompat.setScrollable(true);
                    } else if ((-this.f30450a.getDownNestedPreScrollRange()) != 0) {
                        accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                        accessibilityNodeInfoCompat.setScrollable(true);
                    }
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
                if (i11 == 4096) {
                    this.f30450a.setExpanded(false);
                    return true;
                }
                if (i11 != 8192) {
                    return super.performAccessibilityAction(view, i11, bundle);
                }
                if (BaseBehavior.this.v() != 0) {
                    View O = BaseBehavior.this.O(this.f30451b);
                    if (!O.canScrollVertically(-1)) {
                        this.f30450a.setExpanded(true);
                        return true;
                    }
                    int i12 = -this.f30450a.getDownNestedPreScrollRange();
                    if (i12 != 0) {
                        BaseBehavior.this.onNestedPreScroll(this.f30451b, this.f30450a, O, 0, i12, new int[]{0, 0}, 1);
                        return true;
                    }
                }
                return false;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static abstract class c<T extends AppBarLayout> {
            public abstract boolean a(@NonNull T t11);
        }

        public BaseBehavior() {
        }

        public static boolean J(int i11, int i12) {
            return (i11 & i12) == i12;
        }

        @Nullable
        public static View M(@NonNull AppBarLayout appBarLayout, int i11) {
            int abs = Math.abs(i11);
            int childCount = appBarLayout.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = appBarLayout.getChildAt(i12);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        public final void D(CoordinatorLayout coordinatorLayout, @NonNull T t11) {
            if (ViewCompat.hasAccessibilityDelegate(coordinatorLayout)) {
                return;
            }
            ViewCompat.setAccessibilityDelegate(coordinatorLayout, new b(t11, coordinatorLayout));
        }

        public final void E(CoordinatorLayout coordinatorLayout, @NonNull T t11, int i11, float f11) {
            int abs = Math.abs(v() - i11);
            float abs2 = Math.abs(f11);
            F(coordinatorLayout, t11, i11, abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / t11.getHeight()) + 1.0f) * 150.0f));
        }

        public final void F(CoordinatorLayout coordinatorLayout, T t11, int i11, int i12) {
            int v11 = v();
            if (v11 == i11) {
                ValueAnimator valueAnimator = this.f30438n;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f30438n.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f30438n;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f30438n = valueAnimator3;
                valueAnimator3.setInterpolator(vm.b.f94064e);
                this.f30438n.addUpdateListener(new a(coordinatorLayout, t11));
            } else {
                valueAnimator2.cancel();
            }
            this.f30438n.setDuration(Math.min(i12, 600));
            this.f30438n.setIntValues(v11, i11);
            this.f30438n.start();
        }

        public final int G(int i11, int i12, int i13) {
            return i11 < (i12 + i13) / 2 ? i12 : i13;
        }

        @Override // wm.d
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public boolean q(T t11) {
            c cVar = this.f30441q;
            if (cVar != null) {
                return cVar.a(t11);
            }
            WeakReference<View> weakReference = this.f30440p;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        public final boolean I(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t11, @NonNull View view) {
            return t11.o() && coordinatorLayout.getHeight() - view.getHeight() <= t11.getHeight();
        }

        public final boolean K(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                if (((e) appBarLayout.getChildAt(i11).getLayoutParams()).f30469a != 0) {
                    return true;
                }
            }
            return false;
        }

        @Nullable
        public final View L(@NonNull CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = coordinatorLayout.getChildAt(i11);
                if ((childAt instanceof NestedScrollingChild) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public final int N(@NonNull T t11, int i11) {
            int childCount = t11.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = t11.getChildAt(i12);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                e eVar = (e) childAt.getLayoutParams();
                if (J(eVar.c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) eVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) eVar).bottomMargin;
                }
                int i13 = -i11;
                if (top <= i13 && bottom >= i13) {
                    return i12;
                }
            }
            return -1;
        }

        @Nullable
        public final View O(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = coordinatorLayout.getChildAt(i11);
                if (((CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).getBehavior() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        @Override // wm.d
        /* renamed from: P, reason: merged with bridge method [inline-methods] */
        public int t(@NonNull T t11) {
            return (-t11.getDownNestedScrollRange()) + t11.getTopInset();
        }

        @Override // wm.d
        /* renamed from: Q, reason: merged with bridge method [inline-methods] */
        public int u(@NonNull T t11) {
            return t11.getTotalScrollRange();
        }

        public final int R(@NonNull T t11, int i11) {
            int abs = Math.abs(i11);
            int childCount = t11.getChildCount();
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    break;
                }
                View childAt = t11.getChildAt(i13);
                e eVar = (e) childAt.getLayoutParams();
                Interpolator d11 = eVar.d();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i13++;
                } else if (d11 != null) {
                    int c11 = eVar.c();
                    if ((c11 & 1) != 0) {
                        i12 = childAt.getHeight() + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                        if ((c11 & 2) != 0) {
                            i12 -= ViewCompat.getMinimumHeight(childAt);
                        }
                    }
                    if (ViewCompat.getFitsSystemWindows(childAt)) {
                        i12 -= t11.getTopInset();
                    }
                    if (i12 > 0) {
                        float f11 = i12;
                        return Integer.signum(i11) * (childAt.getTop() + Math.round(f11 * d11.getInterpolation((abs - childAt.getTop()) / f11)));
                    }
                }
            }
            return i11;
        }

        @VisibleForTesting
        public boolean S() {
            ValueAnimator valueAnimator = this.f30438n;
            return valueAnimator != null && valueAnimator.isRunning();
        }

        @Override // wm.d
        /* renamed from: T, reason: merged with bridge method [inline-methods] */
        public void w(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t11) {
            h0(coordinatorLayout, t11);
            if (t11.s()) {
                t11.G(t11.J(L(coordinatorLayout)));
            }
        }

        @Override // wm.f, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: U, reason: merged with bridge method [inline-methods] */
        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t11, int i11) {
            boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, t11, i11);
            int pendingAction = t11.getPendingAction();
            SavedState savedState = this.f30439o;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z11 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i12 = -t11.getUpNestedPreScrollRange();
                        if (z11) {
                            E(coordinatorLayout, t11, i12, 0.0f);
                        } else {
                            y(coordinatorLayout, t11, i12);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z11) {
                            E(coordinatorLayout, t11, 0, 0.0f);
                        } else {
                            y(coordinatorLayout, t11, 0);
                        }
                    }
                }
            } else if (savedState.f30442a) {
                y(coordinatorLayout, t11, -t11.getTotalScrollRange());
            } else if (savedState.f30443b) {
                y(coordinatorLayout, t11, 0);
            } else {
                View childAt = t11.getChildAt(savedState.f30444c);
                y(coordinatorLayout, t11, (-childAt.getBottom()) + (this.f30439o.f30446e ? ViewCompat.getMinimumHeight(childAt) + t11.getTopInset() : Math.round(childAt.getHeight() * this.f30439o.f30445d)));
            }
            t11.A();
            this.f30439o = null;
            o(MathUtils.clamp(i(), -t11.getTotalScrollRange(), 0));
            i0(coordinatorLayout, t11, i(), 0, true);
            t11.v(i());
            D(coordinatorLayout, t11);
            return onLayoutChild;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: V, reason: merged with bridge method [inline-methods] */
        public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t11, int i11, int i12, int i13, int i14) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) t11.getLayoutParams())).height != -2) {
                return super.onMeasureChild(coordinatorLayout, t11, i11, i12, i13, i14);
            }
            coordinatorLayout.onMeasureChild(t11, i11, i12, View.MeasureSpec.makeMeasureSpec(0, 0), i14);
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: W, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r7, @androidx.annotation.NonNull T r8, android.view.View r9, int r10, int r11, int[] r12, int r13) {
            /*
                r6 = this;
                if (r11 == 0) goto L26
                if (r11 >= 0) goto L11
                int r10 = r8.getTotalScrollRange()
                int r10 = -r10
                int r13 = r8.getDownNestedPreScrollRange()
                int r13 = r13 + r10
            Le:
                r4 = r10
                r5 = r13
                goto L18
            L11:
                int r10 = r8.getUpNestedPreScrollRange()
                int r10 = -r10
                r13 = 0
                goto Le
            L18:
                if (r4 == r5) goto L26
                r10 = 1
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r11
                int r7 = r0.x(r1, r2, r3, r4, r5)
                r12[r10] = r7
                goto L27
            L26:
                r2 = r8
            L27:
                boolean r7 = r2.s()
                if (r7 == 0) goto L34
                boolean r7 = r2.J(r9)
                r2.G(r7)
            L34:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int, int, int[], int):void");
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: X, reason: merged with bridge method [inline-methods] */
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull T t11, View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            T t12;
            int i16;
            if (i14 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                t12 = t11;
                i16 = i14;
                iArr[1] = x(coordinatorLayout2, t12, i16, -t11.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
                t12 = t11;
                i16 = i14;
            }
            if (i16 == 0) {
                D(coordinatorLayout2, t12);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: Y, reason: merged with bridge method [inline-methods] */
        public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t11, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                c0((SavedState) parcelable, true);
                super.onRestoreInstanceState(coordinatorLayout, t11, this.f30439o.getSuperState());
            } else {
                super.onRestoreInstanceState(coordinatorLayout, t11, parcelable);
                this.f30439o = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t11) {
            Parcelable onSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, t11);
            SavedState d02 = d0(onSaveInstanceState, t11);
            return d02 == null ? onSaveInstanceState : d02;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: a0, reason: merged with bridge method [inline-methods] */
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t11, @NonNull View view, View view2, int i11, int i12) {
            ValueAnimator valueAnimator;
            boolean z11 = (i11 & 2) != 0 && (t11.s() || I(coordinatorLayout, t11, view));
            if (z11 && (valueAnimator = this.f30438n) != null) {
                valueAnimator.cancel();
            }
            this.f30440p = null;
            this.f30437m = i12;
            return z11;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: b0, reason: merged with bridge method [inline-methods] */
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull T t11, View view, int i11) {
            if (this.f30437m == 0 || i11 == 1) {
                h0(coordinatorLayout, t11);
                if (t11.s()) {
                    t11.G(t11.J(view));
                }
            }
            this.f30440p = new WeakReference<>(view);
        }

        public void c0(@Nullable SavedState savedState, boolean z11) {
            if (this.f30439o == null || z11) {
                this.f30439o = savedState;
            }
        }

        @Nullable
        public SavedState d0(@Nullable Parcelable parcelable, @NonNull T t11) {
            int i11 = i();
            int childCount = t11.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = t11.getChildAt(i12);
                int bottom = childAt.getBottom() + i11;
                if (childAt.getTop() + i11 <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.EMPTY_STATE;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z11 = i11 == 0;
                    savedState.f30443b = z11;
                    savedState.f30442a = !z11 && (-i11) >= t11.getTotalScrollRange();
                    savedState.f30444c = i12;
                    savedState.f30446e = bottom == ViewCompat.getMinimumHeight(childAt) + t11.getTopInset();
                    savedState.f30445d = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        public void e0(@Nullable c cVar) {
            this.f30441q = cVar;
        }

        @Override // wm.d
        /* renamed from: f0, reason: merged with bridge method [inline-methods] */
        public int z(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t11, int i11, int i12, int i13) {
            CoordinatorLayout coordinatorLayout2;
            T t12;
            int v11 = v();
            int i14 = 0;
            if (i12 == 0 || v11 < i12 || v11 > i13) {
                coordinatorLayout2 = coordinatorLayout;
                t12 = t11;
                this.f30436l = 0;
            } else {
                int clamp = MathUtils.clamp(i11, i12, i13);
                if (v11 != clamp) {
                    int R = t11.m() ? R(t11, clamp) : clamp;
                    boolean o11 = o(R);
                    int i15 = v11 - clamp;
                    this.f30436l = clamp - R;
                    if (o11) {
                        while (i14 < t11.getChildCount()) {
                            e eVar = (e) t11.getChildAt(i14).getLayoutParams();
                            c b11 = eVar.b();
                            if (b11 != null && (eVar.c() & 1) != 0) {
                                b11.a(t11, t11.getChildAt(i14), i());
                            }
                            i14++;
                        }
                    }
                    if (!o11 && t11.m()) {
                        coordinatorLayout.dispatchDependentViewsChanged(t11);
                    }
                    t11.v(i());
                    coordinatorLayout2 = coordinatorLayout;
                    t12 = t11;
                    i0(coordinatorLayout2, t12, clamp, clamp < v11 ? -1 : 1, false);
                    i14 = i15;
                } else {
                    coordinatorLayout2 = coordinatorLayout;
                    t12 = t11;
                }
            }
            D(coordinatorLayout2, t12);
            return i14;
        }

        public final boolean g0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t11) {
            List<View> dependents = coordinatorLayout.getDependents(t11);
            int size = dependents.size();
            for (int i11 = 0; i11 < size; i11++) {
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) dependents.get(i11).getLayoutParams()).getBehavior();
                if (behavior instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) behavior).t() != 0;
                }
            }
            return false;
        }

        public final void h0(CoordinatorLayout coordinatorLayout, @NonNull T t11) {
            int topInset = t11.getTopInset() + t11.getPaddingTop();
            int v11 = v() - topInset;
            int N = N(t11, v11);
            if (N >= 0) {
                View childAt = t11.getChildAt(N);
                e eVar = (e) childAt.getLayoutParams();
                int c11 = eVar.c();
                if ((c11 & 17) == 17) {
                    int i11 = -childAt.getTop();
                    int i12 = -childAt.getBottom();
                    if (N == 0 && ViewCompat.getFitsSystemWindows(t11) && ViewCompat.getFitsSystemWindows(childAt)) {
                        i11 -= t11.getTopInset();
                    }
                    if (J(c11, 2)) {
                        i12 += ViewCompat.getMinimumHeight(childAt);
                    } else if (J(c11, 5)) {
                        int minimumHeight = ViewCompat.getMinimumHeight(childAt) + i12;
                        if (v11 < minimumHeight) {
                            i11 = minimumHeight;
                        } else {
                            i12 = minimumHeight;
                        }
                    }
                    if (J(c11, 32)) {
                        i11 += ((LinearLayout.LayoutParams) eVar).topMargin;
                        i12 -= ((LinearLayout.LayoutParams) eVar).bottomMargin;
                    }
                    E(coordinatorLayout, t11, MathUtils.clamp(G(v11, i12, i11) + topInset, -t11.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        public final void i0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t11, int i11, int i12, boolean z11) {
            View M = M(t11, i11);
            boolean z12 = false;
            if (M != null) {
                int c11 = ((e) M.getLayoutParams()).c();
                if ((c11 & 1) != 0) {
                    int minimumHeight = ViewCompat.getMinimumHeight(M);
                    if (i12 <= 0 || (c11 & 12) == 0 ? !((c11 & 2) == 0 || (-i11) < (M.getBottom() - minimumHeight) - t11.getTopInset()) : (-i11) >= (M.getBottom() - minimumHeight) - t11.getTopInset()) {
                        z12 = true;
                    }
                }
            }
            if (t11.s()) {
                z12 = t11.J(L(coordinatorLayout));
            }
            boolean G = t11.G(z12);
            if (z11 || (G && g0(coordinatorLayout, t11))) {
                if (t11.getBackground() != null) {
                    t11.getBackground().jumpToCurrentState();
                }
                if (t11.getForeground() != null) {
                    t11.getForeground().jumpToCurrentState();
                }
                if (t11.getStateListAnimator() != null) {
                    t11.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        @Override // wm.d
        public int v() {
            return i() + this.f30436l;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            public boolean f30442a;

            /* renamed from: b, reason: collision with root package name */
            public boolean f30443b;

            /* renamed from: c, reason: collision with root package name */
            public int f30444c;

            /* renamed from: d, reason: collision with root package name */
            public float f30445d;

            /* renamed from: e, reason: collision with root package name */
            public boolean f30446e;

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

            public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f30442a = parcel.readByte() != 0;
                this.f30443b = parcel.readByte() != 0;
                this.f30444c = parcel.readInt();
                this.f30445d = parcel.readFloat();
                this.f30446e = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(@NonNull Parcel parcel, int i11) {
                super.writeToParcel(parcel, i11);
                parcel.writeByte(this.f30442a ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f30443b ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f30444c);
                parcel.writeFloat(this.f30445d);
                parcel.writeByte(this.f30446e ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Behavior extends BaseBehavior<AppBarLayout> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static abstract class a extends BaseBehavior.c<AppBarLayout> {
        }

        public Behavior() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: U */
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i11) {
            return super.onLayoutChild(coordinatorLayout, appBarLayout, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: V */
        public /* bridge */ /* synthetic */ boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i11, int i12, int i13, int i14) {
            return super.onMeasureChild(coordinatorLayout, appBarLayout, i11, i12, i13, i14);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: W */
        public /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i11, int i12, int[] iArr, int i13) {
            super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i11, i12, iArr, i13);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: X */
        public /* bridge */ /* synthetic */ void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
            super.onNestedScroll(coordinatorLayout, appBarLayout, view, i11, i12, i13, i14, i15, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: Y */
        public /* bridge */ /* synthetic */ void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, Parcelable parcelable) {
            super.onRestoreInstanceState(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: Z */
        public /* bridge */ /* synthetic */ Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout) {
            return super.onSaveInstanceState(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: a0 */
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull View view, View view2, int i11, int i12) {
            return super.onStartNestedScroll(coordinatorLayout, appBarLayout, view, view2, i11, i12);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: b0 */
        public /* bridge */ /* synthetic */ void onStopNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i11) {
            super.onStopNestedScroll(coordinatorLayout, appBarLayout, view, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void e0(@Nullable BaseBehavior.c cVar) {
            super.e0(cVar);
        }

        @Override // wm.f
        public /* bridge */ /* synthetic */ int h() {
            return super.h();
        }

        @Override // wm.f
        public /* bridge */ /* synthetic */ int i() {
            return super.i();
        }

        @Override // wm.f
        public /* bridge */ /* synthetic */ boolean j() {
            return super.j();
        }

        @Override // wm.f
        public /* bridge */ /* synthetic */ boolean k() {
            return super.k();
        }

        @Override // wm.f
        public /* bridge */ /* synthetic */ void m(boolean z11) {
            super.m(z11);
        }

        @Override // wm.f
        public /* bridge */ /* synthetic */ boolean n(int i11) {
            return super.n(i11);
        }

        @Override // wm.f
        public /* bridge */ /* synthetic */ boolean o(int i11) {
            return super.o(i11);
        }

        @Override // wm.d, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }

        @Override // wm.d, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            return super.onTouchEvent(coordinatorLayout, view, motionEvent);
        }

        @Override // wm.f
        public /* bridge */ /* synthetic */ void p(boolean z11) {
            super.p(z11);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ScrollingViewBehavior extends wm.e {
        public ScrollingViewBehavior() {
        }

        public static int A(@NonNull AppBarLayout appBarLayout) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams()).getBehavior();
            if (behavior instanceof BaseBehavior) {
                return ((BaseBehavior) behavior).v();
            }
            return 0;
        }

        public final void B(@NonNull View view, @NonNull View view2) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) view2.getLayoutParams()).getBehavior();
            if (behavior instanceof BaseBehavior) {
                ViewCompat.offsetTopAndBottom(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).f30436l) + v()) - r(view2));
            }
        }

        public final void C(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.s()) {
                    appBarLayout.G(appBarLayout.J(view));
                }
            }
        }

        @Override // wm.f
        public /* bridge */ /* synthetic */ int h() {
            return super.h();
        }

        @Override // wm.f
        public /* bridge */ /* synthetic */ int i() {
            return super.i();
        }

        @Override // wm.f
        public /* bridge */ /* synthetic */ boolean j() {
            return super.j();
        }

        @Override // wm.f
        public /* bridge */ /* synthetic */ boolean k() {
            return super.k();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // wm.f
        public /* bridge */ /* synthetic */ void m(boolean z11) {
            super.m(z11);
        }

        @Override // wm.f
        public /* bridge */ /* synthetic */ boolean n(int i11) {
            return super.n(i11);
        }

        @Override // wm.f
        public /* bridge */ /* synthetic */ boolean o(int i11) {
            return super.o(i11);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            B(view, view2);
            C(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onDependentViewRemoved(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            if (view2 instanceof AppBarLayout) {
                ViewCompat.setAccessibilityDelegate(coordinatorLayout, null);
            }
        }

        @Override // wm.f, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i11) {
            return super.onLayoutChild(coordinatorLayout, view, i11);
        }

        @Override // wm.e, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i11, int i12, int i13, int i14) {
            return super.onMeasureChild(coordinatorLayout, view, i11, i12, i13, i14);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onRequestChildRectangleOnScreen(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull Rect rect, boolean z11) {
            AppBarLayout q11 = q(coordinatorLayout.getDependencies(view));
            if (q11 != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.f96498d;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    q11.B(false, !z11);
                    return true;
                }
            }
            return false;
        }

        @Override // wm.f
        public /* bridge */ /* synthetic */ void p(boolean z11) {
            super.p(z11);
        }

        @Override // wm.e
        public float s(View view) {
            int i11;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int A = A(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + A > downNestedPreScrollRange) && (i11 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (A / i11) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // wm.e
        public int u(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.u(view);
        }

        @Override // wm.e
        @Nullable
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public AppBarLayout q(@NonNull List<View> list) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = list.get(i11);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ScrollingViewBehavior_Layout);
            x(obtainStyledAttributes.getDimensionPixelSize(R.styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements OnApplyWindowInsetsListener {
        public a() {
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            return AppBarLayout.this.w(windowInsetsCompat);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b<T extends AppBarLayout> {
        void a(T t11, int i11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class c {
        public abstract void a(@NonNull AppBarLayout appBarLayout, @NonNull View view, float f11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d extends c {

        /* renamed from: c, reason: collision with root package name */
        public static final float f30454c = 0.3f;

        /* renamed from: a, reason: collision with root package name */
        public final Rect f30455a = new Rect();

        /* renamed from: b, reason: collision with root package name */
        public final Rect f30456b = new Rect();

        public static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.c
        public void a(@NonNull AppBarLayout appBarLayout, @NonNull View view, float f11) {
            b(this.f30455a, appBarLayout, view);
            float abs = this.f30455a.top - Math.abs(f11);
            if (abs > 0.0f) {
                ViewCompat.setClipBounds(view, null);
                view.setTranslationY(0.0f);
                view.setVisibility(0);
                return;
            }
            float clamp = 1.0f - MathUtils.clamp(Math.abs(abs / this.f30455a.height()), 0.0f, 1.0f);
            float height = (-abs) - ((this.f30455a.height() * 0.3f) * (1.0f - (clamp * clamp)));
            view.setTranslationY(height);
            view.getDrawingRect(this.f30456b);
            this.f30456b.offset(0, (int) (-height));
            if (height >= this.f30456b.height()) {
                view.setVisibility(4);
            } else {
                view.setVisibility(0);
            }
            ViewCompat.setClipBounds(view, this.f30456b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface f {
        void a(@Dimension float f11, @ColorInt int i11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface g extends b<AppBarLayout> {
        @Override // com.google.android.material.appbar.AppBarLayout.b
        void a(AppBarLayout appBarLayout, int i11);
    }

    public AppBarLayout(@NonNull Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(AppBarLayout appBarLayout, k kVar, ValueAnimator valueAnimator) {
        appBarLayout.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        kVar.o0(floatValue);
        Drawable drawable = appBarLayout.f30431v;
        if (drawable instanceof k) {
            ((k) drawable).o0(floatValue);
        }
        Iterator<f> it = appBarLayout.f30427r.iterator();
        while (it.hasNext()) {
            it.next().a(floatValue, kVar.E());
        }
    }

    public static /* synthetic */ void b(AppBarLayout appBarLayout, ColorStateList colorStateList, ColorStateList colorStateList2, k kVar, Integer num, ValueAnimator valueAnimator) {
        Integer num2;
        appBarLayout.getClass();
        int t11 = u.t(colorStateList.getDefaultColor(), colorStateList2.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
        kVar.p0(ColorStateList.valueOf(t11));
        if (appBarLayout.f30431v != null && (num2 = appBarLayout.f30432w) != null && num2.equals(num)) {
            DrawableCompat.setTint(appBarLayout.f30431v, t11);
        }
        if (appBarLayout.f30427r.isEmpty()) {
            return;
        }
        for (f fVar : appBarLayout.f30427r) {
            if (kVar.z() != null) {
                fVar.a(0.0f, t11);
            }
        }
    }

    public void A() {
        this.f30415f = 0;
    }

    public void B(boolean z11, boolean z12) {
        C(z11, z12, true);
    }

    public final void C(boolean z11, boolean z12, boolean z13) {
        this.f30415f = (z11 ? 1 : 2) | (z12 ? 4 : 0) | (z13 ? 8 : 0);
        requestLayout();
    }

    public boolean D(boolean z11) {
        this.f30418i = true;
        return E(z11);
    }

    public final boolean E(boolean z11) {
        if (this.f30419j == z11) {
            return false;
        }
        this.f30419j = z11;
        refreshDrawableState();
        return true;
    }

    public boolean F(boolean z11) {
        return H(z11, true);
    }

    public boolean G(boolean z11) {
        return H(z11, !this.f30418i);
    }

    public boolean H(boolean z11, boolean z12) {
        if (!z12 || this.f30420k == z11) {
            return false;
        }
        this.f30420k = z11;
        refreshDrawableState();
        if (!t()) {
            return true;
        }
        if (this.f30424o) {
            L(z11 ? 0.0f : 1.0f, z11 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.f30421l) {
            return true;
        }
        L(z11 ? 0.0f : this.f30433x, z11 ? this.f30433x : 0.0f);
        return true;
    }

    public final boolean I() {
        return this.f30431v != null && getTopInset() > 0;
    }

    public boolean J(@Nullable View view) {
        View i11 = i(view);
        if (i11 != null) {
            view = i11;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    public final boolean K() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !ViewCompat.getFitsSystemWindows(childAt)) {
                return true;
            }
        }
        return false;
    }

    public final void L(float f11, float f12) {
        ValueAnimator valueAnimator = this.f30425p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f12);
        this.f30425p = ofFloat;
        ofFloat.setDuration(this.f30428s);
        this.f30425p.setInterpolator(this.f30429t);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f30426q;
        if (animatorUpdateListener != null) {
            this.f30425p.addUpdateListener(animatorUpdateListener);
        }
        this.f30425p.start();
    }

    public final void M() {
        setWillNotDraw(!I());
    }

    public void c(@NonNull f fVar) {
        this.f30427r.add(fVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public void d(@Nullable b bVar) {
        if (this.f30417h == null) {
            this.f30417h = new ArrayList();
        }
        if (bVar == null || this.f30417h.contains(bVar)) {
            return;
        }
        this.f30417h.add(bVar);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        if (I()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f30410a);
            this.f30431v.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f30431v;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public void e(g gVar) {
        d(gVar);
    }

    public void f() {
        this.f30427r.clear();
    }

    public final void g() {
        WeakReference<View> weakReference = this.f30423n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f30423n = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f30434y = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int i11;
        int minimumHeight;
        int i12 = this.f30412c;
        if (i12 != -1) {
            return i12;
        }
        int i13 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i14 = eVar.f30469a;
                if ((i14 & 5) != 5) {
                    if (i13 > 0) {
                        break;
                    }
                } else {
                    int i15 = ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                    if ((i14 & 8) != 0) {
                        minimumHeight = ViewCompat.getMinimumHeight(childAt);
                    } else if ((i14 & 2) != 0) {
                        minimumHeight = measuredHeight - ViewCompat.getMinimumHeight(childAt);
                    } else {
                        i11 = i15 + measuredHeight;
                        if (childCount == 0 && ViewCompat.getFitsSystemWindows(childAt)) {
                            i11 = Math.min(i11, measuredHeight - getTopInset());
                        }
                        i13 += i11;
                    }
                    i11 = i15 + minimumHeight;
                    if (childCount == 0) {
                        i11 = Math.min(i11, measuredHeight - getTopInset());
                    }
                    i13 += i11;
                }
            }
        }
        int max = Math.max(0, i13);
        this.f30412c = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i11 = this.f30413d;
        if (i11 != -1) {
            return i11;
        }
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                int i14 = eVar.f30469a;
                if ((i14 & 1) == 0) {
                    break;
                }
                i13 += measuredHeight;
                if ((i14 & 2) != 0) {
                    i13 -= ViewCompat.getMinimumHeight(childAt);
                    break;
                }
            }
            i12++;
        }
        int max = Math.max(0, i13);
        this.f30413d = max;
        return max;
    }

    @IdRes
    public int getLiftOnScrollTargetViewId() {
        return this.f30422m;
    }

    @Nullable
    public k getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof k) {
            return (k) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = ViewCompat.getMinimumHeight(this);
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? ViewCompat.getMinimumHeight(getChildAt(childCount - 1)) : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f30415f;
    }

    @Nullable
    public Drawable getStatusBarForeground() {
        return this.f30431v;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    @VisibleForTesting
    public final int getTopInset() {
        WindowInsetsCompat windowInsetsCompat = this.f30416g;
        if (windowInsetsCompat != null) {
            return windowInsetsCompat.getSystemWindowInsetTop();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i11 = this.f30411b;
        if (i11 != -1) {
            return i11;
        }
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i14 = eVar.f30469a;
                if ((i14 & 1) == 0) {
                    break;
                }
                i13 += measuredHeight + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                if (i12 == 0 && ViewCompat.getFitsSystemWindows(childAt)) {
                    i13 -= getTopInset();
                }
                if ((i14 & 2) != 0) {
                    i13 -= ViewCompat.getMinimumHeight(childAt);
                    break;
                }
            }
            i12++;
        }
        int max = Math.max(0, i13);
        this.f30411b = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Nullable
    public final Integer h() {
        Drawable drawable = this.f30431v;
        if (drawable instanceof k) {
            return Integer.valueOf(((k) drawable).E());
        }
        ColorStateList g11 = kn.d.g(drawable);
        if (g11 != null) {
            return Integer.valueOf(g11.getDefaultColor());
        }
        return null;
    }

    @Nullable
    public final View i(@Nullable View view) {
        int i11;
        if (this.f30423n == null && (i11 = this.f30422m) != -1) {
            View findViewById = view != null ? view.findViewById(i11) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f30422m);
            }
            if (findViewById != null) {
                this.f30423n = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.f30423n;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new e((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public boolean m() {
        return this.f30414e;
    }

    public final boolean n() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            if (((e) getChildAt(i11).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    public boolean o() {
        return getTotalScrollRange() != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        l.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i11) {
        if (this.f30430u == null) {
            this.f30430u = new int[4];
        }
        int[] iArr = this.f30430u;
        int[] onCreateDrawableState = super.onCreateDrawableState(i11 + iArr.length);
        boolean z11 = this.f30419j;
        int i12 = R.attr.state_liftable;
        if (!z11) {
            i12 = -i12;
        }
        iArr[0] = i12;
        iArr[1] = (z11 && this.f30420k) ? R.attr.state_lifted : -R.attr.state_lifted;
        int i13 = R.attr.state_collapsible;
        if (!z11) {
            i13 = -i13;
        }
        iArr[2] = i13;
        iArr[3] = (z11 && this.f30420k) ? R.attr.state_collapsed : -R.attr.state_collapsed;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        boolean z12 = true;
        if (ViewCompat.getFitsSystemWindows(this) && K()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                ViewCompat.offsetTopAndBottom(getChildAt(childCount), topInset);
            }
        }
        r();
        this.f30414e = false;
        int childCount2 = getChildCount();
        int i15 = 0;
        while (true) {
            if (i15 >= childCount2) {
                break;
            }
            if (((e) getChildAt(i15).getLayoutParams()).d() != null) {
                this.f30414e = true;
                break;
            }
            i15++;
        }
        Drawable drawable = this.f30431v;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f30418i) {
            return;
        }
        if (!this.f30421l && !n()) {
            z12 = false;
        }
        E(z12);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int mode = View.MeasureSpec.getMode(i12);
        if (mode != 1073741824 && ViewCompat.getFitsSystemWindows(this) && K()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = MathUtils.clamp(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i12));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        r();
    }

    public final void p(final k kVar, @NonNull final ColorStateList colorStateList, @NonNull final ColorStateList colorStateList2) {
        final Integer f11 = u.f(getContext(), R.attr.colorSurface);
        this.f30426q = new ValueAnimator.AnimatorUpdateListener() { // from class: wm.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.b(AppBarLayout.this, colorStateList, colorStateList2, kVar, f11, valueAnimator);
            }
        };
        ViewCompat.setBackground(this, kVar);
    }

    public final void q(Context context, final k kVar) {
        kVar.a0(context);
        this.f30426q = new ValueAnimator.AnimatorUpdateListener() { // from class: wm.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.a(AppBarLayout.this, kVar, valueAnimator);
            }
        };
        ViewCompat.setBackground(this, kVar);
    }

    public final void r() {
        Behavior behavior = this.f30434y;
        BaseBehavior.SavedState d02 = (behavior == null || this.f30411b == -1 || this.f30415f != 0) ? null : behavior.d0(AbsSavedState.EMPTY_STATE, this);
        this.f30411b = -1;
        this.f30412c = -1;
        this.f30413d = -1;
        if (d02 != null) {
            this.f30434y.c0(d02, false);
        }
    }

    public boolean s() {
        return this.f30421l;
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f11) {
        super.setElevation(f11);
        l.d(this, f11);
    }

    public void setExpanded(boolean z11) {
        B(z11, ViewCompat.isLaidOut(this));
    }

    public void setLiftOnScroll(boolean z11) {
        this.f30421l = z11;
    }

    public void setLiftOnScrollTargetView(@Nullable View view) {
        this.f30422m = -1;
        if (view == null) {
            g();
        } else {
            this.f30423n = new WeakReference<>(view);
        }
    }

    public void setLiftOnScrollTargetViewId(@IdRes int i11) {
        this.f30422m = i11;
        g();
    }

    public void setLiftableOverrideEnabled(boolean z11) {
        this.f30418i = z11;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i11) {
        if (i11 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i11);
    }

    public void setStatusBarForeground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f30431v;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.f30431v = drawable != null ? drawable.mutate() : null;
            this.f30432w = h();
            Drawable drawable3 = this.f30431v;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f30431v.setState(getDrawableState());
                }
                DrawableCompat.setLayoutDirection(this.f30431v, ViewCompat.getLayoutDirection(this));
                this.f30431v.setVisible(getVisibility() == 0, false);
                this.f30431v.setCallback(this);
            }
            M();
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setStatusBarForegroundColor(@ColorInt int i11) {
        setStatusBarForeground(new ColorDrawable(i11));
    }

    public void setStatusBarForegroundResource(@DrawableRes int i11) {
        setStatusBarForeground(AppCompatResources.getDrawable(getContext(), i11));
    }

    @Deprecated
    public void setTargetElevation(float f11) {
        h.b(this, f11);
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        boolean z11 = i11 == 0;
        Drawable drawable = this.f30431v;
        if (drawable != null) {
            drawable.setVisible(z11, false);
        }
    }

    public final boolean t() {
        return getBackground() instanceof k;
    }

    public boolean u() {
        return this.f30420k;
    }

    public void v(int i11) {
        this.f30410a = i11;
        if (!willNotDraw()) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
        List<b> list = this.f30417h;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                b bVar = this.f30417h.get(i12);
                if (bVar != null) {
                    bVar.a(this, i11);
                }
            }
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f30431v;
    }

    public WindowInsetsCompat w(WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompat2 = ViewCompat.getFitsSystemWindows(this) ? windowInsetsCompat : null;
        if (!ObjectsCompat.equals(this.f30416g, windowInsetsCompat2)) {
            this.f30416g = windowInsetsCompat2;
            M();
            requestLayout();
        }
        return windowInsetsCompat;
    }

    public boolean x(@NonNull f fVar) {
        return this.f30427r.remove(fVar);
    }

    public void y(@Nullable b bVar) {
        List<b> list = this.f30417h;
        if (list == null || bVar == null) {
            return;
        }
        list.remove(bVar);
    }

    public void z(g gVar) {
        y(gVar);
    }

    public AppBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppBarLayout(@androidx.annotation.NonNull android.content.Context r10, @androidx.annotation.Nullable android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            int r4 = com.google.android.material.appbar.AppBarLayout.E
            android.content.Context r10 = zn.a.c(r10, r11, r12, r4)
            r9.<init>(r10, r11, r12)
            r10 = -1
            r9.f30411b = r10
            r9.f30412c = r10
            r9.f30413d = r10
            r6 = 0
            r9.f30415f = r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.f30427r = r0
            android.content.Context r0 = r9.getContext()
            r7 = 1
            r9.setOrientation(r7)
            int r8 = android.os.Build.VERSION.SDK_INT
            android.view.ViewOutlineProvider r1 = r9.getOutlineProvider()
            android.view.ViewOutlineProvider r2 = android.view.ViewOutlineProvider.BACKGROUND
            if (r1 != r2) goto L2f
            wm.h.a(r9)
        L2f:
            wm.h.c(r9, r11, r12, r4)
            int[] r2 = com.google.android.material.R.styleable.AppBarLayout
            int[] r5 = new int[r6]
            r1 = r11
            r3 = r12
            android.content.res.TypedArray r11 = com.google.android.material.internal.d0.k(r0, r1, r2, r3, r4, r5)
            int r12 = com.google.android.material.R.styleable.AppBarLayout_android_background
            android.graphics.drawable.Drawable r12 = r11.getDrawable(r12)
            androidx.core.view.ViewCompat.setBackground(r9, r12)
            int r12 = com.google.android.material.R.styleable.AppBarLayout_liftOnScrollColor
            android.content.res.ColorStateList r12 = sn.c.a(r0, r11, r12)
            if (r12 == 0) goto L4e
            goto L4f
        L4e:
            r7 = r6
        L4f:
            r9.f30424o = r7
            android.graphics.drawable.Drawable r1 = r9.getBackground()
            android.content.res.ColorStateList r1 = kn.d.g(r1)
            if (r1 == 0) goto L6c
            vn.k r2 = new vn.k
            r2.<init>()
            r2.p0(r1)
            if (r12 == 0) goto L69
            r9.p(r2, r1, r12)
            goto L6c
        L69:
            r9.q(r0, r2)
        L6c:
            int r12 = com.google.android.material.R.attr.motionDurationMedium2
            android.content.res.Resources r1 = r9.getResources()
            int r2 = com.google.android.material.R.integer.app_bar_elevation_anim_duration
            int r1 = r1.getInteger(r2)
            int r12 = pn.j.f(r0, r12, r1)
            long r1 = (long) r12
            r9.f30428s = r1
            int r12 = com.google.android.material.R.attr.motionEasingStandardInterpolator
            android.animation.TimeInterpolator r1 = vm.b.f94060a
            android.animation.TimeInterpolator r12 = pn.j.g(r0, r12, r1)
            r9.f30429t = r12
            int r12 = com.google.android.material.R.styleable.AppBarLayout_expanded
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L98
            boolean r12 = r11.getBoolean(r12, r6)
            r9.C(r12, r6, r6)
        L98:
            int r12 = com.google.android.material.R.styleable.AppBarLayout_elevation
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto La8
            int r12 = r11.getDimensionPixelSize(r12, r6)
            float r12 = (float) r12
            wm.h.b(r9, r12)
        La8:
            r12 = 26
            if (r8 < r12) goto Lca
            int r12 = com.google.android.material.R.styleable.AppBarLayout_android_keyboardNavigationCluster
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto Lbb
            boolean r12 = r11.getBoolean(r12, r6)
            wm.a.a(r9, r12)
        Lbb:
            int r12 = com.google.android.material.R.styleable.AppBarLayout_android_touchscreenBlocksFocus
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto Lca
            boolean r12 = r11.getBoolean(r12, r6)
            r9.setTouchscreenBlocksFocus(r12)
        Lca:
            android.content.res.Resources r12 = r9.getResources()
            int r0 = com.google.android.material.R.dimen.design_appbar_elevation
            float r12 = r12.getDimension(r0)
            r9.f30433x = r12
            int r12 = com.google.android.material.R.styleable.AppBarLayout_liftOnScroll
            boolean r12 = r11.getBoolean(r12, r6)
            r9.f30421l = r12
            int r12 = com.google.android.material.R.styleable.AppBarLayout_liftOnScrollTargetViewId
            int r10 = r11.getResourceId(r12, r10)
            r9.f30422m = r10
            int r10 = com.google.android.material.R.styleable.AppBarLayout_statusBarForeground
            android.graphics.drawable.Drawable r10 = r11.getDrawable(r10)
            r9.setStatusBarForeground(r10)
            r11.recycle()
            com.google.android.material.appbar.AppBarLayout$a r10 = new com.google.android.material.appbar.AppBarLayout$a
            r10.<init>()
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e extends LinearLayout.LayoutParams {

        /* renamed from: d, reason: collision with root package name */
        public static final int f30457d = 0;

        /* renamed from: e, reason: collision with root package name */
        public static final int f30458e = 1;

        /* renamed from: f, reason: collision with root package name */
        public static final int f30459f = 2;

        /* renamed from: g, reason: collision with root package name */
        public static final int f30460g = 4;

        /* renamed from: h, reason: collision with root package name */
        public static final int f30461h = 8;

        /* renamed from: i, reason: collision with root package name */
        public static final int f30462i = 16;

        /* renamed from: j, reason: collision with root package name */
        public static final int f30463j = 32;

        /* renamed from: k, reason: collision with root package name */
        public static final int f30464k = 5;

        /* renamed from: l, reason: collision with root package name */
        public static final int f30465l = 17;

        /* renamed from: m, reason: collision with root package name */
        public static final int f30466m = 10;

        /* renamed from: n, reason: collision with root package name */
        public static final int f30467n = 0;

        /* renamed from: o, reason: collision with root package name */
        public static final int f30468o = 1;

        /* renamed from: a, reason: collision with root package name */
        public int f30469a;

        /* renamed from: b, reason: collision with root package name */
        public c f30470b;

        /* renamed from: c, reason: collision with root package name */
        public Interpolator f30471c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface a {
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface b {
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f30469a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.AppBarLayout_Layout);
            this.f30469a = obtainStyledAttributes.getInt(R.styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
            f(obtainStyledAttributes.getInt(R.styleable.AppBarLayout_Layout_layout_scrollEffect, 0));
            int i11 = R.styleable.AppBarLayout_Layout_layout_scrollInterpolator;
            if (obtainStyledAttributes.hasValue(i11)) {
                this.f30471c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i11, 0));
            }
            obtainStyledAttributes.recycle();
        }

        @Nullable
        public final c a(int i11) {
            if (i11 != 1) {
                return null;
            }
            return new d();
        }

        @Nullable
        public c b() {
            return this.f30470b;
        }

        public int c() {
            return this.f30469a;
        }

        public Interpolator d() {
            return this.f30471c;
        }

        public boolean e() {
            int i11 = this.f30469a;
            return (i11 & 1) == 1 && (i11 & 10) != 0;
        }

        public void f(int i11) {
            this.f30470b = a(i11);
        }

        public void g(@Nullable c cVar) {
            this.f30470b = cVar;
        }

        public void h(int i11) {
            this.f30469a = i11;
        }

        public void i(Interpolator interpolator) {
            this.f30471c = interpolator;
        }

        public e(int i11, int i12) {
            super(i11, i12);
            this.f30469a = 1;
        }

        public e(int i11, int i12, float f11) {
            super(i11, i12, f11);
            this.f30469a = 1;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f30469a = 1;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f30469a = 1;
        }

        @RequiresApi(19)
        public e(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f30469a = 1;
        }

        @RequiresApi(19)
        public e(@NonNull e eVar) {
            super((LinearLayout.LayoutParams) eVar);
            this.f30469a = 1;
            this.f30469a = eVar.f30469a;
            this.f30470b = eVar.f30470b;
            this.f30471c = eVar.f30471c;
        }
    }
}
