package com.huawei.updatesdk.b.a.a;

import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.huawei.updatesdk.a.a.d.d;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, com.huawei.updatesdk.b.a.a.a> f36863a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.huawei.updatesdk.b.a.a.b$b, reason: collision with other inner class name */
    public static class C0452b {

        /* renamed from: a, reason: collision with root package name */
        private static final b f36864a = new b();
    }

    private b() {
        this.f36863a = new HashMap();
    }

    public static b a() {
        return C0452b.f36864a;
    }

    public String a(PackageInfo packageInfo) {
        if (packageInfo == null || packageInfo.packageName == null || TextUtils.isEmpty(packageInfo.applicationInfo.sourceDir)) {
            return null;
        }
        com.huawei.updatesdk.b.a.a.a aVar = this.f36863a.get(packageInfo.packageName);
        if (aVar != null && aVar.b() == packageInfo.lastUpdateTime && aVar.c() == packageInfo.versionCode) {
            return aVar.a();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(packageInfo.lastUpdateTime);
        sb2.append(packageInfo.versionCode);
        sb2.append(packageInfo.packageName);
        String str = "packagekey" + packageInfo.packageName;
        String str2 = "fileshakey" + packageInfo.packageName;
        boolean equals = TextUtils.equals(sb2.toString(), com.huawei.updatesdk.b.b.a.d().a(str));
        if (!equals) {
            com.huawei.updatesdk.b.b.a.d().a(str, sb2.toString());
        }
        String a11 = com.huawei.updatesdk.b.b.a.d().a(str2);
        if (TextUtils.isEmpty(a11) || !equals) {
            a11 = d.a(packageInfo.applicationInfo.sourceDir, "SHA-256");
            com.huawei.updatesdk.b.b.a.d().a(str2, a11);
        }
        com.huawei.updatesdk.b.a.a.a aVar2 = new com.huawei.updatesdk.b.a.a.a();
        aVar2.a(a11);
        aVar2.a(packageInfo.lastUpdateTime);
        aVar2.a(packageInfo.versionCode);
        this.f36863a.put(packageInfo.packageName, aVar2);
        return a11;
    }
}
