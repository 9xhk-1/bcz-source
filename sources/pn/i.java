package pn;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.BackEventCompat;
import androidx.annotation.GravityInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.material.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class i extends pn.a<View> {

    /* renamed from: k, reason: collision with root package name */
    public final float f80998k;

    /* renamed from: l, reason: collision with root package name */
    public final float f80999l;

    /* renamed from: m, reason: collision with root package name */
    public final float f81000m;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f81001a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f81002b;

        public a(boolean z11, int i11) {
            this.f81001a = z11;
            this.f81002b = i11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            i.this.f80973b.setTranslationX(0.0f);
            i.this.k(0.0f, this.f81001a, this.f81002b);
        }
    }

    public i(@NonNull View view) {
        super(view);
        Resources resources = view.getResources();
        this.f80998k = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.f80999l = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.f81000m = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    public void f() {
        if (super.b() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f80973b, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f80973b, (Property<V, Float>) View.SCALE_Y, 1.0f));
        V v11 = this.f80973b;
        if (v11 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v11;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i11), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.f80976e);
        animatorSet.start();
    }

    public final boolean g(@GravityInt int i11, @GravityInt int i12) {
        return (GravityCompat.getAbsoluteGravity(i11, ViewCompat.getLayoutDirection(this.f80973b)) & i12) == i12;
    }

    public void h(@NonNull BackEventCompat backEventCompat, @GravityInt int i11, @Nullable Animator.AnimatorListener animatorListener, @Nullable ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        boolean z11 = backEventCompat.getSwipeEdge() == 0;
        boolean g11 = g(i11, 3);
        float width = (this.f80973b.getWidth() * this.f80973b.getScaleX()) + i(g11);
        V v11 = this.f80973b;
        Property property = View.TRANSLATION_X;
        if (g11) {
            width = -width;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(v11, (Property<V, Float>) property, width);
        if (animatorUpdateListener != null) {
            ofFloat.addUpdateListener(animatorUpdateListener);
        }
        ofFloat.setInterpolator(new FastOutSlowInInterpolator());
        ofFloat.setDuration(vm.b.c(this.f80974c, this.f80975d, backEventCompat.getProgress()));
        ofFloat.addListener(new a(z11, i11));
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        ofFloat.start();
    }

    public final int i(boolean z11) {
        ViewGroup.LayoutParams layoutParams = this.f80973b.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return z11 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
    }

    public void j(@NonNull BackEventCompat backEventCompat) {
        super.d(backEventCompat);
    }

    @VisibleForTesting
    public void k(float f11, boolean z11, @GravityInt int i11) {
        float a11 = a(f11);
        boolean g11 = g(i11, 3);
        boolean z12 = z11 == g11;
        int width = this.f80973b.getWidth();
        int height = this.f80973b.getHeight();
        float f12 = width;
        if (f12 > 0.0f) {
            float f13 = height;
            if (f13 <= 0.0f) {
                return;
            }
            float f14 = this.f80998k / f12;
            float f15 = this.f80999l / f12;
            float f16 = this.f81000m / f13;
            V v11 = this.f80973b;
            if (g11) {
                f12 = 0.0f;
            }
            v11.setPivotX(f12);
            if (!z12) {
                f15 = -f14;
            }
            float a12 = vm.b.a(0.0f, f15, a11);
            float f17 = a12 + 1.0f;
            this.f80973b.setScaleX(f17);
            float a13 = 1.0f - vm.b.a(0.0f, f16, a11);
            this.f80973b.setScaleY(a13);
            V v12 = this.f80973b;
            if (v12 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v12;
                for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                    View childAt = viewGroup.getChildAt(i12);
                    childAt.setPivotX(g11 ? (width - childAt.getRight()) + childAt.getWidth() : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f18 = z12 ? 1.0f - a12 : 1.0f;
                    float f19 = a13 != 0.0f ? (f17 / a13) * f18 : 1.0f;
                    childAt.setScaleX(f18);
                    childAt.setScaleY(f19);
                }
            }
        }
    }

    public void l(@NonNull BackEventCompat backEventCompat, @GravityInt int i11) {
        if (super.e(backEventCompat) == null) {
            return;
        }
        k(backEventCompat.getProgress(), backEventCompat.getSwipeEdge() == 0, i11);
    }
}
