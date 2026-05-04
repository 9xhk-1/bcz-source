package com.google.common.collect;

import java.util.concurrent.ConcurrentMap;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class m4<K, V> extends w4<K, V> implements ConcurrentMap<K, V> {
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CheckForNull
    @uo.a
    public V putIfAbsent(K key, V value) {
        return delegate().putIfAbsent(key, value);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @uo.a
    public boolean remove(@CheckForNull Object key, @CheckForNull Object value) {
        return delegate().remove(key, value);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CheckForNull
    @uo.a
    public V replace(K key, V value) {
        return delegate().replace(key, value);
    }

    @Override // com.google.common.collect.w4, com.google.common.collect.c5
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public abstract ConcurrentMap<K, V> delegate();

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @uo.a
    public boolean replace(K key, V oldValue, V newValue) {
        return delegate().replace(key, oldValue, newValue);
    }
}
