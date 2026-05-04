package com.tencent.bugly.proguard;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class af {

    /* renamed from: a, reason: collision with root package name */
    static af f42223a;

    /* renamed from: b, reason: collision with root package name */
    protected Context f42224b;

    /* renamed from: c, reason: collision with root package name */
    public Map<String, String> f42225c = null;

    public af(Context context) {
        this.f42224b = context;
    }

    private static byte[] b(HttpURLConnection httpURLConnection) {
        BufferedInputStream bufferedInputStream;
        if (httpURLConnection == null) {
            return null;
        }
        try {
            bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read <= 0) {
                        byteArrayOutputStream.flush();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        try {
                            bufferedInputStream.close();
                            return byteArray;
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                            return byteArray;
                        }
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    if (!al.a(th)) {
                        th.printStackTrace();
                    }
                    return null;
                } finally {
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th4) {
                            th4.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th5) {
            th = th5;
            bufferedInputStream = null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(5:20|21|22|23|24)|(6:26|(1:28)(2:53|54)|29|30|31|32)(11:56|(3:75|76|(4:78|79|80|81)(4:88|89|90|91))|64|65|(1:67)|68|69|70|45|46|47)|39|40|(1:42)|43|44|45|46|47) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x016c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0171, code lost:
    
        if (com.tencent.bugly.proguard.al.a(r0) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x014b, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0149, code lost:
    
        if (com.tencent.bugly.proguard.al.a(r0) != false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0165 A[Catch: all -> 0x00d8, TRY_LEAVE, TryCatch #4 {all -> 0x00d8, blocks: (B:21:0x0099, B:24:0x009f, B:26:0x00b2, B:29:0x00c6, B:40:0x015f, B:42:0x0165, B:53:0x00c2, B:65:0x0133, B:68:0x013d, B:76:0x00f6, B:78:0x00fe, B:90:0x0122), top: B:20:0x0099 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] a(java.lang.String r20, byte[] r21, com.tencent.bugly.proguard.aj r22, java.util.Map<java.lang.String, java.lang.String> r23) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.af.a(java.lang.String, byte[], com.tencent.bugly.proguard.aj, java.util.Map):byte[]");
    }

    private static Map<String, String> a(HttpURLConnection httpURLConnection) {
        HashMap hashMap = new HashMap();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        if (headerFields == null || headerFields.size() == 0) {
            return null;
        }
        for (String str : headerFields.keySet()) {
            List<String> list = headerFields.get(str);
            if (list.size() > 0) {
                hashMap.put(str, list.get(0));
            }
        }
        return hashMap;
    }

    private static HttpURLConnection a(String str, byte[] bArr, String str2, Map<String, String> map) {
        if (str == null) {
            al.e("destUrl is null.", new Object[0]);
            return null;
        }
        HttpURLConnection a11 = a(str2, str);
        if (a11 == null) {
            al.e("Failed to get HttpURLConnection object.", new Object[0]);
            return null;
        }
        try {
            a11.setRequestProperty("wup_version", "3.0");
            if (map != null && map.size() > 0) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    a11.setRequestProperty(entry.getKey(), URLEncoder.encode(entry.getValue(), "utf-8"));
                }
            }
            a11.setRequestProperty("A37", URLEncoder.encode(str2, "utf-8"));
            a11.setRequestProperty("A38", URLEncoder.encode(str2, "utf-8"));
            OutputStream outputStream = a11.getOutputStream();
            if (bArr == null) {
                outputStream.write(0);
                return a11;
            }
            outputStream.write(bArr);
            return a11;
        } catch (Throwable th2) {
            if (!al.a(th2)) {
                th2.printStackTrace();
            }
            al.e("Failed to upload, please check your network.", new Object[0]);
            return null;
        }
    }

    private static HttpURLConnection a(String str, String str2) {
        HttpURLConnection httpURLConnection;
        try {
            URL url = new URL(str2);
            Proxy proxy = an.f42286a;
            if (proxy != null) {
                httpURLConnection = (HttpURLConnection) url.openConnection(proxy);
            } else if (str != null && str.toLowerCase(Locale.US).contains("wap")) {
                httpURLConnection = (HttpURLConnection) url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(System.getProperty("http.proxyHost"), Integer.parseInt(System.getProperty("http.proxyPort")))));
            } else {
                httpURLConnection = (HttpURLConnection) url.openConnection();
            }
            httpURLConnection.setConnectTimeout(30000);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(false);
            return httpURLConnection;
        } catch (Throwable th2) {
            if (al.a(th2)) {
                return null;
            }
            th2.printStackTrace();
            return null;
        }
    }
}
