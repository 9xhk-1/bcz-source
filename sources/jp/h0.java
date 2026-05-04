package jp;

import com.google.zxing.BarcodeFormat;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class h0 extends t {

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f64559f = Pattern.compile("[IOQ]");

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f64560g = Pattern.compile("[A-Z0-9]{17}");

    public static char q(int i11) {
        if (i11 < 10) {
            return (char) (i11 + 48);
        }
        if (i11 == 10) {
            return 'X';
        }
        throw new IllegalArgumentException();
    }

    public static boolean r(CharSequence charSequence) {
        int i11 = 0;
        int i12 = 0;
        while (i11 < charSequence.length()) {
            int i13 = i11 + 1;
            i12 += w(i13) * v(charSequence.charAt(i11));
            i11 = i13;
        }
        return charSequence.charAt(8) == q(i12 % 11);
    }

    public static String s(CharSequence charSequence) {
        char charAt = charSequence.charAt(0);
        char charAt2 = charSequence.charAt(1);
        if (charAt == '9') {
            if (charAt2 >= 'A' && charAt2 <= 'E') {
                return "BR";
            }
            if (charAt2 < '3' || charAt2 > '9') {
                return null;
            }
            return "BR";
        }
        if (charAt == 'S') {
            if (charAt2 >= 'A' && charAt2 <= 'M') {
                return "UK";
            }
            if (charAt2 < 'N' || charAt2 > 'T') {
                return null;
            }
            return "DE";
        }
        if (charAt == 'Z') {
            if (charAt2 < 'A' || charAt2 > 'R') {
                return null;
            }
            return "IT";
        }
        switch (charAt) {
            case '1':
            case '4':
            case '5':
                return "US";
            case '2':
                return "CA";
            case '3':
                if (charAt2 < 'A' || charAt2 > 'W') {
                    return null;
                }
                return "MX";
            default:
                switch (charAt) {
                    case 'J':
                        if (charAt2 < 'A' || charAt2 > 'T') {
                            return null;
                        }
                        return "JP";
                    case 'K':
                        if (charAt2 < 'L' || charAt2 > 'R') {
                            return null;
                        }
                        return "KO";
                    case 'L':
                        return "CN";
                    case 'M':
                        if (charAt2 < 'A' || charAt2 > 'E') {
                            return null;
                        }
                        return "IN";
                    default:
                        switch (charAt) {
                            case 'V':
                                if (charAt2 >= 'F' && charAt2 <= 'R') {
                                    return "FR";
                                }
                                if (charAt2 < 'S' || charAt2 > 'W') {
                                    return null;
                                }
                                return "ES";
                            case 'W':
                                return "DE";
                            case 'X':
                                if (charAt2 == '0') {
                                    return "RU";
                                }
                                if (charAt2 < '3' || charAt2 > '9') {
                                    return null;
                                }
                                return "RU";
                            default:
                                return null;
                        }
                }
        }
    }

    public static int t(char c11) {
        if (c11 >= 'E' && c11 <= 'H') {
            return c11 + 1915;
        }
        if (c11 >= 'J' && c11 <= 'N') {
            return c11 + 1914;
        }
        if (c11 == 'P') {
            return 1993;
        }
        if (c11 >= 'R' && c11 <= 'T') {
            return c11 + 1912;
        }
        if (c11 >= 'V' && c11 <= 'Y') {
            return c11 + 1911;
        }
        if (c11 >= '1' && c11 <= '9') {
            return c11 + 1952;
        }
        if (c11 < 'A' || c11 > 'D') {
            throw new IllegalArgumentException();
        }
        return c11 + 1945;
    }

    public static int v(char c11) {
        if (c11 >= 'A' && c11 <= 'I') {
            return c11 - '@';
        }
        if (c11 >= 'J' && c11 <= 'R') {
            return c11 - 'I';
        }
        if (c11 >= 'S' && c11 <= 'Z') {
            return c11 - 'Q';
        }
        if (c11 < '0' || c11 > '9') {
            throw new IllegalArgumentException();
        }
        return c11 - '0';
    }

    public static int w(int i11) {
        if (i11 > 0 && i11 <= 7) {
            return 9 - i11;
        }
        if (i11 == 8) {
            return 10;
        }
        if (i11 == 9) {
            return 0;
        }
        if (i11 < 10 || i11 > 17) {
            throw new IllegalArgumentException();
        }
        return 19 - i11;
    }

    @Override // jp.t
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public g0 k(com.google.zxing.k kVar) {
        if (kVar.b() != BarcodeFormat.CODE_39) {
            return null;
        }
        String trim = f64559f.matcher(kVar.g()).replaceAll("").trim();
        if (!f64560g.matcher(trim).matches()) {
            return null;
        }
        try {
            if (!r(trim)) {
                return null;
            }
            String substring = trim.substring(0, 3);
            return new g0(trim, substring, trim.substring(3, 9), trim.substring(9, 17), s(substring), trim.substring(3, 8), t(trim.charAt(9)), trim.charAt(10), trim.substring(11));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
