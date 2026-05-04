package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import a00.k;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PersistentHashMapKeys<K, V> extends k<K> implements ImmutableSet<K> {
    public static final int $stable = 8;

    @m80.k
    private final PersistentHashMap<K, V> map;

    public PersistentHashMapKeys(@m80.k PersistentHashMap<K, V> persistentHashMap) {
        this.map = persistentHashMap;
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
        return new PersistentHashMapKeysIterator(this.map.getNode$runtime_release());
    }
}
