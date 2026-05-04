package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.PluralsRes;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.XmlRes;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.a0;
import com.google.android.material.internal.d0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.Locale;
import sn.c;
import sn.d;
import vn.k;
import vn.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@OptIn(markerClass = {xm.b.class})
/* loaded from: classes7.dex */
public class a extends Drawable implements a0.b {
    public static final float A = 0.3f;

    /* renamed from: n, reason: collision with root package name */
    public static final String f30552n = "Badge";

    /* renamed from: o, reason: collision with root package name */
    public static final int f30553o = 8388661;

    /* renamed from: p, reason: collision with root package name */
    public static final int f30554p = 8388659;

    /* renamed from: q, reason: collision with root package name */
    @Deprecated
    public static final int f30555q = 8388693;

    /* renamed from: r, reason: collision with root package name */
    @Deprecated
    public static final int f30556r = 8388691;

    /* renamed from: s, reason: collision with root package name */
    @StyleRes
    public static final int f30557s = R.style.Widget_MaterialComponents_Badge;

    /* renamed from: t, reason: collision with root package name */
    @AttrRes
    public static final int f30558t = R.attr.badgeStyle;

    /* renamed from: u, reason: collision with root package name */
    public static final String f30559u = "+";

    /* renamed from: v, reason: collision with root package name */
    public static final String f30560v = "…";

    /* renamed from: w, reason: collision with root package name */
    public static final int f30561w = 0;

    /* renamed from: x, reason: collision with root package name */
    public static final int f30562x = 1;

    /* renamed from: y, reason: collision with root package name */
    public static final int f30563y = -1;

    /* renamed from: z, reason: collision with root package name */
    public static final int f30564z = -2;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final WeakReference<Context> f30565a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final k f30566b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final a0 f30567c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final Rect f30568d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final BadgeState f30569e;

    /* renamed from: f, reason: collision with root package name */
    public float f30570f;

    /* renamed from: g, reason: collision with root package name */
    public float f30571g;

    /* renamed from: h, reason: collision with root package name */
    public int f30572h;

    /* renamed from: i, reason: collision with root package name */
    public float f30573i;

    /* renamed from: j, reason: collision with root package name */
    public float f30574j;

    /* renamed from: k, reason: collision with root package name */
    public float f30575k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public WeakReference<View> f30576l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public WeakReference<FrameLayout> f30577m;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.google.android.material.badge.a$a, reason: collision with other inner class name */
    public class RunnableC0364a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f30578a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FrameLayout f30579b;

