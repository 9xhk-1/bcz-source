package androidx.compose.ui.draganddrop;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import w00.j;
import x00.a;
import x00.p;
import yz.g2;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nDragAndDropNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNode\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNodeKt\n*L\n1#1,493:1\n65#2,5:494\n65#2,5:499\n482#3,10:504\n*S KotlinDebug\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNode\n*L\n257#1:494,5\n313#1:499,5\n381#1:504,10\n*E\n"})
/* loaded from: classes.dex */
public final class DragAndDropNode extends Modifier.Node implements TraversableNode, DragAndDropModifierNode, DragAndDropSourceModifierNode, DragAndDropTargetModifierNode, DragAndDropTarget {

    @l
    private DragAndDropNode lastChildDragAndDropModifierNode;

    @l
    private final x00.l<DragAndDropEvent, DragAndDropTarget> onDropTargetValidate;

    @l
    private p<? super DragAndDropStartTransferScope, ? super Offset, g2> onStartTransfer;
    private long size;

    @l
    private DragAndDropTarget thisDragAndDropTarget;

    @k
    private final Object traverseKey;

    @k
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class DragAndDropTraversableKey {

            @k
            public static final DragAndDropTraversableKey INSTANCE = new DragAndDropTraversableKey();

            private DragAndDropTraversableKey() {
            }
        }

        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropNode() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DragAndDropManager getDragAndDropManager() {
        return DelegatableNodeKt.requireOwner(this).getDragAndDropManager();
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropModifierNode
    public boolean acceptDragAndDropTransfer(@k final DragAndDropEvent dragAndDropEvent) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        DragAndDropNodeKt.traverseSelfAndDescendants(this, new x00.l<DragAndDropNode, TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$acceptDragAndDropTransfer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public final TraversableNode.Companion.TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode) {
                DragAndDropTarget dragAndDropTarget;
                x00.l lVar;
                DragAndDropTarget dragAndDropTarget2;
                DragAndDropManager dragAndDropManager;
                if (!dragAndDropNode.isAttached()) {
                    return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
                }
                dragAndDropTarget = dragAndDropNode.thisDragAndDropTarget;
                if (!(dragAndDropTarget == null)) {
                    InlineClassHelperKt.throwIllegalStateException("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                lVar = dragAndDropNode.onDropTargetValidate;
                dragAndDropNode.thisDragAndDropTarget = lVar != null ? (DragAndDropTarget) lVar.invoke(DragAndDropEvent.this) : null;
                dragAndDropTarget2 = dragAndDropNode.thisDragAndDropTarget;
                boolean z11 = dragAndDropTarget2 != null;
                if (z11) {
                    dragAndDropManager = this.getDragAndDropManager();
                    dragAndDropManager.registerTargetInterest(dragAndDropNode);
                }
                Ref.BooleanRef booleanRef2 = booleanRef;
                booleanRef2.element = booleanRef2.element || z11;
                return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
            }
        });
        return booleanRef.element;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropModifierNode
    @n(message = "Use DragAndDropSourceModifierNode.requestDragAndDropTransfer instead")
    /* renamed from: drag-12SF9DM */
    public void mo2106drag12SF9DM(@k final DragAndDropTransferData dragAndDropTransferData, final long j11, @k final x00.l<? super DrawScope, g2> lVar) {
        if (!(this.onStartTransfer == null)) {
            InlineClassHelperKt.throwIllegalStateException("Check failed.");
        }
        this.onStartTransfer = new p<DragAndDropStartTransferScope, Offset, g2>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$drag$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ g2 invoke(DragAndDropStartTransferScope dragAndDropStartTransferScope, Offset offset) {
                m2111invokeUv8p0NA(dragAndDropStartTransferScope, offset.m2278unboximpl());
                return g2.f100423a;
            }

            /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
            public final void m2111invokeUv8p0NA(DragAndDropStartTransferScope dragAndDropStartTransferScope, long j12) {
                dragAndDropStartTransferScope.mo2105startDragAndDropTransfer12SF9DM(DragAndDropTransferData.this, j11, lVar);
            }
        };
        getDragAndDropManager().mo2104requestDragAndDropTransferUv8p0NA(this, Offset.Companion.m2283getUnspecifiedF1C5BW0());
        this.onStartTransfer = null;
    }

