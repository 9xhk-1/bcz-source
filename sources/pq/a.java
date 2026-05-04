package pq;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f81107a = "0123456789ABCDEF".toCharArray();

    public static byte[] a(char[] cArr) {
        if ((cArr.length & 1) != 0) {
            throw new IllegalArgumentException("Odd number of characters.");
        }
        byte[] bArr = new byte[cArr.length >> 1];
        int i11 = 0;
        int i12 = 0;
        while (i11 < cArr.length) {
            int digit = Character.digit(cArr[i11], 16);
            if (digit == -1) {
                throw new IllegalArgumentException("Illegal hexadecimal character at index " + i11);
            }
            int i13 = i11 + 1;
            int digit2 = Character.digit(cArr[i13], 16);
            if (digit2 == -1) {
                throw new IllegalArgumentException("Illegal hexadecimal character at index " + i13);
            }
            i11 += 2;
            bArr[i12] = (byte) (((digit << 4) | digit2) & 255);
            i12++;
        }
        return bArr;
    }

    public static byte[] b(String str) {
        return a(str.toCharArray());
    }

    public static String c(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b11 : bArr) {
            char[] cArr = f81107a;
            sb2.append(cArr[(b11 >> 4) & 15]);
            sb2.append(cArr[b11 & 15]);
        }
        return sb2.toString();
    }
}
