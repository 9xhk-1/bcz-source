package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.m0;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public class r extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f32450a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f32451b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final CheckableImageButton f32452c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f32453d;

    /* renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f32454e;

    /* renamed from: f, reason: collision with root package name */
    public View.OnLongClickListener f32455f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final CheckableImageButton f32456g;

    /* renamed from: h, reason: collision with root package name */
    public final d f32457h;

    /* renamed from: i, reason: collision with root package name */
    public int f32458i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashSet<TextInputLayout.i> f32459j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f32460k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f32461l;

    /* renamed from: m, reason: collision with root package name */
    public int f32462m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public ImageView.ScaleType f32463n;

    /* renamed from: o, reason: collision with root package name */
    public View.OnLongClickListener f32464o;

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    public CharSequence f32465p;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    public final TextView f32466q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f32467r;

    /* renamed from: s, reason: collision with root package name */
    public EditText f32468s;

    /* renamed from: t, reason: collision with root package name */
    @Nullable
    public final AccessibilityManager f32469t;

    /* renamed from: u, reason: collision with root package name */
    @Nullable
    public AccessibilityManagerCompat.TouchExplorationStateChangeListener f32470u;

    /* renamed from: v, reason: collision with root package name */
    public final TextWatcher f32471v;

    /* renamed from: w, reason: collision with root package name */
    public final TextInputLayout.h f32472w;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends com.google.android.material.internal.c0 {
        public a() {
        }

        @Override // com.google.android.material.internal.c0, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            r.this.o().a(editable);
        }

        @Override // com.google.android.material.internal.c0, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            r.this.o().b(charSequence, i11, i12, i13);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements TextInputLayout.h {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.h
        public void a(@NonNull TextInputLayout textInputLayout) {
            if (r.this.f32468s == textInputLayout.getEditText()) {
                return;
            }
            if (r.this.f32468s != null) {
                r.this.f32468s.removeTextChangedListener(r.this.f32471v);
                if (r.this.f32468s.getOnFocusChangeListener() == r.this.o().e()) {
                    r.this.f32468s.setOnFocusChangeListener(null);
                }
            }
            r.this.f32468s = textInputLayout.getEditText();
            if (r.this.f32468s != null) {
                r.this.f32468s.addTextChangedListener(r.this.f32471v);
            }
            r.this.o().n(r.this.f32468s);
            r rVar = r.this;
            rVar.m0(rVar.o());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            r.this.h();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            r.this.R();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final SparseArray<s> f32476a = new SparseArray<>();

        /* renamed from: b, reason: collision with root package name */
        public final r f32477b;

        /* renamed from: c, reason: collision with root package name */
        public final int f32478c;

        /* renamed from: d, reason: collision with root package name */
        public final int f32479d;

        public d(r rVar, TintTypedArray tintTypedArray) {
            this.f32477b = rVar;
            this.f32478c = tintTypedArray.getResourceId(R.styleable.TextInputLayout_endIconDrawable, 0);
            this.f32479d = tintTypedArray.getResourceId(R.styleable.TextInputLayout_passwordToggleDrawable, 0);
        }

        public final s b(int i11) {
            if (i11 == -1) {
                return new g(this.f32477b);
            }
            if (i11 == 0) {
                return new v(this.f32477b);
            }
            if (i11 == 1) {
                return new x(this.f32477b, this.f32479d);
            }
            if (i11 == 2) {
                return new f(this.f32477b);
            }
            if (i11 == 3) {
                return new p(this.f32477b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i11);
        }

        public s c(int i11) {
            s sVar = this.f32476a.get(i11);
            if (sVar != null) {
                return sVar;
            }
            s b11 = b(i11);
            this.f32476a.append(i11, b11);
            return b11;
        }
    }

    public r(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        super(textInputLayout.getContext());
        this.f32458i = 0;
        this.f32459j = new LinkedHashSet<>();
        this.f32471v = new a();
        b bVar = new b();
        this.f32472w = bVar;
        this.f32469t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f32450a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, GravityCompat.END));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f32451b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton k11 = k(this, from, R.id.text_input_error_icon);
        this.f32452c = k11;
        CheckableImageButton k12 = k(frameLayout, from, R.id.text_input_end_icon);
        this.f32456g = k12;
        this.f32457h = new d(this, tintTypedArray);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f32466q = appCompatTextView;
        E(tintTypedArray);
        D(tintTypedArray);
        F(tintTypedArray);
        frameLayout.addView(k12);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(k11);
        textInputLayout.i(bVar);
        addOnAttachStateChangeListener(new c());
    }

    public int A() {
        return ViewCompat.getPaddingEnd(this) + ViewCompat.getPaddingEnd(this.f32466q) + ((I() || J()) ? this.f32456g.getMeasuredWidth() + MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) this.f32456g.getLayoutParams()) : 0);
    }

    public void A0(boolean z11) {
        if (this.f32458i == 1) {
            this.f32456g.performClick();
            if (z11) {
                this.f32456g.jumpDrawablesToCurrentState();
            }
        }
    }

    public TextView B() {
        return this.f32466q;
    }

    public final void B0() {
        this.f32451b.setVisibility((this.f32456g.getVisibility() != 0 || J()) ? 8 : 0);
        setVisibility((I() || J() || !((this.f32465p == null || this.f32467r) ? 8 : false)) ? 0 : 8);
    }

    public boolean C() {
        return this.f32458i != 0;
    }

    public final void C0() {
        this.f32452c.setVisibility(u() != null && this.f32450a.T() && this.f32450a.v0() ? 0 : 8);
        B0();
        D0();
        if (C()) {
            return;
        }
        this.f32450a.G0();
    }

    public final void D(TintTypedArray tintTypedArray) {
        int i11 = R.styleable.TextInputLayout_passwordToggleEnabled;
        if (!tintTypedArray.hasValue(i11)) {
            int i12 = R.styleable.TextInputLayout_endIconTint;
            if (tintTypedArray.hasValue(i12)) {
                this.f32460k = sn.c.b(getContext(), tintTypedArray, i12);
            }
            int i13 = R.styleable.TextInputLayout_endIconTintMode;
            if (tintTypedArray.hasValue(i13)) {
                this.f32461l = m0.t(tintTypedArray.getInt(i13, -1), null);
            }
        }
        int i14 = R.styleable.TextInputLayout_endIconMode;
        if (tintTypedArray.hasValue(i14)) {
            Z(tintTypedArray.getInt(i14, 0));
            int i15 = R.styleable.TextInputLayout_endIconContentDescription;
            if (tintTypedArray.hasValue(i15)) {
                V(tintTypedArray.getText(i15));
            }
            T(tintTypedArray.getBoolean(R.styleable.TextInputLayout_endIconCheckable, true));
        } else if (tintTypedArray.hasValue(i11)) {
            int i16 = R.styleable.TextInputLayout_passwordToggleTint;
            if (tintTypedArray.hasValue(i16)) {
                this.f32460k = sn.c.b(getContext(), tintTypedArray, i16);
            }
            int i17 = R.styleable.TextInputLayout_passwordToggleTintMode;
            if (tintTypedArray.hasValue(i17)) {
                this.f32461l = m0.t(tintTypedArray.getInt(i17, -1), null);
            }
            Z(tintTypedArray.getBoolean(i11, false) ? 1 : 0);
            V(tintTypedArray.getText(R.styleable.TextInputLayout_passwordToggleContentDescription));
        }
        Y(tintTypedArray.getDimensionPixelSize(R.styleable.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size)));
        int i18 = R.styleable.TextInputLayout_endIconScaleType;
        if (tintTypedArray.hasValue(i18)) {
            c0(t.b(tintTypedArray.getInt(i18, -1)));
        }
    }

    public void D0() {
        if (this.f32450a.f32352d == null) {
            return;
        }
        ViewCompat.setPaddingRelative(this.f32466q, getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), this.f32450a.f32352d.getPaddingTop(), (I() || J()) ? 0 : ViewCompat.getPaddingEnd(this.f32450a.f32352d), this.f32450a.f32352d.getPaddingBottom());
    }

    public final void E(TintTypedArray tintTypedArray) {
        int i11 = R.styleable.TextInputLayout_errorIconTint;
        if (tintTypedArray.hasValue(i11)) {
            this.f32453d = sn.c.b(getContext(), tintTypedArray, i11);
        }
        int i12 = R.styleable.TextInputLayout_errorIconTintMode;
        if (tintTypedArray.hasValue(i12)) {
            this.f32454e = m0.t(tintTypedArray.getInt(i12, -1), null);
        }
        int i13 = R.styleable.TextInputLayout_errorIconDrawable;
        if (tintTypedArray.hasValue(i13)) {
            h0(tintTypedArray.getDrawable(i13));
        }
        this.f32452c.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        ViewCompat.setImportantForAccessibility(this.f32452c, 2);
        this.f32452c.setClickable(false);
        this.f32452c.setPressable(false);
        this.f32452c.setFocusable(false);
    }

    public final void E0() {
        int visibility = this.f32466q.getVisibility();
        int i11 = (this.f32465p == null || this.f32467r) ? 8 : 0;
        if (visibility != i11) {
            o().q(i11 == 0);
        }
        B0();
        this.f32466q.setVisibility(i11);
        this.f32450a.G0();
    }

    public final void F(TintTypedArray tintTypedArray) {
        this.f32466q.setVisibility(8);
        this.f32466q.setId(R.id.textinput_suffix_text);
        this.f32466q.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        ViewCompat.setAccessibilityLiveRegion(this.f32466q, 1);
        v0(tintTypedArray.getResourceId(R.styleable.TextInputLayout_suffixTextAppearance, 0));
        int i11 = R.styleable.TextInputLayout_suffixTextColor;
        if (tintTypedArray.hasValue(i11)) {
            w0(tintTypedArray.getColorStateList(i11));
        }
        u0(tintTypedArray.getText(R.styleable.TextInputLayout_suffixText));
    }

    public boolean G() {
        return this.f32456g.a();
    }

    public boolean H() {
        return C() && this.f32456g.isChecked();
    }

    public boolean I() {
        return this.f32451b.getVisibility() == 0 && this.f32456g.getVisibility() == 0;
    }

    public boolean J() {
        return this.f32452c.getVisibility() == 0;
    }

    public boolean K() {
        return this.f32458i == 1;
    }

    public void L(boolean z11) {
        this.f32467r = z11;
        E0();
    }

    public void M() {
        C0();
        O();
        N();
        if (o().t()) {
            z0(this.f32450a.v0());
        }
    }

    public void N() {
        t.d(this.f32450a, this.f32456g, this.f32460k);
    }

    public void O() {
        t.d(this.f32450a, this.f32452c, this.f32453d);
    }

    public void P(boolean z11) {
        boolean z12;
        boolean isActivated;
        boolean isChecked;
        s o11 = o();
        boolean z13 = true;
        if (!o11.l() || (isChecked = this.f32456g.isChecked()) == o11.m()) {
            z12 = false;
        } else {
            this.f32456g.setChecked(!isChecked);
            z12 = true;
        }
        if (!o11.j() || (isActivated = this.f32456g.isActivated()) == o11.k()) {
            z13 = z12;
        } else {
            S(!isActivated);
        }
        if (z11 || z13) {
            N();
        }
    }

    public void Q(@NonNull TextInputLayout.i iVar) {
        this.f32459j.remove(iVar);
    }

    public final void R() {
        AccessibilityManager accessibilityManager;
        AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f32470u;
        if (touchExplorationStateChangeListener == null || (accessibilityManager = this.f32469t) == null) {
            return;
        }
        AccessibilityManagerCompat.removeTouchExplorationStateChangeListener(accessibilityManager, touchExplorationStateChangeListener);
    }

    public void S(boolean z11) {
        this.f32456g.setActivated(z11);
    }

    public void T(boolean z11) {
        this.f32456g.setCheckable(z11);
    }

    public void U(@StringRes int i11) {
        V(i11 != 0 ? getResources().getText(i11) : null);
    }

    public void V(@Nullable CharSequence charSequence) {
        if (n() != charSequence) {
            this.f32456g.setContentDescription(charSequence);
        }
    }

    public void W(@DrawableRes int i11) {
        X(i11 != 0 ? AppCompatResources.getDrawable(getContext(), i11) : null);
    }

    public void X(@Nullable Drawable drawable) {
        this.f32456g.setImageDrawable(drawable);
        if (drawable != null) {
            t.a(this.f32450a, this.f32456g, this.f32460k, this.f32461l);
            N();
        }
    }

    public void Y(@Px int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i11 != this.f32462m) {
            this.f32462m = i11;
            t.g(this.f32456g, i11);
            t.g(this.f32452c, i11);
        }
    }

    public void Z(int i11) {
        if (this.f32458i == i11) {
            return;
        }
        y0(o());
        int i12 = this.f32458i;
        this.f32458i = i11;
        l(i12);
        f0(i11 != 0);
        s o11 = o();
        W(v(o11));
        U(o11.c());
        T(o11.l());
        if (!o11.i(this.f32450a.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.f32450a.getBoxBackgroundMode() + " is not supported by the end icon mode " + i11);
        }
        x0(o11);
        a0(o11.f());
        EditText editText = this.f32468s;
        if (editText != null) {
            o11.n(editText);
            m0(o11);
        }
        t.a(this.f32450a, this.f32456g, this.f32460k, this.f32461l);
        P(true);
    }

    public void a0(@Nullable View.OnClickListener onClickListener) {
        t.h(this.f32456g, onClickListener, this.f32464o);
    }

    public void b0(@Nullable View.OnLongClickListener onLongClickListener) {
        this.f32464o = onLongClickListener;
        t.i(this.f32456g, onLongClickListener);
    }

    public void c0(@NonNull ImageView.ScaleType scaleType) {
        this.f32463n = scaleType;
        t.j(this.f32456g, scaleType);
        t.j(this.f32452c, scaleType);
    }

    public void d0(@Nullable ColorStateList colorStateList) {
        if (this.f32460k != colorStateList) {
            this.f32460k = colorStateList;
            t.a(this.f32450a, this.f32456g, colorStateList, this.f32461l);
        }
    }

    public void e0(@Nullable PorterDuff.Mode mode) {
        if (this.f32461l != mode) {
            this.f32461l = mode;
            t.a(this.f32450a, this.f32456g, this.f32460k, mode);
        }
    }

    public void f0(boolean z11) {
        if (I() != z11) {
            this.f32456g.setVisibility(z11 ? 0 : 8);
            B0();
            D0();
            this.f32450a.G0();
        }
    }

    public void g(@NonNull TextInputLayout.i iVar) {
        this.f32459j.add(iVar);
    }

    public void g0(@DrawableRes int i11) {
        h0(i11 != 0 ? AppCompatResources.getDrawable(getContext(), i11) : null);
        O();
    }

    public final void h() {
        if (this.f32470u == null || this.f32469t == null || !ViewCompat.isAttachedToWindow(this)) {
            return;
        }
        AccessibilityManagerCompat.addTouchExplorationStateChangeListener(this.f32469t, this.f32470u);
    }

    public void h0(@Nullable Drawable drawable) {
        this.f32452c.setImageDrawable(drawable);
        C0();
        t.a(this.f32450a, this.f32452c, this.f32453d, this.f32454e);
    }

    public void i() {
        this.f32456g.performClick();
        this.f32456g.jumpDrawablesToCurrentState();
    }

    public void i0(@Nullable View.OnClickListener onClickListener) {
        t.h(this.f32452c, onClickListener, this.f32455f);
    }

    public void j() {
        this.f32459j.clear();
    }

    public void j0(@Nullable View.OnLongClickListener onLongClickListener) {
        this.f32455f = onLongClickListener;
        t.i(this.f32452c, onLongClickListener);
    }

    public final CheckableImageButton k(ViewGroup viewGroup, LayoutInflater layoutInflater, @IdRes int i11) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i11);
        t.e(checkableImageButton);
        if (sn.c.j(getContext())) {
            MarginLayoutParamsCompat.setMarginStart((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    public void k0(@Nullable ColorStateList colorStateList) {
        if (this.f32453d != colorStateList) {
            this.f32453d = colorStateList;
            t.a(this.f32450a, this.f32452c, colorStateList, this.f32454e);
        }
    }

    public final void l(int i11) {
        Iterator<TextInputLayout.i> it = this.f32459j.iterator();
        while (it.hasNext()) {
            it.next().a(this.f32450a, i11);
        }
    }

    public void l0(@Nullable PorterDuff.Mode mode) {
        if (this.f32454e != mode) {
            this.f32454e = mode;
            t.a(this.f32450a, this.f32452c, this.f32453d, mode);
        }
    }

    @Nullable
    public CheckableImageButton m() {
        if (J()) {
            return this.f32452c;
        }
        if (C() && I()) {
            return this.f32456g;
        }
        return null;
    }

    public final void m0(s sVar) {
        if (this.f32468s == null) {
            return;
        }
        if (sVar.e() != null) {
            this.f32468s.setOnFocusChangeListener(sVar.e());
        }
        if (sVar.g() != null) {
            this.f32456g.setOnFocusChangeListener(sVar.g());
        }
    }

    @Nullable
    public CharSequence n() {
        return this.f32456g.getContentDescription();
    }

    public void n0(@StringRes int i11) {
        o0(i11 != 0 ? getResources().getText(i11) : null);
    }

    public s o() {
        return this.f32457h.c(this.f32458i);
    }

    public void o0(@Nullable CharSequence charSequence) {
        this.f32456g.setContentDescription(charSequence);
    }

    @Nullable
    public Drawable p() {
        return this.f32456g.getDrawable();
    }

    public void p0(@DrawableRes int i11) {
        q0(i11 != 0 ? AppCompatResources.getDrawable(getContext(), i11) : null);
    }

    public int q() {
        return this.f32462m;
    }

    public void q0(@Nullable Drawable drawable) {
        this.f32456g.setImageDrawable(drawable);
    }

    public int r() {
        return this.f32458i;
    }

    public void r0(boolean z11) {
        if (z11 && this.f32458i != 1) {
            Z(1);
        } else {
            if (z11) {
                return;
            }
            Z(0);
        }
    }

    @NonNull
    public ImageView.ScaleType s() {
        return this.f32463n;
    }

    public void s0(@Nullable ColorStateList colorStateList) {
        this.f32460k = colorStateList;
        t.a(this.f32450a, this.f32456g, colorStateList, this.f32461l);
    }

    public CheckableImageButton t() {
        return this.f32456g;
    }

    public void t0(@Nullable PorterDuff.Mode mode) {
        this.f32461l = mode;
        t.a(this.f32450a, this.f32456g, this.f32460k, mode);
    }

    public Drawable u() {
        return this.f32452c.getDrawable();
    }

    public void u0(@Nullable CharSequence charSequence) {
        this.f32465p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f32466q.setText(charSequence);
        E0();
    }

    public final int v(s sVar) {
        int i11 = this.f32457h.f32478c;
        return i11 == 0 ? sVar.d() : i11;
    }

    public void v0(@StyleRes int i11) {
        TextViewCompat.setTextAppearance(this.f32466q, i11);
    }

    @Nullable
    public CharSequence w() {
        return this.f32456g.getContentDescription();
    }

    public void w0(@NonNull ColorStateList colorStateList) {
        this.f32466q.setTextColor(colorStateList);
    }

    @Nullable
    public Drawable x() {
        return this.f32456g.getDrawable();
    }

    public final void x0(@NonNull s sVar) {
        sVar.s();
        this.f32470u = sVar.h();
        h();
    }

    @Nullable
    public CharSequence y() {
        return this.f32465p;
    }

    public final void y0(@NonNull s sVar) {
        R();
        this.f32470u = null;
        sVar.u();
    }

    @Nullable
    public ColorStateList z() {
        return this.f32466q.getTextColors();
    }

    public final void z0(boolean z11) {
        if (!z11 || p() == null) {
            t.a(this.f32450a, this.f32456g, this.f32460k, this.f32461l);
            return;
        }
        Drawable mutate = DrawableCompat.wrap(p()).mutate();
        DrawableCompat.setTint(mutate, this.f32450a.getErrorCurrentTextColors());
        this.f32456g.setImageDrawable(mutate);
    }
}
