package com.google.common.collect;

import com.google.common.collect.u6;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.c
/* loaded from: classes7.dex */
public abstract class a5<K, V> extends g5<K, V> implements NavigableMap<K, V> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends u6.q<K, V> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.google.common.collect.a5$a$a, reason: collision with other inner class name */
        public class C0391a implements Iterator<Map.Entry<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            @CheckForNull
            public Map.Entry<K, V> f33252a = null;

            /* renamed from: b, reason: collision with root package name */
            @CheckForNull
            public Map.Entry<K, V> f33253b;

            public C0391a() {
                this.f33253b = a.this.y().lastEntry();
            }

            @Override // java.util.Iterator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                Map.Entry<K, V> entry = this.f33253b;
                if (entry == null) {
                    throw new NoSuchElementException();
                }
                this.f33252a = entry;
                this.f33253b = a.this.y().lowerEntry(this.f33253b.getKey());
                return entry;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f33253b != null;
            }

            @Override // java.util.Iterator
            public void remove() {
                if (this.f33252a == null) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                a.this.y().remove(this.f33252a.getKey());
                this.f33252a = null;
            }
        }

        public a() {
        }

        @Override // com.google.common.collect.u6.q
        public Iterator<Map.Entry<K, V>> x() {
            return new C0391a();
        }

        @Override // com.google.common.collect.u6.q
        public NavigableMap<K, V> y() {
            return a5.this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends u6.e0<K, V> {
        public b() {
            super(a5.this);
        }
    }

    @CheckForNull
    public Map.Entry<K, V> A(@t7 K key) {
        return tailMap(key, true).firstEntry();
    }

    @CheckForNull
    public K B(@t7 K k11) {
        return (K) u6.T(ceilingEntry(k11));
    }

    public NavigableSet<K> C() {
        return descendingMap().navigableKeySet();
    }

    @CheckForNull
    public Map.Entry<K, V> D() {
        return (Map.Entry) k6.v(entrySet(), null);
    }

    public K F() {
        Map.Entry<K, V> firstEntry = firstEntry();
        if (firstEntry != null) {
            return firstEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @CheckForNull
    public Map.Entry<K, V> G(@t7 K key) {
        return headMap(key, true).lastEntry();
    }

    @CheckForNull
    public K H(@t7 K k11) {
        return (K) u6.T(floorEntry(k11));
    }

    public SortedMap<K, V> I(@t7 K toKey) {
        return headMap(toKey, false);
    }

    @CheckForNull
    public Map.Entry<K, V> J(@t7 K key) {
        return tailMap(key, false).firstEntry();
    }

    @CheckForNull
    public K K(@t7 K k11) {
        return (K) u6.T(higherEntry(k11));
    }

    @CheckForNull
    public Map.Entry<K, V> L() {
        return (Map.Entry) k6.v(descendingMap().entrySet(), null);
    }

    public K M() {
        Map.Entry<K, V> lastEntry = lastEntry();
        if (lastEntry != null) {
            return lastEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @CheckForNull
    public Map.Entry<K, V> N(@t7 K key) {
        return headMap(key, false).lastEntry();
    }

    @CheckForNull
    public K O(@t7 K k11) {
        return (K) u6.T(lowerEntry(k11));
    }

    @CheckForNull
    public Map.Entry<K, V> P() {
        return (Map.Entry) l6.T(entrySet().iterator());
    }

    @CheckForNull
    public Map.Entry<K, V> R() {
        return (Map.Entry) l6.T(descendingMap().entrySet().iterator());
    }

    public SortedMap<K, V> S(@t7 K fromKey) {
        return tailMap(fromKey, true);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> ceilingEntry(@t7 K key) {
        return delegate().ceilingEntry(key);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K ceilingKey(@t7 K key) {
        return delegate().ceilingKey(key);
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> descendingKeySet() {
        return delegate().descendingKeySet();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> descendingMap() {
        return delegate().descendingMap();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> firstEntry() {
        return delegate().firstEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> floorEntry(@t7 K key) {
        return delegate().floorEntry(key);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K floorKey(@t7 K key) {
        return delegate().floorKey(key);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> headMap(@t7 K toKey, boolean inclusive) {
        return delegate().headMap(toKey, inclusive);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> higherEntry(@t7 K key) {
        return delegate().higherEntry(key);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K higherKey(@t7 K key) {
        return delegate().higherKey(key);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> lastEntry() {
        return delegate().lastEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> lowerEntry(@t7 K key) {
        return delegate().lowerEntry(key);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K lowerKey(@t7 K key) {
        return delegate().lowerKey(key);
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> navigableKeySet() {
        return delegate().navigableKeySet();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> pollFirstEntry() {
        return delegate().pollFirstEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> pollLastEntry() {
        return delegate().pollLastEntry();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> subMap(@t7 K fromKey, boolean fromInclusive, @t7 K toKey, boolean toInclusive) {
        return delegate().subMap(fromKey, fromInclusive, toKey, toInclusive);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> tailMap(@t7 K fromKey, boolean inclusive) {
        return delegate().tailMap(fromKey, inclusive);
    }

    @Override // com.google.common.collect.g5
    public SortedMap<K, V> x(@t7 K fromKey, @t7 K toKey) {
        return subMap(fromKey, true, toKey, false);
    }

    @Override // com.google.common.collect.g5
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public abstract NavigableMap<K, V> delegate();
}
