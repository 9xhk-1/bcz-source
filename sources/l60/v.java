package l60;

import java.io.IOException;
import kotlin.DeprecationLevel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class v implements e1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final e1 f70498a;

    public v(@m80.k e1 delegate) {
        kotlin.jvm.internal.g0.p(delegate, "delegate");
        this.f70498a = delegate;
    }

    @Override // l60.e1
    @m80.k
    public i1 D() {
        return this.f70498a.D();
    }

    @w00.j(name = "-deprecated_delegate")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @yz.w0(expression = "delegate", imports = {}))
    @m80.k
    public final e1 a() {
        return this.f70498a;
    }

    @w00.j(name = "delegate")
    @m80.k
    public final e1 c() {
        return this.f70498a;
    }

    @Override // l60.e1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f70498a.close();
    }

    @Override // l60.e1, java.io.Flushable
    public void flush() throws IOException {
        this.f70498a.flush();
    }

    @m80.k
    public String toString() {
        return getClass().getSimpleName() + '(' + this.f70498a + ')';
    }

    @Override // l60.e1
    public void y8(@m80.k k source, long j11) throws IOException {
        kotlin.jvm.internal.g0.p(source, "source");
        this.f70498a.y8(source, j11);
    }
}
