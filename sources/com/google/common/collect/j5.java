package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class j5<K, V> extends f5<K, V> implements a9<K, V> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.f5, com.google.common.collect.y4, com.google.common.collect.d7, com.google.common.collect.p6
    public /* bridge */ /* synthetic */ Collection get(@t7 Object key) {
        return get((j5<K, V>) key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.f5, com.google.common.collect.y4, com.google.common.collect.d7, com.google.common.collect.p6
    public /* bridge */ /* synthetic */ Collection replaceValues(@t7 Object key, Iterable values) {
        return replaceValues((j5<K, V>) key, values);
    }

    @Override // com.google.common.collect.a9
    @CheckForNull
    public Comparator<? super V> valueComparator() {
        return delegate().valueComparator();
    }

    @Override // com.google.common.collect.f5
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public abstract a9<K, V> delegate();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.f5, com.google.common.collect.y4, com.google.common.collect.d7, com.google.common.collect.p6
    public /* bridge */ /* synthetic */ Set get(@t7 Object key) {
        return get((j5<K, V>) key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.f5, com.google.common.collect.y4, com.google.common.collect.d7, com.google.common.collect.p6
    public /* bridge */ /* synthetic */ Set replaceValues(@t7 Object key, Iterable values) {
        return replaceValues((j5<K, V>) key, values);
    }

    @Override // com.google.common.collect.f5, com.google.common.collect.y4, com.google.common.collect.d7, com.google.common.collect.p6
    public SortedSet<V> get(@t7 K key) {
        return delegate().get((a9<K, V>) key);
    }

    @Override // com.google.common.collect.f5, com.google.common.collect.y4, com.google.common.collect.d7, com.google.common.collect.p6
    public SortedSet<V> removeAll(@CheckForNull Object key) {
        return delegate().removeAll(key);
    }

    @Override // com.google.common.collect.f5, com.google.common.collect.y4, com.google.common.collect.d7, com.google.common.collect.p6
    public SortedSet<V> replaceValues(@t7 K key, Iterable<? extends V> values) {
        return delegate().replaceValues((a9<K, V>) key, (Iterable) values);
    }
}
