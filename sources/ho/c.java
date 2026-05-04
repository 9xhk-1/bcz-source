package ho;

import com.google.common.base.Preconditions;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j
@go.b
/* loaded from: classes7.dex */
public final class c {
    public static final byte A = 23;
    public static final byte B = 24;
    public static final byte C = 25;
    public static final byte D = 26;
    public static final byte E = 27;
    public static final byte F = 28;
    public static final byte G = 29;
    public static final byte H = 30;
    public static final byte I = 31;
    public static final byte J = 32;
    public static final byte K = 32;
    public static final byte L = Byte.MAX_VALUE;
    public static final char M = 0;
    public static final char N = 127;
    public static final char O = ' ';

    /* renamed from: a, reason: collision with root package name */
    public static final byte f59536a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f59537b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final byte f59538c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final byte f59539d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final byte f59540e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final byte f59541f = 5;

    /* renamed from: g, reason: collision with root package name */
    public static final byte f59542g = 6;

    /* renamed from: h, reason: collision with root package name */
    public static final byte f59543h = 7;

    /* renamed from: i, reason: collision with root package name */
    public static final byte f59544i = 8;

    /* renamed from: j, reason: collision with root package name */
    public static final byte f59545j = 9;

    /* renamed from: k, reason: collision with root package name */
    public static final byte f59546k = 10;

    /* renamed from: l, reason: collision with root package name */
    public static final byte f59547l = 10;

    /* renamed from: m, reason: collision with root package name */
    public static final byte f59548m = 11;

    /* renamed from: n, reason: collision with root package name */
    public static final byte f59549n = 12;

    /* renamed from: o, reason: collision with root package name */
    public static final byte f59550o = 13;

    /* renamed from: p, reason: collision with root package name */
    public static final byte f59551p = 14;

    /* renamed from: q, reason: collision with root package name */
    public static final byte f59552q = 15;

    /* renamed from: r, reason: collision with root package name */
    public static final byte f59553r = 16;

    /* renamed from: s, reason: collision with root package name */
    public static final byte f59554s = 17;

    /* renamed from: t, reason: collision with root package name */
    public static final byte f59555t = 17;

    /* renamed from: u, reason: collision with root package name */
    public static final byte f59556u = 18;

    /* renamed from: v, reason: collision with root package name */
    public static final byte f59557v = 19;

    /* renamed from: w, reason: collision with root package name */
    public static final byte f59558w = 19;

    /* renamed from: x, reason: collision with root package name */
    public static final byte f59559x = 20;

    /* renamed from: y, reason: collision with root package name */
    public static final byte f59560y = 21;

    /* renamed from: z, reason: collision with root package name */
    public static final byte f59561z = 22;

    public static boolean a(CharSequence s12, CharSequence s22) {
        int b11;
        int length = s12.length();
        if (s12 == s22) {
            return true;
        }
        if (length != s22.length()) {
            return false;
        }
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = s12.charAt(i11);
            char charAt2 = s22.charAt(i11);
            if (charAt != charAt2 && ((b11 = b(charAt)) >= 26 || b11 != b(charAt2))) {
                return false;
            }
        }
        return true;
    }

    public static int b(char c11) {
        return (char) ((c11 | ' ') - 97);
    }

    public static boolean c(char c11) {
        return c11 >= 'a' && c11 <= 'z';
    }

    public static boolean d(char c11) {
        return c11 >= 'A' && c11 <= 'Z';
    }

    public static char e(char c11) {
        return d(c11) ? (char) (c11 ^ ' ') : c11;
    }

    public static String f(CharSequence chars) {
        if (chars instanceof String) {
            return g((String) chars);
        }
        int length = chars.length();
        char[] cArr = new char[length];
        for (int i11 = 0; i11 < length; i11++) {
            cArr[i11] = e(chars.charAt(i11));
        }
        return String.valueOf(cArr);
    }

    public static String g(String string) {
        int length = string.length();
        int i11 = 0;
        while (i11 < length) {
            if (d(string.charAt(i11))) {
                char[] charArray = string.toCharArray();
                while (i11 < length) {
                    char c11 = charArray[i11];
                    if (d(c11)) {
                        charArray[i11] = (char) (c11 ^ ' ');
                    }
                    i11++;
                }
                return String.valueOf(charArray);
            }
            i11++;
        }
        return string;
    }

    public static char h(char c11) {
        return c(c11) ? (char) (c11 ^ ' ') : c11;
    }

    public static String i(CharSequence chars) {
        if (chars instanceof String) {
            return j((String) chars);
        }
        int length = chars.length();
        char[] cArr = new char[length];
        for (int i11 = 0; i11 < length; i11++) {
            cArr[i11] = h(chars.charAt(i11));
        }
        return String.valueOf(cArr);
    }

    public static String j(String string) {
        int length = string.length();
        int i11 = 0;
        while (i11 < length) {
            if (c(string.charAt(i11))) {
                char[] charArray = string.toCharArray();
                while (i11 < length) {
                    char c11 = charArray[i11];
                    if (c(c11)) {
                        charArray[i11] = (char) (c11 ^ ' ');
                    }
                    i11++;
                }
                return String.valueOf(charArray);
            }
            i11++;
        }
        return string;
    }

    public static String k(CharSequence charSequence, int i11, String str) {
        Preconditions.checkNotNull(charSequence);
        int length = i11 - str.length();
        Preconditions.checkArgument(length >= 0, "maxLength (%s) must be >= length of the truncation indicator (%s)", i11, str.length());
        int length2 = charSequence.length();
        String str2 = charSequence;
        if (length2 <= i11) {
            String charSequence2 = charSequence.toString();
            int length3 = charSequence2.length();
            str2 = charSequence2;
            if (length3 <= i11) {
                return charSequence2;
            }
        }
        StringBuilder sb2 = new StringBuilder(i11);
        sb2.append((CharSequence) str2, 0, length);
        sb2.append(str);
        return sb2.toString();
    }
}
