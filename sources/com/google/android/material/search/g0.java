package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.activity.BackEventCompat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.m0;
import com.google.android.material.search.SearchView;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class g0 {
    public static final long A = 250;
    public static final float B = 0.95f;
    public static final long C = 350;
    public static final long D = 150;
    public static final long E = 300;

    /* renamed from: p, reason: collision with root package name */
    public static final long f31947p = 300;

    /* renamed from: q, reason: collision with root package name */
    public static final long f31948q = 50;

    /* renamed from: r, reason: collision with root package name */
    public static final long f31949r = 250;

    /* renamed from: s, reason: collision with root package name */
    public static final long f31950s = 150;

    /* renamed from: t, reason: collision with root package name */
    public static final long f31951t = 75;

    /* renamed from: u, reason: collision with root package name */
    public static final long f31952u = 300;

    /* renamed from: v, reason: collision with root package name */
    public static final long f31953v = 250;

    /* renamed from: w, reason: collision with root package name */
    public static final long f31954w = 42;

    /* renamed from: x, reason: collision with root package name */
    public static final long f31955x = 0;

    /* renamed from: y, reason: collision with root package name */
    public static final long f31956y = 83;

    /* renamed from: z, reason: collision with root package name */
    public static final long f31957z = 0;

    /* renamed from: a, reason: collision with root package name */
    public final SearchView f31958a;

    /* renamed from: b, reason: collision with root package name */
    public final View f31959b;

    /* renamed from: c, reason: collision with root package name */
    public final ClippableRoundedCornerLayout f31960c;

    /* renamed from: d, reason: collision with root package name */
    public final FrameLayout f31961d;

    /* renamed from: e, reason: collision with root package name */
    public final FrameLayout f31962e;

    /* renamed from: f, reason: collision with root package name */
    public final Toolbar f31963f;

    /* renamed from: g, reason: collision with root package name */
    public final Toolbar f31964g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f31965h;

    /* renamed from: i, reason: collision with root package name */
    public final EditText f31966i;

    /* renamed from: j, reason: collision with root package name */
    public final ImageButton f31967j;

    /* renamed from: k, reason: collision with root package name */
    public final View f31968k;

    /* renamed from: l, reason: collision with root package name */
    public final TouchObserverFrameLayout f31969l;

    /* renamed from: m, reason: collision with root package name */
    public final pn.h f31970m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public AnimatorSet f31971n;

    /* renamed from: o, reason: collision with root package name */
    public SearchBar f31972o;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            g0.this.f31960c.setVisibility(8);
            if (!g0.this.f31958a.x()) {
                g0.this.f31958a.t();
            }
            g0.this.f31958a.setTransitionState(SearchView.TransitionState.HIDDEN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g0.this.f31958a.setTransitionState(SearchView.TransitionState.HIDING);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            g0.this.f31960c.setVisibility(8);
            if (!g0.this.f31958a.x()) {
                g0.this.f31958a.t();
            }
            g0.this.f31958a.setTransitionState(SearchView.TransitionState.HIDDEN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g0.this.f31958a.setTransitionState(SearchView.TransitionState.HIDING);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f31975a;

        public c(boolean z11) {
            this.f31975a = z11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            g0.this.P(this.f31975a ? 1.0f : 0.0f);
            g0.this.f31960c.a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g0.this.P(this.f31975a ? 0.0f : 1.0f);
        }
    }

    public g0(SearchView searchView) {
        this.f31958a = searchView;
        this.f31959b = searchView.f31903a;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchView.f31904b;
        this.f31960c = clippableRoundedCornerLayout;
        this.f31961d = searchView.f31907e;
        this.f31962e = searchView.f31908f;
        this.f31963f = searchView.f31909g;
        this.f31964g = searchView.f31910h;
        this.f31965h = searchView.f31911i;
        this.f31966i = searchView.f31912j;
        this.f31967j = searchView.f31913k;
        this.f31968k = searchView.f31914l;
        this.f31969l = searchView.f31915m;
        this.f31970m = new pn.h(clippableRoundedCornerLayout);
    }

    public static /* synthetic */ void a(g0 g0Var) {
        g0Var.f31960c.setTranslationY(r0.getHeight());
        AnimatorSet J = g0Var.J(true);
        J.addListener(new h0(g0Var));
        J.start();
    }

    public static /* synthetic */ void b(g0 g0Var, float f11, float f12, Rect rect, ValueAnimator valueAnimator) {
        g0Var.getClass();
        g0Var.f31960c.c(rect, vm.b.a(f11, f12, valueAnimator.getAnimatedFraction()));
    }

    public static /* synthetic */ void d(g0 g0Var) {
        AnimatorSet B2 = g0Var.B(true);
        B2.addListener(new f0(g0Var));
        B2.start();
    }

    public final Animator A(boolean z11) {
        return K(z11, true, this.f31966i);
    }

    public final AnimatorSet B(boolean z11) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (this.f31971n == null) {
            animatorSet.playTogether(s(z11), t(z11));
        }
        animatorSet.playTogether(H(z11), G(z11), u(z11), w(z11), F(z11), z(z11), q(z11), A(z11), I(z11));
        animatorSet.addListener(new c(z11));
        return animatorSet;
    }

    public final int C(View view) {
        int marginEnd = MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) view.getLayoutParams());
        return m0.s(this.f31972o) ? this.f31972o.getLeft() - marginEnd : (this.f31972o.getRight() - this.f31958a.getWidth()) + marginEnd;
    }

    public final int D(View view) {
        int marginStart = MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) view.getLayoutParams());
        int paddingStart = ViewCompat.getPaddingStart(this.f31972o);
        return m0.s(this.f31972o) ? ((this.f31972o.getWidth() - this.f31972o.getRight()) + marginStart) - paddingStart : (this.f31972o.getLeft() - marginStart) + paddingStart;
    }

    public final int E() {
        return ((this.f31972o.getTop() + this.f31972o.getBottom()) / 2) - ((this.f31962e.getTop() + this.f31962e.getBottom()) / 2);
    }

    public final Animator F(boolean z11) {
        return K(z11, false, this.f31961d);
    }

    public final Animator G(boolean z11) {
        Rect m11 = this.f31970m.m();
        Rect l11 = this.f31970m.l();
        if (m11 == null) {
            m11 = m0.d(this.f31958a);
        }
        if (l11 == null) {
            l11 = m0.c(this.f31960c, this.f31972o);
        }
        final Rect rect = new Rect(l11);
        final float cornerSize = this.f31972o.getCornerSize();
        final float max = Math.max(this.f31960c.getCornerRadius(), this.f31970m.k());
        ValueAnimator ofObject = ValueAnimator.ofObject(new com.google.android.material.internal.v(rect), l11, m11);
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.z
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                g0.b(g0.this, cornerSize, max, rect, valueAnimator);
            }
        });
        ofObject.setDuration(z11 ? 300L : 250L);
        ofObject.setInterpolator(com.google.android.material.internal.w.a(z11, vm.b.f94061b));
        return ofObject;
    }

    public final Animator H(boolean z11) {
        TimeInterpolator timeInterpolator = z11 ? vm.b.f94060a : vm.b.f94061b;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(z11 ? 300L : 250L);
        ofFloat.setInterpolator(com.google.android.material.internal.w.a(z11, timeInterpolator));
        ofFloat.addUpdateListener(com.google.android.material.internal.r.f(this.f31959b));
        return ofFloat;
    }

    public final Animator I(boolean z11) {
        return K(z11, true, this.f31965h);
    }

    public final AnimatorSet J(boolean z11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(L());
        k(animatorSet);
        animatorSet.setInterpolator(com.google.android.material.internal.w.a(z11, vm.b.f94061b));
        animatorSet.setDuration(z11 ? 350L : 300L);
        return animatorSet;
    }

    public final Animator K(boolean z11, boolean z12, View view) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z12 ? D(view) : C(view), 0.0f);
        ofFloat.addUpdateListener(com.google.android.material.internal.r.n(view));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(E(), 0.0f);
        ofFloat2.addUpdateListener(com.google.android.material.internal.r.p(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(z11 ? 300L : 250L);
        animatorSet.setInterpolator(com.google.android.material.internal.w.a(z11, vm.b.f94061b));
        return animatorSet;
    }

    public final Animator L() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f31960c.getHeight(), 0.0f);
        ofFloat.addUpdateListener(com.google.android.material.internal.r.p(this.f31960c));
        return ofFloat;
    }

    @uo.a
    public AnimatorSet M() {
        return this.f31972o != null ? W() : X();
    }

    @Nullable
    public BackEventCompat N() {
        return this.f31970m.c();
    }

    public final void O(float f11) {
        ActionMenuView b11;
        if (!this.f31958a.B() || (b11 = com.google.android.material.internal.e0.b(this.f31963f)) == null) {
            return;
        }
        b11.setAlpha(f11);
    }

    public final void P(float f11) {
        this.f31967j.setAlpha(f11);
        this.f31968k.setAlpha(f11);
        this.f31969l.setAlpha(f11);
        O(f11);
    }

    public final void Q(Drawable drawable) {
        if (drawable instanceof DrawerArrowDrawable) {
            ((DrawerArrowDrawable) drawable).setProgress(1.0f);
        }
        if (drawable instanceof com.google.android.material.internal.i) {
            ((com.google.android.material.internal.i) drawable).a(1.0f);
        }
    }

    public final void R(Toolbar toolbar) {
        ActionMenuView b11 = com.google.android.material.internal.e0.b(toolbar);
        if (b11 != null) {
            for (int i11 = 0; i11 < b11.getChildCount(); i11++) {
                View childAt = b11.getChildAt(i11);
                childAt.setClickable(false);
                childAt.setFocusable(false);
                childAt.setFocusableInTouchMode(false);
            }
        }
    }

    public void S(SearchBar searchBar) {
        this.f31972o = searchBar;
    }

    public final void T() {
        Menu menu = this.f31964g.getMenu();
        if (menu != null) {
            menu.clear();
        }
        if (this.f31972o.getMenuResId() == -1 || !this.f31958a.B()) {
            this.f31964g.setVisibility(8);
            return;
        }
        this.f31964g.inflateMenu(this.f31972o.getMenuResId());
        R(this.f31964g);
        this.f31964g.setVisibility(0);
    }

    public void U() {
        if (this.f31972o != null) {
            Y();
        } else {
            Z();
        }
    }

    public void V(@NonNull BackEventCompat backEventCompat) {
        this.f31970m.s(backEventCompat, this.f31972o);
    }

    public final AnimatorSet W() {
        if (this.f31958a.x()) {
            this.f31958a.t();
        }
        AnimatorSet B2 = B(false);
        B2.addListener(new a());
        B2.start();
        return B2;
    }

    public final AnimatorSet X() {
        if (this.f31958a.x()) {
            this.f31958a.t();
        }
        AnimatorSet J = J(false);
        J.addListener(new b());
        J.start();
        return J;
    }

    public final void Y() {
        if (this.f31958a.x()) {
            this.f31958a.K();
        }
        this.f31958a.setTransitionState(SearchView.TransitionState.SHOWING);
        T();
        this.f31966i.setText(this.f31972o.getText());
        EditText editText = this.f31966i;
        editText.setSelection(editText.getText().length());
        this.f31960c.setVisibility(4);
        this.f31960c.post(new Runnable() { // from class: com.google.android.material.search.b0
            @Override // java.lang.Runnable
            public final void run() {
                g0.d(g0.this);
            }
        });
    }

    public final void Z() {
        if (this.f31958a.x()) {
            final SearchView searchView = this.f31958a;
            Objects.requireNonNull(searchView);
            searchView.postDelayed(new Runnable() { // from class: com.google.android.material.search.d0
                @Override // java.lang.Runnable
                public final void run() {
                    SearchView.this.K();
                }
            }, 150L);
        }
        this.f31960c.setVisibility(4);
        this.f31960c.post(new Runnable() { // from class: com.google.android.material.search.e0
            @Override // java.lang.Runnable
            public final void run() {
                g0.a(g0.this);
            }
        });
    }

    @RequiresApi(34)
    public void a0(@NonNull BackEventCompat backEventCompat) {
        if (backEventCompat.getProgress() <= 0.0f) {
            return;
        }
        pn.h hVar = this.f31970m;
        SearchBar searchBar = this.f31972o;
        hVar.u(backEventCompat, searchBar, searchBar.getCornerSize());
        AnimatorSet animatorSet = this.f31971n;
        if (animatorSet != null) {
            animatorSet.setCurrentPlayTime((long) (backEventCompat.getProgress() * this.f31971n.getDuration()));
            return;
        }
        if (this.f31958a.x()) {
            this.f31958a.t();
        }
        if (this.f31958a.y()) {
            AnimatorSet s11 = s(false);
            this.f31971n = s11;
            s11.start();
            this.f31971n.pause();
        }
    }

    public final void j(AnimatorSet animatorSet) {
        ActionMenuView b11 = com.google.android.material.internal.e0.b(this.f31963f);
        if (b11 == null) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(C(b11), 0.0f);
        ofFloat.addUpdateListener(com.google.android.material.internal.r.n(b11));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(E(), 0.0f);
        ofFloat2.addUpdateListener(com.google.android.material.internal.r.p(b11));
        animatorSet.playTogether(ofFloat, ofFloat2);
    }

    public final void k(AnimatorSet animatorSet) {
        ImageButton e11 = com.google.android.material.internal.e0.e(this.f31963f);
        if (e11 == null) {
            return;
        }
        Drawable unwrap = DrawableCompat.unwrap(e11.getDrawable());
        if (!this.f31958a.y()) {
            Q(unwrap);
        } else {
            m(animatorSet, unwrap);
            n(animatorSet, unwrap);
        }
    }

    public final void l(AnimatorSet animatorSet) {
        ImageButton e11 = com.google.android.material.internal.e0.e(this.f31963f);
        if (e11 == null) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(D(e11), 0.0f);
        ofFloat.addUpdateListener(com.google.android.material.internal.r.n(e11));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(E(), 0.0f);
        ofFloat2.addUpdateListener(com.google.android.material.internal.r.p(e11));
        animatorSet.playTogether(ofFloat, ofFloat2);
    }

    public final void m(AnimatorSet animatorSet, Drawable drawable) {
        if (drawable instanceof DrawerArrowDrawable) {
            final DrawerArrowDrawable drawerArrowDrawable = (DrawerArrowDrawable) drawable;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.a0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    DrawerArrowDrawable.this.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            animatorSet.playTogether(ofFloat);
        }
    }

    public final void n(AnimatorSet animatorSet, Drawable drawable) {
        if (drawable instanceof com.google.android.material.internal.i) {
            final com.google.android.material.internal.i iVar = (com.google.android.material.internal.i) drawable;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.c0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    com.google.android.material.internal.i.this.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            animatorSet.playTogether(ofFloat);
        }
    }

    @RequiresApi(34)
    public void o() {
        this.f31970m.g(this.f31972o);
        AnimatorSet animatorSet = this.f31971n;
        if (animatorSet != null) {
            animatorSet.reverse();
        }
        this.f31971n = null;
    }

    @RequiresApi(34)
    public void p() {
        this.f31970m.j(M().getTotalDuration(), this.f31972o);
        if (this.f31971n != null) {
            t(false).start();
            this.f31971n.resume();
        }
        this.f31971n = null;
    }

    public final Animator q(boolean z11) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(z11 ? 300L : 250L);
        ofFloat.setInterpolator(com.google.android.material.internal.w.a(z11, vm.b.f94061b));
        if (this.f31958a.B()) {
            ofFloat.addUpdateListener(new com.google.android.material.internal.j(com.google.android.material.internal.e0.b(this.f31964g), com.google.android.material.internal.e0.b(this.f31963f)));
        }
        return ofFloat;
    }

    public pn.h r() {
        return this.f31970m;
    }

    public final AnimatorSet s(boolean z11) {
        AnimatorSet animatorSet = new AnimatorSet();
        k(animatorSet);
        animatorSet.setDuration(z11 ? 300L : 250L);
        animatorSet.setInterpolator(com.google.android.material.internal.w.a(z11, vm.b.f94061b));
        return animatorSet;
    }

    public final AnimatorSet t(boolean z11) {
        AnimatorSet animatorSet = new AnimatorSet();
        l(animatorSet);
        j(animatorSet);
        animatorSet.setDuration(z11 ? 300L : 250L);
        animatorSet.setInterpolator(com.google.android.material.internal.w.a(z11, vm.b.f94061b));
        return animatorSet;
    }

    public final Animator u(boolean z11) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(z11 ? 50L : 42L);
        ofFloat.setStartDelay(z11 ? 250L : 0L);
        ofFloat.setInterpolator(com.google.android.material.internal.w.a(z11, vm.b.f94060a));
        ofFloat.addUpdateListener(com.google.android.material.internal.r.f(this.f31967j));
        return ofFloat;
    }

    public final Animator v(boolean z11) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(z11 ? 150L : 83L);
        ofFloat.setStartDelay(z11 ? 75L : 0L);
        ofFloat.setInterpolator(com.google.android.material.internal.w.a(z11, vm.b.f94060a));
        ofFloat.addUpdateListener(com.google.android.material.internal.r.f(this.f31968k, this.f31969l));
        return ofFloat;
    }

    public final Animator w(boolean z11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(v(z11), y(z11), x(z11));
        return animatorSet;
    }

    public final Animator x(boolean z11) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.95f, 1.0f);
        ofFloat.setDuration(z11 ? 300L : 250L);
        ofFloat.setInterpolator(com.google.android.material.internal.w.a(z11, vm.b.f94061b));
        ofFloat.addUpdateListener(com.google.android.material.internal.r.h(this.f31969l));
        return ofFloat;
    }

    public final Animator y(boolean z11) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat((this.f31969l.getHeight() * 0.050000012f) / 2.0f, 0.0f);
        ofFloat.setDuration(z11 ? 300L : 250L);
        ofFloat.setInterpolator(com.google.android.material.internal.w.a(z11, vm.b.f94061b));
        ofFloat.addUpdateListener(com.google.android.material.internal.r.p(this.f31968k));
        return ofFloat;
    }

    public final Animator z(boolean z11) {
        return K(z11, false, this.f31964g);
    }
}
