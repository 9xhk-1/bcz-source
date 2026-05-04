package y40;

import java.io.EOFException;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.u0;
import yz.c2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nkotlinx/io/Buffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -Util.kt\nkotlinx/io/_UtilKt\n+ 4 Buffer.kt\nkotlinx/io/BufferKt\n+ 5 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n*L\n1#1,686:1\n628#1,14:689\n630#1,12:743\n1#2:687\n1#2:729\n1#2:734\n1#2:737\n1#2:741\n95#3:688\n52#3:728\n53#3:730\n107#3:731\n38#3:732\n52#3:733\n53#3:735\n52#3:736\n53#3:738\n38#3:739\n52#3:740\n53#3:742\n110#3:755\n89#3:759\n95#3:760\n659#4,25:703\n378#5,3:756\n381#5,3:761\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nkotlinx/io/Buffer\n*L\n228#1:689,14\n484#1:743,12\n290#1:729\n322#1:734\n330#1:737\n388#1:741\n118#1:688\n290#1:728\n290#1:730\n295#1:731\n307#1:732\n322#1:733\n322#1:735\n330#1:736\n330#1:738\n376#1:739\n388#1:740\n388#1:742\n562#1:755\n572#1:759\n573#1:760\n270#1:703,25\n566#1:756,3\n566#1:761,3\n*E\n"})
/* loaded from: classes8.dex */
public final class b implements c0, x {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public t f99289a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public t f99290b;

    /* renamed from: c, reason: collision with root package name */
    public long f99291c;

    public static /* synthetic */ void L(b bVar, t tVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if (bVar.k() == null) {
            bVar.V(tVar);
            bVar.a0(tVar);
            return;
        }
        if (!z11) {
            t E = bVar.E();
            kotlin.jvm.internal.g0.m(E);
            bVar.a0(E.q(tVar));
            return;
        }
        t E2 = bVar.E();
        kotlin.jvm.internal.g0.m(E2);
        bVar.a0(E2.q(tVar).a());
        t E3 = bVar.E();
        kotlin.jvm.internal.g0.m(E3);
        if (E3.j() == null) {
            bVar.V(bVar.E());
        }
    }

