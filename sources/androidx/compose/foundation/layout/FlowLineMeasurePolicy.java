package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.g0;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface FlowLineMeasurePolicy extends RowColumnMeasurePolicy {
    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    /* renamed from: createConstraints-xF2OJ5Q */
    default long mo639createConstraintsxF2OJ5Q(int i11, int i12, int i13, int i14, boolean z11) {
        return isHorizontal() ? RowKt.createRowConstraints(z11, i11, i12, i13, i14) : ColumnKt.createColumnConstraints(z11, i11, i12, i13, i14);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    default int crossAxisSize(@m80.k Placeable placeable) {
        return isHorizontal() ? placeable.getMeasuredHeight() : placeable.getMeasuredWidth();
    }

    @m80.k
    CrossAxisAlignment getCrossAxisAlignment();

    default int getCrossAxisPosition(@m80.k Placeable placeable, int i11, @m80.k LayoutDirection layoutDirection, int i12) {
        CrossAxisAlignment crossAxisAlignment;
        RowColumnParentData rowColumnParentData = RowColumnImplKt.getRowColumnParentData(placeable);
        if (rowColumnParentData == null || (crossAxisAlignment = rowColumnParentData.getCrossAxisAlignment()) == null) {
            crossAxisAlignment = getCrossAxisAlignment();
        }
        return crossAxisAlignment.align$foundation_layout_release(i11 - crossAxisSize(placeable), layoutDirection, placeable, i12);
    }

    @m80.k
    Arrangement.Horizontal getHorizontalArrangement();

    @m80.k
    Arrangement.Vertical getVerticalArrangement();

    boolean isHorizontal();

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    default int mainAxisSize(@m80.k Placeable placeable) {
        return isHorizontal() ? placeable.getMeasuredWidth() : placeable.getMeasuredHeight();
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    @m80.k
    default MeasureResult placeHelper(@m80.k final Placeable[] placeableArr, @m80.k MeasureScope measureScope, final int i11, @m80.k final int[] iArr, int i12, final int i13, @l final int[] iArr2, final int i14, final int i15, final int i16) {
        int i17;
        int i18;
        if (isHorizontal()) {
            i18 = i12;
            i17 = i13;
        } else {
            i17 = i12;
            i18 = i13;
        }
        final LayoutDirection layoutDirection = isHorizontal() ? LayoutDirection.Ltr : measureScope.getLayoutDirection();
        return MeasureScope.layout$default(measureScope, i18, i17, null, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.layout.FlowLineMeasurePolicy$placeHelper$1$1
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
                Placeable.PlacementScope placementScope2;
                int[] iArr3 = iArr2;
                int i19 = iArr3 != null ? iArr3[i14] : 0;
                int i21 = i15;
                while (i21 < i16) {
                    Placeable placeable = placeableArr[i21];
                    g0.m(placeable);
                    int crossAxisPosition = this.getCrossAxisPosition(placeable, i13, layoutDirection, i11) + i19;
                    if (this.isHorizontal()) {
                        placementScope2 = placementScope;
                        Placeable.PlacementScope.place$default(placementScope2, placeable, iArr[i21 - i15], crossAxisPosition, 0.0f, 4, null);
                    } else {
                        placementScope2 = placementScope;
                        Placeable.PlacementScope.place$default(placementScope2, placeable, crossAxisPosition, iArr[i21 - i15], 0.0f, 4, null);
                    }
                    i21++;
                    placementScope = placementScope2;
                }
            }
        }, 4, null);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    default void populateMainAxisPositions(int i11, @m80.k int[] iArr, @m80.k int[] iArr2, @m80.k MeasureScope measureScope) {
        if (isHorizontal()) {
            getHorizontalArrangement().arrange(measureScope, i11, iArr, measureScope.getLayoutDirection(), iArr2);
        } else {
            getVerticalArrangement().arrange(measureScope, i11, iArr, iArr2);
        }
    }
}
