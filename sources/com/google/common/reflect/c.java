package com.google.common.reflect;

import com.google.common.base.Preconditions;
import com.google.common.base.StandardSystemProperty;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.aa;
import com.google.common.collect.i4;
import com.google.common.collect.u6;
import com.google.common.reflect.c;
import ho.i0;
import ho.m0;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.Charset;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
import po.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f34393b = Logger.getLogger(c.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public static final m0 f34394c = m0.j(" ").g();

    /* renamed from: d, reason: collision with root package name */
    public static final String f34395d = ".class";

    /* renamed from: a, reason: collision with root package name */
    public final ImmutableSet<C0425c> f34396a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends C0425c {

        /* renamed from: d, reason: collision with root package name */
        public final String f34397d;

        public a(File file, String resourceName, ClassLoader loader) {
            super(file, resourceName, loader);
            this.f34397d = c.e(resourceName);
        }

        public String g() {
            return this.f34397d;
        }

        public String h() {
            return l.b(this.f34397d);
        }

        public String i() {
            int lastIndexOf = this.f34397d.lastIndexOf(36);
            if (lastIndexOf != -1) {
                return ho.d.m('0', '9').V(this.f34397d.substring(lastIndexOf + 1));
            }
            String h11 = h();
            return h11.isEmpty() ? this.f34397d : this.f34397d.substring(h11.length() + 1);
        }

        public boolean j() {
            return this.f34397d.indexOf(36) == -1;
        }

        public Class<?> k() {
            try {
                return this.f34402c.loadClass(this.f34397d);
            } catch (ClassNotFoundException e11) {
                throw new IllegalStateException(e11);
            }
        }

        @Override // com.google.common.reflect.c.C0425c
        public String toString() {
            return this.f34397d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final File f34398a;

        /* renamed from: b, reason: collision with root package name */
        public final ClassLoader f34399b;

        public b(File home, ClassLoader classloader) {
            this.f34398a = (File) Preconditions.checkNotNull(home);
            this.f34399b = (ClassLoader) Preconditions.checkNotNull(classloader);
        }

        public final File a() {
            return this.f34398a;
        }

        public final void b(File file, Set<File> scannedUris, ImmutableSet.a<C0425c> builder) throws IOException {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        c(file, builder);
                    } else {
                        e(file, scannedUris, builder);
                    }
                }
            } catch (SecurityException e11) {
                c.f34393b.warning("Cannot access " + file + ": " + e11);
            }
        }

        public final void c(File directory, ImmutableSet.a<C0425c> builder) throws IOException {
            HashSet hashSet = new HashSet();
            hashSet.add(directory.getCanonicalFile());
            d(directory, "", hashSet, builder);
        }

        public final void d(File directory, String packagePrefix, Set<File> currentPath, ImmutableSet.a<C0425c> builder) throws IOException {
            File[] listFiles = directory.listFiles();
            if (listFiles == null) {
                c.f34393b.warning("Cannot read directory " + directory);
                return;
            }
            for (File file : listFiles) {
                String name = file.getName();
                if (file.isDirectory()) {
                    File canonicalFile = file.getCanonicalFile();
                    if (currentPath.add(canonicalFile)) {
                        d(canonicalFile, packagePrefix + name + "/", currentPath, builder);
                        currentPath.remove(canonicalFile);
                    }
                } else {
                    String str = packagePrefix + name;
                    if (!str.equals("META-INF/MANIFEST.MF")) {
                        builder.a(C0425c.e(file, str, this.f34399b));
                    }
                }
            }
        }

        public final void e(File file, Set<File> scannedUris, ImmutableSet.a<C0425c> builder) throws IOException {
            try {
                JarFile jarFile = new JarFile(file);
                try {
                    aa<File> it = c.h(file, jarFile.getManifest()).iterator();
                    while (it.hasNext()) {
                        File next = it.next();
                        if (scannedUris.add(next.getCanonicalFile())) {
                            b(next, scannedUris, builder);
                        }
                    }
                    f(jarFile, builder);
                    try {
                        jarFile.close();
                    } catch (IOException unused) {
                    }
                } catch (Throwable th2) {
                    try {
                        jarFile.close();
                    } catch (IOException unused2) {
                    }
                    throw th2;
                }
            } catch (IOException unused3) {
            }
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f34398a.equals(bVar.f34398a) && this.f34399b.equals(bVar.f34399b)) {
                    return true;
                }
            }
            return false;
        }

        public final void f(JarFile file, ImmutableSet.a<C0425c> builder) {
            Enumeration<JarEntry> entries = file.entries();
            while (entries.hasMoreElements()) {
                JarEntry nextElement = entries.nextElement();
                if (!nextElement.isDirectory() && !nextElement.getName().equals("META-INF/MANIFEST.MF")) {
                    builder.a(C0425c.e(new File(file.getName()), nextElement.getName(), this.f34399b));
                }
            }
        }

        public ImmutableSet<C0425c> g() throws IOException {
            return h(new HashSet());
        }

        public ImmutableSet<C0425c> h(Set<File> scannedFiles) throws IOException {
            ImmutableSet.a<C0425c> builder = ImmutableSet.builder();
            scannedFiles.add(this.f34398a);
            b(this.f34398a, scannedFiles, builder);
            return builder.e();
        }

        public int hashCode() {
            return this.f34398a.hashCode();
        }

        public String toString() {
            return this.f34398a.toString();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.google.common.reflect.c$c, reason: collision with other inner class name */
    public static class C0425c {

        /* renamed from: a, reason: collision with root package name */
        public final File f34400a;

        /* renamed from: b, reason: collision with root package name */
        public final String f34401b;

        /* renamed from: c, reason: collision with root package name */
        public final ClassLoader f34402c;

        public C0425c(File file, String resourceName, ClassLoader loader) {
            this.f34400a = (File) Preconditions.checkNotNull(file);
            this.f34401b = (String) Preconditions.checkNotNull(resourceName);
            this.f34402c = (ClassLoader) Preconditions.checkNotNull(loader);
        }

        public static C0425c e(File file, String resourceName, ClassLoader loader) {
            return resourceName.endsWith(".class") ? new a(file, resourceName, loader) : new C0425c(file, resourceName, loader);
        }

        public final po.f a() {
            return g0.a(f());
        }

        public final po.j b(Charset charset) {
            return g0.b(f(), charset);
        }

        public final File c() {
            return this.f34400a;
        }

        public final String d() {
            return this.f34401b;
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof C0425c) {
                C0425c c0425c = (C0425c) obj;
                if (this.f34401b.equals(c0425c.f34401b) && this.f34402c == c0425c.f34402c) {
                    return true;
                }
            }
            return false;
        }

        public final URL f() {
            URL resource = this.f34402c.getResource(this.f34401b);
            if (resource != null) {
                return resource;
            }
            throw new NoSuchElementException(this.f34401b);
        }

        public int hashCode() {
            return this.f34401b.hashCode();
        }

        public String toString() {
            return this.f34401b;
        }
    }

    public c(ImmutableSet<C0425c> resources) {
        this.f34396a = resources;
    }

    public static c b(ClassLoader classloader) throws IOException {
        ImmutableSet<b> m11 = m(classloader);
        HashSet hashSet = new HashSet();
        aa<b> it = m11.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().a());
        }
        ImmutableSet.a builder = ImmutableSet.builder();
        aa<b> it2 = m11.iterator();
        while (it2.hasNext()) {
            builder.c(it2.next().h(hashSet));
        }
        return new c(builder.e());
    }

    public static ImmutableList<URL> d(ClassLoader classloader) {
        return classloader instanceof URLClassLoader ? ImmutableList.copyOf(((URLClassLoader) classloader).getURLs()) : classloader.equals(ClassLoader.getSystemClassLoader()) ? n() : ImmutableList.of();
    }

    @go.e
    public static String e(String filename) {
        return filename.substring(0, filename.length() - 6).replace('/', '.');
    }

    @go.e
    public static ImmutableMap<File, ClassLoader> f(ClassLoader classloader) {
        LinkedHashMap c02 = u6.c0();
        ClassLoader parent = classloader.getParent();
        if (parent != null) {
            c02.putAll(f(parent));
        }
        aa<URL> it = d(classloader).iterator();
        while (it.hasNext()) {
            URL next = it.next();
            if (next.getProtocol().equals("file")) {
                File o11 = o(next);
                if (!c02.containsKey(o11)) {
                    c02.put(o11, classloader);
                }
            }
        }
        return ImmutableMap.copyOf((Map) c02);
    }

    @go.e
    public static URL g(File jarFile, String path) throws MalformedURLException {
        return new URL(jarFile.toURI().toURL(), path);
    }

    @go.e
    public static ImmutableSet<File> h(File jarFile, @CheckForNull Manifest manifest) {
        if (manifest == null) {
            return ImmutableSet.of();
        }
        ImmutableSet.a builder = ImmutableSet.builder();
        String value = manifest.getMainAttributes().getValue(Attributes.Name.CLASS_PATH.toString());
        if (value != null) {
            for (String str : f34394c.n(value)) {
                try {
                    URL g11 = g(jarFile, str);
                    if (g11.getProtocol().equals("file")) {
                        builder.a(o(g11));
                    }
                } catch (MalformedURLException unused) {
                    f34393b.warning("Invalid Class-Path entry: " + str);
                }
            }
        }
        return builder.e();
    }

    public static ImmutableSet<b> m(ClassLoader classloader) {
        ImmutableSet.a builder = ImmutableSet.builder();
        aa<Map.Entry<File, ClassLoader>> it = f(classloader).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<File, ClassLoader> next = it.next();
            builder.a(new b(next.getKey(), next.getValue()));
        }
        return builder.e();
    }

    @go.e
    public static ImmutableList<URL> n() {
        ImmutableList.a builder = ImmutableList.builder();
        for (String str : m0.j(StandardSystemProperty.PATH_SEPARATOR.value()).n(StandardSystemProperty.JAVA_CLASS_PATH.value())) {
            try {
                try {
                    builder.g(new File(str).toURI().toURL());
                } catch (SecurityException unused) {
                    builder.g(new URL("file", (String) null, new File(str).getAbsolutePath()));
                }
            } catch (MalformedURLException e11) {
                f34393b.log(Level.WARNING, "malformed classpath entry: " + str, (Throwable) e11);
            }
        }
        return builder.e();
    }

    @go.e
    public static File o(URL url) {
        Preconditions.checkArgument(url.getProtocol().equals("file"));
        try {
            return new File(url.toURI());
        } catch (URISyntaxException unused) {
            return new File(url.getPath());
        }
    }

    public ImmutableSet<a> c() {
        return i4.u(this.f34396a).q(a.class).I();
    }

    public ImmutableSet<C0425c> i() {
        return this.f34396a;
    }

    public ImmutableSet<a> j() {
        return i4.u(this.f34396a).q(a.class).p(new i0() { // from class: com.google.common.reflect.b
            @Override // ho.i0
            public final boolean apply(Object obj) {
                return ((c.a) obj).j();
            }
        }).I();
    }

    public ImmutableSet<a> k(String packageName) {
        Preconditions.checkNotNull(packageName);
        ImmutableSet.a builder = ImmutableSet.builder();
        aa<a> it = j().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.h().equals(packageName)) {
                builder.a(next);
            }
        }
        return builder.e();
    }

    public ImmutableSet<a> l(String packageName) {
        Preconditions.checkNotNull(packageName);
        String str = packageName + '.';
        ImmutableSet.a builder = ImmutableSet.builder();
        aa<a> it = j().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.g().startsWith(str)) {
                builder.a(next);
            }
        }
        return builder.e();
    }
}
