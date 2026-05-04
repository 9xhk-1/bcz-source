package com.google.android.material.search;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class SearchBar extends Toolbar {

    /* renamed from: p, reason: collision with root package name */
    public static final int f31882p = R.style.Widget_Material3_SearchBar;

    /* renamed from: q, reason: collision with root package name */
    public static final int f31883q = 53;

    /* renamed from: r, reason: collision with root package name */
    public static final String f31884r = "http://schemas.android.com/apk/res-auto";

    /* renamed from: a, reason: collision with root package name */
    public final TextView f31885a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f31886b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f31887c;

    /* renamed from: d, reason: collision with root package name */
    public final j f31888d;

    /* renamed from: e, reason: collision with root package name */
    public final Drawable f31889e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f31890f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f31891g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public View f31892h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public Integer f31893i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public Drawable f31894j;

    /* renamed from: k, reason: collision with root package name */
    public int f31895k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f31896l;

    /* renamed from: m, reason: collision with root package name */
    public vn.k f31897m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public final AccessibilityManager f31898n;

    /* renamed from: o, reason: collision with root package name */
    public final AccessibilityManagerCompat.TouchExplorationStateChangeListener f31899o;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public String f31900a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeString(this.f31900a);
        }

        public SavedState(Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f31900a = parcel.readString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            AccessibilityManagerCompat.addTouchExplorationStateChangeListener(SearchBar.this.f31898n, SearchBar.this.f31899o);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            AccessibilityManagerCompat.removeTouchExplorationStateChangeListener(SearchBar.this.f31898n, SearchBar.this.f31899o);
        }
    }

    public SearchBar(@NonNull Context context) {
        this(context, null);
    }

    private void setNavigationIconDecorative(boolean z11) {
        ImageButton e11 = com.google.android.material.internal.e0.e(this);
        if (e11 == null) {
            return;
        }
        e11.setClickable(!z11);
        e11.setFocusable(!z11);
        Drawable background = e11.getBackground();
        if (background != null) {
            this.f31894j = background;
        }
        e11.setBackgroundDrawable(z11 ? null : this.f31894j);
        F();
    }

    @Nullable
    private Drawable z(@Nullable Drawable drawable) {
        int d11;
        if (!this.f31890f || drawable == null) {
            return drawable;
        }
        Integer num = this.f31893i;
        if (num != null) {
            d11 = num.intValue();
        } else {
            d11 = en.u.d(this, drawable == this.f31889e ? R.attr.colorOnSurfaceVariant : R.attr.colorOnSurface);
        }
        Drawable wrap = DrawableCompat.wrap(drawable.mutate());
        DrawableCompat.setTint(wrap, d11);
        return wrap;
    }

    public final void A(int i11, int i12) {
        View view = this.f31892h;
        if (view != null) {
            view.measure(i11, i12);
        }
    }

    public boolean B(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        return this.f31888d.A(animatorListenerAdapter);
    }

    public boolean C(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        return this.f31888d.B(animatorListenerAdapter);
    }

    public boolean D(@NonNull b bVar) {
        return this.f31888d.C(bVar);
    }

    public final void E() {
        if (this.f31887c && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(getDefaultMarginVerticalResource());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = l(marginLayoutParams.leftMargin, dimensionPixelSize);
            marginLayoutParams.topMargin = l(marginLayoutParams.topMargin, dimensionPixelSize2);
            marginLayoutParams.rightMargin = l(marginLayoutParams.rightMargin, dimensionPixelSize);
            marginLayoutParams.bottomMargin = l(marginLayoutParams.bottomMargin, dimensionPixelSize2);
        }
    }

    public final void F() {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        boolean z11 = getLayoutDirection() == 1;
        ImageButton e11 = com.google.android.material.internal.e0.e(this);
        int width = (e11 == null || !e11.isClickable()) ? 0 : z11 ? getWidth() - e11.getLeft() : e11.getRight();
        ActionMenuView b11 = com.google.android.material.internal.e0.b(this);
        int right = b11 != null ? z11 ? b11.getRight() : getWidth() - b11.getLeft() : 0;
        float f11 = -(z11 ? right : width);
        if (!z11) {
            width = right;
        }
        setHandwritingBoundsOffsets(f11, 0.0f, -width, 0.0f);
    }

    public final void G() {
        if (getLayoutParams() instanceof AppBarLayout.e) {
            AppBarLayout.e eVar = (AppBarLayout.e) getLayoutParams();
            if (this.f31896l) {
                if (eVar.c() == 0) {
                    eVar.h(53);
                }
            } else if (eVar.c() == 53) {
                eVar.h(0);
            }
        }
    }

    public final void H() {
        AccessibilityManager accessibilityManager = this.f31898n;
        if (accessibilityManager != null) {
            if (accessibilityManager.isEnabled() && this.f31898n.isTouchExplorationEnabled()) {
                setFocusableInTouchMode(true);
            }
            addOnAttachStateChangeListener(new a());
        }
    }

    public void I() {
        post(new Runnable() { // from class: com.google.android.material.search.b
            @Override // java.lang.Runnable
            public final void run() {
                r0.f31888d.G(SearchBar.this);
            }
        });
    }

    public void J() {
        this.f31888d.H(this);
    }

    public final void K(@Nullable AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "title") != null) {
            throw new UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "subtitle") != null) {
            throw new UnsupportedOperationException("SearchBar does not support subtitle. Use hint or text instead.");
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (this.f31886b && this.f31892h == null && !(view instanceof ActionMenuView)) {
            this.f31892h = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i11, layoutParams);
    }

    public void e(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        this.f31888d.h(animatorListenerAdapter);
    }

    public void f(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        this.f31888d.i(animatorListenerAdapter);
    }

    public void g(@NonNull b bVar) {
        this.f31888d.j(bVar);
    }

    @Nullable
    public View getCenterView() {
        return this.f31892h;
    }

    public float getCompatElevation() {
        vn.k kVar = this.f31897m;
        return kVar != null ? kVar.y() : ViewCompat.getElevation(this);
    }

    public float getCornerSize() {
        return this.f31897m.T();
    }

    @DimenRes
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getDefaultMarginVerticalResource() {
        return R.dimen.m3_searchbar_margin_vertical;
    }

    @DrawableRes
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getDefaultNavigationIconResource() {
        return R.drawable.ic_search_black_24;
    }

    @Nullable
    public CharSequence getHint() {
        return this.f31885a.getHint();
    }

    public int getMenuResId() {
        return this.f31895k;
    }

    @ColorInt
    public int getStrokeColor() {
        return this.f31897m.O().getDefaultColor();
    }

    @Dimension
    public float getStrokeWidth() {
        return this.f31897m.R();
    }

    @NonNull
    public CharSequence getText() {
        return this.f31885a.getText();
    }

    @NonNull
    public TextView getTextView() {
        return this.f31885a;
    }

    public void h() {
        this.f31885a.setText("");
    }

    @uo.a
    public boolean i(@NonNull View view) {
        return j(view, null);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void inflateMenu(@MenuRes int i11) {
        Menu menu = getMenu();
        boolean z11 = menu instanceof MenuBuilder;
        if (z11) {
            ((MenuBuilder) menu).stopDispatchingItemsChanged();
        }
        super.inflateMenu(i11);
        this.f31895k = i11;
        if (z11) {
            ((MenuBuilder) menu).startDispatchingItemsChanged();
        }
    }

    @uo.a
    public boolean j(@NonNull View view, @Nullable AppBarLayout appBarLayout) {
        return k(view, appBarLayout, false);
    }

    @uo.a
    public boolean k(@NonNull View view, @Nullable AppBarLayout appBarLayout, boolean z11) {
        if ((view.getVisibility() != 0 || t()) && !v()) {
            return false;
        }
        this.f31888d.E(this, view, appBarLayout, z11);
        return true;
    }

    public final int l(int i11, int i12) {
        return i11 == 0 ? i12 : i11;
    }

    @uo.a
    public boolean m(@NonNull View view) {
        return n(view, null);
    }

    @uo.a
    public boolean n(@NonNull View view, @Nullable AppBarLayout appBarLayout) {
        return o(view, appBarLayout, false);
    }

    @uo.a
    public boolean o(@NonNull View view, @Nullable AppBarLayout appBarLayout, boolean z11) {
        if ((view.getVisibility() == 0 || v()) && !t()) {
            return false;
        }
        this.f31888d.F(this, view, appBarLayout, z11);
        return true;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        vn.l.f(this, this.f31897m);
        E();
        G();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        int i11 = Build.VERSION.SDK_INT;
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence text = getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        if (i11 >= 26) {
            accessibilityNodeInfo.setHintText(getHint());
            accessibilityNodeInfo.setShowingHintText(isEmpty);
        }
        if (isEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        x();
        F();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        A(i11, i12);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setText(savedState.f31900a);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        CharSequence text = getText();
        savedState.f31900a = text == null ? null : text.toString();
        return savedState;
    }

    public final ColorStateList p(@ColorInt int i11, @ColorInt int i12) {
        int[][] iArr = {new int[]{android.R.attr.state_pressed}, new int[]{android.R.attr.state_focused}, new int[0]};
        int s11 = en.u.s(i11, i12);
        return new ColorStateList(iArr, new int[]{s11, s11, i11});
    }

    public final void q(vn.p pVar, @ColorInt int i11, float f11, float f12, @ColorInt int i12) {
        vn.k kVar = new vn.k(pVar);
        this.f31897m = kVar;
        kVar.a0(getContext());
        this.f31897m.o0(f11);
        if (f12 >= 0.0f) {
            this.f31897m.E0(f12, i12);
        }
        int d11 = en.u.d(this, R.attr.colorControlHighlight);
        this.f31897m.p0(ColorStateList.valueOf(i11));
        ColorStateList valueOf = ColorStateList.valueOf(d11);
        vn.k kVar2 = this.f31897m;
        ViewCompat.setBackground(this, new RippleDrawable(valueOf, kVar2, kVar2));
    }

    public final void r() {
        setNavigationIcon(getNavigationIcon() == null ? this.f31889e : getNavigationIcon());
        setNavigationIconDecorative(true);
    }

    public final void s(@StyleRes int i11, String str, String str2) {
        if (i11 != -1) {
            TextViewCompat.setTextAppearance(this.f31885a, i11);
        }
        setText(str);
        setHint(str2);
        if (getNavigationIcon() == null) {
            MarginLayoutParamsCompat.setMarginStart((ViewGroup.MarginLayoutParams) this.f31885a.getLayoutParams(), getResources().getDimensionPixelSize(R.dimen.m3_searchbar_text_margin_start_no_navigation_icon));
        }
    }

    public void setCenterView(@Nullable View view) {
        View view2 = this.f31892h;
        if (view2 != null) {
            removeView(view2);
            this.f31892h = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z11) {
        this.f31896l = z11;
        G();
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f11) {
        super.setElevation(f11);
        vn.k kVar = this.f31897m;
        if (kVar != null) {
            kVar.o0(f11);
        }
    }

    public void setHint(@Nullable CharSequence charSequence) {
        this.f31885a.setHint(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        super.setNavigationIcon(z(drawable));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (this.f31891g) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z11) {
        this.f31888d.D(z11);
    }

    public void setStrokeColor(@ColorInt int i11) {
        if (getStrokeColor() != i11) {
            this.f31897m.G0(ColorStateList.valueOf(i11));
        }
    }

    public void setStrokeWidth(@Dimension float f11) {
        if (getStrokeWidth() != f11) {
            this.f31897m.J0(f11);
        }
    }

    public void setText(@Nullable CharSequence charSequence) {
        this.f31885a.setText(charSequence);
    }

    public boolean t() {
        return this.f31888d.x();
    }

    public boolean u() {
        return this.f31896l;
    }

    public boolean v() {
        return this.f31888d.y();
    }

    public boolean w() {
        return this.f31888d.z();
    }

    public final void x() {
        View view = this.f31892h;
        if (view == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
        int i11 = measuredWidth2 + measuredWidth;
        int measuredHeight = this.f31892h.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
        y(this.f31892h, measuredWidth2, measuredHeight2, i11, measuredHeight2 + measuredHeight);
    }

    public final void y(View view, int i11, int i12, int i13, int i14) {
        if (ViewCompat.getLayoutDirection(this) == 1) {
            view.layout(getMeasuredWidth() - i13, i12, getMeasuredWidth() - i11, i14);
        } else {
            view.layout(i11, i12, i13, i14);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* renamed from: h, reason: collision with root package name */
        public boolean f31901h;

        public ScrollingViewBehavior() {
            this.f31901h = false;
        }

        public final void D(AppBarLayout appBarLayout) {
            appBarLayout.setBackgroundColor(0);
            appBarLayout.setTargetElevation(0.0f);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            boolean onDependentViewChanged = super.onDependentViewChanged(coordinatorLayout, view, view2);
            if (!this.f31901h && (view2 instanceof AppBarLayout)) {
                this.f31901h = true;
                D((AppBarLayout) view2);
            }
            return onDependentViewChanged;
        }

        @Override // wm.e
        public boolean y() {
            return true;
        }

        public ScrollingViewBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f31901h = false;
        }
    }

    public SearchBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchBarStyle);
    }

    public void setHint(@StringRes int i11) {
        this.f31885a.setHint(i11);
    }

    public void setText(@StringRes int i11) {
        this.f31885a.setText(i11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SearchBar(@androidx.annotation.NonNull android.content.Context r14, @androidx.annotation.Nullable android.util.AttributeSet r15, int r16) {
        /*
            r13 = this;
            r3 = r16
            int r4 = com.google.android.material.search.SearchBar.f31882p
            android.content.Context r14 = zn.a.c(r14, r15, r3, r4)
            r13.<init>(r14, r15, r3)
            r14 = -1
            r13.f31895k = r14
            com.google.android.material.search.c r0 = new com.google.android.material.search.c
            r0.<init>()
            r13.f31899o = r0
            android.content.Context r0 = r13.getContext()
            r13.K(r15)
            int r2 = r13.getDefaultNavigationIconResource()
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            r13.f31889e = r2
            com.google.android.material.search.j r2 = new com.google.android.material.search.j
            r2.<init>()
            r13.f31888d = r2
            int[] r2 = com.google.android.material.R.styleable.SearchBar
            r6 = 0
            int[] r5 = new int[r6]
            r1 = r15
            android.content.res.TypedArray r2 = com.google.android.material.internal.d0.k(r0, r1, r2, r3, r4, r5)
            vn.p$b r1 = vn.p.e(r0, r15, r3, r4)
            vn.p r8 = r1.m()
            int r1 = com.google.android.material.R.styleable.SearchBar_backgroundTint
            int r9 = r2.getColor(r1, r6)
            int r1 = com.google.android.material.R.styleable.SearchBar_elevation
            r3 = 0
            float r10 = r2.getDimension(r1, r3)
            int r1 = com.google.android.material.R.styleable.SearchBar_defaultMarginsEnabled
            r3 = 1
            boolean r1 = r2.getBoolean(r1, r3)
            r13.f31887c = r1
            int r1 = com.google.android.material.R.styleable.SearchBar_defaultScrollFlagsEnabled
            boolean r1 = r2.getBoolean(r1, r3)
            r13.f31896l = r1
            int r1 = com.google.android.material.R.styleable.SearchBar_hideNavigationIcon
            boolean r1 = r2.getBoolean(r1, r6)
            int r4 = com.google.android.material.R.styleable.SearchBar_forceDefaultNavigationOnClickListener
            boolean r4 = r2.getBoolean(r4, r6)
            r13.f31891g = r4
            int r4 = com.google.android.material.R.styleable.SearchBar_tintNavigationIcon
            boolean r4 = r2.getBoolean(r4, r3)
            r13.f31890f = r4
            int r4 = com.google.android.material.R.styleable.SearchBar_navigationIconTint
            boolean r5 = r2.hasValue(r4)
            if (r5 == 0) goto L85
            int r4 = r2.getColor(r4, r14)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r13.f31893i = r4
        L85:
            int r4 = com.google.android.material.R.styleable.SearchBar_android_textAppearance
            int r14 = r2.getResourceId(r4, r14)
            int r4 = com.google.android.material.R.styleable.SearchBar_android_text
            java.lang.String r4 = r2.getString(r4)
            int r5 = com.google.android.material.R.styleable.SearchBar_android_hint
            java.lang.String r5 = r2.getString(r5)
            int r7 = com.google.android.material.R.styleable.SearchBar_strokeWidth
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r11 = r2.getDimension(r7, r11)
            int r7 = com.google.android.material.R.styleable.SearchBar_strokeColor
            int r12 = r2.getColor(r7, r6)
            r2.recycle()
            if (r1 != 0) goto Lad
            r13.r()
        Lad:
            r13.setClickable(r3)
            r13.setFocusable(r3)
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = com.google.android.material.R.layout.mtrl_search_bar
            r0.inflate(r1, r13)
            r13.f31886b = r3
            int r0 = com.google.android.material.R.id.open_search_bar_text_view
            android.view.View r0 = r13.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r13.f31885a = r0
            androidx.core.view.ViewCompat.setElevation(r13, r10)
            r13.s(r14, r4, r5)
            r7 = r13
            r7.q(r8, r9, r10, r11, r12)
            android.content.Context r14 = r13.getContext()
            java.lang.String r0 = "accessibility"
            java.lang.Object r14 = r14.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r14 = (android.view.accessibility.AccessibilityManager) r14
            r13.f31898n = r14
            r13.H()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.search.SearchBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class b {
        public void a() {
        }

        public void b() {
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
