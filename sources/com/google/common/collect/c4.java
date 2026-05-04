package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public final class c4<K, V> extends d4<K, V> implements p6<K, V> {
    public c4(p6<K, V> unfiltered, ho.i0<? super K> keyPredicate) {
        super(unfiltered, keyPredicate);
    }

    @Override // com.google.common.collect.d4, com.google.common.collect.f4, com.google.common.collect.h4
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public p6<K, V> b() {
        return (p6) super.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.d4, com.google.common.collect.d7, com.google.common.collect.p6
    public /* bridge */ /* synthetic */ Collection get(@t7 Object key) {
        return get((c4<K, V>) key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    public /* bridge */ /* synthetic */ Collection replaceValues(@t7 Object key, Iterable values) {
        return replaceValues((c4<K, V>) key, values);
    }

    @Override // com.google.common.collect.d4, com.google.common.collect.d7, com.google.common.collect.p6
    public List<V> get(@t7 K key) {
        return (List) super.get((c4<K, V>) key);
    }

    @Override // com.google.common.collect.d4, com.google.common.collect.d7, com.google.common.collect.p6
    public List<V> removeAll(@CheckForNull Object key) {
        return (List) super.removeAll(key);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    public List<V> replaceValues(@t7 K key, Iterable<? extends V> values) {
        return (List) super.replaceValues((c4<K, V>) key, (Iterable) values);
    }
}
