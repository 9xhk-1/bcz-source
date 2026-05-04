package pn;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import androidx.activity.BackEventCompat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.android.material.R;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.m0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class h extends pn.a<View> {

    /* renamed from: q, reason: collision with root package name */
    public static final float f80989q = 0.9f;

    /* renamed from: k, reason: collision with root package name */
    public final float f80990k;

    /* renamed from: l, reason: collision with root package name */
    public final float f80991l;

    /* renamed from: m, reason: collision with root package name */
    public float f80992m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public Rect f80993n;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    public Rect f80994o;

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    public Integer f80995p;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f80996a;

        public a(View view) {
            this.f80996a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            View view = this.f80996a;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public h(@NonNull View view) {
        super(view);
        Resources resources = view.getResources();
        this.f80990k = resources.getDimension(R.dimen.m3_back_progress_main_container_min_edge_gap);
        this.f80991l = resources.getDimension(R.dimen.m3_back_progress_main_container_max_translation_y);
    }

    public void g(@Nullable View view) {
        if (super.b() == null) {
            return;
        }
        AnimatorSet i11 = i(view);
        V v11 = this.f80973b;
        if (v11 instanceof ClippableRoundedCornerLayout) {
            i11.playTogether(h((ClippableRoundedCornerLayout) v11));
        }
        i11.setDuration(this.f80976e);
        i11.start();
        q();
    }

    @NonNull
    public final ValueAnimator h(final ClippableRoundedCornerLayout clippableRoundedCornerLayout) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(clippableRoundedCornerLayout.getCornerRadius(), k());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pn.g
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ClippableRoundedCornerLayout.this.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return ofFloat;
    }

    @NonNull
    public final AnimatorSet i(@Nullable View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f80973b, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f80973b, (Property<V, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.f80973b, (Property<V, Float>) View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.f80973b, (Property<V, Float>) View.TRANSLATION_Y, 0.0f));
        animatorSet.addListener(new a(view));
        return animatorSet;
    }

    public void j(long j11, @Nullable View view) {
        AnimatorSet i11 = i(view);
        i11.setDuration(j11);
        i11.start();
        q();
    }

    public int k() {
        if (this.f80995p == null) {
            this.f80995p = Integer.valueOf(p() ? n() : 0);
        }
        return this.f80995p.intValue();
    }

    @Nullable
    public Rect l() {
        return this.f80994o;
    }

    @Nullable
    public Rect m() {
        return this.f80993n;
    }

    public final int n() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = this.f80973b.getRootWindowInsets()) == null) {
            return 0;
        }
        return Math.max(Math.max(o(rootWindowInsets, 0), o(rootWindowInsets, 1)), Math.max(o(rootWindowInsets, 3), o(rootWindowInsets, 2)));
    }

    @RequiresApi(31)
    public final int o(WindowInsets windowInsets, int i11) {
        RoundedCorner roundedCorner;
        int radius;
        roundedCorner = windowInsets.getRoundedCorner(i11);
        if (roundedCorner == null) {
            return 0;
        }
        radius = roundedCorner.getRadius();
        return radius;
    }

    public final boolean p() {
        int[] iArr = new int[2];
        this.f80973b.getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    public final void q() {
        this.f80992m = 0.0f;
        this.f80993n = null;
        this.f80994o = null;
    }

    @VisibleForTesting
    public void r(float f11, @Nullable View view) {
        this.f80993n = m0.d(this.f80973b);
        if (view != null) {
            this.f80994o = m0.c(this.f80973b, view);
        }
        this.f80992m = f11;
    }

    public void s(@NonNull BackEventCompat backEventCompat, @Nullable View view) {
        super.d(backEventCompat);
        r(backEventCompat.getTouchY(), view);
    }

    @VisibleForTesting
    public void t(float f11, boolean z11, float f12, float f13) {
        float a11 = a(f11);
        float width = this.f80973b.getWidth();
        float height = this.f80973b.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float a12 = vm.b.a(1.0f, 0.9f, a11);
        float a13 = vm.b.a(0.0f, Math.max(0.0f, ((width - (0.9f * width)) / 2.0f) - this.f80990k), a11) * (z11 ? 1 : -1);
        float min = Math.min(Math.max(0.0f, ((height - (a12 * height)) / 2.0f) - this.f80990k), this.f80991l);
        float f14 = f12 - this.f80992m;
        float a14 = vm.b.a(0.0f, min, Math.abs(f14) / height) * Math.signum(f14);
        this.f80973b.setScaleX(a12);
        this.f80973b.setScaleY(a12);
        this.f80973b.setTranslationX(a13);
        this.f80973b.setTranslationY(a14);
        V v11 = this.f80973b;
        if (v11 instanceof ClippableRoundedCornerLayout) {
            ((ClippableRoundedCornerLayout) v11).e(vm.b.a(k(), f13, a11));
        }
    }

    public void u(@NonNull BackEventCompat backEventCompat, @Nullable View view, float f11) {
        if (super.e(backEventCompat) == null) {
            return;
        }
        if (view != null && view.getVisibility() != 4) {
            view.setVisibility(4);
        }
        t(backEventCompat.getProgress(), backEventCompat.getSwipeEdge() == 0, backEventCompat.getTouchY(), f11);
    }
}
