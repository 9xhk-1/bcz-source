package ba0;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.platform.commons.PreconditionViolationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class z0 {

    /* renamed from: d, reason: collision with root package name */
    public static final char f6634d = '/';

    /* renamed from: f, reason: collision with root package name */
    public static final char f6636f = '.';

    /* renamed from: h, reason: collision with root package name */
    public static final String f6638h = "Malformed class name";

    /* renamed from: a, reason: collision with root package name */
    public final Supplier<ClassLoader> f6639a;

    /* renamed from: b, reason: collision with root package name */
    public final BiFunction<String, ClassLoader, x90.b<Class<?>>> f6640b;

    /* renamed from: c, reason: collision with root package name */
    public static final y90.e f6633c = y90.g.c(z0.class);

    /* renamed from: e, reason: collision with root package name */
    public static final String f6635e = String.valueOf('/');

    /* renamed from: g, reason: collision with root package name */
    public static final String f6637g = String.valueOf('.');

    public z0(Supplier<ClassLoader> classLoaderSupplier, BiFunction<String, ClassLoader, x90.b<Class<?>>> loadClass) {
        this.f6639a = classLoaderSupplier;
        this.f6640b = loadClass;
    }

    public static String D(String packageName) {
        return packageName.isEmpty() ? "" : packageName.replace('.', '/');
    }

    public static URI G(URI uri) {
        String uri2 = uri.toString();
        return uri2.endsWith(f6635e) ? URI.create(uri2.substring(0, uri2.length() - 1)) : uri;
    }

    public static void L(final URI baseUri, Predicate<Path> filter, BiConsumer<Path, Path> consumer) {
        boolean exists;
        try {
            j1 q11 = j1.q(baseUri);
            try {
                final Path C = q11.C();
                exists = Files.exists(C, new LinkOption[0]);
                c2.f(exists, new Supplier() { // from class: ba0.s0
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return z0.e(C);
                    }
                });
                try {
                    Files.walkFileTree(C, new b0(C, filter, consumer));
                } catch (IOException e11) {
                    f6633c.b(e11, new Supplier() { // from class: ba0.t0
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return z0.h(C);
                        }
                    });
                }
                q11.close();
            } catch (Throwable th2) {
                if (q11 != null) {
                    try {
                        q11.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (PreconditionViolationException e12) {
            throw e12;
        } catch (Exception e13) {
            f6633c.b(e13, new Supplier() { // from class: ba0.u0
                @Override // java.util.function.Supplier
                public final Object get() {
                    return z0.k(baseUri);
                }
            });
        }
    }

    public static /* synthetic */ String a(Path path, String str) {
        Path absolutePath;
        absolutePath = path.toAbsolutePath();
        return String.format("The java.lang.Class loaded from path [%s] has a malformed class name [%s].", absolutePath, str);
    }

    public static /* synthetic */ boolean b(String str) {
        return !str.isEmpty();
    }

    public static /* synthetic */ void c(z0 z0Var, String str, Predicate predicate, final List list, Path path, Path path2) {
        z0Var.getClass();
        Objects.requireNonNull(list);
        z0Var.F(path, str, predicate, path2, new Consumer() { // from class: ba0.p0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                list.add((z90.j) obj);
            }
        });
    }

    public static /* synthetic */ String e(Path path) {
        return "baseDir must exist: " + path;
    }

    public static /* synthetic */ boolean f(String str) {
        return !str.isEmpty();
    }

    public static /* synthetic */ void g(z0 z0Var, String str, l lVar, final List list, Path path, Path path2) {
        z0Var.getClass();
        Objects.requireNonNull(list);
        z0Var.E(path, str, lVar, path2, new Consumer() { // from class: ba0.n0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                list.add((Class) obj);
            }
        });
    }

    public static /* synthetic */ String h(Path path) {
        return "I/O error scanning files in " + path;
    }

    public static /* synthetic */ String i(String str) {
        return "Error reading URIs from class loader for base package " + str;
    }

    public static /* synthetic */ String k(URI uri) {
        return "Error scanning files for URI " + uri;
    }

    public static /* synthetic */ String m(Path path) {
        Path absolutePath;
        absolutePath = path.toAbsolutePath();
        return String.format("Failed to load [%s] during classpath scanning.", absolutePath);
    }

    public final void A(Path classFile, Throwable throwable) {
        h4.a(throwable);
        B(classFile, throwable);
    }

    public final void B(final Path classpathFile, Throwable throwable) {
        f6633c.a(throwable, new Supplier() { // from class: ba0.v0
            @Override // java.util.function.Supplier
            public final Object get() {
                return z0.m(classpathFile);
            }
        });
    }

    public final void C(final Path classFile, final String fullyQualifiedClassName, InternalError ex2) {
        try {
            f6633c.a(ex2, new Supplier() { // from class: ba0.o0
                @Override // java.util.function.Supplier
                public final Object get() {
                    return z0.a(classFile, fullyQualifiedClassName);
                }
            });
        } catch (Throwable th2) {
            h4.a(th2);
            ex2.addSuppressed(th2);
            B(classFile, ex2);
        }
    }

    public final void E(Path baseDir, String basePackageName, l classFilter, Path classFile, Consumer<Class<?>> classConsumer) {
        try {
            String n11 = n(baseDir, basePackageName, classFile);
            if (classFilter.c(n11)) {
                try {
                    this.f6640b.apply(n11, w()).q().filter(classFilter).ifPresent(classConsumer);
                } catch (InternalError e11) {
                    z(classFile, n11, e11);
                }
            }
        } catch (Throwable th2) {
            A(classFile, th2);
        }
    }

    public final void F(Path baseDir, String basePackageName, Predicate<z90.j> resourceFilter, Path resourceFile, Consumer<z90.j> resourceConsumer) {
        URI uri;
        try {
            String o11 = o(baseDir, basePackageName, resourceFile);
            uri = resourceFile.toUri();
            g0 g0Var = new g0(o11, uri);
            if (resourceFilter.test(g0Var)) {
                resourceConsumer.accept(g0Var);
            }
        } catch (Throwable th2) {
            A(resourceFile, th2);
        }
    }

    public List<Class<?>> H(URI root, l classFilter) {
        c2.r(root, "root must not be null");
        c2.r(classFilter, "classFilter must not be null");
        return s(root, "", classFilter);
    }

    public List<Class<?>> I(String basePackageName, l classFilter) {
        c2.e("".equals(basePackageName) || e4.h(basePackageName), "basePackageName must not be null or blank");
        c2.r(classFilter, "classFilter must not be null");
        String trim = basePackageName.trim();
        return t(y(trim), trim, classFilter);
    }

    public List<z90.j> J(URI root, Predicate<z90.j> resourceFilter) {
        c2.r(root, "root must not be null");
        c2.r(resourceFilter, "resourceFilter must not be null");
        return u(root, "", resourceFilter);
    }

    public List<z90.j> K(String basePackageName, Predicate<z90.j> resourceFilter) {
        c2.e("".equals(basePackageName) || e4.h(basePackageName), "basePackageName must not be null or blank");
        c2.r(resourceFilter, "resourceFilter must not be null");
        String trim = basePackageName.trim();
        return v(y(trim), trim, resourceFilter);
    }

    public final String n(Path baseDir, String basePackageName, Path classFile) {
        return (String) Stream.of((Object[]) new String[]{basePackageName, r(baseDir, classFile), p(classFile)}).filter(new Predicate() { // from class: ba0.w0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return z0.b((String) obj);
            }
        }).collect(Collectors.joining(f6637g));
    }

    public final String o(Path baseDir, String basePackageName, Path resourceFile) {
        return (String) Stream.of((Object[]) new String[]{D(basePackageName), D(r(baseDir, resourceFile)), q(resourceFile)}).filter(new Predicate() { // from class: ba0.m0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return z0.f((String) obj);
            }
        }).collect(Collectors.joining(f6635e));
    }

    public final String p(Path classFile) {
        Path fileName;
        String path;
        fileName = classFile.getFileName();
        path = fileName.toString();
        return path.substring(0, path.length() - 6);
    }

    public final String q(Path resourceFile) {
        Path fileName;
        String path;
        fileName = resourceFile.getFileName();
        path = fileName.toString();
        return path;
    }

    public final String r(Path baseDir, Path classFile) {
        Path parent;
        Path relativize;
        FileSystem fileSystem;
        String separator;
        String path;
        parent = classFile.getParent();
        relativize = baseDir.relativize(parent);
        fileSystem = baseDir.getFileSystem();
        separator = fileSystem.getSeparator();
        path = relativize.toString();
        String replace = path.replace(separator, f6637g);
        return replace.endsWith(separator) ? replace.substring(0, replace.length() - separator.length()) : replace;
    }

    public final List<Class<?>> s(URI baseUri, final String basePackageName, final l classFilter) {
        final ArrayList arrayList = new ArrayList();
        L(baseUri, f0.c(), new BiConsumer() { // from class: ba0.q0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                z0.g(z0.this, basePackageName, classFilter, arrayList, (Path) obj, (Path) obj2);
            }
        });
        return arrayList;
    }

    public final List<Class<?>> t(List<URI> baseUris, final String basePackageName, final l classFilter) {
        return (List) baseUris.stream().map(new Function() { // from class: ba0.l0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                List s11;
                s11 = z0.this.s((URI) obj, basePackageName, classFilter);
                return s11;
            }
        }).flatMap(new y0()).distinct().collect(Collectors.toList());
    }

    public final List<z90.j> u(URI baseUri, final String basePackageName, final Predicate<z90.j> resourceFilter) {
        final ArrayList arrayList = new ArrayList();
        L(baseUri, f0.g(), new BiConsumer() { // from class: ba0.r0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                z0.c(z0.this, basePackageName, resourceFilter, arrayList, (Path) obj, (Path) obj2);
            }
        });
        return arrayList;
    }

    public final List<z90.j> v(List<URI> baseUris, final String basePackageName, final Predicate<z90.j> resourceFilter) {
        return (List) baseUris.stream().map(new Function() { // from class: ba0.x0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                List u11;
                u11 = z0.this.u((URI) obj, basePackageName, resourceFilter);
                return u11;
            }
        }).flatMap(new y0()).distinct().collect(Collectors.toList());
    }

    public final ClassLoader w() {
        return this.f6639a.get();
    }

    public final List<URI> x(final String basePackageName) {
        try {
            Enumeration<URL> resources = w().getResources(D(basePackageName));
            ArrayList arrayList = new ArrayList();
            while (resources.hasMoreElements()) {
                arrayList.add(resources.nextElement().toURI());
            }
            return arrayList;
        } catch (Exception e11) {
            f6633c.b(e11, new Supplier() { // from class: ba0.k0
                @Override // java.util.function.Supplier
                public final Object get() {
                    return z0.i(basePackageName);
                }
            });
            return Collections.EMPTY_LIST;
        }
    }

    public final List<URI> y(String basePackageName) {
        final LinkedHashSet linkedHashSet = new LinkedHashSet(x(basePackageName));
        if (!basePackageName.isEmpty()) {
            String str = f6637g;
            if (!basePackageName.endsWith(str)) {
                x(basePackageName + str).stream().map(new Function() { // from class: ba0.i0
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        URI G;
                        G = z0.G((URI) obj);
                        return G;
                    }
                }).forEach(new Consumer() { // from class: ba0.j0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        linkedHashSet.add((URI) obj);
                    }
                });
            }
        }
        return new ArrayList(linkedHashSet);
    }

    public final void z(Path classFile, String fullyQualifiedClassName, InternalError ex2) {
        if (f6638h.equals(ex2.getMessage())) {
            C(classFile, fullyQualifiedClassName, ex2);
        } else {
            B(classFile, ex2);
        }
    }
}
