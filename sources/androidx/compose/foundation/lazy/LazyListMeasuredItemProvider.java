package androidx.compose.foundation.lazy;

import androidx.collection.IntList;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.List;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public abstract class LazyListMeasuredItemProvider implements LazyLayoutMeasuredItemProvider<LazyListMeasuredItem> {
    public static final int $stable = 0;
    private final long childConstraints;

    @k
    private final LazyListItemProvider itemProvider;

    @k
    private final LazyLayoutMeasureScope measureScope;

    public /* synthetic */ LazyListMeasuredItemProvider(long j11, boolean z11, LazyListItemProvider lazyListItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope, v vVar) {
        this(j11, z11, lazyListItemProvider, lazyLayoutMeasureScope);
    }

    /* renamed from: getAndMeasure-0kLqBqw$default, reason: not valid java name */
    public static /* synthetic */ LazyListMeasuredItem m841getAndMeasure0kLqBqw$default(LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i11, long j11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAndMeasure-0kLqBqw");
        }
        if ((i12 & 2) != 0) {
            j11 = lazyListMeasuredItemProvider.childConstraints;
        }
        return lazyListMeasuredItemProvider.m843getAndMeasure0kLqBqw(i11, j11);
    }

    @k
    /* renamed from: createItem-X9ElhV4 */
    public abstract LazyListMeasuredItem mo831createItemX9ElhV4(int i11, @k Object obj, @l Object obj2, @k List<? extends Placeable> list, long j11);

    @k
    /* renamed from: getAndMeasure-0kLqBqw, reason: not valid java name */
    public final LazyListMeasuredItem m843getAndMeasure0kLqBqw(int i11, long j11) {
        return mo831createItemX9ElhV4(i11, this.itemProvider.getKey(i11), this.itemProvider.getContentType(i11), this.measureScope.mo900measure0kLqBqw(i11, j11), j11);
    }

    /* renamed from: getChildConstraints-msEJaDk, reason: not valid java name */
    public final long m844getChildConstraintsmsEJaDk() {
        return this.childConstraints;
    }

    @k
    public final IntList getHeaderIndexes() {
        return this.itemProvider.getHeaderIndexes();
    }

    @k
    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.itemProvider.getKeyIndexMap();
    }

    private LazyListMeasuredItemProvider(long j11, boolean z11, LazyListItemProvider lazyListItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope) {
        this.itemProvider = lazyListItemProvider;
        this.measureScope = lazyLayoutMeasureScope;
        this.childConstraints = ConstraintsKt.Constraints$default(0, z11 ? Constraints.m5068getMaxWidthimpl(j11) : Integer.MAX_VALUE, 0, z11 ? Integer.MAX_VALUE : Constraints.m5067getMaxHeightimpl(j11), 5, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider
    @k
    /* renamed from: getAndMeasure--hBUhpc, reason: not valid java name */
    public LazyListMeasuredItem mo842getAndMeasurehBUhpc(int i11, int i12, int i13, long j11) {
        return m843getAndMeasure0kLqBqw(i11, j11);
    }
}
