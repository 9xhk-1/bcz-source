package org.junit.jupiter.api;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class n {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f77975a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f77976b;

        public a(Object left, Object right) {
            this.f77975a = left;
            this.f77976b = right;
        }

        public boolean equals(Object o11) {
            if (this == o11) {
                return true;
            }
            if (o11 != null && a.class == o11.getClass()) {
                a aVar = (a) o11;
                if (Objects.equals(this.f77975a, aVar.f77975a) && Objects.equals(this.f77976b, aVar.f77976b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.f77975a, this.f77976b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum b {
        UNDER_INVESTIGATION,
        CONTAIN_SAME_ELEMENTS
    }

    public static void c(Object expected, Object actual, Deque<Integer> indexes, Object messageOrSupplier, Map<a, b> investigatedElements) {
        if (Objects.equals(expected, actual)) {
            return;
        }
        if (!(expected instanceof Iterable) || !(actual instanceof Iterable)) {
            i(expected, actual, indexes, messageOrSupplier);
            m(expected, actual, indexes, messageOrSupplier);
            return;
        }
        a aVar = new a(expected, actual);
        b bVar = investigatedElements.get(aVar);
        b bVar2 = b.CONTAIN_SAME_ELEMENTS;
        if (bVar == bVar2) {
            return;
        }
        b bVar3 = b.UNDER_INVESTIGATION;
        if (bVar == bVar3) {
            indexes.removeLast();
            m(expected, actual, indexes, messageOrSupplier);
        }
        investigatedElements.put(aVar, bVar3);
        g((Iterable) expected, (Iterable) actual, indexes, messageOrSupplier, investigatedElements);
        investigatedElements.put(aVar, bVar2);
    }

    public static void d(Iterable<?> expected, Iterable<?> actual) {
        e(expected, actual, null);
    }

    public static void e(Iterable<?> expected, Iterable<?> actual, String message) {
        f(expected, actual, new ArrayDeque(), message);
    }

    public static void f(Iterable<?> expected, Iterable<?> actual, Deque<Integer> indexes, Object messageOrSupplier) {
        g(expected, actual, indexes, messageOrSupplier, new LinkedHashMap());
    }

    public static void g(Iterable<?> expected, Iterable<?> actual, Deque<Integer> indexes, Object messageOrSupplier, Map<a, b> investigatedElements) {
        if (expected == actual) {
            return;
        }
        i(expected, actual, indexes, messageOrSupplier);
        Iterator<?> it = expected.iterator();
        Iterator<?> it2 = actual.iterator();
        int i11 = 0;
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            Object next2 = it2.next();
            indexes.addLast(Integer.valueOf(i11));
            c(next, next2, indexes, messageOrSupplier, investigatedElements);
            indexes.removeLast();
            i11++;
        }
        j(it, it2, i11, indexes, messageOrSupplier);
    }

    public static void h(Iterable<?> expected, Iterable<?> actual, Supplier<String> messageSupplier) {
        f(expected, actual, new ArrayDeque(), messageSupplier);
    }

    public static void i(Object expected, Object actual, Deque<Integer> indexes, Object messageOrSupplier) {
        if (expected == null) {
            l(indexes, messageOrSupplier);
        }
        if (actual == null) {
            k(indexes, messageOrSupplier);
        }
    }

    public static void j(Iterator<?> expected, Iterator<?> actual, int processed, Deque<Integer> indexes, Object messageOrSupplier) {
        if (expected.hasNext() || actual.hasNext()) {
            final AtomicInteger atomicInteger = new AtomicInteger(processed);
            expected.forEachRemaining(new Consumer() { // from class: org.junit.jupiter.api.l
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    atomicInteger.incrementAndGet();
                }
            });
            final AtomicInteger atomicInteger2 = new AtomicInteger(processed);
            actual.forEachRemaining(new Consumer() { // from class: org.junit.jupiter.api.m
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    atomicInteger2.incrementAndGet();
                }
            });
            j0.b().l(messageOrSupplier).n("iterable lengths differ" + l0.m(indexes)).g(Integer.valueOf(atomicInteger.get())).a(Integer.valueOf(atomicInteger2.get())).d();
        }
    }

    public static void k(Deque<Integer> indexes, Object messageOrSupplier) {
        j0.b().l(messageOrSupplier).n("actual iterable was <null>" + l0.m(indexes)).d();
    }

    public static void l(Deque<Integer> indexes, Object messageOrSupplier) {
        j0.b().l(messageOrSupplier).n("expected iterable was <null>" + l0.m(indexes)).d();
    }

    public static void m(Object expected, Object actual, Deque<Integer> indexes, Object messageOrSupplier) {
        j0.b().l(messageOrSupplier).n("iterable contents differ" + l0.m(indexes)).g(expected).a(actual).d();
    }
}
