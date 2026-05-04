package com.igexin.push.g;

import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PowerManager;
import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.igexin.sdk.GTIntentService;
import com.igexin.sdk.GetuiPushException;
import com.igexin.sdk.PushService;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f38621a = "CheckUtils";

    /* renamed from: b, reason: collision with root package name */
    private static Integer f38622b = null;

    /* renamed from: c, reason: collision with root package name */
    private static final String f38623c = "checkOpNoThrow";

    /* renamed from: d, reason: collision with root package name */
    private static final String f38624d = "OP_POST_NOTIFICATION";

    /* renamed from: e, reason: collision with root package name */
    private static final ServiceConnection f38625e = new ServiceConnection() { // from class: com.igexin.push.g.c.1
        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }
    };

    public static void a(Context context, Intent intent) {
        try {
            if (Build.VERSION.SDK_INT < 26 || !g()) {
                context.getApplicationContext().startService(intent);
            } else {
                c(intent, context);
            }
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            com.igexin.c.a.c.a.a("CheckUtils|startPService err：" + th2.toString(), new Object[0]);
            if (th2 instanceof IllegalStateException) {
                c(intent, context);
            }
        }
    }

    public static boolean b() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) com.igexin.push.core.e.f38035l.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.getType() == 1;
    }

    public static void c() {
        NetworkInfo.State state = ((ConnectivityManager) com.igexin.push.core.e.f38035l.getSystemService("connectivity")).getNetworkInfo(1).getState();
        if (state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING) {
            com.igexin.push.core.e.f38047x = 1;
        } else {
            com.igexin.push.core.e.f38047x = 0;
        }
    }

    public static void d() {
        com.igexin.push.core.e.f38048y = ((PowerManager) com.igexin.push.core.e.f38035l.getSystemService(c6.d.f8118j)).isScreenOn() ? 1 : 0;
    }

    public static boolean e() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) com.igexin.push.core.e.f38035l.getSystemService("connectivity");
            if (connectivityManager == null) {
                com.igexin.c.a.c.a.a("CheckUtils|ConnectivityManager is null", new Object[0]);
                return false;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            com.igexin.c.a.c.a.a("CheckUtils|activeNetworkInfo = ".concat(String.valueOf(activeNetworkInfo)), new Object[0]);
            if (activeNetworkInfo == null || activeNetworkInfo.getState() != NetworkInfo.State.CONNECTED) {
                com.igexin.c.a.c.a.a("CheckUtils|network available = false", new Object[0]);
                return false;
            }
            com.igexin.c.a.c.a.a(f38621a + (activeNetworkInfo.getType() == 0 ? "mobile" : activeNetworkInfo.getType() == 1 ? "wifi" : "none") + "|connected", new Object[0]);
            return true;
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.b(f38621a, "network available ex =" + th2.toString());
            com.igexin.c.a.c.a.a(th2);
            return false;
        }
    }

    public static boolean f() {
        return System.currentTimeMillis() >= 1182566108138L;
    }

    public static boolean g() {
        int i11;
        String str = com.igexin.push.config.d.P;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            for (String str2 : str.split(",")) {
                if (str2.contains(HiAnalyticsConstant.REPORT_VAL_SEPARATOR) && str2.contains(Constants.WAVE_SEPARATOR)) {
                    String substring = str2.substring(0, str2.indexOf(HiAnalyticsConstant.REPORT_VAL_SEPARATOR));
                    String[] split = str2.substring(str2.indexOf(HiAnalyticsConstant.REPORT_VAL_SEPARATOR) + 1).split(Constants.WAVE_SEPARATOR);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (Build.BRAND.equalsIgnoreCase(substring) && (i11 = Build.VERSION.SDK_INT) >= parseInt && i11 <= parseInt2) {
                            return true;
                        }
                    } else {
                        continue;
                    }
                }
            }
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
        return false;
    }

    private static String h() {
        return null;
    }

    private static void a(Map<String, com.igexin.push.core.b.f> map, String str) {
        com.igexin.push.core.b.f fVar = map.get(str);
        map.remove(str);
        for (String str2 : fVar.f37789b) {
            com.igexin.push.core.b.f fVar2 = map.get(str2);
            if (fVar2 != null) {
                int i11 = fVar2.f37790c - 1;
                fVar2.f37790c = i11;
                if (i11 == 0) {
                    a(map, str2);
                }
            }
        }
    }

    public static boolean b(Context context) {
        try {
            return ((Boolean) NotificationManager.class.getDeclaredMethod("areNotificationsEnabled", null).invoke((NotificationManager) context.getSystemService("notification"), null)).booleanValue();
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return true;
        }
    }

    public static void c(Context context) throws GetuiPushException {
        if (context == null) {
            throw new GetuiPushException("传入的context为空");
        }
        Context applicationContext = context.getApplicationContext();
        if (a(applicationContext)) {
            ServiceInfo serviceInfo = (ServiceInfo) d.a(applicationContext, PushService.class).first;
            if (serviceInfo == null) {
                throw new GetuiPushException("未找到继承 com.igexin.sdk.PushService 的子类");
            }
            if (!TextUtils.isEmpty(serviceInfo.permission)) {
                throw new GetuiPushException("自定义推送服务(Service)不能配置android:permission");
            }
            if (((ServiceInfo) d.a(applicationContext, GTIntentService.class).first) == null) {
                throw new GetuiPushException("未找到继承 com.igexin.sdk.GTIntentService 的子类");
            }
            try {
                PackageInfo packageInfo = applicationContext.getApplicationContext().getPackageManager().getPackageInfo(applicationContext.getApplicationContext().getPackageName(), 4229);
                if (packageInfo == null) {
                    return;
                }
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                if (applicationInfo == null) {
                    throw new GetuiPushException("ApplicationInfo 应用异常");
                }
                if (applicationInfo.metaData != null) {
                    String a11 = d.a(applicationInfo);
                    if (TextUtils.isEmpty(a11)) {
                        a11 = applicationInfo.metaData.getString(com.igexin.push.core.b.f37730b);
                    }
                    if (TextUtils.isEmpty(a11) && TextUtils.isEmpty(applicationInfo.metaData.getString("GETUI_APPID"))) {
                        throw new GetuiPushException("未配置个推APPID");
                    }
                } else if (TextUtils.isEmpty(d.a(applicationInfo))) {
                    throw new GetuiPushException("未配置META-DATA");
                }
                String[] strArr = packageInfo.requestedPermissions;
                if (strArr == null || strArr.length == 0) {
                    throw new GetuiPushException("Manifest中无权限配置");
                }
                List asList = Arrays.asList(strArr);
                if (!asList.contains("android.permission.INTERNET")) {
                    throw new GetuiPushException("未在Manifest中配置所需权限：android.permission.INTERNET");
                }
                if (!asList.contains("android.permission.READ_PHONE_STATE")) {
                    throw new GetuiPushException("未在Manifest中配置所需权限：android.permission.READ_PHONE_STATE");
                }
                if (!asList.contains(yk.e.f100168b)) {
                    throw new GetuiPushException("未在Manifest中配置所需权限：android.permission.ACCESS_NETWORK_STATE");
                }
                if (!asList.contains("android.permission.ACCESS_WIFI_STATE")) {
                    throw new GetuiPushException("未在Manifest中配置所需权限：android.permission.ACCESS_WIFI_STATE");
                }
                if (!asList.contains("android.permission.VIBRATE")) {
                    throw new GetuiPushException("未在Manifest中配置所需权限：android.permission.VIBRATE");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
    }

    private static boolean d(Context context) {
        Bundle bundle;
        try {
            ApplicationInfo b11 = n.b(context);
            if (b11 == null || (bundle = b11.metaData) == null) {
                return false;
            }
            return !TextUtils.isEmpty(bundle.getString("GETUI_APPID"));
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return false;
        }
    }

    public static boolean a() {
        return System.currentTimeMillis() > com.igexin.push.config.d.f37584d;
    }

    public static boolean b(Intent intent, Context context) {
        if (intent != null && context != null) {
            try {
                ActivityInfo[] activityInfoArr = context.getApplicationContext().getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 1).activities;
                if (activityInfoArr != null && activityInfoArr.length != 0) {
                    for (ActivityInfo activityInfo : activityInfoArr) {
                        if (intent.getComponent() != null && activityInfo.name.equals(intent.getComponent().getClassName())) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (Throwable th2) {
                com.igexin.c.a.c.a.a(th2);
            }
        }
        return false;
    }

    private static void c(Intent intent, Context context) {
        com.igexin.c.a.c.a.a("CheckUtils|startPService by bind", new Object[0]);
        intent.setType("PB-" + System.nanoTime());
        context.getApplicationContext().bindService(intent, f38625e, 1);
    }

    public static boolean d(String str) {
        try {
            if (Build.VERSION.SDK_INT >= 28 && a(com.igexin.push.core.e.f38035l)) {
                return false;
            }
            k.a(str, 0);
            com.igexin.c.a.c.a.b(f38621a, "checkApp by GtPm");
            return true;
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(f38621a, e11.toString());
            com.igexin.c.a.c.a.b(f38621a, "checkApp by GtPm");
            return false;
        }
    }

    public static boolean a(long j11) {
        if (com.igexin.push.config.d.f37583c == 0) {
            return false;
        }
        Date date = new Date(j11);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i11 = calendar.get(11);
        int i12 = com.igexin.push.config.d.f37582b + com.igexin.push.config.d.f37583c;
        if (i12 >= 24) {
            i12 -= 24;
        }
        int i13 = com.igexin.push.config.d.f37582b;
        if (i13 < i12) {
            if (i11 >= i13 && i11 < i12) {
                return true;
            }
        } else if (i13 > i12) {
            if (i11 >= 0 && i11 < i12) {
                return true;
            }
            if (i11 >= i13 && i11 < 24) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(String str) {
        try {
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
        if (!TextUtils.isEmpty(com.igexin.push.config.d.C) && !"none".equals(com.igexin.push.config.d.C)) {
            List asList = Arrays.asList(com.igexin.push.config.d.C.split(","));
            if (asList.isEmpty()) {
                return false;
            }
            Iterator it = asList.iterator();
            while (it.hasNext()) {
                if (str.startsWith((String) it.next())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static boolean c(String str) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(com.igexin.push.config.d.F) && !"none".equals(com.igexin.push.config.d.F)) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(Arrays.asList(com.igexin.push.config.d.F.split(",")));
                if (arrayList.isEmpty()) {
                    return false;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (str.contains((String) it.next())) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return false;
        }
    }

    public static boolean a(Context context) {
        if (f38622b == null) {
            f38622b = (context.getApplicationInfo().flags & 2) == 0 ? -1 : 1;
        }
        return f38622b.intValue() > 0;
    }

    public static boolean a(Intent intent, Context context) {
        if (context == null) {
            return false;
        }
        try {
            ServiceInfo[] serviceInfoArr = context.getApplicationContext().getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 4).services;
            if (serviceInfoArr != null && serviceInfoArr.length != 0) {
                for (ServiceInfo serviceInfo : serviceInfoArr) {
                    if (intent.getComponent() != null && serviceInfo.name.equals(intent.getComponent().getClassName())) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return false;
        }
    }

    public static boolean a(String str) {
        try {
            return com.igexin.push.core.e.f38035l.getPackageManager().getLaunchIntentForPackage(str) != null;
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        if (r8.has("do") != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(org.json.JSONObject r14) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.g.c.a(org.json.JSONObject):boolean");
    }
}
