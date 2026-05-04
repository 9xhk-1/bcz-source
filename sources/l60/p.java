package l60;

import java.io.IOException;
import java.util.zip.Deflater;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDeflaterSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeflaterSink.kt\nokio/DeflaterSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,140:1\n85#2:141\n*S KotlinDebug\n*F\n+ 1 DeflaterSink.kt\nokio/DeflaterSink\n*L\n39#1:141\n*E\n"})
/* loaded from: classes8.dex */
public final class p implements e1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l f70475a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Deflater f70476b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f70477c;

    public p(@m80.k l sink, @m80.k Deflater deflater) {
        kotlin.jvm.internal.g0.p(sink, "sink");
        kotlin.jvm.internal.g0.p(deflater, "deflater");
        this.f70475a = sink;
        this.f70476b = deflater;
    }

    @Override // l60.e1
    @m80.k
    public i1 D() {
        return this.f70475a.D();
    }

    public final void a(boolean z11) {
        c1 m12;
        int deflate;
        k buffer = this.f70475a.getBuffer();
        while (true) {
            m12 = buffer.m1(1);
            if (z11) {
                try {
                    Deflater deflater = this.f70476b;
                    byte[] bArr = m12.f70383a;
                    int i11 = m12.f70385c;
                    deflate = deflater.deflate(bArr, i11, 8192 - i11, 2);
                } catch (NullPointerException e11) {
                    throw new IOException("Deflater already closed", e11);
                }
            } else {
                Deflater deflater2 = this.f70476b;
                byte[] bArr2 = m12.f70383a;
                int i12 = m12.f70385c;
                deflate = deflater2.deflate(bArr2, i12, 8192 - i12);
            }
            if (deflate > 0) {
                m12.f70385c += deflate;
                buffer.g1(buffer.size() + deflate);
                this.f70475a.X4();
            } else if (this.f70476b.needsInput()) {
                break;
            }
        }
        if (m12.f70384b == m12.f70385c) {
            buffer.f70446a = m12.b();
            d1.d(m12);
        }
    }

    public final void c() {
        this.f70476b.finish();
        a(false);
    }

    @Override // l60.e1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f70477c) {
            return;
        }
        try {
            c();
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f70476b.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.f70475a.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f70477c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // l60.e1, java.io.Flushable
    public void flush() throws IOException {
        a(true);
        this.f70475a.flush();
    }

    @m80.k
    public String toString() {
        return "DeflaterSink(" + this.f70475a + ')';
    }

    @Override // l60.e1
    public void y8(@m80.k k source, long j11) throws IOException {
        kotlin.jvm.internal.g0.p(source, "source");
        h.e(source.size(), 0L, j11);
        while (j11 > 0) {
            c1 c1Var = source.f70446a;
            kotlin.jvm.internal.g0.m(c1Var);
            int min = (int) Math.min(j11, c1Var.f70385c - c1Var.f70384b);
            this.f70476b.setInput(c1Var.f70383a, c1Var.f70384b, min);
            a(false);
            long j12 = min;
            source.g1(source.size() - j12);
            int i11 = c1Var.f70384b + min;
            c1Var.f70384b = i11;
            if (i11 == c1Var.f70385c) {
                source.f70446a = c1Var.b();
                d1.d(c1Var);
            }
            j11 -= j12;
        }
        this.f70476b.setInput(m60.b0.c(), 0, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(@m80.k e1 sink, @m80.k Deflater deflater) {
        this(r0.d(sink), deflater);
        kotlin.jvm.internal.g0.p(sink, "sink");
        kotlin.jvm.internal.g0.p(deflater, "deflater");
    }
}
