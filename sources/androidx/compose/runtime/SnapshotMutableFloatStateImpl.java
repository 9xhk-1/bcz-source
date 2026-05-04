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
@u0({"SMAP\nSnapshotFloatState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFloatState.kt\nandroidx/compose/runtime/SnapshotMutableFloatStateImpl\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 FloatingPointEquality.android.kt\nandroidx/compose/runtime/internal/FloatingPointEquality_androidKt\n+ 4 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,192:1\n2475#2:193\n2392#2,2:199\n1894#2,2:201\n2394#2,4:205\n2475#2:215\n41#3,5:194\n41#3,5:210\n33#4,2:203\n1#5:209\n*S KotlinDebug\n*F\n+ 1 SnapshotFloatState.kt\nandroidx/compose/runtime/SnapshotMutableFloatStateImpl\n*L\n144#1:193\n146#1:199,2\n146#1:201,2\n146#1:205,4\n178#1:215\n145#1:194,5\n170#1:210,5\n146#1:203,2\n146#1:209\n*E\n"})
/* loaded from: classes.dex */
public class SnapshotMutableFloatStateImpl extends StateObjectImpl implements MutableFloatState, SnapshotMutableState<Float> {
    public static final int $stable = 0;

    @k
    private FloatStateStateRecord next;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class FloatStateStateRecord extends StateRecord {
        private float value;

        public FloatStateStateRecord(long j11, float f11) {
            super(j11);
            this.value = f11;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@k StateRecord stateRecord) {
            g0.n(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
            this.value = ((FloatStateStateRecord) stateRecord).value;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @k
        public StateRecord create() {
            return create(SnapshotKt.currentSnapshot().getSnapshotId());
        }

        public final float getValue() {
            return this.value;
        }

        public final void setValue(float f11) {
            this.value = f11;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @k
        public StateRecord create(long j11) {
            return new FloatStateStateRecord(j11, this.value);
        }
    }

    public SnapshotMutableFloatStateImpl(float f11) {
        Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
        FloatStateStateRecord floatStateStateRecord = new FloatStateStateRecord(currentSnapshot.getSnapshotId(), f11);
        if (!(currentSnapshot instanceof GlobalSnapshot)) {
            floatStateStateRecord.setNext$runtime_release(new FloatStateStateRecord(SnapshotId_jvmKt.toSnapshotId(1), f11));
        }
        this.next = floatStateStateRecord;
    }

    @Override // androidx.compose.runtime.MutableState
    @k
    public l<Float, g2> component2() {
        return new l<Float, g2>() { // from class: androidx.compose.runtime.SnapshotMutableFloatStateImpl$component2$1
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Float f11) {
                invoke(f11.floatValue());
                return g2.f100423a;
            }

            public final void invoke(float f11) {
                SnapshotMutableFloatStateImpl.this.setFloatValue(f11);
            }
        };
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @k
    public StateRecord getFirstStateRecord() {
        return this.next;
    }

    @Override // androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.FloatState
    public float getFloatValue() {
        return ((FloatStateStateRecord) SnapshotKt.readable(this.next, this)).getValue();
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    @k
    public SnapshotMutationPolicy<Float> getPolicy() {
        return SnapshotStateKt.structuralEqualityPolicy();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @m80.l
    public StateRecord mergeRecords(@k StateRecord stateRecord, @k StateRecord stateRecord2, @k StateRecord stateRecord3) {
        g0.n(stateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        g0.n(stateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        if (((FloatStateStateRecord) stateRecord2).getValue() == ((FloatStateStateRecord) stateRecord3).getValue()) {
            return stateRecord2;
        }
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@k StateRecord stateRecord) {
        g0.n(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.next = (FloatStateStateRecord) stateRecord;
    }

    @Override // androidx.compose.runtime.MutableFloatState
    public void setFloatValue(float f11) {
        Snapshot current;
        FloatStateStateRecord floatStateStateRecord = (FloatStateStateRecord) SnapshotKt.current(this.next);
        if (floatStateStateRecord.getValue() == f11) {
            return;
        }
        FloatStateStateRecord floatStateStateRecord2 = this.next;
        synchronized (SnapshotKt.getLock()) {
            current = Snapshot.Companion.getCurrent();
            ((FloatStateStateRecord) SnapshotKt.overwritableRecord(floatStateStateRecord2, this, current, floatStateStateRecord)).setValue(f11);
            g2 g2Var = g2.f100423a;
        }
        SnapshotKt.notifyWrite(current, this);
    }

    @k
    public String toString() {
        return "MutableFloatState(value=" + ((FloatStateStateRecord) SnapshotKt.current(this.next)).getValue() + ")@" + hashCode();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.MutableState
    @k
    public Float component1() {
        return Float.valueOf(getFloatValue());
    }
}
