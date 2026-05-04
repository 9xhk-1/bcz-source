package cn.com.chinatelecom.account.api;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.mob.secverify.pure.core.ope.a.a.f;
import com.mob.secverify.pure.core.ope.a.a.h;
import com.xiaomi.mipush.sdk.Constants;
import java.security.interfaces.RSAPublicKey;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class ClientUtils {
    private static final String TAG = "ClientUtils";
    public static final int TYPE_SDK_API = 0;
    public static final int TYPE_SDK_BIO = 2;
    public static final int TYPE_SDK_HY = 1;
    private static int sdkType;

    public static String enrdata(String str, String str2) {
        try {
            return f.a(str, (RSAPublicKey) f.a(str2));
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getAT(Context context) {
        ComponentName componentName;
        try {
            componentName = ((ActivityManager) context.getSystemService("activity")).getRunningTasks(1).get(0).topActivity;
            componentName.getClassName();
            return "cn.com.chinatelecom.account.sdk.ui.AuthActivity";
        } catch (Throwable unused) {
            return "error";
        }
    }

    public static String getApiVersion() {
        return "3.0";
    }

    public static String getCurrentNetworkType(Context context) {
        return com.mob.secverify.pure.core.ope.a.a.d.d(context);
    }

    public static boolean getHealthy(Context context) {
        try {
            return h.c(context);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean getMacData() {
        try {
            return h.c();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String getMobileBrand() {
        return Build.BRAND;
    }

    public static String getModel() {
        return Build.MODEL;
    }

    public static boolean getNetSafe(Context context) {
        try {
            return h.b(context);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String getOnlineType(Context context) {
        return com.mob.secverify.pure.core.ope.a.a.d.e(context);
    }

    public static String getOperatorType(Context context) {
        return "";
    }

    public static String getOs() {
        return getMobileBrand() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + getModel() + "-A:" + Build.VERSION.RELEASE;
    }

    public static String getPID() {
        String str = "";
        try {
            String str2 = Thread.currentThread().getId() + "" + Process.myPid();
            if (str2.length() <= 6) {
                return "ctacco";
            }
            str = str2.substring(0, 6);
            return str;
        } catch (Exception unused) {
            return str;
        }
    }

    public static int getSdkType() {
        return sdkType;
    }

    public static String getSdkVersion() {
        int i11 = sdkType;
        return i11 == 1 ? "SDK-HY-v3.8.2" : i11 == 2 ? "SDK-BIOM-v3.8.2" : "SDK-API-v3.8.2";
    }

    public static boolean getTimePass(Context context) {
        try {
            if (h.a(context)) {
                return true;
            }
            return h.d();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static long getTp() {
        return System.currentTimeMillis();
    }

    public static boolean isAT(Context context, String str) {
        ComponentName componentName;
        byte[] bArr = {105, 100, 36, 105, 101, 103, 36, 105, 98, 99, 100, 107, 126, 111, 102, 111, 105, 101, 103, 36, 107, 105, 105, 101, Byte.MAX_VALUE, 100, 126, 36, 121, 110, 97, 36, Byte.MAX_VALUE, 99, 36, 71, 99, 100, 99, 75, Byte.MAX_VALUE, 126, 98, 75, 105, 126, 99, 124, 99, 126, 115};
        byte[] bArr2 = {105, 100, 36, 105, 101, 103, 36, 105, 98, 99, 100, 107, 126, 111, 102, 111, 105, 101, 103, 36, 107, 105, 105, 101, Byte.MAX_VALUE, 100, 126, 36, 104, 99, 101, 103, 111, 126, 120, 99, 105, 121, 36, Byte.MAX_VALUE, 99, 36, 72, 99, 101, 103, 75, Byte.MAX_VALUE, 126, 98, 75, 105, 126, 99, 124, 99, 126, 115};
        try {
            componentName = ((ActivityManager) context.getSystemService("activity")).getRunningTasks(1).get(0).topActivity;
            String className = componentName.getClassName();
            if (!className.equals(str) && !className.equals(com.mob.secverify.pure.core.ope.a.a.c.a(bArr))) {
                className.equals(com.mob.secverify.pure.core.ope.a.a.c.a(bArr2));
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isJY() {
        return true;
    }

    public static boolean objChange(Object obj, String str) {
        try {
            return h.a(obj, str);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void setSdkType(int i11) {
        sdkType = i11;
    }

    public static String strBuf() {
        try {
            return h.b().toString();
        } catch (Throwable unused) {
            return "";
        }
    }
}
