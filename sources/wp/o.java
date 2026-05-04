package wp;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class o extends s {

    /* renamed from: c, reason: collision with root package name */
    public static final int f96628c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final int f96629d = 1;

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f96626a = {1, 1, 1, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f96627b = {3, 1, 1};

    /* renamed from: e, reason: collision with root package name */
    public static final int[][] f96630e = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    @Override // wp.s, com.google.zxing.n
    public kp.b a(String str, BarcodeFormat barcodeFormat, int i11, int i12, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.ITF) {
            return super.a(str, barcodeFormat, i11, i12, map);
        }
        throw new IllegalArgumentException("Can only encode ITF, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // wp.s
    public boolean[] d(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        }
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        boolean[] zArr = new boolean[(length * 9) + 9];
        int c11 = s.c(zArr, 0, f96626a, true);
        for (int i11 = 0; i11 < length; i11 += 2) {
            int digit = Character.digit(str.charAt(i11), 10);
            int digit2 = Character.digit(str.charAt(i11 + 1), 10);
            int[] iArr = new int[10];
            for (int i12 = 0; i12 < 5; i12++) {
                int i13 = i12 * 2;
                int[][] iArr2 = f96630e;
                iArr[i13] = iArr2[digit][i12];
                iArr[i13 + 1] = iArr2[digit2][i12];
            }
            c11 += s.c(zArr, c11, iArr, true);
        }
        s.c(zArr, c11, f96627b, true);
        return zArr;
    }
}
