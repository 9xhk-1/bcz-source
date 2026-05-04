package ba0;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.1", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public class u1 {

    /* renamed from: a, reason: collision with root package name */
    public static final y90.e f6615a = y90.g.c(u1.class);

    public static /* synthetic */ String a() {
        return "Basic version of findAllClassesInModule() always returns an empty list!";
    }

    public static /* synthetic */ String b() {
        return "Basic version of findAllResourcesInModule() always returns an empty list!";
    }

    public static /* synthetic */ String c() {
        return "Basic version of findAllNonSystemBootModuleNames() always returns an empty set!";
    }

    public static List<Class<?>> d(String moduleName, l filter) {
        c2.k(moduleName, "Module name must not be null or empty");
        c2.r(filter, "Class filter must not be null");
        f6615a.j(new Supplier() { // from class: ba0.t1
            @Override // java.util.function.Supplier
            public final Object get() {
                return u1.a();
            }
        });
        return Collections.EMPTY_LIST;
    }

    public static Set<String> e() {
        f6615a.j(new Supplier() { // from class: ba0.r1
            @Override // java.util.function.Supplier
            public final Object get() {
                return u1.c();
            }
        });
        return Collections.EMPTY_SET;
    }

    @API(since = "1.11", status = API.Status.INTERNAL)
    public static List<z90.j> f(String moduleName, Predicate<z90.j> filter) {
        c2.k(moduleName, "Module name must not be null or empty");
        c2.r(filter, "Resource filter must not be null");
        f6615a.j(new Supplier() { // from class: ba0.s1
            @Override // java.util.function.Supplier
            public final Object get() {
                return u1.b();
            }
        });
        return Collections.EMPTY_LIST;
    }

    public static Optional<String> g(Class<?> type) {
        return Optional.empty();
    }

    public static Optional<String> h(Class<?> type) {
        return Optional.empty();
    }

    public static boolean i() {
        return false;
    }
}
