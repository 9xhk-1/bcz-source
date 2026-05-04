package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.internal.StabilityInferred;
import g10.u;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nLazyGridMeasuredLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredLine.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n13309#2,2:76\n13374#2,2:78\n13376#2:81\n1#3:80\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasuredLine.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine\n*L\n43#1:76,2\n57#1:78,2\n57#1:81\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridMeasuredLine {
    public static final int $stable = 8;
    private final int index;
    private final boolean isVertical;

    @k
    private final LazyGridMeasuredItem[] items;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private final int mainAxisSpacing;

    @k
    private final LazyGridSlots slots;

    @k
    private final List<GridItemSpan> spans;

    public LazyGridMeasuredLine(int i11, @k LazyGridMeasuredItem[] lazyGridMeasuredItemArr, @k LazyGridSlots lazyGridSlots, @k List<GridItemSpan> list, boolean z11, int i12) {
        this.index = i11;
        this.items = lazyGridMeasuredItemArr;
        this.slots = lazyGridSlots;
        this.spans = list;
        this.isVertical = z11;
        this.mainAxisSpacing = i12;
        int i13 = 0;
        for (LazyGridMeasuredItem lazyGridMeasuredItem : lazyGridMeasuredItemArr) {
            i13 = Math.max(i13, lazyGridMeasuredItem.getMainAxisSize());
        }
        this.mainAxisSize = i13;
        this.mainAxisSizeWithSpacings = u.u(i13 + this.mainAxisSpacing, 0);
    }

    public final int getIndex() {
        return this.index;
    }

    @k
    public final LazyGridMeasuredItem[] getItems() {
        return this.items;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    public final boolean isEmpty() {
        return this.items.length == 0;
    }

    @k
    public final LazyGridMeasuredItem[] position(int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr = this.items;
        int length = lazyGridMeasuredItemArr.length;
        int i18 = 0;
        int i19 = 0;
        int i21 = 0;
        while (i18 < length) {
            LazyGridMeasuredItem lazyGridMeasuredItem = lazyGridMeasuredItemArr[i18];
            int i22 = i19 + 1;
            int m851getCurrentLineSpanimpl = GridItemSpan.m851getCurrentLineSpanimpl(this.spans.get(i19).m854unboximpl());
            int i23 = this.slots.getPositions()[i21];
            boolean z11 = this.isVertical;
            int i24 = z11 ? this.index : i21;
            if (z11) {
                i14 = i21;
                i17 = i11;
                i15 = i12;
                i16 = i13;
            } else {
                i14 = this.index;
                i15 = i12;
                i16 = i13;
                i17 = i11;
            }
            lazyGridMeasuredItem.position(i17, i23, i15, i16, i24, i14);
            g2 g2Var = g2.f100423a;
            i21 += m851getCurrentLineSpanimpl;
            i18++;
            i19 = i22;
        }
        return this.items;
    }
}
