package androidx.compose.ui.spatial;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class EmptyFillMeasurePolicy implements MeasurePolicy {

    @k
    public static final EmptyFillMeasurePolicy INSTANCE = new EmptyFillMeasurePolicy();

    private EmptyFillMeasurePolicy() {
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(@k MeasureScope measureScope, @k List<? extends Measurable> list, long j11) {
        return MeasureScope.layout$default(measureScope, Constraints.m5068getMaxWidthimpl(j11), Constraints.m5067getMaxHeightimpl(j11), null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.ui.spatial.EmptyFillMeasurePolicy$measure$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return g2.f100423a;
            }
        }, 4, null);
    }
}
