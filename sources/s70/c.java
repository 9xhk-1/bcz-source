package s70;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.TrustStrategy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class c implements X509TrustManager {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f88120a;

    /* renamed from: b, reason: collision with root package name */
    public final TrustStrategy f88121b;

    public c(X509TrustManager x509TrustManager, TrustStrategy trustStrategy) {
        this.f88120a = x509TrustManager;
        this.f88121b = trustStrategy;
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        this.f88120a.checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        if (this.f88121b.isTrusted(x509CertificateArr, str)) {
            return;
        }
        this.f88120a.checkServerTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return this.f88120a.getAcceptedIssuers();
    }
}
