package wp;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a extends r {

    /* renamed from: d, reason: collision with root package name */
    public static final float f96541d = 2.0f;

    /* renamed from: e, reason: collision with root package name */
    public static final float f96542e = 1.5f;

    /* renamed from: i, reason: collision with root package name */
    public static final int f96546i = 3;

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f96548a = new StringBuilder(20);

    /* renamed from: b, reason: collision with root package name */
    public int[] f96549b = new int[80];

    /* renamed from: c, reason: collision with root package name */
    public int f96550c = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final String f96543f = "0123456789-$:/.+ABCD";

    /* renamed from: g, reason: collision with root package name */
    public static final char[] f96544g = f96543f.toCharArray();

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f96545h = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: j, reason: collision with root package name */
    public static final char[] f96547j = {'A', 'B', 'C', 'D'};

    public static boolean h(char[] cArr, char c11) {
        if (cArr != null) {
            for (char c12 : cArr) {
                if (c12 == c11) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // wp.r
    public com.google.zxing.k b(int i11, kp.a aVar, Map<DecodeHintType, ?> map) throws NotFoundException {
        int i12;
        Arrays.fill(this.f96549b, 0);
        k(aVar);
        int j11 = j();
        this.f96548a.setLength(0);
        int i13 = j11;
        while (true) {
            int l11 = l(i13);
            if (l11 == -1) {
                throw NotFoundException.getNotFoundInstance();
            }
            this.f96548a.append((char) l11);
            i12 = i13 + 8;
            if ((this.f96548a.length() <= 1 || !h(f96547j, f96544g[l11])) && i12 < this.f96550c) {
                i13 = i12;
            }
        }
        int i14 = i13 + 7;
        int i15 = this.f96549b[i14];
        int i16 = 0;
        for (int i17 = -8; i17 < -1; i17++) {
            i16 += this.f96549b[i12 + i17];
        }
        if (i12 < this.f96550c && i15 < i16 / 2) {
            throw NotFoundException.getNotFoundInstance();
        }
        m(j11);
        for (int i18 = 0; i18 < this.f96548a.length(); i18++) {
            StringBuilder sb2 = this.f96548a;
            sb2.setCharAt(i18, f96544g[sb2.charAt(i18)]);
        }
        char charAt = this.f96548a.charAt(0);
        char[] cArr = f96547j;
        if (!h(cArr, charAt)) {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder sb3 = this.f96548a;
        if (!h(cArr, sb3.charAt(sb3.length() - 1))) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (this.f96548a.length() <= 3) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (map == null || !map.containsKey(DecodeHintType.RETURN_CODABAR_START_END)) {
            StringBuilder sb4 = this.f96548a;
            sb4.deleteCharAt(sb4.length() - 1);
            this.f96548a.deleteCharAt(0);
        }
        int i19 = 0;
        for (int i21 = 0; i21 < j11; i21++) {
            i19 += this.f96549b[i21];
        }
        float f11 = i19;
        while (j11 < i14) {
            i19 += this.f96549b[j11];
            j11++;
        }
        float f12 = i11;
        return new com.google.zxing.k(this.f96548a.toString(), null, new com.google.zxing.l[]{new com.google.zxing.l(f11, f12), new com.google.zxing.l(i19, f12)}, BarcodeFormat.CODABAR);
    }

    public final void i(int i11) {
        int[] iArr = this.f96549b;
        int i12 = this.f96550c;
        iArr[i12] = i11;
        int i13 = i12 + 1;
        this.f96550c = i13;
        if (i13 >= iArr.length) {
            int[] iArr2 = new int[i13 << 1];
            System.arraycopy(iArr, 0, iArr2, 0, i13);
            this.f96549b = iArr2;
        }
    }

    public final int j() throws NotFoundException {
        for (int i11 = 1; i11 < this.f96550c; i11 += 2) {
            int l11 = l(i11);
            if (l11 != -1 && h(f96547j, f96544g[l11])) {
                int i12 = 0;
                for (int i13 = i11; i13 < i11 + 7; i13++) {
                    i12 += this.f96549b[i13];
                }
                if (i11 == 1 || this.f96549b[i11 - 1] >= i12 / 2) {
                    return i11;
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final void k(kp.a aVar) throws NotFoundException {
        int i11 = 0;
        this.f96550c = 0;
        int l11 = aVar.l(0);
        int m11 = aVar.m();
        if (l11 >= m11) {
            throw NotFoundException.getNotFoundInstance();
        }
        boolean z11 = true;
        while (l11 < m11) {
            if (aVar.h(l11) != z11) {
                i11++;
            } else {
                i(i11);
                z11 = !z11;
                i11 = 1;
            }
            l11++;
        }
        i(i11);
    }

    public final int l(int i11) {
        int i12 = i11 + 7;
        if (i12 >= this.f96550c) {
            return -1;
        }
        int[] iArr = this.f96549b;
        int i13 = Integer.MAX_VALUE;
        int i14 = 0;
        int i15 = Integer.MAX_VALUE;
        int i16 = 0;
        for (int i17 = i11; i17 < i12; i17 += 2) {
            int i18 = iArr[i17];
            if (i18 < i15) {
                i15 = i18;
            }
            if (i18 > i16) {
                i16 = i18;
            }
        }
        int i19 = (i15 + i16) / 2;
        int i21 = 0;
        for (int i22 = i11 + 1; i22 < i12; i22 += 2) {
            int i23 = iArr[i22];
            if (i23 < i13) {
                i13 = i23;
            }
            if (i23 > i21) {
                i21 = i23;
            }
        }
        int i24 = (i13 + i21) / 2;
        int i25 = 128;
        int i26 = 0;
        for (int i27 = 0; i27 < 7; i27++) {
            i25 >>= 1;
            if (iArr[i11 + i27] > ((i27 & 1) == 0 ? i19 : i24)) {
                i26 |= i25;
            }
        }
        while (true) {
            int[] iArr2 = f96545h;
            if (i14 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i14] == i26) {
                return i14;
            }
            i14++;
        }
    }

    public final void m(int i11) throws NotFoundException {
        int[] iArr = new int[4];
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        int[] iArr2 = new int[4];
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int length = this.f96548a.length() - 1;
        int i12 = i11;
        int i13 = 0;
        while (true) {
            int i14 = f96545h[this.f96548a.charAt(i13)];
            for (int i15 = 6; i15 >= 0; i15--) {
                int i16 = (i15 & 1) + ((i14 & 1) << 1);
                iArr[i16] = iArr[i16] + this.f96549b[i12 + i15];
                iArr2[i16] = iArr2[i16] + 1;
                i14 >>= 1;
            }
            if (i13 >= length) {
                break;
            }
            i12 += 8;
            i13++;
        }
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        for (int i17 = 0; i17 < 2; i17++) {
            fArr2[i17] = 0.0f;
            int i18 = i17 + 2;
            int i19 = iArr[i18];
            int i21 = iArr2[i18];
            float f11 = ((iArr[i17] / iArr2[i17]) + (i19 / i21)) / 2.0f;
            fArr2[i18] = f11;
            fArr[i17] = f11;
            fArr[i18] = ((i19 * 2.0f) + 1.5f) / i21;
        }
        int i22 = i11;
        int i23 = 0;
        loop3: while (true) {
            int i24 = f96545h[this.f96548a.charAt(i23)];
            for (int i25 = 6; i25 >= 0; i25--) {
                int i26 = (i25 & 1) + ((i24 & 1) << 1);
                float f12 = this.f96549b[i22 + i25];
                if (f12 < fArr2[i26] || f12 > fArr[i26]) {
                    break loop3;
                }
                i24 >>= 1;
            }
            if (i23 >= length) {
                return;
            }
            i22 += 8;
            i23++;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
