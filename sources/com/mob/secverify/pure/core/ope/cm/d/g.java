package com.mob.secverify.pure.core.ope.cm.d;

import android.text.TextUtils;
import java.security.MessageDigest;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f41028a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return a(str.getBytes("utf-8"));
        } catch (Exception unused) {
            return null;
        }
    }

    private static String b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        char[] cArr = new char[bArr.length * 2];
        int i11 = 0;
        for (byte b11 : bArr) {
            char[] cArr2 = f41028a;
            cArr[i11] = cArr2[(b11 >>> 4) & 15];
            cArr[i11 + 1] = cArr2[b11 & 15];
            i11 += 2;
        }
        return new String(cArr);
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(bArr);
            return b(messageDigest.digest());
        } catch (Exception unused) {
            return null;
        }
    }
}
