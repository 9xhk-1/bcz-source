package com.zx.a.I8b7;

import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.zx.module.annotation.Java2C;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import javax.crypto.SecretKey;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class p1 {

    /* renamed from: a, reason: collision with root package name */
    public static String f46647a = "";

    /* renamed from: c, reason: collision with root package name */
    public static SecretKey f46649c;

    /* renamed from: d, reason: collision with root package name */
    public static byte[] f46650d;

    /* renamed from: b, reason: collision with root package name */
    public static LinkedList<String> f46648b = new LinkedList<>();

    /* renamed from: e, reason: collision with root package name */
    public static final SecureRandom f46651e = new SecureRandom();

    public static HashMap<String, String> a() throws JSONException {
        JSONObject jSONObject = !TextUtils.isEmpty(m3.f46608x) ? new JSONObject(m3.f46608x) : new JSONObject();
        JSONArray optJSONArray = jSONObject.optJSONArray("lv1");
        JSONObject optJSONObject = jSONObject.optJSONObject("lv2");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return new HashMap<>();
        }
        if (optJSONObject == null) {
            HashMap<String, String> hashMap = new HashMap<>();
            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                String string = optJSONArray.getString(i11);
                if ("99".equals(string)) {
                    hashMap.put(string, u0.a());
                } else {
                    hashMap.put(string, w3.a(string));
                }
            }
            return hashMap;
        }
        HashMap<String, String> hashMap2 = new HashMap<>();
        for (int i12 = 0; i12 < optJSONArray.length(); i12++) {
            String string2 = optJSONArray.getString(i12);
            String a11 = "99".equals(string2) ? u0.a() : w3.a(string2);
            if (!TextUtils.isEmpty(a11) && optJSONObject.has(string2)) {
                string2.getClass();
                switch (string2) {
                    case "48":
                    case "49":
                    case "98":
                        String[] split = a11.split("#");
                        HashMap hashMap3 = new HashMap();
                        for (String str : split) {
                            String str2 = str.split(",")[0];
                            hashMap3.put(str2, str.substring(str2.length() + 1));
                        }
                        JSONObject jSONObject2 = optJSONObject.getJSONObject(string2);
                        Iterator<String> keys = jSONObject2.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            try {
                                String str3 = string2 + "." + next;
                                String str4 = (String) hashMap3.get(p.a(jSONObject2.getString(next), true));
                                hashMap2.put(str3, str4);
                                if (!TextUtils.isEmpty(str4)) {
                                    f46648b.add(str3);
                                }
                            } catch (Throwable th2) {
                                r2.a(th2);
                            }
                        }
                        break;
                }
            }
            hashMap2.put(string2, a11);
        }
        return hashMap2;
    }

    @Java2C.Method2C
    private static native void a(JSONObject jSONObject) throws Throwable;

    public static JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(m3.D)) {
                return new JSONObject(m3.D);
            }
        } catch (JSONException e11) {
            StringBuilder a11 = f3.a("ZXID buildOldLv1 error:");
            a11.append(e11.getMessage());
            r2.b(a11.toString());
        }
        return jSONObject;
    }

    @Java2C.Method2C
    private static native void b(JSONObject jSONObject) throws Throwable;

    @Java2C.Method2C
    public static native synchronized String c();

    public static JSONObject c(JSONArray jSONArray, HashMap<String, String> hashMap, JSONObject jSONObject) {
        StringBuffer stringBuffer = new StringBuffer();
        JSONObject jSONObject2 = new JSONObject();
        StringBuffer stringBuffer2 = new StringBuffer();
        JSONObject b11 = b();
        int i11 = 0;
        while (true) {
            String str = "";
            if (i11 >= jSONArray.length()) {
                break;
            }
            try {
                String string = jSONArray.getString(i11);
                String str2 = hashMap.get(string);
                if (str2 == null) {
                    str2 = "";
                }
                String a11 = a(string, str2, jSONObject);
                if (a11 != null) {
                    str = a11;
                }
                jSONObject2.put(string, str);
                stringBuffer.append(str2);
                stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                stringBuffer2.append(a(string, b11));
                stringBuffer2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            } catch (JSONException e11) {
                StringBuilder a12 = f3.a("ZXID handleType3 error:");
                a12.append(e11.getMessage());
                r2.b(a12.toString());
            }
            i11++;
        }
        Iterator<String> it = f46648b.iterator();
        while (it.hasNext()) {
            String next = it.next();
            try {
                String str3 = hashMap.get(next);
                if (str3 == null) {
                    str3 = "";
                }
                String a13 = a(next, str3, jSONObject);
                if (a13 == null) {
                    a13 = "";
                }
                jSONObject2.put(next, a13);
                stringBuffer.append(str3);
                stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                stringBuffer2.append(a(next, b11));
                stringBuffer2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            } catch (JSONException e12) {
                StringBuilder a14 = f3.a("ZXID handleType3 childIndex error:");
                a14.append(e12.getMessage());
                r2.b(a14.toString());
            }
        }
        return !TextUtils.equals(p.a(stringBuffer.toString(), "SHA256"), p.a(stringBuffer2.toString(), "SHA256")) ? jSONObject2 : new JSONObject();
    }

    public static JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            f46648b.clear();
            HashMap<String, String> a11 = a();
            m3.E = new JSONObject(a11).toString();
            JSONObject jSONObject2 = !TextUtils.isEmpty(m3.f46609y) ? new JSONObject(m3.f46609y) : new JSONObject();
            JSONObject jSONObject3 = !TextUtils.isEmpty(m3.f46610z) ? new JSONObject(m3.f46610z) : new JSONObject();
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject jSONObject4 = jSONObject2.getJSONObject(next);
                int i11 = jSONObject4.getInt("type");
                JSONArray jSONArray = jSONObject4.getJSONArray("list");
                if (i11 == 1) {
                    jSONObject.put(next, a(jSONArray, a11, jSONObject3));
                } else if (i11 == 2) {
                    jSONObject.put(next, b(jSONArray, a11, jSONObject3));
                } else if (i11 == 3) {
                    jSONObject.put(next, c(jSONArray, a11, jSONObject3));
                }
            }
            return jSONObject;
        } catch (Throwable th2) {
            StringBuilder a12 = f3.a("ZXID 获取data参数异常:");
            a12.append(th2.getMessage());
            r2.b(a12.toString());
            return jSONObject;
        }
    }

    @Java2C.Method2C
    private static native String e();

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ca, code lost:
    
        if (r7.length() > 0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1166
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zx.a.I8b7.p1.f():void");
    }

    public static JSONObject b(JSONArray jSONArray, HashMap<String, String> hashMap, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        JSONObject b11 = b();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            try {
                String string = jSONArray.getString(i11);
                String str = hashMap.get(string);
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                if (!TextUtils.equals(a(string, b11), str)) {
                    String a11 = a(string, str, jSONObject);
                    if (a11 != null) {
                        str2 = a11;
                    }
                    jSONObject2.put(string, str2);
                }
            } catch (JSONException e11) {
                StringBuilder a12 = f3.a("ZXID handleType2 error:");
                a12.append(e11.getMessage());
                r2.b(a12.toString());
            }
        }
        return jSONObject2;
    }

    public static JSONObject a(JSONArray jSONArray, HashMap<String, String> hashMap, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            try {
                String string = jSONArray.getString(i11);
                String a11 = a(string, hashMap.get(string), jSONObject);
                if (a11 == null) {
                    a11 = "";
                }
                jSONObject2.put(string, a11);
            } catch (JSONException e11) {
                StringBuilder a12 = f3.a("ZXID handleType1 error:");
                a12.append(e11.getMessage());
                r2.b(a12.toString());
            }
        }
        return jSONObject2;
    }

    public static String a(String str, String str2, JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has(str) && !TextUtils.isEmpty(str2)) {
            try {
                int i11 = jSONObject.getInt(str);
                if (i11 == 1) {
                    return new String(Base64.encode(p.a(str2, f46649c, "UDID_ENC_AUTHTAG"), 2), StandardCharsets.UTF_8);
                }
                if (i11 == 2) {
                    return p.a(p.a(str2, "MD5").substring(0, 20), "MD5");
                }
                if (i11 == 3) {
                    String a11 = p.a(str2, "MD5");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(a11.substring(0, 20));
                    PackageManager packageManager = w3.f46733a;
                    sb2.append(Build.MODEL);
                    return p.a(sb2.toString(), "MD5");
                }
            } catch (Exception e11) {
                r2.b("加密脱敏失败:" + str + ",error:" + e11);
                return null;
            }
        }
        return str2;
    }

    public static String a(String str, JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0 && !jSONObject.isNull(str)) {
            return jSONObject.optString(str);
        }
        return "";
    }
}
