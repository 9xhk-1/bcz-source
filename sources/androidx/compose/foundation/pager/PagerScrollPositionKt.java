package androidx.compose.foundation.pager;

import c10.d;
import m80.k;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class PagerScrollPositionKt {
    public static final int NearestItemsExtraItemCount = 100;
    public static final int NearestItemsSlidingWindowSize = 30;

    public static final long currentAbsoluteScrollOffset(@k PagerState pagerState) {
        return (pagerState.getCurrentPage() * pagerState.getPageSizeWithSpacing$foundation_release()) + d.N0(pagerState.getCurrentPageOffsetFraction() * pagerState.getPageSizeWithSpacing$foundation_release());
    }

    private static final void debugLog(a<String> aVar) {
    }
}
