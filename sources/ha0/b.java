package ha0;

import da0.k1;
import da0.t1;
import da0.x;
import ha0.u;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class b implements u {

    /* renamed from: a, reason: collision with root package name */
    public final Predicate<Class<?>> f59096a;

    /* renamed from: b, reason: collision with root package name */
    public final Predicate<String> f59097b;

    public b(Predicate<Class<?>> classFilter, Predicate<String> classNameFilter) {
        this.f59096a = classFilter;
        this.f59097b = classNameFilter;
    }

    @Override // ha0.u
    public u.c c(da0.i selector, u.a context) {
        return o(z90.i.a(selector.b(), this.f59096a, this.f59097b));
    }

    @Override // ha0.u
    public u.c g(t1 selector, u.a context) {
        return o(z90.i.c(selector.b(), this.f59096a, this.f59097b));
    }

    @Override // ha0.u
    public u.c j(k1 selector, u.a context) {
        return o(z90.i.b(selector.b(), this.f59096a, this.f59097b));
    }

    public final u.c o(List<Class<?>> classes) {
        return classes.isEmpty() ? u.c.g() : u.c.f((Set) classes.stream().map(new Function() { // from class: ha0.a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return x.h((Class) obj);
            }
        }).collect(Collectors.toSet()));
    }
}
