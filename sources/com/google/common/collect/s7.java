package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class s7<T> implements Comparator<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final int f33841a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f33842b = -1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.d
    @go.e
    public static class a extends s7<Object> {

        /* renamed from: c, reason: collision with root package name */
        public final AtomicInteger f33843c = new AtomicInteger(0);

        /* renamed from: d, reason: collision with root package name */
        public final ConcurrentMap<Object, Integer> f33844d = v7.m(new s6()).i();

        public final Integer I(Object obj) {
            Integer putIfAbsent;
            Integer num = this.f33844d.get(obj);
            return (num != null || (putIfAbsent = this.f33844d.putIfAbsent(obj, (num = Integer.valueOf(this.f33843c.getAndIncrement())))) == null) ? num : putIfAbsent;
        }

        public int J(Object object) {
            return System.identityHashCode(object);
        }

        @Override // com.google.common.collect.s7, java.util.Comparator
        public int compare(@CheckForNull Object left, @CheckForNull Object right) {
            if (left == right) {
                return 0;
            }
            if (left == null) {
                return -1;
            }
            if (right == null) {
                return 1;
            }
            int J = J(left);
            int J2 = J(right);
            if (J != J2) {
                return J < J2 ? -1 : 1;
            }
            int compareTo = I(left).compareTo(I(right));
            if (compareTo != 0) {
                return compareTo;
            }
            throw new AssertionError();
        }

        public String toString() {
            return "Ordering.arbitrary()";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.d
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final s7<Object> f33845a = new a();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends ClassCastException {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Object f33846a;

        public c(Object value) {
            super("Cannot compare value: " + value);
            this.f33846a = value;
        }
    }

    @go.b(serializable = true)
    public static s7<Object> H() {
        return da.f33364c;
    }

    @go.b(serializable = true)
    public static s7<Object> a() {
        return r.f33808c;
    }

    @go.d
    public static s7<Object> b() {
        return b.f33845a;
    }

    @go.b(serializable = true)
    public static <T> s7<T> d(Iterable<? extends Comparator<? super T>> comparators) {
        return new l3(comparators);
    }

    @go.b(serializable = true)
    public static <T> s7<T> f(T leastValue, T... remainingValuesInOrder) {
        return g(q6.c(leastValue, remainingValuesInOrder));
    }

    @go.b(serializable = true)
    public static <T> s7<T> g(List<T> valuesInOrder) {
        return new y3(valuesInOrder);
    }

    @go.b(serializable = true)
    @Deprecated
    public static <T> s7<T> h(s7<T> ordering) {
        return (s7) Preconditions.checkNotNull(ordering);
    }

    @go.b(serializable = true)
    public static <T> s7<T> i(Comparator<T> comparator) {
        return comparator instanceof s7 ? (s7) comparator : new e3(comparator);
    }

    @go.b(serializable = true)
    public static <C extends Comparable> s7<C> z() {
        return l7.f33668e;
    }

    @go.b(serializable = true)
    public <S extends T> s7<S> A() {
        return new n7(this);
    }

    @go.b(serializable = true)
    public <S extends T> s7<S> B() {
        return new o7(this);
    }

    public <T2 extends T> s7<Map.Entry<T2, ?>> C() {
        return (s7<Map.Entry<T2, ?>>) D(u6.R());
    }

    @go.b(serializable = true)
    public <F> s7<F> D(ho.r<F, ? extends T> function) {
        return new v(function, this);
    }

    @go.b(serializable = true)
    public <S extends T> s7<S> F() {
        return new m8(this);
    }

    public <E extends T> List<E> G(Iterable<E> elements) {
        Object[] P = k6.P(elements);
        Arrays.sort(P, this);
        return q6.r(Arrays.asList(P));
    }

    @Deprecated
    public int c(List<? extends T> sortedList, @t7 T key) {
        return Collections.binarySearch(sortedList, key, this);
    }

    @Override // java.util.Comparator
    public abstract int compare(@t7 T left, @t7 T right);

    @go.b(serializable = true)
    public <U extends T> s7<U> e(Comparator<? super U> secondaryComparator) {
        return new l3(this, (Comparator) Preconditions.checkNotNull(secondaryComparator));
    }

    public <E extends T> List<E> j(Iterable<E> iterable, int k11) {
        return F().o(iterable, k11);
    }

    public <E extends T> List<E> k(Iterator<E> iterator, int k11) {
        return F().p(iterator, k11);
    }

    public <E extends T> ImmutableList<E> l(Iterable<E> elements) {
        return ImmutableList.sortedCopyOf(this, elements);
    }

    public boolean m(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (compare(next, next2) > 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public boolean n(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (compare(next, next2) >= 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public <E extends T> List<E> o(Iterable<E> iterable, int k11) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= k11 * 2) {
                Object[] array = collection.toArray();
                Arrays.sort(array, this);
                if (array.length > k11) {
                    array = Arrays.copyOf(array, k11);
                }
                return Collections.unmodifiableList(Arrays.asList(array));
            }
        }
        return p(iterable.iterator(), k11);
    }

    public <E extends T> List<E> p(Iterator<E> iterator, int k11) {
        Preconditions.checkNotNull(iterator);
        x2.b(k11, "k");
        if (k11 == 0 || !iterator.hasNext()) {
            return Collections.EMPTY_LIST;
        }
        if (k11 < 1073741823) {
            u9 e11 = u9.e(k11, this);
            e11.h(iterator);
            return e11.k();
        }
        ArrayList s11 = q6.s(iterator);
        Collections.sort(s11, this);
        if (s11.size() > k11) {
            s11.subList(k11, s11.size()).clear();
        }
        s11.trimToSize();
        return Collections.unmodifiableList(s11);
    }

    @go.b(serializable = true)
    public <S extends T> s7<Iterable<S>> q() {
        return new n6(this);
    }

    @t7
    public <E extends T> E r(Iterable<E> iterable) {
        return (E) u(iterable.iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @t7
    public <E extends T> E s(@t7 E a11, @t7 E b11) {
        return compare(a11, b11) >= 0 ? a11 : b11;
    }

    @t7
    public <E extends T> E t(@t7 E e11, @t7 E e12, @t7 E e13, E... eArr) {
        E e14 = (E) s(s(e11, e12), e13);
        for (E e15 : eArr) {
            e14 = (E) s(e14, e15);
        }
        return e14;
    }

    @t7
    public <E extends T> E u(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) s(next, it.next());
        }
        return next;
    }

    @t7
    public <E extends T> E v(Iterable<E> iterable) {
        return (E) y(iterable.iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @t7
    public <E extends T> E w(@t7 E a11, @t7 E b11) {
        return compare(a11, b11) <= 0 ? a11 : b11;
    }

    @t7
    public <E extends T> E x(@t7 E e11, @t7 E e12, @t7 E e13, E... eArr) {
        E e14 = (E) w(w(e11, e12), e13);
        for (E e15 : eArr) {
            e14 = (E) w(e14, e15);
        }
        return e14;
    }

    @t7
    public <E extends T> E y(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) w(next, it.next());
        }
        return next;
    }
}