        public RunnableC0364a(View view, FrameLayout frameLayout) {
            this.f30578a = view;
            this.f30579b = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.P0(this.f30578a, this.f30579b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public a(@NonNull Context context, @XmlRes int i11, @AttrRes int i12, @StyleRes int i13, @Nullable BadgeState.State state) {
        this.f30565a = new WeakReference<>(context);
        d0.c(context);
        this.f30568d = new Rect();
        a0 a0Var = new a0(this);
        this.f30567c = a0Var;
        a0Var.g().setTextAlign(Paint.Align.CENTER);
        BadgeState badgeState = new BadgeState(context, i11, i12, i13, state);
        this.f30569e = badgeState;
        this.f30566b = new k(p.b(context, R() ? badgeState.o() : badgeState.k(), R() ? badgeState.n() : badgeState.j()).m());
        g0();
    }

    public static void M0(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    @NonNull
    public static a f(@NonNull Context context) {
        return new a(context, 0, f30558t, f30557s, null);
    }

    @NonNull
    public static a g(@NonNull Context context, @XmlRes int i11) {
        return new a(context, i11, f30558t, f30557s, null);
    }

    @NonNull
    public static a h(@NonNull Context context, @NonNull BadgeState.State state) {
        return new a(context, 0, f30558t, f30557s, state);
    }

    public int A() {
        return this.f30569e.w();
    }

    public void A0(@Px int i11) {
        this.f30569e.d0(i11);
        Q0();
    }

    public int B() {
        return this.f30569e.x();
    }

    public void B0(int i11) {
        if (this.f30569e.w() != i11) {
            this.f30569e.e0(i11);
            c0();
        }
    }

    public int C() {
        if (this.f30569e.F()) {
            return this.f30569e.y();
        }
        return 0;
    }

    public void C0(int i11) {
        if (this.f30569e.x() != i11) {
            this.f30569e.f0(i11);
            c0();
        }
    }

    @NonNull
    public final String D() {
        if (this.f30572h == -2 || C() <= this.f30572h) {
            return NumberFormat.getInstance(this.f30569e.z()).format(C());
        }
        Context context = this.f30565a.get();
        return context == null ? "" : String.format(this.f30569e.z(), context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f30572h), "+");
    }

    public void D0(int i11) {
        int max = Math.max(0, i11);
        if (this.f30569e.y() != max) {
            this.f30569e.g0(max);
            d0();
        }
    }

    @Nullable
    public final String E() {
        Context context;
        if (this.f30569e.s() == 0 || (context = this.f30565a.get()) == null) {
            return null;
        }
        return (this.f30572h == -2 || C() <= this.f30572h) ? context.getResources().getQuantityString(this.f30569e.s(), C(), Integer.valueOf(C())) : context.getString(this.f30569e.p(), Integer.valueOf(this.f30572h));
    }

    public void E0(@Nullable String str) {
        if (TextUtils.equals(this.f30569e.B(), str)) {
            return;
        }
        this.f30569e.i0(str);
        e0();
    }

    public final float F(View view, float f11) {
        if (!(view.getParent() instanceof View)) {
            return 0.0f;
        }
        return ((this.f30570f + this.f30574j) - (((View) view.getParent()).getWidth() - view.getX())) + f11;
    }

    public void F0(@StyleRes int i11) {
        this.f30569e.j0(i11);
        a0();
    }

    @NonNull
    public BadgeState.State G() {
        return this.f30569e.A();
    }

    public void G0(int i11) {
        I0(i11);
        H0(i11);
    }

    @Nullable
    public String H() {
        return this.f30569e.B();
    }

    public void H0(@Px int i11) {
        this.f30569e.k0(i11);
        Q0();
    }

    @Nullable
    public final String I() {
        String H = H();
        int A2 = A();
        if (A2 == -2 || H == null || H.length() <= A2) {
            return H;
        }
        Context context = this.f30565a.get();
        if (context == null) {
            return "";
        }
        return String.format(context.getString(R.string.m3_exceed_max_badge_text_suffix), H.substring(0, A2 - 1), "…");
    }

    public void I0(@Px int i11) {
        this.f30569e.l0(i11);
        Q0();
    }

    @Nullable
    public final CharSequence J() {
        CharSequence q11 = this.f30569e.q();
        return q11 != null ? q11 : H();
    }

    public void J0(@Px int i11) {
        if (i11 != this.f30569e.m()) {
            this.f30569e.U(i11);
            Q0();
        }
    }

    public final float K(View view, float f11) {
        return (this.f30571g - this.f30575k) + view.getY() + f11;
    }

    public void K0(boolean z11) {
        this.f30569e.m0(z11);
        f0();
    }

    public final int L() {
        int t11 = R() ? this.f30569e.t() : this.f30569e.u();
        if (this.f30569e.f30525k == 1) {
            t11 += R() ? this.f30569e.f30524j : this.f30569e.f30523i;
        }
        return t11 + this.f30569e.d();
    }

    public final void L0(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != R.id.mtrl_anchor_parent) {
            WeakReference<FrameLayout> weakReference = this.f30577m;
            if (weakReference == null || weakReference.get() != viewGroup) {
                M0(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(R.id.mtrl_anchor_parent);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int indexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(indexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, indexOfChild);
                this.f30577m = new WeakReference<>(frameLayout);
                frameLayout.post(new RunnableC0364a(view, frameLayout));
            }
        }
    }

    public final int M() {
        int E = this.f30569e.E();
        if (R()) {
            E = this.f30569e.D();
            Context context = this.f30565a.get();
            if (context != null) {
                E = vm.b.c(E, E - this.f30569e.v(), vm.b.b(0.0f, 1.0f, 0.3f, 1.0f, c.f(context) - 1.0f));
            }
        }
        if (this.f30569e.f30525k == 0) {
            E -= Math.round(this.f30575k);
        }
        return E + this.f30569e.e();
    }

    public int N() {
        return this.f30569e.E();
    }

    public void N0(@NonNull View view) {
        P0(view, null);
    }

    @Px
    public int O() {
        return this.f30569e.D();
    }

    @Deprecated
    public void O0(@NonNull View view, @Nullable ViewGroup viewGroup) {
        if (!(viewGroup instanceof FrameLayout)) {
            throw new IllegalArgumentException("customBadgeParent must be a FrameLayout");
        }
        P0(view, (FrameLayout) viewGroup);
    }

    @Px
    public int P() {
        return this.f30569e.E();
    }

    public void P0(@NonNull View view, @Nullable FrameLayout frameLayout) {
        this.f30576l = new WeakReference<>(view);
        boolean z11 = com.google.android.material.badge.b.f30581a;
        if (z11 && frameLayout == null) {
            L0(view);
        } else {
            this.f30577m = new WeakReference<>(frameLayout);
        }
        if (!z11) {
            M0(view);
        }
        Q0();
        invalidateSelf();
    }

    @Px
    public int Q() {
        return this.f30569e.m();
    }

    public final void Q0() {
        Context context = this.f30565a.get();
        WeakReference<View> weakReference = this.f30576l;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f30568d);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<FrameLayout> weakReference2 = this.f30577m;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null || com.google.android.material.badge.b.f30581a) {
            if (frameLayout == null) {
                frameLayout = (ViewGroup) view.getParent();
            }
            frameLayout.offsetDescendantRectToMyCoords(view, rect2);
        }
        c(rect2, view);
        com.google.android.material.badge.b.o(this.f30568d, this.f30570f, this.f30571g, this.f30574j, this.f30575k);
        float f11 = this.f30573i;
        if (f11 != -1.0f) {
            this.f30566b.l0(f11);
        }
        if (rect.equals(this.f30568d)) {
            return;
        }
        this.f30566b.setBounds(this.f30568d);
    }

