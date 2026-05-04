package androidx.compose.ui.input.pointer;

import androidx.collection.MutableLongObjectMap;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/HitPathTracker\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 3 PointerIdArray.kt\nandroidx/compose/ui/input/pointer/util/PointerIdArray\n+ 4 LongObjectMap.kt\nandroidx/collection/MutableLongObjectMap\n+ 5 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 LongObjectMap.kt\nandroidx/collection/LongObjectMap\n+ 8 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,643:1\n347#2,8:644\n128#3:652\n128#3:657\n679#4:653\n679#4:658\n1516#5:654\n1516#5:659\n1#6:655\n1#6:656\n1#6:660\n382#7,4:661\n354#7,6:665\n364#7,3:672\n367#7,9:676\n386#7:685\n1399#8:671\n1270#8:675\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/HitPathTracker\n*L\n83#1:644,8\n87#1:652\n102#1:657\n90#1:653\n105#1:658\n91#1:654\n105#1:659\n90#1:655\n105#1:660\n115#1:661,4\n115#1:665,6\n115#1:672,3\n115#1:676,9\n115#1:685\n115#1:671\n115#1:675\n*E\n"})
/* loaded from: classes.dex */
public final class HitPathTracker {
    public static final int $stable = 8;

    @k
    private final LayoutCoordinates rootCoordinates;

    @k
    private final NodeParent root = new NodeParent();

    @k
    private final MutableLongObjectMap<MutableObjectList<Node>> hitPointerIdsAndNodes = new MutableLongObjectMap<>(10);

    public HitPathTracker(@k LayoutCoordinates layoutCoordinates) {
        this.rootCoordinates = layoutCoordinates;
    }

    /* renamed from: addHitPath-QJqDSyo$default, reason: not valid java name */
    public static /* synthetic */ void m3657addHitPathQJqDSyo$default(HitPathTracker hitPathTracker, long j11, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        hitPathTracker.m3658addHitPathQJqDSyo(j11, list, z11);
    }

    public static /* synthetic */ boolean dispatchChanges$default(HitPathTracker hitPathTracker, InternalPointerEvent internalPointerEvent, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return hitPathTracker.dispatchChanges(internalPointerEvent, z11);
    }

    private final void removeInvalidPointerIdsAndChanges(long j11, MutableObjectList<Node> mutableObjectList) {
        this.root.removeInvalidPointerIdsAndChanges(j11, mutableObjectList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removePointerInputModifierNode(Modifier.Node node) {
        this.root.removePointerInputModifierNode(node);
    }

    /* renamed from: addHitPath-QJqDSyo, reason: not valid java name */
    public final void m3658addHitPathQJqDSyo(long j11, @k List<? extends Modifier.Node> list, boolean z11) {
        Node node;
        NodeParent nodeParent = this.root;
        this.hitPointerIdsAndNodes.clear();
        int size = list.size();
        boolean z12 = true;
        for (int i11 = 0; i11 < size; i11++) {
            final Modifier.Node node2 = list.get(i11);
            if (node2.isAttached()) {
                node2.setDetachedListener$ui_release(new x00.a<g2>() { // from class: androidx.compose.ui.input.pointer.HitPathTracker$addHitPath$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // x00.a
                    public /* bridge */ /* synthetic */ g2 invoke() {
                        invoke2();
                        return g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        HitPathTracker.this.removePointerInputModifierNode(node2);
                    }
                });
                if (z12) {
                    MutableVector<Node> children = nodeParent.getChildren();
                    Node[] nodeArr = children.content;
                    int size2 = children.getSize();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            node = null;
                            break;
                        }
                        node = nodeArr[i12];
                        if (g0.g(node.getModifierNode(), node2)) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    Node node3 = node;
                    if (node3 != null) {
                        node3.markIsIn();
                        node3.getPointerIds().add(j11);
                        MutableLongObjectMap<MutableObjectList<Node>> mutableLongObjectMap = this.hitPointerIdsAndNodes;
                        MutableObjectList<Node> mutableObjectList = mutableLongObjectMap.get(j11);
                        if (mutableObjectList == null) {
                            mutableObjectList = new MutableObjectList<>(0, 1, null);
                            mutableLongObjectMap.set(j11, mutableObjectList);
                        }
                        mutableObjectList.add(node3);
                        nodeParent = node3;
                    } else {
                        z12 = false;
                    }
                }
                Node node4 = new Node(node2);
                node4.getPointerIds().add(j11);
                MutableLongObjectMap<MutableObjectList<Node>> mutableLongObjectMap2 = this.hitPointerIdsAndNodes;
                MutableObjectList<Node> mutableObjectList2 = mutableLongObjectMap2.get(j11);
                if (mutableObjectList2 == null) {
                    mutableObjectList2 = new MutableObjectList<>(0, 1, null);
                    mutableLongObjectMap2.set(j11, mutableObjectList2);
                }
                mutableObjectList2.add(node4);
                nodeParent.getChildren().add(node4);
                nodeParent = node4;
            }
        }
        if (!z11) {
            return;
        }
        MutableLongObjectMap<MutableObjectList<Node>> mutableLongObjectMap3 = this.hitPointerIdsAndNodes;
        long[] jArr = mutableLongObjectMap3.keys;
        Object[] objArr = mutableLongObjectMap3.values;
        long[] jArr2 = mutableLongObjectMap3.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j12 = jArr2[i13];
            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j12) < 128) {
                        int i16 = (i13 << 3) + i15;
                        removeInvalidPointerIdsAndChanges(jArr[i16], (MutableObjectList) objArr[i16]);
                    }
                    j12 >>= 8;
                }
                if (i14 != 8) {
                    return;
                }
            }
            if (i13 == length) {
                return;
            } else {
                i13++;
            }
        }
    }

    public final void clearPreviouslyHitModifierNodeCache() {
        this.root.clear();
    }

    public final boolean dispatchChanges(@k InternalPointerEvent internalPointerEvent, boolean z11) {
        if (this.root.buildCache(internalPointerEvent.getChanges(), this.rootCoordinates, internalPointerEvent, z11)) {
            return this.root.dispatchFinalEventPass(internalPointerEvent) || this.root.dispatchMainEventPass(internalPointerEvent.getChanges(), this.rootCoordinates, internalPointerEvent, z11);
        }
        return false;
    }

    @k
    public final NodeParent getRoot$ui_release() {
        return this.root;
    }

    public final void processCancel() {
        this.root.dispatchCancel();
        clearPreviouslyHitModifierNodeCache();
    }
}
