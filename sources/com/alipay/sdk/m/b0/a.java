package com.alipay.sdk.m.b0;

import android.content.Context;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a {
    public static String a(Context context, String str, String str2) {
        String a11;
        synchronized (a.class) {
            String str3 = null;
            if (context != null) {
                if (!com.alipay.sdk.m.z.a.a(str) && !com.alipay.sdk.m.z.a.a(str2)) {
                    try {
                        a11 = e.a(context, str, str2, "");
                    } catch (Throwable unused) {
                    }
                    if (!com.alipay.sdk.m.z.a.a(a11)) {
                        str3 = com.alipay.sdk.m.y.c.b(com.alipay.sdk.m.y.c.a(), a11);
                        return str3;
                    }
                }
            }
            return null;
        }
    }

    public static void a(Context context, String str, String str2, String str3) {
        synchronized (a.class) {
            try {
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
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
