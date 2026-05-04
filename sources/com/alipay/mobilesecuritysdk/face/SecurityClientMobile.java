package com.alipay.mobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.alipay.sdk.m.l.b;
import com.alipay.sdk.m.z.a;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class SecurityClientMobile {
    public static synchronized String GetApdid(Context context, Map<String, String> map) {
        String a11;
        synchronized (SecurityClientMobile.class) {
            HashMap hashMap = new HashMap();
            hashMap.put(b.f10730g, a.a(map, b.f10730g, ""));
            hashMap.put("tid", a.a(map, "tid", ""));
            hashMap.put("userId", a.a(map, "userId", ""));
            APSecuritySdk.getInstance(context).initToken(0, hashMap, null);
            a11 = com.alipay.apmobilesecuritysdk.a.a.a(context);
        }
        return a11;
    }
}
