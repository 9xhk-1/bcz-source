package kx;

import java.io.Closeable;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class u implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final s f69044a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final lx.d f69045b;

    public u(@m80.k s headers, @m80.k lx.d builder) {
        g0.p(headers, "headers");
        g0.p(builder, "builder");
        this.f69044a = headers;
        this.f69045b = builder;
    }

    @m80.k
    public final s a() {
        return this.f69044a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        release();
    }

    public final void release() {
        this.f69045b.P();
        this.f69044a.p();
    }
}
