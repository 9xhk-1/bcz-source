package com.chauthai.swipereveallayout;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"RtlHardcoded"})
/* loaded from: classes6.dex */
public class SwipeRevealLayout extends ViewGroup {
    public static final int A = 1;
    public static final int B = 2;
    public static final int C = 3;
    public static final int D = 4;
    public static final int E = 300;
    public static final int F = 1;
    public static final int G = 1;
    public static final int H = 2;
    public static final int I = 4;
    public static final int J = 8;
    public static final int K = 0;
    public static final int L = 1;

    /* renamed from: z, reason: collision with root package name */
    public static final int f28997z = 0;

    /* renamed from: a, reason: collision with root package name */
    public View f28998a;

    /* renamed from: b, reason: collision with root package name */
    public View f28999b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f29000c;

    /* renamed from: d, reason: collision with root package name */
    public Rect f29001d;

    /* renamed from: e, reason: collision with root package name */
    public Rect f29002e;

    /* renamed from: f, reason: collision with root package name */
    public Rect f29003f;

    /* renamed from: g, reason: collision with root package name */
    public int f29004g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f29005h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f29006i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f29007j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f29008k;

    /* renamed from: l, reason: collision with root package name */
    public int f29009l;

    /* renamed from: m, reason: collision with root package name */
    public int f29010m;

    /* renamed from: n, reason: collision with root package name */
    public int f29011n;

    /* renamed from: o, reason: collision with root package name */
    public int f29012o;

    /* renamed from: p, reason: collision with root package name */
    public int f29013p;

    /* renamed from: q, reason: collision with root package name */
    public int f29014q;

    /* renamed from: r, reason: collision with root package name */
    public ViewDragHelper f29015r;

    /* renamed from: s, reason: collision with root package name */
    public GestureDetectorCompat f29016s;

    /* renamed from: t, reason: collision with root package name */
    public c f29017t;

    /* renamed from: u, reason: collision with root package name */
    public e f29018u;

    /* renamed from: v, reason: collision with root package name */
    public int f29019v;

    /* renamed from: w, reason: collision with root package name */
    public il.a f29020w;

    /* renamed from: x, reason: collision with root package name */
    public final GestureDetector.OnGestureListener f29021x;

