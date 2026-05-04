package androidx.compose.runtime.snapshots;

import a00.r0;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.u0;
import m80.k;
import w00.j;
import x00.l;
import y00.h;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSnapshotStateSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateSet.kt\nandroidx/compose/runtime/snapshots/SnapshotStateSet\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,268:1\n139#1:269\n161#1,6:272\n167#1:280\n139#1:281\n168#1,9:283\n136#1:292\n177#1,6:302\n161#1,6:308\n167#1:316\n139#1:317\n168#1,9:319\n136#1:328\n177#1,6:338\n136#1:344\n161#1,6:357\n167#1:365\n139#1:366\n168#1,9:368\n136#1:377\n177#1,6:387\n161#1,6:393\n167#1:401\n139#1:402\n168#1,9:404\n136#1:413\n177#1,6:423\n139#1:429\n144#1,5:443\n149#1:450\n139#1:451\n150#1,7:453\n136#1:460\n158#1:470\n139#1:473\n136#1:475\n139#1:489\n136#1:491\n2475#2:270\n2475#2:271\n2475#2:282\n2365#2,2:293\n1894#2,2:295\n2367#2,4:297\n2475#2:318\n2365#2,2:329\n1894#2,2:331\n2367#2,4:333\n2365#2,2:345\n1894#2,2:347\n2367#2,2:351\n2370#2:355\n2475#2:367\n2365#2,2:378\n1894#2,2:380\n2367#2,4:382\n2475#2:403\n2365#2,2:414\n1894#2,2:416\n2367#2,4:418\n2475#2:430\n2365#2,2:431\n1894#2,2:433\n2367#2,4:437\n2475#2:442\n2475#2:452\n2365#2,2:461\n1894#2,2:463\n2367#2,4:465\n2475#2:474\n2365#2,2:476\n1894#2,2:478\n2367#2,4:482\n2475#2:490\n2365#2,2:492\n1894#2,2:494\n2367#2,4:498\n33#3,2:278\n33#3,2:314\n33#3,2:349\n33#3,2:353\n33#3,2:363\n33#3,2:399\n33#3,2:435\n33#3,2:448\n33#3,2:471\n33#3,2:480\n33#3,2:487\n33#3,2:496\n33#3,2:503\n1#4:301\n1#4:337\n1#4:356\n1#4:386\n1#4:422\n1#4:441\n1#4:469\n1#4:486\n1#4:502\n*S KotlinDebug\n*F\n+ 1 SnapshotStateSet.kt\nandroidx/compose/runtime/snapshots/SnapshotStateSet\n*L\n62#1:269\n105#1:272,6\n105#1:280\n105#1:281\n105#1:283,9\n105#1:292\n105#1:302,6\n107#1:308,6\n107#1:316\n107#1:317\n107#1:319,9\n107#1:328\n107#1:338,6\n110#1:344\n118#1:357,6\n118#1:365\n118#1:366\n118#1:368,9\n118#1:377\n118#1:387,6\n120#1:393,6\n120#1:401\n120#1:402\n120#1:404,9\n120#1:413\n120#1:423,6\n132#1:429\n141#1:443,5\n141#1:450\n141#1:451\n141#1:453,7\n141#1:460\n141#1:470\n149#1:473\n156#1:475\n167#1:489\n176#1:491\n62#1:270\n101#1:271\n105#1:282\n105#1:293,2\n105#1:295,2\n105#1:297,4\n107#1:318\n107#1:329,2\n107#1:331,2\n107#1:333,4\n110#1:345,2\n110#1:347,2\n110#1:351,2\n110#1:355\n118#1:367\n118#1:378,2\n118#1:380,2\n118#1:382,4\n120#1:403\n120#1:414,2\n120#1:416,2\n120#1:418,4\n132#1:430\n136#1:431,2\n136#1:433,2\n136#1:437,4\n139#1:442\n141#1:452\n141#1:461,2\n141#1:463,2\n141#1:465,4\n149#1:474\n156#1:476,2\n156#1:478,2\n156#1:482,4\n167#1:490\n176#1:492,2\n176#1:494,2\n176#1:498,4\n105#1:278,2\n107#1:314,2\n110#1:349,2\n111#1:353,2\n118#1:363,2\n120#1:399,2\n136#1:435,2\n141#1:448,2\n148#1:471,2\n156#1:480,2\n166#1:487,2\n176#1:496,2\n189#1:503,2\n105#1:301\n107#1:337\n110#1:356\n118#1:386\n120#1:422\n136#1:441\n141#1:469\n156#1:486\n176#1:502\n*E\n"})
@Stable
/* loaded from: classes.dex */
public final class SnapshotStateSet<T> implements StateObject, Set<T>, RandomAccess, h {
    public static final int $stable = 0;

