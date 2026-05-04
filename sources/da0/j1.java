package da0;

import ba0.g4;
import com.vivo.push.PushClientConstants;
import da0.k;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apiguardian.api.API;
import org.junit.platform.commons.PreconditionViolationException;
import org.junit.platform.commons.util.ReflectionUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public class j1 implements ca0.l {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f47543a;

    /* renamed from: b, reason: collision with root package name */
    public final String f47544b;

    /* renamed from: c, reason: collision with root package name */
    public final String f47545c;

    /* renamed from: d, reason: collision with root package name */
    public final String f47546d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Class<?> f47547e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Method f47548f;

    /* renamed from: g, reason: collision with root package name */
    public volatile Class<?>[] f47549g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @API(since = "1.11", status = API.Status.INTERNAL)
    public static class a implements k {

        /* renamed from: a, reason: collision with root package name */
        public static final String f47550a = "method";

        @Override // da0.k
        public Optional<j1> a(ca0.o identifier, k.a context) {
            return Optional.of(x.B(identifier.e()));
        }

        @Override // da0.k
        public String getPrefix() {
            return "method";
        }
    }

    public j1(ClassLoader classLoader, String className, String methodName, String parameterTypeNames) {
        this.f47543a = classLoader;
        this.f47544b = className;
        this.f47545c = methodName;
        this.f47546d = parameterTypeNames;
    }

    public static /* synthetic */ PreconditionViolationException b(j1 j1Var) {
        j1Var.getClass();
        return new PreconditionViolationException(String.format("Could not find method with name [%s] and parameter types [%s] in class [%s].", j1Var.f47545c, j1Var.f47546d, j1Var.f47547e.getName()));
    }

    public static /* synthetic */ PreconditionViolationException c(j1 j1Var) {
        j1Var.getClass();
        return new PreconditionViolationException(String.format("Could not find method with name [%s] in class [%s].", j1Var.f47545c, j1Var.f47547e.getName()));
    }

    public static /* synthetic */ PreconditionViolationException d(j1 j1Var, Exception exc) {
        j1Var.getClass();
        return new PreconditionViolationException("Could not load class with name: " + j1Var.f47544b, exc);
    }

    @Override // ca0.l
    public Optional<ca0.o> a() {
        return Optional.of(ca0.o.c("method", ReflectionUtils.y0(this.f47544b, this.f47545c, this.f47546d)));
    }

    @API(since = "1.10", status = API.Status.EXPERIMENTAL)
    public ClassLoader e() {
        return this.f47543a;
    }

    @API(since = "1.3", status = API.Status.STABLE)
    public boolean equals(Object o11) {
        if (this == o11) {
            return true;
        }
        if (o11 != null && getClass() == o11.getClass()) {
            j1 j1Var = (j1) o11;
            if (Objects.equals(this.f47544b, j1Var.f47544b) && Objects.equals(this.f47545c, j1Var.f47545c) && Objects.equals(this.f47546d, j1Var.f47546d)) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return this.f47544b;
    }

    public Class<?> g() {
        m();
        return this.f47547e;
    }

    public Method h() {
        n();
        return this.f47548f;
    }

    @API(since = "1.3", status = API.Status.STABLE)
    public int hashCode() {
        return Objects.hash(this.f47544b, this.f47545c, this.f47546d);
    }

    public String i() {
        return this.f47545c;
    }

    @API(since = "1.10", status = API.Status.DEPRECATED)
    @Deprecated
    public String j() {
        return k();
    }

    @API(since = "1.10", status = API.Status.STABLE)
    public String k() {
        return this.f47546d;
    }

    @API(since = "1.10", status = API.Status.EXPERIMENTAL)
    public Class<?>[] l() {
        o();
        return (Class[]) this.f47549g.clone();
    }

    public final void m() {
        if (this.f47547e == null) {
            ClassLoader classLoader = this.f47543a;
            this.f47547e = (classLoader == null ? ReflectionUtils.X1(this.f47544b) : ReflectionUtils.Y1(this.f47544b, classLoader)).j(new Function() { // from class: da0.h1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return j1.d(j1.this, (Exception) obj);
                }
            });
        }
    }

    public final void n() {
        if (this.f47548f == null) {
            m();
            o();
            if (this.f47549g.length > 0) {
                this.f47548f = ReflectionUtils.i0(this.f47547e, this.f47545c, this.f47549g).orElseThrow(new Supplier() { // from class: da0.d1
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return j1.b(j1.this);
                    }
                });
            } else {
                this.f47548f = ReflectionUtils.i0(this.f47547e, this.f47545c, new Class[0]).orElseThrow(new Supplier() { // from class: da0.e1
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return j1.c(j1.this);
                    }
                });
            }
        }
    }

    public final void o() {
        if (this.f47549g == null) {
            m();
            this.f47549g = ReflectionUtils.G1(this.f47547e, this.f47545c, this.f47546d);
        }
    }

    public String toString() {
        return new g4(this).a(PushClientConstants.TAG_CLASS_NAME, f()).a("methodName", i()).a("parameterTypes", k()).a("classLoader", e()).toString();
    }

    public j1(Class<?> javaClass, String methodName, String parameterTypeNames) {
        this.f47543a = javaClass.getClassLoader();
        this.f47547e = javaClass;
        this.f47544b = javaClass.getName();
        this.f47545c = methodName;
        this.f47546d = parameterTypeNames;
    }

    public j1(ClassLoader classLoader, String className, String methodName, Class<?>... parameterTypes) {
        this.f47543a = classLoader;
        this.f47544b = className;
        this.f47545c = methodName;
        this.f47549g = (Class[]) parameterTypes.clone();
        this.f47546d = ba0.y.c(new Function() { // from class: da0.f1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String typeName;
                typeName = ((Class) obj).getTypeName();
                return typeName;
            }
        }, this.f47549g);
    }

    public j1(Class<?> javaClass, String methodName, Class<?>... parameterTypes) {
        this.f47543a = javaClass.getClassLoader();
        this.f47547e = javaClass;
        this.f47544b = javaClass.getName();
        this.f47545c = methodName;
        this.f47549g = (Class[]) parameterTypes.clone();
        this.f47546d = ba0.y.c(new Function() { // from class: da0.i1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String typeName;
                typeName = ((Class) obj).getTypeName();
                return typeName;
            }
        }, this.f47549g);
    }

    public j1(Class<?> javaClass, Method method) {
        this.f47543a = javaClass.getClassLoader();
        this.f47547e = javaClass;
        this.f47544b = javaClass.getName();
        this.f47548f = method;
        this.f47545c = method.getName();
        this.f47549g = method.getParameterTypes();
        this.f47546d = ba0.y.c(new Function() { // from class: da0.g1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String typeName;
                typeName = ((Class) obj).getTypeName();
                return typeName;
            }
        }, this.f47549g);
    }
}
