package androidx.compose.foundation;

import a90.c3;
import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class ScrollingContainerElement extends ModifierNodeElement<ScrollingContainerNode> {

    @l
    private final BringIntoViewSpec bringIntoViewSpec;
    private final boolean enabled;

    @l
    private final FlingBehavior flingBehavior;

    @l
    private final MutableInteractionSource interactionSource;

    @m80.k
    private final Orientation orientation;

    @l
    private final OverscrollEffect overscrollEffect;
    private final boolean reverseScrolling;

    @m80.k
    private final ScrollableState state;
    private final boolean useLocalOverscrollFactory;

    public ScrollingContainerElement(@m80.k ScrollableState scrollableState, @m80.k Orientation orientation, boolean z11, boolean z12, @l FlingBehavior flingBehavior, @l MutableInteractionSource mutableInteractionSource, @l BringIntoViewSpec bringIntoViewSpec, boolean z13, @l OverscrollEffect overscrollEffect) {
        this.state = scrollableState;
        this.orientation = orientation;
        this.enabled = z11;
        this.reverseScrolling = z12;
        this.flingBehavior = flingBehavior;
        this.interactionSource = mutableInteractionSource;
        this.bringIntoViewSpec = bringIntoViewSpec;
        this.useLocalOverscrollFactory = z13;
        this.overscrollEffect = overscrollEffect;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ScrollingContainerElement.class != obj.getClass()) {
            return false;
        }
        ScrollingContainerElement scrollingContainerElement = (ScrollingContainerElement) obj;
        return g0.g(this.state, scrollingContainerElement.state) && this.orientation == scrollingContainerElement.orientation && this.enabled == scrollingContainerElement.enabled && this.reverseScrolling == scrollingContainerElement.reverseScrolling && g0.g(this.flingBehavior, scrollingContainerElement.flingBehavior) && g0.g(this.interactionSource, scrollingContainerElement.interactionSource) && g0.g(this.bringIntoViewSpec, scrollingContainerElement.bringIntoViewSpec) && this.useLocalOverscrollFactory == scrollingContainerElement.useLocalOverscrollFactory && g0.g(this.overscrollEffect, scrollingContainerElement.overscrollEffect);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = ((((((this.state.hashCode() * 31) + this.orientation.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.reverseScrolling)) * 31;
        FlingBehavior flingBehavior = this.flingBehavior;
        int hashCode2 = (hashCode + (flingBehavior != null ? flingBehavior.hashCode() : 0)) * 31;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        int hashCode3 = (hashCode2 + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31;
        BringIntoViewSpec bringIntoViewSpec = this.bringIntoViewSpec;
        int hashCode4 = (((hashCode3 + (bringIntoViewSpec != null ? bringIntoViewSpec.hashCode() : 0)) * 31) + Boolean.hashCode(this.useLocalOverscrollFactory)) * 31;
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        return hashCode4 + (overscrollEffect != null ? overscrollEffect.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("scrollingContainer");
        inspectorInfo.getProperties().set("state", this.state);
        inspectorInfo.getProperties().set("orientation", this.orientation);
        inspectorInfo.getProperties().set(c3.f2342e, Boolean.valueOf(this.enabled));
        inspectorInfo.getProperties().set("reverseScrolling", Boolean.valueOf(this.reverseScrolling));
        inspectorInfo.getProperties().set("flingBehavior", this.flingBehavior);
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("bringIntoViewSpec", this.bringIntoViewSpec);
        inspectorInfo.getProperties().set("useLocalOverscrollFactory", Boolean.valueOf(this.useLocalOverscrollFactory));
        inspectorInfo.getProperties().set("overscrollEffect", this.overscrollEffect);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public ScrollingContainerNode create() {
        return new ScrollingContainerNode(this.state, this.orientation, this.enabled, this.reverseScrolling, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec, this.useLocalOverscrollFactory, this.overscrollEffect);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k ScrollingContainerNode scrollingContainerNode) {
        scrollingContainerNode.update(this.state, this.orientation, this.useLocalOverscrollFactory, this.overscrollEffect, this.enabled, this.reverseScrolling, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
    }
}
