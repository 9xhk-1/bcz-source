package com.baicizhan.client.business.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Matrix;
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
import android.view.accessibility.AccessibilityRecord;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import androidx.core.os.ParcelableCompat;
import androidx.core.os.ParcelableCompatCreatorCallbacks;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.VelocityTrackerCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.EdgeEffectCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class DirectionalViewPager extends ViewGroup {
    public static final int B1 = -1;
    public static final int C1 = 2;
    public static final int D1 = 0;
    public static final int E1 = 1;
    public static final int F1 = 2;
    public static final int H1 = 0;
    public static final int I1 = 1;
    public static final int J1 = 2;

    /* renamed from: o1, reason: collision with root package name */
    public static final int f17010o1 = 0;

    /* renamed from: p1, reason: collision with root package name */
    public static final int f17011p1 = 1;

    /* renamed from: q1, reason: collision with root package name */
    public static final String f17012q1 = "ViewPager";

    /* renamed from: r1, reason: collision with root package name */
    public static final boolean f17013r1 = false;

    /* renamed from: s1, reason: collision with root package name */
    public static final boolean f17014s1 = false;

    /* renamed from: t1, reason: collision with root package name */
    public static final int f17015t1 = 1;

    /* renamed from: u1, reason: collision with root package name */
    public static final int f17016u1 = 600;

    /* renamed from: v1, reason: collision with root package name */
    public static final int f17017v1 = 25;

    /* renamed from: w1, reason: collision with root package name */
    public static final int f17018w1 = 16;

    /* renamed from: x1, reason: collision with root package name */
    public static final int f17019x1 = 400;
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public int E;
    public float F;
    public float G;
    public float H;
    public float I;
    public int J;
    public VelocityTracker K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public long Q;
    public EdgeEffectCompat R;
    public EdgeEffectCompat S;
    public Matrix T;
    public boolean U;
    public boolean V;
    public int W;

    /* renamed from: a, reason: collision with root package name */
    public int f17022a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<e> f17023b;

    /* renamed from: c, reason: collision with root package name */
    public final e f17024c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f17025d;

    /* renamed from: e, reason: collision with root package name */
    public int f17026e;

    /* renamed from: f, reason: collision with root package name */
    public PagerAdapter f17027f;

    /* renamed from: f0, reason: collision with root package name */
    public i f17028f0;

    /* renamed from: f1, reason: collision with root package name */
    public i f17029f1;

    /* renamed from: g, reason: collision with root package name */
    public int f17030g;

    /* renamed from: h, reason: collision with root package name */
    public int f17031h;

    /* renamed from: h1, reason: collision with root package name */
    public h f17032h1;

    /* renamed from: i, reason: collision with root package name */
    public Parcelable f17033i;

    /* renamed from: i1, reason: collision with root package name */
    public j f17034i1;

    /* renamed from: j, reason: collision with root package name */
    public ClassLoader f17035j;

    /* renamed from: j1, reason: collision with root package name */
    public Method f17036j1;

    /* renamed from: k, reason: collision with root package name */
    public Scroller f17037k;

    /* renamed from: k1, reason: collision with root package name */
    public int f17038k1;

    /* renamed from: l, reason: collision with root package name */
    public k f17039l;

    /* renamed from: l1, reason: collision with root package name */
    public ArrayList<View> f17040l1;

    /* renamed from: m, reason: collision with root package name */
    public int f17041m;

    /* renamed from: m1, reason: collision with root package name */
    public final Runnable f17042m1;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f17043n;

    /* renamed from: n1, reason: collision with root package name */
    public int f17044n1;

    /* renamed from: o, reason: collision with root package name */
    public int f17045o;

    /* renamed from: p, reason: collision with root package name */
    public int f17046p;

    /* renamed from: q, reason: collision with root package name */
    public int f17047q;

    /* renamed from: r, reason: collision with root package name */
    public int f17048r;

    /* renamed from: s, reason: collision with root package name */
    public float f17049s;

    /* renamed from: t, reason: collision with root package name */
    public float f17050t;

    /* renamed from: u, reason: collision with root package name */
    public int f17051u;

    /* renamed from: v, reason: collision with root package name */
    public int f17052v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f17053w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f17054x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f17055y;

    /* renamed from: z, reason: collision with root package name */
    public int f17056z;

    /* renamed from: y1, reason: collision with root package name */
    public static final int[] f17020y1 = {R.attr.layout_gravity};

    /* renamed from: z1, reason: collision with root package name */
    public static final Comparator<e> f17021z1 = new a();
    public static final Interpolator A1 = new b();
    public static final m G1 = new m();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = ParcelableCompat.newCreator(new a());

        /* renamed from: a, reason: collision with root package name */
        public int f17057a;

        /* renamed from: b, reason: collision with root package name */
        public Parcelable f17058b;

        /* renamed from: c, reason: collision with root package name */
        public ClassLoader f17059c;

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
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f17057a + com.alipay.sdk.m.u.i.f11099d;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeInt(this.f17057a);
            out.writeParcelable(this.f17058b, flags);
        }

        public SavedState(Parcel in2, ClassLoader loader) {
            super(in2);
            loader = loader == null ? getClass().getClassLoader() : loader;
            this.f17057a = in2.readInt();
            this.f17058b = in2.readParcelable(loader);
            this.f17059c = loader;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Comparator<e> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(e lhs, e rhs) {
            return lhs.f17062b - rhs.f17062b;
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
            DirectionalViewPager.this.setScrollState(0);
            DirectionalViewPager.this.G();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public Object f17061a;

        /* renamed from: b, reason: collision with root package name */
        public int f17062b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f17063c;

        /* renamed from: d, reason: collision with root package name */
        public float f17064d;

        /* renamed from: e, reason: collision with root package name */
        public float f17065e;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g extends AccessibilityDelegateCompat {
        public g() {
        }

        public final boolean canScroll() {
            return DirectionalViewPager.this.f17027f != null && DirectionalViewPager.this.f17027f.getCount() > 1;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View host, AccessibilityEvent event) {
            super.onInitializeAccessibilityEvent(host, event);
            event.setClassName(ViewPager.class.getName());
            AccessibilityRecord obtain = AccessibilityRecord.obtain();
            obtain.setScrollable(canScroll());
            if (event.getEventType() != 4096 || DirectionalViewPager.this.f17027f == null) {
                return;
            }
            obtain.setItemCount(DirectionalViewPager.this.f17027f.getCount());
            obtain.setFromIndex(DirectionalViewPager.this.f17030g);
            obtain.setToIndex(DirectionalViewPager.this.f17030g);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
            super.onInitializeAccessibilityNodeInfo(host, info);
            info.setClassName(ViewPager.class.getName());
            info.setScrollable(canScroll());
            if (DirectionalViewPager.this.canScrollHorizontally(1)) {
                info.addAction(4096);
            }
            if (DirectionalViewPager.this.canScrollHorizontally(-1)) {
                info.addAction(8192);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View host, int action, Bundle args) {
            if (super.performAccessibilityAction(host, action, args)) {
                return true;
            }
            if (action == 4096) {
                if (!DirectionalViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                DirectionalViewPager directionalViewPager = DirectionalViewPager.this;
                directionalViewPager.setCurrentItem(directionalViewPager.f17030g + 1);
                return true;
            }
            if (action != 8192 || !DirectionalViewPager.this.canScrollHorizontally(-1)) {
                return false;
            }
            DirectionalViewPager directionalViewPager2 = DirectionalViewPager.this;
            directionalViewPager2.setCurrentItem(directionalViewPager2.f17030g - 1);
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
        @Override // android.database.DataSetObserver
        public void onChanged() {
            DirectionalViewPager.this.k();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            DirectionalViewPager.this.k();
        }

        public k() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class m implements Comparator<View> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View lhs, View rhs) {
            f fVar = (f) lhs.getLayoutParams();
            f fVar2 = (f) rhs.getLayoutParams();
            boolean z11 = fVar.f17066a;
            return z11 != fVar2.f17066a ? z11 ? 1 : -1 : fVar.f17070e - fVar2.f17070e;
        }
    }

    public DirectionalViewPager(Context context) {
        super(context);
        this.f17023b = new ArrayList<>();
        this.f17024c = new e();
        this.f17025d = new Rect();
        this.f17026e = 0;
        this.f17031h = -1;
        this.f17033i = null;
        this.f17035j = null;
        this.f17049s = -3.4028235E38f;
        this.f17050t = Float.MAX_VALUE;
        this.f17056z = 1;
        this.J = -1;
        this.U = true;
        this.f17042m1 = new c();
        this.f17044n1 = 0;
        x();
    }

    private int getClientDimension() {
        return this.f17026e == 0 ? getClientWidth() : getClientHeight();
    }

    private int getClientHeight() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setLastOffset(float lastOffset) {
        if (lastOffset != this.f17050t) {
            this.T = null;
            this.f17050t = lastOffset;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScrollState(int newState) {
        if (this.f17044n1 == newState) {
            return;
        }
        this.f17044n1 = newState;
        if (this.f17034i1 != null) {
            n(newState != 0);
        }
        i iVar = this.f17028f0;
        if (iVar != null) {
            iVar.onPageScrollStateChanged(newState);
        }
    }

    private void setScrollingCacheEnabled(boolean enabled) {
        if (this.f17054x != enabled) {
            this.f17054x = enabled;
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
            int r0 = r12.W
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
            com.baicizhan.client.business.widget.DirectionalViewPager$f r9 = (com.baicizhan.client.business.widget.DirectionalViewPager.f) r9
            boolean r10 = r9.f17066a
            if (r10 != 0) goto L2c
            goto L69
        L2c:
            int r9 = r9.f17067b
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
            com.baicizhan.client.business.widget.DirectionalViewPager$i r0 = r12.f17028f0
            if (r0 == 0) goto L73
            r0.onPageScrolled(r13, r14, r15)
        L73:
            com.baicizhan.client.business.widget.DirectionalViewPager$i r0 = r12.f17029f1
            if (r0 == 0) goto L7a
            r0.onPageScrolled(r13, r14, r15)
        L7a:
            com.baicizhan.client.business.widget.DirectionalViewPager$j r13 = r12.f17034i1
            if (r13 == 0) goto Lab
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L86:
            if (r1 >= r14) goto Lab
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            com.baicizhan.client.business.widget.DirectionalViewPager$f r0 = (com.baicizhan.client.business.widget.DirectionalViewPager.f) r0
            boolean r0 = r0.f17066a
            if (r0 == 0) goto L97
            goto La8
        L97:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            com.baicizhan.client.business.widget.DirectionalViewPager$j r3 = r12.f17034i1
            r3.transformPage(r15, r0)
        La8:
            int r1 = r1 + 1
            goto L86
        Lab:
            r12.V = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.client.business.widget.DirectionalViewPager.A(int, float, int):void");
    }

    public final void B(MotionEvent ev2) {
        int actionIndex = MotionEventCompat.getActionIndex(ev2);
        if (MotionEventCompat.getPointerId(ev2, actionIndex) == this.J) {
            int i11 = actionIndex == 0 ? 1 : 0;
            this.F = MotionEventCompat.getX(ev2, i11);
            this.J = MotionEventCompat.getPointerId(ev2, i11);
            VelocityTracker velocityTracker = this.K;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean C() {
        int i11 = this.f17030g;
        if (i11 <= 0) {
            return false;
        }
        L(i11 - 1, true);
        return true;
    }

    public boolean D() {
        PagerAdapter pagerAdapter = this.f17027f;
        if (pagerAdapter == null || this.f17030g >= pagerAdapter.getCount() - 1) {
            return false;
        }
        L(this.f17030g + 1, true);
        return true;
    }

    public final boolean E(int coord) {
        if (this.f17023b.size() == 0) {
            this.V = false;
            A(0, 0.0f, 0);
            if (this.V) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        e v11 = v();
        int clientDimension = getClientDimension();
        int i11 = this.f17041m;
        int i12 = clientDimension + i11;
        float f11 = clientDimension;
        int i13 = v11.f17062b;
        float f12 = ((coord / f11) - v11.f17065e) / (v11.f17064d + (i11 / f11));
        this.V = false;
        A(i13, f12, (int) (i12 * f12));
        if (this.V) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean F(float coord) {
        float f11;
        boolean z11;
        if (this.f17023b.size() == 0) {
            return false;
        }
        if (this.f17026e == 0) {
            f11 = this.F - coord;
            this.F = coord;
        } else {
            f11 = this.G - coord;
            this.G = coord;
        }
        float scrollCoord = getScrollCoord() + f11;
        float clientDimension = getClientDimension();
        float f12 = this.f17049s * clientDimension;
        float f13 = this.f17050t * clientDimension;
        e eVar = this.f17023b.get(0);
        ArrayList<e> arrayList = this.f17023b;
        boolean z12 = true;
        e eVar2 = arrayList.get(arrayList.size() - 1);
        if (eVar.f17062b != 0) {
            f12 = eVar.f17065e * clientDimension;
            z11 = false;
        } else {
            z11 = true;
        }
        if (eVar2.f17062b != this.f17027f.getCount() - 1) {
            f13 = eVar2.f17065e * clientDimension;
            z12 = false;
        }
        if (scrollCoord < f12) {
            r1 = z11 ? this.R.onPull(Math.abs(f12 - scrollCoord) / clientDimension) : false;
            scrollCoord = f12;
        } else if (scrollCoord > f13) {
            r1 = z12 ? this.S.onPull(Math.abs(scrollCoord - f13) / clientDimension) : false;
            scrollCoord = f13;
        }
        if (this.f17026e == 0) {
            int i11 = (int) scrollCoord;
            this.F += scrollCoord - i11;
            scrollTo(i11, getScrollY());
        } else {
            int i12 = (int) scrollCoord;
            this.G += scrollCoord - i12;
            scrollTo(getScrollX(), i12);
        }
        E((int) scrollCoord);
        return r1;
    }

    public void G() {
        H(this.f17030g);
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
            Method dump skipped, instructions count: 645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.client.business.widget.DirectionalViewPager.H(int):void");
    }

    public final void I(int width, int oldWidth, int margin, int oldMargin) {
        if (oldWidth <= 0 || this.f17023b.isEmpty()) {
            e w11 = w(this.f17030g);
            int min = (int) ((w11 != null ? Math.min(w11.f17065e, this.f17050t) : 0.0f) * ((width - getPaddingLeft()) - getPaddingRight()));
            if (min != getScrollX()) {
                j(false);
                scrollTo(min, getScrollY());
                return;
            }
            return;
        }
        int scrollX = (int) ((getScrollX() / (((oldWidth - getPaddingLeft()) - getPaddingRight()) + oldMargin)) * (((width - getPaddingLeft()) - getPaddingRight()) + margin));
        scrollTo(scrollX, getScrollY());
        if (this.f17037k.isFinished()) {
            return;
        }
        this.f17037k.startScroll(scrollX, 0, (int) (w(this.f17030g).f17065e * width), 0, this.f17037k.getDuration() - this.f17037k.timePassed());
    }

    public final void J() {
        int i11 = 0;
        while (i11 < getChildCount()) {
            if (!((f) getChildAt(i11).getLayoutParams()).f17066a) {
                removeViewAt(i11);
                i11--;
            }
            i11++;
        }
    }

    public final void K(int item, boolean smoothScroll, int velocity, boolean dispatchSelected) {
        i iVar;
        i iVar2;
        i iVar3;
        i iVar4;
        e w11 = w(item);
        int clientDimension = w11 != null ? (int) (getClientDimension() * Math.max(this.f17049s, Math.min(w11.f17065e, this.f17050t))) : 0;
        if (smoothScroll) {
            if (this.f17026e == 0) {
                R(clientDimension, 0, velocity);
            } else {
                R(0, clientDimension, velocity);
            }
            if (dispatchSelected && (iVar4 = this.f17028f0) != null) {
                iVar4.onPageSelected(item);
            }
            if (!dispatchSelected || (iVar3 = this.f17029f1) == null) {
                return;
            }
            iVar3.onPageSelected(item);
            return;
        }
        if (dispatchSelected && (iVar2 = this.f17028f0) != null) {
            iVar2.onPageSelected(item);
        }
        if (dispatchSelected && (iVar = this.f17029f1) != null) {
            iVar.onPageSelected(item);
        }
        j(false);
        if (this.f17026e == 0) {
            scrollTo(clientDimension, 0);
        } else {
            scrollTo(0, clientDimension);
        }
        E(clientDimension);
    }

    public void L(int item, boolean smoothScroll) {
        this.f17055y = false;
        M(item, smoothScroll, false);
    }

    public void M(int item, boolean smoothScroll, boolean always) {
        N(item, smoothScroll, always, 0);
    }

    public void N(int item, boolean smoothScroll, boolean always, int velocity) {
        i iVar;
        i iVar2;
        PagerAdapter pagerAdapter = this.f17027f;
        if (pagerAdapter == null || pagerAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!always && this.f17030g == item && this.f17023b.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (item < 0) {
            item = 0;
        } else if (item >= this.f17027f.getCount()) {
            item = this.f17027f.getCount() - 1;
        }
        int i11 = this.f17056z;
        int i12 = this.f17030g;
        if (item > i12 + i11 || item < i12 - i11) {
            for (int i13 = 0; i13 < this.f17023b.size(); i13++) {
                this.f17023b.get(i13).f17063c = true;
            }
        }
        boolean z11 = this.f17030g != item;
        if (!this.U) {
            H(item);
            K(item, smoothScroll, velocity, z11);
            return;
        }
        this.f17030g = item;
        if (z11 && (iVar2 = this.f17028f0) != null) {
            iVar2.onPageSelected(item);
        }
        if (z11 && (iVar = this.f17029f1) != null) {
            iVar.onPageSelected(item);
        }
        requestLayout();
    }

    public i O(i listener) {
        i iVar = this.f17029f1;
        this.f17029f1 = listener;
        return iVar;
    }

    public void P(boolean reverseDrawingOrder, j transformer) {
        boolean z11 = transformer != null;
        boolean z12 = z11 != (this.f17034i1 != null);
        this.f17034i1 = transformer;
        setChildrenDrawingOrderEnabledCompat(z11);
        if (z11) {
            this.f17038k1 = reverseDrawingOrder ? 2 : 1;
        } else {
            this.f17038k1 = 0;
        }
        if (z12) {
            G();
        }
    }

    public void Q(int x11, int y11) {
        R(x11, y11, 0);
    }

    public void R(int x11, int y11, int velocity) {
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
        } else {
            setScrollingCacheEnabled(true);
            setScrollState(2);
            m(Math.min(1.0f, (Math.abs(i11) * 1.0f) / getClientWidth()));
            this.f17037k.startScroll(scrollX, scrollY, i11, i12, 600);
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public final void S() {
        if (this.f17038k1 != 0) {
            ArrayList<View> arrayList = this.f17040l1;
            if (arrayList == null) {
                this.f17040l1 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                this.f17040l1.add(getChildAt(i11));
            }
            Collections.sort(this.f17040l1, G1);
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
                if (childAt.getVisibility() == 0 && (u11 = u(childAt)) != null && u11.f17062b == this.f17030g) {
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
            if (childAt.getVisibility() == 0 && (u11 = u(childAt)) != null && u11.f17062b == this.f17030g) {
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
        boolean z11 = fVar.f17066a | (child instanceof d);
        fVar.f17066a = z11;
        if (!this.f17053w) {
            super.addView(child, index, params);
        } else {
            if (z11) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            fVar.f17069d = true;
            addViewInLayout(child, index, params);
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int direction) {
        if (this.f17027f == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return direction < 0 ? scrollX > ((int) (((float) clientWidth) * this.f17049s)) : direction > 0 && scrollX < ((int) (((float) clientWidth) * this.f17050t));
    }

    @Override // android.view.View
    public boolean canScrollVertically(int direction) {
        if (this.f17027f == null) {
            return false;
        }
        int clientHeight = getClientHeight();
        int scrollY = getScrollY();
        return direction < 0 ? scrollY > ((int) (((float) clientHeight) * this.f17049s)) : direction > 0 && scrollY < ((int) (((float) clientHeight) * this.f17050t));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams p11) {
        return (p11 instanceof f) && super.checkLayoutParams(p11);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f17037k.isFinished() || !this.f17037k.computeScrollOffset()) {
            j(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f17037k.getCurrX();
        int currY = this.f17037k.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (this.f17026e == 0) {
                if (!E(currX)) {
                    this.f17037k.abortAnimation();
                    scrollTo(0, currY);
                }
            } else if (!E(currY)) {
                this.f17037k.abortAnimation();
                scrollTo(currX, 0);
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
            if (childAt.getVisibility() == 0 && (u11 = u(childAt)) != null && u11.f17062b == this.f17030g && childAt.dispatchPopulateAccessibilityEvent(event)) {
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
        if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.f17027f) != null && pagerAdapter.getCount() > 1)) {
            if (!this.R.isFinished()) {
                int save = canvas.save();
                if (this.f17026e == 0) {
                    int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                    int width = getWidth();
                    canvas.rotate(270.0f);
                    canvas.translate((-height) + getPaddingTop(), this.f17049s * width);
                    this.R.setSize(height, width);
                } else {
                    int height2 = getHeight();
                    int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                    canvas.translate(getPaddingLeft(), this.f17049s * height2);
                    this.R.setSize(width2, height2);
                }
                z11 = this.R.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.S.isFinished()) {
                int save2 = canvas.save();
                if (this.f17026e == 0) {
                    int width3 = getWidth();
                    int height3 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                    canvas.rotate(90.0f);
                    canvas.translate(-getPaddingTop(), (-(this.f17050t + 1.0f)) * width3);
                    this.S.setSize(height3, width3);
                } else {
                    int width4 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                    int height4 = getHeight();
                    if (this.T == null) {
                        Matrix matrix = new Matrix();
                        this.T = matrix;
                        matrix.setScale(1.0f, -1.0f);
                        this.T.postTranslate(0.0f, (this.f17050t + 1.0f) * height4);
                    }
                    canvas.concat(this.T);
                    this.S.setSize(width4, height4);
                }
                z11 |= this.S.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.R.finish();
            this.S.finish();
        }
        if (z11) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f17043n;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public e e(int position, int index) {
        e eVar = new e();
        eVar.f17062b = position;
        eVar.f17061a = this.f17027f.instantiateItem((ViewGroup) this, position);
        eVar.f17064d = this.f17027f.getPageWidth(position);
        if (index < 0 || index >= this.f17023b.size()) {
            this.f17023b.add(eVar);
            return eVar;
        }
        this.f17023b.add(index, eVar);
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
            android.graphics.Rect r2 = r4.f17025d
            android.graphics.Rect r2 = r4.s(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.f17025d
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
            android.graphics.Rect r2 = r4.f17025d
            android.graphics.Rect r2 = r4.s(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.f17025d
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
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.client.business.widget.DirectionalViewPager.f(int):boolean");
    }

    public boolean g() {
        if (this.A) {
            return false;
        }
        this.P = true;
        setScrollState(1);
        this.F = 0.0f;
        this.H = 0.0f;
        this.G = 0.0f;
        this.I = 0.0f;
        VelocityTracker velocityTracker = this.K;
        if (velocityTracker == null) {
            this.K = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.K.addMovement(obtain);
        obtain.recycle();
        this.Q = uptimeMillis;
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
        return this.f17027f;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int childCount, int i11) {
        if (this.f17038k1 == 2) {
            i11 = (childCount - 1) - i11;
        }
        return ((f) this.f17040l1.get(i11).getLayoutParams()).f17071f;
    }

    public int getCurrentItem() {
        return this.f17030g;
    }

    public int getOffscreenPageLimit() {
        return this.f17056z;
    }

    public int getPageMargin() {
        return this.f17041m;
    }

    public int getScrollCoord() {
        return this.f17026e == 0 ? getScrollX() : getScrollY();
    }

    public final void h(e curItem, int curIndex, e oldCurInfo) {
        int i11;
        int i12;
        e eVar;
        e eVar2;
        int count = this.f17027f.getCount();
        int clientDimension = getClientDimension();
        float f11 = clientDimension > 0 ? this.f17041m / clientDimension : 0.0f;
        if (oldCurInfo != null) {
            int i13 = oldCurInfo.f17062b;
            int i14 = curItem.f17062b;
            if (i13 < i14) {
                float f12 = oldCurInfo.f17065e + oldCurInfo.f17064d + f11;
                int i15 = i13 + 1;
                int i16 = 0;
                while (i15 <= curItem.f17062b && i16 < this.f17023b.size()) {
                    e eVar3 = this.f17023b.get(i16);
                    while (true) {
                        eVar2 = eVar3;
                        if (i15 <= eVar2.f17062b || i16 >= this.f17023b.size() - 1) {
                            break;
                        }
                        i16++;
                        eVar3 = this.f17023b.get(i16);
                    }
                    while (i15 < eVar2.f17062b) {
                        f12 += this.f17027f.getPageWidth(i15) + f11;
                        i15++;
                    }
                    eVar2.f17065e = f12;
                    f12 += eVar2.f17064d + f11;
                    i15++;
                }
            } else if (i13 > i14) {
                int size = this.f17023b.size() - 1;
                float f13 = oldCurInfo.f17065e;
                while (true) {
                    i13--;
                    if (i13 < curItem.f17062b || size < 0) {
                        break;
                    }
                    e eVar4 = this.f17023b.get(size);
                    while (true) {
                        eVar = eVar4;
                        if (i13 >= eVar.f17062b || size <= 0) {
                            break;
                        }
                        size--;
                        eVar4 = this.f17023b.get(size);
                    }
                    while (i13 > eVar.f17062b) {
                        f13 -= this.f17027f.getPageWidth(i13) + f11;
                        i13--;
                    }
                    f13 -= eVar.f17064d + f11;
                    eVar.f17065e = f13;
                }
            }
        }
        int size2 = this.f17023b.size();
        float f14 = curItem.f17065e;
        int i17 = curItem.f17062b;
        int i18 = i17 - 1;
        this.f17049s = i17 == 0 ? f14 : -3.4028235E38f;
        int i19 = count - 1;
        setLastOffset(i17 == i19 ? (curItem.f17064d + f14) - 1.0f : Float.MAX_VALUE);
        int i21 = curIndex - 1;
        while (i21 >= 0) {
            e eVar5 = this.f17023b.get(i21);
            while (true) {
                i12 = eVar5.f17062b;
                if (i18 <= i12) {
                    break;
                }
                f14 -= this.f17027f.getPageWidth(i18) + f11;
                i18--;
            }
            f14 -= eVar5.f17064d + f11;
            eVar5.f17065e = f14;
            if (i12 == 0) {
                this.f17049s = f14;
            }
            i21--;
            i18--;
        }
        float f15 = curItem.f17065e + curItem.f17064d + f11;
        int i22 = curItem.f17062b + 1;
        int i23 = curIndex + 1;
        while (i23 < size2) {
            e eVar6 = this.f17023b.get(i23);
            while (true) {
                i11 = eVar6.f17062b;
                if (i22 >= i11) {
                    break;
                }
                f15 += this.f17027f.getPageWidth(i22) + f11;
                i22++;
            }
            if (i11 == i19) {
                setLastOffset((eVar6.f17064d + f15) - 1.0f);
            }
            eVar6.f17065e = f15;
            f15 += eVar6.f17064d + f11;
            i23++;
            i22++;
        }
    }

    public boolean i(View v11, boolean checkV, int dx2, int dy2, int x11, int y11) {
        int i11;
        if (v11 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v11;
            int scrollX = v11.getScrollX();
            int scrollY = v11.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i12 = x11 + scrollX;
                if (i12 >= childAt.getLeft() && i12 < childAt.getRight() && (i11 = y11 + scrollY) >= childAt.getTop() && i11 < childAt.getBottom() && i(childAt, true, dx2, dy2, i12 - childAt.getLeft(), i11 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return checkV && ViewCompat.canScrollHorizontally(v11, -dx2);
    }

    public final void j(boolean postEvents) {
        boolean z11 = this.f17044n1 == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            this.f17037k.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f17037k.getCurrX();
            int currY = this.f17037k.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
            }
        }
        this.f17055y = false;
        for (int i11 = 0; i11 < this.f17023b.size(); i11++) {
            e eVar = this.f17023b.get(i11);
            if (eVar.f17063c) {
                eVar.f17063c = false;
                z11 = true;
            }
        }
        if (z11) {
            if (postEvents) {
                ViewCompat.postOnAnimation(this, this.f17042m1);
            } else {
                this.f17042m1.run();
            }
        }
    }

    public void k() {
        int count = this.f17027f.getCount();
        this.f17022a = count;
        boolean z11 = this.f17023b.size() < (this.f17056z * 2) + 1 && this.f17023b.size() < count;
        int i11 = this.f17030g;
        int i12 = 0;
        boolean z12 = false;
        while (i12 < this.f17023b.size()) {
            e eVar = this.f17023b.get(i12);
            int itemPosition = this.f17027f.getItemPosition(eVar.f17061a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f17023b.remove(i12);
                    i12--;
                    if (!z12) {
                        this.f17027f.startUpdate((ViewGroup) this);
                        z12 = true;
                    }
                    this.f17027f.destroyItem((ViewGroup) this, eVar.f17062b, eVar.f17061a);
                    int i13 = this.f17030g;
                    if (i13 == eVar.f17062b) {
                        i11 = Math.max(0, Math.min(i13, count - 1));
                    }
                } else {
                    int i14 = eVar.f17062b;
                    if (i14 != itemPosition) {
                        if (i14 == this.f17030g) {
                            i11 = itemPosition;
                        }
                        eVar.f17062b = itemPosition;
                    }
                }
                z11 = true;
            }
            i12++;
        }
        if (z12) {
            this.f17027f.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f17023b, f17021z1);
        if (z11) {
            int childCount = getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                f fVar = (f) getChildAt(i15).getLayoutParams();
                if (!fVar.f17066a) {
                    fVar.f17068c = 0.0f;
                }
            }
            M(i11, false, true);
            requestLayout();
        }
    }

    public final int l(int currentPage, float pageOffset, int velocity, int deltaCoord) {
        if (Math.abs(deltaCoord) <= this.N || Math.abs(velocity) <= this.L) {
            currentPage = (int) (currentPage + pageOffset + (currentPage >= this.f17030g ? 0.4f : 0.6f));
        } else if (velocity <= 0) {
            currentPage++;
        }
        if (this.f17023b.size() <= 0) {
            return currentPage;
        }
        return Math.max(this.f17023b.get(0).f17062b, Math.min(currentPage, this.f17023b.get(r4.size() - 1).f17062b));
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
        this.A = false;
        this.B = false;
        VelocityTracker velocityTracker = this.K;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.K = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f17042m1);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i11;
        float f11;
        int i12;
        super.onDraw(canvas);
        if (this.f17041m <= 0 || this.f17043n == null || this.f17023b.size() <= 0 || this.f17027f == null) {
            return;
        }
        int scrollCoord = getScrollCoord();
        float width = this.f17026e == 0 ? getWidth() : getHeight();
        float f12 = this.f17041m / width;
        int i13 = 0;
        e eVar = this.f17023b.get(0);
        float f13 = eVar.f17065e;
        int size = this.f17023b.size();
        int i14 = eVar.f17062b;
        int i15 = this.f17023b.get(size - 1).f17062b;
        while (i14 < i15) {
            while (true) {
                i11 = eVar.f17062b;
                if (i14 <= i11 || i13 >= size) {
                    break;
                }
                i13++;
                eVar = this.f17023b.get(i13);
            }
            if (i14 == i11) {
                float f14 = eVar.f17065e;
                float f15 = eVar.f17064d;
                f11 = (f14 + f15) * width;
                f13 = f14 + f15 + f12;
            } else {
                float pageWidth = this.f17027f.getPageWidth(i14);
                f11 = (f13 + pageWidth) * width;
                f13 += pageWidth + f12;
            }
            int i16 = this.f17041m;
            if (i16 + f11 > scrollCoord) {
                if (this.f17026e == 0) {
                    i12 = scrollCoord;
                    this.f17043n.setBounds((int) f11, this.f17046p, (int) (i16 + f11 + 0.5f), this.f17048r);
                } else {
                    i12 = scrollCoord;
                    this.f17043n.setBounds(this.f17045o, (int) f11, this.f17047q, (int) (i16 + f11 + 0.5f));
                }
                this.f17043n.draw(canvas);
            } else {
                i12 = scrollCoord;
            }
            if (f11 > i12 + r2) {
                return;
            }
            i14++;
            scrollCoord = i12;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev2) {
        int finalY;
        int currY;
        int action = ev2.getAction() & 255;
        if (action == 3 || action == 1) {
            this.A = false;
            this.B = false;
            this.J = -1;
            VelocityTracker velocityTracker = this.K;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.K = null;
            }
            return false;
        }
        if (action != 0) {
            if (this.A) {
                return true;
            }
            if (this.B) {
                return false;
            }
        }
        if (action == 0) {
            float x11 = ev2.getX();
            this.H = x11;
            this.F = x11;
            float y11 = ev2.getY();
            this.I = y11;
            this.G = y11;
            this.J = MotionEventCompat.getPointerId(ev2, 0);
            this.B = false;
            this.f17037k.computeScrollOffset();
            if (this.f17026e == 0) {
                finalY = this.f17037k.getFinalX();
                currY = this.f17037k.getCurrX();
            } else {
                finalY = this.f17037k.getFinalY();
                currY = this.f17037k.getCurrY();
            }
            int i11 = finalY - currY;
            if (this.f17044n1 != 2 || Math.abs(i11) <= this.O) {
                j(false);
                this.A = false;
            } else {
                this.f17037k.abortAnimation();
                this.f17055y = false;
                G();
                this.A = true;
                setScrollState(1);
            }
        } else if (action == 2) {
            int i12 = this.J;
            if (i12 != -1) {
                int findPointerIndex = MotionEventCompat.findPointerIndex(ev2, i12);
                float x12 = MotionEventCompat.getX(ev2, findPointerIndex);
                float y12 = MotionEventCompat.getY(ev2, findPointerIndex);
                if (this.f17026e == 0) {
                    float f11 = x12 - this.F;
                    float abs = Math.abs(f11);
                    float abs2 = Math.abs(y12 - this.I);
                    if (f11 != 0.0f && !z(this.F, f11) && i(this, false, (int) f11, 0, (int) x12, (int) y12)) {
                        this.F = x12;
                        this.G = y12;
                        this.B = true;
                        return false;
                    }
                    int i13 = this.E;
                    if (abs > i13 && abs * 0.5f > abs2) {
                        this.A = true;
                        setScrollState(1);
                        this.F = f11 > 0.0f ? this.H + this.E : this.H - this.E;
                        this.G = y12;
                        setScrollingCacheEnabled(true);
                    } else if (abs2 > i13) {
                        this.B = true;
                    }
                    if (this.A && F(x12)) {
                        ViewCompat.postInvalidateOnAnimation(this);
                    }
                } else {
                    float f12 = y12 - this.G;
                    float abs3 = Math.abs(f12);
                    float abs4 = Math.abs(x12 - this.H);
                    if (f12 != 0.0f && !z(this.G, f12) && i(this, false, 0, (int) f12, (int) x12, (int) y12)) {
                        this.F = x12;
                        this.G = y12;
                        this.B = true;
                        return false;
                    }
                    int i14 = this.E;
                    if (abs3 > i14 && abs3 * 0.5f > abs4) {
                        this.A = true;
                        setScrollState(1);
                        this.F = x12;
                        this.G = f12 > 0.0f ? this.I + this.E : this.I - this.E;
                        setScrollingCacheEnabled(true);
                    } else if (abs4 > i14) {
                        this.B = true;
                    }
                    if (this.A && F(y12)) {
                        ViewCompat.postInvalidateOnAnimation(this);
                    }
                }
            }
        } else if (action == 6) {
            B(ev2);
        }
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
        this.K.addMovement(ev2);
        return this.A;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.client.business.widget.DirectionalViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        f fVar;
        int makeMeasureSpec;
        int i11;
        f fVar2;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, widthMeasureSpec), View.getDefaultSize(0, heightMeasureSpec));
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.D = Math.min(this.f17026e == 0 ? measuredWidth / 10 : measuredHeight / 10, this.C);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (measuredHeight - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z11 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (fVar2 = (f) childAt.getLayoutParams()) != null && fVar2.f17066a) {
                int i15 = fVar2.f17067b;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                boolean z12 = i17 == 48 || i17 == 80;
                if (i16 != 3 && i16 != 5) {
                    z11 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z12) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else {
                    i12 = z11 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i19 = ((ViewGroup.LayoutParams) fVar2).width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i21 = ((ViewGroup.LayoutParams) fVar2).height;
                if (i21 == -2) {
                    i21 = paddingTop;
                    i14 = i12;
                } else if (i21 == -1) {
                    i21 = paddingTop;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i21, i14));
                if (z12) {
                    paddingTop -= childAt.getMeasuredHeight();
                } else if (z11) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        this.f17051u = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f17052v = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
        this.f17053w = true;
        G();
        this.f17053w = false;
        int childCount2 = getChildCount();
        for (int i22 = 0; i22 < childCount2; i22++) {
            View childAt2 = getChildAt(i22);
            if (childAt2.getVisibility() != 8 && ((fVar = (f) childAt2.getLayoutParams()) == null || !fVar.f17066a)) {
                if (this.f17026e == 0) {
                    i11 = View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * fVar.f17068c), 1073741824);
                    makeMeasureSpec = this.f17052v;
                } else {
                    int i23 = this.f17051u;
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (paddingTop * fVar.f17068c), 1073741824);
                    i11 = i23;
                }
                childAt2.measure(i11, makeMeasureSpec);
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
            if (childAt.getVisibility() == 0 && (u11 = u(childAt)) != null && u11.f17062b == this.f17030g && childAt.requestFocus(direction, previouslyFocusedRect)) {
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
        PagerAdapter pagerAdapter = this.f17027f;
        if (pagerAdapter != null) {
            pagerAdapter.restoreState(savedState.f17058b, savedState.f17059c);
            M(savedState.f17057a, false, true);
        } else {
            this.f17031h = savedState.f17057a;
            this.f17033i = savedState.f17058b;
            this.f17035j = savedState.f17059c;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f17057a = this.f17030g;
        PagerAdapter pagerAdapter = this.f17027f;
        if (pagerAdapter != null) {
            savedState.f17058b = pagerAdapter.saveState();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        super.onSizeChanged(w11, h11, oldw, oldh);
        if (w11 != oldw) {
            int i11 = this.f17041m;
            I(w11, oldw, i11, i11);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent ev2) {
        PagerAdapter pagerAdapter;
        boolean onRelease;
        boolean onRelease2;
        if (this.P) {
            return true;
        }
        boolean z11 = false;
        if ((ev2.getAction() == 0 && ev2.getEdgeFlags() != 0) || (pagerAdapter = this.f17027f) == null || pagerAdapter.getCount() == 0) {
            return false;
        }
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
        this.K.addMovement(ev2);
        int action = ev2.getAction() & 255;
        if (action == 0) {
            this.f17037k.abortAnimation();
            this.f17055y = false;
            G();
            this.A = true;
            setScrollState(1);
            float x11 = ev2.getX();
            this.H = x11;
            this.F = x11;
            float y11 = ev2.getY();
            this.I = y11;
            this.G = y11;
            this.J = MotionEventCompat.getPointerId(ev2, 0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.A) {
                    int findPointerIndex = MotionEventCompat.findPointerIndex(ev2, this.J);
                    float x12 = MotionEventCompat.getX(ev2, findPointerIndex);
                    float abs = Math.abs(x12 - this.F);
                    float y12 = MotionEventCompat.getY(ev2, findPointerIndex);
                    float abs2 = Math.abs(y12 - this.G);
                    if (this.f17026e == 0) {
                        int i11 = this.E;
                        if (abs > i11 && abs > abs2) {
                            this.A = true;
                            float f11 = this.H;
                            this.F = x12 - f11 > 0.0f ? f11 + i11 : f11 - i11;
                            this.G = y12;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                        }
                    } else {
                        int i12 = this.E;
                        if (abs2 > i12 && abs2 > abs) {
                            this.A = true;
                            this.F = x12;
                            float f12 = this.I;
                            this.G = y12 - f12 > 0.0f ? f12 + i12 : f12 - i12;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                        }
                    }
                }
                if (this.A) {
                    int findPointerIndex2 = MotionEventCompat.findPointerIndex(ev2, this.J);
                    z11 = F(this.f17026e == 0 ? MotionEventCompat.getX(ev2, findPointerIndex2) : MotionEventCompat.getY(ev2, findPointerIndex2));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = MotionEventCompat.getActionIndex(ev2);
                    if (this.f17026e == 0) {
                        this.F = MotionEventCompat.getX(ev2, actionIndex);
                    } else {
                        this.G = MotionEventCompat.getY(ev2, actionIndex);
                    }
                    this.J = MotionEventCompat.getPointerId(ev2, actionIndex);
                } else if (action == 6) {
                    B(ev2);
                    if (this.f17026e == 0) {
                        this.F = MotionEventCompat.getX(ev2, MotionEventCompat.findPointerIndex(ev2, this.J));
                    } else {
                        this.G = MotionEventCompat.getY(ev2, MotionEventCompat.findPointerIndex(ev2, this.J));
                    }
                }
            } else if (this.A) {
                K(this.f17030g, true, 0, false);
                this.J = -1;
                o();
                onRelease = this.R.onRelease();
                onRelease2 = this.S.onRelease();
                z11 = onRelease | onRelease2;
            }
        } else if (this.A) {
            VelocityTracker velocityTracker = this.K;
            velocityTracker.computeCurrentVelocity(1000, this.M);
            int xVelocity = (int) (this.f17026e == 0 ? VelocityTrackerCompat.getXVelocity(velocityTracker, this.J) : VelocityTrackerCompat.getYVelocity(velocityTracker, this.J));
            this.f17055y = true;
            int clientDimension = getClientDimension();
            int scrollCoord = getScrollCoord();
            e v11 = v();
            if (v11 != null) {
                int i13 = v11.f17062b;
                float f13 = ((scrollCoord / clientDimension) - v11.f17065e) / v11.f17064d;
                int findPointerIndex3 = MotionEventCompat.findPointerIndex(ev2, this.J);
                N(l(i13, f13, xVelocity, (int) ((this.f17026e == 0 ? MotionEventCompat.getX(ev2, findPointerIndex3) : MotionEventCompat.getY(ev2, findPointerIndex3)) - (this.f17026e == 0 ? this.H : this.I))), true, true, xVelocity);
                this.J = -1;
                o();
                onRelease = this.R.onRelease();
                onRelease2 = this.S.onRelease();
                z11 = onRelease | onRelease2;
            }
        }
        if (z11) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
        return true;
    }

    public void p() {
        float f11;
        float f12;
        if (!this.P) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        VelocityTracker velocityTracker = this.K;
        velocityTracker.computeCurrentVelocity(1000, this.M);
        int xVelocity = (int) VelocityTrackerCompat.getXVelocity(velocityTracker, this.J);
        this.f17055y = true;
        int clientDimension = getClientDimension();
        int scrollCoord = getScrollCoord();
        e v11 = v();
        int i11 = v11.f17062b;
        float f13 = ((scrollCoord / clientDimension) - v11.f17065e) / v11.f17064d;
        if (this.f17026e == 0) {
            f11 = this.F;
            f12 = this.H;
        } else {
            f11 = this.G;
            f12 = this.I;
        }
        N(l(i11, f13, xVelocity, (int) (f11 - f12)), true, true, xVelocity);
        o();
        this.P = false;
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

    public void r(float offset) {
        if (!this.P) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f17026e == 0) {
            this.F += offset;
        } else {
            this.G += offset;
        }
        float scrollCoord = getScrollCoord() - offset;
        float clientDimension = getClientDimension();
        float f11 = this.f17049s * clientDimension;
        float f12 = this.f17050t * clientDimension;
        e eVar = this.f17023b.get(0);
        e eVar2 = this.f17023b.get(r4.size() - 1);
        if (eVar.f17062b != 0) {
            f11 = eVar.f17065e * clientDimension;
        }
        if (eVar2.f17062b != this.f17027f.getCount() - 1) {
            f12 = eVar2.f17065e * clientDimension;
        }
        if (scrollCoord < f11) {
            scrollCoord = f11;
        } else if (scrollCoord > f12) {
            scrollCoord = f12;
        }
        if (this.f17026e == 0) {
            int i11 = (int) scrollCoord;
            this.F += scrollCoord - i11;
            scrollTo(i11, getScrollY());
        } else {
            int i12 = (int) scrollCoord;
            this.G += scrollCoord - i12;
            scrollTo(getScrollX(), i12);
        }
        E((int) scrollCoord);
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = this.f17026e == 0 ? MotionEvent.obtain(this.Q, uptimeMillis, 2, this.F, 0.0f, 0) : MotionEvent.obtain(this.Q, uptimeMillis, 2, 0.0f, this.G, 0);
        this.K.addMovement(obtain);
        obtain.recycle();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f17053w) {
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
        PagerAdapter pagerAdapter = this.f17027f;
        if (pagerAdapter != null) {
            pagerAdapter.unregisterDataSetObserver(this.f17039l);
            this.f17027f.startUpdate((ViewGroup) this);
            for (int i11 = 0; i11 < this.f17023b.size(); i11++) {
                e eVar = this.f17023b.get(i11);
                this.f17027f.destroyItem((ViewGroup) this, eVar.f17062b, eVar.f17061a);
            }
            this.f17027f.finishUpdate((ViewGroup) this);
            this.f17023b.clear();
            J();
            this.f17030g = 0;
            scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter2 = this.f17027f;
        this.f17027f = adapter;
        this.f17022a = 0;
        if (adapter != null) {
            if (this.f17039l == null) {
                this.f17039l = new k();
            }
            this.f17027f.registerDataSetObserver(this.f17039l);
            this.f17055y = false;
            boolean z11 = this.U;
            this.U = true;
            this.f17022a = this.f17027f.getCount();
            if (this.f17031h >= 0) {
                this.f17027f.restoreState(this.f17033i, this.f17035j);
                M(this.f17031h, false, true);
                this.f17031h = -1;
                this.f17033i = null;
                this.f17035j = null;
            } else if (z11) {
                requestLayout();
            } else {
                G();
            }
        }
        h hVar = this.f17032h1;
        if (hVar == null || pagerAdapter2 == adapter) {
            return;
        }
        hVar.a(pagerAdapter2, adapter);
    }

    public void setChildrenDrawingOrderEnabledCompat(boolean enable) {
        if (this.f17036j1 == null) {
            try {
                this.f17036j1 = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e11) {
                Log.e("ViewPager", "Can't find setChildrenDrawingOrderEnabled", e11);
            }
        }
        try {
            this.f17036j1.invoke(this, Boolean.valueOf(enable));
        } catch (Exception e12) {
            Log.e("ViewPager", "Error changing children drawing order", e12);
        }
    }

    public void setCurrentItem(int item) {
        this.f17055y = false;
        M(item, !this.U, false);
    }

    public void setOffscreenPageLimit(int limit) {
        if (limit < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + limit + " too small; defaulting to 1");
            limit = 1;
        }
        if (limit != this.f17056z) {
            this.f17056z = limit;
            G();
        }
    }

    public void setOnAdapterChangeListener(h listener) {
        this.f17032h1 = listener;
    }

    public void setOnPageChangeListener(i listener) {
        this.f17028f0 = listener;
    }

    public void setOrientation(int orientation) {
        this.f17026e = orientation;
    }

    public void setPageMargin(int marginPixels) {
        int i11 = this.f17041m;
        this.f17041m = marginPixels;
        int width = getWidth();
        I(width, width, marginPixels, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable d11) {
        this.f17043n = d11;
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
        for (int i11 = 0; i11 < this.f17023b.size(); i11++) {
            e eVar = this.f17023b.get(i11);
            if (this.f17027f.isViewFromObject(child, eVar.f17061a)) {
                return eVar;
            }
        }
        return null;
    }

    public final e v() {
        int i11;
        int clientDimension = getClientDimension();
        float f11 = 0.0f;
        float scrollCoord = clientDimension > 0 ? getScrollCoord() / clientDimension : 0.0f;
        float f12 = clientDimension > 0 ? this.f17041m / clientDimension : 0.0f;
        int i12 = 0;
        boolean z11 = true;
        e eVar = null;
        int i13 = -1;
        float f13 = 0.0f;
        while (i12 < this.f17023b.size()) {
            e eVar2 = this.f17023b.get(i12);
            if (!z11 && eVar2.f17062b != (i11 = i13 + 1)) {
                eVar2 = this.f17024c;
                eVar2.f17065e = f11 + f13 + f12;
                eVar2.f17062b = i11;
                eVar2.f17064d = this.f17027f.getPageWidth(i11);
                i12--;
            }
            e eVar3 = eVar2;
            f11 = eVar3.f17065e;
            float f14 = eVar3.f17064d + f11 + f12;
            if (!z11 && scrollCoord < f11) {
                break;
            }
            if (scrollCoord < f14 || i12 == this.f17023b.size() - 1) {
                return eVar3;
            }
            int i14 = eVar3.f17062b;
            float f15 = eVar3.f17064d;
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
        return super.verifyDrawable(who) || who == this.f17043n;
    }

    public e w(int position) {
        for (int i11 = 0; i11 < this.f17023b.size(); i11++) {
            e eVar = this.f17023b.get(i11);
            if (eVar.f17062b == position) {
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
        this.f17037k = new Scroller(context, A1);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f11 = context.getResources().getDisplayMetrics().density;
        this.E = ViewConfigurationCompat.getScaledPagingTouchSlop(viewConfiguration);
        this.L = (int) (400.0f * f11);
        this.M = viewConfiguration.getScaledMaximumFlingVelocity();
        this.R = new EdgeEffectCompat(context);
        this.S = new EdgeEffectCompat(context);
        this.N = (int) (25.0f * f11);
        this.O = (int) (2.0f * f11);
        this.C = (int) (f11 * 16.0f);
        ViewCompat.setAccessibilityDelegate(this, new g());
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
    }

    public boolean y() {
        return this.P;
    }

    public final boolean z(float x11, float dx2) {
        if (x11 >= this.D || dx2 <= 0.0f) {
            return x11 > ((float) (getWidth() - this.D)) && dx2 < 0.0f;
        }
        return true;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f extends ViewGroup.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public boolean f17066a;

        /* renamed from: b, reason: collision with root package name */
        public int f17067b;

        /* renamed from: c, reason: collision with root package name */
        public float f17068c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f17069d;

        /* renamed from: e, reason: collision with root package name */
        public int f17070e;

        /* renamed from: f, reason: collision with root package name */
        public int f17071f;

        public f() {
            super(-1, -1);
            this.f17068c = 0.0f;
        }

        public f(Context context, AttributeSet attrs) {
            super(context, attrs);
            this.f17068c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, DirectionalViewPager.f17020y1);
            this.f17067b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new f(getContext(), attrs);
    }

    public void setPageMarginDrawable(int resId) {
        setPageMarginDrawable(getContext().getResources().getDrawable(resId));
    }

    public DirectionalViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f17023b = new ArrayList<>();
        this.f17024c = new e();
        this.f17025d = new Rect();
        this.f17026e = 0;
        this.f17031h = -1;
        this.f17033i = null;
        this.f17035j = null;
        this.f17049s = -3.4028235E38f;
        this.f17050t = Float.MAX_VALUE;
        this.f17056z = 1;
        this.J = -1;
        this.U = true;
        this.f17042m1 = new c();
        this.f17044n1 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, new int[]{R.attr.orientation});
        int i11 = obtainStyledAttributes.getInt(0, 0);
        if (i11 == 0 || i11 == 1) {
            setOrientation(i11);
        }
        obtainStyledAttributes.recycle();
        x();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class l implements i {
        @Override // com.baicizhan.client.business.widget.DirectionalViewPager.i
        public void onPageScrollStateChanged(int state) {
        }

        @Override // com.baicizhan.client.business.widget.DirectionalViewPager.i
        public void onPageSelected(int position) {
        }

        @Override // com.baicizhan.client.business.widget.DirectionalViewPager.i
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }
    }
}
