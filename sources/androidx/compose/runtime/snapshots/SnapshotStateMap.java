package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import w00.j;
import x00.l;
import y00.g;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,416:1\n186#1:418\n150#1:419\n187#1,2:421\n154#1:423\n189#1:435\n157#1,5:436\n162#1:443\n150#1:444\n163#1,7:446\n154#1:453\n171#1:463\n157#1,5:464\n162#1:471\n150#1:472\n163#1,7:474\n154#1:481\n171#1:491\n157#1,5:492\n162#1:499\n150#1:500\n163#1,7:502\n154#1:509\n171#1:519\n157#1,5:522\n162#1:529\n150#1:530\n163#1,7:532\n154#1:539\n171#1:549\n150#1:550\n150#1:566\n154#1:568\n150#1:582\n154#1:584\n2475#2:417\n2475#2:420\n2365#2,2:424\n1894#2,2:426\n2367#2,4:430\n2475#2:445\n2365#2,2:454\n1894#2,2:456\n2367#2,4:458\n2475#2:473\n2365#2,2:482\n1894#2,2:484\n2367#2,4:486\n2475#2:501\n2365#2,2:510\n1894#2,2:512\n2367#2,4:514\n2475#2:531\n2365#2,2:540\n1894#2,2:542\n2367#2,4:544\n2475#2:551\n2475#2:552\n2365#2,2:553\n1894#2,2:555\n2367#2,4:559\n2475#2:567\n2365#2,2:569\n1894#2,2:571\n2367#2,4:575\n2475#2:583\n2365#2,2:585\n1894#2,2:587\n2367#2,4:591\n33#3,2:428\n33#3,2:441\n33#3,2:469\n33#3,2:497\n33#3,2:527\n33#3,2:557\n33#3,2:564\n33#3,2:573\n33#3,2:580\n33#3,2:589\n33#3,2:596\n1#4:434\n1#4:462\n1#4:490\n1#4:518\n1#4:548\n1#4:563\n1#4:579\n1#4:595\n288#5,2:520\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n*L\n90#1:418\n90#1:419\n90#1:421,2\n90#1:423\n90#1:435\n92#1:436,5\n92#1:443\n92#1:444\n92#1:446,7\n92#1:453\n92#1:463\n94#1:464,5\n94#1:471\n94#1:472\n94#1:474,7\n94#1:481\n94#1:491\n96#1:492,5\n96#1:499\n96#1:500\n96#1:502,7\n96#1:509\n96#1:519\n115#1:522,5\n115#1:529\n115#1:530\n115#1:532,7\n115#1:539\n115#1:549\n146#1:550\n162#1:566\n169#1:568\n186#1:582\n188#1:584\n86#1:417\n90#1:420\n90#1:424,2\n90#1:426,2\n90#1:430,4\n92#1:445\n92#1:454,2\n92#1:456,2\n92#1:458,4\n94#1:473\n94#1:482,2\n94#1:484,2\n94#1:486,4\n96#1:501\n96#1:510,2\n96#1:512,2\n96#1:514,4\n115#1:531\n115#1:540,2\n115#1:542,2\n115#1:544,4\n146#1:551\n150#1:552\n154#1:553,2\n154#1:555,2\n154#1:559,4\n162#1:567\n169#1:569,2\n169#1:571,2\n169#1:575,4\n186#1:583\n188#1:585,2\n188#1:587,2\n188#1:591,4\n90#1:428,2\n92#1:441,2\n94#1:469,2\n96#1:497,2\n115#1:527,2\n154#1:557,2\n161#1:564,2\n169#1:573,2\n178#1:580,2\n188#1:589,2\n193#1:596,2\n90#1:434\n92#1:462\n94#1:490\n96#1:518\n115#1:548\n154#1:563\n169#1:579\n188#1:595\n103#1:520,2\n*E\n"})
@Stable
/* loaded from: classes.dex */
public final class SnapshotStateMap<K, V> implements StateObject, Map<K, V>, g {
    public static final int $stable = 0;

