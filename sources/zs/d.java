package zs;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import u30.k0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f102880a;

    /* renamed from: b, reason: collision with root package name */
    public final int f102881b;

    /* renamed from: c, reason: collision with root package name */
    public final int f102882c;

    /* renamed from: d, reason: collision with root package name */
    public final int f102883d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SocketFactory f102884e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Socket f102885f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public InputStream f102886g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public OutputStream f102887h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSocketTransport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocketTransport.kt\ncom/microsoft/thrifty/transport/SocketTransport$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n1#2:155\n*E\n"})
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f102888a;

        /* renamed from: b, reason: collision with root package name */
        public final int f102889b;

        /* renamed from: c, reason: collision with root package name */
        public int f102890c;

        /* renamed from: d, reason: collision with root package name */
        public int f102891d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public SocketFactory f102892e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f102893f;

        public a(@k String host, int i11) {
            g0.p(host, "host");
            if (k0.O3(host)) {
                throw new IllegalArgumentException("host must not be null or empty");
            }
            if (i11 >= 0 && i11 < 65536) {
                this.f102888a = host;
                this.f102889b = i11;
            } else {
                throw new IllegalArgumentException(("Invalid port number: " + i11).toString());
            }
        }

        @k
        public final d a() {
            return new d(this);
        }

        @k
        public final a b(int i11) {
            if (i11 < 0) {
                throw new IllegalArgumentException("connectTimeout cannot be negative");
            }
            this.f102891d = i11;
            return this;
        }

        @k
        public final a c(boolean z11) {
            this.f102893f = z11;
            return this;
        }

        public final int d() {
            return this.f102891d;
        }

        @k
        public final SocketFactory e() {
            if (this.f102893f) {
                SocketFactory socketFactory = SSLSocketFactory.getDefault();
                g0.m(socketFactory);
                return socketFactory;
            }
            SocketFactory socketFactory2 = SocketFactory.getDefault();
            g0.m(socketFactory2);
            return socketFactory2;
        }

        public final boolean f() {
            return this.f102893f;
        }

        @k
        public final String g() {
            return this.f102888a;
        }

        public final int h() {
            return this.f102889b;
        }

        public final int i() {
            return this.f102890c;
        }

        @l
        public final SocketFactory j() {
            return this.f102892e;
        }

        @k
        public final a k(int i11) {
            if (i11 < 0) {
                throw new IllegalArgumentException("readTimeout cannot be negative");
            }
            this.f102890c = i11;
            return this;
        }

        public final void l(int i11) {
            this.f102891d = i11;
        }

        public final void m(boolean z11) {
            this.f102893f = z11;
        }

        public final void n(int i11) {
            this.f102890c = i11;
        }

        public final void o(@l SocketFactory socketFactory) {
            this.f102892e = socketFactory;
        }

        @k
        public final a p(@l SocketFactory socketFactory) {
            if (socketFactory == null) {
                throw new IllegalArgumentException("socketFactory");
            }
            this.f102892e = socketFactory;
            return this;
        }
    }

    public d(@k a builder) {
        g0.p(builder, "builder");
        this.f102880a = builder.g();
        this.f102881b = builder.h();
        this.f102882c = builder.i();
        this.f102883d = builder.d();
        SocketFactory j11 = builder.j();
        this.f102884e = j11 == null ? builder.e() : j11;
    }

    public final void a() throws IOException {
        if (this.f102885f == null) {
            this.f102885f = this.f102884e.createSocket();
        }
        Socket socket = this.f102885f;
        g0.m(socket);
        socket.setTcpNoDelay(true);
        Socket socket2 = this.f102885f;
        g0.m(socket2);
        socket2.setSoLinger(false, 0);
        Socket socket3 = this.f102885f;
        g0.m(socket3);
        socket3.setKeepAlive(true);
        Socket socket4 = this.f102885f;
        g0.m(socket4);
        socket4.setSoTimeout(this.f102882c);
        Socket socket5 = this.f102885f;
        g0.m(socket5);
        socket5.connect(new InetSocketAddress(this.f102880a, this.f102881b), this.f102883d);
        Socket socket6 = this.f102885f;
        g0.m(socket6);
        this.f102886g = socket6.getInputStream();
        Socket socket7 = this.f102885f;
        g0.m(socket7);
        this.f102887h = socket7.getOutputStream();
    }

    public final boolean c() {
        Socket socket = this.f102885f;
        return (socket == null || !socket.isConnected() || socket.isClosed()) ? false : true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Socket socket = this.f102885f;
        InputStream inputStream = this.f102886g;
        OutputStream outputStream = this.f102887h;
        this.f102885f = null;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused2) {
            }
        }
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused3) {
            }
        }
    }

    @Override // zs.e
    @l
    public Object g(@k j00.c<? super g2> cVar) throws IOException {
        OutputStream outputStream = this.f102887h;
        g0.m(outputStream);
        outputStream.flush();
        return g2.f100423a;
    }

    @Override // zs.e
    public int read(@k byte[] buffer, int i11, int i12) throws IOException {
        g0.p(buffer, "buffer");
        InputStream inputStream = this.f102886g;
        g0.m(inputStream);
        return inputStream.read(buffer, i11, i12);
    }

    @Override // zs.e
    public void write(@k byte[] buffer, int i11, int i12) throws IOException {
        g0.p(buffer, "buffer");
        OutputStream outputStream = this.f102887h;
        g0.m(outputStream);
        outputStream.write(buffer, i11, i12);
    }
}
