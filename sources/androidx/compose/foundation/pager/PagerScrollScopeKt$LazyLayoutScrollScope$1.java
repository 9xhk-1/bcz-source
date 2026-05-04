package androidx.compose.foundation.pager;

import a00.r0;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import c10.d;
import g10.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class PagerScrollScopeKt$LazyLayoutScrollScope$1 implements LazyLayoutScrollScope, ScrollScope {
    private final /* synthetic */ ScrollScope $$delegate_0;
    final /* synthetic */ PagerState $state;

    public PagerScrollScopeKt$LazyLayoutScrollScope$1(ScrollScope scrollScope, PagerState pagerState) {
        this.$state = pagerState;
        this.$$delegate_0 = scrollScope;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public int calculateDistanceTo(int i11, int i12) {
        return (int) (u.K(PagerScrollPositionKt.currentAbsoluteScrollOffset(this.$state) + d.L0((((i11 - this.$state.getCurrentPage()) * this.$state.getPageSizeWithSpacing$foundation_release()) - (this.$state.getCurrentPageOffsetFraction() * this.$state.getPageSizeWithSpacing$foundation_release())) + i12), this.$state.getMinScrollOffset$foundation_release(), this.$state.getMaxScrollOffset$foundation_release()) - PagerScrollPositionKt.currentAbsoluteScrollOffset(this.$state));
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public int getFirstVisibleItemIndex() {
        return this.$state.getFirstVisiblePage$foundation_release();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public int getFirstVisibleItemScrollOffset() {
        return this.$state.getFirstVisiblePageOffset$foundation_release();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public int getItemCount() {
        return this.$state.getPageCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public int getLastVisibleItemIndex() {
        return ((PageInfo) r0.u3(this.$state.getLayoutInfo().getVisiblePagesInfo())).getIndex();
    }

    @Override // androidx.compose.foundation.gestures.ScrollScope
    public float scrollBy(float f11) {
        return this.$$delegate_0.scrollBy(f11);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public void snapToItem(int i11, int i12) {
        this.$state.snapToItem$foundation_release(i11, i12 / this.$state.getPageSizeWithSpacing$foundation_release(), true);
    }
}
