package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AnimatorRes;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatImageHelper;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TintableImageSourceView;
import com.google.android.material.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.a;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.stateful.ExtendableSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import vm.i;
import vm.l;
import vn.p;
import vn.t;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class FloatingActionButton extends VisibilityAwareImageButton implements TintableBackgroundView, TintableImageSourceView, mn.a, t, CoordinatorLayout.AttachedBehavior {

    /* renamed from: r, reason: collision with root package name */
    public static final String f31345r = "FloatingActionButton";

    /* renamed from: s, reason: collision with root package name */
    public static final String f31346s = "expandableWidgetHelper";

    /* renamed from: t, reason: collision with root package name */
    public static final int f31347t = R.style.Widget_Design_FloatingActionButton;

    /* renamed from: u, reason: collision with root package name */
    public static final int f31348u = 1;

    /* renamed from: v, reason: collision with root package name */
    public static final int f31349v = 0;

    /* renamed from: w, reason: collision with root package name */
    public static final int f31350w = -1;

    /* renamed from: x, reason: collision with root package name */
    public static final int f31351x = 0;

    /* renamed from: y, reason: collision with root package name */
    public static final int f31352y = 470;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public ColorStateList f31353b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public PorterDuff.Mode f31354c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public ColorStateList f31355d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public PorterDuff.Mode f31356e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public ColorStateList f31357f;

    /* renamed from: g, reason: collision with root package name */
    public int f31358g;

    /* renamed from: h, reason: collision with root package name */
    public int f31359h;

    /* renamed from: i, reason: collision with root package name */
    public int f31360i;

    /* renamed from: j, reason: collision with root package name */
    public int f31361j;

    /* renamed from: k, reason: collision with root package name */
    public int f31362k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f31363l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f31364m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f31365n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final AppCompatImageHelper f31366o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final mn.c f31367p;

    /* renamed from: q, reason: collision with root package name */
    public com.google.android.material.floatingactionbutton.a f31368q;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: h */
        public /* bridge */ /* synthetic */ boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean i() {
            return super.i();
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: l */
        public /* bridge */ /* synthetic */ boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, View view) {
            return super.onDependentViewChanged(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: m */
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, int i11) {
            return super.onLayoutChild(coordinatorLayout, floatingActionButton, i11);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ void n(boolean z11) {
            super.n(z11);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        @VisibleForTesting
        public /* bridge */ /* synthetic */ void o(b bVar) {
            super.o(bVar);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
            super.onAttachedToLayoutParams(layoutParams);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements a.k {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f31373a;

        public a(b bVar) {
            this.f31373a = bVar;
        }

        @Override // com.google.android.material.floatingactionbutton.a.k
        public void a() {
            this.f31373a.b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.a.k
        public void b() {
            this.f31373a.a(FloatingActionButton.this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements un.c {
        public c() {
        }

        @Override // un.c
        public boolean a() {
            return FloatingActionButton.this.f31363l;
        }

        @Override // un.c
        public float b() {
            return FloatingActionButton.this.getSizeDimension() / 2.0f;
        }

        @Override // un.c
        public void setBackgroundDrawable(@Nullable Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // un.c
        public void setShadowPadding(int i11, int i12, int i13, int i14) {
            FloatingActionButton.this.f31364m.set(i11, i12, i13, i14);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i11 + floatingActionButton.f31361j, i12 + FloatingActionButton.this.f31361j, i13 + FloatingActionButton.this.f31361j, i14 + FloatingActionButton.this.f31361j);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface d {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e<T extends FloatingActionButton> implements a.j {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        public final l<T> f31376a;

        public e(@NonNull l<T> lVar) {
            this.f31376a = lVar;
        }

        @Override // com.google.android.material.floatingactionbutton.a.j
        public void a() {
            this.f31376a.a(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.a.j
        public void b() {
            this.f31376a.b(FloatingActionButton.this);
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof e) && ((e) obj).f31376a.equals(this.f31376a);
        }

        public int hashCode() {
            return this.f31376a.hashCode();
        }
    }

    public FloatingActionButton(@NonNull Context context) {
        this(context, null);
    }

    private com.google.android.material.floatingactionbutton.a getImpl() {
        if (this.f31368q == null) {
            this.f31368q = j();
        }
        return this.f31368q;
    }

    public void A(@Nullable b bVar) {
        B(bVar, true);
    }

    public void B(@Nullable b bVar, boolean z11) {
        getImpl().g0(C(bVar), z11);
    }

    @Nullable
    public final a.k C(@Nullable b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(bVar);
    }

    @Override // mn.b
    public boolean a(boolean z11) {
        return this.f31367p.f(z11);
    }

    @Override // mn.b
    public boolean b() {
        return this.f31367p.c();
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().F(getDrawableState());
    }

    public void f(@NonNull Animator.AnimatorListener animatorListener) {
        getImpl().e(animatorListener);
    }

    public void g(@NonNull Animator.AnimatorListener animatorListener) {
        getImpl().f(animatorListener);
    }

    @Override // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return this.f31353b;
    }

    @Override // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f31354c;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().n();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().q();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().t();
    }

    @Nullable
    public Drawable getContentBackground() {
        return getImpl().m();
    }

    @Px
    public int getCustomSize() {
        return this.f31360i;
    }

    @Override // mn.a
    public int getExpandedComponentIdHint() {
        return this.f31367p.b();
    }

    @Nullable
    public i getHideMotionSpec() {
        return getImpl().p();
    }

    @ColorInt
    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f31357f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    @Nullable
    public ColorStateList getRippleColorStateList() {
        return this.f31357f;
    }

    @Override // vn.t
    @NonNull
    public p getShapeAppearanceModel() {
        return (p) Preconditions.checkNotNull(getImpl().u());
    }

    @Nullable
    public i getShowMotionSpec() {
        return getImpl().v();
    }

    public int getSize() {
        return this.f31359h;
    }

    public int getSizeDimension() {
        return m(this.f31359h);
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // androidx.core.widget.TintableImageSourceView
    @Nullable
    public ColorStateList getSupportImageTintList() {
        return this.f31355d;
    }

    @Override // androidx.core.widget.TintableImageSourceView
    @Nullable
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f31356e;
    }

    public boolean getUseCompatPadding() {
        return this.f31363l;
    }

    public void h(@NonNull l<? extends FloatingActionButton> lVar) {
        getImpl().g(new e(lVar));
    }

    public void i() {
        setCustomSize(0);
    }

    @NonNull
    public final com.google.android.material.floatingactionbutton.a j() {
        return new nn.d(this, new c());
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().B();
    }

    @Deprecated
    public boolean k(@NonNull Rect rect) {
        if (!ViewCompat.isLaidOut(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        t(rect);
        return true;
    }

    public void l(@NonNull Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        t(rect);
    }

    public final int m(int i11) {
        int i12 = this.f31360i;
        if (i12 != 0) {
            return i12;
        }
        Resources resources = getResources();
        return i11 != -1 ? i11 != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? m(1) : m(0);
    }

    public final void n(@NonNull Rect rect) {
        l(rect);
        int i11 = -this.f31368q.w();
        rect.inset(i11, i11);
    }

    public void o() {
        p(null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().C();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().E();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i11, int i12) {
        int sizeDimension = getSizeDimension();
        this.f31361j = (sizeDimension - this.f31362k) / 2;
        getImpl().j0();
        int min = Math.min(View.resolveSize(sizeDimension, i11), View.resolveSize(sizeDimension, i12));
        Rect rect = this.f31364m;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.getSuperState());
        this.f31367p.d((Bundle) Preconditions.checkNotNull(extendableSavedState.f32221a.get(f31346s)));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(onSaveInstanceState);
        extendableSavedState.f32221a.put(f31346s, this.f31367p.e());
        return extendableSavedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            n(this.f31365n);
            if (!this.f31365n.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void p(@Nullable b bVar) {
        q(bVar, true);
    }

    public void q(@Nullable b bVar, boolean z11) {
        getImpl().x(C(bVar), z11);
    }

    public boolean r() {
        return getImpl().z();
    }

    public boolean s() {
        return getImpl().A();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        Log.i(f31345r, "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i(f31345r, "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        Log.i(f31345r, "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (this.f31353b != colorStateList) {
            this.f31353b = colorStateList;
            getImpl().P(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.f31354c != mode) {
            this.f31354c = mode;
            getImpl().Q(mode);
        }
    }

    public void setCompatElevation(float f11) {
        getImpl().R(f11);
    }

    public void setCompatElevationResource(@DimenRes int i11) {
        setCompatElevation(getResources().getDimension(i11));
    }

    public void setCompatHoveredFocusedTranslationZ(float f11) {
        getImpl().U(f11);
    }

    public void setCompatHoveredFocusedTranslationZResource(@DimenRes int i11) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i11));
    }

    public void setCompatPressedTranslationZ(float f11) {
        getImpl().Y(f11);
    }

    public void setCompatPressedTranslationZResource(@DimenRes int i11) {
        setCompatPressedTranslationZ(getResources().getDimension(i11));
    }

    public void setCustomSize(@Px int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i11 != this.f31360i) {
            this.f31360i = i11;
            requestLayout();
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f11) {
        super.setElevation(f11);
        getImpl().k0(f11);
    }

    public void setEnsureMinTouchTargetSize(boolean z11) {
        if (z11 != getImpl().o()) {
            getImpl().S(z11);
            requestLayout();
        }
    }

    @Override // mn.a
    public void setExpandedComponentIdHint(@IdRes int i11) {
        this.f31367p.g(i11);
    }

    public void setHideMotionSpec(@Nullable i iVar) {
        getImpl().T(iVar);
    }

    public void setHideMotionSpecResource(@AnimatorRes int i11) {
        setHideMotionSpec(i.d(getContext(), i11));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().i0();
            if (this.f31355d != null) {
                u();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i11) {
        this.f31366o.setImageResource(i11);
        u();
    }

    public void setMaxImageSize(int i11) {
        this.f31362k = i11;
        getImpl().W(i11);
    }

    public void setRippleColor(@ColorInt int i11) {
        setRippleColor(ColorStateList.valueOf(i11));
    }

    @Override // android.view.View
    public void setScaleX(float f11) {
        super.setScaleX(f11);
        getImpl().J();
    }

    @Override // android.view.View
    public void setScaleY(float f11) {
        super.setScaleY(f11);
        getImpl().J();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setShadowPaddingEnabled(boolean z11) {
        getImpl().a0(z11);
    }

    @Override // vn.t
    public void setShapeAppearanceModel(@NonNull p pVar) {
        getImpl().b0(pVar);
    }

    public void setShowMotionSpec(@Nullable i iVar) {
        getImpl().c0(iVar);
    }

    public void setShowMotionSpecResource(@AnimatorRes int i11) {
        setShowMotionSpec(i.d(getContext(), i11));
    }

    public void setSize(int i11) {
        this.f31360i = 0;
        if (i11 != this.f31359h) {
            this.f31359h = i11;
            requestLayout();
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // androidx.core.widget.TintableImageSourceView
    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        if (this.f31355d != colorStateList) {
            this.f31355d = colorStateList;
            u();
        }
    }

    @Override // androidx.core.widget.TintableImageSourceView
    public void setSupportImageTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.f31356e != mode) {
            this.f31356e = mode;
            u();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f11) {
        super.setTranslationX(f11);
        getImpl().K();
    }

    @Override // android.view.View
    public void setTranslationY(float f11) {
        super.setTranslationY(f11);
        getImpl().K();
    }

    @Override // android.view.View
    public void setTranslationZ(float f11) {
        super.setTranslationZ(f11);
        getImpl().K();
    }

    public void setUseCompatPadding(boolean z11) {
        if (this.f31363l != z11) {
            this.f31363l = z11;
            getImpl().D();
        }
    }

    @Override // com.google.android.material.internal.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
    }

    public final void t(@NonNull Rect rect) {
        int i11 = rect.left;
        Rect rect2 = this.f31364m;
        rect.left = i11 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public final void u() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f31355d;
        if (colorStateList == null) {
            DrawableCompat.clearColorFilter(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f31356e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(colorForState, mode));
    }

    public void v(@NonNull Animator.AnimatorListener animatorListener) {
        getImpl().L(animatorListener);
    }

    public void w(@NonNull Animator.AnimatorListener animatorListener) {
        getImpl().M(animatorListener);
    }

    public void x(@NonNull l<? extends FloatingActionButton> lVar) {
        getImpl().N(new e(lVar));
    }

    public boolean y() {
        return getImpl().o();
    }

    public void z() {
        A(null);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: d, reason: collision with root package name */
        public static final boolean f31369d = true;

        /* renamed from: a, reason: collision with root package name */
        public Rect f31370a;

        /* renamed from: b, reason: collision with root package name */
        public b f31371b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f31372c;

        public BaseBehavior() {
            this.f31372c = true;
        }

        private static boolean j(@NonNull View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                return ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull Rect rect) {
            Rect rect2 = floatingActionButton.f31364m;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public boolean i() {
            return this.f31372c;
        }

        public final void k(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f31364m;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams();
            int i11 = 0;
            int i12 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) {
                i11 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) {
                i11 = -rect.top;
            }
            if (i11 != 0) {
                ViewCompat.offsetTopAndBottom(floatingActionButton, i11);
            }
            if (i12 != 0) {
                ViewCompat.offsetLeftAndRight(floatingActionButton, i12);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                q(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!j(view)) {
                return false;
            }
            r(view, floatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, int i11) {
            List<View> dependencies = coordinatorLayout.getDependencies(floatingActionButton);
            int size = dependencies.size();
            for (int i12 = 0; i12 < size; i12++) {
                View view = dependencies.get(i12);
                if (!(view instanceof AppBarLayout)) {
                    if (j(view) && r(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (q(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(floatingActionButton, i11);
            k(coordinatorLayout, floatingActionButton);
            return true;
        }

        public void n(boolean z11) {
            this.f31372c = z11;
        }

        @VisibleForTesting
        public void o(b bVar) {
            this.f31371b = bVar;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.dodgeInsetEdges == 0) {
                layoutParams.dodgeInsetEdges = 80;
            }
        }

        public final boolean p(@NonNull View view, @NonNull FloatingActionButton floatingActionButton) {
            return this.f31372c && ((CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams()).getAnchorId() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        public final boolean q(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull FloatingActionButton floatingActionButton) {
            if (!p(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f31370a == null) {
                this.f31370a = new Rect();
            }
            Rect rect = this.f31370a;
            com.google.android.material.internal.d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.q(this.f31371b, false);
                return true;
            }
            floatingActionButton.B(this.f31371b, false);
            return true;
        }

        public final boolean r(@NonNull View view, @NonNull FloatingActionButton floatingActionButton) {
            if (!p(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.q(this.f31371b, false);
                return true;
            }
            floatingActionButton.B(this.f31371b, false);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FloatingActionButton_Behavior_Layout);
            this.f31372c = obtainStyledAttributes.getBoolean(R.styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }
    }

    public FloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.f31357f != colorStateList) {
            this.f31357f = colorStateList;
            getImpl().Z(this.f31357f);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FloatingActionButton(@androidx.annotation.NonNull android.content.Context r11, @androidx.annotation.Nullable android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r4 = com.google.android.material.floatingactionbutton.FloatingActionButton.f31347t
            android.content.Context r11 = zn.a.c(r11, r12, r13, r4)
            r10.<init>(r11, r12, r13)
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r10.f31364m = r11
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r10.f31365n = r11
            android.content.Context r0 = r10.getContext()
            int[] r2 = com.google.android.material.R.styleable.FloatingActionButton
            r11 = 0
            int[] r5 = new int[r11]
            r1 = r12
            r3 = r13
            android.content.res.TypedArray r12 = com.google.android.material.internal.d0.k(r0, r1, r2, r3, r4, r5)
            int r13 = com.google.android.material.R.styleable.FloatingActionButton_backgroundTint
            android.content.res.ColorStateList r13 = sn.c.a(r0, r12, r13)
            r10.f31353b = r13
            int r13 = com.google.android.material.R.styleable.FloatingActionButton_backgroundTintMode
            r2 = -1
            int r13 = r12.getInt(r13, r2)
            r5 = 0
            android.graphics.PorterDuff$Mode r13 = com.google.android.material.internal.m0.t(r13, r5)
            r10.f31354c = r13
            int r13 = com.google.android.material.R.styleable.FloatingActionButton_rippleColor
            android.content.res.ColorStateList r13 = sn.c.a(r0, r12, r13)
            r10.f31357f = r13
            int r13 = com.google.android.material.R.styleable.FloatingActionButton_fabSize
            int r13 = r12.getInt(r13, r2)
            r10.f31359h = r13
            int r13 = com.google.android.material.R.styleable.FloatingActionButton_fabCustomSize
            int r13 = r12.getDimensionPixelSize(r13, r11)
            r10.f31360i = r13
            int r13 = com.google.android.material.R.styleable.FloatingActionButton_borderWidth
            int r13 = r12.getDimensionPixelSize(r13, r11)
            r10.f31358g = r13
            int r13 = com.google.android.material.R.styleable.FloatingActionButton_elevation
            r2 = 0
            float r13 = r12.getDimension(r13, r2)
            int r5 = com.google.android.material.R.styleable.FloatingActionButton_hoveredFocusedTranslationZ
            float r5 = r12.getDimension(r5, r2)
            int r6 = com.google.android.material.R.styleable.FloatingActionButton_pressedTranslationZ
            float r2 = r12.getDimension(r6, r2)
            int r6 = com.google.android.material.R.styleable.FloatingActionButton_useCompatPadding
            boolean r6 = r12.getBoolean(r6, r11)
            r10.f31363l = r6
            android.content.res.Resources r6 = r10.getResources()
            int r7 = com.google.android.material.R.dimen.mtrl_fab_min_touch_target
            int r6 = r6.getDimensionPixelSize(r7)
            int r7 = com.google.android.material.R.styleable.FloatingActionButton_maxImageSize
            int r7 = r12.getDimensionPixelSize(r7, r11)
            r10.setMaxImageSize(r7)
            int r7 = com.google.android.material.R.styleable.FloatingActionButton_showMotionSpec
            vm.i r7 = vm.i.c(r0, r12, r7)
            int r8 = com.google.android.material.R.styleable.FloatingActionButton_hideMotionSpec
            vm.i r8 = vm.i.c(r0, r12, r8)
            vn.e r9 = vn.p.f94154m
            vn.p$b r0 = vn.p.g(r0, r1, r3, r4, r9)
            vn.p r0 = r0.m()
            int r4 = com.google.android.material.R.styleable.FloatingActionButton_ensureMinTouchTargetSize
            boolean r11 = r12.getBoolean(r4, r11)
            int r4 = com.google.android.material.R.styleable.FloatingActionButton_android_enabled
            r9 = 1
            boolean r4 = r12.getBoolean(r4, r9)
            r10.setEnabled(r4)
            r12.recycle()
            androidx.appcompat.widget.AppCompatImageHelper r12 = new androidx.appcompat.widget.AppCompatImageHelper
            r12.<init>(r10)
            r10.f31366o = r12
            r12.loadFromAttributes(r1, r3)
            mn.c r12 = new mn.c
            r12.<init>(r10)
            r10.f31367p = r12
            com.google.android.material.floatingactionbutton.a r12 = r10.getImpl()
            r12.b0(r0)
            com.google.android.material.floatingactionbutton.a r12 = r10.getImpl()
            android.content.res.ColorStateList r0 = r10.f31353b
            android.graphics.PorterDuff$Mode r1 = r10.f31354c
            android.content.res.ColorStateList r3 = r10.f31357f
            int r4 = r10.f31358g
            r12.y(r0, r1, r3, r4)
            com.google.android.material.floatingactionbutton.a r12 = r10.getImpl()
            r12.X(r6)
            com.google.android.material.floatingactionbutton.a r12 = r10.getImpl()
            r12.R(r13)
            com.google.android.material.floatingactionbutton.a r12 = r10.getImpl()
            r12.U(r5)
            com.google.android.material.floatingactionbutton.a r12 = r10.getImpl()
            r12.Y(r2)
            com.google.android.material.floatingactionbutton.a r12 = r10.getImpl()
            r12.c0(r7)
            com.google.android.material.floatingactionbutton.a r12 = r10.getImpl()
            r12.T(r8)
            com.google.android.material.floatingactionbutton.a r12 = r10.getImpl()
            r12.S(r11)
            android.widget.ImageView$ScaleType r11 = android.widget.ImageView.ScaleType.MATRIX
            r10.setScaleType(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class b {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }
}
