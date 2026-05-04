package com.tencent.liteav.basic.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiManager;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class TXCCommonUtil {
    private static final String TAG = "TXCCommonUtil";
    private static String mAppID = "";
    private static String mStrAppVersion = "";
    private static String mUserId = "";
    public static String pituLicencePath = "YTFaceSDK.licence";
    private static Context sApplicationContext;

    static {
        h.d();
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static Context getAppContext() {
        return sApplicationContext;
    }

    public static String getAppFilePath() {
        Context context = sApplicationContext;
        String absolutePath = context != null ? context.getFilesDir().getAbsolutePath() : "/sdcard/liteav";
        File file = new File(absolutePath);
        if (!file.exists()) {
            file.mkdirs();
        }
        return absolutePath;
    }

    public static String getAppID() {
        return mAppID;
    }

    public static String getAppNameByStreamUrl(String str) {
        if (str != null && str.length() != 0) {
            int indexOf = str.indexOf("?");
            if (indexOf != -1) {
                str = str.substring(0, indexOf);
            }
            if (str != null && str.length() != 0) {
                int lastIndexOf = str.lastIndexOf("/");
                if (lastIndexOf != -1) {
                    str = str.substring(0, lastIndexOf);
                }
                if (str != null && str.length() != 0) {
                    int lastIndexOf2 = str.lastIndexOf("/");
                    if (lastIndexOf2 != -1) {
                        str = str.substring(lastIndexOf2 + 1);
                    }
                    if (str != null && str.length() != 0) {
                        return str;
                    }
                }
            }
        }
        return null;
    }

    public static String getAppPackageName() {
        return h.c(sApplicationContext);
    }

    public static String getAppVersion() {
        return mStrAppVersion;
    }

    public static ClassLoader getClassLoader() {
        return TXCCommonUtil.class.getClassLoader();
    }

    public static String getConfigCenterKey() {
        return nativeGetConfigCenterKey();
    }

    public static String getCurEnvProxyDomain() {
        return nativeGetCurEnvProxyDomain();
    }

    public static int getCurEnvProxySDKAppId() {
        return nativeGetCurEnvProxySDKAppId();
    }

    public static String getCurEnvServerConfigUrl() {
        return nativeGetCurEnvServerConfigUrl();
    }

    public static final String getDeviceInfo() {
        try {
            return e.f43438b + "_" + e.f43437a + "_" + e.f43441e;
        } catch (Exception unused) {
            return "unknown_device";
        }
    }

    public static String getFileExtension(String str) {
        int lastIndexOf;
        if (str == null || str.length() <= 0 || (lastIndexOf = str.lastIndexOf(46)) <= -1 || lastIndexOf >= str.length() - 1) {
            return null;
        }
        return str.substring(lastIndexOf + 1);
    }

    public static int getGateway() {
        Context context = sApplicationContext;
        if (context == null) {
            return 0;
        }
        try {
            return ((WifiManager) context.getSystemService("wifi")).getDhcpInfo().gateway;
        } catch (Exception e11) {
            TXCLog.e(TAG, "getGateway error ", e11);
            return 0;
        }
    }

    public static String getLogUploadPath() {
        File externalFilesDir;
        Context context = sApplicationContext;
        if (context == null || (externalFilesDir = context.getExternalFilesDir(null)) == null) {
            return "";
        }
        return externalFilesDir.getAbsolutePath() + "/log/liteav";
    }

    public static String getMD5(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer("");
            for (int i11 = 0; i11 < digest.length; i11++) {
                int i12 = digest[i11];
                if (i12 < 0) {
                    i12 += 256;
                }
                if (i12 < 16) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(i12));
            }
            return stringBuffer.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public static int getSDKID() {
        return nativeGetSDKID();
    }

    public static int[] getSDKVersion() {
        String[] split = nativeGetSDKVersion().split("\\.");
        int[] iArr = new int[split.length];
        for (int i11 = 0; i11 < split.length; i11++) {
            try {
                iArr[i11] = Integer.parseInt(split[i11]);
            } catch (NumberFormatException e11) {
                TXCLog.e(TAG, "parse version failed.", e11);
                iArr[i11] = 0;
            }
        }
        return iArr;
    }

    public static String getSDKVersionStr() {
        return nativeGetSDKVersion();
    }

    public static String getStreamIDByStreamUrl(String str) {
        if (str != null && str.length() != 0) {
            int indexOf = str.indexOf("?");
            if (indexOf != -1) {
                str = str.substring(0, indexOf);
            }
            if (str != null && str.length() != 0) {
                int lastIndexOf = str.lastIndexOf("/");
                if (lastIndexOf != -1) {
                    str = str.substring(lastIndexOf + 1);
                }
                if (str != null && str.length() != 0) {
                    int indexOf2 = str.indexOf(".");
                    if (indexOf2 != -1) {
                        str = str.substring(0, indexOf2);
                    }
                    if (str != null && str.length() != 0) {
                        return str;
                    }
                }
            }
        }
        return null;
    }

    public static String getUserId() {
        return mUserId;
    }

    public static String loadString(String str) {
        Context context = sApplicationContext;
        if (context == null) {
            return "";
        }
        try {
            return context.getSharedPreferences("TXCCommonConfig", 0).getString(str, "");
        } catch (Exception e11) {
            TXCLog.e(TAG, "load string failed.", e11);
            return "";
        }
    }

    public static long loadUInt64(String str) {
        Context context = sApplicationContext;
        if (context == null) {
            return 0L;
        }
        try {
            return context.getSharedPreferences("TXCCommonConfig", 0).getLong(str, 0L);
        } catch (Exception e11) {
            TXCLog.e(TAG, "load uint64 failed.", e11);
            return 0L;
        }
    }

    private static native String nativeGetConfigCenterKey();

    private static native String nativeGetCurEnvProxyDomain();

    private static native int nativeGetCurEnvProxySDKAppId();

    private static native String nativeGetCurEnvServerConfigUrl();

    private static native int nativeGetSDKID();

    private static native String nativeGetSDKVersion();

    private static native int nativeSetGlobalEnv(String str);

    public static void saveString(String str, String str2) {
        Context context = sApplicationContext;
        if (context == null) {
            return;
        }
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences("TXCCommonConfig", 0).edit();
            edit.putString(str, str2);
            edit.commit();
        } catch (Exception e11) {
            TXCLog.e(TAG, "save string failed", e11);
        }
    }

    public static void saveUInt64(String str, long j11) {
        Context context = sApplicationContext;
        if (context == null) {
            return;
        }
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences("TXCCommonConfig", 0).edit();
            edit.putLong(str, j11);
            edit.commit();
        } catch (Exception e11) {
            TXCLog.e(TAG, "save uint64 failed.", e11);
        }
    }

    public static void setAppContext(Context context) {
        if (context == null) {
            return;
        }
        sApplicationContext = context.getApplicationContext();
    }

    public static void setAppID(String str) {
        mAppID = str;
    }

    public static void setAppVersion(String str) {
        mStrAppVersion = str;
    }

    public static int setGlobalEnv(String str) {
        return nativeSetGlobalEnv(str);
    }

    public static void setPituLicencePath(String str) {
        pituLicencePath = str;
    }

    public static void setUserId(String str) {
        mUserId = str;
    }

    public static void sleep(int i11) {
        try {
            Thread.sleep(i11);
        } catch (InterruptedException unused) {
        }
    }

    public static boolean unzip(String str, String str2) {
        ZipInputStream zipInputStream;
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                zipInputStream = new ZipInputStream(new BufferedInputStream(fileInputStream2));
                while (true) {
                    try {
                        ZipEntry nextEntry = zipInputStream.getNextEntry();
                        if (nextEntry == null) {
                            c.a(fileInputStream2);
                            c.a(zipInputStream);
                            return true;
                        }
                        File file = new File(str2, nextEntry.getName());
                        if (nextEntry.isDirectory()) {
                            file.mkdirs();
                        } else {
                            file.getParentFile().mkdirs();
                            c.a(zipInputStream, file.getAbsolutePath());
                            zipInputStream.closeEntry();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        try {
                            TXCLog.e(TAG, "unzip " + str + " failed.", th);
                            c.a(fileInputStream);
                            c.a(zipInputStream);
                            return false;
                        } catch (Throwable th3) {
                            c.a(fileInputStream);
                            c.a(zipInputStream);
                            throw th3;
                        }
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                zipInputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            zipInputStream = null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:9|(2:10|11)|(9:17|18|19|20|(3:21|(1:23)(0)|24)|25|26|27|28)|42|43|45|28|7) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void zip(java.util.ArrayList<java.lang.String> r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "TXCCommonUtil"
            java.io.File r1 = new java.io.File
            r1.<init>(r10)
            r10 = 0
            java.util.zip.ZipOutputStream r2 = new java.util.zip.ZipOutputStream     // Catch: java.lang.Throwable -> L8c java.io.FileNotFoundException -> L8e
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L8c java.io.FileNotFoundException -> L8e
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L8c java.io.FileNotFoundException -> L8e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8c java.io.FileNotFoundException -> L8e
            java.lang.String r1 = "LiteAV log"
            r2.setComment(r1)     // Catch: java.lang.Throwable -> L6c java.io.FileNotFoundException -> L86
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L6c java.io.FileNotFoundException -> L86
        L1b:
            boolean r1 = r9.hasNext()     // Catch: java.lang.Throwable -> L6c java.io.FileNotFoundException -> L86
            if (r1 == 0) goto L88
            java.lang.Object r1 = r9.next()     // Catch: java.lang.Throwable -> L6c java.io.FileNotFoundException -> L86
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L6c java.io.FileNotFoundException -> L86
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L6c java.io.FileNotFoundException -> L86
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L6c java.io.FileNotFoundException -> L86
            long r4 = r3.length()     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L73
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L78
            long r4 = r3.length()     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L73
            r6 = 8388608(0x800000, double:4.144523E-317)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L42
            goto L78
        L42:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L73
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L73
            java.util.zip.ZipEntry r10 = new java.util.zip.ZipEntry     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L66
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L66
            r10.<init>(r3)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L66
            r2.putNextEntry(r10)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L66
            r10 = 8192(0x2000, float:1.14794E-41)
            byte[] r10 = new byte[r10]     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L66
        L57:
            int r3 = r1.read(r10)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L66
            r4 = -1
            if (r3 == r4) goto L68
            r4 = 0
            r2.write(r10, r4, r3)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L66
            goto L57
        L63:
            r9 = move-exception
            r10 = r1
            goto L82
        L66:
            r10 = move-exception
            goto L7c
        L68:
            r1.close()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            goto L6f
        L6c:
            r9 = move-exception
            r10 = r2
            goto L97
        L6f:
            r10 = r1
            goto L1b
        L71:
            r9 = move-exception
            goto L82
        L73:
            r1 = move-exception
            r8 = r1
            r1 = r10
            r10 = r8
            goto L7c
        L78:
            r10.close()     // Catch: java.lang.Exception -> L1b java.lang.Throwable -> L6c
            goto L1b
        L7c:
            java.lang.String r3 = "zip failed."
            com.tencent.liteav.basic.log.TXCLog.e(r0, r3, r10)     // Catch: java.lang.Throwable -> L63
            goto L68
        L82:
            r10.close()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L85
        L85:
            throw r9     // Catch: java.lang.Throwable -> L6c java.io.FileNotFoundException -> L86
        L86:
            r10 = r2
            goto L8e
        L88:
            r2.close()     // Catch: java.lang.Exception -> L96
            goto L96
        L8c:
            r9 = move-exception
            goto L97
        L8e:
            java.lang.String r9 = "zip log error"
            com.tencent.liteav.basic.log.TXCLog.w(r0, r9)     // Catch: java.lang.Throwable -> L8c
            r10.close()     // Catch: java.lang.Exception -> L96
        L96:
            return
        L97:
            r10.close()     // Catch: java.lang.Exception -> L9a
        L9a:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.basic.util.TXCCommonUtil.zip(java.util.ArrayList, java.lang.String):void");
    }

    public static byte[] getMD5(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Exception unused) {
            return null;
        }
    }
}
