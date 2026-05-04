package j10;

import h10.h;
import h10.i;
import h10.n;
import h10.r;
import h10.y;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import k10.q2;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.p;
import m80.k;
import m80.l;
import u10.f;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "ReflectJvmMapping")
@u0({"SMAP\nReflectJvmMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJvmMapping.kt\nkotlin/reflect/jvm/ReflectJvmMapping\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,179:1\n1#2:180\n295#3,2:181\n*S KotlinDebug\n*F\n+ 1 ReflectJvmMapping.kt\nkotlin/reflect/jvm/ReflectJvmMapping\n*L\n177#1:181,2\n*E\n"})
/* loaded from: classes8.dex */
public final class e {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f63128a;

        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            try {
                iArr[KotlinClassHeader.Kind.FILE_FACADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS_PART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f63128a = iArr;
        }
    }

    public static final i<?> a(Collection<? extends h10.c<?>> collection, Method method) {
        for (h10.c<?> cVar : collection) {
            if (cVar instanceof i) {
                i<?> iVar = (i) cVar;
                if (g0.g(iVar.getName(), method.getName()) && g0.g(g(iVar), method)) {
                    return iVar;
                }
            }
        }
        for (h10.c<?> cVar2 : collection) {
            if (cVar2 instanceof i) {
                i<?> iVar2 = (i) cVar2;
                if (!g0.g(iVar2.getName(), method.getName()) && g0.g(g(iVar2), method)) {
                    return iVar2;
                }
            }
        }
        return null;
    }

    public static final n<?> b(Collection<? extends h10.c<?>> collection, Field field) {
        for (h10.c<?> cVar : collection) {
            if (cVar instanceof n) {
                n<?> nVar = (n) cVar;
                if (g0.g(nVar.getName(), field.getName()) && g0.g(e(nVar), field)) {
                    return nVar;
                }
            }
        }
        for (h10.c<?> cVar2 : collection) {
            if (cVar2 instanceof n) {
                n<?> nVar2 = (n) cVar2;
                if (!g0.g(nVar2.getName(), field.getName()) && g0.g(e(nVar2), field)) {
                    return nVar2;
                }
            }
        }
        return null;
    }

    @l
    public static final <T> Constructor<T> c(@k i<? extends T> iVar) {
        kotlin.reflect.jvm.internal.calls.a<?> U;
        g0.p(iVar, "<this>");
        kotlin.reflect.jvm.internal.e<?> b11 = q2.b(iVar);
        Object b12 = (b11 == null || (U = b11.U()) == null) ? null : U.b();
        if (b12 instanceof Constructor) {
            return (Constructor) b12;
        }
        return null;
    }

    @l
    public static final Field e(@k n<?> nVar) {
        g0.p(nVar, "<this>");
        p<?> d11 = q2.d(nVar);
        if (d11 != null) {
            return d11.m0();
        }
        return null;
    }

    @l
    public static final Method f(@k n<?> nVar) {
        g0.p(nVar, "<this>");
        return g(nVar.l0());
    }

    @l
    public static final Method g(@k i<?> iVar) {
        kotlin.reflect.jvm.internal.calls.a<?> U;
        g0.p(iVar, "<this>");
        kotlin.reflect.jvm.internal.e<?> b11 = q2.b(iVar);
        Object b12 = (b11 == null || (U = b11.U()) == null) ? null : U.b();
        if (b12 instanceof Method) {
            return (Method) b12;
        }
        return null;
    }

    @l
    public static final Method h(@k h10.j<?> jVar) {
        g0.p(jVar, "<this>");
        return g(jVar.getSetter());
    }

    @k
    public static final Type i(@k r rVar) {
        g0.p(rVar, "<this>");
        Type d11 = ((kotlin.reflect.jvm.internal.r) rVar).d();
        return d11 == null ? y.f(rVar) : d11;
    }

    public static final h j(Member member) {
        KotlinClassHeader b11;
        f.a aVar = u10.f.f91513c;
        Class<?> declaringClass = member.getDeclaringClass();
        g0.o(declaringClass, "getDeclaringClass(...)");
        u10.f a11 = aVar.a(declaringClass);
        KotlinClassHeader.Kind c11 = (a11 == null || (b11 = a11.b()) == null) ? null : b11.c();
        int i11 = c11 == null ? -1 : a.f63128a[c11.ordinal()];
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            return null;
        }
        Class<?> declaringClass2 = member.getDeclaringClass();
        g0.o(declaringClass2, "getDeclaringClass(...)");
        return new kotlin.reflect.jvm.internal.k(declaringClass2);
    }

    @l
    public static final <T> i<T> k(@k Constructor<T> constructor) {
        T t11;
        g0.p(constructor, "<this>");
        Class<T> declaringClass = constructor.getDeclaringClass();
        g0.o(declaringClass, "getDeclaringClass(...)");
        Iterator<T> it = w00.b.i(declaringClass).f().iterator();
        while (true) {
            if (!it.hasNext()) {
                t11 = null;
                break;
            }
            t11 = it.next();
            if (g0.g(c((i) t11), constructor)) {
                break;
            }
        }
        return (i) t11;
    }

    @l
    public static final i<?> l(@k Method method) {
        i<?> a11;
        g0.p(method, "<this>");
        if (Modifier.isStatic(method.getModifiers())) {
            h j11 = j(method);
            if (j11 != null) {
                return a(j11.q(), method);
            }
            Class<?> declaringClass = method.getDeclaringClass();
            g0.o(declaringClass, "getDeclaringClass(...)");
            h10.d<?> m11 = i10.h.m(w00.b.i(declaringClass));
            if (m11 != null) {
                Class d11 = w00.b.d(m11);
                String name = method.getName();
                g0.o(name, "getName(...)");
                Class<?>[] parameterTypes = method.getParameterTypes();
                Method j12 = q2.j(d11, name, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
                if (j12 != null && (a11 = a(i10.h.E(m11), j12)) != null) {
                    return a11;
                }
            }
        }
        Class<?> declaringClass2 = method.getDeclaringClass();
        g0.o(declaringClass2, "getDeclaringClass(...)");
        return a(i10.h.E(w00.b.i(declaringClass2)), method);
    }

    @l
    public static final n<?> m(@k Field field) {
        n<?> b11;
        g0.p(field, "<this>");
        if (field.isSynthetic()) {
            return null;
        }
        if (Modifier.isStatic(field.getModifiers())) {
            h j11 = j(field);
            if (j11 != null) {
                return b(j11.q(), field);
            }
            Class<?> declaringClass = field.getDeclaringClass();
            g0.o(declaringClass, "getDeclaringClass(...)");
            h10.d<?> m11 = i10.h.m(w00.b.i(declaringClass));
            if (m11 != null) {
                Class<?> declaringClass2 = field.getDeclaringClass();
                g0.o(declaringClass2, "getDeclaringClass(...)");
                String name = field.getName();
                g0.o(name, "getName(...)");
                Field i11 = q2.i(declaringClass2, name);
                if (i11 != null && (b11 = b(i10.h.M(m11), i11)) != null) {
                    return b11;
                }
            }
        }
        Class<?> declaringClass3 = field.getDeclaringClass();
        g0.o(declaringClass3, "getDeclaringClass(...)");
        return b(i10.h.M(w00.b.i(declaringClass3)), field);
    }

    public static /* synthetic */ void d(i iVar) {
    }
}
