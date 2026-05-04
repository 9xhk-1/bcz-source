package androidx.compose.runtime.snapshots;

import a00.q;
import a00.r0;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserver;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/MutableSnapshot\n+ 2 SnapshotObserver.kt\nandroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 4 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 7 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 8 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 9 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 10 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,2487:1\n1101#1,2:2500\n1107#1,3:2506\n1110#1:2513\n1111#1,5:2515\n1101#1,2:2610\n1107#1,3:2617\n1110#1:2624\n1111#1,5:2626\n1101#1,9:2718\n1110#1:2731\n1111#1,5:2733\n193#2,12:2488\n205#2,2:2520\n193#2,12:2598\n205#2,2:2631\n1894#3,2:2502\n1894#3,2:2509\n1894#3,2:2522\n1894#3,2:2538\n1894#3,2:2612\n1894#3,2:2620\n1894#3,2:2703\n1894#3,2:2714\n1894#3,2:2727\n1894#3,2:2738\n1894#3,2:2742\n33#4,2:2504\n33#4,2:2511\n33#4,2:2524\n33#4,2:2540\n33#4,2:2614\n33#4,2:2622\n33#4,2:2705\n33#4,2:2716\n33#4,2:2729\n33#4,2:2740\n33#4,2:2744\n1#5:2514\n1#5:2616\n1#5:2625\n1#5:2691\n1#5:2732\n1#5:2746\n33#6,6:2526\n33#6,6:2532\n33#6,6:2592\n33#6,4:2699\n38#6:2707\n33#6,6:2708\n231#7,3:2542\n200#7,7:2545\n211#7,3:2553\n214#7,9:2557\n234#7:2566\n231#7,3:2567\n200#7,7:2570\n211#7,3:2578\n214#7,9:2582\n234#7:2591\n231#7,3:2649\n200#7,7:2652\n211#7,3:2660\n214#7,9:2664\n234#7:2673\n231#7,3:2674\n200#7,7:2677\n211#7,3:2685\n214#7,2:2689\n217#7,6:2692\n234#7:2698\n1399#8:2552\n1270#8:2556\n1399#8:2577\n1270#8:2581\n1399#8:2659\n1270#8:2663\n1399#8:2684\n1270#8:2688\n33#9,5:2633\n48#9,5:2638\n48#9,5:2644\n205#10:2643\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/MutableSnapshot\n*L\n771#1:2500,2\n771#1:2506,3\n771#1:2513\n771#1:2515,5\n923#1:2610,2\n923#1:2617,3\n923#1:2624\n923#1:2626,5\n1118#1:2718,9\n1118#1:2731\n1118#1:2733,5\n768#1:2488,12\n768#1:2520,2\n917#1:2598,12\n917#1:2631,2\n772#1:2502,2\n771#1:2509,2\n830#1:2522,2\n886#1:2538,2\n924#1:2612,2\n923#1:2620,2\n1084#1:2703,2\n1109#1:2714,2\n1118#1:2727,2\n1121#1:2738,2\n1142#1:2742,2\n772#1:2504,2\n771#1:2511,2\n830#1:2524,2\n886#1:2540,2\n924#1:2614,2\n923#1:2622,2\n1084#1:2705,2\n1109#1:2716,2\n1118#1:2729,2\n1121#1:2740,2\n1142#1:2744,2\n771#1:2514\n923#1:2625\n1118#1:2732\n872#1:2526,6\n878#1:2532,6\n891#1:2592,6\n1081#1:2699,4\n1081#1:2707\n1092#1:2708,6\n889#1:2542,3\n889#1:2545,7\n889#1:2553,3\n889#1:2557,9\n889#1:2566\n890#1:2567,3\n890#1:2570,7\n890#1:2578,3\n890#1:2582,9\n890#1:2591\n989#1:2649,3\n989#1:2652,7\n989#1:2660,3\n989#1:2664,9\n989#1:2673\n1024#1:2674,3\n1024#1:2677,7\n1024#1:2685,3\n1024#1:2689,2\n1024#1:2692,6\n1024#1:2698\n889#1:2552\n889#1:2556\n890#1:2577\n890#1:2581\n989#1:2659\n989#1:2663\n1024#1:2684\n1024#1:2688\n943#1:2633,5\n967#1:2638,5\n971#1:2644,5\n971#1:2643\n*E\n"})
/* loaded from: classes.dex */
public class MutableSnapshot extends Snapshot {
    private boolean applied;

