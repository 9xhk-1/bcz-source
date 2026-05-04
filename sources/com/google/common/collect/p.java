package com.google.common.collect;

import com.google.common.collect.e;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class p<K, V> extends m<K, V> implements a9<K, V> {
    private static final long serialVersionUID = 430848587173315748L;

    public p(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.m, com.google.common.collect.e
    public abstract SortedSet<V> createCollection();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.d7, com.google.common.collect.p6
    public /* bridge */ /* synthetic */ Collection get(@t7 Object key) {
        return get((p<K, V>) key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    @uo.a
    public /* bridge */ /* synthetic */ Collection replaceValues(@t7 Object key, Iterable values) {
        return replaceValues((p<K, V>) key, values);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.d7
    public Collection<V> values() {
        return super.values();
    }

    @Override // com.google.common.collect.m, com.google.common.collect.e
    public Collection<V> wrapCollection(@t7 K key, Collection<V> collection) {
        return collection instanceof NavigableSet ? new e.m(key, (NavigableSet) collection, null) : new e.o(key, (SortedSet) collection, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.d7, com.google.common.collect.p6
    public /* bridge */ /* synthetic */ Set get(@t7 Object key) {
        return get((p<K, V>) key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    @uo.a
    public /* bridge */ /* synthetic */ Set replaceValues(@t7 Object key, Iterable values) {
        return replaceValues((p<K, V>) key, values);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.e
    public <E> SortedSet<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        return collection instanceof NavigableSet ? q8.P((NavigableSet) collection) : Collections.unmodifiableSortedSet((SortedSet) collection);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.e
    public SortedSet<V> createUnmodifiableEmptyCollection() {
        return (SortedSet<V>) unmodifiableCollectionSubclass((Collection) createCollection());
    }

    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.d7, com.google.common.collect.p6
    public SortedSet<V> get(@t7 K key) {
        return (SortedSet) super.get((p<K, V>) key);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.d7, com.google.common.collect.p6
    @uo.a
    public SortedSet<V> removeAll(@CheckForNull Object key) {
        return (SortedSet) super.removeAll(key);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    @uo.a
    public SortedSet<V> replaceValues(@t7 K key, Iterable<? extends V> values) {
        return (SortedSet) super.replaceValues((p<K, V>) key, (Iterable) values);
    }
}