    /* renamed from: y, reason: collision with root package name */
    public final ViewDragHelper.Callback f29022y;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a, reason: collision with root package name */
        public boolean f29023a = false;

        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent e11) {
            SwipeRevealLayout.this.f29007j = false;
            this.f29023a = false;
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent e12, MotionEvent e22, float velocityX, float velocityY) {
            SwipeRevealLayout.this.f29007j = true;
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent e12, MotionEvent e22, float distanceX, float distanceY) {
            boolean z11 = true;
            SwipeRevealLayout.this.f29007j = true;
            if (SwipeRevealLayout.this.getParent() != null) {
                if (!this.f29023a) {
                    boolean z12 = SwipeRevealLayout.this.getDistToClosestEdge() >= SwipeRevealLayout.this.f29004g;
                    if (z12) {
                        this.f29023a = true;
                    }
                    z11 = z12;
                }
                SwipeRevealLayout.this.getParent().requestDisallowInterceptTouchEvent(z11);
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends ViewDragHelper.Callback {
        public b() {
        }

        public final float a() {
            float left;
            int width;
            int i11 = SwipeRevealLayout.this.f29014q;
            if (i11 == 1) {
                left = SwipeRevealLayout.this.f28998a.getLeft() - SwipeRevealLayout.this.f29000c.left;
                width = SwipeRevealLayout.this.f28999b.getWidth();
            } else if (i11 == 2) {
                left = SwipeRevealLayout.this.f29000c.left - SwipeRevealLayout.this.f28998a.getLeft();
                width = SwipeRevealLayout.this.f28999b.getWidth();
            } else if (i11 == 4) {
                left = SwipeRevealLayout.this.f28998a.getTop() - SwipeRevealLayout.this.f29000c.top;
                width = SwipeRevealLayout.this.f28999b.getHeight();
            } else {
                if (i11 != 8) {
                    return 0.0f;
                }
                left = SwipeRevealLayout.this.f29000c.top - SwipeRevealLayout.this.f28998a.getTop();
                width = SwipeRevealLayout.this.f28999b.getHeight();
            }
            return left / width;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(View child, int left, int dx2) {
            int i11 = SwipeRevealLayout.this.f29014q;
            return i11 != 1 ? i11 != 2 ? child.getLeft() : Math.max(Math.min(left, SwipeRevealLayout.this.f29000c.left), SwipeRevealLayout.this.f29000c.left - SwipeRevealLayout.this.f28999b.getWidth()) : Math.max(Math.min(left, SwipeRevealLayout.this.f29000c.left + SwipeRevealLayout.this.f28999b.getWidth()), SwipeRevealLayout.this.f29000c.left);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(View child, int top, int dy2) {
            int i11 = SwipeRevealLayout.this.f29014q;
            return i11 != 4 ? i11 != 8 ? child.getTop() : Math.max(Math.min(top, SwipeRevealLayout.this.f29000c.top), SwipeRevealLayout.this.f29000c.top - SwipeRevealLayout.this.f28999b.getHeight()) : Math.max(Math.min(top, SwipeRevealLayout.this.f29000c.top + SwipeRevealLayout.this.f28999b.getHeight()), SwipeRevealLayout.this.f29000c.top);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onEdgeDragStarted(int edgeFlags, int pointerId) {
            super.onEdgeDragStarted(edgeFlags, pointerId);
            if (SwipeRevealLayout.this.f29008k) {
                return;
            }
            boolean z11 = false;
            boolean z12 = SwipeRevealLayout.this.f29014q == 2 && edgeFlags == 1;
            boolean z13 = SwipeRevealLayout.this.f29014q == 1 && edgeFlags == 2;
            boolean z14 = SwipeRevealLayout.this.f29014q == 8 && edgeFlags == 4;
            if (SwipeRevealLayout.this.f29014q == 4 && edgeFlags == 8) {
                z11 = true;
            }
            if (z12 || z13 || z14 || z11) {
                SwipeRevealLayout.this.f29015r.captureChildView(SwipeRevealLayout.this.f28998a, pointerId);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int state) {
            super.onViewDragStateChanged(state);
            int i11 = SwipeRevealLayout.this.f29010m;
            if (state != 0) {
                if (state == 1) {
                    SwipeRevealLayout.this.f29010m = 4;
                }
            } else if (SwipeRevealLayout.this.f29014q == 1 || SwipeRevealLayout.this.f29014q == 2) {
                if (SwipeRevealLayout.this.f28998a.getLeft() == SwipeRevealLayout.this.f29000c.left) {
                    SwipeRevealLayout.this.f29010m = 0;
                } else {
                    SwipeRevealLayout.this.f29010m = 2;
                }
            } else if (SwipeRevealLayout.this.f28998a.getTop() == SwipeRevealLayout.this.f29000c.top) {
                SwipeRevealLayout.this.f29010m = 0;
            } else {
                SwipeRevealLayout.this.f29010m = 2;
            }
            if (SwipeRevealLayout.this.f29017t == null || SwipeRevealLayout.this.f29006i || i11 == SwipeRevealLayout.this.f29010m) {
                return;
            }
            SwipeRevealLayout.this.f29017t.a(SwipeRevealLayout.this.f29010m);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(View changedView, int left, int top, int dx2, int dy2) {
            super.onViewPositionChanged(changedView, left, top, dx2, dy2);
            boolean z11 = true;
            if (SwipeRevealLayout.this.f29011n == 1) {
                if (SwipeRevealLayout.this.f29014q == 1 || SwipeRevealLayout.this.f29014q == 2) {
                    SwipeRevealLayout.this.f28999b.offsetLeftAndRight(dx2);
                } else {
                    SwipeRevealLayout.this.f28999b.offsetTopAndBottom(dy2);
                }
            }
            if (SwipeRevealLayout.this.f28998a.getLeft() == SwipeRevealLayout.this.f29012o && SwipeRevealLayout.this.f28998a.getTop() == SwipeRevealLayout.this.f29013p) {
                z11 = false;
            }
            if (SwipeRevealLayout.this.f29018u != null && z11) {
                if (SwipeRevealLayout.this.f28998a.getLeft() == SwipeRevealLayout.this.f29000c.left && SwipeRevealLayout.this.f28998a.getTop() == SwipeRevealLayout.this.f29000c.top) {
                    SwipeRevealLayout.this.f29018u.a(SwipeRevealLayout.this);
                } else if (SwipeRevealLayout.this.f28998a.getLeft() == SwipeRevealLayout.this.f29001d.left && SwipeRevealLayout.this.f28998a.getTop() == SwipeRevealLayout.this.f29001d.top) {
                    SwipeRevealLayout.this.f29018u.c(SwipeRevealLayout.this);
                } else {
                    SwipeRevealLayout.this.f29018u.b(SwipeRevealLayout.this, a());
                }
            }
            SwipeRevealLayout swipeRevealLayout = SwipeRevealLayout.this;
            swipeRevealLayout.f29012o = swipeRevealLayout.f28998a.getLeft();
            SwipeRevealLayout swipeRevealLayout2 = SwipeRevealLayout.this;
            swipeRevealLayout2.f29013p = swipeRevealLayout2.f28998a.getTop();
            ViewCompat.postInvalidateOnAnimation(SwipeRevealLayout.this);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(View releasedChild, float xvel, float yvel) {
            int i11 = (int) xvel;
            boolean z11 = SwipeRevealLayout.this.J(i11) >= SwipeRevealLayout.this.f29009l;
            boolean z12 = SwipeRevealLayout.this.J(i11) <= (-SwipeRevealLayout.this.f29009l);
            int i12 = (int) yvel;
            boolean z13 = SwipeRevealLayout.this.J(i12) <= (-SwipeRevealLayout.this.f29009l);
            boolean z14 = SwipeRevealLayout.this.J(i12) >= SwipeRevealLayout.this.f29009l;
            int halfwayPivotHorizontal = SwipeRevealLayout.this.getHalfwayPivotHorizontal();
            int halfwayPivotVertical = SwipeRevealLayout.this.getHalfwayPivotVertical();
            int i13 = SwipeRevealLayout.this.f29014q;
            if (i13 == 1) {
                if (z11) {
                    SwipeRevealLayout.this.I(true);
                    return;
                }
                if (z12) {
                    SwipeRevealLayout.this.A(true);
                    return;
                } else if (SwipeRevealLayout.this.f28998a.getLeft() < halfwayPivotHorizontal) {
                    SwipeRevealLayout.this.A(true);
                    return;
                } else {
                    SwipeRevealLayout.this.I(true);
                    return;
                }
            }
            if (i13 == 2) {
                if (z11) {
                    SwipeRevealLayout.this.A(true);
                    return;
                }
                if (z12) {
                    SwipeRevealLayout.this.I(true);
                    return;
                } else if (SwipeRevealLayout.this.f28998a.getRight() < halfwayPivotHorizontal) {
                    SwipeRevealLayout.this.I(true);
                    return;
                } else {
                    SwipeRevealLayout.this.A(true);
                    return;
                }
            }
            if (i13 == 4) {
                if (z13) {
                    SwipeRevealLayout.this.A(true);
                    return;
                }
                if (z14) {
                    SwipeRevealLayout.this.I(true);
                    return;
                } else if (SwipeRevealLayout.this.f28998a.getTop() < halfwayPivotVertical) {
                    SwipeRevealLayout.this.A(true);
                    return;
                } else {
                    SwipeRevealLayout.this.I(true);
                    return;
                }
            }
            if (i13 != 8) {
                return;
            }
            if (z13) {
                SwipeRevealLayout.this.I(true);
                return;
            }
            if (z14) {
                SwipeRevealLayout.this.A(true);
            } else if (SwipeRevealLayout.this.f28998a.getBottom() < halfwayPivotVertical) {
                SwipeRevealLayout.this.I(true);
            } else {
                SwipeRevealLayout.this.A(true);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View child, int pointerId) {
            SwipeRevealLayout.this.f29006i = false;
            if (SwipeRevealLayout.this.f29008k) {
                return false;
            }
            SwipeRevealLayout.this.f29015r.captureChildView(SwipeRevealLayout.this.f28998a, pointerId);
            return false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void a(int state);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface e {
        void a(SwipeRevealLayout view);

        void b(SwipeRevealLayout view, float slideOffset);

        void c(SwipeRevealLayout view);
    }

    public SwipeRevealLayout(Context context) {
        super(context);
        this.f29000c = new Rect();
        this.f29001d = new Rect();
        this.f29002e = new Rect();
        this.f29003f = new Rect();
        this.f29004g = 0;
        this.f29005h = false;
        this.f29006i = false;
        this.f29007j = false;
        this.f29008k = false;
        this.f29009l = 300;
        this.f29010m = 0;
        this.f29011n = 0;
        this.f29012o = 0;
        this.f29013p = 0;
        this.f29014q = 1;
        this.f29019v = 0;
        this.f29020w = new il.a();
        this.f29021x = new a();
        this.f29022y = new b();
        D(context, null);
    }

    public static String C(int state) {
        return state != 0 ? state != 1 ? state != 2 ? state != 3 ? state != 4 ? "undefined" : "state_dragging" : "state_opening" : "state_open" : "state_closing" : "state_close";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getDistToClosestEdge() {
        int i11 = this.f29014q;
        if (i11 == 1) {
            return Math.min(this.f28998a.getLeft() - this.f29000c.left, (this.f29000c.left + this.f28999b.getWidth()) - this.f28998a.getLeft());
        }
        if (i11 == 2) {
            return Math.min(this.f28998a.getRight() - (this.f29000c.right - this.f28999b.getWidth()), this.f29000c.right - this.f28998a.getRight());
        }
        if (i11 == 4) {
            int height = this.f29000c.top + this.f28999b.getHeight();
            return Math.min(this.f28998a.getBottom() - height, height - this.f28998a.getTop());
        }
        if (i11 != 8) {
            return 0;
        }
        return Math.min(this.f29000c.bottom - this.f28998a.getBottom(), this.f28998a.getBottom() - (this.f29000c.bottom - this.f28999b.getHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getHalfwayPivotHorizontal() {
        return this.f29014q == 1 ? this.f29000c.left + (this.f28999b.getWidth() / 2) : this.f29000c.right - (this.f28999b.getWidth() / 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getHalfwayPivotVertical() {
        return this.f29014q == 4 ? this.f29000c.top + (this.f28999b.getHeight() / 2) : this.f29000c.bottom - (this.f28999b.getHeight() / 2);
    }

    private int getMainOpenLeft() {
        int i11 = this.f29014q;
        if (i11 == 1) {
            return this.f29000c.left + this.f28999b.getWidth();
        }
        if (i11 == 2) {
            return this.f29000c.left - this.f28999b.getWidth();
        }
        if (i11 == 4) {
            return this.f29000c.left;
        }
        if (i11 != 8) {
            return 0;
        }
        return this.f29000c.left;
    }

    private int getMainOpenTop() {
        int i11 = this.f29014q;
        if (i11 == 1) {
            return this.f29000c.top;
        }
        if (i11 == 2) {
            return this.f29000c.top;
        }
        if (i11 == 4) {
            return this.f29000c.top + this.f28999b.getHeight();
        }
        if (i11 != 8) {
            return 0;
        }
        return this.f29000c.top - this.f28999b.getHeight();
    }

    private int getSecOpenLeft() {
        int i11;
        return (this.f29011n == 0 || (i11 = this.f29014q) == 8 || i11 == 4) ? this.f29002e.left : i11 == 1 ? this.f29002e.left + this.f28999b.getWidth() : this.f29002e.left - this.f28999b.getWidth();
    }

    private int getSecOpenTop() {
        int i11;
        return (this.f29011n == 0 || (i11 = this.f29014q) == 1 || i11 == 2) ? this.f29002e.top : i11 == 4 ? this.f29002e.top + this.f28999b.getHeight() : this.f29002e.top - this.f28999b.getHeight();
    }

    public void A(boolean animation) {
        this.f29005h = false;
        this.f29006i = false;
        if (animation) {
            this.f29010m = 1;
            ViewDragHelper viewDragHelper = this.f29015r;
            View view = this.f28998a;
            Rect rect = this.f29000c;
            viewDragHelper.smoothSlideViewTo(view, rect.left, rect.top);
            c cVar = this.f29017t;
            if (cVar != null) {
                cVar.a(this.f29010m);
            }
        } else {
            this.f29010m = 0;
            this.f29015r.abort();
            View view2 = this.f28998a;
            Rect rect2 = this.f29000c;
            view2.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
            View view3 = this.f28999b;
            Rect rect3 = this.f29002e;
            view3.layout(rect3.left, rect3.top, rect3.right, rect3.bottom);
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public final int B(int dp2) {
        return (int) (dp2 * (getContext().getResources().getDisplayMetrics().densityDpi / 160.0f));
    }

    public final void D(Context context, AttributeSet attrs) {
        if (attrs != null && context != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, R.styleable.SwipeRevealLayout, 0, 0);
            this.f29014q = obtainStyledAttributes.getInteger(0, 1);
            this.f29009l = obtainStyledAttributes.getInteger(1, 300);
            this.f29011n = obtainStyledAttributes.getInteger(3, 0);
            this.f29004g = obtainStyledAttributes.getDimensionPixelSize(2, B(1));
        }
        ViewDragHelper create = ViewDragHelper.create(this, 1.0f, this.f29022y);
        this.f29015r = create;
        create.setEdgeTrackingEnabled(15);
        this.f29016s = new GestureDetectorCompat(context, this.f29021x);
    }

    public final void E() {
        this.f29000c.set(this.f28998a.getLeft(), this.f28998a.getTop(), this.f28998a.getRight(), this.f28998a.getBottom());
        this.f29002e.set(this.f28999b.getLeft(), this.f28999b.getTop(), this.f28999b.getRight(), this.f28999b.getBottom());
        this.f29001d.set(getMainOpenLeft(), getMainOpenTop(), getMainOpenLeft() + this.f28998a.getWidth(), getMainOpenTop() + this.f28998a.getHeight());
        this.f29003f.set(getSecOpenLeft(), getSecOpenTop(), getSecOpenLeft() + this.f28999b.getWidth(), getSecOpenTop() + this.f28999b.getHeight());
    }

    public boolean F() {
        return this.f29010m == 0;
    }

    public boolean G() {
        return this.f29008k;
    }

    public boolean H() {
        return this.f29010m == 2;
    }

    public void I(boolean animation) {
        this.f29005h = true;
        this.f29006i = false;
        if (animation) {
            this.f29010m = 3;
            ViewDragHelper viewDragHelper = this.f29015r;
            View view = this.f28998a;
            Rect rect = this.f29001d;
            viewDragHelper.smoothSlideViewTo(view, rect.left, rect.top);
            c cVar = this.f29017t;
            if (cVar != null) {
                cVar.a(this.f29010m);
            }
        } else {
            this.f29010m = 2;
            this.f29015r.abort();
            View view2 = this.f28998a;
            Rect rect2 = this.f29001d;
            view2.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
            View view3 = this.f28999b;
            Rect rect3 = this.f29003f;
            view3.layout(rect3.left, rect3.top, rect3.right, rect3.bottom);
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public final int J(int px2) {
        return (int) (px2 / (getContext().getResources().getDisplayMetrics().densityDpi / 160.0f));
    }

    public boolean K() {
        return this.f29019v < 2;
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f29015r.continueSettling(true)) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public int getDragEdge() {
        return this.f29014q;
    }

    public int getMinFlingVelocity() {
        return this.f29009l;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() >= 2) {
            this.f28999b = getChildAt(0);
            this.f28998a = getChildAt(1);
        } else if (getChildCount() == 1) {
            this.f28998a = getChildAt(0);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev2) {
        if (this.f29020w.a(ev2)) {
            return false;
        }
        this.f29015r.processTouchEvent(ev2);
        this.f29016s.onTouchEvent(ev2);
        return (this.f29015r.getViewDragState() == 2) || (this.f29015r.getViewDragState() == 0 && this.f29007j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l11, int t11, int r11, int b11) {
        boolean z11;
        boolean z12;
        int min;
        int min2;
        int min3;
        int min4;
        int i11 = 0;
        this.f29006i = false;
        int i12 = 0;
        while (i12 < getChildCount()) {
            View childAt = getChildAt(i12);
            int paddingLeft = getPaddingLeft();
            int max = Math.max((r11 - getPaddingRight()) - l11, i11);
            int paddingTop = getPaddingTop();
            int max2 = Math.max((b11 - getPaddingBottom()) - t11, i11);
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredWidth = childAt.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams != null) {
                int i13 = layoutParams.height;
                z12 = i13 == -1 || i13 == -1;
                int i14 = layoutParams.width;
                z11 = i14 == -1 || i14 == -1;
            } else {
                z11 = false;
                z12 = false;
            }
            if (z12) {
                measuredHeight = max2 - paddingTop;
                layoutParams.height = measuredHeight;
            }
            if (z11) {
                measuredWidth = max - paddingLeft;
                layoutParams.width = measuredWidth;
            }
            int i15 = this.f29014q;
            if (i15 == 1) {
                min = Math.min(getPaddingLeft(), max);
                min2 = Math.min(getPaddingTop(), max2);
                min3 = Math.min(measuredWidth + getPaddingLeft(), max);
                min4 = Math.min(measuredHeight + getPaddingTop(), max2);
            } else if (i15 == 2) {
                min = Math.max(((r11 - measuredWidth) - getPaddingRight()) - l11, paddingLeft);
                min2 = Math.min(getPaddingTop(), max2);
                min3 = Math.max((r11 - getPaddingRight()) - l11, paddingLeft);
                min4 = Math.min(measuredHeight + getPaddingTop(), max2);
            } else if (i15 == 4) {
                min = Math.min(getPaddingLeft(), max);
                min2 = Math.min(getPaddingTop(), max2);
                min3 = Math.min(measuredWidth + getPaddingLeft(), max);
                min4 = Math.min(measuredHeight + getPaddingTop(), max2);
            } else if (i15 != 8) {
                min = 0;
                min2 = 0;
                min3 = 0;
                min4 = 0;
            } else {
                min = Math.min(getPaddingLeft(), max);
                min2 = Math.max(((b11 - measuredHeight) - getPaddingBottom()) - t11, paddingTop);
                min3 = Math.min(measuredWidth + getPaddingLeft(), max);
                min4 = Math.max((b11 - getPaddingBottom()) - t11, paddingTop);
            }
            childAt.layout(min, min2, min3, min4);
            i12++;
            i11 = 0;
        }
        if (this.f29011n == 1) {
            int i16 = this.f29014q;
            if (i16 == 1) {
                View view = this.f28999b;
                view.offsetLeftAndRight(-view.getWidth());
            } else if (i16 == 2) {
                View view2 = this.f28999b;
                view2.offsetLeftAndRight(view2.getWidth());
            } else if (i16 == 4) {
                View view3 = this.f28999b;
                view3.offsetTopAndBottom(-view3.getHeight());
            } else if (i16 == 8) {
                View view4 = this.f28999b;
                view4.offsetTopAndBottom(view4.getHeight());
            }
        }
        E();
        if (this.f29005h) {
            I(false);
        } else {
            A(false);
        }
        this.f29012o = this.f28998a.getLeft();
        this.f29013p = this.f28998a.getTop();
        this.f29019v++;
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (getChildCount() < 2) {
            throw new RuntimeException("Layout must have two children");
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            measureChild(childAt, widthMeasureSpec, heightMeasureSpec);
            i11 = Math.max(childAt.getMeasuredWidth(), i11);
            i12 = Math.max(childAt.getMeasuredHeight(), i12);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, mode);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, mode2);
        int size = View.MeasureSpec.getSize(makeMeasureSpec);
        int size2 = View.MeasureSpec.getSize(makeMeasureSpec2);
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt2 = getChildAt(i14);
            ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
            if (layoutParams2 != null) {
                if (layoutParams2.height == -1) {
                    childAt2.setMinimumHeight(size2);
                }
                if (layoutParams2.width == -1) {
                    childAt2.setMinimumWidth(size);
                }
            }
            measureChild(childAt2, makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(childAt2.getMeasuredWidth(), i11);
            i12 = Math.max(childAt2.getMeasuredHeight(), i12);
        }
        int paddingLeft = i11 + getPaddingLeft() + getPaddingRight();
        int paddingTop = i12 + getPaddingTop() + getPaddingBottom();
        if (mode != 1073741824) {
            if (layoutParams.width == -1) {
                paddingLeft = size;
            }
            if (mode != Integer.MIN_VALUE || paddingLeft <= size) {
                size = paddingLeft;
            }
        }
        if (mode2 != 1073741824) {
            if (layoutParams.height == -1) {
                paddingTop = size2;
            }
            if (mode2 != Integer.MIN_VALUE || paddingTop <= size2) {
                size2 = paddingTop;
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        this.f29016s.onTouchEvent(event);
        this.f29015r.processTouchEvent(event);
        return true;
    }

    public void setDragEdge(int dragEdge) {
        this.f29014q = dragEdge;
    }

    public void setDragListener(c listener) {
        this.f29017t = listener;
    }

    public void setDragStateChangeListener(c listener) {
        this.f29017t = listener;
    }

    public void setLockDrag(boolean lock) {
        this.f29008k = lock;
    }

    public void setMinFlingVelocity(int velocity) {
        this.f29009l = velocity;
    }

    public void setSwipeListener(e listener) {
        this.f29018u = listener;
    }

    public void z() {
        this.f29006i = true;
        this.f29015r.abort();
    }

    public SwipeRevealLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f29000c = new Rect();
        this.f29001d = new Rect();
        this.f29002e = new Rect();
        this.f29003f = new Rect();
        this.f29004g = 0;
        this.f29005h = false;
        this.f29006i = false;
        this.f29007j = false;
        this.f29008k = false;
        this.f29009l = 300;
        this.f29010m = 0;
        this.f29011n = 0;
        this.f29012o = 0;
        this.f29013p = 0;
        this.f29014q = 1;
        this.f29019v = 0;
        this.f29020w = new il.a();
        this.f29021x = new a();
        this.f29022y = new b();
        D(context, attrs);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d implements e {
        @Override // com.chauthai.swipereveallayout.SwipeRevealLayout.e
        public void a(SwipeRevealLayout view) {
        }

        @Override // com.chauthai.swipereveallayout.SwipeRevealLayout.e
        public void c(SwipeRevealLayout view) {
        }

        @Override // com.chauthai.swipereveallayout.SwipeRevealLayout.e
        public void b(SwipeRevealLayout view, float slideOffset) {
        }
    }

    public SwipeRevealLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f29000c = new Rect();
        this.f29001d = new Rect();
        this.f29002e = new Rect();
        this.f29003f = new Rect();
        this.f29004g = 0;
        this.f29005h = false;
        this.f29006i = false;
        this.f29007j = false;
        this.f29008k = false;
        this.f29009l = 300;
        this.f29010m = 0;
        this.f29011n = 0;
        this.f29012o = 0;
        this.f29013p = 0;
        this.f29014q = 1;
        this.f29019v = 0;
        this.f29020w = new il.a();
        this.f29021x = new a();
        this.f29022y = new b();
    }
}
