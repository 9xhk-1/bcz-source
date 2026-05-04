package com.alipay.sdk.m.a0;

import android.os.Build;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import java.io.File;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static e f10475a = new e();

    public static e a() {
        return f10475a;
    }

    public static String b() {
        return "android";
    }

    public static boolean c() {
        String[] strArr = {"/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/"};
        for (int i11 = 0; i11 < 5; i11++) {
            try {
                if (new File(strArr[i11] + CmcdConfiguration.KEY_STARTUP).exists()) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean d() {
        try {
            if (!Build.HARDWARE.contains("goldfish") && !Build.PRODUCT.contains("sdk")) {
                if (!Build.FINGERPRINT.contains("generic")) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String e() {
        return Build.BOARD;
    }

    public static String f() {
        return Build.BRAND;
    }

    public static String g() {
        return Build.DEVICE;
    }

    public static String h() {
        return Build.DISPLAY;
    }

    public static String i() {
        return Build.VERSION.INCREMENTAL;
    }

    public static String j() {
        return Build.MANUFACTURER;
    }

    public static String k() {
        return Build.MODEL;
    }

    public static String l() {
        return Build.PRODUCT;
    }

    public static String m() {
        return Build.VERSION.RELEASE;
    }

    public static String n() {
        return Build.VERSION.SDK;
    }

    public static String o() {
        return Build.TAGS;
    }

    public static String p() {
        return a("ro.kernel.qemu", "0");
    }

    public static String a(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod(ct.d.f46852f, String.class, String.class).invoke(null, str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }
}
