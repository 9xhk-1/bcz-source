package com.google.common.collect;

import com.baicizhan.client.business.dataset.provider.a;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.SortedMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true, serializable = true)
/* loaded from: classes7.dex */
public final class ImmutableSortedMap<K, V> extends ImmutableMap<K, V> implements NavigableMap<K, V> {
    private static final long serialVersionUID = 0;

    @CheckForNull
    private transient ImmutableSortedMap<K, V> descendingMap;
    private final transient i8<K> keySet;
    private final transient ImmutableList<V> valueList;
    private static final Comparator<?> NATURAL_ORDER = s7.z();
    private static final ImmutableSortedMap<Comparable<?>, Object> NATURAL_EMPTY_MAP = new ImmutableSortedMap<>(ImmutableSortedSet.emptySet(s7.z()), ImmutableList.of());

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends u5<K, V> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.google.common.collect.ImmutableSortedMap$a$a, reason: collision with other inner class name */
        public class C0389a extends ImmutableList<Map.Entry<K, V>> {
            public C0389a() {
            }

            @Override // java.util.List
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> get(int index) {
                return new AbstractMap.SimpleImmutableEntry(ImmutableSortedMap.this.keySet.asList().get(index), ImmutableSortedMap.this.valueList.get(index));
            }

            @Override // com.google.common.collect.ImmutableCollection
            public boolean isPartialView() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return ImmutableSortedMap.this.size();
            }

