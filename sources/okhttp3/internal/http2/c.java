package okhttp3.internal.http2;

import androidx.collection.SieveCacheKt;
import c60.g;
import g10.j;
import g10.u;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import l60.g1;
import l60.i1;
import l60.m;
import m80.k;
import okhttp3.internal.http2.a;
import okio.ByteString;
import u50.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f77417e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final Logger f77418f;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final m f77419a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f77420b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final b f77421c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.C0949a f77422d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final Logger a() {
            return c.f77418f;
        }

        public final int b(int i11, int i12, int i13) throws IOException {
            if ((i12 & 8) != 0) {
                i11--;
            }
            if (i13 <= i11) {
                return i11 - i13;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i13 + " > remaining length " + i11);
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: okhttp3.internal.http2.c$c, reason: collision with other inner class name */
    public interface InterfaceC0954c {
        void a(int i11, int i12, @k List<c60.a> list) throws IOException;

        void b(boolean z11, int i11, int i12);

        void c(int i11, @k ErrorCode errorCode);

        void d(int i11, @k ErrorCode errorCode, @k ByteString byteString);

        void e(boolean z11, int i11, int i12, @k List<c60.a> list);

        void f(int i11, long j11);

        void i(int i11, @k String str, @k ByteString byteString, @k String str2, int i12, long j11);

        void j();

        void k(boolean z11, int i11, @k m mVar, int i12) throws IOException;

        void l(boolean z11, @k g gVar);

        void m(int i11, int i12, int i13, boolean z11);
    }

    static {
        Logger logger = Logger.getLogger(c60.b.class.getName());
        g0.o(logger, "getLogger(Http2::class.java.name)");
        f77418f = logger;
    }

    public c(@k m source, boolean z11) {
        g0.p(source, "source");
        this.f77419a = source;
        this.f77420b = z11;
        b bVar = new b(source);
        this.f77421c = bVar;
        this.f77422d = new a.C0949a(bVar, 4096, 0, 4, null);
    }

    public final void C(InterfaceC0954c interfaceC0954c, int i11, int i12, int i13) throws IOException {
        if (i13 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int d11 = (i12 & 8) != 0 ? f.d(this.f77419a.readByte(), 255) : 0;
        interfaceC0954c.a(i13, this.f77419a.readInt() & Integer.MAX_VALUE, j(f77417e.b(i11 - 4, i12, d11), d11, i12, i13));
    }

    public final void E(InterfaceC0954c interfaceC0954c, int i11, int i12, int i13) throws IOException {
        if (i11 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i11 + " != 4");
        }
        if (i13 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int readInt = this.f77419a.readInt();
        ErrorCode a11 = ErrorCode.Companion.a(readInt);
        if (a11 != null) {
            interfaceC0954c.c(i13, a11);
            return;
        }
        throw new IOException("TYPE_RST_STREAM unexpected error code: " + readInt);
    }

    public final void H(InterfaceC0954c interfaceC0954c, int i11, int i12, int i13) throws IOException {
        int readInt;
        if (i13 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i12 & 1) != 0) {
            if (i11 != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            interfaceC0954c.j();
            return;
        }
        if (i11 % 6 != 0) {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i11);
        }
        g gVar = new g();
        j B1 = u.B1(u.W1(0, i11), 6);
        int d11 = B1.d();
        int f11 = B1.f();
        int g11 = B1.g();
        if ((g11 > 0 && d11 <= f11) || (g11 < 0 && f11 <= d11)) {
            while (true) {
                int e11 = f.e(this.f77419a.readShort(), 65535);
                readInt = this.f77419a.readInt();
                if (e11 != 2) {
                    if (e11 == 3) {
                        e11 = 4;
                    } else if (e11 != 4) {
                        if (e11 == 5 && (readInt < 16384 || readInt > 16777215)) {
                            break;
                        }
                    } else {
                        if (readInt < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        e11 = 7;
                    }
                } else if (readInt != 0 && readInt != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                gVar.k(e11, readInt);
                if (d11 == f11) {
                    break;
                } else {
                    d11 += g11;
                }
            }
            throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + readInt);
        }
        interfaceC0954c.l(false, gVar);
    }

    public final void I(InterfaceC0954c interfaceC0954c, int i11, int i12, int i13) throws IOException {
        if (i11 != 4) {
            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i11);
        }
        long f11 = f.f(this.f77419a.readInt(), SieveCacheKt.NodeLinkMask);
        if (f11 == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        interfaceC0954c.f(i13, f11);
    }

    public final boolean c(boolean z11, @k InterfaceC0954c handler) throws IOException {
        g0.p(handler, "handler");
        try {
            this.f77419a.F(9L);
            int V = f.V(this.f77419a);
            if (V > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + V);
            }
            int d11 = f.d(this.f77419a.readByte(), 255);
            int d12 = f.d(this.f77419a.readByte(), 255);
            int readInt = this.f77419a.readInt() & Integer.MAX_VALUE;
            Logger logger = f77418f;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(c60.b.f8138a.c(true, readInt, V, d11, d12));
            }
            if (z11 && d11 != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + c60.b.f8138a.b(d11));
            }
            switch (d11) {
                case 0:
                    f(handler, V, d12, readInt);
                    return true;
                case 1:
                    k(handler, V, d12, readInt);
                    return true;
                case 2:
                    w(handler, V, d12, readInt);
                    return true;
                case 3:
                    E(handler, V, d12, readInt);
                    return true;
                case 4:
                    H(handler, V, d12, readInt);
                    return true;
                case 5:
                    C(handler, V, d12, readInt);
                    return true;
                case 6:
                    q(handler, V, d12, readInt);
                    return true;
                case 7:
                    i(handler, V, d12, readInt);
                    return true;
                case 8:
                    I(handler, V, d12, readInt);
                    return true;
                default:
                    this.f77419a.skip(V);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f77419a.close();
    }

    public final void e(@k InterfaceC0954c handler) throws IOException {
        g0.p(handler, "handler");
        if (this.f77420b) {
            if (!c(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        m mVar = this.f77419a;
        ByteString byteString = c60.b.f8139b;
        ByteString h22 = mVar.h2(byteString.size());
        Logger logger = f77418f;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(f.y("<< CONNECTION " + h22.hex(), new Object[0]));
        }
        if (g0.g(byteString, h22)) {
            return;
        }
        throw new IOException("Expected a connection header but was " + h22.utf8());
    }

    public final void f(InterfaceC0954c interfaceC0954c, int i11, int i12, int i13) throws IOException {
        if (i13 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z11 = (i12 & 1) != 0;
        if ((i12 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int d11 = (i12 & 8) != 0 ? f.d(this.f77419a.readByte(), 255) : 0;
        interfaceC0954c.k(z11, i13, this.f77419a, f77417e.b(i11, i12, d11));
        this.f77419a.skip(d11);
    }

    public final void i(InterfaceC0954c interfaceC0954c, int i11, int i12, int i13) throws IOException {
        if (i11 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i11);
        }
        if (i13 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int readInt = this.f77419a.readInt();
        int readInt2 = this.f77419a.readInt();
        int i14 = i11 - 8;
        ErrorCode a11 = ErrorCode.Companion.a(readInt2);
        if (a11 == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + readInt2);
        }
        ByteString byteString = ByteString.EMPTY;
        if (i14 > 0) {
            byteString = this.f77419a.h2(i14);
        }
        interfaceC0954c.d(readInt, a11, byteString);
    }

    public final List<c60.a> j(int i11, int i12, int i13, int i14) throws IOException {
        this.f77421c.r(i11);
        b bVar = this.f77421c;
        bVar.w(bVar.c());
        this.f77421c.C(i12);
        this.f77421c.q(i13);
        this.f77421c.E(i14);
        this.f77422d.l();
        return this.f77422d.e();
    }

    public final void k(InterfaceC0954c interfaceC0954c, int i11, int i12, int i13) throws IOException {
        if (i13 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z11 = (i12 & 1) != 0;
        int d11 = (i12 & 8) != 0 ? f.d(this.f77419a.readByte(), 255) : 0;
        if ((i12 & 32) != 0) {
            r(interfaceC0954c, i13);
            i11 -= 5;
        }
        interfaceC0954c.e(z11, i13, -1, j(f77417e.b(i11, i12, d11), d11, i12, i13));
    }

    public final void q(InterfaceC0954c interfaceC0954c, int i11, int i12, int i13) throws IOException {
        if (i11 != 8) {
            throw new IOException("TYPE_PING length != 8: " + i11);
        }
        if (i13 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        interfaceC0954c.b((i12 & 1) != 0, this.f77419a.readInt(), this.f77419a.readInt());
    }

    public final void r(InterfaceC0954c interfaceC0954c, int i11) throws IOException {
        int readInt = this.f77419a.readInt();
        interfaceC0954c.m(i11, readInt & Integer.MAX_VALUE, f.d(this.f77419a.readByte(), 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    public final void w(InterfaceC0954c interfaceC0954c, int i11, int i12, int i13) throws IOException {
        if (i11 == 5) {
            if (i13 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            r(interfaceC0954c, i13);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i11 + " != 5");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements g1 {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final m f77423a;

        /* renamed from: b, reason: collision with root package name */
        public int f77424b;

        /* renamed from: c, reason: collision with root package name */
        public int f77425c;

        /* renamed from: d, reason: collision with root package name */
        public int f77426d;

        /* renamed from: e, reason: collision with root package name */
        public int f77427e;

        /* renamed from: f, reason: collision with root package name */
        public int f77428f;

        public b(@k m source) {
            g0.p(source, "source");
            this.f77423a = source;
        }

        public final void C(int i11) {
            this.f77428f = i11;
        }

        @Override // l60.g1
        @k
        public i1 D() {
            return this.f77423a.D();
        }

        public final void E(int i11) {
            this.f77426d = i11;
        }

        @Override // l60.g1
        public long L3(@k l60.k sink, long j11) throws IOException {
            g0.p(sink, "sink");
            while (true) {
                int i11 = this.f77427e;
                if (i11 != 0) {
                    long L3 = this.f77423a.L3(sink, Math.min(j11, i11));
                    if (L3 == -1) {
                        return -1L;
                    }
                    this.f77427e -= (int) L3;
                    return L3;
                }
                this.f77423a.skip(this.f77428f);
                this.f77428f = 0;
                if ((this.f77425c & 4) != 0) {
                    return -1L;
                }
                k();
            }
        }

        public final int a() {
            return this.f77425c;
        }

        public final int c() {
            return this.f77427e;
        }

        public final int e() {
            return this.f77424b;
        }

        public final int f() {
            return this.f77428f;
        }

        public final int j() {
            return this.f77426d;
        }

        public final void k() throws IOException {
            int i11 = this.f77426d;
            int V = f.V(this.f77423a);
            this.f77427e = V;
            this.f77424b = V;
            int d11 = f.d(this.f77423a.readByte(), 255);
            this.f77425c = f.d(this.f77423a.readByte(), 255);
            a aVar = c.f77417e;
            if (aVar.a().isLoggable(Level.FINE)) {
                aVar.a().fine(c60.b.f8138a.c(true, this.f77426d, this.f77424b, d11, this.f77425c));
            }
            int readInt = this.f77423a.readInt() & Integer.MAX_VALUE;
            this.f77426d = readInt;
            if (d11 == 9) {
                if (readInt != i11) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(d11 + " != TYPE_CONTINUATION");
            }
        }

        public final void q(int i11) {
            this.f77425c = i11;
        }

        public final void r(int i11) {
            this.f77427e = i11;
        }

        public final void w(int i11) {
            this.f77424b = i11;
        }

        @Override // l60.g1, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }
}
