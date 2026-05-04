package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class j implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public final View f31601a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public final View f31602b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f31603c = new float[2];

    public j(@Nullable View view, @Nullable View view2) {
        this.f31601a = view;
        this.f31602b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        k.a(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f31603c);
        View view = this.f31601a;
        if (view != null) {
            view.setAlpha(this.f31603c[0]);
        }
        View view2 = this.f31602b;
        if (view2 != null) {
            view2.setAlpha(this.f31603c[1]);
        }
    }
}
