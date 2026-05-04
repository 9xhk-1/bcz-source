package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/NestedMutableSnapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2487:1\n1894#2,2:2488\n33#3,2:2490\n1#4:2492\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/NestedMutableSnapshot\n*L\n1587#1:2488,2\n1587#1:2490,2\n*E\n"})
/* loaded from: classes.dex */
public final class NestedMutableSnapshot extends MutableSnapshot {
    public static final int $stable = 8;
    private boolean deactivated;

    @k
    private final MutableSnapshot parent;

    public NestedMutableSnapshot(long j11, @k SnapshotIdSet snapshotIdSet, @l x00.l<Object, g2> lVar, @l x00.l<Object, g2> lVar2, @k MutableSnapshot mutableSnapshot) {
        super(j11, snapshotIdSet, lVar, lVar2);
        this.parent = mutableSnapshot;
        mutableSnapshot.mo2067nestedActivated$runtime_release(this);
    }

    private final void deactivate() {
        if (this.deactivated) {
            return;
        }
        this.deactivated = true;
        this.parent.mo2068nestedDeactivated$runtime_release(this);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    @k
    public SnapshotApplyResult apply() {
        Map<StateRecord, ? extends StateRecord> map;
        NestedMutableSnapshot nestedMutableSnapshot;
        Map<StateRecord, ? extends StateRecord> optimisticMerges;
        if (this.parent.getApplied$runtime_release() || this.parent.getDisposed$runtime_release()) {
            return new SnapshotApplyResult.Failure(this);
        }
        MutableScatterSet<StateObject> modified$runtime_release = getModified$runtime_release();
        long snapshotId = getSnapshotId();
        if (modified$runtime_release != null) {
            optimisticMerges = SnapshotKt.optimisticMerges(this.parent.getSnapshotId(), this, this.parent.getInvalid$runtime_release());
            map = optimisticMerges;
        } else {
            map = null;
        }
        synchronized (SnapshotKt.getLock()) {
            try {
                SnapshotKt.validateOpen(this);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                if (modified$runtime_release == null || modified$runtime_release.getSize() == 0) {
                    nestedMutableSnapshot = this;
                    closeAndReleasePinning$runtime_release();
                } else {
                    nestedMutableSnapshot = this;
                    SnapshotApplyResult innerApplyLocked$runtime_release = nestedMutableSnapshot.innerApplyLocked$runtime_release(this.parent.getSnapshotId(), modified$runtime_release, map, this.parent.getInvalid$runtime_release());
                    if (!g0.g(innerApplyLocked$runtime_release, SnapshotApplyResult.Success.INSTANCE)) {
                        return innerApplyLocked$runtime_release;
                    }
                    MutableScatterSet<StateObject> modified$runtime_release2 = nestedMutableSnapshot.parent.getModified$runtime_release();
                    if (modified$runtime_release2 != null) {
                        modified$runtime_release2.addAll(modified$runtime_release);
                    } else {
                        nestedMutableSnapshot.parent.setModified(modified$runtime_release);
                        setModified(null);
                    }
                }
                if (nestedMutableSnapshot.parent.getSnapshotId() < snapshotId) {
                    nestedMutableSnapshot.parent.advance$runtime_release();
                }
                MutableSnapshot mutableSnapshot = nestedMutableSnapshot.parent;
                mutableSnapshot.setInvalid$runtime_release(mutableSnapshot.getInvalid$runtime_release().clear(snapshotId).andNot(getPreviousIds$runtime_release()));
                nestedMutableSnapshot.parent.recordPrevious$runtime_release(snapshotId);
                nestedMutableSnapshot.parent.recordPreviousPinnedSnapshot$runtime_release(takeoverPinnedSnapshot$runtime_release());
                nestedMutableSnapshot.parent.recordPreviousList$runtime_release(getPreviousIds$runtime_release());
                nestedMutableSnapshot.parent.recordPreviousPinnedSnapshots$runtime_release(getPreviousPinnedSnapshots$runtime_release());
                g2 g2Var = g2.f100423a;
                setApplied$runtime_release(true);
                deactivate();
                SnapshotObserverKt.dispatchObserverOnApplied(this, modified$runtime_release);
                return SnapshotApplyResult.Success.INSTANCE;
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed$runtime_release()) {
            return;
        }
        super.dispose();
        deactivate();
    }

    @k
    public final MutableSnapshot getParent() {
        return this.parent;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    @k
    public Snapshot getRoot() {
        return this.parent.getRoot();
    }
}
