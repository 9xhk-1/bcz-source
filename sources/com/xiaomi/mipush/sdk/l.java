package com.xiaomi.mipush.sdk;

import com.xiaomi.push.hm;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private static HashMap<e, a> f45223a = new HashMap<>();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f45224a;

        /* renamed from: b, reason: collision with root package name */
        public String f45225b;

        public a(String str, String str2) {
            this.f45224a = str;
            this.f45225b = str2;
        }
    }

    static {
        a(e.ASSEMBLE_PUSH_HUAWEI, new a("com.xiaomi.assemble.control.HmsPushManager", "newInstance"));
        a(e.ASSEMBLE_PUSH_FCM, new a("com.xiaomi.assemble.control.FCMPushManager", "newInstance"));
        a(e.ASSEMBLE_PUSH_COS, new a("com.xiaomi.assemble.control.COSPushManager", "newInstance"));
        a(e.ASSEMBLE_PUSH_FTOS, new a("com.xiaomi.assemble.control.FTOSPushManager", "newInstance"));
    }

    public static au a(e eVar) {
        int i11 = m.f45226a[eVar.ordinal()];
        if (i11 == 1) {
            return au.UPLOAD_HUAWEI_TOKEN;
        }
        if (i11 == 2) {
            return au.UPLOAD_FCM_TOKEN;
        }
        if (i11 == 3) {
            return au.UPLOAD_COS_TOKEN;
        }
        if (i11 != 4) {
            return null;
        }
        return au.UPLOAD_FTOS_TOKEN;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static a m5709a(e eVar) {
        return f45223a.get(eVar);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static hm m5710a(e eVar) {
        return hm.AggregatePushSwitch;
    }

    private static void a(e eVar, a aVar) {
        if (aVar != null) {
            f45223a.put(eVar, aVar);
        }
    }
}
