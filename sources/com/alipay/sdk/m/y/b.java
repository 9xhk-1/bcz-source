package com.alipay.sdk.m.y;

import java.security.MessageDigest;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b {
    public static String a(String str) {
        try {
            if (com.alipay.sdk.m.z.a.a(str)) {
                return null;
            }
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes("UTF-8"));
            byte[] digest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b11 : digest) {
                sb2.append(String.format("%02x", Byte.valueOf(b11)));
            }
            return sb2.toString();
        } catch (Exception unused) {
            return null;
        }
    }
}
