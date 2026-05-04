package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.j7;
import com.google.common.collect.o8;
import com.google.j2objc.annotations.Weak;
import ix.g;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true)
/* loaded from: classes7.dex */
public abstract class ImmutableMultimap<K, V> extends t<K, V> implements Serializable {

    @go.d
    private static final long serialVersionUID = 0;
    final transient ImmutableMap<K, ? extends ImmutableCollection<V>> map;
    final transient int size;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends aa<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator<? extends Map.Entry<K, ? extends ImmutableCollection<V>>> f33020a;

        /* renamed from: b, reason: collision with root package name */
        @CheckForNull
        public K f33021b = null;

        /* renamed from: c, reason: collision with root package name */
        public Iterator<V> f33022c = l6.t();

        public a() {
            this.f33020a = ImmutableMultimap.this.map.entrySet().iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!this.f33022c.hasNext()) {
                Map.Entry<K, ? extends ImmutableCollection<V>> next = this.f33020a.next();
                this.f33021b = next.getKey();
                this.f33022c = next.getValue().iterator();
            }
            K k11 = this.f33021b;
            Objects.requireNonNull(k11);
            return u6.O(k11, this.f33022c.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33022c.hasNext() || this.f33020a.hasNext();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends aa<V> {

        /* renamed from: a, reason: collision with root package name */
        public Iterator<? extends ImmutableCollection<V>> f33024a;

        /* renamed from: b, reason: collision with root package name */
        public Iterator<V> f33025b = l6.t();

        public b() {
            this.f33024a = ImmutableMultimap.this.map.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33025b.hasNext() || this.f33024a.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            if (!this.f33025b.hasNext()) {
                this.f33025b = this.f33024a.next().iterator();
            }
            return this.f33025b.next();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d<K, V> extends ImmutableCollection<Map.Entry<K, V>> {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        @Weak
        public final ImmutableMultimap<K, V> f33031a;

        public d(ImmutableMultimap<K, V> multimap) {
            this.f33031a = multimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object object) {
            if (!(object instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) object;
            return this.f33031a.containsEntry(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return this.f33031a.isPartialView();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f33031a.size();
        }

        @Override // com.google.common.collect.ImmutableCollection
        @go.d
        @go.c
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public aa<Map.Entry<K, V>> iterator() {
            return this.f33031a.entryIterator();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.d
    @go.c
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public static final o8.b<? super ImmutableMultimap<?, ?>> f33032a = o8.a(ImmutableMultimap.class, "map");

        /* renamed from: b, reason: collision with root package name */
        public static final o8.b<? super ImmutableMultimap<?, ?>> f33033b = o8.a(ImmutableMultimap.class, g.b.f62794h);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f extends ImmutableMultiset<K> {
        public f() {
        }

        @go.d
        @go.c
        private void readObject(ObjectInputStream stream) throws InvalidObjectException {
            throw new InvalidObjectException("Use KeysSerializedForm");
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object object) {
            return ImmutableMultimap.this.containsKey(object);
        }

        @Override // com.google.common.collect.j7
        public int count(@CheckForNull Object element) {
            ImmutableCollection<V> immutableCollection = ImmutableMultimap.this.map.get(element);
            if (immutableCollection == null) {
                return 0;
            }
            return immutableCollection.size();
        }

        @Override // com.google.common.collect.ImmutableMultiset
        public j7.a<K> getEntry(int index) {
            Map.Entry<K, ? extends ImmutableCollection<V>> entry = ImmutableMultimap.this.map.entrySet().asList().get(index);
            return k7.k(entry.getKey(), entry.getValue().size());
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.j7
        public int size() {
            return ImmutableMultimap.this.size();
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
        @go.d
        @go.c
        public Object writeReplace() {
            return new g(ImmutableMultimap.this);
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.j7
        public ImmutableSet<K> elementSet() {
            return ImmutableMultimap.this.keySet();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.d
    @go.c
    public static final class g implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final ImmutableMultimap<?, ?> f33035a;

        public g(ImmutableMultimap<?, ?> multimap) {
            this.f33035a = multimap;
        }

        public Object readResolve() {
            return this.f33035a.keys();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h<K, V> extends ImmutableCollection<V> {

        @go.d
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        @Weak
        public final transient ImmutableMultimap<K, V> f33036a;

        public h(ImmutableMultimap<K, V> multimap) {
            this.f33036a = multimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object object) {
            return this.f33036a.containsValue(object);
        }

        @Override // com.google.common.collect.ImmutableCollection
        @go.c
        public int copyIntoArray(Object[] dst, int offset) {
            aa<? extends ImmutableCollection<V>> it = this.f33036a.map.values().iterator();
            while (it.hasNext()) {
                offset = it.next().copyIntoArray(dst, offset);
            }
            return offset;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f33036a.size();
        }

        @Override // com.google.common.collect.ImmutableCollection
        @go.d
        @go.c
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public aa<V> iterator() {
            return this.f33036a.valueIterator();
        }
    }

    public ImmutableMultimap(ImmutableMap<K, ? extends ImmutableCollection<V>> map, int size) {
        this.map = map;
        this.size = size;
    }

    public static <K, V> c<K, V> builder() {
        return new c<>();
    }

    public static <K, V> c<K, V> builderWithExpectedKeys(int expectedKeys) {
        x2.b(expectedKeys, "expectedKeys");
        return new c<>(expectedKeys);
    }

    public static <K, V> ImmutableMultimap<K, V> copyOf(d7<? extends K, ? extends V> multimap) {
        if (multimap instanceof ImmutableMultimap) {
            ImmutableMultimap<K, V> immutableMultimap = (ImmutableMultimap) multimap;
            if (!immutableMultimap.isPartialView()) {
                return immutableMultimap;
            }
        }
        return ImmutableListMultimap.copyOf((d7) multimap);
    }

    public static <K, V> ImmutableMultimap<K, V> of() {
        return ImmutableListMultimap.of();
    }

    @Override // com.google.common.collect.d7
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7
    public /* bridge */ /* synthetic */ boolean containsEntry(@CheckForNull Object key, @CheckForNull Object value) {
        return super.containsEntry(key, value);
    }

    @Override // com.google.common.collect.d7
    public boolean containsKey(@CheckForNull Object key) {
        return this.map.containsKey(key);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7
    public boolean containsValue(@CheckForNull Object value) {
        return value != null && super.containsValue(value);
    }

    @Override // com.google.common.collect.h
    public Map<K, Collection<V>> createAsMap() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.h
    public Set<K> createKeySet() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object object) {
        return super.equals(object);
    }

    @Override // com.google.common.collect.d7, com.google.common.collect.p6
    public abstract ImmutableCollection<V> get(K key);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.d7, com.google.common.collect.p6
    public /* bridge */ /* synthetic */ Collection get(Object key) {
        return get((ImmutableMultimap<K, V>) key);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public abstract ImmutableMultimap<V, K> inverse();

    @Override // com.google.common.collect.h, com.google.common.collect.d7
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public boolean isPartialView() {
        return this.map.isPartialView();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    @uo.a
    public final boolean put(K key, V value) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    @uo.a
    public final boolean putAll(K key, Iterable<? extends V> values) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7
    @Deprecated
    @uo.a
    @uo.e("Always throws UnsupportedOperationException")
    public final boolean remove(@CheckForNull Object key, @CheckForNull Object value) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    @Deprecated
    @uo.a
    @uo.e("Always throws UnsupportedOperationException")
    public /* bridge */ /* synthetic */ Collection replaceValues(Object key, Iterable values) {
        return replaceValues((ImmutableMultimap<K, V>) key, values);
    }

    @Override // com.google.common.collect.d7
    public int size() {
        return this.size;
    }

    @Override // com.google.common.collect.h
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @uo.f
    public static class c<K, V> {

        /* renamed from: a, reason: collision with root package name */
        @CheckForNull
        public Map<K, ImmutableCollection.b<V>> f33027a;

        /* renamed from: b, reason: collision with root package name */
        @CheckForNull
        public Comparator<? super K> f33028b;

        /* renamed from: c, reason: collision with root package name */
        @CheckForNull
        public Comparator<? super V> f33029c;

        /* renamed from: d, reason: collision with root package name */
        public int f33030d = 4;

        public c() {
        }

        public ImmutableMultimap<K, V> a() {
            Map<K, ImmutableCollection.b<V>> map = this.f33027a;
            if (map == null) {
                return ImmutableListMultimap.of();
            }
            Collection entrySet = map.entrySet();
            Comparator<? super K> comparator = this.f33028b;
            if (comparator != null) {
                entrySet = s7.i(comparator).C().l(entrySet);
            }
            return ImmutableListMultimap.fromMapBuilderEntries(entrySet, this.f33029c);
        }

        @uo.a
        public c<K, V> b(c<K, V> other) {
            Map<K, ImmutableCollection.b<V>> map = other.f33027a;
            if (map != null) {
                for (Map.Entry<K, ImmutableCollection.b<V>> entry : map.entrySet()) {
                    m(entry.getKey(), entry.getValue().e());
                }
            }
            return this;
        }

        public Map<K, ImmutableCollection.b<V>> c() {
            Map<K, ImmutableCollection.b<V>> map = this.f33027a;
            if (map != null) {
                return map;
            }
            Map<K, ImmutableCollection.b<V>> i11 = v7.i();
            this.f33027a = i11;
            return i11;
        }

        public int d(int defaultExpectedValues, Iterable<?> values) {
            return values instanceof Collection ? Math.max(defaultExpectedValues, ((Collection) values).size()) : defaultExpectedValues;
        }

        @uo.a
        public c<K, V> e(int expectedValuesPerKey) {
            x2.b(expectedValuesPerKey, "expectedValuesPerKey");
            this.f33030d = Math.max(expectedValuesPerKey, 1);
            return this;
        }

        public ImmutableCollection.b<V> f(int expectedSize) {
            return ImmutableList.builderWithExpectedSize(expectedSize);
        }

        @uo.a
        public c<K, V> g(Comparator<? super K> keyComparator) {
            this.f33028b = (Comparator) Preconditions.checkNotNull(keyComparator);
            return this;
        }

        @uo.a
        public c<K, V> h(Comparator<? super V> valueComparator) {
            this.f33029c = (Comparator) Preconditions.checkNotNull(valueComparator);
            return this;
        }

        @uo.a
        public c<K, V> i(K key, V value) {
            x2.a(key, value);
            ImmutableCollection.b<V> bVar = c().get(key);
            if (bVar == null) {
                bVar = f(this.f33030d);
                c().put(key, bVar);
            }
            bVar.g(value);
            return this;
        }

        @uo.a
        public c<K, V> j(Map.Entry<? extends K, ? extends V> entry) {
            return i(entry.getKey(), entry.getValue());
        }

        @uo.a
        public c<K, V> k(d7<? extends K, ? extends V> multimap) {
            for (Map.Entry<? extends K, Collection<? extends V>> entry : multimap.asMap().entrySet()) {
                m(entry.getKey(), entry.getValue());
            }
            return this;
        }

        @uo.a
        public c<K, V> l(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = entries.iterator();
            while (it.hasNext()) {
                j(it.next());
            }
            return this;
        }

        @uo.a
        public c<K, V> m(K key, Iterable<? extends V> values) {
            if (key == null) {
                throw new NullPointerException("null key in entry: null=" + k6.S(values));
            }
            Iterator<? extends V> it = values.iterator();
            if (it.hasNext()) {
                ImmutableCollection.b<V> bVar = c().get(key);
                if (bVar == null) {
                    bVar = f(d(this.f33030d, values));
                    c().put(key, bVar);
                }
                while (it.hasNext()) {
                    V next = it.next();
                    x2.a(key, next);
                    bVar.g(next);
                }
            }
            return this;
        }

        @uo.a
        public c<K, V> n(K key, V... values) {
            return m(key, Arrays.asList(values));
        }

        public c(int expectedKeys) {
            if (expectedKeys > 0) {
                this.f33027a = v7.j(expectedKeys);
            }
        }
    }

    public static <K, V> ImmutableMultimap<K, V> of(K k12, V v12) {
        return ImmutableListMultimap.of((Object) k12, (Object) v12);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    public ImmutableMap<K, Collection<V>> asMap() {
        return this.map;
    }

    @Override // com.google.common.collect.h
    public ImmutableCollection<Map.Entry<K, V>> createEntries() {
        return new d(this);
    }

    @Override // com.google.common.collect.h
    public ImmutableMultiset<K> createKeys() {
        return new f();
    }

    @Override // com.google.common.collect.h
    public ImmutableCollection<V> createValues() {
        return new h(this);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7
    public ImmutableCollection<Map.Entry<K, V>> entries() {
        return (ImmutableCollection) super.entries();
    }

    @Override // com.google.common.collect.h
    public aa<Map.Entry<K, V>> entryIterator() {
        return new a();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7
    public ImmutableSet<K> keySet() {
        return this.map.keySet();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7
    public ImmutableMultiset<K> keys() {
        return (ImmutableMultiset) super.keys();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    @uo.a
    public final boolean putAll(d7<? extends K, ? extends V> multimap) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.d7, com.google.common.collect.p6
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    @uo.a
    public ImmutableCollection<V> removeAll(@CheckForNull Object key) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    @uo.a
    public ImmutableCollection<V> replaceValues(K key, Iterable<? extends V> values) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.h
    public aa<V> valueIterator() {
        return new b();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7
    public ImmutableCollection<V> values() {
        return (ImmutableCollection) super.values();
    }

    public static <K, V> ImmutableMultimap<K, V> of(K k12, V v12, K k22, V v22) {
        return ImmutableListMultimap.of((Object) k12, (Object) v12, (Object) k22, (Object) v22);
    }

    public static <K, V> ImmutableMultimap<K, V> of(K k12, V v12, K k22, V v22, K k32, V v32) {
        return ImmutableListMultimap.of((Object) k12, (Object) v12, (Object) k22, (Object) v22, (Object) k32, (Object) v32);
    }

    public static <K, V> ImmutableMultimap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
        return ImmutableListMultimap.copyOf((Iterable) entries);
    }

    public static <K, V> ImmutableMultimap<K, V> of(K k12, V v12, K k22, V v22, K k32, V v32, K k42, V v42) {
        return ImmutableListMultimap.of((Object) k12, (Object) v12, (Object) k22, (Object) v22, (Object) k32, (Object) v32, (Object) k42, (Object) v42);
    }

    public static <K, V> ImmutableMultimap<K, V> of(K k12, V v12, K k22, V v22, K k32, V v32, K k42, V v42, K k52, V v52) {
        return ImmutableListMultimap.of((Object) k12, (Object) v12, (Object) k22, (Object) v22, (Object) k32, (Object) v32, (Object) k42, (Object) v42, (Object) k52, (Object) v52);
    }
}
