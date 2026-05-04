package com.huawei.hms.opendevice;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class d {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum a {
        GET("GET"),
        POST("POST");


        /* renamed from: d, reason: collision with root package name */
        public String f36086d;

        a(String str) {
            this.f36086d = str;
        }

        public String a() {
            return this.f36086d;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.io.BufferedOutputStream, java.io.FilterOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.io.InputStream] */
    public static String a(Context context, String str, String str2, Map<String, String> map) {
        ?? r82;
        ?? r92;
        ?? r102;
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        InputStream inputStream2;
        InputStream inputStream3;
        InputStream inputStream4;
        ?? r83;
        InputStream inputStream5;
        InputStream inputStream6;
        OutputStream outputStream;
        ?? r22 = 0;
        if (str2 == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        int i11 = -1;
        try {
            try {
                httpURLConnection = a(context, str, map, a.POST.a());
                if (httpURLConnection == null) {
                    zr.e.d(null);
                    zr.e.c(null);
                    zr.e.c(null);
                    s.a(httpURLConnection);
                    HMSLog.i("PushHttpClient", "close connection");
                    return null;
                }
                try {
                    r83 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                } catch (IOException unused) {
                    inputStream3 = null;
                    inputStream4 = inputStream3;
                    r83 = inputStream3;
                    inputStream5 = inputStream4;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("http execute encounter IOException - http code:");
                    sb2.append(i11);
                    HMSLog.w("PushHttpClient", sb2.toString());
                    outputStream = r83;
                    inputStream6 = inputStream4;
                    zr.e.d(outputStream);
                    zr.e.c(inputStream6);
                    zr.e.c(inputStream5);
                    s.a(httpURLConnection);
                    HMSLog.i("PushHttpClient", "close connection");
                    return null;
                } catch (RuntimeException unused2) {
                    inputStream2 = null;
                    inputStream4 = inputStream2;
                    r83 = inputStream2;
                    inputStream5 = inputStream4;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("http execute encounter RuntimeException - http code:");
                    sb3.append(i11);
                    HMSLog.w("PushHttpClient", sb3.toString());
                    outputStream = r83;
                    inputStream6 = inputStream4;
                    zr.e.d(outputStream);
                    zr.e.c(inputStream6);
                    zr.e.c(inputStream5);
                    s.a(httpURLConnection);
                    HMSLog.i("PushHttpClient", "close connection");
                    return null;
                } catch (Exception unused3) {
                    inputStream = null;
                    inputStream4 = inputStream;
                    r83 = inputStream;
                    inputStream5 = inputStream4;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("http execute encounter unknown exception - http code:");
                    sb4.append(i11);
                    HMSLog.w("PushHttpClient", sb4.toString());
                    outputStream = r83;
                    inputStream6 = inputStream4;
                    zr.e.d(outputStream);
                    zr.e.c(inputStream6);
                    zr.e.c(inputStream5);
                    s.a(httpURLConnection);
                    HMSLog.i("PushHttpClient", "close connection");
                    return null;
                } catch (Throwable th2) {
                    r92 = 0;
                    r102 = 0;
                    r22 = httpURLConnection;
                    th = th2;
                    r82 = 0;
                }
                try {
                    r83.write(str2.getBytes("UTF-8"));
                    r83.flush();
                    i11 = httpURLConnection.getResponseCode();
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("http post response code: ");
                    sb5.append(i11);
                    HMSLog.d("PushHttpClient", sb5.toString());
                    inputStream4 = i11 >= 400 ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
                    try {
                        inputStream5 = new BufferedInputStream(inputStream4);
                        try {
                            String a11 = s.a(inputStream5);
                            zr.e.d(r83);
                            zr.e.c(inputStream4);
                            zr.e.c(inputStream5);
                            s.a(httpURLConnection);
                            HMSLog.i("PushHttpClient", "close connection");
                            return a11;
                        } catch (IOException unused4) {
                            StringBuilder sb22 = new StringBuilder();
                            sb22.append("http execute encounter IOException - http code:");
                            sb22.append(i11);
                            HMSLog.w("PushHttpClient", sb22.toString());
                            outputStream = r83;
                            inputStream6 = inputStream4;
                            zr.e.d(outputStream);
                            zr.e.c(inputStream6);
                            zr.e.c(inputStream5);
                            s.a(httpURLConnection);
                            HMSLog.i("PushHttpClient", "close connection");
                            return null;
                        } catch (RuntimeException unused5) {
                            StringBuilder sb32 = new StringBuilder();
                            sb32.append("http execute encounter RuntimeException - http code:");
                            sb32.append(i11);
                            HMSLog.w("PushHttpClient", sb32.toString());
                            outputStream = r83;
                            inputStream6 = inputStream4;
                            zr.e.d(outputStream);
                            zr.e.c(inputStream6);
                            zr.e.c(inputStream5);
                            s.a(httpURLConnection);
                            HMSLog.i("PushHttpClient", "close connection");
                            return null;
                        } catch (Exception unused6) {
                            StringBuilder sb42 = new StringBuilder();
                            sb42.append("http execute encounter unknown exception - http code:");
                            sb42.append(i11);
                            HMSLog.w("PushHttpClient", sb42.toString());
                            outputStream = r83;
                            inputStream6 = inputStream4;
                            zr.e.d(outputStream);
                            zr.e.c(inputStream6);
                            zr.e.c(inputStream5);
                            s.a(httpURLConnection);
                            HMSLog.i("PushHttpClient", "close connection");
                            return null;
                        }
                    } catch (IOException unused7) {
                        inputStream5 = null;
                    } catch (RuntimeException unused8) {
                        inputStream5 = null;
                    } catch (Exception unused9) {
                        inputStream5 = null;
                    } catch (Throwable th3) {
                        r22 = httpURLConnection;
                        th = th3;
                        r102 = 0;
                        r82 = r83;
                        r92 = inputStream4;
                        zr.e.d(r82);
                        zr.e.c(r92);
                        zr.e.c(r102);
                        s.a((HttpURLConnection) r22);
                        HMSLog.i("PushHttpClient", "close connection");
                        throw th;
                    }
                } catch (IOException unused10) {
                    inputStream4 = null;
                    r83 = r83;
                    inputStream5 = inputStream4;
                    StringBuilder sb222 = new StringBuilder();
                    sb222.append("http execute encounter IOException - http code:");
                    sb222.append(i11);
                    HMSLog.w("PushHttpClient", sb222.toString());
                    outputStream = r83;
                    inputStream6 = inputStream4;
                    zr.e.d(outputStream);
                    zr.e.c(inputStream6);
                    zr.e.c(inputStream5);
                    s.a(httpURLConnection);
                    HMSLog.i("PushHttpClient", "close connection");
                    return null;
                } catch (RuntimeException unused11) {
                    inputStream4 = null;
                    r83 = r83;
                    inputStream5 = inputStream4;
                    StringBuilder sb322 = new StringBuilder();
                    sb322.append("http execute encounter RuntimeException - http code:");
                    sb322.append(i11);
                    HMSLog.w("PushHttpClient", sb322.toString());
                    outputStream = r83;
                    inputStream6 = inputStream4;
                    zr.e.d(outputStream);
                    zr.e.c(inputStream6);
                    zr.e.c(inputStream5);
                    s.a(httpURLConnection);
                    HMSLog.i("PushHttpClient", "close connection");
                    return null;
                } catch (Exception unused12) {
                    inputStream4 = null;
                    r83 = r83;
                    inputStream5 = inputStream4;
                    StringBuilder sb422 = new StringBuilder();
                    sb422.append("http execute encounter unknown exception - http code:");
                    sb422.append(i11);
                    HMSLog.w("PushHttpClient", sb422.toString());
                    outputStream = r83;
                    inputStream6 = inputStream4;
                    zr.e.d(outputStream);
                    zr.e.c(inputStream6);
                    zr.e.c(inputStream5);
                    s.a(httpURLConnection);
                    HMSLog.i("PushHttpClient", "close connection");
                    return null;
                } catch (Throwable th4) {
                    r102 = 0;
                    r22 = httpURLConnection;
                    th = th4;
                    r92 = 0;
                    r82 = r83;
                }
            } catch (Throwable th5) {
                r22 = context;
                th = th5;
                r82 = str;
                r92 = str2;
                r102 = map;
            }
        } catch (IOException unused13) {
            httpURLConnection = null;
            inputStream3 = null;
        } catch (RuntimeException unused14) {
            httpURLConnection = null;
            inputStream2 = null;
        } catch (Exception unused15) {
            httpURLConnection = null;
            inputStream = null;
        } catch (Throwable th6) {
            th = th6;
            r82 = 0;
            r92 = 0;
            r102 = 0;
        }
    }

    public static HttpURLConnection a(Context context, String str, Map<String, String> map, String str2) throws Exception {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        a(context, httpURLConnection);
        httpURLConnection.setRequestMethod(str2);
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(15000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setRequestProperty("Content-type", "application/json; charset=UTF-8");
        httpURLConnection.setRequestProperty("Connection", "close");
        if (map != null && map.size() >= 1) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key != null && !TextUtils.isEmpty(key)) {
                    httpURLConnection.setRequestProperty(key, URLEncoder.encode(entry.getValue() == null ? "" : entry.getValue(), "UTF-8"));
                }
            }
        }
        return httpURLConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r2, java.net.HttpURLConnection r3) throws java.lang.Exception {
        /*
            java.lang.String r0 = "PushHttpClient"
            boolean r1 = r3 instanceof javax.net.ssl.HttpsURLConnection
            if (r1 == 0) goto L44
            javax.net.ssl.HttpsURLConnection r3 = (javax.net.ssl.HttpsURLConnection) r3
            wr.h r2 = wr.h.g(r2)     // Catch: java.lang.IllegalArgumentException -> Ld java.lang.IllegalAccessException -> L13 java.io.IOException -> L19 java.security.GeneralSecurityException -> L1f java.security.KeyStoreException -> L25 java.security.NoSuchAlgorithmException -> L2b
            goto L31
        Ld:
            java.lang.String r2 = "Get SocketFactory Illegal Argument Exception."
            com.huawei.hms.support.log.HMSLog.w(r0, r2)
            goto L30
        L13:
            java.lang.String r2 = "Get SocketFactory Illegal Access Exception."
            com.huawei.hms.support.log.HMSLog.w(r0, r2)
            goto L30
        L19:
            java.lang.String r2 = "Get SocketFactory IO Exception."
            com.huawei.hms.support.log.HMSLog.w(r0, r2)
            goto L30
        L1f:
            java.lang.String r2 = "Get SocketFactory General Security Exception."
            com.huawei.hms.support.log.HMSLog.w(r0, r2)
            goto L30
        L25:
            java.lang.String r2 = "Get SocketFactory Key Store exception."
            com.huawei.hms.support.log.HMSLog.w(r0, r2)
            goto L30
        L2b:
            java.lang.String r2 = "Get SocketFactory Algorithm Exception."
            com.huawei.hms.support.log.HMSLog.w(r0, r2)
        L30:
            r2 = 0
        L31:
            if (r2 == 0) goto L3c
            r3.setSSLSocketFactory(r2)
            org.apache.http.conn.ssl.X509HostnameVerifier r2 = wr.h.f96699j
            r3.setHostnameVerifier(r2)
            return
        L3c:
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.String r3 = "No ssl socket factory set."
            r2.<init>(r3)
            throw r2
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.opendevice.d.a(android.content.Context, java.net.HttpURLConnection):void");
    }
}
