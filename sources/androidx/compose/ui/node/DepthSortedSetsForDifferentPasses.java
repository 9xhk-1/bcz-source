package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nDepthSortedSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSetsForDifferentPasses\n+ 2 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n*L\n1#1,203:1\n107#2:204\n107#2:205\n*S KotlinDebug\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSetsForDifferentPasses\n*L\n178#1:204\n190#1:205\n*E\n"})
/* loaded from: classes2.dex */
public final class DepthSortedSetsForDifferentPasses {
    public static final int $stable = 8;

    @k
    private final DepthSortedSet lookaheadSet;

    @k
    private final DepthSortedSet set;

    public DepthSortedSetsForDifferentPasses(boolean z11) {
        this.lookaheadSet = new DepthSortedSet(z11);
        this.set = new DepthSortedSet(z11);
    }

    public final void add(@k LayoutNode layoutNode, boolean z11) {
        if (z11) {
            this.lookaheadSet.add(layoutNode);
            this.set.add(layoutNode);
        } else {
            if (this.lookaheadSet.contains(layoutNode)) {
                return;
            }
            this.set.add(layoutNode);
        }
    }

    public final boolean contains(@k LayoutNode layoutNode, boolean z11) {
        boolean contains = this.lookaheadSet.contains(layoutNode);
        return z11 ? contains : contains || this.set.contains(layoutNode);
    }

    public final boolean isEmpty() {
        return this.set.isEmpty() && this.lookaheadSet.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    @k
    public final LayoutNode pop() {
        return !this.lookaheadSet.isEmpty() ? this.lookaheadSet.pop() : this.set.pop();
    }

    public final void popEach(@k p<? super LayoutNode, ? super Boolean, g2> pVar) {
        while (isNotEmpty()) {
            boolean isEmpty = this.lookaheadSet.isEmpty();
            pVar.invoke((!isEmpty ? this.lookaheadSet : this.set).pop(), Boolean.valueOf(!isEmpty));
        }
    }

    public final boolean remove(@k LayoutNode layoutNode, boolean z11) {
        return z11 ? this.lookaheadSet.remove(layoutNode) : this.set.remove(layoutNode);
    }

    public final boolean isEmpty(boolean z11) {
        return (z11 ? this.lookaheadSet : this.set).isEmpty();
    }

    public final boolean contains(@k LayoutNode layoutNode) {
        return this.lookaheadSet.contains(layoutNode) || this.set.contains(layoutNode);
    }

    public final boolean remove(@k LayoutNode layoutNode) {
        return this.set.remove(layoutNode) || this.lookaheadSet.remove(layoutNode);
    }
}
