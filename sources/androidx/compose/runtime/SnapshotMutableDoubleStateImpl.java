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
@u0({"SMAP\nSnapshotDoubleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotDoubleState.kt\nandroidx/compose/runtime/SnapshotMutableDoubleStateImpl\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 FloatingPointEquality.android.kt\nandroidx/compose/runtime/internal/FloatingPointEquality_androidKt\n+ 4 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,194:1\n2475#2:195\n2392#2,2:201\n1894#2,2:203\n2394#2,4:207\n2475#2:217\n49#3,5:196\n49#3,5:212\n33#4,2:205\n1#5:211\n*S KotlinDebug\n*F\n+ 1 SnapshotDoubleState.kt\nandroidx/compose/runtime/SnapshotMutableDoubleStateImpl\n*L\n146#1:195\n148#1:201,2\n148#1:203,2\n148#1:207,4\n180#1:217\n147#1:196,5\n172#1:212,5\n148#1:205,2\n148#1:211\n*E\n"})
/* loaded from: classes.dex */
public class SnapshotMutableDoubleStateImpl extends StateObjectImpl implements MutableDoubleState, SnapshotMutableState<Double> {
    public static final int $stable = 0;

    @k
    private DoubleStateStateRecord next;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DoubleStateStateRecord extends StateRecord {
        private double value;

        public DoubleStateStateRecord(long j11, double d11) {
            super(j11);
            this.value = d11;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@k StateRecord stateRecord) {
            g0.n(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
            this.value = ((DoubleStateStateRecord) stateRecord).value;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @k
        public StateRecord create() {
            return create(getSnapshotId$runtime_release());
        }

        public final double getValue() {
            return this.value;
        }

        public final void setValue(double d11) {
            this.value = d11;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @k
        public StateRecord create(long j11) {
            return new DoubleStateStateRecord(j11, this.value);
        }
    }

    public SnapshotMutableDoubleStateImpl(double d11) {
        Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
        DoubleStateStateRecord doubleStateStateRecord = new DoubleStateStateRecord(currentSnapshot.getSnapshotId(), d11);
        if (!(currentSnapshot instanceof GlobalSnapshot)) {
            doubleStateStateRecord.setNext$runtime_release(new DoubleStateStateRecord(SnapshotId_jvmKt.toSnapshotId(1), d11));
        }
        this.next = doubleStateStateRecord;
    }

    @Override // androidx.compose.runtime.MutableState
    @k
    public l<Double, g2> component2() {
        return new l<Double, g2>() { // from class: androidx.compose.runtime.SnapshotMutableDoubleStateImpl$component2$1
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Double d11) {
                invoke(d11.doubleValue());
                return g2.f100423a;
            }

            public final void invoke(double d11) {
                SnapshotMutableDoubleStateImpl.this.setDoubleValue(d11);
            }
        };
    }

    @Override // androidx.compose.runtime.MutableDoubleState, androidx.compose.runtime.DoubleState
    public double getDoubleValue() {
        return ((DoubleStateStateRecord) SnapshotKt.readable(this.next, this)).getValue();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @k
    public StateRecord getFirstStateRecord() {
        return this.next;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    @k
    public SnapshotMutationPolicy<Double> getPolicy() {
        return SnapshotStateKt.structuralEqualityPolicy();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @m80.l
    public StateRecord mergeRecords(@k StateRecord stateRecord, @k StateRecord stateRecord2, @k StateRecord stateRecord3) {
        g0.n(stateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        g0.n(stateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        if (((DoubleStateStateRecord) stateRecord2).getValue() == ((DoubleStateStateRecord) stateRecord3).getValue()) {
            return stateRecord2;
        }
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@k StateRecord stateRecord) {
        g0.n(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        this.next = (DoubleStateStateRecord) stateRecord;
    }

    @Override // androidx.compose.runtime.MutableDoubleState
    public void setDoubleValue(double d11) {
        Snapshot current;
        DoubleStateStateRecord doubleStateStateRecord = (DoubleStateStateRecord) SnapshotKt.current(this.next);
        if (doubleStateStateRecord.getValue() == d11) {
            return;
        }
        DoubleStateStateRecord doubleStateStateRecord2 = this.next;
        synchronized (SnapshotKt.getLock()) {
            current = Snapshot.Companion.getCurrent();
            ((DoubleStateStateRecord) SnapshotKt.overwritableRecord(doubleStateStateRecord2, this, current, doubleStateStateRecord)).setValue(d11);
            g2 g2Var = g2.f100423a;
        }
        SnapshotKt.notifyWrite(current, this);
    }

    @k
    public String toString() {
        return "MutableDoubleState(value=" + ((DoubleStateStateRecord) SnapshotKt.current(this.next)).getValue() + ")@" + hashCode();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.MutableState
    @k
    public Double component1() {
        return Double.valueOf(getDoubleValue());
    }
}
