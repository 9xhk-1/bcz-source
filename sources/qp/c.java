package qp;

import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c implements g {
    public static String e(CharSequence charSequence, int i11) {
        int charAt = (charSequence.charAt(i11) * 1600) + (charSequence.charAt(i11 + 1) * '(') + charSequence.charAt(i11 + 2) + 1;
        return new String(new char[]{(char) (charAt / 256), (char) (charAt % 256)});
    }

    public static void g(h hVar, StringBuilder sb2) {
        hVar.t(e(sb2, 0));
        sb2.delete(0, 3);
    }

    @Override // qp.g
    public void a(h hVar) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!hVar.j()) {
                break;
            }
            char d11 = hVar.d();
            hVar.f82595f++;
            int d12 = d(d11, sb2);
            int a11 = hVar.a() + ((sb2.length() / 3) << 1);
            hVar.r(a11);
            int b11 = hVar.h().b() - a11;
            if (!hVar.j()) {
                StringBuilder sb3 = new StringBuilder();
                if (sb2.length() % 3 == 2 && (b11 < 2 || b11 > 2)) {
                    d12 = c(hVar, sb2, sb3, d12);
                }
                while (sb2.length() % 3 == 1 && ((d12 <= 3 && b11 != 1) || d12 > 3)) {
                    d12 = c(hVar, sb2, sb3, d12);
                }
            } else if (sb2.length() % 3 == 0 && j.o(hVar.e(), hVar.f82595f, b()) != b()) {
                hVar.p(0);
                break;
            }
        }
        f(hVar, sb2);
    }

    @Override // qp.g
    public int b() {
        return 1;
    }

    public final int c(h hVar, StringBuilder sb2, StringBuilder sb3, int i11) {
        int length = sb2.length();
        sb2.delete(length - i11, length);
        hVar.f82595f--;
        int d11 = d(hVar.d(), sb3);
        hVar.l();
        return d11;
    }

    public int d(char c11, StringBuilder sb2) {
        if (c11 == ' ') {
            sb2.append((char) 3);
            return 1;
        }
        if (c11 >= '0' && c11 <= '9') {
            sb2.append((char) (c11 - ','));
            return 1;
        }
        if (c11 >= 'A' && c11 <= 'Z') {
            sb2.append((char) (c11 - '3'));
            return 1;
        }
        if (c11 < ' ') {
            sb2.append((char) 0);
            sb2.append(c11);
            return 2;
        }
        if (c11 >= '!' && c11 <= '/') {
            sb2.append((char) 1);
            sb2.append((char) (c11 - PublicSuffixDatabase.f77441i));
            return 2;
        }
        if (c11 >= ':' && c11 <= '@') {
            sb2.append((char) 1);
            sb2.append((char) (c11 - '+'));
            return 2;
        }
        if (c11 >= '[' && c11 <= '_') {
            sb2.append((char) 1);
            sb2.append((char) (c11 - 'E'));
            return 2;
        }
        if (c11 < '`' || c11 > 127) {
            sb2.append("\u0001\u001e");
            return d((char) (c11 - 128), sb2) + 2;
        }
        sb2.append((char) 2);
        sb2.append((char) (c11 - '`'));
        return 2;
    }

    public void f(h hVar, StringBuilder sb2) {
        int length = (sb2.length() / 3) << 1;
        int length2 = sb2.length() % 3;
        int a11 = hVar.a() + length;
        hVar.r(a11);
        int b11 = hVar.h().b() - a11;
        if (length2 == 2) {
            sb2.append((char) 0);
            while (sb2.length() >= 3) {
                g(hVar, sb2);
            }
            if (hVar.j()) {
                hVar.s((char) 254);
            }
        } else if (b11 == 1 && length2 == 1) {
            while (sb2.length() >= 3) {
                g(hVar, sb2);
            }
            if (hVar.j()) {
                hVar.s((char) 254);
            }
            hVar.f82595f--;
        } else {
            if (length2 != 0) {
                throw new IllegalStateException("Unexpected case. Please report!");
            }
            while (sb2.length() >= 3) {
                g(hVar, sb2);
            }
            if (b11 > 0 || hVar.j()) {
                hVar.s((char) 254);
            }
        }
        hVar.p(0);
    }
}
