package com.zx.a.I8b7;

import android.util.Base64;
import com.zx.module.annotation.Java2C;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import javax.crypto.SecretKey;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static SecretKey f46564a;

    /* renamed from: b, reason: collision with root package name */
    public static byte[] f46565b;

    /* renamed from: c, reason: collision with root package name */
    public static final SecureRandom f46566c = new SecureRandom();

    @Java2C.Method2C
    public static native synchronized String a();

    @Java2C.Method2C
    public static native void a(String str);

    public static String b(String str) throws Exception {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("lid", m3.a(m3.f46592h));
        jSONObject2.put("zid", m3.f46593i);
        jSONObject.put("ctx", jSONObject2);
        jSONObject.put("code", str);
        return new String(Base64.encode(p.a(jSONObject.toString(), f46564a, "UDID_ENC_AUTHTAG"), 2), StandardCharsets.UTF_8);
    }
}
