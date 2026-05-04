package com.heytap.mcssdk.utils;

import android.text.TextUtils;
import com.heytap.mcssdk.base.Base64;
import com.heytap.msp.push.encrypt.AESEncrypt;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class CryptoUtil {
    public static String DES_KEY = "";
    public static final String DES_KEY_BASE64 = "Y29tLm5lYXJtZS5tY3M=";
    public static String mDecryptTag;

    public static String aesDecrypt(String str) {
        boolean z11;
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            str2 = AESEncrypt.decrypt(AESEncrypt.SDK_APP_SECRET, str);
            LogUtil.d("sdkDecrypt aesDecrypt aes data " + str2);
            z11 = true;
        } catch (Exception e11) {
            LogUtil.d("sdkDecrypt AES excepiton " + e11.toString());
            z11 = false;
        }
        if (TextUtils.isEmpty(str2) ? false : z11) {
            return str2;
        }
        try {
            str2 = DESUtil.decrypt(str, getDesKey());
            mDecryptTag = "DES";
            SharedPreferenceManager.getInstance().saveDecryptTag(mDecryptTag);
            LogUtil.d("sdkDecrypt aesDecrypt des data " + str2);
            return str2;
        } catch (Exception e12) {
            LogUtil.d("sdkDecrypt DES excepiton " + e12.toString());
            return str2;
        }
    }

    public static String desDecrypt(String str) {
        boolean z11;
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            str2 = DESUtil.decrypt(str, getDesKey());
            LogUtil.d("sdkDecrypt desDecrypt des data " + str2);
            z11 = true;
        } catch (Exception e11) {
            LogUtil.d("sdkDecrypt DES excepiton " + e11.toString());
            z11 = false;
        }
        if (TextUtils.isEmpty(str2) ? false : z11) {
            return str2;
        }
        try {
            str2 = AESEncrypt.decrypt(AESEncrypt.SDK_APP_SECRET, str);
            mDecryptTag = "AES";
            SharedPreferenceManager.getInstance().saveDecryptTag(mDecryptTag);
            LogUtil.d("sdkDecrypt desDecrypt aes data " + str2);
            return str2;
        } catch (Exception e12) {
            LogUtil.d("sdkDecrypt AES excepiton " + e12.toString());
            return str2;
        }
    }

    private static String getDesKey() {
        if (TextUtils.isEmpty(DES_KEY)) {
            DES_KEY = new String(Base64.decodeBase64(DES_KEY_BASE64));
        }
        byte[] swapBytes = swapBytes(getUTF8Bytes(DES_KEY));
        return swapBytes != null ? new String(swapBytes, Charset.forName("UTF-8")) : "";
    }

    public static byte[] getUTF8Bytes(String str) {
        if (str == null) {
            return new byte[0];
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return new byte[0];
        }
    }

    public static String sdkDecrypt(String str) {
        LogUtil.d("sdkDecrypt start data " + str);
        if (TextUtils.isEmpty(mDecryptTag)) {
            mDecryptTag = SharedPreferenceManager.getInstance().getDecryptTag();
        }
        if ("DES".equals(mDecryptTag)) {
            LogUtil.d("sdkDecrypt start DES");
            return desDecrypt(str);
        }
        LogUtil.d("sdkDecrypt start AES");
        return aesDecrypt(str);
    }

    public static byte[] swapBytes(byte[] bArr) {
        int length = bArr.length % 2 == 0 ? bArr.length : bArr.length - 1;
        for (int i11 = 0; i11 < length; i11 += 2) {
            byte b11 = bArr[i11];
            int i12 = i11 + 1;
            bArr[i11] = bArr[i12];
            bArr[i12] = b11;
        }
        return bArr;
    }
}
