package wp;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.ResultMetadataType;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class y extends r {

    /* renamed from: d, reason: collision with root package name */
    public static final float f96643d = 0.48f;

    /* renamed from: e, reason: collision with root package name */
    public static final float f96644e = 0.7f;

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f96645f = {1, 1, 1};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f96646g = {1, 1, 1, 1, 1};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f96647h = {1, 1, 1, 1, 1, 1};

    /* renamed from: i, reason: collision with root package name */
    public static final int[][] f96648i;

    /* renamed from: j, reason: collision with root package name */
    public static final int[][] f96649j;

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f96650a = new StringBuilder(20);

    /* renamed from: b, reason: collision with root package name */
    public final x f96651b = new x();

    /* renamed from: c, reason: collision with root package name */
    public final m f96652c = new m();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f96648i = iArr;
        int[][] iArr2 = new int[20][];
        f96649j = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i11 = 10; i11 < 20; i11++) {
            int[] iArr3 = f96648i[i11 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i12 = 0; i12 < iArr3.length; i12++) {
                iArr4[i12] = iArr3[(iArr3.length - i12) - 1];
            }
            f96649j[i11] = iArr4;
        }
    }

    public static boolean i(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i11 = length - 1;
        return r(charSequence.subSequence(0, i11)) == Character.digit(charSequence.charAt(i11), 10);
    }

    public static int j(kp.a aVar, int[] iArr, int i11, int[][] iArr2) throws NotFoundException {
        r.f(aVar, i11, iArr);
        int length = iArr2.length;
        float f11 = 0.48f;
        int i12 = -1;
        for (int i13 = 0; i13 < length; i13++) {
            float e11 = r.e(iArr, iArr2[i13], 0.7f);
            if (e11 < f11) {
                i12 = i13;
                f11 = e11;
            }
        }
        if (i12 >= 0) {
            return i12;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static int[] n(kp.a aVar, int i11, boolean z11, int[] iArr) throws NotFoundException {
        return o(aVar, i11, z11, iArr, new int[iArr.length]);
    }

    public static int[] o(kp.a aVar, int i11, boolean z11, int[] iArr, int[] iArr2) throws NotFoundException {
        int m11 = aVar.m();
        int l11 = z11 ? aVar.l(i11) : aVar.j(i11);
        int length = iArr.length;
        boolean z12 = z11;
        int i12 = 0;
        int i13 = l11;
        while (l11 < m11) {
            if (aVar.h(l11) != z12) {
                iArr2[i12] = iArr2[i12] + 1;
            } else {
                if (i12 != length - 1) {
                    i12++;
                } else {
                    if (r.e(iArr2, iArr, 0.7f) < 0.48f) {
                        return new int[]{i13, l11};
                    }
                    i13 += iArr2[0] + iArr2[1];
                    int i14 = i12 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i14);
                    iArr2[i14] = 0;
                    iArr2[i12] = 0;
                    i12--;
                }
                iArr2[i12] = 1;
                z12 = !z12;
            }
            l11++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static int[] p(kp.a aVar) throws NotFoundException {
        int[] iArr = new int[f96645f.length];
        int[] iArr2 = null;
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            int[] iArr3 = f96645f;
            Arrays.fill(iArr, 0, iArr3.length, 0);
            iArr2 = o(aVar, i11, false, iArr3, iArr);
            int i12 = iArr2[0];
            int i13 = iArr2[1];
            int i14 = i12 - (i13 - i12);
            if (i14 >= 0) {
                z11 = aVar.o(i14, i12, false);
            }
            i11 = i13;
        }
        return iArr2;
    }

    public static int r(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        int i11 = 0;
        for (int i12 = length - 1; i12 >= 0; i12 -= 2) {
            int charAt = charSequence.charAt(i12) - '0';
            if (charAt < 0 || charAt > 9) {
                throw FormatException.getFormatInstance();
            }
            i11 += charAt;
        }
        int i13 = i11 * 3;
        for (int i14 = length - 2; i14 >= 0; i14 -= 2) {
            int charAt2 = charSequence.charAt(i14) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw FormatException.getFormatInstance();
            }
            i13 += charAt2;
        }
        return (1000 - i13) % 10;
    }

    @Override // wp.r
    public com.google.zxing.k b(int i11, kp.a aVar, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return m(i11, aVar, p(aVar), map);
    }

    public boolean h(String str) throws FormatException {
        return i(str);
    }

    public int[] k(kp.a aVar, int i11) throws NotFoundException {
        return n(aVar, i11, false, f96645f);
    }

    public abstract int l(kp.a aVar, int[] iArr, StringBuilder sb2) throws NotFoundException;

    public com.google.zxing.k m(int i11, kp.a aVar, int[] iArr, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int i12;
        String c11;
        com.google.zxing.m mVar = map == null ? null : (com.google.zxing.m) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        if (mVar != null) {
            mVar.a(new com.google.zxing.l((iArr[0] + iArr[1]) / 2.0f, i11));
        }
        StringBuilder sb2 = this.f96650a;
        sb2.setLength(0);
        int l11 = l(aVar, iArr, sb2);
        if (mVar != null) {
            mVar.a(new com.google.zxing.l(l11, i11));
        }
        int[] k11 = k(aVar, l11);
        if (mVar != null) {
            mVar.a(new com.google.zxing.l((k11[0] + k11[1]) / 2.0f, i11));
        }
        int i13 = k11[1];
        int i14 = (i13 - k11[0]) + i13;
        if (i14 >= aVar.m() || !aVar.o(i13, i14, false)) {
            throw NotFoundException.getNotFoundInstance();
        }
        String sb3 = sb2.toString();
        if (sb3.length() < 8) {
            throw FormatException.getFormatInstance();
        }
        if (!h(sb3)) {
            throw ChecksumException.getChecksumInstance();
        }
        BarcodeFormat q11 = q();
        float f11 = i11;
        com.google.zxing.k kVar = new com.google.zxing.k(sb3, null, new com.google.zxing.l[]{new com.google.zxing.l((iArr[1] + iArr[0]) / 2.0f, f11), new com.google.zxing.l((k11[1] + k11[0]) / 2.0f, f11)}, q11);
        try {
            com.google.zxing.k a11 = this.f96651b.a(i11, aVar, k11[1]);
            kVar.j(ResultMetadataType.UPC_EAN_EXTENSION, a11.g());
            kVar.i(a11.e());
            kVar.a(a11.f());
            i12 = a11.g().length();
        } catch (ReaderException unused) {
            i12 = 0;
        }
        int[] iArr2 = map != null ? (int[]) map.get(DecodeHintType.ALLOWED_EAN_EXTENSIONS) : null;
        if (iArr2 != null) {
            for (int i15 : iArr2) {
                if (i12 != i15) {
                }
            }
            throw NotFoundException.getNotFoundInstance();
        }
        if ((q11 == BarcodeFormat.EAN_13 || q11 == BarcodeFormat.UPC_A) && (c11 = this.f96652c.c(sb3)) != null) {
            kVar.j(ResultMetadataType.POSSIBLE_COUNTRY, c11);
        }
        return kVar;
    }

    public abstract BarcodeFormat q();
}
