package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class RowMeasurePolicy implements MeasurePolicy, RowColumnMeasurePolicy {
    public static final int $stable = 0;

    @m80.k
    private final Arrangement.Horizontal horizontalArrangement;

    @m80.k
    private final Alignment.Vertical verticalAlignment;

    public RowMeasurePolicy(@m80.k Arrangement.Horizontal horizontal, @m80.k Alignment.Vertical vertical) {
        this.horizontalArrangement = horizontal;
        this.verticalAlignment = vertical;
    }

    private final Arrangement.Horizontal component1() {
        return this.horizontalArrangement;
    }

    private final Alignment.Vertical component2() {
        return this.verticalAlignment;
    }

    public static /* synthetic */ RowMeasurePolicy copy$default(RowMeasurePolicy rowMeasurePolicy, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            horizontal = rowMeasurePolicy.horizontalArrangement;
        }
        if ((i11 & 2) != 0) {
            vertical = rowMeasurePolicy.verticalAlignment;
        }
        return rowMeasurePolicy.copy(horizontal, vertical);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCrossAxisPosition(Placeable placeable, RowColumnParentData rowColumnParentData, int i11, int i12) {
        CrossAxisAlignment crossAxisAlignment = rowColumnParentData != null ? rowColumnParentData.getCrossAxisAlignment() : null;
        return crossAxisAlignment != null ? crossAxisAlignment.align$foundation_layout_release(i11 - placeable.getHeight(), LayoutDirection.Ltr, placeable, i12) : this.verticalAlignment.align(0, i11 - placeable.getHeight());
    }

    @m80.k
    public final RowMeasurePolicy copy(@m80.k Arrangement.Horizontal horizontal, @m80.k Alignment.Vertical vertical) {
        return new RowMeasurePolicy(horizontal, vertical);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    /* renamed from: createConstraints-xF2OJ5Q */
    public long mo639createConstraintsxF2OJ5Q(int i11, int i12, int i13, int i14, boolean z11) {
        return RowKt.createRowConstraints(z11, i11, i12, i13, i14);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public int crossAxisSize(@m80.k Placeable placeable) {
        return placeable.getHeight();
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RowMeasurePolicy)) {
            return false;
        }
        RowMeasurePolicy rowMeasurePolicy = (RowMeasurePolicy) obj;
        return g0.g(this.horizontalArrangement, rowMeasurePolicy.horizontalArrangement) && g0.g(this.verticalAlignment, rowMeasurePolicy.verticalAlignment);
    }

    public int hashCode() {
        return (this.horizontalArrangement.hashCode() * 31) + this.verticalAlignment.hashCode();
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public int mainAxisSize(@m80.k Placeable placeable) {
        return placeable.getWidth();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k List<? extends IntrinsicMeasurable> list, int i11) {
        return IntrinsicMeasureBlocks.INSTANCE.HorizontalMaxHeight(list, i11, intrinsicMeasureScope.mo371roundToPx0680j_4(this.horizontalArrangement.mo613getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k List<? extends IntrinsicMeasurable> list, int i11) {
        return IntrinsicMeasureBlocks.INSTANCE.HorizontalMaxWidth(list, i11, intrinsicMeasureScope.mo371roundToPx0680j_4(this.horizontalArrangement.mo613getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @m80.k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(@m80.k MeasureScope measureScope, @m80.k List<? extends Measurable> list, long j11) {
        MeasureResult measure;
        measure = RowColumnMeasurePolicyKt.measure(this, Constraints.m5070getMinWidthimpl(j11), Constraints.m5069getMinHeightimpl(j11), Constraints.m5068getMaxWidthimpl(j11), Constraints.m5067getMaxHeightimpl(j11), measureScope.mo371roundToPx0680j_4(this.horizontalArrangement.mo613getSpacingD9Ej5fM()), measureScope, list, new Placeable[list.size()], 0, list.size(), (r28 & 1024) != 0 ? null : null, (r28 & 2048) != 0 ? 0 : 0);
        return measure;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k List<? extends IntrinsicMeasurable> list, int i11) {
        return IntrinsicMeasureBlocks.INSTANCE.HorizontalMinHeight(list, i11, intrinsicMeasureScope.mo371roundToPx0680j_4(this.horizontalArrangement.mo613getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k List<? extends IntrinsicMeasurable> list, int i11) {
        return IntrinsicMeasureBlocks.INSTANCE.HorizontalMinWidth(list, i11, intrinsicMeasureScope.mo371roundToPx0680j_4(this.horizontalArrangement.mo613getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    @m80.k
    public MeasureResult placeHelper(@m80.k final Placeable[] placeableArr, @m80.k MeasureScope measureScope, final int i11, @m80.k final int[] iArr, int i12, final int i13, @l int[] iArr2, int i14, int i15, int i16) {
        return MeasureScope.layout$default(measureScope, i12, i13, null, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.layout.RowMeasurePolicy$placeHelper$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                int crossAxisPosition;
                Placeable[] placeableArr2 = placeableArr;
                RowMeasurePolicy rowMeasurePolicy = this;
                int i17 = i13;
                int i18 = i11;
                int[] iArr3 = iArr;
                int length = placeableArr2.length;
                int i19 = 0;
                int i21 = 0;
                while (i19 < length) {
                    Placeable placeable = placeableArr2[i19];
                    g0.m(placeable);
                    crossAxisPosition = rowMeasurePolicy.getCrossAxisPosition(placeable, RowColumnImplKt.getRowColumnParentData(placeable), i17, i18);
                    Placeable.PlacementScope.place$default(placementScope, placeable, iArr3[i21], crossAxisPosition, 0.0f, 4, null);
                    i19++;
                    i21++;
                }
            }
        }, 4, null);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public void populateMainAxisPositions(int i11, @m80.k int[] iArr, @m80.k int[] iArr2, @m80.k MeasureScope measureScope) {
        this.horizontalArrangement.arrange(measureScope, i11, iArr, measureScope.getLayoutDirection(), iArr2);
    }

    @m80.k
    public String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.horizontalArrangement + ", verticalAlignment=" + this.verticalAlignment + ')';
    }
}
