package xr;

import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import yr.f;
import yr.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a implements HostnameVerifier {
    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            X509Certificate x509Certificate = (X509Certificate) sSLSession.getPeerCertificates()[0];
            h.e("", "verify: certificate is : " + x509Certificate.getSubjectDN().getName());
            d.a(str, x509Certificate, false);
            f.b();
            return true;
        } catch (SSLException e11) {
            h.d("", "SSLException : " + e11.getMessage());
            return false;
        }
    }
}
