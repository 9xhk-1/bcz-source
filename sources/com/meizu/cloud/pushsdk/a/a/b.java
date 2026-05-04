package com.meizu.cloud.pushsdk.a.a;

import android.content.Context;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import n6.m;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f39330a = "b";

    /* renamed from: b, reason: collision with root package name */
    private static final Object f39331b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static b f39332c;

    private b(Context context) {
        try {
            System.setProperty("sun.net.http.allowRestrictedHeaders", m.f74525c);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        a.a(context);
    }

    public static b a(Context context) {
        if (f39332c == null) {
            synchronized (f39331b) {
                try {
                    if (f39332c == null) {
                        f39332c = new b(context);
                    }
                } finally {
                }
            }
        }
        return f39332c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0108, code lost:
    
        if (r1 != null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x010a, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x012b, code lost:
    
        if (r1 != null) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.meizu.cloud.pushsdk.a.a.c b(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, java.lang.String r9) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.a.a.b.b(java.lang.String, java.util.Map, java.lang.String):com.meizu.cloud.pushsdk.a.a.c");
    }

    private void b(URLConnection uRLConnection) {
        try {
            String headerField = uRLConnection.getHeaderField("Key-Timeout");
            DebugLogger.d(f39330a, "get keyTimeout = " + headerField);
        } catch (NullPointerException unused) {
        }
    }

    public c a(String str, Map<String, String> map, String str2) {
        try {
            return b(str, a(map), str2);
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    private Map<String, String> a(Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>(2);
        }
        byte[] c11 = a.a().c();
        if (c11 != null && c11.length > 0) {
            String str = new String(c11);
            DebugLogger.d(f39330a, "attach x_s_key: " + str);
            map.put("X-S-Key", str);
            return map;
        }
        byte[] b11 = a.a().b();
        if (b11 != null && b11.length > 0) {
            String str2 = new String(a.a().b());
            DebugLogger.d(f39330a, "attach x_a_key: " + str2);
            map.put("X-A-Key", str2);
        }
        return map;
    }

    private void a(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(httpURLConnection.getOutputStream());
            try {
                gZIPOutputStream2.write(bArr);
                gZIPOutputStream2.flush();
                try {
                    gZIPOutputStream2.close();
                } catch (Exception unused) {
                }
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream = gZIPOutputStream2;
                if (gZIPOutputStream != null) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private void a(URLConnection uRLConnection) {
        try {
            String headerField = uRLConnection.getHeaderField("X-S-Key");
            DebugLogger.d(f39330a, "get x_s_key = " + headerField);
            if (TextUtils.isEmpty(headerField)) {
                return;
            }
            a.a().a(headerField);
        } catch (NullPointerException unused) {
        }
    }

    private byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                int read = inputStream.read();
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(read);
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
                throw th2;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused2) {
        }
        return byteArray;
    }
}
