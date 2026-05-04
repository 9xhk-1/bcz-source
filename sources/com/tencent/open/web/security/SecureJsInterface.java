package com.tencent.open.web.security;

import com.tencent.open.b;
import com.tencent.open.log.SLog;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class SecureJsInterface extends b.C0523b {
    public static boolean isPWDEdit = false;

    /* renamed from: a, reason: collision with root package name */
    private String f44620a;

    public void clearAllEdit() {
        SLog.i("openSDK_LOG.SecureJsInterface", "-->clear all edit.");
        try {
            JniInterface.clearAllPWD();
        } catch (Exception e11) {
            SLog.e("openSDK_LOG.SecureJsInterface", "-->clear all edit exception: " + e11.getMessage());
            throw new RuntimeException(e11);
        }
    }

    public void curPosFromJS(String str) {
        int i11;
        SLog.d("openSDK_LOG.SecureJsInterface", "-->curPosFromJS: " + str);
        try {
            i11 = Integer.parseInt(str);
        } catch (NumberFormatException e11) {
            SLog.e("openSDK_LOG.SecureJsInterface", "-->curPosFromJS number format exception.", e11);
            i11 = -1;
        }
        if (i11 < 0) {
            throw new RuntimeException("position is illegal.");
        }
        boolean z11 = a.f44623c;
        boolean z12 = a.f44622b;
        if (z12) {
            if (JniInterface.BackSpaceChar(z12, i11)) {
                a.f44622b = false;
                return;
            }
            return;
        }
        String str2 = a.f44621a;
        this.f44620a = str2;
        JniInterface.insetTextToArray(i11, str2, str2.length());
        SLog.v("openSDK_LOG.SecureJsInterface", "curPosFromJS mKey: " + this.f44620a);
    }

    @Override // com.tencent.open.b.C0523b
    public boolean customCallback() {
        return true;
    }

    public String getMD5FromNative() {
        SLog.i("openSDK_LOG.SecureJsInterface", "-->get md5 form native");
        try {
            String pWDKeyToMD5 = JniInterface.getPWDKeyToMD5(null);
            SLog.v("openSDK_LOG.SecureJsInterface", "-->getMD5FromNative, MD5= " + pWDKeyToMD5);
            return pWDKeyToMD5;
        } catch (Exception e11) {
            SLog.e("openSDK_LOG.SecureJsInterface", "-->get md5 form native exception: " + e11.getMessage());
            throw new RuntimeException(e11);
        }
    }

    public void isPasswordEdit(String str) {
        int i11;
        SLog.i("openSDK_LOG.SecureJsInterface", "-->is pswd edit, flag: " + str);
        try {
            i11 = Integer.parseInt(str);
        } catch (Exception e11) {
            SLog.e("openSDK_LOG.SecureJsInterface", "-->is pswd edit exception: " + e11.getMessage());
            i11 = -1;
        }
        if (i11 != 0 && i11 != 1) {
            throw new RuntimeException("is pswd edit flag is illegal.");
        }
        if (i11 == 0) {
            isPWDEdit = false;
        } else if (i11 == 1) {
            isPWDEdit = true;
        }
    }
}
