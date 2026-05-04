package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import a00.f;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
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
@u0({"SMAP\nPersistentOrderedMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentOrderedMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,135:1\n53#2:136\n*S KotlinDebug\n*F\n+ 1 PersistentOrderedMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap\n*L\n119#1:136\n*E\n"})
/* loaded from: classes.dex */
public final class PersistentOrderedMap<K, V> extends f<K, V> implements PersistentMap<K, V> {

    @k
    private static final PersistentOrderedMap EMPTY;

    @l
    private final Object firstKey;

    @k
    private final PersistentHashMap<K, LinkedValue<V>> hashMap;

    @l
    private final Object lastKey;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final <K, V> PersistentOrderedMap<K, V> emptyOf$runtime_release() {
            PersistentOrderedMap<K, V> persistentOrderedMap = PersistentOrderedMap.EMPTY;
            g0.n(persistentOrderedMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf>");
            return persistentOrderedMap;
        }

        private Companion() {
        }
    }

    static {
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        EMPTY = new PersistentOrderedMap(endOfChain, endOfChain, PersistentHashMap.Companion.emptyOf$runtime_release());
    }

    public PersistentOrderedMap(@l Object obj, @l Object obj2, @k PersistentHashMap<K, LinkedValue<V>> persistentHashMap) {
        this.firstKey = obj;
        this.lastKey = obj2;
        this.hashMap = persistentHashMap;
    }

    private final ImmutableSet<Map.Entry<K, V>> createEntries() {
        return new PersistentOrderedMapEntries(this);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    @k
    /* renamed from: builder */
    public PersistentMap.Builder<K, V> builder2() {
        return new PersistentOrderedMapBuilder(this);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    @k
    public PersistentMap<K, V> clear() {
        return Companion.emptyOf$runtime_release();
    }

    @Override // a00.f, java.util.Map
    public boolean containsKey(Object obj) {
        return this.hashMap.containsKey(obj);
    }

    @Override // a00.f, java.util.Map
    public final /* bridge */ ImmutableSet<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // a00.f, java.util.Map
    @l
    public V get(Object obj) {
        LinkedValue<V> linkedValue = this.hashMap.get(obj);
        if (linkedValue != null) {
            return linkedValue.getValue();
        }
        return null;
    }

    @Override // a00.f, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    @k
    public ImmutableSet<Map.Entry<K, V>> getEntries() {
        return createEntries();
    }

    @l
    public final Object getFirstKey$runtime_release() {
        return this.firstKey;
    }

    @k
    public final PersistentHashMap<K, LinkedValue<V>> getHashMap$runtime_release() {
        return this.hashMap;
    }

    @l
    public final Object getLastKey$runtime_release() {
        return this.lastKey;
    }

    @Override // a00.f
    public int getSize() {
        return this.hashMap.size();
    }

    @Override // a00.f, java.util.Map
    public final /* bridge */ ImmutableSet<K> keySet() {
        return getKeys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a00.f, java.util.Map
    public /* bridge */ /* synthetic */ PersistentMap put(Object obj, Object obj2) {
        return put((PersistentOrderedMap<K, V>) obj, obj2);
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
        return remove((PersistentOrderedMap<K, V>) obj);
    }

    @Override // a00.f, java.util.Map
    public final /* bridge */ ImmutableCollection<V> values() {
        return getValues();
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
        return new PersistentOrderedMapKeys(this);
    }

    @Override // a00.f, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    @k
    public ImmutableCollection<V> getValues() {
        return new PersistentOrderedMapValues(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a00.f, java.util.Map
    @k
    public PersistentOrderedMap<K, V> put(K k11, V v11) {
        if (isEmpty()) {
            return new PersistentOrderedMap<>(k11, k11, this.hashMap.put((PersistentHashMap<K, LinkedValue<V>>) k11, (K) new LinkedValue<>(v11)));
        }
        LinkedValue<V> linkedValue = this.hashMap.get(k11);
        if (linkedValue != null) {
            if (linkedValue.getValue() == v11) {
                return this;
            }
            return new PersistentOrderedMap<>(this.firstKey, this.lastKey, this.hashMap.put((PersistentHashMap<K, LinkedValue<V>>) k11, (K) linkedValue.withValue(v11)));
        }
        Object obj = this.lastKey;
        Object obj2 = this.hashMap.get(obj);
        g0.m(obj2);
        return new PersistentOrderedMap<>(this.firstKey, k11, this.hashMap.put((PersistentHashMap<K, LinkedValue<V>>) obj, (Object) ((LinkedValue) obj2).withNext(k11)).put((PersistentHashMap) k11, (K) new LinkedValue(v11, obj)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public /* bridge */ /* synthetic */ PersistentMap remove(Object obj, Object obj2) {
        return remove((PersistentOrderedMap<K, V>) obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // a00.f, java.util.Map
    @k
    public PersistentOrderedMap<K, V> remove(K k11) {
        LinkedValue<V> linkedValue = this.hashMap.get(k11);
        if (linkedValue == null) {
            return this;
        }
        PersistentHashMap<K, LinkedValue<V>> remove = this.hashMap.remove((PersistentHashMap<K, LinkedValue<V>>) k11);
        ?? r52 = remove;
        if (linkedValue.getHasPrevious()) {
            Object obj = remove.get(linkedValue.getPrevious());
            g0.m(obj);
            r52 = (PersistentHashMap<K, LinkedValue<V>>) remove.put((PersistentHashMap<K, LinkedValue<V>>) linkedValue.getPrevious(), (Object) ((LinkedValue) obj).withNext(linkedValue.getNext()));
        }
        PersistentHashMap persistentHashMap = r52;
        if (linkedValue.getHasNext()) {
            Object obj2 = r52.get(linkedValue.getNext());
            g0.m(obj2);
            persistentHashMap = r52.put(linkedValue.getNext(), ((LinkedValue) obj2).withPrevious(linkedValue.getPrevious()));
        }
        return new PersistentOrderedMap<>(!linkedValue.getHasPrevious() ? linkedValue.getNext() : this.firstKey, !linkedValue.getHasNext() ? linkedValue.getPrevious() : this.lastKey, persistentHashMap);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    @k
    public PersistentOrderedMap<K, V> remove(K k11, V v11) {
        LinkedValue<V> linkedValue = this.hashMap.get(k11);
        return (linkedValue != null && g0.g(linkedValue.getValue(), v11)) ? remove((PersistentOrderedMap<K, V>) k11) : this;
    }
}
