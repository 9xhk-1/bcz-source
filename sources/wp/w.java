package wp;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class w {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f96637c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* renamed from: a, reason: collision with root package name */
    public final int[] f96638a = new int[4];

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f96639b = new StringBuilder();

    public static int c(int i11) throws NotFoundException {
        for (int i12 = 0; i12 < 10; i12++) {
            if (i11 == f96637c[i12]) {
                return i12;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static int d(CharSequence charSequence) {
        int length = charSequence.length();
        int i11 = 0;
        for (int i12 = length - 2; i12 >= 0; i12 -= 2) {
            i11 += charSequence.charAt(i12) - '0';
        }
        int i13 = i11 * 3;
        for (int i14 = length - 1; i14 >= 0; i14 -= 2) {
            i13 += charSequence.charAt(i14) - '0';
        }
        return (i13 * 3) % 10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        if (r5.equals("90000") == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String e(java.lang.String r5) {
        /*
            r0 = 0
            char r1 = r5.charAt(r0)
            r2 = 48
            r3 = 1
            if (r1 == r2) goto L4d
            r2 = 53
            if (r1 == r2) goto L4a
            r2 = 57
            java.lang.String r4 = ""
            if (r1 == r2) goto L15
            goto L4f
        L15:
            int r1 = r5.hashCode()
            r2 = -1
            switch(r1) {
                case 54118329: goto L35;
                case 54395376: goto L2a;
                case 54395377: goto L1f;
                default: goto L1d;
            }
        L1d:
            r0 = r2
            goto L3e
        L1f:
            java.lang.String r0 = "99991"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L28
            goto L1d
        L28:
            r0 = 2
            goto L3e
        L2a:
            java.lang.String r0 = "99990"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L33
            goto L1d
        L33:
            r0 = r3
            goto L3e
        L35:
            java.lang.String r1 = "90000"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L3e
            goto L1d
        L3e:
            switch(r0) {
                case 0: goto L48;
                case 1: goto L45;
                case 2: goto L42;
                default: goto L41;
            }
        L41:
            goto L4f
        L42:
            java.lang.String r5 = "0.00"
            return r5
        L45:
            java.lang.String r5 = "Used"
            return r5
        L48:
            r5 = 0
            return r5
        L4a:
            java.lang.String r4 = "$"
            goto L4f
        L4d:
            java.lang.String r4 = "£"
        L4f:
            java.lang.String r5 = r5.substring(r3)
            int r5 = java.lang.Integer.parseInt(r5)
            int r0 = r5 / 100
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r5 = r5 % 100
            r1 = 10
            if (r5 >= r1) goto L6e
            java.lang.String r1 = "0"
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r1.concat(r5)
            goto L72
        L6e:
            java.lang.String r5 = java.lang.String.valueOf(r5)
        L72:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r1.append(r0)
            r0 = 46
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: wp.w.e(java.lang.String):java.lang.String");
    }

    public static Map<ResultMetadataType, Object> f(String str) {
        String e11;
        if (str.length() != 5 || (e11 = e(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(ResultMetadataType.class);
        enumMap.put((EnumMap) ResultMetadataType.SUGGESTED_PRICE, (ResultMetadataType) e11);
        return enumMap;
    }

    public final int a(kp.a aVar, int[] iArr, StringBuilder sb2) throws NotFoundException {
        int[] iArr2 = this.f96638a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m11 = aVar.m();
        int i11 = iArr[1];
        int i12 = 0;
        for (int i13 = 0; i13 < 5 && i11 < m11; i13++) {
            int j11 = y.j(aVar, iArr2, i11, y.f96649j);
            sb2.append((char) ((j11 % 10) + 48));
            for (int i14 : iArr2) {
                i11 += i14;
            }
            if (j11 >= 10) {
                i12 |= 1 << (4 - i13);
            }
            if (i13 != 4) {
                i11 = aVar.l(aVar.j(i11));
            }
        }
        if (sb2.length() != 5) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (d(sb2.toString()) == c(i12)) {
            return i11;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public com.google.zxing.k b(int i11, kp.a aVar, int[] iArr) throws NotFoundException {
        StringBuilder sb2 = this.f96639b;
        sb2.setLength(0);
        int a11 = a(aVar, iArr, sb2);
        String sb3 = sb2.toString();
        Map<ResultMetadataType, Object> f11 = f(sb3);
        float f12 = i11;
        com.google.zxing.k kVar = new com.google.zxing.k(sb3, null, new com.google.zxing.l[]{new com.google.zxing.l((iArr[0] + iArr[1]) / 2.0f, f12), new com.google.zxing.l(a11, f12)}, BarcodeFormat.UPC_EAN_EXTENSION);
        if (f11 != null) {
            kVar.i(f11);
        }
        return kVar;
    }
}
