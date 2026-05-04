package com.xiaomi.push;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.baicizhan.client.framework.network.http.HttpRequest;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes8.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static String f45975a = null;

    /* renamed from: a, reason: collision with other field name */
    private static final Set<String> f631a;

    /* renamed from: a, reason: collision with other field name */
    private static boolean f632a = false;

    /* renamed from: b, reason: collision with root package name */
    private static String f45976b = null;

    /* renamed from: c, reason: collision with root package name */
    private static String f45977c = "";

    /* renamed from: d, reason: collision with root package name */
    private static String f45978d;

    /* renamed from: e, reason: collision with root package name */
    private static String f45979e;

    /* renamed from: f, reason: collision with root package name */
    private static final String f45980f = String.valueOf((char) 2);

    /* renamed from: a, reason: collision with other field name */
    private static final String[] f633a = {HttpRequest.f17578o, "a-", "u-", "v-", "o-", "g-"};

    static {
        HashSet hashSet = new HashSet();
        f631a = hashSet;
        hashSet.add("com.xiaomi.xmsf");
        hashSet.add("com.xiaomi.finddevice");
        hashSet.add("com.miui.securitycenter");
        f632a = true;
    }

    private static double a(double d11) {
        int i11 = 1;
        while (true) {
            double d12 = i11;
            if (d12 >= d11) {
                return d12;
            }
            i11 <<= 1;
        }
    }

    public static int b() {
        BufferedReader bufferedReader;
        Throwable th2;
        String[] split;
        int i11 = 0;
        if (new File("/proc/meminfo").exists()) {
            BufferedReader bufferedReader2 = null;
            try {
                try {
                    bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
                } catch (IOException unused) {
                }
                try {
                    String readLine = bufferedReader.readLine();
                    if (!TextUtils.isEmpty(readLine) && (split = readLine.split("\\s+")) != null && split.length >= 2 && TextUtils.isDigitsOnly(split[1])) {
                        i11 = Integer.parseInt(split[1]);
                    }
                    bufferedReader.close();
                } catch (Exception unused2) {
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        bufferedReader2.close();
                    }
                    return i11;
                } catch (Throwable th3) {
                    th2 = th3;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th2;
                }
            } catch (Exception unused4) {
            } catch (Throwable th4) {
                bufferedReader = null;
                th2 = th4;
            }
        }
        return i11;
    }

    public static String c() {
        return b() + "KB";
    }

    public static String d() {
        return (a(Environment.getDataDirectory()) / 1024) + "KB";
    }

    @Deprecated
    public static String e(Context context) {
        return null;
    }

    @Deprecated
    public static String f(Context context) {
        return "";
    }

    public static synchronized String g(Context context) {
        synchronized (i.class) {
            String str = f45979e;
            if (str != null) {
                return str;
            }
            String b11 = bo.b(b(context) + a(context));
            f45979e = b11;
            return b11;
        }
    }

    public static synchronized String h(Context context) {
        String b11;
        synchronized (i.class) {
            b11 = bo.b(b(context) + ((String) null));
        }
        return b11;
    }

    public static String i(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getSimOperatorName();
    }

    @Deprecated
    private static String j(Context context) {
        return "";
    }

    private static float a(int i11) {
        float f11 = (((((i11 + 102400) / 524288) + 1) * 524288) / 1024.0f) / 1024.0f;
        double d11 = f11;
        return d11 > 0.5d ? (float) Math.ceil(d11) : f11;
    }

    /* renamed from: b, reason: collision with other method in class */
    public static String m6070b() {
        return a(((a(Environment.getDataDirectory()) / 1024.0d) / 1024.0d) / 1024.0d) + "GB";
    }

    @Deprecated
    public static String c(Context context) {
        return null;
    }

    @Deprecated
    public static String d(Context context) {
        return null;
    }

    @TargetApi(17)
    public static int a() {
        Object a11 = bj.a("android.os.UserHandle", "myUserId", new Object[0]);
        if (a11 == null) {
            return -1;
        }
        return ((Integer) Integer.class.cast(a11)).intValue();
    }

    public static String b(Context context) {
        String str = f45976b;
        if (str != null || !f632a) {
            return str;
        }
        boolean m6072c = m6072c(context);
        f632a = m6072c;
        if (!m6072c) {
            return null;
        }
        try {
            f45976b = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable th2) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("failure to get androidId: " + th2);
        }
        return f45976b;
    }

    /* renamed from: c, reason: collision with other method in class */
    private static boolean m6072c(Context context) {
        if ("com.xiaomi.xmsf".equals(context.getPackageName())) {
            return true;
        }
        Intent intent = new Intent();
        ComponentName componentName = new ComponentName(context.getPackageName(), "com.xiaomi.push.service.XMPushService");
        intent.setComponent(componentName);
        try {
            Bundle bundle = context.getPackageManager().getServiceInfo(componentName, 128).metaData;
            if (bundle != null) {
                String string = bundle.getString("supportGetAndroidID");
                if (TextUtils.isEmpty(string)) {
                    return true;
                }
                return Boolean.parseBoolean(string);
            }
        } catch (Exception unused) {
        }
        return true;
    }

    private static long a(File file) {
        StatFs statFs = new StatFs(file.getPath());
        return statFs.getBlockSizeLong() * statFs.getBlockCountLong();
    }

    /* renamed from: b, reason: collision with other method in class */
    public static boolean m6071b(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService(c6.d.f8118j);
        return powerManager == null || powerManager.isScreenOn();
    }

    /* renamed from: a, reason: collision with other method in class */
    public static String m6067a() {
        return a(b()) + "GB";
    }

    private static boolean b(String str) {
        if (str == null) {
            return true;
        }
        String trim = str.trim();
        return trim.length() == 0 || trim.equalsIgnoreCase("null") || trim.equalsIgnoreCase("unknown");
    }

    /* renamed from: a, reason: collision with other method in class */
    private static String m6068a(int i11) {
        if (i11 > 0) {
            String[] strArr = f633a;
            if (i11 < strArr.length) {
                return strArr[i11];
            }
        }
        return f633a[0];
    }

    @Deprecated
    public static String a(Context context) {
        return null;
    }

    public static String a(Context context, boolean z11) {
        int i11;
        if (f45978d == null) {
            String b11 = b(context);
            String c11 = !j.m6177d() ? z11 ? c(context) : j(context) : "";
            String a11 = a(context);
            if (Build.VERSION.SDK_INT >= 26 && b(c11) && b(a11)) {
                String b12 = az.a(context).b();
                if (TextUtils.isEmpty(b12)) {
                    String mo5724a = az.a(context).mo5724a();
                    if (TextUtils.isEmpty(mo5724a) || mo5724a.startsWith("00000000-0000-0000-0000-000000000000")) {
                        i11 = 5;
                    } else {
                        b11 = mo5724a;
                        i11 = 4;
                    }
                } else {
                    b11 = b12 + b11;
                    i11 = 2;
                }
            } else {
                b11 = c11 + b11 + a11;
                i11 = 1;
            }
            com.xiaomi.channel.commonutils.logger.b.b("devid rule select:" + i11);
            if (i11 == 3) {
                f45978d = b11;
            } else {
                f45978d = m6068a(i11) + bo.b(b11);
            }
        }
        return f45978d;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m6069a(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return false;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    public static boolean a(Context context, String str) {
        ApplicationInfo applicationInfo;
        PackageInfo packageInfo = (PackageInfo) bj.a((Object) context.getPackageManager(), "getPackageInfoAsUser", str, 0, 999);
        if (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null) {
            return true;
        }
        int i11 = applicationInfo.flags;
        return (i11 & 2097152) == 2097152 && (i11 & 8388608) != 8388608;
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int i11 = 0;
        while (true) {
            String[] strArr = f633a;
            if (i11 >= strArr.length) {
                return false;
            }
            if (str.startsWith(strArr[i11])) {
                return true;
            }
            i11++;
        }
    }
}
