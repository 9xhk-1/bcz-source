package androidx.compose.foundation.gestures;

import a90.c3;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import c40.r0;
import j00.c;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class DraggableElement extends ModifierNodeElement<DraggableNode> {
    public static final int $stable = 0;
    private final boolean enabled;

    @l
    private final MutableInteractionSource interactionSource;

    @k
    private final q<r0, Offset, c<? super g2>, Object> onDragStarted;

    @k
    private final q<r0, Float, c<? super g2>, Object> onDragStopped;

    @k
    private final Orientation orientation;
    private final boolean reverseDirection;
    private final boolean startDragImmediately;

    @k
    private final DraggableState state;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final x00.l<PointerInputChange, Boolean> CanDrag = new x00.l<PointerInputChange, Boolean>() { // from class: androidx.compose.foundation.gestures.DraggableElement$Companion$CanDrag$1
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
            return DraggableElement.CanDrag;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DraggableElement(@k DraggableState draggableState, @k Orientation orientation, boolean z11, @l MutableInteractionSource mutableInteractionSource, boolean z12, @k q<? super r0, ? super Offset, ? super c<? super g2>, ? extends Object> qVar, @k q<? super r0, ? super Float, ? super c<? super g2>, ? extends Object> qVar2, boolean z13) {
        this.state = draggableState;
        this.orientation = orientation;
        this.enabled = z11;
        this.interactionSource = mutableInteractionSource;
        this.startDragImmediately = z12;
        this.onDragStarted = qVar;
        this.onDragStopped = qVar2;
        this.reverseDirection = z13;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DraggableElement.class != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        return g0.g(this.state, draggableElement.state) && this.orientation == draggableElement.orientation && this.enabled == draggableElement.enabled && g0.g(this.interactionSource, draggableElement.interactionSource) && this.startDragImmediately == draggableElement.startDragImmediately && g0.g(this.onDragStarted, draggableElement.onDragStarted) && g0.g(this.onDragStopped, draggableElement.onDragStopped) && this.reverseDirection == draggableElement.reverseDirection;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = ((((this.state.hashCode() * 31) + this.orientation.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        return ((((((((hashCode + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31) + Boolean.hashCode(this.startDragImmediately)) * 31) + this.onDragStarted.hashCode()) * 31) + this.onDragStopped.hashCode()) * 31) + Boolean.hashCode(this.reverseDirection);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("draggable");
        inspectorInfo.getProperties().set("orientation", this.orientation);
        inspectorInfo.getProperties().set(c3.f2342e, Boolean.valueOf(this.enabled));
        inspectorInfo.getProperties().set("reverseDirection", Boolean.valueOf(this.reverseDirection));
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("startDragImmediately", Boolean.valueOf(this.startDragImmediately));
        inspectorInfo.getProperties().set("onDragStarted", this.onDragStarted);
        inspectorInfo.getProperties().set("onDragStopped", this.onDragStopped);
        inspectorInfo.getProperties().set("state", this.state);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public DraggableNode create() {
        return new DraggableNode(this.state, CanDrag, this.orientation, this.enabled, this.interactionSource, this.startDragImmediately, this.onDragStarted, this.onDragStopped, this.reverseDirection);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k DraggableNode draggableNode) {
        draggableNode.update(this.state, CanDrag, this.orientation, this.enabled, this.interactionSource, this.startDragImmediately, this.onDragStarted, this.onDragStopped, this.reverseDirection);
    }
}