    @l
    private List<? extends StateObject> merged;

    @l
    private MutableScatterSet<StateObject> modified;

    @k
    private SnapshotIdSet previousIds;

    @k
    private int[] previousPinnedSnapshots;

    @l
    private final x00.l<Object, g2> readObserver;
    private int snapshots;
    private int writeCount;

    @l
    private final x00.l<Object, g2> writeObserver;

    @k
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @k
    private static final int[] EmptyIntArray = new int[0];

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    public MutableSnapshot(long j11, @k SnapshotIdSet snapshotIdSet, @l x00.l<Object, g2> lVar, @l x00.l<Object, g2> lVar2) {
        super(j11, snapshotIdSet, (v) null);
        this.readObserver = lVar;
        this.writeObserver = lVar2;
        this.previousIds = SnapshotIdSet.Companion.getEMPTY();
        this.previousPinnedSnapshots = EmptyIntArray;
        this.snapshots = 1;
    }

    private final void abandon() {
        long j11;
        MutableScatterSet<StateObject> modified$runtime_release = getModified$runtime_release();
        if (modified$runtime_release != null) {
            validateNotApplied();
            setModified(null);
            long snapshotId = getSnapshotId();
            Object[] objArr = modified$runtime_release.elements;
            long[] jArr = modified$runtime_release.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j12 = jArr[i11];
                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((255 & j12) < 128) {
                                for (StateRecord firstStateRecord = ((StateObject) objArr[(i11 << 3) + i13]).getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext$runtime_release()) {
                                    if (firstStateRecord.getSnapshotId$runtime_release() == snapshotId || r0.a2(this.previousIds, Long.valueOf(firstStateRecord.getSnapshotId$runtime_release()))) {
                                        j11 = SnapshotKt.INVALID_SNAPSHOT;
                                        firstStateRecord.setSnapshotId$runtime_release(j11);
                                    }
                                }
                            }
                            j12 >>= 8;
                        }
                        if (i12 != 8) {
                            break;
                        }
                    }
                    if (i11 == length) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        closeAndReleasePinning$runtime_release();
    }

    private final void releasePreviouslyPinnedSnapshotsLocked() {
        int length = this.previousPinnedSnapshots.length;
        for (int i11 = 0; i11 < length; i11++) {
            SnapshotKt.releasePinningLocked(this.previousPinnedSnapshots[i11]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MutableSnapshot takeNestedMutableSnapshot$default(MutableSnapshot mutableSnapshot, x00.l lVar, x00.l lVar2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedMutableSnapshot");
        }
        if ((i11 & 1) != 0) {
            lVar = null;
        }
        if ((i11 & 2) != 0) {
            lVar2 = null;
        }
        return mutableSnapshot.takeNestedMutableSnapshot(lVar, lVar2);
    }

    private final void validateNotApplied() {
        if (this.applied) {
            PreconditionsKt.throwIllegalStateException("Unsupported operation on a snapshot that has been applied");
        }
    }

    private final void validateNotAppliedOrPinned() {
        if (!this.applied || ((Snapshot) this).pinningTrackingHandle >= 0) {
            return;
        }
        PreconditionsKt.throwIllegalStateException("Unsupported operation on a disposed or applied snapshot");
    }

    public final <T> T advance$runtime_release(@k x00.a<? extends T> aVar) {
        long j11;
        long j12;
        SnapshotIdSet snapshotIdSet;
        recordPrevious$runtime_release(getSnapshotId());
        T invoke = aVar.invoke();
        if (getApplied$runtime_release() || getDisposed$runtime_release()) {
            return invoke;
        }
        long snapshotId = getSnapshotId();
        synchronized (SnapshotKt.getLock()) {
            try {
                j11 = SnapshotKt.nextSnapshotId;
                j12 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId = j12 + 1;
                setSnapshotId$runtime_release(j11);
                snapshotIdSet = SnapshotKt.openSnapshots;
                SnapshotKt.openSnapshots = snapshotIdSet.set(getSnapshotId());
                g2 g2Var = g2.f100423a;
                d0.d(1);
            } catch (Throwable th2) {
                d0.d(1);
                d0.c(1);
                throw th2;
            }
        }
        d0.c(1);
        setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), snapshotId + 1, getSnapshotId()));
        return invoke;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00db A[LOOP:1: B:32:0x00d9->B:33:0x00db, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0147 A[Catch: all -> 0x0133, TryCatch #0 {all -> 0x0133, blocks: (B:38:0x00ef, B:40:0x00ff, B:43:0x010b, B:45:0x0117, B:47:0x0121, B:49:0x0127, B:51:0x0136, B:57:0x0147, B:60:0x0151, B:62:0x015b, B:64:0x0165, B:66:0x016b, B:68:0x0175, B:74:0x017d, B:76:0x0180, B:78:0x0184, B:80:0x018e, B:82:0x019a, B:88:0x013e), top: B:37:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0184 A[Catch: all -> 0x0133, TryCatch #0 {all -> 0x0133, blocks: (B:38:0x00ef, B:40:0x00ff, B:43:0x010b, B:45:0x0117, B:47:0x0121, B:49:0x0127, B:51:0x0136, B:57:0x0147, B:60:0x0151, B:62:0x015b, B:64:0x0165, B:66:0x016b, B:68:0x0175, B:74:0x017d, B:76:0x0180, B:78:0x0184, B:80:0x018e, B:82:0x019a, B:88:0x013e), top: B:37:0x00ef }] */
    @m80.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.runtime.snapshots.SnapshotApplyResult apply() {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.MutableSnapshot.apply():androidx.compose.runtime.snapshots.SnapshotApplyResult");
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void closeLocked$runtime_release() {
        SnapshotIdSet snapshotIdSet;
        snapshotIdSet = SnapshotKt.openSnapshots;
        SnapshotKt.openSnapshots = snapshotIdSet.clear(getSnapshotId()).andNot(this.previousIds);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed$runtime_release()) {
            return;
        }
        super.dispose();
        mo2068nestedDeactivated$runtime_release(this);
        SnapshotObserverKt.dispatchObserverOnPreDispose(this);
    }

    public final boolean getApplied$runtime_release() {
        return this.applied;
    }

    @l
    public final List<StateObject> getMerged$runtime_release() {
        return this.merged;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @l
    public MutableScatterSet<StateObject> getModified$runtime_release() {
        return this.modified;
    }

    @k
    public final SnapshotIdSet getPreviousIds$runtime_release() {
        return this.previousIds;
    }

    @k
    public final int[] getPreviousPinnedSnapshots$runtime_release() {
        return this.previousPinnedSnapshots;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @l
    /* renamed from: getReadObserver$runtime_release */
    public x00.l<Object, g2> getReadObserver() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public int getWriteCount$runtime_release() {
        return this.writeCount;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @l
    public x00.l<Object, g2> getWriteObserver$runtime_release() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        MutableScatterSet<StateObject> modified$runtime_release = getModified$runtime_release();
        return modified$runtime_release != null && modified$runtime_release.isNotEmpty();
    }

    @k
    public final SnapshotApplyResult innerApplyLocked$runtime_release(long j11, @k MutableScatterSet<StateObject> mutableScatterSet, @l Map<StateRecord, ? extends StateRecord> map, @k SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSet2;
        Object[] objArr;
        long[] jArr;
        SnapshotIdSet snapshotIdSet3;
        Object[] objArr2;
        long[] jArr2;
        int i11;
        long j12;
        int i12;
        StateRecord readable;
        StateRecord readable2;
        StateRecord readable3;
        StateRecord mergeRecords;
        SnapshotIdSet or2 = getInvalid$runtime_release().set(getSnapshotId()).or(this.previousIds);
        Object[] objArr3 = mutableScatterSet.elements;
        long[] jArr3 = mutableScatterSet.metadata;
        int length = jArr3.length - 2;
        ArrayList arrayList = null;
        List<? extends StateObject> list = null;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j13 = jArr3[i13];
                List<? extends StateObject> list2 = list;
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8;
                    int i15 = 8 - ((~(i13 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j13 & 255) < 128) {
                            i11 = i14;
                            StateObject stateObject = (StateObject) objArr3[(i13 << 3) + i16];
                            objArr2 = objArr3;
                            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
                            jArr2 = jArr3;
                            ArrayList arrayList2 = arrayList;
                            readable = SnapshotKt.readable(firstStateRecord, j11, snapshotIdSet);
                            if (readable == null) {
                                j12 = j13;
                            } else {
                                j12 = j13;
                                readable2 = SnapshotKt.readable(firstStateRecord, getSnapshotId(), or2);
                                if (readable2 != null && readable2.getSnapshotId$runtime_release() != SnapshotId_jvmKt.toSnapshotId(1) && !g0.g(readable, readable2)) {
                                    i12 = i16;
                                    snapshotIdSet3 = or2;
                                    readable3 = SnapshotKt.readable(firstStateRecord, getSnapshotId(), getInvalid$runtime_release());
                                    if (readable3 == null) {
                                        SnapshotKt.readError();
                                        throw new KotlinNothingValueException();
                                    }
                                    if (map == null || (mergeRecords = map.get(readable)) == null) {
                                        mergeRecords = stateObject.mergeRecords(readable2, readable, readable3);
                                    }
                                    if (mergeRecords == null) {
                                        return new SnapshotApplyResult.Failure(this);
                                    }
                                    if (!g0.g(mergeRecords, readable3)) {
                                        if (g0.g(mergeRecords, readable)) {
                                            ArrayList arrayList3 = arrayList2 == null ? new ArrayList() : arrayList2;
                                            arrayList3.add(h1.a(stateObject, readable.create(getSnapshotId())));
                                            if (list2 == null) {
                                                list2 = new ArrayList<>();
                                            }
                                            List<? extends StateObject> list3 = list2;
                                            list3.add(stateObject);
                                            arrayList = arrayList3;
                                            list2 = list3;
                                        } else {
                                            arrayList = arrayList2 == null ? new ArrayList() : arrayList2;
                                            arrayList.add(!g0.g(mergeRecords, readable2) ? h1.a(stateObject, mergeRecords) : h1.a(stateObject, readable2.create(getSnapshotId())));
                                        }
                                    }
                                    arrayList = arrayList2;
                                }
                            }
                            snapshotIdSet3 = or2;
                            i12 = i16;
                            arrayList = arrayList2;
                        } else {
                            snapshotIdSet3 = or2;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i11 = i14;
                            j12 = j13;
                            i12 = i16;
                        }
                        j13 = j12 >> i11;
                        i16 = i12 + 1;
                        objArr3 = objArr2;
                        i14 = i11;
                        jArr3 = jArr2;
                        or2 = snapshotIdSet3;
                    }
                    snapshotIdSet2 = or2;
                    objArr = objArr3;
                    jArr = jArr3;
                    ArrayList arrayList4 = arrayList;
                    if (i15 != i14) {
                        list = list2;
                        arrayList = arrayList4;
                        break;
                    }
                    arrayList = arrayList4;
                } else {
                    snapshotIdSet2 = or2;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                list = list2;
                if (i13 == length) {
                    break;
                }
                i13++;
                objArr3 = objArr;
                jArr3 = jArr;
                or2 = snapshotIdSet2;
            }
        }
        if (arrayList != null) {
            advance$runtime_release();
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                Pair pair = (Pair) arrayList.get(i17);
                StateObject stateObject2 = (StateObject) pair.component1();
                StateRecord stateRecord = (StateRecord) pair.component2();
                stateRecord.setSnapshotId$runtime_release(j11);
                synchronized (SnapshotKt.getLock()) {
                    stateRecord.setNext$runtime_release(stateObject2.getFirstStateRecord());
                    stateObject2.prependStateRecord(stateRecord);
                    g2 g2Var = g2.f100423a;
                }
            }
        }
        if (list != null) {
            int size2 = list.size();
            for (int i18 = 0; i18 < size2; i18++) {
                mutableScatterSet.remove(list.get(i18));
            }
            List<? extends StateObject> list4 = this.merged;
            if (list4 != null) {
                list = r0.I4(list4, list);
            }
            this.merged = list;
        }
        return SnapshotApplyResult.Success.INSTANCE;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedActivated$runtime_release */
    public void mo2067nestedActivated$runtime_release(@k Snapshot snapshot) {
        this.snapshots++;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedDeactivated$runtime_release */
    public void mo2068nestedDeactivated$runtime_release(@k Snapshot snapshot) {
        if (!(this.snapshots > 0)) {
            PreconditionsKt.throwIllegalArgumentException("no pending nested snapshots");
        }
        int i11 = this.snapshots - 1;
        this.snapshots = i11;
        if (i11 != 0 || this.applied) {
            return;
        }
        abandon();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        if (this.applied || getDisposed$runtime_release()) {
            return;
        }
        advance$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: recordModified$runtime_release */
    public void mo2069recordModified$runtime_release(@k StateObject stateObject) {
        MutableScatterSet<StateObject> modified$runtime_release = getModified$runtime_release();
        if (modified$runtime_release == null) {
            modified$runtime_release = ScatterSetKt.mutableScatterSetOf();
            setModified(modified$runtime_release);
        }
        modified$runtime_release.add(stateObject);
    }

    public final void recordPrevious$runtime_release(long j11) {
        synchronized (SnapshotKt.getLock()) {
            this.previousIds = this.previousIds.set(j11);
            g2 g2Var = g2.f100423a;
        }
    }

    public final void recordPreviousList$runtime_release(@k SnapshotIdSet snapshotIdSet) {
        synchronized (SnapshotKt.getLock()) {
            this.previousIds = this.previousIds.or(snapshotIdSet);
            g2 g2Var = g2.f100423a;
        }
    }

    public final void recordPreviousPinnedSnapshot$runtime_release(int i11) {
        if (i11 >= 0) {
            this.previousPinnedSnapshots = q.q3(this.previousPinnedSnapshots, i11);
        }
    }

    public final void recordPreviousPinnedSnapshots$runtime_release(@k int[] iArr) {
        if (iArr.length == 0) {
            return;
        }
        int[] iArr2 = this.previousPinnedSnapshots;
        if (iArr2.length != 0) {
            iArr = q.s3(iArr2, iArr);
        }
        this.previousPinnedSnapshots = iArr;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void releasePinnedSnapshotsForCloseLocked$runtime_release() {
        releasePreviouslyPinnedSnapshotsLocked();
        super.releasePinnedSnapshotsForCloseLocked$runtime_release();
    }

    public final void setApplied$runtime_release(boolean z11) {
        this.applied = z11;
    }

    public final void setMerged$runtime_release(@l List<? extends StateObject> list) {
        this.merged = list;
    }

    public void setModified(@l MutableScatterSet<StateObject> mutableScatterSet) {
        this.modified = mutableScatterSet;
    }

    public final void setPreviousIds$runtime_release(@k SnapshotIdSet snapshotIdSet) {
        this.previousIds = snapshotIdSet;
    }

    public final void setPreviousPinnedSnapshots$runtime_release(@k int[] iArr) {
        this.previousPinnedSnapshots = iArr;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setWriteCount$runtime_release(int i11) {
        this.writeCount = i11;
    }

    @k
    public MutableSnapshot takeNestedMutableSnapshot(@l x00.l<Object, g2> lVar, @l x00.l<Object, g2> lVar2) {
        Map<SnapshotObserver, SnapshotInstanceObservers> map;
        long j11;
        long j12;
        SnapshotIdSet snapshotIdSet;
        NestedMutableSnapshot nestedMutableSnapshot;
        x00.l mergedWriteObserver;
        long j13;
        long j14;
        SnapshotIdSet snapshotIdSet2;
        validateNotDisposed$runtime_release();
        validateNotAppliedOrPinned();
        PersistentList persistentList = SnapshotObserverKt.observers;
        x00.l<Object, g2> lVar3 = lVar;
        x00.l<Object, g2> lVar4 = lVar2;
        if (persistentList != null) {
            Pair<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> mergeObservers = SnapshotObserverKt.mergeObservers(persistentList, this, false, lVar3, lVar4);
            SnapshotInstanceObservers first = mergeObservers.getFirst();
            x00.l<Object, g2> readObserver = first.getReadObserver();
            lVar4 = first.getWriteObserver();
            map = mergeObservers.getSecond();
            lVar3 = readObserver;
        } else {
            map = null;
        }
        recordPrevious$runtime_release(getSnapshotId());
        synchronized (SnapshotKt.getLock()) {
            j11 = SnapshotKt.nextSnapshotId;
            j12 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = j12 + 1;
            snapshotIdSet = SnapshotKt.openSnapshots;
            SnapshotKt.openSnapshots = snapshotIdSet.set(j11);
            SnapshotIdSet invalid$runtime_release = getInvalid$runtime_release();
            setInvalid$runtime_release(invalid$runtime_release.set(j11));
            SnapshotIdSet addRange = SnapshotKt.addRange(invalid$runtime_release, getSnapshotId() + 1, j11);
            x00.l mergedReadObserver$default = SnapshotKt.mergedReadObserver$default(lVar3, getReadObserver(), false, 4, null);
            mergedWriteObserver = SnapshotKt.mergedWriteObserver(lVar4, getWriteObserver$runtime_release());
            nestedMutableSnapshot = new NestedMutableSnapshot(j11, addRange, mergedReadObserver$default, mergedWriteObserver, this);
        }
        if (!getApplied$runtime_release() && !getDisposed$runtime_release()) {
            long snapshotId = getSnapshotId();
            synchronized (SnapshotKt.getLock()) {
                j13 = SnapshotKt.nextSnapshotId;
                j14 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId = j14 + 1;
                setSnapshotId$runtime_release(j13);
                snapshotIdSet2 = SnapshotKt.openSnapshots;
                SnapshotKt.openSnapshots = snapshotIdSet2.set(getSnapshotId());
                g2 g2Var = g2.f100423a;
            }
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), snapshotId + 1, getSnapshotId()));
        }
        if (persistentList != null) {
            SnapshotObserverKt.dispatchCreatedObservers(persistentList, this, nestedMutableSnapshot, map);
        }
        return nestedMutableSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @k
    public Snapshot takeNestedSnapshot(@l x00.l<Object, g2> lVar) {
        x00.l<Object, g2> lVar2;
        Map<SnapshotObserver, SnapshotInstanceObservers> map;
        long j11;
        long j12;
        SnapshotIdSet snapshotIdSet;
        NestedReadonlySnapshot nestedReadonlySnapshot;
        long j13;
        long j14;
        SnapshotIdSet snapshotIdSet2;
        validateNotDisposed$runtime_release();
        validateNotAppliedOrPinned();
        long snapshotId = getSnapshotId();
        MutableSnapshot mutableSnapshot = this instanceof GlobalSnapshot ? null : this;
        PersistentList persistentList = SnapshotObserverKt.observers;
        if (persistentList != null) {
            Pair<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> mergeObservers = SnapshotObserverKt.mergeObservers(persistentList, mutableSnapshot, true, lVar, null);
            SnapshotInstanceObservers first = mergeObservers.getFirst();
            x00.l<Object, g2> readObserver = first.getReadObserver();
            first.getWriteObserver();
            lVar2 = readObserver;
            map = mergeObservers.getSecond();
        } else {
            lVar2 = lVar;
            map = null;
        }
        recordPrevious$runtime_release(getSnapshotId());
        synchronized (SnapshotKt.getLock()) {
            j11 = SnapshotKt.nextSnapshotId;
            j12 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = j12 + 1;
            snapshotIdSet = SnapshotKt.openSnapshots;
            SnapshotKt.openSnapshots = snapshotIdSet.set(j11);
            nestedReadonlySnapshot = new NestedReadonlySnapshot(j11, SnapshotKt.addRange(getInvalid$runtime_release(), snapshotId + 1, j11), SnapshotKt.mergedReadObserver$default(lVar2, getReadObserver(), false, 4, null), this);
        }
        if (!getApplied$runtime_release() && !getDisposed$runtime_release()) {
            long snapshotId2 = getSnapshotId();
            synchronized (SnapshotKt.getLock()) {
                j13 = SnapshotKt.nextSnapshotId;
                j14 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId = j14 + 1;
                setSnapshotId$runtime_release(j13);
                snapshotIdSet2 = SnapshotKt.openSnapshots;
                SnapshotKt.openSnapshots = snapshotIdSet2.set(getSnapshotId());
                g2 g2Var = g2.f100423a;
            }
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), snapshotId2 + 1, getSnapshotId()));
        }
        if (persistentList != null) {
            SnapshotObserverKt.dispatchCreatedObservers(persistentList, mutableSnapshot, nestedReadonlySnapshot, map);
        }
        return nestedReadonlySnapshot;
    }

    public final void advance$runtime_release() {
        long j11;
        long j12;
        SnapshotIdSet snapshotIdSet;
        recordPrevious$runtime_release(getSnapshotId());
        g2 g2Var = g2.f100423a;
        if (getApplied$runtime_release() || getDisposed$runtime_release()) {
            return;
        }
        long snapshotId = getSnapshotId();
        synchronized (SnapshotKt.getLock()) {
            j11 = SnapshotKt.nextSnapshotId;
            j12 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = j12 + 1;
            setSnapshotId$runtime_release(j11);
            snapshotIdSet = SnapshotKt.openSnapshots;
            SnapshotKt.openSnapshots = snapshotIdSet.set(getSnapshotId());
        }
        setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), snapshotId + 1, getSnapshotId()));
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @k
    public Snapshot getRoot() {
        return this;
    }
}
