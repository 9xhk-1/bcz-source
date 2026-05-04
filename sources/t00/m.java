package t00;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f89140a;

    /* renamed from: b, reason: collision with root package name */
    public int f89141b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<Exception> f89142c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public Path f89143d;

    public m() {
        this(0, 1, null);
    }

    public final void a(@m80.k Exception exception) {
        Throwable initCause;
        kotlin.jvm.internal.g0.p(exception, "exception");
        this.f89141b++;
        if (this.f89142c.size() < this.f89140a) {
            if (this.f89143d != null) {
                l.a();
                initCause = k.a(String.valueOf(this.f89143d)).initCause(exception);
                kotlin.jvm.internal.g0.n(initCause, "null cannot be cast to non-null type java.nio.file.FileSystemException");
                exception = j.a(initCause);
            }
            this.f89142c.add(exception);
        }
    }

    public final void b(@m80.k Path name) {
        kotlin.jvm.internal.g0.p(name, "name");
        Path path = this.f89143d;
        this.f89143d = path != null ? path.resolve(name) : null;
    }

    public final void c(@m80.k Path name) {
        kotlin.jvm.internal.g0.p(name, "name");
        Path path = this.f89143d;
        if (!kotlin.jvm.internal.g0.g(name, path != null ? path.getFileName() : null)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Path path2 = this.f89143d;
        this.f89143d = path2 != null ? path2.getParent() : null;
    }

    @m80.k
    public final List<Exception> d() {
        return this.f89142c;
    }

    @m80.l
    public final Path e() {
        return this.f89143d;
    }

    public final int f() {
        return this.f89141b;
    }

    public final void g(@m80.l Path path) {
        this.f89143d = path;
    }

    public m(int i11) {
        this.f89140a = i11;
        this.f89142c = new ArrayList();
    }

    public /* synthetic */ m(int i11, int i12, kotlin.jvm.internal.v vVar) {
        this((i12 & 1) != 0 ? 64 : i11);
    }
}
