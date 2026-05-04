package fy;

import a00.a0;
import a00.i0;
import a00.k1;
import g10.u;
import io.ktor.server.engine.internal.ReloadingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import kotlin.reflect.KParameter;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCallableUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallableUtils.kt\nio/ktor/server/engine/internal/CallableUtilsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,127:1\n3829#2:128\n4344#2,2:129\n1611#3,9:131\n1863#3:140\n1864#3:142\n1620#3:143\n774#3:144\n865#3,2:145\n2632#3,3:147\n774#3:150\n865#3,2:151\n774#3:153\n865#3:154\n1734#3,3:155\n866#3:158\n827#3:159\n855#3,2:160\n1216#3,2:162\n1246#3,4:164\n1#4:141\n*S KotlinDebug\n*F\n+ 1 CallableUtils.kt\nio/ktor/server/engine/internal/CallableUtilsKt\n*L\n30#1:128\n30#1:129,2\n31#1:131,9\n31#1:140\n31#1:142\n31#1:143\n32#1:144\n32#1:145,2\n35#1:147,3\n62#1:150\n62#1:151,2\n79#1:153\n79#1:154\n80#1:155,3\n79#1:158\n94#1:159\n94#1:160,2\n94#1:162,2\n94#1:164,4\n31#1:141\n*E\n"})
/* loaded from: classes8.dex */
public final class j {
    public static final <R> R a(Object obj, h10.i<? extends R> iVar, zx.a aVar) {
        Object obj2;
        List<KParameter> parameters = iVar.getParameters();
        ArrayList<KParameter> arrayList = new ArrayList();
        for (Object obj3 : parameters) {
            if (!((KParameter) obj3).isOptional()) {
                arrayList.add(obj3);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(k1.j(i0.d0(arrayList, 10)), 16));
        for (KParameter kParameter : arrayList) {
            if (kParameter.getKind() == KParameter.Kind.INSTANCE) {
                obj2 = obj;
            } else if (h.n(kParameter)) {
                obj2 = aVar.a();
            } else {
                if (!h.m(kParameter)) {
                    if (!k0.n3(kParameter.getType().toString(), "Application", false, 2, null)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Parameter type '");
                        sb2.append(kParameter.getType());
                        sb2.append("' of parameter '");
                        String name = kParameter.getName();
                        if (name == null) {
                            name = "<receiver>";
                        }
                        sb2.append(name);
                        sb2.append("' is not supported");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    Type i11 = j10.e.i(kParameter.getType());
                    Class cls = i11 instanceof Class ? (Class) i11 : null;
                    throw new IllegalArgumentException("Parameter type " + kParameter.getType() + ":{" + (cls != null ? cls.getClassLoader() : null) + "} is not supported.Application is loaded as " + h.h() + ":{" + h.h().getClassLoader() + l50.b.f69928j);
                }
                obj2 = aVar;
            }
            linkedHashMap.put(kParameter, obj2);
        }
        try {
            return iVar.callBy(linkedHashMap);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause == null) {
                throw e11;
            }
            throw cause;
        }
    }

    public static final Object b(h10.d<?> dVar, zx.a aVar) {
        Object z11 = dVar.z();
        if (z11 != null) {
            return z11;
        }
        Collection<h10.i<?>> f11 = dVar.f();
        ArrayList arrayList = new ArrayList();
        for (Object obj : f11) {
            List<KParameter> parameters = ((h10.i) obj).getParameters();
            if (!(parameters instanceof Collection) || !parameters.isEmpty()) {
                for (KParameter kParameter : parameters) {
                    if (kParameter.isOptional() || h.n(kParameter) || h.m(kParameter)) {
                    }
                }
            }
            arrayList.add(obj);
        }
        h10.i d11 = h.d(arrayList);
        if (d11 != null) {
            return a(null, d11, aVar);
        }
        throw new RuntimeException("There are no applicable constructors found in class " + dVar);
    }

    public static final void c(@m80.k ClassLoader classLoader, @m80.k String fqName, @m80.k zx.a application) {
        int parameterCount;
        g0.p(classLoader, "classLoader");
        g0.p(fqName, "fqName");
        g0.p(application, "application");
        char[] charArray = ".#".toCharArray();
        g0.o(charArray, "toCharArray(...)");
        int c42 = k0.c4(fqName, charArray, 0, false, 6, null);
        if (c42 == -1) {
            throw new ReloadingException("Module function cannot be found for the fully qualified name '" + fqName + '\'');
        }
        String substring = fqName.substring(0, c42);
        g0.o(substring, "substring(...)");
        String substring2 = fqName.substring(c42 + 1);
        g0.o(substring2, "substring(...)");
        Class<?> p11 = h.p(classLoader, substring);
        if (p11 == null) {
            throw new ReloadingException("Module function cannot be found for the fully qualified name '" + fqName + '\'');
        }
        Method[] methods = p11.getMethods();
        g0.o(methods, "getMethods(...)");
        ArrayList<Method> arrayList = new ArrayList();
        for (Method method : methods) {
            if (g0.g(method.getName(), substring2) && Modifier.isStatic(method.getModifiers())) {
                arrayList.add(method);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Method method2 : arrayList) {
            g0.m(method2);
            h10.i<?> l11 = j10.e.l(method2);
            if (l11 != null) {
                arrayList2.add(l11);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (h.l((h10.i) obj)) {
                arrayList3.add(obj);
            }
        }
        h10.i d11 = h.d(arrayList3);
        if (d11 != null) {
            List<KParameter> parameters = d11.getParameters();
            if (!(parameters instanceof Collection) || !parameters.isEmpty()) {
                Iterator<T> it = parameters.iterator();
                while (it.hasNext()) {
                    if (((KParameter) it.next()).getKind() != KParameter.Kind.INSTANCE) {
                    }
                }
            }
            a(null, d11, application);
            return;
        }
        try {
            if (x00.l.class.isAssignableFrom(p11)) {
                Constructor<?>[] declaredConstructors = p11.getDeclaredConstructors();
                g0.o(declaredConstructors, "getDeclaredConstructors(...)");
                Constructor constructor = (Constructor) a0.At(declaredConstructors);
                parameterCount = constructor.getParameterCount();
                if (parameterCount == 0) {
                    constructor.setAccessible(true);
                    Object newInstance = constructor.newInstance(null);
                    g0.n(newInstance, "null cannot be cast to non-null type kotlin.Function1<io.ktor.server.application.Application, kotlin.Unit>");
                    ((x00.l) x0.q(newInstance, 1)).invoke(application);
                    return;
                }
                throw new ReloadingException("Module function with captured variables cannot be instantiated '" + fqName + '\'');
            }
        } catch (NoSuchMethodError unused) {
        }
        h10.d<?> q11 = h.q(p11);
        if (q11 == null) {
            throw new ReloadingException("Module function cannot be found for the fully qualified name '" + fqName + '\'');
        }
        Collection<h10.i<?>> E = i10.h.E(q11);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : E) {
            h10.i iVar = (h10.i) obj2;
            if (g0.g(iVar.getName(), substring2) && h.l(iVar)) {
                arrayList4.add(obj2);
            }
        }
        h10.i d12 = h.d(arrayList4);
        if (d12 != null) {
            a(b(q11, application), d12, application);
            return;
        }
        throw new ClassNotFoundException("Module function cannot be found for the fully qualified name '" + fqName + '\'');
    }
}
