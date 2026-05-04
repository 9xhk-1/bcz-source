package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public class d4<K, V> extends h<K, V> implements f4<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final d7<K, V> f33321a;

    /* renamed from: b, reason: collision with root package name */
    public final ho.i0<? super K> f33322b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<K, V> extends t4<V> {

        /* renamed from: a, reason: collision with root package name */
        @t7
        public final K f33323a;

        public a(@t7 K key) {
            this.f33323a = key;
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.util.Queue
        public boolean add(@t7 V v11) {
            add(0, v11);
            return true;
        }

        @Override // com.google.common.collect.l4, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            addAll(0, collection);
            return true;
        }

        @Override // com.google.common.collect.t4, com.google.common.collect.l4, com.google.common.collect.c5
        /* renamed from: w */
        public List<V> delegate() {
            return Collections.EMPTY_LIST;
        }

        @Override // com.google.common.collect.t4, java.util.List
        public void add(int index, @t7 V element) {
            Preconditions.checkPositionIndex(index, 0);
            throw new IllegalArgumentException("Key does not satisfy predicate: " + this.f33323a);
        }

        @Override // com.google.common.collect.t4, java.util.List
        @uo.a
        public boolean addAll(int index, Collection<? extends V> elements) {
            Preconditions.checkNotNull(elements);
            Preconditions.checkPositionIndex(index, 0);
            throw new IllegalArgumentException("Key does not satisfy predicate: " + this.f33323a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends l4<Map.Entry<K, V>> {
        public c() {
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (d4.this.f33321a.containsKey(entry.getKey()) && d4.this.f33322b.apply((Object) entry.getKey())) {
                return d4.this.f33321a.remove(entry.getKey(), entry.getValue());
            }
            return false;
        }

        @Override // com.google.common.collect.l4, com.google.common.collect.c5
        public Collection<Map.Entry<K, V>> delegate() {
            return y2.d(d4.this.f33321a.entries(), d4.this.m());
        }
    }

    public d4(d7<K, V> unfiltered, ho.i0<? super K> keyPredicate) {
        this.f33321a = (d7) Preconditions.checkNotNull(unfiltered);
        this.f33322b = (ho.i0) Preconditions.checkNotNull(keyPredicate);
    }

    public Collection<V> a() {
        return this.f33321a instanceof p8 ? Collections.EMPTY_SET : Collections.EMPTY_LIST;
    }

    public d7<K, V> b() {
        return this.f33321a;
    }

    @Override // com.google.common.collect.d7
    public void clear() {
        keySet().clear();
    }

    @Override // com.google.common.collect.d7
    public boolean containsKey(@CheckForNull Object key) {
        if (this.f33321a.containsKey(key)) {
            return this.f33322b.apply(key);
        }
        return false;
    }

    @Override // com.google.common.collect.h
    public Map<K, Collection<V>> createAsMap() {
        return u6.G(this.f33321a.asMap(), this.f33322b);
    }

    @Override // com.google.common.collect.h
    public Collection<Map.Entry<K, V>> createEntries() {
        return new c();
    }

    @Override // com.google.common.collect.h
    public Set<K> createKeySet() {
        return q8.i(this.f33321a.keySet(), this.f33322b);
    }

    @Override // com.google.common.collect.h
    public j7<K> createKeys() {
        return k7.j(this.f33321a.keys(), this.f33322b);
    }

    @Override // com.google.common.collect.h
    public Collection<V> createValues() {
        return new g4(this);
    }

    @Override // com.google.common.collect.h
    public Iterator<Map.Entry<K, V>> entryIterator() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.d7, com.google.common.collect.p6
    public Collection<V> get(@t7 K key) {
        return this.f33322b.apply(key) ? this.f33321a.get(key) : this.f33321a instanceof p8 ? new b(key) : new a(key);
    }

    @Override // com.google.common.collect.f4
    public ho.i0<? super Map.Entry<K, V>> m() {
        return u6.U(this.f33322b);
    }

    @Override // com.google.common.collect.d7, com.google.common.collect.p6
    public Collection<V> removeAll(@CheckForNull Object key) {
        return containsKey(key) ? this.f33321a.removeAll(key) : a();
    }

    @Override // com.google.common.collect.d7
    public int size() {
        Iterator<Collection<V>> it = asMap().values().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += it.next().size();
        }
        return i11;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<K, V> extends e5<V> {

        /* renamed from: a, reason: collision with root package name */
        @t7
        public final K f33324a;

        public b(@t7 K key) {
            this.f33324a = key;
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.util.Queue
        public boolean add(@t7 V element) {
            throw new IllegalArgumentException("Key does not satisfy predicate: " + this.f33324a);
        }

        @Override // com.google.common.collect.l4, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            Preconditions.checkNotNull(collection);
            throw new IllegalArgumentException("Key does not satisfy predicate: " + this.f33324a);
        }

        @Override // com.google.common.collect.e5, com.google.common.collect.l4, com.google.common.collect.c5
        public Set<V> delegate() {
            return Collections.EMPTY_SET;
        }
    }
}
