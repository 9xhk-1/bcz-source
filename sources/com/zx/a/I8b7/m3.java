package com.zx.a.I8b7;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.xiaomi.mipush.sdk.Constants;
import com.zx.a.I8b7.l2;
import com.zx.a.I8b7.o2;
import com.zx.a.I8b7.r2;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class m3 {
    public static String A = null;
    public static String B = null;
    public static String C = null;
    public static String D = null;
    public static String E = null;

    /* renamed from: a, reason: collision with root package name */
    public static Context f46585a = null;

    /* renamed from: b, reason: collision with root package name */
    public static String f46586b = "";

    /* renamed from: c, reason: collision with root package name */
    public static String f46587c = "";

    /* renamed from: d, reason: collision with root package name */
    public static String f46588d = "";

    /* renamed from: e, reason: collision with root package name */
    public static String f46589e = null;

    /* renamed from: f, reason: collision with root package name */
    public static String f46590f = "";

    /* renamed from: g, reason: collision with root package name */
    public static String f46591g = "";

    /* renamed from: h, reason: collision with root package name */
    public static String f46592h = null;

    /* renamed from: i, reason: collision with root package name */
    public static String f46593i = null;

    /* renamed from: j, reason: collision with root package name */
    public static String f46594j = "{}";

    /* renamed from: p, reason: collision with root package name */
    public static boolean f46600p;

    /* renamed from: v, reason: collision with root package name */
    public static SecretKey f46606v;

    /* renamed from: w, reason: collision with root package name */
    public static IvParameterSpec f46607w;

    /* renamed from: x, reason: collision with root package name */
    public static String f46608x;

    /* renamed from: y, reason: collision with root package name */
    public static String f46609y;

    /* renamed from: z, reason: collision with root package name */
    public static String f46610z;

    /* renamed from: k, reason: collision with root package name */
    public static volatile JSONArray f46595k = new JSONArray();

    /* renamed from: l, reason: collision with root package name */
    public static String f46596l = "{}";

    /* renamed from: m, reason: collision with root package name */
    public static String f46597m = "";

    /* renamed from: n, reason: collision with root package name */
    public static int f46598n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static String f46599o = "ANDROID-V3";

    /* renamed from: q, reason: collision with root package name */
    public static HashMap<String, String> f46601q = new HashMap<>();

    /* renamed from: r, reason: collision with root package name */
    public static int f46602r = 1;

    /* renamed from: s, reason: collision with root package name */
    public static int f46603s = 1;

    /* renamed from: t, reason: collision with root package name */
    public static int f46604t = -1;

    /* renamed from: u, reason: collision with root package name */
    public static long f46605u = 0;
    public static JSONObject F = new JSONObject();
    public static volatile boolean G = false;
    public static final Set<String> H = Collections.newSetFromMap(new ConcurrentHashMap());
    public static final Set<String> I = Collections.newSetFromMap(new ConcurrentHashMap());
    public static Bundle J = null;

    public static void a(Context context) throws Exception {
        Context applicationContext = context.getApplicationContext();
        f46585a = applicationContext;
        f46591g = applicationContext.getPackageName();
        x1.d(f46585a);
        f46590f = x1.a(f46585a);
        StringBuilder a11 = f3.a("initAppId: ");
        a11.append(f46590f);
        r2.a(a11.toString());
        b(f46585a);
        if (TextUtils.isEmpty(f46592h)) {
            b();
        } else {
            String a12 = p.a(w3.b() + Build.MODEL, "SHA256");
            String[] split = f46592h.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            if (split.length < 2) {
                StringBuilder a13 = f3.a("ZXID 检测到老版本LID:");
                a13.append(f46592h);
                r.a(a13.toString());
                f46592h += Constants.ACCEPT_TIME_SEPARATOR_SERVER + a12;
                l2 l2Var = l2.a.f46573a;
                u3 u3Var = l2Var.f46572a;
                String str = f46592h;
                u3Var.getClass();
                if (!TextUtils.equals(str, f46592h)) {
                    f46592h = str;
                    l2Var.f46572a.a(0, str, true);
                }
                StringBuilder a14 = f3.a("ZXID 兼容老版本LID后重新生成LID:");
                a14.append(f46592h);
                r.a(a14.toString());
            } else if (TextUtils.equals(a12, split[1])) {
                r.a("ZXID LID校验通过!");
            } else {
                u3 u3Var2 = l2.a.f46573a.f46572a;
                if (u3Var2.f46715b == null) {
                    u3Var2.f46715b = u3Var2.d();
                }
                try {
                    SQLiteDatabase sQLiteDatabase = u3Var2.f46715b;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("key in(");
                    sb2.append("0,1,3,4,6,11,12,15,21,22,23,321,24,25,26,19,13,14");
                    sb2.append(pn.j.f81007d);
                    sQLiteDatabase.delete("zx_table", sb2.toString(), null);
                    f46592h = "";
                    f46593i = "";
                    f46594j = "";
                    f46596l = "{}";
                    f46598n = 0;
                    f46599o = "ANDROID-V3";
                    f46600p = false;
                    f46608x = "";
                    f46609y = "";
                    f46610z = "";
                    D = "";
                    f46602r = 1;
                    A = "";
                    r2.a("ZXID清理数据成功");
                } catch (Exception e11) {
                    StringBuilder a15 = f3.a("清理本地数据error:");
                    a15.append(e11.getMessage());
                    r2.b(a15.toString());
                }
                b();
                r.a("ZXID LID校验不通过");
            }
        }
        o2 o2Var = i0.f46543a;
        try {
            o2.a aVar = new o2.a();
            aVar.f46640b.add(new s0(r2.a.f46680a.f46679a, 5));
            aVar.f46640b.add(new g0());
            SSLSocketFactory c11 = i0.c();
            if (c11 == null) {
                throw new NullPointerException("sslSocketFactory == null");
            }
            aVar.f46641c = c11;
            i0.f46543a = new o2(aVar);
        } catch (Throwable th2) {
            r2.a(th2);
            th2.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:179:0x036c, code lost:
    
        if (r4 != null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0377, code lost:
    
        com.zx.a.I8b7.m3.G = true;
        r13 = com.zx.a.I8b7.h1.b.f46530a;
        r13.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x038b, code lost:
    
        if (new org.json.JSONObject(com.zx.a.I8b7.m3.f46596l).has("zxc2") == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0374, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0372, code lost:
    
        if (r4 != null) goto L113;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.content.Context r13) {
        /*
            Method dump skipped, instructions count: 1034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zx.a.I8b7.m3.b(android.content.Context):void");
    }

    public static void c() {
        try {
            if (C != null) {
                JSONObject jSONObject = new JSONObject(C);
                JSONArray optJSONArray = jSONObject.optJSONArray("internal");
                JSONArray optJSONArray2 = jSONObject.optJSONArray("external");
                if (optJSONArray != null) {
                    Set<String> set = H;
                    set.clear();
                    for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                        set.add(optJSONArray.getString(i11));
                    }
                }
                if (optJSONArray2 != null) {
                    Set<String> set2 = I;
                    set2.clear();
                    for (int i12 = 0; i12 < optJSONArray2.length(); i12++) {
                        set2.add(optJSONArray2.getString(i12));
                    }
                }
            }
        } catch (JSONException e11) {
            r2.a(e11);
        }
    }

    public static void a(u3 u3Var) {
        if (f46607w == null) {
            IvParameterSpec g11 = u3Var.g();
            f46607w = g11;
            if (g11 == null) {
                byte[] generateSeed = new SecureRandom().generateSeed(16);
                String str = new String(Base64.encode(generateSeed, 0), StandardCharsets.UTF_8);
                u3Var.a(10, str + "", false);
                r2.a("ZXID saveIvParameter ivStr:" + str);
                f46607w = new IvParameterSpec(generateSeed);
            }
        }
        if (f46606v == null) {
            SecretKey i11 = u3Var.i();
            f46606v = i11;
            if (i11 == null) {
                try {
                    SecureRandom secureRandom = p.f46646a;
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
                    keyGenerator.init(128);
                    SecretKey generateKey = keyGenerator.generateKey();
                    f46606v = generateKey;
                    u3Var.a(generateKey.getEncoded());
                } catch (NoSuchAlgorithmException e11) {
                    r2.a(e11);
                    e11.printStackTrace();
                }
            }
        }
    }

    public static void b() {
        String str = UUID.randomUUID().toString().replaceAll(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "") + Constants.ACCEPT_TIME_SEPARATOR_SERVER + p.a(w3.b() + Build.MODEL, "SHA256");
        l2 l2Var = l2.a.f46573a;
        l2Var.f46572a.getClass();
        if (!TextUtils.equals(str, f46592h)) {
            f46592h = str;
            l2Var.f46572a.a(0, str, true);
        }
        r.a("ZXID 生成LID:" + str);
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        return split.length == 2 ? split[0] : str;
    }

    public static String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("zid", f46593i);
            jSONObject.put("ext", f46594j);
        } catch (JSONException e11) {
            r2.a(e11);
        }
        return jSONObject.toString();
    }
}
