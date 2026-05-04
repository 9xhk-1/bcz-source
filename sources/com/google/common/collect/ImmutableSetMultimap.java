package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.o8;
import com.google.j2objc.annotations.RetainedWith;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Stream;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true, serializable = true)
/* loaded from: classes7.dex */
public class ImmutableSetMultimap<K, V> extends ImmutableMultimap<K, V> implements p8<K, V> {

    @go.d
    @go.c
    private static final long serialVersionUID = 0;
    private final transient ImmutableSet<V> emptySet;

    @RetainedWith
    @CheckForNull
    @vo.b
    private transient ImmutableSet<Map.Entry<K, V>> entries;

    @RetainedWith
    @CheckForNull
    @vo.b
    private transient ImmutableSetMultimap<V, K> inverse;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<K, V> extends ImmutableMultimap.c<K, V> {
        public a() {
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        public int d(int defaultExpectedValues, Iterable<?> values) {
            return values instanceof Set ? Math.max(defaultExpectedValues, ((Set) values).size()) : defaultExpectedValues;
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        public ImmutableCollection.b<V> f(int expectedSize) {
            Comparator<? super V> comparator = this.f33029c;
            return comparator == null ? ImmutableSet.builderWithExpectedSize(expectedSize) : new ImmutableSortedSet.a(comparator, expectedSize);
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public ImmutableSetMultimap<K, V> a() {
            Map<K, ImmutableCollection.b<V>> map = this.f33027a;
            if (map == null) {
                return ImmutableSetMultimap.of();
            }
            Collection entrySet = map.entrySet();
            Comparator<? super K> comparator = this.f33028b;
            if (comparator != null) {
                entrySet = s7.i(comparator).C().l(entrySet);
            }
            return ImmutableSetMultimap.fromMapBuilderEntries(entrySet, this.f33029c);
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        @uo.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public a<K, V> b(ImmutableMultimap.c<K, V> other) {
            super.b(other);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        @uo.a
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public a<K, V> e(int expectedValuesPerKey) {
            super.e(expectedValuesPerKey);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        @uo.a
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public a<K, V> g(Comparator<? super K> keyComparator) {
            super.g(keyComparator);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        @uo.a
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public a<K, V> h(Comparator<? super V> valueComparator) {
            super.h(valueComparator);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        @uo.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public a<K, V> i(K key, V value) {
            super.i(key, value);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        @uo.a
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public a<K, V> j(Map.Entry<? extends K, ? extends V> entry) {
            super.j(entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        @uo.a
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public a<K, V> k(d7<? extends K, ? extends V> multimap) {
            for (Map.Entry<? extends K, Collection<? extends V>> entry : multimap.asMap().entrySet()) {
                m(entry.getKey(), entry.getValue());
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        @uo.a
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public a<K, V> l(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
            super.l(entries);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        @uo.a
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public a<K, V> m(K key, Iterable<? extends V> values) {
            super.m(key, values);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        @uo.a
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public a<K, V> n(K key, V... values) {
            return m(key, Arrays.asList(values));
        }

        public a(int expectedKeys) {
            super(expectedKeys);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<K, V> extends ImmutableSet<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        @Weak
        public final transient ImmutableSetMultimap<K, V> f33079a;

        public b(ImmutableSetMultimap<K, V> multimap) {
            this.f33079a = multimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object object) {
            if (!(object instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) object;
            return this.f33079a.containsEntry(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f33079a.size();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @go.d
        @go.c
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public aa<Map.Entry<K, V>> iterator() {
            return this.f33079a.entryIterator();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.d
    @go.c
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final o8.b<? super ImmutableSetMultimap<?, ?>> f33080a = o8.a(ImmutableSetMultimap.class, "emptySet");
    }

    public ImmutableSetMultimap(ImmutableMap<K, ImmutableSet<V>> map, int size, @CheckForNull Comparator<? super V> valueComparator) {
        super(map, size);
        this.emptySet = emptySet(valueComparator);
    }

    public static <K, V> a<K, V> builder() {
        return new a<>();
    }

    public static <K, V> a<K, V> builderWithExpectedKeys(int expectedKeys) {
        x2.b(expectedKeys, "expectedKeys");
        return new a<>(expectedKeys);
    }

    public static <K, V> ImmutableSetMultimap<K, V> copyOf(d7<? extends K, ? extends V> multimap) {
        return copyOf(multimap, null);
    }

    private static <V> ImmutableSet<V> emptySet(@CheckForNull Comparator<? super V> valueComparator) {
        return valueComparator == null ? ImmutableSet.of() : ImmutableSortedSet.emptySet(valueComparator);
    }

    @p5
    public static <T, K, V> Collector<T, ?, ImmutableSetMultimap<K, V>> flatteningToImmutableSetMultimap(Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends Stream<? extends V>> valuesFunction) {
        return v2.E(keyFunction, valuesFunction);
    }

    public static <K, V> ImmutableSetMultimap<K, V> fromMapBuilderEntries(Collection<? extends Map.Entry<K, ImmutableCollection.b<V>>> mapEntries, @CheckForNull Comparator<? super V> valueComparator) {
        if (mapEntries.isEmpty()) {
            return of();
        }
        ImmutableMap.b bVar = new ImmutableMap.b(mapEntries.size());
        int i11 = 0;
        for (Map.Entry<K, ImmutableCollection.b<V>> entry : mapEntries) {
            K key = entry.getKey();
            ImmutableSet valueSet = valueSet(valueComparator, ((ImmutableSet.a) entry.getValue()).e());
            if (!valueSet.isEmpty()) {
                bVar.i(key, valueSet);
                i11 += valueSet.size();
            }
        }
        return new ImmutableSetMultimap<>(bVar.d(), i11, valueComparator);
    }

    public static <K, V> ImmutableSetMultimap<K, V> fromMapEntries(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> mapEntries, @CheckForNull Comparator<? super V> valueComparator) {
        if (mapEntries.isEmpty()) {
            return of();
        }
        ImmutableMap.b bVar = new ImmutableMap.b(mapEntries.size());
        int i11 = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : mapEntries) {
            K key = entry.getKey();
            ImmutableSet valueSet = valueSet(valueComparator, entry.getValue());
            if (!valueSet.isEmpty()) {
                bVar.i(key, valueSet);
                i11 += valueSet.size();
            }
        }
        return new ImmutableSetMultimap<>(bVar.d(), i11, valueComparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ImmutableSetMultimap<V, K> invert() {
        a builder = builder();
        aa it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            builder.i(entry.getValue(), entry.getKey());
        }
        ImmutableSetMultimap<V, K> a11 = builder.a();
        a11.inverse = this;
        return a11;
    }

    public static <K, V> ImmutableSetMultimap<K, V> of() {
        return x3.f34087a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @go.d
    @go.c
    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        Comparator comparator = (Comparator) stream.readObject();
        int readInt = stream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Invalid key count " + readInt);
        }
        ImmutableMap.b builder = ImmutableMap.builder();
        int i11 = 0;
        for (int i12 = 0; i12 < readInt; i12++) {
            Object readObject = stream.readObject();
            Objects.requireNonNull(readObject);
            int readInt2 = stream.readInt();
            if (readInt2 <= 0) {
                throw new InvalidObjectException("Invalid value count " + readInt2);
            }
            ImmutableSet.a valuesBuilder = valuesBuilder(comparator);
            for (int i13 = 0; i13 < readInt2; i13++) {
                Object readObject2 = stream.readObject();
                Objects.requireNonNull(readObject2);
                valuesBuilder.a(readObject2);
            }
            ImmutableSet e11 = valuesBuilder.e();
            if (e11.size() != readInt2) {
                throw new InvalidObjectException("Duplicate key-value pairs exist for key " + readObject);
            }
            builder.i(readObject, e11);
            i11 += readInt2;
        }
        try {
            ImmutableMultimap.e.f33032a.b(this, builder.d());
            ImmutableMultimap.e.f33033b.a(this, i11);
            c.f33080a.b(this, emptySet(comparator));
        } catch (IllegalArgumentException e12) {
            throw ((InvalidObjectException) new InvalidObjectException(e12.getMessage()).initCause(e12));
        }
    }

    @p5
    public static <T, K, V> Collector<T, ?, ImmutableSetMultimap<K, V>> toImmutableSetMultimap(Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends V> valueFunction) {
        return v2.T(keyFunction, valueFunction);
    }

    private static <V> ImmutableSet<V> valueSet(@CheckForNull Comparator<? super V> valueComparator, Collection<? extends V> values) {
        return valueComparator == null ? ImmutableSet.copyOf((Collection) values) : ImmutableSortedSet.copyOf((Comparator) valueComparator, (Collection) values);
    }

    private static <V> ImmutableSet.a<V> valuesBuilder(@CheckForNull Comparator<? super V> valueComparator) {
        return valueComparator == null ? new ImmutableSet.a<>() : new ImmutableSortedSet.a(valueComparator);
    }

    @go.d
    @go.c
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeObject(valueComparator());
        o8.j(this, stream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.d7, com.google.common.collect.p6
    public /* bridge */ /* synthetic */ ImmutableCollection get(Object key) {
        return get((ImmutableSetMultimap<K, V>) key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    @Deprecated
    @uo.a
    @uo.e("Always throws UnsupportedOperationException")
    public /* bridge */ /* synthetic */ ImmutableCollection replaceValues(Object key, Iterable values) {
        return replaceValues((ImmutableSetMultimap<K, V>) key, values);
    }

    @CheckForNull
    public Comparator<? super V> valueComparator() {
        ImmutableSet<V> immutableSet = this.emptySet;
        if (immutableSet instanceof ImmutableSortedSet) {
            return ((ImmutableSortedSet) immutableSet).comparator();
        }
        return null;
    }

    private static <K, V> ImmutableSetMultimap<K, V> copyOf(d7<? extends K, ? extends V> multimap, @CheckForNull Comparator<? super V> valueComparator) {
        Preconditions.checkNotNull(multimap);
        if (multimap.isEmpty() && valueComparator == null) {
            return of();
        }
        if (multimap instanceof ImmutableSetMultimap) {
            ImmutableSetMultimap<K, V> immutableSetMultimap = (ImmutableSetMultimap) multimap;
            if (!immutableSetMultimap.isPartialView()) {
                return immutableSetMultimap;
            }
        }
        return fromMapEntries(multimap.asMap().entrySet(), valueComparator);
    }

    public static <K, V> ImmutableSetMultimap<K, V> of(K k12, V v12) {
        a builder = builder();
        builder.i(k12, v12);
        return builder.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.d7, com.google.common.collect.p6
    public /* bridge */ /* synthetic */ Collection get(Object key) {
        return get((ImmutableSetMultimap<K, V>) key);
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public ImmutableSetMultimap<V, K> inverse() {
        ImmutableSetMultimap<V, K> immutableSetMultimap = this.inverse;
        if (immutableSetMultimap != null) {
            return immutableSetMultimap;
        }
        ImmutableSetMultimap<V, K> invert = invert();
        this.inverse = invert;
        return invert;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    @Deprecated
    @uo.a
    @uo.e("Always throws UnsupportedOperationException")
    public /* bridge */ /* synthetic */ Collection replaceValues(Object key, Iterable values) {
        return replaceValues((ImmutableSetMultimap<K, V>) key, values);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.d7, com.google.common.collect.p6
    public /* bridge */ /* synthetic */ Set get(Object key) {
        return get((ImmutableSetMultimap<K, V>) key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    @Deprecated
    @uo.a
    @uo.e("Always throws UnsupportedOperationException")
    public /* bridge */ /* synthetic */ Set replaceValues(Object key, Iterable values) {
        return replaceValues((ImmutableSetMultimap<K, V>) key, values);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.h, com.google.common.collect.d7
    public ImmutableSet<Map.Entry<K, V>> entries() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.entries;
        if (immutableSet != null) {
            return immutableSet;
        }
        b bVar = new b(this);
        this.entries = bVar;
        return bVar;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.d7, com.google.common.collect.p6
    public ImmutableSet<V> get(K key) {
        return (ImmutableSet) ho.b0.a((ImmutableSet) this.map.get(key), this.emptySet);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.d7, com.google.common.collect.p6
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    @uo.a
    public final ImmutableSet<V> removeAll(@CheckForNull Object key) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    @uo.a
    public final ImmutableSet<V> replaceValues(K key, Iterable<? extends V> values) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> ImmutableSetMultimap<K, V> of(K k12, V v12, K k22, V v22) {
        a builder = builder();
        builder.i(k12, v12);
        builder.i(k22, v22);
        return builder.a();
    }

    public static <K, V> ImmutableSetMultimap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
        return new a().l(entries).a();
    }

    public static <K, V> ImmutableSetMultimap<K, V> of(K k12, V v12, K k22, V v22, K k32, V v32) {
        a builder = builder();
        builder.i(k12, v12);
        builder.i(k22, v22);
        builder.i(k32, v32);
        return builder.a();
    }

    public static <K, V> ImmutableSetMultimap<K, V> of(K k12, V v12, K k22, V v22, K k32, V v32, K k42, V v42) {
        a builder = builder();
        builder.i(k12, v12);
        builder.i(k22, v22);
        builder.i(k32, v32);
        builder.i(k42, v42);
        return builder.a();
    }

    public static <K, V> ImmutableSetMultimap<K, V> of(K k12, V v12, K k22, V v22, K k32, V v32, K k42, V v42, K k52, V v52) {
        a builder = builder();
        builder.i(k12, v12);
        builder.i(k22, v22);
        builder.i(k32, v32);
        builder.i(k42, v42);
        builder.i(k52, v52);
        return builder.a();
    }
}
