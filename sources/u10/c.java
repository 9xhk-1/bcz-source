package u10;

import a00.a0;
import h20.x;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import n10.o;
import n20.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final c f91511a = new c();

    public final s20.f a(Class<?> cls) {
        int i11 = 0;
        while (cls.isArray()) {
            i11++;
            cls = cls.getComponentType();
        }
        if (!cls.isPrimitive()) {
            n20.b e11 = v10.f.e(cls);
            n20.b m11 = o10.a.f75522a.m(e11.a());
            if (m11 != null) {
                e11 = m11;
            }
            return new s20.f(e11, i11);
        }
        if (!g0.g(cls, Void.TYPE)) {
            PrimitiveType primitiveType = JvmPrimitiveType.get(cls.getName()).getPrimitiveType();
            g0.o(primitiveType, "getPrimitiveType(...)");
            return i11 > 0 ? new s20.f(n20.b.f74280d.c(primitiveType.getArrayTypeFqName()), i11 - 1) : new s20.f(n20.b.f74280d.c(primitiveType.getTypeFqName()), i11);
        }
        b.a aVar = n20.b.f74280d;
        n20.c l11 = o.a.f74039f.l();
        g0.o(l11, "toSafe(...)");
        return new s20.f(aVar.c(l11), i11);
    }

    public final void b(@m80.k Class<?> klass, @m80.k x.c visitor) {
        g0.p(klass, "klass");
        g0.p(visitor, "visitor");
        Iterator a11 = kotlin.jvm.internal.h.a(klass.getDeclaredAnnotations());
        while (a11.hasNext()) {
            Annotation annotation = (Annotation) a11.next();
            g0.m(annotation);
            f(visitor, annotation);
        }
        visitor.a();
    }

    public final void c(Class<?> cls, x.d dVar) {
        Iterator a11 = kotlin.jvm.internal.h.a(cls.getDeclaredConstructors());
        while (a11.hasNext()) {
            Constructor<?> constructor = (Constructor) a11.next();
            n20.f fVar = n20.h.f74309j;
            m mVar = m.f91525a;
            g0.m(constructor);
            x.e b11 = dVar.b(fVar, mVar.a(constructor));
            if (b11 != null) {
                Iterator a12 = kotlin.jvm.internal.h.a(constructor.getDeclaredAnnotations());
                while (a12.hasNext()) {
                    Annotation annotation = (Annotation) a12.next();
                    g0.m(annotation);
                    f(b11, annotation);
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                g0.m(parameterAnnotations);
                if (!(parameterAnnotations.length == 0)) {
                    int length = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length2 = parameterAnnotations.length;
                    for (int i11 = 0; i11 < length2; i11++) {
                        Iterator a13 = kotlin.jvm.internal.h.a(parameterAnnotations[i11]);
                        while (a13.hasNext()) {
                            Annotation annotation2 = (Annotation) a13.next();
                            Class<?> d11 = w00.b.d(w00.b.a(annotation2));
                            n20.b e11 = v10.f.e(d11);
                            g0.m(annotation2);
                            x.a b12 = b11.b(i11 + length, e11, new b(annotation2));
                            if (b12 != null) {
                                f91511a.h(b12, annotation2, d11);
                            }
                        }
                    }
                }
                b11.a();
            }
        }
    }

    public final void d(Class<?> cls, x.d dVar) {
        Iterator a11 = kotlin.jvm.internal.h.a(cls.getDeclaredFields());
        while (a11.hasNext()) {
            Field field = (Field) a11.next();
            n20.f f11 = n20.f.f(field.getName());
            g0.o(f11, "identifier(...)");
            m mVar = m.f91525a;
            g0.m(field);
            x.c a12 = dVar.a(f11, mVar.b(field), null);
            if (a12 != null) {
                Iterator a13 = kotlin.jvm.internal.h.a(field.getDeclaredAnnotations());
                while (a13.hasNext()) {
                    Annotation annotation = (Annotation) a13.next();
                    g0.m(annotation);
                    f(a12, annotation);
                }
                a12.a();
            }
        }
    }

    public final void e(Class<?> cls, x.d dVar) {
        Iterator a11 = kotlin.jvm.internal.h.a(cls.getDeclaredMethods());
        while (a11.hasNext()) {
            Method method = (Method) a11.next();
            n20.f f11 = n20.f.f(method.getName());
            g0.o(f11, "identifier(...)");
            m mVar = m.f91525a;
            g0.m(method);
            x.e b11 = dVar.b(f11, mVar.c(method));
            if (b11 != null) {
                Iterator a12 = kotlin.jvm.internal.h.a(method.getDeclaredAnnotations());
                while (a12.hasNext()) {
                    Annotation annotation = (Annotation) a12.next();
                    g0.m(annotation);
                    f(b11, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                g0.o(parameterAnnotations, "getParameterAnnotations(...)");
                Annotation[][] annotationArr = parameterAnnotations;
                int length = annotationArr.length;
                for (int i11 = 0; i11 < length; i11++) {
                    Iterator a13 = kotlin.jvm.internal.h.a(annotationArr[i11]);
                    while (a13.hasNext()) {
                        Annotation annotation2 = (Annotation) a13.next();
                        Class<?> d11 = w00.b.d(w00.b.a(annotation2));
                        n20.b e11 = v10.f.e(d11);
                        g0.m(annotation2);
                        x.a b12 = b11.b(i11, e11, new b(annotation2));
                        if (b12 != null) {
                            f91511a.h(b12, annotation2, d11);
                        }
                    }
                }
                b11.a();
            }
        }
    }

    public final void f(x.c cVar, Annotation annotation) {
        Class<?> d11 = w00.b.d(w00.b.a(annotation));
        x.a c11 = cVar.c(v10.f.e(d11), new b(annotation));
        if (c11 != null) {
            f91511a.h(c11, annotation, d11);
        }
    }

    public final void g(x.a aVar, n20.f fVar, Object obj) {
        Set set;
        Class<?> cls = obj.getClass();
        if (g0.g(cls, Class.class)) {
            g0.n(obj, "null cannot be cast to non-null type java.lang.Class<*>");
            aVar.b(fVar, a((Class) obj));
            return;
        }
        set = i.f91518a;
        if (set.contains(cls)) {
            aVar.f(fVar, obj);
            return;
        }
        if (v10.f.l(cls)) {
            if (!cls.isEnum()) {
                cls = cls.getEnclosingClass();
            }
            g0.m(cls);
            n20.b e11 = v10.f.e(cls);
            g0.n(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
            n20.f f11 = n20.f.f(((Enum) obj).name());
            g0.o(f11, "identifier(...)");
            aVar.e(fVar, e11, f11);
            return;
        }
        if (Annotation.class.isAssignableFrom(cls)) {
            Class<?>[] interfaces = cls.getInterfaces();
            g0.o(interfaces, "getInterfaces(...)");
            Class<?> cls2 = (Class) a0.At(interfaces);
            g0.m(cls2);
            x.a d11 = aVar.d(fVar, v10.f.e(cls2));
            if (d11 == null) {
                return;
            }
            g0.n(obj, "null cannot be cast to non-null type kotlin.Annotation");
            h(d11, (Annotation) obj, cls2);
            return;
        }
        if (!cls.isArray()) {
            throw new UnsupportedOperationException("Unsupported annotation argument value (" + cls + "): " + obj);
        }
        x.b c11 = aVar.c(fVar);
        if (c11 == null) {
            return;
        }
        Class<?> componentType = cls.getComponentType();
        int i11 = 0;
        if (componentType.isEnum()) {
            g0.m(componentType);
            n20.b e12 = v10.f.e(componentType);
            g0.n(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            while (i11 < length) {
                Object obj2 = objArr[i11];
                g0.n(obj2, "null cannot be cast to non-null type kotlin.Enum<*>");
                n20.f f12 = n20.f.f(((Enum) obj2).name());
                g0.o(f12, "identifier(...)");
                c11.e(e12, f12);
                i11++;
            }
        } else if (g0.g(componentType, Class.class)) {
            g0.n(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr2 = (Object[]) obj;
            int length2 = objArr2.length;
            while (i11 < length2) {
                Object obj3 = objArr2[i11];
                g0.n(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                c11.b(a((Class) obj3));
                i11++;
            }
        } else if (Annotation.class.isAssignableFrom(componentType)) {
            g0.n(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr3 = (Object[]) obj;
            int length3 = objArr3.length;
            while (i11 < length3) {
                Object obj4 = objArr3[i11];
                g0.m(componentType);
                x.a d12 = c11.d(v10.f.e(componentType));
                if (d12 != null) {
                    g0.n(obj4, "null cannot be cast to non-null type kotlin.Annotation");
                    h(d12, (Annotation) obj4, componentType);
                }
                i11++;
            }
        } else {
            g0.n(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr4 = (Object[]) obj;
            int length4 = objArr4.length;
            while (i11 < length4) {
                c11.c(objArr4[i11]);
                i11++;
            }
        }
        c11.a();
    }

    public final void h(x.a aVar, Annotation annotation, Class<?> cls) {
        Iterator a11 = kotlin.jvm.internal.h.a(cls.getDeclaredMethods());
        while (a11.hasNext()) {
            Method method = (Method) a11.next();
            try {
                Object invoke = method.invoke(annotation, null);
                g0.m(invoke);
                n20.f f11 = n20.f.f(method.getName());
                g0.o(f11, "identifier(...)");
                g(aVar, f11, invoke);
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.a();
    }

    public final void i(@m80.k Class<?> klass, @m80.k x.d memberVisitor) {
        g0.p(klass, "klass");
        g0.p(memberVisitor, "memberVisitor");
        e(klass, memberVisitor);
        c(klass, memberVisitor);
        d(klass, memberVisitor);
    }
}
