package androidx.compose.runtime.snapshots;

import a00.r0;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapKeySet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 4 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,416:1\n1855#2,2:417\n1726#2,3:457\n114#3,2:419\n157#3,5:421\n162#3:428\n150#3:429\n163#3,5:431\n116#3,7:436\n168#3,2:443\n154#3:445\n171#3:455\n123#3:456\n33#4,2:426\n2475#5:430\n2365#5,2:446\n1894#5,2:448\n2367#5,4:450\n1#6:454\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapKeySet\n*L\n272#1:417,2\n283#1:457,3\n278#1:419,2\n278#1:421,5\n278#1:428\n278#1:429\n278#1:431,5\n278#1:436,7\n278#1:443,2\n278#1:445\n278#1:455\n278#1:456\n278#1:426,2\n278#1:430\n278#1:446,2\n278#1:448,2\n278#1:450,4\n278#1:454\n*E\n"})
/* loaded from: classes.dex */
final class SnapshotMapKeySet<K, V> extends SnapshotMapSet<K, V, K> {
    public SnapshotMapKeySet(@k SnapshotStateMap<K, V> snapshotStateMap) {
        super(snapshotStateMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) add((SnapshotMapKeySet<K, V>) obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) addAll(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return getMap().containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@k Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!getMap().containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return getMap().remove(obj) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(@k Collection<? extends Object> collection) {
        Iterator<T> it = collection.iterator();
        while (true) {
            boolean z11 = false;
            while (it.hasNext()) {
                if (getMap().remove(it.next()) != null || z11) {
                    z11 = true;
                }
            }
            return z11;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(@k Collection<? extends Object> collection) {
        Object obj;
        PersistentMap<K, V> map$runtime_release;
        int modification$runtime_release;
        Snapshot current;
        boolean attemptUpdate;
        Set f62 = r0.f6(collection);
        SnapshotStateMap<K, V> map = getMap();
        boolean z11 = false;
        do {
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = map.getFirstStateRecord();
                g0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                SnapshotStateMap.StateMapStateRecord stateMapStateRecord = (SnapshotStateMap.StateMapStateRecord) SnapshotKt.current((SnapshotStateMap.StateMapStateRecord) firstStateRecord);
                map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
                g2 g2Var = g2.f100423a;
            }
            g0.m(map$runtime_release);
            PersistentMap.Builder<K, V> builder2 = map$runtime_release.builder2();
            for (Map.Entry<K, V> entry : map.entrySet()) {
                if (!f62.contains(entry.getKey())) {
                    builder2.remove(entry.getKey());
                    z11 = true;
                }
            }
            g2 g2Var2 = g2.f100423a;
            PersistentMap<K, V> build2 = builder2.build2();
            if (g0.g(build2, map$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = map.getFirstStateRecord();
            g0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            SnapshotStateMap.StateMapStateRecord stateMapStateRecord2 = (SnapshotStateMap.StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = map.attemptUpdate((SnapshotStateMap.StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, map, current), modification$runtime_release, build2);
            }
            SnapshotKt.notifyWrite(current, map);
        } while (!attemptUpdate);
        return z11;
    }

    @Override // java.util.Set, java.util.Collection
    @k
    public Void add(K k11) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Set, java.util.Collection
    @k
    public Void addAll(@k Collection<? extends K> collection) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @k
    public StateMapMutableKeysIterator<K, V> iterator() {
        return new StateMapMutableKeysIterator<>(getMap(), ((ImmutableSet) getMap().getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator());
    }
}
