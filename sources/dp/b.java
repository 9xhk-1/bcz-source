package dp;

import java.math.BigInteger;
import n6.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final int f48071g = 64;

    /* renamed from: h, reason: collision with root package name */
    public static final int f48072h = 4096;

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f48073i = false;

    /* renamed from: j, reason: collision with root package name */
    public static final c f48074j;

    /* renamed from: k, reason: collision with root package name */
    public static final char[] f48075k;

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f48076l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ boolean f48077m = false;

    /* renamed from: a, reason: collision with root package name */
    public final int f48078a;

    /* renamed from: b, reason: collision with root package name */
    public final String f48079b;

    /* renamed from: c, reason: collision with root package name */
    public int f48080c;

    /* renamed from: d, reason: collision with root package name */
    public boolean[] f48081d;

    /* renamed from: e, reason: collision with root package name */
    public StringBuilder f48082e;

    /* renamed from: f, reason: collision with root package name */
    public int f48083f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48084a;

        static {
            int[] iArr = new int[EnumC0573b.values().length];
            f48084a = iArr;
            try {
                iArr[EnumC0573b.BEFORE_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48084a[EnumC0573b.BEFORE_ELEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f48084a[EnumC0573b.BEFORE_KEY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f48084a[EnumC0573b.AFTER_KEY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f48084a[EnumC0573b.START_MAP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f48084a[EnumC0573b.START_ARRAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f48084a[EnumC0573b.AFTER_ELEMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f48084a[EnumC0573b.AFTER_VALUE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: dp.b$b, reason: collision with other inner class name */
    public enum EnumC0573b {
        START_ARRAY,
        BEFORE_ELEMENT,
        AFTER_ELEMENT,
        START_MAP,
        BEFORE_KEY,
        AFTER_KEY,
        BEFORE_VALUE,
        AFTER_VALUE
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends Exception {
        private static final long serialVersionUID = 783239978717247850L;

        public c() {
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    static {
        c cVar = new c(null);
        f48074j = cVar;
        cVar.setStackTrace(new StackTraceElement[0]);
        f48075k = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', io.ktor.util.date.b.f62000f, 'e', 'f'};
        f48076l = new int[]{-1, -1, 63, 39, 31, 27, 24, 22, 21, 19, 18, 18, 17, 17, 16, 16, 15};
    }

    public b(String str) {
        this(str, 64);
    }

    public static int A(String str, int i11) {
        int length = str.length();
        int i12 = 0;
        if (i11 >= length) {
            return 0;
        }
        char charAt = str.charAt(i11);
        if (charAt != '\\') {
            return charAt | 0;
        }
        int i13 = i11 + 1;
        if (i13 == length) {
            return 65536;
        }
        char charAt2 = str.charAt(i13);
        if (charAt2 == 'b') {
            return 131080;
        }
        if (charAt2 == 'f') {
            return 131084;
        }
        if (charAt2 == 'n') {
            return 131082;
        }
        if (charAt2 == 'r') {
            return 131085;
        }
        if (charAt2 != 'x') {
            switch (charAt2) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    int i14 = i11 + 2;
                    if (i14 < length && p(str.charAt(i14))) {
                        i14 = i11 + 3;
                        if (charAt2 <= '3' && i14 < length && p(str.charAt(i14))) {
                            i14 = i11 + 4;
                        }
                    }
                    while (i13 < i14) {
                        i12 = (i12 << 3) | (str.charAt(i13) - '0');
                        i13++;
                    }
                    return ((i14 - i11) << 16) | i12;
                default:
                    switch (charAt2) {
                        case 't':
                            return 131081;
                        case 'u':
                            int i15 = i11 + 5;
                            if (i15 < length) {
                                char charAt3 = str.charAt(i11 + 2);
                                char charAt4 = str.charAt(i11 + 3);
                                char charAt5 = str.charAt(i11 + 4);
                                char charAt6 = str.charAt(i15);
                                if (l(charAt3) && l(charAt4) && l(charAt5) && l(charAt6)) {
                                    return i(charAt6) | (i(charAt5) << 4) | (i(charAt3) << 12) | 24576 | (i(charAt4) << 8);
                                }
                            }
                            break;
                        case 'v':
                            return 131080;
                    }
            }
        } else {
            int i16 = i11 + 3;
            if (i16 < length) {
                char charAt7 = str.charAt(i11 + 2);
                char charAt8 = str.charAt(i16);
                if (l(charAt7) && l(charAt8)) {
                    return i(charAt8) | (i(charAt7) << 4) | 16384;
                }
            }
        }
        return 0 | charAt2;
    }

    public static int B(String str, int i11) {
        int i12;
        if (i11 < 0) {
            return 0;
        }
        int i13 = 1;
        while (true) {
            if (i13 >= 6 || (i12 = i11 - i13) < 0) {
                break;
            }
            if (str.charAt(i12) == '\\') {
                int i14 = 1;
                while (true) {
                    int i15 = i12 - i14;
                    if (i15 < 0 || str.charAt(i15) != '\\') {
                        break;
                    }
                    i14++;
                }
                if ((1 & i14) == 0) {
                    int A = A(str, i12);
                    if ((A >>> 16) == i13) {
                        return A;
                    }
                }
            } else {
                i13++;
            }
        }
        return str.charAt(i11) | 0;
    }

    public static boolean c(StringBuilder sb2, int i11, int i12) {
        int i13;
        int parseInt;
        int i14;
        int i15;
        char c11;
        char charAt;
        char charAt2;
        int i16 = i11 + (sb2.charAt(i11) == '-' ? 1 : 0);
        int i17 = i16;
        while (i17 < i12 && '0' <= (charAt2 = sb2.charAt(i17)) && charAt2 <= '9') {
            i17++;
        }
        if (i17 != i12 && '.' == sb2.charAt(i17)) {
            do {
                i17++;
                if (i17 >= i12 || '0' > (charAt = sb2.charAt(i17))) {
                    break;
                }
            } while (charAt <= '9');
        }
        if (i17 == i12) {
            i13 = i12;
        } else {
            i13 = i17 + 1;
            if (sb2.charAt(i13) == '+') {
                i13 = i17 + 2;
            }
        }
        if (i12 == i13) {
            parseInt = 0;
        } else {
            try {
                parseInt = Integer.parseInt(sb2.substring(i13, i12), 10);
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        int i18 = i16;
        int i19 = i18;
        boolean z11 = false;
        int i21 = 0;
        boolean z12 = true;
        while (i18 < i17) {
            char charAt3 = sb2.charAt(i18);
            if (charAt3 == '.') {
                if (z12) {
                    i21 = 0;
                }
                z11 = true;
            } else {
                if ((!z12 || charAt3 != '0') && !z11) {
                    parseInt++;
                }
                if (charAt3 == '0') {
                    i21++;
                } else {
                    if (z12) {
                        if (z11) {
                            parseInt -= i21;
                        }
                        i14 = parseInt;
                        i15 = 0;
                    } else {
                        int i22 = i21;
                        i14 = parseInt;
                        i15 = i22;
                    }
                    while (true) {
                        if (i15 == 0 && charAt3 == 0) {
                            break;
                        }
                        if (i15 == 0) {
                            c11 = 0;
                        } else {
                            i15--;
                            c11 = charAt3;
                            charAt3 = '0';
                        }
                        sb2.setCharAt(i19, charAt3);
                        charAt3 = c11;
                        i19++;
                    }
                    int i23 = i14;
                    i21 = i15;
                    parseInt = i23;
                    z12 = false;
                }
            }
            i18++;
        }
        sb2.setLength(i19);
        int i24 = i19 - i16;
        if (z12) {
            sb2.setLength(i11);
            sb2.append('0');
            return true;
        }
        if (i24 <= parseInt && parseInt <= 21) {
            while (i24 < parseInt) {
                sb2.append('0');
                i24++;
            }
        } else if (parseInt > 0 && parseInt <= 21) {
            sb2.insert(i16 + parseInt, '.');
        } else if (-6 >= parseInt || parseInt > 0) {
            if (i24 != 1) {
                sb2.insert(i16 + 1, '.');
            }
            int i25 = parseInt - 1;
            sb2.append('e');
            sb2.append(i25 >= 0 ? '+' : '-');
            sb2.append(Math.abs(i25));
        } else {
            sb2.insert(i16, "0.000000".substring(0, 2 - parseInt));
        }
        return true;
    }

    public static int g(String str, int i11) {
        int i12;
        char charAt = str.charAt(i11);
        int i13 = i11;
        do {
            i13 = str.indexOf(charAt, i13 + 1);
            if (i13 < 0) {
                return str.length();
            }
            i12 = i13;
            while (i12 > i11 && str.charAt(i12 - 1) == '\\') {
                i12--;
            }
        } while (((i13 - i12) & 1) != 0);
        return i13 + 1;
    }

    public static int i(char c11) {
        int i11 = c11 | ' ';
        return i11 - (i11 <= 57 ? 48 : 87);
    }

    public static boolean l(char c11) {
        if ('0' <= c11 && c11 <= '9') {
            return true;
        }
        int i11 = c11 | ' ';
        return 97 <= i11 && i11 <= 102;
    }

    public static boolean p(char c11) {
        return '0' <= c11 && c11 <= '7';
    }

    public static String v(String str) {
        return w(str, 64);
    }

    public static String w(String str, int i11) {
        b bVar = new b(str, i11);
        bVar.x();
        return bVar.toString();
    }

    public final void a(int i11, int i12) {
        while (true) {
            i12--;
            if (i12 < 0) {
                return;
            }
            int i13 = (i11 >>> (i12 * 4)) & 15;
            this.f48082e.append((char) (i13 + (i13 < 10 ? 48 : 87)));
        }
    }

    public final boolean b(int i11, int i12) {
        d(i11, i11);
        int length = this.f48082e.length();
        r(i11, i12);
        d(i12, i12);
        return c(this.f48082e, length, this.f48082e.length());
    }

    public final void d(int i11, int i12) {
        if (this.f48082e == null) {
            this.f48082e = new StringBuilder(this.f48079b.length() + 16);
        }
        this.f48082e.append((CharSequence) this.f48079b, this.f48083f, i11);
        this.f48083f = i12;
    }

    public final void e(int i11) {
        while (true) {
            int i12 = i11 - 1;
            if (i12 >= this.f48083f) {
                char charAt = this.f48079b.charAt(i12);
                if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                    if (charAt == ',') {
                        d(i12, i11);
                        return;
                    }
                    throw new AssertionError("" + this.f48079b.charAt(i12));
                }
                i11 = i12;
            } else {
                int length = this.f48082e.length();
                while (true) {
                    length--;
                    if (length < 0) {
                        throw new AssertionError("Trailing comma not found in " + this.f48079b + " or " + ((Object) this.f48082e));
                    }
                    char charAt2 = this.f48082e.charAt(length);
                    if (charAt2 != '\t' && charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ') {
                        if (charAt2 == ',') {
                            this.f48082e.setLength(length);
                            return;
                        }
                        throw new AssertionError("" + this.f48082e.charAt(length));
                    }
                }
            }
        }
    }

    public final int f(int i11, int i12) {
        while (i11 < i12) {
            char charAt = this.f48079b.charAt(i11);
            if ('0' > charAt || charAt > '9') {
                return i11;
            }
            i11++;
        }
        return i12;
    }

    public int h() {
        return this.f48078a;
    }

    public final void j(int i11, char c11) {
        s(i11, i11, c11);
    }

    public final void k(int i11, String str) {
        t(i11, i11, str);
    }

    public final boolean m(int i11) {
        return l(this.f48079b.charAt(i11));
    }

    public final boolean n(int i11) {
        char charAt = this.f48079b.charAt(i11);
        return charAt <= ' ' || charAt == '\"' || charAt == ',' || charAt == ':' || charAt == '[' || charAt == ']' || charAt == '{' || charAt == '}';
    }

    public final boolean o(int i11, int i12) {
        int i13 = i12 - i11;
        if (i13 == 5) {
            return "false".regionMatches(0, this.f48079b, i11, i13);
        }
        if (i13 == 4) {
            return "null".regionMatches(0, this.f48079b, i11, i13) || m.f74525c.regionMatches(0, this.f48079b, i11, i13);
        }
        return false;
    }

    public final boolean q(int i11) {
        return p(this.f48079b.charAt(i11));
    }

    public final void r(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        char charAt;
        if (i11 < i12) {
            char charAt2 = this.f48079b.charAt(i11);
            if (charAt2 == '+') {
                int i17 = i11 + 1;
                d(i11, i17);
                i11 = i17;
            } else if (charAt2 == '-') {
                i11++;
            }
        }
        int f11 = f(i11, i12);
        if (i11 == f11) {
            j(i11, '0');
        } else if ('0' == this.f48079b.charAt(i11)) {
            int i18 = f11 - i11;
            int i19 = 16;
            int i21 = 0;
            boolean z11 = true;
            if (i18 == 1 && f11 < i12 && 120 == (this.f48079b.charAt(f11) | ' ')) {
                int i22 = f11 + 1;
                int i23 = i22;
                while (i23 < i12) {
                    char charAt3 = this.f48079b.charAt(i23);
                    if ('0' > charAt3 || charAt3 > '9') {
                        char c11 = (char) (charAt3 | ' ');
                        if ('a' > c11 || c11 > 'f') {
                            break;
                        } else {
                            i16 = c11 - 'W';
                        }
                    } else {
                        i16 = charAt3 - '0';
                    }
                    i21 = Math.max(i16, i21);
                    i23++;
                }
                int i24 = i23;
                i13 = i22;
                f11 = i24;
                i14 = i21;
                i15 = 16;
            } else if (i18 > 1) {
                for (int i25 = i11; i25 < f11; i25++) {
                    int charAt4 = this.f48079b.charAt(i25) - '0';
                    if (charAt4 < 0) {
                        break;
                    }
                    i21 = Math.max(charAt4, i21);
                }
                i14 = i21;
                i15 = 8;
                i13 = i11;
            } else {
                i13 = -1;
                z11 = false;
                i14 = 0;
                i15 = 10;
            }
            if (z11) {
                d(i11, f11);
                String substring = this.f48079b.substring(i13, f11);
                int length = substring.length();
                if (i15 > i14) {
                    i19 = i15;
                } else if (i14 <= 10) {
                    i19 = 10;
                }
                if (length == 0) {
                    this.f48082e.append('0');
                } else if (f48076l[i19] >= length) {
                    this.f48082e.append(Long.parseLong(substring, i19));
                } else {
                    this.f48082e.append(new BigInteger(substring, i19));
                }
            }
        }
        if (f11 < i12 && this.f48079b.charAt(f11) == '.') {
            int i26 = f11 + 1;
            int f12 = f(i26, i12);
            if (f12 == i26) {
                j(i26, '0');
            }
            f11 = f12;
        }
        if (f11 < i12 && 101 == (this.f48079b.charAt(f11) | ' ')) {
            int i27 = f11 + 1;
            if (i27 < i12 && ((charAt = this.f48079b.charAt(i27)) == '+' || charAt == '-')) {
                i27 = f11 + 2;
            }
            f11 = f(i27, i12);
            if (f11 == i27) {
                j(i27, '0');
            }
        }
        if (f11 != i12) {
            d(f11, i12);
        }
    }

    public final void s(int i11, int i12, char c11) {
        d(i11, i12);
        this.f48082e.append(c11);
    }

    public final void t(int i11, int i12, String str) {
        d(i11, i12);
        this.f48082e.append(str);
    }

    public String toString() {
        StringBuilder sb2 = this.f48082e;
        return sb2 != null ? sb2.toString() : this.f48079b;
    }

    public final EnumC0573b u(int i11, EnumC0573b enumC0573b, boolean z11) throws c {
        switch (a.f48084a[enumC0573b.ordinal()]) {
            case 1:
                return EnumC0573b.AFTER_VALUE;
            case 2:
            case 6:
                return EnumC0573b.AFTER_ELEMENT;
            case 3:
            case 5:
                if (z11) {
                    return EnumC0573b.AFTER_KEY;
                }
                k(i11, "\"\":");
                return EnumC0573b.AFTER_VALUE;
            case 4:
                j(i11, ':');
                return EnumC0573b.AFTER_VALUE;
            case 7:
                if (this.f48080c == 0) {
                    throw f48074j;
                }
                j(i11, ',');
                return EnumC0573b.AFTER_ELEMENT;
            case 8:
                if (z11) {
                    j(i11, ',');
                    return EnumC0573b.AFTER_KEY;
                }
                k(i11, ",\"\":");
                return EnumC0573b.AFTER_VALUE;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0050. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d9 A[Catch: c -> 0x022d, TryCatch #0 {c -> 0x022d, blocks: (B:5:0x001e, B:26:0x0050, B:30:0x0060, B:35:0x0088, B:53:0x0093, B:57:0x009a, B:62:0x00ae, B:68:0x00bd, B:70:0x00c4, B:74:0x00c9, B:76:0x00d3, B:78:0x00d5, B:80:0x00d9, B:82:0x00e0, B:83:0x00fb, B:84:0x00e7, B:86:0x00ed, B:88:0x00f3, B:101:0x0100, B:103:0x021a, B:104:0x01ea, B:106:0x010b, B:135:0x010f, B:108:0x011a, B:117:0x0139, B:121:0x014b, B:122:0x0150, B:124:0x0154, B:127:0x015d, B:129:0x0160, B:131:0x012e, B:132:0x0132, B:133:0x0136, B:178:0x0164, B:180:0x016c, B:183:0x0177, B:185:0x0183, B:188:0x0186, B:190:0x018b, B:192:0x0190, B:193:0x0193, B:195:0x019a, B:197:0x019f, B:201:0x01ac, B:203:0x01b0, B:211:0x01c7, B:214:0x01e3, B:220:0x01ca, B:222:0x01ce, B:223:0x01d0, B:225:0x01d9, B:230:0x01e7, B:231:0x01ed, B:233:0x01f2, B:234:0x01fa, B:237:0x01fe, B:239:0x0201, B:241:0x0204, B:243:0x020a, B:245:0x0210, B:248:0x0216, B:249:0x0218), top: B:4:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x() {
        /*
            Method dump skipped, instructions count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dp.b.x():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
    
        if (java.lang.Character.isLowSurrogate(r19.f48079b.charAt(r6)) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006a, code lost:
    
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0125, code lost:
    
        if (m(r6) != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(int r20, int r21) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dp.b.y(int, int):void");
    }

    public CharSequence z() {
        CharSequence charSequence = this.f48082e;
        if (charSequence == null) {
            charSequence = this.f48079b;
        }
        return charSequence;
    }

    public b(String str, int i11) {
        this.f48078a = Math.min(Math.max(1, i11), 4096);
        this.f48079b = str == null ? "null" : str;
    }
}
