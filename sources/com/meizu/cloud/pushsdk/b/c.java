package com.meizu.cloud.pushsdk.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static String f39384a = "";

    public static String a(Context context) {
        if (!TextUtils.isEmpty(f39384a)) {
            return f39384a;
        }
        f39384a = !a() ? d(context) : b(context);
        return f39384a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"MissingPermission", "HardwareIds"})
    public static String b(Context context) {
        try {
            com.meizu.cloud.pushsdk.b.b.d a11 = com.meizu.cloud.pushsdk.b.b.a.a("android.telephony.MzTelephonyManager").a("getDeviceId", new Class[0]).a(new Object[0]);
            if (a11.f39382a && !TextUtils.isEmpty((CharSequence) a11.f39383b)) {
                return (String) a11.f39383b;
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                return telephonyManager.getDeviceId();
            }
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    @SuppressLint({"HardwareIds"})
    public static String c(Context context) {
        return null;
    }

    private static String d(Context context) {
        StringBuilder sb2 = new StringBuilder();
        String str = Build.SERIAL;
        DebugLogger.i("DeviceUtils", "device serial " + str);
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            String c11 = c(context);
            DebugLogger.e("DeviceUtils", "mac address " + c11);
            if (!TextUtils.isEmpty(c11)) {
                sb2.append(c11.replace(":", "").toUpperCase());
                return sb2.toString();
            }
        }
        return null;
    }

    public static boolean a() {
        String a11 = i.a("ro.target.product");
        if (TextUtils.isEmpty(a11)) {
            DebugLogger.i("DeviceUtils", "current product is phone");
            return true;
        }
        DebugLogger.i("DeviceUtils", "current product is " + a11);
        return false;
    }
}
