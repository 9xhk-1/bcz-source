package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.igexin.assist.sdk.AssistPushConsts;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.junit.jupiter.api.j2;

/* loaded from: classes8.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static volatile int f46160a = 0;

    /* renamed from: a, reason: collision with other field name */
    private static Map<String, n> f841a = null;

    /* renamed from: b, reason: collision with root package name */
    private static int f46161b = -1;

    public static int a() {
        int i11;
        if (f46160a == 0) {
            try {
            } catch (Throwable th2) {
                com.xiaomi.channel.commonutils.logger.b.a("get isMIUI failed", th2);
                f46160a = 0;
            }
            if (TextUtils.isEmpty(m6169a("ro.miui.ui.version.code")) && TextUtils.isEmpty(m6169a("ro.miui.ui.version.name"))) {
                i11 = 2;
                f46160a = i11;
                com.xiaomi.channel.commonutils.logger.b.b("isMIUI's value is: " + f46160a);
            }
            i11 = 1;
            f46160a = i11;
            com.xiaomi.channel.commonutils.logger.b.b("isMIUI's value is: " + f46160a);
        }
        return f46160a;
    }

    public static int b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 0).versionCode;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String c() {
        return m6169a("ro.miui.ui.version.name");
    }

    public static String d() {
        return m6169a("ro.build.characteristics");
    }

    public static String e() {
        return m6169a("ro.product.manufacturer");
    }

    public static int a(Context context) {
        String m6169a = m6169a("ro.miui.ui.version.code");
        if (TextUtils.isEmpty(m6169a) || !TextUtils.isDigitsOnly(m6169a)) {
            return 0;
        }
        return Integer.parseInt(m6169a);
    }

    private static n b(String str) {
        m6170a();
        return f841a.get(str.toUpperCase());
    }

    /* renamed from: c, reason: collision with other method in class */
    public static boolean m6176c() {
        if (f46161b < 0) {
            f46161b = !m6178e() ? 1 : 0;
        }
        return f46161b > 0;
    }

    /* renamed from: d, reason: collision with other method in class */
    public static boolean m6177d() {
        return !n.China.name().equalsIgnoreCase(a(b()).name());
    }

    /* renamed from: e, reason: collision with other method in class */
    public static boolean m6178e() {
        String str = "";
        try {
            str = C1403r.a("ro.miui.ui.version.code", "");
        } catch (Exception unused) {
        }
        return !TextUtils.isEmpty(str);
    }

    public static n a(String str) {
        n b11 = b(str);
        return b11 == null ? n.Global : b11;
    }

    public static String b() {
        String a11 = C1403r.a("ro.miui.region", "");
        if (TextUtils.isEmpty(a11)) {
            a11 = C1403r.a("persist.sys.oppo.region", "");
        }
        if (TextUtils.isEmpty(a11)) {
            a11 = C1403r.a("ro.oppo.regionmark", "");
        }
        if (TextUtils.isEmpty(a11)) {
            a11 = C1403r.a("ro.vendor.oplus.regionmark", "");
        }
        if (TextUtils.isEmpty(a11)) {
            a11 = C1403r.a("ro.hw.country", "");
        }
        if (TextUtils.isEmpty(a11)) {
            a11 = C1403r.a("ro.csc.countryiso_code", "");
        }
        if (TextUtils.isEmpty(a11)) {
            a11 = m6174b(C1403r.a("ro.product.country.region", ""));
        }
        if (TextUtils.isEmpty(a11)) {
            a11 = C1403r.a("gsm.vivo.countrycode", "");
        }
        if (TextUtils.isEmpty(a11)) {
            a11 = C1403r.a("persist.sys.oem.region", "");
        }
        if (TextUtils.isEmpty(a11)) {
            a11 = C1403r.a("ro.product.locale.region", "");
        }
        if (TextUtils.isEmpty(a11)) {
            a11 = C1403r.a("persist.sys.country", "");
        }
        if (!TextUtils.isEmpty(a11)) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("get region from system, region = " + a11);
        }
        if (!TextUtils.isEmpty(a11)) {
            return a11;
        }
        String country = Locale.getDefault().getCountry();
        com.xiaomi.channel.commonutils.logger.b.m5639a("locale.default.country = " + country);
        return country;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static String m6168a() {
        int a11 = s.a();
        return (!m6171a() || a11 <= 0) ? "" : a11 < 2 ? "alpha" : a11 < 3 ? "development" : "stable";
    }

    /* renamed from: b, reason: collision with other method in class */
    private static String m6174b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        return split.length > 0 ? split[0] : str;
    }

    public static String a(Intent intent) {
        if (intent == null) {
            return null;
        }
        return intent.toString() + " " + a(intent.getExtras());
    }

    /* renamed from: b, reason: collision with other method in class */
    public static boolean m6175b() {
        return a() == 2;
    }

    public static String a(Bundle bundle) {
        String a11;
        StringBuilder sb2 = new StringBuilder("Bundle[");
        if (bundle == null) {
            sb2.append("null");
        } else {
            boolean z11 = true;
            for (String str : bundle.keySet()) {
                if (!z11) {
                    sb2.append(j2.O);
                }
                sb2.append(str);
                sb2.append('=');
                Object obj = bundle.get(str);
                if (obj instanceof int[]) {
                    a11 = Arrays.toString((int[]) obj);
                } else if (obj instanceof byte[]) {
                    a11 = Arrays.toString((byte[]) obj);
                } else if (obj instanceof boolean[]) {
                    a11 = Arrays.toString((boolean[]) obj);
                } else if (obj instanceof short[]) {
                    a11 = Arrays.toString((short[]) obj);
                } else if (obj instanceof long[]) {
                    a11 = Arrays.toString((long[]) obj);
                } else if (obj instanceof float[]) {
                    a11 = Arrays.toString((float[]) obj);
                } else if (obj instanceof double[]) {
                    a11 = Arrays.toString((double[]) obj);
                } else if (obj instanceof String[]) {
                    a11 = Arrays.toString((String[]) obj);
                } else if (obj instanceof CharSequence[]) {
                    a11 = Arrays.toString((CharSequence[]) obj);
                } else if (obj instanceof Parcelable[]) {
                    a11 = Arrays.toString((Parcelable[]) obj);
                } else if (obj instanceof Bundle) {
                    a11 = a((Bundle) obj);
                } else {
                    sb2.append(obj);
                    z11 = false;
                }
                sb2.append(a11);
                z11 = false;
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* renamed from: a, reason: collision with other method in class */
    public static String m6169a(String str) {
        try {
            try {
                return (String) bj.a("android.os.SystemProperties", ct.d.f46852f, str, "");
            } catch (Exception e11) {
                com.xiaomi.channel.commonutils.logger.b.d("fail to get property. " + e11);
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private static void m6170a() {
        if (f841a != null) {
            return;
        }
        HashMap hashMap = new HashMap();
        f841a = hashMap;
        hashMap.put("CN", n.China);
        Map<String, n> map = f841a;
        n nVar = n.Europe;
        map.put("FI", nVar);
        f841a.put("SE", nVar);
        f841a.put("NO", nVar);
        f841a.put("FO", nVar);
        f841a.put("EE", nVar);
        f841a.put("LV", nVar);
        f841a.put("LT", nVar);
        f841a.put("BY", nVar);
        f841a.put("MD", nVar);
        f841a.put("UA", nVar);
        f841a.put("PL", nVar);
        f841a.put("CZ", nVar);
        f841a.put("SK", nVar);
        f841a.put("HU", nVar);
        f841a.put("DE", nVar);
        f841a.put("AT", nVar);
        f841a.put("CH", nVar);
        f841a.put("LI", nVar);
        f841a.put("GB", nVar);
        f841a.put("IE", nVar);
        f841a.put("NL", nVar);
        f841a.put("BE", nVar);
        f841a.put("LU", nVar);
        f841a.put("FR", nVar);
        f841a.put("RO", nVar);
        f841a.put("BG", nVar);
        f841a.put("RS", nVar);
        f841a.put("MK", nVar);
        f841a.put("AL", nVar);
        f841a.put("GR", nVar);
        f841a.put("SI", nVar);
        f841a.put("HR", nVar);
        f841a.put("IT", nVar);
        f841a.put("SM", nVar);
        f841a.put("MT", nVar);
        f841a.put("ES", nVar);
        f841a.put(AssistPushConsts.MSG_VALUE_PAYLOAD, nVar);
        f841a.put("AD", nVar);
        f841a.put("CY", nVar);
        f841a.put("DK", nVar);
        f841a.put("IS", nVar);
        f841a.put("UK", nVar);
        f841a.put("EL", nVar);
        f841a.put("RU", n.Russia);
        f841a.put("IN", n.India);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m6171a() {
        return a() == 1;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m6172a(Context context) {
        return context != null && m6173a(context.getPackageName());
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m6173a(String str) {
        return "com.xiaomi.xmsf".equals(str);
    }
}
