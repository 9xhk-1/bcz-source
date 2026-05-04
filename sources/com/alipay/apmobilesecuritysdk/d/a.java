package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a {
    public static synchronized Map<String, String> a(Context context, Map<String, String> map) {
        HashMap hashMap;
        synchronized (a.class) {
            String a11 = com.alipay.sdk.m.z.a.a(map, "appchannel", "");
            hashMap = new HashMap();
            hashMap.put("AA1", context.getPackageName());
            com.alipay.sdk.m.a0.a.a();
            hashMap.put("AA2", com.alipay.sdk.m.a0.a.a(context));
            hashMap.put("AA3", "APPSecuritySDK-ALIPAYSDK");
            hashMap.put("AA4", "3.4.0.202303020703");
            hashMap.put("AA6", a11);
        }
        return hashMap;
    }
}
