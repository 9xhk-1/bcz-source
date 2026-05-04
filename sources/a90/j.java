package a90;

import ba0.e4;
import java.lang.reflect.Field;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.junit.jupiter.api.extension.ExtensionConfigurationException;
import org.junit.platform.commons.util.ReflectionUtils;
import org.junit.platform.engine.support.hierarchical.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class j implements p80.e0, p80.a {

    /* renamed from: a, reason: collision with root package name */
    public static final y90.e f2394a = y90.g.c(j.class);

    public static /* synthetic */ boolean O(Throwable th2) {
        return false;
    }

    public static /* synthetic */ ExtensionConfigurationException P(Field field, Class cls, String str) {
        return new ExtensionConfigurationException(String.format("Cannot @AutoClose field %s because %s does not define method %s().", W(field), cls.getName(), str));
    }

    public static /* synthetic */ boolean R(Throwable th2) {
        return false;
    }

    public static void T(boolean condition, final String messageFormat, final Field field) {
        ba0.c2.f(condition, new Supplier() { // from class: a90.b
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format(messageFormat, j.W(field));
                return format;
            }
        });
    }

    public static void U(final Field field, Object testInstance) throws Exception {
        String value = ((org.junit.jupiter.api.a1) org.junit.platform.commons.util.a.m(field, org.junit.jupiter.api.a1.class).get()).value();
        Class<?> type = field.getType();
        T(e4.h(value), "@AutoClose on field %s must specify a method name.", field);
        T(!type.isPrimitive(), "@AutoClose is not supported on primitive field %s.", field);
        T(!type.isArray(), "@AutoClose is not supported on array field %s.", field);
        Object i11 = ReflectionUtils.b2(field, testInstance).i();
        if (i11 == null) {
            f2394a.f(new Supplier() { // from class: a90.f
                @Override // java.util.function.Supplier
                public final Object get() {
                    String format;
                    format = String.format("Cannot @AutoClose field %s because it is null.", j.W(field));
                    return format;
                }
            });
        } else {
            X(field, i11, value.trim());
        }
    }

    public static void V(Class<?> testClass, final Object testInstance, final org.junit.platform.engine.support.hierarchical.m throwableCollector) {
        org.junit.platform.commons.util.a.j(testClass, org.junit.jupiter.api.a1.class, testInstance == null ? new w80.d2() : new w80.z1(), ReflectionUtils.HierarchyTraversalMode.BOTTOM_UP).forEach(new Consumer() { // from class: a90.h
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                org.junit.platform.engine.support.hierarchical.m.this.c(new m.a() { // from class: a90.g
                    @Override // org.junit.platform.engine.support.hierarchical.m.a
                    public final void execute() {
                        j.U(r1, r2);
                    }
                });
            }
        });
    }

    public static String W(Field field) {
        String canonicalName = field.getDeclaringClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = field.getDeclaringClass().getTypeName();
        }
        return canonicalName + "." + field.getName();
    }

    public static void X(final Field field, Object target, final String methodName) throws Exception {
        if ((target instanceof AutoCloseable) && "close".equals(methodName)) {
            androidx.documentfile.provider.a.a((AutoCloseable) target);
        } else {
            final Class<?> cls = target.getClass();
            ReflectionUtils.L0(ReflectionUtils.A0(ReflectionUtils.i0(cls, methodName, new Class[0]).orElseThrow(new Supplier() { // from class: a90.i
                @Override // java.util.function.Supplier
                public final Object get() {
                    return j.P(field, cls, methodName);
                }
            }), cls), target, new Object[0]);
        }
    }

    @Override // p80.e0
    public void f(p80.n context) {
        final org.junit.platform.engine.support.hierarchical.m mVar = new org.junit.platform.engine.support.hierarchical.m(new Predicate() { // from class: a90.d
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return j.R((Throwable) obj);
            }
        });
        p80.e0.I(context, new Consumer() { // from class: a90.e
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                j.V(obj.getClass(), obj, org.junit.platform.engine.support.hierarchical.m.this);
            }
        });
        mVar.b();
    }

    @Override // p80.a
    public void g(p80.n context) {
        org.junit.platform.engine.support.hierarchical.m mVar = new org.junit.platform.engine.support.hierarchical.m(new Predicate() { // from class: a90.c
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return j.O((Throwable) obj);
            }
        });
        V(context.Z(), null, mVar);
        mVar.b();
    }
}
