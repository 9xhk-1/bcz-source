package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.changelist.Operations;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import m80.k;
import m80.l;
import x00.a;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nChangeList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeList.kt\nandroidx/compose/runtime/changelist/ChangeList\n+ 2 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n+ 3 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Remember\n+ 4 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RememberPausingScope\n+ 5 Operation.kt\nandroidx/compose/runtime/changelist/Operation$StartResumingScope\n+ 6 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndResumingScope\n+ 7 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateValue\n+ 8 Operations.kt\nandroidx/compose/runtime/changelist/Operations$WriteScope\n+ 9 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue\n+ 10 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AppendValue\n+ 11 Operation.kt\nandroidx/compose/runtime/changelist/Operation$TrimParentValues\n+ 12 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAuxData\n+ 13 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EnsureGroupStarted\n+ 14 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlots\n+ 15 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups\n+ 16 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveCurrentGroup\n+ 17 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndCompositionScope\n+ 18 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n+ 19 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RemoveNode\n+ 20 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveNode\n+ 21 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy\n+ 22 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Ups\n+ 23 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Downs\n+ 24 Operation.kt\nandroidx/compose/runtime/changelist/Operation$SideEffect\n+ 25 Operation.kt\nandroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex\n+ 26 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation\n+ 27 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation\n+ 28 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent\n+ 29 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ApplyChangeList\n*L\n1#1,331:1\n202#2,4:332\n207#2,2:337\n202#2,4:339\n207#2,2:344\n202#2,4:346\n207#2,2:351\n202#2,4:353\n207#2,2:358\n202#2,4:360\n359#2:375\n356#2:376\n207#2,2:378\n202#2,4:380\n359#2:398\n356#2:399\n207#2,2:401\n202#2,4:403\n207#2,2:411\n202#2,4:413\n359#2:427\n356#2:428\n207#2,2:430\n202#2,4:432\n207#2,2:437\n202#2,4:439\n207#2,2:444\n202#2,4:446\n207#2,2:454\n202#2,4:456\n207#2,2:463\n202#2,4:465\n359#2:479\n356#2:480\n207#2,2:482\n202#2,4:484\n207#2,2:490\n202#2,4:492\n207#2,2:500\n202#2,4:502\n356#2:520\n207#2,2:525\n202#2,4:527\n356#2:550\n207#2,2:556\n202#2,4:558\n359#2:572\n356#2:573\n207#2,2:575\n202#2,4:577\n359#2:591\n356#2:592\n207#2,2:594\n202#2,4:596\n207#2,2:601\n202#2,4:603\n207#2,2:608\n202#2,4:610\n207#2,2:616\n202#2,4:618\n207#2,2:624\n202#2,4:626\n207#2,2:634\n202#2,4:636\n207#2,2:643\n202#2,4:645\n207#2,2:651\n153#3:336\n172#4:343\n192#5:350\n212#6:357\n299#7:364\n302#7:365\n370#8,9:366\n379#8:377\n370#8,9:389\n379#8:400\n370#8,9:418\n379#8:429\n370#8,9:470\n379#8:481\n387#8,10:510\n397#8,4:521\n410#8,11:539\n421#8,5:551\n370#8,9:563\n379#8:574\n370#8,9:582\n379#8:593\n342#9,4:384\n348#9:388\n232#10,4:407\n260#11:417\n399#12:436\n428#13:443\n607#14,4:450\n639#15:460\n642#15:461\n645#15:462\n457#16:469\n496#17:488\n499#17:489\n532#18,4:496\n557#19,4:506\n583#20:531\n580#20,7:532\n112#21:562\n70#22:581\n89#23:600\n134#24:607\n775#25:614\n778#25:615\n810#26:622\n807#26:623\n838#27:630\n841#27:631\n847#27:632\n844#27:633\n907#28:640\n910#28:641\n913#28:642\n944#29:649\n947#29:650\n*S KotlinDebug\n*F\n+ 1 ChangeList.kt\nandroidx/compose/runtime/changelist/ChangeList\n*L\n91#1:332,4\n91#1:337,2\n95#1:339,4\n95#1:344,2\n99#1:346,4\n99#1:351,2\n103#1:353,4\n103#1:358,2\n107#1:360,4\n109#1:375\n109#1:376\n107#1:378,2\n114#1:380,4\n116#1:398\n116#1:399\n114#1:401,2\n121#1:403,4\n121#1:411,2\n127#1:413,4\n127#1:427\n127#1:428\n127#1:430,2\n139#1:432,4\n139#1:437,2\n147#1:439,4\n147#1:444,2\n163#1:446,4\n163#1:454,2\n169#1:456,4\n169#1:463,2\n182#1:465,4\n182#1:479\n182#1:480\n182#1:482,2\n186#1:484,4\n186#1:490,2\n203#1:492,4\n203#1:500,2\n210#1:502,4\n211#1:520\n210#1:525,2\n216#1:527,4\n217#1:550\n216#1:556,2\n222#1:558,4\n222#1:572\n222#1:573\n222#1:575,2\n226#1:577,4\n226#1:591\n226#1:592\n226#1:594,2\n231#1:596,4\n231#1:601,2\n236#1:603,4\n236#1:608,2\n240#1:610,4\n240#1:616,2\n252#1:618,4\n252#1:624,2\n270#1:626,4\n270#1:634,2\n290#1:636,4\n290#1:643,2\n308#1:645,4\n308#1:651,2\n91#1:336\n95#1:343\n99#1:350\n103#1:357\n108#1:364\n109#1:365\n109#1:366,9\n109#1:377\n116#1:389,9\n116#1:400\n127#1:418,9\n127#1:429\n182#1:470,9\n182#1:481\n211#1:510,10\n211#1:521,4\n217#1:539,11\n217#1:551,5\n222#1:563,9\n222#1:574\n226#1:582,9\n226#1:593\n115#1:384,4\n116#1:388\n122#1:407,4\n127#1:417\n139#1:436\n147#1:443\n164#1:450,4\n171#1:460\n173#1:461\n175#1:462\n182#1:469\n188#1:488\n190#1:489\n205#1:496,4\n211#1:506,4\n217#1:531\n217#1:532,7\n222#1:562\n226#1:581\n231#1:600\n236#1:607\n242#1:614\n244#1:615\n254#1:622\n256#1:623\n272#1:630\n274#1:631\n276#1:632\n278#1:633\n292#1:640\n294#1:641\n296#1:642\n310#1:649\n312#1:650\n*E\n"})
/* loaded from: classes.dex */
public final class ChangeList extends OperationsDebugStringFormattable {
    public static final int $stable = 8;

