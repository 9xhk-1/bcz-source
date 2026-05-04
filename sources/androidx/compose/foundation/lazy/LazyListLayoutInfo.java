package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface LazyListLayoutInfo {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        public static int getAfterContentPadding(@k LazyListLayoutInfo lazyListLayoutInfo) {
            return LazyListLayoutInfo.super.getAfterContentPadding();
        }

        @Deprecated
        public static int getBeforeContentPadding(@k LazyListLayoutInfo lazyListLayoutInfo) {
            return LazyListLayoutInfo.super.getBeforeContentPadding();
        }

        @Deprecated
        public static int getMainAxisItemSpacing(@k LazyListLayoutInfo lazyListLayoutInfo) {
            return LazyListLayoutInfo.super.getMainAxisItemSpacing();
        }

        @Deprecated
        @k
        public static Orientation getOrientation(@k LazyListLayoutInfo lazyListLayoutInfo) {
            return LazyListLayoutInfo.super.getOrientation();
        }

        @Deprecated
        public static boolean getReverseLayout(@k LazyListLayoutInfo lazyListLayoutInfo) {
            return LazyListLayoutInfo.super.getReverseLayout();
        }

        @Deprecated
        /* renamed from: getViewportSize-YbymL2g, reason: not valid java name */
        public static long m834getViewportSizeYbymL2g(@k LazyListLayoutInfo lazyListLayoutInfo) {
            return LazyListLayoutInfo.super.mo833getViewportSizeYbymL2g();
        }
    }

    default int getAfterContentPadding() {
        return 0;
    }

    default int getBeforeContentPadding() {
        return 0;
    }

    default int getMainAxisItemSpacing() {
        return 0;
    }

    @k
    default Orientation getOrientation() {
        return Orientation.Vertical;
    }

    default boolean getReverseLayout() {
        return false;
    }

    int getTotalItemsCount();

    int getViewportEndOffset();

    /* renamed from: getViewportSize-YbymL2g, reason: not valid java name */
    default long mo833getViewportSizeYbymL2g() {
        return IntSize.Companion.m5291getZeroYbymL2g();
    }

    int getViewportStartOffset();

    @k
    List<LazyListItemInfo> getVisibleItemsInfo();
}
