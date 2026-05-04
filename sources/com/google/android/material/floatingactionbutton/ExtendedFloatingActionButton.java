package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AnimatorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.AttachedBehavior {
    public static final int Q = 0;
    public static final int R = 1;
    public static final int S = 2;
    public static final int T = 0;
    public static final int U = 1;
    public static final int V = 2;
    public static final int W = 3;

    /* renamed from: f0, reason: collision with root package name */
    public static final int f31312f0 = 0;

    /* renamed from: f1, reason: collision with root package name */
    public static final int f31313f1 = 1;

    /* renamed from: h1, reason: collision with root package name */
    public static final int f31314h1 = 2;

    @NonNull
    public final com.google.android.material.floatingactionbutton.b A;

    @NonNull
    public final com.google.android.material.floatingactionbutton.b B;
    public final com.google.android.material.floatingactionbutton.b C;
    public final com.google.android.material.floatingactionbutton.b D;
    public final int E;
    public int F;
    public int G;

    @NonNull
    public final CoordinatorLayout.Behavior<ExtendedFloatingActionButton> H;
    public boolean I;
    public boolean J;
    public boolean K;

    @NonNull
    public ColorStateList L;
    public int M;
    public int N;
    public final int O;

    /* renamed from: y, reason: collision with root package name */
    public int f31319y;

    /* renamed from: z, reason: collision with root package name */
    public final nn.a f31320z;
    public static final int P = R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;

    /* renamed from: i1, reason: collision with root package name */
    public static final Property<View, Float> f31315i1 = new f(Float.class, "width");

    /* renamed from: j1, reason: collision with root package name */
    public static final Property<View, Float> f31316j1 = new g(Float.class, "height");

    /* renamed from: k1, reason: collision with root package name */
    public static final Property<View, Float> f31317k1 = new h(Float.class, "paddingStart");

    /* renamed from: l1, reason: collision with root package name */
    public static final Property<View, Float> f31318l1 = new i(Float.class, "paddingEnd");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements n {
        public a() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int a() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public ViewGroup.LayoutParams b() {
            return new ViewGroup.LayoutParams(getWidth(), getHeight());
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int c() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getWidth() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements n {
        public b() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int a() {
            return ExtendedFloatingActionButton.this.G;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public ViewGroup.LayoutParams b() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int c() {
            return ExtendedFloatingActionButton.this.F;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getWidth() {
            return (ExtendedFloatingActionButton.this.getMeasuredWidth() - (ExtendedFloatingActionButton.this.getCollapsedPadding() * 2)) + ExtendedFloatingActionButton.this.F + ExtendedFloatingActionButton.this.G;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n f31330a;

        public c(n nVar) {
            this.f31330a = nVar;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int a() {
            return ExtendedFloatingActionButton.this.G;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public ViewGroup.LayoutParams b() {
            return new ViewGroup.LayoutParams(-1, ExtendedFloatingActionButton.this.N == 0 ? -2 : ExtendedFloatingActionButton.this.N);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int c() {
            return ExtendedFloatingActionButton.this.F;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getHeight() {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            if (ExtendedFloatingActionButton.this.N != -1) {
                return (ExtendedFloatingActionButton.this.N == 0 || ExtendedFloatingActionButton.this.N == -2) ? this.f31330a.getHeight() : ExtendedFloatingActionButton.this.N;
            }
            if (!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                return this.f31330a.getHeight();
            }
            View view = (View) ExtendedFloatingActionButton.this.getParent();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null || layoutParams.height != -2) {
                return (view.getHeight() - ((!(ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) ExtendedFloatingActionButton.this.getLayoutParams()) == null) ? 0 : marginLayoutParams.topMargin + marginLayoutParams.bottomMargin)) - (view.getPaddingTop() + view.getPaddingBottom());
            }
            return this.f31330a.getHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getWidth() {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            if (!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                return this.f31330a.getWidth();
            }
            View view = (View) ExtendedFloatingActionButton.this.getParent();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null || layoutParams.width != -2) {
                return (view.getWidth() - ((!(ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) ExtendedFloatingActionButton.this.getLayoutParams()) == null) ? 0 : marginLayoutParams.leftMargin + marginLayoutParams.rightMargin)) - (view.getPaddingLeft() + view.getPaddingRight());
            }
            return this.f31330a.getWidth();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n f31332a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n f31333b;

        public d(n nVar, n nVar2) {
            this.f31332a = nVar;
            this.f31333b = nVar2;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int a() {
            return ExtendedFloatingActionButton.this.G;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public ViewGroup.LayoutParams b() {
            return new ViewGroup.LayoutParams(ExtendedFloatingActionButton.this.M == 0 ? -2 : ExtendedFloatingActionButton.this.M, ExtendedFloatingActionButton.this.N != 0 ? ExtendedFloatingActionButton.this.N : -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int c() {
            return ExtendedFloatingActionButton.this.F;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getHeight() {
            return ExtendedFloatingActionButton.this.N == -1 ? this.f31332a.getHeight() : (ExtendedFloatingActionButton.this.N == 0 || ExtendedFloatingActionButton.this.N == -2) ? this.f31333b.getHeight() : ExtendedFloatingActionButton.this.N;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getWidth() {
            return ExtendedFloatingActionButton.this.M == -1 ? this.f31332a.getWidth() : (ExtendedFloatingActionButton.this.M == 0 || ExtendedFloatingActionButton.this.M == -2) ? this.f31333b.getWidth() : ExtendedFloatingActionButton.this.M;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public boolean f31335a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.floatingactionbutton.b f31336b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l f31337c;

        public e(com.google.android.material.floatingactionbutton.b bVar, l lVar) {
            this.f31336b = bVar;
            this.f31337c = lVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f31335a = true;
            this.f31336b.k();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f31336b.b();
            if (this.f31335a) {
                return;
            }
            this.f31336b.i(this.f31337c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f31336b.onAnimationStart(animator);
            this.f31335a = false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f extends Property<View, Float> {
        public f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @NonNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(@NonNull View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull View view, @NonNull Float f11) {
            view.getLayoutParams().width = f11.intValue();
            view.requestLayout();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g extends Property<View, Float> {
        public g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @NonNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(@NonNull View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull View view, @NonNull Float f11) {
            view.getLayoutParams().height = f11.intValue();
            view.requestLayout();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h extends Property<View, Float> {
        public h(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @NonNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(@NonNull View view) {
            return Float.valueOf(ViewCompat.getPaddingStart(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull View view, @NonNull Float f11) {
            ViewCompat.setPaddingRelative(view, f11.intValue(), view.getPaddingTop(), ViewCompat.getPaddingEnd(view), view.getPaddingBottom());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i extends Property<View, Float> {
        public i(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @NonNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(@NonNull View view) {
            return Float.valueOf(ViewCompat.getPaddingEnd(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull View view, @NonNull Float f11) {
            ViewCompat.setPaddingRelative(view, ViewCompat.getPaddingStart(view), view.getPaddingTop(), f11.intValue(), view.getPaddingBottom());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class j extends nn.b {

        /* renamed from: g, reason: collision with root package name */
        public final n f31339g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f31340h;

        public j(nn.a aVar, n nVar, boolean z11) {
            super(ExtendedFloatingActionButton.this, aVar);
            this.f31339g = nVar;
            this.f31340h = z11;
        }

        @Override // nn.b, com.google.android.material.floatingactionbutton.b
        public void b() {
            super.b();
            ExtendedFloatingActionButton.this.J = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f31339g.b().width;
            layoutParams.height = this.f31339g.b().height;
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public boolean d() {
            return this.f31340h == ExtendedFloatingActionButton.this.I || ExtendedFloatingActionButton.this.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public int g() {
            return this.f31340h ? R.animator.mtrl_extended_fab_change_size_expand_motion_spec : R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        @Override // nn.b, com.google.android.material.floatingactionbutton.b
        @NonNull
        public AnimatorSet h() {
            vm.i a11 = a();
            if (a11.j("width")) {
                PropertyValuesHolder[] g11 = a11.g("width");
                g11[0].setFloatValues(ExtendedFloatingActionButton.this.getWidth(), this.f31339g.getWidth());
                a11.l("width", g11);
            }
            if (a11.j("height")) {
                PropertyValuesHolder[] g12 = a11.g("height");
                g12[0].setFloatValues(ExtendedFloatingActionButton.this.getHeight(), this.f31339g.getHeight());
                a11.l("height", g12);
            }
            if (a11.j("paddingStart")) {
                PropertyValuesHolder[] g13 = a11.g("paddingStart");
                g13[0].setFloatValues(ViewCompat.getPaddingStart(ExtendedFloatingActionButton.this), this.f31339g.c());
                a11.l("paddingStart", g13);
            }
            if (a11.j("paddingEnd")) {
                PropertyValuesHolder[] g14 = a11.g("paddingEnd");
                g14[0].setFloatValues(ViewCompat.getPaddingEnd(ExtendedFloatingActionButton.this), this.f31339g.a());
                a11.l("paddingEnd", g14);
            }
            if (a11.j("labelOpacity")) {
                PropertyValuesHolder[] g15 = a11.g("labelOpacity");
                boolean z11 = this.f31340h;
                g15[0].setFloatValues(z11 ? 0.0f : 1.0f, z11 ? 1.0f : 0.0f);
                a11.l("labelOpacity", g15);
            }
            return super.n(a11);
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public void i(@Nullable l lVar) {
            if (lVar == null) {
                return;
            }
            if (this.f31340h) {
                lVar.a(ExtendedFloatingActionButton.this);
            } else {
                lVar.d(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public void j() {
            ExtendedFloatingActionButton.this.I = this.f31340h;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            if (!this.f31340h) {
                ExtendedFloatingActionButton.this.M = layoutParams.width;
                ExtendedFloatingActionButton.this.N = layoutParams.height;
            }
            layoutParams.width = this.f31339g.b().width;
            layoutParams.height = this.f31339g.b().height;
            ViewCompat.setPaddingRelative(ExtendedFloatingActionButton.this, this.f31339g.c(), ExtendedFloatingActionButton.this.getPaddingTop(), this.f31339g.a(), ExtendedFloatingActionButton.this.getPaddingBottom());
            ExtendedFloatingActionButton.this.requestLayout();
        }

        @Override // nn.b, com.google.android.material.floatingactionbutton.b
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.I = this.f31340h;
            ExtendedFloatingActionButton.this.J = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class k extends nn.b {

        /* renamed from: g, reason: collision with root package name */
        public boolean f31342g;

        public k(nn.a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        @Override // nn.b, com.google.android.material.floatingactionbutton.b
        public void b() {
            super.b();
            ExtendedFloatingActionButton.this.f31319y = 0;
            if (this.f31342g) {
                return;
            }
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public boolean d() {
            return ExtendedFloatingActionButton.this.K();
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public int g() {
            return R.animator.mtrl_extended_fab_hide_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public void i(@Nullable l lVar) {
            if (lVar != null) {
                lVar.b(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public void j() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // nn.b, com.google.android.material.floatingactionbutton.b
        public void k() {
            super.k();
            this.f31342g = true;
        }

        @Override // nn.b, com.google.android.material.floatingactionbutton.b
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f31342g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f31319y = 1;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class m extends nn.b {
        public m(nn.a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        @Override // nn.b, com.google.android.material.floatingactionbutton.b
        public void b() {
            super.b();
            ExtendedFloatingActionButton.this.f31319y = 0;
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public boolean d() {
            return ExtendedFloatingActionButton.this.L();
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public int g() {
            return R.animator.mtrl_extended_fab_show_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public void i(@Nullable l lVar) {
            if (lVar != null) {
                lVar.c(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public void j() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        @Override // nn.b, com.google.android.material.floatingactionbutton.b
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f31319y = 2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface n {
        int a();

        ViewGroup.LayoutParams b();

        int c();

        int getHeight();

        int getWidth();
    }

    public ExtendedFloatingActionButton(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean K() {
        return getVisibility() == 0 ? this.f31319y == 1 : this.f31319y != 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean L() {
        return getVisibility() != 0 ? this.f31319y == 2 : this.f31319y != 1;
    }

    public void A(@NonNull Animator.AnimatorListener animatorListener) {
        this.B.l(animatorListener);
    }

    public void B(@NonNull Animator.AnimatorListener animatorListener) {
        this.D.l(animatorListener);
    }

    public void C(@NonNull Animator.AnimatorListener animatorListener) {
        this.C.l(animatorListener);
    }

    public void D(@NonNull Animator.AnimatorListener animatorListener) {
        this.A.l(animatorListener);
    }

    public void E() {
        M(3, null);
    }

    public void F(@NonNull l lVar) {
        M(3, lVar);
    }

    public final n G(int i11) {
        b bVar = new b();
        c cVar = new c(bVar);
        return i11 != 1 ? i11 != 2 ? new d(cVar, bVar) : cVar : bVar;
    }

    public void H() {
        M(1, null);
    }

    public void I(@NonNull l lVar) {
        M(1, lVar);
    }

    public final boolean J() {
        return this.I;
    }

    public final void M(int i11, @Nullable l lVar) {
        com.google.android.material.floatingactionbutton.b bVar;
        if (i11 == 0) {
            bVar = this.C;
        } else if (i11 == 1) {
            bVar = this.D;
        } else if (i11 == 2) {
            bVar = this.A;
        } else {
            if (i11 != 3) {
                throw new IllegalStateException("Unknown strategy type: " + i11);
            }
            bVar = this.B;
        }
        if (bVar.d()) {
            return;
        }
        if (!S()) {
            bVar.j();
            bVar.i(lVar);
            return;
        }
        if (i11 == 2) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                this.M = layoutParams.width;
                this.N = layoutParams.height;
            } else {
                this.M = getWidth();
                this.N = getHeight();
            }
        }
        measure(0, 0);
        AnimatorSet h11 = bVar.h();
        h11.addListener(new e(bVar, lVar));
        Iterator<Animator.AnimatorListener> it = bVar.getListeners().iterator();
        while (it.hasNext()) {
            h11.addListener(it.next());
        }
        h11.start();
    }

    public void N(@NonNull Animator.AnimatorListener animatorListener) {
        this.B.e(animatorListener);
    }

    public void O(@NonNull Animator.AnimatorListener animatorListener) {
        this.D.e(animatorListener);
    }

    public void P(@NonNull Animator.AnimatorListener animatorListener) {
        this.C.e(animatorListener);
    }

    public void Q(@NonNull Animator.AnimatorListener animatorListener) {
        this.A.e(animatorListener);
    }

    public final void R() {
        this.L = getTextColors();
    }

    public final boolean S() {
        return (ViewCompat.isLaidOut(this) || (!L() && this.K)) && !isInEditMode();
    }

    public void T() {
        M(0, null);
    }

    public void U(@NonNull l lVar) {
        M(0, lVar);
    }

    public void V() {
        M(2, null);
    }

    public void W(@NonNull l lVar) {
        M(2, lVar);
    }

    public void X(@NonNull ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> getBehavior() {
        return this.H;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    @VisibleForTesting
    public int getCollapsedSize() {
        int i11 = this.E;
        return i11 < 0 ? (Math.min(ViewCompat.getPaddingStart(this), ViewCompat.getPaddingEnd(this)) * 2) + getIconSize() : i11;
    }

    @Nullable
    public vm.i getExtendMotionSpec() {
        return this.B.c();
    }

    @Nullable
    public vm.i getHideMotionSpec() {
        return this.D.c();
    }

    @Nullable
    public vm.i getShowMotionSpec() {
        return this.C.c();
    }

    @Nullable
    public vm.i getShrinkMotionSpec() {
        return this.A.c();
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.I && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.I = false;
            this.A.j();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z11) {
        this.K = z11;
    }

    public void setExtendMotionSpec(@Nullable vm.i iVar) {
        this.B.f(iVar);
    }

    public void setExtendMotionSpecResource(@AnimatorRes int i11) {
        setExtendMotionSpec(vm.i.d(getContext(), i11));
    }

    public void setExtended(boolean z11) {
        if (this.I == z11) {
            return;
        }
        com.google.android.material.floatingactionbutton.b bVar = z11 ? this.B : this.A;
        if (bVar.d()) {
            return;
        }
        bVar.j();
    }

    public void setHideMotionSpec(@Nullable vm.i iVar) {
        this.D.f(iVar);
    }

    public void setHideMotionSpecResource(@AnimatorRes int i11) {
        setHideMotionSpec(vm.i.d(getContext(), i11));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i11, int i12, int i13, int i14) {
        super.setPadding(i11, i12, i13, i14);
        if (!this.I || this.J) {
            return;
        }
        this.F = ViewCompat.getPaddingStart(this);
        this.G = ViewCompat.getPaddingEnd(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i11, int i12, int i13, int i14) {
        super.setPaddingRelative(i11, i12, i13, i14);
        if (!this.I || this.J) {
            return;
        }
        this.F = i11;
        this.G = i13;
    }

    public void setShowMotionSpec(@Nullable vm.i iVar) {
        this.C.f(iVar);
    }

    public void setShowMotionSpecResource(@AnimatorRes int i11) {
        setShowMotionSpec(vm.i.d(getContext(), i11));
    }

    public void setShrinkMotionSpec(@Nullable vm.i iVar) {
        this.A.f(iVar);
    }

    public void setShrinkMotionSpecResource(@AnimatorRes int i11) {
        setShrinkMotionSpec(vm.i.d(getContext(), i11));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i11) {
        super.setTextColor(i11);
        R();
    }

    public ExtendedFloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.extendedFloatingActionButtonStyle);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: f, reason: collision with root package name */
        public static final boolean f31321f = false;

        /* renamed from: g, reason: collision with root package name */
        public static final boolean f31322g = true;

        /* renamed from: a, reason: collision with root package name */
        public Rect f31323a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        public l f31324b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        public l f31325c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f31326d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f31327e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f31326d = false;
            this.f31327e = true;
        }

        public static boolean l(@NonNull View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                return ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior;
            }
            return false;
        }

        public void h(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z11 = this.f31327e;
            extendedFloatingActionButton.M(z11 ? 3 : 0, z11 ? this.f31325c : this.f31324b);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, @NonNull Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        public boolean j() {
            return this.f31326d;
        }

        public boolean k() {
            return this.f31327e;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                u(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!l(view)) {
                return false;
            }
            v(view, extendedFloatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, int i11) {
            List<View> dependencies = coordinatorLayout.getDependencies(extendedFloatingActionButton);
            int size = dependencies.size();
            for (int i12 = 0; i12 < size; i12++) {
                View view = dependencies.get(i12);
                if (!(view instanceof AppBarLayout)) {
                    if (l(view) && v(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (u(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(extendedFloatingActionButton, i11);
            return true;
        }

        public void o(boolean z11) {
            this.f31326d = z11;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.dodgeInsetEdges == 0) {
                layoutParams.dodgeInsetEdges = 80;
            }
        }

        public void p(boolean z11) {
            this.f31327e = z11;
        }

        @VisibleForTesting
        public void q(@Nullable l lVar) {
            this.f31324b = lVar;
        }

        @VisibleForTesting
        public void r(@Nullable l lVar) {
            this.f31325c = lVar;
        }

        public final boolean s(@NonNull View view, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f31326d || this.f31327e) && ((CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams()).getAnchorId() == view.getId();
        }

        public void t(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z11 = this.f31327e;
            extendedFloatingActionButton.M(z11 ? 2 : 1, z11 ? this.f31325c : this.f31324b);
        }

        public final boolean u(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!s(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f31323a == null) {
                this.f31323a = new Rect();
            }
            Rect rect = this.f31323a;
            com.google.android.material.internal.d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                t(extendedFloatingActionButton);
                return true;
            }
            h(extendedFloatingActionButton);
            return true;
        }

        public final boolean v(@NonNull View view, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!s(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                t(extendedFloatingActionButton);
                return true;
            }
            h(extendedFloatingActionButton);
            return true;
        }

        public ExtendedFloatingActionButtonBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ExtendedFloatingActionButton_Behavior_Layout);
            this.f31326d = obtainStyledAttributes.getBoolean(R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f31327e = obtainStyledAttributes.getBoolean(R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ExtendedFloatingActionButton(@androidx.annotation.NonNull android.content.Context r18, @androidx.annotation.Nullable android.util.AttributeSet r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r2 = r19
            r4 = r20
            int r5 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.P
            r1 = r18
            android.content.Context r1 = zn.a.c(r1, r2, r4, r5)
            r0.<init>(r1, r2, r4)
            r7 = 0
            r0.f31319y = r7
            nn.a r1 = new nn.a
            r1.<init>()
            r0.f31320z = r1
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$m r8 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$m
            r8.<init>(r1)
            r0.C = r8
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k r9 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k
            r9.<init>(r1)
            r0.D = r9
            r10 = 1
            r0.I = r10
            r0.J = r7
            r0.K = r7
            android.content.Context r1 = r0.getContext()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior r3 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior
            r3.<init>(r1, r2)
            r0.H = r3
            int[] r3 = com.google.android.material.R.styleable.ExtendedFloatingActionButton
            int[] r6 = new int[r7]
            android.content.res.TypedArray r3 = com.google.android.material.internal.d0.k(r1, r2, r3, r4, r5, r6)
            int r6 = com.google.android.material.R.styleable.ExtendedFloatingActionButton_showMotionSpec
            vm.i r6 = vm.i.c(r1, r3, r6)
            int r11 = com.google.android.material.R.styleable.ExtendedFloatingActionButton_hideMotionSpec
            vm.i r11 = vm.i.c(r1, r3, r11)
            int r12 = com.google.android.material.R.styleable.ExtendedFloatingActionButton_extendMotionSpec
            vm.i r12 = vm.i.c(r1, r3, r12)
            int r13 = com.google.android.material.R.styleable.ExtendedFloatingActionButton_shrinkMotionSpec
            vm.i r13 = vm.i.c(r1, r3, r13)
            int r14 = com.google.android.material.R.styleable.ExtendedFloatingActionButton_collapsedSize
            r15 = -1
            int r14 = r3.getDimensionPixelSize(r14, r15)
            r0.E = r14
            int r14 = com.google.android.material.R.styleable.ExtendedFloatingActionButton_extendStrategy
            int r14 = r3.getInt(r14, r10)
            r0.O = r14
            int r15 = androidx.core.view.ViewCompat.getPaddingStart(r0)
            r0.F = r15
            int r15 = androidx.core.view.ViewCompat.getPaddingEnd(r0)
            r0.G = r15
            nn.a r15 = new nn.a
            r15.<init>()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$j r7 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$j
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$n r14 = r0.G(r14)
            r7.<init>(r15, r14, r10)
            r0.B = r7
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$j r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$j
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a r14 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a
            r14.<init>()
            r16 = r3
            r3 = 0
            r10.<init>(r15, r14, r3)
            r0.A = r10
            r8.f(r6)
            r9.f(r11)
            r7.f(r12)
            r10.f(r13)
            r16.recycle()
            vn.e r3 = vn.p.f94154m
            vn.p$b r1 = vn.p.g(r1, r2, r4, r5, r3)
            vn.p r1 = r1.m()
            r0.setShapeAppearanceModel(r1)
            r0.R()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.TextView
    public void setTextColor(@NonNull ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        R();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class l {
        public void a(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void b(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void c(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void d(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }
    }
}
