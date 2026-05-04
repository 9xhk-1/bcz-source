package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import a00.b;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PersistentOrderedMapValues<K, V> extends b<V> implements ImmutableCollection<V> {
    public static final int $stable = 8;

    @k
    private final PersistentOrderedMap<K, V> map;

    public PersistentOrderedMapValues(@k PersistentOrderedMap<K, V> persistentOrderedMap) {
        this.map = persistentOrderedMap;
    }

    @Override // a00.b, java.util.Collection
    public boolean contains(Object obj) {
        return this.map.containsValue(obj);
    }

    @Override // a00.b
    public int getSize() {
        return this.map.size();
    }

    @Override // a00.b, java.util.Collection, java.lang.Iterable
    @k
    public Iterator<V> iterator() {
        return new PersistentOrderedMapValuesIterator(this.map);
    }
}
