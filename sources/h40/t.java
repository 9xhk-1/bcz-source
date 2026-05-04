package h40;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nFastServiceLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastServiceLoader.kt\nkotlinx/coroutines/internal/FastServiceLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,169:1\n85#1,5:170\n85#1,5:175\n139#1,13:191\n1#2:180\n1368#3:181\n1454#3,5:182\n1557#3:187\n1628#3,3:188\n1069#4,2:204\n*S KotlinDebug\n*F\n+ 1 FastServiceLoader.kt\nkotlinx/coroutines/internal/FastServiceLoader\n*L\n62#1:170,5\n69#1:175,5\n125#1:191,13\n107#1:181\n107#1:182,5\n109#1:187\n109#1:188,3\n161#1:204,2\n*E\n"})
/* loaded from: classes8.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final t f58271a = new t();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final String f58272b = "META-INF/services/";

    public final h0 a(Class<h0> cls, String str) {
        try {
            return cls.cast(Class.forName(str, true, cls.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final <S> S b(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(null).newInstance(null));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    public final <S> List<S> c(Class<S> cls, ClassLoader classLoader) {
        try {
            return e(cls, classLoader);
        } catch (Throwable unused) {
            return a00.r0.a6(ServiceLoader.load(cls, classLoader));
        }
    }

    @m80.k
    public final List<h0> d() {
        h0 h0Var;
        if (!u.a()) {
            return c(h0.class, h0.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            h0 h0Var2 = null;
            try {
                h0Var = (h0) h0.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, h0.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
            } catch (ClassNotFoundException unused) {
                h0Var = null;
            }
            if (h0Var == null) {
                return c(h0.class, h0.class.getClassLoader());
            }
            arrayList.add(h0Var);
            try {
                h0Var2 = (h0) h0.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, h0.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
            } catch (ClassNotFoundException unused2) {
            }
            if (h0Var2 == null) {
                return arrayList;
            }
            arrayList.add(h0Var2);
            return arrayList;
        } catch (Throwable unused3) {
            return c(h0.class, h0.class.getClassLoader());
        }
    }

    @m80.k
    public final <S> List<S> e(@m80.k Class<S> cls, @m80.k ClassLoader classLoader) {
        ArrayList list = Collections.list(classLoader.getResources(f58272b + cls.getName()));
        kotlin.jvm.internal.g0.o(list, "list(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a00.m0.s0(arrayList, f58271a.f((URL) it.next()));
        }
        Set f62 = a00.r0.f6(arrayList);
        if (f62.isEmpty()) {
            throw new IllegalArgumentException("No providers were loaded with FastServiceLoader");
        }
        Set set = f62;
        ArrayList arrayList2 = new ArrayList(a00.i0.d0(set, 10));
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList2.add(f58271a.b((String) it2.next(), classLoader, cls));
        }
        return arrayList2;
    }

    public final List<String> f(URL url) {
        BufferedReader bufferedReader;
        String url2 = url.toString();
        if (!u30.f0.J2(url2, ba0.j1.f6558e, false, 2, null)) {
            bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                List<String> g11 = f58271a.g(bufferedReader);
                r00.b.a(bufferedReader, null);
                return g11;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } finally {
                }
            }
        }
        String T5 = u30.k0.T5(u30.k0.M5(url2, "jar:file:", null, 2, null), PublicSuffixDatabase.f77441i, null, 2, null);
        String M5 = u30.k0.M5(url2, ba0.j1.f6560g, null, 2, null);
        JarFile jarFile = new JarFile(T5, false);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(M5)), "UTF-8"));
            try {
                List<String> g12 = f58271a.g(bufferedReader);
                r00.b.a(bufferedReader, null);
                jarFile.close();
                return g12;
            } finally {
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                try {
                    jarFile.close();
                    throw th4;
                } catch (Throwable th5) {
                    yz.r.a(th3, th5);
                    throw th3;
                }
            }
        }
    }

    public final List<String> g(BufferedReader bufferedReader) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return a00.r0.a6(linkedHashSet);
            }
            String obj = u30.k0.b6(u30.k0.U5(readLine, "#", null, 2, null)).toString();
            for (int i11 = 0; i11 < obj.length(); i11++) {
                char charAt = obj.charAt(i11);
                if (charAt != '.' && !Character.isJavaIdentifierPart(charAt)) {
                    throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
                }
            }
            if (obj.length() > 0) {
                linkedHashSet.add(obj);
            }
        }
    }

    public final <R> R h(JarFile jarFile, x00.l<? super JarFile, ? extends R> lVar) {
        try {
            R invoke = lVar.invoke(jarFile);
            kotlin.jvm.internal.d0.d(1);
            jarFile.close();
            kotlin.jvm.internal.d0.c(1);
            return invoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.jvm.internal.d0.d(1);
                try {
                    jarFile.close();
                    kotlin.jvm.internal.d0.c(1);
                    throw th3;
                } catch (Throwable th4) {
                    yz.r.a(th2, th4);
                    throw th2;
                }
            }
        }
    }
}
