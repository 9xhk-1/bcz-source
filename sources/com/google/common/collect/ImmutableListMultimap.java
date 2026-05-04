package com.google.common.collect;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Stream;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true, serializable = true)
/* loaded from: classes7.dex */
public class ImmutableListMultimap<K, V> extends ImmutableMultimap<K, V> implements p6<K, V> {

    @go.d
    @go.c
    private static final long serialVersionUID = 0;

    @RetainedWith
    @CheckForNull
    @vo.b
    private transient ImmutableListMultimap<V, K> inverse;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<K, V> extends ImmutableMultimap.c<K, V> {
        public a() {
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public ImmutableListMultimap<K, V> a() {
            return (ImmutableListMultimap) super.a();
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
            super.k(multimap);
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
            super.n(key, values);
            return this;
        }

        public a(int expectedKeys) {
            super(expectedKeys);
        }
    }

    public ImmutableListMultimap(ImmutableMap<K, ImmutableList<V>> map, int size) {
        super(map, size);
    }

    public static <K, V> a<K, V> builder() {
        return new a<>();
    }

    public static <K, V> a<K, V> builderWithExpectedKeys(int expectedKeys) {
        x2.b(expectedKeys, "expectedKeys");
        return new a<>(expectedKeys);
    }

    public static <K, V> ImmutableListMultimap<K, V> copyOf(d7<? extends K, ? extends V> multimap) {
        if (multimap.isEmpty()) {
            return of();
        }
        if (multimap instanceof ImmutableListMultimap) {
            ImmutableListMultimap<K, V> immutableListMultimap = (ImmutableListMultimap) multimap;
            if (!immutableListMultimap.isPartialView()) {
                return immutableListMultimap;
            }
        }
        return fromMapEntries(multimap.asMap().entrySet(), null);
    }

    @p5
    public static <T, K, V> Collector<T, ?, ImmutableListMultimap<K, V>> flatteningToImmutableListMultimap(Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends Stream<? extends V>> valuesFunction) {
        return v2.D(keyFunction, valuesFunction);
    }

    public static <K, V> ImmutableListMultimap<K, V> fromMapBuilderEntries(Collection<? extends Map.Entry<K, ImmutableCollection.b<V>>> mapEntries, @CheckForNull Comparator<? super V> valueComparator) {
        if (mapEntries.isEmpty()) {
            return of();
        }
        ImmutableMap.b bVar = new ImmutableMap.b(mapEntries.size());
        int i11 = 0;
        for (Map.Entry<K, ImmutableCollection.b<V>> entry : mapEntries) {
            K key = entry.getKey();
            ImmutableList.a aVar = (ImmutableList.a) entry.getValue();
            ImmutableList e11 = valueComparator == null ? aVar.e() : aVar.o(valueComparator);
            bVar.i(key, e11);
            i11 += e11.size();
        }
        return new ImmutableListMultimap<>(bVar.d(), i11);
    }

    public static <K, V> ImmutableListMultimap<K, V> fromMapEntries(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> mapEntries, @CheckForNull Comparator<? super V> valueComparator) {
        if (mapEntries.isEmpty()) {
            return of();
        }
        ImmutableMap.b bVar = new ImmutableMap.b(mapEntries.size());
        int i11 = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : mapEntries) {
            K key = entry.getKey();
            Collection<? extends V> value = entry.getValue();
            ImmutableList copyOf = valueComparator == null ? ImmutableList.copyOf((Collection) value) : ImmutableList.sortedCopyOf(valueComparator, value);
            if (!copyOf.isEmpty()) {
                bVar.i(key, copyOf);
                i11 += copyOf.size();
            }
        }
        return new ImmutableListMultimap<>(bVar.d(), i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ImmutableListMultimap<V, K> invert() {
        a builder = builder();
        aa it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            builder.i(entry.getValue(), entry.getKey());
        }
        ImmutableListMultimap<V, K> a11 = builder.a();
        a11.inverse = this;
        return a11;
    }

    public static <K, V> ImmutableListMultimap<K, V> of() {
        return w3.f34076a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @go.d
    @go.c
    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
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
            ImmutableList.a builder2 = ImmutableList.builder();
            for (int i13 = 0; i13 < readInt2; i13++) {
                Object readObject2 = stream.readObject();
                Objects.requireNonNull(readObject2);
                builder2.g(readObject2);
            }
            builder.i(readObject, builder2.e());
            i11 += readInt2;
        }
        try {
            ImmutableMultimap.e.f33032a.b(this, builder.d());
            ImmutableMultimap.e.f33033b.a(this, i11);
        } catch (IllegalArgumentException e11) {
            throw ((InvalidObjectException) new InvalidObjectException(e11.getMessage()).initCause(e11));
        }
    }