    public final boolean R() {
        return T() || S();
    }

    public final void R0() {
        if (A() != -2) {
            this.f30572h = ((int) Math.pow(10.0d, A() - 1.0d)) - 1;
        } else {
            this.f30572h = B();
        }
    }

    public boolean S() {
        return !this.f30569e.G() && this.f30569e.F();
    }

    public boolean T() {
        return this.f30569e.G();
    }

    public final boolean U() {
        FrameLayout s11 = s();
        return s11 != null && s11.getId() == R.id.mtrl_anchor_parent;
    }

    public final void V() {
        this.f30567c.g().setAlpha(getAlpha());
        invalidateSelf();
    }

    public final void W() {
        ColorStateList valueOf = ColorStateList.valueOf(this.f30569e.g());
        if (this.f30566b.z() != valueOf) {
            this.f30566b.p0(valueOf);
            invalidateSelf();
        }
    }

    public final void X() {
        this.f30567c.m(true);
        Z();
        Q0();
        invalidateSelf();
    }

    public final void Y() {
        WeakReference<View> weakReference = this.f30576l;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = this.f30576l.get();
        WeakReference<FrameLayout> weakReference2 = this.f30577m;
        P0(view, weakReference2 != null ? weakReference2.get() : null);
    }

    public final void Z() {
        Context context = this.f30565a.get();
        if (context == null) {
            return;
        }
        this.f30566b.setShapeAppearanceModel(p.b(context, R() ? this.f30569e.o() : this.f30569e.k(), R() ? this.f30569e.n() : this.f30569e.j()).m());
        invalidateSelf();
    }

