package com.huawei.updatesdk.a.a.b;

import android.content.Context;
import com.huawei.updatesdk.a.a.d.d;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import wr.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private HttpURLConnection f36806a = null;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f36807a;

        /* renamed from: b, reason: collision with root package name */
        private int f36808b;

        /* renamed from: c, reason: collision with root package name */
        private String f36809c;

        public int a() {
            return this.f36808b;
        }

        public String b() {
            return this.f36807a;
        }

        public String c() {
            return this.f36809c;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a a(String str, String str2, String str3, String str4, Context context) {
        Throwable th2;
        BufferedInputStream bufferedInputStream;
        a aVar = new a();
        BufferedInputStream bufferedInputStream2 = null;
        try {
            HttpURLConnection a11 = a(str, context);
            this.f36806a = a11;
            a11.setDoInput(true);
            this.f36806a.setDoOutput(true);
            this.f36806a.setUseCaches(false);
            this.f36806a.setConnectTimeout(5000);
            this.f36806a.setReadTimeout(10000);
            this.f36806a.setRequestMethod("POST");
            this.f36806a.setRequestProperty("Content-Type", "application/x-gzip");
            this.f36806a.setRequestProperty("Content-Encoding", "gzip");
            this.f36806a.setRequestProperty("Connection", "Keep-Alive");
            this.f36806a.setRequestProperty("User-Agent", str4);
            DataOutputStream dataOutputStream = new DataOutputStream(this.f36806a.getOutputStream());
            try {
                dataOutputStream.write(a(str2.getBytes(str3)));
                dataOutputStream.flush();
                a(aVar, this.f36806a);
                int responseCode = this.f36806a.getResponseCode();
                aVar.f36808b = responseCode;
                bufferedInputStream2 = responseCode == 200 ? new BufferedInputStream(this.f36806a.getInputStream()) : new BufferedInputStream(this.f36806a.getErrorStream());
                com.huawei.updatesdk.a.a.d.b bVar = new com.huawei.updatesdk.a.a.d.b();
                byte[] a12 = com.huawei.updatesdk.a.a.b.a.b().a();
                while (true) {
                    int read = bufferedInputStream2.read(a12);
                    if (read == -1) {
                        break;
                    }
                    bVar.a(a12, read);
                }
                com.huawei.updatesdk.a.a.b.a.b().a(a12);
                aVar.f36807a = bVar.a();
                HttpURLConnection httpURLConnection = this.f36806a;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                d.a(dataOutputStream);
                d.a(bufferedInputStream2);
                return aVar;
            } catch (Throwable th3) {
                th2 = th3;
                BufferedInputStream bufferedInputStream3 = bufferedInputStream2;
                bufferedInputStream2 = dataOutputStream;
                bufferedInputStream = bufferedInputStream3;
                HttpURLConnection httpURLConnection2 = this.f36806a;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                d.a(bufferedInputStream2);
                d.a(bufferedInputStream);
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            bufferedInputStream = null;
        }
    }

    public static HttpURLConnection a(String str, Context context) {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
        httpsURLConnection.setSSLSocketFactory(i.e(context));
        httpsURLConnection.setHostnameVerifier(new xr.b());
        return httpsURLConnection;
    }

    public void a() {
        HttpURLConnection httpURLConnection = this.f36806a;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    private void a(a aVar, HttpURLConnection httpURLConnection) {
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        if (headerFields == null) {
            com.huawei.updatesdk.a.a.c.a.a.a.d("HttpsUtil", "headers is null.");
            return;
        }
        List<String> list = headerFields.get("x-traceId");
        if (list == null || list.isEmpty()) {
            com.huawei.updatesdk.a.a.c.a.a.a.d("HttpsUtil", "no x-traceId.");
        } else {
            aVar.f36809c = list.get(0);
        }
    }

    private byte[] a(byte[] bArr) {
        DataOutputStream dataOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                dataOutputStream = new DataOutputStream(new GZIPOutputStream(byteArrayOutputStream, bArr.length));
            } catch (IOException e11) {
                e = e11;
                dataOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = null;
            }
        } catch (IOException e12) {
            e = e12;
            dataOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            dataOutputStream = null;
        }
        try {
            dataOutputStream.write(bArr, 0, bArr.length);
            dataOutputStream.flush();
        } catch (IOException e13) {
            e = e13;
            byteArrayOutputStream2 = byteArrayOutputStream;
            try {
                com.huawei.updatesdk.a.a.c.a.a.a.a("HttpsUtil", "gzip error!", e);
                byteArrayOutputStream = byteArrayOutputStream2;
                d.a(dataOutputStream);
                d.a(byteArrayOutputStream);
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th4) {
                th = th4;
                d.a(dataOutputStream);
                d.a(byteArrayOutputStream2);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            byteArrayOutputStream2 = byteArrayOutputStream;
            d.a(dataOutputStream);
            d.a(byteArrayOutputStream2);
            throw th;
        }
        d.a(dataOutputStream);
        d.a(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
