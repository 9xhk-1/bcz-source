package androidx.compose.runtime.snapshots;

import a00.h0;
import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.internal.WeakReference;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 SnapshotWeakSet.kt\nandroidx/compose/runtime/snapshots/SnapshotWeakSet\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2487:1\n1894#1,2:2488\n1894#1,2:2494\n1894#1,2:2504\n1894#1,2:2533\n1894#1,2:2537\n1894#1,2:2541\n2213#1,8:2545\n1894#1,2:2581\n1894#1,2:2585\n1894#1,2:2589\n1894#1,2:2594\n1894#1,2:2598\n1894#1,2:2602\n1894#1,2:2631\n1894#1,2:2635\n33#2,2:2490\n33#2,2:2492\n33#2,2:2496\n33#2,2:2506\n33#2,2:2535\n33#2,2:2539\n33#2,2:2543\n33#2,2:2583\n33#2,2:2587\n33#2,2:2591\n33#2,2:2596\n33#2,2:2600\n33#2,2:2604\n33#2,2:2633\n33#2,2:2637\n27#2:2639\n33#3,6:2498\n231#4,3:2508\n200#4,7:2511\n211#4,3:2519\n214#4,9:2523\n234#4:2532\n231#4,3:2606\n200#4,7:2609\n211#4,3:2617\n214#4,9:2621\n234#4:2630\n1399#5:2518\n1270#5:2522\n1399#5:2616\n1270#5:2620\n125#6,28:2553\n1#7:2593\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n*L\n706#1:2488,2\n1969#1:2494,2\n1988#1:2504,2\n2016#1:2533,2\n2075#1:2537,2\n2097#1:2541,2\n2197#1:2545,8\n2249#1:2581,2\n2277#1:2585,2\n2287#1:2589,2\n2355#1:2594,2\n2366#1:2598,2\n2393#1:2602,2\n2449#1:2631,2\n2460#1:2635,2\n706#1:2490,2\n1895#1:2492,2\n1969#1:2496,2\n1988#1:2506,2\n2016#1:2535,2\n2075#1:2539,2\n2097#1:2543,2\n2249#1:2583,2\n2277#1:2587,2\n2287#1:2591,2\n2355#1:2596,2\n2366#1:2600,2\n2393#1:2604,2\n2449#1:2633,2\n2460#1:2637,2\n1888#1:2639\n1982#1:2498,6\n1990#1:2508,3\n1990#1:2511,7\n1990#1:2519,3\n1990#1:2523,9\n1990#1:2532\n2415#1:2606,3\n2415#1:2609,7\n2415#1:2617,3\n2415#1:2621,9\n2415#1:2630\n1990#1:2518\n1990#1:2522\n2415#1:2616\n2415#1:2620\n2224#1:2553,28\n*E\n"})
/* loaded from: classes.dex */
public final class SnapshotKt {
    private static final long INVALID_SNAPSHOT = 0;

    @k
    private static List<? extends p<? super Set<? extends Object>, ? super Snapshot, g2>> applyObservers;

    @k
    private static final SnapshotWeakSet<StateObject> extraStateObjects;

    @k
    private static final GlobalSnapshot globalSnapshot;

    @k
    private static List<? extends l<Object, g2>> globalWriteObservers;
    private static long nextSnapshotId;

    @k
    private static SnapshotIdSet openSnapshots;

    @k
    private static AtomicInt pendingApplyObserverCount;

    @k
    private static final SnapshotDoubleIndexHeap pinningTable;

    @k
    private static final Snapshot snapshotInitializer;

