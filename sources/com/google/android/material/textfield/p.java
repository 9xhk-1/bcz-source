package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class p extends s {

    /* renamed from: s, reason: collision with root package name */
    @ChecksSdkIntAtLeast(api = 21)
    public static final boolean f32432s = true;

    /* renamed from: t, reason: collision with root package name */
    public static final int f32433t = 50;

    /* renamed from: u, reason: collision with root package name */
    public static final int f32434u = 67;

    /* renamed from: e, reason: collision with root package name */
    public final int f32435e;

    /* renamed from: f, reason: collision with root package name */
    public final int f32436f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f32437g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public AutoCompleteTextView f32438h;

    /* renamed from: i, reason: collision with root package name */
    public final View.OnClickListener f32439i;

    /* renamed from: j, reason: collision with root package name */
    public final View.OnFocusChangeListener f32440j;

    /* renamed from: k, reason: collision with root package name */
    public final AccessibilityManagerCompat.TouchExplorationStateChangeListener f32441k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f32442l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f32443m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f32444n;

    /* renamed from: o, reason: collision with root package name */
    public long f32445o;

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    public AccessibilityManager f32446p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f32447q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f32448r;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p.this.r();
            p.this.f32448r.start();
        }
    }

    public p(@NonNull r rVar) {
        super(rVar);
        this.f32439i = new View.OnClickListener() { // from class: com.google.android.material.textfield.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p.this.J();
            }
        };
        this.f32440j = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.m
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                p.y(p.this, view, z11);
            }
        };
        this.f32441k = new AccessibilityManagerCompat.TouchExplorationStateChangeListener() { // from class: com.google.android.material.textfield.n
            @Override // androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z11) {
                p.w(p.this, z11);
            }
        };
        this.f32445o = Long.MAX_VALUE;
        Context context = rVar.getContext();
        int i11 = R.attr.motionDurationShort3;
        this.f32436f = pn.j.f(context, i11, 67);
        this.f32435e = pn.j.f(rVar.getContext(), i11, 50);
        this.f32437g = pn.j.g(rVar.getContext(), R.attr.motionEasingLinearInterpolator, vm.b.f94060a);
    }

    public static /* synthetic */ void A(p pVar) {
        pVar.K();
        pVar.H(false);
    }

    @NonNull
    public static AutoCompleteTextView D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private void F() {
        this.f32448r = E(this.f32436f, 0.0f, 1.0f);
        ValueAnimator E = E(this.f32435e, 1.0f, 0.0f);
        this.f32447q = E;
        E.addListener(new a());
    }

    public static /* synthetic */ void v(p pVar) {
        boolean isPopupShowing = pVar.f32438h.isPopupShowing();
        pVar.H(isPopupShowing);
        pVar.f32443m = isPopupShowing;
    }

    public static /* synthetic */ void w(p pVar, boolean z11) {
        AutoCompleteTextView autoCompleteTextView = pVar.f32438h;
        if (autoCompleteTextView == null || q.a(autoCompleteTextView)) {
            return;
        }
        ViewCompat.setImportantForAccessibility(pVar.f32483d, z11 ? 2 : 1);
    }

    public static /* synthetic */ void x(p pVar, ValueAnimator valueAnimator) {
        pVar.getClass();
        pVar.f32483d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(p pVar, View view, boolean z11) {
        pVar.f32442l = z11;
        pVar.r();
        if (z11) {
            return;
        }
        pVar.H(false);
        pVar.f32443m = false;
    }

    public static /* synthetic */ boolean z(p pVar, View view, MotionEvent motionEvent) {
        pVar.getClass();
        if (motionEvent.getAction() == 1) {
            if (pVar.G()) {
                pVar.f32443m = false;
            }
            pVar.J();
            pVar.K();
        }
        return false;
    }

    public final ValueAnimator E(int i11, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f32437g);
        ofFloat.setDuration(i11);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                p.x(p.this, valueAnimator);
            }
        });
        return ofFloat;
    }

    public final boolean G() {
        long currentTimeMillis = System.currentTimeMillis() - this.f32445o;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    public final void H(boolean z11) {
        if (this.f32444n != z11) {
            this.f32444n = z11;
            this.f32448r.cancel();
            this.f32447q.start();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void I() {
        this.f32438h.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return p.z(p.this, view, motionEvent);
            }
        });
        if (f32432s) {
            this.f32438h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.k
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    p.A(p.this);
                }
            });
        }
        this.f32438h.setThreshold(0);
    }

    public final void J() {
        if (this.f32438h == null) {
            return;
        }
        if (G()) {
            this.f32443m = false;
        }
        if (this.f32443m) {
            this.f32443m = false;
            return;
        }
        if (f32432s) {
            H(!this.f32444n);
        } else {
            this.f32444n = !this.f32444n;
            r();
        }
        if (!this.f32444n) {
            this.f32438h.dismissDropDown();
        } else {
            this.f32438h.requestFocus();
            this.f32438h.showDropDown();
        }
    }

    public final void K() {
        this.f32443m = true;
        this.f32445o = System.currentTimeMillis();
    }

    @Override // com.google.android.material.textfield.s
    public void a(Editable editable) {
        if (this.f32446p.isTouchExplorationEnabled() && q.a(this.f32438h) && !this.f32483d.hasFocus()) {
            this.f32438h.dismissDropDown();
        }
        this.f32438h.post(new Runnable() { // from class: com.google.android.material.textfield.o
            @Override // java.lang.Runnable
            public final void run() {
                p.v(p.this);
            }
        });
    }

    @Override // com.google.android.material.textfield.s
    public int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // com.google.android.material.textfield.s
    public int d() {
        return f32432s ? R.drawable.mtrl_dropdown_arrow : R.drawable.mtrl_ic_arrow_drop_down;
    }

    @Override // com.google.android.material.textfield.s
    public View.OnFocusChangeListener e() {
        return this.f32440j;
    }

    @Override // com.google.android.material.textfield.s
    public View.OnClickListener f() {
        return this.f32439i;
    }

    @Override // com.google.android.material.textfield.s
    public AccessibilityManagerCompat.TouchExplorationStateChangeListener h() {
        return this.f32441k;
    }

    @Override // com.google.android.material.textfield.s
    public boolean i(int i11) {
        return i11 != 0;
    }

    @Override // com.google.android.material.textfield.s
    public boolean j() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    public boolean k() {
        return this.f32442l;
    }

    @Override // com.google.android.material.textfield.s
    public boolean l() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    public boolean m() {
        return this.f32444n;
    }

    @Override // com.google.android.material.textfield.s
    public void n(@Nullable EditText editText) {
        this.f32438h = D(editText);
        I();
        this.f32480a.setErrorIconDrawable((Drawable) null);
        if (!q.a(editText) && this.f32446p.isTouchExplorationEnabled()) {
            ViewCompat.setImportantForAccessibility(this.f32483d, 2);
        }
        this.f32480a.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.s
    public void o(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (!q.a(this.f32438h)) {
            accessibilityNodeInfoCompat.setClassName(Spinner.class.getName());
        }
        if (accessibilityNodeInfoCompat.isShowingHintText()) {
            accessibilityNodeInfoCompat.setHintText(null);
        }
    }

    @Override // com.google.android.material.textfield.s
    @SuppressLint({"WrongConstant"})
    public void p(View view, @NonNull AccessibilityEvent accessibilityEvent) {
        if (!this.f32446p.isEnabled() || q.a(this.f32438h)) {
            return;
        }
        boolean z11 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f32444n && !this.f32438h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z11) {
            J();
            K();
        }
    }

    @Override // com.google.android.material.textfield.s
    public void s() {
        F();
        this.f32446p = (AccessibilityManager) this.f32482c.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.s
    public boolean t() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    @SuppressLint({"ClickableViewAccessibility"})
    public void u() {
        AutoCompleteTextView autoCompleteTextView = this.f32438h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (f32432s) {
                this.f32438h.setOnDismissListener(null);
            }
        }
    }
}
