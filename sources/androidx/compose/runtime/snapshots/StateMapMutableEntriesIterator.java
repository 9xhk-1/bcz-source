package androidx.compose.runtime.snapshots;

import java.util.Iterator;
import java.util.Map;
import m80.k;
import y00.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class StateMapMutableEntriesIterator<K, V> extends StateMapMutableIterator<K, V> implements Iterator<Map.Entry<K, V>>, d {
    public StateMapMutableEntriesIterator(@k SnapshotStateMap<K, V> snapshotStateMap, @k Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(snapshotStateMap, it);
    }

    @Override // java.util.Iterator
    @k
    public Map.Entry<K, V> next() {
        advance();
        if (getCurrent() != null) {
            return new StateMapMutableEntriesIterator$next$1(this);
        }
        throw new IllegalStateException();
    }
}
