package com.google.android.material.sidesheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.BackEventCompat;
import androidx.annotation.GravityInt;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.R;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import pn.i;
import vn.k;
import vn.p;
import wn.e;
import wn.h;
import wn.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> implements wn.c<m> {
    public static final int A = 500;
    public static final float B = 0.5f;
    public static final float C = 0.1f;
    public static final int D = -1;

    /* renamed from: a, reason: collision with root package name */
    public e f32025a;

    /* renamed from: b, reason: collision with root package name */
    public float f32026b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public k f32027c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public ColorStateList f32028d;

    /* renamed from: e, reason: collision with root package name */
    public p f32029e;

    /* renamed from: f, reason: collision with root package name */
    public final SideSheetBehavior<V>.c f32030f;

    /* renamed from: g, reason: collision with root package name */
    public float f32031g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f32032h;

    /* renamed from: i, reason: collision with root package name */
    public int f32033i;

    /* renamed from: j, reason: collision with root package name */
    public int f32034j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public ViewDragHelper f32035k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f32036l;

    /* renamed from: m, reason: collision with root package name */
    public float f32037m;

    /* renamed from: n, reason: collision with root package name */
    public int f32038n;

    /* renamed from: o, reason: collision with root package name */
    public int f32039o;

    /* renamed from: p, reason: collision with root package name */
    public int f32040p;

    /* renamed from: q, reason: collision with root package name */
    public int f32041q;

    /* renamed from: r, reason: collision with root package name */
    @Nullable
    public WeakReference<V> f32042r;

    /* renamed from: s, reason: collision with root package name */
    @Nullable
    public WeakReference<View> f32043s;

    /* renamed from: t, reason: collision with root package name */
    @IdRes
    public int f32044t;

    /* renamed from: u, reason: collision with root package name */
    @Nullable
    public VelocityTracker f32045u;

    /* renamed from: v, reason: collision with root package name */
    @Nullable
    public i f32046v;

    /* renamed from: w, reason: collision with root package name */
    public int f32047w;

    /* renamed from: x, reason: collision with root package name */
    @NonNull
    public final Set<m> f32048x;

    /* renamed from: y, reason: collision with root package name */
    public final ViewDragHelper.Callback f32049y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f32024z = R.string.side_sheet_accessibility_pane_title;
    public static final int E = R.style.Widget_Material3_SideSheet;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final int f32050a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            @Nullable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
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

        public SavedState(@NonNull Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f32050a);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f32050a = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, @NonNull SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.f32050a = sideSheetBehavior.f32033i;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends ViewDragHelper.Callback {
        public a() {
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(@NonNull View view, int i11, int i12) {
            return MathUtils.clamp(i11, SideSheetBehavior.this.f32025a.g(), SideSheetBehavior.this.f32025a.f());
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(@NonNull View view, int i11, int i12) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(@NonNull View view) {
            return SideSheetBehavior.this.f32038n + SideSheetBehavior.this.N();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i11) {
            if (i11 == 1 && SideSheetBehavior.this.f32032h) {
                SideSheetBehavior.this.p0(1);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(@NonNull View view, int i11, int i12, int i13, int i14) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View I = SideSheetBehavior.this.I();
            if (I != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) I.getLayoutParams()) != null) {
                SideSheetBehavior.this.f32025a.p(marginLayoutParams, view.getLeft(), view.getRight());
                I.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.A(view, i11);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(@NonNull View view, float f11, float f12) {
            int w11 = SideSheetBehavior.this.w(view, f11, f12);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.u0(view, w11, sideSheetBehavior.t0());
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(@NonNull View view, int i11) {
            return (SideSheetBehavior.this.f32033i == 1 || SideSheetBehavior.this.f32042r == null || SideSheetBehavior.this.f32042r.get() != view) ? false : true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SideSheetBehavior.this.p0(5);
            if (SideSheetBehavior.this.f32042r == null || SideSheetBehavior.this.f32042r.get() == null) {
                return;
            }
            ((View) SideSheetBehavior.this.f32042r.get()).requestLayout();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c {

        /* renamed from: a, reason: collision with root package name */
        public int f32053a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f32054b;

        /* renamed from: c, reason: collision with root package name */
        public final Runnable f32055c = new Runnable() { // from class: wn.l
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.c.a(SideSheetBehavior.c.this);
            }
        };

        public c() {
        }

        public static /* synthetic */ void a(c cVar) {
            cVar.f32054b = false;
            if (SideSheetBehavior.this.f32035k != null && SideSheetBehavior.this.f32035k.continueSettling(true)) {
                cVar.b(cVar.f32053a);
            } else if (SideSheetBehavior.this.f32033i == 2) {
                SideSheetBehavior.this.p0(cVar.f32053a);
            }
        }

        public void b(int i11) {
            if (SideSheetBehavior.this.f32042r == null || SideSheetBehavior.this.f32042r.get() == null) {
                return;
            }
            this.f32053a = i11;
            if (this.f32054b) {
                return;
            }
            ViewCompat.postOnAnimation((View) SideSheetBehavior.this.f32042r.get(), this.f32055c);
            this.f32054b = true;
        }
    }

    public SideSheetBehavior() {
        this.f32030f = new c();
        this.f32032h = true;
        this.f32033i = 5;
        this.f32034j = 5;
        this.f32037m = 0.1f;
        this.f32044t = -1;
        this.f32048x = new LinkedHashSet();
        this.f32049y = new a();
    }

    @NonNull
    public static <V extends View> SideSheetBehavior<V> D(@NonNull V v11) {
        ViewGroup.LayoutParams layoutParams = v11.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        if (behavior instanceof SideSheetBehavior) {
            return (SideSheetBehavior) behavior;
        }
        throw new IllegalArgumentException("The view is not associated with SideSheetBehavior");
    }

    private int F(int i11, int i12, int i13, int i14) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, i12, i14);
        if (i13 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i13), 1073741824);
        }
        if (size != 0) {
            i13 = Math.min(size, i13);
        }
        return View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE);
    }

    private void g0(V v11, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, int i11) {
        ViewCompat.replaceAccessibilityAction(v11, accessibilityActionCompat, null, y(i11));
    }

    public static /* synthetic */ boolean h(SideSheetBehavior sideSheetBehavior, int i11, View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        sideSheetBehavior.g(i11);
        return true;
    }

    public static /* synthetic */ void i(SideSheetBehavior sideSheetBehavior, int i11) {
        V v11 = sideSheetBehavior.f32042r.get();
        if (v11 != null) {
            sideSheetBehavior.u0(v11, i11, false);
        }
    }

    private void i0(@NonNull V v11, Runnable runnable) {
        if (c0(v11)) {
            v11.post(runnable);
        } else {
            runnable.run();
        }
    }

    public static /* synthetic */ void j(SideSheetBehavior sideSheetBehavior, ViewGroup.MarginLayoutParams marginLayoutParams, int i11, View view, ValueAnimator valueAnimator) {
        sideSheetBehavior.f32025a.o(marginLayoutParams, vm.b.c(i11, 0, valueAnimator.getAnimatedFraction()));
        view.requestLayout();
    }

    private void n0(int i11) {
        e eVar = this.f32025a;
        if (eVar == null || eVar.j() != i11) {
            if (i11 == 0) {
                this.f32025a = new wn.b(this);
                if (this.f32029e == null || X()) {
                    return;
                }
                p.b v11 = this.f32029e.v();
                v11.P(0.0f).C(0.0f);
                x0(v11.m());
                return;
            }
            if (i11 == 1) {
                this.f32025a = new wn.a(this);
                if (this.f32029e == null || W()) {
                    return;
                }
                p.b v12 = this.f32029e.v();
                v12.K(0.0f).x(0.0f);
                x0(v12.m());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i11 + ". Must be 0 or 1.");
        }
    }

    private boolean q0() {
        if (this.f32035k != null) {
            return this.f32032h || this.f32033i == 1;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0(View view, int i11, boolean z11) {
        if (!d0(view, i11, z11)) {
            p0(i11);
        } else {
            p0(2);
            this.f32030f.b(i11);
        }
    }

    private void v0() {
        V v11;
        WeakReference<V> weakReference = this.f32042r;
        if (weakReference == null || (v11 = weakReference.get()) == null) {
            return;
        }
        ViewCompat.removeAccessibilityAction(v11, 262144);
        ViewCompat.removeAccessibilityAction(v11, 1048576);
        if (this.f32033i != 5) {
            g0(v11, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, 5);
        }
        if (this.f32033i != 3) {
            g0(v11, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, 3);
        }
    }

    private AccessibilityViewCommand y(final int i11) {
        return new AccessibilityViewCommand() { // from class: wn.j
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                return SideSheetBehavior.h(SideSheetBehavior.this, i11, view, commandArguments);
            }
        };
    }

    private void z(@NonNull Context context) {
        if (this.f32029e == null) {
            return;
        }
        k kVar = new k(this.f32029e);
        this.f32027c = kVar;
        kVar.a0(context);
        ColorStateList colorStateList = this.f32028d;
        if (colorStateList != null) {
            this.f32027c.p0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
        this.f32027c.setTint(typedValue.data);
    }

    public final void A(@NonNull View view, int i11) {
        if (this.f32048x.isEmpty()) {
            return;
        }
        float b11 = this.f32025a.b(i11);
        Iterator<m> it = this.f32048x.iterator();
        while (it.hasNext()) {
            it.next().b(view, b11);
        }
    }

    public final void B(View view) {
        if (ViewCompat.getAccessibilityPaneTitle(view) == null) {
            ViewCompat.setAccessibilityPaneTitle(view, view.getResources().getString(f32024z));
        }
    }

    public void C() {
        g(3);
    }

    @Nullable
    @VisibleForTesting
    public i E() {
        return this.f32046v;
    }

    public int G() {
        return this.f32038n;
    }

    @Nullable
    public final ValueAnimator.AnimatorUpdateListener H() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final View I = I();
        if (I == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) I.getLayoutParams()) == null) {
            return null;
        }
        final int c11 = this.f32025a.c(marginLayoutParams);
        return new ValueAnimator.AnimatorUpdateListener() { // from class: wn.k
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SideSheetBehavior.j(SideSheetBehavior.this, marginLayoutParams, c11, I, valueAnimator);
            }
        };
    }

    @Nullable
    public View I() {
        WeakReference<View> weakReference = this.f32043s;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int J() {
        return this.f32025a.d();
    }

    @GravityInt
    public final int K() {
        e eVar = this.f32025a;
        return (eVar == null || eVar.j() == 0) ? 5 : 3;
    }

    public float L() {
        return this.f32037m;
    }

    public float M() {
        return 0.5f;
    }

    public int N() {
        return this.f32041q;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int O() {
        return this.f32034j;
    }

    public int P(int i11) {
        if (i11 == 3) {
            return J();
        }
        if (i11 == 5) {
            return this.f32025a.e();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i11);
    }

    public int Q() {
        return this.f32040p;
    }

    public int R() {
        return this.f32039o;
    }

    public int S() {
        return 500;
    }

    @Nullable
    public ViewDragHelper T() {
        return this.f32035k;
    }

    @Nullable
    public final CoordinatorLayout.LayoutParams U() {
        V v11;
        WeakReference<V> weakReference = this.f32042r;
        if (weakReference == null || (v11 = weakReference.get()) == null || !(v11.getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
            return null;
        }
        return (CoordinatorLayout.LayoutParams) v11.getLayoutParams();
    }

    public float V() {
        VelocityTracker velocityTracker = this.f32045u;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f32026b);
        return this.f32045u.getXVelocity();
    }

    public final boolean W() {
        CoordinatorLayout.LayoutParams U = U();
        return U != null && ((ViewGroup.MarginLayoutParams) U).leftMargin > 0;
    }

    public final boolean X() {
        CoordinatorLayout.LayoutParams U = U();
        return U != null && ((ViewGroup.MarginLayoutParams) U).rightMargin > 0;
    }

    public void Y() {
        g(5);
    }

    public boolean Z() {
        return this.f32032h;
    }

    public final boolean a0(@NonNull MotionEvent motionEvent) {
        return q0() && v((float) this.f32047w, motionEvent.getX()) > ((float) this.f32035k.getTouchSlop());
    }

    @Override // pn.b
    public void b(@NonNull BackEventCompat backEventCompat) {
        i iVar = this.f32046v;
        if (iVar == null) {
            return;
        }
        iVar.j(backEventCompat);
    }

    public final boolean b0(float f11) {
        return this.f32025a.k(f11);
    }

    @Override // pn.b
    public void c(@NonNull BackEventCompat backEventCompat) {
        i iVar = this.f32046v;
        if (iVar == null) {
            return;
        }
        iVar.l(backEventCompat, K());
        w0();
    }

    public final boolean c0(@NonNull V v11) {
        ViewParent parent = v11.getParent();
        return parent != null && parent.isLayoutRequested() && ViewCompat.isAttachedToWindow(v11);
    }

    @Override // pn.b
    public void d() {
        i iVar = this.f32046v;
        if (iVar == null) {
            return;
        }
        BackEventCompat c11 = iVar.c();
        if (c11 == null || Build.VERSION.SDK_INT < 34) {
            g(5);
        } else {
            this.f32046v.h(c11, K(), new b(), H());
        }
    }

    public final boolean d0(View view, int i11, boolean z11) {
        int P = P(i11);
        ViewDragHelper T = T();
        if (T != null) {
            return z11 ? T.settleCapturedViewAt(P, view.getTop()) : T.smoothSlideViewTo(view, P, view.getTop());
        }
        return false;
    }

    public final void e0(@NonNull CoordinatorLayout coordinatorLayout) {
        int i11;
        View findViewById;
        if (this.f32043s != null || (i11 = this.f32044t) == -1 || (findViewById = coordinatorLayout.findViewById(i11)) == null) {
            return;
        }
        this.f32043s = new WeakReference<>(findViewById);
    }

    @Override // pn.b
    public void f() {
        i iVar = this.f32046v;
        if (iVar == null) {
            return;
        }
        iVar.f();
    }

    @Override // wn.c
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public void a(@NonNull m mVar) {
        this.f32048x.remove(mVar);
    }

    @Override // wn.c
    public void g(final int i11) {
        if (i11 == 1 || i11 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i11 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        WeakReference<V> weakReference = this.f32042r;
        if (weakReference == null || weakReference.get() == null) {
            p0(i11);
        } else {
            i0(this.f32042r.get(), new Runnable() { // from class: wn.i
                @Override // java.lang.Runnable
                public final void run() {
                    SideSheetBehavior.i(SideSheetBehavior.this, i11);
                }
            });
        }
    }

    @Override // wn.c
    public int getState() {
        return this.f32033i;
    }

    public final void h0() {
        VelocityTracker velocityTracker = this.f32045u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f32045u = null;
        }
    }

    public void j0(@Nullable View view) {
        this.f32044t = -1;
        if (view == null) {
            x();
            return;
        }
        this.f32043s = new WeakReference<>(view);
        WeakReference<V> weakReference = this.f32042r;
        if (weakReference != null) {
            V v11 = weakReference.get();
            if (ViewCompat.isLaidOut(v11)) {
                v11.requestLayout();
            }
        }
    }

    public void k0(@IdRes int i11) {
        this.f32044t = i11;
        x();
        WeakReference<V> weakReference = this.f32042r;
        if (weakReference != null) {
            V v11 = weakReference.get();
            if (i11 == -1 || !ViewCompat.isLaidOut(v11)) {
                return;
            }
            v11.requestLayout();
        }
    }

    public void l0(boolean z11) {
        this.f32032h = z11;
    }

    public void m0(float f11) {
        this.f32037m = f11;
    }

    public final void o0(@NonNull V v11, int i11) {
        n0(GravityCompat.getAbsoluteGravity(((CoordinatorLayout.LayoutParams) v11.getLayoutParams()).gravity, i11) == 3 ? 1 : 0);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
        super.onAttachedToLayoutParams(layoutParams);
        this.f32042r = null;
        this.f32035k = null;
        this.f32046v = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.f32042r = null;
        this.f32035k = null;
        this.f32046v = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper;
        if (!s0(v11)) {
            this.f32036l = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            h0();
        }
        if (this.f32045u == null) {
            this.f32045u = VelocityTracker.obtain();
        }
        this.f32045u.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f32047w = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f32036l) {
            this.f32036l = false;
            return false;
        }
        return (this.f32036l || (viewDragHelper = this.f32035k) == null || !viewDragHelper.shouldInterceptTouchEvent(motionEvent)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11) {
        if (ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(v11)) {
            v11.setFitsSystemWindows(true);
        }
        if (this.f32042r == null) {
            this.f32042r = new WeakReference<>(v11);
            this.f32046v = new i(v11);
            k kVar = this.f32027c;
            if (kVar != null) {
                ViewCompat.setBackground(v11, kVar);
                k kVar2 = this.f32027c;
                float f11 = this.f32031g;
                if (f11 == -1.0f) {
                    f11 = ViewCompat.getElevation(v11);
                }
                kVar2.o0(f11);
            } else {
                ColorStateList colorStateList = this.f32028d;
                if (colorStateList != null) {
                    ViewCompat.setBackgroundTintList(v11, colorStateList);
                }
            }
            y0(v11);
            v0();
            if (ViewCompat.getImportantForAccessibility(v11) == 0) {
                ViewCompat.setImportantForAccessibility(v11, 1);
            }
            B(v11);
        }
        o0(v11, i11);
        if (this.f32035k == null) {
            this.f32035k = ViewDragHelper.create(coordinatorLayout, this.f32049y);
        }
        int h11 = this.f32025a.h(v11);
        coordinatorLayout.onLayoutChild(v11, i11);
        this.f32039o = coordinatorLayout.getWidth();
        this.f32040p = this.f32025a.i(coordinatorLayout);
        this.f32038n = v11.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v11.getLayoutParams();
        this.f32041q = marginLayoutParams != null ? this.f32025a.a(marginLayoutParams) : 0;
        ViewCompat.offsetLeftAndRight(v11, u(h11, v11));
        e0(coordinatorLayout);
        for (m mVar : this.f32048x) {
            if (mVar instanceof m) {
                mVar.c(v11);
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v11.getLayoutParams();
        v11.measure(F(i11, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i12, -1, marginLayoutParams.width), F(i13, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i14, -1, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (savedState.getSuperState() != null) {
            super.onRestoreInstanceState(coordinatorLayout, v11, savedState.getSuperState());
        }
        int i11 = savedState.f32050a;
        if (i11 == 1 || i11 == 2) {
            i11 = 5;
        }
        this.f32033i = i11;
        this.f32034j = i11;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @NonNull
    public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v11), (SideSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull MotionEvent motionEvent) {
        if (!v11.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f32033i == 1 && actionMasked == 0) {
            return true;
        }
        if (q0()) {
            this.f32035k.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            h0();
        }
        if (this.f32045u == null) {
            this.f32045u = VelocityTracker.obtain();
        }
        this.f32045u.addMovement(motionEvent);
        if (q0() && actionMasked == 2 && !this.f32036l && a0(motionEvent)) {
            this.f32035k.captureChildView(v11, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f32036l;
    }

    public void p0(int i11) {
        V v11;
        if (this.f32033i == i11) {
            return;
        }
        this.f32033i = i11;
        if (i11 == 3 || i11 == 5) {
            this.f32034j = i11;
        }
        WeakReference<V> weakReference = this.f32042r;
        if (weakReference == null || (v11 = weakReference.get()) == null) {
            return;
        }
        y0(v11);
        Iterator<m> it = this.f32048x.iterator();
        while (it.hasNext()) {
            it.next().a(v11, i11);
        }
        v0();
    }

    public boolean r0(@NonNull View view, float f11) {
        return this.f32025a.n(view, f11);
    }

    public final boolean s0(@NonNull V v11) {
        return (v11.isShown() || ViewCompat.getAccessibilityPaneTitle(v11) != null) && this.f32032h;
    }

    @Override // wn.c
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void e(@NonNull m mVar) {
        this.f32048x.add(mVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean t0() {
        return true;
    }

    public final int u(int i11, V v11) {
        int i12 = this.f32033i;
        if (i12 == 1 || i12 == 2) {
            return i11 - this.f32025a.h(v11);
        }
        if (i12 == 3) {
            return 0;
        }
        if (i12 == 5) {
            return this.f32025a.e();
        }
        throw new IllegalStateException("Unexpected value: " + this.f32033i);
    }

    public final float v(float f11, float f12) {
        return Math.abs(f11 - f12);
    }

    public final int w(@NonNull View view, float f11, float f12) {
        if (b0(f11)) {
            return 3;
        }
        if (r0(view, f11)) {
            return (this.f32025a.m(f11, f12) || this.f32025a.l(view)) ? 5 : 3;
        }
        if (f11 != 0.0f && h.a(f11, f12)) {
            return 5;
        }
        int left = view.getLeft();
        return Math.abs(left - J()) < Math.abs(left - this.f32025a.e()) ? 3 : 5;
    }

    public final void w0() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WeakReference<V> weakReference = this.f32042r;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        V v11 = this.f32042r.get();
        View I = I();
        if (I == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) I.getLayoutParams()) == null) {
            return;
        }
        this.f32025a.o(marginLayoutParams, (int) ((this.f32038n * v11.getScaleX()) + this.f32041q));
        I.requestLayout();
    }

    public final void x() {
        WeakReference<View> weakReference = this.f32043s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f32043s = null;
    }

    public final void x0(@NonNull p pVar) {
        k kVar = this.f32027c;
        if (kVar != null) {
            kVar.setShapeAppearanceModel(pVar);
        }
    }

    public final void y0(@NonNull View view) {
        int i11 = this.f32033i == 5 ? 4 : 0;
        if (view.getVisibility() != i11) {
            view.setVisibility(i11);
        }
    }

    public SideSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32030f = new c();
        this.f32032h = true;
        this.f32033i = 5;
        this.f32034j = 5;
        this.f32037m = 0.1f;
        this.f32044t = -1;
        this.f32048x = new LinkedHashSet();
        this.f32049y = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SideSheetBehavior_Layout);
        int i11 = R.styleable.SideSheetBehavior_Layout_backgroundTint;
        if (obtainStyledAttributes.hasValue(i11)) {
            this.f32028d = sn.c.a(context, obtainStyledAttributes, i11);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.SideSheetBehavior_Layout_shapeAppearance)) {
            this.f32029e = p.e(context, attributeSet, 0, E).m();
        }
        int i12 = R.styleable.SideSheetBehavior_Layout_coplanarSiblingViewId;
        if (obtainStyledAttributes.hasValue(i12)) {
            k0(obtainStyledAttributes.getResourceId(i12, -1));
        }
        z(context);
        this.f32031g = obtainStyledAttributes.getDimension(R.styleable.SideSheetBehavior_Layout_android_elevation, -1.0f);
        l0(obtainStyledAttributes.getBoolean(R.styleable.SideSheetBehavior_Layout_behavior_draggable, true));
        obtainStyledAttributes.recycle();
        this.f32026b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
