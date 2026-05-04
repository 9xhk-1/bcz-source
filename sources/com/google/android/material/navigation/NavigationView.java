package com.google.android.material.navigation;

import an.a;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.activity.BackEventCompat;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.n0;
import com.google.android.material.internal.s;
import com.google.android.material.internal.t;
import java.util.Objects;
import pn.i;
import vn.k;
import vn.l;
import vn.p;
import vn.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class NavigationView extends ScrimInsetsFrameLayout implements pn.b {
    public static final int A = 1;

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f31798x = {R.attr.state_checked};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f31799y = {-16842910};

    /* renamed from: z, reason: collision with root package name */
    public static final int f31800z = com.google.android.material.R.style.Widget_Design_NavigationView;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final s f31801h;

    /* renamed from: i, reason: collision with root package name */
    public final t f31802i;

    /* renamed from: j, reason: collision with root package name */
    public d f31803j;

    /* renamed from: k, reason: collision with root package name */
    public final int f31804k;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f31805l;

    /* renamed from: m, reason: collision with root package name */
    public MenuInflater f31806m;

    /* renamed from: n, reason: collision with root package name */
    public ViewTreeObserver.OnGlobalLayoutListener f31807n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f31808o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f31809p;

    /* renamed from: q, reason: collision with root package name */
    @Px
    public int f31810q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f31811r;

    /* renamed from: s, reason: collision with root package name */
    @Px
    public final int f31812s;

    /* renamed from: t, reason: collision with root package name */
    public final u f31813t;

    /* renamed from: u, reason: collision with root package name */
    public final i f31814u;

    /* renamed from: v, reason: collision with root package name */
    public final pn.c f31815v;

    /* renamed from: w, reason: collision with root package name */
    public final DrawerLayout.DrawerListener f31816w;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends DrawerLayout.SimpleDrawerListener {
        public a() {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.SimpleDrawerListener, androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerClosed(@NonNull View view) {
            NavigationView navigationView = NavigationView.this;
            if (view == navigationView) {
                navigationView.f31815v.f();
                NavigationView.this.x();
            }
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.SimpleDrawerListener, androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerOpened(@NonNull View view) {
            NavigationView navigationView = NavigationView.this;
            if (view == navigationView) {
                final pn.c cVar = navigationView.f31815v;
                Objects.requireNonNull(cVar);
                view.post(new Runnable() { // from class: com.google.android.material.navigation.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        pn.c.this.e();
                    }
                });
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements ViewTreeObserver.OnGlobalLayoutListener {
        public c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.f31805l);
            boolean z11 = true;
            boolean z12 = NavigationView.this.f31805l[1] == 0;
            NavigationView.this.f31802i.v(z12);
            NavigationView navigationView2 = NavigationView.this;
            navigationView2.setDrawTopInsetForeground(z12 && navigationView2.w());
            NavigationView.this.setDrawLeftInsetForeground(NavigationView.this.f31805l[0] == 0 || NavigationView.this.f31805l[0] + NavigationView.this.getWidth() == 0);
            Activity a11 = com.google.android.material.internal.c.a(NavigationView.this.getContext());
            if (a11 != null) {
                Rect b11 = n0.b(a11);
                boolean z13 = b11.height() - NavigationView.this.getHeight() == NavigationView.this.f31805l[1];
                boolean z14 = Color.alpha(a11.getWindow().getNavigationBarColor()) != 0;
                NavigationView navigationView3 = NavigationView.this;
                navigationView3.setDrawBottomInsetForeground(z13 && z14 && navigationView3.v());
                if (b11.width() != NavigationView.this.f31805l[0] && b11.width() - NavigationView.this.getWidth() != NavigationView.this.f31805l[0]) {
                    z11 = false;
                }
                NavigationView.this.setDrawRightInsetForeground(z11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d {
        boolean a(@NonNull MenuItem menuItem);
    }

    public NavigationView(@NonNull Context context) {
        this(context, null);
    }

    private MenuInflater getMenuInflater() {
        if (this.f31806m == null) {
            this.f31806m = new SupportMenuInflater(getContext());
        }
        return this.f31806m;
    }

    @Nullable
    private ColorStateList o(int i11) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i11, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = AppCompatResources.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(androidx.appcompat.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i12 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = f31799y;
        return new ColorStateList(new int[][]{iArr, f31798x, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i12, defaultColor});
    }

    @uo.a
    public final Pair<DrawerLayout, DrawerLayout.LayoutParams> A() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof DrawerLayout.LayoutParams)) {
            return new Pair<>((DrawerLayout) parent, (DrawerLayout.LayoutParams) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    public final void B() {
        this.f31807n = new c();
        getViewTreeObserver().addOnGlobalLayoutListener(this.f31807n);
    }

    @Override // pn.b
    public void b(@NonNull BackEventCompat backEventCompat) {
        A();
        this.f31814u.j(backEventCompat);
    }

    @Override // pn.b
    public void c(@NonNull BackEventCompat backEventCompat) {
        this.f31814u.l(backEventCompat, ((DrawerLayout.LayoutParams) A().second).gravity);
        if (this.f31811r) {
            this.f31810q = vm.b.c(0, this.f31812s, this.f31814u.a(backEventCompat.getProgress()));
            y(getWidth(), getHeight());
        }
    }

    @Override // pn.b
    public void d() {
        Pair<DrawerLayout, DrawerLayout.LayoutParams> A2 = A();
        DrawerLayout drawerLayout = (DrawerLayout) A2.first;
        BackEventCompat c11 = this.f31814u.c();
        if (c11 == null || Build.VERSION.SDK_INT < 34) {
            drawerLayout.closeDrawer(this);
            return;
        }
        this.f31814u.h(c11, ((DrawerLayout.LayoutParams) A2.second).gravity, com.google.android.material.navigation.b.b(drawerLayout, this), com.google.android.material.navigation.b.c(drawerLayout));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        this.f31813t.e(canvas, new a.InterfaceC0022a() { // from class: com.google.android.material.navigation.e
            @Override // an.a.InterfaceC0022a
            public final void a(Canvas canvas2) {
                super/*android.view.View*/.dispatchDraw(canvas2);
            }
        });
    }

    @Override // pn.b
    public void f() {
        A();
        this.f31814u.f();
        x();
    }

    @VisibleForTesting
    public i getBackHelper() {
        return this.f31814u;
    }

    @Nullable
    public MenuItem getCheckedItem() {
        return this.f31802i.d();
    }

    @Px
    public int getDividerInsetEnd() {
        return this.f31802i.e();
    }

    @Px
    public int getDividerInsetStart() {
        return this.f31802i.f();
    }

    public int getHeaderCount() {
        return this.f31802i.g();
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.f31802i.i();
    }

    @Dimension
    public int getItemHorizontalPadding() {
        return this.f31802i.j();
    }

    @Dimension
    public int getItemIconPadding() {
        return this.f31802i.k();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.f31802i.n();
    }

    public int getItemMaxLines() {
        return this.f31802i.l();
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.f31802i.m();
    }

    @Px
    public int getItemVerticalPadding() {
        return this.f31802i.o();
    }

    @NonNull
    public Menu getMenu() {
        return this.f31801h;
    }

    @Px
    public int getSubheaderInsetEnd() {
        return this.f31802i.p();
    }

    @Px
    public int getSubheaderInsetStart() {
        return this.f31802i.q();
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void h(@NonNull WindowInsetsCompat windowInsetsCompat) {
        this.f31802i.c(windowInsetsCompat);
    }

    public void n(@NonNull View view) {
        this.f31802i.b(view);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        l.e(this);
        ViewParent parent = getParent();
        if ((parent instanceof DrawerLayout) && this.f31815v.b()) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            drawerLayout.removeDrawerListener(this.f31816w);
            drawerLayout.addDrawerListener(this.f31816w);
            if (drawerLayout.isDrawerOpen(this)) {
                this.f31815v.e();
            }
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f31807n);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            ((DrawerLayout) parent).removeDrawerListener(this.f31816w);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        if (mode == Integer.MIN_VALUE) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), this.f31804k), 1073741824);
        } else if (mode == 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(this.f31804k, 1073741824);
        }
        super.onMeasure(i11, i12);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f31801h.restorePresenterStates(savedState.f31817a);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f31817a = bundle;
        this.f31801h.savePresenterStates(bundle);
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        y(i11, i12);
    }

    @NonNull
    public final Drawable p(@NonNull TintTypedArray tintTypedArray) {
        return q(tintTypedArray, sn.c.b(getContext(), tintTypedArray, com.google.android.material.R.styleable.NavigationView_itemShapeFillColor));
    }

    @NonNull
    public final Drawable q(@NonNull TintTypedArray tintTypedArray, @Nullable ColorStateList colorStateList) {
        k kVar = new k(p.b(getContext(), tintTypedArray.getResourceId(com.google.android.material.R.styleable.NavigationView_itemShapeAppearance, 0), tintTypedArray.getResourceId(com.google.android.material.R.styleable.NavigationView_itemShapeAppearanceOverlay, 0)).m());
        kVar.p0(colorStateList);
        return new InsetDrawable((Drawable) kVar, tintTypedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemShapeInsetStart, 0), tintTypedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemShapeInsetTop, 0), tintTypedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemShapeInsetEnd, 0), tintTypedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemShapeInsetBottom, 0));
    }

    public View r(int i11) {
        return this.f31802i.h(i11);
    }

    public final boolean s(@NonNull TintTypedArray tintTypedArray) {
        return tintTypedArray.hasValue(com.google.android.material.R.styleable.NavigationView_itemShapeAppearance) || tintTypedArray.hasValue(com.google.android.material.R.styleable.NavigationView_itemShapeAppearanceOverlay);
    }

    public void setBottomInsetScrimEnabled(boolean z11) {
        this.f31809p = z11;
    }

    public void setCheckedItem(@IdRes int i11) {
        MenuItem findItem = this.f31801h.findItem(i11);
        if (findItem != null) {
            this.f31802i.w((MenuItemImpl) findItem);
        }
    }

    public void setDividerInsetEnd(@Px int i11) {
        this.f31802i.x(i11);
    }

    public void setDividerInsetStart(@Px int i11) {
        this.f31802i.y(i11);
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        l.d(this, f11);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setForceCompatClippingEnabled(boolean z11) {
        this.f31813t.h(this, z11);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.f31802i.A(drawable);
    }

    public void setItemBackgroundResource(@DrawableRes int i11) {
        setItemBackground(ContextCompat.getDrawable(getContext(), i11));
    }

    public void setItemHorizontalPadding(@Dimension int i11) {
        this.f31802i.C(i11);
    }

    public void setItemHorizontalPaddingResource(@DimenRes int i11) {
        this.f31802i.C(getResources().getDimensionPixelSize(i11));
    }

    public void setItemIconPadding(@Dimension int i11) {
        this.f31802i.D(i11);
    }

    public void setItemIconPaddingResource(int i11) {
        this.f31802i.D(getResources().getDimensionPixelSize(i11));
    }

    public void setItemIconSize(@Dimension int i11) {
        this.f31802i.E(i11);
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.f31802i.F(colorStateList);
    }

    public void setItemMaxLines(int i11) {
        this.f31802i.G(i11);
    }

    public void setItemTextAppearance(@StyleRes int i11) {
        this.f31802i.H(i11);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z11) {
        this.f31802i.I(z11);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.f31802i.J(colorStateList);
    }

    public void setItemVerticalPadding(@Px int i11) {
        this.f31802i.K(i11);
    }

    public void setItemVerticalPaddingResource(@DimenRes int i11) {
        this.f31802i.K(getResources().getDimensionPixelSize(i11));
    }

    public void setNavigationItemSelectedListener(@Nullable d dVar) {
        this.f31803j = dVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i11) {
        super.setOverScrollMode(i11);
        t tVar = this.f31802i;
        if (tVar != null) {
            tVar.L(i11);
        }
    }

    public void setSubheaderInsetEnd(@Px int i11) {
        this.f31802i.N(i11);
    }

    public void setSubheaderInsetStart(@Px int i11) {
        this.f31802i.O(i11);
    }

    public void setTopInsetScrimEnabled(boolean z11) {
        this.f31808o = z11;
    }

    public View t(@LayoutRes int i11) {
        return this.f31802i.s(i11);
    }

    public void u(int i11) {
        this.f31802i.Q(true);
        getMenuInflater().inflate(i11, this.f31801h);
        this.f31802i.Q(false);
        this.f31802i.updateMenuView(false);
    }

    public boolean v() {
        return this.f31809p;
    }

    public boolean w() {
        return this.f31808o;
    }

    public final void x() {
        if (!this.f31811r || this.f31810q == 0) {
            return;
        }
        this.f31810q = 0;
        y(getWidth(), getHeight());
    }

    public final void y(@Px int i11, @Px int i12) {
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof DrawerLayout.LayoutParams)) {
            if ((this.f31810q > 0 || this.f31811r) && (getBackground() instanceof k)) {
                boolean z11 = GravityCompat.getAbsoluteGravity(((DrawerLayout.LayoutParams) getLayoutParams()).gravity, ViewCompat.getLayoutDirection(this)) == 3;
                k kVar = (k) getBackground();
                p.b o11 = kVar.getShapeAppearanceModel().v().o(this.f31810q);
                if (z11) {
                    o11.K(0.0f);
                    o11.x(0.0f);
                } else {
                    o11.P(0.0f);
                    o11.C(0.0f);
                }
                p m11 = o11.m();
                kVar.setShapeAppearanceModel(m11);
                this.f31813t.g(this, m11);
                this.f31813t.f(this, new RectF(0.0f, 0.0f, i11, i12));
                this.f31813t.i(this, true);
            }
        }
    }

    public void z(@NonNull View view) {
        this.f31802i.u(view);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        public Bundle f31817a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            @Nullable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        public SavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f31817a = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeBundle(this.f31817a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.navigationViewStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NavigationView(@androidx.annotation.NonNull android.content.Context r17, @androidx.annotation.Nullable android.util.AttributeSet r18, int r19) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCheckedItem(@NonNull MenuItem menuItem) {
        MenuItem findItem = this.f31801h.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f31802i.w((MenuItemImpl) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements MenuBuilder.Callback {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
            d dVar = NavigationView.this.f31803j;
            return dVar != null && dVar.a(menuItem);
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public void onMenuModeChange(MenuBuilder menuBuilder) {
        }
    }
}
