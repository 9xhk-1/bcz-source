package com.huawei.updatesdk.a.a.d.i;

import android.text.TextUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static String f36838a = "";

    public static boolean a() {
        if ("KidWatch".equals(f36838a)) {
            return true;
        }
        String a11 = c.a("ro.vendor.market.type", "");
        f36838a = a11;
        com.huawei.updatesdk.a.a.a.b("WearDeviceUtil", "Children watch property value is " + a11);
        if (TextUtils.isEmpty(a11)) {
            return false;
        }
        return "KidWatch".equals(a11);
    }
}
