package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserver;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/NestedReadonlySnapshot\n+ 2 SnapshotObserver.kt\nandroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt\n*L\n1#1,2487:1\n193#2,14:2488\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/NestedReadonlySnapshot\n*L\n1431#1:2488,14\n*E\n"})
/* loaded from: classes.dex */
public final class NestedReadonlySnapshot extends Snapshot {
    public static final int $stable = 8;

    @k
    private final Snapshot parent;

    @l
    private final x00.l<Object, g2> readObserver;

    public NestedReadonlySnapshot(long j11, @k SnapshotIdSet snapshotIdSet, @l x00.l<Object, g2> lVar, @k Snapshot snapshot) {
        super(j11, snapshotIdSet, (v) null);
        this.readObserver = lVar;
        this.parent = snapshot;
        snapshot.mo2067nestedActivated$runtime_release(this);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed$runtime_release()) {
            return;
        }
        if (getSnapshotId() != this.parent.getSnapshotId()) {
            closeAndReleasePinning$runtime_release();
        }
        this.parent.mo2068nestedDeactivated$runtime_release(this);
        super.dispose();
        SnapshotObserverKt.dispatchObserverOnPreDispose(this);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @l
    public MutableScatterSet<StateObject> getModified$runtime_release() {
        return null;
    }

    @k
    public final Snapshot getParent() {
        return this.parent;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @l
    /* renamed from: getReadObserver$runtime_release, reason: merged with bridge method [inline-methods] */
    public x00.l<Object, g2> getReadObserver() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @k
    public Snapshot getRoot() {
        return this.parent.getRoot();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @l
    public x00.l<Object, g2> getWriteObserver$runtime_release() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public /* bridge */ /* synthetic */ Snapshot takeNestedSnapshot(x00.l lVar) {
        return takeNestedSnapshot((x00.l<Object, g2>) lVar);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @k
    /* renamed from: nestedActivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo2067nestedActivated$runtime_release(@k Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @k
    /* renamed from: nestedDeactivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo2068nestedDeactivated$runtime_release(@k Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @k
    /* renamed from: recordModified$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo2069recordModified$runtime_release(@k StateObject stateObject) {
        SnapshotKt.reportReadonlySnapshotWrite();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @k
    public NestedReadonlySnapshot takeNestedSnapshot(@l x00.l<Object, g2> lVar) {
        Map<SnapshotObserver, SnapshotInstanceObservers> map;
        PersistentList persistentList = SnapshotObserverKt.observers;
        if (persistentList != null) {
            Pair<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> mergeObservers = SnapshotObserverKt.mergeObservers(persistentList, this, true, lVar, null);
            SnapshotInstanceObservers first = mergeObservers.getFirst();
            x00.l<Object, g2> readObserver = first.getReadObserver();
            first.getWriteObserver();
            map = mergeObservers.getSecond();
            lVar = readObserver;
        } else {
            map = null;
        }
        NestedReadonlySnapshot nestedReadonlySnapshot = new NestedReadonlySnapshot(getSnapshotId(), getInvalid$runtime_release(), SnapshotKt.mergedReadObserver$default(lVar, getReadObserver(), false, 4, null), getParent());
        if (persistentList != null) {
            SnapshotObserverKt.dispatchCreatedObservers(persistentList, this, nestedReadonlySnapshot, map);
        }
        return nestedReadonlySnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
    }
}
