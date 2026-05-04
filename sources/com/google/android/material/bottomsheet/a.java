package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AppCompatDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.m0;
import en.u;
import vn.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a extends AppCompatDialog {

    /* renamed from: a, reason: collision with root package name */
    public BottomSheetBehavior<FrameLayout> f30779a;

    /* renamed from: b, reason: collision with root package name */
    public FrameLayout f30780b;

    /* renamed from: c, reason: collision with root package name */
    public CoordinatorLayout f30781c;

    /* renamed from: d, reason: collision with root package name */
    public FrameLayout f30782d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f30783e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f30784f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f30785g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f30786h;

    /* renamed from: i, reason: collision with root package name */
    public f f30787i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f30788j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public pn.c f30789k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public BottomSheetBehavior.g f30790l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.google.android.material.bottomsheet.a$a, reason: collision with other inner class name */
    public class C0366a implements OnApplyWindowInsetsListener {
        public C0366a() {
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            if (a.this.f30787i != null) {
                a.this.f30779a.s0(a.this.f30787i);
            }
            if (windowInsetsCompat != null) {
                a aVar = a.this;
                aVar.f30787i = new f(aVar.f30782d, windowInsetsCompat, null);
                a.this.f30787i.e(a.this.getWindow());
                a.this.f30779a.B(a.this.f30787i);
            }
            return windowInsetsCompat;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            if (aVar.f30784f && aVar.isShowing() && a.this.m()) {
                a.this.cancel();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends AccessibilityDelegateCompat {
        public c() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            if (!a.this.f30784f) {
                accessibilityNodeInfoCompat.setDismissable(false);
            } else {
                accessibilityNodeInfoCompat.addAction(1048576);
                accessibilityNodeInfoCompat.setDismissable(true);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
            if (i11 == 1048576) {
                a aVar = a.this;
                if (aVar.f30784f) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.performAccessibilityAction(view, i11, bundle);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements View.OnTouchListener {
        public d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f extends BottomSheetBehavior.g {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        public final Boolean f30796a;

        /* renamed from: b, reason: collision with root package name */
        @NonNull
        public final WindowInsetsCompat f30797b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        public Window f30798c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f30799d;

        public /* synthetic */ f(View view, WindowInsetsCompat windowInsetsCompat, C0366a c0366a) {
            this(view, windowInsetsCompat);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void a(@NonNull View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(@NonNull View view, float f11) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(@NonNull View view, int i11) {
            d(view);
        }

        public final void d(View view) {
            if (view.getTop() < this.f30797b.getSystemWindowInsetTop()) {
                Window window = this.f30798c;
                if (window != null) {
                    Boolean bool = this.f30796a;
                    com.google.android.material.internal.e.g(window, bool == null ? this.f30799d : bool.booleanValue());
                }
                view.setPadding(view.getPaddingLeft(), this.f30797b.getSystemWindowInsetTop() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.f30798c;
                if (window2 != null) {
                    com.google.android.material.internal.e.g(window2, this.f30799d);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        public void e(@Nullable Window window) {
            if (this.f30798c == window) {
                return;
            }
            this.f30798c = window;
            if (window != null) {
                this.f30799d = WindowCompat.getInsetsController(window, window.getDecorView()).isAppearanceLightStatusBars();
            }
        }

        public f(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
            this.f30797b = windowInsetsCompat;
            k Y = BottomSheetBehavior.R(view).Y();
            ColorStateList z11 = Y != null ? Y.z() : ViewCompat.getBackgroundTintList(view);
            if (z11 != null) {
                this.f30796a = Boolean.valueOf(u.q(z11.getDefaultColor()));
                return;
            }
            Integer j11 = m0.j(view);
            if (j11 != null) {
                this.f30796a = Boolean.valueOf(u.q(j11.intValue()));
            } else {
                this.f30796a = null;
            }
        }
    }

    public a(@NonNull Context context) {
        this(context, 0);
        this.f30788j = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    public static int getThemeResId(@NonNull Context context, int i11) {
        if (i11 != 0) {
            return i11;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
    }

    @Deprecated
    public static void l(@NonNull View view, boolean z11) {
        int systemUiVisibility = view.getSystemUiVisibility();
        view.setSystemUiVisibility(z11 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> g11 = g();
        if (!this.f30783e || g11.getState() == 5) {
            super.cancel();
        } else {
            g11.g(5);
        }
    }

    public final FrameLayout f() {
        if (this.f30780b == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.f30780b = frameLayout;
            this.f30781c = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f30780b.findViewById(R.id.design_bottom_sheet);
            this.f30782d = frameLayout2;
            BottomSheetBehavior<FrameLayout> R = BottomSheetBehavior.R(frameLayout2);
            this.f30779a = R;
            R.B(this.f30790l);
            this.f30779a.F0(this.f30784f);
            this.f30789k = new pn.c(this.f30779a, this.f30782d);
        }
        return this.f30780b;
    }

    @NonNull
    public BottomSheetBehavior<FrameLayout> g() {
        if (this.f30779a == null) {
            f();
        }
        return this.f30779a;
    }

    public boolean h() {
        return this.f30783e;
    }

    public boolean i() {
        return this.f30788j;
    }

    public void j() {
        this.f30779a.s0(this.f30790l);
    }

    public void k(boolean z11) {
        this.f30783e = z11;
    }

    public boolean m() {
        if (!this.f30786h) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside});
            this.f30785g = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.f30786h = true;
        }
        return this.f30785g;
    }

    public final void n() {
        pn.c cVar = this.f30789k;
        if (cVar == null) {
            return;
        }
        if (this.f30784f) {
            cVar.c();
        } else {
            cVar.f();
        }
    }

    public final View o(int i11, @Nullable View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        f();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f30780b.findViewById(R.id.coordinator);
        if (i11 != 0 && view == null) {
            view = getLayoutInflater().inflate(i11, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f30788j) {
            ViewCompat.setOnApplyWindowInsetsListener(this.f30782d, new C0366a());
        }
        this.f30782d.removeAllViews();
        if (layoutParams == null) {
            this.f30782d.addView(view);
        } else {
            this.f30782d.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new b());
        ViewCompat.setAccessibilityDelegate(this.f30782d, new c());
        this.f30782d.setOnTouchListener(new d());
        return this.f30780b;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z11 = this.f30788j && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f30780b;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z11);
            }
            CoordinatorLayout coordinatorLayout = this.f30781c;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z11);
            }
            WindowCompat.setDecorFitsSystemWindows(window, !z11);
            f fVar = this.f30787i;
            if (fVar != null) {
                fVar.e(window);
            }
        }
        n();
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        f fVar = this.f30787i;
        if (fVar != null) {
            fVar.e(null);
        }
        pn.c cVar = this.f30789k;
        if (cVar != null) {
            cVar.f();
        }
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f30779a;
        if (bottomSheetBehavior == null || bottomSheetBehavior.getState() != 5) {
            return;
        }
        this.f30779a.g(4);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z11) {
        super.setCancelable(z11);
        if (this.f30784f != z11) {
            this.f30784f = z11;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f30779a;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.F0(z11);
            }
            if (getWindow() != null) {
                n();
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z11) {
        super.setCanceledOnTouchOutside(z11);
        if (z11 && !this.f30784f) {
            this.f30784f = true;
        }
        this.f30785g = z11;
        this.f30786h = true;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(@LayoutRes int i11) {
        super.setContentView(o(i11, null, null));
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(o(0, view, null));
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(o(0, view, layoutParams));
    }

    public a(@NonNull Context context, @StyleRes int i11) {
        super(context, getThemeResId(context, i11));
        this.f30784f = true;
        this.f30785g = true;
        this.f30790l = new e();
        supportRequestWindowFeature(1);
        this.f30788j = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    public a(@NonNull Context context, boolean z11, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z11, onCancelListener);
        this.f30784f = true;
        this.f30785g = true;
        this.f30790l = new e();
        supportRequestWindowFeature(1);
        this.f30784f = z11;
        this.f30788j = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends BottomSheetBehavior.g {
        public e() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(@NonNull View view, int i11) {
            if (i11 == 5) {
                a.this.cancel();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(@NonNull View view, float f11) {
        }
    }
}
