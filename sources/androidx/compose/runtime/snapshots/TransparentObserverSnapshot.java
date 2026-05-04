package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.KotlinNothingValueException;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TransparentObserverSnapshot extends Snapshot {
    public static final int $stable = 8;
    private final boolean mergeParentObservers;
    private final boolean ownsPreviousSnapshot;

    @l
    private final Snapshot previousSnapshot;

    @l
    private x00.l<Object, g2> readObserver;

    @k
    private final Snapshot root;
    private final long threadId;

    @l
    private final x00.l<Object, g2> writeObserver;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TransparentObserverSnapshot(@m80.l androidx.compose.runtime.snapshots.Snapshot r5, @m80.l x00.l<java.lang.Object, yz.g2> r6, boolean r7, boolean r8) {
        /*
            r4 = this;
            long r0 = androidx.compose.runtime.snapshots.SnapshotKt.access$getINVALID_SNAPSHOT$p()
            androidx.compose.runtime.snapshots.SnapshotIdSet$Companion r2 = androidx.compose.runtime.snapshots.SnapshotIdSet.Companion
            androidx.compose.runtime.snapshots.SnapshotIdSet r2 = r2.getEMPTY()
            r3 = 0
            r4.<init>(r0, r2, r3)
            r4.previousSnapshot = r5
            r4.mergeParentObservers = r7
            r4.ownsPreviousSnapshot = r8
            if (r5 == 0) goto L1c
            x00.l r5 = r5.getReadObserver()
            if (r5 != 0) goto L24
        L1c:
            androidx.compose.runtime.snapshots.GlobalSnapshot r5 = androidx.compose.runtime.snapshots.SnapshotKt.access$getGlobalSnapshot$p()
            x00.l r5 = r5.getReadObserver()
        L24:
            x00.l r5 = androidx.compose.runtime.snapshots.SnapshotKt.access$mergedReadObserver(r6, r5, r7)
            r4.readObserver = r5
            long r5 = androidx.compose.runtime.internal.Thread_jvmKt.currentThreadId()
            r4.threadId = r5
            r4.root = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.TransparentObserverSnapshot.<init>(androidx.compose.runtime.snapshots.Snapshot, x00.l, boolean, boolean):void");
    }

    private final Snapshot getCurrentSnapshot() {
        GlobalSnapshot globalSnapshot;
        Snapshot snapshot = this.previousSnapshot;
        if (snapshot != null) {
            return snapshot;
        }
        globalSnapshot = SnapshotKt.globalSnapshot;
        return globalSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        Snapshot snapshot;
        setDisposed$runtime_release(true);
        if (!this.ownsPreviousSnapshot || (snapshot = this.previousSnapshot) == null) {
            return;
        }
        snapshot.dispose();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @k
    public SnapshotIdSet getInvalid$runtime_release() {
        return getCurrentSnapshot().getInvalid$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @l
    public MutableScatterSet<StateObject> getModified$runtime_release() {
        return getCurrentSnapshot().getModified$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @l
    /* renamed from: getReadObserver$runtime_release, reason: merged with bridge method [inline-methods] */
    public x00.l<Object, g2> getReadObserver() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return getCurrentSnapshot().getReadOnly();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @k
    public Snapshot getRoot() {
        return this.root;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public long getSnapshotId() {
        return getCurrentSnapshot().getSnapshotId();
    }

    public final long getThreadId$runtime_release() {
        return this.threadId;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @l
    public x00.l<Object, g2> getWriteObserver$runtime_release() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        return getCurrentSnapshot().hasPendingChanges();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        getCurrentSnapshot().notifyObjectsInitialized$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: recordModified$runtime_release */
    public void mo2069recordModified$runtime_release(@k StateObject stateObject) {
        getCurrentSnapshot().mo2069recordModified$runtime_release(stateObject);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setInvalid$runtime_release(@k SnapshotIdSet snapshotIdSet) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    public void setModified(@l MutableScatterSet<StateObject> mutableScatterSet) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    public void setReadObserver(@l x00.l<Object, g2> lVar) {
        this.readObserver = lVar;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setSnapshotId$runtime_release(long j11) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @k
    public Snapshot takeNestedSnapshot(@l x00.l<Object, g2> lVar) {
        Snapshot createTransparentSnapshotWithNoParentReadObserver;
        x00.l<Object, g2> mergedReadObserver$default = SnapshotKt.mergedReadObserver$default(lVar, getReadObserver(), false, 4, null);
        if (this.mergeParentObservers) {
            return getCurrentSnapshot().takeNestedSnapshot(mergedReadObserver$default);
        }
        createTransparentSnapshotWithNoParentReadObserver = SnapshotKt.createTransparentSnapshotWithNoParentReadObserver(getCurrentSnapshot().takeNestedSnapshot(null), mergedReadObserver$default, true);
        return createTransparentSnapshotWithNoParentReadObserver;
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
}