    @p5
    public static <T, K, V> Collector<T, ?, ImmutableListMultimap<K, V>> toImmutableListMultimap(Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends V> valueFunction) {
        return v2.M(keyFunction, valueFunction);
    }

    @go.d
    @go.c
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        o8.j(this, stream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.d7, com.google.common.collect.p6
    public /* bridge */ /* synthetic */ ImmutableCollection get(Object key) {
        return get((ImmutableListMultimap<K, V>) key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    @Deprecated
    @uo.a
    @uo.e("Always throws UnsupportedOperationException")
    public /* bridge */ /* synthetic */ ImmutableCollection replaceValues(Object key, Iterable values) {
        return replaceValues((ImmutableListMultimap<K, V>) key, values);
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k12, V v12) {
        a builder = builder();
        builder.i(k12, v12);
        return builder.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.d7, com.google.common.collect.p6
    public /* bridge */ /* synthetic */ Collection get(Object key) {
        return get((ImmutableListMultimap<K, V>) key);
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public ImmutableListMultimap<V, K> inverse() {
        ImmutableListMultimap<V, K> immutableListMultimap = this.inverse;
        if (immutableListMultimap != null) {
            return immutableListMultimap;
        }
        ImmutableListMultimap<V, K> invert = invert();
        this.inverse = invert;
        return invert;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    @Deprecated
    @uo.a
    @uo.e("Always throws UnsupportedOperationException")
    public /* bridge */ /* synthetic */ Collection replaceValues(Object key, Iterable values) {
        return replaceValues((ImmutableListMultimap<K, V>) key, values);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.d7, com.google.common.collect.p6
    public /* bridge */ /* synthetic */ List get(Object key) {
        return get((ImmutableListMultimap<K, V>) key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    @Deprecated
    @uo.a
    @uo.e("Always throws UnsupportedOperationException")
    public /* bridge */ /* synthetic */ List replaceValues(Object key, Iterable values) {
        return replaceValues((ImmutableListMultimap<K, V>) key, values);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.d7, com.google.common.collect.p6
    public ImmutableList<V> get(K key) {
        ImmutableList<V> immutableList = (ImmutableList) this.map.get(key);
        return immutableList == null ? ImmutableList.of() : immutableList;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.d7, com.google.common.collect.p6
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    @uo.a
    public final ImmutableList<V> removeAll(@CheckForNull Object key) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    @uo.a
    public final ImmutableList<V> replaceValues(K key, Iterable<? extends V> values) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k12, V v12, K k22, V v22) {
        a builder = builder();
        builder.i(k12, v12);
        builder.i(k22, v22);
        return builder.a();
    }

    public static <K, V> ImmutableListMultimap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
        return new a().l(entries).a();
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k12, V v12, K k22, V v22, K k32, V v32) {
        a builder = builder();
        builder.i(k12, v12);
        builder.i(k22, v22);
        builder.i(k32, v32);
        return builder.a();
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k12, V v12, K k22, V v22, K k32, V v32, K k42, V v42) {
        a builder = builder();
        builder.i(k12, v12);
        builder.i(k22, v22);
        builder.i(k32, v32);
        builder.i(k42, v42);
        return builder.a();
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k12, V v12, K k22, V v22, K k32, V v32, K k42, V v42, K k52, V v52) {
        a builder = builder();
        builder.i(k12, v12);
        builder.i(k22, v22);
        builder.i(k32, v32);
        builder.i(k42, v42);
        builder.i(k52, v52);
        return builder.a();
    }
}
