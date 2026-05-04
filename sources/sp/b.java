package sp;

import java.text.DecimalFormat;
import kp.d;
import kx.a0;
import s60.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char f88879a = 65520;

    /* renamed from: b, reason: collision with root package name */
    public static final char f88880b = 65521;

    /* renamed from: c, reason: collision with root package name */
    public static final char f88881c = 65522;

    /* renamed from: d, reason: collision with root package name */
    public static final char f88882d = 65523;

    /* renamed from: e, reason: collision with root package name */
    public static final char f88883e = 65524;

    /* renamed from: f, reason: collision with root package name */
    public static final char f88884f = 65525;

    /* renamed from: g, reason: collision with root package name */
    public static final char f88885g = 65526;

    /* renamed from: h, reason: collision with root package name */
    public static final char f88886h = 65527;

    /* renamed from: i, reason: collision with root package name */
    public static final char f88887i = 65528;

    /* renamed from: j, reason: collision with root package name */
    public static final char f88888j = 65529;

    /* renamed from: k, reason: collision with root package name */
    public static final char f88889k = 65530;

    /* renamed from: l, reason: collision with root package name */
    public static final char f88890l = 65531;

    /* renamed from: m, reason: collision with root package name */
    public static final char f88891m = 65532;

    /* renamed from: n, reason: collision with root package name */
    public static final char f88892n = 28;

    /* renamed from: o, reason: collision with root package name */
    public static final char f88893o = 29;

    /* renamed from: p, reason: collision with root package name */
    public static final char f88894p = 30;

    /* renamed from: q, reason: collision with root package name */
    public static final String[] f88895q = {"\nABCDEFGHIJKLMNOPQRSTUVWXYZ\ufffa\u001c\u001d\u001e\ufffb ￼\"#$%&'()*+,-./0123456789:\ufff1\ufff2\ufff3\ufff4\ufff8", "`abcdefghijklmnopqrstuvwxyz\ufffa\u001c\u001d\u001e\ufffb{￼}~\u007f;<=>?[\\]^_ ,./:@!|￼\ufff5\ufff6￼\ufff0\ufff2\ufff3\ufff4\ufff7", "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚ\ufffa\u001c\u001d\u001eÛÜÝÞßª¬±²³µ¹º¼½¾\u0080\u0081\u0082\u0083\u0084\u0085\u0086\u0087\u0088\u0089\ufff7 \ufff9\ufff3\ufff4\ufff8", "àáâãäåæçèéêëìíîïðñòóôõö÷øùú\ufffa\u001c\u001d\u001e\ufffbûüýþÿ¡¨«¯°´·¸»¿\u008a\u008b\u008c\u008d\u008e\u008f\u0090\u0091\u0092\u0093\u0094\ufff7 \ufff2\ufff9\ufff4\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\ufffa￼￼\u001b\ufffb\u001c\u001d\u001e\u001f\u009f ¢£¤¥¦§©\u00ad®¶\u0095\u0096\u0097\u0098\u0099\u009a\u009b\u009c\u009d\u009e\ufff7 \ufff2\ufff3\ufff9\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?"};

    public static d a(byte[] bArr, int i11) {
        String h11;
        StringBuilder sb2 = new StringBuilder(144);
        if (i11 == 2 || i11 == 3) {
            if (i11 == 2) {
                h11 = new DecimalFormat("0000000000".substring(0, g(bArr))).format(f(bArr));
            } else {
                h11 = h(bArr);
            }
            DecimalFormat decimalFormat = new DecimalFormat("000");
            String format = decimalFormat.format(c(bArr));
            String format2 = decimalFormat.format(i(bArr));
            sb2.append(e(bArr, 10, 84));
            if (sb2.toString().startsWith("[)>\u001e01\u001d")) {
                sb2.insert(9, h11 + f88893o + format + f88893o + format2 + f88893o);
            } else {
                sb2.insert(0, h11 + f88893o + format + f88893o + format2 + f88893o);
            }
        } else if (i11 == 4) {
            sb2.append(e(bArr, 1, 93));
        } else if (i11 == 5) {
            sb2.append(e(bArr, 1, 77));
        }
        return new d(bArr, sb2.toString(), null, String.valueOf(i11));
    }

    public static int b(int i11, byte[] bArr) {
        int i12 = i11 - 1;
        return ((1 << (5 - (i12 % 6))) & bArr[i12 / 6]) == 0 ? 0 : 1;
    }

    public static int c(byte[] bArr) {
        return d(bArr, new byte[]{53, 54, 43, 44, a0.f68904b, 46, 47, 48, e.f88061c, 38});
    }

    public static int d(byte[] bArr, byte[] bArr2) {
        if (bArr2.length == 0) {
            throw new IllegalArgumentException();
        }
        int i11 = 0;
        for (int i12 = 0; i12 < bArr2.length; i12++) {
            i11 += b(bArr2[i12], bArr) << ((bArr2.length - i12) - 1);
        }
        return i11;
    }

    public static String e(byte[] bArr, int i11, int i12) {
        StringBuilder sb2 = new StringBuilder();
        int i13 = i11;
        int i14 = -1;
        int i15 = 0;
        int i16 = 0;
        while (i13 < i11 + i12) {
            char charAt = f88895q[i15].charAt(bArr[i13]);
            switch (charAt) {
                case 65520:
                case 65521:
                case 65522:
                case 65523:
                case 65524:
                    i16 = i15;
                    i15 = charAt - f88879a;
                    i14 = 1;
                    break;
                case 65525:
                    i14 = 2;
                    i16 = i15;
                    i15 = 0;
                    break;
                case 65526:
                    i14 = 3;
                    i16 = i15;
                    i15 = 0;
                    break;
                case 65527:
                    i14 = -1;
                    i15 = 0;
                    break;
                case 65528:
                    i14 = -1;
                    i15 = 1;
                    break;
                case 65529:
                    i14 = -1;
                    break;
                case 65530:
                default:
                    sb2.append(charAt);
                    break;
                case 65531:
                    int i17 = (bArr[i13 + 1] << ho.c.B) + (bArr[i13 + 2] << ho.c.f59556u) + (bArr[i13 + 3] << 12) + (bArr[i13 + 4] << 6);
                    i13 += 5;
                    sb2.append(new DecimalFormat("000000000").format(i17 + bArr[i13]));
                    break;
            }
            int i18 = i14 - 1;
            if (i14 == 0) {
                i15 = i16;
            }
            i13++;
            i14 = i18;
        }
        while (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == 65532) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2.toString();
    }

    public static int f(byte[] bArr) {
        return d(bArr, new byte[]{33, 34, 35, 36, ho.c.C, ho.c.D, ho.c.E, 28, ho.c.G, ho.c.H, 19, 20, ho.c.f59560y, ho.c.f59561z, ho.c.A, ho.c.B, 13, 14, 15, 16, 17, ho.c.f59556u, 7, 8, 9, 10, 11, 12, 1, 2});
    }

    public static int g(byte[] bArr) {
        return d(bArr, new byte[]{39, 40, 41, 42, 31, 32});
    }

    public static String h(byte[] bArr) {
        String[] strArr = f88895q;
        return String.valueOf(new char[]{strArr[0].charAt(d(bArr, new byte[]{39, 40, 41, 42, 31, 32})), strArr[0].charAt(d(bArr, new byte[]{33, 34, 35, 36, ho.c.C, ho.c.D})), strArr[0].charAt(d(bArr, new byte[]{ho.c.E, 28, ho.c.G, ho.c.H, 19, 20})), strArr[0].charAt(d(bArr, new byte[]{ho.c.f59560y, ho.c.f59561z, ho.c.A, ho.c.B, 13, 14})), strArr[0].charAt(d(bArr, new byte[]{15, 16, 17, ho.c.f59556u, 7, 8})), strArr[0].charAt(d(bArr, new byte[]{9, 10, 11, 12, 1, 2}))});
    }

    public static int i(byte[] bArr) {
        return d(bArr, new byte[]{55, 56, 57, 58, 59, 60, 49, 50, 51, 52});
    }
}
