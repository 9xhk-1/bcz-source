package com.google.common.collect;

import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public interface u<K, V> extends Map<K, V> {
    @CheckForNull
    @uo.a
    V forcePut(@t7 K key, @t7 V value);

    u<V, K> inverse();

    @CheckForNull
    @uo.a
    V put(@t7 K key, @t7 V value);

    void putAll(Map<? extends K, ? extends V> map);

    @Override // java.util.Map, com.google.common.collect.u
    Set<V> values();
}
