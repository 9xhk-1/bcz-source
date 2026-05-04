package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/NodeParent\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,643:1\n1101#2:644\n1083#2,2:645\n423#3,9:647\n423#3,9:656\n423#3,9:665\n423#3,9:674\n472#3:683\n423#3,9:684\n44#3:693\n472#3:694\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/NodeParent\n*L\n189#1:644\n189#1:645,2\n201#1:647,9\n228#1:656,9\n248#1:665,9\n257#1:674,9\n274#1:683\n298#1:684,9\n302#1:693\n303#1:694\n*E\n"})
/* loaded from: classes.dex */
public class NodeParent {
    public static final int $stable = 8;

    @k
    private final MutableVector<Node> children = new MutableVector<>(new Node[16], 0);

    @k
    private final MutableObjectList<NodeParent> removeMatchingPointerInputModifierNodeList = new MutableObjectList<>(10);

    public boolean buildCache(@k LongSparseArray<PointerInputChange> longSparseArray, @k LayoutCoordinates layoutCoordinates, @k InternalPointerEvent internalPointerEvent, boolean z11) {
        MutableVector<Node> mutableVector = this.children;
        Node[] nodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        boolean z12 = false;
        for (int i11 = 0; i11 < size; i11++) {
            z12 = nodeArr[i11].buildCache(longSparseArray, layoutCoordinates, internalPointerEvent, z11) || z12;
        }
        return z12;
    }

    public void cleanUpHits(@k InternalPointerEvent internalPointerEvent) {
        int size = this.children.getSize();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (this.children.content[size].getPointerIds().isEmpty()) {
                this.children.removeAt(size);
            }
        }
    }

    public final void clear() {
        this.children.clear();
    }

    public void dispatchCancel() {
        MutableVector<Node> mutableVector = this.children;
        Node[] nodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            nodeArr[i11].dispatchCancel();
        }
    }

    public boolean dispatchFinalEventPass(@k InternalPointerEvent internalPointerEvent) {
        MutableVector<Node> mutableVector = this.children;
        Node[] nodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            z11 = nodeArr[i11].dispatchFinalEventPass(internalPointerEvent) || z11;
        }
        cleanUpHits(internalPointerEvent);
        return z11;
    }

    public boolean dispatchMainEventPass(@k LongSparseArray<PointerInputChange> longSparseArray, @k LayoutCoordinates layoutCoordinates, @k InternalPointerEvent internalPointerEvent, boolean z11) {
        MutableVector<Node> mutableVector = this.children;
        Node[] nodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        boolean z12 = false;
        for (int i11 = 0; i11 < size; i11++) {
            z12 = nodeArr[i11].dispatchMainEventPass(longSparseArray, layoutCoordinates, internalPointerEvent, z11) || z12;
        }
        return z12;
    }

    @k
    public final MutableVector<Node> getChildren() {
        return this.children;
    }

    public void removeInvalidPointerIdsAndChanges(long j11, @k MutableObjectList<Node> mutableObjectList) {
        MutableVector<Node> mutableVector = this.children;
        Node[] nodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            nodeArr[i11].removeInvalidPointerIdsAndChanges(j11, mutableObjectList);
        }
    }

    public void removePointerInputModifierNode(@k Modifier.Node node) {
        this.removeMatchingPointerInputModifierNodeList.clear();
        this.removeMatchingPointerInputModifierNodeList.add(this);
        while (this.removeMatchingPointerInputModifierNodeList.isNotEmpty()) {
            NodeParent removeAt = this.removeMatchingPointerInputModifierNodeList.removeAt(r0.getSize() - 1);
            int i11 = 0;
            while (i11 < removeAt.children.getSize()) {
                Node node2 = removeAt.children.content[i11];
                if (g0.g(node2.getModifierNode(), node)) {
                    removeAt.children.remove(node2);
                    node2.dispatchCancel();
                } else {
                    this.removeMatchingPointerInputModifierNodeList.add(node2);
                    i11++;
                }
            }
        }
    }
}
