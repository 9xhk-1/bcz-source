package wn;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.GravityInt;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AppCompatDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import wn.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class g<C extends d> extends AppCompatDialog {

    /* renamed from: i, reason: collision with root package name */
    public static final int f96518i = R.id.coordinator;

    /* renamed from: j, reason: collision with root package name */
    public static final int f96519j = R.id.touch_outside;

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public c<C> f96520a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public FrameLayout f96521b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public FrameLayout f96522c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f96523d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f96524e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f96525f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f96526g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public pn.c f96527h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends AccessibilityDelegateCompat {
        public a() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            if (!g.this.f96524e) {
                accessibilityNodeInfoCompat.setDismissable(false);
            } else {
                accessibilityNodeInfoCompat.addAction(1048576);
                accessibilityNodeInfoCompat.setDismissable(true);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
            if (i11 == 1048576) {
                g gVar = g.this;
                if (gVar.f96524e) {
                    gVar.cancel();
                    return true;
                }
            }
            return super.performAccessibilityAction(view, i11, bundle);
        }
    }

    public g(@NonNull Context context, @StyleRes int i11, @AttrRes int i12, @StyleRes int i13) {
        super(context, l(context, i11, i12, i13));
        this.f96524e = true;
        this.f96525f = true;
        supportRequestWindowFeature(1);
    }

    public static /* synthetic */ void b(g gVar, View view) {
        if (gVar.f96524e && gVar.isShowing() && gVar.q()) {
            gVar.cancel();
        }
    }

    @NonNull
    private FrameLayout g() {
        if (this.f96521b == null) {
            d();
        }
        return this.f96521b;
    }

    public static int l(@NonNull Context context, @StyleRes int i11, @AttrRes int i12, @StyleRes int i13) {
        if (i11 != 0) {
            return i11;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(i12, typedValue, true) ? typedValue.resourceId : i13;
    }

    private boolean q() {
        if (!this.f96526g) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside});
            this.f96525f = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.f96526g = true;
        }
        return this.f96525f;
    }

    private void r() {
        pn.c cVar = this.f96527h;
        if (cVar == null) {
            return;
        }
        if (this.f96524e) {
            cVar.c();
        } else {
            cVar.f();
        }
    }

    public abstract void c(c<C> cVar);

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        c<C> e11 = e();
        if (!this.f96523d || e11.getState() == 5) {
            super.cancel();
        } else {
            e11.g(5);
        }
    }

    public final void d() {
        if (this.f96521b == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), i(), null);
            this.f96521b = frameLayout;
            FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(h());
            this.f96522c = frameLayout2;
            c<C> f11 = f(frameLayout2);
            this.f96520a = f11;
            c(f11);
            this.f96527h = new pn.c(this.f96520a, this.f96522c);
        }
    }

    @NonNull
    public c<C> e() {
        if (this.f96520a == null) {
            d();
        }
        return this.f96520a;
    }

    @NonNull
    public abstract c<C> f(@NonNull FrameLayout frameLayout);

    @IdRes
    public abstract int h();

    @LayoutRes
    public abstract int i();

    @NonNull
    public final FrameLayout j() {
        if (this.f96522c == null) {
            d();
        }
        return this.f96522c;
    }

    public abstract int k();

    public boolean m() {
        return this.f96523d;
    }

    public final void n() {
        FrameLayout frameLayout;
        Window window = getWindow();
        if (window == null || (frameLayout = this.f96522c) == null || !(frameLayout.getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
            return;
        }
        window.setWindowAnimations(GravityCompat.getAbsoluteGravity(((CoordinatorLayout.LayoutParams) this.f96522c.getLayoutParams()).gravity, ViewCompat.getLayoutDirection(this.f96522c)) == 3 ? R.style.Animation_Material3_SideSheetDialog_Left : R.style.Animation_Material3_SideSheetDialog_Right);
    }

    public void o(boolean z11) {
        this.f96523d = z11;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        n();
        r();
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(@Nullable Bundle bundle) {
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
        super.onDetachedFromWindow();
        pn.c cVar = this.f96527h;
        if (cVar != null) {
            cVar.f();
        }
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onStart() {
        super.onStart();
        c<C> cVar = this.f96520a;
        if (cVar == null || cVar.getState() != 5) {
            return;
        }
        this.f96520a.g(k());
    }

    public void p(@GravityInt int i11) {
        FrameLayout frameLayout = this.f96522c;
        if (frameLayout == null) {
            throw new IllegalStateException("Sheet view reference is null; sheet edge cannot be changed if the sheet view is null.");
        }
        if (ViewCompat.isLaidOut(frameLayout)) {
            throw new IllegalStateException("Sheet view has been laid out; sheet edge cannot be changed once the sheet has been laid out.");
        }
        ViewGroup.LayoutParams layoutParams = this.f96522c.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            ((CoordinatorLayout.LayoutParams) layoutParams).gravity = i11;
            n();
        }
    }

    public final View s(int i11, @Nullable View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        d();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) g().findViewById(f96518i);
        if (i11 != 0 && view == null) {
            view = getLayoutInflater().inflate(i11, (ViewGroup) coordinatorLayout, false);
        }
        FrameLayout j11 = j();
        j11.removeAllViews();
        if (layoutParams == null) {
            j11.addView(view);
        } else {
            j11.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(f96519j).setOnClickListener(new View.OnClickListener() { // from class: wn.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                g.b(g.this, view2);
            }
        });
        ViewCompat.setAccessibilityDelegate(j(), new a());
        return this.f96521b;
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z11) {
        super.setCancelable(z11);
        if (this.f96524e != z11) {
            this.f96524e = z11;
        }
        if (getWindow() != null) {
            r();
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z11) {
        super.setCanceledOnTouchOutside(z11);
        if (z11 && !this.f96524e) {
            this.f96524e = true;
        }
        this.f96525f = z11;
        this.f96526g = true;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(@LayoutRes int i11) {
        super.setContentView(s(i11, null, null));
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(@Nullable View view) {
        super.setContentView(s(0, view, null));
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(@Nullable View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        super.setContentView(s(0, view, layoutParams));
    }
}
