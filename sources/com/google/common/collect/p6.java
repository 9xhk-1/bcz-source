package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public interface p6<K, V> extends d7<K, V> {
    Map<K, Collection<V>> asMap();

    boolean equals(@CheckForNull Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.d7, com.google.common.collect.p6
    /* bridge */ /* synthetic */ default Collection get(@t7 Object key) {
        return get((p6<K, V>) key);
    }

    List<V> get(@t7 K key);

    @uo.a
    List<V> removeAll(@CheckForNull Object key);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.d7, com.google.common.collect.p6
    @uo.a
    /* bridge */ /* synthetic */ default Collection replaceValues(@t7 Object key, Iterable values) {
        return replaceValues((p6<K, V>) key, values);
    }

    @uo.a
    List<V> replaceValues(@t7 K key, Iterable<? extends V> values);
}
