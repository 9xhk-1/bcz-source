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
public final class d implements w {

    /* renamed from: a, reason: collision with root package name */
    public float f7009a = 1.0f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f7010a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f7011b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f7012c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f7013d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f7014e;

        public a(View view, float f11, float f12, float f13, float f14) {
            this.f7010a = view;
            this.f7011b = f11;
            this.f7012c = f12;
            this.f7013d = f13;
            this.f7014e = f14;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f7010a.setAlpha(v.m(this.f7011b, this.f7012c, this.f7013d, this.f7014e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f7015a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f7016b;

        public b(View view, float f11) {
            this.f7015a = view;
            this.f7016b = f11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f7015a.setAlpha(this.f7016b);
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
        return c(view, alpha, 0.0f, 0.0f, 1.0f, alpha);
    }

    @Override // bo.w
    @Nullable
    public Animator b(@NonNull ViewGroup viewGroup, @NonNull View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, 0.0f, alpha, 0.0f, this.f7009a, alpha);
    }

    public float d() {
        return this.f7009a;
    }

    public void e(float f11) {
        this.f7009a = f11;
    }
}
