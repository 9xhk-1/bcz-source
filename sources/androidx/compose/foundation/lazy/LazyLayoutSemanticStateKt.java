package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.ui.semantics.CollectionInfo;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import m80.k;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LazyLayoutSemanticStateKt {
    @k
    public static final LazyLayoutSemanticState LazyLayoutSemanticState(@k final LazyListState lazyListState, final boolean z11) {
        return new LazyLayoutSemanticState() { // from class: androidx.compose.foundation.lazy.LazyLayoutSemanticStateKt$LazyLayoutSemanticState$1
            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public CollectionInfo collectionInfo() {
                return z11 ? new CollectionInfo(-1, 1) : new CollectionInfo(1, -1);
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public int getContentPadding() {
                return LazyListState.this.getLayoutInfo().getBeforeContentPadding() + LazyListState.this.getLayoutInfo().getAfterContentPadding();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public float getMaxScrollOffset() {
                return LazyLayoutSemanticsKt.estimatedLazyMaxScrollOffset(LazyListState.this.getFirstVisibleItemIndex(), LazyListState.this.getFirstVisibleItemScrollOffset(), LazyListState.this.getCanScrollForward());
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public float getScrollOffset() {
                return LazyLayoutSemanticsKt.estimatedLazyScrollOffset(LazyListState.this.getFirstVisibleItemIndex(), LazyListState.this.getFirstVisibleItemScrollOffset());
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public int getViewport() {
                return (int) (LazyListState.this.getLayoutInfo().getOrientation() == Orientation.Vertical ? LazyListState.this.getLayoutInfo().mo833getViewportSizeYbymL2g() & 4294967295L : LazyListState.this.getLayoutInfo().mo833getViewportSizeYbymL2g() >> 32);
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public Object scrollToItem(int i11, c<? super g2> cVar) {
                Object scrollToItem$default = LazyListState.scrollToItem$default(LazyListState.this, i11, 0, cVar, 2, null);
                return scrollToItem$default == b.l() ? scrollToItem$default : g2.f100423a;
            }
        };
    }
}
