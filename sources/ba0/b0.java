package ba0;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class b0 extends SimpleFileVisitor<Path> {

    /* renamed from: d, reason: collision with root package name */
    public static final y90.e f6512d = y90.g.c(b0.class);

    /* renamed from: a, reason: collision with root package name */
    public final Path f6513a;

    /* renamed from: b, reason: collision with root package name */
    public final BiConsumer<Path, Path> f6514b;

    /* renamed from: c, reason: collision with root package name */
    public final Predicate<Path> f6515c;

    public b0(Path basePath, Predicate<Path> filter, BiConsumer<Path, Path> consumer) {
        this.f6513a = basePath;
        this.f6515c = filter;
        this.f6514b = consumer;
    }

    public static /* synthetic */ String a(Path path) {
        return "I/O error visiting directory: " + path;
    }

    public static /* synthetic */ String b(Path path) {
        return "I/O error visiting file: " + path;
    }

    public FileVisitResult c(final Path dir, IOException ex2) {
        FileVisitResult fileVisitResult;
        if (ex2 != null) {
            f6512d.b(ex2, new Supplier() { // from class: ba0.a0
                @Override // java.util.function.Supplier
                public final Object get() {
                    return b0.a(dir);
                }
            });
        }
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }

    public FileVisitResult d(Path file, BasicFileAttributes attributes) {
        FileVisitResult fileVisitResult;
        if (this.f6515c.test(file)) {
            this.f6514b.accept(this.f6513a, file);
        }
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }

    public FileVisitResult e(final Path file, IOException ex2) {
        FileVisitResult fileVisitResult;
        f6512d.b(ex2, new Supplier() { // from class: ba0.z
            @Override // java.util.function.Supplier
            public final Object get() {
                return b0.b(file);
            }
        });
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult postVisitDirectory(Object dir, IOException ex2) throws IOException {
        return c(io.ktor.server.engine.u0.a(dir), ex2);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object file, BasicFileAttributes attributes) throws IOException {
        return d(io.ktor.server.engine.u0.a(file), attributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFileFailed(Object file, IOException ex2) throws IOException {
        return e(io.ktor.server.engine.u0.a(file), ex2);
    }
}
