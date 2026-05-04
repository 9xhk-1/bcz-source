package q60;

import androidx.exifinterface.media.ExifInterface;
import java.util.Locale;
import org.apache.commons.codec.EncoderException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f implements n60.g {

    /* renamed from: b, reason: collision with root package name */
    public static final String f81803b = "AEIOUY";

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f81804c = {"GN", "KN", "PN", "WR", "PS"};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f81805d = {"L", "R", "N", "M", "B", "H", "F", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, " "};

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f81806e = {"ES", "EP", "EB", "EL", "EY", "IB", "IL", "IN", "IE", "EI", "ER"};

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f81807f = {"L", ExifInterface.GPS_DIRECTION_TRUE, "K", ExifInterface.LATITUDE_SOUTH, "N", "M", "B", "Z"};

    /* renamed from: a, reason: collision with root package name */
    public int f81808a = 4;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public final StringBuffer f81809a;

        /* renamed from: b, reason: collision with root package name */
        public final StringBuffer f81810b;

        /* renamed from: c, reason: collision with root package name */
        public final int f81811c;

        public a(int i11) {
            this.f81809a = new StringBuffer(f.this.r());
            this.f81810b = new StringBuffer(f.this.r());
            this.f81811c = i11;
        }

        public void a(char c11) {
            g(c11);
            e(c11);
        }

        public void b(char c11, char c12) {
            g(c11);
            e(c12);
        }

        public void c(String str) {
            h(str);
            f(str);
        }

        public void d(String str, String str2) {
            h(str);
            f(str2);
        }

        public void e(char c11) {
            if (this.f81810b.length() < this.f81811c) {
                this.f81810b.append(c11);
            }
        }

        public void f(String str) {
            int length = this.f81811c - this.f81810b.length();
            if (str.length() <= length) {
                this.f81810b.append(str);
            } else {
                this.f81810b.append(str.substring(0, length));
            }
        }

        public void g(char c11) {
            if (this.f81809a.length() < this.f81811c) {
                this.f81809a.append(c11);
            }
        }

        public void h(String str) {
            int length = this.f81811c - this.f81809a.length();
            if (str.length() <= length) {
                this.f81809a.append(str);
            } else {
                this.f81809a.append(str.substring(0, length));
            }
        }

        public String i() {
            return this.f81810b.toString();
        }

        public String j() {
            return this.f81809a.toString();
        }

        public boolean k() {
            return this.f81809a.length() >= this.f81811c && this.f81810b.length() >= this.f81811c;
        }
    }

    public static boolean i(String str, int i11, int i12, String str2) {
        return o(str, i11, i12, new String[]{str2});
    }

    public static boolean j(String str, int i11, int i12, String str2, String str3) {
        return o(str, i11, i12, new String[]{str2, str3});
    }

    public static boolean k(String str, int i11, int i12, String str2, String str3, String str4) {
        return o(str, i11, i12, new String[]{str2, str3, str4});
    }

    public static boolean l(String str, int i11, int i12, String str2, String str3, String str4, String str5) {
        return o(str, i11, i12, new String[]{str2, str3, str4, str5});
    }

    public static boolean m(String str, int i11, int i12, String str2, String str3, String str4, String str5, String str6) {
        return o(str, i11, i12, new String[]{str2, str3, str4, str5, str6});
    }

    public static boolean n(String str, int i11, int i12, String str2, String str3, String str4, String str5, String str6, String str7) {
        return o(str, i11, i12, new String[]{str2, str3, str4, str5, str6, str7});
    }

    public static boolean o(String str, int i11, int i12, String[] strArr) {
        int i13;
        if (i11 >= 0 && (i13 = i12 + i11) <= str.length()) {
            String substring = str.substring(i11, i13);
            for (String str2 : strArr) {
                if (substring.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int A(String str, a aVar, int i11, boolean z11) {
        if (i(str, i11, 4, "JOSE") || i(str, 0, 4, "SAN ")) {
            if ((i11 == 0 && b(str, i11 + 4) == ' ') || str.length() == 4 || i(str, 0, 4, "SAN ")) {
                aVar.a('H');
            } else {
                aVar.b('J', 'H');
            }
            return i11 + 1;
        }
        if (i11 != 0 || i(str, i11, 4, "JOSE")) {
            int i12 = i11 - 1;
            if (O(b(str, i12)) && !z11) {
                int i13 = i11 + 1;
                if (b(str, i13) == 'A' || b(str, i13) == 'O') {
                    aVar.b('J', 'H');
                }
            }
            if (i11 == str.length() - 1) {
                aVar.b('J', ' ');
            } else if (!o(str, i11 + 1, 1, f81807f) && !k(str, i12, 1, ExifInterface.LATITUDE_SOUTH, "K", "L")) {
                aVar.a('J');
            }
        } else {
            aVar.b('J', 'A');
        }
        int i14 = i11 + 1;
        return b(str, i14) == 'J' ? i11 + 2 : i14;
    }

    public final int B(String str, a aVar, int i11) {
        int i12 = i11 + 1;
        if (b(str, i12) != 'L') {
            aVar.a('L');
            return i12;
        }
        if (g(str, i11)) {
            aVar.g('L');
        } else {
            aVar.a('L');
        }
        return i11 + 2;
    }

    public final int C(String str, a aVar, int i11) {
        int i12 = i11 + 1;
        if (b(str, i12) == 'H') {
            aVar.a('F');
            return i11 + 2;
        }
        aVar.a('P');
        return j(str, i12, 1, "P", "B") ? i11 + 2 : i12;
    }

    public final int D(String str, a aVar, int i11, boolean z11) {
        if (i11 != str.length() - 1 || z11 || !i(str, i11 - 2, 2, "IE") || j(str, i11 - 4, 2, "ME", "MA")) {
            aVar.a('R');
        } else {
            aVar.e('R');
        }
        int i12 = i11 + 1;
        return b(str, i12) == 'R' ? i11 + 2 : i12;
    }

    public final int E(String str, a aVar, int i11, boolean z11) {
        if (j(str, i11 - 1, 3, "ISL", "YSL")) {
            return i11 + 1;
        }
        if (i11 == 0 && i(str, i11, 5, "SUGAR")) {
            aVar.b('X', 'S');
            return i11 + 1;
        }
        if (i(str, i11, 2, "SH")) {
            if (l(str, i11 + 1, 4, "HEIM", "HOEK", "HOLM", "HOLZ")) {
                aVar.a('S');
            } else {
                aVar.a('X');
            }
            return i11 + 2;
        }
        if (j(str, i11, 3, "SIO", "SIA") || i(str, i11, 4, "SIAN")) {
            if (z11) {
                aVar.a('S');
            } else {
                aVar.b('S', 'X');
            }
            return i11 + 3;
        }
        if (i11 != 0 || !l(str, i11 + 1, 1, "M", "N", "L", ExifInterface.LONGITUDE_WEST)) {
            int i12 = i11 + 1;
            if (!i(str, i12, 1, "Z")) {
                if (i(str, i11, 2, "SC")) {
                    return F(str, aVar, i11);
                }
                if (i11 == str.length() - 1 && j(str, i11 - 2, 2, "AI", "OI")) {
                    aVar.e('S');
                } else {
                    aVar.a('S');
                }
                return j(str, i12, 1, ExifInterface.LATITUDE_SOUTH, "Z") ? i11 + 2 : i12;
            }
        }
        aVar.b('S', 'X');
        int i13 = i11 + 1;
        return i(str, i13, 1, "Z") ? i11 + 2 : i13;
    }

    public final int F(String str, a aVar, int i11) {
        int i12 = i11 + 2;
        if (b(str, i12) == 'H') {
            int i13 = i11 + 3;
            if (n(str, i13, 2, "OO", "ER", "EN", "UY", "ED", "EM")) {
                if (j(str, i13, 2, "ER", "EN")) {
                    aVar.d("X", "SK");
                } else {
                    aVar.c("SK");
                }
            } else if (i11 != 0 || O(b(str, 3)) || b(str, 3) == 'W') {
                aVar.a('X');
            } else {
                aVar.b('X', 'S');
            }
        } else if (k(str, i12, 1, "I", ExifInterface.LONGITUDE_EAST, "Y")) {
            aVar.a('S');
        } else {
            aVar.c("SK");
        }
        return i11 + 3;
    }

    public final int G(String str, a aVar, int i11) {
        if (i(str, i11, 4, "TION")) {
            aVar.a('X');
        } else {
            if (!j(str, i11, 3, "TIA", "TCH")) {
                if (!i(str, i11, 2, "TH") && !i(str, i11, 3, "TTH")) {
                    aVar.a('T');
                    int i12 = i11 + 1;
                    return j(str, i12, 1, ExifInterface.GPS_DIRECTION_TRUE, "D") ? i11 + 2 : i12;
                }
                int i13 = i11 + 2;
                if (j(str, i13, 2, "OM", "AM") || j(str, 0, 4, "VAN ", "VON ") || i(str, 0, 3, "SCH")) {
                    aVar.a('T');
                } else {
                    aVar.b('0', 'T');
                }
                return i13;
            }
            aVar.a('X');
        }
        return i11 + 3;
    }

    public final int H(String str, a aVar, int i11) {
        if (i(str, i11, 2, "WR")) {
            aVar.a('R');
            return i11 + 2;
        }
        if (i11 == 0) {
            int i12 = i11 + 1;
            if (O(b(str, i12)) || i(str, i11, 2, "WH")) {
                if (O(b(str, i12))) {
                    aVar.b('A', 'F');
                } else {
                    aVar.a('A');
                }
                return i12;
            }
        }
        if ((i11 == str.length() - 1 && O(b(str, i11 - 1))) || l(str, i11 - 1, 5, "EWSKI", "EWSKY", "OWSKI", "OWSKY") || i(str, 0, 3, "SCH")) {
            aVar.e('F');
            return i11 + 1;
        }
        if (!j(str, i11, 4, "WICZ", "WITZ")) {
            return i11 + 1;
        }
        aVar.d("TS", "FX");
        return i11 + 4;
    }

    public final int I(String str, a aVar, int i11) {
        if (i11 == 0) {
            aVar.a('S');
            return i11 + 1;
        }
        if (i11 != str.length() - 1 || (!j(str, i11 - 3, 3, "IAU", "EAU") && !j(str, i11 - 2, 2, "AU", "OU"))) {
            aVar.c("KS");
        }
        int i12 = i11 + 1;
        return j(str, i12, 1, "C", "X") ? i11 + 2 : i12;
    }

    public final int J(String str, a aVar, int i11, boolean z11) {
        int i12 = i11 + 1;
        if (b(str, i12) == 'H') {
            aVar.a('J');
            return i11 + 2;
        }
        if (k(str, i12, 2, "ZO", "ZI", "ZA") || (z11 && i11 > 0 && b(str, i11 - 1) != 'T')) {
            aVar.d(ExifInterface.LATITUDE_SOUTH, "TS");
        } else {
            aVar.a('S');
        }
        return b(str, i12) == 'Z' ? i11 + 2 : i12;
    }

    public boolean K(String str, String str2) {
        return L(str, str2, false);
    }

    public boolean L(String str, String str2, boolean z11) {
        return q(str, z11).equals(q(str2, z11));
    }

    public final boolean M(String str) {
        for (String str2 : f81804c) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean N(String str) {
        return str.indexOf(87) > -1 || str.indexOf(75) > -1 || str.indexOf("CZ") > -1 || str.indexOf("WITZ") > -1;
    }

    public final boolean O(char c11) {
        return f81803b.indexOf(c11) != -1;
    }

    public void P(int i11) {
        this.f81808a = i11;
    }

    @Override // n60.g
    public String a(String str) {
        return p(str);
    }

    public char b(String str, int i11) {
        if (i11 < 0 || i11 >= str.length()) {
            return (char) 0;
        }
        return str.charAt(i11);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.length() == 0) {
            return null;
        }
        return trim.toUpperCase(Locale.ENGLISH);
    }

    public final boolean d(String str, int i11) {
        if (i(str, i11, 4, "CHIA")) {
            return true;
        }
        if (i11 <= 1) {
            return false;
        }
        int i12 = i11 - 2;
        if (O(b(str, i12)) || !i(str, i11 - 1, 3, "ACH")) {
            return false;
        }
        char b11 = b(str, i11 + 2);
        return !(b11 == 'I' || b11 == 'E') || j(str, i12, 6, "BACHER", "MACHER");
    }

    public final boolean e(String str, int i11) {
        String str2;
        if (i11 != 0) {
            return false;
        }
        int i12 = i11 + 1;
        if (j(str, i12, 5, "HARAC", "HARIS")) {
            str2 = str;
        } else {
            str2 = str;
            if (!l(str2, i12, 3, "HOR", "HYM", "HIA", "HEM")) {
                return false;
            }
        }
        return !i(str2, 0, 5, "CHORE");
    }

    @Override // n60.e
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return p((String) obj);
        }
        throw new EncoderException("DoubleMetaphone encode parameter is not of type String");
    }

    public final boolean f(String str, int i11) {
        if (!j(str, 0, 4, "VAN ", "VON ") && !i(str, 0, 3, "SCH") && !k(str, i11 - 2, 6, "ORCHES", "ARCHIT", "ORCHID")) {
            int i12 = i11 + 2;
            if (!j(str, i12, 1, ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.LATITUDE_SOUTH) && ((!l(str, i11 - 1, 1, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "O", "U", ExifInterface.LONGITUDE_EAST) && i11 != 0) || (!o(str, i12, 1, f81805d) && i11 + 1 != str.length() - 1))) {
                return false;
            }
        }
        return true;
    }

    public final boolean g(String str, int i11) {
        String str2;
        if (i11 == str.length() - 3) {
            str2 = str;
            if (k(str2, i11 - 1, 4, "ILLO", "ILLA", "ALLE")) {
                return true;
            }
        } else {
            str2 = str;
        }
        return (j(str2, str2.length() - 2, 2, "AS", "OS") || j(str2, str2.length() - 1, 1, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "O")) && i(str2, i11 - 1, 4, "ALLE");
    }

    public final boolean h(String str, int i11) {
        int i12 = i11 + 1;
        if (b(str, i12) == 'M') {
            return true;
        }
        if (i(str, i11 - 1, 3, "UMB")) {
            return i12 == str.length() - 1 || i(str, i11 + 2, 2, "ER");
        }
        return false;
    }

    public String p(String str) {
        return q(str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v18, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r7v0, types: [q60.f] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.String] */
    public String q(String str, boolean z11) {
        int i11;
        ?? c11 = c(str);
        if (c11 == 0) {
            return null;
        }
        boolean N = N(c11);
        ?? M = M(c11);
        a aVar = new a(r());
        while (!aVar.k() && M <= c11.length() - 1) {
            char charAt = c11.charAt(M);
            if (charAt == 199) {
                aVar.a('S');
            } else if (charAt != 209) {
                switch (charAt) {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                    case 'Y':
                        M = s(aVar, M);
                        break;
                    case 'B':
                        aVar.a('P');
                        i11 = M + 1;
                        if (b(c11, i11) != 'B') {
                            M = i11;
                            break;
                        } else {
                            M += 2;
                            break;
                        }
                    case 'C':
                        M = t(c11, aVar, M);
                        break;
                    case 'D':
                        M = w(c11, aVar, M);
                        break;
                    case 'F':
                        aVar.a('F');
                        i11 = M + 1;
                        if (b(c11, i11) != 'F') {
                            M = i11;
                            break;
                        } else {
                            M += 2;
                            break;
                        }
                    case 'G':
                        M = x(c11, aVar, M, N);
                        break;
                    case 'H':
                        M = z(c11, aVar, M);
                        break;
                    case 'J':
                        M = A(c11, aVar, M, N);
                        break;
                    case 'K':
                        aVar.a('K');
                        i11 = M + 1;
                        if (b(c11, i11) != 'K') {
                            M = i11;
                            break;
                        } else {
                            M += 2;
                            break;
                        }
                    case 'L':
                        M = B(c11, aVar, M);
                        break;
                    case 'M':
                        aVar.a(io.ktor.util.date.b.f62001g);
                        if (!h(c11, M)) {
                            break;
                        } else {
                            M += 2;
                            break;
                        }
                    case 'N':
                        aVar.a('N');
                        i11 = M + 1;
                        if (b(c11, i11) != 'N') {
                            M = i11;
                            break;
                        } else {
                            M += 2;
                            break;
                        }
                    case 'P':
                        M = C(c11, aVar, M);
                        break;
                    case 'Q':
                        aVar.a('K');
                        i11 = M + 1;
                        if (b(c11, i11) != 'Q') {
                            M = i11;
                            break;
                        } else {
                            M += 2;
                            break;
                        }
                    case 'R':
                        M = D(c11, aVar, M, N);
                        break;
                    case 'S':
                        M = E(c11, aVar, M, N);
                        break;
                    case 'T':
                        M = G(c11, aVar, M);
                        break;
                    case 'V':
                        aVar.a('F');
                        i11 = M + 1;
                        if (b(c11, i11) != 'V') {
                            M = i11;
                            break;
                        } else {
                            M += 2;
                            break;
                        }
                    case 'W':
                        M = H(c11, aVar, M);
                        break;
                    case 'X':
                        M = I(c11, aVar, M);
                        break;
                    case 'Z':
                        M = J(c11, aVar, M, N);
                        break;
                }
            } else {
                aVar.a('N');
            }
            M++;
        }
        return z11 ? aVar.i() : aVar.j();
    }

    public int r() {
        return this.f81808a;
    }

    public final int s(a aVar, int i11) {
        if (i11 == 0) {
            aVar.a('A');
        }
        return i11 + 1;
    }

    public final int t(String str, a aVar, int i11) {
        if (d(str, i11)) {
            aVar.a('K');
            return i11 + 2;
        }
        if (i11 == 0 && i(str, i11, 6, "CAESAR")) {
            aVar.a('S');
            return i11 + 2;
        }
        if (i(str, i11, 2, "CH")) {
            return v(str, aVar, i11);
        }
        if (i(str, i11, 2, "CZ") && !i(str, i11 - 2, 4, "WICZ")) {
            aVar.b('S', 'X');
            return i11 + 2;
        }
        int i12 = i11 + 1;
        if (i(str, i12, 3, "CIA")) {
            aVar.a('X');
            return i11 + 3;
        }
        if (i(str, i11, 2, "CC") && (i11 != 1 || b(str, 0) != 'M')) {
            return u(str, aVar, i11);
        }
        if (k(str, i11, 2, "CK", "CG", "CQ")) {
            aVar.a('K');
            return i11 + 2;
        }
        if (!k(str, i11, 2, "CI", "CE", "CY")) {
            aVar.a('K');
            return k(str, i12, 2, " C", " Q", " G") ? i11 + 3 : (!k(str, i12, 1, "C", "K", "Q") || j(str, i12, 2, "CE", "CI")) ? i12 : i11 + 2;
        }
        if (k(str, i11, 3, "CIO", "CIE", "CIA")) {
            aVar.b('S', 'X');
        } else {
            aVar.a('S');
        }
        return i11 + 2;
    }

    public final int u(String str, a aVar, int i11) {
        int i12 = i11 + 2;
        if (!k(str, i12, 1, "I", ExifInterface.LONGITUDE_EAST, "H") || i(str, i12, 2, "HU")) {
            aVar.a('K');
            return i12;
        }
        if ((i11 == 1 && b(str, i11 - 1) == 'A') || j(str, i11 - 1, 5, "UCCEE", "UCCES")) {
            aVar.c("KS");
        } else {
            aVar.a('X');
        }
        return i11 + 3;
    }

    public final int v(String str, a aVar, int i11) {
        if (i11 > 0 && i(str, i11, 4, "CHAE")) {
            aVar.b('K', 'X');
        } else if (e(str, i11)) {
            aVar.a('K');
        } else {
            if (!f(str, i11)) {
                if (i11 <= 0) {
                    aVar.a('X');
                } else if (i(str, 0, 2, "MC")) {
                    aVar.a('K');
                } else {
                    aVar.b('X', 'K');
                }
                return i11 + 2;
            }
            aVar.a('K');
        }
        return i11 + 2;
    }

    public final int w(String str, a aVar, int i11) {
        if (!i(str, i11, 2, "DG")) {
            if (j(str, i11, 2, "DT", "DD")) {
                aVar.a('T');
                return i11 + 2;
            }
            aVar.a('T');
            return i11 + 1;
        }
        int i12 = i11 + 2;
        if (k(str, i12, 1, "I", ExifInterface.LONGITUDE_EAST, "Y")) {
            aVar.a('J');
            return i11 + 3;
        }
        aVar.c("TK");
        return i12;
    }

    public final int x(String str, a aVar, int i11, boolean z11) {
        int i12 = i11 + 1;
        if (b(str, i12) == 'H') {
            return y(str, aVar, i11);
        }
        if (b(str, i12) == 'N') {
            if (i11 == 1 && O(b(str, 0)) && !z11) {
                aVar.d("KN", "N");
            } else if (i(str, i11 + 2, 2, "EY") || b(str, i12) == 'Y' || z11) {
                aVar.c("KN");
            } else {
                aVar.d("N", "KN");
            }
            return i11 + 2;
        }
        if (i(str, i12, 2, "LI") && !z11) {
            aVar.d("KL", "L");
            return i11 + 2;
        }
        if (i11 == 0 && (b(str, i12) == 'Y' || o(str, i12, 2, f81806e))) {
            aVar.b('K', 'J');
            return i11 + 2;
        }
        if ((i(str, i12, 2, "ER") || b(str, i12) == 'Y') && !k(str, 0, 6, "DANGER", "RANGER", "MANGER")) {
            int i13 = i11 - 1;
            if (!j(str, i13, 1, ExifInterface.LONGITUDE_EAST, "I") && !j(str, i13, 3, "RGY", "OGY")) {
                aVar.b('K', 'J');
                return i11 + 2;
            }
        }
        if (!k(str, i12, 1, ExifInterface.LONGITUDE_EAST, "I", "Y") && !j(str, i11 - 1, 4, "AGGI", "OGGI")) {
            if (b(str, i12) != 'G') {
                aVar.a('K');
                return i12;
            }
            int i14 = i11 + 2;
            aVar.a('K');
            return i14;
        }
        if (j(str, 0, 4, "VAN ", "VON ") || i(str, 0, 3, "SCH") || i(str, i12, 2, "ET")) {
            aVar.a('K');
        } else if (i(str, i12, 3, "IER")) {
            aVar.a('J');
        } else {
            aVar.b('J', 'K');
        }
        return i11 + 2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 java.lang.String, still in use, count: 2, list:
          (r4v2 java.lang.String) from 0x0038: INVOKE 
          (r4v2 java.lang.String)
          (wrap:int:0x002e: ARITH (r15v0 int) + (-2 int) A[WRAPPED] (LINE:47))
          (1 int)
          ("B")
          ("H")
          ("D")
         STATIC call: q60.f.k(java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String):boolean A[MD:(java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String):boolean (m), WRAPPED] (LINE:57)
          (r4v2 java.lang.String) from 0x0040: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v2 java.lang.String) binds: [B:40:0x003f, B:18:0x003c] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final int y(java.lang.String r13, q60.f.a r14, int r15) {
        /*
            r12 = this;
            r0 = 75
            r1 = 2
            if (r15 <= 0) goto L16
            int r2 = r15 + (-1)
            char r2 = r12.b(r13, r2)
            boolean r2 = r12.O(r2)
            if (r2 != 0) goto L16
            r14.a(r0)
            int r15 = r15 + r1
            return r15
        L16:
            r2 = 73
            if (r15 != 0) goto L2b
            int r15 = r15 + r1
            char r13 = r12.b(r13, r15)
            if (r13 != r2) goto L27
            r13 = 74
            r14.a(r13)
            goto L2a
        L27:
            r14.a(r0)
        L2a:
            return r15
        L2b:
            r3 = 1
            if (r15 <= r3) goto L3f
            int r5 = r15 + (-2)
            java.lang.String r8 = "H"
            java.lang.String r9 = "D"
            r6 = 1
            java.lang.String r7 = "B"
            r4 = r13
            boolean r13 = k(r4, r5, r6, r7, r8, r9)
            if (r13 != 0) goto L60
            goto L40
        L3f:
            r4 = r13
        L40:
            if (r15 <= r1) goto L51
            int r5 = r15 + (-3)
            java.lang.String r8 = "H"
            java.lang.String r9 = "D"
            r6 = 1
            java.lang.String r7 = "B"
            boolean r13 = k(r4, r5, r6, r7, r8, r9)
            if (r13 != 0) goto L60
        L51:
            r13 = 3
            if (r15 <= r13) goto L62
            int r13 = r15 + (-4)
            java.lang.String r5 = "B"
            java.lang.String r6 = "H"
            boolean r13 = j(r4, r13, r3, r5, r6)
            if (r13 == 0) goto L62
        L60:
            int r15 = r15 + r1
            return r15
        L62:
            if (r15 <= r1) goto L87
            int r13 = r15 + (-1)
            char r13 = r12.b(r4, r13)
            r3 = 85
            if (r13 != r3) goto L87
            int r5 = r15 + (-3)
            java.lang.String r10 = "R"
            java.lang.String r11 = "T"
            r6 = 1
            java.lang.String r7 = "C"
            java.lang.String r8 = "G"
            java.lang.String r9 = "L"
            boolean r13 = m(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r13 == 0) goto L87
            r13 = 70
            r14.a(r13)
            goto L94
        L87:
            if (r15 <= 0) goto L94
            int r13 = r15 + (-1)
            char r13 = r12.b(r4, r13)
            if (r13 == r2) goto L94
            r14.a(r0)
        L94:
            int r15 = r15 + r1
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: q60.f.y(java.lang.String, q60.f$a, int):int");
    }

    public final int z(String str, a aVar, int i11) {
        if ((i11 != 0 && !O(b(str, i11 - 1))) || !O(b(str, i11 + 1))) {
            return i11 + 1;
        }
        aVar.a('H');
        return i11 + 2;
    }
}
