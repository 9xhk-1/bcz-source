package androidx.compose.ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import java.util.Comparator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nDepthSortedSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n*L\n1#1,203:1\n107#1:230\n56#2,5:204\n56#2,5:209\n56#2,5:214\n56#2,5:219\n56#2,5:225\n438#3:224\n*S KotlinDebug\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n*L\n99#1:230\n55#1:204,5\n63#1:209,5\n70#1:214,5\n77#1:219,5\n84#1:225,5\n81#1:224\n*E\n"})
/* loaded from: classes2.dex */
public final class DepthSortedSet {
    public static final int $stable = 8;
    private final boolean extraAssertions;

    @l
    private MutableObjectIntMap<LayoutNode> mapOfOriginalDepth;

    @k
    private final TreeSet<LayoutNode> set;

    public DepthSortedSet(boolean z11) {
        Comparator comparator;
        this.extraAssertions = z11;
        comparator = DepthSortedSetKt.DepthComparator;
        this.set = new TreeSet<>(comparator);
    }

    private final MutableObjectIntMap<LayoutNode> safeMapOfOriginalDepth() {
        if (this.mapOfOriginalDepth == null) {
            this.mapOfOriginalDepth = ObjectIntMapKt.mutableObjectIntMapOf();
        }
        MutableObjectIntMap<LayoutNode> mutableObjectIntMap = this.mapOfOriginalDepth;
        g0.m(mutableObjectIntMap);
        return mutableObjectIntMap;
    }

    public final void add(@k LayoutNode layoutNode) {
        if (!layoutNode.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("DepthSortedSet.add called on an unattached node");
        }
        if (this.extraAssertions) {
            MutableObjectIntMap<LayoutNode> safeMapOfOriginalDepth = safeMapOfOriginalDepth();
            int orDefault = safeMapOfOriginalDepth.getOrDefault(layoutNode, Integer.MAX_VALUE);
            if (orDefault == Integer.MAX_VALUE) {
                safeMapOfOriginalDepth.set(layoutNode, layoutNode.getDepth$ui_release());
            } else {
                if (!(orDefault == layoutNode.getDepth$ui_release())) {
                    InlineClassHelperKt.throwIllegalStateException("invalid node depth");
                }
            }
        }
        this.set.add(layoutNode);
    }

    public final boolean contains(@k LayoutNode layoutNode) {
        boolean contains = this.set.contains(layoutNode);
        if (this.extraAssertions) {
            if (!(contains == safeMapOfOriginalDepth().containsKey(layoutNode))) {
                InlineClassHelperKt.throwIllegalStateException("inconsistency in TreeSet");
            }
        }
        return contains;
    }

    public final boolean isEmpty() {
        return this.set.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    @k
    public final LayoutNode pop() {
        LayoutNode first = this.set.first();
        remove(first);
        return first;
    }

    public final void popEach(@k x00.l<? super LayoutNode, g2> lVar) {
        while (!isEmpty()) {
            lVar.invoke(pop());
        }
    }

    public final boolean remove(@k LayoutNode layoutNode) {
        if (!layoutNode.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("DepthSortedSet.remove called on an unattached node");
        }
        boolean remove = this.set.remove(layoutNode);
        if (this.extraAssertions) {
            MutableObjectIntMap<LayoutNode> safeMapOfOriginalDepth = safeMapOfOriginalDepth();
            if (safeMapOfOriginalDepth.containsKey(layoutNode)) {
                int i11 = safeMapOfOriginalDepth.get(layoutNode);
                safeMapOfOriginalDepth.remove(layoutNode);
                if (!(i11 == (remove ? layoutNode.getDepth$ui_release() : Integer.MAX_VALUE))) {
                    InlineClassHelperKt.throwIllegalStateException("invalid node depth");
                }
            }
        }
        return remove;
    }

    @k
    public String toString() {
        return this.set.toString();
    }
}
