package com.igexin.push.f.a;

import android.os.Process;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes7.dex */
public class e extends com.igexin.c.a.d.f {

    /* renamed from: a, reason: collision with root package name */
    public static final int f38537a = -2147483638;

    /* renamed from: c, reason: collision with root package name */
    private static final String f38538c = "HttpTask";

    /* renamed from: d, reason: collision with root package name */
    private static final int f38539d = 20000;

    /* renamed from: e, reason: collision with root package name */
    private static final int f38540e = 3;

    /* renamed from: b, reason: collision with root package name */
    public d f38541b;

    /* renamed from: f, reason: collision with root package name */
    private HttpURLConnection f38542f;

    public class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f38543a;

        /* renamed from: b, reason: collision with root package name */
        byte[] f38544b;

        public a(boolean z11, byte[] bArr) {
            this.f38543a = z11;
            this.f38544b = bArr;
        }
    }

    public e(d dVar) {
        super(0);
        this.f38541b = dVar;
    }

    private a a(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            this.f38542f = httpURLConnection;
            httpURLConnection.setConnectTimeout(20000);
            this.f38542f.setReadTimeout(20000);
            this.f38542f.setRequestMethod("GET");
            this.f38542f.setDoInput(true);
            a(this.f38542f, (byte[]) null);
            HttpURLConnection httpURLConnection2 = this.f38542f;
            this.f38542f = httpURLConnection2;
            byte[] a11 = a(httpURLConnection2);
            if (a11 != null) {
                return b(this.f38542f, a11);
            }
        } finally {
            try {
                return new a(false, null);
            } finally {
            }
        }
        return new a(false, null);
    }

    private a b(HttpURLConnection httpURLConnection, byte[] bArr) {
        try {
            if (!this.f38541b.f38535l || !com.igexin.push.g.a.a()) {
                return new a(false, bArr);
            }
            String headerField = httpURLConnection.getHeaderField("GT_ERR");
            if (headerField != null && headerField.equals("0")) {
                String headerField2 = httpURLConnection.getHeaderField("GT_T");
                if (headerField2 == null) {
                    com.igexin.c.a.c.a.a(f38538c, "GT_T = null");
                    com.igexin.c.a.c.a.a("HttpTask|GT_T = null", new Object[0]);
                    return new a(true, null);
                }
                String headerField3 = httpURLConnection.getHeaderField("GT_C_S");
                if (headerField3 == null) {
                    com.igexin.c.a.c.a.a(f38538c, "GT_C_S = null");
                    com.igexin.c.a.c.a.a("HttpTask|GT_C_S = null", new Object[0]);
                    return new a(true, null);
                }
                byte[] b11 = com.igexin.push.g.g.b(bArr, com.igexin.push.g.g.c(headerField2.getBytes()));
                String a11 = com.igexin.push.g.g.a(headerField2, b11);
                if (a11 != null && a11.equals(headerField3)) {
                    return new a(false, b11);
                }
                com.igexin.c.a.c.a.a(f38538c, "signature = null or error");
                com.igexin.c.a.c.a.a("HttpTask|signature = null or error", new Object[0]);
                return new a(true, null);
            }
            com.igexin.c.a.c.a.a(f38538c, "GT_ERR = ".concat(String.valueOf(headerField)));
            com.igexin.c.a.c.a.a("HttpTask|GT_ERR = ".concat(String.valueOf(headerField)), new Object[0]);
            return new a(true, null);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return new a(true, null);
        }
    }

    private void g() {
        HttpURLConnection httpURLConnection = this.f38542f;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
                this.f38542f = null;
            } catch (Exception e11) {
                com.igexin.c.a.c.a.a(e11);
            }
        }
    }

    private boolean h() {
        return this.f38541b.f38535l && com.igexin.push.g.a.a();
    }

    @Override // com.igexin.c.a.d.f, com.igexin.c.a.d.a.f
    public final void b_() throws Exception {
        byte[] bArr;
        super.b_();
        Process.setThreadPriority(10);
        d dVar = this.f38541b;
        if (dVar == null || dVar.f38529f == null || ((bArr = dVar.f38530g) != null && bArr.length > com.igexin.push.config.d.A * 1024)) {
            g();
            com.igexin.c.a.c.a.a(f38538c, "run return ###");
            com.igexin.c.a.c.a.a("HttpTask|run return ###", new Object[0]);
            return;
        }
        if (bArr != null && bArr.length > 0) {
            dVar.f38530g = com.igexin.c.a.b.g.a(bArr);
        }
        for (int i11 = 0; i11 < 3; i11++) {
            d dVar2 = this.f38541b;
            byte[] bArr2 = dVar2.f38530g;
            String str = dVar2.f38529f;
            a a11 = bArr2 == null ? a(str) : a(str, bArr2);
            if (a11.f38543a) {
                com.igexin.c.a.c.a.a(f38538c, "http server resp decode header error");
            } else {
                byte[] bArr3 = a11.f38544b;
                if (bArr3 != null) {
                    try {
                        this.f38541b.a(bArr3);
                        return;
                    } catch (Exception e11) {
                        com.igexin.c.a.c.a.a(e11);
                        return;
                    }
                }
            }
            if (i11 == 2) {
                this.f38541b.a(new Exception("try up to limit"));
                com.igexin.c.a.c.a.a(f38538c, "http request exception, try times = " + (i11 + 1));
            }
        }
    }

    @Override // com.igexin.c.a.d.a.e
    public final int c() {
        return -2147483638;
    }

    @Override // com.igexin.c.a.d.f
    public final void e() {
        g();
    }

    private a a(String str, byte[] bArr) {
        DataOutputStream dataOutputStream;
        byte[] a11;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            this.f38542f = httpURLConnection;
            httpURLConnection.setDoInput(true);
            this.f38542f.setDoOutput(true);
            this.f38542f.setRequestMethod("POST");
            this.f38542f.setUseCaches(false);
            this.f38542f.setInstanceFollowRedirects(true);
            this.f38542f.setRequestProperty("Content-Type", "application/octet-stream");
            this.f38542f.setConnectTimeout(20000);
            this.f38542f.setReadTimeout(20000);
            a(this.f38542f, bArr);
            HttpURLConnection httpURLConnection2 = this.f38542f;
            this.f38542f = httpURLConnection2;
            a11 = a(bArr, httpURLConnection2);
        } catch (Throwable th2) {
            th = th2;
            dataOutputStream = null;
        }
        if (a11 == null) {
            a aVar = new a(true, null);
            com.igexin.c.a.b.g.a((Closeable) null);
            g();
            return aVar;
        }
        this.f38542f.connect();
        dataOutputStream = new DataOutputStream(this.f38542f.getOutputStream());
        try {
            dataOutputStream.write(a11, 0, a11.length);
            dataOutputStream.flush();
            byte[] a12 = a(this.f38542f);
            if (a12 != null) {
                return b(this.f38542f, a12);
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                com.igexin.c.a.c.a.a(th);
                return new a(false, null);
            } finally {
                com.igexin.c.a.b.g.a(dataOutputStream);
                g();
            }
        }
        return new a(false, null);
    }

    private HttpURLConnection b(String str) throws Exception {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f38542f = httpURLConnection;
        httpURLConnection.setConnectTimeout(20000);
        this.f38542f.setReadTimeout(20000);
        this.f38542f.setRequestMethod("GET");
        this.f38542f.setDoInput(true);
        a(this.f38542f, (byte[]) null);
        return this.f38542f;
    }

    private static void a(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        if (httpURLConnection == null) {
            return;
        }
        byte[] bArr2 = new byte[0];
        if (bArr == null) {
            bArr = bArr2;
        }
        httpURLConnection.addRequestProperty("GT_C_T", "1");
        httpURLConnection.addRequestProperty("GT_C_K", new String(com.igexin.push.g.g.c()));
        httpURLConnection.addRequestProperty("GT_C_V", com.igexin.push.g.g.f());
        String valueOf = String.valueOf(System.currentTimeMillis());
        String a11 = com.igexin.push.g.g.a(valueOf, bArr);
        httpURLConnection.addRequestProperty("GT_T", valueOf);
        httpURLConnection.addRequestProperty("GT_C_S", a11);
    }

    private HttpURLConnection b(String str, byte[] bArr) throws Exception {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f38542f = httpURLConnection;
        httpURLConnection.setDoInput(true);
        this.f38542f.setDoOutput(true);
        this.f38542f.setRequestMethod("POST");
        this.f38542f.setUseCaches(false);
        this.f38542f.setInstanceFollowRedirects(true);
        this.f38542f.setRequestProperty("Content-Type", "application/octet-stream");
        this.f38542f.setConnectTimeout(20000);
        this.f38542f.setReadTimeout(20000);
        a(this.f38542f, bArr);
        return this.f38542f;
    }

    private void a(byte[] bArr) {
        try {
            this.f38541b.a(bArr);
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
        }
    }

    private static byte[] a(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            inputStream = httpURLConnection.getInputStream();
        } catch (Exception unused) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (httpURLConnection.getResponseCode() == 200) {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        com.igexin.c.a.b.g.a(inputStream);
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
            inputStream2 = inputStream;
            com.igexin.c.a.b.g.a(inputStream2);
            throw th;
        }
        com.igexin.c.a.b.g.a(inputStream);
        return null;
    }

    private static byte[] a(byte[] bArr, HttpURLConnection httpURLConnection) {
        String requestProperty;
        try {
            if (!httpURLConnection.getRequestProperties().containsKey("GT_C_S") || (requestProperty = httpURLConnection.getRequestProperty("GT_C_S")) == null) {
                return null;
            }
            return com.igexin.push.g.g.a(bArr, com.igexin.push.g.g.c(requestProperty.getBytes()));
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return null;
        }
    }

    @Override // com.igexin.c.a.d.f
    public final void f() {
    }
}
