package y40;

import java.io.EOFException;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRealSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealSource.kt\nkotlinx/io/RealSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -Util.kt\nkotlinx/io/_UtilKt\n*L\n1#1,162:1\n159#1:163\n160#1:165\n159#1:167\n160#1:169\n159#1:170\n160#1:172\n159#1:176\n160#1:178\n159#1:180\n160#1:182\n1#2:164\n1#2:166\n1#2:168\n1#2:171\n1#2:173\n1#2:177\n1#2:179\n1#2:181\n1#2:183\n38#3:174\n110#3:175\n*S KotlinDebug\n*F\n+ 1 RealSource.kt\nkotlinx/io/RealSource\n*L\n38#1:163\n38#1:165\n51#1:167\n51#1:169\n60#1:170\n60#1:172\n127#1:176\n127#1:178\n144#1:180\n144#1:182\n38#1:164\n51#1:168\n60#1:171\n127#1:177\n144#1:181\n74#1:174\n80#1:175\n*E\n"})
/* loaded from: classes8.dex */
public final class r implements c0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final p f99312a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public boolean f99313b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final b f99314c;

    public r(@m80.k p source) {
        kotlin.jvm.internal.g0.p(source, "source");
        this.f99312a = source;
        this.f99314c = new b();
    }

    @Override // y40.c0
    public void F(long j11) {
        if (request(j11)) {
            return;
        }
        throw new EOFException("Source doesn't contain required number of bytes (" + j11 + ").");
    }

    @Override // y40.c0
    public boolean J() {
        if (this.f99313b) {
            throw new IllegalStateException("Source is closed.");
        }
        return this.f99314c.J() && this.f99312a.r2(this.f99314c, 8192L) == -1;
    }

    @Override // y40.c0
    public void R2(@m80.k o sink, long j11) {
        kotlin.jvm.internal.g0.p(sink, "sink");
        try {
            F(j11);
            this.f99314c.R2(sink, j11);
        } catch (EOFException e11) {
            sink.i6(this.f99314c, this.f99314c.r());
            throw e11;
        }
    }

    @Override // y40.c0
    public long S1(@m80.k o sink) {
        kotlin.jvm.internal.g0.p(sink, "sink");
        long j11 = 0;
        while (this.f99312a.r2(this.f99314c, 8192L) != -1) {
            long c11 = this.f99314c.c();
            if (c11 > 0) {
                j11 += c11;
                sink.i6(this.f99314c, c11);
            }
        }
        if (this.f99314c.r() <= 0) {
            return j11;
        }
        long r11 = j11 + this.f99314c.r();
        b bVar = this.f99314c;
        sink.i6(bVar, bVar.r());
        return r11;
    }

    public final void a() {
        if (this.f99313b) {
            throw new IllegalStateException("Source is closed.");
        }
    }

    @m80.k
    public final p c() {
        return this.f99312a;
    }

    @Override // y40.c0
    public int c7(@m80.k byte[] sink, int i11, int i12) {
        kotlin.jvm.internal.g0.p(sink, "sink");
        k0.e(sink.length, i11, i12);
        if (this.f99314c.r() == 0 && this.f99312a.r2(this.f99314c, 8192L) == -1) {
            return -1;
        }
        return this.f99314c.c7(sink, i11, ((int) Math.min(i12 - i11, this.f99314c.r())) + i11);
    }

    @Override // y40.p, java.lang.AutoCloseable
    public void close() {
        if (this.f99313b) {
            return;
        }
        this.f99313b = true;
        this.f99312a.close();
        this.f99314c.a();
    }

    @Override // y40.c0, y40.x
    @m80.k
    public b getBuffer() {
        return this.f99314c;
    }

    @Override // y40.c0
    @m80.k
    public c0 peek() {
        if (this.f99313b) {
            throw new IllegalStateException("Source is closed.");
        }
        return g.b(new n(this));
    }

    @Override // y40.p
    public long r2(@m80.k b sink, long j11) {
        kotlin.jvm.internal.g0.p(sink, "sink");
        if (this.f99313b) {
            throw new IllegalStateException("Source is closed.");
        }
        if (j11 < 0) {
            throw new IllegalArgumentException(("byteCount: " + j11).toString());
        }
        if (this.f99314c.r() == 0 && this.f99312a.r2(this.f99314c, 8192L) == -1) {
            return -1L;
        }
        return this.f99314c.r2(sink, Math.min(j11, this.f99314c.r()));
    }

    @Override // y40.c0
    public byte readByte() {
        F(1L);
        return this.f99314c.readByte();
    }

    @Override // y40.c0
    public int readInt() {
        F(4L);
        return this.f99314c.readInt();
    }

    @Override // y40.c0
    public long readLong() {
        F(8L);
        return this.f99314c.readLong();
    }

    @Override // y40.c0
    public short readShort() {
        F(2L);
        return this.f99314c.readShort();
    }

    @Override // y40.c0
    public boolean request(long j11) {
        if (this.f99313b) {
            throw new IllegalStateException("Source is closed.");
        }
        if (j11 >= 0) {
            while (this.f99314c.r() < j11) {
                if (this.f99312a.r2(this.f99314c, 8192L) == -1) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException(("byteCount: " + j11).toString());
    }

    @Override // y40.c0
    public void skip(long j11) {
        if (this.f99313b) {
            throw new IllegalStateException("Source is closed.");
        }
        if (j11 < 0) {
            throw new IllegalArgumentException(("byteCount: " + j11).toString());
        }
        long j12 = j11;
        while (j12 > 0) {
            if (this.f99314c.r() == 0 && this.f99312a.r2(this.f99314c, 8192L) == -1) {
                throw new EOFException("Source exhausted before skipping " + j11 + " bytes (only " + (j12 - j11) + " bytes were skipped).");
            }
            long min = Math.min(j12, this.f99314c.r());
            this.f99314c.skip(min);
            j12 -= min;
        }
    }

    @m80.k
    public String toString() {
        return "buffered(" + this.f99312a + ')';
    }

    @k
    public static /* synthetic */ void N() {
    }
}
