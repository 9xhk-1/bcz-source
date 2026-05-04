package pn;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.BackEventCompat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.material.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class f extends pn.a<View> {

    /* renamed from: k, reason: collision with root package name */
    public final float f80985k;

    /* renamed from: l, reason: collision with root package name */
    public final float f80986l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.f80973b.setTranslationY(0.0f);
            f.this.k(0.0f);
        }
    }

    public f(@NonNull View view) {
        super(view);
        Resources resources = view.getResources();
        this.f80985k = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.f80986l = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public void f() {
        if (super.b() == null) {
            return;
        }
        Animator g11 = g();
        g11.setDuration(this.f80976e);
        g11.start();
    }

    public final Animator g() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f80973b, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f80973b, (Property<V, Float>) View.SCALE_Y, 1.0f));
        V v11 = this.f80973b;
        if (v11 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v11;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i11), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new FastOutSlowInInterpolator());
        return animatorSet;
    }

    public void h(@NonNull BackEventCompat backEventCompat, @Nullable Animator.AnimatorListener animatorListener) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f80973b, (Property<V, Float>) View.TRANSLATION_Y, this.f80973b.getHeight() * this.f80973b.getScaleY());
        ofFloat.setInterpolator(new FastOutSlowInInterpolator());
        ofFloat.setDuration(vm.b.c(this.f80974c, this.f80975d, backEventCompat.getProgress()));
        ofFloat.addListener(new a());
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        ofFloat.start();
    }

    public void i(@NonNull BackEventCompat backEventCompat, @Nullable Animator.AnimatorListener animatorListener) {
        Animator g11 = g();
        g11.setDuration(vm.b.c(this.f80974c, this.f80975d, backEventCompat.getProgress()));
        if (animatorListener != null) {
            g11.addListener(animatorListener);
        }
        g11.start();
    }

    public void j(@NonNull BackEventCompat backEventCompat) {
        super.d(backEventCompat);
    }

    @VisibleForTesting
    public void k(float f11) {
        float a11 = a(f11);
        float width = this.f80973b.getWidth();
        float height = this.f80973b.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f12 = this.f80985k / width;
        float f13 = this.f80986l / height;
        float a12 = 1.0f - vm.b.a(0.0f, f12, a11);
        float a13 = 1.0f - vm.b.a(0.0f, f13, a11);
        this.f80973b.setScaleX(a12);
        this.f80973b.setPivotY(height);
        this.f80973b.setScaleY(a13);
        V v11 = this.f80973b;
        if (v11 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v11;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                View childAt = viewGroup.getChildAt(i11);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(a13 != 0.0f ? a12 / a13 : 1.0f);
            }
        }
    }

    public void l(@NonNull BackEventCompat backEventCompat) {
        if (super.e(backEventCompat) == null) {
            return;
        }
        k(backEventCompat.getProgress());
    }
}
