package com.mob.secverify.pure.core.ope.cm.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import com.mob.MobSDK;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.NtFetcher;
import com.mob.tools.utils.ReflectHelper;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static DeviceHelper f41026a;

    /* renamed from: b, reason: collision with root package name */
    private static Context f41027b;

    static {
        Context context = MobSDK.getContext();
        f41027b = context;
        f41026a = DeviceHelper.getInstance(context);
    }

    public static String a() {
        return f41026a.getIMEI();
    }

    @SuppressLint({"MissingPermission"})
    public static String b() {
        try {
            return f41026a.checkPermission("android.permission.READ_PHONE_STATE") ? ((TelephonyManager) f41026a.getSystemServiceSafe("phone")).getDeviceId(1) : "";
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2);
            return "";
        }
    }

    public static String c() {
        return f41026a.getIMSI();
    }

    public static String d() {
        return f41026a.getManufacturer();
    }

    public static String e() {
        return f41026a.getModel();
    }

    public static String f() {
        return "android" + f41026a.getOSVersionName();
    }

    public static String g() {
        int a11 = com.mob.secverify.pure.b.f.a();
        String str = a11 != 1 ? a11 != 2 ? a11 != 3 ? "0" : "3" : "2" : "1";
        com.mob.secverify.b.c.a().b("[SecPure] ==>%s", "op type for cm: " + str);
        return str;
    }

    public static String h() {
        return f41026a.getPackageName();
    }

    public static String i() {
        return f41026a.getAppVersionName();
    }

    public static String j() {
        try {
            return g.a(k());
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2);
            return "";
        }
    }

    public static byte[] k() {
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = f41027b.getPackageManager().getPackageInfo(f41027b.getPackageName(), 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return null;
            }
            return signatureArr[0].toByteArray();
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2);
            return null;
        }
    }

    public static String l() {
        return f41026a.getAppName();
    }

    public static int m() {
        Integer num;
        try {
            HashMap iInfo = f41026a.getIInfo();
            com.mob.secverify.b.c.a().b("[SecPure] ==>%s", "IInfo: " + new Hashon().fromHashMap(iInfo));
            if (iInfo == null || iInfo.isEmpty() || (num = (Integer) iInfo.get("activeCount")) == null) {
                return 1;
            }
            return num.intValue();
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2);
            return 1;
        }
    }

    public static String n() {
        String str = "";
        try {
            if (a((ConnectivityManager) f41026a.getSystemServiceSafe("connectivity"))) {
                List<SubscriptionInfo> o11 = o();
                if (o11 != null && !o11.isEmpty()) {
                    for (SubscriptionInfo subscriptionInfo : o11) {
                        a(subscriptionInfo);
                        if (b(subscriptionInfo)) {
                            str = subscriptionInfo.getIccId();
                            break;
                        }
                    }
                }
            } else {
                com.mob.secverify.b.c.a().b("[SecPure] ==>%s", "Data network OFF");
            }
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2);
        }
        com.mob.secverify.b.c.a().b("[SecPure] ==>%s", "iccid: " + str);
        return str;
    }

    @SuppressLint({"MissingPermission"})
    public static List<SubscriptionInfo> o() {
        try {
            SubscriptionManager subscriptionManager = (SubscriptionManager) f41026a.getSystemServiceSafe("telephony_subscription_service");
            if (a("android.permission.READ_PHONE_STATE")) {
                return subscriptionManager.getActiveSubscriptionInfoList();
            }
            return null;
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2);
            return null;
        }
    }

    public static String p() {
        try {
            int dtNtType = NtFetcher.getInstance(f41027b).getDtNtType();
            com.mob.secverify.b.c.a().b("[SecPure] ==>%s", "ntType: " + dtNtType);
            switch (dtNtType) {
            }
            return "0";
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2);
            return "0";
        }
    }

    public static int q() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) f41026a.getSystemServiceSafe("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (type != 1) {
                    if (type != 0) {
                        return 0;
                    }
                    com.mob.secverify.b.c.a().b("[SecPure] ==>%s", "only mobile network avaliable");
                    return 1;
                }
                com.mob.secverify.b.c.a().b("[SecPure] ==>%s", "WIFI");
                boolean a11 = a("android.permission.CHANGE_NETWORK_STATE");
                com.mob.secverify.b.c.a().b("[SecPure] ==>%s", "CHANGE_NETWORK_STATE=" + a11);
                if (!a11 || !a(connectivityManager)) {
                    return 2;
                }
                com.mob.secverify.b.c.a().b("[SecPure] ==>%s", "wifi and mobile network both opened");
                return 3;
            }
            com.mob.secverify.b.c.a().b("[SecPure] ==>%s", "Nt unavailable");
            return 0;
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2);
            return 0;
        }
    }

    public static boolean a(String str) {
        try {
            return f41026a.checkPermission(str);
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2);
            return false;
        }
    }

    public static int a(SubscriptionInfo subscriptionInfo) {
        if (subscriptionInfo != null) {
            try {
                int simSlotIndex = subscriptionInfo.getSimSlotIndex();
                return ((int[]) ReflectHelper.invokeStaticMethod("android.telephony.SubscriptionManager", "getSubId", new Object[]{Integer.valueOf(simSlotIndex)}, new Class[]{Integer.TYPE}))[0];
            } catch (Throwable th2) {
                com.mob.secverify.b.c.a().a(th2);
            }
        }
        return 0;
    }

    private static boolean b(SubscriptionInfo subscriptionInfo) {
        String str;
        boolean z11 = false;
        if (subscriptionInfo != null) {
            try {
                int mcc = subscriptionInfo.getMcc();
                int mnc = subscriptionInfo.getMnc();
                if (mnc < 10) {
                    str = String.valueOf(mcc) + "0" + String.valueOf(mnc);
                } else {
                    str = String.valueOf(mcc) + String.valueOf(mnc);
                }
                z11 = com.mob.secverify.e.h.a().equals(str);
            } catch (Throwable th2) {
                com.mob.secverify.b.c.a().a(th2);
            }
        }
        com.mob.secverify.b.c.a().b("[SecPure] ==>%s", "isDataSim: " + z11);
        return z11;
    }

    private static boolean a(ConnectivityManager connectivityManager) {
        boolean z11 = false;
        try {
            z11 = ((Boolean) ReflectHelper.invokeInstanceMethod(connectivityManager, "getMobileDataEnabled", new Object[0])).booleanValue();
            com.mob.secverify.b.c.a().b("[SecPure] ==>%s", "data is on ---------" + z11);
            return z11;
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2, "[SecPure] ==>%s", "data is on ----reflect error-----");
            return z11;
        }
    }
}
