package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import a00.i;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PersistentOrderedMapBuilder<K, V> extends i<K, V> implements PersistentMap.Builder<K, V> {
    public static final int $stable = 8;

    @l
    private Object firstKey;

    @k
    private final PersistentHashMapBuilder<K, LinkedValue<V>> hashMapBuilder;

    @l
    private Object lastKey;

    @k
    private PersistentOrderedMap<K, V> map;

    public PersistentOrderedMapBuilder(@k PersistentOrderedMap<K, V> persistentOrderedMap) {
        this.map = persistentOrderedMap;
        this.firstKey = persistentOrderedMap.getFirstKey$runtime_release();
        this.lastKey = this.map.getLastKey$runtime_release();
        this.hashMapBuilder = this.map.getHashMap$runtime_release().builder();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
    @k
    public PersistentMap<K, V> build() {
        PersistentOrderedMap<K, V> persistentOrderedMap;
        PersistentHashMap<K, LinkedValue<V>> build = this.hashMapBuilder.build();
        if (build == this.map.getHashMap$runtime_release()) {
            CommonFunctionsKt.m2064assert(this.firstKey == this.map.getFirstKey$runtime_release());
            CommonFunctionsKt.m2064assert(this.lastKey == this.map.getLastKey$runtime_release());
            persistentOrderedMap = this.map;
        } else {
            persistentOrderedMap = new PersistentOrderedMap<>(this.firstKey, this.lastKey, build);
        }
        this.map = persistentOrderedMap;
        return persistentOrderedMap;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.hashMapBuilder.clear();
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        this.firstKey = endOfChain;
        this.lastKey = endOfChain;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.hashMapBuilder.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @l
    public V get(Object obj) {
        LinkedValue<V> linkedValue = this.hashMapBuilder.get(obj);
        if (linkedValue != null) {
            return linkedValue.getValue();
        }
        return null;
    }

    @Override // a00.i
    @k
    public Set<Map.Entry<K, V>> getEntries() {
        return new PersistentOrderedMapBuilderEntries(this);
    }

    @l
    public final Object getFirstKey$runtime_release() {
        return this.firstKey;
    }

    @k
    public final PersistentHashMapBuilder<K, LinkedValue<V>> getHashMapBuilder$runtime_release() {
        return this.hashMapBuilder;
    }

    @Override // a00.i
    @k
    public Set<K> getKeys() {
        return new PersistentOrderedMapBuilderKeys(this);
    }

    @Override // a00.i
    public int getSize() {
        return this.hashMapBuilder.size();
    }

    @Override // a00.i
    @k
    public Collection<V> getValues() {
        return new PersistentOrderedMapBuilderValues(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a00.i, java.util.AbstractMap, java.util.Map
    @l
    public V put(K k11, V v11) {
        LinkedValue<V> linkedValue = this.hashMapBuilder.get(k11);
        if (linkedValue != null) {
            if (linkedValue.getValue() == v11) {
                return v11;
            }
            this.hashMapBuilder.put(k11, linkedValue.withValue(v11));
            return linkedValue.getValue();
        }
        if (isEmpty()) {
            this.firstKey = k11;
            this.lastKey = k11;
            this.hashMapBuilder.put(k11, new LinkedValue<>(v11));
            return null;
        }
        Object obj = this.lastKey;
        Object obj2 = this.hashMapBuilder.get(obj);
        g0.m(obj2);
        CommonFunctionsKt.m2064assert(!r2.getHasNext());
        this.hashMapBuilder.put(obj, ((LinkedValue) obj2).withNext(k11));
        this.hashMapBuilder.put(k11, new LinkedValue<>(v11, obj));
        this.lastKey = k11;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    @l
    public V remove(Object obj) {
        LinkedValue<V> remove = this.hashMapBuilder.remove(obj);
        if (remove == null) {
            return null;
        }
        if (remove.getHasPrevious()) {
            LinkedValue<V> linkedValue = this.hashMapBuilder.get(remove.getPrevious());
            g0.m(linkedValue);
            this.hashMapBuilder.put(remove.getPrevious(), linkedValue.withNext(remove.getNext()));
        } else {
            this.firstKey = remove.getNext();
        }
        if (remove.getHasNext()) {
            LinkedValue<V> linkedValue2 = this.hashMapBuilder.get(remove.getNext());
            g0.m(linkedValue2);
            this.hashMapBuilder.put(remove.getNext(), linkedValue2.withPrevious(remove.getPrevious()));
        } else {
            this.lastKey = remove.getPrevious();
        }
        return remove.getValue();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        LinkedValue<V> linkedValue = this.hashMapBuilder.get(obj);
        if (linkedValue == null || !g0.g(linkedValue.getValue(), obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }
}
