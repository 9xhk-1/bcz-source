package io.ktor.server.engine;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nClassLoaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassLoaders.kt\nio/ktor/server/engine/ClassLoadersKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1557#2:79\n1628#2,3:80\n1454#2,2:83\n1557#2:85\n1628#2,3:86\n1456#2,3:89\n1053#2:92\n1368#2:93\n1454#2,5:94\n1663#2,8:99\n1310#3,2:107\n1#4:109\n*S KotlinDebug\n*F\n+ 1 ClassLoaders.kt\nio/ktor/server/engine/ClassLoadersKt\n*L\n56#1:79\n56#1:80,3\n57#1:83,2\n59#1:85\n59#1:86,3\n57#1:89,3\n60#1:92\n62#1:93\n62#1:94,5\n63#1:99,8\n67#1:107,2\n*E\n"})
/* loaded from: classes8.dex */
public final class t {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ClassLoaders.kt\nio/ktor/server/engine/ClassLoadersKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,102:1\n60#2:103\n1104#3,3:104\n*S KotlinDebug\n*F\n+ 1 ClassLoaders.kt\nio/ktor/server/engine/ClassLoadersKt\n*L\n60#1:104,3\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            String str = (String) t11;
            int i11 = 0;
            for (int i12 = 0; i12 < str.length(); i12++) {
                if (str.charAt(i12) == '/') {
                    i11++;
                }
            }
            Integer valueOf = Integer.valueOf(i11);
            String str2 = (String) t12;
            int i13 = 0;
            for (int i14 = 0; i14 < str2.length(); i14++) {
                if (str2.charAt(i14) == '/') {
                    i13++;
                }
            }
            return e00.g.l(valueOf, Integer.valueOf(i13));
        }
    }

    @m80.k
    public static final Set<URL> a(@m80.k ClassLoader classLoader) {
        Set<URL> k11;
        kotlin.jvm.internal.g0.p(classLoader, "<this>");
        ClassLoader parent = classLoader.getParent();
        if (parent == null || (k11 = a(parent)) == null) {
            k11 = a00.w1.k();
        }
        if (!(classLoader instanceof URLClassLoader)) {
            List<URL> c11 = c(classLoader);
            return c11 == null ? k11 : a00.x1.C(k11, c11);
        }
        URL[] uRLs = ((URLClassLoader) classLoader).getURLs();
        kotlin.jvm.internal.g0.o(uRLs, "getURLs(...)");
        return a00.x1.C(a00.r0.f6(a00.a0.lb(uRLs)), k11);
    }

    public static final Field b(Class<?> cls) {
        Field field;
        Field b11;
        Field[] declaredFields = cls.getDeclaredFields();
        kotlin.jvm.internal.g0.o(declaredFields, "getDeclaredFields(...)");
        int length = declaredFields.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                field = null;
                break;
            }
            field = declaredFields[i11];
            if (kotlin.jvm.internal.g0.g(field.getName(), "ucp") && kotlin.jvm.internal.g0.g(field.getType().getSimpleName(), "URLClassPath")) {
                break;
            }
            i11++;
        }
        if (field != null) {
            return field;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass == null || (b11 = b(superclass)) == null) {
            return null;
        }
        return b11;
    }

    public static final List<URL> c(ClassLoader classLoader) {
        Method method;
        try {
            try {
                Field b11 = b(classLoader.getClass());
                if (b11 == null) {
                    return null;
                }
                b11.setAccessible(true);
                Object obj = b11.get(classLoader);
                if (obj == null || (method = obj.getClass().getMethod("getURLs", null)) == null) {
                    return null;
                }
                method.setAccessible(true);
                URL[] urlArr = (URL[]) method.invoke(obj, null);
                if (urlArr != null) {
                    return a00.a0.dz(urlArr);
                }
                return null;
            } catch (Throwable unused) {
                return d(classLoader);
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static final List<URL> d(ClassLoader classLoader) {
        Iterable J;
        List<String> a11 = new s(classLoader).a();
        ArrayList<String> arrayList = new ArrayList(a00.i0.d0(a11, 10));
        Iterator<T> it = a11.iterator();
        while (it.hasNext()) {
            arrayList.add(u30.f0.y2((String) it.next(), '.', '/', false, 4, null));
        }
        HashSet hashSet = new HashSet();
        for (String str : arrayList) {
            List n52 = u30.k0.n5(str, new char[]{'/'}, false, 0, 6, null);
            g10.l lVar = new g10.l(1, n52.size());
            ArrayList arrayList2 = new ArrayList(a00.i0.d0(lVar, 10));
            Iterator<Integer> it2 = lVar.iterator();
            while (it2.hasNext()) {
                arrayList2.add(a00.r0.r3(n52.subList(0, ((a00.d1) it2).nextInt()), "/", null, null, 0, null, null, 62, null));
            }
            a00.m0.s0(hashSet, a00.r0.J4(arrayList2, str));
        }
        List J4 = a00.r0.J4(a00.r0.z5(hashSet, new a()), "");
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = J4.iterator();
        while (it3.hasNext()) {
            Enumeration<URL> resources = classLoader.getResources((String) it3.next());
            if (resources != null) {
                J = Collections.list(resources);
                kotlin.jvm.internal.g0.o(J, "list(...)");
                if (J != null) {
                    a00.m0.s0(arrayList3, J);
                }
            }
            J = a00.h0.J();
            a00.m0.s0(arrayList3, J);
        }
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            String path = ((URL) obj).getPath();
            kotlin.jvm.internal.g0.o(path, "getPath(...)");
            if (hashSet2.add(u30.k0.T5(path, PublicSuffixDatabase.f77441i, null, 2, null))) {
                arrayList4.add(obj);
            }
        }
        return arrayList4;
    }
}
