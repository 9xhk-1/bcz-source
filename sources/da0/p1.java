package da0;

import ba0.g4;
import da0.k;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.6", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public class p1 implements ca0.l {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f47565a;

    /* renamed from: b, reason: collision with root package name */
    public final List<e> f47566b;

    /* renamed from: c, reason: collision with root package name */
    public final e f47567c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @API(since = "1.11", status = API.Status.INTERNAL)
    public static class a implements k {

        /* renamed from: a, reason: collision with root package name */
        public static final String f47568a = "nested-class";

        @Override // da0.k
        public Optional<p1> a(ca0.o identifier, k.a context) {
            List asList = Arrays.asList(identifier.e().split("/"));
            return Optional.of(x.J(asList.subList(0, asList.size() - 1), (String) asList.get(asList.size() - 1)));
        }

        @Override // da0.k
        public String getPrefix() {
            return "nested-class";
        }
    }

    public p1(final ClassLoader classLoader, List<String> enclosingClassNames, String nestedClassName) {
        this.f47565a = classLoader;
        this.f47566b = (List) enclosingClassNames.stream().map(new Function() { // from class: da0.m1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return p1.b(classLoader, (String) obj);
            }
        }).collect(ba0.n1.j());
        this.f47567c = new e(classLoader, nestedClassName);
    }

    public static /* synthetic */ e b(ClassLoader classLoader, String str) {
        return new e(classLoader, str);
    }

    @Override // ca0.l
    public Optional<ca0.o> a() {
        return Optional.of(ca0.o.c("nested-class", (String) Stream.concat(this.f47566b.stream(), Stream.of(this.f47567c)).map(new l1()).collect(Collectors.joining("/"))));
    }

    @API(since = "1.10", status = API.Status.EXPERIMENTAL)
    public ClassLoader c() {
        return this.f47565a;
    }

    public List<String> d() {
        return (List) this.f47566b.stream().map(new l1()).collect(Collectors.toList());
    }

    public List<Class<?>> e() {
        return (List) this.f47566b.stream().map(new Function() { // from class: da0.o1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((e) obj).e();
            }
        }).collect(Collectors.toList());
    }

    public boolean equals(Object o11) {
        if (this == o11) {
            return true;
        }
        if (o11 != null && getClass() == o11.getClass()) {
            p1 p1Var = (p1) o11;
            if (this.f47566b.equals(p1Var.f47566b) && this.f47567c.equals(p1Var.f47567c)) {
                return true;
            }
        }
        return false;
    }

    public Class<?> f() {
        return this.f47567c.e();
    }

    public String g() {
        return this.f47567c.d();
    }

    public int hashCode() {
        return Objects.hash(this.f47566b, this.f47567c);
    }

    public String toString() {
        return new g4(this).a("enclosingClassNames", d()).a("nestedClassName", g()).a("classLoader", c()).toString();
    }

    public p1(List<Class<?>> enclosingClasses, Class<?> nestedClass) {
        this.f47565a = nestedClass.getClassLoader();
        this.f47566b = (List) enclosingClasses.stream().map(new Function() { // from class: da0.n1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new e((Class) obj);
            }
        }).collect(Collectors.toList());
        this.f47567c = new e(nestedClass);
    }
}
