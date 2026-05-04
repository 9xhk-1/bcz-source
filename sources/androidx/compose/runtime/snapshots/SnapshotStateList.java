package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.u0;
import m80.k;
import w00.j;
import x00.l;
import y00.e;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 4 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,539:1\n183#1:540\n216#1,9:548\n225#1:559\n183#1:560\n226#1,9:562\n180#1:571\n235#1,6:581\n209#1,16:587\n225#1:605\n183#1:606\n226#1,9:608\n180#1:617\n235#1,6:627\n214#1:633\n216#1,9:634\n225#1:645\n183#1:646\n226#1,9:648\n180#1:657\n235#1,6:667\n180#1:673\n216#1,9:686\n225#1:697\n183#1:698\n226#1,9:700\n180#1:709\n235#1,6:719\n216#1,9:725\n225#1:736\n183#1:737\n226#1,9:739\n180#1:748\n235#1,6:758\n209#1,16:765\n225#1:783\n183#1:784\n226#1,9:786\n180#1:795\n235#1,6:805\n214#1:811\n213#1,12:813\n225#1:827\n183#1:828\n226#1,9:830\n180#1:839\n235#1,6:849\n214#1:855\n188#1,5:856\n193#1:863\n183#1:864\n194#1,9:866\n180#1:875\n204#1,3:885\n188#1,5:888\n193#1:895\n183#1:896\n194#1,9:898\n180#1:907\n204#1,3:917\n183#1:920\n188#1,5:934\n193#1:941\n183#1:942\n194#1,9:944\n180#1:953\n204#1,3:963\n183#1:968\n180#1:970\n219#1,6:982\n225#1:990\n183#1:991\n226#1,9:993\n180#1:1002\n235#1,6:1012\n219#1,7:1018\n183#1:1025\n226#1,9:1027\n180#1:1036\n235#1,6:1045\n183#1:1053\n180#1:1055\n183#1:1069\n180#1:1071\n2475#2:541\n2475#2:547\n2475#2:561\n2365#2,2:572\n1894#2,2:574\n2367#2,4:576\n2475#2:607\n2365#2,2:618\n1894#2,2:620\n2367#2,4:622\n2475#2:647\n2365#2,2:658\n1894#2,2:660\n2367#2,4:662\n2365#2,2:674\n1894#2,2:676\n2367#2,2:680\n2370#2:684\n2475#2:699\n2365#2,2:710\n1894#2,2:712\n2367#2,4:714\n2475#2:738\n2365#2,2:749\n1894#2,2:751\n2367#2,4:753\n2475#2:785\n2365#2,2:796\n1894#2,2:798\n2367#2,4:800\n2475#2:829\n2365#2,2:840\n1894#2,2:842\n2367#2,4:844\n2475#2:865\n2365#2,2:876\n1894#2,2:878\n2367#2,4:880\n2475#2:897\n2365#2,2:908\n1894#2,2:910\n2367#2,4:912\n2475#2:921\n2365#2,2:922\n1894#2,2:924\n2367#2,4:928\n2475#2:933\n2475#2:943\n2365#2,2:954\n1894#2,2:956\n2367#2,4:958\n2475#2:969\n2365#2,2:971\n1894#2,2:973\n2367#2,4:977\n2475#2:992\n2365#2,2:1003\n1894#2,2:1005\n2367#2,4:1007\n2475#2:1026\n2365#2,2:1037\n1894#2,2:1039\n2367#2,4:1041\n2475#2:1054\n2365#2,2:1056\n1894#2,2:1058\n2367#2,4:1062\n2475#2:1070\n2365#2,2:1072\n1894#2,2:1074\n2367#2,4:1078\n33#3,5:542\n33#4,2:557\n33#4,2:603\n33#4,2:643\n33#4,2:678\n33#4,2:682\n33#4,2:695\n33#4,2:734\n33#4,2:781\n33#4,2:825\n33#4,2:861\n33#4,2:893\n33#4,2:926\n33#4,2:939\n33#4,2:966\n33#4,2:975\n33#4,2:988\n33#4,2:1051\n33#4,2:1060\n33#4,2:1067\n33#4,2:1076\n33#4,2:1082\n1#5:580\n1#5:626\n1#5:666\n1#5:685\n1#5:718\n1#5:757\n1#5:764\n1#5:804\n1#5:812\n1#5:848\n1#5:884\n1#5:916\n1#5:932\n1#5:962\n1#5:981\n1#5:1011\n1#5:1066\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n*L\n67#1:540\n129#1:548,9\n129#1:559\n129#1:560\n129#1:562,9\n129#1:571\n129#1:581,6\n131#1:587,16\n131#1:605\n131#1:606\n131#1:608,9\n131#1:617\n131#1:627,6\n131#1:633\n137#1:634,9\n137#1:645\n137#1:646\n137#1:648,9\n137#1:657\n137#1:667,6\n140#1:673\n149#1:686,9\n149#1:697\n149#1:698\n149#1:700,9\n149#1:709\n149#1:719,6\n151#1:725,9\n151#1:736\n151#1:737\n151#1:739,9\n151#1:748\n151#1:758,6\n153#1:765,16\n153#1:783\n153#1:784\n153#1:786,9\n153#1:795\n153#1:805,6\n153#1:811\n158#1:813,12\n158#1:827\n158#1:828\n158#1:830,9\n158#1:839\n158#1:849,6\n158#1:855\n161#1:856,5\n161#1:863\n161#1:864\n161#1:866,9\n161#1:875\n161#1:885,3\n166#1:888,5\n166#1:895\n166#1:896\n166#1:898,9\n166#1:907\n166#1:917,3\n176#1:920\n185#1:934,5\n185#1:941\n185#1:942\n185#1:944,9\n185#1:953\n185#1:963,3\n193#1:968\n202#1:970\n213#1:982,6\n213#1:990\n213#1:991\n213#1:993,9\n213#1:1002\n213#1:1012,6\n213#1:1018,7\n213#1:1025\n213#1:1027,9\n213#1:1036\n213#1:1045,6\n225#1:1053\n234#1:1055\n225#1:1069\n234#1:1071\n67#1:541\n125#1:547\n129#1:561\n129#1:572,2\n129#1:574,2\n129#1:576,4\n131#1:607\n131#1:618,2\n131#1:620,2\n131#1:622,4\n137#1:647\n137#1:658,2\n137#1:660,2\n137#1:662,4\n140#1:674,2\n140#1:676,2\n140#1:680,2\n140#1:684\n149#1:699\n149#1:710,2\n149#1:712,2\n149#1:714,4\n151#1:738\n151#1:749,2\n151#1:751,2\n151#1:753,4\n153#1:785\n153#1:796,2\n153#1:798,2\n153#1:800,4\n158#1:829\n158#1:840,2\n158#1:842,2\n158#1:844,4\n161#1:865\n161#1:876,2\n161#1:878,2\n161#1:880,4\n166#1:897\n166#1:908,2\n166#1:910,2\n166#1:912,4\n176#1:921\n180#1:922,2\n180#1:924,2\n180#1:928,4\n183#1:933\n185#1:943\n185#1:954,2\n185#1:956,2\n185#1:958,4\n193#1:969\n202#1:971,2\n202#1:973,2\n202#1:977,4\n213#1:992\n213#1:1003,2\n213#1:1005,2\n213#1:1007,4\n213#1:1026\n213#1:1037,2\n213#1:1039,2\n213#1:1041,4\n225#1:1054\n234#1:1056,2\n234#1:1058,2\n234#1:1062,4\n225#1:1070\n234#1:1072,2\n234#1:1074,2\n234#1:1078,4\n117#1:542,5\n129#1:557,2\n131#1:603,2\n137#1:643,2\n140#1:678,2\n141#1:682,2\n149#1:695,2\n151#1:734,2\n153#1:781,2\n158#1:825,2\n161#1:861,2\n166#1:893,2\n180#1:926,2\n185#1:939,2\n192#1:966,2\n202#1:975,2\n213#1:988,2\n224#1:1051,2\n234#1:1060,2\n224#1:1067,2\n234#1:1076,2\n248#1:1082,2\n129#1:580\n131#1:626\n137#1:666\n140#1:685\n149#1:718\n151#1:757\n153#1:804\n158#1:848\n161#1:884\n166#1:916\n180#1:932\n185#1:962\n202#1:981\n213#1:1011\n234#1:1066\n*E\n"})
@Stable
/* loaded from: classes.dex */
public final class SnapshotStateList<T> implements StateObject, List<T>, RandomAccess, e {
    public static final int $stable = 0;

