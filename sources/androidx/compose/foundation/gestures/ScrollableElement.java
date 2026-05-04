package androidx.compose.foundation.gestures;

import a90.c3;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class ScrollableElement extends ModifierNodeElement<ScrollableNode> {

    @l
    private final BringIntoViewSpec bringIntoViewSpec;
    private final boolean enabled;

    @l
    private final FlingBehavior flingBehavior;

    @l
    private final MutableInteractionSource interactionSource;

    @k
    private final Orientation orientation;

    @l
    private final OverscrollEffect overscrollEffect;
    private final boolean reverseDirection;

    @k
    private final ScrollableState state;

    public ScrollableElement(@k ScrollableState scrollableState, @k Orientation orientation, @l OverscrollEffect overscrollEffect, boolean z11, boolean z12, @l FlingBehavior flingBehavior, @l MutableInteractionSource mutableInteractionSource, @l BringIntoViewSpec bringIntoViewSpec) {
        this.state = scrollableState;
        this.orientation = orientation;
        this.overscrollEffect = overscrollEffect;
        this.enabled = z11;
        this.reverseDirection = z12;
        this.flingBehavior = flingBehavior;
        this.interactionSource = mutableInteractionSource;
        this.bringIntoViewSpec = bringIntoViewSpec;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return g0.g(this.state, scrollableElement.state) && this.orientation == scrollableElement.orientation && g0.g(this.overscrollEffect, scrollableElement.overscrollEffect) && this.enabled == scrollableElement.enabled && this.reverseDirection == scrollableElement.reverseDirection && g0.g(this.flingBehavior, scrollableElement.flingBehavior) && g0.g(this.interactionSource, scrollableElement.interactionSource) && g0.g(this.bringIntoViewSpec, scrollableElement.bringIntoViewSpec);
    }

    @l
    public final BringIntoViewSpec getBringIntoViewSpec() {
        return this.bringIntoViewSpec;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @l
    public final FlingBehavior getFlingBehavior() {
        return this.flingBehavior;
    }

    @l
    public final MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    @k
    public final Orientation getOrientation() {
        return this.orientation;
    }

    @l
    public final OverscrollEffect getOverscrollEffect() {
        return this.overscrollEffect;
    }

    public final boolean getReverseDirection() {
        return this.reverseDirection;
    }

    @k
    public final ScrollableState getState() {
        return this.state;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = ((this.state.hashCode() * 31) + this.orientation.hashCode()) * 31;
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        int hashCode2 = (((((hashCode + (overscrollEffect != null ? overscrollEffect.hashCode() : 0)) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.reverseDirection)) * 31;
        FlingBehavior flingBehavior = this.flingBehavior;
        int hashCode3 = (hashCode2 + (flingBehavior != null ? flingBehavior.hashCode() : 0)) * 31;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        int hashCode4 = (hashCode3 + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31;
        BringIntoViewSpec bringIntoViewSpec = this.bringIntoViewSpec;
        return hashCode4 + (bringIntoViewSpec != null ? bringIntoViewSpec.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("scrollable");
        inspectorInfo.getProperties().set("orientation", this.orientation);
        inspectorInfo.getProperties().set("state", this.state);
        inspectorInfo.getProperties().set("overscrollEffect", this.overscrollEffect);
        inspectorInfo.getProperties().set(c3.f2342e, Boolean.valueOf(this.enabled));
        inspectorInfo.getProperties().set("reverseDirection", Boolean.valueOf(this.reverseDirection));
        inspectorInfo.getProperties().set("flingBehavior", this.flingBehavior);
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("bringIntoViewSpec", this.bringIntoViewSpec);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public ScrollableNode create() {
        return new ScrollableNode(this.state, this.overscrollEffect, this.flingBehavior, this.orientation, this.enabled, this.reverseDirection, this.interactionSource, this.bringIntoViewSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k ScrollableNode scrollableNode) {
        scrollableNode.update(this.state, this.orientation, this.overscrollEffect, this.enabled, this.reverseDirection, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
    }
}
