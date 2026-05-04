package com.handmark.pulltorefresh.library;

import android.view.View;
import android.view.animation.Interpolator;
import com.handmark.pulltorefresh.library.PullToRefreshBase;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface a<T extends View> {
    boolean a();

    boolean b();

    boolean c();

    boolean d();

    jq.b e(boolean includeStart, boolean includeEnd);

    void f();

    void g();

    PullToRefreshBase.Mode getCurrentMode();

    boolean getFilterTouchEvents();

    jq.b getLoadingLayoutProxy();

    PullToRefreshBase.Mode getMode();

    T getRefreshableView();

    boolean getShowViewWhileRefreshing();

    PullToRefreshBase.State getState();

    boolean h();

    void setFilterTouchEvents(boolean filterEvents);

    void setMode(PullToRefreshBase.Mode mode);

    void setOnPullEventListener(PullToRefreshBase.g<T> listener);

    void setOnRefreshListener(PullToRefreshBase.i<T> listener);

    void setOnRefreshListener(PullToRefreshBase.j<T> listener);

    void setPullToRefreshOverScrollEnabled(boolean enabled);

    void setRefreshing(boolean doScroll);

    void setScrollAnimationInterpolator(Interpolator interpolator);

    void setScrollingWhileRefreshingEnabled(boolean scrollingWhileRefreshingEnabled);

    void setShowViewWhileRefreshing(boolean showView);
}
