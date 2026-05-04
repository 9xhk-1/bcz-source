package com.zx.a.I8b7;

import android.util.Base64;
import com.zx.a.I8b7.m2;
import com.zx.a.I8b7.q1;
import com.zx.module.annotation.Java2C;
import java.security.SecureRandom;
import java.util.HashMap;
import javax.crypto.SecretKey;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static SecretKey f46611a;

    /* renamed from: b, reason: collision with root package name */
    public static byte[] f46612b;

    /* renamed from: c, reason: collision with root package name */
    public static final SecureRandom f46613c = new SecureRandom();

    @Java2C.Method2C
    public static native synchronized String a();

    @Java2C.Method2C
    private static native String b() throws Exception;

    public static void c() throws Throwable {
        q1.a aVar = new q1.a();
        HashMap<String, String> b11 = i0.b(a());
        aVar.f46666c.clear();
        aVar.f46666c.putAll(b11);
        q1.a a11 = aVar.a("https://zxid-m.mobileservice.cn/sdk/config/v2/init");
        a11.f46665b = "POST";
        a11.f46667d = s1.a(x0.b("application/json; charset=utf-8"), b());
        a11.f46668e = "ConfigV2Request get api";
        o2 o2Var = i0.f46543a;
        q1 q1Var = new q1(aVar);
        o2Var.getClass();
        t1 a12 = new i1(o2Var, q1Var).a();
        if (a12.f46691b == 200) {
            m2.c.f46584a.a(new m(p.a(Base64.decode(new JSONObject(a12.f46694e.b()).getString("data"), 2), f46611a, "UDID_ENC_AUTHTAG")));
            return;
        }
        throw new RuntimeException("response errCode: " + a12.a("Udid-Error-Code") + ", errMsg: " + a12.a("Udid-Error-Message"));
    }
}
