package wr;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class k implements X509TrustManager {

    /* renamed from: c, reason: collision with root package name */
    public static final String f96722c = "SX509TM";

    /* renamed from: d, reason: collision with root package name */
    public static final String f96723d = "hmsrootcas.bks";

    /* renamed from: e, reason: collision with root package name */
    public static final String f96724e = "";

    /* renamed from: f, reason: collision with root package name */
    public static final String f96725f = "X509";

    /* renamed from: g, reason: collision with root package name */
    public static final String f96726g = "bks";

    /* renamed from: h, reason: collision with root package name */
    public static final String f96727h = "AndroidCAStore";

    /* renamed from: a, reason: collision with root package name */
    public List<X509TrustManager> f96728a;

    /* renamed from: b, reason: collision with root package name */
    public X509Certificate[] f96729b;

    public k(Context context) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, IllegalArgumentException {
        this(context, false);
    }

    public final void a() {
        yr.h.e(f96722c, "loadSystemCA");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            KeyStore keyStore = KeyStore.getInstance(f96727h);
            keyStore.load(null, null);
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(f96725f);
            trustManagerFactory.init(keyStore);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            for (TrustManager trustManager : trustManagers) {
                if (trustManager instanceof X509TrustManager) {
                    this.f96728a.add((X509TrustManager) trustManager);
                }
            }
        } catch (IOException | NegativeArraySizeException | OutOfMemoryError | KeyStoreException | NoSuchAlgorithmException | CertificateException e11) {
            yr.h.d(f96722c, "loadSystemCA: exception : " + e11.getMessage());
        }
        yr.h.b(f96722c, "loadSystemCA: cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x003c, code lost:
    
        if (r0 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.content.Context r7) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.KeyStoreException, java.io.IOException {
        /*
            r6 = this;
            java.lang.String r0 = "loadBksCA"
            java.lang.String r1 = "SX509TM"
            yr.h.e(r1, r0)
            long r2 = java.lang.System.currentTimeMillis()
            java.io.InputStream r0 = yr.a.o(r7)
            if (r0 == 0) goto L3c
            java.lang.String r4 = "get bks not from assets"
            yr.h.e(r1, r4)     // Catch: java.io.IOException -> L1a java.security.cert.CertificateException -> L1c java.security.KeyStoreException -> L1e java.security.NoSuchAlgorithmException -> L20 java.lang.OutOfMemoryError -> L22
            r6.c(r0)     // Catch: java.io.IOException -> L1a java.security.cert.CertificateException -> L1c java.security.KeyStoreException -> L1e java.security.NoSuchAlgorithmException -> L20 java.lang.OutOfMemoryError -> L22
            goto L3c
        L1a:
            r0 = move-exception
            goto L23
        L1c:
            r0 = move-exception
            goto L23
        L1e:
            r0 = move-exception
            goto L23
        L20:
            r0 = move-exception
            goto L23
        L22:
            r0 = move-exception
        L23:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "loadBksCA: exception : "
            r4.append(r5)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            yr.h.d(r1, r0)
            goto L3e
        L3c:
            if (r0 != 0) goto L50
        L3e:
            java.lang.String r0 = " get bks from assets "
            yr.h.e(r1, r0)
            android.content.res.AssetManager r7 = r7.getAssets()
            java.lang.String r0 = "hmsrootcas.bks"
            java.io.InputStream r7 = r7.open(r0)
            r6.c(r7)
        L50:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "loadBksCA: cost : "
            r7.append(r0)
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r2
            r7.append(r4)
            java.lang.String r0 = " ms"
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            yr.h.b(r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wr.k.b(android.content.Context):void");
    }

    public final void c(InputStream inputStream) throws NoSuchAlgorithmException, KeyStoreException, CertificateException, IOException {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(f96725f);
            KeyStore keyStore = KeyStore.getInstance("bks");
            keyStore.load(inputStream, "".toCharArray());
            trustManagerFactory.init(keyStore);
            for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    this.f96728a.add((X509TrustManager) trustManager);
                }
            }
        } finally {
            yr.g.g(inputStream);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        yr.h.e(f96722c, "checkClientTrusted: ");
        Iterator<X509TrustManager> it = this.f96728a.iterator();
        while (it.hasNext()) {
            try {
                it.next().checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException e11) {
                yr.h.d(f96722c, "checkServerTrusted CertificateException" + e11.getMessage());
            }
        }
        throw new CertificateException("checkServerTrusted CertificateException");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        g(x509CertificateArr);
        yr.h.e(f96722c, "checkServerTrusted begin,size=" + x509CertificateArr.length + ",authType=" + str);
        long currentTimeMillis = System.currentTimeMillis();
        int length = x509CertificateArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            X509Certificate x509Certificate = x509CertificateArr[i11];
            yr.h.b(f96722c, "server ca chain: getSubjectDN is :" + x509Certificate.getSubjectDN());
            yr.h.b(f96722c, "IssuerDN :" + x509Certificate.getIssuerDN());
            yr.h.b(f96722c, "SerialNumber : " + x509Certificate.getSerialNumber());
        }
        int size = this.f96728a.size();
        for (int i12 = 0; i12 < size; i12++) {
            try {
                yr.h.e(f96722c, "check server i=" + i12);
                X509TrustManager x509TrustManager = this.f96728a.get(i12);
                X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
                if (acceptedIssuers != null) {
                    yr.h.e(f96722c, "client root ca size=" + acceptedIssuers.length);
                    for (int i13 = 0; i13 < acceptedIssuers.length; i13++) {
                        yr.h.b(f96722c, "client root ca getIssuerDN :" + acceptedIssuers[i13].getIssuerDN());
                    }
                }
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                yr.h.e(f96722c, "checkServerTrusted end, " + x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                return;
            } catch (CertificateException e11) {
                yr.h.d(f96722c, "checkServerTrusted error :" + e11.getMessage() + " , time : " + i12);
                if (i12 == size - 1) {
                    if (x509CertificateArr.length > 0) {
                        yr.h.d(f96722c, "root ca issuer : " + x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                    }
                    throw e11;
                }
            }
        }
        yr.h.b(f96722c, "checkServerTrusted: cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
    }

    public final void d(InputStream inputStream, String str) {
        if (inputStream == null || str == null) {
            throw new IllegalArgumentException("inputstream or trustPwd is null");
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(f96725f);
                KeyStore keyStore = KeyStore.getInstance("bks");
                keyStore.load(inputStream, str.toCharArray());
                trustManagerFactory.init(keyStore);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                for (TrustManager trustManager : trustManagers) {
                    if (trustManager instanceof X509TrustManager) {
                        this.f96728a.add((X509TrustManager) trustManager);
                    }
                }
                yr.g.g(inputStream);
            } finally {
                yr.g.g(inputStream);
            }
        } catch (IOException | NegativeArraySizeException | OutOfMemoryError | KeyStoreException | NoSuchAlgorithmException | CertificateException e11) {
            yr.h.d(f96722c, "loadInputStream: exception : " + e11.getMessage());
        }
        yr.h.b(f96722c, "loadInputStream: cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
    }

    public X509Certificate[] e() {
        return this.f96729b;
    }

    public List<X509TrustManager> f() {
        return this.f96728a;
    }

    public void g(X509Certificate[] x509CertificateArr) {
        this.f96729b = x509CertificateArr;
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator<X509TrustManager> it = this.f96728a.iterator();
            while (it.hasNext()) {
                arrayList.addAll(Arrays.asList(it.next().getAcceptedIssuers()));
            }
            return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
        } catch (Exception e11) {
            yr.h.d(f96722c, "getAcceptedIssuers exception : " + e11.getMessage());
            return new X509Certificate[0];
        }
    }

    public void h(List<X509TrustManager> list) {
        this.f96728a = list;
    }

    public k(Context context, boolean z11) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, IllegalArgumentException {
        this.f96728a = new ArrayList();
        if (context == null) {
            throw new IllegalArgumentException("context is null");
        }
        yr.c.b(context);
        if (z11) {
            a();
        }
        b(context);
        if (this.f96728a.isEmpty()) {
            throw new CertificateException("X509TrustManager is empty");
        }
    }

    public k(InputStream inputStream, String str) throws IllegalArgumentException {
        this.f96728a = new ArrayList();
        d(inputStream, str);
    }

    public k(String str) throws IllegalArgumentException, FileNotFoundException {
        this(str, false);
    }

    public k(String str, boolean z11) throws IllegalArgumentException, FileNotFoundException {
        FileInputStream fileInputStream;
        this.f96728a = new ArrayList();
        try {
            fileInputStream = new FileInputStream(str);
            try {
                d(fileInputStream, "");
                yr.g.g(fileInputStream);
                if (z11) {
                    a();
                }
            } catch (Throwable th2) {
                th = th2;
                yr.g.g(fileInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
    }

    public k(InputStream inputStream, String str, boolean z11) throws IllegalArgumentException {
        this.f96728a = new ArrayList();
        if (z11) {
            a();
        }
        d(inputStream, str);
    }
}
