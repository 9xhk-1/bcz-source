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
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f96720a = "SecureX509SingleInstance";

    /* renamed from: b, reason: collision with root package name */
    public static volatile k f96721b;

    @SuppressLint({"NewApi"})
    public static k a(Context context) throws CertificateException, NoSuchAlgorithmException, KeyStoreException, IOException {
        InputStream inputStream;
        long currentTimeMillis = System.currentTimeMillis();
        if (context == null) {
            throw new NullPointerException("context is null");
        }
        yr.c.b(context);
        if (f96721b == null) {
            synchronized (j.class) {
                if (f96721b == null) {
                    try {
                        inputStream = yr.a.o(context);
                    } catch (RuntimeException unused) {
                        yr.h.d(f96720a, "get files bks error");
                        inputStream = null;
                    }
                    if (inputStream == null) {
                        yr.h.e(f96720a, "get assets bks");
                        inputStream = context.getAssets().open("hmsrootcas.bks");
                    } else {
                        yr.h.e(f96720a, "get files bks");
                    }
                    f96721b = new k(inputStream, "");
                }
            }
        }
        yr.h.b(f96720a, "SecureX509TrustManager getInstance: cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
        return f96721b;
    }

    @Deprecated
    public static void b(InputStream inputStream) {
        String str = f96720a;
        yr.h.e(str, "update bks");
        long currentTimeMillis = System.currentTimeMillis();
        if (inputStream != null && f96721b != null) {
            f96721b = new k(inputStream, "");
            h.b(f96721b);
            g.b(f96721b);
        }
        yr.h.e(str, "SecureX509TrustManager update bks cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
    }

    public static void c(InputStream inputStream, SecureRandom secureRandom) {
        String str = f96720a;
        yr.h.e(str, "update bks");
        long currentTimeMillis = System.currentTimeMillis();
        if (inputStream != null && f96721b != null) {
            f96721b = new k(inputStream, "");
            h.c(f96721b, secureRandom);
            g.c(f96721b, secureRandom);
        }
        yr.h.e(str, "SecureX509TrustManager update bks cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
    }
}
