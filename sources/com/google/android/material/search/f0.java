package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.search.SearchView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class f0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f31941a;

    public f0(g0 g0Var) {
        this.f31941a = g0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (!this.f31941a.f31958a.x()) {
            this.f31941a.f31958a.K();
        }
        this.f31941a.f31958a.setTransitionState(SearchView.TransitionState.SHOWN);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        SearchBar searchBar;
        this.f31941a.f31960c.setVisibility(0);
        searchBar = this.f31941a.f31972o;
        searchBar.J();
    }
}
