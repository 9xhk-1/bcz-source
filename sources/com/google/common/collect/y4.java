package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class y4<K, V> extends c5 implements d7<K, V> {
    public Map<K, Collection<V>> asMap() {
        return delegate().asMap();
    }

    public void clear() {
        delegate().clear();
    }

    @Override // com.google.common.collect.d7
    public boolean containsEntry(@CheckForNull Object key, @CheckForNull Object value) {
        return delegate().containsEntry(key, value);
    }

    @Override // com.google.common.collect.d7
    public boolean containsKey(@CheckForNull Object key) {
        return delegate().containsKey(key);
    }

    @Override // com.google.common.collect.d7
    public boolean containsValue(@CheckForNull Object value) {
        return delegate().containsValue(value);
    }

    public Collection<Map.Entry<K, V>> entries() {
        return delegate().entries();
    }

    @Override // com.google.common.collect.d7, com.google.common.collect.p6
    public boolean equals(@CheckForNull Object object) {
        return object == this || delegate().equals(object);
    }

    public Collection<V> get(@t7 K key) {
        return delegate().get(key);
    }

    @Override // com.google.common.collect.d7
    public int hashCode() {
        return delegate().hashCode();
    }

    @Override // com.google.common.collect.d7
    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public Set<K> keySet() {
        return delegate().keySet();
    }

    public j7<K> keys() {
        return delegate().keys();
    }

    @uo.a
    public boolean put(@t7 K key, @t7 V value) {
        return delegate().put(key, value);
    }

    @uo.a
    public boolean putAll(@t7 K key, Iterable<? extends V> values) {
        return delegate().putAll(key, values);
    }

    @uo.a
    public boolean remove(@CheckForNull Object key, @CheckForNull Object value) {
        return delegate().remove(key, value);
    }

    @uo.a
    public Collection<V> removeAll(@CheckForNull Object key) {
        return delegate().removeAll(key);
    }

    @uo.a
    public Collection<V> replaceValues(@t7 K key, Iterable<? extends V> values) {
        return delegate().replaceValues(key, values);
    }

    @Override // com.google.common.collect.d7
    public int size() {
        return delegate().size();
    }

    public Collection<V> values() {
        return delegate().values();
    }

    @Override // com.google.common.collect.c5
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public abstract d7<K, V> delegate();

    @uo.a
    public boolean putAll(d7<? extends K, ? extends V> multimap) {
        return delegate().putAll(multimap);
    }
}
