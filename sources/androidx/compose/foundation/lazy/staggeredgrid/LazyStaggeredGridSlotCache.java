package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlotCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,520:1\n1#2:521\n*E\n"})
/* loaded from: classes.dex */
final class LazyStaggeredGridSlotCache implements LazyGridStaggeredGridSlotsProvider {
    private long cachedConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    private float cachedDensity;

    @l
    private LazyStaggeredGridSlots cachedSizes;

    @k
    private final p<Density, Constraints, LazyStaggeredGridSlots> calculation;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridSlotCache(@k p<? super Density, ? super Constraints, LazyStaggeredGridSlots> pVar) {
        this.calculation = pVar;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider
    @k
    /* renamed from: invoke-0kLqBqw */
    public LazyStaggeredGridSlots mo925invoke0kLqBqw(@k Density density, long j11) {
        if (this.cachedSizes != null && Constraints.m5061equalsimpl0(this.cachedConstraints, j11) && this.cachedDensity == density.getDensity()) {
            LazyStaggeredGridSlots lazyStaggeredGridSlots = this.cachedSizes;
            g0.m(lazyStaggeredGridSlots);
            return lazyStaggeredGridSlots;
        }
        this.cachedConstraints = j11;
        this.cachedDensity = density.getDensity();
        LazyStaggeredGridSlots invoke = this.calculation.invoke(density, Constraints.m5055boximpl(j11));
        this.cachedSizes = invoke;
        return invoke;
    }
}
