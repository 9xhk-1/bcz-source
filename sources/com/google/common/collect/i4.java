package com.google.common.collect;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true)
/* loaded from: classes7.dex */
public abstract class i4<E> implements Iterable<E> {

    /* renamed from: a, reason: collision with root package name */
    public final Optional<Iterable<E>> f33543a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends i4<E> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable f33544b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Iterable iterable, final Iterable val$iterable) {
            super(iterable);
            this.f33544b = val$iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<E> iterator() {
            return this.f33544b.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b<T> extends i4<T> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable f33545b;

        public b(final Iterable val$inputs) {
            this.f33545b = val$inputs;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return l6.h(l6.b0(this.f33545b.iterator(), new j4()));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c<T> extends i4<T> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable[] f33546b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends com.google.common.collect.b<Iterator<? extends T>> {
            public a(int size) {
                super(size);
            }

            @Override // com.google.common.collect.b
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Iterator<? extends T> a(int i11) {
                return c.this.f33546b[i11].iterator();
            }
        }

        public c(final Iterable[] val$inputs) {
            this.f33546b = val$inputs;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return l6.h(new a(this.f33546b.length));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d<E> implements ho.r<Iterable<E>, i4<E>> {
        @Override // ho.r
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i4<E> apply(Iterable<E> fromObject) {
            return i4.u(fromObject);
        }
    }

    public i4() {
        this.f33543a = Optional.absent();
    }

    public static <E> i4<E> B() {
        return u(Collections.EMPTY_LIST);
    }

    public static <E> i4<E> C(@t7 E element, E... elements) {
        return u(q6.c(element, elements));
    }

    public static <T> i4<T> g(final Iterable<? extends Iterable<? extends T>> inputs) {
        Preconditions.checkNotNull(inputs);
        return new b(inputs);
    }

    public static <T> i4<T> h(Iterable<? extends T> a11, Iterable<? extends T> b11) {
        return m(a11, b11);
    }

    public static <T> i4<T> j(Iterable<? extends T> a11, Iterable<? extends T> b11, Iterable<? extends T> c11) {
        return m(a11, b11, c11);
    }

    public static <T> i4<T> k(Iterable<? extends T> a11, Iterable<? extends T> b11, Iterable<? extends T> c11, Iterable<? extends T> d11) {
        return m(a11, b11, c11, d11);
    }

    @SafeVarargs
    public static <T> i4<T> l(Iterable<? extends T>... inputs) {
        return m((Iterable[]) Arrays.copyOf(inputs, inputs.length));
    }

    public static <T> i4<T> m(final Iterable<? extends T>... inputs) {
        for (Iterable<? extends T> iterable : inputs) {
            Preconditions.checkNotNull(iterable);
        }
        return new c(inputs);
    }

    @uo.l(replacement = "checkNotNull(iterable)", staticImports = {"com.google.common.base.Preconditions.checkNotNull"})
    @Deprecated
    public static <E> i4<E> t(i4<E> iterable) {
        return (i4) Preconditions.checkNotNull(iterable);
    }

    public static <E> i4<E> u(final Iterable<E> iterable) {
        return iterable instanceof i4 ? (i4) iterable : new a(iterable, iterable);
    }

    public static <E> i4<E> v(E[] elements) {
        return u(Arrays.asList(elements));
    }

    public final i4<E> A(int maxSize) {
        return u(k6.D(w(), maxSize));
    }

    public final i4<E> D(int numberToSkip) {
        return u(k6.N(w(), numberToSkip));
    }

    @go.c
    public final E[] E(Class<E> cls) {
        return (E[]) k6.Q(w(), cls);
    }

    public final ImmutableList<E> F() {
        return ImmutableList.copyOf(w());
    }

    public final <V> ImmutableMap<E, V> G(ho.r<? super E, V> valueFunction) {
        return u6.w0(w(), valueFunction);
    }

    public final ImmutableMultiset<E> H() {
        return ImmutableMultiset.copyOf(w());
    }

    public final ImmutableSet<E> I() {
        return ImmutableSet.copyOf(w());
    }

    public final ImmutableList<E> J(Comparator<? super E> comparator) {
        return s7.i(comparator).l(w());
    }

    public final ImmutableSortedSet<E> K(Comparator<? super E> comparator) {
        return ImmutableSortedSet.copyOf(comparator, w());
    }

    public final <T> i4<T> L(ho.r<? super E, T> function) {
        return u(k6.T(w(), function));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> i4<T> M(ho.r<? super E, ? extends Iterable<? extends T>> function) {
        return g(L(function));
    }

    public final <K> ImmutableMap<K, E> N(ho.r<? super E, K> keyFunction) {
        return u6.G0(w(), keyFunction);
    }

    public final boolean a(ho.i0<? super E> predicate) {
        return k6.b(w(), predicate);
    }

    public final boolean b(ho.i0<? super E> predicate) {
        return k6.c(w(), predicate);
    }

    public final boolean contains(@CheckForNull Object target) {
        return k6.k(w(), target);
    }

    public final i4<E> d(Iterable<? extends E> other) {
        return h(w(), other);
    }

    public final i4<E> f(E... elements) {
        return h(w(), Arrays.asList(elements));
    }

    @t7
    public final E get(int i11) {
        return (E) k6.t(w(), i11);
    }

    public final boolean isEmpty() {
        return !w().iterator().hasNext();
    }

    @uo.a
    public final <C extends Collection<? super E>> C n(C collection) {
        Preconditions.checkNotNull(collection);
        Iterable<E> w11 = w();
        if (w11 instanceof Collection) {
            collection.addAll((Collection) w11);
            return collection;
        }
        Iterator<E> it = w11.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
        return collection;
    }

    public final i4<E> o() {
        return u(k6.l(w()));
    }

    public final i4<E> p(ho.i0<? super E> predicate) {
        return u(k6.o(w(), predicate));
    }

    @go.c
    public final <T> i4<T> q(Class<T> type) {
        return u(k6.p(w(), type));
    }

    public final Optional<E> r() {
        Iterator<E> it = w().iterator();
        return it.hasNext() ? Optional.of(it.next()) : Optional.absent();
    }

    public final Optional<E> s(ho.i0<? super E> predicate) {
        return k6.U(w(), predicate);
    }

    public final int size() {
        return k6.M(w());
    }

    public String toString() {
        return k6.S(w());
    }

    public final Iterable<E> w() {
        return this.f33543a.or((Optional<Iterable<E>>) this);
    }

    public final <K> ImmutableListMultimap<K, E> x(ho.r<? super E, K> keyFunction) {
        return g7.s(w(), keyFunction);
    }

    public final String y(ho.a0 joiner) {
        return joiner.k(this);
    }

    public final Optional<E> z() {
        E next;
        Iterable<E> w11 = w();
        if (w11 instanceof List) {
            List list = (List) w11;
            return list.isEmpty() ? Optional.absent() : Optional.of(list.get(list.size() - 1));
        }
        Iterator<E> it = w11.iterator();
        if (!it.hasNext()) {
            return Optional.absent();
        }
        if (w11 instanceof SortedSet) {
            return Optional.of(((SortedSet) w11).last());
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return Optional.of(next);
    }

    public i4(Iterable<E> iterable) {
        this.f33543a = Optional.of(iterable);
    }
}