    @k
    private StateRecord firstStateRecord;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    @u0({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,539:1\n33#2,2:540\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord\n*L\n81#1:540,2\n*E\n"})
    public static final class StateListStateRecord<T> extends StateRecord {
        public static final int $stable = 8;

        @k
        private PersistentList<? extends T> list;
        private int modification;
        private int structuralChange;

        public StateListStateRecord(long j11, @k PersistentList<? extends T> persistentList) {
            super(j11);
            this.list = persistentList;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@k StateRecord stateRecord) {
            Object obj;
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                g0.n(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord>");
                this.list = ((StateListStateRecord) stateRecord).list;
                this.modification = ((StateListStateRecord) stateRecord).modification;
                this.structuralChange = ((StateListStateRecord) stateRecord).structuralChange;
                g2 g2Var = g2.f100423a;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @k
        public StateRecord create() {
            return create(SnapshotKt.currentSnapshot().getSnapshotId());
        }

        @k
        public final PersistentList<T> getList$runtime_release() {
            return this.list;
        }

        public final int getModification$runtime_release() {
            return this.modification;
        }

        public final int getStructuralChange$runtime_release() {
            return this.structuralChange;
        }

        public final void setList$runtime_release(@k PersistentList<? extends T> persistentList) {
            this.list = persistentList;
        }

        public final void setModification$runtime_release(int i11) {
            this.modification = i11;
        }

        public final void setStructuralChange$runtime_release(int i11) {
            this.structuralChange = i11;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @k
        public StateRecord create(long j11) {
            return new StateListStateRecord(j11, this.list);
        }
    }

    public SnapshotStateList(@k PersistentList<? extends T> persistentList) {
        this.firstStateRecord = stateRecordWith(persistentList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean attemptUpdate(StateListStateRecord<T> stateListStateRecord, int i11, PersistentList<? extends T> persistentList, boolean z11) {
        Object obj;
        boolean z12;
        obj = SnapshotStateListKt.sync;
        synchronized (obj) {
            try {
                if (stateListStateRecord.getModification$runtime_release() == i11) {
                    stateListStateRecord.setList$runtime_release(persistentList);
                    z12 = true;
                    if (z11) {
                        stateListStateRecord.setStructuralChange$runtime_release(stateListStateRecord.getStructuralChange$runtime_release() + 1);
                    }
                    stateListStateRecord.setModification$runtime_release(stateListStateRecord.getModification$runtime_release() + 1);
                } else {
                    z12 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z12;
    }

    private final boolean conditionalUpdate(boolean z11, l<? super PersistentList<? extends T>, ? extends PersistentList<? extends T>> lVar) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean attemptUpdate;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                try {
                    StateRecord firstStateRecord = getFirstStateRecord();
                    g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                    modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                    list$runtime_release = stateListStateRecord.getList$runtime_release();
                    g2 g2Var = g2.f100423a;
                    d0.d(1);
                } catch (Throwable th2) {
                    d0.d(1);
                    d0.c(1);
                    throw th2;
                }
            }
            d0.c(1);
            g0.m(list$runtime_release);
            PersistentList<? extends T> invoke = lVar.invoke(list$runtime_release);
            if (g0.g(invoke, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            g0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.Companion.getCurrent();
                    attemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification$runtime_release, invoke, z11);
                    d0.d(1);
                } catch (Throwable th3) {
                    d0.d(1);
                    d0.c(1);
                    throw th3;
                }
            }
            d0.c(1);
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return true;
    }

    public static /* synthetic */ boolean conditionalUpdate$default(SnapshotStateList snapshotStateList, boolean z11, l lVar, int i11, Object obj) {
        Object obj2;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean attemptUpdate;
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        do {
            obj2 = SnapshotStateListKt.sync;
            synchronized (obj2) {
                try {
                    StateRecord firstStateRecord = snapshotStateList.getFirstStateRecord();
                    g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                    modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                    list$runtime_release = stateListStateRecord.getList$runtime_release();
                    g2 g2Var = g2.f100423a;
                    d0.d(1);
                } catch (Throwable th2) {
                    d0.d(1);
                    d0.c(1);
                    throw th2;
                }
            }
            d0.c(1);
            g0.m(list$runtime_release);
            PersistentList persistentList = (PersistentList) lVar.invoke(list$runtime_release);
            if (g0.g(persistentList, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = snapshotStateList.getFirstStateRecord();
            g0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.Companion.getCurrent();
                    attemptUpdate = snapshotStateList.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, snapshotStateList, current), modification$runtime_release, persistentList, z11);
                    d0.d(1);
                } catch (Throwable th3) {
                    d0.d(1);
                    d0.c(1);
                    throw th3;
                }
            }
            d0.c(1);
            SnapshotKt.notifyWrite(current, snapshotStateList);
        } while (!attemptUpdate);
        return true;
    }

    private final <R> R mutate(l<? super List<T>, ? extends R> lVar) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        R invoke;
        Snapshot current;
        boolean attemptUpdate;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                try {
                    StateRecord firstStateRecord = getFirstStateRecord();
                    g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                    modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                    list$runtime_release = stateListStateRecord.getList$runtime_release();
                    g2 g2Var = g2.f100423a;
                    d0.d(1);
                } catch (Throwable th2) {
                    d0.d(1);
                    d0.c(1);
                    throw th2;
                }
            }
            d0.c(1);
            g0.m(list$runtime_release);
            PersistentList.Builder<T> builder = list$runtime_release.builder();
            invoke = lVar.invoke(builder);
            PersistentList<? extends T> build = builder.build();
            if (g0.g(build, list$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            g0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.Companion.getCurrent();
                    attemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification$runtime_release, build, true);
                    d0.d(1);
                } catch (Throwable th3) {
                    d0.d(1);
                    d0.c(1);
                    throw th3;
                }
            }
            d0.c(1);
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return invoke;
    }

    private final boolean mutateBoolean(l<? super List<T>, Boolean> lVar) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Boolean invoke;
        Snapshot current;
        boolean attemptUpdate;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                g2 g2Var = g2.f100423a;
            }
            g0.m(list$runtime_release);
            PersistentList.Builder<T> builder = list$runtime_release.builder();
            invoke = lVar.invoke(builder);
            PersistentList<? extends T> build = builder.build();
            if (g0.g(build, list$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            g0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification$runtime_release, build, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return invoke.booleanValue();
    }

    private final StateRecord stateRecordWith(PersistentList<? extends T> persistentList) {
        Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
        StateListStateRecord stateListStateRecord = new StateListStateRecord(currentSnapshot.getSnapshotId(), persistentList);
        if (!(currentSnapshot instanceof GlobalSnapshot)) {
            stateListStateRecord.setNext$runtime_release(new StateListStateRecord(SnapshotId_jvmKt.toSnapshotId(1), persistentList));
        }
        return stateListStateRecord;
    }

    private final void update(boolean z11, l<? super PersistentList<? extends T>, ? extends PersistentList<? extends T>> lVar) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean attemptUpdate;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                try {
                    StateRecord firstStateRecord = getFirstStateRecord();
                    g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                    modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                    list$runtime_release = stateListStateRecord.getList$runtime_release();
                    g2 g2Var = g2.f100423a;
                    d0.d(1);
                } catch (Throwable th2) {
                    d0.d(1);
                    d0.c(1);
                    throw th2;
                }
            }
            d0.c(1);
            g0.m(list$runtime_release);
            PersistentList<? extends T> invoke = lVar.invoke(list$runtime_release);
            if (g0.g(invoke, list$runtime_release)) {
                return;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            g0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.Companion.getCurrent();
                    attemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification$runtime_release, invoke, z11);
                    d0.d(1);
                } catch (Throwable th3) {
                    d0.d(1);
                    d0.c(1);
                    throw th3;
                }
            }
            d0.c(1);
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
    }

    public static /* synthetic */ void update$default(SnapshotStateList snapshotStateList, boolean z11, l lVar, int i11, Object obj) {
        Object obj2;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean attemptUpdate;
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        do {
            obj2 = SnapshotStateListKt.sync;
            synchronized (obj2) {
                try {
                    StateRecord firstStateRecord = snapshotStateList.getFirstStateRecord();
                    g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                    modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                    list$runtime_release = stateListStateRecord.getList$runtime_release();
                    g2 g2Var = g2.f100423a;
                    d0.d(1);
                } catch (Throwable th2) {
                    d0.d(1);
                    d0.c(1);
                    throw th2;
                }
            }
            d0.c(1);
            g0.m(list$runtime_release);
            PersistentList persistentList = (PersistentList) lVar.invoke(list$runtime_release);
            if (g0.g(persistentList, list$runtime_release)) {
                return;
            }
            StateRecord firstStateRecord2 = snapshotStateList.getFirstStateRecord();
            g0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.Companion.getCurrent();
                    attemptUpdate = snapshotStateList.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, snapshotStateList, current), modification$runtime_release, persistentList, z11);
                    d0.d(1);
                } catch (Throwable th3) {
                    d0.d(1);
                    d0.c(1);
                    throw th3;
                }
            }
            d0.c(1);
            SnapshotKt.notifyWrite(current, snapshotStateList);
        } while (!attemptUpdate);
    }

    private final <R> R withCurrent(l<? super StateListStateRecord<T>, ? extends R> lVar) {
        StateRecord firstStateRecord = getFirstStateRecord();
        g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return lVar.invoke(SnapshotKt.current((StateListStateRecord) firstStateRecord));
    }

    private final <R> R writable(l<? super StateListStateRecord<T>, ? extends R> lVar) {
        Snapshot current;
        R invoke;
        StateRecord firstStateRecord = getFirstStateRecord();
        g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        StateListStateRecord stateListStateRecord = (StateListStateRecord) firstStateRecord;
        synchronized (SnapshotKt.getLock()) {
            try {
                current = Snapshot.Companion.getCurrent();
                invoke = lVar.invoke(SnapshotKt.writableRecord(stateListStateRecord, this, current));
                d0.d(1);
            } catch (Throwable th2) {
                d0.d(1);
                d0.c(1);
                throw th2;
            }
        }
        d0.c(1);
        SnapshotKt.notifyWrite(current, this);
        return invoke;
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t11) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean attemptUpdate;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                g2 g2Var = g2.f100423a;
            }
            g0.m(list$runtime_release);
            PersistentList<T> add = list$runtime_release.add((PersistentList<T>) t11);
            if (g0.g(add, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            g0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification$runtime_release, add, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(final int i11, @k final Collection<? extends T> collection) {
        return mutateBoolean(new l<List<T>, Boolean>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateList$addAll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // x00.l
            public final Boolean invoke(List<T> list) {
                return Boolean.valueOf(list.addAll(i11, collection));
            }
        });
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        Snapshot current;
        Object obj;
        StateRecord firstStateRecord = getFirstStateRecord();
        g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        StateListStateRecord stateListStateRecord = (StateListStateRecord) firstStateRecord;
        synchronized (SnapshotKt.getLock()) {
            current = Snapshot.Companion.getCurrent();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord, this, current);
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                stateListStateRecord2.setList$runtime_release(ExtensionsKt.persistentListOf());
                stateListStateRecord2.setModification$runtime_release(stateListStateRecord2.getModification$runtime_release() + 1);
                stateListStateRecord2.setStructuralChange$runtime_release(stateListStateRecord2.getStructuralChange$runtime_release() + 1);
            }
        }
        SnapshotKt.notifyWrite(current, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return getReadable$runtime_release().getList$runtime_release().contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@k Collection<? extends Object> collection) {
        return getReadable$runtime_release().getList$runtime_release().containsAll(collection);
    }

    @Override // java.util.List
    public T get(int i11) {
        return getReadable$runtime_release().getList$runtime_release().get(i11);
    }

    @j(name = "getDebuggerDisplayValue")
    @k
    public final List<T> getDebuggerDisplayValue() {
        StateRecord firstStateRecord = getFirstStateRecord();
        g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord)).getList$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @k
    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    @k
    public final StateListStateRecord<T> getReadable$runtime_release() {
        StateRecord firstStateRecord = getFirstStateRecord();
        g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (StateListStateRecord) SnapshotKt.readable((StateListStateRecord) firstStateRecord, this);
    }

    public int getSize() {
        return getReadable$runtime_release().getList$runtime_release().size();
    }

    public final int getStructure$runtime_release() {
        StateRecord firstStateRecord = getFirstStateRecord();
        g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord)).getStructuralChange$runtime_release();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return getReadable$runtime_release().getList$runtime_release().indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return getReadable$runtime_release().getList$runtime_release().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @k
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return getReadable$runtime_release().getList$runtime_release().lastIndexOf(obj);
    }

    @Override // java.util.List
    @k
    public ListIterator<T> listIterator() {
        return new StateListIterator(this, 0);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@k StateRecord stateRecord) {
        stateRecord.setNext$runtime_release(getFirstStateRecord());
        g0.n(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        this.firstStateRecord = (StateListStateRecord) stateRecord;
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i11) {
        return removeAt(i11);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(@k Collection<? extends Object> collection) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean attemptUpdate;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                g2 g2Var = g2.f100423a;
            }
            g0.m(list$runtime_release);
            PersistentList<T> removeAll = list$runtime_release.removeAll((Collection<? extends T>) collection);
            if (g0.g(removeAll, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            g0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification$runtime_release, removeAll, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return true;
    }

    public T removeAt(int i11) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean attemptUpdate;
        T t11 = get(i11);
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                g2 g2Var = g2.f100423a;
            }
            g0.m(list$runtime_release);
            PersistentList<T> removeAt = list$runtime_release.removeAt(i11);
            if (g0.g(removeAt, list$runtime_release)) {
                return t11;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            g0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification$runtime_release, removeAt, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return t11;
    }

    public final void removeRange(int i11, int i12) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean attemptUpdate;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                g2 g2Var = g2.f100423a;
            }
            g0.m(list$runtime_release);
            PersistentList.Builder<T> builder = list$runtime_release.builder();
            builder.subList(i11, i12).clear();
            PersistentList<? extends T> build = builder.build();
            if (g0.g(build, list$runtime_release)) {
                return;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            g0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification$runtime_release, build, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(@k final Collection<? extends Object> collection) {
        return mutateBoolean(new l<List<T>, Boolean>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateList$retainAll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // x00.l
            public final Boolean invoke(List<T> list) {
                return Boolean.valueOf(list.retainAll(collection));
            }
        });
    }

    public final int retainAllInRange$runtime_release(@k Collection<? extends T> collection, int i11, int i12) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean attemptUpdate;
        int size = size();
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                g2 g2Var = g2.f100423a;
            }
            g0.m(list$runtime_release);
            PersistentList.Builder<T> builder = list$runtime_release.builder();
            builder.subList(i11, i12).retainAll(collection);
            PersistentList<? extends T> build = builder.build();
            if (g0.g(build, list$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            g0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification$runtime_release, build, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return size - size();
    }

    @Override // java.util.List
    public T set(int i11, T t11) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean attemptUpdate;
        T t12 = get(i11);
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                g2 g2Var = g2.f100423a;
            }
            g0.m(list$runtime_release);
            PersistentList<T> persistentList = list$runtime_release.set(i11, (int) t11);
            if (g0.g(persistentList, list$runtime_release)) {
                return t12;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            g0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification$runtime_release, persistentList, false);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return t12;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    @k
    public List<T> subList(int i11, int i12) {
        if (!(i11 >= 0 && i11 <= i12 && i12 <= size())) {
            PreconditionsKt.throwIllegalArgumentException("fromIndex or toIndex are out of bounds");
        }
        return new SubList(this, i11, i12);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return u.a(this);
    }

    @k
    public final List<T> toList() {
        return getReadable$runtime_release().getList$runtime_release();
    }

    @k
    public String toString() {
        StateRecord firstStateRecord = getFirstStateRecord();
        g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord)).getList$runtime_release() + ")@" + hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(@k Collection<? extends T> collection) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean attemptUpdate;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                g2 g2Var = g2.f100423a;
            }
            g0.m(list$runtime_release);
            PersistentList<T> addAll = list$runtime_release.addAll(collection);
            if (g0.g(addAll, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            g0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification$runtime_release, addAll, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return true;
    }

    @Override // java.util.List
    @k
    public ListIterator<T> listIterator(int i11) {
        return new StateListIterator(this, i11);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        Object obj2;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean attemptUpdate;
        do {
            obj2 = SnapshotStateListKt.sync;
            synchronized (obj2) {
                StateRecord firstStateRecord = getFirstStateRecord();
                g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                g2 g2Var = g2.f100423a;
            }
            g0.m(list$runtime_release);
            PersistentList<T> remove = list$runtime_release.remove((PersistentList<T>) obj);
            if (g0.g(remove, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            g0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification$runtime_release, remove, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) u.b(this, tArr);
    }

    public SnapshotStateList() {
        this(ExtensionsKt.persistentListOf());
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getReadable$runtime_release$annotations() {
    }

    @Override // java.util.List
    public void add(int i11, T t11) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean attemptUpdate;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                g2 g2Var = g2.f100423a;
            }
            g0.m(list$runtime_release);
            PersistentList<T> add = list$runtime_release.add(i11, (int) t11);
            if (g0.g(add, list$runtime_release)) {
                return;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            g0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification$runtime_release, add, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
    }
}
