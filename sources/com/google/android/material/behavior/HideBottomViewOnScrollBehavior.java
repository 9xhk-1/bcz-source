package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: j, reason: collision with root package name */
    public static final int f30589j = 225;

    /* renamed from: k, reason: collision with root package name */
    public static final int f30590k = 175;

    /* renamed from: l, reason: collision with root package name */
    public static final int f30591l = R.attr.motionDurationLong2;

    /* renamed from: m, reason: collision with root package name */
    public static final int f30592m = R.attr.motionDurationMedium4;

    /* renamed from: n, reason: collision with root package name */
    public static final int f30593n = R.attr.motionEasingEmphasizedInterpolator;

    /* renamed from: o, reason: collision with root package name */
    public static final int f30594o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f30595p = 2;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinkedHashSet<b> f30596a;

    /* renamed from: b, reason: collision with root package name */
    public int f30597b;

    /* renamed from: c, reason: collision with root package name */
    public int f30598c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f30599d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f30600e;

    /* renamed from: f, reason: collision with root package name */
    public int f30601f;

    /* renamed from: g, reason: collision with root package name */
    @c
    public int f30602g;

    /* renamed from: h, reason: collision with root package name */
    public int f30603h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public ViewPropertyAnimator f30604i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f30604i = null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void a(@NonNull View view, @c int i11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface c {
    }

    public HideBottomViewOnScrollBehavior() {
        this.f30596a = new LinkedHashSet<>();
        this.f30601f = 0;
        this.f30602g = 2;
        this.f30603h = 0;
    }

    public void i(@NonNull b bVar) {
        this.f30596a.add(bVar);
    }

    public final void j(@NonNull V v11, int i11, long j11, TimeInterpolator timeInterpolator) {
        this.f30604i = v11.animate().translationY(i11).setInterpolator(timeInterpolator).setDuration(j11).setListener(new a());
    }

    public void k() {
        this.f30596a.clear();
    }

    public boolean l() {
        return this.f30602g == 1;
    }

    public boolean m() {
        return this.f30602g == 2;
    }

    public void n(@NonNull b bVar) {
        this.f30596a.remove(bVar);
    }

    public void o(@NonNull V v11, @Dimension int i11) {
        this.f30603h = i11;
        if (this.f30602g == 1) {
            v11.setTranslationY(this.f30601f + i11);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11) {
        this.f30601f = v11.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v11.getLayoutParams()).bottomMargin;
        this.f30597b = j.f(v11.getContext(), f30591l, 225);
        this.f30598c = j.f(v11.getContext(), f30592m, 175);
        Context context = v11.getContext();
        int i12 = f30593n;
        this.f30599d = j.g(context, i12, vm.b.f94063d);
        this.f30600e = j.g(v11.getContext(), i12, vm.b.f94062c);
        return super.onLayoutChild(coordinatorLayout, v11, i11);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, int i11, int i12, int i13, int i14, int i15, @NonNull int[] iArr) {
        if (i12 > 0) {
            p(v11);
        } else if (i12 < 0) {
            r(v11);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, @NonNull View view2, int i11, int i12) {
        return i11 == 2;
    }

    public void p(@NonNull V v11) {
        q(v11, true);
    }

    public void q(@NonNull V v11, boolean z11) {
        if (l()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f30604i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v11.clearAnimation();
        }
        t(v11, 1);
        int i11 = this.f30601f + this.f30603h;
        if (z11) {
            j(v11, i11, this.f30598c, this.f30600e);
        } else {
            v11.setTranslationY(i11);
        }
    }

    public void r(@NonNull V v11) {
        s(v11, true);
    }

    public void s(@NonNull V v11, boolean z11) {
        if (m()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f30604i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v11.clearAnimation();
        }
        t(v11, 2);
        if (z11) {
            j(v11, 0, this.f30597b, this.f30599d);
        } else {
            v11.setTranslationY(0);
        }
    }

    public final void t(@NonNull V v11, @c int i11) {
        this.f30602g = i11;
        Iterator<b> it = this.f30596a.iterator();
        while (it.hasNext()) {
            it.next().a(v11, this.f30602g);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30596a = new LinkedHashSet<>();
        this.f30601f = 0;
        this.f30602g = 2;
        this.f30603h = 0;
    }
}
