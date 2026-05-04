package com.zx.a.I8b7;

import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.Network;
import android.text.TextUtils;
import android.util.Base64;
import com.xiaomi.mipush.sdk.Constants;
import com.zx.a.I8b7.o2;
import com.zx.a.I8b7.q1;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class f1 {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f46505b = {-95, -8, -49, 34, 91, -116, -29, -2, -106, 39, -56, 39, -121, 112, -22, ho.c.f59560y};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f46506c = {-84, -2, -56, -72, -90, 65, -76, -48, -92, ho.c.H, -27, com.baicizhan.main.vld.bonding.j.f25378c, -102, 101, s60.b.f88049h, ho.c.B};

    /* renamed from: a, reason: collision with root package name */
    public final String[] f46507a = b();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final f1 f46513a = new f1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:
    
        if ((r0.isWifiEnabled() && (r3 == null ? 0 : r3.getIpAddress()) != 0) != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.String r0 = com.zx.a.I8b7.m3.f46593i
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb7
            java.lang.String r0 = com.zx.a.I8b7.m3.f46593i
            java.lang.String r1 = "Z01-"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto Lb7
            android.content.Context r0 = com.zx.a.I8b7.m3.f46585a
            java.lang.String r0 = com.zx.a.I8b7.w3.b(r0)
            java.lang.String r1 = "中国联通"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb7
            android.content.Context r0 = com.zx.a.I8b7.m3.f46585a
            java.lang.String r1 = "android.permission.ACCESS_WIFI_STATE"
            r2 = 0
            boolean r0 = com.zx.a.I8b7.w3.a(r0, r1, r2)
            android.content.Context r1 = com.zx.a.I8b7.m3.f46585a
            java.lang.String r3 = "android.permission.CHANGE_NETWORK_STATE"
            boolean r1 = com.zx.a.I8b7.w3.a(r1, r3, r2)
            if (r0 == 0) goto Lb4
            if (r1 == 0) goto Lb4
            android.content.Context r0 = com.zx.a.I8b7.m3.f46585a
            r1 = 1
            java.lang.String r3 = "phone"
            java.lang.Object r0 = r0.getSystemService(r3)     // Catch: java.lang.Exception -> L56
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch: java.lang.Exception -> L56
            java.lang.Class r3 = r0.getClass()     // Catch: java.lang.Exception -> L56
            java.lang.String r4 = "getDataEnabled"
            r5 = 0
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.Exception -> L56
            java.lang.Object r0 = r3.invoke(r0, r5)     // Catch: java.lang.Exception -> L56
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L56
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L56
            goto L57
        L56:
            r0 = r1
        L57:
            if (r0 == 0) goto Lb7
            android.content.Context r0 = com.zx.a.I8b7.m3.f46585a
            java.lang.String r3 = "wifi"
            java.lang.Object r4 = r0.getSystemService(r3)
            android.net.wifi.WifiManager r4 = (android.net.wifi.WifiManager) r4
            boolean r4 = r4.isWifiEnabled()
            if (r4 == 0) goto L89
            java.lang.Object r0 = r0.getSystemService(r3)
            android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0
            android.net.wifi.WifiInfo r3 = r0.getConnectionInfo()
            if (r3 != 0) goto L77
            r3 = r2
            goto L7b
        L77:
            int r3 = r3.getIpAddress()
        L7b:
            boolean r0 = r0.isWifiEnabled()
            if (r0 == 0) goto L85
            if (r3 == 0) goto L85
            r0 = r1
            goto L86
        L85:
            r0 = r2
        L86:
            if (r0 == 0) goto L89
            goto L8a
        L89:
            r1 = r2
        L8a:
            if (r1 == 0) goto Lb0
            android.content.Context r0 = com.zx.a.I8b7.m3.f46585a
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkRequest$Builder r1 = new android.net.NetworkRequest$Builder
            r1.<init>()
            r3 = 12
            r1.addCapability(r3)
            r1.addTransportType(r2)
            android.net.NetworkRequest r1 = r1.build()
            com.zx.a.I8b7.f1$a r2 = new com.zx.a.I8b7.f1$a
            r2.<init>(r0)
            r0.requestNetwork(r1, r2)
            goto Lb7
        Lb0:
            r6.e()
            goto Lb7
        Lb4:
            r6.e()
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zx.a.I8b7.f1.a():void");
    }

    public final String[] b() {
        return new String[]{"https://nisportal.10010.com:9001", "1073741824000"};
    }

    public final String c() throws Exception {
        o2 o2Var = new o2(new o2.a());
        q1.a aVar = new q1.a();
        q1.a a11 = aVar.a(a(this.f46507a[0]));
        a11.f46665b = "GET";
        a11.f46668e = "unicom uaid nisportal api";
        JSONObject jSONObject = new JSONObject(new i1(o2Var, new q1(aVar)).a().f46694e.b());
        String optString = jSONObject.optString("authurl");
        if (TextUtils.isEmpty(optString)) {
            throw new RuntimeException(jSONObject.toString());
        }
        q1.a aVar2 = new q1.a();
        q1.a a12 = aVar2.a(a(optString));
        a12.f46665b = "GET";
        a12.f46668e = "unicom uaid auth api";
        return new JSONObject(new i1(o2Var, new q1(aVar2)).a().f46694e.b()).getString("code");
    }

    public final String d() throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, new SecretKeySpec(f46505b, "AES"), new IvParameterSpec(f46506c));
        return new String(cipher.doFinal(Base64.decode("xxXbFehPQ+Zs/VtAtd6DL3ogem3eY/0zoVy6qWtcMuI5NPlB0yUsMmvUu+oK7CzNKOAIJmt5N8/SdP04E4O7Tw==", 2)), "UTF-8");
    }

    public final void e() {
        try {
            c();
            o2 o2Var = new o2(new o2.a());
            q1.a aVar = new q1.a();
            q1.a a11 = aVar.a(d() + URLEncoder.encode(m3.f46593i, "UTF-8"));
            a11.f46665b = "GET";
            a11.f46668e = "unicom uaid nisportal api";
            new i1(o2Var, new q1(aVar)).a();
            r2.a("l t s u c!");
        } catch (Throwable unused) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @SuppressLint({"NewApi"})
    public class a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a, reason: collision with root package name */
        public ConnectivityManager f46508a;

        /* renamed from: c, reason: collision with root package name */
        public TimerTask f46510c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicBoolean f46511d = new AtomicBoolean(false);

        /* renamed from: b, reason: collision with root package name */
        public Timer f46509b = new Timer();

        public a(ConnectivityManager connectivityManager) {
            this.f46508a = connectivityManager;
            C0534a c0534a = new C0534a(this, f1.this);
            this.f46510c = c0534a;
            this.f46509b.schedule(c0534a, 7000L);
        }

        public final void a(Network network) throws Exception {
            StringBuilder a11 = f3.a(f1.this.d());
            a11.append(URLEncoder.encode(m3.f46593i, "UTF-8"));
            HttpURLConnection httpURLConnection = (HttpURLConnection) network.openConnection(new URL(a11.toString()));
            httpURLConnection.setConnectTimeout(7000);
            httpURLConnection.setReadTimeout(7000);
            httpURLConnection.connect();
            u1 a12 = u1.a(x0.b("text/json; charset=utf-8"), httpURLConnection.getContentLength(), httpURLConnection.getResponseCode() == 200 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream());
            StringBuilder a13 = f3.a("cmd 8 suc!");
            a13.append(a12.b());
            r2.a(a13.toString());
            httpURLConnection.disconnect();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            super.onAvailable(network);
            try {
                if (this.f46511d.getAndSet(true)) {
                    return;
                }
                this.f46510c.cancel();
                this.f46509b.cancel();
                String b11 = w3.b(m3.f46585a);
                if ("中国联通".equals(b11)) {
                    a(network);
                } else if (!"中国移动".equals(b11)) {
                    "中国电信".equals(b11);
                }
                this.f46508a.unregisterNetworkCallback(this);
            } catch (Throwable unused) {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.zx.a.I8b7.f1$a$a, reason: collision with other inner class name */
        public class C0534a extends TimerTask {
            public C0534a(a aVar, f1 f1Var) {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
            }
        }
    }

    public final String a(String str) {
        String str2 = m3.a(m3.f46592h) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + ((System.currentTimeMillis() / 1000) / 86400);
        SecureRandom secureRandom = p.f46646a;
        try {
            return str + "/api?appid=" + this.f46507a[1] + "&request_id=" + p.a("SHA256", str2.getBytes(StandardCharsets.UTF_8)).substring(0, 16);
        } catch (NoSuchAlgorithmException e11) {
            throw new RuntimeException("sha256String fail", e11);
        }
    }
}
