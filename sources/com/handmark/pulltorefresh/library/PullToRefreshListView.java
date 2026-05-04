package com.handmark.pulltorefresh.library;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.internal.LoadingLayout;
import jq.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class PullToRefreshListView extends PullToRefreshAdapterViewBase<ListView> {

    /* renamed from: h1, reason: collision with root package name */
    public LoadingLayout f35135h1;

    /* renamed from: i1, reason: collision with root package name */
    public LoadingLayout f35136i1;

    /* renamed from: j1, reason: collision with root package name */
    public FrameLayout f35137j1;

    /* renamed from: k1, reason: collision with root package name */
    public boolean f35138k1;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f35139l1;

    /* renamed from: m1, reason: collision with root package name */
    public boolean f35140m1;

    /* renamed from: n1, reason: collision with root package name */
    public int f35141n1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class InternalListView extends ListView implements lq.a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f35142a;

        public InternalListView(Context context, AttributeSet attrs) {
            super(context, attrs);
            this.f35142a = false;
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
            try {
                super.dispatchDraw(canvas);
            } catch (IndexOutOfBoundsException e11) {
                e11.printStackTrace();
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent ev2) {
            try {
                return super.dispatchTouchEvent(ev2);
            } catch (IndexOutOfBoundsException e11) {
                e11.printStackTrace();
                return false;
            }
        }

        @Override // android.widget.AdapterView, lq.a
        public void setEmptyView(View emptyView) {
            PullToRefreshListView.this.setEmptyView(emptyView);
        }

        @Override // lq.a
        public void setEmptyViewInternal(View emptyView) {
            super.setEmptyView(emptyView);
        }

        @Override // android.widget.AdapterView
        public void setAdapter(ListAdapter adapter) {
            if (PullToRefreshListView.this.f35137j1 != null && !this.f35142a) {
                addFooterView(PullToRefreshListView.this.f35137j1, null, false);
                this.f35142a = true;
            }
            super.setAdapter(adapter);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35144a;

        static {
            int[] iArr = new int[PullToRefreshBase.Mode.values().length];
            f35144a = iArr;
            try {
                iArr[PullToRefreshBase.Mode.MANUAL_REFRESH_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35144a[PullToRefreshBase.Mode.PULL_FROM_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35144a[PullToRefreshBase.Mode.PULL_FROM_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @TargetApi(9)
    public final class b extends InternalListView {
        public b(Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        @Override // android.view.View
        public boolean overScrollBy(int deltaX, int deltaY, int scrollX, int scrollY, int scrollRangeX, int scrollRangeY, int maxOverScrollX, int maxOverScrollY, boolean isTouchEvent) {
            boolean overScrollBy = super.overScrollBy(deltaX, deltaY, scrollX, scrollY, scrollRangeX, scrollRangeY, maxOverScrollX, maxOverScrollY, isTouchEvent);
            com.handmark.pulltorefresh.library.b.d(PullToRefreshListView.this, deltaX, scrollX, deltaY, scrollY, isTouchEvent);
            return overScrollBy;
        }
    }

    public PullToRefreshListView(Context context) {
        super(context);
        this.f35139l1 = true;
        this.f35140m1 = true;
        this.f35141n1 = 0;
    }

    @Override // com.handmark.pulltorefresh.library.PullToRefreshAdapterViewBase, com.handmark.pulltorefresh.library.PullToRefreshBase
    public void B(final boolean doScroll) {
        LoadingLayout footerLayout;
        LoadingLayout loadingLayout;
        LoadingLayout loadingLayout2;
        int count;
        int scrollY;
        ListAdapter adapter = ((ListView) this.f35097k).getAdapter();
        if (!this.f35138k1 || !getShowViewWhileRefreshing() || adapter == null || adapter.isEmpty()) {
            super.B(doScroll);
            return;
        }
        super.B(false);
        int[] iArr = a.f35144a;
        int i11 = iArr[getCurrentMode().ordinal()];
        if (i11 == 1 || i11 == 2) {
            footerLayout = getFooterLayout();
            loadingLayout = this.f35136i1;
            loadingLayout2 = this.f35135h1;
            count = ((ListView) this.f35097k).getCount() - 1;
            scrollY = getScrollY() - getFooterSize();
        } else {
            footerLayout = getHeaderLayout();
            loadingLayout = this.f35135h1;
            loadingLayout2 = this.f35136i1;
            scrollY = getScrollY() + getHeaderSize();
            count = 0;
        }
        footerLayout.k();
        footerLayout.a();
        loadingLayout2.setVisibility(8);
        loadingLayout.setVisibility(0);
        loadingLayout.g();
        if (doScroll) {
            r();
            int i12 = iArr[getCurrentMode().ordinal()];
            if (i12 == 1 || i12 == 2) {
                if (this.f35140m1) {
                    setHeaderScroll(scrollY);
                    M(0);
                }
            } else if (this.f35139l1) {
                setHeaderScroll(scrollY);
                M(0);
            }
            ((ListView) this.f35097k).setSelection(count);
        }
        int i13 = this.f35141n1;
        if (i13 == 4) {
            loadingLayout.setVisibility(4);
        } else if (i13 != 8) {
            loadingLayout.setVisibility(0);
        } else {
            loadingLayout.setVisibility(8);
        }
    }

    @Override // com.handmark.pulltorefresh.library.PullToRefreshAdapterViewBase, com.handmark.pulltorefresh.library.PullToRefreshBase
    public void D() {
        LoadingLayout footerLayout;
        LoadingLayout loadingLayout;
        int i11;
        if (!this.f35138k1) {
            super.D();
            return;
        }
        int i12 = a.f35144a[getCurrentMode().ordinal()];
        int i13 = 1;
        if (i12 == 1 || i12 == 2) {
            footerLayout = getFooterLayout();
            loadingLayout = this.f35136i1;
            int count = ((ListView) this.f35097k).getCount() - 1;
            int footerSize = getFooterSize();
            i13 = Math.abs(((ListView) this.f35097k).getLastVisiblePosition() - count) <= 1 ? 1 : 0;
            r1 = count;
            i11 = footerSize;
        } else {
            footerLayout = getHeaderLayout();
            loadingLayout = this.f35135h1;
            i11 = -getHeaderSize();
            if (Math.abs(((ListView) this.f35097k).getFirstVisiblePosition()) > 1) {
                i13 = 0;
            }
        }
        if (loadingLayout.getVisibility() == 0) {
            footerLayout.m();
            loadingLayout.setVisibility(8);
            if (i13 != 0 && getState() != PullToRefreshBase.State.MANUAL_REFRESHING) {
                ((ListView) this.f35097k).setSelection(r1);
                setHeaderScroll(i11);
            }
        }
        super.D();
    }

    public ListView a0(Context context, AttributeSet attrs) {
        return new b(context, attrs);
    }

    @Override // com.handmark.pulltorefresh.library.PullToRefreshBase
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public ListView q(Context context, AttributeSet attrs) {
        ListView a02 = a0(context, attrs);
        a02.setId(android.R.id.list);
        return a02;
    }

    @Override // com.handmark.pulltorefresh.library.PullToRefreshBase
    public final PullToRefreshBase.Orientation getPullToRefreshScrollDirection() {
        return PullToRefreshBase.Orientation.VERTICAL;
    }

    @Override // com.handmark.pulltorefresh.library.PullToRefreshBase
    public c p(final boolean includeStart, final boolean includeEnd) {
        c p11 = super.p(includeStart, includeEnd);
        if (this.f35138k1) {
            PullToRefreshBase.Mode mode = getMode();
            if (includeStart && mode.showHeaderLoadingLayout()) {
                p11.a(this.f35135h1);
            }
            if (includeEnd && mode.showFooterLoadingLayout()) {
                p11.a(this.f35136i1);
            }
        }
        return p11;
    }

    @Override // com.handmark.pulltorefresh.library.PullToRefreshAdapterViewBase, com.handmark.pulltorefresh.library.PullToRefreshBase
    public void s(TypedArray a11) {
        super.s(a11);
        boolean z11 = a11.getBoolean(R.styleable.PullToRefresh_ptrListViewExtrasEnabled, true);
        this.f35138k1 = z11;
        if (z11) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 1);
            FrameLayout frameLayout = new FrameLayout(getContext());
            LoadingLayout o11 = o(getContext(), PullToRefreshBase.Mode.PULL_FROM_START, a11);
            this.f35135h1 = o11;
            o11.setVisibility(8);
            frameLayout.addView(this.f35135h1, layoutParams);
            ((ListView) this.f35097k).addHeaderView(frameLayout, null, false);
            this.f35137j1 = new FrameLayout(getContext());
            LoadingLayout o12 = o(getContext(), PullToRefreshBase.Mode.PULL_FROM_END, a11);
            this.f35136i1 = o12;
            o12.setVisibility(8);
            this.f35137j1.addView(this.f35136i1, layoutParams);
            if (a11.hasValue(R.styleable.PullToRefresh_ptrScrollingWhileRefreshingEnabled)) {
                return;
            }
            setScrollingWhileRefreshingEnabled(true);
        }
    }

    public void setBackToEnd(boolean back) {
        this.f35140m1 = back;
    }

    public void setBackToStart(boolean back) {
        this.f35139l1 = back;
    }

    public void setLoadingVisibility(int visibility) {
        this.f35141n1 = visibility;
    }

    public PullToRefreshListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f35139l1 = true;
        this.f35140m1 = true;
        this.f35141n1 = 0;
    }

    public PullToRefreshListView(Context context, PullToRefreshBase.Mode mode) {
        super(context, mode);
        this.f35139l1 = true;
        this.f35140m1 = true;
        this.f35141n1 = 0;
    }

    public PullToRefreshListView(Context context, PullToRefreshBase.Mode mode, PullToRefreshBase.AnimationStyle style) {
        super(context, mode, style);
        this.f35139l1 = true;
        this.f35140m1 = true;
        this.f35141n1 = 0;
    }
}
