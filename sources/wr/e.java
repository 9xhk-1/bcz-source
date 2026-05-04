package wr;

import android.annotation.SuppressLint;
import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final String f96676a = "SSFSecureX509SingleInstance";

    /* renamed from: b, reason: collision with root package name */
    public static volatile k f96677b;

    @SuppressLint({"NewApi"})
    public static k a(Context context) throws CertificateException, NoSuchAlgorithmException, KeyStoreException, IOException {
        if (context == null) {
            throw new NullPointerException("context is null");
        }
        yr.c.b(context);
        if (f96677b == null) {
            synchronized (e.class) {
                try {
                    if (f96677b == null) {
                        InputStream o11 = yr.a.o(context);
                        if (o11 == null) {
                            yr.h.e(f96676a, "get assets bks");
                            o11 = context.getAssets().open("hmsrootcas.bks");
                        } else {
                            yr.h.e(f96676a, "get files bks");
                        }
                        f96677b = new k(o11, "", true);
                    }
                } finally {
                }
            }
        }
        return f96677b;
    }

    @Deprecated
    public static void b(InputStream inputStream) {
        String str = f96676a;
        yr.h.e(str, "update bks");
        long currentTimeMillis = System.currentTimeMillis();
        if (inputStream != null && f96677b != null) {
            f96677b = new k(inputStream, "", true);
            yr.h.b(str, "updateBks: new SecureX509TrustManager cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
            d.b(f96677b);
            c.b(f96677b);
        }
        yr.h.b(str, "update bks cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
    }

    public static void c(InputStream inputStream, SecureRandom secureRandom) {
        String str = f96676a;
        yr.h.e(str, "update bks");
        long currentTimeMillis = System.currentTimeMillis();
        if (inputStream != null && f96677b != null) {
            f96677b = new k(inputStream, "", true);
            yr.h.b(str, "updateBks: new SecureX509TrustManager cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
            d.c(f96677b, secureRandom);
            c.c(f96677b, secureRandom);
        }
        yr.h.b(str, "update bks cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
    }
}
