package com.xiaomi.push;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes8.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static a f45596a;

    public interface a {
        Map<String, String> a(Context context, String str);

        /* renamed from: a, reason: collision with other method in class */
        boolean m5982a(Context context, String str);

        boolean b(Context context, String str);
    }

    public enum b {
        UNKNOWN(0),
        ALLOWED(1),
        NOT_ALLOWED(2);


        /* renamed from: a, reason: collision with other field name */
        private final int f456a;

        b(int i11) {
            this.f456a = i11;
        }

        public int a() {
            return this.f456a;
        }
    }

    public static int a(Context context) {
        Bundle bundle;
        if (context == null) {
            return 0;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.android.systemui", 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                return 0;
            }
            return bundle.getInt("SupportForPushVersionCode");
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public static int b(Context context, String str) {
        ApplicationInfo m5974a = m5974a(context, str);
        if (m5974a == null) {
            return 0;
        }
        int i11 = m5974a.icon;
        return i11 == 0 ? m5974a.logo : i11;
    }

    public static boolean c(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        return packageInfo != null;
    }

    public static boolean d(Context context, String str) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    public static boolean e(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (Settings.Secure.getInt(context.getContentResolver(), "freeform_window_state", -1) >= 0) {
                return str.equals(Settings.Secure.getString(context.getContentResolver(), "freeform_package_name"));
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int a(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (Exception unused) {
            packageInfo = null;
        }
        if (packageInfo != null) {
            return packageInfo.versionCode;
        }
        return 0;
    }

    /* renamed from: b, reason: collision with other method in class */
    public static String m5980b(Context context, String str) {
        ApplicationInfo applicationInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null) {
                return packageManager.getApplicationLabel(applicationInfo).toString();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return str;
    }

    /* renamed from: a, reason: collision with other method in class */
    private static ApplicationInfo m5974a(Context context, String str) {
        if (str.equals(context.getPackageName())) {
            return context.getApplicationInfo();
        }
        try {
            return context.getPackageManager().getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("not found app info " + str);
            return null;
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    public static boolean m5981b(Context context, String str) {
        a aVar = f45596a;
        return aVar != null && aVar.b(context, str);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static Drawable m5975a(Context context, String str) {
        ApplicationInfo m5974a = m5974a(context, str);
        Drawable drawable = null;
        if (m5974a != null) {
            try {
                drawable = m5974a.loadIcon(context.getPackageManager());
                if (drawable == null) {
                    drawable = m5974a.loadLogo(context.getPackageManager());
                }
            } catch (Exception e11) {
                com.xiaomi.channel.commonutils.logger.b.m5639a("get app icon drawable failed, " + e11);
            }
        }
        return drawable != null ? drawable : new ColorDrawable(0);
    }

    private static b a(Context context, ApplicationInfo applicationInfo) {
        Boolean bool;
        int i11 = Build.VERSION.SDK_INT;
        if (applicationInfo == null) {
            return b.UNKNOWN;
        }
        try {
            if (applicationInfo.packageName.equals(context.getPackageName())) {
                bool = Boolean.valueOf(((NotificationManager) context.getSystemService("notification")).areNotificationsEnabled());
            } else {
                Object a11 = i11 >= 29 ? bj.a(context.getSystemService("notification"), "getService", new Object[0]) : context.getSystemService("security");
                bool = a11 != null ? (Boolean) bj.b(a11, "areNotificationsEnabledForPackage", applicationInfo.packageName, Integer.valueOf(applicationInfo.uid)) : null;
            }
            if (bool != null) {
                return bool.booleanValue() ? b.ALLOWED : b.NOT_ALLOWED;
            }
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("are notifications enabled error " + e11);
        }
        return b.UNKNOWN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        if (r5.equals(r6) != false) goto L29;
     */
    @android.annotation.TargetApi(19)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.xiaomi.push.g.b a(android.content.Context r5, java.lang.String r6, boolean r7) {
        /*
            java.lang.Class<android.app.AppOpsManager> r0 = android.app.AppOpsManager.class
            if (r5 == 0) goto Lab
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 == 0) goto Lc
            goto Lab
        Lc:
            java.lang.String r1 = r5.getPackageName()     // Catch: java.lang.Throwable -> L93
            boolean r1 = r6.equals(r1)     // Catch: java.lang.Throwable -> L93
            r2 = 0
            if (r1 == 0) goto L1c
            android.content.pm.ApplicationInfo r1 = r5.getApplicationInfo()     // Catch: java.lang.Throwable -> L93
            goto L24
        L1c:
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L93
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo(r6, r2)     // Catch: java.lang.Throwable -> L93
        L24:
            com.xiaomi.push.g$b r3 = a(r5, r1)     // Catch: java.lang.Throwable -> L93
            com.xiaomi.push.g$b r4 = com.xiaomi.push.g.b.UNKNOWN     // Catch: java.lang.Throwable -> L93
            if (r3 == r4) goto L2d
            return r3
        L2d:
            java.lang.String r3 = "OP_POST_NOTIFICATION"
            java.lang.Object r3 = com.xiaomi.push.bj.a(r0, r3)     // Catch: java.lang.Throwable -> L93
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L93
            if (r3 != 0) goto L38
            return r4
        L38:
            java.lang.String r4 = "appops"
            java.lang.Object r5 = r5.getSystemService(r4)     // Catch: java.lang.Throwable -> L93
            android.app.AppOpsManager r5 = (android.app.AppOpsManager) r5     // Catch: java.lang.Throwable -> L93
            java.lang.String r4 = "checkOpNoThrow"
            int r1 = r1.uid     // Catch: java.lang.Throwable -> L93
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L93
            java.lang.Object[] r6 = new java.lang.Object[]{r3, r1, r6}     // Catch: java.lang.Throwable -> L93
            java.lang.Object r5 = com.xiaomi.push.bj.a(r5, r4, r6)     // Catch: java.lang.Throwable -> L93
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L93
            java.lang.String r6 = "MODE_ALLOWED"
            java.lang.Object r6 = com.xiaomi.push.bj.a(r0, r6)     // Catch: java.lang.Throwable -> L93
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Throwable -> L93
            java.lang.String r1 = "MODE_IGNORED"
            java.lang.Object r0 = com.xiaomi.push.bj.a(r0, r1)     // Catch: java.lang.Throwable -> L93
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L93
            java.lang.String r1 = "get app mode %s|%s|%s"
            java.lang.Object[] r3 = new java.lang.Object[]{r5, r6, r0}     // Catch: java.lang.Throwable -> L93
            java.lang.String r1 = java.lang.String.format(r1, r3)     // Catch: java.lang.Throwable -> L93
            com.xiaomi.channel.commonutils.logger.b.b(r1)     // Catch: java.lang.Throwable -> L93
            if (r6 != 0) goto L75
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L93
        L75:
            if (r0 != 0) goto L7c
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L93
        L7c:
            if (r5 == 0) goto La8
            if (r7 == 0) goto L87
            boolean r5 = r5.equals(r0)     // Catch: java.lang.Throwable -> L93
            if (r5 != 0) goto L90
            goto L8d
        L87:
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L93
            if (r5 == 0) goto L90
        L8d:
            com.xiaomi.push.g$b r5 = com.xiaomi.push.g.b.ALLOWED     // Catch: java.lang.Throwable -> L93
            return r5
        L90:
            com.xiaomi.push.g$b r5 = com.xiaomi.push.g.b.NOT_ALLOWED     // Catch: java.lang.Throwable -> L93
            return r5
        L93:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "get app op error "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.xiaomi.channel.commonutils.logger.b.m5639a(r5)
        La8:
            com.xiaomi.push.g$b r5 = com.xiaomi.push.g.b.UNKNOWN
            return r5
        Lab:
            com.xiaomi.push.g$b r5 = com.xiaomi.push.g.b.UNKNOWN
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.g.a(android.content.Context, java.lang.String, boolean):com.xiaomi.push.g$b");
    }

    public static String a() {
        String processName = Build.VERSION.SDK_INT >= 28 ? Application.getProcessName() : (String) bj.a("android.app.ActivityThread", "currentProcessName", new Object[0]);
        return !TextUtils.isEmpty(processName) ? processName : "";
    }

    /* renamed from: a, reason: collision with other method in class */
    public static String m5976a(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (Exception unused) {
            packageInfo = null;
        }
        return packageInfo != null ? packageInfo.versionName : "1.0";
    }

    /* renamed from: a, reason: collision with other method in class */
    public static Map<String, String> m5977a(Context context, String str) {
        a aVar = f45596a;
        if (aVar == null) {
            return null;
        }
        return aVar.a(context, str);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m5978a(Context context) {
        String a11 = a();
        if (TextUtils.isEmpty(a11) || context == null) {
            return false;
        }
        return a11.equals(context.getPackageName());
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m5979a(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            if (!j.m6171a()) {
                return context.getPackageName().equals(str);
            }
            a aVar = f45596a;
            if (aVar != null && aVar.m5982a(context, str)) {
                return true;
            }
        }
        return false;
    }
}
