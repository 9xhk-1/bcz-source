package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SlotWriter;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/OperationKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1057:1\n4665#2:1058\n4643#2,5:1059\n4665#2:1064\n4643#2,5:1065\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/OperationKt\n*L\n1038#1:1058\n1038#1:1059,5\n1054#1:1064\n1054#1:1065,5\n*E\n"})
/* loaded from: classes.dex */
public final class OperationKt {
    private static final int currentNodeIndex(SlotWriter slotWriter) {
        int currentGroup = slotWriter.getCurrentGroup();
        int parent = slotWriter.getParent();
        while (parent >= 0 && !slotWriter.isNode(parent)) {
            parent = slotWriter.parent(parent);
        }
        int i11 = parent + 1;
        int i12 = 0;
        while (i11 < currentGroup) {
            if (slotWriter.indexInGroup(currentGroup, i11)) {
                if (slotWriter.isNode(i11)) {
                    i12 = 0;
                }
                i11++;
            } else {
                i12 += slotWriter.isNode(i11) ? 1 : slotWriter.nodeCount(i11);
                i11 += slotWriter.groupSize(i11);
            }
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int positionToInsert(SlotWriter slotWriter, Anchor anchor, Applier<Object> applier) {
        int anchorIndex = slotWriter.anchorIndex(anchor);
        if (!(slotWriter.getCurrentGroup() < anchorIndex)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        positionToParentOf(slotWriter, applier, anchorIndex);
        int currentNodeIndex = currentNodeIndex(slotWriter);
        while (slotWriter.getCurrentGroup() < anchorIndex) {
            if (slotWriter.indexInCurrentGroup(anchorIndex)) {
                if (slotWriter.isNode()) {
                    applier.down(slotWriter.node(slotWriter.getCurrentGroup()));
                    currentNodeIndex = 0;
                }
                slotWriter.startGroup();
            } else {
                currentNodeIndex += slotWriter.skipGroup();
            }
        }
        if (!(slotWriter.getCurrentGroup() == anchorIndex)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        return currentNodeIndex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void positionToParentOf(SlotWriter slotWriter, Applier<Object> applier, int i11) {
        while (!slotWriter.indexInParent(i11)) {
            slotWriter.skipToGroupEnd();
            if (slotWriter.isNode(slotWriter.getParent())) {
                applier.up();
            }
            slotWriter.endGroup();
        }
    }
}
