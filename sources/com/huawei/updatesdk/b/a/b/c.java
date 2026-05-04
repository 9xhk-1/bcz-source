package com.huawei.updatesdk.b.a.b;

import android.util.ArrayMap;
import android.util.ArraySet;
import java.io.File;
import java.security.PublicKey;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
class c {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        ArrayMap<String, ArraySet<PublicKey>> f36871a = null;

        /* renamed from: b, reason: collision with root package name */
        ArraySet<String> f36872b = null;
    }

    public static a a(File file) {
        a aVar = new a();
        Object b11 = b(file);
        if (b11 != null) {
            Object a11 = a(b11, "mKeySetMapping");
            if (a11 instanceof ArrayMap) {
                aVar.f36871a = (ArrayMap) a11;
            }
            Object a12 = a(b11, "mUpgradeKeySets");
            if (a12 instanceof ArraySet) {
                aVar.f36872b = (ArraySet) a12;
            }
        }
        return aVar;
    }

    private static Object b(File file) {
        try {
            Class<?> cls = Class.forName("android.content.pm.PackageParser");
            return cls.getDeclaredMethod("parsePackage", File.class, Integer.TYPE).invoke(cls.newInstance(), file, 0);
        } catch (Throwable th2) {
            com.huawei.updatesdk.a.a.c.a.a.a.c("KeySetsUtils", "can not get PackageParser: " + th2.getMessage());
            return null;
        }
    }

    private static Object a(Object obj, String str) {
        try {
            return Class.forName("android.content.pm.PackageParser$Package").getDeclaredField(str).get(obj);
        } catch (Throwable th2) {
            com.huawei.updatesdk.a.a.c.a.a.a.c("KeySetsUtils", "can not find class: " + th2.getMessage());
            return null;
        }
    }
}
