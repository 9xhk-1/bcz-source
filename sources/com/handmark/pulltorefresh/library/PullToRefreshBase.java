package com.handmark.pulltorefresh.library;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.handmark.pulltorefresh.library.internal.FlipLoadingLayout;
import com.handmark.pulltorefresh.library.internal.LoadingLayout;
import com.handmark.pulltorefresh.library.internal.RotateLoadingLayout;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class PullToRefreshBase<T extends View> extends LinearLayout implements com.handmark.pulltorefresh.library.a<T> {
    public static final boolean E = false;
    public static final boolean F = false;
    public static final String G = "PullToRefresh";
    public static final float H = 0.8f;
    public static final int I = 200;
    public static final int J = 325;
    public static final int K = 225;
    public static final String L = "ptr_state";
    public static final String M = "ptr_mode";
    public static final String N = "ptr_current_mode";
    public static final String O = "ptr_disable_scrolling";
    public static final String P = "ptr_show_refreshing_view";
    public static final String Q = "ptr_super";
    public float A;
    public boolean B;
    public boolean C;
    public h<T> D;

    /* renamed from: a, reason: collision with root package name */
    public float f35087a;

    /* renamed from: b, reason: collision with root package name */
    public int f35088b;

    /* renamed from: c, reason: collision with root package name */
    public float f35089c;

    /* renamed from: d, reason: collision with root package name */
    public float f35090d;

    /* renamed from: e, reason: collision with root package name */
    public float f35091e;

    /* renamed from: f, reason: collision with root package name */
    public float f35092f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f35093g;

    /* renamed from: h, reason: collision with root package name */
    public State f35094h;

    /* renamed from: i, reason: collision with root package name */
    public Mode f35095i;

    /* renamed from: j, reason: collision with root package name */
    public Mode f35096j;

    /* renamed from: k, reason: collision with root package name */
    public T f35097k;

    /* renamed from: l, reason: collision with root package name */
    public FrameLayout f35098l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f35099m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f35100n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f35101o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f35102p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f35103q;

    /* renamed from: r, reason: collision with root package name */
    public Interpolator f35104r;

    /* renamed from: s, reason: collision with root package name */
    public AnimationStyle f35105s;

    /* renamed from: t, reason: collision with root package name */
    public LoadingLayout f35106t;

    /* renamed from: u, reason: collision with root package name */
    public LoadingLayout f35107u;

    /* renamed from: v, reason: collision with root package name */
    public j<T> f35108v;

    /* renamed from: w, reason: collision with root package name */
    public i<T> f35109w;

    /* renamed from: x, reason: collision with root package name */
    public g<T> f35110x;

    /* renamed from: y, reason: collision with root package name */
    public PullToRefreshBase<T>.l f35111y;

    /* renamed from: z, reason: collision with root package name */
    public float f35112z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum AnimationStyle {
        ROTATE,
        FLIP;

        public static AnimationStyle getDefault() {
            return ROTATE;
        }

        public static AnimationStyle mapIntToValue(int modeInt) {
            return modeInt != 1 ? ROTATE : FLIP;
        }

        public LoadingLayout createLoadingLayout(Context context, Mode mode, Orientation scrollDirection, TypedArray attrs) {
            return e.f35120d[ordinal()] != 2 ? new RotateLoadingLayout(context, mode, scrollDirection, attrs) : new FlipLoadingLayout(context, mode, scrollDirection, attrs);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Mode {
        DISABLED(0),
        PULL_FROM_START(1),
        PULL_FROM_END(2),
        BOTH(3),
        MANUAL_REFRESH_ONLY(4);

        public static Mode PULL_DOWN_TO_REFRESH;
        public static Mode PULL_UP_TO_REFRESH;
        private int mIntValue;

        static {
            Mode mode = PULL_FROM_START;
            Mode mode2 = PULL_FROM_END;
            PULL_DOWN_TO_REFRESH = mode;
            PULL_UP_TO_REFRESH = mode2;
        }

        Mode(int modeInt) {
            this.mIntValue = modeInt;
        }

        public static Mode getDefault() {
            return PULL_FROM_START;
        }

        public static Mode mapIntToValue(final int modeInt) {
            for (Mode mode : values()) {
                if (modeInt == mode.getIntValue()) {
                    return mode;
                }
            }
            return getDefault();
        }

        public int getIntValue() {
            return this.mIntValue;
        }

        public boolean permitsPullToRefresh() {
            return (this == DISABLED || this == MANUAL_REFRESH_ONLY) ? false : true;
        }

        public boolean showFooterLoadingLayout() {
            return this == PULL_FROM_END || this == BOTH || this == MANUAL_REFRESH_ONLY;
        }

        public boolean showHeaderLoadingLayout() {
            return this == PULL_FROM_START || this == BOTH;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Orientation {
        VERTICAL,
        HORIZONTAL
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum State {
        RESET(0),
        PULL_TO_REFRESH(1),
        RELEASE_TO_REFRESH(2),
        REFRESHING(8),
        MANUAL_REFRESHING(9),
        OVERSCROLLING(16),
        IDLE(32);

        private int mIntValue;

        State(int intValue) {
            this.mIntValue = intValue;
        }

        public static State mapIntToValue(final int stateInt) {
            for (State state : values()) {
                if (stateInt == state.getIntValue()) {
                    return state;
                }
            }
            return RESET;
        }

        public int getIntValue() {
            return this.mIntValue;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements k {
        public a() {
        }

        @Override // com.handmark.pulltorefresh.library.PullToRefreshBase.k
        public void a() {
            PullToRefreshBase.this.n();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PullToRefreshBase.this.requestLayout();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements k {
        public c() {
        }

        @Override // com.handmark.pulltorefresh.library.PullToRefreshBase.k
        public void a() {
            if (PullToRefreshBase.this.a()) {
                return;
            }
            PullToRefreshBase.this.L(State.IDLE, new boolean[0]);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements k {
        public d() {
        }

        @Override // com.handmark.pulltorefresh.library.PullToRefreshBase.k
        public void a() {
            PullToRefreshBase.this.O(0, 200L, 225L, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35117a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f35118b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f35119c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f35120d;

        static {
            int[] iArr = new int[AnimationStyle.values().length];
            f35120d = iArr;
            try {
                iArr[AnimationStyle.ROTATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35120d[AnimationStyle.FLIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Mode.values().length];
            f35119c = iArr2;
            try {
                iArr2[Mode.PULL_FROM_END.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35119c[Mode.PULL_FROM_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35119c[Mode.MANUAL_REFRESH_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35119c[Mode.BOTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[State.values().length];
            f35118b = iArr3;
            try {
                iArr3[State.RESET.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35118b[State.PULL_TO_REFRESH.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f35118b[State.RELEASE_TO_REFRESH.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f35118b[State.REFRESHING.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f35118b[State.MANUAL_REFRESHING.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f35118b[State.OVERSCROLLING.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr4 = new int[Orientation.values().length];
            f35117a = iArr4;
            try {
                iArr4[Orientation.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f35117a[Orientation.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface f {
        void a();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface g<V extends View> {
        void a(final PullToRefreshBase<V> refreshView, State state, Mode direction);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface h<V extends View> {
        void a(final PullToRefreshBase<V> refreshView, Mode direction);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface i<V extends View> {
        void a(final PullToRefreshBase<V> refreshView);

        void b(final PullToRefreshBase<V> refreshView);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface j<V extends View> {
        void a(final PullToRefreshBase<V> refreshView);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface k {
        void a();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class l implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final Interpolator f35121a;

        /* renamed from: b, reason: collision with root package name */
        public final int f35122b;

        /* renamed from: c, reason: collision with root package name */
        public final int f35123c;

        /* renamed from: d, reason: collision with root package name */
        public final long f35124d;

        /* renamed from: e, reason: collision with root package name */
        public k f35125e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f35126f = true;

        /* renamed from: g, reason: collision with root package name */
        public long f35127g = -1;

        /* renamed from: h, reason: collision with root package name */
        public int f35128h = -1;

        public l(int fromY, int toY, long duration, k listener) {
            this.f35123c = fromY;
            this.f35122b = toY;
            this.f35121a = PullToRefreshBase.this.f35104r;
            this.f35124d = duration;
            this.f35125e = listener;
        }

        public void a() {
            this.f35126f = false;
            PullToRefreshBase.this.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f35127g == -1) {
                this.f35127g = System.currentTimeMillis();
            } else {
                int round = this.f35123c - Math.round((this.f35123c - this.f35122b) * this.f35121a.getInterpolation(Math.max(Math.min(((System.currentTimeMillis() - this.f35127g) * 1000) / this.f35124d, 1000L), 0L) / 1000.0f));
                this.f35128h = round;
                PullToRefreshBase.this.setHeaderScroll(round);
            }
            if (this.f35126f && this.f35122b != this.f35128h) {
                lq.c.a(PullToRefreshBase.this, this);
                return;
            }
            k kVar = this.f35125e;
            if (kVar != null) {
                kVar.a();
            }
        }
    }

    public PullToRefreshBase(Context context) {
        super(context);
        this.f35087a = 0.8f;
        this.f35093g = false;
        this.f35094h = State.RESET;
        this.f35095i = Mode.getDefault();
        this.f35099m = true;
        this.f35100n = false;
        this.f35101o = true;
        this.f35102p = true;
        this.f35103q = true;
        this.f35105s = AnimationStyle.getDefault();
        this.f35112z = 1.0f;
        this.A = 1.0f;
        this.B = false;
        this.C = false;
        t(context, null);
    }

    private LinearLayout.LayoutParams getLoadingLayoutLayoutParams() {
        return e.f35117a[getPullToRefreshScrollDirection().ordinal()] != 1 ? new LinearLayout.LayoutParams(-1, -2) : new LinearLayout.LayoutParams(-2, -1);
    }

    private int getMaximumPullScroll() {
        return e.f35117a[getPullToRefreshScrollDirection().ordinal()] != 1 ? Math.round(getHeight() / this.f35087a) : Math.round(getWidth() / this.f35087a);
    }

    public void A() {
        int i11 = e.f35119c[this.f35096j.ordinal()];
        if (i11 == 1) {
            this.f35107u.e();
        } else {
            if (i11 != 2) {
                return;
            }
            this.f35106t.e();
        }
    }

    public void B(final boolean doScroll) {
        if (this.f35095i.showHeaderLoadingLayout()) {
            this.f35106t.g();
        }
        if (this.f35095i.showFooterLoadingLayout()) {
            this.f35107u.g();
        }
        if (!doScroll) {
            n();
            return;
        }
        if (!this.f35099m) {
            M(0);
            return;
        }
        a aVar = new a();
        int i11 = e.f35119c[this.f35096j.ordinal()];
        if (i11 == 1 || i11 == 3) {
            P(getFooterSize(), aVar);
        } else {
            P(-getHeaderSize(), aVar);
        }
    }

    public void C() {
        int i11 = e.f35119c[this.f35096j.ordinal()];
        if (i11 == 1) {
            this.f35107u.i();
        } else {
            if (i11 != 2) {
                return;
            }
            this.f35106t.i();
        }
    }

    public void D() {
        this.f35093g = false;
        this.f35103q = true;
        this.f35106t.k();
        this.f35107u.k();
        M(0);
    }

    public final void E() {
        float f11;
        float f12;
        int round;
        float footerSize;
        float f13;
        if (e.f35117a[getPullToRefreshScrollDirection().ordinal()] != 1) {
            f11 = this.f35092f;
            f12 = this.f35090d;
        } else {
            f11 = this.f35091e;
            f12 = this.f35089c;
        }
        int[] iArr = e.f35119c;
        if (iArr[this.f35096j.ordinal()] != 1) {
            round = Math.round(Math.min(f11 - f12, 0.0f) / this.f35087a);
            footerSize = getHeaderSize();
            f13 = this.f35112z;
        } else {
            round = Math.round(Math.max(f11 - f12, 0.0f) / this.f35087a);
            footerSize = getFooterSize();
            f13 = this.A;
        }
        int i11 = (int) (footerSize * f13);
        setHeaderScroll(round);
        if (round == 0 || a()) {
            return;
        }
        float abs = Math.abs(round) / i11;
        if (iArr[this.f35096j.ordinal()] != 1) {
            this.f35106t.c(abs);
        } else {
            this.f35107u.c(abs);
        }
        State state = this.f35094h;
        State state2 = State.PULL_TO_REFRESH;
        if (state != state2 && i11 >= Math.abs(round)) {
            L(state2, new boolean[0]);
            return;
        }
        if (this.f35094h != state2 && i11 < Math.abs(round)) {
            L(State.RELEASE_TO_REFRESH, new boolean[0]);
        } else {
            if (this.f35094h != state2 || i11 >= Math.abs(round)) {
                return;
            }
            L(State.RELEASE_TO_REFRESH, new boolean[0]);
        }
    }

    public final void F() {
        int maximumPullScroll = (int) (getMaximumPullScroll() * 1.2f);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int i11 = e.f35117a[getPullToRefreshScrollDirection().ordinal()];
        if (i11 == 1) {
            if (this.f35095i.showHeaderLoadingLayout()) {
                this.f35106t.setWidth(maximumPullScroll);
                paddingLeft = -maximumPullScroll;
            } else {
                paddingLeft = 0;
            }
            if (this.f35095i.showFooterLoadingLayout()) {
                this.f35107u.setWidth(maximumPullScroll);
                paddingRight = -maximumPullScroll;
            } else {
                paddingRight = 0;
            }
        } else if (i11 == 2) {
            if (this.f35095i.showHeaderLoadingLayout()) {
                this.f35106t.setHeight(maximumPullScroll);
                paddingTop = -maximumPullScroll;
            } else {
                paddingTop = 0;
            }
            if (this.f35095i.showFooterLoadingLayout()) {
                this.f35107u.setHeight(maximumPullScroll);
                paddingBottom = -maximumPullScroll;
            } else {
                paddingBottom = 0;
            }
        }
        setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    public final void G(int width, int height) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f35098l.getLayoutParams();
        int i11 = e.f35117a[getPullToRefreshScrollDirection().ordinal()];
        if (i11 == 1) {
            if (layoutParams.width != width) {
                layoutParams.width = width;
                this.f35098l.requestLayout();
                return;
            }
            return;
        }
        if (i11 == 2 && layoutParams.height != height) {
            layoutParams.height = height;
            this.f35098l.requestLayout();
        }
    }

    public void H(Drawable drawable, Mode mode) {
        e(mode.showHeaderLoadingLayout(), mode.showFooterLoadingLayout()).setLoadingDrawable(drawable);
    }

    public void I(CharSequence pullLabel, Mode mode) {
        e(mode.showHeaderLoadingLayout(), mode.showFooterLoadingLayout()).setPullLabel(pullLabel);
    }

    public void J(CharSequence refreshingLabel, Mode mode) {
        e(mode.showHeaderLoadingLayout(), mode.showFooterLoadingLayout()).setRefreshingLabel(refreshingLabel);
    }

    public void K(CharSequence releaseLabel, Mode mode) {
        e(mode.showHeaderLoadingLayout(), mode.showFooterLoadingLayout()).setReleaseLabel(releaseLabel);
    }

    public final void L(State state, final boolean... params) {
        this.f35094h = state;
        int i11 = e.f35118b[state.ordinal()];
        if (i11 == 1) {
            D();
        } else if (i11 == 2) {
            A();
        } else if (i11 == 3) {
            C();
        } else if (i11 == 4 || i11 == 5) {
            B(params[0]);
        }
        g<T> gVar = this.f35110x;
        if (gVar != null) {
            gVar.a(this, this.f35094h, this.f35096j);
        }
    }

    public final void M(int scrollValue) {
        N(scrollValue, getPullToRefreshScrollDuration());
    }

    public final void N(int scrollValue, long duration) {
        O(scrollValue, duration, 0L, new c());
    }

    public final void O(int newScrollValue, long duration, long delayMillis, k listener) {
        PullToRefreshBase<T>.l lVar = this.f35111y;
        if (lVar != null) {
            lVar.a();
        }
        int scrollY = e.f35117a[getPullToRefreshScrollDirection().ordinal()] != 1 ? getScrollY() : getScrollX();
        if (scrollY != newScrollValue) {
            if (this.f35104r == null) {
                this.f35104r = new DecelerateInterpolator();
            }
            PullToRefreshBase<T>.l lVar2 = new l(scrollY, newScrollValue, duration, listener);
            this.f35111y = lVar2;
            if (delayMillis > 0) {
                postDelayed(lVar2, delayMillis);
            } else {
                post(lVar2);
            }
        }
    }

    public final void P(int scrollValue, k listener) {
        O(scrollValue, getPullToRefreshScrollDuration(), 0L, listener);
    }

    public final void Q(int y11) {
        O(y11, 200L, 0L, new d());
    }

    public final void R(int scrollValue) {
        N(scrollValue, getPullToRefreshScrollDurationLonger());
    }

    public void S() {
        LinearLayout.LayoutParams loadingLayoutLayoutParams = getLoadingLayoutLayoutParams();
        if (this == this.f35106t.getParent()) {
            removeView(this.f35106t);
        }
        if (this.f35095i.showHeaderLoadingLayout()) {
            l(this.f35106t, 0, loadingLayoutLayoutParams);
        }
        if (this == this.f35107u.getParent()) {
            removeView(this.f35107u);
        }
        if (this.f35095i.showFooterLoadingLayout()) {
            m(this.f35107u, loadingLayoutLayoutParams);
        }
        F();
        Mode mode = this.f35095i;
        if (mode == Mode.BOTH) {
            mode = Mode.PULL_FROM_START;
        }
        this.f35096j = mode;
    }

    @Override // com.handmark.pulltorefresh.library.a
    public final boolean a() {
        State state = this.f35094h;
        return state == State.REFRESHING || state == State.MANUAL_REFRESHING;
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        T refreshableView = getRefreshableView();
        if (!(refreshableView instanceof ViewGroup)) {
            throw new UnsupportedOperationException("Refreshable View is not a ViewGroup so can't addView");
        }
        ((ViewGroup) refreshableView).addView(child, index, params);
    }

    @Override // com.handmark.pulltorefresh.library.a
    public final boolean b() {
        if (this.f35095i.showHeaderLoadingLayout() && x()) {
            Q((-getHeaderSize()) * 2);
            return true;
        }
        if (!this.f35095i.showFooterLoadingLayout() || !w()) {
            return false;
        }
        Q(getFooterSize() * 2);
        return true;
    }

    @Override // com.handmark.pulltorefresh.library.a
    public final boolean c() {
        return this.f35100n;
    }

    @Override // com.handmark.pulltorefresh.library.a
    public final boolean d() {
        return this.f35095i.permitsPullToRefresh();
    }

    @Override // com.handmark.pulltorefresh.library.a
    public final jq.b e(boolean includeStart, boolean includeEnd) {
        return p(includeStart, includeEnd);
    }

    @Override // com.handmark.pulltorefresh.library.a
    public final void f() {
        setRefreshing(true);
    }

    @Override // com.handmark.pulltorefresh.library.a
    public final void g() {
        if (a()) {
            L(State.RESET, new boolean[0]);
        }
    }

    @Override // com.handmark.pulltorefresh.library.a
    public final Mode getCurrentMode() {
        return this.f35096j;
    }

    @Override // com.handmark.pulltorefresh.library.a
    public final boolean getFilterTouchEvents() {
        return this.f35101o;
    }

    public final LoadingLayout getFooterLayout() {
        return this.f35107u;
    }

    public final int getFooterSize() {
        return this.f35107u.getContentSize();
    }

    public final LoadingLayout getHeaderLayout() {
        return this.f35106t;
    }

    public final int getHeaderSize() {
        return this.f35106t.getContentSize();
    }

    public float getLastMotionX() {
        return this.f35089c;
    }

    public float getLastMotionY() {
        return this.f35090d;
    }

    @Override // com.handmark.pulltorefresh.library.a
    public final jq.b getLoadingLayoutProxy() {
        return e(true, true);
    }

    @Override // com.handmark.pulltorefresh.library.a
    public final Mode getMode() {
        return this.f35095i;
    }

    public abstract Orientation getPullToRefreshScrollDirection();

    public int getPullToRefreshScrollDuration() {
        return 200;
    }

    public int getPullToRefreshScrollDurationLonger() {
        return J;
    }

    @Override // com.handmark.pulltorefresh.library.a
    public final T getRefreshableView() {
        return this.f35097k;
    }

    public FrameLayout getRefreshableViewWrapper() {
        return this.f35098l;
    }

    @Override // com.handmark.pulltorefresh.library.a
    public final boolean getShowViewWhileRefreshing() {
        return this.f35099m;
    }

    @Override // com.handmark.pulltorefresh.library.a
    public final State getState() {
        return this.f35094h;
    }

    @Override // com.handmark.pulltorefresh.library.a
    public final boolean h() {
        return this.f35102p && com.handmark.pulltorefresh.library.b.a(this.f35097k);
    }

    public final void k(Context context, T refreshableView) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35098l = frameLayout;
        frameLayout.addView(refreshableView, -1, -1);
        m(this.f35098l, new LinearLayout.LayoutParams(-1, -1));
    }

    public final void l(View child, int index, ViewGroup.LayoutParams params) {
        super.addView(child, index, params);
    }

    public final void m(View child, ViewGroup.LayoutParams params) {
        super.addView(child, -1, params);
    }

    public void n() {
        j<T> jVar = this.f35108v;
        if (jVar != null) {
            jVar.a(this);
            return;
        }
        i<T> iVar = this.f35109w;
        if (iVar != null) {
            Mode mode = this.f35096j;
            if (mode == Mode.PULL_FROM_START) {
                iVar.a(this);
            } else if (mode == Mode.PULL_FROM_END) {
                iVar.b(this);
            }
        }
    }

    public LoadingLayout o(Context context, Mode mode, TypedArray attrs) {
        LoadingLayout createLoadingLayout = this.f35105s.createLoadingLayout(context, mode, getPullToRefreshScrollDirection(), attrs);
        createLoadingLayout.setVisibility(4);
        return createLoadingLayout;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        float f11;
        float f12;
        boolean z11 = false;
        if (!d()) {
            return false;
        }
        int action = event.getAction();
        if (action == 3 || action == 1) {
            this.f35093g = false;
            return false;
        }
        if (action != 0 && this.f35093g) {
            return true;
        }
        if (action != 0) {
            if (action == 2) {
                if (!this.f35100n && a()) {
                    return true;
                }
                if (v()) {
                    float y11 = event.getY();
                    float x11 = event.getX();
                    if (e.f35117a[getPullToRefreshScrollDirection().ordinal()] != 1) {
                        f11 = y11 - this.f35090d;
                        f12 = x11 - this.f35089c;
                    } else {
                        f11 = x11 - this.f35089c;
                        f12 = y11 - this.f35090d;
                    }
                    float abs = Math.abs(f11);
                    boolean z12 = !this.f35101o || abs > Math.abs(f12);
                    if (!this.C) {
                        if (z12 && abs > this.f35088b) {
                            z11 = true;
                        }
                        z12 = z11;
                    }
                    if (z12) {
                        if (this.f35095i.showHeaderLoadingLayout() && f11 >= 1.0f && x()) {
                            this.f35090d = y11;
                            this.f35089c = x11;
                            this.f35093g = true;
                            if (this.f35095i == Mode.BOTH) {
                                this.f35096j = Mode.PULL_FROM_START;
                            }
                        } else if (this.f35095i.showFooterLoadingLayout() && f11 <= -1.0f && w()) {
                            this.f35090d = y11;
                            this.f35089c = x11;
                            this.f35093g = true;
                            if (this.f35095i == Mode.BOTH) {
                                this.f35096j = Mode.PULL_FROM_END;
                            }
                        }
                    }
                }
            }
        } else if (v()) {
            float y12 = event.getY();
            this.f35092f = y12;
            this.f35090d = y12;
            float x12 = event.getX();
            this.f35091e = x12;
            this.f35089c = x12;
            this.f35093g = false;
        }
        return this.f35093g;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof Bundle)) {
            super.onRestoreInstanceState(state);
            return;
        }
        Bundle bundle = (Bundle) state;
        setMode(Mode.mapIntToValue(bundle.getInt(M, 0)));
        this.f35096j = Mode.mapIntToValue(bundle.getInt(N, 0));
        this.f35100n = bundle.getBoolean(O, false);
        this.f35099m = bundle.getBoolean(P, true);
        super.onRestoreInstanceState(bundle.getParcelable(Q));
        State mapIntToValue = State.mapIntToValue(bundle.getInt(L, 0));
        if (mapIntToValue == State.REFRESHING || mapIntToValue == State.MANUAL_REFRESHING) {
            L(mapIntToValue, true);
        }
        y(bundle);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        z(bundle);
        bundle.putInt(L, this.f35094h.getIntValue());
        bundle.putInt(M, this.f35095i.getIntValue());
        bundle.putInt(N, this.f35096j.getIntValue());
        bundle.putBoolean(O, this.f35100n);
        bundle.putBoolean(P, this.f35099m);
        bundle.putParcelable(Q, super.onSaveInstanceState());
        return bundle;
    }

    @Override // android.view.View
    public final void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        super.onSizeChanged(w11, h11, oldw, oldh);
        F();
        G(w11, h11);
        post(new b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002d, code lost:
    
        if (r0 != 3) goto L49;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            boolean r0 = r4.d()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r0 = r4.f35100n
            r2 = 1
            if (r0 != 0) goto L14
            boolean r0 = r4.a()
            if (r0 == 0) goto L14
            return r2
        L14:
            int r0 = r5.getAction()
            if (r0 != 0) goto L21
            int r0 = r5.getEdgeFlags()
            if (r0 == 0) goto L21
            return r1
        L21:
            int r0 = r5.getAction()
            if (r0 == 0) goto L7d
            if (r0 == r2) goto L4d
            r3 = 2
            if (r0 == r3) goto L30
            r5 = 3
            if (r0 == r5) goto L4d
            goto L94
        L30:
            boolean r0 = r4.f35093g
            if (r0 == 0) goto L94
            float r0 = r5.getY()
            r4.f35090d = r0
            float r5 = r5.getX()
            r4.f35089c = r5
            r4.E()
            com.handmark.pulltorefresh.library.PullToRefreshBase$h<T extends android.view.View> r5 = r4.D
            if (r5 == 0) goto L4c
            com.handmark.pulltorefresh.library.PullToRefreshBase$Mode r0 = r4.f35096j
            r5.a(r4, r0)
        L4c:
            return r2
        L4d:
            boolean r5 = r4.f35093g
            if (r5 == 0) goto L94
            r4.f35093g = r1
            com.handmark.pulltorefresh.library.PullToRefreshBase$State r5 = r4.f35094h
            com.handmark.pulltorefresh.library.PullToRefreshBase$State r0 = com.handmark.pulltorefresh.library.PullToRefreshBase.State.RELEASE_TO_REFRESH
            if (r5 != r0) goto L6b
            com.handmark.pulltorefresh.library.PullToRefreshBase$j<T extends android.view.View> r5 = r4.f35108v
            if (r5 != 0) goto L61
            com.handmark.pulltorefresh.library.PullToRefreshBase$i<T extends android.view.View> r5 = r4.f35109w
            if (r5 == 0) goto L6b
        L61:
            com.handmark.pulltorefresh.library.PullToRefreshBase$State r5 = com.handmark.pulltorefresh.library.PullToRefreshBase.State.REFRESHING
            boolean[] r0 = new boolean[r2]
            r0[r1] = r2
            r4.L(r5, r0)
            return r2
        L6b:
            boolean r5 = r4.a()
            if (r5 == 0) goto L75
            r4.M(r1)
            return r2
        L75:
            com.handmark.pulltorefresh.library.PullToRefreshBase$State r5 = com.handmark.pulltorefresh.library.PullToRefreshBase.State.RESET
            boolean[] r0 = new boolean[r1]
            r4.L(r5, r0)
            return r2
        L7d:
            boolean r0 = r4.v()
            if (r0 == 0) goto L94
            float r0 = r5.getY()
            r4.f35092f = r0
            r4.f35090d = r0
            float r5 = r5.getX()
            r4.f35091e = r5
            r4.f35089c = r5
            return r2
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.handmark.pulltorefresh.library.PullToRefreshBase.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public jq.c p(final boolean includeStart, final boolean includeEnd) {
        jq.c cVar = new jq.c();
        if (includeStart && this.f35095i.showHeaderLoadingLayout()) {
            cVar.a(this.f35106t);
        }
        if (includeEnd && this.f35095i.showFooterLoadingLayout()) {
            cVar.a(this.f35107u);
        }
        return cVar;
    }

    public abstract T q(Context context, AttributeSet attrs);

    public final void r() {
        this.f35103q = false;
    }

    public void setDisableScrollingWhileRefreshing(boolean disableScrollingWhileRefreshing) {
        setScrollingWhileRefreshingEnabled(!disableScrollingWhileRefreshing);
    }

    @Override // com.handmark.pulltorefresh.library.a
    public final void setFilterTouchEvents(boolean filterEvents) {
        this.f35101o = filterEvents;
    }

    public void setFooterScale(float scale) {
        this.A = scale;
    }

    public void setHeaderScale(float scale) {
        this.f35112z = scale;
    }

    public final void setHeaderScroll(int value) {
        int maximumPullScroll = getMaximumPullScroll();
        int min = Math.min(maximumPullScroll, Math.max(-maximumPullScroll, value));
        if (this.f35103q) {
            if (min < 0 && !this.B) {
                this.f35106t.setVisibility(0);
            } else if (min <= 0 || this.B) {
                this.f35106t.setVisibility(4);
                this.f35107u.setVisibility(4);
            } else {
                this.f35107u.setVisibility(0);
            }
        }
        int i11 = e.f35117a[getPullToRefreshScrollDirection().ordinal()];
        if (i11 == 1) {
            scrollTo(min, 0);
        } else {
            if (i11 != 2) {
                return;
            }
            scrollTo(0, min);
        }
    }

    public void setHideLoadingLayout(boolean hide) {
        this.B = hide;
    }

    public void setIgnoreTouchSlop(boolean ignore) {
        this.C = ignore;
    }

    public void setLastUpdatedLabel(CharSequence label) {
        getLoadingLayoutProxy().setLastUpdatedLabel(label);
    }

    public void setLoadingDrawable(Drawable drawable) {
        getLoadingLayoutProxy().setLoadingDrawable(drawable);
    }

    @Override // android.view.View
    public void setLongClickable(boolean longClickable) {
        getRefreshableView().setLongClickable(longClickable);
    }

    @Override // com.handmark.pulltorefresh.library.a
    public final void setMode(Mode mode) {
        if (mode != this.f35095i) {
            this.f35095i = mode;
            S();
        }
    }

    @Override // com.handmark.pulltorefresh.library.a
    public void setOnPullEventListener(g<T> listener) {
        this.f35110x = listener;
    }

    public void setOnPullingEventListener(h<T> l11) {
        this.D = l11;
    }

    @Override // com.handmark.pulltorefresh.library.a
    public final void setOnRefreshListener(j<T> listener) {
        this.f35108v = listener;
        this.f35109w = null;
    }

    public void setOverPullFriction(float friction) {
        this.f35087a = friction;
    }

    public void setPullLabel(CharSequence pullLabel) {
        getLoadingLayoutProxy().setPullLabel(pullLabel);
    }

    public final void setPullToRefreshEnabled(boolean enable) {
        setMode(enable ? Mode.getDefault() : Mode.DISABLED);
    }

    @Override // com.handmark.pulltorefresh.library.a
    public final void setPullToRefreshOverScrollEnabled(boolean enabled) {
        this.f35102p = enabled;
    }

    @Override // com.handmark.pulltorefresh.library.a
    public final void setRefreshing(boolean doScroll) {
        if (a()) {
            return;
        }
        L(State.MANUAL_REFRESHING, doScroll);
    }

    public void setRefreshingLabel(CharSequence refreshingLabel) {
        getLoadingLayoutProxy().setRefreshingLabel(refreshingLabel);
    }

    public void setReleaseLabel(CharSequence releaseLabel) {
        K(releaseLabel, Mode.BOTH);
    }

    @Override // com.handmark.pulltorefresh.library.a
    public void setScrollAnimationInterpolator(Interpolator interpolator) {
        this.f35104r = interpolator;
    }

    @Override // com.handmark.pulltorefresh.library.a
    public final void setScrollingWhileRefreshingEnabled(boolean allowScrollingWhileRefreshing) {
        this.f35100n = allowScrollingWhileRefreshing;
    }

    @Override // com.handmark.pulltorefresh.library.a
    public final void setShowViewWhileRefreshing(boolean showView) {
        this.f35099m = showView;
    }

    public final void t(Context context, AttributeSet attrs) {
        if (e.f35117a[getPullToRefreshScrollDirection().ordinal()] != 1) {
            setOrientation(1);
        } else {
            setOrientation(0);
        }
        setGravity(17);
        this.f35088b = ViewConfiguration.get(context).getScaledTouchSlop();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.PullToRefresh);
        int i11 = R.styleable.PullToRefresh_ptrMode;
        if (obtainStyledAttributes.hasValue(i11)) {
            this.f35095i = Mode.mapIntToValue(obtainStyledAttributes.getInteger(i11, 0));
        }
        int i12 = R.styleable.PullToRefresh_ptrAnimationStyle;
        if (obtainStyledAttributes.hasValue(i12)) {
            this.f35105s = AnimationStyle.mapIntToValue(obtainStyledAttributes.getInteger(i12, 0));
        }
        T q11 = q(context, attrs);
        this.f35097k = q11;
        k(context, q11);
        this.f35106t = o(context, Mode.PULL_FROM_START, obtainStyledAttributes);
        this.f35107u = o(context, Mode.PULL_FROM_END, obtainStyledAttributes);
        int i13 = R.styleable.PullToRefresh_ptrRefreshableViewBackground;
        if (obtainStyledAttributes.hasValue(i13)) {
            Drawable drawable = obtainStyledAttributes.getDrawable(i13);
            if (drawable != null) {
                this.f35097k.setBackgroundDrawable(drawable);
            }
        } else {
            int i14 = R.styleable.PullToRefresh_ptrAdapterViewBackground;
            if (obtainStyledAttributes.hasValue(i14)) {
                lq.b.a("ptrAdapterViewBackground", "ptrRefreshableViewBackground");
                Drawable drawable2 = obtainStyledAttributes.getDrawable(i14);
                if (drawable2 != null) {
                    this.f35097k.setBackgroundDrawable(drawable2);
                }
            }
        }
        int i15 = R.styleable.PullToRefresh_ptrOverScroll;
        if (obtainStyledAttributes.hasValue(i15)) {
            this.f35102p = obtainStyledAttributes.getBoolean(i15, true);
        }
        int i16 = R.styleable.PullToRefresh_ptrScrollingWhileRefreshingEnabled;
        if (obtainStyledAttributes.hasValue(i16)) {
            this.f35100n = obtainStyledAttributes.getBoolean(i16, false);
        }
        s(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        S();
    }

    public final boolean u() {
        return !c();
    }

    public final boolean v() {
        int i11 = e.f35119c[this.f35095i.ordinal()];
        if (i11 == 1) {
            return w();
        }
        if (i11 == 2) {
            return x();
        }
        if (i11 != 4) {
            return false;
        }
        return w() || x();
    }

    public abstract boolean w();

    public abstract boolean x();

    @Override // com.handmark.pulltorefresh.library.a
    public final void setOnRefreshListener(i<T> listener) {
        this.f35109w = listener;
        this.f35108v = null;
    }

    public PullToRefreshBase(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f35087a = 0.8f;
        this.f35093g = false;
        this.f35094h = State.RESET;
        this.f35095i = Mode.getDefault();
        this.f35099m = true;
        this.f35100n = false;
        this.f35101o = true;
        this.f35102p = true;
        this.f35103q = true;
        this.f35105s = AnimationStyle.getDefault();
        this.f35112z = 1.0f;
        this.A = 1.0f;
        this.B = false;
        this.C = false;
        t(context, attrs);
    }

    public void s(TypedArray a11) {
    }

    public void y(Bundle savedInstanceState) {
    }

    public void z(Bundle saveState) {
    }

    public PullToRefreshBase(Context context, Mode mode) {
        super(context);
        this.f35087a = 0.8f;
        this.f35093g = false;
        this.f35094h = State.RESET;
        this.f35095i = Mode.getDefault();
        this.f35099m = true;
        this.f35100n = false;
        this.f35101o = true;
        this.f35102p = true;
        this.f35103q = true;
        this.f35105s = AnimationStyle.getDefault();
        this.f35112z = 1.0f;
        this.A = 1.0f;
        this.B = false;
        this.C = false;
        this.f35095i = mode;
        t(context, null);
    }

    public PullToRefreshBase(Context context, Mode mode, AnimationStyle animStyle) {
        super(context);
        this.f35087a = 0.8f;
        this.f35093g = false;
        this.f35094h = State.RESET;
        this.f35095i = Mode.getDefault();
        this.f35099m = true;
        this.f35100n = false;
        this.f35101o = true;
        this.f35102p = true;
        this.f35103q = true;
        AnimationStyle.getDefault();
        this.f35112z = 1.0f;
        this.A = 1.0f;
        this.B = false;
        this.C = false;
        this.f35095i = mode;
        this.f35105s = animStyle;
        t(context, null);
    }
}
