package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import y00.g;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableEntriesIterator$next$1\n+ 2 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableIterator\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,416:1\n360#2,4:417\n1#3:421\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableEntriesIterator$next$1\n*L\n378#1:417,4\n378#1:421\n*E\n"})
/* loaded from: classes.dex */
public final class StateMapMutableEntriesIterator$next$1<K, V> implements Map.Entry<K, V>, g.a {
    private final K key;
    final /* synthetic */ StateMapMutableEntriesIterator<K, V> this$0;
    private V value;

    public StateMapMutableEntriesIterator$next$1(StateMapMutableEntriesIterator<K, V> stateMapMutableEntriesIterator) {
        this.this$0 = stateMapMutableEntriesIterator;
        Map.Entry<K, V> current = stateMapMutableEntriesIterator.getCurrent();
        g0.m(current);
        this.key = current.getKey();
        Map.Entry<K, V> current2 = stateMapMutableEntriesIterator.getCurrent();
        g0.m(current2);
        this.value = current2.getValue();
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.key;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public void setValue(V v11) {
        this.value = v11;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v11) {
        StateMapMutableEntriesIterator<K, V> stateMapMutableEntriesIterator = this.this$0;
        if (stateMapMutableEntriesIterator.getMap().getModification$runtime_release() != ((StateMapMutableIterator) stateMapMutableEntriesIterator).modification) {
            throw new ConcurrentModificationException();
        }
        V value = getValue();
        stateMapMutableEntriesIterator.getMap().put(getKey(), v11);
        setValue((StateMapMutableEntriesIterator$next$1<K, V>) v11);
        return value;
    }
}
