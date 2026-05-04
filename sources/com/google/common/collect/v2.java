package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.e7;
import com.google.common.collect.v2;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@p5
@u3
@go.b
/* loaded from: classes7.dex */
public final class v2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Collector<Object, ?, ImmutableList<Object>> f34023a = Collector.of(new Supplier() { // from class: com.google.common.collect.g0
        @Override // java.util.function.Supplier
        public final Object get() {
            return ImmutableList.builder();
        }
    }, new BiConsumer() { // from class: com.google.common.collect.k0
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((ImmutableList.a) obj).g(obj2);
        }
    }, new BinaryOperator() { // from class: com.google.common.collect.l0
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((ImmutableList.a) obj).p((ImmutableList.a) obj2);
        }
    }, new Function() { // from class: com.google.common.collect.m0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((ImmutableList.a) obj).e();
        }
    }, new Collector.Characteristics[0]);

    /* renamed from: b, reason: collision with root package name */
    public static final Collector<Object, ?, ImmutableSet<Object>> f34024b = Collector.of(new Supplier() { // from class: com.google.common.collect.n0
        @Override // java.util.function.Supplier
        public final Object get() {
            return ImmutableSet.builder();
        }
    }, new BiConsumer() { // from class: com.google.common.collect.o0
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((ImmutableSet.a) obj).a(obj2);
        }
    }, new BinaryOperator() { // from class: com.google.common.collect.p0
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((ImmutableSet.a) obj).p((ImmutableSet.a) obj2);
        }
    }, new Function() { // from class: com.google.common.collect.q0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((ImmutableSet.a) obj).e();
        }
    }, new Collector.Characteristics[0]);

    /* renamed from: c, reason: collision with root package name */
    @go.c
    public static final Collector<Range<Comparable<?>>, ?, ImmutableRangeSet<Comparable<?>>> f34025c = Collector.of(new Supplier() { // from class: com.google.common.collect.r0
        @Override // java.util.function.Supplier
        public final Object get() {
            return ImmutableRangeSet.builder();
        }
    }, new BiConsumer() { // from class: com.google.common.collect.s0
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((ImmutableRangeSet.d) obj).a((Range) obj2);
        }
    }, new BinaryOperator() { // from class: com.google.common.collect.h0
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((ImmutableRangeSet.d) obj).e((ImmutableRangeSet.d) obj2);
        }
    }, new Function() { // from class: com.google.common.collect.i0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((ImmutableRangeSet.d) obj).d();
        }
    }, new Collector.Characteristics[0]);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @p5
    public static class b<K extends Enum<K>, V> {

        /* renamed from: a, reason: collision with root package name */
        public final BinaryOperator<V> f34026a;

        /* renamed from: b, reason: collision with root package name */
        @CheckForNull
        public EnumMap<K, V> f34027b = null;

        public b(BinaryOperator<V> mergeFunction) {
            this.f34026a = mergeFunction;
        }

        public b<K, V> a(b<K, V> other) {
            if (this.f34027b == null) {
                return other;
            }
            EnumMap<K, V> enumMap = other.f34027b;
            if (enumMap == null) {
                return this;
            }
            enumMap.forEach(new BiConsumer() { // from class: com.google.common.collect.w2
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    v2.b.this.b((Enum) obj, obj2);
                }
            });
            return this;
        }

        public void b(K key, V value) {
            EnumMap<K, V> enumMap = this.f34027b;
            if (enumMap == null) {
                this.f34027b = new EnumMap<>(Collections.singletonMap(key, value));
            } else {
                enumMap.merge(key, value, this.f34026a);
            }
        }

        public ImmutableMap<K, V> c() {
            EnumMap<K, V> enumMap = this.f34027b;
            return enumMap == null ? ImmutableMap.of() : s5.d(enumMap);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @p5
    public static final class c<E extends Enum<E>> {

        /* renamed from: b, reason: collision with root package name */
        public static final Collector<Enum<?>, ?, ImmutableSet<? extends Enum<?>>> f34028b = v2.K();

        /* renamed from: a, reason: collision with root package name */
        @CheckForNull
        public EnumSet<E> f34029a;

        public c() {
        }

        public void a(E e11) {
            EnumSet<E> enumSet = this.f34029a;
            if (enumSet == null) {
                this.f34029a = EnumSet.of((Enum) e11);
            } else {
                enumSet.add(e11);
            }
        }

        public c<E> b(c<E> other) {
            EnumSet<E> enumSet = this.f34029a;
            if (enumSet == null) {
                return other;
            }
            EnumSet<E> enumSet2 = other.f34029a;
            if (enumSet2 == null) {
                return this;
            }
            enumSet.addAll(enumSet2);
            return this;
        }

        public ImmutableSet<E> c() {
            EnumSet<E> enumSet = this.f34029a;
            if (enumSet == null) {
                return ImmutableSet.of();
            }
            ImmutableSet<E> a11 = t5.a(enumSet);
            this.f34029a = null;
            return a11;
        }
    }

    public static /* synthetic */ b A(BinaryOperator binaryOperator) {
        return new b(binaryOperator);
    }

    public static /* synthetic */ d7 B(d7 d7Var, d7 d7Var2) {
        d7Var.putAll(d7Var2);
        return d7Var;
    }

    public static <T, K, V> Collector<T, ?, ImmutableListMultimap<K, V>> D(final Function<? super T, ? extends K> keyFunction, final Function<? super T, ? extends Stream<? extends V>> valuesFunction) {
        Preconditions.checkNotNull(keyFunction);
        Preconditions.checkNotNull(valuesFunction);
        Function function = new Function() { // from class: com.google.common.collect.w0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object checkNotNull;
                checkNotNull = Preconditions.checkNotNull(keyFunction.apply(obj));
                return checkNotNull;
            }
        };
        Function function2 = new Function() { // from class: com.google.common.collect.x0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Stream peek;
                peek = ((Stream) valuesFunction.apply(obj)).peek(new l1());
                return peek;
            }
        };
        final e7.j<Object, Object> a11 = e7.f().a();
        Objects.requireNonNull(a11);
        return Collectors.collectingAndThen(F(function, function2, new Supplier() { // from class: com.google.common.collect.y0
            @Override // java.util.function.Supplier
            public final Object get() {
                return e7.j.this.a();
            }
        }), new Function() { // from class: com.google.common.collect.z0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableListMultimap.copyOf((d7) obj);
            }
        });
    }

    public static <T, K, V> Collector<T, ?, ImmutableSetMultimap<K, V>> E(final Function<? super T, ? extends K> keyFunction, final Function<? super T, ? extends Stream<? extends V>> valuesFunction) {
        Preconditions.checkNotNull(keyFunction);
        Preconditions.checkNotNull(valuesFunction);
        Function function = new Function() { // from class: com.google.common.collect.e1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object checkNotNull;
                checkNotNull = Preconditions.checkNotNull(keyFunction.apply(obj));
                return checkNotNull;
            }
        };
        Function function2 = new Function() { // from class: com.google.common.collect.g1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Stream peek;
                peek = ((Stream) valuesFunction.apply(obj)).peek(new l1());
                return peek;
            }
        };
        final e7.l<Object, Object> g11 = e7.f().g();
        Objects.requireNonNull(g11);
        return Collectors.collectingAndThen(F(function, function2, new Supplier() { // from class: com.google.common.collect.h1
            @Override // java.util.function.Supplier
            public final Object get() {
                return e7.l.this.a();
            }
        }), new Function() { // from class: com.google.common.collect.i1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableSetMultimap.copyOf((d7) obj);
            }
        });
    }

    public static <T, K, V, M extends d7<K, V>> Collector<T, ?, M> F(final Function<? super T, ? extends K> keyFunction, final Function<? super T, ? extends Stream<? extends V>> valueFunction, Supplier<M> multimapSupplier) {
        Preconditions.checkNotNull(keyFunction);
        Preconditions.checkNotNull(valueFunction);
        Preconditions.checkNotNull(multimapSupplier);
        return Collector.of(multimapSupplier, new BiConsumer() { // from class: com.google.common.collect.t0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                v2.t(keyFunction, valueFunction, (d7) obj, obj2);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.v0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return v2.B((d7) obj, (d7) obj2);
            }
        }, new Collector.Characteristics[0]);
    }

    public static <T, K, V> Collector<T, ?, ImmutableBiMap<K, V>> G(final Function<? super T, ? extends K> keyFunction, final Function<? super T, ? extends V> valueFunction) {
        Preconditions.checkNotNull(keyFunction);
        Preconditions.checkNotNull(valueFunction);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.u2
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ImmutableBiMap.a();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.z
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableBiMap.a) obj).i(keyFunction.apply(obj2), valueFunction.apply(obj2));
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.a0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableBiMap.a) obj).e((ImmutableBiMap.a) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.b0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableBiMap.a) obj).d();
            }
        }, new Collector.Characteristics[0]);
    }

    public static <T, K extends Enum<K>, V> Collector<T, ?, ImmutableMap<K, V>> H(final Function<? super T, ? extends K> keyFunction, final Function<? super T, ? extends V> valueFunction) {
        Preconditions.checkNotNull(keyFunction);
        Preconditions.checkNotNull(valueFunction);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.m1
            @Override // java.util.function.Supplier
            public final Object get() {
                return v2.d();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.n1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((v2.b) obj).b((Enum) Preconditions.checkNotNull((Enum) keyFunction.apply(obj2), "Null key for input %s", obj2), Preconditions.checkNotNull(valueFunction.apply(obj2), "Null value for input %s", obj2));
            }
        }, new o1(), new p1(), Collector.Characteristics.UNORDERED);
    }

    public static <T, K extends Enum<K>, V> Collector<T, ?, ImmutableMap<K, V>> I(final Function<? super T, ? extends K> keyFunction, final Function<? super T, ? extends V> valueFunction, final BinaryOperator<V> mergeFunction) {
        Preconditions.checkNotNull(keyFunction);
        Preconditions.checkNotNull(valueFunction);
        Preconditions.checkNotNull(mergeFunction);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.o2
            @Override // java.util.function.Supplier
            public final Object get() {
                return v2.A(mergeFunction);
            }
        }, new BiConsumer() { // from class: com.google.common.collect.p2
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((v2.b) obj).b((Enum) Preconditions.checkNotNull((Enum) keyFunction.apply(obj2), "Null key for input %s", obj2), Preconditions.checkNotNull(valueFunction.apply(obj2), "Null value for input %s", obj2));
            }
        }, new o1(), new p1(), new Collector.Characteristics[0]);
    }

    public static <E extends Enum<E>> Collector<E, ?, ImmutableSet<E>> J() {
        return (Collector<E, ?, ImmutableSet<E>>) c.f34028b;
    }

    public static <E extends Enum<E>> Collector<E, c<E>, ImmutableSet<E>> K() {
        return Collector.of(new Supplier() { // from class: com.google.common.collect.c0
            @Override // java.util.function.Supplier
            public final Object get() {
                return v2.q();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.d0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((v2.c) obj).a((Enum) obj2);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.e0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((v2.c) obj).b((v2.c) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.f0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((v2.c) obj).c();
            }
        }, Collector.Characteristics.UNORDERED);
    }

    public static <E> Collector<E, ?, ImmutableList<E>> L() {
        return (Collector<E, ?, ImmutableList<E>>) f34023a;
    }

    public static <T, K, V> Collector<T, ?, ImmutableListMultimap<K, V>> M(final Function<? super T, ? extends K> keyFunction, final Function<? super T, ? extends V> valueFunction) {
        Preconditions.checkNotNull(keyFunction, "keyFunction");
        Preconditions.checkNotNull(valueFunction, "valueFunction");
        return Collector.of(new Supplier() { // from class: com.google.common.collect.z1
            @Override // java.util.function.Supplier
            public final Object get() {
                return ImmutableListMultimap.builder();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.a2
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableListMultimap.a) obj).i(keyFunction.apply(obj2), valueFunction.apply(obj2));
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.c2
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableListMultimap.a) obj).b((ImmutableListMultimap.a) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.d2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableListMultimap.a) obj).a();
            }
        }, new Collector.Characteristics[0]);
    }

    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> N(final Function<? super T, ? extends K> keyFunction, final Function<? super T, ? extends V> valueFunction) {
        Preconditions.checkNotNull(keyFunction);
        Preconditions.checkNotNull(valueFunction);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.r1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ImmutableMap.b();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.s1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableMap.b) obj).i(keyFunction.apply(obj2), valueFunction.apply(obj2));
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.t1
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableMap.b) obj).e((ImmutableMap.b) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.u1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableMap.b) obj).d();
            }
        }, new Collector.Characteristics[0]);
    }

    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> O(Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends V> valueFunction, BinaryOperator<V> mergeFunction) {
        Preconditions.checkNotNull(keyFunction);
        Preconditions.checkNotNull(valueFunction);
        Preconditions.checkNotNull(mergeFunction);
        return Collectors.collectingAndThen(Collectors.toMap(keyFunction, valueFunction, mergeFunction, new i2()), new Function() { // from class: com.google.common.collect.j2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableMap.copyOf((Map) obj);
            }
        });
    }

    public static <T, E> Collector<T, ?, ImmutableMultiset<E>> P(final Function<? super T, ? extends E> elementFunction, final ToIntFunction<? super T> countFunction) {
        Preconditions.checkNotNull(elementFunction);
        Preconditions.checkNotNull(countFunction);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.a1
            @Override // java.util.function.Supplier
            public final Object get() {
                return LinkedHashMultiset.create();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.b1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((j7) obj).add(Preconditions.checkNotNull(elementFunction.apply(obj2)), countFunction.applyAsInt(obj2));
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.c1
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return v2.m((j7) obj, (j7) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.d1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ImmutableMultiset copyFromEntries;
                copyFromEntries = ImmutableMultiset.copyFromEntries(((j7) obj).entrySet());
                return copyFromEntries;
            }
        }, new Collector.Characteristics[0]);
    }

    @go.c
    public static <T, K extends Comparable<? super K>, V> Collector<T, ?, ImmutableRangeMap<K, V>> Q(final Function<? super T, Range<K>> keyFunction, final Function<? super T, ? extends V> valueFunction) {
        Preconditions.checkNotNull(keyFunction);
        Preconditions.checkNotNull(valueFunction);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.j0
            @Override // java.util.function.Supplier
            public final Object get() {
                return ImmutableRangeMap.builder();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.u0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableRangeMap.c) obj).c((Range) keyFunction.apply(obj2), valueFunction.apply(obj2));
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.f1
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableRangeMap.c) obj).b((ImmutableRangeMap.c) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.q1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableRangeMap.c) obj).a();
            }
        }, new Collector.Characteristics[0]);
    }

    @go.c
    public static <E extends Comparable<? super E>> Collector<Range<E>, ?, ImmutableRangeSet<E>> R() {
        return (Collector<Range<E>, ?, ImmutableRangeSet<E>>) f34025c;
    }

    public static <E> Collector<E, ?, ImmutableSet<E>> S() {
        return (Collector<E, ?, ImmutableSet<E>>) f34024b;
    }

    public static <T, K, V> Collector<T, ?, ImmutableSetMultimap<K, V>> T(final Function<? super T, ? extends K> keyFunction, final Function<? super T, ? extends V> valueFunction) {
        Preconditions.checkNotNull(keyFunction, "keyFunction");
        Preconditions.checkNotNull(valueFunction, "valueFunction");
        return Collector.of(new Supplier() { // from class: com.google.common.collect.e2
            @Override // java.util.function.Supplier
            public final Object get() {
                return ImmutableSetMultimap.builder();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.f2
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableSetMultimap.a) obj).i(keyFunction.apply(obj2), valueFunction.apply(obj2));
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.g2
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableSetMultimap.a) obj).b((ImmutableSetMultimap.a) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.h2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableSetMultimap.a) obj).a();
            }
        }, new Collector.Characteristics[0]);
    }

    public static <T, K, V> Collector<T, ?, ImmutableSortedMap<K, V>> U(final Comparator<? super K> comparator, final Function<? super T, ? extends K> keyFunction, final Function<? super T, ? extends V> valueFunction) {
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(keyFunction);
        Preconditions.checkNotNull(valueFunction);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.b2
            @Override // java.util.function.Supplier
            public final Object get() {
                return v2.b(comparator);
            }
        }, new BiConsumer() { // from class: com.google.common.collect.m2
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableSortedMap.b) obj).i(keyFunction.apply(obj2), valueFunction.apply(obj2));
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.s2
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableSortedMap.b) obj).q((ImmutableSortedMap.b) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.t2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableSortedMap.b) obj).d();
            }
        }, Collector.Characteristics.UNORDERED);
    }

    public static <T, K, V> Collector<T, ?, ImmutableSortedMap<K, V>> V(final Comparator<? super K> comparator, Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends V> valueFunction, BinaryOperator<V> mergeFunction) {
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(keyFunction);
        Preconditions.checkNotNull(valueFunction);
        Preconditions.checkNotNull(mergeFunction);
        return Collectors.collectingAndThen(Collectors.toMap(keyFunction, valueFunction, mergeFunction, new Supplier() { // from class: com.google.common.collect.j1
            @Override // java.util.function.Supplier
            public final Object get() {
                return v2.p(comparator);
            }
        }), new Function() { // from class: com.google.common.collect.k1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableSortedMap.copyOfSorted((TreeMap) obj);
            }
        });
    }

    public static <E> Collector<E, ?, ImmutableSortedSet<E>> W(final Comparator<? super E> comparator) {
        Preconditions.checkNotNull(comparator);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.v1
            @Override // java.util.function.Supplier
            public final Object get() {
                return v2.g(comparator);
            }
        }, new BiConsumer() { // from class: com.google.common.collect.w1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableSortedSet.a) obj).g(obj2);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.x1
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableSortedSet.a) obj).p((ImmutableSortedSet.a) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.y1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableSortedSet.a) obj).e();
            }
        }, new Collector.Characteristics[0]);
    }

    public static <T, K, V, M extends d7<K, V>> Collector<T, ?, M> X(final Function<? super T, ? extends K> keyFunction, final Function<? super T, ? extends V> valueFunction, Supplier<M> multimapSupplier) {
        Preconditions.checkNotNull(keyFunction);
        Preconditions.checkNotNull(valueFunction);
        Preconditions.checkNotNull(multimapSupplier);
        return Collector.of(multimapSupplier, new BiConsumer() { // from class: com.google.common.collect.q2
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((d7) obj).put(keyFunction.apply(obj2), valueFunction.apply(obj2));
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.r2
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return v2.h((d7) obj, (d7) obj2);
            }
        }, new Collector.Characteristics[0]);
    }

    public static <T, E, M extends j7<E>> Collector<T, ?, M> Y(final Function<? super T, E> elementFunction, final ToIntFunction<? super T> countFunction, Supplier<M> multisetSupplier) {
        Preconditions.checkNotNull(elementFunction);
        Preconditions.checkNotNull(countFunction);
        Preconditions.checkNotNull(multisetSupplier);
        return Collector.of(multisetSupplier, new BiConsumer() { // from class: com.google.common.collect.l2
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((j7) obj).add(elementFunction.apply(obj2), countFunction.applyAsInt(obj2));
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.n2
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return v2.o((j7) obj, (j7) obj2);
            }
        }, new Collector.Characteristics[0]);
    }

    public static /* synthetic */ ImmutableSortedMap.b b(Comparator comparator) {
        return new ImmutableSortedMap.b(comparator);
    }

    public static /* synthetic */ b d() {
        return new b(new BinaryOperator() { // from class: com.google.common.collect.y
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return v2.y(obj, obj2);
            }
        });
    }

    public static /* synthetic */ ImmutableSortedSet.a g(Comparator comparator) {
        return new ImmutableSortedSet.a(comparator);
    }

    public static /* synthetic */ d7 h(d7 d7Var, d7 d7Var2) {
        d7Var.putAll(d7Var2);
        return d7Var;
    }

    public static /* synthetic */ j7 m(j7 j7Var, j7 j7Var2) {
        j7Var.addAll(j7Var2);
        return j7Var;
    }

    public static /* synthetic */ j7 o(j7 j7Var, j7 j7Var2) {
        j7Var.addAll(j7Var2);
        return j7Var;
    }

    public static /* synthetic */ TreeMap p(Comparator comparator) {
        return new TreeMap(comparator);
    }

    public static /* synthetic */ c q() {
        return new c();
    }

    public static /* synthetic */ void t(Function function, Function function2, d7 d7Var, Object obj) {
        final Collection collection = d7Var.get(function.apply(obj));
        Stream stream = (Stream) function2.apply(obj);
        Objects.requireNonNull(collection);
        stream.forEachOrdered(new Consumer() { // from class: com.google.common.collect.k2
            @Override // java.util.function.Consumer
            public final void accept(Object obj2) {
                collection.add(obj2);
            }
        });
    }

    public static /* synthetic */ Object y(Object obj, Object obj2) {
        throw new IllegalArgumentException("Multiple values for key: " + obj + org.junit.jupiter.api.j2.O + obj2);
    }
}
