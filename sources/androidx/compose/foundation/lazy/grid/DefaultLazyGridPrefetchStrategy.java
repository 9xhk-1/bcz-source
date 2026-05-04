package androidx.compose.foundation.lazy.grid;

import a00.r0;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import java.util.List;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@u0({"SMAP\nLazyGridPrefetchStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridPrefetchStrategy.kt\nandroidx/compose/foundation/lazy/grid/DefaultLazyGridPrefetchStrategy\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,230:1\n1101#2:231\n1083#2,2:232\n423#3,9:234\n136#3:243\n423#3,9:244\n423#3,9:253\n423#3,9:262\n1#4:271\n*S KotlinDebug\n*F\n+ 1 LazyGridPrefetchStrategy.kt\nandroidx/compose/foundation/lazy/grid/DefaultLazyGridPrefetchStrategy\n*L\n134#1:231\n134#1:232,2\n174#1:234,9\n179#1:243\n190#1:244,9\n199#1:253,9\n220#1:262,9\n*E\n"})
/* loaded from: classes.dex */
final class DefaultLazyGridPrefetchStrategy implements LazyGridPrefetchStrategy {

    @k
    private final MutableVector<LazyLayoutPrefetchState.PrefetchHandle> currentLinePrefetchHandles;
    private int lineToPrefetch;
    private final int nestedPrefetchItemCount;
    private boolean wasScrollingForward;

    public DefaultLazyGridPrefetchStrategy() {
        this(0, 1, null);
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public void onNestedPrefetch(@k NestedPrefetchScope nestedPrefetchScope, int i11) {
        int i12 = this.nestedPrefetchItemCount;
        for (int i13 = 0; i13 < i12; i13++) {
            nestedPrefetchScope.schedulePrefetch(i11 + i13);
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public void onScroll(@k LazyGridPrefetchScope lazyGridPrefetchScope, float f11, @k LazyGridLayoutInfo lazyGridLayoutInfo) {
        int row;
        int index;
        if (lazyGridLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            return;
        }
        int i11 = 0;
        boolean z11 = f11 < 0.0f;
        if (z11) {
            LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) r0.u3(lazyGridLayoutInfo.getVisibleItemsInfo());
            row = (lazyGridLayoutInfo.getOrientation() == Orientation.Vertical ? lazyGridItemInfo.getRow() : lazyGridItemInfo.getColumn()) + 1;
            index = ((LazyGridItemInfo) r0.u3(lazyGridLayoutInfo.getVisibleItemsInfo())).getIndex() + 1;
        } else {
            LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) r0.G2(lazyGridLayoutInfo.getVisibleItemsInfo());
            row = (lazyGridLayoutInfo.getOrientation() == Orientation.Vertical ? lazyGridItemInfo2.getRow() : lazyGridItemInfo2.getColumn()) - 1;
            index = ((LazyGridItemInfo) r0.G2(lazyGridLayoutInfo.getVisibleItemsInfo())).getIndex() - 1;
        }
        if (index < 0 || index >= lazyGridLayoutInfo.getTotalItemsCount()) {
            return;
        }
        if (row != this.lineToPrefetch && row >= 0) {
            if (this.wasScrollingForward != z11) {
                MutableVector<LazyLayoutPrefetchState.PrefetchHandle> mutableVector = this.currentLinePrefetchHandles;
                LazyLayoutPrefetchState.PrefetchHandle[] prefetchHandleArr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i12 = 0; i12 < size; i12++) {
                    prefetchHandleArr[i12].cancel();
                }
            }
            this.wasScrollingForward = z11;
            this.lineToPrefetch = row;
            this.currentLinePrefetchHandles.clear();
            MutableVector<LazyLayoutPrefetchState.PrefetchHandle> mutableVector2 = this.currentLinePrefetchHandles;
            mutableVector2.addAll(mutableVector2.getSize(), (List<? extends LazyLayoutPrefetchState.PrefetchHandle>) lazyGridPrefetchScope.scheduleLinePrefetch(row));
        }
        if (!z11) {
            if (lazyGridLayoutInfo.getViewportStartOffset() - LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis((LazyGridItemInfo) r0.G2(lazyGridLayoutInfo.getVisibleItemsInfo()), lazyGridLayoutInfo.getOrientation()) < f11) {
                MutableVector<LazyLayoutPrefetchState.PrefetchHandle> mutableVector3 = this.currentLinePrefetchHandles;
                LazyLayoutPrefetchState.PrefetchHandle[] prefetchHandleArr2 = mutableVector3.content;
                int size2 = mutableVector3.getSize();
                while (i11 < size2) {
                    prefetchHandleArr2[i11].markAsUrgent();
                    i11++;
                }
                return;
            }
            return;
        }
        LazyGridItemInfo lazyGridItemInfo3 = (LazyGridItemInfo) r0.u3(lazyGridLayoutInfo.getVisibleItemsInfo());
        if (((LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridItemInfo3, lazyGridLayoutInfo.getOrientation()) + LazyGridSnapLayoutInfoProviderKt.sizeOnMainAxis(lazyGridItemInfo3, lazyGridLayoutInfo.getOrientation())) + lazyGridLayoutInfo.getMainAxisItemSpacing()) - lazyGridLayoutInfo.getViewportEndOffset() < (-f11)) {
            MutableVector<LazyLayoutPrefetchState.PrefetchHandle> mutableVector4 = this.currentLinePrefetchHandles;
            LazyLayoutPrefetchState.PrefetchHandle[] prefetchHandleArr3 = mutableVector4.content;
            int size3 = mutableVector4.getSize();
            while (i11 < size3) {
                prefetchHandleArr3[i11].markAsUrgent();
                i11++;
            }
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public void onVisibleItemsUpdated(@k LazyGridPrefetchScope lazyGridPrefetchScope, @k LazyGridLayoutInfo lazyGridLayoutInfo) {
        int row;
        if (this.lineToPrefetch == -1 || lazyGridLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            return;
        }
        if (this.wasScrollingForward) {
            LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) r0.u3(lazyGridLayoutInfo.getVisibleItemsInfo());
            row = (lazyGridLayoutInfo.getOrientation() == Orientation.Vertical ? lazyGridItemInfo.getRow() : lazyGridItemInfo.getColumn()) + 1;
        } else {
            LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) r0.G2(lazyGridLayoutInfo.getVisibleItemsInfo());
            row = (lazyGridLayoutInfo.getOrientation() == Orientation.Vertical ? lazyGridItemInfo2.getRow() : lazyGridItemInfo2.getColumn()) - 1;
        }
        if (this.lineToPrefetch != row) {
            this.lineToPrefetch = -1;
            MutableVector<LazyLayoutPrefetchState.PrefetchHandle> mutableVector = this.currentLinePrefetchHandles;
            LazyLayoutPrefetchState.PrefetchHandle[] prefetchHandleArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i11 = 0; i11 < size; i11++) {
                prefetchHandleArr[i11].cancel();
            }
            this.currentLinePrefetchHandles.clear();
        }
    }

    public DefaultLazyGridPrefetchStrategy(int i11) {
        this.nestedPrefetchItemCount = i11;
        this.lineToPrefetch = -1;
        this.currentLinePrefetchHandles = new MutableVector<>(new LazyLayoutPrefetchState.PrefetchHandle[16], 0);
    }

    public /* synthetic */ DefaultLazyGridPrefetchStrategy(int i11, int i12, v vVar) {
        this((i12 & 1) != 0 ? 2 : i11);
    }
}
