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
public class t0 implements s1 {

    /* renamed from: b, reason: collision with root package name */
    public final List<String> f47583b;

    /* renamed from: c, reason: collision with root package name */
    public final String f47584c;

    public t0(String... packageNames) {
        c2.p(packageNames, "packageNames array must not be null or empty");
        c2.i(packageNames, "packageNames array must not contain null elements");
        this.f47583b = Arrays.asList(packageNames);
        this.f47584c = (String) Arrays.stream(packageNames).collect(Collectors.joining("' OR '", "'", "'"));
    }

    public static /* synthetic */ boolean p(String str, String str2) {
        if (str2.equals(str)) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(".");
        return str.startsWith(sb2.toString());
    }

    private Optional<String> s(final String packageName) {
        return this.f47583b.stream().filter(new Predicate() { // from class: da0.p0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return t0.p(packageName, (String) obj);
            }
        }).findAny();
    }

    private String t(String packageName) {
        return String.format("Package name [%s] does not match any included names: %s", packageName, this.f47584c);
    }

    @Override // ca0.v
    public Predicate<String> h() {
        return new Predicate() { // from class: da0.s0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean isPresent;
                isPresent = t0.this.s((String) obj).isPresent();
                return isPresent;
            }
        };
    }

    @Override // ca0.v
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public ca0.y apply(final String packageName) {
        return (ca0.y) s(packageName).map(new Function() { // from class: da0.q0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ca0.y f11;
                f11 = ca0.y.f(t0.this.u(packageName, (String) obj));
                return f11;
            }
        }).orElseGet(new Supplier() { // from class: da0.r0
            @Override // java.util.function.Supplier
            public final Object get() {
                ca0.y c11;
                c11 = ca0.y.c(t0.this.t(packageName));
                return c11;
            }
        });
    }

    public String toString() {
        return String.format("%s that includes packages whose names are either equal to or start with one of the following: %s", getClass().getSimpleName(), this.f47584c);
    }

    public final String u(String packageName, String matchedName) {
        return String.format("Package name [%s] matches included name: '%s'", packageName, matchedName);
    }
}
