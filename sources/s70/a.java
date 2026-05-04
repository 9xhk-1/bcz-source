package s70;

import d80.d;
import java.io.IOException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import org.apache.http.HttpHost;
import org.apache.http.conn.ssl.AllowAllHostnameVerifier;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.DefaultHostnameVerifier;
import org.apache.http.conn.ssl.StrictHostnameVerifier;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.conn.util.PublicSuffixMatcherLoader;
import org.apache.http.nio.reactor.ssl.SSLMode;
import pn.j;
import q70.i;
import y70.e;
import y70.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class a implements i {

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final X509HostnameVerifier f88105e = new AllowAllHostnameVerifier();

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final X509HostnameVerifier f88106f = new BrowserCompatHostnameVerifier();

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final X509HostnameVerifier f88107g = new StrictHostnameVerifier();

    /* renamed from: a, reason: collision with root package name */
    public final SSLContext f88108a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f88109b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f88110c;

    /* renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f88111d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: s70.a$a, reason: collision with other inner class name */
    public class C1153a implements f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ HttpHost f88112a;

        public C1153a(HttpHost httpHost) {
            this.f88112a = httpHost;
        }

        @Override // y70.f
        public void a(x70.f fVar, SSLSession sSLSession) throws SSLException {
            a.this.k(this.f88112a, fVar, sSLSession);
        }

        @Override // y70.f
        public void b(SSLEngine sSLEngine) throws SSLException {
            if (a.this.f88109b != null) {
                sSLEngine.setEnabledProtocols(a.this.f88109b);
            }
            if (a.this.f88110c != null) {
                sSLEngine.setEnabledCipherSuites(a.this.f88110c);
            }
            a.this.h(sSLEngine);
        }
    }

    @Deprecated
    public a(SSLContext sSLContext, String[] strArr, String[] strArr2, X509HostnameVerifier x509HostnameVerifier) {
        this(sSLContext, strArr, strArr2, (HostnameVerifier) x509HostnameVerifier);
    }

    public static HostnameVerifier e() {
        return new DefaultHostnameVerifier(PublicSuffixMatcherLoader.getDefault());
    }

    public static a f() {
        return new a(d.a(), e());
    }

    public static a g() {
        return new a(d.b(), i(System.getProperty("https.protocols")), i(System.getProperty("https.cipherSuites")), e());
    }

    public static String[] i(String str) {
        if (e80.i.b(str)) {
            return null;
        }
        return str.split(" *, *");
    }

    @Override // q70.i
    public boolean b() {
        return true;
    }

    @Override // q70.i
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public e a(HttpHost httpHost, x70.f fVar) throws IOException {
        e80.b.a(!(fVar instanceof e), "I/O session is already upgraded to TLS/SSL");
        e eVar = new e(fVar, SSLMode.CLIENT, httpHost, this.f88108a, new C1153a(httpHost));
        fVar.b(e.f99492o, eVar);
        eVar.y();
        return eVar;
    }

    public void k(HttpHost httpHost, x70.f fVar, SSLSession sSLSession) throws SSLException {
        if (this.f88111d.verify(httpHost.getHostName(), sSLSession)) {
            return;
        }
        throw new SSLPeerUnverifiedException("Host name '" + httpHost.getHostName() + "' does not match the certificate subject provided by the peer (" + ((X509Certificate) sSLSession.getPeerCertificates()[0]).getSubjectX500Principal().toString() + j.f81007d);
    }

    @Deprecated
    public a(SSLContext sSLContext, X509HostnameVerifier x509HostnameVerifier) {
        this(sSLContext, (String[]) null, (String[]) null, (HostnameVerifier) x509HostnameVerifier);
    }

    public a(SSLContext sSLContext, String[] strArr, String[] strArr2, HostnameVerifier hostnameVerifier) {
        this.f88108a = (SSLContext) e80.a.j(sSLContext, "SSL context");
        this.f88109b = strArr;
        this.f88110c = strArr2;
        this.f88111d = hostnameVerifier == null ? e() : hostnameVerifier;
    }

    public a(SSLContext sSLContext, HostnameVerifier hostnameVerifier) {
        this(sSLContext, (String[]) null, (String[]) null, hostnameVerifier);
    }

    public a(SSLContext sSLContext) {
        this(sSLContext, (String[]) null, (String[]) null, e());
    }

    public void h(SSLEngine sSLEngine) {
    }
}
