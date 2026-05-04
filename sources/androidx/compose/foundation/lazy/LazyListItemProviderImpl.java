package androidx.compose.foundation.lazy;

import androidx.collection.IntList;
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
final class LazyListItemProviderImpl implements LazyListItemProvider {

    @k
    private final LazyListIntervalContent intervalContent;

    @k
    private final LazyItemScopeImpl itemScope;

    @k
    private final LazyLayoutKeyIndexMap keyIndexMap;

    @k
    private final LazyListState state;

    public LazyListItemProviderImpl(@k LazyListState lazyListState, @k LazyListIntervalContent lazyListIntervalContent, @k LazyItemScopeImpl lazyItemScopeImpl, @k LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap) {
        this.state = lazyListState;
        this.intervalContent = lazyListIntervalContent;
        this.itemScope = lazyItemScopeImpl;
        this.keyIndexMap = lazyLayoutKeyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Composable
    public void Item(final int i11, @k Object obj, @l Composer composer, int i12) {
        composer.startReplaceGroup(-462424778);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-462424778, i12, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:80)");
        }
        LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(obj, i11, this.state.getPinnedItems$foundation_release(), ComposableLambdaKt.rememberComposableLambda(-824725566, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderImpl$Item$1
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
                LazyListIntervalContent lazyListIntervalContent;
                if (!composer2.shouldExecute((i13 & 3) != 2, i13 & 1)) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-824725566, i13, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item.<anonymous> (LazyListItemProvider.kt:82)");
                }
                lazyListIntervalContent = LazyListItemProviderImpl.this.intervalContent;
                int i14 = i11;
                LazyListItemProviderImpl lazyListItemProviderImpl = LazyListItemProviderImpl.this;
                IntervalList.Interval<LazyListInterval> interval = lazyListIntervalContent.getIntervals().get(i14);
                interval.getValue().getItem().invoke(lazyListItemProviderImpl.getItemScope(), Integer.valueOf(i14 - interval.getStartIndex()), composer2, 0);
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
        if (obj instanceof LazyListItemProviderImpl) {
            return g0.g(this.intervalContent, ((LazyListItemProviderImpl) obj).intervalContent);
        }
        return false;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @l
    public Object getContentType(int i11) {
        return this.intervalContent.getContentType(i11);
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    @k
    public IntList getHeaderIndexes() {
        return this.intervalContent.getHeaderIndexes();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getIndex(@k Object obj) {
        return getKeyIndexMap().getIndex(obj);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getItemCount() {
        return this.intervalContent.getItemCount();
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    @k
    public LazyItemScopeImpl getItemScope() {
        return this.itemScope;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @k
    public Object getKey(int i11) {
        Object key = getKeyIndexMap().getKey(i11);
        return key == null ? this.intervalContent.getKey(i11) : key;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    @k
    public LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.keyIndexMap;
    }

    public int hashCode() {
        return this.intervalContent.hashCode();
    }
}
