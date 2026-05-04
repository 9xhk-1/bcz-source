package com.huawei.hms.support.log;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.AndroidException;
import com.huawei.hms.base.log.a;
import com.huawei.hms.base.log.b;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class HMSLog {

    /* renamed from: a, reason: collision with root package name */
    private static final b f36434a = new b();

    private static String a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 16384);
                return "HMS-" + packageInfo.versionName + j.f81006c + packageInfo.versionCode + j.f81007d;
            } catch (AndroidException | RuntimeException unused) {
            }
        }
        return "HMS-[unknown-version]";
    }

    public static void d(String str, String str2) {
        f36434a.a(3, str, str2);
    }

    public static void e(String str, String str2) {
        f36434a.a(6, str, str2);
    }

    public static void i(String str, String str2) {
        f36434a.a(4, str, str2);
    }

    public static void init(Context context, int i11, String str) {
        b bVar = f36434a;
        bVar.a(context, i11, str);
        bVar.a(str, "============================================================================\n====== " + a(context) + "\n============================================================================");
    }

    public static boolean isErrorEnable() {
        return f36434a.a(6);
    }

    public static boolean isInfoEnable() {
        return f36434a.a(4);
    }

    public static boolean isWarnEnable() {
        return f36434a.a(5);
    }

    public static void setExtLogger(HMSExtLogger hMSExtLogger, boolean z11) throws IllegalArgumentException {
        if (hMSExtLogger == null) {
            throw new IllegalArgumentException("extLogger is not able to be null");
        }
        a aVar = new a(hMSExtLogger);
        if (z11) {
            f36434a.a(aVar);
        } else {
            f36434a.a().a(aVar);
        }
    }

    public static void w(String str, String str2) {
        f36434a.a(5, str, str2);
    }

    public static void e(String str, String str2, Throwable th2) {
        f36434a.b(6, str, str2, th2);
    }

    public static void e(String str, long j11, String str2) {
        f36434a.a(6, str, "[" + j11 + "] " + str2);
    }

    public static void e(String str, long j11, String str2, Throwable th2) {
        f36434a.b(6, str, "[" + j11 + "] " + str2, th2);
    }
}
