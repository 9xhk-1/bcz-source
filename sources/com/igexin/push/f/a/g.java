package com.igexin.push.f.a;

import android.os.Process;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes7.dex */
public final class g extends com.igexin.c.a.d.f {

    /* renamed from: a, reason: collision with root package name */
    public static final int f38546a = -2147483638;

    /* renamed from: c, reason: collision with root package name */
    private static final String f38547c = "SimpleHttpTask";

    /* renamed from: d, reason: collision with root package name */
    private static final int f38548d = 20000;

    /* renamed from: e, reason: collision with root package name */
    private static final int f38549e = 3;

    /* renamed from: b, reason: collision with root package name */
    public d f38550b;

    /* renamed from: f, reason: collision with root package name */
    private HttpURLConnection f38551f;

    public class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f38552a;

        /* renamed from: b, reason: collision with root package name */
        byte[] f38553b;

        public a(boolean z11, byte[] bArr) {
            this.f38552a = z11;
            this.f38553b = bArr;
        }
    }

    private g(d dVar) {
        super(0);
        this.f38550b = dVar;
    }

    private a a(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            this.f38551f = httpURLConnection;
            httpURLConnection.setConnectTimeout(20000);
            this.f38551f.setReadTimeout(20000);
            this.f38551f.setRequestMethod("GET");
            this.f38551f.setDoInput(true);
            HttpURLConnection httpURLConnection2 = this.f38551f;
            this.f38551f = httpURLConnection2;
            byte[] a11 = a(httpURLConnection2);
            if (a11 != null) {
                return b(a11);
            }
        } finally {
            try {
                return new a(false, null);
            } finally {
            }
        }
        return new a(false, null);
    }

    private a b(byte[] bArr) {
        try {
            return new a(false, bArr);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return new a(true, null);
        }
    }

    private void g() {
        HttpURLConnection httpURLConnection = this.f38551f;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
                this.f38551f = null;
            } catch (Exception e11) {
                com.igexin.c.a.c.a.a(e11);
            }
        }
    }

    private boolean h() {
        return this.f38550b.f38535l && com.igexin.push.g.a.a();
    }

    @Override // com.igexin.c.a.d.f, com.igexin.c.a.d.a.f
    public final void b_() throws Exception {
        super.b_();
        Process.setThreadPriority(10);
        d dVar = this.f38550b;
        if (dVar == null || dVar.f38529f == null) {
            g();
            com.igexin.c.a.c.a.a(f38547c, "run return ###");
            com.igexin.c.a.c.a.a("SimpleHttpTask|run return ###", new Object[0]);
            return;
        }
        for (int i11 = 0; i11 < 3; i11++) {
            d dVar2 = this.f38550b;
            byte[] bArr = dVar2.f38530g;
            String str = dVar2.f38529f;
            byte[] bArr2 = (bArr == null ? a(str) : a(str, bArr)).f38553b;
            if (bArr2 != null) {
                try {
                    this.f38550b.a(bArr2);
                    return;
                } catch (Exception e11) {
                    com.igexin.c.a.c.a.a(e11);
                    return;
                }
            }
            if (i11 == 2) {
                this.f38550b.a(new Exception("try up to limit"));
                com.igexin.c.a.c.a.a(f38547c, "http request exception, try times = " + (i11 + 1));
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
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            this.f38551f = httpURLConnection;
            httpURLConnection.setDoInput(true);
            this.f38551f.setDoOutput(true);
            this.f38551f.setRequestMethod("POST");
            this.f38551f.setUseCaches(false);
            this.f38551f.setInstanceFollowRedirects(true);
            this.f38551f.setRequestProperty("Content-Type", "application/octet-stream");
            this.f38551f.setConnectTimeout(20000);
            this.f38551f.setReadTimeout(20000);
            this.f38551f = this.f38551f;
        } catch (Throwable th2) {
            th = th2;
            dataOutputStream = null;
        }
        if (bArr == null) {
            a aVar = new a(true, null);
            com.igexin.c.a.b.g.a((Closeable) null);
            g();
            return aVar;
        }
        byte[] b11 = com.igexin.c.b.a.b(bArr);
        this.f38551f.connect();
        dataOutputStream = new DataOutputStream(this.f38551f.getOutputStream());
        try {
            dataOutputStream.write(b11, 0, b11.length);
            dataOutputStream.flush();
            byte[] a11 = a(this.f38551f);
            if (a11 != null) {
                return b(a11);
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
        this.f38551f = httpURLConnection;
        httpURLConnection.setDoInput(true);
        this.f38551f.setDoOutput(true);
        this.f38551f.setRequestMethod("POST");
        this.f38551f.setUseCaches(false);
        this.f38551f.setInstanceFollowRedirects(true);
        this.f38551f.setRequestProperty("Content-Type", "application/octet-stream");
        this.f38551f.setConnectTimeout(20000);
        this.f38551f.setReadTimeout(20000);
        return this.f38551f;
    }

    private HttpURLConnection c(String str) throws Exception {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f38551f = httpURLConnection;
        httpURLConnection.setConnectTimeout(20000);
        this.f38551f.setReadTimeout(20000);
        this.f38551f.setRequestMethod("GET");
        this.f38551f.setDoInput(true);
        return this.f38551f;
    }

    private void a(byte[] bArr) {
        try {
            this.f38550b.a(bArr);
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
        }
    }

    private static byte[] a(HttpURLConnection httpURLConnection) throws Exception {
        Throwable th2;
        InputStream inputStream;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (httpURLConnection.getResponseCode() == 200) {
                inputStream = httpURLConnection.getInputStream();
                try {
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
                } catch (Exception unused) {
                } catch (Throwable th3) {
                    th2 = th3;
                    com.igexin.c.a.b.g.a(inputStream);
                    throw th2;
                }
            } else {
                inputStream = httpURLConnection.getErrorStream();
            }
        } catch (Exception unused2) {
            inputStream = null;
        } catch (Throwable th4) {
            th2 = th4;
            inputStream = null;
        }
        com.igexin.c.a.b.g.a(inputStream);
        return null;
    }

    @Override // com.igexin.c.a.d.f
    public final void f() {
    }
}
