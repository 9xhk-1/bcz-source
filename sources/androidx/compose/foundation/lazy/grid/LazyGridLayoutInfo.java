package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface LazyGridLayoutInfo {
    int getAfterContentPadding();

    int getBeforeContentPadding();

    int getMainAxisItemSpacing();

    int getMaxSpan();

    @k
    Orientation getOrientation();

    boolean getReverseLayout();

    int getTotalItemsCount();

    int getViewportEndOffset();

    /* renamed from: getViewportSize-YbymL2g, reason: not valid java name */
    long mo869getViewportSizeYbymL2g();

    int getViewportStartOffset();

    @k
    List<LazyGridItemInfo> getVisibleItemsInfo();
}