    @k
    private StateRecord firstStateRecord = stateRecordWith(ExtensionsKt.persistentSetOf());

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    @u0({"SMAP\nSnapshotStateSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateSet.kt\nandroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,268:1\n33#2,2:269\n*S KotlinDebug\n*F\n+ 1 SnapshotStateSet.kt\nandroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord\n*L\n75#1:269,2\n*E\n"})
    public static final class StateSetStateRecord<T> extends StateRecord {
        public static final int $stable = 8;
        private int modification;

        @k
        private PersistentSet<? extends T> set;

        public StateSetStateRecord(long j11, @k PersistentSet<? extends T> persistentSet) {
            super(j11);
            this.set = persistentSet;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@k StateRecord stateRecord) {
            Object obj;
            obj = SnapshotStateSetKt.sync;
            synchronized (obj) {
                g0.n(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord>");
                this.set = ((StateSetStateRecord) stateRecord).set;
                this.modification = ((StateSetStateRecord) stateRecord).modification;
                g2 g2Var = g2.f100423a;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @k
        public StateRecord create() {
            return new StateSetStateRecord(SnapshotKt.currentSnapshot().getSnapshotId(), this.set);
        }

        public final int getModification$runtime_release() {
            return this.modification;
        }

        @k
        public final PersistentSet<T> getSet$runtime_release() {
            return this.set;
        }

        public final void setModification$runtime_release(int i11) {
            this.modification = i11;
        }

        public final void setSet$runtime_release(@k PersistentSet<? extends T> persistentSet) {
            this.set = persistentSet;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @k
        public StateRecord create(long j11) {
            return new StateSetStateRecord(j11, this.set);
        }
    }

    private final boolean attemptUpdate(StateSetStateRecord<T> stateSetStateRecord, int i11, PersistentSet<? extends T> persistentSet) {
        Object obj;
        boolean z11;
        obj = SnapshotStateSetKt.sync;
        synchronized (obj) {
            if (stateSetStateRecord.getModification$runtime_release() == i11) {
                stateSetStateRecord.setSet$runtime_release(persistentSet);
                z11 = true;
                stateSetStateRecord.setModification$runtime_release(stateSetStateRecord.getModification$runtime_release() + 1);
            } else {
                z11 = false;
            }
        }
        return z11;
    }

    private final boolean conditionalUpdate(l<? super PersistentSet<? extends T>, ? extends PersistentSet<? extends T>> lVar) {
        Object obj;
        int modification$runtime_release;
        PersistentSet<T> set$runtime_release;
        Snapshot current;
        boolean attemptUpdate;
        do {
            obj = SnapshotStateSetKt.sync;
            synchronized (obj) {
                try {
                    StateRecord firstStateRecord = getFirstStateRecord();
                    g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                    StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord);
                    modification$runtime_release = stateSetStateRecord.getModification$runtime_release();
                    set$runtime_release = stateSetStateRecord.getSet$runtime_release();
                    g2 g2Var = g2.f100423a;
                    d0.d(1);
                } catch (Throwable th2) {
                    d0.d(1);
                    d0.c(1);
                    throw th2;
                }
            }
            d0.c(1);
            g0.m(set$runtime_release);
            PersistentSet<? extends T> invoke = lVar.invoke(set$runtime_release);
            if (g0.g(invoke, set$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            g0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.Companion.getCurrent();
                    attemptUpdate = attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord2, this, current), modification$runtime_release, invoke);
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

    private final <R> R mutate(l<? super Set<T>, ? extends R> lVar) {
        Object obj;
        int modification$runtime_release;
        PersistentSet<T> set$runtime_release;
        PersistentSet.Builder<T> builder;
        R invoke;
        Snapshot current;
        boolean attemptUpdate;
        do {
            obj = SnapshotStateSetKt.sync;
            synchronized (obj) {
                try {
                    StateRecord firstStateRecord = getFirstStateRecord();
                    g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                    StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord);
                    modification$runtime_release = stateSetStateRecord.getModification$runtime_release();
                    set$runtime_release = stateSetStateRecord.getSet$runtime_release();
                    g2 g2Var = g2.f100423a;
                    d0.d(1);
                } catch (Throwable th2) {
                    d0.d(1);
                    d0.c(1);
                    throw th2;
                }
            }
            d0.c(1);
            if (set$runtime_release != null && (builder = set$runtime_release.builder()) != null) {
                invoke = lVar.invoke(builder);
                PersistentSet<? extends T> build = builder.build();
                if (g0.g(build, set$runtime_release)) {
                    break;
                }
                StateRecord firstStateRecord2 = getFirstStateRecord();
                g0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) firstStateRecord2;
                synchronized (SnapshotKt.getLock()) {
                    try {
                        current = Snapshot.Companion.getCurrent();
                        attemptUpdate = attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord2, this, current), modification$runtime_release, build);
                        d0.d(1);
                    } catch (Throwable th3) {
                        d0.d(1);
                        d0.c(1);
                        throw th3;
                    }
                }
                d0.c(1);
                SnapshotKt.notifyWrite(current, this);
            } else {
                throw new IllegalStateException("No set to mutate");
            }
        } while (!attemptUpdate);
        return invoke;
    }

