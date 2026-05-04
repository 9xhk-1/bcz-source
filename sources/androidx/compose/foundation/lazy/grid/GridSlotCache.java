package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridSlotCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,656:1\n1#2:657\n*E\n"})
/* loaded from: classes.dex */
final class GridSlotCache implements LazyGridSlotsProvider {
    private long cachedConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    private float cachedDensity;

    @l
    private LazyGridSlots cachedSizes;

    @k
    private final p<Density, Constraints, LazyGridSlots> calculation;

    /* JADX WARN: Multi-variable type inference failed */
    public GridSlotCache(@k p<? super Density, ? super Constraints, LazyGridSlots> pVar) {
        this.calculation = pVar;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider
    @k
    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public LazyGridSlots mo855invoke0kLqBqw(@k Density density, long j11) {
        if (this.cachedSizes != null && Constraints.m5061equalsimpl0(this.cachedConstraints, j11) && this.cachedDensity == density.getDensity()) {
            LazyGridSlots lazyGridSlots = this.cachedSizes;
            g0.m(lazyGridSlots);
            return lazyGridSlots;
        }
        this.cachedConstraints = j11;
        this.cachedDensity = density.getDensity();
        LazyGridSlots invoke = this.calculation.invoke(density, Constraints.m5055boximpl(j11));
        this.cachedSizes = invoke;
        return invoke;
    }
}
