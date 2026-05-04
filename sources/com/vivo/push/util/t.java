package com.vivo.push.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.database.Cursor;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f45116a;

    /* renamed from: b, reason: collision with root package name */
    private static String f45117b;

    public static com.vivo.push.model.b a(Context context) {
        com.vivo.push.model.b bVar;
        com.vivo.push.model.b f11;
        Context applicationContext = ContextDelegate.getContext(context).getApplicationContext();
        com.vivo.push.model.b d11 = d(applicationContext);
        if (d11 != null) {
            p.d("PushPackageUtils", "get system push info :".concat(String.valueOf(d11)));
            return d11;
        }
        List<String> e11 = e(applicationContext);
        com.vivo.push.model.b f12 = f(applicationContext, applicationContext.getPackageName());
        if (e11.size() <= 0) {
            if (f12 != null && f12.d()) {
                d11 = f12;
            }
            p.a("PushPackageUtils", "findAllPushPackages error: find no package!");
        } else {
            com.vivo.push.model.b bVar2 = null;
            String a11 = y.b(applicationContext).a("com.vivo.push.cur_pkg", null);
            if (TextUtils.isEmpty(a11) || !a(applicationContext, a11, "com.vivo.pushservice.action.METHOD") || (bVar = f(applicationContext, a11)) == null || !bVar.d()) {
                bVar = null;
            }
            if (f12 == null || !f12.d()) {
                f12 = null;
            }
            if (bVar == null) {
                bVar = null;
            }
            if (f12 == null || (bVar != null && (!f12.c() ? !(bVar.c() || f12.b() > bVar.b()) : !(bVar.c() && f12.b() > bVar.b())))) {
                f12 = bVar;
            }
            HashMap hashMap = new HashMap();
            if (f12 == null) {
                f12 = null;
            } else if (f12.c()) {
                bVar2 = f12;
                f12 = null;
            }
            int size = e11.size();
            for (int i11 = 0; i11 < size; i11++) {
                String str = e11.get(i11);
                if (!TextUtils.isEmpty(str) && (f11 = f(applicationContext, str)) != null) {
                    hashMap.put(str, f11);
                    if (f11.d()) {
                        if (f11.c()) {
                            if (bVar2 == null || f11.b() > bVar2.b()) {
                                bVar2 = f11;
                            }
                        } else if (f12 == null || f11.b() > f12.b()) {
                            f12 = f11;
                        }
                    }
                }
            }
            if (f12 != null) {
                d11 = f12;
            } else {
                p.d("PushPackageUtils", "findSuitablePushPackage, all push app in balck list.");
                d11 = bVar2;
            }
        }
        if (d11 == null) {
            p.b(applicationContext, "查找最优包为空!");
            p.d("PushPackageUtils", "finSuitablePushPackage is null");
            return d11;
        }
        if (d11.c()) {
            p.a(applicationContext, "查找最优包为:" + d11.a() + pn.j.f81006c + d11.b() + ", Black)");
            p.d("PushPackageUtils", "finSuitablePushPackage" + d11.a() + pn.j.f81006c + d11.b() + ", Black)");
            return d11;
        }
        p.a(applicationContext, "查找最优包为:" + d11.a() + pn.j.f81006c + d11.b() + pn.j.f81007d);
        p.d("PushPackageUtils", "finSuitablePushPackage" + d11.a() + pn.j.f81006c + d11.b() + pn.j.f81007d);
        return d11;
    }

    public static String b(Context context) {
        String str;
        Cursor query;
        if (!TextUtils.isEmpty(f45117b)) {
            return f45117b;
        }
        Cursor cursor = null;
        try {
            try {
                try {
                    query = context.getContentResolver().query(com.vivo.push.p.f45051a, null, null, null, null);
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = query;
                        Throwable th3 = th;
                        if (cursor == null) {
                            throw th3;
                        }
                        try {
                            cursor.close();
                            throw th3;
                        } catch (Exception e11) {
                            p.a("PushPackageUtils", "close", e11);
                            throw th3;
                        }
                    }
                } catch (Exception e12) {
                    e = e12;
                    str = null;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e13) {
            p.a("PushPackageUtils", "close", e13);
        }
        if (query != null) {
            boolean z11 = false;
            str = null;
            while (query.moveToNext()) {
                try {
                    if ("pushPkgName".equals(query.getString(query.getColumnIndex("name")))) {
                        str = query.getString(query.getColumnIndex("value"));
                    } else if ("pushEnable".equals(query.getString(query.getColumnIndex("name")))) {
                        z11 = Boolean.parseBoolean(query.getString(query.getColumnIndex("value")));
                    }
                } catch (Exception e14) {
                    e = e14;
                }
            }
            f45117b = str;
            if (TextUtils.isEmpty(str)) {
                try {
                    query.close();
                } catch (Exception e15) {
                    p.a("PushPackageUtils", "close", e15);
                }
                return null;
            }
            if (z11) {
                query.close();
                return str;
            }
            try {
                query.close();
            } catch (Exception e16) {
                p.a("PushPackageUtils", "close", e16);
            }
            return null;
        }
        try {
            p.a("PushPackageUtils", "cursor is null");
            if (query != null) {
                try {
                    query.close();
                } catch (Exception e17) {
                    p.a("PushPackageUtils", "close", e17);
                }
            }
            return null;
        } catch (Exception e18) {
            e = e18;
            str = null;
        }
        cursor = query;
        p.a("PushPackageUtils", "getSystemPush", e);
        if (cursor != null) {
            cursor.close();
        }
        return str;
    }

    public static boolean c(Context context, String str) {
        return a(context, str, "com.vivo.pushclient.action.RECEIVE");
    }

    private static com.vivo.push.model.b d(Context context) {
        String b11 = b(context);
        ApplicationInfo applicationInfo = null;
        if (TextUtils.isEmpty(b11)) {
            return null;
        }
        com.vivo.push.model.b bVar = new com.vivo.push.model.b(b11);
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(b11, 128);
            if (packageInfo != null) {
                bVar.a(packageInfo.versionCode);
                bVar.a(packageInfo.versionName);
                applicationInfo = packageInfo.applicationInfo;
            }
            if (applicationInfo != null) {
                bVar.a(z.a(context, b11));
            }
            bVar.a(a(context, bVar.b()));
            bVar.b(a(context, b11));
            return bVar;
        } catch (Exception e11) {
            e11.printStackTrace();
            p.b("PushPackageUtils", "PackageManager NameNotFoundException is null", e11);
            return null;
        }
    }

    public static boolean e(Context context, String str) {
        return a(context, str, "com.vivo.pushservice.action.METHOD");
    }

    private static com.vivo.push.model.b f(Context context, String str) {
        ApplicationInfo applicationInfo;
        if (!TextUtils.isEmpty(str) && (a(context, str, "com.vivo.pushservice.action.METHOD") || a(context, str, "com.vivo.pushservice.action.RECEIVE"))) {
            com.vivo.push.model.b bVar = new com.vivo.push.model.b(str);
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 128);
                if (packageInfo != null) {
                    bVar.a(packageInfo.versionCode);
                    bVar.a(packageInfo.versionName);
                    applicationInfo = packageInfo.applicationInfo;
                } else {
                    applicationInfo = null;
                }
                if (applicationInfo != null) {
                    bVar.a(z.a(context, str));
                }
                bVar.b(a(context, str));
                bVar.a(a(context, bVar.b()));
                return bVar;
            } catch (Exception e11) {
                p.a("PushPackageUtils", "getPushPackageInfo exception: ", e11);
            }
        }
        return null;
    }

    private static String g(Context context, String str) {
        if (!TextUtils.isEmpty(str) && context != null) {
            try {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
                byte[] digest = MessageDigest.getInstance("SHA256").digest(signatureArr[0].toByteArray());
                StringBuffer stringBuffer = new StringBuffer();
                for (byte b11 : digest) {
                    String upperCase = Integer.toHexString(b11 & 255).toUpperCase(Locale.US);
                    if (upperCase.length() == 1) {
                        stringBuffer.append("0");
                    }
                    stringBuffer.append(upperCase);
                }
                return stringBuffer.toString();
            } catch (Exception e11) {
                p.a("PushPackageUtils", " getSignatureSHA exception ".concat(String.valueOf(e11)));
            }
        }
        return null;
    }

    public static boolean c(Context context) {
        ProviderInfo resolveContentProvider;
        Boolean bool = f45116a;
        if (bool != null) {
            return bool.booleanValue();
        }
        String str = null;
        if (context != null && !TextUtils.isEmpty("com.vivo.push.sdk.service.SystemPushConfig") && (resolveContentProvider = context.getPackageManager().resolveContentProvider("com.vivo.push.sdk.service.SystemPushConfig", 128)) != null) {
            str = resolveContentProvider.packageName;
        }
        boolean equals = "BCC35D4D3606F154F0402AB7634E8490C0B244C2675C3C6238986987024F0C02".equals(g(context, str));
        f45116a = Boolean.valueOf(equals);
        return equals;
    }

    private static List<String> e(Context context) {
        List<ResolveInfo> list;
        g.a("findAllCoreClientPush");
        ArrayList arrayList = new ArrayList();
        try {
            list = context.getPackageManager().queryIntentServices(new Intent("com.vivo.pushservice.action.PUSH_SERVICE"), 576);
        } catch (Exception unused) {
            list = null;
        }
        if (list != null && list.size() > 0) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                ResolveInfo resolveInfo = list.get(i11);
                if (resolveInfo != null) {
                    String str = resolveInfo.serviceInfo.packageName;
                    if (!TextUtils.isEmpty(str)) {
                        arrayList.add(str);
                    }
                }
            }
        }
        if (arrayList.size() <= 0) {
            p.d("PushPackageUtils", "get all push packages is null");
        }
        return arrayList;
    }

    public static boolean d(Context context, String str) {
        return a(context, str, "com.vivo.pushservice.action.RECEIVE");
    }

    public static int b(Context context, String str) {
        int i11 = a(context, str, "com.vivo.pushservice.action.RECEIVE") ? 0 : -1;
        if (a(context, str, "com.vivo.pushclient.action.RECEIVE")) {
            return 1;
        }
        return i11;
    }

    public static boolean a(Context context, String str) {
        ServiceInfo serviceInfo;
        if (!TextUtils.isEmpty(str) && context != null) {
            Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
            intent.setPackage(str);
            PackageManager packageManager = context.getPackageManager();
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 576);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                int size = queryIntentServices.size();
                boolean z11 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    ResolveInfo resolveInfo = queryIntentServices.get(i11);
                    if (resolveInfo != null && (serviceInfo = resolveInfo.serviceInfo) != null) {
                        String str2 = serviceInfo.name;
                        boolean z12 = serviceInfo.exported;
                        if ("com.vivo.push.sdk.service.PushService".equals(str2) && z12) {
                            boolean z13 = resolveInfo.serviceInfo.enabled;
                            int componentEnabledSetting = packageManager.getComponentEnabledSetting(new ComponentName(str, "com.vivo.push.sdk.service.PushService"));
                            z11 = componentEnabledSetting == 1 || (componentEnabledSetting == 0 && z13);
                        }
                    }
                }
                return z11;
            }
            p.a("PushPackageUtils", "isEnablePush error: can not find push service.");
        }
        return false;
    }

    private static boolean a(Context context, long j11) {
        com.vivo.push.cache.d a11 = com.vivo.push.cache.b.a().a(context);
        if (a11 != null) {
            return a11.isInBlackList(j11);
        }
        return false;
    }

    private static boolean a(Context context, String str, String str2) {
        List<ResolveInfo> list;
        Intent intent = new Intent(str2);
        intent.setPackage(str);
        try {
            list = context.getPackageManager().queryBroadcastReceivers(intent, 576);
        } catch (Exception unused) {
            list = null;
        }
        return list != null && list.size() > 0;
    }
}
