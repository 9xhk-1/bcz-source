package androidx.compose.ui.draganddrop;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDragAndDropNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNodeKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,493:1\n71#2:494\n65#2:495\n73#2:498\n69#2:499\n65#2:505\n69#2:508\n60#3:496\n70#3:500\n85#3:502\n90#3:504\n60#3:506\n70#3:509\n22#4:497\n22#4:507\n54#5:501\n59#5:503\n*S KotlinDebug\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNodeKt\n*L\n460#1:494\n460#1:495\n460#1:498\n460#1:499\n467#1:505\n467#1:508\n460#1:496\n460#1:500\n464#1:502\n465#1:504\n467#1:506\n467#1:509\n460#1:497\n467#1:507\n464#1:501\n465#1:503\n*E\n"})
/* loaded from: classes.dex */
public final class DragAndDropNodeKt {
    /* JADX WARN: Multi-variable type inference failed */
    @n(message = "Use DragAndDropSourceModifierNode instead", replaceWith = @w0(expression = "DragAndDropSourceModifierNode", imports = {}))
    @k
    public static final DragAndDropModifierNode DragAndDropModifierNode() {
        return new DragAndDropNode(null, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public static final DragAndDropSourceModifierNode DragAndDropSourceModifierNode(@k p<? super DragAndDropStartTransferScope, ? super Offset, g2> pVar) {
        return new DragAndDropNode(pVar, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public static final DragAndDropTargetModifierNode DragAndDropTargetModifierNode(@k final l<? super DragAndDropEvent, Boolean> lVar, @k final DragAndDropTarget dragAndDropTarget) {
        return new DragAndDropNode(null, new l<DragAndDropEvent, DragAndDropTarget>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNodeKt$DragAndDropTargetModifierNode$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // x00.l
            public final DragAndDropTarget invoke(DragAndDropEvent dragAndDropEvent) {
                if (lVar.invoke(dragAndDropEvent).booleanValue()) {
                    return dragAndDropTarget;
                }
                return null;
            }
        }, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: contains-Uv8p0NA, reason: not valid java name */
    public static final boolean m2113containsUv8p0NA(DragAndDropNode dragAndDropNode, long j11) {
        if (!dragAndDropNode.getNode().isAttached()) {
            return false;
        }
        LayoutCoordinates coordinates = DelegatableNodeKt.requireLayoutNode(dragAndDropNode).getCoordinates();
        if (!coordinates.isAttached()) {
            return false;
        }
        long positionInRoot = LayoutCoordinatesKt.positionInRoot(coordinates);
        float intBitsToFloat = Float.intBitsToFloat((int) (positionInRoot >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (positionInRoot & 4294967295L));
        float m2107getSizeYbymL2g$ui_release = ((int) (dragAndDropNode.m2107getSizeYbymL2g$ui_release() >> 32)) + intBitsToFloat;
        float m2107getSizeYbymL2g$ui_release2 = ((int) (dragAndDropNode.m2107getSizeYbymL2g$ui_release() & 4294967295L)) + intBitsToFloat2;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j11 >> 32));
        if (intBitsToFloat <= intBitsToFloat3 && intBitsToFloat3 <= m2107getSizeYbymL2g$ui_release) {
            float intBitsToFloat4 = Float.intBitsToFloat((int) (j11 & 4294967295L));
            if (intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= m2107getSizeYbymL2g$ui_release2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatchEntered(DragAndDropTarget dragAndDropTarget, DragAndDropEvent dragAndDropEvent) {
        dragAndDropTarget.onEntered(dragAndDropEvent);
        dragAndDropTarget.onMoved(dragAndDropEvent);
    }

    private static final <T extends TraversableNode> T firstDescendantOrNull(T t11, final l<? super T, Boolean> lVar) {
        if (!t11.getNode().isAttached()) {
            return null;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        TraversableNodeKt.traverseDescendants(t11, new l<T, TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNodeKt$firstDescendantOrNull$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Incorrect types in method signature: (TT;)Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction; */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // x00.l
            public final TraversableNode.Companion.TraverseDescendantsAction invoke(TraversableNode traversableNode) {
                if (!lVar.invoke(traversableNode).booleanValue()) {
                    return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                }
                objectRef.element = traversableNode;
                return TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal;
            }
        });
        return (T) objectRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends TraversableNode> void traverseSelfAndDescendants(T t11, l<? super T, ? extends TraversableNode.Companion.TraverseDescendantsAction> lVar) {
        if (lVar.invoke(t11) != TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal) {
            return;
        }
        TraversableNodeKt.traverseDescendants(t11, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n(message = "Use DragAndDropTargetModifierNode instead", replaceWith = @w0(expression = "DragAndDropTargetModifierNode", imports = {}))
    @k
    public static final DragAndDropModifierNode DragAndDropModifierNode(@k final l<? super DragAndDropEvent, Boolean> lVar, @k final DragAndDropTarget dragAndDropTarget) {
        return new DragAndDropNode(null, new l<DragAndDropEvent, DragAndDropTarget>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNodeKt$DragAndDropModifierNode$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // x00.l
            public final DragAndDropTarget invoke(DragAndDropEvent dragAndDropEvent) {
                if (lVar.invoke(dragAndDropEvent).booleanValue()) {
                    return dragAndDropTarget;
                }
                return null;
            }
        }, 1, 0 == true ? 1 : 0);
    }
}
