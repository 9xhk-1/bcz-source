package androidx.compose.runtime.snapshots;

import a00.i0;
import a00.k1;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import g10.u;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import m80.k;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapEntrySet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 4 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,416:1\n1179#2,2:417\n1253#2,4:419\n1726#2,3:461\n114#3,2:423\n157#3,5:425\n162#3:432\n150#3:433\n163#3,5:435\n116#3,7:440\n168#3,2:447\n154#3:449\n171#3:459\n123#3:460\n33#4,2:430\n2475#5:434\n2365#5,2:450\n1894#5,2:452\n2367#5,4:454\n1#6:458\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapEntrySet\n*L\n248#1:417,2\n248#1:419,4\n257#1:461,3\n249#1:423,2\n249#1:425,5\n249#1:432\n249#1:433\n249#1:435,5\n249#1:440,7\n249#1:447,2\n249#1:449\n249#1:459\n249#1:460\n249#1:430,2\n249#1:434\n249#1:450,2\n249#1:452,2\n249#1:454,4\n249#1:458\n*E\n"})
/* loaded from: classes.dex */
final class SnapshotMapEntrySet<K, V> extends SnapshotMapSet<K, V, Map.Entry<K, V>> {
    public SnapshotMapEntrySet(@k SnapshotStateMap<K, V> snapshotStateMap) {
        super(snapshotStateMap);
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) add((Map.Entry) obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) addAll(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (x0.I(obj)) {
            return contains((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@k Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @k
    public Iterator<Map.Entry<K, V>> iterator() {
        return new StateMapMutableEntriesIterator(getMap(), ((ImmutableSet) getMap().getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (x0.I(obj)) {
            return remove((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(@k Collection<? extends Object> collection) {
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z11 = false;
            while (it.hasNext()) {
                if (getMap().remove(((Map.Entry) it.next()).getKey()) != null || z11) {
                    z11 = true;
                }
            }
            return z11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(@k Collection<? extends Object> collection) {
        Object obj;
        PersistentMap<K, V> map$runtime_release;
        int modification$runtime_release;
        Snapshot current;
        boolean attemptUpdate;
        Collection<? extends Object> collection2 = collection;
        LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(k1.j(i0.d0(collection2, 10)), 16));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair a11 = h1.a(entry.getKey(), entry.getValue());
            linkedHashMap.put(a11.getFirst(), a11.getSecond());
        }
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
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                if (!linkedHashMap.containsKey(entry2.getKey()) || !g0.g(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    builder2.remove(entry2.getKey());
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

    @k
    public Void add(@k Map.Entry<K, V> entry) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Set, java.util.Collection
    @k
    public Void addAll(@k Collection<? extends Map.Entry<K, V>> collection) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    public boolean contains(@k Map.Entry<K, V> entry) {
        return g0.g(getMap().get(entry.getKey()), entry.getValue());
    }

    public boolean remove(@k Map.Entry<K, V> entry) {
        return getMap().remove(entry.getKey()) != null;
    }
}
