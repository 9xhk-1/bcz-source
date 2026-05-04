package com.igexin.push.g;

import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import ix.g;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

/* loaded from: classes7.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public static final String f38750a = "com.igexin.push.g.r";

    /* renamed from: b, reason: collision with root package name */
    public static final String f38751b = "utf-8";

    /* renamed from: c, reason: collision with root package name */
    private static final String f38752c = "POST";

    /* renamed from: d, reason: collision with root package name */
    private static final String f38753d = "GET";

    /* renamed from: e, reason: collision with root package name */
    private static final String f38754e = "GETUI";

    /* renamed from: f, reason: collision with root package name */
    private static final int f38755f = 30000;

    private static String a(InputStream inputStream, String str) throws Exception {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, str));
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[256];
            while (true) {
                int read = bufferedReader.read(cArr);
                if (read <= 0) {
                    break;
                }
                stringWriter.write(cArr, 0, read);
            }
            String stringWriter2 = stringWriter.toString();
            if (inputStream != null) {
                inputStream.close();
            }
            return stringWriter2;
        } catch (Throwable th2) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th2;
        }
    }

    private static String b(HttpURLConnection httpURLConnection) throws Exception {
        String a11 = a(httpURLConnection.getErrorStream(), a(httpURLConnection.getContentType()));
        if (!TextUtils.isEmpty(a11)) {
            return a11;
        }
        throw new IOException(httpURLConnection.getResponseCode() + ":" + httpURLConnection.getResponseMessage());
    }

    private static byte[] c(String str, Map<String, String> map, int i11, int i12) throws Exception {
        HttpURLConnection b11 = b(str, map, i11, i12, "utf-8");
        try {
            try {
                return a(b11);
            } catch (Exception e11) {
                throw e11;
            }
        } finally {
            if (b11 != null) {
                b11.disconnect();
            }
        }
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "utf-8";
        }
        for (String str2 : str.split(com.alipay.sdk.m.u.i.f11097b)) {
            String trim = str2.trim();
            if (trim.startsWith("charset")) {
                String[] split = trim.split(ContainerUtils.KEY_VALUE_DELIMITER, 2);
                return (split.length != 2 || TextUtils.isEmpty(split[1])) ? "utf-8" : split[1].trim();
            }
        }
        return "utf-8";
    }

    private static HttpURLConnection b(String str, Map<String, String> map, int i11, int i12, String str2) throws Exception {
        HttpURLConnection a11 = a(a(str, a(map, str2)), "GET", "application/x-www-form-urlencoded;charset=".concat(String.valueOf(str2)));
        a11.setConnectTimeout(i11);
        a11.setReadTimeout(i12);
        return a11;
    }

    private static String a(Map<String, String> map, String str) throws Exception {
        if (map == null || map.isEmpty()) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            str = "utf-8";
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z11 = false;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                if (z11) {
                    sb2.append("&");
                } else {
                    z11 = true;
                }
                sb2.append(key);
                sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb2.append(URLEncoder.encode(value, str));
            }
        }
        return sb2.toString();
    }

    private static byte[] b(String str, String str2, String str3) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Content-Disposition:form-data;name=\"");
        sb2.append("dp_data");
        sb2.append("\";filename=\"");
        if (TextUtils.isEmpty(str)) {
            str = g.b.f62788b;
        }
        sb2.append(str);
        sb2.append("\"\r\nContent-Type:");
        sb2.append(str2);
        sb2.append("\r\n\r\n");
        return sb2.toString().getBytes(str3);
    }

    private static HttpURLConnection a(URL url, String str, String str2) throws Exception {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod(str);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(30000);
        httpURLConnection.setRequestProperty("User-Agent", f38754e);
        httpURLConnection.setRequestProperty("Content-Type", str2);
        httpURLConnection.setRequestProperty("HOST", url.getHost() + ":" + url.getPort());
        return httpURLConnection;
    }

    private static byte[] b(String str, Map<String, String> map, int i11, int i12) throws Exception {
        return a(str, map, i11, i12, "utf-8");
    }

    private static URL a(String str, String str2) throws Exception {
        String str3;
        StringBuilder sb2;
        StringBuilder sb3;
        String sb4;
        URL url = new URL(str);
        if (TextUtils.isEmpty(str2)) {
            return url;
        }
        if (TextUtils.isEmpty(url.getQuery())) {
            str3 = "?";
            if (str.endsWith("?")) {
                sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(str2);
                sb4 = sb3.toString();
            } else {
                sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(str3);
                sb2.append(str2);
                sb4 = sb2.toString();
            }
        } else {
            str3 = "&";
            if (str.endsWith("&")) {
                sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(str2);
                sb4 = sb3.toString();
            } else {
                sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(str3);
                sb2.append(str2);
                sb4 = sb2.toString();
            }
        }
        return new URL(sb4);
    }

    private static URL a(String str, Map<String, String> map, String str2) throws Exception {
        return a(str, a(map, str2));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static byte[] a(java.io.InputStream r5) {
        /*
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1e
            r2 = 1024(0x400, float:1.435E-42)
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1e
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1e
        Lf:
            int r3 = r1.read(r2)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1e
            r4 = -1
            if (r3 == r4) goto L20
            r4 = 0
            r5.write(r2, r4, r3)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1e
            goto Lf
        L1b:
            r5 = move-exception
            r0 = r1
            goto L3f
        L1e:
            r5 = move-exception
            goto L31
        L20:
            byte[] r5 = r5.toByteArray()     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1e
            r1.close()     // Catch: java.io.IOException -> L28
            return r5
        L28:
            r0 = move-exception
            com.igexin.c.a.c.a.a(r0)
            return r5
        L2d:
            r5 = move-exception
            goto L3f
        L2f:
            r5 = move-exception
            r1 = r0
        L31:
            com.igexin.c.a.c.a.a(r5)     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L3e
            r1.close()     // Catch: java.io.IOException -> L3a
            goto L3e
        L3a:
            r5 = move-exception
            com.igexin.c.a.c.a.a(r5)
        L3e:
            return r0
        L3f:
            if (r0 == 0) goto L49
            r0.close()     // Catch: java.io.IOException -> L45
            goto L49
        L45:
            r0 = move-exception
            com.igexin.c.a.c.a.a(r0)
        L49:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.g.r.a(java.io.InputStream):byte[]");
    }

    private static byte[] a(String str, String str2, String str3) throws IOException {
        return ("Content-Disposition:form-data;name=\"" + str + "\"\r\nContent-Type:text/plain\r\n\r\n" + str2).getBytes(str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static byte[] a(java.lang.String r2, java.lang.String r3, byte[] r4, int r5, int r6) throws java.lang.Exception {
        /*
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L30
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L30
            java.lang.String r2 = "POST"
            java.net.HttpURLConnection r2 = a(r1, r2, r3)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L30
            r2.setConnectTimeout(r5)     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L2b
            r2.setReadTimeout(r6)     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L2b
            java.io.OutputStream r0 = r2.getOutputStream()     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            r0.write(r4)     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            byte[] r3 = a(r2)     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            r0.close()
            r2.disconnect()
            return r3
        L24:
            r3 = move-exception
            goto L36
        L26:
            r3 = move-exception
            com.igexin.c.a.c.a.a(r3)     // Catch: java.lang.Throwable -> L24
            throw r3     // Catch: java.lang.Throwable -> L24
        L2b:
            r3 = move-exception
            goto L32
        L2d:
            r3 = move-exception
            r2 = r0
            goto L36
        L30:
            r3 = move-exception
            r2 = r0
        L32:
            com.igexin.c.a.c.a.a(r3)     // Catch: java.lang.Throwable -> L24
            throw r3     // Catch: java.lang.Throwable -> L24
        L36:
            if (r0 == 0) goto L3b
            r0.close()
        L3b:
            if (r2 == 0) goto L40
            r2.disconnect()
        L40:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.g.r.a(java.lang.String, java.lang.String, byte[], int, int):byte[]");
    }

    private static byte[] a(String str, Map<String, String> map, int i11, int i12) throws Exception {
        return a(str, map, "utf-8", i11, i12);
    }

    private static byte[] a(String str, Map<String, String> map, int i11, int i12, String str2) throws Exception {
        HttpURLConnection b11 = b(str, map, i11, i12, str2);
        try {
            try {
                return a(b11);
            } catch (Exception e11) {
                throw e11;
            }
        } finally {
            if (b11 != null) {
                b11.disconnect();
            }
        }
    }

    private static byte[] a(String str, Map<String, String> map, String str2, int i11, int i12) throws Exception {
        String concat = "application/x-www-form-urlencoded;charset=".concat(String.valueOf(str2));
        String a11 = a(map, str2);
        byte[] bArr = new byte[0];
        if (a11 != null) {
            bArr = a11.getBytes(str2);
        }
        return a(str, concat, bArr, i11, i12);
    }

    private static byte[] a(String str, Map<String, String> map, Map<String, i> map2, int i11, int i12) throws Exception {
        return (map2 == null || map2.isEmpty()) ? a(str, map, "utf-8", i11, i12) : a(str, map, map2, "utf-8", i11, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0175 A[Catch: all -> 0x0119, Exception -> 0x011d, TryCatch #11 {Exception -> 0x011d, all -> 0x0119, blocks: (B:48:0x016c, B:51:0x0192, B:52:0x019b, B:55:0x01ba, B:57:0x01de, B:62:0x0175, B:65:0x017e, B:68:0x0187, B:84:0x00fd, B:86:0x0109, B:88:0x010f, B:91:0x011f, B:93:0x0125, B:95:0x012d, B:98:0x0138, B:100:0x013f, B:102:0x0146, B:104:0x014e, B:116:0x01e7), top: B:47:0x016c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static byte[] a(java.lang.String r17, java.util.Map<java.lang.String, java.lang.String> r18, java.util.Map<java.lang.String, com.igexin.push.g.i> r19, java.lang.String r20, int r21, int r22) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.g.r.a(java.lang.String, java.util.Map, java.util.Map, java.lang.String, int, int):byte[]");
    }

    public static byte[] a(String str, byte[] bArr) throws Exception {
        return a(str, "application/octet-stream", bArr, 10000, 10000);
    }

    private static byte[] a(HttpURLConnection httpURLConnection) throws Exception {
        return httpURLConnection.getErrorStream() == null ? a(httpURLConnection.getInputStream()) : b(httpURLConnection).getBytes();
    }
}
