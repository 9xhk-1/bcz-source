package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.g7;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class h<K, V> implements d7<K, V> {

    @CheckForNull
    @vo.b
    private transient Map<K, Collection<V>> asMap;

    @CheckForNull
    @vo.b
    private transient Collection<Map.Entry<K, V>> entries;

    @CheckForNull
    @vo.b
    private transient Set<K> keySet;

    @CheckForNull
    @vo.b
    private transient j7<K> keys;

    @CheckForNull
    @vo.b
    private transient Collection<V> values;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends g7.f<K, V> {
        public a() {
        }

        @Override // com.google.common.collect.g7.f
        public d7<K, V> a() {
            return h.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return h.this.entryIterator();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends h<K, V>.a implements Set<Map.Entry<K, V>> {
        public b() {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@CheckForNull Object obj) {
            return q8.g(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return q8.k(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends AbstractCollection<V> {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object o11) {
            return h.this.containsValue(o11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return h.this.valueIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return h.this.size();
        }
    }

    @Override // com.google.common.collect.d7, com.google.common.collect.p6
    public Map<K, Collection<V>> asMap() {
        Map<K, Collection<V>> map = this.asMap;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> createAsMap = createAsMap();
        this.asMap = createAsMap;
        return createAsMap;
    }

    @Override // com.google.common.collect.d7
    public boolean containsEntry(@CheckForNull Object key, @CheckForNull Object value) {
        Collection<V> collection = asMap().get(key);
        return collection != null && collection.contains(value);
    }

    @Override // com.google.common.collect.d7
    public boolean containsValue(@CheckForNull Object value) {
        Iterator<Collection<V>> it = asMap().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(value)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map<K, Collection<V>> createAsMap();

    public abstract Collection<Map.Entry<K, V>> createEntries();

    public abstract Set<K> createKeySet();

    public abstract j7<K> createKeys();

    public abstract Collection<V> createValues();

    @Override // com.google.common.collect.d7
    public Collection<Map.Entry<K, V>> entries() {
        Collection<Map.Entry<K, V>> collection = this.entries;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> createEntries = createEntries();
        this.entries = createEntries;
        return createEntries;
    }

    public abstract Iterator<Map.Entry<K, V>> entryIterator();

    @Override // com.google.common.collect.d7, com.google.common.collect.p6
    public boolean equals(@CheckForNull Object object) {
        return g7.g(this, object);
    }

    @Override // com.google.common.collect.d7
    public int hashCode() {
        return asMap().hashCode();
    }

    @Override // com.google.common.collect.d7
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // com.google.common.collect.d7
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        Set<K> createKeySet = createKeySet();
        this.keySet = createKeySet;
        return createKeySet;
    }

    @Override // com.google.common.collect.d7
    public j7<K> keys() {
        j7<K> j7Var = this.keys;
        if (j7Var != null) {
            return j7Var;
        }
        j7<K> createKeys = createKeys();
        this.keys = createKeys;
        return createKeys;
    }

    @Override // com.google.common.collect.d7
    @uo.a
    public boolean put(@t7 K key, @t7 V value) {
        return get(key).add(value);
    }

    @Override // com.google.common.collect.d7
    @uo.a
    public boolean putAll(@t7 K key, Iterable<? extends V> values) {
        Preconditions.checkNotNull(values);
        if (values instanceof Collection) {
            Collection<? extends V> collection = (Collection) values;
            return !collection.isEmpty() && get(key).addAll(collection);
        }
        Iterator<? extends V> it = values.iterator();
        return it.hasNext() && l6.a(get(key), it);
    }

    @Override // com.google.common.collect.d7
    @uo.a
    public boolean remove(@CheckForNull Object key, @CheckForNull Object value) {
        Collection<V> collection = asMap().get(key);
        return collection != null && collection.remove(value);
    }

    @Override // com.google.common.collect.d7, com.google.common.collect.p6
    @uo.a
    public Collection<V> replaceValues(@t7 K key, Iterable<? extends V> values) {
        Preconditions.checkNotNull(values);
        Collection<V> removeAll = removeAll(key);
        putAll(key, values);
        return removeAll;
    }

    public String toString() {
        return asMap().toString();
    }

    public Iterator<V> valueIterator() {
        return u6.R0(entries().iterator());
    }

    @Override // com.google.common.collect.d7
    public Collection<V> values() {
        Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        Collection<V> createValues = createValues();
        this.values = createValues;
        return createValues;
    }

    @Override // com.google.common.collect.d7
    @uo.a
    public boolean putAll(d7<? extends K, ? extends V> multimap) {
        boolean z11 = false;
        for (Map.Entry<? extends K, ? extends V> entry : multimap.entries()) {
            z11 |= put(entry.getKey(), entry.getValue());
        }
        return z11;
    }
}
