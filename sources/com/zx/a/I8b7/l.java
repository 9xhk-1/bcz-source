package com.zx.a.I8b7;

import android.text.TextUtils;
import android.util.Base64;
import com.zx.a.I8b7.l2;
import com.zx.a.I8b7.q1;
import com.zx.module.annotation.Java2C;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.HashMap;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static SecretKey f46569a;

    /* renamed from: b, reason: collision with root package name */
    public static byte[] f46570b;

    /* renamed from: c, reason: collision with root package name */
    public static final SecureRandom f46571c = new SecureRandom();

    @Java2C.Method2C
    public static native synchronized String a();

    @Java2C.Method2C
    private static native String b() throws Exception;

    public static void c() throws Exception {
        q1.a aVar = new q1.a();
        HashMap<String, String> b11 = i0.b(a());
        aVar.f46666c.clear();
        aVar.f46666c.putAll(b11);
        q1.a a11 = aVar.a("https://zxid-m.mobileservice.cn/sdk/config/init");
        a11.f46665b = "POST";
        a11.f46667d = s1.a(x0.b("application/json; charset=utf-8"), b());
        a11.f46668e = "request config api";
        o2 o2Var = i0.f46543a;
        q1 q1Var = new q1(aVar);
        o2Var.getClass();
        t1 a12 = new i1(o2Var, q1Var).a();
        if (a12.f46691b != 200) {
            throw new RuntimeException("response errCode: " + a12.a("Udid-Error-Code") + ", errMsg: " + a12.a("Udid-Error-Message"));
        }
        JSONObject jSONObject = new JSONObject(p.a(Base64.decode(new JSONObject(a12.f46694e.b()).getString("data"), 2), f46569a, "UDID_ENC_AUTHTAG"));
        String string = jSONObject.getString("configVersion");
        l2 l2Var = l2.a.f46573a;
        l2Var.f46572a.getClass();
        if (!TextUtils.equals(string, m3.f46599o)) {
            m3.f46599o = string;
            l2Var.f46572a.a(4, string, false);
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("fieldConfig");
        u3 u3Var = l2Var.f46572a;
        String jSONObject3 = jSONObject2.toString();
        u3Var.getClass();
        if (!TextUtils.equals(jSONObject3, m3.f46608x)) {
            m3.f46608x = jSONObject3;
            l2Var.f46572a.a(11, jSONObject3, true);
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("reportConfig");
        u3 u3Var2 = l2Var.f46572a;
        String jSONObject5 = jSONObject4.toString();
        u3Var2.getClass();
        if (!TextUtils.equals(jSONObject5, m3.f46609y)) {
            m3.f46609y = jSONObject5;
            l2Var.f46572a.a(12, jSONObject5, true);
        }
        JSONObject jSONObject6 = jSONObject.getJSONObject("cryptoConfig");
        u3 u3Var3 = l2Var.f46572a;
        String jSONObject7 = jSONObject6.toString();
        u3Var3.getClass();
        if (!TextUtils.equals(jSONObject7, m3.f46610z)) {
            m3.f46610z = jSONObject7;
            l2Var.f46572a.a(15, jSONObject7, true);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("appConfig");
        if (optJSONObject != null) {
            r2.a("处理 appConfig ");
            try {
                JSONArray jSONArray = optJSONObject.getJSONArray("list");
                if (jSONArray == null || jSONArray.length() <= 0) {
                    r2.b("appConfig list is empty");
                } else {
                    int length = jSONArray.length();
                    int i11 = optJSONObject.getInt("type");
                    if (i11 == 1) {
                        for (int i12 = 0; i12 < length; i12++) {
                            jSONArray.put(i12, p.a(Base64.decode(jSONArray.getString(i12), 2), f46569a, "UDID_ENC_AUTHTAG"));
                        }
                    } else if (i11 == 3) {
                        SecretKey a13 = p.a(f46570b, m3.a(m3.f46592h));
                        for (int i13 = 0; i13 < length; i13++) {
                            byte[] decode = Base64.decode(jSONArray.getString(i13), 2);
                            Charset charset = StandardCharsets.UTF_8;
                            jSONArray.put(i13, new String(p.a(rr.a.f84533c, a13, new IvParameterSpec("UDID_ENC_AUTHTAG".getBytes(charset)), decode), charset));
                        }
                    }
                    l2 l2Var2 = l2.a.f46573a;
                    u3 u3Var4 = l2Var2.f46572a;
                    String jSONObject8 = optJSONObject.toString();
                    u3Var4.getClass();
                    if (!TextUtils.equals(jSONObject8, m3.A)) {
                        m3.A = jSONObject8;
                        l2Var2.f46572a.a(21, jSONObject8, true);
                    }
                }
            } catch (Exception e11) {
                r2.a(e11);
            }
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("commonConfig");
        if (optJSONObject2 != null) {
            l2 l2Var3 = l2.a.f46573a;
            u3 u3Var5 = l2Var3.f46572a;
            String jSONObject9 = optJSONObject2.toString();
            u3Var5.getClass();
            if (!TextUtils.equals(jSONObject9, m3.B)) {
                m3.B = jSONObject9;
                l2Var3.f46572a.a(22, jSONObject9, true);
            }
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("invokeConfig");
        if (optJSONObject3 != null) {
            l2 l2Var4 = l2.a.f46573a;
            u3 u3Var6 = l2Var4.f46572a;
            String jSONObject10 = optJSONObject3.toString();
            synchronized (u3Var6) {
                if (!TextUtils.equals(jSONObject10, m3.C)) {
                    m3.C = jSONObject10;
                    m3.c();
                    l2Var4.f46572a.a(19, m3.C, true);
                }
            }
        }
        if (m3.f46600p) {
            return;
        }
        l2 l2Var5 = l2.a.f46573a;
        l2Var5.f46572a.getClass();
        if (true != m3.f46600p) {
            m3.f46600p = true;
            l2Var5.f46572a.a(6, m3.f46600p + "", false);
        }
    }
}