    @Override // com.google.android.material.internal.a0.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void a() {
        invalidateSelf();
    }

    public final void a0() {
        d dVar;
        Context context = this.f30565a.get();
        if (context == null || this.f30567c.e() == (dVar = new d(context, this.f30569e.C()))) {
            return;
        }
        this.f30567c.l(dVar, context);
        b0();
        Q0();
        invalidateSelf();
    }

    public final void b(@NonNull View view) {
        float f11;
        float f12;
        View s11 = s();
        if (s11 == null) {
            if (!(view.getParent() instanceof View)) {
                return;
            }
            float y11 = view.getY();
            f12 = view.getX();
            s11 = (View) view.getParent();
            f11 = y11;
        } else if (!U()) {
            f11 = 0.0f;
            f12 = 0.0f;
        } else {
            if (!(s11.getParent() instanceof View)) {
                return;
            }
            f11 = s11.getY();
            f12 = s11.getX();
            s11 = (View) s11.getParent();
        }
        float K = K(s11, f11);
        float z11 = z(s11, f12);
        float q11 = q(s11, f11);
        float F = F(s11, f12);
        if (K < 0.0f) {
            this.f30571g += Math.abs(K);
        }
        if (z11 < 0.0f) {
            this.f30570f += Math.abs(z11);
        }
        if (q11 > 0.0f) {
            this.f30571g -= Math.abs(q11);
        }
        if (F > 0.0f) {
            this.f30570f -= Math.abs(F);
        }
    }

    public final void b0() {
        this.f30567c.g().setColor(this.f30569e.l());
        invalidateSelf();
    }

    public final void c(@NonNull Rect rect, @NonNull View view) {
        float f11 = R() ? this.f30569e.f30518d : this.f30569e.f30517c;
        this.f30573i = f11;
        if (f11 != -1.0f) {
            this.f30574j = f11;
            this.f30575k = f11;
        } else {
            this.f30574j = Math.round((R() ? this.f30569e.f30521g : this.f30569e.f30519e) / 2.0f);
            this.f30575k = Math.round((R() ? this.f30569e.f30522h : this.f30569e.f30520f) / 2.0f);
        }
        if (R()) {
            String m11 = m();
            this.f30574j = Math.max(this.f30574j, (this.f30567c.h(m11) / 2.0f) + this.f30569e.i());
            float max = Math.max(this.f30575k, (this.f30567c.f(m11) / 2.0f) + this.f30569e.m());
            this.f30575k = max;
            this.f30574j = Math.max(this.f30574j, max);
        }
        int M = M();
        int h11 = this.f30569e.h();
        if (h11 == 8388691 || h11 == 8388693) {
            this.f30571g = rect.bottom - M;
        } else {
            this.f30571g = rect.top + M;
        }
        int L = L();
        int h12 = this.f30569e.h();
        if (h12 == 8388659 || h12 == 8388691) {
            this.f30570f = ViewCompat.getLayoutDirection(view) == 0 ? (rect.left - this.f30574j) + L : (rect.right + this.f30574j) - L;
        } else {
            this.f30570f = ViewCompat.getLayoutDirection(view) == 0 ? (rect.right + this.f30574j) - L : (rect.left - this.f30574j) + L;
        }
        if (this.f30569e.H()) {
            b(view);
        }
    }

    public final void c0() {
        R0();
        this.f30567c.m(true);
        Q0();
        invalidateSelf();
    }

    public void d() {
        if (this.f30569e.F()) {
            this.f30569e.a();
            d0();
        }
    }

    public final void d0() {
        if (T()) {
            return;
        }
        X();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f30566b.draw(canvas);
        if (R()) {
            i(canvas);
        }
    }

    public void e() {
        if (this.f30569e.G()) {
            this.f30569e.b();
            e0();
        }
    }

    public final void e0() {
        X();
    }

    public final void f0() {
        boolean I = this.f30569e.I();
        setVisible(I, false);
        if (!com.google.android.material.badge.b.f30581a || s() == null || I) {
            return;
        }
        ((ViewGroup) s().getParent()).invalidate();
    }

    public final void g0() {
        Z();
        a0();
        c0();
        X();
        V();
        W();
        b0();
        Y();
        Q0();
        f0();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f30569e.f();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f30568d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f30568d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void h0(int i11) {
        this.f30569e.K(i11);
        Q0();
    }

    public final void i(Canvas canvas) {
        String m11 = m();
        if (m11 != null) {
            Rect rect = new Rect();
            this.f30567c.g().getTextBounds(m11, 0, m11.length(), rect);
            float exactCenterY = this.f30571g - rect.exactCenterY();
            canvas.drawText(m11, this.f30570f, rect.bottom <= 0 ? (int) exactCenterY : Math.round(exactCenterY), this.f30567c.g());
        }
    }

    public void i0(@Px int i11) {
        this.f30569e.L(i11);
        Q0();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public int j() {
        return this.f30569e.d();
    }

    public void j0(boolean z11) {
        if (this.f30569e.H() == z11) {
            return;
        }
        this.f30569e.N(z11);
        WeakReference<View> weakReference = this.f30576l;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        b(this.f30576l.get());
    }

    @Px
    public int k() {
        return this.f30569e.e();
    }

    public void k0(@ColorInt int i11) {
        this.f30569e.O(i11);
        W();
    }

    @ColorInt
    public int l() {
        return this.f30566b.z().getDefaultColor();
    }

    public void l0(int i11) {
        if (i11 == 8388691 || i11 == 8388693) {
            Log.w(f30552n, "Bottom badge gravities are deprecated; please use a top gravity instead.");
        }
        if (this.f30569e.h() != i11) {
            this.f30569e.P(i11);
            Y();
        }
    }

    @Nullable
    public final String m() {
        if (T()) {
            return I();
        }
        if (S()) {
            return D();
        }
        return null;
    }

    public void m0(@NonNull Locale locale) {
        if (locale.equals(this.f30569e.z())) {
            return;
        }
        this.f30569e.h0(locale);
        invalidateSelf();
    }

    public int n() {
        return this.f30569e.h();
    }

    public void n0(@ColorInt int i11) {
        if (this.f30567c.g().getColor() != i11) {
            this.f30569e.T(i11);
            b0();
        }
    }

    @NonNull
    public Locale o() {
        return this.f30569e.z();
    }

    public void o0(@StyleRes int i11) {
        this.f30569e.W(i11);
        Z();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.a0.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @ColorInt
    public int p() {
        return this.f30567c.g().getColor();
    }

    public void p0(@StyleRes int i11) {
        this.f30569e.V(i11);
        Z();
    }

    public final float q(View view, float f11) {
        if (!(view.getParent() instanceof View)) {
            return 0.0f;
        }
        return ((this.f30571g + this.f30575k) - (((View) view.getParent()).getHeight() - view.getY())) + f11;
    }

    public void q0(@StyleRes int i11) {
        this.f30569e.S(i11);
        Z();
    }

    @Nullable
    public CharSequence r() {
        if (isVisible()) {
            return T() ? J() : S() ? E() : t();
        }
        return null;
    }

    public void r0(@StyleRes int i11) {
        this.f30569e.R(i11);
        Z();
    }

    @Nullable
    public FrameLayout s() {
        WeakReference<FrameLayout> weakReference = this.f30577m;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void s0(@StringRes int i11) {
        this.f30569e.X(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f30569e.M(i11);
        V();
    }

    public final CharSequence t() {
        return this.f30569e.r();
    }

    public void t0(@Nullable CharSequence charSequence) {
        this.f30569e.Y(charSequence);
    }

    public int u() {
        return this.f30569e.u();
    }

    public void u0(CharSequence charSequence) {
        this.f30569e.Z(charSequence);
    }

    @Px
    public int v() {
        return this.f30569e.t();
    }

    public void v0(@PluralsRes int i11) {
        this.f30569e.a0(i11);
    }

    @Px
    public int w() {
        return this.f30569e.u();
    }

    public void w0(int i11) {
        y0(i11);
        x0(i11);
    }

    @Px
    public int x() {
        return this.f30569e.i();
    }

    public void x0(@Px int i11) {
        this.f30569e.b0(i11);
        Q0();
    }

    @Px
    public int y() {
        return this.f30569e.v();
    }

    public void y0(@Px int i11) {
        this.f30569e.c0(i11);
        Q0();
    }

    public final float z(View view, float f11) {
        return (this.f30570f - this.f30574j) + view.getX() + f11;
    }

    public void z0(@Px int i11) {
        if (i11 != this.f30569e.i()) {
            this.f30569e.Q(i11);
            Q0();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
