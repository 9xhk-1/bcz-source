package co;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(21)
/* loaded from: classes7.dex */
public final class d implements x {

    /* renamed from: a, reason: collision with root package name */
    public float f9370a = 1.0f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f9371a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f9372b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f9373c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f9374d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f9375e;

        public a(View view, float f11, float f12, float f13, float f14) {
            this.f9371a = view;
            this.f9372b = f11;
            this.f9373c = f12;
            this.f9374d = f13;
            this.f9375e = f14;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f9371a.setAlpha(w.m(this.f9372b, this.f9373c, this.f9374d, this.f9375e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f9376a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f9377b;

        public b(View view, float f11) {
            this.f9376a = view;
            this.f9377b = f11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f9376a.setAlpha(this.f9377b);
        }
    }

    public static Animator c(View view, float f11, float f12, @FloatRange(from = 0.0d, to = 1.0d) float f13, @FloatRange(from = 0.0d, to = 1.0d) float f14, float f15) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(view, f11, f12, f13, f14));
        ofFloat.addListener(new b(view, f15));
        return ofFloat;
    }

    @Override // co.x
    @Nullable
    public Animator a(@NonNull ViewGroup viewGroup, @NonNull View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, alpha, 0.0f, 0.0f, 1.0f, alpha);
    }

    @Override // co.x
    @Nullable
    public Animator b(@NonNull ViewGroup viewGroup, @NonNull View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, 0.0f, alpha, 0.0f, this.f9370a, alpha);
    }

    public float d() {
        return this.f9370a;
    }

    public void e(float f11) {
        this.f9370a = f11;
    }
}
