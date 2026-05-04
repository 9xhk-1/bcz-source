package com.mob.secverify.pure.b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import com.mob.MobSDK;
import com.mob.tools.utils.ReflectHelper;
import com.mob.tools.utils.ResHelper;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class f {
    public static int a() {
        if (!b()) {
            return -1;
        }
        if (!a(MobSDK.getContext())) {
            return -2;
        }
        try {
            String str = (String) ReflectHelper.invokeInstanceMethod((TelephonyManager) MobSDK.getContext().getSystemService("phone"), a("67657453696D4F70657261746F72"), new Object[0]);
            if (!"46001".equals(str) && !"46006".equals(str) && !"46009".equals(str)) {
                if (!"46000".equals(str) && !"46002".equals(str) && !"46004".equals(str) && !"46007".equals(str)) {
                    if ("46003".equals(str) || "46005".equals(str)) {
                        return 3;
                    }
                    return "46011".equals(str) ? 3 : 0;
                }
                return 1;
            }
            return 2;
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2, "[SecPure][%s][%s] ==>%s", "Util", "isMobileDataEnabled", "Check mobile data encountered exception");
            return -1;
        }
    }

    public static boolean b() {
        return ((TelephonyManager) MobSDK.getContext().getSystemService("phone")).getSimState() == 5;
    }

    public static String c() {
        if (!b() || !a(MobSDK.getContext())) {
            return "";
        }
        try {
            return (String) ReflectHelper.invokeInstanceMethod((TelephonyManager) MobSDK.getContext().getSystemService("phone"), a("67657453696D4F70657261746F72"), new Object[0]);
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2, "[SecPure] ==>%s", "Get op code err");
            return "";
        }
    }

    public static boolean a(Context context) {
        try {
            Method declaredMethod = ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", null);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke((ConnectivityManager) context.getSystemService("connectivity"), null)).booleanValue();
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2, "[SecPure][%s][%s] ==>%s", "Util", "isMobileDataEnabled", "Check mobile data encountered exception");
            return false;
        }
    }

    private static String a(String str) {
        char[] charArray = str.toCharArray();
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 * 2;
            bArr[i11] = (byte) ((("0123456789ABCDEF".indexOf(charArray[i12]) * 16) + "0123456789ABCDEF".indexOf(charArray[i12 + 1])) & 255);
        }
        return new String(bArr);
    }

    public static String a(String str, String str2) {
        int stringRes = ResHelper.getStringRes(MobSDK.getContext(), "sec_verify_page_one_key_login_" + str);
        return stringRes > 0 ? g.a(stringRes) : str2;
    }
}
