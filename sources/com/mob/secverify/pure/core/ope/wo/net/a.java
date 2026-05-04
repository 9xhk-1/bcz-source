package com.mob.secverify.pure.core.ope.wo.net;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private String f41112a = "";

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00aa: MOVE (r8 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:107:0x00aa */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0290  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(java.lang.String r17, java.util.HashMap<java.lang.String, java.lang.String> r18, android.net.Network r19) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.secverify.pure.core.ope.wo.net.a.a(java.lang.String, java.util.HashMap, android.net.Network):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x026f  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String b(java.lang.String r17, java.util.HashMap<java.lang.String, java.lang.String> r18, android.net.Network r19) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.secverify.pure.core.ope.wo.net.a.b(java.lang.String, java.util.HashMap, android.net.Network):java.lang.String");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.mob.secverify.pure.core.ope.wo.net.a$a, reason: collision with other inner class name */
    public class C0491a implements X509TrustManager {

        /* renamed from: b, reason: collision with root package name */
        private String f41115b;

        public C0491a(String str) {
            this.f41115b = str;
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            try {
                try {
                    for (X509Certificate x509Certificate : x509CertificateArr) {
                        x509Certificate.checkValidity();
                    }
                    String name = x509CertificateArr[0].getSubjectDN().getName();
                    if (this.f41115b.contains("wostore.cn")) {
                        if (!name.contains("wostore.cn") || !name.contains("小沃科技有限公司")) {
                            throw new CertificateException("bad certificate");
                        }
                    }
                } catch (Exception unused) {
                    throw new CertificateException("bad certificate");
                }
            } catch (CertificateException e11) {
                e11.printStackTrace();
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }
    }

    private String a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th2;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Exception unused) {
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            byteArrayOutputStream = null;
            th2 = th3;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            String str = new String(byteArrayOutputStream.toByteArray());
            try {
                byteArrayOutputStream.close();
                inputStream.close();
            } catch (Exception unused2) {
            }
            return str;
        } catch (Exception unused3) {
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (Exception unused4) {
                    return null;
                }
            }
            if (inputStream != null) {
                inputStream.close();
            }
            return null;
        } catch (Throwable th4) {
            th2 = th4;
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (Exception unused5) {
                    throw th2;
                }
            }
            if (inputStream != null) {
                inputStream.close();
            }
            throw th2;
        }
    }
}
