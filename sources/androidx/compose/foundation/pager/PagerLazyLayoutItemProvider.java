package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import x00.p;
import x00.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class PagerLazyLayoutItemProvider implements LazyLayoutItemProvider {
    public static final int $stable = 0;

    @k
    private final LazyLayoutIntervalContent<PagerIntervalContent> intervalContent;

    @k
    private final LazyLayoutKeyIndexMap keyIndexMap;

    @k
    private final PagerScopeImpl pagerScopeImpl = PagerScopeImpl.INSTANCE;

    @k
    private final PagerState state;

    public PagerLazyLayoutItemProvider(@k PagerState pagerState, @k LazyLayoutIntervalContent<PagerIntervalContent> lazyLayoutIntervalContent, @k LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap) {
        this.state = pagerState;
        this.intervalContent = lazyLayoutIntervalContent;
        this.keyIndexMap = lazyLayoutKeyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Composable
    public void Item(final int i11, @k Object obj, @l Composer composer, int i12) {
        composer.startReplaceGroup(-1201380429);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1201380429, i12, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item (LazyLayoutPager.kt:210)");
        }
        LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(obj, i11, this.state.getPinnedPages$foundation_release(), ComposableLambdaKt.rememberComposableLambda(1142237095, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.pager.PagerLazyLayoutItemProvider$Item$1
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
                LazyLayoutIntervalContent lazyLayoutIntervalContent;
                PagerScopeImpl pagerScopeImpl;
                if (!composer2.shouldExecute((i13 & 3) != 2, i13 & 1)) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1142237095, i13, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item.<anonymous> (LazyLayoutPager.kt:212)");
                }
                lazyLayoutIntervalContent = PagerLazyLayoutItemProvider.this.intervalContent;
                int i14 = i11;
                PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider = PagerLazyLayoutItemProvider.this;
                IntervalList.Interval interval = lazyLayoutIntervalContent.getIntervals().get(i14);
                int startIndex = i14 - interval.getStartIndex();
                r<PagerScope, Integer, Composer, Integer, g2> item = ((PagerIntervalContent) interval.getValue()).getItem();
                pagerScopeImpl = pagerLazyLayoutItemProvider.pagerScopeImpl;
                item.invoke(pagerScopeImpl, Integer.valueOf(startIndex), composer2, 0);
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
        if (obj instanceof PagerLazyLayoutItemProvider) {
            return g0.g(this.intervalContent, ((PagerLazyLayoutItemProvider) obj).intervalContent);
        }
        return false;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getIndex(@k Object obj) {
        return this.keyIndexMap.getIndex(obj);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getItemCount() {
        return this.intervalContent.getItemCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @k
    public Object getKey(int i11) {
        Object key = this.keyIndexMap.getKey(i11);
        return key == null ? this.intervalContent.getKey(i11) : key;
    }

    public int hashCode() {
        return this.intervalContent.hashCode();
    }
}
