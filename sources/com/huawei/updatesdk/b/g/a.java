package com.huawei.updatesdk.b.g;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static String f36908a;

    public static String a() {
        String str = f36908a;
        if (str != null) {
            return str;
        }
        Context a11 = com.huawei.updatesdk.a.b.a.a.c().a();
        try {
            StringBuilder sb2 = new StringBuilder("UpdateSDK");
            sb2.append("##");
            sb2.append("4.0.5.300");
            String str2 = Build.BRAND;
            if (TextUtils.isEmpty(str2)) {
                str2 = "other";
            }
            sb2.append("##");
            sb2.append(str2);
            sb2.append("##");
            sb2.append(com.huawei.updatesdk.b.c.b.a().e());
            sb2.append("##");
            sb2.append(a11.getPackageName());
            PackageInfo packageInfo = a11.getPackageManager().getPackageInfo(a11.getPackageName(), 0);
            if (packageInfo != null) {
                sb2.append("##");
                sb2.append(packageInfo.versionName);
            }
            String sb3 = sb2.toString();
            f36908a = sb3;
            return sb3;
        } catch (Exception e11) {
            com.huawei.updatesdk.a.a.c.a.a.a.b("ApplicationSession", "getUserAgent() " + e11.getMessage());
            return null;
        }
    }
}
