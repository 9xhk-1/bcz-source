package androidx.compose.foundation.gestures;

import a90.c3;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class TransformableElement extends ModifierNodeElement<TransformableNode> {

    @k
    private final l<Offset, Boolean> canPan;
    private final boolean enabled;
    private final boolean lockRotationOnZoomPan;

    @k
    private final TransformableState state;

    /* JADX WARN: Multi-variable type inference failed */
    public TransformableElement(@k TransformableState transformableState, @k l<? super Offset, Boolean> lVar, boolean z11, boolean z12) {
        this.state = transformableState;
        this.canPan = lVar;
        this.lockRotationOnZoomPan = z11;
        this.enabled = z12;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TransformableElement.class != obj.getClass()) {
            return false;
        }
        TransformableElement transformableElement = (TransformableElement) obj;
        return g0.g(this.state, transformableElement.state) && this.canPan == transformableElement.canPan && this.lockRotationOnZoomPan == transformableElement.lockRotationOnZoomPan && this.enabled == transformableElement.enabled;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((this.state.hashCode() * 31) + this.canPan.hashCode()) * 31) + Boolean.hashCode(this.lockRotationOnZoomPan)) * 31) + Boolean.hashCode(this.enabled);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("transformable");
        inspectorInfo.getProperties().set("state", this.state);
        inspectorInfo.getProperties().set("canPan", this.canPan);
        inspectorInfo.getProperties().set(c3.f2342e, Boolean.valueOf(this.enabled));
        inspectorInfo.getProperties().set("lockRotationOnZoomPan", Boolean.valueOf(this.lockRotationOnZoomPan));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public TransformableNode create() {
        return new TransformableNode(this.state, this.canPan, this.lockRotationOnZoomPan, this.enabled);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k TransformableNode transformableNode) {
        transformableNode.update(this.state, this.canPan, this.lockRotationOnZoomPan, this.enabled);
    }
}
