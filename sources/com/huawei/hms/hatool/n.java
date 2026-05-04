package com.huawei.hms.hatool;

import android.util.Pair;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f35875a = Charset.forName("UTF-8");

    public static Pair<byte[], String> a(String str, int i11) {
        if (str == null || str.length() < i11) {
            return new Pair<>(new byte[0], str);
        }
        String substring = str.substring(0, i11);
        return new Pair<>(ur.d.c(substring), str.substring(i11));
    }

    public static String b(String str, String str2) {
        return ur.d.b(pr.a.x(str.getBytes(f35875a), ur.d.c(str2)));
    }

    public static String a(String str, String str2) {
        Pair<byte[], String> a11 = a(str, 32);
        return new String(pr.a.p(ur.d.c((String) a11.second), ur.d.c(str2), (byte[]) a11.first), f35875a);
    }

    public static String a(byte[] bArr, String str) {
        String str2;
        if (bArr == null || bArr.length == 0 || str == null) {
            str2 = "cbc encrypt(byte) param is not right";
        } else {
            byte[] c11 = ur.d.c(str);
            if (c11.length >= 16) {
                return ur.d.b(pr.b.u(bArr, c11));
            }
            str2 = "key length is not right";
        }
        v.b("AesCipher", str2);
        return "";
    }
}
