package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserver;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot\n+ 2 SnapshotObserver.kt\nandroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 4 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,2487:1\n193#2,14:2488\n193#2,14:2502\n1894#3,2:2516\n33#4,2:2518\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot\n*L\n1490#1:2488,14\n1510#1:2502,14\n1544#1:2516,2\n1544#1:2518,2\n*E\n"})
/* loaded from: classes.dex */
public final class GlobalSnapshot extends MutableSnapshot {
    public static final int $stable = 0;

    public GlobalSnapshot(long j11, @k SnapshotIdSet snapshotIdSet) {
        super(j11, snapshotIdSet, null, new l<Object, g2>() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot.1
            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Object obj) {
                invoke2(obj);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                List list;
                synchronized (SnapshotKt.getLock()) {
                    try {
                        list = SnapshotKt.globalWriteObservers;
                        int size = list.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            ((l) list.get(i11)).invoke(obj);
                        }
                        g2 g2Var = g2.f100423a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        });
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    @k
    public SnapshotApplyResult apply() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        synchronized (SnapshotKt.getLock()) {
            releasePinnedSnapshotLocked$runtime_release();
            g2 g2Var = g2.f100423a;
        }
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        SnapshotKt.advanceGlobalSnapshot();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    @k
    public MutableSnapshot takeNestedMutableSnapshot(@m80.l final l<Object, g2> lVar, @m80.l l<Object, g2> lVar2) {
        final l<Object, g2> lVar3;
        Map<SnapshotObserver, SnapshotInstanceObservers> map;
        Snapshot takeNewSnapshot;
        PersistentList persistentList = SnapshotObserverKt.observers;
        if (persistentList != null) {
            Pair<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> mergeObservers = SnapshotObserverKt.mergeObservers(persistentList, null, false, lVar, lVar2);
            SnapshotInstanceObservers first = mergeObservers.getFirst();
            l<Object, g2> readObserver = first.getReadObserver();
            l<Object, g2> writeObserver = first.getWriteObserver();
            map = mergeObservers.getSecond();
            lVar = readObserver;
            lVar3 = writeObserver;
        } else {
            lVar3 = lVar2;
            map = null;
        }
        takeNewSnapshot = SnapshotKt.takeNewSnapshot(new l<SnapshotIdSet, MutableSnapshot>() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot$takeNestedMutableSnapshot$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public final MutableSnapshot invoke(SnapshotIdSet snapshotIdSet) {
                long j11;
                long j12;
                synchronized (SnapshotKt.getLock()) {
                    j11 = SnapshotKt.nextSnapshotId;
                    j12 = SnapshotKt.nextSnapshotId;
                    SnapshotKt.nextSnapshotId = j12 + 1;
                }
                return new MutableSnapshot(j11, snapshotIdSet, lVar, lVar3);
            }
        });
        MutableSnapshot mutableSnapshot = (MutableSnapshot) takeNewSnapshot;
        if (persistentList != null) {
            SnapshotObserverKt.dispatchCreatedObservers(persistentList, null, mutableSnapshot, map);
        }
        return mutableSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    @k
    public Snapshot takeNestedSnapshot(@m80.l final l<Object, g2> lVar) {
        Map<SnapshotObserver, SnapshotInstanceObservers> map;
        Snapshot takeNewSnapshot;
        PersistentList persistentList = SnapshotObserverKt.observers;
        if (persistentList != null) {
            Pair<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> mergeObservers = SnapshotObserverKt.mergeObservers(persistentList, null, true, lVar, null);
            SnapshotInstanceObservers first = mergeObservers.getFirst();
            l<Object, g2> readObserver = first.getReadObserver();
            first.getWriteObserver();
            map = mergeObservers.getSecond();
            lVar = readObserver;
        } else {
            map = null;
        }
        takeNewSnapshot = SnapshotKt.takeNewSnapshot(new l<SnapshotIdSet, ReadonlySnapshot>() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot$takeNestedSnapshot$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public final ReadonlySnapshot invoke(SnapshotIdSet snapshotIdSet) {
                long j11;
                long j12;
                synchronized (SnapshotKt.getLock()) {
                    j11 = SnapshotKt.nextSnapshotId;
                    j12 = SnapshotKt.nextSnapshotId;
                    SnapshotKt.nextSnapshotId = j12 + 1;
                }
                return new ReadonlySnapshot(j11, snapshotIdSet, lVar);
            }
        });
        ReadonlySnapshot readonlySnapshot = (ReadonlySnapshot) takeNewSnapshot;
        if (persistentList != null) {
            SnapshotObserverKt.dispatchCreatedObservers(persistentList, null, readonlySnapshot, map);
        }
        return readonlySnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    @k
    /* renamed from: nestedActivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo2067nestedActivated$runtime_release(@k Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    @k
    /* renamed from: nestedDeactivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo2068nestedDeactivated$runtime_release(@k Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }
}
