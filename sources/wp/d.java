package wp;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.jiongji.andriod.card.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class d extends s {

    /* renamed from: a, reason: collision with root package name */
    public static final int f96575a = 103;

    /* renamed from: b, reason: collision with root package name */
    public static final int f96576b = 104;

    /* renamed from: c, reason: collision with root package name */
    public static final int f96577c = 105;

    /* renamed from: d, reason: collision with root package name */
    public static final int f96578d = 101;

    /* renamed from: e, reason: collision with root package name */
    public static final int f96579e = 100;

    /* renamed from: f, reason: collision with root package name */
    public static final int f96580f = 99;

    /* renamed from: g, reason: collision with root package name */
    public static final int f96581g = 106;

    /* renamed from: h, reason: collision with root package name */
    public static final char f96582h = 241;

    /* renamed from: i, reason: collision with root package name */
    public static final char f96583i = 242;

    /* renamed from: j, reason: collision with root package name */
    public static final char f96584j = 243;

    /* renamed from: k, reason: collision with root package name */
    public static final char f96585k = 244;

    /* renamed from: l, reason: collision with root package name */
    public static final int f96586l = 102;

    /* renamed from: m, reason: collision with root package name */
    public static final int f96587m = 97;

    /* renamed from: n, reason: collision with root package name */
    public static final int f96588n = 96;

    /* renamed from: o, reason: collision with root package name */
    public static final int f96589o = 101;

    /* renamed from: p, reason: collision with root package name */
    public static final int f96590p = 100;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum a {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    public static int g(CharSequence charSequence, int i11, int i12) {
        a h11;
        a h12;
        char charAt;
        a h13 = h(charSequence, i11);
        a aVar = a.ONE_DIGIT;
        if (h13 == aVar) {
            return 100;
        }
        a aVar2 = a.UNCODABLE;
        if (h13 == aVar2) {
            return (i11 >= charSequence.length() || ((charAt = charSequence.charAt(i11)) >= ' ' && (i12 != 101 || charAt >= '`'))) ? 100 : 101;
        }
        if (i12 == 99) {
            return 99;
        }
        if (i12 != 100) {
            if (h13 == a.FNC_1) {
                h13 = h(charSequence, i11 + 1);
            }
            return h13 == a.TWO_DIGITS ? 99 : 100;
        }
        a aVar3 = a.FNC_1;
        if (h13 == aVar3 || (h11 = h(charSequence, i11 + 2)) == aVar2 || h11 == aVar) {
            return 100;
        }
        if (h11 == aVar3) {
            return h(charSequence, i11 + 3) == a.TWO_DIGITS ? 99 : 100;
        }
        int i13 = i11 + 4;
        while (true) {
            h12 = h(charSequence, i13);
            if (h12 != a.TWO_DIGITS) {
                break;
            }
            i13 += 2;
        }
        return h12 == a.ONE_DIGIT ? 100 : 99;
    }

    public static a h(CharSequence charSequence, int i11) {
        int length = charSequence.length();
        if (i11 >= length) {
            return a.UNCODABLE;
        }
        char charAt = charSequence.charAt(i11);
        if (charAt == 241) {
            return a.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return a.UNCODABLE;
        }
        int i12 = i11 + 1;
        if (i12 >= length) {
            return a.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i12);
        return (charAt2 < '0' || charAt2 > '9') ? a.ONE_DIGIT : a.TWO_DIGITS;
    }

    @Override // wp.s, com.google.zxing.n
    public kp.b a(String str, BarcodeFormat barcodeFormat, int i11, int i12, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_128) {
            return super.a(str, barcodeFormat, i11, i12, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // wp.s
    public boolean[] d(String str) {
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            char charAt = str.charAt(i12);
            switch (charAt) {
                case R.styleable.Theme_drawable_test_nodate /* 241 */:
                case R.styleable.Theme_drawable_time /* 242 */:
                case 243:
                case 244:
                    break;
                default:
                    if (charAt > 127) {
                        throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(charAt)));
                    }
                    break;
            }
        }
        ArrayList<int[]> arrayList = new ArrayList();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1;
        while (true) {
            int i17 = 103;
            if (i13 >= length) {
                int[][] iArr = c.f96559a;
                arrayList.add(iArr[i14 % 103]);
                arrayList.add(iArr[106]);
                int i18 = 0;
                for (int[] iArr2 : arrayList) {
                    for (int i19 : iArr2) {
                        i18 += i19;
                    }
                }
                boolean[] zArr = new boolean[i18];
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    i11 += s.c(zArr, i11, (int[]) it.next(), true);
                }
                return zArr;
            }
            int g11 = g(str, i13, i15);
            int i21 = 100;
            if (g11 == i15) {
                switch (str.charAt(i13)) {
                    case R.styleable.Theme_drawable_test_nodate /* 241 */:
                        i21 = 102;
                        break;
                    case R.styleable.Theme_drawable_time /* 242 */:
                        i21 = 97;
                        break;
                    case 243:
                        i21 = 96;
                        break;
                    case 244:
                        if (i15 == 101) {
                            i21 = 101;
                            break;
                        }
                        break;
                    default:
                        if (i15 != 100) {
                            if (i15 != 101) {
                                i21 = Integer.parseInt(str.substring(i13, i13 + 2));
                                i13++;
                                break;
                            } else {
                                char charAt2 = str.charAt(i13);
                                i21 = charAt2 - ' ';
                                if (i21 < 0) {
                                    i21 = charAt2 + '@';
                                    break;
                                }
                            }
                        } else {
                            i21 = str.charAt(i13) - ' ';
                            break;
                        }
                        break;
                }
                i13++;
            } else {
                if (i15 != 0) {
                    i17 = g11;
                } else if (g11 == 100) {
                    i17 = 104;
                } else if (g11 != 101) {
                    i17 = 105;
                }
                i21 = i17;
                i15 = g11;
            }
            arrayList.add(c.f96559a[i21]);
            i14 += i21 * i16;
            if (i13 != 0) {
                i16++;
            }
        }
    }
}
