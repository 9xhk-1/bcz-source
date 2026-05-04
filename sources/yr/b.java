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
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f100277a = "CertificateUtil";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.io.InputStream] */
    public static X509Certificate a(Context context) {
        InputStream inputStream;
        KeyStore keyStore;
        InputStream inputStream2 = null;
        X509Certificate x509Certificate = null;
        try {
            try {
                keyStore = KeyStore.getInstance("bks");
                inputStream = context.getAssets().open("hmsrootcas.bks");
            } catch (Throwable th2) {
                inputStream2 = context;
                th = th2;
                g.g(inputStream2);
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            inputStream = null;
            h.d(f100277a, "loadBksCA: exception : " + e.getMessage());
            context = inputStream;
            g.g(context);
            return x509Certificate;
        } catch (RuntimeException e12) {
            e = e12;
            inputStream = null;
            h.d(f100277a, "loadBksCA: exception : " + e.getMessage());
            context = inputStream;
            g.g(context);
            return x509Certificate;
        } catch (KeyStoreException e13) {
            e = e13;
            inputStream = null;
            h.d(f100277a, "loadBksCA: exception : " + e.getMessage());
            context = inputStream;
            g.g(context);
            return x509Certificate;
        } catch (NoSuchAlgorithmException e14) {
            e = e14;
            inputStream = null;
            h.d(f100277a, "loadBksCA: exception : " + e.getMessage());
            context = inputStream;
            g.g(context);
            return x509Certificate;
        } catch (CertificateException e15) {
            e = e15;
            inputStream = null;
            h.d(f100277a, "loadBksCA: exception : " + e.getMessage());
            context = inputStream;
            g.g(context);
            return x509Certificate;
        } catch (Throwable th3) {
            th = th3;
            g.g(inputStream2);
            throw th;
        }
        try {
            inputStream.reset();
            keyStore.load(inputStream, "".toCharArray());
            x509Certificate = (X509Certificate) keyStore.getCertificate(k.f100295f);
            context = inputStream;
        } catch (IOException e16) {
            e = e16;
            h.d(f100277a, "loadBksCA: exception : " + e.getMessage());
            context = inputStream;
            g.g(context);
            return x509Certificate;
        } catch (RuntimeException e17) {
            e = e17;
            h.d(f100277a, "loadBksCA: exception : " + e.getMessage());
            context = inputStream;
            g.g(context);
            return x509Certificate;
        } catch (KeyStoreException e18) {
            e = e18;
            h.d(f100277a, "loadBksCA: exception : " + e.getMessage());
            context = inputStream;
            g.g(context);
            return x509Certificate;
        } catch (NoSuchAlgorithmException e19) {
            e = e19;
            h.d(f100277a, "loadBksCA: exception : " + e.getMessage());
            context = inputStream;
            g.g(context);
            return x509Certificate;
        } catch (CertificateException e21) {
            e = e21;
            h.d(f100277a, "loadBksCA: exception : " + e.getMessage());
            context = inputStream;
            g.g(context);
            return x509Certificate;
        }
        g.g(context);
        return x509Certificate;
    }
}
