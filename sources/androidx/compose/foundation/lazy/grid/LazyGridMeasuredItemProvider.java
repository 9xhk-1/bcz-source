package androidx.compose.foundation.lazy.grid;

import androidx.collection.IntList;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nLazyGridMeasuredItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredItemProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,105:1\n96#2,5:106\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasuredItemProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider\n*L\n67#1:106,5\n*E\n"})
/* loaded from: classes.dex */
public abstract class LazyGridMeasuredItemProvider implements LazyLayoutMeasuredItemProvider<LazyGridMeasuredItem> {
    public static final int $stable = 0;
    private final int defaultMainAxisSpacing;

    @k
    private final LazyGridItemProvider itemProvider;

    @k
    private final LazyLayoutMeasureScope measureScope;

    public LazyGridMeasuredItemProvider(@k LazyGridItemProvider lazyGridItemProvider, @k LazyLayoutMeasureScope lazyLayoutMeasureScope, int i11) {
        this.itemProvider = lazyGridItemProvider;
        this.measureScope = lazyLayoutMeasureScope;
        this.defaultMainAxisSpacing = i11;
    }

    @k
    /* renamed from: createItem-O3s9Psw */
    public abstract LazyGridMeasuredItem mo868createItemO3s9Psw(int i11, @k Object obj, @l Object obj2, int i12, int i13, @k List<? extends Placeable> list, long j11, int i14, int i15);

    @k
    /* renamed from: getAndMeasure-m8Kt_7k, reason: not valid java name */
    public final LazyGridMeasuredItem m873getAndMeasurem8Kt_7k(int i11, long j11, int i12, int i13, int i14) {
        int m5069getMinHeightimpl;
        Object key = this.itemProvider.getKey(i11);
        Object contentType = this.itemProvider.getContentType(i11);
        List<Placeable> mo900measure0kLqBqw = this.measureScope.mo900measure0kLqBqw(i11, j11);
        if (Constraints.m5066getHasFixedWidthimpl(j11)) {
            m5069getMinHeightimpl = Constraints.m5070getMinWidthimpl(j11);
        } else {
            if (!Constraints.m5065getHasFixedHeightimpl(j11)) {
                InlineClassHelperKt.throwIllegalArgumentException("does not have fixed height");
            }
            m5069getMinHeightimpl = Constraints.m5069getMinHeightimpl(j11);
        }
        return mo868createItemO3s9Psw(i11, key, contentType, m5069getMinHeightimpl, i14, mo900measure0kLqBqw, j11, i12, i13);
    }

    @k
    public final IntList getHeaderIndices() {
        return this.itemProvider.getHeaderIndexes();
    }

    @k
    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.itemProvider.getKeyIndexMap();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider
    @k
    /* renamed from: getAndMeasure--hBUhpc */
    public LazyGridMeasuredItem mo842getAndMeasurehBUhpc(int i11, int i12, int i13, long j11) {
        return m873getAndMeasurem8Kt_7k(i11, j11, i12, i13, this.defaultMainAxisSpacing);
    }
}
