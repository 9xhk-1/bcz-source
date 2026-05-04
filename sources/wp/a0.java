package wp;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a0 extends y {

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f96551l = {1, 1, 1, 1, 1, 1};

    /* renamed from: m, reason: collision with root package name */
    public static final int[][] f96552m = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: k, reason: collision with root package name */
    public final int[] f96553k = new int[4];

    public static String s(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb2 = new StringBuilder(12);
        sb2.append(str.charAt(0));
        char c11 = cArr[5];
        switch (c11) {
            case '0':
            case '1':
            case '2':
                sb2.append(cArr, 0, 2);
                sb2.append(c11);
                sb2.append("0000");
                sb2.append(cArr, 2, 3);
                break;
            case '3':
                sb2.append(cArr, 0, 3);
                sb2.append("00000");
                sb2.append(cArr, 3, 2);
                break;
            case '4':
                sb2.append(cArr, 0, 4);
                sb2.append("00000");
                sb2.append(cArr[4]);
                break;
            default:
                sb2.append(cArr, 0, 5);
                sb2.append("0000");
                sb2.append(c11);
                break;
        }
        if (str.length() >= 8) {
            sb2.append(str.charAt(7));
        }
        return sb2.toString();
    }

    public static void t(StringBuilder sb2, int i11) throws NotFoundException {
        for (int i12 = 0; i12 <= 1; i12++) {
            for (int i13 = 0; i13 < 10; i13++) {
                if (i11 == f96552m[i12][i13]) {
                    sb2.insert(0, (char) (i12 + 48));
                    sb2.append((char) (i13 + 48));
                    return;
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // wp.y
    public boolean h(String str) throws FormatException {
        return super.h(s(str));
    }

    @Override // wp.y
    public int[] k(kp.a aVar, int i11) throws NotFoundException {
        return y.n(aVar, i11, true, f96551l);
    }

    @Override // wp.y
    public int l(kp.a aVar, int[] iArr, StringBuilder sb2) throws NotFoundException {
        int[] iArr2 = this.f96553k;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m11 = aVar.m();
        int i11 = iArr[1];
        int i12 = 0;
        for (int i13 = 0; i13 < 6 && i11 < m11; i13++) {
            int j11 = y.j(aVar, iArr2, i11, y.f96649j);
            sb2.append((char) ((j11 % 10) + 48));
            for (int i14 : iArr2) {
                i11 += i14;
            }
            if (j11 >= 10) {
                i12 |= 1 << (5 - i13);
            }
        }
        t(sb2, i12);
        return i11;
    }

    @Override // wp.y
    public BarcodeFormat q() {
        return BarcodeFormat.UPC_E;
    }
}
