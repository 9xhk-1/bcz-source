package com.huawei.updatesdk.b.c;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<Integer, Class<? extends c>> f36881a;

    /* renamed from: b, reason: collision with root package name */
    private static c f36882b;

    static {
        HashMap hashMap = new HashMap();
        f36881a = hashMap;
        hashMap.put(3, a.class);
        hashMap.put(1, e.class);
        hashMap.put(2, f.class);
        hashMap.put(0, d.class);
        hashMap.put(4, d.class);
        hashMap.put(7, d.class);
    }

    public static synchronized c a() {
        synchronized (b.class) {
            c cVar = f36882b;
            if (cVar != null) {
                return cVar;
            }
            com.huawei.updatesdk.a.a.a.b("DeviceImplFactory", "deviceType: " + com.huawei.updatesdk.a.a.d.i.c.e());
            Class<? extends c> cls = f36881a.get(Integer.valueOf(com.huawei.updatesdk.a.a.d.i.c.e()));
            if (cls == null) {
                d dVar = new d();
                f36882b = dVar;
                return dVar;
            }
            try {
                f36882b = cls.newInstance();
            } catch (Throwable unused) {
                f36882b = new d();
                com.huawei.updatesdk.a.a.a.a("DeviceImplFactory", "createDeviceInfo error and create default phone deviceinfo");
            }
            return f36882b;
        }
    }
}
