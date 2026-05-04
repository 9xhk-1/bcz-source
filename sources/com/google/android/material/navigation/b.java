package com.google.android.material.navigation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;
import androidx.drawerlayout.widget.DrawerLayout;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f31822a = -1728053248;

    /* renamed from: b, reason: collision with root package name */
    public static final int f31823b = Color.alpha(-1728053248);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DrawerLayout f31824a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f31825b;

        public a(DrawerLayout drawerLayout, View view) {
            this.f31824a = drawerLayout;
            this.f31825b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f31824a.closeDrawer(this.f31825b, false);
            this.f31824a.setScrimColor(-1728053248);
        }
    }

    @NonNull
    public static Animator.AnimatorListener b(@NonNull DrawerLayout drawerLayout, @NonNull View view) {
        return new a(drawerLayout, view);
    }

    @NonNull
    public static ValueAnimator.AnimatorUpdateListener c(@NonNull final DrawerLayout drawerLayout) {
        return new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.navigation.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DrawerLayout.this.setScrimColor(ColorUtils.setAlphaComponent(-1728053248, vm.b.c(b.f31823b, 0, valueAnimator.getAnimatedFraction())));
            }
        };
    }
}
