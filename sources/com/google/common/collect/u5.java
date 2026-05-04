package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true)
/* loaded from: classes7.dex */
public abstract class u5<K, V> extends ImmutableSet<Map.Entry<K, V>> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.d
    @go.c
    public static class a<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final ImmutableMap<K, V> f33947a;

        public a(ImmutableMap<K, V> map) {
            this.f33947a = map;
        }

        public Object readResolve() {
            return this.f33947a.entrySet();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<K, V> extends u5<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final transient ImmutableMap<K, V> f33948a;

        /* renamed from: b, reason: collision with root package name */
        public final transient ImmutableList<Map.Entry<K, V>> f33949b;

        public b(ImmutableMap<K, V> map, Map.Entry<K, V>[] entries) {
            this(map, ImmutableList.asImmutableList(entries));
        }

        @Override // com.google.common.collect.u5
        public ImmutableMap<K, V> a() {
            return this.f33948a;
        }

        @Override // com.google.common.collect.ImmutableCollection
        @go.c("not used in GWT")
        public int copyIntoArray(Object[] dst, int offset) {
            return this.f33949b.copyIntoArray(dst, offset);
        }

        @Override // com.google.common.collect.ImmutableSet
        public ImmutableList<Map.Entry<K, V>> createAsList() {
            return this.f33949b;
        }

        @Override // com.google.common.collect.u5, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @go.d
        @go.c
        public Object writeReplace() {
            return super.writeReplace();
        }

        public b(ImmutableMap<K, V> map, ImmutableList<Map.Entry<K, V>> entries) {
            this.f33948a = map;
            this.f33949b = entries;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public aa<Map.Entry<K, V>> iterator() {
            return this.f33949b.iterator();
        }
    }

    @go.d
    @go.c
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    public abstract ImmutableMap<K, V> a();

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@CheckForNull Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) object;
            V v11 = a().get(entry.getKey());
            if (v11 != null && v11.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return a().hashCode();
    }

    @Override // com.google.common.collect.ImmutableSet
    @go.c
    public boolean isHashCodeFast() {
        return a().isHashCodeFast();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return a().isPartialView();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return a().size();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @go.d
    @go.c
    public Object writeReplace() {
        return new a(a());
    }
}
