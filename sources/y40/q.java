package y40;

import java.io.EOFException;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRealSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealSink.kt\nkotlinx/io/RealSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -Util.kt\nkotlinx/io/_UtilKt\n*L\n1#1,158:1\n155#1:159\n156#1:161\n155#1:163\n156#1:165\n155#1:167\n156#1:169\n155#1:170\n156#1:172\n155#1:174\n156#1:176\n155#1:177\n156#1:179\n155#1:180\n156#1:182\n155#1:183\n156#1:185\n155#1:186\n156#1:188\n155#1:189\n156#1:191\n155#1:192\n156#1:194\n1#2:160\n1#2:162\n1#2:164\n1#2:168\n1#2:171\n1#2:173\n1#2:175\n1#2:178\n1#2:181\n1#2:184\n1#2:187\n1#2:190\n1#2:193\n1#2:195\n38#3:166\n*S KotlinDebug\n*F\n+ 1 RealSink.kt\nkotlinx/io/RealSink\n*L\n39#1:159\n39#1:161\n46#1:163\n46#1:165\n53#1:167\n53#1:169\n65#1:170\n65#1:172\n82#1:174\n82#1:176\n88#1:177\n88#1:179\n94#1:180\n94#1:182\n100#1:183\n100#1:185\n107#1:186\n107#1:188\n113#1:189\n113#1:191\n119#1:192\n119#1:194\n39#1:160\n46#1:164\n53#1:168\n65#1:171\n82#1:175\n88#1:178\n94#1:181\n100#1:184\n107#1:187\n113#1:190\n119#1:193\n47#1:166\n*E\n"})
/* loaded from: classes8.dex */
public final class q implements x {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final o f99309a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public boolean f99310b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final b f99311c;

    public q(@m80.k o sink) {
        kotlin.jvm.internal.g0.p(sink, "sink");
        this.f99309a = sink;
        this.f99311c = new b();
    }

    private final void a() {
        if (this.f99310b) {
            throw new IllegalStateException("Sink is closed.");
        }
    }

    @Override // y40.x
    public void A() {
        if (this.f99310b) {
            throw new IllegalStateException("Sink is closed.");
        }
        long r11 = this.f99311c.r();
        if (r11 > 0) {
            this.f99309a.i6(this.f99311c, r11);
        }
    }

    @Override // y40.x
    public void I0(@m80.k p source, long j11) {
        kotlin.jvm.internal.g0.p(source, "source");
        if (this.f99310b) {
            throw new IllegalStateException("Sink is closed.");
        }
        if (j11 < 0) {
            throw new IllegalArgumentException(("byteCount: " + j11).toString());
        }
        long j12 = j11;
        while (j12 > 0) {
            long r22 = source.r2(this.f99311c, j12);
            if (r22 == -1) {
                throw new EOFException("Source exhausted before reading " + j11 + " bytes from it (number of bytes read: " + (j11 - j12) + ").");
            }
            j12 -= r22;
            U0();
        }
    }

    @Override // y40.x
    public long T(@m80.k p source) {
        kotlin.jvm.internal.g0.p(source, "source");
        if (this.f99310b) {
            throw new IllegalStateException("Sink is closed.");
        }
        long j11 = 0;
        while (true) {
            long r22 = source.r2(this.f99311c, 8192L);
            if (r22 == -1) {
                return j11;
            }
            j11 += r22;
            U0();
        }
    }

    @Override // y40.x
    @k
    public void U0() {
        if (this.f99310b) {
            throw new IllegalStateException("Sink is closed.");
        }
        long c11 = this.f99311c.c();
        if (c11 > 0) {
            this.f99309a.i6(this.f99311c, c11);
        }
    }

    @m80.k
    public final o c() {
        return this.f99309a;
    }

    @Override // y40.o, java.lang.AutoCloseable
    public void close() {
        if (this.f99310b) {
            return;
        }
        try {
            if (this.f99311c.r() > 0) {
                o oVar = this.f99309a;
                b bVar = this.f99311c;
                oVar.i6(bVar, bVar.r());
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f99309a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f99310b = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // y40.x, y40.o, java.io.Flushable
    public void flush() {
        if (this.f99310b) {
            throw new IllegalStateException("Sink is closed.");
        }
        if (this.f99311c.r() > 0) {
            o oVar = this.f99309a;
            b bVar = this.f99311c;
            oVar.i6(bVar, bVar.r());
        }
        this.f99309a.flush();
    }

    @Override // y40.x
    @m80.k
    public b getBuffer() {
        return this.f99311c;
    }

    @Override // y40.o
    public void i6(@m80.k b source, long j11) {
        kotlin.jvm.internal.g0.p(source, "source");
        if (this.f99310b) {
            throw new IllegalStateException("Sink is closed.");
        }
        if (j11 >= 0) {
            this.f99311c.i6(source, j11);
            U0();
        } else {
            throw new IllegalArgumentException(("byteCount: " + j11).toString());
        }
    }

    @m80.k
    public String toString() {
        return "buffered(" + this.f99309a + ')';
    }

    @Override // y40.x
    public void u(byte b11) {
        if (this.f99310b) {
            throw new IllegalStateException("Sink is closed.");
        }
        this.f99311c.u(b11);
        U0();
    }

    @Override // y40.x
    public void write(@m80.k byte[] source, int i11, int i12) {
        kotlin.jvm.internal.g0.p(source, "source");
        if (this.f99310b) {
            throw new IllegalStateException("Sink is closed.");
        }
        k0.e(source.length, i11, i12);
        this.f99311c.write(source, i11, i12);
        U0();
    }

    @Override // y40.x
    public void writeInt(int i11) {
        if (this.f99310b) {
            throw new IllegalStateException("Sink is closed.");
        }
        this.f99311c.writeInt(i11);
        U0();
    }

    @Override // y40.x
    public void writeLong(long j11) {
        if (this.f99310b) {
            throw new IllegalStateException("Sink is closed.");
        }
        this.f99311c.writeLong(j11);
        U0();
    }

    @Override // y40.x
    public void writeShort(short s11) {
        if (this.f99310b) {
            throw new IllegalStateException("Sink is closed.");
        }
        this.f99311c.writeShort(s11);
        U0();
    }

    @h
    public static /* synthetic */ void N() {
    }
}
