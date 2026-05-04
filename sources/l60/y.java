package l60;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.DeprecationLevel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nGzipSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GzipSink.kt\nokio/GzipSink\n+ 2 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,152:1\n51#2:153\n1#3:154\n85#4:155\n*S KotlinDebug\n*F\n+ 1 GzipSink.kt\nokio/GzipSink\n*L\n62#1:153\n130#1:155\n*E\n"})
/* loaded from: classes8.dex */
public final class y implements e1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final a1 f70512a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Deflater f70513b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final p f70514c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f70515d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final CRC32 f70516e;

    public y(@m80.k e1 sink) {
        kotlin.jvm.internal.g0.p(sink, "sink");
        a1 a1Var = new a1(sink);
        this.f70512a = a1Var;
        Deflater deflater = new Deflater(m60.b0.b(), true);
        this.f70513b = deflater;
        this.f70514c = new p((l) a1Var, deflater);
        this.f70516e = new CRC32();
        k kVar = a1Var.f70363b;
        kVar.writeShort(8075);
        kVar.writeByte(8);
        kVar.writeByte(0);
        kVar.writeInt(0);
        kVar.writeByte(0);
        kVar.writeByte(0);
    }

    @Override // l60.e1
    @m80.k
    public i1 D() {
        return this.f70512a.D();
    }

    @w00.j(name = "-deprecated_deflater")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @yz.w0(expression = "deflater", imports = {}))
    @m80.k
    public final Deflater a() {
        return this.f70513b;
    }

    @w00.j(name = "deflater")
    @m80.k
    public final Deflater c() {
        return this.f70513b;
    }

    @Override // l60.e1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f70515d) {
            return;
        }
        try {
            this.f70514c.c();
            f();
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f70513b.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.f70512a.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f70515d = true;
        if (th != null) {
            throw th;
        }
    }

    public final void e(k kVar, long j11) {
        c1 c1Var = kVar.f70446a;
        kotlin.jvm.internal.g0.m(c1Var);
        while (j11 > 0) {
            int min = (int) Math.min(j11, c1Var.f70385c - c1Var.f70384b);
            this.f70516e.update(c1Var.f70383a, c1Var.f70384b, min);
            j11 -= min;
            c1Var = c1Var.f70388f;
            kotlin.jvm.internal.g0.m(c1Var);
        }
    }

    public final void f() {
        this.f70512a.z2((int) this.f70516e.getValue());
        this.f70512a.z2((int) this.f70513b.getBytesRead());
    }

    @Override // l60.e1, java.io.Flushable
    public void flush() throws IOException {
        this.f70514c.flush();
    }

    @Override // l60.e1
    public void y8(@m80.k k source, long j11) throws IOException {
        kotlin.jvm.internal.g0.p(source, "source");
        if (j11 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
        }
        if (j11 == 0) {
            return;
        }
        e(source, j11);
        this.f70514c.y8(source, j11);
    }
}
