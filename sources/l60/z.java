package l60;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import yz.c2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nGzipSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GzipSource.kt\nokio/GzipSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 4 GzipSource.kt\nokio/-GzipSourceExtensions\n+ 5 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,222:1\n1#2:223\n63#3:224\n63#3:226\n63#3:228\n63#3:229\n63#3:230\n63#3:232\n63#3:234\n204#4:225\n204#4:227\n204#4:231\n204#4:233\n88#5:235\n*S KotlinDebug\n*F\n+ 1 GzipSource.kt\nokio/GzipSource\n*L\n103#1:224\n105#1:226\n117#1:228\n118#1:229\n120#1:230\n131#1:232\n142#1:234\n104#1:225\n115#1:227\n128#1:231\n139#1:233\n185#1:235\n*E\n"})
/* loaded from: classes8.dex */
public final class z implements g1 {

    /* renamed from: a, reason: collision with root package name */
    public byte f70531a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final b1 f70532b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final Inflater f70533c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final c0 f70534d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final CRC32 f70535e;

    public z(@m80.k g1 source) {
        kotlin.jvm.internal.g0.p(source, "source");
        b1 b1Var = new b1(source);
        this.f70532b = b1Var;
        Inflater inflater = new Inflater(true);
        this.f70533c = inflater;
        this.f70534d = new c0((m) b1Var, inflater);
        this.f70535e = new CRC32();
    }

    @Override // l60.g1
    @m80.k
    public i1 D() {
        return this.f70532b.D();
    }

    @Override // l60.g1
    public long L3(@m80.k k sink, long j11) throws IOException {
        z zVar;
        kotlin.jvm.internal.g0.p(sink, "sink");
        if (j11 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
        }
        if (j11 == 0) {
            return 0L;
        }
        if (this.f70531a == 0) {
            c();
            this.f70531a = (byte) 1;
        }
        if (this.f70531a == 1) {
            long size = sink.size();
            long L3 = this.f70534d.L3(sink, j11);
            if (L3 != -1) {
                f(sink, size, L3);
                return L3;
            }
            zVar = this;
            zVar.f70531a = (byte) 2;
        } else {
            zVar = this;
        }
        if (zVar.f70531a == 2) {
            e();
            zVar.f70531a = (byte) 3;
            if (!zVar.f70532b.J()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    public final void a(String str, int i11, int i12) {
        if (i12 == i11) {
            return;
        }
        throw new IOException(str + ": actual 0x" + u30.k0.m4(h.u(i12), 8, '0') + " != expected 0x" + u30.k0.m4(h.u(i11), 8, '0'));
    }

    public final void c() throws IOException {
        this.f70532b.F(10L);
        byte x02 = this.f70532b.f70371b.x0(3L);
        boolean z11 = ((x02 >> 1) & 1) == 1;
        if (z11) {
            f(this.f70532b.f70371b, 0L, 10L);
        }
        a("ID1ID2", 8075, this.f70532b.readShort());
        this.f70532b.skip(8L);
        if (((x02 >> 2) & 1) == 1) {
            this.f70532b.F(2L);
            if (z11) {
                f(this.f70532b.f70371b, 0L, 2L);
            }
            long v12 = this.f70532b.f70371b.v1() & c2.f100412d;
            this.f70532b.F(v12);
            if (z11) {
                f(this.f70532b.f70371b, 0L, v12);
            }
            this.f70532b.skip(v12);
        }
        if (((x02 >> 3) & 1) == 1) {
            long U1 = this.f70532b.U1((byte) 0);
            if (U1 == -1) {
                throw new EOFException();
            }
            if (z11) {
                f(this.f70532b.f70371b, 0L, U1 + 1);
            }
            this.f70532b.skip(U1 + 1);
        }
        if (((x02 >> 4) & 1) == 1) {
            long U12 = this.f70532b.U1((byte) 0);
            if (U12 == -1) {
                throw new EOFException();
            }
            if (z11) {
                f(this.f70532b.f70371b, 0L, U12 + 1);
            }
            this.f70532b.skip(U12 + 1);
        }
        if (z11) {
            a("FHCRC", this.f70532b.v1(), (short) this.f70535e.getValue());
            this.f70535e.reset();
        }
    }

    @Override // l60.g1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f70534d.close();
    }

    public final void e() throws IOException {
        a("CRC", this.f70532b.b8(), (int) this.f70535e.getValue());
        a("ISIZE", this.f70532b.b8(), (int) this.f70533c.getBytesWritten());
    }

    public final void f(k kVar, long j11, long j12) {
        c1 c1Var = kVar.f70446a;
        kotlin.jvm.internal.g0.m(c1Var);
        while (true) {
            int i11 = c1Var.f70385c;
            int i12 = c1Var.f70384b;
            if (j11 < i11 - i12) {
                break;
            }
            j11 -= i11 - i12;
            c1Var = c1Var.f70388f;
            kotlin.jvm.internal.g0.m(c1Var);
        }
        while (j12 > 0) {
            int min = (int) Math.min(c1Var.f70385c - r6, j12);
            this.f70535e.update(c1Var.f70383a, (int) (c1Var.f70384b + j11), min);
            j12 -= min;
            c1Var = c1Var.f70388f;
            kotlin.jvm.internal.g0.m(c1Var);
            j11 = 0;
        }
    }
}
