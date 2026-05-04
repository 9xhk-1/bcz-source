package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class d<K, V> extends e<K, V> implements p6<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    public d(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.e
    public abstract List<V> createCollection();

    @Override // com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    public boolean equals(@CheckForNull Object object) {
        return super.equals(object);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.e, com.google.common.collect.d7, com.google.common.collect.p6
    public /* bridge */ /* synthetic */ Collection get(@t7 Object key) {
        return get((d<K, V>) key);
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
        return replaceValues((d<K, V>) key, values);
    }

    @Override // com.google.common.collect.e
    public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.common.collect.e
    public Collection<V> wrapCollection(@t7 K key, Collection<V> collection) {
        return wrapList(key, (List) collection, null);
    }

    @Override // com.google.common.collect.e
    public List<V> createUnmodifiableEmptyCollection() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.common.collect.e, com.google.common.collect.d7, com.google.common.collect.p6
    public List<V> get(@t7 K key) {
        return (List) super.get((d<K, V>) key);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.d7, com.google.common.collect.p6
    @uo.a
    public List<V> removeAll(@CheckForNull Object key) {
        return (List) super.removeAll(key);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    @uo.a
    public List<V> replaceValues(@t7 K key, Iterable<? extends V> values) {
        return (List) super.replaceValues((d<K, V>) key, (Iterable) values);
    }
}
