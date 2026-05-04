package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.OffsetApplier;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeOwner;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Utils_jvmKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ix.l1;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.o;
import w00.h;
import x00.a;
import x00.l;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public abstract class Operation {
    public static final int $stable = 0;
    private final int ints;
    private final int objects;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy\n*L\n1#1,1057:1\n112#1:1058\n112#1:1059\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy\n*L\n116#1:1058\n125#1:1059\n*E\n"})
    public static final class AdvanceSlotsBy extends Operation {
        public static final int $stable = 0;

        @k
        public static final AdvanceSlotsBy INSTANCE = new AdvanceSlotsBy();

        private AdvanceSlotsBy() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
            slotWriter.advanceBy(operationArgContainer.getInt(0));
        }

        public final int getDistance() {
            return 0;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @k
        public String intParamName(int i11) {
            return i11 == 0 ? "distance" : super.intParamName(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AppendValue\n*L\n1#1,1057:1\n232#1:1058\n235#1:1059\n232#1:1060\n235#1:1061\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AppendValue\n*L\n239#1:1058\n240#1:1059\n249#1:1060\n250#1:1061\n*E\n"})
    public static final class AppendValue extends Operation {
        public static final int $stable = 0;

        @k
        public static final AppendValue INSTANCE = new AppendValue();

        private AppendValue() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
            Anchor anchor = (Anchor) operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(0));
            Object mo2009getObject31yXWZQ = operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(1));
            if (mo2009getObject31yXWZQ instanceof RememberObserverHolder) {
                rememberManager.remembering((RememberObserverHolder) mo2009getObject31yXWZQ);
            }
            slotWriter.appendSlot(anchor, mo2009getObject31yXWZQ);
        }

        /* renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m1964getAnchorHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(0);
        }

        /* renamed from: getValue-HpuvwBQ, reason: not valid java name */
        public final int m1965getValueHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @k
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1963objectParamName31yXWZQ(int i11) {
            return ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(0)) ? l1.a.f62925c : ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(1)) ? "value" : super.mo1963objectParamName31yXWZQ(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ApplyChangeList\n*L\n1#1,1057:1\n944#1:1058\n947#1:1059\n947#1:1060\n944#1:1061\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ApplyChangeList\n*L\n951#1:1058\n952#1:1059\n961#1:1060\n963#1:1061\n*E\n"})
    public static final class ApplyChangeList extends Operation {
        public static final int $stable = 0;

        @k
        public static final ApplyChangeList INSTANCE = new ApplyChangeList();

        private ApplyChangeList() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
            IntRef intRef = (IntRef) operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(1));
            int element = intRef != null ? intRef.getElement() : 0;
            ChangeList changeList = (ChangeList) operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(0));
            if (element > 0) {
                applier = new OffsetApplier(applier, element);
            }
            changeList.executeAndFlushAllPendingChanges(applier, slotWriter, rememberManager);
        }

        /* renamed from: getChanges-HpuvwBQ, reason: not valid java name */
        public final int m1966getChangesHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(0);
        }

        /* renamed from: getEffectiveNodeIndex-HpuvwBQ, reason: not valid java name */
        public final int m1967getEffectiveNodeIndexHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @k
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1963objectParamName31yXWZQ(int i11) {
            return ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(0)) ? "changes" : ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(1)) ? "effectiveNodeIndex" : super.mo1963objectParamName31yXWZQ(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1057:1\n807#1:1058\n810#1:1059\n807#1:1060\n810#1:1061\n63#2,6:1062\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation\n*L\n814#1:1058\n815#1:1059\n824#1:1060\n825#1:1061\n827#1:1062,6\n*E\n"})
    public static final class CopyNodesToNewAnchorLocation extends Operation {
        public static final int $stable = 0;

        @k
        public static final CopyNodesToNewAnchorLocation INSTANCE = new CopyNodesToNewAnchorLocation();

        private CopyNodesToNewAnchorLocation() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
            int element = ((IntRef) operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(0))).getElement();
            List list = (List) operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(1));
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj = list.get(i11);
                g0.n(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                int i12 = element + i11;
                applier.insertBottomUp(i12, obj);
                applier.insertTopDown(i12, obj);
            }
        }

        /* renamed from: getEffectiveNodeIndex-HpuvwBQ, reason: not valid java name */
        public final int m1968getEffectiveNodeIndexHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(0);
        }

        /* renamed from: getNodes-HpuvwBQ, reason: not valid java name */
        public final int m1969getNodesHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @k
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1963objectParamName31yXWZQ(int i11) {
            return ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(0)) ? "effectiveNodeIndex" : ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(1)) ? "nodes" : super.mo1963objectParamName31yXWZQ(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation\n*L\n1#1,1057:1\n838#1:1058\n841#1:1059\n844#1:1060\n847#1:1061\n844#1:1062\n847#1:1063\n841#1:1064\n838#1:1065\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation\n*L\n851#1:1058\n852#1:1059\n853#1:1060\n854#1:1061\n863#1:1062\n864#1:1063\n865#1:1064\n868#1:1065\n*E\n"})
    public static final class CopySlotTableToAnchorLocation extends Operation {
        public static final int $stable = 0;

        @k
        public static final CopySlotTableToAnchorLocation INSTANCE = new CopySlotTableToAnchorLocation();

        private CopySlotTableToAnchorLocation() {
            super(0, 4, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
            MovableContentStateReference movableContentStateReference = (MovableContentStateReference) operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(2));
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(3));
            CompositionContext compositionContext = (CompositionContext) operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(1));
            MovableContentState movableContentState = (MovableContentState) operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(0));
            if (movableContentState == null && (movableContentState = compositionContext.movableContentStateResolve$runtime_release(movableContentStateReference)) == null) {
                ComposerKt.composeRuntimeError("Could not resolve state for movable content");
                throw new KotlinNothingValueException();
            }
            List<Anchor> moveIntoGroupFrom = slotWriter.moveIntoGroupFrom(1, movableContentState.getSlotTable$runtime_release(), 2);
            RecomposeScopeImpl.Companion companion = RecomposeScopeImpl.Companion;
            ControlledComposition composition$runtime_release = movableContentStateReference2.getComposition$runtime_release();
            g0.n(composition$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeOwner");
            companion.adoptAnchoredScopes$runtime_release(slotWriter, moveIntoGroupFrom, (RecomposeScopeOwner) composition$runtime_release);
        }

        /* renamed from: getFrom-HpuvwBQ, reason: not valid java name */
        public final int m1970getFromHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(2);
        }

        /* renamed from: getParentCompositionContext-HpuvwBQ, reason: not valid java name */
        public final int m1971getParentCompositionContextHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(1);
        }

        /* renamed from: getResolvedState-HpuvwBQ, reason: not valid java name */
        public final int m1972getResolvedStateHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(0);
        }

        /* renamed from: getTo-HpuvwBQ, reason: not valid java name */
        public final int m1973getToHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(3);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @k
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1963objectParamName31yXWZQ(int i11) {
            return ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(0)) ? "resolvedState" : ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(1)) ? "resolvedCompositionContext" : ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(2)) ? "from" : ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(3)) ? "to" : super.mo1963objectParamName31yXWZQ(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class DeactivateCurrentGroup extends Operation {
        public static final int $stable = 0;

        @k
        public static final DeactivateCurrentGroup INSTANCE = new DeactivateCurrentGroup();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private DeactivateCurrentGroup() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.DeactivateCurrentGroup.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
            ComposerKt.deactivateCurrentGroup(slotWriter, rememberManager);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex\n*L\n1#1,1057:1\n775#1:1058\n778#1:1059\n775#1:1060\n778#1:1061\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex\n*L\n782#1:1058\n783#1:1059\n792#1:1060\n797#1:1061\n*E\n"})
    public static final class DetermineMovableContentNodeIndex extends Operation {
        public static final int $stable = 0;

        @k
        public static final DetermineMovableContentNodeIndex INSTANCE = new DetermineMovableContentNodeIndex();

        private DetermineMovableContentNodeIndex() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
            int positionToInsert;
            IntRef intRef = (IntRef) operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(0));
            Anchor anchor = (Anchor) operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(1));
            g0.n(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            positionToInsert = OperationKt.positionToInsert(slotWriter, anchor, applier);
            intRef.setElement(positionToInsert);
        }

        /* renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m1974getAnchorHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(1);
        }

        /* renamed from: getEffectiveNodeIndexOut-HpuvwBQ, reason: not valid java name */
        public final int m1975getEffectiveNodeIndexOutHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @k
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1963objectParamName31yXWZQ(int i11) {
            return ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(0)) ? "effectiveNodeIndexOut" : ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(1)) ? l1.a.f62925c : super.mo1963objectParamName31yXWZQ(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Downs\n*L\n1#1,1057:1\n89#1:1058\n89#1:1059\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Downs\n*L\n93#1:1058\n103#1:1059\n*E\n"})
    public static final class Downs extends Operation {
        public static final int $stable = 0;

        @k
        public static final Downs INSTANCE = new Downs();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private Downs() {
            /*
                r3 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r3.<init>(r2, r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.Downs.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
            g0.n(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            for (Object obj : (Object[]) operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(0))) {
                applier.down(obj);
            }
        }

        /* renamed from: getNodes-HpuvwBQ, reason: not valid java name */
        public final int m1976getNodesHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @k
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1963objectParamName31yXWZQ(int i11) {
            return ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(0)) ? "nodes" : super.mo1963objectParamName31yXWZQ(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndCompositionScope\n*L\n1#1,1057:1\n496#1:1058\n499#1:1059\n496#1:1060\n499#1:1061\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndCompositionScope\n*L\n503#1:1058\n504#1:1059\n513#1:1060\n514#1:1061\n*E\n"})
    public static final class EndCompositionScope extends Operation {
        public static final int $stable = 0;

        @k
        public static final EndCompositionScope INSTANCE = new EndCompositionScope();

        private EndCompositionScope() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
            ((l) operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(0))).invoke((Composition) operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(1)));
        }

        /* renamed from: getAction-HpuvwBQ, reason: not valid java name */
        public final int m1977getActionHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(0);
        }

        /* renamed from: getComposition-HpuvwBQ, reason: not valid java name */
        public final int m1978getCompositionHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @k
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1963objectParamName31yXWZQ(int i11) {
            return ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(0)) ? l1.a.f62925c : ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(1)) ? "composition" : super.mo1963objectParamName31yXWZQ(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class EndCurrentGroup extends Operation {
        public static final int $stable = 0;

        @k
        public static final EndCurrentGroup INSTANCE = new EndCurrentGroup();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private EndCurrentGroup() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.EndCurrentGroup.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
            slotWriter.endGroup();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class EndMovableContentPlacement extends Operation {
        public static final int $stable = 0;

        @k
        public static final EndMovableContentPlacement INSTANCE = new EndMovableContentPlacement();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private EndMovableContentPlacement() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.EndMovableContentPlacement.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
            g0.n(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            OperationKt.positionToParentOf(slotWriter, applier, 0);
            slotWriter.endGroup();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndResumingScope\n*L\n1#1,1057:1\n212#1:1058\n212#1:1059\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndResumingScope\n*L\n216#1:1058\n225#1:1059\n*E\n"})
    public static final class EndResumingScope extends Operation {
        public static final int $stable = 0;

        @k
        public static final EndResumingScope INSTANCE = new EndResumingScope();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private EndResumingScope() {
            /*
                r3 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r3.<init>(r2, r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.EndResumingScope.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
            rememberManager.endResumingScope((RecomposeScopeImpl) operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(0)));
        }

        /* renamed from: getScope-HpuvwBQ, reason: not valid java name */
        public final int m1979getScopeHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @k
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1963objectParamName31yXWZQ(int i11) {
            return ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(0)) ? "scope" : super.mo1963objectParamName31yXWZQ(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EnsureGroupStarted\n*L\n1#1,1057:1\n428#1:1058\n428#1:1059\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EnsureGroupStarted\n*L\n432#1:1058\n441#1:1059\n*E\n"})
    public static final class EnsureGroupStarted extends Operation {
        public static final int $stable = 0;

        @k
        public static final EnsureGroupStarted INSTANCE = new EnsureGroupStarted();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private EnsureGroupStarted() {
            /*
                r3 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r3.<init>(r2, r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.EnsureGroupStarted.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
            slotWriter.ensureStarted((Anchor) operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(0)));
        }

        /* renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m1980getAnchorHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @k
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1963objectParamName31yXWZQ(int i11) {
            return ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(0)) ? l1.a.f62925c : super.mo1963objectParamName31yXWZQ(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class EnsureRootGroupStarted extends Operation {
        public static final int $stable = 0;

        @k
        public static final EnsureRootGroupStarted INSTANCE = new EnsureRootGroupStarted();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private EnsureRootGroupStarted() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.EnsureRootGroupStarted.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
            slotWriter.ensureStarted(0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertNodeFixup\n*L\n1#1,1057:1\n682#1:1058\n679#1:1059\n685#1:1060\n679#1:1061\n685#1:1062\n682#1:1063\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertNodeFixup\n*L\n689#1:1058\n695#1:1059\n696#1:1060\n705#1:1061\n706#1:1062\n707#1:1063\n*E\n"})
    public static final class InsertNodeFixup extends Operation {
        public static final int $stable = 0;

        @k
        public static final InsertNodeFixup INSTANCE = new InsertNodeFixup();

        private InsertNodeFixup() {
            super(1, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
            Object invoke = ((a) operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(0))).invoke();
            Anchor anchor = (Anchor) operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(1));
            int i11 = operationArgContainer.getInt(0);
            g0.n(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            slotWriter.updateNode(anchor, invoke);
            applier.insertTopDown(i11, invoke);
            applier.down(invoke);
        }

        /* renamed from: getFactory-HpuvwBQ, reason: not valid java name */
        public final int m1981getFactoryHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(0);
        }

        /* renamed from: getGroupAnchor-HpuvwBQ, reason: not valid java name */
        public final int m1982getGroupAnchorHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(1);
        }

        public final int getInsertIndex() {
            return 0;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @k
        public String intParamName(int i11) {
            return i11 == 0 ? "insertIndex" : super.intParamName(i11);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @k
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1963objectParamName31yXWZQ(int i11) {
            return ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(0)) ? "factory" : ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(1)) ? "groupAnchor" : super.mo1963objectParamName31yXWZQ(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlots\n*L\n1#1,1057:1\n607#1:1058\n610#1:1059\n610#1:1060\n607#1:1061\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlots\n*L\n614#1:1058\n615#1:1059\n624#1:1060\n625#1:1061\n*E\n"})
    public static final class InsertSlots extends Operation {
        public static final int $stable = 0;

        @k
        public static final InsertSlots INSTANCE = new InsertSlots();

        private InsertSlots() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
            SlotTable slotTable = (SlotTable) operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(1));
            Anchor anchor = (Anchor) operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(0));
            slotWriter.beginInsert();
            slotWriter.moveFrom(slotTable, anchor.toIndexFor(slotTable), false);
            slotWriter.endInsert();
        }

        /* renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m1983getAnchorHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(0);
        }

        /* renamed from: getFromSlotTable-HpuvwBQ, reason: not valid java name */
        public final int m1984getFromSlotTableHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @k
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1963objectParamName31yXWZQ(int i11) {
            return ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(0)) ? l1.a.f62925c : ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(1)) ? "from" : super.mo1963objectParamName31yXWZQ(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1057:1\n639#1:1058\n642#1:1059\n645#1:1060\n642#1:1061\n639#1:1062\n645#1:1063\n174#2,4:1064\n179#2,3:1069\n1#3:1068\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups\n*L\n649#1:1058\n650#1:1059\n651#1:1060\n660#1:1061\n661#1:1062\n662#1:1063\n664#1:1064,4\n664#1:1069,3\n664#1:1068\n*E\n"})
    public static final class InsertSlotsWithFixups extends Operation {
        public static final int $stable = 0;

        @k
        public static final InsertSlotsWithFixups INSTANCE = new InsertSlotsWithFixups();

        private InsertSlotsWithFixups() {
            super(0, 3, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
            SlotTable slotTable = (SlotTable) operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(1));
            Anchor anchor = (Anchor) operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(0));
            FixupList fixupList = (FixupList) operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(2));
            SlotWriter openWriter = slotTable.openWriter();
            try {
                fixupList.executeAndFlushAllPendingFixups(applier, openWriter, rememberManager);
                g2 g2Var = g2.f100423a;
                openWriter.close(true);
                slotWriter.beginInsert();
                slotWriter.moveFrom(slotTable, anchor.toIndexFor(slotTable), false);
                slotWriter.endInsert();
            } catch (Throwable th2) {
                openWriter.close(false);
                throw th2;
            }
        }

        /* renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m1985getAnchorHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(0);
        }

        /* renamed from: getFixups-HpuvwBQ, reason: not valid java name */
        public final int m1986getFixupsHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(2);
        }

        /* renamed from: getFromSlotTable-HpuvwBQ, reason: not valid java name */
        public final int m1987getFromSlotTableHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @k
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1963objectParamName31yXWZQ(int i11) {
            return ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(0)) ? l1.a.f62925c : ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(1)) ? "from" : ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(2)) ? "fixups" : super.mo1963objectParamName31yXWZQ(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveCurrentGroup\n*L\n1#1,1057:1\n457#1:1058\n457#1:1059\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveCurrentGroup\n*L\n461#1:1058\n470#1:1059\n*E\n"})
    public static final class MoveCurrentGroup extends Operation {
        public static final int $stable = 0;

        @k
        public static final MoveCurrentGroup INSTANCE = new MoveCurrentGroup();

        private MoveCurrentGroup() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
            slotWriter.moveGroup(operationArgContainer.getInt(0));
        }

        public final int getOffset() {
            return 0;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @k
        public String intParamName(int i11) {
            return i11 == 0 ? "offset" : super.intParamName(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveNode\n*L\n1#1,1057:1\n580#1:1058\n583#1:1059\n586#1:1060\n580#1,7:1061\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveNode\n*L\n590#1:1058\n591#1:1059\n592#1:1060\n601#1:1061,7\n*E\n"})
    public static final class MoveNode extends Operation {
        public static final int $stable = 0;

        @k
        public static final MoveNode INSTANCE = new MoveNode();

        private MoveNode() {
            super(3, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
            applier.move(operationArgContainer.getInt(0), operationArgContainer.getInt(1), operationArgContainer.getInt(2));
        }

        public final int getCount() {
            return 2;
        }

        public final int getFrom() {
            return 0;
        }

        public final int getTo() {
            return 1;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @k
        public String intParamName(int i11) {
            return i11 == 0 ? "from" : i11 == 1 ? "to" : i11 == 2 ? "count" : super.intParamName(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup\n*L\n1#1,1057:1\n718#1:1058\n721#1:1059\n721#1:1060\n718#1:1061\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup\n*L\n725#1:1058\n731#1:1059\n740#1:1060\n741#1:1061\n*E\n"})
    public static final class PostInsertNodeFixup extends Operation {
        public static final int $stable = 0;

        @k
        public static final PostInsertNodeFixup INSTANCE = new PostInsertNodeFixup();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private PostInsertNodeFixup() {
            /*
                r2 = this;
                r0 = 1
                r1 = 0
                r2.<init>(r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.PostInsertNodeFixup.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
            Anchor anchor = (Anchor) operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(0));
            int i11 = operationArgContainer.getInt(0);
            applier.up();
            g0.n(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            applier.insertBottomUp(i11, slotWriter.node(anchor));
        }

        /* renamed from: getGroupAnchor-HpuvwBQ, reason: not valid java name */
        public final int m1995getGroupAnchorHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(0);
        }

        public final int getInsertIndex() {
            return 0;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @k
        public String intParamName(int i11) {
            return i11 == 0 ? "insertIndex" : super.intParamName(i11);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @k
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1963objectParamName31yXWZQ(int i11) {
            return ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(0)) ? "groupAnchor" : super.mo1963objectParamName31yXWZQ(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent\n*L\n1#1,1057:1\n907#1:1058\n910#1:1059\n913#1:1060\n907#1:1061\n913#1:1062\n910#1:1063\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent\n*L\n917#1:1058\n918#1:1059\n919#1:1060\n928#1:1061\n929#1:1062\n930#1:1063\n*E\n"})
    public static final class ReleaseMovableGroupAtCurrent extends Operation {
        public static final int $stable = 0;

        @k
        public static final ReleaseMovableGroupAtCurrent INSTANCE = new ReleaseMovableGroupAtCurrent();

        private ReleaseMovableGroupAtCurrent() {
            super(0, 3, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
            ControlledComposition controlledComposition = (ControlledComposition) operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(0));
            MovableContentStateReference movableContentStateReference = (MovableContentStateReference) operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(2));
            ((CompositionContext) operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(1))).movableContentStateReleased$runtime_release(movableContentStateReference, ComposerKt.extractMovableContentAtCurrent(controlledComposition, movableContentStateReference, slotWriter, null), applier);
        }

        /* renamed from: getComposition-HpuvwBQ, reason: not valid java name */
        public final int m1996getCompositionHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(0);
        }

        /* renamed from: getParentCompositionContext-HpuvwBQ, reason: not valid java name */
        public final int m1997getParentCompositionContextHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(1);
        }

        /* renamed from: getReference-HpuvwBQ, reason: not valid java name */
        public final int m1998getReferenceHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @k
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1963objectParamName31yXWZQ(int i11) {
            return ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(0)) ? "composition" : ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(1)) ? "parentCompositionContext" : ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(2)) ? TypedValues.Custom.S_REFERENCE : super.mo1963objectParamName31yXWZQ(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Remember\n*L\n1#1,1057:1\n153#1:1058\n153#1:1059\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Remember\n*L\n157#1:1058\n166#1:1059\n*E\n"})
    public static final class Remember extends Operation {
        public static final int $stable = 0;

        @k
        public static final Remember INSTANCE = new Remember();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private Remember() {
            /*
                r3 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r3.<init>(r2, r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.Remember.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
            rememberManager.remembering((RememberObserverHolder) operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(0)));
        }

        /* renamed from: getValue-HpuvwBQ, reason: not valid java name */
        public final int m1999getValueHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @k
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1963objectParamName31yXWZQ(int i11) {
            return ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(0)) ? "value" : super.mo1963objectParamName31yXWZQ(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RememberPausingScope\n*L\n1#1,1057:1\n172#1:1058\n172#1:1059\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RememberPausingScope\n*L\n176#1:1058\n185#1:1059\n*E\n"})
    public static final class RememberPausingScope extends Operation {
        public static final int $stable = 0;

        @k
        public static final RememberPausingScope INSTANCE = new RememberPausingScope();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private RememberPausingScope() {
            /*
                r3 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r3.<init>(r2, r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.RememberPausingScope.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
            rememberManager.rememberPausingScope((RecomposeScopeImpl) operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(0)));
        }

        /* renamed from: getScope-HpuvwBQ, reason: not valid java name */
        public final int m2000getScopeHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @k
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1963objectParamName31yXWZQ(int i11) {
            return ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(0)) ? "scope" : super.mo1963objectParamName31yXWZQ(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class RemoveCurrentGroup extends Operation {
        public static final int $stable = 0;

        @k
        public static final RemoveCurrentGroup INSTANCE = new RemoveCurrentGroup();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private RemoveCurrentGroup() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.RemoveCurrentGroup.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
            ComposerKt.removeCurrentGroup(slotWriter, rememberManager);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RemoveNode\n*L\n1#1,1057:1\n557#1:1058\n560#1:1059\n557#1,4:1060\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RemoveNode\n*L\n564#1:1058\n565#1:1059\n574#1:1060,4\n*E\n"})
    public static final class RemoveNode extends Operation {
        public static final int $stable = 0;

        @k
        public static final RemoveNode INSTANCE = new RemoveNode();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private RemoveNode() {
            /*
                r3 = this;
                r0 = 0
                r1 = 0
                r2 = 2
                r3.<init>(r2, r0, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.RemoveNode.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
            applier.remove(operationArgContainer.getInt(0), operationArgContainer.getInt(1));
        }

        public final int getCount() {
            return 1;
        }

        public final int getRemoveIndex() {
            return 0;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @k
        public String intParamName(int i11) {
            return i11 == 0 ? "removeIndex" : i11 == 1 ? "count" : super.intParamName(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class ResetSlots extends Operation {
        public static final int $stable = 0;

        @k
        public static final ResetSlots INSTANCE = new ResetSlots();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private ResetSlots() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.ResetSlots.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
            slotWriter.reset();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$SideEffect\n*L\n1#1,1057:1\n134#1:1058\n134#1:1059\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$SideEffect\n*L\n138#1:1058\n147#1:1059\n*E\n"})
    public static final class SideEffect extends Operation {
        public static final int $stable = 0;

        @k
        public static final SideEffect INSTANCE = new SideEffect();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private SideEffect() {
            /*
                r3 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r3.<init>(r2, r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.SideEffect.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
            rememberManager.sideEffect((a) operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(0)));
        }

        /* renamed from: getEffect-HpuvwBQ, reason: not valid java name */
        public final int m2001getEffectHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @k
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1963objectParamName31yXWZQ(int i11) {
            return ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(0)) ? "effect" : super.mo1963objectParamName31yXWZQ(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class SkipToEndOfCurrentGroup extends Operation {
        public static final int $stable = 0;

        @k
        public static final SkipToEndOfCurrentGroup INSTANCE = new SkipToEndOfCurrentGroup();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private SkipToEndOfCurrentGroup() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.SkipToEndOfCurrentGroup.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
            slotWriter.skipToGroupEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$StartResumingScope\n*L\n1#1,1057:1\n192#1:1058\n192#1:1059\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$StartResumingScope\n*L\n196#1:1058\n205#1:1059\n*E\n"})
    public static final class StartResumingScope extends Operation {
        public static final int $stable = 0;

        @k
        public static final StartResumingScope INSTANCE = new StartResumingScope();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private StartResumingScope() {
            /*
                r3 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r3.<init>(r2, r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.StartResumingScope.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
            rememberManager.startResumingScope((RecomposeScopeImpl) operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(0)));
        }

        /* renamed from: getScope-HpuvwBQ, reason: not valid java name */
        public final int m2002getScopeHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @k
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1963objectParamName31yXWZQ(int i11) {
            return ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(0)) ? "scope" : super.mo1963objectParamName31yXWZQ(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    @u0({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$TestOperation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1057:1\n1#2:1058\n*E\n"})
    public static final class TestOperation extends Operation {
        public static final int $stable = 8;

        @k
        private final q<Applier<?>, SlotWriter, RememberManager, g2> block;

        @k
        private final List<Integer> intParams;

        @k
        private final List<ObjectParameter<Object>> objParams;

        @o
        public TestOperation() {
            this(0, 0, null, 7, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
            this.block.invoke(applier, slotWriter, rememberManager);
        }

        @k
        public final q<Applier<?>, SlotWriter, RememberManager, g2> getBlock() {
            return this.block;
        }

        @k
        public final List<Integer> getIntParams() {
            return this.intParams;
        }

        @k
        public final List<ObjectParameter<Object>> getObjParams() {
            return this.objParams;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @k
        public String toString() {
            return "TestOperation(ints = " + getInts() + ", objects = " + getObjects() + ")@" + Utils_jvmKt.identityHashCode(this);
        }

        public /* synthetic */ TestOperation(int i11, int i12, q qVar, int i13, v vVar) {
            this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? new q<Applier<?>, SlotWriter, RememberManager, g2>() { // from class: androidx.compose.runtime.changelist.Operation.TestOperation.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                }

                @Override // x00.q
                public /* bridge */ /* synthetic */ g2 invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return g2.f100423a;
                }
            } : qVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @o
        public TestOperation(int i11, int i12, @k q<? super Applier<?>, ? super SlotWriter, ? super RememberManager, g2> qVar) {
            super(i11, i12, null);
            this.block = qVar;
            ArrayList arrayList = new ArrayList(i11);
            for (int i13 = 0; i13 < i11; i13++) {
                arrayList.add(Integer.valueOf(i13));
            }
            this.intParams = arrayList;
            ArrayList arrayList2 = new ArrayList(i12);
            for (int i14 = 0; i14 < i12; i14++) {
                arrayList2.add(ObjectParameter.m1988boximpl(ObjectParameter.m1989constructorimpl(i14)));
            }
            this.objParams = arrayList2;
        }

        public static /* synthetic */ void getIntParams$annotations() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$TrimParentValues\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1057:1\n260#1:1058\n260#1:1059\n1678#2,4:1060\n1683#2:1072\n4341#3,8:1064\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$TrimParentValues\n*L\n264#1:1058\n273#1:1059\n275#1:1060,4\n275#1:1072\n281#1:1064,8\n*E\n"})
    public static final class TrimParentValues extends Operation {
        public static final int $stable = 0;

        @k
        public static final TrimParentValues INSTANCE = new TrimParentValues();

        private TrimParentValues() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
            int i11;
            int i12;
            int i13 = operationArgContainer.getInt(0);
            int slotsSize = slotWriter.getSlotsSize();
            int parent = slotWriter.getParent();
            int slotsStartIndex$runtime_release = slotWriter.slotsStartIndex$runtime_release(parent);
            int slotsEndIndex$runtime_release = slotWriter.slotsEndIndex$runtime_release(parent);
            for (int max = Math.max(slotsStartIndex$runtime_release, slotsEndIndex$runtime_release - i13); max < slotsEndIndex$runtime_release; max++) {
                Object obj = slotWriter.slots[slotWriter.dataIndexToDataAddress(max)];
                if (obj instanceof RememberObserverHolder) {
                    int i14 = slotsSize - max;
                    RememberObserverHolder rememberObserverHolder = (RememberObserverHolder) obj;
                    Anchor after = rememberObserverHolder.getAfter();
                    if (after == null || !after.getValid()) {
                        i11 = -1;
                        i12 = -1;
                    } else {
                        i11 = slotWriter.anchorIndex(after);
                        i12 = slotWriter.getSlotsSize() - slotWriter.slotsEndAllIndex$runtime_release(i11);
                    }
                    rememberManager.forgetting(rememberObserverHolder, i14, i11, i12);
                } else if (obj instanceof RecomposeScopeImpl) {
                    ((RecomposeScopeImpl) obj).release();
                }
            }
            slotWriter.trimTailSlots(i13);
        }

        public final int getCount() {
            return 0;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @k
        public String intParamName(int i11) {
            return i11 == 0 ? "count" : super.intParamName(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1057:1\n348#1:1058\n342#1:1059\n345#1:1060\n342#1:1061\n345#1:1062\n348#1:1063\n4341#2,8:1064\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue\n*L\n352#1:1058\n358#1:1059\n359#1:1060\n368#1:1061\n369#1:1062\n370#1:1063\n380#1:1064,8\n*E\n"})
    public static final class UpdateAnchoredValue extends Operation {
        public static final int $stable = 0;

        @k
        public static final UpdateAnchoredValue INSTANCE = new UpdateAnchoredValue();

        private UpdateAnchoredValue() {
            super(1, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
            int i11;
            int i12;
            Object mo2009getObject31yXWZQ = operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(0));
            Anchor anchor = (Anchor) operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(1));
            int i13 = operationArgContainer.getInt(0);
            if (mo2009getObject31yXWZQ instanceof RememberObserverHolder) {
                rememberManager.remembering((RememberObserverHolder) mo2009getObject31yXWZQ);
            }
            int anchorIndex = slotWriter.anchorIndex(anchor);
            Object obj = slotWriter.set(anchorIndex, i13, mo2009getObject31yXWZQ);
            if (!(obj instanceof RememberObserverHolder)) {
                if (obj instanceof RecomposeScopeImpl) {
                    ((RecomposeScopeImpl) obj).release();
                    return;
                }
                return;
            }
            int slotsSize = slotWriter.getSlotsSize() - slotWriter.slotIndexOfGroupSlotIndex(anchorIndex, i13);
            RememberObserverHolder rememberObserverHolder = (RememberObserverHolder) obj;
            Anchor after = rememberObserverHolder.getAfter();
            if (after == null || !after.getValid()) {
                i11 = -1;
                i12 = -1;
            } else {
                i11 = slotWriter.anchorIndex(after);
                i12 = slotWriter.getSlotsSize() - slotWriter.slotsEndAllIndex$runtime_release(i11);
            }
            rememberManager.forgetting(rememberObserverHolder, slotsSize, i11, i12);
        }

        /* renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m2003getAnchorHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(1);
        }

        public final int getGroupSlotIndex() {
            return 0;
        }

        /* renamed from: getValue-HpuvwBQ, reason: not valid java name */
        public final int m2004getValueHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @k
        public String intParamName(int i11) {
            return i11 == 0 ? "groupSlotIndex" : super.intParamName(i11);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @k
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1963objectParamName31yXWZQ(int i11) {
            return ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(0)) ? "value" : ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(1)) ? l1.a.f62925c : super.mo1963objectParamName31yXWZQ(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAuxData\n*L\n1#1,1057:1\n399#1:1058\n399#1:1059\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAuxData\n*L\n403#1:1058\n412#1:1059\n*E\n"})
    public static final class UpdateAuxData extends Operation {
        public static final int $stable = 0;

        @k
        public static final UpdateAuxData INSTANCE = new UpdateAuxData();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private UpdateAuxData() {
            /*
                r3 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r3.<init>(r2, r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.UpdateAuxData.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
            slotWriter.updateAux(operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(0)));
        }

        /* renamed from: getData-HpuvwBQ, reason: not valid java name */
        public final int m2005getDataHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @k
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1963objectParamName31yXWZQ(int i11) {
            return ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(0)) ? "data" : super.mo1963objectParamName31yXWZQ(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n*L\n1#1,1057:1\n532#1:1058\n535#1:1059\n532#1:1060\n535#1:1061\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n*L\n539#1:1058\n540#1:1059\n549#1:1060\n550#1:1061\n*E\n"})
    public static final class UpdateNode extends Operation {
        public static final int $stable = 0;

        @k
        public static final UpdateNode INSTANCE = new UpdateNode();

        private UpdateNode() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
            applier.apply((p) operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(1)), operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(0)));
        }

        /* renamed from: getBlock-HpuvwBQ, reason: not valid java name */
        public final int m2006getBlockHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(1);
        }

        /* renamed from: getValue-HpuvwBQ, reason: not valid java name */
        public final int m2007getValueHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @k
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1963objectParamName31yXWZQ(int i11) {
            return ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(0)) ? "value" : ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(1)) ? "block" : super.mo1963objectParamName31yXWZQ(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateValue\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n*L\n1#1,1057:1\n302#1:1058\n299#1:1059\n299#1:1060\n302#1:1061\n1611#2:1062\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateValue\n*L\n306#1:1058\n312#1:1059\n321#1:1060\n322#1:1061\n326#1:1062\n*E\n"})
    public static final class UpdateValue extends Operation {
        public static final int $stable = 0;

        @k
        public static final UpdateValue INSTANCE = new UpdateValue();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private UpdateValue() {
            /*
                r2 = this;
                r0 = 1
                r1 = 0
                r2.<init>(r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.UpdateValue.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
            Object mo2009getObject31yXWZQ = operationArgContainer.mo2009getObject31yXWZQ(ObjectParameter.m1989constructorimpl(0));
            int i11 = operationArgContainer.getInt(0);
            if (mo2009getObject31yXWZQ instanceof RememberObserverHolder) {
                rememberManager.remembering((RememberObserverHolder) mo2009getObject31yXWZQ);
            }
            Object obj = slotWriter.set(slotWriter.getCurrentGroup(), i11, mo2009getObject31yXWZQ);
            if (obj instanceof RememberObserverHolder) {
                rememberManager.forgetting((RememberObserverHolder) obj, slotWriter.getSlotsSize() - slotWriter.slotIndexOfGroupSlotIndex(slotWriter.getCurrentGroup(), i11), -1, -1);
            } else if (obj instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) obj).release();
            }
        }

        public final int getGroupSlotIndex() {
            return 0;
        }

        /* renamed from: getValue-HpuvwBQ, reason: not valid java name */
        public final int m2008getValueHpuvwBQ() {
            return ObjectParameter.m1989constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @k
        public String intParamName(int i11) {
            return i11 == 0 ? "groupSlotIndex" : super.intParamName(i11);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @k
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1963objectParamName31yXWZQ(int i11) {
            return ObjectParameter.m1991equalsimpl0(i11, ObjectParameter.m1989constructorimpl(0)) ? "value" : super.mo1963objectParamName31yXWZQ(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Ups\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1057:1\n70#1:1058\n70#1:1059\n1#2:1060\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Ups\n*L\n74#1:1058\n83#1:1059\n*E\n"})
    public static final class Ups extends Operation {
        public static final int $stable = 0;

        @k
        public static final Ups INSTANCE = new Ups();

        private Ups() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
            int i11 = operationArgContainer.getInt(0);
            for (int i12 = 0; i12 < i11; i12++) {
                applier.up();
            }
        }

        public final int getCount() {
            return 0;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @k
        public String intParamName(int i11) {
            return i11 == 0 ? "count" : super.intParamName(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class UseCurrentNode extends Operation {
        public static final int $stable = 0;

        @k
        public static final UseCurrentNode INSTANCE = new UseCurrentNode();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private UseCurrentNode() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.UseCurrentNode.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
            applier.reuse();
        }
    }

    public /* synthetic */ Operation(int i11, int i12, v vVar) {
        this(i11, i12);
    }

    public abstract void execute(@k OperationArgContainer operationArgContainer, @k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager);

    public final int getInts() {
        return this.ints;
    }

    @k
    public final String getName() {
        String C = o0.d(getClass()).C();
        return C == null ? "" : C;
    }

    public final int getObjects() {
        return this.objects;
    }

    @k
    public String intParamName(int i11) {
        return "IntParameter(" + i11 + ')';
    }

    @k
    /* renamed from: objectParamName-31yXWZQ, reason: not valid java name */
    public String mo1963objectParamName31yXWZQ(int i11) {
        return "ObjectParameter(" + i11 + ')';
    }

    @k
    public String toString() {
        return getName();
    }

    private Operation(int i11, int i12) {
        this.ints = i11;
        this.objects = i12;
    }

    public /* synthetic */ Operation(int i11, int i12, int i13, v vVar) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12, null);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @h
    public static final class ObjectParameter<T> {
        private final int offset;

        private /* synthetic */ ObjectParameter(int i11) {
            this.offset = i11;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ ObjectParameter m1988boximpl(int i11) {
            return new ObjectParameter(i11);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m1990equalsimpl(int i11, Object obj) {
            return (obj instanceof ObjectParameter) && i11 == ((ObjectParameter) obj).m1994unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m1991equalsimpl0(int i11, int i12) {
            return i11 == i12;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m1992hashCodeimpl(int i11) {
            return Integer.hashCode(i11);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m1993toStringimpl(int i11) {
            return "ObjectParameter(offset=" + i11 + ')';
        }

        public boolean equals(Object obj) {
            return m1990equalsimpl(this.offset, obj);
        }

        public final int getOffset() {
            return this.offset;
        }

        public int hashCode() {
            return m1992hashCodeimpl(this.offset);
        }

        public String toString() {
            return m1993toStringimpl(this.offset);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m1994unboximpl() {
            return this.offset;
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static <T> int m1989constructorimpl(int i11) {
            return i11;
        }
    }
}
