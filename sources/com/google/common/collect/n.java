package com.google.common.collect;

import java.util.Collection;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class n<K, V> extends p<K, V> {
    public n(SortedMap<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.h
    public Set<K> createKeySet() {
        return createMaybeNavigableKeySet();
    }

    @Override // com.google.common.collect.p, com.google.common.collect.m, com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    public SortedMap<K, Collection<V>> asMap() {
        return (SortedMap) super.asMap();
    }

    @Override // com.google.common.collect.e
    public SortedMap<K, Collection<V>> backingMap() {
        return (SortedMap) super.backingMap();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7
    public SortedSet<K> keySet() {
        return (SortedSet) super.keySet();
    }
}
