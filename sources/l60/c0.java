package l60;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nInflaterSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InflaterSource.kt\nokio/InflaterSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,132:1\n1#2:133\n85#3:134\n*S KotlinDebug\n*F\n+ 1 InflaterSource.kt\nokio/InflaterSource\n*L\n66#1:134\n*E\n"})
/* loaded from: classes8.dex */
public final class c0 implements g1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m f70376a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Inflater f70377b;

    /* renamed from: c, reason: collision with root package name */
    public int f70378c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f70379d;

    public c0(@m80.k m source, @m80.k Inflater inflater) {
        kotlin.jvm.internal.g0.p(source, "source");
        kotlin.jvm.internal.g0.p(inflater, "inflater");
        this.f70376a = source;
        this.f70377b = inflater;
    }

    @Override // l60.g1
    @m80.k
    public i1 D() {
        return this.f70376a.D();
    }

    @Override // l60.g1
    public long L3(@m80.k k sink, long j11) throws IOException {
        kotlin.jvm.internal.g0.p(sink, "sink");
        do {
            long a11 = a(sink, j11);
            if (a11 > 0) {
                return a11;
            }
            if (this.f70377b.finished() || this.f70377b.needsDictionary()) {
                return -1L;
            }
        } while (!this.f70376a.J());
        throw new EOFException("source exhausted prematurely");
    }

    public final long a(@m80.k k sink, long j11) throws IOException {
        kotlin.jvm.internal.g0.p(sink, "sink");
        if (j11 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
        }
        if (this.f70379d) {
            throw new IllegalStateException("closed");
        }
        if (j11 == 0) {
            return 0L;
        }
        try {
            c1 m12 = sink.m1(1);
            int min = (int) Math.min(j11, 8192 - m12.f70385c);
            c();
            int inflate = this.f70377b.inflate(m12.f70383a, m12.f70385c, min);
            e();
            if (inflate > 0) {
                m12.f70385c += inflate;
                long j12 = inflate;
                sink.g1(sink.size() + j12);
                return j12;
            }
            if (m12.f70384b == m12.f70385c) {
                sink.f70446a = m12.b();
                d1.d(m12);
            }
            return 0L;
        } catch (DataFormatException e11) {
            throw new IOException(e11);
        }
    }

    public final boolean c() throws IOException {
        if (!this.f70377b.needsInput()) {
            return false;
        }
        if (this.f70376a.J()) {
            return true;
        }
        c1 c1Var = this.f70376a.getBuffer().f70446a;
        kotlin.jvm.internal.g0.m(c1Var);
        int i11 = c1Var.f70385c;
        int i12 = c1Var.f70384b;
        int i13 = i11 - i12;
        this.f70378c = i13;
        this.f70377b.setInput(c1Var.f70383a, i12, i13);
        return false;
    }

    @Override // l60.g1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f70379d) {
            return;
        }
        this.f70377b.end();
        this.f70379d = true;
        this.f70376a.close();
    }

    public final void e() {
        int i11 = this.f70378c;
        if (i11 == 0) {
            return;
        }
        int remaining = i11 - this.f70377b.getRemaining();
        this.f70378c -= remaining;
        this.f70376a.skip(remaining);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c0(@m80.k g1 source, @m80.k Inflater inflater) {
        this(r0.e(source), inflater);
        kotlin.jvm.internal.g0.p(source, "source");
        kotlin.jvm.internal.g0.p(inflater, "inflater");
    }
}
