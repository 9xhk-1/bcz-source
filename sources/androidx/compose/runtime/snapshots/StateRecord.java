package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/StateRecord\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2487:1\n1#2:2488\n*E\n"})
/* loaded from: classes.dex */
public abstract class StateRecord {
    public static final int $stable = 8;

    @l
    private StateRecord next;
    private long snapshotId;

    public StateRecord(long j11) {
        this.snapshotId = j11;
    }

    public abstract void assign(@k StateRecord stateRecord);

    @k
    public abstract StateRecord create();

    @n(level = DeprecationLevel.HIDDEN, message = "Use snapshotId: Long version instead")
    public /* synthetic */ StateRecord create(int i11) {
        StateRecord create = create();
        create.snapshotId = SnapshotId_jvmKt.toSnapshotId(i11);
        return create;
    }

    @l
    public final StateRecord getNext$runtime_release() {
        return this.next;
    }

    public final long getSnapshotId$runtime_release() {
        return this.snapshotId;
    }

    public final void setNext$runtime_release(@l StateRecord stateRecord) {
        this.next = stateRecord;
    }

    public final void setSnapshotId$runtime_release(long j11) {
        this.snapshotId = j11;
    }

    @k
    public StateRecord create(long j11) {
        StateRecord create = create();
        create.snapshotId = j11;
        return create;
    }

    public StateRecord() {
        this(SnapshotKt.currentSnapshot().getSnapshotId());
    }

    @n(message = "Use snapshotId: Long constructor instead")
    public StateRecord(int i11) {
        this(SnapshotId_jvmKt.toSnapshotId(i11));
    }
}