    @k
    private static final l<SnapshotIdSet, g2> emptyLambda = new l<SnapshotIdSet, g2>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$emptyLambda$1
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SnapshotIdSet snapshotIdSet) {
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(SnapshotIdSet snapshotIdSet) {
            invoke2(snapshotIdSet);
            return g2.f100423a;
        }
    };

    @k
    private static final SnapshotThreadLocal<Snapshot> threadSnapshot = new SnapshotThreadLocal<>();

    @k
    private static final Object lock = new Object();

    static {
        SnapshotIdSet.Companion companion = SnapshotIdSet.Companion;
        openSnapshots = companion.getEMPTY();
        nextSnapshotId = SnapshotId_jvmKt.toSnapshotId(1) + 1;
        pinningTable = new SnapshotDoubleIndexHeap();
        extraStateObjects = new SnapshotWeakSet<>();
        applyObservers = h0.J();
        globalWriteObservers = h0.J();
        long j11 = nextSnapshotId;
        nextSnapshotId = 1 + j11;
        GlobalSnapshot globalSnapshot2 = new GlobalSnapshot(j11, companion.getEMPTY());
        openSnapshots = openSnapshots.set(globalSnapshot2.getSnapshotId());
        globalSnapshot = globalSnapshot2;
        snapshotInitializer = globalSnapshot2;
        pendingApplyObserverCount = new AtomicInt(0);
    }

    @k
    public static final SnapshotIdSet addRange(@k SnapshotIdSet snapshotIdSet, long j11, long j12) {
        while (j11 < j12) {
            snapshotIdSet = snapshotIdSet.set(j11);
            j11++;
        }
        return snapshotIdSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T advanceGlobalSnapshot(l<? super SnapshotIdSet, ? extends T> lVar) {
        MutableScatterSet<StateObject> modified$runtime_release;
        T t11;
        GlobalSnapshot globalSnapshot2 = globalSnapshot;
        synchronized (getLock()) {
            try {
                modified$runtime_release = globalSnapshot2.getModified$runtime_release();
                if (modified$runtime_release != null) {
                    pendingApplyObserverCount.add(1);
                }
                t11 = (T) resetGlobalSnapshotLocked(globalSnapshot2, lVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (modified$runtime_release != null) {
            try {
                List<? extends p<? super Set<? extends Object>, ? super Snapshot, g2>> list = applyObservers;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    list.get(i11).invoke(ScatterSetWrapperKt.wrapIntoSet(modified$runtime_release), globalSnapshot2);
                }
            } finally {
                pendingApplyObserverCount.add(-1);
            }
        }
        synchronized (getLock()) {
            try {
                checkAndOverwriteUnusedRecordsLocked();
                if (modified$runtime_release != null) {
                    Object[] objArr = modified$runtime_release.elements;
                    long[] jArr = modified$runtime_release.metadata;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i12 = 0;
                        while (true) {
                            long j11 = jArr[i12];
                            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i13 = 8 - ((~(i12 - length)) >>> 31);
                                for (int i14 = 0; i14 < i13; i14++) {
                                    if ((255 & j11) < 128) {
                                        processForUnusedRecordsLocked((StateObject) objArr[(i12 << 3) + i14]);
                                    }
                                    j11 >>= 8;
                                }
                                if (i13 != 8) {
                                    break;
                                }
                            }
                            if (i12 == length) {
                                break;
                            }
                            i12++;
                        }
                    }
                    g2 g2Var = g2.f100423a;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return t11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkAndOverwriteUnusedRecordsLocked() {
        SnapshotWeakSet<StateObject> snapshotWeakSet = extraStateObjects;
        int size$runtime_release = snapshotWeakSet.getSize$runtime_release();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= size$runtime_release) {
                break;
            }
            WeakReference<StateObject> weakReference = snapshotWeakSet.getValues$runtime_release()[i11];
            StateObject stateObject = weakReference != null ? weakReference.get() : null;
            if (stateObject != null && overwriteUnusedRecordsLocked(stateObject)) {
                if (i12 != i11) {
                    snapshotWeakSet.getValues$runtime_release()[i12] = weakReference;
                    snapshotWeakSet.getHashes$runtime_release()[i12] = snapshotWeakSet.getHashes$runtime_release()[i11];
                }
                i12++;
            }
            i11++;
        }
        for (int i13 = i12; i13 < size$runtime_release; i13++) {
            snapshotWeakSet.getValues$runtime_release()[i13] = null;
            snapshotWeakSet.getHashes$runtime_release()[i13] = 0;
        }
        if (i12 != size$runtime_release) {
            snapshotWeakSet.setSize$runtime_release(i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Snapshot createTransparentSnapshotWithNoParentReadObserver(Snapshot snapshot, l<Object, g2> lVar, boolean z11) {
        boolean z12 = snapshot instanceof MutableSnapshot;
        if (z12 || snapshot == null) {
            return new TransparentObserverMutableSnapshot(z12 ? (MutableSnapshot) snapshot : null, lVar, null, false, z11);
        }
        return new TransparentObserverSnapshot(snapshot, lVar, false, z11);
    }

    public static /* synthetic */ Snapshot createTransparentSnapshotWithNoParentReadObserver$default(Snapshot snapshot, l lVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return createTransparentSnapshotWithNoParentReadObserver(snapshot, lVar, z11);
    }

    @v0
    @k
    public static final <T extends StateRecord> T current(@k T t11, @k Snapshot snapshot) {
        T t12;
        T t13 = (T) readable(t11, snapshot.getSnapshotId(), snapshot.getInvalid$runtime_release());
        if (t13 != null) {
            return t13;
        }
        synchronized (getLock()) {
            t12 = (T) readable(t11, snapshot.getSnapshotId(), snapshot.getInvalid$runtime_release());
        }
        if (t12 != null) {
            return t12;
        }
        readError();
        throw new KotlinNothingValueException();
    }

    @k
    public static final Snapshot currentSnapshot() {
        Snapshot snapshot = threadSnapshot.get();
        return snapshot == null ? globalSnapshot : snapshot;
    }

    private static final StateRecord findYoungestOr(StateRecord stateRecord, l<? super StateRecord, Boolean> lVar) {
        StateRecord stateRecord2 = stateRecord;
        while (stateRecord != null) {
            if (lVar.invoke(stateRecord).booleanValue()) {
                return stateRecord;
            }
            if (stateRecord2.getSnapshotId$runtime_release() < stateRecord.getSnapshotId$runtime_release()) {
                stateRecord2 = stateRecord;
            }
            stateRecord = stateRecord.getNext$runtime_release();
        }
        return stateRecord2;
    }

    @k
    public static final Object getLock() {
        return lock;
    }

    @k
    public static final Snapshot getSnapshotInitializer() {
        return snapshotInitializer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l<Object, g2> mergedReadObserver(final l<Object, g2> lVar, final l<Object, g2> lVar2, boolean z11) {
        if (!z11) {
            lVar2 = null;
        }
        return (lVar == null || lVar2 == null || lVar == lVar2) ? lVar == null ? lVar2 : lVar : new l<Object, g2>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$mergedReadObserver$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Object obj) {
                invoke2(obj);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                lVar.invoke(obj);
                lVar2.invoke(obj);
            }
        };
    }

    public static /* synthetic */ l mergedReadObserver$default(l lVar, l lVar2, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        return mergedReadObserver(lVar, lVar2, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l<Object, g2> mergedWriteObserver(final l<Object, g2> lVar, final l<Object, g2> lVar2) {
        return (lVar == null || lVar2 == null || lVar == lVar2) ? lVar == null ? lVar2 : lVar : new l<Object, g2>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$mergedWriteObserver$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Object obj) {
                invoke2(obj);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                lVar.invoke(obj);
                lVar2.invoke(obj);
            }
        };
    }

    @k
    public static final <T extends StateRecord> T newOverwritableRecordLocked(@k T t11, @k StateObject stateObject) {
        T t12 = (T) usedLocked(stateObject);
        if (t12 != null) {
            t12.setSnapshotId$runtime_release(Long.MAX_VALUE);
            return t12;
        }
        T t13 = (T) t11.create(Long.MAX_VALUE);
        t13.setNext$runtime_release(stateObject.getFirstStateRecord());
        g0.n(t13, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        stateObject.prependStateRecord(t13);
        g0.n(t13, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return t13;
    }

    @k
    public static final <T extends StateRecord> T newWritableRecord(@k T t11, @k StateObject stateObject, @k Snapshot snapshot) {
        T t12;
        synchronized (getLock()) {
            t12 = (T) newWritableRecordLocked(t11, stateObject, snapshot);
        }
        return t12;
    }

    private static final <T extends StateRecord> T newWritableRecordLocked(T t11, StateObject stateObject, Snapshot snapshot) {
        T t12 = (T) newOverwritableRecordLocked(t11, stateObject);
        t12.assign(t11);
        t12.setSnapshotId$runtime_release(snapshot.getSnapshotId());
        return t12;
    }

    @v0
    public static final void notifyWrite(@k Snapshot snapshot, @k StateObject stateObject) {
        snapshot.setWriteCount$runtime_release(snapshot.getWriteCount$runtime_release() + 1);
        l<Object, g2> writeObserver$runtime_release = snapshot.getWriteObserver$runtime_release();
        if (writeObserver$runtime_release != null) {
            writeObserver$runtime_release.invoke(stateObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<StateRecord, StateRecord> optimisticMerges(long j11, MutableSnapshot mutableSnapshot, SnapshotIdSet snapshotIdSet) {
        long[] jArr;
        Map<StateRecord, StateRecord> map;
        SnapshotIdSet snapshotIdSet2;
        long[] jArr2;
        Map<StateRecord, StateRecord> map2;
        SnapshotIdSet snapshotIdSet3;
        int i11;
        long j12 = j11;
        MutableScatterSet<StateObject> modified$runtime_release = mutableSnapshot.getModified$runtime_release();
        Map<StateRecord, StateRecord> map3 = null;
        if (modified$runtime_release == null) {
            return null;
        }
        SnapshotIdSet or2 = mutableSnapshot.getInvalid$runtime_release().set(mutableSnapshot.getSnapshotId()).or(mutableSnapshot.getPreviousIds$runtime_release());
        Object[] objArr = modified$runtime_release.elements;
        long[] jArr3 = modified$runtime_release.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            return null;
        }
        HashMap hashMap = null;
        int i12 = 0;
        while (true) {
            long j13 = jArr3[i12];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8;
                int i14 = 8 - ((~(i12 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((255 & j13) < 128) {
                        StateObject stateObject = (StateObject) objArr[(i12 << 3) + i15];
                        map2 = map3;
                        StateRecord firstStateRecord = stateObject.getFirstStateRecord();
                        i11 = i13;
                        StateRecord readable = readable(firstStateRecord, j12, snapshotIdSet);
                        if (readable == null) {
                            jArr2 = jArr3;
                        } else {
                            jArr2 = jArr3;
                            StateRecord readable2 = readable(firstStateRecord, j12, or2);
                            if (readable2 != null && !g0.g(readable, readable2)) {
                                snapshotIdSet3 = or2;
                                StateRecord readable3 = readable(firstStateRecord, mutableSnapshot.getSnapshotId(), mutableSnapshot.getInvalid$runtime_release());
                                if (readable3 == null) {
                                    readError();
                                    throw new KotlinNothingValueException();
                                }
                                StateRecord mergeRecords = stateObject.mergeRecords(readable2, readable, readable3);
                                if (mergeRecords == null) {
                                    return map2;
                                }
                                if (hashMap == null) {
                                    hashMap = new HashMap();
                                }
                                hashMap.put(readable, mergeRecords);
                                hashMap = hashMap;
                            }
                        }
                        snapshotIdSet3 = or2;
                    } else {
                        jArr2 = jArr3;
                        map2 = map3;
                        snapshotIdSet3 = or2;
                        i11 = i13;
                    }
                    j13 >>= i11;
                    i15++;
                    j12 = j11;
                    map3 = map2;
                    i13 = i11;
                    jArr3 = jArr2;
                    or2 = snapshotIdSet3;
                }
                jArr = jArr3;
                map = map3;
                snapshotIdSet2 = or2;
                if (i14 != i13) {
                    return hashMap;
                }
            } else {
                jArr = jArr3;
                map = map3;
                snapshotIdSet2 = or2;
            }
            if (i12 == length) {
                return hashMap;
            }
            i12++;
            j12 = j11;
            map3 = map;
            jArr3 = jArr;
            or2 = snapshotIdSet2;
        }
    }

    public static final <T extends StateRecord, R> R overwritable(@k T t11, @k StateObject stateObject, @k T t12, @k l<? super T, ? extends R> lVar) {
        Snapshot current;
        R invoke;
        synchronized (getLock()) {
            try {
                current = Snapshot.Companion.getCurrent();
                invoke = lVar.invoke(overwritableRecord(t11, stateObject, current, t12));
                d0.d(1);
            } catch (Throwable th2) {
                d0.d(1);
                d0.c(1);
                throw th2;
            }
        }
        d0.c(1);
        notifyWrite(current, stateObject);
        return invoke;
    }

    @k
    public static final <T extends StateRecord> T overwritableRecord(@k T t11, @k StateObject stateObject, @k Snapshot snapshot, @k T t12) {
        T t13;
        if (snapshot.getReadOnly()) {
            snapshot.mo2069recordModified$runtime_release(stateObject);
        }
        long snapshotId = snapshot.getSnapshotId();
        if (t12.getSnapshotId$runtime_release() == snapshotId) {
            return t12;
        }
        synchronized (getLock()) {
            t13 = (T) newOverwritableRecordLocked(t11, stateObject);
        }
        t13.setSnapshotId$runtime_release(snapshotId);
        if (t12.getSnapshotId$runtime_release() != SnapshotId_jvmKt.toSnapshotId(1)) {
            snapshot.mo2069recordModified$runtime_release(stateObject);
        }
        return t13;
    }

    private static final boolean overwriteUnusedRecordsLocked(StateObject stateObject) {
        StateRecord stateRecord;
        long lowestOrDefault = pinningTable.lowestOrDefault(nextSnapshotId);
        StateRecord stateRecord2 = null;
        StateRecord stateRecord3 = null;
        int i11 = 0;
        for (StateRecord firstStateRecord = stateObject.getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext$runtime_release()) {
            long snapshotId$runtime_release = firstStateRecord.getSnapshotId$runtime_release();
            if (snapshotId$runtime_release != INVALID_SNAPSHOT) {
                if (snapshotId$runtime_release >= lowestOrDefault) {
                    i11++;
                } else if (stateRecord2 == null) {
                    i11++;
                    stateRecord2 = firstStateRecord;
                } else {
                    if (firstStateRecord.getSnapshotId$runtime_release() < stateRecord2.getSnapshotId$runtime_release()) {
                        stateRecord = stateRecord2;
                        stateRecord2 = firstStateRecord;
                    } else {
                        stateRecord = firstStateRecord;
                    }
                    if (stateRecord3 == null) {
                        stateRecord3 = stateObject.getFirstStateRecord();
                        StateRecord stateRecord4 = stateRecord3;
                        while (true) {
                            if (stateRecord3 == null) {
                                stateRecord3 = stateRecord4;
                                break;
                            }
                            if (stateRecord3.getSnapshotId$runtime_release() >= lowestOrDefault) {
                                break;
                            }
                            if (stateRecord4.getSnapshotId$runtime_release() < stateRecord3.getSnapshotId$runtime_release()) {
                                stateRecord4 = stateRecord3;
                            }
                            stateRecord3 = stateRecord3.getNext$runtime_release();
                        }
                    }
                    stateRecord2.setSnapshotId$runtime_release(INVALID_SNAPSHOT);
                    stateRecord2.assign(stateRecord3);
                    stateRecord2 = stateRecord;
                }
            }
        }
        return i11 > 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void processForUnusedRecordsLocked(StateObject stateObject) {
        if (overwriteUnusedRecordsLocked(stateObject)) {
            extraStateObjects.add(stateObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void readError() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends StateRecord> T readable(T t11, long j11, SnapshotIdSet snapshotIdSet) {
        T t12 = null;
        while (t11 != null) {
            if (valid(t11, j11, snapshotIdSet) && (t12 == null || t12.getSnapshotId$runtime_release() < t11.getSnapshotId$runtime_release())) {
                t12 = t11;
            }
            t11 = (T) t11.getNext$runtime_release();
        }
        if (t12 != null) {
            return t12;
        }
        return null;
    }

    public static final void releasePinningLocked(int i11) {
        pinningTable.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void reportReadonlySnapshotWrite() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T resetGlobalSnapshotLocked(GlobalSnapshot globalSnapshot2, l<? super SnapshotIdSet, ? extends T> lVar) {
        long snapshotId = globalSnapshot2.getSnapshotId();
        T invoke = lVar.invoke(openSnapshots.clear(snapshotId));
        long j11 = nextSnapshotId;
        nextSnapshotId = 1 + j11;
        openSnapshots = openSnapshots.clear(snapshotId);
        globalSnapshot2.setSnapshotId$runtime_release(j11);
        globalSnapshot2.setInvalid$runtime_release(openSnapshots);
        globalSnapshot2.setWriteCount$runtime_release(0);
        globalSnapshot2.setModified(null);
        globalSnapshot2.releasePinnedSnapshotLocked$runtime_release();
        openSnapshots = openSnapshots.set(j11);
        return invoke;
    }

    @v0
    public static final <T> T sync(@k x00.a<? extends T> aVar) {
        T invoke;
        synchronized (getLock()) {
            try {
                invoke = aVar.invoke();
                d0.d(1);
            } catch (Throwable th2) {
                d0.d(1);
                d0.c(1);
                throw th2;
            }
        }
        d0.c(1);
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends Snapshot> T takeNewSnapshot(final l<? super SnapshotIdSet, ? extends T> lVar) {
        return (T) advanceGlobalSnapshot(new l<SnapshotIdSet, T>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$takeNewSnapshot$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Incorrect return type in method signature: (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)TT; */
            @Override // x00.l
            public final Snapshot invoke(SnapshotIdSet snapshotIdSet) {
                SnapshotIdSet snapshotIdSet2;
                Snapshot snapshot = (Snapshot) lVar.invoke(snapshotIdSet);
                synchronized (SnapshotKt.getLock()) {
                    snapshotIdSet2 = SnapshotKt.openSnapshots;
                    SnapshotKt.openSnapshots = snapshotIdSet2.set(snapshot.getSnapshotId());
                    g2 g2Var = g2.f100423a;
                }
                return snapshot;
            }
        });
    }

    public static final int trackPinning(long j11, @k SnapshotIdSet snapshotIdSet) {
        int add;
        long lowest = snapshotIdSet.lowest(j11);
        synchronized (getLock()) {
            add = pinningTable.add(lowest);
        }
        return add;
    }

    private static final StateRecord usedLocked(StateObject stateObject) {
        long lowestOrDefault = pinningTable.lowestOrDefault(nextSnapshotId) - 1;
        SnapshotIdSet empty = SnapshotIdSet.Companion.getEMPTY();
        StateRecord stateRecord = null;
        for (StateRecord firstStateRecord = stateObject.getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext$runtime_release()) {
            if (firstStateRecord.getSnapshotId$runtime_release() != INVALID_SNAPSHOT) {
                if (valid(firstStateRecord, lowestOrDefault, empty)) {
                    if (stateRecord == null) {
                        stateRecord = firstStateRecord;
                    } else if (firstStateRecord.getSnapshotId$runtime_release() >= stateRecord.getSnapshotId$runtime_release()) {
                        return stateRecord;
                    }
                }
            }
            return firstStateRecord;
        }
        return null;
    }

    private static final boolean valid(long j11, long j12, SnapshotIdSet snapshotIdSet) {
        return (j12 == INVALID_SNAPSHOT || j12 > j11 || snapshotIdSet.get(j12)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateOpen(Snapshot snapshot) {
        long lowestOrDefault;
        if (openSnapshots.get(snapshot.getSnapshotId())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Snapshot is not open: snapshotId=");
        sb2.append(snapshot.getSnapshotId());
        sb2.append(", disposed=");
        sb2.append(snapshot.getDisposed$runtime_release());
        sb2.append(", applied=");
        MutableSnapshot mutableSnapshot = snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null;
        sb2.append(mutableSnapshot != null ? Boolean.valueOf(mutableSnapshot.getApplied$runtime_release()) : "read-only");
        sb2.append(", lowestPin=");
        synchronized (getLock()) {
            lowestOrDefault = pinningTable.lowestOrDefault(-1L);
        }
        sb2.append(lowestOrDefault);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public static final <T extends StateRecord, R> R withCurrent(@k T t11, @k l<? super T, ? extends R> lVar) {
        return lVar.invoke(current(t11));
    }

    public static final <T extends StateRecord, R> R writable(@k T t11, @k StateObject stateObject, @k Snapshot snapshot, @k l<? super T, ? extends R> lVar) {
        R invoke;
        synchronized (getLock()) {
            try {
                invoke = lVar.invoke(writableRecord(t11, stateObject, snapshot));
                d0.d(1);
            } catch (Throwable th2) {
                d0.d(1);
                d0.c(1);
                throw th2;
            }
        }
        d0.c(1);
        notifyWrite(snapshot, stateObject);
        return invoke;
    }

    @v0
    @k
    public static final <T extends StateRecord> T writableRecord(@k T t11, @k StateObject stateObject, @k Snapshot snapshot) {
        T t12;
        if (snapshot.getReadOnly()) {
            snapshot.mo2069recordModified$runtime_release(stateObject);
        }
        long snapshotId = snapshot.getSnapshotId();
        T t13 = (T) readable(t11, snapshotId, snapshot.getInvalid$runtime_release());
        if (t13 == null) {
            readError();
            throw new KotlinNothingValueException();
        }
        if (t13.getSnapshotId$runtime_release() == snapshot.getSnapshotId()) {
            return t13;
        }
        synchronized (getLock()) {
            t12 = (T) readable(stateObject.getFirstStateRecord(), snapshotId, snapshot.getInvalid$runtime_release());
            if (t12 == null) {
                readError();
                throw new KotlinNothingValueException();
            }
            if (t12.getSnapshotId$runtime_release() != snapshotId) {
                t12 = (T) newWritableRecordLocked(t12, stateObject, snapshot);
            }
        }
        g0.n(t12, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.writableRecord");
        if (t13.getSnapshotId$runtime_release() != SnapshotId_jvmKt.toSnapshotId(1)) {
            snapshot.mo2069recordModified$runtime_release(stateObject);
        }
        return t12;
    }

    private static final boolean valid(StateRecord stateRecord, long j11, SnapshotIdSet snapshotIdSet) {
        return valid(j11, stateRecord.getSnapshotId$runtime_release(), snapshotIdSet);
    }

    @k
    public static final <T extends StateRecord> T readable(@k T t11, @k StateObject stateObject) {
        T t12;
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot current = companion.getCurrent();
        l<Object, g2> readObserver = current.getReadObserver();
        if (readObserver != null) {
            readObserver.invoke(stateObject);
        }
        T t13 = (T) readable(t11, current.getSnapshotId(), current.getInvalid$runtime_release());
        if (t13 != null) {
            return t13;
        }
        synchronized (getLock()) {
            Snapshot current2 = companion.getCurrent();
            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
            g0.n(firstStateRecord, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            t12 = (T) readable(firstStateRecord, current2.getSnapshotId(), current2.getInvalid$runtime_release());
            if (t12 == null) {
                readError();
                throw new KotlinNothingValueException();
            }
        }
        return t12;
    }

    public static final <T extends StateRecord, R> R writable(@k T t11, @k StateObject stateObject, @k l<? super T, ? extends R> lVar) {
        Snapshot current;
        R invoke;
        synchronized (getLock()) {
            try {
                current = Snapshot.Companion.getCurrent();
                invoke = lVar.invoke(writableRecord(t11, stateObject, current));
                d0.d(1);
            } catch (Throwable th2) {
                d0.d(1);
                d0.c(1);
                throw th2;
            }
        }
        d0.c(1);
        notifyWrite(current, stateObject);
        return invoke;
    }

    @v0
    @k
    public static final <T extends StateRecord> T current(@k T t11) {
        T t12;
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot current = companion.getCurrent();
        T t13 = (T) readable(t11, current.getSnapshotId(), current.getInvalid$runtime_release());
        if (t13 != null) {
            return t13;
        }
        synchronized (getLock()) {
            Snapshot current2 = companion.getCurrent();
            t12 = (T) readable(t11, current2.getSnapshotId(), current2.getInvalid$runtime_release());
        }
        if (t12 != null) {
            return t12;
        }
        readError();
        throw new KotlinNothingValueException();
    }

    @k
    public static final <T extends StateRecord> T readable(@k T t11, @k StateObject stateObject, @k Snapshot snapshot) {
        T t12;
        l<Object, g2> readObserver = snapshot.getReadObserver();
        if (readObserver != null) {
            readObserver.invoke(stateObject);
        }
        T t13 = (T) readable(t11, snapshot.getSnapshotId(), snapshot.getInvalid$runtime_release());
        if (t13 != null) {
            return t13;
        }
        synchronized (getLock()) {
            Snapshot current = Snapshot.Companion.getCurrent();
            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
            g0.n(firstStateRecord, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            t12 = (T) readable(firstStateRecord, current.getSnapshotId(), current.getInvalid$runtime_release());
            if (t12 == null) {
                readError();
                throw new KotlinNothingValueException();
            }
        }
        return t12;
    }

    @v0
    public static /* synthetic */ void getLock$annotations() {
    }

    @v0
    public static /* synthetic */ void getSnapshotInitializer$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void advanceGlobalSnapshot() {
        advanceGlobalSnapshot(emptyLambda);
    }
}
