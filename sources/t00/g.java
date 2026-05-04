package t00;

import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/DirectoryEntriesReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,180:1\n1#2:181\n*E\n"})
/* loaded from: classes8.dex */
public final class g extends SimpleFileVisitor<Path> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f89135a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public u f89136b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public a00.m<u> f89137c = new a00.m<>();

    public g(boolean z11) {
        this.f89135a = z11;
    }

    public final boolean a() {
        return this.f89135a;
    }

    @m80.k
    public FileVisitResult b(@m80.k Path dir, @m80.k BasicFileAttributes attrs) {
        Object fileKey;
        kotlin.jvm.internal.g0.p(dir, "dir");
        kotlin.jvm.internal.g0.p(attrs, "attrs");
        fileKey = attrs.fileKey();
        this.f89137c.add(new u(dir, fileKey, this.f89136b));
        FileVisitResult preVisitDirectory = super.preVisitDirectory(dir, attrs);
        kotlin.jvm.internal.g0.o(preVisitDirectory, "preVisitDirectory(...)");
        return preVisitDirectory;
    }

    @m80.k
    public final List<u> c(@m80.k u directoryNode) {
        kotlin.jvm.internal.g0.p(directoryNode, "directoryNode");
        this.f89136b = directoryNode;
        Files.walkFileTree(directoryNode.d(), t.f89184a.b(this.f89135a), 1, io.ktor.server.engine.h0.a(this));
        this.f89137c.removeFirst();
        a00.m<u> mVar = this.f89137c;
        this.f89137c = new a00.m<>();
        return mVar;
    }

    @m80.k
    public FileVisitResult d(@m80.k Path file, @m80.k BasicFileAttributes attrs) {
        kotlin.jvm.internal.g0.p(file, "file");
        kotlin.jvm.internal.g0.p(attrs, "attrs");
        this.f89137c.add(new u(file, null, this.f89136b));
        FileVisitResult visitFile = super.visitFile(file, attrs);
        kotlin.jvm.internal.g0.o(visitFile, "visitFile(...)");
        return visitFile;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        return b(io.ktor.server.engine.u0.a(obj), basicFileAttributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        return d(io.ktor.server.engine.u0.a(obj), basicFileAttributes);
    }
}
