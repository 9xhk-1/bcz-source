package com.mob.secverify.e;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.text.TextUtils;
import android.util.Log;
import com.mob.secverify.common.exception.VerifyException;
import com.mob.tools.utils.DeviceHelper;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class d {
    @SuppressLint({"MissingPermission"})
    public static String a(Context context) {
        SubscriptionManager from;
        List<SubscriptionInfo> activeSubscriptionInfoList;
        int i11;
        SubscriptionInfo activeSubscriptionInfo;
        if (context == null || !a(context, "android.permission.READ_PHONE_STATE") || (from = SubscriptionManager.from(context.getApplicationContext())) == null || (activeSubscriptionInfoList = from.getActiveSubscriptionInfoList()) == null) {
            return "";
        }
        Iterator<SubscriptionInfo> it = activeSubscriptionInfoList.iterator();
        while (it.hasNext()) {
            Log.d("iccid-debug", "si info:" + it.next().toString());
        }
        if (activeSubscriptionInfoList.size() == 1) {
            return activeSubscriptionInfoList.get(0).getIccId();
        }
        try {
            SubscriptionInfo a11 = a(from, "getDefaultDataSubscriptionInfo", null);
            if (a11 != null) {
                String iccId = a11.getIccId();
                if (!TextUtils.isEmpty(iccId)) {
                    return iccId;
                }
            }
        } catch (VerifyException unused) {
            Log.d("iccid-debug", "reflect error");
        }
        try {
            i11 = SubscriptionManager.getDefaultDataSubscriptionId();
        } catch (Throwable unused2) {
            Log.d("iccid-debug", "getDefaultDataSubscriptionId error");
            i11 = -1;
        }
        if (i11 == -1) {
            try {
                Method method = from.getClass().getMethod("getDefaultDataSubId", null);
                if (method != null) {
                    i11 = ((Integer) method.invoke(from, null)).intValue();
                }
            } catch (Throwable unused3) {
                Log.d("iccid-debug", "getDefaultDataSubId reflect error");
            }
        }
        if (i11 == -1) {
            try {
                Method method2 = from.getClass().getMethod("getDefaultDataSubscriptionId", null);
                if (method2 != null) {
                    i11 = ((Integer) method2.invoke(from, null)).intValue();
                }
            } catch (Throwable unused4) {
                Log.d("iccid-debug", "getDefaultDataSubscriptionId reflect error");
            }
        }
        if (i11 != -1 && (activeSubscriptionInfo = from.getActiveSubscriptionInfo(i11)) != null) {
            String iccId2 = activeSubscriptionInfo.getIccId();
            if (!TextUtils.isEmpty(iccId2)) {
                return iccId2;
            }
        }
        return "";
    }

    @TargetApi(22)
    private static SubscriptionInfo a(Object obj, String str, Object[] objArr) throws VerifyException {
        return (SubscriptionInfo) a(obj, str, objArr, null);
    }

    private static Object a(Object obj, String str, Object[] objArr, Class[] clsArr) throws VerifyException {
        try {
            Class<?> cls = Class.forName(obj.getClass().getName());
            if (objArr != null && clsArr != null) {
                return cls.getMethod(str, clsArr).invoke(obj, objArr);
            }
            return cls.getMethod(str, null).invoke(obj, null);
        } catch (Throwable th2) {
            Log.d("didi", "getSubscriptionInfo error:" + th2);
            throw new VerifyException(th2);
        }
    }

    public static boolean a(Context context, String str) {
        try {
            return DeviceHelper.getInstance(context).checkPermission(str);
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2);
            return false;
        }
    }
}