    @k
    private final Set<Map.Entry<K, V>> entries;

    @k
    private StateRecord firstStateRecord;

    @k
    private final Set<K> keys;

    @k
    private final Collection<V> values;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    @u0({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,416:1\n33#2,2:417\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord\n*L\n206#1:417,2\n*E\n"})
    public static final class StateMapStateRecord<K, V> extends StateRecord {
        public static final int $stable = 8;

        @k
        private PersistentMap<K, ? extends V> map;
        private int modification;

        public StateMapStateRecord(long j11, @k PersistentMap<K, ? extends V> persistentMap) {
            super(j11);
            this.map = persistentMap;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@k StateRecord stateRecord) {
            Object obj;
            g0.n(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
            StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) stateRecord;
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                this.map = stateMapStateRecord.map;
                this.modification = stateMapStateRecord.modification;
                g2 g2Var = g2.f100423a;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @k
        public StateRecord create() {
            return new StateMapStateRecord(SnapshotKt.currentSnapshot().getSnapshotId(), this.map);
        }

        @k
        public final PersistentMap<K, V> getMap$runtime_release() {
            return this.map;
        }

        public final int getModification$runtime_release() {
            return this.modification;
        }

        public final void setMap$runtime_release(@k PersistentMap<K, ? extends V> persistentMap) {
            this.map = persistentMap;
        }

        public final void setModification$runtime_release(int i11) {
            this.modification = i11;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @k
        public StateRecord create(long j11) {
            return new StateMapStateRecord(j11, this.map);
        }
    }

    public SnapshotStateMap() {
        PersistentMap persistentHashMapOf = ExtensionsKt.persistentHashMapOf();
        Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
        StateMapStateRecord stateMapStateRecord = new StateMapStateRecord(currentSnapshot.getSnapshotId(), persistentHashMapOf);
        if (!(currentSnapshot instanceof GlobalSnapshot)) {
            stateMapStateRecord.setNext$runtime_release(new StateMapStateRecord(SnapshotId_jvmKt.toSnapshotId(1), persistentHashMapOf));
        }
        this.firstStateRecord = stateMapStateRecord;
        this.entries = new SnapshotMapEntrySet(this);
        this.keys = new SnapshotMapKeySet(this);
        this.values = new SnapshotMapValueSet(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean attemptUpdate(StateMapStateRecord<K, V> stateMapStateRecord, int i11, PersistentMap<K, ? extends V> persistentMap) {
        Object obj;
        boolean z11;
        obj = SnapshotStateMapKt.sync;
        synchronized (obj) {
            if (stateMapStateRecord.getModification$runtime_release() == i11) {
                stateMapStateRecord.setMap$runtime_release(persistentMap);
                z11 = true;
                stateMapStateRecord.setModification$runtime_release(stateMapStateRecord.getModification$runtime_release() + 1);
            } else {
                z11 = false;
            }
        }
        return z11;
    }

    private final int commitUpdate(StateMapStateRecord<K, V> stateMapStateRecord, PersistentMap<K, ? extends V> persistentMap) {
        Object obj;
        int modification$runtime_release;
        obj = SnapshotStateMapKt.sync;
        synchronized (obj) {
            stateMapStateRecord.setMap$runtime_release(persistentMap);
            modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
            stateMapStateRecord.setModification$runtime_release(modification$runtime_release + 1);
        }
        return modification$runtime_release;
    }

    private final <R> R mutate(l<? super Map<K, V>, ? extends R> lVar) {
        Object obj;
        PersistentMap<K, V> map$runtime_release;
        int modification$runtime_release;
        R invoke;
        Snapshot current;
        boolean attemptUpdate;
        do {
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                try {
                    StateRecord firstStateRecord = getFirstStateRecord();
                    g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                    map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                    modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
                    g2 g2Var = g2.f100423a;
                    d0.d(1);
                } catch (Throwable th2) {
                    d0.d(1);
                    d0.c(1);
                    throw th2;
                }
            }
            d0.c(1);
            g0.m(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            invoke = lVar.invoke(builder);
            PersistentMap<K, V> build = builder.build();
            if (g0.g(build, map$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            g0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.Companion.getCurrent();
                    attemptUpdate = attemptUpdate((StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current), modification$runtime_release, build);
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

    private final void update(l<? super PersistentMap<K, ? extends V>, ? extends PersistentMap<K, ? extends V>> lVar) {
        Snapshot current;
        StateRecord firstStateRecord = getFirstStateRecord();
        g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
        PersistentMap<K, ? extends V> invoke = lVar.invoke(stateMapStateRecord.getMap$runtime_release());
        if (invoke != stateMapStateRecord.getMap$runtime_release()) {
            StateRecord firstStateRecord2 = getFirstStateRecord();
            g0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.Companion.getCurrent();
                    commitUpdate((StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current), invoke);
                    d0.d(1);
                } catch (Throwable th2) {
                    d0.d(1);
                    d0.c(1);
                    throw th2;
                }
            }
            d0.c(1);
            SnapshotKt.notifyWrite(current, this);
        }
    }

    private final <R> R withCurrent(l<? super StateMapStateRecord<K, V>, ? extends R> lVar) {
        StateRecord firstStateRecord = getFirstStateRecord();
        g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return lVar.invoke(SnapshotKt.current((StateMapStateRecord) firstStateRecord));
    }

    private final <R> R writable(l<? super StateMapStateRecord<K, V>, ? extends R> lVar) {
        Snapshot current;
        R invoke;
        StateRecord firstStateRecord = getFirstStateRecord();
        g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) firstStateRecord;
        synchronized (SnapshotKt.getLock()) {
            try {
                current = Snapshot.Companion.getCurrent();
                invoke = lVar.invoke(SnapshotKt.writableRecord(stateMapStateRecord, this, current));
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

    public final boolean all$runtime_release(@k l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        Iterator<E> it = ((ImmutableSet) getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator();
        while (it.hasNext()) {
            if (!lVar.invoke((Map.Entry) it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final boolean any$runtime_release(@k l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        Iterator<E> it = ((ImmutableSet) getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator();
        while (it.hasNext()) {
            if (lVar.invoke((Map.Entry) it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public void clear() {
        Snapshot current;
        StateRecord firstStateRecord = getFirstStateRecord();
        g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
        stateMapStateRecord.getMap$runtime_release();
        PersistentMap<K, ? extends V> persistentHashMapOf = ExtensionsKt.persistentHashMapOf();
        if (persistentHashMapOf != stateMapStateRecord.getMap$runtime_release()) {
            StateRecord firstStateRecord2 = getFirstStateRecord();
            g0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                commitUpdate((StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current), persistentHashMapOf);
            }
            SnapshotKt.notifyWrite(current, this);
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return getReadable$runtime_release().getMap$runtime_release().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return getReadable$runtime_release().getMap$runtime_release().containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    @m80.l
    public V get(Object obj) {
        return getReadable$runtime_release().getMap$runtime_release().get(obj);
    }

    @j(name = "getDebuggerDisplayValue")
    @k
    public final Map<K, V> getDebuggerDisplayValue() {
        StateRecord firstStateRecord = getFirstStateRecord();
        g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return ((StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord)).getMap$runtime_release();
    }

    @k
    public Set<Map.Entry<K, V>> getEntries() {
        return this.entries;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @k
    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    @k
    public Set<K> getKeys() {
        return this.keys;
    }

    public final int getModification$runtime_release() {
        return getReadable$runtime_release().getModification$runtime_release();
    }

    @k
    public final StateMapStateRecord<K, V> getReadable$runtime_release() {
        StateRecord firstStateRecord = getFirstStateRecord();
        g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (StateMapStateRecord) SnapshotKt.readable((StateMapStateRecord) firstStateRecord, this);
    }

    public int getSize() {
        return getReadable$runtime_release().getMap$runtime_release().size();
    }

    @k
    public Collection<V> getValues() {
        return this.values;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return getReadable$runtime_release().getMap$runtime_release().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@k StateRecord stateRecord) {
        g0.n(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.firstStateRecord = (StateMapStateRecord) stateRecord;
    }

    @Override // java.util.Map
    @m80.l
    public V put(K k11, V v11) {
        Object obj;
        PersistentMap<K, V> map$runtime_release;
        int modification$runtime_release;
        V put;
        Snapshot current;
        boolean attemptUpdate;
        do {
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
                g2 g2Var = g2.f100423a;
            }
            g0.m(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            put = builder.put(k11, v11);
            PersistentMap<K, V> build = builder.build();
            if (g0.g(build, map$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            g0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = attemptUpdate((StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current), modification$runtime_release, build);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return put;
    }

    @Override // java.util.Map
    public void putAll(@k Map<? extends K, ? extends V> map) {
        Object obj;
        PersistentMap<K, V> map$runtime_release;
        int modification$runtime_release;
        Snapshot current;
        boolean attemptUpdate;
        do {
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
                g2 g2Var = g2.f100423a;
            }
            g0.m(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            builder.putAll(map);
            PersistentMap<K, V> build = builder.build();
            if (g0.g(build, map$runtime_release)) {
                return;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            g0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = attemptUpdate((StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current), modification$runtime_release, build);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
    }

    @Override // java.util.Map
    @m80.l
    public V remove(Object obj) {
        Object obj2;
        PersistentMap<K, V> map$runtime_release;
        int modification$runtime_release;
        V remove;
        Snapshot current;
        boolean attemptUpdate;
        do {
            obj2 = SnapshotStateMapKt.sync;
            synchronized (obj2) {
                StateRecord firstStateRecord = getFirstStateRecord();
                g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
                g2 g2Var = g2.f100423a;
            }
            g0.m(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            remove = builder.remove(obj);
            PersistentMap<K, V> build = builder.build();
            if (g0.g(build, map$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            g0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = attemptUpdate((StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current), modification$runtime_release, build);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return remove;
    }

    public final boolean removeIf$runtime_release(@k l<? super Map.Entry<K, V>, Boolean> lVar) {
        Object obj;
        PersistentMap<K, V> map$runtime_release;
        int modification$runtime_release;
        Snapshot current;
        boolean attemptUpdate;
        boolean z11 = false;
        do {
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                try {
                    StateRecord firstStateRecord = getFirstStateRecord();
                    g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                    map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                    modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
                    g2 g2Var = g2.f100423a;
                    d0.d(1);
                } catch (Throwable th2) {
                    d0.d(1);
                    d0.c(1);
                    throw th2;
                }
            }
            d0.c(1);
            g0.m(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            for (Map.Entry<K, V> entry : entrySet()) {
                if (lVar.invoke(entry).booleanValue()) {
                    builder.remove(entry.getKey());
                    z11 = true;
                }
            }
            g2 g2Var2 = g2.f100423a;
            PersistentMap<K, V> build = builder.build();
            if (g0.g(build, map$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            g0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.Companion.getCurrent();
                    attemptUpdate = attemptUpdate((StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current), modification$runtime_release, build);
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
        return z11;
    }

    public final boolean removeValue$runtime_release(V v11) {
        Object obj;
        Iterator<T> it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (g0.g(((Map.Entry) obj).getValue(), v11)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return false;
        }
        remove(entry.getKey());
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @k
    public final Map<K, V> toMap() {
        return getReadable$runtime_release().getMap$runtime_release();
    }

    @k
    public String toString() {
        StateRecord firstStateRecord = getFirstStateRecord();
        g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord)).getMap$runtime_release() + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getReadable$runtime_release$annotations() {
    }
}
