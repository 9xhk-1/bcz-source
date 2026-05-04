package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class SharedBoundsNodeElement extends ModifierNodeElement<SharedBoundsNode> {
    public static final int $stable = 0;

    @k
    private final SharedElementInternalState sharedElementState;

    public SharedBoundsNodeElement(@k SharedElementInternalState sharedElementInternalState) {
        this.sharedElementState = sharedElementInternalState;
    }

    public static /* synthetic */ SharedBoundsNodeElement copy$default(SharedBoundsNodeElement sharedBoundsNodeElement, SharedElementInternalState sharedElementInternalState, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            sharedElementInternalState = sharedBoundsNodeElement.sharedElementState;
        }
        return sharedBoundsNodeElement.copy(sharedElementInternalState);
    }

    @k
    public final SharedElementInternalState component1() {
        return this.sharedElementState;
    }

    @k
    public final SharedBoundsNodeElement copy(@k SharedElementInternalState sharedElementInternalState) {
        return new SharedBoundsNodeElement(sharedElementInternalState);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SharedBoundsNodeElement) && g0.g(this.sharedElementState, ((SharedBoundsNodeElement) obj).sharedElementState);
    }

    @k
    public final SharedElementInternalState getSharedElementState() {
        return this.sharedElementState;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.sharedElementState.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("sharedBounds");
        inspectorInfo.getProperties().set("sharedElementState", this.sharedElementState);
    }

    @k
    public String toString() {
        return "SharedBoundsNodeElement(sharedElementState=" + this.sharedElementState + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public SharedBoundsNode create() {
        return new SharedBoundsNode(this.sharedElementState);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k SharedBoundsNode sharedBoundsNode) {
        sharedBoundsNode.setState$animation(this.sharedElementState);
    }
}
