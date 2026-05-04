package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface LazyStaggeredGridLayoutInfo {
    int getAfterContentPadding();

    int getBeforeContentPadding();

    int getMainAxisItemSpacing();

    @k
    Orientation getOrientation();

    int getTotalItemsCount();

    int getViewportEndOffset();

    /* renamed from: getViewportSize-YbymL2g, reason: not valid java name */
    long mo935getViewportSizeYbymL2g();

    int getViewportStartOffset();

    @k
    List<LazyStaggeredGridItemInfo> getVisibleItemsInfo();
}
