package a90;

import a90.d1;
import ba0.g4;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.FileAttributeView;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.junit.jupiter.api.extension.ExtensionConfigurationException;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.io.CleanupMode;
import org.junit.platform.commons.JUnitException;
import org.junit.platform.commons.PreconditionViolationException;
import org.junit.platform.commons.util.ReflectionUtils;
import p80.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class d1 implements p80.e, p80.f, p80.u {

    /* renamed from: b, reason: collision with root package name */
    public static final n.a f2346b = n.a.b(d1.class);

    /* renamed from: c, reason: collision with root package name */
    public static final String f2347c = "temp.dir";

    /* renamed from: d, reason: collision with root package name */
    public static final String f2348d = "failure.tracker";

    /* renamed from: e, reason: collision with root package name */
    public static final String f2349e = "child.failed";

    /* renamed from: f, reason: collision with root package name */
    public static final String f2350f = "file.operations";

    /* renamed from: a, reason: collision with root package name */
    public final v80.e0 f2351a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements n.b.a {

        /* renamed from: e, reason: collision with root package name */
        public static final y90.e f2352e = y90.g.c(b.class);

        /* renamed from: a, reason: collision with root package name */
        public final Path f2353a;

        /* renamed from: b, reason: collision with root package name */
        public final s80.b f2354b;

        /* renamed from: c, reason: collision with root package name */
        public final CleanupMode f2355c;

        /* renamed from: d, reason: collision with root package name */
        public final p80.n f2356d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends SimpleFileVisitor<Path> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f2357a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SortedMap f2358b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Set f2359c;

            public a(final d val$fileOperations, final SortedMap val$failures, final Set val$retriedPaths) {
                this.f2357a = val$fileOperations;
                this.f2358b = val$failures;
                this.f2359c = val$retriedPaths;
            }

            public final FileVisitResult a(Path path) {
                FileVisitResult fileVisitResult;
                try {
                    this.f2357a.a(path);
                } catch (DirectoryNotEmptyException e11) {
                    this.f2358b.put(path, e11);
                } catch (NoSuchFileException unused) {
                } catch (IOException e12) {
                    d(path, e12);
                }
                fileVisitResult = FileVisitResult.CONTINUE;
                return fileVisitResult;
            }

            public FileVisitResult b(Path dir, IOException exc) {
                return a(dir);
            }

            public FileVisitResult c(Path dir, BasicFileAttributes attrs) {
                boolean equals;
                FileVisitResult fileVisitResult;
                equals = dir.equals(b.this.f2353a);
                if (!equals) {
                    b.l(dir);
                }
                fileVisitResult = FileVisitResult.CONTINUE;
                return fileVisitResult;
            }

            public final void d(Path path, IOException exception) {
                boolean isDirectory;
                if (!this.f2359c.add(path)) {
                    this.f2358b.put(path, exception);
                    return;
                }
                try {
                    b.l(path);
                    isDirectory = Files.isDirectory(path, new LinkOption[0]);
                    if (isDirectory) {
                        Files.walkFileTree(path, this);
                    } else {
                        this.f2357a.a(path);
                    }
                } catch (Exception e11) {
                    exception.addSuppressed(e11);
                    this.f2358b.put(path, exception);
                }
            }

            public FileVisitResult e(Path file, BasicFileAttributes attributes) {
                return a(file);
            }

            public FileVisitResult f(Path file, IOException exc) {
                FileVisitResult fileVisitResult;
                FileVisitResult fileVisitResult2;
                if (p1.a(exc)) {
                    fileVisitResult2 = FileVisitResult.CONTINUE;
                    return fileVisitResult2;
                }
                d(file, exc);
                fileVisitResult = FileVisitResult.CONTINUE;
                return fileVisitResult;
            }

            @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
            public /* bridge */ /* synthetic */ FileVisitResult postVisitDirectory(Object dir, IOException exc) throws IOException {
                return b(io.ktor.server.engine.u0.a(dir), exc);
            }

            @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
            public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object dir, BasicFileAttributes attrs) throws IOException {
                return c(io.ktor.server.engine.u0.a(dir), attrs);
            }

            @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
            public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object file, BasicFileAttributes attributes) throws IOException {
                return e(io.ktor.server.engine.u0.a(file), attributes);
            }

            @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
            public /* bridge */ /* synthetic */ FileVisitResult visitFileFailed(Object file, IOException exc) throws IOException {
                return f(io.ktor.server.engine.u0.a(file), exc);
            }
        }

        public static /* synthetic */ String a(Path path, Path path2) {
            boolean equals;
            String path3;
            equals = path.equals(path2);
            if (equals) {
                return "<root>";
            }
            path3 = path2.toString();
            return path3;
        }

        public static /* synthetic */ String d(b bVar) {
            bVar.getClass();
            return "Skipping cleanup of temp dir " + bVar.f2353a + " due to cleanup mode configuration.";
        }

        public static void l(Path path) {
            File file;
            boolean isDirectory;
            FileAttributeView fileAttributeView;
            try {
                file = path.toFile();
                file.setReadable(true);
                file.setWritable(true);
                isDirectory = Files.isDirectory(path, new LinkOption[0]);
                if (isDirectory) {
                    file.setExecutable(true);
                }
                fileAttributeView = Files.getFileAttributeView(path, e1.a(), new LinkOption[0]);
                DosFileAttributeView a11 = f1.a(fileAttributeView);
                if (a11 != null) {
                    a11.setReadOnly(false);
                }
            } catch (IOException | UnsupportedOperationException unused) {
            }
        }

        @Override // p80.n.b.a
        public void close() throws IOException {
            try {
                CleanupMode cleanupMode = this.f2355c;
                if (cleanupMode != CleanupMode.NEVER && (cleanupMode != CleanupMode.ON_SUCCESS || !d1.l0(this.f2356d))) {
                    SortedMap<Path, IOException> h11 = h((d) this.f2356d.U(d1.f2346b).b(d1.f2350f, d.class, d.f2362a));
                    if (!h11.isEmpty()) {
                        throw g(h11);
                    }
                    this.f2354b.close();
                }
                f2352e.g(new Supplier() { // from class: a90.k1
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return d1.b.d(d1.b.this);
                    }
                });
                this.f2354b.close();
            } catch (Throwable th2) {
                this.f2354b.close();
                throw th2;
            }
        }

        public final IOException g(SortedMap<Path, IOException> failures) {
            final Path path;
            Path absolutePath;
            path = Paths.get("", new String[0]);
            String str = (String) failures.keySet().stream().map(new Function() { // from class: a90.l1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Path k11;
                    k11 = d1.b.this.k((Path) obj);
                    return k11;
                }
            }).map(new Function() { // from class: a90.m1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Path j11;
                    j11 = d1.b.this.j((Path) obj);
                    return j11;
                }
            }).map(new Function() { // from class: a90.n1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return d1.b.a(path, (Path) obj);
                }
            }).collect(Collectors.joining(org.junit.jupiter.api.j2.O));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to delete temp directory ");
            absolutePath = this.f2353a.toAbsolutePath();
            sb2.append(absolutePath);
            sb2.append(". The following paths could not be deleted (see suppressed exceptions for details): ");
            sb2.append(str);
            final IOException iOException = new IOException(sb2.toString());
            failures.values().forEach(new Consumer() { // from class: a90.o1
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    iOException.addSuppressed((IOException) obj);
                }
            });
            return iOException;
        }

        public final SortedMap<Path, IOException> h(d fileOperations) throws IOException {
            SortedMap<Path, IOException> emptySortedMap;
            boolean notExists;
            Path path = this.f2353a;
            if (path != null) {
                notExists = Files.notExists(path, new LinkOption[0]);
                if (!notExists) {
                    TreeMap treeMap = new TreeMap();
                    HashSet hashSet = new HashSet();
                    l(this.f2353a);
                    Files.walkFileTree(this.f2353a, new a(fileOperations, treeMap, hashSet));
                    return treeMap;
                }
            }
            emptySortedMap = Collections.emptySortedMap();
            return emptySortedMap;
        }

        public Path i() {
            return this.f2353a;
        }

        public final Path j(Path path) {
            Path relativize;
            try {
                relativize = this.f2353a.relativize(path);
                return relativize;
            } catch (IllegalArgumentException unused) {
                return path;
            }
        }

        public final Path k(Path path) {
            File file;
            try {
                file = path.toFile();
                file.deleteOnExit();
            } catch (UnsupportedOperationException unused) {
            }
            return path;
        }

        public b(s80.b factory, CleanupMode cleanupMode, Class<?> elementType, p80.d elementContext, p80.n extensionContext) throws Exception {
            boolean isDirectory;
            FileSystem fileSystem;
            FileSystem fileSystem2;
            Path G2 = factory.G2(elementContext, extensionContext);
            this.f2353a = G2;
            this.f2354b = factory;
            this.f2355c = cleanupMode;
            this.f2356d = extensionContext;
            if (G2 != null) {
                isDirectory = Files.isDirectory(G2, new LinkOption[0]);
                if (isDirectory) {
                    if (elementType == File.class) {
                        fileSystem = G2.getFileSystem();
                        fileSystem2 = FileSystems.getDefault();
                        if (fileSystem.equals(fileSystem2)) {
                            return;
                        }
                        close();
                        throw new PreconditionViolationException("temp directory with non-default file system cannot be injected into " + File.class.getName() + " target");
                    }
                    return;
                }
            }
            close();
            throw new PreconditionViolationException("temp directory must be a directory");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements p80.d {

        /* renamed from: a, reason: collision with root package name */
        public final Field f2361a;

        @Override // p80.d
        public AnnotatedElement a() {
            return this.f2361a;
        }

        public String toString() {
            return new g4(this).a("field", this.f2361a).toString();
        }

        public c(Field field) {
            this.f2361a = (Field) ba0.c2.r(field, "field must not be null");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f2362a = new d() { // from class: a90.q1
            @Override // a90.d1.d
            public final void a(Path path) {
                Files.delete(path);
            }
        };

        void a(Path path) throws IOException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum e {
        PER_CONTEXT,
        PER_DECLARATION
    }

    public d1(v80.e0 configuration) {
        this.f2351a = configuration;
    }

    public static /* synthetic */ void M(p80.n nVar, p80.n nVar2) {
        if (l0(nVar)) {
            nVar2.U(f2346b).put(f2349e, Boolean.TRUE);
        }
    }

    public static /* synthetic */ e N(final p80.n nVar, Class cls) {
        v80.s sVar = new v80.s(e.class, "@TempDir scope");
        Objects.requireNonNull(nVar);
        return (e) sVar.d("junit.jupiter.tempdir.scope", new Function() { // from class: a90.y0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return p80.n.this.i((String) obj);
            }
        }, e.PER_DECLARATION);
    }

    public static /* synthetic */ JUnitException O(p80.t tVar) {
        return new JUnitException("Parameter " + tVar.b() + " must be annotated with @TempDir");
    }

    public static /* synthetic */ JUnitException P(Field field) {
        return new JUnitException("Field " + field + " must be annotated with @TempDir");
    }

    public static /* synthetic */ void Q(d1 d1Var, e eVar, Object obj, p80.n nVar, Field field) {
        d1Var.W(field);
        d1Var.X("field", field.getType());
        try {
            CleanupMode a02 = d1Var.a0(field);
            ReflectionUtils.w1(field).set(obj, d1Var.f0(field.getType(), new c(field), d1Var.d0(field, eVar), a02, eVar, nVar));
        } catch (Throwable th2) {
            throw ba0.o1.e(th2);
        }
    }

    public static /* synthetic */ JUnitException R(p80.t tVar) {
        return new JUnitException("Parameter " + tVar.b() + " must be annotated with @TempDir");
    }

    public static /* synthetic */ JUnitException S(Field field) {
        return new JUnitException("Field " + field + " must be annotated with @TempDir");
    }

    public static b Y(s80.b factory, CleanupMode cleanupMode, Class<?> elementType, p80.d elementContext, p80.n extensionContext) {
        try {
            return new b(factory, cleanupMode, elementType, elementContext, extensionContext);
        } catch (Exception e11) {
            throw new ExtensionConfigurationException("Failed to create default temp directory", e11);
        }
    }

    public static void k0(final p80.n context) {
        context.U(f2346b).put(f2348d, new n.b.a() { // from class: a90.c1
            @Override // p80.n.b.a
            public final void close() {
                r0.getParent().ifPresent(new Consumer() { // from class: a90.t0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        d1.M(p80.n.this, (p80.n) obj);
                    }
                });
            }
        });
    }

    public static boolean l0(p80.n context) {
        return context.L().isPresent() || ((Boolean) context.U(f2346b).b(f2349e, Boolean.class, Boolean.FALSE)).booleanValue();
    }

    @Override // p80.e
    public void A(p80.n context) {
        k0(context);
        j0(context, context.Z());
    }

    public final void W(Field field) {
        if (ReflectionUtils.T0(field)) {
            throw new ExtensionConfigurationException("@TempDir field [" + field + "] must not be declared as final.");
        }
    }

    public final void X(String target, Class<?> type) {
        if (type == r0.a() || type == File.class) {
            return;
        }
        throw new ExtensionConfigurationException("Can only resolve @TempDir " + target + " of type " + r0.a().getName() + " or " + File.class.getName() + " but was: " + type.getName());
    }

    public final CleanupMode Z(s80.a tempDir) {
        CleanupMode cleanup = tempDir.cleanup();
        return cleanup == CleanupMode.DEFAULT ? this.f2351a.g() : cleanup;
    }

    @Override // p80.u
    public boolean a(p80.t parameterContext, p80.n extensionContext) {
        boolean e11 = parameterContext.e(s80.a.class);
        if (e11 && (parameterContext.c() instanceof Constructor)) {
            throw new ParameterResolutionException("@TempDir is not supported on constructor parameters. Please use field injection instead.");
        }
        return e11;
    }

    public final CleanupMode a0(final Field field) {
        return Z((s80.a) org.junit.platform.commons.util.a.m(field, s80.a.class).orElseThrow(new Supplier() { // from class: a90.a1
            @Override // java.util.function.Supplier
            public final Object get() {
                return d1.P(field);
            }
        }));
    }

    public final CleanupMode b0(final p80.t parameterContext) {
        return Z((s80.a) parameterContext.f(s80.a.class).orElseThrow(new Supplier() { // from class: a90.b1
            @Override // java.util.function.Supplier
            public final Object get() {
                return d1.O(p80.t.this);
            }
        }));
    }

    public final s80.b c0(s80.a tempDir, e scope) {
        e eVar;
        Class<? extends s80.b> factory = tempDir.factory();
        if (factory == s80.b.class || scope != (eVar = e.PER_CONTEXT)) {
            return factory == s80.b.class ? this.f2351a.l().get() : (s80.b) ReflectionUtils.x1(factory, new Object[0]);
        }
        throw new ExtensionConfigurationException("Custom @TempDir factory is not supported with junit.jupiter.tempdir.scope=" + eVar.name().toLowerCase() + ". Use junit.jupiter.tempdir.factory.default instead.");
    }

    public final s80.b d0(final Field field, e scope) {
        return c0((s80.a) org.junit.platform.commons.util.a.m(field, s80.a.class).orElseThrow(new Supplier() { // from class: a90.z0
            @Override // java.util.function.Supplier
            public final Object get() {
                return d1.S(field);
            }
        }), scope);
    }

    public final s80.b e0(final p80.t parameterContext, e scope) {
        return c0((s80.a) parameterContext.f(s80.a.class).orElseThrow(new Supplier() { // from class: a90.v0
            @Override // java.util.function.Supplier
            public final Object get() {
                return d1.R(p80.t.this);
            }
        }), scope);
    }

    public final Object f0(final Class<?> elementType, final p80.d elementContext, final s80.b factory, final CleanupMode cleanupMode, e scope, final p80.n extensionContext) {
        File file;
        Path i11 = ((b) extensionContext.U(scope == e.PER_DECLARATION ? f2346b.a(elementContext) : f2346b).c(f2347c, new Function() { // from class: a90.x0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                d1.b Y;
                Y = d1.Y(s80.b.this, cleanupMode, elementType, elementContext, extensionContext);
                return Y;
            }
        }, b.class)).i();
        if (elementType == r0.a()) {
            return i11;
        }
        file = i11.toFile();
        return file;
    }

    public final e g0(final p80.n context) {
        return (e) context.getRoot().U(f2346b).c(e.class, new Function() { // from class: a90.u0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return d1.N(p80.n.this, (Class) obj);
            }
        }, e.class);
    }

    public final void h0(final p80.n context, final Object testInstance, Class<?> testClass, Predicate<Field> predicate) {
        final e g02 = g0(context);
        org.junit.platform.commons.util.a.i(testClass, s80.a.class, predicate).forEach(new Consumer() { // from class: a90.s0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                d1.Q(d1.this, g02, testInstance, context, (Field) obj);
            }
        });
    }

    public final void i0(p80.n context, Object instance) {
        h0(context, instance, instance.getClass(), new w80.z1());
    }

    public final void j0(p80.n context, Class<?> testClass) {
        h0(context, null, testClass, new w80.d2());
    }

    @Override // p80.f
    public void n(final p80.n context) {
        k0(context);
        context.r().a().forEach(new Consumer() { // from class: a90.w0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                d1.this.i0(context, obj);
            }
        });
    }

    @Override // p80.u
    public Object u(p80.t parameterContext, p80.n extensionContext) {
        Class<?> type;
        type = parameterContext.b().getType();
        X("parameter", type);
        CleanupMode b02 = b0(parameterContext);
        e g02 = g0(extensionContext);
        return f0(type, parameterContext, e0(parameterContext, g02), b02, g02, extensionContext);
    }
}
