package com.alipay.sdk.m.b0;

import android.content.Context;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class d {
    public static synchronized void a(Context context, String str, String str2, String str3) {
        synchronized (d.class) {
            if (!com.alipay.sdk.m.z.a.a(str)) {
                if (!com.alipay.sdk.m.z.a.a(str2) && context != null) {
                    try {
                        String a11 = com.alipay.sdk.m.y.c.a(com.alipay.sdk.m.y.c.a(), str3);
                        HashMap hashMap = new HashMap();
                        hashMap.put(str2, a11);
                        e.a(context, str, hashMap);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }
}
