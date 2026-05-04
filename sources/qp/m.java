package qp;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class m extends c {
    @Override // qp.c, qp.g
    public void a(h hVar) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!hVar.j()) {
                break;
            }
            char d11 = hVar.d();
            hVar.f82595f++;
            d(d11, sb2);
            if (sb2.length() % 3 == 0) {
                c.g(hVar, sb2);
                if (j.o(hVar.e(), hVar.f82595f, b()) != b()) {
                    hVar.p(0);
                    break;
                }
            }
        }
        f(hVar, sb2);
    }

    @Override // qp.c, qp.g
    public int b() {
        return 3;
    }

    @Override // qp.c
    public int d(char c11, StringBuilder sb2) {
        if (c11 == '\r') {
            sb2.append((char) 0);
        } else if (c11 == ' ') {
            sb2.append((char) 3);
        } else if (c11 == '*') {
            sb2.append((char) 1);
        } else if (c11 == '>') {
            sb2.append((char) 2);
        } else if (c11 >= '0' && c11 <= '9') {
            sb2.append((char) (c11 - ','));
        } else if (c11 < 'A' || c11 > 'Z') {
            j.f(c11);
        } else {
            sb2.append((char) (c11 - '3'));
        }
        return 1;
    }

    @Override // qp.c
    public void f(h hVar, StringBuilder sb2) {
        hVar.q();
        int b11 = hVar.h().b() - hVar.a();
        hVar.f82595f -= sb2.length();
        if (hVar.g() > 1 || b11 > 1 || hVar.g() != b11) {
            hVar.s((char) 254);
        }
        if (hVar.f() < 0) {
            hVar.p(0);
        }
    }
}
