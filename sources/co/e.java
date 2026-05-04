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
public final class e implements x {

    /* renamed from: b, reason: collision with root package name */
    public static final float f9378b = 0.35f;

    /* renamed from: a, reason: collision with root package name */
    public float f9379a = 0.35f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f9380a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f9381b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f9382c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f9383d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f9384e;

        public a(View view, float f11, float f12, float f13, float f14) {
            this.f9380a = view;
            this.f9381b = f11;
            this.f9382c = f12;
            this.f9383d = f13;
            this.f9384e = f14;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f9380a.setAlpha(w.m(this.f9381b, this.f9382c, this.f9383d, this.f9384e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f9385a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f9386b;

        public b(View view, float f11) {
            this.f9385a = view;
            this.f9386b = f11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f9385a.setAlpha(this.f9386b);
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
        return c(view, alpha, 0.0f, 0.0f, this.f9379a, alpha);
    }

    @Override // co.x
    @Nullable
    public Animator b(@NonNull ViewGroup viewGroup, @NonNull View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, 0.0f, alpha, this.f9379a, 1.0f, alpha);
    }

    public float d() {
        return this.f9379a;
    }

    public void e(@FloatRange(from = 0.0d, to = 1.0d) float f11) {
        this.f9379a = f11;
    }
}
