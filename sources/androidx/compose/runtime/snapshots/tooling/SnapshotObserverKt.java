package androidx.compose.runtime.snapshots.tooling;

import a00.w1;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.ExperimentalComposeRuntimeApi;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSnapshotObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotObserver.kt\nandroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,269:1\n1894#2,2:270\n1894#2,2:298\n33#3,2:272\n33#3,2:300\n33#4,6:274\n33#4,6:280\n33#4,6:286\n33#4,6:292\n1#5:302\n*S KotlinDebug\n*F\n+ 1 SnapshotObserver.kt\nandroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt\n*L\n174#1:270,2\n176#1:298,2\n174#1:272,2\n176#1:300,2\n219#1:274,6\n250#1:280,6\n258#1:286,6\n266#1:292,6\n*E\n"})
/* loaded from: classes.dex */
public final class SnapshotObserverKt {

    @l
    private static PersistentList<? extends SnapshotObserver> observers;

    @ExperimentalComposeRuntimeApi
    @k
    public static final <R extends Snapshot> R creatingSnapshot(@l Snapshot snapshot, @l x00.l<Object, g2> lVar, @l x00.l<Object, g2> lVar2, boolean z11, @k p<? super x00.l<Object, g2>, ? super x00.l<Object, g2>, ? extends R> pVar) {
        Map<SnapshotObserver, SnapshotInstanceObservers> map;
        PersistentList persistentList = observers;
        if (persistentList != null) {
            Pair<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> mergeObservers = mergeObservers(persistentList, snapshot, z11, lVar, lVar2);
            SnapshotInstanceObservers first = mergeObservers.getFirst();
            x00.l<Object, g2> readObserver = first.getReadObserver();
            lVar2 = first.getWriteObserver();
            map = mergeObservers.getSecond();
            lVar = readObserver;
        } else {
            map = null;
        }
        R invoke = pVar.invoke(lVar, lVar2);
        if (persistentList != null) {
            dispatchCreatedObservers(persistentList, snapshot, invoke, map);
        }
        return invoke;
    }

    @ExperimentalComposeRuntimeApi
    public static final void dispatchCreatedObservers(@k PersistentList<? extends SnapshotObserver> persistentList, @l Snapshot snapshot, @k Snapshot snapshot2, @l Map<SnapshotObserver, SnapshotInstanceObservers> map) {
        int size = persistentList.size();
        for (int i11 = 0; i11 < size; i11++) {
            SnapshotObserver snapshotObserver = persistentList.get(i11);
            snapshotObserver.onCreated(snapshot2, snapshot, map != null ? map.get(snapshotObserver) : null);
        }
    }

    public static final void dispatchObserverOnApplied(@k Snapshot snapshot, @l ScatterSet<StateObject> scatterSet) {
        Set<? extends Object> k11;
        PersistentList<? extends SnapshotObserver> persistentList = observers;
        if (persistentList == null || persistentList.isEmpty()) {
            return;
        }
        if (scatterSet == null || (k11 = ScatterSetWrapperKt.wrapIntoSet(scatterSet)) == null) {
            k11 = w1.k();
        }
        int size = persistentList.size();
        for (int i11 = 0; i11 < size; i11++) {
            persistentList.get(i11).onApplied(snapshot, k11);
        }
    }

    public static final void dispatchObserverOnPreDispose(@k Snapshot snapshot) {
        PersistentList<? extends SnapshotObserver> persistentList = observers;
        if (persistentList != null) {
            int size = persistentList.size();
            for (int i11 = 0; i11 < size; i11++) {
                persistentList.get(i11).onPreDispose(snapshot);
            }
        }
    }

    private static final x00.l<Object, g2> mergeObservers(final x00.l<Object, g2> lVar, final x00.l<Object, g2> lVar2) {
        return (lVar == null || lVar2 == null) ? lVar == null ? lVar2 : lVar : new x00.l<Object, g2>() { // from class: androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt$mergeObservers$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Object obj) {
                invoke2(obj);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                lVar.invoke(obj);
                lVar2.invoke(obj);
            }
        };
    }

    @ExperimentalComposeRuntimeApi
    @k
    public static final ObserverHandle observeSnapshots(@k Snapshot.Companion companion, @k final SnapshotObserver snapshotObserver) {
        synchronized (SnapshotKt.getLock()) {
            try {
                PersistentList<? extends SnapshotObserver> persistentList = observers;
                if (persistentList == null) {
                    persistentList = ExtensionsKt.persistentListOf();
                }
                observers = persistentList.add((PersistentList<? extends SnapshotObserver>) snapshotObserver);
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return new ObserverHandle() { // from class: androidx.compose.runtime.snapshots.tooling.a
            @Override // androidx.compose.runtime.snapshots.ObserverHandle
            public final void dispose() {
                SnapshotObserverKt.observeSnapshots$lambda$3(SnapshotObserver.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeSnapshots$lambda$3(SnapshotObserver snapshotObserver) {
        synchronized (SnapshotKt.getLock()) {
            try {
                PersistentList<? extends SnapshotObserver> persistentList = observers;
                PersistentList<? extends SnapshotObserver> persistentList2 = null;
                PersistentList<? extends SnapshotObserver> remove = persistentList != null ? persistentList.remove((PersistentList<? extends SnapshotObserver>) snapshotObserver) : null;
                if (remove != null && !remove.isEmpty()) {
                    persistentList2 = remove;
                }
                observers = persistentList2;
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @ExperimentalComposeRuntimeApi
    @k
    public static final Pair<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> mergeObservers(@k PersistentList<? extends SnapshotObserver> persistentList, @l Snapshot snapshot, boolean z11, @l x00.l<Object, g2> lVar, @l x00.l<Object, g2> lVar2) {
        int size = persistentList.size();
        LinkedHashMap linkedHashMap = null;
        for (int i11 = 0; i11 < size; i11++) {
            SnapshotObserver snapshotObserver = persistentList.get(i11);
            SnapshotInstanceObservers onPreCreate = snapshotObserver.onPreCreate(snapshot, z11);
            if (onPreCreate != null) {
                lVar = mergeObservers(onPreCreate.getReadObserver(), lVar);
                lVar2 = mergeObservers(onPreCreate.getWriteObserver(), lVar2);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                linkedHashMap.put(snapshotObserver, onPreCreate);
            }
        }
        return h1.a(new SnapshotInstanceObservers(lVar, lVar2), linkedHashMap);
    }

    @ExperimentalComposeRuntimeApi
    private static /* synthetic */ void getObservers$annotations() {
    }
}
