package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.j2objc.annotations.RetainedWith;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.b(emulated = true, serializable = true)
@uo.f("Use ImmutableMap.of or another implementation")
@u3
/* loaded from: classes7.dex */
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {
    static final Map.Entry<?, ?>[] EMPTY_ENTRY_ARRAY = new Map.Entry[0];
    private static final long serialVersionUID = 912559;

    @RetainedWith
    @CheckForNull
    @vo.b
    private transient ImmutableSet<Map.Entry<K, V>> entrySet;

    @RetainedWith
    @CheckForNull
    @vo.b
    private transient ImmutableSet<K> keySet;

    @CheckForNull
    @vo.b
    private transient ImmutableSetMultimap<K, V> multimapView;

    @RetainedWith
    @CheckForNull
    @vo.b
    private transient ImmutableCollection<V> values;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends aa<K> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ aa f33001a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ImmutableMap f33002b;

        public a(final ImmutableMap this$0, final aa val$entryIterator) {
            this.f33001a = val$entryIterator;
            this.f33002b = this$0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33001a.hasNext();
        }

        @Override // java.util.Iterator
        public K next() {
            return (K) ((Map.Entry) this.f33001a.next()).getKey();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @uo.f
    public static class b<K, V> {

        /* renamed from: a, reason: collision with root package name */
        @CheckForNull
        public Comparator<? super V> f33003a;

        /* renamed from: b, reason: collision with root package name */
        public Object[] f33004b;

        /* renamed from: c, reason: collision with root package name */
        public int f33005c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f33006d;

        /* renamed from: e, reason: collision with root package name */
        public a f33007e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public final Object f33008a;

            /* renamed from: b, reason: collision with root package name */
            public final Object f33009b;

            /* renamed from: c, reason: collision with root package name */
            public final Object f33010c;

            public a(Object key, Object value1, Object value2) {
                this.f33008a = key;
                this.f33009b = value1;
                this.f33010c = value2;
            }

            public IllegalArgumentException a() {
                return new IllegalArgumentException("Multiple entries with same key: " + this.f33008a + ContainerUtils.KEY_VALUE_DELIMITER + this.f33009b + " and " + this.f33008a + ContainerUtils.KEY_VALUE_DELIMITER + this.f33010c);
            }
        }

        public b() {
            this(4);
        }

        private void f(int minCapacity) {
            int i11 = minCapacity * 2;
            Object[] objArr = this.f33004b;
            if (i11 > objArr.length) {
                this.f33004b = Arrays.copyOf(objArr, ImmutableCollection.b.f(objArr.length, i11));
                this.f33006d = false;
            }
        }

        public static <V> void m(Object[] alternatingKeysAndValues, int size, Comparator<? super V> valueComparator) {
            Map.Entry[] entryArr = new Map.Entry[size];
            for (int i11 = 0; i11 < size; i11++) {
                int i12 = i11 * 2;
                Object obj = alternatingKeysAndValues[i12];
                Objects.requireNonNull(obj);
                Object obj2 = alternatingKeysAndValues[i12 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i11] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, size, s7.i(valueComparator).D(u6.Q0()));
            for (int i13 = 0; i13 < size; i13++) {
                int i14 = i13 * 2;
                alternatingKeysAndValues[i14] = entryArr[i13].getKey();
                alternatingKeysAndValues[i14 + 1] = entryArr[i13].getValue();
            }
        }

        public ImmutableMap<K, V> a() {
            return d();
        }

        public final ImmutableMap<K, V> b(boolean throwIfDuplicateKeys) {
            Object[] objArr;
            a aVar;
            a aVar2;
            if (throwIfDuplicateKeys && (aVar2 = this.f33007e) != null) {
                throw aVar2.a();
            }
            int i11 = this.f33005c;
            if (this.f33003a == null) {
                objArr = this.f33004b;
            } else {
                if (this.f33006d) {
                    this.f33004b = Arrays.copyOf(this.f33004b, i11 * 2);
                }
                objArr = this.f33004b;
                if (!throwIfDuplicateKeys) {
                    objArr = g(objArr, this.f33005c);
                    if (objArr.length < this.f33004b.length) {
                        i11 = objArr.length >>> 1;
                    }
                }
                m(objArr, i11, this.f33003a);
            }
            this.f33006d = true;
            e8 d11 = e8.d(i11, objArr, this);
            if (!throwIfDuplicateKeys || (aVar = this.f33007e) == null) {
                return d11;
            }
            throw aVar.a();
        }

        public ImmutableMap<K, V> c() {
            return b(false);
        }

        public ImmutableMap<K, V> d() {
            return b(true);
        }

        @uo.a
        public b<K, V> e(b<K, V> other) {
            Preconditions.checkNotNull(other);
            f(this.f33005c + other.f33005c);
            System.arraycopy(other.f33004b, 0, this.f33004b, this.f33005c * 2, other.f33005c * 2);
            this.f33005c += other.f33005c;
            return this;
        }

        public final Object[] g(Object[] localAlternatingKeysAndValues, int size) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i11 = size - 1; i11 >= 0; i11--) {
                Object obj = localAlternatingKeysAndValues[i11 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i11);
                }
            }
            if (bitSet.isEmpty()) {
                return localAlternatingKeysAndValues;
            }
            Object[] objArr = new Object[(size - bitSet.cardinality()) * 2];
            int i12 = 0;
            int i13 = 0;
            while (i12 < size * 2) {
                if (bitSet.get(i12 >>> 1)) {
                    i12 += 2;
                } else {
                    int i14 = i13 + 1;
                    int i15 = i12 + 1;
                    Object obj2 = localAlternatingKeysAndValues[i12];
                    Objects.requireNonNull(obj2);
                    objArr[i13] = obj2;
                    i13 += 2;
                    i12 += 2;
                    Object obj3 = localAlternatingKeysAndValues[i15];
                    Objects.requireNonNull(obj3);
                    objArr[i14] = obj3;
                }
            }
            return objArr;
        }

        @uo.a
        public b<K, V> h(Comparator<? super V> valueComparator) {
            Preconditions.checkState(this.f33003a == null, "valueComparator was already set");
            this.f33003a = (Comparator) Preconditions.checkNotNull(valueComparator, "valueComparator");
            return this;
        }

        @uo.a
        public b<K, V> i(K key, V value) {
            f(this.f33005c + 1);
            x2.a(key, value);
            Object[] objArr = this.f33004b;
            int i11 = this.f33005c;
            objArr[i11 * 2] = key;
            objArr[(i11 * 2) + 1] = value;
            this.f33005c = i11 + 1;
            return this;
        }

        @uo.a
        public b<K, V> j(Map.Entry<? extends K, ? extends V> entry) {
            return i(entry.getKey(), entry.getValue());
        }

        @uo.a
        public b<K, V> k(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
            if (entries instanceof Collection) {
                f(this.f33005c + ((Collection) entries).size());
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = entries.iterator();
            while (it.hasNext()) {
                j(it.next());
            }
            return this;
        }

        @uo.a
        public b<K, V> l(Map<? extends K, ? extends V> map) {
            return k(map.entrySet());
        }

        public b(int initialCapacity) {
            this.f33004b = new Object[initialCapacity * 2];
            this.f33005c = 0;
            this.f33006d = false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class c<K, V> extends ImmutableMap<K, V> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends u5<K, V> {
            public a() {
            }

            @Override // com.google.common.collect.u5
            public ImmutableMap<K, V> a() {
                return c.this;
            }

            @Override // com.google.common.collect.u5, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
            @go.d
            @go.c
            public Object writeReplace() {
                return super.writeReplace();
            }

            @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            public aa<Map.Entry<K, V>> iterator() {
                return c.this.b();
            }
        }

        public abstract aa<Map.Entry<K, V>> b();

        @Override // com.google.common.collect.ImmutableMap
        public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
            return new a();
        }

        @Override // com.google.common.collect.ImmutableMap
        public ImmutableSet<K> createKeySet() {
            return new v5(this);
        }

        @Override // com.google.common.collect.ImmutableMap
        public ImmutableCollection<V> createValues() {
            return new w5(this);
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Set entrySet() {
            return super.entrySet();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Set keySet() {
            return super.keySet();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.u
        public /* bridge */ /* synthetic */ Collection values() {
            return super.values();
        }

        @Override // com.google.common.collect.ImmutableMap
        @go.d
        @go.c
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class d extends c<K, ImmutableSet<V>> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends aa<Map.Entry<K, ImmutableSet<V>>> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Iterator f33013a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f33014b;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: com.google.common.collect.ImmutableMap$d$a$a, reason: collision with other inner class name */
            public class C0387a extends g<K, ImmutableSet<V>> {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Map.Entry f33015a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f33016b;

                public C0387a(final a this$2, final Map.Entry val$backingEntry) {
                    this.f33015a = val$backingEntry;
                    this.f33016b = this$2;
                }

                @Override // com.google.common.collect.g, java.util.Map.Entry
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public ImmutableSet<V> getValue() {
                    return ImmutableSet.of(this.f33015a.getValue());
                }

                @Override // com.google.common.collect.g, java.util.Map.Entry
                public K getKey() {
                    return (K) this.f33015a.getKey();
                }
            }

            public a(final d this$1, final Iterator val$backingIterator) {
                this.f33013a = val$backingIterator;
                this.f33014b = this$1;
            }

            @Override // java.util.Iterator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, ImmutableSet<V>> next() {
                return new C0387a(this, (Map.Entry) this.f33013a.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f33013a.hasNext();
            }
        }

        public d() {
        }

        @Override // com.google.common.collect.ImmutableMap.c
        public aa<Map.Entry<K, ImmutableSet<V>>> b() {
            return new a(this, ImmutableMap.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public boolean containsKey(@CheckForNull Object key) {
            return ImmutableMap.this.containsKey(key);
        }

        @Override // com.google.common.collect.ImmutableMap.c, com.google.common.collect.ImmutableMap
        public ImmutableSet<K> createKeySet() {
            return ImmutableMap.this.keySet();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        @CheckForNull
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public ImmutableSet<V> get(@CheckForNull Object key) {
            Object obj = ImmutableMap.this.get(key);
            if (obj == null) {
                return null;
            }
            return ImmutableSet.of(obj);
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public int hashCode() {
            return ImmutableMap.this.hashCode();
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean isHashCodeFast() {
            return ImmutableMap.this.isHashCodeFast();
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean isPartialView() {
            return ImmutableMap.this.isPartialView();
        }

        @Override // java.util.Map
        public int size() {
            return ImmutableMap.this.size();
        }

        @Override // com.google.common.collect.ImmutableMap.c, com.google.common.collect.ImmutableMap
        @go.d
        @go.c
        public Object writeReplace() {
            return super.writeReplace();
        }

        public /* synthetic */ d(ImmutableMap immutableMap, a aVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.d
    public static class e<K, V> implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        public static final boolean f33017c = true;
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Object f33018a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f33019b;

        public e(ImmutableMap<K, V> map) {
            Object[] objArr = new Object[map.size()];
            Object[] objArr2 = new Object[map.size()];
            aa<Map.Entry<K, V>> it = map.entrySet().iterator();
            int i11 = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i11] = next.getKey();
                objArr2[i11] = next.getValue();
                i11++;
            }
            this.f33018a = objArr;
            this.f33019b = objArr2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object a() {
            Object[] objArr = (Object[]) this.f33018a;
            Object[] objArr2 = (Object[]) this.f33019b;
            b<K, V> b11 = b(objArr.length);
            for (int i11 = 0; i11 < objArr.length; i11++) {
                b11.i(objArr[i11], objArr2[i11]);
            }
            return b11.d();
        }

        public b<K, V> b(int size) {
            return new b<>(size);
        }

        public final Object readResolve() {
            Object obj = this.f33018a;
            if (!(obj instanceof ImmutableSet)) {
                return a();
            }
            ImmutableSet immutableSet = (ImmutableSet) obj;
            ImmutableCollection immutableCollection = (ImmutableCollection) this.f33019b;
            b<K, V> b11 = b(immutableSet.size());
            aa it = immutableSet.iterator();
            aa it2 = immutableCollection.iterator();
            while (it.hasNext()) {
                b11.i(it.next(), it2.next());
            }
            return b11.d();
        }
    }

    public static <K, V> b<K, V> builder() {
        return new b<>();
    }

    public static <K, V> b<K, V> builderWithExpectedSize(int expectedSize) {
        x2.b(expectedSize, "expectedSize");
        return new b<>(expectedSize);
    }

    public static void checkNoConflict(boolean safe, String conflictDescription, Object entry1, Object entry2) {
        if (!safe) {
            throw conflictException(conflictDescription, entry1, entry2);
        }
    }

    public static IllegalArgumentException conflictException(String conflictDescription, Object entry1, Object entry2) {
        return new IllegalArgumentException("Multiple entries with same " + conflictDescription + ": " + entry1 + " and " + entry2);
    }

    public static <K, V> ImmutableMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap<K, V> immutableMap = (ImmutableMap) map;
            if (!immutableMap.isPartialView()) {
                return immutableMap;
            }
        }
        return copyOf(map.entrySet());
    }

    public static <K, V> Map.Entry<K, V> entryOf(K key, V value) {
        x2.a(key, value);
        return new AbstractMap.SimpleImmutableEntry(key, value);
    }

    public static <K, V> ImmutableMap<K, V> of() {
        return (ImmutableMap<K, V>) e8.f33433i;
    }

    @SafeVarargs
    public static <K, V> ImmutableMap<K, V> ofEntries(Map.Entry<? extends K, ? extends V>... entries) {
        return copyOf(Arrays.asList(entries));
    }

    @go.d
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @p5
    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends V> valueFunction) {
        return v2.N(keyFunction, valueFunction);
    }

    public ImmutableSetMultimap<K, V> asMultimap() {
        if (isEmpty()) {
            return ImmutableSetMultimap.of();
        }
        ImmutableSetMultimap<K, V> immutableSetMultimap = this.multimapView;
        if (immutableSetMultimap != null) {
            return immutableSetMultimap;
        }
        ImmutableSetMultimap<K, V> immutableSetMultimap2 = new ImmutableSetMultimap<>(new d(this, null), size(), null);
        this.multimapView = immutableSetMultimap2;
        return immutableSetMultimap2;
    }

    @Override // java.util.Map
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(@CheckForNull Object key) {
        return get(key) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(@CheckForNull Object value) {
        return values().contains(value);
    }

    public abstract ImmutableSet<Map.Entry<K, V>> createEntrySet();

    public abstract ImmutableSet<K> createKeySet();

    public abstract ImmutableCollection<V> createValues();

    @Override // java.util.Map
    public boolean equals(@CheckForNull Object object) {
        return u6.w(this, object);
    }

    @Override // java.util.Map
    @CheckForNull
    public abstract V get(@CheckForNull Object key);

    @Override // java.util.Map
    @CheckForNull
    public final V getOrDefault(@CheckForNull Object key, @CheckForNull V defaultValue) {
        V v11 = get(key);
        return v11 != null ? v11 : defaultValue;
    }

    @Override // java.util.Map
    public int hashCode() {
        return q8.k(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isHashCodeFast() {
        return false;
    }

    public abstract boolean isPartialView();

    public aa<K> keyIterator() {
        return new a(this, entrySet().iterator());
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    @uo.a
    public final V put(K k11, V v11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    @uo.a
    public final V remove(@CheckForNull Object o11) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return u6.y0(this);
    }

    @go.d
    public Object writeReplace() {
        return new e(this);
    }

    public static <K, V> ImmutableMap<K, V> of(K k12, V v12) {
        x2.a(k12, v12);
        return e8.b(1, new Object[]{k12, v12});
    }

    @p5
    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends V> valueFunction, BinaryOperator<V> mergeFunction) {
        return v2.O(keyFunction, valueFunction, mergeFunction);
    }

    @Override // java.util.Map
    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.entrySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Map.Entry<K, V>> createEntrySet = createEntrySet();
        this.entrySet = createEntrySet;
        return createEntrySet;
    }

    @Override // java.util.Map
    public ImmutableSet<K> keySet() {
        ImmutableSet<K> immutableSet = this.keySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<K> createKeySet = createKeySet();
        this.keySet = createKeySet;
        return createKeySet;
    }

    @Override // java.util.Map, com.google.common.collect.u
    public ImmutableCollection<V> values() {
        ImmutableCollection<V> immutableCollection = this.values;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection<V> createValues = createValues();
        this.values = createValues;
        return createValues;
    }

    public static <K, V> ImmutableMap<K, V> of(K k12, V v12, K k22, V v22) {
        x2.a(k12, v12);
        x2.a(k22, v22);
        return e8.b(2, new Object[]{k12, v12, k22, v22});
    }

    public static <K, V> ImmutableMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
        b bVar = new b(entries instanceof Collection ? ((Collection) entries).size() : 4);
        bVar.k(entries);
        return bVar.a();
    }

    public static <K, V> ImmutableMap<K, V> of(K k12, V v12, K k22, V v22, K k32, V v32) {
        x2.a(k12, v12);
        x2.a(k22, v22);
        x2.a(k32, v32);
        return e8.b(3, new Object[]{k12, v12, k22, v22, k32, v32});
    }

    public static <K, V> ImmutableMap<K, V> of(K k12, V v12, K k22, V v22, K k32, V v32, K k42, V v42) {
        x2.a(k12, v12);
        x2.a(k22, v22);
        x2.a(k32, v32);
        x2.a(k42, v42);
        return e8.b(4, new Object[]{k12, v12, k22, v22, k32, v32, k42, v42});
    }

    public static <K, V> ImmutableMap<K, V> of(K k12, V v12, K k22, V v22, K k32, V v32, K k42, V v42, K k52, V v52) {
        x2.a(k12, v12);
        x2.a(k22, v22);
        x2.a(k32, v32);
        x2.a(k42, v42);
        x2.a(k52, v52);
        return e8.b(5, new Object[]{k12, v12, k22, v22, k32, v32, k42, v42, k52, v52});
    }

    public static <K, V> ImmutableMap<K, V> of(K k12, V v12, K k22, V v22, K k32, V v32, K k42, V v42, K k52, V v52, K k62, V v62) {
        x2.a(k12, v12);
        x2.a(k22, v22);
        x2.a(k32, v32);
        x2.a(k42, v42);
        x2.a(k52, v52);
        x2.a(k62, v62);
        return e8.b(6, new Object[]{k12, v12, k22, v22, k32, v32, k42, v42, k52, v52, k62, v62});
    }

    public static <K, V> ImmutableMap<K, V> of(K k12, V v12, K k22, V v22, K k32, V v32, K k42, V v42, K k52, V v52, K k62, V v62, K k72, V v72) {
        x2.a(k12, v12);
        x2.a(k22, v22);
        x2.a(k32, v32);
        x2.a(k42, v42);
        x2.a(k52, v52);
        x2.a(k62, v62);
        x2.a(k72, v72);
        return e8.b(7, new Object[]{k12, v12, k22, v22, k32, v32, k42, v42, k52, v52, k62, v62, k72, v72});
    }

    public static <K, V> ImmutableMap<K, V> of(K k12, V v12, K k22, V v22, K k32, V v32, K k42, V v42, K k52, V v52, K k62, V v62, K k72, V v72, K k82, V v82) {
        x2.a(k12, v12);
        x2.a(k22, v22);
        x2.a(k32, v32);
        x2.a(k42, v42);
        x2.a(k52, v52);
        x2.a(k62, v62);
        x2.a(k72, v72);
        x2.a(k82, v82);
        return e8.b(8, new Object[]{k12, v12, k22, v22, k32, v32, k42, v42, k52, v52, k62, v62, k72, v72, k82, v82});
    }

    public static <K, V> ImmutableMap<K, V> of(K k12, V v12, K k22, V v22, K k32, V v32, K k42, V v42, K k52, V v52, K k62, V v62, K k72, V v72, K k82, V v82, K k92, V v92) {
        x2.a(k12, v12);
        x2.a(k22, v22);
        x2.a(k32, v32);
        x2.a(k42, v42);
        x2.a(k52, v52);
        x2.a(k62, v62);
        x2.a(k72, v72);
        x2.a(k82, v82);
        x2.a(k92, v92);
        return e8.b(9, new Object[]{k12, v12, k22, v22, k32, v32, k42, v42, k52, v52, k62, v62, k72, v72, k82, v82, k92, v92});
    }

    public static <K, V> ImmutableMap<K, V> of(K k12, V v12, K k22, V v22, K k32, V v32, K k42, V v42, K k52, V v52, K k62, V v62, K k72, V v72, K k82, V v82, K k92, V v92, K k102, V v102) {
        x2.a(k12, v12);
        x2.a(k22, v22);
        x2.a(k32, v32);
        x2.a(k42, v42);
        x2.a(k52, v52);
        x2.a(k62, v62);
        x2.a(k72, v72);
        x2.a(k82, v82);
        x2.a(k92, v92);
        x2.a(k102, v102);
        return e8.b(10, new Object[]{k12, v12, k22, v22, k32, v32, k42, v42, k52, v52, k62, v62, k72, v72, k82, v82, k92, v92, k102, v102});
    }
}
