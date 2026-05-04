package com.google.common.collect;

import com.google.common.collect.u6;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.c
/* loaded from: classes7.dex */
public abstract class j<K, V> extends u6.a0<K, V> implements NavigableMap<K, V> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends u6.q<K, V> {
        public b() {
        }

        @Override // com.google.common.collect.u6.q
        public Iterator<Map.Entry<K, V>> x() {
            return j.this.d();
        }

        @Override // com.google.common.collect.u6.q
        public NavigableMap<K, V> y() {
            return j.this;
        }
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> ceilingEntry(@t7 K key) {
        return tailMap(key, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K ceilingKey(@t7 K k11) {
        return (K) u6.T(ceilingEntry(k11));
    }

    public abstract Iterator<Map.Entry<K, V>> d();

    @Override // java.util.NavigableMap
    public NavigableSet<K> descendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> descendingMap() {
        return new b();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> firstEntry() {
        return (Map.Entry) l6.I(b(), null);
    }

    @Override // java.util.SortedMap
    @t7
    public K firstKey() {
        Map.Entry<K, V> firstEntry = firstEntry();
        if (firstEntry != null) {
            return firstEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> floorEntry(@t7 K key) {
        return headMap(key, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K floorKey(@t7 K k11) {
        return (K) u6.T(floorEntry(k11));
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public abstract V get(@CheckForNull Object key);

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> headMap(@t7 K toKey) {
        return headMap(toKey, false);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> higherEntry(@t7 K key) {
        return tailMap(key, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K higherKey(@t7 K k11) {
        return (K) u6.T(higherEntry(k11));
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set<K> keySet() {
        return navigableKeySet();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> lastEntry() {
        return (Map.Entry) l6.I(d(), null);
    }

    @Override // java.util.SortedMap
    @t7
    public K lastKey() {
        Map.Entry<K, V> lastEntry = lastEntry();
        if (lastEntry != null) {
            return lastEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> lowerEntry(@t7 K key) {
        return headMap(key, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K lowerKey(@t7 K k11) {
        return (K) u6.T(lowerEntry(k11));
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> navigableKeySet() {
        return new u6.e0(this);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> pollFirstEntry() {
        return (Map.Entry) l6.T(b());
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> pollLastEntry() {
        return (Map.Entry) l6.T(d());
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> subMap(@t7 K fromKey, @t7 K toKey) {
        return subMap(fromKey, true, toKey, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> tailMap(@t7 K fromKey) {
        return tailMap(fromKey, true);
    }
}
