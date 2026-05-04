package androidx.compose.foundation.gestures;

import a90.c3;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Velocity;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class Draggable2DElement extends ModifierNodeElement<Draggable2DNode> {
    public static final int $stable = 0;
    private final boolean enabled;

    @l
    private final MutableInteractionSource interactionSource;

    @k
    private final x00.l<Offset, g2> onDragStarted;

    @k
    private final x00.l<Velocity, g2> onDragStopped;
    private final boolean reverseDirection;
    private final boolean startDragImmediately;

    @k
    private final Draggable2DState state;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final x00.l<PointerInputChange, Boolean> CanDrag = new x00.l<PointerInputChange, Boolean>() { // from class: androidx.compose.foundation.gestures.Draggable2DElement$Companion$CanDrag$1
        @Override // x00.l
        public final Boolean invoke(PointerInputChange pointerInputChange) {
            return Boolean.TRUE;
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final x00.l<PointerInputChange, Boolean> getCanDrag() {
            return Draggable2DElement.CanDrag;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Draggable2DElement(@k Draggable2DState draggable2DState, boolean z11, @l MutableInteractionSource mutableInteractionSource, boolean z12, @k x00.l<? super Offset, g2> lVar, @k x00.l<? super Velocity, g2> lVar2, boolean z13) {
        this.state = draggable2DState;
        this.enabled = z11;
        this.interactionSource = mutableInteractionSource;
        this.startDragImmediately = z12;
        this.onDragStarted = lVar;
        this.onDragStopped = lVar2;
        this.reverseDirection = z13;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Draggable2DElement.class != obj.getClass()) {
            return false;
        }
        Draggable2DElement draggable2DElement = (Draggable2DElement) obj;
        return g0.g(this.state, draggable2DElement.state) && this.enabled == draggable2DElement.enabled && g0.g(this.interactionSource, draggable2DElement.interactionSource) && this.startDragImmediately == draggable2DElement.startDragImmediately && this.onDragStarted == draggable2DElement.onDragStarted && this.onDragStopped == draggable2DElement.onDragStopped && this.reverseDirection == draggable2DElement.reverseDirection;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = ((this.state.hashCode() * 31) + Boolean.hashCode(this.enabled)) * 31;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        return ((((((((hashCode + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31) + Boolean.hashCode(this.startDragImmediately)) * 31) + this.onDragStarted.hashCode()) * 31) + this.onDragStopped.hashCode()) * 31) + Boolean.hashCode(this.reverseDirection);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("draggable2D");
        inspectorInfo.getProperties().set(c3.f2342e, Boolean.valueOf(this.enabled));
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("startDragImmediately", Boolean.valueOf(this.startDragImmediately));
        inspectorInfo.getProperties().set("onDragStarted", this.onDragStarted);
        inspectorInfo.getProperties().set("onDragStopped", this.onDragStopped);
        inspectorInfo.getProperties().set("reverseDirection", Boolean.valueOf(this.reverseDirection));
        inspectorInfo.getProperties().set("state", this.state);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public Draggable2DNode create() {
        return new Draggable2DNode(this.state, CanDrag, this.enabled, this.interactionSource, this.startDragImmediately, this.reverseDirection, this.onDragStarted, this.onDragStopped);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k Draggable2DNode draggable2DNode) {
        draggable2DNode.update(this.state, CanDrag, this.enabled, this.interactionSource, this.startDragImmediately, this.reverseDirection, this.onDragStarted, this.onDragStopped);
    }
}
