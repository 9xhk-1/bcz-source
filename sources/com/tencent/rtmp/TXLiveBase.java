package com.tencent.rtmp;

import android.content.Context;
import android.util.Log;
import com.tencent.liteav.TXLiteAVExternalDecoderFactoryInterface;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.license.LicenceCheck;
import com.tencent.liteav.basic.license.e;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.basic.util.h;
import com.tencent.liteav.l;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class TXLiveBase {
    private static final String FILE_MD5_FFMPEG_ARM = "___md5_libtxffmpeg_arm_md5______";
    private static final String FILE_MD5_FFMPEG_V64 = "___md5_libtxffmpeg_v64_md5______";
    private static final String FILE_MD5_FFMPEG_V7A = "___md5_libtxffmpeg_v7a_md5______";
    private static final String FILE_MD5_LITEAV_ARM = "___md5_libliteavsdk_arm_md5_____";
    private static final String FILE_MD5_LITEAV_V64 = "___md5_libliteavsdk_v64_md5_____";
    private static final String FILE_MD5_LITEAV_V7A = "___md5_libliteavsdk_v7a_md5_____";
    private static final String FILE_MD5_SATURN_ARM = "___md5_libsaturn_arm_md5________";
    private static final String FILE_MD5_SATURN_V64 = "___md5_libsaturn_v64_md5________";
    private static final String FILE_MD5_SATURN_V7A = "___md5_libsaturn_v7a_md5________";
    private static final String FILE_MD5_TRAE_ARM = "___md5_libtraeimp_arm_md5_______";
    private static final String FILE_MD5_TRAE_V64 = "___md5_libtraeimp_v64_md5_______";
    private static final String FILE_MD5_TRAE_V7A = "___md5_libtraeimp_v7a_md5_______";
    private static final String TAG = "TXLiveBase";
    private static TXLiveBase instance = new TXLiveBase();
    private static TXLiveBaseListener listener;
    private static boolean sHasLoadedLibrary;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements TXCLog.a {
        private a() {
        }

        @Override // com.tencent.liteav.basic.log.TXCLog.a
        public void a(int i11, String str, String str2) {
            if (TXLiveBase.listener != null) {
                TXLiveBase.listener.onLog(i11, str, str2);
            }
        }
    }

    private TXLiveBase() {
    }

    private static String getFileMD5(String str, String str2) {
        File file = new File(str, str2);
        MessageDigest messageDigest = null;
        if (!file.exists() || !file.isFile()) {
            return null;
        }
        byte[] bArr = new byte[1024];
        try {
            messageDigest = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                int read = fileInputStream.read(bArr, 0, 1024);
                if (read == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, read);
            }
            fileInputStream.close();
        } catch (FileNotFoundException e11) {
            e11.printStackTrace();
        } catch (IOException e12) {
            e12.printStackTrace();
        } catch (NoSuchAlgorithmException e13) {
            e13.printStackTrace();
        }
        return new BigInteger(1, messageDigest.digest()).toString(16);
    }

    public static TXLiveBase getInstance() {
        return instance;
    }

    public static long getNetworkTimestamp() {
        if (sHasLoadedLibrary) {
            return nativeGetNetworkTimestamp();
        }
        return 0L;
    }

    public static String getPituSDKVersion() {
        return l.a();
    }

    public static String getSDKVersionStr() {
        return TXCCommonUtil.getSDKVersionStr();
    }

    public static boolean isLibraryPathValid(String str) {
        String fileMD5 = getFileMD5(str, "libliteavsdk.so");
        String fileMD52 = getFileMD5(str, "libsaturn.so");
        String fileMD53 = getFileMD5(str, "libtxffmpeg.so");
        String fileMD54 = getFileMD5(str, "libtraeimp-rtmp.so");
        Log.e(TAG, "MD5-CHECK-V64 libliteavsdk = " + fileMD5 + " FILE_MD5_LITEAV_V64 = " + FILE_MD5_LITEAV_V64);
        Log.e(TAG, "MD5-CHECK-V64 libsaturn    = " + fileMD52 + " FILE_MD5_SATURN_V64 = " + FILE_MD5_SATURN_V64);
        Log.e(TAG, "MD5-CHECK-V64 libtxffmpeg  = " + fileMD53 + " FILE_MD5_FFMPEG_V64 = " + FILE_MD5_FFMPEG_V64);
        Log.e(TAG, "MD5-CHECK-V64 libtraeimpl  = " + fileMD54 + " FILE_MD5_TRAE_V64   = " + FILE_MD5_TRAE_V64);
        if (fileMD5 != null && fileMD5.equalsIgnoreCase(FILE_MD5_LITEAV_V64) && fileMD52 != null && fileMD52.equalsIgnoreCase(FILE_MD5_SATURN_V64) && fileMD53 != null && fileMD53.equalsIgnoreCase(FILE_MD5_FFMPEG_V64) && fileMD54 != null && fileMD54.equalsIgnoreCase(FILE_MD5_TRAE_V64)) {
            return true;
        }
        Log.e(TAG, "MD5-CHECK-V7A libliteavsdk = " + fileMD5 + " FILE_MD5_LITEAV_V7A = " + FILE_MD5_LITEAV_V7A);
        Log.e(TAG, "MD5-CHECK-V7A libsaturn    = " + fileMD52 + " FILE_MD5_SATURN_V7A = " + FILE_MD5_SATURN_V7A);
        Log.e(TAG, "MD5-CHECK-V7A libtxffmpeg  = " + fileMD53 + " FILE_MD5_FFMPEG_V7A = " + FILE_MD5_FFMPEG_V7A);
        Log.e(TAG, "MD5-CHECK-V7A libtraeimpl  = " + fileMD54 + " FILE_MD5_TRAE_V7A   = " + FILE_MD5_TRAE_V7A);
        if (fileMD5 != null && fileMD5.equalsIgnoreCase(FILE_MD5_LITEAV_V7A) && fileMD52 != null && fileMD52.equalsIgnoreCase(FILE_MD5_SATURN_V7A) && fileMD53 != null && fileMD53.equalsIgnoreCase(FILE_MD5_FFMPEG_V7A) && fileMD54 != null && fileMD54.equalsIgnoreCase(FILE_MD5_TRAE_V7A)) {
            return true;
        }
        Log.e(TAG, "MD5-CHECK-ARM libliteavsdk = " + fileMD5 + " FILE_MD5_LITEAV_ARM = " + FILE_MD5_LITEAV_ARM);
        Log.e(TAG, "MD5-CHECK-ARM libsaturn    = " + fileMD52 + " FILE_MD5_SATURN_ARM = " + FILE_MD5_SATURN_ARM);
        Log.e(TAG, "MD5-CHECK-ARM libtxffmpeg  = " + fileMD53 + " FILE_MD5_FFMPEG_ARM = " + FILE_MD5_FFMPEG_ARM);
        Log.e(TAG, "MD5-CHECK-ARM libtraeimpl  = " + fileMD54 + " FILE_MD5_TRAE_ARM   = " + FILE_MD5_TRAE_ARM);
        return fileMD5 != null && fileMD5.equalsIgnoreCase(FILE_MD5_LITEAV_ARM) && fileMD52 != null && fileMD52.equalsIgnoreCase(FILE_MD5_SATURN_ARM) && fileMD53 != null && fileMD53.equalsIgnoreCase(FILE_MD5_FFMPEG_ARM) && fileMD54 != null && fileMD54.equalsIgnoreCase(FILE_MD5_TRAE_ARM);
    }

    private static native void nativeClassInit();

    private static native long nativeGetNetworkTimestamp();

    private static native int nativeUpdateNetworkTime();

    public static void onUpdateNetworkTime(int i11, String str) {
        TXLiveBaseListener tXLiveBaseListener = listener;
        if (tXLiveBaseListener != null) {
            tXLiveBaseListener.onUpdateNetworkTime(i11, str);
        }
    }

    public static void setAppID(String str) {
        TXCCommonUtil.setAppID(str);
    }

    public static void setAppVersion(String str) {
        TXCDRApi.txSetAppVersion(str);
        TXCCommonUtil.setAppVersion(str);
    }

    public static void setConsoleEnabled(boolean z11) {
        TXCLog.setConsoleEnabled(z11);
    }

    public static void setExternalDecoderFactory(TXLiteAVExternalDecoderFactoryInterface tXLiteAVExternalDecoderFactoryInterface) {
        TXCLog.i(TAG, "setExternalDecoderFactory decoderFactory = " + tXLiteAVExternalDecoderFactoryInterface);
        com.tencent.liteav.basic.a.a(tXLiteAVExternalDecoderFactoryInterface);
    }

    public static int setGlobalEnv(String str) {
        return TXCCommonUtil.setGlobalEnv(str);
    }

    public static void setLibraryPath(String str) {
        Log.i(TAG, "setLibraryPath " + str);
        h.b(str);
    }

    public static void setListener(TXLiveBaseListener tXLiveBaseListener) {
        TXCLog.setListener(new a());
        listener = tXLiveBaseListener;
    }

    public static void setLogLevel(int i11) {
        TXCLog.setLevel(i11);
    }

    public static void setPituLicencePath(String str) {
        TXCCommonUtil.setPituLicencePath(str);
    }

    public static void setUserId(String str) {
        TXCCommonUtil.setUserId(str);
    }

    public static int updateNetworkTime() {
        if (!sHasLoadedLibrary) {
            h.d();
            nativeClassInit();
            sHasLoadedLibrary = true;
        }
        return nativeUpdateNetworkTime();
    }

    public String getLicenceInfo(Context context) {
        e eVar = new e();
        LicenceCheck.a().a(eVar, context);
        return eVar.f43393a;
    }

    public void setLicence(Context context, String str, String str2) {
        LicenceCheck.a().a(context, str, str2);
    }
}
