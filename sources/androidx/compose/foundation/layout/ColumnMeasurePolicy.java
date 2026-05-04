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
public final class ColumnMeasurePolicy implements MeasurePolicy, RowColumnMeasurePolicy {
    public static final int $stable = 0;

    @m80.k
    private final Alignment.Horizontal horizontalAlignment;

    @m80.k
    private final Arrangement.Vertical verticalArrangement;

    public ColumnMeasurePolicy(@m80.k Arrangement.Vertical vertical, @m80.k Alignment.Horizontal horizontal) {
        this.verticalArrangement = vertical;
        this.horizontalAlignment = horizontal;
    }

    private final Arrangement.Vertical component1() {
        return this.verticalArrangement;
    }

    private final Alignment.Horizontal component2() {
        return this.horizontalAlignment;
    }

    public static /* synthetic */ ColumnMeasurePolicy copy$default(ColumnMeasurePolicy columnMeasurePolicy, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            vertical = columnMeasurePolicy.verticalArrangement;
        }
        if ((i11 & 2) != 0) {
            horizontal = columnMeasurePolicy.horizontalAlignment;
        }
        return columnMeasurePolicy.copy(vertical, horizontal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCrossAxisPosition(Placeable placeable, RowColumnParentData rowColumnParentData, int i11, int i12, LayoutDirection layoutDirection) {
        CrossAxisAlignment crossAxisAlignment = rowColumnParentData != null ? rowColumnParentData.getCrossAxisAlignment() : null;
        return crossAxisAlignment != null ? crossAxisAlignment.align$foundation_layout_release(i11 - placeable.getWidth(), layoutDirection, placeable, i12) : this.horizontalAlignment.align(0, i11 - placeable.getWidth(), layoutDirection);
    }

    @m80.k
    public final ColumnMeasurePolicy copy(@m80.k Arrangement.Vertical vertical, @m80.k Alignment.Horizontal horizontal) {
        return new ColumnMeasurePolicy(vertical, horizontal);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    /* renamed from: createConstraints-xF2OJ5Q, reason: not valid java name */
    public long mo639createConstraintsxF2OJ5Q(int i11, int i12, int i13, int i14, boolean z11) {
        return ColumnKt.createColumnConstraints(z11, i11, i12, i13, i14);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public int crossAxisSize(@m80.k Placeable placeable) {
        return placeable.getWidth();
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColumnMeasurePolicy)) {
            return false;
        }
        ColumnMeasurePolicy columnMeasurePolicy = (ColumnMeasurePolicy) obj;
        return g0.g(this.verticalArrangement, columnMeasurePolicy.verticalArrangement) && g0.g(this.horizontalAlignment, columnMeasurePolicy.horizontalAlignment);
    }

    public int hashCode() {
        return (this.verticalArrangement.hashCode() * 31) + this.horizontalAlignment.hashCode();
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public int mainAxisSize(@m80.k Placeable placeable) {
        return placeable.getHeight();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k List<? extends IntrinsicMeasurable> list, int i11) {
        return IntrinsicMeasureBlocks.INSTANCE.VerticalMaxHeight(list, i11, intrinsicMeasureScope.mo371roundToPx0680j_4(this.verticalArrangement.mo613getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k List<? extends IntrinsicMeasurable> list, int i11) {
        return IntrinsicMeasureBlocks.INSTANCE.VerticalMaxWidth(list, i11, intrinsicMeasureScope.mo371roundToPx0680j_4(this.verticalArrangement.mo613getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @m80.k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(@m80.k MeasureScope measureScope, @m80.k List<? extends Measurable> list, long j11) {
        MeasureResult measure;
        measure = RowColumnMeasurePolicyKt.measure(this, Constraints.m5069getMinHeightimpl(j11), Constraints.m5070getMinWidthimpl(j11), Constraints.m5067getMaxHeightimpl(j11), Constraints.m5068getMaxWidthimpl(j11), measureScope.mo371roundToPx0680j_4(this.verticalArrangement.mo613getSpacingD9Ej5fM()), measureScope, list, new Placeable[list.size()], 0, list.size(), (r28 & 1024) != 0 ? null : null, (r28 & 2048) != 0 ? 0 : 0);
        return measure;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k List<? extends IntrinsicMeasurable> list, int i11) {
        return IntrinsicMeasureBlocks.INSTANCE.VerticalMinHeight(list, i11, intrinsicMeasureScope.mo371roundToPx0680j_4(this.verticalArrangement.mo613getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k List<? extends IntrinsicMeasurable> list, int i11) {
        return IntrinsicMeasureBlocks.INSTANCE.VerticalMinWidth(list, i11, intrinsicMeasureScope.mo371roundToPx0680j_4(this.verticalArrangement.mo613getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    @m80.k
    public MeasureResult placeHelper(@m80.k final Placeable[] placeableArr, @m80.k final MeasureScope measureScope, final int i11, @m80.k final int[] iArr, int i12, final int i13, @l int[] iArr2, int i14, int i15, int i16) {
        return MeasureScope.layout$default(measureScope, i13, i12, null, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.layout.ColumnMeasurePolicy$placeHelper$1$1
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
                ColumnMeasurePolicy columnMeasurePolicy = this;
                int i17 = i13;
                int i18 = i11;
                MeasureScope measureScope2 = measureScope;
                int[] iArr3 = iArr;
                int length = placeableArr2.length;
                int i19 = 0;
                int i21 = 0;
                while (i19 < length) {
                    Placeable placeable = placeableArr2[i19];
                    g0.m(placeable);
                    crossAxisPosition = columnMeasurePolicy.getCrossAxisPosition(placeable, RowColumnImplKt.getRowColumnParentData(placeable), i17, i18, measureScope2.getLayoutDirection());
                    Placeable.PlacementScope.place$default(placementScope, placeable, crossAxisPosition, iArr3[i21], 0.0f, 4, null);
                    i19++;
                    i21++;
                }
            }
        }, 4, null);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public void populateMainAxisPositions(int i11, @m80.k int[] iArr, @m80.k int[] iArr2, @m80.k MeasureScope measureScope) {
        this.verticalArrangement.arrange(measureScope, i11, iArr, iArr2);
    }

    @m80.k
    public String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.verticalArrangement + ", horizontalAlignment=" + this.horizontalAlignment + ')';
    }
}
