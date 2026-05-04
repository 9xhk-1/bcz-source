package wp;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class k extends y {

    /* renamed from: k, reason: collision with root package name */
    public final int[] f96612k = new int[4];

    @Override // wp.y
    public int l(kp.a aVar, int[] iArr, StringBuilder sb2) throws NotFoundException {
        int[] iArr2 = this.f96612k;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m11 = aVar.m();
        int i11 = iArr[1];
        for (int i12 = 0; i12 < 4 && i11 < m11; i12++) {
            sb2.append((char) (y.j(aVar, iArr2, i11, y.f96648i) + 48));
            for (int i13 : iArr2) {
                i11 += i13;
            }
        }
        int i14 = y.n(aVar, i11, true, y.f96646g)[1];
        for (int i15 = 0; i15 < 4 && i14 < m11; i15++) {
            sb2.append((char) (y.j(aVar, iArr2, i14, y.f96648i) + 48));
            for (int i16 : iArr2) {
                i14 += i16;
            }
        }
        return i14;
    }

    @Override // wp.y
    public BarcodeFormat q() {
        return BarcodeFormat.EAN_8;
    }
}
