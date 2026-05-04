package com.baicizhan.client.business.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.handmark.pulltorefresh.library.PullToRefreshAdapterViewBase;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class PullToRefreshPinnedSectionListView extends PullToRefreshAdapterViewBase<PinnedSectionListView> {
    public PullToRefreshPinnedSectionListView(Context context) {
        super(context);
    }

    @Override // com.handmark.pulltorefresh.library.PullToRefreshBase
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public PinnedSectionListView q(Context context, AttributeSet attrs) {
        PinnedSectionListView pinnedSectionListView = new PinnedSectionListView(context, attrs);
        pinnedSectionListView.setId(R.id.ptr_pinned_section_listview);
        return pinnedSectionListView;
    }

    @Override // com.handmark.pulltorefresh.library.PullToRefreshBase
    public PullToRefreshBase.Orientation getPullToRefreshScrollDirection() {
        return PullToRefreshBase.Orientation.VERTICAL;
    }

    public PullToRefreshPinnedSectionListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PullToRefreshPinnedSectionListView(Context context, PullToRefreshBase.Mode mode) {
        super(context, mode);
    }
}
