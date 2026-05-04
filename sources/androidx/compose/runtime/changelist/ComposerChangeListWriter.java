package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.SlotReader;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.Stack;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.a;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nComposerChangeListWriter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposerChangeListWriter.kt\nandroidx/compose/runtime/changelist/ComposerChangeListWriter\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Stack.kt\nandroidx/compose/runtime/IntStack\n*L\n1#1,466:1\n4643#2,5:467\n4643#2,5:472\n4643#2,5:477\n4643#2,5:483\n82#3:482\n*S KotlinDebug\n*F\n+ 1 ComposerChangeListWriter.kt\nandroidx/compose/runtime/changelist/ComposerChangeListWriter\n*L\n162#1:467,5\n251#1:472,5\n309#1:477,5\n448#1:483,5\n448#1:482\n*E\n"})
/* loaded from: classes.dex */
public final class ComposerChangeListWriter {
    private static final int invalidGroupLocation = -2;

    @k
    private ChangeList changeList;

    @k
    private final ComposerImpl composer;
    private int moveCount;
    private int pendingUps;
    private boolean startedGroup;
    private int writersReaderDelta;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @k
    private final IntStack startedGroups = new IntStack();
    private boolean implicitRootStart = true;

    @k
    private ArrayList<Object> pendingDownNodes = Stack.m1936constructorimpl$default(null, 1, null);
    private int removeFrom = -1;
    private int moveFrom = -1;
    private int moveTo = -1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    public ComposerChangeListWriter(@k ComposerImpl composerImpl, @k ChangeList changeList) {
        this.composer = composerImpl;
        this.changeList = changeList;
    }

    private final void ensureGroupStarted(Anchor anchor) {
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushEnsureGroupStarted(anchor);
        this.startedGroup = true;
    }

    private final void ensureRootStarted() {
        if (this.startedGroup || !this.implicitRootStart) {
            return;
        }
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushEnsureRootStarted();
        this.startedGroup = true;
    }

    private final SlotReader getReader() {
        return this.composer.getReader$runtime_release();
    }

