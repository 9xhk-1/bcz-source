package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static String f10366a = "";

    public static long a(Context context) {
        String a11 = com.alipay.sdk.m.b0.a.a(context, "vkeyid_settings", "update_time_interval");
        if (com.alipay.sdk.m.z.a.b(a11)) {
            try {
                return Long.parseLong(a11);
            } catch (Exception unused) {
            }
        }
        return 86400000L;
    }

    public static String b(Context context) {
        return com.alipay.sdk.m.b0.a.a(context, "vkeyid_settings", "last_apdid_env");
    }

    public static void c(Context context, String str) {
        a(context, "last_apdid_env", str);
    }

    public static String d(Context context) {
        return com.alipay.sdk.m.b0.a.a(context, "vkeyid_settings", "dynamic_key");
    }

    public static String e(Context context) {
        return com.alipay.sdk.m.b0.a.a(context, "vkeyid_settings", "apse_degrade");
    }

    public static String f(Context context) {
        String str;
        SharedPreferences.Editor edit;
        synchronized (h.class) {
            try {
                if (com.alipay.sdk.m.z.a.a(f10366a)) {
                    String a11 = com.alipay.sdk.m.b0.e.a(context, "alipay_vkey_random", "random", "");
                    f10366a = a11;
                    if (com.alipay.sdk.m.z.a.a(a11)) {
                        String a12 = com.alipay.sdk.m.y.b.a(UUID.randomUUID().toString());
                        f10366a = a12;
                        if (a12 != null && (edit = context.getSharedPreferences("alipay_vkey_random", 0).edit()) != null) {
                            edit.putString("random", a12);
                            edit.commit();
                        }
                    }
                }
                str = f10366a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public static void g(Context context, String str) {
        a(context, "apse_degrade", str);
    }

    public static long h(Context context, String str) {
        try {
            String a11 = com.alipay.sdk.m.b0.a.a(context, "vkeyid_settings", "vkey_valid" + str);
            if (com.alipay.sdk.m.z.a.a(a11)) {
                return 0L;
            }
            return Long.parseLong(a11);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static void a(Context context, String str) {
        a(context, "update_time_interval", str);
    }

    public static void b(Context context, String str) {
        a(context, "last_machine_boot_time", str);
    }

    public static boolean c(Context context) {
        String a11 = com.alipay.sdk.m.b0.a.a(context, "vkeyid_settings", "log_switch");
        return a11 != null && "1".equals(a11);
    }

    public static void d(Context context, String str) {
        a(context, "agent_switch", str);
    }

    public static void e(Context context, String str) {
        a(context, "dynamic_key", str);
    }

    public static void f(Context context, String str) {
        a(context, "webrtc_url", str);
    }

    public static void a(Context context, String str, long j11) {
        com.alipay.sdk.m.b0.a.a(context, "vkeyid_settings", "vkey_valid" + str, String.valueOf(j11));
    }

    public static void a(Context context, String str, String str2) {
        com.alipay.sdk.m.b0.a.a(context, "vkeyid_settings", str, str2);
    }

    public static void a(Context context, boolean z11) {
        a(context, "log_switch", z11 ? "1" : "0");
    }
}
