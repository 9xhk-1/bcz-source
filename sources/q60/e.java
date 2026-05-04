package q60;

import java.util.Locale;
import org.apache.commons.codec.EncoderException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e implements n60.g {

    /* renamed from: a, reason: collision with root package name */
    public static final char[][] f81797a = {new char[]{196, 'A'}, new char[]{220, 'U'}, new char[]{214, 'O'}, new char[]{223, 'S'}};

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends a {
        public b(char[] cArr) {
            super(cArr);
        }

        @Override // q60.e.a
        public char[] a(int i11, int i12) {
            char[] cArr = new char[i12];
            char[] cArr2 = this.f81798a;
            System.arraycopy(cArr2, (cArr2.length - this.f81799b) + i11, cArr, 0, i12);
            return cArr;
        }

        public void c(char c11) {
            this.f81799b++;
            this.f81798a[e()] = c11;
        }

        public char d() {
            return this.f81798a[e()];
        }

        public int e() {
            return this.f81798a.length - this.f81799b;
        }

        public char f() {
            this.f81799b--;
            return d();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends a {
        public c(int i11) {
            super(i11);
        }

        @Override // q60.e.a
        public char[] a(int i11, int i12) {
            char[] cArr = new char[i12];
            System.arraycopy(this.f81798a, i11, cArr, 0, i12);
            return cArr;
        }

        public void c(char c11) {
            char[] cArr = this.f81798a;
            int i11 = this.f81799b;
            cArr[i11] = c11;
            this.f81799b = i11 + 1;
        }
    }

    public static boolean b(char[] cArr, char c11) {
        for (char c12 : cArr) {
            if (c12 == c11) {
                return true;
            }
        }
        return false;
    }

    @Override // n60.g
    public String a(String str) {
        return c(str);
    }

    public String c(String str) {
        char c11;
        if (str == null) {
            return null;
        }
        String e11 = e(str);
        c cVar = new c(e11.length() * 2);
        b bVar = new b(e11.toCharArray());
        int b11 = bVar.b();
        char c12 = '/';
        char c13 = '-';
        while (b11 > 0) {
            char f11 = bVar.f();
            int b12 = bVar.b();
            char d11 = b12 > 0 ? bVar.d() : '-';
            if (b(new char[]{'A', 'E', 'I', 'J', 'O', 'U', io.ktor.util.date.b.f62002h}, f11)) {
                c11 = '0';
            } else if (f11 == 'H' || f11 < 'A' || f11 > 'Z') {
                if (c12 == '/') {
                    b11 = b12;
                } else {
                    c11 = '-';
                }
            } else if (f11 == 'B' || (f11 == 'P' && d11 != 'H')) {
                c11 = '1';
            } else if ((f11 == 'D' || f11 == 'T') && !b(new char[]{'S', 'C', 'Z'}, d11)) {
                c11 = '2';
            } else if (b(new char[]{'W', 'F', 'P', 'V'}, f11)) {
                c11 = '3';
            } else {
                if (!b(new char[]{'G', 'K', 'Q'}, f11)) {
                    if (f11 != 'X' || b(new char[]{'C', 'K', 'Q'}, c13)) {
                        if (f11 != 'S' && f11 != 'Z') {
                            if (f11 == 'C') {
                                if (c12 != '/') {
                                }
                            } else if (!b(new char[]{'T', 'D', 'X'}, f11)) {
                                c11 = f11 == 'R' ? '7' : f11 == 'L' ? '5' : (f11 == 'M' || f11 == 'N') ? '6' : f11;
                            }
                        }
                        c11 = '8';
                    } else {
                        bVar.c('S');
                        b12++;
                    }
                }
                c11 = '4';
            }
            if (c11 != '-' && ((c12 != c11 && (c11 != '0' || c12 == '/')) || c11 < '0' || c11 > '8')) {
                cVar.c(c11);
            }
            c12 = c11;
            c13 = f11;
            b11 = b12;
        }
        return cVar.toString();
    }

    public boolean d(String str, String str2) {
        return c(str).equals(c(str2));
    }

    public final String e(String str) {
        char[] charArray = str.toUpperCase(Locale.GERMAN).toCharArray();
        for (int i11 = 0; i11 < charArray.length; i11++) {
            if (charArray[i11] > 'Z') {
                char[][] cArr = f81797a;
                int length = cArr.length;
                int i12 = 0;
                while (true) {
                    if (i12 < length) {
                        char[] cArr2 = cArr[i12];
                        if (charArray[i11] == cArr2[0]) {
                            charArray[i11] = cArr2[1];
                            break;
                        }
                        i12++;
                    }
                }
            }
        }
        return new String(charArray);
    }

    @Override // n60.e
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return a((String) obj);
        }
        throw new EncoderException("This method's parameter was expected to be of the type " + String.class.getName() + ". But actually it was of the type " + obj.getClass().getName() + ".");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final char[] f81798a;

        /* renamed from: b, reason: collision with root package name */
        public int f81799b;

        public a(char[] cArr) {
            this.f81799b = 0;
            this.f81798a = cArr;
            this.f81799b = cArr.length;
        }

        public abstract char[] a(int i11, int i12);

        public int b() {
            return this.f81799b;
        }

        public String toString() {
            return new String(a(0, this.f81799b));
        }

        public a(int i11) {
            this.f81799b = 0;
            this.f81798a = new char[i11];
            this.f81799b = 0;
        }
    }
}
