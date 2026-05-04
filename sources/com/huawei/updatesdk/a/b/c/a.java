package com.huawei.updatesdk.a.b.c;

import com.huawei.updatesdk.service.appmgr.bean.d;
import com.huawei.updatesdk.service.appmgr.bean.e;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, Class> f36844a;

    static {
        HashMap hashMap = new HashMap();
        f36844a = hashMap;
        hashMap.put(d.APIMETHOD, e.class);
        hashMap.put(com.huawei.updatesdk.service.appmgr.bean.a.APIMETHOD, com.huawei.updatesdk.service.appmgr.bean.b.class);
    }

    public static com.huawei.updatesdk.a.b.c.c.d a(String str) {
        Class cls = f36844a.get(str);
        if (cls != null) {
            return (com.huawei.updatesdk.a.b.c.c.d) cls.newInstance();
        }
        throw new InstantiationException("ResponseBean class not found, method:" + str);
    }
}