            @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
            @go.d
            @go.c
            public Object writeReplace() {
                return super.writeReplace();
            }
        }

        public a() {
        }

        @Override // com.google.common.collect.u5
        public ImmutableMap<K, V> a() {
            return ImmutableSortedMap.this;
        }

        @Override // com.google.common.collect.ImmutableSet
        public ImmutableList<Map.Entry<K, V>> createAsList() {
            return new C0389a();
        }

        @Override // com.google.common.collect.u5, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @go.d
        @go.c
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public aa<Map.Entry<K, V>> iterator() {
            return asList().iterator();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<K, V> extends ImmutableMap.b<K, V> {

        /* renamed from: f, reason: collision with root package name */
        public transient Object[] f33083f;

        /* renamed from: g, reason: collision with root package name */
        public transient Object[] f33084g;

        /* renamed from: h, reason: collision with root package name */
        public final Comparator<? super K> f33085h;

        public b(Comparator<? super K> comparator) {
            this(comparator, 4);
        }

        public final void f(int minCapacity) {
            Object[] objArr = this.f33083f;
            if (minCapacity > objArr.length) {
                int f11 = ImmutableCollection.b.f(objArr.length, minCapacity);
                this.f33083f = Arrays.copyOf(this.f33083f, f11);
                this.f33084g = Arrays.copyOf(this.f33084g, f11);
            }
        }

        @Override // com.google.common.collect.ImmutableMap.b
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedMap<K, V> a() {
            return d();
        }

        @Override // com.google.common.collect.ImmutableMap.b
        @Deprecated
        @uo.e
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final ImmutableSortedMap<K, V> c() {
            throw new UnsupportedOperationException("ImmutableSortedMap.Builder does not yet implement buildKeepingLast()");
        }

        @Override // com.google.common.collect.ImmutableMap.b
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedMap<K, V> d() {
            int i11 = this.f33005c;
            if (i11 == 0) {
                return ImmutableSortedMap.emptyMap(this.f33085h);
            }
            if (i11 == 1) {
                Comparator<? super K> comparator = this.f33085h;
                Object obj = this.f33083f[0];
                Objects.requireNonNull(obj);
                Object obj2 = this.f33084g[0];
                Objects.requireNonNull(obj2);
                return ImmutableSortedMap.of(comparator, obj, obj2);
            }
            Object[] copyOf = Arrays.copyOf(this.f33083f, i11);
            Arrays.sort(copyOf, this.f33085h);
            Object[] objArr = new Object[this.f33005c];
            for (int i12 = 0; i12 < this.f33005c; i12++) {
                if (i12 > 0) {
                    int i13 = i12 - 1;
                    if (this.f33085h.compare(copyOf[i13], copyOf[i12]) == 0) {
                        throw new IllegalArgumentException("keys required to be distinct but compared as equal: " + copyOf[i13] + " and " + copyOf[i12]);
                    }
                }
                Object obj3 = this.f33083f[i12];
                Objects.requireNonNull(obj3);
                int binarySearch = Arrays.binarySearch(copyOf, obj3, this.f33085h);
                Object obj4 = this.f33084g[i12];
                Objects.requireNonNull(obj4);
                objArr[binarySearch] = obj4;
            }
            return new ImmutableSortedMap<>(new i8(ImmutableList.asImmutableList(copyOf), this.f33085h), ImmutableList.asImmutableList(objArr));
        }

        @uo.a
        public b<K, V> q(b<K, V> other) {
            f(this.f33005c + other.f33005c);
            System.arraycopy(other.f33083f, 0, this.f33083f, this.f33005c, other.f33005c);
            System.arraycopy(other.f33084g, 0, this.f33084g, this.f33005c, other.f33005c);
            this.f33005c += other.f33005c;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.b
        @Deprecated
        @uo.e("Always throws UnsupportedOperationException")
        @uo.a
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final b<K, V> h(Comparator<? super V> valueComparator) {
            throw new UnsupportedOperationException("Not available on ImmutableSortedMap.Builder");
        }

        @Override // com.google.common.collect.ImmutableMap.b
        @uo.a
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public b<K, V> i(K key, V value) {
            f(this.f33005c + 1);
            x2.a(key, value);
            Object[] objArr = this.f33083f;
            int i11 = this.f33005c;
            objArr[i11] = key;
            this.f33084g[i11] = value;
            this.f33005c = i11 + 1;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.b
        @uo.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public b<K, V> j(Map.Entry<? extends K, ? extends V> entry) {
            super.j(entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.b
        @uo.a
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public b<K, V> k(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
            super.k(entries);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.b
        @uo.a
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public b<K, V> l(Map<? extends K, ? extends V> map) {
            super.l(map);
            return this;
        }

        public b(Comparator<? super K> comparator, int initialCapacity) {
            this.f33085h = (Comparator) Preconditions.checkNotNull(comparator);
            this.f33083f = new Object[initialCapacity];
            this.f33084g = new Object[initialCapacity];
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.d
    public static class c<K, V> extends ImmutableMap.e<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: d, reason: collision with root package name */
        public final Comparator<? super K> f33086d;

        public c(ImmutableSortedMap<K, V> sortedMap) {
            super(sortedMap);
            this.f33086d = sortedMap.comparator();
        }

        @Override // com.google.common.collect.ImmutableMap.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public b<K, V> b(int size) {
            return new b<>(this.f33086d);
        }
    }

    public ImmutableSortedMap(i8<K> keySet, ImmutableList<V> valueList) {
        this(keySet, valueList, null);
    }

    public static /* synthetic */ int b(Comparator comparator, Map.Entry entry, Map.Entry entry2) {
        Objects.requireNonNull(entry);
        Objects.requireNonNull(entry2);
        return comparator.compare(entry.getKey(), entry2.getKey());
    }

    @Deprecated
    @uo.e("Use naturalOrder")
    public static <K, V> b<K, V> builder() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @uo.e("Use naturalOrder (which does not accept an expected size)")
    public static <K, V> b<K, V> builderWithExpectedSize(int expectedSize) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        return copyOfInternal(map, (s7) NATURAL_ORDER);
    }

    private static <K, V> ImmutableSortedMap<K, V> copyOfInternal(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        boolean z11 = false;
        if (map instanceof SortedMap) {
            Comparator<? super K> comparator2 = ((SortedMap) map).comparator();
            if (comparator2 != null) {
                z11 = comparator.equals(comparator2);
            } else if (comparator == NATURAL_ORDER) {
                z11 = true;
            }
        }
        if (z11 && (map instanceof ImmutableSortedMap)) {
            ImmutableSortedMap<K, V> immutableSortedMap = (ImmutableSortedMap) map;
            if (!immutableSortedMap.isPartialView()) {
                return immutableSortedMap;
            }
        }
        return fromEntries(comparator, z11, map.entrySet());
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOfSorted(SortedMap<K, ? extends V> map) {
        Comparator comparator = map.comparator();
        if (comparator == null) {
            comparator = NATURAL_ORDER;
        }
        if (map instanceof ImmutableSortedMap) {
            ImmutableSortedMap<K, V> immutableSortedMap = (ImmutableSortedMap) map;
            if (!immutableSortedMap.isPartialView()) {
                return immutableSortedMap;
            }
        }
        return fromEntries(comparator, true, map.entrySet());
    }

    public static <K, V> ImmutableSortedMap<K, V> emptyMap(Comparator<? super K> comparator) {
        return s7.z().equals(comparator) ? of() : new ImmutableSortedMap<>(ImmutableSortedSet.emptySet(comparator), ImmutableList.of());
    }

    private static <K extends Comparable<? super K>, V> ImmutableSortedMap<K, V> fromEntries(Map.Entry<K, V>... entries) {
        return fromEntries(s7.z(), false, entries, entries.length);
    }

    private ImmutableSortedMap<K, V> getSubMap(int fromIndex, int toIndex) {
        return (fromIndex == 0 && toIndex == size()) ? this : fromIndex == toIndex ? emptyMap(comparator()) : new ImmutableSortedMap<>(this.keySet.a(fromIndex, toIndex), this.valueList.subList(fromIndex, toIndex));
    }

    public static <K extends Comparable<?>, V> b<K, V> naturalOrder() {
        return new b<>(s7.z());
    }

    public static <K, V> ImmutableSortedMap<K, V> of() {
        return (ImmutableSortedMap<K, V>) NATURAL_EMPTY_MAP;
    }

    @Deprecated
    @uo.e("ImmutableSortedMap.ofEntries not currently available; use ImmutableSortedMap.copyOf")
    @SafeVarargs
    public static <K, V> ImmutableSortedMap<K, V> ofEntries(Map.Entry<? extends K, ? extends V>... entries) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> b<K, V> orderedBy(Comparator<K> comparator) {
        return new b<>(comparator);
    }

    @go.d
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <K extends Comparable<?>, V> b<K, V> reverseOrder() {
        return new b<>(s7.z().F());
    }

    @Deprecated
    @uo.e("Use toImmutableSortedMap")
    @p5
    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends V> valueFunction) {
        throw new UnsupportedOperationException();
    }

    @p5
    public static <T, K, V> Collector<T, ?, ImmutableSortedMap<K, V>> toImmutableSortedMap(Comparator<? super K> comparator, Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends V> valueFunction) {
        return v2.U(comparator, keyFunction, valueFunction);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> ceilingEntry(K key) {
        return tailMap((ImmutableSortedMap<K, V>) key, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K ceilingKey(K k11) {
        return (K) u6.T(ceilingEntry(k11));
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return keySet().comparator();
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
        return isEmpty() ? ImmutableSet.of() : new a();
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<K> createKeySet() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableCollection<V> createValues() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return entrySet().asList().get(0);
    }

    @Override // java.util.SortedMap
    public K firstKey() {
        return keySet().first();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> floorEntry(K key) {
        return headMap((ImmutableSortedMap<K, V>) key, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K floorKey(K k11) {
        return (K) u6.T(floorEntry(k11));
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object key) {
        int indexOf = this.keySet.indexOf(key);
        if (indexOf == -1) {
            return null;
        }
        return this.valueList.get(indexOf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    public /* bridge */ /* synthetic */ NavigableMap headMap(Object toKey, boolean inclusive) {
        return headMap((ImmutableSortedMap<K, V>) toKey, inclusive);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> higherEntry(K key) {
        return tailMap((ImmutableSortedMap<K, V>) key, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K higherKey(K k11) {
        return (K) u6.T(higherEntry(k11));
    }

    @Override // com.google.common.collect.ImmutableMap
    public boolean isPartialView() {
        return this.keySet.isPartialView() || this.valueList.isPartialView();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return entrySet().asList().get(size() - 1);
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        return keySet().last();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> lowerEntry(K key) {
        return headMap((ImmutableSortedMap<K, V>) key, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K lowerKey(K k11) {
        return (K) u6.T(lowerEntry(k11));
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    @uo.a
    public final Map.Entry<K, V> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    @uo.a
    public final Map.Entry<K, V> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public int size() {
        return this.valueList.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    public /* bridge */ /* synthetic */ NavigableMap subMap(Object fromKey, boolean fromInclusive, Object toKey, boolean toInclusive) {
        return subMap((boolean) fromKey, fromInclusive, (boolean) toKey, toInclusive);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    public /* bridge */ /* synthetic */ NavigableMap tailMap(Object fromKey, boolean inclusive) {
        return tailMap((ImmutableSortedMap<K, V>) fromKey, inclusive);
    }

    @Override // com.google.common.collect.ImmutableMap
    @go.d
    public Object writeReplace() {
        return new c(this);
    }

    public ImmutableSortedMap(i8<K> keySet, ImmutableList<V> valueList, @CheckForNull ImmutableSortedMap<K, V> descendingMap) {
        this.keySet = keySet;
        this.valueList = valueList;
        this.descendingMap = descendingMap;
    }

    private static <K, V> ImmutableSortedMap<K, V> fromEntries(Comparator<? super K> comparator, boolean sameComparator, Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
        Map.Entry[] entryArr = (Map.Entry[]) k6.R(entries, ImmutableMap.EMPTY_ENTRY_ARRAY);
        return fromEntries(comparator, sameComparator, entryArr, entryArr.length);
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap of(Comparable k12, Object v12) {
        return of(s7.z(), k12, v12);
    }

    @Deprecated
    @uo.e("Use toImmutableSortedMap")
    @p5
    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends V> valueFunction, BinaryOperator<V> mergeFunction) {
        throw new UnsupportedOperationException();
    }

    @p5
    public static <T, K, V> Collector<T, ?, ImmutableSortedMap<K, V>> toImmutableSortedMap(Comparator<? super K> comparator, Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends V> valueFunction, BinaryOperator<V> mergeFunction) {
        return v2.V(comparator, keyFunction, valueFunction, mergeFunction);
    }

    @Override // java.util.NavigableMap
    public ImmutableSortedSet<K> descendingKeySet() {
        return this.keySet.descendingSet();
    }

    @Override // java.util.NavigableMap
    public ImmutableSortedMap<K, V> descendingMap() {
        ImmutableSortedMap<K, V> immutableSortedMap = this.descendingMap;
        return immutableSortedMap == null ? isEmpty() ? emptyMap(s7.i(comparator()).F()) : new ImmutableSortedMap<>((i8) this.keySet.descendingSet(), this.valueList.reverse(), this) : immutableSortedMap;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        return super.entrySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap, java.util.SortedMap
    public /* bridge */ /* synthetic */ SortedMap headMap(Object toKey) {
        return headMap((ImmutableSortedMap<K, V>) toKey);
    }

    @Override // java.util.NavigableMap
    public ImmutableSortedSet<K> navigableKeySet() {
        return this.keySet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap, java.util.SortedMap
    public /* bridge */ /* synthetic */ SortedMap tailMap(Object fromKey) {
        return tailMap((ImmutableSortedMap<K, V>) fromKey);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.u
    public ImmutableCollection<V> values() {
        return this.valueList;
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        return copyOfInternal(map, (Comparator) Preconditions.checkNotNull(comparator));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> ImmutableSortedMap<K, V> of(Comparator<? super K> comparator, K k12, V v12) {
        return new ImmutableSortedMap<>(new i8(ImmutableList.of(k12), (Comparator) Preconditions.checkNotNull(comparator)), ImmutableList.of(v12));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public ImmutableSortedMap<K, V> headMap(K toKey) {
        return headMap((ImmutableSortedMap<K, V>) toKey, false);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public ImmutableSortedSet<K> keySet() {
        return this.keySet;
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public ImmutableSortedMap<K, V> subMap(K fromKey, K toKey) {
        return subMap((boolean) fromKey, true, (boolean) toKey, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public ImmutableSortedMap<K, V> tailMap(K fromKey) {
        return tailMap((ImmutableSortedMap<K, V>) fromKey, true);
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
        return copyOf(entries, (s7) NATURAL_ORDER);
    }

    private static <K, V> ImmutableSortedMap<K, V> fromEntries(final Comparator<? super K> comparator, boolean sameComparator, Map.Entry<K, V>[] entryArray, int size) {
        if (size == 0) {
            return emptyMap(comparator);
        }
        if (size != 1) {
            Object[] objArr = new Object[size];
            Object[] objArr2 = new Object[size];
            if (sameComparator) {
                for (int i11 = 0; i11 < size; i11++) {
                    Map.Entry<K, V> entry = entryArray[i11];
                    Objects.requireNonNull(entry);
                    Map.Entry<K, V> entry2 = entry;
                    K key = entry2.getKey();
                    V value = entry2.getValue();
                    x2.a(key, value);
                    objArr[i11] = key;
                    objArr2[i11] = value;
                }
            } else {
                Arrays.sort(entryArray, 0, size, new Comparator() { // from class: com.google.common.collect.b6
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return ImmutableSortedMap.b(comparator, (Map.Entry) obj, (Map.Entry) obj2);
                    }
                });
                Map.Entry<K, V> entry3 = entryArray[0];
                Objects.requireNonNull(entry3);
                Map.Entry<K, V> entry4 = entry3;
                Object key2 = entry4.getKey();
                objArr[0] = key2;
                V value2 = entry4.getValue();
                objArr2[0] = value2;
                x2.a(objArr[0], value2);
                int i12 = 1;
                while (i12 < size) {
                    Map.Entry<K, V> entry5 = entryArray[i12 - 1];
                    Objects.requireNonNull(entry5);
                    Map.Entry<K, V> entry6 = entry5;
                    Map.Entry<K, V> entry7 = entryArray[i12];
                    Objects.requireNonNull(entry7);
                    Map.Entry<K, V> entry8 = entry7;
                    Object key3 = entry8.getKey();
                    V value3 = entry8.getValue();
                    x2.a(key3, value3);
                    objArr[i12] = key3;
                    objArr2[i12] = value3;
                    ImmutableMap.checkNoConflict(comparator.compare(key2, key3) != 0, a.d.C0245a.f16161a, entry6, entry8);
                    i12++;
                    key2 = key3;
                }
            }
            return new ImmutableSortedMap<>(new i8(ImmutableList.asImmutableList(objArr), comparator), ImmutableList.asImmutableList(objArr2));
        }
        Map.Entry<K, V> entry9 = entryArray[0];
        Objects.requireNonNull(entry9);
        Map.Entry<K, V> entry10 = entry9;
        return of(comparator, entry10.getKey(), entry10.getValue());
    }

    @Override // java.util.NavigableMap
    public ImmutableSortedMap<K, V> headMap(K k11, boolean z11) {
        return getSubMap(0, this.keySet.b(Preconditions.checkNotNull(k11), z11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    public ImmutableSortedMap<K, V> subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive) {
        Preconditions.checkNotNull(fromKey);
        Preconditions.checkNotNull(toKey);
        Preconditions.checkArgument(comparator().compare(fromKey, toKey) <= 0, "expected fromKey <= toKey but %s > %s", fromKey, toKey);
        return headMap((ImmutableSortedMap<K, V>) toKey, toInclusive).tailMap((ImmutableSortedMap<K, V>) fromKey, fromInclusive);
    }

    @Override // java.util.NavigableMap
    public ImmutableSortedMap<K, V> tailMap(K k11, boolean z11) {
        return getSubMap(this.keySet.d(Preconditions.checkNotNull(k11), z11), size());
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries, Comparator<? super K> comparator) {
        return fromEntries((Comparator) Preconditions.checkNotNull(comparator), false, entries);
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap of(Comparable k12, Object v12, Comparable k22, Object v22) {
        return fromEntries(ImmutableMap.entryOf(k12, v12), ImmutableMap.entryOf(k22, v22));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap of(Comparable k12, Object v12, Comparable k22, Object v22, Comparable k32, Object v32) {
        return fromEntries(ImmutableMap.entryOf(k12, v12), ImmutableMap.entryOf(k22, v22), ImmutableMap.entryOf(k32, v32));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap of(Comparable k12, Object v12, Comparable k22, Object v22, Comparable k32, Object v32, Comparable k42, Object v42) {
        return fromEntries(ImmutableMap.entryOf(k12, v12), ImmutableMap.entryOf(k22, v22), ImmutableMap.entryOf(k32, v32), ImmutableMap.entryOf(k42, v42));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap of(Comparable k12, Object v12, Comparable k22, Object v22, Comparable k32, Object v32, Comparable k42, Object v42, Comparable k52, Object v52) {
        return fromEntries(ImmutableMap.entryOf(k12, v12), ImmutableMap.entryOf(k22, v22), ImmutableMap.entryOf(k32, v32), ImmutableMap.entryOf(k42, v42), ImmutableMap.entryOf(k52, v52));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap of(Comparable k12, Object v12, Comparable k22, Object v22, Comparable k32, Object v32, Comparable k42, Object v42, Comparable k52, Object v52, Comparable k62, Object v62) {
        return fromEntries(ImmutableMap.entryOf(k12, v12), ImmutableMap.entryOf(k22, v22), ImmutableMap.entryOf(k32, v32), ImmutableMap.entryOf(k42, v42), ImmutableMap.entryOf(k52, v52), ImmutableMap.entryOf(k62, v62));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap of(Comparable k12, Object v12, Comparable k22, Object v22, Comparable k32, Object v32, Comparable k42, Object v42, Comparable k52, Object v52, Comparable k62, Object v62, Comparable k72, Object v72) {
        return fromEntries(ImmutableMap.entryOf(k12, v12), ImmutableMap.entryOf(k22, v22), ImmutableMap.entryOf(k32, v32), ImmutableMap.entryOf(k42, v42), ImmutableMap.entryOf(k52, v52), ImmutableMap.entryOf(k62, v62), ImmutableMap.entryOf(k72, v72));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap of(Comparable k12, Object v12, Comparable k22, Object v22, Comparable k32, Object v32, Comparable k42, Object v42, Comparable k52, Object v52, Comparable k62, Object v62, Comparable k72, Object v72, Comparable k82, Object v82) {
        return fromEntries(ImmutableMap.entryOf(k12, v12), ImmutableMap.entryOf(k22, v22), ImmutableMap.entryOf(k32, v32), ImmutableMap.entryOf(k42, v42), ImmutableMap.entryOf(k52, v52), ImmutableMap.entryOf(k62, v62), ImmutableMap.entryOf(k72, v72), ImmutableMap.entryOf(k82, v82));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap of(Comparable k12, Object v12, Comparable k22, Object v22, Comparable k32, Object v32, Comparable k42, Object v42, Comparable k52, Object v52, Comparable k62, Object v62, Comparable k72, Object v72, Comparable k82, Object v82, Comparable k92, Object v92) {
        return fromEntries(ImmutableMap.entryOf(k12, v12), ImmutableMap.entryOf(k22, v22), ImmutableMap.entryOf(k32, v32), ImmutableMap.entryOf(k42, v42), ImmutableMap.entryOf(k52, v52), ImmutableMap.entryOf(k62, v62), ImmutableMap.entryOf(k72, v72), ImmutableMap.entryOf(k82, v82), ImmutableMap.entryOf(k92, v92));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap of(Comparable k12, Object v12, Comparable k22, Object v22, Comparable k32, Object v32, Comparable k42, Object v42, Comparable k52, Object v52, Comparable k62, Object v62, Comparable k72, Object v72, Comparable k82, Object v82, Comparable k92, Object v92, Comparable k102, Object v102) {
        return fromEntries(ImmutableMap.entryOf(k12, v12), ImmutableMap.entryOf(k22, v22), ImmutableMap.entryOf(k32, v32), ImmutableMap.entryOf(k42, v42), ImmutableMap.entryOf(k52, v52), ImmutableMap.entryOf(k62, v62), ImmutableMap.entryOf(k72, v72), ImmutableMap.entryOf(k82, v82), ImmutableMap.entryOf(k92, v92), ImmutableMap.entryOf(k102, v102));
    }

    @Deprecated
    @uo.e("Pass a key of type Comparable")
    public static <K, V> ImmutableSortedMap<K, V> of(K k12, V v12) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @uo.e("Pass keys of type Comparable")
    public static <K, V> ImmutableSortedMap<K, V> of(K k12, V v12, K k22, V v22) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @uo.e("Pass keys of type Comparable")
    public static <K, V> ImmutableSortedMap<K, V> of(K k12, V v12, K k22, V v22, K k32, V v32) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @uo.e("Pass keys of type Comparable")
    public static <K, V> ImmutableSortedMap<K, V> of(K k12, V v12, K k22, V v22, K k32, V v32, K k42, V v42) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @uo.e("Pass keys of type Comparable")
    public static <K, V> ImmutableSortedMap<K, V> of(K k12, V v12, K k22, V v22, K k32, V v32, K k42, V v42, K k52, V v52) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @uo.e("Pass keys of type Comparable")
    public static <K, V> ImmutableSortedMap<K, V> of(K k12, V v12, K k22, V v22, K k32, V v32, K k42, V v42, K k52, V v52, K k62, V v62) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @uo.e("Pass keys of type Comparable")
    public static <K, V> ImmutableSortedMap<K, V> of(K k12, V v12, K k22, V v22, K k32, V v32, K k42, V v42, K k52, V v52, K k62, V v62, K k72, V v72) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @uo.e("Pass keys of type Comparable")
    public static <K, V> ImmutableSortedMap<K, V> of(K k12, V v12, K k22, V v22, K k32, V v32, K k42, V v42, K k52, V v52, K k62, V v62, K k72, V v72, K k82, V v82) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @uo.e("Pass keys of type Comparable")
    public static <K, V> ImmutableSortedMap<K, V> of(K k12, V v12, K k22, V v22, K k32, V v32, K k42, V v42, K k52, V v52, K k62, V v62, K k72, V v72, K k82, V v82, K k92, V v92) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @uo.e("Pass keys of type Comparable")
    public static <K, V> ImmutableSortedMap<K, V> of(K k12, V v12, K k22, V v22, K k32, V v32, K k42, V v42, K k52, V v52, K k62, V v62, K k72, V v72, K k82, V v82, K k92, V v92, K k102, V v102) {
        throw new UnsupportedOperationException();
    }
}
