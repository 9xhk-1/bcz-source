package com.zx.a.I8b7;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Base64;
import com.baicizhan.client.business.dataset.provider.a;
import com.zx.a.I8b7.l2;
import com.zx.a.I8b7.q1;
import com.zx.module.annotation.Java2C;
import da0.k1;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.HashMap;
import javax.crypto.SecretKey;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static SecretKey f46502a;

    /* renamed from: b, reason: collision with root package name */
    public static byte[] f46503b;

    /* renamed from: c, reason: collision with root package name */
    public static final SecureRandom f46504c = new SecureRandom();

    @Java2C.Method2C
    public static native synchronized String a();

    public static void b() throws Exception {
        String str;
        q1.a aVar = new q1.a();
        HashMap<String, String> b11 = i0.b(a());
        aVar.f46666c.clear();
        aVar.f46666c.putAll(b11);
        q1.a a11 = aVar.a("https://zxid-m.mobileservice.cn/sdk/module/getCoreModule");
        a11.f46665b = "POST";
        x0 b12 = x0.b("application/json; charset=utf-8");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("lid", m3.a(m3.f46592h));
        jSONObject2.put("zid", m3.f46593i);
        jSONObject.put("ctx", jSONObject2);
        jSONObject.put(com.alipay.sdk.m.x.d.D, i0.d());
        jSONObject.put("deviceInfo", i0.b());
        a11.f46667d = s1.a(b12, new String(Base64.encode(p.a(jSONObject.toString(), f46502a, "UDID_ENC_AUTHTAG"), 2), StandardCharsets.UTF_8));
        a11.f46668e = "request getCoreModule api";
        o2 o2Var = i0.f46543a;
        q1 q1Var = new q1(aVar);
        o2Var.getClass();
        t1 a12 = new i1(o2Var, q1Var).a();
        if (a12.f46691b != 200) {
            throw new RuntimeException("response errCode: " + a12.a("Udid-Error-Code") + ", errMsg: " + a12.a("Udid-Error-Message"));
        }
        JSONObject jSONObject3 = new JSONObject(p.a(Base64.decode(new JSONObject(a12.f46694e.b()).getString("data"), 2), f46502a, "UDID_ENC_AUTHTAG"));
        if (!jSONObject3.getBoolean(k3.u0.f65628b)) {
            u3 u3Var = l2.a.f46573a.f46572a;
            if (u3Var.f46715b == null) {
                u3Var.f46715b = u3Var.d();
            }
            try {
                SQLiteDatabase sQLiteDatabase = u3Var.f46715b;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("key in(");
                sb2.append("17,18");
                sb2.append(pn.j.f81007d);
                sQLiteDatabase.delete("zx_table", sb2.toString(), null);
                m3.F = null;
                r2.a("clearCoreModule success");
            } catch (Exception e11) {
                StringBuilder a13 = f3.a("clearCoreModule error:");
                a13.append(e11.getMessage());
                r2.b(a13.toString());
            }
            r2.a("coreModule enable is false");
            return;
        }
        JSONObject jSONObject4 = jSONObject3.getJSONObject(k1.a.f47555a);
        jSONObject4.getString("version");
        String string = jSONObject4.getString("checksum");
        byte[] decode = Base64.decode(jSONObject4.getString("data"), 0);
        if (!TextUtils.equals(string, p.a("SHA256", decode))) {
            throw new IOException("zx checksum1 exception");
        }
        r2.a("verify checksum finished");
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("mainVersion", m3.f46586b);
        jSONObject5.put("coreVersion", m3.f46588d);
        jSONObject5.put("checksum", string);
        l2.a.f46573a.f46572a.getClass();
        String string2 = jSONObject5.getString("coreVersion");
        try {
            str = m3.F.getString("coreVersion");
        } catch (Exception unused) {
            str = "";
        }
        if (!TextUtils.isEmpty(string2) && !TextUtils.equals(string2, str)) {
            u3 u3Var2 = l2.a.f46573a.f46572a;
            if (u3Var2.f46715b == null) {
                u3Var2.f46715b = u3Var2.d();
            }
            try {
                String str2 = new String(Base64.encode(p.b("AES/CBC/PKCS5Padding", m3.f46606v, m3.f46607w, decode), 0), StandardCharsets.UTF_8);
                ContentValues contentValues = new ContentValues();
                contentValues.put(a.d.C0245a.f16161a, (Integer) 17);
                contentValues.put("value", str2);
                r2.a("replace resultId = " + u3Var2.f46715b.replace("zx_table", null, contentValues));
            } catch (Exception e12) {
                r2.b("ZXID updateDBValue valueID:17,value:" + decode + ",error:" + e12.toString());
            }
            l2.a.f46573a.f46572a.a(18, jSONObject5.toString(), true);
            m3.F = jSONObject5;
        }
        r2.a("decrypt and checksum finished");
    }
}
