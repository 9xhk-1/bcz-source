package com.google.common.collect;

import com.google.common.collect.e;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class m<K, V> extends e<K, V> implements p8<K, V> {
    private static final long serialVersionUID = 7431625294878419160L;

    public m(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.e
    public abstract Set<V> createCollection();

    @Override // com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    public boolean equals(@CheckForNull Object object) {
        return super.equals(object);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.e, com.google.common.collect.d7, com.google.common.collect.p6
    public /* bridge */ /* synthetic */ Collection get(@t7 Object key) {
        return get((m<K, V>) key);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.d7
    @uo.a
    public boolean put(@t7 K key, @t7 V value) {
        return super.put(key, value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    @uo.a
    public /* bridge */ /* synthetic */ Collection replaceValues(@t7 Object key, Iterable values) {
        return replaceValues((m<K, V>) key, values);
    }

    @Override // com.google.common.collect.e
    public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        return Collections.unmodifiableSet((Set) collection);
    }

    @Override // com.google.common.collect.e
    public Collection<V> wrapCollection(@t7 K key, Collection<V> collection) {
        return new e.n(key, (Set) collection);
    }

    @Override // com.google.common.collect.e
    public Set<V> createUnmodifiableEmptyCollection() {
        return Collections.EMPTY_SET;
    }

    @Override // com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.d7
    public Set<Map.Entry<K, V>> entries() {
        return (Set) super.entries();
    }

    @Override // com.google.common.collect.e, com.google.common.collect.d7, com.google.common.collect.p6
    public Set<V> get(@t7 K key) {
        return (Set) super.get((m<K, V>) key);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.d7, com.google.common.collect.p6
    @uo.a
    public Set<V> removeAll(@CheckForNull Object key) {
        return (Set) super.removeAll(key);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    @uo.a
    public Set<V> replaceValues(@t7 K key, Iterable<? extends V> values) {
        return (Set) super.replaceValues((m<K, V>) key, (Iterable) values);
    }
}
