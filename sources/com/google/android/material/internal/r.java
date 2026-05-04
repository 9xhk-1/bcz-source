package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Collection;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class r implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final a f31623a;

    /* renamed from: b, reason: collision with root package name */
    public final View[] f31624b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void a(@NonNull ValueAnimator valueAnimator, @NonNull View view);
    }

    @SuppressLint({"LambdaLast"})
    public r(@NonNull a aVar, @NonNull View... viewArr) {
        this.f31623a = aVar;
        this.f31624b = viewArr;
    }

    @NonNull
    public static r e(@NonNull Collection<View> collection) {
        return new r(new q(), collection);
    }

    @NonNull
    public static r f(@NonNull View... viewArr) {
        return new r(new q(), viewArr);
    }

    @NonNull
    public static r g(@NonNull Collection<View> collection) {
        return new r(new o(), collection);
    }

    @NonNull
    public static r h(@NonNull View... viewArr) {
        return new r(new o(), viewArr);
    }

    public static void i(@NonNull ValueAnimator valueAnimator, @NonNull View view) {
        view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static void j(@NonNull ValueAnimator valueAnimator, @NonNull View view) {
        Float f11 = (Float) valueAnimator.getAnimatedValue();
        view.setScaleX(f11.floatValue());
        view.setScaleY(f11.floatValue());
    }

    public static void k(@NonNull ValueAnimator valueAnimator, @NonNull View view) {
        view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static void l(@NonNull ValueAnimator valueAnimator, @NonNull View view) {
        view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @NonNull
    public static r m(@NonNull Collection<View> collection) {
        return new r(new n(), collection);
    }

    @NonNull
    public static r n(@NonNull View... viewArr) {
        return new r(new n(), viewArr);
    }

    @NonNull
    public static r o(@NonNull Collection<View> collection) {
        return new r(new p(), collection);
    }

    @NonNull
    public static r p(@NonNull View... viewArr) {
        return new r(new p(), viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        for (View view : this.f31624b) {
            this.f31623a.a(valueAnimator, view);
        }
    }

    @SuppressLint({"LambdaLast"})
    public r(@NonNull a aVar, @NonNull Collection<View> collection) {
        this.f31623a = aVar;
        this.f31624b = (View[]) collection.toArray(new View[0]);
    }
}
