package com.tencent.liteav.basic.datareport;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.basic.util.e;
import com.tencent.liteav.basic.util.h;
import io.ktor.util.date.b;
import java.security.MessageDigest;
import java.util.UUID;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class TXCDRApi {
    static final int NETWORK_TYPE_2G = 4;
    static final int NETWORK_TYPE_3G = 3;
    static final int NETWORK_TYPE_4G = 2;
    static final int NETWORK_TYPE_UNKNOWN = 255;
    static final int NETWORK_TYPE_WIFI = 1;
    private static final String TAG = "TXCDRApi";
    private static String g_simulate_idfa = "";
    private static String mAppName = "";
    private static String mDevId = "";
    private static String mDevType = "";
    private static String mDevUUID = "";
    private static String mNetType = "";
    private static String mSysVersion = "";
    private static final char[] DIGITS_LOWER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', b.f62000f, 'e', 'f'};
    static boolean initRpt = false;

    static {
        h.d();
        nativeInitDataReport();
    }

    public static void InitEvent(Context context, String str, int i11, int i12, TXCDRExtInfo tXCDRExtInfo) {
        setCommonInfo(context);
        if (str == null) {
            return;
        }
        nativeInitEventInternal(str, i11, i12, tXCDRExtInfo);
    }

    private static String byteArrayToHexString(byte[] bArr) {
        char[] cArr = new char[bArr.length << 1];
        int i11 = 0;
        for (byte b11 : bArr) {
            int i12 = i11 + 1;
            char[] cArr2 = DIGITS_LOWER;
            cArr[i11] = cArr2[(b11 & 240) >>> 4];
            i11 += 2;
            cArr[i12] = cArr2[b11 & 15];
        }
        return new String(cArr);
    }

    public static String getApplicationNameByPackageName(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        try {
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 128)).toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getDevUUID(Context context, String str) {
        return getSimulateIDFA(context);
    }

    public static int getNetworkType(Context context) {
        int i11 = 255;
        if (context == null) {
            return 255;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return 255;
            }
            if (activeNetworkInfo.getType() == 1) {
                return 1;
            }
            if (activeNetworkInfo.getType() == 0) {
                i11 = 2;
                try {
                    switch (telephonyManager.getNetworkType()) {
                    }
                } catch (Exception e11) {
                    TXCLog.e(TAG, "TXCDRApi: get network type fail, exception occurred.", e11);
                }
                return 255;
            }
            return i11;
        } catch (Exception e12) {
            TXCLog.e(TAG, "getActiveNetworkInfo exception:", e12);
            return 255;
        }
    }

    private static String getPackageName(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
        } catch (Exception e11) {
            TXCLog.e(TAG, "get package name failed.", e11);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0176 A[Catch: Exception -> 0x017a, TryCatch #1 {Exception -> 0x017a, blocks: (B:39:0x0156, B:41:0x0176, B:42:0x017c, B:44:0x019a, B:45:0x019d), top: B:38:0x0156 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019a A[Catch: Exception -> 0x017a, TryCatch #1 {Exception -> 0x017a, blocks: (B:39:0x0156, B:41:0x0176, B:42:0x017c, B:44:0x019a, B:45:0x019d), top: B:38:0x0156 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b9 A[LOOP:0: B:51:0x00b3->B:53:0x00b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e6 A[LOOP:1: B:56:0x00e4->B:57:0x00e6, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getSimulateIDFA(android.content.Context r22) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.basic.datareport.TXCDRApi.getSimulateIDFA(android.content.Context):java.lang.String");
    }

    public static int getStatusReportInterval() {
        return nativeGetStatusReportInterval();
    }

    public static void initCrashReport(Context context) {
        String sDKVersionStr;
        try {
            synchronized (TXCDRApi.class) {
                try {
                    if (!initRpt && context != null && (sDKVersionStr = TXCCommonUtil.getSDKVersionStr()) != null) {
                        SharedPreferences.Editor edit = context.getSharedPreferences("BuglySdkInfos", 0).edit();
                        edit.putString("8e50744bf0", sDKVersionStr);
                        edit.commit();
                        initRpt = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e11) {
            TXCLog.e(TAG, "init crash report failed.", e11);
        }
    }

    public static native int nativeGetStatusReportInterval();

    private static native void nativeInitDataReport();

    private static native void nativeInitEventInternal(String str, int i11, int i12, TXCDRExtInfo tXCDRExtInfo);

    public static native void nativeReportAVRoomEvent(int i11, long j11, String str, int i12, int i13, String str2, String str3);

    private static native void nativeReportDAUInterval(int i11, int i12, String str);

    public static native void nativeReportEvent(String str, int i11);

    public static native void nativeReportEvent40003(String str, int i11, int i12, String str2, String str3);

    public static native void nativeSetCommonValue(String str, String str2);

    private static native void nativeSetEventValueInterval(String str, int i11, String str2, String str3);

    private static native void nativeUninitDataReport();

    public static void reportAVRoomEvent(int i11, long j11, String str, int i12, int i13, String str2, String str3) {
        nativeReportAVRoomEvent(i11, j11, str, i12, i13, str2, str3);
    }

    public static void reportEvent40003(String str, int i11, int i12, String str2, String str3) {
        nativeReportEvent40003(str, i11, i12, str2, str3);
    }

    public static void setCommonInfo(Context context) {
        mDevType = e.f43437a;
        mNetType = Integer.toString(getNetworkType(context));
        if (mDevId.isEmpty()) {
            mDevId = getSimulateIDFA(context);
        }
        if (mDevUUID.isEmpty()) {
            mDevUUID = getDevUUID(context, mDevId);
        }
        String packageName = getPackageName(context);
        mAppName = getApplicationNameByPackageName(context, packageName) + ":" + packageName;
        mSysVersion = String.valueOf(Build.VERSION.SDK_INT);
        txSetCommonInfo();
    }

    public static String string2Md5(String str) {
        String str2;
        if (str == null) {
            return "";
        }
        try {
            str2 = byteArrayToHexString(MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8")));
        } catch (Exception e11) {
            TXCLog.e(TAG, "string2Md5 failed.", e11);
            str2 = "";
        }
        return str2 == null ? "" : str2;
    }

    public static String txCreateToken() {
        return UUID.randomUUID().toString();
    }

    public static void txReportDAU(Context context, int i11) {
        if (context != null) {
            setCommonInfo(context);
        }
        nativeReportDAUInterval(i11, 0, "");
    }

    public static void txSetAppVersion(String str) {
        if (str != null) {
            nativeSetCommonValue(a.f43336k, str);
        }
    }

    public static void txSetCommonInfo() {
        if (mDevType != null) {
            nativeSetCommonValue(a.f43331f, mDevType);
        }
        if (mNetType != null) {
            nativeSetCommonValue(a.f43332g, mNetType);
        }
        if (mDevId != null) {
            nativeSetCommonValue(a.f43333h, mDevId);
        }
        if (mDevUUID != null) {
            nativeSetCommonValue(a.f43334i, mDevUUID);
        }
        if (mAppName != null) {
            nativeSetCommonValue(a.f43335j, mAppName);
        }
        if (mSysVersion != null) {
            nativeSetCommonValue(a.f43337l, mSysVersion);
        }
    }

    public static void txSetEventIntValue(String str, int i11, String str2, long j11) {
        nativeSetEventValueInterval(str, i11, str2, "" + j11);
    }

    public static void txSetEventValue(String str, int i11, String str2, String str3) {
        nativeSetEventValueInterval(str, i11, str2, str3);
    }

    public static void txReportDAU(Context context, int i11, int i12, String str) {
        if (context != null) {
            setCommonInfo(context);
        }
        nativeReportDAUInterval(i11, i12, str);
    }
}
