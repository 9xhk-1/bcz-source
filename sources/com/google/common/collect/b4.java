package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public final class b4<K, V> extends z3<K, V> implements h4<K, V> {
    public b4(p8<K, V> unfiltered, ho.i0<? super Map.Entry<K, V>> predicate) {
        super(unfiltered, predicate);
    }

    @Override // com.google.common.collect.z3, com.google.common.collect.h
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Set<Map.Entry<K, V>> createEntries() {
        return q8.i(b().entries(), m());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.z3, com.google.common.collect.d7, com.google.common.collect.p6
    public /* bridge */ /* synthetic */ Collection get(@t7 Object key) {
        return get((b4<K, V>) key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    public /* bridge */ /* synthetic */ Collection replaceValues(@t7 Object key, Iterable values) {
        return replaceValues((b4<K, V>) key, values);
    }

    @Override // com.google.common.collect.z3, com.google.common.collect.f4, com.google.common.collect.h4
    public p8<K, V> b() {
        return (p8) this.f34148a;
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7
    public Set<Map.Entry<K, V>> entries() {
        return (Set) super.entries();
    }

    @Override // com.google.common.collect.z3, com.google.common.collect.d7, com.google.common.collect.p6
    public Set<V> get(@t7 K key) {
        return (Set) super.get((b4<K, V>) key);
    }

    @Override // com.google.common.collect.z3, com.google.common.collect.d7, com.google.common.collect.p6
    public Set<V> removeAll(@CheckForNull Object key) {
        return (Set) super.removeAll(key);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    public Set<V> replaceValues(@t7 K key, Iterable<? extends V> values) {
        return (Set) super.replaceValues((b4<K, V>) key, (Iterable) values);
    }
}
