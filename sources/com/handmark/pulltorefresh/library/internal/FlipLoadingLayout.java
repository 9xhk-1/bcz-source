package com.handmark.pulltorefresh.library.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public class FlipLoadingLayout extends LoadingLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final int f35156p = 150;

    /* renamed from: n, reason: collision with root package name */
    public final Animation f35157n;

    /* renamed from: o, reason: collision with root package name */
    public final Animation f35158o;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35159a;

        static {
            int[] iArr = new int[PullToRefreshBase.Mode.values().length];
            f35159a = iArr;
            try {
                iArr[PullToRefreshBase.Mode.PULL_FROM_END.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35159a[PullToRefreshBase.Mode.PULL_FROM_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public FlipLoadingLayout(Context context, final PullToRefreshBase.Mode mode, final PullToRefreshBase.Orientation scrollDirection, TypedArray attrs) {
        super(context, mode, scrollDirection, attrs);
        float f11 = mode == PullToRefreshBase.Mode.PULL_FROM_START ? -180 : 180;
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, f11, 1, 0.5f, 1, 0.5f);
        this.f35157n = rotateAnimation;
        Interpolator interpolator = LoadingLayout.f35168m;
        rotateAnimation.setInterpolator(interpolator);
        rotateAnimation.setDuration(150L);
        rotateAnimation.setFillAfter(true);
        RotateAnimation rotateAnimation2 = new RotateAnimation(f11, 0.0f, 1, 0.5f, 1, 0.5f);
        this.f35158o = rotateAnimation2;
        rotateAnimation2.setInterpolator(interpolator);
        rotateAnimation2.setDuration(150L);
        rotateAnimation2.setFillAfter(true);
    }

    private float getDrawableRotationAngle() {
        int i11 = a.f35159a[this.f35175g.ordinal()];
        return i11 != 1 ? (i11 == 2 && this.f35176h == PullToRefreshBase.Orientation.HORIZONTAL) ? 270.0f : 0.0f : this.f35176h == PullToRefreshBase.Orientation.HORIZONTAL ? 90.0f : 180.0f;
    }

    @Override // com.handmark.pulltorefresh.library.internal.LoadingLayout
    public void b(Drawable imageDrawable) {
        if (imageDrawable != null) {
            int intrinsicHeight = imageDrawable.getIntrinsicHeight();
            int intrinsicWidth = imageDrawable.getIntrinsicWidth();
            ViewGroup.LayoutParams layoutParams = this.f35170b.getLayoutParams();
            int max = Math.max(intrinsicHeight, intrinsicWidth);
            layoutParams.height = max;
            layoutParams.width = max;
            this.f35170b.requestLayout();
            this.f35170b.setScaleType(ImageView.ScaleType.MATRIX);
            Matrix matrix = new Matrix();
            matrix.postTranslate((layoutParams.width - intrinsicWidth) / 2.0f, (layoutParams.height - intrinsicHeight) / 2.0f);
            matrix.postRotate(getDrawableRotationAngle(), layoutParams.width / 2.0f, layoutParams.height / 2.0f);
            this.f35170b.setImageMatrix(matrix);
        }
    }

    @Override // com.handmark.pulltorefresh.library.internal.LoadingLayout
    public void f() {
        if (this.f35157n == this.f35170b.getAnimation()) {
            this.f35170b.startAnimation(this.f35158o);
        }
    }

    @Override // com.handmark.pulltorefresh.library.internal.LoadingLayout
    public int getDefaultDrawableResId() {
        return R.drawable.default_ptr_flip;
    }

    @Override // com.handmark.pulltorefresh.library.internal.LoadingLayout
    public void h() {
        this.f35170b.clearAnimation();
        this.f35170b.setVisibility(4);
        this.f35171c.setVisibility(0);
    }

    @Override // com.handmark.pulltorefresh.library.internal.LoadingLayout
    public void j() {
        this.f35170b.startAnimation(this.f35157n);
    }

    @Override // com.handmark.pulltorefresh.library.internal.LoadingLayout
    public void l() {
        this.f35170b.clearAnimation();
        this.f35171c.setVisibility(8);
        this.f35170b.setVisibility(0);
    }

    @Override // com.handmark.pulltorefresh.library.internal.LoadingLayout
    public void d(float scaleOfLayout) {
    }
}
