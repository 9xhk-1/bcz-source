package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import c10.d;
import kotlin.Pair;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class DraggableAnchorsNode<T> extends Modifier.Node implements LayoutModifierNode {

    @k
    private p<? super IntSize, ? super Constraints, ? extends Pair<? extends DraggableAnchors<T>, ? extends T>> anchors;
    private boolean didLookahead;

    @k
    private Orientation orientation;

    @k
    private AnchoredDraggableState<T> state;

    public DraggableAnchorsNode(@k AnchoredDraggableState<T> anchoredDraggableState, @k p<? super IntSize, ? super Constraints, ? extends Pair<? extends DraggableAnchors<T>, ? extends T>> pVar, @k Orientation orientation) {
        this.state = anchoredDraggableState;
        this.anchors = pVar;
        this.orientation = orientation;
    }

    @k
    public final p<IntSize, Constraints, Pair<DraggableAnchors<T>, T>> getAnchors() {
        return this.anchors;
    }

    @k
    public final Orientation getOrientation() {
        return this.orientation;
    }

    @k
    public final AnchoredDraggableState<T> getState() {
        return this.state;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo61measure3p2s80s(@k final MeasureScope measureScope, @k Measurable measurable, long j11) {
        final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(j11);
        if (!measureScope.isLookingAhead() || !this.didLookahead) {
            Pair<? extends DraggableAnchors<T>, ? extends T> invoke = this.anchors.invoke(IntSize.m5278boximpl(IntSizeKt.IntSize(mo3857measureBRTryo0.getWidth(), mo3857measureBRTryo0.getHeight())), Constraints.m5055boximpl(j11));
            this.state.updateAnchors(invoke.getFirst(), invoke.getSecond());
        }
        this.didLookahead = measureScope.isLookingAhead() || this.didLookahead;
        return MeasureScope.layout$default(measureScope, mo3857measureBRTryo0.getWidth(), mo3857measureBRTryo0.getHeight(), null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.material.DraggableAnchorsNode$measure$1
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
                float positionOf = MeasureScope.this.isLookingAhead() ? this.getState().getAnchors().positionOf(this.getState().getTargetValue()) : this.getState().requireOffset();
                float f11 = this.getOrientation() == Orientation.Horizontal ? positionOf : 0.0f;
                if (this.getOrientation() != Orientation.Vertical) {
                    positionOf = 0.0f;
                }
                Placeable.PlacementScope.place$default(placementScope, mo3857measureBRTryo0, d.L0(f11), d.L0(positionOf), 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.didLookahead = false;
    }

    public final void setAnchors(@k p<? super IntSize, ? super Constraints, ? extends Pair<? extends DraggableAnchors<T>, ? extends T>> pVar) {
        this.anchors = pVar;
    }

    public final void setOrientation(@k Orientation orientation) {
        this.orientation = orientation;
    }

    public final void setState(@k AnchoredDraggableState<T> anchoredDraggableState) {
        this.state = anchoredDraggableState;
    }
}
