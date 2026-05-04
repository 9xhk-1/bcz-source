package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import a00.k;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nPersistentOrderedMapContentViews.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentOrderedMapContentViews.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapEntries\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
/* loaded from: classes.dex */
public final class PersistentOrderedMapEntries<K, V> extends k<Map.Entry<? extends K, ? extends V>> implements ImmutableSet<Map.Entry<? extends K, ? extends V>> {
    public static final int $stable = 8;

    @m80.k
    private final PersistentOrderedMap<K, V> map;

    public PersistentOrderedMapEntries(@m80.k PersistentOrderedMap<K, V> persistentOrderedMap) {
        this.map = persistentOrderedMap;
    }

    @Override // a00.b, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return contains((Map.Entry) obj);
        }
        return false;
    }

    @Override // a00.b
    public int getSize() {
        return this.map.size();
    }

    @Override // a00.k, a00.b, java.util.Collection, java.lang.Iterable
    @m80.k
    public Iterator<Map.Entry<K, V>> iterator() {
        return new PersistentOrderedMapEntriesIterator(this.map);
    }

    public boolean contains(@m80.k Map.Entry<? extends K, ? extends V> entry) {
        if (!(entry instanceof Map.Entry)) {
            return false;
        }
        V v11 = this.map.get(entry.getKey());
        return v11 != null ? g0.g(v11, entry.getValue()) : entry.getValue() == null && this.map.containsKey(entry.getKey());
    }
}
