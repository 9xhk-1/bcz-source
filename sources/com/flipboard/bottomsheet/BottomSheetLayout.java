package com.flipboard.bottomsheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import flipboard.bottomsheet.R;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class BottomSheetLayout extends FrameLayout {
    public static final Property<BottomSheetLayout, Float> I = new a(Float.class, "sheetTranslation");
    public static final long J = 300;
    public final boolean A;
    public final int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public float G;
    public State H;

    /* renamed from: a, reason: collision with root package name */
    public Runnable f29477a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f29478b;

    /* renamed from: c, reason: collision with root package name */
    public State f29479c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f29480d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f29481e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f29482f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f29483g;

    /* renamed from: h, reason: collision with root package name */
    public float f29484h;

    /* renamed from: i, reason: collision with root package name */
    public VelocityTracker f29485i;

    /* renamed from: j, reason: collision with root package name */
    public float f29486j;

    /* renamed from: k, reason: collision with root package name */
    public float f29487k;

    /* renamed from: l, reason: collision with root package name */
    public ql.d f29488l;

    /* renamed from: m, reason: collision with root package name */
    public ql.d f29489m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f29490n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f29491o;

    /* renamed from: p, reason: collision with root package name */
    public Animator f29492p;

    /* renamed from: q, reason: collision with root package name */
    public CopyOnWriteArraySet<ql.b> f29493q;

    /* renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArraySet<ql.c> f29494r;

    /* renamed from: s, reason: collision with root package name */
    public CopyOnWriteArraySet<j> f29495s;

    /* renamed from: t, reason: collision with root package name */
    public View.OnLayoutChangeListener f29496t;

    /* renamed from: u, reason: collision with root package name */
    public View f29497u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f29498v;

    /* renamed from: w, reason: collision with root package name */
    public int f29499w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f29500x;

    /* renamed from: y, reason: collision with root package name */
    public float f29501y;

    /* renamed from: z, reason: collision with root package name */
    public int f29502z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum State {
        HIDDEN,
        PREPARING,
        PEEKED,
        EXPANDED
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends Property<BottomSheetLayout, Float> {
        public a(Class type, String name) {
            super(type, name);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(BottomSheetLayout object) {
            return Float.valueOf(object.f29484h);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(BottomSheetLayout object, Float value) {
            object.setSheetTranslation(value.floatValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends h {
        public b() {
            super(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animation) {
            if (this.f29513a) {
                return;
            }
            BottomSheetLayout.this.f29492p = null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends h {
        public c() {
            super(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animation) {
            if (this.f29513a) {
                return;
            }
            BottomSheetLayout.this.f29492p = null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f29505a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ql.d f29506b;

        public d(final View val$sheetView, final ql.d val$viewTransformer) {
            this.f29505a = val$sheetView;
            this.f29506b = val$viewTransformer;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetLayout.this.M(this.f29505a, this.f29506b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements ViewTreeObserver.OnPreDrawListener {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BottomSheetLayout.this.getSheetView() != null) {
                    BottomSheetLayout.this.F();
                }
            }
        }

        public e() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            BottomSheetLayout.this.getViewTreeObserver().removeOnPreDrawListener(this);
            BottomSheetLayout.this.post(new a());
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements View.OnLayoutChangeListener {
        public f() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View sheetView, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            int measuredHeight = sheetView.getMeasuredHeight();
            if (BottomSheetLayout.this.f29479c != State.HIDDEN && measuredHeight < BottomSheetLayout.this.f29499w) {
                if (BottomSheetLayout.this.f29479c == State.EXPANDED) {
                    BottomSheetLayout.this.setState(State.PEEKED);
                }
                BottomSheetLayout.this.setSheetTranslation(measuredHeight);
            }
            BottomSheetLayout.this.f29499w = measuredHeight;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g extends h {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f29511b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(final View val$sheetView) {
            super(null);
            this.f29511b = val$sheetView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            if (this.f29513a) {
                return;
            }
            BottomSheetLayout.this.f29492p = null;
            BottomSheetLayout.this.setState(State.HIDDEN);
            BottomSheetLayout.this.setSheetLayerTypeIfEnabled(0);
            BottomSheetLayout.this.removeView(this.f29511b);
            Iterator it = BottomSheetLayout.this.f29493q.iterator();
            while (it.hasNext()) {
                ((ql.b) it.next()).a(BottomSheetLayout.this);
            }
            BottomSheetLayout.this.f29489m = null;
            BottomSheetLayout.this.f29493q.clear();
            BottomSheetLayout.this.f29494r.clear();
            BottomSheetLayout.this.f29495s.clear();
            if (BottomSheetLayout.this.f29477a != null) {
                BottomSheetLayout.this.f29477a.run();
                BottomSheetLayout.this.f29477a = null;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public boolean f29513a;

        public h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            this.f29513a = true;
        }

        public /* synthetic */ h(a aVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class i extends ql.a {
        public i() {
        }

        public /* synthetic */ i(a aVar) {
            this();
        }

        @Override // ql.d
        public void b(float translation, float maxTranslation, float peekedTranslation, BottomSheetLayout parent, View view) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface j {
        void a(State state);
    }

    public BottomSheetLayout(Context context) {
        super(context);
        this.f29478b = new Rect();
        this.f29479c = State.HIDDEN;
        this.f29480d = false;
        this.f29481e = new DecelerateInterpolator(1.6f);
        this.f29488l = new i(null);
        this.f29490n = true;
        this.f29491o = true;
        this.f29493q = new CopyOnWriteArraySet<>();
        this.f29494r = new CopyOnWriteArraySet<>();
        this.f29495s = new CopyOnWriteArraySet<>();
        this.f29498v = true;
        this.f29502z = 0;
        this.A = getResources().getBoolean(R.bool.bottomsheet_is_tablet);
        this.B = getResources().getDimensionPixelSize(R.dimen.bottomsheet_default_sheet_width);
        this.C = 0;
        this.D = 0;
        z();
    }

    public static boolean D(Context context) {
        return context.getResources().getBoolean(R.bool.bottomsheet_is_tablet);
    }

    public static int G(Context context) {
        return D(context) ? context.getResources().getDimensionPixelSize(R.dimen.bottomsheet_default_sheet_width) : context.getResources().getDisplayMetrics().widthPixels;
    }

    private float getDefaultPeekTranslation() {
        return y() ? getHeight() / 3 : getSheetView().getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSheetLayerTypeIfEnabled(int layerType) {
        if (this.f29491o) {
            getSheetView().setLayerType(layerType, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSheetTranslation(float newTranslation) {
        this.f29484h = Math.min(newTranslation, getMaxSheetTranslation());
        this.f29478b.set(0, 0, getWidth(), (int) (getHeight() - Math.ceil(this.f29484h)));
        getSheetView().setTranslationY(getHeight() - this.f29484h);
        N(this.f29484h);
        if (this.f29490n) {
            float x11 = x(this.f29484h);
            this.f29497u.setAlpha(x11);
            this.f29497u.setVisibility(x11 <= 0.0f ? 4 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(State state) {
        if (state != this.f29479c) {
            this.f29479c = state;
            Iterator<j> it = this.f29495s.iterator();
            while (it.hasNext()) {
                it.next().a(state);
            }
        }
    }

    public static <T> T t(T value, String message) {
        if (value != null) {
            return value;
        }
        throw new NullPointerException(message);
    }

    public final void A() {
        this.f29484h = 0.0f;
        this.f29478b.set(0, 0, getWidth(), getHeight());
        getSheetView().setTranslationY(getHeight());
        this.f29497u.setAlpha(0.0f);
        this.f29497u.setVisibility(4);
    }

    public final boolean B() {
        return this.f29492p != null;
    }

    public boolean C() {
        return this.f29479c != State.HIDDEN;
    }

    public final boolean E(float x11) {
        if (this.A) {
            return x11 >= ((float) this.C) && x11 <= ((float) this.D);
        }
        return true;
    }

    public void F() {
        s();
        setSheetLayerTypeIfEnabled(2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, I, getPeekSheetTranslation());
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(this.f29481e);
        ofFloat.addListener(new c());
        ofFloat.start();
        this.f29492p = ofFloat;
        setState(State.PEEKED);
    }

    public void H(@NonNull ql.b onSheetDismissedListener) {
        t(onSheetDismissedListener, "onSheetDismissedListener == null");
        this.f29493q.remove(onSheetDismissedListener);
    }

    public void I(@NonNull ql.c onSheetListener) {
        t(onSheetListener, "onSheetListener == null");
        this.f29494r.remove(onSheetListener);
    }

    public void J(@NonNull j onSheetStateChangeListener) {
        t(onSheetStateChangeListener, "onSheetStateChangeListener == null");
        this.f29495s.remove(onSheetStateChangeListener);
    }

    public boolean K() {
        return this.f29490n;
    }

    public void L(View sheetView) {
        M(sheetView, null);
    }

    public void M(final View sheetView, final ql.d viewTransformer) {
        if (this.f29479c != State.HIDDEN) {
            v(new d(sheetView, viewTransformer));
            return;
        }
        setState(State.PREPARING);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) sheetView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(this.A ? -2 : -1, -2, 1);
        }
        if (this.A && layoutParams.width == -2) {
            if (layoutParams.gravity == -1) {
                layoutParams.gravity = 1;
            }
            int i11 = this.B;
            layoutParams.width = i11;
            int i12 = this.f29502z;
            int i13 = (i12 - i11) / 2;
            this.C = i13;
            this.D = i12 - i13;
        }
        super.addView(sheetView, -1, layoutParams);
        A();
        this.f29489m = viewTransformer;
        getViewTreeObserver().addOnPreDrawListener(new e());
        this.f29499w = sheetView.getMeasuredHeight();
        f fVar = new f();
        this.f29496t = fVar;
        sheetView.addOnLayoutChangeListener(fVar);
    }

    public final void N(float sheetTranslation) {
        ql.d dVar = this.f29489m;
        if (dVar != null) {
            dVar.b(sheetTranslation, getMaxSheetTranslation(), getPeekSheetTranslation(), this, getContentView());
            return;
        }
        ql.d dVar2 = this.f29488l;
        if (dVar2 != null) {
            dVar2.b(sheetTranslation, getMaxSheetTranslation(), getPeekSheetTranslation(), this, getContentView());
        }
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View child) {
        if (getChildCount() > 0) {
            throw new IllegalArgumentException("You may not declare more then one child of bottom sheet. The sheet view must be added dynamically with showWithSheetView()");
        }
        setContentView(child);
    }

    public View getContentView() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    public boolean getInterceptContentTouch() {
        return this.f29498v;
    }

    public float getMaxSheetTranslation() {
        return y() ? getHeight() - getPaddingTop() : getSheetView().getHeight();
    }

    public boolean getPeekOnDismiss() {
        return this.f29480d;
    }

    public float getPeekSheetTranslation() {
        float f11 = this.f29501y;
        return f11 == 0.0f ? getDefaultPeekTranslation() : f11;
    }

    public View getSheetView() {
        if (getChildCount() > 2) {
            return getChildAt(2);
        }
        return null;
    }

    public State getState() {
        return this.f29479c;
    }

    public void o(@NonNull ql.b onSheetDismissedListener) {
        t(onSheetDismissedListener, "onSheetDismissedListener == null");
        this.f29493q.add(onSheetDismissedListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29485i = VelocityTracker.obtain();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29485i.clear();
        s();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NonNull MotionEvent ev2) {
        boolean z11 = ev2.getActionMasked() == 0;
        if (z11) {
            this.f29500x = false;
        }
        if (this.f29498v || (ev2.getY() > getHeight() - this.f29484h && E(ev2.getX()))) {
            this.f29500x = z11 && C();
        } else {
            this.f29500x = false;
        }
        return this.f29500x;
    }

    @Override // android.view.View
    public boolean onKeyPreIme(int keyCode, @NonNull KeyEvent event) {
        if (keyCode == 4 && C()) {
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(event, this);
                }
                return true;
            }
            if (event.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(event);
                }
                if (C() && event.isTracking() && !event.isCanceled()) {
                    if (this.f29479c == State.EXPANDED && this.f29480d) {
                        F();
                    } else {
                        u();
                    }
                    return true;
                }
            }
        }
        return super.onKeyPreIme(keyCode, event);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.f29478b.set(0, 0, getWidth(), (int) (getHeight() - Math.ceil(this.f29484h)));
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent event) {
        if (!C() || B()) {
            return false;
        }
        if (!this.f29500x) {
            return onInterceptTouchEvent(event);
        }
        if (event.getAction() == 0) {
            this.f29482f = false;
            this.f29483g = false;
            this.E = event.getY();
            this.F = event.getX();
            this.G = this.f29484h;
            this.H = this.f29479c;
            this.f29485i.clear();
        }
        this.f29485i.addMovement(event);
        float maxSheetTranslation = getMaxSheetTranslation();
        float peekSheetTranslation = getPeekSheetTranslation();
        float y11 = this.E - event.getY();
        float x11 = this.F - event.getX();
        if (!this.f29482f && !this.f29483g) {
            this.f29482f = Math.abs(y11) > this.f29487k;
            this.f29483g = Math.abs(x11) > this.f29487k;
            if (this.f29482f) {
                if (this.f29479c == State.PEEKED) {
                    MotionEvent obtain = MotionEvent.obtain(event);
                    obtain.offsetLocation(0.0f, this.f29484h - getHeight());
                    obtain.setAction(3);
                    getSheetView().dispatchTouchEvent(obtain);
                    obtain.recycle();
                }
                this.f29483g = false;
                this.E = event.getY();
                this.F = event.getX();
                y11 = 0.0f;
            }
        }
        float f11 = this.G + y11;
        if (this.f29482f) {
            boolean z11 = y11 < 0.0f;
            boolean r11 = r(getSheetView(), event.getX(), event.getY() + (this.f29484h - getHeight()));
            State state = this.f29479c;
            State state2 = State.EXPANDED;
            if (state == state2 && z11 && !r11) {
                this.E = event.getY();
                this.G = this.f29484h;
                this.f29485i.clear();
                setState(State.PEEKED);
                setSheetLayerTypeIfEnabled(2);
                f11 = this.f29484h;
                MotionEvent obtain2 = MotionEvent.obtain(event);
                obtain2.setAction(3);
                getSheetView().dispatchTouchEvent(obtain2);
                obtain2.recycle();
            }
            if (this.f29479c == State.PEEKED && f11 > maxSheetTranslation) {
                setSheetTranslation(maxSheetTranslation);
                f11 = Math.min(maxSheetTranslation, f11);
                MotionEvent obtain3 = MotionEvent.obtain(event);
                obtain3.setAction(0);
                getSheetView().dispatchTouchEvent(obtain3);
                obtain3.recycle();
                setState(state2);
                setSheetLayerTypeIfEnabled(0);
            }
            if (this.f29479c == state2) {
                event.offsetLocation(0.0f, this.f29484h - getHeight());
                getSheetView().dispatchTouchEvent(event);
            } else {
                if (f11 < peekSheetTranslation) {
                    f11 = peekSheetTranslation - ((peekSheetTranslation - f11) / 4.0f);
                }
                setSheetTranslation(f11);
                if (event.getAction() == 3) {
                    if (this.H == state2) {
                        w();
                    } else {
                        F();
                    }
                }
                if (event.getAction() == 1) {
                    if (f11 < peekSheetTranslation) {
                        u();
                    } else {
                        this.f29485i.computeCurrentVelocity(1000);
                        float yVelocity = this.f29485i.getYVelocity();
                        if (Math.abs(yVelocity) < this.f29486j) {
                            if (this.f29484h > getHeight() / 2) {
                                w();
                            } else {
                                F();
                            }
                        } else if (yVelocity < 0.0f) {
                            w();
                        } else {
                            F();
                        }
                    }
                }
            }
        } else {
            boolean z12 = event.getY() < ((float) getHeight()) - this.f29484h || !E(event.getX());
            if (event.getAction() == 1 && z12 && this.f29498v) {
                Iterator<ql.c> it = this.f29494r.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
                u();
                return true;
            }
            event.offsetLocation(this.A ? getX() - this.C : 0.0f, this.f29484h - getHeight());
            getSheetView().dispatchTouchEvent(event);
        }
        return true;
    }

    public void p(@NonNull ql.c onSheetListener) {
        t(onSheetListener, "onSheetListener == null");
        this.f29494r.add(onSheetListener);
    }

    public void q(@NonNull j onSheetStateChangeListener) {
        t(onSheetStateChangeListener, "onSheetStateChangeListener == null");
        this.f29495s.add(onSheetStateChangeListener);
    }

    public final boolean r(View view, float x11, float y11) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                View childAt = viewGroup.getChildAt(i11);
                int left = childAt.getLeft() - view.getScrollX();
                int top = childAt.getTop() - view.getScrollY();
                int right = childAt.getRight() - view.getScrollX();
                int bottom = childAt.getBottom() - view.getScrollY();
                float f11 = left;
                if (x11 > f11 && x11 < right && y11 > top && y11 < bottom && r(childAt, x11 - f11, y11 - top)) {
                    return true;
                }
            }
        }
        return view.canScrollVertically(-1);
    }

    public final void s() {
        Animator animator = this.f29492p;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void setContentView(View contentView) {
        super.addView(contentView, -1, generateDefaultLayoutParams());
        super.addView(this.f29497u, -1, generateDefaultLayoutParams());
    }

    public void setDefaultViewTransformer(ql.d defaultViewTransformer) {
        this.f29488l = defaultViewTransformer;
    }

    public void setInterceptContentTouch(boolean interceptContentTouch) {
        this.f29498v = interceptContentTouch;
    }

    public void setPeekOnDismiss(boolean peekOnDismiss) {
        this.f29480d = peekOnDismiss;
    }

    public void setPeekSheetTranslation(float peek) {
        this.f29501y = peek;
    }

    public void setShouldDimContentView(boolean shouldDimContentView) {
        this.f29490n = shouldDimContentView;
    }

    public void setUseHardwareLayerWhileAnimating(boolean useHardwareLayerWhileAnimating) {
        this.f29491o = useHardwareLayerWhileAnimating;
    }

    public void u() {
        v(null);
    }

    public final void v(Runnable runAfterDismissThis) {
        if (this.f29479c == State.HIDDEN) {
            this.f29477a = null;
            return;
        }
        this.f29477a = runAfterDismissThis;
        View sheetView = getSheetView();
        sheetView.removeOnLayoutChangeListener(this.f29496t);
        s();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, I, 0.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(this.f29481e);
        ofFloat.addListener(new g(sheetView));
        ofFloat.start();
        this.f29492p = ofFloat;
        this.C = 0;
        this.D = this.f29502z;
    }

    public void w() {
        s();
        setSheetLayerTypeIfEnabled(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, I, getMaxSheetTranslation());
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(this.f29481e);
        ofFloat.addListener(new b());
        ofFloat.start();
        this.f29492p = ofFloat;
        setState(State.EXPANDED);
    }

    public final float x(float sheetTranslation) {
        ql.d dVar = this.f29489m;
        if (dVar != null) {
            return dVar.a(sheetTranslation, getMaxSheetTranslation(), getPeekSheetTranslation(), this, getContentView());
        }
        ql.d dVar2 = this.f29488l;
        if (dVar2 != null) {
            return dVar2.a(sheetTranslation, getMaxSheetTranslation(), getPeekSheetTranslation(), this, getContentView());
        }
        return 0.0f;
    }

    public final boolean y() {
        return getSheetView() == null || getSheetView().getHeight() == getHeight();
    }

    public final void z() {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f29486j = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f29487k = viewConfiguration.getScaledTouchSlop();
        View view = new View(getContext());
        this.f29497u = view;
        view.setBackgroundColor(-16777216);
        this.f29497u.setAlpha(0.0f);
        this.f29497u.setVisibility(4);
        this.f29501y = 0.0f;
        setFocusableInTouchMode(true);
        Point point = new Point();
        ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getSize(point);
        int i11 = point.x;
        this.f29502z = i11;
        this.D = i11;
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View child, int index) {
        addView(child);
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View child, int index, @NonNull ViewGroup.LayoutParams params) {
        addView(child);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(@NonNull View child, @NonNull ViewGroup.LayoutParams params) {
        addView(child);
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View child, int width, int height) {
        addView(child);
    }

    public BottomSheetLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BottomSheetLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f29478b = new Rect();
        this.f29479c = State.HIDDEN;
        this.f29480d = false;
        this.f29481e = new DecelerateInterpolator(1.6f);
        this.f29488l = new i(null);
        this.f29490n = true;
        this.f29491o = true;
        this.f29493q = new CopyOnWriteArraySet<>();
        this.f29494r = new CopyOnWriteArraySet<>();
        this.f29495s = new CopyOnWriteArraySet<>();
        this.f29498v = true;
        this.f29502z = 0;
        this.A = getResources().getBoolean(R.bool.bottomsheet_is_tablet);
        this.B = getResources().getDimensionPixelSize(R.dimen.bottomsheet_default_sheet_width);
        this.C = 0;
        this.D = 0;
        z();
    }

    @TargetApi(21)
    public BottomSheetLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.f29478b = new Rect();
        this.f29479c = State.HIDDEN;
        this.f29480d = false;
        this.f29481e = new DecelerateInterpolator(1.6f);
        this.f29488l = new i(null);
        this.f29490n = true;
        this.f29491o = true;
        this.f29493q = new CopyOnWriteArraySet<>();
        this.f29494r = new CopyOnWriteArraySet<>();
        this.f29495s = new CopyOnWriteArraySet<>();
        this.f29498v = true;
        this.f29502z = 0;
        this.A = getResources().getBoolean(R.bool.bottomsheet_is_tablet);
        this.B = getResources().getDimensionPixelSize(R.dimen.bottomsheet_default_sheet_width);
        this.C = 0;
        this.D = 0;
        z();
    }
}
