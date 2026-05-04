package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
@uo.f("Use ImmutableMultimap, HashMultimap, or another implementation")
/* loaded from: classes7.dex */
public interface d7<K, V> {
    Map<K, Collection<V>> asMap();

    void clear();

    boolean containsEntry(@CheckForNull @uo.c("K") Object key, @CheckForNull @uo.c("V") Object value);

    boolean containsKey(@CheckForNull @uo.c("K") Object key);

    boolean containsValue(@CheckForNull @uo.c("V") Object value);

    Collection<Map.Entry<K, V>> entries();

    boolean equals(@CheckForNull Object obj);

    Collection<V> get(@t7 K key);

    int hashCode();

    boolean isEmpty();

    Set<K> keySet();

    j7<K> keys();

    @uo.a
    boolean put(@t7 K key, @t7 V value);

    @uo.a
    boolean putAll(d7<? extends K, ? extends V> multimap);

    @uo.a
    boolean putAll(@t7 K key, Iterable<? extends V> values);

    @uo.a
    boolean remove(@CheckForNull @uo.c("K") Object key, @CheckForNull @uo.c("V") Object value);

    @uo.a
    Collection<V> removeAll(@CheckForNull @uo.c("K") Object key);

    @uo.a
    Collection<V> replaceValues(@t7 K key, Iterable<? extends V> values);

    int size();

    Collection<V> values();
}
