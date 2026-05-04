package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.e.h;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b {
    public static synchronized Map<String, String> a(Context context, Map<String, String> map) {
        HashMap hashMap;
        synchronized (b.class) {
            hashMap = new HashMap();
            String a11 = com.alipay.sdk.m.z.a.a(map, "tid", "");
            String a12 = com.alipay.sdk.m.z.a.a(map, com.alipay.sdk.m.l.b.f10730g, "");
            String a13 = com.alipay.sdk.m.z.a.a(map, "userId", "");
            String a14 = com.alipay.sdk.m.z.a.a(map, "appName", "");
            String a15 = com.alipay.sdk.m.z.a.a(map, "appKeyClient", "");
            String a16 = com.alipay.sdk.m.z.a.a(map, "tmxSessionId", "");
            String f11 = h.f(context);
            String a17 = com.alipay.sdk.m.z.a.a(map, "sessionId", "");
            hashMap.put("AC1", a11);
            hashMap.put("AC2", a12);
            hashMap.put("AC3", "");
            hashMap.put("AC4", f11);
            hashMap.put("AC5", a13);
            hashMap.put("AC6", a16);
            hashMap.put("AC7", "");
            hashMap.put("AC8", a14);
            hashMap.put("AC9", a15);
            if (com.alipay.sdk.m.z.a.b(a17)) {
                hashMap.put("AC10", a17);
            }
        }
        return hashMap;
    }
}
