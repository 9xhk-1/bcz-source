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
public final class TransparentObserverMutableSnapshot extends MutableSnapshot {
    public static final int $stable = 8;
    private final boolean mergeParentObservers;
    private final boolean ownsParentSnapshot;

    @l
    private final MutableSnapshot parentSnapshot;

    @l
    private x00.l<Object, g2> readObserver;
    private final long threadId;

    @l
    private x00.l<Object, g2> writeObserver;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TransparentObserverMutableSnapshot(@m80.l androidx.compose.runtime.snapshots.MutableSnapshot r7, @m80.l x00.l<java.lang.Object, yz.g2> r8, @m80.l x00.l<java.lang.Object, yz.g2> r9, boolean r10, boolean r11) {
        /*
            r6 = this;
            long r1 = androidx.compose.runtime.snapshots.SnapshotKt.access$getINVALID_SNAPSHOT$p()
            androidx.compose.runtime.snapshots.SnapshotIdSet$Companion r0 = androidx.compose.runtime.snapshots.SnapshotIdSet.Companion
            androidx.compose.runtime.snapshots.SnapshotIdSet r3 = r0.getEMPTY()
            if (r7 == 0) goto L12
            x00.l r0 = r7.getReadObserver()
            if (r0 != 0) goto L1a
        L12:
            androidx.compose.runtime.snapshots.GlobalSnapshot r0 = androidx.compose.runtime.snapshots.SnapshotKt.access$getGlobalSnapshot$p()
            x00.l r0 = r0.getReadObserver()
        L1a:
            x00.l r4 = androidx.compose.runtime.snapshots.SnapshotKt.access$mergedReadObserver(r8, r0, r10)
            if (r7 == 0) goto L26
            x00.l r8 = r7.getWriteObserver$runtime_release()
            if (r8 != 0) goto L2e
        L26:
            androidx.compose.runtime.snapshots.GlobalSnapshot r8 = androidx.compose.runtime.snapshots.SnapshotKt.access$getGlobalSnapshot$p()
            x00.l r8 = r8.getWriteObserver$runtime_release()
        L2e:
            x00.l r5 = androidx.compose.runtime.snapshots.SnapshotKt.access$mergedWriteObserver(r9, r8)
            r0 = r6
            r0.<init>(r1, r3, r4, r5)
            r0.parentSnapshot = r7
            r0.mergeParentObservers = r10
            r0.ownsParentSnapshot = r11
            x00.l r7 = super.getReadObserver()
            r0.readObserver = r7
            x00.l r7 = super.getWriteObserver$runtime_release()
            r0.writeObserver = r7
            long r7 = androidx.compose.runtime.internal.Thread_jvmKt.currentThreadId()
            r0.threadId = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.TransparentObserverMutableSnapshot.<init>(androidx.compose.runtime.snapshots.MutableSnapshot, x00.l, x00.l, boolean, boolean):void");
    }

    private final MutableSnapshot getCurrentSnapshot() {
        GlobalSnapshot globalSnapshot;
        MutableSnapshot mutableSnapshot = this.parentSnapshot;
        if (mutableSnapshot != null) {
            return mutableSnapshot;
        }
        globalSnapshot = SnapshotKt.globalSnapshot;
        return globalSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    @k
    public SnapshotApplyResult apply() {
        return getCurrentSnapshot().apply();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        MutableSnapshot mutableSnapshot;
        setDisposed$runtime_release(true);
        if (!this.ownsParentSnapshot || (mutableSnapshot = this.parentSnapshot) == null) {
            return;
        }
        mutableSnapshot.dispose();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @k
    public SnapshotIdSet getInvalid$runtime_release() {
        return getCurrentSnapshot().getInvalid$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    @l
    public MutableScatterSet<StateObject> getModified$runtime_release() {
        return getCurrentSnapshot().getModified$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    @l
    /* renamed from: getReadObserver$runtime_release, reason: merged with bridge method [inline-methods] */
    public x00.l<Object, g2> getReadObserver() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return getCurrentSnapshot().getReadOnly();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public long getSnapshotId() {
        return getCurrentSnapshot().getSnapshotId();
    }

    public final long getThreadId$runtime_release() {
        return this.threadId;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public int getWriteCount$runtime_release() {
        return getCurrentSnapshot().getWriteCount$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    @l
    public x00.l<Object, g2> getWriteObserver$runtime_release() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        return getCurrentSnapshot().hasPendingChanges();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        getCurrentSnapshot().notifyObjectsInitialized$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: recordModified$runtime_release */
    public void mo2069recordModified$runtime_release(@k StateObject stateObject) {
        getCurrentSnapshot().mo2069recordModified$runtime_release(stateObject);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setInvalid$runtime_release(@k SnapshotIdSet snapshotIdSet) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
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

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void setWriteCount$runtime_release(int i11) {
        getCurrentSnapshot().setWriteCount$runtime_release(i11);
    }

    public void setWriteObserver(@l x00.l<Object, g2> lVar) {
        this.writeObserver = lVar;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    @k
    public MutableSnapshot takeNestedMutableSnapshot(@l x00.l<Object, g2> lVar, @l x00.l<Object, g2> lVar2) {
        x00.l<Object, g2> mergedWriteObserver;
        x00.l<Object, g2> mergedReadObserver$default = SnapshotKt.mergedReadObserver$default(lVar, getReadObserver(), false, 4, null);
        mergedWriteObserver = SnapshotKt.mergedWriteObserver(lVar2, getWriteObserver$runtime_release());
        return !this.mergeParentObservers ? new TransparentObserverMutableSnapshot(getCurrentSnapshot().takeNestedMutableSnapshot(null, mergedWriteObserver), mergedReadObserver$default, mergedWriteObserver, false, true) : getCurrentSnapshot().takeNestedMutableSnapshot(mergedReadObserver$default, mergedWriteObserver);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
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
