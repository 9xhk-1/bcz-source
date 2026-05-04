package androidx.compose.runtime;

import a00.h0;
import a00.l0;
import a00.q;
import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.changelist.ComposerChangeListWriter;
import androidx.compose.runtime.changelist.FixupList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.internal.Utils_jvmKt;
import androidx.compose.runtime.snapshots.ListUtilsKt;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.d;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import m80.k;
import m80.l;
import m80.o;
import x00.p;
import yz.g2;
import yz.h1;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 4 BitwiseOperators.kt\nandroidx/compose/runtime/BitwiseOperatorsKt\n+ 5 Trace.kt\nandroidx/compose/runtime/internal/TraceKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 8 CompositionLocalMap.kt\nandroidx/compose/runtime/CompositionLocalMapKt\n+ 9 Composer.kt\nandroidx/compose/runtime/GroupKind\n+ 10 IntIntMap.kt\nandroidx/collection/IntIntMap\n+ 11 ComposerChangeListWriter.kt\nandroidx/compose/runtime/changelist/ComposerChangeListWriter\n+ 12 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 13 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 14 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 15 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 16 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 17 Stack.kt\nandroidx/compose/runtime/IntStack\n+ 18 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4891:1\n4134#1,10:4900\n4144#1:4911\n4137#1,8:4912\n4134#1,10:4947\n4144#1:4958\n4137#1,8:4959\n4152#1,10:4969\n4162#1:4980\n4155#1,8:4981\n4152#1,10:4989\n4162#1:5000\n4155#1,8:5001\n4134#1,10:5013\n4144#1:5024\n4137#1,8:5025\n4152#1,10:5033\n4162#1:5044\n4155#1,8:5045\n3537#1,8:5081\n3546#1,3:5104\n4143#1:5207\n4144#1:5209\n4143#1:5210\n4144#1:5212\n4143#1:5213\n4144#1:5215\n4143#1:5216\n4144#1:5218\n4161#1:5220\n4162#1:5222\n4161#1:5223\n4162#1:5225\n4161#1:5226\n4162#1:5228\n4161#1:5229\n4162#1:5231\n1#2:4892\n158#3,7:4893\n158#3,7:5071\n158#3,3:5078\n162#3,3:5107\n158#3,3:5188\n162#3,3:5199\n27#4:4910\n27#4:4957\n23#4:4979\n23#4:4999\n27#4:5010\n27#4:5011\n27#4:5012\n27#4:5023\n23#4:5043\n27#4:5208\n27#4:5211\n27#4:5214\n27#4:5217\n27#4:5219\n23#4:5221\n23#4:5224\n23#4:5227\n23#4:5230\n23#4:5232\n45#5,5:4920\n45#5,3:5165\n49#5:5177\n4643#6,5:4925\n4643#6,5:4930\n4665#6:4941\n4643#6,5:4942\n4643#6,5:5053\n4643#6,5:5058\n4643#6,5:5120\n4643#6,5:5125\n4643#6,5:5130\n4643#6,5:5160\n4643#6,5:5178\n4643#6,5:5183\n4643#6,5:5202\n33#7,5:4935\n80#8:4940\n4574#9:4967\n4577#9:4968\n430#10:5009\n173#11,4:5063\n173#11,4:5089\n183#11,8:5093\n178#11,3:5101\n178#11,3:5111\n173#11,8:5191\n33#12,4:5067\n38#12:5110\n33#12,6:5114\n81#12,3:5236\n33#12,6:5239\n84#12:5245\n357#13,4:5135\n329#13,6:5139\n339#13,3:5146\n342#13,9:5150\n361#13:5159\n1399#14:5145\n1270#14:5149\n393#15,6:5168\n399#15,2:5175\n44#16:5174\n53#17:5233\n53#17:5234\n53#17:5235\n1855#18,2:5246\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n*L\n1508#1:4900,10\n1508#1:4911\n1508#1:4912,8\n2473#1:4947,10\n2473#1:4958\n2473#1:4959,8\n2616#1:4969,10\n2616#1:4980\n2616#1:4981,8\n2624#1:4989,10\n2624#1:5000\n2624#1:5001,8\n3156#1:5013,10\n3156#1:5024\n3156#1:5025,8\n3160#1:5033,10\n3160#1:5044\n3160#1:5045,8\n3500#1:5081,8\n3500#1:5104,3\n4136#1:5207\n4136#1:5209\n4137#1:5210\n4137#1:5212\n4138#1:5213\n4138#1:5215\n4139#1:5216\n4139#1:5218\n4154#1:5220\n4154#1:5222\n4155#1:5223\n4155#1:5225\n4156#1:5226\n4156#1:5228\n4157#1:5229\n4157#1:5231\n1446#1:4893,7\n3443#1:5071,7\n3499#1:5078,3\n3499#1:5107,3\n3926#1:5188,3\n3926#1:5199,3\n1508#1:4910\n2473#1:4957\n2616#1:4979\n2624#1:4999\n3081#1:5010\n3087#1:5011\n3092#1:5012\n3156#1:5023\n3160#1:5043\n4136#1:5208\n4137#1:5211\n4138#1:5214\n4139#1:5217\n4143#1:5219\n4154#1:5221\n4155#1:5224\n4156#1:5227\n4157#1:5230\n4161#1:5232\n1755#1:4920,5\n3673#1:5165,3\n3673#1:5177\n1826#1:4925,5\n1837#1:4930,5\n2445#1:4941\n2445#1:4942,5\n3204#1:5053,5\n3223#1:5058,5\n3613#1:5120,5\n3623#1:5125,5\n3640#1:5130,5\n3672#1:5160,5\n3729#1:5178,5\n3736#1:5183,5\n3938#1:5202,5\n1882#1:4935,5\n2266#1:4940\n2479#1:4967\n2504#1:4968\n2985#1:5009\n3420#1:5063,4\n3505#1:5089,4\n3506#1:5093,8\n3505#1:5101,3\n3420#1:5111,3\n3928#1:5191,8\n3422#1:5067,4\n3422#1:5110\n3564#1:5114,6\n3777#1:5236,3\n3777#1:5239,6\n3777#1:5245\n3658#1:5135,4\n3658#1:5139,6\n3658#1:5146,3\n3658#1:5150,9\n3658#1:5159\n3658#1:5145\n3658#1:5149\n3691#1:5168,6\n3691#1:5175,2\n3691#1:5174\n4166#1:5233\n4168#1:5234\n4170#1:5235\n3857#1:5246,2\n*E\n"})
/* loaded from: classes.dex */
public final class ComposerImpl implements Composer {
    public static final int $stable = 8;

    @l
    private CompositionData _compositionData;

    @k
    private final Set<RememberObserver> abandonSet;

    @k
    private final Applier<?> applier;

    @k
    private final ComposerChangeListWriter changeListWriter;

    @k
    private ChangeList changes;
    private int childrenComposing;

    @k
    private final ControlledComposition composition;
    private int compositionToken;
    private int compoundKeyHash;

    @l
    private ChangeList deferredChanges;

    @k
    private final ComposerImpl$derivedStateObserver$1 derivedStateObserver;
    private boolean forceRecomposeScopes;
    private boolean forciblyRecompose;
    private int groupNodeCount;

    @k
    private Anchor insertAnchor;

    @k
    private FixupList insertFixups;

    @k
    private SlotTable insertTable;
    private boolean inserting;

    @k
    private final ArrayList<Object> invalidateStack;
    private boolean isComposing;
    private boolean isDisposed;

    @k
    private ChangeList lateChanges;

    @l
    private int[] nodeCountOverrides;

    @l
    private MutableIntIntMap nodeCountVirtualOverrides;
    private boolean nodeExpected;
    private int nodeIndex;

    @k
    private final CompositionContext parentContext;
    private boolean pausable;

    @l
    private Pending pending;

    @l
    private PersistentCompositionLocalMap providerCache;

    @l
    private MutableIntObjectMap<PersistentCompositionLocalMap> providerUpdates;
    private boolean providersInvalid;
    private int rGroupIndex;

    @k
    private SlotReader reader;
    private boolean reusing;

    @l
    private ShouldPauseCallback shouldPauseCallback;

    @k
    private final SlotTable slotTable;
    private boolean sourceMarkersEnabled;

    @k
    private SlotWriter writer;
    private boolean writerHasAProvider;

    @k
    private final ArrayList<Object> pendingStack = Stack.m1936constructorimpl$default(null, 1, null);

    @k
    private final IntStack parentStateStack = new IntStack();

    @k
    private final List<Invalidation> invalidations = new ArrayList();

    @k
    private final IntStack entersStack = new IntStack();

    @k
    private PersistentCompositionLocalMap parentProvider = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();

    @k
    private final IntStack providersInvalidStack = new IntStack();
    private int reusingGroup = -1;

    /* JADX WARN: Type inference failed for: r5v11, types: [androidx.compose.runtime.ComposerImpl$derivedStateObserver$1] */
    public ComposerImpl(@k Applier<?> applier, @k CompositionContext compositionContext, @k SlotTable slotTable, @k Set<RememberObserver> set, @k ChangeList changeList, @k ChangeList changeList2, @k ControlledComposition controlledComposition) {
        this.applier = applier;
        this.parentContext = compositionContext;
        this.slotTable = slotTable;
        this.abandonSet = set;
        this.changes = changeList;
        this.lateChanges = changeList2;
        this.composition = controlledComposition;
        this.sourceMarkersEnabled = compositionContext.getCollectingSourceInformation$runtime_release() || compositionContext.getCollectingCallByInformation$runtime_release();
        this.derivedStateObserver = new DerivedStateObserver() { // from class: androidx.compose.runtime.ComposerImpl$derivedStateObserver$1
            @Override // androidx.compose.runtime.DerivedStateObserver
            public void done(DerivedState<?> derivedState) {
                ComposerImpl composerImpl = ComposerImpl.this;
                composerImpl.childrenComposing--;
            }

            @Override // androidx.compose.runtime.DerivedStateObserver
            public void start(DerivedState<?> derivedState) {
                ComposerImpl.this.childrenComposing++;
            }
        };
        this.invalidateStack = Stack.m1936constructorimpl$default(null, 1, null);
        SlotReader openReader = slotTable.openReader();
        openReader.close();
        this.reader = openReader;
        SlotTable slotTable2 = new SlotTable();
        if (compositionContext.getCollectingSourceInformation$runtime_release()) {
            slotTable2.collectSourceInformation();
        }
        if (compositionContext.getCollectingCallByInformation$runtime_release()) {
            slotTable2.collectCalledByInformation();
        }
        this.insertTable = slotTable2;
        SlotWriter openWriter = slotTable2.openWriter();
        openWriter.close(true);
        this.writer = openWriter;
        this.changeListWriter = new ComposerChangeListWriter(this, this.changes);
        SlotReader openReader2 = this.insertTable.openReader();
        try {
            Anchor anchor = openReader2.anchor(0);
            openReader2.close();
            this.insertAnchor = anchor;
            this.insertFixups = new FixupList();
        } catch (Throwable th2) {
            openReader2.close();
            throw th2;
        }
    }

