package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.GlobalSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotId_jvmKt;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nSnapshotLongState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotMutableLongStateImpl\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n2475#2:188\n2392#2,2:189\n1894#2,2:191\n2394#2,4:195\n2475#2:200\n33#3,2:193\n1#4:199\n*S KotlinDebug\n*F\n+ 1 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotMutableLongStateImpl\n*L\n139#1:188\n141#1:189,2\n141#1:191,2\n141#1:195,4\n173#1:200\n141#1:193,2\n141#1:199\n*E\n"})
/* loaded from: classes.dex */
public class SnapshotMutableLongStateImpl extends StateObjectImpl implements MutableLongState, SnapshotMutableState<Long> {
    public static final int $stable = 0;

    @k
    private LongStateStateRecord next;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class LongStateStateRecord extends StateRecord {
        private long value;

        public LongStateStateRecord(long j11, long j12) {
            super(j11);
            this.value = j12;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@k StateRecord stateRecord) {
            g0.n(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
            this.value = ((LongStateStateRecord) stateRecord).value;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @k
        public StateRecord create() {
            return create(SnapshotKt.currentSnapshot().getSnapshotId());
        }

        public final long getValue() {
            return this.value;
        }

        public final void setValue(long j11) {
            this.value = j11;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @k
        public StateRecord create(long j11) {
            return new LongStateStateRecord(j11, this.value);
        }
    }

    public SnapshotMutableLongStateImpl(long j11) {
        Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
        LongStateStateRecord longStateStateRecord = new LongStateStateRecord(currentSnapshot.getSnapshotId(), j11);
        if (!(currentSnapshot instanceof GlobalSnapshot)) {
            longStateStateRecord.setNext$runtime_release(new LongStateStateRecord(SnapshotId_jvmKt.toSnapshotId(1), j11));
        }
        this.next = longStateStateRecord;
    }

    @Override // androidx.compose.runtime.MutableState
    @k
    public l<Long, g2> component2() {
        return new l<Long, g2>() { // from class: androidx.compose.runtime.SnapshotMutableLongStateImpl$component2$1
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Long l11) {
                invoke(l11.longValue());
                return g2.f100423a;
            }

            public final void invoke(long j11) {
                SnapshotMutableLongStateImpl.this.setLongValue(j11);
            }
        };
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @k
    public StateRecord getFirstStateRecord() {
        return this.next;
    }

    @Override // androidx.compose.runtime.MutableLongState, androidx.compose.runtime.LongState
    public long getLongValue() {
        return ((LongStateStateRecord) SnapshotKt.readable(this.next, this)).getValue();
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    @k
    public SnapshotMutationPolicy<Long> getPolicy() {
        return SnapshotStateKt.structuralEqualityPolicy();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @m80.l
    public StateRecord mergeRecords(@k StateRecord stateRecord, @k StateRecord stateRecord2, @k StateRecord stateRecord3) {
        g0.n(stateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        g0.n(stateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        if (((LongStateStateRecord) stateRecord2).getValue() == ((LongStateStateRecord) stateRecord3).getValue()) {
            return stateRecord2;
        }
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@k StateRecord stateRecord) {
        g0.n(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.next = (LongStateStateRecord) stateRecord;
    }

    @Override // androidx.compose.runtime.MutableLongState
    public void setLongValue(long j11) {
        Snapshot current;
        LongStateStateRecord longStateStateRecord = (LongStateStateRecord) SnapshotKt.current(this.next);
        if (longStateStateRecord.getValue() != j11) {
            LongStateStateRecord longStateStateRecord2 = this.next;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                ((LongStateStateRecord) SnapshotKt.overwritableRecord(longStateStateRecord2, this, current, longStateStateRecord)).setValue(j11);
                g2 g2Var = g2.f100423a;
            }
            SnapshotKt.notifyWrite(current, this);
        }
    }

    @k
    public String toString() {
        return "MutableLongState(value=" + ((LongStateStateRecord) SnapshotKt.current(this.next)).getValue() + ")@" + hashCode();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.MutableState
    @k
    public Long component1() {
        return Long.valueOf(getLongValue());
    }
}
