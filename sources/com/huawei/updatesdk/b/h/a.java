package com.huawei.updatesdk.b.h;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    private static final Map<Integer, String> f36914d;

    /* renamed from: e, reason: collision with root package name */
    private static a f36915e;

    /* renamed from: a, reason: collision with root package name */
    private int f36916a;

    /* renamed from: b, reason: collision with root package name */
    private int f36917b = 0;

    /* renamed from: c, reason: collision with root package name */
    private String f36918c = "";

    static {
        HashMap hashMap = new HashMap();
        f36914d = hashMap;
        f36915e = new a();
        hashMap.put(1, "1.0");
        hashMap.put(2, "1.5");
        hashMap.put(3, "1.6");
        hashMap.put(4, "2.0");
        hashMap.put(5, "2.0");
        hashMap.put(6, "2.3");
        hashMap.put(7, "3.0");
        hashMap.put(8, "3.0.5");
        hashMap.put(8, "3.1");
        hashMap.put(9, "4.0");
        hashMap.put(10, "4.1");
        hashMap.put(11, "5.0");
        hashMap.put(12, "5.1");
    }

    private a() {
        int e11 = e();
        this.f36916a = e11;
        if (e11 == 0) {
            this.f36916a = d();
        }
        g();
        h();
        com.huawei.updatesdk.a.a.a.b("SystemSupportUtil", "emuiVersion:" + this.f36916a + ", magicApiLevel:" + this.f36917b + ", magicVersion:" + this.f36918c);
    }

    private int d() {
        String a11 = a(com.huawei.updatesdk.a.a.d.i.c.a(com.alipay.sdk.m.c.a.f10484a, ""));
        if (TextUtils.isEmpty(a11)) {
            return 0;
        }
        for (Map.Entry<Integer, String> entry : f36914d.entrySet()) {
            if (a11.equals(entry.getValue())) {
                return entry.getKey().intValue();
            }
        }
        return 0;
    }

    private int e() {
        return com.huawei.updatesdk.a.a.d.i.c.a("ro.build.hw_emui_api_level", 0);
    }

    public static a f() {
        return f36915e;
    }

    private void g() {
        try {
            Class<?> cls = Class.forName("com.hihonor.android.os.Build$VERSION");
            this.f36917b = cls.getDeclaredField("MAGIC_SDK_INT").getInt(cls);
        } catch (Throwable th2) {
            com.huawei.updatesdk.a.a.a.c("SystemSupportUtil", "initMagicApiLevel, error: " + th2.getMessage());
        }
    }

    private void h() {
        try {
            Class<?> cls = Class.forName("com.hihonor.android.os.Build");
            String str = (String) cls.getDeclaredField("MAGIC_VERSION").get(cls);
            if (str == null) {
                str = "";
            }
            this.f36918c = str;
        } catch (Throwable th2) {
            com.huawei.updatesdk.a.a.a.c("SystemSupportUtil", "initMagicVersion, error: " + th2.getMessage());
        }
    }

    public int a() {
        return this.f36916a;
    }

    public int b() {
        return this.f36917b;
    }

    public String c() {
        return this.f36918c;
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] split = str.split("_");
        return split.length == 2 ? split[1] : "";
    }
}
