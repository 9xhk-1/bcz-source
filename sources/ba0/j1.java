package ba0;

import ba0.j1;
import java.io.Closeable;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class j1 implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public static final String f6557d = "file";

    /* renamed from: e, reason: collision with root package name */
    public static final String f6558e = "jar";

    /* renamed from: f, reason: collision with root package name */
    public static final String f6559f = ".jar";

    /* renamed from: g, reason: collision with root package name */
    public static final String f6560g = "!/";

    /* renamed from: h, reason: collision with root package name */
    public static final Closeable f6561h = new Closeable() { // from class: ba0.i1
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            j1.f();
        }
    };

    /* renamed from: i, reason: collision with root package name */
    public static final ConcurrentMap<URI, b> f6562i = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f6563a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    public final Path f6564b;

    /* renamed from: c, reason: collision with root package name */
    public final Closeable f6565c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        FileSystem a(URI uri) throws IOException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicInteger f6566a = new AtomicInteger(1);

        /* renamed from: b, reason: collision with root package name */
        public final FileSystem f6567b;

        /* renamed from: c, reason: collision with root package name */
        public final URI f6568c;

        public b(URI jarUri, a fileSystemProvider) {
            this.f6568c = jarUri;
            try {
                this.f6567b = fileSystemProvider.a(jarUri);
            } catch (IOException e11) {
                throw new UncheckedIOException("Failed to create file system for " + jarUri, e11);
            }
        }

        public final void d() {
            try {
                this.f6567b.close();
            } catch (IOException e11) {
                throw new UncheckedIOException("Failed to close file system for " + this.f6568c, e11);
            }
        }

        public final b e() {
            if (this.f6566a.decrementAndGet() != 0) {
                return this;
            }
            d();
            return null;
        }

        public final b f() {
            this.f6566a.incrementAndGet();
            return this;
        }
    }

    public j1(Path path, Closeable delegate) {
        this.f6564b = path;
        this.f6565c = delegate;
    }

    public static /* synthetic */ b a(URI uri, a aVar, URI uri2, b bVar) {
        return bVar == null ? new b(uri, aVar) : bVar.f();
    }

    public static /* synthetic */ Path e(String str, FileSystem fileSystem) {
        Path path;
        path = fileSystem.getPath(str, new String[0]);
        return path;
    }

    public static /* synthetic */ FileSystem j(URI uri) {
        FileSystem newFileSystem;
        newFileSystem = FileSystems.newFileSystem(uri, (Map<String, ?>) Collections.EMPTY_MAP);
        return newFileSystem;
    }

    public static /* synthetic */ Path k(FileSystem fileSystem) {
        Iterable rootDirectories;
        rootDirectories = fileSystem.getRootDirectories();
        return io.ktor.server.engine.u0.a(rootDirectories.iterator().next());
    }

    public static j1 q(URI uri) throws URISyntaxException {
        return r(uri, new a() { // from class: ba0.e1
            @Override // ba0.j1.a
            public final FileSystem a(URI uri2) {
                return j1.j(uri2);
            }
        });
    }

    public static j1 r(URI uri, a fileSystemProvider) throws URISyntaxException {
        Path path;
        if (f6558e.equals(uri.getScheme())) {
            String uri2 = uri.toString();
            int lastIndexOf = uri2.lastIndexOf(f6560g);
            String substring = uri2.substring(0, lastIndexOf);
            final String substring2 = uri2.substring(lastIndexOf + 1);
            return w(new URI(substring), new Function() { // from class: ba0.c1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return j1.e(substring2, (FileSystem) obj);
                }
            }, fileSystemProvider);
        }
        if (!"file".equals(uri.getScheme()) || !uri.getPath().endsWith(f6559f)) {
            path = Paths.get(uri);
            return new j1(path, f6561h);
        }
        return w(new URI("jar:" + uri), new Function() { // from class: ba0.d1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return j1.k((FileSystem) obj);
            }
        }, fileSystemProvider);
    }

    public static j1 w(final URI jarUri, Function<FileSystem, Path> pathProvider, final a fileSystemProvider) {
        final b compute = f6562i.compute(jarUri, new BiFunction() { // from class: ba0.f1
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return j1.a(jarUri, fileSystemProvider, (URI) obj, (j1.b) obj2);
            }
        });
        return new j1(io.ktor.server.engine.u0.a(pathProvider.apply(compute.f6567b)), new Closeable() { // from class: ba0.g1
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                j1.f6562i.compute(jarUri, new BiFunction() { // from class: ba0.h1
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj, Object obj2) {
                        j1.b e11;
                        e11 = j1.b.this.e();
                        return e11;
                    }
                });
            }
        });
    }

    public Path C() {
        return this.f6564b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f6563a.compareAndSet(false, true)) {
            this.f6565c.close();
        }
    }

    public static /* synthetic */ void f() {
    }
}
