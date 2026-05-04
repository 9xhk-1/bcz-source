package androidx.constraintlayout.compose;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import java.util.LinkedHashMap;
import java.util.List;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class ConstraintLayoutKt$ConstraintLayout$measurePolicy$2$1 implements MeasurePolicy {
    final /* synthetic */ ConstraintSet $constraintSet;
    final /* synthetic */ MutableState<g2> $contentTracker;
    final /* synthetic */ Measurer2 $measurer;
    final /* synthetic */ int $optimizationLevel;

    public ConstraintLayoutKt$ConstraintLayout$measurePolicy$2$1(MutableState<g2> mutableState, Measurer2 measurer2, ConstraintSet constraintSet, int i11) {
        this.$contentTracker = mutableState;
        this.$measurer = measurer2;
        this.$constraintSet = constraintSet;
        this.$optimizationLevel = i11;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo33measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j11) {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.$contentTracker.getValue();
        long m5516performMeasureDjhGOtQ = this.$measurer.m5516performMeasureDjhGOtQ(j11, measureScope.getLayoutDirection(), this.$constraintSet, list, linkedHashMap, this.$optimizationLevel);
        int m5286getWidthimpl = IntSize.m5286getWidthimpl(m5516performMeasureDjhGOtQ);
        int m5285getHeightimpl = IntSize.m5285getHeightimpl(m5516performMeasureDjhGOtQ);
        final Measurer2 measurer2 = this.$measurer;
        return MeasureScope.layout$default(measureScope, m5286getWidthimpl, m5285getHeightimpl, null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$measurePolicy$2$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                Measurer2.this.performLayout(placementScope, list, linkedHashMap);
            }
        }, 4, null);
    }
}
