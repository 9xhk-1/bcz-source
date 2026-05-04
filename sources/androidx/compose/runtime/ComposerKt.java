package androidx.compose.runtime;

import a00.r0;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.collection.MultiValueMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import ma.b;
import x00.p;
import yz.g2;
import yz.h1;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,4891:1\n4341#1,8:4898\n4341#1,8:4912\n4643#1,5:4921\n4658#1,4:4933\n4643#1,5:4937\n1#2:4892\n1#2:4946\n1#2:4954\n2043#3,5:4893\n2049#3:4906\n2043#3,5:4907\n2049#3:4920\n158#4,7:4926\n174#4,4:4942\n179#4,3:4947\n174#4,4:4950\n179#4,3:4955\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n4328#1:4898,8\n4375#1:4912,8\n4395#1:4921,5\n4663#1:4933,4\n4665#1:4937,5\n4755#1:4946\n4815#1:4954\n4319#1:4893,5\n4319#1:4906\n4362#1:4907,5\n4362#1:4920\n4508#1:4926,7\n4755#1:4942,4\n4755#1:4947,3\n4815#1:4950,4\n4815#1:4955,3\n*E\n"})
/* loaded from: classes.dex */
public final class ComposerKt {
    public static final boolean EnableDebugRuntimeChecks = false;
    public static final int compositionLocalMapKey = 202;

    @l
    private static CompositionTracer compositionTracer = null;
    private static final int defaultsKey = -127;
    private static final int invalidGroupLocation = -2;
    public static final int invocationKey = 200;
    private static final int nodeKey = 125;
    public static final int providerKey = 201;
    public static final int providerMapsKey = 204;
    public static final int providerValuesKey = 203;
    public static final int referenceKey = 206;
    public static final int reuseKey = 207;
    private static final int rootKey = 100;

    @k
    private static final Object invocation = new OpaqueKey(b.f72911h1);

    @k
    private static final Object provider = new OpaqueKey(b.f72911h1);

    @k
    private static final Object compositionLocalMap = new OpaqueKey("compositionLocalMap");

    @k
    private static final Object providerValues = new OpaqueKey("providerValues");

    @k
    private static final Object providerMaps = new OpaqueKey("providers");

    @k
    private static final Object reference = new OpaqueKey(TypedValues.Custom.S_REFERENCE);

