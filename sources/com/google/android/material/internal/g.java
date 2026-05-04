package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final View f31579a;

    /* renamed from: b, reason: collision with root package name */
    public final View f31580b;

    /* renamed from: c, reason: collision with root package name */
    public final List<AnimatorListenerAdapter> f31581c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final List<View> f31582d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public ValueAnimator.AnimatorUpdateListener f31583e;

    /* renamed from: f, reason: collision with root package name */
    public long f31584f;

    /* renamed from: g, reason: collision with root package name */
    public int f31585g;

    /* renamed from: h, reason: collision with root package name */
    public int f31586h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.f31580b.setVisibility(0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            g.this.f31580b.setVisibility(8);
        }
    }

    public g(@NonNull View view, @NonNull View view2) {
        this.f31579a = view;
        this.f31580b = view2;
    }

    @NonNull
    @uo.a
    public g c(@NonNull Collection<View> collection) {
        this.f31582d.addAll(collection);
        return this;
    }

    @NonNull
    @uo.a
    public g d(@NonNull View... viewArr) {
        Collections.addAll(this.f31582d, viewArr);
        return this;
    }

    @NonNull
    @uo.a
    public g e(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        this.f31581c.add(animatorListenerAdapter);
        return this;
    }

    public final void f(Animator animator, List<AnimatorListenerAdapter> list) {
        Iterator<AnimatorListenerAdapter> it = list.iterator();
        while (it.hasNext()) {
            animator.addListener(it.next());
        }
    }

    public final AnimatorSet g(boolean z11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(k(z11), l(z11), i(z11));
        return animatorSet;
    }

    @NonNull
    public Animator h() {
        AnimatorSet g11 = g(false);
        g11.addListener(new b());
        f(g11, this.f31581c);
        return g11;
    }

    public final Animator i(boolean z11) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat((this.f31580b.getLeft() - this.f31579a.getLeft()) + (this.f31579a.getRight() - this.f31580b.getRight()), 0.0f);
        ofFloat.addUpdateListener(r.m(this.f31582d));
        ofFloat.setDuration(this.f31584f);
        ofFloat.setInterpolator(w.a(z11, vm.b.f94061b));
        return ofFloat;
    }

    @NonNull
    public Animator j() {
        AnimatorSet g11 = g(true);
        g11.addListener(new a());
        f(g11, this.f31581c);
        return g11;
    }

    public final Animator k(boolean z11) {
        Rect e11 = m0.e(this.f31579a, this.f31585g);
        Rect e12 = m0.e(this.f31580b, this.f31586h);
        final Rect rect = new Rect(e11);
        ValueAnimator ofObject = ValueAnimator.ofObject(new v(rect), e11, e12);
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.internal.f
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                m0.z(g.this.f31580b, rect);
            }
        });
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f31583e;
        if (animatorUpdateListener != null) {
            ofObject.addUpdateListener(animatorUpdateListener);
        }
        ofObject.setDuration(this.f31584f);
        ofObject.setInterpolator(w.a(z11, vm.b.f94061b));
        return ofObject;
    }

    public final Animator l(boolean z11) {
        List<View> k11 = m0.k(this.f31580b);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(r.e(k11));
        ofFloat.setDuration(this.f31584f);
        ofFloat.setInterpolator(w.a(z11, vm.b.f94060a));
        return ofFloat;
    }

    @NonNull
    @uo.a
    public g m(@Nullable ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f31583e = animatorUpdateListener;
        return this;
    }

    @NonNull
    @uo.a
    public g n(int i11) {
        this.f31585g = i11;
        return this;
    }

    @NonNull
    @uo.a
    public g o(long j11) {
        this.f31584f = j11;
        return this;
    }

    @NonNull
    @uo.a
    public g p(int i11) {
        this.f31586h = i11;
        return this;
    }
}
