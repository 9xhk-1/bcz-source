package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.z;
import en.u;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import wm.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    public static final int F = R.style.Widget_Design_CollapsingToolbar;
    public static final int G = 600;
    public static final int H = 0;
    public static final int I = 1;

    @Nullable
    public WindowInsetsCompat A;
    public int B;
    public boolean C;
    public int D;
    public boolean E;

    /* renamed from: a, reason: collision with root package name */
    public boolean f30472a;

    /* renamed from: b, reason: collision with root package name */
    public int f30473b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public ViewGroup f30474c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public View f30475d;

    /* renamed from: e, reason: collision with root package name */
    public View f30476e;

    /* renamed from: f, reason: collision with root package name */
    public int f30477f;

    /* renamed from: g, reason: collision with root package name */
    public int f30478g;

    /* renamed from: h, reason: collision with root package name */
    public int f30479h;

    /* renamed from: i, reason: collision with root package name */
    public int f30480i;

    /* renamed from: j, reason: collision with root package name */
    public final Rect f30481j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final com.google.android.material.internal.b f30482k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final ln.a f30483l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f30484m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f30485n;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    public Drawable f30486o;

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    public Drawable f30487p;

    /* renamed from: q, reason: collision with root package name */
    public int f30488q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f30489r;

    /* renamed from: s, reason: collision with root package name */
    public ValueAnimator f30490s;

    /* renamed from: t, reason: collision with root package name */
    public long f30491t;

    /* renamed from: u, reason: collision with root package name */
    public final TimeInterpolator f30492u;

    /* renamed from: v, reason: collision with root package name */
    public final TimeInterpolator f30493v;

    /* renamed from: w, reason: collision with root package name */
    public int f30494w;

    /* renamed from: x, reason: collision with root package name */
    public AppBarLayout.g f30495x;

    /* renamed from: y, reason: collision with root package name */
    public int f30496y;

    /* renamed from: z, reason: collision with root package name */
    public int f30497z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements OnApplyWindowInsetsListener {
        public a() {
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
            return CollapsingToolbarLayout.this.s(windowInsetsCompat);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements AppBarLayout.g {
        public d() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.g, com.google.android.material.appbar.AppBarLayout.b
        public void a(AppBarLayout appBarLayout, int i11) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f30496y = i11;
            WindowInsetsCompat windowInsetsCompat = collapsingToolbarLayout.A;
            int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i12);
                c cVar = (c) childAt.getLayoutParams();
                g k11 = CollapsingToolbarLayout.k(childAt);
                int i13 = cVar.f30504a;
                if (i13 == 1) {
                    k11.k(MathUtils.clamp(-i11, 0, CollapsingToolbarLayout.this.i(childAt)));
                } else if (i13 == 2) {
                    k11.k(Math.round((-i11) * cVar.f30505b));
                }
            }
            CollapsingToolbarLayout.this.A();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.f30487p != null && systemWindowInsetTop > 0) {
                ViewCompat.postInvalidateOnAnimation(collapsingToolbarLayout2);
            }
            int height = (CollapsingToolbarLayout.this.getHeight() - ViewCompat.getMinimumHeight(CollapsingToolbarLayout.this)) - systemWindowInsetTop;
            float f11 = height;
            CollapsingToolbarLayout.this.f30482k.C0(Math.min(1.0f, (r0 - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger()) / f11));
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            collapsingToolbarLayout3.f30482k.p0(collapsingToolbarLayout3.f30496y + height);
            CollapsingToolbarLayout.this.f30482k.A0(Math.abs(i11) / f11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface e extends z {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface f {
    }

    public CollapsingToolbarLayout(@NonNull Context context) {
        this(context, null);
    }

    @ColorInt
    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        ColorStateList l11 = u.l(getContext(), R.attr.colorSurfaceContainer);
        if (l11 != null) {
            return l11.getDefaultColor();
        }
        return this.f30483l.g(getResources().getDimension(R.dimen.design_appbar_elevation));
    }

    public static int h(@NonNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public static CharSequence j(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    @NonNull
    public static g k(@NonNull View view) {
        int i11 = R.id.view_offset_helper;
        g gVar = (g) view.getTag(i11);
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(view);
        view.setTag(i11, gVar2);
        return gVar2;
    }

    public static boolean q(View view) {
        return (view instanceof Toolbar) || (view instanceof android.widget.Toolbar);
    }

    public final void A() {
        if (this.f30486o == null && this.f30487p == null) {
            return;
        }
        setScrimsShown(getHeight() + this.f30496y < getScrimVisibleHeightTrigger());
    }

    public final void B(int i11, int i12, int i13, int i14, boolean z11) {
        View view;
        if (!this.f30484m || (view = this.f30476e) == null) {
            return;
        }
        boolean z12 = ViewCompat.isAttachedToWindow(view) && this.f30476e.getVisibility() == 0;
        this.f30485n = z12;
        if (z12 || z11) {
            boolean z13 = ViewCompat.getLayoutDirection(this) == 1;
            v(z13);
            this.f30482k.q0(z13 ? this.f30479h : this.f30477f, this.f30481j.top + this.f30478g, (i13 - i11) - (z13 ? this.f30477f : this.f30479h), (i14 - i12) - this.f30480i);
            this.f30482k.d0(z11);
        }
    }

    public final void C() {
        if (this.f30474c != null && this.f30484m && TextUtils.isEmpty(this.f30482k.P())) {
            setTitle(j(this.f30474c));
        }
    }

    public final void a(int i11) {
        d();
        ValueAnimator valueAnimator = this.f30490s;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f30490s = valueAnimator2;
            valueAnimator2.setInterpolator(i11 > this.f30488q ? this.f30492u : this.f30493v);
            this.f30490s.addUpdateListener(new b());
        } else if (valueAnimator.isRunning()) {
            this.f30490s.cancel();
        }
        this.f30490s.setDuration(this.f30491t);
        this.f30490s.setIntValues(this.f30488q, i11);
        this.f30490s.start();
    }

    public final TextUtils.TruncateAt b(int i11) {
        return i11 != 0 ? i11 != 1 ? i11 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.START;
    }

    public final void c(AppBarLayout appBarLayout) {
        if (o()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public final void d() {
        if (this.f30472a) {
            ViewGroup viewGroup = null;
            this.f30474c = null;
            this.f30475d = null;
            int i11 = this.f30473b;
            if (i11 != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i11);
                this.f30474c = viewGroup2;
                if (viewGroup2 != null) {
                    this.f30475d = e(viewGroup2);
                }
            }
            if (this.f30474c == null) {
                int childCount = getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i12);
                    if (q(childAt)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                    i12++;
                }
                this.f30474c = viewGroup;
            }
            z();
            this.f30472a = false;
        }
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        d();
        if (this.f30474c == null && (drawable = this.f30486o) != null && this.f30488q > 0) {
            drawable.mutate().setAlpha(this.f30488q);
            this.f30486o.draw(canvas);
        }
        if (this.f30484m && this.f30485n) {
            if (this.f30474c == null || this.f30486o == null || this.f30488q <= 0 || !o() || this.f30482k.G() >= this.f30482k.H()) {
                this.f30482k.l(canvas);
            } else {
                int save = canvas.save();
                canvas.clipRect(this.f30486o.getBounds(), Region.Op.DIFFERENCE);
                this.f30482k.l(canvas);
                canvas.restoreToCount(save);
            }
        }
        if (this.f30487p == null || this.f30488q <= 0) {
            return;
        }
        WindowInsetsCompat windowInsetsCompat = this.A;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f30487p.setBounds(0, -this.f30496y, getWidth(), systemWindowInsetTop - this.f30496y);
            this.f30487p.mutate().setAlpha(this.f30488q);
            this.f30487p.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j11) {
        boolean z11;
        if (this.f30486o == null || this.f30488q <= 0 || !r(view)) {
            z11 = false;
        } else {
            y(this.f30486o, view, getWidth(), getHeight());
            this.f30486o.mutate().setAlpha(this.f30488q);
            this.f30486o.draw(canvas);
            z11 = true;
        }
        return super.drawChild(canvas, view, j11) || z11;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f30487p;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f30486o;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        com.google.android.material.internal.b bVar = this.f30482k;
        if (bVar != null) {
            state |= bVar.K0(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @NonNull
    public final View e(@NonNull View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = parent;
            }
        }
        return view;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        return new c(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public int getCollapsedTitleGravity() {
        return this.f30482k.q();
    }

    public float getCollapsedTitleTextSize() {
        return this.f30482k.u();
    }

    @NonNull
    public Typeface getCollapsedTitleTypeface() {
        return this.f30482k.v();
    }

    @Nullable
    public Drawable getContentScrim() {
        return this.f30486o;
    }

    public int getExpandedTitleGravity() {
        return this.f30482k.C();
    }

    public int getExpandedTitleMarginBottom() {
        return this.f30480i;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f30479h;
    }

    public int getExpandedTitleMarginStart() {
        return this.f30477f;
    }

    public int getExpandedTitleMarginTop() {
        return this.f30478g;
    }

    public float getExpandedTitleTextSize() {
        return this.f30482k.E();
    }

    @NonNull
    public Typeface getExpandedTitleTypeface() {
        return this.f30482k.F();
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getHyphenationFrequency() {
        return this.f30482k.I();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getLineCount() {
        return this.f30482k.J();
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getLineSpacingAdd() {
        return this.f30482k.K();
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getLineSpacingMultiplier() {
        return this.f30482k.L();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getMaxLines() {
        return this.f30482k.M();
    }

    public int getScrimAlpha() {
        return this.f30488q;
    }

    public long getScrimAnimationDuration() {
        return this.f30491t;
    }

    public int getScrimVisibleHeightTrigger() {
        int i11 = this.f30494w;
        if (i11 >= 0) {
            return i11 + this.B + this.D;
        }
        WindowInsetsCompat windowInsetsCompat = this.A;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
        int minimumHeight = ViewCompat.getMinimumHeight(this);
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + systemWindowInsetTop, getHeight()) : getHeight() / 3;
    }

    @Nullable
    public Drawable getStatusBarScrim() {
        return this.f30487p;
    }

    @Nullable
    public CharSequence getTitle() {
        if (this.f30484m) {
            return this.f30482k.P();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.f30497z;
    }

    @Nullable
    public TimeInterpolator getTitlePositionInterpolator() {
        return this.f30482k.O();
    }

    @NonNull
    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.f30482k.S();
    }

    public final int i(@NonNull View view) {
        return ((getHeight() - k(view).c()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((c) view.getLayoutParams())).bottomMargin;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean l() {
        return this.E;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean m() {
        return this.C;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean n() {
        return this.f30482k.W();
    }

    public final boolean o() {
        return this.f30497z == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            c(appBarLayout);
            ViewCompat.setFitsSystemWindows(this, ViewCompat.getFitsSystemWindows(appBarLayout));
            if (this.f30495x == null) {
                this.f30495x = new d();
            }
            appBarLayout.e(this.f30495x);
            ViewCompat.requestApplyInsets(this);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f30482k.a0(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.g gVar = this.f30495x;
        if (gVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).z(gVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        WindowInsetsCompat windowInsetsCompat = this.A;
        if (windowInsetsCompat != null) {
            int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
            int childCount = getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = getChildAt(i15);
                if (!ViewCompat.getFitsSystemWindows(childAt) && childAt.getTop() < systemWindowInsetTop) {
                    ViewCompat.offsetTopAndBottom(childAt, systemWindowInsetTop);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i16 = 0; i16 < childCount2; i16++) {
            k(getChildAt(i16)).h();
        }
        B(i11, i12, i13, i14, false);
        C();
        A();
        int childCount3 = getChildCount();
        for (int i17 = 0; i17 < childCount3; i17++) {
            k(getChildAt(i17)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        CollapsingToolbarLayout collapsingToolbarLayout;
        d();
        super.onMeasure(i11, i12);
        int mode = View.MeasureSpec.getMode(i12);
        WindowInsetsCompat windowInsetsCompat = this.A;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
        if ((mode == 0 || this.C) && systemWindowInsetTop > 0) {
            this.B = systemWindowInsetTop;
            super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + systemWindowInsetTop, 1073741824));
        }
        if (!this.E || this.f30482k.M() <= 1) {
            collapsingToolbarLayout = this;
        } else {
            C();
            collapsingToolbarLayout = this;
            collapsingToolbarLayout.B(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            int z11 = collapsingToolbarLayout.f30482k.z();
            if (z11 > 1) {
                collapsingToolbarLayout.D = Math.round(collapsingToolbarLayout.f30482k.B()) * (z11 - 1);
                super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + collapsingToolbarLayout.D, 1073741824));
            }
        }
        ViewGroup viewGroup = collapsingToolbarLayout.f30474c;
        if (viewGroup != null) {
            View view = collapsingToolbarLayout.f30475d;
            if (view == null || view == collapsingToolbarLayout) {
                setMinimumHeight(h(viewGroup));
            } else {
                setMinimumHeight(h(view));
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        Drawable drawable = this.f30486o;
        if (drawable != null) {
            x(drawable, i11, i12);
        }
    }

    public boolean p() {
        return this.f30484m;
    }

    public final boolean r(View view) {
        View view2 = this.f30475d;
        return (view2 == null || view2 == this) ? view == this.f30474c : view == view2;
    }

    public WindowInsetsCompat s(@NonNull WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompat2 = ViewCompat.getFitsSystemWindows(this) ? windowInsetsCompat : null;
        if (!ObjectsCompat.equals(this.A, windowInsetsCompat2)) {
            this.A = windowInsetsCompat2;
            requestLayout();
        }
        return windowInsetsCompat.consumeSystemWindowInsets();
    }

    public void setCollapsedTitleGravity(int i11) {
        this.f30482k.l0(i11);
    }

    public void setCollapsedTitleTextAppearance(@StyleRes int i11) {
        this.f30482k.i0(i11);
    }

    public void setCollapsedTitleTextColor(@ColorInt int i11) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i11));
    }

    public void setCollapsedTitleTextSize(float f11) {
        this.f30482k.m0(f11);
    }

    public void setCollapsedTitleTypeface(@Nullable Typeface typeface) {
        this.f30482k.n0(typeface);
    }

    public void setContentScrim(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f30486o;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f30486o = mutate;
            if (mutate != null) {
                x(mutate, getWidth(), getHeight());
                this.f30486o.setCallback(this);
                this.f30486o.setAlpha(this.f30488q);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setContentScrimColor(@ColorInt int i11) {
        setContentScrim(new ColorDrawable(i11));
    }

    public void setContentScrimResource(@DrawableRes int i11) {
        setContentScrim(ContextCompat.getDrawable(getContext(), i11));
    }

    public void setExpandedTitleColor(@ColorInt int i11) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i11));
    }

    public void setExpandedTitleGravity(int i11) {
        this.f30482k.w0(i11);
    }

    public void setExpandedTitleMarginBottom(int i11) {
        this.f30480i = i11;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i11) {
        this.f30479h = i11;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i11) {
        this.f30477f = i11;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i11) {
        this.f30478g = i11;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(@StyleRes int i11) {
        this.f30482k.t0(i11);
    }

    public void setExpandedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f30482k.v0(colorStateList);
    }

    public void setExpandedTitleTextSize(float f11) {
        this.f30482k.x0(f11);
    }

    public void setExpandedTitleTypeface(@Nullable Typeface typeface) {
        this.f30482k.y0(typeface);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setExtraMultilineHeightEnabled(boolean z11) {
        this.E = z11;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setForceApplySystemWindowInsetTop(boolean z11) {
        this.C = z11;
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setHyphenationFrequency(int i11) {
        this.f30482k.D0(i11);
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLineSpacingAdd(float f11) {
        this.f30482k.F0(f11);
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLineSpacingMultiplier(@FloatRange(from = 0.0d) float f11) {
        this.f30482k.G0(f11);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setMaxLines(int i11) {
        this.f30482k.H0(i11);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setRtlTextDirectionHeuristicsEnabled(boolean z11) {
        this.f30482k.J0(z11);
    }

    public void setScrimAlpha(int i11) {
        ViewGroup viewGroup;
        if (i11 != this.f30488q) {
            if (this.f30486o != null && (viewGroup = this.f30474c) != null) {
                ViewCompat.postInvalidateOnAnimation(viewGroup);
            }
            this.f30488q = i11;
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setScrimAnimationDuration(@IntRange(from = 0) long j11) {
        this.f30491t = j11;
    }

    public void setScrimVisibleHeightTrigger(@IntRange(from = 0) int i11) {
        if (this.f30494w != i11) {
            this.f30494w = i11;
            A();
        }
    }

    public void setScrimsShown(boolean z11) {
        u(z11, ViewCompat.isLaidOut(this) && !isInEditMode());
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setStaticLayoutBuilderConfigurer(@Nullable e eVar) {
        this.f30482k.L0(eVar);
    }

    public void setStatusBarScrim(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f30487p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f30487p = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f30487p.setState(getDrawableState());
                }
                DrawableCompat.setLayoutDirection(this.f30487p, ViewCompat.getLayoutDirection(this));
                this.f30487p.setVisible(getVisibility() == 0, false);
                this.f30487p.setCallback(this);
                this.f30487p.setAlpha(this.f30488q);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setStatusBarScrimColor(@ColorInt int i11) {
        setStatusBarScrim(new ColorDrawable(i11));
    }

    public void setStatusBarScrimResource(@DrawableRes int i11) {
        setStatusBarScrim(ContextCompat.getDrawable(getContext(), i11));
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        this.f30482k.M0(charSequence);
        w();
    }

    public void setTitleCollapseMode(int i11) {
        this.f30497z = i11;
        boolean o11 = o();
        this.f30482k.B0(o11);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            c((AppBarLayout) parent);
        }
        if (o11 && this.f30486o == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(@NonNull TextUtils.TruncateAt truncateAt) {
        this.f30482k.O0(truncateAt);
    }

    public void setTitleEnabled(boolean z11) {
        if (z11 != this.f30484m) {
            this.f30484m = z11;
            w();
            z();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(@Nullable TimeInterpolator timeInterpolator) {
        this.f30482k.I0(timeInterpolator);
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        boolean z11 = i11 == 0;
        Drawable drawable = this.f30487p;
        if (drawable != null && drawable.isVisible() != z11) {
            this.f30487p.setVisible(z11, false);
        }
        Drawable drawable2 = this.f30486o;
        if (drawable2 == null || drawable2.isVisible() == z11) {
            return;
        }
        this.f30486o.setVisible(z11, false);
    }

    public void t(int i11, int i12, int i13, int i14) {
        this.f30477f = i11;
        this.f30478g = i12;
        this.f30479h = i13;
        this.f30480i = i14;
        requestLayout();
    }

    public void u(boolean z11, boolean z12) {
        if (this.f30489r != z11) {
            if (z12) {
                a(z11 ? 255 : 0);
            } else {
                setScrimAlpha(z11 ? 255 : 0);
            }
            this.f30489r = z11;
        }
    }

    public final void v(boolean z11) {
        int i11;
        int i12;
        int i13;
        int i14;
        View view = this.f30475d;
        if (view == null) {
            view = this.f30474c;
        }
        int i15 = i(view);
        com.google.android.material.internal.d.a(this, this.f30476e, this.f30481j);
        ViewGroup viewGroup = this.f30474c;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            i11 = toolbar.getTitleMarginStart();
            i13 = toolbar.getTitleMarginEnd();
            i14 = toolbar.getTitleMarginTop();
            i12 = toolbar.getTitleMarginBottom();
        } else if (viewGroup instanceof android.widget.Toolbar) {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            i11 = toolbar2.getTitleMarginStart();
            i13 = toolbar2.getTitleMarginEnd();
            i14 = toolbar2.getTitleMarginTop();
            i12 = toolbar2.getTitleMarginBottom();
        } else {
            i11 = 0;
            i12 = 0;
            i13 = 0;
            i14 = 0;
        }
        com.google.android.material.internal.b bVar = this.f30482k;
        Rect rect = this.f30481j;
        int i16 = rect.left + (z11 ? i13 : i11);
        int i17 = rect.top + i15 + i14;
        int i18 = rect.right;
        if (!z11) {
            i11 = i13;
        }
        bVar.g0(i16, i17, i18 - i11, (rect.bottom + i15) - i12);
    }

    @Override // android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f30486o || drawable == this.f30487p;
    }

    public final void w() {
        setContentDescription(getTitle());
    }

    public final void x(@NonNull Drawable drawable, int i11, int i12) {
        y(drawable, this.f30474c, i11, i12);
    }

    public final void y(@NonNull Drawable drawable, @Nullable View view, int i11, int i12) {
        if (o() && view != null && this.f30484m) {
            i12 = view.getBottom();
        }
        drawable.setBounds(0, 0, i11, i12);
    }

    public final void z() {
        View view;
        if (!this.f30484m && (view = this.f30476e) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f30476e);
            }
        }
        if (!this.f30484m || this.f30474c == null) {
            return;
        }
        if (this.f30476e == null) {
            this.f30476e = new View(getContext());
        }
        if (this.f30476e.getParent() == null) {
            this.f30474c.addView(this.f30476e, -1, -1);
        }
    }

    public CollapsingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.collapsingToolbarLayoutStyle);
    }

    public void setCollapsedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f30482k.k0(colorStateList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CollapsingToolbarLayout(@androidx.annotation.NonNull android.content.Context r10, @androidx.annotation.Nullable android.util.AttributeSet r11, int r12) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends FrameLayout.LayoutParams {

        /* renamed from: c, reason: collision with root package name */
        public static final float f30500c = 0.5f;

        /* renamed from: d, reason: collision with root package name */
        public static final int f30501d = 0;

        /* renamed from: e, reason: collision with root package name */
        public static final int f30502e = 1;

        /* renamed from: f, reason: collision with root package name */
        public static final int f30503f = 2;

        /* renamed from: a, reason: collision with root package name */
        public int f30504a;

        /* renamed from: b, reason: collision with root package name */
        public float f30505b;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f30504a = 0;
            this.f30505b = 0.5f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CollapsingToolbarLayout_Layout);
            this.f30504a = obtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            d(obtainStyledAttributes.getFloat(R.styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            obtainStyledAttributes.recycle();
        }

        public int a() {
            return this.f30504a;
        }

        public float b() {
            return this.f30505b;
        }

        public void c(int i11) {
            this.f30504a = i11;
        }

        public void d(float f11) {
            this.f30505b = f11;
        }

        public c(int i11, int i12) {
            super(i11, i12);
            this.f30504a = 0;
            this.f30505b = 0.5f;
        }

        public c(int i11, int i12, int i13) {
            super(i11, i12, i13);
            this.f30504a = 0;
            this.f30505b = 0.5f;
        }

        public c(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f30504a = 0;
            this.f30505b = 0.5f;
        }

        public c(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f30504a = 0;
            this.f30505b = 0.5f;
        }

        @RequiresApi(19)
        public c(@NonNull FrameLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f30504a = 0;
            this.f30505b = 0.5f;
        }

        @RequiresApi(19)
        public c(@NonNull c cVar) {
            super((FrameLayout.LayoutParams) cVar);
            this.f30504a = 0;
            this.f30505b = 0.5f;
            this.f30504a = cVar.f30504a;
            this.f30505b = cVar.f30505b;
        }
    }
}