    private final boolean mutateBoolean(l<? super Set<T>, Boolean> lVar) {
        Object obj;
        int modification$runtime_release;
        PersistentSet<T> set$runtime_release;
        PersistentSet.Builder<T> builder;
        Boolean invoke;
        Snapshot current;
        boolean attemptUpdate;
        do {
            obj = SnapshotStateSetKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord);
                modification$runtime_release = stateSetStateRecord.getModification$runtime_release();
                set$runtime_release = stateSetStateRecord.getSet$runtime_release();
                g2 g2Var = g2.f100423a;
            }
            if (set$runtime_release != null && (builder = set$runtime_release.builder()) != null) {
                invoke = lVar.invoke(builder);
                PersistentSet<? extends T> build = builder.build();
                if (g0.g(build, set$runtime_release)) {
                    break;
                }
                StateRecord firstStateRecord2 = getFirstStateRecord();
                g0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) firstStateRecord2;
                synchronized (SnapshotKt.getLock()) {
                    current = Snapshot.Companion.getCurrent();
                    attemptUpdate = attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord2, this, current), modification$runtime_release, build);
                }
                SnapshotKt.notifyWrite(current, this);
            } else {
                throw new IllegalStateException("No set to mutate");
            }
        } while (!attemptUpdate);
        return invoke.booleanValue();
    }

    private final StateRecord stateRecordWith(PersistentSet<? extends T> persistentSet) {
        StateSetStateRecord stateSetStateRecord = new StateSetStateRecord(SnapshotKt.currentSnapshot().getSnapshotId(), persistentSet);
        if (Snapshot.Companion.isInSnapshot()) {
            stateSetStateRecord.setNext$runtime_release(new StateSetStateRecord(SnapshotId_jvmKt.toSnapshotId(1), persistentSet));
        }
        return stateSetStateRecord;
    }

    private final <R> R withCurrent(l<? super StateSetStateRecord<T>, ? extends R> lVar) {
        StateRecord firstStateRecord = getFirstStateRecord();
        g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return lVar.invoke(SnapshotKt.current((StateSetStateRecord) firstStateRecord));
    }

    private final <R> R writable(l<? super StateSetStateRecord<T>, ? extends R> lVar) {
        Snapshot current;
        R invoke;
        StateRecord firstStateRecord = getFirstStateRecord();
        g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) firstStateRecord;
        synchronized (SnapshotKt.getLock()) {
            try {
                current = Snapshot.Companion.getCurrent();
                invoke = lVar.invoke(SnapshotKt.writableRecord(stateSetStateRecord, this, current));
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

    @Override // java.util.Set, java.util.Collection
    public boolean add(T t11) {
        Object obj;
        int modification$runtime_release;
        PersistentSet<T> set$runtime_release;
        Snapshot current;
        boolean attemptUpdate;
        do {
            obj = SnapshotStateSetKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord);
                modification$runtime_release = stateSetStateRecord.getModification$runtime_release();
                set$runtime_release = stateSetStateRecord.getSet$runtime_release();
                g2 g2Var = g2.f100423a;
            }
            g0.m(set$runtime_release);
            PersistentSet<? extends T> add = set$runtime_release.add((PersistentSet<T>) t11);
            if (g0.g(add, set$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            g0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord2, this, current), modification$runtime_release, add);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(@k Collection<? extends T> collection) {
        Object obj;
        int modification$runtime_release;
        PersistentSet<T> set$runtime_release;
        Snapshot current;
        boolean attemptUpdate;
        do {
            obj = SnapshotStateSetKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord);
                modification$runtime_release = stateSetStateRecord.getModification$runtime_release();
                set$runtime_release = stateSetStateRecord.getSet$runtime_release();
                g2 g2Var = g2.f100423a;
            }
            g0.m(set$runtime_release);
            PersistentSet<? extends T> addAll = set$runtime_release.addAll(collection);
            if (g0.g(addAll, set$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            g0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord2, this, current), modification$runtime_release, addAll);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        Snapshot current;
        Object obj;
        StateRecord firstStateRecord = getFirstStateRecord();
        g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) firstStateRecord;
        synchronized (SnapshotKt.getLock()) {
            current = Snapshot.Companion.getCurrent();
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord, this, current);
            obj = SnapshotStateSetKt.sync;
            synchronized (obj) {
                stateSetStateRecord2.setSet$runtime_release(ExtensionsKt.persistentSetOf());
                stateSetStateRecord2.setModification$runtime_release(stateSetStateRecord2.getModification$runtime_release() + 1);
            }
        }
        SnapshotKt.notifyWrite(current, this);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return getReadable$runtime_release().getSet$runtime_release().contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@k Collection<? extends Object> collection) {
        return getReadable$runtime_release().getSet$runtime_release().containsAll(collection);
    }

    @j(name = "getDebuggerDisplayValue")
    @k
    public final Set<T> getDebuggerDisplayValue() {
        StateRecord firstStateRecord = getFirstStateRecord();
        g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return ((StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord)).getSet$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @k
    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    public final int getModification$runtime_release() {
        StateRecord firstStateRecord = getFirstStateRecord();
        g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return ((StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord)).getModification$runtime_release();
    }

    @k
    public final StateSetStateRecord<T> getReadable$runtime_release() {
        StateRecord firstStateRecord = getFirstStateRecord();
        g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return (StateSetStateRecord) SnapshotKt.readable((StateSetStateRecord) firstStateRecord, this);
    }

    public int getSize() {
        return getReadable$runtime_release().getSet$runtime_release().size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return getReadable$runtime_release().getSet$runtime_release().isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @k
    public Iterator<T> iterator() {
        return new StateSetIterator(this, getReadable$runtime_release().getSet$runtime_release().iterator());
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@k StateRecord stateRecord) {
        stateRecord.setNext$runtime_release(getFirstStateRecord());
        g0.n(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        this.firstStateRecord = (StateSetStateRecord) stateRecord;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        Object obj2;
        int modification$runtime_release;
        PersistentSet<T> set$runtime_release;
        Snapshot current;
        boolean attemptUpdate;
        do {
            obj2 = SnapshotStateSetKt.sync;
            synchronized (obj2) {
                StateRecord firstStateRecord = getFirstStateRecord();
                g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord);
                modification$runtime_release = stateSetStateRecord.getModification$runtime_release();
                set$runtime_release = stateSetStateRecord.getSet$runtime_release();
                g2 g2Var = g2.f100423a;
            }
            g0.m(set$runtime_release);
            PersistentSet<? extends T> remove = set$runtime_release.remove((PersistentSet<T>) obj);
            if (g0.g(remove, set$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            g0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord2, this, current), modification$runtime_release, remove);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(@k Collection<? extends Object> collection) {
        Object obj;
        int modification$runtime_release;
        PersistentSet<T> set$runtime_release;
        Snapshot current;
        boolean attemptUpdate;
        do {
            obj = SnapshotStateSetKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord);
                modification$runtime_release = stateSetStateRecord.getModification$runtime_release();
                set$runtime_release = stateSetStateRecord.getSet$runtime_release();
                g2 g2Var = g2.f100423a;
            }
            g0.m(set$runtime_release);
            PersistentSet<? extends T> removeAll = set$runtime_release.removeAll((Collection<? extends T>) collection);
            if (g0.g(removeAll, set$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            g0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord2, this, current), modification$runtime_release, removeAll);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(@k final Collection<? extends Object> collection) {
        return mutateBoolean(new l<Set<T>, Boolean>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateSet$retainAll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // x00.l
            public final Boolean invoke(Set<T> set) {
                return Boolean.valueOf(set.retainAll(r0.f6(collection)));
            }
        });
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return u.a(this);
    }

    @k
    public final Set<T> toSet() {
        return getReadable$runtime_release().getSet$runtime_release();
    }

    @k
    public String toString() {
        StateRecord firstStateRecord = getFirstStateRecord();
        g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return "SnapshotStateSet(value=" + ((StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord)).getSet$runtime_release() + ")@" + hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) u.b(this, tArr);
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getReadable$runtime_release$annotations() {
    }
}
