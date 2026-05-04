package cn.com.chinatelecom.account.api.a;

import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8847a = "d";

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f8848b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    private static byte[] f8849c = {68, 64, 94, 49, 50, 83};

    public static String a(byte[] bArr) {
        try {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            for (int i11 = 0; i11 < length; i11++) {
                bArr2[i11] = bArr[i11];
                for (byte b11 : f8849c) {
                    bArr2[i11] = (byte) (b11 ^ bArr2[i11]);
                }
            }
            return new String(bArr2);
        } catch (Throwable th2) {
            th2.printStackTrace();
            return "";
        }
    }
}
