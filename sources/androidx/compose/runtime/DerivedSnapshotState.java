package androidx.compose.runtime;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Utils_jvmKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import w00.j;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDerivedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState\n+ 2 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 7 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 8 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,401:1\n373#2,2:402\n375#2,2:413\n82#2:415\n81#2,3:417\n378#2,2:445\n82#2:447\n81#2,3:449\n373#2,2:452\n375#2,5:463\n423#3,9:404\n423#3,9:454\n1#4:416\n1#4:448\n395#5,4:420\n367#5,6:424\n377#5,3:431\n380#5,9:435\n399#5:444\n1399#6:430\n1270#6:434\n1894#7,2:468\n1894#7,2:472\n2475#7:476\n2475#7:477\n2475#7:478\n33#8,2:470\n33#8,2:474\n*S KotlinDebug\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState\n*L\n188#1:402,2\n188#1:413,2\n190#1:415\n190#1:417,3\n188#1:445,2\n204#1:447\n204#1:449,3\n206#1:452,2\n206#1:463,5\n188#1:404,9\n206#1:454,9\n190#1:416\n204#1:448\n192#1:420,4\n192#1:424,6\n192#1:431,3\n192#1:435,9\n192#1:444\n192#1:430\n192#1:434\n231#1:468,2\n254#1:472,2\n296#1:476\n306#1:477\n312#1:478\n231#1:470,2\n254#1:474,2\n*E\n"})
/* loaded from: classes.dex */
final class DerivedSnapshotState<T> extends StateObjectImpl implements DerivedState<T> {

    @k
    private final x00.a<T> calculation;

    @k
    private ResultRecord<T> first = new ResultRecord<>(SnapshotKt.currentSnapshot().getSnapshotId());

    @l
    private final SnapshotMutationPolicy<T> policy;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    @u0({"SMAP\nDerivedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState$ResultRecord\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 7 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,401:1\n1894#2,2:402\n1894#2,2:406\n1894#2,2:410\n33#3,2:404\n33#3,2:408\n33#3,2:412\n373#4,2:414\n375#4,2:425\n378#4,2:452\n423#5,9:416\n395#6,4:427\n367#6,6:431\n377#6,3:438\n380#6,9:442\n399#6:451\n1399#7:437\n1270#7:441\n*S KotlinDebug\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState$ResultRecord\n*L\n117#1:402,2\n126#1:406,2\n137#1:410,2\n117#1:404,2\n126#1:408,2\n137#1:412,2\n139#1:414,2\n139#1:425,2\n139#1:452,2\n139#1:416,9\n140#1:427,4\n140#1:431,6\n140#1:438,3\n140#1:442,9\n140#1:451\n140#1:437\n140#1:441\n*E\n"})
    public static final class ResultRecord<T> extends StateRecord implements DerivedState.Record<T> {

        @k
        private ObjectIntMap<StateObject> dependencies;

        @l
        private Object result;
        private int resultHash;
        private long validSnapshotId;
        private int validSnapshotWriteCount;

        @k
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        @k
        private static final Object Unset = new Object();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Companion {
            public /* synthetic */ Companion(v vVar) {
                this();
            }

            @k
            public final Object getUnset() {
                return ResultRecord.Unset;
            }

            private Companion() {
            }
        }

