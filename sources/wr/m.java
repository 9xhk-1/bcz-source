package wr;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.l;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import t50.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class m extends Thread {

    /* renamed from: i, reason: collision with root package name */
    public static final String f96731i = "m";

    /* renamed from: a, reason: collision with root package name */
    public SSLSocketFactory f96732a;

    /* renamed from: b, reason: collision with root package name */
    public HostnameVerifier f96733b;

    /* renamed from: c, reason: collision with root package name */
    public org.apache.http.conn.ssl.SSLSocketFactory f96734c;

    /* renamed from: d, reason: collision with root package name */
    public X509HostnameVerifier f96735d;

    /* renamed from: e, reason: collision with root package name */
    public SslErrorHandler f96736e;

    /* renamed from: f, reason: collision with root package name */
    public String f96737f;

    /* renamed from: g, reason: collision with root package name */
    public a f96738g;

    /* renamed from: h, reason: collision with root package name */
    public Context f96739h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void a(Context context, String str);

        void b(Context context, String str);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements t50.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f96740a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f96741b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f96742c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ SslErrorHandler f96743d;

        public b(a aVar, Context context, String str, SslErrorHandler sslErrorHandler) {
            this.f96740a = aVar;
            this.f96741b = context;
            this.f96742c = str;
            this.f96743d = sslErrorHandler;
        }

        @Override // t50.c
        public void c(t50.b bVar, okhttp3.n nVar) throws IOException {
            yr.h.d(m.f96731i, "onResponse . proceed");
            a aVar = this.f96740a;
            if (aVar != null) {
                aVar.b(this.f96741b, this.f96742c);
            } else {
                this.f96743d.proceed();
            }
        }

        @Override // t50.c
        public void d(t50.b bVar, IOException iOException) {
            yr.h.d(m.f96731i, "onFailure , IO Exception : " + iOException.getMessage());
            a aVar = this.f96740a;
            if (aVar != null) {
                aVar.a(this.f96741b, this.f96742c);
            } else {
                this.f96743d.cancel();
            }
        }
    }

    public m() {
    }

    public static void d(SslErrorHandler sslErrorHandler, String str, Context context) {
        e(sslErrorHandler, str, context, null);
    }

    public static void e(SslErrorHandler sslErrorHandler, String str, Context context, a aVar) {
        if (sslErrorHandler == null || TextUtils.isEmpty(str) || context == null) {
            yr.h.d(f96731i, "checkServerCertificateWithOK: handler or url or context is null");
            return;
        }
        q.a aVar2 = new q.a();
        try {
            i iVar = new i(new o(context));
            iVar.m(context);
            aVar2.Q0(iVar, new o(context));
            aVar2.Z(new xr.b());
            aVar2.f().b(new l.a().B(str).b()).U(new b(aVar, context, str, sslErrorHandler));
        } catch (Exception e11) {
            yr.h.d(f96731i, "checkServerCertificateWithOK: exception : " + e11.getMessage());
            sslErrorHandler.cancel();
        }
    }

    public final void b() {
        String str = f96731i;
        yr.h.e(str, "callbackCancel: ");
        a aVar = this.f96738g;
        if (aVar != null) {
            aVar.a(this.f96739h, this.f96737f);
        } else if (this.f96736e != null) {
            yr.h.e(str, "callbackCancel 2: ");
            this.f96736e.cancel();
        }
    }

    public final void c() {
        yr.h.e(f96731i, "callbackProceed: ");
        a aVar = this.f96738g;
        if (aVar != null) {
            aVar.b(this.f96739h, this.f96737f);
            return;
        }
        SslErrorHandler sslErrorHandler = this.f96736e;
        if (sslErrorHandler != null) {
            sslErrorHandler.proceed();
        }
    }

    public X509HostnameVerifier f() {
        return this.f96735d;
    }

    public org.apache.http.conn.ssl.SSLSocketFactory g() {
        return this.f96734c;
    }

    public a h() {
        return this.f96738g;
    }

    public Context i() {
        return this.f96739h;
    }

    public HostnameVerifier j() {
        return this.f96733b;
    }

    public SslErrorHandler k() {
        return this.f96736e;
    }

    public SSLSocketFactory l() {
        return this.f96732a;
    }

    public String m() {
        return this.f96737f;
    }

    public void n(X509HostnameVerifier x509HostnameVerifier) {
        this.f96735d = x509HostnameVerifier;
    }

    public void o(org.apache.http.conn.ssl.SSLSocketFactory sSLSocketFactory) {
        this.f96734c = sSLSocketFactory;
    }

    public void p(a aVar) {
        this.f96738g = aVar;
    }

    public void q(Context context) {
        this.f96739h = context;
    }

    public void r(HostnameVerifier hostnameVerifier) {
        this.f96733b = hostnameVerifier;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0149  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wr.m.run():void");
    }

    public void s(SslErrorHandler sslErrorHandler) {
        this.f96736e = sslErrorHandler;
    }

    public void t(SSLSocketFactory sSLSocketFactory) {
        this.f96732a = sSLSocketFactory;
    }

    public void u(String str) {
        this.f96737f = str;
    }

    public m(SslErrorHandler sslErrorHandler, String str, Context context) throws CertificateException, NoSuchAlgorithmException, IOException, KeyManagementException, KeyStoreException, IllegalAccessException {
        s(sslErrorHandler);
        u(str);
        q(context);
        t(new i(new o(context)));
        r(new xr.b());
        try {
            o(new g(null, new o(context)));
        } catch (UnrecoverableKeyException e11) {
            yr.h.d(f96731i, "WebViewSSLCheckThread: UnrecoverableKeyException : " + e11.getMessage());
        }
        n(g.f96687j);
    }

    @Deprecated
    public m(SslErrorHandler sslErrorHandler, String str, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier) {
        s(sslErrorHandler);
        u(str);
        t(sSLSocketFactory);
        r(hostnameVerifier);
    }

    @Deprecated
    public m(SslErrorHandler sslErrorHandler, String str, org.apache.http.conn.ssl.SSLSocketFactory sSLSocketFactory, X509HostnameVerifier x509HostnameVerifier) {
        s(sslErrorHandler);
        u(str);
        o(sSLSocketFactory);
        n(x509HostnameVerifier);
    }

    @Deprecated
    public m(SslErrorHandler sslErrorHandler, String str, org.apache.http.conn.ssl.SSLSocketFactory sSLSocketFactory, X509HostnameVerifier x509HostnameVerifier, a aVar, Context context) {
        this.f96736e = sslErrorHandler;
        this.f96737f = str;
        this.f96734c = sSLSocketFactory;
        this.f96735d = x509HostnameVerifier;
        this.f96738g = aVar;
        this.f96739h = context;
    }
}
