package com.zx.a.I8b7;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.igexin.sdk.PushConsts;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.xiaomi.mipush.sdk.Constants;
import com.zx.a.I8b7.e1;
import com.zx.a.I8b7.l2;
import com.zx.module.annotation.Java2C;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Locale;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static o2 f46543a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f46544b;

    static {
        g();
        f46544b = h();
    }

    public static void a(HttpURLConnection httpURLConnection) throws CertificateException, IOException, KeyStoreException, NoSuchAlgorithmException, KeyManagementException {
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setConnectTimeout(7000);
        httpURLConnection.setReadTimeout(7000);
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            httpsURLConnection.setSSLSocketFactory(c());
            httpsURLConnection.setHostnameVerifier(n2.f46614a);
        }
    }

    public static HashMap<String, String> b(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("UDID-LID", m3.a(m3.f46592h));
        String str2 = m3.f46593i;
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("UDID-ZID", str2);
        try {
            String jSONObject = a().toString();
            Charset charset = StandardCharsets.UTF_8;
            String str3 = new String(Base64.encode(jSONObject.getBytes(charset), 2), charset);
            r2.a("ZXID 请求 header 中的 appInfo: " + str3);
            hashMap.put("UDID-APP-INFO", str3);
            String str4 = new String(Base64.encode(e().toString().getBytes(charset), 2), charset);
            r2.a("ZXID 请求 header 中的 sdkInfoBase: " + str4);
            hashMap.put("UDID-SDK-INFO-BASE", str4);
        } catch (Exception e11) {
            StringBuilder a11 = f3.a("ZXID 请求 header 创建异常: ");
            a11.append(e11.getMessage());
            r2.b(a11.toString());
        }
        hashMap.put("UDID-PROTOCOL", "v3.0.0");
        hashMap.put("UDID-KEY", str);
        return hashMap;
    }

    public static SSLSocketFactory c() throws CertificateException, IOException, KeyStoreException, NoSuchAlgorithmException, KeyManagementException {
        X509Certificate f11 = f();
        if (f11 == null) {
            throw new CertificateException("getCurEnvCA is null");
        }
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(null, null);
        keyStore.setCertificateEntry(com.igexin.push.core.b.f37706ac, f11);
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        if (Build.VERSION.SDK_INT <= 26) {
            sSLContext.init(null, new TrustManager[]{new h0()}, null);
        } else {
            sSLContext.init(null, trustManagerFactory.getTrustManagers(), null);
        }
        return sSLContext.getSocketFactory();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static JSONObject d() {
        int i11;
        JSONObject e11 = e();
        try {
            u3 u3Var = l2.a.f46573a.f46572a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(nt.a.f75376c, w3.i() ? 1 : 0);
            jSONObject.put("permission", u3Var.h());
            jSONObject.put(k3.u0.f65628b, u3Var.f());
            jSONObject.put("showPermissionDialog", u3Var.e());
            e11.put("userSettings", jSONObject);
            e1 e1Var = e1.a.f46499a;
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("pts", e1Var.f46496a);
                jSONObject2.put(PushConsts.KEY_SERVICE_PIT, e1Var.f46497b);
                jSONObject2.put("rc", e1Var.f46498c);
            } catch (Exception e12) {
                r2.a(e12);
            }
            e11.put("processInfo", jSONObject2);
            try {
                i11 = x1.b(m3.f46585a).getBoolean("ZX_IS_PRIVACY");
            } catch (PackageManager.NameNotFoundException e13) {
                r2.a(e13);
                i11 = 0;
            }
            e11.put("privacy", i11);
            e11.put("appIds", x1.a());
        } catch (JSONException e14) {
            StringBuilder a11 = f3.a("ZXID 构建SDKInfo异常:");
            a11.append(e14.getMessage());
            r2.b(a11.toString());
        }
        return e11;
    }

    public static JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", m3.f46586b);
            jSONObject.put("configVersion", m3.f46599o);
            if (TextUtils.equals("core-d", m3.f46587c)) {
                jSONObject.put("versiond", m3.f46588d);
            }
            jSONObject.put(RemoteMessageConst.Notification.CHANNEL_ID, m3.f46589e);
            jSONObject.put("arch", Build.CPU_ABI);
            return jSONObject;
        } catch (JSONException e11) {
            StringBuilder a11 = f3.a("ZXID 构建SDKInfoBase异常:");
            a11.append(e11.getMessage());
            r2.b(a11.toString());
            return jSONObject;
        }
    }

    public static X509Certificate f() throws CertificateException {
        return (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(a(f46544b[0]).getBytes()));
    }

    @Java2C.Method2C
    private static native String[] g();

    @Java2C.Method2C
    private static native String[] h();

    public static String a(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        a(stringBuffer);
        stringBuffer.append("BE");
        stringBuffer.append("GIN ");
        stringBuffer.append("CE");
        stringBuffer.append("RT");
        stringBuffer.append("IFIC");
        stringBuffer.append("ATE");
        a(stringBuffer);
        stringBuffer.append("\n");
        StringBuilder sb2 = new StringBuilder();
        try {
            Charset charset = StandardCharsets.UTF_8;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(str.getBytes(charset)), charset));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                if (!readLine.trim().equals("")) {
                    sb2.append(readLine.substring(0, readLine.length() - 5));
                }
            }
        } catch (Exception e11) {
            r2.a(e11);
        }
        stringBuffer.append(sb2.toString());
        stringBuffer.append("\n");
        a(stringBuffer);
        stringBuffer.append("EN");
        stringBuffer.append("D ");
        stringBuffer.append("CE");
        stringBuffer.append("RTI");
        stringBuffer.append("FIC");
        stringBuffer.append("ATE");
        a(stringBuffer);
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    public static JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("os", "Android");
            jSONObject.put("applicationId", m3.f46591g);
            PackageManager packageManager = w3.f46733a;
            jSONObject.put(HwPayConstant.KEY_COUNTRY, Locale.getDefault().getCountry());
            jSONObject.put(IjkMediaMeta.IJKM_KEY_LANGUAGE, Locale.getDefault().getLanguage());
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("arch", w3.c());
            jSONObject.put("androidVersion", w3.a("59"));
            return jSONObject;
        } catch (JSONException e11) {
            StringBuilder a11 = f3.a("ZXID 构建deviceInfo异常:");
            a11.append(e11.getMessage());
            r2.b(a11.toString());
            return jSONObject;
        }
    }

    public static void a(StringBuffer stringBuffer) {
        for (int i11 = 0; i11 < 5; i11++) {
            stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        }
    }

    public static JSONObject a() throws JSONException {
        String str;
        Exception e11;
        Signature[] a11;
        MessageDigest messageDigest;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appPkg", m3.f46591g);
        String str2 = "error!";
        try {
            a11 = d.a(m3.f46591g);
        } catch (Exception e12) {
            str = "error!";
            e11 = e12;
        }
        if (a11 != null) {
            str = "error!";
            for (Signature signature : a11) {
                try {
                    byte[] byteArray = signature.toByteArray();
                    try {
                        messageDigest = MessageDigest.getInstance("MD5");
                    } catch (NoSuchAlgorithmException e13) {
                        r2.a(e13);
                    }
                    if (messageDigest != null) {
                        byte[] digest = messageDigest.digest(byteArray);
                        StringBuilder sb2 = new StringBuilder();
                        for (byte b11 : digest) {
                            sb2.append(Integer.toHexString((b11 & 255) | 256).substring(1, 3));
                        }
                        str = sb2.toString();
                    }
                    str = "error!";
                } catch (Exception e14) {
                    e11 = e14;
                    r2.a(e11);
                    str2 = str;
                    jSONObject.put("appSign", str2);
                    jSONObject.put("appId", m3.f46590f);
                    return jSONObject;
                }
            }
            str2 = str;
            jSONObject.put("appSign", str2);
            jSONObject.put("appId", m3.f46590f);
            return jSONObject;
        }
        jSONObject.put("appSign", str2);
        jSONObject.put("appId", m3.f46590f);
        return jSONObject;
    }
}
