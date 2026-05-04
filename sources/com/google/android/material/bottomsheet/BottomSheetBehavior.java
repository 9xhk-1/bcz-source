package com.google.android.material.bottomsheet;

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
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.activity.BackEventCompat;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.R;
import com.google.android.material.internal.m0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import vn.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> implements pn.b {
    public static final String A1 = "BottomSheetBehavior";

    @VisibleForTesting
    public static final int B1 = 500;
    public static final float C1 = 0.5f;
    public static final float D1 = 0.1f;
    public static final int E1 = 500;
    public static final int F1 = -1;
    public static final int G1 = 0;
    public static final int H1 = -1;

    @VisibleForTesting
    public static final int I1 = 1;
    public static final int J1 = R.style.Widget_Design_BottomSheet_Modal;

    /* renamed from: n1, reason: collision with root package name */
    public static final int f30699n1 = 1;

    /* renamed from: o1, reason: collision with root package name */
    public static final int f30700o1 = 2;

    /* renamed from: p1, reason: collision with root package name */
    public static final int f30701p1 = 3;

    /* renamed from: q1, reason: collision with root package name */
    public static final int f30702q1 = 4;

    /* renamed from: r1, reason: collision with root package name */
    public static final int f30703r1 = 5;

    /* renamed from: s1, reason: collision with root package name */
    public static final int f30704s1 = 6;

    /* renamed from: t1, reason: collision with root package name */
    public static final int f30705t1 = -1;

    /* renamed from: u1, reason: collision with root package name */
    public static final int f30706u1 = 1;

    /* renamed from: v1, reason: collision with root package name */
    public static final int f30707v1 = 2;

    /* renamed from: w1, reason: collision with root package name */
    public static final int f30708w1 = 4;

    /* renamed from: x1, reason: collision with root package name */
    public static final int f30709x1 = 8;

    /* renamed from: y1, reason: collision with root package name */
    public static final int f30710y1 = -1;

    /* renamed from: z1, reason: collision with root package name */
    public static final int f30711z1 = 0;
    public boolean A;
    public final BottomSheetBehavior<V>.k B;

    @Nullable
    public ValueAnimator C;
    public int D;
    public int E;
    public int F;
    public float G;
    public int H;
    public float I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public int N;

    @Nullable
    public ViewDragHelper O;
    public boolean P;
    public int Q;
    public boolean R;
    public float S;
    public int T;
    public int U;
    public int V;

    @Nullable
    public WeakReference<V> W;

    @Nullable
    public WeakReference<View> X;

    @Nullable
    public WeakReference<View> Y;

    @NonNull
    public final ArrayList<g> Z;

    /* renamed from: a, reason: collision with root package name */
    public int f30712a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f30713b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f30714c;

    /* renamed from: d, reason: collision with root package name */
    public float f30715d;

    /* renamed from: e, reason: collision with root package name */
    public int f30716e;

    /* renamed from: f, reason: collision with root package name */
    public int f30717f;

    /* renamed from: f0, reason: collision with root package name */
    @Nullable
    public VelocityTracker f30718f0;

    /* renamed from: f1, reason: collision with root package name */
    @Nullable
    public pn.f f30719f1;

    /* renamed from: g, reason: collision with root package name */
    public boolean f30720g;

    /* renamed from: h, reason: collision with root package name */
    public int f30721h;

    /* renamed from: h1, reason: collision with root package name */
    public int f30722h1;

    /* renamed from: i, reason: collision with root package name */
    public int f30723i;

    /* renamed from: i1, reason: collision with root package name */
    public int f30724i1;

    /* renamed from: j, reason: collision with root package name */
    public vn.k f30725j;

    /* renamed from: j1, reason: collision with root package name */
    public boolean f30726j1;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public ColorStateList f30727k;

    /* renamed from: k1, reason: collision with root package name */
    @Nullable
    public Map<View, Integer> f30728k1;

    /* renamed from: l, reason: collision with root package name */
    public int f30729l;

    /* renamed from: l1, reason: collision with root package name */
    @VisibleForTesting
    public final SparseIntArray f30730l1;

    /* renamed from: m, reason: collision with root package name */
    public int f30731m;

    /* renamed from: m1, reason: collision with root package name */
    public final ViewDragHelper.Callback f30732m1;

    /* renamed from: n, reason: collision with root package name */
    public int f30733n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f30734o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f30735p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f30736q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f30737r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f30738s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f30739t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f30740u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f30741v;

    /* renamed from: w, reason: collision with root package name */
    public int f30742w;

    /* renamed from: x, reason: collision with root package name */
    public int f30743x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f30744y;

    /* renamed from: z, reason: collision with root package name */
    public p f30745z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final int f30746a;

        /* renamed from: b, reason: collision with root package name */
        public int f30747b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f30748c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f30749d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f30750e;

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
            parcel.writeInt(this.f30746a);
            parcel.writeInt(this.f30747b);
            parcel.writeInt(this.f30748c ? 1 : 0);
            parcel.writeInt(this.f30749d ? 1 : 0);
            parcel.writeInt(this.f30750e ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f30746a = parcel.readInt();
            this.f30747b = parcel.readInt();
            this.f30748c = parcel.readInt() == 1;
            this.f30749d = parcel.readInt() == 1;
            this.f30750e = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable, @NonNull BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f30746a = bottomSheetBehavior.M;
            this.f30747b = bottomSheetBehavior.f30717f;
            this.f30748c = bottomSheetBehavior.f30713b;
            this.f30749d = bottomSheetBehavior.J;
            this.f30750e = bottomSheetBehavior.K;
        }

        @Deprecated
        public SavedState(Parcelable parcelable, int i11) {
            super(parcelable);
            this.f30746a = i11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f30751a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f30752b;

        public a(View view, int i11) {
            this.f30751a = view;
            this.f30752b = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.X0(this.f30751a, this.f30752b, false);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomSheetBehavior.this.P0(5);
            WeakReference<V> weakReference = BottomSheetBehavior.this.W;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            BottomSheetBehavior.this.W.get().requestLayout();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f30725j != null) {
                BottomSheetBehavior.this.f30725j.q0(floatValue);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements m0.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f30756a;

        public d(boolean z11) {
            this.f30756a = z11;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
        @Override // com.google.android.material.internal.m0.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.core.view.WindowInsetsCompat a(android.view.View r11, androidx.core.view.WindowInsetsCompat r12, com.google.android.material.internal.m0.e r13) {
            /*
                r10 = this;
                int r0 = androidx.core.view.WindowInsetsCompat.Type.systemBars()
                androidx.core.graphics.Insets r0 = r12.getInsets(r0)
                int r1 = androidx.core.view.WindowInsetsCompat.Type.mandatorySystemGestures()
                androidx.core.graphics.Insets r1 = r12.getInsets(r1)
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r3 = r0.top
                com.google.android.material.bottomsheet.BottomSheetBehavior.s(r2, r3)
                boolean r2 = com.google.android.material.internal.m0.s(r11)
                int r3 = r11.getPaddingBottom()
                int r4 = r11.getPaddingLeft()
                int r5 = r11.getPaddingRight()
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.t(r6)
                if (r6 == 0) goto L41
                com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = r12.getSystemWindowInsetBottom()
                com.google.android.material.bottomsheet.BottomSheetBehavior.v(r3, r6)
                int r3 = r13.f31621d
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.u(r6)
                int r3 = r3 + r6
            L41:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.w(r6)
                if (r6 == 0) goto L53
                if (r2 == 0) goto L4e
                int r4 = r13.f31620c
                goto L50
            L4e:
                int r4 = r13.f31618a
            L50:
                int r6 = r0.left
                int r4 = r4 + r6
            L53:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.x(r6)
                if (r6 == 0) goto L66
                if (r2 == 0) goto L60
                int r13 = r13.f31618a
                goto L62
            L60:
                int r13 = r13.f31620c
            L62:
                int r2 = r0.right
                int r5 = r13 + r2
            L66:
                android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.y(r2)
                r6 = 0
                r7 = 1
                if (r2 == 0) goto L80
                int r2 = r13.leftMargin
                int r8 = r0.left
                if (r2 == r8) goto L80
                r13.leftMargin = r8
                r2 = r7
                goto L81
            L80:
                r2 = r6
            L81:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.z(r8)
                if (r8 == 0) goto L92
                int r8 = r13.rightMargin
                int r9 = r0.right
                if (r8 == r9) goto L92
                r13.rightMargin = r9
                r2 = r7
            L92:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.i(r8)
                if (r8 == 0) goto La3
                int r8 = r13.topMargin
                int r0 = r0.top
                if (r8 == r0) goto La3
                r13.topMargin = r0
                goto La4
            La3:
                r7 = r2
            La4:
                if (r7 == 0) goto La9
                r11.setLayoutParams(r13)
            La9:
                int r13 = r11.getPaddingTop()
                r11.setPadding(r4, r13, r5, r3)
                boolean r11 = r10.f30756a
                if (r11 == 0) goto Lbb
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r13 = r1.bottom
                com.google.android.material.bottomsheet.BottomSheetBehavior.j(r11, r13)
            Lbb:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.t(r11)
                if (r11 != 0) goto Lc9
                boolean r11 = r10.f30756a
                if (r11 == 0) goto Lc8
                goto Lc9
            Lc8:
                return r12
            Lc9:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                com.google.android.material.bottomsheet.BottomSheetBehavior.k(r11, r6)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d.a(android.view.View, androidx.core.view.WindowInsetsCompat, com.google.android.material.internal.m0$e):androidx.core.view.WindowInsetsCompat");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends ViewDragHelper.Callback {

        /* renamed from: a, reason: collision with root package name */
        public long f30758a;

        public e() {
        }

        public final boolean a(@NonNull View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.V + bottomSheetBehavior.U()) / 2;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(@NonNull View view, int i11, int i12) {
            return view.getLeft();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(@NonNull View view, int i11, int i12) {
            return MathUtils.clamp(i11, BottomSheetBehavior.this.U(), getViewVerticalDragRange(view));
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewVerticalDragRange(@NonNull View view) {
            return BottomSheetBehavior.this.J() ? BottomSheetBehavior.this.V : BottomSheetBehavior.this.H;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i11) {
            if (i11 == 1 && BottomSheetBehavior.this.L) {
                BottomSheetBehavior.this.P0(1);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(@NonNull View view, int i11, int i12, int i13, int i14) {
            BottomSheetBehavior.this.P(i12);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        
            if (r7.f30759b.S0(r0, (r9 * 100.0f) / r10.V) != false) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
        
            if (r9 > r7.f30759b.F) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
        
            if (java.lang.Math.abs(r8.getTop() - r7.f30759b.U()) < java.lang.Math.abs(r8.getTop() - r7.f30759b.F)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00cf, code lost:
        
            if (r7.f30759b.V0() == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00f1, code lost:
        
            if (java.lang.Math.abs(r9 - r7.f30759b.E) < java.lang.Math.abs(r9 - r7.f30759b.H)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x010d, code lost:
        
            if (r7.f30759b.V0() != false) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0127, code lost:
        
            if (r7.f30759b.V0() == false) goto L63;
         */
        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onViewReleased(@androidx.annotation.NonNull android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instructions count: 308
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.e.onViewReleased(android.view.View, float, float):void");
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(@NonNull View view, int i11) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i12 = bottomSheetBehavior.M;
            if (i12 == 1 || bottomSheetBehavior.f30726j1) {
                return false;
            }
            if (i12 == 3 && bottomSheetBehavior.f30722h1 == i11) {
                WeakReference<View> weakReference = bottomSheetBehavior.Y;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f30758a = System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.W;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements AccessibilityViewCommand {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f30760a;

        public f(int i11) {
            this.f30760a = i11;
        }

        @Override // androidx.core.view.accessibility.AccessibilityViewCommand
        public boolean perform(@NonNull View view, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
            BottomSheetBehavior.this.g(this.f30760a);
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface h {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface i {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface j {
    }

    public BottomSheetBehavior() {
        this.f30712a = 0;
        this.f30713b = true;
        this.f30714c = false;
        this.f30729l = -1;
        this.f30731m = -1;
        this.B = new k(this, null);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = 4;
        this.N = 4;
        this.S = 0.1f;
        this.Z = new ArrayList<>();
        this.f30724i1 = -1;
        this.f30730l1 = new SparseIntArray();
        this.f30732m1 = new e();
    }

    @NonNull
    public static <V extends View> BottomSheetBehavior<V> R(@NonNull V v11) {
        ViewGroup.LayoutParams layoutParams = v11.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        if (behavior instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) behavior;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    private void u0() {
        this.f30722h1 = -1;
        this.f30724i1 = -1;
        VelocityTracker velocityTracker = this.f30718f0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f30718f0 = null;
        }
    }

    public final int A(View view, @StringRes int i11, int i12) {
        return ViewCompat.addAccessibilityAction(view, view.getResources().getString(i11), L(i12));
    }

    public void A0(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.D = i11;
        a1(this.M, true);
    }

    public void B(@NonNull g gVar) {
        if (this.Z.contains(gVar)) {
            return;
        }
        this.Z.add(gVar);
    }

    public void B0(boolean z11) {
        if (this.f30713b == z11) {
            return;
        }
        this.f30713b = z11;
        if (this.W != null) {
            C();
        }
        P0((this.f30713b && this.M == 6) ? 3 : this.M);
        a1(this.M, true);
        Y0();
    }

    public final void C() {
        int G = G();
        if (this.f30713b) {
            this.H = Math.max(this.V - G, this.E);
        } else {
            this.H = this.V - G;
        }
    }

    public void C0(boolean z11) {
        this.f30734o = z11;
    }

    @RequiresApi(31)
    public final float D(float f11, @Nullable RoundedCorner roundedCorner) {
        int radius;
        if (roundedCorner != null) {
            radius = roundedCorner.getRadius();
            float f12 = radius;
            if (f12 > 0.0f && f11 > 0.0f) {
                return f12 / f11;
            }
        }
        return 0.0f;
    }

    public void D0(@FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f11) {
        if (f11 <= 0.0f || f11 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.G = f11;
        if (this.W != null) {
            E();
        }
    }

    public final void E() {
        this.F = (int) (this.V * (1.0f - this.G));
    }

    public void E0(float f11) {
        this.S = f11;
    }

    public final float F() {
        WeakReference<V> weakReference;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        RoundedCorner roundedCorner2;
        if (this.f30725j == null || (weakReference = this.W) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        V v11 = this.W.get();
        if (!i0() || (rootWindowInsets = v11.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        float T = this.f30725j.T();
        roundedCorner = rootWindowInsets.getRoundedCorner(0);
        float D = D(T, roundedCorner);
        float U = this.f30725j.U();
        roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
        return Math.max(D, D(U, roundedCorner2));
    }

    public void F0(boolean z11) {
        if (this.J != z11) {
            this.J = z11;
            if (!z11 && this.M == 5) {
                g(4);
            }
            Y0();
        }
    }

    public final int G() {
        int i11;
        return this.f30720g ? Math.min(Math.max(this.f30721h, this.V - ((this.U * 9) / 16)), this.T) + this.f30742w : (this.f30734o || this.f30735p || (i11 = this.f30733n) <= 0) ? this.f30717f + this.f30742w : Math.max(this.f30717f, i11 + this.f30723i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void G0(boolean z11) {
        this.J = z11;
    }

    public float H() {
        WeakReference<V> weakReference = this.W;
        if (weakReference == null || weakReference.get() == null) {
            return -1.0f;
        }
        return I(this.W.get().getTop());
    }

    public void H0(@Px int i11) {
        this.f30731m = i11;
    }

    public final float I(int i11) {
        float f11;
        float f12;
        int i12 = this.H;
        if (i11 > i12 || i12 == U()) {
            int i13 = this.H;
            f11 = i13 - i11;
            f12 = this.V - i13;
        } else {
            int i14 = this.H;
            f11 = i14 - i11;
            f12 = i14 - U();
        }
        return f11 / f12;
    }

    public void I0(@Px int i11) {
        this.f30729l = i11;
    }

    public final boolean J() {
        return n0() && o0();
    }

    public void J0(int i11) {
        K0(i11, false);
    }

    public final void K(View view, int i11) {
        if (view == null) {
            return;
        }
        ViewCompat.removeAccessibilityAction(view, 524288);
        ViewCompat.removeAccessibilityAction(view, 262144);
        ViewCompat.removeAccessibilityAction(view, 1048576);
        int i12 = this.f30730l1.get(i11, -1);
        if (i12 != -1) {
            ViewCompat.removeAccessibilityAction(view, i12);
            this.f30730l1.delete(i11);
        }
    }

    public final void K0(int i11, boolean z11) {
        if (i11 == -1) {
            if (this.f30720g) {
                return;
            } else {
                this.f30720g = true;
            }
        } else {
            if (!this.f30720g && this.f30717f == i11) {
                return;
            }
            this.f30720g = false;
            this.f30717f = Math.max(0, i11);
        }
        c1(z11);
    }

    public final AccessibilityViewCommand L(int i11) {
        return new f(i11);
    }

    public void L0(int i11) {
        this.f30712a = i11;
    }

    public final void M(@NonNull Context context) {
        if (this.f30745z == null) {
            return;
        }
        vn.k kVar = new vn.k(this.f30745z);
        this.f30725j = kVar;
        kVar.a0(context);
        ColorStateList colorStateList = this.f30727k;
        if (colorStateList != null) {
            this.f30725j.p0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
        this.f30725j.setTint(typedValue.data);
    }

    public void M0(boolean z11) {
        if (this.f30744y != z11) {
            this.f30744y = z11;
            a1(getState(), true);
        }
    }

    public final void N() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(F(), 1.0f);
        this.C = ofFloat;
        ofFloat.setDuration(500L);
        this.C.addUpdateListener(new c());
    }

    public void N0(int i11) {
        this.f30716e = i11;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void O() {
        this.C = null;
    }

    public void O0(boolean z11) {
        this.K = z11;
    }

    public void P(int i11) {
        V v11 = this.W.get();
        if (v11 == null || this.Z.isEmpty()) {
            return;
        }
        float I = I(i11);
        for (int i12 = 0; i12 < this.Z.size(); i12++) {
            this.Z.get(i12).b(v11, I);
        }
    }

    public void P0(int i11) {
        V v11;
        if (this.M == i11) {
            return;
        }
        this.M = i11;
        if (i11 == 4 || i11 == 3 || i11 == 6 || (this.J && i11 == 5)) {
            this.N = i11;
        }
        WeakReference<V> weakReference = this.W;
        if (weakReference == null || (v11 = weakReference.get()) == null) {
            return;
        }
        if (i11 == 3) {
            b1(true);
        } else if (i11 == 6 || i11 == 5 || i11 == 4) {
            b1(false);
        }
        a1(i11, true);
        for (int i12 = 0; i12 < this.Z.size(); i12++) {
            this.Z.get(i12).c(v11, i11);
        }
        Y0();
    }

    @Nullable
    @VisibleForTesting
    public View Q(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (ViewCompat.isNestedScrollingEnabled(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View Q = Q(viewGroup.getChildAt(i11));
                if (Q != null) {
                    return Q;
                }
            }
        }
        return null;
    }

    public void Q0(boolean z11) {
        this.f30714c = z11;
    }

    public final void R0(@NonNull View view) {
        boolean z11 = (Build.VERSION.SDK_INT < 29 || m0() || this.f30720g) ? false : true;
        if (this.f30735p || this.f30736q || this.f30737r || this.f30739t || this.f30740u || this.f30741v || z11) {
            m0.h(view, new d(z11));
        }
    }

    @Nullable
    @VisibleForTesting
    public pn.f S() {
        return this.f30719f1;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean S0(long j11, @FloatRange(from = 0.0d, to = 100.0d) float f11) {
        return false;
    }

    public final int T(int i11, int i12, int i13, int i14) {
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

    public final boolean T0() {
        if (this.O != null) {
            return this.L || this.M == 1;
        }
        return false;
    }

    public int U() {
        if (this.f30713b) {
            return this.E;
        }
        return Math.max(this.D, this.f30738s ? 0 : this.f30743x);
    }

    public boolean U0(@NonNull View view, float f11) {
        if (this.K) {
            return true;
        }
        if (o0() && view.getTop() >= this.H) {
            return Math.abs((((float) view.getTop()) + (f11 * this.S)) - ((float) this.H)) / ((float) G()) > 0.5f;
        }
        return false;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float V() {
        return this.G;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean V0() {
        return false;
    }

    public float W() {
        return this.S;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean W0() {
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int X() {
        return this.N;
    }

    public final void X0(View view, int i11, boolean z11) {
        int g02 = g0(i11);
        ViewDragHelper viewDragHelper = this.O;
        if (viewDragHelper == null || (!z11 ? viewDragHelper.smoothSlideViewTo(view, view.getLeft(), g02) : viewDragHelper.settleCapturedViewAt(view.getLeft(), g02))) {
            P0(i11);
            return;
        }
        P0(2);
        a1(i11, true);
        this.B.c(i11);
    }

    public vn.k Y() {
        return this.f30725j;
    }

    public final void Y0() {
        WeakReference<V> weakReference = this.W;
        if (weakReference != null) {
            Z0(weakReference.get(), 0);
        }
        WeakReference<View> weakReference2 = this.X;
        if (weakReference2 != null) {
            Z0(weakReference2.get(), 1);
        }
    }

    @Px
    public int Z() {
        return this.f30731m;
    }

    public final void Z0(View view, int i11) {
        if (view == null) {
            return;
        }
        K(view, i11);
        if (!this.f30713b && this.M != 6) {
            this.f30730l1.put(i11, A(view, R.string.bottomsheet_action_expand_halfway, 6));
        }
        if (this.J && o0() && this.M != 5) {
            t0(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, 5);
        }
        int i12 = this.M;
        if (i12 == 3) {
            t0(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE, this.f30713b ? 4 : 6);
            return;
        }
        if (i12 == 4) {
            t0(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, this.f30713b ? 3 : 6);
        } else {
            if (i12 != 6) {
                return;
            }
            t0(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE, 4);
            t0(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, 3);
        }
    }

    @Px
    public int a0() {
        return this.f30729l;
    }

    public final void a1(int i11, boolean z11) {
        boolean k02;
        ValueAnimator valueAnimator;
        if (i11 == 2 || this.A == (k02 = k0()) || this.f30725j == null) {
            return;
        }
        this.A = k02;
        if (!z11 || (valueAnimator = this.C) == null) {
            ValueAnimator valueAnimator2 = this.C;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.C.cancel();
            }
            this.f30725j.q0(this.A ? F() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.C.reverse();
        } else {
            this.C.setFloatValues(this.f30725j.A(), k02 ? F() : 1.0f);
            this.C.start();
        }
    }

    @Override // pn.b
    public void b(@NonNull BackEventCompat backEventCompat) {
        pn.f fVar = this.f30719f1;
        if (fVar == null) {
            return;
        }
        fVar.j(backEventCompat);
    }

    public int b0() {
        if (this.f30720g) {
            return -1;
        }
        return this.f30717f;
    }

    public final void b1(boolean z11) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.W;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z11) {
                if (this.f30728k1 != null) {
                    return;
                } else {
                    this.f30728k1 = new HashMap(childCount);
                }
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = coordinatorLayout.getChildAt(i11);
                if (childAt != this.W.get()) {
                    if (z11) {
                        this.f30728k1.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f30714c) {
                            ViewCompat.setImportantForAccessibility(childAt, 4);
                        }
                    } else if (this.f30714c && (map = this.f30728k1) != null && map.containsKey(childAt)) {
                        ViewCompat.setImportantForAccessibility(childAt, this.f30728k1.get(childAt).intValue());
                    }
                }
            }
            if (!z11) {
                this.f30728k1 = null;
            } else if (this.f30714c) {
                this.W.get().sendAccessibilityEvent(8);
            }
        }
    }

    @Override // pn.b
    public void c(@NonNull BackEventCompat backEventCompat) {
        pn.f fVar = this.f30719f1;
        if (fVar == null) {
            return;
        }
        fVar.l(backEventCompat);
    }

    @VisibleForTesting
    public int c0() {
        return this.f30721h;
    }

    public final void c1(boolean z11) {
        V v11;
        if (this.W != null) {
            C();
            if (this.M != 4 || (v11 = this.W.get()) == null) {
                return;
            }
            if (z11) {
                g(4);
            } else {
                v11.requestLayout();
            }
        }
    }

    @Override // pn.b
    public void d() {
        pn.f fVar = this.f30719f1;
        if (fVar == null) {
            return;
        }
        BackEventCompat c11 = fVar.c();
        if (c11 == null || Build.VERSION.SDK_INT < 34) {
            g(this.J ? 5 : 4);
        } else if (this.J) {
            this.f30719f1.h(c11, new b());
        } else {
            this.f30719f1.i(c11, null);
            g(4);
        }
    }

    public int d0() {
        return this.f30712a;
    }

    public int e0() {
        return this.f30716e;
    }

    @Override // pn.b
    public void f() {
        pn.f fVar = this.f30719f1;
        if (fVar == null) {
            return;
        }
        fVar.f();
    }

    public boolean f0() {
        return this.K;
    }

    public void g(int i11) {
        if (i11 == 1 || i11 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i11 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!this.J && i11 == 5) {
            Log.w(A1, "Cannot set state: " + i11);
            return;
        }
        int i12 = (i11 == 6 && this.f30713b && g0(i11) <= this.E) ? 3 : i11;
        WeakReference<V> weakReference = this.W;
        if (weakReference == null || weakReference.get() == null) {
            P0(i11);
        } else {
            V v11 = this.W.get();
            w0(v11, new a(v11, i12));
        }
    }

    public final int g0(int i11) {
        if (i11 == 3) {
            return U();
        }
        if (i11 == 4) {
            return this.H;
        }
        if (i11 == 5) {
            return this.V;
        }
        if (i11 == 6) {
            return this.F;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i11);
    }

    public int getState() {
        return this.M;
    }

    public final float h0() {
        VelocityTracker velocityTracker = this.f30718f0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f30715d);
        return this.f30718f0.getYVelocity(this.f30722h1);
    }

    public final boolean i0() {
        WeakReference<V> weakReference = this.W;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            this.W.get().getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean j0() {
        return this.L;
    }

    public final boolean k0() {
        if (this.M == 3) {
            return this.f30744y || i0();
        }
        return false;
    }

    public boolean l0() {
        return this.f30713b;
    }

    public boolean m0() {
        return this.f30734o;
    }

    public boolean n0() {
        return this.J;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean o0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
        super.onAttachedToLayoutParams(layoutParams);
        this.W = null;
        this.O = null;
        this.f30719f1 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.W = null;
        this.O = null;
        this.f30719f1 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull MotionEvent motionEvent) {
        int i11;
        ViewDragHelper viewDragHelper;
        if (!v11.isShown() || !this.L) {
            this.P = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            u0();
        }
        if (this.f30718f0 == null) {
            this.f30718f0 = VelocityTracker.obtain();
        }
        this.f30718f0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x11 = (int) motionEvent.getX();
            this.f30724i1 = (int) motionEvent.getY();
            if (this.M != 2) {
                WeakReference<View> weakReference = this.Y;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.isPointInChildBounds(view, x11, this.f30724i1)) {
                    this.f30722h1 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f30726j1 = true;
                }
            }
            this.P = this.f30722h1 == -1 && !coordinatorLayout.isPointInChildBounds(v11, x11, this.f30724i1);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f30726j1 = false;
            this.f30722h1 = -1;
            if (this.P) {
                this.P = false;
                return false;
            }
        }
        if (!this.P && (viewDragHelper = this.O) != null && viewDragHelper.shouldInterceptTouchEvent(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.Y;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.P || this.M == 1 || coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.O == null || (i11 = this.f30724i1) == -1 || Math.abs(((float) i11) - motionEvent.getY()) <= ((float) this.O.getTouchSlop())) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11) {
        if (ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(v11)) {
            v11.setFitsSystemWindows(true);
        }
        if (this.W == null) {
            this.f30721h = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            R0(v11);
            ViewCompat.setWindowInsetsAnimationCallback(v11, new zm.d(v11));
            this.W = new WeakReference<>(v11);
            this.f30719f1 = new pn.f(v11);
            vn.k kVar = this.f30725j;
            if (kVar != null) {
                ViewCompat.setBackground(v11, kVar);
                vn.k kVar2 = this.f30725j;
                float f11 = this.I;
                if (f11 == -1.0f) {
                    f11 = ViewCompat.getElevation(v11);
                }
                kVar2.o0(f11);
            } else {
                ColorStateList colorStateList = this.f30727k;
                if (colorStateList != null) {
                    ViewCompat.setBackgroundTintList(v11, colorStateList);
                }
            }
            Y0();
            if (ViewCompat.getImportantForAccessibility(v11) == 0) {
                ViewCompat.setImportantForAccessibility(v11, 1);
            }
        }
        if (this.O == null) {
            this.O = ViewDragHelper.create(coordinatorLayout, this.f30732m1);
        }
        int top = v11.getTop();
        coordinatorLayout.onLayoutChild(v11, i11);
        this.U = coordinatorLayout.getWidth();
        this.V = coordinatorLayout.getHeight();
        int height = v11.getHeight();
        this.T = height;
        int i12 = this.V;
        int i13 = i12 - height;
        int i14 = this.f30743x;
        if (i13 < i14) {
            if (this.f30738s) {
                int i15 = this.f30731m;
                if (i15 != -1) {
                    i12 = Math.min(i12, i15);
                }
                this.T = i12;
            } else {
                int i16 = i12 - i14;
                int i17 = this.f30731m;
                if (i17 != -1) {
                    i16 = Math.min(i16, i17);
                }
                this.T = i16;
            }
        }
        this.E = Math.max(0, this.V - this.T);
        E();
        C();
        int i18 = this.M;
        if (i18 == 3) {
            ViewCompat.offsetTopAndBottom(v11, U());
        } else if (i18 == 6) {
            ViewCompat.offsetTopAndBottom(v11, this.F);
        } else if (this.J && i18 == 5) {
            ViewCompat.offsetTopAndBottom(v11, this.V);
        } else if (i18 == 4) {
            ViewCompat.offsetTopAndBottom(v11, this.H);
        } else if (i18 == 1 || i18 == 2) {
            ViewCompat.offsetTopAndBottom(v11, top - v11.getTop());
        }
        a1(this.M, false);
        this.Y = new WeakReference<>(Q(v11));
        for (int i19 = 0; i19 < this.Z.size(); i19++) {
            this.Z.get(i19).a(v11);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v11.getLayoutParams();
        v11.measure(T(i11, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i12, this.f30729l, marginLayoutParams.width), T(i13, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i14, this.f30731m, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, float f11, float f12) {
        WeakReference<View> weakReference;
        return q0() && (weakReference = this.Y) != null && view == weakReference.get() && (this.M != 3 || super.onNestedPreFling(coordinatorLayout, v11, view, f11, f12));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, int i11, int i12, @NonNull int[] iArr, int i13) {
        if (i13 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.Y;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (!q0() || view == view2) {
            int top = v11.getTop();
            int i14 = top - i12;
            if (i12 > 0) {
                if (i14 < U()) {
                    int U = top - U();
                    iArr[1] = U;
                    ViewCompat.offsetTopAndBottom(v11, -U);
                    P0(3);
                } else {
                    if (!this.L) {
                        return;
                    }
                    iArr[1] = i12;
                    ViewCompat.offsetTopAndBottom(v11, -i12);
                    P0(1);
                }
            } else if (i12 < 0 && !view.canScrollVertically(-1)) {
                if (i14 > this.H && !J()) {
                    int i15 = top - this.H;
                    iArr[1] = i15;
                    ViewCompat.offsetTopAndBottom(v11, -i15);
                    P0(4);
                } else {
                    if (!this.L) {
                        return;
                    }
                    iArr[1] = i12;
                    ViewCompat.offsetTopAndBottom(v11, -i12);
                    P0(1);
                }
            }
            P(v11.getTop());
            this.Q = i12;
            this.R = true;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v11, savedState.getSuperState());
        v0(savedState);
        int i11 = savedState.f30746a;
        if (i11 == 1 || i11 == 2) {
            this.M = 4;
            this.N = 4;
        } else {
            this.M = i11;
            this.N = i11;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @NonNull
    public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v11), (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, @NonNull View view2, int i11, int i12) {
        this.Q = 0;
        this.R = false;
        return (i11 & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0035, code lost:
    
        if (r4.getTop() <= r2.F) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        r0 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0065, code lost:
    
        if (java.lang.Math.abs(r3 - r2.E) < java.lang.Math.abs(r3 - r2.H)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007b, code lost:
    
        if (V0() != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
    
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.H)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a7, code lost:
    
        if (java.lang.Math.abs(r3 - r2.F) < java.lang.Math.abs(r3 - r2.H)) goto L51;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStopNestedScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r3, @androidx.annotation.NonNull V r4, @androidx.annotation.NonNull android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.U()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.P0(r0)
            return
        Lf:
            boolean r3 = r2.q0()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference<android.view.View> r3 = r2.Y
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.R
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.Q
            r5 = 6
            if (r3 <= 0) goto L39
            boolean r3 = r2.f30713b
            if (r3 == 0) goto L2f
            goto Laa
        L2f:
            int r3 = r4.getTop()
            int r6 = r2.F
            if (r3 <= r6) goto Laa
            goto La9
        L39:
            boolean r3 = r2.J
            if (r3 == 0) goto L49
            float r3 = r2.h0()
            boolean r3 = r2.U0(r4, r3)
            if (r3 == 0) goto L49
            r0 = 5
            goto Laa
        L49:
            int r3 = r2.Q
            r6 = 4
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.f30713b
            if (r1 == 0) goto L68
            int r5 = r2.E
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.F
            if (r3 >= r1) goto L7e
            int r1 = r2.H
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.V0()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.f30713b
            if (r3 == 0) goto L94
        L92:
            r0 = r6
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.F
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = r5
        Laa:
            r3 = 0
            r2.X0(r4, r0, r3)
            r2.R = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull MotionEvent motionEvent) {
        if (!v11.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.M == 1 && actionMasked == 0) {
            return true;
        }
        if (T0()) {
            this.O.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            u0();
        }
        if (this.f30718f0 == null) {
            this.f30718f0 = VelocityTracker.obtain();
        }
        this.f30718f0.addMovement(motionEvent);
        if (T0() && actionMasked == 2 && !this.P && Math.abs(this.f30724i1 - motionEvent.getY()) > this.O.getTouchSlop()) {
            this.O.captureChildView(v11, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.P;
    }

    public final boolean p0(V v11) {
        ViewParent parent = v11.getParent();
        return parent != null && parent.isLayoutRequested() && ViewCompat.isAttachedToWindow(v11);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean q0() {
        return true;
    }

    public boolean r0() {
        return this.f30744y;
    }

    public void s0(@NonNull g gVar) {
        this.Z.remove(gVar);
    }

    public final void t0(View view, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, int i11) {
        ViewCompat.replaceAccessibilityAction(view, accessibilityActionCompat, null, L(i11));
    }

    public final void v0(@NonNull SavedState savedState) {
        int i11 = this.f30712a;
        if (i11 == 0) {
            return;
        }
        if (i11 == -1 || (i11 & 1) == 1) {
            this.f30717f = savedState.f30747b;
        }
        if (i11 == -1 || (i11 & 2) == 2) {
            this.f30713b = savedState.f30748c;
        }
        if (i11 == -1 || (i11 & 4) == 4) {
            this.J = savedState.f30749d;
        }
        if (i11 == -1 || (i11 & 8) == 8) {
            this.K = savedState.f30750e;
        }
    }

    public final void w0(V v11, Runnable runnable) {
        if (p0(v11)) {
            v11.post(runnable);
        } else {
            runnable.run();
        }
    }

    public void x0(@Nullable View view) {
        WeakReference<View> weakReference;
        if (view != null || (weakReference = this.X) == null) {
            this.X = new WeakReference<>(view);
            Z0(view, 1);
        } else {
            K(weakReference.get(), 1);
            this.X = null;
        }
    }

    @Deprecated
    public void y0(g gVar) {
        Log.w(A1, "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.Z.clear();
        if (gVar != null) {
            this.Z.add(gVar);
        }
    }

    public void z0(boolean z11) {
        this.L = z11;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class k {

        /* renamed from: a, reason: collision with root package name */
        public int f30762a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f30763b;

        /* renamed from: c, reason: collision with root package name */
        public final Runnable f30764c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.f30763b = false;
                ViewDragHelper viewDragHelper = BottomSheetBehavior.this.O;
                if (viewDragHelper != null && viewDragHelper.continueSettling(true)) {
                    k kVar = k.this;
                    kVar.c(kVar.f30762a);
                    return;
                }
                k kVar2 = k.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.M == 2) {
                    bottomSheetBehavior.P0(kVar2.f30762a);
                }
            }
        }

        public k() {
            this.f30764c = new a();
        }

        public void c(int i11) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.W;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f30762a = i11;
            if (this.f30763b) {
                return;
            }
            ViewCompat.postOnAnimation(BottomSheetBehavior.this.W.get(), this.f30764c);
            this.f30763b = true;
        }

        public /* synthetic */ k(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    public BottomSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        int i11;
        this.f30712a = 0;
        this.f30713b = true;
        this.f30714c = false;
        this.f30729l = -1;
        this.f30731m = -1;
        this.B = new k(this, null);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = 4;
        this.N = 4;
        this.S = 0.1f;
        this.Z = new ArrayList<>();
        this.f30724i1 = -1;
        this.f30730l1 = new SparseIntArray();
        this.f30732m1 = new e();
        this.f30723i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BottomSheetBehavior_Layout);
        int i12 = R.styleable.BottomSheetBehavior_Layout_backgroundTint;
        if (obtainStyledAttributes.hasValue(i12)) {
            this.f30727k = sn.c.a(context, obtainStyledAttributes, i12);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.f30745z = p.e(context, attributeSet, R.attr.bottomSheetStyle, J1).m();
        }
        M(context);
        N();
        this.I = obtainStyledAttributes.getDimension(R.styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        int i13 = R.styleable.BottomSheetBehavior_Layout_android_maxWidth;
        if (obtainStyledAttributes.hasValue(i13)) {
            I0(obtainStyledAttributes.getDimensionPixelSize(i13, -1));
        }
        int i14 = R.styleable.BottomSheetBehavior_Layout_android_maxHeight;
        if (obtainStyledAttributes.hasValue(i14)) {
            H0(obtainStyledAttributes.getDimensionPixelSize(i14, -1));
        }
        int i15 = R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i15);
        if (peekValue != null && (i11 = peekValue.data) == -1) {
            J0(i11);
        } else {
            J0(obtainStyledAttributes.getDimensionPixelSize(i15, -1));
        }
        F0(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        C0(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        B0(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        O0(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        z0(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_draggable, true));
        L0(obtainStyledAttributes.getInt(R.styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        D0(obtainStyledAttributes.getFloat(R.styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        int i16 = R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i16);
        if (peekValue2 != null && peekValue2.type == 16) {
            A0(peekValue2.data);
        } else {
            A0(obtainStyledAttributes.getDimensionPixelOffset(i16, 0));
        }
        N0(obtainStyledAttributes.getInt(R.styleable.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500));
        this.f30735p = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.f30736q = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.f30737r = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.f30738s = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.f30739t = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.f30740u = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.f30741v = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        this.f30744y = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
        obtainStyledAttributes.recycle();
        this.f30715d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class g {
        public abstract void b(@NonNull View view, float f11);

        public abstract void c(@NonNull View view, int i11);

        public void a(@NonNull View view) {
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, int i11, int i12, int i13, int i14, int i15, @NonNull int[] iArr) {
    }
}
