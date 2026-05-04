package com.zx.a.I8b7;

import java.math.BigInteger;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class h0 implements X509TrustManager {
    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        if (x509CertificateArr == null || x509CertificateArr.length != 2) {
            throw new CertificateException("ca chain is illegal");
        }
        X509Certificate f11 = i0.f();
        if (f11 == null) {
            throw new CertificateException("getCurEnvCA is null");
        }
        if (!new BigInteger(1, f11.getPublicKey().getEncoded()).toString(16).equals(new BigInteger(1, x509CertificateArr[1].getPublicKey().getEncoded()).toString(16))) {
            throw new CertificateException("Trust anchor for certification illegal code: 10003");
        }
        try {
            x509CertificateArr[0].verify(f11.getPublicKey());
            try {
                x509CertificateArr[0].checkValidity();
            } catch (Exception unused) {
                throw new CertificateException("Trust anchor for certification illegal code: 10005");
            }
        } catch (Exception unused2) {
            throw new CertificateException("Trust anchor for certification illegal code: 10004");
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
    }
}
