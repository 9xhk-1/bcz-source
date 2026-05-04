package wr;

import android.content.Context;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class o implements X509TrustManager {

    /* renamed from: c, reason: collision with root package name */
    public static final String f96751c = "WebViewX509TrustManger";

    /* renamed from: a, reason: collision with root package name */
    public X509Certificate f96752a;

    /* renamed from: b, reason: collision with root package name */
    public List<X509TrustManager> f96753b = new ArrayList();

    public o(Context context) {
        if (context == null) {
            throw new NullPointerException("WebViewX509TrustManger context is null");
        }
        yr.c.b(context);
        X509Certificate c11 = new yr.k(context).c();
        this.f96752a = c11;
        if (c11 == null) {
            throw new NullPointerException("WebViewX509TrustManger cannot get cbg root ca");
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        yr.h.e(f96751c, "checkClientTrusted");
        if (this.f96753b.isEmpty()) {
            throw new CertificateException("checkClientTrusted CertificateException");
        }
        this.f96753b.get(0).checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        yr.h.e(f96751c, "checkServerTrusted");
        boolean z11 = false;
        for (int i11 = 0; i11 < x509CertificateArr.length; i11++) {
            yr.h.b(f96751c, "checkServerTrusted " + i11 + " : " + x509CertificateArr[i11].getIssuerDN().getName());
        }
        X509Certificate[] x509CertificateArr2 = new X509Certificate[x509CertificateArr.length];
        for (int i12 = 0; i12 < x509CertificateArr.length; i12++) {
            x509CertificateArr2[i12] = x509CertificateArr[(x509CertificateArr.length - 1) - i12];
        }
        CertificateException e11 = new CertificateException("CBG root CA CertificateException");
        try {
            z11 = yr.e.f(this.f96752a, x509CertificateArr2);
        } catch (InvalidKeyException e12) {
            yr.h.d(f96751c, "checkServerTrusted InvalidKeyException: " + e12.getMessage());
        } catch (NoSuchAlgorithmException e13) {
            yr.h.d(f96751c, "checkServerTrusted NoSuchAlgorithmException: " + e13.getMessage());
        } catch (NoSuchProviderException e14) {
            yr.h.d(f96751c, "checkServerTrusted NoSuchProviderException: " + e14.getMessage());
        } catch (SignatureException e15) {
            yr.h.d(f96751c, "checkServerTrusted SignatureException: " + e15.getMessage());
        } catch (CertificateException e16) {
            e11 = e16;
            yr.h.d(f96751c, "checkServerTrusted CertificateException: " + e11.getMessage());
        }
        if (!z11) {
            throw e11;
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator<X509TrustManager> it = this.f96753b.iterator();
            while (it.hasNext()) {
                arrayList.addAll(Arrays.asList(it.next().getAcceptedIssuers()));
            }
            return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
        } catch (Exception e11) {
            yr.h.d(f96751c, "getAcceptedIssuers exception : " + e11.getMessage());
            return new X509Certificate[0];
        }
    }
}
