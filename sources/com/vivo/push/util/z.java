package com.vivo.push.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import java.security.PublicKey;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private static String[] f45131a = {"com.vivo.push.sdk.RegistrationReceiver", "com.vivo.push.sdk.service.PushService", "com.vivo.push.sdk.service.CommonJobService"};

    /* renamed from: b, reason: collision with root package name */
    private static String[] f45132b = {"android.permission.INTERNET", "android.permission.READ_PHONE_STATE", yk.e.f100168b, "android.permission.WRITE_SETTINGS", "android.permission.VIBRATE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.ACCESS_WIFI_STATE", "android.permission.WAKE_LOCK", "android.permission.GET_ACCOUNTS", "com.bbk.account.permission.READ_ACCOUNTINFO", "android.permission.AUTHENTICATE_ACCOUNTS", "android.permission.MOUNT_UNMOUNT_FILESYSTEMS", "android.permission.GET_TASKS"};

    /* renamed from: c, reason: collision with root package name */
    private static String[] f45133c = {"com.vivo.push.sdk.service.CommandService", "com.vivo.push.sdk.service.CommonJobService"};

    /* renamed from: d, reason: collision with root package name */
    private static String[] f45134d = {"com.vivo.push.sdk.RegistrationReceiver"};

    /* renamed from: e, reason: collision with root package name */
    private static String[] f45135e = new String[0];

    /* renamed from: f, reason: collision with root package name */
    private static Map<String, Bundle> f45136f = new ConcurrentHashMap();

    public static long a(Context context) {
        String b11 = t.b(context);
        if (!TextUtils.isEmpty(b11)) {
            return a(context, b11);
        }
        p.a("Utility", "systemPushPkgName is null");
        return -1L;
    }

    public static String b(Context context, String str) {
        Object a11 = a(context, str, "com.vivo.push.app_id");
        if (a11 != null) {
            return a11.toString();
        }
        Object a12 = a(context, str, "app_id");
        return a12 != null ? a12.toString() : "";
    }

    public static String c(Context context, String str) {
        Object a11 = a(context, str, "verification_status");
        return a11 != null ? a11.toString() : "";
    }

    private static void d(Context context, String str) throws VivoPushException {
        try {
            if (context.getPackageManager() == null) {
                throw new VivoPushException("localPackageManager is null");
            }
            ServiceInfo[] serviceInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4).services;
            if (serviceInfoArr == null) {
                throw new VivoPushException("serviceInfos is null");
            }
            for (String str2 : f45133c) {
                a(str2, serviceInfoArr, str);
            }
        } catch (Exception e11) {
            throw new VivoPushException("error " + e11.getMessage());
        }
    }

    private static void e(Context context, String str) throws VivoPushException {
        if (f45135e.length <= 0) {
            return;
        }
        try {
            if (context.getPackageManager() == null) {
                throw new VivoPushException("localPackageManager is null");
            }
            ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
            if (activityInfoArr == null) {
                throw new VivoPushException("activityInfos is null");
            }
            for (String str2 : f45135e) {
                a(str2, activityInfoArr, str);
            }
        } catch (Exception e11) {
            throw new VivoPushException("error " + e11.getMessage());
        }
    }

    private static void f(Context context, String str) throws VivoPushException {
        try {
            if (context.getPackageManager() == null) {
                throw new VivoPushException("localPackageManager is null");
            }
            ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 2).receivers;
            if (activityInfoArr == null) {
                throw new VivoPushException("receivers is null");
            }
            for (String str2 : f45134d) {
                a(str2, activityInfoArr, str);
            }
        } catch (Exception e11) {
            throw new VivoPushException(e11.getMessage());
        }
    }

    public static PublicKey c(Context context) {
        Cursor query = context.getContentResolver().query(com.vivo.push.p.f45051a, null, null, null, null);
        if (query == null) {
            return null;
        }
        while (query.moveToNext()) {
            try {
                try {
                    if ("pushkey".equals(query.getString(query.getColumnIndex("name")))) {
                        String string = query.getString(query.getColumnIndex("value"));
                        p.d("Utility", "result key : ".concat(String.valueOf(string)));
                        return u.a(string);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                try {
                    query.close();
                } catch (Exception unused) {
                }
            }
        }
        try {
            query.close();
        } catch (Exception unused2) {
        }
        return null;
    }

    public static long a(Context context, String str) {
        Object a11 = a(context, str, "com.vivo.push.sdk_version");
        if (a11 == null) {
            a11 = a(context, str, "sdk_version");
        }
        if (a11 == null) {
            p.a("Utility", "getSdkVersionCode sdk version is null");
            return -1L;
        }
        try {
            return Long.parseLong(a11.toString());
        } catch (Exception e11) {
            e11.printStackTrace();
            p.a("Utility", "getSdkVersionCode error ", e11);
            return -1L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c7, code lost:
    
        r10 = r10 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.content.Context r23) throws com.vivo.push.util.VivoPushException {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.z.b(android.content.Context):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
    
        if (0 == 0) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(android.content.Context r12) {
        /*
            r1 = 0
            java.lang.String r2 = "close"
            java.lang.String r3 = "Utility"
            r4 = 0
            if (r12 != 0) goto L15
            java.lang.String r12 = "context is null"
            com.vivo.push.util.p.a(r3, r12)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L12
            return r1
        Le:
            r0 = move-exception
            r12 = r0
            goto L7f
        L12:
            r0 = move-exception
            r12 = r0
            goto L76
        L15:
            java.lang.String r0 = r12.getPackageName()     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L12
            android.content.pm.PackageManager r5 = r12.getPackageManager()     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L12
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r0, r1)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L12
            int r5 = r5.versionCode     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L12
            android.content.ContentResolver r6 = r12.getContentResolver()     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L12
            android.net.Uri r7 = com.vivo.push.p.f45052b     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L12
            java.lang.String r9 = "pushVersion = ? and appPkgName = ? and appCode = ? "
            java.lang.String r12 = "323"
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L12
            java.lang.String[] r10 = new java.lang.String[]{r12, r0, r5}     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L12
            r11 = 0
            r8 = 0
            android.database.Cursor r4 = r6.query(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L12
            if (r4 != 0) goto L4e
            java.lang.String r12 = "cursor is null"
            com.vivo.push.util.p.a(r3, r12)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L12
            if (r4 == 0) goto L4d
            r4.close()     // Catch: java.lang.Exception -> L48
            goto L4d
        L48:
            r0 = move-exception
            r12 = r0
            com.vivo.push.util.p.a(r3, r2, r12)
        L4d:
            return r1
        L4e:
            boolean r12 = r4.moveToFirst()     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L12
            if (r12 == 0) goto L6c
            java.lang.String r12 = "permission"
            int r12 = r4.getColumnIndex(r12)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L12
            int r12 = r4.getInt(r12)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L12
            r5 = 1
            r12 = r12 & r5
            if (r12 == 0) goto L6c
            r4.close()     // Catch: java.lang.Exception -> L66
            goto L6b
        L66:
            r0 = move-exception
            r12 = r0
            com.vivo.push.util.p.a(r3, r2, r12)
        L6b:
            return r5
        L6c:
            r4.close()     // Catch: java.lang.Exception -> L70
            goto L7e
        L70:
            r0 = move-exception
            r12 = r0
            com.vivo.push.util.p.a(r3, r2, r12)
            goto L7e
        L76:
            java.lang.String r0 = "isSupport"
            com.vivo.push.util.p.a(r3, r0, r12)     // Catch: java.lang.Throwable -> Le
            if (r4 == 0) goto L7e
            goto L6c
        L7e:
            return r1
        L7f:
            if (r4 == 0) goto L89
            r4.close()     // Catch: java.lang.Exception -> L85
            goto L89
        L85:
            r0 = move-exception
            com.vivo.push.util.p.a(r3, r2, r0)
        L89:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.z.d(android.content.Context):boolean");
    }

    public static Object a(Context context, String str, String str2) {
        Object obj;
        Bundle bundle;
        if (context != null && str2 != null && !TextUtils.isEmpty(str)) {
            try {
                Map<String, Bundle> map = f45136f;
                Object obj2 = (map == null || map.size() <= 0 || (bundle = f45136f.get(str)) == null) ? null : bundle.get(str2);
                if (obj2 != null) {
                    return obj2;
                }
                try {
                    ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
                    r0 = applicationInfo != null ? applicationInfo.metaData : null;
                    obj = r0 != null ? r0.get(str2) : obj2;
                } catch (Exception e11) {
                    e = e11;
                    r0 = obj2;
                }
                try {
                    if (f45136f.size() > 300) {
                        return obj;
                    }
                    f45136f.put(str, r0);
                    return obj;
                } catch (Exception e12) {
                    r0 = obj;
                    e = e12;
                    p.a("Utility", "getMetaValue::".concat(String.valueOf(e)));
                    return r0;
                }
            } catch (Exception e13) {
                e = e13;
            }
        }
        return r0;
    }

    public static Object a(String str, String str2) throws Exception {
        Class<?> cls = Class.forName(str);
        return cls.getField(str2).get(cls);
    }

    private static void a(String str, ComponentInfo[] componentInfoArr, String str2) throws VivoPushException {
        for (ComponentInfo componentInfo : componentInfoArr) {
            if (str.equals(componentInfo.name)) {
                if (componentInfo.enabled) {
                    a(componentInfo, str2);
                    return;
                }
                throw new VivoPushException(componentInfo.name + " module Push-SDK need is illegitmacy !");
            }
        }
        throw new VivoPushException(str + " module Push-SDK need is not exist");
    }

    private static void a(ComponentInfo componentInfo, String str) throws VivoPushException {
        if (componentInfo.applicationInfo.packageName.equals(str)) {
            return;
        }
        for (String str2 : f45131a) {
            if (str2.equals(componentInfo.name) && !componentInfo.processName.contains(":pushservice")) {
                throw new VivoPushException("module : " + componentInfo.name + " process :" + componentInfo.processName + "  check process fail");
            }
        }
    }

    private static void a(Context context, String str, String str2, boolean z11) throws VivoPushException {
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                throw new VivoPushException("localPackageManager is null");
            }
            if (z11) {
                List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 576);
                if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                    throw new VivoPushException("checkModule " + intent + " has no receivers");
                }
                Iterator<ResolveInfo> it = queryBroadcastReceivers.iterator();
                while (it.hasNext()) {
                    if (str2.equals(it.next().activityInfo.name)) {
                        return;
                    }
                }
                throw new VivoPushException(str2 + " is missing");
            }
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 576);
            if (queryIntentServices == null || queryIntentServices.size() <= 0) {
                throw new VivoPushException("checkModule " + intent + " has no services");
            }
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (str2.equals(resolveInfo.serviceInfo.name)) {
                    if (resolveInfo.serviceInfo.exported) {
                        return;
                    }
                    throw new VivoPushException(resolveInfo.serviceInfo.name + " exported is false");
                }
            }
            throw new VivoPushException(str2 + " is missing");
        } catch (Exception e11) {
            p.a("Utility", "error  " + e11.getMessage());
            throw new VivoPushException("checkModule error" + e11.getMessage());
        }
    }

    public static String b(String str, String str2) {
        String str3;
        try {
            str3 = (String) Class.forName("android.os.SystemProperties").getMethod(ct.d.f46852f, String.class).invoke(null, str);
        } catch (Exception e11) {
            e11.printStackTrace();
            str3 = str2;
        }
        return (str3 == null || str3.length() == 0) ? str2 : str3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0068, code lost:
    
        if (0 == 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(android.content.Context r11, java.lang.String r12, java.lang.String r13) {
        /*
            r1 = 0
            java.lang.String r2 = "close"
            java.lang.String r3 = "Utility"
            r4 = 0
            if (r11 != 0) goto L14
            java.lang.String r11 = "context is null"
            com.vivo.push.util.p.a(r3, r11)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            return r1
        Le:
            r0 = move-exception
            r11 = r0
            goto L6c
        L11:
            r0 = move-exception
            r11 = r0
            goto L63
        L14:
            android.content.ContentResolver r5 = r11.getContentResolver()     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            android.net.Uri r6 = com.vivo.push.p.f45053c     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            java.lang.String r8 = "appPkgName = ? and regId = ? sdkVersion = ? "
            java.lang.String r11 = "323"
            java.lang.String[] r9 = new java.lang.String[]{r12, r13, r11}     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            r10 = 0
            r7 = 0
            android.database.Cursor r4 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            if (r4 != 0) goto L3b
            java.lang.String r11 = "cursor is null"
            com.vivo.push.util.p.a(r3, r11)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            if (r4 == 0) goto L3a
            r4.close()     // Catch: java.lang.Exception -> L35
            goto L3a
        L35:
            r0 = move-exception
            r11 = r0
            com.vivo.push.util.p.a(r3, r2, r11)
        L3a:
            return r1
        L3b:
            boolean r11 = r4.moveToFirst()     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            if (r11 == 0) goto L59
            java.lang.String r11 = "clientState"
            int r11 = r4.getColumnIndex(r11)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            java.lang.String r11 = r4.getString(r11)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            boolean r11 = java.lang.Boolean.parseBoolean(r11)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            r4.close()     // Catch: java.lang.Exception -> L53
            return r11
        L53:
            r0 = move-exception
            r12 = r0
            com.vivo.push.util.p.a(r3, r2, r12)
            return r11
        L59:
            r4.close()     // Catch: java.lang.Exception -> L5d
            goto L6b
        L5d:
            r0 = move-exception
            r11 = r0
            com.vivo.push.util.p.a(r3, r2, r11)
            goto L6b
        L63:
            java.lang.String r12 = "isOverdue"
            com.vivo.push.util.p.a(r3, r12, r11)     // Catch: java.lang.Throwable -> Le
            if (r4 == 0) goto L6b
            goto L59
        L6b:
            return r1
        L6c:
            if (r4 == 0) goto L77
            r4.close()     // Catch: java.lang.Exception -> L72
            goto L77
        L72:
            r0 = move-exception
            r12 = r0
            com.vivo.push.util.p.a(r3, r2, r12)
        L77:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.z.b(android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    public static void a(Context context, Intent intent) {
        String b11 = t.b(context);
        String stringExtra = intent.getStringExtra("client_pkgname");
        if (TextUtils.isEmpty(b11)) {
            p.a("Utility", "illegality abe adapter : push pkg is null");
            return;
        }
        if (TextUtils.isEmpty(stringExtra)) {
            p.a("Utility", "illegality abe adapter : src pkg is null");
            return;
        }
        if (b11.equals(context.getPackageName())) {
            p.a("Utility", "illegality abe adapter : abe is not pushservice");
            return;
        }
        if (!b11.equals(stringExtra)) {
            p.d("Utility", "proxy to core : intent pkg : " + intent.getPackage() + " ; src pkg : " + stringExtra + " ; push pkg : " + b11);
            intent.setPackage(b11);
            intent.setClassName(b11, "com.vivo.push.sdk.service.PushService");
            context.startService(intent);
            return;
        }
        p.a("Utility", "illegality abe adapter : pushPkg = " + b11 + " ; srcPkg = " + stringExtra);
    }
}
