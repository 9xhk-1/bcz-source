package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class f5<K, V> extends y4<K, V> implements p8<K, V> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.y4, com.google.common.collect.d7, com.google.common.collect.p6
    public /* bridge */ /* synthetic */ Collection get(@t7 Object key) {
        return get((f5<K, V>) key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.y4, com.google.common.collect.d7, com.google.common.collect.p6
    @uo.a
    public /* bridge */ /* synthetic */ Collection replaceValues(@t7 Object key, Iterable values) {
        return replaceValues((f5<K, V>) key, values);
    }

    @Override // com.google.common.collect.y4
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public abstract p8<K, V> delegate();

    @Override // com.google.common.collect.y4, com.google.common.collect.d7
    public Set<Map.Entry<K, V>> entries() {
        return delegate().entries();
    }

    @Override // com.google.common.collect.y4, com.google.common.collect.d7, com.google.common.collect.p6
    public Set<V> get(@t7 K key) {
        return delegate().get((p8<K, V>) key);
    }

    @Override // com.google.common.collect.y4, com.google.common.collect.d7, com.google.common.collect.p6
    @uo.a
    public Set<V> removeAll(@CheckForNull Object key) {
        return delegate().removeAll(key);
    }

    @Override // com.google.common.collect.y4, com.google.common.collect.d7, com.google.common.collect.p6
    @uo.a
    public Set<V> replaceValues(@t7 K key, Iterable<? extends V> values) {
        return delegate().replaceValues((p8<K, V>) key, (Iterable) values);
    }
}
