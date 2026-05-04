package com.huawei.hms.hatool;

import android.text.TextUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class w {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public static n0 a(String str, byte[] bArr, Map<String, String> map) {
        return a(str, bArr, map, "POST");
    }

    private static String b(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = httpURLConnection.getInputStream();
                return k1.a(inputStream);
            } catch (IOException unused) {
                v.f("hmsSdk", "When Response Content From Connection inputStream operation exception! " + httpURLConnection.getResponseCode());
                k1.a((Closeable) inputStream);
                return "";
            }
        } finally {
            k1.a((Closeable) inputStream);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0151  */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.Map, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v23, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33, types: [java.io.Closeable, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.io.BufferedOutputStream, java.io.Closeable, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.hms.hatool.n0 a(java.lang.String r6, byte[] r7, java.util.Map<java.lang.String, java.lang.String> r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.hatool.w.a(java.lang.String, byte[], java.util.Map, java.lang.String):com.huawei.hms.hatool.n0");
    }

    private static HttpURLConnection a(String str, int i11, Map<String, String> map, String str2) {
        if (TextUtils.isEmpty(str)) {
            v.b("hmsSdk", "CreateConnection: invalid urlPath.");
            return null;
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        a(httpURLConnection);
        httpURLConnection.setRequestMethod(str2);
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(15000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(i11));
        httpURLConnection.setRequestProperty("Connection", "close");
        if (map != null && map.size() >= 1) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key != null && !TextUtils.isEmpty(key)) {
                    httpURLConnection.setRequestProperty(key, entry.getValue());
                }
            }
        }
        return httpURLConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(java.net.HttpURLConnection r2) {
        /*
            java.lang.String r0 = "hmsSdk"
            boolean r1 = r2 instanceof javax.net.ssl.HttpsURLConnection
            if (r1 == 0) goto L3a
            javax.net.ssl.HttpsURLConnection r2 = (javax.net.ssl.HttpsURLConnection) r2
            android.content.Context r1 = com.huawei.hms.hatool.q0.i()     // Catch: java.lang.IllegalAccessException -> L11 java.io.IOException -> L17 java.security.GeneralSecurityException -> L1a java.security.KeyStoreException -> L1d java.security.NoSuchAlgorithmException -> L20
            wr.h r0 = wr.h.g(r1)     // Catch: java.lang.IllegalAccessException -> L11 java.io.IOException -> L17 java.security.GeneralSecurityException -> L1a java.security.KeyStoreException -> L1d java.security.NoSuchAlgorithmException -> L20
            goto L24
        L11:
            java.lang.String r1 = "getSocketFactory(): Illegal Access Exception "
        L13:
            com.huawei.hms.hatool.v.f(r0, r1)
            goto L23
        L17:
            java.lang.String r1 = "getSocketFactory(): IO Exception!"
            goto L13
        L1a:
            java.lang.String r1 = "getSocketFactory(): General Security Exception"
            goto L13
        L1d:
            java.lang.String r1 = "getSocketFactory(): Key Store exception"
            goto L13
        L20:
            java.lang.String r1 = "getSocketFactory(): Algorithm Exception!"
            goto L13
        L23:
            r0 = 0
        L24:
            if (r0 == 0) goto L32
            r2.setSSLSocketFactory(r0)
            xr.b r0 = new xr.b
            r0.<init>()
            r2.setHostnameVerifier(r0)
            return
        L32:
            com.huawei.hms.hatool.w$a r2 = new com.huawei.hms.hatool.w$a
            java.lang.String r0 = "No ssl socket factory set"
            r2.<init>(r0)
            throw r2
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.hatool.w.a(java.net.HttpURLConnection):void");
    }
}
