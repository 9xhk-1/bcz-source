package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Constraints;
import g10.u;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nLazyGridMeasuredLineProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredLineProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
/* loaded from: classes.dex */
public abstract class LazyGridMeasuredLineProvider {
    public static final int $stable = 8;
    private final int gridItemsCount;
    private final boolean isVertical;

    @k
    private final LazyGridMeasuredItemProvider measuredItemProvider;

    @k
    private final LazyGridSlots slots;
    private final int spaceBetweenLines;

    @k
    private final LazyGridSpanLayoutProvider spanLayoutProvider;

    public LazyGridMeasuredLineProvider(boolean z11, @k LazyGridSlots lazyGridSlots, int i11, int i12, @k LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, @k LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider) {
        this.isVertical = z11;
        this.slots = lazyGridSlots;
        this.gridItemsCount = i11;
        this.spaceBetweenLines = i12;
        this.measuredItemProvider = lazyGridMeasuredItemProvider;
        this.spanLayoutProvider = lazyGridSpanLayoutProvider;
    }

    /* renamed from: childConstraints-JhjzzOo$foundation_release, reason: not valid java name */
    public final long m874childConstraintsJhjzzOo$foundation_release(int i11, int i12) {
        int i13;
        if (i12 == 1) {
            i13 = this.slots.getSizes()[i11];
        } else {
            int i14 = (i12 + i11) - 1;
            i13 = (this.slots.getPositions()[i14] + this.slots.getSizes()[i14]) - this.slots.getPositions()[i11];
        }
        int u11 = u.u(i13, 0);
        return this.isVertical ? Constraints.Companion.m5080fixedWidthOenEA2s(u11) : Constraints.Companion.m5079fixedHeightOenEA2s(u11);
    }

    @k
    public abstract LazyGridMeasuredLine createLine(int i11, @k LazyGridMeasuredItem[] lazyGridMeasuredItemArr, @k List<GridItemSpan> list, int i12);

    @k
    public final LazyGridMeasuredLine getAndMeasure(int i11) {
        LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = this.spanLayoutProvider.getLineConfiguration(i11);
        int size = lineConfiguration.getSpans().size();
        int i12 = (size == 0 || lineConfiguration.getFirstItemIndex() + size == this.gridItemsCount) ? 0 : this.spaceBetweenLines;
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr = new LazyGridMeasuredItem[size];
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            int m851getCurrentLineSpanimpl = GridItemSpan.m851getCurrentLineSpanimpl(lineConfiguration.getSpans().get(i14).m854unboximpl());
            LazyGridMeasuredItem m873getAndMeasurem8Kt_7k = this.measuredItemProvider.m873getAndMeasurem8Kt_7k(lineConfiguration.getFirstItemIndex() + i14, m874childConstraintsJhjzzOo$foundation_release(i13, m851getCurrentLineSpanimpl), i13, m851getCurrentLineSpanimpl, i12);
            i13 += m851getCurrentLineSpanimpl;
            g2 g2Var = g2.f100423a;
            lazyGridMeasuredItemArr[i14] = m873getAndMeasurem8Kt_7k;
        }
        return createLine(i11, lazyGridMeasuredItemArr, lineConfiguration.getSpans(), i12);
    }

    @k
    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.measuredItemProvider.getKeyIndexMap();
    }

    public final int spanOf(int i11) {
        LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider = this.spanLayoutProvider;
        return lazyGridSpanLayoutProvider.spanOf(i11, lazyGridSpanLayoutProvider.getSlotsPerLine());
    }
}
