package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.IdRes;
import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.d0;
import com.google.android.material.internal.m0;
import com.google.android.material.internal.n0;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    public static final int A = 0;
    public static final int B = 1;
    public static final int C = -2;
    public static final int D = -1;
    public static final int E = 0;
    public static final int F = 250;
    public static final int G = 180;
    public static final int I = 150;
    public static final int J = 75;
    public static final float M = 0.8f;
    public static final int O = 0;
    public static final int P = 1;

    /* renamed from: a, reason: collision with root package name */
    public final int f32133a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32134b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32135c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f32136d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f32137e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f32138f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ViewGroup f32139g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f32140h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final SnackbarBaseLayout f32141i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final xn.a f32142j;

    /* renamed from: k, reason: collision with root package name */
    public int f32143k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f32144l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public q f32145m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f32146n;

    /* renamed from: o, reason: collision with root package name */
    @RequiresApi(29)
    public final Runnable f32147o;

    /* renamed from: p, reason: collision with root package name */
    public int f32148p;

    /* renamed from: q, reason: collision with root package name */
    public int f32149q;

    /* renamed from: r, reason: collision with root package name */
    public int f32150r;

    /* renamed from: s, reason: collision with root package name */
    public int f32151s;

    /* renamed from: t, reason: collision with root package name */
    public int f32152t;

    /* renamed from: u, reason: collision with root package name */
    public int f32153u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f32154v;

    /* renamed from: w, reason: collision with root package name */
    public List<s<B>> f32155w;

    /* renamed from: x, reason: collision with root package name */
    public Behavior f32156x;

    /* renamed from: y, reason: collision with root package name */
    @Nullable
    public final AccessibilityManager f32157y;

    /* renamed from: z, reason: collision with root package name */
    @NonNull
    public a.b f32158z;
    public static final TimeInterpolator H = vm.b.f94061b;
    public static final TimeInterpolator K = vm.b.f94060a;
    public static final TimeInterpolator L = vm.b.f94063d;
    public static final boolean Q = false;
    public static final int[] R = {R.attr.snackbarStyle};
    public static final String S = BaseTransientBottomBar.class.getSimpleName();

    @NonNull
    public static final Handler N = new Handler(Looper.getMainLooper(), new h());

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: u, reason: collision with root package name */
        @NonNull
        public final t f32159u = new t(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean i(View view) {
            return this.f32159u.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            this.f32159u.b(coordinatorLayout, view, motionEvent);
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }

        public final void x(@NonNull BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f32159u.c(baseTransientBottomBar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class SnackbarBaseLayout extends FrameLayout {

        /* renamed from: l, reason: collision with root package name */
        public static final View.OnTouchListener f32160l = new a();

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        public BaseTransientBottomBar<?> f32161a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        public vn.p f32162b;

        /* renamed from: c, reason: collision with root package name */
        public int f32163c;

        /* renamed from: d, reason: collision with root package name */
        public final float f32164d;

        /* renamed from: e, reason: collision with root package name */
        public final float f32165e;

        /* renamed from: f, reason: collision with root package name */
        public final int f32166f;

        /* renamed from: g, reason: collision with root package name */
        public final int f32167g;

        /* renamed from: h, reason: collision with root package name */
        public ColorStateList f32168h;

        /* renamed from: i, reason: collision with root package name */
        public PorterDuff.Mode f32169i;

        /* renamed from: j, reason: collision with root package name */
        @Nullable
        public Rect f32170j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f32171k;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public SnackbarBaseLayout(@NonNull Context context) {
            this(context, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f32161a = baseTransientBottomBar;
        }

        public void c(ViewGroup viewGroup) {
            this.f32171k = true;
            viewGroup.addView(this);
            this.f32171k = false;
        }

        @NonNull
        public final Drawable d() {
            int v11 = en.u.v(this, R.attr.colorSurface, R.attr.colorOnSurface, getBackgroundOverlayColorAlpha());
            vn.p pVar = this.f32162b;
            Drawable z11 = pVar != null ? BaseTransientBottomBar.z(v11, pVar) : BaseTransientBottomBar.y(v11, getResources());
            if (this.f32168h == null) {
                return DrawableCompat.wrap(z11);
            }
            Drawable wrap = DrawableCompat.wrap(z11);
            DrawableCompat.setTintList(wrap, this.f32168h);
            return wrap;
        }

        public final void e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f32170j = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        public float getActionTextColorAlpha() {
            return this.f32165e;
        }

        public int getAnimationMode() {
            return this.f32163c;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f32164d;
        }

        public int getMaxInlineActionWidth() {
            return this.f32167g;
        }

        public int getMaxWidth() {
            return this.f32166f;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f32161a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.V();
            }
            ViewCompat.requestApplyInsets(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f32161a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.W();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
            super.onLayout(z11, i11, i12, i13, i14);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f32161a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.X();
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i11, int i12) {
            super.onMeasure(i11, i12);
            if (this.f32166f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i13 = this.f32166f;
                if (measuredWidth > i13) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), i12);
                }
            }
        }

        public void setAnimationMode(int i11) {
            this.f32163c = i11;
        }

        @Override // android.view.View
        public void setBackground(@Nullable Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(@Nullable Drawable drawable) {
            if (drawable != null && this.f32168h != null) {
                drawable = DrawableCompat.wrap(drawable.mutate());
                DrawableCompat.setTintList(drawable, this.f32168h);
                DrawableCompat.setTintMode(drawable, this.f32169i);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
            this.f32168h = colorStateList;
            if (getBackground() != null) {
                Drawable wrap = DrawableCompat.wrap(getBackground().mutate());
                DrawableCompat.setTintList(wrap, colorStateList);
                DrawableCompat.setTintMode(wrap, this.f32169i);
                if (wrap != getBackground()) {
                    super.setBackgroundDrawable(wrap);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
            this.f32169i = mode;
            if (getBackground() != null) {
                Drawable wrap = DrawableCompat.wrap(getBackground().mutate());
                DrawableCompat.setTintMode(wrap, mode);
                if (wrap != getBackground()) {
                    super.setBackgroundDrawable(wrap);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f32171k || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            e((ViewGroup.MarginLayoutParams) layoutParams);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f32161a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.t0();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f32160l);
            super.setOnClickListener(onClickListener);
        }

        public SnackbarBaseLayout(@NonNull Context context, AttributeSet attributeSet) {
            super(zn.a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R.styleable.SnackbarLayout);
            if (obtainStyledAttributes.hasValue(R.styleable.SnackbarLayout_elevation)) {
                ViewCompat.setElevation(this, obtainStyledAttributes.getDimensionPixelSize(r2, 0));
            }
            this.f32163c = obtainStyledAttributes.getInt(R.styleable.SnackbarLayout_animationMode, 0);
            if (obtainStyledAttributes.hasValue(R.styleable.SnackbarLayout_shapeAppearance) || obtainStyledAttributes.hasValue(R.styleable.SnackbarLayout_shapeAppearanceOverlay)) {
                this.f32162b = vn.p.e(context2, attributeSet, 0, 0).m();
            }
            this.f32164d = obtainStyledAttributes.getFloat(R.styleable.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(sn.c.a(context2, obtainStyledAttributes, R.styleable.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(m0.t(obtainStyledAttributes.getInt(R.styleable.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.f32165e = obtainStyledAttributes.getFloat(R.styleable.SnackbarLayout_actionTextColorAlpha, 1.0f);
            this.f32166f = obtainStyledAttributes.getDimensionPixelSize(R.styleable.SnackbarLayout_android_maxWidth, -1);
            this.f32167g = obtainStyledAttributes.getDimensionPixelSize(R.styleable.SnackbarLayout_maxActionInlineWidth, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f32160l);
            setFocusable(true);
            if (getBackground() == null) {
                ViewCompat.setBackground(this, d());
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f32172a;

        public a(int i11) {
            this.f32172a = i11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.Y(this.f32172a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f32141i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f32141i.setScaleX(floatValue);
            BaseTransientBottomBar.this.f32141i.setScaleY(floatValue);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.Z();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f32142j.a(BaseTransientBottomBar.this.f32135c - BaseTransientBottomBar.this.f32133a, BaseTransientBottomBar.this.f32133a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public int f32177a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f32178b;

        public e(int i11) {
            this.f32178b = i11;
            this.f32177a = i11;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.Q) {
                ViewCompat.offsetTopAndBottom(BaseTransientBottomBar.this.f32141i, intValue - this.f32177a);
            } else {
                BaseTransientBottomBar.this.f32141i.setTranslationY(intValue);
            }
            this.f32177a = intValue;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f32180a;

        public f(int i11) {
            this.f32180a = i11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.Y(this.f32180a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f32142j.b(0, BaseTransientBottomBar.this.f32134b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public int f32182a = 0;

        public g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.Q) {
                ViewCompat.offsetTopAndBottom(BaseTransientBottomBar.this.f32141i, intValue - this.f32182a);
            } else {
                BaseTransientBottomBar.this.f32141i.setTranslationY(intValue);
            }
            this.f32182a = intValue;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            int i11 = message.what;
            if (i11 == 0) {
                ((BaseTransientBottomBar) message.obj).n0();
                return true;
            }
            if (i11 != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).P(message.arg1);
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f32141i == null || baseTransientBottomBar.f32140h == null) {
                return;
            }
            int height = (n0.b(BaseTransientBottomBar.this.f32140h).height() - BaseTransientBottomBar.this.N()) + ((int) BaseTransientBottomBar.this.f32141i.getTranslationY());
            if (height >= BaseTransientBottomBar.this.f32152t) {
                BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                baseTransientBottomBar2.f32153u = baseTransientBottomBar2.f32152t;
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f32141i.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.S, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
            baseTransientBottomBar3.f32153u = baseTransientBottomBar3.f32152t;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f32152t - height;
            BaseTransientBottomBar.this.f32141i.requestLayout();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class j implements OnApplyWindowInsetsListener {
        public j() {
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        @NonNull
        public WindowInsetsCompat onApplyWindowInsets(View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
            BaseTransientBottomBar.this.f32148p = windowInsetsCompat.getSystemWindowInsetBottom();
            BaseTransientBottomBar.this.f32149q = windowInsetsCompat.getSystemWindowInsetLeft();
            BaseTransientBottomBar.this.f32150r = windowInsetsCompat.getSystemWindowInsetRight();
            BaseTransientBottomBar.this.t0();
            return windowInsetsCompat;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class k extends AccessibilityDelegateCompat {
        public k() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.addAction(1048576);
            accessibilityNodeInfoCompat.setDismissable(true);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
            if (i11 != 1048576) {
                return super.performAccessibilityAction(view, i11, bundle);
            }
            BaseTransientBottomBar.this.A();
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class l implements a.b {
        public l() {
        }

        @Override // com.google.android.material.snackbar.a.b
        public void a(int i11) {
            Handler handler = BaseTransientBottomBar.N;
            handler.sendMessage(handler.obtainMessage(1, i11, 0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.a.b
        public void show() {
            Handler handler = BaseTransientBottomBar.N;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar.this.Y(3);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class n implements SwipeDismissBehavior.c {
        public n() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void a(int i11) {
            if (i11 == 0) {
                com.google.android.material.snackbar.a.c().l(BaseTransientBottomBar.this.f32158z);
            } else if (i11 == 1 || i11 == 2) {
                com.google.android.material.snackbar.a.c().k(BaseTransientBottomBar.this.f32158z);
            }
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void b(@NonNull View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.B(0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SnackbarBaseLayout snackbarBaseLayout = BaseTransientBottomBar.this.f32141i;
            if (snackbarBaseLayout == null) {
                return;
            }
            if (snackbarBaseLayout.getParent() != null) {
                BaseTransientBottomBar.this.f32141i.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.f32141i.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.p0();
            } else {
                BaseTransientBottomBar.this.r0();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class p extends AnimatorListenerAdapter {
        public p() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.Z();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class q implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        public final WeakReference<BaseTransientBottomBar> f32192a;

        /* renamed from: b, reason: collision with root package name */
        @NonNull
        public final WeakReference<View> f32193b;

        public q(@NonNull BaseTransientBottomBar baseTransientBottomBar, @NonNull View view) {
            this.f32192a = new WeakReference<>(baseTransientBottomBar);
            this.f32193b = new WeakReference<>(view);
        }

        public static q a(@NonNull BaseTransientBottomBar baseTransientBottomBar, @NonNull View view) {
            q qVar = new q(baseTransientBottomBar, view);
            if (ViewCompat.isAttachedToWindow(view)) {
                m0.b(view, qVar);
            }
            view.addOnAttachStateChangeListener(qVar);
            return qVar;
        }

        @Nullable
        public View b() {
            return this.f32193b.get();
        }

        public void c() {
            if (this.f32193b.get() != null) {
                this.f32193b.get().removeOnAttachStateChangeListener(this);
                m0.u(this.f32193b.get(), this);
            }
            this.f32193b.clear();
            this.f32192a.clear();
        }

        public final boolean d() {
            if (this.f32192a.get() != null) {
                return false;
            }
            c();
            return true;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (d() || !this.f32192a.get().f32146n) {
                return;
            }
            this.f32192a.get().a0();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (d()) {
                return;
            }
            m0.b(view, this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (d()) {
                return;
            }
            m0.u(view, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface r {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class t {

        /* renamed from: a, reason: collision with root package name */
        public a.b f32199a;

        public t(@NonNull SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.t(0.1f);
            swipeDismissBehavior.q(0.6f);
            swipeDismissBehavior.u(0);
        }

        public boolean a(View view) {
            return view instanceof SnackbarBaseLayout;
        }

        public void b(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.a.c().k(this.f32199a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.a.c().l(this.f32199a);
            }
        }

        public void c(@NonNull BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f32199a = baseTransientBottomBar.f32158z;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Deprecated
    public interface u extends xn.a {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @IntRange(from = -2)
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface v {
    }

    public BaseTransientBottomBar(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull xn.a aVar) {
        this(viewGroup.getContext(), viewGroup, view, aVar);
    }

    @NonNull
    public static GradientDrawable y(@ColorInt int i11, @NonNull Resources resources) {
        float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i11);
        return gradientDrawable;
    }

    @NonNull
    public static vn.k z(@ColorInt int i11, @NonNull vn.p pVar) {
        vn.k kVar = new vn.k(pVar);
        kVar.p0(ColorStateList.valueOf(i11));
        return kVar;
    }

    public void A() {
        B(3);
    }

    public void B(int i11) {
        com.google.android.material.snackbar.a.c().b(this.f32158z, i11);
    }

    public final ValueAnimator C(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f32136d);
        ofFloat.addUpdateListener(new b());
        return ofFloat;
    }

    @Nullable
    public View D() {
        q qVar = this.f32145m;
        if (qVar == null) {
            return null;
        }
        return qVar.b();
    }

    public int E() {
        return this.f32141i.getAnimationMode();
    }

    public Behavior F() {
        return this.f32156x;
    }

    @NonNull
    public Context G() {
        return this.f32140h;
    }

    public int H() {
        return this.f32143k;
    }

    @NonNull
    public SwipeDismissBehavior<? extends View> I() {
        return new Behavior();
    }

    public final ValueAnimator J(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f32138f);
        ofFloat.addUpdateListener(new c());
        return ofFloat;
    }

    @LayoutRes
    public int K() {
        return O() ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar;
    }

    public final int L() {
        int height = this.f32141i.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f32141i.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    @NonNull
    public View M() {
        return this.f32141i;
    }

    public final int N() {
        int[] iArr = new int[2];
        this.f32141i.getLocationInWindow(iArr);
        return iArr[1] + this.f32141i.getHeight();
    }

    public boolean O() {
        TypedArray obtainStyledAttributes = this.f32140h.obtainStyledAttributes(R);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    public final void P(int i11) {
        if (k0() && this.f32141i.getVisibility() == 0) {
            w(i11);
        } else {
            Y(i11);
        }
    }

    public boolean Q() {
        return this.f32146n;
    }

    public boolean R() {
        return this.f32144l;
    }

    public boolean S() {
        return com.google.android.material.snackbar.a.c().e(this.f32158z);
    }

    public boolean T() {
        return com.google.android.material.snackbar.a.c().f(this.f32158z);
    }

    public final boolean U() {
        ViewGroup.LayoutParams layoutParams = this.f32141i.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.LayoutParams) && (((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof SwipeDismissBehavior);
    }

    public void V() {
        WindowInsets rootWindowInsets;
        Insets mandatorySystemGestureInsets;
        int i11;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.f32141i.getRootWindowInsets()) == null) {
            return;
        }
        mandatorySystemGestureInsets = rootWindowInsets.getMandatorySystemGestureInsets();
        i11 = mandatorySystemGestureInsets.bottom;
        this.f32152t = i11;
        t0();
    }

    public void W() {
        if (T()) {
            N.post(new m());
        }
    }

    public void X() {
        if (this.f32154v) {
            o0();
            this.f32154v = false;
        }
    }

    public void Y(int i11) {
        com.google.android.material.snackbar.a.c().i(this.f32158z);
        List<s<B>> list = this.f32155w;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f32155w.get(size).a(this, i11);
            }
        }
        ViewParent parent = this.f32141i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f32141i);
        }
    }

    public void Z() {
        com.google.android.material.snackbar.a.c().j(this.f32158z);
        List<s<B>> list = this.f32155w;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f32155w.get(size).b(this);
            }
        }
    }

    public final void a0() {
        this.f32151s = x();
        t0();
    }

    @NonNull
    public B b0(@Nullable s<B> sVar) {
        List<s<B>> list;
        if (sVar == null || (list = this.f32155w) == null) {
            return this;
        }
        list.remove(sVar);
        return this;
    }

    @NonNull
    public B c0(@IdRes int i11) {
        View findViewById = this.f32139g.findViewById(i11);
        if (findViewById != null) {
            return d0(findViewById);
        }
        throw new IllegalArgumentException("Unable to find anchor view with id: " + i11);
    }

    @NonNull
    public B d0(@Nullable View view) {
        q qVar = this.f32145m;
        if (qVar != null) {
            qVar.c();
        }
        this.f32145m = view == null ? null : q.a(this, view);
        return this;
    }

    public void e0(boolean z11) {
        this.f32146n = z11;
    }

    @NonNull
    public B f0(int i11) {
        this.f32141i.setAnimationMode(i11);
        return this;
    }

    @NonNull
    public B g0(Behavior behavior) {
        this.f32156x = behavior;
        return this;
    }

    @NonNull
    public B h0(int i11) {
        this.f32143k = i11;
        return this;
    }

    @NonNull
    public B i0(boolean z11) {
        this.f32144l = z11;
        return this;
    }

    public final void j0(CoordinatorLayout.LayoutParams layoutParams) {
        SwipeDismissBehavior<? extends View> swipeDismissBehavior = this.f32156x;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = I();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).x(this);
        }
        swipeDismissBehavior.r(new n());
        layoutParams.setBehavior(swipeDismissBehavior);
        if (D() == null) {
            layoutParams.insetEdge = 80;
        }
    }

    public boolean k0() {
        AccessibilityManager accessibilityManager = this.f32157y;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public final boolean l0() {
        return this.f32152t > 0 && !this.f32144l && U();
    }

    public void m0() {
        com.google.android.material.snackbar.a.c().n(H(), this.f32158z);
    }

    public final void n0() {
        if (this.f32141i.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f32141i.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                j0((CoordinatorLayout.LayoutParams) layoutParams);
            }
            this.f32141i.c(this.f32139g);
            a0();
            this.f32141i.setVisibility(4);
        }
        if (ViewCompat.isLaidOut(this.f32141i)) {
            o0();
        } else {
            this.f32154v = true;
        }
    }

    public final void o0() {
        if (k0()) {
            v();
            return;
        }
        if (this.f32141i.getParent() != null) {
            this.f32141i.setVisibility(0);
        }
        Z();
    }

    public final void p0() {
        ValueAnimator C2 = C(0.0f, 1.0f);
        ValueAnimator J2 = J(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(C2, J2);
        animatorSet.setDuration(this.f32133a);
        animatorSet.addListener(new p());
        animatorSet.start();
    }

    public final void q0(int i11) {
        ValueAnimator C2 = C(1.0f, 0.0f);
        C2.setDuration(this.f32134b);
        C2.addListener(new a(i11));
        C2.start();
    }

    public final void r0() {
        int L2 = L();
        if (Q) {
            ViewCompat.offsetTopAndBottom(this.f32141i, L2);
        } else {
            this.f32141i.setTranslationY(L2);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(L2, 0);
        valueAnimator.setInterpolator(this.f32137e);
        valueAnimator.setDuration(this.f32135c);
        valueAnimator.addListener(new d());
        valueAnimator.addUpdateListener(new e(L2));
        valueAnimator.start();
    }

    public final void s0(int i11) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, L());
        valueAnimator.setInterpolator(this.f32137e);
        valueAnimator.setDuration(this.f32135c);
        valueAnimator.addListener(new f(i11));
        valueAnimator.addUpdateListener(new g());
        valueAnimator.start();
    }

    public final void t0() {
        ViewGroup.LayoutParams layoutParams = this.f32141i.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(S, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (this.f32141i.f32170j == null) {
            Log.w(S, "Unable to update margins because original view margins are not set");
            return;
        }
        if (this.f32141i.getParent() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i11 = this.f32141i.f32170j.bottom + (D() != null ? this.f32151s : this.f32148p);
        int i12 = this.f32141i.f32170j.left + this.f32149q;
        int i13 = this.f32141i.f32170j.right + this.f32150r;
        int i14 = this.f32141i.f32170j.top;
        boolean z11 = (marginLayoutParams.bottomMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13 && marginLayoutParams.topMargin == i14) ? false : true;
        if (z11) {
            marginLayoutParams.bottomMargin = i11;
            marginLayoutParams.leftMargin = i12;
            marginLayoutParams.rightMargin = i13;
            marginLayoutParams.topMargin = i14;
            this.f32141i.requestLayout();
        }
        if ((z11 || this.f32153u != this.f32152t) && Build.VERSION.SDK_INT >= 29 && l0()) {
            this.f32141i.removeCallbacks(this.f32147o);
            this.f32141i.post(this.f32147o);
        }
    }

    @NonNull
    public B u(@Nullable s<B> sVar) {
        if (sVar == null) {
            return this;
        }
        if (this.f32155w == null) {
            this.f32155w = new ArrayList();
        }
        this.f32155w.add(sVar);
        return this;
    }

    public void v() {
        this.f32141i.post(new o());
    }

    public final void w(int i11) {
        if (this.f32141i.getAnimationMode() == 1) {
            q0(i11);
        } else {
            s0(i11);
        }
    }

    public final int x() {
        if (D() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        D().getLocationOnScreen(iArr);
        int i11 = iArr[1];
        int[] iArr2 = new int[2];
        this.f32139g.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f32139g.getHeight()) - i11;
    }

    public BaseTransientBottomBar(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull View view, @NonNull xn.a aVar) {
        this.f32146n = false;
        this.f32147o = new i();
        this.f32158z = new l();
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f32139g = viewGroup;
        this.f32142j = aVar;
        this.f32140h = context;
        d0.a(context);
        SnackbarBaseLayout snackbarBaseLayout = (SnackbarBaseLayout) LayoutInflater.from(context).inflate(K(), viewGroup, false);
        this.f32141i = snackbarBaseLayout;
        snackbarBaseLayout.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            snackbarContentLayout.c(snackbarBaseLayout.getActionTextColorAlpha());
            snackbarContentLayout.setMaxInlineActionWidth(snackbarBaseLayout.getMaxInlineActionWidth());
        }
        snackbarBaseLayout.addView(view);
        ViewCompat.setAccessibilityLiveRegion(snackbarBaseLayout, 1);
        ViewCompat.setImportantForAccessibility(snackbarBaseLayout, 1);
        ViewCompat.setFitsSystemWindows(snackbarBaseLayout, true);
        ViewCompat.setOnApplyWindowInsetsListener(snackbarBaseLayout, new j());
        ViewCompat.setAccessibilityDelegate(snackbarBaseLayout, new k());
        this.f32157y = (AccessibilityManager) context.getSystemService("accessibility");
        int i11 = R.attr.motionDurationLong2;
        this.f32135c = pn.j.f(context, i11, 250);
        this.f32133a = pn.j.f(context, i11, 150);
        this.f32134b = pn.j.f(context, R.attr.motionDurationMedium1, 75);
        int i12 = R.attr.motionEasingEmphasizedInterpolator;
        this.f32136d = pn.j.g(context, i12, K);
        this.f32138f = pn.j.g(context, i12, L);
        this.f32137e = pn.j.g(context, i12, H);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class s<B> {

        /* renamed from: a, reason: collision with root package name */
        public static final int f32194a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f32195b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f32196c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f32197d = 3;

        /* renamed from: e, reason: collision with root package name */
        public static final int f32198e = 4;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface a {
        }

        public void b(B b11) {
        }

        public void a(B b11, int i11) {
        }
    }
}
