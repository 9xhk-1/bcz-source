package j70;

import a80.h;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpHost;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.i;
import org.apache.http.j;
import org.apache.http.params.HttpParams;
import v60.f;
import x60.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes9.dex */
public class a implements b80.b<HttpHost, i> {

    /* renamed from: a, reason: collision with root package name */
    public final SocketFactory f63695a;

    /* renamed from: b, reason: collision with root package name */
    public final SSLSocketFactory f63696b;

    /* renamed from: c, reason: collision with root package name */
    public final int f63697c;

    /* renamed from: d, reason: collision with root package name */
    public final f f63698d;

    /* renamed from: e, reason: collision with root package name */
    public final j<? extends i> f63699e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: j70.a$a, reason: collision with other inner class name */
    public class C0737a implements PrivilegedExceptionAction<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Socket f63700a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InetSocketAddress f63701b;

        public C0737a(Socket socket, InetSocketAddress inetSocketAddress) {
            this.f63700a = socket;
            this.f63701b = inetSocketAddress;
        }

        @Override // java.security.PrivilegedExceptionAction
        public Object run() throws IOException {
            this.f63700a.connect(this.f63701b, a.this.f63697c);
            return null;
        }
    }

    @Deprecated
    public a(SSLSocketFactory sSLSocketFactory, HttpParams httpParams) {
        e80.a.j(httpParams, "HTTP params");
        this.f63695a = null;
        this.f63696b = sSLSocketFactory;
        this.f63697c = httpParams.getIntParameter(a80.b.f2296f, 0);
        this.f63698d = h.c(httpParams);
        this.f63699e = new x60.f(h.a(httpParams));
    }

    @Deprecated
    public i c(Socket socket, HttpParams httpParams) throws IOException {
        e eVar = new e(httpParams.getIntParameter(a80.b.f2293c, 8192));
        eVar.c(socket);
        return eVar;
    }

    @Override // b80.b
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public i a(HttpHost httpHost) throws IOException {
        Socket createSocket;
        String schemeName = httpHost.getSchemeName();
        if ("http".equalsIgnoreCase(schemeName)) {
            SocketFactory socketFactory = this.f63695a;
            createSocket = socketFactory != null ? socketFactory.createSocket() : new Socket();
        } else {
            if (!"https".equalsIgnoreCase(schemeName)) {
                throw new IOException(schemeName + " scheme is not supported");
            }
            SocketFactory socketFactory2 = this.f63696b;
            if (socketFactory2 == null) {
                socketFactory2 = SSLSocketFactory.getDefault();
            }
            createSocket = socketFactory2.createSocket();
        }
        String hostName = httpHost.getHostName();
        int port = httpHost.getPort();
        if (port == -1) {
            if (httpHost.getSchemeName().equalsIgnoreCase("http")) {
                port = 80;
            } else if (httpHost.getSchemeName().equalsIgnoreCase("https")) {
                port = 443;
            }
        }
        createSocket.setSoTimeout(this.f63698d.h());
        if (this.f63698d.f() > 0) {
            createSocket.setSendBufferSize(this.f63698d.f());
        }
        if (this.f63698d.e() > 0) {
            createSocket.setReceiveBufferSize(this.f63698d.e());
        }
        createSocket.setTcpNoDelay(this.f63698d.l());
        int g11 = this.f63698d.g();
        if (g11 >= 0) {
            createSocket.setSoLinger(true, g11);
        }
        createSocket.setKeepAlive(this.f63698d.i());
        try {
            AccessController.doPrivileged(new C0737a(createSocket, new InetSocketAddress(hostName, port)));
            return this.f63699e.a(createSocket);
        } catch (PrivilegedActionException e11) {
            e80.b.a(e11.getCause() instanceof IOException, "method contract violation only checked exceptions are wrapped: " + e11.getCause());
            throw ((IOException) e11.getCause());
        }
    }

    @Deprecated
    public a(HttpParams httpParams) {
        this((SSLSocketFactory) null, httpParams);
    }

    public a(SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, int i11, f fVar, v60.a aVar) {
        this.f63695a = socketFactory;
        this.f63696b = sSLSocketFactory;
        this.f63697c = i11;
        this.f63698d = fVar == null ? f.f93136i : fVar;
        this.f63699e = new x60.f(aVar == null ? v60.a.f93116g : aVar);
    }

    public a(int i11, f fVar, v60.a aVar) {
        this(null, null, i11, fVar, aVar);
    }

    public a(f fVar, v60.a aVar) {
        this(null, null, 0, fVar, aVar);
    }

    public a() {
        this(null, null, 0, f.f93136i, v60.a.f93116g);
    }
}
