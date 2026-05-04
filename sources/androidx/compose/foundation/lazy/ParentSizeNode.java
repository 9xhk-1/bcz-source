package androidx.compose.foundation.lazy;

import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyItemScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyItemScopeImpl.kt\nandroidx/compose/foundation/lazy/ParentSizeNode\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,163:1\n26#2:164\n26#2:165\n*S KotlinDebug\n*F\n+ 1 LazyItemScopeImpl.kt\nandroidx/compose/foundation/lazy/ParentSizeNode\n*L\n138#1:164\n147#1:165\n*E\n"})
/* loaded from: classes.dex */
final class ParentSizeNode extends Modifier.Node implements LayoutModifierNode {
    private float fraction;

    @l
    private State<Integer> heightState;

    @l
    private State<Integer> widthState;

    public /* synthetic */ ParentSizeNode(float f11, State state, State state2, int i11, v vVar) {
        this(f11, (i11 & 2) != 0 ? null : state, (i11 & 4) != 0 ? null : state2);
    }

    public final float getFraction() {
        return this.fraction;
    }

    @l
    public final State<Integer> getHeightState() {
        return this.heightState;
    }

    @l
    public final State<Integer> getWidthState() {
        return this.widthState;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo61measure3p2s80s(@k MeasureScope measureScope, @k Measurable measurable, long j11) {
        State<Integer> state = this.widthState;
        int round = (state == null || state.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(state.getValue().floatValue() * this.fraction);
        State<Integer> state2 = this.heightState;
        int round2 = (state2 == null || state2.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(state2.getValue().floatValue() * this.fraction);
        int m5070getMinWidthimpl = round != Integer.MAX_VALUE ? round : Constraints.m5070getMinWidthimpl(j11);
        int m5069getMinHeightimpl = round2 != Integer.MAX_VALUE ? round2 : Constraints.m5069getMinHeightimpl(j11);
        if (round == Integer.MAX_VALUE) {
            round = Constraints.m5068getMaxWidthimpl(j11);
        }
        if (round2 == Integer.MAX_VALUE) {
            round2 = Constraints.m5067getMaxHeightimpl(j11);
        }
        final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(ConstraintsKt.Constraints(m5070getMinWidthimpl, round, m5069getMinHeightimpl, round2));
        return MeasureScope.layout$default(measureScope, mo3857measureBRTryo0.getWidth(), mo3857measureBRTryo0.getHeight(), null, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.lazy.ParentSizeNode$measure$1
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
                Placeable.PlacementScope.place$default(placementScope, Placeable.this, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    public final void setFraction(float f11) {
        this.fraction = f11;
    }

    public final void setHeightState(@l State<Integer> state) {
        this.heightState = state;
    }

    public final void setWidthState(@l State<Integer> state) {
        this.widthState = state;
    }

    public ParentSizeNode(float f11, @l State<Integer> state, @l State<Integer> state2) {
        this.fraction = f11;
        this.widthState = state;
        this.heightState = state2;
    }
}
