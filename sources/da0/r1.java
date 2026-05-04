package da0;

import ba0.g4;
import da0.k;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import org.apiguardian.api.API;
import org.junit.platform.commons.util.ReflectionUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.6", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public class r1 implements ca0.l {

    /* renamed from: a, reason: collision with root package name */
    public final p1 f47578a;

    /* renamed from: b, reason: collision with root package name */
    public final j1 f47579b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @API(since = "1.11", status = API.Status.INTERNAL)
    public static class a implements k {

        /* renamed from: a, reason: collision with root package name */
        public static final String f47580a = "nested-method";

        @Override // da0.k
        public Optional<r1> a(ca0.o identifier, k.a context) {
            List asList = Arrays.asList(identifier.e().split("/"));
            List subList = asList.subList(0, asList.size() - 1);
            String[] A1 = ReflectionUtils.A1((String) asList.get(asList.size() - 1));
            return Optional.of(x.R(subList, A1[0], A1[1], A1[2]));
        }

        @Override // da0.k
        public String getPrefix() {
            return f47580a;
        }
    }

    public r1(ClassLoader classLoader, List<String> enclosingClassNames, String nestedClassName, String methodName, String parameterTypeNames) {
        this.f47578a = new p1(classLoader, enclosingClassNames, nestedClassName);
        this.f47579b = new j1(classLoader, nestedClassName, methodName, parameterTypeNames);
    }

    public static /* synthetic */ ca0.o b(r1 r1Var, ca0.o oVar) {
        r1Var.getClass();
        return ca0.o.c(a.f47580a, ReflectionUtils.y0(oVar.e(), r1Var.f47579b.i(), r1Var.f47579b.k()));
    }

    @Override // ca0.l
    public Optional<ca0.o> a() {
        return this.f47578a.a().map(new Function() { // from class: da0.q1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return r1.b(r1.this, (ca0.o) obj);
            }
        });
    }

    @API(since = "1.10", status = API.Status.EXPERIMENTAL)
    public ClassLoader c() {
        return this.f47578a.c();
    }

    public List<String> d() {
        return this.f47578a.d();
    }

    public List<Class<?>> e() {
        return this.f47578a.e();
    }

    public boolean equals(Object o11) {
        if (this == o11) {
            return true;
        }
        if (o11 != null && getClass() == o11.getClass()) {
            r1 r1Var = (r1) o11;
            if (this.f47578a.equals(r1Var.f47578a) && this.f47579b.equals(r1Var.f47579b)) {
                return true;
            }
        }
        return false;
    }

    public Method f() {
        return this.f47579b.h();
    }

    public String g() {
        return this.f47579b.i();
    }

    @API(since = "1.10", status = API.Status.DEPRECATED)
    @Deprecated
    public String h() {
        return k();
    }

    public int hashCode() {
        return Objects.hash(this.f47578a, this.f47579b);
    }

    public Class<?> i() {
        return this.f47578a.f();
    }

    public String j() {
        return this.f47578a.g();
    }

    @API(since = "1.10", status = API.Status.STABLE)
    public String k() {
        return this.f47579b.k();
    }

    @API(since = "1.10", status = API.Status.EXPERIMENTAL)
    public Class<?>[] l() {
        return this.f47579b.l();
    }

    public String toString() {
        return new g4(this).a("enclosingClassNames", d()).a("nestedClassName", j()).a("methodName", g()).a("parameterTypes", k()).a("classLoader", c()).toString();
    }

    public r1(ClassLoader classLoader, List<String> enclosingClassNames, String nestedClassName, String methodName, Class<?>... parameterTypes) {
        this.f47578a = new p1(classLoader, enclosingClassNames, nestedClassName);
        this.f47579b = new j1(classLoader, nestedClassName, methodName, parameterTypes);
    }

    public r1(List<Class<?>> enclosingClasses, Class<?> nestedClass, String methodName, String parameterTypeNames) {
        this.f47578a = new p1(enclosingClasses, nestedClass);
        this.f47579b = new j1(nestedClass, methodName, parameterTypeNames);
    }

    public r1(List<Class<?>> enclosingClasses, Class<?> nestedClass, String methodName, Class<?>... parameterTypes) {
        this.f47578a = new p1(enclosingClasses, nestedClass);
        this.f47579b = new j1(nestedClass, methodName, parameterTypes);
    }

    public r1(List<Class<?>> enclosingClasses, Class<?> nestedClass, Method method) {
        this.f47578a = new p1(enclosingClasses, nestedClass);
        this.f47579b = new j1(nestedClass, method);
    }
}
