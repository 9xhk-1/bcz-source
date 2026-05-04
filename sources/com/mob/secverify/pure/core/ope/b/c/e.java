package com.mob.secverify.pure.core.ope.b.c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import com.baicizhan.client.framework.network.http.HttpRequest;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static String f40876a = UUID.randomUUID().toString();

    /* renamed from: b, reason: collision with root package name */
    private Context f40877b;

    /* renamed from: c, reason: collision with root package name */
    private g f40878c;

    public e(Context context, g gVar) {
        this.f40877b = context;
        this.f40878c = gVar;
    }

    private static boolean a(String str) {
        return (str.contains("/api/netm/v1.0/qhbt") || str.contains("/api/netm/v1.0/qhbv") || str.contains("/st/api/v1.0/ses")) ? false : true;
    }

    public static String b(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context == null || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            return "UNKNOW";
        }
        String typeName = activeNetworkInfo.getTypeName();
        if ("MOBILE".equalsIgnoreCase(typeName)) {
            return "NET";
        }
        if ("WIFI".equalsIgnoreCase(typeName)) {
            return "WIFI";
        }
        return null;
    }

    private static String c(Context context) {
        String str;
        try {
            str = WebSettings.getDefaultUserAgent(context);
        } catch (Exception unused) {
            str = null;
        }
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt <= 31 || charAt >= 127) {
                sb2.append(String.format("\\u%04x", Integer.valueOf(charAt)));
            } else {
                sb2.append(charAt);
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r1) {
        /*
            if (r1 == 0) goto L7
            java.lang.String r1 = c(r1)     // Catch: java.lang.Throwable -> L7
            goto L8
        L7:
            r1 = 0
        L8:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L10
            java.lang.String r1 = "Mozilla/5.0 (Linux; U; Android %s) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 %sSafari/533.1"
        L10:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.secverify.pure.core.ope.b.c.e.a(android.content.Context):java.lang.String");
    }

    private ByteArrayOutputStream a(g gVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (gVar != null) {
            try {
                String a11 = g.a(this.f40878c.e());
                if (gVar.d().contains("/dro/log/v1.0/log")) {
                    a11 = gVar.e().toString();
                }
                ArrayList<File> b11 = gVar.b();
                if (b11 != null && b11.size() > 0) {
                    byteArrayOutputStream.write((HttpRequest.f17578o + f40876a + "\r\n").getBytes("utf-8"));
                    byteArrayOutputStream.write("Content-Disposition: form-data; name=\"params\"".getBytes("utf-8"));
                    byteArrayOutputStream.write("\r\n\r\n".getBytes("utf-8"));
                    byteArrayOutputStream.write(a11.getBytes("utf-8"));
                    byteArrayOutputStream.write("\r\n".getBytes("utf-8"));
                    for (int i11 = 0; i11 < b11.size(); i11++) {
                        File file = b11.get(i11);
                        if (file != null) {
                            FileInputStream fileInputStream = new FileInputStream(file);
                            String name = file.getName();
                            byteArrayOutputStream.write((HttpRequest.f17578o + f40876a + "\r\n").getBytes("utf-8"));
                            byteArrayOutputStream.write(("Content-Disposition: form-data; name=\"" + name + "\"; filename=\"" + name + "\"\r\n").getBytes("utf-8"));
                            byteArrayOutputStream.write("Content-Type: application/octet-stream\r\n".getBytes("utf-8"));
                            byteArrayOutputStream.write("Content-Transfer-Encoding: binary\r\n\r\n".getBytes("utf-8"));
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = fileInputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, read);
                            }
                            byteArrayOutputStream.write(("\r\n--" + f40876a + "--\r\n").getBytes("utf-8"));
                            byteArrayOutputStream.flush();
                            fileInputStream.close();
                        }
                    }
                }
                byteArrayOutputStream.write(a11.getBytes("utf-8"));
                return byteArrayOutputStream;
            } catch (Exception e11) {
                com.mob.secverify.b.c.a().b("[SecPure][%s][%s] ==>%s", "NetworkHelper", "writeParams", e11.toString());
            }
        }
        return byteArrayOutputStream;
    }

    public final g b() {
        return this.f40878c;
    }

    public final void c() {
        this.f40878c.a("GET");
    }

    public final String a() {
        g gVar = this.f40878c;
        if (gVar == null) {
            return null;
        }
        String a11 = gVar.a();
        String d11 = this.f40878c.d();
        if (a11.equals("GET")) {
            String a12 = g.a(this.f40878c.e());
            if (!TextUtils.isEmpty(a12)) {
                return d11 + "?" + a12;
            }
        }
        return d11;
    }

    @SuppressLint({"DefaultLocale"})
    public final HttpURLConnection a(String str, boolean z11) {
        Object obj = null;
        try {
            if (!TextUtils.isEmpty(str)) {
                URL url = new URL(str);
                String b11 = b(this.f40877b);
                System.currentTimeMillis();
                if (a(str) && !b11.equals("NET")) {
                    obj = new c(this.f40877b, url).a();
                }
                if (obj == null) {
                    obj = url.openConnection();
                } else if (b11.equals("WIFI")) {
                    b11 = "2";
                }
                ((HttpURLConnection) obj).setDoOutput(true);
                ((HttpURLConnection) obj).setConnectTimeout(30000);
                ((HttpURLConnection) obj).setReadTimeout(30000);
                ((HttpURLConnection) obj).setInstanceFollowRedirects(false);
                ((HttpURLConnection) obj).setRequestProperty("user-agent", a(this.f40877b));
                ((HttpURLConnection) obj).setRequestProperty("netType", String.valueOf(b11));
                ((HttpURLConnection) obj).setRequestProperty("os", "android");
                HashMap<String, Object> f11 = this.f40878c.f();
                if (f11 != null && f11.size() > 0) {
                    for (Map.Entry<String, Object> entry : f11.entrySet()) {
                        ((HttpURLConnection) obj).setRequestProperty(entry.getKey(), (String) entry.getValue());
                    }
                }
            }
        } catch (MalformedURLException e11) {
            Log.d("[SecPure][%s][%s] ==>%s", "NetworkHelper MalformedURLException" + e11.toString());
        } catch (IOException e12) {
            Log.d("[SecPure][%s][%s] ==>%s", "NetworkHelper IOException" + e12.toString());
        }
        return (HttpURLConnection) obj;
    }

    public final HttpURLConnection a(HttpURLConnection httpURLConnection) throws IOException {
        if (httpURLConnection != null) {
            g gVar = this.f40878c;
            if (gVar != null && gVar.c()) {
                httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + f40876a);
            } else {
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            }
            httpURLConnection.setRequestProperty("Charset", "UTF-8");
            httpURLConnection.setRequestProperty(c60.c.f8163j, c60.c.f8165l);
            g gVar2 = this.f40878c;
            if (gVar2 != null) {
                if ("POST".equals(gVar2.a())) {
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.connect();
                    httpURLConnection.getOutputStream().write(a(this.f40878c).toByteArray());
                    return httpURLConnection;
                }
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.connect();
            }
        }
        return httpURLConnection;
    }
}
