package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public interface StaggeredGridCells {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nLazyStaggeredGridCells.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridCells.kt\nandroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells$Adaptive\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,155:1\n113#2:156\n96#3,5:157\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridCells.kt\nandroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells$Adaptive\n*L\n88#1:156\n88#1:157,5\n*E\n"})
    public static final class Adaptive implements StaggeredGridCells {
        public static final int $stable = 0;
        private final float minSize;

        public /* synthetic */ Adaptive(float f11, v vVar) {
            this(f11);
        }

        @Override // androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
        @k
        public int[] calculateCrossAxisCellSizes(@k Density density, int i11, int i12) {
            int[] calculateCellsCrossAxisSizeImpl;
            calculateCellsCrossAxisSizeImpl = LazyStaggeredGridCellsKt.calculateCellsCrossAxisSizeImpl(i11, Math.max((i11 + i12) / (density.mo371roundToPx0680j_4(this.minSize) + i12), 1), i12);
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
            InlineClassHelperKt.throwIllegalArgumentException("invalid minSize");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nLazyStaggeredGridCells.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridCells.kt\nandroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells$Fixed\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,155:1\n96#2,5:156\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridCells.kt\nandroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells$Fixed\n*L\n58#1:156,5\n*E\n"})
    public static final class Fixed implements StaggeredGridCells {
        public static final int $stable = 0;
        private final int count;

        public Fixed(int i11) {
            this.count = i11;
            if (i11 > 0) {
                return;
            }
            InlineClassHelperKt.throwIllegalArgumentException("grid with no rows/columns");
        }

        @Override // androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
        @k
        public int[] calculateCrossAxisCellSizes(@k Density density, int i11, int i12) {
            int[] calculateCellsCrossAxisSizeImpl;
            calculateCellsCrossAxisSizeImpl = LazyStaggeredGridCellsKt.calculateCellsCrossAxisSizeImpl(i11, this.count, i12);
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
    public static final class FixedSize implements StaggeredGridCells {
        public static final int $stable = 0;
        private final float size;

        public /* synthetic */ FixedSize(float f11, v vVar) {
            this(f11);
        }

        @Override // androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
        @k
        public int[] calculateCrossAxisCellSizes(@k Density density, int i11, int i12) {
            int mo371roundToPx0680j_4 = density.mo371roundToPx0680j_4(this.size);
            int i13 = mo371roundToPx0680j_4 + i12;
            int i14 = i12 + i11;
            if (i13 >= i14) {
                return new int[]{i11};
            }
            int i15 = i14 / i13;
            int[] iArr = new int[i15];
            for (int i16 = 0; i16 < i15; i16++) {
                iArr[i16] = mo371roundToPx0680j_4;
            }
            return iArr;
        }

        public boolean equals(@l Object obj) {
            return (obj instanceof FixedSize) && Dp.m5120equalsimpl0(this.size, ((FixedSize) obj).size);
        }

        public int hashCode() {
            return Dp.m5121hashCodeimpl(this.size);
        }

        private FixedSize(float f11) {
            this.size = f11;
        }
    }

    @k
    int[] calculateCrossAxisCellSizes(@k Density density, int i11, int i12);
}
