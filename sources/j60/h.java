package j60;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l60.k;
import l60.m;
import m80.k;
import m80.l;
import okio.ByteString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nWebSocketReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketReader.kt\nokhttp3/internal/ws/WebSocketReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,298:1\n1#2:299\n*E\n"})
/* loaded from: classes8.dex */
public final class h implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f63642a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final m f63643b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final a f63644c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f63645d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f63646e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f63647f;

    /* renamed from: g, reason: collision with root package name */
    public int f63648g;

    /* renamed from: h, reason: collision with root package name */
    public long f63649h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f63650i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f63651j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f63652k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final l60.k f63653l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final l60.k f63654m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public c f63655n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final byte[] f63656o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public final k.a f63657p;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void a(@m80.k ByteString byteString);

        void c(@m80.k ByteString byteString);

        void e(int i11, @m80.k String str);

        void h(@m80.k ByteString byteString) throws IOException;

        void i(@m80.k String str) throws IOException;
    }

    public h(boolean z11, @m80.k m source, @m80.k a frameCallback, boolean z12, boolean z13) {
        g0.p(source, "source");
        g0.p(frameCallback, "frameCallback");
        this.f63642a = z11;
        this.f63643b = source;
        this.f63644c = frameCallback;
        this.f63645d = z12;
        this.f63646e = z13;
        this.f63653l = new l60.k();
        this.f63654m = new l60.k();
        this.f63656o = z11 ? null : new byte[4];
        this.f63657p = z11 ? null : new k.a();
    }

    @m80.k
    public final m a() {
        return this.f63643b;
    }

    public final void c() throws IOException {
        f();
        if (this.f63651j) {
            e();
        } else {
            k();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        c cVar = this.f63655n;
        if (cVar != null) {
            cVar.close();
        }
    }

    public final void e() throws IOException {
        short s11;
        String str;
        long j11 = this.f63649h;
        if (j11 > 0) {
            this.f63643b.T6(this.f63653l, j11);
            if (!this.f63642a) {
                l60.k kVar = this.f63653l;
                k.a aVar = this.f63657p;
                g0.m(aVar);
                kVar.P0(aVar);
                this.f63657p.i(0L);
                g gVar = g.f63619a;
                k.a aVar2 = this.f63657p;
                byte[] bArr = this.f63656o;
                g0.m(bArr);
                gVar.c(aVar2, bArr);
                this.f63657p.close();
            }
        }
        switch (this.f63648g) {
            case 8:
                long size = this.f63653l.size();
                if (size == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (size != 0) {
                    s11 = this.f63653l.readShort();
                    str = this.f63653l.R3();
                    String b11 = g.f63619a.b(s11);
                    if (b11 != null) {
                        throw new ProtocolException(b11);
                    }
                } else {
                    s11 = 1005;
                    str = "";
                }
                this.f63644c.e(s11, str);
                this.f63647f = true;
                return;
            case 9:
                this.f63644c.a(this.f63653l.q3());
                return;
            case 10:
                this.f63644c.c(this.f63653l.q3());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + u50.f.d0(this.f63648g));
        }
    }

    public final void f() throws IOException, ProtocolException {
        boolean z11;
        if (this.f63647f) {
            throw new IOException("closed");
        }
        long l11 = this.f63643b.D().l();
        this.f63643b.D().d();
        try {
            int d11 = u50.f.d(this.f63643b.readByte(), 255);
            this.f63643b.D().k(l11, TimeUnit.NANOSECONDS);
            int i11 = d11 & 15;
            this.f63648g = i11;
            boolean z12 = (d11 & 128) != 0;
            this.f63650i = z12;
            boolean z13 = (d11 & 8) != 0;
            this.f63651j = z13;
            if (z13 && !z12) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z14 = (d11 & 64) != 0;
            if (i11 == 1 || i11 == 2) {
                if (!z14) {
                    z11 = false;
                } else {
                    if (!this.f63645d) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z11 = true;
                }
                this.f63652k = z11;
            } else if (z14) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((d11 & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((d11 & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int d12 = u50.f.d(this.f63643b.readByte(), 255);
            boolean z15 = (d12 & 128) != 0;
            if (z15 == this.f63642a) {
                throw new ProtocolException(this.f63642a ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j11 = d12 & 127;
            this.f63649h = j11;
            if (j11 == 126) {
                this.f63649h = u50.f.e(this.f63643b.readShort(), 65535);
            } else if (j11 == 127) {
                long readLong = this.f63643b.readLong();
                this.f63649h = readLong;
                if (readLong < 0) {
                    throw new ProtocolException("Frame length 0x" + u50.f.e0(this.f63649h) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.f63651j && this.f63649h > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z15) {
                m mVar = this.f63643b;
                byte[] bArr = this.f63656o;
                g0.m(bArr);
                mVar.readFully(bArr);
            }
        } catch (Throwable th2) {
            this.f63643b.D().k(l11, TimeUnit.NANOSECONDS);
            throw th2;
        }
    }

    public final void j() throws IOException {
        while (!this.f63647f) {
            long j11 = this.f63649h;
            if (j11 > 0) {
                this.f63643b.T6(this.f63654m, j11);
                if (!this.f63642a) {
                    l60.k kVar = this.f63654m;
                    k.a aVar = this.f63657p;
                    g0.m(aVar);
                    kVar.P0(aVar);
                    this.f63657p.i(this.f63654m.size() - this.f63649h);
                    g gVar = g.f63619a;
                    k.a aVar2 = this.f63657p;
                    byte[] bArr = this.f63656o;
                    g0.m(bArr);
                    gVar.c(aVar2, bArr);
                    this.f63657p.close();
                }
            }
            if (this.f63650i) {
                return;
            }
            q();
            if (this.f63648g != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + u50.f.d0(this.f63648g));
            }
        }
        throw new IOException("closed");
    }

    public final void k() throws IOException {
        int i11 = this.f63648g;
        if (i11 != 1 && i11 != 2) {
            throw new ProtocolException("Unknown opcode: " + u50.f.d0(i11));
        }
        j();
        if (this.f63652k) {
            c cVar = this.f63655n;
            if (cVar == null) {
                cVar = new c(this.f63646e);
                this.f63655n = cVar;
            }
            cVar.a(this.f63654m);
        }
        if (i11 == 1) {
            this.f63644c.i(this.f63654m.R3());
        } else {
            this.f63644c.h(this.f63654m.q3());
        }
    }

    public final void q() throws IOException {
        while (!this.f63647f) {
            f();
            if (!this.f63651j) {
                return;
            } else {
                e();
            }
        }
    }
}
