package wr;

import android.content.Context;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import java.security.cert.X509Certificate;
import wr.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f96730a = "WebViewSSLCheck";

    public static void a(SslErrorHandler sslErrorHandler, SslError sslError, Context context) {
        b(sslErrorHandler, sslError, null, context, null);
    }

    public static void b(SslErrorHandler sslErrorHandler, SslError sslError, String str, Context context, m.a aVar) {
        String str2 = f96730a;
        yr.h.e(str2, " error type : " + sslError.getPrimaryError() + " , cn is : " + sslError.getCertificate().getIssuedTo().getCName());
        X509Certificate a11 = yr.e.a(sslError.getCertificate());
        X509Certificate a12 = new yr.k(context).a();
        yr.h.b(str2, "checkServerCertificateNew: error certificate is : " + a11);
        if (yr.e.e(a12, a11)) {
            yr.h.e(str2, "checkServerCertificateNew: proceed");
            if (aVar != null) {
                aVar.b(context, str);
                return;
            } else {
                sslErrorHandler.proceed();
                return;
            }
        }
        yr.h.d(str2, "checkServerCertificateNew: cancel");
        if (aVar != null) {
            aVar.a(context, str);
        } else {
            sslErrorHandler.cancel();
        }
    }

    public static boolean c(String str, SslError sslError) {
        return d(yr.e.b(str), sslError);
    }

    public static boolean d(X509Certificate x509Certificate, SslError sslError) {
        return yr.e.e(x509Certificate, yr.e.a(sslError.getCertificate()));
    }
}
