package xr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.security.auth.x500.X500Principal;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f98301a;

    /* renamed from: b, reason: collision with root package name */
    public final int f98302b;

    /* renamed from: c, reason: collision with root package name */
    public int f98303c;

    /* renamed from: d, reason: collision with root package name */
    public int f98304d;

    /* renamed from: e, reason: collision with root package name */
    public int f98305e;

    /* renamed from: f, reason: collision with root package name */
    public int f98306f;

    /* renamed from: g, reason: collision with root package name */
    public char[] f98307g;

    public c(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f98301a = name;
        this.f98302b = name.length();
    }

    public final int a(int i11) {
        int i12;
        int i13;
        int i14 = i11 + 1;
        if (i14 >= this.f98302b) {
            throw new IllegalStateException("Malformed DN: " + this.f98301a);
        }
        char[] cArr = this.f98307g;
        char c11 = cArr[i11];
        if (c11 >= '0' && c11 <= '9') {
            i12 = c11 - '0';
        } else if (c11 >= 'a' && c11 <= 'f') {
            i12 = c11 - 'W';
        } else {
            if (c11 < 'A' || c11 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f98301a);
            }
            i12 = c11 - '7';
        }
        char c12 = cArr[i14];
        if (c12 >= '0' && c12 <= '9') {
            i13 = c12 - '0';
        } else if (c12 >= 'a' && c12 <= 'f') {
            i13 = c12 - 'W';
        } else {
            if (c12 < 'A' || c12 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f98301a);
            }
            i13 = c12 - '7';
        }
        return (i12 << 4) + i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
    
        return new java.lang.String(r1, r2, r8.f98306f - r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b() {
        /*
            r8 = this;
            int r0 = r8.f98303c
            r8.f98304d = r0
            r8.f98305e = r0
        L6:
            int r0 = r8.f98303c
            int r1 = r8.f98302b
            if (r0 < r1) goto L19
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f98307g
            int r2 = r8.f98304d
            int r3 = r8.f98305e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L19:
            char[] r1 = r8.f98307g
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L5c
            if (r2 == r5) goto L51
            r5 = 92
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L51
            if (r2 == r3) goto L51
            int r3 = r8.f98305e
            int r4 = r3 + 1
            r8.f98305e = r4
            r1[r3] = r2
            int r0 = r0 + 1
            r8.f98303c = r0
            goto L6
        L3e:
            int r0 = r8.f98305e
            int r2 = r0 + 1
            r8.f98305e = r2
            char r2 = r8.d()
            r1[r0] = r2
            int r0 = r8.f98303c
            int r0 = r0 + 1
            r8.f98303c = r0
            goto L6
        L51:
            java.lang.String r0 = new java.lang.String
            int r2 = r8.f98304d
            int r3 = r8.f98305e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L5c:
            int r2 = r8.f98305e
            r8.f98306f = r2
            int r0 = r0 + 1
            r8.f98303c = r0
            int r0 = r2 + 1
            r8.f98305e = r0
            r1[r2] = r6
        L6a:
            int r0 = r8.f98303c
            int r1 = r8.f98302b
            if (r0 >= r1) goto L83
            char[] r2 = r8.f98307g
            char r7 = r2[r0]
            if (r7 != r6) goto L83
            int r1 = r8.f98305e
            int r7 = r1 + 1
            r8.f98305e = r7
            r2[r1] = r6
            int r0 = r0 + 1
            r8.f98303c = r0
            goto L6a
        L83:
            if (r0 == r1) goto L8f
            char[] r1 = r8.f98307g
            char r0 = r1[r0]
            if (r0 == r3) goto L8f
            if (r0 == r4) goto L8f
            if (r0 != r5) goto L6
        L8f:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f98307g
            int r2 = r8.f98304d
            int r3 = r8.f98306f
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xr.c.b():java.lang.String");
    }

    public String c(String str) {
        this.f98303c = 0;
        this.f98304d = 0;
        this.f98305e = 0;
        this.f98306f = 0;
        this.f98307g = this.f98301a.toCharArray();
        String h11 = h();
        if (h11 == null) {
            return null;
        }
        do {
            int i11 = this.f98303c;
            if (i11 == this.f98302b) {
                return null;
            }
            char c11 = this.f98307g[i11];
            String b11 = c11 != '\"' ? c11 != '#' ? (c11 == '+' || c11 == ',' || c11 == ';') ? "" : b() : g() : i();
            if (str.equalsIgnoreCase(h11)) {
                return b11;
            }
            int i12 = this.f98303c;
            if (i12 >= this.f98302b) {
                return null;
            }
            char c12 = this.f98307g[i12];
            if (c12 != ',' && c12 != ';' && c12 != '+') {
                throw new IllegalStateException("Malformed DN: " + this.f98301a);
            }
            this.f98303c = i12 + 1;
            h11 = h();
        } while (h11 != null);
        throw new IllegalStateException("Malformed DN: " + this.f98301a);
    }

    public final char d() {
        int i11 = this.f98303c + 1;
        this.f98303c = i11;
        if (i11 == this.f98302b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f98301a);
        }
        char c11 = this.f98307g[i11];
        if (c11 == ' ' || c11 == '%' || c11 == '\\' || c11 == '_' || c11 == '\"' || c11 == '#') {
            return c11;
        }
        switch (c11) {
            case '*':
            case '+':
            case ',':
                return c11;
            default:
                switch (c11) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        return c11;
                    default:
                        return f();
                }
        }
    }

    public List<String> e(String str) {
        this.f98303c = 0;
        this.f98304d = 0;
        this.f98305e = 0;
        this.f98306f = 0;
        this.f98307g = this.f98301a.toCharArray();
        List<String> list = Collections.EMPTY_LIST;
        String h11 = h();
        if (h11 == null) {
            return list;
        }
        do {
            int i11 = this.f98303c;
            if (i11 >= this.f98302b) {
                return list;
            }
            char c11 = this.f98307g[i11];
            String b11 = c11 != '\"' ? c11 != '#' ? (c11 == '+' || c11 == ',' || c11 == ';') ? "" : b() : g() : i();
            if (str.equalsIgnoreCase(h11)) {
                if (list.isEmpty()) {
                    list = new ArrayList<>();
                }
                list.add(b11);
            }
            int i12 = this.f98303c;
            if (i12 >= this.f98302b) {
                return list;
            }
            char c12 = this.f98307g[i12];
            if (c12 != ',' && c12 != ';' && c12 != '+') {
                throw new IllegalStateException("Malformed DN: " + this.f98301a);
            }
            this.f98303c = i12 + 1;
            h11 = h();
        } while (h11 != null);
        throw new IllegalStateException("Malformed DN: " + this.f98301a);
    }

    public final char f() {
        int i11;
        int i12;
        int a11 = a(this.f98303c);
        this.f98303c++;
        if (a11 < 128) {
            return (char) a11;
        }
        if (a11 < 192 || a11 > 247) {
            return s60.d.f88057a;
        }
        if (a11 <= 223) {
            i11 = a11 & 31;
            i12 = 1;
        } else if (a11 <= 239) {
            i11 = a11 & 15;
            i12 = 2;
        } else {
            i11 = a11 & 7;
            i12 = 3;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = this.f98303c;
            int i15 = i14 + 1;
            this.f98303c = i15;
            if (i15 == this.f98302b || this.f98307g[i15] != '\\') {
                return s60.d.f88057a;
            }
            int i16 = i14 + 2;
            this.f98303c = i16;
            int a12 = a(i16);
            this.f98303c++;
            if ((a12 & 192) != 128) {
                return s60.d.f88057a;
            }
            i11 = (i11 << 6) + (a12 & 63);
        }
        return (char) i11;
    }

    public final String g() {
        int i11;
        char[] cArr;
        char c11;
        int i12 = this.f98303c;
        if (i12 + 4 >= this.f98302b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f98301a);
        }
        this.f98304d = i12;
        this.f98303c = i12 + 1;
        while (true) {
            i11 = this.f98303c;
            if (i11 == this.f98302b || (c11 = (cArr = this.f98307g)[i11]) == '+' || c11 == ',' || c11 == ';') {
                break;
            }
            if (c11 == ' ') {
                this.f98305e = i11;
                this.f98303c = i11 + 1;
                while (true) {
                    int i13 = this.f98303c;
                    if (i13 >= this.f98302b || this.f98307g[i13] != ' ') {
                        break;
                    }
                    this.f98303c = i13 + 1;
                }
            } else {
                if (c11 >= 'A' && c11 <= 'F') {
                    cArr[i11] = (char) (c11 + ' ');
                }
                this.f98303c = i11 + 1;
            }
        }
        this.f98305e = i11;
        int i14 = this.f98305e;
        int i15 = this.f98304d;
        int i16 = i14 - i15;
        if (i16 < 5 || (i16 & 1) == 0) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f98301a);
        }
        int i17 = i16 / 2;
        byte[] bArr = new byte[i17];
        int i18 = i15 + 1;
        for (int i19 = 0; i19 < i17; i19++) {
            bArr[i19] = (byte) a(i18);
            i18 += 2;
        }
        return new String(this.f98307g, this.f98304d, i16);
    }

    public final String h() {
        int i11;
        int i12;
        int i13;
        int i14;
        char c11;
        char c12;
        char c13;
        int i15;
        int i16;
        char c14;
        char c15;
        while (true) {
            i11 = this.f98303c;
            i12 = this.f98302b;
            if (i11 >= i12 || this.f98307g[i11] != ' ') {
                break;
            }
            this.f98303c = i11 + 1;
        }
        if (i11 == i12) {
            return null;
        }
        this.f98304d = i11;
        this.f98303c = i11 + 1;
        while (true) {
            i13 = this.f98303c;
            i14 = this.f98302b;
            if (i13 >= i14 || (c15 = this.f98307g[i13]) == '=' || c15 == ' ') {
                break;
            }
            this.f98303c = i13 + 1;
        }
        if (i13 >= i14) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f98301a);
        }
        this.f98305e = i13;
        if (this.f98307g[i13] == ' ') {
            while (true) {
                i15 = this.f98303c;
                i16 = this.f98302b;
                if (i15 >= i16 || (c14 = this.f98307g[i15]) == '=' || c14 != ' ') {
                    break;
                }
                this.f98303c = i15 + 1;
            }
            if (this.f98307g[i15] != '=' || i15 == i16) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f98301a);
            }
        }
        this.f98303c++;
        while (true) {
            int i17 = this.f98303c;
            if (i17 >= this.f98302b || this.f98307g[i17] != ' ') {
                break;
            }
            this.f98303c = i17 + 1;
        }
        int i18 = this.f98305e;
        int i19 = this.f98304d;
        if (i18 - i19 > 4) {
            char[] cArr = this.f98307g;
            if (cArr[i19 + 3] == '.' && (((c11 = cArr[i19]) == 'O' || c11 == 'o') && (((c12 = cArr[i19 + 1]) == 'I' || c12 == 'i') && ((c13 = cArr[i19 + 2]) == 'D' || c13 == 'd')))) {
                this.f98304d = i19 + 4;
            }
        }
        char[] cArr2 = this.f98307g;
        int i21 = this.f98304d;
        return new String(cArr2, i21, i18 - i21);
    }

    public final String i() {
        int i11 = this.f98303c + 1;
        this.f98303c = i11;
        this.f98304d = i11;
        this.f98305e = i11;
        while (true) {
            int i12 = this.f98303c;
            if (i12 == this.f98302b) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f98301a);
            }
            char[] cArr = this.f98307g;
            char c11 = cArr[i12];
            if (c11 == '\"') {
                this.f98303c = i12 + 1;
                while (true) {
                    int i13 = this.f98303c;
                    if (i13 >= this.f98302b || this.f98307g[i13] != ' ') {
                        break;
                    }
                    this.f98303c = i13 + 1;
                }
                char[] cArr2 = this.f98307g;
                int i14 = this.f98304d;
                return new String(cArr2, i14, this.f98305e - i14);
            }
            if (c11 == '\\') {
                cArr[this.f98305e] = d();
            } else {
                cArr[this.f98305e] = c11;
            }
            this.f98303c++;
            this.f98305e++;
        }
    }
}
