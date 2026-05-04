package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.u6;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.c
/* loaded from: classes7.dex */
public final class y9<K extends Comparable, V> implements y7<K, V> {

    /* renamed from: b, reason: collision with root package name */
    public static final y7<Comparable<?>, Object> f34104b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final NavigableMap<o3<K>, c<K, V>> f34105a = u6.f0();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends u6.a0<Range<K>, V> {

        /* renamed from: a, reason: collision with root package name */
        public final Iterable<Map.Entry<Range<K>, V>> f34106a;

        public b(Iterable<c<K, V>> entryIterable) {
            this.f34106a = entryIterable;
        }

        @Override // com.google.common.collect.u6.a0
        public Iterator<Map.Entry<Range<K>, V>> b() {
            return this.f34106a.iterator();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object key) {
            return get(key) != null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V get(@CheckForNull Object obj) {
            if (!(obj instanceof Range)) {
                return null;
            }
            Range range = (Range) obj;
            c cVar = (c) y9.this.f34105a.get(range.lowerBound);
            if (cVar == null || !cVar.getKey().equals(range)) {
                return null;
            }
            return (V) cVar.getValue();
        }

        @Override // com.google.common.collect.u6.a0, java.util.AbstractMap, java.util.Map
        public int size() {
            return y9.this.f34105a.size();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<K extends Comparable, V> extends g<Range<K>, V> {

        /* renamed from: a, reason: collision with root package name */
        public final Range<K> f34108a;

        /* renamed from: b, reason: collision with root package name */
        public final V f34109b;

        public c(o3<K> lowerBound, o3<K> upperBound, V value) {
            this(Range.create(lowerBound, upperBound), value);
        }

        public boolean c(K value) {
            return this.f34108a.contains(value);
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Range<K> getKey() {
            return this.f34108a;
        }

        public o3<K> g() {
            return this.f34108a.lowerBound;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        public V getValue() {
            return this.f34109b;
        }

        public o3<K> h() {
            return this.f34108a.upperBound;
        }

        public c(Range<K> range, V value) {
            this.f34108a = range;
            this.f34109b = value;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements y7<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final Range<K> f34110a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends y9<K, V>.d.b {

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: com.google.common.collect.y9$d$a$a, reason: collision with other inner class name */
            public class C0409a extends com.google.common.collect.c<Map.Entry<Range<K>, V>> {

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Iterator f34113c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ a f34114d;

                public C0409a(final a this$2, final Iterator val$backingItr) {
                    this.f34113c = val$backingItr;
                    this.f34114d = this$2;
                }

                @Override // com.google.common.collect.c
                @CheckForNull
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public Map.Entry<Range<K>, V> a() {
                    if (!this.f34113c.hasNext()) {
                        return (Map.Entry) b();
                    }
                    c cVar = (c) this.f34113c.next();
                    return cVar.h().compareTo(d.this.f34110a.lowerBound) <= 0 ? (Map.Entry) b() : u6.O(cVar.getKey().intersection(d.this.f34110a), cVar.getValue());
                }
            }

            public a() {
                super();
            }

            @Override // com.google.common.collect.y9.d.b
            public Iterator<Map.Entry<Range<K>, V>> d() {
                return d.this.f34110a.isEmpty() ? l6.t() : new C0409a(this, y9.this.f34105a.headMap(d.this.f34110a.upperBound, false).descendingMap().values().iterator());
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b extends AbstractMap<Range<K>, V> {

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public class a extends u6.b0<Range<K>, V> {
                public a(Map map) {
                    super(map);
                }

                @Override // com.google.common.collect.u6.b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean remove(@CheckForNull Object o11) {
                    return b.this.remove(o11) != null;
                }

                @Override // com.google.common.collect.q8.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(Collection<?> c11) {
                    return b.this.g(ho.j0.h(ho.j0.q(ho.j0.n(c11)), u6.R()));
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: com.google.common.collect.y9$d$b$b, reason: collision with other inner class name */
            public class C0410b extends u6.s<Range<K>, V> {
                public C0410b() {
                }

                @Override // com.google.common.collect.u6.s
                public Map<Range<K>, V> g() {
                    return b.this;
                }

                @Override // com.google.common.collect.u6.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean isEmpty() {
                    return !iterator().hasNext();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<Map.Entry<Range<K>, V>> iterator() {
                    return b.this.d();
                }

                @Override // com.google.common.collect.u6.s, com.google.common.collect.q8.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(Collection<?> c11) {
                    return b.this.g(ho.j0.q(ho.j0.n(c11)));
                }

                @Override // com.google.common.collect.u6.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return l6.Y(iterator());
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public class c extends com.google.common.collect.c<Map.Entry<Range<K>, V>> {

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Iterator f34118c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ b f34119d;

                public c(final b this$2, final Iterator val$backingItr) {
                    this.f34118c = val$backingItr;
                    this.f34119d = this$2;
                }

                @Override // com.google.common.collect.c
                @CheckForNull
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public Map.Entry<Range<K>, V> a() {
                    while (this.f34118c.hasNext()) {
                        c cVar = (c) this.f34118c.next();
                        if (cVar.g().compareTo(d.this.f34110a.upperBound) >= 0) {
                            return (Map.Entry) b();
                        }
                        if (cVar.h().compareTo(d.this.f34110a.lowerBound) > 0) {
                            return u6.O(cVar.getKey().intersection(d.this.f34110a), cVar.getValue());
                        }
                    }
                    return (Map.Entry) b();
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: com.google.common.collect.y9$d$b$d, reason: collision with other inner class name */
            public class C0411d extends u6.q0<Range<K>, V> {
                public C0411d(Map map) {
                    super(map);
                }

                @Override // com.google.common.collect.u6.q0, java.util.AbstractCollection, java.util.Collection
                public boolean removeAll(Collection<?> c11) {
                    return b.this.g(ho.j0.h(ho.j0.n(c11), u6.Q0()));
                }

                @Override // com.google.common.collect.u6.q0, java.util.AbstractCollection, java.util.Collection
                public boolean retainAll(Collection<?> c11) {
                    return b.this.g(ho.j0.h(ho.j0.q(ho.j0.n(c11)), u6.Q0()));
                }
            }

            public b() {
            }

            @Override // java.util.AbstractMap, java.util.Map
            public void clear() {
                d.this.clear();
            }

            @Override // java.util.AbstractMap, java.util.Map
            public boolean containsKey(@CheckForNull Object key) {
                return get(key) != null;
            }

            public Iterator<Map.Entry<Range<K>, V>> d() {
                if (d.this.f34110a.isEmpty()) {
                    return l6.t();
                }
                return new c(this, y9.this.f34105a.tailMap((o3) ho.b0.a((o3) y9.this.f34105a.floorKey(d.this.f34110a.lowerBound), d.this.f34110a.lowerBound), true).values().iterator());
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Set<Map.Entry<Range<K>, V>> entrySet() {
                return new C0410b();
            }

            public final boolean g(ho.i0<? super Map.Entry<Range<K>, V>> predicate) {
                ArrayList q11 = q6.q();
                for (Map.Entry<Range<K>, V> entry : entrySet()) {
                    if (predicate.apply(entry)) {
                        q11.add(entry.getKey());
                    }
                }
                Iterator it = q11.iterator();
                while (it.hasNext()) {
                    y9.this.remove((Range) it.next());
                }
                return !q11.isEmpty();
            }

            @Override // java.util.AbstractMap, java.util.Map
            @CheckForNull
            public V get(@CheckForNull Object obj) {
                c cVar;
                try {
                    if (obj instanceof Range) {
                        Range range = (Range) obj;
                        if (d.this.f34110a.encloses(range) && !range.isEmpty()) {
                            if (range.lowerBound.compareTo(d.this.f34110a.lowerBound) == 0) {
                                Map.Entry floorEntry = y9.this.f34105a.floorEntry(range.lowerBound);
                                cVar = floorEntry != null ? (c) floorEntry.getValue() : null;
                            } else {
                                cVar = (c) y9.this.f34105a.get(range.lowerBound);
                            }
                            if (cVar != null && cVar.getKey().isConnected(d.this.f34110a) && cVar.getKey().intersection(d.this.f34110a).equals(range)) {
                                return (V) cVar.getValue();
                            }
                        }
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Set<Range<K>> keySet() {
                return new a(this);
            }

            @Override // java.util.AbstractMap, java.util.Map
            @CheckForNull
            public V remove(@CheckForNull Object obj) {
                V v11 = (V) get(obj);
                if (v11 == null) {
                    return null;
                }
                Objects.requireNonNull(obj);
                y9.this.remove((Range) obj);
                return v11;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Collection<V> values() {
                return new C0411d(this);
            }
        }

        public d(Range<K> subRange) {
            this.f34110a = subRange;
        }

        @Override // com.google.common.collect.y7
        public Map<Range<K>, V> asDescendingMapOfRanges() {
            return new a();
        }

        @Override // com.google.common.collect.y7
        public Map<Range<K>, V> asMapOfRanges() {
            return new b();
        }

        @Override // com.google.common.collect.y7
        public void clear() {
            y9.this.remove(this.f34110a);
        }

        @Override // com.google.common.collect.y7
        public boolean equals(@CheckForNull Object o11) {
            if (o11 instanceof y7) {
                return asMapOfRanges().equals(((y7) o11).asMapOfRanges());
            }
            return false;
        }

        @Override // com.google.common.collect.y7
        @CheckForNull
        public V get(K k11) {
            if (this.f34110a.contains(k11)) {
                return (V) y9.this.get(k11);
            }
            return null;
        }

        @Override // com.google.common.collect.y7
        @CheckForNull
        public Map.Entry<Range<K>, V> getEntry(K key) {
            Map.Entry<Range<K>, V> entry;
            if (!this.f34110a.contains(key) || (entry = y9.this.getEntry(key)) == null) {
                return null;
            }
            return u6.O(entry.getKey().intersection(this.f34110a), entry.getValue());
        }

        @Override // com.google.common.collect.y7
        public int hashCode() {
            return asMapOfRanges().hashCode();
        }

        @Override // com.google.common.collect.y7
        public void put(Range<K> range, V value) {
            Preconditions.checkArgument(this.f34110a.encloses(range), "Cannot put range %s into a subRangeMap(%s)", range, this.f34110a);
            y9.this.put(range, value);
        }

        @Override // com.google.common.collect.y7
        public void putAll(y7<K, ? extends V> rangeMap) {
            if (rangeMap.asMapOfRanges().isEmpty()) {
                return;
            }
            Range<K> span = rangeMap.span();
            Preconditions.checkArgument(this.f34110a.encloses(span), "Cannot putAll rangeMap with span %s into a subRangeMap(%s)", span, this.f34110a);
            y9.this.putAll(rangeMap);
        }

        @Override // com.google.common.collect.y7
        public void putCoalescing(Range<K> range, V value) {
            if (y9.this.f34105a.isEmpty() || !this.f34110a.encloses(range)) {
                put(range, value);
            } else {
                put(y9.this.e(range, Preconditions.checkNotNull(value)).intersection(this.f34110a), value);
            }
        }

        @Override // com.google.common.collect.y7
        public void remove(Range<K> range) {
            if (range.isConnected(this.f34110a)) {
                y9.this.remove(range.intersection(this.f34110a));
            }
        }

        @Override // com.google.common.collect.y7
        public Range<K> span() {
            o3<K> o3Var;
            Map.Entry floorEntry = y9.this.f34105a.floorEntry(this.f34110a.lowerBound);
            if (floorEntry == null || ((c) floorEntry.getValue()).h().compareTo(this.f34110a.lowerBound) <= 0) {
                o3Var = (o3) y9.this.f34105a.ceilingKey(this.f34110a.lowerBound);
                if (o3Var == null || o3Var.compareTo(this.f34110a.upperBound) >= 0) {
                    throw new NoSuchElementException();
                }
            } else {
                o3Var = this.f34110a.lowerBound;
            }
            Map.Entry lowerEntry = y9.this.f34105a.lowerEntry(this.f34110a.upperBound);
            if (lowerEntry != null) {
                return Range.create(o3Var, ((c) lowerEntry.getValue()).h().compareTo(this.f34110a.upperBound) >= 0 ? this.f34110a.upperBound : ((c) lowerEntry.getValue()).h());
            }
            throw new NoSuchElementException();
        }

        @Override // com.google.common.collect.y7
        public y7<K, V> subRangeMap(Range<K> range) {
            return !range.isConnected(this.f34110a) ? y9.this.g() : y9.this.subRangeMap(range.intersection(this.f34110a));
        }

        @Override // com.google.common.collect.y7
        public String toString() {
            return asMapOfRanges().toString();
        }
    }

    public static <K extends Comparable, V> Range<K> d(Range<K> range, V value, @CheckForNull Map.Entry<o3<K>, c<K, V>> entry) {
        return (entry != null && entry.getValue().getKey().isConnected(range) && entry.getValue().getValue().equals(value)) ? range.span(entry.getValue().getKey()) : range;
    }

    public static <K extends Comparable, V> y9<K, V> f() {
        return new y9<>();
    }

    @Override // com.google.common.collect.y7
    public Map<Range<K>, V> asDescendingMapOfRanges() {
        return new b(this.f34105a.descendingMap().values());
    }

    @Override // com.google.common.collect.y7
    public Map<Range<K>, V> asMapOfRanges() {
        return new b(this.f34105a.values());
    }

    @Override // com.google.common.collect.y7
    public void clear() {
        this.f34105a.clear();
    }

    public final Range<K> e(Range<K> range, V value) {
        return d(d(range, value, this.f34105a.lowerEntry(range.lowerBound)), value, this.f34105a.floorEntry(range.upperBound));
    }

    @Override // com.google.common.collect.y7
    public boolean equals(@CheckForNull Object o11) {
        if (o11 instanceof y7) {
            return asMapOfRanges().equals(((y7) o11).asMapOfRanges());
        }
        return false;
    }

    public final y7<K, V> g() {
        return f34104b;
    }

    @Override // com.google.common.collect.y7
    @CheckForNull
    public V get(K key) {
        Map.Entry<Range<K>, V> entry = getEntry(key);
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    @Override // com.google.common.collect.y7
    @CheckForNull
    public Map.Entry<Range<K>, V> getEntry(K key) {
        Map.Entry<o3<K>, c<K, V>> floorEntry = this.f34105a.floorEntry(o3.d(key));
        if (floorEntry == null || !floorEntry.getValue().c(key)) {
            return null;
        }
        return floorEntry.getValue();
    }

    public final void h(o3<K> lowerBound, o3<K> upperBound, V value) {
        this.f34105a.put(lowerBound, new c<>(lowerBound, upperBound, value));
    }

    @Override // com.google.common.collect.y7
    public int hashCode() {
        return asMapOfRanges().hashCode();
    }

    @Override // com.google.common.collect.y7
    public void put(Range<K> range, V value) {
        if (range.isEmpty()) {
            return;
        }
        Preconditions.checkNotNull(value);
        remove(range);
        this.f34105a.put(range.lowerBound, new c<>(range, value));
    }

    @Override // com.google.common.collect.y7
    public void putAll(y7<K, ? extends V> rangeMap) {
        for (Map.Entry<Range<K>, ? extends V> entry : rangeMap.asMapOfRanges().entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.y7
    public void putCoalescing(Range<K> range, V value) {
        if (this.f34105a.isEmpty()) {
            put(range, value);
        } else {
            put(e(range, Preconditions.checkNotNull(value)), value);
        }
    }

    @Override // com.google.common.collect.y7
    public void remove(Range<K> rangeToRemove) {
        if (rangeToRemove.isEmpty()) {
            return;
        }
        Map.Entry<o3<K>, c<K, V>> lowerEntry = this.f34105a.lowerEntry(rangeToRemove.lowerBound);
        if (lowerEntry != null) {
            c<K, V> value = lowerEntry.getValue();
            if (value.h().compareTo(rangeToRemove.lowerBound) > 0) {
                if (value.h().compareTo(rangeToRemove.upperBound) > 0) {
                    h(rangeToRemove.upperBound, value.h(), lowerEntry.getValue().getValue());
                }
                h(value.g(), rangeToRemove.lowerBound, lowerEntry.getValue().getValue());
            }
        }
        Map.Entry<o3<K>, c<K, V>> lowerEntry2 = this.f34105a.lowerEntry(rangeToRemove.upperBound);
        if (lowerEntry2 != null) {
            c<K, V> value2 = lowerEntry2.getValue();
            if (value2.h().compareTo(rangeToRemove.upperBound) > 0) {
                h(rangeToRemove.upperBound, value2.h(), lowerEntry2.getValue().getValue());
            }
        }
        this.f34105a.subMap(rangeToRemove.lowerBound, rangeToRemove.upperBound).clear();
    }

    @Override // com.google.common.collect.y7
    public Range<K> span() {
        Map.Entry<o3<K>, c<K, V>> firstEntry = this.f34105a.firstEntry();
        Map.Entry<o3<K>, c<K, V>> lastEntry = this.f34105a.lastEntry();
        if (firstEntry == null || lastEntry == null) {
            throw new NoSuchElementException();
        }
        return Range.create(firstEntry.getValue().getKey().lowerBound, lastEntry.getValue().getKey().upperBound);
    }

    @Override // com.google.common.collect.y7
    public y7<K, V> subRangeMap(Range<K> subRange) {
        return subRange.equals(Range.all()) ? this : new d(subRange);
    }

    @Override // com.google.common.collect.y7
    public String toString() {
        return this.f34105a.values().toString();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements y7<Comparable<?>, Object> {
        @Override // com.google.common.collect.y7
        public Map<Range<Comparable<?>>, Object> asDescendingMapOfRanges() {
            return Collections.EMPTY_MAP;
        }

        @Override // com.google.common.collect.y7
        public Map<Range<Comparable<?>>, Object> asMapOfRanges() {
            return Collections.EMPTY_MAP;
        }

        @Override // com.google.common.collect.y7
        @CheckForNull
        public Object get(Comparable<?> key) {
            return null;
        }

        @Override // com.google.common.collect.y7
        @CheckForNull
        public Map.Entry<Range<Comparable<?>>, Object> getEntry(Comparable<?> key) {
            return null;
        }

        @Override // com.google.common.collect.y7
        public void put(Range<Comparable<?>> range, Object value) {
            Preconditions.checkNotNull(range);
            throw new IllegalArgumentException("Cannot insert range " + range + " into an empty subRangeMap");
        }

        @Override // com.google.common.collect.y7
        public void putAll(y7<Comparable<?>, ? extends Object> rangeMap) {
            if (!rangeMap.asMapOfRanges().isEmpty()) {
                throw new IllegalArgumentException("Cannot putAll(nonEmptyRangeMap) into an empty subRangeMap");
            }
        }

        @Override // com.google.common.collect.y7
        public void putCoalescing(Range<Comparable<?>> range, Object value) {
            Preconditions.checkNotNull(range);
            throw new IllegalArgumentException("Cannot insert range " + range + " into an empty subRangeMap");
        }

        @Override // com.google.common.collect.y7
        public void remove(Range<Comparable<?>> range) {
            Preconditions.checkNotNull(range);
        }

        @Override // com.google.common.collect.y7
        public Range<Comparable<?>> span() {
            throw new NoSuchElementException();
        }

        @Override // com.google.common.collect.y7
        public y7<Comparable<?>, Object> subRangeMap(Range<Comparable<?>> range) {
            Preconditions.checkNotNull(range);
            return this;
        }

        @Override // com.google.common.collect.y7
        public void clear() {
        }
    }
}
