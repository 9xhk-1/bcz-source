package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import java.util.List;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface PagerLayoutInfo {
    int getAfterContentPadding();

    int getBeforeContentPadding();

    int getBeyondViewportPageCount();

    @k
    Orientation getOrientation();

    int getPageSize();

    int getPageSpacing();

    boolean getReverseLayout();

    @k
    SnapPosition getSnapPosition();

    int getViewportEndOffset();

    /* renamed from: getViewportSize-YbymL2g, reason: not valid java name */
    long mo974getViewportSizeYbymL2g();

    int getViewportStartOffset();

    @k
    List<PageInfo> getVisiblePagesInfo();

    static /* synthetic */ void getReverseLayout$annotations() {
    }
}
