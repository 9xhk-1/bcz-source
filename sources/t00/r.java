package t00;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class r extends SimpleFileVisitor<Path> {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final x00.p<Path, BasicFileAttributes, FileVisitResult> f89180a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final x00.p<Path, BasicFileAttributes, FileVisitResult> f89181b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final x00.p<Path, IOException, FileVisitResult> f89182c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final x00.p<Path, IOException, FileVisitResult> f89183d;

    /* JADX WARN: Multi-variable type inference failed */
    public r(@m80.l x00.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar, @m80.l x00.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar2, @m80.l x00.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar3, @m80.l x00.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar4) {
        this.f89180a = pVar;
        this.f89181b = pVar2;
        this.f89182c = pVar3;
        this.f89183d = pVar4;
    }

    @m80.k
    public FileVisitResult a(@m80.k Path dir, @m80.l IOException iOException) {
        FileVisitResult a11;
        kotlin.jvm.internal.g0.p(dir, "dir");
        x00.p<Path, IOException, FileVisitResult> pVar = this.f89183d;
        if (pVar != null && (a11 = q.a(pVar.invoke(dir, iOException))) != null) {
            return a11;
        }
        FileVisitResult postVisitDirectory = super.postVisitDirectory(dir, iOException);
        kotlin.jvm.internal.g0.o(postVisitDirectory, "postVisitDirectory(...)");
        return postVisitDirectory;
    }

    @m80.k
    public FileVisitResult b(@m80.k Path dir, @m80.k BasicFileAttributes attrs) {
        FileVisitResult a11;
        kotlin.jvm.internal.g0.p(dir, "dir");
        kotlin.jvm.internal.g0.p(attrs, "attrs");
        x00.p<Path, BasicFileAttributes, FileVisitResult> pVar = this.f89180a;
        if (pVar != null && (a11 = q.a(pVar.invoke(dir, attrs))) != null) {
            return a11;
        }
        FileVisitResult preVisitDirectory = super.preVisitDirectory(dir, attrs);
        kotlin.jvm.internal.g0.o(preVisitDirectory, "preVisitDirectory(...)");
        return preVisitDirectory;
    }

    @m80.k
    public FileVisitResult c(@m80.k Path file, @m80.k BasicFileAttributes attrs) {
        FileVisitResult a11;
        kotlin.jvm.internal.g0.p(file, "file");
        kotlin.jvm.internal.g0.p(attrs, "attrs");
        x00.p<Path, BasicFileAttributes, FileVisitResult> pVar = this.f89181b;
        if (pVar != null && (a11 = q.a(pVar.invoke(file, attrs))) != null) {
            return a11;
        }
        FileVisitResult visitFile = super.visitFile(file, attrs);
        kotlin.jvm.internal.g0.o(visitFile, "visitFile(...)");
        return visitFile;
    }

    @m80.k
    public FileVisitResult d(@m80.k Path file, @m80.k IOException exc) {
        FileVisitResult a11;
        kotlin.jvm.internal.g0.p(file, "file");
        kotlin.jvm.internal.g0.p(exc, "exc");
        x00.p<Path, IOException, FileVisitResult> pVar = this.f89182c;
        if (pVar != null && (a11 = q.a(pVar.invoke(file, exc))) != null) {
            return a11;
        }
        FileVisitResult visitFileFailed = super.visitFileFailed(file, exc);
        kotlin.jvm.internal.g0.o(visitFileFailed, "visitFileFailed(...)");
        return visitFileFailed;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult postVisitDirectory(Object obj, IOException iOException) {
        return a(io.ktor.server.engine.u0.a(obj), iOException);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        return b(io.ktor.server.engine.u0.a(obj), basicFileAttributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        return c(io.ktor.server.engine.u0.a(obj), basicFileAttributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFileFailed(Object obj, IOException iOException) {
        return d(io.ktor.server.engine.u0.a(obj), iOException);
    }
}
