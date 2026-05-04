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
import w00.j;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 2)
@u0({"SMAP\nSnapshotState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotMutableStateImpl\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,331:1\n2475#2:332\n2392#2,2:333\n1894#2,2:335\n2394#2,4:339\n2475#2:345\n2475#2:346\n33#3,2:337\n1#4:343\n1#4:344\n*S KotlinDebug\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotMutableStateImpl\n*L\n140#1:332\n142#1:333,2\n142#1:335,2\n142#1:339,4\n185#1:345\n222#1:346\n142#1:337,2\n142#1:343\n*E\n"})
/* loaded from: classes.dex */
public class SnapshotMutableStateImpl<T> extends StateObjectImpl implements SnapshotMutableState<T> {
    public static final int $stable = 0;

    @k
    private StateStateRecord<T> next;

    @k
    private final SnapshotMutationPolicy<T> policy;

    public SnapshotMutableStateImpl(T t11, @k SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        this.policy = snapshotMutationPolicy;
        Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
        StateStateRecord<T> stateStateRecord = new StateStateRecord<>(currentSnapshot.getSnapshotId(), t11);
        if (!(currentSnapshot instanceof GlobalSnapshot)) {
            stateStateRecord.setNext$runtime_release(new StateStateRecord(SnapshotId_jvmKt.toSnapshotId(1), t11));
        }
        this.next = stateStateRecord;
    }

    @Override // androidx.compose.runtime.MutableState
    public T component1() {
        return getValue();
    }

    @Override // androidx.compose.runtime.MutableState
    @k
    public l<T, g2> component2() {
        return new l<T, g2>(this) { // from class: androidx.compose.runtime.SnapshotMutableStateImpl$component2$1
            final /* synthetic */ SnapshotMutableStateImpl<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Object obj) {
                invoke2((SnapshotMutableStateImpl$component2$1<T>) obj);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(T t11) {
                this.this$0.setValue(t11);
            }
        };
    }

    @j(name = "getDebuggerDisplayValue")
    public final T getDebuggerDisplayValue() {
        return (T) ((StateStateRecord) SnapshotKt.current(this.next)).getValue();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @k
    public StateRecord getFirstStateRecord() {
        return this.next;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    @k
    public SnapshotMutationPolicy<T> getPolicy() {
        return this.policy;
    }

    @Override // androidx.compose.runtime.MutableState, androidx.compose.runtime.State
    public T getValue() {
        return (T) ((StateStateRecord) SnapshotKt.readable(this.next, this)).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.snapshots.StateObject
    @m80.l
    public StateRecord mergeRecords(@k StateRecord stateRecord, @k StateRecord stateRecord2, @k StateRecord stateRecord3) {
        g0.n(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        StateStateRecord stateStateRecord = (StateStateRecord) stateRecord;
        g0.n(stateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        StateStateRecord stateStateRecord2 = (StateStateRecord) stateRecord2;
        g0.n(stateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        StateStateRecord stateStateRecord3 = (StateStateRecord) stateRecord3;
        if (getPolicy().equivalent(stateStateRecord2.getValue(), stateStateRecord3.getValue())) {
            return stateRecord2;
        }
        Object merge = getPolicy().merge(stateStateRecord.getValue(), stateStateRecord2.getValue(), stateStateRecord3.getValue());
        if (merge == null) {
            return null;
        }
        StateStateRecord create = stateStateRecord3.create(stateStateRecord3.getSnapshotId$runtime_release());
        create.setValue(merge);
        return create;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@k StateRecord stateRecord) {
        g0.n(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.next = (StateStateRecord) stateRecord;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.MutableState
    public void setValue(T t11) {
        Snapshot current;
        StateStateRecord stateStateRecord = (StateStateRecord) SnapshotKt.current(this.next);
        if (getPolicy().equivalent(stateStateRecord.getValue(), t11)) {
            return;
        }
        StateStateRecord<T> stateStateRecord2 = this.next;
        synchronized (SnapshotKt.getLock()) {
            current = Snapshot.Companion.getCurrent();
            ((StateStateRecord) SnapshotKt.overwritableRecord(stateStateRecord2, this, current, stateStateRecord)).setValue(t11);
            g2 g2Var = g2.f100423a;
        }
        SnapshotKt.notifyWrite(current, this);
    }

    @k
    public String toString() {
        return "MutableState(value=" + ((StateStateRecord) SnapshotKt.current(this.next)).getValue() + ")@" + hashCode();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class StateStateRecord<T> extends StateRecord {
        private T value;

        public StateStateRecord(long j11, T t11) {
            super(j11);
            this.value = t11;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@k StateRecord stateRecord) {
            g0.n(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
            this.value = ((StateStateRecord) stateRecord).value;
        }

        public final T getValue() {
            return this.value;
        }

        public final void setValue(T t11) {
            this.value = t11;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @k
        public StateStateRecord<T> create() {
            return new StateStateRecord<>(SnapshotKt.currentSnapshot().getSnapshotId(), this.value);
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @k
        public StateStateRecord<T> create(long j11) {
            return new StateStateRecord<>(SnapshotKt.currentSnapshot().getSnapshotId(), this.value);
        }
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }
}
