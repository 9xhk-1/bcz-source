package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Comparator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nOnPositionedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnPositionedDispatcher.kt\nandroidx/compose/ui/node/OnPositionedDispatcher\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n1#1,96:1\n1101#2:97\n1083#2,2:98\n519#3:100\n641#3,2:101\n641#3,2:103\n472#3:105\n423#3,9:107\n207#4:106\n*S KotlinDebug\n*F\n+ 1 OnPositionedDispatcher.kt\nandroidx/compose/ui/node/OnPositionedDispatcher\n*L\n26#1:97\n26#1:98,2\n29#1:100\n32#1:101,2\n42#1:103,2\n61#1:105\n79#1:107,9\n79#1:106\n*E\n"})
/* loaded from: classes2.dex */
public final class OnPositionedDispatcher {
    private static final int MinArraySize = 16;

    @l
    private LayoutNode[] cachedNodes;

    @k
    private final MutableVector<LayoutNode> layoutNodes = new MutableVector<>(new LayoutNode[16], 0);

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class DepthComparator implements Comparator<LayoutNode> {

            @k
            public static final DepthComparator INSTANCE = new DepthComparator();

            private DepthComparator() {
            }

            @Override // java.util.Comparator
            public int compare(@k LayoutNode layoutNode, @k LayoutNode layoutNode2) {
                int t11 = g0.t(layoutNode2.getDepth$ui_release(), layoutNode.getDepth$ui_release());
                return t11 != 0 ? t11 : g0.t(layoutNode.hashCode(), layoutNode2.hashCode());
            }
        }

        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    private final void dispatchHierarchy(LayoutNode layoutNode) {
        layoutNode.dispatchOnPositionedCallbacks$ui_release();
        layoutNode.setNeedsOnPositionedDispatch$ui_release(false);
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            dispatchHierarchy(layoutNodeArr[i11]);
        }
    }

    public final void dispatch() {
        this.layoutNodes.sortWith(Companion.DepthComparator.INSTANCE);
        int size = this.layoutNodes.getSize();
        LayoutNode[] layoutNodeArr = this.cachedNodes;
        if (layoutNodeArr == null || layoutNodeArr.length < size) {
            layoutNodeArr = new LayoutNode[Math.max(16, this.layoutNodes.getSize())];
        }
        this.cachedNodes = null;
        for (int i11 = 0; i11 < size; i11++) {
            layoutNodeArr[i11] = this.layoutNodes.content[i11];
        }
        this.layoutNodes.clear();
        while (true) {
            size--;
            if (-1 >= size) {
                this.cachedNodes = layoutNodeArr;
                return;
            }
            LayoutNode layoutNode = layoutNodeArr[size];
            g0.m(layoutNode);
            if (layoutNode.getNeedsOnPositionedDispatch$ui_release()) {
                dispatchHierarchy(layoutNode);
            }
        }
    }

    public final boolean isNotEmpty() {
        return this.layoutNodes.getSize() != 0;
    }

    public final void onNodePositioned(@k LayoutNode layoutNode) {
        this.layoutNodes.add(layoutNode);
        layoutNode.setNeedsOnPositionedDispatch$ui_release(true);
    }

    public final void onRootNodePositioned(@k LayoutNode layoutNode) {
        this.layoutNodes.clear();
        this.layoutNodes.add(layoutNode);
        layoutNode.setNeedsOnPositionedDispatch$ui_release(true);
    }

    public final void remove(@k LayoutNode layoutNode) {
        this.layoutNodes.remove(layoutNode);
    }
}