    /* renamed from: getSize-YbymL2g$ui_release, reason: not valid java name */
    public final long m2107getSizeYbymL2g$ui_release() {
        return this.size;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    @k
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    @j(name = "hasEligibleDropTarget")
    public final boolean hasEligibleDropTarget() {
        return (this.lastChildDragAndDropModifierNode == null && this.thisDragAndDropTarget == null) ? false : true;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropSourceModifierNode
    public boolean isRequestDragAndDropTransferRequired() {
        return getDragAndDropManager().isRequestDragAndDropTransferRequired();
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onChanged(@k DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.onChanged(dragAndDropEvent);
            return;
        }
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            dragAndDropNode.onChanged(dragAndDropEvent);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.thisDragAndDropTarget = null;
        this.lastChildDragAndDropModifierNode = null;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public boolean onDrop(@k DragAndDropEvent dragAndDropEvent) {
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            return dragAndDropNode.onDrop(dragAndDropEvent);
        }
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            return dragAndDropTarget.onDrop(dragAndDropEvent);
        }
        return false;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onEnded(@k final DragAndDropEvent dragAndDropEvent) {
        DragAndDropNodeKt.traverseSelfAndDescendants(this, new x00.l<DragAndDropNode, TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$onEnded$1
            {
                super(1);
            }

            @Override // x00.l
            public final TraversableNode.Companion.TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode) {
                DragAndDropTarget dragAndDropTarget;
                if (!dragAndDropNode.getNode().isAttached()) {
                    return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
                }
                dragAndDropTarget = dragAndDropNode.thisDragAndDropTarget;
                if (dragAndDropTarget != null) {
                    dragAndDropTarget.onEnded(DragAndDropEvent.this);
                }
                dragAndDropNode.thisDragAndDropTarget = null;
                dragAndDropNode.lastChildDragAndDropModifierNode = null;
                return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
            }
        });
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onEntered(@k DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.onEntered(dragAndDropEvent);
            return;
        }
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            dragAndDropNode.onEntered(dragAndDropEvent);
        }
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onExited(@k DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.onExited(dragAndDropEvent);
        }
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            dragAndDropNode.onExited(dragAndDropEvent);
        }
        this.lastChildDragAndDropModifierNode = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMoved(@m80.k final androidx.compose.ui.draganddrop.DragAndDropEvent r4) {
        /*
            r3 = this;
            androidx.compose.ui.draganddrop.DragAndDropNode r0 = r3.lastChildDragAndDropModifierNode
            if (r0 == 0) goto L11
            long r1 = androidx.compose.ui.draganddrop.DragAndDrop_androidKt.getPositionInRoot(r4)
            boolean r1 = androidx.compose.ui.draganddrop.DragAndDropNodeKt.m2112access$containsUv8p0NA(r0, r1)
            r2 = 1
            if (r1 != r2) goto L11
            r1 = r0
            goto L30
        L11:
            androidx.compose.ui.Modifier$Node r1 = r3.getNode()
            boolean r1 = r1.isAttached()
            if (r1 != 0) goto L1d
            r1 = 0
            goto L2e
        L1d:
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            androidx.compose.ui.draganddrop.DragAndDropNode$onMoved$$inlined$firstDescendantOrNull$1 r2 = new androidx.compose.ui.draganddrop.DragAndDropNode$onMoved$$inlined$firstDescendantOrNull$1
            r2.<init>()
            androidx.compose.ui.node.TraversableNodeKt.traverseDescendants(r3, r2)
            T r1 = r1.element
            androidx.compose.ui.node.TraversableNode r1 = (androidx.compose.ui.node.TraversableNode) r1
        L2e:
            androidx.compose.ui.draganddrop.DragAndDropNode r1 = (androidx.compose.ui.draganddrop.DragAndDropNode) r1
        L30:
            if (r1 == 0) goto L3f
            if (r0 != 0) goto L3f
            androidx.compose.ui.draganddrop.DragAndDropNodeKt.access$dispatchEntered(r1, r4)
            androidx.compose.ui.draganddrop.DragAndDropTarget r0 = r3.thisDragAndDropTarget
            if (r0 == 0) goto L6c
            r0.onExited(r4)
            goto L6c
        L3f:
            if (r1 != 0) goto L4e
            if (r0 == 0) goto L4e
            androidx.compose.ui.draganddrop.DragAndDropTarget r2 = r3.thisDragAndDropTarget
            if (r2 == 0) goto L4a
            androidx.compose.ui.draganddrop.DragAndDropNodeKt.access$dispatchEntered(r2, r4)
        L4a:
            r0.onExited(r4)
            goto L6c
        L4e:
            boolean r2 = kotlin.jvm.internal.g0.g(r1, r0)
            if (r2 != 0) goto L5f
            if (r1 == 0) goto L59
            androidx.compose.ui.draganddrop.DragAndDropNodeKt.access$dispatchEntered(r1, r4)
        L59:
            if (r0 == 0) goto L6c
            r0.onExited(r4)
            goto L6c
        L5f:
            if (r1 == 0) goto L65
            r1.onMoved(r4)
            goto L6c
        L65:
            androidx.compose.ui.draganddrop.DragAndDropTarget r0 = r3.thisDragAndDropTarget
            if (r0 == 0) goto L6c
            r0.onMoved(r4)
        L6c:
            r3.lastChildDragAndDropModifierNode = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.draganddrop.DragAndDropNode.onMoved(androidx.compose.ui.draganddrop.DragAndDropEvent):void");
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo365onRemeasuredozmzZPI(long j11) {
        this.size = j11;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onStarted(@k DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.onStarted(dragAndDropEvent);
            return;
        }
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            dragAndDropNode.onStarted(dragAndDropEvent);
        }
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropSourceModifierNode
    /* renamed from: requestDragAndDropTransfer-k-4lQ0M, reason: not valid java name */
    public void mo2108requestDragAndDropTransferk4lQ0M(long j11) {
        if (!(this.onStartTransfer != null)) {
            InlineClassHelperKt.throwIllegalStateException("Check failed.");
        }
        getDragAndDropManager().mo2104requestDragAndDropTransferUv8p0NA(this, j11);
    }

    /* renamed from: setSize-ozmzZPI$ui_release, reason: not valid java name */
    public final void m2109setSizeozmzZPI$ui_release(long j11) {
        this.size = j11;
    }

    /* renamed from: startDragAndDropTransfer-d-4ec7I, reason: not valid java name */
    public final void m2110startDragAndDropTransferd4ec7I(@k final DragAndDropStartTransferScope dragAndDropStartTransferScope, final long j11, @k final a<Boolean> aVar) {
        final LayoutCoordinates coordinates = DelegatableNodeKt.requireLayoutNode(this).getCoordinates();
        DragAndDropNodeKt.traverseSelfAndDescendants(this, new x00.l<DragAndDropNode, TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$startDragAndDropTransfer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public final TraversableNode.Companion.TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode) {
                p pVar;
                if (!dragAndDropNode.isAttached()) {
                    return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
                }
                pVar = dragAndDropNode.onStartTransfer;
                if (pVar == null) {
                    return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                }
                long j12 = j11;
                Offset.Companion companion = Offset.Companion;
                if (Offset.m2265equalsimpl0(j12, companion.m2283getUnspecifiedF1C5BW0())) {
                    pVar.invoke(dragAndDropStartTransferScope, Offset.m2257boximpl(companion.m2283getUnspecifiedF1C5BW0()));
                } else {
                    long mo3866localPositionOfR5De75A = DelegatableNodeKt.requireLayoutNode(dragAndDropNode).getCoordinates().mo3866localPositionOfR5De75A(coordinates, j11);
                    if (!SizeKt.m2358toRectuvyYCjk(IntSizeKt.m5298toSizeozmzZPI(dragAndDropNode.m2107getSizeYbymL2g$ui_release())).m2294containsk4lQ0M(mo3866localPositionOfR5De75A)) {
                        return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                    }
                    pVar.invoke(dragAndDropStartTransferScope, Offset.m2257boximpl(mo3866localPositionOfR5De75A));
                }
                return aVar.invoke().booleanValue() ? TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal : TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
            }
        });
    }

    public /* synthetic */ DragAndDropNode(p pVar, x00.l lVar, int i11, v vVar) {
        this((i11 & 1) != 0 ? null : pVar, (i11 & 2) != 0 ? null : lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropNode(@l p<? super DragAndDropStartTransferScope, ? super Offset, g2> pVar, @l x00.l<? super DragAndDropEvent, ? extends DragAndDropTarget> lVar) {
        this.onStartTransfer = pVar;
        this.onDropTargetValidate = lVar;
        this.traverseKey = Companion.DragAndDropTraversableKey.INSTANCE;
        this.size = IntSize.Companion.m5291getZeroYbymL2g();
    }
}