        public ResultRecord(long j11) {
            super(j11);
            this.dependencies = ObjectIntMapKt.emptyObjectIntMap();
            this.result = Unset;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@k StateRecord stateRecord) {
            g0.n(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            ResultRecord resultRecord = (ResultRecord) stateRecord;
            setDependencies(resultRecord.getDependencies());
            this.result = resultRecord.result;
            this.resultHash = resultRecord.resultHash;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @k
        public StateRecord create() {
            return create(SnapshotKt.currentSnapshot().getSnapshotId());
        }

        @Override // androidx.compose.runtime.DerivedState.Record
        public T getCurrentValue() {
            return (T) this.result;
        }

        @Override // androidx.compose.runtime.DerivedState.Record
        @k
        public ObjectIntMap<StateObject> getDependencies() {
            return this.dependencies;
        }

        @l
        public final Object getResult() {
            return this.result;
        }

        public final int getResultHash() {
            return this.resultHash;
        }

        public final long getValidSnapshotId() {
            return this.validSnapshotId;
        }

        public final int getValidSnapshotWriteCount() {
            return this.validSnapshotWriteCount;
        }

        public final boolean isValid(@k DerivedState<?> derivedState, @k Snapshot snapshot) {
            boolean z11;
            boolean z12;
            synchronized (SnapshotKt.getLock()) {
                z11 = true;
                if (this.validSnapshotId == snapshot.getSnapshotId()) {
                    if (this.validSnapshotWriteCount == snapshot.getWriteCount$runtime_release()) {
                        z12 = false;
                    }
                }
                z12 = true;
            }
            if (this.result == Unset || (z12 && this.resultHash != readableHash(derivedState, snapshot))) {
                z11 = false;
            }
            if (!z11 || !z12) {
                return z11;
            }
            synchronized (SnapshotKt.getLock()) {
                this.validSnapshotId = snapshot.getSnapshotId();
                this.validSnapshotWriteCount = snapshot.getWriteCount$runtime_release();
                g2 g2Var = g2.f100423a;
            }
            return z11;
        }

        public final int readableHash(@k DerivedState<?> derivedState, @k Snapshot snapshot) {
            ObjectIntMap<StateObject> dependencies;
            int i11;
            int i12;
            int i13;
            int i14;
            synchronized (SnapshotKt.getLock()) {
                dependencies = getDependencies();
            }
            int i15 = 7;
            if (!dependencies.isNotEmpty()) {
                return 7;
            }
            MutableVector<DerivedStateObserver> derivedStateObservers = SnapshotStateKt.derivedStateObservers();
            DerivedStateObserver[] derivedStateObserverArr = derivedStateObservers.content;
            int size = derivedStateObservers.getSize();
            for (int i16 = 0; i16 < size; i16++) {
                derivedStateObserverArr[i16].start(derivedState);
            }
            try {
                Object[] objArr = dependencies.keys;
                int[] iArr = dependencies.values;
                long[] jArr = dependencies.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    i11 = 7;
                    int i17 = 0;
                    while (true) {
                        long j11 = jArr[i17];
                        if ((((~j11) << i15) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i18 = 8;
                            int i19 = 8 - ((~(i17 - length)) >>> 31);
                            int i21 = 0;
                            while (i21 < i19) {
                                if ((j11 & 255) < 128) {
                                    int i22 = (i17 << 3) + i21;
                                    i13 = i15;
                                    StateObject stateObject = (StateObject) objArr[i22];
                                    i14 = i18;
                                    if (iArr[i22] == 1) {
                                        StateRecord current = stateObject instanceof DerivedSnapshotState ? ((DerivedSnapshotState) stateObject).current(snapshot) : SnapshotKt.current(stateObject.getFirstStateRecord(), snapshot);
                                        i11 = (((i11 * 31) + Utils_jvmKt.identityHashCode(current)) * 31) + Long.hashCode(current.getSnapshotId$runtime_release());
                                    }
                                } else {
                                    i13 = i15;
                                    i14 = i18;
                                }
                                j11 >>= i14;
                                i21++;
                                i18 = i14;
                                i15 = i13;
                            }
                            i12 = i15;
                            if (i19 != i18) {
                                break;
                            }
                        } else {
                            i12 = i15;
                        }
                        if (i17 == length) {
                            i15 = i11;
                            break;
                        }
                        i17++;
                        i15 = i12;
                    }
                }
                i11 = i15;
                g2 g2Var = g2.f100423a;
                DerivedStateObserver[] derivedStateObserverArr2 = derivedStateObservers.content;
                int size2 = derivedStateObservers.getSize();
                for (int i23 = 0; i23 < size2; i23++) {
                    derivedStateObserverArr2[i23].done(derivedState);
                }
                return i11;
            } catch (Throwable th2) {
                DerivedStateObserver[] derivedStateObserverArr3 = derivedStateObservers.content;
                int size3 = derivedStateObservers.getSize();
                for (int i24 = 0; i24 < size3; i24++) {
                    derivedStateObserverArr3[i24].done(derivedState);
                }
                throw th2;
            }
        }

        public void setDependencies(@k ObjectIntMap<StateObject> objectIntMap) {
            this.dependencies = objectIntMap;
        }

        public final void setResult(@l Object obj) {
            this.result = obj;
        }

        public final void setResultHash(int i11) {
            this.resultHash = i11;
        }

        public final void setValidSnapshotId(long j11) {
            this.validSnapshotId = j11;
        }

        public final void setValidSnapshotWriteCount(int i11) {
            this.validSnapshotWriteCount = i11;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @k
        public StateRecord create(long j11) {
            return new ResultRecord(j11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DerivedSnapshotState(@k x00.a<? extends T> aVar, @l SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        this.calculation = aVar;
        this.policy = snapshotMutationPolicy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ResultRecord<T> currentRecord(ResultRecord<T> resultRecord, Snapshot snapshot, boolean z11, x00.a<? extends T> aVar) {
        Snapshot.Companion companion;
        SnapshotMutationPolicy<T> policy;
        int i11;
        ResultRecord<T> resultRecord2 = resultRecord;
        int i12 = 0;
        if (!resultRecord2.isValid(this, snapshot)) {
            final MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
            final IntRef intRef = (IntRef) SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.get();
            if (intRef == null) {
                intRef = new IntRef(0);
                SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.set(intRef);
            }
            final int element = intRef.getElement();
            MutableVector<DerivedStateObserver> derivedStateObservers = SnapshotStateKt.derivedStateObservers();
            DerivedStateObserver[] derivedStateObserverArr = derivedStateObservers.content;
            int size = derivedStateObservers.getSize();
            for (int i13 = 0; i13 < size; i13++) {
                derivedStateObserverArr[i13].start(this);
            }
            try {
                intRef.setElement(element + 1);
                Object observe = Snapshot.Companion.observe(new x00.l<Object, g2>(this) { // from class: androidx.compose.runtime.DerivedSnapshotState$currentRecord$result$1$1$result$1
                    final /* synthetic */ DerivedSnapshotState<T> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                        this.this$0 = this;
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ g2 invoke(Object obj) {
                        invoke2(obj);
                        return g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object obj) {
                        if (obj == this.this$0) {
                            throw new IllegalStateException("A derived state calculation cannot read itself");
                        }
                        if (obj instanceof StateObject) {
                            int element2 = intRef.getElement();
                            MutableObjectIntMap<StateObject> mutableObjectIntMap2 = mutableObjectIntMap;
                            mutableObjectIntMap2.set(obj, Math.min(element2 - element, mutableObjectIntMap2.getOrDefault(obj, Integer.MAX_VALUE)));
                        }
                    }
                }, null, aVar);
                intRef.setElement(element);
                DerivedStateObserver[] derivedStateObserverArr2 = derivedStateObservers.content;
                int size2 = derivedStateObservers.getSize();
                for (int i14 = 0; i14 < size2; i14++) {
                    derivedStateObserverArr2[i14].done(this);
                }
                synchronized (SnapshotKt.getLock()) {
                    try {
                        companion = Snapshot.Companion;
                        Snapshot current = companion.getCurrent();
                        if (resultRecord2.getResult() == ResultRecord.Companion.getUnset() || (policy = getPolicy()) == 0 || !policy.equivalent(observe, resultRecord2.getResult())) {
                            resultRecord2 = (ResultRecord) SnapshotKt.newWritableRecord(this.first, this, current);
                            resultRecord2.setDependencies(mutableObjectIntMap);
                            resultRecord2.setResultHash(resultRecord2.readableHash(this, current));
                            resultRecord2.setResult(observe);
                        } else {
                            resultRecord2.setDependencies(mutableObjectIntMap);
                            resultRecord2.setResultHash(resultRecord2.readableHash(this, current));
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                IntRef intRef2 = (IntRef) SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.get();
                if (intRef2 == null || intRef2.getElement() != 0) {
                    return resultRecord2;
                }
                companion.notifyObjectsInitialized();
                synchronized (SnapshotKt.getLock()) {
                    Snapshot current2 = companion.getCurrent();
                    resultRecord2.setValidSnapshotId(current2.getSnapshotId());
                    resultRecord2.setValidSnapshotWriteCount(current2.getWriteCount$runtime_release());
                    g2 g2Var = g2.f100423a;
                }
                return resultRecord2;
            } catch (Throwable th3) {
                DerivedStateObserver[] derivedStateObserverArr3 = derivedStateObservers.content;
                int size3 = derivedStateObservers.getSize();
                for (int i15 = 0; i15 < size3; i15++) {
                    derivedStateObserverArr3[i15].done(this);
                }
                throw th3;
            }
        }
        if (z11) {
            MutableVector<DerivedStateObserver> derivedStateObservers2 = SnapshotStateKt.derivedStateObservers();
            DerivedStateObserver[] derivedStateObserverArr4 = derivedStateObservers2.content;
            int size4 = derivedStateObservers2.getSize();
            for (int i16 = 0; i16 < size4; i16++) {
                derivedStateObserverArr4[i16].start(this);
            }
            try {
                ObjectIntMap<StateObject> dependencies = resultRecord2.getDependencies();
                IntRef intRef3 = (IntRef) SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.get();
                if (intRef3 == null) {
                    intRef3 = new IntRef(0);
                    SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.set(intRef3);
                }
                int element2 = intRef3.getElement();
                Object[] objArr = dependencies.keys;
                int[] iArr = dependencies.values;
                long[] jArr = dependencies.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j11 = jArr[i17];
                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i18 = 8;
                            int i19 = 8 - ((~(i17 - length)) >>> 31);
                            while (i12 < i19) {
                                if ((j11 & 255) < 128) {
                                    int i21 = (i17 << 3) + i12;
                                    i11 = i18;
                                    StateObject stateObject = (StateObject) objArr[i21];
                                    intRef3.setElement(element2 + iArr[i21]);
                                    x00.l<Object, g2> readObserver = snapshot.getReadObserver();
                                    if (readObserver != null) {
                                        readObserver.invoke(stateObject);
                                    }
                                } else {
                                    i11 = i18;
                                }
                                j11 >>= i11;
                                i12++;
                                i18 = i11;
                            }
                            if (i19 != i18) {
                                break;
                            }
                        }
                        if (i17 == length) {
                            break;
                        }
                        i17++;
                        i12 = 0;
                    }
                }
                intRef3.setElement(element2);
                g2 g2Var2 = g2.f100423a;
                DerivedStateObserver[] derivedStateObserverArr5 = derivedStateObservers2.content;
                int size5 = derivedStateObservers2.getSize();
                for (int i22 = 0; i22 < size5; i22++) {
                    derivedStateObserverArr5[i22].done(this);
                }
            } catch (Throwable th4) {
                DerivedStateObserver[] derivedStateObserverArr6 = derivedStateObservers2.content;
                int size6 = derivedStateObservers2.getSize();
                for (int i23 = 0; i23 < size6; i23++) {
                    derivedStateObserverArr6[i23].done(this);
                }
                throw th4;
            }
        }
        return resultRecord2;
    }

    private final String displayValue() {
        ResultRecord resultRecord = (ResultRecord) SnapshotKt.current(this.first);
        return resultRecord.isValid(this, Snapshot.Companion.getCurrent()) ? String.valueOf(resultRecord.getResult()) : "<Not calculated>";
    }

    @k
    public final StateRecord current(@k Snapshot snapshot) {
        return currentRecord((ResultRecord) SnapshotKt.current(this.first, snapshot), snapshot, false, this.calculation);
    }

    @Override // androidx.compose.runtime.DerivedState
    @k
    public DerivedState.Record<T> getCurrentRecord() {
        Snapshot current = Snapshot.Companion.getCurrent();
        return currentRecord((ResultRecord) SnapshotKt.current(this.first, current), current, false, this.calculation);
    }

    @l
    @j(name = "getDebuggerDisplayValue")
    public final T getDebuggerDisplayValue() {
        ResultRecord resultRecord = (ResultRecord) SnapshotKt.current(this.first);
        if (resultRecord.isValid(this, Snapshot.Companion.getCurrent())) {
            return (T) resultRecord.getResult();
        }
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @k
    public StateRecord getFirstStateRecord() {
        return this.first;
    }

    @Override // androidx.compose.runtime.DerivedState
    @l
    public SnapshotMutationPolicy<T> getPolicy() {
        return this.policy;
    }

    @Override // androidx.compose.runtime.State
    public T getValue() {
        Snapshot.Companion companion = Snapshot.Companion;
        x00.l<Object, g2> readObserver = companion.getCurrent().getReadObserver();
        if (readObserver != null) {
            readObserver.invoke(this);
        }
        Snapshot current = companion.getCurrent();
        return (T) currentRecord((ResultRecord) SnapshotKt.current(this.first, current), current, true, this.calculation).getResult();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@k StateRecord stateRecord) {
        g0.n(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.first = (ResultRecord) stateRecord;
    }

    @k
    public String toString() {
        return "DerivedState(value=" + displayValue() + ")@" + hashCode();
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }
}
