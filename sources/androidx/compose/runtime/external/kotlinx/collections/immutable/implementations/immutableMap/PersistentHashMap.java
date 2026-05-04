package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import a00.f;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nPersistentHashMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,85:1\n53#2:86\n*S KotlinDebug\n*F\n+ 1 PersistentHashMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap\n*L\n69#1:86\n*E\n"})
/* loaded from: classes.dex */
public class PersistentHashMap<K, V> extends f<K, V> implements PersistentMap<K, V> {

    @k
    private final TrieNode<K, V> node;
    private final int size;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @k
    private static final PersistentHashMap EMPTY = new PersistentHashMap(TrieNode.Companion.getEMPTY$runtime_release(), 0);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final <K, V> PersistentHashMap<K, V> emptyOf$runtime_release() {
            PersistentHashMap<K, V> persistentHashMap = PersistentHashMap.EMPTY;
            g0.n(persistentHashMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return persistentHashMap;
        }

        private Companion() {
        }
    }

    public PersistentHashMap(@k TrieNode<K, V> trieNode, int i11) {
        this.node = trieNode;
        this.size = i11;
    }

    private final ImmutableSet<Map.Entry<K, V>> createEntries() {
        return new PersistentHashMapEntries(this);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    @k
    public PersistentMap<K, V> clear() {
        return Companion.emptyOf$runtime_release();
    }

    @Override // a00.f, java.util.Map
    public boolean containsKey(K k11) {
        return this.node.containsKey(k11 != null ? k11.hashCode() : 0, k11, 0);
    }

    @Override // a00.f, java.util.Map
    public final /* bridge */ ImmutableSet<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // a00.f, java.util.Map
    @l
    public V get(K k11) {
        return this.node.get(k11 != null ? k11.hashCode() : 0, k11, 0);
    }

    @Override // a00.f, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    @k
    public ImmutableSet<Map.Entry<K, V>> getEntries() {
        return createEntries();
    }

    @k
    public final TrieNode<K, V> getNode$runtime_release() {
        return this.node;
    }

    @Override // a00.f
    public int getSize() {
        return this.size;
    }

    @Override // a00.f, java.util.Map
    public final /* bridge */ ImmutableSet<K> keySet() {
        return getKeys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a00.f, java.util.Map
    public /* bridge */ /* synthetic */ PersistentMap put(Object obj, Object obj2) {
        return put((PersistentHashMap<K, V>) obj, obj2);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    @k
    public PersistentMap<K, V> putAll(@k Map<? extends K, ? extends V> map) {
        g0.n(this, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<K, V> builder2 = builder2();
        builder2.putAll(map);
        return builder2.build2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a00.f, java.util.Map
    public /* bridge */ /* synthetic */ PersistentMap remove(Object obj) {
        return remove((PersistentHashMap<K, V>) obj);
    }

    @Override // a00.f, java.util.Map
    public final /* bridge */ ImmutableCollection<V> values() {
        return getValues();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    @k
    /* renamed from: builder */
    public PersistentHashMapBuilder<K, V> builder2() {
        return new PersistentHashMapBuilder<>(this);
    }

    @Override // a00.f, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    @v0
    @k
    public final Set<Map.Entry<K, V>> getEntries() {
        return createEntries();
    }

    @Override // a00.f, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    @k
    public ImmutableSet<K> getKeys() {
        return new PersistentHashMapKeys(this);
    }

    @Override // a00.f, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    @k
    public ImmutableCollection<V> getValues() {
        return new PersistentHashMapValues(this);
    }

    @Override // a00.f, java.util.Map
    @k
    public PersistentHashMap<K, V> put(K k11, V v11) {
        TrieNode.ModificationResult<K, V> put = this.node.put(k11 != null ? k11.hashCode() : 0, k11, v11, 0);
        return put == null ? this : new PersistentHashMap<>(put.getNode(), size() + put.getSizeDelta());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public /* bridge */ /* synthetic */ PersistentMap remove(Object obj, Object obj2) {
        return remove((PersistentHashMap<K, V>) obj, obj2);
    }

    @Override // a00.f, java.util.Map
    @k
    public PersistentHashMap<K, V> remove(K k11) {
        TrieNode<K, V> remove = this.node.remove(k11 != null ? k11.hashCode() : 0, k11, 0);
        if (this.node == remove) {
            return this;
        }
        if (remove == null) {
            return Companion.emptyOf$runtime_release();
        }
        return new PersistentHashMap<>(remove, size() - 1);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    @k
    public PersistentHashMap<K, V> remove(K k11, V v11) {
        TrieNode<K, V> remove = this.node.remove(k11 != null ? k11.hashCode() : 0, k11, v11, 0);
        if (this.node == remove) {
            return this;
        }
        if (remove == null) {
            return Companion.emptyOf$runtime_release();
        }
        return new PersistentHashMap<>(remove, size() - 1);
    }
}
