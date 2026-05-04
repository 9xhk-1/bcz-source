package com.alipay.apmobilesecuritysdk.f;

import android.content.Context;
import android.os.Environment;
import com.alipay.sdk.m.b0.e;
import java.io.File;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a {
    public static String a(Context context, String str, String str2) {
        if (context != null && !com.alipay.sdk.m.z.a.a(str) && !com.alipay.sdk.m.z.a.a(str2)) {
            try {
                String a11 = e.a(context, str, str2, "");
                if (com.alipay.sdk.m.z.a.a(a11)) {
                    return null;
                }
                return com.alipay.sdk.m.y.c.b(com.alipay.sdk.m.y.c.a(), a11);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static String a(String str, String str2) {
        synchronized (a.class) {
            if (!com.alipay.sdk.m.z.a.a(str) && !com.alipay.sdk.m.z.a.a(str2)) {
                try {
                    String a11 = com.alipay.sdk.m.b0.b.a(str);
                    if (!com.alipay.sdk.m.z.a.a(a11)) {
                        String string = new JSONObject(a11).getString(str2);
                        if (!com.alipay.sdk.m.z.a.a(string)) {
                            return com.alipay.sdk.m.y.c.b(com.alipay.sdk.m.y.c.a(), string);
                        }
                    }
                } catch (Throwable unused) {
                    return null;
                }
            }
            return null;
        }
    }

    public static void a(Context context, String str, String str2, String str3) {
        if (com.alipay.sdk.m.z.a.a(str) || com.alipay.sdk.m.z.a.a(str2) || context == null) {
            return;
        }
        try {
            String a11 = com.alipay.sdk.m.y.c.a(com.alipay.sdk.m.y.c.a(), str3);
            HashMap hashMap = new HashMap();
            hashMap.put(str2, a11);
            e.a(context, str, hashMap);
        } catch (Throwable unused) {
        }
    }

    public static void a(String str, String str2, String str3) {
        synchronized (a.class) {
            try {
                if (com.alipay.sdk.m.z.a.a(str) || com.alipay.sdk.m.z.a.a(str2)) {
                    return;
                }
                try {
                    String a11 = com.alipay.sdk.m.b0.b.a(str);
                    JSONObject jSONObject = new JSONObject();
                    if (com.alipay.sdk.m.z.a.b(a11)) {
                        try {
                            jSONObject = new JSONObject(a11);
                        } catch (Exception unused) {
                            jSONObject = new JSONObject();
                        }
                    }
                    jSONObject.put(str2, com.alipay.sdk.m.y.c.a(com.alipay.sdk.m.y.c.a(), str3));
                    jSONObject.toString();
                    try {
                        System.clearProperty(str);
                    } catch (Throwable unused2) {
                    }
                    if (com.alipay.sdk.m.b0.c.a()) {
                        String str4 = ".SystemConfig" + File.separator + str;
                        if (com.alipay.sdk.m.b0.c.a()) {
                            File file = new File(Environment.getExternalStorageDirectory(), str4);
                            if (file.exists() && file.isFile()) {
                                file.delete();
                            }
                        }
                    }
                } catch (Throwable unused3) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
