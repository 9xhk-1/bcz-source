package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import androidx.annotation.NonNull;
import com.google.android.material.circularreveal.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.google.android.material.circularreveal.a$a, reason: collision with other inner class name */
    public class C0370a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f31052a;

        public C0370a(c cVar) {
            this.f31052a = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f31052a.a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f31052a.d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static Animator a(@NonNull c cVar, float f11, float f12, float f13) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(cVar, (Property<c, V>) c.C0372c.f31070a, (TypeEvaluator) c.b.f31068b, (Object[]) new c.e[]{new c.e(f11, f12, f13)});
        c.e revealInfo = cVar.getRevealInfo();
        if (revealInfo == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) cVar, (int) f11, (int) f12, revealInfo.f31075c, f13);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofObject, createCircularReveal);
        return animatorSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static Animator b(c cVar, float f11, float f12, float f13, float f14) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(cVar, (Property<c, V>) c.C0372c.f31070a, (TypeEvaluator) c.b.f31068b, (Object[]) new c.e[]{new c.e(f11, f12, f13), new c.e(f11, f12, f14)});
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) cVar, (int) f11, (int) f12, f13, f14);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofObject, createCircularReveal);
        return animatorSet;
    }

    @NonNull
    public static Animator.AnimatorListener c(@NonNull c cVar) {
        return new C0370a(cVar);
    }
}
