package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class d {
    public static synchronized Map<String, String> a() {
        HashMap hashMap;
        synchronized (d.class) {
            hashMap = new HashMap();
            try {
                new com.alipay.apmobilesecuritysdk.c.b();
                hashMap.put("AE16", "");
            } catch (Throwable unused) {
            }
        }
        return hashMap;
    }

    public static synchronized Map<String, String> a(Context context) {
        HashMap hashMap;
        synchronized (d.class) {
            try {
                com.alipay.sdk.m.a0.e.a();
                com.alipay.sdk.m.a0.b.a(APSecuritySdk.getInstance(context));
                hashMap = new HashMap();
                hashMap.put("AE1", com.alipay.sdk.m.a0.e.b());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(com.alipay.sdk.m.a0.e.c() ? "1" : "0");
                hashMap.put("AE2", sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                sb3.append(com.alipay.sdk.m.a0.e.d() ? "1" : "0");
                hashMap.put("AE3", sb3.toString());
                hashMap.put("AE4", com.alipay.sdk.m.a0.e.e());
                hashMap.put("AE5", com.alipay.sdk.m.a0.e.f());
                hashMap.put("AE6", com.alipay.sdk.m.a0.e.g());
                hashMap.put("AE7", com.alipay.sdk.m.a0.e.h());
                hashMap.put("AE8", com.alipay.sdk.m.a0.e.i());
                hashMap.put("AE9", com.alipay.sdk.m.a0.e.j());
                hashMap.put("AE10", com.alipay.sdk.m.a0.e.k());
                hashMap.put("AE11", com.alipay.sdk.m.a0.e.l());
                hashMap.put("AE12", com.alipay.sdk.m.a0.e.m());
                hashMap.put("AE13", com.alipay.sdk.m.a0.e.n());
                hashMap.put("AE14", com.alipay.sdk.m.a0.e.o());
                hashMap.put("AE15", com.alipay.sdk.m.a0.e.p());
                hashMap.put("AE21", com.alipay.sdk.m.a0.b.f());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hashMap;
    }
}