    private final void abortRoot() {
        cleanUpCompose();
        Stack.m1934clearimpl(this.pendingStack);
        this.parentStateStack.clear();
        this.entersStack.clear();
        this.providersInvalidStack.clear();
        this.providerUpdates = null;
        this.insertFixups.clear();
        this.compoundKeyHash = 0;
        this.childrenComposing = 0;
        this.nodeExpected = false;
        this.inserting = false;
        this.reusing = false;
        this.isComposing = false;
        this.forciblyRecompose = false;
        this.reusingGroup = -1;
        if (!this.reader.getClosed()) {
            this.reader.close();
        }
        if (this.writer.getClosed()) {
            return;
        }
        forceFreshInsertTable();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void addRecomposeScope() {
        /*
            r4 = this;
            boolean r0 = r4.getInserting()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl"
            if (r0 == 0) goto L24
            androidx.compose.runtime.RecomposeScopeImpl r0 = new androidx.compose.runtime.RecomposeScopeImpl
            androidx.compose.runtime.ControlledComposition r2 = r4.getComposition()
            kotlin.jvm.internal.g0.n(r2, r1)
            androidx.compose.runtime.CompositionImpl r2 = (androidx.compose.runtime.CompositionImpl) r2
            r0.<init>(r2)
            java.util.ArrayList<java.lang.Object> r1 = r4.invalidateStack
            androidx.compose.runtime.Stack.m1946pushimpl(r1, r0)
            r4.updateValue(r0)
            int r1 = r4.compositionToken
            r0.start(r1)
            return
        L24:
            java.util.List<androidx.compose.runtime.Invalidation> r0 = r4.invalidations
            androidx.compose.runtime.SlotReader r2 = r4.reader
            int r2 = r2.getParent()
            androidx.compose.runtime.Invalidation r0 = androidx.compose.runtime.ComposerKt.access$removeLocation(r0, r2)
            androidx.compose.runtime.SlotReader r2 = r4.reader
            java.lang.Object r2 = r2.next()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            boolean r3 = kotlin.jvm.internal.g0.g(r2, r3)
            if (r3 == 0) goto L54
            androidx.compose.runtime.RecomposeScopeImpl r2 = new androidx.compose.runtime.RecomposeScopeImpl
            androidx.compose.runtime.ControlledComposition r3 = r4.getComposition()
            kotlin.jvm.internal.g0.n(r3, r1)
            androidx.compose.runtime.CompositionImpl r3 = (androidx.compose.runtime.CompositionImpl) r3
            r2.<init>(r3)
            r4.updateValue(r2)
            goto L5b
        L54:
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            kotlin.jvm.internal.g0.n(r2, r1)
            androidx.compose.runtime.RecomposeScopeImpl r2 = (androidx.compose.runtime.RecomposeScopeImpl) r2
        L5b:
            r1 = 1
            r3 = 0
            if (r0 != 0) goto L6d
            boolean r0 = r2.getForcedRecompose()
            if (r0 == 0) goto L68
            r2.setForcedRecompose(r3)
        L68:
            if (r0 == 0) goto L6b
            goto L6d
        L6b:
            r0 = r3
            goto L6e
        L6d:
            r0 = r1
        L6e:
            r2.setRequiresRecompose(r0)
            java.util.ArrayList<java.lang.Object> r0 = r4.invalidateStack
            androidx.compose.runtime.Stack.m1946pushimpl(r0, r2)
            int r0 = r4.compositionToken
            r2.start(r0)
            boolean r0 = r2.getPaused()
            if (r0 == 0) goto L8c
            r2.setPaused(r3)
            r2.setResuming(r1)
            androidx.compose.runtime.changelist.ComposerChangeListWriter r0 = r4.changeListWriter
            r0.startResumingScope(r2)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.addRecomposeScope():void");
    }

    private final void cleanUpCompose() {
        this.pending = null;
        this.nodeIndex = 0;
        this.groupNodeCount = 0;
        this.compoundKeyHash = 0;
        this.nodeExpected = false;
        this.changeListWriter.resetTransientState();
        Stack.m1934clearimpl(this.invalidateStack);
        clearUpdatedNodeCounts();
    }

    private final void clearUpdatedNodeCounts() {
        this.nodeCountOverrides = null;
        this.nodeCountVirtualOverrides = null;
    }

    private final int compoundKeyOf(int i11, int i12, int i13) {
        int rotateLeft;
        int i14 = 3;
        int i15 = 0;
        int i16 = 0;
        while (i11 >= 0) {
            if (i11 == i12) {
                rotateLeft = Integer.rotateLeft(i13, i16);
            } else {
                int groupCompoundKeyPart = groupCompoundKeyPart(this.reader, i11);
                if (groupCompoundKeyPart == 126665345) {
                    rotateLeft = Integer.rotateLeft(groupCompoundKeyPart, i16);
                } else {
                    i15 = (i15 ^ Integer.rotateLeft(groupCompoundKeyPart, i14)) ^ Integer.rotateLeft(this.reader.hasObjectKey(i11) ? 0 : rGroupIndexOf(i11), i16);
                    i14 = (i14 + 6) % 32;
                    i16 = (i16 + 6) % 32;
                    i11 = this.reader.parent(i11);
                }
            }
            return rotateLeft ^ i15;
        }
        return i15;
    }

    private final void createFreshInsertTable() {
        if (!this.writer.getClosed()) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        forceFreshInsertTable();
    }

    private final PersistentCompositionLocalMap currentCompositionLocalScope() {
        PersistentCompositionLocalMap persistentCompositionLocalMap = this.providerCache;
        return persistentCompositionLocalMap != null ? persistentCompositionLocalMap : currentCompositionLocalScope(this.reader.getParent());
    }

    /* renamed from: doCompose-aFTiNEg, reason: not valid java name */
    private final void m1890doComposeaFTiNEg(MutableScatterMap<Object, Object> mutableScatterMap, p<? super Composer, ? super Integer, g2> pVar) {
        if (this.isComposing) {
            ComposerKt.composeImmediateRuntimeError("Reentrant composition is not supported");
        }
        Trace trace = Trace.INSTANCE;
        Object beginSection = trace.beginSection("Compose:recompose");
        try {
            this.compositionToken = Long.hashCode(SnapshotKt.currentSnapshot().getSnapshotId());
            this.providerUpdates = null;
            m1894updateComposerInvalidationsRY85e9Y(mutableScatterMap);
            this.nodeIndex = 0;
            this.isComposing = true;
            try {
                startRoot();
                Object nextSlot = nextSlot();
                if (nextSlot != pVar && pVar != null) {
                    updateValue(pVar);
                }
                ComposerImpl$derivedStateObserver$1 composerImpl$derivedStateObserver$1 = this.derivedStateObserver;
                MutableVector<DerivedStateObserver> derivedStateObservers = SnapshotStateKt.derivedStateObservers();
                try {
                    derivedStateObservers.add(composerImpl$derivedStateObserver$1);
                    if (pVar != null) {
                        startGroup(200, ComposerKt.getInvocation());
                        Utils_jvmKt.invokeComposable(this, pVar);
                        endGroup();
                    } else if ((!this.forciblyRecompose && !this.providersInvalid) || nextSlot == null || g0.g(nextSlot, Composer.Companion.getEmpty())) {
                        skipCurrentGroup();
                    } else {
                        startGroup(200, ComposerKt.getInvocation());
                        Utils_jvmKt.invokeComposable(this, (p) x0.q(nextSlot, 2));
                        endGroup();
                    }
                    derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                    endRoot();
                    this.isComposing = false;
                    this.invalidations.clear();
                    createFreshInsertTable();
                    g2 g2Var = g2.f100423a;
                    trace.endSection(beginSection);
                } catch (Throwable th2) {
                    derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                    throw th2;
                }
            } catch (Throwable th3) {
                this.isComposing = false;
                this.invalidations.clear();
                abortRoot();
                createFreshInsertTable();
                throw th3;
            }
        } catch (Throwable th4) {
            Trace.INSTANCE.endSection(beginSection);
            throw th4;
        }
    }

    private final void doRecordDownsFor(int i11, int i12) {
        if (i11 <= 0 || i11 == i12) {
            return;
        }
        doRecordDownsFor(this.reader.parent(i11), i12);
        if (this.reader.isNode(i11)) {
            this.changeListWriter.moveDown(nodeAt(this.reader, i11));
        }
    }

    private final void end(boolean z11) {
        int hashCode;
        int remainingSlots;
        List<KeyInfo> list;
        List<KeyInfo> list2;
        int hashCode2;
        int peek2 = this.parentStateStack.peek2() - 1;
        if (getInserting()) {
            int parent = this.writer.getParent();
            int groupKey = this.writer.groupKey(parent);
            Object groupObjectKey = this.writer.groupObjectKey(parent);
            Object groupAux = this.writer.groupAux(parent);
            if (groupObjectKey != null) {
                hashCode2 = Integer.hashCode(groupObjectKey instanceof Enum ? ((Enum) groupObjectKey).ordinal() : groupObjectKey.hashCode()) ^ Integer.rotateRight(getCompoundKeyHash(), 3);
            } else if (groupAux == null || groupKey != 207 || g0.g(groupAux, Composer.Companion.getEmpty())) {
                hashCode2 = Integer.rotateRight(peek2 ^ getCompoundKeyHash(), 3) ^ Integer.hashCode(groupKey);
            } else {
                this.compoundKeyHash = Integer.rotateRight(Integer.rotateRight(peek2 ^ getCompoundKeyHash(), 3) ^ Integer.hashCode(groupAux.hashCode()), 3);
            }
            this.compoundKeyHash = Integer.rotateRight(hashCode2, 3);
        } else {
            int parent2 = this.reader.getParent();
            int groupKey2 = this.reader.groupKey(parent2);
            Object groupObjectKey2 = this.reader.groupObjectKey(parent2);
            Object groupAux2 = this.reader.groupAux(parent2);
            if (groupObjectKey2 != null) {
                hashCode = Integer.hashCode(groupObjectKey2 instanceof Enum ? ((Enum) groupObjectKey2).ordinal() : groupObjectKey2.hashCode()) ^ Integer.rotateRight(getCompoundKeyHash(), 3);
            } else if (groupAux2 == null || groupKey2 != 207 || g0.g(groupAux2, Composer.Companion.getEmpty())) {
                hashCode = Integer.rotateRight(peek2 ^ getCompoundKeyHash(), 3) ^ Integer.hashCode(groupKey2);
            } else {
                this.compoundKeyHash = Integer.rotateRight(Integer.rotateRight(peek2 ^ getCompoundKeyHash(), 3) ^ Integer.hashCode(groupAux2.hashCode()), 3);
            }
            this.compoundKeyHash = Integer.rotateRight(hashCode, 3);
        }
        int i11 = this.groupNodeCount;
        Pending pending = this.pending;
        if (pending != null && pending.getKeyInfos().size() > 0) {
            List<KeyInfo> keyInfos = pending.getKeyInfos();
            List<KeyInfo> used = pending.getUsed();
            Set fastToSet = ListUtilsKt.fastToSet(used);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = used.size();
            int size2 = keyInfos.size();
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i12 < size2) {
                KeyInfo keyInfo = keyInfos.get(i12);
                if (fastToSet.contains(keyInfo)) {
                    list = keyInfos;
                    if (!linkedHashSet.contains(keyInfo)) {
                        if (i13 < size) {
                            KeyInfo keyInfo2 = used.get(i13);
                            if (keyInfo2 != keyInfo) {
                                int nodePositionOf = pending.nodePositionOf(keyInfo2);
                                linkedHashSet.add(keyInfo2);
                                if (nodePositionOf != i14) {
                                    int updatedNodeCountOf = pending.updatedNodeCountOf(keyInfo2);
                                    list2 = used;
                                    this.changeListWriter.moveNode(pending.getStartIndex() + nodePositionOf, i14 + pending.getStartIndex(), updatedNodeCountOf);
                                    pending.registerMoveNode(nodePositionOf, i14, updatedNodeCountOf);
                                } else {
                                    list2 = used;
                                }
                            } else {
                                list2 = used;
                                i12++;
                            }
                            i13++;
                            i14 += pending.updatedNodeCountOf(keyInfo2);
                            keyInfos = list;
                            used = list2;
                        }
                        keyInfos = list;
                    }
                } else {
                    this.changeListWriter.removeNode(pending.nodePositionOf(keyInfo) + pending.getStartIndex(), keyInfo.getNodes());
                    pending.updateNodeCount(keyInfo.getLocation(), 0);
                    this.changeListWriter.moveReaderRelativeTo(keyInfo.getLocation());
                    this.reader.reposition(keyInfo.getLocation());
                    recordDelete();
                    this.reader.skipGroup();
                    list = keyInfos;
                    ComposerKt.removeRange(this.invalidations, keyInfo.getLocation(), keyInfo.getLocation() + this.reader.groupSize(keyInfo.getLocation()));
                }
                i12++;
                keyInfos = list;
            }
            this.changeListWriter.endNodeMovement();
            if (keyInfos.size() > 0) {
                this.changeListWriter.moveReaderRelativeTo(this.reader.getGroupEnd());
                this.reader.skipToGroupEnd();
            }
        }
        boolean inserting = getInserting();
        if (!inserting && (remainingSlots = this.reader.getRemainingSlots()) > 0) {
            this.changeListWriter.trimValues(remainingSlots);
        }
        int i15 = this.nodeIndex;
        while (!this.reader.isGroupEnd()) {
            int currentGroup = this.reader.getCurrentGroup();
            recordDelete();
            this.changeListWriter.removeNode(i15, this.reader.skipGroup());
            ComposerKt.removeRange(this.invalidations, currentGroup, this.reader.getCurrentGroup());
        }
        if (inserting) {
            if (z11) {
                this.insertFixups.endNodeInsert();
                i11 = 1;
            }
            this.reader.endEmpty();
            int parent3 = this.writer.getParent();
            this.writer.endGroup();
            if (!this.reader.getInEmpty()) {
                int insertedGroupVirtualIndex = insertedGroupVirtualIndex(parent3);
                this.writer.endInsert();
                this.writer.close(true);
                recordInsert(this.insertAnchor);
                this.inserting = false;
                if (!this.slotTable.isEmpty()) {
                    updateNodeCount(insertedGroupVirtualIndex, 0);
                    updateNodeCountOverrides(insertedGroupVirtualIndex, i11);
                }
            }
        } else {
            if (z11) {
                this.changeListWriter.moveUp();
            }
            this.changeListWriter.endCurrentGroup();
            int parent4 = this.reader.getParent();
            if (i11 != updatedNodeCount(parent4)) {
                updateNodeCountOverrides(parent4, i11);
            }
            if (z11) {
                i11 = 1;
            }
            this.reader.endGroup();
            this.changeListWriter.endNodeMovement();
        }
        exitGroup(i11, inserting);
    }

    private final void endGroup() {
        end(false);
    }

    private final void endRoot() {
        boolean asBool;
        endGroup();
        this.parentContext.doneComposing$runtime_release();
        endGroup();
        this.changeListWriter.endRoot();
        finalizeCompose();
        this.reader.close();
        this.forciblyRecompose = false;
        asBool = ComposerKt.asBool(this.providersInvalidStack.pop());
        this.providersInvalid = asBool;
    }

    private final void ensureWriter() {
        if (this.writer.getClosed()) {
            SlotWriter openWriter = this.insertTable.openWriter();
            this.writer = openWriter;
            openWriter.skipToGroupEnd();
            this.writerHasAProvider = false;
            this.providerCache = null;
        }
    }

    private final void enterGroup(boolean z11, Pending pending) {
        Stack.m1946pushimpl(this.pendingStack, this.pending);
        this.pending = pending;
        this.parentStateStack.push(this.groupNodeCount);
        this.parentStateStack.push(this.rGroupIndex);
        this.parentStateStack.push(this.nodeIndex);
        if (z11) {
            this.nodeIndex = 0;
        }
        this.groupNodeCount = 0;
        this.rGroupIndex = 0;
    }

    private final void exitGroup(int i11, boolean z11) {
        Pending pending = (Pending) Stack.m1945popimpl(this.pendingStack);
        if (pending != null && !z11) {
            pending.setGroupIndex(pending.getGroupIndex() + 1);
        }
        this.pending = pending;
        this.nodeIndex = this.parentStateStack.pop() + i11;
        this.rGroupIndex = this.parentStateStack.pop();
        this.groupNodeCount = this.parentStateStack.pop() + i11;
    }

    private final void finalizeCompose() {
        this.changeListWriter.finalizeComposition();
        if (!Stack.m1941isEmptyimpl(this.pendingStack)) {
            ComposerKt.composeImmediateRuntimeError("Start/end imbalance");
        }
        cleanUpCompose();
    }

    private final void forceFreshInsertTable() {
        SlotTable slotTable = new SlotTable();
        if (this.sourceMarkersEnabled) {
            slotTable.collectSourceInformation();
        }
        if (this.parentContext.getCollectingCallByInformation$runtime_release()) {
            slotTable.collectCalledByInformation();
        }
        this.insertTable = slotTable;
        SlotWriter openWriter = slotTable.openWriter();
        openWriter.close(true);
        this.writer = openWriter;
    }

    private final Object getNode(SlotReader slotReader) {
        return slotReader.node(slotReader.getParent());
    }

    private final int groupCompoundKeyPart(SlotReader slotReader, int i11) {
        Object groupAux;
        if (!slotReader.hasObjectKey(i11)) {
            int groupKey = slotReader.groupKey(i11);
            return (groupKey != 207 || (groupAux = slotReader.groupAux(i11)) == null || g0.g(groupAux, Composer.Companion.getEmpty())) ? groupKey : groupAux.hashCode();
        }
        Object groupObjectKey = slotReader.groupObjectKey(i11);
        if (groupObjectKey != null) {
            return groupObjectKey instanceof Enum ? ((Enum) groupObjectKey).ordinal() : groupObjectKey instanceof MovableContent ? MovableContentKt.movableContentKey : groupObjectKey.hashCode();
        }
        return 0;
    }

    private final void insertMovableContentGuarded(List<Pair<MovableContentStateReference, MovableContentStateReference>> list) {
        ComposerChangeListWriter composerChangeListWriter;
        ChangeList changeList;
        ComposerChangeListWriter composerChangeListWriter2;
        ChangeList changeList2;
        SlotTable slotTable$runtime_release;
        Anchor anchor$runtime_release;
        List<? extends Object> collectNodesFrom;
        SlotReader slotReader;
        MutableIntObjectMap mutableIntObjectMap;
        ComposerChangeListWriter composerChangeListWriter3;
        ChangeList changeList3;
        int i11;
        int i12;
        SlotTable slotTable$runtime_release2;
        List<Pair<MovableContentStateReference, MovableContentStateReference>> list2 = list;
        ComposerChangeListWriter composerChangeListWriter4 = this.changeListWriter;
        ChangeList changeList4 = this.lateChanges;
        ChangeList changeList5 = composerChangeListWriter4.getChangeList();
        try {
            composerChangeListWriter4.setChangeList(changeList4);
            this.changeListWriter.resetSlots();
            int size = list2.size();
            int i13 = 0;
            int i14 = 0;
            while (i14 < size) {
                try {
                    Pair<MovableContentStateReference, MovableContentStateReference> pair = list2.get(i14);
                    final MovableContentStateReference component1 = pair.component1();
                    MovableContentStateReference component2 = pair.component2();
                    Anchor anchor$runtime_release2 = component1.getAnchor$runtime_release();
                    int anchorIndex = component1.getSlotTable$runtime_release().anchorIndex(anchor$runtime_release2);
                    IntRef intRef = new IntRef(i13, 1, null);
                    this.changeListWriter.determineMovableContentNodeIndex(intRef, anchor$runtime_release2);
                    if (component2 == null) {
                        if (g0.g(component1.getSlotTable$runtime_release(), this.insertTable)) {
                            createFreshInsertTable();
                        }
                        final SlotReader openReader = component1.getSlotTable$runtime_release().openReader();
                        try {
                            openReader.reposition(anchorIndex);
                            this.changeListWriter.moveReaderToAbsolute(anchorIndex);
                            final ChangeList changeList6 = new ChangeList();
                            recomposeMovableContent$default(this, null, null, null, null, new x00.a<g2>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$1$1
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
                                    ComposerChangeListWriter composerChangeListWriter5;
                                    ComposerChangeListWriter composerChangeListWriter6;
                                    composerChangeListWriter5 = ComposerImpl.this.changeListWriter;
                                    ChangeList changeList7 = changeList6;
                                    ComposerImpl composerImpl = ComposerImpl.this;
                                    SlotReader slotReader2 = openReader;
                                    MovableContentStateReference movableContentStateReference = component1;
                                    ChangeList changeList8 = composerChangeListWriter5.getChangeList();
                                    try {
                                        composerChangeListWriter5.setChangeList(changeList7);
                                        SlotReader reader$runtime_release = composerImpl.getReader$runtime_release();
                                        int[] iArr = composerImpl.nodeCountOverrides;
                                        MutableIntObjectMap mutableIntObjectMap2 = composerImpl.providerUpdates;
                                        composerImpl.nodeCountOverrides = null;
                                        composerImpl.providerUpdates = null;
                                        try {
                                            composerImpl.setReader$runtime_release(slotReader2);
                                            composerChangeListWriter6 = composerImpl.changeListWriter;
                                            boolean implicitRootStart = composerChangeListWriter6.getImplicitRootStart();
                                            try {
                                                composerChangeListWriter6.setImplicitRootStart(false);
                                                composerImpl.invokeMovableContentLambda(movableContentStateReference.getContent$runtime_release(), movableContentStateReference.getLocals$runtime_release(), movableContentStateReference.getParameter$runtime_release(), true);
                                                composerChangeListWriter6.setImplicitRootStart(implicitRootStart);
                                                g2 g2Var = g2.f100423a;
                                            } catch (Throwable th2) {
                                                composerChangeListWriter6.setImplicitRootStart(implicitRootStart);
                                                throw th2;
                                            }
                                        } finally {
                                            composerImpl.setReader$runtime_release(reader$runtime_release);
                                            composerImpl.nodeCountOverrides = iArr;
                                            composerImpl.providerUpdates = mutableIntObjectMap2;
                                        }
                                    } finally {
                                        composerChangeListWriter5.setChangeList(changeList8);
                                    }
                                }
                            }, 15, null);
                            this.changeListWriter.includeOperationsIn(changeList6, intRef);
                            g2 g2Var = g2.f100423a;
                            openReader.close();
                            composerChangeListWriter2 = composerChangeListWriter4;
                            changeList2 = changeList5;
                            i11 = size;
                            i12 = i14;
                        } finally {
                        }
                    } else {
                        MovableContentState movableContentStateResolve$runtime_release = this.parentContext.movableContentStateResolve$runtime_release(component2);
                        if (movableContentStateResolve$runtime_release == null || (slotTable$runtime_release = movableContentStateResolve$runtime_release.getSlotTable$runtime_release()) == null) {
                            slotTable$runtime_release = component2.getSlotTable$runtime_release();
                        }
                        if (movableContentStateResolve$runtime_release == null || (slotTable$runtime_release2 = movableContentStateResolve$runtime_release.getSlotTable$runtime_release()) == null || (anchor$runtime_release = slotTable$runtime_release2.anchor(0)) == null) {
                            anchor$runtime_release = component2.getAnchor$runtime_release();
                        }
                        collectNodesFrom = ComposerKt.collectNodesFrom(slotTable$runtime_release, anchor$runtime_release);
                        if (!collectNodesFrom.isEmpty()) {
                            this.changeListWriter.copyNodesToNewAnchorLocation(collectNodesFrom, intRef);
                            if (g0.g(component1.getSlotTable$runtime_release(), this.slotTable)) {
                                int anchorIndex2 = this.slotTable.anchorIndex(anchor$runtime_release2);
                                updateNodeCount(anchorIndex2, updatedNodeCount(anchorIndex2) + collectNodesFrom.size());
                            }
                        }
                        this.changeListWriter.copySlotTableToAnchorLocation(movableContentStateResolve$runtime_release, this.parentContext, component2, component1);
                        SlotReader openReader2 = slotTable$runtime_release.openReader();
                        try {
                            SlotReader reader$runtime_release = getReader$runtime_release();
                            int[] iArr = this.nodeCountOverrides;
                            MutableIntObjectMap mutableIntObjectMap2 = this.providerUpdates;
                            this.nodeCountOverrides = null;
                            this.providerUpdates = null;
                            try {
                                setReader$runtime_release(openReader2);
                                int anchorIndex3 = slotTable$runtime_release.anchorIndex(anchor$runtime_release);
                                openReader2.reposition(anchorIndex3);
                                this.changeListWriter.moveReaderToAbsolute(anchorIndex3);
                                ChangeList changeList7 = new ChangeList();
                                ComposerChangeListWriter composerChangeListWriter5 = this.changeListWriter;
                                ChangeList changeList8 = composerChangeListWriter5.getChangeList();
                                try {
                                    composerChangeListWriter5.setChangeList(changeList7);
                                    slotReader = openReader2;
                                    try {
                                        ComposerChangeListWriter composerChangeListWriter6 = this.changeListWriter;
                                        i11 = size;
                                        boolean implicitRootStart = composerChangeListWriter6.getImplicitRootStart();
                                        try {
                                            composerChangeListWriter6.setImplicitRootStart(false);
                                            try {
                                                i12 = i14;
                                                mutableIntObjectMap = mutableIntObjectMap2;
                                                composerChangeListWriter2 = composerChangeListWriter4;
                                                composerChangeListWriter3 = composerChangeListWriter5;
                                                changeList2 = changeList5;
                                                changeList3 = changeList8;
                                                try {
                                                    recomposeMovableContent(component2.getComposition$runtime_release(), component1.getComposition$runtime_release(), Integer.valueOf(slotReader.getCurrentGroup()), component2.getInvalidations$runtime_release(), new x00.a<g2>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$2$1$1$1$1
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
                                                            ComposerImpl.this.invokeMovableContentLambda(component1.getContent$runtime_release(), component1.getLocals$runtime_release(), component1.getParameter$runtime_release(), true);
                                                        }
                                                    });
                                                    try {
                                                        composerChangeListWriter6.setImplicitRootStart(implicitRootStart);
                                                        try {
                                                            composerChangeListWriter3.setChangeList(changeList3);
                                                            this.changeListWriter.includeOperationsIn(changeList7, intRef);
                                                            g2 g2Var2 = g2.f100423a;
                                                            try {
                                                                setReader$runtime_release(reader$runtime_release);
                                                                this.nodeCountOverrides = iArr;
                                                                this.providerUpdates = mutableIntObjectMap;
                                                                try {
                                                                    slotReader.close();
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    composerChangeListWriter = composerChangeListWriter2;
                                                                    changeList = changeList2;
                                                                    composerChangeListWriter.setChangeList(changeList);
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                slotReader.close();
                                                                throw th;
                                                            }
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            setReader$runtime_release(reader$runtime_release);
                                                            this.nodeCountOverrides = iArr;
                                                            this.providerUpdates = mutableIntObjectMap;
                                                            throw th;
                                                        }
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        composerChangeListWriter3.setChangeList(changeList3);
                                                        throw th;
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    composerChangeListWriter6.setImplicitRootStart(implicitRootStart);
                                                    throw th;
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                mutableIntObjectMap = mutableIntObjectMap2;
                                                changeList3 = changeList8;
                                                composerChangeListWriter3 = composerChangeListWriter5;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            mutableIntObjectMap = mutableIntObjectMap2;
                                            composerChangeListWriter3 = composerChangeListWriter5;
                                            changeList3 = changeList8;
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        mutableIntObjectMap = mutableIntObjectMap2;
                                        composerChangeListWriter3 = composerChangeListWriter5;
                                        changeList3 = changeList8;
                                        composerChangeListWriter3.setChangeList(changeList3);
                                        throw th;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    mutableIntObjectMap = mutableIntObjectMap2;
                                    slotReader = openReader2;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                mutableIntObjectMap = mutableIntObjectMap2;
                                slotReader = openReader2;
                            }
                        } catch (Throwable th12) {
                            th = th12;
                            slotReader = openReader2;
                        }
                    }
                    this.changeListWriter.skipToEndOfCurrentGroup();
                    i14 = i12 + 1;
                    list2 = list;
                    size = i11;
                    composerChangeListWriter4 = composerChangeListWriter2;
                    changeList5 = changeList2;
                    i13 = 0;
                } catch (Throwable th13) {
                    th = th13;
                    composerChangeListWriter2 = composerChangeListWriter4;
                    changeList2 = changeList5;
                }
            }
            ComposerChangeListWriter composerChangeListWriter7 = composerChangeListWriter4;
            ChangeList changeList9 = changeList5;
            this.changeListWriter.endMovableContentPlacement();
            this.changeListWriter.moveReaderToAbsolute(0);
            composerChangeListWriter7.setChangeList(changeList9);
        } catch (Throwable th14) {
            th = th14;
            composerChangeListWriter = composerChangeListWriter4;
            changeList = changeList5;
        }
    }

    private final int insertedGroupVirtualIndex(int i11) {
        return (-2) - i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        recordProviderUpdate(r14);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invokeMovableContentLambda(final androidx.compose.runtime.MovableContent<java.lang.Object> r13, androidx.compose.runtime.PersistentCompositionLocalMap r14, final java.lang.Object r15, boolean r16) {
        /*
            r12 = this;
            r0 = 126665345(0x78cc281, float:2.1179178E-34)
            r12.startMovableGroup(r0, r13)
            r12.updateSlot(r15)
            int r1 = r12.getCompoundKeyHash()
            r2 = 0
            r12.compoundKeyHash = r0     // Catch: java.lang.Throwable -> L1e
            boolean r0 = r12.getInserting()     // Catch: java.lang.Throwable -> L1e
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L22
            androidx.compose.runtime.SlotWriter r0 = r12.writer     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.SlotWriter.markGroup$default(r0, r3, r4, r2)     // Catch: java.lang.Throwable -> L1e
            goto L22
        L1e:
            r0 = move-exception
            r13 = r0
            goto La0
        L22:
            boolean r0 = r12.getInserting()     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L29
            goto L36
        L29:
            androidx.compose.runtime.SlotReader r0 = r12.reader     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r0 = r0.getGroupAux()     // Catch: java.lang.Throwable -> L1e
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r14)     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L36
            r3 = r4
        L36:
            if (r3 == 0) goto L3b
            r12.recordProviderUpdate(r14)     // Catch: java.lang.Throwable -> L1e
        L3b:
            java.lang.Object r0 = androidx.compose.runtime.ComposerKt.getCompositionLocalMap()     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.GroupKind$Companion r5 = androidx.compose.runtime.GroupKind.Companion     // Catch: java.lang.Throwable -> L1e
            int r5 = r5.m1905getGroupULZAiWs()     // Catch: java.lang.Throwable -> L1e
            r6 = 202(0xca, float:2.83E-43)
            r12.m1891startBaiHCIY(r6, r0, r5, r14)     // Catch: java.lang.Throwable -> L1e
            r12.providerCache = r2     // Catch: java.lang.Throwable -> L1e
            boolean r14 = r12.getInserting()     // Catch: java.lang.Throwable -> L1e
            if (r14 == 0) goto L80
            if (r16 != 0) goto L80
            r12.writerHasAProvider = r4     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.SlotWriter r14 = r12.writer     // Catch: java.lang.Throwable -> L1e
            int r0 = r14.getParent()     // Catch: java.lang.Throwable -> L1e
            int r0 = r14.parent(r0)     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.Anchor r8 = r14.anchor(r0)     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.MovableContentStateReference r3 = new androidx.compose.runtime.MovableContentStateReference     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.ControlledComposition r6 = r12.getComposition()     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.SlotTable r7 = r12.insertTable     // Catch: java.lang.Throwable -> L1e
            java.util.List r9 = a00.h0.J()     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.PersistentCompositionLocalMap r10 = r12.currentCompositionLocalScope()     // Catch: java.lang.Throwable -> L1e
            r11 = 0
            r4 = r13
            r5 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.CompositionContext r13 = r12.parentContext     // Catch: java.lang.Throwable -> L1e
            r13.insertMovableContent$runtime_release(r3)     // Catch: java.lang.Throwable -> L1e
            goto L95
        L80:
            boolean r0 = r12.providersInvalid     // Catch: java.lang.Throwable -> L1e
            r12.providersInvalid = r3     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.ComposerImpl$invokeMovableContentLambda$1 r3 = new androidx.compose.runtime.ComposerImpl$invokeMovableContentLambda$1     // Catch: java.lang.Throwable -> L1e
            r3.<init>()     // Catch: java.lang.Throwable -> L1e
            r13 = 316014703(0x12d6006f, float:1.3505406E-27)
            androidx.compose.runtime.internal.ComposableLambda r13 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(r13, r4, r3)     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.internal.Utils_jvmKt.invokeComposable(r12, r13)     // Catch: java.lang.Throwable -> L1e
            r12.providersInvalid = r0     // Catch: java.lang.Throwable -> L1e
        L95:
            r12.endGroup()
            r12.providerCache = r2
            r12.compoundKeyHash = r1
            r12.endMovableGroup()
            return
        La0:
            r12.endGroup()
            r12.providerCache = r2
            r12.compoundKeyHash = r1
            r12.endMovableGroup()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda(androidx.compose.runtime.MovableContent, androidx.compose.runtime.PersistentCompositionLocalMap, java.lang.Object, boolean):void");
    }

    private final Object nodeAt(SlotReader slotReader, int i11) {
        return slotReader.node(i11);
    }

    private final int nodeIndexOf(int i11, int i12, int i13, int i14) {
        int parent = this.reader.parent(i12);
        while (parent != i13 && !this.reader.isNode(parent)) {
            parent = this.reader.parent(parent);
        }
        if (this.reader.isNode(parent)) {
            i14 = 0;
        }
        if (parent == i12) {
            return i14;
        }
        int updatedNodeCount = (updatedNodeCount(parent) - this.reader.nodeCount(i12)) + i14;
        loop1: while (i14 < updatedNodeCount && parent != i11) {
            parent++;
            while (parent < i11) {
                int groupSize = this.reader.groupSize(parent) + parent;
                if (i11 >= groupSize) {
                    i14 += this.reader.isNode(parent) ? 1 : updatedNodeCount(parent);
                    parent = groupSize;
                }
            }
            break loop1;
        }
        return i14;
    }

    private final int rGroupIndexOf(int i11) {
        int parent = this.reader.parent(i11) + 1;
        int i12 = 0;
        while (parent < i11) {
            if (!this.reader.hasObjectKey(parent)) {
                i12++;
            }
            parent += this.reader.groupSize(parent);
        }
        return i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r7 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final <R> R recomposeMovableContent(androidx.compose.runtime.ControlledComposition r7, androidx.compose.runtime.ControlledComposition r8, java.lang.Integer r9, java.util.List<? extends kotlin.Pair<androidx.compose.runtime.RecomposeScopeImpl, ? extends java.lang.Object>> r10, x00.a<? extends R> r11) {
        /*
            r6 = this;
            boolean r0 = r6.isComposing
            int r1 = r6.nodeIndex
            r2 = 1
            r6.isComposing = r2     // Catch: java.lang.Throwable -> L29
            r2 = 0
            r6.nodeIndex = r2     // Catch: java.lang.Throwable -> L29
            r3 = r10
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Throwable -> L29
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L29
        L11:
            if (r2 >= r3) goto L32
            java.lang.Object r4 = r10.get(r2)     // Catch: java.lang.Throwable -> L29
            kotlin.Pair r4 = (kotlin.Pair) r4     // Catch: java.lang.Throwable -> L29
            java.lang.Object r5 = r4.component1()     // Catch: java.lang.Throwable -> L29
            androidx.compose.runtime.RecomposeScopeImpl r5 = (androidx.compose.runtime.RecomposeScopeImpl) r5     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r4.component2()     // Catch: java.lang.Throwable -> L29
            if (r4 == 0) goto L2b
            r6.tryImminentInvalidation$runtime_release(r5, r4)     // Catch: java.lang.Throwable -> L29
            goto L2f
        L29:
            r7 = move-exception
            goto L4b
        L2b:
            r4 = 0
            r6.tryImminentInvalidation$runtime_release(r5, r4)     // Catch: java.lang.Throwable -> L29
        L2f:
            int r2 = r2 + 1
            goto L11
        L32:
            if (r7 == 0) goto L42
            if (r9 == 0) goto L3b
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L29
            goto L3c
        L3b:
            r9 = -1
        L3c:
            java.lang.Object r7 = r7.delegateInvalidations(r8, r9, r11)     // Catch: java.lang.Throwable -> L29
            if (r7 != 0) goto L46
        L42:
            java.lang.Object r7 = r11.invoke()     // Catch: java.lang.Throwable -> L29
        L46:
            r6.isComposing = r0
            r6.nodeIndex = r1
            return r7
        L4b:
            r6.isComposing = r0
            r6.nodeIndex = r1
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.recomposeMovableContent(androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.ControlledComposition, java.lang.Integer, java.util.List, x00.a):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object recomposeMovableContent$default(ComposerImpl composerImpl, ControlledComposition controlledComposition, ControlledComposition controlledComposition2, Integer num, List list, x00.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            controlledComposition = null;
        }
        if ((i11 & 2) != 0) {
            controlledComposition2 = null;
        }
        if ((i11 & 4) != 0) {
            num = null;
        }
        if ((i11 & 8) != 0) {
            list = h0.J();
        }
        return composerImpl.recomposeMovableContent(controlledComposition, controlledComposition2, num, list, aVar);
    }

    private final void recomposeToGroupEnd() {
        Invalidation firstInRange;
        boolean z11 = this.isComposing;
        this.isComposing = true;
        int parent = this.reader.getParent();
        int groupSize = this.reader.groupSize(parent) + parent;
        int i11 = this.nodeIndex;
        int compoundKeyHash = getCompoundKeyHash();
        int i12 = this.groupNodeCount;
        int i13 = this.rGroupIndex;
        firstInRange = ComposerKt.firstInRange(this.invalidations, this.reader.getCurrentGroup(), groupSize);
        int i14 = parent;
        boolean z12 = false;
        while (firstInRange != null) {
            int location = firstInRange.getLocation();
            ComposerKt.removeLocation(this.invalidations, location);
            if (firstInRange.isInvalid()) {
                this.reader.reposition(location);
                int currentGroup = this.reader.getCurrentGroup();
                recordUpsAndDowns(i14, currentGroup, parent);
                this.nodeIndex = nodeIndexOf(location, currentGroup, parent, i11);
                this.rGroupIndex = rGroupIndexOf(currentGroup);
                this.compoundKeyHash = compoundKeyOf(this.reader.parent(currentGroup), parent, compoundKeyHash);
                this.providerCache = null;
                boolean z13 = !this.reusing && firstInRange.getScope().getReusing();
                if (z13) {
                    this.reusing = true;
                }
                firstInRange.getScope().compose(this);
                if (z13) {
                    this.reusing = false;
                }
                this.providerCache = null;
                this.reader.restoreParent(parent);
                i14 = currentGroup;
                z12 = true;
            } else {
                Stack.m1946pushimpl(this.invalidateStack, firstInRange.getScope());
                firstInRange.getScope().rereadTrackedInstances();
                Stack.m1945popimpl(this.invalidateStack);
            }
            firstInRange = ComposerKt.firstInRange(this.invalidations, this.reader.getCurrentGroup(), groupSize);
        }
        if (z12) {
            recordUpsAndDowns(i14, parent, parent);
            this.reader.skipToGroupEnd();
            int updatedNodeCount = updatedNodeCount(parent);
            this.nodeIndex = i11 + updatedNodeCount;
            this.groupNodeCount = i12 + updatedNodeCount;
            this.rGroupIndex = i13;
        } else {
            skipReaderToGroupEnd();
        }
        this.compoundKeyHash = compoundKeyHash;
        this.isComposing = z11;
    }

    private final void recordDelete() {
        reportFreeMovableContent(this.reader.getCurrentGroup());
        this.changeListWriter.removeCurrentGroup();
    }

    private final void recordInsert(Anchor anchor) {
        if (this.insertFixups.isEmpty()) {
            this.changeListWriter.insertSlots(anchor, this.insertTable);
        } else {
            this.changeListWriter.insertSlots(anchor, this.insertTable, this.insertFixups);
            this.insertFixups = new FixupList();
        }
    }

    private final void recordProviderUpdate(PersistentCompositionLocalMap persistentCompositionLocalMap) {
        MutableIntObjectMap<PersistentCompositionLocalMap> mutableIntObjectMap = this.providerUpdates;
        if (mutableIntObjectMap == null) {
            mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
            this.providerUpdates = mutableIntObjectMap;
        }
        mutableIntObjectMap.set(this.reader.getCurrentGroup(), persistentCompositionLocalMap);
    }

    private final void recordUpsAndDowns(int i11, int i12, int i13) {
        int nearestCommonRootOf;
        SlotReader slotReader = this.reader;
        nearestCommonRootOf = ComposerKt.nearestCommonRootOf(slotReader, i11, i12, i13);
        while (i11 > 0 && i11 != nearestCommonRootOf) {
            if (slotReader.isNode(i11)) {
                this.changeListWriter.moveUp();
            }
            i11 = slotReader.parent(i11);
        }
        doRecordDownsFor(i12, nearestCommonRootOf);
    }

    private final Anchor rememberObserverAnchor() {
        int i11;
        int i12;
        if (getInserting()) {
            if (!ComposerKt.isAfterFirstChild(this.writer)) {
                return null;
            }
            int currentGroup = this.writer.getCurrentGroup() - 1;
            int parent = this.writer.parent(currentGroup);
            while (true) {
                int i13 = parent;
                i12 = currentGroup;
                currentGroup = i13;
                if (currentGroup == this.writer.getParent() || currentGroup < 0) {
                    break;
                }
                parent = this.writer.parent(currentGroup);
            }
            return this.writer.anchor(i12);
        }
        if (!ComposerKt.isAfterFirstChild(this.reader)) {
            return null;
        }
        int currentGroup2 = this.reader.getCurrentGroup() - 1;
        int parent2 = this.reader.parent(currentGroup2);
        while (true) {
            int i14 = parent2;
            i11 = currentGroup2;
            currentGroup2 = i14;
            if (currentGroup2 == this.reader.getParent() || currentGroup2 < 0) {
                break;
            }
            parent2 = this.reader.parent(currentGroup2);
        }
        return this.reader.anchor(i11);
    }

    private final void reportAllMovableContent() {
        if (this.slotTable.containsMark()) {
            ControlledComposition composition = getComposition();
            g0.n(composition, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            ((CompositionImpl) composition).updateMovingInvalidations$runtime_release();
            ChangeList changeList = new ChangeList();
            this.deferredChanges = changeList;
            SlotReader openReader = this.slotTable.openReader();
            try {
                this.reader = openReader;
                ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
                ChangeList changeList2 = composerChangeListWriter.getChangeList();
                try {
                    composerChangeListWriter.setChangeList(changeList);
                    reportFreeMovableContent(0);
                    this.changeListWriter.releaseMovableContent();
                    composerChangeListWriter.setChangeList(changeList2);
                    g2 g2Var = g2.f100423a;
                } catch (Throwable th2) {
                    composerChangeListWriter.setChangeList(changeList2);
                    throw th2;
                }
            } finally {
                openReader.close();
            }
        }
    }

    private final void reportFreeMovableContent(int i11) {
        boolean isNode = this.reader.isNode(i11);
        if (isNode) {
            this.changeListWriter.endNodeMovement();
            this.changeListWriter.moveDown(this.reader.node(i11));
        }
        reportFreeMovableContent$reportGroup(this, i11, i11, isNode, 0);
        this.changeListWriter.endNodeMovement();
        if (isNode) {
            this.changeListWriter.moveUp();
        }
    }

    private static final MovableContentStateReference reportFreeMovableContent$createMovableContentReferenceForGroup(ComposerImpl composerImpl, int i11, List<MovableContentStateReference> list) {
        List filterToRange;
        Object groupObjectKey = composerImpl.reader.groupObjectKey(i11);
        g0.n(groupObjectKey, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        MovableContent movableContent = (MovableContent) groupObjectKey;
        Object groupGet = composerImpl.reader.groupGet(i11, 0);
        Anchor anchor = composerImpl.reader.anchor(i11);
        filterToRange = ComposerKt.filterToRange(composerImpl.invalidations, i11, composerImpl.reader.groupSize(i11) + i11);
        ArrayList arrayList = new ArrayList(filterToRange.size());
        int size = filterToRange.size();
        for (int i12 = 0; i12 < size; i12++) {
            Invalidation invalidation = (Invalidation) filterToRange.get(i12);
            arrayList.add(h1.a(invalidation.getScope(), invalidation.getInstances()));
        }
        return new MovableContentStateReference(movableContent, groupGet, composerImpl.getComposition(), composerImpl.slotTable, anchor, arrayList, composerImpl.currentCompositionLocalScope(i11), list);
    }

    private static final MovableContentStateReference reportFreeMovableContent$movableContentReferenceFor(ComposerImpl composerImpl, int i11) {
        int groupKey = composerImpl.reader.groupKey(i11);
        Object groupObjectKey = composerImpl.reader.groupObjectKey(i11);
        ArrayList arrayList = null;
        if (groupKey != 126665345 || !(groupObjectKey instanceof MovableContent)) {
            return null;
        }
        if (composerImpl.reader.containsMark(i11)) {
            ArrayList arrayList2 = new ArrayList();
            reportFreeMovableContent$movableContentReferenceFor$traverseGroups(composerImpl, arrayList2, i11);
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return reportFreeMovableContent$createMovableContentReferenceForGroup(composerImpl, i11, arrayList);
    }

    private static final void reportFreeMovableContent$movableContentReferenceFor$traverseGroups(ComposerImpl composerImpl, List<MovableContentStateReference> list, int i11) {
        int groupSize = composerImpl.reader.groupSize(i11) + i11;
        int i12 = i11 + 1;
        while (i12 < groupSize) {
            if (composerImpl.reader.hasMark(i12)) {
                MovableContentStateReference reportFreeMovableContent$movableContentReferenceFor = reportFreeMovableContent$movableContentReferenceFor(composerImpl, i12);
                if (reportFreeMovableContent$movableContentReferenceFor != null) {
                    list.add(reportFreeMovableContent$movableContentReferenceFor);
                }
            } else if (composerImpl.reader.containsMark(i12)) {
                reportFreeMovableContent$movableContentReferenceFor$traverseGroups(composerImpl, list, i12);
            }
            i12 += composerImpl.reader.groupSize(i12);
        }
    }

    private static final int reportFreeMovableContent$reportGroup(ComposerImpl composerImpl, int i11, int i12, boolean z11, int i13) {
        SlotReader slotReader = composerImpl.reader;
        if (!slotReader.hasMark(i12)) {
            if (!slotReader.containsMark(i12)) {
                if (slotReader.isNode(i12)) {
                    return 1;
                }
                return slotReader.nodeCount(i12);
            }
            int groupSize = slotReader.groupSize(i12) + i12;
            int i14 = 0;
            for (int i15 = i12 + 1; i15 < groupSize; i15 += slotReader.groupSize(i15)) {
                boolean isNode = slotReader.isNode(i15);
                if (isNode) {
                    composerImpl.changeListWriter.endNodeMovement();
                    composerImpl.changeListWriter.moveDown(slotReader.node(i15));
                }
                i14 += reportFreeMovableContent$reportGroup(composerImpl, i11, i15, isNode || z11, isNode ? 0 : i13 + i14);
                if (isNode) {
                    composerImpl.changeListWriter.endNodeMovement();
                    composerImpl.changeListWriter.moveUp();
                }
            }
            if (slotReader.isNode(i12)) {
                return 1;
            }
            return i14;
        }
        int groupKey = slotReader.groupKey(i12);
        Object groupObjectKey = slotReader.groupObjectKey(i12);
        if (groupKey == 126665345 && (groupObjectKey instanceof MovableContent)) {
            MovableContentStateReference reportFreeMovableContent$movableContentReferenceFor = reportFreeMovableContent$movableContentReferenceFor(composerImpl, i12);
            if (reportFreeMovableContent$movableContentReferenceFor != null) {
                composerImpl.parentContext.deletedMovableContent$runtime_release(reportFreeMovableContent$movableContentReferenceFor);
                composerImpl.changeListWriter.recordSlotEditing();
                composerImpl.changeListWriter.releaseMovableGroupAtCurrent(composerImpl.getComposition(), composerImpl.parentContext, reportFreeMovableContent$movableContentReferenceFor);
            }
            if (!z11 || i12 == i11) {
                return slotReader.nodeCount(i12);
            }
            composerImpl.changeListWriter.endNodeMovementAndDeleteNode(i13, i12);
            return 0;
        }
        if (groupKey != 206 || !g0.g(groupObjectKey, ComposerKt.getReference())) {
            if (slotReader.isNode(i12)) {
                return 1;
            }
            return slotReader.nodeCount(i12);
        }
        Object groupGet = slotReader.groupGet(i12, 0);
        CompositionContextHolder compositionContextHolder = groupGet instanceof CompositionContextHolder ? (CompositionContextHolder) groupGet : null;
        if (compositionContextHolder != null) {
            for (ComposerImpl composerImpl2 : compositionContextHolder.getRef().getComposers()) {
                composerImpl2.reportAllMovableContent();
                composerImpl.parentContext.reportRemovedComposition$runtime_release(composerImpl2.getComposition());
            }
        }
        return slotReader.nodeCount(i12);
    }

    private final void skipGroup() {
        this.groupNodeCount += this.reader.skipGroup();
    }

    private final void skipReaderToGroupEnd() {
        this.groupNodeCount = this.reader.getParentNodes();
        this.reader.skipToGroupEnd();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0076  */
    /* renamed from: start-BaiHCIY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m1891startBaiHCIY(int r11, java.lang.Object r12, int r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.m1891startBaiHCIY(int, java.lang.Object, int, java.lang.Object):void");
    }

    private final void startGroup(int i11) {
        m1891startBaiHCIY(i11, null, GroupKind.Companion.m1905getGroupULZAiWs(), null);
    }

    private final void startReaderGroup(boolean z11, Object obj) {
        if (z11) {
            this.reader.startNode();
            return;
        }
        if (obj != null && this.reader.getGroupAux() != obj) {
            this.changeListWriter.updateAuxData(obj);
        }
        this.reader.startGroup();
    }

    private final void startRoot() {
        int asInt;
        this.rGroupIndex = 0;
        this.reader = this.slotTable.openReader();
        startGroup(100);
        this.parentContext.startComposing$runtime_release();
        this.parentProvider = this.parentContext.getCompositionLocalScope$runtime_release();
        IntStack intStack = this.providersInvalidStack;
        asInt = ComposerKt.asInt(this.providersInvalid);
        intStack.push(asInt);
        this.providersInvalid = changed(this.parentProvider);
        this.providerCache = null;
        if (!this.forceRecomposeScopes) {
            this.forceRecomposeScopes = this.parentContext.getCollectingParameterInformation$runtime_release();
        }
        if (!this.sourceMarkersEnabled) {
            this.sourceMarkersEnabled = this.parentContext.getCollectingSourceInformation$runtime_release();
        }
        Set<CompositionData> set = (Set) CompositionLocalMapKt.read(this.parentProvider, InspectionTablesKt.getLocalInspectionTables());
        if (set != null) {
            set.add(getCompositionData());
            this.parentContext.recordInspectionTable$runtime_release(set);
        }
        startGroup(this.parentContext.getCompoundHashKey$runtime_release());
    }

    private final void updateCompoundKeyWhenWeEnterGroup(int i11, int i12, Object obj, Object obj2) {
        if (obj != null) {
            if (obj instanceof Enum) {
                this.compoundKeyHash = Integer.rotateLeft(((Enum) obj).ordinal() ^ Integer.rotateLeft(getCompoundKeyHash(), 3), 3);
                return;
            } else {
                this.compoundKeyHash = Integer.rotateLeft(obj.hashCode() ^ Integer.rotateLeft(getCompoundKeyHash(), 3), 3);
                return;
            }
        }
        if (obj2 == null || i11 != 207 || g0.g(obj2, Composer.Companion.getEmpty())) {
            this.compoundKeyHash = Integer.rotateLeft(i11 ^ Integer.rotateLeft(getCompoundKeyHash(), 3), 3) ^ i12;
        } else {
            this.compoundKeyHash = Integer.rotateLeft(obj2.hashCode() ^ Integer.rotateLeft(getCompoundKeyHash(), 3), 3) ^ i12;
        }
    }

    private final void updateCompoundKeyWhenWeEnterGroupKeyHash(int i11, int i12) {
        this.compoundKeyHash = Integer.rotateLeft(i11 ^ Integer.rotateLeft(getCompoundKeyHash(), 3), 3) ^ i12;
    }

    private final void updateCompoundKeyWhenWeExitGroup(int i11, int i12, Object obj, Object obj2) {
        if (obj != null) {
            if (obj instanceof Enum) {
                int ordinal = ((Enum) obj).ordinal();
                this.compoundKeyHash = Integer.rotateRight(Integer.hashCode(ordinal) ^ Integer.rotateRight(getCompoundKeyHash(), 3), 3);
                return;
            } else {
                int hashCode = obj.hashCode();
                this.compoundKeyHash = Integer.rotateRight(Integer.hashCode(hashCode) ^ Integer.rotateRight(getCompoundKeyHash(), 3), 3);
                return;
            }
        }
        if (obj2 == null || i11 != 207 || g0.g(obj2, Composer.Companion.getEmpty())) {
            this.compoundKeyHash = Integer.rotateRight(Integer.hashCode(i11) ^ Integer.rotateRight(i12 ^ getCompoundKeyHash(), 3), 3);
        } else {
            int hashCode2 = obj2.hashCode();
            this.compoundKeyHash = Integer.rotateRight(Integer.hashCode(hashCode2) ^ Integer.rotateRight(i12 ^ getCompoundKeyHash(), 3), 3);
        }
    }

    private final void updateCompoundKeyWhenWeExitGroupKeyHash(int i11, int i12) {
        this.compoundKeyHash = Integer.rotateRight(Integer.hashCode(i11) ^ Integer.rotateRight(i12 ^ getCompoundKeyHash(), 3), 3);
    }

    private final void updateNodeCount(int i11, int i12) {
        if (updatedNodeCount(i11) != i12) {
            if (i11 < 0) {
                MutableIntIntMap mutableIntIntMap = this.nodeCountVirtualOverrides;
                if (mutableIntIntMap == null) {
                    mutableIntIntMap = new MutableIntIntMap(0, 1, null);
                    this.nodeCountVirtualOverrides = mutableIntIntMap;
                }
                mutableIntIntMap.set(i11, i12);
                return;
            }
            int[] iArr = this.nodeCountOverrides;
            if (iArr == null) {
                int[] iArr2 = new int[this.reader.getSize()];
                q.T1(iArr2, -1, 0, 0, 6, null);
                this.nodeCountOverrides = iArr2;
                iArr = iArr2;
            }
            iArr[i11] = i12;
        }
    }

    private final void updateNodeCountOverrides(int i11, int i12) {
        int updatedNodeCount = updatedNodeCount(i11);
        if (updatedNodeCount != i12) {
            int i13 = i12 - updatedNodeCount;
            int m1939getSizeimpl = Stack.m1939getSizeimpl(this.pendingStack) - 1;
            while (i11 != -1) {
                int updatedNodeCount2 = updatedNodeCount(i11) + i13;
                updateNodeCount(i11, updatedNodeCount2);
                int i14 = m1939getSizeimpl;
                while (true) {
                    if (-1 < i14) {
                        Pending pending = (Pending) Stack.m1944peekimpl(this.pendingStack, i14);
                        if (pending != null && pending.updateNodeCount(i11, updatedNodeCount2)) {
                            m1939getSizeimpl = i14 - 1;
                            break;
                        }
                        i14--;
                    } else {
                        break;
                    }
                }
                if (i11 < 0) {
                    i11 = this.reader.getParent();
                } else if (this.reader.isNode(i11)) {
                    return;
                } else {
                    i11 = this.reader.parent(i11);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.runtime.PersistentCompositionLocalMap, java.lang.Object] */
    private final PersistentCompositionLocalMap updateProviderMapGroup(PersistentCompositionLocalMap persistentCompositionLocalMap, PersistentCompositionLocalMap persistentCompositionLocalMap2) {
        PersistentMap.Builder<CompositionLocal<Object>, ValueHolder<Object>> builder2 = persistentCompositionLocalMap.builder2();
        builder2.putAll(persistentCompositionLocalMap2);
        ?? build2 = builder2.build2();
        startGroup(204, ComposerKt.getProviderMaps());
        updateSlot(build2);
        updateSlot(persistentCompositionLocalMap2);
        endGroup();
        return build2;
    }

    private final void updateSlot(Object obj) {
        nextSlot();
        updateValue(obj);
    }

    private final int updatedNodeCount(int i11) {
        int i12;
        if (i11 >= 0) {
            int[] iArr = this.nodeCountOverrides;
            return (iArr == null || (i12 = iArr[i11]) < 0) ? this.reader.nodeCount(i11) : i12;
        }
        MutableIntIntMap mutableIntIntMap = this.nodeCountVirtualOverrides;
        if (mutableIntIntMap == null || !mutableIntIntMap.containsKey(i11)) {
            return 0;
        }
        return mutableIntIntMap.get(i11);
    }

    private final void validateNodeExpected() {
        if (!this.nodeExpected) {
            ComposerKt.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.nodeExpected = false;
    }

    private final void validateNodeNotExpected() {
        if (this.nodeExpected) {
            ComposerKt.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected");
        }
    }

    private final <R> R withReader(SlotReader slotReader, x00.a<? extends R> aVar) {
        SlotReader reader$runtime_release = getReader$runtime_release();
        int[] iArr = this.nodeCountOverrides;
        MutableIntObjectMap mutableIntObjectMap = this.providerUpdates;
        this.nodeCountOverrides = null;
        this.providerUpdates = null;
        try {
            setReader$runtime_release(slotReader);
            return aVar.invoke();
        } finally {
            d0.d(1);
            setReader$runtime_release(reader$runtime_release);
            this.nodeCountOverrides = iArr;
            this.providerUpdates = mutableIntObjectMap;
            d0.c(1);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public <V, T> void apply(V v11, @k p<? super T, ? super V, g2> pVar) {
        if (getInserting()) {
            this.insertFixups.updateNode(v11, pVar);
        } else {
            this.changeListWriter.updateNode(v11, pVar);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @k
    public CompositionContext buildContext() {
        startGroup(206, ComposerKt.getReference());
        if (getInserting()) {
            SlotWriter.markGroup$default(this.writer, 0, 1, null);
        }
        Object nextSlot = nextSlot();
        CompositionContextHolder compositionContextHolder = nextSlot instanceof CompositionContextHolder ? (CompositionContextHolder) nextSlot : null;
        if (compositionContextHolder == null) {
            int compoundKeyHash = getCompoundKeyHash();
            boolean z11 = this.forceRecomposeScopes;
            boolean z12 = this.sourceMarkersEnabled;
            ControlledComposition composition = getComposition();
            CompositionImpl compositionImpl = composition instanceof CompositionImpl ? (CompositionImpl) composition : null;
            compositionContextHolder = new CompositionContextHolder(new CompositionContextImpl(compoundKeyHash, z11, z12, compositionImpl != null ? compositionImpl.getObserverHolder$runtime_release() : null));
            updateValue(compositionContextHolder);
        }
        compositionContextHolder.getRef().updateCompositionLocalScope(currentCompositionLocalScope());
        endGroup();
        return compositionContextHolder.getRef();
    }

    @ComposeCompilerApi
    public final <T> T cache(boolean z11, @k x00.a<? extends T> aVar) {
        T t11 = (T) nextSlotForCache();
        if (t11 != Composer.Companion.getEmpty() && !z11) {
            return t11;
        }
        T invoke = aVar.invoke();
        updateCachedValue(invoke);
        return invoke;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(@l Object obj) {
        if (g0.g(nextSlot(), obj)) {
            return false;
        }
        updateValue(obj);
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changedInstance(@l Object obj) {
        if (nextSlot() == obj) {
            return false;
        }
        updateValue(obj);
        return true;
    }

    public final void changesApplied$runtime_release() {
        this.providerUpdates = null;
    }

    @Override // androidx.compose.runtime.Composer
    public void collectParameterInformation() {
        this.forceRecomposeScopes = true;
        this.sourceMarkersEnabled = true;
        this.slotTable.collectSourceInformation();
        this.insertTable.collectSourceInformation();
        this.writer.updateToTableMaps();
    }

    /* renamed from: composeContent--ZbOJvo$runtime_release, reason: not valid java name */
    public final void m1892composeContentZbOJvo$runtime_release(@k MutableScatterMap<Object, Object> mutableScatterMap, @k p<? super Composer, ? super Integer, g2> pVar, @l ShouldPauseCallback shouldPauseCallback) {
        if (!this.changes.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Expected applyChanges() to have been called");
        }
        this.shouldPauseCallback = shouldPauseCallback;
        try {
            m1890doComposeaFTiNEg(mutableScatterMap, pVar);
        } finally {
            this.shouldPauseCallback = null;
        }
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public <T> T consume(@k CompositionLocal<T> compositionLocal) {
        return (T) CompositionLocalMapKt.read(currentCompositionLocalScope(), compositionLocal);
    }

    @Override // androidx.compose.runtime.Composer
    public <T> void createNode(@k x00.a<? extends T> aVar) {
        validateNodeExpected();
        if (!getInserting()) {
            ComposerKt.composeImmediateRuntimeError("createNode() can only be called when inserting");
        }
        int peek = this.parentStateStack.peek();
        SlotWriter slotWriter = this.writer;
        Anchor anchor = slotWriter.anchor(slotWriter.getParent());
        this.groupNodeCount++;
        this.insertFixups.createAndInsertNode(aVar, peek, anchor);
    }

    public final void deactivate$runtime_release() {
        Stack.m1934clearimpl(this.invalidateStack);
        this.invalidations.clear();
        this.changes.clear();
        this.providerUpdates = null;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void deactivateToEndGroup(boolean z11) {
        if (!(this.groupNodeCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (getInserting()) {
            return;
        }
        if (!z11) {
            skipReaderToGroupEnd();
            return;
        }
        int currentGroup = this.reader.getCurrentGroup();
        int currentEnd = this.reader.getCurrentEnd();
        this.changeListWriter.deactivateCurrentGroup();
        ComposerKt.removeRange(this.invalidations, currentGroup, currentEnd);
        this.reader.skipToGroupEnd();
    }

    @Override // androidx.compose.runtime.Composer
    public void disableReusing() {
        this.reusing = false;
    }

    @Override // androidx.compose.runtime.Composer
    public void disableSourceInformation() {
        this.sourceMarkersEnabled = false;
    }

    public final void dispose$runtime_release() {
        Trace trace = Trace.INSTANCE;
        Object beginSection = trace.beginSection("Compose:Composer.dispose");
        try {
            this.parentContext.unregisterComposer$runtime_release(this);
            deactivate$runtime_release();
            getApplier().clear();
            this.isDisposed = true;
            g2 g2Var = g2.f100423a;
            trace.endSection(beginSection);
        } catch (Throwable th2) {
            Trace.INSTANCE.endSection(beginSection);
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void enableReusing() {
        this.reusing = this.reusingGroup >= 0;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endDefaults() {
        endGroup();
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release == null || !currentRecomposeScope$runtime_release.getUsed()) {
            return;
        }
        currentRecomposeScope$runtime_release.setDefaultsInScope(true);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endMovableGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    public void endNode() {
        end(true);
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void endProvider() {
        boolean asBool;
        endGroup();
        endGroup();
        asBool = ComposerKt.asBool(this.providersInvalidStack.pop());
        this.providersInvalid = asBool;
        this.providerCache = null;
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void endProviders() {
        boolean asBool;
        endGroup();
        endGroup();
        asBool = ComposerKt.asBool(this.providersInvalidStack.pop());
        this.providersInvalid = asBool;
        this.providerCache = null;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endReplaceGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endReplaceableGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    @l
    @ComposeCompilerApi
    public ScopeUpdateScope endRestartGroup() {
        Anchor anchor;
        RecomposeScopeImpl recomposeScopeImpl = null;
        RecomposeScopeImpl recomposeScopeImpl2 = Stack.m1942isNotEmptyimpl(this.invalidateStack) ? (RecomposeScopeImpl) Stack.m1945popimpl(this.invalidateStack) : null;
        if (recomposeScopeImpl2 != null) {
            recomposeScopeImpl2.setRequiresRecompose(false);
            x00.l<Composition, g2> end = recomposeScopeImpl2.end(this.compositionToken);
            if (end != null) {
                this.changeListWriter.endCompositionScope(end, getComposition());
            }
            if (recomposeScopeImpl2.getResuming()) {
                recomposeScopeImpl2.setResuming(false);
                this.changeListWriter.endResumingScope(recomposeScopeImpl2);
            }
        }
        if (recomposeScopeImpl2 != null && !recomposeScopeImpl2.getSkipped$runtime_release() && (recomposeScopeImpl2.getUsed() || this.forceRecomposeScopes)) {
            if (recomposeScopeImpl2.getAnchor() == null) {
                if (getInserting()) {
                    SlotWriter slotWriter = this.writer;
                    anchor = slotWriter.anchor(slotWriter.getParent());
                } else {
                    SlotReader slotReader = this.reader;
                    anchor = slotReader.anchor(slotReader.getParent());
                }
                recomposeScopeImpl2.setAnchor(anchor);
            }
            recomposeScopeImpl2.setDefaultsInvalid(false);
            recomposeScopeImpl = recomposeScopeImpl2;
        }
        end(false);
        return recomposeScopeImpl;
    }

    @Override // androidx.compose.runtime.Composer
    public void endReusableGroup() {
        if (this.reusing && this.reader.getParent() == this.reusingGroup) {
            this.reusingGroup = -1;
            this.reusing = false;
        }
        end(false);
    }

    public final void endReuseFromRoot() {
        if (!(!this.isComposing && this.reusingGroup == 100)) {
            PreconditionsKt.throwIllegalArgumentException("Cannot disable reuse from root if it was caused by other groups");
        }
        this.reusingGroup = -1;
        this.reusing = false;
    }

    @Override // androidx.compose.runtime.Composer
    public void endToMarker(int i11) {
        if (i11 < 0) {
            int i12 = -i11;
            SlotWriter slotWriter = this.writer;
            while (true) {
                int parent = slotWriter.getParent();
                if (parent <= i12) {
                    return;
                } else {
                    end(slotWriter.isNode(parent));
                }
            }
        } else {
            if (getInserting()) {
                SlotWriter slotWriter2 = this.writer;
                while (getInserting()) {
                    end(slotWriter2.isNode(slotWriter2.getParent()));
                }
            }
            SlotReader slotReader = this.reader;
            while (true) {
                int parent2 = slotReader.getParent();
                if (parent2 <= i11) {
                    return;
                } else {
                    end(slotReader.isNode(parent2));
                }
            }
        }
    }

    public final boolean forceRecomposeScopes$runtime_release() {
        if (this.forceRecomposeScopes) {
            return false;
        }
        this.forceRecomposeScopes = true;
        this.forciblyRecompose = true;
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @k
    public Applier<?> getApplier() {
        return this.applier;
    }

    @Override // androidx.compose.runtime.Composer
    @k
    @o
    public d getApplyCoroutineContext() {
        return this.parentContext.getEffectCoroutineContext();
    }

    public final boolean getAreChildrenComposing$runtime_release() {
        return this.childrenComposing > 0;
    }

    public final int getChangeCount$runtime_release() {
        return this.changes.getSize();
    }

    @Override // androidx.compose.runtime.Composer
    @k
    public ControlledComposition getComposition() {
        return this.composition;
    }

    @Override // androidx.compose.runtime.Composer
    @k
    public CompositionData getCompositionData() {
        CompositionData compositionData = this._compositionData;
        if (compositionData != null) {
            return compositionData;
        }
        CompositionDataImpl compositionDataImpl = new CompositionDataImpl(getComposition());
        this._compositionData = compositionDataImpl;
        return compositionDataImpl;
    }

    @Override // androidx.compose.runtime.Composer
    public int getCompoundKeyHash() {
        return this.compoundKeyHash;
    }

    @Override // androidx.compose.runtime.Composer
    @k
    public CompositionLocalMap getCurrentCompositionLocalMap() {
        return currentCompositionLocalScope();
    }

    @Override // androidx.compose.runtime.Composer
    public int getCurrentMarker() {
        return getInserting() ? -this.writer.getParent() : this.reader.getParent();
    }

    @l
    public final RecomposeScopeImpl getCurrentRecomposeScope$runtime_release() {
        ArrayList<Object> arrayList = this.invalidateStack;
        if (this.childrenComposing == 0 && Stack.m1942isNotEmptyimpl(arrayList)) {
            return (RecomposeScopeImpl) Stack.m1943peekimpl(arrayList);
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getDefaultsInvalid() {
        RecomposeScopeImpl currentRecomposeScope$runtime_release;
        return !getSkipping() || this.providersInvalid || ((currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release()) != null && currentRecomposeScope$runtime_release.getDefaultsInvalid());
    }

    @l
    public final ChangeList getDeferredChanges$runtime_release() {
        return this.deferredChanges;
    }

    public final boolean getHasInvalidations() {
        return !this.invalidations.isEmpty();
    }

    public final boolean getHasPendingChanges$runtime_release() {
        return this.changes.isNotEmpty();
    }

    @k
    public final SlotTable getInsertTable$runtime_release() {
        return this.insertTable;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getInserting() {
        return this.inserting;
    }

    @k
    public final SlotReader getReader$runtime_release() {
        return this.reader;
    }

    @Override // androidx.compose.runtime.Composer
    @l
    public RecomposeScope getRecomposeScope() {
        return getCurrentRecomposeScope$runtime_release();
    }

    @Override // androidx.compose.runtime.Composer
    @l
    public Object getRecomposeScopeIdentity() {
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release != null) {
            return currentRecomposeScope$runtime_release.getAnchor();
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getSkipping() {
        RecomposeScopeImpl currentRecomposeScope$runtime_release;
        return (getInserting() || this.reusing || this.providersInvalid || (currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release()) == null || currentRecomposeScope$runtime_release.getRequiresRecompose() || this.forciblyRecompose) ? false : true;
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void insertMovableContent(@k MovableContent<?> movableContent, @l Object obj) {
        g0.n(movableContent, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        invokeMovableContentLambda(movableContent, currentCompositionLocalScope(), obj, false);
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void insertMovableContentReferences(@k List<Pair<MovableContentStateReference, MovableContentStateReference>> list) {
        try {
            insertMovableContentGuarded(list);
            cleanUpCompose();
        } catch (Throwable th2) {
            abortRoot();
            throw th2;
        }
    }

    public final boolean isComposing$runtime_release() {
        return this.isComposing;
    }

    public final boolean isDisposed$runtime_release() {
        return this.isDisposed;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    @k
    public Object joinKey(@l Object obj, @l Object obj2) {
        Object key;
        key = ComposerKt.getKey(this.reader.getGroupObjectKey(), obj, obj2);
        return key == null ? new JoinedKey(obj, obj2) : key;
    }

    @l
    @v0
    public final Object nextSlot() {
        if (getInserting()) {
            validateNodeNotExpected();
            return Composer.Companion.getEmpty();
        }
        Object next = this.reader.next();
        return (!this.reusing || (next instanceof ReusableRememberObserver)) ? next : Composer.Companion.getEmpty();
    }

    @l
    @v0
    public final Object nextSlotForCache() {
        if (getInserting()) {
            validateNodeNotExpected();
            return Composer.Companion.getEmpty();
        }
        Object next = this.reader.next();
        return (!this.reusing || (next instanceof ReusableRememberObserver)) ? next instanceof RememberObserverHolder ? ((RememberObserverHolder) next).getWrapped() : next : Composer.Companion.getEmpty();
    }

    @o
    public final int parentKey$runtime_release() {
        if (getInserting()) {
            SlotWriter slotWriter = this.writer;
            return slotWriter.groupKey(slotWriter.getParent());
        }
        SlotReader slotReader = this.reader;
        return slotReader.groupKey(slotReader.getParent());
    }

    public final void prepareCompose$runtime_release(@k x00.a<g2> aVar) {
        if (this.isComposing) {
            ComposerKt.composeImmediateRuntimeError("Preparing a composition while composing is not supported");
        }
        this.isComposing = true;
        try {
            aVar.invoke();
        } finally {
            this.isComposing = false;
        }
    }

    /* renamed from: recompose-aFTiNEg$runtime_release, reason: not valid java name */
    public final boolean m1893recomposeaFTiNEg$runtime_release(@k MutableScatterMap<Object, Object> mutableScatterMap, @l ShouldPauseCallback shouldPauseCallback) {
        if (!this.changes.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Expected applyChanges() to have been called");
        }
        if (ScopeMap.m2056getSizeimpl(mutableScatterMap) <= 0 && this.invalidations.isEmpty() && !this.forciblyRecompose) {
            return false;
        }
        this.shouldPauseCallback = shouldPauseCallback;
        try {
            m1890doComposeaFTiNEg(mutableScatterMap, null);
            this.shouldPauseCallback = null;
            return this.changes.isNotEmpty();
        } catch (Throwable th2) {
            this.shouldPauseCallback = null;
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void recordSideEffect(@k x00.a<g2> aVar) {
        this.changeListWriter.sideEffect(aVar);
    }

    @Override // androidx.compose.runtime.Composer
    public void recordUsed(@k RecomposeScope recomposeScope) {
        RecomposeScopeImpl recomposeScopeImpl = recomposeScope instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) recomposeScope : null;
        if (recomposeScopeImpl == null) {
            return;
        }
        recomposeScopeImpl.setUsed(true);
    }

    @Override // androidx.compose.runtime.Composer
    @l
    public Object rememberedValue() {
        return nextSlotForCache();
    }

    public final void setDeferredChanges$runtime_release(@l ChangeList changeList) {
        this.deferredChanges = changeList;
    }

    public final void setInsertTable$runtime_release(@k SlotTable slotTable) {
        this.insertTable = slotTable;
    }

    public final void setReader$runtime_release(@k SlotReader slotReader) {
        this.reader = slotReader;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean shouldExecute(boolean z11, int i11) {
        RecomposeScopeImpl currentRecomposeScope$runtime_release;
        if ((i11 & 1) != 0 || (!getInserting() && !this.reusing)) {
            return z11 || !getSkipping();
        }
        ShouldPauseCallback shouldPauseCallback = this.shouldPauseCallback;
        if (shouldPauseCallback == null || (currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release()) == null || !shouldPauseCallback.shouldPause()) {
            return true;
        }
        currentRecomposeScope$runtime_release.setUsed(true);
        currentRecomposeScope$runtime_release.setReusing(this.reusing);
        currentRecomposeScope$runtime_release.setPaused(true);
        this.changeListWriter.rememberPausingScope(currentRecomposeScope$runtime_release);
        this.parentContext.reportPausedScope$runtime_release(currentRecomposeScope$runtime_release);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c3  */
    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void skipCurrentGroup() {
        /*
            r9 = this;
            java.util.List<androidx.compose.runtime.Invalidation> r0 = r9.invalidations
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lc
            r9.skipGroup()
            return
        Lc:
            androidx.compose.runtime.SlotReader r0 = r9.reader
            int r1 = r0.getGroupKey()
            java.lang.Object r2 = r0.getGroupObjectKey()
            java.lang.Object r3 = r0.getGroupAux()
            int r4 = r9.rGroupIndex
            r5 = 207(0xcf, float:2.9E-43)
            r6 = 3
            if (r2 != 0) goto L57
            if (r3 == 0) goto L46
            if (r1 != r5) goto L46
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r7 = r7.getEmpty()
            boolean r7 = kotlin.jvm.internal.g0.g(r3, r7)
            if (r7 != 0) goto L46
            int r7 = r3.hashCode()
            int r8 = r9.getCompoundKeyHash()
            int r8 = java.lang.Integer.rotateLeft(r8, r6)
            r7 = r7 ^ r8
            int r7 = java.lang.Integer.rotateLeft(r7, r6)
            r7 = r7 ^ r4
            r9.compoundKeyHash = r7
            goto L75
        L46:
            int r7 = r9.getCompoundKeyHash()
            int r7 = java.lang.Integer.rotateLeft(r7, r6)
            r7 = r7 ^ r1
            int r7 = java.lang.Integer.rotateLeft(r7, r6)
            r7 = r7 ^ r4
        L54:
            r9.compoundKeyHash = r7
            goto L75
        L57:
            boolean r7 = r2 instanceof java.lang.Enum
            if (r7 == 0) goto L70
            r7 = r2
            java.lang.Enum r7 = (java.lang.Enum) r7
            int r7 = r7.ordinal()
        L62:
            int r8 = r9.getCompoundKeyHash()
            int r8 = java.lang.Integer.rotateLeft(r8, r6)
            r7 = r7 ^ r8
            int r7 = java.lang.Integer.rotateLeft(r7, r6)
            goto L54
        L70:
            int r7 = r2.hashCode()
            goto L62
        L75:
            boolean r7 = r0.isNode()
            r8 = 0
            r9.startReaderGroup(r7, r8)
            r9.recomposeToGroupEnd()
            r0.endGroup()
            if (r2 != 0) goto Lc3
            if (r3 == 0) goto Lae
            if (r1 != r5) goto Lae
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            boolean r0 = kotlin.jvm.internal.g0.g(r3, r0)
            if (r0 != 0) goto Lae
            int r0 = r3.hashCode()
            int r1 = r9.getCompoundKeyHash()
            r1 = r1 ^ r4
            int r1 = java.lang.Integer.rotateRight(r1, r6)
            int r0 = java.lang.Integer.hashCode(r0)
            r0 = r0 ^ r1
            int r0 = java.lang.Integer.rotateRight(r0, r6)
            r9.compoundKeyHash = r0
            return
        Lae:
            int r0 = r9.getCompoundKeyHash()
            r0 = r0 ^ r4
            int r0 = java.lang.Integer.rotateRight(r0, r6)
            int r1 = java.lang.Integer.hashCode(r1)
            r0 = r0 ^ r1
            int r0 = java.lang.Integer.rotateRight(r0, r6)
            r9.compoundKeyHash = r0
            return
        Lc3:
            boolean r0 = r2 instanceof java.lang.Enum
            if (r0 == 0) goto Le1
            java.lang.Enum r2 = (java.lang.Enum) r2
            int r0 = r2.ordinal()
            int r1 = r9.getCompoundKeyHash()
            int r1 = java.lang.Integer.rotateRight(r1, r6)
            int r0 = java.lang.Integer.hashCode(r0)
            r0 = r0 ^ r1
            int r0 = java.lang.Integer.rotateRight(r0, r6)
            r9.compoundKeyHash = r0
            return
        Le1:
            int r0 = r2.hashCode()
            int r1 = r9.getCompoundKeyHash()
            int r1 = java.lang.Integer.rotateRight(r1, r6)
            int r0 = java.lang.Integer.hashCode(r0)
            r0 = r0 ^ r1
            int r0 = java.lang.Integer.rotateRight(r0, r6)
            r9.compoundKeyHash = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.skipCurrentGroup():void");
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void skipToGroupEnd() {
        if (!(this.groupNodeCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (getInserting()) {
            return;
        }
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release != null) {
            currentRecomposeScope$runtime_release.scopeSkipped();
        }
        if (this.invalidations.isEmpty()) {
            skipReaderToGroupEnd();
        } else {
            recomposeToGroupEnd();
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformation(@k String str) {
        if (getInserting() && this.sourceMarkersEnabled) {
            this.writer.recordGroupSourceInformation(str);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerEnd() {
        if (getInserting() && this.sourceMarkersEnabled) {
            this.writer.recordGrouplessCallSourceInformationEnd();
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerStart(int i11, @k String str) {
        if (getInserting() && this.sourceMarkersEnabled) {
            this.writer.recordGrouplessCallSourceInformationStart(i11, str);
        }
    }

    public final int stacksSize$runtime_release() {
        return this.entersStack.tos + Stack.m1939getSizeimpl(this.invalidateStack) + this.providersInvalidStack.tos + Stack.m1939getSizeimpl(this.pendingStack) + this.parentStateStack.tos;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startDefaults() {
        m1891startBaiHCIY(-127, null, GroupKind.Companion.m1905getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startMovableGroup(int i11, @l Object obj) {
        m1891startBaiHCIY(i11, obj, GroupKind.Companion.m1905getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    public void startNode() {
        m1891startBaiHCIY(125, null, GroupKind.Companion.m1906getNodeULZAiWs(), null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void startProvider(@k ProvidedValue<?> providedValue) {
        ValueHolder<?> valueHolder;
        int asInt;
        PersistentCompositionLocalMap currentCompositionLocalScope = currentCompositionLocalScope();
        startGroup(201, ComposerKt.getProvider());
        Object rememberedValue = rememberedValue();
        if (g0.g(rememberedValue, Composer.Companion.getEmpty())) {
            valueHolder = null;
        } else {
            g0.n(rememberedValue, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            valueHolder = (ValueHolder) rememberedValue;
        }
        CompositionLocal<?> compositionLocal = providedValue.getCompositionLocal();
        g0.n(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        g0.n(providedValue, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
        ValueHolder<?> updatedStateOf$runtime_release = compositionLocal.updatedStateOf$runtime_release(providedValue, valueHolder);
        boolean g11 = g0.g(updatedStateOf$runtime_release, valueHolder);
        if (!g11) {
            updateRememberedValue(updatedStateOf$runtime_release);
        }
        boolean z11 = true;
        boolean z12 = false;
        if (getInserting()) {
            if (providedValue.getCanOverride() || !CompositionLocalMapKt.contains(currentCompositionLocalScope, compositionLocal)) {
                currentCompositionLocalScope = currentCompositionLocalScope.putValue(compositionLocal, updatedStateOf$runtime_release);
            }
            this.writerHasAProvider = true;
        } else {
            SlotReader slotReader = this.reader;
            Object groupAux = slotReader.groupAux(slotReader.getCurrentGroup());
            g0.n(groupAux, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            PersistentCompositionLocalMap persistentCompositionLocalMap = (PersistentCompositionLocalMap) groupAux;
            if (!(getSkipping() && g11) && (providedValue.getCanOverride() || !CompositionLocalMapKt.contains(currentCompositionLocalScope, compositionLocal))) {
                currentCompositionLocalScope = currentCompositionLocalScope.putValue(compositionLocal, updatedStateOf$runtime_release);
            } else if ((g11 && !this.providersInvalid) || !this.providersInvalid) {
                currentCompositionLocalScope = persistentCompositionLocalMap;
            }
            if (!this.reusing && persistentCompositionLocalMap == currentCompositionLocalScope) {
                z11 = false;
            }
            z12 = z11;
        }
        if (z12 && !getInserting()) {
            recordProviderUpdate(currentCompositionLocalScope);
        }
        IntStack intStack = this.providersInvalidStack;
        asInt = ComposerKt.asInt(this.providersInvalid);
        intStack.push(asInt);
        this.providersInvalid = z12;
        this.providerCache = currentCompositionLocalScope;
        m1891startBaiHCIY(202, ComposerKt.getCompositionLocalMap(), GroupKind.Companion.m1905getGroupULZAiWs(), currentCompositionLocalScope);
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void startProviders(@k ProvidedValue<?>[] providedValueArr) {
        PersistentCompositionLocalMap updateProviderMapGroup;
        int asInt;
        PersistentCompositionLocalMap currentCompositionLocalScope = currentCompositionLocalScope();
        startGroup(201, ComposerKt.getProvider());
        boolean z11 = true;
        boolean z12 = false;
        if (getInserting()) {
            updateProviderMapGroup = updateProviderMapGroup(currentCompositionLocalScope, CompositionLocalMapKt.updateCompositionMap$default(providedValueArr, currentCompositionLocalScope, null, 4, null));
            this.writerHasAProvider = true;
        } else {
            Object groupGet = this.reader.groupGet(0);
            g0.n(groupGet, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            PersistentCompositionLocalMap persistentCompositionLocalMap = (PersistentCompositionLocalMap) groupGet;
            Object groupGet2 = this.reader.groupGet(1);
            g0.n(groupGet2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            PersistentCompositionLocalMap persistentCompositionLocalMap2 = (PersistentCompositionLocalMap) groupGet2;
            PersistentCompositionLocalMap updateCompositionMap = CompositionLocalMapKt.updateCompositionMap(providedValueArr, currentCompositionLocalScope, persistentCompositionLocalMap2);
            if (getSkipping() && !this.reusing && g0.g(persistentCompositionLocalMap2, updateCompositionMap)) {
                skipGroup();
                updateProviderMapGroup = persistentCompositionLocalMap;
            } else {
                updateProviderMapGroup = updateProviderMapGroup(currentCompositionLocalScope, updateCompositionMap);
                if (!this.reusing && g0.g(updateProviderMapGroup, persistentCompositionLocalMap)) {
                    z11 = false;
                }
                z12 = z11;
            }
        }
        if (z12 && !getInserting()) {
            recordProviderUpdate(updateProviderMapGroup);
        }
        IntStack intStack = this.providersInvalidStack;
        asInt = ComposerKt.asInt(this.providersInvalid);
        intStack.push(asInt);
        this.providersInvalid = z12;
        this.providerCache = updateProviderMapGroup;
        m1891startBaiHCIY(202, ComposerKt.getCompositionLocalMap(), GroupKind.Companion.m1905getGroupULZAiWs(), updateProviderMapGroup);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startReplaceGroup(int i11) {
        if (this.pending != null) {
            m1891startBaiHCIY(i11, null, GroupKind.Companion.m1905getGroupULZAiWs(), null);
            return;
        }
        validateNodeNotExpected();
        this.compoundKeyHash = this.rGroupIndex ^ Integer.rotateLeft(Integer.rotateLeft(getCompoundKeyHash(), 3) ^ i11, 3);
        this.rGroupIndex++;
        SlotReader slotReader = this.reader;
        if (getInserting()) {
            slotReader.beginEmpty();
            this.writer.startGroup(i11, Composer.Companion.getEmpty());
            enterGroup(false, null);
            return;
        }
        if (slotReader.getGroupKey() == i11 && !slotReader.getHasObjectKey()) {
            slotReader.startGroup();
            enterGroup(false, null);
            return;
        }
        if (!slotReader.isGroupEnd()) {
            int i12 = this.nodeIndex;
            int currentGroup = slotReader.getCurrentGroup();
            recordDelete();
            this.changeListWriter.removeNode(i12, slotReader.skipGroup());
            ComposerKt.removeRange(this.invalidations, currentGroup, slotReader.getCurrentGroup());
        }
        slotReader.beginEmpty();
        this.inserting = true;
        this.providerCache = null;
        ensureWriter();
        SlotWriter slotWriter = this.writer;
        slotWriter.beginInsert();
        int currentGroup2 = slotWriter.getCurrentGroup();
        slotWriter.startGroup(i11, Composer.Companion.getEmpty());
        this.insertAnchor = slotWriter.anchor(currentGroup2);
        enterGroup(false, null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startReplaceableGroup(int i11) {
        m1891startBaiHCIY(i11, null, GroupKind.Companion.m1905getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    @k
    public Composer startRestartGroup(int i11) {
        startReplaceGroup(i11);
        addRecomposeScope();
        return this;
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableGroup(int i11, @l Object obj) {
        if (!getInserting() && this.reader.getGroupKey() == i11 && !g0.g(this.reader.getGroupAux(), obj) && this.reusingGroup < 0) {
            this.reusingGroup = this.reader.getCurrentGroup();
            this.reusing = true;
        }
        m1891startBaiHCIY(i11, null, GroupKind.Companion.m1905getGroupULZAiWs(), obj);
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableNode() {
        m1891startBaiHCIY(125, null, GroupKind.Companion.m1907getReusableNodeULZAiWs(), null);
        this.nodeExpected = true;
    }

    public final void startReuseFromRoot() {
        this.reusingGroup = 100;
        this.reusing = true;
    }

    public final boolean tryImminentInvalidation$runtime_release(@k RecomposeScopeImpl recomposeScopeImpl, @l Object obj) {
        Anchor anchor = recomposeScopeImpl.getAnchor();
        if (anchor == null) {
            return false;
        }
        int indexFor = anchor.toIndexFor(this.reader.getTable$runtime_release());
        if (!this.isComposing || indexFor < this.reader.getCurrentGroup()) {
            return false;
        }
        ComposerKt.insertIfMissing(this.invalidations, indexFor, recomposeScopeImpl, obj);
        return true;
    }

    @v0
    public final void updateCachedValue(@l Object obj) {
        if (obj instanceof RememberObserver) {
            RememberObserverHolder rememberObserverHolder = new RememberObserverHolder((RememberObserver) obj, rememberObserverAnchor());
            if (getInserting()) {
                this.changeListWriter.remember(rememberObserverHolder);
            }
            this.abandonSet.add(obj);
            obj = rememberObserverHolder;
        }
        updateValue(obj);
    }

    /* renamed from: updateComposerInvalidations-RY85e9Y, reason: not valid java name */
    public final void m1894updateComposerInvalidationsRY85e9Y(@k MutableScatterMap<Object, Object> mutableScatterMap) {
        Comparator comparator;
        Object[] objArr = mutableScatterMap.keys;
        Object[] objArr2 = mutableScatterMap.values;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            int i14 = (i11 << 3) + i13;
                            Object obj = objArr[i14];
                            Object obj2 = objArr2[i14];
                            g0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                            Anchor anchor = recomposeScopeImpl.getAnchor();
                            if (anchor != null) {
                                int location$runtime_release = anchor.getLocation$runtime_release();
                                List<Invalidation> list = this.invalidations;
                                if (obj2 == ScopeInvalidated.INSTANCE) {
                                    obj2 = null;
                                }
                                list.add(new Invalidation(recomposeScopeImpl, location$runtime_release, obj2));
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        List<Invalidation> list2 = this.invalidations;
        comparator = ComposerKt.InvalidationLocationAscending;
        l0.r0(list2, comparator);
    }

    @Override // androidx.compose.runtime.Composer
    public void updateRememberedValue(@l Object obj) {
        updateCachedValue(obj);
    }

    @v0
    public final void updateValue(@l Object obj) {
        if (getInserting()) {
            this.writer.update(obj);
            return;
        }
        if (!this.reader.getHadNext()) {
            ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
            SlotReader slotReader = this.reader;
            composerChangeListWriter.appendValue(slotReader.anchor(slotReader.getParent()), obj);
            return;
        }
        int groupSlotIndex = this.reader.getGroupSlotIndex() - 1;
        if (!this.changeListWriter.getPastParent()) {
            this.changeListWriter.updateValue(obj, groupSlotIndex);
            return;
        }
        ComposerChangeListWriter composerChangeListWriter2 = this.changeListWriter;
        SlotReader slotReader2 = this.reader;
        composerChangeListWriter2.updateAnchoredValue(obj, slotReader2.anchor(slotReader2.getParent()), groupSlotIndex);
    }

    @Override // androidx.compose.runtime.Composer
    public void useNode() {
        validateNodeExpected();
        if (getInserting()) {
            ComposerKt.composeImmediateRuntimeError("useNode() called while inserting");
        }
        Object node = getNode(this.reader);
        this.changeListWriter.moveDown(node);
        if (this.reusing && (node instanceof ComposeNodeLifecycleCallback)) {
            this.changeListWriter.useNode(node);
        }
    }

    public final void verifyConsistent$runtime_release() {
        this.insertTable.verifyWellFormed();
    }

    private final void startGroup(int i11, Object obj) {
        m1891startBaiHCIY(i11, obj, GroupKind.Companion.m1905getGroupULZAiWs(), null);
    }

    private final PersistentCompositionLocalMap currentCompositionLocalScope(int i11) {
        PersistentCompositionLocalMap persistentCompositionLocalMap;
        if (getInserting() && this.writerHasAProvider) {
            int parent = this.writer.getParent();
            while (parent > 0) {
                if (this.writer.groupKey(parent) == 202 && g0.g(this.writer.groupObjectKey(parent), ComposerKt.getCompositionLocalMap())) {
                    Object groupAux = this.writer.groupAux(parent);
                    g0.n(groupAux, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    PersistentCompositionLocalMap persistentCompositionLocalMap2 = (PersistentCompositionLocalMap) groupAux;
                    this.providerCache = persistentCompositionLocalMap2;
                    return persistentCompositionLocalMap2;
                }
                parent = this.writer.parent(parent);
            }
        }
        if (this.reader.getSize() > 0) {
            while (i11 > 0) {
                if (this.reader.groupKey(i11) == 202 && g0.g(this.reader.groupObjectKey(i11), ComposerKt.getCompositionLocalMap())) {
                    MutableIntObjectMap<PersistentCompositionLocalMap> mutableIntObjectMap = this.providerUpdates;
                    if (mutableIntObjectMap == null || (persistentCompositionLocalMap = mutableIntObjectMap.get(i11)) == null) {
                        Object groupAux2 = this.reader.groupAux(i11);
                        g0.n(groupAux2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        persistentCompositionLocalMap = (PersistentCompositionLocalMap) groupAux2;
                    }
                    this.providerCache = persistentCompositionLocalMap;
                    return persistentCompositionLocalMap;
                }
                i11 = this.reader.parent(i11);
            }
        }
        PersistentCompositionLocalMap persistentCompositionLocalMap3 = this.parentProvider;
        this.providerCache = persistentCompositionLocalMap3;
        return persistentCompositionLocalMap3;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(char c11) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Character) && c11 == ((Character) nextSlot).charValue()) {
            return false;
        }
        updateValue(Character.valueOf(c11));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(byte b11) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Byte) && b11 == ((Number) nextSlot).byteValue()) {
            return false;
        }
        updateValue(Byte.valueOf(b11));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(short s11) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Short) && s11 == ((Number) nextSlot).shortValue()) {
            return false;
        }
        updateValue(Short.valueOf(s11));
        return true;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class CompositionContextHolder implements ReusableRememberObserver {
        public static final int $stable = 8;

        @k
        private final CompositionContextImpl ref;

        public CompositionContextHolder(@k CompositionContextImpl compositionContextImpl) {
            this.ref = compositionContextImpl;
        }

        @k
        public final CompositionContextImpl getRef() {
            return this.ref;
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onAbandoned() {
            this.ref.dispose();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onForgotten() {
            this.ref.dispose();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onRemembered() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$CompositionContextImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4891:1\n1855#2,2:4892\n85#3:4894\n113#3,2:4895\n1#4:4897\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$CompositionContextImpl\n*L\n4005#1:4892,2\n4074#1:4894\n4074#1:4895,2\n*E\n"})
    public final class CompositionContextImpl extends CompositionContext {
        private final boolean collectingParameterInformation;
        private final boolean collectingSourceInformation;

        @k
        private final Set<ComposerImpl> composers = new LinkedHashSet();

        @k
        private final MutableState compositionLocalScope$delegate = SnapshotStateKt.mutableStateOf(PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf(), SnapshotStateKt.referentialEqualityPolicy());
        private final int compoundHashKey;

        @l
        private Set<Set<CompositionData>> inspectionTables;

        @l
        private final CompositionObserverHolder observerHolder;

        public CompositionContextImpl(int i11, boolean z11, boolean z12, @l CompositionObserverHolder compositionObserverHolder) {
            this.compoundHashKey = i11;
            this.collectingParameterInformation = z11;
            this.collectingSourceInformation = z12;
            this.observerHolder = compositionObserverHolder;
        }

        private final PersistentCompositionLocalMap getCompositionLocalScope() {
            return (PersistentCompositionLocalMap) this.compositionLocalScope$delegate.getValue();
        }

        private final void setCompositionLocalScope(PersistentCompositionLocalMap persistentCompositionLocalMap) {
            this.compositionLocalScope$delegate.setValue(persistentCompositionLocalMap);
        }

        @Override // androidx.compose.runtime.CompositionContext
        @ComposableInferredTarget(scheme = "[0[0]]")
        public void composeInitial$runtime_release(@k ControlledComposition controlledComposition, @k p<? super Composer, ? super Integer, g2> pVar) {
            ComposerImpl.this.parentContext.composeInitial$runtime_release(controlledComposition, pVar);
        }

        @Override // androidx.compose.runtime.CompositionContext
        @ComposableInferredTarget(scheme = "[0[0]]")
        @k
        public ScatterSet<RecomposeScopeImpl> composeInitialPaused$runtime_release(@k ControlledComposition controlledComposition, @k ShouldPauseCallback shouldPauseCallback, @k p<? super Composer, ? super Integer, g2> pVar) {
            return ComposerImpl.this.parentContext.composeInitialPaused$runtime_release(controlledComposition, shouldPauseCallback, pVar);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void deletedMovableContent$runtime_release(@k MovableContentStateReference movableContentStateReference) {
            ComposerImpl.this.parentContext.deletedMovableContent$runtime_release(movableContentStateReference);
        }

        public final void dispose() {
            if (this.composers.isEmpty()) {
                return;
            }
            Set<Set<CompositionData>> set = this.inspectionTables;
            if (set != null) {
                for (ComposerImpl composerImpl : this.composers) {
                    Iterator<Set<CompositionData>> it = set.iterator();
                    while (it.hasNext()) {
                        it.next().remove(composerImpl.slotTable);
                    }
                }
            }
            this.composers.clear();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void doneComposing$runtime_release() {
            ComposerImpl composerImpl = ComposerImpl.this;
            composerImpl.childrenComposing--;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public boolean getCollectingCallByInformation$runtime_release() {
            return ComposerImpl.this.parentContext.getCollectingCallByInformation$runtime_release();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public boolean getCollectingParameterInformation$runtime_release() {
            return this.collectingParameterInformation;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public boolean getCollectingSourceInformation$runtime_release() {
            return this.collectingSourceInformation;
        }

        @k
        public final Set<ComposerImpl> getComposers() {
            return this.composers;
        }

        @Override // androidx.compose.runtime.CompositionContext
        @k
        public Composition getComposition$runtime_release() {
            return ComposerImpl.this.getComposition();
        }

        @Override // androidx.compose.runtime.CompositionContext
        @k
        public PersistentCompositionLocalMap getCompositionLocalScope$runtime_release() {
            return getCompositionLocalScope();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public int getCompoundHashKey$runtime_release() {
            return this.compoundHashKey;
        }

        @Override // androidx.compose.runtime.CompositionContext
        @k
        public d getEffectCoroutineContext() {
            return ComposerImpl.this.parentContext.getEffectCoroutineContext();
        }

        @l
        public final Set<Set<CompositionData>> getInspectionTables() {
            return this.inspectionTables;
        }

        @Override // androidx.compose.runtime.CompositionContext
        @l
        public CompositionObserverHolder getObserverHolder$runtime_release() {
            return this.observerHolder;
        }

        @Override // androidx.compose.runtime.CompositionContext
        @k
        public d getRecomposeCoroutineContext$runtime_release() {
            return CompositionKt.getRecomposeCoroutineContext(ComposerImpl.this.getComposition());
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void insertMovableContent$runtime_release(@k MovableContentStateReference movableContentStateReference) {
            ComposerImpl.this.parentContext.insertMovableContent$runtime_release(movableContentStateReference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidate$runtime_release(@k ControlledComposition controlledComposition) {
            ComposerImpl.this.parentContext.invalidate$runtime_release(ComposerImpl.this.getComposition());
            ComposerImpl.this.parentContext.invalidate$runtime_release(controlledComposition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidateScope$runtime_release(@k RecomposeScopeImpl recomposeScopeImpl) {
            ComposerImpl.this.parentContext.invalidateScope$runtime_release(recomposeScopeImpl);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void movableContentStateReleased$runtime_release(@k MovableContentStateReference movableContentStateReference, @k MovableContentState movableContentState, @k Applier<?> applier) {
            ComposerImpl.this.parentContext.movableContentStateReleased$runtime_release(movableContentStateReference, movableContentState, applier);
        }

        @Override // androidx.compose.runtime.CompositionContext
        @l
        public MovableContentState movableContentStateResolve$runtime_release(@k MovableContentStateReference movableContentStateReference) {
            return ComposerImpl.this.parentContext.movableContentStateResolve$runtime_release(movableContentStateReference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        @k
        public ScatterSet<RecomposeScopeImpl> recomposePaused$runtime_release(@k ControlledComposition controlledComposition, @k ShouldPauseCallback shouldPauseCallback, @k ScatterSet<RecomposeScopeImpl> scatterSet) {
            return ComposerImpl.this.parentContext.recomposePaused$runtime_release(controlledComposition, shouldPauseCallback, scatterSet);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void recordInspectionTable$runtime_release(@k Set<CompositionData> set) {
            Set set2 = this.inspectionTables;
            if (set2 == null) {
                set2 = new HashSet();
                this.inspectionTables = set2;
            }
            set2.add(set);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposer$runtime_release(@k Composer composer) {
            g0.n(composer, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
            super.registerComposer$runtime_release((ComposerImpl) composer);
            this.composers.add(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposition$runtime_release(@k ControlledComposition controlledComposition) {
            ComposerImpl.this.parentContext.registerComposition$runtime_release(controlledComposition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void reportPausedScope$runtime_release(@k RecomposeScopeImpl recomposeScopeImpl) {
            ComposerImpl.this.parentContext.reportPausedScope$runtime_release(recomposeScopeImpl);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void reportRemovedComposition$runtime_release(@k ControlledComposition controlledComposition) {
            ComposerImpl.this.parentContext.reportRemovedComposition$runtime_release(controlledComposition);
        }

        public final void setInspectionTables(@l Set<Set<CompositionData>> set) {
            this.inspectionTables = set;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void startComposing$runtime_release() {
            ComposerImpl.this.childrenComposing++;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposer$runtime_release(@k Composer composer) {
            Set<Set<CompositionData>> set = this.inspectionTables;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    Set set2 = (Set) it.next();
                    g0.n(composer, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                    set2.remove(((ComposerImpl) composer).slotTable);
                }
            }
            x0.a(this.composers).remove(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposition$runtime_release(@k ControlledComposition controlledComposition) {
            ComposerImpl.this.parentContext.unregisterComposition$runtime_release(controlledComposition);
        }

        public final void updateCompositionLocalScope(@k PersistentCompositionLocalMap persistentCompositionLocalMap) {
            setCompositionLocalScope(persistentCompositionLocalMap);
        }

        public static /* synthetic */ void getRecomposeCoroutineContext$runtime_release$annotations() {
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(boolean z11) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Boolean) && z11 == ((Boolean) nextSlot).booleanValue()) {
            return false;
        }
        updateValue(Boolean.valueOf(z11));
        return true;
    }

    @InternalComposeApi
    public static /* synthetic */ void getCompoundKeyHash$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getDefaultsInvalid$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getInserting$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getSkipping$annotations() {
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(float f11) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Float) && f11 == ((Number) nextSlot).floatValue()) {
            return false;
        }
        updateValue(Float.valueOf(f11));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(long j11) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Long) && j11 == ((Number) nextSlot).longValue()) {
            return false;
        }
        updateValue(Long.valueOf(j11));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(double d11) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Double) && d11 == ((Number) nextSlot).doubleValue()) {
            return false;
        }
        updateValue(Double.valueOf(d11));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(int i11) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Integer) && i11 == ((Number) nextSlot).intValue()) {
            return false;
        }
        updateValue(Integer.valueOf(i11));
        return true;
    }
}
