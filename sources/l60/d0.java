package l60;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nJvmOkio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmOkio.kt\nokio/InputStreamSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,234:1\n1#2:235\n85#3:236\n*S KotlinDebug\n*F\n+ 1 JvmOkio.kt\nokio/InputStreamSource\n*L\n93#1:236\n*E\n"})
/* loaded from: classes8.dex */
public class d0 implements g1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final InputStream f70391a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final i1 f70392b;

    public d0(@m80.k InputStream input, @m80.k i1 timeout) {
        kotlin.jvm.internal.g0.p(input, "input");
        kotlin.jvm.internal.g0.p(timeout, "timeout");
        this.f70391a = input;
        this.f70392b = timeout;
    }

    @Override // l60.g1
    @m80.k
    public i1 D() {
        return this.f70392b;
    }

    @Override // l60.g1
    public long L3(@m80.k k sink, long j11) {
        kotlin.jvm.internal.g0.p(sink, "sink");
        if (j11 == 0) {
            return 0L;
        }
        if (j11 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
        }
        try {
            this.f70392b.j();
            c1 m12 = sink.m1(1);
            int read = this.f70391a.read(m12.f70383a, m12.f70385c, (int) Math.min(j11, 8192 - m12.f70385c));
            if (read != -1) {
                m12.f70385c += read;
                long j12 = read;
                sink.g1(sink.size() + j12);
                return j12;
            }
            if (m12.f70384b != m12.f70385c) {
                return -1L;
            }
            sink.f70446a = m12.b();
            d1.d(m12);
            return -1L;
        } catch (AssertionError e11) {
            if (m60.z.b(e11)) {
                throw new IOException(e11);
            }
            throw e11;
        }
    }

    @Override // l60.g1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f70391a.close();
    }

    @m80.k
    public String toString() {
        return "source(" + this.f70391a + ')';
    }
}
