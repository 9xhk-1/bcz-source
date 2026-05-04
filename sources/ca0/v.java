package ca0;

import ba0.c2;
import ba0.n1;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;
import java.util.function.Predicate;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.STABLE)
@FunctionalInterface
/* loaded from: classes9.dex */
public interface v<T> {
    static <T> v<T> e(Collection<? extends v<T>> filters) {
        c2.r(filters, "Filters must not be null");
        return filters.isEmpty() ? h.r() : filters.size() == 1 ? (v) n1.f(filters) : new h(filters);
    }

    static <T, V> v<T> g(final v<V> adaptee, final Function<T, V> converter) {
        return new v() { // from class: ca0.u
            @Override // ca0.v
            public final y apply(Object obj) {
                y apply;
                apply = v.this.apply(converter.apply(obj));
                return apply;
            }
        };
    }

    @SafeVarargs
    static <T> v<T> j(v<T>... filters) {
        c2.r(filters, "filters array must not be null");
        c2.i(filters, "individual filters must not be null");
        return filters.length == 0 ? h.r() : filters.length == 1 ? filters[0] : new h(Arrays.asList(filters));
    }

    y apply(T object);

    default Predicate<T> h() {
        return new Predicate() { // from class: ca0.t
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean i11;
                i11 = v.this.i(obj);
                return i11;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean i(Object obj) {
        return apply(obj).g();
    }
}
