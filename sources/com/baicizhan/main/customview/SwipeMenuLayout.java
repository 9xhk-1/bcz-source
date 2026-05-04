package com.baicizhan.main.customview;

import a00.h0;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import android.widget.Scroller;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewGroupKt;
import com.baicizhan.main.customview.SwipeMenuLayout;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSwipeMenuLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeMenuLayout.kt\ncom/baicizhan/main/customview/SwipeMenuLayout\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n*L\n1#1,237:1\n1332#2,3:238\n35#3:241\n35#3:242\n*S KotlinDebug\n*F\n+ 1 SwipeMenuLayout.kt\ncom/baicizhan/main/customview/SwipeMenuLayout\n*L\n51#1:238,3\n92#1:241\n102#1:242\n*E\n"})
/* loaded from: classes4.dex */
public final class SwipeMenuLayout extends LinearLayout {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f20172i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f20173j = 8;

    /* renamed from: k, reason: collision with root package name */
    @l
    public static SwipeMenuLayout f20174k = null;

    /* renamed from: l, reason: collision with root package name */
    @l
    public static SwipeMenuLayout f20175l = null;

    /* renamed from: m, reason: collision with root package name */
    public static final int f20176m = 500;

    /* renamed from: a, reason: collision with root package name */
    public int f20177a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c0 f20178b;

    /* renamed from: c, reason: collision with root package name */
    public VelocityTracker f20179c;

    /* renamed from: d, reason: collision with root package name */
    public int f20180d;

    /* renamed from: e, reason: collision with root package name */
    public int f20181e;

    /* renamed from: f, reason: collision with root package name */
    public float f20182f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final PointF f20183g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f20184h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @l
        public final SwipeMenuLayout a() {
            return SwipeMenuLayout.f20174k;
        }

        @l
        public final SwipeMenuLayout b() {
            return SwipeMenuLayout.f20175l;
        }

        public final void c(@l SwipeMenuLayout swipeMenuLayout) {
            SwipeMenuLayout.f20174k = swipeMenuLayout;
        }

        public final void d(@l SwipeMenuLayout swipeMenuLayout) {
            SwipeMenuLayout.f20175l = swipeMenuLayout;
        }

        public final void e() {
            SwipeMenuLayout a11 = a();
            if (a11 != null) {
                a11.j();
            }
        }

        public a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public SwipeMenuLayout(@k Context context) {
        this(context, null, 0, 6, null);
        g0.p(context, "context");
    }

    public static final Scroller g(Context context) {
        return new Scroller(context);
    }

    private final Scroller getMScroller() {
        return (Scroller) this.f20178b.getValue();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (getMScroller().computeScrollOffset()) {
            scrollTo(getMScroller().getCurrX(), getMScroller().getCurrY());
            invalidate();
        }
    }

    public final boolean getForbidSwipe() {
        return this.f20184h;
    }

    public final void i() {
        VelocityTracker velocityTracker = this.f20179c;
        VelocityTracker velocityTracker2 = null;
        if (velocityTracker == null) {
            g0.S("mVelocityTracker");
            velocityTracker = null;
        }
        velocityTracker.clear();
        VelocityTracker velocityTracker3 = this.f20179c;
        if (velocityTracker3 == null) {
            g0.S("mVelocityTracker");
        } else {
            velocityTracker2 = velocityTracker3;
        }
        velocityTracker2.recycle();
    }

    public final void j() {
        f20175l = null;
        f20174k = null;
        getMScroller().startScroll(getScrollX(), 0, -getScrollX(), 0, 100);
        invalidate();
    }

    public final void k(int i11) {
        f20175l = null;
        f20174k = this;
        getMScroller().startScroll(getScrollX(), 0, this.f20181e - getScrollX(), 0, i11);
        invalidate();
    }

