package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.g7;
import com.google.common.collect.h;
import com.google.common.collect.u6;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class e<K, V> extends com.google.common.collect.h<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    private transient Map<K, Collection<V>> map;
    private transient int totalSize;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends e<K, V>.d<Map.Entry<K, V>> {
        public b() {
            super();
        }

        @Override // com.google.common.collect.e.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> a(@t7 K key, @t7 V value) {
            return u6.O(key, value);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends u6.r0<K, Collection<V>> {

        /* renamed from: d, reason: collision with root package name */
        public final transient Map<K, Collection<V>> f33367d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends u6.s<K, Collection<V>> {
            public a() {
            }

            @Override // com.google.common.collect.u6.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object o11) {
                return y2.j(c.this.f33367d.entrySet(), o11);
            }

            @Override // com.google.common.collect.u6.s
            public Map<K, Collection<V>> g() {
                return c.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return c.this.new b();
            }

            @Override // com.google.common.collect.u6.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@CheckForNull Object o11) {
                if (!contains(o11)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) o11;
                Objects.requireNonNull(entry);
                e.this.d(entry.getKey());
                return true;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: a, reason: collision with root package name */
            public final Iterator<Map.Entry<K, Collection<V>>> f33370a;

            /* renamed from: b, reason: collision with root package name */
            @CheckForNull
            public Collection<V> f33371b;

            public b() {
                this.f33370a = c.this.f33367d.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f33370a.next();
                this.f33371b = next.getValue();
                return c.this.j(next);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f33370a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                Preconditions.checkState(this.f33371b != null, "no calls to next() since the last call to remove()");
                this.f33370a.remove();
                e.access$220(e.this, this.f33371b.size());
                this.f33371b.clear();
                this.f33371b = null;
            }
        }

        public c(Map<K, Collection<V>> submap) {
            this.f33367d = submap;
        }

        @Override // com.google.common.collect.u6.r0
        public Set<Map.Entry<K, Collection<V>>> b() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f33367d == e.this.map) {
                e.this.clear();
            } else {
                l6.g(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object key) {
            return u6.o0(this.f33367d, key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(@CheckForNull Object object) {
            return this == object || this.f33367d.equals(object);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(@CheckForNull Object key) {
            Collection<V> collection = (Collection) u6.p0(this.f33367d, key);
            if (collection == null) {
                return null;
            }
            return e.this.wrapCollection(key, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f33367d.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(@CheckForNull Object key) {
            Collection<V> remove = this.f33367d.remove(key);
            if (remove == null) {
                return null;
            }
            Collection<V> createCollection = e.this.createCollection();
            createCollection.addAll(remove);
            e.access$220(e.this, remove.size());
            remove.clear();
            return createCollection;
        }

        public Map.Entry<K, Collection<V>> j(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return u6.O(key, e.this.wrapCollection(key, entry.getValue()));
        }

        @Override // com.google.common.collect.u6.r0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* renamed from: keySet */
        public Set<K> l() {
            return e.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f33367d.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f33367d.toString();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public abstract class d<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator<Map.Entry<K, Collection<V>>> f33373a;

        /* renamed from: b, reason: collision with root package name */
        @CheckForNull
        public K f33374b = null;

        /* renamed from: c, reason: collision with root package name */
        @CheckForNull
        public Collection<V> f33375c = null;

        /* renamed from: d, reason: collision with root package name */
        public Iterator<V> f33376d = l6.v();

        public d() {
            this.f33373a = e.this.map.entrySet().iterator();
        }

        public abstract T a(@t7 K key, @t7 V value);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33373a.hasNext() || this.f33376d.hasNext();
        }

        @Override // java.util.Iterator
        @t7
        public T next() {
            if (!this.f33376d.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f33373a.next();
                this.f33374b = next.getKey();
                Collection<V> value = next.getValue();
                this.f33375c = value;
                this.f33376d = value.iterator();
            }
            return a(m7.a(this.f33374b), this.f33376d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f33376d.remove();
            Collection<V> collection = this.f33375c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f33373a.remove();
            }
            e.access$210(e.this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.google.common.collect.e$e, reason: collision with other inner class name */
    public class C0395e extends u6.b0<K, Collection<V>> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.google.common.collect.e$e$a */
        public class a implements Iterator<K> {

            /* renamed from: a, reason: collision with root package name */
            @CheckForNull
            public Map.Entry<K, Collection<V>> f33379a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Iterator f33380b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ C0395e f33381c;

            public a(final C0395e this$1, final Iterator val$entryIterator) {
                this.f33380b = val$entryIterator;
                this.f33381c = this$1;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f33380b.hasNext();
            }

            @Override // java.util.Iterator
            @t7
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f33380b.next();
                this.f33379a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                Preconditions.checkState(this.f33379a != null, "no calls to next() since the last call to remove()");
                Collection<V> value = this.f33379a.getValue();
                this.f33380b.remove();
                e.access$220(e.this, value.size());
                value.clear();
                this.f33379a = null;
            }
        }

        public C0395e(final Map<K, Collection<V>> subMap) {
            super(subMap);
        }

        @Override // com.google.common.collect.u6.b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            l6.g(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> c11) {
            return h().keySet().containsAll(c11);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(@CheckForNull Object object) {
            return this == object || h().keySet().equals(object);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return h().keySet().hashCode();
        }

        @Override // com.google.common.collect.u6.b0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(this, h().entrySet().iterator());
        }

        @Override // com.google.common.collect.u6.b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object key) {
            int i11;
            Collection<V> remove = h().remove(key);
            if (remove != null) {
                i11 = remove.size();
                remove.clear();
                e.access$220(e.this, i11);
            } else {
                i11 = 0;
            }
            return i11 > 0;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class f extends e<K, V>.i implements NavigableMap<K, Collection<V>> {
        public f(NavigableMap<K, Collection<V>> submap) {
            super(submap);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, Collection<V>> ceilingEntry(@t7 K key) {
            Map.Entry<K, Collection<V>> ceilingEntry = m().ceilingEntry(key);
            if (ceilingEntry == null) {
                return null;
            }
            return j(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K ceilingKey(@t7 K key) {
            return m().ceilingKey(key);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new f(m().descendingMap());
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> firstEntry = m().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return j(firstEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, Collection<V>> floorEntry(@t7 K key) {
            Map.Entry<K, Collection<V>> floorEntry = m().floorEntry(key);
            if (floorEntry == null) {
                return null;
            }
            return j(floorEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K floorKey(@t7 K key) {
            return m().floorKey(key);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, Collection<V>> higherEntry(@t7 K key) {
            Map.Entry<K, Collection<V>> higherEntry = m().higherEntry(key);
            if (higherEntry == null) {
                return null;
            }
            return j(higherEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K higherKey(@t7 K key) {
            return m().higherKey(key);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> lastEntry = m().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return j(lastEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, Collection<V>> lowerEntry(@t7 K key) {
            Map.Entry<K, Collection<V>> lowerEntry = m().lowerEntry(key);
            if (lowerEntry == null) {
                return null;
            }
            return j(lowerEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K lowerKey(@t7 K key) {
            return m().lowerKey(key);
        }

        @Override // com.google.common.collect.e.i
        /* renamed from: n, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<K> k() {
            return new g(m());
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return l();
        }

        @Override // com.google.common.collect.e.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> headMap(@t7 K toKey) {
            return headMap(toKey, false);
        }

        @CheckForNull
        public Map.Entry<K, Collection<V>> p(Iterator<Map.Entry<K, Collection<V>>> entryIterator) {
            if (!entryIterator.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = entryIterator.next();
            Collection<V> createCollection = e.this.createCollection();
            createCollection.addAll(next.getValue());
            entryIterator.remove();
            return u6.O(next.getKey(), e.this.unmodifiableCollectionSubclass(createCollection));
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return p(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return p(descendingMap().entrySet().iterator());
        }

        @Override // com.google.common.collect.e.i
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> m() {
            return (NavigableMap) super.m();
        }

        @Override // com.google.common.collect.e.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> subMap(@t7 K fromKey, @t7 K toKey) {
            return subMap(fromKey, true, toKey, false);
        }

        @Override // com.google.common.collect.e.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> tailMap(@t7 K fromKey) {
            return tailMap(fromKey, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(@t7 K toKey, boolean inclusive) {
            return new f(m().headMap(toKey, inclusive));
        }

        @Override // com.google.common.collect.e.i
        /* renamed from: keySet, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> l() {
            return (NavigableSet) super.l();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(@t7 K fromKey, boolean fromInclusive, @t7 K toKey, boolean toInclusive) {
            return new f(m().subMap(fromKey, fromInclusive, toKey, toInclusive));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(@t7 K fromKey, boolean inclusive) {
            return new f(m().tailMap(fromKey, inclusive));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class g extends e<K, V>.j implements NavigableSet<K> {
        public g(NavigableMap<K, Collection<V>> subMap) {
            super(subMap);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K ceiling(@t7 K k11) {
            return h().ceilingKey(k11);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new g(h().descendingMap());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K floor(@t7 K k11) {
            return h().floorKey(k11);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K higher(@t7 K k11) {
            return h().higherKey(k11);
        }

        @Override // com.google.common.collect.e.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> headSet(@t7 K toElement) {
            return headSet(toElement, false);
        }

        @Override // com.google.common.collect.e.j
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> h() {
            return (NavigableMap) super.h();
        }

        @Override // com.google.common.collect.e.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> subSet(@t7 K fromElement, @t7 K toElement) {
            return subSet(fromElement, true, toElement, false);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K lower(@t7 K k11) {
            return h().lowerKey(k11);
        }

        @Override // com.google.common.collect.e.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> tailSet(@t7 K fromElement) {
            return tailSet(fromElement, true);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K pollFirst() {
            return (K) l6.T(iterator());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K pollLast() {
            return (K) l6.T(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(@t7 K toElement, boolean inclusive) {
            return new g(h().headMap(toElement, inclusive));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(@t7 K fromElement, boolean fromInclusive, @t7 K toElement, boolean toInclusive) {
            return new g(h().subMap(fromElement, fromInclusive, toElement, toInclusive));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(@t7 K fromElement, boolean inclusive) {
            return new g(h().tailMap(fromElement, inclusive));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h extends e<K, V>.l implements RandomAccess {
        public h(@t7 K key, List<V> delegate, @CheckForNull e<K, V>.k ancestor) {
            super(key, delegate, ancestor);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i extends e<K, V>.c implements SortedMap<K, Collection<V>> {

        /* renamed from: f, reason: collision with root package name */
        @CheckForNull
        public SortedSet<K> f33385f;

        public i(SortedMap<K, Collection<V>> submap) {
            super(submap);
        }

        @Override // java.util.SortedMap
        @CheckForNull
        public Comparator<? super K> comparator() {
            return m().comparator();
        }

        @Override // java.util.SortedMap
        @t7
        public K firstKey() {
            return m().firstKey();
        }

        public SortedMap<K, Collection<V>> headMap(@t7 K toKey) {
            return new i(m().headMap(toKey));
        }

        @Override // com.google.common.collect.u6.r0
        public SortedSet<K> k() {
            return new j(m());
        }

        @Override // com.google.common.collect.e.c, com.google.common.collect.u6.r0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public SortedSet<K> l() {
            SortedSet<K> sortedSet = this.f33385f;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> k11 = k();
            this.f33385f = k11;
            return k11;
        }

        @Override // java.util.SortedMap
        @t7
        public K lastKey() {
            return m().lastKey();
        }

        public SortedMap<K, Collection<V>> m() {
            return (SortedMap) this.f33367d;
        }

        public SortedMap<K, Collection<V>> subMap(@t7 K fromKey, @t7 K toKey) {
            return new i(m().subMap(fromKey, toKey));
        }

        public SortedMap<K, Collection<V>> tailMap(@t7 K fromKey) {
            return new i(m().tailMap(fromKey));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class j extends e<K, V>.C0395e implements SortedSet<K> {
        public j(SortedMap<K, Collection<V>> subMap) {
            super(subMap);
        }

        @Override // java.util.SortedSet
        @CheckForNull
        public Comparator<? super K> comparator() {
            return h().comparator();
        }

        @Override // java.util.SortedSet
        @t7
        public K first() {
            return h().firstKey();
        }

        public SortedMap<K, Collection<V>> h() {
            return (SortedMap) super.h();
        }

        public SortedSet<K> headSet(@t7 K toElement) {
            return new j(h().headMap(toElement));
        }

        @Override // java.util.SortedSet
        @t7
        public K last() {
            return h().lastKey();
        }

        public SortedSet<K> subSet(@t7 K fromElement, @t7 K toElement) {
            return new j(h().subMap(fromElement, toElement));
        }

        public SortedSet<K> tailSet(@t7 K fromElement) {
            return new j(h().tailMap(fromElement));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class m extends e<K, V>.o implements NavigableSet<V> {
        public m(@t7 K key, NavigableSet<V> delegate, @CheckForNull e<K, V>.k ancestor) {
            super(key, delegate, ancestor);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public V ceiling(@t7 V v11) {
            return j().ceiling(v11);
        }

        @Override // java.util.NavigableSet
        public Iterator<V> descendingIterator() {
            return new k.a(j().descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> descendingSet() {
            return l(j().descendingSet());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public V floor(@t7 V v11) {
            return j().floor(v11);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> headSet(@t7 V toElement, boolean inclusive) {
            return l(j().headSet(toElement, inclusive));
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public V higher(@t7 V v11) {
            return j().higher(v11);
        }

        @Override // com.google.common.collect.e.o
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public NavigableSet<V> j() {
            return (NavigableSet) super.j();
        }

        public final NavigableSet<V> l(NavigableSet<V> wrapped) {
            return new m(this.f33388a, wrapped, b() == null ? this : b());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public V lower(@t7 V v11) {
            return j().lower(v11);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public V pollFirst() {
            return (V) l6.T(iterator());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public V pollLast() {
            return (V) l6.T(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> subSet(@t7 V fromElement, boolean fromInclusive, @t7 V toElement, boolean toInclusive) {
            return l(j().subSet(fromElement, fromInclusive, toElement, toInclusive));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> tailSet(@t7 V fromElement, boolean inclusive) {
            return l(j().tailSet(fromElement, inclusive));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class n extends e<K, V>.k implements Set<V> {
        public n(@t7 K key, Set<V> delegate) {
            super(key, delegate, null);
        }

        @Override // com.google.common.collect.e.k, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> c11) {
            if (c11.isEmpty()) {
                return false;
            }
            int size = size();
            boolean I = q8.I((Set) this.f33389b, c11);
            if (I) {
                e.access$212(e.this, this.f33389b.size() - size);
                h();
            }
            return I;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class o extends e<K, V>.k implements SortedSet<V> {
        public o(@t7 K key, SortedSet<V> delegate, @CheckForNull e<K, V>.k ancestor) {
            super(key, delegate, ancestor);
        }

        @Override // java.util.SortedSet
        @CheckForNull
        public Comparator<? super V> comparator() {
            return j().comparator();
        }

        @Override // java.util.SortedSet
        @t7
        public V first() {
            g();
            return j().first();
        }

        @Override // java.util.SortedSet
        public SortedSet<V> headSet(@t7 V toElement) {
            g();
            return new o(f(), j().headSet(toElement), b() == null ? this : b());
        }

        public SortedSet<V> j() {
            return (SortedSet) d();
        }

        @Override // java.util.SortedSet
        @t7
        public V last() {
            g();
            return j().last();
        }

        @Override // java.util.SortedSet
        public SortedSet<V> subSet(@t7 V fromElement, @t7 V toElement) {
            g();
            return new o(f(), j().subSet(fromElement, toElement), b() == null ? this : b());
        }

        @Override // java.util.SortedSet
        public SortedSet<V> tailSet(@t7 V fromElement) {
            g();
            return new o(f(), j().tailSet(fromElement), b() == null ? this : b());
        }
    }

    public e(Map<K, Collection<V>> map) {
        Preconditions.checkArgument(map.isEmpty());
        this.map = map;
    }

    public static /* synthetic */ int access$208(e eVar) {
        int i11 = eVar.totalSize;
        eVar.totalSize = i11 + 1;
        return i11;
    }

    public static /* synthetic */ int access$210(e eVar) {
        int i11 = eVar.totalSize;
        eVar.totalSize = i11 - 1;
        return i11;
    }

    public static /* synthetic */ int access$212(e eVar, int i11) {
        int i12 = eVar.totalSize + i11;
        eVar.totalSize = i12;
        return i12;
    }

    public static /* synthetic */ int access$220(e eVar, int i11) {
        int i12 = eVar.totalSize - i11;
        eVar.totalSize = i12;
        return i12;
    }

    public static <E> Iterator<E> c(Collection<E> collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(@CheckForNull Object key) {
        Collection collection = (Collection) u6.q0(this.map, key);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.totalSize -= size;
        }
    }

    public final Collection<V> a(@t7 K key) {
        Collection<V> collection = this.map.get(key);
        if (collection != null) {
            return collection;
        }
        Collection<V> createCollection = createCollection(key);
        this.map.put(key, createCollection);
        return createCollection;
    }

    public Map<K, Collection<V>> backingMap() {
        return this.map;
    }

    @Override // com.google.common.collect.d7
    public void clear() {
        Iterator<Collection<V>> it = this.map.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.map.clear();
        this.totalSize = 0;
    }

    @Override // com.google.common.collect.d7
    public boolean containsKey(@CheckForNull Object key) {
        return this.map.containsKey(key);
    }

    @Override // com.google.common.collect.h
    public Map<K, Collection<V>> createAsMap() {
        return new c(this.map);
    }

    public abstract Collection<V> createCollection();

    public Collection<V> createCollection(@t7 K key) {
        return createCollection();
    }

    @Override // com.google.common.collect.h
    public Collection<Map.Entry<K, V>> createEntries() {
        return this instanceof p8 ? new h.b() : new h.a();
    }

    @Override // com.google.common.collect.h
    public Set<K> createKeySet() {
        return new C0395e(this.map);
    }

    @Override // com.google.common.collect.h
    public j7<K> createKeys() {
        return new g7.g(this);
    }

    public final Map<K, Collection<V>> createMaybeNavigableAsMap() {
        Map<K, Collection<V>> map = this.map;
        return map instanceof NavigableMap ? new f((NavigableMap) this.map) : map instanceof SortedMap ? new i((SortedMap) this.map) : new c(this.map);
    }

    public final Set<K> createMaybeNavigableKeySet() {
        Map<K, Collection<V>> map = this.map;
        return map instanceof NavigableMap ? new g((NavigableMap) this.map) : map instanceof SortedMap ? new j((SortedMap) this.map) : new C0395e(this.map);
    }

    public Collection<V> createUnmodifiableEmptyCollection() {
        return (Collection<V>) unmodifiableCollectionSubclass(createCollection());
    }

    @Override // com.google.common.collect.h
    public Collection<V> createValues() {
        return new h.c();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7
    public Collection<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    @Override // com.google.common.collect.h
    public Iterator<Map.Entry<K, V>> entryIterator() {
        return new b();
    }

    @Override // com.google.common.collect.d7, com.google.common.collect.p6
    public Collection<V> get(@t7 K key) {
        Collection<V> collection = this.map.get(key);
        if (collection == null) {
            collection = createCollection(key);
        }
        return wrapCollection(key, collection);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7
    public boolean put(@t7 K key, @t7 V value) {
        Collection<V> collection = this.map.get(key);
        if (collection != null) {
            if (!collection.add(value)) {
                return false;
            }
            this.totalSize++;
            return true;
        }
        Collection<V> createCollection = createCollection(key);
        if (!createCollection.add(value)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.totalSize++;
        this.map.put(key, createCollection);
        return true;
    }

    @Override // com.google.common.collect.d7, com.google.common.collect.p6
    public Collection<V> removeAll(@CheckForNull Object obj) {
        Collection<V> remove = this.map.remove(obj);
        if (remove == null) {
            return createUnmodifiableEmptyCollection();
        }
        Collection createCollection = createCollection();
        createCollection.addAll(remove);
        this.totalSize -= remove.size();
        remove.clear();
        return (Collection<V>) unmodifiableCollectionSubclass(createCollection);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    public Collection<V> replaceValues(@t7 K k11, Iterable<? extends V> iterable) {
        Iterator<? extends V> it = iterable.iterator();
        if (!it.hasNext()) {
            return removeAll(k11);
        }
        Collection<V> a11 = a(k11);
        Collection<V> createCollection = createCollection();
        createCollection.addAll(a11);
        this.totalSize -= a11.size();
        a11.clear();
        while (it.hasNext()) {
            if (a11.add(it.next())) {
                this.totalSize++;
            }
        }
        return (Collection<V>) unmodifiableCollectionSubclass(createCollection);
    }

    public final void setMap(Map<K, Collection<V>> map) {
        this.map = map;
        this.totalSize = 0;
        for (Collection<V> collection : map.values()) {
            Preconditions.checkArgument(!collection.isEmpty());
            this.totalSize += collection.size();
        }
    }

    @Override // com.google.common.collect.d7
    public int size() {
        return this.totalSize;
    }

    public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    @Override // com.google.common.collect.h
    public Iterator<V> valueIterator() {
        return new a();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7
    public Collection<V> values() {
        return super.values();
    }

    public Collection<V> wrapCollection(@t7 K key, Collection<V> collection) {
        return new k(key, collection, null);
    }

    public final List<V> wrapList(@t7 K key, List<V> list, @CheckForNull e<K, V>.k ancestor) {
        return list instanceof RandomAccess ? new h(key, list, ancestor) : new l(key, list, ancestor);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class k extends AbstractCollection<V> {

        /* renamed from: a, reason: collision with root package name */
        @t7
        public final K f33388a;

        /* renamed from: b, reason: collision with root package name */
        public Collection<V> f33389b;

        /* renamed from: c, reason: collision with root package name */
        @CheckForNull
        public final e<K, V>.k f33390c;

        /* renamed from: d, reason: collision with root package name */
        @CheckForNull
        public final Collection<V> f33391d;

        public k(@t7 K key, Collection<V> delegate, @CheckForNull e<K, V>.k ancestor) {
            this.f33388a = key;
            this.f33389b = delegate;
            this.f33390c = ancestor;
            this.f33391d = ancestor == null ? null : ancestor.d();
        }

        public void a() {
            e<K, V>.k kVar = this.f33390c;
            if (kVar != null) {
                kVar.a();
            } else {
                e.this.map.put(this.f33388a, this.f33389b);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(@t7 V value) {
            g();
            boolean isEmpty = this.f33389b.isEmpty();
            boolean add = this.f33389b.add(value);
            if (add) {
                e.access$208(e.this);
                if (isEmpty) {
                    a();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f33389b.addAll(collection);
            if (addAll) {
                e.access$212(e.this, this.f33389b.size() - size);
                if (size == 0) {
                    a();
                }
            }
            return addAll;
        }

        @CheckForNull
        public e<K, V>.k b() {
            return this.f33390c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f33389b.clear();
            e.access$220(e.this, size);
            h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object o11) {
            g();
            return this.f33389b.contains(o11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> c11) {
            g();
            return this.f33389b.containsAll(c11);
        }

        public Collection<V> d() {
            return this.f33389b;
        }

        @Override // java.util.Collection
        public boolean equals(@CheckForNull Object object) {
            if (object == this) {
                return true;
            }
            g();
            return this.f33389b.equals(object);
        }

        @t7
        public K f() {
            return this.f33388a;
        }

        public void g() {
            Collection<V> collection;
            e<K, V>.k kVar = this.f33390c;
            if (kVar != null) {
                kVar.g();
                if (this.f33390c.d() != this.f33391d) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f33389b.isEmpty() || (collection = (Collection) e.this.map.get(this.f33388a)) == null) {
                    return;
                }
                this.f33389b = collection;
            }
        }

        public void h() {
            e<K, V>.k kVar = this.f33390c;
            if (kVar != null) {
                kVar.h();
            } else if (this.f33389b.isEmpty()) {
                e.this.map.remove(this.f33388a);
            }
        }

        @Override // java.util.Collection
        public int hashCode() {
            g();
            return this.f33389b.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            g();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@CheckForNull Object o11) {
            g();
            boolean remove = this.f33389b.remove(o11);
            if (remove) {
                e.access$210(e.this);
                h();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> c11) {
            if (c11.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f33389b.removeAll(c11);
            if (removeAll) {
                e.access$212(e.this, this.f33389b.size() - size);
                h();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> c11) {
            Preconditions.checkNotNull(c11);
            int size = size();
            boolean retainAll = this.f33389b.retainAll(c11);
            if (retainAll) {
                e.access$212(e.this, this.f33389b.size() - size);
                h();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            g();
            return this.f33389b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            g();
            return this.f33389b.toString();
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Iterator<V> {

            /* renamed from: a, reason: collision with root package name */
            public final Iterator<V> f33393a;

            /* renamed from: b, reason: collision with root package name */
            public final Collection<V> f33394b;

            public a() {
                Collection<V> collection = k.this.f33389b;
                this.f33394b = collection;
                this.f33393a = e.c(collection);
            }

            public Iterator<V> a() {
                b();
                return this.f33393a;
            }

            public void b() {
                k.this.g();
                if (k.this.f33389b != this.f33394b) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                b();
                return this.f33393a.hasNext();
            }

            @Override // java.util.Iterator
            @t7
            public V next() {
                b();
                return this.f33393a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f33393a.remove();
                e.access$210(e.this);
                k.this.h();
            }

            public a(Iterator<V> delegateIterator) {
                this.f33394b = k.this.f33389b;
                this.f33393a = delegateIterator;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class l extends e<K, V>.k implements List<V> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends e<K, V>.k.a implements ListIterator<V> {
            public a() {
                super();
            }

            @Override // java.util.ListIterator
            public void add(@t7 V value) {
                boolean isEmpty = l.this.isEmpty();
                c().add(value);
                e.access$208(e.this);
                if (isEmpty) {
                    l.this.a();
                }
            }

            public final ListIterator<V> c() {
                return (ListIterator) a();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return c().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return c().nextIndex();
            }

            @Override // java.util.ListIterator
            @t7
            public V previous() {
                return c().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return c().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(@t7 V value) {
                c().set(value);
            }

            public a(int index) {
                super(l.this.j().listIterator(index));
            }
        }

        public l(@t7 K key, List<V> delegate, @CheckForNull e<K, V>.k ancestor) {
            super(key, delegate, ancestor);
        }

        @Override // java.util.List
        public void add(int index, @t7 V element) {
            g();
            boolean isEmpty = d().isEmpty();
            j().add(index, element);
            e.access$208(e.this);
            if (isEmpty) {
                a();
            }
        }

        @Override // java.util.List
        public boolean addAll(int index, Collection<? extends V> c11) {
            if (c11.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = j().addAll(index, c11);
            if (addAll) {
                e.access$212(e.this, d().size() - size);
                if (size == 0) {
                    a();
                }
            }
            return addAll;
        }

        @Override // java.util.List
        @t7
        public V get(int index) {
            g();
            return j().get(index);
        }

        @Override // java.util.List
        public int indexOf(@CheckForNull Object o11) {
            g();
            return j().indexOf(o11);
        }

        public List<V> j() {
            return (List) d();
        }

        @Override // java.util.List
        public int lastIndexOf(@CheckForNull Object o11) {
            g();
            return j().lastIndexOf(o11);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            g();
            return new a();
        }

        @Override // java.util.List
        @t7
        public V remove(int index) {
            g();
            V remove = j().remove(index);
            e.access$210(e.this);
            h();
            return remove;
        }

        @Override // java.util.List
        @t7
        public V set(int index, @t7 V element) {
            g();
            return j().set(index, element);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List<V> subList(int fromIndex, int toIndex) {
            g();
            return e.this.wrapList(f(), j().subList(fromIndex, toIndex), b() == null ? this : b());
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int index) {
            g();
            return new a(index);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends e<K, V>.d<V> {
        public a() {
            super();
        }

        @Override // com.google.common.collect.e.d
        @t7
        public V a(@t7 K key, @t7 V value) {
            return value;
        }
    }
}
