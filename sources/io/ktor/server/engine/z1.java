package io.ktor.server.engine;

import java.io.Closeable;
import java.io.InputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nOverridingClassLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OverridingClassLoader.kt\nio/ktor/server/engine/OverridingClassLoader\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,70:1\n37#2,2:71\n*S KotlinDebug\n*F\n+ 1 OverridingClassLoader.kt\nio/ktor/server/engine/OverridingClassLoader\n*L\n18#1:71,2\n*E\n"})
/* loaded from: classes8.dex */
public final class z1 extends ClassLoader implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final a f61482a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends URLClassLoader {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final ClassLoader f61483a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k URL[] urls, @m80.k ClassLoader realParent) {
            super(urls, null);
            kotlin.jvm.internal.g0.p(urls, "urls");
            kotlin.jvm.internal.g0.p(realParent, "realParent");
            this.f61483a = realParent;
        }

        @Override // java.net.URLClassLoader, java.lang.ClassLoader
        @m80.k
        public Class<?> findClass(@m80.k String name) {
            kotlin.jvm.internal.g0.p(name, "name");
            Class<?> findLoadedClass = super.findLoadedClass(name);
            if (findLoadedClass != null) {
                return findLoadedClass;
            }
            try {
                return super.findClass(name);
            } catch (ClassNotFoundException unused) {
                return this.f61483a.loadClass(name);
            }
        }

        @Override // java.net.URLClassLoader, java.lang.ClassLoader
        @m80.l
        public URL findResource(@m80.l String str) {
            return null;
        }

        @Override // java.net.URLClassLoader, java.lang.ClassLoader
        @m80.k
        public Enumeration<URL> findResources(@m80.l String str) {
            Enumeration<URL> emptyEnumeration = Collections.emptyEnumeration();
            kotlin.jvm.internal.g0.o(emptyEnumeration, "emptyEnumeration(...)");
            return emptyEnumeration;
        }

        @Override // java.lang.ClassLoader
        @m80.l
        public URL getResource(@m80.l String str) {
            return this.f61483a.getResource(str);
        }

        @Override // java.net.URLClassLoader, java.lang.ClassLoader
        @m80.l
        public InputStream getResourceAsStream(@m80.l String str) {
            return this.f61483a.getResourceAsStream(str);
        }

        @Override // java.lang.ClassLoader
        @m80.k
        public Enumeration<URL> getResources(@m80.l String str) {
            Enumeration<URL> resources = this.f61483a.getResources(str);
            kotlin.jvm.internal.g0.o(resources, "getResources(...)");
            return resources;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(@m80.k List<URL> classpath, @m80.l ClassLoader classLoader) {
        super(classLoader);
        kotlin.jvm.internal.g0.p(classpath, "classpath");
        URL[] urlArr = (URL[]) classpath.toArray(new URL[0]);
        ClassLoader parent = getParent();
        kotlin.jvm.internal.g0.o(parent, "getParent(...)");
        this.f61482a = new a(urlArr, parent);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f61482a.close();
    }

    @Override // java.lang.ClassLoader
    @m80.k
    public synchronized Class<?> loadClass(@m80.k String name, boolean z11) {
        Class<?> loadClass;
        kotlin.jvm.internal.g0.p(name, "name");
        try {
            loadClass = this.f61482a.findClass(name);
        } catch (ClassNotFoundException unused) {
            loadClass = super.loadClass(name, z11);
        }
        return loadClass;
    }
}
