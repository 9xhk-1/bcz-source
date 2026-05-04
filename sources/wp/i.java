package wp;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class i extends y {

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f96609l = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: k, reason: collision with root package name */
    public final int[] f96610k = new int[4];

    public static void s(StringBuilder sb2, int i11) throws NotFoundException {
        for (int i12 = 0; i12 < 10; i12++) {
            if (i11 == f96609l[i12]) {
                sb2.insert(0, (char) (i12 + 48));
                return;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // wp.y
    public int l(kp.a aVar, int[] iArr, StringBuilder sb2) throws NotFoundException {
        int[] iArr2 = this.f96610k;
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
        s(sb2, i12);
        int i15 = y.n(aVar, i11, true, y.f96646g)[1];
        for (int i16 = 0; i16 < 6 && i15 < m11; i16++) {
            sb2.append((char) (y.j(aVar, iArr2, i15, y.f96648i) + 48));
            for (int i17 : iArr2) {
                i15 += i17;
            }
        }
        return i15;
    }

    @Override // wp.y
    public BarcodeFormat q() {
        return BarcodeFormat.EAN_13;
    }
}
