package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.bj;

/* loaded from: classes6.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private static int f45227a = -1;

    public static ag a(Context context) {
        return m5711a(context) ? ag.HUAWEI : c(context) ? ag.OPPO : d(context) ? ag.VIVO : ag.OTHER;
    }

    public static boolean b(Context context) {
        Object a11 = bj.a(bj.a("com.google.android.gms.common.GoogleApiAvailability", "getInstance", new Object[0]), "isGooglePlayServicesAvailable", context);
        Object a12 = bj.a("com.google.android.gms.common.ConnectionResult", com.alipay.sdk.m.f0.c.f10532p);
        if (a12 == null || !(a12 instanceof Integer)) {
            com.xiaomi.channel.commonutils.logger.b.c("google service is not avaliable");
            f45227a = 0;
            return false;
        }
        int intValue = ((Integer) Integer.class.cast(a12)).intValue();
        if (a11 != null) {
            if (a11 instanceof Integer) {
                f45227a = ((Integer) Integer.class.cast(a11)).intValue() == intValue ? 1 : 0;
            } else {
                f45227a = 0;
                com.xiaomi.channel.commonutils.logger.b.c("google service is not avaliable");
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("is google service can be used");
        sb2.append(f45227a > 0);
        com.xiaomi.channel.commonutils.logger.b.c(sb2.toString());
        return f45227a > 0;
    }

    public static boolean c(Context context) {
        Object a11 = bj.a("com.xiaomi.assemble.control.COSPushManager", "isSupportPush", context);
        boolean booleanValue = (a11 == null || !(a11 instanceof Boolean)) ? false : ((Boolean) Boolean.class.cast(a11)).booleanValue();
        com.xiaomi.channel.commonutils.logger.b.c("color os push  is avaliable ? :" + booleanValue);
        return booleanValue;
    }

    public static boolean d(Context context) {
        Object a11 = bj.a("com.xiaomi.assemble.control.FTOSPushManager", "isSupportPush", context);
        boolean booleanValue = (a11 == null || !(a11 instanceof Boolean)) ? false : ((Boolean) Boolean.class.cast(a11)).booleanValue();
        com.xiaomi.channel.commonutils.logger.b.c("fun touch os push  is avaliable ? :" + booleanValue);
        return booleanValue;
    }

    private static boolean a() {
        try {
            String str = (String) bj.a("android.os.SystemProperties", ct.d.f46852f, "ro.build.hw_emui_api_level", "");
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return Integer.parseInt(str) >= 9;
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
            return false;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m5711a(Context context) {
        try {
            if (context.getPackageManager().getServiceInfo(new ComponentName("com.huawei.hwid", "com.huawei.hms.core.service.HMSCoreService"), 128) != null) {
                if (a()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
