package cn.com.chinatelecom.account.api.d;

/* loaded from: classes3.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9015a = "l";

    /* renamed from: b, reason: collision with root package name */
    private static byte[] f9016b = {68, 64, 94, 49, 69, 35, 50, 83};

    public static String a(byte[] bArr) {
        try {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            for (int i11 = 0; i11 < length; i11++) {
                bArr2[i11] = bArr[i11];
                for (byte b11 : f9016b) {
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