    @k
    private static final Comparator<Invalidation> InvalidationLocationAscending = new Comparator() { // from class: androidx.compose.runtime.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int InvalidationLocationAscending$lambda$16;
            InvalidationLocationAscending$lambda$16 = ComposerKt.InvalidationLocationAscending$lambda$16((Invalidation) obj, (Invalidation) obj2);
            return InvalidationLocationAscending$lambda$16;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final int InvalidationLocationAscending$lambda$16(Invalidation invalidation, Invalidation invalidation2) {
        return g0.t(invalidation.getLocation(), invalidation2.getLocation());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean asBool(int i11) {
        return i11 != 0;
    }

    @ComposeCompilerApi
    public static final <T> T cache(@k Composer composer, boolean z11, @k x00.a<? extends T> aVar) {
        T t11 = (T) composer.rememberedValue();
        if (!z11 && t11 != Composer.Companion.getEmpty()) {
            return t11;
        }
        T invoke = aVar.invoke();
        composer.updateRememberedValue(invoke);
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Object> collectNodesFrom(SlotTable slotTable, Anchor anchor) {
        ArrayList arrayList = new ArrayList();
        SlotReader openReader = slotTable.openReader();
        try {
            collectNodesFrom$lambda$10$collectFromGroup(openReader, arrayList, slotTable.anchorIndex(anchor));
            g2 g2Var = g2.f100423a;
            return arrayList;
        } finally {
            openReader.close();
        }
    }

    private static final void collectNodesFrom$lambda$10$collectFromGroup(SlotReader slotReader, List<Object> list, int i11) {
        if (slotReader.isNode(i11)) {
            list.add(slotReader.node(i11));
            return;
        }
        int i12 = i11 + 1;
        int groupSize = i11 + slotReader.groupSize(i11);
        while (i12 < groupSize) {
            collectNodesFrom$lambda$10$collectFromGroup(slotReader, list, i12);
            i12 += slotReader.groupSize(i12);
        }
    }

    public static final void composeImmediateRuntimeError(@k String str) {
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    @k
    public static final Void composeRuntimeError(@k String str) {
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final void deactivateCurrentGroup(@k SlotWriter slotWriter, @k RememberManager rememberManager) {
        int i11;
        int dataIndex = slotWriter.dataIndex(slotWriter.groups, slotWriter.groupIndexToAddress(slotWriter.getCurrentGroup() + slotWriter.groupSize(slotWriter.getCurrentGroup())));
        for (int dataIndex2 = slotWriter.dataIndex(slotWriter.groups, slotWriter.groupIndexToAddress(slotWriter.getCurrentGroup())); dataIndex2 < dataIndex; dataIndex2++) {
            Object obj = slotWriter.slots[slotWriter.dataIndexToDataAddress(dataIndex2)];
            int i12 = -1;
            if (obj instanceof ComposeNodeLifecycleCallback) {
                rememberManager.deactivating((ComposeNodeLifecycleCallback) obj, slotWriter.getSlotsSize() - dataIndex2, -1, -1);
            } else if (obj instanceof RememberObserverHolder) {
                RememberObserverHolder rememberObserverHolder = (RememberObserverHolder) obj;
                if (!(rememberObserverHolder.getWrapped() instanceof ReusableRememberObserver)) {
                    removeData(slotWriter, dataIndex2, obj);
                    int slotsSize = slotWriter.getSlotsSize() - dataIndex2;
                    Anchor after = rememberObserverHolder.getAfter();
                    if (after == null || !after.getValid()) {
                        i11 = -1;
                    } else {
                        i12 = slotWriter.anchorIndex(after);
                        i11 = slotWriter.getSlotsSize() - slotWriter.slotsEndAllIndex$runtime_release(i12);
                    }
                    rememberManager.forgetting(rememberObserverHolder, slotsSize, i12, i11);
                }
            } else if (obj instanceof RecomposeScopeImpl) {
                removeData(slotWriter, dataIndex2, obj);
                ((RecomposeScopeImpl) obj).release();
            }
        }
    }

    public static final void debugRuntimeCheck(boolean z11) {
    }

    private static final int distanceFrom(SlotReader slotReader, int i11, int i12) {
        int i13 = 0;
        while (i11 > 0 && i11 != i12) {
            i11 = slotReader.parent(i11);
            i13++;
        }
        return i13;
    }

    @k
    public static final MovableContentState extractMovableContentAtCurrent(@k final ControlledComposition controlledComposition, @k final MovableContentStateReference movableContentStateReference, @k SlotWriter slotWriter, @l Applier<?> applier) {
        SlotTable slotTable = new SlotTable();
        if (slotWriter.getCollectingSourceInformation()) {
            slotTable.collectSourceInformation();
        }
        if (slotWriter.getCollectingCalledInformation()) {
            slotTable.collectCalledByInformation();
        }
        int currentGroup = slotWriter.getCurrentGroup();
        if (applier != null && slotWriter.nodeCount(currentGroup) > 0) {
            int parent = slotWriter.getParent();
            while (parent > 0 && !slotWriter.isNode(parent)) {
                parent = slotWriter.parent(parent);
            }
            if (parent >= 0 && slotWriter.isNode(parent)) {
                Object node = slotWriter.node(parent);
                int i11 = parent + 1;
                int groupSize = parent + slotWriter.groupSize(parent);
                int i12 = 0;
                while (i11 < groupSize) {
                    int groupSize2 = slotWriter.groupSize(i11) + i11;
                    if (groupSize2 > currentGroup) {
                        break;
                    }
                    i12 += slotWriter.isNode(i11) ? 1 : slotWriter.nodeCount(i11);
                    i11 = groupSize2;
                }
                int nodeCount = slotWriter.isNode(currentGroup) ? 1 : slotWriter.nodeCount(currentGroup);
                applier.down(node);
                applier.remove(i12, nodeCount);
                applier.up();
            }
        }
        SlotWriter openWriter = slotTable.openWriter();
        try {
            openWriter.beginInsert();
            openWriter.startGroup(MovableContentKt.movableContentKey, movableContentStateReference.getContent$runtime_release());
            SlotWriter.markGroup$default(openWriter, 0, 1, null);
            openWriter.update(movableContentStateReference.getParameter$runtime_release());
            List<Anchor> moveTo = slotWriter.moveTo(movableContentStateReference.getAnchor$runtime_release(), 1, openWriter);
            openWriter.skipGroup();
            openWriter.endGroup();
            openWriter.endInsert();
            openWriter.close(true);
            MovableContentState movableContentState = new MovableContentState(slotTable);
            RecomposeScopeImpl.Companion companion = RecomposeScopeImpl.Companion;
            if (!companion.hasAnchoredRecomposeScopes$runtime_release(slotTable, moveTo)) {
                return movableContentState;
            }
            RecomposeScopeOwner recomposeScopeOwner = new RecomposeScopeOwner() { // from class: androidx.compose.runtime.ComposerKt$extractMovableContentAtCurrent$movableContentRecomposeScopeOwner$1
                @Override // androidx.compose.runtime.RecomposeScopeOwner
                public InvalidationResult invalidate(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
                    InvalidationResult invalidationResult;
                    ControlledComposition controlledComposition2 = ControlledComposition.this;
                    RecomposeScopeOwner recomposeScopeOwner2 = controlledComposition2 instanceof RecomposeScopeOwner ? (RecomposeScopeOwner) controlledComposition2 : null;
                    if (recomposeScopeOwner2 == null || (invalidationResult = recomposeScopeOwner2.invalidate(recomposeScopeImpl, obj)) == null) {
                        invalidationResult = InvalidationResult.IGNORED;
                    }
                    if (invalidationResult != InvalidationResult.IGNORED) {
                        return invalidationResult;
                    }
                    MovableContentStateReference movableContentStateReference2 = movableContentStateReference;
                    movableContentStateReference2.setInvalidations$runtime_release(r0.J4(movableContentStateReference2.getInvalidations$runtime_release(), h1.a(recomposeScopeImpl, obj)));
                    return InvalidationResult.SCHEDULED;
                }

                @Override // androidx.compose.runtime.RecomposeScopeOwner
                public void recomposeScopeReleased(RecomposeScopeImpl recomposeScopeImpl) {
                }

                @Override // androidx.compose.runtime.RecomposeScopeOwner
                public void recordReadOf(Object obj) {
                }
            };
            openWriter = slotTable.openWriter();
            try {
                companion.adoptAnchoredScopes$runtime_release(openWriter, moveTo, recomposeScopeOwner);
                g2 g2Var = g2.f100423a;
                openWriter.close(true);
                return movableContentState;
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Invalidation> filterToRange(List<Invalidation> list, int i11, int i12) {
        ArrayList arrayList = new ArrayList();
        for (int findInsertLocation = findInsertLocation(list, i11); findInsertLocation < list.size(); findInsertLocation++) {
            Invalidation invalidation = list.get(findInsertLocation);
            if (invalidation.getLocation() >= i12) {
                break;
            }
            arrayList.add(invalidation);
        }
        return arrayList;
    }

    private static final int findInsertLocation(List<Invalidation> list, int i11) {
        int findLocation = findLocation(list, i11);
        return findLocation < 0 ? -(findLocation + 1) : findLocation;
    }

    private static final int findLocation(List<Invalidation> list, int i11) {
        int size = list.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            int t11 = g0.t(list.get(i13).getLocation(), i11);
            if (t11 < 0) {
                i12 = i13 + 1;
            } else {
                if (t11 <= 0) {
                    return i13;
                }
                size = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Invalidation firstInRange(List<Invalidation> list, int i11, int i12) {
        int findInsertLocation = findInsertLocation(list, i11);
        if (findInsertLocation >= list.size()) {
            return null;
        }
        Invalidation invalidation = list.get(findInsertLocation);
        if (invalidation.getLocation() < i12) {
            return invalidation;
        }
        return null;
    }

    @k
    public static final Object getCompositionLocalMap() {
        return compositionLocalMap;
    }

    @k
    public static final Object getInvocation() {
        return invocation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getJoinedKey(KeyInfo keyInfo) {
        return keyInfo.getObjectKey() != null ? new JoinedKey(Integer.valueOf(keyInfo.getKey()), keyInfo.getObjectKey()) : Integer.valueOf(keyInfo.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getKey(Object obj, Object obj2, Object obj3) {
        JoinedKey joinedKey = obj instanceof JoinedKey ? (JoinedKey) obj : null;
        if (joinedKey == null) {
            return null;
        }
        if (g0.g(joinedKey.getLeft(), obj2) && g0.g(joinedKey.getRight(), obj3)) {
            return obj;
        }
        Object key = getKey(joinedKey.getLeft(), obj2, obj3);
        return key == null ? getKey(joinedKey.getRight(), obj2, obj3) : key;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getNextGroup(SlotWriter slotWriter) {
        return slotWriter.getCurrentGroup() + slotWriter.groupSize(slotWriter.getCurrentGroup());
    }

    @k
    public static final Object getProvider() {
        return provider;
    }

    @k
    public static final Object getProviderMaps() {
        return providerMaps;
    }

    @k
    public static final Object getProviderValues() {
        return providerValues;
    }

    @k
    public static final Object getReference() {
        return reference;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void insertIfMissing(List<Invalidation> list, int i11, RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        int findLocation = findLocation(list, i11);
        if (findLocation < 0) {
            int i12 = -(findLocation + 1);
            if (!(obj instanceof DerivedState)) {
                obj = null;
            }
            list.add(i12, new Invalidation(recomposeScopeImpl, i11, obj));
            return;
        }
        Invalidation invalidation = list.get(findLocation);
        if (!(obj instanceof DerivedState)) {
            invalidation.setInstances(null);
            return;
        }
        Object instances = invalidation.getInstances();
        if (instances == null) {
            invalidation.setInstances(obj);
        } else if (instances instanceof MutableScatterSet) {
            ((MutableScatterSet) instances).add(obj);
        } else {
            invalidation.setInstances(ScatterSetKt.mutableScatterSetOf(instances, obj));
        }
    }

    public static final boolean isAfterFirstChild(@k SlotWriter slotWriter) {
        return slotWriter.getCurrentGroup() > slotWriter.getParent() + 1;
    }

    @ComposeCompilerApi
    public static final boolean isTraceInProgress() {
        CompositionTracer compositionTracer2 = compositionTracer;
        return compositionTracer2 != null && compositionTracer2.isTraceInProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> MutableScatterMap<Object, Object> multiMap(int i11) {
        return MultiValueMap.m2029constructorimpl(new MutableScatterMap(i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nearestCommonRootOf(SlotReader slotReader, int i11, int i12, int i13) {
        if (i11 != i12) {
            if (i11 == i13 || i12 == i13) {
                return i13;
            }
            if (slotReader.parent(i11) == i12) {
                return i12;
            }
            if (slotReader.parent(i12) != i11) {
                if (slotReader.parent(i11) == slotReader.parent(i12)) {
                    return slotReader.parent(i11);
                }
                int distanceFrom = distanceFrom(slotReader, i11, i13);
                int distanceFrom2 = distanceFrom(slotReader, i12, i13);
                int i14 = distanceFrom - distanceFrom2;
                for (int i15 = 0; i15 < i14; i15++) {
                    i11 = slotReader.parent(i11);
                }
                int i16 = distanceFrom2 - distanceFrom;
                for (int i17 = 0; i17 < i16; i17++) {
                    i12 = slotReader.parent(i12);
                }
                while (i11 != i12) {
                    i11 = slotReader.parent(i11);
                    i12 = slotReader.parent(i12);
                }
                return i11;
            }
        }
        return i11;
    }

    public static final void removeCurrentGroup(@k SlotWriter slotWriter, @k RememberManager rememberManager) {
        int i11;
        int dataIndex = slotWriter.dataIndex(slotWriter.groups, slotWriter.groupIndexToAddress(slotWriter.getCurrentGroup() + slotWriter.groupSize(slotWriter.getCurrentGroup())));
        for (int dataIndex2 = slotWriter.dataIndex(slotWriter.groups, slotWriter.groupIndexToAddress(slotWriter.getCurrentGroup())); dataIndex2 < dataIndex; dataIndex2++) {
            Object obj = slotWriter.slots[slotWriter.dataIndexToDataAddress(dataIndex2)];
            int i12 = -1;
            if (obj instanceof ComposeNodeLifecycleCallback) {
                rememberManager.releasing((ComposeNodeLifecycleCallback) obj, slotWriter.getSlotsSize() - dataIndex2, -1, -1);
            }
            if (obj instanceof RememberObserverHolder) {
                int slotsSize = slotWriter.getSlotsSize() - dataIndex2;
                RememberObserverHolder rememberObserverHolder = (RememberObserverHolder) obj;
                Anchor after = rememberObserverHolder.getAfter();
                if (after == null || !after.getValid()) {
                    i11 = -1;
                } else {
                    i12 = slotWriter.anchorIndex(after);
                    i11 = slotWriter.getSlotsSize() - slotWriter.slotsEndAllIndex$runtime_release(i12);
                }
                rememberManager.forgetting(rememberObserverHolder, slotsSize, i12, i11);
            }
            if (obj instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) obj).release();
            }
        }
        slotWriter.removeGroup();
    }

    private static final void removeData(SlotWriter slotWriter, int i11, Object obj) {
        Object clear = slotWriter.clear(i11);
        if (obj == clear) {
            return;
        }
        composeImmediateRuntimeError("Slot table is out of sync (expected " + obj + ", got " + clear + ')');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Invalidation removeLocation(List<Invalidation> list, int i11) {
        int findLocation = findLocation(list, i11);
        if (findLocation >= 0) {
            return list.remove(findLocation);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeRange(List<Invalidation> list, int i11, int i12) {
        int findInsertLocation = findInsertLocation(list, i11);
        while (findInsertLocation < list.size() && list.get(findInsertLocation).getLocation() < i12) {
            list.remove(findInsertLocation);
        }
    }

    public static final void runtimeCheck(boolean z11, @k x00.a<String> aVar) {
        if (z11) {
            return;
        }
        composeImmediateRuntimeError(aVar.invoke());
    }

    @ComposeCompilerApi
    public static final void sourceInformation(@k Composer composer, @k String str) {
        composer.sourceInformation(str);
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerEnd(@k Composer composer) {
        composer.sourceInformationMarkerEnd();
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerStart(@k Composer composer, int i11, @k String str) {
        composer.sourceInformationMarkerStart(i11, str);
    }

    @ComposeCompilerApi
    public static final void traceEventEnd() {
        CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null) {
            compositionTracer2.traceEventEnd();
        }
    }

    public static final <R> void withAfterAnchorInfo(@k SlotWriter slotWriter, @l Anchor anchor, @k p<? super Integer, ? super Integer, ? extends R> pVar) {
        int i11;
        int i12;
        if (anchor == null || !anchor.getValid()) {
            i11 = -1;
            i12 = -1;
        } else {
            i11 = slotWriter.anchorIndex(anchor);
            i12 = slotWriter.getSlotsSize() - slotWriter.slotsEndAllIndex$runtime_release(i11);
        }
        pVar.invoke(Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static final void debugRuntimeCheck(boolean z11, @k x00.a<String> aVar) {
    }

    public static final boolean isAfterFirstChild(@k SlotReader slotReader) {
        return slotReader.getCurrentGroup() > slotReader.getParent() + 1;
    }

    public static final void runtimeCheck(boolean z11) {
        if (z11) {
            return;
        }
        composeImmediateRuntimeError("Check failed");
    }

    @ComposeCompilerApi
    public static final void traceEventStart(int i11, int i12, int i13, @k String str) {
        CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null) {
            compositionTracer2.traceEventStart(i11, i12, i13, str);
        }
    }

    @v0
    public static /* synthetic */ void getCompositionLocalMap$annotations() {
    }

    @v0
    public static /* synthetic */ void getCompositionLocalMapKey$annotations() {
    }

    private static /* synthetic */ void getCompositionTracer$annotations() {
    }

    @v0
    public static /* synthetic */ void getInvocation$annotations() {
    }

    @v0
    public static /* synthetic */ void getInvocationKey$annotations() {
    }

    @v0
    public static /* synthetic */ void getProvider$annotations() {
    }

    @v0
    public static /* synthetic */ void getProviderKey$annotations() {
    }

    @v0
    public static /* synthetic */ void getProviderMaps$annotations() {
    }

    @v0
    public static /* synthetic */ void getProviderMapsKey$annotations() {
    }

    @v0
    public static /* synthetic */ void getProviderValues$annotations() {
    }

    @v0
    public static /* synthetic */ void getProviderValuesKey$annotations() {
    }

    @v0
    public static /* synthetic */ void getReference$annotations() {
    }

    @v0
    public static /* synthetic */ void getReferenceKey$annotations() {
    }

    @v0
    public static /* synthetic */ void getReuseKey$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int asInt(boolean z11) {
        return z11 ? 1 : 0;
    }
}
