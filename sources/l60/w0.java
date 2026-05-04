package l60;

import java.io.OutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nJvmOkio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmOkio.kt\nokio/OutputStreamSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,234:1\n85#2:235\n*S KotlinDebug\n*F\n+ 1 JvmOkio.kt\nokio/OutputStreamSink\n*L\n56#1:235\n*E\n"})
/* loaded from: classes8.dex */
public final class w0 implements e1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final OutputStream f70503a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final i1 f70504b;

    public w0(@m80.k OutputStream out, @m80.k i1 timeout) {
        kotlin.jvm.internal.g0.p(out, "out");
        kotlin.jvm.internal.g0.p(timeout, "timeout");
        this.f70503a = out;
        this.f70504b = timeout;
    }

    @Override // l60.e1
    @m80.k
    public i1 D() {
        return this.f70504b;
    }

    @Override // l60.e1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f70503a.close();
    }

    @Override // l60.e1, java.io.Flushable
    public void flush() {
        this.f70503a.flush();
    }

    @m80.k
    public String toString() {
        return "sink(" + this.f70503a + ')';
    }

    @Override // l60.e1
    public void y8(@m80.k k source, long j11) {
        kotlin.jvm.internal.g0.p(source, "source");
        h.e(source.size(), 0L, j11);
        while (j11 > 0) {
            this.f70504b.j();
            c1 c1Var = source.f70446a;
            kotlin.jvm.internal.g0.m(c1Var);
            int min = (int) Math.min(j11, c1Var.f70385c - c1Var.f70384b);
            this.f70503a.write(c1Var.f70383a, c1Var.f70384b, min);
            c1Var.f70384b += min;
            long j12 = min;
            j11 -= j12;
            source.g1(source.size() - j12);
            if (c1Var.f70384b == c1Var.f70385c) {
                source.f70446a = c1Var.b();
                d1.d(c1Var);
            }
        }
    }
}
