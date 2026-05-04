package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.ui.semantics.CollectionInfo;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import m80.k;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LazyLayoutSemanticStateKt {
    @k
    public static final LazyLayoutSemanticState LazyLayoutSemanticState(@k final PagerState pagerState, final boolean z11) {
        return new LazyLayoutSemanticState() { // from class: androidx.compose.foundation.pager.LazyLayoutSemanticStateKt$LazyLayoutSemanticState$1
            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public CollectionInfo collectionInfo() {
                return z11 ? new CollectionInfo(PagerState.this.getPageCount(), 1) : new CollectionInfo(1, PagerState.this.getPageCount());
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public int getContentPadding() {
                return PagerState.this.getLayoutInfo().getBeforeContentPadding() + PagerState.this.getLayoutInfo().getAfterContentPadding();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public float getMaxScrollOffset() {
                return PagerStateKt.calculateNewMaxScrollOffset(PagerState.this.getLayoutInfo(), PagerState.this.getPageCount());
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public float getScrollOffset() {
                return PagerScrollPositionKt.currentAbsoluteScrollOffset(PagerState.this);
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public int getViewport() {
                return (int) (PagerState.this.getLayoutInfo().getOrientation() == Orientation.Vertical ? PagerState.this.getLayoutInfo().mo974getViewportSizeYbymL2g() & 4294967295L : PagerState.this.getLayoutInfo().mo974getViewportSizeYbymL2g() >> 32);
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public Object scrollToItem(int i11, c<? super g2> cVar) {
                Object scrollToPage$default = PagerState.scrollToPage$default(PagerState.this, i11, 0.0f, cVar, 2, null);
                return scrollToPage$default == b.l() ? scrollToPage$default : g2.f100423a;
            }
        };
    }
}
