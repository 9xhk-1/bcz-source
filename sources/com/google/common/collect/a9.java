package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public interface a9<K, V> extends p8<K, V> {
    @Override // com.google.common.collect.p8, com.google.common.collect.d7, com.google.common.collect.p6
    Map<K, Collection<V>> asMap();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.p8, com.google.common.collect.d7, com.google.common.collect.p6
    /* bridge */ /* synthetic */ default Collection get(@t7 Object key) {
        return get((a9<K, V>) key);
    }

    @Override // com.google.common.collect.p8, com.google.common.collect.d7, com.google.common.collect.p6
    SortedSet<V> get(@t7 K key);

    @Override // com.google.common.collect.p8, com.google.common.collect.d7, com.google.common.collect.p6
    @uo.a
    SortedSet<V> removeAll(@CheckForNull Object key);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.p8, com.google.common.collect.d7, com.google.common.collect.p6
    @uo.a
    /* bridge */ /* synthetic */ default Collection replaceValues(@t7 Object key, Iterable values) {
        return replaceValues((a9<K, V>) key, values);
    }

    @Override // com.google.common.collect.p8, com.google.common.collect.d7, com.google.common.collect.p6
    @uo.a
    SortedSet<V> replaceValues(@t7 K key, Iterable<? extends V> values);

    @CheckForNull
    Comparator<? super V> valueComparator();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.p8, com.google.common.collect.d7, com.google.common.collect.p6
    /* bridge */ /* synthetic */ default Set get(@t7 Object key) {
        return get((a9<K, V>) key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.p8, com.google.common.collect.d7, com.google.common.collect.p6
    @uo.a
    /* bridge */ /* synthetic */ default Set replaceValues(@t7 Object key, Iterable values) {
        return replaceValues((a9<K, V>) key, values);
    }
}
