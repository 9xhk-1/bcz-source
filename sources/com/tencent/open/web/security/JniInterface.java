package com.tencent.open.web.security;

import android.content.Context;
import com.tencent.connect.auth.AuthAgent;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.g;
import java.io.File;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class JniInterface {
    public static boolean isJniOk = false;

    public static native boolean BackSpaceChar(boolean z11, int i11);

    public static native boolean clearAllPWD();

    public static native String d1(String str);

    public static native String d2(String str);

    public static native String getPWDKeyToMD5(String str);

    public static native boolean insetTextToArray(int i11, String str, int i12);

    public static void loadSo() {
        if (isJniOk) {
            return;
        }
        try {
            Context a11 = g.a();
            if (a11 == null) {
                SLog.i("openSDK_LOG.JniInterface", "-->load lib fail, because context is null:" + AuthAgent.SECURE_LIB_NAME);
                return;
            }
            if (!new File(a11.getFilesDir().toString() + "/" + AuthAgent.SECURE_LIB_NAME).exists()) {
                SLog.i("openSDK_LOG.JniInterface", "-->fail, because so is not exists:" + AuthAgent.SECURE_LIB_NAME);
                return;
            }
            System.load(a11.getFilesDir().toString() + "/" + AuthAgent.SECURE_LIB_NAME);
            isJniOk = true;
            SLog.i("openSDK_LOG.JniInterface", "-->load lib success:" + AuthAgent.SECURE_LIB_NAME);
        } catch (Throwable th2) {
            SLog.e("openSDK_LOG.JniInterface", "-->load lib error:" + AuthAgent.SECURE_LIB_NAME, th2);
        }
    }
}
