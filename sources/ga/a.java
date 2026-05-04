package ga;

import java.io.ByteArrayInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a implements X509TrustManager {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final X509TrustManager f53514a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public X509Certificate f53515b;

    public a(@k X509TrustManager systrustManage) {
        g0.p(systrustManage, "systrustManage");
        this.f53514a = systrustManage;
    }

    public final X509Certificate a() {
        String str;
        X509Certificate x509Certificate = this.f53515b;
        if (x509Certificate == null) {
            str = f.f53523a;
            byte[] bytes = str.getBytes(u30.d.f91599b);
            g0.o(bytes, "getBytes(...)");
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(byteArrayInputStream);
            g0.n(generateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            x509Certificate = (X509Certificate) generateCertificate;
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                qb.c.c("LoadFailed", "", th2);
            }
            this.f53515b = x509Certificate;
        }
        return x509Certificate;
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.f53514a.checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(@l X509Certificate[] x509CertificateArr, @l String str) {
        try {
            this.f53514a.checkServerTrusted(x509CertificateArr, str);
            e = null;
        } catch (Exception e11) {
            e = e11;
        }
        if (e == null) {
            return;
        }
        if (x509CertificateArr == null || x509CertificateArr.length == 0 || !Arrays.equals(a().getEncoded(), x509CertificateArr[x509CertificateArr.length - 1].getEncoded())) {
            throw e;
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    @k
    public X509Certificate[] getAcceptedIssuers() {
        v0 v0Var = new v0(2);
        v0Var.b(this.f53514a.getAcceptedIssuers());
        v0Var.a(a());
        return (X509Certificate[]) v0Var.d(new X509Certificate[v0Var.c()]);
    }
}
