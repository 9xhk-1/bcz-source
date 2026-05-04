package com.mob.secverify.e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.ReflectHelper;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static DeviceHelper f40720a;

    /* renamed from: b, reason: collision with root package name */
    private static Context f40721b;

    static {
        Context context = MobSDK.getContext();
        f40721b = context;
        f40720a = DeviceHelper.getInstance(context);
    }

    public static boolean a(String str) {
        try {
            return f40720a.checkPermission(str);
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2);
            return false;
        }
    }

    public static String b() {
        List<SubscriptionInfo> c11;
        try {
            if (!a((ConnectivityManager) f40720a.getSystemServiceSafe("connectivity")) || (c11 = c()) == null || c11.isEmpty()) {
                return "";
            }
            for (SubscriptionInfo subscriptionInfo : c11) {
                a(subscriptionInfo);
                if (b(subscriptionInfo)) {
                    return subscriptionInfo.getIccId();
                }
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    @SuppressLint({"MissingPermission"})
    public static List<SubscriptionInfo> c() {
        try {
            SubscriptionManager subscriptionManager = (SubscriptionManager) f40720a.getSystemServiceSafe("telephony_subscription_service");
            if (a("android.permission.READ_PHONE_STATE")) {
                return subscriptionManager.getActiveSubscriptionInfoList();
            }
            return null;
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2);
            return null;
        }
    }

    public static String a() {
        List<SubscriptionInfo> c11;
        try {
            if (a((ConnectivityManager) f40720a.getSystemServiceSafe("connectivity")) && (c11 = c()) != null && !c11.isEmpty()) {
                for (SubscriptionInfo subscriptionInfo : c11) {
                    int a11 = a(subscriptionInfo);
                    if (b(subscriptionInfo)) {
                        return a(a11);
                    }
                }
                return "";
            }
            return "";
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2, "[SecPure] ==>%s", th2.getMessage());
            return f40720a.getIMSI();
        }
    }

    public static boolean b(String str) {
        if (!a("android.permission.READ_PHONE_STATE") || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String a11 = d.a(MobSDK.getContext());
            if (!TextUtils.isEmpty(a11)) {
                if (!a11.equals(str)) {
                    return true;
                }
            }
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2);
        }
        return false;
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

    public static boolean b(SubscriptionInfo subscriptionInfo) {
        String str;
        if (subscriptionInfo == null) {
            return false;
        }
        try {
            int mcc = subscriptionInfo.getMcc();
            int mnc = subscriptionInfo.getMnc();
            if (mnc < 10) {
                str = String.valueOf(mcc) + "0" + String.valueOf(mnc);
            } else {
                str = String.valueOf(mcc) + String.valueOf(mnc);
            }
            return com.mob.secverify.pure.b.f.c().equals(str);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a(com.mob.secverify.a.a aVar) {
        if (aVar != null) {
            return b(aVar.g());
        }
        return true;
    }

    private static String a(int i11) {
        try {
            if (f40720a.checkPermission("android.permission.READ_PHONE_STATE")) {
                return (String) ReflectHelper.invokeInstanceMethod((TelephonyManager) f40720a.getSystemServiceSafe("phone"), "getSubscriberId", new Object[]{Integer.valueOf(i11)}, new Class[]{Integer.TYPE});
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    private static boolean a(ConnectivityManager connectivityManager) {
        try {
            return ((Boolean) ReflectHelper.invokeInstanceMethod(connectivityManager, "getMobileDataEnabled", new Object[0])).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }
}
