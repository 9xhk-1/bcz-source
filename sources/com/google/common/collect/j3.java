package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public final class j3 {
    @p5
    public static <T> Collector<T, ?, List<T>> b(int k11, Comparator<? super T> comparator) {
        return e(k11, comparator.reversed());
    }

    public static <T> boolean c(Iterable<? extends T> iterable, Comparator<T> comparator) {
        Preconditions.checkNotNull(comparator);
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public static <T> boolean d(Iterable<? extends T> iterable, Comparator<T> comparator) {
        Preconditions.checkNotNull(comparator);
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) >= 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    @p5
    public static <T> Collector<T, ?, List<T>> e(final int k11, final Comparator<? super T> comparator) {
        x2.b(k11, "k");
        Preconditions.checkNotNull(comparator);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.f3
            @Override // java.util.function.Supplier
            public final Object get() {
                u9 e11;
                e11 = u9.e(k11, comparator);
                return e11;
            }
        }, new BiConsumer() { // from class: com.google.common.collect.g3
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((u9) obj).f(obj2);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.h3
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((u9) obj).a((u9) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.i3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((u9) obj).k();
            }
        }, Collector.Characteristics.UNORDERED);
    }

    public static <T, S extends T> Comparator<Iterable<S>> f(Comparator<T> comparator) {
        return new n6((Comparator) Preconditions.checkNotNull(comparator));
    }

    public static <T extends Comparable<? super T>> T g(T a11, T b11) {
        return a11.compareTo(b11) >= 0 ? a11 : b11;
    }

    @t7
    public static <T> T h(@t7 T a11, @t7 T b11, Comparator<? super T> comparator) {
        return comparator.compare(a11, b11) >= 0 ? a11 : b11;
    }

    public static <T extends Comparable<? super T>> T i(T a11, T b11) {
        return a11.compareTo(b11) <= 0 ? a11 : b11;
    }

    @t7
    public static <T> T j(@t7 T a11, @t7 T b11, Comparator<? super T> comparator) {
        return comparator.compare(a11, b11) <= 0 ? a11 : b11;
    }
}
