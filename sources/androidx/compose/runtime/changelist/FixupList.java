package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.changelist.Operations;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import m80.k;
import x00.a;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nFixupList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FixupList.kt\nandroidx/compose/runtime/changelist/FixupList\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n+ 4 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertNodeFixup\n+ 5 Operations.kt\nandroidx/compose/runtime/changelist/Operations$WriteScope\n+ 6 Operation.kt\nandroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup\n+ 7 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n*L\n1#1,90:1\n4643#2,5:91\n4643#2,5:137\n202#3,4:96\n359#3:111\n356#3:112\n207#3,2:115\n202#3,4:117\n359#3:131\n356#3:132\n207#3,2:135\n202#3,4:142\n207#3,2:148\n679#4:100\n682#4:101\n685#4:114\n370#5,9:102\n379#5:113\n370#5,9:122\n379#5:133\n718#6:121\n721#6:134\n532#7:146\n535#7:147\n*S KotlinDebug\n*F\n+ 1 FixupList.kt\nandroidx/compose/runtime/changelist/FixupList\n*L\n49#1:91,5\n70#1:137,5\n57#1:96,4\n59#1:111\n59#1:112\n57#1:115,2\n63#1:117,4\n64#1:131\n64#1:132\n63#1:135,2\n77#1:142,4\n77#1:148,2\n58#1:100\n59#1:101\n60#1:114\n59#1:102,9\n59#1:113\n64#1:122,9\n64#1:133\n64#1:121\n65#1:134\n78#1:146\n79#1:147\n*E\n"})
/* loaded from: classes.dex */
public final class FixupList extends OperationsDebugStringFormattable {
    public static final int $stable = 8;

    @k
    private final Operations operations = new Operations();

    @k
    private final Operations pendingOperations = new Operations();

    public final void clear() {
        this.pendingOperations.clear();
        this.operations.clear();
    }

    public final void createAndInsertNode(@k a<? extends Object> aVar, int i11, @k Anchor anchor) {
        Operations operations = this.operations;
        Operation.InsertNodeFixup insertNodeFixup = Operation.InsertNodeFixup.INSTANCE;
        operations.pushOp(insertNodeFixup);
        Operations m2012constructorimpl = Operations.WriteScope.m2012constructorimpl(operations);
        Operations.WriteScope.m2020setObjectDKhxnng(m2012constructorimpl, Operation.ObjectParameter.m1989constructorimpl(0), aVar);
        m2012constructorimpl.intArgs[m2012constructorimpl.intArgsSize - m2012constructorimpl.opCodes[m2012constructorimpl.opCodesSize - 1].getInts()] = i11;
        Operations.WriteScope.m2020setObjectDKhxnng(m2012constructorimpl, Operation.ObjectParameter.m1989constructorimpl(1), anchor);
        operations.ensureAllArgumentsPushedFor(insertNodeFixup);
        Operations operations2 = this.pendingOperations;
        Operation.PostInsertNodeFixup postInsertNodeFixup = Operation.PostInsertNodeFixup.INSTANCE;
        operations2.pushOp(postInsertNodeFixup);
        Operations m2012constructorimpl2 = Operations.WriteScope.m2012constructorimpl(operations2);
        m2012constructorimpl2.intArgs[m2012constructorimpl2.intArgsSize - m2012constructorimpl2.opCodes[m2012constructorimpl2.opCodesSize - 1].getInts()] = i11;
        Operations.WriteScope.m2020setObjectDKhxnng(m2012constructorimpl2, Operation.ObjectParameter.m1989constructorimpl(0), anchor);
        operations2.ensureAllArgumentsPushedFor(postInsertNodeFixup);
    }

    public final void endNodeInsert() {
        if (!this.pendingOperations.isNotEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Cannot end node insertion, there are no pending operations that can be realized.");
        }
        this.pendingOperations.popInto(this.operations);
    }

    public final void executeAndFlushAllPendingFixups(@k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
        if (!this.pendingOperations.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
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

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    @k
    public String toDebugString(@k String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FixupList instance containing " + getSize() + " operations");
        if (sb2.length() > 0) {
            sb2.append(":\n" + this.operations.toDebugString(str));
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    public final <V, T> void updateNode(V v11, @k p<? super T, ? super V, g2> pVar) {
        Operations operations = this.operations;
        Operation.UpdateNode updateNode = Operation.UpdateNode.INSTANCE;
        operations.pushOp(updateNode);
        Operations m2012constructorimpl = Operations.WriteScope.m2012constructorimpl(operations);
        Operations.WriteScope.m2020setObjectDKhxnng(m2012constructorimpl, Operation.ObjectParameter.m1989constructorimpl(0), v11);
        int m1989constructorimpl = Operation.ObjectParameter.m1989constructorimpl(1);
        g0.n(pVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        Operations.WriteScope.m2020setObjectDKhxnng(m2012constructorimpl, m1989constructorimpl, (p) x0.q(pVar, 2));
        operations.ensureAllArgumentsPushedFor(updateNode);
    }
}
