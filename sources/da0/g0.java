package da0;

import ba0.c2;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class g0 implements s1 {

    /* renamed from: b, reason: collision with root package name */
    public final List<String> f47532b;

    /* renamed from: c, reason: collision with root package name */
    public final String f47533c;

    public g0(String... packageNames) {
        c2.p(packageNames, "packageNames must not be null or empty");
        c2.i(packageNames, "packageNames must not contain null elements");
        this.f47532b = Arrays.asList(packageNames);
        this.f47533c = (String) Arrays.stream(packageNames).collect(Collectors.joining("' OR '", "'", "'"));
    }

    public static /* synthetic */ boolean o(String str, String str2) {
        if (str2.equals(str)) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(".");
        return str.startsWith(sb2.toString());
    }

    public static /* synthetic */ boolean p(g0 g0Var, String str) {
        return !g0Var.s(str).isPresent();
    }

    private String u(String packageName) {
        return String.format("Package name [%s] does not match any excluded names: %s", packageName, this.f47533c);
    }

    @Override // ca0.v
    public Predicate<String> h() {
        return new Predicate() { // from class: da0.f0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return g0.p(g0.this, (String) obj);
            }
        };
    }

    @Override // ca0.v
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public ca0.y apply(final String packageName) {
        return (ca0.y) s(packageName).map(new Function() { // from class: da0.d0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ca0.y c11;
                c11 = ca0.y.c(g0.this.t(packageName, (String) obj));
                return c11;
            }
        }).orElseGet(new Supplier() { // from class: da0.e0
            @Override // java.util.function.Supplier
            public final Object get() {
                ca0.y f11;
                f11 = ca0.y.f(g0.this.u(packageName));
                return f11;
            }
        });
    }

    public final Optional<String> s(final String packageName) {
        return this.f47532b.stream().filter(new Predicate() { // from class: da0.c0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return g0.o(packageName, (String) obj);
            }
        }).findAny();
    }

    public final String t(String packageName, String matchedName) {
        return String.format("Package name [%s] matches excluded name: '%s'", packageName, matchedName);
    }

    public String toString() {
        return String.format("%s that excludes packages whose names are either equal to or start with one of the following: %s", getClass().getSimpleName(), this.f47533c);
    }
}
