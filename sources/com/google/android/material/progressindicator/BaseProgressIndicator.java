package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.R;
import com.google.android.material.internal.d0;
import en.u;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import rn.b;
import rn.g;
import rn.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class BaseProgressIndicator<S extends rn.b> extends ProgressBar {

    /* renamed from: o, reason: collision with root package name */
    public static final int f31840o = 0;

    /* renamed from: p, reason: collision with root package name */
    public static final int f31841p = 1;

    /* renamed from: q, reason: collision with root package name */
    public static final int f31842q = 2;

    /* renamed from: r, reason: collision with root package name */
    public static final int f31843r = 0;

    /* renamed from: s, reason: collision with root package name */
    public static final int f31844s = 1;

    /* renamed from: t, reason: collision with root package name */
    public static final int f31845t = 2;

    /* renamed from: u, reason: collision with root package name */
    public static final int f31846u = 3;

    /* renamed from: v, reason: collision with root package name */
    public static final int f31847v = R.style.Widget_MaterialComponents_ProgressIndicator;

    /* renamed from: w, reason: collision with root package name */
    public static final float f31848w = 0.2f;

    /* renamed from: x, reason: collision with root package name */
    public static final int f31849x = 255;

    /* renamed from: y, reason: collision with root package name */
    public static final int f31850y = 1000;

    /* renamed from: a, reason: collision with root package name */
    public S f31851a;

    /* renamed from: b, reason: collision with root package name */
    public int f31852b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f31853c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f31854d;

    /* renamed from: e, reason: collision with root package name */
    public final int f31855e;

    /* renamed from: f, reason: collision with root package name */
    public final int f31856f;

    /* renamed from: g, reason: collision with root package name */
    public long f31857g;

    /* renamed from: h, reason: collision with root package name */
    public rn.a f31858h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f31859i;

    /* renamed from: j, reason: collision with root package name */
    public int f31860j;

    /* renamed from: k, reason: collision with root package name */
    public final Runnable f31861k;

    /* renamed from: l, reason: collision with root package name */
    public final Runnable f31862l;

    /* renamed from: m, reason: collision with root package name */
    public final Animatable2Compat.AnimationCallback f31863m;

    /* renamed from: n, reason: collision with root package name */
    public final Animatable2Compat.AnimationCallback f31864n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseProgressIndicator.this.l();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseProgressIndicator.this.k();
            BaseProgressIndicator.this.f31857g = -1L;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends Animatable2Compat.AnimationCallback {
        public c() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
            BaseProgressIndicator.this.setIndeterminate(false);
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            baseProgressIndicator.p(baseProgressIndicator.f31852b, BaseProgressIndicator.this.f31853c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends Animatable2Compat.AnimationCallback {
        public d() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
            super.onAnimationEnd(drawable);
            if (BaseProgressIndicator.this.f31859i) {
                return;
            }
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            baseProgressIndicator.setVisibility(baseProgressIndicator.f31860j);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface e {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface f {
    }

    public BaseProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i11, @StyleRes int i12) {
        super(zn.a.c(context, attributeSet, i11, f31847v), attributeSet, i11);
        this.f31857g = -1L;
        this.f31859i = false;
        this.f31860j = 4;
        this.f31861k = new a();
        this.f31862l = new b();
        this.f31863m = new c();
        this.f31864n = new d();
        Context context2 = getContext();
        this.f31851a = i(context2, attributeSet);
        TypedArray k11 = d0.k(context2, attributeSet, R.styleable.BaseProgressIndicator, i11, i12, new int[0]);
        this.f31855e = k11.getInt(R.styleable.BaseProgressIndicator_showDelay, -1);
        this.f31856f = Math.min(k11.getInt(R.styleable.BaseProgressIndicator_minHideDelay, -1), 1000);
        k11.recycle();
        this.f31858h = new rn.a();
        this.f31854d = true;
    }

    @Nullable
    private g<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().A();
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().C();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f31851a.f84325f;
    }

    @NonNull
    public int[] getIndicatorColor() {
        return this.f31851a.f84322c;
    }

    @Px
    public int getIndicatorTrackGapSize() {
        return this.f31851a.f84326g;
    }

    public int getShowAnimationBehavior() {
        return this.f31851a.f84324e;
    }

    @ColorInt
    public int getTrackColor() {
        return this.f31851a.f84323d;
    }

    @Px
    public int getTrackCornerRadius() {
        return this.f31851a.f84321b;
    }

    @Px
    public int getTrackThickness() {
        return this.f31851a.f84320a;
    }

    public void h(boolean z11) {
        if (this.f31854d) {
            ((rn.f) getCurrentDrawable()).t(s(), false, z11);
        }
    }

    public abstract S i(@NonNull Context context, @NonNull AttributeSet attributeSet);

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    public void j() {
        if (getVisibility() != 0) {
            removeCallbacks(this.f31861k);
            return;
        }
        removeCallbacks(this.f31862l);
        long uptimeMillis = SystemClock.uptimeMillis() - this.f31857g;
        int i11 = this.f31856f;
        if (uptimeMillis >= i11) {
            this.f31862l.run();
        } else {
            postDelayed(this.f31862l, i11 - uptimeMillis);
        }
    }

    public final void k() {
        ((rn.f) getCurrentDrawable()).t(false, false, true);
        if (n()) {
            setVisibility(4);
        }
    }

    public final void l() {
        if (this.f31856f > 0) {
            this.f31857g = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    public boolean m() {
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    public final boolean n() {
        if (getProgressDrawable() == null || !getProgressDrawable().isVisible()) {
            return getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible();
        }
        return false;
    }

    public final void o() {
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().z().d(this.f31863m);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().registerAnimationCallback(this.f31864n);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().registerAnimationCallback(this.f31864n);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        o();
        if (s()) {
            l();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f31862l);
        removeCallbacks(this.f31861k);
        ((rn.f) getCurrentDrawable()).j();
        r();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(@NonNull Canvas canvas) {
        try {
            int save = canvas.save();
            if (getPaddingLeft() == 0) {
                if (getPaddingTop() != 0) {
                }
                if (getPaddingRight() == 0 || getPaddingBottom() != 0) {
                    canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
                }
                getCurrentDrawable().draw(canvas);
                canvas.restoreToCount(save);
            }
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (getPaddingRight() == 0) {
            }
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(save);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i11, int i12) {
        try {
            g<S> currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.f() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i11) : currentDrawingDelegate.f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i12) : currentDrawingDelegate.e() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i11) {
        super.onVisibilityChanged(view, i11);
        h(i11 == 0);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i11) {
        super.onWindowVisibilityChanged(i11);
        h(false);
    }

    public void p(int i11, boolean z11) {
        if (!isIndeterminate()) {
            super.setProgress(i11);
            if (getProgressDrawable() == null || z11) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.f31852b = i11;
            this.f31853c = z11;
            this.f31859i = true;
            if (!getIndeterminateDrawable().isVisible() || this.f31858h.a(getContext().getContentResolver()) == 0.0f) {
                this.f31863m.onAnimationEnd(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().z().f();
            }
        }
    }

    public void q() {
        if (this.f31855e <= 0) {
            this.f31861k.run();
        } else {
            removeCallbacks(this.f31861k);
            postDelayed(this.f31861k, this.f31855e);
        }
    }

    public final void r() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().unregisterAnimationCallback(this.f31864n);
            getIndeterminateDrawable().z().j();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().unregisterAnimationCallback(this.f31864n);
        }
    }

    public boolean s() {
        return ViewCompat.isAttachedToWindow(this) && getWindowVisibility() == 0 && m();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setAnimatorDurationScaleProvider(@NonNull rn.a aVar) {
        this.f31858h = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f84371c = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f84371c = aVar;
        }
    }

    public void setHideAnimationBehavior(int i11) {
        this.f31851a.f84325f = i11;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z11) {
        try {
            if (z11 == isIndeterminate()) {
                return;
            }
            rn.f fVar = (rn.f) getCurrentDrawable();
            if (fVar != null) {
                fVar.j();
            }
            super.setIndeterminate(z11);
            rn.f fVar2 = (rn.f) getCurrentDrawable();
            if (fVar2 != null) {
                fVar2.t(s(), false, false);
            }
            if ((fVar2 instanceof i) && s()) {
                ((i) fVar2).z().i();
            }
            this.f31859i = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(@Nullable Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof i)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((rn.f) drawable).j();
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(@ColorInt int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{u.b(getContext(), R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f31851a.f84322c = iArr;
        getIndeterminateDrawable().z().c();
        invalidate();
    }

    public void setIndicatorTrackGapSize(@Px int i11) {
        S s11 = this.f31851a;
        if (s11.f84326g != i11) {
            s11.f84326g = i11;
            s11.e();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i11) {
        if (isIndeterminate()) {
            return;
        }
        p(i11, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(@Nullable Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof rn.e)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            rn.e eVar = (rn.e) drawable;
            eVar.j();
            super.setProgressDrawable(eVar);
            eVar.H(getProgress() / getMax());
        }
    }

    public void setShowAnimationBehavior(int i11) {
        this.f31851a.f84324e = i11;
        invalidate();
    }

    public void setTrackColor(@ColorInt int i11) {
        S s11 = this.f31851a;
        if (s11.f84323d != i11) {
            s11.f84323d = i11;
            invalidate();
        }
    }

    public void setTrackCornerRadius(@Px int i11) {
        S s11 = this.f31851a;
        if (s11.f84321b != i11) {
            s11.f84321b = Math.min(i11, s11.f84320a / 2);
            invalidate();
        }
    }

    public void setTrackThickness(@Px int i11) {
        S s11 = this.f31851a;
        if (s11.f84320a != i11) {
            s11.f84320a = i11;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i11) {
        if (i11 != 0 && i11 != 4 && i11 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f31860j = i11;
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public i<S> getIndeterminateDrawable() {
        return (i) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public rn.e<S> getProgressDrawable() {
        return (rn.e) super.getProgressDrawable();
    }
}
