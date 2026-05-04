package com.google.android.material.search;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.activity.BackEventCompat;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.m0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import zb.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class SearchView extends FrameLayout implements CoordinatorLayout.AttachedBehavior, pn.b {
    public static final long D = 100;
    public static final int E = R.style.Widget_Material3_SearchView;
    public boolean A;

    @NonNull
    public TransitionState B;
    public Map<View, Integer> C;

    /* renamed from: a, reason: collision with root package name */
    public final View f31903a;

    /* renamed from: b, reason: collision with root package name */
    public final ClippableRoundedCornerLayout f31904b;

    /* renamed from: c, reason: collision with root package name */
    public final View f31905c;

    /* renamed from: d, reason: collision with root package name */
    public final View f31906d;

    /* renamed from: e, reason: collision with root package name */
    public final FrameLayout f31907e;

    /* renamed from: f, reason: collision with root package name */
    public final FrameLayout f31908f;

    /* renamed from: g, reason: collision with root package name */
    public final MaterialToolbar f31909g;

    /* renamed from: h, reason: collision with root package name */
    public final Toolbar f31910h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f31911i;

    /* renamed from: j, reason: collision with root package name */
    public final EditText f31912j;

    /* renamed from: k, reason: collision with root package name */
    public final ImageButton f31913k;

    /* renamed from: l, reason: collision with root package name */
    public final View f31914l;

    /* renamed from: m, reason: collision with root package name */
    public final TouchObserverFrameLayout f31915m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f31916n;

    /* renamed from: o, reason: collision with root package name */
    public final g0 f31917o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final pn.c f31918p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f31919q;

    /* renamed from: r, reason: collision with root package name */
    public final ln.a f31920r;

    /* renamed from: s, reason: collision with root package name */
    public final Set<b> f31921s;

    /* renamed from: t, reason: collision with root package name */
    @Nullable
    public SearchBar f31922t;

    /* renamed from: u, reason: collision with root package name */
    public int f31923u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f31924v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f31925w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f31926x;

    /* renamed from: y, reason: collision with root package name */
    @ColorInt
    public final int f31927y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f31928z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Behavior extends CoordinatorLayout.Behavior<SearchView> {
        public Behavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull SearchView searchView, @NonNull View view) {
            if (searchView.D() || !(view instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view);
            return false;
        }

        public Behavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public String f31929a;

        /* renamed from: b, reason: collision with root package name */
        public int f31930b;

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
            parcel.writeString(this.f31929a);
            parcel.writeInt(this.f31930b);
        }

        public SavedState(Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f31929a = parcel.readString();
            this.f31930b = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum TransitionState {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void a(@NonNull SearchView searchView, @NonNull TransitionState transitionState, @NonNull TransitionState transitionState2);
    }

    public SearchView(@NonNull Context context) {
        this(context, null);
    }

    @Nullable
    private Window getActivityWindow() {
        Activity a11 = com.google.android.material.internal.c.a(getContext());
        if (a11 == null) {
            return null;
        }
        return a11.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.f31922t;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(R.dimen.m3_searchview_elevation);
    }

    @Px
    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier(b.C1392b.f102487j, "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static /* synthetic */ WindowInsetsCompat i(ViewGroup.MarginLayoutParams marginLayoutParams, int i11, int i12, View view, WindowInsetsCompat windowInsetsCompat) {
        marginLayoutParams.leftMargin = i11 + windowInsetsCompat.getSystemWindowInsetLeft();
        marginLayoutParams.rightMargin = i12 + windowInsetsCompat.getSystemWindowInsetRight();
        return windowInsetsCompat;
    }

    public static /* synthetic */ boolean j(SearchView searchView, View view, MotionEvent motionEvent) {
        if (!searchView.x()) {
            return false;
        }
        searchView.t();
        return false;
    }

    public static /* synthetic */ void k(SearchView searchView) {
        searchView.f31912j.clearFocus();
        SearchBar searchBar = searchView.f31922t;
        if (searchBar != null) {
            searchBar.requestFocus();
        }
        m0.r(searchView.f31912j, searchView.f31928z);
    }

    public static /* synthetic */ void l(SearchView searchView) {
        if (searchView.f31912j.requestFocus()) {
            searchView.f31912j.sendAccessibilityEvent(8);
        }
        m0.B(searchView.f31912j, searchView.f31928z);
    }

    public static /* synthetic */ void m(SearchView searchView, View view) {
        searchView.u();
        searchView.K();
    }

    public static /* synthetic */ WindowInsetsCompat n(SearchView searchView, View view, WindowInsetsCompat windowInsetsCompat, m0.e eVar) {
        boolean s11 = m0.s(searchView.f31909g);
        searchView.f31909g.setPadding((s11 ? eVar.f31620c : eVar.f31618a) + windowInsetsCompat.getSystemWindowInsetLeft(), eVar.f31619b, (s11 ? eVar.f31618a : eVar.f31620c) + windowInsetsCompat.getSystemWindowInsetRight(), eVar.f31621d);
        return windowInsetsCompat;
    }

    public static /* synthetic */ WindowInsetsCompat o(SearchView searchView, View view, WindowInsetsCompat windowInsetsCompat) {
        searchView.getClass();
        int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
        searchView.setUpStatusBarSpacer(systemWindowInsetTop);
        if (!searchView.A) {
            searchView.setStatusBarSpacerEnabledInternal(systemWindowInsetTop > 0);
        }
        return windowInsetsCompat;
    }

    public static /* synthetic */ boolean p(View view, MotionEvent motionEvent) {
        return true;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z11) {
        this.f31906d.setVisibility(z11 ? 0 : 8);
    }

    private void setUpBackgroundViewElevationOverlay(float f11) {
        ln.a aVar = this.f31920r;
        if (aVar == null || this.f31905c == null) {
            return;
        }
        this.f31905c.setBackgroundColor(aVar.e(this.f31927y, f11));
    }

    private void setUpHeaderLayout(int i11) {
        if (i11 != -1) {
            r(LayoutInflater.from(getContext()).inflate(i11, (ViewGroup) this.f31907e, false));
        }
    }

    private void setUpStatusBarSpacer(@Px int i11) {
        if (this.f31906d.getLayoutParams().height != i11) {
            this.f31906d.getLayoutParams().height = i11;
            this.f31906d.requestLayout();
        }
    }

    public final boolean A() {
        return this.B.equals(TransitionState.HIDDEN) || this.B.equals(TransitionState.HIDING);
    }

    public boolean B() {
        return this.f31925w;
    }

    public final boolean C(@NonNull Toolbar toolbar) {
        return DrawableCompat.unwrap(toolbar.getNavigationIcon()) instanceof DrawerArrowDrawable;
    }

    public boolean D() {
        return this.f31922t != null;
    }

    public boolean E() {
        return this.B.equals(TransitionState.SHOWN) || this.B.equals(TransitionState.SHOWING);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean F() {
        return this.f31928z;
    }

    public void G() {
        this.f31907e.removeAllViews();
        this.f31907e.setVisibility(8);
    }

    public void H(@NonNull View view) {
        this.f31907e.removeView(view);
        if (this.f31907e.getChildCount() == 0) {
            this.f31907e.setVisibility(8);
        }
    }

    public void I(@NonNull b bVar) {
        this.f31921s.remove(bVar);
    }

    public void J() {
        this.f31912j.postDelayed(new Runnable() { // from class: com.google.android.material.search.r
            @Override // java.lang.Runnable
            public final void run() {
                SearchView.l(SearchView.this);
            }
        }, 100L);
    }

    public void K() {
        if (this.f31926x) {
            J();
        }
    }

    public final void L(@NonNull TransitionState transitionState, boolean z11) {
        if (this.B.equals(transitionState)) {
            return;
        }
        if (z11) {
            if (transitionState == TransitionState.SHOWN) {
                setModalForAccessibility(true);
            } else if (transitionState == TransitionState.HIDDEN) {
                setModalForAccessibility(false);
            }
        }
        TransitionState transitionState2 = this.B;
        this.B = transitionState;
        Iterator it = new LinkedHashSet(this.f31921s).iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(this, transitionState2, transitionState);
        }
        Y(transitionState);
    }

    public final void M(boolean z11, boolean z12) {
        if (z12) {
            this.f31909g.setNavigationIcon((Drawable) null);
            return;
        }
        this.f31909g.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.search.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchView.this.v();
            }
        });
        if (z11) {
            DrawerArrowDrawable drawerArrowDrawable = new DrawerArrowDrawable(getContext());
            drawerArrowDrawable.setColor(en.u.d(this, R.attr.colorOnSurface));
            this.f31909g.setNavigationIcon(drawerArrowDrawable);
        }
    }

    public final void N() {
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
    }

    public final void O() {
        this.f31913k.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.search.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchView.m(SearchView.this, view);
            }
        });
        this.f31912j.addTextChangedListener(new a());
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void P() {
        this.f31915m.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.search.x
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SearchView.j(SearchView.this, view, motionEvent);
            }
        });
    }

    public final void Q() {
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f31914l.getLayoutParams();
        final int i11 = marginLayoutParams.leftMargin;
        final int i12 = marginLayoutParams.rightMargin;
        ViewCompat.setOnApplyWindowInsetsListener(this.f31914l, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.search.q
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return SearchView.i(marginLayoutParams, i11, i12, view, windowInsetsCompat);
            }
        });
    }

    public final void R(@StyleRes int i11, String str, String str2) {
        if (i11 != -1) {
            TextViewCompat.setTextAppearance(this.f31912j, i11);
        }
        this.f31912j.setText(str);
        this.f31912j.setHint(str2);
    }

    public final void S() {
        V();
        Q();
        U();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void T() {
        this.f31904b.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.search.w
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SearchView.p(view, motionEvent);
            }
        });
    }

    public final void U() {
        setUpStatusBarSpacer(getStatusBarHeight());
        ViewCompat.setOnApplyWindowInsetsListener(this.f31906d, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.search.t
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return SearchView.o(SearchView.this, view, windowInsetsCompat);
            }
        });
    }

    public final void V() {
        m0.h(this.f31909g, new m0.d() { // from class: com.google.android.material.search.s
            @Override // com.google.android.material.internal.m0.d
            public final WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat, m0.e eVar) {
                return SearchView.n(SearchView.this, view, windowInsetsCompat, eVar);
            }
        });
    }

    public void W() {
        if (this.B.equals(TransitionState.SHOWN) || this.B.equals(TransitionState.SHOWING)) {
            return;
        }
        this.f31917o.U();
    }

    @SuppressLint({"InlinedApi"})
    public final void X(ViewGroup viewGroup, boolean z11) {
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt != this) {
                if (childAt.findViewById(this.f31904b.getId()) != null) {
                    X((ViewGroup) childAt, z11);
                } else if (z11) {
                    this.C.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    ViewCompat.setImportantForAccessibility(childAt, 4);
                } else {
                    Map<View, Integer> map = this.C;
                    if (map != null && map.containsKey(childAt)) {
                        ViewCompat.setImportantForAccessibility(childAt, this.C.get(childAt).intValue());
                    }
                }
            }
        }
    }

    public final void Y(@NonNull TransitionState transitionState) {
        if (this.f31922t == null || !this.f31919q) {
            return;
        }
        if (transitionState.equals(TransitionState.SHOWN)) {
            this.f31918p.c();
        } else if (transitionState.equals(TransitionState.HIDDEN)) {
            this.f31918p.f();
        }
    }

    public final void Z() {
        MaterialToolbar materialToolbar = this.f31909g;
        if (materialToolbar == null || C(materialToolbar)) {
            return;
        }
        int defaultNavigationIconResource = getDefaultNavigationIconResource();
        if (this.f31922t == null) {
            this.f31909g.setNavigationIcon(defaultNavigationIconResource);
            return;
        }
        Drawable wrap = DrawableCompat.wrap(AppCompatResources.getDrawable(getContext(), defaultNavigationIconResource).mutate());
        if (this.f31909g.getNavigationIconTint() != null) {
            DrawableCompat.setTint(wrap, this.f31909g.getNavigationIconTint().intValue());
        }
        this.f31909g.setNavigationIcon(new com.google.android.material.internal.i(this.f31922t.getNavigationIcon(), wrap));
        a0();
    }

    public final void a0() {
        ImageButton e11 = com.google.android.material.internal.e0.e(this.f31909g);
        if (e11 == null) {
            return;
        }
        int i11 = this.f31904b.getVisibility() == 0 ? 1 : 0;
        Drawable unwrap = DrawableCompat.unwrap(e11.getDrawable());
        if (unwrap instanceof DrawerArrowDrawable) {
            ((DrawerArrowDrawable) unwrap).setProgress(i11);
        }
        if (unwrap instanceof com.google.android.material.internal.i) {
            ((com.google.android.material.internal.i) unwrap).a(i11);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (this.f31916n) {
            this.f31915m.addView(view, i11, layoutParams);
        } else {
            super.addView(view, i11, layoutParams);
        }
    }

    @Override // pn.b
    public void b(@NonNull BackEventCompat backEventCompat) {
        if (A() || this.f31922t == null) {
            return;
        }
        this.f31917o.V(backEventCompat);
    }

    public void b0() {
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f31923u = activityWindow.getAttributes().softInputMode;
        }
    }

    @Override // pn.b
    public void c(@NonNull BackEventCompat backEventCompat) {
        if (A() || this.f31922t == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        this.f31917o.a0(backEventCompat);
    }

    @Override // pn.b
    public void d() {
        if (A()) {
            return;
        }
        BackEventCompat N = this.f31917o.N();
        if (Build.VERSION.SDK_INT < 34 || this.f31922t == null || N == null) {
            v();
        } else {
            this.f31917o.p();
        }
    }

    @Override // pn.b
    public void f() {
        if (A() || this.f31922t == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        this.f31917o.o();
    }

    @VisibleForTesting
    public pn.h getBackHelper() {
        return this.f31917o.r();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<SearchView> getBehavior() {
        return new Behavior();
    }

    @NonNull
    public TransitionState getCurrentTransitionState() {
        return this.B;
    }

    @DrawableRes
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getDefaultNavigationIconResource() {
        return R.drawable.ic_arrow_back_black_24;
    }

    @NonNull
    public EditText getEditText() {
        return this.f31912j;
    }

    @Nullable
    public CharSequence getHint() {
        return this.f31912j.getHint();
    }

    @NonNull
    public TextView getSearchPrefix() {
        return this.f31911i;
    }

    @Nullable
    public CharSequence getSearchPrefixText() {
        return this.f31911i.getText();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.f31923u;
    }

    @NonNull
    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        return this.f31912j.getText();
    }

    @NonNull
    public Toolbar getToolbar() {
        return this.f31909g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        vn.l.e(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        b0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setText(savedState.f31929a);
        setVisible(savedState.f31930b == 0);
    }

    @Override // android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Editable text = getText();
        savedState.f31929a = text == null ? null : text.toString();
        savedState.f31930b = this.f31904b.getVisibility();
        return savedState;
    }

    public void r(@NonNull View view) {
        this.f31907e.addView(view);
        this.f31907e.setVisibility(0);
    }

    public void s(@NonNull b bVar) {
        this.f31921s.add(bVar);
    }

    public void setAnimatedNavigationIcon(boolean z11) {
        this.f31924v = z11;
    }

    public void setAutoShowKeyboard(boolean z11) {
        this.f31926x = z11;
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f11) {
        super.setElevation(f11);
        setUpBackgroundViewElevationOverlay(f11);
    }

    public void setHint(@Nullable CharSequence charSequence) {
        this.f31912j.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z11) {
        this.f31925w = z11;
    }

    public void setModalForAccessibility(boolean z11) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z11) {
            this.C = new HashMap(viewGroup.getChildCount());
        }
        X(viewGroup, z11);
        if (z11) {
            return;
        }
        this.C = null;
    }

    public void setOnMenuItemClickListener(@Nullable Toolbar.OnMenuItemClickListener onMenuItemClickListener) {
        this.f31909g.setOnMenuItemClickListener(onMenuItemClickListener);
    }

    public void setSearchPrefixText(@Nullable CharSequence charSequence) {
        this.f31911i.setText(charSequence);
        this.f31911i.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setStatusBarSpacerEnabled(boolean z11) {
        this.A = true;
        setStatusBarSpacerEnabledInternal(z11);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(@Nullable CharSequence charSequence) {
        this.f31912j.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z11) {
        this.f31909g.setTouchscreenBlocksFocus(z11);
    }

    public void setTransitionState(@NonNull TransitionState transitionState) {
        L(transitionState, true);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setUseWindowInsetsController(boolean z11) {
        this.f31928z = z11;
    }

    public void setVisible(boolean z11) {
        boolean z12 = this.f31904b.getVisibility() == 0;
        this.f31904b.setVisibility(z11 ? 0 : 8);
        a0();
        L(z11 ? TransitionState.SHOWN : TransitionState.HIDDEN, z12 != z11);
    }

    public void setupWithSearchBar(@Nullable SearchBar searchBar) {
        this.f31922t = searchBar;
        this.f31917o.S(searchBar);
        if (searchBar != null) {
            searchBar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.search.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchView.this.W();
                }
            });
            if (Build.VERSION.SDK_INT >= 34) {
                try {
                    searchBar.setHandwritingDelegatorCallback(new Runnable() { // from class: com.google.android.material.search.v
                        @Override // java.lang.Runnable
                        public final void run() {
                            SearchView.this.W();
                        }
                    });
                    this.f31912j.setIsHandwritingDelegate(true);
                } catch (LinkageError unused) {
                }
            }
        }
        Z();
        N();
        Y(getCurrentTransitionState());
    }

    public void t() {
        this.f31912j.post(new Runnable() { // from class: com.google.android.material.search.o
            @Override // java.lang.Runnable
            public final void run() {
                SearchView.k(SearchView.this);
            }
        });
    }

    public void u() {
        this.f31912j.setText("");
    }

    public void v() {
        if (this.B.equals(TransitionState.HIDDEN) || this.B.equals(TransitionState.HIDING)) {
            return;
        }
        this.f31917o.M();
    }

    public void w(@MenuRes int i11) {
        this.f31909g.inflateMenu(i11);
    }

    public boolean x() {
        return this.f31923u == 48;
    }

    public boolean y() {
        return this.f31924v;
    }

    public boolean z() {
        return this.f31926x;
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchViewStyle);
    }

    public void setHint(@StringRes int i11) {
        this.f31912j.setHint(i11);
    }

    public void setText(@StringRes int i11) {
        this.f31912j.setText(i11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SearchView(@androidx.annotation.NonNull android.content.Context r9, @androidx.annotation.Nullable android.util.AttributeSet r10, int r11) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.search.SearchView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            SearchView.this.f31913k.setVisibility(charSequence.length() > 0 ? 0 : 8);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }
}
