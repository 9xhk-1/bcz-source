package k50;

import yz.m1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final /* synthetic */ class n {
    public static /* synthetic */ String a(long j11, int i11) {
        if (j11 == 0) {
            return "0";
        }
        if (j11 > 0) {
            return Long.toString(j11, i11);
        }
        if (i11 < 2 || i11 > 36) {
            i11 = 10;
        }
        int i12 = 64;
        char[] cArr = new char[64];
        int i13 = i11 - 1;
        if ((i11 & i13) == 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i11);
            do {
                i12--;
                cArr[i12] = Character.forDigit(((int) j11) & i13, i11);
                j11 >>>= numberOfTrailingZeros;
            } while (j11 != 0);
        } else {
            long a11 = (i11 & 1) == 0 ? (j11 >>> 1) / (i11 >>> 1) : m1.a(j11, i11);
            long j12 = i11;
            cArr[63] = Character.forDigit((int) (j11 - (a11 * j12)), i11);
            i12 = 63;
            while (a11 > 0) {
                i12--;
                cArr[i12] = Character.forDigit((int) (a11 % j12), i11);
                a11 /= j12;
            }
        }
        return new String(cArr, i12, 64 - i12);
    }
}
