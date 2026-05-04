package com.handmark.pulltorefresh.library;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import com.handmark.pulltorefresh.library.PullToRefreshBase;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class PullToRefreshScrollView extends PullToRefreshBase<ScrollView> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @TargetApi(9)
    public final class a extends ScrollView {
        public a(Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        public final int a() {
            if (getChildCount() > 0) {
                return Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
            }
            return 0;
        }

        @Override // android.view.View
        public boolean overScrollBy(int deltaX, int deltaY, int scrollX, int scrollY, int scrollRangeX, int scrollRangeY, int maxOverScrollX, int maxOverScrollY, boolean isTouchEvent) {
            boolean overScrollBy = super.overScrollBy(deltaX, deltaY, scrollX, scrollY, scrollRangeX, scrollRangeY, maxOverScrollX, maxOverScrollY, isTouchEvent);
            b.c(PullToRefreshScrollView.this, deltaX, scrollX, deltaY, scrollY, a(), isTouchEvent);
            return overScrollBy;
        }
    }

    public PullToRefreshScrollView(Context context) {
        super(context);
    }

    @Override // com.handmark.pulltorefresh.library.PullToRefreshBase
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public ScrollView q(Context context, AttributeSet attrs) {
        a aVar = new a(context, attrs);
        aVar.setId(R.id.scrollview);
        return aVar;
    }

    @Override // com.handmark.pulltorefresh.library.PullToRefreshBase
    public final PullToRefreshBase.Orientation getPullToRefreshScrollDirection() {
        return PullToRefreshBase.Orientation.VERTICAL;
    }

    @Override // com.handmark.pulltorefresh.library.PullToRefreshBase
    public boolean w() {
        View childAt = ((ScrollView) this.f35097k).getChildAt(0);
        return childAt != null && ((ScrollView) this.f35097k).getScrollY() >= childAt.getHeight() - getHeight();
    }

    @Override // com.handmark.pulltorefresh.library.PullToRefreshBase
    public boolean x() {
        return ((ScrollView) this.f35097k).getScrollY() == 0;
    }

    public PullToRefreshScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PullToRefreshScrollView(Context context, PullToRefreshBase.Mode mode) {
        super(context, mode);
    }

    public PullToRefreshScrollView(Context context, PullToRefreshBase.Mode mode, PullToRefreshBase.AnimationStyle style) {
        super(context, mode, style);
    }
}
