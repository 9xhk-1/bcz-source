package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import g10.u;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider\n+ 2 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1475:1\n1129#2:1476\n1135#2:1478\n1132#2:1479\n1129#2:1481\n85#3:1477\n90#3:1480\n85#3:1482\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider\n*L\n1255#1:1476\n1256#1:1478\n1256#1:1479\n1256#1:1481\n1255#1:1477\n1256#1:1480\n1256#1:1482\n*E\n"})
/* loaded from: classes.dex */
public abstract class LazyStaggeredGridMeasureProvider implements LazyLayoutMeasuredItemProvider<LazyStaggeredGridMeasuredItem> {
    public static final int $stable = 8;
    private final boolean isVertical;

    @k
    private final LazyStaggeredGridItemProvider itemProvider;

    @k
    private final LazyLayoutMeasureScope measureScope;

    @k
    private final LazyStaggeredGridSlots resolvedSlots;

    public LazyStaggeredGridMeasureProvider(boolean z11, @k LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, @k LazyLayoutMeasureScope lazyLayoutMeasureScope, @k LazyStaggeredGridSlots lazyStaggeredGridSlots) {
        this.isVertical = z11;
        this.itemProvider = lazyStaggeredGridItemProvider;
        this.measureScope = lazyLayoutMeasureScope;
        this.resolvedSlots = lazyStaggeredGridSlots;
    }

    /* renamed from: childConstraints-JhjzzOo, reason: not valid java name */
    private final long m947childConstraintsJhjzzOo(int i11, int i12) {
        int i13;
        if (i12 == 1) {
            i13 = this.resolvedSlots.getSizes()[i11];
        } else {
            int i14 = this.resolvedSlots.getPositions()[i11];
            int i15 = (i11 + i12) - 1;
            i13 = (this.resolvedSlots.getPositions()[i15] + this.resolvedSlots.getSizes()[i15]) - i14;
        }
        return this.isVertical ? Constraints.Companion.m5080fixedWidthOenEA2s(i13) : Constraints.Companion.m5079fixedHeightOenEA2s(i13);
    }

    @k
    /* renamed from: createItem-pitSLOA */
    public abstract LazyStaggeredGridMeasuredItem mo941createItempitSLOA(int i11, int i12, int i13, @k Object obj, @l Object obj2, @k List<? extends Placeable> list, long j11);

    @k
    /* renamed from: getAndMeasure-jy6DScQ, reason: not valid java name */
    public final LazyStaggeredGridMeasuredItem m948getAndMeasurejy6DScQ(int i11, long j11) {
        Object key = this.itemProvider.getKey(i11);
        Object contentType = this.itemProvider.getContentType(i11);
        int length = this.resolvedSlots.getSizes().length;
        int i12 = (int) (j11 >> 32);
        int B = u.B(i12, length - 1);
        int B2 = u.B(((int) (j11 & 4294967295L)) - i12, length - B);
        long m947childConstraintsJhjzzOo = m947childConstraintsJhjzzOo(B, B2);
        return mo941createItempitSLOA(i11, B, B2, key, contentType, this.measureScope.mo900measure0kLqBqw(i11, m947childConstraintsJhjzzOo), m947childConstraintsJhjzzOo);
    }

    @k
    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.itemProvider.getKeyIndexMap();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider
    @k
    /* renamed from: getAndMeasure--hBUhpc, reason: avoid collision after fix types in other method */
    public LazyStaggeredGridMeasuredItem mo842getAndMeasurehBUhpc(int i11, int i12, int i13, long j11) {
        return mo941createItempitSLOA(i11, i12, i13, this.itemProvider.getKey(i11), this.itemProvider.getContentType(i11), this.measureScope.mo900measure0kLqBqw(i11, j11), j11);
    }
}