    @k
    private final Operations operations = new Operations();

    public static /* synthetic */ void pushExecuteOperationsIn$default(ChangeList changeList, ChangeList changeList2, IntRef intRef, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            intRef = null;
        }
        changeList.pushExecuteOperationsIn(changeList2, intRef);
    }

    public final void clear() {
        this.operations.clear();
    }

    public final void executeAndFlushAllPendingChanges(@k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
        this.operations.executeAndFlushAllPendingOperations(applier, slotWriter, rememberManager);
    }

    public final int getSize() {
        return this.operations.getSize();
    }

    public final boolean isEmpty() {
        return this.operations.isEmpty();
    }

    public final boolean isNotEmpty() {
        return this.operations.isNotEmpty();
    }

    public final void pushAdvanceSlotsBy(int i11) {
        Operations operations = this.operations;
        Operation.AdvanceSlotsBy advanceSlotsBy = Operation.AdvanceSlotsBy.INSTANCE;
        operations.pushOp(advanceSlotsBy);
        Operations m2012constructorimpl = Operations.WriteScope.m2012constructorimpl(operations);
        m2012constructorimpl.intArgs[m2012constructorimpl.intArgsSize - m2012constructorimpl.opCodes[m2012constructorimpl.opCodesSize - 1].getInts()] = i11;
        operations.ensureAllArgumentsPushedFor(advanceSlotsBy);
    }

    public final void pushAppendValue(@k Anchor anchor, @l Object obj) {
        Operations operations = this.operations;
        Operation.AppendValue appendValue = Operation.AppendValue.INSTANCE;
        operations.pushOp(appendValue);
        Operations.WriteScope.m2021setObjects4uCC6AY(Operations.WriteScope.m2012constructorimpl(operations), Operation.ObjectParameter.m1989constructorimpl(0), anchor, Operation.ObjectParameter.m1989constructorimpl(1), obj);
        operations.ensureAllArgumentsPushedFor(appendValue);
    }

    public final void pushCopyNodesToNewAnchorLocation(@k List<? extends Object> list, @k IntRef intRef) {
        if (list.isEmpty()) {
            return;
        }
        Operations operations = this.operations;
        Operation.CopyNodesToNewAnchorLocation copyNodesToNewAnchorLocation = Operation.CopyNodesToNewAnchorLocation.INSTANCE;
        operations.pushOp(copyNodesToNewAnchorLocation);
        Operations.WriteScope.m2021setObjects4uCC6AY(Operations.WriteScope.m2012constructorimpl(operations), Operation.ObjectParameter.m1989constructorimpl(1), list, Operation.ObjectParameter.m1989constructorimpl(0), intRef);
        operations.ensureAllArgumentsPushedFor(copyNodesToNewAnchorLocation);
    }

    public final void pushCopySlotTableToAnchorLocation(@l MovableContentState movableContentState, @k CompositionContext compositionContext, @k MovableContentStateReference movableContentStateReference, @k MovableContentStateReference movableContentStateReference2) {
        Operations operations = this.operations;
        Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation = Operation.CopySlotTableToAnchorLocation.INSTANCE;
        operations.pushOp(copySlotTableToAnchorLocation);
        Operations.WriteScope.m2022setObjectsOGa0p1M(Operations.WriteScope.m2012constructorimpl(operations), Operation.ObjectParameter.m1989constructorimpl(0), movableContentState, Operation.ObjectParameter.m1989constructorimpl(1), compositionContext, Operation.ObjectParameter.m1989constructorimpl(3), movableContentStateReference2, Operation.ObjectParameter.m1989constructorimpl(2), movableContentStateReference);
        operations.ensureAllArgumentsPushedFor(copySlotTableToAnchorLocation);
    }

    public final void pushDeactivateCurrentGroup() {
        this.operations.push(Operation.DeactivateCurrentGroup.INSTANCE);
    }

    public final void pushDetermineMovableContentNodeIndex(@k IntRef intRef, @k Anchor anchor) {
        Operations operations = this.operations;
        Operation.DetermineMovableContentNodeIndex determineMovableContentNodeIndex = Operation.DetermineMovableContentNodeIndex.INSTANCE;
        operations.pushOp(determineMovableContentNodeIndex);
        Operations.WriteScope.m2021setObjects4uCC6AY(Operations.WriteScope.m2012constructorimpl(operations), Operation.ObjectParameter.m1989constructorimpl(0), intRef, Operation.ObjectParameter.m1989constructorimpl(1), anchor);
        operations.ensureAllArgumentsPushedFor(determineMovableContentNodeIndex);
    }

    public final void pushDowns(@k Object[] objArr) {
        if (objArr.length == 0) {
            return;
        }
        Operations operations = this.operations;
        Operation.Downs downs = Operation.Downs.INSTANCE;
        operations.pushOp(downs);
        Operations.WriteScope.m2020setObjectDKhxnng(Operations.WriteScope.m2012constructorimpl(operations), Operation.ObjectParameter.m1989constructorimpl(0), objArr);
        operations.ensureAllArgumentsPushedFor(downs);
    }

    public final void pushEndCompositionScope(@k x00.l<? super Composition, g2> lVar, @k Composition composition) {
        Operations operations = this.operations;
        Operation.EndCompositionScope endCompositionScope = Operation.EndCompositionScope.INSTANCE;
        operations.pushOp(endCompositionScope);
        Operations.WriteScope.m2021setObjects4uCC6AY(Operations.WriteScope.m2012constructorimpl(operations), Operation.ObjectParameter.m1989constructorimpl(0), lVar, Operation.ObjectParameter.m1989constructorimpl(1), composition);
        operations.ensureAllArgumentsPushedFor(endCompositionScope);
    }

    public final void pushEndCurrentGroup() {
        this.operations.push(Operation.EndCurrentGroup.INSTANCE);
    }

    public final void pushEndMovableContentPlacement() {
        this.operations.push(Operation.EndMovableContentPlacement.INSTANCE);
    }

    public final void pushEndResumingScope(@k RecomposeScopeImpl recomposeScopeImpl) {
        Operations operations = this.operations;
        Operation.EndResumingScope endResumingScope = Operation.EndResumingScope.INSTANCE;
        operations.pushOp(endResumingScope);
        Operations.WriteScope.m2020setObjectDKhxnng(Operations.WriteScope.m2012constructorimpl(operations), Operation.ObjectParameter.m1989constructorimpl(0), recomposeScopeImpl);
        operations.ensureAllArgumentsPushedFor(endResumingScope);
    }

    public final void pushEnsureGroupStarted(@k Anchor anchor) {
        Operations operations = this.operations;
        Operation.EnsureGroupStarted ensureGroupStarted = Operation.EnsureGroupStarted.INSTANCE;
        operations.pushOp(ensureGroupStarted);
        Operations.WriteScope.m2020setObjectDKhxnng(Operations.WriteScope.m2012constructorimpl(operations), Operation.ObjectParameter.m1989constructorimpl(0), anchor);
        operations.ensureAllArgumentsPushedFor(ensureGroupStarted);
    }

    public final void pushEnsureRootStarted() {
        this.operations.push(Operation.EnsureRootGroupStarted.INSTANCE);
    }

    public final void pushExecuteOperationsIn(@k ChangeList changeList, @l IntRef intRef) {
        if (changeList.isNotEmpty()) {
            Operations operations = this.operations;
            Operation.ApplyChangeList applyChangeList = Operation.ApplyChangeList.INSTANCE;
            operations.pushOp(applyChangeList);
            Operations.WriteScope.m2021setObjects4uCC6AY(Operations.WriteScope.m2012constructorimpl(operations), Operation.ObjectParameter.m1989constructorimpl(0), changeList, Operation.ObjectParameter.m1989constructorimpl(1), intRef);
            operations.ensureAllArgumentsPushedFor(applyChangeList);
        }
    }

    public final void pushInsertSlots(@k Anchor anchor, @k SlotTable slotTable) {
        Operations operations = this.operations;
        Operation.InsertSlots insertSlots = Operation.InsertSlots.INSTANCE;
        operations.pushOp(insertSlots);
        Operations.WriteScope.m2021setObjects4uCC6AY(Operations.WriteScope.m2012constructorimpl(operations), Operation.ObjectParameter.m1989constructorimpl(0), anchor, Operation.ObjectParameter.m1989constructorimpl(1), slotTable);
        operations.ensureAllArgumentsPushedFor(insertSlots);
    }

    public final void pushMoveCurrentGroup(int i11) {
        Operations operations = this.operations;
        Operation.MoveCurrentGroup moveCurrentGroup = Operation.MoveCurrentGroup.INSTANCE;
        operations.pushOp(moveCurrentGroup);
        Operations m2012constructorimpl = Operations.WriteScope.m2012constructorimpl(operations);
        m2012constructorimpl.intArgs[m2012constructorimpl.intArgsSize - m2012constructorimpl.opCodes[m2012constructorimpl.opCodesSize - 1].getInts()] = i11;
        operations.ensureAllArgumentsPushedFor(moveCurrentGroup);
    }

    public final void pushMoveNode(int i11, int i12, int i13) {
        Operations operations = this.operations;
        Operation.MoveNode moveNode = Operation.MoveNode.INSTANCE;
        operations.pushOp(moveNode);
        Operations m2012constructorimpl = Operations.WriteScope.m2012constructorimpl(operations);
        int ints = m2012constructorimpl.intArgsSize - m2012constructorimpl.opCodes[m2012constructorimpl.opCodesSize - 1].getInts();
        int[] iArr = m2012constructorimpl.intArgs;
        iArr[ints + 1] = i11;
        iArr[ints] = i12;
        iArr[ints + 2] = i13;
        operations.ensureAllArgumentsPushedFor(moveNode);
    }

    public final void pushReleaseMovableGroupAtCurrent(@k ControlledComposition controlledComposition, @k CompositionContext compositionContext, @k MovableContentStateReference movableContentStateReference) {
        Operations operations = this.operations;
        Operation.ReleaseMovableGroupAtCurrent releaseMovableGroupAtCurrent = Operation.ReleaseMovableGroupAtCurrent.INSTANCE;
        operations.pushOp(releaseMovableGroupAtCurrent);
        Operations.WriteScope.m2023setObjectst7hvbck(Operations.WriteScope.m2012constructorimpl(operations), Operation.ObjectParameter.m1989constructorimpl(0), controlledComposition, Operation.ObjectParameter.m1989constructorimpl(1), compositionContext, Operation.ObjectParameter.m1989constructorimpl(2), movableContentStateReference);
        operations.ensureAllArgumentsPushedFor(releaseMovableGroupAtCurrent);
    }

    public final void pushRemember(@k RememberObserverHolder rememberObserverHolder) {
        Operations operations = this.operations;
        Operation.Remember remember = Operation.Remember.INSTANCE;
        operations.pushOp(remember);
        Operations.WriteScope.m2020setObjectDKhxnng(Operations.WriteScope.m2012constructorimpl(operations), Operation.ObjectParameter.m1989constructorimpl(0), rememberObserverHolder);
        operations.ensureAllArgumentsPushedFor(remember);
    }

    public final void pushRememberPausingScope(@k RecomposeScopeImpl recomposeScopeImpl) {
        Operations operations = this.operations;
        Operation.RememberPausingScope rememberPausingScope = Operation.RememberPausingScope.INSTANCE;
        operations.pushOp(rememberPausingScope);
        Operations.WriteScope.m2020setObjectDKhxnng(Operations.WriteScope.m2012constructorimpl(operations), Operation.ObjectParameter.m1989constructorimpl(0), recomposeScopeImpl);
        operations.ensureAllArgumentsPushedFor(rememberPausingScope);
    }

    public final void pushRemoveCurrentGroup() {
        this.operations.push(Operation.RemoveCurrentGroup.INSTANCE);
    }

    public final void pushRemoveNode(int i11, int i12) {
        Operations operations = this.operations;
        Operation.RemoveNode removeNode = Operation.RemoveNode.INSTANCE;
        operations.pushOp(removeNode);
        Operations m2012constructorimpl = Operations.WriteScope.m2012constructorimpl(operations);
        int ints = m2012constructorimpl.intArgsSize - m2012constructorimpl.opCodes[m2012constructorimpl.opCodesSize - 1].getInts();
        int[] iArr = m2012constructorimpl.intArgs;
        iArr[ints] = i11;
        iArr[ints + 1] = i12;
        operations.ensureAllArgumentsPushedFor(removeNode);
    }

    public final void pushResetSlots() {
        this.operations.push(Operation.ResetSlots.INSTANCE);
    }

    public final void pushSideEffect(@k a<g2> aVar) {
        Operations operations = this.operations;
        Operation.SideEffect sideEffect = Operation.SideEffect.INSTANCE;
        operations.pushOp(sideEffect);
        Operations.WriteScope.m2020setObjectDKhxnng(Operations.WriteScope.m2012constructorimpl(operations), Operation.ObjectParameter.m1989constructorimpl(0), aVar);
        operations.ensureAllArgumentsPushedFor(sideEffect);
    }

    public final void pushSkipToEndOfCurrentGroup() {
        this.operations.push(Operation.SkipToEndOfCurrentGroup.INSTANCE);
    }

    public final void pushStartResumingScope(@k RecomposeScopeImpl recomposeScopeImpl) {
        Operations operations = this.operations;
        Operation.StartResumingScope startResumingScope = Operation.StartResumingScope.INSTANCE;
        operations.pushOp(startResumingScope);
        Operations.WriteScope.m2020setObjectDKhxnng(Operations.WriteScope.m2012constructorimpl(operations), Operation.ObjectParameter.m1989constructorimpl(0), recomposeScopeImpl);
        operations.ensureAllArgumentsPushedFor(startResumingScope);
    }

    public final void pushTrimValues(int i11) {
        Operations operations = this.operations;
        Operation.TrimParentValues trimParentValues = Operation.TrimParentValues.INSTANCE;
        operations.pushOp(trimParentValues);
        Operations m2012constructorimpl = Operations.WriteScope.m2012constructorimpl(operations);
        m2012constructorimpl.intArgs[m2012constructorimpl.intArgsSize - m2012constructorimpl.opCodes[m2012constructorimpl.opCodesSize - 1].getInts()] = i11;
        operations.ensureAllArgumentsPushedFor(trimParentValues);
    }

    public final void pushUpdateAnchoredValue(@l Object obj, @k Anchor anchor, int i11) {
        Operations operations = this.operations;
        Operation.UpdateAnchoredValue updateAnchoredValue = Operation.UpdateAnchoredValue.INSTANCE;
        operations.pushOp(updateAnchoredValue);
        Operations m2012constructorimpl = Operations.WriteScope.m2012constructorimpl(operations);
        Operations.WriteScope.m2021setObjects4uCC6AY(m2012constructorimpl, Operation.ObjectParameter.m1989constructorimpl(0), obj, Operation.ObjectParameter.m1989constructorimpl(1), anchor);
        m2012constructorimpl.intArgs[m2012constructorimpl.intArgsSize - m2012constructorimpl.opCodes[m2012constructorimpl.opCodesSize - 1].getInts()] = i11;
        operations.ensureAllArgumentsPushedFor(updateAnchoredValue);
    }

    public final void pushUpdateAuxData(@l Object obj) {
        Operations operations = this.operations;
        Operation.UpdateAuxData updateAuxData = Operation.UpdateAuxData.INSTANCE;
        operations.pushOp(updateAuxData);
        Operations.WriteScope.m2020setObjectDKhxnng(Operations.WriteScope.m2012constructorimpl(operations), Operation.ObjectParameter.m1989constructorimpl(0), obj);
        operations.ensureAllArgumentsPushedFor(updateAuxData);
    }

    public final <T, V> void pushUpdateNode(V v11, @k p<? super T, ? super V, g2> pVar) {
        Operations operations = this.operations;
        Operation.UpdateNode updateNode = Operation.UpdateNode.INSTANCE;
        operations.pushOp(updateNode);
        Operations m2012constructorimpl = Operations.WriteScope.m2012constructorimpl(operations);
        int m1989constructorimpl = Operation.ObjectParameter.m1989constructorimpl(0);
        int m1989constructorimpl2 = Operation.ObjectParameter.m1989constructorimpl(1);
        g0.n(pVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        Operations.WriteScope.m2021setObjects4uCC6AY(m2012constructorimpl, m1989constructorimpl, v11, m1989constructorimpl2, (p) x0.q(pVar, 2));
        operations.ensureAllArgumentsPushedFor(updateNode);
    }

    public final void pushUpdateValue(@l Object obj, int i11) {
        Operations operations = this.operations;
        Operation.UpdateValue updateValue = Operation.UpdateValue.INSTANCE;
        operations.pushOp(updateValue);
        Operations m2012constructorimpl = Operations.WriteScope.m2012constructorimpl(operations);
        Operations.WriteScope.m2020setObjectDKhxnng(m2012constructorimpl, Operation.ObjectParameter.m1989constructorimpl(0), obj);
        m2012constructorimpl.intArgs[m2012constructorimpl.intArgsSize - m2012constructorimpl.opCodes[m2012constructorimpl.opCodesSize - 1].getInts()] = i11;
        operations.ensureAllArgumentsPushedFor(updateValue);
    }

    public final void pushUps(int i11) {
        Operations operations = this.operations;
        Operation.Ups ups = Operation.Ups.INSTANCE;
        operations.pushOp(ups);
        Operations m2012constructorimpl = Operations.WriteScope.m2012constructorimpl(operations);
        m2012constructorimpl.intArgs[m2012constructorimpl.intArgsSize - m2012constructorimpl.opCodes[m2012constructorimpl.opCodesSize - 1].getInts()] = i11;
        operations.ensureAllArgumentsPushedFor(ups);
    }

    public final void pushUseNode(@l Object obj) {
        if (obj instanceof ComposeNodeLifecycleCallback) {
            this.operations.push(Operation.UseCurrentNode.INSTANCE);
        }
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    @k
    public String toDebugString(@k String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ChangeList instance containing ");
        sb2.append(getSize());
        sb2.append(" operations");
        if (sb2.length() > 0) {
            sb2.append(":\n");
            sb2.append(this.operations.toDebugString(str));
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    public final void pushInsertSlots(@k Anchor anchor, @k SlotTable slotTable, @k FixupList fixupList) {
        Operations operations = this.operations;
        Operation.InsertSlotsWithFixups insertSlotsWithFixups = Operation.InsertSlotsWithFixups.INSTANCE;
        operations.pushOp(insertSlotsWithFixups);
        Operations.WriteScope.m2023setObjectst7hvbck(Operations.WriteScope.m2012constructorimpl(operations), Operation.ObjectParameter.m1989constructorimpl(0), anchor, Operation.ObjectParameter.m1989constructorimpl(1), slotTable, Operation.ObjectParameter.m1989constructorimpl(2), fixupList);
        operations.ensureAllArgumentsPushedFor(insertSlotsWithFixups);
    }
}
