package com.jeremyfeinstein.slidingmenu.lib;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.VelocityTrackerCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class CustomViewAbove extends ViewGroup {
    public static final String A = "CustomViewAbove";
    public static final boolean B = false;
    public static final boolean C = false;
    public static final int D = 600;
    public static final int E = 25;
    public static final Interpolator F = new a();
    public static final int G = -1;

    /* renamed from: a, reason: collision with root package name */
    public View f38814a;

    /* renamed from: b, reason: collision with root package name */
    public int f38815b;

    /* renamed from: c, reason: collision with root package name */
    public Scroller f38816c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f38817d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f38818e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f38819f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f38820g;

    /* renamed from: h, reason: collision with root package name */
    public int f38821h;

    /* renamed from: i, reason: collision with root package name */
    public float f38822i;

    /* renamed from: j, reason: collision with root package name */
    public float f38823j;

    /* renamed from: k, reason: collision with root package name */
    public float f38824k;

    /* renamed from: l, reason: collision with root package name */
    public int f38825l;

    /* renamed from: m, reason: collision with root package name */
    public VelocityTracker f38826m;

    /* renamed from: n, reason: collision with root package name */
    public int f38827n;

    /* renamed from: o, reason: collision with root package name */
    public int f38828o;

    /* renamed from: p, reason: collision with root package name */
    public int f38829p;

    /* renamed from: q, reason: collision with root package name */
    public CustomViewBehind f38830q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f38831r;

    /* renamed from: s, reason: collision with root package name */
    public c f38832s;

    /* renamed from: t, reason: collision with root package name */
    public c f38833t;

    /* renamed from: u, reason: collision with root package name */
    public SlidingMenu.e f38834u;

    /* renamed from: v, reason: collision with root package name */
    public SlidingMenu.g f38835v;

    /* renamed from: w, reason: collision with root package name */
    public List<View> f38836w;

    /* renamed from: x, reason: collision with root package name */
    public int f38837x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f38838y;

    /* renamed from: z, reason: collision with root package name */
    public float f38839z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float t11) {
            float f11 = t11 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends d {
        public b() {
        }

        @Override // com.jeremyfeinstein.slidingmenu.lib.CustomViewAbove.d, com.jeremyfeinstein.slidingmenu.lib.CustomViewAbove.c
        public void onPageSelected(int position) {
            if (CustomViewAbove.this.f38830q != null) {
                if (position != 0) {
                    if (position == 1) {
                        CustomViewAbove.this.f38830q.setChildrenEnabled(false);
                        return;
                    } else if (position != 2) {
                        return;
                    }
                }
                CustomViewAbove.this.f38830q.setChildrenEnabled(true);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void onPageScrolled(int position, float positionOffset, int positionOffsetPixels);

        void onPageSelected(int position);
    }

    public CustomViewAbove(Context context) {
        this(context, null);
    }

    private int getLeftBound() {
        return this.f38830q.d(this.f38814a);
    }

    private int getRightBound() {
        return this.f38830q.e(this.f38814a);
    }

    private void setScrollingCacheEnabled(boolean enabled) {
        if (this.f38817d != enabled) {
            this.f38817d = enabled;
        }
    }

    public void A(int item, boolean smoothScroll, boolean always, int velocity) {
        c cVar;
        c cVar2;
        if (!always && this.f38815b == item) {
            setScrollingCacheEnabled(false);
            return;
        }
        int g11 = this.f38830q.g(item);
        boolean z11 = this.f38815b != g11;
        this.f38815b = g11;
        int m11 = m(g11);
        if (z11 && (cVar2 = this.f38832s) != null) {
            cVar2.onPageSelected(g11);
        }
        if (z11 && (cVar = this.f38833t) != null) {
            cVar.onPageSelected(g11);
        }
        if (smoothScroll) {
            D(m11, 0, velocity);
        } else {
            f();
            scrollTo(m11, 0);
        }
    }

    public c B(c listener) {
        c cVar = this.f38833t;
        this.f38833t = listener;
        return cVar;
    }

    public void C(int x11, int y11) {
        D(x11, y11, 0);
    }

    public void D(int x11, int y11, int velocity) {
        int i11;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int i12 = x11 - scrollX;
        int i13 = y11 - scrollY;
        if (i12 == 0 && i13 == 0) {
            f();
            if (q()) {
                SlidingMenu.g gVar = this.f38835v;
                if (gVar != null) {
                    gVar.a();
                    return;
                }
                return;
            }
            SlidingMenu.e eVar = this.f38834u;
            if (eVar != null) {
                eVar.e();
                return;
            }
            return;
        }
        setScrollingCacheEnabled(true);
        this.f38818e = true;
        int behindWidth = getBehindWidth();
        float f11 = behindWidth / 2;
        float i14 = f11 + (i(Math.min(1.0f, (Math.abs(i12) * 1.0f) / behindWidth)) * f11);
        int abs = Math.abs(velocity);
        if (abs > 0) {
            i11 = Math.round(Math.abs(i14 / abs) * 1000.0f) * 4;
        } else {
            Math.abs(i12);
            i11 = 600;
        }
        this.f38816c.startScroll(scrollX, scrollY, i12, i13, Math.min(i11, 600));
        invalidate();
    }

    public final void E() {
        this.f38819f = true;
        this.f38838y = false;
    }

    public final boolean F(float dx2) {
        return q() ? this.f38830q.j(dx2) : this.f38830q.i(dx2);
    }

    public final boolean G(MotionEvent ev2) {
        int x11 = (int) (ev2.getX() + this.f38839z);
        if (q()) {
            return this.f38830q.k(this.f38814a, this.f38815b, x11);
        }
        int i11 = this.f38837x;
        if (i11 == 0) {
            return this.f38830q.h(this.f38814a, x11);
        }
        if (i11 != 1) {
            return false;
        }
        return !p(ev2);
    }

    public void b(View v11) {
        if (this.f38836w.contains(v11)) {
            return;
        }
        this.f38836w.add(v11);
    }

    public boolean c(int direction) {
        boolean u11;
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, direction);
        if (findNextFocus == null || findNextFocus == findFocus) {
            if (direction == 17 || direction == 1) {
                u11 = u();
            } else {
                if (direction == 66 || direction == 2) {
                    u11 = v();
                }
                u11 = false;
            }
        } else if (direction == 17) {
            u11 = findNextFocus.requestFocus();
        } else {
            if (direction == 66) {
                u11 = (findFocus == null || findNextFocus.getLeft() > findFocus.getLeft()) ? findNextFocus.requestFocus() : v();
            }
            u11 = false;
        }
        if (u11) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(direction));
        }
        return u11;
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f38816c.isFinished() || !this.f38816c.computeScrollOffset()) {
            f();
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f38816c.getCurrX();
        int currY = this.f38816c.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            w(currX);
        }
        invalidate();
    }

    public boolean d(View v11, boolean checkV, int dx2, int x11, int y11) {
        int i11;
        if (v11 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v11;
            int scrollX = v11.getScrollX();
            int scrollY = v11.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i12 = x11 + scrollX;
                if (i12 >= childAt.getLeft() && i12 < childAt.getRight() && (i11 = y11 + scrollY) >= childAt.getTop() && i11 < childAt.getBottom() && d(childAt, true, dx2, i12 - childAt.getLeft(), i11 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return checkV && ViewCompat.canScrollHorizontally(v11, -dx2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f38830q.c(this.f38814a, canvas);
        this.f38830q.a(this.f38814a, canvas, getPercentOpen());
        this.f38830q.b(this.f38814a, canvas, getPercentOpen());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        return super.dispatchKeyEvent(event) || k(event);
    }

    public void e() {
        this.f38836w.clear();
    }

    public final void f() {
        if (this.f38818e) {
            setScrollingCacheEnabled(false);
            this.f38816c.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f38816c.getCurrX();
            int currY = this.f38816c.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
            }
            if (q()) {
                SlidingMenu.g gVar = this.f38835v;
                if (gVar != null) {
                    gVar.a();
                }
            } else {
                SlidingMenu.e eVar = this.f38834u;
                if (eVar != null) {
                    eVar.e();
                }
            }
        }
        this.f38818e = false;
    }

    public final void g(MotionEvent ev2) {
        int i11 = this.f38825l;
        int n11 = n(ev2, i11);
        if (i11 == -1 || n11 == -1) {
            return;
        }
        float x11 = MotionEventCompat.getX(ev2, n11);
        float f11 = x11 - this.f38823j;
        float abs = Math.abs(f11);
        float y11 = MotionEventCompat.getY(ev2, n11);
        float abs2 = Math.abs(y11 - this.f38824k);
        if (abs <= (q() ? this.f38821h / 2 : this.f38821h) || abs <= abs2 || !F(f11)) {
            if (abs > this.f38821h) {
                this.f38820g = true;
            }
        } else {
            E();
            this.f38823j = x11;
            this.f38824k = y11;
            setScrollingCacheEnabled(true);
        }
    }

    public int getBehindWidth() {
        CustomViewBehind customViewBehind = this.f38830q;
        if (customViewBehind == null) {
            return 0;
        }
        return customViewBehind.getBehindWidth();
    }

    public View getContent() {
        return this.f38814a;
    }

    public int getContentLeft() {
        return this.f38814a.getLeft() + this.f38814a.getPaddingLeft();
    }

    public int getCurrentItem() {
        return this.f38815b;
    }

    public float getPercentOpen() {
        return Math.abs(this.f38839z - this.f38814a.getLeft()) / getBehindWidth();
    }

    public int getTouchMode() {
        return this.f38837x;
    }

    public final int h(float pageOffset, int velocity, int deltaX) {
        int i11 = this.f38815b;
        return (Math.abs(deltaX) <= this.f38829p || Math.abs(velocity) <= this.f38827n) ? Math.round(this.f38815b + pageOffset) : (velocity <= 0 || deltaX <= 0) ? (velocity >= 0 || deltaX >= 0) ? i11 : i11 + 1 : i11 - 1;
    }

    public float i(float f11) {
        return (float) Math.sin((float) ((f11 - 0.5f) * 0.4712389167638204d));
    }

    public final void j() {
        this.f38838y = false;
        this.f38819f = false;
        this.f38820g = false;
        this.f38825l = -1;
        VelocityTracker velocityTracker = this.f38826m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f38826m = null;
        }
    }

    public boolean k(KeyEvent event) {
        if (event.getAction() != 0) {
            return false;
        }
        int keyCode = event.getKeyCode();
        if (keyCode == 21) {
            return c(17);
        }
        if (keyCode == 22) {
            return c(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (event.hasNoModifiers()) {
            return c(2);
        }
        if (event.hasModifiers(1)) {
            return c(1);
        }
        return false;
    }

    public int l(int i11) {
        if (i11 == 0) {
            return getBehindWidth();
        }
        if (i11 != 1) {
            return 0;
        }
        return this.f38814a.getWidth();
    }

    public int m(int page) {
        if (page != 0) {
            if (page == 1) {
                return this.f38814a.getLeft();
            }
            if (page != 2) {
                return 0;
            }
        }
        return this.f38830q.f(this.f38814a, page);
    }

    public final int n(MotionEvent ev2, int id2) {
        int findPointerIndex = MotionEventCompat.findPointerIndex(ev2, id2);
        if (findPointerIndex == -1) {
            this.f38825l = -1;
        }
        return findPointerIndex;
    }

    public void o() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f38816c = new Scroller(context, F);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f38821h = ViewConfigurationCompat.getScaledPagingTouchSlop(viewConfiguration);
        this.f38827n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f38828o = viewConfiguration.getScaledMaximumFlingVelocity();
        B(new b());
        this.f38829p = (int) (context.getResources().getDisplayMetrics().density * 25.0f);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev2) {
        if (!this.f38831r) {
            return false;
        }
        int action = ev2.getAction() & 255;
        if (action == 3 || action == 1 || (action != 0 && this.f38820g)) {
            j();
            return false;
        }
        if (action == 0) {
            int actionIndex = MotionEventCompat.getActionIndex(ev2);
            int pointerId = MotionEventCompat.getPointerId(ev2, actionIndex);
            this.f38825l = pointerId;
            if (pointerId != -1) {
                float x11 = MotionEventCompat.getX(ev2, actionIndex);
                this.f38822i = x11;
                this.f38823j = x11;
                this.f38824k = MotionEventCompat.getY(ev2, actionIndex);
                if (G(ev2)) {
                    this.f38819f = false;
                    this.f38820g = false;
                    if (q() && this.f38830q.l(this.f38814a, this.f38815b, ev2.getX() + this.f38839z)) {
                        this.f38838y = true;
                    }
                } else {
                    this.f38820g = true;
                }
            }
        } else if (action == 2) {
            g(ev2);
        } else if (action == 6) {
            t(ev2);
        }
        if (!this.f38819f) {
            if (this.f38826m == null) {
                this.f38826m = VelocityTracker.obtain();
            }
            this.f38826m.addMovement(ev2);
        }
        return this.f38819f || this.f38838y;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l11, int t11, int r11, int b11) {
        this.f38814a.layout(0, 0, r11 - l11, b11 - t11);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int defaultSize = View.getDefaultSize(0, widthMeasureSpec);
        int defaultSize2 = View.getDefaultSize(0, heightMeasureSpec);
        setMeasuredDimension(defaultSize, defaultSize2);
        this.f38814a.measure(ViewGroup.getChildMeasureSpec(widthMeasureSpec, 0, defaultSize), ViewGroup.getChildMeasureSpec(heightMeasureSpec, 0, defaultSize2));
    }

    @Override // android.view.View
    public void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        super.onSizeChanged(w11, h11, oldw, oldh);
        if (w11 != oldw) {
            f();
            scrollTo(m(this.f38815b), getScrollY());
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent ev2) {
        if (!this.f38831r) {
            return false;
        }
        if (!this.f38819f && !G(ev2)) {
            return false;
        }
        int action = ev2.getAction();
        if (this.f38826m == null) {
            this.f38826m = VelocityTracker.obtain();
        }
        this.f38826m.addMovement(ev2);
        int i11 = action & 255;
        if (i11 == 0) {
            f();
            this.f38825l = MotionEventCompat.getPointerId(ev2, MotionEventCompat.getActionIndex(ev2));
            float x11 = ev2.getX();
            this.f38822i = x11;
            this.f38823j = x11;
        } else if (i11 != 1) {
            if (i11 == 2) {
                if (!this.f38819f) {
                    g(ev2);
                    if (this.f38820g) {
                        return false;
                    }
                }
                if (this.f38819f) {
                    int n11 = n(ev2, this.f38825l);
                    if (this.f38825l != -1) {
                        float x12 = MotionEventCompat.getX(ev2, n11);
                        float f11 = this.f38823j - x12;
                        this.f38823j = x12;
                        float scrollX = getScrollX() + f11;
                        float leftBound = getLeftBound();
                        float rightBound = getRightBound();
                        if (scrollX < leftBound) {
                            scrollX = leftBound;
                        } else if (scrollX > rightBound) {
                            scrollX = rightBound;
                        }
                        int i12 = (int) scrollX;
                        this.f38823j += scrollX - i12;
                        scrollTo(i12, getScrollY());
                        w(i12);
                    }
                }
            } else if (i11 != 3) {
                if (i11 == 5) {
                    int actionIndex = MotionEventCompat.getActionIndex(ev2);
                    this.f38823j = MotionEventCompat.getX(ev2, actionIndex);
                    this.f38825l = MotionEventCompat.getPointerId(ev2, actionIndex);
                } else if (i11 == 6) {
                    t(ev2);
                    int n12 = n(ev2, this.f38825l);
                    if (this.f38825l != -1) {
                        this.f38823j = MotionEventCompat.getX(ev2, n12);
                    }
                }
            } else if (this.f38819f) {
                z(this.f38815b, true, true);
                this.f38825l = -1;
                j();
            }
        } else if (this.f38819f) {
            VelocityTracker velocityTracker = this.f38826m;
            velocityTracker.computeCurrentVelocity(1000, this.f38828o);
            int xVelocity = (int) VelocityTrackerCompat.getXVelocity(velocityTracker, this.f38825l);
            float scrollX2 = (getScrollX() - m(this.f38815b)) / getBehindWidth();
            int n13 = n(ev2, this.f38825l);
            if (this.f38825l != -1) {
                A(h(scrollX2, xVelocity, (int) (MotionEventCompat.getX(ev2, n13) - this.f38822i)), true, true, xVelocity);
            } else {
                A(this.f38815b, true, true, xVelocity);
            }
            this.f38825l = -1;
            j();
        } else if (this.f38838y && this.f38830q.l(this.f38814a, this.f38815b, ev2.getX() + this.f38839z)) {
            setCurrentItem(1);
            j();
        }
        return true;
    }

    public final boolean p(MotionEvent ev2) {
        Rect rect = new Rect();
        Iterator<View> it = this.f38836w.iterator();
        while (it.hasNext()) {
            it.next().getHitRect(rect);
            if (rect.contains((int) ev2.getX(), (int) ev2.getY())) {
                return true;
            }
        }
        return false;
    }

    public boolean q() {
        int i11 = this.f38815b;
        return i11 == 0 || i11 == 2;
    }

    public boolean r() {
        return this.f38831r;
    }

    public void s(int position, float offset, int offsetPixels) {
        c cVar = this.f38832s;
        if (cVar != null) {
            cVar.onPageScrolled(position, offset, offsetPixels);
        }
        c cVar2 = this.f38833t;
        if (cVar2 != null) {
            cVar2.onPageScrolled(position, offset, offsetPixels);
        }
    }

    @Override // android.view.View
    public void scrollTo(int x11, int y11) {
        super.scrollTo(x11, y11);
        this.f38839z = x11;
        this.f38830q.m(this.f38814a, x11, y11);
        ((SlidingMenu) getParent()).k(getPercentOpen());
    }

    public void setAboveOffset(int i11) {
        View view = this.f38814a;
        view.setPadding(i11, view.getPaddingTop(), this.f38814a.getPaddingRight(), this.f38814a.getPaddingBottom());
    }

    public void setContent(View v11) {
        View view = this.f38814a;
        if (view != null) {
            removeView(view);
        }
        this.f38814a = v11;
        addView(v11);
    }

    public void setCurrentItem(int item) {
        z(item, true, false);
    }

    public void setCustomViewBehind(CustomViewBehind cvb) {
        this.f38830q = cvb;
    }

    public void setOnClosedListener(SlidingMenu.e l11) {
        this.f38834u = l11;
    }

    public void setOnOpenedListener(SlidingMenu.g l11) {
        this.f38835v = l11;
    }

    public void setOnPageChangeListener(c listener) {
        this.f38832s = listener;
    }

    public void setSlidingEnabled(boolean b11) {
        this.f38831r = b11;
    }

    public void setTouchMode(int i11) {
        this.f38837x = i11;
    }

    public final void t(MotionEvent ev2) {
        int actionIndex = MotionEventCompat.getActionIndex(ev2);
        if (MotionEventCompat.getPointerId(ev2, actionIndex) == this.f38825l) {
            int i11 = actionIndex == 0 ? 1 : 0;
            this.f38823j = MotionEventCompat.getX(ev2, i11);
            this.f38825l = MotionEventCompat.getPointerId(ev2, i11);
            VelocityTracker velocityTracker = this.f38826m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean u() {
        int i11 = this.f38815b;
        if (i11 <= 0) {
            return false;
        }
        y(i11 - 1, true);
        return true;
    }

    public boolean v() {
        int i11 = this.f38815b;
        if (i11 >= 1) {
            return false;
        }
        y(i11 + 1, true);
        return true;
    }

    public final void w(int xpos) {
        int width = getWidth();
        int i11 = xpos / width;
        int i12 = xpos % width;
        s(i11, i12 / width, i12);
    }

    public void x(View v11) {
        this.f38836w.remove(v11);
    }

    public void y(int item, boolean smoothScroll) {
        z(item, smoothScroll, false);
    }

    public void z(int item, boolean smoothScroll, boolean always) {
        A(item, smoothScroll, always, 0);
    }

    public CustomViewAbove(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f38825l = -1;
        this.f38831r = true;
        this.f38836w = new ArrayList();
        this.f38837x = 0;
        this.f38838y = false;
        this.f38839z = 0.0f;
        o();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d implements c {
        public void a(int state) {
        }

        @Override // com.jeremyfeinstein.slidingmenu.lib.CustomViewAbove.c
        public void onPageSelected(int position) {
        }

        @Override // com.jeremyfeinstein.slidingmenu.lib.CustomViewAbove.c
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }
    }
}
