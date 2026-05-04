package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import a00.i;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
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
public class PersistentHashMapBuilder<K, V> extends i<K, V> implements PersistentMap.Builder<K, V> {
    public static final int $stable = 8;

    @k
    private PersistentHashMap<K, V> map;
    private int modCount;

    @k
    private TrieNode<K, V> node;

    @l
    private V operationResult;

    @k
    private MutabilityOwnership ownership = new MutabilityOwnership();
    private int size;

    public PersistentHashMapBuilder(@k PersistentHashMap<K, V> persistentHashMap) {
        this.map = persistentHashMap;
        this.node = this.map.getNode$runtime_release();
        this.size = this.map.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        TrieNode<K, V> eMPTY$runtime_release = TrieNode.Companion.getEMPTY$runtime_release();
        g0.n(eMPTY$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.node = eMPTY$runtime_release;
        setSize(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(K k11) {
        return this.node.containsKey(k11 != null ? k11.hashCode() : 0, k11, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @l
    public V get(K k11) {
        return this.node.get(k11 != null ? k11.hashCode() : 0, k11, 0);
    }

    @Override // a00.i
    @k
    public Set<Map.Entry<K, V>> getEntries() {
        return new PersistentHashMapBuilderEntries(this);
    }

    @Override // a00.i
    @k
    public Set<K> getKeys() {
        return new PersistentHashMapBuilderKeys(this);
    }

    public final int getModCount$runtime_release() {
        return this.modCount;
    }

    @k
    public final TrieNode<K, V> getNode$runtime_release() {
        return this.node;
    }

    @l
    public final V getOperationResult$runtime_release() {
        return this.operationResult;
    }

    @k
    public final MutabilityOwnership getOwnership() {
        return this.ownership;
    }

    @Override // a00.i
    public int getSize() {
        return this.size;
    }

    @Override // a00.i
    @k
    public Collection<V> getValues() {
        return new PersistentHashMapBuilderValues(this);
    }

    @Override // a00.i, java.util.AbstractMap, java.util.Map
    @l
    public V put(K k11, V v11) {
        this.operationResult = null;
        this.node = this.node.mutablePut(k11 != null ? k11.hashCode() : 0, k11, v11, 0, this);
        return this.operationResult;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(@k Map<? extends K, ? extends V> map) {
        PersistentHashMap<K, V> persistentHashMap = map instanceof PersistentHashMap ? (PersistentHashMap) map : null;
        if (persistentHashMap == null) {
            PersistentHashMapBuilder persistentHashMapBuilder = map instanceof PersistentHashMapBuilder ? (PersistentHashMapBuilder) map : null;
            persistentHashMap = persistentHashMapBuilder != null ? persistentHashMapBuilder.build() : null;
        }
        if (persistentHashMap == null) {
            super.putAll(map);
            return;
        }
        DeltaCounter deltaCounter = new DeltaCounter(0, 1, null);
        int size = size();
        TrieNode<K, V> trieNode = this.node;
        TrieNode<K, V> node$runtime_release = persistentHashMap.getNode$runtime_release();
        g0.n(node$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.node = trieNode.mutablePutAll(node$runtime_release, 0, deltaCounter, this);
        int size2 = (persistentHashMap.size() + size) - deltaCounter.getCount();
        if (size != size2) {
            setSize(size2);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    @l
    public V remove(K k11) {
        this.operationResult = null;
        TrieNode mutableRemove = this.node.mutableRemove(k11 != null ? k11.hashCode() : 0, k11, 0, this);
        if (mutableRemove == null) {
            mutableRemove = TrieNode.Companion.getEMPTY$runtime_release();
            g0.n(mutableRemove, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.node = mutableRemove;
        return this.operationResult;
    }

    public final void setModCount$runtime_release(int i11) {
        this.modCount = i11;
    }

    public final void setNode$runtime_release(@k TrieNode<K, V> trieNode) {
        this.node = trieNode;
    }

    public final void setOperationResult$runtime_release(@l V v11) {
        this.operationResult = v11;
    }

    public final void setOwnership(@k MutabilityOwnership mutabilityOwnership) {
        this.ownership = mutabilityOwnership;
    }

    public void setSize(int i11) {
        this.size = i11;
        this.modCount++;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
    @k
    public PersistentHashMap<K, V> build() {
        PersistentHashMap<K, V> persistentHashMap;
        if (this.node == this.map.getNode$runtime_release()) {
            persistentHashMap = this.map;
        } else {
            this.ownership = new MutabilityOwnership();
            persistentHashMap = new PersistentHashMap<>(this.node, size());
        }
        this.map = persistentHashMap;
        return persistentHashMap;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        TrieNode mutableRemove = this.node.mutableRemove(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (mutableRemove == null) {
            mutableRemove = TrieNode.Companion.getEMPTY$runtime_release();
            g0.n(mutableRemove, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.node = mutableRemove;
        return size != size();
    }
}
