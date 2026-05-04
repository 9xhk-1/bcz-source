package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class LazyStaggeredGridItemProviderImpl implements LazyStaggeredGridItemProvider {

    @k
    private final LazyStaggeredGridIntervalContent intervalContent;

    @k
    private final LazyLayoutKeyIndexMap keyIndexMap;

    @k
    private final LazyStaggeredGridState state;

    public LazyStaggeredGridItemProviderImpl(@k LazyStaggeredGridState lazyStaggeredGridState, @k LazyStaggeredGridIntervalContent lazyStaggeredGridIntervalContent, @k LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap) {
        this.state = lazyStaggeredGridState;
        this.intervalContent = lazyStaggeredGridIntervalContent;
        this.keyIndexMap = lazyLayoutKeyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Composable
    public void Item(final int i11, @k Object obj, @l Composer composer, int i12) {
        composer.startReplaceGroup(89098518);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(89098518, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl.Item (LazyStaggeredGridItemProvider.kt:77)");
        }
        LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(obj, i11, this.state.getPinnedItems$foundation_release(), ComposableLambdaKt.rememberComposableLambda(608834466, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl$Item$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return g2.f100423a;
            }

            @Composable
            public final void invoke(Composer composer2, int i13) {
                LazyStaggeredGridIntervalContent lazyStaggeredGridIntervalContent;
                if (!composer2.shouldExecute((i13 & 3) != 2, i13 & 1)) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(608834466, i13, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl.Item.<anonymous> (LazyStaggeredGridItemProvider.kt:79)");
                }
                lazyStaggeredGridIntervalContent = LazyStaggeredGridItemProviderImpl.this.intervalContent;
                int i14 = i11;
                IntervalList.Interval<LazyStaggeredGridInterval> interval = lazyStaggeredGridIntervalContent.getIntervals().get(i14);
                interval.getValue().getItem().invoke(LazyStaggeredGridItemScopeImpl.INSTANCE, Integer.valueOf(i14 - interval.getStartIndex()), composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, ((i12 >> 3) & 14) | 3072 | ((i12 << 3) & 112));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LazyStaggeredGridItemProviderImpl) {
            return g0.g(this.intervalContent, ((LazyStaggeredGridItemProviderImpl) obj).intervalContent);
        }
        return false;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @l
    public Object getContentType(int i11) {
        return this.intervalContent.getContentType(i11);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getIndex(@k Object obj) {
        return getKeyIndexMap().getIndex(obj);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getItemCount() {
        return this.intervalContent.getItemCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @k
    public Object getKey(int i11) {
        Object key = getKeyIndexMap().getKey(i11);
        return key == null ? this.intervalContent.getKey(i11) : key;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider
    @k
    public LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.keyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider
    @k
    public LazyStaggeredGridSpanProvider getSpanProvider() {
        return this.intervalContent.getSpanProvider();
    }

    public int hashCode() {
        return this.intervalContent.hashCode();
    }
}
