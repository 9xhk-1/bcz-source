package androidx.compose.foundation.gestures;

import a90.c3;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AnchoredDraggableElement<T> extends ModifierNodeElement<AnchoredDraggableNode<T>> {
    private final boolean enabled;

    @l
    private final FlingBehavior flingBehavior;

    @l
    private final MutableInteractionSource interactionSource;

    @k
    private final Orientation orientation;

    @l
    private final OverscrollEffect overscrollEffect;

    @l
    private final Boolean reverseDirection;

    @l
    private final Boolean startDragImmediately;

    @k
    private final AnchoredDraggableState<T> state;

    public /* synthetic */ AnchoredDraggableElement(AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z11, Boolean bool, MutableInteractionSource mutableInteractionSource, Boolean bool2, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, int i11, v vVar) {
        this(anchoredDraggableState, orientation, z11, bool, mutableInteractionSource, (i11 & 32) != 0 ? null : bool2, overscrollEffect, (i11 & 128) != 0 ? null : flingBehavior);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchoredDraggableElement)) {
            return false;
        }
        AnchoredDraggableElement anchoredDraggableElement = (AnchoredDraggableElement) obj;
        return g0.g(this.state, anchoredDraggableElement.state) && this.orientation == anchoredDraggableElement.orientation && this.enabled == anchoredDraggableElement.enabled && g0.g(this.reverseDirection, anchoredDraggableElement.reverseDirection) && g0.g(this.interactionSource, anchoredDraggableElement.interactionSource) && g0.g(this.startDragImmediately, anchoredDraggableElement.startDragImmediately) && g0.g(this.overscrollEffect, anchoredDraggableElement.overscrollEffect) && g0.g(this.flingBehavior, anchoredDraggableElement.flingBehavior);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = ((((this.state.hashCode() * 31) + this.orientation.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31;
        Boolean bool = this.reverseDirection;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        int hashCode3 = (hashCode2 + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31;
        Boolean bool2 = this.startDragImmediately;
        int hashCode4 = (hashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        int hashCode5 = (hashCode4 + (overscrollEffect != null ? overscrollEffect.hashCode() : 0)) * 31;
        FlingBehavior flingBehavior = this.flingBehavior;
        return hashCode5 + (flingBehavior != null ? flingBehavior.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("anchoredDraggable");
        inspectorInfo.getProperties().set("state", this.state);
        inspectorInfo.getProperties().set("orientation", this.orientation);
        inspectorInfo.getProperties().set(c3.f2342e, Boolean.valueOf(this.enabled));
        inspectorInfo.getProperties().set("reverseDirection", this.reverseDirection);
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("startDragImmediately", this.startDragImmediately);
        inspectorInfo.getProperties().set("overscrollEffect", this.overscrollEffect);
        inspectorInfo.getProperties().set("flingBehavior", this.flingBehavior);
    }

    public AnchoredDraggableElement(@k AnchoredDraggableState<T> anchoredDraggableState, @k Orientation orientation, boolean z11, @l Boolean bool, @l MutableInteractionSource mutableInteractionSource, @l Boolean bool2, @l OverscrollEffect overscrollEffect, @l FlingBehavior flingBehavior) {
        this.state = anchoredDraggableState;
        this.orientation = orientation;
        this.enabled = z11;
        this.reverseDirection = bool;
        this.interactionSource = mutableInteractionSource;
        this.startDragImmediately = bool2;
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public AnchoredDraggableNode<T> create() {
        return new AnchoredDraggableNode<>(this.state, this.orientation, this.enabled, this.reverseDirection, this.interactionSource, this.overscrollEffect, this.startDragImmediately, this.flingBehavior);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k AnchoredDraggableNode<T> anchoredDraggableNode) {
        anchoredDraggableNode.update(this.state, this.orientation, this.enabled, this.reverseDirection, this.interactionSource, this.overscrollEffect, this.startDragImmediately, this.flingBehavior);
    }
}
