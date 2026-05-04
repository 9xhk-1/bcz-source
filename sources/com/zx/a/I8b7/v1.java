package com.zx.a.I8b7;

import com.zx.a.I8b7.q1;
import com.zx.module.annotation.Java2C;
import java.security.SecureRandom;
import java.util.HashMap;
import javax.crypto.SecretKey;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class v1 {

    /* renamed from: a, reason: collision with root package name */
    public static SecretKey f46718a;

    /* renamed from: b, reason: collision with root package name */
    public static byte[] f46719b;

    /* renamed from: c, reason: collision with root package name */
    public static final SecureRandom f46720c = new SecureRandom();

    @Java2C.Method2C
    public static native synchronized String a();

    @Java2C.Method2C
    private static native String a(String str, String str2) throws Exception;

    public static void b(String str, String str2) throws Exception {
        q1.a aVar = new q1.a();
        HashMap<String, String> b11 = i0.b(a());
        aVar.f46666c.clear();
        aVar.f46666c.putAll(b11);
        q1.a a11 = aVar.a("https://zxid-m.mobileservice.cn/sdk/uaid/reportAuthToken");
        a11.f46665b = "POST";
        a11.f46667d = s1.a(x0.b("application/json; charset=utf-8"), a(str, str2));
        a11.f46668e = "SAIDCodeRequest get api";
        o2 o2Var = i0.f46543a;
        q1 q1Var = new q1(aVar);
        o2Var.getClass();
        new i1(o2Var, q1Var).a();
    }
}
