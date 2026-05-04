package com.handmark.pulltorefresh.library.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public class IndicatorLayout extends FrameLayout implements Animation.AnimationListener {

    /* renamed from: f, reason: collision with root package name */
    public static final int f35160f = 150;

    /* renamed from: a, reason: collision with root package name */
    public Animation f35161a;

    /* renamed from: b, reason: collision with root package name */
    public Animation f35162b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView f35163c;

    /* renamed from: d, reason: collision with root package name */
    public final Animation f35164d;

    /* renamed from: e, reason: collision with root package name */
    public final Animation f35165e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35166a;

        static {
            int[] iArr = new int[PullToRefreshBase.Mode.values().length];
            f35166a = iArr;
            try {
                iArr[PullToRefreshBase.Mode.PULL_FROM_END.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35166a[PullToRefreshBase.Mode.PULL_FROM_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public IndicatorLayout(Context context, PullToRefreshBase.Mode mode) {
        super(context);
        int i11;
        int i12;
        this.f35163c = new ImageView(context);
        this.f35163c.setImageDrawable(getResources().getDrawable(R.drawable.indicator_arrow));
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.indicator_internal_padding);
        this.f35163c.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        addView(this.f35163c);
        if (a.f35166a[mode.ordinal()] != 1) {
            i11 = R.anim.slide_in_from_top;
            i12 = R.anim.slide_out_to_top;
            setBackgroundResource(R.drawable.indicator_bg_top);
        } else {
            i11 = R.anim.slide_in_from_bottom;
            int i13 = R.anim.slide_out_to_bottom;
            setBackgroundResource(R.drawable.indicator_bg_bottom);
            this.f35163c.setScaleType(ImageView.ScaleType.MATRIX);
            Matrix matrix = new Matrix();
            matrix.setRotate(180.0f, r0.getIntrinsicWidth() / 2.0f, r0.getIntrinsicHeight() / 2.0f);
            this.f35163c.setImageMatrix(matrix);
            i12 = i13;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(context, i11);
        this.f35161a = loadAnimation;
        loadAnimation.setAnimationListener(this);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i12);
        this.f35162b = loadAnimation2;
        loadAnimation2.setAnimationListener(this);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
        this.f35164d = rotateAnimation;
        rotateAnimation.setInterpolator(linearInterpolator);
        rotateAnimation.setDuration(150L);
        rotateAnimation.setFillAfter(true);
        RotateAnimation rotateAnimation2 = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        this.f35165e = rotateAnimation2;
        rotateAnimation2.setInterpolator(linearInterpolator);
        rotateAnimation2.setDuration(150L);
        rotateAnimation2.setFillAfter(true);
    }

    public void a() {
        startAnimation(this.f35162b);
    }

    public final boolean b() {
        Animation animation = getAnimation();
        return animation != null ? this.f35161a == animation : getVisibility() == 0;
    }

    public void c() {
        this.f35163c.startAnimation(this.f35165e);
    }

    public void d() {
        this.f35163c.startAnimation(this.f35164d);
    }

    public void e() {
        this.f35163c.clearAnimation();
        startAnimation(this.f35161a);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        if (animation == this.f35162b) {
            this.f35163c.clearAnimation();
            setVisibility(8);
        } else if (animation == this.f35161a) {
            setVisibility(0);
        }
        clearAnimation();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        setVisibility(0);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }
}
