package com.heytap.mcssdk.utils;

import ct.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ApkInfoUtil {
    private static final String FBE = "file";
    private static final String RO_CRYPTO_TYPE = "ro.crypto.type";

    private static String get(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod(d.f46852f, String.class).invoke(null, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean isFBEVersion() {
        return "file".equals(get(RO_CRYPTO_TYPE));
    }
}
