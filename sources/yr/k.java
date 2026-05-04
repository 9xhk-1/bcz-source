package yr;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class k {

    /* renamed from: b, reason: collision with root package name */
    public static final String f100291b = "X509CertificateUtil";

    /* renamed from: c, reason: collision with root package name */
    public static final String f100292c = "hmsrootcas.bks";

    /* renamed from: d, reason: collision with root package name */
    public static final String f100293d = "";

    /* renamed from: e, reason: collision with root package name */
    public static final String f100294e = "bks";

    /* renamed from: f, reason: collision with root package name */
    public static final String f100295f = "052root";

    /* renamed from: g, reason: collision with root package name */
    public static final String f100296g = "hmsincas.bks";

    /* renamed from: h, reason: collision with root package name */
    public static final String f100297h = "huawei cbg application integration ca";

    /* renamed from: a, reason: collision with root package name */
    public Context f100298a;

    public k(Context context) {
        this.f100298a = context;
    }

    public X509Certificate a() {
        return b(f100296g, f100297h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public X509Certificate b(String str, String str2) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        X509Certificate x509Certificate = null;
        try {
            try {
                KeyStore keyStore = KeyStore.getInstance("bks");
                inputStream = this.f100298a.getAssets().open(str);
                try {
                    inputStream.reset();
                    keyStore.load(inputStream, "".toCharArray());
                    x509Certificate = (X509Certificate) keyStore.getCertificate(str2);
                    str = inputStream;
                } catch (IOException e11) {
                    e = e11;
                    h.d(f100291b, "loadBksCA: exception : " + e.getMessage());
                    str = inputStream;
                    g.g(str);
                    return x509Certificate;
                } catch (KeyStoreException e12) {
                    e = e12;
                    h.d(f100291b, "loadBksCA: exception : " + e.getMessage());
                    str = inputStream;
                    g.g(str);
                    return x509Certificate;
                } catch (NoSuchAlgorithmException e13) {
                    e = e13;
                    h.d(f100291b, "loadBksCA: exception : " + e.getMessage());
                    str = inputStream;
                    g.g(str);
                    return x509Certificate;
                } catch (CertificateException e14) {
                    e = e14;
                    h.d(f100291b, "loadBksCA: exception : " + e.getMessage());
                    str = inputStream;
                    g.g(str);
                    return x509Certificate;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = str;
                g.g(inputStream2);
                throw th;
            }
        } catch (IOException e15) {
            e = e15;
            inputStream = null;
            h.d(f100291b, "loadBksCA: exception : " + e.getMessage());
            str = inputStream;
            g.g(str);
            return x509Certificate;
        } catch (KeyStoreException e16) {
            e = e16;
            inputStream = null;
            h.d(f100291b, "loadBksCA: exception : " + e.getMessage());
            str = inputStream;
            g.g(str);
            return x509Certificate;
        } catch (NoSuchAlgorithmException e17) {
            e = e17;
            inputStream = null;
            h.d(f100291b, "loadBksCA: exception : " + e.getMessage());
            str = inputStream;
            g.g(str);
            return x509Certificate;
        } catch (CertificateException e18) {
            e = e18;
            inputStream = null;
            h.d(f100291b, "loadBksCA: exception : " + e.getMessage());
            str = inputStream;
            g.g(str);
            return x509Certificate;
        } catch (Throwable th3) {
            th = th3;
            g.g(inputStream2);
            throw th;
        }
        g.g(str);
        return x509Certificate;
    }

    public X509Certificate c() {
        return b("hmsrootcas.bks", f100295f);
    }
}
