package o80;

import ba0.c2;
import ba0.e4;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import org.junit.jupiter.api.a2;
import org.junit.platform.commons.JUnitException;
import org.junit.platform.commons.util.ReflectionUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class s1<A extends Annotation> implements p80.k {

    /* renamed from: a, reason: collision with root package name */
    public final Class<A> f76601a;

    /* renamed from: b, reason: collision with root package name */
    public final Function<A, String> f76602b;

    /* renamed from: c, reason: collision with root package name */
    public final Function<A, String> f76603c;

    public s1(Class<A> annotationType, Function<A, String> methodName, Function<A, String> customDisabledReason) {
        this.f76601a = annotationType;
        this.f76602b = methodName;
        this.f76603c = customDisabledReason;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ p80.h O(s1 s1Var, Optional optional, Boolean bool) {
        s1Var.getClass();
        return s1Var.V(bool.booleanValue(), (Annotation) optional.get());
    }

    public static /* synthetic */ JUnitException R(String str, Exception exc) {
        return new JUnitException(String.format("Could not load class [%s]", str), exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public p80.h W() {
        return p80.h.c(String.format("@%s is not present", this.f76601a.getSimpleName()));
    }

    public final boolean U(Method method) {
        int a11 = a2.a(method);
        return a11 == 0 || (a11 == 1 && method.getParameterTypes()[0] == p80.n.class);
    }

    public final p80.h V(final boolean methodResult, final A annotation) {
        Supplier supplier = new Supplier() { // from class: o80.k1
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format("@%s(\"%s\") evaluated to %s", r0.f76601a.getSimpleName(), s1.this.f76602b.apply(annotation), Boolean.valueOf(methodResult));
                return format;
            }
        };
        if (a0(methodResult)) {
            return p80.h.c((String) supplier.get());
        }
        String apply = this.f76603c.apply(annotation);
        return e4.h(apply) ? p80.h.a(apply) : p80.h.a((String) supplier.get());
    }

    public final Method X(final Class<?> clazz, final String methodName) {
        return ReflectionUtils.i0(clazz, methodName, new Class[0]).orElseGet(new Supplier() { // from class: o80.j1
            @Override // java.util.function.Supplier
            public final Object get() {
                Method F0;
                F0 = ReflectionUtils.F0(clazz, methodName, p80.n.class);
                return F0;
            }
        });
    }

    public Method Y(String fullyQualifiedMethodName, p80.n context) {
        Class<?> Z = context.Z();
        if (!fullyQualifiedMethodName.contains("#")) {
            return X(Z, fullyQualifiedMethodName);
        }
        String[] A1 = ReflectionUtils.A1(fullyQualifiedMethodName);
        final String str = A1[0];
        return X(ReflectionUtils.Y1(str, ba0.m.a(Z)).j(new Function() { // from class: o80.l1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return s1.R(str, (Exception) obj);
            }
        }), A1[1]);
    }

    public final boolean Z(final Method method, p80.n context) {
        c2.f(method.getReturnType() == Boolean.TYPE, new Supplier() { // from class: o80.q1
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format("Method [%s] must return a boolean", method);
                return format;
            }
        });
        c2.f(U(method), new Supplier() { // from class: o80.r1
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format("Method [%s] must accept either an ExtensionContext or no arguments", method);
                return format;
            }
        });
        Object orElse = context.E().orElse(null);
        return a2.a(method) == 0 ? ((Boolean) ReflectionUtils.L0(method, orElse, new Object[0])).booleanValue() : ((Boolean) ReflectionUtils.L0(method, orElse, context)).booleanValue();
    }

    public abstract boolean a0(boolean methodResult);

    @Override // p80.k
    public p80.h h(final p80.n context) {
        final Optional p11 = org.junit.platform.commons.util.a.p(context.e(), this.f76601a);
        return (p80.h) p11.map(this.f76602b).map(new Function() { // from class: o80.m1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Method Y;
                Y = s1.this.Y((String) obj, context);
                return Y;
            }
        }).map(new Function() { // from class: o80.n1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(s1.this.Z((Method) obj, context));
                return valueOf;
            }
        }).map(new Function() { // from class: o80.o1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return s1.O(s1.this, p11, (Boolean) obj);
            }
        }).orElseGet(new Supplier() { // from class: o80.p1
            @Override // java.util.function.Supplier
            public final Object get() {
                p80.h W;
                W = s1.this.W();
                return W;
            }
        });
    }
}