    public final void l(MotionEvent motionEvent) {
        VelocityTracker obtain = VelocityTracker.obtain();
        g0.o(obtain, "obtain(...)");
        this.f20179c = obtain;
        if (obtain == null) {
            g0.S("mVelocityTracker");
            obtain = null;
        }
        obtain.addMovement(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (g0.g(this, f20174k)) {
            SwipeMenuLayout swipeMenuLayout = f20174k;
            if (swipeMenuLayout != null) {
                swipeMenuLayout.j();
            }
            f20174k = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@l MotionEvent motionEvent) {
        if (this.f20184h) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        SwipeMenuLayout swipeMenuLayout = f20175l;
        if (swipeMenuLayout != null && !g0.g(swipeMenuLayout, this)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        l(motionEvent);
        VelocityTracker velocityTracker = null;
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            if (!getMScroller().isFinished()) {
                getMScroller().abortAnimation();
            }
            this.f20182f = motionEvent.getX();
            this.f20183g.set(motionEvent.getX(), motionEvent.getY());
            SwipeMenuLayout swipeMenuLayout2 = f20174k;
            if (swipeMenuLayout2 != null) {
                if (!g0.g(swipeMenuLayout2, this)) {
                    swipeMenuLayout2.j();
                    return true;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (valueOf != null && valueOf.intValue() == 2) {
            SwipeMenuLayout swipeMenuLayout3 = f20174k;
            if (swipeMenuLayout3 != null && !g0.g(swipeMenuLayout3, this)) {
                return false;
            }
            getParent().requestDisallowInterceptTouchEvent(true);
            VelocityTracker velocityTracker2 = this.f20179c;
            if (velocityTracker2 == null) {
                g0.S("mVelocityTracker");
                velocityTracker2 = null;
            }
            velocityTracker2.computeCurrentVelocity(1000);
            VelocityTracker velocityTracker3 = this.f20179c;
            if (velocityTracker3 == null) {
                g0.S("mVelocityTracker");
                velocityTracker3 = null;
            }
            float xVelocity = velocityTracker3.getXVelocity();
            VelocityTracker velocityTracker4 = this.f20179c;
            if (velocityTracker4 == null) {
                g0.S("mVelocityTracker");
            } else {
                velocityTracker = velocityTracker4;
            }
            float yVelocity = velocityTracker.getYVelocity();
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            if ((Math.abs(xVelocity) > 500.0f && Math.abs(xVelocity) > Math.abs(yVelocity)) || (Math.abs(x11 - this.f20183g.x) >= this.f20177a && Math.abs(x11 - this.f20183g.x) > Math.abs(y11 - this.f20183g.y))) {
                f20175l = this;
                return true;
            }
            getParent().requestDisallowInterceptTouchEvent(false);
            i();
        } else if (valueOf != null && valueOf.intValue() == 1) {
            f20175l = null;
            if (g0.g(this, f20174k) && motionEvent.getX() < getWidth() - getScrollX()) {
                j();
                return true;
            }
        } else if (valueOf != null && valueOf.intValue() == 3) {
            f20175l = null;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        super.onMeasure(i11, i12);
        int i15 = 0;
        this.f20181e = 0;
        this.f20180d = 0;
        int i16 = 0;
        for (View view : ViewGroupKt.getChildren(this)) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                h0.b0();
            }
            View view2 = view;
            if (view2.getVisibility() == 8) {
                i13 = i11;
                i14 = i12;
            } else if (i16 == 0) {
                i13 = i11;
                i14 = i12;
                measureChildWithMargins(view2, i13, 0, i14, 0);
                int measuredWidth = view2.getMeasuredWidth();
                this.f20180d = Math.max(this.f20180d, view2.getMeasuredHeight());
                view2.setOnClickListener(new View.OnClickListener() { // from class: zf.o
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        SwipeMenuLayout.h(view3);
                    }
                });
                i15 = measuredWidth;
            } else {
                i13 = i11;
                i14 = i12;
                view2.measure(View.MeasureSpec.makeMeasureSpec(view2.getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f20180d, 1073741824));
                this.f20181e += view2.getMeasuredWidth();
            }
            i16 = i17;
            i11 = i13;
            i12 = i14;
        }
        setMeasuredDimension(i15 + getPaddingLeft() + getPaddingRight(), this.f20180d + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public boolean onTouchEvent(@l MotionEvent motionEvent) {
        if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        float x11 = motionEvent.getX();
        l(motionEvent);
        int action = motionEvent.getAction();
        VelocityTracker velocityTracker = null;
        if (action == 1) {
            f20175l = null;
            VelocityTracker velocityTracker2 = this.f20179c;
            if (velocityTracker2 == null) {
                g0.S("mVelocityTracker");
                velocityTracker2 = null;
            }
            velocityTracker2.computeCurrentVelocity(1000);
            int scrollX = getScrollX();
            VelocityTracker velocityTracker3 = this.f20179c;
            if (velocityTracker3 == null) {
                g0.S("mVelocityTracker");
                velocityTracker3 = null;
            }
            if (velocityTracker3.getXVelocity() < -500.0f) {
                float abs = Math.abs(this.f20181e - scrollX);
                VelocityTracker velocityTracker4 = this.f20179c;
                if (velocityTracker4 == null) {
                    g0.S("mVelocityTracker");
                } else {
                    velocityTracker = velocityTracker4;
                }
                k((int) ((abs / velocityTracker.getXVelocity()) * 1000));
            } else {
                VelocityTracker velocityTracker5 = this.f20179c;
                if (velocityTracker5 == null) {
                    g0.S("mVelocityTracker");
                } else {
                    velocityTracker = velocityTracker5;
                }
                if (velocityTracker.getXVelocity() >= 500.0f) {
                    j();
                } else if (scrollX >= this.f20181e / 2) {
                    k(100);
                } else {
                    j();
                }
            }
            i();
        } else if (action == 2) {
            float f11 = this.f20182f - x11;
            if (getScrollX() + f11 > 0.0f && getScrollX() + f11 < this.f20181e) {
                scrollBy((int) f11, 0);
            }
            this.f20182f = x11;
        } else if (action == 3) {
            f20175l = null;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setForbidSwipe(boolean z11) {
        this.f20184h = z11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public SwipeMenuLayout(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        g0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @w00.k
    public SwipeMenuLayout(@k final Context context, @l AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        g0.p(context, "context");
        this.f20178b = e0.c(new x00.a() { // from class: zf.p
            @Override // x00.a
            public final Object invoke() {
                Scroller g11;
                g11 = SwipeMenuLayout.g(context);
                return g11;
            }
        });
        this.f20183g = new PointF();
        this.f20177a = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public /* synthetic */ SwipeMenuLayout(Context context, AttributeSet attributeSet, int i11, int i12, v vVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public static final void h(View view) {
    }
}
