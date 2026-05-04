package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import a00.k;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PersistentOrderedMapKeys<K, V> extends k<K> implements ImmutableSet<K> {
    public static final int $stable = 8;

    @m80.k
    private final PersistentOrderedMap<K, V> map;

    public PersistentOrderedMapKeys(@m80.k PersistentOrderedMap<K, V> persistentOrderedMap) {
        this.map = persistentOrderedMap;
    }

    @Override // a00.b, java.util.Collection
    public boolean contains(Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // a00.b
    public int getSize() {
        return this.map.size();
    }

    @Override // a00.k, a00.b, java.util.Collection, java.lang.Iterable
    @m80.k
    public Iterator<K> iterator() {
        return new PersistentOrderedMapKeysIterator(this.map);
    }
}
