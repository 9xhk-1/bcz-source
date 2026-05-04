package com.igexin.push.g;

import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Pair;
import com.getui.gtc.BuildConfig;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.igexin.assist.util.AssistUtils;
import com.squareup.picasso.h0;
import com.vivo.push.PushClientConstants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    static long f38626a = 0;

    /* renamed from: b, reason: collision with root package name */
    static HashMap<String, Object> f38627b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private static final String f38628c = "ro.miui.ui.version.name";

    /* renamed from: d, reason: collision with root package name */
    private static final String f38629d = "ro.miui.ui.version.code";

    /* renamed from: e, reason: collision with root package name */
    private static final String f38630e = "GT";

    /* renamed from: f, reason: collision with root package name */
    private static volatile Boolean f38631f;

    /* renamed from: g, reason: collision with root package name */
    private static String f38632g;

    /* renamed from: h, reason: collision with root package name */
    private static PackageInfo f38633h;

    /* JADX WARN: Code restructure failed: missing block: B:145:0x023a, code lost:
    
        if (r11 == false) goto L121;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x027a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent a(java.lang.String r17) throws java.net.URISyntaxException {
        /*
            Method dump skipped, instructions count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.g.d.a(java.lang.String):android.content.Intent");
    }

    private static boolean b() {
        boolean z11;
        try {
            if (f38631f != null) {
                return f38631f.booleanValue();
            }
            String c11 = c(f38628c);
            String c12 = c(f38629d);
            if (!"Xiaomi".equalsIgnoreCase(com.igexin.push.core.e.G) && TextUtils.isEmpty(c11) && TextUtils.isEmpty(c12)) {
                z11 = false;
                f38631f = Boolean.valueOf(z11);
                return z11;
            }
            z11 = true;
            f38631f = Boolean.valueOf(z11);
            return z11;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static String c() {
        try {
            Field declaredField = BuildConfig.class.getDeclaredField("VERSION_NAME");
            declaredField.setAccessible(true);
            return ((String) declaredField.get(null)).substring(4);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return "";
        }
    }

    private static Intent d(String str) throws URISyntaxException {
        int i11;
        String str2;
        boolean z11;
        String str3 = str;
        int lastIndexOf = str3.lastIndexOf(35);
        if (lastIndexOf < 0) {
            return new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str3));
        }
        int i12 = lastIndexOf + 1;
        boolean z12 = true;
        if (str3.regionMatches(i12, "action(", 0, 7)) {
            int i13 = lastIndexOf + 8;
            int indexOf = str3.indexOf(41, i13);
            str2 = str3.substring(i13, indexOf);
            i11 = indexOf + 1;
            z11 = true;
        } else {
            i11 = i12;
            str2 = null;
            z11 = false;
        }
        Intent intent = new Intent(str2);
        int i14 = 33;
        if (str3.regionMatches(i11, "categories(", 0, 11)) {
            int i15 = i11 + 11;
            int indexOf2 = str3.indexOf(41, i15);
            while (i15 < indexOf2) {
                int indexOf3 = str3.indexOf(33, i15);
                if (indexOf3 < 0 || indexOf3 > indexOf2) {
                    indexOf3 = indexOf2;
                }
                if (i15 < indexOf3) {
                    intent.addCategory(str3.substring(i15, indexOf3));
                }
                i15 = indexOf3 + 1;
            }
            i11 = indexOf2 + 1;
            z11 = true;
        }
        if (str3.regionMatches(i11, "type(", 0, 5)) {
            int i16 = i11 + 5;
            int indexOf4 = str3.indexOf(41, i16);
            intent.setType(str3.substring(i16, indexOf4));
            i11 = indexOf4 + 1;
            z11 = true;
        }
        if (str3.regionMatches(i11, "launchFlags(", 0, 12)) {
            int i17 = i11 + 12;
            int indexOf5 = str3.indexOf(41, i17);
            intent.setFlags(Integer.decode(str3.substring(i17, indexOf5)).intValue());
            intent.setFlags((~(67 | 128)) & intent.getFlags());
            i11 = indexOf5 + 1;
            z11 = true;
        }
        if (str3.regionMatches(i11, "component(", 0, 10)) {
            int i18 = i11 + 10;
            int indexOf6 = str3.indexOf(41, i18);
            int indexOf7 = str3.indexOf(33, i18);
            if (indexOf7 >= 0 && indexOf7 < indexOf6) {
                intent.setComponent(new ComponentName(str3.substring(i18, indexOf7), str3.substring(indexOf7 + 1, indexOf6)));
            }
            i11 = indexOf6 + 1;
            z11 = true;
        }
        if (str3.regionMatches(i11, "extras(", 0, 7)) {
            int i19 = i11 + 7;
            int indexOf8 = str3.indexOf(41, i19);
            int i21 = -1;
            if (indexOf8 == -1) {
                throw new URISyntaxException(str3, "EXTRA missing trailing ')'", i19);
            }
            if (intent.getExtras() == null) {
                intent.putExtras(new Bundle());
            }
            Bundle extras = intent.getExtras();
            while (i19 < indexOf8) {
                int indexOf9 = str3.indexOf(61, i19);
                int i22 = i19 + 1;
                if (indexOf9 <= i22 || i19 >= indexOf8) {
                    throw new URISyntaxException(str3, "EXTRA missing '='", i19);
                }
                char charAt = str3.charAt(i19);
                String substring = str3.substring(i22, indexOf9);
                int i23 = indexOf9 + 1;
                int indexOf10 = str3.indexOf(i14, i23);
                if (indexOf10 == i21 || indexOf10 >= indexOf8) {
                    indexOf10 = indexOf8;
                }
                if (i23 >= indexOf10) {
                    throw new URISyntaxException(str3, "EXTRA missing '!'", i23);
                }
                String substring2 = str3.substring(i23, indexOf10);
                if (charAt == 'B') {
                    extras.putBoolean(substring, Boolean.parseBoolean(substring2));
                } else if (charAt == 'S') {
                    extras.putString(substring, Uri.decode(substring2));
                } else if (charAt == 'f') {
                    extras.putFloat(substring, Float.parseFloat(substring2));
                } else if (charAt == 'i') {
                    extras.putInt(substring, Integer.parseInt(substring2));
                } else if (charAt == 'l') {
                    extras.putLong(substring, Long.parseLong(substring2));
                } else if (charAt != 's') {
                    switch (charAt) {
                        case 'b':
                            extras.putByte(substring, Byte.parseByte(substring2));
                            break;
                        case 'c':
                            extras.putChar(substring, Uri.decode(substring2).charAt(0));
                            break;
                        case 'd':
                            try {
                                extras.putDouble(substring, Double.parseDouble(substring2));
                                break;
                            } catch (NumberFormatException unused) {
                                throw new URISyntaxException(str3, "EXTRA value can't be parsed", indexOf10);
                            }
                        default:
                            throw new URISyntaxException(str3, "EXTRA has unknown type", indexOf10);
                    }
                } else {
                    extras.putShort(substring, Short.parseShort(substring2));
                }
                char charAt2 = str3.charAt(indexOf10);
                if (charAt2 == ')') {
                    intent.putExtras(extras);
                } else {
                    if (charAt2 != '!') {
                        throw new URISyntaxException(str3, "EXTRA missing '!'", indexOf10);
                    }
                    i19 = indexOf10 + 1;
                    i14 = 33;
                    i21 = -1;
                }
            }
            intent.putExtras(extras);
        } else {
            z12 = z11;
        }
        if (z12) {
            str3 = str3.substring(0, lastIndexOf);
        }
        intent.setData(Uri.parse(str3));
        if (intent.getAction() == null) {
            intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
        }
        return intent;
    }

    public static Pair<ServiceInfo, Class> a(Context context, Class cls) {
        try {
            if (f38633h == null) {
                f38633h = context.getPackageManager().getPackageInfo(context.getPackageName(), com.badlogic.gdx.graphics.f.f11602i2);
            }
            ServiceInfo[] serviceInfoArr = f38633h.services;
            if (serviceInfoArr != null && serviceInfoArr.length > 0) {
                int length = serviceInfoArr.length;
                for (int i11 = 0; i11 < length; i11++) {
                    ServiceInfo serviceInfo = serviceInfoArr[i11];
                    try {
                        Class<?> cls2 = Class.forName(serviceInfo.name);
                        if (cls2 != cls && cls.isAssignableFrom(cls2)) {
                            com.igexin.c.a.c.a.b("GT", cls.getSimpleName() + " child is " + cls2.getSimpleName());
                            return Pair.create(serviceInfo, cls2);
                        }
                    } catch (Throwable th2) {
                        com.igexin.c.a.c.a.a(th2);
                    }
                }
            }
        } catch (Throwable th3) {
            com.igexin.c.a.c.a.a(th3);
            com.igexin.c.a.c.a.c.a().a(" findGtImplClassInManifest error = " + th3.toString());
        }
        return Pair.create(null, null);
    }

    public static boolean b(int i11, boolean z11) {
        try {
            if (com.igexin.push.core.e.f38035l == null || !"vivo".equalsIgnoreCase(com.igexin.push.core.e.G)) {
                return false;
            }
            Intent intent = new Intent();
            intent.setAction("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
            intent.putExtra(CommonConstant.ReqAccessTokenParam.PACKAGE_NAME, com.igexin.push.core.e.f38035l.getPackageName());
            Intent launchIntentForPackage = com.igexin.push.core.e.f38035l.getPackageManager().getLaunchIntentForPackage(com.igexin.push.core.e.f38035l.getPackageName());
            if (launchIntentForPackage == null || launchIntentForPackage.getComponent() == null) {
                return false;
            }
            int intValue = ((Integer) o.b(com.igexin.push.core.e.f38035l, o.f38740i, 0)).intValue();
            if (!z11) {
                i11 += intValue;
            }
            o.a(com.igexin.push.core.e.f38035l, o.f38740i, Integer.valueOf(i11));
            intent.putExtra(PushClientConstants.TAG_CLASS_NAME, launchIntentForPackage.getComponent().getClassName());
            intent.putExtra("notificationNum", i11);
            intent.addFlags(16777216);
            com.igexin.push.core.e.f38035l.sendBroadcast(intent);
            return true;
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return false;
        }
    }

    private static String c(String str) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ".concat(String.valueOf(str))).getInputStream()), 1024);
            try {
                String readLine = bufferedReader.readLine();
                try {
                    bufferedReader.close();
                    return readLine;
                } catch (IOException e11) {
                    com.igexin.c.a.c.a.a(e11);
                    return readLine;
                }
            } catch (Exception unused) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e12) {
                        com.igexin.c.a.c.a.a(e12);
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException e13) {
                        com.igexin.c.a.c.a.a(e13);
                    }
                }
                throw th;
            }
        } catch (Exception unused2) {
            bufferedReader = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static String a(Context context) {
        try {
            Intent launchIntentForPackage = context.getApplicationContext().getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            return (launchIntentForPackage == null || launchIntentForPackage.getComponent() == null) ? "" : launchIntentForPackage.getComponent().getClassName();
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return "";
        }
    }

    public static boolean b(String str) {
        try {
            if (TextUtils.isEmpty(f38632g)) {
                f38632g = c();
                com.igexin.c.a.c.a.b("GT", " gtcVersion = " + f38632g);
            }
            String[] split = f38632g.split("\\.");
            String[] split2 = str.split("\\.");
            if (split.length == 4 && split2.length == 4) {
                for (int i11 = 0; i11 < 3; i11++) {
                    int parseInt = Integer.parseInt(split2[i11]);
                    int parseInt2 = Integer.parseInt(split[i11]);
                    if (parseInt2 != parseInt) {
                        return parseInt2 < parseInt;
                    }
                }
            }
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
        return false;
    }

    public static boolean c(int i11, boolean z11) {
        try {
            if (com.igexin.push.core.e.f38035l == null || !"oppo".equalsIgnoreCase(com.igexin.push.core.e.G)) {
                return false;
            }
            int intValue = ((Integer) o.b(com.igexin.push.core.e.f38035l, o.f38741j, 0)).intValue();
            if (!z11) {
                i11 += intValue;
            }
            o.a(com.igexin.push.core.e.f38035l, o.f38741j, Integer.valueOf(i11));
            Intent intent = new Intent("com.oppo.unsettledevent");
            intent.putExtra(CommonConstant.ReqAccessTokenParam.PACKAGE_NAME, com.igexin.push.core.e.f38035l.getPackageName());
            intent.putExtra("number", i11);
            intent.putExtra("upgradeNumber", i11);
            List<ResolveInfo> queryBroadcastReceivers = com.igexin.push.core.e.f38035l.getPackageManager().queryBroadcastReceivers(intent, 0);
            if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                com.igexin.push.core.e.f38035l.sendBroadcast(intent);
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("app_badge_count", i11);
            com.igexin.push.core.e.f38035l.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
            return true;
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            return false;
        }
    }

    public static String a(ApplicationInfo applicationInfo) {
        try {
            String string = applicationInfo.metaData.getString(com.igexin.push.core.b.f37703a);
            if (TextUtils.isEmpty(string)) {
                string = applicationInfo.packageName;
            }
            Class<?> cls = Class.forName(string + ".BuildConfig");
            return (String) cls.getField("GETUI_APPID").get(cls);
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a("get cf error|" + e11.toString(), new Object[0]);
            return "";
        }
    }

    public static HashMap<String, Object> a() {
        boolean z11;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - f38626a >= 2000) {
                HashMap<String, Object> hashMap = f38627b;
                Boolean bool = Boolean.FALSE;
                hashMap.put("isPause", bool);
                f38627b.put("isTranslucent", bool);
                f38626a = currentTimeMillis;
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Activity activity = null;
                Object invoke = cls.getMethod("currentActivityThread", null).invoke(null, null);
                Field declaredField = cls.getDeclaredField("mActivities");
                declaredField.setAccessible(true);
                ArrayMap arrayMap = (ArrayMap) declaredField.get(invoke);
                if (arrayMap.size() > 0) {
                    Iterator it = arrayMap.values().iterator();
                    Boolean bool2 = null;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        Class<?> cls2 = next.getClass();
                        Field declaredField2 = cls2.getDeclaredField("activity");
                        declaredField2.setAccessible(true);
                        Activity activity2 = (Activity) declaredField2.get(next);
                        Field declaredField3 = cls2.getDeclaredField(h0.C);
                        declaredField3.setAccessible(true);
                        boolean z12 = declaredField3.getBoolean(next);
                        if (bool2 == null) {
                            z11 = z12;
                        } else if (bool2.booleanValue() && z12) {
                            z11 = true;
                        }
                        bool2 = Boolean.valueOf(z11);
                        if (!z12) {
                            activity = activity2;
                        }
                    }
                    z11 = activity != null ? activity.getTheme().obtainStyledAttributes(new int[]{R.attr.windowIsTranslucent}).getBoolean(0, false) : false;
                    f38627b.put("isPause", Boolean.valueOf(Boolean.TRUE.equals(bool2)));
                    f38627b.put("isTranslucent", Boolean.valueOf(z11));
                }
            }
            return f38627b;
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return f38627b;
        }
    }

    public static synchronized boolean a(int i11, boolean z11) {
        synchronized (d.class) {
            try {
            } finally {
                return false;
            }
            if (com.igexin.push.core.e.f38035l == null) {
                return false;
            }
            String str = com.igexin.push.core.e.G;
            if (!"huawei".equalsIgnoreCase(str)) {
                if (AssistUtils.BRAND_HON.equalsIgnoreCase(str)) {
                }
                return false;
            }
            int intValue = ((Integer) o.b(com.igexin.push.core.e.f38035l, o.f38739h, 0)).intValue();
            if (!z11) {
                i11 += intValue;
            }
            o.a(com.igexin.push.core.e.f38035l, o.f38739h, Integer.valueOf(i11));
            Bundle bundle = new Bundle();
            bundle.putString("package", com.igexin.push.core.e.f38030g);
            bundle.putString("class", a(com.igexin.push.core.e.f38035l));
            bundle.putInt("badgenumber", i11);
            Uri parse = Uri.parse("content://com.huawei.android.launcher.settings/badge/");
            Uri parse2 = Uri.parse("content://com.hihonor.android.launcher.settings/badge/");
            if (TextUtils.isEmpty(com.igexin.push.core.e.f38035l.getContentResolver().getType(parse))) {
                parse = parse2;
            }
            com.igexin.push.core.e.f38035l.getContentResolver().call(parse, "change_badge", (String) null, bundle);
            return true;
        }
    }

    public static boolean a(String... strArr) {
        for (int i11 = 0; i11 < 5; i11++) {
            if (TextUtils.isEmpty(strArr[i11])) {
                return true;
            }
        }
        return false;
    }
}
