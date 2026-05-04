package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public interface GridCells {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$Adaptive\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,656:1\n113#2:657\n96#3,5:658\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$Adaptive\n*L\n359#1:657\n359#1:658,5\n*E\n"})
    public static final class Adaptive implements GridCells {
        public static final int $stable = 0;
        private final float minSize;

        public /* synthetic */ Adaptive(float f11, v vVar) {
            this(f11);
        }

        @Override // androidx.compose.foundation.lazy.grid.GridCells
        @k
        public List<Integer> calculateCrossAxisCellSizes(@k Density density, int i11, int i12) {
            List<Integer> calculateCellsCrossAxisSizeImpl;
            calculateCellsCrossAxisSizeImpl = LazyGridDslKt.calculateCellsCrossAxisSizeImpl(i11, Math.max((i11 + i12) / (density.mo371roundToPx0680j_4(this.minSize) + i12), 1), i12);
            return calculateCellsCrossAxisSizeImpl;
        }

        public boolean equals(@l Object obj) {
            return (obj instanceof Adaptive) && Dp.m5120equalsimpl0(this.minSize, ((Adaptive) obj).minSize);
        }

        public int hashCode() {
            return Dp.m5121hashCodeimpl(this.minSize);
        }

        private Adaptive(float f11) {
            this.minSize = f11;
            if (Dp.m5114compareTo0680j_4(f11, Dp.m5115constructorimpl((float) 0)) > 0) {
                return;
            }
            InlineClassHelperKt.throwIllegalArgumentException("Provided min size should be larger than zero.");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$Fixed\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,656:1\n96#2,5:657\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$Fixed\n*L\n330#1:657,5\n*E\n"})
    public static final class Fixed implements GridCells {
        public static final int $stable = 0;
        private final int count;

        public Fixed(int i11) {
            this.count = i11;
            if (i11 > 0) {
                return;
            }
            InlineClassHelperKt.throwIllegalArgumentException("Provided count should be larger than zero");
        }

        @Override // androidx.compose.foundation.lazy.grid.GridCells
        @k
        public List<Integer> calculateCrossAxisCellSizes(@k Density density, int i11, int i12) {
            List<Integer> calculateCellsCrossAxisSizeImpl;
            calculateCellsCrossAxisSizeImpl = LazyGridDslKt.calculateCellsCrossAxisSizeImpl(i11, this.count, i12);
            return calculateCellsCrossAxisSizeImpl;
        }

        public boolean equals(@l Object obj) {
            return (obj instanceof Fixed) && this.count == ((Fixed) obj).count;
        }

        public int hashCode() {
            return -this.count;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$FixedSize\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,656:1\n113#2:657\n96#3,5:658\n1#4:663\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$FixedSize\n*L\n392#1:657\n392#1:658,5\n*E\n"})
    public static final class FixedSize implements GridCells {
        public static final int $stable = 0;
        private final float size;

        public /* synthetic */ FixedSize(float f11, v vVar) {
            this(f11);
        }

        @Override // androidx.compose.foundation.lazy.grid.GridCells
        @k
        public List<Integer> calculateCrossAxisCellSizes(@k Density density, int i11, int i12) {
            int mo371roundToPx0680j_4 = density.mo371roundToPx0680j_4(this.size);
            int i13 = mo371roundToPx0680j_4 + i12;
            int i14 = i12 + i11;
            if (i13 >= i14) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(Integer.valueOf(i11));
                return arrayList;
            }
            int i15 = i14 / i13;
            ArrayList arrayList2 = new ArrayList(i15);
            for (int i16 = 0; i16 < i15; i16++) {
                arrayList2.add(Integer.valueOf(mo371roundToPx0680j_4));
            }
            return arrayList2;
        }

        public boolean equals(@l Object obj) {
            return (obj instanceof FixedSize) && Dp.m5120equalsimpl0(this.size, ((FixedSize) obj).size);
        }

        public int hashCode() {
            return Dp.m5121hashCodeimpl(this.size);
        }

        private FixedSize(float f11) {
            this.size = f11;
            if (Dp.m5114compareTo0680j_4(f11, Dp.m5115constructorimpl((float) 0)) > 0) {
                return;
            }
            InlineClassHelperKt.throwIllegalArgumentException("Provided size should be larger than zero.");
        }
    }

    @k
    List<Integer> calculateCrossAxisCellSizes(@k Density density, int i11, int i12);
}
