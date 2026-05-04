package com.huawei.updatesdk.b.h;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.update.UpdateConstants;
import java.io.File;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static Integer f36919a = null;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f36920b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f36921c = false;

    /* renamed from: d, reason: collision with root package name */
    private static Field f36922d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.huawei.updatesdk.b.h.b$b, reason: collision with other inner class name */
    public static class RunnableC0455b implements Runnable {
        private RunnableC0455b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.huawei.updatesdk.a.a.c.a.a.a.a("PackageManagerRunnable", "PackageManagerRunnable run!!!!");
            com.huawei.updatesdk.a.a.d.d.a(new File(com.huawei.updatesdk.b.d.d.b()));
        }
    }

    private static int a(Context context, String str) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("appgallery_support_function")) {
                return 0;
            }
            return bundle.getInt("appgallery_support_function");
        } catch (Exception e11) {
            com.huawei.updatesdk.a.a.a.a("PackageUtils", "getAgMetaData appgallery_support_function : " + e11.getMessage());
            return 0;
        }
    }

    public static int b(String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageInfo packageInfo = com.huawei.updatesdk.a.b.a.a.c().a().getPackageManager().getPackageInfo(str, 128);
            return (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("com.huawei.maple.flag")) ? 0 : 1;
        } catch (Exception unused) {
            com.huawei.updatesdk.a.a.c.a.a.a.d("PackageUtils", "getMapleStatus not found: " + str);
            return 0;
        }
    }

    public static int c(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            com.huawei.updatesdk.a.a.a.b("PackageUtils", "pkgName: " + str + ", versionCode: " + packageInfo.versionCode + ", versionName: " + packageInfo.versionName);
            return packageInfo.versionCode;
        } catch (Exception e11) {
            com.huawei.updatesdk.a.a.c.a.a.a.d("PackageUtils", "getVersioncode:" + e11.getMessage());
            return 0;
        }
    }

    public static boolean d(Context context, String str) {
        return c(context, str) > 0;
    }

    public static boolean e(Context context, String str) {
        int a11 = a(context, str);
        com.huawei.updatesdk.a.a.a.b("PackageUtils", "UpdateSDK ag_support_function = " + a11);
        boolean z11 = (a11 & 2) == 2;
        com.huawei.updatesdk.a.a.a.b("PackageUtils", "UpdateSDK isMetaDataSupport = " + z11);
        return z11;
    }

    public static boolean f(Context context, String str) {
        return c(context, str) >= 70203000 && g(context, str);
    }

    private static boolean g(Context context, String str) {
        Intent intent = new Intent(UpdateConstants.ACTION_NAME_HIAPP_SILENT_DOWNLOAD);
        intent.setPackage(str);
        try {
            return context.getPackageManager().queryIntentActivities(intent, 0).size() > 0;
        } catch (Exception e11) {
            com.huawei.updatesdk.a.a.a.b("PackageUtils", "isSupportToHiApp: " + e11.getMessage());
            return false;
        }
    }

    public static int a(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        if ((applicationInfo.flags & 1) == 0) {
            return 0;
        }
        return a(applicationInfo) ? 1 : 2;
    }

    public static String b(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getInstallerPackageName(str);
        } catch (Exception unused) {
            com.huawei.updatesdk.a.a.a.b("PackageUtils", "can not find installer pkg." + str);
            str2 = null;
        }
        com.huawei.updatesdk.a.a.c.a.a.a.c("PackageUtils", "installer pkg: " + str2);
        return str2;
    }

    public static Integer c() {
        String obj;
        StringBuilder sb2;
        String str;
        if (f36920b) {
            return f36919a;
        }
        try {
            Class<?> cls = Class.forName("android.content.pm.PackageParser");
            f36919a = Integer.valueOf(cls.getDeclaredField("PARSE_IS_REMOVABLE_PREINSTALLED_APK").getInt(cls));
        } catch (ClassNotFoundException e11) {
            e = e11;
            sb2 = new StringBuilder();
            str = "isDelApp error ClassNotFoundException:";
            sb2.append(str);
            sb2.append(e.getMessage());
            obj = sb2.toString();
            com.huawei.updatesdk.a.a.c.a.a.a.a("PackageUtils", obj);
            f36920b = true;
            return f36919a;
        } catch (IllegalAccessException e12) {
            e = e12;
            sb2 = new StringBuilder();
            str = "isDelApp error IllegalAccessException:";
            sb2.append(str);
            sb2.append(e.getMessage());
            obj = sb2.toString();
            com.huawei.updatesdk.a.a.c.a.a.a.a("PackageUtils", obj);
            f36920b = true;
            return f36919a;
        } catch (IllegalArgumentException e13) {
            e = e13;
            sb2 = new StringBuilder();
            str = "isDelApp error IllegalArgumentException:";
            sb2.append(str);
            sb2.append(e.getMessage());
            obj = sb2.toString();
            com.huawei.updatesdk.a.a.c.a.a.a.a("PackageUtils", obj);
            f36920b = true;
            return f36919a;
        } catch (NoSuchFieldException e14) {
            e = e14;
            sb2 = new StringBuilder();
            str = "isDelApp error NoSuchFieldException:";
            sb2.append(str);
            sb2.append(e.getMessage());
            obj = sb2.toString();
            com.huawei.updatesdk.a.a.c.a.a.a.a("PackageUtils", obj);
            f36920b = true;
            return f36919a;
        } catch (Exception e15) {
            obj = e15.toString();
            com.huawei.updatesdk.a.a.c.a.a.a.a("PackageUtils", obj);
            f36920b = true;
            return f36919a;
        }
        f36920b = true;
        return f36919a;
    }

    public static PackageInfo a(String str, Context context) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64);
        } catch (Exception unused) {
            com.huawei.updatesdk.a.a.c.a.a.a.d("PackageUtils", "not found: " + str);
            return null;
        }
    }

    public static Field b() {
        if (f36921c) {
            return f36922d;
        }
        try {
            f36922d = ApplicationInfo.class.getField("hwFlags");
        } catch (NoSuchFieldException unused) {
            com.huawei.updatesdk.a.a.c.a.a.a.a("PackageUtils", "can not find hwFlags");
        }
        f36921c = true;
        return f36922d;
    }

    public static void a() {
        com.huawei.updatesdk.b.g.c.f36910a.execute(new RunnableC0455b());
    }

    private static boolean a(ApplicationInfo applicationInfo) {
        StringBuilder sb2;
        int i11 = applicationInfo.flags;
        Integer c11 = c();
        if (c11 != null && (i11 & c11.intValue()) != 0) {
            return true;
        }
        Field b11 = b();
        if (b11 == null) {
            return false;
        }
        try {
            return (b11.getInt(applicationInfo) & 33554432) != 0;
        } catch (IllegalAccessException e11) {
            e = e11;
            sb2 = new StringBuilder();
            sb2.append("can not get hwflags");
            sb2.append(e.getMessage());
            com.huawei.updatesdk.a.a.c.a.a.a.a("PackageUtils", sb2.toString());
            return false;
        } catch (IllegalArgumentException e12) {
            e = e12;
            sb2 = new StringBuilder();
            sb2.append("can not get hwflags");
            sb2.append(e.getMessage());
            com.huawei.updatesdk.a.a.c.a.a.a.a("PackageUtils", sb2.toString());
            return false;
        }
    }

    public static boolean a(String str) {
        boolean z11 = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Context a11 = com.huawei.updatesdk.a.b.a.a.c().a();
        Uri parse = Uri.parse("content://" + str + ".commondata/item/7");
        if (!d.a(a11, parse, str)) {
            return false;
        }
        Cursor cursor = null;
        try {
            try {
                cursor = a11.getContentResolver().query(parse, null, str, null, null);
                if (cursor != null && cursor.moveToFirst()) {
                    z11 = Boolean.parseBoolean(cursor.getString(0));
                }
                d.a(cursor);
                return z11;
            } catch (Exception e11) {
                com.huawei.updatesdk.a.a.a.a("PackageUtils", "getAgreeProtocolStatus : " + e11.getMessage());
                d.a(cursor);
                return false;
            }
        } catch (Throwable th2) {
            d.a(cursor);
            throw th2;
        }
    }
}
