package k90;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public final int f66080a;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f66081b;

    /* renamed from: c, reason: collision with root package name */
    public char[] f66082c;

    /* renamed from: d, reason: collision with root package name */
    public int f66083d;

    /* renamed from: e, reason: collision with root package name */
    public final String f66084e;

    /* renamed from: f, reason: collision with root package name */
    public int f66085f;

    public d(int i11, String str, int i12) {
        this.f66080a = i12;
        this.f66082c = new char[i11];
        this.f66084e = str;
        if (str == null) {
            this.f66081b = null;
        } else {
            this.f66081b = str.toCharArray();
        }
    }

    @Override // k90.a
    public String A() {
        String str = this.f66084e;
        int i11 = this.f66083d;
        int i12 = this.f66085f;
        if (i11 > i12) {
            str = new String(this.f66082c, 0, i11 - i12);
        }
        this.f66083d = 0;
        this.f66085f = 0;
        return str;
    }

    @Override // k90.a
    public void B(char c11, char c12) {
        char[] cArr = this.f66082c;
        int i11 = this.f66083d;
        this.f66083d = i11 + 1;
        cArr[i11] = c11;
        if (c11 == c12 || (c11 <= ' ' && this.f66080a < c11)) {
            this.f66085f++;
        } else {
            this.f66085f = 0;
        }
    }

    @Override // k90.a
    public void C(char c11) {
        char[] cArr = this.f66082c;
        int i11 = this.f66083d;
        this.f66083d = i11 + 1;
        cArr[i11] = c11;
        if (c11 > ' ' || this.f66080a >= c11) {
            this.f66085f = 0;
        } else {
            this.f66085f++;
        }
    }

    @Override // k90.a
    public int a(char c11) {
        for (int i11 = (this.f66083d - this.f66085f) - 1; i11 >= 0; i11--) {
            if (this.f66082c[i11] == c11) {
                return i11;
            }
        }
        return -1;
    }

    @Override // k90.a
    public void append(char c11) {
        char[] cArr = this.f66082c;
        int i11 = this.f66083d;
        this.f66083d = i11 + 1;
        cArr[i11] = c11;
    }

    @Override // k90.a
    public void b(char[] cArr) {
        char[] cArr2 = this.f66082c;
        System.arraycopy(cArr2, 0, cArr2, cArr.length, this.f66083d);
        System.arraycopy(cArr, 0, this.f66082c, 0, cArr.length);
        this.f66083d += cArr.length;
    }

    @Override // k90.a
    public void c(char c11, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char[] cArr = this.f66082c;
            int i13 = this.f66083d;
            this.f66083d = i13 + 1;
            cArr[i13] = c11;
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i11) {
        return this.f66082c[i11];
    }

    @Override // k90.a
    public void d(char c11, char c12) {
        char[] cArr = this.f66082c;
        int i11 = this.f66083d;
        this.f66083d = i11 + 1;
        cArr[i11] = c11;
        if (c11 == c12) {
            this.f66085f++;
        } else {
            this.f66085f = 0;
        }
    }

    @Override // k90.a
    public void delete(int i11) {
        int i12 = this.f66083d - i11;
        this.f66083d = i12;
        if (i12 < 0) {
            this.f66083d = 0;
        }
        this.f66085f = 0;
    }

    @Override // k90.a
    public int e(char c11, int i11) {
        int i12 = this.f66083d - this.f66085f;
        while (i11 < i12) {
            if (this.f66082c[i11] == c11) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    @Override // k90.a
    public int f(char[] cArr, int i11) {
        if (cArr.length == 0) {
            return i11;
        }
        int i12 = this.f66083d;
        if (i11 >= i12) {
            return -1;
        }
        char c11 = cArr[0];
        int length = i12 - cArr.length;
        while (i11 <= length) {
            if (this.f66082c[i11] != c11) {
                do {
                    i11++;
                    if (i11 > length) {
                        break;
                    }
                } while (this.f66082c[i11] != c11);
            }
            if (i11 <= length) {
                int i13 = i11 + 1;
                int length2 = (cArr.length + i13) - 1;
                for (int i14 = 1; i13 < length2 && this.f66082c[i13] == cArr[i14]; i14++) {
                    i13++;
                }
                if (i13 == length2) {
                    return i11;
                }
            }
            i11++;
        }
        return -1;
    }

    @Override // k90.a
    public final void g(int i11) {
        if (i11 < 65536) {
            append((char) i11);
            return;
        }
        int i12 = i11 - 65536;
        append((char) ((i12 >>> 10) + 55296));
        append((char) ((i12 & 1023) + 56320));
    }

    public void h(d dVar) {
        System.arraycopy(dVar.f66082c, 0, this.f66082c, this.f66083d, dVar.f66083d - dVar.f66085f);
        this.f66083d += dVar.f66083d - dVar.f66085f;
        dVar.reset();
    }

    @Override // k90.a
    public final void i() {
        this.f66085f = 0;
    }

    @Override // k90.a
    public boolean isEmpty() {
        return this.f66083d > this.f66085f;
    }

    @Override // java.lang.CharSequence
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final String subSequence(int i11, int i12) {
        return new String(this.f66082c, i11, i12 - i11);
    }

    @Override // k90.a
    public final char[] k() {
        return this.f66082c;
    }

    @Override // k90.a
    public int l(char[] cArr, int i11) {
        int i12 = this.f66083d - this.f66085f;
        while (i11 < i12) {
            for (char c11 : cArr) {
                if (this.f66082c[i11] == c11) {
                    return i11;
                }
            }
            i11++;
        }
        return -1;
    }

    @Override // k90.a, java.lang.CharSequence
    public final int length() {
        return this.f66083d - this.f66085f;
    }

    @Override // k90.a
    public char m(char c11, b bVar, char c12) {
        while (c11 != c12) {
            char[] cArr = this.f66082c;
            int i11 = this.f66083d;
            this.f66083d = i11 + 1;
            cArr[i11] = c11;
            c11 = bVar.c();
        }
        return c11;
    }

    @Override // k90.a
    public final void o() {
        this.f66085f = 0;
        int i11 = this.f66083d - 1;
        while (i11 >= 0) {
            char c11 = this.f66082c[i11];
            if (c11 > ' ' || this.f66080a >= c11) {
                return;
            }
            i11--;
            this.f66085f++;
        }
    }

    @Override // k90.a
    public void p(String str, int i11, int i12) {
        str.getChars(i11, i12, this.f66082c, this.f66083d);
        this.f66083d += i12 - i11;
    }

    @Override // k90.a
    public void q(char c11) {
        char[] cArr = this.f66082c;
        System.arraycopy(cArr, 0, cArr, 1, this.f66083d);
        this.f66082c[0] = c11;
        this.f66083d++;
    }

    @Override // k90.a
    public char r(char c11, b bVar, char c12, char c13, char c14) {
        while (c11 != c12 && c11 != c13 && c11 != c14) {
            char[] cArr = this.f66082c;
            int i11 = this.f66083d;
            this.f66083d = i11 + 1;
            cArr[i11] = c11;
            c11 = bVar.c();
        }
        return c11;
    }

    @Override // k90.a
    public void remove(int i11, int i12) {
        if (i12 > 0) {
            int i13 = i11 + i12;
            int i14 = this.f66083d;
            int i15 = i14 - i12;
            if (i13 + i15 > i14) {
                i15 -= i11;
            }
            char[] cArr = this.f66082c;
            System.arraycopy(cArr, i13, cArr, i11, i15);
            this.f66083d -= i12;
        }
    }

    @Override // k90.a
    public void reset() {
        this.f66083d = 0;
        this.f66085f = 0;
    }

    @Override // k90.a
    public void s(char c11, char c12) {
        char[] cArr = this.f66082c;
        System.arraycopy(cArr, 0, cArr, 2, this.f66083d);
        char[] cArr2 = this.f66082c;
        cArr2[0] = c11;
        cArr2[1] = c12;
        this.f66083d += 2;
    }

    @Override // k90.a
    public String substring(int i11, int i12) {
        return new String(this.f66082c, i11, i12);
    }

    @Override // k90.a
    public char[] t() {
        char[] cArr = this.f66081b;
        int i11 = this.f66083d;
        int i12 = this.f66085f;
        if (i11 > i12) {
            int i13 = i11 - i12;
            cArr = new char[i13];
            System.arraycopy(this.f66082c, 0, cArr, 0, i13);
        }
        this.f66083d = 0;
        this.f66085f = 0;
        return cArr;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i11 = this.f66083d;
        int i12 = this.f66085f;
        return i11 <= i12 ? this.f66084e : new String(this.f66082c, 0, i11 - i12);
    }

    @Override // k90.a
    public char u(char c11, b bVar, char c12, char c13) {
        while (c11 != c12 && c11 != c13) {
            char[] cArr = this.f66082c;
            int i11 = this.f66083d;
            this.f66083d = i11 + 1;
            cArr[i11] = c11;
            c11 = bVar.c();
        }
        return c11;
    }

    @Override // k90.a
    public final void v(int i11) {
        this.f66085f += i11;
    }

    @Override // k90.a
    public final int w() {
        return this.f66085f;
    }

    @Override // k90.a
    public final void x(char[] cArr) {
        append(cArr, 0, cArr.length);
    }

    @Override // k90.a
    public final void y(int[] iArr) {
        for (int i11 : iArr) {
            g(i11);
        }
    }

    @Override // k90.a
    public int z(CharSequence charSequence, int i11) {
        if (charSequence.length() == 0) {
            return i11;
        }
        if (i11 >= this.f66083d) {
            return -1;
        }
        char charAt = charSequence.charAt(0);
        int length = this.f66083d - charSequence.length();
        while (i11 <= length) {
            if (this.f66082c[i11] != charAt) {
                do {
                    i11++;
                    if (i11 > length) {
                        break;
                    }
                } while (this.f66082c[i11] != charAt);
            }
            if (i11 <= length) {
                int i12 = i11 + 1;
                int length2 = (charSequence.length() + i12) - 1;
                for (int i13 = 1; i12 < length2 && this.f66082c[i12] == charSequence.charAt(i13); i13++) {
                    i12++;
                }
                if (i12 == length2) {
                    return i11;
                }
            }
            i11++;
        }
        return -1;
    }

    @Override // k90.a
    public final void append(Object obj) {
        append(String.valueOf(obj));
    }

    @Override // k90.a
    public void append(char[] cArr, int i11, int i12) {
        System.arraycopy(cArr, i11, this.f66082c, this.f66083d, i12);
        this.f66083d += i12;
    }

    @Override // k90.a
    public final void append(String str) {
        p(str, 0, str.length());
    }
}
