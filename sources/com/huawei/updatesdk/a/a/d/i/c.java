package com.huawei.updatesdk.a.a.d.i;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.baicizhan.client.business.util.DeviceUtil;
import com.huawei.android.app.PackageManagerEx;
import com.huawei.hms.android.SystemUtils;
import com.huawei.system.BuildEx;
import com.huawei.updatesdk.a.a.d.f;
import g80.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: e, reason: collision with root package name */
    private static int f36828e = -1;

    /* renamed from: a, reason: collision with root package name */
    private int f36834a;

    /* renamed from: b, reason: collision with root package name */
    private int f36835b;

    /* renamed from: c, reason: collision with root package name */
    private int f36836c;

    /* renamed from: f, reason: collision with root package name */
    private static c f36829f = new c();

    /* renamed from: g, reason: collision with root package name */
    private static String f36830g = null;

    /* renamed from: d, reason: collision with root package name */
    public static final String f36827d = a(SystemUtils.PRODUCT_BRAND, "");

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f36831h = a("hw_sc.product.useBrandCust", false);

    /* renamed from: i, reason: collision with root package name */
    public static final int f36832i = a("hw_sc.build.os.apiversion", 0);

    /* renamed from: j, reason: collision with root package name */
    public static final String f36833j = h();

    private c() {
        this.f36834a = 0;
        if (a("ro.maple.enable", 0) == 1) {
            this.f36834a = 1;
        }
        this.f36835b = a("ro.build.version.ark", 0);
        this.f36836c = a("ro.kernel.evox", 0);
    }

    public static String d() {
        try {
            Object obj = Class.forName("com.huawei.system.BuildEx").getField("DISPLAY").get(null);
            return obj == null ? Build.DISPLAY : obj.toString();
        } catch (Throwable unused) {
            return Build.DISPLAY;
        }
    }

    public static int e() {
        int i11 = f36828e;
        if (i11 >= 0) {
            return i11;
        }
        Context a11 = com.huawei.updatesdk.a.b.a.a.c().a();
        f36828e = k(a11) ? 1 : l(a11) ? 2 : h(a11) ? 3 : m() ? 4 : i(a11) ? 7 : 0;
        return f36828e;
    }

    public static int f(Context context) {
        try {
            return Integer.parseInt(context.getPackageManager().getPackageInfo(context.getPackageName(), 16).versionCode + "");
        } catch (Exception unused) {
            return 1;
        }
    }

    public static String g() {
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        String country = locale.getCountry();
        String variant = locale.getVariant();
        String script = locale.getScript();
        if (TextUtils.isEmpty(script) && TextUtils.isEmpty(variant)) {
            return language + "_" + country;
        }
        return language + "_" + script + "_" + country + "_" + variant;
    }

    private static String h() {
        try {
            return BuildEx.getOsBrand();
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean i(Context context) {
        return context.getPackageManager().hasSystemFeature("com.huawei.software.features.car");
    }

    public static int j() {
        return a("ro.product.cpu.abi", "").contains(h.f53501g) ? 2 : 1;
    }

    public static String k() {
        String str;
        String str2;
        String str3;
        Locale locale = Locale.getDefault();
        if (locale != null) {
            str = locale.getLanguage();
            str2 = locale.getScript();
            str3 = locale.getCountry();
        } else {
            str = "en";
            str2 = "";
            str3 = "US";
        }
        if (TextUtils.isEmpty(str2)) {
            return str + "_" + str3;
        }
        return str + "_" + str2 + "_" + str3;
    }

    public static boolean l() {
        return com.huawei.updatesdk.b.h.a.f().a() > 0 || com.huawei.updatesdk.b.h.a.f().b() > 0;
    }

    private static boolean m() {
        return a("com.huawei.software.features.kidpad");
    }

    public int a() {
        return this.f36834a;
    }

    public int b() {
        return this.f36835b;
    }

    public int c() {
        return this.f36836c;
    }

    public static int a(String str, int i11) {
        try {
            return ((Integer) Class.forName("android.os.SystemProperties").getMethod("getInt", String.class, Integer.TYPE).invoke(null, str, Integer.valueOf(i11))).intValue();
        } catch (Throwable th2) {
            com.huawei.updatesdk.a.a.c.a.a.a.a(DeviceUtil.TAG, "Exception while getting system property: ", th2);
            return i11;
        }
    }

    private static DisplayMetrics b(Context context) {
        Display defaultDisplay;
        Object systemService = context.getSystemService("window");
        WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
        if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return null;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static List<String> c(Context context) {
        ArrayList arrayList = new ArrayList();
        LocaleList locales = context.getResources().getConfiguration().getLocales();
        for (int i11 = 0; i11 < locales.size(); i11++) {
            String language = locales.get(i11).getLanguage();
            if (!TextUtils.isEmpty(language) && !arrayList.contains(language)) {
                arrayList.add(language);
            }
        }
        return arrayList;
    }

    public static String d(Context context) {
        DisplayMetrics b11 = b(context);
        if (b11 == null) {
            return "";
        }
        return String.valueOf(b11.widthPixels) + "_" + String.valueOf(b11.heightPixels);
    }

    public static String e(Context context) {
        DisplayMetrics b11 = b(context);
        return b11 != null ? String.valueOf(b11.densityDpi) : "";
    }

    public static c f() {
        return f36829f;
    }

    public static String g(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16).versionName + "";
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean h(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static String[] i() {
        String[] strArr = Build.SUPPORTED_ABIS;
        return strArr == null ? new String[0] : strArr;
    }

    public static boolean j(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            packageManager.getPackageInfo("com.google.android.gsf.login", 16);
            packageManager.getPackageInfo("com.google.android.gsf", 16);
            return (packageManager.getPackageInfo("com.google.android.gms", 16).applicationInfo.flags & 1) != 0;
        } catch (Exception e11) {
            com.huawei.updatesdk.a.a.c.a.a.a.d(DeviceUtil.TAG, e11.getMessage());
            return false;
        }
    }

    private static boolean k(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        com.huawei.updatesdk.a.a.a.b(DeviceUtil.TAG, "UI mode: " + uiModeManager.getCurrentModeType());
        return uiModeManager.getCurrentModeType() == 4;
    }

    private static boolean l(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    public static String a(Context context) {
        if (f36830g == null) {
            ArrayList arrayList = new ArrayList();
            a(context, arrayList);
            a(arrayList);
            f36830g = f.a(arrayList, ",");
        }
        return f36830g;
    }

    public static String b(Context context, String str) {
        String a11 = a(context, str);
        int i11 = 0;
        int i12 = 0;
        while (i11 < a11.length() && i12 < 3) {
            if (a11.charAt(i11) == '.') {
                i12++;
            }
            i11++;
        }
        return 3 == i12 ? a11.substring(0, i11 - 1) : a11;
    }

    public static String a(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 16).versionName + "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static String a(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod(ct.d.f46852f, String.class, String.class).invoke(null, str, str2);
        } catch (Throwable th2) {
            com.huawei.updatesdk.a.a.c.a.a.a.a(DeviceUtil.TAG, "Exception while getting system property: ", th2);
            return str2;
        }
    }

    public static List<String> a(List<String> list, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!a(str, strArr)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    private static void a(Context context, List<String> list) {
        a(context.getPackageManager().getSystemAvailableFeatures(), list);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #0 {all -> 0x0028, blocks: (B:10:0x001d, B:12:0x0024, B:13:0x002a, B:16:0x0043, B:18:0x004c, B:20:0x0060, B:24:0x0037), top: B:9:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.view.Window r5) {
        /*
            r4 = this;
            com.huawei.updatesdk.b.h.a r0 = com.huawei.updatesdk.b.h.a.f()
            int r0 = r0.a()
            r1 = 21
            if (r0 >= r1) goto L16
            com.huawei.updatesdk.b.h.a r0 = com.huawei.updatesdk.b.h.a.f()
            int r0 = r0.b()
            if (r0 <= 0) goto L4b
        L16:
            if (r5 != 0) goto L19
            goto L4b
        L19:
            android.view.WindowManager$LayoutParams r5 = r5.getAttributes()
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L28
            r1 = 28
            r2 = 1
            if (r0 < r1) goto L2a
            androidx.activity.n.a(r5, r2)     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
            r5 = move-exception
            goto L76
        L2a:
            com.huawei.updatesdk.b.h.a r0 = com.huawei.updatesdk.b.h.a.f()     // Catch: java.lang.Throwable -> L28
            int r0 = r0.a()     // Catch: java.lang.Throwable -> L28
            if (r0 <= 0) goto L37
            java.lang.String r0 = "com.huawei.android.view.WindowManagerEx$LayoutParamsEx"
            goto L43
        L37:
            com.huawei.updatesdk.b.h.a r0 = com.huawei.updatesdk.b.h.a.f()     // Catch: java.lang.Throwable -> L28
            int r0 = r0.b()     // Catch: java.lang.Throwable -> L28
            if (r0 <= 0) goto L48
            java.lang.String r0 = "com.hihonor.android.view.WindowManagerEx$LayoutParamsEx"
        L43:
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L28
            goto L49
        L48:
            r0 = 0
        L49:
            if (r0 != 0) goto L4c
        L4b:
            return
        L4c:
            java.lang.Class<android.view.WindowManager$LayoutParams> r1 = android.view.WindowManager.LayoutParams.class
            java.lang.Class[] r1 = new java.lang.Class[]{r1}     // Catch: java.lang.Throwable -> L28
            java.lang.reflect.Constructor r1 = r0.getConstructor(r1)     // Catch: java.lang.Throwable -> L28
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L28
            java.lang.Object r5 = r1.newInstance(r5)     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = "setDisplaySideMode"
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L28
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> L28
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Throwable -> L28
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L28
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L28
            r0.invoke(r5, r1)     // Catch: java.lang.Throwable -> L28
            return
        L76:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setWindowDisplaySideMode exception: "
            r0.append(r1)
            java.lang.String r5 = r5.getMessage()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "DeviceUtil"
            com.huawei.updatesdk.a.a.c.a.a.a.b(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.a.a.d.i.c.a(android.view.Window):void");
    }

    private static void a(List<String> list) {
        try {
            a(PackageManagerEx.getHwSystemAvailableFeatures(), list);
        } catch (Throwable th2) {
            com.huawei.updatesdk.a.a.c.a.a.a.c(DeviceUtil.TAG, "initHwDeviceFeatures: " + th2.getMessage());
        }
    }

    private static void a(FeatureInfo[] featureInfoArr, List<String> list) {
        if (featureInfoArr != null) {
            for (FeatureInfo featureInfo : featureInfoArr) {
                String str = featureInfo.name;
                if (str != null) {
                    list.add(com.huawei.updatesdk.a.a.d.c.a(str));
                }
            }
        }
    }

    private static boolean a(String str) {
        try {
            return PackageManagerEx.hasHwSystemFeature(str);
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean a(String str, boolean z11) {
        try {
            return ((Boolean) Class.forName("android.os.SystemProperties").getMethod("getBoolean", String.class, Boolean.TYPE).invoke(null, str, Boolean.valueOf(z11))).booleanValue();
        } catch (Throwable th2) {
            com.huawei.updatesdk.a.a.c.a.a.a.a(DeviceUtil.TAG, "Exception while getting system property: ", th2);
            return z11;
        }
    }

    public static boolean a(String str, String[] strArr) {
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (String str2 : strArr) {
            if (str2.startsWith("config.")) {
                i11 = 1;
            } else if (!str2.contains(".config.")) {
                i12++;
            }
            if (str2.endsWith("config." + str)) {
                i13++;
            }
        }
        return i11 + i12 == i13;
    }
}
