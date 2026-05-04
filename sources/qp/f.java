package qp;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class f implements g {
    public static void c(char c11, StringBuilder sb2) {
        if (c11 >= ' ' && c11 <= '?') {
            sb2.append(c11);
        } else if (c11 < '@' || c11 > '^') {
            j.f(c11);
        } else {
            sb2.append((char) (c11 - '@'));
        }
    }

    private static String d(CharSequence charSequence, int i11) {
        int length = charSequence.length() - i11;
        if (length == 0) {
            throw new IllegalStateException("StringBuilder must not be empty");
        }
        int charAt = (charSequence.charAt(i11) << 18) + ((length >= 2 ? charSequence.charAt(i11 + 1) : (char) 0) << '\f') + ((length >= 3 ? charSequence.charAt(i11 + 2) : (char) 0) << 6) + (length >= 4 ? charSequence.charAt(i11 + 3) : (char) 0);
        char c11 = (char) ((charAt >> 16) & 255);
        char c12 = (char) ((charAt >> 8) & 255);
        char c13 = (char) (charAt & 255);
        StringBuilder sb2 = new StringBuilder(3);
        sb2.append(c11);
        if (length >= 2) {
            sb2.append(c12);
        }
        if (length >= 3) {
            sb2.append(c13);
        }
        return sb2.toString();
    }

    public static void e(h hVar, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                return;
            }
            boolean z11 = true;
            if (length == 1) {
                hVar.q();
                int b11 = hVar.h().b() - hVar.a();
                int g11 = hVar.g();
                if (g11 > b11) {
                    hVar.r(hVar.a() + 1);
                    b11 = hVar.h().b() - hVar.a();
                }
                if (g11 <= b11 && b11 <= 2) {
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException("Count must not exceed 4");
            }
            int i11 = length - 1;
            String d11 = d(charSequence, 0);
            if (hVar.j() || i11 > 2) {
                z11 = false;
            }
            if (i11 <= 2) {
                hVar.r(hVar.a() + i11);
                if (hVar.h().b() - hVar.a() >= 3) {
                    hVar.r(hVar.a() + d11.length());
                    z11 = false;
                }
            }
            if (z11) {
                hVar.l();
                hVar.f82595f -= i11;
            } else {
                hVar.t(d11);
            }
        } finally {
            hVar.p(0);
        }
    }

    @Override // qp.g
    public void a(h hVar) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!hVar.j()) {
                break;
            }
            c(hVar.d(), sb2);
            hVar.f82595f++;
            if (sb2.length() >= 4) {
                hVar.t(d(sb2, 0));
                sb2.delete(0, 4);
                if (j.o(hVar.e(), hVar.f82595f, b()) != b()) {
                    hVar.p(0);
                    break;
                }
            }
        }
        sb2.append(to.c.f90845b);
        e(hVar, sb2);
    }

    @Override // qp.g
    public int b() {
        return 4;
    }
}
