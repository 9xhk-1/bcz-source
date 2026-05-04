package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true, serializable = true)
/* loaded from: classes7.dex */
public abstract class ImmutableBiMap<K, V> extends ImmutableMap<K, V> implements u<K, V> {
    private static final long serialVersionUID = 912559;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<K, V> extends ImmutableMap.b<K, V> {
        public a() {
        }

        @Override // com.google.common.collect.ImmutableMap.b
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public ImmutableBiMap<K, V> a() {
            return d();
        }

        @Override // com.google.common.collect.ImmutableMap.b
        @Deprecated
        @uo.e
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public ImmutableBiMap<K, V> c() {
            throw new UnsupportedOperationException("Not supported for bimaps");
        }

        @Override // com.google.common.collect.ImmutableMap.b
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public ImmutableBiMap<K, V> d() {
            int i11 = this.f33005c;
            if (i11 == 0) {
                return ImmutableBiMap.of();
            }
            if (this.f33003a != null) {
                if (this.f33006d) {
                    this.f33004b = Arrays.copyOf(this.f33004b, i11 * 2);
                }
                ImmutableMap.b.m(this.f33004b, this.f33005c, this.f33003a);
            }
            this.f33006d = true;
            return new c8(this.f33004b, this.f33005c);
        }

        @Override // com.google.common.collect.ImmutableMap.b
        @uo.a
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public a<K, V> e(ImmutableMap.b<K, V> builder) {
            super.e(builder);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.b
        @uo.a
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public a<K, V> h(Comparator<? super V> valueComparator) {
            super.h(valueComparator);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.b
        @uo.a
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public a<K, V> i(K key, V value) {
            super.i(key, value);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.b
        @uo.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public a<K, V> j(Map.Entry<? extends K, ? extends V> entry) {
            super.j(entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.b
        @uo.a
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public a<K, V> k(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
            super.k(entries);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.b
        @uo.a
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public a<K, V> l(Map<? extends K, ? extends V> map) {
            super.l(map);
            return this;
        }

        public a(int size) {
            super(size);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.d
    public static class b<K, V> extends ImmutableMap.e<K, V> {
        private static final long serialVersionUID = 0;

        public b(ImmutableBiMap<K, V> bimap) {
            super(bimap);
        }

        @Override // com.google.common.collect.ImmutableMap.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a<K, V> b(int size) {
            return new a<>(size);
        }
    }

    public static <K, V> a<K, V> builder() {
        return new a<>();
    }

    public static <K, V> a<K, V> builderWithExpectedSize(int expectedSize) {
        x2.b(expectedSize, "expectedSize");
        return new a<>(expectedSize);
    }

    public static <K, V> ImmutableBiMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if (map instanceof ImmutableBiMap) {
            ImmutableBiMap<K, V> immutableBiMap = (ImmutableBiMap) map;
            if (!immutableBiMap.isPartialView()) {
                return immutableBiMap;
            }
        }
        return copyOf((Iterable) map.entrySet());
    }

    public static <K, V> ImmutableBiMap<K, V> of() {
        return c8.f33308f;
    }

    @SafeVarargs
    public static <K, V> ImmutableBiMap<K, V> ofEntries(Map.Entry<? extends K, ? extends V>... entries) {
        return copyOf((Iterable) Arrays.asList(entries));
    }

    @go.d
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @p5
    public static <T, K, V> Collector<T, ?, ImmutableBiMap<K, V>> toImmutableBiMap(Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends V> valueFunction) {
        return v2.G(keyFunction, valueFunction);
    }

    @Deprecated
    @uo.e("Use toImmutableBiMap")
    @p5
    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends V> valueFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.u
    @CheckForNull
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    @uo.a
    public final V forcePut(K key, V value) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.u
    public abstract ImmutableBiMap<V, K> inverse();

    @Override // com.google.common.collect.ImmutableMap
    @go.d
    public Object writeReplace() {
        return new b(this);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k12, V v12) {
        x2.a(k12, v12);
        return new c8(new Object[]{k12, v12}, 1);
    }

    @Deprecated
    @uo.e("Use toImmutableBiMap")
    @p5
    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends V> valueFunction, BinaryOperator<V> mergeFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet<V> createValues() {
        throw new AssertionError("should never be called");
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k12, V v12, K k22, V v22) {
        x2.a(k12, v12);
        x2.a(k22, v22);
        return new c8(new Object[]{k12, v12, k22, v22}, 2);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.u
    public ImmutableSet<V> values() {
        return inverse().keySet();
    }

    public static <K, V> ImmutableBiMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
        return new a(entries instanceof Collection ? ((Collection) entries).size() : 4).k(entries).a();
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k12, V v12, K k22, V v22, K k32, V v32) {
        x2.a(k12, v12);
        x2.a(k22, v22);
        x2.a(k32, v32);
        return new c8(new Object[]{k12, v12, k22, v22, k32, v32}, 3);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k12, V v12, K k22, V v22, K k32, V v32, K k42, V v42) {
        x2.a(k12, v12);
        x2.a(k22, v22);
        x2.a(k32, v32);
        x2.a(k42, v42);
        return new c8(new Object[]{k12, v12, k22, v22, k32, v32, k42, v42}, 4);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k12, V v12, K k22, V v22, K k32, V v32, K k42, V v42, K k52, V v52) {
        x2.a(k12, v12);
        x2.a(k22, v22);
        x2.a(k32, v32);
        x2.a(k42, v42);
        x2.a(k52, v52);
        return new c8(new Object[]{k12, v12, k22, v22, k32, v32, k42, v42, k52, v52}, 5);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k12, V v12, K k22, V v22, K k32, V v32, K k42, V v42, K k52, V v52, K k62, V v62) {
        x2.a(k12, v12);
        x2.a(k22, v22);
        x2.a(k32, v32);
        x2.a(k42, v42);
        x2.a(k52, v52);
        x2.a(k62, v62);
        return new c8(new Object[]{k12, v12, k22, v22, k32, v32, k42, v42, k52, v52, k62, v62}, 6);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k12, V v12, K k22, V v22, K k32, V v32, K k42, V v42, K k52, V v52, K k62, V v62, K k72, V v72) {
        x2.a(k12, v12);
        x2.a(k22, v22);
        x2.a(k32, v32);
        x2.a(k42, v42);
        x2.a(k52, v52);
        x2.a(k62, v62);
        x2.a(k72, v72);
        return new c8(new Object[]{k12, v12, k22, v22, k32, v32, k42, v42, k52, v52, k62, v62, k72, v72}, 7);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k12, V v12, K k22, V v22, K k32, V v32, K k42, V v42, K k52, V v52, K k62, V v62, K k72, V v72, K k82, V v82) {
        x2.a(k12, v12);
        x2.a(k22, v22);
        x2.a(k32, v32);
        x2.a(k42, v42);
        x2.a(k52, v52);
        x2.a(k62, v62);
        x2.a(k72, v72);
        x2.a(k82, v82);
        return new c8(new Object[]{k12, v12, k22, v22, k32, v32, k42, v42, k52, v52, k62, v62, k72, v72, k82, v82}, 8);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k12, V v12, K k22, V v22, K k32, V v32, K k42, V v42, K k52, V v52, K k62, V v62, K k72, V v72, K k82, V v82, K k92, V v92) {
        x2.a(k12, v12);
        x2.a(k22, v22);
        x2.a(k32, v32);
        x2.a(k42, v42);
        x2.a(k52, v52);
        x2.a(k62, v62);
        x2.a(k72, v72);
        x2.a(k82, v82);
        x2.a(k92, v92);
        return new c8(new Object[]{k12, v12, k22, v22, k32, v32, k42, v42, k52, v52, k62, v62, k72, v72, k82, v82, k92, v92}, 9);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k12, V v12, K k22, V v22, K k32, V v32, K k42, V v42, K k52, V v52, K k62, V v62, K k72, V v72, K k82, V v82, K k92, V v92, K k102, V v102) {
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
        return new c8(new Object[]{k12, v12, k22, v22, k32, v32, k42, v42, k52, v52, k62, v62, k72, v72, k82, v82, k92, v92, k102, v102}, 10);
    }
}
