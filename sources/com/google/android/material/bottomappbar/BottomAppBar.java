package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.m0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.AttachedBehavior {
    public static final int B = 300;
    public static final float E = 0.2f;
    public static final int F = 0;
    public static final int G = 1;
    public static final int H = 0;
    public static final int I = 1;
    public static final int J = 0;
    public static final int K = 1;
    public static final int L = 0;
    public static final int M = 1;
    public static final int N = -1;
    public static final int O = 0;

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public Integer f30634a;

    /* renamed from: b, reason: collision with root package name */
    public final vn.k f30635b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public Animator f30636c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public Animator f30637d;

    /* renamed from: e, reason: collision with root package name */
    public int f30638e;

    /* renamed from: f, reason: collision with root package name */
    public int f30639f;

    /* renamed from: g, reason: collision with root package name */
    public int f30640g;

    /* renamed from: h, reason: collision with root package name */
    public final int f30641h;

    /* renamed from: i, reason: collision with root package name */
    @Px
    public int f30642i;

    /* renamed from: j, reason: collision with root package name */
    public int f30643j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f30644k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f30645l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f30646m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f30647n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f30648o;

    /* renamed from: p, reason: collision with root package name */
    public int f30649p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList<j> f30650q;

    /* renamed from: r, reason: collision with root package name */
    @MenuRes
    public int f30651r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f30652s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f30653t;

    /* renamed from: u, reason: collision with root package name */
    public Behavior f30654u;

    /* renamed from: v, reason: collision with root package name */
    public int f30655v;

    /* renamed from: w, reason: collision with root package name */
    public int f30656w;

    /* renamed from: x, reason: collision with root package name */
    public int f30657x;

    /* renamed from: y, reason: collision with root package name */
    @NonNull
    public AnimatorListenerAdapter f30658y;

    /* renamed from: z, reason: collision with root package name */
    @NonNull
    public vm.l<FloatingActionButton> f30659z;
    public static final int A = R.style.Widget_MaterialComponents_BottomAppBar;
    public static final int C = R.attr.motionDurationLong2;
    public static final int D = R.attr.motionEasingEmphasizedInterpolator;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f30665a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f30666b;

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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f30665a);
            parcel.writeInt(this.f30666b ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f30665a = parcel.readInt();
            this.f30666b = parcel.readInt() != 0;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (BottomAppBar.this.f30652s) {
                return;
            }
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.c0(bottomAppBar.f30638e, BottomAppBar.this.f30653t);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements vm.l<FloatingActionButton> {
        public b() {
        }

        @Override // vm.l
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull FloatingActionButton floatingActionButton) {
            BottomAppBar.this.f30635b.q0((floatingActionButton.getVisibility() == 0 && BottomAppBar.this.f30640g == 1) ? floatingActionButton.getScaleY() : 0.0f);
        }

        @Override // vm.l
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(@NonNull FloatingActionButton floatingActionButton) {
            if (BottomAppBar.this.f30640g != 1) {
                return;
            }
            float translationX = floatingActionButton.getTranslationX();
            if (BottomAppBar.this.getTopEdgeTreatment().i() != translationX) {
                BottomAppBar.this.getTopEdgeTreatment().p(translationX);
                BottomAppBar.this.f30635b.invalidateSelf();
            }
            float max = Math.max(0.0f, -floatingActionButton.getTranslationY());
            if (BottomAppBar.this.getTopEdgeTreatment().d() != max) {
                BottomAppBar.this.getTopEdgeTreatment().j(max);
                BottomAppBar.this.f30635b.invalidateSelf();
            }
            BottomAppBar.this.f30635b.q0(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements m0.d {
        public c() {
        }

        @Override // com.google.android.material.internal.m0.d
        @NonNull
        public WindowInsetsCompat a(View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull m0.e eVar) {
            boolean z11;
            if (BottomAppBar.this.f30646m) {
                BottomAppBar.this.f30655v = windowInsetsCompat.getSystemWindowInsetBottom();
            }
            boolean z12 = false;
            if (BottomAppBar.this.f30647n) {
                z11 = BottomAppBar.this.f30657x != windowInsetsCompat.getSystemWindowInsetLeft();
                BottomAppBar.this.f30657x = windowInsetsCompat.getSystemWindowInsetLeft();
            } else {
                z11 = false;
            }
            if (BottomAppBar.this.f30648o) {
                boolean z13 = BottomAppBar.this.f30656w != windowInsetsCompat.getSystemWindowInsetRight();
                BottomAppBar.this.f30656w = windowInsetsCompat.getSystemWindowInsetRight();
                z12 = z13;
            }
            if (!z11 && !z12) {
                return windowInsetsCompat;
            }
            BottomAppBar.this.O();
            BottomAppBar.this.n0();
            BottomAppBar.this.m0();
            return windowInsetsCompat;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.T();
            BottomAppBar.this.f30636c = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.U();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends FloatingActionButton.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f30671a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends FloatingActionButton.b {
            public a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.T();
            }
        }

        public e(int i11) {
            this.f30671a = i11;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
        public void a(@NonNull FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.Y(this.f30671a));
            floatingActionButton.A(new a());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.T();
            BottomAppBar.this.f30652s = false;
            BottomAppBar.this.f30637d = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.U();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public boolean f30675a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ActionMenuView f30676b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f30677c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f30678d;

        public g(ActionMenuView actionMenuView, int i11, boolean z11) {
            this.f30676b = actionMenuView;
            this.f30677c = i11;
            this.f30678d = z11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f30675a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f30675a) {
                return;
            }
            boolean z11 = BottomAppBar.this.f30651r != 0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.l0(bottomAppBar.f30651r);
            BottomAppBar.this.r0(this.f30676b, this.f30677c, this.f30678d, z11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ActionMenuView f30680a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f30681b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f30682c;

        public h(ActionMenuView actionMenuView, int i11, boolean z11) {
            this.f30680a = actionMenuView;
            this.f30681b = i11;
            this.f30682c = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f30680a.setTranslationX(BottomAppBar.this.X(r0, this.f30681b, this.f30682c));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i extends AnimatorListenerAdapter {
        public i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f30658y.onAnimationStart(animator);
            FloatingActionButton V = BottomAppBar.this.V();
            if (V != null) {
                V.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface j {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    public @interface k {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface l {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    public @interface m {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface n {
    }

    public BottomAppBar(@NonNull Context context) {
        this(context, null);
    }

    @Nullable
    private Drawable e0(@Nullable Drawable drawable) {
        if (drawable == null || this.f30634a == null) {
            return drawable;
        }
        Drawable wrap = DrawableCompat.wrap(drawable.mutate());
        DrawableCompat.setTint(wrap, this.f30634a.intValue());
        return wrap;
    }

    @Nullable
    private ActionMenuView getActionMenuView() {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.f30655v;
    }

    private int getFabAlignmentAnimationDuration() {
        return pn.j.f(getContext(), C, 300);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return Y(this.f30638e);
    }

    private float getFabTranslationY() {
        if (this.f30640g == 1) {
            return -getTopEdgeTreatment().d();
        }
        return W() != null ? (-((getMeasuredHeight() + getBottomInset()) - r0.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.f30657x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.f30656w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public com.google.android.material.bottomappbar.d getTopEdgeTreatment() {
        return (com.google.android.material.bottomappbar.d) this.f30635b.getShapeAppearanceModel().p();
    }

    public static void s0(BottomAppBar bottomAppBar, View view) {
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
        layoutParams.anchorGravity = 17;
        int i11 = bottomAppBar.f30640g;
        if (i11 == 1) {
            layoutParams.anchorGravity = 17 | 48;
        }
        if (i11 == 0) {
            layoutParams.anchorGravity |= 80;
        }
    }

    public void L(@NonNull j jVar) {
        if (this.f30650q == null) {
            this.f30650q = new ArrayList<>();
        }
        this.f30650q.add(jVar);
    }

    public final void M(@NonNull FloatingActionButton floatingActionButton) {
        floatingActionButton.f(this.f30658y);
        floatingActionButton.g(new i());
        floatingActionButton.h(this.f30659z);
    }

    public void N(@NonNull HideBottomViewOnScrollBehavior.b bVar) {
        getBehavior().i(bVar);
    }

    public final void O() {
        Animator animator = this.f30637d;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f30636c;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    public void P() {
        getBehavior().k();
    }

    public void Q(int i11, List<Animator> list) {
        FloatingActionButton V = V();
        if (V == null || V.r()) {
            return;
        }
        U();
        V.p(new e(i11));
    }

    public final void R(int i11, @NonNull List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(V(), "translationX", Y(i11));
        ofFloat.setDuration(getFabAlignmentAnimationDuration());
        list.add(ofFloat);
    }

    public final void S(int i11, boolean z11, @NonNull List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
        Animator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        ofFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
        if (Math.abs(actionMenuView.getTranslationX() - X(actionMenuView, i11, z11)) <= 1.0f) {
            if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        } else {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            ofFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
            ofFloat2.addListener(new g(actionMenuView, i11, z11));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(ofFloat2, ofFloat);
            list.add(animatorSet);
        }
    }

    public final void T() {
        ArrayList<j> arrayList;
        int i11 = this.f30649p - 1;
        this.f30649p = i11;
        if (i11 != 0 || (arrayList = this.f30650q) == null) {
            return;
        }
        Iterator<j> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    public final void U() {
        ArrayList<j> arrayList;
        int i11 = this.f30649p;
        this.f30649p = i11 + 1;
        if (i11 != 0 || (arrayList = this.f30650q) == null) {
            return;
        }
        Iterator<j> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    @Nullable
    public final FloatingActionButton V() {
        View W = W();
        if (W instanceof FloatingActionButton) {
            return (FloatingActionButton) W;
        }
        return null;
    }

    @Nullable
    public final View W() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).getDependents(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    public int X(@NonNull ActionMenuView actionMenuView, int i11, boolean z11) {
        int i12 = 0;
        if (this.f30643j != 1 && (i11 != 1 || !z11)) {
            return 0;
        }
        boolean s11 = m0.s(this);
        int measuredWidth = s11 ? getMeasuredWidth() : 0;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).gravity & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK) == 8388611) {
                measuredWidth = s11 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = s11 ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i14 = s11 ? this.f30656w : -this.f30657x;
        if (getNavigationIcon() == null) {
            i12 = getResources().getDimensionPixelOffset(R.dimen.m3_bottomappbar_horizontal_padding);
            if (!s11) {
                i12 = -i12;
            }
        }
        return measuredWidth - ((right + i14) + i12);
    }

    public final float Y(int i11) {
        boolean s11 = m0.s(this);
        if (i11 != 1) {
            return 0.0f;
        }
        return ((getMeasuredWidth() / 2) - ((s11 ? this.f30657x : this.f30656w) + ((this.f30642i == -1 || W() == null) ? this.f30641h : (r6.getMeasuredWidth() / 2) + this.f30642i))) * (s11 ? -1 : 1);
    }

    public final boolean Z() {
        FloatingActionButton V = V();
        return V != null && V.s();
    }

    public boolean a0() {
        return getBehavior().l();
    }

    public boolean b0() {
        return getBehavior().m();
    }

    public final void c0(int i11, boolean z11) {
        if (!ViewCompat.isLaidOut(this)) {
            this.f30652s = false;
            l0(this.f30651r);
            return;
        }
        Animator animator = this.f30637d;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!Z()) {
            i11 = 0;
            z11 = false;
        }
        S(i11, z11, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f30637d = animatorSet;
        animatorSet.addListener(new f());
        this.f30637d.start();
    }

    public final void d0(int i11) {
        if (this.f30638e == i11 || !ViewCompat.isLaidOut(this)) {
            return;
        }
        Animator animator = this.f30636c;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.f30639f == 1) {
            R(i11, arrayList);
        } else {
            Q(i11, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.setInterpolator(pn.j.g(getContext(), D, vm.b.f94060a));
        this.f30636c = animatorSet;
        animatorSet.addListener(new d());
        this.f30636c.start();
    }

    public void f0() {
        g0(true);
    }

    public void g0(boolean z11) {
        getBehavior().q(this, z11);
    }

    @Nullable
    public ColorStateList getBackgroundTint() {
        return this.f30635b.S();
    }

    @Dimension
    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().d();
    }

    public int getFabAlignmentMode() {
        return this.f30638e;
    }

    @Px
    public int getFabAlignmentModeEndMargin() {
        return this.f30642i;
    }

    public int getFabAnchorMode() {
        return this.f30640g;
    }

    public int getFabAnimationMode() {
        return this.f30639f;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f();
    }

    @Dimension
    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().g();
    }

    public boolean getHideOnScroll() {
        return this.f30645l;
    }

    public int getMenuAlignmentMode() {
        return this.f30643j;
    }

    public void h0() {
        i0(true);
    }

    public void i0(boolean z11) {
        getBehavior().s(this, z11);
    }

    public void j0(@NonNull j jVar) {
        ArrayList<j> arrayList = this.f30650q;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(jVar);
    }

    public void k0(@NonNull HideBottomViewOnScrollBehavior.b bVar) {
        getBehavior().n(bVar);
    }

    public void l0(@MenuRes int i11) {
        if (i11 != 0) {
            this.f30651r = 0;
            getMenu().clear();
            inflateMenu(i11);
        }
    }

    public final void m0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.f30637d != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (Z()) {
            q0(actionMenuView, this.f30638e, this.f30653t);
        } else {
            q0(actionMenuView, 0, false);
        }
    }

    public final void n0() {
        getTopEdgeTreatment().p(getFabTranslationX());
        this.f30635b.q0((this.f30653t && Z() && this.f30640g == 1) ? 1.0f : 0.0f);
        View W = W();
        if (W != null) {
            W.setTranslationY(getFabTranslationY());
            W.setTranslationX(getFabTranslationX());
        }
    }

    public void o0(int i11, @MenuRes int i12) {
        this.f30651r = i12;
        this.f30652s = true;
        c0(i11, this.f30653t);
        d0(i11);
        this.f30638e = i11;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        vn.l.f(this, this.f30635b);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (z11) {
            O();
            n0();
            final View W = W();
            if (W != null && ViewCompat.isLaidOut(W)) {
                W.post(new Runnable() { // from class: com.google.android.material.bottomappbar.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        W.requestLayout();
                    }
                });
            }
        }
        m0();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f30638e = savedState.f30665a;
        this.f30653t = savedState.f30666b;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f30665a = this.f30638e;
        savedState.f30666b = this.f30653t;
        return savedState;
    }

    public boolean p0(@Px int i11) {
        float f11 = i11;
        if (f11 == getTopEdgeTreatment().h()) {
            return false;
        }
        getTopEdgeTreatment().o(f11);
        this.f30635b.invalidateSelf();
        return true;
    }

    public final void q0(@NonNull ActionMenuView actionMenuView, int i11, boolean z11) {
        r0(actionMenuView, i11, z11, false);
    }

    public final void r0(@NonNull ActionMenuView actionMenuView, int i11, boolean z11, boolean z12) {
        h hVar = new h(actionMenuView, i11, z11);
        if (z12) {
            actionMenuView.post(hVar);
        } else {
            hVar.run();
        }
    }

    public void setBackgroundTint(@Nullable ColorStateList colorStateList) {
        DrawableCompat.setTintList(this.f30635b, colorStateList);
    }

    public void setCradleVerticalOffset(@Dimension float f11) {
        if (f11 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().j(f11);
            this.f30635b.invalidateSelf();
            n0();
        }
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        this.f30635b.o0(f11);
        getBehavior().o(this, this.f30635b.L() - this.f30635b.K());
    }

    public void setFabAlignmentMode(int i11) {
        o0(i11, 0);
    }

    public void setFabAlignmentModeEndMargin(@Px int i11) {
        if (this.f30642i != i11) {
            this.f30642i = i11;
            n0();
        }
    }

    public void setFabAnchorMode(int i11) {
        this.f30640g = i11;
        n0();
        View W = W();
        if (W != null) {
            s0(this, W);
            W.requestLayout();
            this.f30635b.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i11) {
        this.f30639f = i11;
    }

    public void setFabCornerSize(@Dimension float f11) {
        if (f11 != getTopEdgeTreatment().e()) {
            getTopEdgeTreatment().l(f11);
            this.f30635b.invalidateSelf();
        }
    }

    public void setFabCradleMargin(@Dimension float f11) {
        if (f11 != getFabCradleMargin()) {
            getTopEdgeTreatment().m(f11);
            this.f30635b.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(@Dimension float f11) {
        if (f11 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().n(f11);
            this.f30635b.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z11) {
        this.f30645l = z11;
    }

    public void setMenuAlignmentMode(int i11) {
        if (this.f30643j != i11) {
            this.f30643j = i11;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                q0(actionMenuView, this.f30638e, Z());
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        super.setNavigationIcon(e0(drawable));
    }

    public void setNavigationIconTint(@ColorInt int i11) {
        this.f30634a = Integer.valueOf(i11);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public BottomAppBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomAppBarStyle);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public Behavior getBehavior() {
        if (this.f30654u == null) {
            this.f30654u = new Behavior();
        }
        return this.f30654u;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: q, reason: collision with root package name */
        @NonNull
        public final Rect f30660q;

        /* renamed from: r, reason: collision with root package name */
        public WeakReference<BottomAppBar> f30661r;

        /* renamed from: s, reason: collision with root package name */
        public int f30662s;

        /* renamed from: t, reason: collision with root package name */
        public final View.OnLayoutChangeListener f30663t;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f30661r.get();
                if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                int height = view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    floatingActionButton.l(Behavior.this.f30660q);
                    int height2 = Behavior.this.f30660q.height();
                    bottomAppBar.p0(height2);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().r().a(new RectF(Behavior.this.f30660q)));
                    height = height2;
                }
                CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
                if (Behavior.this.f30662s == 0) {
                    if (bottomAppBar.f30640g == 1) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                    }
                    ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = bottomAppBar.getRightInset();
                    if (m0.s(view)) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin += bottomAppBar.f30641h;
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin += bottomAppBar.f30641h;
                    }
                }
                bottomAppBar.n0();
            }
        }

        public Behavior() {
            this.f30663t = new a();
            this.f30660q = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BottomAppBar bottomAppBar, int i11) {
            this.f30661r = new WeakReference<>(bottomAppBar);
            View W = bottomAppBar.W();
            if (W != null && !ViewCompat.isLaidOut(W)) {
                BottomAppBar.s0(bottomAppBar, W);
                this.f30662s = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) W.getLayoutParams())).bottomMargin;
                if (W instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) W;
                    if (bottomAppBar.f30640g == 0 && bottomAppBar.f30644k) {
                        ViewCompat.setElevation(floatingActionButton, 0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                    }
                    bottomAppBar.M(floatingActionButton);
                }
                W.addOnLayoutChangeListener(this.f30663t);
                bottomAppBar.n0();
            }
            coordinatorLayout.onLayoutChild(bottomAppBar, i11);
            return super.onLayoutChild(coordinatorLayout, bottomAppBar, i11);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BottomAppBar bottomAppBar, @NonNull View view, @NonNull View view2, int i11, int i12) {
            return bottomAppBar.getHideOnScroll() && super.onStartNestedScroll(coordinatorLayout, bottomAppBar, view, view2, i11, i12);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f30663t = new a();
            this.f30660q = new Rect();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BottomAppBar(@androidx.annotation.NonNull android.content.Context r13, @androidx.annotation.Nullable android.util.AttributeSet r14, int r15) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
