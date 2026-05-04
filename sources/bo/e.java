package bo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class e implements w {

    /* renamed from: b, reason: collision with root package name */
    public static final float f7017b = 0.35f;

    /* renamed from: a, reason: collision with root package name */
    public float f7018a = 0.35f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f7019a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f7020b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f7021c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f7022d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f7023e;

        public a(View view, float f11, float f12, float f13, float f14) {
            this.f7019a = view;
            this.f7020b = f11;
            this.f7021c = f12;
            this.f7022d = f13;
            this.f7023e = f14;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f7019a.setAlpha(v.m(this.f7020b, this.f7021c, this.f7022d, this.f7023e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f7024a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f7025b;

        public b(View view, float f11) {
            this.f7024a = view;
            this.f7025b = f11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f7024a.setAlpha(this.f7025b);
        }
    }

    public static Animator c(View view, float f11, float f12, @FloatRange(from = 0.0d, to = 1.0d) float f13, @FloatRange(from = 0.0d, to = 1.0d) float f14, float f15) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(view, f11, f12, f13, f14));
        ofFloat.addListener(new b(view, f15));
        return ofFloat;
    }

    @Override // bo.w
    @Nullable
    public Animator a(@NonNull ViewGroup viewGroup, @NonNull View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, alpha, 0.0f, 0.0f, this.f7018a, alpha);
    }

    @Override // bo.w
    @Nullable
    public Animator b(@NonNull ViewGroup viewGroup, @NonNull View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, 0.0f, alpha, this.f7018a, 1.0f, alpha);
    }

    public float d() {
        return this.f7018a;
    }

    public void e(@FloatRange(from = 0.0d, to = 1.0d) float f11) {
        this.f7018a = f11;
    }
}
