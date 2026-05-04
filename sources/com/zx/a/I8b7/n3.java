package com.zx.a.I8b7;

import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.Network;
import android.text.TextUtils;
import android.util.Base64;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.xiaomi.mipush.sdk.Constants;
import com.zx.module.annotation.Java2C;
import com.zx.module.base.Callback;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class n3 {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f46616a = f();

    /* renamed from: b, reason: collision with root package name */
    public final String[] f46617b = d();

    /* renamed from: c, reason: collision with root package name */
    public final String[] f46618c = c();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @SuppressLint({"NewApi"})
    public class a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a, reason: collision with root package name */
        public ConnectivityManager f46619a;

        /* renamed from: b, reason: collision with root package name */
        public Callback f46620b;

        /* renamed from: d, reason: collision with root package name */
        public TimerTask f46622d;

        /* renamed from: e, reason: collision with root package name */
        public JSONObject f46623e;

        /* renamed from: f, reason: collision with root package name */
        public int f46624f;

        /* renamed from: g, reason: collision with root package name */
        public final AtomicBoolean f46625g = new AtomicBoolean(false);

        /* renamed from: c, reason: collision with root package name */
        public Timer f46621c = new Timer();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.zx.a.I8b7.n3$a$a, reason: collision with other inner class name */
        public class C0537a extends TimerTask {
            public C0537a(n3 n3Var) {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                try {
                    a aVar = a.this;
                    Callback callback = aVar.f46620b;
                    if (callback != null) {
                        callback.callback(n3.this.a("wifi 情况下切换数据网络超时, 检查是否打开数据网络!", 1));
                    }
                } catch (JSONException e11) {
                    r2.a(e11);
                }
            }
        }

        public a(JSONObject jSONObject, ConnectivityManager connectivityManager, Callback callback, int i11) {
            this.f46623e = jSONObject;
            this.f46624f = i11;
            this.f46619a = connectivityManager;
            this.f46620b = callback;
            C0537a c0537a = new C0537a(n3.this);
            this.f46622d = c0537a;
            this.f46621c.schedule(c0537a, 7000L);
        }

        @Java2C.Method2C
        private native void a(Network network, String str);

        public final void a(Network network) throws Throwable {
            HttpURLConnection httpURLConnection = (HttpURLConnection) network.openConnection(new URL(n3.this.f46617b[0]));
            httpURLConnection.setConnectTimeout(7000);
            httpURLConnection.setReadTimeout(7000);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.connect();
            JSONObject a11 = n3.this.a();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8"));
            bufferedWriter.write(a11.toString());
            bufferedWriter.close();
            JSONObject jSONObject = new JSONObject(u1.a(x0.b("text/json; charset=utf-8"), httpURLConnection.getContentLength(), httpURLConnection.getResponseCode() == 200 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream()).b()).getJSONObject(TtmlNode.TAG_BODY);
            String string = jSONObject.getString("resultCode");
            String string2 = jSONObject.getString("resultDesc");
            httpURLConnection.disconnect();
            if ("103000".equals(string) && "成功".equals(string2)) {
                n3.this.a(this.f46623e, this.f46620b, this.f46624f, "cmcc", jSONObject.getString("token"), null);
            } else {
                this.f46620b.callback(n3.this.b(jSONObject.toString()));
            }
        }

        public final void b(Network network) throws Throwable {
            HttpURLConnection httpURLConnection = (HttpURLConnection) network.openConnection(new URL(n3.this.f46618c[0]));
            httpURLConnection.setConnectTimeout(7000);
            httpURLConnection.setReadTimeout(7000);
            httpURLConnection.setRequestProperty("Content-type", "application/x-www-form-urlencoded; charset=UTF-8");
            httpURLConnection.setRequestProperty("Charset", "UTF-8");
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.connect();
            String substring = UUID.randomUUID().toString().replaceAll(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "").substring(0, 16);
            String a11 = n3.this.a(substring);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8"));
            bufferedWriter.write(a11);
            bufferedWriter.close();
            JSONObject jSONObject = new JSONObject(u1.a(x0.b(""), httpURLConnection.getContentLength(), httpURLConnection.getResponseCode() == 200 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream()).b());
            httpURLConnection.disconnect();
            String string = jSONObject.getString("msg");
            int i11 = jSONObject.getInt("result");
            String optString = jSONObject.optString("data");
            if (i11 == 0 && "success".equals(string) && !TextUtils.isEmpty(optString)) {
                n3.this.a(this.f46623e, this.f46620b, this.f46624f, "ct", n3.this.a(substring, optString), null);
            } else {
                this.f46620b.callback(n3.this.b(jSONObject.toString()));
            }
        }

        public final void c(Network network) throws Throwable {
            n3 n3Var = n3.this;
            String c11 = n3Var.c(n3Var.f46616a[0]);
            r2.a("unicomUAIDNisportalUrl: " + c11);
            HttpURLConnection httpURLConnection = (HttpURLConnection) network.openConnection(new URL(c11));
            httpURLConnection.setConnectTimeout(7000);
            httpURLConnection.setReadTimeout(7000);
            httpURLConnection.connect();
            JSONObject jSONObject = new JSONObject(u1.a(x0.b("text/json; charset=utf-8"), httpURLConnection.getContentLength(), httpURLConnection.getResponseCode() == 200 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream()).b());
            String optString = jSONObject.optString("authurl");
            if (TextUtils.isEmpty(optString)) {
                this.f46620b.callback(n3.this.b(jSONObject.toString()));
                return;
            }
            String c12 = n3.this.c(optString);
            r2.a("unicomUAIDAuthUrl: " + c12);
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) network.openConnection(new URL(c12));
            httpURLConnection2.setConnectTimeout(7000);
            httpURLConnection2.setReadTimeout(7000);
            httpURLConnection2.connect();
            JSONObject jSONObject2 = new JSONObject(u1.a(x0.b("text/json; charset=utf-8"), httpURLConnection2.getContentLength(), httpURLConnection2.getResponseCode() == 200 ? httpURLConnection2.getInputStream() : httpURLConnection2.getErrorStream()).b());
            String optString2 = jSONObject2.optString("code");
            if (TextUtils.isEmpty(optString2)) {
                this.f46620b.callback(n3.this.b(jSONObject2.toString()));
                return;
            }
            r2.a("unicomUAID code: " + optString2);
            a(network, optString2);
            httpURLConnection.disconnect();
            httpURLConnection2.disconnect();
            n3.this.a(this.f46623e, this.f46620b, this.f46624f, "unicom", optString2, jSONObject2.optString("province", null));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            super.onAvailable(network);
            try {
                if (this.f46625g.getAndSet(true)) {
                    return;
                }
                r2.a("zx 网络切换: 使用移动网络访问");
                this.f46622d.cancel();
                this.f46621c.cancel();
                String b11 = w3.b(m3.f46585a);
                if ("中国联通".equals(b11)) {
                    c(network);
                } else if ("中国移动".equals(b11)) {
                    a(network);
                } else if ("中国电信".equals(b11)) {
                    b(network);
                } else {
                    this.f46620b.callback(n3.this.a("暂不支持该运营商", 1));
                }
                this.f46619a.unregisterNetworkCallback(this);
            } catch (Throwable th2) {
                r2.a(th2);
                Callback callback = this.f46620b;
                if (callback != null) {
                    try {
                        callback.callback(n3.this.a(th2.getMessage(), 1));
                        this.f46619a.unregisterNetworkCallback(this);
                    } catch (JSONException e11) {
                        r2.a(e11);
                    }
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final n3 f46628a = new n3();
    }

    @Java2C.Method2C
    private native String a(Callback callback) throws Exception;

    /* JADX INFO: Access modifiers changed from: private */
    @Java2C.Method2C
    public native String a(String str) throws Exception;

    /* JADX INFO: Access modifiers changed from: private */
    @Java2C.Method2C
    public native String a(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException, JSONException;

    /* JADX INFO: Access modifiers changed from: private */
    @Java2C.Method2C
    public native JSONObject a() throws JSONException;

    @Java2C.Method2C
    private native void a(JSONObject jSONObject, Callback callback, int i11) throws Throwable;

    @Java2C.Method2C
    private native String b(Callback callback) throws Exception;

    @Java2C.Method2C
    private final native String[] b();

    /* JADX INFO: Access modifiers changed from: private */
    @Java2C.Method2C
    public native String c(String str);

    @Java2C.Method2C
    private native JSONObject c(Callback callback) throws Throwable;

    @Java2C.Method2C
    private final native String[] c();

    @Java2C.Method2C
    private final native String[] d();

    @Java2C.Method2C
    private native String e();

    @Java2C.Method2C
    private final native String[] f();

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        if ((r3.isWifiEnabled() && (r4 == null ? 0 : r4.getIpAddress()) != 0) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(org.json.JSONObject r10, com.zx.module.base.Callback r11, int r12) throws java.lang.Throwable {
        /*
            r9 = this;
            android.content.Context r0 = com.zx.a.I8b7.m3.f46585a
            java.lang.String r1 = "android.permission.ACCESS_WIFI_STATE"
            r2 = 0
            boolean r0 = com.zx.a.I8b7.w3.a(r0, r1, r2)
            android.content.Context r1 = com.zx.a.I8b7.m3.f46585a
            java.lang.String r3 = "android.permission.CHANGE_NETWORK_STATE"
            boolean r1 = com.zx.a.I8b7.w3.a(r1, r3, r2)
            if (r0 == 0) goto Lb2
            if (r1 == 0) goto Lb2
            android.content.Context r0 = com.zx.a.I8b7.m3.f46585a
            java.lang.String r1 = "getUAID:forceSendRequestByMobileData with cb"
            com.zx.a.I8b7.r2.a(r1)
            r1 = 1
            java.lang.String r3 = "phone"
            java.lang.Object r3 = r0.getSystemService(r3)     // Catch: java.lang.Exception -> L3b
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3     // Catch: java.lang.Exception -> L3b
            java.lang.Class r4 = r3.getClass()     // Catch: java.lang.Exception -> L3b
            java.lang.String r5 = "getDataEnabled"
            r6 = 0
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r5, r6)     // Catch: java.lang.Exception -> L3b
            java.lang.Object r3 = r4.invoke(r3, r6)     // Catch: java.lang.Exception -> L3b
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Exception -> L3b
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Exception -> L3b
            goto L3c
        L3b:
            r3 = r1
        L3c:
            if (r3 == 0) goto La3
            java.lang.String r3 = "wifi"
            java.lang.Object r4 = r0.getSystemService(r3)
            android.net.wifi.WifiManager r4 = (android.net.wifi.WifiManager) r4
            boolean r4 = r4.isWifiEnabled()
            if (r4 == 0) goto L6c
            java.lang.Object r3 = r0.getSystemService(r3)
            android.net.wifi.WifiManager r3 = (android.net.wifi.WifiManager) r3
            android.net.wifi.WifiInfo r4 = r3.getConnectionInfo()
            if (r4 != 0) goto L5a
            r4 = r2
            goto L5e
        L5a:
            int r4 = r4.getIpAddress()
        L5e:
            boolean r3 = r3.isWifiEnabled()
            if (r3 == 0) goto L68
            if (r4 == 0) goto L68
            r3 = r1
            goto L69
        L68:
            r3 = r2
        L69:
            if (r3 == 0) goto L6c
            goto L6d
        L6c:
            r1 = r2
        L6d:
            if (r1 == 0) goto L96
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)
            r6 = r0
            android.net.ConnectivityManager r6 = (android.net.ConnectivityManager) r6
            android.net.NetworkRequest$Builder r0 = new android.net.NetworkRequest$Builder
            r0.<init>()
            r1 = 12
            r0.addCapability(r1)
            r0.addTransportType(r2)
            android.net.NetworkRequest r0 = r0.build()
            com.zx.a.I8b7.n3$a r3 = new com.zx.a.I8b7.n3$a
            r4 = r9
            r5 = r10
            r7 = r11
            r8 = r12
            r3.<init>(r5, r6, r7, r8)
            r6.requestNetwork(r0, r3)
            goto Lb1
        L96:
            r4 = r9
            r5 = r10
            r7 = r11
            r8 = r12
            java.lang.String r10 = "zx 网络切换: 直接可以使用移动网络访问"
            com.zx.a.I8b7.r2.a(r10)
            r9.a(r5, r7, r8)
            goto Lb1
        La3:
            r4 = r9
            r7 = r11
            java.lang.String r10 = "zx 网络切换: 移动网络不可用，提示请打开移动网络"
            com.zx.a.I8b7.r2.a(r10)
            java.lang.String r10 = r9.a(r10, r1)
            r7.callback(r10)
        Lb1:
            return
        Lb2:
            r4 = r9
            r5 = r10
            r7 = r11
            r8 = r12
            java.lang.String r10 = "开始执行getUAID333"
            com.zx.a.I8b7.r2.a(r10)
            r9.a(r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zx.a.I8b7.n3.b(org.json.JSONObject, com.zx.module.base.Callback, int):void");
    }

    public final void a(JSONObject jSONObject, Callback callback, int i11, String str, String str2, String str3) throws Throwable {
        String str4;
        byte[] doFinal;
        if (i11 == 0) {
            try {
                callback.callback(a(w1.b(jSONObject, str, str2, str3), 0));
                return;
            } catch (Throwable th2) {
                String message = th2.getMessage();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("msg", message);
                jSONObject2.put("code", 10011);
                callback.callback(jSONObject2.toString());
                return;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("code", str2);
            jSONObject3.put("type", str);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("data", jSONObject3);
            jSONObject4.put("code", 0);
            callback.callback(jSONObject4.toString());
            return;
        }
        String string = jSONObject.getString("callerId");
        JSONObject jSONObject5 = new JSONObject();
        String str5 = string + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + m3.f46591g + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + m3.a(m3.f46592h) + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str2;
        String str6 = b()[0];
        SecureRandom secureRandom = p.f46646a;
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str6, 0))));
            byte[] bytes = str5.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int i14 = length - i12;
                if (i14 <= 0) {
                    break;
                }
                if (i14 > 117) {
                    doFinal = cipher.doFinal(bytes, i12, 117);
                } else {
                    doFinal = cipher.doFinal(bytes, i12, i14);
                }
                byteArrayOutputStream.write(doFinal, 0, doFinal.length);
                i13++;
                i12 = i13 * 117;
            }
            str4 = new String(Base64.encode(byteArrayOutputStream.toByteArray(), 2), StandardCharsets.UTF_8);
            try {
                byteArrayOutputStream.close();
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            str4 = "";
        }
        jSONObject5.put("data", str4);
        jSONObject5.put("code", 0);
        callback.callback(jSONObject5.toString());
    }

    public final String b(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("msg", str);
        jSONObject.put("code", 10010);
        return jSONObject.toString();
    }

    public final String a(String str, int i11) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("data", str);
        jSONObject.put("code", i11);
        return jSONObject.toString();
    }
}
