package androidx.compose.ui.semantics;

import androidx.collection.IntObjectMap;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSemanticsOwner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsOwner.kt\nandroidx/compose/ui/semantics/SemanticsOwner\n+ 2 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,121:1\n287#2,6:122\n*S KotlinDebug\n*F\n+ 1 SemanticsOwner.kt\nandroidx/compose/ui/semantics/SemanticsOwner\n*L\n67#1:122,6\n*E\n"})
/* loaded from: classes2.dex */
public final class SemanticsOwner {
    public static final int $stable = 8;

    @k
    private final MutableObjectList<SemanticsListener> listeners = new MutableObjectList<>(2);

    @k
    private final IntObjectMap<LayoutNode> nodes;

    @k
    private final EmptySemanticsModifier outerSemanticsNode;

    @k
    private final LayoutNode rootNode;

    public SemanticsOwner(@k LayoutNode layoutNode, @k EmptySemanticsModifier emptySemanticsModifier, @k IntObjectMap<LayoutNode> intObjectMap) {
        this.rootNode = layoutNode;
        this.outerSemanticsNode = emptySemanticsModifier;
        this.nodes = intObjectMap;
    }

    @l
    public final SemanticsInfo get$ui_release(int i11) {
        return this.nodes.get(i11);
    }

    @k
    public final MutableObjectList<SemanticsListener> getListeners$ui_release() {
        return this.listeners;
    }

    @k
    public final SemanticsInfo getRootInfo$ui_release() {
        return this.rootNode;
    }

    @k
    public final SemanticsNode getRootSemanticsNode() {
        return SemanticsNodeKt.SemanticsNode(this.rootNode, true);
    }

    @k
    public final SemanticsNode getUnmergedRootSemanticsNode() {
        return new SemanticsNode(this.outerSemanticsNode, false, this.rootNode, new SemanticsConfiguration());
    }

    public final void notifySemanticsChange$ui_release(@k SemanticsInfo semanticsInfo, @l SemanticsConfiguration semanticsConfiguration) {
        MutableObjectList<SemanticsListener> mutableObjectList = this.listeners;
        Object[] objArr = mutableObjectList.content;
        int i11 = mutableObjectList._size;
        for (int i12 = 0; i12 < i11; i12++) {
            ((SemanticsListener) objArr[i12]).onSemanticsChanged(semanticsInfo, semanticsConfiguration);
        }
    }
}
