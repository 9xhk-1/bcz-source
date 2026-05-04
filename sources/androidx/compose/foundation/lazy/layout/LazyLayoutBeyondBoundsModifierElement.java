package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class LazyLayoutBeyondBoundsModifierElement extends ModifierNodeElement<LazyLayoutBeyondBoundsModifierNode> {

    @k
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;

    @k
    private final Orientation orientation;
    private final boolean reverseLayout;

    @k
    private final LazyLayoutBeyondBoundsState state;

    public LazyLayoutBeyondBoundsModifierElement(@k LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsState, @k LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo, boolean z11, @k Orientation orientation) {
        this.state = lazyLayoutBeyondBoundsState;
        this.beyondBoundsInfo = lazyLayoutBeyondBoundsInfo;
        this.reverseLayout = z11;
        this.orientation = orientation;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutBeyondBoundsModifierElement)) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierElement lazyLayoutBeyondBoundsModifierElement = (LazyLayoutBeyondBoundsModifierElement) obj;
        return g0.g(this.state, lazyLayoutBeyondBoundsModifierElement.state) && g0.g(this.beyondBoundsInfo, lazyLayoutBeyondBoundsModifierElement.beyondBoundsInfo) && this.reverseLayout == lazyLayoutBeyondBoundsModifierElement.reverseLayout && this.orientation == lazyLayoutBeyondBoundsModifierElement.orientation;
    }

    @k
    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo() {
        return this.beyondBoundsInfo;
    }

    @k
    public final Orientation getOrientation() {
        return this.orientation;
    }

    public final boolean getReverseLayout() {
        return this.reverseLayout;
    }

    @k
    public final LazyLayoutBeyondBoundsState getState() {
        return this.state;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((this.state.hashCode() * 31) + this.beyondBoundsInfo.hashCode()) * 31) + Boolean.hashCode(this.reverseLayout)) * 31) + this.orientation.hashCode();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public LazyLayoutBeyondBoundsModifierNode create() {
        return new LazyLayoutBeyondBoundsModifierNode(this.state, this.beyondBoundsInfo, this.reverseLayout, this.orientation);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k LazyLayoutBeyondBoundsModifierNode lazyLayoutBeyondBoundsModifierNode) {
        lazyLayoutBeyondBoundsModifierNode.update(this.state, this.beyondBoundsInfo, this.reverseLayout, this.orientation);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
    }
}
