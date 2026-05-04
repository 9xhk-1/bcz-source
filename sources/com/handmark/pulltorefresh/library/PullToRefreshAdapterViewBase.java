package com.handmark.pulltorefresh.library;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.internal.IndicatorLayout;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class PullToRefreshAdapterViewBase<T extends AbsListView> extends PullToRefreshBase<T> implements AbsListView.OnScrollListener {
    public boolean R;
    public AbsListView.OnScrollListener S;
    public PullToRefreshBase.f T;
    public View U;
    public IndicatorLayout V;
    public IndicatorLayout W;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f35084f0;

    /* renamed from: f1, reason: collision with root package name */
    public boolean f35085f1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35086a;

        static {
            int[] iArr = new int[PullToRefreshBase.Mode.values().length];
            f35086a = iArr;
            try {
                iArr[PullToRefreshBase.Mode.PULL_FROM_END.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35086a[PullToRefreshBase.Mode.PULL_FROM_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public PullToRefreshAdapterViewBase(Context context) {
        super(context);
        this.f35085f1 = true;
        ((AbsListView) this.f35097k).setOnScrollListener(this);
    }

    public static FrameLayout.LayoutParams U(ViewGroup.LayoutParams lp2) {
        if (lp2 == null) {
            return null;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(lp2);
        if (lp2 instanceof LinearLayout.LayoutParams) {
            layoutParams.gravity = ((LinearLayout.LayoutParams) lp2).gravity;
            return layoutParams;
        }
        layoutParams.gravity = 17;
        return layoutParams;
    }

    private boolean getShowIndicatorInternal() {
        return this.f35084f0 && d();
    }

    @Override // com.handmark.pulltorefresh.library.PullToRefreshBase
    public void A() {
        super.A();
        if (getShowIndicatorInternal()) {
            int i11 = a.f35086a[getCurrentMode().ordinal()];
            if (i11 == 1) {
                this.W.c();
            } else {
                if (i11 != 2) {
                    return;
                }
                this.V.c();
            }
        }
    }

    @Override // com.handmark.pulltorefresh.library.PullToRefreshBase
    public void B(boolean doScroll) {
        super.B(doScroll);
        if (getShowIndicatorInternal()) {
            Y();
        }
    }

    @Override // com.handmark.pulltorefresh.library.PullToRefreshBase
    public void C() {
        super.C();
        if (getShowIndicatorInternal()) {
            int i11 = a.f35086a[getCurrentMode().ordinal()];
            if (i11 == 1) {
                this.W.d();
            } else {
                if (i11 != 2) {
                    return;
                }
                this.V.d();
            }
        }
    }

    @Override // com.handmark.pulltorefresh.library.PullToRefreshBase
    public void D() {
        super.D();
        if (getShowIndicatorInternal()) {
            Y();
        }
    }

    @Override // com.handmark.pulltorefresh.library.PullToRefreshBase
    public void S() {
        super.S();
        if (getShowIndicatorInternal()) {
            T();
        } else {
            X();
        }
    }

    public final void T() {
        IndicatorLayout indicatorLayout;
        IndicatorLayout indicatorLayout2;
        PullToRefreshBase.Mode mode = getMode();
        FrameLayout refreshableViewWrapper = getRefreshableViewWrapper();
        if (mode.showHeaderLoadingLayout() && this.V == null) {
            this.V = new IndicatorLayout(getContext(), PullToRefreshBase.Mode.PULL_FROM_START);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.rightMargin = getResources().getDimensionPixelSize(R.dimen.indicator_right_padding);
            layoutParams.gravity = 53;
            refreshableViewWrapper.addView(this.V, layoutParams);
        } else if (!mode.showHeaderLoadingLayout() && (indicatorLayout = this.V) != null) {
            refreshableViewWrapper.removeView(indicatorLayout);
            this.V = null;
        }
        if (mode.showFooterLoadingLayout() && this.W == null) {
            this.W = new IndicatorLayout(getContext(), PullToRefreshBase.Mode.PULL_FROM_END);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.rightMargin = getResources().getDimensionPixelSize(R.dimen.indicator_right_padding);
            layoutParams2.gravity = 85;
            refreshableViewWrapper.addView(this.W, layoutParams2);
            return;
        }
        if (mode.showFooterLoadingLayout() || (indicatorLayout2 = this.W) == null) {
            return;
        }
        refreshableViewWrapper.removeView(indicatorLayout2);
        this.W = null;
    }

    public final boolean V() {
        View childAt;
        Adapter adapter = ((AbsListView) this.f35097k).getAdapter();
        if (adapter == null || adapter.isEmpty()) {
            return true;
        }
        return ((AbsListView) this.f35097k).getFirstVisiblePosition() <= 1 && (childAt = ((AbsListView) this.f35097k).getChildAt(0)) != null && childAt.getTop() >= ((AbsListView) this.f35097k).getTop();
    }

    public final boolean W() {
        Adapter adapter = ((AbsListView) this.f35097k).getAdapter();
        if (adapter == null || adapter.isEmpty()) {
            return true;
        }
        int count = ((AbsListView) this.f35097k).getCount();
        int lastVisiblePosition = ((AbsListView) this.f35097k).getLastVisiblePosition();
        if (lastVisiblePosition >= count - 2) {
            View childAt = ((AbsListView) this.f35097k).getChildAt(lastVisiblePosition - ((AbsListView) this.f35097k).getFirstVisiblePosition());
            if (childAt != null && childAt.getBottom() <= ((AbsListView) this.f35097k).getBottom()) {
                return true;
            }
        }
        return false;
    }

    public final void X() {
        if (this.V != null) {
            getRefreshableViewWrapper().removeView(this.V);
            this.V = null;
        }
        if (this.W != null) {
            getRefreshableViewWrapper().removeView(this.W);
            this.W = null;
        }
    }

    public final void Y() {
        if (this.V != null) {
            if (a() || !x()) {
                if (this.V.b()) {
                    this.V.a();
                }
            } else if (!this.V.b()) {
                this.V.e();
            }
        }
        if (this.W != null) {
            if (a() || !w()) {
                if (this.W.b()) {
                    this.W.a();
                }
            } else {
                if (this.W.b()) {
                    return;
                }
                this.W.e();
            }
        }
    }

    public boolean getShowIndicator() {
        return this.f35084f0;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(final AbsListView view, final int firstVisibleItem, final int visibleItemCount, final int totalItemCount) {
        if (this.T != null) {
            this.R = totalItemCount > 0 && firstVisibleItem + visibleItemCount >= totalItemCount + (-1);
        }
        if (getShowIndicatorInternal()) {
            Y();
        }
        AbsListView.OnScrollListener onScrollListener = this.S;
        if (onScrollListener != null) {
            onScrollListener.onScroll(view, firstVisibleItem, visibleItemCount, totalItemCount);
        }
    }

    @Override // android.view.View
    public void onScrollChanged(int l11, int t11, int oldl, int oldt) {
        super.onScrollChanged(l11, t11, oldl, oldt);
        View view = this.U;
        if (view == null || this.f35085f1) {
            return;
        }
        view.scrollTo(-l11, -t11);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(final AbsListView view, final int state) {
        PullToRefreshBase.f fVar;
        if (state == 0 && (fVar = this.T) != null && this.R) {
            fVar.a();
        }
        AbsListView.OnScrollListener onScrollListener = this.S;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(view, state);
        }
    }

    @Override // com.handmark.pulltorefresh.library.PullToRefreshBase
    public void s(TypedArray a11) {
        this.f35084f0 = a11.getBoolean(R.styleable.PullToRefresh_ptrShowIndicator, !h());
    }

    public void setAdapter(ListAdapter adapter) {
        ((AdapterView) this.f35097k).setAdapter(adapter);
    }

    public final void setEmptyView(View newEmptyView) {
        FrameLayout refreshableViewWrapper = getRefreshableViewWrapper();
        if (newEmptyView != null) {
            newEmptyView.setClickable(true);
            ViewParent parent = newEmptyView.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(newEmptyView);
            }
            FrameLayout.LayoutParams U = U(newEmptyView.getLayoutParams());
            if (U != null) {
                refreshableViewWrapper.addView(newEmptyView, U);
            } else {
                refreshableViewWrapper.addView(newEmptyView);
            }
        }
        T t11 = this.f35097k;
        if (t11 instanceof lq.a) {
            ((lq.a) t11).setEmptyViewInternal(newEmptyView);
        } else {
            ((AbsListView) t11).setEmptyView(newEmptyView);
        }
        this.U = newEmptyView;
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener listener) {
        ((AbsListView) this.f35097k).setOnItemClickListener(listener);
    }

    public final void setOnLastItemVisibleListener(PullToRefreshBase.f listener) {
        this.T = listener;
    }

    public final void setOnScrollListener(AbsListView.OnScrollListener listener) {
        this.S = listener;
    }

    public final void setScrollEmptyView(boolean doScroll) {
        this.f35085f1 = doScroll;
    }

    public void setShowIndicator(boolean showIndicator) {
        this.f35084f0 = showIndicator;
        if (getShowIndicatorInternal()) {
            T();
        } else {
            X();
        }
    }

    @Override // com.handmark.pulltorefresh.library.PullToRefreshBase
    public boolean w() {
        return W();
    }

    @Override // com.handmark.pulltorefresh.library.PullToRefreshBase
    public boolean x() {
        return V();
    }

    public PullToRefreshAdapterViewBase(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f35085f1 = true;
        ((AbsListView) this.f35097k).setOnScrollListener(this);
    }

    public PullToRefreshAdapterViewBase(Context context, PullToRefreshBase.Mode mode) {
        super(context, mode);
        this.f35085f1 = true;
        ((AbsListView) this.f35097k).setOnScrollListener(this);
    }

    public PullToRefreshAdapterViewBase(Context context, PullToRefreshBase.Mode mode, PullToRefreshBase.AnimationStyle animStyle) {
        super(context, mode, animStyle);
        this.f35085f1 = true;
        ((AbsListView) this.f35097k).setOnScrollListener(this);
    }
}
