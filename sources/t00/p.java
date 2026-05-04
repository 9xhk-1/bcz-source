package t00;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class p implements o {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public x00.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> f89161a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public x00.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> f89162b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public x00.p<? super Path, ? super IOException, ? extends FileVisitResult> f89163c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public x00.p<? super Path, ? super IOException, ? extends FileVisitResult> f89164d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f89165e;

    @Override // t00.o
    public void a(@m80.k x00.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function) {
        kotlin.jvm.internal.g0.p(function, "function");
        f();
        g(this.f89162b, "onVisitFile");
        this.f89162b = function;
    }

    @Override // t00.o
    public void b(@m80.k x00.p<? super Path, ? super IOException, ? extends FileVisitResult> function) {
        kotlin.jvm.internal.g0.p(function, "function");
        f();
        g(this.f89164d, "onPostVisitDirectory");
        this.f89164d = function;
    }

    @Override // t00.o
    public void c(@m80.k x00.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function) {
        kotlin.jvm.internal.g0.p(function, "function");
        f();
        g(this.f89161a, "onPreVisitDirectory");
        this.f89161a = function;
    }

    @Override // t00.o
    public void d(@m80.k x00.p<? super Path, ? super IOException, ? extends FileVisitResult> function) {
        kotlin.jvm.internal.g0.p(function, "function");
        f();
        g(this.f89163c, "onVisitFileFailed");
        this.f89163c = function;
    }

    @m80.k
    public final FileVisitor<Path> e() {
        f();
        this.f89165e = true;
        return io.ktor.server.engine.h0.a(new r(this.f89161a, this.f89162b, this.f89163c, this.f89164d));
    }

    public final void f() {
        if (this.f89165e) {
            throw new IllegalStateException("This builder was already built");
        }
    }

    public final void g(Object obj, String str) {
        if (obj == null) {
            return;
        }
        throw new IllegalStateException(str + " was already defined");
    }
}
