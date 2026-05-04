package com.flowviewpagerindicator;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import androidx.annotation.DrawableRes;
import androidx.core.os.ParcelableCompat;
import androidx.core.os.ParcelableCompatCreatorCallbacks;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.VelocityTrackerCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityRecordCompat;
import androidx.core.widget.EdgeEffectCompat;
import androidx.viewpager.widget.PagerAdapter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class FlowableViewPager extends ViewGroup {
    public static final int A1 = 0;
    public static final int B1 = 1;
    public static final int C1 = 2;
    public static final int E1 = 0;
    public static final int F1 = 1;
    public static final int G1 = 2;

    /* renamed from: n1, reason: collision with root package name */
    public static final String f29611n1 = "ViewPager";

    /* renamed from: o1, reason: collision with root package name */
    public static final boolean f29612o1 = false;

    /* renamed from: p1, reason: collision with root package name */
    public static final boolean f29613p1 = false;

    /* renamed from: q1, reason: collision with root package name */
    public static final int f29614q1 = 1;

    /* renamed from: r1, reason: collision with root package name */
    public static final int f29615r1 = 600;

    /* renamed from: s1, reason: collision with root package name */
    public static final int f29616s1 = 25;

    /* renamed from: t1, reason: collision with root package name */
    public static final int f29617t1 = 16;

    /* renamed from: u1, reason: collision with root package name */
    public static final int f29618u1 = 400;

    /* renamed from: y1, reason: collision with root package name */
    public static final int f29622y1 = -1;

    /* renamed from: z1, reason: collision with root package name */
    public static final int f29623z1 = 2;
    public int A;
    public int B;
    public int C;
    public float D;
    public float E;
    public float F;
    public float G;
    public int H;
    public VelocityTracker I;
    public int J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public long O;
    public EdgeEffectCompat P;
    public EdgeEffectCompat Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public int U;
    public i V;
    public i W;

    /* renamed from: a, reason: collision with root package name */
    public int f29624a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<e> f29625b;

    /* renamed from: c, reason: collision with root package name */
    public final e f29626c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f29627d;

    /* renamed from: e, reason: collision with root package name */
    public PagerAdapter f29628e;

    /* renamed from: f, reason: collision with root package name */
    public int f29629f;

    /* renamed from: f0, reason: collision with root package name */
    public h f29630f0;

    /* renamed from: f1, reason: collision with root package name */
    public j f29631f1;

    /* renamed from: g, reason: collision with root package name */
    public int f29632g;

    /* renamed from: h, reason: collision with root package name */
    public Parcelable f29633h;

    /* renamed from: h1, reason: collision with root package name */
    public Method f29634h1;

    /* renamed from: i, reason: collision with root package name */
    public ClassLoader f29635i;

    /* renamed from: i1, reason: collision with root package name */
    public int f29636i1;

    /* renamed from: j, reason: collision with root package name */
    public Scroller f29637j;

    /* renamed from: j1, reason: collision with root package name */
    public ArrayList<View> f29638j1;

    /* renamed from: k, reason: collision with root package name */
    public k f29639k;

    /* renamed from: k1, reason: collision with root package name */
    public final Runnable f29640k1;

    /* renamed from: l, reason: collision with root package name */
    public int f29641l;

    /* renamed from: l1, reason: collision with root package name */
    public int f29642l1;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f29643m;

    /* renamed from: m1, reason: collision with root package name */
    public int f29644m1;

    /* renamed from: n, reason: collision with root package name */
    public int f29645n;

    /* renamed from: o, reason: collision with root package name */
    public int f29646o;

    /* renamed from: p, reason: collision with root package name */
    public float f29647p;

    /* renamed from: q, reason: collision with root package name */
    public float f29648q;

    /* renamed from: r, reason: collision with root package name */
    public int f29649r;

    /* renamed from: s, reason: collision with root package name */
    public int f29650s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f29651t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f29652u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f29653v;

    /* renamed from: w, reason: collision with root package name */
    public int f29654w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f29655x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f29656y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f29657z;

    /* renamed from: v1, reason: collision with root package name */
    public static final int[] f29619v1 = {R.attr.layout_gravity};

    /* renamed from: w1, reason: collision with root package name */
    public static final Comparator<e> f29620w1 = new a();

    /* renamed from: x1, reason: collision with root package name */
    public static final Interpolator f29621x1 = new b();
    public static final m D1 = new m();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = ParcelableCompat.newCreator(new a());

        /* renamed from: a, reason: collision with root package name */
        public int f29658a;

        /* renamed from: b, reason: collision with root package name */
        public Parcelable f29659b;

        /* renamed from: c, reason: collision with root package name */
        public ClassLoader f29660c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements ParcelableCompatCreatorCallbacks<SavedState> {
            @Override // androidx.core.os.ParcelableCompatCreatorCallbacks
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel in2, ClassLoader loader) {
                return new SavedState(in2, loader);
            }

            @Override // androidx.core.os.ParcelableCompatCreatorCallbacks
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }
        }

        public SavedState(Parcelable superState) {
            super(superState);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f29658a + com.alipay.sdk.m.u.i.f11099d;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeInt(this.f29658a);
            out.writeParcelable(this.f29659b, flags);
        }

        public SavedState(Parcel in2, ClassLoader loader) {
            super(in2);
            loader = loader == null ? getClass().getClassLoader() : loader;
            this.f29658a = in2.readInt();
            this.f29659b = in2.readParcelable(loader);
            this.f29660c = loader;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Comparator<e> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(e lhs, e rhs) {
            return lhs.f29663b - rhs.f29663b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float t11) {
            float f11 = t11 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FlowableViewPager.this.setScrollState(0);
            FlowableViewPager.this.G();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public Object f29662a;

        /* renamed from: b, reason: collision with root package name */
        public int f29663b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f29664c;

        /* renamed from: d, reason: collision with root package name */
        public float f29665d;

        /* renamed from: e, reason: collision with root package name */
        public float f29666e;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g extends AccessibilityDelegateCompat {
        public g() {
        }

        private boolean canScroll() {
            return FlowableViewPager.this.f29628e != null && FlowableViewPager.this.f29628e.getCount() > 1;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View host, AccessibilityEvent event) {
            super.onInitializeAccessibilityEvent(host, event);
            event.setClassName(FlowableViewPager.class.getName());
            AccessibilityRecordCompat obtain = AccessibilityRecordCompat.obtain();
            obtain.setScrollable(canScroll());
            if (event.getEventType() != 4096 || FlowableViewPager.this.f29628e == null) {
                return;
            }
            obtain.setItemCount(FlowableViewPager.this.f29628e.getCount());
            obtain.setFromIndex(FlowableViewPager.this.f29629f);
            obtain.setToIndex(FlowableViewPager.this.f29629f);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
            super.onInitializeAccessibilityNodeInfo(host, info);
            info.setClassName(FlowableViewPager.class.getName());
            info.setScrollable(canScroll());
            if (FlowableViewPager.this.canScrollHorizontally(1)) {
                info.addAction(4096);
            }
            if (FlowableViewPager.this.canScrollHorizontally(-1)) {
                info.addAction(8192);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View host, int action, Bundle args) {
            if (super.performAccessibilityAction(host, action, args)) {
                return true;
            }
            if (action == 4096) {
                if (!FlowableViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                FlowableViewPager flowableViewPager = FlowableViewPager.this;
                flowableViewPager.setCurrentItem(flowableViewPager.f29629f + 1);
                return true;
            }
            if (action != 8192 || !FlowableViewPager.this.canScrollHorizontally(-1)) {
                return false;
            }
            FlowableViewPager flowableViewPager2 = FlowableViewPager.this;
            flowableViewPager2.setCurrentItem(flowableViewPager2.f29629f - 1);
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface h {
        void a(PagerAdapter oldAdapter, PagerAdapter newAdapter);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface i {
        void onPageScrollStateChanged(int state);

        void onPageScrolled(int position, float positionOffset, int positionOffsetPixels);

        void onPageSelected(int position);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface j {
        void transformPage(View page, float position);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class k extends DataSetObserver {
        public k() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            FlowableViewPager.this.k();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            FlowableViewPager.this.k();
        }

        public /* synthetic */ k(FlowableViewPager flowableViewPager, a aVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class m implements Comparator<View> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View lhs, View rhs) {
            f fVar = (f) lhs.getLayoutParams();
            f fVar2 = (f) rhs.getLayoutParams();
            boolean z11 = fVar.f29667a;
            return z11 != fVar2.f29667a ? z11 ? 1 : -1 : fVar.f29671e - fVar2.f29671e;
        }
    }

    public FlowableViewPager(Context context) {
        super(context);
        this.f29625b = new ArrayList<>();
        this.f29626c = new e();
        this.f29627d = new Rect();
        this.f29632g = -1;
        this.f29633h = null;
        this.f29635i = null;
        this.f29647p = -3.4028235E38f;
        this.f29648q = Float.MAX_VALUE;
        this.f29654w = 1;
        this.H = -1;
        this.R = true;
        this.S = false;
        this.f29640k1 = new c();
        this.f29642l1 = 0;
        this.f29644m1 = 600;
        x();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScrollState(int newState) {
        if (this.f29642l1 == newState) {
            return;
        }
        this.f29642l1 = newState;
        if (this.f29631f1 != null) {
            n(newState != 0);
        }
        i iVar = this.V;
        if (iVar != null) {
            iVar.onPageScrollStateChanged(newState);
        }
    }

    private void setScrollingCacheEnabled(boolean enabled) {
        if (this.f29652u != enabled) {
            this.f29652u = enabled;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.U
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6c
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L1b:
            if (r7 >= r6) goto L6c
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            com.flowviewpagerindicator.FlowableViewPager$f r9 = (com.flowviewpagerindicator.FlowableViewPager.f) r9
            boolean r10 = r9.f29667a
            if (r10 != 0) goto L2c
            goto L69
        L2c:
            int r9 = r9.f29668b
            r9 = r9 & 7
            if (r9 == r2) goto L50
            r10 = 3
            if (r9 == r10) goto L4a
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5d
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
        L46:
            r11 = r9
            r9 = r3
            r3 = r11
            goto L5d
        L4a:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5d
        L50:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
            goto L46
        L5d:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L68
            r8.offsetLeftAndRight(r3)
        L68:
            r3 = r9
        L69:
            int r7 = r7 + 1
            goto L1b
        L6c:
            com.flowviewpagerindicator.FlowableViewPager$i r0 = r12.V
            if (r0 == 0) goto L73
            r0.onPageScrolled(r13, r14, r15)
        L73:
            com.flowviewpagerindicator.FlowableViewPager$i r0 = r12.W
            if (r0 == 0) goto L7a
            r0.onPageScrolled(r13, r14, r15)
        L7a:
            com.flowviewpagerindicator.FlowableViewPager$j r13 = r12.f29631f1
            if (r13 == 0) goto Lab
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L86:
            if (r1 >= r14) goto Lab
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            com.flowviewpagerindicator.FlowableViewPager$f r0 = (com.flowviewpagerindicator.FlowableViewPager.f) r0
            boolean r0 = r0.f29667a
            if (r0 == 0) goto L97
            goto La8
        L97:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            com.flowviewpagerindicator.FlowableViewPager$j r3 = r12.f29631f1
            r3.transformPage(r15, r0)
        La8:
            int r1 = r1 + 1
            goto L86
        Lab:
            r12.T = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flowviewpagerindicator.FlowableViewPager.A(int, float, int):void");
    }

    public final void B(MotionEvent ev2) {
        int actionIndex = MotionEventCompat.getActionIndex(ev2);
        if (MotionEventCompat.getPointerId(ev2, actionIndex) == this.H) {
            int i11 = actionIndex == 0 ? 1 : 0;
            this.D = MotionEventCompat.getX(ev2, i11);
            this.H = MotionEventCompat.getPointerId(ev2, i11);
            VelocityTracker velocityTracker = this.I;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean C() {
        int i11 = this.f29629f;
        if (i11 <= 0) {
            return false;
        }
        M(i11 - 1, true);
        return true;
    }

    public boolean D() {
        PagerAdapter pagerAdapter = this.f29628e;
        if (pagerAdapter == null || this.f29629f >= pagerAdapter.getCount() - 1) {
            return false;
        }
        M(this.f29629f + 1, true);
        return true;
    }

    public final boolean E(int xpos) {
        if (this.f29625b.size() == 0) {
            this.T = false;
            A(0, 0.0f, 0);
            if (this.T) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        e v11 = v();
        int clientWidth = getClientWidth();
        int i11 = this.f29641l;
        int i12 = clientWidth + i11;
        float f11 = clientWidth;
        int i13 = v11.f29663b;
        float f12 = ((xpos / f11) - v11.f29666e) / (v11.f29665d + (i11 / f11));
        this.T = false;
        A(i13, f12, (int) (i12 * f12));
        if (this.T) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean F(float x11) {
        boolean z11;
        float f11 = this.D - x11;
        this.D = x11;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.f29647p * clientWidth;
        float f13 = this.f29648q * clientWidth;
        e eVar = this.f29625b.get(0);
        ArrayList<e> arrayList = this.f29625b;
        boolean z12 = true;
        e eVar2 = arrayList.get(arrayList.size() - 1);
        if (eVar.f29663b != 0) {
            f12 = eVar.f29666e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (eVar2.f29663b != this.f29628e.getCount() - 1) {
            f13 = eVar2.f29666e * clientWidth;
            z12 = false;
        }
        if (scrollX < f12) {
            r4 = z11 ? this.P.onPull(Math.abs(f12 - scrollX) / clientWidth) : false;
            scrollX = f12;
        } else if (scrollX > f13) {
            r4 = z12 ? this.Q.onPull(Math.abs(scrollX - f13) / clientWidth) : false;
            scrollX = f13;
        }
        int i11 = (int) scrollX;
        this.D += scrollX - i11;
        scrollTo(i11, getScrollY());
        E(i11);
        return r4;
    }

    public void G() {
        H(this.f29629f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r10 == r11) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void H(int r18) {
        /*
            Method dump skipped, instructions count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flowviewpagerindicator.FlowableViewPager.H(int):void");
    }

    public final void I(int width, int oldWidth, int margin, int oldMargin) {
        if (oldWidth <= 0 || this.f29625b.isEmpty()) {
            e w11 = w(this.f29629f);
            int min = (int) ((w11 != null ? Math.min(w11.f29666e, this.f29648q) : 0.0f) * ((width - getPaddingLeft()) - getPaddingRight()));
            if (min != getScrollX()) {
                j(false);
                scrollTo(min, getScrollY());
                return;
            }
            return;
        }
        int scrollX = (int) ((getScrollX() / (((oldWidth - getPaddingLeft()) - getPaddingRight()) + oldMargin)) * (((width - getPaddingLeft()) - getPaddingRight()) + margin));
        scrollTo(scrollX, getScrollY());
        if (this.f29637j.isFinished()) {
            return;
        }
        this.f29637j.startScroll(scrollX, 0, (int) (w(this.f29629f).f29666e * width), 0, this.f29637j.getDuration() - this.f29637j.timePassed());
    }

    public final void J() {
        int i11 = 0;
        while (i11 < getChildCount()) {
            if (!((f) getChildAt(i11).getLayoutParams()).f29667a) {
                removeViewAt(i11);
                i11--;
            }
            i11++;
        }
    }

    public final void K(boolean disallowIntercept) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(disallowIntercept);
        }
    }

    public final void L(int item, boolean smoothScroll, boolean autoScroll, int velocity, boolean dispatchSelected) {
        i iVar;
        i iVar2;
        i iVar3;
        i iVar4;
        e w11 = w(item);
        int clientWidth = w11 != null ? (int) (getClientWidth() * Math.max(this.f29647p, Math.min(w11.f29666e, this.f29648q))) : 0;
        if (smoothScroll) {
            U(clientWidth, 0, velocity, autoScroll);
            if (dispatchSelected && (iVar4 = this.V) != null) {
                iVar4.onPageSelected(item);
            }
            if (!dispatchSelected || (iVar3 = this.W) == null) {
                return;
            }
            iVar3.onPageSelected(item);
            return;
        }
        if (dispatchSelected && (iVar2 = this.V) != null) {
            iVar2.onPageSelected(item);
        }
        if (dispatchSelected && (iVar = this.W) != null) {
            iVar.onPageSelected(item);
        }
        j(false);
        scrollTo(clientWidth, 0);
        E(clientWidth);
    }

    public void M(int item, boolean smoothScroll) {
        this.f29653v = false;
        N(item, smoothScroll, false);
    }

    public void N(int item, boolean smoothScroll, boolean always) {
        O(item, smoothScroll, always, 0);
    }

    public void O(int item, boolean smoothScroll, boolean always, int velocity) {
        P(item, smoothScroll, false, always, velocity);
    }

    public void P(int item, boolean smoothScroll, boolean autoScroll, boolean always, int velocity) {
        int i11;
        i iVar;
        i iVar2;
        PagerAdapter pagerAdapter = this.f29628e;
        if (pagerAdapter == null || pagerAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!always && this.f29629f == item && this.f29625b.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (item < 0) {
            i11 = 0;
        } else {
            if (item >= this.f29628e.getCount()) {
                item = this.f29628e.getCount() - 1;
            }
            i11 = item;
        }
        int i12 = this.f29654w;
        int i13 = this.f29629f;
        if (i11 > i13 + i12 || i11 < i13 - i12) {
            for (int i14 = 0; i14 < this.f29625b.size(); i14++) {
                this.f29625b.get(i14).f29664c = true;
            }
        }
        boolean z11 = this.f29629f != i11;
        if (!this.R) {
            H(i11);
            L(i11, smoothScroll, autoScroll, velocity, z11);
            return;
        }
        this.f29629f = i11;
        if (z11 && (iVar2 = this.V) != null) {
            iVar2.onPageSelected(i11);
        }
        if (z11 && (iVar = this.W) != null) {
            iVar.onPageSelected(i11);
        }
        requestLayout();
    }

    public i Q(i listener) {
        i iVar = this.W;
        this.W = listener;
        return iVar;
    }

    public void R(boolean reverseDrawingOrder, j transformer) {
        boolean z11 = transformer != null;
        boolean z12 = z11 != (this.f29631f1 != null);
        this.f29631f1 = transformer;
        setChildrenDrawingOrderEnabledCompat(z11);
        if (z11) {
            this.f29636i1 = reverseDrawingOrder ? 2 : 1;
        } else {
            this.f29636i1 = 0;
        }
        if (z12) {
            G();
        }
    }

    public void S(int item) {
        this.f29653v = false;
        P(item, true, true, false, 0);
    }

    public void T(int x11, int y11) {
        U(x11, y11, 0, false);
    }

    public void U(int x11, int y11, int velocity, boolean autoScroll) {
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int i11 = x11 - scrollX;
        int i12 = y11 - scrollY;
        if (i11 == 0 && i12 == 0) {
            j(false);
            G();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i13 = clientWidth / 2;
        float f11 = clientWidth;
        float f12 = i13;
        float m11 = f12 + (m(Math.min(1.0f, (Math.abs(i11) * 1.0f) / f11)) * f12);
        int abs = Math.abs(velocity);
        this.f29637j.startScroll(scrollX, scrollY, i11, i12, autoScroll ? this.f29644m1 : Math.min(abs > 0 ? Math.round(Math.abs(m11 / abs) * 1000.0f) * 4 : (int) (((Math.abs(i11) / ((f11 * this.f29628e.getPageWidth(this.f29629f)) + this.f29641l)) + 1.0f) * 100.0f), 600));
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public final void V() {
        if (this.f29636i1 != 0) {
            ArrayList<View> arrayList = this.f29638j1;
            if (arrayList == null) {
                this.f29638j1 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                this.f29638j1.add(getChildAt(i11));
            }
            Collections.sort(this.f29638j1, D1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> views, int direction, int focusableMode) {
        e u11;
        int size = views.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() == 0 && (u11 = u(childAt)) != null && u11.f29663b == this.f29629f) {
                    childAt.addFocusables(views, direction, focusableMode);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == views.size()) && isFocusable()) {
            if ((focusableMode & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            views.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> views) {
        e u11;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (u11 = u(childAt)) != null && u11.f29663b == this.f29629f) {
                childAt.addTouchables(views);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        if (!checkLayoutParams(params)) {
            params = generateLayoutParams(params);
        }
        f fVar = (f) params;
        boolean z11 = fVar.f29667a | (child instanceof d);
        fVar.f29667a = z11;
        if (!this.f29651t) {
            super.addView(child, index, params);
        } else {
            if (z11) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            fVar.f29670d = true;
            addViewInLayout(child, index, params);
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int direction) {
        if (this.f29628e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return direction < 0 ? scrollX > ((int) (((float) clientWidth) * this.f29647p)) : direction > 0 && scrollX < ((int) (((float) clientWidth) * this.f29648q));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams p11) {
        return (p11 instanceof f) && super.checkLayoutParams(p11);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f29637j.isFinished() || !this.f29637j.computeScrollOffset()) {
            j(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f29637j.getCurrX();
        int currY = this.f29637j.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!E(currX)) {
                this.f29637j.abortAnimation();
                scrollTo(0, currY);
            }
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        return super.dispatchKeyEvent(event) || q(event);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        e u11;
        if (event.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(event);
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (u11 = u(childAt)) != null && u11.f29663b == this.f29629f && childAt.dispatchPopulateAccessibilityEvent(event)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        super.draw(canvas);
        int overScrollMode = ViewCompat.getOverScrollMode(this);
        boolean z11 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.f29628e) != null && pagerAdapter.getCount() > 1)) {
            if (!this.P.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f29647p * width);
                this.P.setSize(height, width);
                z11 = this.P.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.Q.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f29648q + 1.0f)) * width2);
                this.Q.setSize(height2, width2);
                z11 |= this.Q.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.P.finish();
            this.Q.finish();
        }
        if (z11) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f29643m;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public e e(int position, int index) {
        e eVar = new e();
        eVar.f29663b = position;
        eVar.f29662a = this.f29628e.instantiateItem((ViewGroup) this, position);
        eVar.f29665d = this.f29628e.getPageWidth(position);
        if (index < 0 || index >= this.f29625b.size()) {
            this.f29625b.add(eVar);
            return eVar;
        }
        this.f29625b.add(index, eVar);
        return eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean f(int r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.findFocus()
            r1 = 0
            if (r0 != r4) goto L9
        L7:
            r0 = r1
            goto L63
        L9:
            if (r0 == 0) goto L63
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r4) goto L16
            goto L63
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L2f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L48
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L2f
        L48:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ViewPager"
            android.util.Log.e(r2, r0)
            goto L7
        L63:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r4, r0, r5)
            r2 = 66
            r3 = 17
            if (r1 == 0) goto Lb3
            if (r1 == r0) goto Lb3
            if (r5 != r3) goto L93
            android.graphics.Rect r2 = r4.f29627d
            android.graphics.Rect r2 = r4.s(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.f29627d
            android.graphics.Rect r3 = r4.s(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L8e
            if (r2 < r3) goto L8e
            boolean r0 = r4.C()
            goto Lca
        L8e:
            boolean r0 = r1.requestFocus()
            goto Lca
        L93:
            if (r5 != r2) goto Lbf
            android.graphics.Rect r2 = r4.f29627d
            android.graphics.Rect r2 = r4.s(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.f29627d
            android.graphics.Rect r3 = r4.s(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto Lae
            if (r2 > r3) goto Lae
            boolean r0 = r4.D()
            goto Lca
        Lae:
            boolean r0 = r1.requestFocus()
            goto Lca
        Lb3:
            if (r5 == r3) goto Lc6
            r0 = 1
            if (r5 != r0) goto Lb9
            goto Lc6
        Lb9:
            if (r5 == r2) goto Lc1
            r0 = 2
            if (r5 != r0) goto Lbf
            goto Lc1
        Lbf:
            r0 = 0
            goto Lca
        Lc1:
            boolean r0 = r4.D()
            goto Lca
        Lc6:
            boolean r0 = r4.C()
        Lca:
            if (r0 == 0) goto Ld3
            int r5 = android.view.SoundEffectConstants.getContantForFocusDirection(r5)
            r4.playSoundEffect(r5)
        Ld3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flowviewpagerindicator.FlowableViewPager.f(int):boolean");
    }

    public boolean g() {
        if (this.f29655x) {
            return false;
        }
        this.N = true;
        setScrollState(1);
        this.D = 0.0f;
        this.F = 0.0f;
        VelocityTracker velocityTracker = this.I;
        if (velocityTracker == null) {
            this.I = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.I.addMovement(obtain);
        obtain.recycle();
        this.O = uptimeMillis;
        return true;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p11) {
        return generateDefaultLayoutParams();
    }

    public PagerAdapter getAdapter() {
        return this.f29628e;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int childCount, int i11) {
        if (this.f29636i1 == 2) {
            i11 = (childCount - 1) - i11;
        }
        return ((f) this.f29638j1.get(i11).getLayoutParams()).f29672f;
    }

    public int getCurrentItem() {
        return this.f29629f;
    }

    public int getOffscreenPageLimit() {
        return this.f29654w;
    }

    public int getPageMargin() {
        return this.f29641l;
    }

    public final void h(e curItem, int curIndex, e oldCurInfo) {
        int i11;
        int i12;
        e eVar;
        e eVar2;
        int count = this.f29628e.getCount();
        int clientWidth = getClientWidth();
        float f11 = clientWidth > 0 ? this.f29641l / clientWidth : 0.0f;
        if (oldCurInfo != null) {
            int i13 = oldCurInfo.f29663b;
            int i14 = curItem.f29663b;
            if (i13 < i14) {
                float f12 = oldCurInfo.f29666e + oldCurInfo.f29665d + f11;
                int i15 = i13 + 1;
                int i16 = 0;
                while (i15 <= curItem.f29663b && i16 < this.f29625b.size()) {
                    e eVar3 = this.f29625b.get(i16);
                    while (true) {
                        eVar2 = eVar3;
                        if (i15 <= eVar2.f29663b || i16 >= this.f29625b.size() - 1) {
                            break;
                        }
                        i16++;
                        eVar3 = this.f29625b.get(i16);
                    }
                    while (i15 < eVar2.f29663b) {
                        f12 += this.f29628e.getPageWidth(i15) + f11;
                        i15++;
                    }
                    eVar2.f29666e = f12;
                    f12 += eVar2.f29665d + f11;
                    i15++;
                }
            } else if (i13 > i14) {
                int size = this.f29625b.size() - 1;
                float f13 = oldCurInfo.f29666e;
                while (true) {
                    i13--;
                    if (i13 < curItem.f29663b || size < 0) {
                        break;
                    }
                    e eVar4 = this.f29625b.get(size);
                    while (true) {
                        eVar = eVar4;
                        if (i13 >= eVar.f29663b || size <= 0) {
                            break;
                        }
                        size--;
                        eVar4 = this.f29625b.get(size);
                    }
                    while (i13 > eVar.f29663b) {
                        f13 -= this.f29628e.getPageWidth(i13) + f11;
                        i13--;
                    }
                    f13 -= eVar.f29665d + f11;
                    eVar.f29666e = f13;
                }
            }
        }
        int size2 = this.f29625b.size();
        float f14 = curItem.f29666e;
        int i17 = curItem.f29663b;
        int i18 = i17 - 1;
        this.f29647p = i17 == 0 ? f14 : -3.4028235E38f;
        int i19 = count - 1;
        this.f29648q = i17 == i19 ? (curItem.f29665d + f14) - 1.0f : Float.MAX_VALUE;
        int i21 = curIndex - 1;
        while (i21 >= 0) {
            e eVar5 = this.f29625b.get(i21);
            while (true) {
                i12 = eVar5.f29663b;
                if (i18 <= i12) {
                    break;
                }
                f14 -= this.f29628e.getPageWidth(i18) + f11;
                i18--;
            }
            f14 -= eVar5.f29665d + f11;
            eVar5.f29666e = f14;
            if (i12 == 0) {
                this.f29647p = f14;
            }
            i21--;
            i18--;
        }
        float f15 = curItem.f29666e + curItem.f29665d + f11;
        int i22 = curItem.f29663b + 1;
        int i23 = curIndex + 1;
        while (i23 < size2) {
            e eVar6 = this.f29625b.get(i23);
            while (true) {
                i11 = eVar6.f29663b;
                if (i22 >= i11) {
                    break;
                }
                f15 += this.f29628e.getPageWidth(i22) + f11;
                i22++;
            }
            if (i11 == i19) {
                this.f29648q = (eVar6.f29665d + f15) - 1.0f;
            }
            eVar6.f29666e = f15;
            f15 += eVar6.f29665d + f11;
            i23++;
            i22++;
        }
        this.S = false;
    }

    public boolean i(View v11, boolean checkV, int dx2, int x11, int y11) {
        int i11;
        if (v11 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v11;
            int scrollX = v11.getScrollX();
            int scrollY = v11.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i12 = x11 + scrollX;
                if (i12 >= childAt.getLeft() && i12 < childAt.getRight() && (i11 = y11 + scrollY) >= childAt.getTop() && i11 < childAt.getBottom() && i(childAt, true, dx2, i12 - childAt.getLeft(), i11 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return checkV && ViewCompat.canScrollHorizontally(v11, -dx2);
    }

    public final void j(boolean postEvents) {
        boolean z11 = this.f29642l1 == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            this.f29637j.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f29637j.getCurrX();
            int currY = this.f29637j.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
            }
        }
        this.f29653v = false;
        for (int i11 = 0; i11 < this.f29625b.size(); i11++) {
            e eVar = this.f29625b.get(i11);
            if (eVar.f29664c) {
                eVar.f29664c = false;
                z11 = true;
            }
        }
        if (z11) {
            if (postEvents) {
                ViewCompat.postOnAnimation(this, this.f29640k1);
            } else {
                this.f29640k1.run();
            }
        }
    }

    public void k() {
        int count = this.f29628e.getCount();
        this.f29624a = count;
        boolean z11 = this.f29625b.size() < (this.f29654w * 2) + 1 && this.f29625b.size() < count;
        int i11 = this.f29629f;
        int i12 = 0;
        boolean z12 = false;
        while (i12 < this.f29625b.size()) {
            e eVar = this.f29625b.get(i12);
            int itemPosition = this.f29628e.getItemPosition(eVar.f29662a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f29625b.remove(i12);
                    i12--;
                    if (!z12) {
                        this.f29628e.startUpdate((ViewGroup) this);
                        z12 = true;
                    }
                    this.f29628e.destroyItem((ViewGroup) this, eVar.f29663b, eVar.f29662a);
                    int i13 = this.f29629f;
                    if (i13 == eVar.f29663b) {
                        i11 = Math.max(0, Math.min(i13, count - 1));
                    }
                } else {
                    int i14 = eVar.f29663b;
                    if (i14 != itemPosition) {
                        if (i14 == this.f29629f) {
                            i11 = itemPosition;
                        }
                        eVar.f29663b = itemPosition;
                    }
                }
                z11 = true;
            }
            i12++;
        }
        if (z12) {
            this.f29628e.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f29625b, f29620w1);
        if (z11) {
            int childCount = getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                f fVar = (f) getChildAt(i15).getLayoutParams();
                if (!fVar.f29667a) {
                    fVar.f29669c = 0.0f;
                }
            }
            N(i11, false, true);
            requestLayout();
        }
    }

    public final int l(int currentPage, float pageOffset, int velocity, int deltaX) {
        if (Math.abs(deltaX) <= this.L || Math.abs(velocity) <= this.J) {
            currentPage = (int) (currentPage + pageOffset + (currentPage >= this.f29629f ? 0.4f : 0.6f));
        } else if (velocity <= 0) {
            currentPage++;
        }
        if (this.f29625b.size() <= 0) {
            return currentPage;
        }
        return Math.max(this.f29625b.get(0).f29663b, Math.min(currentPage, this.f29625b.get(r4.size() - 1).f29663b));
    }

    public float m(float f11) {
        return (float) Math.sin((float) ((f11 - 0.5f) * 0.4712389167638204d));
    }

    public final void n(boolean enable) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            getChildAt(i11).setLayerType(enable ? 2 : 0, null);
        }
    }

    public final void o() {
        this.f29655x = false;
        this.f29656y = false;
        VelocityTracker velocityTracker = this.I;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.I = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.R = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f29640k1);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i11;
        float f11;
        int i12;
        super.onDraw(canvas);
        if (this.f29641l <= 0 || this.f29643m == null || this.f29625b.size() <= 0 || this.f29628e == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f12 = this.f29641l / width;
        int i13 = 0;
        e eVar = this.f29625b.get(0);
        float f13 = eVar.f29666e;
        int size = this.f29625b.size();
        int i14 = eVar.f29663b;
        int i15 = this.f29625b.get(size - 1).f29663b;
        while (i14 < i15) {
            while (true) {
                i11 = eVar.f29663b;
                if (i14 <= i11 || i13 >= size) {
                    break;
                }
                i13++;
                eVar = this.f29625b.get(i13);
            }
            if (i14 == i11) {
                float f14 = eVar.f29666e;
                float f15 = eVar.f29665d;
                f11 = (f14 + f15) * width;
                f13 = f14 + f15 + f12;
            } else {
                float pageWidth = this.f29628e.getPageWidth(i14);
                f11 = (f13 + pageWidth) * width;
                f13 += pageWidth + f12;
            }
            int i16 = this.f29641l;
            if (i16 + f11 > scrollX) {
                i12 = scrollX;
                this.f29643m.setBounds((int) f11, this.f29645n, (int) (i16 + f11 + 0.5f), this.f29646o);
                this.f29643m.draw(canvas);
            } else {
                i12 = scrollX;
            }
            if (f11 > i12 + r2) {
                return;
            }
            i14++;
            scrollX = i12;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev2) {
        int action = ev2.getAction() & 255;
        if (action == 3 || action == 1) {
            this.f29655x = false;
            this.f29656y = false;
            this.H = -1;
            VelocityTracker velocityTracker = this.I;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.I = null;
            }
            return false;
        }
        if (action != 0) {
            if (this.f29655x) {
                return true;
            }
            if (this.f29656y) {
                return false;
            }
        }
        if (action == 0) {
            float x11 = ev2.getX();
            this.F = x11;
            this.D = x11;
            float y11 = ev2.getY();
            this.G = y11;
            this.E = y11;
            this.H = MotionEventCompat.getPointerId(ev2, 0);
            this.f29656y = false;
            this.f29637j.computeScrollOffset();
            if (this.f29642l1 != 2 || Math.abs(this.f29637j.getFinalX() - this.f29637j.getCurrX()) <= this.M) {
                j(false);
                this.f29655x = false;
            } else {
                this.f29637j.abortAnimation();
                this.f29653v = false;
                G();
                this.f29655x = true;
                K(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i11 = this.H;
            if (i11 != -1) {
                int findPointerIndex = MotionEventCompat.findPointerIndex(ev2, i11);
                float x12 = MotionEventCompat.getX(ev2, findPointerIndex);
                float f11 = x12 - this.D;
                float abs = Math.abs(f11);
                float y12 = MotionEventCompat.getY(ev2, findPointerIndex);
                float abs2 = Math.abs(y12 - this.G);
                if (f11 != 0.0f && !z(this.D, f11) && i(this, false, (int) f11, (int) x12, (int) y12)) {
                    this.D = x12;
                    this.E = y12;
                    this.f29656y = true;
                    return false;
                }
                int i12 = this.C;
                if (abs > i12 && abs * 0.5f > abs2) {
                    this.f29655x = true;
                    K(true);
                    setScrollState(1);
                    this.D = f11 > 0.0f ? this.F + this.C : this.F - this.C;
                    this.E = y12;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > i12) {
                    this.f29656y = true;
                }
                if (this.f29655x && F(x12)) {
                    ViewCompat.postInvalidateOnAnimation(this);
                }
            }
        } else if (action == 6) {
            B(ev2);
        }
        if (this.I == null) {
            this.I = VelocityTracker.obtain();
        }
        this.I.addMovement(ev2);
        return this.f29655x;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flowviewpagerindicator.FlowableViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        f fVar;
        f fVar2;
        int i11;
        setMeasuredDimension(View.getDefaultSize(0, widthMeasureSpec), View.getDefaultSize(0, heightMeasureSpec));
        int measuredWidth = getMeasuredWidth();
        this.B = Math.min(measuredWidth / 10, this.A);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i12 = 0;
        while (true) {
            boolean z11 = true;
            int i13 = 1073741824;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && (fVar2 = (f) childAt.getLayoutParams()) != null && fVar2.f29667a) {
                int i14 = fVar2.f29668b;
                int i15 = i14 & 7;
                int i16 = i14 & 112;
                boolean z12 = i16 == 48 || i16 == 80;
                if (i15 != 3 && i15 != 5) {
                    z11 = false;
                }
                int i17 = Integer.MIN_VALUE;
                if (z12) {
                    i11 = Integer.MIN_VALUE;
                    i17 = 1073741824;
                } else {
                    i11 = z11 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i18 = ((ViewGroup.LayoutParams) fVar2).width;
                if (i18 != -2) {
                    if (i18 == -1) {
                        i18 = paddingLeft;
                    }
                    i17 = 1073741824;
                } else {
                    i18 = paddingLeft;
                }
                int i19 = ((ViewGroup.LayoutParams) fVar2).height;
                if (i19 == -2) {
                    i19 = measuredHeight;
                    i13 = i11;
                } else if (i19 == -1) {
                    i19 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i18, i17), View.MeasureSpec.makeMeasureSpec(i19, i13));
                if (z12) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z11) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i12++;
        }
        this.f29649r = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f29650s = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f29651t = true;
        G();
        this.f29651t = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((fVar = (f) childAt2.getLayoutParams()) == null || !fVar.f29667a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * fVar.f29669c), 1073741824), this.f29650s);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int direction, Rect previouslyFocusedRect) {
        int i11;
        int i12;
        int i13;
        e u11;
        int childCount = getChildCount();
        if ((direction & 2) != 0) {
            i12 = childCount;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (u11 = u(childAt)) != null && u11.f29663b == this.f29629f && childAt.requestFocus(direction, previouslyFocusedRect)) {
                return true;
            }
            i11 += i13;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(savedState.getSuperState());
        PagerAdapter pagerAdapter = this.f29628e;
        if (pagerAdapter != null) {
            pagerAdapter.restoreState(savedState.f29659b, savedState.f29660c);
            N(savedState.f29658a, false, true);
        } else {
            this.f29632g = savedState.f29658a;
            this.f29633h = savedState.f29659b;
            this.f29635i = savedState.f29660c;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f29658a = this.f29629f;
        PagerAdapter pagerAdapter = this.f29628e;
        if (pagerAdapter != null) {
            savedState.f29659b = pagerAdapter.saveState();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        super.onSizeChanged(w11, h11, oldw, oldh);
        if (w11 != oldw) {
            int i11 = this.f29641l;
            I(w11, oldw, i11, i11);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent ev2) {
        boolean onRelease;
        boolean onRelease2;
        if (this.N) {
            return true;
        }
        boolean z11 = false;
        if (ev2.getAction() == 0 && ev2.getEdgeFlags() != 0) {
            return false;
        }
        PagerAdapter pagerAdapter = this.f29628e;
        if (pagerAdapter == null || pagerAdapter.getCount() == 0) {
            return false;
        }
        if (this.I == null) {
            this.I = VelocityTracker.obtain();
        }
        this.I.addMovement(ev2);
        int action = ev2.getAction() & 255;
        if (action == 0) {
            this.f29637j.abortAnimation();
            this.f29653v = false;
            G();
            float x11 = ev2.getX();
            this.F = x11;
            this.D = x11;
            float y11 = ev2.getY();
            this.G = y11;
            this.E = y11;
            this.H = MotionEventCompat.getPointerId(ev2, 0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.f29655x) {
                    int findPointerIndex = MotionEventCompat.findPointerIndex(ev2, this.H);
                    float x12 = MotionEventCompat.getX(ev2, findPointerIndex);
                    float abs = Math.abs(x12 - this.D);
                    float y12 = MotionEventCompat.getY(ev2, findPointerIndex);
                    float abs2 = Math.abs(y12 - this.E);
                    if (abs > this.C && abs > abs2) {
                        this.f29655x = true;
                        K(true);
                        float f11 = this.F;
                        this.D = x12 - f11 > 0.0f ? f11 + this.C : f11 - this.C;
                        this.E = y12;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
                if (this.f29655x) {
                    z11 = F(MotionEventCompat.getX(ev2, MotionEventCompat.findPointerIndex(ev2, this.H)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = MotionEventCompat.getActionIndex(ev2);
                    this.D = MotionEventCompat.getX(ev2, actionIndex);
                    this.H = MotionEventCompat.getPointerId(ev2, actionIndex);
                } else if (action == 6) {
                    B(ev2);
                    this.D = MotionEventCompat.getX(ev2, MotionEventCompat.findPointerIndex(ev2, this.H));
                }
            } else if (this.f29655x) {
                L(this.f29629f, true, false, 0, false);
                this.H = -1;
                o();
                onRelease = this.P.onRelease();
                onRelease2 = this.Q.onRelease();
                z11 = onRelease | onRelease2;
            }
        } else if (this.f29655x) {
            VelocityTracker velocityTracker = this.I;
            velocityTracker.computeCurrentVelocity(1000, this.K);
            int xVelocity = (int) VelocityTrackerCompat.getXVelocity(velocityTracker, this.H);
            this.f29653v = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            e v11 = v();
            O(l(v11.f29663b, ((scrollX / clientWidth) - v11.f29666e) / v11.f29665d, xVelocity, (int) (MotionEventCompat.getX(ev2, MotionEventCompat.findPointerIndex(ev2, this.H)) - this.F)), true, true, xVelocity);
            this.H = -1;
            o();
            onRelease = this.P.onRelease();
            onRelease2 = this.Q.onRelease();
            z11 = onRelease | onRelease2;
        }
        if (z11) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
        return true;
    }

    public void p() {
        if (!this.N) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        VelocityTracker velocityTracker = this.I;
        velocityTracker.computeCurrentVelocity(1000, this.K);
        int xVelocity = (int) VelocityTrackerCompat.getXVelocity(velocityTracker, this.H);
        this.f29653v = true;
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        e v11 = v();
        O(l(v11.f29663b, ((scrollX / clientWidth) - v11.f29666e) / v11.f29665d, xVelocity, (int) (this.D - this.F)), true, true, xVelocity);
        o();
        this.N = false;
    }

    public boolean q(KeyEvent event) {
        if (event.getAction() != 0) {
            return false;
        }
        int keyCode = event.getKeyCode();
        if (keyCode == 21) {
            return f(17);
        }
        if (keyCode == 22) {
            return f(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (event.hasNoModifiers()) {
            return f(2);
        }
        if (event.hasModifiers(1)) {
            return f(1);
        }
        return false;
    }

    public void r(float xOffset) {
        if (!this.N) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        this.D += xOffset;
        float scrollX = getScrollX() - xOffset;
        float clientWidth = getClientWidth();
        float f11 = this.f29647p * clientWidth;
        float f12 = this.f29648q * clientWidth;
        e eVar = this.f29625b.get(0);
        e eVar2 = this.f29625b.get(r4.size() - 1);
        if (eVar.f29663b != 0) {
            f11 = eVar.f29666e * clientWidth;
        }
        if (eVar2.f29663b != this.f29628e.getCount() - 1) {
            f12 = eVar2.f29666e * clientWidth;
        }
        if (scrollX < f11) {
            scrollX = f11;
        } else if (scrollX > f12) {
            scrollX = f12;
        }
        int i11 = (int) scrollX;
        this.D += scrollX - i11;
        scrollTo(i11, getScrollY());
        E(i11);
        MotionEvent obtain = MotionEvent.obtain(this.O, SystemClock.uptimeMillis(), 2, this.D, 0.0f, 0);
        this.I.addMovement(obtain);
        obtain.recycle();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f29651t) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final Rect s(Rect outRect, View child) {
        if (outRect == null) {
            outRect = new Rect();
        }
        if (child == null) {
            outRect.set(0, 0, 0, 0);
            return outRect;
        }
        outRect.left = child.getLeft();
        outRect.right = child.getRight();
        outRect.top = child.getTop();
        outRect.bottom = child.getBottom();
        ViewParent parent = child.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            outRect.left += viewGroup.getLeft();
            outRect.right += viewGroup.getRight();
            outRect.top += viewGroup.getTop();
            outRect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return outRect;
    }

    public void setAdapter(PagerAdapter adapter) {
        PagerAdapter pagerAdapter = this.f29628e;
        if (pagerAdapter != null) {
            pagerAdapter.unregisterDataSetObserver(this.f29639k);
            this.f29628e.startUpdate((ViewGroup) this);
            for (int i11 = 0; i11 < this.f29625b.size(); i11++) {
                e eVar = this.f29625b.get(i11);
                this.f29628e.destroyItem((ViewGroup) this, eVar.f29663b, eVar.f29662a);
            }
            this.f29628e.finishUpdate((ViewGroup) this);
            this.f29625b.clear();
            J();
            this.f29629f = 0;
            scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter2 = this.f29628e;
        this.f29628e = adapter;
        this.f29624a = 0;
        if (adapter != null) {
            a aVar = null;
            if (this.f29639k == null) {
                this.f29639k = new k(this, aVar);
            }
            this.f29628e.registerDataSetObserver(this.f29639k);
            this.f29653v = false;
            boolean z11 = this.R;
            this.R = true;
            this.f29624a = this.f29628e.getCount();
            if (this.f29632g >= 0) {
                this.f29628e.restoreState(this.f29633h, this.f29635i);
                N(this.f29632g, false, true);
                this.f29632g = -1;
                this.f29633h = null;
                this.f29635i = null;
            } else if (z11) {
                requestLayout();
            } else {
                G();
            }
        }
        h hVar = this.f29630f0;
        if (hVar == null || pagerAdapter2 == adapter) {
            return;
        }
        hVar.a(pagerAdapter2, adapter);
    }

    public void setAutoScrollDuration(int duration) {
        this.f29644m1 = duration;
    }

    public void setChildrenDrawingOrderEnabledCompat(boolean enable) {
        if (this.f29634h1 == null) {
            try {
                this.f29634h1 = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e11) {
                Log.e("ViewPager", "Can't find setChildrenDrawingOrderEnabled", e11);
            }
        }
        try {
            this.f29634h1.invoke(this, Boolean.valueOf(enable));
        } catch (Exception e12) {
            Log.e("ViewPager", "Error changing children drawing order", e12);
        }
    }

    public void setCurrentItem(int item) {
        this.f29653v = false;
        N(item, !this.R, false);
    }

    public void setOffscreenPageLimit(int limit) {
        if (limit < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + limit + " too small; defaulting to 1");
            limit = 1;
        }
        if (limit != this.f29654w) {
            this.f29654w = limit;
            G();
        }
    }

    public void setOnAdapterChangeListener(h listener) {
        this.f29630f0 = listener;
    }

    public void setOnPageChangeListener(i listener) {
        this.V = listener;
    }

    public void setPageMargin(int marginPixels) {
        int i11 = this.f29641l;
        this.f29641l = marginPixels;
        int width = getWidth();
        I(width, width, marginPixels, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable d11) {
        this.f29643m = d11;
        if (d11 != null) {
            refreshDrawableState();
        }
        setWillNotDraw(d11 == null);
        invalidate();
    }

    public e t(View child) {
        while (true) {
            Object parent = child.getParent();
            if (parent == this) {
                return u(child);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            child = (View) parent;
        }
    }

    public e u(View child) {
        for (int i11 = 0; i11 < this.f29625b.size(); i11++) {
            e eVar = this.f29625b.get(i11);
            if (this.f29628e.isViewFromObject(child, eVar.f29662a)) {
                return eVar;
            }
        }
        return null;
    }

    public final e v() {
        int i11;
        int clientWidth = getClientWidth();
        float f11 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f12 = clientWidth > 0 ? this.f29641l / clientWidth : 0.0f;
        int i12 = 0;
        boolean z11 = true;
        e eVar = null;
        int i13 = -1;
        float f13 = 0.0f;
        while (i12 < this.f29625b.size()) {
            e eVar2 = this.f29625b.get(i12);
            if (!z11 && eVar2.f29663b != (i11 = i13 + 1)) {
                eVar2 = this.f29626c;
                eVar2.f29666e = f11 + f13 + f12;
                eVar2.f29663b = i11;
                eVar2.f29665d = this.f29628e.getPageWidth(i11);
                i12--;
            }
            e eVar3 = eVar2;
            f11 = eVar3.f29666e;
            float f14 = eVar3.f29665d + f11 + f12;
            if (!z11 && scrollX < f11) {
                break;
            }
            if (scrollX < f14 || i12 == this.f29625b.size() - 1) {
                return eVar3;
            }
            int i14 = eVar3.f29663b;
            float f15 = eVar3.f29665d;
            i12++;
            i13 = i14;
            f13 = f15;
            eVar = eVar3;
            z11 = false;
        }
        return eVar;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable who) {
        return super.verifyDrawable(who) || who == this.f29643m;
    }

    public e w(int position) {
        for (int i11 = 0; i11 < this.f29625b.size(); i11++) {
            e eVar = this.f29625b.get(i11);
            if (eVar.f29663b == position) {
                return eVar;
            }
        }
        return null;
    }

    public void x() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f29637j = new Scroller(context, f29621x1);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f11 = context.getResources().getDisplayMetrics().density;
        this.C = ViewConfigurationCompat.getScaledPagingTouchSlop(viewConfiguration);
        this.J = (int) (400.0f * f11);
        this.K = viewConfiguration.getScaledMaximumFlingVelocity();
        this.P = new EdgeEffectCompat(context);
        this.Q = new EdgeEffectCompat(context);
        this.L = (int) (25.0f * f11);
        this.M = (int) (2.0f * f11);
        this.A = (int) (f11 * 16.0f);
        ViewCompat.setAccessibilityDelegate(this, new g());
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
    }

    public boolean y() {
        return this.N;
    }

    public final boolean z(float x11, float dx2) {
        if (x11 >= this.B || dx2 <= 0.0f) {
            return x11 > ((float) (getWidth() - this.B)) && dx2 < 0.0f;
        }
        return true;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f extends ViewGroup.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public boolean f29667a;

        /* renamed from: b, reason: collision with root package name */
        public int f29668b;

        /* renamed from: c, reason: collision with root package name */
        public float f29669c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f29670d;

        /* renamed from: e, reason: collision with root package name */
        public int f29671e;

        /* renamed from: f, reason: collision with root package name */
        public int f29672f;

        public f() {
            super(-1, -1);
            this.f29669c = 0.0f;
        }

        public f(Context context, AttributeSet attrs) {
            super(context, attrs);
            this.f29669c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, FlowableViewPager.f29619v1);
            this.f29668b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new f(getContext(), attrs);
    }

    public void setPageMarginDrawable(@DrawableRes int resId) {
        setPageMarginDrawable(getContext().getResources().getDrawable(resId));
    }

    public FlowableViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f29625b = new ArrayList<>();
        this.f29626c = new e();
        this.f29627d = new Rect();
        this.f29632g = -1;
        this.f29633h = null;
        this.f29635i = null;
        this.f29647p = -3.4028235E38f;
        this.f29648q = Float.MAX_VALUE;
        this.f29654w = 1;
        this.H = -1;
        this.R = true;
        this.S = false;
        this.f29640k1 = new c();
        this.f29642l1 = 0;
        this.f29644m1 = 600;
        x();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class l implements i {
        @Override // com.flowviewpagerindicator.FlowableViewPager.i
        public void onPageScrollStateChanged(int state) {
        }

        @Override // com.flowviewpagerindicator.FlowableViewPager.i
        public void onPageSelected(int position) {
        }

        @Override // com.flowviewpagerindicator.FlowableViewPager.i
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }
    }
}