    public static /* synthetic */ void includeOperationsIn$default(ComposerChangeListWriter composerChangeListWriter, ChangeList changeList, IntRef intRef, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            intRef = null;
        }
        composerChangeListWriter.includeOperationsIn(changeList, intRef);
    }

    private final void pushApplierOperationPreamble() {
        pushPendingUpsAndDowns();
    }

    private final void pushPendingUpsAndDowns() {
        int i11 = this.pendingUps;
        if (i11 > 0) {
            this.changeList.pushUps(i11);
            this.pendingUps = 0;
        }
        if (Stack.m1942isNotEmptyimpl(this.pendingDownNodes)) {
            this.changeList.pushDowns(Stack.m1947toArrayimpl(this.pendingDownNodes));
            Stack.m1934clearimpl(this.pendingDownNodes);
        }
    }

    private final void pushSlotEditingOperationPreamble() {
        realizeOperationLocation$default(this, false, 1, null);
        recordSlotEditing();
    }

    private final void pushSlotTableOperationPreamble(boolean z11) {
        realizeOperationLocation(z11);
    }

    public static /* synthetic */ void pushSlotTableOperationPreamble$default(ComposerChangeListWriter composerChangeListWriter, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        composerChangeListWriter.pushSlotTableOperationPreamble(z11);
    }

    private final void realizeMoveNode(int i11, int i12, int i13) {
        pushApplierOperationPreamble();
        this.changeList.pushMoveNode(i11, i12, i13);
    }

    private final void realizeNodeMovementOperations() {
        int i11 = this.moveCount;
        if (i11 > 0) {
            int i12 = this.removeFrom;
            if (i12 >= 0) {
                realizeRemoveNode(i12, i11);
                this.removeFrom = -1;
            } else {
                realizeMoveNode(this.moveTo, this.moveFrom, i11);
                this.moveFrom = -1;
                this.moveTo = -1;
            }
            this.moveCount = 0;
        }
    }

    private final void realizeOperationLocation(boolean z11) {
        int parent = z11 ? getReader().getParent() : getReader().getCurrentGroup();
        int i11 = parent - this.writersReaderDelta;
        if (!(i11 >= 0)) {
            ComposerKt.composeImmediateRuntimeError("Tried to seek backward");
        }
        if (i11 > 0) {
            this.changeList.pushAdvanceSlotsBy(i11);
            this.writersReaderDelta = parent;
        }
    }

    public static /* synthetic */ void realizeOperationLocation$default(ComposerChangeListWriter composerChangeListWriter, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        composerChangeListWriter.realizeOperationLocation(z11);
    }

    private final void realizeRemoveNode(int i11, int i12) {
        pushApplierOperationPreamble();
        this.changeList.pushRemoveNode(i11, i12);
    }

    public final void appendValue(@k Anchor anchor, @l Object obj) {
        this.changeList.pushAppendValue(anchor, obj);
    }

    public final void copyNodesToNewAnchorLocation(@k List<? extends Object> list, @k IntRef intRef) {
        this.changeList.pushCopyNodesToNewAnchorLocation(list, intRef);
    }

    public final void copySlotTableToAnchorLocation(@l MovableContentState movableContentState, @k CompositionContext compositionContext, @k MovableContentStateReference movableContentStateReference, @k MovableContentStateReference movableContentStateReference2) {
        this.changeList.pushCopySlotTableToAnchorLocation(movableContentState, compositionContext, movableContentStateReference, movableContentStateReference2);
    }

    public final void deactivateCurrentGroup() {
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushDeactivateCurrentGroup();
    }

    public final void determineMovableContentNodeIndex(@k IntRef intRef, @k Anchor anchor) {
        pushPendingUpsAndDowns();
        this.changeList.pushDetermineMovableContentNodeIndex(intRef, anchor);
    }

    public final void endCompositionScope(@k x00.l<? super Composition, g2> lVar, @k Composition composition) {
        this.changeList.pushEndCompositionScope(lVar, composition);
    }

    public final void endCurrentGroup() {
        int parent = getReader().getParent();
        if (!(this.startedGroups.peekOr(-1) <= parent)) {
            ComposerKt.composeImmediateRuntimeError("Missed recording an endGroup");
        }
        if (this.startedGroups.peekOr(-1) == parent) {
            pushSlotTableOperationPreamble$default(this, false, 1, null);
            this.startedGroups.pop();
            this.changeList.pushEndCurrentGroup();
        }
    }

    public final void endMovableContentPlacement() {
        this.changeList.pushEndMovableContentPlacement();
        this.writersReaderDelta = 0;
    }

    public final void endNodeMovement() {
        realizeNodeMovementOperations();
    }

    public final void endNodeMovementAndDeleteNode(int i11, int i12) {
        endNodeMovement();
        pushPendingUpsAndDowns();
        int nodeCount = getReader().isNode(i12) ? 1 : getReader().nodeCount(i12);
        if (nodeCount > 0) {
            removeNode(i11, nodeCount);
        }
    }

    public final void endResumingScope(@k RecomposeScopeImpl recomposeScopeImpl) {
        this.changeList.pushEndResumingScope(recomposeScopeImpl);
    }

    public final void endRoot() {
        if (this.startedGroup) {
            pushSlotTableOperationPreamble$default(this, false, 1, null);
            pushSlotTableOperationPreamble$default(this, false, 1, null);
            this.changeList.pushEndCurrentGroup();
            this.startedGroup = false;
        }
    }

    public final void finalizeComposition() {
        pushPendingUpsAndDowns();
        if (this.startedGroups.tos == 0) {
            return;
        }
        ComposerKt.composeImmediateRuntimeError("Missed recording an endGroup()");
    }

    @k
    public final ChangeList getChangeList() {
        return this.changeList;
    }

    public final boolean getImplicitRootStart() {
        return this.implicitRootStart;
    }

    public final boolean getPastParent() {
        return getReader().getParent() - this.writersReaderDelta < 0;
    }

    public final void includeOperationsIn(@k ChangeList changeList, @l IntRef intRef) {
        this.changeList.pushExecuteOperationsIn(changeList, intRef);
    }

    public final void insertSlots(@k Anchor anchor, @k SlotTable slotTable) {
        pushPendingUpsAndDowns();
        pushSlotEditingOperationPreamble();
        realizeNodeMovementOperations();
        this.changeList.pushInsertSlots(anchor, slotTable);
    }

    public final void moveCurrentGroup(int i11) {
        pushSlotEditingOperationPreamble();
        this.changeList.pushMoveCurrentGroup(i11);
    }

    public final void moveDown(@l Object obj) {
        realizeNodeMovementOperations();
        Stack.m1946pushimpl(this.pendingDownNodes, obj);
    }

    public final void moveNode(int i11, int i12, int i13) {
        if (i13 > 0) {
            int i14 = this.moveCount;
            if (i14 > 0 && this.moveFrom == i11 - i14 && this.moveTo == i12 - i14) {
                this.moveCount = i14 + i13;
                return;
            }
            realizeNodeMovementOperations();
            this.moveFrom = i11;
            this.moveTo = i12;
            this.moveCount = i13;
        }
    }

    public final void moveReaderRelativeTo(int i11) {
        this.writersReaderDelta += i11 - getReader().getCurrentGroup();
    }

    public final void moveReaderToAbsolute(int i11) {
        this.writersReaderDelta = i11;
    }

    public final void moveUp() {
        realizeNodeMovementOperations();
        if (Stack.m1942isNotEmptyimpl(this.pendingDownNodes)) {
            Stack.m1945popimpl(this.pendingDownNodes);
        } else {
            this.pendingUps++;
        }
    }

    public final void recordSlotEditing() {
        SlotReader reader;
        int parent;
        if (getReader().getSize() <= 0 || this.startedGroups.peekOr(-2) == (parent = (reader = getReader()).getParent())) {
            return;
        }
        ensureRootStarted();
        if (parent > 0) {
            Anchor anchor = reader.anchor(parent);
            this.startedGroups.push(parent);
            ensureGroupStarted(anchor);
        }
    }

    public final void releaseMovableContent() {
        pushPendingUpsAndDowns();
        if (this.startedGroup) {
            skipToEndOfCurrentGroup();
            endRoot();
        }
    }

    public final void releaseMovableGroupAtCurrent(@k ControlledComposition controlledComposition, @k CompositionContext compositionContext, @k MovableContentStateReference movableContentStateReference) {
        this.changeList.pushReleaseMovableGroupAtCurrent(controlledComposition, compositionContext, movableContentStateReference);
    }

    public final void remember(@k RememberObserverHolder rememberObserverHolder) {
        this.changeList.pushRemember(rememberObserverHolder);
    }

    public final void rememberPausingScope(@k RecomposeScopeImpl recomposeScopeImpl) {
        this.changeList.pushRememberPausingScope(recomposeScopeImpl);
    }

    public final void removeCurrentGroup() {
        pushSlotEditingOperationPreamble();
        this.changeList.pushRemoveCurrentGroup();
        this.writersReaderDelta += getReader().getGroupSize();
    }

    public final void removeNode(int i11, int i12) {
        if (i12 > 0) {
            if (!(i11 >= 0)) {
                ComposerKt.composeImmediateRuntimeError("Invalid remove index " + i11);
            }
            if (this.removeFrom == i11) {
                this.moveCount += i12;
                return;
            }
            realizeNodeMovementOperations();
            this.removeFrom = i11;
            this.moveCount = i12;
        }
    }

    public final void resetSlots() {
        this.changeList.pushResetSlots();
    }

    public final void resetTransientState() {
        this.startedGroup = false;
        this.startedGroups.clear();
        this.writersReaderDelta = 0;
    }

    public final void setChangeList(@k ChangeList changeList) {
        this.changeList = changeList;
    }

    public final void setImplicitRootStart(boolean z11) {
        this.implicitRootStart = z11;
    }

    public final void sideEffect(@k a<g2> aVar) {
        this.changeList.pushSideEffect(aVar);
    }

    public final void skipToEndOfCurrentGroup() {
        this.changeList.pushSkipToEndOfCurrentGroup();
    }

    public final void startResumingScope(@k RecomposeScopeImpl recomposeScopeImpl) {
        this.changeList.pushStartResumingScope(recomposeScopeImpl);
    }

    public final void trimValues(int i11) {
        if (i11 > 0) {
            pushSlotEditingOperationPreamble();
            this.changeList.pushTrimValues(i11);
        }
    }

    public final void updateAnchoredValue(@l Object obj, @k Anchor anchor, int i11) {
        this.changeList.pushUpdateAnchoredValue(obj, anchor, i11);
    }

    public final void updateAuxData(@l Object obj) {
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushUpdateAuxData(obj);
    }

    public final <T, V> void updateNode(V v11, @k p<? super T, ? super V, g2> pVar) {
        pushApplierOperationPreamble();
        this.changeList.pushUpdateNode(v11, pVar);
    }

    public final void updateValue(@l Object obj, int i11) {
        pushSlotTableOperationPreamble(true);
        this.changeList.pushUpdateValue(obj, i11);
    }

    public final void useNode(@l Object obj) {
        pushApplierOperationPreamble();
        this.changeList.pushUseNode(obj);
    }

    public final void withChangeList(@k ChangeList changeList, @k a<g2> aVar) {
        ChangeList changeList2 = getChangeList();
        try {
            setChangeList(changeList);
            aVar.invoke();
        } finally {
            d0.d(1);
            setChangeList(changeList2);
            d0.c(1);
        }
    }

    public final void withoutImplicitRootStart(@k a<g2> aVar) {
        boolean implicitRootStart = getImplicitRootStart();
        try {
            setImplicitRootStart(false);
            aVar.invoke();
        } finally {
            d0.d(1);
            setImplicitRootStart(implicitRootStart);
            d0.c(1);
        }
    }

    public final void insertSlots(@k Anchor anchor, @k SlotTable slotTable, @k FixupList fixupList) {
        pushPendingUpsAndDowns();
        pushSlotEditingOperationPreamble();
        realizeNodeMovementOperations();
        this.changeList.pushInsertSlots(anchor, slotTable, fixupList);
    }
}
