package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.ViewCompat;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.m0;
import com.google.android.material.search.SearchBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import vm.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class j {

    /* renamed from: j, reason: collision with root package name */
    public static final long f31980j = 250;

    /* renamed from: k, reason: collision with root package name */
    public static final long f31981k = 500;

    /* renamed from: l, reason: collision with root package name */
    public static final long f31982l = 750;

    /* renamed from: m, reason: collision with root package name */
    public static final long f31983m = 250;

    /* renamed from: n, reason: collision with root package name */
    public static final long f31984n = 250;

    /* renamed from: o, reason: collision with root package name */
    public static final long f31985o = 300;

    /* renamed from: p, reason: collision with root package name */
    public static final long f31986p = 75;

    /* renamed from: q, reason: collision with root package name */
    public static final long f31987q = 250;

    /* renamed from: r, reason: collision with root package name */
    public static final long f31988r = 100;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public Animator f31992d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public Animator f31993e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f31994f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f31995g;

    /* renamed from: a, reason: collision with root package name */
    public final Set<SearchBar.b> f31989a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    public final Set<AnimatorListenerAdapter> f31990b = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    public final Set<AnimatorListenerAdapter> f31991c = new LinkedHashSet();

    /* renamed from: h, reason: collision with root package name */
    public boolean f31996h = true;

    /* renamed from: i, reason: collision with root package name */
    public Animator f31997i = null;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            j.this.k(new f() { // from class: com.google.android.material.search.i
                @Override // com.google.android.material.search.j.f
                public final void a(SearchBar.b bVar) {
                    bVar.a();
                }
            });
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f31999a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Animator f32000b;

        public b(View view, Animator animator) {
            this.f31999a = view;
            this.f32000b = animator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f31999a.setVisibility(8);
            this.f32000b.start();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SearchBar f32002a;

        public c(SearchBar searchBar) {
            this.f32002a = searchBar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            j.this.f31994f = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f32002a.setVisibility(4);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            j.this.f31997i = null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SearchBar f32005a;

        public e(SearchBar searchBar) {
            this.f32005a = searchBar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f32005a.setVisibility(0);
            j.this.f31995g = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f32005a.J();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface f {
        void a(SearchBar.b bVar);
    }

    public static /* synthetic */ void b(j jVar, SearchBar searchBar, View view, AppBarLayout appBarLayout, boolean z11) {
        jVar.getClass();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(jVar.t(searchBar, view), jVar.o(searchBar, view, appBarLayout));
        animatorSet.addListener(new k(jVar));
        Iterator<AnimatorListenerAdapter> it = jVar.f31990b.iterator();
        while (it.hasNext()) {
            animatorSet.addListener(it.next());
        }
        if (z11) {
            animatorSet.setDuration(0L);
        }
        animatorSet.start();
        jVar.f31997i = animatorSet;
    }

    public static /* synthetic */ void c(vn.k kVar, View view, ValueAnimator valueAnimator) {
        kVar.q0(1.0f - valueAnimator.getAnimatedFraction());
        ViewCompat.setBackground(view, kVar);
        view.setAlpha(1.0f);
    }

    public boolean A(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        return this.f31991c.remove(animatorListenerAdapter);
    }

    public boolean B(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        return this.f31990b.remove(animatorListenerAdapter);
    }

    public boolean C(SearchBar.b bVar) {
        return this.f31989a.remove(bVar);
    }

    public void D(boolean z11) {
        this.f31996h = z11;
    }

    public void E(SearchBar searchBar, View view, @Nullable AppBarLayout appBarLayout, boolean z11) {
        Animator animator;
        if (y() && (animator = this.f31997i) != null) {
            animator.cancel();
        }
        this.f31995g = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(l(searchBar, view, appBarLayout), s(searchBar));
        animatorSet.addListener(new d());
        Iterator<AnimatorListenerAdapter> it = this.f31991c.iterator();
        while (it.hasNext()) {
            animatorSet.addListener(it.next());
        }
        if (z11) {
            animatorSet.setDuration(0L);
        }
        animatorSet.start();
        this.f31997i = animatorSet;
    }

    public void F(final SearchBar searchBar, final View view, @Nullable final AppBarLayout appBarLayout, final boolean z11) {
        Animator animator;
        if (x() && (animator = this.f31997i) != null) {
            animator.cancel();
        }
        this.f31994f = true;
        view.setVisibility(4);
        view.post(new Runnable() { // from class: com.google.android.material.search.g
            @Override // java.lang.Runnable
            public final void run() {
                j.b(j.this, searchBar, view, appBarLayout, z11);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void G(SearchBar searchBar) {
        k(new f() { // from class: com.google.android.material.search.e
            @Override // com.google.android.material.search.j.f
            public final void a(SearchBar.b bVar) {
                bVar.b();
            }
        });
        TextView textView = searchBar.getTextView();
        View centerView = searchBar.getCenterView();
        View f11 = com.google.android.material.internal.e0.f(searchBar);
        final Animator v11 = v(textView, f11);
        v11.addListener(new a());
        this.f31992d = v11;
        textView.setAlpha(0.0f);
        if (f11 != null) {
            f11.setAlpha(0.0f);
        }
        if (centerView instanceof vm.a) {
            ((vm.a) centerView).b(new a.InterfaceC1268a() { // from class: com.google.android.material.search.f
                @Override // vm.a.InterfaceC1268a
                public final void b() {
                    v11.start();
                }
            });
            return;
        }
        if (centerView == 0) {
            v11.start();
            return;
        }
        centerView.setAlpha(0.0f);
        centerView.setVisibility(0);
        Animator m11 = m(centerView);
        this.f31993e = m11;
        m11.addListener(new b(centerView, v11));
        m11.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void H(SearchBar searchBar) {
        Animator animator = this.f31992d;
        if (animator != null) {
            animator.end();
        }
        Animator animator2 = this.f31993e;
        if (animator2 != null) {
            animator2.end();
        }
        View centerView = searchBar.getCenterView();
        if (centerView instanceof vm.a) {
            ((vm.a) centerView).a();
        }
        if (centerView != 0) {
            centerView.setAlpha(0.0f);
        }
    }

    public void h(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        this.f31991c.add(animatorListenerAdapter);
    }

    public void i(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        this.f31990b.add(animatorListenerAdapter);
    }

    public void j(SearchBar.b bVar) {
        this.f31989a.add(bVar);
    }

    public final void k(f fVar) {
        Iterator<SearchBar.b> it = this.f31989a.iterator();
        while (it.hasNext()) {
            fVar.a(it.next());
        }
    }

    public final Animator l(SearchBar searchBar, View view, AppBarLayout appBarLayout) {
        return p(searchBar, view, appBarLayout).o(250L).e(new e(searchBar)).h();
    }

    public final Animator m(@Nullable View view) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(com.google.android.material.internal.r.f(view));
        TimeInterpolator timeInterpolator = vm.b.f94060a;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f31996h ? 250L : 0L);
        ofFloat.setStartDelay(this.f31996h ? 500L : 0L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.addUpdateListener(com.google.android.material.internal.r.f(view));
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(250L);
        ofFloat2.setStartDelay(750L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2);
        return animatorSet;
    }

    public final List<View> n(View view) {
        boolean s11 = m0.s(view);
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                View childAt = viewGroup.getChildAt(i11);
                if ((!s11 && (childAt instanceof ActionMenuView)) || (s11 && !(childAt instanceof ActionMenuView))) {
                    arrayList.add(childAt);
                }
            }
        }
        return arrayList;
    }

    public final Animator o(SearchBar searchBar, View view, @Nullable AppBarLayout appBarLayout) {
        return p(searchBar, view, appBarLayout).o(300L).e(new c(searchBar)).j();
    }

    public final com.google.android.material.internal.g p(SearchBar searchBar, View view, @Nullable AppBarLayout appBarLayout) {
        return new com.google.android.material.internal.g(searchBar, view).m(q(searchBar, view)).n(appBarLayout != null ? appBarLayout.getTop() : 0).c(n(view));
    }

    public final ValueAnimator.AnimatorUpdateListener q(SearchBar searchBar, final View view) {
        final vn.k m11 = vn.k.m(view.getContext());
        m11.l0(searchBar.getCornerSize());
        m11.o0(ViewCompat.getElevation(searchBar));
        return new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.h
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                j.c(vn.k.this, view, valueAnimator);
            }
        };
    }

    public final List<View> r(SearchBar searchBar) {
        List<View> k11 = m0.k(searchBar);
        if (searchBar.getCenterView() != null) {
            k11.remove(searchBar.getCenterView());
        }
        return k11;
    }

    public final Animator s(SearchBar searchBar) {
        List<View> r11 = r(searchBar);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(com.google.android.material.internal.r.e(r11));
        ofFloat.setDuration(100L);
        ofFloat.setInterpolator(vm.b.f94060a);
        return ofFloat;
    }

    public final Animator t(SearchBar searchBar, final View view) {
        List<View> r11 = r(searchBar);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.addUpdateListener(com.google.android.material.internal.r.e(r11));
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setAlpha(0.0f);
            }
        });
        ofFloat.setDuration(75L);
        ofFloat.setInterpolator(vm.b.f94060a);
        return ofFloat;
    }

    public final Animator u(@Nullable View view) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(com.google.android.material.internal.r.f(view));
        ofFloat.setInterpolator(vm.b.f94060a);
        ofFloat.setDuration(250L);
        return ofFloat;
    }

    public final Animator v(TextView textView, @Nullable View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(250L);
        animatorSet.play(w(textView));
        if (view != null) {
            animatorSet.play(u(view));
        }
        return animatorSet;
    }

    public final Animator w(TextView textView) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(com.google.android.material.internal.r.f(textView));
        ofFloat.setInterpolator(vm.b.f94060a);
        ofFloat.setDuration(250L);
        return ofFloat;
    }

    public boolean x() {
        return this.f31995g;
    }

    public boolean y() {
        return this.f31994f;
    }

    public boolean z() {
        return this.f31996h;
    }
}
