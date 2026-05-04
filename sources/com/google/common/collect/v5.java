package com.google.common.collect;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class v5<K, V> extends h6<K> {

    /* renamed from: a, reason: collision with root package name */
    public final ImmutableMap<K, V> f34031a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.d
    @go.c
    public static class a<K> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final ImmutableMap<K, ?> f34032a;

        public a(ImmutableMap<K, ?> map) {
            this.f34032a = map;
        }

        public Object readResolve() {
            return this.f34032a.keySet();
        }
    }

    public v5(ImmutableMap<K, V> map) {
        this.f34031a = map;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@CheckForNull Object object) {
        return this.f34031a.containsKey(object);
    }

    @Override // com.google.common.collect.h6
    public K get(int index) {
        return this.f34031a.entrySet().asList().get(index).getKey();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f34031a.size();
    }

    @Override // com.google.common.collect.h6, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @go.d
    @go.c
    public Object writeReplace() {
        return new a(this.f34031a);
    }

    @Override // com.google.common.collect.h6, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public aa<K> iterator() {
        return this.f34031a.keyIterator();
    }
}