    public static /* synthetic */ void i(b bVar, b bVar2, long j11, long j12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 0;
        }
        long j13 = j11;
        if ((i11 & 4) != 0) {
            j12 = bVar.r();
        }
        bVar.f(bVar2, j13, j12);
    }

    public final /* synthetic */ t E() {
        return this.f99290b;
    }

    @Override // y40.c0
    public void F(long j11) {
        if (j11 < 0) {
            throw new IllegalArgumentException(("byteCount: " + j11).toString());
        }
        if (r() >= j11) {
            return;
        }
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + r() + ", required: " + j11 + ')');
    }

    public final void I(t tVar, boolean z11) {
        if (k() == null) {
            V(tVar);
            a0(tVar);
            return;
        }
        if (!z11) {
            t E = E();
            kotlin.jvm.internal.g0.m(E);
            a0(E.q(tVar));
            return;
        }
        t E2 = E();
        kotlin.jvm.internal.g0.m(E2);
        a0(E2.q(tVar).a());
        t E3 = E();
        kotlin.jvm.internal.g0.m(E3);
        if (E3.j() == null) {
            V(E());
        }
    }

    @Override // y40.x
    public void I0(@m80.k p source, long j11) {
        kotlin.jvm.internal.g0.p(source, "source");
        if (j11 < 0) {
            throw new IllegalArgumentException(("byteCount (" + j11 + ") < 0").toString());
        }
        long j12 = j11;
        while (j12 > 0) {
            long r22 = source.r2(this, j12);
            if (r22 == -1) {
                throw new EOFException("Source exhausted before reading " + j11 + " bytes. Only " + (j11 - j12) + " were read.");
            }
            j12 -= r22;
        }
    }

    @Override // y40.c0
    public boolean J() {
        return r() == 0;
    }

    @Override // y40.c0
    public void R2(@m80.k o sink, long j11) {
        kotlin.jvm.internal.g0.p(sink, "sink");
        if (j11 < 0) {
            throw new IllegalArgumentException(("byteCount (" + j11 + ") < 0").toString());
        }
        if (r() >= j11) {
            sink.i6(this, j11);
            return;
        }
        sink.i6(this, r());
        throw new EOFException("Buffer exhausted before writing " + j11 + " bytes. Only " + r() + " bytes were written.");
    }

    public final void S() {
        t tVar = this.f99289a;
        kotlin.jvm.internal.g0.m(tVar);
        t f11 = tVar.f();
        this.f99289a = f11;
        if (f11 == null) {
            this.f99290b = null;
        } else {
            f11.A(null);
        }
        tVar.y(null);
        w.h(tVar);
    }

    @Override // y40.c0
    public long S1(@m80.k o sink) {
        kotlin.jvm.internal.g0.p(sink, "sink");
        long r11 = r();
        if (r11 > 0) {
            sink.i6(this, r11);
        }
        return r11;
    }

    @Override // y40.x
    public long T(@m80.k p source) {
        kotlin.jvm.internal.g0.p(source, "source");
        long j11 = 0;
        while (true) {
            long r22 = source.r2(this, 8192L);
            if (r22 == -1) {
                return j11;
            }
            j11 += r22;
        }
    }

    @v0
    public final /* synthetic */ void U() {
        t tVar = this.f99290b;
        kotlin.jvm.internal.g0.m(tVar);
        t j11 = tVar.j();
        this.f99290b = j11;
        if (j11 == null) {
            this.f99289a = null;
        } else {
            j11.y(null);
        }
        tVar.A(null);
        w.h(tVar);
    }

    public final /* synthetic */ void V(t tVar) {
        this.f99289a = tVar;
    }

    public final /* synthetic */ void Z(long j11) {
        this.f99291c = j11;
    }

    public final void a() {
        skip(r());
    }

    public final /* synthetic */ void a0(t tVar) {
        this.f99290b = tVar;
    }

    public final long c() {
        long r11 = r();
        if (r11 == 0) {
            return 0L;
        }
        t tVar = this.f99290b;
        kotlin.jvm.internal.g0.m(tVar);
        return (tVar.d() >= 8192 || !tVar.f99325e) ? r11 : r11 - (tVar.d() - tVar.h());
    }

    public final Void c0(long j11) {
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + r() + ", required: " + j11 + ')');
    }

    @Override // y40.c0
    public int c7(@m80.k byte[] sink, int i11, int i12) {
        kotlin.jvm.internal.g0.p(sink, "sink");
        k0.e(sink.length, i11, i12);
        t tVar = this.f99289a;
        if (tVar == null) {
            return -1;
        }
        int min = Math.min(i12 - i11, tVar.n());
        tVar.v(sink, i11, i11 + min);
        this.f99291c -= min;
        if (v.d(tVar)) {
            S();
        }
        return min;
    }

    @v0
    public final /* synthetic */ t d0(int i11) {
        if (i11 < 1 || i11 > 8192) {
            throw new IllegalArgumentException(("unexpected capacity (" + i11 + "), should be in range [1, 8192]").toString());
        }
        t tVar = this.f99290b;
        if (tVar == null) {
            t j11 = w.j();
            this.f99289a = j11;
            this.f99290b = j11;
            return j11;
        }
        kotlin.jvm.internal.g0.m(tVar);
        if (tVar.d() + i11 <= 8192 && tVar.f99325e) {
            return tVar;
        }
        t q11 = tVar.q(w.j());
        this.f99290b = q11;
        return q11;
    }

    @m80.k
    public final b e() {
        b bVar = new b();
        if (r() == 0) {
            return bVar;
        }
        t tVar = this.f99289a;
        kotlin.jvm.internal.g0.m(tVar);
        t F = tVar.F();
        bVar.f99289a = F;
        bVar.f99290b = F;
        for (t f11 = tVar.f(); f11 != null; f11 = f11.f()) {
            t tVar2 = bVar.f99290b;
            kotlin.jvm.internal.g0.m(tVar2);
            bVar.f99290b = tVar2.q(f11.F());
        }
        bVar.f99291c = r();
        return bVar;
    }

    public final void f(@m80.k b out, long j11, long j12) {
        kotlin.jvm.internal.g0.p(out, "out");
        k0.e(r(), j11, j12);
        if (j11 == j12) {
            return;
        }
        long j13 = j12 - j11;
        out.f99291c += j13;
        t tVar = this.f99289a;
        long j14 = j11;
        while (true) {
            kotlin.jvm.internal.g0.m(tVar);
            if (j14 < tVar.d() - tVar.h()) {
                break;
            }
            j14 -= tVar.d() - tVar.h();
            tVar = tVar.f();
        }
        while (j13 > 0) {
            kotlin.jvm.internal.g0.m(tVar);
            t F = tVar.F();
            F.z(F.h() + ((int) j14));
            F.x(Math.min(F.h() + ((int) j13), F.d()));
            if (out.k() == null) {
                out.V(F);
                out.a0(F);
            } else {
                t E = out.E();
                kotlin.jvm.internal.g0.m(E);
                out.a0(E.q(F));
            }
            j13 -= F.d() - F.h();
            tVar = tVar.f();
            j14 = 0;
        }
    }

    @Override // y40.o
    public void i6(@m80.k b source, long j11) {
        kotlin.jvm.internal.g0.p(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        k0.g(source.f99291c, 0L, j11);
        while (j11 > 0) {
            kotlin.jvm.internal.g0.m(source.f99289a);
            if (j11 < r0.n()) {
                t tVar = this.f99290b;
                if (tVar != null && tVar.f99325e) {
                    if ((tVar.d() + j11) - (tVar.m() ? 0 : tVar.h()) <= 8192) {
                        t tVar2 = source.f99289a;
                        kotlin.jvm.internal.g0.m(tVar2);
                        tVar2.N(tVar, (int) j11);
                        source.f99291c -= j11;
                        this.f99291c += j11;
                        return;
                    }
                }
                t tVar3 = source.f99289a;
                kotlin.jvm.internal.g0.m(tVar3);
                source.f99289a = tVar3.G((int) j11);
            }
            t tVar4 = source.f99289a;
            kotlin.jvm.internal.g0.m(tVar4);
            long n11 = tVar4.n();
            t p11 = tVar4.p();
            source.f99289a = p11;
            if (p11 == null) {
                source.f99290b = null;
            }
            if (k() == null) {
                V(tVar4);
                a0(tVar4);
            } else {
                t E = E();
                kotlin.jvm.internal.g0.m(E);
                a0(E.q(tVar4).a());
                t E2 = E();
                kotlin.jvm.internal.g0.m(E2);
                if (E2.j() == null) {
                    V(E());
                }
            }
            source.f99291c -= n11;
            this.f99291c += n11;
            j11 -= n11;
        }
    }

    public final byte j(long j11) {
        long j12 = 0;
        if (j11 < 0 || j11 >= r()) {
            throw new IndexOutOfBoundsException("position (" + j11 + ") is not within the range [0..size(" + r() + dp.a.f48058d);
        }
        if (j11 == 0) {
            t tVar = this.f99289a;
            kotlin.jvm.internal.g0.m(tVar);
            return tVar.o(0);
        }
        if (k() == null) {
            kotlin.jvm.internal.g0.m(null);
            throw null;
        }
        if (r() - j11 >= j11) {
            t k11 = k();
            while (k11 != null) {
                long d11 = (k11.d() - k11.h()) + j12;
                if (d11 > j11) {
                    break;
                }
                k11 = k11.f();
                j12 = d11;
            }
            kotlin.jvm.internal.g0.m(k11);
            return k11.o((int) (j11 - j12));
        }
        t E = E();
        long r11 = r();
        while (E != null && r11 > j11) {
            r11 -= E.d() - E.h();
            if (r11 <= j11) {
                break;
            }
            E = E.j();
        }
        kotlin.jvm.internal.g0.m(E);
        return E.o((int) (j11 - r11));
    }

    public final /* synthetic */ t k() {
        return this.f99289a;
    }

    @Override // y40.c0
    @m80.k
    public c0 peek() {
        return g.b(new n(this));
    }

    public final long r() {
        return this.f99291c;
    }

    @Override // y40.p
    public long r2(@m80.k b sink, long j11) {
        kotlin.jvm.internal.g0.p(sink, "sink");
        if (j11 < 0) {
            throw new IllegalArgumentException(("byteCount (" + j11 + ") < 0").toString());
        }
        if (r() == 0) {
            return -1L;
        }
        if (j11 > r()) {
            j11 = r();
        }
        sink.i6(this, j11);
        return j11;
    }

    @Override // y40.c0
    public byte readByte() {
        t tVar = this.f99289a;
        if (tVar == null) {
            c0(1L);
            throw new KotlinNothingValueException();
        }
        int n11 = tVar.n();
        if (n11 == 0) {
            S();
            return readByte();
        }
        byte r11 = tVar.r();
        this.f99291c--;
        if (n11 == 1) {
            S();
        }
        return r11;
    }

    @Override // y40.c0
    public int readInt() {
        t tVar = this.f99289a;
        if (tVar == null) {
            c0(4L);
            throw new KotlinNothingValueException();
        }
        int n11 = tVar.n();
        if (n11 < 4) {
            F(4L);
            if (n11 != 0) {
                return (readShort() << 16) | (readShort() & c2.f100412d);
            }
            S();
            return readInt();
        }
        int s11 = tVar.s();
        this.f99291c -= 4;
        if (n11 == 4) {
            S();
        }
        return s11;
    }

    @Override // y40.c0
    public long readLong() {
        t tVar = this.f99289a;
        if (tVar == null) {
            c0(8L);
            throw new KotlinNothingValueException();
        }
        int n11 = tVar.n();
        if (n11 < 8) {
            F(8L);
            if (n11 != 0) {
                return (readInt() << 32) | (readInt() & 4294967295L);
            }
            S();
            return readLong();
        }
        long t11 = tVar.t();
        this.f99291c -= 8;
        if (n11 == 8) {
            S();
        }
        return t11;
    }

    @Override // y40.c0
    public short readShort() {
        t tVar = this.f99289a;
        if (tVar == null) {
            c0(2L);
            throw new KotlinNothingValueException();
        }
        int n11 = tVar.n();
        if (n11 < 2) {
            F(2L);
            if (n11 != 0) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            S();
            return readShort();
        }
        short u11 = tVar.u();
        this.f99291c -= 2;
        if (n11 == 2) {
            S();
        }
        return u11;
    }

    @Override // y40.c0
    public boolean request(long j11) {
        if (j11 >= 0) {
            return r() >= j11;
        }
        throw new IllegalArgumentException(("byteCount: " + j11 + " < 0").toString());
    }

    @Override // y40.c0
    public void skip(long j11) {
        if (j11 < 0) {
            throw new IllegalArgumentException(("byteCount (" + j11 + ") < 0").toString());
        }
        long j12 = j11;
        while (j12 > 0) {
            t tVar = this.f99289a;
            if (tVar == null) {
                throw new EOFException("Buffer exhausted before skipping " + j11 + " bytes.");
            }
            int min = (int) Math.min(j12, tVar.d() - tVar.h());
            long j13 = min;
            this.f99291c -= j13;
            j12 -= j13;
            tVar.z(tVar.h() + min);
            if (tVar.h() == tVar.d()) {
                S();
            }
        }
    }

    @m80.k
    public String toString() {
        if (r() == 0) {
            return "Buffer(size=0)";
        }
        long j11 = 64;
        int min = (int) Math.min(j11, r());
        StringBuilder sb2 = new StringBuilder((min * 2) + (r() > j11 ? 1 : 0));
        d50.d dVar = d50.d.f47268a;
        int i11 = 0;
        for (t k11 = k(); k11 != null; k11 = k11.f()) {
            d50.b bVar = d50.f.f47269a;
            int i12 = 0;
            while (i11 < min && i12 < k11.n()) {
                int i13 = i12 + 1;
                byte b11 = bVar.b(k11, i12);
                i11++;
                sb2.append(k0.h()[(b11 >> 4) & 15]);
                sb2.append(k0.h()[b11 & 15]);
                i12 = i13;
            }
        }
        if (r() > j11) {
            sb2.append((char) 8230);
        }
        return "Buffer(size=" + r() + " hex=" + ((Object) sb2) + ')';
    }

    @Override // y40.x
    public void u(byte b11) {
        d0(1).J(b11);
        this.f99291c++;
    }

    public final /* synthetic */ long w() {
        return this.f99291c;
    }

    @Override // y40.x
    public void write(@m80.k byte[] source, int i11, int i12) {
        kotlin.jvm.internal.g0.p(source, "source");
        k0.e(source.length, i11, i12);
        int i13 = i11;
        while (i13 < i12) {
            t d02 = d0(1);
            int min = Math.min(i12 - i13, d02.l()) + i13;
            d02.H(source, i13, min);
            i13 = min;
        }
        this.f99291c += i12 - i11;
    }

    @Override // y40.x
    public void writeInt(int i11) {
        d0(4).K(i11);
        this.f99291c += 4;
    }

    @Override // y40.x
    public void writeLong(long j11) {
        d0(8).L(j11);
        this.f99291c += 8;
    }

    @Override // y40.x
    public void writeShort(short s11) {
        d0(2).M(s11);
        this.f99291c += 2;
    }

    @v0
    public static /* synthetic */ void C() {
    }

    @v0
    public static /* synthetic */ void H() {
    }

    @k
    public static /* synthetic */ void N() {
    }

    @v0
    public static /* synthetic */ void q() {
    }

    @Override // y40.x
    public void A() {
    }

    @Override // y40.x
    @k
    public void U0() {
    }

    @Override // y40.p, java.lang.AutoCloseable
    public void close() {
    }

    @Override // y40.x, y40.o, java.io.Flushable
    public void flush() {
    }

    @Override // y40.c0, y40.x
    @m80.k
    public b getBuffer() {
        return this;
    }
}
