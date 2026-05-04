package com.handmark.pulltorefresh.library;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;
import com.handmark.pulltorefresh.library.PullToRefreshBase;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class PullToRefreshGridView extends PullToRefreshAdapterViewBase<GridView> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends GridView implements lq.a {
        public a(Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        @Override // android.widget.AdapterView, lq.a
        public void setEmptyView(View emptyView) {
            PullToRefreshGridView.this.setEmptyView(emptyView);
        }

        @Override // lq.a
        public void setEmptyViewInternal(View emptyView) {
            super.setEmptyView(emptyView);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @TargetApi(9)
    public final class b extends a {
        public b(Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        @Override // android.view.View
        public boolean overScrollBy(int deltaX, int deltaY, int scrollX, int scrollY, int scrollRangeX, int scrollRangeY, int maxOverScrollX, int maxOverScrollY, boolean isTouchEvent) {
            boolean overScrollBy = super.overScrollBy(deltaX, deltaY, scrollX, scrollY, scrollRangeX, scrollRangeY, maxOverScrollX, maxOverScrollY, isTouchEvent);
            com.handmark.pulltorefresh.library.b.d(PullToRefreshGridView.this, deltaX, scrollX, deltaY, scrollY, isTouchEvent);
            return overScrollBy;
        }
    }

    public PullToRefreshGridView(Context context) {
        super(context);
    }

    @Override // com.handmark.pulltorefresh.library.PullToRefreshBase
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final GridView q(Context context, AttributeSet attrs) {
        b bVar = new b(context, attrs);
        bVar.setId(R.id.gridview);
        return bVar;
    }

    @Override // com.handmark.pulltorefresh.library.PullToRefreshBase
    public final PullToRefreshBase.Orientation getPullToRefreshScrollDirection() {
        return PullToRefreshBase.Orientation.VERTICAL;
    }

    public PullToRefreshGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PullToRefreshGridView(Context context, PullToRefreshBase.Mode mode) {
        super(context, mode);
    }

    public PullToRefreshGridView(Context context, PullToRefreshBase.Mode mode, PullToRefreshBase.AnimationStyle style) {
        super(context, mode, style);
    }
}
