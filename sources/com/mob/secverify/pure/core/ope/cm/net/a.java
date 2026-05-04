package com.mob.secverify.pure.core.ope.cm.net;

import android.util.Base64;
import com.mob.secverify.b.c;
import com.mob.secverify.pure.core.ope.cm.a.d;
import java.io.ByteArrayInputStream;
import java.security.KeyStore;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import s70.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static String f41045a = "";

    /* renamed from: b, reason: collision with root package name */
    private X509Certificate f41046b;

    /* renamed from: c, reason: collision with root package name */
    private SSLContext f41047c;

    public a(d dVar) {
        a(dVar);
        try {
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, null);
            keyStore.setCertificateEntry("cert", this.f41046b);
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
            SSLContext sSLContext = SSLContext.getInstance(b.f88115d);
            this.f41047c = sSLContext;
            sSLContext.init(null, trustManagerFactory.getTrustManagers(), null);
        } catch (Throwable th2) {
            dVar.f40947w = true;
            c.a().a(th2);
        }
    }

    public static void a(String str) {
        f41045a = str;
    }

    public SSLContext a() {
        return this.f41047c;
    }

    private void a(d dVar) {
        ByteArrayInputStream byteArrayInputStream;
        Throwable th2;
        if (this.f41046b != null) {
            return;
        }
        try {
            try {
                byteArrayInputStream = new ByteArrayInputStream(Base64.decode(f41045a.getBytes(), 0));
                try {
                    this.f41046b = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(byteArrayInputStream);
                    byteArrayInputStream.close();
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        dVar.f40947w = true;
                        c.a().a(th2, th2.getMessage());
                        if (byteArrayInputStream != null) {
                            byteArrayInputStream.close();
                        }
                    } catch (Throwable th4) {
                        if (byteArrayInputStream != null) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th5) {
                                c.a().a(th5, "[SecPure] ==>%s", th5.getMessage());
                            }
                        }
                        throw th4;
                    }
                }
            } catch (Throwable th6) {
                byteArrayInputStream = null;
                th2 = th6;
            }
        } catch (Throwable th7) {
            c.a().a(th7, "[SecPure] ==>%s", th7.getMessage());
        }
    }
}
