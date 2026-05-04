package l60;

import java.io.IOException;
import kotlin.DeprecationLevel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class w implements g1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final g1 f70502a;

    public w(@m80.k g1 delegate) {
        kotlin.jvm.internal.g0.p(delegate, "delegate");
        this.f70502a = delegate;
    }

    @Override // l60.g1
    @m80.k
    public i1 D() {
        return this.f70502a.D();
    }

    @Override // l60.g1
    public long L3(@m80.k k sink, long j11) throws IOException {
        kotlin.jvm.internal.g0.p(sink, "sink");
        return this.f70502a.L3(sink, j11);
    }

    @w00.j(name = "-deprecated_delegate")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @yz.w0(expression = "delegate", imports = {}))
    @m80.k
    public final g1 a() {
        return this.f70502a;
    }

    @w00.j(name = "delegate")
    @m80.k
    public final g1 c() {
        return this.f70502a;
    }

    @Override // l60.g1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f70502a.close();
    }

    @m80.k
    public String toString() {
        return getClass().getSimpleName() + '(' + this.f70502a + ')';
    }
}
