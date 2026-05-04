package com.huawei.updatesdk.b.a.b;

import android.content.pm.PackageInfo;
import android.util.ArrayMap;
import android.util.ArraySet;
import com.huawei.updatesdk.a.a.d.h;
import com.huawei.updatesdk.b.a.b.a;
import com.huawei.updatesdk.b.a.b.c;
import java.io.File;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, com.huawei.updatesdk.b.a.b.a> f36869a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.huawei.updatesdk.b.a.b.b$b, reason: collision with other inner class name */
    public static class C0454b {

        /* renamed from: a, reason: collision with root package name */
        private static final b f36870a = new b();
    }

    private b() {
        this.f36869a = new HashMap();
    }

    public static b a() {
        return C0454b.f36870a;
    }

    private static ArrayList<String> b(PackageInfo packageInfo) {
        ArraySet<String> arraySet;
        com.huawei.updatesdk.b.a.b.a aVar = new com.huawei.updatesdk.b.a.b.a();
        aVar.a(packageInfo.packageName);
        File file = new File(packageInfo.applicationInfo.sourceDir);
        if (!file.exists()) {
            return null;
        }
        aVar.a(file.lastModified());
        c.a a11 = c.a(file);
        ArrayMap<String, ArraySet<PublicKey>> arrayMap = a11.f36871a;
        if (arrayMap == null || arrayMap.isEmpty() || (arraySet = a11.f36872b) == null || arraySet.isEmpty()) {
            a(aVar);
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (Map.Entry<String, ArraySet<PublicKey>> entry : a11.f36871a.entrySet()) {
            if (a11.f36872b.contains(entry.getKey())) {
                Iterator<PublicKey> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    arrayList.add(h.a(it.next().getEncoded()));
                }
            }
        }
        a.C0453a c0453a = new a.C0453a();
        c0453a.a(arrayList);
        aVar.a(c0453a);
        a(aVar);
        return arrayList;
    }

    public List<String> a(PackageInfo packageInfo) {
        String str;
        if (packageInfo == null || (str = packageInfo.applicationInfo.sourceDir) == null) {
            return null;
        }
        long lastModified = new File(str).lastModified();
        com.huawei.updatesdk.b.a.b.a aVar = a().f36869a.get(packageInfo.packageName);
        if (aVar == null || aVar.b() != lastModified) {
            return b(packageInfo);
        }
        if (aVar.a() == null) {
            return null;
        }
        return aVar.a().a();
    }

    private static void a(com.huawei.updatesdk.b.a.b.a aVar) {
        a().f36869a.put(aVar.c(), aVar);
    }
}
