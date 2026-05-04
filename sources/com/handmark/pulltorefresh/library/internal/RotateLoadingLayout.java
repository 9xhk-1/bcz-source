package com.handmark.pulltorefresh.library.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class RotateLoadingLayout extends LoadingLayout {

    /* renamed from: s, reason: collision with root package name */
    public static final int f35182s = 1200;

    /* renamed from: n, reason: collision with root package name */
    public final Animation f35183n;

    /* renamed from: o, reason: collision with root package name */
    public final Matrix f35184o;

    /* renamed from: p, reason: collision with root package name */
    public float f35185p;

    /* renamed from: q, reason: collision with root package name */
    public float f35186q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f35187r;

    public RotateLoadingLayout(Context context, PullToRefreshBase.Mode mode, PullToRefreshBase.Orientation scrollDirection, TypedArray attrs) {
        super(context, mode, scrollDirection, attrs);
        this.f35187r = attrs.getBoolean(R.styleable.PullToRefresh_ptrRotateDrawableWhilePulling, true);
        this.f35170b.setScaleType(ImageView.ScaleType.MATRIX);
        Matrix matrix = new Matrix();
        this.f35184o = matrix;
        this.f35170b.setImageMatrix(matrix);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 720.0f, 1, 0.5f, 1, 0.5f);
        this.f35183n = rotateAnimation;
        rotateAnimation.setInterpolator(LoadingLayout.f35168m);
        rotateAnimation.setDuration(1200L);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setRepeatMode(1);
    }

    @Override // com.handmark.pulltorefresh.library.internal.LoadingLayout
    public void b(Drawable imageDrawable) {
        if (imageDrawable != null) {
            this.f35185p = Math.round(imageDrawable.getIntrinsicWidth() / 2.0f);
            this.f35186q = Math.round(imageDrawable.getIntrinsicHeight() / 2.0f);
        }
    }

    @Override // com.handmark.pulltorefresh.library.internal.LoadingLayout
    public void d(float scaleOfLayout) {
        this.f35184o.setRotate(this.f35187r ? scaleOfLayout * 90.0f : Math.max(0.0f, Math.min(180.0f, (scaleOfLayout * 360.0f) - 180.0f)), this.f35185p, this.f35186q);
        this.f35170b.setImageMatrix(this.f35184o);
    }

    @Override // com.handmark.pulltorefresh.library.internal.LoadingLayout
    public int getDefaultDrawableResId() {
        return R.drawable.default_ptr_rotate;
    }

    @Override // com.handmark.pulltorefresh.library.internal.LoadingLayout
    public void h() {
        this.f35170b.startAnimation(this.f35183n);
    }

    @Override // com.handmark.pulltorefresh.library.internal.LoadingLayout
    public void l() {
        this.f35170b.clearAnimation();
        n();
    }

    public final void n() {
        Matrix matrix = this.f35184o;
        if (matrix != null) {
            matrix.reset();
            this.f35170b.setImageMatrix(this.f35184o);
        }
    }

    @Override // com.handmark.pulltorefresh.library.internal.LoadingLayout
    public void f() {
    }

    @Override // com.handmark.pulltorefresh.library.internal.LoadingLayout
    public void j() {
    }
}
